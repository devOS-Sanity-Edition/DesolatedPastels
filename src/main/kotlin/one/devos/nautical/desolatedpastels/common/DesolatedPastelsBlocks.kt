package one.devos.nautical.desolatedpastels.common

import gay.asoji.innerpastels.blocks.Properties
import gay.asoji.innerpastels.blocks.Properties.pastelDirt
import gay.asoji.innerpastels.blocks.Properties.pastelGrass
import gay.asoji.innerpastels.register.*
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.util.ColorRGBA
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.DyeColor
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.FlowerPotBlock
import net.minecraft.world.level.block.LeavesBlock
import net.minecraft.world.level.block.SaplingBlock
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.MapColor
import net.minecraft.world.level.material.PushReaction
import one.devos.nautical.desolatedpastels.DesolatedPastels.LOGGER
import one.devos.nautical.desolatedpastels.DesolatedPastels.MOD_ID
import one.devos.nautical.desolatedpastels.common.blocks.PastelGrassBlock
import one.devos.nautical.desolatedpastels.world.DesolatedPastelsSaplingGenerators


object DesolatedPastelsBlocks {
    @JvmField

    // val GRASS_BLOCK = registerTempBlock("grass_block", GrassBlock()) // i am forgetting things

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

    val WHITE_LEAVES: Block = DyeColor.WHITE.registerLeavesBlock(MOD_ID, "white_leaves", Blocks::never)
    val LIGHT_RED_LEAVES: Block = MapColor.COLOR_PINK.registerLeavesBlock(MOD_ID, "light_red_leaves", Blocks::never)
    val RED_LEAVES: Block = MapColor.COLOR_RED.registerLeavesBlock(MOD_ID, "red_leaves", Blocks::never)
    val ORANGE_LEAVES: Block = MapColor.COLOR_ORANGE.registerLeavesBlock(MOD_ID, "orange_leaves", Blocks::never)
    val YELLOW_LEAVES: Block = MapColor.COLOR_YELLOW.registerLeavesBlock(MOD_ID, "yellow_leaves", Blocks::never)
    val LIGHT_GREEN_LEAVES: Block = MapColor.COLOR_LIGHT_GREEN.registerLeavesBlock(MOD_ID, "light_green_leaves", Blocks::never)
    val GREEN_LEAVES: Block = MapColor.COLOR_GREEN.registerLeavesBlock(MOD_ID, "green_leaves", Blocks::never)
    val LIGHT_BLUE_LEAVES: Block = MapColor.COLOR_LIGHT_BLUE.registerLeavesBlock(MOD_ID, "light_blue_leaves", Blocks::never)
    val BLUE_LEAVES: Block = MapColor.COLOR_BLUE.registerLeavesBlock(MOD_ID, "blue_leaves", Blocks::never)
    val PURPLE_LEAVES: Block = MapColor.COLOR_PURPLE.registerLeavesBlock(MOD_ID, "purple_leaves", Blocks::never)
    val MAGENTA_LEAVES: Block = MapColor.COLOR_MAGENTA.registerLeavesBlock(MOD_ID, "magenta_leaves", Blocks::never)
    val BROWN_LEAVES: Block = MapColor.COLOR_BROWN.registerLeavesBlock(MOD_ID, "brown_leaves", Blocks::never)
    val LIGHT_GRAY_LEAVES: Block = MapColor.COLOR_LIGHT_GRAY.registerLeavesBlock(MOD_ID, "light_gray_leaves", Blocks::never)
    val GRAY_LEAVES: Block = MapColor.COLOR_GRAY.registerLeavesBlock(MOD_ID, "gray_leaves", Blocks::never)
    val BLACK_LEAVES: Block = MapColor.COLOR_BLACK.registerLeavesBlock(MOD_ID, "black_leaves", Blocks::never)

    val BRIGHTENED_WHITE_LEAVES: Block = DyeColor.WHITE.registerTempLeavesBlock(MOD_ID, "brightened_white_leaves", Blocks::always)
    val BRIGHTENED_LIGHT_RED_LEAVES: Block = MapColor.COLOR_PINK.registerTempLeavesBlock(MOD_ID, "brightened_light_red_leaves", Blocks::always)
    val BRIGHTENED_RED_LEAVES: Block = MapColor.COLOR_RED.registerTempLeavesBlock(MOD_ID, "brightened_red_leaves", Blocks::always)
    val BRIGHTENED_ORANGE_LEAVES: Block = MapColor.COLOR_ORANGE.registerTempLeavesBlock(MOD_ID, "brightened_orange_leaves", Blocks::always)
    val BRIGHTENED_YELLOW_LEAVES: Block = MapColor.COLOR_YELLOW.registerTempLeavesBlock(MOD_ID, "brightened_yellow_leaves", Blocks::always)
    val BRIGHTENED_LIGHT_GREEN_LEAVES: Block = MapColor.COLOR_LIGHT_GREEN.registerTempLeavesBlock(MOD_ID, "brightened_light_green_leaves", Blocks::always)
    val BRIGHTENED_GREEN_LEAVES: Block = MapColor.COLOR_GREEN.registerTempLeavesBlock(MOD_ID, "brightened_green_leaves", Blocks::always)
    val BRIGHTENED_LIGHT_BLUE_LEAVES: Block = MapColor.COLOR_LIGHT_BLUE.registerTempLeavesBlock(MOD_ID, "brightened_light_blue_leaves", Blocks::always)
    val BRIGHTENED_BLUE_LEAVES: Block = MapColor.COLOR_BLUE.registerTempLeavesBlock(MOD_ID, "brightened_blue_leaves", Blocks::always)
    val BRIGHTENED_PURPLE_LEAVES: Block = MapColor.COLOR_PURPLE.registerTempLeavesBlock(MOD_ID, "brightened_purple_leaves", Blocks::always)
    val BRIGHTENED_MAGENTA_LEAVES: Block = MapColor.COLOR_MAGENTA.registerTempLeavesBlock(MOD_ID, "brightened_magenta_leaves", Blocks::always)
    val BRIGHTENED_BROWN_LEAVES: Block = MapColor.COLOR_BROWN.registerTempLeavesBlock(MOD_ID, "brightened_brown_leaves", Blocks::always)
    val BRIGHTENED_LIGHT_GRAY_LEAVES: Block = MapColor.COLOR_LIGHT_GRAY.registerTempLeavesBlock(MOD_ID, "brightened_light_gray_leaves", Blocks::always)
    val BRIGHTENED_GRAY_LEAVES: Block = MapColor.COLOR_GRAY.registerTempLeavesBlock(MOD_ID, "brightened_gray_leaves", Blocks::always)
    val BRIGHTENED_BLACK_LEAVES: Block = MapColor.COLOR_BLACK.registerTempLeavesBlock(MOD_ID, "brightened_black_leaves", Blocks::always)

    val PASTEL_ORE: Block = MapColor.COLOR_GRAY.registerOreBlock(MOD_ID, "pastel_ore")
    val PASTEL_STONE: Block = MapColor.COLOR_GRAY.registerStoneBlock(MOD_ID, "pastel_stone")
    val PASTEL_DIRT: Block = MapColor.COLOR_BROWN.registerDirtBlock(MOD_ID, "pastel_dirt")
    val PASTEL_GRASS: Block = MapColor.COLOR_LIGHT_GREEN.registerGrassBlock(MOD_ID, "pastel_grass")
    val PASTEL_SAND: Block = MapColor.COLOR_YELLOW.registerSandBlock(MOD_ID, "pastel_sand", ColorRGBA(14997396))
    
    val LIGHT_BLUE_SAPLING: Block = MapColor.COLOR_LIGHT_BLUE.registerSaplingBlock(
        "light_blue_sapling", SaplingBlock(DesolatedPastelsSaplingGenerators.LIGHT_BLUE_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING))
    )
    val LIGHT_GREEN_SAPLING: Block = MapColor.COLOR_LIGHT_GREEN.registerSaplingBlock(
        "light_green_sapling", SaplingBlock(DesolatedPastelsSaplingGenerators.LIGHT_GREEN_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING))
    )
    
    val LIGHT_BLUE_SAPLING_POTTED: Block = MapColor.COLOR_LIGHT_BLUE.registerTempBlock("light_blue_sapling_potted", FlowerPotBlock(DesolatedPastelsBlocks.LIGHT_BLUE_SAPLING as Block, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)))
    val LIGHT_GREEN_SAPLING_POTTED: Block = MapColor.COLOR_LIGHT_GREEN.registerTempBlock("light_green_sapling_potted", FlowerPotBlock(DesolatedPastelsBlocks.LIGHT_GREEN_SAPLING as Block, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)))

    fun DyeColor.registerTempLeavesBlock(modID: String, name: String, emissiveRenderingState: BlockBehaviour.StatePredicate): Block =
        LeavesBlock(Properties.pastelLeaves().mapColor(this).hasPostProcess(emissiveRenderingState).emissiveRendering(emissiveRenderingState)).registerBlockWithItem(modID, name).apply { FlammableBlockRegistry.getDefaultInstance().add(this, 30, 60) }

    fun MapColor.registerTempLeavesBlock(modID: String, name: String, emissiveRenderingState: BlockBehaviour.StatePredicate): Block =
        LeavesBlock(Properties.pastelLeaves().mapColor(this).hasPostProcess(emissiveRenderingState).emissiveRendering(emissiveRenderingState)).registerBlockWithItem(modID, name).apply { FlammableBlockRegistry.getDefaultInstance().add(this, 30, 60) }


    fun DyeColor.registerTempBlock(name: String, block: Block): Block {
        LOGGER.warn("${name.replace("_", " ").replaceFirstChar(Char::uppercaseChar)} is registered as a Temp Block, please make a dedicated register for this block eventually!")
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name), BlockItem(block, Item.Properties()))
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, name), block)
    }

    fun MapColor.registerTempBlock(name: String, block: Block): Block {
        LOGGER.warn("${name.replace("_", " ").replaceFirstChar(Char::uppercaseChar)} is registered as a Temp Block, please make a dedicated register for this block eventually!")
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name), BlockItem(block, Item.Properties()))
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, name), block)
    }

    fun DyeColor.registerSaplingBlock(name: String, block: SaplingBlock): SaplingBlock {
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name), BlockItem(block, Item.Properties()))
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, name), block)
    }

    fun MapColor.registerSaplingBlock(name: String, block: SaplingBlock): SaplingBlock {
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name), BlockItem(block, Item.Properties()))
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, name), block)
    }

    fun MapColor.registerDirtBlock(modID: String, name: String): Block =
        Block(pastelDirt().mapColor(this)).registerBlockWithItem(modID, name)

    fun DyeColor.registerDirtBlock(modID: String, name: String): Block =
        Block(pastelDirt().mapColor(this)).registerBlockWithItem(modID, name)

    fun MapColor.registerGrassBlock(modID: String, name: String): Block =
        PastelGrassBlock(pastelGrass().mapColor(this)).registerBlockWithItem(modID, name)

    fun DyeColor.registerGrassBlock(modID: String, name: String): Block =
        PastelGrassBlock(pastelGrass().mapColor(this)).registerBlockWithItem(modID, name)

    fun init() { }
}