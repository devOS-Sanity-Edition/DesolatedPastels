package one.devos.nautical.desolatedpastels.common.entities.pastelmon.goals

import gay.asoji.innerpastels.misc.secondsToTicks
import net.minecraft.world.InteractionHand
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.PathfinderMob
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal
import one.devos.nautical.desolatedpastels.common.entities.pastelmon.PastelmonEntity

class PastelmonAttackGoal(mob: PathfinderMob, speedModifier: Double, followingTargetEvenIfNotSeen: Boolean) : MeleeAttackGoal(mob, speedModifier, followingTargetEvenIfNotSeen) {
    private val entity = mob as PastelmonEntity
    private var attackDelay = 2.secondsToTicks()
    private var ticksUntilNextAttack = 2.secondsToTicks()
    private var shouldCountTillNextAttack = false

    override fun canContinueToUse(): Boolean {
        if (this.mob.lightLevelDependentMagicValue >= 0.5 && this.mob.random.nextInt(100) == 0) {
            this.mob.target = null
            return false
        }
        return super.canContinueToUse()
    }

    override fun checkAndPerformAttack(pEnemy: LivingEntity) {
        if (isEnemyWithinAttackDistance(pEnemy)) {
            shouldCountTillNextAttack = true

            if (isTimeToStartAttackAnimation()) {
                entity.setAttacking(true)
            }

            if (super.isTimeToAttack()) {
                this.mob.lookControl.setLookAt(pEnemy.x, pEnemy.y, pEnemy.z)
                performAttack(pEnemy)
            }
        } else {
            super.resetAttackCooldown()
            shouldCountTillNextAttack = false
            entity.setAttacking(false)
        }
    }

    private fun isEnemyWithinAttackDistance(pEnemy: LivingEntity): Boolean {
        return this.entity.distanceToSqr(pEnemy) <= 3f * 3f
    }

    override fun resetAttackCooldown() {
        this.ticksUntilNextAttack = this.adjustedTickDelay(attackDelay * 2)
    }

    protected fun isTimeToStartAttackAnimation(): Boolean {
        return this.ticksUntilNextAttack <= attackDelay
    }

    override fun isTimeToAttack(): Boolean {
        return this.ticksUntilNextAttack <= 0
    }

    protected fun performAttack(pEnemy: LivingEntity) {
        this.resetAttackCooldown()
        this.mob.swing(InteractionHand.MAIN_HAND)
        this.mob.doHurtTarget(pEnemy)
    }

    override fun tick() {
        super.tick()
        if (shouldCountTillNextAttack) {
            this.ticksUntilNextAttack = Math.max(this.ticksUntilNextAttack - 1, 0)
        }
    }

    override fun stop() {
        entity.setAttacking(false)
        super.stop()

    }
}