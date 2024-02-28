package one.devos.nautical.desolatedpastels.entities

import net.minecraft.client.renderer.block.model.ItemOverride
import net.minecraft.nbt.CompoundTag
import net.minecraft.network.syncher.EntityDataAccessor
import net.minecraft.network.syncher.EntityDataSerializers
import net.minecraft.network.syncher.SynchedEntityData
import net.minecraft.server.level.ServerLevel
import net.minecraft.util.Mth
import net.minecraft.world.damagesource.DamageSource
import net.minecraft.world.entity.*
import net.minecraft.world.entity.ai.attributes.AttributeSupplier
import net.minecraft.world.entity.ai.attributes.Attributes
import net.minecraft.world.entity.ai.goal.*
import net.minecraft.world.entity.animal.Animal
import net.minecraft.world.entity.player.Player
import net.minecraft.world.item.Items
import net.minecraft.world.item.crafting.Ingredient
import net.minecraft.world.level.ItemLike
import net.minecraft.world.level.Level
import one.devos.nautical.desolatedpastels.DesolatedPastels
import java.util.function.Predicate


class MallardEntity(entityType: EntityType<out MallardEntity?>?, level: Level?) : Animal(entityType, level) {
    override fun causeFallDamage(f: Float, g: Float, damageSource: DamageSource): Boolean {
        return false
    }

    override fun registerGoals() {
        goalSelector.addGoal(0, FloatGoal(this))
        goalSelector.addGoal(1, PanicGoal(this, 1.4))
        goalSelector.addGoal(2, BreedGoal(this, 1.0))
        goalSelector.addGoal(3, TemptGoal(this, 1.0, FOOD_ITEMS, false))
        goalSelector.addGoal(4, FollowParentGoal(this, 1.1))
        goalSelector.addGoal(6, LookAtPlayerGoal(this, Player::class.java, 6.0f))
        goalSelector.addGoal(7, RandomLookAroundGoal(this))
        goalSelector.addGoal(8, RandomStrollGoal(this, 1.1))

    }

    override fun getStandingEyeHeight(pose: Pose?, entityDimensions: EntityDimensions): Float {
//        return this.isBaby() ? entityDimensions.height * 0.92F : entityDimensions.height * 0.92F;
        return entityDimensions.height
    }

    override fun aiStep() {
        super.aiStep()
        val vec3 = this.deltaMovement
        if (!this.onGround() && vec3.y < 0.0) {
            this.deltaMovement = vec3.multiply(1.0, 0.6, 1.0)
        }
    }

    var variant: Int
        get() = Mth.clamp((entityData.get(VARIANT) as Int), 0, 5)
        set(variant) {
            entityData.set(VARIANT, variant)
        }

    override fun defineSynchedData() {
        super.defineSynchedData()
        if (this.commandSenderWorld.dimension().location().path != "pastelwonderland") {
            entityData.define(VARIANT, if (Math.random() <= 0.5) 0 else 1)
        } else {
            entityData.define(VARIANT, if (Math.random() <= 0.5) 3 else 4)
        }
    }

    override fun addAdditionalSaveData(tag: CompoundTag) {
        super.addAdditionalSaveData(tag)
        tag.putInt("Variant", this.variant)
    }

    override fun readAdditionalSaveData(tag: CompoundTag) {
        super.readAdditionalSaveData(tag)
        this.variant = tag.getInt("Variant")
    }

    override fun getBreedOffspring(serverLevel: ServerLevel, ageableMob: AgeableMob): MallardEntity? {
        return DesolatedPastels.MALLARD_ENTITY.create(serverLevel)
    }

    init {
        this.health = 6f
    }

    companion object {
        private var VARIANT: EntityDataAccessor<Int> = SynchedEntityData.defineId(MallardEntity::class.java, EntityDataSerializers.INT)
        private val FOOD_ITEMS: Ingredient = Ingredient.of(*arrayOf<ItemLike>(Items.WHEAT_SEEDS, Items.MELON_SEEDS, Items.PUMPKIN_SEEDS, Items.BEETROOT_SEEDS, Items.EMERALD))
        private val AVOID_PLAYERS: Predicate<Entity>? = null

        fun createAttributes(): AttributeSupplier.Builder {
            return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 6.0)
                .add(Attributes.MOVEMENT_SPEED, 0.25)
                .add(Attributes.JUMP_STRENGTH, 10.0)
                .add(Attributes.ATTACK_SPEED, 1.0)
        }
    }
}
