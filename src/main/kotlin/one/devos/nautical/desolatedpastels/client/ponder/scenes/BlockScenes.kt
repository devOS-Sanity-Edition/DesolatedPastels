package one.devos.nautical.desolatedpastels.client.ponder.scenes

import net.createmod.catnip.math.Pointing
import net.createmod.ponder.api.scene.SceneBuilder
import net.createmod.ponder.api.scene.SceneBuildingUtil
import net.createmod.ponder.api.scene.VectorUtil
import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.core.particles.BlockParticleOption
import net.minecraft.core.particles.ParticleTypes
import net.minecraft.world.phys.Vec3
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks
import one.devos.nautical.softerpastels.common.SofterPastelsItems

object BlockScenes {
    fun powderIntro(scene: SceneBuilder, util: SceneBuildingUtil) {
        // Setting up
        val powder = util.grid().at(2, 3, 0)
        val powder2 = util.grid().at(0, 3, 2)
        val emitter = scene.effects().simpleParticleEmitter(BlockParticleOption(ParticleTypes.BLOCK, SofterPastelsBlocks.WHITE_PASTEL_BLOCK.defaultBlockState()), Vec3(0.0, 0.1, 0.0))
        val emitterPos = Vec3(2.0, 1.0, 0.0)
        val emitterPos2 = Vec3(0.0, 1.0, 2.0)

        // Setting up the scene
//        scene.addKeyframe()
        scene.debug()
        scene.title("powder_intro", "")
        scene.configureBasePlate(0, 0, 5)
        scene.world().showSection(util.select().layers(0, 2), Direction.DOWN)
        scene.setNextUpEnabled(false)
        scene.overlay().showText(80).text("")
        scene.idle(20)

        // Moving the pastel powder into the water
//        scene.addKeyframe()
        val powderContraption = scene.world().showIndependentSection(util.select().position(powder), Direction.DOWN)
        val powderContraption2 = scene.world().showIndependentSection(util.select().position(powder2), Direction.DOWN)
        val powderDestination = doubleArrayOf(0.0, -2.0, 0.0)
        fun VectorUtil.of(vararg position: Double) = this.of(position[0], position[1], position[2])
        scene.overlay().showText(80).text("text_2").pointAt(Vec3(0.0, 2.50, 2.0))
        scene.world().moveSection(powderContraption, util.vector().of(*powderDestination), 20)
        scene.world().moveSection(powderContraption2, util.vector().of(*powderDestination), 20)

        scene.idle(20)
//        scene.addKeyframe()
        scene.effects().emitParticles(emitterPos, emitter, 1F, 1)
        scene.effects().emitParticles(emitterPos2, emitter, 1F, 1)
        scene.world().replaceBlocks(util.select().position(BlockPos(2, 1, 0)), SofterPastelsBlocks.WHITE_PASTEL_BLOCK.defaultBlockState(), true)
        scene.world().replaceBlocks(util.select().position(BlockPos(0, 1, 2)), SofterPastelsBlocks.WHITE_PASTEL_BLOCK.defaultBlockState(), true)

        scene.rotateCameraY(180f)
        scene.markAsFinished()
    }

    fun portal(scene: SceneBuilder, util: SceneBuildingUtil) {
        val portalInteractPos: BlockPos = util.grid().at(3, 1, 4)
        // Setting up the scene
//        scene.addKeyframe()
        scene.title("portal", "")
        scene.configureBasePlate(0, 0, 6)
        scene.world().showSection(util.select().layers(0, 6), Direction.DOWN)
        scene.setNextUpEnabled(false)
        scene.overlay().showText(80).text("")
        scene.idle(40)

        scene.overlay().showControls(util.vector().topOf(portalInteractPos), Pointing.DOWN, 40)
            .rightClick()
            .withItem(SofterPastelsItems.LIGHT_RED_POWDER.defaultInstance)
    }

    fun shardCreator(scene: SceneBuilder, util: SceneBuildingUtil) {
        val shardCreatorInteractPos: BlockPos = util.grid().at(2, 1, 2)

        scene.title("shard_creator", "")
        scene.configureBasePlate(0, 0, 5)
        scene.world().showSection(util.select().layers(0, 2), Direction.DOWN)
        scene.setNextUpEnabled(false)
        scene.overlay().showText(80).text("")
        scene.idle(20)

        scene.overlay().showControls(util.vector().topOf(shardCreatorInteractPos), Pointing.DOWN, 20)
            .rightClick()
            .withItem(SofterPastelsItems.RED_POWDER.defaultInstance)
        scene.idle(12)
        scene.overlay().showControls(util.vector().topOf(shardCreatorInteractPos), Pointing.LEFT, 20)
            .rightClick()
            .withItem(SofterPastelsItems.ORANGE_POWDER.defaultInstance)
        scene.idle(12)
        scene.overlay().showControls(util.vector().topOf(shardCreatorInteractPos), Pointing.UP, 20)
            .rightClick()
            .withItem(SofterPastelsItems.YELLOW_POWDER.defaultInstance)
        scene.idle(12)
        scene.overlay().showControls(util.vector().topOf(shardCreatorInteractPos), Pointing.RIGHT, 20)
            .rightClick()
            .withItem(SofterPastelsItems.GREEN_POWDER.defaultInstance)
        scene.idle(12)
        scene.overlay().showControls(util.vector().topOf(shardCreatorInteractPos), Pointing.DOWN, 20)
            .rightClick()
            .withItem(SofterPastelsItems.BLUE_POWDER.defaultInstance)

    }
}