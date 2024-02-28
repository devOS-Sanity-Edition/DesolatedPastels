package one.devos.nautical.desolatedpastels.datagen

import gay.asoji.innerpastels.datagen.ModelGenerators
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.model.TexturedModel
import net.minecraft.world.level.block.RotatedPillarBlock
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks

class DesolatedPastelsModelProvider(generator: FabricDataOutput) : FabricModelProvider(generator) {
    override fun generateBlockStateModels(blockStateModelGenerator: BlockModelGenerators) {
        ModelGenerators.createPillar(DesolatedPastelsBlocks.LIGHT_GREEN_LOG as RotatedPillarBlock, blockStateModelGenerator)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.LIGHT_GREEN_LEAVES, TexturedModel.LEAVES)
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerators?) {

    }
}