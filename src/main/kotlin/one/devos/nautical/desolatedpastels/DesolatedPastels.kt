package one.devos.nautical.desolatedpastels

import gay.asoji.fmw.FMW
import gay.asoji.innerpastels.InnerPastels
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricDefaultAttributeRegistry
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricEntityTypeBuilder
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.entity.EntityDimensions
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.MobCategory
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsItems
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsSoundEvents
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsTab
import one.devos.nautical.desolatedpastels.common.entities.mallard.MallardEntity
import one.devos.nautical.desolatedpastels.world.gen.DesolatedPastelsWorldGeneration
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object DesolatedPastels : ModInitializer {
    val MOD_ID: String = "desolatedpastels"
    val MOD_VERSION: String = FMW.getVersionString(MOD_ID)
    val MOD_NAME: String = FMW.getName(MOD_ID)
    val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)

    val MALLARD_ENTITY: EntityType<MallardEntity> =
        Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mallard"),
            FabricEntityTypeBuilder.create(MobCategory.MONSTER, ::MallardEntity)
                .dimensions(EntityDimensions.scalable(0.65f, 0.65f))
                .build()
        )

    val DP_ITEM_GROUP: CreativeModeTab = FabricItemGroup.builder()
        .icon { ItemStack(DesolatedPastelsBlocks.LIGHT_GREEN_LEAVES) }
        .title(Component.translatable("itemGroup.desolatedpastels"))
        .displayItems(DesolatedPastelsTab::build)
        .build()

    override fun onInitialize() {
        DesolatedPastelsItems.init()
        DesolatedPastelsBlocks.init()
        DesolatedPastelsSoundEvents.init()

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "main"), DP_ITEM_GROUP)
        FabricDefaultAttributeRegistry.register(MALLARD_ENTITY, MallardEntity.createAttributes())
        InnerPastels.registerMods(MOD_ID)

        DesolatedPastelsWorldGeneration.doTheWorldGenMrKrabs()

        LOGGER.info("[${MOD_NAME}] ${MOD_NAME} Version ${MOD_VERSION}, paired with ${FMW.getName("softerpastels")} Version ${FMW.getVersionString("softerpastels")}, has been loaded.")
        LOGGER.info("[${MOD_NAME}] Internal Library Version ${FMW.getVersionString("innerpastels")} loaded. Please include this when reporting bugs!!!")
        LOGGER.info("[${MOD_NAME}] Turning your days inside out...")
    }
}