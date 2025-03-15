package one.devos.nautical.desolatedpastels.datagen

import gay.asoji.innerpastels.tags.InnerPastelsItemTags
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags
import net.minecraft.core.HolderLookup
import net.minecraft.tags.ItemTags
import net.minecraft.tags.TagKey
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
        
        getOrCreateTagBuilder(ItemTags.LOGS)
            .addTag(InnerPastelsItemTags.LOGS)
        
        getOrCreateTagBuilder(ItemTags.LEAVES)
            .addTag(InnerPastelsItemTags.LEAVES)
        
        getOrCreateTagBuilder(ItemTags.PLANKS)
            .addTag(InnerPastelsItemTags.PLANKS)
        
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
            .addTag(InnerPastelsItemTags.LOGS)

        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
            .add(DesolatedPastelsBlocks.PASTEL_STONE.asItem())

        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS)
            .add(DesolatedPastelsBlocks.PASTEL_STONE.asItem())

        getOrCreateTagBuilder(ConventionalItemTags.COBBLESTONES)
            .add(DesolatedPastelsBlocks.PASTEL_STONE.asItem())
    }
}