package one.devos.nautical.desolatedpastels.datagen

import gay.asoji.innerpastels.datagen.RecipeGenerators.registerCraftingPastelFenceBlock
import gay.asoji.innerpastels.datagen.RecipeGenerators.registerCraftingPastelFenceGateBlock
import gay.asoji.innerpastels.datagen.RecipeGenerators.registerCraftingPastelSlabBlock
import gay.asoji.innerpastels.datagen.RecipeGenerators.registerCraftingPastelStairBlock
import gay.asoji.innerpastels.datagen.RecipeGenerators.registerPastelPlanksItem
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.core.HolderLookup
import net.minecraft.data.recipes.RecipeOutput
import net.minecraft.world.item.crafting.CampfireCookingRecipe
import net.minecraft.world.item.crafting.RecipeSerializer
import net.minecraft.world.item.crafting.SmokingRecipe
import net.minecraft.world.level.ItemLike
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsItems
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

        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.WHITE_PLANKS, DesolatedPastelsBlocks.WHITE_PLANK_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.LIGHT_RED_PLANKS, DesolatedPastelsBlocks.LIGHT_RED_PLANK_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.RED_PLANKS, DesolatedPastelsBlocks.RED_PLANK_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.ORANGE_PLANKS, DesolatedPastelsBlocks.ORANGE_PLANK_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.YELLOW_PLANKS, DesolatedPastelsBlocks.YELLOW_PLANK_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS, DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.GREEN_PLANKS, DesolatedPastelsBlocks.GREEN_PLANK_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS, DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.BLUE_PLANKS, DesolatedPastelsBlocks.BLUE_PLANK_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.PURPLE_PLANKS, DesolatedPastelsBlocks.PURPLE_PLANK_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.MAGENTA_PLANKS, DesolatedPastelsBlocks.MAGENTA_PLANK_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.BROWN_PLANKS, DesolatedPastelsBlocks.BROWN_PLANK_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS, DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.GRAY_PLANKS, DesolatedPastelsBlocks.GRAY_PLANK_FENCE)
        registerCraftingPastelFenceBlock(exporter, DesolatedPastelsBlocks.BLACK_PLANKS, DesolatedPastelsBlocks.BLACK_PLANK_FENCE)

        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.WHITE_PLANKS, DesolatedPastelsBlocks.WHITE_PLANK_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.LIGHT_RED_PLANKS, DesolatedPastelsBlocks.LIGHT_RED_PLANK_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.RED_PLANKS, DesolatedPastelsBlocks.RED_PLANK_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.ORANGE_PLANKS, DesolatedPastelsBlocks.ORANGE_PLANK_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.YELLOW_PLANKS, DesolatedPastelsBlocks.YELLOW_PLANK_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS, DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.GREEN_PLANKS, DesolatedPastelsBlocks.GREEN_PLANK_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS, DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.BLUE_PLANKS, DesolatedPastelsBlocks.BLUE_PLANK_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.PURPLE_PLANKS, DesolatedPastelsBlocks.PURPLE_PLANK_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.MAGENTA_PLANKS, DesolatedPastelsBlocks.MAGENTA_PLANK_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.BROWN_PLANKS, DesolatedPastelsBlocks.BROWN_PLANK_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS, DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.GRAY_PLANKS, DesolatedPastelsBlocks.GRAY_PLANK_FENCE_GATE)
        registerCraftingPastelFenceGateBlock(exporter, DesolatedPastelsBlocks.BLACK_PLANKS, DesolatedPastelsBlocks.BLACK_PLANK_FENCE_GATE)

        registerCraftingPastelSlabBlock(exporter, DesolatedPastelsBlocks.WHITE_PLANKS, DesolatedPastelsBlocks.WHITE_PLANK_SLAB)
        registerCraftingPastelSlabBlock(exporter, DesolatedPastelsBlocks.LIGHT_RED_PLANKS, DesolatedPastelsBlocks.LIGHT_RED_PLANK_SLAB)
        registerCraftingPastelSlabBlock(exporter, DesolatedPastelsBlocks.RED_PLANKS, DesolatedPastelsBlocks.RED_PLANK_SLAB)
        registerCraftingPastelSlabBlock(exporter, DesolatedPastelsBlocks.ORANGE_PLANKS, DesolatedPastelsBlocks.ORANGE_PLANK_SLAB)
        registerCraftingPastelSlabBlock(exporter, DesolatedPastelsBlocks.YELLOW_PLANKS, DesolatedPastelsBlocks.YELLOW_PLANK_SLAB)
        registerCraftingPastelSlabBlock(exporter, DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS, DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_SLAB)
        registerCraftingPastelSlabBlock(exporter, DesolatedPastelsBlocks.GREEN_PLANKS, DesolatedPastelsBlocks.GREEN_PLANK_SLAB)
        registerCraftingPastelSlabBlock(exporter, DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS, DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_SLAB)
        registerCraftingPastelSlabBlock(exporter, DesolatedPastelsBlocks.BLUE_PLANKS, DesolatedPastelsBlocks.BLUE_PLANK_SLAB)
        registerCraftingPastelSlabBlock(exporter, DesolatedPastelsBlocks.PURPLE_PLANKS, DesolatedPastelsBlocks.PURPLE_PLANK_SLAB)
        registerCraftingPastelSlabBlock(exporter, DesolatedPastelsBlocks.MAGENTA_PLANKS, DesolatedPastelsBlocks.MAGENTA_PLANK_SLAB)
        registerCraftingPastelSlabBlock(exporter, DesolatedPastelsBlocks.BROWN_PLANKS, DesolatedPastelsBlocks.BROWN_PLANK_SLAB)
        registerCraftingPastelSlabBlock(exporter, DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS, DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_SLAB)
        registerCraftingPastelSlabBlock(exporter, DesolatedPastelsBlocks.GRAY_PLANKS, DesolatedPastelsBlocks.GRAY_PLANK_SLAB)
        registerCraftingPastelSlabBlock(exporter, DesolatedPastelsBlocks.BLACK_PLANKS, DesolatedPastelsBlocks.BLACK_PLANK_SLAB)

        registerCraftingPastelStairBlock(exporter, DesolatedPastelsBlocks.WHITE_PLANKS, DesolatedPastelsBlocks.WHITE_PLANK_STAIRS)
        registerCraftingPastelStairBlock(exporter, DesolatedPastelsBlocks.LIGHT_RED_PLANKS, DesolatedPastelsBlocks.LIGHT_RED_PLANK_STAIRS)
        registerCraftingPastelStairBlock(exporter, DesolatedPastelsBlocks.RED_PLANKS, DesolatedPastelsBlocks.RED_PLANK_STAIRS)
        registerCraftingPastelStairBlock(exporter, DesolatedPastelsBlocks.ORANGE_PLANKS, DesolatedPastelsBlocks.ORANGE_PLANK_STAIRS)
        registerCraftingPastelStairBlock(exporter, DesolatedPastelsBlocks.YELLOW_PLANKS, DesolatedPastelsBlocks.YELLOW_PLANK_STAIRS)
        registerCraftingPastelStairBlock(exporter, DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS, DesolatedPastelsBlocks.LIGHT_GREEN_PLANK_STAIRS)
        registerCraftingPastelStairBlock(exporter, DesolatedPastelsBlocks.GREEN_PLANKS, DesolatedPastelsBlocks.GREEN_PLANK_STAIRS)
        registerCraftingPastelStairBlock(exporter, DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS, DesolatedPastelsBlocks.LIGHT_BLUE_PLANK_STAIRS)
        registerCraftingPastelStairBlock(exporter, DesolatedPastelsBlocks.BLUE_PLANKS, DesolatedPastelsBlocks.BLUE_PLANK_STAIRS)
        registerCraftingPastelStairBlock(exporter, DesolatedPastelsBlocks.PURPLE_PLANKS, DesolatedPastelsBlocks.PURPLE_PLANK_STAIRS)
        registerCraftingPastelStairBlock(exporter, DesolatedPastelsBlocks.MAGENTA_PLANKS, DesolatedPastelsBlocks.MAGENTA_PLANK_STAIRS)
        registerCraftingPastelStairBlock(exporter, DesolatedPastelsBlocks.BROWN_PLANKS, DesolatedPastelsBlocks.BROWN_PLANK_STAIRS)
        registerCraftingPastelStairBlock(exporter, DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS, DesolatedPastelsBlocks.LIGHT_GRAY_PLANK_STAIRS)
        registerCraftingPastelStairBlock(exporter, DesolatedPastelsBlocks.GRAY_PLANKS, DesolatedPastelsBlocks.GRAY_PLANK_STAIRS)
        registerCraftingPastelStairBlock(exporter, DesolatedPastelsBlocks.BLACK_PLANKS, DesolatedPastelsBlocks.BLACK_PLANK_STAIRS)

        registerGenericCooking(exporter, DesolatedPastelsItems.RAW_MALLARD, DesolatedPastelsItems.COOKED_MALLARD)
        registerGenericCooking(exporter, DesolatedPastelsItems.RAW_PASTELMON, DesolatedPastelsItems.COOKED_PASTELMON)
    }

    fun registerGenericCooking(
        exporter: RecipeOutput,
        input: ItemLike,
        output: ItemLike,
    ) {
        simpleCookingRecipe(
            exporter,
            "smoking",
            RecipeSerializer.SMOKING_RECIPE,
            ::SmokingRecipe,
            100,
            input,
            output,
            0.7f
        )

        simpleCookingRecipe(
            exporter,
            "campfire_cooking",
            RecipeSerializer.CAMPFIRE_COOKING_RECIPE,
            ::CampfireCookingRecipe,
            600,
            input,
            output,
            0.7f
        )
    }

}