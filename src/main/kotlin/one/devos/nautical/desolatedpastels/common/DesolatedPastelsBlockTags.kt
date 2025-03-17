package one.devos.nautical.desolatedpastels.common

import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.level.block.Block
import one.devos.nautical.desolatedpastels.DesolatedPastels

object DesolatedPastelsBlockTags {
    @JvmField
    val PASTEL_ORE_REPLACEABLES = create("pastel_ore_replaceables")

    private fun create(name: String): TagKey<Block> {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(DesolatedPastels.MOD_ID, name))
    }
}