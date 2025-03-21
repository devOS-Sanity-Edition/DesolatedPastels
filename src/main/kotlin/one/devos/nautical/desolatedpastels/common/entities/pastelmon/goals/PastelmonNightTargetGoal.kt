package one.devos.nautical.desolatedpastels.common.entities.pastelmon.goals

import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal
import one.devos.nautical.desolatedpastels.common.entities.pastelmon.PastelmonEntity

class PastelmonNightTargetGoal<T: LivingEntity>(pastelmon: PastelmonEntity, target: Class<T>) : NearestAttackableTargetGoal<T>(pastelmon, target, true) {
    override fun canUse(): Boolean {
        if (this.mob.level().dayTime >= 0.5) return false
        return super.canUse()
    }
}