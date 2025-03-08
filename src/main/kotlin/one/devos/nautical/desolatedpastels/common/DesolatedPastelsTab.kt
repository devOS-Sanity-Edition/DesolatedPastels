package one.devos.nautical.desolatedpastels.common

import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.CreativeModeTab.Output
import net.minecraft.world.level.ItemLike

object DesolatedPastelsTab {
    fun build(params: CreativeModeTab.ItemDisplayParameters, output: Output) {
        addBlocks(output)
        addDecorations(output)
        addNature(output)
    }

    private fun addBlocks(output: Output) {
        addAll(
            output,
            DesolatedPastelsBlocks.WHITE_LOG,
            DesolatedPastelsBlocks.LIGHT_RED_LOG,
            DesolatedPastelsBlocks.RED_LOG,
            DesolatedPastelsBlocks.ORANGE_LOG,
            DesolatedPastelsBlocks.YELLOW_LOG,
            DesolatedPastelsBlocks.LIGHT_GREEN_LOG,
            DesolatedPastelsBlocks.GREEN_LOG,
            DesolatedPastelsBlocks.LIGHT_BLUE_LOG,
            DesolatedPastelsBlocks.BLUE_LOG,
            DesolatedPastelsBlocks.PURPLE_LOG,
            DesolatedPastelsBlocks.MAGENTA_LOG,
            DesolatedPastelsBlocks.BROWN_LOG,
            DesolatedPastelsBlocks.LIGHT_GRAY_LOG,
            DesolatedPastelsBlocks.GRAY_LOG,
            DesolatedPastelsBlocks.BLACK_LOG
        )
    }

    private fun addDecorations(output: Output) {
        addAll(
            output,
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
            DesolatedPastelsBlocks.BRIGHTENED_BLACK_LEAVES
        )
    }

    private fun addNature(output: Output) {
        addAll(
            output,
            DesolatedPastelsBlocks.PASTEL_ORE,
            DesolatedPastelsBlocks.PASTEL_STONE,
            DesolatedPastelsBlocks.PASTEL_GRASS,
            DesolatedPastelsBlocks.PASTEL_DIRT,
            DesolatedPastelsBlocks.PASTEL_SAND,
            DesolatedPastelsBlocks.LIGHT_BLUE_SAPLING
        )
    }

    private fun addAll(output: Output, vararg items: ItemLike) {
        for (item in items) {
            output.accept(item)
        }
    }
}