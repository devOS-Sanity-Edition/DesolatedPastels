package one.devos.nautical.desolatedpastels.datagen

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
    }

}