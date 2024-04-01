package one.devos.nautical.desolatedpastels.client.screens

import gay.asoji.fmw.FMW
import glm_.vec2.Vec2
import glm_.vec3.Vec3
import imgui.ImGui
import imgui.ImGui.end
import imgui.ImGui.input3
import imgui.ImGui.separator
import imgui.ImGui.spacing
import imgui.ImGui.text
import imgui.WindowFlags
import imgui.none
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.Minecraft
import net.minecraft.world.entity.Entity
import net.minecraft.world.phys.BlockHitResult
import net.minecraft.world.phys.EntityHitResult
import net.minecraft.world.phys.HitResult
import one.devos.nautical.desolatedpastels.DesolatedPastels.MOD_ID


@Environment(EnvType.CLIENT)
object ImGuiDevPanel {
    operator fun invoke(open_: BooleanArray) {
        val open = open_
        val windowFlags: WindowFlags = none
        val mainViewport = ImGui.mainViewport
        val client = Minecraft.getInstance()
        val clientCamera = client.getCameraEntity()!!
        val hit = clientCamera.pick(20.0, 0.0f, false)
        val block: HitResult? = null // unused atm, keeping here for now
        val liquid: HitResult? = null // unused atm, keeping here for now
        var blockPosHitResultName: String = ""
        var blockPosHitResultX: Int = 0
        var blockPosHitResultY: Int = 0
        var blockPosHitResultZ: Int = 0
        var entityPosHitResultType: String = ""
        var entityPosHitResultX: Double = 0.0
        var entityPosHitResultY: Double = 0.0
        var entityPosHitResultZ: Double = 0.0

//        ImGui.setNextWindowPos(Vec2(mainViewport.center.x - (windowSize.x / 2), mainViewport.center.y - (windowSize.y / 2))/*, Cond.FirstUseEver*/)
        ImGui.windowSize(Vec2(600, 300)/*,  Cond.FirstUseEver */ )

        if (!ImGui.begin("Desolated Pastels - Dev Panel", open, windowFlags)) {
            // Early out if the window is collapsed, as an optimization.
            ImGui.end()
            return
        }


        text("Pastel Dependency Versions")
        separator()
        text("Desolated Pastels: ${FMW.getVersionString(MOD_ID)}")
        text("Softer Pastels: ${FMW.getVersionString("softerpastels")}")
        text("Inner Pastels: ${FMW.getVersionString("innerpastels")}")
        spacing()
        text("Game Information")
        separator()
        text("Game FPS: ${client.fps}")
        text("Application average %.3f ms/frame (%.1f FPS)", 1000f / ImGui.io.framerate, ImGui.io.framerate)
        spacing()
        text("Position")
        separator()
        input3("Co-ordinates", Vec3(clientCamera.x.toFloat(), clientCamera.y.toFloat(), clientCamera.z.toFloat()))
        input3("Block Position: Global", Vec3(clientCamera.blockPosition().x, clientCamera.blockPosition().y, clientCamera.blockPosition().z))
        input3("Block Position: Relative", Vec3((clientCamera.blockPosition().x and 15), (clientCamera.blockPosition().y and 15), (clientCamera.blockPosition().z and 15)))

        when (hit?.type) {
            HitResult.Type.MISS -> { }
            HitResult.Type.BLOCK -> {
                val blockHit = hit as BlockHitResult
                val blockPos = blockHit.blockPos
                val blockState = client.level?.getBlockState(blockPos)

                blockPosHitResultName = blockState.toString()

                blockPosHitResultX = blockPos.x
                blockPosHitResultY = blockPos.y
                blockPosHitResultZ = blockPos.z
                // todo: get tags blockstate text here once i figure out lists
            }
            HitResult.Type.ENTITY -> { }
            null -> { }
        }

        if (client.crosshairPickEntity != null) {
            val entity: Entity? = client.crosshairPickEntity

            entityPosHitResultType = entity?.type.toString()

            entityPosHitResultX = entity!!.x
            entityPosHitResultY = entity.y
            entityPosHitResultZ = entity.z
        }

        text("Targetted Block: $blockPosHitResultName")
        input3("Targetted Block Position", Vec3(blockPosHitResultX, blockPosHitResultY, blockPosHitResultZ))
        text("Entity: $entityPosHitResultType")
        input3("Entity Position", Vec3(entityPosHitResultX, entityPosHitResultY, entityPosHitResultZ))

        end()
    }
}