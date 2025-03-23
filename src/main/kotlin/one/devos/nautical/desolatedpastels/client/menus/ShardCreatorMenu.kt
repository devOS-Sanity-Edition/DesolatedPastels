package one.devos.nautical.desolatedpastels.client.menus

import gay.asoji.innerpastels.tags.InnerPastelsItemTags
import net.fabricmc.fabric.api.registry.FuelRegistry
import net.minecraft.world.Container
import net.minecraft.world.SimpleContainer
import net.minecraft.world.entity.player.Inventory
import net.minecraft.world.entity.player.Player
import net.minecraft.world.inventory.*
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.Items
import one.devos.nautical.desolatedpastels.client.menus.slots.DiamondSlot
import one.devos.nautical.desolatedpastels.client.menus.slots.FuelSlot
import one.devos.nautical.desolatedpastels.client.menus.slots.PowderSlot
import one.devos.nautical.desolatedpastels.client.menus.slots.ResultSlot
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsMenus
import one.devos.nautical.softerpastels.common.SofterPastelsItems

class ShardCreatorMenu(
    menuType: MenuType<*>?,
    containerId: Int,
    inventory: Inventory?,
    container: Container,
    containerData: ContainerData
) :
    AbstractContainerMenu(menuType, containerId) {
    private val container: Container
    private val containerData: ContainerData

    init {
        checkContainerSize(container, 8)
        this.container = container
        this.containerData = containerData

        this.addSlot(PowderSlot(container, 0, 8, 16)) // pastel powder slots
        this.addSlot(PowderSlot(container, 1, 8, 34))
        this.addSlot(PowderSlot(container, 2, 8, 52))
        this.addSlot(PowderSlot(container, 3, 26, 25))
        this.addSlot(PowderSlot(container, 4, 26, 43))
        this.addSlot(DiamondSlot(container, 5,  80, 16)) // diamond slot
        this.addSlot(FuelSlot(container, 6, 80, 52)) // fuel slot
        this.addSlot(ResultSlot(container, 7, 152, 34)) // result slot

        this.addDataSlots(containerData)

        for (j in 0..2) {
            for (k in 0..8) {
                this.addSlot(Slot(inventory, k + j * 9 + 9, 8 + k * 18, 84 + j * 18))
            }
        }

        for (j in 0..8) {
            this.addSlot(Slot(inventory, j, 8 + j * 18, 142))
        }
    }

    constructor(containerId: Int, inventory: Inventory) : this(
        DesolatedPastelsMenus.SHARD_CREATOR_MENU_TYPE,
        containerId,
        inventory,
        SimpleContainer(8),
        SimpleContainerData(2)
    )

    override fun quickMoveStack(player: Player, index: Int): ItemStack {
        val powderSlotStart = 0
        val powderSlotEnd = 4
        val diamondSlot = 5
        val fuelSlot = 6
        val resultSlot = 7
        val playerInvStart = resultSlot + 1
        val playerInvEnd = playerInvStart + 36
        var itemStackCopy = ItemStack.EMPTY
        val slot = slots[index]

        if (slot != null && slot.hasItem()) {
            val itemStack = slot.item
            itemStackCopy = itemStack.copy()
            if (index == resultSlot) {
                if (!this.moveItemStackTo(itemStack, playerInvStart, playerInvEnd, true)) {
                    return ItemStack.EMPTY
                }
                slot.onQuickCraft(itemStack, itemStackCopy)
            } else if (index >= playerInvStart && index < playerInvEnd) {
                if (itemStack.`is`(InnerPastelsItemTags.POWDERS)) {
                    if (!this.moveItemStackTo(itemStack, powderSlotStart, powderSlotEnd + 1, false)) {
                        return ItemStack.EMPTY
                    }
                }

                if (itemStack.`is`(Items.DIAMOND)) {
                    if (!this.moveItemStackTo(itemStack, diamondSlot, diamondSlot + 1, false)) {
                        return ItemStack.EMPTY
                    }
                }
                val fuelRegistry = FuelRegistry.INSTANCE.get(itemStack.item)
                if (fuelRegistry != null && fuelRegistry >= 2400 ) {

                    if (!this.moveItemStackTo(itemStack, fuelSlot, fuelSlot + 1, false)) {
                        return ItemStack.EMPTY
                    }
                }
            } else if (!this.moveItemStackTo(itemStack, playerInvStart, playerInvEnd, false)) {
                return ItemStack.EMPTY
            }

            if (itemStack.isEmpty) {
                slot.setByPlayer(ItemStack.EMPTY)
            } else {
                slot.setChanged()
            }

            if (itemStack.count == itemStackCopy.count) {
                return ItemStack.EMPTY
            }

            slot.onTake(player, itemStack)
        }
        return itemStackCopy
    }

    override fun stillValid(player: Player): Boolean {
        return this.container.stillValid(player)
    }


}