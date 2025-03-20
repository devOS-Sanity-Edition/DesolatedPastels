package one.devos.nautical.desolatedpastels.common.entities.mallard

import io.netty.buffer.ByteBuf
import net.minecraft.core.component.DataComponents
import net.minecraft.nbt.CompoundTag
import net.minecraft.network.codec.ByteBufCodecs
import net.minecraft.network.codec.StreamCodec
import net.minecraft.network.syncher.EntityDataAccessor
import net.minecraft.network.syncher.EntityDataSerializer
import net.minecraft.network.syncher.EntityDataSerializers
import net.minecraft.network.syncher.SynchedEntityData
import net.minecraft.resources.ResourceLocation
import net.minecraft.server.level.ServerLevel
import net.minecraft.sounds.SoundEvent
import net.minecraft.sounds.SoundEvents
import net.minecraft.util.ByIdMap
import net.minecraft.util.StringRepresentable
import net.minecraft.util.TimeUtil
import net.minecraft.world.InteractionHand
import net.minecraft.world.InteractionResult
import net.minecraft.world.damagesource.DamageSource
import net.minecraft.world.entity.*
import net.minecraft.world.entity.ai.attributes.AttributeSupplier
import net.minecraft.world.entity.ai.attributes.Attributes
import net.minecraft.world.entity.ai.goal.*
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal
import net.minecraft.world.entity.item.ItemEntity
import net.minecraft.world.entity.player.Player
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.Items
import net.minecraft.world.item.crafting.Ingredient
import net.minecraft.world.level.Level
import net.minecraft.world.phys.AABB
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsEntities.MALLARD_ENTITY
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsItems
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsSoundEvents
import one.devos.nautical.desolatedpastels.common.entities.mallard.goals.MallardAttackGoal
import one.devos.nautical.desolatedpastels.common.entities.mallard.goals.MallardNightTargetGoal
import one.devos.nautical.desolatedpastels.common.entities.mallard.goals.MallardSearchForItemsGoal
import java.util.function.Predicate
import kotlin.random.Random


class MallardEntity(entityType: EntityType<out MallardEntity>, level: Level) : TamableAnimal(entityType, level) {
    var ticksUntilNextAlert: Int = 0

    val idleAnimationState = AnimationState()
    val idleAnimationTimeout: Int = 0

    val attackAnimationState = AnimationState()
    val attackAnimationTimeout: Int = 0

    var eggLayTime = random.nextInt(MIN_EGG_LAY_TIME) + (MAX_EGG_LAY_TIME - MIN_EGG_LAY_TIME)

    enum class Type(val texture: ResourceLocation, val babyTexture: ResourceLocation) : StringRepresentable {
        NORMAL(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "textures/entity/mallard/mallard.png"), ResourceLocation.fromNamespaceAndPath("desolatedpastels", "textures/entity/mallard/mababy.png")) {
            override fun getSerializedName(): String {
                return this.name.lowercase()
            }
        },
        LADY(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "textures/entity/mallard/mallady.png"), ResourceLocation.fromNamespaceAndPath("desolatedpastels", "textures/entity/mallard/mababy.png")) {
            override fun getSerializedName(): String {
                return this.name.lowercase()
            }
        },
        PALLARD(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "textures/entity/mallard/pallard.png"), ResourceLocation.fromNamespaceAndPath("desolatedpastels", "textures/entity/mallard/pababy.png")) {
            override fun getSerializedName(): String {
                return this.name.lowercase()
            }
        },
        PALLADY(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "textures/entity/mallard/pallady.png"), ResourceLocation.fromNamespaceAndPath("desolatedpastels", "textures/entity/mallard/pababy.png")) {
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
                    Type.entries.toTypedArray(),
                    ByIdMap.OutOfBoundsStrategy.WRAP
                ), Type::ordinal
            )
        }
    }

    init {
        this.health = BASE_HEALTH.toFloat()
        this.setCanPickUpLoot(true)
    }

    override fun causeFallDamage(f: Float, g: Float, damageSource: DamageSource): Boolean {
        return false
    }

    override fun registerGoals() {
        goalSelector.addGoal(0, FloatGoal(this))
        goalSelector.addGoal(1, MallardAttackGoal(this, 1.25, true))
        goalSelector.addGoal(2, BreedGoal(this, 1.0))
        goalSelector.addGoal(3, FollowParentGoal(this, 1.1))
        goalSelector.addGoal(4, TemptGoal(this, 1.25, FOOD_ITEMS, false))
        goalSelector.addGoal(5, LookAtPlayerGoal(this, Player::class.java, 6.0f))
        goalSelector.addGoal(6, RandomLookAroundGoal(this))
        goalSelector.addGoal(7, RandomStrollGoal(this, 1.1))
        goalSelector.addGoal(8, MallardSearchForItemsGoal(this))
        targetSelector.addGoal(1, HurtByTargetGoal(this))
        targetSelector.addGoal(2, MallardNightTargetGoal(this, Player::class.java))
    }

    override fun defineSynchedData(builder: SynchedEntityData.Builder) {
        super.defineSynchedData(builder)
        builder.define(ATTACKING, false)

        if (this.commandSenderWorld.dimension().location().namespace == "desolatedpastels") {
            builder.define(DATA_MALLARD_TYPE, if (Random.nextInt(2) == 0) Type.PALLARD else Type.PALLADY)
        } else {
            builder.define(DATA_MALLARD_TYPE, if (Random.nextInt(2) == 0) Type.NORMAL else Type.LADY)
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

    var variant: Type
        get() = entityData.get(DATA_MALLARD_TYPE)
        set(variant) {
            entityData.set(DATA_MALLARD_TYPE, variant)
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
        tag.putInt("EggLayTime", eggLayTime)
    }

    override fun readAdditionalSaveData(tag: CompoundTag) {
        super.readAdditionalSaveData(tag)
        this.variant = Type.getByName(tag.getString("Variant"))
        if (tag.contains("EggLayTime")) {
            this.eggLayTime = tag.getInt("EggLayTime")
        }
    }

    override fun setTame(tame: Boolean, applyTamingSideEffects: Boolean) {
        super.setTame(tame, applyTamingSideEffects)
        if (tame) {
            getAttribute(Attributes.MAX_HEALTH)?.baseValue = 20.0
        } else {
            getAttribute(Attributes.MAX_HEALTH)?.baseValue = BASE_HEALTH.toDouble()
        }
    }

    override fun mobInteract(player: Player, hand: InteractionHand): InteractionResult {
        val stack = player.getItemInHand(hand)

        if (level().isClientSide && (!isBaby || !isFood(stack))) {
            return if (isTame && isOwnedBy(player)) {
                InteractionResult.SUCCESS
            } else {
                if (!isFood(stack) || !(health < maxHealth) && isTame) InteractionResult.PASS else InteractionResult.SUCCESS
            }
        } else {
            if (isTame && isOwnedBy(player)) {
                if (isFood(stack) && health < maxHealth) {
                    val food = stack.get(DataComponents.FOOD)
                    eat(level(), stack, food!!)
                    heal(food?.nutrition?.toFloat() ?: 1f)
                    return InteractionResult.CONSUME
                }
                val interactionResult = super.mobInteract(player, hand)
                if (!interactionResult.consumesAction() || isBaby) {
                    // @todo this is where we would toggle sitting state, because we don't have an animation yet, it does nothing
//                    jumping = false
//                    navigation.stop()
//                    target = null
//                    isInSittingPose = true
                }
                return interactionResult
            } else if (isFood(stack) && !isTame) {
                if (!player.abilities.instabuild) stack.count--
                if (random.nextInt(3) == 0) {
                    tame(player)
                    navigation.stop()
                    target = null
                    isInSittingPose = false
                    level().broadcastEntityEvent(this, EntityEvent.TAMING_SUCCEEDED)
                } else {
                    level().broadcastEntityEvent(this, EntityEvent.TAMING_FAILED)
                }
                return InteractionResult.CONSUME
            } else {
                return super.mobInteract(player, hand)
            }
        }
    }

    override fun getBreedOffspring(serverLevel: ServerLevel, ageableMob: AgeableMob): MallardEntity {
        return MALLARD_ENTITY.create(serverLevel)!!
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
        this.level().getEntitiesOfClass(MallardEntity::class.java, box, EntitySelector.NO_SPECTATORS)
            .filter { it != this && it.target == null && !it.isAlliedTo(this.target!!) }
            .forEach {
                it.target = this.target
            }
    }

    fun isHungry() = health <= maxHealth - 0.5f

    fun tryEating() {
        assert(!level().isClientSide)

        val stack = mainHandItem
        if (FOOD_ITEMS.items.contains(stack)) {
            stack.count--
            playSound(SoundEvents.GENERIC_EAT, 0.5F + 0.5F * random.nextInt(2), (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F)
            if (stack.isEmpty) {
                setItemInHand(InteractionHand.MAIN_HAND, ItemStack.EMPTY)
            }
            if (isHungry()) {
                val food = stack.get(DataComponents.FOOD)
                heal(food?.nutrition?.toFloat() ?: 1f)
            }
        }
    }

    override fun tick() {
        super.tick()

        if (!level().isClientSide) {
            if (isAlive && !isBaby && --eggLayTime <= 0) {
                playSound(SoundEvents.CHICKEN_EGG, 1f, (random.nextFloat() - random.nextFloat()) * 0.2F + 1f)
                spawnAtLocation(if (random.nextFloat() < 0.2) DesolatedPastelsItems.ROTTEN_MALLARD_EGG_ITEM else DesolatedPastelsItems.MALLARD_EGG_ITEM)
                this.eggLayTime = random.nextInt(MIN_EGG_LAY_TIME) + (MAX_EGG_LAY_TIME - MIN_EGG_LAY_TIME)
            }
        }
    }

    companion object {
        private val FOOD_ITEMS: Ingredient = Ingredient.of(
            Items.WHEAT_SEEDS,
            Items.MELON_SEEDS,
            Items.PUMPKIN_SEEDS,
            Items.BEETROOT_SEEDS,
            Items.EMERALD
        )
        private val ATTACKING: EntityDataAccessor<Boolean> =
            SynchedEntityData.defineId(MallardEntity::class.java, EntityDataSerializers.BOOLEAN)
        private val ALERT_INTERVAL = TimeUtil.rangeOfSeconds(4, 6)
        private val MALLARD_TYPE_SERIALIZER = EntityDataSerializer.forValueType(Type.STREAM_CODEC)
        private val DATA_MALLARD_TYPE = SynchedEntityData.defineId(MallardEntity::class.java, MALLARD_TYPE_SERIALIZER)
        val ALLOWED_ITEMS: Predicate<ItemEntity> = Predicate { itemEntity: ItemEntity -> !itemEntity.hasPickUpDelay() && itemEntity.isAlive }
        private const val MIN_EGG_LAY_TIME = 6000
        private const val MAX_EGG_LAY_TIME = 12000
        private const val BASE_HEALTH = 6

        fun createAttributes(): AttributeSupplier.Builder {
            return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 6.0)
                .add(Attributes.MOVEMENT_SPEED, 0.25)
                .add(Attributes.ATTACK_SPEED, 1.0)
                .add(Attributes.ATTACK_DAMAGE, 2.0)
        }

        init {
            EntityDataSerializers.registerSerializer(MALLARD_TYPE_SERIALIZER)
        }
    }
}
