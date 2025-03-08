package one.devos.nautical.desolatedpastels.client.entities.mallard

import net.minecraft.client.animation.AnimationChannel
import net.minecraft.client.animation.AnimationDefinition
import net.minecraft.client.animation.Keyframe
import net.minecraft.client.animation.KeyframeAnimations


class MallardAnimation {
    val flapping: AnimationDefinition = AnimationDefinition.Builder.withLength(0.65f).looping()
        .addAnimation(
            "right_wing", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.15f, KeyframeAnimations.degreeVec(0.0f, 0.0f, -61.42f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.25f, KeyframeAnimations.degreeVec(0.0f, 0.0f, -102.5f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.35f, KeyframeAnimations.degreeVec(0.0f, 0.0f, -116.47f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.5f, KeyframeAnimations.degreeVec(0.0f, 0.0f, -60.27f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.65f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "left_wing", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.15f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 61.42f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.25f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 102.5f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.35f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 116.47f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.5f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 60.27f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.65f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .build()

    val swimming_start: AnimationDefinition = AnimationDefinition.Builder.withLength(0.2f)
        .addAnimation(
            "left_leg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.2f, KeyframeAnimations.degreeVec(67.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "right_leg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.2f, KeyframeAnimations.degreeVec(67.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "left_wing", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.04f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.2f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 40.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "right_wing", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.04f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.2f, KeyframeAnimations.degreeVec(0.0f, 0.0f, -40.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .build()

    val swimming_loop: AnimationDefinition = AnimationDefinition.Builder.withLength(0.4f).looping()
        .addAnimation(
            "left_leg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(67.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.2f, KeyframeAnimations.degreeVec(47.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.4f, KeyframeAnimations.degreeVec(67.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "right_leg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(47.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.2f, KeyframeAnimations.degreeVec(67.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.4f, KeyframeAnimations.degreeVec(47.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "left_wing", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 40.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.2f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 52.5f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.4f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 40.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "right_wing", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, -40.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.2f, KeyframeAnimations.degreeVec(0.0f, 0.0f, -52.5f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.4f, KeyframeAnimations.degreeVec(0.0f, 0.0f, -40.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "neck", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.2f, KeyframeAnimations.degreeVec(2.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.4f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.2f, KeyframeAnimations.degreeVec(2.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.4f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .build()

    val swimming_end: AnimationDefinition = AnimationDefinition.Builder.withLength(0.3f)
        .addAnimation(
            "left_leg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(67.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.26f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "right_leg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(67.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.26f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "left_wing", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 40.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "right_wing", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, -40.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .build()

    val walking: AnimationDefinition = AnimationDefinition.Builder.withLength(0.5f).looping()
        .addAnimation(
            "body", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.1f, KeyframeAnimations.degreeVec(0.0f, 0.0f, -1.5f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.4f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.5f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.5f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "left_leg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.05f, KeyframeAnimations.degreeVec(-30.94f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.1f, KeyframeAnimations.degreeVec(-45.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.4f, KeyframeAnimations.degreeVec(45.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.5f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "right_leg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.1f, KeyframeAnimations.degreeVec(45.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.4f, KeyframeAnimations.degreeVec(-45.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.5f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "front", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.25f, KeyframeAnimations.degreeVec(2.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.5f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.25f, KeyframeAnimations.degreeVec(2.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.5f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .build()

    val attack_start: AnimationDefinition = AnimationDefinition.Builder.withLength(0.32f)
        .addAnimation(
            "neck", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.2f, KeyframeAnimations.degreeVec(22.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.32f, KeyframeAnimations.degreeVec(20.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.2f, KeyframeAnimations.degreeVec(-25.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.32f, KeyframeAnimations.degreeVec(-23.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "right_wing", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, -65.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "left_wing", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 65.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "left_leg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "right_leg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "front", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.32f, KeyframeAnimations.degreeVec(2.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .build()

    val attack_loop: AnimationDefinition = AnimationDefinition.Builder.withLength(0.3f).looping()
        .addAnimation(
            "left_wing", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 65.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.15f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 110.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 65.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "right_wing", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, -65.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.15f, KeyframeAnimations.degreeVec(0.0f, 0.0f, -110.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, -65.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "front", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(2.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "neck", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(20.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(-23.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "left_leg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.05f, KeyframeAnimations.degreeVec(-32.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.1f, KeyframeAnimations.degreeVec(-45.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.2f, KeyframeAnimations.degreeVec(32.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.25f, KeyframeAnimations.degreeVec(32.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "right_leg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.05f, KeyframeAnimations.degreeVec(32.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.1f, KeyframeAnimations.degreeVec(45.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.2f, KeyframeAnimations.degreeVec(-32.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.25f, KeyframeAnimations.degreeVec(-32.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .build()

    val attack_end: AnimationDefinition = AnimationDefinition.Builder.withLength(0.3f)
        .addAnimation(
            "left_wing", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 65.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "right_wing", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(0.0f, 0.0f, -65.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "front", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(2.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR)
            )
        )
        .addAnimation(
            "neck", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(20.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.1f, KeyframeAnimations.degreeVec(22.5f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "head", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.0f, KeyframeAnimations.degreeVec(-23.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM),
                Keyframe(0.1f, KeyframeAnimations.degreeVec(-25.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.LINEAR),
                Keyframe(0.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "left_leg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .addAnimation(
            "right_leg", AnimationChannel(
                AnimationChannel.Targets.ROTATION,
                Keyframe(0.3f, KeyframeAnimations.degreeVec(0.0f, 0.0f, 0.0f), AnimationChannel.Interpolations.CATMULLROM)
            )
        )
        .build()
}