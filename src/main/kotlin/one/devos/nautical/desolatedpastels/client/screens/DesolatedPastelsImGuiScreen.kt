package one.devos.nautical.desolatedpastels.client.screens

import gln.cap.Caps
import imgui.ImGui
import imgui.MINECRAFT_BEHAVIORS
import imgui.MouseButton
import imgui.classes.Context
import imgui.impl.gl.ImplGL3
import imgui.impl.glfw.ImplGlfw
import imgui.impl.glfw.ImplGlfw.Companion.imguiKey
import imgui.internal.DrawData
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.GuiGraphics
import net.minecraft.client.gui.screens.Screen
import net.minecraft.network.chat.Component
import org.lwjgl.glfw.GLFW
import uno.gl.GlWindow
import uno.glfw.GlfwWindow
import java.util.*


@Environment(EnvType.CLIENT)
class DesolatedPastelsImGuiScreen : Screen(Component.literal("ImguiScreen")) {
    // Prevents Minecraft from pausing the game whenever we open the GUI.
    override fun isPauseScreen(): Boolean {
        return false
    }

    override fun mouseReleased(mouseX: Double, mouseY: Double, button: Int): Boolean {
        if (imgui.io.wantCaptureMouse) {
            imgui.io.addMouseButtonEvent(MouseButton.of(button), false)
        }

        return super.mouseReleased(mouseX, mouseY, button)
    }

    override fun mouseScrolled(mouseX: Double, mouseY: Double, scrollX: Double, scrollY: Double): Boolean {
        if (imgui.io.wantCaptureMouse) {
            imgui.io.mouseWheelH = scrollX.toFloat()
            imgui.io.mouseWheel = scrollY.toFloat()
        }

        return super.mouseScrolled(mouseX, mouseY, scrollX, scrollY)
    }

    override fun mouseClicked(mouseX: Double, mouseY: Double, button: Int): Boolean {
        if (imgui.io.wantCaptureMouse) {
            imgui.io.addMouseButtonEvent(MouseButton.of(button), true)
        }

        return super.mouseClicked(mouseX, mouseY, button)
    }

    override fun keyPressed(keyCode: Int, scanCode: Int, modifiers: Int): Boolean {
        val key = uno.glfw.Key.of(keyCode).imguiKey

        imgui.io.keyCtrl = modifiers and GLFW.GLFW_MOD_CONTROL != 0
        imgui.io.keyShift = modifiers and GLFW.GLFW_MOD_SHIFT != 0
        imgui.io.keyAlt = modifiers and GLFW.GLFW_MOD_ALT != 0
        imgui.io.keySuper = modifiers and GLFW.GLFW_MOD_SUPER != 0

        imgui.io.addKeyEvent(key, true)
        imgui.io.keysData[key.index].down = true
        imgui.io.setKeyEventNativeData(key, key.i, scanCode)

        return super.keyPressed(keyCode, scanCode, modifiers)
    }

    override fun keyReleased(keyCode: Int, scanCode: Int, modifiers: Int): Boolean {
        val key = uno.glfw.Key.of(keyCode).imguiKey

        imgui.io.keyCtrl = modifiers and GLFW.GLFW_MOD_CONTROL != 0
        imgui.io.keyShift = modifiers and GLFW.GLFW_MOD_SHIFT != 0
        imgui.io.keyAlt = modifiers and GLFW.GLFW_MOD_ALT != 0
        imgui.io.keySuper = modifiers and GLFW.GLFW_MOD_SUPER != 0

        imgui.io.addKeyEvent(key, false)
        imgui.io.keysData[key.index].down = false
        imgui.io.setKeyEventNativeData(key, key.i, scanCode)

        return super.keyReleased(keyCode, scanCode, modifiers)
    }

    override fun charTyped(codePoint: Char, modifiers: Int): Boolean {
        imgui.io.keyCtrl = modifiers and GLFW.GLFW_MOD_CONTROL != 0
        imgui.io.keyShift = modifiers and GLFW.GLFW_MOD_SHIFT != 0
        imgui.io.keyAlt = modifiers and GLFW.GLFW_MOD_ALT != 0
        imgui.io.keySuper = modifiers and GLFW.GLFW_MOD_SUPER != 0

        imgui.io.addInputCharacter(codePoint)

        return super.charTyped(codePoint, modifiers)
    }

    override fun render(guiGraphics: GuiGraphics, x: Int, y: Int, partialTicks: Float) {
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

        // Initialization for imgui.
        init {
            MINECRAFT_BEHAVIORS = true

            val glfwWindow = GlfwWindow(Minecraft.getInstance().window.window)
            val window = GlWindow(glfwWindow, Caps.Profile.CORE, true)

            window.makeCurrent(true)
            Context().setCurrent()

            implGlfw = ImplGlfw(window, false, null)
            implGl3 = ImplGL3()
        }
    }
}