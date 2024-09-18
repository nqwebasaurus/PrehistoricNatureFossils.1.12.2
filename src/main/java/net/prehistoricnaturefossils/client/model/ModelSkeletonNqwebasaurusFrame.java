package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonNqwebasaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r5;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightToes;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftFinger;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightFinger;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r12;

    public ModelSkeletonNqwebasaurusFrame() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.7138F, -15.3F, -13.8481F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -2.7F, -0.45F, 1, 18, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.7138F, -15.3F, -13.8481F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.0F, -2.5F, -0.55F, 1, 5, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -15.0F, -3.1F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2793F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 1.6F, -3.0F, -0.6F, 1, 6, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -15.0F, -3.1F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2793F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.5F, -3.0F, -0.5F, 1, 18, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -18.0F, -3.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1213F, 0.2482F, -0.1345F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.5F, -2.0F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -2, 20, -1.0F, 0.5F, -0.6F, 1, 1, 6, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.9F, 0.7F, -0.15F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.0417F, -0.0628F, 0.1316F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 5.9052F, 0.8362F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.0297F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 8.1946F, 0.178F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.8727F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 3.7934F, -0.3088F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.5672F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.leftFoot.addChild(leftToes);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.9F, 0.7F, -0.15F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.48F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 5.9052F, 0.8362F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.8547F, -0.0329F, 0.0286F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.1946F, 0.178F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.8616F, -0.051F, 0.1274F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 3.7934F, -0.3088F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.5672F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -2.5F);
        this.rightFoot.addChild(rightToes);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.2F, -2.2F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0409F, -0.1292F, 0.0486F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -0.3F, -3.8F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2094F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 25, -1.0F, 0.7087F, -2.0316F, 1, 1, 2, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.2F, 0.2F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 26, -1.0F, 0.0F, -4.2F, 1, 1, 4, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.6F, -5.8F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.0F, 0.0436F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 1.3F, -3.7F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2094F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, -1, 27, -1.0F, -0.3F, -0.2F, 1, 1, 5, -0.15F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(2.5474F, 4.1395F, -2.7157F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.7929F, 0.0569F, -0.3716F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0941F, 3.5353F, -0.0475F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.2658F, 0.0387F, -0.0202F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 3.8F, -0.3F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.499F, -0.223F, -0.0302F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.474F, -0.056F, -0.211F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.5474F, 4.1395F, -2.7157F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.0596F, -0.2218F, 0.2273F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0941F, 3.5353F, -0.0475F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.2519F, 0.2938F, 0.1277F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2F, 3.8F, -0.3F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.4868F, 0.0692F, -0.0532F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.4765F, -0.024F, 0.0558F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.8F, -3.7F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, -0.1309F, 0.1745F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.7F, 0.7F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3515F, -0.1148F, 0.042F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 38, -1.1F, -0.2565F, -3.151F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.6F, -1.7F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.1429F, -0.4663F, -0.1698F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -0.6F, -0.6F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.829F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 18, -1.0F, 0.1F, -4.8F, 1, 1, 6, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -4.2F, -3.8F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.1874F, -0.4199F, -0.0065F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.3F, -2.5F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 31, 5, -0.5F, -0.2F, -0.4F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4F, -2.6F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.2618F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.637F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 2.9F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.088F, 0.1304F, -0.0115F);
        this.tail.cubeList.add(new ModelBox(tail, 24, 24, -0.5F, 0.1F, 0.2F, 1, 1, 4, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.8F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0177F, -0.1745F, -0.0031F);
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 0, -0.5F, 0.1F, 0.0F, 1, 1, 7, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1949F, -0.1713F, -0.0336F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 11, -0.5F, 0.0F, -0.5F, 1, 1, 8, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1347F, -0.4329F, 0.0568F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0175F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -0.6F, 0.0F, -0.7F, 1, 1, 9, -0.15F, false));

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
