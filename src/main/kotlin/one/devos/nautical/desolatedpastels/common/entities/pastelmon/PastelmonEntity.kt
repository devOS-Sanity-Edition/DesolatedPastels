package one.devos.nautical.desolatedpastels.common.entities.pastelmon

import io.netty.buffer.ByteBuf
import net.minecraft.nbt.CompoundTag
import net.minecraft.network.codec.ByteBufCodecs
import net.minecraft.network.codec.StreamCodec
import net.minecraft.network.syncher.EntityDataAccessor
import net.minecraft.network.syncher.EntityDataSerializer
import net.minecraft.network.syncher.EntityDataSerializers
import net.minecraft.network.syncher.SynchedEntityData
import net.minecraft.resources.ResourceLocation
import net.minecraft.sounds.SoundEvent
import net.minecraft.sounds.SoundEvents
import net.minecraft.util.ByIdMap
import net.minecraft.util.StringRepresentable
import net.minecraft.util.TimeUtil
import net.minecraft.world.damagesource.DamageSource
import net.minecraft.world.entity.EntitySelector
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.Mob
import net.minecraft.world.entity.ai.attributes.AttributeSupplier
import net.minecraft.world.entity.ai.attributes.Attributes
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal
import net.minecraft.world.entity.animal.AbstractFish
import net.minecraft.world.entity.player.Player
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level
import net.minecraft.world.phys.AABB
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsItems
import one.devos.nautical.desolatedpastels.common.entities.pastelmon.goals.PastelmonAttackGoal
import one.devos.nautical.desolatedpastels.common.entities.pastelmon.goals.PastelmonNightTargetGoal
import kotlin.random.Random

class PastelmonEntity(entityType: EntityType<out AbstractFish>, level: Level) : AbstractFish(entityType, level) {
    var ticksUntilNextAlert: Int = 0

    enum class Type(val texture: ResourceLocation) : StringRepresentable {
        BLUE(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "textures/entity/pastelmon/blue.png")) {
            override fun getSerializedName(): String {
                return this.name.lowercase()
            }
        },
        RED(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "textures/entity/pastelmon/red.png")) {
            override fun getSerializedName(): String {
                return this.name.lowercase()
            }
        },
        GREEN(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "textures/entity/pastelmon/green.png")) {
            override fun getSerializedName(): String {
                return this.name.lowercase()
            }
        },
        PURPLE(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "textures/entity/pastelmon/purple.png")) {
            override fun getSerializedName(): String {
                return this.name.lowercase()
            }
        };

        companion object {
            fun getByName(name: String): Type {
                return try {
                    Type.valueOf(name.uppercase())
                } catch (_: Throwable) {
                    Type.entries.first()
                }
            }

            val STREAM_CODEC: StreamCodec<ByteBuf, Type> = ByteBufCodecs.idMapper(
                ByIdMap.continuous(
                    Type::ordinal,
                    Type.values(),
                    ByIdMap.OutOfBoundsStrategy.WRAP
                ), Type::ordinal
            )
        }
    }

    override fun registerGoals() {
        super.registerGoals()
        goalSelector.addGoal(1, PastelmonAttackGoal(this, 1.25, true))
        targetSelector.addGoal(1, HurtByTargetGoal(this))
        targetSelector.addGoal(2, PastelmonNightTargetGoal(this, Player::class.java))
    }

    override fun defineSynchedData(builder: SynchedEntityData.Builder) {
        super.defineSynchedData(builder)
        builder.define(ATTACKING, false)

        builder.define(DATA_PASTELMON_TYPE, Type.entries[Random.nextInt(Type.entries.size)])
    }

    var variant: PastelmonEntity.Type
        get() = entityData.get(DATA_PASTELMON_TYPE)
        set(variant) {
            entityData.set(DATA_PASTELMON_TYPE, variant)
        }

    fun setAttacking(attacking: Boolean) {
        this.entityData.set(ATTACKING, attacking)
    }

    override fun isAggressive(): Boolean {
        return this.entityData.get(ATTACKING)
    }

    override fun addAdditionalSaveData(tag: CompoundTag) {
        super.addAdditionalSaveData(tag)
        tag.putString("Variant", this.variant.name)
    }

    override fun readAdditionalSaveData(tag: CompoundTag) {
        super.readAdditionalSaveData(tag)
        this.variant = Type.getByName(tag.getString("Variant"))
    }

    override fun getBucketItemStack(): ItemStack {
        return ItemStack(DesolatedPastelsItems.PASTELMON_BUCKET)
    }

    override fun getAmbientSound(): SoundEvent {
        return SoundEvents.SALMON_AMBIENT
    }

    override fun getDeathSound(): SoundEvent {
        return SoundEvents.SALMON_DEATH
    }

    override fun getHurtSound(damageSource: DamageSource): SoundEvent {
        return SoundEvents.SALMON_HURT
    }

    override fun getFlopSound(): SoundEvent {
        return SoundEvents.SALMON_FLOP
    }

    override fun customServerAiStep() {
        if (this.target != null) {
            this.maybeAlertOthers()
        }
        super.customServerAiStep()
    }

    fun maybeAlertOthers() {
        if (this.ticksUntilNextAlert > 0) {
            --ticksUntilNextAlert
        } else {
            if (this.target !== null && this.sensing.hasLineOfSight(this.target!!)) {
                this.alertOthers()
            }

            this.ticksUntilNextAlert = ALERT_INTERVAL.sample(this.random)
        }
    }

    fun alertOthers() {
        val range = this.getAttributeValue(Attributes.FOLLOW_RANGE)
        val box = AABB.unitCubeFromLowerCorner(this.position()).inflate(range, 10.0, range)
        this.level().getEntitiesOfClass(PastelmonEntity::class.java, box, EntitySelector.NO_SPECTATORS)
            .filter { it != this && it.target == null && !it.isAlliedTo(this.target!!) }
            .forEach {
                it.target = this.target
            }
    }

    companion object {
        private val ATTACKING: EntityDataAccessor<Boolean> =
            SynchedEntityData.defineId(PastelmonEntity::class.java, EntityDataSerializers.BOOLEAN)
        private val ALERT_INTERVAL = TimeUtil.rangeOfSeconds(4, 6)
        private val PASTELMON_TYPE_SERIALIZER = EntityDataSerializer.forValueType(PastelmonEntity.Type.STREAM_CODEC)
        private val DATA_PASTELMON_TYPE =
            SynchedEntityData.defineId(PastelmonEntity::class.java, PASTELMON_TYPE_SERIALIZER)

        fun createAttributes(): AttributeSupplier.Builder {
            return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 3.0)
                .add(Attributes.ATTACK_SPEED, 1.0)
                .add(Attributes.ATTACK_DAMAGE, 1.0)
        }

        init {
            EntityDataSerializers.registerSerializer(PASTELMON_TYPE_SERIALIZER)
        }
    }
}