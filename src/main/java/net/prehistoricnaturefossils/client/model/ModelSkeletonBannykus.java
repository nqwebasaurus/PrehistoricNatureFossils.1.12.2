package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBannykus extends ModelBase {
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
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r17;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r18;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer cube_r22;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer cube_r23;
    private final ModelRenderer leftFoot;
    private final ModelRenderer cube_r24;
    private final ModelRenderer leftToes;
    private final ModelRenderer cube_r25;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer cube_r29;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer cube_r30;
    private final ModelRenderer rightFoot;
    private final ModelRenderer cube_r31;
    private final ModelRenderer rightToes;
    private final ModelRenderer cube_r32;
    private final ModelRenderer torso;
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
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r78;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r79;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r80;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r81;
    private final ModelRenderer throat;
    private final ModelRenderer head;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
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
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r124;
    private final ModelRenderer cube_r125;
    private final ModelRenderer cube_r126;
    private final ModelRenderer cube_r127;
    private final ModelRenderer cube_r128;
    private final ModelRenderer cube_r129;
    private final ModelRenderer cube_r130;
    private final ModelRenderer cube_r131;
    private final ModelRenderer cube_r132;
    private final ModelRenderer cube_r133;
    private final ModelRenderer cube_r134;
    private final ModelRenderer cube_r135;
    private final ModelRenderer cube_r136;
    private final ModelRenderer leftArm1;
    private final ModelRenderer cube_r137;
    private final ModelRenderer leftArm2;
    private final ModelRenderer cube_r138;
    private final ModelRenderer leftHand;
    private final ModelRenderer cube_r139;
    private final ModelRenderer leftClaw;
    private final ModelRenderer cube_r140;
    private final ModelRenderer rightArm1;
    private final ModelRenderer cube_r141;
    private final ModelRenderer rightArm2;
    private final ModelRenderer cube_r142;
    private final ModelRenderer rightHand;
    private final ModelRenderer cube_r143;
    private final ModelRenderer rightClaw;
    private final ModelRenderer cube_r144;

    public ModelSkeletonBannykus() {
        this.textureWidth = 60;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(1.5F, -16.0F, 0.5F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0873F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.2F, -0.3F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2094F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 56, -1.5F, -0.4271F, 2.018F, 0, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 56, -1.5F, -0.4271F, 0.018F, 0, 1, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.1F, 2.7849F, -0.808F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1655F, 0.0677F, -0.1131F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 16, -0.1486F, -0.3482F, -0.2968F, 1, 2, 1, -0.2F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.1F, -0.55F, 0.15F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0524F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 55, 12, -3.0F, 0.0F, 0.0F, 1, 1, 1, 0.005F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 55, 12, -0.8F, 0.0F, 0.0F, 1, 1, 1, 0.005F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.9F, 0.3849F, -0.208F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2102F, 0.035F, -0.3025F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 44, -0.079F, -0.2498F, -0.3538F, 1, 3, 1, -0.2F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.6F, 0.9849F, 1.292F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3944F, -0.0381F, -0.3022F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 44, -0.2016F, -1.0292F, -0.6069F, 1, 3, 1, -0.2F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.1F, -0.55F, -0.45F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 55, -3.0F, 0.0F, 0.0F, 1, 1, 1, 0.005F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 55, -0.8F, 0.0F, 0.0F, 1, 1, 1, 0.005F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.6F, -0.1633F, 2.082F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.576F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 48, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 48, 1.7F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.1F, -1.05F, 1.35F);
        this.hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5061F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 9, -3.0F, -0.0874F, -0.1033F, 1, 1, 1, -0.003F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 9, -0.8F, -0.0874F, -0.1033F, 1, 1, 1, -0.003F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.7F, -1.15F, 1.35F);
        this.hips.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2618F, 0.2094F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 42, -0.3545F, 0.0435F, -2.0069F, 1, 1, 2, 0.003F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.7F, -0.65F, 0.55F);
        this.hips.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.2094F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 43, 54, -0.5F, -1.1454F, -1.9056F, 1, 1, 1, 0.0F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.3F, -0.65F, 0.55F);
        this.hips.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, -0.2094F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 43, 54, -0.5F, -1.1454F, -1.9056F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.3F, -1.15F, 1.35F);
        this.hips.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, -0.2094F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 42, -0.6455F, 0.0435F, -2.0069F, 1, 1, 2, 0.003F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.4F, 0.9849F, 1.292F);
        this.hips.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3944F, 0.0381F, 0.3022F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 44, -0.7984F, -1.0292F, -0.6069F, 1, 3, 1, -0.2F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.9F, 2.7849F, -0.808F);
        this.hips.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1655F, -0.0677F, 0.1131F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 48, 16, -0.8514F, -0.3482F, -0.2968F, 1, 2, 1, -0.2F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.1F, 0.3849F, -0.208F);
        this.hips.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2102F, -0.035F, 0.3025F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 44, -0.921F, -0.2498F, -0.3538F, 1, 3, 1, -0.2F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.2F, -1.3F);
        this.hips.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.192F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 15, 32, -2.0F, -0.3179F, -0.0004F, 1, 1, 4, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(-1.0F, -0.3572F, 2.5598F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.2231F, -0.1951F, 0.1313F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 16, -1.0F, -0.3447F, -0.053F, 1, 1, 7, 0.005F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 56, 49, -0.5F, -0.6447F, 0.947F, 0, 1, 1, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 51, 56, -0.5F, -0.6447F, 2.947F, 0, 1, 1, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 56, 52, -0.5F, -0.6447F, 4.947F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 1.2553F, 1.447F);
        this.tail1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6807F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 54, 0.0F, 1.5F, 3.5F, 0, 2, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 23, 55, 0.0F, 0.4F, 1.5F, 0, 2, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 48, 54, 0.0F, -0.8F, -0.5F, 0, 2, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(-0.5F, 0.2093F, 6.9697F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0268F, -0.2181F, 0.0058F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 0, -0.5F, -0.5017F, -0.0739F, 1, 1, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 57, 4, 0.0F, -0.8017F, -0.0739F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 57, 0.0F, -0.7017F, 1.9261F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 29, 57, 0.0F, -0.7017F, 3.9261F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 32, 57, 0.0F, -0.7017F, 5.9261F, 0, 1, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.0461F, -5.5227F);
        this.tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.6807F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 3, 56, 0.0F, 5.0F, 7.5F, 0, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 54, 56, 0.0F, 3.8F, 5.5F, 0, 1, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1591F, 6.9235F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0464F, -0.3487F, -0.0159F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 16, -0.5F, -0.6586F, -0.0053F, 1, 1, 6, 0.005F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1975F, 5.8947F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1646F, -0.3016F, -0.0493F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, -0.4711F, 0.0008F, 1, 1, 7, -0.01F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.5F, -0.1132F, 0.6096F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -1.4835F, 0.0F, 0.0F);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(1.175F, 5.0361F, 2.2006F);
        this.leftLeg1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.8378F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 46, -2.1F, 0.0124F, -0.0071F, 2, 1, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(1.175F, 2.609F, 0.4372F);
        this.leftLeg1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.6283F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 45, 38, -1.6F, 0.0124F, -0.0071F, 1, 3, 1, 0.004F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(1.175F, -0.1931F, -0.0506F);
        this.leftLeg1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3491F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 45, 43, -1.6F, -0.1876F, -0.5071F, 1, 3, 1, 0.0F, false));

        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-2.1F, 5.4574F, 3.6402F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.8727F, 0.0F, 0.0F);


        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(2.0F, 0.0319F, -0.0588F);
        this.leftLeg2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 1.2217F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 34, 0, 0.3F, -0.0392F, -0.3F, 1, 7, 1, -0.2F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 33, -0.7F, -0.0392F, -0.3F, 1, 7, 1, 0.0F, false));

        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.2F, 2.4128F, 6.9674F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.2618F, 0.0F, 0.0F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(2.0F, -2.2131F, -0.517F);
        this.leftLeg3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.5236F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 26, 37, -0.5F, 1.8724F, -1.4104F, 1, 5, 1, 0.0F, false));

        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(2.0F, 3.6462F, 1.783F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.7854F, 0.0F, 0.0F);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.0F, 1.3351F, 2.108F);
        this.leftFoot.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.8326F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 35, 30, 1.0F, -1.9F, 0.1F, 2, 1, 2, 0.0F, false));

        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 1.6303F, 0.6468F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, 0.48F, 0.0F, 0.0F);


        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.0F, 1.6367F, 1.9788F);
        this.leftToes.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 1.8326F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 35, 34, 1.0F, -1.9F, 0.1F, 2, 1, 2, -0.001F, false));

        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.5F, -0.1132F, 0.6096F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.7854F, 0.0F, 0.0F);


        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.175F, 5.0361F, 2.2006F);
        this.rightLeg1.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.8378F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 46, 0.1F, 0.0124F, -0.0071F, 2, 1, 1, 0.0F, true));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.175F, 2.609F, 0.4372F);
        this.rightLeg1.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.6283F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 45, 38, 0.6F, 0.0124F, -0.0071F, 1, 3, 1, 0.004F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.175F, -0.1931F, -0.0506F);
        this.rightLeg1.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3491F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 45, 43, 0.6F, -0.1876F, -0.5071F, 1, 3, 1, 0.0F, true));

        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(2.1F, 5.4574F, 3.6402F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.2182F, 0.0F, 0.0F);


        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-2.0F, 0.0319F, -0.0588F);
        this.rightLeg2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 1.2217F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 34, 0, -1.3F, -0.0392F, -0.3F, 1, 7, 1, -0.2F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 9, 33, -0.3F, -0.0392F, -0.3F, 1, 7, 1, 0.0F, true));

        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.2F, 2.4128F, 6.9674F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.3927F, 0.0F, 0.0F);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-2.0F, -2.2131F, -0.517F);
        this.rightLeg3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.5236F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 26, 37, -0.5F, 1.8724F, -1.4104F, 1, 5, 1, 0.0F, true));

        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(-2.0F, 3.6462F, 1.783F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.9599F, 0.0F, 0.0F);


        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(2.0F, 1.3351F, 2.108F);
        this.rightFoot.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 1.8326F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 35, 30, -3.0F, -1.9F, 0.1F, 2, 1, 2, 0.0F, true));

        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 1.6303F, 0.6468F);
        this.rightFoot.addChild(rightToes);


        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(2.0F, 1.6367F, 1.9788F);
        this.rightToes.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 1.8326F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 35, 34, -3.0F, -1.9F, 0.1F, 2, 1, 2, -0.001F, true));

        this.torso = new ModelRenderer(this);
        this.torso.setRotationPoint(-1.5F, -1.1F, -1.1F);
        this.hips.addChild(torso);
        this.setRotateAngle(torso, 0.0117F, 0.2615F, 0.0452F);


        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(1.9829F, 5.1F, -0.1389F);
        this.torso.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.192F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 9, -4.0F, -1.0437F, -4.9957F, 4, 1, 5, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(1.9829F, -0.4F, -0.8389F);
        this.torso.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1745F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 56, 46, -2.0F, -0.5879F, -0.0088F, 0, 1, 1, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(1.9829F, -0.7F, -5.8389F);
        this.torso.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0524F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 56, 33, -2.0F, -0.55F, 3.0F, 0, 1, 1, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 56, 30, -2.0F, -0.55F, 1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 25, -2.5F, -0.05F, 0.0F, 1, 1, 6, 0.005F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5171F, -0.0745F, -0.3658F);
        this.torso.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0755F, 0.0408F, -1.2415F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 38, 46, -2.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5171F, -0.0745F, -0.3658F);
        this.torso.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0544F, 0.0468F, -0.7698F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 55, 38, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5171F, -0.3745F, -2.3658F);
        this.torso.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0519F, 0.1078F, -0.6743F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 26, 55, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.5171F, -0.3745F, -2.3658F);
        this.torso.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0086F, 0.1433F, -1.1481F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 31, 46, -2.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, true));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5171F, -0.3745F, -2.3658F);
        this.torso.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.0815F, 0.1183F, -1.6933F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 53, 25, -3.2446F, -1.8776F, -0.5238F, 1, 0, 1, 0.0F, true));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5171F, -0.3745F, -4.3658F);
        this.torso.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.079F, 0.1881F, -1.6406F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 14, 46, -4.2446F, -1.8776F, -0.5238F, 2, 0, 1, 0.0F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5171F, -0.3745F, -4.3658F);
        this.torso.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0304F, 0.2015F, -1.089F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 7, 46, -2.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5171F, -0.3745F, -4.3658F);
        this.torso.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1131F, 0.1421F, -0.6143F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 51, 36, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.4829F, -0.0745F, -0.3658F);
        this.torso.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0544F, -0.0468F, 0.7698F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 55, 38, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.4829F, -0.0745F, -0.3658F);
        this.torso.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0755F, -0.0408F, 1.2415F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 38, 46, 0.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.4829F, -0.3745F, -2.3658F);
        this.torso.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.0815F, -0.1183F, 1.6933F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 53, 25, 2.2446F, -1.8776F, -0.5238F, 1, 0, 1, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(0.4829F, -0.3745F, -2.3658F);
        this.torso.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.0086F, -0.1433F, 1.1481F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 31, 46, 0.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.4829F, -0.3745F, -2.3658F);
        this.torso.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0519F, -0.1078F, 0.6743F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 26, 55, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.4829F, -0.3745F, -4.3658F);
        this.torso.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1131F, -0.1421F, 0.6143F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 51, 36, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.4829F, -0.3745F, -4.3658F);
        this.torso.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0304F, -0.2015F, 1.089F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 7, 46, 0.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.4829F, -0.3745F, -4.3658F);
        this.torso.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.079F, -0.1881F, 1.6406F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 14, 46, 2.2446F, -1.8776F, -0.5238F, 2, 0, 1, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(-0.0171F, -0.337F, -5.891F);
        this.torso.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.1309F, 0.0F);


        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(1.5F, -0.263F, -1.9479F);
        this.chest.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0611F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 56, 27, -1.5F, -0.6115F, -2.9237F, 0, 1, 1, 0.0F, false));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 15, 56, -1.5F, -0.6115F, -0.9237F, 0, 1, 1, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.4132F, 3.3673F, -1.5296F);
        this.chest.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.1989F, 0.8594F, -0.2865F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 43, 8, -3.0731F, 0.0377F, -0.6183F, 3, 0, 1, 0.0F, true));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.4591F, 3.1635F, -1.45F);
        this.chest.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.2195F, 0.1012F, 0.1615F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 41, 27, -2.0731F, 0.0377F, -0.6183F, 3, 0, 1, 0.0F, true));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-1.6697F, 1.7842F, -3.4756F);
        this.chest.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.6951F, 0.048F, -0.6945F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 43, 10, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(-1.2097F, 1.2631F, -3.9344F);
        this.chest.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.2443F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 32, 9, -1.3903F, -0.5885F, -0.1522F, 1, 1, 4, 0.003F, true));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 32, 9, 2.8097F, -0.5885F, -0.1522F, 1, 1, 4, 0.003F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.5F, -0.0375F, -4.4748F);
        this.chest.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.2223F, 0.4584F, -1.2007F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 56, 2, -1.891F, -0.4534F, -0.5238F, 1, 0, 1, 0.0F, true));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.5F, -0.0375F, -4.4748F);
        this.chest.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.3983F, 0.2878F, -0.7275F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 56, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(-0.5F, -0.0375F, -2.4748F);
        this.chest.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.2376F, 0.2089F, -0.4878F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 55, 44, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.5F, -0.0375F, -2.4748F);
        this.chest.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.1116F, 0.3171F, -0.9634F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 48, 14, -2.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, true));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.5F, -0.0375F, -2.4748F);
        this.chest.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.0739F, 0.3276F, -1.5346F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 55, 42, -3.2446F, -1.8776F, -0.5238F, 1, 0, 1, 0.0F, true));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.5F, -0.0375F, -0.4748F);
        this.chest.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.175F, 0.1758F, -0.4998F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 55, 40, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(-0.5F, -0.0375F, -0.4748F);
        this.chest.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0704F, 0.2595F, -0.9751F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 14, 48, -2.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, true));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(-0.5F, -0.0375F, -0.4748F);
        this.chest.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.0765F, 0.2578F, -1.5353F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 7, 48, -4.2446F, -1.8776F, -0.5238F, 2, 0, 1, 0.0F, true));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(0.5F, -0.0375F, -4.4748F);
        this.chest.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.3983F, -0.2878F, 0.7275F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 56, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.5F, -0.0375F, -4.4748F);
        this.chest.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.2223F, -0.4584F, 1.2007F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 56, 2, 0.891F, -0.4534F, -0.5238F, 1, 0, 1, 0.0F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(0.5F, -0.0375F, -2.4748F);
        this.chest.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -0.0739F, -0.3276F, 1.5346F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 55, 42, 2.2446F, -1.8776F, -0.5238F, 1, 0, 1, 0.0F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.5F, -0.0375F, -2.4748F);
        this.chest.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.1116F, -0.3171F, 0.9634F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 48, 14, 0.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(0.5F, -0.0375F, -2.4748F);
        this.chest.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.2376F, -0.2089F, 0.4878F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 55, 44, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(0.5F, -0.0375F, -0.4748F);
        this.chest.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.175F, -0.1758F, 0.4998F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 55, 40, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.5F, -0.0375F, -0.4748F);
        this.chest.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0704F, -0.2595F, 0.9751F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 14, 48, 0.891F, -0.4534F, -0.5238F, 2, 0, 1, 0.0F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(0.5F, -0.0375F, -0.4748F);
        this.chest.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.0765F, -0.2578F, 1.5353F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 7, 48, 2.2446F, -1.8776F, -0.5238F, 2, 0, 1, 0.0F, false));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(1.5F, -0.263F, -4.5479F);
        this.chest.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -0.0262F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 12, 56, -1.5F, -0.6796F, 3.6754F, 0, 1, 1, 0.0F, false));
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 19, 9, -2.0F, -0.2796F, -0.3246F, 1, 1, 5, 0.0F, false));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(1.6697F, 1.7842F, -3.4756F);
        this.chest.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.6951F, -0.048F, 0.6945F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 43, 10, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(0.4132F, 3.3673F, -1.5296F);
        this.chest.addChild(cube_r75);
        this.setRotateAngle(cube_r75, -0.1989F, -0.8594F, 0.2865F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 43, 8, 0.0731F, 0.0377F, -0.6183F, 3, 0, 1, 0.0F, false));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(0.4591F, 3.1635F, -1.45F);
        this.chest.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.2195F, -0.1012F, -0.1615F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 41, 27, -0.9269F, 0.0377F, -0.6183F, 3, 0, 1, 0.0F, false));

        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(1.5F, 3.837F, -1.1479F);
        this.chest.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.4451F, 0.0F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 0, 33, -2.0F, -0.8033F, -3.1595F, 1, 1, 3, 0.0F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.5F, -0.163F, -4.6479F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.0F, 0.2618F, 0.0F);


        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(0.0F, -1.1F, -1.0F);
        this.neck1.addChild(cube_r78);
        this.setRotateAngle(cube_r78, -0.7767F, 0.0F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 41, 19, -1.0F, -0.4627F, -0.3164F, 1, 1, 2, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.0215F, -1.0982F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.3574F, 0.346F, 0.0475F);


        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(-0.5F, -5.4788F, -1.1484F);
        this.neck2.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -1.3614F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 17, 24, -0.5F, -0.5133F, -0.1722F, 1, 1, 6, -0.154F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(-0.0765F, -5.394F, -1.2934F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, 0.3927F, 0.0F);


        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(-0.5F, -1.6749F, -1.9219F);
        this.neck3.addChild(cube_r80);
        this.setRotateAngle(cube_r80, -0.672F, 0.0F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 26, 32, -0.5F, -0.3494F, -0.1793F, 1, 1, 3, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(-0.5F, -1.4575F, -1.9561F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.262F, -0.0038F, -0.0872F);


        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(0.0F, -0.0534F, -1.3757F);
        this.neck4.addChild(cube_r81);
        this.setRotateAngle(cube_r81, -0.192F, 0.0F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 0, 38, -0.5F, -0.809F, -0.4489F, 1, 1, 2, -0.154F, false));

        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.8343F, -1.4229F);
        this.neck4.addChild(throat);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.3008F, -1.6079F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -0.0873F, 0.0F, 0.0F);


        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(-0.5F, -0.9751F, 0.2635F);
        this.head.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.48F, 0.0F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 48, 24, -1.0F, -0.1417F, -0.7706F, 1, 1, 1, -0.15F, true));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 48, 24, 0.0F, -0.1417F, -0.7706F, 1, 1, 1, -0.15F, false));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(-0.5F, -1.0837F, -0.3639F);
        this.head.addChild(cube_r83);
        this.setRotateAngle(cube_r83, -0.1658F, 0.0F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 51, 50, -1.0F, -0.27F, -0.1504F, 1, 1, 1, -0.25F, true));
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 51, 50, 0.0F, -0.27F, -0.1504F, 1, 1, 1, -0.25F, false));
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 44, 29, -1.0F, -0.1493F, -0.1504F, 2, 1, 1, -0.148F, false));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(-0.75F, -0.7593F, 0.0484F);
        this.head.addChild(cube_r84);
        this.setRotateAngle(cube_r84, -0.637F, 0.0F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 51, 47, -0.904F, -0.2926F, -0.2678F, 1, 1, 1, -0.3F, true));
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 51, 47, 0.404F, -0.2926F, -0.2678F, 1, 1, 1, -0.3F, false));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(-0.75F, -0.1593F, -0.0516F);
        this.head.addChild(cube_r85);
        this.setRotateAngle(cube_r85, -0.2182F, 0.0F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 46, 4, -1.005F, -1.0F, -0.6F, 1, 2, 1, -0.4F, true));
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 46, 4, 0.505F, -1.0F, -0.6F, 1, 2, 1, -0.4F, false));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(-0.8823F, -0.1924F, -1.0575F);
        this.head.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.3229F, -0.2094F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 38, 54, -0.5577F, -0.6339F, -0.8297F, 1, 1, 1, -0.149F, true));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(-0.8823F, -0.1924F, -1.0575F);
        this.head.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.1658F, -0.2094F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 33, 54, -0.5577F, -0.311F, -0.6451F, 1, 1, 1, -0.15F, true));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(-0.8823F, -0.1924F, -1.0575F);
        this.head.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.0611F, -0.2094F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 36, 51, -0.6877F, -0.5409F, -0.5909F, 1, 1, 1, -0.25F, true));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 51, 33, -0.5877F, -0.5409F, -0.5909F, 1, 1, 1, -0.16F, true));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 51, 53, -0.5577F, -0.7409F, -0.6909F, 1, 1, 1, -0.148F, true));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(-0.8823F, -0.1924F, -1.0575F);
        this.head.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -0.0785F, -0.1484F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 3, 50, -0.5577F, -0.2998F, -0.128F, 1, 1, 1, -0.146F, true));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(-1.2F, -0.7296F, -0.4108F);
        this.head.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.009F, -0.2443F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 21, 49, -0.3F, -0.5026F, -0.8F, 1, 1, 1, -0.15F, true));

        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(-0.8823F, -0.1924F, -1.0575F);
        this.head.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -0.5149F, -0.1484F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 8, 50, -0.5577F, -0.7413F, -0.3505F, 1, 1, 1, -0.149F, true));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(0.0F, -0.9005F, -2.7776F);
        this.head.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.1745F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 32, 25, -1.0F, 0.0705F, -1.9936F, 1, 1, 3, -0.3F, true));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(-0.5F, -0.5436F, -2.4618F);
        this.head.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.3226F, -0.213F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 41, 15, -0.5F, -0.2264F, -0.1482F, 1, 1, 2, -0.2F, true));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(-0.7F, -0.2677F, -1.5285F);
        this.head.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.1573F, -0.1221F, -0.0043F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 0, 42, -0.6F, -0.5F, -1.0F, 1, 1, 2, -0.2F, true));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(-0.9F, 0.0838F, -2.3755F);
        this.head.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.1032F, -0.1826F, 0.0162F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 39, 4, -0.4F, -0.8159F, -1.578F, 1, 1, 2, -0.3F, true));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(-0.8F, -0.0288F, -2.4395F);
        this.head.addChild(cube_r96);
        this.setRotateAngle(cube_r96, -0.096F, -0.1745F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 13, 50, -0.52F, -0.4722F, -0.5126F, 1, 1, 1, -0.3F, true));
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 50, 10, -0.52F, -0.4722F, -0.1126F, 1, 1, 1, -0.304F, true));
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 46, 51, -0.59F, -0.3722F, -1.3126F, 1, 1, 1, -0.4F, true));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(-0.8F, -0.0288F, -2.4395F);
        this.head.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.5323F, -0.1745F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 51, 0, -0.52F, -0.3031F, -0.1363F, 1, 1, 1, -0.3F, true));

        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(-0.8F, -0.0288F, -2.4395F);
        this.head.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.096F, -0.1745F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 50, 44, -0.52F, -0.5344F, -0.1812F, 1, 1, 1, -0.299F, true));
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 50, 38, -0.52F, -0.5344F, -0.5812F, 1, 1, 1, -0.299F, true));

        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(-1.1F, -0.0946F, -4.455F);
        this.head.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.0785F, 0.0F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 51, 3, -0.01F, -0.4791F, -0.5F, 1, 1, 1, -0.4F, true));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 51, 27, -0.01F, -0.4791F, -0.3F, 1, 1, 1, -0.4F, true));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 51, 30, -0.01F, -0.4791F, -0.1F, 1, 1, 1, -0.4F, true));

        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(-1.5F, 0.4662F, -0.8304F);
        this.head.addChild(cube_r100);
        this.setRotateAngle(cube_r100, -0.1047F, -0.1745F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 39, 0, 0.0F, -0.8F, -1.8F, 1, 1, 2, -0.2F, true));

        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(-0.9F, 0.0838F, -2.3755F);
        this.head.addChild(cube_r101);
        this.setRotateAngle(cube_r101, -0.0887F, -0.1826F, 0.0162F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 32, 20, -0.4F, -0.3159F, -1.878F, 1, 1, 3, -0.35F, true));
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 32, 15, -0.4F, -0.5159F, -1.878F, 1, 1, 3, -0.299F, true));

        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(0.5F, 0.4662F, -0.8304F);
        this.head.addChild(cube_r102);
        this.setRotateAngle(cube_r102, -0.1047F, 0.1745F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 39, 0, -1.0F, -0.8F, -1.8F, 1, 1, 2, -0.2F, false));

        this.cube_r103 = new ModelRenderer(this);
        this.cube_r103.setRotationPoint(-0.1F, 0.0838F, -2.3755F);
        this.head.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.1032F, 0.1826F, -0.0162F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 39, 4, -0.6F, -0.8159F, -1.578F, 1, 1, 2, -0.3F, false));

        this.cube_r104 = new ModelRenderer(this);
        this.cube_r104.setRotationPoint(-0.1F, 0.0838F, -2.3755F);
        this.head.addChild(cube_r104);
        this.setRotateAngle(cube_r104, -0.0887F, 0.1826F, -0.0162F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 32, 20, -0.6F, -0.3159F, -1.878F, 1, 1, 3, -0.35F, false));
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 32, 15, -0.6F, -0.5159F, -1.878F, 1, 1, 3, -0.299F, false));

        this.cube_r105 = new ModelRenderer(this);
        this.cube_r105.setRotationPoint(-0.5F, 0.1343F, -4.0563F);
        this.head.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.0F, 0.0F, 0.0F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 14, 42, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.354F, false));

        this.cube_r106 = new ModelRenderer(this);
        this.cube_r106.setRotationPoint(0.0F, -0.1162F, -4.7755F);
        this.head.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.0698F, 0.0F, 0.0F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 38, 38, -1.0F, -0.4F, -0.3F, 1, 1, 2, -0.3F, false));

        this.cube_r107 = new ModelRenderer(this);
        this.cube_r107.setRotationPoint(-0.3F, -0.2677F, -1.5285F);
        this.head.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.1573F, 0.1221F, 0.0043F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 0, 42, -0.4F, -0.5F, -1.0F, 1, 1, 2, -0.2F, false));

        this.cube_r108 = new ModelRenderer(this);
        this.cube_r108.setRotationPoint(-0.5F, -0.5436F, -2.4618F);
        this.head.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.3226F, 0.213F, 0.0F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 41, 15, -0.5F, -0.2264F, -0.1482F, 1, 1, 2, -0.2F, false));

        this.cube_r109 = new ModelRenderer(this);
        this.cube_r109.setRotationPoint(-0.5F, -1.0837F, -0.3639F);
        this.head.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.0087F, 0.0F, 0.0F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 41, 51, -0.5F, -0.1493F, -0.7504F, 1, 1, 1, -0.148F, false));

        this.cube_r110 = new ModelRenderer(this);
        this.cube_r110.setRotationPoint(0.2F, -0.7296F, -0.4108F);
        this.head.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.009F, 0.2443F, 0.0F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 21, 49, -0.7F, -0.5026F, -0.8F, 1, 1, 1, -0.15F, false));

        this.cube_r111 = new ModelRenderer(this);
        this.cube_r111.setRotationPoint(-0.5F, -0.0331F, -0.3047F);
        this.head.addChild(cube_r111);
        this.setRotateAngle(cube_r111, -0.3229F, 0.0F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 44, 32, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.156F, false));

        this.cube_r112 = new ModelRenderer(this);
        this.cube_r112.setRotationPoint(-0.5F, 0.1703F, -0.7029F);
        this.head.addChild(cube_r112);
        this.setRotateAngle(cube_r112, -0.0611F, 0.0F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 44, 35, -1.0F, -0.5F, -0.2F, 2, 1, 1, -0.157F, false));

        this.cube_r113 = new ModelRenderer(this);
        this.cube_r113.setRotationPoint(-0.6F, 0.1703F, -0.7029F);
        this.head.addChild(cube_r113);
        this.setRotateAngle(cube_r113, -0.0611F, 0.0F, 0.0F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 26, 49, 0.0F, -0.5F, -0.5F, 1, 1, 1, -0.15F, false));

        this.cube_r114 = new ModelRenderer(this);
        this.cube_r114.setRotationPoint(-0.1177F, -0.1924F, -1.0575F);
        this.head.addChild(cube_r114);
        this.setRotateAngle(cube_r114, -0.1658F, 0.2094F, 0.0F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 33, 54, -0.4423F, -0.311F, -0.6451F, 1, 1, 1, -0.15F, false));

        this.cube_r115 = new ModelRenderer(this);
        this.cube_r115.setRotationPoint(0.1F, -0.0946F, -4.455F);
        this.head.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 0.0785F, 0.0F, 0.0F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 51, 30, -0.99F, -0.4791F, -0.1F, 1, 1, 1, -0.4F, false));
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 51, 27, -0.99F, -0.4791F, -0.3F, 1, 1, 1, -0.4F, false));
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 51, 3, -0.99F, -0.4791F, -0.5F, 1, 1, 1, -0.4F, false));

        this.cube_r116 = new ModelRenderer(this);
        this.cube_r116.setRotationPoint(-0.2F, -0.0288F, -2.4395F);
        this.head.addChild(cube_r116);
        this.setRotateAngle(cube_r116, -0.096F, 0.1745F, 0.0F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 46, 51, -0.41F, -0.3722F, -1.3126F, 1, 1, 1, -0.4F, false));
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 50, 41, -0.48F, -0.4722F, -0.9126F, 1, 1, 1, -0.3F, false));
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 13, 50, -0.48F, -0.4722F, -0.5126F, 1, 1, 1, -0.3F, false));
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 50, 10, -0.48F, -0.4722F, -0.1126F, 1, 1, 1, -0.304F, false));

        this.cube_r117 = new ModelRenderer(this);
        this.cube_r117.setRotationPoint(-0.2F, -0.0288F, -2.4395F);
        this.head.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 0.5323F, 0.1745F, 0.0F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 51, 0, -0.48F, -0.3031F, -0.1363F, 1, 1, 1, -0.3F, false));

        this.cube_r118 = new ModelRenderer(this);
        this.cube_r118.setRotationPoint(-0.2F, -0.0288F, -2.4395F);
        this.head.addChild(cube_r118);
        this.setRotateAngle(cube_r118, 0.096F, 0.1745F, 0.0F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 50, 44, -0.48F, -0.5344F, -0.1812F, 1, 1, 1, -0.299F, false));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 50, 38, -0.48F, -0.5344F, -0.5812F, 1, 1, 1, -0.299F, false));

        this.cube_r119 = new ModelRenderer(this);
        this.cube_r119.setRotationPoint(-0.1177F, -0.1924F, -1.0575F);
        this.head.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 0.3229F, 0.2094F, 0.0F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 38, 54, -0.4423F, -0.6339F, -0.8297F, 1, 1, 1, -0.149F, false));

        this.cube_r120 = new ModelRenderer(this);
        this.cube_r120.setRotationPoint(-0.1177F, -0.1924F, -1.0575F);
        this.head.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.0611F, 0.2094F, 0.0F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 36, 51, -0.3123F, -0.5409F, -0.5909F, 1, 1, 1, -0.25F, false));
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 51, 33, -0.4123F, -0.5409F, -0.5909F, 1, 1, 1, -0.16F, false));
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 51, 53, -0.4423F, -0.7409F, -0.6909F, 1, 1, 1, -0.148F, false));

        this.cube_r121 = new ModelRenderer(this);
        this.cube_r121.setRotationPoint(-0.1177F, -0.1924F, -1.0575F);
        this.head.addChild(cube_r121);
        this.setRotateAngle(cube_r121, -0.5149F, 0.1484F, 0.0F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 8, 50, -0.4423F, -0.7413F, -0.3505F, 1, 1, 1, -0.149F, false));

        this.cube_r122 = new ModelRenderer(this);
        this.cube_r122.setRotationPoint(-0.1177F, -0.1924F, -1.0575F);
        this.head.addChild(cube_r122);
        this.setRotateAngle(cube_r122, -0.0785F, 0.1484F, 0.0F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 3, 50, -0.4423F, -0.2998F, -0.128F, 1, 1, 1, -0.146F, false));

        this.cube_r123 = new ModelRenderer(this);
        this.cube_r123.setRotationPoint(-0.6F, -1.0338F, -1.0304F);
        this.head.addChild(cube_r123);
        this.setRotateAngle(cube_r123, 0.0087F, 0.0F, 0.0F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 41, 48, 0.0F, 0.5069F, -0.1831F, 1, 1, 1, -0.149F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.6102F, -0.0107F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2094F, 0.0F, 0.0F);


        this.cube_r124 = new ModelRenderer(this);
        this.cube_r124.setRotationPoint(-1.6016F, 0.0642F, -1.8499F);
        this.jaw.addChild(cube_r124);
        this.setRotateAngle(cube_r124, 0.3316F, -0.1745F, 0.0F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 8, 53, 0.2148F, -0.3016F, -0.7753F, 1, 1, 1, -0.305F, true));

        this.cube_r125 = new ModelRenderer(this);
        this.cube_r125.setRotationPoint(-1.6016F, -0.0358F, -1.0499F);
        this.jaw.addChild(cube_r125);
        this.setRotateAngle(cube_r125, 0.1222F, -0.1745F, 0.0F);
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 23, 52, 0.0759F, -0.2984F, -1.1694F, 1, 1, 1, -0.3F, true));
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 46, 48, 0.0759F, -0.2984F, -0.7694F, 1, 1, 1, -0.3F, true));

        this.cube_r126 = new ModelRenderer(this);
        this.cube_r126.setRotationPoint(-1.3F, 0.4319F, -0.7573F);
        this.jaw.addChild(cube_r126);
        this.setRotateAngle(cube_r126, -0.0262F, -0.192F, 0.0F);
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 31, 42, -0.3F, -0.6458F, -2.966F, 1, 1, 2, -0.35F, true));
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 7, 42, -0.3F, -0.509F, -2.766F, 1, 1, 2, -0.303F, true));

        this.cube_r127 = new ModelRenderer(this);
        this.cube_r127.setRotationPoint(-1.3F, 0.4319F, -0.7573F);
        this.jaw.addChild(cube_r127);
        this.setRotateAngle(cube_r127, 0.1134F, -0.192F, 0.0F);
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 3, 53, -0.3F, -0.6635F, -1.3872F, 1, 1, 1, -0.3F, true));
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 28, 52, -0.3F, -0.6635F, -1.0872F, 1, 1, 1, -0.299F, true));
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 18, 52, -0.3F, -0.6635F, -0.6872F, 1, 1, 1, -0.3F, true));

        this.cube_r128 = new ModelRenderer(this);
        this.cube_r128.setRotationPoint(-0.6F, 0.3319F, -0.5573F);
        this.jaw.addChild(cube_r128);
        this.setRotateAngle(cube_r128, 0.1309F, 0.0F, 0.0F);
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 53, 19, -1.12F, -0.6322F, -0.8086F, 1, 1, 1, -0.4F, true));
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 53, 16, -1.12F, -0.6322F, -0.6086F, 1, 1, 1, -0.4F, true));
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 53, 19, 0.32F, -0.6322F, -0.8086F, 1, 1, 1, -0.4F, false));
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 53, 16, 0.32F, -0.6322F, -0.6086F, 1, 1, 1, -0.4F, false));

        this.cube_r129 = new ModelRenderer(this);
        this.cube_r129.setRotationPoint(-0.6F, 0.3319F, -0.3573F);
        this.jaw.addChild(cube_r129);
        this.setRotateAngle(cube_r129, 0.3229F, 0.0F, 0.0F);
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 13, 53, -1.12F, -0.6956F, -0.5983F, 1, 1, 1, -0.4F, true));
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 52, 6, -1.0F, -0.6956F, -0.6983F, 1, 1, 1, -0.3F, true));
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 13, 53, 0.32F, -0.6956F, -0.5983F, 1, 1, 1, -0.4F, false));
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 52, 6, 0.2F, -0.6956F, -0.6983F, 1, 1, 1, -0.3F, false));

        this.cube_r130 = new ModelRenderer(this);
        this.cube_r130.setRotationPoint(-0.6F, 0.1319F, 0.1427F);
        this.jaw.addChild(cube_r130);
        this.setRotateAngle(cube_r130, 0.0087F, 0.0F, 0.0F);
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 41, 23, -1.0F, -0.5F, -1.5F, 1, 1, 2, -0.299F, true));
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 41, 23, 0.2F, -0.5F, -1.5F, 1, 1, 2, -0.299F, false));

        this.cube_r131 = new ModelRenderer(this);
        this.cube_r131.setRotationPoint(-0.8F, 0.5957F, -3.2045F);
        this.jaw.addChild(cube_r131);
        this.setRotateAngle(cube_r131, -0.044F, -0.0869F, 0.0076F);
        this.cube_r131.cubeList.add(new ModelBox(cube_r131, 31, 38, -0.3F, -0.8696F, -1.6239F, 1, 1, 2, -0.35F, true));
        this.cube_r131.cubeList.add(new ModelBox(cube_r131, 14, 38, -0.3F, -0.7466F, -1.6239F, 1, 1, 2, -0.3F, true));

        this.cube_r132 = new ModelRenderer(this);
        this.cube_r132.setRotationPoint(0.6016F, 0.0642F, -1.8499F);
        this.jaw.addChild(cube_r132);
        this.setRotateAngle(cube_r132, 0.3316F, 0.1745F, 0.0F);
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 8, 53, -1.2148F, -0.3016F, -0.7753F, 1, 1, 1, -0.305F, false));

        this.cube_r133 = new ModelRenderer(this);
        this.cube_r133.setRotationPoint(0.6016F, -0.0358F, -1.0499F);
        this.jaw.addChild(cube_r133);
        this.setRotateAngle(cube_r133, 0.1222F, 0.1745F, 0.0F);
        this.cube_r133.cubeList.add(new ModelBox(cube_r133, 23, 52, -1.0759F, -0.2984F, -1.1694F, 1, 1, 1, -0.3F, false));
        this.cube_r133.cubeList.add(new ModelBox(cube_r133, 46, 48, -1.0759F, -0.2984F, -0.7694F, 1, 1, 1, -0.3F, false));

        this.cube_r134 = new ModelRenderer(this);
        this.cube_r134.setRotationPoint(0.3F, 0.4319F, -0.7573F);
        this.jaw.addChild(cube_r134);
        this.setRotateAngle(cube_r134, -0.0262F, 0.192F, 0.0F);
        this.cube_r134.cubeList.add(new ModelBox(cube_r134, 31, 42, -0.7F, -0.6458F, -2.966F, 1, 1, 2, -0.35F, false));
        this.cube_r134.cubeList.add(new ModelBox(cube_r134, 7, 42, -0.7F, -0.509F, -2.766F, 1, 1, 2, -0.303F, false));

        this.cube_r135 = new ModelRenderer(this);
        this.cube_r135.setRotationPoint(0.3F, 0.4319F, -0.7573F);
        this.jaw.addChild(cube_r135);
        this.setRotateAngle(cube_r135, 0.1134F, 0.192F, 0.0F);
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 3, 53, -0.7F, -0.6635F, -1.3872F, 1, 1, 1, -0.3F, false));
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 28, 52, -0.7F, -0.6635F, -1.0872F, 1, 1, 1, -0.299F, false));
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 18, 52, -0.7F, -0.6635F, -0.6872F, 1, 1, 1, -0.3F, false));

        this.cube_r136 = new ModelRenderer(this);
        this.cube_r136.setRotationPoint(-0.2F, 0.5957F, -3.2045F);
        this.jaw.addChild(cube_r136);
        this.setRotateAngle(cube_r136, -0.044F, 0.0869F, -0.0076F);
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 31, 38, -0.7F, -0.8696F, -1.6239F, 1, 1, 2, -0.35F, false));
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 14, 38, -0.7F, -0.7466F, -1.6239F, 1, 1, 2, -0.3F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(1.8624F, 1.837F, -3.6438F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.0873F, 0.2182F, 0.0F);


        this.cube_r137 = new ModelRenderer(this);
        this.cube_r137.setRotationPoint(0.519F, 0.4407F, 0.8045F);
        this.leftArm1.addChild(cube_r137);
        this.setRotateAngle(cube_r137, 1.0123F, 0.0F, 0.0F);
        this.cube_r137.cubeList.add(new ModelBox(cube_r137, 53, 22, -0.5F, 0.6F, -0.5F, 1, 1, 1, -0.1F, false));
        this.cube_r137.cubeList.add(new ModelBox(cube_r137, 46, 0, -0.5F, -1.1F, -0.5F, 1, 2, 1, -0.1F, false));

        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 1.0765F, 1.9591F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.2418F, -1.0329F, -0.5605F);


        this.cube_r138 = new ModelRenderer(this);
        this.cube_r138.setRotationPoint(0.0F, 0.5F, -1.7F);
        this.leftArm2.addChild(cube_r138);
        this.setRotateAngle(cube_r138, -0.2531F, 0.0F, 0.0F);
        this.cube_r138.cubeList.add(new ModelBox(cube_r138, 31, 48, 0.0F, -1.1742F, 0.6417F, 1, 2, 1, -0.2F, false));
        this.cube_r138.cubeList.add(new ModelBox(cube_r138, 48, 20, 0.0F, -1.1742F, 1.4417F, 1, 2, 1, -0.2F, false));

        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.8F, 1.4449F, -0.3698F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1745F, 0.0F, 0.0F);


        this.cube_r139 = new ModelRenderer(this);
        this.cube_r139.setRotationPoint(-1.0F, 0.0317F, 0.0718F);
        this.leftHand.addChild(cube_r139);
        this.setRotateAngle(cube_r139, -0.2356F, 0.0F, 0.0F);
        this.cube_r139.cubeList.add(new ModelBox(cube_r139, 0, 49, 1.0076F, 0.0895F, -0.4354F, 0, 3, 1, 0.0F, false));

        this.leftClaw = new ModelRenderer(this);
        this.leftClaw.setRotationPoint(-1.0F, -1.2F, -1.1F);
        this.leftHand.addChild(leftClaw);


        this.cube_r140 = new ModelRenderer(this);
        this.cube_r140.setRotationPoint(0.0F, 2.4F, 1.1F);
        this.leftClaw.addChild(cube_r140);
        this.setRotateAngle(cube_r140, -0.6021F, 0.0F, 0.0F);
        this.cube_r140.cubeList.add(new ModelBox(cube_r140, 21, 38, 0.0076F, -0.9989F, -1.2366F, 1, 4, 1, 0.0F, false));

        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-1.8624F, 1.837F, -3.6438F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.2182F, -0.2182F, 0.0F);


        this.cube_r141 = new ModelRenderer(this);
        this.cube_r141.setRotationPoint(-0.519F, 0.4407F, 0.8045F);
        this.rightArm1.addChild(cube_r141);
        this.setRotateAngle(cube_r141, 1.0123F, 0.0F, 0.0F);
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 53, 22, -0.5F, 0.6F, -0.5F, 1, 1, 1, -0.1F, true));
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 46, 0, -0.5F, -1.1F, -0.5F, 1, 2, 1, -0.1F, true));

        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 1.0765F, 1.9591F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.134F, 0.2163F, 0.0289F);


        this.cube_r142 = new ModelRenderer(this);
        this.cube_r142.setRotationPoint(0.0F, 0.5F, -1.7F);
        this.rightArm2.addChild(cube_r142);
        this.setRotateAngle(cube_r142, -0.2531F, 0.0F, 0.0F);
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 31, 48, -1.0F, -1.1742F, 0.6417F, 1, 2, 1, -0.2F, true));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 48, 20, -1.0F, -1.1742F, 1.4417F, 1, 2, 1, -0.2F, true));

        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.8F, 1.4449F, -0.3698F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.1745F, 0.0F, 0.0F);


        this.cube_r143 = new ModelRenderer(this);
        this.cube_r143.setRotationPoint(1.0F, 0.0317F, 0.0718F);
        this.rightHand.addChild(cube_r143);
        this.setRotateAngle(cube_r143, -0.2356F, 0.0F, 0.0F);
        this.cube_r143.cubeList.add(new ModelBox(cube_r143, 0, 49, -1.0076F, 0.0895F, -0.4354F, 0, 3, 1, 0.0F, true));

        this.rightClaw = new ModelRenderer(this);
        this.rightClaw.setRotationPoint(1.0F, -1.2F, -1.1F);
        this.rightHand.addChild(rightClaw);


        this.cube_r144 = new ModelRenderer(this);
        this.cube_r144.setRotationPoint(0.0F, 2.4F, 1.1F);
        this.rightClaw.addChild(cube_r144);
        this.setRotateAngle(cube_r144, -0.6021F, 0.0F, 0.0F);
        this.cube_r144.cubeList.add(new ModelBox(cube_r144, 21, 38, -1.0076F, -0.9989F, -1.2366F, 1, 4, 1, 0.0F, true));

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
