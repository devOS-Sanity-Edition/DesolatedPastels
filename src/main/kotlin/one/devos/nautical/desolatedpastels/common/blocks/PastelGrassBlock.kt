package one.devos.nautical.desolatedpastels.common.blocks

import com.mojang.serialization.MapCodec
import net.minecraft.core.BlockPos
import net.minecraft.core.Holder
import net.minecraft.core.registries.Registries
import net.minecraft.data.worldgen.placement.VegetationPlacements
import net.minecraft.server.level.ServerLevel
import net.minecraft.util.RandomSource
import net.minecraft.world.level.Level
import net.minecraft.world.level.LevelReader
import net.minecraft.world.level.biome.Biome
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.BonemealableBlock
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration
import net.minecraft.world.level.levelgen.placement.PlacedFeature

class PastelGrassBlock(properties: Properties) : SpreadingPastelDirtBlock(properties), BonemealableBlock {
    private val CODEC: MapCodec<PastelGrassBlock> = simpleCodec { properties: Properties -> PastelGrassBlock(properties) }

    override fun codec(): MapCodec<out SpreadingPastelDirtBlock> {
        return CODEC
    }

    override fun isValidBonemealTarget(level: LevelReader, pos: BlockPos, state: BlockState?): Boolean {
        return level.getBlockState(pos.above()).isAir
    }

    override fun isBonemealSuccess(level: Level?, random: RandomSource?, pos: BlockPos?, state: BlockState?): Boolean {
        return true
    }

    override fun performBonemeal(level: ServerLevel, random: RandomSource, pos: BlockPos, state: BlockState?) {
        val blockPos = pos.above()
        val blockState = Blocks.SHORT_GRASS.defaultBlockState()
        val optional = level.registryAccess().registryOrThrow(Registries.PLACED_FEATURE).getHolder(VegetationPlacements.GRASS_BONEMEAL)

        for (i in 0..127) {
            var blockPos2 = blockPos

            for (j in 0 until i / 16) {
                blockPos2 = blockPos2.offset(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1)
                if (!level.getBlockState(blockPos2.below()).`is`(this) || level.getBlockState(blockPos2).isCollisionShapeFullBlock(level, blockPos2)) {
                    continue
                }
            }

            val blockState2 = level.getBlockState(blockPos2)
            if (blockState2.`is`(blockState.block) && random.nextInt(10) == 0) {
                (blockState.block as BonemealableBlock).performBonemeal(level, random, blockPos2, blockState2)
            }

            if (blockState2.isAir) {
                var holder: Holder<*>
                if (random.nextInt(8) == 0) {
                    val list = (level.getBiome(blockPos2).value() as Biome).generationSettings.flowerFeatures
                    if (list.isEmpty()) {
                        continue
                    }

                    holder = (list[0].config() as RandomPatchConfiguration).feature()
                } else {
                    if (!optional.isPresent) {
                        continue
                    }

                    holder = optional.get()
                }

                (holder.value() as PlacedFeature).place(level, level.chunkSource.generator, random, blockPos2)
            }
        }
    }

    override fun getType(): BonemealableBlock.Type {
        return BonemealableBlock.Type.NEIGHBOR_SPREADER
    }
}