package one.devos.nautical.desolatedpastels.common.blocks.entities.shardcreator

import com.mojang.serialization.MapCodec
import net.createmod.ponder.command.SimplePonderActions
import net.minecraft.core.BlockPos
import net.minecraft.network.chat.Component
import net.minecraft.server.level.ServerLevel
import net.minecraft.world.Containers
import net.minecraft.world.InteractionResult
import net.minecraft.world.entity.player.Player
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.BaseEntityBlock
import net.minecraft.world.level.block.RenderShape
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.entity.BlockEntityTicker
import net.minecraft.world.level.block.entity.BlockEntityType
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.phys.BlockHitResult
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlockEntities


class ShardCreatorBlock(properties: Properties) : BaseEntityBlock(properties) {
    override fun codec(): MapCodec<out BaseEntityBlock> {
        return simpleCodec(::ShardCreatorBlock)
    }

    override fun getRenderShape(state: BlockState): RenderShape {
        return RenderShape.MODEL
    }

    override fun newBlockEntity(pos: BlockPos, state: BlockState): BlockEntity {
        return ShardCreatorBlockEntity(pos, state)
    }

    override fun <T : BlockEntity?> getTicker(
        level: Level,
        blockState: BlockState,
        blockEntityType: BlockEntityType<T>
    ): BlockEntityTicker<T>? {
        return createBlockEntityTicker(level, blockEntityType, DesolatedPastelsBlockEntities.SHARD_CREATOR)
    }

    fun <T : BlockEntity?> createBlockEntityTicker(
        level: Level,
        blockEntityType: BlockEntityType<T>?,
        blockEntityType2: BlockEntityType<out ShardCreatorBlockEntity?>?
    ): BlockEntityTicker<T>? {
        return if (level.isClientSide) null else createTickerHelper(
            blockEntityType,
            blockEntityType2,
            ShardCreatorBlockEntity::serverTick
        )
    }

    override fun useWithoutItem(
        state: BlockState,
        level: Level,
        pos: BlockPos,
        player: Player,
        hitResult: BlockHitResult
    ): InteractionResult {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS
        }

        val blockEntity = level.getBlockEntity(pos)

        if (blockEntity !is ShardCreatorBlockEntity) {
            return super.useWithoutItem(state, level, pos, player, hitResult)
        }

        SimplePonderActions.openPonder("desolatedpastels:shard_creator")
//        openContainer(level, pos, player)
        return InteractionResult.CONSUME
    }

    protected fun openContainer(level: Level, pos: BlockPos?, player: Player) {
        val blockEntity = level.getBlockEntity(pos)
        if (blockEntity is ShardCreatorBlockEntity) {
            player.openMenu(blockEntity as ShardCreatorBlockEntity)
        }
    }

    override fun onRemove(
        blockState: BlockState,
        level: Level,
        blockPos: BlockPos?,
        blockState2: BlockState,
        bl: Boolean
    ) {
        if (!blockState.`is`(blockState2.block)) {
            val blockEntity = level.getBlockEntity(blockPos)
            if (blockEntity is ShardCreatorBlockEntity) {
                if (level is ServerLevel) {
                    Containers.dropContents(level, blockPos, blockEntity as ShardCreatorBlockEntity)
                }
            }
            super.onRemove(blockState, level, blockPos, blockState2, bl)
        }
    }
}