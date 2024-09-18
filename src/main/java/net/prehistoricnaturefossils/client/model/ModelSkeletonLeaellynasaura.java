package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLeaellynasaura extends ModelBase {
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
    private final ModelRenderer leftLeg;
    private final ModelRenderer Femur_r1;
    private final ModelRenderer Femur_r2;
    private final ModelRenderer Femur_r3;
    private final ModelRenderer Femur_r4;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer Metatarsals_r1;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer Pes_r1;
    private final ModelRenderer rightLeg;
    private final ModelRenderer Femur_r5;
    private final ModelRenderer Femur_r6;
    private final ModelRenderer Femur_r7;
    private final ModelRenderer Femur_r8;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer Metatarsals_r2;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer Pes_r2;
    private final ModelRenderer body;
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
    private final ModelRenderer chest;
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
    private final ModelRenderer leftArm;
    private final ModelRenderer Humerus_r1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer Radio_Ulna_r1;
    private final ModelRenderer leftArm3;
    private final ModelRenderer Manus_r1;
    private final ModelRenderer rightArm;
    private final ModelRenderer Humerus_r2;
    private final ModelRenderer rightArm2;
    private final ModelRenderer Radio_Ulna_r2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer Manus_r2;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r78;
    private final ModelRenderer head;
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
    private final ModelRenderer leftBrow;
    private final ModelRenderer cube_r104;
    private final ModelRenderer rightBrow;
    private final ModelRenderer cube_r105;
    private final ModelRenderer jaw;
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
    private final ModelRenderer tail;
    private final ModelRenderer cube_r118;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r119;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r120;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;
    private final ModelRenderer tail8;
    private final ModelRenderer tail9;

    public ModelSkeletonLeaellynasaura() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -16.3F, 0.5F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.5236F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.5F, -2.6F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1047F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 15, -0.5F, -0.4F, 1.0F, 0, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 20, -2.0F, 0.0F, 2.0F, 1, 1, 2, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 39, -3.0F, -0.2F, 1.6F, 1, 1, 4, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 39, 1.0F, -0.2F, 1.6F, 1, 1, 4, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 20, 0.0F, 0.0F, 2.0F, 1, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 37, -1.0F, 0.0F, 0.0F, 1, 1, 6, 0.004F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.2F, 0.5619F, -0.2024F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 5, -0.5F, -1.1F, -1.9F, 1, 1, 2, -0.202F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 5, 3.9F, -1.1F, -1.9F, 1, 1, 2, -0.202F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, 2.3619F, 0.9976F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.3221F, -0.0494F, -0.4684F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 0, -0.4066F, -0.5312F, -0.0503F, 1, 1, 1, -0.203F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, 2.3619F, 0.9976F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.816F, -0.0494F, -0.4684F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.4066F, -0.5467F, -0.3173F, 1, 1, 5, -0.2F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.5F, 1.0619F, 0.4976F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.1713F, 0.1685F, -0.4751F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 9, -0.2F, -0.4007F, -0.1404F, 1, 1, 2, -0.2F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.4F, 0.5619F, -1.4024F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.8639F, 0.384F, -0.0873F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 39, -0.3F, -0.2312F, 1.0637F, 1, 1, 6, -0.302F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.4F, 0.5619F, -1.4024F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.0734F, 0.384F, -0.0873F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 26, -0.3F, -0.5316F, -0.2566F, 1, 1, 2, -0.3F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.2F, 0.5619F, -0.2024F);
        this.hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5847F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 7, -0.5F, 0.0F, -2.6F, 1, 1, 2, -0.2F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 6, -0.3F, -1.6F, -1.0F, 1, 2, 2, 0.003F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 7, 3.9F, 0.0F, -2.6F, 1, 1, 2, -0.2F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 6, 3.7F, -1.6F, -1.0F, 1, 2, 2, 0.003F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.5F, -1.5F, -1.0F);
        this.hips.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1063F, 0.1736F, 0.0184F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 39, -0.2F, -0.2328F, -1.7912F, 1, 1, 2, -0.2F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(2.5F, -1.5F, -1.0F);
        this.hips.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1063F, -0.1736F, -0.0184F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 39, -0.8F, -0.2328F, -1.7912F, 1, 1, 2, -0.2F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(2.4F, 0.5619F, -1.4024F);
        this.hips.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.8639F, -0.384F, 0.0873F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 39, -0.7F, -0.2312F, 1.0637F, 1, 1, 6, -0.302F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(2.4F, 0.5619F, -1.4024F);
        this.hips.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.0734F, -0.384F, 0.0873F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 26, -0.7F, -0.5316F, -0.2566F, 1, 1, 2, -0.3F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, 2.3619F, 0.9976F);
        this.hips.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.3221F, 0.0494F, 0.4684F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 0, -0.5934F, -0.5312F, -0.0503F, 1, 1, 1, -0.203F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(1.5F, 2.3619F, 0.9976F);
        this.hips.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.816F, 0.0494F, 0.4684F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -0.5934F, -0.5467F, -0.3173F, 1, 1, 5, -0.2F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(2.5F, 1.0619F, 0.4976F);
        this.hips.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.1713F, -0.1685F, 0.4751F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 52, 9, -0.8F, -0.4007F, -0.1404F, 1, 1, 2, -0.2F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.6F, 0.2F, -0.2F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -1.1868F, 0.0F, 0.0F);


        this.Femur_r1 = new ModelRenderer(this);
        this.Femur_r1.setRotationPoint(-1.9F, -0.5954F, 0.5854F);
        this.leftLeg.addChild(Femur_r1);
        this.setRotateAngle(Femur_r1, 0.1745F, 0.0F, 0.0F);
        this.Femur_r1.cubeList.add(new ModelBox(Femur_r1, 6, 15, 1.4F, 0.9226F, -1.0063F, 1, 2, 1, -0.1F, false));

        this.Femur_r2 = new ModelRenderer(this);
        this.Femur_r2.setRotationPoint(0.0F, 5.1391F, 0.3483F);
        this.leftLeg.addChild(Femur_r2);
        this.setRotateAngle(Femur_r2, 0.5498F, 0.0F, 0.0F);
        this.Femur_r2.cubeList.add(new ModelBox(Femur_r2, 52, 0, -0.5F, -0.5F, -0.7F, 1, 1, 2, 0.0F, false));

        this.Femur_r3 = new ModelRenderer(this);
        this.Femur_r3.setRotationPoint(0.0F, 2.3272F, -0.6209F);
        this.leftLeg.addChild(Femur_r3);
        this.setRotateAngle(Femur_r3, 0.0873F, 0.0F, 0.0F);
        this.Femur_r3.cubeList.add(new ModelBox(Femur_r3, 8, 7, -0.5F, -0.0711F, 0.0174F, 1, 3, 1, 0.003F, false));

        this.Femur_r4 = new ModelRenderer(this);
        this.Femur_r4.setRotationPoint(0.0F, -0.3728F, 0.0791F);
        this.leftLeg.addChild(Femur_r4);
        this.setRotateAngle(Femur_r4, -0.1396F, 0.0F, 0.0F);
        this.Femur_r4.cubeList.add(new ModelBox(Femur_r4, 0, 7, -0.5F, -0.3F, -0.3F, 1, 3, 1, 0.0F, false));

        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.1046F, 0.4854F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.3614F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 47, 0.2F, -0.1466F, -0.2783F, 1, 8, 1, -0.21F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 38, 47, -0.9F, -0.1466F, -0.3783F, 1, 8, 1, 0.0F, false));

        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 8.5229F, -0.0954F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.4363F, 0.0F, 0.0F);


        this.Metatarsals_r1 = new ModelRenderer(this);
        this.Metatarsals_r1.setRotationPoint(-2.5F, -15.7F, 0.2F);
        this.leftLeg3.addChild(Metatarsals_r1);
        this.setRotateAngle(Metatarsals_r1, -0.8727F, 0.0F, 0.0F);
        this.Metatarsals_r1.cubeList.add(new ModelBox(Metatarsals_r1, 28, 14, 1.5F, 10.0767F, 11.2776F, 2, 4, 1, -0.002F, false));

        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.1F, 2.5F, -2.8F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.3316F, 0.0F, 0.0F);


        this.Pes_r1 = new ModelRenderer(this);
        this.Pes_r1.setRotationPoint(-2.4F, -18.7F, 3.6F);
        this.leftLeg4.addChild(Pes_r1);
        this.setRotateAngle(Pes_r1, -0.576F, 0.0F, 0.0F);
        this.Pes_r1.cubeList.add(new ModelBox(Pes_r1, 32, 32, 1.0F, 17.4186F, 2.6358F, 3, 1, 5, 0.0F, false));

        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.6F, 0.2F, -0.2F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -1.405F, 0.0F, 0.0F);


        this.Femur_r5 = new ModelRenderer(this);
        this.Femur_r5.setRotationPoint(1.9F, -0.5954F, 0.5854F);
        this.rightLeg.addChild(Femur_r5);
        this.setRotateAngle(Femur_r5, 0.1745F, 0.0F, 0.0F);
        this.Femur_r5.cubeList.add(new ModelBox(Femur_r5, 0, 15, -2.4F, 0.9226F, -1.0063F, 1, 2, 1, -0.1F, false));

        this.Femur_r6 = new ModelRenderer(this);
        this.Femur_r6.setRotationPoint(0.0F, 5.1391F, 0.3483F);
        this.rightLeg.addChild(Femur_r6);
        this.setRotateAngle(Femur_r6, 0.5498F, 0.0F, 0.0F);
        this.Femur_r6.cubeList.add(new ModelBox(Femur_r6, 51, 27, -0.5F, -0.5F, -0.7F, 1, 1, 2, 0.0F, false));

        this.Femur_r7 = new ModelRenderer(this);
        this.Femur_r7.setRotationPoint(0.0F, 2.3272F, -0.6209F);
        this.rightLeg.addChild(Femur_r7);
        this.setRotateAngle(Femur_r7, 0.0873F, 0.0F, 0.0F);
        this.Femur_r7.cubeList.add(new ModelBox(Femur_r7, 8, 0, -0.5F, -0.0711F, 0.0174F, 1, 3, 1, 0.003F, false));

        this.Femur_r8 = new ModelRenderer(this);
        this.Femur_r8.setRotationPoint(0.0F, -0.3728F, 0.0791F);
        this.rightLeg.addChild(Femur_r8);
        this.setRotateAngle(Femur_r8, -0.1396F, 0.0F, 0.0F);
        this.Femur_r8.cubeList.add(new ModelBox(Femur_r8, 0, 0, -0.5F, -0.3F, -0.3F, 1, 3, 1, 0.0F, false));

        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.1046F, 0.4854F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.3177F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 33, 45, -1.2F, -0.1466F, -0.2783F, 1, 8, 1, -0.21F, false));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 5, 47, -0.1F, -0.1466F, -0.3783F, 1, 8, 1, 0.0F, false));

        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.5229F, -0.0954F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.2182F, 0.0F, 0.0F);


        this.Metatarsals_r2 = new ModelRenderer(this);
        this.Metatarsals_r2.setRotationPoint(2.5F, -15.7F, 0.2F);
        this.rightLeg3.addChild(Metatarsals_r2);
        this.setRotateAngle(Metatarsals_r2, -0.8727F, 0.0F, 0.0F);
        this.Metatarsals_r2.cubeList.add(new ModelBox(Metatarsals_r2, 0, 28, -3.5F, 10.0767F, 11.2776F, 2, 4, 1, -0.002F, false));

        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.1F, 2.5F, -2.8F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3752F, 0.0F, 0.0F);


        this.Pes_r2 = new ModelRenderer(this);
        this.Pes_r2.setRotationPoint(2.4F, -18.7F, 3.6F);
        this.rightLeg4.addChild(Pes_r2);
        this.setRotateAngle(Pes_r2, -0.576F, 0.0F, 0.0F);
        this.Pes_r2.cubeList.add(new ModelBox(Pes_r2, 28, 0, -4.0F, 17.4186F, 2.6358F, 3, 1, 5, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.9F, -2.6F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 12, 28, -0.5F, -0.6F, -4.0F, 1, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 25, 58, 0.0F, -1.1F, -3.0F, 0, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 58, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -0.6F, -5.0F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0175F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 58, -0.5F, -0.4477F, -0.0023F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -0.6F, -4.4F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 31, 58, -0.5F, -0.5F, -2.6F, 0, 1, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 41, -1.0F, 0.0F, -3.6F, 1, 1, 4, 0.004F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.0F, -6.5F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1283F, 0.3066F, -1.167F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 24, -5.5679F, -1.1815F, -0.5F, 4, 0, 1, 0.0F, true));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.0F, -6.5F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2505F, 0.2196F, -0.7053F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 45, 41, -1.9272F, -0.3746F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.0F, -6.5F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3129F, 0.1116F, -0.3314F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 47, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -0.1F, -4.5F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2467F, 0.0886F, -0.4428F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 47, 11, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -0.1F, -4.5F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1F, 0.2423F, -1.2794F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 7, -3.5679F, -1.1815F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, -0.1F, -4.5F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1966F, 0.1741F, -0.8206F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 56, 4, -1.9272F, -0.3746F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -0.1F, -0.5F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0324F, -0.0292F, -1.2038F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 56, 23, -1.9272F, -0.3746F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -0.1F, -0.5F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.041F, -0.0149F, -0.82F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 57, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -0.1F, -2.5F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0328F, 0.0809F, -1.4473F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 57, 9, -2.5679F, -1.1815F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, -0.1F, -2.5F);
        this.body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0649F, 0.0584F, -0.9929F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 57, 34, -1.9272F, -0.3746F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -0.1F, -2.5F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.082F, 0.0298F, -0.6096F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 39, 57, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, -0.1F, -0.5F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.041F, 0.0149F, 0.82F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 57, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, -0.1F, -0.5F);
        this.body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0324F, 0.0292F, 1.2038F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 56, 23, 0.9272F, -0.3746F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 0.0F, -6.5F);
        this.body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3129F, -0.1116F, 0.3314F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 10, 47, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, 0.0F, -6.5F);
        this.body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2505F, -0.2196F, 0.7053F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 45, 41, 0.9272F, -0.3746F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 0.0F, -6.5F);
        this.body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1283F, -0.3066F, 1.167F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 24, 1.5679F, -1.1815F, -0.5F, 4, 0, 1, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, -0.1F, -4.5F);
        this.body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1966F, -0.1741F, 0.8206F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 56, 4, 0.9272F, -0.3746F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, -0.1F, -4.5F);
        this.body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1F, -0.2423F, 1.2794F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 28, 7, 1.5679F, -1.1815F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, -0.1F, -4.5F);
        this.body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.2467F, -0.0886F, 0.4428F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 47, 11, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, -0.1F, -2.5F);
        this.body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0328F, -0.0809F, 1.4473F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 57, 9, 1.5679F, -1.1815F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, -0.1F, -2.5F);
        this.body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0649F, -0.0584F, 0.9929F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 57, 34, 0.9272F, -0.3746F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, -0.1F, -2.5F);
        this.body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.082F, -0.0298F, 0.6096F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 39, 57, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.2F, -7.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.0873F, 0.0F);


        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.5F, 1.8F, -3.7F);
        this.chest.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3142F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 58, 51, -0.5F, -1.5516F, 3.1228F, 0, 1, 1, 0.0F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 59, 6, -0.5F, -1.4516F, 1.1228F, 0, 1, 1, 0.0F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 44, 28, -1.0F, -1.0516F, 0.1228F, 1, 1, 4, 0.0F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 5.2826F, -1.9724F);
        this.chest.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.3622F, -0.6852F, 0.366F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 7, -0.5F, 0.0374F, 0.0923F, 1, 0, 5, 0.0F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 5.2826F, -1.9724F);
        this.chest.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.6525F, -0.9616F, 0.6459F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 38, 15, -0.5F, 0.0374F, -0.4077F, 1, 0, 4, 0.0F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 5.2826F, -1.9724F);
        this.chest.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.8476F, -1.1688F, 0.9845F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 28, 32, -0.5F, 0.0374F, -0.1077F, 1, 0, 2, 0.0F, true));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-3.1F, 4.1194F, -3.2516F);
        this.chest.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 1.1804F, -0.4825F, -0.8452F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 46, 20, 0.0F, -0.739F, -1.9843F, 1, 2, 2, 0.0F, true));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-2.6F, 2.3194F, -2.3516F);
        this.chest.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.9599F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 52, 34, -0.5F, -0.0438F, -1.975F, 1, 1, 2, 0.0F, true));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-2.6F, 1.6194F, -1.8516F);
        this.chest.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.6632F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 16, 0, -0.5F, 0.2F, -0.8F, 1, 1, 3, 0.004F, true));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, 0.8F, -2.3F);
        this.chest.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1807F, 0.4186F, -1.2705F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 22, -5.5679F, -1.1815F, -0.5F, 4, 0, 1, 0.0F, true));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.5F, 0.8F, -2.3F);
        this.chest.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.3477F, 0.2977F, -0.8025F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 38, 39, -1.9272F, -0.3746F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.5F, 0.8F, -2.3F);
        this.chest.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.4298F, 0.1505F, -0.4383F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 16, 41, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.5F, 0.2F, -0.4F);
        this.chest.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.3629F, 0.1285F, -0.3953F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 9, 43, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.5F, 0.2F, -0.4F);
        this.chest.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.2917F, 0.2534F, -0.7654F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 45, 15, -1.9272F, -0.3746F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(-0.5F, 0.2F, -0.4F);
        this.chest.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.1502F, 0.3547F, -1.2297F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 16, 11, -6.5679F, -1.1815F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.5F, 0.8F, -2.3F);
        this.chest.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.4298F, -0.1505F, 0.4383F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 16, 41, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.5F, 0.8F, -2.3F);
        this.chest.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.3477F, -0.2977F, 0.8025F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 38, 39, 0.9272F, -0.3746F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(0.5F, 0.8F, -2.3F);
        this.chest.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.1807F, -0.4186F, 1.2705F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 22, 1.5679F, -1.1815F, -0.5F, 4, 0, 1, 0.0F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.5F, 0.2F, -0.4F);
        this.chest.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.3629F, -0.1285F, 0.3953F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 9, 43, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(0.5F, 0.2F, -0.4F);
        this.chest.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.2917F, -0.2534F, 0.7654F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 45, 15, 0.9272F, -0.3746F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(0.5F, 0.2F, -0.4F);
        this.chest.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.1502F, -0.3547F, 1.2297F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 16, 11, 1.5679F, -1.1815F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(3.1F, 4.1194F, -3.2516F);
        this.chest.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 1.1804F, 0.4825F, 0.8452F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 46, 20, -1.0F, -0.739F, -1.9843F, 1, 2, 2, 0.0F, false));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(2.6F, 2.3194F, -2.3516F);
        this.chest.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.9599F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 52, 34, -0.5F, -0.0438F, -1.975F, 1, 1, 2, 0.0F, false));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(2.6F, 1.6194F, -1.8516F);
        this.chest.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.6632F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 16, 0, -0.5F, 0.2F, -0.8F, 1, 1, 3, 0.004F, false));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 5.2826F, -1.9724F);
        this.chest.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.3622F, 0.6852F, -0.366F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 0, 7, -0.5F, 0.0374F, 0.0923F, 1, 0, 5, 0.0F, false));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0F, 5.2826F, -1.9724F);
        this.chest.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.6525F, 0.9616F, -0.6459F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 38, 15, -0.5F, 0.0374F, -0.4077F, 1, 0, 4, 0.0F, false));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(0.0F, 5.2826F, -1.9724F);
        this.chest.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.8476F, 1.1688F, -0.9845F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 28, 32, -0.5F, 0.0374F, -0.1077F, 1, 0, 2, 0.0F, false));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, 4.4236F, -0.6155F);
        this.chest.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.3403F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 14, 15, -0.5F, 0.8F, -3.1F, 1, 1, 3, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(3.0F, 4.6011F, -2.2655F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.577F, 0.4826F, -0.3713F);


        this.Humerus_r1 = new ModelRenderer(this);
        this.Humerus_r1.setRotationPoint(-0.5F, -0.4F, -0.5F);
        this.leftArm.addChild(Humerus_r1);
        this.setRotateAngle(Humerus_r1, -0.7418F, 0.0F, 0.0F);
        this.Humerus_r1.cubeList.add(new ModelBox(Humerus_r1, 39, 22, 0.0F, -0.3F, 0.3F, 1, 1, 4, 0.003F, false));

        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.1F, 2.7F, 2.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.1309F, 0.0F, 0.0F);


        this.Radio_Ulna_r1 = new ModelRenderer(this);
        this.Radio_Ulna_r1.setRotationPoint(-0.4F, 0.1F, 0.8F);
        this.leftArm2.addChild(Radio_Ulna_r1);
        this.setRotateAngle(Radio_Ulna_r1, 0.8378F, 0.0F, 0.0F);
        this.Radio_Ulna_r1.cubeList.add(new ModelBox(Radio_Ulna_r1, 45, 35, 0.0F, -1.6662F, -3.8486F, 1, 1, 4, -0.15F, false));
        this.Radio_Ulna_r1.cubeList.add(new ModelBox(Radio_Ulna_r1, 45, 43, 0.0F, -0.6662F, -3.8486F, 1, 1, 4, -0.1F, false));

        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.6F, 2.5F, -2.3F);
        this.leftArm2.addChild(leftArm3);


        this.Manus_r1 = new ModelRenderer(this);
        this.Manus_r1.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.leftArm3.addChild(Manus_r1);
        this.setRotateAngle(Manus_r1, 0.8574F, 0.1855F, 0.21F);
        this.Manus_r1.cubeList.add(new ModelBox(Manus_r1, 43, 49, -1.1F, -1.5083F, -1.8051F, 1, 2, 2, -0.002F, false));

        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-3.0F, 4.6011F, -2.2655F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.5392F, -0.3865F, 0.2675F);


        this.Humerus_r2 = new ModelRenderer(this);
        this.Humerus_r2.setRotationPoint(0.5F, -0.4F, -0.5F);
        this.rightArm.addChild(Humerus_r2);
        this.setRotateAngle(Humerus_r2, -0.7418F, 0.0F, 0.0F);
        this.Humerus_r2.cubeList.add(new ModelBox(Humerus_r2, 24, 37, -1.0F, -0.3F, 0.3F, 1, 1, 4, 0.003F, false));

        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.1F, 2.7F, 2.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.1745F, 0.0F, 0.0F);


        this.Radio_Ulna_r2 = new ModelRenderer(this);
        this.Radio_Ulna_r2.setRotationPoint(0.4F, 0.1F, 0.8F);
        this.rightArm2.addChild(Radio_Ulna_r2);
        this.setRotateAngle(Radio_Ulna_r2, 0.8378F, 0.0F, 0.0F);
        this.Radio_Ulna_r2.cubeList.add(new ModelBox(Radio_Ulna_r2, 11, 45, -1.0F, -1.6662F, -3.8486F, 1, 1, 4, -0.15F, false));
        this.Radio_Ulna_r2.cubeList.add(new ModelBox(Radio_Ulna_r2, 22, 45, -1.0F, -0.6662F, -3.8486F, 1, 1, 4, -0.1F, false));

        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.6F, 2.5F, -2.3F);
        this.rightArm2.addChild(rightArm3);


        this.Manus_r2 = new ModelRenderer(this);
        this.Manus_r2.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.rightArm3.addChild(Manus_r2);
        this.setRotateAngle(Manus_r2, 0.8574F, -0.1855F, -0.21F);
        this.Manus_r2.cubeList.add(new ModelBox(Manus_r2, 49, 15, 0.1F, -1.5083F, -1.8051F, 1, 2, 2, -0.002F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.3F, -3.7F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, -0.3491F, 0.0F, 0.0F);


        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.5F, 0.6F, -1.9F);
        this.neck3.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0698F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 59, 11, -0.5F, -1.3F, 1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 40, 0, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.004F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.5F, 0.0F, -0.4F);
        this.neck3.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.4662F, 0.3539F, -0.5483F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 28, 3, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(-0.5F, 0.0F, -0.4F);
        this.neck3.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.3021F, 0.4998F, -0.9395F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 38, 11, -1.9272F, -0.3746F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.5F, 0.0F, -0.4F);
        this.neck3.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0293F, 0.5767F, -1.4622F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 26, 22, -4.5679F, -1.1815F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(0.5F, 0.0F, -0.4F);
        this.neck3.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.0293F, -0.5767F, 1.4622F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 26, 22, 1.5679F, -1.1815F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.5F, 0.0F, -0.4F);
        this.neck3.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.3021F, -0.4998F, 0.9395F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 38, 11, 0.9272F, -0.3746F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(0.5F, 0.0F, -0.4F);
        this.neck3.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.4662F, -0.3539F, 0.5483F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 28, 3, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1F, -1.8F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.4539F, 0.1347F, 0.0787F);


        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(0.5F, -2.6F, -2.8F);
        this.neck2.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -0.6109F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 59, 29, -0.5F, -0.4F, 3.0F, 0, 1, 1, 0.0F, false));
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 38, 59, -0.5F, -0.3F, 1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 45, 0, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(-0.5F, -1.3F, -2.4F);
        this.neck2.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.2476F, 0.6899F, -1.2133F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 14, 39, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(-0.5F, -0.2F, -0.5F);
        this.neck2.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.4305F, 0.7034F, -0.9762F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 39, 28, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(0.5F, -1.3F, -2.4F);
        this.neck2.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.2476F, -0.6899F, 1.2133F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 14, 39, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(0.5F, -0.2F, -0.5F);
        this.neck2.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.4305F, -0.7034F, 0.9762F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 39, 28, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.3F, -2.8F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.5958F, 0.2926F, -0.1931F);


        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.neck.addChild(cube_r78);
        this.setRotateAngle(cube_r78, -0.0524F, 0.0F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 41, 59, 0.0F, -1.0F, -1.2F, 0, 1, 1, 0.0F, false));
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 18, 45, -0.5F, -0.5F, -2.2F, 1, 1, 2, 0.004F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.3F, -2.1F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2714F, 0.3154F, 0.01F);


        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(-0.3F, -0.043F, -0.3427F);
        this.head.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -1.7628F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 56, 38, -0.91F, -0.4F, -0.8F, 1, 1, 1, -0.2F, true));
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 56, 16, -0.91F, -0.4F, -0.2F, 1, 1, 1, -0.2F, true));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(-1.0F, 0.1092F, -0.9361F);
        this.head.addChild(cube_r80);
        this.setRotateAngle(cube_r80, -1.5166F, -0.2614F, -0.014F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 47, 56, -0.12F, -0.1005F, -0.6209F, 1, 1, 1, -0.1F, true));
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 54, 53, -0.28F, -0.1005F, -0.6209F, 1, 1, 1, -0.25F, true));
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 19, 28, -0.39F, -0.1005F, -0.6209F, 1, 1, 1, -0.35F, true));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(0.3F, -0.043F, -0.3427F);
        this.head.addChild(cube_r81);
        this.setRotateAngle(cube_r81, -1.7628F, 0.0F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 56, 16, -0.09F, -0.4F, -0.2F, 1, 1, 1, -0.2F, false));
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 56, 38, -0.09F, -0.4F, -0.8F, 1, 1, 1, -0.2F, false));

        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.head.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.0175F, 0.0F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 34, 57, -0.8F, -1.0F, -2.0F, 1, 1, 1, -0.003F, true));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(-0.3F, 0.5344F, -3.7171F);
        this.head.addChild(cube_r83);
        this.setRotateAngle(cube_r83, -1.0472F, 0.0F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 55, 31, -0.41F, -0.4F, -0.4F, 1, 1, 1, -0.3F, true));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(-0.6F, 0.7F, -1.8F);
        this.head.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.192F, 0.0F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 24, 51, 0.0F, -0.8998F, -1.8973F, 1, 1, 2, -0.099F, true));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(-0.3F, 0.1092F, -1.3361F);
        this.head.addChild(cube_r85);
        this.setRotateAngle(cube_r85, -1.5184F, 0.0F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 55, 48, -0.51F, 0.4F, -0.2F, 1, 1, 1, -0.3F, true));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(0.0F, -0.7F, -1.2F);
        this.head.addChild(cube_r86);
        this.setRotateAngle(cube_r86, -1.1345F, 0.0F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 57, 26, -0.8F, -0.0347F, -0.0241F, 1, 1, 1, 0.004F, true));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(-0.6F, 0.2F, -3.7F);
        this.head.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.3316F, 0.0F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 51, 23, 0.0F, -0.0465F, -0.1276F, 1, 1, 2, -0.104F, true));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(0.3F, 0.5344F, -3.7171F);
        this.head.addChild(cube_r88);
        this.setRotateAngle(cube_r88, -1.0472F, 0.0F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 55, 31, -0.59F, -0.4F, -0.4F, 1, 1, 1, -0.3F, false));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(0.3F, 0.1092F, -1.3361F);
        this.head.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -1.5184F, 0.0F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 55, 48, -0.49F, 0.4F, -0.2F, 1, 1, 1, -0.3F, false));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(1.0F, 0.1092F, -0.9361F);
        this.head.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -1.5166F, 0.2614F, 0.014F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 19, 28, -0.61F, -0.1005F, -0.6209F, 1, 1, 1, -0.35F, false));
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 54, 53, -0.72F, -0.1005F, -0.6209F, 1, 1, 1, -0.25F, false));
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 47, 56, -0.88F, -0.1005F, -0.6209F, 1, 1, 1, -0.1F, false));

        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(0.0F, -0.7F, -1.2F);
        this.head.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -1.1345F, 0.0F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 57, 26, -0.2F, -0.0347F, -0.0241F, 1, 1, 1, -0.004F, false));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(0.0F, -1.2F, 0.5F);
        this.head.addChild(cube_r92);
        this.setRotateAngle(cube_r92, -1.3265F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 30, 55, -1.0F, -0.1633F, -0.13F, 1, 1, 1, -0.1F, true));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(0.0F, -1.0F, -0.2F);
        this.head.addChild(cube_r93);
        this.setRotateAngle(cube_r93, -1.2566F, 0.0F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 25, 55, -1.0F, -0.0909F, -0.16F, 1, 1, 1, -0.1F, true));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(0.0F, -1.0F, -0.2F);
        this.head.addChild(cube_r94);
        this.setRotateAngle(cube_r94, -1.2566F, 0.0F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 25, 55, 0.0F, -0.0909F, -0.16F, 1, 1, 1, -0.1F, false));
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 52, 41, -1.0F, 0.0091F, -0.0478F, 2, 1, 1, 0.005F, false));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(0.0F, -1.2F, 0.5F);
        this.head.addChild(cube_r95);
        this.setRotateAngle(cube_r95, -1.3265F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 30, 55, 0.0F, -0.1633F, -0.13F, 1, 1, 1, -0.1F, false));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 52, 44, -1.0F, -0.2633F, -0.0231F, 2, 1, 1, 0.0F, false));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(0.5F, 0.7F, -4.3F);
        this.head.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 1.7628F, 0.0F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 0, 57, -1.0F, -0.1128F, -0.9085F, 1, 1, 1, -0.1F, false));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(0.5F, 0.2F, -3.7F);
        this.head.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.6283F, 0.0F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 5, 57, -1.0F, -0.0465F, -0.9276F, 1, 1, 1, -0.104F, false));

        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(0.6F, 0.2F, -3.7F);
        this.head.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.3316F, 0.0F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 51, 23, -1.0F, -0.0465F, -0.1276F, 1, 1, 2, -0.1F, false));

        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(0.7F, 0.7F, -1.8F);
        this.head.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.0698F, 0.0F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 17, 51, -1.2F, -0.5998F, -1.6973F, 1, 1, 2, -0.15F, false));

        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(0.6F, 0.7F, -1.8F);
        this.head.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.192F, 0.0F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 24, 51, -1.0F, -0.8998F, -1.8973F, 1, 1, 2, -0.099F, false));

        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.head.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.0175F, 0.0F, 0.0F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 0, 34, -1.0F, -1.0F, -1.0F, 2, 1, 1, -0.004F, false));
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 34, 57, -0.2F, -1.0F, -2.0F, 1, 1, 1, -0.003F, false));

        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.head.addChild(cube_r102);
        this.setRotateAngle(cube_r102, -0.0873F, 0.0F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 52, 56, 0.3F, -0.3F, -0.7F, 1, 1, 1, -0.302F, false));

        this.cube_r103 = new ModelRenderer(this);
        this.cube_r103.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.head.addChild(cube_r103);
        this.setRotateAngle(cube_r103, -0.192F, 0.0F, 0.0F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 53, 20, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.leftBrow = new ModelRenderer(this);
        this.leftBrow.setRotationPoint(0.8F, -0.3F, -2.1F);
        this.head.addChild(leftBrow);
        this.setRotateAngle(leftBrow, 0.0F, 0.0698F, 0.0F);


        this.cube_r104 = new ModelRenderer(this);
        this.cube_r104.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftBrow.addChild(cube_r104);
        this.setRotateAngle(cube_r104, -1.0956F, 0.3931F, 0.1946F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 20, 55, -0.6F, -0.6194F, -0.3063F, 1, 1, 1, -0.4F, false));
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 15, 55, -0.6F, -0.8194F, -0.3063F, 1, 1, 1, -0.4F, false));
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 10, 55, -0.6F, -1.0194F, -0.3063F, 1, 1, 1, -0.4F, false));

        this.rightBrow = new ModelRenderer(this);
        this.rightBrow.setRotationPoint(-0.8F, -0.3F, -2.1F);
        this.head.addChild(rightBrow);
        this.setRotateAngle(rightBrow, 0.0F, -0.0698F, 0.0F);


        this.cube_r105 = new ModelRenderer(this);
        this.cube_r105.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightBrow.addChild(cube_r105);
        this.setRotateAngle(cube_r105, -1.0956F, -0.3931F, -0.1946F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 20, 55, -0.4F, -0.6194F, -0.3063F, 1, 1, 1, -0.4F, true));
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 15, 55, -0.4F, -0.8194F, -0.3063F, 1, 1, 1, -0.4F, true));
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 10, 55, -0.4F, -1.0194F, -0.3063F, 1, 1, 1, -0.4F, true));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.2F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.9163F, 0.0F, 0.0F);


        this.cube_r106 = new ModelRenderer(this);
        this.cube_r106.setRotationPoint(-0.4F, 0.2F, -2.6F);
        this.jaw.addChild(cube_r106);
        this.setRotateAngle(cube_r106, -0.2269F, 0.0F, 0.0F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 0, 42, -0.3F, -0.7954F, -1.8123F, 1, 1, 1, -0.2F, false));

        this.cube_r107 = new ModelRenderer(this);
        this.cube_r107.setRotationPoint(0.1F, 0.2F, -2.6F);
        this.jaw.addChild(cube_r107);
        this.setRotateAngle(cube_r107, -0.2269F, 0.0F, 0.0F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 0, 39, -0.99F, -0.7954F, -1.2123F, 1, 1, 1, -0.199F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 54, 13, -0.99F, -0.7954F, -0.8123F, 1, 1, 1, -0.203F, true));

        this.cube_r108 = new ModelRenderer(this);
        this.cube_r108.setRotationPoint(-0.2F, -0.3F, -1.5F);
        this.jaw.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.6807F, 0.0F, 0.0F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 54, 6, -0.99F, -0.1015F, -0.1645F, 1, 1, 1, -0.199F, true));

        this.cube_r109 = new ModelRenderer(this);
        this.cube_r109.setRotationPoint(0.0F, 0.3F, -1.0F);
        this.jaw.addChild(cube_r109);
        this.setRotateAngle(cube_r109, -0.0873F, 0.0F, 0.0F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 50, 49, -0.79F, -0.9556F, -2.3149F, 1, 1, 2, -0.2F, true));

        this.cube_r110 = new ModelRenderer(this);
        this.cube_r110.setRotationPoint(0.1F, 0.3F, -1.0F);
        this.jaw.addChild(cube_r110);
        this.setRotateAngle(cube_r110, -0.0873F, 0.0F, 0.0F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 44, 34, -0.99F, -0.7556F, -1.4149F, 1, 1, 1, -0.203F, true));
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 49, 53, -0.99F, -0.7556F, -1.8149F, 1, 1, 1, -0.196F, true));

        this.cube_r111 = new ModelRenderer(this);
        this.cube_r111.setRotationPoint(-0.2F, 0.3F, -1.0F);
        this.jaw.addChild(cube_r111);
        this.setRotateAngle(cube_r111, -0.0873F, 0.0F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 43, 54, -0.99F, -0.7556F, -0.8149F, 1, 1, 1, -0.2F, true));

        this.cube_r112 = new ModelRenderer(this);
        this.cube_r112.setRotationPoint(-0.4F, -0.1F, 0.6F);
        this.jaw.addChild(cube_r112);
        this.setRotateAngle(cube_r112, -0.0349F, 0.0F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 10, 51, -0.99F, -0.3F, -1.8F, 1, 1, 2, -0.2F, true));
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 10, 51, 0.39F, -0.3F, -1.8F, 1, 1, 2, -0.2F, false));

        this.cube_r113 = new ModelRenderer(this);
        this.cube_r113.setRotationPoint(-0.5F, 0.2F, -2.6F);
        this.jaw.addChild(cube_r113);
        this.setRotateAngle(cube_r113, -0.2269F, 0.0F, 0.0F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 0, 39, -0.01F, -0.7954F, -1.2123F, 1, 1, 1, -0.195F, false));
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 54, 13, -0.01F, -0.7954F, -0.8123F, 1, 1, 1, -0.2F, false));

        this.cube_r114 = new ModelRenderer(this);
        this.cube_r114.setRotationPoint(-0.2F, -0.3F, -1.5F);
        this.jaw.addChild(cube_r114);
        this.setRotateAngle(cube_r114, 0.6807F, 0.0F, 0.0F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 54, 6, -0.01F, -0.1015F, -0.1645F, 1, 1, 1, -0.199F, false));

        this.cube_r115 = new ModelRenderer(this);
        this.cube_r115.setRotationPoint(-0.4F, 0.3F, -1.0F);
        this.jaw.addChild(cube_r115);
        this.setRotateAngle(cube_r115, -0.0873F, 0.0F, 0.0F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 50, 49, -0.21F, -0.9556F, -2.3149F, 1, 1, 2, -0.2F, false));

        this.cube_r116 = new ModelRenderer(this);
        this.cube_r116.setRotationPoint(-0.5F, 0.3F, -1.0F);
        this.jaw.addChild(cube_r116);
        this.setRotateAngle(cube_r116, -0.0873F, 0.0F, 0.0F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 44, 34, -0.01F, -0.7556F, -1.4149F, 1, 1, 1, -0.2F, false));
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 49, 53, -0.01F, -0.7556F, -1.8149F, 1, 1, 1, -0.199F, false));

        this.cube_r117 = new ModelRenderer(this);
        this.cube_r117.setRotationPoint(-0.2F, 0.3F, -1.0F);
        this.jaw.addChild(cube_r117);
        this.setRotateAngle(cube_r117, -0.0873F, 0.0F, 0.0F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 43, 54, -0.01F, -0.7556F, -0.8149F, 1, 1, 1, -0.2F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4F, 3.3F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 38, 7, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 19, 58, 0.0F, -0.9F, 1.0F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 16, 58, 0.0F, -0.8F, 3.0F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 13, 58, 0.0F, -0.8F, 5.0F, 0, 1, 1, 0.0F, false));

        this.cube_r118 = new ModelRenderer(this);
        this.cube_r118.setRotationPoint(0.0F, 0.5F, 1.1F);
        this.tail.addChild(cube_r118);
        this.setRotateAngle(cube_r118, 0.4189F, 0.0F, 0.0F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 24, 37, 0.0F, 1.2F, 3.9F, 0, 2, 1, 0.0F, false));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 12, 28, 0.0F, 0.5F, 1.9F, 0, 2, 1, 0.0F, false));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 38, 15, 0.0F, 0.0F, -0.1F, 0, 1, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.4538F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 26, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.004F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 58, 0.0F, -0.8F, 1.0F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 57, 56, 0.0F, -0.8F, 3.0F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 57, 0.0F, -0.8F, 5.0F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 29, 44, 0.0F, -0.8F, 7.0F, 0, 1, 1, 0.0F, false));

        this.cube_r119 = new ModelRenderer(this);
        this.cube_r119.setRotationPoint(0.0F, 0.5F, -4.9F);
        this.tail2.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 0.4189F, 0.0F, 0.0F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 16, 0, 0.0F, 4.9F, 11.9F, 0, 1, 1, 0.0F, false));
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 20, 15, 0.0F, 4.1F, 9.9F, 0, 1, 1, 0.0F, false));
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 22, 0, 0.0F, 3.3F, 7.9F, 0, 1, 1, 0.0F, false));
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 12, 34, 0.0F, 2.6F, 5.9F, 0, 1, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.3927F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 28, 22, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 39, 22, 0.0F, -0.7F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r120 = new ModelRenderer(this);
        this.cube_r120.setRotationPoint(0.0F, 0.5F, -13.9F);
        this.tail3.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.4189F, 0.0F, 0.0F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 14, 15, 0.0F, 6.5F, 15.9F, 0, 1, 1, 0.0F, false));
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 29, 11, 0.0F, 5.8F, 13.9F, 0, 1, 1, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.3391F, 0.0222F, 0.0103F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 28, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.004F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 15, -0.5F, -0.5F, 0.0F, 1, 1, 11, 0.0F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3316F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 26, 11, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.004F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.2182F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 16, 0, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F, false));

        this.tail8 = new ModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.1396F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 14, 15, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.004F, false));

        this.tail9 = new ModelRenderer(this);
        this.tail9.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, -0.2705F, 0.0F, 0.0F);
        this.tail9.cubeList.add(new ModelBox(tail9, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 13, 0.0F, false));

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
