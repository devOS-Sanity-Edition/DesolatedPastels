package one.devos.nautical.desolatedpastels.common

import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import one.devos.nautical.desolatedpastels.DesolatedPastels.Companion.MOD_ID
import one.devos.nautical.desolatedpastels.utils.BlockUtils.Logs


object Blocks {
    @JvmField
    val LOG = registerBlock("log", Logs())

    fun registerBlock(name: String?, block: Block): Block? {
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation(MOD_ID, name), BlockItem(block, Item.Properties()))
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation(MOD_ID, name), block)
    }

    fun init() { }
}