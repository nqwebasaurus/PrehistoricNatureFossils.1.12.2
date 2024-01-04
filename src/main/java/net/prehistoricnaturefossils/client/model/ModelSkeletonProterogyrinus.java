package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonProterogyrinus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer main;
    private final ModelRenderer neck10_r1;
    private final ModelRenderer neck6_r1;
    private final ModelRenderer bodymiddle_r1;
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
    private final ModelRenderer bodyfront;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer bodyfront_r1;
    private final ModelRenderer bodyfront_r2;
    private final ModelRenderer bodyfront_r3;
    private final ModelRenderer bodyfront_r4;
    private final ModelRenderer neck_r1;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer bodyfront_r5;
    private final ModelRenderer FLupper;
    private final ModelRenderer box_r1;
    private final ModelRenderer FLlower;
    private final ModelRenderer FLfoot;
    private final ModelRenderer FLupper2;
    private final ModelRenderer box_r2;
    private final ModelRenderer FLlower2;
    private final ModelRenderer FLfoot2;
    private final ModelRenderer neck;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck1_r1;
    private final ModelRenderer upperhead;
    private final ModelRenderer upperhead5_r1;
    private final ModelRenderer upperhead7_r1;
    private final ModelRenderer upperhead5_r2;
    private final ModelRenderer upperhead4_r1;
    private final ModelRenderer upperhead2L_r1;
    private final ModelRenderer upperhead2L_r2;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw4_r1;
    private final ModelRenderer jaw4_r2;
    private final ModelRenderer jaw2_r1;
    private final ModelRenderer jaw4_r3;
    private final ModelRenderer jaw3_r2;
    private final ModelRenderer jaw3_r3;
    private final ModelRenderer jaw3_r4;
    private final ModelRenderer bodyback;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Hips_r2;
    private final ModelRenderer Hips_r3;
    private final ModelRenderer Hips_r4;
    private final ModelRenderer Hips_r5;
    private final ModelRenderer Hips_r6;
    private final ModelRenderer bodyback_r1;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer neck11_r1;
    private final ModelRenderer cube_r42;
    private final ModelRenderer tail1;
    private final ModelRenderer tail1fluke_r1;
    private final ModelRenderer tail1fluke_r2;
    private final ModelRenderer tail1fluke_r3;
    private final ModelRenderer tail1_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3_r1;
    private final ModelRenderer tail1fluke_r4;
    private final ModelRenderer tail1fluke_r5;
    private final ModelRenderer tail2_r1;
    private final ModelRenderer tail1fluke_r6;
    private final ModelRenderer tail1fluke_r7;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4_r1;
    private final ModelRenderer tail1fluke_r8;
    private final ModelRenderer BLupper;
    private final ModelRenderer box_r3;
    private final ModelRenderer BLlower;
    private final ModelRenderer BLfoot;
    private final ModelRenderer BLupper2;
    private final ModelRenderer box_r4;
    private final ModelRenderer BLlower2;
    private final ModelRenderer BLfoot2;

    public ModelSkeletonProterogyrinus() {
        this.textureWidth = 53;
        this.textureHeight = 53;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.5F, -8.0F, -1.0F);
        this.fossil.addChild(main);


        this.neck10_r1 = new ModelRenderer(this);
        this.neck10_r1.setRotationPoint(-0.5F, -0.8355F, -1.2808F);
        this.main.addChild(neck10_r1);
        this.setRotateAngle(neck10_r1, -0.0785F, 0.0F, 0.0F);
        this.neck10_r1.cubeList.add(new ModelBox(neck10_r1, 46, 5, 0.0F, -1.0F, 5.5F, 0, 2, 1, 0.0F, false));
        this.neck10_r1.cubeList.add(new ModelBox(neck10_r1, 6, 46, 0.0F, -1.0F, 3.5F, 0, 2, 1, 0.0F, false));
        this.neck10_r1.cubeList.add(new ModelBox(neck10_r1, 9, 46, 0.0F, -1.0F, 1.5F, 0, 2, 1, 0.0F, false));
        this.neck10_r1.cubeList.add(new ModelBox(neck10_r1, 46, 17, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.neck6_r1 = new ModelRenderer(this);
        this.neck6_r1.setRotationPoint(-0.5F, -0.818F, -3.2808F);
        this.main.addChild(neck6_r1);
        this.setRotateAngle(neck6_r1, 0.0087F, 0.0F, 0.0F);
        this.neck6_r1.cubeList.add(new ModelBox(neck6_r1, 46, 21, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.bodymiddle_r1 = new ModelRenderer(this);
        this.bodymiddle_r1.setRotationPoint(0.0F, 0.0F, -3.8F);
        this.main.addChild(bodymiddle_r1);
        this.setRotateAngle(bodymiddle_r1, -0.0349F, 0.0F, 0.0F);
        this.bodymiddle_r1.cubeList.add(new ModelBox(bodymiddle_r1, 0, 12, -1.0F, -0.2F, 0.0F, 1, 1, 10, 0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.8F, 0.4315F, 4.3101F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0588F, 0.0224F, -0.8741F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 28, -2.86F, -0.5415F, -0.12F, 2, 0, 1, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.8F, 0.4315F, 4.3101F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0335F, 0.0645F, -0.3078F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 9, -1.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.8F, 0.4315F, 2.3101F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0335F, 0.0645F, -0.238F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 0, -1.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.8F, 0.4315F, 2.3101F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0588F, 0.0224F, -0.8042F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 14, -3.86F, -0.5415F, -0.12F, 3, 0, 1, 0.0F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.8F, 0.3315F, 0.3101F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0335F, 0.0645F, -0.2205F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 47, 41, -1.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.8F, 0.3315F, 0.3101F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0588F, 0.0224F, -0.7868F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 19, -3.86F, -0.5415F, -0.12F, 3, 0, 1, 0.0F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.8F, 0.2315F, -1.6899F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0588F, 0.0224F, -0.7868F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 20, -3.86F, -0.5415F, -0.12F, 3, 0, 1, 0.0F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.8F, 0.2315F, -1.6899F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0335F, 0.0645F, -0.2205F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 20, -1.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.8F, 0.2315F, -3.6899F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0592F, 0.1458F, -0.7906F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 0, -3.86F, -0.5415F, -0.12F, 3, 0, 1, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.8F, 0.2315F, -3.6899F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0332F, 0.1686F, -0.2166F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 48, -1.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.2F, 0.4315F, 4.3101F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0335F, -0.0645F, 0.3078F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 46, 9, 0.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.2F, 0.4315F, 4.3101F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0588F, -0.0224F, 0.8741F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 28, 0.86F, -0.5415F, -0.12F, 2, 0, 1, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.2F, 0.4315F, 2.3101F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0335F, -0.0645F, 0.238F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 47, 0, 0.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.2F, 0.4315F, 2.3101F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0588F, -0.0224F, 0.8042F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 14, 0.86F, -0.5415F, -0.12F, 3, 0, 1, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.2F, 0.3315F, 0.3101F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0335F, -0.0645F, 0.2205F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 47, 41, 0.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.2F, 0.3315F, 0.3101F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0588F, -0.0224F, 0.7868F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 13, 19, 0.86F, -0.5415F, -0.12F, 3, 0, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.2F, 0.2315F, -1.6899F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0335F, -0.0645F, 0.2205F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 48, 20, 0.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.2F, 0.2315F, -1.6899F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0588F, -0.0224F, 0.7868F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 20, 0.86F, -0.5415F, -0.12F, 3, 0, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.2F, 0.2315F, -3.6899F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.052F, -0.0834F, 0.2142F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 48, 0.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.2F, 0.2315F, -3.6899F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.003F, -0.0841F, 0.7835F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 20, 0, 0.86F, -0.5415F, -0.12F, 3, 0, 1, 0.0F, false));

        this.bodyfront = new ModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 0.0F, -3.8F);
        this.main.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0F, 0.2182F, 0.0F);


        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(-0.5F, 1.868F, -8.4628F);
        this.bodyfront.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, 0.096F, 0.0F, 0.0F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 26, 48, 0.0F, -2.8128F, 6.6981F, 0, 2, 1, 0.0F, false));
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 41, 48, 0.0F, -2.5128F, 4.6981F, 0, 2, 1, 0.0F, false));

        this.bodyfront_r1 = new ModelRenderer(this);
        this.bodyfront_r1.setRotationPoint(-3.6F, 4.05F, -3.7F);
        this.bodyfront.addChild(bodyfront_r1);
        this.setRotateAngle(bodyfront_r1, 1.1846F, 0.1946F, -0.0112F);
        this.bodyfront_r1.cubeList.add(new ModelBox(bodyfront_r1, 0, 0, 0.1F, -1.5019F, 0.2511F, 1, 2, 3, 0.0F, true));

        this.bodyfront_r2 = new ModelRenderer(this);
        this.bodyfront_r2.setRotationPoint(-3.1F, 3.4272F, -3.9463F);
        this.bodyfront.addChild(bodyfront_r2);
        this.setRotateAngle(bodyfront_r2, 1.3861F, 0.0262F, -0.6322F);
        this.bodyfront_r2.cubeList.add(new ModelBox(bodyfront_r2, 13, 14, -0.5F, -1.1882F, -1.76F, 1, 2, 2, 0.0F, true));

        this.bodyfront_r3 = new ModelRenderer(this);
        this.bodyfront_r3.setRotationPoint(2.6F, 4.05F, -3.7F);
        this.bodyfront.addChild(bodyfront_r3);
        this.setRotateAngle(bodyfront_r3, 1.1846F, -0.1946F, 0.0112F);
        this.bodyfront_r3.cubeList.add(new ModelBox(bodyfront_r3, 0, 0, -1.1F, -1.5019F, 0.2511F, 1, 2, 3, 0.0F, false));

        this.bodyfront_r4 = new ModelRenderer(this);
        this.bodyfront_r4.setRotationPoint(2.1F, 3.4272F, -3.9463F);
        this.bodyfront.addChild(bodyfront_r4);
        this.setRotateAngle(bodyfront_r4, 1.3861F, -0.0262F, 0.6322F);
        this.bodyfront_r4.cubeList.add(new ModelBox(bodyfront_r4, 13, 14, -0.5F, -1.1882F, -1.76F, 1, 2, 2, 0.0F, false));

        this.neck_r1 = new ModelRenderer(this);
        this.neck_r1.setRotationPoint(-0.5F, 5.0F, -6.25F);
        this.bodyfront.addChild(neck_r1);
        this.setRotateAngle(neck_r1, -0.0873F, 0.0F, 0.0F);
        this.neck_r1.cubeList.add(new ModelBox(neck_r1, 35, 0, -2.0F, -0.5F, 1.05F, 4, 1, 3, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.8F, 0.4315F, -1.6899F);
        this.bodyfront.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1981F, 0.0249F, -0.2006F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 48, 43, -1.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.8F, 0.4315F, -1.6899F);
        this.bodyfront.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1583F, 0.1132F, -0.7625F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 10, 26, -3.86F, -0.5415F, -0.12F, 3, 0, 1, 0.0F, true));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.8F, 0.8315F, -3.6899F);
        this.bodyfront.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1807F, 0.1104F, -0.2017F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 45, 48, -1.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, true));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.8F, 0.8315F, -3.6899F);
        this.bodyfront.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0971F, 0.176F, -0.7713F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 35, 28, -2.86F, -0.5415F, -0.12F, 2, 0, 1, 0.0F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.2F, 0.4315F, -1.6899F);
        this.bodyfront.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0971F, -0.176F, 0.7713F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 10, 26, 0.86F, -0.5415F, -0.12F, 3, 0, 1, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.2F, 0.4315F, -1.6899F);
        this.bodyfront.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1807F, -0.1104F, 0.2017F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 48, 43, 0.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.2F, 0.8315F, -3.6899F);
        this.bodyfront.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1807F, -0.1104F, 0.2017F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 45, 48, 0.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.2F, 0.8315F, -3.6899F);
        this.bodyfront.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0971F, -0.176F, 0.7713F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 35, 28, 0.86F, -0.5415F, -0.12F, 2, 0, 1, 0.0F, false));

        this.bodyfront_r5 = new ModelRenderer(this);
        this.bodyfront_r5.setRotationPoint(-0.5F, 0.6406F, -4.8793F);
        this.bodyfront.addChild(bodyfront_r5);
        this.setRotateAngle(bodyfront_r5, 0.1658F, 0.0F, 0.0F);
        this.bodyfront_r5.cubeList.add(new ModelBox(bodyfront_r5, 24, 35, -0.5F, 0.0134F, -0.0025F, 1, 1, 5, 0.0F, false));

        this.FLupper = new ModelRenderer(this);
        this.FLupper.setRotationPoint(2.5F, 4.5F, -3.4F);
        this.bodyfront.addChild(FLupper);
        this.setRotateAngle(FLupper, 0.0F, 0.0F, -0.8727F);


        this.box_r1 = new ModelRenderer(this);
        this.box_r1.setRotationPoint(-0.9642F, -1.1491F, 0.7F);
        this.FLupper.addChild(box_r1);
        this.setRotateAngle(box_r1, -0.0873F, -0.2618F, 0.7418F);
        this.box_r1.cubeList.add(new ModelBox(box_r1, 0, 17, 1.0F, 0.0F, -1.5F, 3, 1, 1, 0.0F, false));

        this.FLlower = new ModelRenderer(this);
        this.FLlower.setRotationPoint(1.9215F, 1.3106F, 0.8F);
        this.FLupper.addChild(FLlower);
        this.setRotateAngle(FLlower, -0.2427F, -0.0992F, 0.4921F);
        this.FLlower.cubeList.add(new ModelBox(FLlower, 25, 42, -0.2772F, -0.2148F, 0.3F, 1, 4, 1, 0.0F, false));
        this.FLlower.cubeList.add(new ModelBox(FLlower, 0, 33, -0.2772F, 0.7852F, -0.7F, 1, 3, 1, -0.2F, false));

        this.FLfoot = new ModelRenderer(this);
        this.FLfoot.setRotationPoint(0.1478F, 3.1658F, 0.7259F);
        this.FLlower.addChild(FLfoot);
        this.setRotateAngle(FLfoot, 0.2264F, -0.0927F, 0.3822F);
        this.FLfoot.cubeList.add(new ModelBox(FLfoot, 36, 8, -1.51F, 0.1F, -2.5F, 3, 1, 3, 0.0F, false));

        this.FLupper2 = new ModelRenderer(this);
        this.FLupper2.setRotationPoint(-3.5F, 4.5F, -3.4F);
        this.bodyfront.addChild(FLupper2);
        this.setRotateAngle(FLupper2, 0.0F, 0.0F, 0.8727F);


        this.box_r2 = new ModelRenderer(this);
        this.box_r2.setRotationPoint(0.9642F, -1.1491F, 0.7F);
        this.FLupper2.addChild(box_r2);
        this.setRotateAngle(box_r2, -0.0873F, 0.2618F, -0.7418F);
        this.box_r2.cubeList.add(new ModelBox(box_r2, 0, 17, -4.0F, 0.0F, -1.5F, 3, 1, 1, 0.0F, true));

        this.FLlower2 = new ModelRenderer(this);
        this.FLlower2.setRotationPoint(-1.9215F, 1.3106F, 0.8F);
        this.FLupper2.addChild(FLlower2);
        this.setRotateAngle(FLlower2, -0.2427F, 0.0992F, -0.4921F);
        this.FLlower2.cubeList.add(new ModelBox(FLlower2, 25, 42, -0.7228F, -0.2148F, 0.3F, 1, 4, 1, 0.0F, true));
        this.FLlower2.cubeList.add(new ModelBox(FLlower2, 0, 33, -0.7228F, 0.7852F, -0.7F, 1, 3, 1, -0.2F, true));

        this.FLfoot2 = new ModelRenderer(this);
        this.FLfoot2.setRotationPoint(-0.1478F, 3.1658F, 0.7259F);
        this.FLlower2.addChild(FLfoot2);
        this.setRotateAngle(FLfoot2, 0.2264F, 0.0927F, -0.3822F);
        this.FLfoot2.cubeList.add(new ModelBox(FLfoot2, 36, 8, -1.49F, 0.1F, -2.5F, 3, 1, 3, 0.0F, true));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.1F, -4.7F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, -0.3228F, 0.3829F, -0.0894F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(-0.5F, 0.768F, -3.7628F);
        this.neck.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 0.096F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 3, 49, 0.0F, -1.9128F, 2.7981F, 0, 2, 1, 0.0F, false));
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 32, 35, 0.0F, -1.3128F, 0.9981F, 0, 1, 1, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.8F, 0.2315F, -0.7899F);
        this.neck.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1665F, 0.2307F, -0.67F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 49, 4, -1.86F, -0.5415F, -0.12F, 1, 0, 1, 0.0F, true));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.8F, 0.2315F, -0.7899F);
        this.neck.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.268F, 0.12F, -0.1044F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 49, 6, -1.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, true));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.2F, 0.2315F, -0.7899F);
        this.neck.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.268F, -0.12F, 0.1044F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 49, 6, 0.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.2F, 0.2315F, -0.7899F);
        this.neck.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1665F, -0.2307F, 0.67F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 49, 4, 0.86F, -0.5415F, -0.12F, 1, 0, 1, 0.0F, false));

        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(-0.5F, 0.768F, -1.7628F);
        this.neck.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.2705F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 0, 40, -0.5F, -0.7045F, 0.0073F, 1, 1, 2, -0.003F, false));

        this.neck1_r1 = new ModelRenderer(this);
        this.neck1_r1.setRotationPoint(-0.5F, 0.768F, -3.7628F);
        this.neck.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, 0.1396F, 0.0F, 0.0F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 35, 40, -0.5F, -0.4128F, 0.0981F, 1, 1, 2, 0.0F, false));

        this.upperhead = new ModelRenderer(this);
        this.upperhead.setRotationPoint(0.0F, 0.8F, -3.6F);
        this.neck.addChild(upperhead);
        this.setRotateAngle(upperhead, -0.2455F, 0.1222F, 0.1247F);
        this.upperhead.cubeList.add(new ModelBox(upperhead, 14, 32, -2.5F, -0.399F, -2.9F, 4, 2, 3, 0.02F, false));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 26, 14, -1.51F, 0.6F, -7.75F, 2, 1, 5, 0.0F, false));

        this.upperhead5_r1 = new ModelRenderer(this);
        this.upperhead5_r1.setRotationPoint(0.0F, -1.0F, -4.2F);
        this.upperhead.addChild(upperhead5_r1);
        this.setRotateAngle(upperhead5_r1, 0.0785F, 0.0F, 0.0F);
        this.upperhead5_r1.cubeList.add(new ModelBox(upperhead5_r1, 32, 35, -2.5F, -0.0765F, 1.2373F, 4, 1, 3, -0.002F, false));

        this.upperhead7_r1 = new ModelRenderer(this);
        this.upperhead7_r1.setRotationPoint(0.0F, -1.1F, -4.2F);
        this.upperhead.addChild(upperhead7_r1);
        this.setRotateAngle(upperhead7_r1, 0.0785F, 0.0F, 0.0F);
        this.upperhead7_r1.cubeList.add(new ModelBox(upperhead7_r1, 36, 13, -2.0F, 0.4183F, -0.9944F, 3, 2, 2, 0.0F, false));
        this.upperhead7_r1.cubeList.add(new ModelBox(upperhead7_r1, 40, 28, -2.0F, 0.0183F, 0.0056F, 3, 2, 2, 0.004F, false));

        this.upperhead5_r2 = new ModelRenderer(this);
        this.upperhead5_r2.setRotationPoint(0.0F, -0.4F, -6.1F);
        this.upperhead.addChild(upperhead5_r2);
        this.setRotateAngle(upperhead5_r2, 0.3229F, 0.0F, 0.0F);
        this.upperhead5_r2.cubeList.add(new ModelBox(upperhead5_r2, 13, 0, -1.5F, -0.0426F, 0.0295F, 2, 2, 2, 0.0F, false));

        this.upperhead4_r1 = new ModelRenderer(this);
        this.upperhead4_r1.setRotationPoint(0.0F, 0.6F, -7.7F);
        this.upperhead.addChild(upperhead4_r1);
        this.setRotateAngle(upperhead4_r1, 0.5672F, 0.0F, 0.0F);
        this.upperhead4_r1.cubeList.add(new ModelBox(upperhead4_r1, 26, 21, -1.5F, 0.2737F, 0.9163F, 2, 1, 1, -0.004F, false));
        this.upperhead4_r1.cubeList.add(new ModelBox(upperhead4_r1, 0, 6, -1.5F, -0.0263F, -0.0837F, 2, 1, 2, 0.002F, false));

        this.upperhead2L_r1 = new ModelRenderer(this);
        this.upperhead2L_r1.setRotationPoint(-1.5F, -0.4F, -7.8F);
        this.upperhead.addChild(upperhead2L_r1);
        this.setRotateAngle(upperhead2L_r1, 0.0F, -0.2094F, 0.0F);
        this.upperhead2L_r1.cubeList.add(new ModelBox(upperhead2L_r1, 14, 38, 0.21F, 1.3F, 0.05F, 0, 1, 5, 0.0F, true));
        this.upperhead2L_r1.cubeList.add(new ModelBox(upperhead2L_r1, 35, 21, 0.01F, 1.0F, 0.05F, 1, 1, 5, 0.003F, true));

        this.upperhead2L_r2 = new ModelRenderer(this);
        this.upperhead2L_r2.setRotationPoint(0.5F, -0.4F, -7.8F);
        this.upperhead.addChild(upperhead2L_r2);
        this.setRotateAngle(upperhead2L_r2, 0.0F, 0.2094F, 0.0F);
        this.upperhead2L_r2.cubeList.add(new ModelBox(upperhead2L_r2, 14, 38, -0.21F, 1.3F, 0.05F, 0, 1, 5, 0.0F, false));
        this.upperhead2L_r2.cubeList.add(new ModelBox(upperhead2L_r2, 35, 21, -1.01F, 1.0F, 0.05F, 1, 1, 5, 0.003F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.6F, -0.3F);
        this.upperhead.addChild(jaw);
        this.setRotateAngle(jaw, 0.6545F, 0.0F, 0.0F);


        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(0.0F, 0.8653F, -5.4957F);
        this.jaw.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, 0.0349F, 0.0F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 0, 28, -1.5F, 0.0112F, -1.8072F, 2, 1, 1, 0.0F, false));

        this.jaw4_r1 = new ModelRenderer(this);
        this.jaw4_r1.setRotationPoint(-2.0F, 0.8653F, -2.5957F);
        this.jaw.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, 0.1245F, -0.1815F, -0.0258F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 8, 35, -0.1F, -0.7924F, -4.7632F, 0, 1, 5, 0.0F, true));
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 0, 33, -0.4F, -0.4924F, -4.7632F, 1, 1, 5, 0.003F, true));

        this.jaw4_r2 = new ModelRenderer(this);
        this.jaw4_r2.setRotationPoint(-2.0F, 1.2653F, -2.1957F);
        this.jaw.addChild(jaw4_r2);
        this.setRotateAngle(jaw4_r2, 0.0089F, -0.192F, -0.0017F);
        this.jaw4_r2.cubeList.add(new ModelBox(jaw4_r2, 0, 12, -0.5F, -0.519F, -2.9825F, 1, 1, 3, 0.0F, true));

        this.jaw2_r1 = new ModelRenderer(this);
        this.jaw2_r1.setRotationPoint(-0.5F, 0.3653F, -2.5957F);
        this.jaw.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, 0.1745F, 0.0F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 0, 24, -2.0F, 0.0F, -0.05F, 1, 1, 2, 0.003F, true));
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 0, 24, 1.0F, 0.0F, -0.05F, 1, 1, 2, 0.003F, false));

        this.jaw4_r3 = new ModelRenderer(this);
        this.jaw4_r3.setRotationPoint(-0.5F, 1.4653F, -1.3957F);
        this.jaw.addChild(jaw4_r3);
        this.setRotateAngle(jaw4_r3, 0.576F, 0.0F, 0.0F);
        this.jaw4_r3.cubeList.add(new ModelBox(jaw4_r3, 5, 42, -2.0F, -0.7123F, -0.0589F, 1, 1, 2, -0.002F, true));
        this.jaw4_r3.cubeList.add(new ModelBox(jaw4_r3, 5, 42, 1.0F, -0.7123F, -0.0589F, 1, 1, 2, -0.002F, false));

        this.jaw3_r2 = new ModelRenderer(this);
        this.jaw3_r2.setRotationPoint(-0.5F, 1.7653F, -5.3957F);
        this.jaw.addChild(jaw3_r2);
        this.setRotateAngle(jaw3_r2, 0.0436F, 0.0F, 0.0F);
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 26, 2, -2.0F, -0.8925F, 3.1506F, 1, 1, 1, 0.0F, true));
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 26, 2, 1.0F, -0.8925F, 3.1506F, 1, 1, 1, 0.0F, false));

        this.jaw3_r3 = new ModelRenderer(this);
        this.jaw3_r3.setRotationPoint(1.0F, 1.2653F, -2.1957F);
        this.jaw.addChild(jaw3_r3);
        this.setRotateAngle(jaw3_r3, 0.0089F, 0.192F, 0.0017F);
        this.jaw3_r3.cubeList.add(new ModelBox(jaw3_r3, 0, 12, -0.5F, -0.519F, -2.9825F, 1, 1, 3, 0.0F, false));

        this.jaw3_r4 = new ModelRenderer(this);
        this.jaw3_r4.setRotationPoint(1.0F, 0.8653F, -2.5957F);
        this.jaw.addChild(jaw3_r4);
        this.setRotateAngle(jaw3_r4, 0.1245F, 0.1815F, 0.0258F);
        this.jaw3_r4.cubeList.add(new ModelBox(jaw3_r4, 8, 35, 0.1F, -0.7924F, -4.7632F, 0, 1, 5, 0.0F, false));
        this.jaw3_r4.cubeList.add(new ModelBox(jaw3_r4, 0, 33, -0.6F, -0.4924F, -4.7632F, 1, 1, 5, 0.003F, false));

        this.bodyback = new ModelRenderer(this);
        this.bodyback.setRotationPoint(0.0F, 0.6F, 6.1F);
        this.main.addChild(bodyback);
        this.setRotateAngle(bodyback, 0.0F, -0.1309F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-3.0F, 0.2F, 2.7F);
        this.bodyback.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.0015F, 0.0563F, -0.1323F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 27, 27, 0.9636F, 3.2092F, -3.3035F, 1, 2, 5, 0.0F, true));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(-1.9F, 2.5F, 2.7F);
        this.bodyback.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.0189F, 0.0531F, -0.4469F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 13, 5, -0.1398F, -0.9225F, -3.007F, 1, 2, 2, 0.0F, true));

        this.Hips_r3 = new ModelRenderer(this);
        this.Hips_r3.setRotationPoint(-2.489F, 1.6193F, 1.2125F);
        this.bodyback.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.8885F, 0.0725F, -0.2627F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 8, 33, -0.0684F, -1.9021F, -0.4941F, 1, 3, 1, 0.0F, true));

        this.Hips_r4 = new ModelRenderer(this);
        this.Hips_r4.setRotationPoint(1.489F, 1.6193F, 1.2125F);
        this.bodyback.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, -0.8885F, -0.0725F, 0.2627F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 8, 33, -0.9316F, -1.9021F, -0.4941F, 1, 3, 1, 0.0F, false));

        this.Hips_r5 = new ModelRenderer(this);
        this.Hips_r5.setRotationPoint(0.9F, 2.5F, 2.7F);
        this.bodyback.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, -0.0189F, -0.0531F, 0.4469F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 13, 5, -0.8602F, -0.9225F, -3.007F, 1, 2, 2, 0.0F, false));

        this.Hips_r6 = new ModelRenderer(this);
        this.Hips_r6.setRotationPoint(2.0F, 0.2F, 2.7F);
        this.bodyback.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, -0.0015F, -0.0563F, 0.1323F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 27, 27, -1.9636F, 3.2092F, -3.3035F, 1, 2, 5, 0.0F, false));

        this.bodyback_r1 = new ModelRenderer(this);
        this.bodyback_r1.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.bodyback.addChild(bodyback_r1);
        this.setRotateAngle(bodyback_r1, -0.2182F, 0.0F, 0.0F);
        this.bodyback_r1.cubeList.add(new ModelBox(bodyback_r1, 26, 0, -1.0F, -0.3938F, -0.0282F, 1, 1, 6, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.8F, 0.8315F, 4.2101F);
        this.bodyback.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1913F, -0.0101F, -0.2248F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 10, 24, -1.0243F, -0.0018F, -0.3485F, 1, 0, 1, 0.0F, true));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.8F, 0.2315F, 2.2101F);
        this.bodyback.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1527F, -0.1248F, -0.782F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 35, 30, -1.86F, -0.5415F, -0.12F, 1, 0, 1, 0.0F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.8F, 0.2315F, 2.2101F);
        this.bodyback.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1913F, -0.0101F, -0.2248F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 14, 38, -1.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.8F, -0.0685F, 0.2101F);
        this.bodyback.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0588F, 0.0224F, -1.005F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 41, 5, -1.86F, -0.5415F, -0.12F, 1, 0, 1, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.8F, -0.0685F, 0.2101F);
        this.bodyback.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0335F, 0.0645F, -0.4387F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 23, 38, -1.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.2F, 0.8315F, 4.2101F);
        this.bodyback.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1913F, 0.0101F, 0.2248F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 10, 24, 0.0243F, -0.0018F, -0.3485F, 1, 0, 1, 0.0F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.2F, 0.2315F, 2.2101F);
        this.bodyback.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.1913F, 0.0101F, 0.2248F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 14, 38, 0.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.2F, 0.2315F, 2.2101F);
        this.bodyback.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.1527F, 0.1248F, 0.782F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 35, 30, 0.86F, -0.5415F, -0.12F, 1, 0, 1, 0.0F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.2F, -0.0685F, 0.2101F);
        this.bodyback.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0588F, -0.0224F, 1.005F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 41, 5, 0.86F, -0.5415F, -0.12F, 1, 0, 1, 0.0F, false));

        this.neck11_r1 = new ModelRenderer(this);
        this.neck11_r1.setRotationPoint(-0.5F, -0.4078F, 0.5945F);
        this.bodyback.addChild(neck11_r1);
        this.setRotateAngle(neck11_r1, -0.1658F, 0.0F, 0.0F);
        this.neck11_r1.cubeList.add(new ModelBox(neck11_r1, 37, 44, 0.0F, -1.1988F, -0.5314F, 0, 2, 1, 0.0F, false));
        this.neck11_r1.cubeList.add(new ModelBox(neck11_r1, 15, 49, 0.0F, -1.1988F, 1.4686F, 0, 2, 1, 0.0F, false));
        this.neck11_r1.cubeList.add(new ModelBox(neck11_r1, 44, 33, 0.0F, -1.1988F, 3.4686F, 0, 2, 1, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.2F, -0.0685F, 0.2101F);
        this.bodyback.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0335F, -0.0645F, 0.4387F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 23, 38, 0.0243F, -0.0018F, -0.1485F, 1, 0, 1, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(-0.5F, 1.1772F, 5.9822F);
        this.bodyback.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, -0.2618F, 0.0F);


        this.tail1fluke_r1 = new ModelRenderer(this);
        this.tail1fluke_r1.setRotationPoint(0.0F, 0.024F, 2.3805F);
        this.tail1.addChild(tail1fluke_r1);
        this.setRotateAngle(tail1fluke_r1, -0.2356F, 0.0F, 0.0F);
        this.tail1fluke_r1.cubeList.add(new ModelBox(tail1fluke_r1, 12, 48, 0.0F, -2.3932F, 5.3956F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r1.cubeList.add(new ModelBox(tail1fluke_r1, 23, 48, 0.0F, -2.1932F, 3.3956F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r1.cubeList.add(new ModelBox(tail1fluke_r1, 48, 24, 0.0F, -1.9932F, 1.3956F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r1.cubeList.add(new ModelBox(tail1fluke_r1, 43, 45, 0.0F, -1.7932F, -0.6044F, 0, 2, 1, 0.0F, false));

        this.tail1fluke_r2 = new ModelRenderer(this);
        this.tail1fluke_r2.setRotationPoint(0.0F, 0.8839F, -0.2295F);
        this.tail1.addChild(tail1fluke_r2);
        this.setRotateAngle(tail1fluke_r2, 0.1134F, 0.0F, 0.0F);
        this.tail1fluke_r2.cubeList.add(new ModelBox(tail1fluke_r2, 18, 45, 0.0F, 1.7724F, 7.7334F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r2.cubeList.add(new ModelBox(tail1fluke_r2, 43, 22, 0.0F, 1.4724F, 5.7334F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r2.cubeList.add(new ModelBox(tail1fluke_r2, 0, 44, 0.0F, 1.0724F, 3.7334F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r2.cubeList.add(new ModelBox(tail1fluke_r2, 12, 44, 0.0F, 0.4724F, 1.7334F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r2.cubeList.add(new ModelBox(tail1fluke_r2, 21, 45, 0.0F, -0.0276F, -0.2666F, 0, 2, 1, 0.0F, false));

        this.tail1fluke_r3 = new ModelRenderer(this);
        this.tail1fluke_r3.setRotationPoint(0.0F, -0.337F, 0.3977F);
        this.tail1.addChild(tail1fluke_r3);
        this.setRotateAngle(tail1fluke_r3, -0.2356F, 0.0F, 0.0F);
        this.tail1fluke_r3.cubeList.add(new ModelBox(tail1fluke_r3, 30, 46, 0.0F, -1.694F, -0.5914F, 0, 2, 1, 0.0F, false));

        this.tail1_r1 = new ModelRenderer(this);
        this.tail1_r1.setRotationPoint(0.5F, 0.2F, -0.2F);
        this.tail1.addChild(tail1_r1);
        this.setRotateAngle(tail1_r1, -0.1484F, 0.0F, 0.0F);
        this.tail1_r1.cubeList.add(new ModelBox(tail1_r1, 13, 2, -1.0F, -0.6326F, -0.0285F, 1, 1, 10, 0.003F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.4579F, 9.5178F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.09F, 0.3902F, 0.0606F);


        this.tail3_r1 = new ModelRenderer(this);
        this.tail3_r1.setRotationPoint(-0.2766F, 1.2345F, 10.0158F);
        this.tail2.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, -0.0248F, 0.6244F, -0.0137F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 15, 16, -0.2546F, -0.438F, -0.1707F, 1, 1, 8, 0.003F, false));

        this.tail1fluke_r4 = new ModelRenderer(this);
        this.tail1fluke_r4.setRotationPoint(-0.2766F, 1.2345F, 10.0158F);
        this.tail2.addChild(tail1fluke_r4);
        this.setRotateAngle(tail1fluke_r4, -0.1906F, 0.6244F, -0.0137F);
        this.tail1fluke_r4.cubeList.add(new ModelBox(tail1fluke_r4, 47, 37, 0.2454F, -2.5883F, 5.6973F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r4.cubeList.add(new ModelBox(tail1fluke_r4, 40, 44, 0.2454F, -2.2883F, 3.6973F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r4.cubeList.add(new ModelBox(tail1fluke_r4, 3, 45, 0.2454F, -1.9883F, 1.6973F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r4.cubeList.add(new ModelBox(tail1fluke_r4, 15, 45, 0.2454F, -1.7883F, -0.3027F, 0, 2, 1, 0.0F, false));

        this.tail1fluke_r5 = new ModelRenderer(this);
        this.tail1fluke_r5.setRotationPoint(0.0F, -1.4339F, -7.1373F);
        this.tail2.addChild(tail1fluke_r5);
        this.setRotateAngle(tail1fluke_r5, -0.2356F, 0.0F, 0.0F);
        this.tail1fluke_r5.cubeList.add(new ModelBox(tail1fluke_r5, 20, 5, 0.0F, -3.0932F, 15.3956F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r5.cubeList.add(new ModelBox(tail1fluke_r5, 28, 26, 0.0F, -2.9932F, 13.3956F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r5.cubeList.add(new ModelBox(tail1fluke_r5, 20, 38, 0.0F, -2.8932F, 11.3956F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r5.cubeList.add(new ModelBox(tail1fluke_r5, 0, 48, 0.0F, -2.5932F, 9.3956F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r5.cubeList.add(new ModelBox(tail1fluke_r5, 43, 18, 0.0F, -2.4932F, 7.3956F, 0, 2, 1, 0.0F, false));

        this.tail2_r1 = new ModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.5F, 0.1F, 0.1F);
        this.tail2.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, -0.1222F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 0, 0, -1.0F, -0.4817F, -0.0237F, 1, 1, 10, 0.0F, false));

        this.tail1fluke_r6 = new ModelRenderer(this);
        this.tail1fluke_r6.setRotationPoint(-0.2766F, 1.2345F, 10.0158F);
        this.tail2.addChild(tail1fluke_r6);
        this.setRotateAngle(tail1fluke_r6, 0.1584F, 0.6244F, -0.0137F);
        this.tail1fluke_r6.cubeList.add(new ModelBox(tail1fluke_r6, 0, 0, 0.2454F, 0.9261F, 4.1953F, 0, 1, 1, 0.0F, false));
        this.tail1fluke_r6.cubeList.add(new ModelBox(tail1fluke_r6, 6, 0, 0.2454F, 0.8261F, 2.1953F, 0, 1, 1, 0.0F, false));
        this.tail1fluke_r6.cubeList.add(new ModelBox(tail1fluke_r6, 0, 12, 0.2454F, 0.7261F, 0.1953F, 0, 1, 1, 0.0F, false));

        this.tail1fluke_r7 = new ModelRenderer(this);
        this.tail1fluke_r7.setRotationPoint(0.0F, -0.574F, -9.7473F);
        this.tail2.addChild(tail1fluke_r7);
        this.setRotateAngle(tail1fluke_r7, 0.1134F, 0.0F, 0.0F);
        this.tail1fluke_r7.cubeList.add(new ModelBox(tail1fluke_r7, 6, 12, 0.0F, 4.5724F, 17.7334F, 0, 1, 1, 0.0F, false));
        this.tail1fluke_r7.cubeList.add(new ModelBox(tail1fluke_r7, 33, 46, 0.0F, 3.2724F, 15.7334F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r7.cubeList.add(new ModelBox(tail1fluke_r7, 46, 44, 0.0F, 2.9724F, 13.7334F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r7.cubeList.add(new ModelBox(tail1fluke_r7, 47, 13, 0.0F, 2.6724F, 11.7334F, 0, 2, 1, 0.0F, false));
        this.tail1fluke_r7.cubeList.add(new ModelBox(tail1fluke_r7, 47, 33, 0.0F, 2.2724F, 9.7334F, 0, 2, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(-2.8646F, 1.8649F, 20.5699F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0345F, 0.5215F, 0.0601F);


        this.tail4_r1 = new ModelRenderer(this);
        this.tail4_r1.setRotationPoint(3.588F, -0.6304F, -6.5541F);
        this.tail3.addChild(tail4_r1);
        this.setRotateAngle(tail4_r1, 0.0932F, 0.6199F, 0.0161F);
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 0, 24, -0.0768F, -0.0601F, 7.715F, 1, 1, 7, 0.0F, false));

        this.tail1fluke_r8 = new ModelRenderer(this);
        this.tail1fluke_r8.setRotationPoint(3.588F, -0.6304F, -6.5541F);
        this.tail3.addChild(tail1fluke_r8);
        this.setRotateAngle(tail1fluke_r8, -0.1162F, 0.6199F, 0.0161F);
        this.tail1fluke_r8.cubeList.add(new ModelBox(tail1fluke_r8, 20, 16, 0.4232F, -2.8512F, 11.5426F, 0, 1, 1, 0.0F, false));
        this.tail1fluke_r8.cubeList.add(new ModelBox(tail1fluke_r8, 18, 27, 0.4232F, -2.8512F, 9.5426F, 0, 1, 1, 0.0F, false));
        this.tail1fluke_r8.cubeList.add(new ModelBox(tail1fluke_r8, 35, 0, 0.4232F, -2.6512F, 7.5426F, 0, 1, 1, 0.0F, false));

        this.BLupper = new ModelRenderer(this);
        this.BLupper.setRotationPoint(1.5F, 3.6F, 1.1F);
        this.bodyback.addChild(BLupper);
        this.setRotateAngle(BLupper, 0.0F, 0.0F, -0.6109F);


        this.box_r3 = new ModelRenderer(this);
        this.box_r3.setRotationPoint(-0.2703F, -0.3113F, 0.4F);
        this.BLupper.addChild(box_r3);
        this.setRotateAngle(box_r3, -0.1126F, 0.2873F, 0.5471F);
        this.box_r3.cubeList.add(new ModelBox(box_r3, 26, 8, -0.1175F, -0.0778F, -0.6111F, 4, 1, 1, 0.0F, false));

        this.BLlower = new ModelRenderer(this);
        this.BLlower.setRotationPoint(2.2297F, 1.6887F, -0.5F);
        this.BLupper.addChild(BLlower);
        this.setRotateAngle(BLlower, 0.1874F, -0.032F, 0.1477F);
        this.BLlower.cubeList.add(new ModelBox(BLlower, 42, 40, -0.4F, 0.0F, -1.0F, 1, 3, 1, 0.0F, false));
        this.BLlower.cubeList.add(new ModelBox(BLlower, 34, 21, -0.4F, 0.0F, 0.1F, 1, 3, 1, -0.2F, false));
        this.BLlower.cubeList.add(new ModelBox(BLlower, 30, 42, -0.3F, 2.6F, -1.0F, 1, 1, 2, -0.003F, false));

        this.BLfoot = new ModelRenderer(this);
        this.BLfoot.setRotationPoint(0.0072F, 3.4822F, 0.5765F);
        this.BLlower.addChild(BLfoot);
        this.setRotateAngle(BLfoot, -0.1487F, -0.048F, 0.4369F);
        this.BLfoot.cubeList.add(new ModelBox(BLfoot, 17, 26, -1.4987F, -0.3F, -3.7F, 3, 1, 4, 0.0F, false));

        this.BLupper2 = new ModelRenderer(this);
        this.BLupper2.setRotationPoint(-2.5F, 3.6F, 1.1F);
        this.bodyback.addChild(BLupper2);
        this.setRotateAngle(BLupper2, 0.0F, 0.0F, 0.6109F);


        this.box_r4 = new ModelRenderer(this);
        this.box_r4.setRotationPoint(0.2703F, -0.3113F, 0.4F);
        this.BLupper2.addChild(box_r4);
        this.setRotateAngle(box_r4, -0.1126F, -0.2873F, -0.5471F);
        this.box_r4.cubeList.add(new ModelBox(box_r4, 26, 8, -3.8825F, -0.0778F, -0.6111F, 4, 1, 1, 0.0F, true));

        this.BLlower2 = new ModelRenderer(this);
        this.BLlower2.setRotationPoint(-2.2297F, 1.6887F, -0.5F);
        this.BLupper2.addChild(BLlower2);
        this.setRotateAngle(BLlower2, 0.1874F, 0.032F, -0.1477F);
        this.BLlower2.cubeList.add(new ModelBox(BLlower2, 42, 40, -0.6F, 0.0F, -1.0F, 1, 3, 1, 0.0F, true));
        this.BLlower2.cubeList.add(new ModelBox(BLlower2, 34, 21, -0.6F, 0.0F, 0.1F, 1, 3, 1, -0.2F, true));
        this.BLlower2.cubeList.add(new ModelBox(BLlower2, 30, 42, -0.7F, 2.6F, -1.0F, 1, 1, 2, -0.003F, true));

        this.BLfoot2 = new ModelRenderer(this);
        this.BLfoot2.setRotationPoint(-0.0072F, 3.4822F, 0.5765F);
        this.BLlower2.addChild(BLfoot2);
        this.setRotateAngle(BLfoot2, -0.1487F, 0.048F, -0.4369F);
        this.BLfoot2.cubeList.add(new ModelBox(BLfoot2, 17, 26, -1.5013F, -0.3F, -3.7F, 3, 1, 4, 0.0F, true));

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
