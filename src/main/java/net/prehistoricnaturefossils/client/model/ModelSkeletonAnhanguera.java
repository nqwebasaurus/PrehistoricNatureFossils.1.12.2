package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAnhanguera extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer hips;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body8_r1;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body9_r1;
    private final ModelRenderer body8_r2;
    private final ModelRenderer body7_r1;
    private final ModelRenderer body4_r1;
    private final ModelRenderer body8_r3;
    private final ModelRenderer body7_r2;
    private final ModelRenderer body6_r2;
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
    private final ModelRenderer chest4_r2;
    private final ModelRenderer chest5_r4;
    private final ModelRenderer chest6_r4;
    private final ModelRenderer chest7_r2;
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
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r4;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r7;
    private final ModelRenderer head;
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
    private final ModelRenderer jaw;
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
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer tail;

    public ModelSkeletonAnhanguera() {
        this.textureWidth = 68;
        this.textureHeight = 65;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -17.0F, 3.6F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 1.0001F, 0.0603F, -0.1163F);


        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-1.4F, -0.4051F, 0.6276F);
        this.hips.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -0.6545F, 0.0F, 0.0F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 53, 54, -0.5F, -0.5F, -0.8F, 1, 1, 2, -0.31F, true));
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 53, 54, 2.3F, -0.5F, -0.8F, 1, 1, 2, -0.31F, false));

        this.body8_r1 = new ModelRenderer(this);
        this.body8_r1.setRotationPoint(-1.4F, -0.3437F, -0.6782F);
        this.hips.addChild(body8_r1);
        this.setRotateAngle(body8_r1, 0.1134F, 0.0F, 0.0F);
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 38, 49, -0.1F, -0.4018F, -0.4752F, 2, 1, 2, -0.3F, true));
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 55, 6, -0.5F, -0.4018F, -0.4752F, 1, 1, 2, -0.3F, true));
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 38, 49, 0.9F, -0.4018F, -0.4752F, 2, 1, 2, -0.3F, false));
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 55, 6, 2.3F, -0.4018F, -0.4752F, 1, 1, 2, -0.3F, false));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(-1.1015F, -0.519F, -1.1428F);
        this.hips.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -0.6155F, -0.1854F, 0.0503F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 53, 39, -0.7F, -0.5F, -1.0F, 1, 1, 2, -0.3F, true));

        this.body9_r1 = new ModelRenderer(this);
        this.body9_r1.setRotationPoint(-0.8558F, 0.7424F, 0.9592F);
        this.hips.addChild(body9_r1);
        this.setRotateAngle(body9_r1, -2.5569F, 0.0F, -0.7243F);
        this.body9_r1.cubeList.add(new ModelBox(body9_r1, 40, 53, -0.4498F, -0.4635F, -0.1149F, 1, 1, 2, -0.31F, true));

        this.body8_r2 = new ModelRenderer(this);
        this.body8_r2.setRotationPoint(-0.8558F, 0.7424F, 0.9592F);
        this.hips.addChild(body8_r2);
        this.setRotateAngle(body8_r2, 3.0281F, 0.0F, -0.7243F);
        this.body8_r2.cubeList.add(new ModelBox(body8_r2, 55, 10, -0.4498F, -0.7196F, -0.6815F, 1, 1, 2, -0.3F, true));

        this.body7_r1 = new ModelRenderer(this);
        this.body7_r1.setRotationPoint(-1.2558F, -0.0576F, 0.9592F);
        this.hips.addChild(body7_r1);
        this.setRotateAngle(body7_r1, -1.0472F, 0.0F, -0.3752F);
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 57, 30, -0.3708F, 0.6836F, -1.15F, 1, 1, 2, -0.31F, true));
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 55, 23, -0.3708F, 0.2836F, -1.05F, 1, 1, 2, -0.3F, true));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(1.1015F, -0.519F, -1.1428F);
        this.hips.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -0.6155F, 0.1854F, -0.0503F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 53, 39, -0.3F, -0.5F, -1.0F, 1, 1, 2, -0.3F, false));

        this.body8_r3 = new ModelRenderer(this);
        this.body8_r3.setRotationPoint(0.8558F, 0.7424F, 0.9592F);
        this.hips.addChild(body8_r3);
        this.setRotateAngle(body8_r3, -2.5569F, 0.0F, 0.7243F);
        this.body8_r3.cubeList.add(new ModelBox(body8_r3, 40, 53, -0.5502F, -0.4635F, -0.1149F, 1, 1, 2, -0.31F, false));

        this.body7_r2 = new ModelRenderer(this);
        this.body7_r2.setRotationPoint(0.8558F, 0.7424F, 0.9592F);
        this.hips.addChild(body7_r2);
        this.setRotateAngle(body7_r2, 3.0281F, 0.0F, 0.7243F);
        this.body7_r2.cubeList.add(new ModelBox(body7_r2, 55, 10, -0.5502F, -0.7196F, -0.6815F, 1, 1, 2, -0.3F, false));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(1.2558F, -0.0576F, 0.9592F);
        this.hips.addChild(body6_r2);
        this.setRotateAngle(body6_r2, -1.0472F, 0.0F, 0.3752F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 57, 30, -0.6292F, 0.6836F, -1.15F, 1, 1, 2, -0.31F, false));
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 55, 23, -0.6292F, 0.2836F, -1.05F, 1, 1, 2, -0.3F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.5F, 0.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 57, 0, -1.0F, -0.3F, -1.0F, 1, 1, 2, -0.003F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.7F, -0.075F, -0.1694F);
        this.hips.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.7274F, 0.0306F, -0.4169F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 28, 53, -0.3039F, 0.0711F, -0.3881F, 1, 5, 1, -0.1F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.1435F, 4.9933F, 0.7866F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.7652F, 0.2917F, 0.1681F);


        this.leg6_r1 = new ModelRenderer(this);
        this.leg6_r1.setRotationPoint(-0.0191F, 1.592F, -0.1464F);
        this.leftleg2.addChild(leg6_r1);
        this.setRotateAngle(leg6_r1, 3.0543F, 0.0F, 3.1416F);
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 14, 51, -1.15F, -2.0F, -0.5F, 1, 6, 1, -0.2F, false));
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 52, 0, -0.05F, -2.0F, -0.5F, 1, 6, 1, -0.1F, false));

        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0416F, 5.5665F, 0.196F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 1.2999F, 0.0804F, -0.024F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 11, 36, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

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
        this.setRotateAngle(rightleg1, 0.8816F, 0.0283F, 0.5357F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 52, 32, -0.6961F, 0.0711F, -0.3881F, 1, 5, 1, -0.1F, false));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.1435F, 4.9933F, 0.7866F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.7991F, -0.1376F, -0.3263F);


        this.leg7_r1 = new ModelRenderer(this);
        this.leg7_r1.setRotationPoint(0.0191F, 1.592F, -0.1464F);
        this.rightleg2.addChild(leg7_r1);
        this.setRotateAngle(leg7_r1, 3.0543F, 0.0F, -3.1416F);
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 4, 50, 0.15F, -2.0F, -0.5F, 1, 6, 1, -0.2F, false));
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 9, 50, -0.95F, -2.0F, -0.5F, 1, 6, 1, -0.1F, false));

        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.0416F, 5.5665F, 0.196F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 1.2999F, -0.0804F, 0.024F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 0, 36, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

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
        this.setRotateAngle(body, 0.1752F, 0.0859F, 0.0152F);


        this.chest7_r1 = new ModelRenderer(this);
        this.chest7_r1.setRotationPoint(-0.5F, -0.2685F, -0.1571F);
        this.body.addChild(chest7_r1);
        this.setRotateAngle(chest7_r1, -0.0326F, -0.4133F, -1.4581F);
        this.chest7_r1.cubeList.add(new ModelBox(chest7_r1, 11, 29, -1.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest6_r1 = new ModelRenderer(this);
        this.chest6_r1.setRotationPoint(-0.5F, -0.2685F, -0.1571F);
        this.body.addChild(chest6_r1);
        this.setRotateAngle(chest6_r1, -0.2715F, -0.3172F, -0.8104F);
        this.chest6_r1.cubeList.add(new ModelBox(chest6_r1, 31, 14, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest5_r1 = new ModelRenderer(this);
        this.chest5_r1.setRotationPoint(-0.5F, -0.9685F, -2.1571F);
        this.body.addChild(chest5_r1);
        this.setRotateAngle(chest5_r1, -0.066F, -0.1614F, -0.7373F);
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 19, 32, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest6_r2 = new ModelRenderer(this);
        this.chest6_r2.setRotationPoint(-0.5F, -0.9685F, -2.1571F);
        this.body.addChild(chest6_r2);
        this.setRotateAngle(chest6_r2, 0.0394F, -0.1697F, -1.3568F);
        this.chest6_r2.cubeList.add(new ModelBox(chest6_r2, 19, 14, -2.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest6_r3 = new ModelRenderer(this);
        this.chest6_r3.setRotationPoint(0.5F, -0.2685F, -0.1571F);
        this.body.addChild(chest6_r3);
        this.setRotateAngle(chest6_r3, -0.0326F, 0.4133F, 1.4581F);
        this.chest6_r3.cubeList.add(new ModelBox(chest6_r3, 11, 29, 0.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest5_r2 = new ModelRenderer(this);
        this.chest5_r2.setRotationPoint(0.5F, -0.2685F, -0.1571F);
        this.body.addChild(chest5_r2);
        this.setRotateAngle(chest5_r2, -0.2715F, 0.3172F, 0.8104F);
        this.chest5_r2.cubeList.add(new ModelBox(chest5_r2, 31, 14, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest4_r1 = new ModelRenderer(this);
        this.chest4_r1.setRotationPoint(0.5F, -0.9685F, -2.1571F);
        this.body.addChild(chest4_r1);
        this.setRotateAngle(chest4_r1, -0.066F, 0.1614F, 0.7373F);
        this.chest4_r1.cubeList.add(new ModelBox(chest4_r1, 19, 32, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest5_r3 = new ModelRenderer(this);
        this.chest5_r3.setRotationPoint(0.5F, -0.9685F, -2.1571F);
        this.body.addChild(chest5_r3);
        this.setRotateAngle(chest5_r3, 0.0394F, 0.1697F, 1.3568F);
        this.chest5_r3.cubeList.add(new ModelBox(chest5_r3, 19, 14, 0.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.6F, -2.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4014F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 25, 0.5F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 46, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.shoulder = new ModelRenderer(this);
        this.shoulder.setRotationPoint(0.0F, -1.1F, -2.6F);
        this.body.addChild(shoulder);
        this.setRotateAngle(shoulder, 0.0F, 0.0F, -0.0873F);


        this.chest4_r2 = new ModelRenderer(this);
        this.chest4_r2.setRotationPoint(-0.8F, -0.1713F, -0.6663F);
        this.shoulder.addChild(chest4_r2);
        this.setRotateAngle(chest4_r2, 0.1767F, 0.4736F, 0.0813F);
        this.chest4_r2.cubeList.add(new ModelBox(chest4_r2, 49, 14, -1.0F, -0.7F, -2.5F, 1, 1, 3, -0.2F, true));

        this.chest5_r4 = new ModelRenderer(this);
        this.chest5_r4.setRotationPoint(-2.2F, 2.1287F, -2.4663F);
        this.shoulder.addChild(chest5_r4);
        this.setRotateAngle(chest5_r4, 1.4308F, 0.4326F, -0.5013F);
        this.chest5_r4.cubeList.add(new ModelBox(chest5_r4, 49, 27, 0.2337F, -0.2042F, -0.7378F, 1, 1, 3, -0.2F, true));

        this.chest6_r4 = new ModelRenderer(this);
        this.chest6_r4.setRotationPoint(-0.5F, -0.5685F, -1.5571F);
        this.shoulder.addChild(chest6_r4);
        this.setRotateAngle(chest6_r4, 0.1158F, -0.0105F, -0.7006F);
        this.chest6_r4.cubeList.add(new ModelBox(chest6_r4, 26, 14, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest7_r2 = new ModelRenderer(this);
        this.chest7_r2.setRotationPoint(-0.5F, -0.5685F, -1.5571F);
        this.shoulder.addChild(chest7_r2);
        this.setRotateAngle(chest7_r2, 0.101F, 0.0578F, -1.3079F);
        this.chest7_r2.cubeList.add(new ModelBox(chest7_r2, 9, 4, -2.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(0.8F, -0.1713F, -0.6663F);
        this.shoulder.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, 0.1767F, -0.4736F, -0.0813F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 49, 14, 0.0F, -0.7F, -2.5F, 1, 1, 3, -0.2F, false));

        this.chest4_r3 = new ModelRenderer(this);
        this.chest4_r3.setRotationPoint(2.2F, 2.1287F, -2.4663F);
        this.shoulder.addChild(chest4_r3);
        this.setRotateAngle(chest4_r3, 1.4308F, -0.4326F, 0.5013F);
        this.chest4_r3.cubeList.add(new ModelBox(chest4_r3, 49, 27, -1.2337F, -0.2042F, -0.7378F, 1, 1, 3, -0.2F, false));

        this.chest3_r2 = new ModelRenderer(this);
        this.chest3_r2.setRotationPoint(0.0F, 2.8901F, -2.8432F);
        this.shoulder.addChild(chest3_r2);
        this.setRotateAngle(chest3_r2, -0.6807F, 0.0F, 0.0F);
        this.chest3_r2.cubeList.add(new ModelBox(chest3_r2, 22, 36, -1.5F, -0.9773F, -1.995F, 3, 1, 2, 0.0F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, 2.8901F, -2.7432F);
        this.shoulder.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, -0.384F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 5, 41, -1.5F, -0.979F, -0.0949F, 3, 1, 2, 0.0F, false));

        this.chest5_r5 = new ModelRenderer(this);
        this.chest5_r5.setRotationPoint(0.5F, -0.5685F, -1.5571F);
        this.shoulder.addChild(chest5_r5);
        this.setRotateAngle(chest5_r5, 0.1158F, 0.0105F, 0.7006F);
        this.chest5_r5.cubeList.add(new ModelBox(chest5_r5, 26, 14, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest6_r5 = new ModelRenderer(this);
        this.chest6_r5.setRotationPoint(0.5F, -0.5685F, -1.5571F);
        this.shoulder.addChild(chest6_r5);
        this.setRotateAngle(chest6_r5, 0.101F, -0.0578F, 1.3079F);
        this.chest6_r5.cubeList.add(new ModelBox(chest6_r5, 9, 4, 0.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.2F, -1.7F);
        this.shoulder.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 18, 0.5F, -0.7436F, -0.0682F, 0, 1, 1, -0.003F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 53, 0.0F, -0.0436F, -0.0682F, 1, 1, 2, -0.003F, false));

        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.4F, 0.775F, -2.5694F);
        this.shoulder.addChild(leftwing1);
        this.setRotateAngle(leftwing1, -1.4833F, -1.1544F, 1.3316F);


        this.upperwing8_r1 = new ModelRenderer(this);
        this.upperwing8_r1.setRotationPoint(1.0746F, 0.0368F, 0.2605F);
        this.leftwing1.addChild(upperwing8_r1);
        this.setRotateAngle(upperwing8_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 34, 26, -0.25F, -0.5F, -0.5F, 5, 1, 1, 0.0F, false));
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 5, 58, -1.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(5.7709F, -0.2894F, -0.2119F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.3656F, -1.0146F, 3.0697F);


        this.wing10_r1 = new ModelRenderer(this);
        this.wing10_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing10_r1);
        this.setRotateAngle(wing10_r1, 0.0F, 0.0F, 0.0F);
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 39, 0, -0.9072F, -2.9026F, -0.7631F, 1, 8, 1, -0.2F, false));
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 0, 41, -0.9072F, -2.9026F, 0.0369F, 1, 8, 1, -0.15F, false));

        this.wing9_r1 = new ModelRenderer(this);
        this.wing9_r1.setRotationPoint(1.8283F, 7.164F, -0.1798F);
        this.leftwing2.addChild(wing9_r1);
        this.setRotateAngle(wing9_r1, 0.0F, -1.5708F, 1.2479F);
        this.wing9_r1.cubeList.add(new ModelBox(wing9_r1, 26, 6, -0.3631F, -0.209F, -0.2009F, 1, 2, 1, -0.21F, false));

        this.wing8_r1 = new ModelRenderer(this);
        this.wing8_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing8_r1);
        this.setRotateAngle(wing8_r1, 0.0F, -1.5708F, 0.4974F);
        this.wing8_r1.cubeList.add(new ModelBox(wing8_r1, 0, 8, -0.3631F, 0.0633F, -3.9225F, 1, 3, 1, -0.21F, false));

        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.7415F, 7.654F, -0.649F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.2936F, 0.0281F, 2.4234F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 48, 48, -0.5F, 0.0F, 0.0F, 1, 7, 1, -0.11F, false));

        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(-0.2828F, 7.0557F, 0.701F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.9038F, -0.8588F, -2.9851F);
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
        this.lefthand2.cubeList.add(new ModelBox(lefthand2, 29, 49, -1.0495F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

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
        this.rightwing1.setRotationPoint(-2.4F, 0.775F, -2.5694F);
        this.shoulder.addChild(rightwing1);
        this.setRotateAngle(rightwing1, -0.7656F, 1.2265F, -0.4312F);


        this.upperwing9_r1 = new ModelRenderer(this);
        this.upperwing9_r1.setRotationPoint(-1.0746F, 0.0368F, 0.2605F);
        this.rightwing1.addChild(upperwing9_r1);
        this.setRotateAngle(upperwing9_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 0, 31, -4.75F, -0.5F, -0.5F, 5, 1, 1, 0.0F, false));
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 47, 57, 0.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-5.7709F, -0.2894F, -0.2119F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -1.309F, 1.142F, -3.0057F);


        this.wing11_r1 = new ModelRenderer(this);
        this.wing11_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing11_r1);
        this.setRotateAngle(wing11_r1, 0.0F, 0.0F, 0.0F);
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 34, 0, -0.0928F, -2.9026F, -0.7631F, 1, 8, 1, -0.2F, false));
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 38, 32, -0.0928F, -2.9026F, 0.0369F, 1, 8, 1, -0.15F, false));

        this.wing10_r2 = new ModelRenderer(this);
        this.wing10_r2.setRotationPoint(-1.8283F, 7.164F, -0.1798F);
        this.rightwing2.addChild(wing10_r2);
        this.setRotateAngle(wing10_r2, 0.0F, 1.5708F, -1.2479F);
        this.wing10_r2.cubeList.add(new ModelBox(wing10_r2, 26, 0, -0.6369F, -0.209F, -0.2009F, 1, 2, 1, -0.21F, false));

        this.wing9_r2 = new ModelRenderer(this);
        this.wing9_r2.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing9_r2);
        this.setRotateAngle(wing9_r2, 0.0F, 1.5708F, -0.4974F);
        this.wing9_r2.cubeList.add(new ModelBox(wing9_r2, 0, 0, -0.6369F, 0.0633F, -3.9225F, 1, 3, 1, -0.21F, false));

        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.7415F, 7.654F, -0.649F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.1559F, 0.1841F, -2.5533F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 47, 0, -0.5F, 0.0F, 0.0F, 1, 7, 1, -0.11F, false));

        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(0.2828F, 7.0557F, 0.701F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.6211F, 0.8926F, 2.5211F);
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
        this.righthand2.cubeList.add(new ModelBox(righthand2, 7, 25, -0.9505F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

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


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.9F, -2.0F);
        this.shoulder.addChild(neck4);
        this.setRotateAngle(neck4, -0.0436F, 0.0019F, 0.0436F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.2F, 0.4F);
        this.neck4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2356F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 22, 0.0F, -1.1964F, -2.1554F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 53, 19, -0.5F, -0.1964F, -2.1554F, 1, 1, 2, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.2F, -1.6F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.1272F, 0.0089F, 0.0899F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.neck3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.733F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 24, 0.0F, -1.8F, -2.3F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 53, 46, -0.5F, -1.0F, -2.3F, 1, 1, 2, 0.005F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.2F, -1.2F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.2616F, 0.0113F, 0.0421F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -3.3261F, -2.1737F);
        this.neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.8552F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 0, 0.5F, -0.7461F, 1.944F, 0, 1, 1, -0.003F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 6, 0.5F, -0.7461F, -0.056F, 0, 1, 1, -0.003F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 18, 0.0F, 0.0539F, -0.056F, 1, 1, 4, -0.003F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.8261F, -2.5737F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.3918F, -0.0267F, -0.0645F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 1.1238F, 1.8425F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2094F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 13, 0.5F, -1.9F, -3.9F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 44, 0.0F, -1.3F, -4.9F, 1, 1, 3, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4762F, -1.8575F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0349F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -0.6378F, 0.3057F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3665F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 18, -1.8F, 0.3289F, -0.5763F, 1, 2, 1, -0.303F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 18, -0.2F, 0.3289F, -0.5763F, 1, 2, 1, -0.303F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 24, -0.2F, -0.2711F, -0.5763F, 1, 2, 1, -0.3F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.9319F, -0.9824F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5672F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 8, 0.0F, -1.5F, -1.0F, 2, 3, 1, -0.003F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.2F, 2.0F, -3.1F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 36, 0.0F, -1.0157F, 0.0288F, 1, 1, 1, 0.005F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.2F, 2.8F, -5.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3316F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 18, 0.0F, -1.4907F, 0.9585F, 1, 1, 2, -0.004F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.2F, 3.6F, -8.4F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 0, -1.0F, -1.1129F, -1.0333F, 1, 1, 4, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 0, -0.4F, -1.1129F, -1.0333F, 1, 1, 4, 0.003F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.2F, 1.9F, -3.1F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2967F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 43, 34, -1.0F, -0.9211F, -2.6038F, 1, 1, 3, -0.004F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 43, 34, -0.4F, -0.9211F, -2.6038F, 1, 1, 3, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.8F, 2.4F, -11.0F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1396F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 14, 0.3F, 0.394F, -1.8555F, 1, 1, 4, -0.199F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 20, 0.3F, -0.206F, -0.1555F, 1, 1, 4, -0.2F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.8F, 2.5F, -11.5F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 62, 12, 0.3F, -0.1732F, -0.2466F, 1, 1, 1, -0.203F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.8F, 3.2F, -13.0F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.4189F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 33, 57, 0.3F, -0.2026F, -0.1916F, 1, 1, 2, -0.2F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.8F, 4.0F, -14.9F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3142F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 49, 0.3F, -0.3763F, -0.3374F, 1, 1, 3, -0.199F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.3F, 3.0147F, -7.0384F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2967F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 18, -0.5F, -0.5F, -2.3F, 1, 1, 5, -0.1F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 18, 0.1F, -0.5F, -2.3F, 1, 1, 5, -0.1F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.6F, 3.7777F, -9.6006F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2844F, -0.0534F, 0.4508F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 37, 61, -0.2F, -0.5015F, -0.5244F, 1, 1, 1, -0.2F, true));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.6F, 3.8777F, -10.8006F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1972F, -0.0534F, 0.4508F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 32, 61, -0.0895F, -0.3029F, -0.5173F, 1, 1, 1, -0.2F, true));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.6F, 3.9777F, -11.6006F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1851F, -0.0867F, 0.6226F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 57, 61, -0.0992F, -0.2492F, -0.614F, 1, 1, 1, -0.2F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 4.1777F, -12.6006F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0879F, -0.1055F, 0.7261F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 62, 23, -0.2907F, -0.3064F, -0.6026F, 1, 1, 1, -0.2F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 62, 26, -0.2907F, -0.0064F, -0.6026F, 1, 1, 1, -0.203F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 62, 59, -0.2907F, 0.1936F, -1.7026F, 1, 1, 1, -0.203F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 62, 15, -0.2907F, -0.3064F, -1.7026F, 1, 1, 1, -0.2F, true));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.4F, 4.4777F, -14.6006F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3583F, -0.4624F, 0.8356F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 62, 62, -0.4421F, 0.2321F, -0.6821F, 1, 1, 1, -0.203F, true));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.4F, 4.4777F, -14.6006F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.5677F, -0.4624F, 0.8356F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 62, 29, -0.4421F, -0.2818F, -0.5823F, 1, 1, 1, -0.2F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.4F, 4.4777F, -14.6006F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3583F, 0.4624F, -0.8356F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 62, 62, -0.5579F, 0.2321F, -0.6821F, 1, 1, 1, -0.203F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.4F, 4.4777F, -14.6006F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.5677F, 0.4624F, -0.8356F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 62, 29, -0.5579F, -0.2818F, -0.5823F, 1, 1, 1, -0.2F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 4.1777F, -12.6006F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0879F, 0.1055F, -0.7261F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 62, 15, -0.7093F, -0.3064F, -1.7026F, 1, 1, 1, -0.2F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 62, 59, -0.7093F, 0.1936F, -1.7026F, 1, 1, 1, -0.203F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 62, 26, -0.7093F, -0.0064F, -0.6026F, 1, 1, 1, -0.203F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 62, 23, -0.7093F, -0.3064F, -0.6026F, 1, 1, 1, -0.2F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.6F, 3.9777F, -11.6006F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1851F, 0.0867F, -0.6226F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 57, 61, -0.9008F, -0.2492F, -0.614F, 1, 1, 1, -0.2F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.6F, 3.8777F, -10.8006F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1972F, 0.0534F, -0.4508F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 32, 61, -0.9105F, -0.3029F, -0.5173F, 1, 1, 1, -0.2F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.6F, 3.7777F, -9.6006F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2844F, 0.0534F, -0.4508F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 37, 61, -0.8F, -0.5015F, -0.5244F, 1, 1, 1, -0.2F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 3.7F, -9.4F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1222F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 0, -1.2F, -0.7488F, -5.833F, 1, 1, 6, -0.203F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 0, -0.8F, -0.7488F, -5.833F, 1, 1, 6, -0.2F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.2F, 0.9F, -5.6F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.4014F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 8, -1.0F, 0.0056F, -4.619F, 1, 1, 5, -0.008F, true));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 8, -0.4F, 0.0056F, -4.619F, 1, 1, 5, -0.003F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.2F, -0.7F, -3.0F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.5585F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 22, 44, -1.0F, -0.0153F, -3.0718F, 1, 1, 3, -0.003F, true));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 22, 44, -0.4F, -0.0153F, -3.0718F, 1, 1, 3, -0.001F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, -0.8031F, -2.7006F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.5934F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 52, 61, -1.51F, 0.0095F, 0.5286F, 1, 1, 1, -0.003F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 61, 56, -1.51F, 0.0095F, 0.0286F, 1, 1, 1, 0.0F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, 0.8519F, -2.8019F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.5934F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 11, 45, -1.51F, -0.9918F, 0.0391F, 1, 1, 1, 0.0F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 11, 45, -0.49F, -0.9918F, 0.0391F, 1, 1, 1, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, -1.9631F, -1.9113F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 1.1345F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 19, 54, -1.51F, 0.2963F, -2.7993F, 1, 1, 2, 0.003F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 19, 61, -1.63F, 0.0963F, -1.8993F, 1, 1, 1, -0.1F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 9, 61, -1.81F, 0.0963F, -1.8993F, 1, 1, 1, -0.25F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 9, 61, -0.19F, 0.0963F, -1.8993F, 1, 1, 1, -0.25F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 19, 61, -0.37F, 0.0963F, -1.8993F, 1, 1, 1, -0.1F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 19, 54, -0.49F, 0.2963F, -2.7993F, 1, 1, 2, 0.003F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, -0.0031F, -3.2006F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.925F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 61, 9, -1.51F, -0.0726F, -0.0316F, 1, 1, 1, 0.002F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.2F, -0.2285F, -1.6933F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 1.0123F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 40, 57, -1.11F, 0.3418F, -1.4756F, 1, 1, 2, -0.3F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 40, 57, 0.51F, 0.3418F, -1.4756F, 1, 1, 2, -0.3F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.4F, 2.0694F, -3.8705F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.4625F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 47, 61, -1.52F, -0.8963F, -0.124F, 1, 1, 1, -0.108F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 47, 61, -0.28F, -0.8963F, -0.124F, 1, 1, 1, -0.108F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.4F, 1.6694F, -3.1705F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.9338F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 28, 44, -1.52F, -0.8507F, -0.1289F, 1, 1, 1, -0.1F, true));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 28, 44, -0.28F, -0.8507F, -0.1289F, 1, 1, 1, -0.1F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.6F, 0.15F, -3.4802F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.5323F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 19, 6, -0.52F, -0.1733F, -3.9385F, 1, 1, 4, -0.103F, true));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 19, 6, 0.72F, -0.1733F, -3.9385F, 1, 1, 4, -0.103F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.4F, 2.6694F, -6.5705F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.2531F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 42, 61, -1.52F, -0.8012F, -0.9598F, 1, 1, 1, -0.1F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 43, 29, -1.52F, -0.8012F, -0.1598F, 1, 1, 3, -0.1F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 42, 61, -0.28F, -0.8012F, -0.9598F, 1, 1, 1, -0.1F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 43, 29, -0.28F, -0.8012F, -0.1598F, 1, 1, 3, -0.1F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5F, -0.8031F, -2.7006F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.5934F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 52, 61, 0.51F, 0.0095F, 0.5286F, 1, 1, 1, -0.003F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 61, 56, 0.51F, 0.0095F, 0.0286F, 1, 1, 1, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, -0.0031F, -3.2006F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.925F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 61, 9, 0.51F, -0.0726F, -0.0316F, 1, 1, 1, 0.002F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, -0.7F, 0.3F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.6632F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 57, -1.5F, -1.8557F, -3.961F, 1, 2, 1, -0.004F, false));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 26, 18, -0.5F, -1.8557F, -3.961F, 1, 2, 1, 0.0F, false));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 40, 44, -1.5F, -1.6454F, -2.175F, 2, 2, 2, 0.005F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, -1.6611F, -1.8584F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 2.2689F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 46, 22, -0.5F, -1.9975F, -1.9893F, 2, 2, 2, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.0F, -1.8611F, -0.8584F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 1.7802F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 43, 39, 0.0F, -1.0172F, -0.9771F, 2, 1, 1, -0.007F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(-1.0F, -1.8611F, -0.8584F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 1.2566F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 55, 14, 0.0F, -0.0172F, -0.9771F, 2, 1, 1, -0.004F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-1.0F, -1.5611F, 0.0416F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.3491F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 55, 27, 0.0F, 0.0341F, -0.9699F, 2, 1, 1, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.9F, -1.4F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1047F, 0.0F, 0.0F);


        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 2.6F, -10.7F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.2618F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 47, 41, -0.5F, -0.835F, -0.197F, 1, 1, 3, -0.2F, true));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 2.323F, -10.9798F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.192F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 60, 45, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.199F, true));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 2.3675F, -12.007F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.1571F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 9, 0, -0.5F, -0.6F, -0.9F, 1, 1, 2, -0.2F, true));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 2.0878F, -12.9204F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.4189F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 56, 43, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, true));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.2F, 1.6766F, -13.1141F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.2269F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 58, 17, -0.5F, -0.2429F, -0.2187F, 1, 1, 1, -0.203F, true));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 58, 17, -0.1F, -0.2429F, -0.2187F, 1, 1, 1, -0.2F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.2F, 1.8766F, -13.5141F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.1047F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 18, 58, -0.5F, -0.4F, -0.4F, 1, 1, 1, -0.208F, true));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 18, 58, -0.1F, -0.4F, -0.4F, 1, 1, 1, -0.205F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.4F, 2.6F, -12.1F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.0698F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 10, 58, -0.9F, -1.023F, -0.8612F, 1, 1, 1, -0.205F, true));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 10, 58, -0.9F, -1.023F, -0.8612F, 1, 1, 1, -0.205F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.2F, 2.1215F, -12.3198F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.1745F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 60, 41, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.206F, true));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 60, 41, -0.1F, -0.5F, -0.5F, 1, 1, 1, -0.203F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0F, 1.6F, -11.6F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.3142F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 60, 41, -0.7F, -0.2265F, -1.0457F, 1, 1, 1, -0.203F, true));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 61, -0.7F, -0.2265F, -0.5457F, 1, 1, 1, -0.199F, true));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 60, 41, -0.3F, -0.2265F, -1.0457F, 1, 1, 1, -0.2F, false));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 61, -0.3F, -0.2265F, -0.5457F, 1, 1, 1, -0.205F, false));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, 1.9F, -7.8F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.1222F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 19, 24, -0.7F, -0.8172F, -3.752F, 1, 1, 4, -0.2F, true));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 25, -0.7F, -1.0172F, -3.752F, 1, 1, 4, -0.205F, true));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 19, 24, -0.3F, -0.8172F, -3.752F, 1, 1, 4, -0.204F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 25, -0.3F, -1.0172F, -3.752F, 1, 1, 4, -0.2F, false));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.643F, 1.2413F, -13.7229F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.6178F, 0.0496F, -0.4161F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 58, 38, -0.2259F, -0.1433F, -0.6592F, 1, 1, 1, -0.2F, true));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 23, 58, -0.2259F, -0.4433F, -0.6592F, 1, 1, 1, -0.202F, true));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.6269F, 1.7403F, -13.4192F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.1259F, 0.0902F, -0.7108F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 57, 58, -0.0717F, -0.6542F, -0.3275F, 1, 1, 1, -0.2F, true));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 52, 58, -0.0717F, -0.9542F, -0.3275F, 1, 1, 1, -0.202F, true));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.5281F, 1.7212F, -12.0557F);
        this.jaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.2462F, 0.0711F, -0.5008F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 59, 53, -0.1536F, -0.7059F, -0.606F, 1, 1, 1, -0.2F, true));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 59, 49, -0.1536F, -0.9059F, -0.606F, 1, 1, 1, -0.202F, true));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(-0.7F, 1.5F, -11.2F);
        this.jaw.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.108F, 0.0572F, -0.4856F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 60, 4, -0.0418F, -0.7159F, -0.7261F, 1, 1, 1, -0.202F, true));
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 14, 60, -0.0418F, -0.5159F, -0.7261F, 1, 1, 1, -0.2F, true));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(-0.7F, 1.4F, -10.1F);
        this.jaw.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.109F, 0.0554F, -0.4682F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 60, 20, -0.026F, -0.7508F, -0.4301F, 1, 1, 1, -0.2F, true));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(-0.7F, 1.3F, -9.2F);
        this.jaw.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.1117F, 0.0496F, -0.4161F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 27, 60, -0.0173F, -0.7697F, -0.2355F, 1, 1, 1, -0.2F, true));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.4F, 0.9989F, -6.4711F);
        this.jaw.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0873F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 16, 41, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.12F, true));
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 16, 41, 0.3F, -0.5F, -1.5F, 1, 1, 3, -0.12F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(0.0F, 0.8F, -5.1F);
        this.jaw.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.1396F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 42, 17, -0.9F, -0.1939F, -2.8854F, 1, 1, 3, -0.1F, true));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 42, 17, -0.1F, -0.1939F, -2.8854F, 1, 1, 3, -0.1F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.0F, 0.2F, -2.6F);
        this.jaw.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.2094F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 43, 12, -0.9F, -0.1283F, -2.7942F, 1, 1, 3, -0.104F, true));
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 43, 12, -0.1F, -0.1283F, -2.7942F, 1, 1, 3, -0.104F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0873F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 53, 50, -1.1F, -0.2F, -1.7F, 1, 1, 2, -0.105F, true));
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 57, 34, -1.1F, -0.2F, -2.7F, 1, 1, 2, -0.1F, true));
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 53, 50, 0.1F, -0.2F, -1.7F, 1, 1, 2, -0.105F, false));
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 57, 34, 0.1F, -0.2F, -2.7F, 1, 1, 2, -0.1F, false));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(0.643F, 1.2413F, -13.7229F);
        this.jaw.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.6178F, -0.0496F, 0.4161F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 58, 38, -0.7741F, -0.1433F, -0.6592F, 1, 1, 1, -0.2F, false));
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 23, 58, -0.7741F, -0.4433F, -0.6592F, 1, 1, 1, -0.202F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.6269F, 1.7403F, -13.4192F);
        this.jaw.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.1259F, -0.0902F, 0.7108F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 57, 58, -0.9283F, -0.6542F, -0.3275F, 1, 1, 1, -0.2F, false));
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 52, 58, -0.9283F, -0.9542F, -0.3275F, 1, 1, 1, -0.202F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(0.5281F, 1.7212F, -12.0557F);
        this.jaw.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.2462F, -0.0711F, 0.5008F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 59, 53, -0.8464F, -0.7059F, -0.606F, 1, 1, 1, -0.2F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 59, 49, -0.8464F, -0.9059F, -0.606F, 1, 1, 1, -0.202F, false));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(0.7F, 1.5F, -11.2F);
        this.jaw.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.108F, -0.0572F, 0.4856F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 60, 4, -0.9582F, -0.7159F, -0.7261F, 1, 1, 1, -0.202F, false));
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 14, 60, -0.9582F, -0.5159F, -0.7261F, 1, 1, 1, -0.2F, false));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(0.7F, 1.4F, -10.1F);
        this.jaw.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.109F, -0.0554F, 0.4682F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 60, 20, -0.974F, -0.7508F, -0.4301F, 1, 1, 1, -0.2F, false));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(0.7F, 1.3F, -9.2F);
        this.jaw.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.1117F, -0.0496F, 0.4161F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 27, 60, -0.9827F, -0.7697F, -0.2355F, 1, 1, 1, -0.2F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4F, 1.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1222F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 5, 45, -0.5F, -0.1F, -0.1F, 1, 1, 3, 0.0F, false));

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
