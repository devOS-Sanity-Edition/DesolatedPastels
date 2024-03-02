package one.devos.nautical.desolatedpastels.common.entities.mallard

import com.google.common.collect.ImmutableList
import net.minecraft.client.model.AgeableListModel
import net.minecraft.client.model.geom.ModelLayerLocation
import net.minecraft.client.model.geom.ModelPart
import net.minecraft.client.model.geom.PartPose
import net.minecraft.client.model.geom.builders.CubeDeformation
import net.minecraft.client.model.geom.builders.CubeListBuilder
import net.minecraft.client.model.geom.builders.LayerDefinition
import net.minecraft.client.model.geom.builders.MeshDefinition
import net.minecraft.resources.ResourceLocation
import net.minecraft.util.Mth
import net.minecraft.world.entity.LivingEntity
import one.devos.nautical.desolatedpastels.DesolatedPastels.MOD_ID


class MallardModel<T : LivingEntity?>(root: ModelPart) : AgeableListModel<T>() {
    private val body: ModelPart = root.getChild("body")
    private val rear: ModelPart = root.getChild("body").getChild("rear")
    private val tail: ModelPart = root.getChild("body").getChild("rear").getChild("tail")
    private val neck: ModelPart = root.getChild("body").getChild("front").getChild("neck")
    private val front: ModelPart = root.getChild("body").getChild("front")
    private val head: ModelPart = root.getChild("body").getChild("front").getChild("neck").getChild("head")
    private val bill: ModelPart = root.getChild("body").getChild("front").getChild("neck").getChild("head").getChild("bill")
    private val right_wing: ModelPart = root.getChild("right_wing")
    private val left_wing: ModelPart = root.getChild("left_wing")
    private val right_leg: ModelPart = root.getChild("right_leg")
    private val left_leg: ModelPart = root.getChild("left_leg")

    override fun headParts(): Iterable<ModelPart> {
        return ImmutableList.of()
    }

    override fun bodyParts(): Iterable<ModelPart> {
        return ImmutableList.of(this.body, this.right_leg, this.left_leg, this.right_wing, this.left_wing)
    }

    override fun setupAnim(entity: T, limbSwing: Float, limbSwingAmount: Float, ageInTicks: Float, netHeadYaw: Float, headPitch: Float) {
        head.xRot = headPitch * 0.017453292f
        head.yRot = netHeadYaw * 0.017453292f
        right_leg.xRot = Mth.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount
        left_leg.xRot = Mth.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount
        if (entity!!.isInWater) {
            right_leg.xRot = 1.309f
            left_leg.xRot = 1.309f
            if (entity.hurtTime > 0) {
                right_wing.zRot = (-(Mth.abs(Mth.cos(ageInTicks)) * 1.5) * entity.hurtTime / 7.5).toFloat()
                left_wing.zRot = ((Mth.abs(Mth.cos(ageInTicks)) * 1.5) * entity.hurtTime / 7.5).toFloat()
            } else {
                right_wing.zRot = 0f
                left_wing.zRot = 0f
            }
        } else {
            right_leg.xRot = Mth.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount
            left_leg.xRot = Mth.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount
            if (!entity.onGround()) {
                right_wing.zRot = (-Mth.abs(Mth.cos(ageInTicks)) * 1.5).toFloat()
                left_wing.zRot = (Mth.abs(Mth.cos(ageInTicks)) * 1.5).toFloat()
            } else {
                right_wing.zRot = 0.0f
                left_wing.zRot = 0.0f
            }
        }
        //        if (entity.isAggressive) { // this was already commented out
//            this.right_wing.yRot = 1.309F + Mth.cos(limbSwing * 5F) * 1.4F * limbSwingAmount;
//            this.left_wing.yRot = -1.309F - Mth.cos(limbSwing * 5F) * 1.4F * limbSwingAmount;
//            this.head.xRot = headPitch * 0.017453292F + 1.309F;
//        }
//        Re-enable all of the following animations to engage animations for mallard attack mode.
//        Replace `limbSwingAmount` with a scaler from 0.0 to 1.0, after attack mode is implemented.
//        -Zenith
//        rear.xRot = ((Mth.DEG_TO_RAD * 5.0) + (Mth.DEG_TO_RAD * -90.0) * limbSwingAmount).toFloat()
//        front.xRot = ((Mth.DEG_TO_RAD * -5.0) + (Mth.DEG_TO_RAD * -30.0) * limbSwingAmount).toFloat()
//        body.y = (21 - 4 * limbSwingAmount).toFloat()
//        front.y = (-2.0 - 0.5 * limbSwingAmount).toFloat()
//        front.z = (-3.5 + 2 * limbSwingAmount).toFloat()
//        neck.xRot = ((Mth.DEG_TO_RAD * 15.0) + (Mth.DEG_TO_RAD * 45.0) * limbSwingAmount).toFloat()
//        body.xScale = (1 + limbSwingAmount/2).toFloat()
//        body.yScale = (1 + limbSwingAmount/2).toFloat()
//        body.zScale = (1 + limbSwingAmount/2).toFloat()
//        bill.xScale = (1 - 0.5 * limbSwingAmount).toFloat()
//        left_wing.y = (17.5 - 5 * limbSwingAmount).toFloat()
//        right_wing.y = (17.5 - 5 * limbSwingAmount).toFloat()
//        left_wing.xRot = ((Mth.DEG_TO_RAD * -50.0) * limbSwingAmount).toFloat()
//        left_wing.zRot = ((Mth.DEG_TO_RAD * 70.0) * limbSwingAmount).toFloat()
//        left_wing.yRot = ((Mth.DEG_TO_RAD * 20.0) * limbSwingAmount).toFloat()
//        right_wing.xRot = ((Mth.DEG_TO_RAD * -50.0) * limbSwingAmount).toFloat()
//        right_wing.zRot = ((Mth.DEG_TO_RAD * -70.0) * limbSwingAmount).toFloat()
//        right_wing.yRot = ((Mth.DEG_TO_RAD * -20.0) * limbSwingAmount).toFloat()
//        left_leg.x = -1 - 1 * limbSwingAmount
//        right_leg.x = 1 + 1 * limbSwingAmount
    }

    companion object {
        // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
        val LAYER_LOCATION: ModelLayerLocation = ModelLayerLocation(ResourceLocation(MOD_ID, "mallard"), "mallard")
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