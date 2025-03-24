package one.devos.nautical.desolatedpastels.client.ponder.scenes

import net.createmod.ponder.api.scene.SceneBuilder
import net.createmod.ponder.api.scene.SceneBuildingUtil
import net.createmod.ponder.api.scene.VectorUtil
import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks

object PowderBlock {
    fun powderIntro(scene: SceneBuilder, util: SceneBuildingUtil) {
        // Setting up
        val waterPos1 = BlockPos(2, 1, 2)
        val waterPos3 = BlockPos(0, 1, 2)
        val waterPos5 = BlockPos(2, 1, 0)
        val waterSel1 = util.select().fromTo(waterPos1, waterPos3)
        val waterSel2 = util.select().fromTo(waterPos1, waterPos5)
//        val powderPos1 = BlockPos(2, 3, 0)
        val powder = util.grid().at(2, 3, 0)
//        val powderPos2 = BlockPos(0, 3, 2)
        val powder2 = util.grid().at(0, 3, 2)
//        val powderPos1Target = BlockPos(2, 2, 0)
//        val powderPos2Target = BlockPos(0, 2, 2)
//        val powderPos1_2Target = BlockPos(2, 1, 0)
//        val powderPos2_2Target = BlockPos(0, 1, 2)
//        val powderSel1 = util.select().fromTo(powderPos1, powderPos1Target)
//        val powderSel2 = util.select().fromTo(powderPos2, powderPos2Target)
//        val powderSel3 = util.select().fromTo(powderPos1Target, powderPos1_2Target)
//        val powderSel4 = util.select().fromTo(powderPos2Target, powderPos2_2Target)

        // Setting up the scene
        scene.addKeyframe()
        scene.title("powder_intro", "")
        scene.configureBasePlate(0, 0, 5)
        scene.world().showSection(util.select().layers(0, 2), Direction.DOWN)
        scene.setNextUpEnabled(false)
        scene.overlay().showText(80).text("This is water, it is wet")
        scene.idle(20)

        // Moving the pastel powder into the water
        scene.addKeyframe()
        val powderContraption = scene.world().showIndependentSection(util.select().position(powder), Direction.DOWN)
        val powderContraption2 = scene.world().showIndependentSection(util.select().position(powder2), Direction.DOWN)
        val powderDestination = doubleArrayOf(0.0, -2.0, 0.0)
        fun VectorUtil.of(vararg position: Double) = this.of(position[0], position[1], position[2])
        scene.overlay().showText(40).text("Place the pastel powder into the water")
        scene.world().moveSection(powderContraption, util.vector().of(*powderDestination), 20)
        scene.world().moveSection(powderContraption2, util.vector().of(*powderDestination), 20)

        scene.idle(40)
        scene.addKeyframe()
        scene.world().replaceBlocks(util.select().position(BlockPos(2, 1, 0)), SofterPastelsBlocks.WHITE_PASTEL_BLOCK.defaultBlockState(), true)
        scene.world().replaceBlocks(util.select().position(BlockPos(0, 1, 2)), SofterPastelsBlocks.WHITE_PASTEL_BLOCK.defaultBlockState(), true)
    }
}