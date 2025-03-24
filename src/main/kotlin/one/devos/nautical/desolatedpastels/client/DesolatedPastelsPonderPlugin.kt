package one.devos.nautical.desolatedpastels.client

import net.createmod.ponder.api.registration.PonderPlugin
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.client.ponder.scenes.PowderBlock
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks

class DesolatedPastelsPonderPlugin : PonderPlugin {
    override fun getModId(): String {
        return DesolatedPastels.MOD_ID
    }

    override fun registerScenes(helper: PonderSceneRegistrationHelper<ResourceLocation>) {
        val powderBlock: ResourceLocation = BuiltInRegistries.BLOCK.getKey(SofterPastelsBlocks.WHITE_PASTEL_POWDER_BLOCK)

        helper.forComponents(powderBlock).addStoryBoard("blocks/powder_block") { scene, util ->
            PowderBlock.powderIntro(scene, util)
        }
    }
}