package one.devos.nautical.desolatedpastels.datagen

import com.jcraft.jorbis.Block
import gay.asoji.innerpastels.tags.InnerPastelsBlockTags
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags
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

        getOrCreateTagBuilder(InnerPastelsBlockTags.FENCES)
            .add(DesolatedPastelsBlocks.WHITE_PLANK_FENCE)
            .add(DesolatedPastelsBlocks.LIGHT_RED_PLANK_FENCE)
            .add(DesolatedPastelsBlocks.RED_PLANK_FENCE)
            .add(DesolatedPastelsBlocks.ORANGE_PLANK_FENCE)
            .add(DesolatedPastelsBlocks.YELLOW_PLANK_FENCE)
            .add(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_FENCE)
            .add(DesolatedPastelsBlocks.GREEN_PLANK_FENCE)
            .add(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_FENCE)
            .add(DesolatedPastelsBlocks.BLUE_PLANK_FENCE)
            .add(DesolatedPastelsBlocks.PURPLE_PLANK_FENCE)
            .add(DesolatedPastelsBlocks.MAGENTA_PLANK_FENCE)
            .add(DesolatedPastelsBlocks.BROWN_PLANK_FENCE)
            .add(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_FENCE)
            .add(DesolatedPastelsBlocks.GRAY_PLANK_FENCE)
            .add(DesolatedPastelsBlocks.BLACK_PLANK_FENCE)

        getOrCreateTagBuilder(InnerPastelsBlockTags.FENCE_GATES)
            .add(DesolatedPastelsBlocks.WHITE_PLANK_FENCE_GATE)
            .add(DesolatedPastelsBlocks.LIGHT_RED_PLANK_FENCE_GATE)
            .add(DesolatedPastelsBlocks.RED_PLANK_FENCE_GATE)
            .add(DesolatedPastelsBlocks.ORANGE_PLANK_FENCE_GATE)
            .add(DesolatedPastelsBlocks.YELLOW_PLANK_FENCE_GATE)
            .add(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_FENCE_GATE)
            .add(DesolatedPastelsBlocks.GREEN_PLANK_FENCE_GATE)
            .add(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_FENCE_GATE)
            .add(DesolatedPastelsBlocks.BLUE_PLANK_FENCE_GATE)
            .add(DesolatedPastelsBlocks.PURPLE_PLANK_FENCE_GATE)
            .add(DesolatedPastelsBlocks.MAGENTA_PLANK_FENCE_GATE)
            .add(DesolatedPastelsBlocks.BROWN_PLANK_FENCE_GATE)
            .add(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_FENCE_GATE)
            .add(DesolatedPastelsBlocks.GRAY_PLANK_FENCE_GATE)
            .add(DesolatedPastelsBlocks.BLACK_PLANK_FENCE_GATE)

        getOrCreateTagBuilder(BlockTags.LEAVES)
            .addTag(InnerPastelsBlockTags.LEAVES)

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_HOE)
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

        getOrCreateTagBuilder(BlockTags.ANIMALS_SPAWNABLE_ON)
            .add(DesolatedPastelsBlocks.PASTEL_DIRT)
            .add(DesolatedPastelsBlocks.PASTEL_GRASS)

        getOrCreateTagBuilder(BlockTags.SNIFFER_DIGGABLE_BLOCK)
            .add(DesolatedPastelsBlocks.PASTEL_DIRT)
            .add(DesolatedPastelsBlocks.PASTEL_GRASS)

        getOrCreateTagBuilder(BlockTags.REPLACEABLE_BY_TREES)
            .add(DesolatedPastelsBlocks.PASTEL_GRASS)
            .add(DesolatedPastelsBlocks.PASTEL_DIRT)

        getOrCreateTagBuilder(BlockTags.PLANKS)
            .add(DesolatedPastelsBlocks.WHITE_PLANKS)
            .add(DesolatedPastelsBlocks.LIGHT_RED_PLANKS)
            .add(DesolatedPastelsBlocks.RED_PLANKS)
            .add(DesolatedPastelsBlocks.ORANGE_PLANKS)
            .add(DesolatedPastelsBlocks.YELLOW_PLANKS)
            .add(DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS)
            .add(DesolatedPastelsBlocks.GREEN_PLANKS)
            .add(DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS)
            .add(DesolatedPastelsBlocks.BLUE_PLANKS)
            .add(DesolatedPastelsBlocks.PURPLE_PLANKS)
            .add(DesolatedPastelsBlocks.MAGENTA_PLANKS)
            .add(DesolatedPastelsBlocks.BROWN_PLANKS)
            .add(DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS)
            .add(DesolatedPastelsBlocks.GRAY_PLANKS)
            .add(DesolatedPastelsBlocks.BLACK_PLANKS)

        getOrCreateTagBuilder(InnerPastelsBlockTags.STAIRS)
            .add(DesolatedPastelsBlocks.WHITE_PLANK_STAIRS)
            .add(DesolatedPastelsBlocks.LIGHT_RED_PLANK_STAIRS)
            .add(DesolatedPastelsBlocks.RED_PLANK_STAIRS)
            .add(DesolatedPastelsBlocks.ORANGE_PLANK_STAIRS)
            .add(DesolatedPastelsBlocks.YELLOW_PLANK_STAIRS)
            .add(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_STAIRS)
            .add(DesolatedPastelsBlocks.GREEN_PLANK_STAIRS)
            .add(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_STAIRS)
            .add(DesolatedPastelsBlocks.BLUE_PLANK_STAIRS)
            .add(DesolatedPastelsBlocks.PURPLE_PLANK_STAIRS)
            .add(DesolatedPastelsBlocks.MAGENTA_PLANK_STAIRS)
            .add(DesolatedPastelsBlocks.BROWN_PLANK_STAIRS)
            .add(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_STAIRS)
            .add(DesolatedPastelsBlocks.GRAY_PLANK_STAIRS)
            .add(DesolatedPastelsBlocks.BLACK_PLANK_STAIRS)

        getOrCreateTagBuilder(InnerPastelsBlockTags.SLABS)
            .add(DesolatedPastelsBlocks.WHITE_PLANK_SLAB)
            .add(DesolatedPastelsBlocks.LIGHT_RED_PLANK_SLAB)
            .add(DesolatedPastelsBlocks.RED_PLANK_SLAB)
            .add(DesolatedPastelsBlocks.ORANGE_PLANK_SLAB)
            .add(DesolatedPastelsBlocks.YELLOW_PLANK_SLAB)
            .add(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_SLAB)
            .add(DesolatedPastelsBlocks.GREEN_PLANK_SLAB)
            .add(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_SLAB)
            .add(DesolatedPastelsBlocks.BLUE_PLANK_SLAB)
            .add(DesolatedPastelsBlocks.PURPLE_PLANK_SLAB)
            .add(DesolatedPastelsBlocks.MAGENTA_PLANK_SLAB)
            .add(DesolatedPastelsBlocks.BROWN_PLANK_SLAB)
            .add(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_SLAB)
            .add(DesolatedPastelsBlocks.GRAY_PLANK_SLAB)
            .add(DesolatedPastelsBlocks.BLACK_PLANK_SLAB)

        getOrCreateTagBuilder(ConventionalBlockTags.STONES)
            .add(DesolatedPastelsBlocks.PASTEL_STONE)

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(DesolatedPastelsBlocks.PASTEL_STONE)

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(DesolatedPastelsBlocks.PASTEL_ORE)

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
            .addTag(InnerPastelsBlockTags.FENCE_GATES)

        getOrCreateTagBuilder(BlockTags.FENCES)
            .addTag(InnerPastelsBlockTags.FENCES)

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
            .addTag(InnerPastelsBlockTags.FENCES)
            .addTag(InnerPastelsBlockTags.FENCE_GATES)
            .addTag(InnerPastelsBlockTags.STAIRS)
            .addTag(InnerPastelsBlockTags.SLABS)

        getOrCreateTagBuilder(BlockTags.SLABS)
            .addTag(InnerPastelsBlockTags.SLABS)

        getOrCreateTagBuilder(BlockTags.STAIRS)
            .addTag(InnerPastelsBlockTags.STAIRS)

        getOrCreateTagBuilder(BlockTags.SMELTS_TO_GLASS)
            .add(DesolatedPastelsBlocks.PASTEL_SAND)
    }
}