package one.devos.nautical.desolatedpastels.client

import net.createmod.ponder.api.registration.PonderPlugin
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper
import net.createmod.ponder.foundation.ui.PonderUI
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.client.ponder.scenes.BlockScenes
import one.devos.nautical.desolatedpastels.client.ponder.scenes.StructureScenes
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsPonderItems
import one.devos.nautical.softerpastels.common.SofterPastelsBlocks

class DesolatedPastelsPonderPlugin : PonderPlugin {
    override fun getModId(): String {
        return DesolatedPastels.MOD_ID
    }

    override fun registerScenes(helper: PonderSceneRegistrationHelper<ResourceLocation>) {
        val powderBlock: ResourceLocation = BuiltInRegistries.BLOCK.getKey(SofterPastelsBlocks.WHITE_PASTEL_POWDER_BLOCK)
        val pastelBlock: ResourceLocation = BuiltInRegistries.BLOCK.getKey(SofterPastelsBlocks.WHITE_PASTEL_BLOCK)
        val shardCreatorBlock: ResourceLocation = BuiltInRegistries.BLOCK.getKey(DesolatedPastelsBlocks.SHARD_CREATOR)
        val fountainStructure: ResourceLocation = BuiltInRegistries.ITEM.getKey(DesolatedPastelsPonderItems.FOUNTAIN_STRUCTURE_PONDER)
        val mallardStructure: ResourceLocation = BuiltInRegistries.ITEM.getKey(DesolatedPastelsPonderItems.MALLARD_STRUCTURE_PONDER)

        helper.forComponents(shardCreatorBlock).addStoryBoard("blocks/shard_creator") { scene, util ->
            BlockScenes.shardCreator(scene, util)
        }

        helper.forComponents(powderBlock).addStoryBoard("blocks/powder_block") { scene, util ->
            BlockScenes.powderIntro(scene, util)
        }

        helper.forComponents(pastelBlock).addStoryBoard("blocks/portal") { scene, util ->
            BlockScenes.portal(scene, util)
        }

        helper.forComponents(fountainStructure).addStoryBoard("structures/fountain") { scene, util ->
            StructureScenes.fountain(scene, util)
        }

        helper.forComponents(mallardStructure).addStoryBoard("structures/mallard") { scene, util ->
            StructureScenes.mallard(scene, util)
        }
    }
}