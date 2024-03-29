package one.devos.nautical.desolatedpastels.client.screens

import imgui.ImGui
import imgui.ImGui.end
import imgui.ImGui.spacing
import imgui.ImGui.text
import imgui.WindowFlags
import imgui.none

object ImGuiDevPanel {
    operator fun invoke(open_: BooleanArray) {
        val open = open_
        val windowFlags: WindowFlags = none
        if (!ImGui.begin("Desolated Pastels - Dev Panel", open, windowFlags)) {
            // Early out if the window is collapsed, as an optimization.
            ImGui.end()
            return
        }

        text("howdy")
        spacing()
        text("goodbye")
        text("this is a quick test of dear imgui :p")
        end()
    }
}