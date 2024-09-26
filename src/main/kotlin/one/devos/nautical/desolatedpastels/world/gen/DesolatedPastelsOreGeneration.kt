package one.devos.nautical.desolatedpastels.world.gen

import net.fabricmc.fabric.api.biome.v1.BiomeModifications
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors
import net.minecraft.world.level.levelgen.GenerationStep
import one.devos.nautical.desolatedpastels.world.DesolatedPastelsPlacedFeatures

object DesolatedPastelsOreGeneration {
    fun generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES, DesolatedPastelsPlacedFeatures.PASTEL_ORE_PLACED_KEY)
    }
}