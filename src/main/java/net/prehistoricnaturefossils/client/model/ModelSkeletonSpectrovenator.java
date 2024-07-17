package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSpectrovenator extends ModelBase {
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
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer leftLeg;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer cube_r30;
    private final ModelRenderer body;
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
    private final ModelRenderer chest;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
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
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer head;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
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
    private final ModelRenderer crest;
    private final ModelRenderer cube_r104;
    private final ModelRenderer cube_r105;
    private final ModelRenderer cube_r106;
    private final ModelRenderer crest2;
    private final ModelRenderer cube_r107;
    private final ModelRenderer cube_r108;
    private final ModelRenderer cube_r109;
    private final ModelRenderer jugal_quadratojugal;
    private final ModelRenderer cube_r110;
    private final ModelRenderer cube_r111;
    private final ModelRenderer cube_r112;
    private final ModelRenderer jugal_quadratojugal2;
    private final ModelRenderer cube_r113;
    private final ModelRenderer cube_r114;
    private final ModelRenderer cube_r115;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r116;
    private final ModelRenderer cube_r117;
    private final ModelRenderer cube_r118;
    private final ModelRenderer cube_r119;
    private final ModelRenderer cube_r120;
    private final ModelRenderer cube_r121;
    private final ModelRenderer cube_r122;
    private final ModelRenderer cube_r123;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r124;
    private final ModelRenderer cube_r125;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r126;
    private final ModelRenderer cube_r127;
    private final ModelRenderer cube_r128;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r129;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r130;

    public ModelSkeletonSpectrovenator() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -18.25F, 4.0F);
        this.fossil.addChild(hips);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -1.1F, 2.3F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 22, 0.5F, -0.7F, -5.0F, 0, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 25, 0.0F, -0.1F, -6.0F, 1, 1, 6, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.5F, 2.4514F, -1.3303F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6417F, 0.181F, 0.4808F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 22, -0.424F, -0.3827F, -0.4841F, 1, 3, 1, -0.2F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(2.1F, 0.4514F, 0.0697F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.2443F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 52, -0.5224F, -0.5465F, -1.879F, 1, 3, 1, -0.2F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.2F, 4.8514F, 1.4697F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1658F, 0.0F, 0.1396F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 56, -0.153F, 0.0417F, -0.0374F, 1, 2, 1, -0.11F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.2F, 4.8514F, 1.4697F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3142F, 0.0F, 0.1396F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 53, 19, -0.153F, 0.2761F, -0.2045F, 1, 2, 1, -0.1F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.8F, 1.6514F, 1.4697F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1396F, 0.0F, 0.3665F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 46, -0.5F, -0.251F, -0.5815F, 1, 5, 1, -0.2F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0F, -1.4902F, 2.2885F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5411F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 15, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.003F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(2.0F, -0.5902F, 2.8885F);
        this.hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.384F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 21, -0.5F, -0.9624F, -1.9778F, 1, 1, 2, -0.003F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(2.0F, -1.4105F, -0.2952F);
        this.hips.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1222F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 22, -0.5F, -0.7F, 0.1F, 1, 2, 2, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.5F, 0.3F, -1.4F, 1, 3, 3, 0.003F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 31, -0.5F, -0.1F, -3.5F, 1, 1, 4, -0.003F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 33, -0.5F, -0.7F, -3.9F, 1, 1, 4, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(2.0F, -0.1105F, -3.6952F);
        this.hips.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6109F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 39, -0.5F, -0.976F, -0.9669F, 1, 1, 1, 0.003F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, -1.0013F, -0.3458F);
        this.hips.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.118F, 0.0315F, -0.2599F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 31, -1.0F, 0.0F, -2.0F, 2, 1, 4, -0.2F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.0F, -0.1105F, -3.6952F);
        this.hips.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6109F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 23, 39, -0.5F, -0.976F, -0.9669F, 1, 1, 1, 0.003F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -1.0013F, -0.3458F);
        this.hips.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.118F, -0.0315F, 0.2599F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 31, -1.0F, 0.0F, -2.0F, 2, 1, 4, -0.2F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.0F, -1.4105F, -0.2952F);
        this.hips.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1222F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 31, -0.5F, -0.1F, -3.5F, 1, 1, 4, -0.003F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 33, -0.5F, -0.7F, -3.9F, 1, 1, 4, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -0.5F, 0.3F, -1.4F, 1, 3, 3, 0.003F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 22, -0.5F, -0.7F, 0.1F, 1, 2, 2, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.0F, -0.5902F, 2.8885F);
        this.hips.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.384F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 21, -0.5F, -0.9624F, -1.9778F, 1, 1, 2, -0.003F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.0F, -1.4902F, 2.2885F);
        this.hips.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.5411F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 49, 15, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.003F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.2F, 4.8514F, 1.4697F);
        this.hips.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1658F, 0.0F, -0.1396F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 56, -0.847F, 0.0417F, -0.0374F, 1, 2, 1, -0.11F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.2F, 4.8514F, 1.4697F);
        this.hips.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3142F, 0.0F, -0.1396F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 53, 19, -0.847F, 0.2761F, -0.2045F, 1, 2, 1, -0.1F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, 2.4514F, -1.3303F);
        this.hips.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.6417F, -0.181F, -0.4808F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 22, -0.576F, -0.3827F, -0.4841F, 1, 3, 1, -0.2F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.1F, 0.4514F, 0.0697F);
        this.hips.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.2443F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 52, -0.4776F, -0.5465F, -1.879F, 1, 3, 1, -0.2F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.8F, 1.6514F, 1.4697F);
        this.hips.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1396F, 0.0F, -0.3665F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 12, 46, -0.5F, -0.251F, -0.5815F, 1, 5, 1, -0.2F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(-3.0F, 0.6987F, -0.3458F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.654F, 0.0266F, -0.0346F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 18, 44, -0.5F, -0.5F, -0.6F, 1, 5, 1, 0.003F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 4.3F, 0.3F);
        this.leftLeg.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3142F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 15, -0.5F, 0.1F, -0.9F, 1, 3, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.4F, 0.4F);
        this.leftLeg.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.384F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 27, 33, -0.5F, -0.6F, -1.5F, 1, 1, 2, 0.0F, false));

        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.3F, -1.5F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -1.3475F, -0.2129F, -0.0479F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 35, 44, 0.0F, 1.9F, -0.4F, 1, 5, 1, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 28, 44, 0.0F, -0.1F, -0.5F, 1, 2, 2, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 2.9443F, 0.3155F);
        this.leftLeg2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1571F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 50, 52, -0.5F, -2.7807F, -0.758F, 1, 3, 1, -0.2F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 4.7443F, 0.6155F);
        this.leftLeg2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0873F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 5, 48, -0.5F, -2.0F, -0.9F, 1, 4, 1, -0.2F, false));

        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.1F, 6.9443F, 0.0155F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.6939F, -0.0505F, 0.1285F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 13, 0, -1.0F, 0.0F, -0.4F, 2, 5, 1, 0.0F, false));

        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 0.0873F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 17, 24, -1.5F, -0.5F, -0.5F, 3, 1, 5, 0.0F, false));

        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(3.0F, 0.6987F, -0.3458F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.0F, 0.0F, 0.0873F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 43, -0.5F, -0.5F, -0.6F, 1, 5, 1, 0.003F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 4.3F, 0.3F);
        this.rightLeg.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.3142F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 24, 0, -0.5F, 0.1F, -0.9F, 1, 3, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.4F, 0.4F);
        this.rightLeg.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.384F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 9, 31, -0.5F, -0.6F, -1.5F, 1, 1, 2, 0.0F, false));

        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.3F, -1.5F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -1.6131F, 0.0806F, 0.0335F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 23, 44, -1.0F, 1.9F, -0.4F, 1, 5, 1, 0.0F, false));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 43, 18, -1.0F, -0.1F, -0.5F, 1, 2, 2, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 2.9443F, 0.3155F);
        this.rightLeg2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1571F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 38, 52, -0.5F, -2.7807F, -0.758F, 1, 3, 1, -0.2F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 4.7443F, 0.6155F);
        this.rightLeg2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0873F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 40, 46, -0.5F, -2.0F, -0.9F, 1, 4, 1, -0.2F, false));

        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.1F, 6.9443F, 0.0155F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 1.0894F, 0.0667F, -0.0536F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 12, -1.0F, 0.0F, -0.4F, 2, 5, 1, 0.0F, false));

        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -0.2182F, 0.0F, 0.0F);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.5672F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 24, 0, -1.5F, -0.5F, -0.5F, 3, 1, 5, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.1317F, 0.1304F, -0.0096F);


        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, -1.1F, 5.1F);
        this.body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1745F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 59, 37, 0.5F, -0.7F, -5.0F, 0, 1, 1, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 59, 40, 0.5F, -0.8F, -3.0F, 0, 1, 1, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 59, 50, 0.5F, -0.6F, -1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 28, 7, 0.0F, -0.1F, -6.0F, 1, 1, 6, 0.003F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, 0.0807F, 0.6771F);
        this.body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2447F, -0.1208F, 1.1826F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 49, 25, 0.9239F, -0.3769F, -0.4335F, 2, 0, 1, 0.0F, true));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 0.0807F, 0.6771F);
        this.body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2856F, -0.0848F, 0.7894F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 38, 35, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, -0.3193F, 2.6771F);
        this.body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.2022F, -0.0212F, 0.6542F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 43, 23, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, -0.3193F, 2.6771F);
        this.body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1617F, -0.1082F, 1.4774F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 52, 32, 2.4907F, -1.5772F, -0.4335F, 2, 0, 1, 0.0F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, -0.3193F, 2.6771F);
        this.body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.192F, -0.0302F, 1.0469F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 53, 8, 0.9239F, -0.3769F, -0.4335F, 2, 0, 1, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, -0.6193F, 4.6771F);
        this.body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1504F, 0.0134F, 1.4081F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 23, 10, 2.4907F, -1.5772F, -0.4335F, 3, 0, 1, 0.0F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, -0.6193F, 4.6771F);
        this.body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1308F, 0.0756F, 0.9757F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 53, 36, 0.9239F, -0.3769F, -0.4335F, 2, 0, 1, 0.0F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, -0.6193F, 4.6771F);
        this.body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1052F, 0.0531F, 0.5828F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 50, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, 0.0807F, 0.6771F);
        this.body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.2447F, 0.1208F, -1.1826F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 49, 25, -2.9239F, -0.3769F, -0.4335F, 2, 0, 1, 0.0F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, 0.0807F, 0.6771F);
        this.body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.2856F, 0.0848F, -0.7894F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 38, 35, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, -0.3193F, 2.6771F);
        this.body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.2022F, 0.0212F, -0.6542F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 43, 23, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5F, -0.3193F, 2.6771F);
        this.body.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.192F, 0.0302F, -1.0469F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 53, 8, -2.9239F, -0.3769F, -0.4335F, 2, 0, 1, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, -0.3193F, 2.6771F);
        this.body.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1617F, 0.1082F, -1.4774F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 52, 32, -4.4907F, -1.5772F, -0.4335F, 2, 0, 1, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, -0.6193F, 4.6771F);
        this.body.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1504F, -0.0134F, -1.4081F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 23, 10, -5.4907F, -1.5772F, -0.4335F, 3, 0, 1, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, -0.6193F, 4.6771F);
        this.body.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1308F, -0.0756F, -0.9757F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 53, 36, -2.9239F, -0.3769F, -0.4335F, 2, 0, 1, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, -0.6193F, 4.6771F);
        this.body.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1052F, -0.0531F, -0.5828F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 50, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 6.0192F, 3.309F);
        this.body.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.2618F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 12, -2.5F, -1.5F, -3.4F, 5, 2, 7, 0.003F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.6F, 5.2F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0436F, -0.0871F, 0.0076F);


        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.5F, -0.6F, 3.8F);
        this.chest.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0349F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 57, 59, 0.5F, -0.5F, -3.0F, 0, 1, 1, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 60, 0.5F, -0.4F, -1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 31, 33, 0.0F, -0.1F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(2.1F, 0.3693F, 1.8326F);
        this.chest.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.7505F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 28, 15, -0.5F, 0.4F, -2.3F, 1, 1, 5, 0.0F, true));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 28, 15, -4.7F, 0.4F, -2.3F, 1, 1, 5, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 5.1663F, 2.0001F);
        this.chest.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.7592F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 36, 15, 0.5F, -0.6F, -0.2F, 1, 1, 3, 0.0F, true));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 36, 15, -1.5F, -0.6F, -0.2F, 1, 1, 3, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(2.6F, 2.3693F, 2.6326F);
        this.chest.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.5866F, -0.4783F, 0.2219F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 18, 12, -1.0F, -0.8306F, -0.0743F, 1, 3, 2, 0.0F, true));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(1.0F, 5.1189F, 1.6605F);
        this.chest.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.3952F, -1.0322F, -0.5847F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 7, 37, -0.5F, -0.0318F, -2.0863F, 1, 0, 2, 0.0F, true));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(1.0F, 5.1189F, 1.6605F);
        this.chest.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.2024F, -0.5738F, -0.3715F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 36, 0, -0.5F, -0.0318F, -3.2863F, 1, 0, 4, 0.0F, true));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-2.6F, 2.3693F, 2.6326F);
        this.chest.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.5866F, 0.4783F, -0.2219F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 18, 12, 0.0F, -0.8306F, -0.0743F, 1, 3, 2, 0.0F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(-1.0F, 5.1189F, 1.6605F);
        this.chest.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.2024F, 0.5738F, 0.3715F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 36, 0, -0.5F, -0.0318F, -3.2863F, 1, 0, 4, 0.0F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-1.0F, 5.1189F, 1.6605F);
        this.chest.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.3952F, 1.0322F, 0.5847F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 7, 37, -0.5F, -0.0318F, -2.0863F, 1, 0, 2, 0.0F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(0.5F, -0.1193F, 1.2771F);
        this.chest.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0355F, 0.1059F, 0.5948F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 35, 23, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(0.5F, -0.1193F, 1.2771F);
        this.chest.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0866F, 0.151F, 0.9882F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 47, 37, 0.9239F, -0.3769F, -0.4335F, 2, 0, 1, 0.0F, true));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(0.5F, -0.1193F, 1.2771F);
        this.chest.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.1422F, 0.1003F, 1.4251F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 7, 2.4907F, -1.5772F, -0.4335F, 3, 0, 1, 0.0F, true));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.5F, -0.1193F, 3.2771F);
        this.chest.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.121F, 0.3175F, 1.5952F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 27, 2.4907F, -1.5772F, -0.4335F, 2, 0, 1, 0.0F, true));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.5F, -0.1193F, 3.2771F);
        this.chest.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.0297F, 0.3378F, 1.1344F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 20, 31, 0.9239F, -0.3769F, -0.4335F, 2, 0, 1, 0.0F, true));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(0.5F, -0.1193F, 3.2771F);
        this.chest.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.143F, 0.2351F, 0.7389F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 23, 12, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(-0.5F, -0.1193F, 3.2771F);
        this.chest.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.143F, -0.2351F, -0.7389F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 23, 12, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(-0.5F, -0.1193F, 3.2771F);
        this.chest.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.0297F, -0.3378F, -1.1344F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 20, 31, -2.9239F, -0.3769F, -0.4335F, 2, 0, 1, 0.0F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.5F, -0.1193F, 3.2771F);
        this.chest.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.121F, -0.3175F, -1.5952F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 27, -4.4907F, -1.5772F, -0.4335F, 2, 0, 1, 0.0F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.5F, -0.1193F, 1.2771F);
        this.chest.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.1422F, -0.1003F, -1.4251F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 0, 7, -5.4907F, -1.5772F, -0.4335F, 3, 0, 1, 0.0F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(-0.5F, -0.1193F, 1.2771F);
        this.chest.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0866F, -0.151F, -0.9882F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 47, 37, -2.9239F, -0.3769F, -0.4335F, 2, 0, 1, 0.0F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.5F, -0.1193F, 1.2771F);
        this.chest.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0355F, -0.1059F, -0.5948F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 35, 23, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(-2.5F, 3.3807F, 2.7771F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.7218F, 0.2143F, 0.2194F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 26, 39, -1.0F, -0.5F, -2.6F, 1, 1, 3, 0.0F, false));

        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.8F, 0.0F, -2.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.6144F, -0.116F, -0.0607F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 17, 39, -0.2F, -1.0F, -2.1F, 1, 1, 3, -0.15F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 47, 33, -0.2F, -0.2F, -2.1F, 1, 1, 2, -0.15F, false));

        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 0.0F, -1.9F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.1745F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 45, 3, -0.1F, -1.1F, -2.0F, 1, 2, 2, 0.0F, false));

        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(2.5F, 3.3807F, 2.7771F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.5909F, -0.2143F, -0.2194F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 37, 22, 0.0F, -0.5F, -2.6F, 1, 1, 3, 0.0F, false));

        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.8F, 0.0F, -2.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.6981F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 11, 37, -0.8F, -1.0F, -2.1F, 1, 1, 3, -0.15F, false));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 45, 46, -0.8F, -0.2F, -2.1F, 1, 1, 2, -0.15F, false));

        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 0.0F, -1.9F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.1745F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 44, 25, -0.9F, -1.1F, -2.0F, 1, 2, 2, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, -0.3033F, -0.2211F, 0.024F);


        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(0.5F, -1.0F, 2.5F);
        this.neck3.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.6458F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 60, 0, -0.5F, -1.3F, -1.1F, 0, 1, 1, 0.0F, false));
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 26, 49, -1.0F, -1.0F, -2.1F, 1, 1, 2, 0.003F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.5F, -0.938F, 2.3215F);
        this.neck3.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 1.1285F, -0.0929F, -0.2451F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 5, 43, 0.0F, -0.4421F, -2.9201F, 0, 1, 3, 0.0F, true));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(-0.5F, -0.938F, 2.3215F);
        this.neck3.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 1.1285F, 0.0929F, 0.2451F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 5, 43, 0.0F, -0.4421F, -2.9201F, 0, 1, 3, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.1F, 1.8F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.0013F, 0.1739F, 0.0154F);


        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(0.5F, -3.0F, 1.2F);
        this.neck2.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -0.4887F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 3, 60, -0.5F, 1.0F, -0.3F, 0, 1, 1, 0.0F, false));
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 29, 24, -1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(0.5F, -1.6232F, 1.6093F);
        this.neck2.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.2408F, -0.042F, -0.1694F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 54, 56, 0.0F, -0.0235F, -0.5078F, 0, 3, 1, 0.0F, true));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(-0.5F, -1.6232F, 1.6093F);
        this.neck2.addChild(cube_r75);
        this.setRotateAngle(cube_r75, -0.2408F, 0.042F, 0.1694F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 54, 56, 0.0F, -0.0235F, -0.5078F, 0, 3, 1, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.6F, 1.6F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0751F, -0.2653F, 0.047F);


        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(0.0F, -0.739F, -0.0178F);
        this.neck.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.8639F, 0.0F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 60, 7, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(0.5F, -0.3612F, 0.9797F);
        this.neck.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 1.1817F, -0.1013F, -0.2418F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 5, 54, 0.0F, -0.4482F, -1.9886F, 0, 1, 2, 0.0F, true));

        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(0.5F, -1.1547F, 2.191F);
        this.neck.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.7712F, -0.1577F, -0.1514F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 54, 25, 0.0F, -0.3772F, -1.9407F, 0, 1, 2, 0.0F, true));

        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(-0.5F, -0.3612F, 0.9797F);
        this.neck.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 1.1817F, 0.1013F, 0.2418F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 5, 54, 0.0F, -0.4482F, -1.9886F, 0, 1, 2, 0.0F, false));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(-0.5F, -1.7F, 1.1F);
        this.neck.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.733F, 0.0F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 49, 28, 0.0F, -0.0338F, -1.9738F, 1, 1, 2, 0.003F, false));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(-0.5F, -1.4F, 2.0F);
        this.neck.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.2793F, 0.0F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 60, 12, 0.5F, -0.9F, -0.8F, 0, 1, 1, 0.0F, false));

        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(-0.5F, -1.1547F, 2.191F);
        this.neck.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.7712F, 0.1577F, 0.1514F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 54, 25, 0.0F, -0.3772F, -1.9407F, 0, 1, 2, 0.0F, false));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(-0.5F, -1.4F, 2.0F);
        this.neck.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.192F, 0.0F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 49, 39, 0.0F, -0.5F, -0.8F, 1, 1, 2, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.4F, 2.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.4476F, -0.0826F, -0.1313F);


        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(0.5F, -0.8F, 0.9F);
        this.head.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 1.0297F, 0.0F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 42, 13, -1.5F, -0.711F, -1.9706F, 2, 1, 2, 0.003F, false));
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 40, 30, -0.2F, -0.711F, -2.9706F, 1, 1, 3, 0.0F, true));
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 40, 30, -1.8F, -0.711F, -2.9706F, 1, 1, 3, 0.0F, false));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(1.2F, 1.1859F, 5.2799F);
        this.head.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.7592F, 0.0F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 58, 33, -1.39F, -0.9F, -0.5F, 1, 1, 1, -0.3F, true));
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 43, 58, -1.39F, -0.5F, -0.5F, 1, 1, 1, -0.3F, true));
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 58, 33, -2.01F, -0.9F, -0.5F, 1, 1, 1, -0.3F, false));
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 43, 58, -2.01F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(0.6F, 0.861F, 4.2686F);
        this.head.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 1.0036F, 0.0F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 55, 42, -0.48F, -1.7725F, -0.8307F, 1, 2, 1, -0.1F, true));
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 55, 42, -1.72F, -1.7725F, -0.8307F, 1, 2, 1, -0.1F, false));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(0.6F, 0.961F, 3.4686F);
        this.head.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 1.405F, 0.0F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 55, 52, -0.46F, -1.1F, -0.6F, 1, 2, 1, -0.11F, true));
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 55, 52, -1.74F, -1.1F, -0.6F, 1, 2, 1, -0.11F, false));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(0.7F, 0.4758F, 1.1634F);
        this.head.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 1.9286F, 0.0F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 57, 22, -0.58F, -0.0992F, -0.9052F, 1, 1, 1, -0.11F, true));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 56, 47, -0.58F, -0.0992F, -1.2052F, 1, 1, 1, -0.1F, true));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 56, 47, -1.82F, -0.0992F, -1.2052F, 1, 1, 1, -0.1F, false));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 57, 22, -1.82F, -0.0992F, -0.9052F, 1, 1, 1, -0.11F, false));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(0.7F, 0.3758F, 1.7634F);
        this.head.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 1.5795F, 0.0F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 38, 57, -0.58F, -0.7F, -0.2F, 1, 1, 1, -0.1F, true));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 54, 38, -0.46F, -0.7F, -0.3F, 1, 1, 1, -0.2F, true));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 32, 39, -0.35F, -0.7F, -0.3F, 1, 1, 1, -0.3F, true));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 56, 29, -0.28F, -1.8F, -1.2F, 1, 1, 1, -0.08F, true));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 56, 29, -2.12F, -1.8F, -1.2F, 1, 1, 1, -0.08F, false));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 32, 39, -2.05F, -0.7F, -0.3F, 1, 1, 1, -0.3F, false));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 54, 38, -1.94F, -0.7F, -0.3F, 1, 1, 1, -0.2F, false));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 38, 57, -1.82F, -0.7F, -0.2F, 1, 1, 1, -0.1F, false));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(1.1F, 0.4872F, 0.4644F);
        this.head.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 1.0734F, 0.0F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 51, 11, -0.58F, -0.6F, -1.0F, 1, 1, 2, -0.2F, true));

        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(1.1F, 0.4394F, 0.3765F);
        this.head.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 1.6144F, 0.0F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 56, 10, -0.58F, -0.3F, -0.6F, 1, 1, 1, -0.21F, true));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(-1.1F, 0.4394F, 0.3765F);
        this.head.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 1.6144F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 56, 10, -0.42F, -0.3F, -0.6F, 1, 1, 1, -0.21F, false));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(-1.1F, 0.4872F, 0.4644F);
        this.head.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 1.0734F, 0.0F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 51, 11, -0.42F, -0.6F, -1.0F, 1, 1, 2, -0.2F, false));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(0.0F, 0.6839F, 1.289F);
        this.head.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 1.4486F, 0.0F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 46, 8, -1.0F, -1.5F, -1.1F, 2, 3, 1, -0.003F, false));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(0.0F, 1.7334F, 0.737F);
        this.head.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 1.9286F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 50, 48, -0.5F, -0.5F, -0.9F, 1, 1, 2, -0.2F, false));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(0.5F, -0.5F, 2.4F);
        this.head.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 1.3614F, 0.0F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 37, 7, -1.5F, -1.9406F, -1.989F, 2, 3, 2, 0.0F, false));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(0.7F, 0.2F, 4.3F);
        this.head.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 1.2217F, 0.0F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 15, 51, -1.0F, -0.9654F, -1.9811F, 1, 1, 2, -0.003F, true));
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 15, 51, -1.4F, -0.9654F, -1.9811F, 1, 1, 2, 0.0F, false));
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 0, 52, -1.7F, -1.9654F, -1.9811F, 1, 1, 2, 0.0F, false));

        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(0.7F, 0.7F, 5.2F);
        this.head.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 1.0996F, 0.0F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 52, 4, -1.0F, -0.9943F, -1.9442F, 1, 1, 2, 0.0F, true));
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 52, 4, -1.4F, -0.9943F, -1.9442F, 1, 1, 2, 0.003F, false));

        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(0.5F, 2.5F, 4.8F);
        this.head.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.1047F, 0.0F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 57, 56, -0.8F, -1.0426F, 0.2418F, 1, 1, 1, 0.003F, true));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 19, 60, 0.1F, -0.6426F, 0.0418F, 0, 1, 1, 0.0F, true));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 19, 60, -1.1F, -0.6426F, 0.0418F, 0, 1, 1, 0.0F, false));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 57, 56, -1.2F, -1.0426F, 0.2418F, 1, 1, 1, 0.0F, false));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 58, 19, -0.8F, -1.0426F, 0.0418F, 1, 1, 1, -0.003F, true));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 58, 19, -1.2F, -1.0426F, 0.0418F, 1, 1, 1, 0.005F, false));

        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(-0.5F, 0.7F, 5.2F);
        this.head.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.6109F, 0.0F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 5, 58, 0.0F, 0.0057F, -0.9442F, 1, 1, 1, 0.0F, false));

        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(0.0F, 2.5F, 3.9F);
        this.head.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.0524F, 0.0F, 0.0F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 37, 27, -1.0F, -0.4955F, -0.0594F, 2, 1, 1, -0.1F, false));
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 43, 0, -1.0F, -0.9955F, -0.0594F, 2, 1, 1, 0.0F, false));

        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(0.0F, 2.1245F, 2.9093F);
        this.head.addChild(cube_r102);
        this.setRotateAngle(cube_r102, -0.4538F, 0.0F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 9, 42, -1.0F, -0.6F, -0.8F, 2, 1, 2, -0.1F, false));

        this.cube_r103 = new ModelRenderer(this);
        this.cube_r103.setRotationPoint(0.0F, 1.9F, 2.4F);
        this.head.addChild(cube_r103);
        this.setRotateAngle(cube_r103, -0.3665F, 0.0F, 0.0F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 42, 42, -1.0F, -0.9729F, -0.3441F, 2, 1, 2, 0.003F, false));

        this.crest = new ModelRenderer(this);
        this.crest.setRotationPoint(-0.3F, 0.4828F, 5.0783F);
        this.head.addChild(crest);
        this.setRotateAngle(crest, 0.0F, -0.0175F, 0.0F);


        this.cube_r104 = new ModelRenderer(this);
        this.cube_r104.setRotationPoint(0.0F, -0.7F, -1.3F);
        this.crest.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 1.0362F, 0.1054F, 0.0444F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 30, 55, -0.7156F, -0.3042F, -0.8686F, 1, 2, 1, -0.2F, false));

        this.cube_r105 = new ModelRenderer(this);
        this.cube_r105.setRotationPoint(-0.6F, -0.7F, -1.3F);
        this.crest.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 1.485F, 0.0995F, 0.0159F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 56, 15, -0.5769F, -3.1174F, -0.3595F, 1, 2, 1, -0.2F, false));

        this.cube_r106 = new ModelRenderer(this);
        this.cube_r106.setRotationPoint(-0.6F, -0.7F, -1.3F);
        this.crest.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 1.1263F, 0.3536F, -0.1035F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 0, 56, -0.1716F, -1.6561F, -0.8189F, 1, 2, 1, -0.2F, false));

        this.crest2 = new ModelRenderer(this);
        this.crest2.setRotationPoint(0.3F, 0.4828F, 5.0783F);
        this.head.addChild(crest2);
        this.setRotateAngle(crest2, 0.0F, 0.0175F, 0.0F);


        this.cube_r107 = new ModelRenderer(this);
        this.cube_r107.setRotationPoint(0.0F, -0.7F, -1.3F);
        this.crest2.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 1.0362F, -0.1054F, -0.0444F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 30, 55, -0.2844F, -0.3042F, -0.8686F, 1, 2, 1, -0.2F, true));

        this.cube_r108 = new ModelRenderer(this);
        this.cube_r108.setRotationPoint(0.6F, -0.7F, -1.3F);
        this.crest2.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 1.485F, -0.0995F, -0.0159F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 56, 15, -0.4231F, -3.1174F, -0.3595F, 1, 2, 1, -0.2F, true));

        this.cube_r109 = new ModelRenderer(this);
        this.cube_r109.setRotationPoint(0.6F, -0.7F, -1.3F);
        this.crest2.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 1.1263F, -0.3536F, 0.1035F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 0, 56, -0.8284F, -1.6561F, -0.8189F, 1, 2, 1, -0.2F, true));

        this.jugal_quadratojugal = new ModelRenderer(this);
        this.jugal_quadratojugal.setRotationPoint(-1.2F, 0.8F, -0.4F);
        this.head.addChild(jugal_quadratojugal);
        this.setRotateAngle(jugal_quadratojugal, -0.0886F, 0.2157F, -0.2215F);


        this.cube_r110 = new ModelRenderer(this);
        this.cube_r110.setRotationPoint(-0.114F, -0.0538F, -0.1288F);
        this.jugal_quadratojugal.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.1923F, 0.1603F, 0.7537F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 16, 24, -0.4695F, 0.551F, 0.6586F, 1, 1, 1, -0.1F, false));

        this.cube_r111 = new ModelRenderer(this);
        this.cube_r111.setRotationPoint(-0.114F, 1.1462F, 0.9712F);
        this.jugal_quadratojugal.addChild(cube_r111);
        this.setRotateAngle(cube_r111, -0.6192F, 0.0543F, 0.8231F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 31, 51, -1.107F, -0.443F, -1.7504F, 1, 1, 2, -0.1F, false));

        this.cube_r112 = new ModelRenderer(this);
        this.cube_r112.setRotationPoint(-0.4997F, 0.7124F, 1.4347F);
        this.jugal_quadratojugal.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 0.0134F, -0.0425F, 0.8437F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 41, 36, -0.4027F, -0.5971F, -0.3689F, 1, 1, 3, -0.1F, false));

        this.jugal_quadratojugal2 = new ModelRenderer(this);
        this.jugal_quadratojugal2.setRotationPoint(1.2F, 0.8F, -0.4F);
        this.head.addChild(jugal_quadratojugal2);
        this.setRotateAngle(jugal_quadratojugal2, -0.0886F, -0.2157F, 0.2215F);


        this.cube_r113 = new ModelRenderer(this);
        this.cube_r113.setRotationPoint(0.114F, -0.0538F, -0.1288F);
        this.jugal_quadratojugal2.addChild(cube_r113);
        this.setRotateAngle(cube_r113, 0.1923F, -0.1603F, -0.7537F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 16, 24, -0.5305F, 0.551F, 0.6586F, 1, 1, 1, -0.1F, true));

        this.cube_r114 = new ModelRenderer(this);
        this.cube_r114.setRotationPoint(0.114F, 1.1462F, 0.9712F);
        this.jugal_quadratojugal2.addChild(cube_r114);
        this.setRotateAngle(cube_r114, -0.6192F, -0.0543F, -0.8231F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 31, 51, 0.107F, -0.443F, -1.7504F, 1, 1, 2, -0.1F, true));

        this.cube_r115 = new ModelRenderer(this);
        this.cube_r115.setRotationPoint(0.4997F, 0.7124F, 1.4347F);
        this.jugal_quadratojugal2.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 0.0134F, 0.0425F, -0.8437F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 41, 36, -0.5973F, -0.5971F, -0.3689F, 1, 1, 3, -0.1F, true));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.8F, -0.95F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.6109F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 37, -1.3F, -0.3F, -0.5F, 1, 1, 4, 0.004F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 37, 0.3F, -0.3F, -0.5F, 1, 1, 4, 0.004F, true));

        this.cube_r116 = new ModelRenderer(this);
        this.cube_r116.setRotationPoint(0.0F, 1.0F, 4.8F);
        this.jaw.addChild(cube_r116);
        this.setRotateAngle(cube_r116, -0.0349F, 0.0F, 0.0F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 43, 54, 0.5F, -1.3909F, -0.0176F, 0, 1, 2, 0.0F, true));
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 43, 54, -0.5F, -1.3909F, -0.0176F, 0, 1, 2, 0.0F, false));
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 43, 50, -0.7F, -0.9909F, -0.0176F, 1, 1, 2, 0.0F, false));

        this.cube_r117 = new ModelRenderer(this);
        this.cube_r117.setRotationPoint(0.9246F, 0.0332F, 4.0599F);
        this.jaw.addChild(cube_r117);
        this.setRotateAngle(cube_r117, -0.0796F, -0.087F, 0.0069F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 13, 55, 0.0F, -0.5F, -1.1F, 0, 1, 2, 0.0F, true));

        this.cube_r118 = new ModelRenderer(this);
        this.cube_r118.setRotationPoint(0.3F, -0.6F, 2.1F);
        this.jaw.addChild(cube_r118);
        this.setRotateAngle(cube_r118, -0.2102F, -0.0854F, 0.0182F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 35, 39, 0.0F, 0.0127F, -0.044F, 1, 1, 3, 0.0F, true));

        this.cube_r119 = new ModelRenderer(this);
        this.cube_r119.setRotationPoint(1.02F, 1.2522F, 1.5518F);
        this.jaw.addChild(cube_r119);
        this.setRotateAngle(cube_r119, -0.0175F, 0.0F, 0.0F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 50, 0, -0.5F, -1.6F, -0.2F, 1, 1, 2, -0.2F, true));

        this.cube_r120 = new ModelRenderer(this);
        this.cube_r120.setRotationPoint(0.3F, -0.5F, 2.1F);
        this.jaw.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.1571F, 0.0F, 0.0F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 50, 44, 0.0F, -0.0945F, -1.9198F, 1, 1, 2, -0.003F, true));
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 50, 44, -1.6F, -0.0945F, -1.9198F, 1, 1, 2, -0.003F, false));

        this.cube_r121 = new ModelRenderer(this);
        this.cube_r121.setRotationPoint(-0.9246F, 0.0332F, 4.0599F);
        this.jaw.addChild(cube_r121);
        this.setRotateAngle(cube_r121, -0.0796F, 0.087F, -0.0069F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 13, 55, 0.0F, -0.5F, -1.1F, 0, 1, 2, 0.0F, false));

        this.cube_r122 = new ModelRenderer(this);
        this.cube_r122.setRotationPoint(-0.3F, -0.6F, 2.1F);
        this.jaw.addChild(cube_r122);
        this.setRotateAngle(cube_r122, -0.2102F, 0.0854F, -0.0182F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 35, 39, -1.0F, 0.0127F, -0.044F, 1, 1, 3, 0.0F, false));

        this.cube_r123 = new ModelRenderer(this);
        this.cube_r123.setRotationPoint(-1.02F, 1.2522F, 1.5518F);
        this.jaw.addChild(cube_r123);
        this.setRotateAngle(cube_r123, -0.0175F, 0.0F, 0.0F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 50, 0, -0.5F, -1.6F, -0.2F, 1, 1, 2, -0.2F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.2F, -3.6F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0887F, -0.1734F, -0.0192F);
        this.tail.cubeList.add(new ModelBox(tail, 13, 0, -0.5F, -0.3F, -7.8F, 1, 1, 8, 0.003F, false));
        this.tail.cubeList.add(new ModelBox(tail, 31, 59, 0.0F, -1.0F, -0.8F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 28, 59, 0.0F, -0.9F, -2.8F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 59, 25, 0.0F, -0.8F, -4.8F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 16, 59, 0.0F, -0.8F, -6.8F, 0, 1, 1, 0.0F, false));

        this.cube_r124 = new ModelRenderer(this);
        this.cube_r124.setRotationPoint(0.0F, 2.2225F, -3.5578F);
        this.tail.addChild(cube_r124);
        this.setRotateAngle(cube_r124, -0.8727F, 0.0F, 0.0F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 57, 0, 0.0F, 0.8284F, -3.3284F, 0, 3, 1, 0.0F, false));
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 10, 52, 0.0F, -0.6565F, -1.9849F, 0, 4, 1, 0.0F, false));
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 27, 53, 0.0F, -2.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.cube_r125 = new ModelRenderer(this);
        this.cube_r125.setRotationPoint(0.0F, 2.2F, -0.3F);
        this.tail.addChild(cube_r125);
        this.setRotateAngle(cube_r125, -0.7418F, 0.0F, 0.0F);
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 10, 58, 0.0F, -1.0F, -1.3F, 0, 2, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, -7.7F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2568F, 0.1689F, -0.0441F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 22, -0.5F, -0.3F, -7.0F, 1, 1, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 46, 30, 0.0F, -0.5514F, -4.9848F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 5, 43, 0.0F, -0.5514F, -6.9848F, 0, 1, 1, 0.0F, false));

        this.cube_r126 = new ModelRenderer(this);
        this.cube_r126.setRotationPoint(0.0F, -0.3F, -0.5F);
        this.tail2.addChild(cube_r126);
        this.setRotateAngle(cube_r126, 0.0873F, 0.0F, 0.0F);
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 59, 4, 0.0F, -0.5F, -2.5F, 0, 1, 1, 0.0F, false));
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 13, 59, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r127 = new ModelRenderer(this);
        this.cube_r127.setRotationPoint(0.0F, 1.2249F, -3.4858F);
        this.tail2.addChild(cube_r127);
        this.setRotateAngle(cube_r127, -0.7854F, 0.0F, 0.0F);
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 0, 37, 0.0F, 1.2289F, -3.1202F, 0, 2, 1, 0.0F, false));
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 51, 57, 0.0F, 0.1548F, -1.7929F, 0, 2, 1, 0.0F, false));
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 35, 55, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r128 = new ModelRenderer(this);
        this.cube_r128.setRotationPoint(0.0F, 1.3782F, -1.4519F);
        this.tail2.addChild(cube_r128);
        this.setRotateAngle(cube_r128, -0.7418F, 0.0F, 0.0F);
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 48, 56, 0.0F, -1.6521F, -0.3701F, 0, 3, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, -6.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2701F, 0.3006F, -0.0547F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 14, -0.5F, -0.3F, -8.0F, 1, 1, 8, 0.003F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 37, 0.0F, -0.5F, -2.0F, 0, 1, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 36, 15, 0.0F, -0.4F, -4.0F, 0, 1, 1, 0.0F, false));

        this.cube_r129 = new ModelRenderer(this);
        this.cube_r129.setRotationPoint(0.0F, 1.2249F, 3.4142F);
        this.tail3.addChild(cube_r129);
        this.setRotateAngle(cube_r129, -0.7854F, 0.0F, 0.0F);
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 6, 0, 0.0F, 6.3641F, -7.6974F, 0, 1, 1, 0.0F, false));
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 0, 31, 0.0F, 3.9738F, -6.0521F, 0, 2, 1, 0.0F, false));
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 36, 0, 0.0F, 2.5365F, -4.4951F, 0, 2, 1, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.4241F, 0.0942F, -0.0089F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, -0.3F, -10.0F, 1, 1, 10, 0.0F, false));

        this.cube_r130 = new ModelRenderer(this);
        this.cube_r130.setRotationPoint(0.0F, 1.2249F, 11.4142F);
        this.tail4.addChild(cube_r130);
        this.setRotateAngle(cube_r130, -0.7854F, 0.0F, 0.0F);
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 0, 0, 0.0F, 7.5443F, -9.5608F, 0, 1, 1, 0.0F, false));

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
