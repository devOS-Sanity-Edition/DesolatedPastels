package one.devos.nautical.desolatedpastels.client.panels

import gay.asoji.innerpastels.client.imgui.ImGuiPanel
import imgui.ImGui
import imgui.ImGui.*
import imgui.type.ImBoolean

object DevDebugSpace : ImGuiPanel {
    // work on later
    override fun render(open_: ImBoolean) {
        val isDebugPanelOpen: Boolean = false

        if (!ImGui.begin("Desolated Pastels")) {
            end()
            return
        }

        if (ImGui.beginMenuBar()) {
            if (ImGui.beginMenu("Tools")) {
                ImGui.menuItem("Debug Panel", "", ImBoolean(isDebugPanelOpen))
                endMenu()
            }
            endMenuBar()
        }

        if (isDebugPanelOpen) {
            ImGuiDevPanel
        }

        end()
    }

    override fun theme() {

    }
}