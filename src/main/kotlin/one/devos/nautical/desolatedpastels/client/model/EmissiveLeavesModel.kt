package one.devos.nautical.desolatedpastels.client.model

import net.fabricmc.fabric.api.renderer.v1.RendererAccess
import net.fabricmc.fabric.api.renderer.v1.material.ShadeMode
import net.fabricmc.fabric.api.renderer.v1.model.ForwardingBakedModel
import net.fabricmc.fabric.api.renderer.v1.model.ModelHelper
import net.fabricmc.fabric.api.renderer.v1.render.RenderContext
import net.fabricmc.fabric.api.util.TriState
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

    companion object {
        const val LIGHT_VALUE = 0x000444
        private val MATERIAL = RendererAccess.INSTANCE.renderer!!.materialFinder().shadeMode(ShadeMode.VANILLA).ambientOcclusion(TriState.TRUE).find()
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
        val emitter = context.emitter

        for (i in 0 until ModelHelper.NULL_FACE_ID) {
            val cullFace = ModelHelper.faceFromIndex(i)

            if (!context.hasTransform() && context.isFaceCulled(cullFace))
                continue

            val quads = this.getQuads(state, cullFace, randomSupplier.get())
            for (quad in quads) {
                emitter.fromVanilla(quad, MATERIAL, cullFace)
                emitter.lightmap(LIGHT_VALUE, LIGHT_VALUE, LIGHT_VALUE, LIGHT_VALUE)
                emitter.emit()
            }
        }
    }

}