package one.devos.nautical.desolatedpastels.client.menus.slots

import gay.asoji.innerpastels.tags.InnerPastelsItemTags
import net.minecraft.world.Container
import net.minecraft.world.inventory.Slot
import net.minecraft.world.item.ItemStack

class PowderSlot(container: Container, slot: Int, x: Int, y: Int) : Slot(container, slot, x, y) {
    override fun mayPlace(stack: ItemStack): Boolean {
        return stack.`is`(InnerPastelsItemTags.POWDERS)
    }
}