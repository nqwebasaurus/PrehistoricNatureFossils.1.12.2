package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonShuvuuiaFrame extends ModelBase {
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
    private final ModelRenderer torso;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r11;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftClaw;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightClaw;

    public ModelSkeletonShuvuuiaFrame() {
        this.textureWidth = 60;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -17.7F, -1.6F, 1, 18, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -15.95F, -10.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0698F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.4F, -3.05F, -0.5F, 1, 19, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -15.95F, -10.7F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0698F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 0.45F, -2.5F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -15.0F, -1.1F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 2.0F, -3.0F, -0.5F, 1, 5, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -17.4027F, -1.8241F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.0785F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, -1.2F, -1.3F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.192F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 24, -2.0F, 0.2821F, -0.0004F, 1, 1, 5, -0.15F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.0572F, 3.5598F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.3893F, -0.1617F, 0.066F);
        this.tail1.cubeList.add(new ModelBox(tail1, 16, 15, -0.5F, 0.1607F, -0.2927F, 1, 1, 7, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1146F, 5.93F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1442F, 0.214F, 0.0874F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 17, -0.5F, 0.0983F, 0.3261F, 1, 1, 7, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1409F, 6.9235F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2796F, 0.2521F, 0.0715F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 8, -0.5F, 0.2411F, -0.2184F, 1, 1, 6, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1023F, 5.8816F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0432F, 0.1982F, 0.0917F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.1F, -0.5174F, 0.0008F);
        this.tail4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.0175F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 8, -0.5F, 0.6463F, -0.4F, 1, 1, 7, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.0F, -0.3918F, 0.6587F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.7941F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-0.1F, 4.8287F, 2.4761F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.4102F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.2F, 2.9634F, 8.7212F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.2182F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 4.7111F, 2.5287F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -1.1083F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 1.6303F, 0.6468F);
        this.leftFoot.addChild(leftToes);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.0F, -0.3918F, 0.6587F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -1.0996F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.1F, 4.8287F, 2.4761F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.2356F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.2F, 2.9634F, 8.7212F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.2182F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 4.7111F, 2.5287F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.7156F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 1.6303F, 0.6468F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.0873F, 0.0F, 0.0F);


        this.torso = new ModelRenderer(this);
        this.torso.setRotationPoint(0.0F, -1.1F, -1.1F);
        this.hips.addChild(torso);
        this.setRotateAngle(torso, 0.0F, -0.0873F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(2.0F, -0.7F, -6.1F);
        this.torso.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 0, -2.5F, 0.55F, 0.1F, 1, 1, 6, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.337F, -6.1521F);
        this.torso.addChild(chest);
        this.setRotateAngle(chest, 0.1747F, 0.043F, 0.0076F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, -0.263F, -4.5479F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0262F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 32, -2.0F, 0.3204F, 1.8754F, 1, 1, 3, -0.15F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.0324F, -2.8098F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.5672F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -1.1F, -1.0F);
        this.neck1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7767F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 38, -1.0F, 0.0373F, -0.7164F, 1, 1, 3, -0.204F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.0215F, -1.0982F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3665F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -5.4788F, -1.1484F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.3614F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 24, -0.5F, -0.0133F, 2.0278F, 1, 1, 4, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -3.594F, -0.7086F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2379F, 0.2096F, 0.061F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.6749F, -1.9219F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.672F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 40, -0.5F, 0.1506F, 0.9207F, 1, 1, 2, -0.2F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.8231F, -1.183F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.0975F, 0.1737F, 0.0169F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.0534F, -1.3757F);
        this.neck4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.192F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 41, 24, -0.5F, -0.309F, -0.4489F, 1, 1, 2, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.1F, -0.0841F, -1.4261F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.3054F, 0.0F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.3F, 0.0838F, -2.3755F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.5F, 0.0838F, -2.3755F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.4F, 0.7496F, -0.1856F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1309F, 0.0F, 0.0F);


        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(2.1886F, 1.94F, -2.1176F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.1745F, 0.2182F, 0.0F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0119F, 0.5239F, 0.9729F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.1309F, 0.0F, 0.0F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.3F, 0.8019F, -0.1786F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1745F, 0.0F, 0.0F);


        this.leftClaw = new ModelRenderer(this);
        this.leftClaw.setRotationPoint(0.0F, -0.2F, -0.1F);
        this.leftHand.addChild(leftClaw);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.1886F, 1.94F, -2.1176F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -1.1113F, 0.3757F, 0.2802F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0119F, 0.5239F, 0.9729F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.3927F, 0.0F, 0.0F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.3F, 0.8019F, -0.1786F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.1745F, 0.0F, 0.0F);


        this.rightClaw = new ModelRenderer(this);
        this.rightClaw.setRotationPoint(0.0F, -0.2F, -0.1F);
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
