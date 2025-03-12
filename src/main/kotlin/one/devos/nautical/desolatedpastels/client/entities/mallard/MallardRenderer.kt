package one.devos.nautical.desolatedpastels.client.entities.mallard

import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.model.EntityModel
import net.minecraft.client.renderer.entity.EntityRendererProvider
import net.minecraft.client.renderer.entity.MobRenderer
import net.minecraft.resources.ResourceLocation
import one.devos.nautical.desolatedpastels.DesolatedPastels.MOD_ID
import one.devos.nautical.desolatedpastels.common.entities.mallard.MallardEntity

@Environment(EnvType.CLIENT)
class MallardRenderer(context: EntityRendererProvider.Context) : MobRenderer<MallardEntity, EntityModel<MallardEntity>>(context, MallardModel(context.bakeLayer(MallardModel.LAYER_LOCATION)), 0.25f) {
    override fun getTextureLocation(entity: MallardEntity): ResourceLocation {
        return if (entity.isBaby) {
            entity.variant.babyTexture
        } else {
            entity.variant.texture
        }
    }
}