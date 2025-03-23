package one.devos.nautical.desolatedpastels.common

import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.flag.FeatureFlags
import net.minecraft.world.inventory.MenuType
import one.devos.nautical.desolatedpastels.DesolatedPastels.MOD_ID
import one.devos.nautical.desolatedpastels.client.menus.ShardCreatorMenu

object DesolatedPastelsMenus {
    val SHARD_CREATOR_MENU_TYPE: MenuType<ShardCreatorMenu> = Registry.register(BuiltInRegistries.MENU, ResourceLocation.fromNamespaceAndPath(MOD_ID, "shard_creator"), MenuType(::ShardCreatorMenu, FeatureFlags.VANILLA_SET))

    fun init() { }
}