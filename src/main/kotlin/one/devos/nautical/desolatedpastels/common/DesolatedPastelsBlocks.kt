package one.devos.nautical.desolatedpastels.common

import gay.asoji.innerpastels.InnerPastels
import gay.asoji.innerpastels.blocks.Properties
import gay.asoji.innerpastels.blocks.registerBlockWithItem
import gay.asoji.innerpastels.blocks.registerLeavesBlock
import gay.asoji.innerpastels.blocks.registerLogBlock
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.DyeColor
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.LeavesBlock
import net.minecraft.world.level.block.RotatedPillarBlock
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.MapColor
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.DesolatedPastels.LOGGER
import one.devos.nautical.desolatedpastels.DesolatedPastels.MOD_ID


object DesolatedPastelsBlocks {
    @JvmField

    val WHITE_LOG = DyeColor.WHITE.registerLogBlock(MOD_ID, "white_log")
    val LIGHT_RED_LOG = MapColor.COLOR_PINK.registerLogBlock(MOD_ID, "light_red_log")
    val RED_LOG = MapColor.COLOR_RED.registerLogBlock(MOD_ID, "red_log")
    val ORANGE_LOG = MapColor.COLOR_ORANGE.registerLogBlock(MOD_ID, "orange_log")
    val YELLOW_LOG = MapColor.COLOR_YELLOW.registerLogBlock(MOD_ID, "yellow_log")
    val LIGHT_GREEN_LOG = MapColor.COLOR_LIGHT_GREEN.registerLogBlock(MOD_ID, "light_green_log")
    val GREEN_LOG = MapColor.COLOR_GREEN.registerLogBlock(MOD_ID, "green_log")
    val LIGHT_BLUE_LOG = MapColor.COLOR_LIGHT_BLUE.registerLogBlock(MOD_ID, "light_blue_log")
    val BLUE_LOG = MapColor.COLOR_BLUE.registerLogBlock(MOD_ID, "blue_log")
    val PURPLE_LOG = MapColor.COLOR_PURPLE.registerLogBlock(MOD_ID, "purple_log")
    val MAGENTA_LOG = MapColor.COLOR_MAGENTA.registerLogBlock(MOD_ID, "magenta_log")
    val BROWN_LOG = MapColor.COLOR_BROWN.registerLogBlock(MOD_ID, "brown_log")
    val LIGHT_GRAY_LOG = MapColor.COLOR_LIGHT_GRAY.registerLogBlock(MOD_ID, "light_gray_log")
    val GRAY_LOG = MapColor.COLOR_GRAY.registerLogBlock(MOD_ID, "gray_log")
    val BLACK_LOG = MapColor.COLOR_BLACK.registerLogBlock(MOD_ID, "black_log")

    val WHITE_LEAVES: Block = DyeColor.WHITE.registerLeavesBlock(MOD_ID, "white_leaves")
    val LIGHT_RED_LEAVES: Block = MapColor.COLOR_PINK.registerLeavesBlock(MOD_ID, "light_red_leaves")
    val RED_LEAVES: Block = MapColor.COLOR_RED.registerLeavesBlock(MOD_ID, "red_leaves")
    val ORANGE_LEAVES: Block = MapColor.COLOR_ORANGE.registerLeavesBlock(MOD_ID, "orange_leaves")
    val YELLOW_LEAVES: Block = MapColor.COLOR_YELLOW.registerLeavesBlock(MOD_ID, "yellow_leaves")
    val LIGHT_GREEN_LEAVES: Block = MapColor.COLOR_LIGHT_GREEN.registerLeavesBlock(MOD_ID, "light_green_leaves")
    val GREEN_LEAVES: Block = MapColor.COLOR_GREEN.registerLeavesBlock(MOD_ID, "green_leaves")
    val LIGHT_BLUE_LEAVES: Block = MapColor.COLOR_LIGHT_BLUE.registerLeavesBlock(MOD_ID, "light_blue_leaves")
    val BLUE_LEAVES: Block = MapColor.COLOR_BLUE.registerLeavesBlock(MOD_ID, "blue_leaves")
    val PURPLE_LEAVES: Block = MapColor.COLOR_PURPLE.registerLeavesBlock(MOD_ID, "purple_leaves")
    val MAGENTA_LEAVES: Block = MapColor.COLOR_MAGENTA.registerLeavesBlock(MOD_ID, "magenta_leaves")
    val BROWN_LEAVES: Block = MapColor.COLOR_BROWN.registerLeavesBlock(MOD_ID, "brown_leaves")
    val LIGHT_GRAY_LEAVES: Block = MapColor.COLOR_LIGHT_GRAY.registerLeavesBlock(MOD_ID, "light_gray_leaves")
    val GRAY_LEAVES: Block = MapColor.COLOR_GRAY.registerLeavesBlock(MOD_ID, "gray_leaves")
    val BLACK_LEAVES: Block = MapColor.COLOR_BLACK.registerLeavesBlock(MOD_ID, "black_leaves")

    val BRIGHTENED_WHITE_LEAVES: Block = DyeColor.WHITE.registerLeavesBlock(MOD_ID, "brightened_white_leaves")
    val BRIGHTENED_LIGHT_RED_LEAVES: Block = MapColor.COLOR_PINK.registerLeavesBlock(MOD_ID, "brightened_light_red_leaves")
    val BRIGHTENED_RED_LEAVES: Block = MapColor.COLOR_RED.registerLeavesBlock(MOD_ID, "brightened_red_leaves")
    val BRIGHTENED_ORANGE_LEAVES: Block = MapColor.COLOR_ORANGE.registerLeavesBlock(MOD_ID, "brightened_orange_leaves")
    val BRIGHTENED_YELLOW_LEAVES: Block = MapColor.COLOR_YELLOW.registerLeavesBlock(MOD_ID, "brightened_yellow_leaves")
    val BRIGHTENED_LIGHT_GREEN_LEAVES: Block = MapColor.COLOR_LIGHT_GREEN.registerLeavesBlock(MOD_ID, "brightened_light_green_leaves")
    val BRIGHTENED_GREEN_LEAVES: Block = MapColor.COLOR_GREEN.registerLeavesBlock(MOD_ID, "brightened_green_leaves")
    val BRIGHTENED_LIGHT_BLUE_LEAVES: Block = MapColor.COLOR_LIGHT_BLUE.registerLeavesBlock(MOD_ID, "brightened_light_blue_leaves")
    val BRIGHTENED_BLUE_LEAVES: Block = MapColor.COLOR_BLUE.registerLeavesBlock(MOD_ID, "brightened_blue_leaves")
    val BRIGHTENED_PURPLE_LEAVES: Block = MapColor.COLOR_PURPLE.registerLeavesBlock(MOD_ID, "brightened_purple_leaves")
    val BRIGHTENED_MAGENTA_LEAVES: Block = MapColor.COLOR_MAGENTA.registerLeavesBlock(MOD_ID, "brightened_magenta_leaves")
    val BRIGHTENED_BROWN_LEAVES: Block = MapColor.COLOR_BROWN.registerLeavesBlock(MOD_ID, "brightened_brown_leaves")
    val BRIGHTENED_LIGHT_GRAY_LEAVES: Block = MapColor.COLOR_LIGHT_GRAY.registerLeavesBlock(MOD_ID, "brightened_light_gray_leaves")
    val BRIGHTENED_GRAY_LEAVES: Block = MapColor.COLOR_GRAY.registerLeavesBlock(MOD_ID, "brightened_gray_leaves")
    val BRIGHTENED_BLACK_LEAVES: Block = MapColor.COLOR_BLACK.registerLeavesBlock(MOD_ID, "brightened_black_leaves")


    fun registerTempBlock(name: String, block: Block): Block {
        LOGGER.warn("${name.replace("_", " ").replaceFirstChar(Char::uppercaseChar)} is registered as a Temp Block, please make a dedicated register for this block eventually!")
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation(MOD_ID, name), BlockItem(block, Item.Properties()))
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation(MOD_ID, name), block)
    }

    fun init() { }
}