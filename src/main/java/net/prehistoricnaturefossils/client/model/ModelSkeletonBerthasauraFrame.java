package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBerthasauraFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer body;
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
    private final ModelRenderer cube_r9;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonBerthasauraFrame() {
        this.textureWidth = 53;
        this.textureHeight = 53;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -17.0F, -1.9F, 1, 17, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(2.5F, 0.0F, -12.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3491F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.2F, -18.0F, -1.0F, 1, 18, 1, -0.21F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(3.0F, -13.0F, -13.1F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3491F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 2.7F, -3.0F, -0.5F, 1, 6, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -13.0F, -1.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 1.9F, -3.0F, -0.5F, 1, 5, 1, -0.2F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -16.3F, -1.1F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.3491F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.2F, -3.0F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, -2, -2, -1.0F, 0.5F, -0.2F, 1, 1, 8, -0.2F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.1F, 0.774F, -0.0693F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.1309F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.6F, 0.1F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.4835F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 7.4F, 0.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.5272F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 3.3F, 0.0F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.8727F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.1F, 0.774F, -0.0693F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3054F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.6F, 0.1F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0908F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 7.4F, 0.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.9599F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 3.3F, 0.0F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.5411F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.8F, -3.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0425F, -0.2614F, 0.0173F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, 0.3F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.192F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 18, -1.0F, 0.1F, -6.1F, 1, 1, 6, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.2F, -5.8F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0551F, -0.1382F, -0.1217F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.0F, -0.4F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4014F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 22, -1.0F, 0.3F, -5.2F, 1, 1, 6, -0.2F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(2.1F, 3.7622F, -2.6549F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -1.4268F, 0.9205F, -0.9154F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.5247F, -0.0604F, 0.0349F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.leftArm2.addChild(leftArm3);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-2.1F, 3.7622F, -2.6549F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.9147F, -0.8744F, 0.6677F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.5247F, 0.0604F, -0.0349F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.rightArm2.addChild(rightArm3);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.8F, -4.3F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.1309F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.0F, -1.8F);
        this.neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 35, -1.0F, -0.2F, -0.1F, 1, 1, 2, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.5F, -1.6F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.1336F, -0.316F, 0.0071F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -1.6F, -1.1F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7505F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 10, -1.0F, 0.5586F, 0.7142F, 1, 1, 2, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.2F, -1.2F);
        this.neck2.addChild(neck);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.9F, -2.0F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2967F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 33, 26, -0.5F, 0.6733F, -0.1823F, 1, 1, 3, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.6F, -1.8F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.3494F, -0.1904F, -0.1108F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2705F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.2F, 4.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0352F, 0.1308F, -0.0046F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 9, -0.5F, 0.1F, 0.3F, 1, 1, 7, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0915F, -0.3042F, 0.0275F);
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 2, -0.5F, 0.0F, -0.1F, 1, 1, 7, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1133F, -0.3904F, 0.0433F);
        this.tail3.cubeList.add(new ModelBox(tail3, 21, 5, -0.5F, 0.0F, -0.5F, 1, 1, 6, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1463F, -0.3024F, -0.0439F);
        this.tail4.cubeList.add(new ModelBox(tail4, 10, 21, -0.5F, 0.0F, -0.1F, 1, 1, 5, -0.2F, false));

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
