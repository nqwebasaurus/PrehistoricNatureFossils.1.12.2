package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLaidleria extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Laidleria;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer body;
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
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer chest;
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
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck;
    private final ModelRenderer head;
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
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer branchialskeleton;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r63;
    private final ModelRenderer tail2;

    public ModelSkeletonLaidleria() {
        this.textureWidth = 50;
        this.textureHeight = 47;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Laidleria = new ModelRenderer(this);
        this.Laidleria.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(Laidleria);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -1.0F, 8.8F);
        this.Laidleria.addChild(hips);
        this.hips.cubeList.add(new ModelBox(hips, 19, 0, -3.5F, 0.596F, -1.05F, 7, 0, 3, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.8F, 0.716F, -1.1F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 2.3562F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 29, -3.0F, -0.12F, 0.05F, 3, 0, 3, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(3.8F, 0.716F, -1.1F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -2.3562F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 29, 0.0F, -0.12F, 0.05F, 3, 0, 3, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.9F, -1.62F, -0.4F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1571F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 18, -1.4F, -0.0382F, 0.0027F, 1, 1, 3, 0.0F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(4.1F, 1.0F, 0.8F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, -0.5236F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 42, -0.4695F, -1.0F, -1.1939F, 2, 1, 1, 0.0F, false));

        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.3484F, 0.0F, -0.7182F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -0.7418F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 29, 41, -0.2684F, -0.9996F, -0.8963F, 2, 1, 1, -0.1F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 22, 41, -0.2684F, -0.9996F, 0.1037F, 2, 1, 1, -0.1F, false));

        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.7074F, 0.0F, 0.2342F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.1745F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 36, -0.5441F, -1.0F, -1.1109F, 2, 1, 2, 0.0F, false));

        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(-4.1F, 1.0F, 0.8F);
        this.hips.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, -0.3054F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 0, 42, -1.5305F, -1.0F, -1.1939F, 2, 1, 1, 0.0F, true));

        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.3484F, 0.0F, -0.7182F);
        this.leftLeg4.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.1309F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 29, 41, -1.7316F, -0.9996F, -0.8963F, 2, 1, 1, -0.1F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 22, 41, -1.7316F, -0.9996F, 0.1037F, 2, 1, 1, -0.1F, true));

        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.7074F, 0.0F, 0.2342F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, -0.1745F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 36, -1.4559F, -1.0F, -1.1109F, 2, 1, 2, 0.0F, true));

        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-4.8F, 1.0F, 0.8F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, 0.1745F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.4F, -1.0F, -0.4F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.9F, -0.62F, -15.9F, 1, 1, 16, 0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.7F, -0.284F, -0.8F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1745F, -0.2618F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 20, -1.5F, 0.0F, -0.05F, 2, 0, 1, 0.0F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.7F, -0.284F, -2.8F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0812F, 0.1546F, -0.6608F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 43, 22, -4.2175F, -1.1544F, -0.05F, 2, 0, 1, 0.0F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.7F, -0.284F, -2.8F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, -0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 16, -2.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.7F, -0.284F, -4.8F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0607F, 0.116F, -0.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 37, 0, -5.2175F, -1.1544F, -0.05F, 3, 0, 1, 0.0F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.7F, -0.284F, -4.8F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1309F, -0.0873F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 37, -2.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.7F, -0.284F, -6.8F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0607F, 0.116F, -0.5271F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 33, 23, -6.2175F, -1.1544F, -0.05F, 4, 0, 1, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.7F, -0.284F, -6.8F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1309F, -0.0436F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 8, -2.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.7F, -0.284F, -8.8F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0607F, 0.116F, -0.4835F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 4, -7.2175F, -1.1544F, -0.05F, 5, 0, 1, 0.0F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.7F, -0.284F, -8.8F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.1309F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 10, -2.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.7F, -0.284F, -10.8F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0404F, 0.0774F, -0.4815F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 33, 6, -7.2175F, -1.1544F, -0.05F, 5, 0, 1, 0.0F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.7F, -0.284F, -10.8F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0873F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 39, -2.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.7F, -0.284F, -12.8F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0404F, 0.0774F, -0.5252F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 14, -6.2175F, -1.1544F, -0.05F, 4, 0, 1, 0.0F, true));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.7F, -0.284F, -12.8F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0873F, -0.0436F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 39, -2.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, true));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.7F, -0.284F, -14.8F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0404F, 0.0774F, -0.5252F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 35, 39, -5.2175F, -1.1544F, -0.05F, 3, 0, 1, 0.0F, true));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.7F, -0.284F, -14.8F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0873F, -0.0436F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 26, 39, -2.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, true));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.1F, -0.284F, -0.8F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.1745F, 0.2618F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 20, -0.5F, 0.0F, -0.05F, 2, 0, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.1F, -0.284F, -2.8F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.1745F, 0.1745F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 35, 16, -0.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.1F, -0.284F, -2.8F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0812F, -0.1546F, 0.6608F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 43, 22, 2.2175F, -1.1544F, -0.05F, 2, 0, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.1F, -0.284F, -4.8F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.1309F, 0.0873F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 37, -0.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.1F, -0.284F, -4.8F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0607F, -0.116F, 0.5708F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 37, 0, 2.2175F, -1.1544F, -0.05F, 3, 0, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.1F, -0.284F, -6.8F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.1309F, 0.0436F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 38, 8, -0.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.1F, -0.284F, -6.8F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0607F, -0.116F, 0.5271F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 33, 23, 2.2175F, -1.1544F, -0.05F, 4, 0, 1, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.1F, -0.284F, -8.8F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.1309F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 38, 10, -0.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.1F, -0.284F, -8.8F);
        this.body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0607F, -0.116F, 0.4835F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 33, 4, 2.2175F, -1.1544F, -0.05F, 5, 0, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.1F, -0.284F, -10.8F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.0873F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 8, 39, -0.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.1F, -0.284F, -10.8F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0404F, -0.0774F, 0.4815F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 33, 6, 2.2175F, -1.1544F, -0.05F, 5, 0, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.1F, -0.284F, -12.8F);
        this.body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.0873F, 0.0436F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 17, 39, -0.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.1F, -0.284F, -12.8F);
        this.body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0404F, -0.0774F, 0.5252F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 34, 14, 2.2175F, -1.1544F, -0.05F, 4, 0, 1, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.1F, -0.284F, -14.8F);
        this.body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0404F, -0.0774F, 0.5252F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 35, 39, 2.2175F, -1.1544F, -0.05F, 3, 0, 1, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.1F, -0.284F, -14.8F);
        this.body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.0873F, 0.0436F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 26, 39, -0.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2F, -15.8F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.1309F, -0.084F, 0.0044F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 18, -1.9F, 2.1209F, -4.7809F, 3, 0, 10, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.8F, 2.0209F, -1.5299F);
        this.chest.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, 0.1571F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 19, 4, -3.994F, 0.1342F, -1.251F, 4, 0, 5, 0.0F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.7F, -0.0791F, -0.6299F);
        this.chest.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0404F, 0.0774F, -0.6124F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 43, 24, -4.2175F, -1.1544F, -0.05F, 2, 0, 1, 0.0F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.7F, -0.0791F, -0.6299F);
        this.chest.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0873F, -0.1309F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 40, -2.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.7F, -0.0791F, -2.7299F);
        this.chest.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0404F, 0.0774F, -0.6124F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 43, 40, -3.3339F, -0.6944F, 0.0372F, 2, 0, 1, 0.0F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.7F, -0.0791F, -2.7299F);
        this.chest.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0873F, -0.1309F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 42, 37, -1.5087F, 0.0F, 0.0496F, 2, 0, 1, 0.0F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.8F, 2.0209F, -1.5299F);
        this.chest.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, 2.3387F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 36, 25, 0.446F, 3.2187F, 1.749F, 2, 0, 2, 0.0F, true));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.1F, -0.0791F, -0.6299F);
        this.chest.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -0.0873F, 0.1309F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 40, -0.5F, 0.0F, -0.05F, 3, 0, 1, 0.0F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.1F, -0.0791F, -0.6299F);
        this.chest.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0404F, -0.0774F, 0.6124F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 43, 24, 2.2175F, -1.1544F, -0.05F, 2, 0, 1, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.1F, -0.0791F, -2.7299F);
        this.chest.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -0.0873F, 0.1309F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 42, 37, -0.4913F, 0.0F, 0.0496F, 2, 0, 1, 0.0F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.1F, -0.0791F, -2.7299F);
        this.chest.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0404F, -0.0774F, 0.6124F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 43, 40, 1.3339F, -0.6944F, 0.0372F, 2, 0, 1, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(1.0F, 2.0209F, -1.5299F);
        this.chest.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, -0.1571F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 19, 4, -0.006F, 0.1342F, -1.251F, 4, 0, 5, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(1.0F, 2.0209F, -1.5299F);
        this.chest.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, -2.3387F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 36, 25, -2.446F, 3.2187F, 1.749F, 2, 0, 2, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.9F, 0.1048F, -3.6299F);
        this.chest.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0524F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 24, 31, 0.0F, -0.3F, -0.08F, 1, 1, 4, 0.0F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(4.5F, 1.1048F, -1.2299F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.1213F, -0.4989F, 0.1626F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 31, 31, -0.0204F, -0.2998F, -0.611F, 3, 1, 2, -0.001F, false));

        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(2.9194F, 0.7F, 1.0549F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.0879F, 1.0266F, -0.0042F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 36, 41, 0.0862F, -0.9994F, -1.7482F, 2, 1, 1, -0.003F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 8, 41, 0.269F, -0.9994F, -0.3602F, 2, 1, 1, -0.003F, false));

        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(2.0206F, 0.0F, -0.463F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.1745F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 11, 35, -0.2105F, -1.0F, -1.1039F, 2, 1, 2, 0.0F, false));

        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-5.3F, 1.1048F, -1.2299F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.0551F, -0.1388F, -0.1304F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 31, 31, -2.9796F, -0.2998F, -0.611F, 3, 1, 2, -0.001F, true));

        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.9194F, 0.7F, 1.0549F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.0417F, -0.9432F, 0.0488F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 36, 41, -2.0862F, -0.9994F, -1.7482F, 2, 1, 1, -0.003F, true));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 8, 41, -2.269F, -0.9994F, -0.3602F, 2, 1, 1, -0.003F, true));

        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-2.0206F, 0.0F, -0.463F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.1745F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 11, 35, -1.7895F, -1.0F, -1.1039F, 2, 1, 2, 0.0F, true));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.4048F, -3.6299F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.2217F, -0.2159F, 0.0114F);
        this.neck.cubeList.add(new ModelBox(neck, 8, 7, -0.8992F, -0.5992F, -1.6008F, 1, 1, 2, -0.004F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.4F, -0.4F, -1.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.4361F, 0.0119F, 0.0006F);
        this.head.cubeList.add(new ModelBox(head, 17, 18, -5.0F, -0.8F, -2.0F, 10, 2, 2, -0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 29, -0.5F, 0.2F, -6.94F, 1, 1, 5, -0.005F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-4.8F, 1.2F, -2.0F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 1.0036F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 19, 10, 0.0F, -1.0F, 0.0F, 8, 1, 2, 0.0F, true));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 19, 14, 0.8F, -0.84F, 0.16F, 7, 1, 0, 0.0F, true));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 9, 6.74F, -0.52F, 0.48F, 1, 1, 0, 0.0F, true));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 7, 4.8F, -0.28F, 0.48F, 1, 1, 0, 0.0F, true));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.8F, -0.08F, -2.0F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.2836F, 0.9998F, 0.1294F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 17, 23, -1.9941F, -0.563F, -3.1695F, 6, 1, 3, 0.0F, true));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.9F, -0.4783F, -5.1789F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1265F, -0.0362F, -0.5118F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 40, 33, -1.1F, -0.0065F, -0.5523F, 1, 1, 2, 0.0F, true));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.4656F, 0.6558F, -7.4381F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0471F, 1.0241F, -0.101F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 45, -0.5F, -0.5306F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.4656F, 0.6558F, -7.4381F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0471F, -1.0241F, 0.101F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 45, -0.5F, -0.5306F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.8F, -0.08F, -2.0F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.2836F, -0.9998F, -0.1294F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 17, 23, -4.0059F, -0.563F, -3.1695F, 6, 1, 3, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(4.8F, 1.2F, -2.0F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, -1.0036F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 19, 14, -7.8F, -0.84F, 0.16F, 7, 1, 0, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 7, -5.8F, -0.28F, 0.48F, 1, 1, 0, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 9, -7.74F, -0.52F, 0.48F, 1, 1, 0, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 19, 10, -8.0F, -1.0F, 0.0F, 8, 1, 2, -0.003F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, 0.4F, -8.96F);
        this.head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.1571F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 23, -0.5F, -0.2F, -0.18F, 1, 1, 3, 0.0F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(0.9F, -0.4783F, -5.1789F);
        this.head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.1265F, 0.0362F, 0.5118F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 40, 33, 0.1F, -0.0065F, -0.5523F, 1, 1, 2, 0.0F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.5F, 0.0F, -6.8F);
        this.head.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.1047F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 45, -1.0F, -0.3348F, 4.0F, 1, 1, 1, -0.1F, false));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 0, -1.5F, -0.22F, 0.0F, 2, 1, 5, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7852F, -0.0077F, -0.0037F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 0, -0.5F, 0.0F, -9.04F, 1, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 33, 35, 2.9994F, -0.0006F, -1.9994F, 2, 1, 2, 0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 33, 35, -4.9994F, -0.0006F, -1.9994F, 2, 1, 2, 0.003F, true));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-4.8F, 1.0F, -2.0F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, 1.0036F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 14, 0.8F, -1.16F, 0.16F, 7, 1, 0, 0.0F, true));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 26, 28, 0.0004F, -1.0004F, 0.0004F, 8, 1, 1, 0.002F, true));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(4.8F, 1.0F, -2.0F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, -1.0036F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 14, -7.8F, -1.16F, 0.16F, 7, 1, 0, 0.0F, false));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 26, 28, -8.0004F, -1.0004F, 0.0004F, 8, 1, 1, 0.002F, false));

        this.branchialskeleton = new ModelRenderer(this);
        this.branchialskeleton.setRotationPoint(-0.4037F, 1.8373F, -0.051F);
        this.jaw.addChild(branchialskeleton);
        this.setRotateAngle(branchialskeleton, -0.0873F, -0.0034F, 0.0006F);


        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(0.8074F, 0.0F, -2.2F);
        this.branchialskeleton.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.1366F, 0.0289F, 0.2075F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 15, 41, -1.6979F, 0.2077F, -1.9F, 1, 0, 2, 0.0F, true));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(0.8074F, 0.0F, -2.6F);
        this.branchialskeleton.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, 0.0F, 0.2094F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 40, 12, -3.6979F, -0.0923F, -0.3F, 2, 0, 1, 0.0F, true));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 40, 18, -3.6979F, 0.1077F, 0.5F, 2, 0, 1, 0.0F, true));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 40, 31, -3.6979F, 0.3077F, 1.0F, 2, 0, 1, 0.0F, true));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 40, 2, -3.6979F, 0.5077F, 1.7F, 2, 0, 1, 0.0F, true));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, 0.0F, -2.2F);
        this.branchialskeleton.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.1366F, -0.0289F, -0.2075F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 15, 41, 0.6979F, 0.2077F, -1.9F, 1, 0, 2, 0.0F, false));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 0.0F, -2.6F);
        this.branchialskeleton.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, 0.0F, -0.2094F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 40, 12, 1.6979F, -0.0923F, -0.3F, 2, 0, 1, 0.0F, false));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 40, 18, 1.6979F, 0.1077F, 0.5F, 2, 0, 1, 0.0F, false));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 40, 31, 1.6979F, 0.3077F, 1.0F, 2, 0, 1, 0.0F, false));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 40, 2, 1.6979F, 0.5077F, 1.7F, 2, 0, 1, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.1F, 2.3F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.0F, 0.2618F, 0.0F);


        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0F, -1.4F, -0.1F);
        this.tail1.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.1222F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 17, 29, -0.5F, 0.3F, 0.2F, 1, 1, 4, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.9F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, 0.2618F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 7, -0.5F, -0.5996F, -0.0004F, 1, 1, 5, -0.003F, false));

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
