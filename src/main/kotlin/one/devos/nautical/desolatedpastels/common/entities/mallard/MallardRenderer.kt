package one.devos.nautical.desolatedpastels.common.entities.mallard

import net.minecraft.client.model.EntityModel
import net.minecraft.client.renderer.entity.EntityRendererProvider
import net.minecraft.client.renderer.entity.MobRenderer
import net.minecraft.resources.ResourceLocation
import one.devos.nautical.desolatedpastels.DesolatedPastels.MOD_ID


class MallardRenderer(context: EntityRendererProvider.Context) : MobRenderer<MallardEntity, EntityModel<MallardEntity>>(context, MallardModel(context.bakeLayer(MallardModel.LAYER_LOCATION)), 0.25f) {
    override fun getTextureLocation(entity: MallardEntity): ResourceLocation {
        return if (entity.isBaby) {
            MALLARD_LOCATIONS[if (entity.variant <= 2) 2 else 5]
        } else {
            MALLARD_LOCATIONS[entity.variant]
        }
    }

    companion object {
        val MALLARD_LOCATIONS: Array<ResourceLocation> = arrayOf( // Normal Mallards
            ResourceLocation(MOD_ID, "textures/entity/mallard/mallard.png"),
            ResourceLocation(MOD_ID, "textures/entity/mallard/mallady.png"),
            ResourceLocation(MOD_ID, "textures/entity/mallard/mababy.png"),  // Pastel Mallards
            ResourceLocation(MOD_ID, "textures/entity/mallard/pallard.png"),
            ResourceLocation(MOD_ID, "textures/entity/mallard/pallady.png"),
            ResourceLocation(MOD_ID, "textures/entity/mallard/pababy.png")
        )
    }
}