package one.devos.nautical.desolatedpastels.client.panels

import gay.asoji.innerpastels.client.imgui.ImGuiPanel
import imgui.ImGui
import imgui.ImGui.end
import imgui.type.ImBoolean

object ImGuiTest : ImGuiPanel {
    override fun theme() {

    }

    override fun render(open_: ImBoolean) {
        if (!ImGui.begin("ImGuiTest")) {
            end()
            return
        }

        end()
    }
}