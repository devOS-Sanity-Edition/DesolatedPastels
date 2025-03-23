package one.devos.nautical.desolatedpastels.common.blocks.entities.shardcreator

import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.core.HolderLookup
import net.minecraft.core.NonNullList
import net.minecraft.nbt.CompoundTag
import net.minecraft.network.chat.Component
import net.minecraft.world.ContainerHelper
import net.minecraft.world.WorldlyContainer
import net.minecraft.world.entity.player.Inventory
import net.minecraft.world.inventory.AbstractContainerMenu
import net.minecraft.world.inventory.ContainerData
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity
import net.minecraft.world.level.block.state.BlockState
import one.devos.nautical.desolatedpastels.client.menus.ShardCreatorMenu
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlockEntities
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsMenus
import kotlin.properties.Delegates


class ShardCreatorBlockEntity(pos: BlockPos, blockState: BlockState) :
    BaseContainerBlockEntity(DesolatedPastelsBlockEntities.SHARD_CREATOR, pos, blockState), WorldlyContainer {

    private var items: NonNullList<ItemStack>? = null
    protected val containerData: ContainerData
    var fuel: Int = 0
    var recipeCompletionTime: Int = 0

    init {
        this.items = NonNullList.withSize(8, ItemStack.EMPTY)
        this.containerData = object : ContainerData {
            override fun get(i: Int): Int {
                val data = when (i) {
                    0 -> this@ShardCreatorBlockEntity.fuel
                    1 -> this@ShardCreatorBlockEntity.recipeCompletionTime
                    else -> 0
                }
                return data
            }

            override fun set(i: Int, j: Int) {
                when (i) {
                    0 -> this@ShardCreatorBlockEntity.fuel = j
                    1 -> this@ShardCreatorBlockEntity.recipeCompletionTime = j
                }
            }

            override fun getCount(): Int {
                return 2
            }
        }
    }

    override fun saveAdditional(tag: CompoundTag, registries: HolderLookup.Provider) {
        super.saveAdditional(tag, registries)

        ContainerHelper.saveAllItems(tag, this.items!!, registries)
    }

    override fun loadAdditional(tag: CompoundTag, registries: HolderLookup.Provider) {
        super.loadAdditional(tag, registries)

        ContainerHelper.loadAllItems(tag, this.items!!, registries)
    }

    override fun getContainerSize(): Int {
        return this.items!!.size
    }

    override fun getSlotsForFace(side: Direction): IntArray {
        return IntArray(0)
    }

    override fun canPlaceItemThroughFace(index: Int, itemStack: ItemStack, direction: Direction?): Boolean {
        return false
    }

    override fun canTakeItemThroughFace(index: Int, stack: ItemStack, direction: Direction): Boolean {
        return false
    }

    override fun createMenu(containerId: Int, inventory: Inventory): AbstractContainerMenu {
        return ShardCreatorMenu(DesolatedPastelsMenus.SHARD_CREATOR_MENU_TYPE, containerId, inventory, this, this.containerData)
    }

    override fun getDefaultName(): Component {
        return Component.translatable("desolatedpastels.container.shardcreator")
    }

    override fun getItems(): NonNullList<ItemStack>? {
        return this.items
    }

    override fun setItems(items: NonNullList<ItemStack>) {
        this.items = items
    }

    companion object {
        fun serverTick(level: Level, blockPos: BlockPos?, blockState: BlockState, shardCreatorBlockEntity: ShardCreatorBlockEntity) {

        }
    }
}