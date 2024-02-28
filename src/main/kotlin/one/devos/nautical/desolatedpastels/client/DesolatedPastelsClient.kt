package one.devos.nautical.desolatedpastels.client

import gay.asoji.innerpastels.misc.DevDisclaimer
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.entities.MallardModel
import one.devos.nautical.desolatedpastels.entities.MallardRenderer



class DesolatedPastelsClient : ClientModInitializer {
    override fun onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.

        DevDisclaimer.init()

        EntityRendererRegistry.register(DesolatedPastels.MALLARD_ENTITY, ({ context -> MallardRenderer(context) }))

        EntityModelLayerRegistry.registerModelLayer(MallardModel.LAYER_LOCATION, MallardModel.Companion::createBodyLayer)
    }
}