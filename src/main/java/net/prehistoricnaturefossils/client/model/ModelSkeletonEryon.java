package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEryon extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer body;
    private final ModelRenderer clawL;
    private final ModelRenderer clawL2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer pincerL;
    private final ModelRenderer clawR;
    private final ModelRenderer clawR2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer pincerR;
    private final ModelRenderer eyeL;
    private final ModelRenderer eyeR;
    private final ModelRenderer antennaL;
    private final ModelRenderer antennaR;
    private final ModelRenderer antennaL2;
    private final ModelRenderer antennaR2;
    private final ModelRenderer belly;
    private final ModelRenderer tailfanL;
    private final ModelRenderer tailfanR;
    private final ModelRenderer tailfanL2;
    private final ModelRenderer tailfanR2;
    private final ModelRenderer tailfan;
    private final ModelRenderer legL;
    private final ModelRenderer legR;
    private final ModelRenderer legL2;
    private final ModelRenderer legR2;
    private final ModelRenderer legL3;
    private final ModelRenderer legR3;

    public ModelSkeletonEryon() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 47, -5.0F, -1.0F, -13.0F, 16, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 47, -11.0F, -1.0F, -11.0F, 16, 1, 16, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 47, -8.0F, -1.0F, -3.0F, 16, 1, 16, -0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 23, 0, 0.0F, -1.05F, -11.5F, 9, 0, 23, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 23, 0, -9.0F, -1.05F, -11.5F, 9, 0, 23, 0.0F, true));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.825F, 0.0F);
        this.bone.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 11, -1.5F, -2.0F, -7.0F, 3, 1, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -2.01F, -8.0F, 12, 0, 11, 0.0F, false));

        this.clawL = new ModelRenderer(this);
        this.clawL.setRotationPoint(0.25F, -2.0F, -4.5F);
        this.body.addChild(clawL);
        this.setRotateAngle(clawL, 0.0F, -0.8727F, 0.0F);
        this.clawL.cubeList.add(new ModelBox(clawL, 24, 11, 0.0F, 0.01F, -3.0F, 7, 0, 3, 0.0F, false));

        this.clawL2 = new ModelRenderer(this);
        this.clawL2.setRotationPoint(7.0F, 0.5F, -2.5F);
        this.clawL.addChild(clawL2);
        this.setRotateAngle(clawL2, 0.0436F, 0.6981F, 0.0873F);
        this.clawL2.cubeList.add(new ModelBox(clawL2, 12, 24, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.0F, -7.0F);
        this.clawL2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.5236F, -0.5236F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, 0.0F, -0.5F, -2.25F, 0, 1, 3, 0.0F, false));

        this.pincerL = new ModelRenderer(this);
        this.pincerL.setRotationPoint(0.25F, 0.0F, -7.0F);
        this.clawL2.addChild(pincerL);
        this.setRotateAngle(pincerL, -0.2182F, 0.6545F, -0.3491F);
        this.pincerL.cubeList.add(new ModelBox(pincerL, 0, 4, 0.0F, -0.5F, -3.0F, 0, 1, 3, 0.0F, false));

        this.clawR = new ModelRenderer(this);
        this.clawR.setRotationPoint(-0.25F, -2.0F, -4.5F);
        this.body.addChild(clawR);
        this.setRotateAngle(clawR, 0.0F, 0.8727F, 0.0F);
        this.clawR.cubeList.add(new ModelBox(clawR, 24, 11, -7.0F, 0.01F, -3.0F, 7, 0, 3, 0.0F, true));

        this.clawR2 = new ModelRenderer(this);
        this.clawR2.setRotationPoint(-7.0F, 0.5F, -2.5F);
        this.clawR.addChild(clawR2);
        this.setRotateAngle(clawR2, 0.0436F, -0.6981F, -0.0873F);
        this.clawR2.cubeList.add(new ModelBox(clawR2, 12, 24, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.0F, -7.0F);
        this.clawR2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, -0.5236F, 0.5672F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 3, 0.0F, -0.5F, -2.25F, 0, 1, 3, 0.0F, true));

        this.pincerR = new ModelRenderer(this);
        this.pincerR.setRotationPoint(-0.25F, 0.0F, -7.0F);
        this.clawR2.addChild(pincerR);
        this.setRotateAngle(pincerR, -0.2182F, -0.6981F, 0.3491F);
        this.pincerR.cubeList.add(new ModelBox(pincerR, 0, 4, 0.0F, -0.5F, -3.0F, 0, 1, 3, 0.0F, true));

        this.eyeL = new ModelRenderer(this);
        this.eyeL.setRotationPoint(1.25F, -1.75F, -6.75F);
        this.body.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.3927F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 5, 3, 0.0F, -0.2F, -2.0F, 1, 0, 2, 0.0F, false));

        this.eyeR = new ModelRenderer(this);
        this.eyeR.setRotationPoint(-1.25F, -1.75F, -6.75F);
        this.body.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.3927F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 5, 3, -1.0F, -0.2F, -2.0F, 1, 0, 2, 0.0F, true));

        this.antennaL = new ModelRenderer(this);
        this.antennaL.setRotationPoint(0.25F, -1.5F, -6.75F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.1745F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 35, 0.0F, -0.5F, -2.75F, 1, 0, 3, 0.0F, false));

        this.antennaR = new ModelRenderer(this);
        this.antennaR.setRotationPoint(-0.25F, -1.5F, -6.75F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.1745F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 35, -1.0F, -0.5F, -2.75F, 1, 0, 3, 0.0F, true));

        this.antennaL2 = new ModelRenderer(this);
        this.antennaL2.setRotationPoint(1.25F, -1.25F, -7.0F);
        this.body.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.0F, -0.2182F, 0.0F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 0, 45, -0.5F, -0.725F, -3.75F, 4, 0, 4, 0.0F, false));

        this.antennaR2 = new ModelRenderer(this);
        this.antennaR2.setRotationPoint(-1.25F, -1.25F, -7.0F);
        this.body.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.0F, 0.2182F, 0.0F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 0, 45, -3.5F, -0.725F, -3.75F, 4, 0, 4, 0.0F, true));

        this.belly = new ModelRenderer(this);
        this.belly.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.body.addChild(belly);
        this.belly.cubeList.add(new ModelBox(belly, 18, 17, -2.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F, false));
        this.belly.cubeList.add(new ModelBox(belly, 9, 11, -3.0F, 0.0F, -0.5F, 6, 0, 6, 0.0F, false));

        this.tailfanL = new ModelRenderer(this);
        this.tailfanL.setRotationPoint(0.9F, 0.35F, 6.0F);
        this.belly.addChild(tailfanL);
        this.setRotateAngle(tailfanL, 0.0F, 0.2182F, 0.0F);
        this.tailfanL.cubeList.add(new ModelBox(tailfanL, 2, 3, -0.5F, -0.325F, -0.25F, 1, 0, 3, 0.0F, false));

        this.tailfanR = new ModelRenderer(this);
        this.tailfanR.setRotationPoint(-0.9F, 0.35F, 6.0F);
        this.belly.addChild(tailfanR);
        this.setRotateAngle(tailfanR, 0.0F, -0.2182F, 0.0F);
        this.tailfanR.cubeList.add(new ModelBox(tailfanR, 2, 3, -0.5F, -0.325F, -0.25F, 1, 0, 3, 0.0F, true));

        this.tailfanL2 = new ModelRenderer(this);
        this.tailfanL2.setRotationPoint(1.5F, 0.45F, 6.0F);
        this.belly.addChild(tailfanL2);
        this.setRotateAngle(tailfanL2, 0.0F, 0.48F, 0.0F);
        this.tailfanL2.cubeList.add(new ModelBox(tailfanL2, 0, 3, -0.25F, -0.4F, -0.75F, 1, 0, 3, 0.0F, false));

        this.tailfanR2 = new ModelRenderer(this);
        this.tailfanR2.setRotationPoint(-1.5F, 0.45F, 6.0F);
        this.belly.addChild(tailfanR2);
        this.setRotateAngle(tailfanR2, 0.0F, -0.48F, 0.0F);
        this.tailfanR2.cubeList.add(new ModelBox(tailfanR2, 0, 3, -0.75F, -0.4F, -0.75F, 1, 0, 3, 0.0F, true));

        this.tailfan = new ModelRenderer(this);
        this.tailfan.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.belly.addChild(tailfan);
        this.tailfan.cubeList.add(new ModelBox(tailfan, 5, 7, -1.0F, -0.25F, 0.0F, 2, 0, 1, 0.0F, false));
        this.tailfan.cubeList.add(new ModelBox(tailfan, 5, 5, -0.5F, -0.25F, 1.0F, 1, 0, 2, 0.0F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(0.25F, -1.0F, -3.75F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, -0.4363F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 24, 0.0F, -0.89F, 0.0F, 8, 0, 3, 0.0F, false));

        this.legR = new ModelRenderer(this);
        this.legR.setRotationPoint(-0.25F, -1.0F, -3.75F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.4363F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 24, -8.0F, -0.89F, 0.0F, 8, 0, 3, 0.0F, true));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(0.25F, -1.0F, -2.25F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, -0.5672F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 21, 0.0F, -0.89F, 0.0F, 7, 0, 3, 0.0F, false));

        this.legR2 = new ModelRenderer(this);
        this.legR2.setRotationPoint(-0.25F, -1.0F, -2.25F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.5672F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 21, -7.0F, -0.89F, 0.0F, 7, 0, 3, 0.0F, true));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(0.25F, -1.0F, -1.0F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.8727F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 19, 24, 0.0F, -0.89F, 0.0F, 6, 0, 2, 0.0F, false));

        this.legR3 = new ModelRenderer(this);
        this.legR3.setRotationPoint(-0.25F, -1.0F, -1.0F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.8727F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 19, 24, -6.0F, -0.89F, 0.0F, 6, 0, 2, 0.0F, true));

    }

    public void renderAll(float f) {
        this.bone.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
