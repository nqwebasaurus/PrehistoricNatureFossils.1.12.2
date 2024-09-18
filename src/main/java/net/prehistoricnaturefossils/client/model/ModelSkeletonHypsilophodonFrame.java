package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHypsilophodonFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r5;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Head;
    private final ModelRenderer HeadslopeL;
    private final ModelRenderer HeadslopeL2;
    private final ModelRenderer BrowL;
    private final ModelRenderer Jaw;
    private final ModelRenderer JawslopeL;
    private final ModelRenderer JawslopeL2;
    private final ModelRenderer MasseterR;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonHypsilophodonFrame() {
        this.textureWidth = 58;
        this.textureHeight = 58;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5F, -13.0F, -11.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.48F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.6F, 0.0F, -0.5F, 1, 13, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5F, -13.0F, -11.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.48F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.6F, -2.0F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -13.55F, -2.9F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0349F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -1.05F, -3.0F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -13.55F, -2.9F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0349F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, 0.0F, -1.45F, -0.5F, 1, 15, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -15.0F, -3.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.1745F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -1.3F, -1.1F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.192F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 29, 0, -1.0F, 0.6F, 0.0F, 1, 1, 4, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.1F, 0.4F, -0.2F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.6558F, 0.1071F, 0.1381F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-2.0F, 4.9046F, 0.4854F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.0734F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(2.0F, 6.8229F, 0.2046F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.0038F, -0.0872F, -0.0871F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.4F, 2.5F, -2.8F);
        this.leftLeg3.addChild(leftLeg4);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-0.1F, 0.4F, -0.2F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1805F, -0.0317F, -0.1717F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 4.9046F, 0.4854F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.2043F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-2.0F, 6.8229F, 0.2046F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.1309F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.4F, 2.5F, -2.8F);
        this.rightLeg3.addChild(rightLeg4);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.8F, -1.1F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.2182F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.0F, -0.4F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 7, -1.0F, 0.16F, -5.0F, 1, 1, 6, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.1F, -4.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.2182F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -0.3F, -2.1F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1222F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 44, -1.0F, 0.6148F, -0.1646F, 1, 1, 2, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.2F, -3.9F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2094F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 38, -1.0F, 0.5F, -1.1F, 1, 1, 3, -0.15F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(2.3F, 3.0011F, -4.0655F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.1833F, 0.2182F, 0.0F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.1F, 2.7F, 2.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.5672F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.6F, 2.5F, -2.3F);
        this.leftArm2.addChild(leftArm3);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-2.3F, 3.0011F, -4.0655F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.0819F, -0.236F, -0.1782F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.1F, 2.7F, 2.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.5672F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.6F, 2.5F, -2.3F);
        this.rightArm2.addChild(rightArm3);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.7F, -5.0F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.0275F, 0.3042F, 0.0915F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.3F, 1.0F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1571F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 2, -1.0F, -0.2F, -3.4F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.3F, -1.6F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.0814F, 0.2947F, -0.2739F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -1.8F, -2.2F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.576F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 39, -1.0F, 0.4F, 0.0F, 1, 1, 3, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.4F, -2.4F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.5672F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.0F, -1.6F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 45, 25, -0.5F, 0.6F, -0.9F, 1, 1, 3, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.5F, -0.9172F, -1.7103F);
        this.neck.addChild(Head);
        this.setRotateAngle(Head, -0.3227F, 0.6776F, -0.1679F);


        this.HeadslopeL = new ModelRenderer(this);
        this.HeadslopeL.setRotationPoint(1.0F, 0.5415F, 1.1145F);
        this.Head.addChild(HeadslopeL);


        this.HeadslopeL2 = new ModelRenderer(this);
        this.HeadslopeL2.setRotationPoint(0.0F, 0.5415F, 1.1145F);
        this.Head.addChild(HeadslopeL2);


        this.BrowL = new ModelRenderer(this);
        this.BrowL.setRotationPoint(1.0147F, 0.5239F, -2.5201F);
        this.Head.addChild(BrowL);
        this.setRotateAngle(BrowL, -0.0698F, 0.0F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.4415F, 0.4145F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.096F, 0.0F, 0.0F);


        this.JawslopeL = new ModelRenderer(this);
        this.JawslopeL.setRotationPoint(1.0F, -0.3693F, 1.1233F);
        this.Jaw.addChild(JawslopeL);


        this.JawslopeL2 = new ModelRenderer(this);
        this.JawslopeL2.setRotationPoint(0.0F, -0.3693F, 1.1233F);
        this.Jaw.addChild(JawslopeL2);


        this.MasseterR = new ModelRenderer(this);
        this.MasseterR.setRotationPoint(-0.3F, -2.1693F, 1.8233F);
        this.Jaw.addChild(MasseterR);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.1F, 2.6F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.394F, -0.0806F, 0.0335F);
        this.tail.cubeList.add(new ModelBox(tail, 17, 19, -0.5F, 0.1F, -0.1F, 1, 1, 6, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.088F, 0.1304F, 0.0115F);
        this.tail2.cubeList.add(new ModelBox(tail2, -1, -1, -0.5F, 0.0F, -0.4F, 1, 1, 8, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0389F, -0.2209F, 0.0197F);
        this.tail3.cubeList.add(new ModelBox(tail3, 20, 0, -0.5F, 0.0F, 0.0F, 1, 1, 6, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1269F, -0.1326F, 0.0768F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.0F, -0.3F, 1, 1, 17, -0.15F, false));

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
