package one.devos.nautical.desolatedpastels.common.entities.mallard.goals

import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal
import one.devos.nautical.desolatedpastels.common.entities.mallard.MallardEntity

class MallardNightTargetGoal<T: LivingEntity>(mallard: MallardEntity, target: Class<T>) : NearestAttackableTargetGoal<T>(mallard, target, true) {
    override fun canUse(): Boolean {
        if (this.mob.lightLevelDependentMagicValue >= 0.5) return false
        return super.canUse()
    }
}