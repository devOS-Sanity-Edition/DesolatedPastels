package one.devos.nautical.desolatedpastels.client

import gay.asoji.innerpastels.client.InnerPastelsClient.Companion.panels
import gay.asoji.innerpastels.client.screens.imgui.ImGuiPanel
import gay.asoji.innerpastels.misc.DevDisclaimer
import imgui.ImGui
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.client.entities.mallard.MallardModel
import one.devos.nautical.desolatedpastels.client.entities.mallard.MallardRenderer
import one.devos.nautical.desolatedpastels.client.screens.ImGuiDevPanel

@Environment(EnvType.CLIENT)
class DesolatedPastelsClient : ClientModInitializer {
    override fun onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.

        panels.addAll(
            listOf(
                object: ImGuiPanel { // anything that doesnt extend `ImGuiPanel`, do this
                    override fun render(open_: BooleanArray) {
                        ImGui.showDemoWindow(booleanArrayOf(true))
                    }
                },
                ImGuiDevPanel
            )
        )

        DesolatedPastelsRendering.init()

        DevDisclaimer.init()

        EntityRendererRegistry.register(DesolatedPastels.MALLARD_ENTITY, ::MallardRenderer)

        EntityModelLayerRegistry.registerModelLayer(MallardModel.LAYER_LOCATION, MallardModel.Companion::createBodyLayer)
    }
}