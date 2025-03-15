package one.devos.nautical.desolatedpastels.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.core.HolderLookup
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsItems
import java.util.concurrent.CompletableFuture

class DesolatedPastelsEnglishLanguageProvider(dataGenerator: FabricDataOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>) : FabricLanguageProvider(dataGenerator, "en_us", registriesFuture) {
    override fun generateTranslations(registryLookup: HolderLookup.Provider, translationBuilder: TranslationBuilder) {
        translationBuilder.add(DesolatedPastelsBlocks.WHITE_LOG, "White Pastel Log")
        translationBuilder.add(DesolatedPastelsBlocks.LIGHT_RED_LOG, "Light Red Pastel Log")
        translationBuilder.add(DesolatedPastelsBlocks.RED_LOG, "Red Pastel Log")
        translationBuilder.add(DesolatedPastelsBlocks.ORANGE_LOG, "Orange Pastel Log")
        translationBuilder.add(DesolatedPastelsBlocks.YELLOW_LOG, "Yellow Pastel Log")
        translationBuilder.add(DesolatedPastelsBlocks.LIGHT_GREEN_LOG, "Light Green Pastel Log")
        translationBuilder.add(DesolatedPastelsBlocks.GREEN_LOG, "Green Pastel Log")
        translationBuilder.add(DesolatedPastelsBlocks.LIGHT_BLUE_LOG, "Light Blue Pastel Log")
        translationBuilder.add(DesolatedPastelsBlocks.BLUE_LOG, "Blue Pastel Log")
        translationBuilder.add(DesolatedPastelsBlocks.PURPLE_LOG, "Purple Pastel Log")
        translationBuilder.add(DesolatedPastelsBlocks.MAGENTA_LOG, "Magenta Pastel Log")
        translationBuilder.add(DesolatedPastelsBlocks.BROWN_LOG, "Brown Pastel Log")
        translationBuilder.add(DesolatedPastelsBlocks.LIGHT_GRAY_LOG, "Light Gray Pastel Log")
        translationBuilder.add(DesolatedPastelsBlocks.GRAY_LOG, "Gray Pastel Log")
        translationBuilder.add(DesolatedPastelsBlocks.BLACK_LOG, "Black Pastel Log")

        translationBuilder.add(DesolatedPastelsBlocks.WHITE_PLANKS, "White Pastel Planks")
        translationBuilder.add(DesolatedPastelsBlocks.LIGHT_RED_PLANKS, "Light Red Pastel Planks")
        translationBuilder.add(DesolatedPastelsBlocks.RED_PLANKS, "Red Pastel Planks")
        translationBuilder.add(DesolatedPastelsBlocks.ORANGE_PLANKS, "Orange Pastel Planks")
        translationBuilder.add(DesolatedPastelsBlocks.YELLOW_PLANKS, "Yellow Pastel Planks")
        translationBuilder.add(DesolatedPastelsBlocks.LIGHT_GREEN_PLANKS, "Light Green Pastel Planks")
        translationBuilder.add(DesolatedPastelsBlocks.GREEN_PLANKS, "Green Pastel Planks")
        translationBuilder.add(DesolatedPastelsBlocks.LIGHT_BLUE_PLANKS, "Light Blue Pastel Planks")
        translationBuilder.add(DesolatedPastelsBlocks.BLUE_PLANKS, "Blue Pastel Planks")
        translationBuilder.add(DesolatedPastelsBlocks.PURPLE_PLANKS, "Purple Pastel Planks")
        translationBuilder.add(DesolatedPastelsBlocks.MAGENTA_PLANKS, "Magenta Pastel Planks")
        translationBuilder.add(DesolatedPastelsBlocks.BROWN_PLANKS, "Brown Pastel Planks")
        translationBuilder.add(DesolatedPastelsBlocks.LIGHT_GRAY_PLANKS, "Light Gray Pastel Planks")
        translationBuilder.add(DesolatedPastelsBlocks.GRAY_PLANKS, "Gray Pastel Planks")
        translationBuilder.add(DesolatedPastelsBlocks.BLACK_PLANKS, "Black Pastel Planks")

        translationBuilder.add(DesolatedPastelsBlocks.WHITE_LEAVES, "White Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.LIGHT_RED_LEAVES, "Light Red Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.RED_LEAVES, "Red Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.ORANGE_LEAVES, "Orange Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.YELLOW_LEAVES, "Yellow Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.LIGHT_GREEN_LEAVES, "Light Green Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.GREEN_LEAVES, "Green Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.LIGHT_BLUE_LEAVES, "Light Blue Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BLUE_LEAVES, "Blue Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.PURPLE_LEAVES, "Purple Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.MAGENTA_LEAVES, "Magenta Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BROWN_LEAVES, "Brown Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.LIGHT_GRAY_LEAVES, "Light Gray Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.GRAY_LEAVES, "Gray Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BLACK_LEAVES, "Black Pastel Leaves")

        translationBuilder.add(DesolatedPastelsBlocks.BRIGHTENED_WHITE_LEAVES, "Brightened White Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_RED_LEAVES, "Brightened Light Red Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BRIGHTENED_RED_LEAVES, "Brightened Red Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BRIGHTENED_ORANGE_LEAVES, "Brightened Orange Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BRIGHTENED_YELLOW_LEAVES, "Brightened Yellow Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_GREEN_LEAVES, "Brightened Light Green Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BRIGHTENED_GREEN_LEAVES, "Brightened Green Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_BLUE_LEAVES, "Brightened Light Blue Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BRIGHTENED_BLUE_LEAVES, "Brightened Blue Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BRIGHTENED_PURPLE_LEAVES, "Brightened Purple Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BRIGHTENED_MAGENTA_LEAVES, "Brightened Magenta Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BRIGHTENED_BROWN_LEAVES, "Brightened Brown Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BRIGHTENED_LIGHT_GRAY_LEAVES, "Brightened Light Gray Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BRIGHTENED_GRAY_LEAVES, "Brightened Gray Pastel Leaves")
        translationBuilder.add(DesolatedPastelsBlocks.BRIGHTENED_BLACK_LEAVES, "Brightened Black Pastel Leaves")

        translationBuilder.add(DesolatedPastelsBlocks.PASTEL_ORE, "Pastel Ore")
        translationBuilder.add(DesolatedPastelsBlocks.PASTEL_STONE, "Pastel Stone")
        translationBuilder.add(DesolatedPastelsBlocks.PASTEL_GRASS, "Pastel Grass")
        translationBuilder.add(DesolatedPastelsBlocks.PASTEL_DIRT, "Pastel Dirt")
        translationBuilder.add(DesolatedPastelsBlocks.PASTEL_SAND, "Pastel Sand")

        translationBuilder.add(DesolatedPastelsBlocks.LIGHT_GREEN_SAPLING, "Light Green Pastel Sapling")
        translationBuilder.add(DesolatedPastelsBlocks.GREEN_SAPLING, "Green Pastel Sapling")
        translationBuilder.add(DesolatedPastelsBlocks.LIGHT_BLUE_SAPLING, "Light Blue Pastel Sapling")
        translationBuilder.add(DesolatedPastelsBlocks.BLUE_SAPLING, "Blue Pastel Sapling")

        translationBuilder.add(DesolatedPastelsItems.MALLARD_SPAWN_EGG_ITEM, "Mallard Spawn Egg")
        translationBuilder.add(DesolatedPastels.MALLARD_ENTITY, "Mallard")

        translationBuilder.add("itemGroup.desolatedpastels", "Desolated Pastels")
    }
}