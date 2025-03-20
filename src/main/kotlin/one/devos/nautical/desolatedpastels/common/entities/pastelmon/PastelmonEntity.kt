package one.devos.nautical.desolatedpastels.common.entities.pastelmon

import io.netty.buffer.ByteBuf
import net.minecraft.nbt.CompoundTag
import net.minecraft.network.codec.ByteBufCodecs
import net.minecraft.network.codec.StreamCodec
import net.minecraft.network.syncher.EntityDataSerializer
import net.minecraft.network.syncher.EntityDataSerializers
import net.minecraft.network.syncher.SynchedEntityData
import net.minecraft.resources.ResourceLocation
import net.minecraft.sounds.SoundEvent
import net.minecraft.sounds.SoundEvents
import net.minecraft.util.ByIdMap
import net.minecraft.util.StringRepresentable
import net.minecraft.world.damagesource.DamageSource
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.Mob
import net.minecraft.world.entity.ai.attributes.AttributeSupplier
import net.minecraft.world.entity.ai.attributes.Attributes
import net.minecraft.world.entity.animal.AbstractFish
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level
import one.devos.nautical.desolatedpastels.client.entities.pastelmon.PastelmonModel
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsItems
import kotlin.random.Random

class PastelmonEntity(entityType: EntityType<out AbstractFish>, level: Level) : AbstractFish(entityType, level) {
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

    override fun defineSynchedData(builder: SynchedEntityData.Builder) {
        super.defineSynchedData(builder)

        builder.define(DATA_PASTELMON_TYPE, PastelmonEntity.Type.entries[Random.nextInt(PastelmonEntity.Type.entries.size)])
    }

    var variant: PastelmonEntity.Type
        get() = entityData.get(DATA_PASTELMON_TYPE)
        set(variant) {
            entityData.set(DATA_PASTELMON_TYPE, variant)
        }

    override fun addAdditionalSaveData(tag: CompoundTag) {
        super.addAdditionalSaveData(tag)
        tag.putString("Variant", this.variant.name)
    }

    override fun readAdditionalSaveData(tag: CompoundTag) {
        super.readAdditionalSaveData(tag)
        this.variant = PastelmonEntity.Type.getByName(tag.getString("Variant"))
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

    companion object {
        private val PASTELMON_TYPE_SERIALIZER = EntityDataSerializer.forValueType(PastelmonEntity.Type.STREAM_CODEC)
        private val DATA_PASTELMON_TYPE =
            SynchedEntityData.defineId(PastelmonEntity::class.java, PASTELMON_TYPE_SERIALIZER)

        fun createAttributes(): AttributeSupplier.Builder {
            return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 3.0)
        }

        init {
            EntityDataSerializers.registerSerializer(PASTELMON_TYPE_SERIALIZER)
        }
    }
}