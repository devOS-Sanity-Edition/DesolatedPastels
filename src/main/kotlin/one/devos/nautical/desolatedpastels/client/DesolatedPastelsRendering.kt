package one.devos.nautical.desolatedpastels.client

import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.client.renderer.RenderType
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks

@Environment(EnvType.CLIENT)
object DesolatedPastelsRendering {
    fun SaplingCutout() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutoutMipped(),
            DesolatedPastelsBlocks.LIGHT_BLUE_SAPLING,
            DesolatedPastelsBlocks.LIGHT_GREEN_SAPLING)
    }
    
    fun GlassTranslucency() {

    }

    fun LeavesCutout() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutoutMipped(),
            DesolatedPastelsBlocks.WHITE_LEAVES,
            DesolatedPastelsBlocks.LIGHT_RED_LEAVES,
            DesolatedPastelsBlocks.RED_LEAVES,
            DesolatedPastelsBlocks.ORANGE_LEAVES,
            DesolatedPastelsBlocks.YELLOW_LEAVES,
            DesolatedPastelsBlocks.LIGHT_GREEN_LEAVES,
            DesolatedPastelsBlocks.GREEN_LEAVES,
            DesolatedPastelsBlocks.LIGHT_BLUE_LEAVES,
            DesolatedPastelsBlocks.BLUE_LEAVES,
            DesolatedPastelsBlocks.PURPLE_LEAVES,
            DesolatedPastelsBlocks.MAGENTA_LEAVES,
            DesolatedPastelsBlocks.BROWN_LEAVES,
            DesolatedPastelsBlocks.LIGHT_GRAY_LEAVES,
            DesolatedPastelsBlocks.GRAY_LEAVES,
            DesolatedPastelsBlocks.BLACK_LEAVES,
            DesolatedPastelsBlocks.BRIGHTENED_WHITE_LEAVES,
            DesolatedPastelsBlocks.BRIGHTENED_LIGHT_RED_LEAVES,
            DesolatedPastelsBlocks.BRIGHTENED_RED_LEAVES,
            DesolatedPastelsBlocks.BRIGHTENED_ORANGE_LEAVES,
            DesolatedPastelsBlocks.BRIGHTENED_YELLOW_LEAVES,
            DesolatedPastelsBlocks.BRIGHTENED_LIGHT_GREEN_LEAVES,
            DesolatedPastelsBlocks.BRIGHTENED_GREEN_LEAVES,
            DesolatedPastelsBlocks.BRIGHTENED_LIGHT_BLUE_LEAVES,
            DesolatedPastelsBlocks.BRIGHTENED_BLUE_LEAVES,
            DesolatedPastelsBlocks.BRIGHTENED_PURPLE_LEAVES,
            DesolatedPastelsBlocks.BRIGHTENED_MAGENTA_LEAVES,
            DesolatedPastelsBlocks.BRIGHTENED_BROWN_LEAVES,
            DesolatedPastelsBlocks.BRIGHTENED_LIGHT_GRAY_LEAVES,
            DesolatedPastelsBlocks.BRIGHTENED_GRAY_LEAVES,
            DesolatedPastelsBlocks.BRIGHTENED_BLACK_LEAVES,
        )
    }
    fun init() {
        SaplingCutout()
        GlassTranslucency()
        LeavesCutout()
    }
}