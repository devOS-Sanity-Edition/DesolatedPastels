package one.devos.nautical.desolatedpastels.client.ponder.scenes

import net.createmod.ponder.api.scene.SceneBuilder
import net.createmod.ponder.api.scene.SceneBuildingUtil
import net.createmod.ponder.api.scene.VectorUtil
import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.core.particles.ParticleTypes
import net.minecraft.world.phys.Vec3
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks

object PastelBlock {
    fun portal(scene: SceneBuilder, util: SceneBuildingUtil) {
        // Setting up the scene
//        scene.addKeyframe()
        scene.title("portal", "")
        scene.configureBasePlate(0, 0, 6)
        scene.world().showSection(util.select().layers(0, 6), Direction.DOWN)
        scene.setNextUpEnabled(false)
        scene.overlay().showText(80).text("")
        scene.idle(20)
    }
}