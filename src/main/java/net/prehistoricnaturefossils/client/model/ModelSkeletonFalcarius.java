package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonFalcarius extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer cube_r19;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftFoot;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer cube_r22;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer body;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer leftArm1;
    private final ModelRenderer cube_r73;
    private final ModelRenderer leftArm2;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftFinger;
    private final ModelRenderer rightArm1;
    private final ModelRenderer cube_r76;
    private final ModelRenderer rightArm2;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightFinger;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r90;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r91;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer head;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer cube_r98;
    private final ModelRenderer cube_r99;
    private final ModelRenderer cube_r100;
    private final ModelRenderer cube_r101;
    private final ModelRenderer cube_r102;
    private final ModelRenderer cube_r103;
    private final ModelRenderer cube_r104;
    private final ModelRenderer cube_r105;
    private final ModelRenderer cube_r106;
    private final ModelRenderer cube_r107;
    private final ModelRenderer cube_r108;
    private final ModelRenderer cube_r109;
    private final ModelRenderer cube_r110;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r111;
    private final ModelRenderer cube_r112;
    private final ModelRenderer cube_r113;
    private final ModelRenderer cube_r114;
    private final ModelRenderer cube_r115;
    private final ModelRenderer cube_r116;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r117;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r118;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r119;
    private final ModelRenderer tail4;

    public ModelSkeletonFalcarius() {
        this.textureWidth = 60;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -13.8F, -2.4F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0F, 0.0F, 0.0436F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.8F, -2.7F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3316F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -1.4F, 0.0F, 0, 1, 4, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 7, -2.0F, -1.0F, 1.5F, 1, 1, 2, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 26, -2.8F, -1.4F, 3.2F, 1, 1, 2, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 16, -2.8F, -1.4F, 1.6F, 1, 2, 2, 0.005F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 26, 0.8F, -1.4F, 3.2F, 1, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 16, 0.8F, -1.4F, 1.6F, 1, 2, 2, 0.005F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 7, 0.0F, -1.0F, 1.5F, 1, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 16, -1.0F, -1.0F, 0.0F, 1, 1, 5, -0.008F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, 1.2411F, 0.3301F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.6057F, 0.0F, -0.5934F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 49, -0.3F, -2.4668F, 1.725F, 1, 2, 1, -0.203F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, 1.2411F, 0.3301F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.7679F, 0.0F, -0.5934F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 0, -0.3F, 0.3485F, 1.4769F, 1, 2, 1, -0.2F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 1.2411F, 0.3301F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2793F, 0.0F, -0.5934F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 47, -0.3F, -0.6825F, -0.3427F, 1, 3, 1, -0.199F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0F, 2.1F, -1.0F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2094F, 0.0F, -0.5236F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 23, -0.3F, 3.3376F, -2.2135F, 1, 1, 1, -0.2F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, 2.1F, -1.0F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2443F, 0.0F, -0.5236F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 45, -0.3F, 2.334F, -3.2999F, 1, 1, 2, -0.2F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.0F, 2.1F, -1.0F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.384F, 0.0F, -0.5236F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 5, 0, -0.3F, 2.1873F, -1.0185F, 1, 2, 1, -0.2F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, 2.1F, -1.0F);
        this.hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5411F, 0.0F, -0.5236F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 45, -0.3F, -0.307F, -0.6327F, 1, 3, 1, -0.205F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.3F, -1.5F, -0.7F);
        this.hips.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4189F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 41, -2.0F, -0.187F, -1.6631F, 1, 1, 2, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 41, 1.6F, -0.187F, -1.6631F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.3F, -1.5F, -0.7F);
        this.hips.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0175F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 19, -2.0F, -0.087F, -1.6631F, 1, 1, 2, -0.003F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 19, 1.6F, -0.087F, -1.6631F, 1, 1, 2, -0.003F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.3F, 0.2F, -1.7F);
        this.hips.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0175F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 23, -2.0F, -0.12F, 0.3289F, 1, 2, 2, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 23, 1.6F, -0.12F, 0.3289F, 1, 2, 2, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(2.0F, 2.1F, -1.0F);
        this.hips.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2094F, 0.0F, 0.5236F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 23, -0.7F, 3.3376F, -2.2135F, 1, 1, 1, -0.2F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(2.0F, 2.1F, -1.0F);
        this.hips.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2443F, 0.0F, 0.5236F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 45, -0.7F, 2.334F, -3.2999F, 1, 1, 2, -0.2F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(2.0F, 2.1F, -1.0F);
        this.hips.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.384F, 0.0F, 0.5236F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 5, 0, -0.7F, 2.1873F, -1.0185F, 1, 2, 1, -0.2F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(2.0F, 1.2411F, 0.3301F);
        this.hips.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.6057F, 0.0F, 0.5934F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 39, 49, -0.7F, -2.4668F, 1.725F, 1, 2, 1, -0.203F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(2.0F, 1.2411F, 0.3301F);
        this.hips.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.7679F, 0.0F, 0.5934F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 35, 0, -0.7F, 0.3485F, 1.4769F, 1, 2, 1, -0.2F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(2.0F, 1.2411F, 0.3301F);
        this.hips.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2793F, 0.0F, 0.5934F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 47, -0.7F, -0.6825F, -0.3427F, 1, 3, 1, -0.199F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(2.0F, 2.1F, -1.0F);
        this.hips.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.5411F, 0.0F, 0.5236F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 47, 45, -0.7F, -0.307F, -0.6327F, 1, 3, 1, -0.205F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.8F, 1.0F, 0.05F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.6906F, 0.1119F, 0.1343F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 29, 47, -0.5F, -0.7948F, -0.5638F, 1, 3, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 2.2052F, -0.5638F);
        this.leftLeg1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3752F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 49, -0.5F, 0.0F, 0.0F, 1, 3, 1, 0.003F, false));

        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 4.9052F, 1.1362F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.1606F, 0.0F, 0.0F);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.6F, 3.1954F, 0.5233F);
        this.leftLeg2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 25, 36, -0.5F, -3.2F, -0.5F, 1, 6, 1, -0.2F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.4F, 2.9946F, 0.478F);
        this.leftLeg2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1047F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 20, 35, -0.5F, -3.0F, -0.6F, 1, 6, 1, 0.01F, false));

        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 6.1946F, 0.578F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7346F, -0.1132F, -0.1328F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 7, 38, -1.0F, -0.2066F, -0.6088F, 2, 3, 1, 0.0F, false));

        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 2.7934F, -0.3088F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3054F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 25, 10, -1.5F, -0.5F, -3.5F, 3, 1, 4, 0.0F, false));

        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.8F, 1.0F, 0.05F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -1.5275F, 0.0057F, -0.1308F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 13, 12, -0.5F, -0.7948F, -0.5638F, 1, 3, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 2.2052F, -0.5638F);
        this.rightLeg1.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3752F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 18, 48, -0.5F, 0.0F, 0.0F, 1, 3, 1, 0.003F, false));

        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 4.9052F, 1.1362F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.3788F, 0.0F, 0.0F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.6F, 3.1954F, 0.5233F);
        this.rightLeg2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 36, 6, -0.5F, -3.2F, -0.5F, 1, 6, 1, -0.2F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.4F, 2.9946F, 0.478F);
        this.rightLeg2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1047F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 13, 0, -0.5F, -3.0F, -0.6F, 1, 6, 1, 0.01F, false));

        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 6.1946F, 0.578F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.5236F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 38, -1.0F, -0.2066F, -0.6088F, 2, 3, 1, 0.0F, false));

        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 2.7934F, -0.3088F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 1.6144F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 24, 0, -1.5F, -0.5F, -3.5F, 3, 1, 4, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.2F, -2.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0228F, 0.1299F, 0.0436F);


        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, -2.2F, -4.2F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.288F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 6, -0.5F, -0.5972F, -1.2624F, 0, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 12, -1.0F, -0.0972F, -3.2624F, 1, 1, 3, -0.008F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -3.0777F, -6.821F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1571F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 6, 6, 0.0F, -0.4F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, -0.7F, -1.4F);
        this.body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0081F, -0.2752F, -1.6601F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 45, 32, -3.3318F, -1.4507F, -0.4648F, 2, 0, 1, 0.0F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -0.7F, -1.4F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1765F, -0.2124F, -0.9879F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 54, 51, -1.9397F, -0.3402F, -0.4648F, 1, 0, 1, 0.0F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, -0.7F, -1.4F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2302F, -0.106F, -0.651F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 29, 55, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, -1.5F, -3.1F);
        this.body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.004F, -0.1887F, -1.5582F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 13, 20, -4.3318F, -1.4507F, -0.4648F, 3, 0, 1, 0.0F, true));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, -1.5F, -3.1F);
        this.body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1126F, -0.1518F, -0.8948F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 34, 55, -1.9397F, -0.3402F, -0.4648F, 1, 0, 1, 0.0F, true));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, -1.5F, -3.1F);
        this.body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1505F, -0.0698F, -0.5532F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 55, 35, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -2.2F, -5.0F);
        this.body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0181F, -0.0849F, -1.5078F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 24, 6, -5.3318F, -1.4507F, -0.4648F, 4, 0, 1, 0.0F, true));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, -2.2F, -5.0F);
        this.body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0374F, -0.0784F, -0.851F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 55, 37, -1.9397F, -0.3402F, -0.4648F, 1, 0, 1, 0.0F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, -2.2F, -5.0F);
        this.body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0554F, -0.0258F, -0.5054F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 56, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, -2.6F, -6.8F);
        this.body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0227F, -0.0503F, -1.4383F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 9, 24, -5.3318F, -1.4507F, -0.4648F, 4, 0, 1, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, -2.6F, -6.8F);
        this.body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0237F, -0.0111F, -0.4362F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 56, 2, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, -2.6F, -6.8F);
        this.body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0126F, -0.0538F, -0.7829F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 56, 8, -1.9397F, -0.3402F, -0.4648F, 1, 0, 1, 0.0F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, -0.7F, -1.4F);
        this.body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.2302F, 0.106F, 0.651F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 29, 55, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.5F, -0.7F, -1.4F);
        this.body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.1765F, 0.2124F, 0.9879F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 54, 51, 0.9397F, -0.3402F, -0.4648F, 1, 0, 1, 0.0F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, -0.7F, -1.4F);
        this.body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0081F, 0.2752F, 1.6601F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 45, 32, 1.3318F, -1.4507F, -0.4648F, 2, 0, 1, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, -1.5F, -3.1F);
        this.body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.1505F, 0.0698F, 0.5532F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 55, 35, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, -1.5F, -3.1F);
        this.body.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.1126F, 0.1518F, 0.8948F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 34, 55, 0.9397F, -0.3402F, -0.4648F, 1, 0, 1, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.5F, -1.5F, -3.1F);
        this.body.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.004F, 0.1887F, 1.5582F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 13, 20, 1.3318F, -1.4507F, -0.4648F, 3, 0, 1, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, -2.2F, -5.0F);
        this.body.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0554F, 0.0258F, 0.5054F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 56, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5F, -2.2F, -5.0F);
        this.body.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.0374F, 0.0784F, 0.851F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 55, 37, 0.9397F, -0.3402F, -0.4648F, 1, 0, 1, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(0.5F, -2.2F, -5.0F);
        this.body.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0181F, 0.0849F, 1.5078F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 24, 6, 1.3318F, -1.4507F, -0.4648F, 4, 0, 1, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.5F, -2.6F, -6.8F);
        this.body.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0227F, 0.0503F, 1.4383F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 9, 24, 1.3318F, -1.4507F, -0.4648F, 4, 0, 1, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.5F, -2.6F, -6.8F);
        this.body.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.0237F, 0.0111F, 0.4362F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 56, 2, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.5F, -2.6F, -6.8F);
        this.body.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.0126F, 0.0538F, 0.7829F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 56, 8, 0.9397F, -0.3402F, -0.4648F, 1, 0, 1, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, 0.1F, 0.3F);
        this.body.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.3927F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 52, 56, -0.5F, -1.0F, -2.3F, 0, 1, 1, 0.0F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 55, 56, -0.5F, -1.0F, -4.3F, 0, 1, 1, 0.0F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 27, 23, -1.0F, -0.5F, -5.3F, 1, 1, 5, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 5.8022F, -2.3299F);
        this.body.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.5498F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 17, -1.0F, -1.8851F, -0.3744F, 2, 2, 2, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 3.7022F, -6.9299F);
        this.body.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.5498F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 15, 28, -2.0F, -1.9818F, -2.0178F, 4, 2, 2, 0.0F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, 4.2022F, -4.4299F);
        this.body.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.4276F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 13, 12, -1.5F, -1.4F, -2.5F, 3, 2, 5, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -2.6F, -7.4F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.1745F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 32, 33, -0.5F, -0.6F, -2.9F, 1, 1, 3, 0.0F, false));
        this.chest.cubeList.add(new ModelBox(chest, 19, 56, 0.0F, -0.9F, -1.9F, 0, 1, 1, 0.0F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, 3.7778F, -2.7364F);
        this.chest.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.493F, -0.6837F, 0.4616F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 6, -0.7F, 0.0F, -0.5101F, 1, 0, 3, 0.0F, true));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 3.7778F, -2.7364F);
        this.chest.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -1.0821F, -0.7844F, 1.5091F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 44, 38, -0.7F, 0.0F, -0.0101F, 1, 0, 2, 0.0F, true));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-1.7F, 2.2F, -4.3F);
        this.chest.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 1.7503F, 0.0684F, -0.7967F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 7, 32, -0.1835F, -0.1534F, -1.8499F, 1, 1, 2, -0.2F, true));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-2.3F, 0.8F, -3.5F);
        this.chest.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 1.1435F, -0.1578F, -0.3322F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 45, 28, -0.2F, -0.0587F, -1.7671F, 1, 1, 2, -0.2F, true));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 9, 26, -0.2F, -0.3587F, -1.8671F, 1, 1, 2, -0.2F, true));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(-2.0F, -0.3F, -1.3F);
        this.chest.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.0349F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 46, 4, -0.5F, -0.155F, -0.1702F, 1, 1, 2, -0.2F, true));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 46, 4, 3.5F, -0.155F, -0.1702F, 1, 1, 2, -0.2F, false));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(-2.0F, -0.1F, -1.4F);
        this.chest.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.4014F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 11, 33, -0.5F, -0.3F, -2.6F, 1, 1, 3, -0.2F, true));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 11, 33, 3.5F, -0.3F, -2.6F, 1, 1, 3, -0.2F, false));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.5F, -0.1F, -1.4F);
        this.chest.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0435F, 0.1054F, -1.5424F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 40, 23, -4.3318F, -1.4507F, -0.4648F, 3, 0, 1, 0.0F, true));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.5F, -0.1F, -1.4F);
        this.chest.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0987F, 0.0571F, -0.8874F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 56, 10, -1.9397F, -0.3402F, -0.4648F, 1, 0, 1, 0.0F, true));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(-0.5F, -0.1F, -1.4F);
        this.chest.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.1188F, 0.0552F, -0.5378F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 14, 56, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(0.5F, -0.1F, -1.4F);
        this.chest.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0435F, -0.1054F, 1.5424F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 40, 23, 1.3318F, -1.4507F, -0.4648F, 3, 0, 1, 0.0F, false));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(0.5F, -0.1F, -1.4F);
        this.chest.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0987F, -0.0571F, 0.8874F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 56, 10, 0.9397F, -0.3402F, -0.4648F, 1, 0, 1, 0.0F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.5F, -0.1F, -1.4F);
        this.chest.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.1188F, -0.0552F, 0.5378F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 14, 56, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(0.0F, 6.3022F, 0.4701F);
        this.chest.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -0.5498F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 31, 30, -1.5F, -0.9818F, -3.0178F, 3, 1, 1, 0.0F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(2.3F, 0.8F, -3.5F);
        this.chest.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 1.1435F, 0.1578F, 0.3322F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 45, 28, -0.8F, -0.0587F, -1.7671F, 1, 1, 2, -0.2F, false));
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 9, 26, -0.8F, -0.3587F, -1.8671F, 1, 1, 2, -0.2F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(1.7F, 2.2F, -4.3F);
        this.chest.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 1.7503F, -0.0684F, 0.7967F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 7, 32, -0.8165F, -0.1534F, -1.8499F, 1, 1, 2, -0.2F, false));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(0.0F, 3.7778F, -2.7364F);
        this.chest.addChild(cube_r70);
        this.setRotateAngle(cube_r70, -0.493F, 0.6837F, -0.4616F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 0, 6, -0.3F, 0.0F, -0.5101F, 1, 0, 3, 0.0F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.0F, 3.7778F, -2.7364F);
        this.chest.addChild(cube_r71);
        this.setRotateAngle(cube_r71, -1.0821F, 0.7844F, -1.5091F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 44, 38, -0.3F, 0.0F, -0.0101F, 1, 0, 2, 0.0F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(0.0F, 3.7F, -1.4F);
        this.chest.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.7854F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 40, 45, -0.5F, 0.5F, -2.9F, 1, 1, 2, 0.0F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(2.1474F, 2.2395F, -3.2157F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.9206F, 0.2777F, -0.1204F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 40, 0, -0.5059F, -0.5647F, -0.6475F, 1, 5, 1, -0.1F, false));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(-0.5059F, 1.4353F, 0.3525F);
        this.leftArm1.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -0.4712F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 50, 34, 0.0F, -1.7F, -1.0F, 1, 2, 1, -0.11F, false));

        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0941F, 4.4353F, -0.2475F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.0879F, 0.0006F, 0.1502F);


        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(1.2F, -0.75F, 0.5F);
        this.leftArm2.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.0524F, 0.0F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 47, 10, -1.75F, 0.2F, -0.8F, 1, 4, 1, -0.3F, false));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(0.05F, 2.25F, -0.5F);
        this.leftArm2.addChild(cube_r75);
        this.setRotateAngle(cube_r75, -0.0436F, 0.0F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 0, 47, -0.5F, -2.8F, -0.5F, 1, 4, 1, -0.3F, false));

        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 3.1F, -0.3F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.4224F, -0.281F, 0.2936F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 40, 12, -1.0388F, -0.0337F, -0.9491F, 1, 2, 2, -0.01F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 23, 49, -1.0388F, 1.9163F, -0.9491F, 1, 3, 1, -0.01F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 49, 50, -1.0388F, 1.9163F, 0.0509F, 1, 2, 1, -0.01F, false));

        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(-0.0388F, 0.6879F, -0.4515F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.2618F, 0.0F, 0.0F);
        this.leftFinger.cubeList.add(new ModelBox(leftFinger, 37, 38, -2.0F, 0.0F, -0.5F, 2, 3, 1, -0.02F, false));

        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.1474F, 2.2395F, -3.2157F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.4842F, -0.2777F, 0.1204F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 14, 38, -0.4941F, -0.5647F, -0.6475F, 1, 5, 1, -0.1F, false));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(0.5059F, 1.4353F, 0.3525F);
        this.rightArm1.addChild(cube_r76);
        this.setRotateAngle(cube_r76, -0.4712F, 0.0F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 49, 41, -1.0F, -1.7F, -1.0F, 1, 2, 1, -0.11F, false));

        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0941F, 4.4353F, -0.2475F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.3497F, -0.0006F, -0.1502F);


        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(-1.2F, -0.75F, 0.5F);
        this.rightArm2.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.0524F, 0.0F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 5, 47, 0.75F, 0.2F, -0.8F, 1, 4, 1, -0.3F, false));

        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(-0.05F, 2.25F, -0.5F);
        this.rightArm2.addChild(cube_r78);
        this.setRotateAngle(cube_r78, -0.0436F, 0.0F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 0, 24, -0.5F, -2.8F, -0.5F, 1, 4, 1, -0.3F, false));

        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2F, 3.1F, -0.3F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.4224F, 0.281F, -0.2936F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 38, 31, 0.0388F, -0.0337F, -0.9491F, 1, 2, 2, -0.01F, false));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 49, 21, 0.0388F, 1.9163F, -0.9491F, 1, 3, 1, -0.01F, false));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 44, 50, 0.0388F, 1.9163F, 0.0509F, 1, 2, 1, -0.01F, false));

        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0388F, 0.6879F, -0.4515F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.2618F, 0.0F, 0.0F);
        this.rightFinger.cubeList.add(new ModelBox(rightFinger, 30, 38, 0.0F, 0.0F, -0.5F, 2, 3, 1, -0.02F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.2F, -2.8F);
        this.chest.addChild(neck4);


        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(0.5F, 0.0F, -0.3F);
        this.neck4.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.4189F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 15, 49, -0.5F, -0.8F, -2.6F, 0, 1, 1, 0.0F, false));
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 5, 56, -0.5F, -0.9F, -0.6F, 0, 1, 1, 0.0F, false));
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 0, 32, -1.0F, -0.5F, -3.6F, 1, 1, 4, -0.008F, false));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(-0.5F, -0.8F, -2.5F);
        this.neck4.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.3072F, 0.5565F, -0.9748F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 23, 10, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(-0.5F, -0.8F, -2.5F);
        this.neck4.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0801F, 0.5885F, -1.3893F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 17, 33, -2.9397F, -0.3402F, -0.4648F, 2, 0, 1, 0.0F, true));

        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(-0.5F, -0.1F, -0.5F);
        this.neck4.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.2834F, 0.1535F, -0.6262F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 41, 17, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(-0.5F, -0.1F, -0.5F);
        this.neck4.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.2199F, 0.2056F, -0.9771F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 54, 33, -1.9397F, -0.3402F, -0.4648F, 1, 0, 1, 0.0F, true));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(-0.5F, -0.1F, -0.5F);
        this.neck4.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.0472F, 0.2963F, -1.6474F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 45, 26, -3.3318F, -1.4507F, -0.4648F, 2, 0, 1, 0.0F, true));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(0.5F, -0.1F, -0.5F);
        this.neck4.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.0472F, -0.2963F, 1.6474F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 45, 26, 1.3318F, -1.4507F, -0.4648F, 2, 0, 1, 0.0F, false));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(0.5F, -0.8F, -2.5F);
        this.neck4.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.0801F, -0.5885F, 1.3893F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 17, 33, 0.9397F, -0.3402F, -0.4648F, 2, 0, 1, 0.0F, false));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(0.5F, -0.8F, -2.5F);
        this.neck4.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.3072F, -0.5565F, 0.9748F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 23, 10, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(0.5F, -0.1F, -0.5F);
        this.neck4.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.2199F, -0.2056F, 0.9771F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 54, 33, 0.9397F, -0.3402F, -0.4648F, 1, 0, 1, 0.0F, false));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(0.5F, -0.1F, -0.5F);
        this.neck4.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.2834F, -0.1535F, 0.6262F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 41, 17, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.4F, -3.4F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, -0.1745F, 0.0F);


        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(0.5F, -4.2F, -4.2F);
        this.neck3.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -0.8727F, 0.0F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 0, 24, -1.0F, -0.9828F, -0.0159F, 1, 1, 6, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -4.6F, -3.9F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.1614F, 0.6102F, 0.0532F);


        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(0.5F, -3.2F, -1.9F);
        this.neck2.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -0.9512F, 0.0F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 24, 30, -1.0F, -0.2411F, -0.0633F, 1, 1, 4, -0.008F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.1F, -2.0F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.3491F, 0.0F, 0.0F);


        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(0.0F, -1.5F, -1.4F);
        this.neck.addChild(cube_r92);
        this.setRotateAngle(cube_r92, -0.6458F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 0, 43, -0.5F, -0.0293F, 0.0624F, 1, 1, 2, 0.0F, false));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(0.0F, -1.9F, -3.5F);
        this.neck.addChild(cube_r93);
        this.setRotateAngle(cube_r93, -0.1745F, 0.0F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 7, 43, -0.5F, 0.0F, 0.2F, 1, 1, 2, -0.008F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.2F, -3.3F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0F, 0.0F, -0.0436F);
        this.head.cubeList.add(new ModelBox(head, 48, 54, -0.5F, -0.5F, -1.0F, 1, 1, 1, -0.004F, false));
        this.head.cubeList.add(new ModelBox(head, 51, 3, -0.18F, -0.7946F, -0.8635F, 1, 1, 1, -0.3F, false));
        this.head.cubeList.add(new ModelBox(head, 5, 53, -0.18F, -0.3946F, -0.8635F, 1, 1, 1, -0.3F, false));
        this.head.cubeList.add(new ModelBox(head, 5, 53, -0.82F, -0.3946F, -0.8635F, 1, 1, 1, -0.3F, true));
        this.head.cubeList.add(new ModelBox(head, 51, 3, -0.82F, -0.7946F, -0.8635F, 1, 1, 1, -0.3F, true));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(-0.5F, -0.9F, -0.4F);
        this.head.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.9425F, 0.0F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 19, 53, 0.0F, -0.0291F, -0.9708F, 1, 1, 1, -0.005F, false));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(-0.32F, 0.8976F, -3.3157F);
        this.head.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.6021F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 28, 52, -0.4F, -0.5F, -0.5F, 1, 1, 1, -0.3F, true));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 52, 11, -0.4F, -0.5F, -0.1F, 1, 1, 1, -0.3F, true));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 52, 11, 0.04F, -0.5F, -0.1F, 1, 1, 1, -0.3F, false));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 28, 52, 0.04F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(-0.22F, 0.3054F, -1.7635F);
        this.head.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.4538F, 0.0F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 52, 30, -0.5F, -0.3551F, -0.9923F, 1, 1, 1, -0.299F, true));
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 0, 53, -0.5F, -0.3551F, -0.5923F, 1, 1, 1, -0.302F, true));
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 52, 30, -0.06F, -0.3551F, -0.9923F, 1, 1, 1, -0.299F, false));
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 0, 53, -0.06F, -0.3551F, -0.5923F, 1, 1, 1, -0.302F, false));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(-0.22F, 0.6079F, -2.2929F);
        this.head.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.9948F, 0.0F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 33, 52, -0.5F, -0.4F, 0.0F, 1, 1, 1, -0.299F, true));
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 52, 45, -0.5F, -0.4F, -0.4F, 1, 1, 1, -0.3F, true));
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 33, 52, -0.06F, -0.4F, 0.0F, 1, 1, 1, -0.299F, false));
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 52, 45, -0.06F, -0.4F, -0.4F, 1, 1, 1, -0.3F, false));

        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(0.5F, 0.5F, -0.5F);
        this.head.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.3491F, 0.0F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 53, 14, -1.12F, -1.2F, -1.0F, 1, 1, 1, -0.1F, true));
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 51, 38, -1.34F, -1.2F, -1.0F, 1, 1, 1, -0.3F, true));
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 52, 0, -1.23F, -1.2F, -1.0F, 1, 1, 1, -0.2F, true));
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 51, 38, -0.66F, -1.2F, -1.0F, 1, 1, 1, -0.3F, false));
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 52, 0, -0.77F, -1.2F, -1.0F, 1, 1, 1, -0.2F, false));
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 53, 14, -0.88F, -1.2F, -1.0F, 1, 1, 1, -0.1F, false));
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 43, 54, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.008F, false));

        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(0.5F, -0.8F, -1.0F);
        this.head.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.3665F, 0.0F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 51, 8, -1.27F, -0.22F, -0.15F, 1, 1, 1, -0.3F, true));

        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(-0.5F, -0.8F, -1.0F);
        this.head.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.3665F, 0.0F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 51, 8, 0.27F, -0.22F, -0.15F, 1, 1, 1, -0.3F, false));
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 38, 53, 0.0F, 0.0926F, -0.3748F, 1, 1, 1, 0.0F, false));

        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(-0.5F, -0.8F, -1.0F);
        this.head.addChild(cube_r101);
        this.setRotateAngle(cube_r101, -0.192F, 0.0F, 0.0F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 54, 24, 0.0F, -0.0074F, 0.0252F, 1, 1, 1, 0.0F, false));

        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(0.5F, 1.2F, -3.0F);
        this.head.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.3491F, 0.0F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 55, 5, -1.0F, -0.8072F, -0.835F, 1, 1, 1, -0.15F, false));

        this.cube_r103 = new ModelRenderer(this);
        this.cube_r103.setRotationPoint(0.5F, 0.4F, -3.2F);
        this.head.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.5585F, 0.0F, 0.0F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 9, 55, -1.0F, -0.1228F, -0.7893F, 1, 1, 1, -0.153F, false));

        this.cube_r104 = new ModelRenderer(this);
        this.cube_r104.setRotationPoint(0.5F, 0.1F, -2.5F);
        this.head.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.4538F, 0.0F, 0.0F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 53, 48, -1.0F, -0.1106F, -0.8104F, 1, 1, 1, -0.1F, false));

        this.cube_r105 = new ModelRenderer(this);
        this.cube_r105.setRotationPoint(0.5F, -0.4F, -1.9F);
        this.head.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.6458F, 0.0F, 0.0F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 24, 54, -1.0F, -0.0724F, -0.8905F, 1, 1, 1, -0.104F, false));

        this.cube_r106 = new ModelRenderer(this);
        this.cube_r106.setRotationPoint(-0.5F, -0.8F, -1.0F);
        this.head.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.4538F, 0.0F, 0.0F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 54, 41, 0.0F, -0.0074F, -0.9748F, 1, 1, 1, 0.005F, false));

        this.cube_r107 = new ModelRenderer(this);
        this.cube_r107.setRotationPoint(0.0F, 1.137F, -3.3302F);
        this.head.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.3491F, 0.0F, 0.0F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 51, 27, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.19F, false));

        this.cube_r108 = new ModelRenderer(this);
        this.cube_r108.setRotationPoint(0.5F, 0.8F, -1.4F);
        this.head.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.2618F, 0.0F, 0.0F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 12, 45, -1.0F, -0.6741F, -1.9517F, 1, 1, 2, -0.17F, false));

        this.cube_r109 = new ModelRenderer(this);
        this.cube_r109.setRotationPoint(0.5F, 0.8F, -1.4F);
        this.head.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.2443F, 0.0F, 0.0F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 53, 53, -1.0F, -0.8741F, -1.7517F, 1, 1, 1, -0.104F, false));
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 54, 21, -1.0F, -0.8741F, -0.9517F, 1, 1, 1, -0.099F, false));

        this.cube_r110 = new ModelRenderer(this);
        this.cube_r110.setRotationPoint(0.0F, 0.4F, 0.1F);
        this.head.addChild(cube_r110);
        this.setRotateAngle(cube_r110, -0.576F, 0.0F, 0.0F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 53, 18, -0.8F, -0.5F, -0.6F, 1, 1, 1, -0.3F, true));
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 53, 18, -0.2F, -0.5F, -0.6F, 1, 1, 1, -0.3F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7F, 0.2F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.9599F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 45, 0, -0.2F, -0.5F, -1.5F, 1, 1, 2, -0.299F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 45, 0, -0.8F, -0.5F, -1.5F, 1, 1, 2, -0.299F, true));

        this.cube_r111 = new ModelRenderer(this);
        this.cube_r111.setRotationPoint(-0.1F, -0.5405F, -1.9459F);
        this.jaw.addChild(cube_r111);
        this.setRotateAngle(cube_r111, -0.2967F, 0.0F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 49, 16, -0.6F, -0.5F, -0.5F, 1, 1, 1, -0.32F, true));
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 49, 16, -0.2F, -0.5F, -0.5F, 1, 1, 1, -0.32F, false));

        this.cube_r112 = new ModelRenderer(this);
        this.cube_r112.setRotationPoint(0.3F, -0.6F, -1.1F);
        this.jaw.addChild(cube_r112);
        this.setRotateAngle(cube_r112, -0.0175F, 0.0F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 43, 34, -1.0F, -0.3124F, -1.6611F, 1, 1, 2, -0.299F, true));
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 43, 34, -0.6F, -0.3124F, -1.6611F, 1, 1, 2, -0.299F, false));

        this.cube_r113 = new ModelRenderer(this);
        this.cube_r113.setRotationPoint(0.3F, 0.2F, -1.2F);
        this.jaw.addChild(cube_r113);
        this.setRotateAngle(cube_r113, -0.3316F, 0.0F, 0.0F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 35, 43, -1.0F, -0.7F, -1.7F, 1, 1, 2, -0.3F, true));
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 35, 43, -0.6F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        this.cube_r114 = new ModelRenderer(this);
        this.cube_r114.setRotationPoint(0.2F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r114);
        this.setRotateAngle(cube_r114, -0.3491F, 0.0F, 0.0F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 44, 17, -1.0F, -0.5F, -1.5F, 1, 1, 2, -0.3F, true));
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 44, 17, -0.4F, -0.5F, -1.5F, 1, 1, 2, -0.3F, false));

        this.cube_r115 = new ModelRenderer(this);
        this.cube_r115.setRotationPoint(-0.32F, -0.1946F, -1.1635F);
        this.jaw.addChild(cube_r115);
        this.setRotateAngle(cube_r115, -0.1745F, 0.0F, 0.0F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 14, 53, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, true));
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 14, 53, 0.14F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

        this.cube_r116 = new ModelRenderer(this);
        this.cube_r116.setRotationPoint(-0.2F, -0.3F, -2.5F);
        this.jaw.addChild(cube_r116);
        this.setRotateAngle(cube_r116, -0.2094F, 0.0F, 0.0F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 17, 43, -0.3F, -0.8505F, -1.408F, 1, 1, 2, -0.32F, false));
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 28, 43, -0.3F, -0.6505F, -1.508F, 1, 1, 2, -0.3F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.3F, 2.1F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2428F, -0.1022F, 0.1926F);
        this.tail.cubeList.add(new ModelBox(tail, 17, 20, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 41, 56, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 57, 12, 0.0F, -1.0F, 2.0F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 38, 56, 0.0F, -0.9F, 4.0F, 0, 1, 1, 0.0F, false));

        this.cube_r117 = new ModelRenderer(this);
        this.cube_r117.setRotationPoint(0.0F, 1.0F, 0.5F);
        this.tail.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 0.6109F, 0.0F, 0.0F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 0, 12, 0.0F, 2.1767F, 3.5976F, 0, 1, 1, 0.0F, false));
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 0, 0, 0.0F, 0.0767F, 1.5976F, 0, 2, 1, 0.0F, false));
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 0, 32, 0.0F, -0.5F, -0.2F, 0, 1, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0894F, -0.2173F, -0.0193F);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 0, -0.5F, -0.5F, 0.0F, 1, 1, 8, -0.008F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 56, 27, 0.0F, -0.8F, 0.0F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 56, 0.0F, -0.7F, 2.0F, 0, 1, 1, 0.0F, false));

        this.cube_r118 = new ModelRenderer(this);
        this.cube_r118.setRotationPoint(0.0F, 1.0F, -5.4F);
        this.tail2.addChild(cube_r118);
        this.setRotateAngle(cube_r118, 0.6109F, 0.0F, 0.0F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 18, 0, 0.0F, 6.364F, 10.5692F, 0, 1, 1, 0.0F, false));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 18, 3, 0.0F, 5.3339F, 8.8548F, 0, 1, 1, 0.0F, false));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 24, 0, 0.0F, 4.3038F, 7.1405F, 0, 1, 1, 0.0F, false));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 25, 57, 0.0F, 3.2737F, 5.4262F, 0, 1, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0081F, 0.5001F, -0.3254F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 12, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F, false));

        this.cube_r119 = new ModelRenderer(this);
        this.cube_r119.setRotationPoint(0.0F, 1.0F, -13.3F);
        this.tail3.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 0.6109F, 0.0F, 0.0F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 6, 12, 0.0F, 8.3901F, 13.5357F, 0, 1, 1, 0.0F, false));
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 57, 16, 0.0F, 7.2233F, 11.9082F, 0, 1, 1, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.151F, 0.3887F, -0.0576F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 10, -0.008F, false));

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
