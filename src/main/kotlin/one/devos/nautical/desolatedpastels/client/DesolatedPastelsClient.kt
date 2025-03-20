package one.devos.nautical.desolatedpastels.client

import com.mojang.blaze3d.platform.InputConstants
import gay.asoji.innerpastels.client.ImGuiClient.panels
import gay.asoji.innerpastels.client.imgui.ImGuiPanel
import gay.asoji.innerpastels.misc.DevDisclaimer
import imgui.ImGui
import imgui.type.ImBoolean
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.client.KeyMapping
import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.entity.ThrownItemRenderer
import one.devos.nautical.desolatedpastels.client.entities.mallard.MallardModel
import one.devos.nautical.desolatedpastels.client.entities.mallard.MallardRenderer
import one.devos.nautical.desolatedpastels.client.entities.pastelmon.PastelmonModel
import one.devos.nautical.desolatedpastels.client.entities.pastelmon.PastelmonRenderer
import one.devos.nautical.desolatedpastels.client.panels.*
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsEntities.MALLARD_EGG_ENTITY
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsEntities.MALLARD_ENTITY
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsEntities.PASTELMON_ENTITY
import org.lwjgl.glfw.GLFW

@Environment(EnvType.CLIENT)
class DesolatedPastelsClient : ClientModInitializer {
    private var isImGuiRenderEnabled: Boolean = false
    val DEVELOPER_GUI = KeyMapping(
        "key.desolatedpastels.developergui",
        InputConstants.Type.KEYSYM,
        GLFW.GLFW_KEY_M,
        "category.desolatedpastels.developer")

    fun initializeDevKeybinds() {
        val toggleImGuiKeybind = KeyBindingHelper.registerKeyBinding(DEVELOPER_GUI)

        ClientTickEvents.END_CLIENT_TICK.register(::onTick)
    }

    fun onTick(client: Minecraft) {
        while (DEVELOPER_GUI.consumeClick()) {
            if (client.player != null && client.screen == null) {
                isImGuiRenderEnabled = !isImGuiRenderEnabled
            }
        }
    }

    fun imGuiInitialization() {
        panels.addAll(
            listOf(
                object: ImGuiPanel { // anything that doesnt extend `ImGuiPanel`, do this
                    override fun render(open_: ImBoolean) {
                        ImGui.showDemoWindow() // no more demo window for now
                    }

                    override fun theme() {

                    }
                },
//                    DevDebugSpace
                BlockInformation,
                ClientInfo,
                EntityDetails,
                GameInformation,
                PastelModsInformation,
                PlayerDetails
            )
        )

        initializeDevKeybinds()
    }

    override fun onInitializeClient() {
        if (FabricLoader.getInstance().isDevelopmentEnvironment) {
            // initialize dearimgui panels
            imGuiInitialization()
        }

        DesolatedPastelsRendering.init()
        DevDisclaimer.init()
        EntityRendererRegistry.register(MALLARD_ENTITY, ::MallardRenderer)
        EntityRendererRegistry.register(MALLARD_EGG_ENTITY, ::ThrownItemRenderer)
        EntityRendererRegistry.register(PASTELMON_ENTITY, ::PastelmonRenderer)
        EntityModelLayerRegistry.registerModelLayer(MallardModel.LAYER_LOCATION, MallardModel.Companion::createBodyLayer)
        EntityModelLayerRegistry.registerModelLayer(PastelmonModel.LAYER_LOCATION, PastelmonModel.Companion::createBodyLayer)
    }
}