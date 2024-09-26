package one.devos.nautical.desolatedpastels.common.entities.mallard

import net.minecraft.nbt.CompoundTag
import net.minecraft.network.syncher.EntityDataAccessor
import net.minecraft.network.syncher.EntityDataSerializers
import net.minecraft.network.syncher.SynchedEntityData
import net.minecraft.server.level.ServerLevel
import net.minecraft.sounds.SoundEvent
import net.minecraft.sounds.SoundEvents
import net.minecraft.util.Mth
import net.minecraft.world.damagesource.DamageSource
import net.minecraft.world.entity.*
import net.minecraft.world.entity.ai.attributes.AttributeSupplier
import net.minecraft.world.entity.ai.attributes.Attributes
import net.minecraft.world.entity.ai.goal.*
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal
import net.minecraft.world.entity.animal.Animal
import net.minecraft.world.entity.player.Player
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.Items
import net.minecraft.world.item.crafting.Ingredient
import net.minecraft.world.level.Level
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsSoundEvents
import kotlin.random.Random


class MallardEntity(entityType: EntityType<out MallardEntity>, level: Level) : Animal(entityType, level) {
    init {
        this.health = 6f
    }

    override fun causeFallDamage(f: Float, g: Float, damageSource: DamageSource): Boolean {
        return false
    }

    override fun registerGoals() {
        goalSelector.addGoal(0, FloatGoal(this))
        goalSelector.addGoal(1, MallardAttackGoal(this, 1.25, true))
        goalSelector.addGoal(2, TemptGoal(this, 1.25, FOOD_ITEMS, false))
        goalSelector.addGoal(3, FollowParentGoal(this, 1.1))
        goalSelector.addGoal(4, BreedGoal(this, 1.0))
        goalSelector.addGoal(5, LookAtPlayerGoal(this, Player::class.java, 6.0f))
        goalSelector.addGoal(6, RandomLookAroundGoal(this))
        goalSelector.addGoal(7, RandomStrollGoal(this, 1.1))
        targetSelector.addGoal(1, HurtByTargetGoal(this))
    }

    override fun defineSynchedData(builder: SynchedEntityData.Builder) {
        super.defineSynchedData(builder)
        builder.define(ATTACKING, false)

        if (this.commandSenderWorld.dimension().location().path != "desolatedpastels") {
            builder.define(VARIANT, if (Random.nextInt(2) == 0) 0 else 1)
        } else {
            builder.define(VARIANT, if (Random.nextInt(2) == 0) 3 else 4)
        }
    }

    override fun aiStep() {
        super.aiStep()
        val vec3 = this.deltaMovement
        if (!this.onGround() && vec3.y < 0.0) {
            this.deltaMovement = vec3.multiply(1.0, 0.6, 1.0)
        }
    }

    override fun getDefaultDimensions(pose: Pose): EntityDimensions {
//        return this.isBaby() ? entityDimensions.height * 0.92F : entityDimensions.height * 0.92F;
        return super.getDefaultDimensions(pose)
    }

    var variant: Int
        get() = Mth.clamp((entityData.get(VARIANT) as Int), 0, 5)
        set(variant) {
            entityData.set(VARIANT, variant)
        }

    fun setAttacking(attacking: Boolean) {
        this.entityData.set(ATTACKING, attacking)
    }

    override fun isAggressive(): Boolean {
        return this.entityData.get(ATTACKING)
    }

    override fun addAdditionalSaveData(tag: CompoundTag) {
        super.addAdditionalSaveData(tag)
        tag.putInt("Variant", this.variant)
    }

    override fun readAdditionalSaveData(tag: CompoundTag) {
        super.readAdditionalSaveData(tag)
        this.variant = tag.getInt("Variant")
    }

    override fun getBreedOffspring(serverLevel: ServerLevel, ageableMob: AgeableMob): MallardEntity {
        return DesolatedPastels.MALLARD_ENTITY.create(serverLevel)!!
    }

    override fun hurt(source: DamageSource, amount: Float): Boolean {
        return super.hurt(source, amount)
    }

    // IS THIS SERIOUSLY WHAT GETS THEM TO BREED?????? IM FUCKING STUPID THEN
    // GENUINELY I DIDNT KNOW IT WAS THIS, I ALWAYS THOUGHT IT WAS THE GETBREEDOFFSPRING SHIT AND GIVING IT VALID ITEMS IS ALL
    // DIDNT KNOW THIS WAS FUCKING NEEDED TOO WHY AM I GENUINELY SO STUPID
    override fun isFood(stack: ItemStack): Boolean {
        return FOOD_ITEMS.test(stack)
    }

    // temp
    // prob will make dedicated sound events eventually for the mallards, or just all mobs
    override fun getDeathSound(): SoundEvent {
        return DesolatedPastelsSoundEvents.MALLARD_DEATH
    }

    override fun getHurtSound(damageSource: DamageSource): SoundEvent {
        return SoundEvents.PLAYER_HURT
    }

    override fun getAmbientSound(): SoundEvent {
        return DesolatedPastelsSoundEvents.MALLARD_QUACKS
    }

    override fun getSwimSound(): SoundEvent {
        return SoundEvents.PLAYER_SWIM
    }

    override fun getSwimSplashSound(): SoundEvent {
        return SoundEvents.PLAYER_SPLASH
    }

    override fun getSwimHighSpeedSplashSound(): SoundEvent {
        return SoundEvents.PLAYER_SPLASH_HIGH_SPEED
    }

    companion object {
        private var VARIANT: EntityDataAccessor<Int> = SynchedEntityData.defineId(MallardEntity::class.java, EntityDataSerializers.INT)
        private val FOOD_ITEMS: Ingredient = Ingredient.of(Items.WHEAT_SEEDS, Items.MELON_SEEDS, Items.PUMPKIN_SEEDS, Items.BEETROOT_SEEDS, Items.EMERALD)
        private val ATTACKING: EntityDataAccessor<Boolean> = SynchedEntityData.defineId(MallardEntity::class.java, EntityDataSerializers.BOOLEAN)

        fun createAttributes(): AttributeSupplier.Builder {
            return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 6.0)
                .add(Attributes.MOVEMENT_SPEED, 0.25)
                .add(Attributes.ATTACK_SPEED, 1.0)
                .add(Attributes.ATTACK_DAMAGE, 4.0)
        }
    }
}
