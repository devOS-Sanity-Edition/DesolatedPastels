package one.devos.nautical.desolatedpastels.common

import gay.asoji.innerpastels.register.RegisterItems.registerItem
import net.minecraft.world.item.Item
import net.minecraft.world.item.SpawnEggItem
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

    fun init() {}
}