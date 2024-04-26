package one.devos.nautical.desolatedpastels.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.core.HolderLookup
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsItems
import java.util.concurrent.CompletableFuture

class DesolatedPastelsEnglishLanguageProvider(dataGenerator: FabricDataOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>) : FabricLanguageProvider(dataGenerator, "en_us", registriesFuture) {
    override fun generateTranslations(registryLookup: HolderLookup.Provider?, translationBuilder: TranslationBuilder?) {
        translationBuilder?.add(DesolatedPastelsBlocks.LIGHT_GREEN_LEAVES, "Light Green Pastel Leaves")
        translationBuilder?.add(DesolatedPastelsBlocks.LIGHT_GREEN_LOG, "Light Green Pastel Log")
        translationBuilder?.add(DesolatedPastelsItems.MALLARD_SPAWN_EGG_ITEM, "Mallard Spawn Egg")
        translationBuilder?.add(DesolatedPastels.MALLARD_ENTITY, "Mallard")

        translationBuilder?.add("itemGroup.desolatedpastels", "Desolated Pastels")
    }
}