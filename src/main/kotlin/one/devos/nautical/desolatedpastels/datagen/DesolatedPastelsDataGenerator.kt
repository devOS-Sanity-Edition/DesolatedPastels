package one.devos.nautical.desolatedpastels.datagen

import com.klikli_dev.modonomicon.api.datagen.FabricBookProvider
import com.klikli_dev.modonomicon.api.datagen.LanguageProviderCache
import com.klikli_dev.modonomicon.datagen.EnUsProvider
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.minecraft.core.RegistrySetBuilder
import net.minecraft.core.registries.Registries
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.world.DesolatedPastelsConfiguredFeatures
import one.devos.nautical.desolatedpastels.world.DesolatedPastelsPlacedFeatures


class DesolatedPastelsDataGenerator : DataGeneratorEntrypoint {
    override fun onInitializeDataGenerator(generator: FabricDataGenerator) {
        val pack = generator.createPack()
        val enUsLanguageCache = LanguageProviderCache("en_us")

        pack.addProvider(::DesolatedPastelsAdvancementProvider)
        pack.addProvider(::DesolatedPastelsBlockTagProvider)
        pack.addProvider(::DesolatedPastelsEnglishLanguageProvider)
        pack.addProvider(::DesolatedPastelsEntityLootTableProvider)
        pack.addProvider(::DesolatedPastelsItemTagProvider)
        pack.addProvider(::DesolatedPastelsLootTableProvider)
        pack.addProvider(::DesolatedPastelsModelProvider)
        pack.addProvider(::DesolatedPastelsRecipeProvider)
        pack.addProvider(::DesolatedPastelsWorldGeneratorProvider)

        pack.addProvider(FabricBookProvider.of(DesolatedPastelsBookProvider(enUsLanguageCache)))
        pack.addProvider { output: FabricDataOutput? -> // needed for the books stuff
            DesolatedPastelsBookEnUsProvider(output, DesolatedPastels.MOD_ID, "en_us", enUsLanguageCache)
        }

    }

    override fun buildRegistry(registryBuilder: RegistrySetBuilder) {
        registryBuilder.add(Registries.CONFIGURED_FEATURE, DesolatedPastelsConfiguredFeatures::bootstrap)
        registryBuilder.add(Registries.PLACED_FEATURE, DesolatedPastelsPlacedFeatures::bootstrap)
    }
}