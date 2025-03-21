package one.devos.nautical.desolatedpastels.datagen

import gay.asoji.innerpastels.datagen.CustomModelTemplates.createCustomItemModel
import gay.asoji.innerpastels.datagen.ModelGenerators
import gay.asoji.innerpastels.datagen.ModelGenerators.createFence
import gay.asoji.innerpastels.datagen.ModelGenerators.createFenceGate
import gay.asoji.innerpastels.datagen.ModelGenerators.createSlabs
import gay.asoji.innerpastels.datagen.ModelGenerators.createStairs
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.model.ModelTemplates
import net.minecraft.data.models.model.TextureMapping
import net.minecraft.data.models.model.TextureSlot
import net.minecraft.data.models.model.TexturedModel
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.RotatedPillarBlock
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsItems


class DesolatedPastelsModelProvider(generator: FabricDataOutput) : FabricModelProvider(generator) {
    override fun generateBlockStateModels(blockStateModelGenerator: BlockModelGenerators) {
        ModelGenerators.createPillar(DesolatedPastelsBlocks.WHITE_LOG as RotatedPillarBlock, blockStateModelGenerator)
        ModelGenerators.createPillar(DesolatedPastelsBlocks.LIGHT_RED_LOG as RotatedPillarBlock, blockStateModelGenerator)
        ModelGenerators.createPillar(DesolatedPastelsBlocks.RED_LOG as RotatedPillarBlock, blockStateModelGenerator)
        ModelGenerators.createPillar(DesolatedPastelsBlocks.ORANGE_LOG as RotatedPillarBlock, blockStateModelGenerator)
        ModelGenerators.createPillar(DesolatedPastelsBlocks.YELLOW_LOG as RotatedPillarBlock, blockStateModelGenerator)
        ModelGenerators.createPillar(DesolatedPastelsBlocks.LIGHT_GREEN_LOG as RotatedPillarBlock, blockStateModelGenerator)
        ModelGenerators.createPillar(DesolatedPastelsBlocks.GREEN_LOG as RotatedPillarBlock, blockStateModelGenerator)
        ModelGenerators.createPillar(DesolatedPastelsBlocks.LIGHT_BLUE_LOG as RotatedPillarBlock, blockStateModelGenerator)
        ModelGenerators.createPillar(DesolatedPastelsBlocks.BLUE_LOG as RotatedPillarBlock, blockStateModelGenerator)
        ModelGenerators.createPillar(DesolatedPastelsBlocks.PURPLE_LOG as RotatedPillarBlock, blockStateModelGenerator)
        ModelGenerators.createPillar(DesolatedPastelsBlocks.MAGENTA_LOG as RotatedPillarBlock, blockStateModelGenerator)
        ModelGenerators.createPillar(DesolatedPastelsBlocks.BROWN_LOG as RotatedPillarBlock, blockStateModelGenerator)
        ModelGenerators.createPillar(DesolatedPastelsBlocks.LIGHT_GRAY_LOG as RotatedPillarBlock, blockStateModelGenerator)
        ModelGenerators.createPillar(DesolatedPastelsBlocks.GRAY_LOG as RotatedPillarBlock, blockStateModelGenerator)
        ModelGenerators.createPillar(DesolatedPastelsBlocks.BLACK_LOG as RotatedPillarBlock, blockStateModelGenerator)

        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.WHITE_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.LIGHT_RED_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.RED_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.ORANGE_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.YELLOW_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.LIGHT_GREEN_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.GREEN_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.LIGHT_BLUE_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BLUE_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.PURPLE_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.MAGENTA_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BROWN_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.LIGHT_GRAY_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.GRAY_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BLACK_LEAVES, TexturedModel.LEAVES)

        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BRIGHTENED_WHITE_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_RED_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BRIGHTENED_RED_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BRIGHTENED_ORANGE_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BRIGHTENED_YELLOW_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_GREEN_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BRIGHTENED_GREEN_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_BLUE_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BRIGHTENED_BLUE_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BRIGHTENED_PURPLE_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BRIGHTENED_MAGENTA_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BRIGHTENED_BROWN_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_GRAY_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BRIGHTENED_GRAY_LEAVES, TexturedModel.LEAVES)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BRIGHTENED_BLACK_LEAVES, TexturedModel.LEAVES)

        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.PASTEL_ORE, TexturedModel.CUBE_TOP)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.PASTEL_STONE, TexturedModel.CUBE_TOP)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.PASTEL_DIRT, TexturedModel.CUBE)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.PASTEL_GRASS, TexturedModel.CUBE_TOP_BOTTOM.updateTexture { it.put(TextureSlot.BOTTOM, ResourceLocation.fromNamespaceAndPath(DesolatedPastels.MOD_ID, "block/pastel_dirt")) })
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.PASTEL_SAND, TexturedModel.CUBE)
        
        blockStateModelGenerator.createPlant(DesolatedPastelsBlocks.BLUE_SAPLING, DesolatedPastelsBlocks.BLUE_SAPLING_POTTED, BlockModelGenerators.TintState.NOT_TINTED)
        blockStateModelGenerator.createPlant(DesolatedPastelsBlocks.LIGHT_BLUE_SAPLING, DesolatedPastelsBlocks.LIGHT_BLUE_SAPLING_POTTED, BlockModelGenerators.TintState.NOT_TINTED)
        blockStateModelGenerator.createPlant(DesolatedPastelsBlocks.GREEN_SAPLING, DesolatedPastelsBlocks.GREEN_SAPLING_POTTED, BlockModelGenerators.TintState.NOT_TINTED)
        blockStateModelGenerator.createPlant(DesolatedPastelsBlocks.LIGHT_GREEN_SAPLING, DesolatedPastelsBlocks.LIGHT_GREEN_SAPLING_POTTED, BlockModelGenerators.TintState.NOT_TINTED)

        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.WHITE_PLANKS, TexturedModel.CUBE)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.LIGHT_RED_PLANKS, TexturedModel.CUBE)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.RED_PLANKS, TexturedModel.CUBE)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.ORANGE_PLANKS, TexturedModel.CUBE)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.YELLOW_PLANKS, TexturedModel.CUBE)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS, TexturedModel.CUBE)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.GREEN_PLANKS, TexturedModel.CUBE)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS, TexturedModel.CUBE)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BLUE_PLANKS, TexturedModel.CUBE)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.PURPLE_PLANKS, TexturedModel.CUBE)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.MAGENTA_PLANKS, TexturedModel.CUBE)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BROWN_PLANKS, TexturedModel.CUBE)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS, TexturedModel.CUBE)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.GRAY_PLANKS, TexturedModel.CUBE)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.BLACK_PLANKS, TexturedModel.CUBE)

        createFence(DesolatedPastelsBlocks.WHITE_PLANKS, DesolatedPastelsBlocks.WHITE_PLANK_FENCE, blockStateModelGenerator)
        createFence(DesolatedPastelsBlocks.LIGHT_RED_PLANKS, DesolatedPastelsBlocks.LIGHT_RED_PLANK_FENCE, blockStateModelGenerator)
        createFence(DesolatedPastelsBlocks.RED_PLANKS, DesolatedPastelsBlocks.RED_PLANK_FENCE, blockStateModelGenerator)
        createFence(DesolatedPastelsBlocks.ORANGE_PLANKS, DesolatedPastelsBlocks.ORANGE_PLANK_FENCE, blockStateModelGenerator)
        createFence(DesolatedPastelsBlocks.YELLOW_PLANKS, DesolatedPastelsBlocks.YELLOW_PLANK_FENCE, blockStateModelGenerator)
        createFence(DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS, DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_FENCE, blockStateModelGenerator)
        createFence(DesolatedPastelsBlocks.GREEN_PLANKS, DesolatedPastelsBlocks.GREEN_PLANK_FENCE, blockStateModelGenerator)
        createFence(DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS, DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_FENCE, blockStateModelGenerator)
        createFence(DesolatedPastelsBlocks.BLUE_PLANKS, DesolatedPastelsBlocks.BLUE_PLANK_FENCE, blockStateModelGenerator)
        createFence(DesolatedPastelsBlocks.PURPLE_PLANKS, DesolatedPastelsBlocks.PURPLE_PLANK_FENCE, blockStateModelGenerator)
        createFence(DesolatedPastelsBlocks.MAGENTA_PLANKS, DesolatedPastelsBlocks.MAGENTA_PLANK_FENCE, blockStateModelGenerator)
        createFence(DesolatedPastelsBlocks.BROWN_PLANKS, DesolatedPastelsBlocks.BROWN_PLANK_FENCE, blockStateModelGenerator)
        createFence(DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS, DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_FENCE, blockStateModelGenerator)
        createFence(DesolatedPastelsBlocks.GRAY_PLANKS, DesolatedPastelsBlocks.GRAY_PLANK_FENCE, blockStateModelGenerator)
        createFence(DesolatedPastelsBlocks.BLACK_PLANKS, DesolatedPastelsBlocks.BLACK_PLANK_FENCE, blockStateModelGenerator)

        createFenceGate(DesolatedPastelsBlocks.WHITE_PLANKS, DesolatedPastelsBlocks.WHITE_PLANK_FENCE_GATE, blockStateModelGenerator)
        createFenceGate(DesolatedPastelsBlocks.LIGHT_RED_PLANKS, DesolatedPastelsBlocks.LIGHT_RED_PLANK_FENCE_GATE, blockStateModelGenerator)
        createFenceGate(DesolatedPastelsBlocks.RED_PLANKS, DesolatedPastelsBlocks.RED_PLANK_FENCE_GATE, blockStateModelGenerator)
        createFenceGate(DesolatedPastelsBlocks.ORANGE_PLANKS, DesolatedPastelsBlocks.ORANGE_PLANK_FENCE_GATE, blockStateModelGenerator)
        createFenceGate(DesolatedPastelsBlocks.YELLOW_PLANKS, DesolatedPastelsBlocks.YELLOW_PLANK_FENCE_GATE, blockStateModelGenerator)
        createFenceGate(DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS, DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_FENCE_GATE, blockStateModelGenerator)
        createFenceGate(DesolatedPastelsBlocks.GREEN_PLANKS, DesolatedPastelsBlocks.GREEN_PLANK_FENCE_GATE, blockStateModelGenerator)
        createFenceGate(DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS, DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_FENCE_GATE, blockStateModelGenerator)
        createFenceGate(DesolatedPastelsBlocks.BLUE_PLANKS, DesolatedPastelsBlocks.BLUE_PLANK_FENCE_GATE, blockStateModelGenerator)
        createFenceGate(DesolatedPastelsBlocks.PURPLE_PLANKS, DesolatedPastelsBlocks.PURPLE_PLANK_FENCE_GATE, blockStateModelGenerator)
        createFenceGate(DesolatedPastelsBlocks.MAGENTA_PLANKS, DesolatedPastelsBlocks.MAGENTA_PLANK_FENCE_GATE, blockStateModelGenerator)
        createFenceGate(DesolatedPastelsBlocks.BROWN_PLANKS, DesolatedPastelsBlocks.BROWN_PLANK_FENCE_GATE, blockStateModelGenerator)
        createFenceGate(DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS, DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_FENCE_GATE, blockStateModelGenerator)
        createFenceGate(DesolatedPastelsBlocks.GRAY_PLANKS, DesolatedPastelsBlocks.GRAY_PLANK_FENCE_GATE, blockStateModelGenerator)
        createFenceGate(DesolatedPastelsBlocks.BLACK_PLANKS, DesolatedPastelsBlocks.BLACK_PLANK_FENCE_GATE, blockStateModelGenerator)

        createSlabs(DesolatedPastelsBlocks.WHITE_PLANKS, DesolatedPastelsBlocks.WHITE_PLANK_SLAB, blockStateModelGenerator)
        createSlabs(DesolatedPastelsBlocks.LIGHT_RED_PLANKS, DesolatedPastelsBlocks.LIGHT_RED_PLANK_SLAB, blockStateModelGenerator)
        createSlabs(DesolatedPastelsBlocks.RED_PLANKS, DesolatedPastelsBlocks.RED_PLANK_SLAB, blockStateModelGenerator)
        createSlabs(DesolatedPastelsBlocks.ORANGE_PLANKS, DesolatedPastelsBlocks.ORANGE_PLANK_SLAB, blockStateModelGenerator)
        createSlabs(DesolatedPastelsBlocks.YELLOW_PLANKS, DesolatedPastelsBlocks.YELLOW_PLANK_SLAB, blockStateModelGenerator)
        createSlabs(DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS, DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_SLAB, blockStateModelGenerator)
        createSlabs(DesolatedPastelsBlocks.GREEN_PLANKS, DesolatedPastelsBlocks.GREEN_PLANK_SLAB, blockStateModelGenerator)
        createSlabs(DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS, DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_SLAB, blockStateModelGenerator)
        createSlabs(DesolatedPastelsBlocks.BLUE_PLANKS, DesolatedPastelsBlocks.BLUE_PLANK_SLAB, blockStateModelGenerator)
        createSlabs(DesolatedPastelsBlocks.PURPLE_PLANKS, DesolatedPastelsBlocks.PURPLE_PLANK_SLAB, blockStateModelGenerator)
        createSlabs(DesolatedPastelsBlocks.MAGENTA_PLANKS, DesolatedPastelsBlocks.MAGENTA_PLANK_SLAB, blockStateModelGenerator)
        createSlabs(DesolatedPastelsBlocks.BROWN_PLANKS, DesolatedPastelsBlocks.BROWN_PLANK_SLAB, blockStateModelGenerator)
        createSlabs(DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS, DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_SLAB, blockStateModelGenerator)
        createSlabs(DesolatedPastelsBlocks.GRAY_PLANKS, DesolatedPastelsBlocks.GRAY_PLANK_SLAB, blockStateModelGenerator)
        createSlabs(DesolatedPastelsBlocks.BLACK_PLANKS, DesolatedPastelsBlocks.BLACK_PLANK_SLAB, blockStateModelGenerator)

        createStairs(DesolatedPastelsBlocks.WHITE_PLANKS, DesolatedPastelsBlocks.WHITE_PLANK_STAIRS, blockStateModelGenerator)
        createStairs(DesolatedPastelsBlocks.LIGHT_RED_PLANKS, DesolatedPastelsBlocks.LIGHT_RED_PLANK_STAIRS, blockStateModelGenerator)
        createStairs(DesolatedPastelsBlocks.RED_PLANKS, DesolatedPastelsBlocks.RED_PLANK_STAIRS, blockStateModelGenerator)
        createStairs(DesolatedPastelsBlocks.ORANGE_PLANKS, DesolatedPastelsBlocks.ORANGE_PLANK_STAIRS, blockStateModelGenerator)
        createStairs(DesolatedPastelsBlocks.YELLOW_PLANKS, DesolatedPastelsBlocks.YELLOW_PLANK_STAIRS, blockStateModelGenerator)
        createStairs(DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS, DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_STAIRS, blockStateModelGenerator)
        createStairs(DesolatedPastelsBlocks.GREEN_PLANKS, DesolatedPastelsBlocks.GREEN_PLANK_STAIRS, blockStateModelGenerator)
        createStairs(DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS, DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_STAIRS, blockStateModelGenerator)
        createStairs(DesolatedPastelsBlocks.BLUE_PLANKS, DesolatedPastelsBlocks.BLUE_PLANK_STAIRS, blockStateModelGenerator)
        createStairs(DesolatedPastelsBlocks.PURPLE_PLANKS, DesolatedPastelsBlocks.PURPLE_PLANK_STAIRS, blockStateModelGenerator)
        createStairs(DesolatedPastelsBlocks.MAGENTA_PLANKS, DesolatedPastelsBlocks.MAGENTA_PLANK_STAIRS, blockStateModelGenerator)
        createStairs(DesolatedPastelsBlocks.BROWN_PLANKS, DesolatedPastelsBlocks.BROWN_PLANK_STAIRS, blockStateModelGenerator)
        createStairs(DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS, DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_STAIRS, blockStateModelGenerator)
        createStairs(DesolatedPastelsBlocks.GRAY_PLANKS, DesolatedPastelsBlocks.GRAY_PLANK_STAIRS, blockStateModelGenerator)
        createStairs(DesolatedPastelsBlocks.BLACK_PLANKS, DesolatedPastelsBlocks.BLACK_PLANK_STAIRS, blockStateModelGenerator)

        blockStateModelGenerator.createTrapdoor(DesolatedPastelsBlocks.WHITE_PLANK_TRAPDOOR)
        blockStateModelGenerator.createTrapdoor(DesolatedPastelsBlocks.LIGHT_RED_PLANK_TRAPDOOR)
        blockStateModelGenerator.createTrapdoor(DesolatedPastelsBlocks.RED_PLANK_TRAPDOOR)
        blockStateModelGenerator.createTrapdoor(DesolatedPastelsBlocks.ORANGE_PLANK_TRAPDOOR)
        blockStateModelGenerator.createTrapdoor(DesolatedPastelsBlocks.YELLOW_PLANK_TRAPDOOR)
        blockStateModelGenerator.createTrapdoor(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_TRAPDOOR)
        blockStateModelGenerator.createTrapdoor(DesolatedPastelsBlocks.GREEN_PLANK_TRAPDOOR)
        blockStateModelGenerator.createTrapdoor(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_TRAPDOOR)
        blockStateModelGenerator.createTrapdoor(DesolatedPastelsBlocks.BLUE_PLANK_TRAPDOOR)
        blockStateModelGenerator.createTrapdoor(DesolatedPastelsBlocks.PURPLE_PLANK_TRAPDOOR)
        blockStateModelGenerator.createTrapdoor(DesolatedPastelsBlocks.MAGENTA_PLANK_TRAPDOOR)
        blockStateModelGenerator.createTrapdoor(DesolatedPastelsBlocks.BROWN_PLANK_TRAPDOOR)
        blockStateModelGenerator.createTrapdoor(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_TRAPDOOR)
        blockStateModelGenerator.createTrapdoor(DesolatedPastelsBlocks.GRAY_PLANK_TRAPDOOR)
        blockStateModelGenerator.createTrapdoor(DesolatedPastelsBlocks.BLACK_PLANK_TRAPDOOR)

        blockStateModelGenerator.createDoor(DesolatedPastelsBlocks.WHITE_PLANK_DOOR)
        blockStateModelGenerator.createDoor(DesolatedPastelsBlocks.LIGHT_RED_PLANK_DOOR)
        blockStateModelGenerator.createDoor(DesolatedPastelsBlocks.RED_PLANK_DOOR)
        blockStateModelGenerator.createDoor(DesolatedPastelsBlocks.ORANGE_PLANK_DOOR)
        blockStateModelGenerator.createDoor(DesolatedPastelsBlocks.YELLOW_PLANK_DOOR)
        blockStateModelGenerator.createDoor(DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_DOOR)
        blockStateModelGenerator.createDoor(DesolatedPastelsBlocks.GREEN_PLANK_DOOR)
        blockStateModelGenerator.createDoor(DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_DOOR)
        blockStateModelGenerator.createDoor(DesolatedPastelsBlocks.BLUE_PLANK_DOOR)
        blockStateModelGenerator.createDoor(DesolatedPastelsBlocks.PURPLE_PLANK_DOOR)
        blockStateModelGenerator.createDoor(DesolatedPastelsBlocks.MAGENTA_PLANK_DOOR)
        blockStateModelGenerator.createDoor(DesolatedPastelsBlocks.BROWN_PLANK_DOOR)
        blockStateModelGenerator.createDoor(DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_DOOR)
        blockStateModelGenerator.createDoor(DesolatedPastelsBlocks.GRAY_PLANK_DOOR)
        blockStateModelGenerator.createDoor(DesolatedPastelsBlocks.BLACK_PLANK_DOOR)

        val shardCreatorTextureMapping = TextureMapping()
            .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(DesolatedPastelsBlocks.SHARD_CREATOR, "_side"))
            .put(TextureSlot.UP, TextureMapping.getBlockTexture(DesolatedPastelsBlocks.SHARD_CREATOR, "_top"))
            .put(TextureSlot.DOWN, TextureMapping.getBlockTexture(DesolatedPastelsBlocks.SHARD_CREATOR, "_bottom"))
            .put(TextureSlot.NORTH, TextureMapping.getBlockTexture(DesolatedPastelsBlocks.SHARD_CREATOR, "_side"))
            .put(TextureSlot.SOUTH, TextureMapping.getBlockTexture(DesolatedPastelsBlocks.SHARD_CREATOR, "_side"))
            .put(TextureSlot.EAST, TextureMapping.getBlockTexture(DesolatedPastelsBlocks.SHARD_CREATOR, "_side_reverse"))
            .put(TextureSlot.WEST, TextureMapping.getBlockTexture(DesolatedPastelsBlocks.SHARD_CREATOR, "_side_reverse"))

        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.SHARD_CREATOR, shardCreatorTextureMapping, ModelTemplates.CUBE)
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerators) {
        itemModelGenerator.generateFlatItem(DesolatedPastelsItems.MALLARD_SPAWN_EGG_ITEM, createCustomItemModel("minecraft", "template_spawn_egg"))
        itemModelGenerator.generateFlatItem(DesolatedPastelsItems.PASTELMON_SPAWN_EGG_ITEM, createCustomItemModel("minecraft", "template_spawn_egg"))
        itemModelGenerator.generateFlatItem(DesolatedPastelsItems.MALLARD_EGG_ITEM, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(DesolatedPastelsItems.ROTTEN_MALLARD_EGG_ITEM, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(DesolatedPastelsItems.RAW_MALLARD, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(DesolatedPastelsItems.COOKED_MALLARD, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(DesolatedPastelsItems.MALLARD_SOUP, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(DesolatedPastelsItems.RAW_PASTELMON, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(DesolatedPastelsItems.COOKED_PASTELMON, ModelTemplates.FLAT_ITEM)
        itemModelGenerator.generateFlatItem(DesolatedPastelsItems.PASTEL_SHARD, ModelTemplates.FLAT_ITEM)
    }
}