package one.devos.nautical.desolatedpastels.common.entities.mallard.goals

import net.minecraft.world.entity.ai.goal.Goal
import one.devos.nautical.desolatedpastels.common.entities.mallard.MallardEntity
import java.util.EnumSet

class MallardEatGoal(val mallard: MallardEntity) : Goal() {
    private var animationTime = 0
    private var delayTime = 0

    init {
        this.flags = EnumSet.of(Flag.LOOK, Flag.MOVE)
    }

    override fun canUse(): Boolean {
        if (!mallard.isHungry()) return false

        val stack = mallard.mainHandItem ?: return false
        return !stack.isEmpty
    }

    override fun start() {
        mallard.navigation.stop()
        animationTime = ANIMATION_LENGTH
        delayTime = STARTING_DELAY
    }

    override fun canContinueToUse(): Boolean {
        return animationTime >= 0
    }

    override fun tick() {
        if (delayTime > 0) {
            delayTime--;
            return;
        }
        animationTime--
        if (animationTime == ANIMATION_EAT_POINT) {
            mallard.tryEating()
        }
    }

    companion object {
        private const val STARTING_DELAY = 10
        private const val ANIMATION_LENGTH = 22
        private const val ANIMATION_EAT_POINT = ANIMATION_LENGTH - 13
    }
}