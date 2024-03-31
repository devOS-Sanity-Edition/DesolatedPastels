package one.devos.nautical.desolatedpastels.client.screens

import glm_.vec2.Vec2
import imgui.Cond
import imgui.ImGui
import imgui.ImGui.end
import imgui.ImGui.spacing
import imgui.ImGui.text
import imgui.WindowFlags
import imgui.none
import net.minecraft.client.Minecraft

object ImGuiDevPanel {
    operator fun invoke(open_: BooleanArray) {
        val open = open_
        val windowFlags: WindowFlags = none

        val mainViewport = ImGui.mainViewport
        ImGui.setNextWindowPos(Vec2(mainViewport.workPos.x / 2, mainViewport.workPos.y / 2), Cond.FirstUseEver)
//        ImGui.setNextWindowSize(Vec2(550, 680), Cond.FirstUseEver)

        if (!ImGui.begin("Desolated Pastels - Dev Panel", open, windowFlags)) {
            // Early out if the window is collapsed, as an optimization.
            ImGui.end()
            return
        }

        text("howdy")
        spacing()
        text("goodbye")
        text("this is a quick test of dear imgui :p")
        text("Game FPS: ${Minecraft.getInstance().fps}")
        text("${Minecraft.getInstance().getCameraEntity()?.x}, ${Minecraft.getInstance().getCameraEntity()?.y}, ${Minecraft.getInstance().getCameraEntity()?.z}")
        end()
    }
}