package one.devos.nautical.desolatedpastels.common

import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricDefaultAttributeRegistry
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.entity.*
import net.minecraft.world.entity.animal.Animal
import net.minecraft.world.level.levelgen.Heightmap
import one.devos.nautical.desolatedpastels.DesolatedPastels.MOD_ID
import one.devos.nautical.desolatedpastels.common.entities.mallard.MallardEntity
import one.devos.nautical.desolatedpastels.common.entities.pastelmon.PastelmonEntity
import one.devos.nautical.desolatedpastels.common.entities.egg.MallardEggEntity

object DesolatedPastelsEntities {
    val MALLARD_ENTITY: EntityType<MallardEntity> =
        Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            ResourceLocation.fromNamespaceAndPath(MOD_ID, "mallard"),
            EntityType.Builder.of(::MallardEntity, MobCategory.CREATURE)
                .sized(0.65f, 0.65f)
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

    fun init() {
        FabricDefaultAttributeRegistry.register(MALLARD_ENTITY, MallardEntity.createAttributes())
        FabricDefaultAttributeRegistry.register(PASTELMON_ENTITY, PastelmonEntity.createAttributes())
        SpawnPlacements.register(MALLARD_ENTITY, SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Animal::checkAnimalSpawnRules)
        SpawnPlacements.register(PASTELMON_ENTITY, SpawnPlacementTypes.IN_WATER, Heightmap.Types.OCEAN_FLOOR, GlowSquid::checkGlowSquidSpawnRules)
    }
}