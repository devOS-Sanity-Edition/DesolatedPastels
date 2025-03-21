package one.devos.nautical.desolatedpastels.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider
import net.minecraft.advancements.Advancement
import net.minecraft.advancements.AdvancementHolder
import net.minecraft.advancements.AdvancementType
import net.minecraft.advancements.critereon.ChangeDimensionTrigger
import net.minecraft.core.HolderLookup
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceLocation
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class DesolatedPastelsAdvancementProvider(
    output: FabricDataOutput?,
    registryLookup: CompletableFuture<HolderLookup.Provider>
) : FabricAdvancementProvider(output, registryLookup) {
    override fun generateAdvancement(registries: HolderLookup.Provider, writer: Consumer<AdvancementHolder>) {
        val rootDesolatedAdvancement = Advancement.Builder.advancement()
            .display(
                DesolatedPastelsBlocks.PASTEL_GRASS,
                Component.translatable("advancements.desolatedpastels.root.title"),
                Component.translatable("advancements.desolatedpastels.root.description"),
                ResourceLocation.tryBuild(DesolatedPastels.MOD_ID, "textures/block/pastel_dirt.png"),
                AdvancementType.TASK,
                true,
                true,
                false
            )
            .addCriterion("entered_desolated", ChangeDimensionTrigger.TriggerInstance.changedDimensionTo(DesolatedPastels.DESOLATED_DIMENSION))
            .save(writer, "${DesolatedPastels.MOD_ID}/root")
    }
}