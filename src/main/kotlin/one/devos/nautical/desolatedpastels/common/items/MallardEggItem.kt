package one.devos.nautical.desolatedpastels.common.items

import net.minecraft.core.Direction
import net.minecraft.core.Position
import net.minecraft.sounds.SoundEvents
import net.minecraft.sounds.SoundSource
import net.minecraft.stats.Stats
import net.minecraft.world.InteractionHand
import net.minecraft.world.InteractionResultHolder
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.player.Player
import net.minecraft.world.entity.projectile.Projectile
import net.minecraft.world.entity.projectile.ThrowableItemProjectile
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.ProjectileItem
import net.minecraft.world.level.Level
import one.devos.nautical.desolatedpastels.common.entities.egg.MallardEggEntity
import one.devos.nautical.desolatedpastels.common.entities.mallard.MallardEntity


class MallardEggItem(settings: Properties, val entityType: EntityType<out ThrowableItemProjectile>, val mobEntityType: EntityType<out MallardEntity>) : Item(settings),
    ProjectileItem {
    override fun use(level: Level, player: Player, usedHand: InteractionHand): InteractionResultHolder<ItemStack> {
        val itemStack = player.getItemInHand(usedHand)
        level.playSound(null, player.x, player.y, player.z, SoundEvents.EGG_THROW, SoundSource.PLAYERS, 0.5f, 0.4f / (level.getRandom().nextFloat() * 0.4f + 0.8f))

        if (!level.isClientSide) {
            val eggEntity = MallardEggEntity(entityType, level, player, mobEntityType)
            eggEntity.item = itemStack
            eggEntity.shootFromRotation(player, player.xRot, player.yRot, 0.0f, 1.5f, 1.0f)
            level.addFreshEntity(eggEntity)
        }

        player.awardStat(Stats.ITEM_USED[this])
        itemStack.consume(1, player)
        return InteractionResultHolder.sidedSuccess<ItemStack>(itemStack, level.isClientSide())
    }

    override fun asProjectile(level: Level, pos: Position, stack: ItemStack, direction: Direction): Projectile {
        val thrownEgg = MallardEggEntity(entityType, level, pos.x(), pos.y(), pos.z())
        thrownEgg.item = stack
        return thrownEgg
    }
}