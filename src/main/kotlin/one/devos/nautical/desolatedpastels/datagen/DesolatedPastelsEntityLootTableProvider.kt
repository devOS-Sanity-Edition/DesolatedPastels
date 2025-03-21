package one.devos.nautical.desolatedpastels.datagen

import gay.asoji.innerpastels.datagen.FabricEntityLootTableProvider
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.minecraft.core.HolderLookup
import net.minecraft.world.item.Items
import net.minecraft.world.level.storage.loot.LootPool
import net.minecraft.world.level.storage.loot.LootTable
import net.minecraft.world.level.storage.loot.entries.LootItem
import net.minecraft.world.level.storage.loot.functions.EnchantedCountIncreaseFunction
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction
import net.minecraft.world.level.storage.loot.functions.SmeltItemFunction
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsEntities
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsItems
import one.devos.nautical.softerpastels.common.SofterPastelsItems
import java.util.concurrent.CompletableFuture

class DesolatedPastelsEntityLootTableProvider(
    dataOutput: FabricDataOutput,
    registryLookup: CompletableFuture<HolderLookup.Provider>
) : FabricEntityLootTableProvider(dataOutput, registryLookup) {
    override fun generate() {
        this.add(
            DesolatedPastelsEntities.MALLARD_ENTITY,
            LootTable.lootTable()
                .withPool(
                    LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0f))
                        .add(
                            LootItem.lootTableItem(Items.FEATHER)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0f, 2.0f)))
                                .apply(
                                    EnchantedCountIncreaseFunction.lootingMultiplier(
                                        this.registries,
                                        UniformGenerator.between(0.0f, 1.0f)
                                    )
                                )
                        )
                )
                .withPool(
                    LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0f))
                        .add(
                            LootItem.lootTableItem(DesolatedPastelsItems.RAW_MALLARD)
                                .apply(SmeltItemFunction.smelted().`when`(this.shouldSmeltLoot()))
                                .apply(
                                    EnchantedCountIncreaseFunction.lootingMultiplier(
                                        this.registries,
                                        UniformGenerator.between(0.0f, 1.0f)
                                    )
                                )
                        )
                )
        )

        this.add(
            DesolatedPastelsEntities.PASTELMON_ENTITY,
            LootTable.lootTable()
                .withPool(
                    LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0f))
                        .add(
                            LootItem.lootTableItem(DesolatedPastelsItems.RAW_PASTELMON)
                                .apply(SmeltItemFunction.smelted().`when`(this.shouldSmeltLoot()))
                        )
                )
                .withPool(
                    LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0f))
                        .add(LootItem.lootTableItem(SofterPastelsItems.RED_POWDER))
                        .`when`(LootItemRandomChanceCondition.randomChance(0.05f))
                )
        )
    }
}