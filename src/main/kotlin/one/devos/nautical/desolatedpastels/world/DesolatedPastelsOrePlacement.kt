package one.devos.nautical.desolatedpastels.world

import net.minecraft.world.level.levelgen.placement.BiomeFilter
import net.minecraft.world.level.levelgen.placement.CountPlacement
import net.minecraft.world.level.levelgen.placement.InSquarePlacement
import net.minecraft.world.level.levelgen.placement.PlacementModifier
import net.minecraft.world.level.levelgen.placement.RarityFilter


object DesolatedPastelsOrePlacement {
    fun orePlacement(countModifier: PlacementModifier, heightModifier: PlacementModifier): List<PlacementModifier> {
        return listOf(countModifier, InSquarePlacement.spread(), heightModifier, BiomeFilter.biome())
    }

    fun commonOrePlacement(count: Int, heightModifier: PlacementModifier): List<PlacementModifier> {
        return orePlacement(CountPlacement.of(count), heightModifier)
    }

    fun rareOrePlacement(chance: Int, heightModifier: PlacementModifier): List<PlacementModifier> {
        return orePlacement(RarityFilter.onAverageOnceEvery(chance), heightModifier)
    }
}