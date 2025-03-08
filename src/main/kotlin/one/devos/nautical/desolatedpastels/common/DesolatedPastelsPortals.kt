package one.devos.nautical.desolatedpastels.common

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder
import net.minecraft.resources.ResourceLocation
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks
import one.devos.nautical.softerpastels.common.SofterPastelsItems

object DesolatedPastelsPortals {
    fun init() {
        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.LIGHT_BLUE_POWDER)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(114,171,188)
            .registerPortal();
    }
}