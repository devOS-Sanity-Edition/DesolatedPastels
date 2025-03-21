package one.devos.nautical.desolatedpastels.common.entities.egg

import net.minecraft.core.particles.ItemParticleOption
import net.minecraft.core.particles.ParticleTypes
import net.minecraft.world.entity.EntityDimensions
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.animal.Animal
import net.minecraft.world.entity.projectile.ThrowableItemProjectile
import net.minecraft.world.item.Item
import net.minecraft.world.level.Level
import net.minecraft.world.phys.EntityHitResult
import net.minecraft.world.phys.HitResult
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsEntities.MALLARD_ENTITY
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsItems

class MallardEggEntity : ThrowableItemProjectile {
    private val ZERO_SIZED_DIMENSIONS: EntityDimensions = EntityDimensions.fixed(0.0f, 0.0f)
    private var mobEntityType: EntityType<out Animal> = MALLARD_ENTITY

    constructor(
        entityType: EntityType<out ThrowableItemProjectile>,
        level: Level
    ) : super(entityType, level) {
        mobEntityType = MALLARD_ENTITY
    }
    constructor(
        entityType: EntityType<out ThrowableItemProjectile>,
        level: Level,
        x: Double,
        y: Double,
        z: Double
    ) : super(entityType, x, y, z, level) {
        // Used for client side rendering, so mobEntityType doesn't matter
        mobEntityType = MALLARD_ENTITY
    }
    constructor(
        entityType: EntityType<out ThrowableItemProjectile>,
        level: Level,
        owner: LivingEntity,
        mobEntityType: EntityType<out Animal>
    ) : super(entityType, owner, level) {
        // This is the only constructor used on server side that matters
        this.mobEntityType = mobEntityType
    }
    constructor(
        entityType: EntityType<out ThrowableItemProjectile>,
        level: Level,
        x: Double,
        y: Double,
        z: Double,
        mobEntityType: EntityType<out Animal>
    ) : super(entityType, x, y, z, level) {
        // Used for dispensing the item
        this.mobEntityType = mobEntityType
    }
    override fun handleEntityEvent(id: Byte) {
        if (id.toInt() == 3) {
            for (i in 0 until 8) {
                level()
                    .addParticle(
                        ItemParticleOption(ParticleTypes.ITEM, item),
                        x,
                        y,
                        z,
                        (random.nextFloat() - 0.5) * 0.08,
                        (random.nextFloat() - 0.5) * 0.08,
                        (random.nextFloat() - 0.5) * 0.08
                    )
            }
        }
    }

    override fun onHitEntity(result: EntityHitResult) {
        super.onHitEntity(result)
        result.entity.hurt(damageSources().thrown(this, owner), 2f)
    }

    override fun onHit(result: HitResult) {
        super.onHit(result)

        if (!level().isClientSide) {
            if (random.nextInt(8) == 0) {
                var i = 1;
                if (random.nextInt(32) == 0) {
                    i = 4
                }

                for (j in 0 until i) {
                    val mallard = mobEntityType.create(level())
                    if (mallard != null) {
                        mallard.age = -24000
                        mallard.moveTo(x, y, z, yRot, 0F)

                        if (!mallard.fudgePositionAfterSizeChange(ZERO_SIZED_DIMENSIONS)) {
                            break
                        }

                        level().addFreshEntity(mallard)
                    }
                }

                level().broadcastEntityEvent(this, 3.toByte())
                discard()
            }
        }
    }

    override fun getDefaultItem(): Item {
        return DesolatedPastelsItems.MALLARD_EGG_ITEM
    }
}