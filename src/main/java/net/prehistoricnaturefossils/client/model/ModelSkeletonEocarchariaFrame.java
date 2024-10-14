package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEocarchariaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body;
    private final ModelRenderer cube_r3;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck;
    private final ModelRenderer heads;
    private final ModelRenderer leftHead;
    private final ModelRenderer rightHead;
    private final ModelRenderer jaw;
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
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;

    public ModelSkeletonEocarchariaFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -34.0F, -0.9F, 1, 34, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 0.3F, -41.0F, -29.6F, 1, 41, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -33.5F, -29.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.5F, -7.0F, 0.0F, 1, 12, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.0F, -6.5F, 28.7F, 1, 13, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -33.0F, 0.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.2182F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.9F, -4.7F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1047F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 38, -0.5F, 1.0F, 0.0F, 1, 2, 12, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0433F, -0.0437F, -0.0038F);
        this.body.cubeList.add(new ModelBox(body, 0, 35, -0.5F, 0.1041F, -11.7175F, 1, 2, 12, 0.006F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.8F, -12.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0175F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 76, 4, -0.5F, 0.9093F, -4.7158F, 1, 2, 5, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.3F, -16.7F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.1309F, 0.0429F, -0.0114F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.1F, -8.6F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 0, -0.5F, -0.9584F, -0.0058F, 1, 2, 9, 0.006F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(5.5F, 10.031F, -5.3704F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.7505F, 0.2618F, 0.0F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.3F, 5.0347F, 1.6893F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.3103F, -0.3084F, 0.3163F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 3.8693F, 0.2266F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, 0.0F, 0.4363F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-5.5F, 10.031F, -5.3704F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 1.3177F, -0.2618F, 0.0F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.3F, 5.0347F, 1.6893F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.3537F, 0.3344F, -0.2891F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2F, 3.8693F, 0.2266F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.0F, -0.4363F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 1.1F, -8.7F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, -0.0873F, -0.0436F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.7F, -3.9F);
        this.neck4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 37, 27, -0.5F, -1.0F, -0.3F, 1, 2, 5, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.3F, -3.5F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.1304F, 0.0007F, 0.0114F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0568F, -2.1471F);
        this.neck3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5286F, 0.1335F, 0.1243F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 82, 42, -0.7F, -1.0F, -1.6F, 1, 2, 4, 0.006F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.7F, -3.4F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.2556F, 0.2502F, 0.2323F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.6F, 0.3F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5236F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 76, 51, -0.5F, -0.5F, -4.7F, 1, 2, 5, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.4F, -3.7F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.1329F, 0.173F, -0.023F);
        this.neck.cubeList.add(new ModelBox(neck, 53, 87, -0.5F, 0.0F, -3.0F, 1, 2, 3, 0.006F, false));

        this.heads = new ModelRenderer(this);
        this.heads.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck.addChild(heads);
        this.setRotateAngle(heads, -0.1726F, -0.0355F, 0.0504F);


        this.leftHead = new ModelRenderer(this);
        this.leftHead.setRotationPoint(1.6F, -0.4631F, -3.1808F);
        this.heads.addChild(leftHead);


        this.rightHead = new ModelRenderer(this);
        this.rightHead.setRotationPoint(-1.6F, -0.4631F, -3.1808F);
        this.heads.addChild(rightHead);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.4F, 2.0F);
        this.heads.addChild(jaw);
        this.setRotateAngle(jaw, 1.2654F, 0.0F, 0.0F);


        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(5.5F, 0.1F, -0.3F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0087F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 13.2752F, 0.5563F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7854F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.2F, 14.1472F, -1.1617F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7679F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 6.5553F, 0.4261F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.2269F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, -0.5746F, -2.9368F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, 0.0125F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-5.5F, 0.1F, -0.3F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.3403F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 13.2752F, 0.5563F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7854F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.2F, 14.1472F, -1.1617F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.5934F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 6.5553F, 0.4261F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3578F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, -0.5746F, -2.9368F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.0125F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.7F, 7.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.13F, 0.1688F, -0.0566F);
        this.tail.cubeList.add(new ModelBox(tail, 36, 43, -0.5F, 0.0F, 0.0F, 1, 2, 10, 0.006F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 9.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.108F, 0.1354F, -0.0332F);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 21, -0.5F, 0.0F, 0.0F, 1, 2, 14, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0811F, 0.3416F, -0.1423F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 18, -0.5F, 0.0F, 0.0F, 1, 2, 14, 0.006F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.6F, 14.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1801F, 0.2839F, -0.1608F);
        this.tail4.cubeList.add(new ModelBox(tail4, 33, 4, -0.5F, 0.4F, -0.2F, 1, 1, 14, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 13.9F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2074F, 0.3851F, -0.0789F);
        this.tail5.cubeList.add(new ModelBox(tail5, 41, 28, -0.5F, 0.3F, -0.4F, 1, 1, 11, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 10.9F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3468F, 0.6251F, -0.2084F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 50, -0.5F, 0.3F, -0.4F, 1, 1, 10, -0.15F, false));

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
