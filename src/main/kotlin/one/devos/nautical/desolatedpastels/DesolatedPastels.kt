package one.devos.nautical.desolatedpastels

import com.mojang.blaze3d.platform.InputConstants
import gay.asoji.fmw.FMW
import gay.asoji.innerpastels.InnerPastels
import gay.asoji.innerpastels.client.screens.imgui.ImGuiScreen
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricDefaultAttributeRegistry
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricEntityTypeBuilder
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.client.KeyMapping
import net.minecraft.client.Minecraft
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.entity.EntityDimensions
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.MobCategory
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsItems
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsSoundEvents
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsTab
import one.devos.nautical.desolatedpastels.common.entities.mallard.MallardEntity
import org.lwjgl.glfw.GLFW
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object DesolatedPastels : ModInitializer {
    val MOD_ID: String = "desolatedpastels"
    val MOD_VERSION: String = FMW.getVersionString(MOD_ID)
    val MOD_NAME: String = FMW.getName(MOD_ID)

    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)

    val MALLARD_ENTITY: EntityType<MallardEntity> =
        Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            ResourceLocation(MOD_ID, "mallard"),
            FabricEntityTypeBuilder.create(MobCategory.MONSTER, ::MallardEntity)
                .dimensions(EntityDimensions.scalable(0.65f, 0.65f))
                .build()
        )

    val DP_ITEM_GROUP: CreativeModeTab = FabricItemGroup.builder()
        .icon { ItemStack(DesolatedPastelsBlocks.LIGHT_GREEN_LEAVES) }
        .title(Component.translatable("itemGroup.desolatedpastels"))
        .displayItems(DesolatedPastelsTab::build)
        .build()

    val DEVELOPER_GUI = KeyMapping(
        "key.desolatedpastels.developergui",
        InputConstants.Type.KEYSYM,
        GLFW.GLFW_KEY_M,
        "category.desolatedpastels.developer")

    fun InitializeDevKeybinds() {
        val toggleImGuiKeybind = KeyBindingHelper.registerKeyBinding(DEVELOPER_GUI)

        ClientTickEvents.END_CLIENT_TICK.register(::onTick)
    }

    fun onTick(client: Minecraft) {
        while (DEVELOPER_GUI.consumeClick()) {
            if (client.player != null && Minecraft.getInstance().screen == null) {
                client.setScreen(ImGuiScreen())
            }
        }
    }

    override fun onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        if (FabricLoader.getInstance().isDevelopmentEnvironment) {
            InitializeDevKeybinds()
        }

        DesolatedPastelsItems.init()
        DesolatedPastelsBlocks.init()
        DesolatedPastelsSoundEvents.init()

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation("main"), DP_ITEM_GROUP)
        FabricDefaultAttributeRegistry.register(MALLARD_ENTITY, MallardEntity.createAttributes())
        InnerPastels.registerMods(MOD_ID)

        LOGGER.info("[${MOD_NAME}] ${MOD_NAME} Version ${MOD_VERSION}, paired with ${FMW.getName("softerpastels")} Version ${FMW.getVersionString("softerpastels")}, has been loaded.")
        LOGGER.info("[${MOD_NAME}] Internal Library Version ${FMW.getVersionString("innerpastels")} loaded. Please include this when reporting bugs!!!")
        LOGGER.info("[${MOD_NAME}] Turning your days inside out...")
    }
}