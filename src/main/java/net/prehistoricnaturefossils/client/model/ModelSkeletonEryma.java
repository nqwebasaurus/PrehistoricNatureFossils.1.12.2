package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEryma extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r3;
    private final ModelRenderer eyeR;
    private final ModelRenderer eyeL;
    private final ModelRenderer antennaR2;
    private final ModelRenderer antennaL2;
    private final ModelRenderer armR;
    private final ModelRenderer cube_r4;
    private final ModelRenderer armR2;
    private final ModelRenderer armR3;
    private final ModelRenderer clawR;
    private final ModelRenderer armL;
    private final ModelRenderer cube_r5;
    private final ModelRenderer armL2;
    private final ModelRenderer armL3;
    private final ModelRenderer clawL;
    private final ModelRenderer armL4;
    private final ModelRenderer clawL2;
    private final ModelRenderer legR;
    private final ModelRenderer legL;
    private final ModelRenderer legL2;
    private final ModelRenderer legL3;
    private final ModelRenderer legL4;
    private final ModelRenderer body1;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer body4;
    private final ModelRenderer body6;
    private final ModelRenderer tail2;
    private final ModelRenderer tailfanR;
    private final ModelRenderer tailfanL;
    private final ModelRenderer tailfanR2;
    private final ModelRenderer tailfanL2;

    public ModelSkeletonEryma() {
        this.textureWidth = 93;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 21, -8.0F, -5.0F, -14.0F, 17, 5, 22, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-10.5F, -2.5F, -0.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.6109F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.2F, 0.5F, -9.8F, 27, 2, 18, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -2.5F, -3.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.7418F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 49, -1.2F, -1.5F, -8.1F, 17, 4, 22, 0.0F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -0.35F, 0.0F);
        this.fossil.addChild(bone);
        this.setRotateAngle(bone, 0.0F, 0.0F, -0.3491F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -4.75F, -5.5F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.1222F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 66, -0.5F, -0.65F, -2.5F, 1, 2, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 57, 21, -1.5F, -0.65F, -1.5F, 3, 2, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 21, -2.0F, -0.65F, -0.5F, 4, 3, 5, 0.02F, false));

        this.eyeR = new ModelRenderer(this);
        this.eyeR.setRotationPoint(-0.5F, -4.9F, -7.0F);
        this.bone.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.2182F, 0.0F);


        this.eyeL = new ModelRenderer(this);
        this.eyeL.setRotationPoint(0.5F, -4.9F, -7.0F);
        this.bone.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.2182F, 0.0F);


        this.antennaR2 = new ModelRenderer(this);
        this.antennaR2.setRotationPoint(-0.025F, -5.25F, -7.0F);
        this.bone.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.1745F, 0.1309F, 0.0F);


        this.antennaL2 = new ModelRenderer(this);
        this.antennaL2.setRotationPoint(0.025F, -5.25F, -7.0F);
        this.bone.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.1745F, -0.1309F, 0.0F);


        this.armR = new ModelRenderer(this);
        this.armR.setRotationPoint(-1.25F, -4.95F, -5.0F);
        this.bone.addChild(armR);
        this.setRotateAngle(armR, 0.01F, 0.7514F, 0.3401F);
        this.armR.cubeList.add(new ModelBox(armR, 7, 62, -1.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.armR.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 21, -0.65F, -0.5F, -2.0F, 1, 1, 2, -0.01F, false));

        this.armR2 = new ModelRenderer(this);
        this.armR2.setRotationPoint(-0.75F, 0.0F, -1.55F);
        this.armR.addChild(armR2);
        this.setRotateAngle(armR2, 0.0F, -0.7854F, 0.0F);
        this.armR2.cubeList.add(new ModelBox(armR2, 7, 0, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.01F, false));

        this.armR3 = new ModelRenderer(this);
        this.armR3.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.armR2.addChild(armR3);
        this.setRotateAngle(armR3, 0.0F, -0.6109F, 0.0F);
        this.armR3.cubeList.add(new ModelBox(armR3, 57, 37, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.02F, false));
        this.armR3.cubeList.add(new ModelBox(armR3, 0, 38, -1.0F, -0.5F, -5.0F, 1, 1, 3, 0.01F, false));

        this.clawR = new ModelRenderer(this);
        this.clawR.setRotationPoint(0.25F, 0.0F, -2.0F);
        this.armR3.addChild(clawR);
        this.setRotateAngle(clawR, 0.0F, -0.1745F, 0.0F);
        this.clawR.cubeList.add(new ModelBox(clawR, 8, 13, -0.25F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.armL = new ModelRenderer(this);
        this.armL.setRotationPoint(1.25F, -4.25F, -5.0F);
        this.bone.addChild(armL);
        this.setRotateAngle(armL, 0.0F, -0.1745F, 0.3927F);
        this.armL.cubeList.add(new ModelBox(armL, 0, 63, 0.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.armL.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 62, -0.35F, -0.5F, -2.0F, 1, 1, 2, -0.01F, false));

        this.armL2 = new ModelRenderer(this);
        this.armL2.setRotationPoint(0.75F, 0.0F, -1.55F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 0.0F, -0.2618F, 0.0F);
        this.armL2.cubeList.add(new ModelBox(armL2, 57, 53, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.01F, false));

        this.armL3 = new ModelRenderer(this);
        this.armL3.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, 0.0F, 0.3927F, 0.0F);
        this.armL3.cubeList.add(new ModelBox(armL3, 0, 59, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.02F, false));
        this.armL3.cubeList.add(new ModelBox(armL3, 9, 54, 0.0F, -0.5F, -5.0F, 1, 1, 3, 0.01F, false));

        this.clawL = new ModelRenderer(this);
        this.clawL.setRotationPoint(-0.25F, 0.0F, -2.0F);
        this.armL3.addChild(clawL);
        this.setRotateAngle(clawL, 0.0F, 0.8727F, 0.0F);
        this.clawL.cubeList.add(new ModelBox(clawL, 0, 54, -0.75F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.armL4 = new ModelRenderer(this);
        this.armL4.setRotationPoint(-4.0F, 3.0F, -12.75F);
        this.armL2.addChild(armL4);
        this.setRotateAngle(armL4, -3.0753F, 0.0843F, -2.8788F);
        this.armL4.cubeList.add(new ModelBox(armL4, 57, 57, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.02F, false));
        this.armL4.cubeList.add(new ModelBox(armL4, 9, 49, 0.0F, -0.5F, -5.0F, 1, 1, 3, 0.01F, false));

        this.clawL2 = new ModelRenderer(this);
        this.clawL2.setRotationPoint(-0.25F, 0.0F, -2.0F);
        this.armL4.addChild(clawL2);
        this.setRotateAngle(clawL2, 0.0F, 0.1745F, 0.0F);
        this.clawL2.cubeList.add(new ModelBox(clawL2, 0, 49, -0.75F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.legR = new ModelRenderer(this);
        this.legR.setRotationPoint(-1.5F, -3.25F, -3.75F);
        this.bone.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 1.1781F, 0.0F);


        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(1.5F, -3.25F, -3.75F);
        this.bone.addChild(legL);
        this.setRotateAngle(legL, 0.0F, -1.2654F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 30, 0.0F, -0.75F, -4.0F, 1, 3, 4, 0.0F, false));
        this.legL.cubeList.add(new ModelBox(legL, 57, 64, 0.0F, 0.25F, -5.0F, 1, 2, 1, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(1.5F, -3.25F, -3.15F);
        this.bone.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, -1.4399F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 8, 0.0F, -0.75F, -4.0F, 1, 3, 4, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 21, 0.0F, 0.25F, -5.0F, 1, 2, 1, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(1.5F, -3.25F, -2.6F);
        this.bone.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -1.8326F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 7, 4, 0.0F, -0.75F, -4.0F, 1, 3, 4, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 17, 53, 0.0F, 0.25F, -5.0F, 1, 2, 1, 0.0F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(1.5F, -3.25F, -1.95F);
        this.bone.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -2.2253F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 62, 64, 0.0F, 0.15F, -5.0F, 1, 2, 1, 0.0F, false));
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 0, 0.0F, -0.75F, -4.0F, 1, 3, 4, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -5.5F, -1.5F);
        this.bone.addChild(body1);
        this.setRotateAngle(body1, 0.1307F, -0.0038F, 0.0872F);
        this.body1.cubeList.add(new ModelBox(body1, 57, 25, -1.5F, 0.25F, 0.25F, 3, 2, 1, 0.01F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, -0.044F, 0.1308F, -0.0057F);
        this.body2.cubeList.add(new ModelBox(body2, 11, 35, -1.5F, -0.25F, 0.0F, 3, 2, 2, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.2F, 1.9F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.1917F, 0.2066F, -0.0825F);
        this.body3.cubeList.add(new ModelBox(body3, 11, 30, -1.5F, 0.0F, -0.25F, 3, 2, 2, -0.01F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.1F, 1.75F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0485F, 0.1699F, 0.0136F);
        this.body4.cubeList.add(new ModelBox(body4, 9, 40, -1.5F, 0.0F, -0.25F, 3, 1, 1, -0.02F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 0.75F);
        this.body4.addChild(body6);
        this.setRotateAngle(body6, -0.2618F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 15, 49, -1.0F, 0.0F, 0.0F, 2, 1, 1, -0.02F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body6.addChild(tail2);
        this.setRotateAngle(tail2, -0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 57, 49, -0.99F, 0.25F, 0.0F, 2, 1, 2, 0.0F, false));

        this.tailfanR = new ModelRenderer(this);
        this.tailfanR.setRotationPoint(-0.25F, 0.25F, 0.0F);
        this.tail2.addChild(tailfanR);
        this.setRotateAngle(tailfanR, -0.1309F, -0.6545F, -0.1309F);
        this.tailfanR.cubeList.add(new ModelBox(tailfanR, 57, 61, -1.01F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.tailfanL = new ModelRenderer(this);
        this.tailfanL.setRotationPoint(0.25F, 0.25F, 0.0F);
        this.tail2.addChild(tailfanL);
        this.setRotateAngle(tailfanL, -0.1309F, 0.6545F, 0.1309F);
        this.tailfanL.cubeList.add(new ModelBox(tailfanL, 57, 33, -0.99F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.tailfanR2 = new ModelRenderer(this);
        this.tailfanR2.setRotationPoint(-0.25F, 0.25F, 0.0F);
        this.tail2.addChild(tailfanR2);
        this.setRotateAngle(tailfanR2, -0.2618F, -1.2217F, -0.2618F);
        this.tailfanR2.cubeList.add(new ModelBox(tailfanR2, 9, 59, -1.01F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.tailfanL2 = new ModelRenderer(this);
        this.tailfanL2.setRotationPoint(0.25F, 0.25F, 0.0F);
        this.tail2.addChild(tailfanL2);
        this.setRotateAngle(tailfanL2, -0.2618F, 1.2217F, 0.2618F);
        this.tailfanL2.cubeList.add(new ModelBox(tailfanL2, 57, 29, -0.99F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

    }

    public void renderAll(float f) {
        this.fossil.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
