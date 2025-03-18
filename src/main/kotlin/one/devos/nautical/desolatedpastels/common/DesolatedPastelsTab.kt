package one.devos.nautical.desolatedpastels.common

import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.CreativeModeTab.Output
import net.minecraft.world.level.ItemLike
import one.devos.nautical.desolatedpastels.DesolatedPastels

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
            DesolatedPastelsBlocks.BLACK_LOG,

            DesolatedPastelsBlocks.WHITE_PLANKS,
            DesolatedPastelsBlocks.LIGHT_RED_PLANKS,
            DesolatedPastelsBlocks.RED_PLANKS,
            DesolatedPastelsBlocks.ORANGE_PLANKS,
            DesolatedPastelsBlocks.YELLOW_PLANKS,
            DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS,
            DesolatedPastelsBlocks.GREEN_PLANKS,
            DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS,
            DesolatedPastelsBlocks.BLUE_PLANKS,
            DesolatedPastelsBlocks.PURPLE_PLANKS,
            DesolatedPastelsBlocks.MAGENTA_PLANKS,
            DesolatedPastelsBlocks.BROWN_PLANKS,
            DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS,
            DesolatedPastelsBlocks.GRAY_PLANKS,
            DesolatedPastelsBlocks.BLACK_PLANKS
        )
        addAll(
            output,
            DesolatedPastelsBlocks.WHITE_PLANK_FENCE,
            DesolatedPastelsBlocks.LIGHT_RED_PLANK_FENCE,
            DesolatedPastelsBlocks.RED_PLANK_FENCE,
            DesolatedPastelsBlocks.ORANGE_PLANK_FENCE,
            DesolatedPastelsBlocks.YELLOW_PLANK_FENCE,
            DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_FENCE,
            DesolatedPastelsBlocks.GREEN_PLANK_FENCE,
            DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_FENCE,
            DesolatedPastelsBlocks.BLUE_PLANK_FENCE,
            DesolatedPastelsBlocks.PURPLE_PLANK_FENCE,
            DesolatedPastelsBlocks.MAGENTA_PLANK_FENCE,
            DesolatedPastelsBlocks.BROWN_PLANK_FENCE,
            DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_FENCE,
            DesolatedPastelsBlocks.GRAY_PLANK_FENCE,
            DesolatedPastelsBlocks.BLACK_PLANK_FENCE,

            DesolatedPastelsBlocks.WHITE_PLANK_FENCE_GATE,
            DesolatedPastelsBlocks.LIGHT_RED_PLANK_FENCE_GATE,
            DesolatedPastelsBlocks.RED_PLANK_FENCE_GATE,
            DesolatedPastelsBlocks.ORANGE_PLANK_FENCE_GATE,
            DesolatedPastelsBlocks.YELLOW_PLANK_FENCE_GATE,
            DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_FENCE_GATE,
            DesolatedPastelsBlocks.GREEN_PLANK_FENCE_GATE,
            DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_FENCE_GATE,
            DesolatedPastelsBlocks.BLUE_PLANK_FENCE_GATE,
            DesolatedPastelsBlocks.PURPLE_PLANK_FENCE_GATE,
            DesolatedPastelsBlocks.MAGENTA_PLANK_FENCE_GATE,
            DesolatedPastelsBlocks.BROWN_PLANK_FENCE_GATE,
            DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_FENCE_GATE,
            DesolatedPastelsBlocks.GRAY_PLANK_FENCE_GATE,
            DesolatedPastelsBlocks.BLACK_PLANK_FENCE_GATE
        )
        addAll(
            output,
            DesolatedPastelsBlocks.WHITE_PLANK_SLAB,
            DesolatedPastelsBlocks.LIGHT_RED_PLANK_SLAB,
            DesolatedPastelsBlocks.RED_PLANK_SLAB,
            DesolatedPastelsBlocks.ORANGE_PLANK_SLAB,
            DesolatedPastelsBlocks.YELLOW_PLANK_SLAB,
            DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_SLAB,
            DesolatedPastelsBlocks.GREEN_PLANK_SLAB,
            DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_SLAB,
            DesolatedPastelsBlocks.BLUE_PLANK_SLAB,
            DesolatedPastelsBlocks.PURPLE_PLANK_SLAB,
            DesolatedPastelsBlocks.MAGENTA_PLANK_SLAB,
            DesolatedPastelsBlocks.BROWN_PLANK_SLAB,
            DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_SLAB,
            DesolatedPastelsBlocks.GRAY_PLANK_SLAB,
            DesolatedPastelsBlocks.BLACK_PLANK_SLAB,

            DesolatedPastelsBlocks.WHITE_PLANK_STAIRS,
            DesolatedPastelsBlocks.LIGHT_RED_PLANK_STAIRS,
            DesolatedPastelsBlocks.RED_PLANK_STAIRS,
            DesolatedPastelsBlocks.ORANGE_PLANK_STAIRS,
            DesolatedPastelsBlocks.YELLOW_PLANK_STAIRS,
            DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_STAIRS,
            DesolatedPastelsBlocks.GREEN_PLANK_STAIRS,
            DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_STAIRS,
            DesolatedPastelsBlocks.BLUE_PLANK_STAIRS,
            DesolatedPastelsBlocks.PURPLE_PLANK_STAIRS,
            DesolatedPastelsBlocks.MAGENTA_PLANK_STAIRS,
            DesolatedPastelsBlocks.BROWN_PLANK_STAIRS,
            DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_STAIRS,
            DesolatedPastelsBlocks.GRAY_PLANK_STAIRS,
            DesolatedPastelsBlocks.BLACK_PLANK_STAIRS,
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

            DesolatedPastelsBlocks.LIGHT_GREEN_SAPLING,
            DesolatedPastelsBlocks.GREEN_SAPLING,
            DesolatedPastelsBlocks.LIGHT_BLUE_SAPLING,
            DesolatedPastelsBlocks.BLUE_SAPLING,

            DesolatedPastelsItems.MALLARD_SPAWN_EGG_ITEM,
            DesolatedPastelsItems.MALLARD_EGG_ITEM,
            DesolatedPastelsItems.ROTTEN_MALLARD_EGG_ITEM
        )
    }

    private fun addAll(output: Output, vararg items: ItemLike) {
        for (item in items) {
            output.accept(item)
        }
    }
}