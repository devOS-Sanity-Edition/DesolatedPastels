package one.devos.nautical.desolatedpastels.common

import net.minecraft.Util
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.util.datafix.fixes.References
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.entity.BlockEntityType
import one.devos.nautical.desolatedpastels.DesolatedPastels
import one.devos.nautical.desolatedpastels.common.blocks.entities.shardcreator.ShardCreatorBlockEntity

object DesolatedPastelsBlockEntities {
    val SHARD_CREATOR: BlockEntityType<ShardCreatorBlockEntity> =
        Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            ResourceLocation.fromNamespaceAndPath(DesolatedPastels.MOD_ID, "shard_creator"),
            BlockEntityType.Builder.of(::ShardCreatorBlockEntity, DesolatedPastelsBlocks.SHARD_CREATOR).build())


    fun init() { }
}