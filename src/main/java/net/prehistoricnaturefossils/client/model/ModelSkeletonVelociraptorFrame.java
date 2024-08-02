package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonVelociraptorFrame extends ModelBase {
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
    private final ModelRenderer leftSickleClaw;
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightSickleClaw;
    private final ModelRenderer rightToes;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftFinger;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightFinger;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonVelociraptorFrame() {
        this.textureWidth = 68;
        this.textureHeight = 68;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 1.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -23.0F, -1.9F, 1, 23, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -22.6F, -11.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1396F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 4.2F, -3.0F, -0.5F, 1, 7, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -22.6F, -11.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1396F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.4F, -6.4F, -0.5F, 1, 29, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -16.5F, -1.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 6.2F, -3.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -23.0F, -1.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.5672F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.1F, -3.3F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 0, -1.0F, -0.5F, 0.5F, 1, 1, 6, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.3F, 0.0F, -0.35F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.6091F, 0.05F, 0.0715F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.1052F, 0.2362F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.7453F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 9.0946F, 0.178F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.0893F, -0.0774F, -0.0404F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 3.7934F, -0.3088F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 1.2654F, 0.0F, 0.0F);


        this.leftSickleClaw = new ModelRenderer(this);
        this.leftSickleClaw.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.leftFoot.addChild(leftSickleClaw);
        this.setRotateAngle(leftSickleClaw, -1.2654F, 0.3054F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, -0.6109F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.3F, 0.0F, -0.35F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.4784F, -0.0403F, -0.0774F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.1052F, 0.2362F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6109F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 9.0946F, 0.178F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.1657F, 0.2415F, 0.1022F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 3.7934F, -0.3088F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 2.138F, 0.0F, 0.0F);


        this.rightSickleClaw = new ModelRenderer(this);
        this.rightSickleClaw.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.rightFoot.addChild(rightSickleClaw);
        this.setRotateAngle(rightSickleClaw, -1.1345F, -0.3054F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -2.5F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.2618F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6F, -3.3F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.0436F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.7F, -3.9F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 0, -1.0F, 0.5F, 0.8F, 1, 1, 4, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.1F, -4.7F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.1309F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.0F, -2.9F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2443F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 51, -1.0F, 0.7036F, -2.3441F, 1, 1, 3, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 34, -1.0F, 0.2F, -2.4F, 1, 1, 4, -0.15F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(3.2474F, 2.9395F, -3.5157F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.657F, 0.0545F, -1.269F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0941F, 4.6353F, -0.6475F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.7894F, 0.0387F, -0.0202F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 4.5F, -0.4F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.6614F, -0.0692F, 0.0532F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.2597F, -0.0338F, -0.1265F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.2474F, 2.9395F, -3.5157F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.5557F, -0.0922F, 1.2823F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0941F, 4.6353F, -0.6475F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.7894F, -0.0387F, 0.0202F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2F, 4.5F, -0.4F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.7923F, 0.0692F, -0.0532F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.2597F, 0.0338F, 0.1265F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.1F, -4.8F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.3054F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.2F, -1.2F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 60, 50, -1.0F, -0.1643F, 0.3306F, 1, 1, 1, -0.15F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -0.6F, -3.0F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 52, -1, -1.0F, -0.4F, -0.1F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.3F, -3.0F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.2676F, 0.212F, 0.0517F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -2.7F, -1.9F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7941F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 11, -1.0F, 0.7738F, -0.0688F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.9F, -2.8F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.0873F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.6F, -1.0F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4014F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 52, 24, -0.5F, 0.7324F, 0.0085F, 1, 1, 2, -0.15F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.3F, -2.8F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0349F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 31, 53, -0.5F, 0.3697F, -0.203F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2F, -3.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2628F, 0.0956F, -0.0195F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.1F, 1.5F, 0.4F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.0996F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3F, 2.7F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.1747F, 0.043F, 0.0076F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 26, -0.5F, 0.1F, 0.0F, 1, 1, 6, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.4267F, 0.0059F, -0.018F);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 1, -0.5F, 0.0F, -0.6F, 1, 1, 11, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2812F, -0.0077F, 0.0214F);
        this.tail3.cubeList.add(new ModelBox(tail3, -1, 12, -0.5F, 0.1F, -0.2F, 1, 1, 12, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0573F, -0.0077F, 0.0465F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.1F, 0.0F, 1, 1, 11, -0.15F, false));

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
