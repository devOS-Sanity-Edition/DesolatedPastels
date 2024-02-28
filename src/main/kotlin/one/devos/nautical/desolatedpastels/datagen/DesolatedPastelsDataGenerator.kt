package one.devos.nautical.desolatedpastels.datagen

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator


class DesolatedPastelsDataGenerator : DataGeneratorEntrypoint {
    override fun onInitializeDataGenerator(generator: FabricDataGenerator) {
        val pack = generator.createPack()

        pack.addProvider(::DesolatedPastelsEnglishLanguageProvider)
        pack.addProvider(::DesolatedPastelsItemTagProvider)
        pack.addProvider(::DesolatedPastelsModelProvider)
    }
}