package one.devos.nautical.desolatedpastels.common

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder
import net.minecraft.resources.ResourceLocation
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks
import one.devos.nautical.softerpastels.common.SofterPastelsItems

object DesolatedPastelsPortals {
    fun init() {
        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.WHITE_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.WHITE_POWDER)
            .lightWithItem(DesolatedPastelsItems.PASTEL_SHARD)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(227,227,227)
            .registerPortal();

        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.LIGHT_RED_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.LIGHT_RED_POWDER)
            .lightWithItem(DesolatedPastelsItems.PASTEL_SHARD)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(197,136,136)
            .registerPortal();

        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.RED_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.LIGHT_RED_POWDER)
            .lightWithItem(DesolatedPastelsItems.PASTEL_SHARD)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(165,91,92)
            .registerPortal();

        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.ORANGE_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.ORANGE_POWDER)
            .lightWithItem(DesolatedPastelsItems.PASTEL_SHARD)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(186,117,95)
            .registerPortal();

        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.YELLOW_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.YELLOW_POWDER)
            .lightWithItem(DesolatedPastelsItems.PASTEL_SHARD)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(236,208,146)
            .registerPortal();

        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.LIGHT_GREEN_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.LIGHT_GREEN_POWDER)
            .lightWithItem(DesolatedPastelsItems.PASTEL_SHARD)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(135,187,125)
            .registerPortal();

        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.GREEN_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.GREEN_POWDER)
            .lightWithItem(DesolatedPastelsItems.PASTEL_SHARD)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(101,138,100)
            .registerPortal();

        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.LIGHT_BLUE_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.LIGHT_BLUE_POWDER)
            .lightWithItem(DesolatedPastelsItems.PASTEL_SHARD)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(114,171,188)
            .registerPortal();

        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.BLUE_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.BLUE_POWDER)
            .lightWithItem(DesolatedPastelsItems.PASTEL_SHARD)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(97,138,170)
            .registerPortal();

        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.PURPLE_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.PURPLE_POWDER)
            .lightWithItem(DesolatedPastelsItems.PASTEL_SHARD)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(130,111,197)
            .registerPortal();

        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.MAGENTA_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.MAGENTA_POWDER)
            .lightWithItem(DesolatedPastelsItems.PASTEL_SHARD)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(171,118,203)
            .registerPortal();

        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.BROWN_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.BROWN_POWDER)
            .lightWithItem(DesolatedPastelsItems.PASTEL_SHARD)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(120,89,73)
            .registerPortal();

        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.LIGHT_GRAY_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.LIGHT_GRAY_POWDER)
            .lightWithItem(DesolatedPastelsItems.PASTEL_SHARD)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(118,132,133)
            .registerPortal();

        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.GRAY_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.GRAY_POWDER)
            .lightWithItem(DesolatedPastelsItems.PASTEL_SHARD)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(76,91,91)
            .registerPortal();

        CustomPortalBuilder.beginPortal()
            .frameBlock(SofterPastelsBlocks.BLACK_PASTEL_BLOCK)
            .lightWithItem(SofterPastelsItems.BLACK_POWDER)
            .lightWithItem(DesolatedPastelsItems.PASTEL_SHARD)
            .destDimID(ResourceLocation.fromNamespaceAndPath("desolatedpastels", "desolated"))
            .tintColor(29,30,31)
            .registerPortal();
    }
}