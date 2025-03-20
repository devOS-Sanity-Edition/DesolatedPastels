package one.devos.nautical.desolatedpastels

import gay.asoji.fmw.FMW
import gay.asoji.innerpastels.InnerPastels
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricDefaultAttributeRegistry
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.MobCategory
import net.minecraft.world.entity.SpawnPlacementTypes
import net.minecraft.world.entity.SpawnPlacements
import net.minecraft.world.entity.animal.Animal
import net.minecraft.world.entity.animal.Squid
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level
import net.minecraft.world.level.levelgen.Heightmap
import one.devos.nautical.desolatedpastels.common.*
import one.devos.nautical.desolatedpastels.common.entities.mallard.MallardEntity
import one.devos.nautical.desolatedpastels.common.entities.pastelmon.PastelmonEntity
import one.devos.nautical.desolatedpastels.common.items.MallardEggEntity
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
            EntityType.Builder.of(::MallardEntity, MobCategory.CREATURE)
                .sized(0.65f, 0.65f)
                .build()
        )

    val MALLARD_EGG_ENTITY: EntityType<MallardEggEntity> =
        Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mallard_egg"),
            EntityType.Builder.of(::MallardEggEntity, MobCategory.MISC)
                .sized(0.25f, 0.25f)
                .clientTrackingRange(4)
                .updateInterval(10)
                .build()
        )

    val PASTELMON_ENTITY: EntityType<PastelmonEntity> =
        Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "pastelmon"),
            EntityType.Builder.of(::PastelmonEntity, MobCategory.UNDERGROUND_WATER_CREATURE)
                .sized(0.7f, 0.4f)
                .eyeHeight(0.26f)
                .clientTrackingRange(4)
                .build()
    )

    val DP_ITEM_GROUP: CreativeModeTab = FabricItemGroup.builder()
        .icon { ItemStack(DesolatedPastelsBlocks.LIGHT_GREEN_LEAVES) }
        .title(Component.translatable("itemGroup.desolatedpastels"))
        .displayItems(DesolatedPastelsTab::build)
        .build()

    val DESOLATED_DIMENSION: ResourceKey<Level> = ResourceKey.create(Registries.DIMENSION,
        ResourceLocation.fromNamespaceAndPath(MOD_ID, "desolated"))

    override fun onInitialize() {
        ServerTickEvents.END_WORLD_TICK.register { level ->
            if (level.dimension() != DESOLATED_DIMENSION)
                return@register

            val overworld = level.server.overworld()
            val entities = level.allEntities.toList()

            entities.forEach { entity ->
                if (entity.y < level.dimensionType().minY - 32) {
                    entity.teleportTo(overworld, entity.x, (overworld.dimensionType().minY + overworld.dimensionType().height).toDouble(), entity.z, setOf(), entity.yRot, entity.xRot)
                }
            }
        }

        DesolatedPastelsItems.init()
        DesolatedPastelsBlocks.init()
        DesolatedPastelsSoundEvents.init()
        DesolatedPastelsPortals.init()

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "main"), DP_ITEM_GROUP)
        FabricDefaultAttributeRegistry.register(MALLARD_ENTITY, MallardEntity.createAttributes())
        FabricDefaultAttributeRegistry.register(PASTELMON_ENTITY, PastelmonEntity.createAttributes())
        SpawnPlacements.register(MALLARD_ENTITY, SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules)
        SpawnPlacements.register(PASTELMON_ENTITY, SpawnPlacementTypes.IN_WATER, Heightmap.Types.OCEAN_FLOOR, Squid::checkSurfaceWaterAnimalSpawnRules)
        InnerPastels.registerMods(MOD_ID)

        DesolatedPastelsWorldGeneration.doTheWorldGenMrKrabs()

        LOGGER.info("[${MOD_NAME}] $MOD_NAME Version $MOD_VERSION, paired with ${FMW.getName("softerpastels")} Version ${FMW.getVersionString("softerpastels")}, has been loaded.")
        LOGGER.info("[${MOD_NAME}] Internal Library Version ${FMW.getVersionString("innerpastels")} loaded. Please include this when reporting bugs!!!")
        LOGGER.info("[${MOD_NAME}] Turning your days inside out...")
    }
}