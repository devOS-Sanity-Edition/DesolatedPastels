package one.devos.nautical.desolatedpastels.common.entities.tanuki

import net.minecraft.server.level.ServerLevel
import net.minecraft.world.entity.AgeableMob
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.TamableAnimal
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level

class TanukiEntity(entityType: EntityType<out TamableAnimal>, level: Level) : TamableAnimal(entityType, level) {
    override fun getBreedOffspring(level: ServerLevel, otherParent: AgeableMob): AgeableMob? {
        TODO("Not yet implemented")
    }

    override fun isFood(stack: ItemStack): Boolean {
        TODO("Not yet implemented")
    }
}