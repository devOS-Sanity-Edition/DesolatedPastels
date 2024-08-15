package one.devos.nautical.desolatedpastels.client.panels

import gay.asoji.fmw.FMW
import gay.asoji.innerpastels.client.imgui.ImGuiPanel
import imgui.ImColor
import imgui.ImGui
import imgui.ImGui.*
import imgui.flag.ImGuiCol
import imgui.flag.ImGuiCond
import imgui.type.ImBoolean
import one.devos.nautical.desolatedpastels.DesolatedPastels.MOD_ID

object PastelModsInformation : ImGuiPanel {
    override fun theme() {
        val theme = getStyle()

        theme.setColor(ImGuiCol.TitleBgActive, ImColor.rgb("#f94144"))
        theme.setColor(ImGuiCol.TitleBg, ImColor.rgb("#720405"))
//        theme.setColor(ImGuiCol.TitleBgCollapsed, ImColor.rgb("#00a86b"))
    }

    override fun render(open_: ImBoolean) {
        if (!ImGui.begin("Pastel Mods Information")) {
            end()
            return
        }

        setWindowSize(500F, 85F, ImGuiCond.FirstUseEver)
        setWindowPos(50F, 50F, ImGuiCond.FirstUseEver)

        text("Desolated Pastels: ${FMW.getVersionString(MOD_ID)}")
        text("Softer Pastels: ${FMW.getVersionString("softerpastels")}")
        text("Inner Pastels: ${FMW.getVersionString("innerpastels")}")

        end()
    }
}