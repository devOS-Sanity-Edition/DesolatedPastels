package one.devos.nautical.desolatedpastels.common

import gay.asoji.innerpastels.misc.secondsToTicks
import gay.asoji.innerpastels.register.RegisterItems.registerItem
import net.fabricmc.fabric.api.loot.v3.LootTableEvents
import net.minecraft.core.component.DataComponents
import net.minecraft.sounds.SoundEvents
import net.minecraft.core.dispenser.ProjectileDispenseBehavior
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.minecraft.world.item.MobBucketItem
import net.minecraft.world.item.SpawnEggItem
import net.minecraft.world.item.component.CustomData
import net.minecraft.world.level.material.Fluids
import net.minecraft.world.item.*
import net.minecraft.world.level.block.DispenserBlock
import net.minecraft.world.level.storage.loot.BuiltInLootTables
import net.minecraft.world.level.storage.loot.entries.LootItem
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.DesolatedPastels.MALLARD_EGG_ENTITY
import one.devos.nautical.desolatedpastels.DesolatedPastels.MALLARD_ENTITY
import one.devos.nautical.desolatedpastels.DesolatedPastels.PASTELMON_ENTITY
import one.devos.nautical.desolatedpastels.common.items.MallardEggItem


object DesolatedPastelsItems {
    @JvmField
    val TEST_ITEM: Item = registerItem(DesolatedPastels.MOD_ID, "test_item", Item(Item.Properties()))
    val MALLARD_SPAWN_EGG_ITEM: Item = registerItem(DesolatedPastels.MOD_ID, "mallard_spawn_egg", SpawnEggItem(MALLARD_ENTITY, 0xdad1ca, 0x22af6a, Item.Properties()))
    val PASTELMON_SPAWN_EGG_ITEM: Item = registerItem(DesolatedPastels.MOD_ID, "pastelmon_spawn_egg", SpawnEggItem(PASTELMON_ENTITY, 0x85ccd3, 0xa681cd, Item.Properties()))

    val MALLARD_EGG_ITEM: Item = registerItem(DesolatedPastels.MOD_ID, "mallard_egg", MallardEggItem(Item.Properties().stacksTo(16), MALLARD_EGG_ENTITY, MALLARD_ENTITY))
    val ROTTEN_MALLARD_EGG_ITEM: Item = registerItem(DesolatedPastels.MOD_ID, "rotten_mallard_egg", Item(Item.Properties()
        .stacksTo(16)
        .food(FoodProperties.Builder()
            .effect(MobEffectInstance(MobEffects.POISON, 20.secondsToTicks(), 0), 1f)
            .build()
        )
    ))

    val RAW_MALLARD: Item = registerItem(DesolatedPastels.MOD_ID, "raw_mallard", Item(
        Item.Properties()
            .food(FoodProperties.Builder()
                .nutrition(1)
                .saturationModifier(0f)
                .alwaysEdible()
                .effect(MobEffectInstance(MobEffects.BLINDNESS, 20.secondsToTicks(), 1), 0.2f)
                .effect(MobEffectInstance(MobEffects.POISON, 20.secondsToTicks(), 1), 0.8f)
                .build()
            )
    ))
    val COOKED_MALLARD: Item = registerItem(DesolatedPastels.MOD_ID, "cooked_mallard", Item(
        Item.Properties()
            .food(FoodProperties.Builder()
                .nutrition(7)
                .saturationModifier(0.7f)
                .fast()
                .build()
            )
    ))
    val MALLARD_SOUP: Item = registerItem(DesolatedPastels.MOD_ID, "mallard_soup", Item(
        Item.Properties()
            .food(FoodProperties.Builder()
                .nutrition(12)
                .saturationModifier(0.8f)
                .effect(MobEffectInstance(MobEffects.HEALTH_BOOST, 60.secondsToTicks(), 0), 1f)
                .effect(MobEffectInstance(MobEffects.REGENERATION, 2.secondsToTicks(), 1), 1f)
                .effect(MobEffectInstance(MobEffects.LUCK, 120.secondsToTicks(), 1), 0.2f)
                .usingConvertsTo(Items.BOWL)
                .build()
            )
    ))

    val PASTELMON_BUCKET: Item = Items.registerItem(
        "pastelmon_bucket",
        MobBucketItem(
            DesolatedPastels.PASTELMON_ENTITY,
            Fluids.WATER,
            SoundEvents.BUCKET_EMPTY_FISH,
            Item.Properties().stacksTo(1).component(DataComponents.BUCKET_ENTITY_DATA, CustomData.EMPTY)
        )
    )

//    fun registerItem(name: String, item: Item): Item {
//        return Registry.register(
//            BuiltInRegistries.ITEM, ResourceLocation(DesolatedPastels.MOD_ID, name), item
//        )
//    }

    fun init() {
        LootTableEvents.MODIFY.register { key, builder, source, registries ->
            if (key === BuiltInLootTables.SNIFFER_DIGGING && source.isBuiltin) {
                builder.modifyPools { 
                    pool -> run {
                        pool.add(LootItem.lootTableItem(DesolatedPastelsBlocks.LIGHT_BLUE_SAPLING))
                        pool.add(LootItem.lootTableItem(DesolatedPastelsBlocks.LIGHT_GREEN_SAPLING))
                    }
                }
            }
        }

        DispenserBlock.registerBehavior(MALLARD_EGG_ITEM, ProjectileDispenseBehavior(MALLARD_EGG_ITEM))
    }
}