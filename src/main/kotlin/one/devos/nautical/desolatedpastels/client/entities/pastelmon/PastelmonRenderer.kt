package one.devos.nautical.desolatedpastels.client.entities.pastelmon

import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.renderer.entity.EntityRendererProvider
import net.minecraft.client.renderer.entity.MobRenderer
import net.minecraft.resources.ResourceLocation
import one.devos.nautical.desolatedpastels.common.entities.pastelmon.PastelmonEntity

@Environment(EnvType.CLIENT)
class PastelmonRenderer(context: EntityRendererProvider.Context) :
    MobRenderer<PastelmonEntity, PastelmonModel<PastelmonEntity>>(
        context,
        PastelmonModel(context.bakeLayer(PastelmonModel.LAYER_LOCATION)),
        0.25f
    ) {
    override fun getTextureLocation(entity: PastelmonEntity): ResourceLocation {
        return entity.variant.texture
    }
}