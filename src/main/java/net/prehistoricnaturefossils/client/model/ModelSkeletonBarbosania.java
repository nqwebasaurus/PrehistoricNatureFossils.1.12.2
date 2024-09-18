package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBarbosania extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer hips;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body6_r2;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body7_r1;
    private final ModelRenderer body8_r1;
    private final ModelRenderer body4_r1;
    private final ModelRenderer body5_r2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer leftleg1;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leg6_r1;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftlegwing2;
    private final ModelRenderer leftlegwing1;
    private final ModelRenderer rightleg1;
    private final ModelRenderer rightleg2;
    private final ModelRenderer leg7_r1;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightlegwing2;
    private final ModelRenderer rightlegwing1;
    private final ModelRenderer bone;
    private final ModelRenderer body;
    private final ModelRenderer chest5_r1;
    private final ModelRenderer chest6_r1;
    private final ModelRenderer chest6_r2;
    private final ModelRenderer chest7_r1;
    private final ModelRenderer chest6_r3;
    private final ModelRenderer chest5_r2;
    private final ModelRenderer chest4_r1;
    private final ModelRenderer chest5_r3;
    private final ModelRenderer cube_r2;
    private final ModelRenderer shoulder;
    private final ModelRenderer chest4_r2;
    private final ModelRenderer chest5_r4;
    private final ModelRenderer chest7_r2;
    private final ModelRenderer chest6_r4;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest4_r3;
    private final ModelRenderer chest3_r2;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer chest5_r5;
    private final ModelRenderer chest6_r5;
    private final ModelRenderer cube_r3;
    private final ModelRenderer leftwing1;
    private final ModelRenderer upperwing8_r1;
    private final ModelRenderer leftwing2;
    private final ModelRenderer wing10_r1;
    private final ModelRenderer wing9_r1;
    private final ModelRenderer wing8_r1;
    private final ModelRenderer leftwing3;
    private final ModelRenderer leftwing4;
    private final ModelRenderer leftwing5;
    private final ModelRenderer wingfinger9_r1;
    private final ModelRenderer leftwing6;
    private final ModelRenderer leftwing5membrance2;
    private final ModelRenderer lefthand2;
    private final ModelRenderer leftwing4membrance;
    private final ModelRenderer leftwing3membrance;
    private final ModelRenderer leftwing1membrance;
    private final ModelRenderer rightwing1;
    private final ModelRenderer upperwing9_r1;
    private final ModelRenderer rightwing2;
    private final ModelRenderer wing11_r1;
    private final ModelRenderer wing10_r2;
    private final ModelRenderer wing9_r2;
    private final ModelRenderer rightwing3;
    private final ModelRenderer rightwing4;
    private final ModelRenderer rightwing5;
    private final ModelRenderer wingfinger10_r1;
    private final ModelRenderer rightwing6;
    private final ModelRenderer rightwing5membrance2;
    private final ModelRenderer righthand2;
    private final ModelRenderer rightwing4membrance;
    private final ModelRenderer rightwing3membrance;
    private final ModelRenderer rightwing1membrance;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r6;
    private final ModelRenderer head;
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
    private final ModelRenderer cube_r34;
    private final ModelRenderer jaw;
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
    private final ModelRenderer tail;

    public ModelSkeletonBarbosania() {
        this.textureWidth = 60;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -8.9F, 8.4F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1396F, 0.0F, 0.0F);


        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-1.4F, -0.8437F, -0.3782F);
        this.hips.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -1.4844F, -0.1631F, -0.4671F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 24, 52, -0.5414F, -0.7152F, -0.105F, 1, 1, 2, -0.3F, true));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(-1.4F, -0.8437F, -0.3782F);
        this.hips.addChild(body6_r2);
        this.setRotateAngle(body6_r2, -1.1432F, 0.0F, 0.0F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 52, 28, -0.5F, -0.961F, 0.2605F, 1, 1, 2, -0.31F, true));
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 52, 28, 2.3F, -0.961F, 0.2605F, 1, 1, 2, -0.31F, false));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(-1.4F, -0.8437F, -0.3782F);
        this.hips.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -0.5329F, -0.14F, 0.1318F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 48, 8, -0.5566F, -0.3905F, -1.6669F, 1, 1, 2, -0.3F, true));

        this.body7_r1 = new ModelRenderer(this);
        this.body7_r1.setRotationPoint(-1.4F, -0.8437F, -0.3782F);
        this.hips.addChild(body7_r1);
        this.setRotateAngle(body7_r1, -0.3752F, 0.0F, 0.0F);
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 7, 52, -0.5F, -0.4357F, -0.7733F, 1, 1, 2, -0.3F, true));
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 7, 52, 2.3F, -0.4357F, -0.7733F, 1, 1, 2, -0.3F, false));

        this.body8_r1 = new ModelRenderer(this);
        this.body8_r1.setRotationPoint(-0.5F, -0.3055F, -0.1457F);
        this.hips.addChild(body8_r1);
        this.setRotateAngle(body8_r1, -0.3229F, 0.0F, 0.0F);
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 43, 0, -1.0F, -0.7F, -1.0F, 2, 1, 2, -0.3F, true));
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 43, 0, 0.0F, -0.7F, -1.0F, 2, 1, 2, -0.3F, false));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(1.4F, -0.8437F, -0.3782F);
        this.hips.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -0.5329F, 0.14F, -0.1318F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 48, 8, -0.4434F, -0.3905F, -1.6669F, 1, 1, 2, -0.3F, false));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(1.4F, -0.8437F, -0.3782F);
        this.hips.addChild(body5_r2);
        this.setRotateAngle(body5_r2, -1.4844F, 0.1631F, 0.4671F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 24, 52, -0.4586F, -0.7152F, -0.105F, 1, 1, 2, -0.3F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.5F, 0.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 0, -1.0F, -0.3F, -1.0F, 1, 1, 2, -0.003F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.7F, -0.075F, -0.1694F);
        this.hips.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.1533F, -0.0858F, -0.1161F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 14, 48, -0.3039F, 0.0711F, -0.3881F, 1, 4, 1, -0.1F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.1435F, 3.9933F, 0.3866F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.3376F, -0.0084F, 0.0879F);


        this.leg6_r1 = new ModelRenderer(this);
        this.leg6_r1.setRotationPoint(-0.0191F, 1.592F, -0.1464F);
        this.leftleg2.addChild(leg6_r1);
        this.setRotateAngle(leg6_r1, 3.0543F, 0.0F, 3.1416F);
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 40, 44, -1.15F, -2.0F, -0.5F, 1, 5, 1, -0.2F, false));
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 27, 45, -0.05F, -2.0F, -0.5F, 1, 5, 1, -0.1F, false));

        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0416F, 4.5665F, 0.596F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.1836F, 0.0804F, -0.024F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 0, 32, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

        this.leftlegwing2 = new ModelRenderer(this);
        this.leftlegwing2.setRotationPoint(-0.4691F, 0.092F, 0.4536F);
        this.leftleg2.addChild(leftlegwing2);
        this.setRotateAngle(leftlegwing2, -0.0141F, 0.0F, 0.0F);


        this.leftlegwing1 = new ModelRenderer(this);
        this.leftlegwing1.setRotationPoint(-0.6039F, 0.0711F, 1.1119F);
        this.leftleg1.addChild(leftlegwing1);
        this.setRotateAngle(leftlegwing1, 0.1367F, 0.0F, 0.0F);


        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.7F, -0.075F, -0.1694F);
        this.hips.addChild(rightleg1);
        this.setRotateAngle(rightleg1, -0.283F, 0.0858F, 0.1161F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 45, 46, -0.6961F, 0.0711F, -0.3881F, 1, 4, 1, -0.1F, false));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.1435F, 3.9933F, 0.3866F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.3376F, 0.0084F, -0.0879F);


        this.leg7_r1 = new ModelRenderer(this);
        this.leg7_r1.setRotationPoint(0.0191F, 1.592F, -0.1464F);
        this.rightleg2.addChild(leg7_r1);
        this.setRotateAngle(leg7_r1, 3.0543F, 0.0F, -3.1416F);
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 44, 35, 0.15F, -2.0F, -0.5F, 1, 5, 1, -0.2F, false));
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 9, 45, -0.95F, -2.0F, -0.5F, 1, 5, 1, -0.1F, false));

        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.0416F, 4.5665F, 0.596F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.1218F, -0.0804F, 0.024F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 30, 21, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

        this.rightlegwing2 = new ModelRenderer(this);
        this.rightlegwing2.setRotationPoint(0.4691F, 0.092F, 0.4536F);
        this.rightleg2.addChild(rightlegwing2);
        this.setRotateAngle(rightlegwing2, -0.0141F, 0.0F, 0.0F);


        this.rightlegwing1 = new ModelRenderer(this);
        this.rightlegwing1.setRotationPoint(0.6039F, 0.0711F, 1.1119F);
        this.rightleg1.addChild(rightlegwing1);
        this.setRotateAngle(rightlegwing1, 0.1367F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.5558F, 0.8424F, 0.9592F);
        this.hips.addChild(bone);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6F, -1.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.2182F, 0.0F);


        this.chest5_r1 = new ModelRenderer(this);
        this.chest5_r1.setRotationPoint(-0.5F, -0.9685F, -2.1571F);
        this.body.addChild(chest5_r1);
        this.setRotateAngle(chest5_r1, -0.066F, -0.1614F, -0.7373F);
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 24, 12, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest6_r1 = new ModelRenderer(this);
        this.chest6_r1.setRotationPoint(-0.5F, -0.9685F, -2.1571F);
        this.body.addChild(chest6_r1);
        this.setRotateAngle(chest6_r1, 0.0394F, -0.1697F, -1.3568F);
        this.chest6_r1.cubeList.add(new ModelBox(chest6_r1, 17, 12, -2.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest6_r2 = new ModelRenderer(this);
        this.chest6_r2.setRotationPoint(-0.5F, -0.2685F, -0.1571F);
        this.body.addChild(chest6_r2);
        this.setRotateAngle(chest6_r2, -0.2715F, -0.3172F, -0.8104F);
        this.chest6_r2.cubeList.add(new ModelBox(chest6_r2, 22, 28, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest7_r1 = new ModelRenderer(this);
        this.chest7_r1.setRotationPoint(-0.5F, -0.2685F, -0.1571F);
        this.body.addChild(chest7_r1);
        this.setRotateAngle(chest7_r1, -0.0326F, -0.4133F, -1.4581F);
        this.chest7_r1.cubeList.add(new ModelBox(chest7_r1, 17, 28, -1.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest6_r3 = new ModelRenderer(this);
        this.chest6_r3.setRotationPoint(0.5F, -0.2685F, -0.1571F);
        this.body.addChild(chest6_r3);
        this.setRotateAngle(chest6_r3, -0.0326F, 0.4133F, 1.4581F);
        this.chest6_r3.cubeList.add(new ModelBox(chest6_r3, 17, 28, 0.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest5_r2 = new ModelRenderer(this);
        this.chest5_r2.setRotationPoint(0.5F, -0.2685F, -0.1571F);
        this.body.addChild(chest5_r2);
        this.setRotateAngle(chest5_r2, -0.2715F, 0.3172F, 0.8104F);
        this.chest5_r2.cubeList.add(new ModelBox(chest5_r2, 22, 28, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest4_r1 = new ModelRenderer(this);
        this.chest4_r1.setRotationPoint(0.5F, -0.9685F, -2.1571F);
        this.body.addChild(chest4_r1);
        this.setRotateAngle(chest4_r1, -0.066F, 0.1614F, 0.7373F);
        this.chest4_r1.cubeList.add(new ModelBox(chest4_r1, 24, 12, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest5_r3 = new ModelRenderer(this);
        this.chest5_r3.setRotationPoint(0.5F, -0.9685F, -2.1571F);
        this.body.addChild(chest5_r3);
        this.setRotateAngle(chest5_r3, 0.0394F, 0.1697F, 1.3568F);
        this.chest5_r3.cubeList.add(new ModelBox(chest5_r3, 17, 12, 0.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.6F, -2.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4014F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 23, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.shoulder = new ModelRenderer(this);
        this.shoulder.setRotationPoint(0.0F, -1.1F, -2.6F);
        this.body.addChild(shoulder);
        this.setRotateAngle(shoulder, 0.044F, -0.1308F, -0.0057F);


        this.chest4_r2 = new ModelRenderer(this);
        this.chest4_r2.setRotationPoint(-0.5F, -0.3713F, -0.6663F);
        this.shoulder.addChild(chest4_r2);
        this.setRotateAngle(chest4_r2, 0.1767F, 0.4736F, 0.0813F);
        this.chest4_r2.cubeList.add(new ModelBox(chest4_r2, 27, 40, -1.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, true));

        this.chest5_r4 = new ModelRenderer(this);
        this.chest5_r4.setRotationPoint(-1.9F, 1.8287F, -2.4663F);
        this.shoulder.addChild(chest5_r4);
        this.setRotateAngle(chest5_r4, 1.1341F, 0.4326F, -0.5013F);
        this.chest5_r4.cubeList.add(new ModelBox(chest5_r4, 19, 49, 0.1901F, -0.1854F, 0.1743F, 1, 1, 2, -0.2F, true));

        this.chest7_r2 = new ModelRenderer(this);
        this.chest7_r2.setRotationPoint(-0.5F, -0.5685F, -1.5571F);
        this.shoulder.addChild(chest7_r2);
        this.setRotateAngle(chest7_r2, 0.101F, 0.0578F, -1.3079F);
        this.chest7_r2.cubeList.add(new ModelBox(chest7_r2, 0, 28, -2.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest6_r4 = new ModelRenderer(this);
        this.chest6_r4.setRotationPoint(-0.5F, -0.5685F, -1.5571F);
        this.shoulder.addChild(chest6_r4);
        this.setRotateAngle(chest6_r4, 0.1158F, -0.0105F, -0.7006F);
        this.chest6_r4.cubeList.add(new ModelBox(chest6_r4, 7, 28, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(0.5F, -0.3713F, -0.6663F);
        this.shoulder.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, 0.1767F, -0.4736F, -0.0813F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 27, 40, 0.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, false));

        this.chest4_r3 = new ModelRenderer(this);
        this.chest4_r3.setRotationPoint(1.9F, 1.8287F, -2.4663F);
        this.shoulder.addChild(chest4_r3);
        this.setRotateAngle(chest4_r3, 1.1341F, -0.4326F, 0.5013F);
        this.chest4_r3.cubeList.add(new ModelBox(chest4_r3, 19, 49, -1.1901F, -0.1854F, 0.1743F, 1, 1, 2, -0.2F, false));

        this.chest3_r2 = new ModelRenderer(this);
        this.chest3_r2.setRotationPoint(0.0F, 2.6901F, -1.8432F);
        this.shoulder.addChild(chest3_r2);
        this.setRotateAngle(chest3_r2, -0.6807F, 0.0F, 0.0F);
        this.chest3_r2.cubeList.add(new ModelBox(chest3_r2, 36, 40, -1.0F, -0.9773F, -1.995F, 2, 1, 2, 0.0F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, 2.3901F, -0.5432F);
        this.shoulder.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.0175F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 11, 32, -1.5F, -0.7F, -1.3F, 3, 1, 2, 0.0F, false));

        this.chest5_r5 = new ModelRenderer(this);
        this.chest5_r5.setRotationPoint(0.5F, -0.5685F, -1.5571F);
        this.shoulder.addChild(chest5_r5);
        this.setRotateAngle(chest5_r5, 0.1158F, 0.0105F, 0.7006F);
        this.chest5_r5.cubeList.add(new ModelBox(chest5_r5, 7, 28, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest6_r5 = new ModelRenderer(this);
        this.chest6_r5.setRotationPoint(0.5F, -0.5685F, -1.5571F);
        this.shoulder.addChild(chest6_r5);
        this.setRotateAngle(chest6_r5, 0.101F, -0.0578F, 1.3079F);
        this.chest6_r5.cubeList.add(new ModelBox(chest6_r5, 0, 28, 0.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.2F, -1.7F);
        this.shoulder.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 43, 14, 0.0F, -0.0436F, -0.0682F, 1, 1, 2, -0.003F, false));

        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.4F, 0.775F, -2.1694F);
        this.shoulder.addChild(leftwing1);
        this.setRotateAngle(leftwing1, 0.0079F, 0.0113F, 0.4675F);


        this.upperwing8_r1 = new ModelRenderer(this);
        this.upperwing8_r1.setRotationPoint(1.0746F, 0.0368F, 0.2605F);
        this.leftwing1.addChild(upperwing8_r1);
        this.setRotateAngle(upperwing8_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 30, 18, -0.25F, -0.5F, -0.5F, 5, 1, 1, 0.0F, false));
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 44, 53, -1.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(5.7709F, -0.2894F, -0.2119F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.5392F, 0.4501F, -1.8306F);


        this.wing10_r1 = new ModelRenderer(this);
        this.wing10_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing10_r1);
        this.setRotateAngle(wing10_r1, 0.0F, 0.0F, 0.0F);
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 17, 39, -0.9072F, -2.9026F, -0.7631F, 1, 7, 1, -0.2F, false));
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 22, 40, -0.9072F, -2.9026F, 0.0369F, 1, 7, 1, -0.15F, false));

        this.wing9_r1 = new ModelRenderer(this);
        this.wing9_r1.setRotationPoint(-0.0717F, 7.464F, -0.1798F);
        this.leftwing2.addChild(wing9_r1);
        this.setRotateAngle(wing9_r1, 0.0F, -1.5708F, 0.6894F);
        this.wing9_r1.cubeList.add(new ModelBox(wing9_r1, 54, 7, -0.3631F, -1.0901F, -0.2027F, 1, 1, 1, -0.21F, false));

        this.wing8_r1 = new ModelRenderer(this);
        this.wing8_r1.setRotationPoint(0.4283F, 6.764F, -0.1798F);
        this.leftwing2.addChild(wing8_r1);
        this.setRotateAngle(wing8_r1, 0.0F, -1.5708F, 0.3752F);
        this.wing8_r1.cubeList.add(new ModelBox(wing8_r1, 8, 0, -0.3631F, -2.796F, -0.2388F, 1, 3, 1, -0.21F, false));

        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.3415F, 7.054F, -0.649F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.1773F, 0.1014F, 0.6665F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 35, 44, -0.5F, 0.0F, 0.0F, 1, 5, 1, -0.11F, false));

        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(-0.2828F, 5.3557F, 0.701F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.4864F, -0.5178F, -0.4679F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 30, 2, -0.5799F, -0.5164F, -0.654F, 1, 1, 10, -0.2F, false));

        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.2799F, 0.4836F, 9.246F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.2838F, 0.2207F, 0.251F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 17, 16, -0.5F, -1.0F, -0.3F, 1, 1, 10, -0.2F, false));

        this.wingfinger9_r1 = new ModelRenderer(this);
        this.wingfinger9_r1.setRotationPoint(0.0F, -0.2F, 9.3F);
        this.leftwing5.addChild(wingfinger9_r1);
        this.setRotateAngle(wingfinger9_r1, 0.5777F, 0.0732F, 0.0476F);
        this.wingfinger9_r1.cubeList.add(new ModelBox(wingfinger9_r1, 0, 16, -0.5F, -0.7865F, 0.013F, 1, 1, 14, -0.2F, false));

        this.leftwing6 = new ModelRenderer(this);
        this.leftwing6.setRotationPoint(-0.0799F, 0.4836F, 8.346F);
        this.leftwing4.addChild(leftwing6);
        this.setRotateAngle(leftwing6, 0.0594F, 0.0781F, 0.2095F);


        this.leftwing5membrance2 = new ModelRenderer(this);
        this.leftwing5membrance2.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.leftwing6.addChild(leftwing5membrance2);


        this.lefthand2 = new ModelRenderer(this);
        this.lefthand2.setRotationPoint(-0.1587F, -0.1155F, 0.3237F);
        this.leftwing4.addChild(lefthand2);
        this.setRotateAngle(lefthand2, -1.4191F, 1.0011F, -0.4255F);
        this.lefthand2.cubeList.add(new ModelBox(lefthand2, 0, 43, -1.0495F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

        this.leftwing4membrance = new ModelRenderer(this);
        this.leftwing4membrance.setRotationPoint(-12.2799F, 3.7836F, 3.946F);
        this.leftwing4.addChild(leftwing4membrance);


        this.leftwing3membrance = new ModelRenderer(this);
        this.leftwing3membrance.setRotationPoint(0.5397F, 0.1609F, 0.9501F);
        this.leftwing2.addChild(leftwing3membrance);


        this.leftwing1membrance = new ModelRenderer(this);
        this.leftwing1membrance.setRotationPoint(1.3496F, 0.2368F, 2.9355F);
        this.leftwing1.addChild(leftwing1membrance);
        this.setRotateAngle(leftwing1membrance, 0.0021F, -0.3752F, -0.0093F);


        this.rightwing1 = new ModelRenderer(this);
        this.rightwing1.setRotationPoint(-2.4F, 0.775F, -2.1694F);
        this.shoulder.addChild(rightwing1);
        this.setRotateAngle(rightwing1, -0.0301F, 0.9486F, -0.4564F);


        this.upperwing9_r1 = new ModelRenderer(this);
        this.upperwing9_r1.setRotationPoint(-1.0746F, 0.0368F, 0.2605F);
        this.rightwing1.addChild(upperwing9_r1);
        this.setRotateAngle(upperwing9_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 30, 15, -4.75F, -0.5F, -0.5F, 5, 1, 1, 0.0F, false));
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 18, 53, 0.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-5.7709F, -0.2894F, -0.2119F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -2.1366F, -0.2745F, 2.0161F);


        this.wing11_r1 = new ModelRenderer(this);
        this.wing11_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing11_r1);
        this.setRotateAngle(wing11_r1, 0.0F, 0.0F, 0.0F);
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 17, 16, -0.0928F, -2.9026F, -0.7631F, 1, 7, 1, -0.2F, false));
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 22, 16, -0.0928F, -2.9026F, 0.0369F, 1, 7, 1, -0.15F, false));

        this.wing10_r2 = new ModelRenderer(this);
        this.wing10_r2.setRotationPoint(0.0717F, 7.464F, -0.1798F);
        this.rightwing2.addChild(wing10_r2);
        this.setRotateAngle(wing10_r2, 0.0F, 1.5708F, -0.6894F);
        this.wing10_r2.cubeList.add(new ModelBox(wing10_r2, 53, 48, -0.6369F, -1.0901F, -0.2027F, 1, 1, 1, -0.21F, false));

        this.wing9_r2 = new ModelRenderer(this);
        this.wing9_r2.setRotationPoint(-0.4283F, 6.764F, -0.1798F);
        this.rightwing2.addChild(wing9_r2);
        this.setRotateAngle(wing9_r2, 0.0F, 1.5708F, -0.3752F);
        this.wing9_r2.cubeList.add(new ModelBox(wing9_r2, 0, 0, -0.6369F, -2.796F, -0.2388F, 1, 3, 1, -0.21F, false));

        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.3415F, 7.054F, -0.649F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.1773F, -0.1014F, -0.6665F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 43, 4, -0.5F, 0.0F, 0.0F, 1, 5, 1, -0.11F, false));

        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(0.2828F, 5.3557F, 0.701F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.4864F, 0.5178F, 0.4679F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 21, 28, -0.4201F, -0.5164F, -0.654F, 1, 1, 10, -0.2F, false));

        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.2799F, 0.4836F, 9.246F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.2838F, -0.2207F, -0.251F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 17, 0, -0.5F, -1.0F, -0.3F, 1, 1, 10, -0.2F, false));

        this.wingfinger10_r1 = new ModelRenderer(this);
        this.wingfinger10_r1.setRotationPoint(0.0F, -0.2F, 9.3F);
        this.rightwing5.addChild(wingfinger10_r1);
        this.setRotateAngle(wingfinger10_r1, 0.5777F, -0.0732F, -0.0476F);
        this.wingfinger10_r1.cubeList.add(new ModelBox(wingfinger10_r1, 0, 0, -0.5F, -0.7865F, 0.013F, 1, 1, 14, -0.2F, false));

        this.rightwing6 = new ModelRenderer(this);
        this.rightwing6.setRotationPoint(0.0799F, 0.4836F, 8.346F);
        this.rightwing4.addChild(rightwing6);
        this.setRotateAngle(rightwing6, 0.0594F, -0.0781F, -0.2095F);


        this.rightwing5membrance2 = new ModelRenderer(this);
        this.rightwing5membrance2.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.rightwing6.addChild(rightwing5membrance2);


        this.righthand2 = new ModelRenderer(this);
        this.righthand2.setRotationPoint(0.1587F, -0.1155F, 0.3237F);
        this.rightwing4.addChild(righthand2);
        this.setRotateAngle(righthand2, -1.4191F, -1.0011F, 0.4255F);
        this.righthand2.cubeList.add(new ModelBox(righthand2, 41, 31, -0.9505F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

        this.rightwing4membrance = new ModelRenderer(this);
        this.rightwing4membrance.setRotationPoint(12.2799F, 3.7836F, 3.946F);
        this.rightwing4.addChild(rightwing4membrance);


        this.rightwing3membrance = new ModelRenderer(this);
        this.rightwing3membrance.setRotationPoint(-0.5397F, 0.1609F, 0.9501F);
        this.rightwing2.addChild(rightwing3membrance);


        this.rightwing1membrance = new ModelRenderer(this);
        this.rightwing1membrance.setRotationPoint(-1.3496F, 0.2368F, 2.9355F);
        this.rightwing1.addChild(rightwing1membrance);
        this.setRotateAngle(rightwing1membrance, 0.0021F, 0.3752F, 0.0093F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.7F, -1.9F);
        this.shoulder.addChild(neck3);
        this.setRotateAngle(neck3, -0.3054F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.3F, -1.9F);
        this.neck3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 22, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.1F, -1.8F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.3491F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -1.3F, -1.6F);
        this.neck2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3665F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 16, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.003F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.6F, -1.6F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.3491F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -0.8F, -1.7F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2094F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 47, 26, 0.0F, -0.2F, -0.2F, 1, 1, 2, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4F, -1.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.5236F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -0.5961F, 0.5666F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 28, -1.5F, -1.029F, -0.9547F, 2, 1, 1, 0.003F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.8039F, -0.8334F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7679F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 4, -1.5F, -2.0086F, -0.9201F, 2, 2, 1, 0.004F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.7497F, -0.9071F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.096F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 7, 1.0F, -1.0067F, -0.8753F, 0, 1, 1, -0.003F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.3953F, -2.4463F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.6283F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 45, 42, -0.8F, 0.8268F, -0.9598F, 1, 1, 2, 0.003F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 45, 42, -0.2F, 0.8268F, -0.9598F, 1, 1, 2, 0.003F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.1F, 0.5047F, -3.7463F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5934F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 36, -0.6F, -0.119F, -0.1369F, 1, 1, 3, -0.107F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 36, -0.2F, -0.119F, -0.1369F, 1, 1, 3, -0.1F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.01F, -0.1168F, -0.2392F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.9599F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 51, 12, -0.4F, -0.5F, -1.0F, 1, 1, 2, -0.4F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 10, -0.4F, -1.7F, -0.9F, 1, 1, 1, -0.4F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 10, 1.42F, -1.7F, -0.9F, 1, 1, 1, -0.4F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 51, 12, 1.42F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.3F, -1.0584F, -1.1576F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.3788F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 55, 4, -1.51F, -0.1777F, -0.8269F, 1, 1, 1, -0.2F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 55, 4, -0.09F, -0.1777F, -0.8269F, 1, 1, 1, -0.2F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.3F, -1.7584F, -1.1576F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.1345F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 52, 20, -1.53F, 0.3056F, -1.1146F, 1, 1, 1, -0.2F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 41, -1.65F, 0.3056F, -1.1146F, 1, 1, 1, -0.3F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 41, 0.05F, 0.3056F, -1.1146F, 1, 1, 1, -0.3F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 52, 20, -0.07F, 0.3056F, -1.1146F, 1, 1, 1, -0.2F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.3F, -0.4584F, -1.2576F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.6632F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 13, 55, -1.51F, -0.589F, 0.2213F, 1, 1, 1, -0.198F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 13, 55, -0.09F, -0.589F, 0.2213F, 1, 1, 1, -0.198F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.71F, -0.6374F, -0.6812F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.693F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 5, 56, -0.5F, -0.1F, -0.0351F, 1, 1, 1, -0.202F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 5, 56, 0.92F, -0.1F, -0.0351F, 1, 1, 1, -0.202F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.71F, -0.9374F, 0.0188F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 1.2043F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 55, 43, -0.5F, -0.8313F, -0.8125F, 1, 1, 1, -0.2F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 55, 43, 0.92F, -0.8313F, -0.8125F, 1, 1, 1, -0.2F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.71F, -0.4374F, -0.1812F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.8203F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 55, 40, -0.5F, -0.8238F, -0.874F, 1, 1, 1, -0.199F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 55, 36, -0.5F, -0.8238F, -1.174F, 1, 1, 1, -0.2F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 55, 36, 0.92F, -0.8238F, -1.174F, 1, 1, 1, -0.2F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 55, 40, 0.92F, -0.8238F, -0.874F, 1, 1, 1, -0.199F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.11F, -0.2943F, -1.7207F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0349F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 55, 16, -0.2F, -0.3277F, -0.3413F, 1, 1, 1, -0.305F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 55, 16, 1.42F, -0.3277F, -0.3413F, 1, 1, 1, -0.305F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.11F, -0.1943F, -2.1207F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2094F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 36, 55, -0.2F, -0.3424F, -0.3293F, 1, 1, 1, -0.3F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 36, 55, 1.42F, -0.3424F, -0.3293F, 1, 1, 1, -0.3F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(1.11F, 1.0057F, -4.2207F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.5236F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 49, 37, -1.0F, -0.3316F, 0.6894F, 1, 1, 2, -0.306F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 50, 38, -0.8F, -0.3316F, 1.6894F, 1, 1, 1, -0.306F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 50, 38, -2.42F, -0.3316F, 1.6894F, 1, 1, 1, -0.306F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 49, 37, -2.22F, -0.3316F, 0.6894F, 1, 1, 2, -0.306F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 52, 23, -2.22F, -0.3316F, 0.1894F, 1, 1, 2, -0.3F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 18, -2.02F, -0.3316F, -0.3106F, 1, 1, 3, -0.3F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 52, 23, -1.0F, -0.3316F, 0.1894F, 1, 1, 2, -0.3F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 18, -1.2F, -0.3316F, -0.3106F, 1, 1, 3, -0.3F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(1.01F, 0.0057F, -1.7207F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3316F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 1, 52, -0.8F, -0.2921F, -0.7999F, 1, 1, 1, -0.204F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 51, -1.0F, -0.3F, -1.5F, 1, 1, 2, -0.203F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 1, 52, -2.22F, -0.2921F, -0.7999F, 1, 1, 1, -0.204F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 1, 52, -2.22F, -0.3F, -0.5F, 1, 1, 1, -0.203F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 51, -2.02F, -0.3F, -1.5F, 1, 1, 2, -0.203F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 49, 33, -2.12F, -0.2F, -2.5F, 1, 1, 2, -0.299F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 48, 50, -1.92F, -0.2F, -3.0F, 1, 1, 2, -0.299F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 50, 44, -2.02F, -0.1F, -4.1F, 1, 1, 2, -0.4F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 50, 44, -1.0F, -0.1F, -4.1F, 1, 1, 2, -0.4F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 49, 33, -0.9F, -0.2F, -2.5F, 1, 1, 2, -0.299F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 48, 50, -1.1F, -0.2F, -3.0F, 1, 1, 2, -0.299F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.1F, 1.2047F, -3.5463F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2443F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 38, -0.8F, -0.8466F, -0.1616F, 1, 1, 3, -0.1F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 38, 0.0F, -0.8466F, -0.1616F, 1, 1, 3, -0.1F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.3F, 3.4095F, -10.995F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.4778F, 0.144F, 0.2703F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 54, 53, -0.2139F, -0.0598F, -0.3335F, 1, 1, 1, -0.224F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 55, -0.2139F, -0.3598F, -0.3335F, 1, 1, 1, -0.22F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.2F, 3.1047F, -8.4463F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2793F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 34, 28, -0.8F, -0.8483F, -2.8096F, 1, 1, 3, -0.202F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 0, -0.8F, -0.4483F, -2.8096F, 1, 1, 3, -0.22F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 0, -0.6F, -0.4483F, -2.8096F, 1, 1, 3, -0.22F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 34, 28, -0.6F, -0.8483F, -2.8096F, 1, 1, 3, -0.205F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.3F, 3.4095F, -10.995F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.4778F, -0.144F, -0.2703F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 54, 53, -0.7861F, -0.0598F, -0.3335F, 1, 1, 1, -0.224F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 55, -0.7861F, -0.3598F, -0.3335F, 1, 1, 1, -0.22F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.2F, 2.2047F, -6.0463F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3665F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 30, 5, -0.9F, -0.534F, -2.7703F, 1, 1, 3, -0.22F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 30, 5, -0.5F, -0.534F, -2.7703F, 1, 1, 3, -0.22F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.2F, 2.2047F, -6.0463F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3142F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 34, 33, -0.9F, -0.734F, -2.7703F, 1, 1, 3, -0.202F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 34, 33, -0.5F, -0.734F, -2.7703F, 1, 1, 3, -0.2F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.1F, 1.2047F, -3.3463F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.384F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 22, 32, -0.9F, -0.6183F, -3.0483F, 1, 1, 3, -0.23F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 7, -0.9F, -0.8183F, -3.0483F, 1, 1, 4, -0.2F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 22, 32, -0.3F, -0.6183F, -3.0483F, 1, 1, 3, -0.23F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 7, -0.3F, -0.8183F, -3.0483F, 1, 1, 4, -0.2F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.91F, 1.5057F, -5.1207F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.5236F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 30, 50, -0.1F, -0.4113F, -0.3969F, 1, 1, 2, -0.404F, true));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 30, 50, 0.92F, -0.4113F, -0.3969F, 1, 1, 2, -0.404F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.1F, 0.3047F, -3.5463F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.4712F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 22, -0.9F, -0.1645F, -3.2526F, 1, 1, 4, -0.203F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 22, -0.3F, -0.1645F, -3.2526F, 1, 1, 4, -0.203F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -1.2535F, -1.1121F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.4014F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 37, 51, -0.5F, -0.055F, -0.0303F, 1, 1, 2, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -1.3953F, -0.8463F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.4363F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 14, 36, -0.5F, 0.0233F, -0.0179F, 2, 1, 1, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, -0.4953F, 1.0537F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.6632F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 7, 41, -0.5F, -1.8557F, -2.961F, 2, 1, 2, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7047F, -0.5463F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7941F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 17, 5, -0.4F, 1.16F, -11.1846F, 1, 1, 3, -0.214F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 47, -0.4F, 0.76F, -9.9846F, 1, 1, 2, -0.23F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 17, 5, -0.6F, 1.16F, -11.1846F, 1, 1, 3, -0.21F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 47, -0.6F, 0.76F, -9.9846F, 1, 1, 2, -0.23F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.3F, 1.2101F, -10.6909F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2092F, 0.0266F, -0.654F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 31, 54, -0.4132F, -0.8675F, -0.5858F, 1, 1, 1, -0.24F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.3F, 1.2101F, -10.6909F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.3139F, 0.0266F, -0.654F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 54, 32, -0.4132F, -0.5063F, -0.5709F, 1, 1, 1, -0.23F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.3F, 1.2101F, -10.6909F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, -0.4363F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 49, 54, -0.3906F, -0.5923F, 0.0064F, 1, 1, 1, -0.23F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.1F, 1.3F, -4.9F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.192F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 16, -0.8F, -0.83F, -3.7538F, 1, 1, 4, -0.214F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 16, -0.4F, -0.83F, -3.7538F, 1, 1, 4, -0.21F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.3F, 0.7627F, -5.3777F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.192F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 0, -0.4F, -0.5F, -2.5F, 1, 1, 5, -0.23F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 0, 0.0F, -0.5F, -2.5F, 1, 1, 5, -0.23F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.1F, 0.4F, -2.5F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.2443F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 17, 0, -0.9F, -0.5442F, -2.78F, 1, 1, 3, -0.21F, true));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 17, 0, -0.3F, -0.5442F, -2.78F, 1, 1, 3, -0.21F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0873F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 7, 7, -1.1F, -0.3F, -1.7F, 1, 1, 2, -0.1F, true));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 7, 16, -1.1F, -0.3F, -2.7F, 1, 1, 2, -0.15F, true));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 7, 7, 0.1F, -0.3F, -1.7F, 1, 1, 2, -0.1F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 7, 16, 0.1F, -0.3F, -2.7F, 1, 1, 2, -0.15F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.3F, 1.2101F, -10.6909F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.2092F, -0.0266F, 0.654F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 31, 54, -0.5868F, -0.8675F, -0.5858F, 1, 1, 1, -0.24F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.3F, 1.2101F, -10.6909F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.3139F, -0.0266F, 0.654F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 54, 32, -0.5868F, -0.5063F, -0.5709F, 1, 1, 1, -0.23F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.3F, 1.2101F, -10.6909F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, 0.4363F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 49, 54, -0.6094F, -0.5923F, 0.0064F, 1, 1, 1, -0.23F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4F, 1.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.4755F, 0.2598F, -0.0326F);
        this.tail.cubeList.add(new ModelBox(tail, 47, 21, -0.5F, -0.1F, -0.1F, 1, 1, 2, 0.0F, false));

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
