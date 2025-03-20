package one.devos.nautical.desolatedpastels.client.entities.mallard

import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.model.AgeableHierarchicalModel
import net.minecraft.client.model.geom.ModelLayerLocation
import net.minecraft.client.model.geom.ModelPart
import net.minecraft.client.model.geom.PartPose
import net.minecraft.client.model.geom.builders.CubeDeformation
import net.minecraft.client.model.geom.builders.CubeListBuilder
import net.minecraft.client.model.geom.builders.LayerDefinition
import net.minecraft.client.model.geom.builders.MeshDefinition
import net.minecraft.resources.ResourceLocation
import net.minecraft.util.Mth
import one.devos.nautical.desolatedpastels.DesolatedPastels.MOD_ID
import one.devos.nautical.desolatedpastels.common.entities.mallard.MallardEntity

@Environment(EnvType.CLIENT)
class MallardModel(private val root: ModelPart) : AgeableHierarchicalModel<MallardEntity>(0.5f, 24f) {
    val neck = this.getAnyDescendantWithName("neck").orElseThrow()
    val head = this.getAnyDescendantWithName("head").orElseThrow()

    override fun root(): ModelPart {
        return root
    }

    override fun setupAnim(entity: MallardEntity, limbSwing: Float, limbSwingAmount: Float, ageInTicks: Float, netHeadYaw: Float, headPitch: Float) {
        this.root().allParts.forEach(ModelPart::resetPose)
        this.head.xRot = headPitch * Mth.DEG_TO_RAD
        this.head.yRot = netHeadYaw * Mth.DEG_TO_RAD
        this.animateWalk(MallardAnimation.WALKING, limbSwing, limbSwingAmount, 1.5f, 5f)
    }

    companion object {
        // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
        val LAYER_LOCATION: ModelLayerLocation = ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(MOD_ID, "mallard"), "mallard")
        fun createBodyLayer(): LayerDefinition {
            val meshdefinition = MeshDefinition()
            val partdefinition = meshdefinition.root

            val body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0f, 21.0f, 4.0f))
            val rear = body.addOrReplaceChild("rear", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0f, -1.7917f, -0.7066f, 4.0f, 4.0f, 4.0f, CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -2.0f, -3.5f, 0.0873f, 0.0f, 0.0f))
            val tail = rear.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 17).addBox(-2.0f, -1.5434f, 2.9161f, 3.0f, 3.0f, 3.0f, CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.5f, 0.5f, 0.0f, 0.2618f, 0.0f, 0.0f))
            val front = body.addOrReplaceChild("front", CubeListBuilder.create().texOffs(13, 5).addBox(-2.0f, -1.7026f, -3.3124f, 4.0f, 4.0f, 3.0f, CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -2.0f, -3.5f, -0.0873f, 0.0f, 0.0f))
            val neck = front.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(12, 20).addBox(-1.0f, -5.0186f, -0.0596f, 2.0f, 5.0f, 2.0f, CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.3f, -3.25f, 0.2618f, 0.0f, 0.0f))
            val head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0f, -4.863f, 1.5215f))
            val bill = head.addOrReplaceChild("bill", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0f, -0.1566f, -1.7719f, 2.0f, 1.0f, 3.0f, CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -1.2358f, -3.1076f, -0.0873f, 0.0f, 0.0f))
            val bone2 = head.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(11, 14).addBox(-2.5f, -5.709f, -3.6865f, 3.0f, 3.0f, 3.0f, CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.0f, 3.1752f, -3.3695f, -1.0472f, 0.0f, 0.0f))
            val right_wing = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5f, -0.5f, -1.0f, 1.0f, 3.0f, 6.0f, CubeDeformation(0.0f)), PartPose.offset(2.5f, 17.5f, -1.0f))
            val left_wing = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-0.5f, -0.5f, -1.0f, 1.0f, 3.0f, 6.0f, CubeDeformation(0.0f)).mirror(false), PartPose.offset(-2.5f, 17.5f, -1.0f))
            val left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, 0.0f, -0.5f, 1.0f, 3.0f, 1.0f, CubeDeformation(0.0f)), PartPose.offset(-1.0f, 21.0f, 0.5f))
            val right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5f, 0.0f, -0.5f, 1.0f, 3.0f, 1.0f, CubeDeformation(0.0f)).mirror(false), PartPose.offset(1.0f, 21.0f, 0.5f))

            return LayerDefinition.create(meshdefinition, 32, 32)
        }
    }
}