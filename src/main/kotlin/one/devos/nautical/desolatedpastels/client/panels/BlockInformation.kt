package one.devos.nautical.desolatedpastels.client.panels

import gay.asoji.innerpastels.client.imgui.ImGuiPanel
import imgui.ImGui
import imgui.ImGui.*
import imgui.flag.ImGuiCond
import imgui.type.ImBoolean
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.world.level.block.state.properties.BlockStateProperties
import net.minecraft.world.phys.BlockHitResult
import net.minecraft.world.phys.HitResult
import one.devos.nautical.desolatedpastels.client.panels.Constants.client
import one.devos.nautical.desolatedpastels.client.panels.Constants.clientCamera

object BlockInformation : ImGuiPanel {
    override fun theme() {

    }

    override fun render(open_: ImBoolean) {
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
        var blockStateTagsHitResultList: MutableList<String> = mutableListOf()
        var fluidBlockStateTagsHitResultList: MutableList<String> = mutableListOf()

        if (!ImGui.begin("Block Information")) {
            end()
            return
        }

        setWindowSize(500F, 500F, ImGuiCond.FirstUseEver)
        setWindowPos(50F, 145F, ImGuiCond.FirstUseEver)

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

        pushItemWidth(200F)
        inputFloat3("Block Position: Global", floatArrayOf(clientCamera.blockPosition().x.toFloat(), clientCamera.blockPosition().y.toFloat(), clientCamera.blockPosition().z.toFloat()))
        inputFloat3("Block Position: Relative", floatArrayOf((clientCamera.blockPosition().x.toFloat()), (clientCamera.blockPosition().y.toFloat()), (clientCamera.blockPosition().z.toFloat())))
        spacing()
        separator()
        spacing()
        text("Targeted Block: $blockHitResultName")
        text("Targeted Block State: $blockStateHitResultName")
//        text("Is Targeted Block Waterlogged?: $blockPosHitResultWaterlogState")
        checkbox("Is Targeted Block Waterlogged?", blockPosHitResultWaterlogState)
        inputFloat3("Targeted Block Position", floatArrayOf(blockPosHitResultX.toFloat(), blockPosHitResultY.toFloat(), blockPosHitResultZ.toFloat()))
        popItemWidth()
        if (beginListBox("Block Tags")) {
            blockStateTagsHitResultList.forEach(_root_ide_package_.imgui.ImGui::selectable)
            endListBox()
        }
        separator()
        text("Targeted Fluid: $fluidBlockPosHitResultFluidState")
        pushItemWidth(200F)
        inputFloat3("Targeted Fluid Block Position", floatArrayOf(fluidBlockPosHitResultX.toFloat(), fluidBlockPosHitResultY.toFloat(), fluidBlockPosHitResultZ.toFloat()))
        popItemWidth()
        if (beginListBox("Fluid Tags")) {
            fluidBlockStateTagsHitResultList.forEach(_root_ide_package_.imgui.ImGui::selectable)
            endListBox()
        }
        end()
    }
}