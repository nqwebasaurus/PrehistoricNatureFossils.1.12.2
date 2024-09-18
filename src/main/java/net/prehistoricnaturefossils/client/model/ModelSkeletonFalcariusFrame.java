package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonFalcariusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftFoot;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftFinger;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightFinger;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonFalcariusFrame() {
        this.textureWidth = 60;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -14.0F, -2.8F, 1, 14, 1, -0.23F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.7F, -14.0F, -15.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2094F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.4F, -3.0F, -0.5F, 1, 17, 1, -0.23F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.7F, -14.0F, -15.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2094F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.5F, -3.5F, -0.5F, 1, 5, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -13.0F, -2.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.6F, -3.0F, -0.5F, 1, 6, 1, -0.2F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -13.8F, -2.4F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0F, 0.0F, 0.0436F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.8F, -2.7F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3316F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 16, -1.0F, -0.3F, 0.0F, 1, 1, 5, -0.2F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.8F, 1.0F, 0.05F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.6906F, 0.1119F, 0.1343F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 4.9052F, 1.1362F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.1606F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 6.1946F, 0.578F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7346F, -0.1132F, -0.1328F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 2.7934F, -0.3088F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3054F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.8F, 1.0F, 0.05F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -1.5275F, 0.0057F, -0.1308F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 4.9052F, 1.1362F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.3788F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 6.1946F, 0.578F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.5236F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 2.7934F, -0.3088F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 1.6144F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.2F, -2.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0228F, 0.1299F, 0.0436F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -2.2F, -4.2F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.288F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -1, 11, -1.0F, 0.6028F, -3.3624F, 1, 1, 4, -0.2F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.1F, 0.3F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 23, -1.0F, 0.2F, -4.8F, 1, 1, 5, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -2.6F, -7.4F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.1745F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 32, 33, -0.5F, 0.1F, -2.9F, 1, 1, 3, -0.2F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(2.1474F, 2.2395F, -3.2157F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.9206F, 0.2777F, -0.1204F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0941F, 4.4353F, -0.2475F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.0879F, 0.0006F, 0.1502F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 3.1F, -0.3F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.4224F, -0.281F, 0.2936F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(-0.0388F, 0.6879F, -0.4515F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.2618F, 0.0F, 0.0F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.1474F, 2.2395F, -3.2157F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.4842F, -0.2777F, 0.1204F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0941F, 4.4353F, -0.2475F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.3497F, -0.0006F, -0.1502F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2F, 3.1F, -0.3F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.4224F, 0.281F, -0.2936F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0388F, 0.6879F, -0.4515F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.2618F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.2F, -2.8F);
        this.chest.addChild(neck4);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.0F, -0.3F);
        this.neck4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4189F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, -1, 31, -1.0F, 0.1F, -3.9F, 1, 1, 5, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.4F, -3.4F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, -0.1745F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -4.2F, -4.2F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.8727F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 24, -1.0F, -0.3828F, 0.2841F, 1, 1, 6, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -4.6F, -3.9F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.1614F, 0.6102F, 0.0532F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -3.2F, -1.9F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.9512F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 29, -1.0F, 0.3589F, -0.3633F, 1, 1, 5, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.1F, -2.0F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.3491F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.5F, -1.4F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6458F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 43, -0.5F, 0.5707F, 0.1624F, 1, 1, 2, -0.2F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.9F, -3.5F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 43, -0.5F, 0.6F, 0.5F, 1, 1, 2, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.2F, -3.3F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0F, 0.0F, -0.0436F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7F, 0.2F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.9599F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.3F, 2.1F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2428F, -0.1022F, 0.1926F);
        this.tail.cubeList.add(new ModelBox(tail, 16, 19, -0.5F, 0.0F, -0.5F, 1, 1, 7, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0894F, -0.2173F, -0.0193F);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 0, -0.5F, 0.0F, 0.0F, 1, 1, 8, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0081F, 0.5001F, -0.3254F);
        this.tail3.cubeList.add(new ModelBox(tail3, -2, 10, -0.5F, 0.0F, -0.4F, 1, 1, 11, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.151F, 0.3887F, -0.0576F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.6F, 0.0F, 0.0F, 1, 1, 10, -0.2F, false));

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
