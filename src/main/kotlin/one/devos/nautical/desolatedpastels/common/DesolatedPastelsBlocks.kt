package one.devos.nautical.desolatedpastels.common

import gay.asoji.innerpastels.blocks.Properties
import gay.asoji.innerpastels.blocks.registerLogBlock
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.material.MapColor
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.DesolatedPastels.LOGGER
import one.devos.nautical.desolatedpastels.DesolatedPastels.MOD_ID


object DesolatedPastelsBlocks {
    @JvmField
    val LIGHT_GREEN_LOG = MapColor.COLOR_LIGHT_GREEN.registerLogBlock(DesolatedPastels.MOD_ID, "light_green_log")

    val LIGHT_GREEN_LEAVES: Block = registerTempBlock("light_green_leaves", Properties.PastelLeaves())

    fun registerTempBlock(name: String, block: Block): Block {
        LOGGER.debug("$this is registered as a Temp Block, please make a dedicated register for this block eventually!")
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation(MOD_ID, name), BlockItem(block, Item.Properties()))
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation(MOD_ID, name), block)

    }
    fun init() {}
}