package one.devos.nautical.desolatedpastels.client.ponder.scenes

import net.createmod.catnip.math.Pointing
import net.createmod.ponder.api.scene.SceneBuilder
import net.createmod.ponder.api.scene.SceneBuildingUtil
import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import one.devos.nautical.softerpastels.common.SofterPastelsItems

object StructureScenes {
    fun fountain(scene: SceneBuilder, util: SceneBuildingUtil) {
        scene.title("fountain", "")
        scene.configureBasePlate(0, 5, 9)
        scene.removeShadow()
        scene.world().showSection(util.select().layersFrom(0), Direction.UP)
        scene.setNextUpEnabled(false)
        scene.overlay().showText(80).text("")
        scene.idle(20)
    }

    fun mallard(scene: SceneBuilder, util: SceneBuildingUtil) {
        scene.title("mallard", "")
        scene.configureBasePlate(0, 5, 10)
        scene.removeShadow()
        scene.world().showSection(util.select().layersFrom(0), Direction.UP)
        scene.setNextUpEnabled(false)
        scene.overlay().showText(80).text("")
        scene.idle(20)
    }
}