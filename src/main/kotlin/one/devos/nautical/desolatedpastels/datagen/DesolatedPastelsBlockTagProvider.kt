package one.devos.nautical.desolatedpastels.datagen

import gay.asoji.innerpastels.tags.InnerPastelsBlockTags
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.tags.BlockTags
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks
import java.util.concurrent.CompletableFuture

class DesolatedPastelsBlockTagProvider(
    output: FabricDataOutput,
    registriesFuture: CompletableFuture<HolderLookup.Provider>
) : FabricTagProvider.BlockTagProvider(output, registriesFuture) {
    override fun addTags(arg: HolderLookup.Provider) {
        getOrCreateTagBuilder(InnerPastelsBlockTags.LOGS)
            .add(DesolatedPastelsBlocks.WHITE_LOG)
            .add(DesolatedPastelsBlocks.LIGHT_RED_LOG)
            .add(DesolatedPastelsBlocks.RED_LOG)
            .add(DesolatedPastelsBlocks.ORANGE_LOG)
            .add(DesolatedPastelsBlocks.YELLOW_LOG)
            .add(DesolatedPastelsBlocks.LIGHT_GREEN_LOG)
            .add(DesolatedPastelsBlocks.GREEN_LOG)
            .add(DesolatedPastelsBlocks.LIGHT_BLUE_LOG)
            .add(DesolatedPastelsBlocks.BLUE_LOG)
            .add(DesolatedPastelsBlocks.PURPLE_LOG)
            .add(DesolatedPastelsBlocks.MAGENTA_LOG)
            .add(DesolatedPastelsBlocks.BROWN_LOG)
            .add(DesolatedPastelsBlocks.LIGHT_GRAY_LOG)
            .add(DesolatedPastelsBlocks.GRAY_LOG)
            .add(DesolatedPastelsBlocks.BLACK_LOG)

        getOrCreateTagBuilder(InnerPastelsBlockTags.LEAVES)
            .add(DesolatedPastelsBlocks.WHITE_LEAVES)
            .add(DesolatedPastelsBlocks.LIGHT_RED_LEAVES)
            .add(DesolatedPastelsBlocks.RED_LEAVES)
            .add(DesolatedPastelsBlocks.ORANGE_LEAVES)
            .add(DesolatedPastelsBlocks.YELLOW_LEAVES)
            .add(DesolatedPastelsBlocks.LIGHT_GREEN_LEAVES)
            .add(DesolatedPastelsBlocks.GREEN_LEAVES)
            .add(DesolatedPastelsBlocks.LIGHT_BLUE_LEAVES)
            .add(DesolatedPastelsBlocks.BLUE_LEAVES)
            .add(DesolatedPastelsBlocks.PURPLE_LEAVES)
            .add(DesolatedPastelsBlocks.MAGENTA_LEAVES)
            .add(DesolatedPastelsBlocks.BROWN_LEAVES)
            .add(DesolatedPastelsBlocks.LIGHT_GRAY_LEAVES)
            .add(DesolatedPastelsBlocks.GRAY_LEAVES)
            .add(DesolatedPastelsBlocks.BLACK_LEAVES)
            .add(DesolatedPastelsBlocks.BRIGHTENED_WHITE_LEAVES)
            .add(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_RED_LEAVES)
            .add(DesolatedPastelsBlocks.BRIGHTENED_RED_LEAVES)
            .add(DesolatedPastelsBlocks.BRIGHTENED_ORANGE_LEAVES)
            .add(DesolatedPastelsBlocks.BRIGHTENED_YELLOW_LEAVES)
            .add(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_GREEN_LEAVES)
            .add(DesolatedPastelsBlocks.BRIGHTENED_GREEN_LEAVES)
            .add(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_BLUE_LEAVES)
            .add(DesolatedPastelsBlocks.BRIGHTENED_BLUE_LEAVES)
            .add(DesolatedPastelsBlocks.BRIGHTENED_PURPLE_LEAVES)
            .add(DesolatedPastelsBlocks.BRIGHTENED_MAGENTA_LEAVES)
            .add(DesolatedPastelsBlocks.BRIGHTENED_BROWN_LEAVES)
            .add(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_GRAY_LEAVES)
            .add(DesolatedPastelsBlocks.BRIGHTENED_GRAY_LEAVES)
            .add(DesolatedPastelsBlocks.BRIGHTENED_BLACK_LEAVES)

        getOrCreateTagBuilder(BlockTags.LEAVES)
            .addTag(InnerPastelsBlockTags.LEAVES)

        getOrCreateTagBuilder(BlockTags.LOGS)
            .addTag(InnerPastelsBlockTags.LOGS)

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
            .addTag(InnerPastelsBlockTags.LOGS)

        getOrCreateTagBuilder(InnerPastelsBlockTags.ORES)
            .add(DesolatedPastelsBlocks.PASTEL_ORE)

        getOrCreateTagBuilder(BlockTags.DIRT)
            .add(DesolatedPastelsBlocks.PASTEL_DIRT)
            .add(DesolatedPastelsBlocks.PASTEL_GRASS)
    }
}