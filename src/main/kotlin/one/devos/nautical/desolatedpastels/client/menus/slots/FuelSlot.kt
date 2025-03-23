package one.devos.nautical.desolatedpastels.client.menus.slots

import net.fabricmc.fabric.api.registry.FuelRegistry
import net.minecraft.tags.ItemTags
import net.minecraft.world.Container
import net.minecraft.world.inventory.Slot
import net.minecraft.world.item.ItemStack

class FuelSlot(container: Container, slot: Int, x: Int, y: Int) : Slot(container, slot, x, y) {
    override fun mayPlace(stack: ItemStack): Boolean {
        return FuelRegistry.INSTANCE.get(stack.item) >= 2400
    }
}