package one.devos.nautical.desolatedpastels.world

import net.minecraft.world.level.block.grower.TreeGrower
import one.devos.nautical.desolatedpastels.DesolatedPastels
import java.util.*

object DesolatedPastelsSaplingGenerators {
    val GREEN_TREE: TreeGrower = TreeGrower(
        DesolatedPastels.MOD_ID + "green_tree",
        Optional.empty(),
        Optional.of(DesolatedPastelsConfiguredFeatures.GREEN_TREE_KEY),
        Optional.empty()
    )

    val LIGHT_GREEN_TREE: TreeGrower = TreeGrower(
        DesolatedPastels.MOD_ID + "light_green_tree",
        Optional.empty(),
        Optional.of(DesolatedPastelsConfiguredFeatures.LIGHT_GREEN_TREE_KEY),
        Optional.empty()
    )

    val BLUE_TREE: TreeGrower = TreeGrower(
        DesolatedPastels.MOD_ID + "blue_tree",
        Optional.empty(),
        Optional.of(DesolatedPastelsConfiguredFeatures.BLUE_TREE_KEY),
        Optional.empty()
    )

    val LIGHT_BLUE_TREE: TreeGrower = TreeGrower(
        DesolatedPastels.MOD_ID + "light_blue_tree",
        Optional.empty(),
        Optional.of(DesolatedPastelsConfiguredFeatures.LIGHT_BLUE_TREE_KEY),
        Optional.empty()
    )
}