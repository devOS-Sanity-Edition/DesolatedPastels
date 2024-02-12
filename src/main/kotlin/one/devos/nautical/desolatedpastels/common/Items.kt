package one.devos.nautical.desolatedpastels.common

import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import one.devos.nautical.desolatedpastels.DesolatedPastels

object Items {
    @JvmField
    val TEST_ITEM: Item = registerItem("test_item", Item(Item.Properties()))

    fun registerItem(name: String, item: Item): Item {
        return Registry.register(
            BuiltInRegistries.ITEM, ResourceLocation(DesolatedPastels.MOD_ID, name), item
        )
    }
}