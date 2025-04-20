package one.devos.nautical.desolatedpastels.common

import com.klikli_dev.modonomicon.util.StreamCodecs
import com.mojang.serialization.Codec
import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry
import net.fabricmc.fabric.api.attachment.v1.AttachmentSyncPredicate
import net.minecraft.network.codec.ByteBufCodecs
import net.minecraft.resources.ResourceLocation
import one.devos.nautical.desolatedpastels.DesolatedPastels

object DesolatedPastelsAttachments {
    val HAS_PONDERED_SHARD_CREATOR = AttachmentRegistry.create(ResourceLocation.fromNamespaceAndPath(DesolatedPastels.MOD_ID, "has_pondered_shard_creator")) { builder ->
        builder.persistent(Codec.BOOL)
            .syncWith(ByteBufCodecs.BOOL, AttachmentSyncPredicate.targetOnly())
    }

    val CURRENT_PONDER_SHARD_CREATOR_STATE = AttachmentRegistry.createPersistent(ResourceLocation.fromNamespaceAndPath(DesolatedPastels.MOD_ID, "ponder_shard_creator_state"), Codec.INT)

    fun init() {}
}