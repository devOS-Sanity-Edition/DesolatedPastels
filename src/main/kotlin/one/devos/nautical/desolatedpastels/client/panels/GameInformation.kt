package one.devos.nautical.desolatedpastels.client.panels

import gay.asoji.innerpastels.client.imgui.ImGuiPanel
import imgui.ImColor
import imgui.ImGui
import imgui.ImGui.*
import imgui.flag.ImGuiCol
import imgui.flag.ImGuiCond
import imgui.type.ImBoolean
import net.fabricmc.loader.api.FabricLoader
import net.fabricmc.loader.api.ModContainer
import net.fabricmc.loader.api.metadata.ModMetadata
import net.minecraft.SharedConstants
import net.minecraft.client.ClientBrandRetriever
import one.devos.nautical.desolatedpastels.client.panels.Constants.client
import one.devos.nautical.desolatedpastels.client.panels.Constants.io

object GameInformation : ImGuiPanel {
    override fun theme() {
        val theme = ImGui.getStyle()

        theme.setColor(ImGuiCol.TitleBg, ImColor.rgb("#562105"))
        theme.setColor(ImGuiCol.TitleBgActive, ImColor.rgb("#f3722c"))
    }

    override fun render(open_: ImBoolean) {

        if (!ImGui.begin("Game Information")) {
            end()
            return
        }

        setWindowSize(400F, 225F, ImGuiCond.FirstUseEver)
        setWindowPos(1470F, 160F, ImGuiCond.FirstUseEver)

        text("Version/Loader: ${SharedConstants.getCurrentVersion().name} ${client.launchedVersion}/${ClientBrandRetriever.getClientModName()}")
        text("Game FPS: ${client.fps}")
        text(String.format("Application average %.3f ms/frame (%.1f FPS)", 1000f / io.framerate, io.framerate))

        if (beginListBox("Mods")) {
            FabricLoader.getInstance().allMods.map(ModContainer::getMetadata).map(ModMetadata::getName).forEach(::selectable)
            endListBox()
        }

        end()
    }
}