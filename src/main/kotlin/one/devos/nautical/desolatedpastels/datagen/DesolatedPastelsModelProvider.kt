package one.devos.nautical.desolatedpastels.datagen

import gay.asoji.innerpastels.datagen.CustomModelTemplates.createCustomItemModel
import gay.asoji.innerpastels.datagen.ModelGenerators
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.model.TextureSlot
import net.minecraft.data.models.model.TexturedModel
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.Block
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
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerators) {
        itemModelGenerator.generateFlatItem(DesolatedPastelsItems.MALLARD_SPAWN_EGG_ITEM, createCustomItemModel("minecraft", "template_spawn_egg"))
    }
}