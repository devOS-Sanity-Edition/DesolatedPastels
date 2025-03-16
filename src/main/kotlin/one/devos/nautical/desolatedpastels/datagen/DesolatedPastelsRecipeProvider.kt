package one.devos.nautical.desolatedpastels.datagen

import gay.asoji.innerpastels.datagen.RecipeGenerators.registerCraftingPastelFenceBlock
import gay.asoji.innerpastels.datagen.RecipeGenerators.registerCraftingPastelFenceGateBlock
import gay.asoji.innerpastels.datagen.RecipeGenerators.registerPastelPlanksItem
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.core.HolderLookup
import net.minecraft.data.recipes.RecipeOutput
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks
import java.util.concurrent.CompletableFuture

class DesolatedPastelsRecipeProvider(output: FabricDataOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>) : FabricRecipeProvider(output, registriesFuture) {
    override fun buildRecipes(exporter: RecipeOutput) {
        registerPastelPlanksItem(exporter, DesolatedPastelsBlocks.WHITE_LOG, DesolatedPastelsBlocks.WHITE_PLANKS)
        registerPastelPlanksItem(exporter, DesolatedPastelsBlocks.LIGHT_RED_LOG, DesolatedPastelsBlocks.LIGHT_RED_PLANKS)
        registerPastelPlanksItem(exporter, DesolatedPastelsBlocks.RED_LOG, DesolatedPastelsBlocks.RED_PLANKS)
        registerPastelPlanksItem(exporter, DesolatedPastelsBlocks.ORANGE_LOG, DesolatedPastelsBlocks.ORANGE_PLANKS)
        registerPastelPlanksItem(exporter, DesolatedPastelsBlocks.YELLOW_LOG, DesolatedPastelsBlocks.YELLOW_PLANKS)
        registerPastelPlanksItem(exporter, DesolatedPastelsBlocks.LIGHT_GREEN_LOG, DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS)
        registerPastelPlanksItem(exporter, DesolatedPastelsBlocks.GREEN_LOG, DesolatedPastelsBlocks.GREEN_PLANKS)
        registerPastelPlanksItem(exporter, DesolatedPastelsBlocks.LIGHT_BLUE_LOG, DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS)
        registerPastelPlanksItem(exporter, DesolatedPastelsBlocks.BLUE_LOG, DesolatedPastelsBlocks.BLUE_PLANKS)
        registerPastelPlanksItem(exporter, DesolatedPastelsBlocks.PURPLE_LOG, DesolatedPastelsBlocks.PURPLE_PLANKS)
        registerPastelPlanksItem(exporter, DesolatedPastelsBlocks.MAGENTA_LOG, DesolatedPastelsBlocks.MAGENTA_PLANKS)
        registerPastelPlanksItem(exporter, DesolatedPastelsBlocks.BROWN_LOG, DesolatedPastelsBlocks.BROWN_PLANKS)
        registerPastelPlanksItem(exporter, DesolatedPastelsBlocks.LIGHT_GRAY_LOG, DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS)
        registerPastelPlanksItem(exporter, DesolatedPastelsBlocks.GRAY_LOG, DesolatedPastelsBlocks.GRAY_PLANKS)
        registerPastelPlanksItem(exporter, DesolatedPastelsBlocks.BLACK_LOG, DesolatedPastelsBlocks.BLACK_PLANKS)

        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.WHITE_PLANKS, DesolatedPastelsBlocks.WHITE_PLANKS_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.LIGHT_RED_PLANKS, DesolatedPastelsBlocks.LIGHT_RED_PLANKS_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.RED_PLANKS, DesolatedPastelsBlocks.RED_PLANKS_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.ORANGE_PLANKS, DesolatedPastelsBlocks.ORANGE_PLANKS_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.YELLOW_PLANKS, DesolatedPastelsBlocks.YELLOW_PLANKS_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS, DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.GREEN_PLANKS, DesolatedPastelsBlocks.GREEN_PLANKS_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS, DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.BLUE_PLANKS, DesolatedPastelsBlocks.BLUE_PLANKS_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.PURPLE_PLANKS, DesolatedPastelsBlocks.PURPLE_PLANKS_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.MAGENTA_PLANKS, DesolatedPastelsBlocks.MAGENTA_PLANKS_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.BROWN_PLANKS, DesolatedPastelsBlocks.BROWN_PLANKS_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS, DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.GRAY_PLANKS, DesolatedPastelsBlocks.GRAY_PLANKS_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.BLACK_PLANKS, DesolatedPastelsBlocks.BLACK_PLANKS_FENCE)

        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.WHITE_PLANKS, DesolatedPastelsBlocks.WHITE_PLANKS_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.LIGHT_RED_PLANKS, DesolatedPastelsBlocks.LIGHT_RED_PLANKS_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.RED_PLANKS, DesolatedPastelsBlocks.RED_PLANKS_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.ORANGE_PLANKS, DesolatedPastelsBlocks.ORANGE_PLANKS_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.YELLOW_PLANKS, DesolatedPastelsBlocks.YELLOW_PLANKS_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS, DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.GREEN_PLANKS, DesolatedPastelsBlocks.GREEN_PLANKS_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS, DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.BLUE_PLANKS, DesolatedPastelsBlocks.BLUE_PLANKS_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.PURPLE_PLANKS, DesolatedPastelsBlocks.PURPLE_PLANKS_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.MAGENTA_PLANKS, DesolatedPastelsBlocks.MAGENTA_PLANKS_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.BROWN_PLANKS, DesolatedPastelsBlocks.BROWN_PLANKS_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS, DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.GRAY_PLANKS, DesolatedPastelsBlocks.GRAY_PLANKS_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.BLACK_PLANKS, DesolatedPastelsBlocks.BLACK_PLANKS_FENCE_GATE)
    }

}