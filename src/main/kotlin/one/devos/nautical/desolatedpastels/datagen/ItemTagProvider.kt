package one.devos.nautical.desolatedpastels.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import java.util.concurrent.CompletableFuture

class ItemTagProvider(output: FabricDataOutput, completableFuture: CompletableFuture<HolderLookup.Provider>) : FabricTagProvider.ItemTagProvider(output, completableFuture) {
    companion object {
//        val WOOD =
    }
    override fun addTags(arg: HolderLookup.Provider) {
        TODO("Not yet implemented")
    }
}