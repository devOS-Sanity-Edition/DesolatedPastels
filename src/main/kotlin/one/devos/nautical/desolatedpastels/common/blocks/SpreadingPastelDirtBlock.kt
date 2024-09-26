package one.devos.nautical.desolatedpastels.common.blocks

import com.mojang.serialization.MapCodec
import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.server.level.ServerLevel
import net.minecraft.tags.FluidTags
import net.minecraft.util.RandomSource
import net.minecraft.world.level.LevelReader
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.SnowLayerBlock
import net.minecraft.world.level.block.SpreadingSnowyDirtBlock
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.lighting.LightEngine
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlocks

open class SpreadingPastelDirtBlock(properties: Properties) : SpreadingSnowyDirtBlock(properties) {
    private val CODEC = simpleCodec(::SpreadingPastelDirtBlock)

    override fun codec(): MapCodec<out SpreadingSnowyDirtBlock> {
        return CODEC
    }

    fun canBeGrass(state: BlockState, levelReader: LevelReader, pos: BlockPos): Boolean {
        val blockPos = pos.above()
        val blockState = levelReader.getBlockState(blockPos)
        if (blockState.`is`(Blocks.SNOW) && blockState.getValue(SnowLayerBlock.LAYERS) as Int == 1) {
            return true
        } else if (blockState.fluidState.amount == 8) {
            return false
        } else {
            val i = LightEngine.getLightBlockInto(levelReader, state, pos, blockState, blockPos, Direction.UP, blockState.getLightBlock(levelReader, blockPos))
            return i < levelReader.maxLightLevel
        }
    }

    fun canPropagate(state: BlockState, level: LevelReader, pos: BlockPos): Boolean {
        val blockPos = pos.above()
        return canBeGrass(state, level, pos) && !level.getFluidState(blockPos).`is`(FluidTags.WATER)
    }

    override fun randomTick(state: BlockState, level: ServerLevel, pos: BlockPos, random: RandomSource) {
        if (!canBeGrass(state, level, pos)) {
            level.setBlockAndUpdate(pos, DesolatedPastelsBlocks.PASTEL_DIRT.defaultBlockState())
        } else {
            if (level.getMaxLocalRawBrightness(pos.above()) >= 9) {
                val blockState = this.defaultBlockState()

                for (i in 0..3) {
                    val blockPos = pos.offset(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1)
                    if (level.getBlockState(blockPos).`is`(DesolatedPastelsBlocks.PASTEL_DIRT) && canPropagate(blockState, level, blockPos)) {
                        level.setBlockAndUpdate(blockPos, blockState.setValue(SNOWY, level.getBlockState(blockPos.above()).`is`(Blocks.SNOW)) as BlockState)
                    }
                }
            }
        }
    }
}