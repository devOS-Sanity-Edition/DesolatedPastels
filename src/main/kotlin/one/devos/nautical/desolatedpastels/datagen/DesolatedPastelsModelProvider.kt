package one.devos.nautical.desolatedpastels.datagen

import com.google.common.collect.ImmutableSet
import gay.asoji.innerpastels.datagen.ModelGenerators
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.client.model.Model
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.model.ModelTemplate
import net.minecraft.data.models.model.ModelTemplates
import net.minecraft.data.models.model.TextureSlot
import net.minecraft.data.models.model.TexturedModel
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.RotatedPillarBlock
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsItems
import oshi.annotation.concurrent.Immutable
import java.util.Optional


class DesolatedPastelsModelProvider(generator: FabricDataOutput) : FabricModelProvider(generator) {
    override fun generateBlockStateModels(blockStateModelGenerator: BlockModelGenerators) {
        ModelGenerators.createPillar(DesolatedPastelsBlocks.LIGHT_GREEN_LOG as RotatedPillarBlock, blockStateModelGenerator)
        blockStateModelGenerator.createTrivialBlock(DesolatedPastelsBlocks.LIGHT_GREEN_LEAVES, TexturedModel.LEAVES)
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerators) {
        itemModelGenerator.generateFlatItem(DesolatedPastelsItems.MALLARD_SPAWN_EGG_ITEM, createCustomItemModel("template_spawn_egg"))
    }

    // TODO: Move all of this to Inner Pastels later under the Datagen packages, prob as `CustomModels.kt`
    private fun createCustomBlockModel(string: String, textureSlots: TextureSlot): ModelTemplate {
        return ModelTemplate(Optional.of(ResourceLocation("block/$string")), Optional.empty(), textureSlots)
    }

    private fun createCustomBlockModel(string: String, suffix: String, textureSlots: TextureSlot): ModelTemplate {
        return ModelTemplate(Optional.of(ResourceLocation("block/$string")), Optional.of(suffix), textureSlots)
    }

    private fun createCustomItemModel(string: String, textureSlots: TextureSlot): ModelTemplate {
        return ModelTemplate(Optional.of(ResourceLocation("item/$string")), Optional.empty(), textureSlots)
    }

    private fun createCustomItemModel(string: String, suffix: String, textureSlots: TextureSlot): ModelTemplate {
        return ModelTemplate(Optional.of(ResourceLocation("item/$string")), Optional.of(suffix), textureSlots)
    }

    // maybe have `template_spawn_egg` or some shit for the string belong be a string enum? idk lol
    private fun createCustomItemModel(string: String): ModelTemplate {
        return ModelTemplate(Optional.of(ResourceLocation("item/$string")), Optional.empty())
    }

}