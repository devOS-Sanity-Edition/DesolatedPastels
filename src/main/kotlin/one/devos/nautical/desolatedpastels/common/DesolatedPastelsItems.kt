package one.devos.nautical.desolatedpastels.common

import gay.asoji.innerpastels.register.RegisterItems.registerItem
import net.fabricmc.fabric.api.loot.v3.LootTableEvents
import net.minecraft.world.item.Item
import net.minecraft.world.item.SpawnEggItem
import net.minecraft.world.level.storage.loot.BuiltInLootTables
import net.minecraft.world.level.storage.loot.entries.LootItem
import one.devos.nautical.desolatedpastels.DesolatedPastels


object DesolatedPastelsItems {
    @JvmField
    val TEST_ITEM: Item = registerItem(DesolatedPastels.MOD_ID, "test_item", Item(Item.Properties()))
    val MALLARD_SPAWN_EGG_ITEM: Item = registerItem(DesolatedPastels.MOD_ID, "mallard_spawn_egg", SpawnEggItem(DesolatedPastels.MALLARD_ENTITY, 0xdad1ca, 0x22af6a, Item.Properties()))
    
//    fun registerItem(name: String, item: Item): Item {
//        return Registry.register(
//            BuiltInRegistries.ITEM, ResourceLocation(DesolatedPastels.MOD_ID, name), item
//        )
//    }

    fun init() {
        LootTableEvents.MODIFY.register { key, builder, source, registries ->
            if (key === BuiltInLootTables.SNIFFER_DIGGING && source.isBuiltin) {
                builder.modifyPools { 
                    pool -> run {
                        pool.add(LootItem.lootTableItem(DesolatedPastelsBlocks.LIGHT_BLUE_SAPLING))
                        pool.add(LootItem.lootTableItem(DesolatedPastelsBlocks.LIGHT_GREEN_SAPLING))
                    }
                }
            }
        }
    }
}