package one.devos.nautical.desolatedpastels.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.minecraft.core.HolderLookup
import net.minecraft.world.level.block.Block
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks
import one.devos.nautical.softerpastels.common.SofterPastelsItems
import java.util.concurrent.CompletableFuture

class DesolatedPastelsLootTableProvider(
    dataOutput: FabricDataOutput,
    registryLookup: CompletableFuture<HolderLookup.Provider>
) : FabricBlockLootTableProvider(dataOutput, registryLookup) {
    override fun generate() {
        dropSelf(DesolatedPastelsBlocks.WHITE_LOG)
        dropSelf(DesolatedPastelsBlocks.LIGHT_RED_LOG)
        dropSelf(DesolatedPastelsBlocks.RED_LOG)
        dropSelf(DesolatedPastelsBlocks.ORANGE_LOG)
        dropSelf(DesolatedPastelsBlocks.YELLOW_LOG)
        dropSelf(DesolatedPastelsBlocks.LIGHT_GREEN_LOG)
        dropSelf(DesolatedPastelsBlocks.GREEN_LOG)
        dropSelf(DesolatedPastelsBlocks.LIGHT_BLUE_LOG)
        dropSelf(DesolatedPastelsBlocks.BLUE_LOG)
        dropSelf(DesolatedPastelsBlocks.PURPLE_LOG)
        dropSelf(DesolatedPastelsBlocks.MAGENTA_LOG)
        dropSelf(DesolatedPastelsBlocks.BROWN_LOG)
        dropSelf(DesolatedPastelsBlocks.LIGHT_GRAY_LOG)
        dropSelf(DesolatedPastelsBlocks.GRAY_LOG)
        dropSelf(DesolatedPastelsBlocks.BLACK_LOG)

        dropSelf(DesolatedPastelsBlocks.WHITE_PLANKS)
        dropSelf(DesolatedPastelsBlocks.LIGHT_RED_PLANKS)
        dropSelf(DesolatedPastelsBlocks.RED_PLANKS)
        dropSelf(DesolatedPastelsBlocks.ORANGE_PLANKS)
        dropSelf(DesolatedPastelsBlocks.YELLOW_PLANKS)
        dropSelf(DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS)
        dropSelf(DesolatedPastelsBlocks.GREEN_PLANKS)
        dropSelf(DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS)
        dropSelf(DesolatedPastelsBlocks.BLUE_PLANKS)
        dropSelf(DesolatedPastelsBlocks.PURPLE_PLANKS)
        dropSelf(DesolatedPastelsBlocks.MAGENTA_PLANKS)
        dropSelf(DesolatedPastelsBlocks.BROWN_PLANKS)
        dropSelf(DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS)
        dropSelf(DesolatedPastelsBlocks.GRAY_PLANKS)
        dropSelf(DesolatedPastelsBlocks.BLACK_PLANKS)

        dropSelf(DesolatedPastelsBlocks.WHITE_PLANK_FENCE)
        dropSelf(DesolatedPastelsBlocks.LIGHT_RED_PLANK_FENCE)
        dropSelf(DesolatedPastelsBlocks.RED_PLANK_FENCE)
        dropSelf(DesolatedPastelsBlocks.ORANGE_PLANK_FENCE)
        dropSelf(DesolatedPastelsBlocks.YELLOW_PLANK_FENCE)
        dropSelf(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_FENCE)
        dropSelf(DesolatedPastelsBlocks.GREEN_PLANK_FENCE)
        dropSelf(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_FENCE)
        dropSelf(DesolatedPastelsBlocks.BLUE_PLANK_FENCE)
        dropSelf(DesolatedPastelsBlocks.PURPLE_PLANK_FENCE)
        dropSelf(DesolatedPastelsBlocks.MAGENTA_PLANK_FENCE)
        dropSelf(DesolatedPastelsBlocks.BROWN_PLANK_FENCE)
        dropSelf(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_FENCE)
        dropSelf(DesolatedPastelsBlocks.GRAY_PLANK_FENCE)
        dropSelf(DesolatedPastelsBlocks.BLACK_PLANK_FENCE)

        dropSelf(DesolatedPastelsBlocks.WHITE_PLANK_FENCE_GATE)
        dropSelf(DesolatedPastelsBlocks.LIGHT_RED_PLANK_FENCE_GATE)
        dropSelf(DesolatedPastelsBlocks.RED_PLANK_FENCE_GATE)
        dropSelf(DesolatedPastelsBlocks.ORANGE_PLANK_FENCE_GATE)
        dropSelf(DesolatedPastelsBlocks.YELLOW_PLANK_FENCE_GATE)
        dropSelf(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_FENCE_GATE)
        dropSelf(DesolatedPastelsBlocks.GREEN_PLANK_FENCE_GATE)
        dropSelf(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_FENCE_GATE)
        dropSelf(DesolatedPastelsBlocks.BLUE_PLANK_FENCE_GATE)
        dropSelf(DesolatedPastelsBlocks.PURPLE_PLANK_FENCE_GATE)
        dropSelf(DesolatedPastelsBlocks.MAGENTA_PLANK_FENCE_GATE)
        dropSelf(DesolatedPastelsBlocks.BROWN_PLANK_FENCE_GATE)
        dropSelf(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_FENCE_GATE)
        dropSelf(DesolatedPastelsBlocks.GRAY_PLANK_FENCE_GATE)
        dropSelf(DesolatedPastelsBlocks.BLACK_PLANK_FENCE_GATE)

        dropSelf(DesolatedPastelsBlocks.WHITE_PLANK_SLAB)
        dropSelf(DesolatedPastelsBlocks.LIGHT_RED_PLANK_SLAB)
        dropSelf(DesolatedPastelsBlocks.RED_PLANK_SLAB)
        dropSelf(DesolatedPastelsBlocks.ORANGE_PLANK_SLAB)
        dropSelf(DesolatedPastelsBlocks.YELLOW_PLANK_SLAB)
        dropSelf(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_SLAB)
        dropSelf(DesolatedPastelsBlocks.GREEN_PLANK_SLAB)
        dropSelf(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_SLAB)
        dropSelf(DesolatedPastelsBlocks.BLUE_PLANK_SLAB)
        dropSelf(DesolatedPastelsBlocks.PURPLE_PLANK_SLAB)
        dropSelf(DesolatedPastelsBlocks.MAGENTA_PLANK_SLAB)
        dropSelf(DesolatedPastelsBlocks.BROWN_PLANK_SLAB)
        dropSelf(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_SLAB)
        dropSelf(DesolatedPastelsBlocks.GRAY_PLANK_SLAB)
        dropSelf(DesolatedPastelsBlocks.BLACK_PLANK_SLAB)

        dropSelf(DesolatedPastelsBlocks.WHITE_PLANK_STAIRS)
        dropSelf(DesolatedPastelsBlocks.LIGHT_RED_PLANK_STAIRS)
        dropSelf(DesolatedPastelsBlocks.RED_PLANK_STAIRS)
        dropSelf(DesolatedPastelsBlocks.ORANGE_PLANK_STAIRS)
        dropSelf(DesolatedPastelsBlocks.YELLOW_PLANK_STAIRS)
        dropSelf(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_STAIRS)
        dropSelf(DesolatedPastelsBlocks.GREEN_PLANK_STAIRS)
        dropSelf(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_STAIRS)
        dropSelf(DesolatedPastelsBlocks.BLUE_PLANK_STAIRS)
        dropSelf(DesolatedPastelsBlocks.PURPLE_PLANK_STAIRS)
        dropSelf(DesolatedPastelsBlocks.MAGENTA_PLANK_STAIRS)
        dropSelf(DesolatedPastelsBlocks.BROWN_PLANK_STAIRS)
        dropSelf(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_STAIRS)
        dropSelf(DesolatedPastelsBlocks.GRAY_PLANK_STAIRS)
        dropSelf(DesolatedPastelsBlocks.BLACK_PLANK_STAIRS)

        dropSelf(DesolatedPastelsBlocks.WHITE_PLANK_TRAPDOOR)
        dropSelf(DesolatedPastelsBlocks.LIGHT_RED_PLANK_TRAPDOOR)
        dropSelf(DesolatedPastelsBlocks.RED_PLANK_TRAPDOOR)
        dropSelf(DesolatedPastelsBlocks.ORANGE_PLANK_TRAPDOOR)
        dropSelf(DesolatedPastelsBlocks.YELLOW_PLANK_TRAPDOOR)
        dropSelf(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_TRAPDOOR)
        dropSelf(DesolatedPastelsBlocks.GREEN_PLANK_TRAPDOOR)
        dropSelf(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_TRAPDOOR)
        dropSelf(DesolatedPastelsBlocks.BLUE_PLANK_TRAPDOOR)
        dropSelf(DesolatedPastelsBlocks.PURPLE_PLANK_TRAPDOOR)
        dropSelf(DesolatedPastelsBlocks.MAGENTA_PLANK_TRAPDOOR)
        dropSelf(DesolatedPastelsBlocks.BROWN_PLANK_TRAPDOOR)
        dropSelf(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_TRAPDOOR)
        dropSelf(DesolatedPastelsBlocks.GRAY_PLANK_TRAPDOOR)
        dropSelf(DesolatedPastelsBlocks.BLACK_PLANK_TRAPDOOR)

        add(DesolatedPastelsBlocks.WHITE_PLANK_DOOR) { block: Block -> this.createDoorTable(block) }
        add(DesolatedPastelsBlocks.LIGHT_RED_PLANK_DOOR) { block: Block -> this.createDoorTable(block) }
        add(DesolatedPastelsBlocks.RED_PLANK_DOOR) { block: Block -> this.createDoorTable(block) }
        add(DesolatedPastelsBlocks.ORANGE_PLANK_DOOR) { block: Block -> this.createDoorTable(block) }
        add(DesolatedPastelsBlocks.YELLOW_PLANK_DOOR) { block: Block -> this.createDoorTable(block) }
        add(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_DOOR) { block: Block -> this.createDoorTable(block) }
        add(DesolatedPastelsBlocks.GREEN_PLANK_DOOR) { block: Block -> this.createDoorTable(block) }
        add(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_DOOR) { block: Block -> this.createDoorTable(block) }
        add(DesolatedPastelsBlocks.BLUE_PLANK_DOOR) { block: Block -> this.createDoorTable(block) }
        add(DesolatedPastelsBlocks.PURPLE_PLANK_DOOR) { block: Block -> this.createDoorTable(block) }
        add(DesolatedPastelsBlocks.MAGENTA_PLANK_DOOR) { block: Block -> this.createDoorTable(block) }
        add(DesolatedPastelsBlocks.BROWN_PLANK_DOOR) { block: Block -> this.createDoorTable(block) }
        add(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_DOOR) { block: Block -> this.createDoorTable(block) }
        add(DesolatedPastelsBlocks.GRAY_PLANK_DOOR) { block: Block -> this.createDoorTable(block) }
        add(DesolatedPastelsBlocks.BLACK_PLANK_DOOR) { block: Block -> this.createDoorTable(block) }


        add(DesolatedPastelsBlocks.LIGHT_GREEN_LEAVES) { block: Block ->
            this.createLeavesDrops(
                block,
                DesolatedPastelsBlocks.LIGHT_GREEN_SAPLING,
                *NORMAL_LEAVES_SAPLING_CHANCES
            )
        }

        add(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_GREEN_LEAVES) { block: Block ->
            this.createLeavesDrops(
                block,
                DesolatedPastelsBlocks.LIGHT_GREEN_SAPLING,
                *NORMAL_LEAVES_SAPLING_CHANCES
            )
        }

        add(DesolatedPastelsBlocks.GREEN_LEAVES) { block: Block ->
            this.createLeavesDrops(
                block,
                DesolatedPastelsBlocks.GREEN_SAPLING,
                *NORMAL_LEAVES_SAPLING_CHANCES
            )
        }

        add(DesolatedPastelsBlocks.BRIGHTENED_GREEN_LEAVES) { block: Block ->
            this.createLeavesDrops(
                block,
                DesolatedPastelsBlocks.GREEN_SAPLING,
                *NORMAL_LEAVES_SAPLING_CHANCES
            )
        }
        
        add(DesolatedPastelsBlocks.LIGHT_BLUE_LEAVES) { block: Block ->
            this.createLeavesDrops(
                block,
                DesolatedPastelsBlocks.LIGHT_BLUE_SAPLING,
                *NORMAL_LEAVES_SAPLING_CHANCES
            )
        }
        
        add(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_BLUE_LEAVES) { block: Block ->
            this.createLeavesDrops(
                block,
                DesolatedPastelsBlocks.LIGHT_BLUE_SAPLING,
                *NORMAL_LEAVES_SAPLING_CHANCES
            )
        }
        
        dropSelf(DesolatedPastelsBlocks.LIGHT_GREEN_SAPLING)
        dropSelf(DesolatedPastelsBlocks.GREEN_SAPLING)
        dropSelf(DesolatedPastelsBlocks.LIGHT_BLUE_SAPLING)
        dropSelf(DesolatedPastelsBlocks.BLUE_SAPLING)

        dropPottedContents(DesolatedPastelsBlocks.LIGHT_GREEN_SAPLING_POTTED)
        dropPottedContents(DesolatedPastelsBlocks.GREEN_SAPLING_POTTED)
        dropPottedContents(DesolatedPastelsBlocks.LIGHT_BLUE_SAPLING_POTTED)
        dropPottedContents(DesolatedPastelsBlocks.BLUE_SAPLING_POTTED)

        add(DesolatedPastelsBlocks.PASTEL_ORE) { block: Block ->
            this.createOreDrop(block, SofterPastelsItems.POWDER)
        }

        dropSelf(DesolatedPastelsBlocks.PASTEL_STONE)
        dropSelf(DesolatedPastelsBlocks.PASTEL_DIRT)
        dropSelf(DesolatedPastelsBlocks.PASTEL_SAND)

        add(DesolatedPastelsBlocks.PASTEL_GRASS) { block: Block ->
            this.createSingleItemTableWithSilkTouch(block, DesolatedPastelsBlocks.PASTEL_DIRT)
        }
    }
}