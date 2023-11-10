package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonChilesaurus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
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
    private final ModelRenderer hips_r1;
    private final ModelRenderer hips_r2;
    private final ModelRenderer hips_r3;
    private final ModelRenderer hips_r4;
    private final ModelRenderer hips_r5;
    private final ModelRenderer hips_r6;
    private final ModelRenderer hips_r7;
    private final ModelRenderer hips_r8;
    private final ModelRenderer bodyMiddle;
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
    private final ModelRenderer bodyFront;
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
    private final ModelRenderer bodyFront_r1;
    private final ModelRenderer bodyFront_r2;
    private final ModelRenderer bodyFront_r3;
    private final ModelRenderer bodyFront_r4;
    private final ModelRenderer neckBase;
    private final ModelRenderer neckMiddlefront_r1;
    private final ModelRenderer neckMiddlefront_r2;
    private final ModelRenderer neckMiddlefront_r3;
    private final ModelRenderer neckMiddlefront_r4;
    private final ModelRenderer NeckBaseextra;
    private final ModelRenderer neckMiddlebase;
    private final ModelRenderer neckMiddlefront_r5;
    private final ModelRenderer neckMiddlefront_r6;
    private final ModelRenderer neckMiddlefront_r7;
    private final ModelRenderer neckMiddlefront_r8;
    private final ModelRenderer neckMiddlefront;
    private final ModelRenderer neckMiddlefront_r9;
    private final ModelRenderer neckMiddlefront_r10;
    private final ModelRenderer neckMiddlefront_r11;
    private final ModelRenderer neckMiddlefront_r12;
    private final ModelRenderer neckFront;
    private final ModelRenderer head;
    private final ModelRenderer headSlope;
    private final ModelRenderer upperJawback;
    private final ModelRenderer upperJawslopefront;
    private final ModelRenderer upperJawslopeback;
    private final ModelRenderer upperJawfront;
    private final ModelRenderer snoutSlopefront;
    private final ModelRenderer snoutSlopeback;
    private final ModelRenderer leftUpperteeth;
    private final ModelRenderer rightUpperteeth;
    private final ModelRenderer lowerJawbase;
    private final ModelRenderer lowerJawmiddle;
    private final ModelRenderer lowerJawfront;
    private final ModelRenderer leftLowerteeth;
    private final ModelRenderer rightLowerteeth;
    private final ModelRenderer lowerJawslope;
    private final ModelRenderer leftEye;
    private final ModelRenderer rightEye_r1;
    private final ModelRenderer rightEye_r2;
    private final ModelRenderer chestSlope;
    private final ModelRenderer chestSlope_r1;
    private final ModelRenderer chestSlope_r2;
    private final ModelRenderer chestSlope_r3;
    private final ModelRenderer chestSlope_r4;
    private final ModelRenderer leftUpperarm;
    private final ModelRenderer leftLowerarm;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightUpperarm;
    private final ModelRenderer rightLowerarm;
    private final ModelRenderer rightHand;
    private final ModelRenderer bellySlope;
    private final ModelRenderer tailBase;
    private final ModelRenderer tailBase_r1;
    private final ModelRenderer tailBase_r2;
    private final ModelRenderer tailBase_r3;
    private final ModelRenderer tailBase_r4;
    private final ModelRenderer tailMiddlebase;
    private final ModelRenderer tailBase_r5;
    private final ModelRenderer tailBase_r6;
    private final ModelRenderer tailMiddlebase_r1;
    private final ModelRenderer tailMiddle;
    private final ModelRenderer tailBase_r7;
    private final ModelRenderer tailMiddle_r1;
    private final ModelRenderer tailMiddleend;
    private final ModelRenderer tailMiddleend_r1;
    private final ModelRenderer tailEnd;
    private final ModelRenderer tailEnd_r1;
    private final ModelRenderer rightThigh;
    private final ModelRenderer rightThigh_r1;
    private final ModelRenderer rightShin;
    private final ModelRenderer rightAnkle;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightToes;
    private final ModelRenderer leftThigh;
    private final ModelRenderer leftThigh_r1;
    private final ModelRenderer leftShin;
    private final ModelRenderer leftAnkle;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftToes;

    public ModelSkeletonChilesaurus() {
        this.textureWidth = 65;
        this.textureHeight = 65;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 3.4F, 0.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.3243F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 0, -0.5F, -0.2056F, -5.4941F, 1, 1, 11, -0.003F, false));
        this.hips.cubeList.add(new ModelBox(hips, 0, 37, 0.0F, -1.2F, -1.6F, 0, 1, 6, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 0, 13, 0.0F, -1.0F, -5.6F, 0, 1, 1, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 0, 0, 0.0F, -1.2F, -3.6F, 0, 1, 1, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 11, 26, 0.5F, -0.2056F, -1.4941F, 1, 1, 5, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 13, 35, 1.5F, -1.2F, -1.6F, 1, 2, 6, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 51, 7, 1.5F, 0.8F, -0.6F, 1, 1, 3, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 13, 35, -2.5F, -1.2F, -1.6F, 1, 2, 6, 0.0F, true));
        this.hips.cubeList.add(new ModelBox(hips, 51, 7, -2.5F, 0.8F, -0.6F, 1, 1, 3, 0.0F, true));
        this.hips.cubeList.add(new ModelBox(hips, 11, 26, -1.5F, -0.2056F, -1.4941F, 1, 1, 5, 0.0F, true));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.2245F, -3.1658F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.074F, -0.0737F, -0.9658F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 5, -2.9354F, -0.3879F, -0.3091F, 2, 0, 1, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.2245F, -3.1658F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0945F, -0.005F, -0.5734F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 33, -1.0192F, 0.0001F, -0.3461F, 1, 0, 1, 0.0F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.2375F, -5.1757F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0202F, -0.0138F, -1.4911F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 9, -3.3482F, -1.8036F, -0.3091F, 1, 0, 1, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.2375F, -5.1757F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0244F, -0.0019F, -0.9676F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 31, -2.9354F, -0.3879F, -0.3091F, 2, 0, 1, 0.0F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.2375F, -5.1757F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0212F, 0.0423F, -0.572F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 41, -1.0192F, 0.0001F, -0.3461F, 1, 0, 1, 0.0F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.2245F, -3.1658F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.074F, 0.0737F, 0.9658F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 5, 0.9354F, -0.3879F, -0.3091F, 2, 0, 1, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.2245F, -3.1658F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0945F, 0.005F, 0.5734F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 33, 0.0192F, 0.0001F, -0.3461F, 1, 0, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.2375F, -5.1757F);
        this.hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0202F, 0.0138F, 1.4911F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 9, 2.3482F, -1.8036F, -0.3091F, 1, 0, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.2375F, -5.1757F);
        this.hips.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0244F, 0.0019F, 0.9676F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 31, 0.9354F, -0.3879F, -0.3091F, 2, 0, 1, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.2375F, -5.1757F);
        this.hips.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0212F, -0.0423F, 0.572F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 7, 41, 0.0192F, 0.0001F, -0.3461F, 1, 0, 1, 0.0F, false));

        this.hips_r1 = new ModelRenderer(this);
        this.hips_r1.setRotationPoint(-2.0F, 1.8F, -0.6F);
        this.hips.addChild(hips_r1);
        this.setRotateAngle(hips_r1, -0.7407F, 0.1294F, -0.1174F);
        this.hips_r1.cubeList.add(new ModelBox(hips_r1, 14, 0, -0.5F, -0.8F, -0.2F, 1, 1, 9, -0.2F, true));

        this.hips_r2 = new ModelRenderer(this);
        this.hips_r2.setRotationPoint(-2.0F, 1.5308F, 1.4936F);
        this.hips.addChild(hips_r2);
        this.setRotateAngle(hips_r2, -0.7528F, 0.1539F, -0.1426F);
        this.hips_r2.cubeList.add(new ModelBox(hips_r2, 26, 11, -0.5F, -0.4318F, -0.318F, 1, 1, 8, 0.0F, true));

        this.hips_r3 = new ModelRenderer(this);
        this.hips_r3.setRotationPoint(-2.0F, -0.2F, -1.2F);
        this.hips.addChild(hips_r3);
        this.setRotateAngle(hips_r3, 0.8727F, 0.2618F, 0.0873F);
        this.hips_r3.cubeList.add(new ModelBox(hips_r3, 50, 42, -0.5F, -0.9492F, -2.4911F, 1, 1, 3, 0.0F, true));

        this.hips_r4 = new ModelRenderer(this);
        this.hips_r4.setRotationPoint(-2.0F, -0.2F, -1.2F);
        this.hips.addChild(hips_r4);
        this.setRotateAngle(hips_r4, 0.4363F, 0.2618F, 0.0873F);
        this.hips_r4.cubeList.add(new ModelBox(hips_r4, 10, 50, -0.5F, -0.0204F, -2.2762F, 1, 1, 3, -0.003F, true));

        this.hips_r5 = new ModelRenderer(this);
        this.hips_r5.setRotationPoint(2.0F, -0.2F, -1.2F);
        this.hips.addChild(hips_r5);
        this.setRotateAngle(hips_r5, 0.4363F, -0.2618F, -0.0873F);
        this.hips_r5.cubeList.add(new ModelBox(hips_r5, 10, 50, -0.5F, -0.0204F, -2.2762F, 1, 1, 3, -0.003F, false));

        this.hips_r6 = new ModelRenderer(this);
        this.hips_r6.setRotationPoint(2.0F, -0.2F, -1.2F);
        this.hips.addChild(hips_r6);
        this.setRotateAngle(hips_r6, 0.8727F, -0.2618F, -0.0873F);
        this.hips_r6.cubeList.add(new ModelBox(hips_r6, 50, 42, -0.5F, -0.9492F, -2.4911F, 1, 1, 3, 0.0F, false));

        this.hips_r7 = new ModelRenderer(this);
        this.hips_r7.setRotationPoint(2.0F, 1.8F, -0.6F);
        this.hips.addChild(hips_r7);
        this.setRotateAngle(hips_r7, -0.7407F, -0.1294F, 0.1174F);
        this.hips_r7.cubeList.add(new ModelBox(hips_r7, 14, 0, -0.5F, -0.8F, -0.2F, 1, 1, 9, -0.2F, false));

        this.hips_r8 = new ModelRenderer(this);
        this.hips_r8.setRotationPoint(2.0F, 1.5308F, 1.4936F);
        this.hips.addChild(hips_r8);
        this.setRotateAngle(hips_r8, -0.7528F, -0.1539F, 0.1426F);
        this.hips_r8.cubeList.add(new ModelBox(hips_r8, 26, 11, -0.5F, -0.4318F, -0.318F, 1, 1, 8, 0.0F, false));

        this.bodyMiddle = new ModelRenderer(this);
        this.bodyMiddle.setRotationPoint(0.0F, 0.1339F, -5.5389F);
        this.hips.addChild(bodyMiddle);
        this.setRotateAngle(bodyMiddle, 0.0826F, 0.0F, 0.0F);
        this.bodyMiddle.cubeList.add(new ModelBox(bodyMiddle, 30, 31, -0.5F, -0.3735F, -6.869F, 1, 1, 7, 0.0F, false));
        this.bodyMiddle.cubeList.add(new ModelBox(bodyMiddle, 50, 42, 0.0F, -0.9735F, -5.869F, 0, 1, 1, 0.0F, false));
        this.bodyMiddle.cubeList.add(new ModelBox(bodyMiddle, 16, 50, 0.0F, -1.1735F, -3.869F, 0, 1, 1, 0.0F, false));
        this.bodyMiddle.cubeList.add(new ModelBox(bodyMiddle, 50, 0, 0.0F, -1.1735F, -1.869F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.0725F, -1.4717F);
        this.bodyMiddle.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0271F, -0.1008F, -1.4907F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 45, -3.3425F, -1.8026F, -0.3846F, 1, 0, 1, 0.0F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.0725F, -1.4717F);
        this.bodyMiddle.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.074F, -0.0737F, -0.9658F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 5, -2.93F, -0.3899F, -0.3846F, 2, 0, 1, 0.0F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.0725F, -1.4717F);
        this.bodyMiddle.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0945F, -0.005F, -0.5734F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 51, 21, -1.0124F, -0.004F, -0.4214F, 1, 0, 1, 0.0F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.0386F, -3.5738F);
        this.bodyMiddle.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0143F, -0.0591F, -1.3609F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 39, 26, -4.3509F, -1.7988F, -0.2846F, 2, 0, 1, 0.0F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.0386F, -3.5738F);
        this.bodyMiddle.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.042F, -0.044F, -0.8368F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 40, -2.9354F, -0.3824F, -0.2846F, 2, 0, 1, 0.0F, true));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.0386F, -3.5738F);
        this.bodyMiddle.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0536F, 0.0102F, -0.4424F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 53, 13, -1.0179F, 0.0052F, -0.3215F, 1, 0, 1, 0.0F, true));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -0.1099F, -7.4723F);
        this.bodyMiddle.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0015F, -0.0174F, -1.2741F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 14, 6, -5.2915F, -1.2864F, 1.6114F, 3, 0, 1, 0.0F, true));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, -0.1099F, -7.4723F);
        this.bodyMiddle.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.01F, -0.0143F, -0.7504F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 45, -2.6277F, 0.0317F, 1.6114F, 2, 0, 1, 0.0F, true));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, -0.1099F, -7.4723F);
        this.bodyMiddle.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0127F, 0.0253F, -0.3544F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 59, 0, -0.6401F, 0.2723F, 1.5881F, 1, 0, 1, 0.0F, true));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 0.0725F, -1.4717F);
        this.bodyMiddle.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0271F, 0.1008F, 1.4907F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 7, 45, 2.3425F, -1.8026F, -0.3846F, 1, 0, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 0.0725F, -1.4717F);
        this.bodyMiddle.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.074F, 0.0737F, 0.9658F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 36, 5, 0.93F, -0.3899F, -0.3846F, 2, 0, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 0.0725F, -1.4717F);
        this.bodyMiddle.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0945F, 0.005F, 0.5734F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 51, 21, 0.0124F, -0.004F, -0.4214F, 1, 0, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.0386F, -3.5738F);
        this.bodyMiddle.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0143F, 0.0591F, 1.3609F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 39, 26, 2.3509F, -1.7988F, -0.2846F, 2, 0, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 0.0386F, -3.5738F);
        this.bodyMiddle.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.042F, 0.044F, 0.8368F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 31, 40, 0.9354F, -0.3824F, -0.2846F, 2, 0, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 0.0386F, -3.5738F);
        this.bodyMiddle.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0536F, -0.0102F, 0.4424F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 53, 13, 0.0179F, 0.0052F, -0.3215F, 1, 0, 1, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0F, -0.1099F, -7.4723F);
        this.bodyMiddle.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0015F, 0.0174F, 1.2741F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 14, 6, 2.2915F, -1.2864F, 1.6114F, 3, 0, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(1.0F, -0.1099F, -7.4723F);
        this.bodyMiddle.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.01F, 0.0143F, 0.7504F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 45, 0.6277F, 0.0317F, 1.6114F, 2, 0, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(1.0F, -0.1099F, -7.4723F);
        this.bodyMiddle.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0127F, -0.0253F, 0.3544F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 59, 0, -0.3599F, 0.2723F, 1.5881F, 1, 0, 1, 0.0F, false));

        this.bodyFront = new ModelRenderer(this);
        this.bodyFront.setRotationPoint(0.0F, -0.0741F, -6.8881F);
        this.bodyMiddle.addChild(bodyFront);
        this.setRotateAngle(bodyFront, 0.1934F, 0.0F, 0.0F);
        this.bodyFront.cubeList.add(new ModelBox(bodyFront, 28, 21, -0.5F, -0.2957F, -7.9493F, 1, 1, 8, 0.0F, false));
        this.bodyFront.cubeList.add(new ModelBox(bodyFront, 51, 47, 0.0F, -0.7957F, -0.9493F, 0, 1, 1, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0F, -0.032F, -0.5526F);
        this.bodyFront.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0015F, -0.0174F, -1.2741F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 8, -6.2993F, -1.2916F, -0.3804F, 4, 0, 1, 0.0F, true));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0F, -0.032F, -0.5526F);
        this.bodyFront.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.01F, -0.0143F, -0.7504F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 55, 17, -2.637F, 0.0311F, -0.3804F, 2, 0, 1, 0.0F, true));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.0F, -0.032F, -0.5526F);
        this.bodyFront.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0127F, 0.0253F, -0.3544F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 60, 28, -0.5799F, 0.2712F, -0.4027F, 1, 0, 1, 0.0F, true));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.0F, 0.0242F, -2.5914F);
        this.bodyFront.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0613F, 0.0718F, -0.4031F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 60, 30, -0.5853F, 0.2781F, -0.4046F, 1, 0, 1, 0.0F, true));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.0F, 0.0242F, -2.5914F);
        this.bodyFront.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0401F, 0.0572F, -0.8017F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 56, 26, -2.6446F, 0.0354F, -0.382F, 2, 0, 1, 0.0F, true));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.0F, 0.0242F, -2.5914F);
        this.bodyFront.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0061F, 0.0695F, -1.3262F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 21, -6.308F, -1.2917F, -0.382F, 4, 0, 1, 0.0F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.0F, -0.0998F, -4.4979F);
        this.bodyFront.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0122F, 0.1391F, -1.4129F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 14, 19, -5.3796F, -1.2869F, -0.5096F, 3, 0, 1, 0.0F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.0F, -0.0998F, -4.4979F);
        this.bodyFront.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0804F, 0.1143F, -0.8855F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 57, 47, -2.7042F, 0.0753F, -0.5096F, 2, 0, 1, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.0F, -0.0998F, -4.4979F);
        this.bodyFront.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1207F, 0.1088F, -0.485F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 61, 2, -0.6204F, 0.3376F, -0.5336F, 1, 0, 1, 0.0F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.0F, 0.0043F, -6.8493F);
        this.bodyFront.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0193F, 0.2173F, -1.4814F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 50, 57, -4.3157F, -1.2936F, -0.159F, 2, 0, 1, 0.0F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.0F, 0.0043F, -6.8493F);
        this.bodyFront.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1265F, 0.1782F, -0.9486F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 57, 57, -2.6523F, 0.0375F, -0.159F, 2, 0, 1, 0.0F, true));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.0F, 0.0043F, -6.8493F);
        this.bodyFront.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.1882F, 0.1499F, -0.5461F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 11, 61, -0.5992F, 0.2834F, -0.1819F, 1, 0, 1, 0.0F, true));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(1.0F, -0.032F, -0.5526F);
        this.bodyFront.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0015F, 0.0174F, 1.2741F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 8, 2.2993F, -1.2916F, -0.3804F, 4, 0, 1, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(1.0F, -0.032F, -0.5526F);
        this.bodyFront.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.01F, 0.0143F, 0.7504F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 55, 17, 0.637F, 0.0311F, -0.3804F, 2, 0, 1, 0.0F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(1.0F, -0.032F, -0.5526F);
        this.bodyFront.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0127F, -0.0253F, 0.3544F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 60, 28, -0.4201F, 0.2712F, -0.4027F, 1, 0, 1, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(1.0F, 0.0242F, -2.5914F);
        this.bodyFront.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0061F, -0.0695F, 1.3262F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 21, 2.308F, -1.2917F, -0.382F, 4, 0, 1, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(1.0F, 0.0242F, -2.5914F);
        this.bodyFront.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0401F, -0.0572F, 0.8017F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 56, 26, 0.6446F, 0.0354F, -0.382F, 2, 0, 1, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(1.0F, 0.0242F, -2.5914F);
        this.bodyFront.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0613F, -0.0718F, 0.4031F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 60, 30, -0.4147F, 0.2781F, -0.4046F, 1, 0, 1, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(1.0F, -0.0998F, -4.4979F);
        this.bodyFront.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0122F, -0.1391F, 1.4129F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 14, 19, 2.3796F, -1.2869F, -0.5096F, 3, 0, 1, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(1.0F, -0.0998F, -4.4979F);
        this.bodyFront.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0804F, -0.1143F, 0.8855F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 57, 47, 0.7042F, 0.0753F, -0.5096F, 2, 0, 1, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(1.0F, -0.0998F, -4.4979F);
        this.bodyFront.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1207F, -0.1088F, 0.485F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 61, 2, -0.3796F, 0.3376F, -0.5336F, 1, 0, 1, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(1.0F, 0.0043F, -6.8493F);
        this.bodyFront.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0193F, -0.2173F, 1.4814F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 50, 57, 2.3157F, -1.2936F, -0.159F, 2, 0, 1, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(1.0F, 0.0043F, -6.8493F);
        this.bodyFront.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.1265F, -0.1782F, 0.9486F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 57, 57, 0.6523F, 0.0375F, -0.159F, 2, 0, 1, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(1.0F, 0.0043F, -6.8493F);
        this.bodyFront.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.1882F, -0.1499F, 0.5461F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 11, 61, -0.4008F, 0.2834F, -0.1819F, 1, 0, 1, 0.0F, false));

        this.bodyFront_r1 = new ModelRenderer(this);
        this.bodyFront_r1.setRotationPoint(-2.4882F, 2.578F, -5.9343F);
        this.bodyFront.addChild(bodyFront_r1);
        this.setRotateAngle(bodyFront_r1, 0.5387F, 0.2261F, 0.1332F);
        this.bodyFront_r1.cubeList.add(new ModelBox(bodyFront_r1, 7, 37, -0.3241F, -1.15F, -2.911F, 3, 2, 1, 0.0F, true));

        this.bodyFront_r2 = new ModelRenderer(this);
        this.bodyFront_r2.setRotationPoint(-2.4882F, 2.578F, -5.9343F);
        this.bodyFront.addChild(bodyFront_r2);
        this.setRotateAngle(bodyFront_r2, 0.5236F, 0.0F, 0.0F);
        this.bodyFront_r2.cubeList.add(new ModelBox(bodyFront_r2, 14, 0, -1.0118F, -1.15F, -2.5668F, 1, 2, 3, 0.003F, true));
        this.bodyFront_r2.cubeList.add(new ModelBox(bodyFront_r2, 14, 0, 4.9882F, -1.15F, -2.5668F, 1, 2, 3, 0.003F, false));

        this.bodyFront_r3 = new ModelRenderer(this);
        this.bodyFront_r3.setRotationPoint(-2.4882F, 2.578F, -5.3343F);
        this.bodyFront.addChild(bodyFront_r3);
        this.setRotateAngle(bodyFront_r3, 0.4363F, 0.0F, 0.0F);
        this.bodyFront_r3.cubeList.add(new ModelBox(bodyFront_r3, 23, 40, -1.0118F, -0.65F, -0.3864F, 1, 1, 5, 0.0F, true));
        this.bodyFront_r3.cubeList.add(new ModelBox(bodyFront_r3, 23, 40, 4.9882F, -0.65F, -0.3864F, 1, 1, 5, 0.0F, false));

        this.bodyFront_r4 = new ModelRenderer(this);
        this.bodyFront_r4.setRotationPoint(2.4882F, 2.578F, -5.9343F);
        this.bodyFront.addChild(bodyFront_r4);
        this.setRotateAngle(bodyFront_r4, 0.5387F, -0.2261F, -0.1332F);
        this.bodyFront_r4.cubeList.add(new ModelBox(bodyFront_r4, 7, 37, -2.6759F, -1.15F, -2.911F, 3, 2, 1, 0.0F, false));

        this.neckBase = new ModelRenderer(this);
        this.neckBase.setRotationPoint(0.0F, 0.1043F, -7.6493F);
        this.bodyFront.addChild(neckBase);
        this.setRotateAngle(neckBase, -0.7878F, 0.0F, 0.0F);
        this.neckBase.cubeList.add(new ModelBox(neckBase, 19, 47, -0.5F, -0.4389F, -3.6988F, 1, 1, 4, -0.003F, false));

        this.neckMiddlefront_r1 = new ModelRenderer(this);
        this.neckMiddlefront_r1.setRotationPoint(-0.5F, 0.4964F, -0.7896F);
        this.neckBase.addChild(neckMiddlefront_r1);
        this.setRotateAngle(neckMiddlefront_r1, -0.2268F, -0.6839F, 0.1525F);
        this.neckMiddlefront_r1.cubeList.add(new ModelBox(neckMiddlefront_r1, 55, 12, -0.3415F, -0.3965F, -0.4716F, 0, 1, 3, 0.0F, true));

        this.neckMiddlefront_r2 = new ModelRenderer(this);
        this.neckMiddlefront_r2.setRotationPoint(-0.5F, 0.5957F, -2.9344F);
        this.neckBase.addChild(neckMiddlefront_r2);
        this.setRotateAngle(neckMiddlefront_r2, -0.1968F, -0.4705F, 0.0978F);
        this.neckMiddlefront_r2.cubeList.add(new ModelBox(neckMiddlefront_r2, 56, 29, -0.1923F, -0.4614F, -0.4726F, 0, 1, 3, 0.0F, true));

        this.neckMiddlefront_r3 = new ModelRenderer(this);
        this.neckMiddlefront_r3.setRotationPoint(0.5F, 0.4964F, -0.7896F);
        this.neckBase.addChild(neckMiddlefront_r3);
        this.setRotateAngle(neckMiddlefront_r3, -0.2268F, 0.6839F, -0.1525F);
        this.neckMiddlefront_r3.cubeList.add(new ModelBox(neckMiddlefront_r3, 55, 12, 0.3415F, -0.3965F, -0.4716F, 0, 1, 3, 0.0F, false));

        this.neckMiddlefront_r4 = new ModelRenderer(this);
        this.neckMiddlefront_r4.setRotationPoint(0.5F, 0.5957F, -2.9344F);
        this.neckBase.addChild(neckMiddlefront_r4);
        this.setRotateAngle(neckMiddlefront_r4, -0.1968F, 0.4705F, -0.0978F);
        this.neckMiddlefront_r4.cubeList.add(new ModelBox(neckMiddlefront_r4, 56, 29, 0.1923F, -0.4614F, -0.4726F, 0, 1, 3, 0.0F, false));

        this.NeckBaseextra = new ModelRenderer(this);
        this.NeckBaseextra.setRotationPoint(-0.01F, 3.4611F, 0.3012F);
        this.neckBase.addChild(NeckBaseextra);
        this.setRotateAngle(NeckBaseextra, 0.2759F, 0.0F, 0.0F);


        this.neckMiddlebase = new ModelRenderer(this);
        this.neckMiddlebase.setRotationPoint(0.0F, -0.2389F, -3.4988F);
        this.neckBase.addChild(neckMiddlebase);
        this.setRotateAngle(neckMiddlebase, -0.3826F, 0.0895F, 0.1051F);
        this.neckMiddlebase.cubeList.add(new ModelBox(neckMiddlebase, 48, 15, -0.5F, -0.2F, -4.0F, 1, 1, 4, 0.0F, false));

        this.neckMiddlefront_r5 = new ModelRenderer(this);
        this.neckMiddlefront_r5.setRotationPoint(-0.5F, 0.7952F, -2.4483F);
        this.neckMiddlebase.addChild(neckMiddlefront_r5);
        this.setRotateAngle(neckMiddlefront_r5, -0.2317F, -0.3405F, 0.0786F);
        this.neckMiddlefront_r5.cubeList.add(new ModelBox(neckMiddlefront_r5, 39, 57, 0.2065F, -0.6457F, 0.5378F, 0, 1, 2, 0.0F, true));

        this.neckMiddlefront_r6 = new ModelRenderer(this);
        this.neckMiddlefront_r6.setRotationPoint(-0.5F, 0.8554F, -3.8613F);
        this.neckMiddlebase.addChild(neckMiddlefront_r6);
        this.setRotateAngle(neckMiddlefront_r6, -0.2284F, -0.298F, 0.0681F);
        this.neckMiddlefront_r6.cubeList.add(new ModelBox(neckMiddlefront_r6, 58, 50, 0.031F, -0.5864F, 0.0732F, 0, 1, 2, 0.0F, true));

        this.neckMiddlefront_r7 = new ModelRenderer(this);
        this.neckMiddlefront_r7.setRotationPoint(0.5F, 0.7952F, -2.4483F);
        this.neckMiddlebase.addChild(neckMiddlefront_r7);
        this.setRotateAngle(neckMiddlefront_r7, -0.2317F, 0.3405F, -0.0786F);
        this.neckMiddlefront_r7.cubeList.add(new ModelBox(neckMiddlefront_r7, 39, 57, -0.2065F, -0.6457F, 0.5378F, 0, 1, 2, 0.0F, false));

        this.neckMiddlefront_r8 = new ModelRenderer(this);
        this.neckMiddlefront_r8.setRotationPoint(0.5F, 0.8554F, -3.8613F);
        this.neckMiddlebase.addChild(neckMiddlefront_r8);
        this.setRotateAngle(neckMiddlefront_r8, -0.2284F, 0.298F, -0.0681F);
        this.neckMiddlefront_r8.cubeList.add(new ModelBox(neckMiddlefront_r8, 58, 50, -0.031F, -0.5864F, 0.0732F, 0, 1, 2, 0.0F, false));

        this.neckMiddlefront = new ModelRenderer(this);
        this.neckMiddlefront.setRotationPoint(0.0F, 0.0F, -3.9F);
        this.neckMiddlebase.addChild(neckMiddlefront);
        this.setRotateAngle(neckMiddlefront, -0.1231F, 0.0329F, 0.2598F);
        this.neckMiddlefront.cubeList.add(new ModelBox(neckMiddlefront, 0, 52, -0.5F, -0.2271F, -3.0081F, 1, 1, 3, -0.003F, false));

        this.neckMiddlefront_r9 = new ModelRenderer(this);
        this.neckMiddlefront_r9.setRotationPoint(-0.5F, 0.7069F, -1.3693F);
        this.neckMiddlefront.addChild(neckMiddlefront_r9);
        this.setRotateAngle(neckMiddlefront_r9, -0.2214F, -0.1704F, 0.0381F);
        this.neckMiddlefront_r9.cubeList.add(new ModelBox(neckMiddlefront_r9, 59, 10, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.neckMiddlefront_r10 = new ModelRenderer(this);
        this.neckMiddlefront_r10.setRotationPoint(-0.5F, 0.7729F, -3.0081F);
        this.neckMiddlefront.addChild(neckMiddlefront_r10);
        this.setRotateAngle(neckMiddlefront_r10, -0.2214F, -0.1704F, 0.0381F);
        this.neckMiddlefront_r10.cubeList.add(new ModelBox(neckMiddlefront_r10, 59, 19, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.neckMiddlefront_r11 = new ModelRenderer(this);
        this.neckMiddlefront_r11.setRotationPoint(0.5F, 0.7069F, -1.3693F);
        this.neckMiddlefront.addChild(neckMiddlefront_r11);
        this.setRotateAngle(neckMiddlefront_r11, -0.2214F, 0.1704F, -0.0381F);
        this.neckMiddlefront_r11.cubeList.add(new ModelBox(neckMiddlefront_r11, 59, 10, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.neckMiddlefront_r12 = new ModelRenderer(this);
        this.neckMiddlefront_r12.setRotationPoint(0.5F, 0.7729F, -3.0081F);
        this.neckMiddlefront.addChild(neckMiddlefront_r12);
        this.setRotateAngle(neckMiddlefront_r12, -0.2214F, 0.1704F, -0.0381F);
        this.neckMiddlefront_r12.cubeList.add(new ModelBox(neckMiddlefront_r12, 59, 19, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.neckFront = new ModelRenderer(this);
        this.neckFront.setRotationPoint(-0.01F, 0.1729F, -3.0081F);
        this.neckMiddlefront.addChild(neckFront);
        this.setRotateAngle(neckFront, 0.6909F, -0.0742F, 0.2229F);
        this.neckFront.cubeList.add(new ModelBox(neckFront, 26, 47, -0.49F, -0.3932F, -1.8992F, 1, 1, 2, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0068F, -0.9992F);
        this.neckFront.addChild(head);
        this.setRotateAngle(head, 0.7191F, 0.3697F, 0.3208F);
        this.head.cubeList.add(new ModelBox(head, 10, 44, -1.49F, -0.6921F, -2.9323F, 3, 2, 3, 0.0F, false));

        this.headSlope = new ModelRenderer(this);
        this.headSlope.setRotationPoint(-0.01F, -1.1921F, -2.9723F);
        this.head.addChild(headSlope);
        this.setRotateAngle(headSlope, 0.0848F, 0.0F, 0.0F);
        this.headSlope.cubeList.add(new ModelBox(headSlope, 0, 47, -1.48F, 0.0F, 0.0F, 3, 1, 3, -0.003F, false));

        this.upperJawback = new ModelRenderer(this);
        this.upperJawback.setRotationPoint(0.0F, -0.7621F, -2.9323F);
        this.head.addChild(upperJawback);
        this.setRotateAngle(upperJawback, 0.2759F, 0.0F, 0.0F);
        this.upperJawback.cubeList.add(new ModelBox(upperJawback, 48, 26, -0.99F, 0.0F, -3.0F, 2, 2, 3, 0.003F, false));

        this.upperJawslopefront = new ModelRenderer(this);
        this.upperJawslopefront.setRotationPoint(0.01F, -0.41F, -0.02F);
        this.upperJawback.addChild(upperJawslopefront);
        this.setRotateAngle(upperJawslopefront, 0.1061F, 0.0F, 0.0F);
        this.upperJawslopefront.cubeList.add(new ModelBox(upperJawslopefront, 48, 37, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.upperJawslopeback = new ModelRenderer(this);
        this.upperJawslopeback.setRotationPoint(-0.02F, 0.0F, 0.0F);
        this.upperJawslopefront.addChild(upperJawslopeback);
        this.setRotateAngle(upperJawslopeback, -0.3609F, 0.0F, 0.0F);
        this.upperJawslopeback.cubeList.add(new ModelBox(upperJawslopeback, 29, 35, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.upperJawfront = new ModelRenderer(this);
        this.upperJawfront.setRotationPoint(0.0F, 2.0F, -2.55F);
        this.upperJawback.addChild(upperJawfront);
        this.setRotateAngle(upperJawfront, -0.0424F, 0.0F, 0.0F);
        this.upperJawfront.cubeList.add(new ModelBox(upperJawfront, 57, 40, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.snoutSlopefront = new ModelRenderer(this);
        this.snoutSlopefront.setRotationPoint(-0.01F, -1.0F, -2.0F);
        this.upperJawfront.addChild(snoutSlopefront);
        this.setRotateAngle(snoutSlopefront, 0.7641F, 0.0F, 0.0F);
        this.snoutSlopefront.cubeList.add(new ModelBox(snoutSlopefront, 46, 26, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.snoutSlopeback = new ModelRenderer(this);
        this.snoutSlopeback.setRotationPoint(0.02F, 0.0F, 1.0F);
        this.snoutSlopefront.addChild(snoutSlopeback);
        this.setRotateAngle(snoutSlopeback, -0.3396F, 0.0F, 0.0F);
        this.snoutSlopeback.cubeList.add(new ModelBox(snoutSlopeback, 59, 44, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.leftUpperteeth = new ModelRenderer(this);
        this.leftUpperteeth.setRotationPoint(-0.2F, -0.4F, -1.95F);
        this.upperJawfront.addChild(leftUpperteeth);
        this.setRotateAngle(leftUpperteeth, 0.1274F, -0.1485F, 0.0F);
        this.leftUpperteeth.cubeList.add(new ModelBox(leftUpperteeth, 49, 1, 0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.rightUpperteeth = new ModelRenderer(this);
        this.rightUpperteeth.setRotationPoint(0.2F, -0.4F, -1.95F);
        this.upperJawfront.addChild(rightUpperteeth);
        this.setRotateAngle(rightUpperteeth, 0.1274F, 0.1485F, 0.0F);
        this.rightUpperteeth.cubeList.add(new ModelBox(rightUpperteeth, 46, 48, 0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.lowerJawbase = new ModelRenderer(this);
        this.lowerJawbase.setRotationPoint(0.0F, 1.3079F, 0.0677F);
        this.head.addChild(lowerJawbase);
        this.setRotateAngle(lowerJawbase, 0.3491F, 0.0F, 0.0F);
        this.lowerJawbase.cubeList.add(new ModelBox(lowerJawbase, 36, 52, 0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.lowerJawbase.cubeList.add(new ModelBox(lowerJawbase, 6, 13, 0.75F, 0.0993F, -2.7616F, 1, 1, 1, -0.2F, false));
        this.lowerJawbase.cubeList.add(new ModelBox(lowerJawbase, 6, 13, -1.73F, 0.0993F, -2.7616F, 1, 1, 1, -0.2F, true));
        this.lowerJawbase.cubeList.add(new ModelBox(lowerJawbase, 36, 52, -1.48F, 0.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.lowerJawmiddle = new ModelRenderer(this);
        this.lowerJawmiddle.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.lowerJawbase.addChild(lowerJawmiddle);
        this.setRotateAngle(lowerJawmiddle, 0.2759F, 0.0F, 0.0F);
        this.lowerJawmiddle.cubeList.add(new ModelBox(lowerJawmiddle, 48, 32, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.lowerJawfront = new ModelRenderer(this);
        this.lowerJawfront.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.lowerJawmiddle.addChild(lowerJawfront);
        this.setRotateAngle(lowerJawfront, -0.0424F, 0.0F, 0.0F);
        this.lowerJawfront.cubeList.add(new ModelBox(lowerJawfront, 57, 5, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.leftLowerteeth = new ModelRenderer(this);
        this.leftLowerteeth.setRotationPoint(-0.17F, -0.8F, -1.95F);
        this.lowerJawfront.addChild(leftLowerteeth);
        this.setRotateAngle(leftLowerteeth, -0.1911F, -0.1485F, 0.0F);
        this.leftLowerteeth.cubeList.add(new ModelBox(leftLowerteeth, 30, 48, 0.0F, -1.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.rightLowerteeth = new ModelRenderer(this);
        this.rightLowerteeth.setRotationPoint(0.17F, -0.8F, -1.95F);
        this.lowerJawfront.addChild(rightLowerteeth);
        this.setRotateAngle(rightLowerteeth, -0.1911F, 0.1485F, 0.0F);
        this.rightLowerteeth.cubeList.add(new ModelBox(rightLowerteeth, 14, 13, 0.0F, -1.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.lowerJawslope = new ModelRenderer(this);
        this.lowerJawslope.setRotationPoint(-0.01F, 0.0F, -0.7F);
        this.lowerJawmiddle.addChild(lowerJawslope);
        this.setRotateAngle(lowerJawslope, -0.2103F, 0.0F, 0.0F);
        this.lowerJawslope.cubeList.add(new ModelBox(lowerJawslope, 52, 52, 0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
        this.lowerJawslope.cubeList.add(new ModelBox(lowerJawslope, 52, 52, -1.46F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.leftEye = new ModelRenderer(this);
        this.leftEye.setRotationPoint(1.0F, -0.1421F, -2.3523F);
        this.head.addChild(leftEye);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 31, 42, -0.47F, -0.5F, -0.1F, 1, 1, 1, 0.0F, false));
        this.leftEye.cubeList.add(new ModelBox(leftEye, 6, 13, -0.25F, -0.5F, -0.1F, 1, 1, 1, -0.2F, false));
        this.leftEye.cubeList.add(new ModelBox(leftEye, 50, 59, -0.25F, -0.6107F, 1.3099F, 1, 2, 1, -0.2F, false));
        this.leftEye.cubeList.add(new ModelBox(leftEye, 6, 13, -2.73F, -0.5F, -0.1F, 1, 1, 1, -0.2F, true));
        this.leftEye.cubeList.add(new ModelBox(leftEye, 31, 42, -2.51F, -0.5F, -0.1F, 1, 1, 1, 0.0F, true));
        this.leftEye.cubeList.add(new ModelBox(leftEye, 50, 59, -2.73F, -0.6107F, 1.3099F, 1, 2, 1, -0.2F, true));

        this.rightEye_r1 = new ModelRenderer(this);
        this.rightEye_r1.setRotationPoint(-2.2F, 0.0328F, 0.4307F);
        this.leftEye.addChild(rightEye_r1);
        this.setRotateAngle(rightEye_r1, 0.0873F, 0.0F, 0.0F);
        this.rightEye_r1.cubeList.add(new ModelBox(rightEye_r1, 56, 34, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.2F, true));
        this.rightEye_r1.cubeList.add(new ModelBox(rightEye_r1, 56, 34, 1.92F, -1.0F, -1.0F, 1, 2, 2, -0.2F, false));

        this.rightEye_r2 = new ModelRenderer(this);
        this.rightEye_r2.setRotationPoint(-2.23F, 0.4605F, -1.1893F);
        this.leftEye.addChild(rightEye_r2);
        this.setRotateAngle(rightEye_r2, -1.2654F, 0.0F, 0.0F);
        this.rightEye_r2.cubeList.add(new ModelBox(rightEye_r2, 49, 58, 0.0F, -0.6133F, -0.8832F, 1, 2, 2, -0.2F, true));
        this.rightEye_r2.cubeList.add(new ModelBox(rightEye_r2, 49, 58, 1.48F, -0.6133F, -0.8832F, 1, 2, 2, -0.2F, false));

        this.chestSlope = new ModelRenderer(this);
        this.chestSlope.setRotationPoint(0.01F, 4.7043F, -7.9493F);
        this.bodyFront.addChild(chestSlope);
        this.setRotateAngle(chestSlope, -0.4033F, 0.0F, 0.0F);
        this.chestSlope.cubeList.add(new ModelBox(chestSlope, 51, 47, 0.7F, -0.5F, -0.3F, 1, 1, 3, 0.0F, false));
        this.chestSlope.cubeList.add(new ModelBox(chestSlope, 51, 47, -1.72F, -0.5F, -0.3F, 1, 1, 3, 0.0F, true));

        this.chestSlope_r1 = new ModelRenderer(this);
        this.chestSlope_r1.setRotationPoint(-1.22F, 0.0F, 2.6F);
        this.chestSlope.addChild(chestSlope_r1);
        this.setRotateAngle(chestSlope_r1, 0.1992F, -0.7214F, 0.1446F);
        this.chestSlope_r1.cubeList.add(new ModelBox(chestSlope_r1, 40, 31, -0.5F, 0.0F, -0.6F, 1, 0, 5, 0.0F, true));

        this.chestSlope_r2 = new ModelRenderer(this);
        this.chestSlope_r2.setRotationPoint(-1.22F, 0.0F, 2.6F);
        this.chestSlope.addChild(chestSlope_r2);
        this.setRotateAngle(chestSlope_r2, 0.5539F, -0.9538F, -0.0377F);
        this.chestSlope_r2.cubeList.add(new ModelBox(chestSlope_r2, 43, 5, -0.5F, 0.0F, -0.1F, 1, 0, 3, 0.0F, true));

        this.chestSlope_r3 = new ModelRenderer(this);
        this.chestSlope_r3.setRotationPoint(1.2F, 0.0F, 2.6F);
        this.chestSlope.addChild(chestSlope_r3);
        this.setRotateAngle(chestSlope_r3, 0.1992F, 0.7214F, -0.1446F);
        this.chestSlope_r3.cubeList.add(new ModelBox(chestSlope_r3, 40, 31, -0.5F, 0.0F, -0.6F, 1, 0, 5, 0.0F, false));

        this.chestSlope_r4 = new ModelRenderer(this);
        this.chestSlope_r4.setRotationPoint(1.2F, 0.0F, 2.6F);
        this.chestSlope.addChild(chestSlope_r4);
        this.setRotateAngle(chestSlope_r4, 0.5539F, 0.9538F, 0.0377F);
        this.chestSlope_r4.cubeList.add(new ModelBox(chestSlope_r4, 43, 5, -0.5F, 0.0F, -0.1F, 1, 0, 3, 0.0F, false));

        this.leftUpperarm = new ModelRenderer(this);
        this.leftUpperarm.setRotationPoint(3.5F, 4.2043F, -5.9493F);
        this.bodyFront.addChild(leftUpperarm);
        this.setRotateAngle(leftUpperarm, -1.0894F, 0.1836F, -0.3254F);
        this.leftUpperarm.cubeList.add(new ModelBox(leftUpperarm, 19, 26, -0.3291F, 1.5301F, -0.91F, 1, 3, 1, 0.0F, false));
        this.leftUpperarm.cubeList.add(new ModelBox(leftUpperarm, 7, 55, -0.3291F, -0.4699F, -0.91F, 1, 2, 2, 0.0F, false));

        this.leftLowerarm = new ModelRenderer(this);
        this.leftLowerarm.setRotationPoint(-0.2291F, 4.5301F, -0.41F);
        this.leftUpperarm.addChild(leftLowerarm);
        this.setRotateAngle(leftLowerarm, -1.1675F, 0.0424F, 0.0637F);
        this.leftLowerarm.cubeList.add(new ModelBox(leftLowerarm, 34, 57, -0.0029F, -0.5639F, -0.0419F, 1, 4, 1, 0.0F, false));
        this.leftLowerarm.cubeList.add(new ModelBox(leftLowerarm, 0, 57, -0.0029F, -0.5639F, -1.1419F, 1, 4, 1, -0.2F, false));

        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2971F, 2.9361F, -0.0419F);
        this.leftLowerarm.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.267F, -0.0706F, 0.592F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 0, 13, 0.0F, 0.0F, -1.5F, 1, 4, 3, 0.0F, false));

        this.rightUpperarm = new ModelRenderer(this);
        this.rightUpperarm.setRotationPoint(-3.5F, 4.2043F, -5.9493F);
        this.bodyFront.addChild(rightUpperarm);
        this.setRotateAngle(rightUpperarm, -0.3768F, 0.0666F, 0.081F);
        this.rightUpperarm.cubeList.add(new ModelBox(rightUpperarm, 11, 26, -0.6709F, 1.5301F, -0.91F, 1, 3, 1, 0.0F, false));
        this.rightUpperarm.cubeList.add(new ModelBox(rightUpperarm, 54, 21, -0.6709F, -0.4699F, -0.91F, 1, 2, 2, 0.0F, false));

        this.rightLowerarm = new ModelRenderer(this);
        this.rightLowerarm.setRotationPoint(0.2291F, 4.5301F, -0.41F);
        this.rightUpperarm.addChild(rightLowerarm);
        this.setRotateAngle(rightLowerarm, -1.1621F, -0.1627F, -0.1156F);
        this.rightLowerarm.cubeList.add(new ModelBox(rightLowerarm, 14, 55, -0.9971F, -0.5639F, -0.0419F, 1, 4, 1, 0.0F, false));
        this.rightLowerarm.cubeList.add(new ModelBox(rightLowerarm, 0, 37, -0.9971F, -0.5639F, -1.1419F, 1, 4, 1, -0.2F, false));

        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2971F, 2.9361F, -0.0419F);
        this.rightLowerarm.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2559F, 0.1045F, -0.7189F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 0, 0, -1.0F, 0.0F, -1.5F, 1, 4, 3, 0.0F, false));

        this.bellySlope = new ModelRenderer(this);
        this.bellySlope.setRotationPoint(-0.01F, 7.5265F, -7.569F);
        this.bodyMiddle.addChild(bellySlope);
        this.setRotateAngle(bellySlope, -0.2546F, 0.0F, 0.0F);


        this.tailBase = new ModelRenderer(this);
        this.tailBase.setRotationPoint(0.0F, 0.2961F, 5.2741F);
        this.hips.addChild(tailBase);
        this.setRotateAngle(tailBase, -0.0012F, -0.0436F, 0.0F);


        this.tailBase_r1 = new ModelRenderer(this);
        this.tailBase_r1.setRotationPoint(0.0F, -0.4219F, 0.3174F);
        this.tailBase.addChild(tailBase_r1);
        this.setRotateAngle(tailBase_r1, -0.3927F, 0.0F, 0.0F);
        this.tailBase_r1.cubeList.add(new ModelBox(tailBase_r1, 20, 0, 0.0F, -2.2599F, 4.7391F, 0, 1, 1, 0.0F, false));
        this.tailBase_r1.cubeList.add(new ModelBox(tailBase_r1, 5, 32, 0.0F, -1.6477F, 2.8116F, 0, 1, 1, 0.0F, false));
        this.tailBase_r1.cubeList.add(new ModelBox(tailBase_r1, 36, 0, 0.0F, -1.2151F, 0.7959F, 0, 1, 1, 0.0F, false));

        this.tailBase_r2 = new ModelRenderer(this);
        this.tailBase_r2.setRotationPoint(0.0F, 3.1285F, 2.9434F);
        this.tailBase.addChild(tailBase_r2);
        this.setRotateAngle(tailBase_r2, 0.2618F, 0.0F, 0.0F);
        this.tailBase_r2.cubeList.add(new ModelBox(tailBase_r2, 5, 59, 0.0F, -0.7128F, 3.4218F, 0, 3, 1, 0.0F, false));
        this.tailBase_r2.cubeList.add(new ModelBox(tailBase_r2, 5, 26, 0.0F, -2.1064F, 1.4609F, 0, 4, 1, 0.0F, false));
        this.tailBase_r2.cubeList.add(new ModelBox(tailBase_r2, 31, 11, 0.0F, -2.5F, -0.5F, 0, 4, 1, 0.0F, false));

        this.tailBase_r3 = new ModelRenderer(this);
        this.tailBase_r3.setRotationPoint(0.0F, 0.5525F, 0.3258F);
        this.tailBase.addChild(tailBase_r3);
        this.setRotateAngle(tailBase_r3, 0.3491F, 0.0F, 0.0F);
        this.tailBase_r3.cubeList.add(new ModelBox(tailBase_r3, 14, 13, 0.0F, 0.4914F, -0.3695F, 0, 2, 1, 0.0F, false));

        this.tailBase_r4 = new ModelRenderer(this);
        this.tailBase_r4.setRotationPoint(0.0F, -0.0458F, 0.0208F);
        this.tailBase.addChild(tailBase_r4);
        this.setRotateAngle(tailBase_r4, -0.1309F, 0.0F, 0.0F);
        this.tailBase_r4.cubeList.add(new ModelBox(tailBase_r4, 26, 0, -0.5F, -0.4553F, 0.011F, 1, 1, 7, 0.0F, false));

        this.tailMiddlebase = new ModelRenderer(this);
        this.tailMiddlebase.setRotationPoint(0.0F, 0.7976F, 6.9764F);
        this.tailBase.addChild(tailMiddlebase);
        this.setRotateAngle(tailMiddlebase, -0.0412F, -0.0436F, 0.0018F);


        this.tailBase_r5 = new ModelRenderer(this);
        this.tailBase_r5.setRotationPoint(0.0F, 2.339F, -4.1088F);
        this.tailMiddlebase.addChild(tailBase_r5);
        this.setRotateAngle(tailBase_r5, 0.2618F, 0.0F, 0.0F);
        this.tailBase_r5.cubeList.add(new ModelBox(tailBase_r5, 19, 13, 0.0F, 1.359F, 11.3442F, 0, 2, 1, 0.0F, false));
        this.tailBase_r5.cubeList.add(new ModelBox(tailBase_r5, 16, 37, 0.0F, 1.1329F, 9.357F, 0, 2, 1, 0.0F, false));
        this.tailBase_r5.cubeList.add(new ModelBox(tailBase_r5, 55, 59, 0.0F, -0.0931F, 7.3698F, 0, 3, 1, 0.0F, false));
        this.tailBase_r5.cubeList.add(new ModelBox(tailBase_r5, 58, 59, 0.0F, -0.3192F, 5.3827F, 0, 3, 1, 0.0F, false));

        this.tailBase_r6 = new ModelRenderer(this);
        this.tailBase_r6.setRotationPoint(0.0F, -1.2113F, -6.7349F);
        this.tailMiddlebase.addChild(tailBase_r6);
        this.setRotateAngle(tailBase_r6, -0.3927F, 0.0F, 0.0F);
        this.tailBase_r6.cubeList.add(new ModelBox(tailBase_r6, 37, 14, 0.0F, -4.9635F, 14.0747F, 0, 1, 1, 0.0F, false));
        this.tailBase_r6.cubeList.add(new ModelBox(tailBase_r6, 39, 21, 0.0F, -4.5504F, 12.2229F, 0, 1, 1, 0.0F, false));
        this.tailBase_r6.cubeList.add(new ModelBox(tailBase_r6, 43, 5, 0.0F, -3.9486F, 10.2511F, 0, 1, 1, 0.0F, false));
        this.tailBase_r6.cubeList.add(new ModelBox(tailBase_r6, 20, 44, 0.0F, -2.728F, 6.6678F, 0, 1, 1, 0.0F, false));
        this.tailBase_r6.cubeList.add(new ModelBox(tailBase_r6, 20, 44, 0.0F, -3.3982F, 8.3651F, 0, 1, 1, 0.0F, false));

        this.tailMiddlebase_r1 = new ModelRenderer(this);
        this.tailMiddlebase_r1.setRotationPoint(0.0F, 0.1676F, -0.0735F);
        this.tailMiddlebase.addChild(tailMiddlebase_r1);
        this.setRotateAngle(tailMiddlebase_r1, -0.0524F, 0.0F, 0.0F);
        this.tailMiddlebase_r1.cubeList.add(new ModelBox(tailMiddlebase_r1, 14, 13, -0.5F, -0.5577F, -0.0597F, 1, 1, 9, -0.003F, false));

        this.tailMiddle = new ModelRenderer(this);
        this.tailMiddle.setRotationPoint(0.0F, 0.6046F, 8.7822F);
        this.tailMiddlebase.addChild(tailMiddle);
        this.setRotateAngle(tailMiddle, 0.0025F, -0.0873F, -0.0002F);


        this.tailBase_r7 = new ModelRenderer(this);
        this.tailBase_r7.setRotationPoint(0.0F, 0.7256F, 1.0229F);
        this.tailMiddle.addChild(tailBase_r7);
        this.setRotateAngle(tailBase_r7, 0.4363F, 0.0F, 0.0F);
        this.tailBase_r7.cubeList.add(new ModelBox(tailBase_r7, 0, 47, 0.0F, 1.4054F, 5.3365F, 0, 1, 1, 0.0F, false));
        this.tailBase_r7.cubeList.add(new ModelBox(tailBase_r7, 47, 37, 0.0F, 0.8064F, 3.4179F, 0, 1, 1, 0.0F, false));
        this.tailBase_r7.cubeList.add(new ModelBox(tailBase_r7, 49, 14, 0.0F, 0.4032F, 1.4589F, 0, 1, 1, 0.0F, false));
        this.tailBase_r7.cubeList.add(new ModelBox(tailBase_r7, 8, 60, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.tailMiddle_r1 = new ModelRenderer(this);
        this.tailMiddle_r1.setRotationPoint(0.0F, 0.0988F, 0.0255F);
        this.tailMiddle.addChild(tailMiddle_r1);
        this.setRotateAngle(tailMiddle_r1, 0.0436F, 0.0F, 0.0F);
        this.tailMiddle_r1.cubeList.add(new ModelBox(tailMiddle_r1, 0, 27, -0.5F, -0.6004F, -0.118F, 1, 1, 8, 0.0F, false));

        this.tailMiddleend = new ModelRenderer(this);
        this.tailMiddleend.setRotationPoint(0.0F, -0.451F, 7.9823F);
        this.tailMiddle.addChild(tailMiddleend);
        this.setRotateAngle(tailMiddleend, -0.0201F, -0.0436F, 0.0009F);


        this.tailMiddleend_r1 = new ModelRenderer(this);
        this.tailMiddleend_r1.setRotationPoint(0.0F, 0.4559F, -0.1303F);
        this.tailMiddleend.addChild(tailMiddleend_r1);
        this.setRotateAngle(tailMiddleend_r1, 0.1309F, 0.0F, 0.0F);
        this.tailMiddleend_r1.cubeList.add(new ModelBox(tailMiddleend_r1, 16, 24, -0.5F, -0.8252F, 0.0091F, 1, 1, 9, -0.003F, false));

        this.tailEnd = new ModelRenderer(this);
        this.tailEnd.setRotationPoint(0.0F, -1.2216F, 8.7077F);
        this.tailMiddleend.addChild(tailEnd);
        this.setRotateAngle(tailEnd, 0.1975F, -0.1712F, -0.0341F);


        this.tailEnd_r1 = new ModelRenderer(this);
        this.tailEnd_r1.setRotationPoint(0.0F, 0.1781F, 0.122F);
        this.tailEnd.addChild(tailEnd_r1);
        this.setRotateAngle(tailEnd_r1, 0.1309F, 0.0F, 0.0F);
        this.tailEnd_r1.cubeList.add(new ModelBox(tailEnd_r1, 0, 13, -0.5F, -0.5118F, -0.2607F, 1, 1, 11, 0.0F, false));

        this.rightThigh = new ModelRenderer(this);
        this.rightThigh.setRotationPoint(3.1F, 1.5342F, 0.639F);
        this.hips.addChild(rightThigh);
        this.setRotateAngle(rightThigh, 0.0696F, 0.0F, 0.0F);
        this.rightThigh.cubeList.add(new ModelBox(rightThigh, 43, 40, -0.5F, -0.7682F, -0.9295F, 1, 9, 2, 0.0F, false));

        this.rightThigh_r1 = new ModelRenderer(this);
        this.rightThigh_r1.setRotationPoint(0.5F, 0.2318F, 0.0705F);
        this.rightThigh.addChild(rightThigh_r1);
        this.setRotateAngle(rightThigh_r1, 0.5236F, 0.0F, 0.0F);
        this.rightThigh_r1.cubeList.add(new ModelBox(rightThigh_r1, 22, 35, -1.0F, -0.4F, -0.7F, 1, 2, 2, -0.2F, false));

        this.rightShin = new ModelRenderer(this);
        this.rightShin.setRotationPoint(0.0F, 7.8288F, -0.3811F);
        this.rightThigh.addChild(rightShin);
        this.setRotateAngle(rightShin, 0.5943F, 0.0F, 0.0F);
        this.rightShin.cubeList.add(new ModelBox(rightShin, 54, 0, -0.5F, -0.5F, -0.5F, 1, 2, 2, 0.004F, false));
        this.rightShin.cubeList.add(new ModelBox(rightShin, 24, 53, -0.5F, 1.5F, -0.2F, 1, 6, 1, 0.0F, false));
        this.rightShin.cubeList.add(new ModelBox(rightShin, 19, 53, -0.5F, 1.3F, 0.8F, 1, 6, 1, -0.2F, false));

        this.rightAnkle = new ModelRenderer(this);
        this.rightAnkle.setRotationPoint(-0.01F, 6.9622F, 1.0637F);
        this.rightShin.addChild(rightAnkle);
        this.setRotateAngle(rightAnkle, -0.4882F, 0.0F, 0.0F);
        this.rightAnkle.cubeList.add(new ModelBox(rightAnkle, 45, 54, -0.5F, -0.1387F, -0.5359F, 1, 5, 1, 0.0F, false));

        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 4.5613F, -0.2859F);
        this.rightAnkle.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.1485F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 39, 21, -2.0F, -0.2F, -2.0F, 4, 1, 3, 0.0F, false));

        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 0.29F, -1.5F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 37, 9, -2.5F, -0.5F, -3.0F, 5, 1, 3, 0.0F, false));

        this.leftThigh = new ModelRenderer(this);
        this.leftThigh.setRotationPoint(-3.1F, 1.5342F, 0.639F);
        this.hips.addChild(leftThigh);
        this.setRotateAngle(leftThigh, -0.1485F, 0.0F, 0.0F);
        this.leftThigh.cubeList.add(new ModelBox(leftThigh, 36, 40, -0.5F, -0.7682F, -0.9295F, 1, 9, 2, 0.0F, false));

        this.leftThigh_r1 = new ModelRenderer(this);
        this.leftThigh_r1.setRotationPoint(-0.5F, 0.2318F, 0.0705F);
        this.leftThigh.addChild(leftThigh_r1);
        this.setRotateAngle(leftThigh_r1, 0.5236F, 0.0F, 0.0F);
        this.leftThigh_r1.cubeList.add(new ModelBox(leftThigh_r1, 26, 0, 0.0F, -0.4F, -0.7F, 1, 2, 2, -0.2F, false));

        this.leftShin = new ModelRenderer(this);
        this.leftShin.setRotationPoint(0.0F, 7.8288F, -0.3811F);
        this.leftThigh.addChild(leftShin);
        this.setRotateAngle(leftShin, 1.0306F, 0.0F, 0.0F);
        this.leftShin.cubeList.add(new ModelBox(leftShin, 28, 24, -0.5F, -0.5F, -0.5F, 1, 2, 2, 0.004F, false));
        this.leftShin.cubeList.add(new ModelBox(leftShin, 26, 11, -0.5F, 1.5F, -0.2F, 1, 6, 1, 0.0F, false));
        this.leftShin.cubeList.add(new ModelBox(leftShin, 0, 26, -0.5F, 1.3F, 0.8F, 1, 6, 1, -0.2F, false));

        this.leftAnkle = new ModelRenderer(this);
        this.leftAnkle.setRotationPoint(0.01F, 6.9622F, 1.0637F);
        this.leftShin.addChild(leftAnkle);
        this.setRotateAngle(leftAnkle, -0.4882F, 0.0F, 0.0F);
        this.leftAnkle.cubeList.add(new ModelBox(leftAnkle, 29, 54, -0.5F, -0.1387F, -0.5359F, 1, 5, 1, 0.0F, false));

        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 4.5613F, -0.2859F);
        this.leftAnkle.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.6285F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 37, 14, -2.0F, -0.2F, -2.0F, 4, 1, 3, 0.0F, false));

        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 0.29F, -1.5F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, -0.4363F, 0.0F, 0.0F);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 36, 0, -2.5F, -0.5F, -3.0F, 5, 1, 3, 0.0F, false));

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
