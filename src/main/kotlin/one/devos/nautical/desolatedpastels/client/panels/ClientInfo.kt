package one.devos.nautical.desolatedpastels.client.panels

import com.mojang.blaze3d.platform.GlUtil
import gay.asoji.innerpastels.client.imgui.ImGuiPanel
import imgui.ImColor
import imgui.ImGui
import imgui.ImGui.*
import imgui.flag.ImGuiCol
import imgui.flag.ImGuiCond
import imgui.type.ImBoolean

object ClientInfo : ImGuiPanel {
    override fun theme() {
        val theme = getStyle()

        theme.setColor(ImGuiCol.TitleBgActive, ImColor.rgb("#f94144"))
        theme.setColor(ImGuiCol.TitleBg, ImColor.rgb("#720405"))
    }

    override fun render(open_: ImBoolean) {
        if (!ImGui.begin("Client Information")) {
            end()
            return
        }

        setWindowSize(400F, 100F, ImGuiCond.FirstUseEver)
        setWindowPos(1470F, 50F, ImGuiCond.FirstUseEver)

        text("CPU: ${GlUtil.getCpuInfo()}")
        text("GPU: ${GlUtil.getRenderer()}")
        text("OpenGL: ${GlUtil.getOpenGLVersion()}")
        text("Java: ${Runtime.version()}")

        end()
    }
}