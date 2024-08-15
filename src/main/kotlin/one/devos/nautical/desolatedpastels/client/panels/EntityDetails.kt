package one.devos.nautical.desolatedpastels.client.panels

import gay.asoji.innerpastels.client.imgui.ImGuiPanel
import imgui.ImColor
import imgui.ImGui
import imgui.ImGui.*
import imgui.flag.ImGuiCol
import imgui.flag.ImGuiCond
import imgui.type.ImBoolean
import net.minecraft.client.Minecraft
import net.minecraft.util.Mth
import one.devos.nautical.desolatedpastels.client.panels.Constants.client

object EntityDetails : ImGuiPanel {
    override fun theme() {
        val theme = ImGui.getStyle()

        theme.setColor(ImGuiCol.TitleBg, ImColor.rgb("#4f2d02"))
        theme.setColor(ImGuiCol.TitleBgActive, ImColor.rgb("#f8961e"))
    }

    override fun render(open_: ImBoolean) {
        var entityPosHitResultType = ""
        var entityPosHitResultX = 0.0
        var entityPosHitResultY = 0.0
        var entityPosHitResultZ = 0.0
        var entityEyePosHitResultX = 0.0
        var entityEyePosHitResultY = 0.0
        var entityEyePosHitResultZ = 0.0
        var entityEyeRotPosHitResultX = 0.0F
        var entityEyeRotPosHitResultY = 0.0F

        if (!ImGui.begin("Entity Details", open_)) {
            end()
            return
        }

        setWindowSize(400F, 125F, ImGuiCond.FirstUseEver)
        setWindowPos(50F, 750F, ImGuiCond.FirstUseEver)

        if (client.crosshairPickEntity != null) {
            val entity = client.crosshairPickEntity!!

            entityPosHitResultType = entity.type.toString()

            entityEyePosHitResultX = entity.eyePosition.x
            entityEyePosHitResultY = entity.eyePosition.y
            entityEyePosHitResultZ = entity.eyePosition.z

            entityPosHitResultX = entity.x
            entityPosHitResultY = entity.y
            entityPosHitResultZ = entity.z

            entityEyeRotPosHitResultX = entity.getViewXRot(0.0F)
            entityEyeRotPosHitResultY = entity.getViewYRot(0.0F)
        }

        text("Entity: $entityPosHitResultType")
        pushItemWidth(200F)
        inputFloat3("Position", floatArrayOf(entityPosHitResultX.toFloat(), entityPosHitResultY.toFloat(), entityPosHitResultZ.toFloat()))
        inputFloat3("Eye Position", floatArrayOf(entityEyePosHitResultX.toFloat(), entityEyePosHitResultY.toFloat(), entityEyePosHitResultZ.toFloat()))
        inputFloat2("Eye Rotation", floatArrayOf(Mth.wrapDegrees(entityEyeRotPosHitResultX), Mth.wrapDegrees(entityEyeRotPosHitResultY)))

        end()
    }
}