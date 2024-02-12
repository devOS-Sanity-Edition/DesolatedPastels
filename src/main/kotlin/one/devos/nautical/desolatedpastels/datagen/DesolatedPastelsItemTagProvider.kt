package one.devos.nautical.desolatedpastels.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item
import one.devos.nautical.SofterPastels.SofterPastels
import one.devos.nautical.desolatedpastels.common.Items
import java.util.concurrent.CompletableFuture

class DesolatedPastelsItemTagProvider(
    output: FabricDataOutput,
    completableFuture: CompletableFuture<HolderLookup.Provider>
) : FabricTagProvider.ItemTagProvider(output, completableFuture) {
    companion object {
        val TESTTAG: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation(SofterPastels.MOD_ID, "testtag"))
    }

    override fun addTags(arg: HolderLookup.Provider) {
        getOrCreateTagBuilder(TESTTAG)
            .add(Items.TEST_ITEM)
    }
}