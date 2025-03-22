package one.devos.nautical.desolatedpastels.common.blocks.entities.shardcreator

import net.minecraft.core.BlockPos
import net.minecraft.core.HolderLookup
import net.minecraft.nbt.CompoundTag
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.entity.BlockEntityType
import net.minecraft.world.level.block.state.BlockState
import one.devos.nautical.desolatedpastels.common.DesolatedPastelsBlockEntities

class ShardCreatorBlockEntity(pos: BlockPos, blockState: BlockState) :
    BlockEntity(DesolatedPastelsBlockEntities.SHARD_CREATOR, pos, blockState) {

    var clicks: Int = 0

    fun incrementClicks() {
        clicks++
        setChanged()
    }

    override fun saveAdditional(tag: CompoundTag, registries: HolderLookup.Provider) {
        tag.putInt("clicks", clicks)

        super.saveAdditional(tag, registries)
    }

    override fun loadAdditional(tag: CompoundTag, registries: HolderLookup.Provider) {
        super.loadAdditional(tag, registries)

        clicks = tag.getInt("clicks")
    }
}