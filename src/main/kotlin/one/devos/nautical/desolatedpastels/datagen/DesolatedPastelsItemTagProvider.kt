package one.devos.nautical.desolatedpastels.datagen

import gay.asoji.innerpastels.tags.InnerPastelsItemTags
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags
import net.minecraft.core.HolderLookup
import net.minecraft.tags.ItemTags
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks
import java.util.concurrent.CompletableFuture

class DesolatedPastelsItemTagProvider(
    output: FabricDataOutput,
    completableFuture: CompletableFuture<HolderLookup.Provider>
) : FabricTagProvider.ItemTagProvider(output, completableFuture) {
    companion object;

    override fun addTags(arg: HolderLookup.Provider) {
        getOrCreateTagBuilder(InnerPastelsItemTags.PLANKS)
            .add(DesolatedPastelsBlocks.WHITE_PLANKS.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_RED_PLANKS.asItem())
            .add(DesolatedPastelsBlocks.RED_PLANKS.asItem())
            .add(DesolatedPastelsBlocks.ORANGE_PLANKS.asItem())
            .add(DesolatedPastelsBlocks.YELLOW_PLANKS.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS.asItem())
            .add(DesolatedPastelsBlocks.GREEN_PLANKS.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS.asItem())
            .add(DesolatedPastelsBlocks.BLUE_PLANKS.asItem())
            .add(DesolatedPastelsBlocks.PURPLE_PLANKS.asItem())
            .add(DesolatedPastelsBlocks.MAGENTA_PLANKS.asItem())
            .add(DesolatedPastelsBlocks.BROWN_PLANKS.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS.asItem())
            .add(DesolatedPastelsBlocks.GRAY_PLANKS.asItem())
            .add(DesolatedPastelsBlocks.BLACK_PLANKS.asItem())
        
        getOrCreateTagBuilder(InnerPastelsItemTags.LEAVES)
            .add(DesolatedPastelsBlocks.WHITE_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_RED_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.RED_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.ORANGE_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.YELLOW_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_GREEN_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.GREEN_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_BLUE_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BLUE_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.PURPLE_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.MAGENTA_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BROWN_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_GRAY_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.GRAY_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BLACK_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BRIGHTENED_WHITE_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_RED_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BRIGHTENED_RED_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BRIGHTENED_ORANGE_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BRIGHTENED_YELLOW_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_GREEN_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BRIGHTENED_GREEN_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_BLUE_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BRIGHTENED_BLUE_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BRIGHTENED_PURPLE_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BRIGHTENED_MAGENTA_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BRIGHTENED_BROWN_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_GRAY_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BRIGHTENED_GRAY_LEAVES.asItem())
            .add(DesolatedPastelsBlocks.BRIGHTENED_BLACK_LEAVES.asItem())
        
        getOrCreateTagBuilder(InnerPastelsItemTags.LOGS)
            .add(DesolatedPastelsBlocks.WHITE_LOG.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_RED_LOG.asItem())
            .add(DesolatedPastelsBlocks.RED_LOG.asItem())
            .add(DesolatedPastelsBlocks.ORANGE_LOG.asItem())
            .add(DesolatedPastelsBlocks.YELLOW_LOG.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_GREEN_LOG.asItem())
            .add(DesolatedPastelsBlocks.GREEN_LOG.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_BLUE_LOG.asItem())
            .add(DesolatedPastelsBlocks.BLUE_LOG.asItem())
            .add(DesolatedPastelsBlocks.PURPLE_LOG.asItem())
            .add(DesolatedPastelsBlocks.MAGENTA_LOG.asItem())
            .add(DesolatedPastelsBlocks.BROWN_LOG.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_GRAY_LOG.asItem())
            .add(DesolatedPastelsBlocks.GRAY_LOG.asItem())
            .add(DesolatedPastelsBlocks.BLACK_LOG.asItem())

        getOrCreateTagBuilder(InnerPastelsItemTags.FENCES)
            .add(DesolatedPastelsBlocks.WHITE_PLANK_FENCE.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_RED_PLANK_FENCE.asItem())
            .add(DesolatedPastelsBlocks.RED_PLANK_FENCE.asItem())
            .add(DesolatedPastelsBlocks.ORANGE_PLANK_FENCE.asItem())
            .add(DesolatedPastelsBlocks.YELLOW_PLANK_FENCE.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_FENCE.asItem())
            .add(DesolatedPastelsBlocks.GREEN_PLANK_FENCE.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_FENCE.asItem())
            .add(DesolatedPastelsBlocks.BLUE_PLANK_FENCE.asItem())
            .add(DesolatedPastelsBlocks.PURPLE_PLANK_FENCE.asItem())
            .add(DesolatedPastelsBlocks.MAGENTA_PLANK_FENCE.asItem())
            .add(DesolatedPastelsBlocks.BROWN_PLANK_FENCE.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_FENCE.asItem())
            .add(DesolatedPastelsBlocks.GRAY_PLANK_FENCE.asItem())
            .add(DesolatedPastelsBlocks.BLACK_PLANK_FENCE.asItem())

        getOrCreateTagBuilder(InnerPastelsItemTags.FENCE_GATES)
            .add(DesolatedPastelsBlocks.WHITE_PLANK_FENCE_GATE.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_RED_PLANK_FENCE_GATE.asItem())
            .add(DesolatedPastelsBlocks.RED_PLANK_FENCE_GATE.asItem())
            .add(DesolatedPastelsBlocks.ORANGE_PLANK_FENCE_GATE.asItem())
            .add(DesolatedPastelsBlocks.YELLOW_PLANK_FENCE_GATE.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_FENCE_GATE.asItem())
            .add(DesolatedPastelsBlocks.GREEN_PLANK_FENCE_GATE.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_FENCE_GATE.asItem())
            .add(DesolatedPastelsBlocks.BLUE_PLANK_FENCE_GATE.asItem())
            .add(DesolatedPastelsBlocks.PURPLE_PLANK_FENCE_GATE.asItem())
            .add(DesolatedPastelsBlocks.MAGENTA_PLANK_FENCE_GATE.asItem())
            .add(DesolatedPastelsBlocks.BROWN_PLANK_FENCE_GATE.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_FENCE_GATE.asItem())
            .add(DesolatedPastelsBlocks.GRAY_PLANK_FENCE_GATE.asItem())
            .add(DesolatedPastelsBlocks.BLACK_PLANK_FENCE_GATE.asItem())

        getOrCreateTagBuilder(InnerPastelsItemTags.SLABS)
            .add(DesolatedPastelsBlocks.WHITE_PLANK_SLAB.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_RED_PLANK_SLAB.asItem())
            .add(DesolatedPastelsBlocks.RED_PLANK_SLAB.asItem())
            .add(DesolatedPastelsBlocks.ORANGE_PLANK_SLAB.asItem())
            .add(DesolatedPastelsBlocks.YELLOW_PLANK_SLAB.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_SLAB.asItem())
            .add(DesolatedPastelsBlocks.GREEN_PLANK_SLAB.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_SLAB.asItem())
            .add(DesolatedPastelsBlocks.BLUE_PLANK_SLAB.asItem())
            .add(DesolatedPastelsBlocks.PURPLE_PLANK_SLAB.asItem())
            .add(DesolatedPastelsBlocks.MAGENTA_PLANK_SLAB.asItem())
            .add(DesolatedPastelsBlocks.BROWN_PLANK_SLAB.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_SLAB.asItem())
            .add(DesolatedPastelsBlocks.GRAY_PLANK_SLAB.asItem())
            .add(DesolatedPastelsBlocks.BLACK_PLANK_SLAB.asItem())

        getOrCreateTagBuilder(InnerPastelsItemTags.STAIRS)
            .add(DesolatedPastelsBlocks.WHITE_PLANK_STAIRS.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_RED_PLANK_STAIRS.asItem())
            .add(DesolatedPastelsBlocks.RED_PLANK_STAIRS.asItem())
            .add(DesolatedPastelsBlocks.ORANGE_PLANK_STAIRS.asItem())
            .add(DesolatedPastelsBlocks.YELLOW_PLANK_STAIRS.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_STAIRS.asItem())
            .add(DesolatedPastelsBlocks.GREEN_PLANK_STAIRS.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_STAIRS.asItem())
            .add(DesolatedPastelsBlocks.BLUE_PLANK_STAIRS.asItem())
            .add(DesolatedPastelsBlocks.PURPLE_PLANK_STAIRS.asItem())
            .add(DesolatedPastelsBlocks.MAGENTA_PLANK_STAIRS.asItem())
            .add(DesolatedPastelsBlocks.BROWN_PLANK_STAIRS.asItem())
            .add(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_STAIRS.asItem())
            .add(DesolatedPastelsBlocks.GRAY_PLANK_STAIRS.asItem())
            .add(DesolatedPastelsBlocks.BLACK_PLANK_STAIRS.asItem())
        
        getOrCreateTagBuilder(ItemTags.LOGS)
            .addTag(InnerPastelsItemTags.LOGS)
        
        getOrCreateTagBuilder(ItemTags.LEAVES)
            .addTag(InnerPastelsItemTags.LEAVES)
        
        getOrCreateTagBuilder(ItemTags.PLANKS)
            .addTag(InnerPastelsItemTags.PLANKS)

        getOrCreateTagBuilder(ItemTags.STAIRS)
            .addTag(InnerPastelsItemTags.STAIRS)

        getOrCreateTagBuilder(ItemTags.SLABS)
            .addTag(InnerPastelsItemTags.SLABS)
        
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
            .addTag(InnerPastelsItemTags.LOGS)

        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
            .add(DesolatedPastelsBlocks.PASTEL_STONE.asItem())

        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS)
            .add(DesolatedPastelsBlocks.PASTEL_STONE.asItem())

        getOrCreateTagBuilder(ConventionalItemTags.COBBLESTONES)
            .add(DesolatedPastelsBlocks.PASTEL_STONE.asItem())

        getOrCreateTagBuilder(ItemTags.SMELTS_TO_GLASS)
            .add(DesolatedPastelsBlocks.PASTEL_SAND.asItem())
    }
}