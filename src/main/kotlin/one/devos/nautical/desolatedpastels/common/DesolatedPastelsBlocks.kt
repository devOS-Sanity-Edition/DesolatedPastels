package one.devos.nautical.desolatedpastels.common

import gay.asoji.innerpastels.blocks.Properties
import gay.asoji.innerpastels.blocks.Properties.pastelDirt
import gay.asoji.innerpastels.blocks.Properties.pastelGrass
import gay.asoji.innerpastels.blocks.Properties.pastelPlanks
import gay.asoji.innerpastels.register.*
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.util.ColorRGBA
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.DyeColor
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.*
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.MapColor
import net.minecraft.world.level.material.PushReaction
import one.devos.nautical.desolatedpastels.DesolatedPastels.LOGGER
import one.devos.nautical.desolatedpastels.DesolatedPastels.MOD_ID
import one.devos.nautical.desolatedpastels.common.blocks.PastelGrassBlock
import one.devos.nautical.desolatedpastels.world.DesolatedPastelsSaplingGenerators


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

    val WHITE_PLANKS = DyeColor.WHITE.registerPlanksBlock(MOD_ID, "white_planks")
    val LIGHT_RED_PLANKS = MapColor.COLOR_PINK.registerPlanksBlock(MOD_ID, "light_red_planks")
    val RED_PLANKS = MapColor.COLOR_RED.registerPlanksBlock(MOD_ID, "red_planks")
    val ORANGE_PLANKS = MapColor.COLOR_ORANGE.registerPlanksBlock(MOD_ID, "orange_planks")
    val YELLOW_PLANKS = MapColor.COLOR_YELLOW.registerPlanksBlock(MOD_ID, "yellow_planks")
    val LIGHT_GREEN_PLANKS = MapColor.COLOR_LIGHT_GREEN.registerPlanksBlock(MOD_ID, "light_green_planks")
    val GREEN_PLANKS = MapColor.COLOR_GREEN.registerPlanksBlock(MOD_ID, "green_planks")
    val LIGHT_BLUE_PLANKS = MapColor.COLOR_LIGHT_BLUE.registerPlanksBlock(MOD_ID, "light_blue_planks")
    val BLUE_PLANKS = MapColor.COLOR_BLUE.registerPlanksBlock(MOD_ID, "blue_planks")
    val PURPLE_PLANKS = MapColor.COLOR_PURPLE.registerPlanksBlock(MOD_ID, "purple_planks")
    val MAGENTA_PLANKS = MapColor.COLOR_MAGENTA.registerPlanksBlock(MOD_ID, "magenta_planks")
    val BROWN_PLANKS = MapColor.COLOR_BROWN.registerPlanksBlock(MOD_ID, "brown_planks")
    val LIGHT_GRAY_PLANKS = MapColor.COLOR_LIGHT_GRAY.registerPlanksBlock(MOD_ID, "light_gray_planks")
    val GRAY_PLANKS = MapColor.COLOR_GRAY.registerPlanksBlock(MOD_ID, "gray_planks")
    val BLACK_PLANKS = MapColor.COLOR_BLACK.registerPlanksBlock(MOD_ID, "black_planks")

    val WHITE_PLANK_FENCE: Block = DyeColor.WHITE.registerPastelFenceBlock(MOD_ID, "white_plank_fence")
    val LIGHT_RED_PLANK_FENCE: Block = MapColor.COLOR_PINK.registerPastelFenceBlock(MOD_ID, "light_red_plank_fence")
    val RED_PLANK_FENCE: Block = MapColor.COLOR_RED.registerPastelFenceBlock(MOD_ID, "red_plank_fence")
    val ORANGE_PLANK_FENCE: Block = MapColor.COLOR_ORANGE.registerPastelFenceBlock(MOD_ID, "orange_plank_fence")
    val YELLOW_PLANK_FENCE: Block = MapColor.COLOR_YELLOW.registerPastelFenceBlock(MOD_ID, "yellow_plank_fence")
    val LIGHT_GREEN_PLANK_FENCE: Block = MapColor.COLOR_LIGHT_GREEN.registerPastelFenceBlock(MOD_ID, "light_green_plank_fence")
    val GREEN_PLANK_FENCE: Block = MapColor.COLOR_GREEN.registerPastelFenceBlock(MOD_ID, "green_plank_fence")
    val LIGHT_BLUE_PLANK_FENCE: Block = MapColor.COLOR_LIGHT_BLUE.registerPastelFenceBlock(MOD_ID, "light_blue_plank_fence")
    val BLUE_PLANK_FENCE: Block = MapColor.COLOR_BLUE.registerPastelFenceBlock(MOD_ID, "blue_plank_fence")
    val PURPLE_PLANK_FENCE: Block = MapColor.COLOR_PURPLE.registerPastelFenceBlock(MOD_ID, "purple_plank_fence")
    val MAGENTA_PLANK_FENCE: Block = MapColor.COLOR_MAGENTA.registerPastelFenceBlock(MOD_ID, "magenta_plank_fence")
    val BROWN_PLANK_FENCE: Block = MapColor.COLOR_BROWN.registerPastelFenceBlock(MOD_ID, "brown_plank_fence")
    val LIGHT_GRAY_PLANK_FENCE: Block = MapColor.COLOR_LIGHT_GRAY.registerPastelFenceBlock(MOD_ID, "light_gray_plank_fence")
    val GRAY_PLANK_FENCE: Block = MapColor.COLOR_GRAY.registerPastelFenceBlock(MOD_ID, "gray_plank_fence")
    val BLACK_PLANK_FENCE: Block = MapColor.COLOR_BLACK.registerPastelFenceBlock(MOD_ID, "black_plank_fence")

    val WHITE_PLANK_FENCE_GATE: Block = DyeColor.WHITE.registerPastelFenceGateBlock(MOD_ID, "white_plank_fence_gate")
    val LIGHT_RED_PLANK_FENCE_GATE: Block = MapColor.COLOR_PINK.registerPastelFenceGateBlock(MOD_ID, "light_red_plank_fence_gate")
    val RED_PLANK_FENCE_GATE: Block = MapColor.COLOR_RED.registerPastelFenceGateBlock(MOD_ID, "red_plank_fence_gate")
    val ORANGE_PLANK_FENCE_GATE: Block = MapColor.COLOR_ORANGE.registerPastelFenceGateBlock(MOD_ID, "orange_plank_fence_gate")
    val YELLOW_PLANK_FENCE_GATE: Block = MapColor.COLOR_YELLOW.registerPastelFenceGateBlock(MOD_ID, "yellow_plank_fence_gate")
    val LIGHT_GREEN_PLANK_FENCE_GATE: Block = MapColor.COLOR_LIGHT_GREEN.registerPastelFenceGateBlock(MOD_ID, "light_green_plank_fence_gate")
    val GREEN_PLANK_FENCE_GATE: Block = MapColor.COLOR_GREEN.registerPastelFenceGateBlock(MOD_ID, "green_plank_fence_gate")
    val LIGHT_BLUE_PLANK_FENCE_GATE: Block = MapColor.COLOR_LIGHT_BLUE.registerPastelFenceGateBlock(MOD_ID, "light_blue_plank_fence_gate")
    val BLUE_PLANK_FENCE_GATE: Block = MapColor.COLOR_BLUE.registerPastelFenceGateBlock(MOD_ID, "blue_plank_fence_gate")
    val PURPLE_PLANK_FENCE_GATE: Block = MapColor.COLOR_PURPLE.registerPastelFenceGateBlock(MOD_ID, "purple_plank_fence_gate")
    val MAGENTA_PLANK_FENCE_GATE: Block = MapColor.COLOR_MAGENTA.registerPastelFenceGateBlock(MOD_ID, "magenta_plank_fence_gate")
    val BROWN_PLANK_FENCE_GATE: Block = MapColor.COLOR_BROWN.registerPastelFenceGateBlock(MOD_ID, "brown_plank_fence_gate")
    val LIGHT_GRAY_PLANK_FENCE_GATE: Block = MapColor.COLOR_LIGHT_GRAY.registerPastelFenceGateBlock(MOD_ID, "light_gray_plank_fence_gate")
    val GRAY_PLANK_FENCE_GATE: Block = MapColor.COLOR_GRAY.registerPastelFenceGateBlock(MOD_ID, "gray_plank_fence_gate")
    val BLACK_PLANK_FENCE_GATE: Block = MapColor.COLOR_BLACK.registerPastelFenceGateBlock(MOD_ID, "black_plank_fence_gate")

    val WHITE_PLANK_SLAB: Block = DyeColor.WHITE.registerPastelSlabBlock(MOD_ID, "white_plank_slab")
    val LIGHT_RED_PLANK_SLAB: Block = MapColor.COLOR_PINK.registerPastelSlabBlock(MOD_ID, "light_red_plank_slab")
    val RED_PLANK_SLAB: Block = MapColor.COLOR_RED.registerPastelSlabBlock(MOD_ID, "red_plank_slab")
    val ORANGE_PLANK_SLAB: Block = MapColor.COLOR_ORANGE.registerPastelSlabBlock(MOD_ID, "orange_plank_slab")
    val YELLOW_PLANK_SLAB: Block = MapColor.COLOR_YELLOW.registerPastelSlabBlock(MOD_ID, "yellow_plank_slab")
    val LIGHT_GREEN_PLANK_SLAB: Block = MapColor.COLOR_LIGHT_GREEN.registerPastelSlabBlock(MOD_ID, "light_green_plank_slab")
    val GREEN_PLANK_SLAB: Block = MapColor.COLOR_GREEN.registerPastelSlabBlock(MOD_ID, "green_plank_slab")
    val LIGHT_BLUE_PLANK_SLAB: Block = MapColor.COLOR_LIGHT_BLUE.registerPastelSlabBlock(MOD_ID, "light_blue_plank_slab")
    val BLUE_PLANK_SLAB: Block = MapColor.COLOR_BLUE.registerPastelSlabBlock(MOD_ID, "blue_plank_slab")
    val PURPLE_PLANK_SLAB: Block = MapColor.COLOR_PURPLE.registerPastelSlabBlock(MOD_ID, "purple_plank_slab")
    val MAGENTA_PLANK_SLAB: Block = MapColor.COLOR_MAGENTA.registerPastelSlabBlock(MOD_ID, "magenta_plank_slab")
    val BROWN_PLANK_SLAB: Block = MapColor.COLOR_BROWN.registerPastelSlabBlock(MOD_ID, "brown_plank_slab")
    val LIGHT_GRAY_PLANK_SLAB: Block = MapColor.COLOR_LIGHT_GRAY.registerPastelSlabBlock(MOD_ID, "light_gray_plank_slab")
    val GRAY_PLANK_SLAB: Block = MapColor.COLOR_GRAY.registerPastelSlabBlock(MOD_ID, "gray_plank_slab")
    val BLACK_PLANK_SLAB: Block = MapColor.COLOR_BLACK.registerPastelSlabBlock(MOD_ID, "black_plank_slab")

    val WHITE_PLANK_STAIRS: Block = DyeColor.WHITE.registerPastelStairsBlock(MOD_ID, "white_plank_stairs")
    val LIGHT_RED_PLANK_STAIRS: Block = MapColor.COLOR_PINK.registerPastelStairsBlock(MOD_ID, "light_red_plank_stairs")
    val RED_PLANK_STAIRS: Block = MapColor.COLOR_RED.registerPastelStairsBlock(MOD_ID, "red_plank_stairs")
    val ORANGE_PLANK_STAIRS: Block = MapColor.COLOR_ORANGE.registerPastelStairsBlock(MOD_ID, "orange_plank_stairs")
    val YELLOW_PLANK_STAIRS: Block = MapColor.COLOR_YELLOW.registerPastelStairsBlock(MOD_ID, "yellow_plank_stairs")
    val LIGHT_GREEN_PLANK_STAIRS: Block = MapColor.COLOR_LIGHT_GREEN.registerPastelStairsBlock(MOD_ID, "light_green_plank_stairs")
    val GREEN_PLANK_STAIRS: Block = MapColor.COLOR_GREEN.registerPastelStairsBlock(MOD_ID, "green_plank_stairs")
    val LIGHT_BLUE_PLANK_STAIRS: Block = MapColor.COLOR_LIGHT_BLUE.registerPastelStairsBlock(MOD_ID, "light_blue_plank_stairs")
    val BLUE_PLANK_STAIRS: Block = MapColor.COLOR_BLUE.registerPastelStairsBlock(MOD_ID, "blue_plank_stairs")
    val PURPLE_PLANK_STAIRS: Block = MapColor.COLOR_PURPLE.registerPastelStairsBlock(MOD_ID, "purple_plank_stairs")
    val MAGENTA_PLANK_STAIRS: Block = MapColor.COLOR_MAGENTA.registerPastelStairsBlock(MOD_ID, "magenta_plank_stairs")
    val BROWN_PLANK_STAIRS: Block = MapColor.COLOR_BROWN.registerPastelStairsBlock(MOD_ID, "brown_plank_stairs")
    val LIGHT_GRAY_PLANK_STAIRS: Block = MapColor.COLOR_LIGHT_GRAY.registerPastelStairsBlock(MOD_ID, "light_gray_plank_stairs")
    val GRAY_PLANK_STAIRS: Block = MapColor.COLOR_GRAY.registerPastelStairsBlock(MOD_ID, "gray_plank_stairs")
    val BLACK_PLANK_STAIRS: Block = MapColor.COLOR_BLACK.registerPastelStairsBlock(MOD_ID, "black_plank_stairs")

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

    val BRIGHTENED_WHITE_LEAVES: Block = DyeColor.WHITE.registerBrightenedLeavesBlock(MOD_ID, "brightened_white_leaves", Blocks::never)
    val BRIGHTENED_LIGHT_RED_LEAVES: Block = MapColor.COLOR_PINK.registerBrightenedLeavesBlock(MOD_ID, "brightened_light_red_leaves", Blocks::never)
    val BRIGHTENED_RED_LEAVES: Block = MapColor.COLOR_RED.registerBrightenedLeavesBlock(MOD_ID, "brightened_red_leaves", Blocks::never)
    val BRIGHTENED_ORANGE_LEAVES: Block = MapColor.COLOR_ORANGE.registerBrightenedLeavesBlock(MOD_ID, "brightened_orange_leaves", Blocks::never)
    val BRIGHTENED_YELLOW_LEAVES: Block = MapColor.COLOR_YELLOW.registerBrightenedLeavesBlock(MOD_ID, "brightened_yellow_leaves", Blocks::never)
    val BRIGHTENED_LIGHT_GREEN_LEAVES: Block = MapColor.COLOR_LIGHT_GREEN.registerBrightenedLeavesBlock(MOD_ID, "brightened_light_green_leaves", Blocks::never)
    val BRIGHTENED_GREEN_LEAVES: Block = MapColor.COLOR_GREEN.registerBrightenedLeavesBlock(MOD_ID, "brightened_green_leaves", Blocks::never)
    val BRIGHTENED_LIGHT_BLUE_LEAVES: Block = MapColor.COLOR_LIGHT_BLUE.registerBrightenedLeavesBlock(MOD_ID, "brightened_light_blue_leaves", Blocks::never)
    val BRIGHTENED_BLUE_LEAVES: Block = MapColor.COLOR_BLUE.registerBrightenedLeavesBlock(MOD_ID, "brightened_blue_leaves", Blocks::never)
    val BRIGHTENED_PURPLE_LEAVES: Block = MapColor.COLOR_PURPLE.registerBrightenedLeavesBlock(MOD_ID, "brightened_purple_leaves", Blocks::never)
    val BRIGHTENED_MAGENTA_LEAVES: Block = MapColor.COLOR_MAGENTA.registerBrightenedLeavesBlock(MOD_ID, "brightened_magenta_leaves", Blocks::never)
    val BRIGHTENED_BROWN_LEAVES: Block = MapColor.COLOR_BROWN.registerBrightenedLeavesBlock(MOD_ID, "brightened_brown_leaves", Blocks::never)
    val BRIGHTENED_LIGHT_GRAY_LEAVES: Block = MapColor.COLOR_LIGHT_GRAY.registerBrightenedLeavesBlock(MOD_ID, "brightened_light_gray_leaves", Blocks::never)
    val BRIGHTENED_GRAY_LEAVES: Block = MapColor.COLOR_GRAY.registerBrightenedLeavesBlock(MOD_ID, "brightened_gray_leaves", Blocks::never)
    val BRIGHTENED_BLACK_LEAVES: Block = MapColor.COLOR_BLACK.registerBrightenedLeavesBlock(MOD_ID, "brightened_black_leaves", Blocks::never)

    val BRIGHTENED_LEAVES = listOf(
        BRIGHTENED_WHITE_LEAVES,
        BRIGHTENED_LIGHT_RED_LEAVES,
        BRIGHTENED_RED_LEAVES,
        BRIGHTENED_ORANGE_LEAVES,
        BRIGHTENED_YELLOW_LEAVES,
        BRIGHTENED_LIGHT_GREEN_LEAVES,
        BRIGHTENED_GREEN_LEAVES,
        BRIGHTENED_LIGHT_BLUE_LEAVES,
        BRIGHTENED_BLUE_LEAVES,
        BRIGHTENED_PURPLE_LEAVES,
        BRIGHTENED_MAGENTA_LEAVES,
        BRIGHTENED_BROWN_LEAVES,
        BRIGHTENED_LIGHT_GRAY_LEAVES,
        BRIGHTENED_GRAY_LEAVES,
        BRIGHTENED_BLACK_LEAVES,
    )

    val PASTEL_ORE: Block = MapColor.COLOR_GRAY.registerOreBlock(MOD_ID, "pastel_ore")
    val PASTEL_STONE: Block = MapColor.COLOR_GRAY.registerStoneBlock(MOD_ID, "pastel_stone")
    val PASTEL_DIRT: Block = MapColor.COLOR_BROWN.registerDirtBlock(MOD_ID, "pastel_dirt")
    val PASTEL_GRASS: Block = MapColor.COLOR_LIGHT_GREEN.registerGrassBlock(MOD_ID, "pastel_grass")
    val PASTEL_SAND: Block = MapColor.COLOR_YELLOW.registerSandBlock(MOD_ID, "pastel_sand", ColorRGBA(14997396))

    val LIGHT_GREEN_SAPLING: Block = MapColor.COLOR_LIGHT_GREEN.registerSaplingBlock(
        "light_green_sapling", SaplingBlock(DesolatedPastelsSaplingGenerators.LIGHT_GREEN_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING))
    )
    val GREEN_SAPLING: Block = MapColor.COLOR_GREEN.registerSaplingBlock(
        "green_sapling", SaplingBlock(DesolatedPastelsSaplingGenerators.GREEN_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING))
    )
    val LIGHT_BLUE_SAPLING: Block = MapColor.COLOR_LIGHT_BLUE.registerSaplingBlock(
        "light_blue_sapling", SaplingBlock(DesolatedPastelsSaplingGenerators.LIGHT_BLUE_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING))
    )
    val BLUE_SAPLING: Block = MapColor.COLOR_BLUE.registerSaplingBlock(
        "blue_sapling", SaplingBlock(DesolatedPastelsSaplingGenerators.BLUE_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING))
    )

    val GREEN_SAPLING_POTTED: Block = MapColor.COLOR_GREEN.registerTempBlock("green_sapling_potted", FlowerPotBlock(DesolatedPastelsBlocks.GREEN_SAPLING as Block, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)))
    val LIGHT_GREEN_SAPLING_POTTED: Block = MapColor.COLOR_LIGHT_GREEN.registerTempBlock("light_green_sapling_potted", FlowerPotBlock(DesolatedPastelsBlocks.LIGHT_GREEN_SAPLING as Block, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)))
    val BLUE_SAPLING_POTTED: Block = MapColor.COLOR_BLUE.registerTempBlock("blue_sapling_potted", FlowerPotBlock(DesolatedPastelsBlocks.BLUE_SAPLING as Block, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)))
    val LIGHT_BLUE_SAPLING_POTTED: Block = MapColor.COLOR_LIGHT_BLUE.registerTempBlock("light_blue_sapling_potted", FlowerPotBlock(DesolatedPastelsBlocks.LIGHT_BLUE_SAPLING as Block, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)))

    fun DyeColor.registerBrightenedLeavesBlock(modID: String, name: String, emissiveRenderingState: BlockBehaviour.StatePredicate): Block =
        LeavesBlock(Properties.pastelBrightenedLeaves().mapColor(this).hasPostProcess(emissiveRenderingState).emissiveRendering(emissiveRenderingState)).registerBlockWithItem(modID, name).apply { FlammableBlockRegistry.getDefaultInstance().add(this, 30, 60) }

    fun MapColor.registerBrightenedLeavesBlock(modID: String, name: String, emissiveRenderingState: BlockBehaviour.StatePredicate): Block =
        LeavesBlock(Properties.pastelBrightenedLeaves().mapColor(this).hasPostProcess(emissiveRenderingState).emissiveRendering(emissiveRenderingState)).registerBlockWithItem(modID, name).apply { FlammableBlockRegistry.getDefaultInstance().add(this, 30, 60) }


    fun DyeColor.registerTempBlock(name: String, block: Block): Block {
        LOGGER.debug("${name.replace("_", " ").replaceFirstChar(Char::uppercaseChar)} is registered as a Temp Block, please make a dedicated register for this block eventually! If you're seeing this in production, let asoji know.")
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name), BlockItem(block, Item.Properties()))
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, name), block)
    }

    fun MapColor.registerTempBlock(name: String, block: Block): Block {
        LOGGER.debug("${name.replace("_", " ").replaceFirstChar(Char::uppercaseChar)} is registered as a Temp Block, please make a dedicated register for this block eventually! If you're seeing this in production, let asoji know.")
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

    fun MapColor.registerPlanksBlock(modID: String, name: String): Block =
        Block(pastelPlanks().mapColor(this)).registerBlockWithItem(modID, name)

    fun DyeColor.registerPlanksBlock(modID: String, name: String): Block =
        Block(pastelPlanks().mapColor(this)).registerBlockWithItem(modID, name)

    fun init() { }
}