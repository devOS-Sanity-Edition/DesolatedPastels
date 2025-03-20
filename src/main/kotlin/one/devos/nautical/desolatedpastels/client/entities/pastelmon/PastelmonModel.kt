package one.devos.nautical.desolatedpastels.client.entities.pastelmon

import com.mojang.blaze3d.vertex.PoseStack
import com.mojang.blaze3d.vertex.VertexConsumer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.model.EntityModel
import net.minecraft.client.model.geom.ModelLayerLocation
import net.minecraft.client.model.geom.ModelPart
import net.minecraft.client.model.geom.PartPose
import net.minecraft.client.model.geom.builders.CubeDeformation
import net.minecraft.client.model.geom.builders.CubeListBuilder
import net.minecraft.client.model.geom.builders.LayerDefinition
import net.minecraft.client.model.geom.builders.MeshDefinition
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.entity.Entity
import one.devos.nautical.desolatedpastels.DesolatedPastels

@Environment(EnvType.CLIENT)
class PastelmonModel<T : Entity?>(root: ModelPart) : EntityModel<T>() {
    private val head: ModelPart = root.getChild("head")
    private val body_front: ModelPart = root.getChild("body_front")
    private val body_back: ModelPart = root.getChild("body_back")
    private val fin_left: ModelPart = root.getChild("fin_left")
    private val fin_right: ModelPart = root.getChild("fin_right")
    private val tail: ModelPart = root.getChild("tail")

    override fun setupAnim(
        entity: T,
        limbSwing: Float,
        limbSwingAmount: Float,
        ageInTicks: Float,
        netHeadYaw: Float,
        headPitch: Float
    ) {

    }

    override fun renderToBuffer(
        poseStack: PoseStack,
        buffer: VertexConsumer,
        packedLight: Int,
        packedOverlay: Int,
        color: Int
    ) {
        head.render(poseStack, buffer, packedLight, packedOverlay, color)
        body_front.render(poseStack, buffer, packedLight, packedOverlay, color)
        body_back.render(poseStack, buffer, packedLight, packedOverlay, color)
        fin_left.render(poseStack, buffer, packedLight, packedOverlay, color)
        fin_right.render(poseStack, buffer, packedLight, packedOverlay, color)
        tail.render(poseStack, buffer, packedLight, packedOverlay, color)
    }

    companion object {
        // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
        val LAYER_LOCATION: ModelLayerLocation = ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(DesolatedPastels.MOD_ID, "pastelmon"), "pastelmon")
        fun createBodyLayer(): LayerDefinition {
            val meshdefinition = MeshDefinition()
            val partdefinition = meshdefinition.root

            val head = partdefinition.addOrReplaceChild(
                "head",
                CubeListBuilder.create().texOffs(20, 0)
                    .addBox(-1.0f, -2.0f, -4.0f, 2.0f, 4.0f, 4.0f, CubeDeformation(0.0f)),
                PartPose.offset(0.0f, 21.5f, -8.0f)
            )

            val body_front = partdefinition.addOrReplaceChild(
                "body_front",
                CubeListBuilder.create().texOffs(0, 0)
                    .addBox(-1.5f, -2.5f, 0.0f, 3.0f, 5.0f, 8.0f, CubeDeformation(0.0f))
                    .texOffs(0, 18).addBox(0.0f, -4.5f, 0.0f, 0.0f, 2.0f, 8.0f, CubeDeformation(0.0f)),
                PartPose.offset(0.0f, 21.5f, -8.0f)
            )

            val body_back = partdefinition.addOrReplaceChild(
                "body_back",
                CubeListBuilder.create().texOffs(0, 13)
                    .addBox(-1.5f, -2.5f, 0.0f, 3.0f, 5.0f, 8.0f, CubeDeformation(0.0f))
                    .texOffs(1, 20).addBox(0.0f, -4.5f, 0.0f, 0.0f, 2.0f, 8.0f, CubeDeformation(0.0f)),
                PartPose.offset(0.0f, 21.5f, 0.0f)
            )

            val fin_left = partdefinition.addOrReplaceChild(
                "fin_left",
                CubeListBuilder.create().texOffs(0, 0)
                    .addBox(0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f, CubeDeformation(0.0f)),
                PartPose.offsetAndRotation(1.5f, 23.0f, -8.0f, 0.0f, 0.0f, 0.7854f)
            )

            val fin_right = partdefinition.addOrReplaceChild(
                "fin_right",
                CubeListBuilder.create().texOffs(0, 2)
                    .addBox(-2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f, CubeDeformation(0.0f)),
                PartPose.offsetAndRotation(-1.5f, 23.0f, -8.0f, 0.0f, 0.0f, -0.7854f)
            )

            val tail = partdefinition.addOrReplaceChild(
                "tail",
                CubeListBuilder.create().texOffs(24, 12)
                    .addBox(0.0f, -2.5f, 0.0f, 0.0f, 5.0f, 4.0f, CubeDeformation(0.0f)),
                PartPose.offset(0.0f, 21.5f, 8.0f)
            )

            return LayerDefinition.create(meshdefinition, 32, 32)
        }
    }
}