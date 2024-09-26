package one.devos.nautical.desolatedpastels.datagen

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.minecraft.core.RegistrySetBuilder
import net.minecraft.core.registries.Registries
import one.devos.nautical.desolatedpastels.world.DesolatedPastelsConfiguredFeatures
import one.devos.nautical.desolatedpastels.world.DesolatedPastelsPlacedFeatures


class DesolatedPastelsDataGenerator : DataGeneratorEntrypoint {
    override fun onInitializeDataGenerator(generator: FabricDataGenerator) {
        val pack = generator.createPack()

        pack.addProvider(::DesolatedPastelsEnglishLanguageProvider)
        pack.addProvider(::DesolatedPastelsBlockTagProvider)
        pack.addProvider(::DesolatedPastelsItemTagProvider)
        pack.addProvider(::DesolatedPastelsModelProvider)
        pack.addProvider(::DesolatedPastelsWorldGeneratorProvider)
    }

    override fun buildRegistry(registryBuilder: RegistrySetBuilder) {
        registryBuilder.add(Registries.CONFIGURED_FEATURE, DesolatedPastelsConfiguredFeatures::bootstrap)
        registryBuilder.add(Registries.PLACED_FEATURE, DesolatedPastelsPlacedFeatures::bootstrap)
    }
}