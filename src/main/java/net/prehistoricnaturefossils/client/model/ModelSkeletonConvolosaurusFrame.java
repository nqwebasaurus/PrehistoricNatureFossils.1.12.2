package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonConvolosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r3;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck;
    private final ModelRenderer Head;
    private final ModelRenderer HeadslopeL;
    private final ModelRenderer HeadslopeL2;
    private final ModelRenderer BrowL;
    private final ModelRenderer Jaw;
    private final ModelRenderer JawslopeL;
    private final ModelRenderer JawslopeL2;
    private final ModelRenderer MasseterR;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonConvolosaurusFrame() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -14.0F, -5.4F, 1, 14, 1, -0.21F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.8F, -18.0F, -14.7F, 1, 18, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -14.5F, -14.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.2F, -2.5F, -0.5F, 1, 6, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -14.5F, -4.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -2.2F, -2.5F, -0.5F, 1, 5, 1, -0.2F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -13.3F, -4.4F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.3491F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -1.3F, -1.4F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2443F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 28, -1.0F, 0.5F, -0.3F, 1, 1, 4, -0.2F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.6F, 0.5F, -0.6F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.4391F, 0.0748F, 0.1578F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 4.9046F, 0.4854F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.5097F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 6.8229F, 0.2046F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.393F, -0.0403F, 0.0167F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.1F, 1.5F, -1.9F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.5883F, -0.0968F, -0.0746F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.6F, 0.5F, -0.6F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0959F, -0.0096F, -0.1352F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 4.9046F, 0.4854F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.117F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 6.8229F, 0.2046F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.3079F, 0.1248F, 0.0396F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.1F, 1.5F, -1.9F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -0.3927F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.8F, -1.4F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.1745F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.5F, -3.6F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1571F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 38, -1.0F, 0.5F, -2.8F, 1, 1, 3, -0.2F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, -0.6F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 0, -1.0F, 0.0F, -3.4F, 1, 1, 4, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.3F, -5.8F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0873F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.3F, 1.2112F, -3.2776F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2456F, 0.1016F, 0.0254F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 29, -0.5485F, -0.3339F, -0.4431F, 1, 1, 4, -0.2F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(2.3F, 3.4011F, -2.2655F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.5061F, 0.2182F, 0.0F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.1F, 2.7F, 2.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.5512F, 0.3412F, 0.1906F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.6F, 2.5F, -2.3F);
        this.leftArm2.addChild(leftArm3);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-2.3F, 3.4011F, -2.2655F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.3391F, -0.2724F, 0.1028F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.1F, 2.7F, 2.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.9244F, -0.3059F, -0.3663F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.6F, 2.5F, -2.3F);
        this.rightArm2.addChild(rightArm3);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.7F, -2.8F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, -0.4125F, 0.2998F, 0.3466F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.1F, 0.8344F, -0.9715F);
        this.neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0353F, -0.0161F, 0.0068F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 12, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.2F, -3.0F);
        this.neck3.addChild(neck2);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.2154F, -0.3808F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4898F, 0.0598F, -0.036F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 24, -0.5F, -0.6F, -2.8F, 1, 1, 5, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.5F, -1.6F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.1253F, 0.2665F, 0.3626F);


        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.5F, -0.4172F, -1.0103F);
        this.neck.addChild(Head);
        this.setRotateAngle(Head, 0.5018F, 0.142F, 0.1737F);


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
        this.Jaw.setRotationPoint(0.0F, 1.3415F, -0.1855F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.2793F, 0.0F, 0.0F);


        this.JawslopeL = new ModelRenderer(this);
        this.JawslopeL.setRotationPoint(1.0F, -0.4284F, 1.5189F);
        this.Jaw.addChild(JawslopeL);


        this.JawslopeL2 = new ModelRenderer(this);
        this.JawslopeL2.setRotationPoint(0.0F, -0.4284F, 1.5189F);
        this.Jaw.addChild(JawslopeL2);


        this.MasseterR = new ModelRenderer(this);
        this.MasseterR.setRotationPoint(-0.3F, -2.2284F, 2.2189F);
        this.Jaw.addChild(MasseterR);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.1F, 2.3F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.3835F, -0.2028F, 0.0811F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.1F, 0.6F, -0.6F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0175F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, -1, 27, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0964F, -0.1307F, -0.0069F);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 21, -0.5F, 0.1F, -0.1F, 1, 1, 5, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2978F, 0.0834F, 0.0256F);
        this.tail3.cubeList.add(new ModelBox(tail3, -1, 6, -0.5F, 0.0F, -0.7F, 1, 1, 7, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.134F, 0.2163F, 0.0289F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.0F, -0.2F, 1, 1, 19, -0.2F, false));

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
