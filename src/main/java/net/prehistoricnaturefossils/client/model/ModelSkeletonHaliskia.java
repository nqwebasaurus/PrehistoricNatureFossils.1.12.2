package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHaliskia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer hips;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body8_r1;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body6_r2;
    private final ModelRenderer body8_r2;
    private final ModelRenderer body9_r1;
    private final ModelRenderer body4_r1;
    private final ModelRenderer body8_r3;
    private final ModelRenderer body7_r1;
    private final ModelRenderer body6_r3;
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
    private final ModelRenderer chest7_r1;
    private final ModelRenderer chest6_r1;
    private final ModelRenderer chest5_r1;
    private final ModelRenderer chest6_r2;
    private final ModelRenderer chest6_r3;
    private final ModelRenderer chest5_r2;
    private final ModelRenderer chest4_r1;
    private final ModelRenderer chest5_r3;
    private final ModelRenderer cube_r2;
    private final ModelRenderer shoulder;
    private final ModelRenderer chest7_r2;
    private final ModelRenderer chest6_r4;
    private final ModelRenderer chest5_r4;
    private final ModelRenderer chest4_r2;
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
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer tail;

    public ModelSkeletonHaliskia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -7.8F, 6.3F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0F, 0.0F, 0.3054F);


        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(-1.1015F, -0.519F, -1.1428F);
        this.hips.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -0.6155F, -0.1854F, 0.0503F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 9, 26, -0.7F, -0.5F, -1.0F, 1, 1, 2, -0.3F, true));

        this.body8_r1 = new ModelRenderer(this);
        this.body8_r1.setRotationPoint(-1.4F, -0.3437F, -0.6782F);
        this.hips.addChild(body8_r1);
        this.setRotateAngle(body8_r1, 0.1134F, 0.0F, 0.0F);
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 51, 37, -0.1F, -0.4018F, -0.4752F, 2, 1, 2, -0.3F, true));
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 52, 4, -0.5F, -0.4018F, -0.4752F, 1, 1, 2, -0.3F, true));
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 51, 37, 0.9F, -0.4018F, -0.4752F, 2, 1, 2, -0.3F, false));
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 52, 4, 2.3F, -0.4018F, -0.4752F, 1, 1, 2, -0.3F, false));

        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-1.4F, -0.4051F, 0.6276F);
        this.hips.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -0.6545F, 0.0F, 0.0F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 52, 41, -0.5F, -0.5F, -0.8F, 1, 1, 2, -0.31F, true));
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 52, 41, 2.3F, -0.5F, -0.8F, 1, 1, 2, -0.31F, false));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(-1.2558F, -0.0576F, 0.9592F);
        this.hips.addChild(body6_r2);
        this.setRotateAngle(body6_r2, -1.0472F, 0.0F, -0.3752F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 39, 56, -0.3708F, 0.2836F, -1.05F, 1, 1, 2, -0.3F, true));
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 26, 56, -0.3708F, 0.6836F, -1.15F, 1, 1, 2, -0.31F, true));

        this.body8_r2 = new ModelRenderer(this);
        this.body8_r2.setRotationPoint(-0.8558F, 0.7424F, 0.9592F);
        this.hips.addChild(body8_r2);
        this.setRotateAngle(body8_r2, 3.0281F, 0.0F, -0.7243F);
        this.body8_r2.cubeList.add(new ModelBox(body8_r2, 9, 18, -0.4498F, -0.7196F, -0.6815F, 1, 1, 2, -0.3F, true));

        this.body9_r1 = new ModelRenderer(this);
        this.body9_r1.setRotationPoint(-0.8558F, 0.7424F, 0.9592F);
        this.hips.addChild(body9_r1);
        this.setRotateAngle(body9_r1, -2.5569F, 0.0F, -0.7243F);
        this.body9_r1.cubeList.add(new ModelBox(body9_r1, 56, 19, -0.4498F, -0.4635F, -0.1149F, 1, 1, 2, -0.31F, true));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(1.1015F, -0.519F, -1.1428F);
        this.hips.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -0.6155F, 0.1854F, -0.0503F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 9, 26, -0.3F, -0.5F, -1.0F, 1, 1, 2, -0.3F, false));

        this.body8_r3 = new ModelRenderer(this);
        this.body8_r3.setRotationPoint(0.8558F, 0.7424F, 0.9592F);
        this.hips.addChild(body8_r3);
        this.setRotateAngle(body8_r3, -2.5569F, 0.0F, 0.7243F);
        this.body8_r3.cubeList.add(new ModelBox(body8_r3, 56, 19, -0.5502F, -0.4635F, -0.1149F, 1, 1, 2, -0.31F, false));

        this.body7_r1 = new ModelRenderer(this);
        this.body7_r1.setRotationPoint(0.8558F, 0.7424F, 0.9592F);
        this.hips.addChild(body7_r1);
        this.setRotateAngle(body7_r1, 3.0281F, 0.0F, 0.7243F);
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 9, 18, -0.5502F, -0.7196F, -0.6815F, 1, 1, 2, -0.3F, false));

        this.body6_r3 = new ModelRenderer(this);
        this.body6_r3.setRotationPoint(1.2558F, -0.0576F, 0.9592F);
        this.hips.addChild(body6_r3);
        this.setRotateAngle(body6_r3, -1.0472F, 0.0F, 0.3752F);
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 26, 56, -0.6292F, 0.6836F, -1.15F, 1, 1, 2, -0.31F, false));
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 39, 56, -0.6292F, 0.2836F, -1.05F, 1, 1, 2, -0.3F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.5F, 0.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 53, 30, -1.0F, -0.3F, -1.0F, 1, 1, 2, -0.003F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.7F, -0.075F, -0.1694F);
        this.hips.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.659F, 0.0793F, -0.341F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 54, 12, -0.3039F, 0.0711F, -0.3881F, 1, 5, 1, -0.1F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.1435F, 4.9933F, 0.7866F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.9397F, 0.2917F, 0.1681F);


        this.leg6_r1 = new ModelRenderer(this);
        this.leg6_r1.setRotationPoint(-0.0191F, 1.592F, -0.1464F);
        this.leftleg2.addChild(leg6_r1);
        this.setRotateAngle(leg6_r1, 3.0543F, 0.0F, 3.1416F);
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 46, 52, -1.15F, -2.0F, -0.5F, 1, 6, 1, -0.2F, false));
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 51, 52, -0.05F, -2.0F, -0.5F, 1, 6, 1, -0.1F, false));

        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0416F, 5.5665F, 0.196F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 1.2999F, 0.0804F, -0.024F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 19, 23, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

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
        this.setRotateAngle(rightleg1, 0.5098F, -0.1455F, 0.5036F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 0, 53, -0.6961F, 0.0711F, -0.3881F, 1, 5, 1, -0.1F, false));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.1435F, 4.9933F, 0.7866F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 1.1142F, -0.2917F, -0.1681F);


        this.leg7_r1 = new ModelRenderer(this);
        this.leg7_r1.setRotationPoint(0.0191F, 1.592F, -0.1464F);
        this.rightleg2.addChild(leg7_r1);
        this.setRotateAngle(leg7_r1, 3.0543F, 0.0F, -3.1416F);
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 35, 14, 0.15F, -2.0F, -0.5F, 1, 6, 1, -0.2F, false));
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 31, 47, -0.95F, -2.0F, -0.5F, 1, 6, 1, -0.1F, false));

        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.0416F, 5.5665F, 0.196F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 1.2999F, -0.0804F, 0.024F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 19, 18, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

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
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);


        this.chest7_r1 = new ModelRenderer(this);
        this.chest7_r1.setRotationPoint(-0.5F, -0.2685F, -0.1571F);
        this.body.addChild(chest7_r1);
        this.setRotateAngle(chest7_r1, -0.0326F, -0.4133F, -1.4581F);
        this.chest7_r1.cubeList.add(new ModelBox(chest7_r1, 19, 28, -1.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest6_r1 = new ModelRenderer(this);
        this.chest6_r1.setRotationPoint(-0.5F, -0.2685F, -0.1571F);
        this.body.addChild(chest6_r1);
        this.setRotateAngle(chest6_r1, -0.2715F, -0.3172F, -0.8104F);
        this.chest6_r1.cubeList.add(new ModelBox(chest6_r1, 26, 14, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest5_r1 = new ModelRenderer(this);
        this.chest5_r1.setRotationPoint(-0.5F, -0.9685F, -2.1571F);
        this.body.addChild(chest5_r1);
        this.setRotateAngle(chest5_r1, -0.066F, -0.1614F, -0.7373F);
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 24, 28, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest6_r2 = new ModelRenderer(this);
        this.chest6_r2.setRotationPoint(-0.5F, -0.9685F, -2.1571F);
        this.body.addChild(chest6_r2);
        this.setRotateAngle(chest6_r2, 0.0394F, -0.1697F, -1.3568F);
        this.chest6_r2.cubeList.add(new ModelBox(chest6_r2, 9, 22, -2.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest6_r3 = new ModelRenderer(this);
        this.chest6_r3.setRotationPoint(0.5F, -0.2685F, -0.1571F);
        this.body.addChild(chest6_r3);
        this.setRotateAngle(chest6_r3, -0.0326F, 0.4133F, 1.4581F);
        this.chest6_r3.cubeList.add(new ModelBox(chest6_r3, 19, 28, 0.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest5_r2 = new ModelRenderer(this);
        this.chest5_r2.setRotationPoint(0.5F, -0.2685F, -0.1571F);
        this.body.addChild(chest5_r2);
        this.setRotateAngle(chest5_r2, -0.2715F, 0.3172F, 0.8104F);
        this.chest5_r2.cubeList.add(new ModelBox(chest5_r2, 26, 14, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest4_r1 = new ModelRenderer(this);
        this.chest4_r1.setRotationPoint(0.5F, -0.9685F, -2.1571F);
        this.body.addChild(chest4_r1);
        this.setRotateAngle(chest4_r1, -0.066F, 0.1614F, 0.7373F);
        this.chest4_r1.cubeList.add(new ModelBox(chest4_r1, 24, 28, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest5_r3 = new ModelRenderer(this);
        this.chest5_r3.setRotationPoint(0.5F, -0.9685F, -2.1571F);
        this.body.addChild(chest5_r3);
        this.setRotateAngle(chest5_r3, 0.0394F, 0.1697F, 1.3568F);
        this.chest5_r3.cubeList.add(new ModelBox(chest5_r3, 9, 22, 0.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.6F, -2.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4014F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 17, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.shoulder = new ModelRenderer(this);
        this.shoulder.setRotationPoint(0.0F, -1.1F, -2.6F);
        this.body.addChild(shoulder);


        this.chest7_r2 = new ModelRenderer(this);
        this.chest7_r2.setRotationPoint(-0.5F, -0.5685F, -1.5571F);
        this.shoulder.addChild(chest7_r2);
        this.setRotateAngle(chest7_r2, 0.101F, 0.0578F, -1.3079F);
        this.chest7_r2.cubeList.add(new ModelBox(chest7_r2, 19, 14, -2.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest6_r4 = new ModelRenderer(this);
        this.chest6_r4.setRotationPoint(-0.5F, -0.5685F, -1.5571F);
        this.shoulder.addChild(chest6_r4);
        this.setRotateAngle(chest6_r4, 0.1158F, -0.0105F, -0.7006F);
        this.chest6_r4.cubeList.add(new ModelBox(chest6_r4, 0, 22, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest5_r4 = new ModelRenderer(this);
        this.chest5_r4.setRotationPoint(-2.2F, 2.5287F, -2.6663F);
        this.shoulder.addChild(chest5_r4);
        this.setRotateAngle(chest5_r4, 1.1341F, 0.4326F, -0.5013F);
        this.chest5_r4.cubeList.add(new ModelBox(chest5_r4, 50, 22, 0.1901F, -0.1854F, -0.8257F, 1, 1, 3, -0.2F, true));

        this.chest4_r2 = new ModelRenderer(this);
        this.chest4_r2.setRotationPoint(-0.8F, 0.3287F, -0.8663F);
        this.shoulder.addChild(chest4_r2);
        this.setRotateAngle(chest4_r2, 0.1767F, 0.4736F, 0.0813F);
        this.chest4_r2.cubeList.add(new ModelBox(chest4_r2, 0, 48, -1.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, true));

        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(0.8F, 0.3287F, -0.8663F);
        this.shoulder.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, 0.1767F, -0.4736F, -0.0813F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 0, 48, 0.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, false));

        this.chest4_r3 = new ModelRenderer(this);
        this.chest4_r3.setRotationPoint(2.2F, 2.5287F, -2.6663F);
        this.shoulder.addChild(chest4_r3);
        this.setRotateAngle(chest4_r3, 1.1341F, -0.4326F, 0.5013F);
        this.chest4_r3.cubeList.add(new ModelBox(chest4_r3, 50, 22, -1.1901F, -0.1854F, -0.8257F, 1, 1, 3, -0.2F, false));

        this.chest3_r2 = new ModelRenderer(this);
        this.chest3_r2.setRotationPoint(0.0F, 3.3901F, -3.0432F);
        this.shoulder.addChild(chest3_r2);
        this.setRotateAngle(chest3_r2, -0.6807F, 0.0F, 0.0F);
        this.chest3_r2.cubeList.add(new ModelBox(chest3_r2, 0, 44, -1.5F, -0.9773F, -1.995F, 3, 1, 2, 0.0F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, 3.0901F, -1.7432F);
        this.shoulder.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.0175F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 18, 36, -1.5F, -0.7F, -1.3F, 3, 1, 3, 0.0F, false));

        this.chest5_r5 = new ModelRenderer(this);
        this.chest5_r5.setRotationPoint(0.5F, -0.5685F, -1.5571F);
        this.shoulder.addChild(chest5_r5);
        this.setRotateAngle(chest5_r5, 0.1158F, 0.0105F, 0.7006F);
        this.chest5_r5.cubeList.add(new ModelBox(chest5_r5, 0, 22, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest6_r5 = new ModelRenderer(this);
        this.chest6_r5.setRotationPoint(0.5F, -0.5685F, -1.5571F);
        this.shoulder.addChild(chest6_r5);
        this.setRotateAngle(chest6_r5, 0.101F, -0.0578F, 1.3079F);
        this.chest6_r5.cubeList.add(new ModelBox(chest6_r5, 19, 14, 0.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.2F, -1.7F);
        this.shoulder.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 9, 0.0F, -0.0436F, -0.0682F, 1, 1, 2, -0.003F, false));

        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.4F, 0.775F, -2.5694F);
        this.shoulder.addChild(leftwing1);
        this.setRotateAngle(leftwing1, -0.3677F, 0.2329F, 0.0918F);


        this.upperwing8_r1 = new ModelRenderer(this);
        this.upperwing8_r1.setRotationPoint(1.0746F, 0.0368F, 0.2605F);
        this.leftwing1.addChild(upperwing8_r1);
        this.setRotateAngle(upperwing8_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 23, 44, -0.25F, -0.5F, -0.5F, 5, 1, 1, 0.0F, false));
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 9, 36, -1.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(5.7709F, -0.2894F, -0.2119F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.2449F, 1.2281F, -2.7303F);


        this.wing10_r1 = new ModelRenderer(this);
        this.wing10_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing10_r1);
        this.setRotateAngle(wing10_r1, 0.0F, 0.0F, 0.0F);
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 36, 44, -0.9072F, -2.9026F, -0.7631F, 1, 8, 1, -0.2F, false));
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 41, 44, -0.9072F, -2.9026F, 0.0369F, 1, 8, 1, -0.15F, false));

        this.wing9_r1 = new ModelRenderer(this);
        this.wing9_r1.setRotationPoint(1.8283F, 7.164F, -0.1798F);
        this.leftwing2.addChild(wing9_r1);
        this.setRotateAngle(wing9_r1, 0.0F, -1.5708F, 1.2479F);
        this.wing9_r1.cubeList.add(new ModelBox(wing9_r1, 0, 26, -0.3631F, -0.209F, -0.2009F, 1, 2, 1, -0.21F, false));

        this.wing8_r1 = new ModelRenderer(this);
        this.wing8_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing8_r1);
        this.setRotateAngle(wing8_r1, 0.0F, -1.5708F, 0.4974F);
        this.wing8_r1.cubeList.add(new ModelBox(wing8_r1, 0, 9, -0.3631F, 0.0633F, -3.9225F, 1, 3, 1, -0.21F, false));

        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.7415F, 7.654F, -0.649F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.1116F, 0.2137F, 0.6075F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 26, 47, -0.5F, 0.0F, 0.0F, 1, 7, 1, -0.11F, false));

        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(-0.2828F, 7.0557F, 0.701F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.9745F, -0.6044F, 3.1231F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 19, 18, -0.5799F, -0.5164F, -0.654F, 1, 1, 12, -0.2F, false));

        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.0799F, 0.4836F, 11.346F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.1458F, -0.0059F, 0.1856F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 34, 0, -0.5F, -1.0F, -0.3F, 1, 1, 10, -0.2F, false));

        this.wingfinger9_r1 = new ModelRenderer(this);
        this.wingfinger9_r1.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.leftwing5.addChild(wingfinger9_r1);
        this.setRotateAngle(wingfinger9_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger9_r1.cubeList.add(new ModelBox(wingfinger9_r1, 0, 18, -0.5F, -0.4F, 4.2F, 1, 1, 16, -0.2F, false));

        this.leftwing6 = new ModelRenderer(this);
        this.leftwing6.setRotationPoint(-0.0799F, 0.4836F, 8.346F);
        this.leftwing4.addChild(leftwing6);
        this.setRotateAngle(leftwing6, 0.0594F, 0.0781F, 0.2095F);


        this.leftwing5membrance2 = new ModelRenderer(this);
        this.leftwing5membrance2.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.leftwing6.addChild(leftwing5membrance2);


        this.lefthand2 = new ModelRenderer(this);
        this.lefthand2.setRotationPoint(0.0413F, -0.1155F, 0.5237F);
        this.leftwing4.addChild(lefthand2);
        this.setRotateAngle(lefthand2, 1.2451F, 1.4993F, -2.6545F);
        this.lefthand2.cubeList.add(new ModelBox(lefthand2, 16, 51, -1.0495F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

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
        this.rightwing1.setRotationPoint(-2.4F, 0.475F, -2.5694F);
        this.shoulder.addChild(rightwing1);
        this.setRotateAngle(rightwing1, -0.3865F, 0.2253F, 0.3957F);


        this.upperwing9_r1 = new ModelRenderer(this);
        this.upperwing9_r1.setRotationPoint(-1.0746F, 0.0368F, 0.2605F);
        this.rightwing1.addChild(upperwing9_r1);
        this.setRotateAngle(upperwing9_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 38, 39, -4.75F, -0.5F, -0.5F, 5, 1, 1, 0.0F, false));
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 0, 36, 0.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-5.7709F, -0.2894F, -0.2119F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -1.0543F, -1.3093F, 2.6221F);


        this.wing11_r1 = new ModelRenderer(this);
        this.wing11_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing11_r1);
        this.setRotateAngle(wing11_r1, 0.0F, 0.0F, 0.0F);
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 34, 0, -0.0928F, -2.9026F, -0.7631F, 1, 8, 1, -0.2F, false));
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 39, 0, -0.0928F, -2.9026F, 0.0369F, 1, 8, 1, -0.15F, false));

        this.wing10_r2 = new ModelRenderer(this);
        this.wing10_r2.setRotationPoint(-1.8283F, 7.164F, -0.1798F);
        this.rightwing2.addChild(wing10_r2);
        this.setRotateAngle(wing10_r2, 0.0F, 1.5708F, -1.2479F);
        this.wing10_r2.cubeList.add(new ModelBox(wing10_r2, 0, 18, -0.6369F, -0.209F, -0.2009F, 1, 2, 1, -0.21F, false));

        this.wing9_r2 = new ModelRenderer(this);
        this.wing9_r2.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing9_r2);
        this.setRotateAngle(wing9_r2, 0.0F, 1.5708F, -0.4974F);
        this.wing9_r2.cubeList.add(new ModelBox(wing9_r2, 0, 0, -0.6369F, 0.0633F, -3.9225F, 1, 3, 1, -0.21F, false));

        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.7415F, 7.654F, -0.649F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, -0.0355F, -0.2352F, -0.3398F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 47, 0, -0.5F, 0.0F, 0.0F, 1, 7, 1, -0.11F, false));

        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(0.2828F, 7.0557F, 0.701F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.6774F, 0.6337F, 2.9489F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 19, 0, -0.4201F, -0.5164F, -0.654F, 1, 1, 12, -0.2F, false));

        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.0799F, 0.4836F, 11.346F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.1458F, 0.0059F, -0.1856F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 25, 32, -0.5F, -1.0F, -0.3F, 1, 1, 10, -0.2F, false));

        this.wingfinger10_r1 = new ModelRenderer(this);
        this.wingfinger10_r1.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.rightwing5.addChild(wingfinger10_r1);
        this.setRotateAngle(wingfinger10_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger10_r1.cubeList.add(new ModelBox(wingfinger10_r1, 0, 0, -0.5F, -0.4F, 4.2F, 1, 1, 16, -0.2F, false));

        this.rightwing6 = new ModelRenderer(this);
        this.rightwing6.setRotationPoint(0.0799F, 0.4836F, 8.346F);
        this.rightwing4.addChild(rightwing6);
        this.setRotateAngle(rightwing6, 0.0594F, -0.0781F, -0.2095F);


        this.rightwing5membrance2 = new ModelRenderer(this);
        this.rightwing5membrance2.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.rightwing6.addChild(rightwing5membrance2);


        this.righthand2 = new ModelRenderer(this);
        this.righthand2.setRotationPoint(-0.0413F, -0.1155F, 0.5237F);
        this.rightwing4.addChild(righthand2);
        this.setRotateAngle(righthand2, 1.2451F, -1.4993F, 2.6545F);
        this.righthand2.cubeList.add(new ModelBox(righthand2, 7, 51, -0.9505F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

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
        this.neck3.setRotationPoint(0.0F, -0.7F, -2.4F);
        this.shoulder.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, 0.0873F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.3F, -1.4F);
        this.neck3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 53, 45, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.1F, -1.0F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.1309F, -0.0436F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -1.3F, -1.9F);
        this.neck2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3665F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 53, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.003F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.7F, -1.9F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.1309F, 0.0873F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -0.8F, -1.7F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2094F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 57, 6, 0.0F, -0.2F, -0.2F, 1, 1, 2, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.8F, -1.1F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0426F, 0.4264F, 0.0233F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.7319F, -0.7824F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6981F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 52, 0, -1.0F, -1.7387F, -1.0082F, 3, 2, 1, 0.003F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.3F, 3.2407F, -7.4954F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 46, -0.5F, -0.5F, -2.1F, 1, 1, 3, -0.1F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 46, 0.1F, -0.5F, -2.1F, 1, 1, 3, -0.1F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 3.8F, -9.6F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2094F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 18, -1.3F, -0.4126F, -5.8186F, 1, 1, 6, -0.11F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 18, -0.7F, -0.4126F, -5.8186F, 1, 1, 6, -0.1F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.2F, 2.8F, -5.5F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3316F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 42, -1.0F, -0.9907F, -0.0415F, 1, 1, 3, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 42, -0.4F, -0.9907F, -0.0415F, 1, 1, 3, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 3.8F, -9.4F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 36, -1.3F, -0.9473F, -6.0156F, 1, 1, 6, 0.002F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 36, -0.7F, -0.9473F, -6.0156F, 1, 1, 6, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.2F, 3.6F, -8.4F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 0, -1.0F, -1.0129F, -1.0333F, 1, 1, 4, -0.003F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 0, -0.4F, -1.0129F, -1.0333F, 1, 1, 4, 0.003F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.2F, -0.4F, -4.9F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4538F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.0F, 0.048F, -4.9325F, 1, 2, 6, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.4F, 0.048F, -4.9325F, 1, 2, 6, -0.003F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.4F, 2.4694F, -7.5705F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.288F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 9, -1.5F, -0.6706F, -0.2091F, 1, 1, 5, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 9, -0.3F, -0.6706F, -0.2091F, 1, 1, 5, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.4F, 2.4694F, -6.6705F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4974F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 38, 32, -1.5F, -1.1F, -1.0F, 1, 1, 5, 0.003F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 38, 32, -0.3F, -1.1F, -1.0F, 1, 1, 5, 0.003F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.6631F, -2.0113F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6632F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 19, 55, -1.51F, -0.9F, -1.0F, 1, 1, 2, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 19, 55, 0.51F, -0.9F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.9631F, -1.9113F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 1.1345F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 12, 55, -1.51F, -0.0174F, -2.1597F, 1, 1, 2, 0.003F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 44, 24, -1.73F, -0.1174F, -1.2597F, 1, 1, 1, -0.2F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 36, -1.85F, -0.1174F, -1.2597F, 1, 1, 1, -0.3F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 36, 0.85F, -0.1174F, -1.2597F, 1, 1, 1, -0.3F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 44, 24, 0.73F, -0.1174F, -1.2597F, 1, 1, 1, -0.2F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 12, 55, 0.51F, -0.0174F, -2.1597F, 1, 1, 2, 0.003F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.2F, -0.2285F, -1.6933F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.0123F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 55, 49, -1.41F, 0.3F, -0.7F, 1, 1, 2, -0.1F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 55, 49, 0.81F, 0.3F, -0.7F, 1, 1, 2, -0.1F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 0.9319F, -0.9824F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3927F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 41, -2.0F, -0.3F, -0.9F, 1, 1, 1, -0.003F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 41, 0.0F, -0.3F, -0.9F, 1, 1, 1, -0.003F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 1.4F, -11.5F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.192F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 46, 27, 0.0F, -0.0193F, 0.0001F, 1, 1, 3, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 1.6F, -12.5F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2094F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 38, 32, 0.0F, -0.0071F, 0.0198F, 1, 1, 1, -0.003F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 2.2F, -13.1F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.7679F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 14, 36, 0.0F, -0.0219F, -0.1318F, 1, 1, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 3.9F, -15.5F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.6283F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 46, 32, 0.0F, 0.0135F, 0.0091F, 1, 1, 3, -0.003F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 1.9F, -9.3F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.192F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 10, 39, 0.0F, 0.0096F, -4.3696F, 1, 1, 5, 0.003F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.6F, -3.2F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.6283F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 9, 0, -0.5F, 0.0195F, 0.9868F, 1, 2, 2, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 19, 6, -1.0F, 0.0195F, -2.0132F, 2, 2, 3, 0.003F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, -0.7F, 0.3F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.6632F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 26, 0, -1.5F, -1.8557F, -3.961F, 1, 2, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 26, 0, -0.5F, -1.8557F, -3.961F, 1, 2, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 34, 24, -2.0F, -1.8557F, -2.961F, 3, 2, 3, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.9F, -1.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6545F, 0.0F, 0.0F);


        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 4.1F, -12.1F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.4887F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 57, 25, -1.0F, -0.8105F, 0.52F, 1, 1, 2, -0.1F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 4.1F, -12.1F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3491F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 52, 27, -1.0F, -0.9105F, -0.08F, 1, 1, 1, -0.11F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 3.9F, -13.4F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1571F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 56, 57, -1.0F, -0.9163F, -0.5647F, 1, 1, 2, -0.1F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 2.6F, -7.5F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.192F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 14, 46, -0.9F, -0.9214F, -6.6798F, 1, 1, 1, -0.1F, true));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 26, -0.9F, -0.9214F, -5.8798F, 1, 1, 6, -0.1F, true));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 14, 46, -0.1F, -0.9214F, -6.6798F, 1, 1, 1, -0.1F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 26, -0.1F, -0.9214F, -5.8798F, 1, 1, 6, -0.1F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.8F, -7.7F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1222F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 34, 14, -0.9F, -0.2979F, -6.5361F, 1, 1, 8, -0.13F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 34, 14, -0.1F, -0.2979F, -6.5361F, 1, 1, 8, -0.13F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.1F, 1.9F, -4.8F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2443F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 46, 47, -1.0F, -0.887F, -2.8752F, 1, 1, 3, -0.1F, true));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 46, 47, -0.2F, -0.887F, -2.8752F, 1, 1, 3, -0.1F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.1F, 0.1F, -2.5F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3665F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 17, 46, -1.0F, -0.0708F, -2.9234F, 1, 1, 3, -0.1F, true));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 17, 46, -0.2F, -0.0708F, -2.9234F, 1, 1, 3, -0.1F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0873F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 34, 54, -1.5F, -0.2F, -1.7F, 1, 1, 2, -0.1F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 5, 55, -1.1F, -0.2F, -2.7F, 1, 1, 2, -0.1F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 34, 54, 0.5F, -0.2F, -1.7F, 1, 1, 2, -0.1F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 5, 55, 0.1F, -0.2F, -2.7F, 1, 1, 2, -0.1F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4F, 1.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1232F, 0.1299F, -0.016F);
        this.tail.cubeList.add(new ModelBox(tail, 45, 12, -0.5F, -0.1F, -0.1F, 1, 1, 3, 0.0F, false));

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
