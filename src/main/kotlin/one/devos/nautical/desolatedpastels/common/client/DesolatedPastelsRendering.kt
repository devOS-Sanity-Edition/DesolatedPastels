package one.devos.nautical.desolatedpastels.common.client

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.client.renderer.RenderType
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks

object DesolatedPastelsRendering {
    fun GlassTranslucency() {

    }

    fun LeavesCutout() {
        // prob use .putBlock*s*(renderType, block) later so it's a full on list
        BlockRenderLayerMap.INSTANCE.putBlock(DesolatedPastelsBlocks.LIGHT_GREEN_LEAVES, RenderType.cutout())
    }
    fun init() {
        GlassTranslucency()
        LeavesCutout()
    }
}