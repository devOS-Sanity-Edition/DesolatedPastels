package one.devos.nautical.desolatedpastels.common.entities.mallard

import net.minecraft.world.entity.Entity
import net.minecraft.world.entity.EquipmentSlot
import net.minecraft.world.entity.ai.goal.Goal
import net.minecraft.world.entity.animal.Fox
import net.minecraft.world.entity.item.ItemEntity
import net.minecraft.world.item.ItemStack
import java.util.*

class MallardSearchForItemsGoal(val mallard: MallardEntity) : Goal() {
    init {
        flags = EnumSet.of(Goal.Flag.MOVE)
    }

    override fun canUse(): Boolean {
        if (!mallard.getItemBySlot(EquipmentSlot.MAINHAND).isEmpty) {
            return false
        } else if (mallard.target != null || mallard.lastHurtByMob != null) {
            return false
        } else if (/*mallard.canMove()*/false) {
            return false
        } else if (mallard.random.nextInt(reducedTickDelay(10)) != 0) {
            return false
        } else {
            val list: List<ItemEntity> = mallard.level().getEntitiesOfClass<ItemEntity>(
                ItemEntity::class.java, mallard.boundingBox.inflate(8.0, 8.0, 8.0), mallard.ALLOWED_ITEMS
            )
            return list.isNotEmpty() && mallard.getItemBySlot(EquipmentSlot.MAINHAND).isEmpty
        }
    }

    override fun tick() {
        val list: List<ItemEntity> = mallard.level().getEntitiesOfClass<ItemEntity>(
            ItemEntity::class.java, mallard.boundingBox.inflate(8.0, 8.0, 8.0), mallard.ALLOWED_ITEMS
        )
        val itemStack: ItemStack = mallard.getItemBySlot(EquipmentSlot.MAINHAND)
        if (itemStack.isEmpty && list.isNotEmpty()) {
            mallard.navigation.moveTo(list[0] as Entity, 1.2)
        }
    }

    override fun start() {
        val list: List<ItemEntity> = mallard.level().getEntitiesOfClass<ItemEntity>(
            ItemEntity::class.java, mallard.boundingBox.inflate(8.0, 8.0, 8.0), mallard.ALLOWED_ITEMS
        )
        if (list.isNotEmpty()) {
            mallard.navigation.moveTo(list[0] as Entity, 1.2)
        }
    }

}