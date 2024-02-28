package one.devos.nautical.desolatedpastels.utils

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.LeavesBlock
import net.minecraft.world.level.block.RotatedPillarBlock

object BlockUtils {
    fun Leaves(): LeavesBlock {
        return LeavesBlock(
            FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)
                .nonOpaque()
                .blockVision(Blocks::never)
                .suffocates(Blocks::never)
        )
    }

    fun Logs(): Block {
        return RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG))
    }

    fun Planks(): Block {
        return Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS))
    }

    fun Sand(): Block {
        return Block(FabricBlockSettings.copyOf(Blocks.SAND))
    }
}