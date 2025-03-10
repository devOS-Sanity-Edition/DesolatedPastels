package one.devos.nautical.desolatedpastels.world

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors
import net.minecraft.core.registries.Registries
import net.minecraft.data.worldgen.BootstrapContext
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.BlockTags
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature
import net.minecraft.world.level.levelgen.feature.Feature
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks

object DesolatedPastelsConfiguredFeatures {
    val OVERWORLD_PASTEL_ORE_KEY: ResourceKey<ConfiguredFeature<*, *>> = registerKey("overworld_pastel_ore")
    val LIGHT_BLUE_TREE_KEY: ResourceKey<ConfiguredFeature<*, *>> = registerKey("light_blue_tree")
    val LIGHT_GREEN_TREE_KEY: ResourceKey<ConfiguredFeature<*, *>> = registerKey("light_green_tree")
    

    fun bootstrap(context: BootstrapContext<ConfiguredFeature<*, *>>) {
        val stoneReplacables = TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES)
        val deepslateReplacables = TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES)

        val overworldPastelOres: List<OreConfiguration.TargetBlockState> =
            listOf(OreConfiguration.target(stoneReplacables, DesolatedPastelsBlocks.PASTEL_ORE.defaultBlockState()),
                OreConfiguration.target(deepslateReplacables, DesolatedPastelsBlocks.PASTEL_ORE.defaultBlockState()))

        register(context, OVERWORLD_PASTEL_ORE_KEY, Feature.ORE, OreConfiguration(overworldPastelOres, 12))
    }

    fun registerKey(name: String?): ResourceKey<ConfiguredFeature<*, *>> {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(DesolatedPastels.MOD_ID, name))
    }

    private fun <FC : FeatureConfiguration?, F : Feature<FC>?> register(
        context: BootstrapContext<ConfiguredFeature<*, *>>,
        key: ResourceKey<ConfiguredFeature<*, *>>, feature: F, configuration: FC
    ) {
        context.register(key, ConfiguredFeature(feature, configuration))
    }
}