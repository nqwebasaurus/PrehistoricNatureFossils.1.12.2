package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonVelociraptor extends ModelBase {
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
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer cube_r29;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer cube_r30;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftSickleClaw;
    private final ModelRenderer cube_r31;
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer cube_r32;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer cube_r33;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightSickleClaw;
    private final ModelRenderer cube_r34;
    private final ModelRenderer rightToes;
    private final ModelRenderer body;
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
    private final ModelRenderer chest;
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
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer leftArm1;
    private final ModelRenderer cube_r85;
    private final ModelRenderer leftArm2;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftFinger;
    private final ModelRenderer rightArm1;
    private final ModelRenderer cube_r90;
    private final ModelRenderer rightArm2;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightFinger;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r97;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r98;
    private final ModelRenderer cube_r99;
    private final ModelRenderer cube_r100;
    private final ModelRenderer cube_r101;
    private final ModelRenderer head;
    private final ModelRenderer cube_r102;
    private final ModelRenderer cube_r103;
    private final ModelRenderer cube_r104;
    private final ModelRenderer cube_r105;
    private final ModelRenderer cube_r106;
    private final ModelRenderer cube_r107;
    private final ModelRenderer cube_r108;
    private final ModelRenderer cube_r109;
    private final ModelRenderer cube_r110;
    private final ModelRenderer cube_r111;
    private final ModelRenderer cube_r112;
    private final ModelRenderer cube_r113;
    private final ModelRenderer cube_r114;
    private final ModelRenderer cube_r115;
    private final ModelRenderer cube_r116;
    private final ModelRenderer cube_r117;
    private final ModelRenderer cube_r118;
    private final ModelRenderer cube_r119;
    private final ModelRenderer cube_r120;
    private final ModelRenderer cube_r121;
    private final ModelRenderer cube_r122;
    private final ModelRenderer cube_r123;
    private final ModelRenderer cube_r124;
    private final ModelRenderer cube_r125;
    private final ModelRenderer cube_r126;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r127;
    private final ModelRenderer cube_r128;
    private final ModelRenderer cube_r129;
    private final ModelRenderer cube_r130;
    private final ModelRenderer cube_r131;
    private final ModelRenderer cube_r132;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r133;
    private final ModelRenderer cube_r134;
    private final ModelRenderer cube_r135;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r136;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonVelociraptor() {
        this.textureWidth = 68;
        this.textureHeight = 68;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 1.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -23.0F, -1.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.5672F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.0F, -3.3F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0698F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -1.0012F, 0.0471F, 0, 1, 5, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5F, 2.0349F, -1.158F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.0377F, 0.035F, -0.3025F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 60, 40, -0.093F, 4.962F, -2.3692F, 1, 1, 1, -0.003F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 51, -0.093F, 4.962F, -2.0692F, 1, 1, 2, 0.003F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.5F, 4.3349F, 3.042F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6712F, 0.035F, -0.3025F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 6, 0.739F, 0.2519F, -2.2992F, 1, 1, 2, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.5F, 2.0349F, -1.158F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5228F, 0.035F, -0.3025F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 55, -0.093F, -0.0501F, -0.0074F, 1, 3, 1, 0.0F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.5F, 1.2349F, 0.542F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.2153F, -0.0886F, -0.2467F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 63, -0.0412F, 0.4536F, -1.2253F, 1, 1, 1, 0.0F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.5F, 2.0349F, -1.158F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6625F, 0.035F, -0.3025F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 59, 25, -0.093F, 2.9249F, -0.4302F, 1, 2, 1, 0.003F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.5F, 1.2349F, 0.542F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.7609F, -0.0381F, -0.3022F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 60, -0.2016F, 1.2641F, -0.603F, 1, 2, 1, 0.0F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.5F, 1.2349F, 0.542F);
        this.hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3944F, -0.0381F, -0.3022F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 60, 55, -0.2016F, -0.5292F, -0.1069F, 1, 2, 1, 0.003F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.5F, 0.2349F, -0.558F);
        this.hips.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.384F, 0.0F, -0.2618F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 17, -0.5F, -0.6423F, -1.2462F, 1, 2, 3, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.8F, -2.2F);
        this.hips.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0524F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 30, -3.0F, 0.0F, 0.0F, 1, 1, 5, 0.005F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 30, 2.0F, 0.0F, 0.0F, 1, 1, 5, 0.005F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.7F, -1.0F, -1.1F);
        this.hips.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.7854F, 0.2094F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 51, -0.5F, 0.4908F, -1.7217F, 1, 1, 2, -0.003F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.7F, -1.0F, -1.1F);
        this.hips.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.2094F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 60, 45, -0.5F, -1.1454F, -1.9056F, 1, 1, 1, 0.0F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.7F, -1.0F, -1.1F);
        this.hips.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1222F, 0.2094F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 35, -0.5F, -0.7682F, -1.3816F, 1, 1, 3, 0.003F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.9F, 1.5F);
        this.hips.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1047F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 52, 10, -3.0F, 0.0124F, -2.0242F, 1, 1, 2, -0.003F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 52, 10, 2.0F, 0.0124F, -2.0242F, 1, 1, 2, -0.003F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.0F, 2.8F);
        this.hips.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5585F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 10, 52, -3.0F, -0.062F, -1.6036F, 1, 1, 2, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 10, 52, 2.0F, -0.062F, -1.6036F, 1, 1, 2, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.2F, -0.4315F, 0.3227F);
        this.hips.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0524F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 29, -1.0F, -0.3F, -2.6F, 2, 1, 5, -0.005F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 29, 1.4F, -0.3F, -2.6F, 2, 1, 5, -0.005F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(2.7F, -1.0F, -1.1F);
        this.hips.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1222F, -0.2094F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 35, 35, -0.5F, -0.7682F, -1.3816F, 1, 1, 3, 0.003F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(2.7F, -1.0F, -1.1F);
        this.hips.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, -0.2094F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 60, 45, -0.5F, -1.1454F, -1.9056F, 1, 1, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(2.7F, -1.0F, -1.1F);
        this.hips.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.7854F, -0.2094F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 48, 51, -0.5F, 0.4908F, -1.7217F, 1, 1, 2, -0.003F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(2.5F, 0.2349F, -0.558F);
        this.hips.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.384F, 0.0F, 0.2618F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 35, 17, -0.5F, -0.6423F, -1.2462F, 1, 2, 3, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(2.5F, 1.2349F, 0.542F);
        this.hips.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.7609F, 0.0381F, 0.3022F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 27, 60, -0.7984F, 1.2641F, -0.603F, 1, 2, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(2.5F, 1.2349F, 0.542F);
        this.hips.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3944F, 0.0381F, 0.3022F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 60, 55, -0.7984F, -0.5292F, -0.1069F, 1, 2, 1, 0.003F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(2.5F, 1.2349F, 0.542F);
        this.hips.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 1.2153F, 0.0886F, 0.2467F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 21, 63, -0.9588F, 0.4536F, -1.2253F, 1, 1, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(2.5F, 2.0349F, -1.158F);
        this.hips.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.5228F, -0.035F, 0.3025F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 45, 55, -0.907F, -0.0501F, -0.0074F, 1, 3, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(2.5F, 2.0349F, -1.158F);
        this.hips.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.6625F, -0.035F, 0.3025F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 59, 25, -0.907F, 2.9249F, -0.4302F, 1, 2, 1, 0.003F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(2.5F, 4.3349F, 3.042F);
        this.hips.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.6712F, -0.035F, 0.3025F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 50, 6, -1.739F, 0.2519F, -2.2992F, 1, 1, 2, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(2.5F, 2.0349F, -1.158F);
        this.hips.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 1.0377F, -0.035F, 0.3025F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 60, 40, -0.907F, 4.962F, -2.3692F, 1, 1, 1, -0.003F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 3, 51, -0.907F, 4.962F, -2.0692F, 1, 1, 2, 0.003F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, -0.1F, -3.3F);
        this.hips.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0524F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 28, 0, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.003F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.3F, 0.0F, -0.35F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.6091F, 0.05F, 0.0715F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 6, 0, -0.5F, -0.7948F, -0.5638F, 1, 3, 1, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 2.2052F, -0.5638F);
        this.leftLeg1.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1571F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 19, 48, -0.5F, 0.0F, 0.0F, 1, 5, 1, 0.003F, false));

        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.1052F, 0.2362F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.7453F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 12, 46, -0.9F, -0.0054F, -0.522F, 1, 3, 2, 0.01F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 28, 44, -0.9F, 2.9946F, -0.022F, 1, 6, 1, 0.01F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.6F, 4.4946F, 0.478F);
        this.leftLeg2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0349F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 16, 36, -0.5F, -3.5F, -0.5F, 1, 8, 1, -0.2F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 48, 41, -0.5F, -4.5F, -1.0F, 1, 2, 2, -0.19F, false));

        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 9.0946F, 0.178F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.0893F, -0.0774F, -0.0404F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 45, 24, -1.0F, -0.2066F, -0.6088F, 2, 4, 1, 0.0F, false));

        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 3.7934F, -0.3088F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 1.2654F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 0, 19, -0.5F, -0.5F, -2.5F, 2, 1, 3, 0.0F, false));

        this.leftSickleClaw = new ModelRenderer(this);
        this.leftSickleClaw.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.leftFoot.addChild(leftSickleClaw);
        this.setRotateAngle(leftSickleClaw, -1.2654F, 0.3054F, 0.0F);
        this.leftSickleClaw.cubeList.add(new ModelBox(leftSickleClaw, 33, 30, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.leftSickleClaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.7418F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 36, 40, 0.0F, -2.0F, -2.5F, 0, 2, 3, 0.0F, false));

        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, -0.6109F, 0.0F, 0.0F);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 36, 23, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.01F, false));

        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.3F, 0.0F, -0.35F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.4784F, -0.0403F, -0.0774F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 0, 0, -0.5F, -0.7948F, -0.5638F, 1, 3, 1, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 2.2052F, -0.5638F);
        this.rightLeg1.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1571F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 43, 47, -0.5F, 0.0F, 0.0F, 1, 5, 1, 0.003F, false));

        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.1052F, 0.2362F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6109F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 45, 9, -0.1F, -0.0054F, -0.522F, 1, 3, 2, 0.01F, false));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 44, 16, -0.1F, 2.9946F, -0.022F, 1, 6, 1, 0.01F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.6F, 4.4946F, 0.478F);
        this.rightLeg2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0349F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 11, 36, -0.5F, -3.5F, -0.5F, 1, 8, 1, -0.2F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 48, 36, -0.5F, -4.5F, -1.0F, 1, 2, 2, -0.19F, false));

        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 9.0946F, 0.178F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.1657F, 0.2415F, 0.1022F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 5, 45, -1.0F, -0.2066F, -0.6088F, 2, 4, 1, 0.0F, false));

        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 3.7934F, -0.3088F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 2.138F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 14, 6, -1.5F, -0.5F, -2.5F, 2, 1, 3, 0.0F, false));

        this.rightSickleClaw = new ModelRenderer(this);
        this.rightSickleClaw.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.rightFoot.addChild(rightSickleClaw);
        this.setRotateAngle(rightSickleClaw, -1.1345F, -0.3054F, 0.0F);
        this.rightSickleClaw.cubeList.add(new ModelBox(rightSickleClaw, 28, 8, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.rightSickleClaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.7418F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 40, 5, 0.0F, -2.0F, -2.5F, 0, 2, 3, 0.0F, false));

        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -2.5F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.2618F, 0.0F, 0.0F);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 20, 30, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.01F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6F, -3.3F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.0436F, 0.0F);


        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, -0.6F, -1.9F);
        this.body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1571F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 30, 15, -0.5F, -0.8952F, -0.0025F, 0, 1, 1, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, -0.7F, -3.9F);
        this.body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.1745F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 33, 30, -0.5F, -0.8F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, -0.1745F, -3.4269F);
        this.body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.2376F, 0.2089F, -0.4878F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 42, 63, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, -0.1745F, -1.4269F);
        this.body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.252F, 0.177F, -0.6596F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 63, 32, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.5F, -0.1745F, -1.4269F);
        this.body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0373F, 0.3237F, -1.6974F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 63, 24, -3.2446F, -1.8776F, -0.5238F, 1, 0, 1, 0.0F, true));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, -0.1745F, -1.4269F);
        this.body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.14F, 0.2951F, -1.1294F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 58, 48, -2.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, true));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, -0.1745F, -3.4269F);
        this.body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0739F, 0.3276F, -1.5346F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 58, 53, -4.2446F, -1.8776F, -0.5238F, 2, 0, 1, 0.0F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, -0.1745F, -3.4269F);
        this.body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1116F, 0.3171F, -0.9634F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 59, 11, -2.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, -0.1745F, -1.4269F);
        this.body.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.252F, -0.177F, 0.6596F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 63, 32, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.5F, -0.1745F, -1.4269F);
        this.body.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.14F, -0.2951F, 1.1294F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 58, 48, 0.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, -0.1745F, -1.4269F);
        this.body.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0373F, -0.3237F, 1.6974F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 63, 24, 2.2446F, -1.8776F, -0.5238F, 1, 0, 1, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5F, -0.1745F, -3.4269F);
        this.body.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.0739F, -0.3276F, 1.5346F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 58, 53, 2.2446F, -1.8776F, -0.5238F, 2, 0, 1, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(0.5F, -0.1745F, -3.4269F);
        this.body.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1116F, -0.3171F, 0.9634F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 59, 11, 0.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.5F, -0.1745F, -3.4269F);
        this.body.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.2376F, -0.2089F, 0.4878F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 42, 63, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.5F, 6.2F, -0.3F);
        this.body.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.1745F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 14, 15, -3.0F, -1.9021F, -0.1562F, 5, 2, 5, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 4.8971F, -2.1906F);
        this.body.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.1396F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 21, 23, -2.5F, -0.9F, -2.0F, 5, 2, 4, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, -0.7F, -3.9F);
        this.body.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.0524F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 14, 0, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.1F, -4.7F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.1309F, 0.0F);


        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5F, 0.0F, -2.9F);
        this.chest.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.2443F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 21, 36, -0.5F, -0.1964F, -2.2441F, 0, 1, 1, 0.0F, false));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 24, 52, -1.0F, 0.0036F, -2.2441F, 1, 1, 2, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.5F, 0.0F, -1.1F);
        this.chest.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0524F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 34, -0.5F, -1.109F, -0.0167F, 0, 1, 1, 0.0F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.5F, 0.2F, -3.0F);
        this.chest.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.1222F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 7, 34, -0.5F, -0.676F, -0.1108F, 0, 1, 1, 0.0F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.5F, 0.5255F, -2.6269F);
        this.chest.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.4124F, 0.3003F, -0.4239F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 49, 34, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(-0.5F, 0.1255F, -0.6269F);
        this.chest.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.3639F, 0.1863F, -0.3969F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 63, 2, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.5F, 0.1255F, -0.6269F);
        this.chest.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.014F, 0.4232F, -1.4361F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 21, 0, -5.2446F, -1.8776F, -0.5238F, 3, 0, 1, 0.0F, true));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.5F, 0.1255F, -0.6269F);
        this.chest.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.2394F, 0.3527F, -0.8552F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 58, 43, -2.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, true));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(-0.5F, 0.5255F, -2.6269F);
        this.chest.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.0722F, 0.5198F, -1.514F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 9, -5.2446F, -1.8776F, -0.5238F, 3, 0, 1, 0.0F, true));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.5F, 0.5255F, -2.6269F);
        this.chest.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.2294F, 0.4757F, -0.8979F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 58, 38, -2.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, true));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.5F, 0.9255F, -4.4269F);
        this.chest.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.0085F, 0.6829F, -1.594F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 44, 6, -4.2446F, -1.8776F, -0.5238F, 2, 0, 1, 0.0F, true));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.5F, 0.9255F, -4.4269F);
        this.chest.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.3906F, 0.5756F, -0.933F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 58, 0, -2.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, true));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(-0.5F, 0.9255F, -4.4269F);
        this.chest.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.5903F, 0.3276F, -0.4849F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 33, 40, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(0.5F, 0.9255F, -4.4269F);
        this.chest.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.5903F, -0.3276F, 0.4849F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 33, 40, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(0.5F, 0.9255F, -4.4269F);
        this.chest.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.3906F, -0.5756F, 0.933F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 58, 0, 0.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.5F, 0.9255F, -4.4269F);
        this.chest.addChild(cube_r66);
        this.setRotateAngle(cube_r66, -0.0085F, -0.6829F, 1.594F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 44, 6, 2.2446F, -1.8776F, -0.5238F, 2, 0, 1, 0.0F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(0.5F, 0.5255F, -2.6269F);
        this.chest.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.4124F, -0.3003F, 0.4239F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 49, 34, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.5F, 0.5255F, -2.6269F);
        this.chest.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.2294F, -0.4757F, 0.8979F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 58, 38, 0.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(0.5F, 0.5255F, -2.6269F);
        this.chest.addChild(cube_r69);
        this.setRotateAngle(cube_r69, -0.0722F, -0.5198F, 1.514F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 0, 9, 2.2446F, -1.8776F, -0.5238F, 3, 0, 1, 0.0F, false));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(0.5F, 0.1255F, -0.6269F);
        this.chest.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.014F, -0.4232F, 1.4361F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 21, 0, 2.2446F, -1.8776F, -0.5238F, 3, 0, 1, 0.0F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.5F, 0.1255F, -0.6269F);
        this.chest.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.2394F, -0.3527F, 0.8552F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 58, 43, 0.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(0.5F, 0.1255F, -0.6269F);
        this.chest.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.3639F, -0.1863F, 0.3969F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 63, 2, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(-1.6899F, 5.4831F, -1.3582F);
        this.chest.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.457F, 1.0981F, 0.5068F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 0, 7, -2.1F, -0.1F, -0.3F, 4, 0, 1, 0.0F, true));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(-1.5591F, 5.3265F, -2.2021F);
        this.chest.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.2011F, 0.408F, 0.9215F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 27, 37, -1.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(-1.6097F, 3.3261F, -1.9865F);
        this.chest.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 1.1149F, -0.0017F, 0.0376F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 7, 56, 0.4694F, -1.1281F, -2.9477F, 1, 3, 1, 0.0F, true));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(-3.1124F, 2.2262F, -4.1776F);
        this.chest.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.1013F, -0.5324F, -0.4949F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 21, 42, -0.1597F, 0.1578F, -1.2102F, 1, 3, 2, 0.0F, true));

        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(-1.6097F, 3.3261F, -1.9865F);
        this.chest.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.3491F, 0.0F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 49, 20, -1.3903F, -2.7517F, 1.705F, 1, 1, 2, 0.0F, true));
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 49, 20, 3.6097F, -2.7517F, 1.705F, 1, 1, 2, 0.0F, false));

        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(-1.6097F, 3.3261F, -1.9865F);
        this.chest.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.4712F, 0.0F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 0, 13, -1.3903F, -2.5254F, -1.9711F, 1, 1, 4, 0.003F, true));
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 0, 13, 3.6097F, -2.5254F, -1.9711F, 1, 1, 4, 0.003F, false));

        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(1.6097F, 3.3261F, -1.9865F);
        this.chest.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.8552F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 49, 30, 0.3903F, -2.297F, -1.1923F, 1, 1, 2, 0.0F, false));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(3.1124F, 2.2262F, -4.1776F);
        this.chest.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.1013F, 0.5324F, 0.4949F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 21, 42, -0.8403F, 0.1578F, -1.2102F, 1, 3, 2, 0.0F, false));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(1.6097F, 3.3261F, -1.9865F);
        this.chest.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 1.1149F, 0.0017F, -0.0376F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 7, 56, -1.4694F, -1.1281F, -2.9477F, 1, 3, 1, 0.0F, false));

        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(1.5591F, 5.3265F, -2.2021F);
        this.chest.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.2011F, -0.408F, -0.9215F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 27, 37, -0.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(1.6899F, 5.4831F, -1.3582F);
        this.chest.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.457F, -1.0981F, -0.5068F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 0, 7, -1.9F, -0.1F, -0.3F, 4, 0, 1, 0.0F, false));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.chest.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.1745F, 0.0F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 0, 34, -1.0F, -0.5F, -3.1F, 1, 1, 4, 0.003F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(3.2474F, 2.9395F, -3.5157F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.657F, 0.0545F, -1.269F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 0, 45, -0.5059F, -0.5647F, -0.6475F, 1, 6, 1, -0.1F, false));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(-0.5059F, 1.4353F, 0.3525F);
        this.leftArm1.addChild(cube_r85);
        this.setRotateAngle(cube_r85, -0.4712F, 0.0F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 22, 59, 0.0F, -1.7F, -1.0F, 1, 2, 1, -0.11F, false));

        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0941F, 4.6353F, -0.6475F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.7894F, 0.0387F, -0.0202F);


        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(1.2F, 1.95F, 0.6F);
        this.leftArm2.addChild(cube_r86);
        this.setRotateAngle(cube_r86, -0.2269F, 0.0F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 0, 59, -1.75F, -0.2F, -0.6F, 1, 3, 1, -0.3F, false));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(1.2F, -0.85F, 0.6F);
        this.leftArm2.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.1047F, 0.0F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 50, 57, -1.75F, 0.2F, -0.9F, 1, 3, 1, -0.3F, false));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(0.05F, 2.25F, -0.5F);
        this.leftArm2.addChild(cube_r88);
        this.setRotateAngle(cube_r88, -0.1309F, 0.0F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 9, 26, -0.5F, -2.5F, -0.5F, 1, 3, 1, -0.3F, false));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(0.05F, 2.35F, -0.5F);
        this.leftArm2.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -0.0262F, 0.0F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 29, 1, -0.5F, -0.5991F, -0.5131F, 1, 3, 1, -0.3F, false));

        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 4.5F, -0.4F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.6614F, -0.0692F, 0.0532F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 49, 15, -1.0F, -0.25F, -0.5F, 1, 2, 2, -0.01F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 38, 46, -1.0F, 1.7F, -0.5F, 1, 5, 1, -0.01F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 17, 59, -1.0F, 1.7F, 0.5F, 1, 3, 1, -0.01F, false));

        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.2597F, -0.0338F, -0.1265F);
        this.leftFinger.cubeList.add(new ModelBox(leftFinger, 46, 0, -2.0F, 0.0F, -0.5F, 2, 4, 1, -0.02F, false));

        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.2474F, 2.9395F, -3.5157F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.5557F, -0.0922F, 1.2823F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 43, 39, -0.4941F, -0.5647F, -0.6475F, 1, 6, 1, -0.1F, false));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(0.5059F, 1.4353F, 0.3525F);
        this.rightArm1.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -0.4712F, 0.0F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 58, 32, -1.0F, -1.7F, -1.0F, 1, 2, 1, -0.11F, false));

        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0941F, 4.6353F, -0.6475F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.7894F, -0.0387F, 0.0202F);


        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(-1.2F, 1.95F, 0.6F);
        this.rightArm2.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -0.2269F, 0.0F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 55, 57, 0.75F, -0.2F, -0.6F, 1, 3, 1, -0.3F, false));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(-1.2F, -0.85F, 0.6F);
        this.rightArm2.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.1047F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 36, 57, 0.75F, 0.2F, -0.9F, 1, 3, 1, -0.3F, false));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(-0.05F, 2.25F, -0.5F);
        this.rightArm2.addChild(cube_r93);
        this.setRotateAngle(cube_r93, -0.1309F, 0.0F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 14, 15, -0.5F, -2.5F, -0.5F, 1, 3, 1, -0.3F, false));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(-0.05F, 2.35F, -0.5F);
        this.rightArm2.addChild(cube_r94);
        this.setRotateAngle(cube_r94, -0.0262F, 0.0F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 0, 26, -0.5F, -0.5991F, -0.5131F, 1, 3, 1, -0.3F, false));

        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2F, 4.5F, -0.4F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.7923F, 0.0692F, -0.0532F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 48, 46, 0.0F, -0.25F, -0.5F, 1, 2, 2, -0.01F, false));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 33, 46, 0.0F, 1.7F, -0.5F, 1, 5, 1, -0.01F, false));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 12, 59, 0.0F, 1.7F, 0.5F, 1, 3, 1, -0.01F, false));

        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.2597F, 0.0338F, 0.1265F);
        this.rightFinger.cubeList.add(new ModelBox(rightFinger, 42, 32, 0.0F, 0.0F, -0.5F, 2, 4, 1, -0.02F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.1F, -4.8F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.3054F, 0.0F, 0.0F);


        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(0.5F, 0.2F, -1.2F);
        this.neck3.addChild(cube_r95);
        this.setRotateAngle(cube_r95, -0.0698F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 60, 50, -1.0F, -0.8643F, 0.2306F, 1, 1, 1, -0.003F, false));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(0.5F, -0.6F, -3.0F);
        this.neck3.addChild(cube_r96);
        this.setRotateAngle(cube_r96, -0.4363F, 0.0F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 37, 0, -0.5F, -1.3F, 1.2F, 0, 1, 1, 0.0F, false));
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 53, 0, -1.0F, -1.0F, 0.2F, 1, 1, 2, 0.003F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.3F, -3.0F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.2676F, 0.212F, 0.0517F);


        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(0.5F, -2.7F, -1.9F);
        this.neck2.addChild(cube_r97);
        this.setRotateAngle(cube_r97, -0.7941F, 0.0F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 40, 40, -0.5F, -0.3262F, 2.9312F, 0, 1, 1, 0.0F, false));
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 41, 11, -0.5F, -0.5262F, 0.9312F, 0, 1, 1, 0.0F, false));
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 34, 11, -1.0F, -0.0262F, -0.0688F, 1, 1, 4, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.9F, -2.8F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.0873F, 0.0F);


        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(0.0F, -0.1F, -0.1F);
        this.neck.addChild(cube_r98);
        this.setRotateAngle(cube_r98, -0.5411F, 0.0F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 41, 17, 0.0F, -0.8762F, -0.0153F, 0, 1, 1, 0.0F, false));

        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(0.0F, -0.6F, -1.0F);
        this.neck.addChild(cube_r99);
        this.setRotateAngle(cube_r99, -0.4014F, 0.0F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 52, 24, -0.5F, -0.0676F, 0.0085F, 1, 1, 2, 0.003F, false));

        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(0.0F, -0.3F, -2.0F);
        this.neck.addChild(cube_r100);
        this.setRotateAngle(cube_r100, -0.1745F, 0.0F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 43, 0, 0.0F, -1.0024F, -0.0026F, 0, 1, 1, 0.0F, false));

        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(0.0F, -0.3F, -2.8F);
        this.neck.addChild(cube_r101);
        this.setRotateAngle(cube_r101, -0.0349F, 0.0F, 0.0F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 31, 53, -0.5F, -0.4303F, -0.203F, 1, 1, 2, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2F, -3.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2628F, 0.0956F, -0.0195F);


        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(0.0F, -0.7531F, -0.033F);
        this.head.addChild(cube_r102);
        this.setRotateAngle(cube_r102, -0.6283F, 0.0F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 14, 26, -1.0F, -0.0457F, -0.0186F, 2, 1, 1, -0.003F, false));

        this.cube_r103 = new ModelRenderer(this);
        this.cube_r103.setRotationPoint(0.0F, -0.6531F, -1.033F);
        this.head.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.1222F, 0.0F, 0.0F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 5, 61, -1.1F, -0.2369F, 0.0861F, 1, 1, 1, -0.2F, true));
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 60, 59, -1.1F, -0.2369F, -0.2139F, 1, 1, 1, -0.19F, true));
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 60, 59, 0.1F, -0.2369F, -0.2139F, 1, 1, 1, -0.19F, false));
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 5, 61, 0.1F, -0.2369F, 0.0861F, 1, 1, 1, -0.2F, false));
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 54, 14, -1.0F, -0.0231F, -0.0139F, 2, 1, 1, -0.004F, false));

        this.cube_r104 = new ModelRenderer(this);
        this.cube_r104.setRotationPoint(0.0F, -0.2531F, -2.033F);
        this.head.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.4014F, 0.0F, 0.0F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 22, 56, -1.0F, -0.0006F, 0.0629F, 2, 1, 1, 0.0F, false));

        this.cube_r105 = new ModelRenderer(this);
        this.cube_r105.setRotationPoint(0.0F, 0.2469F, -2.833F);
        this.head.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.576F, 0.0F, 0.0F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 57, 8, -1.0F, 0.0158F, 0.0061F, 2, 1, 1, -0.003F, false));

        this.cube_r106 = new ModelRenderer(this);
        this.cube_r106.setRotationPoint(-0.5142F, 0.6544F, -3.0268F);
        this.head.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.6283F, -0.1222F, 0.0F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 61, 19, -0.2858F, -0.2F, -0.5975F, 1, 1, 1, -0.004F, true));

        this.cube_r107 = new ModelRenderer(this);
        this.cube_r107.setRotationPoint(-0.5142F, 0.6544F, -3.0268F);
        this.head.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.5836F, 0.1889F, 0.2261F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 53, 53, -0.9077F, -0.5229F, -0.5631F, 1, 1, 2, -0.3F, true));

        this.cube_r108 = new ModelRenderer(this);
        this.cube_r108.setRotationPoint(-0.5142F, 0.6544F, -3.0268F);
        this.head.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.6956F, -0.4266F, -0.2443F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 54, 18, -0.8803F, -0.5F, -1.4486F, 1, 1, 2, -0.3F, true));

        this.cube_r109 = new ModelRenderer(this);
        this.cube_r109.setRotationPoint(0.5142F, 0.6544F, -3.0268F);
        this.head.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.5836F, -0.1889F, -0.2261F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 53, 53, -0.0923F, -0.5229F, -0.5631F, 1, 1, 2, -0.3F, false));

        this.cube_r110 = new ModelRenderer(this);
        this.cube_r110.setRotationPoint(0.5142F, 0.6544F, -3.0268F);
        this.head.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.6956F, 0.4266F, 0.2443F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 54, 18, -0.1197F, -0.5F, -1.4486F, 1, 1, 2, -0.3F, false));

        this.cube_r111 = new ModelRenderer(this);
        this.cube_r111.setRotationPoint(0.5142F, 0.6544F, -3.0268F);
        this.head.addChild(cube_r111);
        this.setRotateAngle(cube_r111, 0.6283F, 0.1222F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 61, 19, -0.7142F, -0.2F, -0.5975F, 1, 1, 1, -0.004F, false));

        this.cube_r112 = new ModelRenderer(this);
        this.cube_r112.setRotationPoint(0.5F, 2.0469F, -5.233F);
        this.head.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 0.6283F, 0.0F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 27, 39, -1.0F, -0.0298F, 0.0058F, 1, 1, 3, 0.004F, false));

        this.cube_r113 = new ModelRenderer(this);
        this.cube_r113.setRotationPoint(0.0F, 2.6199F, -5.6353F);
        this.head.addChild(cube_r113);
        this.setRotateAngle(cube_r113, 0.4538F, 0.0F, 0.0F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 55, 4, -0.5F, -0.5F, -0.9F, 1, 1, 2, -0.1F, false));

        this.cube_r114 = new ModelRenderer(this);
        this.cube_r114.setRotationPoint(0.5F, 2.9469F, -6.933F);
        this.head.addChild(cube_r114);
        this.setRotateAngle(cube_r114, 0.6458F, 0.0F, 0.0F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 63, 6, -1.0F, -0.1052F, -0.2628F, 1, 1, 1, -0.11F, false));

        this.cube_r115 = new ModelRenderer(this);
        this.cube_r115.setRotationPoint(-0.1F, 4.0951F, -6.6888F);
        this.head.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 0.1222F, 0.0F, 0.0F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 60, 2, -0.3F, -1.007F, -0.0283F, 0, 1, 2, 0.0F, true));
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 60, 2, 0.5F, -1.007F, -0.0283F, 0, 1, 2, 0.0F, false));

        this.cube_r116 = new ModelRenderer(this);
        this.cube_r116.setRotationPoint(-0.1F, 3.7951F, -4.7888F);
        this.head.addChild(cube_r116);
        this.setRotateAngle(cube_r116, 0.5061F, 0.0F, 0.0F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 59, 15, -0.3F, -0.9408F, 0.1493F, 0, 1, 2, 0.0F, true));
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 59, 15, 0.5F, -0.9408F, 0.1493F, 0, 1, 2, 0.0F, false));

        this.cube_r117 = new ModelRenderer(this);
        this.cube_r117.setRotationPoint(0.0F, 3.1469F, -4.033F);
        this.head.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 0.2793F, 0.0F, 0.0F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 39, 27, -0.6F, -1.0549F, -2.9126F, 1, 1, 3, -0.11F, true));
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 39, 27, -0.4F, -1.0549F, -2.9126F, 1, 1, 3, -0.1F, false));

        this.cube_r118 = new ModelRenderer(this);
        this.cube_r118.setRotationPoint(0.0F, 2.2469F, -2.333F);
        this.head.addChild(cube_r118);
        this.setRotateAngle(cube_r118, 0.4363F, 0.0F, 0.0F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 15, 55, -0.8F, -0.9577F, -1.9337F, 1, 1, 2, -0.004F, true));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 15, 55, -0.2F, -0.9577F, -1.9337F, 1, 1, 2, 0.0F, false));

        this.cube_r119 = new ModelRenderer(this);
        this.cube_r119.setRotationPoint(0.0F, 2.2469F, -1.833F);
        this.head.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 0.0873F, 0.0F, 0.0F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 57, 22, -1.0F, -1.0013F, -0.9318F, 2, 1, 1, -0.003F, false));

        this.cube_r120 = new ModelRenderer(this);
        this.cube_r120.setRotationPoint(0.0F, 0.9469F, -1.333F);
        this.head.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.4014F, 0.0F, 0.0F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 29, 57, -1.0F, 0.0F, -0.9F, 2, 1, 1, 0.0F, false));
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 0, 40, -1.0F, -1.0F, -0.4F, 2, 2, 2, 0.004F, false));

        this.cube_r121 = new ModelRenderer(this);
        this.cube_r121.setRotationPoint(-0.2F, 2.9372F, -6.4951F);
        this.head.addChild(cube_r121);
        this.setRotateAngle(cube_r121, 0.3316F, 0.0F, 0.0F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 62, 13, -0.62F, -0.5F, -0.3F, 1, 1, 1, -0.3F, true));
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 46, 61, -0.64F, -0.5F, 0.0F, 1, 1, 1, -0.31F, true));
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 46, 61, 0.04F, -0.5F, 0.0F, 1, 1, 1, -0.31F, false));
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 62, 13, 0.02F, -0.5F, -0.3F, 1, 1, 1, -0.3F, false));

        this.cube_r122 = new ModelRenderer(this);
        this.cube_r122.setRotationPoint(-0.2F, 0.4962F, -0.2758F);
        this.head.addChild(cube_r122);
        this.setRotateAngle(cube_r122, 1.5533F, 0.0F, 0.0F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 61, 62, -1.02F, -0.5F, -1.1F, 1, 1, 1, -0.2F, true));
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 56, 62, -1.02F, -0.5F, -0.5F, 1, 1, 1, -0.21F, true));
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 56, 62, 0.42F, -0.5F, -0.5F, 1, 1, 1, -0.21F, false));
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 61, 62, 0.42F, -0.5F, -1.1F, 1, 1, 1, -0.2F, false));

        this.cube_r123 = new ModelRenderer(this);
        this.cube_r123.setRotationPoint(-0.2F, 0.6429F, -1.8966F);
        this.head.addChild(cube_r123);
        this.setRotateAngle(cube_r123, 0.5585F, 0.0F, 0.0F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 32, 61, -0.92F, -0.3F, -0.3F, 1, 1, 1, 0.0F, true));
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 61, 29, -1.14F, -0.3F, -0.3F, 1, 1, 1, -0.2F, true));
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 54, 28, -1.0F, 0.0F, -1.0F, 1, 1, 2, -0.1F, true));
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 61, 29, 0.54F, -0.3F, -0.3F, 1, 1, 1, -0.2F, false));
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 32, 61, 0.32F, -0.3F, -0.3F, 1, 1, 1, 0.0F, false));
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 54, 28, 0.4F, 0.0F, -1.0F, 1, 1, 2, -0.1F, false));

        this.cube_r124 = new ModelRenderer(this);
        this.cube_r124.setRotationPoint(-0.2F, 0.2429F, -1.0966F);
        this.head.addChild(cube_r124);
        this.setRotateAngle(cube_r124, 0.6458F, 0.0F, 0.0F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 0, 55, -1.0F, -0.7847F, -1.8904F, 1, 1, 2, -0.11F, true));
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 0, 55, 0.4F, -0.7847F, -1.8904F, 1, 1, 2, -0.11F, false));

        this.cube_r125 = new ModelRenderer(this);
        this.cube_r125.setRotationPoint(0.1F, 1.8367F, -3.5019F);
        this.head.addChild(cube_r125);
        this.setRotateAngle(cube_r125, 1.2043F, 0.0F, 0.0F);
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 37, 62, -1.05F, -0.5F, -0.5F, 1, 1, 1, -0.14F, true));
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 62, 35, -1.22F, -1.1F, -1.2F, 1, 1, 1, -0.3F, true));
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 62, 35, 0.02F, -1.1F, -1.2F, 1, 1, 1, -0.3F, false));
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 37, 62, -0.15F, -0.5F, -0.5F, 1, 1, 1, -0.14F, false));

        this.cube_r126 = new ModelRenderer(this);
        this.cube_r126.setRotationPoint(0.1F, 1.674F, -3.1365F);
        this.head.addChild(cube_r126);
        this.setRotateAngle(cube_r126, 0.4189F, 0.0F, 0.0F);
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 51, 62, -0.92F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 51, 62, -0.28F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.1F, 1.5F, 0.4F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.0996F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 53, 0.0F, 0.4057F, -3.9737F, 1, 1, 2, -0.15F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 53, 39, -0.5F, 0.6045F, -7.3872F, 1, 1, 2, -0.156F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 53, -1.2F, 0.4057F, -3.9737F, 1, 1, 2, -0.15F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 53, 39, -0.7F, 0.6045F, -7.3872F, 1, 1, 2, -0.15F, true));

        this.cube_r127 = new ModelRenderer(this);
        this.cube_r127.setRotationPoint(0.3F, 1.4F, -5.6F);
        this.jaw.addChild(cube_r127);
        this.setRotateAngle(cube_r127, 0.0349F, 0.0F, 0.0F);
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 30, 15, -0.6F, -1.0955F, -1.4872F, 0, 1, 3, 0.0F, true));
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 30, 15, -0.2F, -1.0955F, -1.4872F, 0, 1, 3, 0.0F, false));

        this.cube_r128 = new ModelRenderer(this);
        this.cube_r128.setRotationPoint(0.3F, 1.2F, -3.9F);
        this.jaw.addChild(cube_r128);
        this.setRotateAngle(cube_r128, 0.1047F, 0.0F, 0.0F);
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 34, 8, -1.0F, -0.7743F, -1.7988F, 1, 1, 1, -0.156F, true));
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 53, 44, -1.3F, -0.7743F, -1.0988F, 1, 1, 2, -0.156F, true));
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 34, 8, -0.8F, -0.7743F, -1.7988F, 1, 1, 1, -0.15F, false));
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 53, 44, -0.5F, -0.7743F, -1.0988F, 1, 1, 2, -0.156F, false));

        this.cube_r129 = new ModelRenderer(this);
        this.cube_r129.setRotationPoint(-0.2F, 1.2F, -2.1F);
        this.jaw.addChild(cube_r129);
        this.setRotateAngle(cube_r129, 0.2793F, 0.0F, 0.0F);
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 37, 0, -1.0F, -0.7943F, -0.1737F, 1, 1, 3, -0.151F, true));
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 37, 0, 0.2F, -0.7943F, -0.1737F, 1, 1, 3, -0.151F, false));

        this.cube_r130 = new ModelRenderer(this);
        this.cube_r130.setRotationPoint(-0.92F, 0.8767F, -1.8088F);
        this.jaw.addChild(cube_r130);
        this.setRotateAngle(cube_r130, 1.693F, 0.0F, 0.0F);
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 41, 59, -0.35F, -1.2F, -0.3F, 1, 2, 1, -0.2F, true));
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 41, 59, 0.99F, -1.2F, -0.3F, 1, 2, 1, -0.2F, false));

        this.cube_r131 = new ModelRenderer(this);
        this.cube_r131.setRotationPoint(-0.2F, 0.0F, -1.4F);
        this.jaw.addChild(cube_r131);
        this.setRotateAngle(cube_r131, 0.2269F, 0.0F, 0.0F);
        this.cube_r131.cubeList.add(new ModelBox(cube_r131, 21, 37, -1.0F, -0.1675F, -2.8046F, 1, 1, 3, -0.156F, true));
        this.cube_r131.cubeList.add(new ModelBox(cube_r131, 21, 37, 0.2F, -0.1675F, -2.8046F, 1, 1, 3, -0.156F, false));

        this.cube_r132 = new ModelRenderer(this);
        this.cube_r132.setRotationPoint(-0.2F, 0.0F, 0.5F);
        this.jaw.addChild(cube_r132);
        this.setRotateAngle(cube_r132, 0.0698F, 0.0F, 0.0F);
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 53, 34, -1.0F, -0.3F, -1.7F, 1, 1, 2, -0.15F, true));
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 53, 49, -1.0F, -0.3F, -2.0F, 1, 1, 2, -0.153F, true));
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 53, 34, 0.2F, -0.3F, -1.7F, 1, 1, 2, -0.15F, false));
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 53, 49, 0.2F, -0.3F, -2.0F, 1, 1, 2, -0.153F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3F, 2.7F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.1747F, 0.043F, 0.0076F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 26, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 28, 8, 0.0F, -1.1F, 0.0F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 22, 6, 0.0F, -0.9F, 2.0F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 8, 19, 0.0F, -0.9F, 4.0F, 0, 1, 1, 0.0F, false));

        this.cube_r133 = new ModelRenderer(this);
        this.cube_r133.setRotationPoint(0.0F, 0.5077F, 4.9059F);
        this.tail.addChild(cube_r133);
        this.setRotateAngle(cube_r133, 0.3927F, 0.0F, 0.0F);
        this.cube_r133.cubeList.add(new ModelBox(cube_r133, 24, 48, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r134 = new ModelRenderer(this);
        this.cube_r134.setRotationPoint(0.0F, 0.9809F, 2.9397F);
        this.tail.addChild(cube_r134);
        this.setRotateAngle(cube_r134, 0.5236F, 0.0F, 0.0F);
        this.cube_r134.cubeList.add(new ModelBox(cube_r134, 7, 13, 0.0F, -1.1719F, -0.3732F, 0, 2, 1, 0.0F, false));

        this.cube_r135 = new ModelRenderer(this);
        this.cube_r135.setRotationPoint(0.0F, 1.4F, 0.5F);
        this.tail.addChild(cube_r135);
        this.setRotateAngle(cube_r135, 0.6981F, 0.0F, 0.0F);
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 0, 13, 0.0F, -0.9F, 0.0F, 0, 2, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.4267F, 0.0059F, -0.018F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 3, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.003F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 14, 0, 0.0F, -0.9F, 0.0F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 19, 0.0F, -0.8F, 2.0F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 14, 6, 0.0F, -0.7F, 4.0F, 0, 1, 1, 0.0F, false));

        this.cube_r136 = new ModelRenderer(this);
        this.cube_r136.setRotationPoint(0.0F, 0.5077F, -0.9941F);
        this.tail2.addChild(cube_r136);
        this.setRotateAngle(cube_r136, 0.3927F, 0.0F, 0.0F);
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 9, 63, 0.0F, 3.1F, 9.1F, 0, 1, 1, 0.0F, false));
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 0, 64, 0.0F, 2.3F, 7.1F, 0, 1, 1, 0.0F, false));
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 3, 64, 0.0F, 1.7F, 5.1F, 0, 1, 1, 0.0F, false));
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 6, 64, 0.0F, 1.0F, 3.1F, 0, 1, 1, 0.0F, false));
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 12, 56, 0.0F, 0.3F, 1.1F, 0, 1, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2812F, -0.0077F, 0.0214F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 13, -0.5F, -0.5F, 0.0F, 1, 1, 11, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0573F, -0.0077F, 0.0465F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 11, 0.003F, false));

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
