package one.devos.nautical.desolatedpastels.common.entities.mallard

import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal

class MallardNightTargetGoal<T: LivingEntity>(mallard: MallardEntity, target: Class<T>) : NearestAttackableTargetGoal<T>(mallard, target, true) {
    override fun canUse(): Boolean {
        if (this.mob.lightLevelDependentMagicValue >= 0.5) return false
        return super.canUse()
    }
}