package one.devos.nautical.desolatedpastels.common

import gay.asoji.innerpastels.register.RegisterItems.registerItem
import net.minecraft.world.item.Item
import one.devos.nautical.desolatedpastels.DesolatedPastels

object DesolatedPastelsPonderItems {
    val FOUNTAIN_STRUCTURE_PONDER: Item = registerItem(DesolatedPastels.MOD_ID, "fountain_structure_ponder", Item(Item.Properties()))
    val MALLARD_STRUCTURE_PONDER: Item = registerItem(DesolatedPastels.MOD_ID, "mallard_structure_ponder", Item(Item.Properties()))

    fun init() { }
}