package one.devos.nautical.desolatedpastels.client.screens

import gay.asoji.fmw.FMW
import gay.asoji.innerpastels.client.screens.imgui.ImGuiPanel
import glm_.vec2.Vec2
import glm_.vec3.Vec3
import imgui.ImGui
import imgui.ImGui.beginListBox
import imgui.ImGui.checkbox
import imgui.ImGui.end
import imgui.ImGui.endListBox
import imgui.ImGui.input2
import imgui.ImGui.input3
import imgui.ImGui.selectable
import imgui.ImGui.separator
import imgui.ImGui.spacing
import imgui.ImGui.text
import imgui.WindowFlags
import imgui.none
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.Minecraft
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.util.Mth
import net.minecraft.world.entity.Entity
import net.minecraft.world.level.block.state.properties.BlockStateProperties
import net.minecraft.world.phys.BlockHitResult
import net.minecraft.world.phys.HitResult
import one.devos.nautical.desolatedpastels.DesolatedPastels.MOD_ID


@Environment(EnvType.CLIENT)
object ImGuiDevPanel : ImGuiPanel {
    override fun render(open_: BooleanArray) {
        val open = open_
        val windowFlags: WindowFlags = none
        val mainViewport = ImGui.mainViewport
        val client = Minecraft.getInstance()
        val clientCamera = client.getCameraEntity()!!
        val blockRaycastHit = clientCamera.pick(50.0, 0.0f, false)
        val fluidRaycastHit = clientCamera.pick(50.0, 0.0f, true)
        var blockHitResultName = ""
        var blockStateHitResultName = ""
        var blockPosHitResultWaterlogState = false
        var blockPosHitResultX = 0
        var blockPosHitResultY = 0
        var blockPosHitResultZ = 0
        var fluidHitResultName = ""
        var fluidBlockPosHitResultFluidState = ""
        var fluidBlockPosHitResultX = 0
        var fluidBlockPosHitResultY = 0
        var fluidBlockPosHitResultZ = 0
        var entityPosHitResultType = ""
        var entityPosHitResultX = 0.0
        var entityPosHitResultY = 0.0
        var entityPosHitResultZ = 0.0
        var entityEyePosHitResultX = 0.0
        var entityEyePosHitResultY = 0.0
        var entityEyePosHitResultZ = 0.0
        var entityEyeRotPosHitResultX = 0.0F
        var entityEyeRotPosHitResultY = 0.0F
        var blockStateTagsHitResultList: MutableList<String> = mutableListOf()
        var fluidBlockStateTagsHitResultList: MutableList<String> = mutableListOf()

        ImGui.windowSize(Vec2(600, 300)/*,  Cond.FirstUseEver */)

        if (!ImGui.begin("Desolated Pastels - Dev Panel", open, windowFlags)) {
            // Early out if the window is collapsed, as an optimization.
            ImGui.end()
            return
        }

        if (blockRaycastHit.type == HitResult.Type.BLOCK) {
            val blockHit = blockRaycastHit as BlockHitResult
            val blockPos = blockHit.blockPos
            val blockState = client.level!!.getBlockState(blockPos)

            blockHitResultName = blockState!!.block.name.string
            blockStateHitResultName = blockState.block.stateDefinition.toString()

            blockPosHitResultX = blockPos.x
            blockPosHitResultY = blockPos.y
            blockPosHitResultZ = blockPos.z
            if (blockState.hasProperty(BlockStateProperties.WATERLOGGED)) {
                blockPosHitResultWaterlogState = blockState.getValue(BlockStateProperties.WATERLOGGED)
            }

            blockState.tags.map { tagKey -> "#" + tagKey.location() }.forEach { e -> blockStateTagsHitResultList.add(e) }
        }

        if (fluidRaycastHit.type == HitResult.Type.BLOCK) {
            val blockHit = fluidRaycastHit as BlockHitResult
            val blockPos = blockHit.blockPos
            val fluidState = client.level!!.getFluidState(blockPos)

            fluidHitResultName = fluidState!!.type.toString()
            fluidBlockPosHitResultFluidState = BuiltInRegistries.FLUID.getKey(fluidState.type).toString()

            if (fluidBlockPosHitResultFluidState.contains("EmptyFluid")) {
                fluidBlockPosHitResultFluidState = "Not a fluid!"
            }

            fluidBlockPosHitResultX = blockPos.x
            fluidBlockPosHitResultY = blockPos.y
            fluidBlockPosHitResultZ = blockPos.z

            fluidState.tags.map { tagKey -> "#" + tagKey.location }.forEach { e -> fluidBlockStateTagsHitResultList.add(e) }
        }

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
        input2("Facing X/Y", Vec2(Mth.wrapDegrees(clientCamera.rotationVector.x), Mth.wrapDegrees(clientCamera.rotationVector.y)))
        input3("Block Position: Global", Vec3(clientCamera.blockPosition().x, clientCamera.blockPosition().y, clientCamera.blockPosition().z))
        input3("Block Position: Relative", Vec3((clientCamera.blockPosition().x and 15), (clientCamera.blockPosition().y and 15), (clientCamera.blockPosition().z and 15)))
        spacing()
        separator()
        spacing()
        text("Targeted Block: $blockHitResultName")
        text("Targeted Block State: $blockStateHitResultName")
//        text("Is Targeted Block Waterlogged?: $blockPosHitResultWaterlogState")
        checkbox("Is Targeted Block Waterlogged?", booleanArrayOf(blockPosHitResultWaterlogState))
        input3("Targeted Block Position", Vec3(blockPosHitResultX, blockPosHitResultY, blockPosHitResultZ))
        if (beginListBox("Block Tags")) {
            blockStateTagsHitResultList.forEach(::selectable)
            endListBox()
        }
        separator()
        text("Targeted Fluid: $fluidBlockPosHitResultFluidState")
        input3("Targeted Fluid Block Position", Vec3(fluidBlockPosHitResultX, fluidBlockPosHitResultY, fluidBlockPosHitResultZ))
        if (beginListBox("Fluid Tags")) {
            fluidBlockStateTagsHitResultList.forEach(::selectable)
            endListBox()
        }
        separator()
        text("Entity: $entityPosHitResultType")
        input3("Entity Position", Vec3(entityPosHitResultX, entityPosHitResultY, entityPosHitResultZ))
        input3("Entity Eye Position", Vec3(entityEyePosHitResultX, entityEyePosHitResultY, entityEyePosHitResultZ))
        input2("Entity Eye Rotation", Vec2(Mth.wrapDegrees(entityEyeRotPosHitResultX), Mth.wrapDegrees(entityEyeRotPosHitResultY)))

        end()
    }
}