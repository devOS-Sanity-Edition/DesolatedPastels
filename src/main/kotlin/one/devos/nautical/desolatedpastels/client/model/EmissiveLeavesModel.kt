package one.devos.nautical.desolatedpastels.client.model

import net.fabricmc.fabric.api.renderer.v1.model.ForwardingBakedModel
import net.fabricmc.fabric.api.renderer.v1.render.RenderContext
import net.minecraft.client.resources.model.BakedModel
import net.minecraft.core.BlockPos
import net.minecraft.util.RandomSource
import net.minecraft.world.level.BlockAndTintGetter
import net.minecraft.world.level.block.state.BlockState
import java.util.function.Supplier

class EmissiveLeavesModel(wrapped: BakedModel) : ForwardingBakedModel() {
    init {
        this.wrapped = wrapped
    }

    override fun isVanillaAdapter(): Boolean {
        return false
    }

    override fun emitBlockQuads(
        blockView: BlockAndTintGetter,
        state: BlockState,
        pos: BlockPos,
        randomSupplier: Supplier<RandomSource>,
        context: RenderContext
    ) {
        context.pushTransform { quad ->
            quad.lightmap(LIGHT_VALUE, LIGHT_VALUE, LIGHT_VALUE, LIGHT_VALUE)
            true
        }
        super.emitBlockQuads(blockView, state, pos, randomSupplier, context)
        context.popTransform()
    }

    companion object {
        // We're not actually sure how much light this really gives,
        // but it looks good and works well enough.
        const val LIGHT_VALUE = 0x000444
    }
}