package one.devos.nautical.desolatedpastels.client.screens

import gln.cap.Caps
import imgui.ImGui
import imgui.MINECRAFT_BEHAVIORS
import imgui.classes.Context
import imgui.classes.IO
import imgui.impl.gl.ImplGL3
import imgui.impl.glfw.ImplGlfw
import imgui.internal.DrawData
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.GuiGraphics
import net.minecraft.client.gui.screens.Screen
import net.minecraft.network.chat.Component
import uno.gl.GlWindow
import uno.glfw.GlfwWindow
import java.util.*


@Environment(EnvType.CLIENT)
class DesolatedPastelsImGuiScreen : Screen(Component.literal("ImguiScreen")) {
    // Prevents Minecraft from pausing the game whenever we open the GUI.
    override fun isPauseScreen(): Boolean {
        return false
    }


    // Tells imgui to enter a character, when typing on a textbox or similar.
    override fun charTyped(chr: Char, keyCode: Int): Boolean {
        if (imgui.io.wantTextInput) {
            imgui.io.addInputCharacter(chr)
        }

        super.charTyped(chr, keyCode)
        return true
    }

    // Passes mouse scrolling to imgui.
    override fun mouseScrolled(mouseX: Double, mouseY: Double, scrollX: Double, scrollY: Double): Boolean {
        if (imgui.io.wantCaptureMouse) {
            imgui.io.mouseWheel = scrollY.toFloat()
        }

        super.mouseScrolled(mouseX, mouseY, scrollX, scrollY)
        return true
    }

    // Passes keypresses for imgui to handle.
    override fun keyPressed(keyCode: Int, scanCode: Int, modifiers: Int): Boolean {
        if (imgui.io.wantCaptureKeyboard) {
            imgui.io.keysData[keyCode].down = true
            keyBuffer.add(keyCode)
        }

        // Skip handling of the ESC key, because Minecraft uses it to close the screen.
        if (keyCode == 256) {
            imgui.io.keysData.get(256).down = false
        }

        super.keyPressed(keyCode, scanCode, modifiers)
        return true
    }

    // Tells imgui the keys pressed have been released.
    override fun keyReleased(keyCode: Int, scanCode: Int, modifiers: Int): Boolean {
        imgui.io.keysData[keyCode].down = false
        keyBuffer.remove(keyCode)

        super.keyReleased(keyCode, scanCode, modifiers)
        return true
    }

    override fun onClose() {
        // When Minecraft closes the screen, clear the key buffer.
        for (keyCode in keyBuffer) {
            imgui.io.keysData[keyCode]
            imgui.io.keysData[keyCode].down = false
        }
        keyBuffer.clear()

        super.onClose()
    }

    override fun render(guiGraphics: GuiGraphics, x: Int, y: Int, partialTicks: Float) {
        ImGuiIO = imgui.io

        implGl3.newFrame()
        implGlfw.newFrame()
        imgui.newFrame()

        ImGuiDevPanel.invoke(booleanArrayOf(true))
        ImGui.showDemoWindow(booleanArrayOf(true))

        imgui.render()
        implGl3.renderDrawData(Objects.requireNonNull<DrawData>(ImGui.drawData))
    }

    companion object {
        val imgui = ImGui

        var implGl3: ImplGL3
        var implGlfw: ImplGlfw

        var ImGuiIO: IO? = null
        val keyBuffer = HashSet<Int>()

        // Initialization for imgui.
        init {
            MINECRAFT_BEHAVIORS = true

            val glfwWindow = GlfwWindow(Minecraft.getInstance().window.window)
            val window = GlWindow(glfwWindow, Caps.Profile.COMPATIBILITY, true)

            window.makeCurrent(true)
            Context().setCurrent()

            implGlfw = ImplGlfw(window, false, null)
            implGl3 = ImplGL3()
        }
    }
}