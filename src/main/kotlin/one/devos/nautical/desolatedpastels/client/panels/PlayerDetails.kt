package one.devos.nautical.desolatedpastels.client.panels

import gay.asoji.innerpastels.client.imgui.ImGuiPanel
import imgui.ImColor
import imgui.ImGui
import imgui.ImGui.*
import imgui.flag.ImGuiCol
import imgui.flag.ImGuiCond
import imgui.type.ImBoolean
import net.minecraft.util.Mth
import one.devos.nautical.desolatedpastels.client.panels.Constants.clientCamera

object PlayerDetails : ImGuiPanel {
    override fun theme() {
        val theme = ImGui.getStyle()

        theme.setColor(ImGuiCol.TitleBg, ImColor.rgb("#562105"))
        theme.setColor(ImGuiCol.TitleBgActive, ImColor.rgb("#f3722c"))

        pushItemWidth(50F)
    }

    override fun render(open_: ImBoolean) {
        if (!ImGui.begin("Player Position", open_)) {
            end()
            return
        }



        setWindowSize(400F, 85F, ImGuiCond.FirstUseEver)
        setWindowPos(50F, 655F, ImGuiCond.FirstUseEver)

        pushItemWidth(200F)
        inputFloat3("Co-ordinates", floatArrayOf(clientCamera.x.toFloat(), clientCamera.y.toFloat(), clientCamera.z.toFloat()))
        inputFloat2("Facing X/Y", floatArrayOf(Mth.wrapDegrees(clientCamera.rotationVector.x), Mth.wrapDegrees(clientCamera.rotationVector.y)))

        end()
    }
}