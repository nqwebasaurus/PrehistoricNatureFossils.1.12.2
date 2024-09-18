package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPelecanimimusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r2;
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
    private final ModelRenderer cube_r3;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftFinger;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightFinger;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonPelecanimimusFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -21.0F, -2.9F, 1, 21, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -17.0F, -16.1F, 1, 17, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -17.5F, -15.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -3.5F, -2.7F, -0.5F, 1, 6, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 1.7F, -3.5F, 12.7F, 1, 8, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -21.5F, -1.9F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.3054F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -1.3F, -4.6F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1222F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 12, -1.0F, 0.5F, 0.0F, 1, 1, 10, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.6F, 1.5F, -0.85F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.6939F, 0.084F, 0.1005F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.799F, 1.9326F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.3961F, -0.043F, 0.0076F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 8.1946F, 0.378F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7413F, -0.0295F, -0.0322F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 4.9934F, -0.3088F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3054F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, 0.2618F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.6F, 1.5F, -0.85F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.9559F, -0.1071F, -0.0754F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.799F, 1.9326F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0908F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.1946F, 0.378F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7413F, 0.0295F, 0.0322F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 4.9934F, -0.3088F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3052F, -0.0131F, 0.0416F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -2.5F);
        this.rightFoot.addChild(rightToes);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.9F, -4.6F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0698F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -1.0F, -8.8F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0611F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 13, -1.0F, 0.6235F, 2.0529F, 1, 1, 7, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.6F, -6.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.1222F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0F, -0.3F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 21, -1.0F, 0.3988F, -5.2156F, 1, 1, 6, -0.15F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(3.0474F, 3.1395F, -3.1157F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.0134F, 0.3297F, -0.3658F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0941F, 7.1353F, 0.0525F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.8286F, -0.0579F, -0.1086F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 4.5F, -0.5F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2646F, -0.0214F, -0.4902F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.5603F, -0.0934F, -0.1476F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.0474F, 3.1395F, -3.1157F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.5233F, -0.3187F, 0.1359F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0941F, 7.1353F, 0.0525F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.6592F, 0.1352F, 0.0048F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2F, 4.5F, -0.5F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.22F, 0.1498F, -0.0196F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.4363F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.4F, -4.6F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, -0.2303F, 0.17F, -0.0396F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, -6.0F);
        this.neck4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 11, -1.0F, -0.1001F, 2.0035F, 1, 1, 4, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.4F, -3.8F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.0895F, 0.4828F, 0.3891F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.1F, -0.5F, -3.0F);
        this.neck3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4984F, 0.0403F, -0.0343F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 40, -0.6F, -0.768F, -0.1706F, 1, 1, 4, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.6F, -2.2F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.2636F, 0.3804F, 0.0999F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.6F, -2.0F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.0583F, 0.0515F, -0.0912F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 45, 2, -0.5F, -0.4751F, -0.1334F, 1, 1, 3, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.3F, -1.4F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.4363F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.4F, -1.9F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2812F, 0.1174F, -0.0338F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 44, -0.5F, -0.5473F, -0.1931F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3F, -1.9F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.0447F, 0.218F, -0.0097F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.1F, 0.8F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.48F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.4F, 5.2F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0F, 0.1745F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, -1, 23, -0.5F, 0.0F, -0.4F, 1, 1, 8, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.3693F, 0.2449F, 0.0936F);
        this.tail2.cubeList.add(new ModelBox(tail2, 30, 3, -0.5F, 0.1F, 0.0F, 1, 1, 6, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1715F, 0.2581F, 0.0442F);
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 27, -0.5F, 0.0F, -0.4F, 1, 1, 7, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.4368F, 0.2783F, 0.1275F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.1F, 0.0F, 1, 1, 10, -0.15F, false));

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
