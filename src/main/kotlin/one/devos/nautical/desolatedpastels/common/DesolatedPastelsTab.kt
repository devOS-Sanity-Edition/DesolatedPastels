package one.devos.nautical.desolatedpastels.common

import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.CreativeModeTab.Output
import net.minecraft.world.level.ItemLike

object DesolatedPastelsTab {
    fun build(params: CreativeModeTab.ItemDisplayParameters, output: CreativeModeTab.Output) {
        addBlocks(output)
        addDecorations(output)
    }

    private fun addBlocks(output: Output) {
        addAll(
            output,
            DesolatedPastelsBlocks.LIGHT_GREEN_LOG
        )
    }

    private fun addDecorations(output: Output) {
        addAll(
            output,
            DesolatedPastelsBlocks.LIGHT_GREEN_LEAVES
        )
    }

    private fun addAll(output: Output, vararg items: ItemLike) {
        for (item in items) {
            output.accept(item)
        }
    }
}