package one.devos.nautical.desolatedpastels.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.Registries
import net.minecraft.world.item.Items
import net.minecraft.world.item.enchantment.Enchantments
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.storage.loot.LootPool
import net.minecraft.world.level.storage.loot.LootTable
import net.minecraft.world.level.storage.loot.entries.LootItem
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue
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

        add(DesolatedPastelsBlocks.LIGHT_BLUE_LEAVES) { block: Block ->
            this.createLeavesDrops(
                block,
                DesolatedPastelsBlocks.LIGHT_BLUE_SAPLING,
                *NORMAL_LEAVES_SAPLING_CHANCES
            )
        }

        add(DesolatedPastelsBlocks.LIGHT_GREEN_LEAVES) { block: Block ->
            this.createLeavesDrops(
                block,
                DesolatedPastelsBlocks.LIGHT_GREEN_SAPLING,
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
        
        add(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_GREEN_LEAVES) { block: Block ->
            this.createLeavesDrops(
                block,
                DesolatedPastelsBlocks.LIGHT_GREEN_SAPLING,
                *NORMAL_LEAVES_SAPLING_CHANCES
            )
        }

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