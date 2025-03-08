package one.devos.nautical.desolatedpastels.world

import net.minecraft.core.Holder
import net.minecraft.core.RegistryAccess.RegistryEntry
import net.minecraft.core.registries.Registries
import net.minecraft.data.worldgen.BootstrapContext
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.levelgen.VerticalAnchor
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement
import net.minecraft.world.level.levelgen.placement.PlacedFeature
import net.minecraft.world.level.levelgen.placement.PlacementModifier
import one.devos.nautical.desolatedpastels.DesolatedPastels.MOD_ID


object DesolatedPastelsPlacedFeatures {
//    val PASTEL_ORE_PLACED_OVERWORLD_KEY: ResourceKey<PlacedFeature> = registerKey("pastel_ore_placed_overworld")

    fun bootstrap(context: BootstrapContext<PlacedFeature>) {
        val configuredFeatureRegistryEntryLookup = context.lookup(Registries.CONFIGURED_FEATURE)

//        register(context, PASTEL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(DesolatedPastelsConfiguredFeatures.OVERWORLD_PASTEL_ORE_KEY),
//            DesolatedPastelsOrePlacement.rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(80))))
    }

    fun registerKey(name: String?): ResourceKey<PlacedFeature> {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID, name))
    }

    private fun register(
        context: BootstrapContext<PlacedFeature>,
        key: ResourceKey<PlacedFeature>,
        configuration: Holder<ConfiguredFeature<*, *>>,
        modifiers: List<PlacementModifier>
    ) {
        context.register(key, PlacedFeature(configuration, java.util.List.copyOf(modifiers)))
    }
}