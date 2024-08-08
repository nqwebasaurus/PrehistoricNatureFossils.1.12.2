package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonStruthiomimusFrame extends ModelBase {
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
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightToes;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
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
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonStruthiomimusFrame() {
        this.textureWidth = 73;
        this.textureHeight = 73;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -24.6F, -3.0F, 1, 25, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -21.5F, -2.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 1.4F, -3.5F, -0.5F, 1, 8, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.9F, -26.0F, -22.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3478F, -0.0298F, -1.6528F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.3F, -6.5F, -0.5F, 1, 7, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.9F, -23.75F, -22.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.3491F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -4.1F, -6.25F, -0.5F, 1, 30, 1, -0.21F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -24.5F, -2.2F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.2618F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.3F, -4.6F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 0, -1.0F, 0.6F, 0.2F, 1, 1, 10, -0.2F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.6F, 1.3F, -0.05F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -1.0457F, 0.0791F, 0.037F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 8.6052F, 1.9362F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 2.0944F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 11.1946F, 0.378F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.4399F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 6.9934F, -0.3088F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 1.5708F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, 0.3491F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.6F, 1.3F, -0.05F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.4696F, -0.1084F, -0.1897F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 8.6052F, 1.9362F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.3526F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 11.1946F, 0.378F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7873F, 0.185F, 0.0618F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 6.9934F, -0.3088F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.1745F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -2.5F);
        this.rightFoot.addChild(rightToes);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.9F, -4.6F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.2182F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -1.0F, -8.8F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0611F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 30, -1.0F, 0.7235F, -0.4471F, 1, 1, 10, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.6F, -8.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.1309F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.0F, -0.3F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 40, -1.0F, 0.3F, -6.7F, 1, 1, 7, -0.2F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(3.0474F, 4.9395F, -5.9157F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.2437F, 0.7906F, -1.4185F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0941F, 7.1353F, 0.0525F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.9167F, 0.0387F, -0.0202F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 4.5F, -0.5F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.5691F, -0.1498F, 0.0196F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.4363F, 0.0F, 0.0F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.0474F, 4.9395F, -5.9157F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.4094F, -0.9531F, 1.0091F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0941F, 7.1353F, 0.0525F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.004F, -0.0387F, 0.0202F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2F, 4.5F, -0.5F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.5254F, 0.1498F, -0.0196F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.5672F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.6F, -6.8F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, 0.0873F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.0F, -6.0F);
        this.neck4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, -1, 7, -1.0F, -0.3F, -0.7F, 1, 1, 7, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.6F, -5.7F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.6149F, -0.1071F, 0.0754F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -2.2F, -4.4F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6021F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 41, -1.0F, -0.3462F, -0.4047F, 1, 1, 6, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.6F, -3.9F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.0439F, 0.0421F, -0.0113F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -7.1F, -3.6F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.0559F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 0, -0.5F, 0.6855F, 0.258F, 1, 1, 8, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -6.7F, -3.8F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.3079F, 0.1248F, 0.0396F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.2F, -2.6F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2793F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 51, 51, -0.5F, 0.7F, 0.9F, 1, 1, 2, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.7F, -2.7F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.5236F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.1F, 0.7F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5934F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.4F, 5.2F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.217F, -0.1298F, 0.0172F);
        this.tail.cubeList.add(new ModelBox(tail, 29, 11, -0.5F, 0.1F, -0.4F, 1, 1, 10, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 8.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.3169F, -0.2609F, -0.0296F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 19, -0.5F, 0.2F, -0.1F, 1, 1, 10, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 9.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.4565F, -0.1081F, 0.0617F);
        this.tail3.cubeList.add(new ModelBox(tail3, -1, 28, -0.5F, 0.0F, -0.8F, 1, 1, 10, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 8.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.4584F, -0.1677F, 0.0486F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, -0.1F, -0.6F, 1, 1, 16, -0.2F, false));

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
