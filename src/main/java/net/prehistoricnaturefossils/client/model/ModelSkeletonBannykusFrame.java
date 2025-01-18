package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBannykusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
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
    private final ModelRenderer torso;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r10;
    private final ModelRenderer throat;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftClaw;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightClaw;

    public ModelSkeletonBannykusFrame() {
        this.textureWidth = 60;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -16.0F, 0.6F, 1, 16, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.2F, -13.5F, -8.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5236F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 0.0F, -2.5F, -0.5F, 1, 16, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.2F, -14.3F, -8.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5236F, 0.0F, -1.4661F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -0.1F, -2.2F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -13.5F, 1.1F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 2.0F, -2.5F, -0.5F, 1, 5, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(1.5F, -16.0F, 0.5F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0873F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.2F, -1.3F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.192F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 32, -2.0F, 0.4821F, -0.2004F, 1, 1, 4, -0.15F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(-1.0F, -0.3572F, 2.5598F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.2231F, -0.1951F, 0.1313F);
        this.tail1.cubeList.add(new ModelBox(tail1, -2, 14, -1.0F, 0.4553F, -0.453F, 1, 1, 8, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(-0.5F, 0.2093F, 6.9697F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0268F, -0.2181F, 0.0058F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 0, -0.5F, 0.2983F, -0.0739F, 1, 1, 7, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1591F, 6.9235F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0464F, -0.3487F, -0.0159F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 16, -0.5F, 0.1414F, -0.4053F, 1, 1, 6, -0.15F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 21, -0.5F, 0.1414F, 5.2947F, 1, 1, 1, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1975F, 5.8947F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1646F, -0.3016F, -0.0493F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.3289F, -0.0992F, 1, 1, 7, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.5F, -0.1132F, 0.6096F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -1.4835F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-2.1F, 5.4574F, 3.6402F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.8727F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.2F, 2.4128F, 6.9674F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.2618F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(2.0F, 3.6462F, 1.783F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.7854F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 1.6303F, 0.6468F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, 0.48F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.5F, -0.1132F, 0.6096F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.7854F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(2.1F, 5.4574F, 3.6402F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.2182F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.2F, 2.4128F, 6.9674F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.3927F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(-2.0F, 3.6462F, 1.783F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.9599F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 1.6303F, 0.6468F);
        this.rightFoot.addChild(rightToes);


        this.torso = new ModelRenderer(this);
        this.torso.setRotationPoint(-1.5F, -1.1F, -1.1F);
        this.hips.addChild(torso);
        this.setRotateAngle(torso, 0.0117F, 0.2615F, 0.0452F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(1.9829F, -0.7F, -5.8389F);
        this.torso.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 25, -2.5F, 0.75F, -0.3F, 1, 1, 6, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(-0.0171F, -0.337F, -5.891F);
        this.torso.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.1309F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, -0.263F, -4.5479F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0262F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 9, -2.0F, 0.5204F, -0.3246F, 1, 1, 5, -0.15F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.5F, -0.163F, -4.6479F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.0F, 0.2618F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.1F, -1.0F);
        this.neck1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.7767F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 20, -1.0F, 0.2373F, 1.3836F, 1, 1, 1, -0.15F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 41, 19, -1.0F, 0.2373F, -0.3164F, 1, 1, 2, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.0215F, -1.0982F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.3574F, 0.346F, 0.0475F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -5.4788F, -1.1484F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.3963F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 24, -0.5F, -0.0133F, -0.1722F, 1, 1, 6, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(-0.0765F, -5.394F, -1.2934F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, 0.3927F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.6749F, -1.9219F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.7418F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 32, -0.5F, -0.0494F, -0.1793F, 1, 1, 3, -0.2F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(-0.5F, -1.4575F, -1.9561F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.262F, -0.0038F, -0.0872F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.0534F, -1.3757F);
        this.neck4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.192F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 38, -0.5F, -0.509F, -0.4489F, 1, 1, 2, -0.2F, false));

        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.8343F, -1.4229F);
        this.neck4.addChild(throat);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.3008F, -1.6079F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -0.0873F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.6102F, -0.0107F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2094F, 0.0F, 0.0F);


        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(1.8624F, 1.837F, -3.6438F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.0873F, 0.2182F, 0.0F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 1.0765F, 1.9591F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.2418F, -1.0329F, -0.5605F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.8F, 1.4449F, -0.3698F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1745F, 0.0F, 0.0F);


        this.leftClaw = new ModelRenderer(this);
        this.leftClaw.setRotationPoint(-1.0F, -1.2F, -1.1F);
        this.leftHand.addChild(leftClaw);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-1.8624F, 1.837F, -3.6438F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.2182F, -0.2182F, 0.0F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 1.0765F, 1.9591F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.134F, 0.2163F, 0.0289F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.8F, 1.4449F, -0.3698F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.1745F, 0.0F, 0.0F);


        this.rightClaw = new ModelRenderer(this);
        this.rightClaw.setRotationPoint(1.0F, -1.2F, -1.1F);
        this.rightHand.addChild(rightClaw);

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
