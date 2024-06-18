package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDiplodocusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer hip;
    private final ModelRenderer frame12_r1;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer leftLeg6;
    private final ModelRenderer leftLeg7;
    private final ModelRenderer leftLeg8;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer rightLeg6;
    private final ModelRenderer rightLeg7;
    private final ModelRenderer rightLeg8;
    private final ModelRenderer tail1;
    private final ModelRenderer frame13_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame14_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer frame15_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer frame16_r1;
    private final ModelRenderer tail5;
    private final ModelRenderer frame17_r1;
    private final ModelRenderer tail6;
    private final ModelRenderer frame18_r1;
    private final ModelRenderer tail7;
    private final ModelRenderer frame19_r1;
    private final ModelRenderer tail8;
    private final ModelRenderer frame20_r1;
    private final ModelRenderer tail9;
    private final ModelRenderer frame21_r1;
    private final ModelRenderer tail10;
    private final ModelRenderer frame23_r1;
    private final ModelRenderer tail11;
    private final ModelRenderer tail12;
    private final ModelRenderer body;
    private final ModelRenderer frame11_r1;
    private final ModelRenderer chest;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm4;
    private final ModelRenderer leftArm5;
    private final ModelRenderer leftArm6;
    private final ModelRenderer rightArm4;
    private final ModelRenderer rightArm5;
    private final ModelRenderer rightArm6;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer neck1;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer neck4;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer neck5;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer neck6;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer frame0_r1;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer throat;

    public ModelSkeletonDiplodocusFrame() {
        this.textureWidth = 208;
        this.textureHeight = 208;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -48.9F, 19.5F, 1, 49, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -55.9F, -22.5F, 1, 56, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, -12, 1, -14.0F, -40.0F, -22.52F, 28, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -46.75F, 19.5F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, -0.0019F, 0.0436F, -0.0437F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -11, 1, -13.0F, -1.0F, 0.0F, 26, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -51.05F, 1.0F);
        this.fossil.addChild(root);


        this.hip = new ModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 0.0F, 20.0F);
        this.root.addChild(hip);


        this.frame12_r1 = new ModelRenderer(this);
        this.frame12_r1.setRotationPoint(-2.0F, -3.6F, -17.8F);
        this.hip.addChild(frame12_r1);
        this.setRotateAngle(frame12_r1, -0.3054F, 0.0F, 0.0F);
        this.frame12_r1.cubeList.add(new ModelBox(frame12_r1, 2, 79, 1.51F, -0.0428F, -0.3692F, 1, 1, 28, -0.1F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(13.5F, 1.75F, 3.25F);
        this.hip.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 1.5272F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 27.0F, -5.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1309F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 19.0F, 4.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.0873F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 4.0F, -6.5F);
        this.leftLeg3.addChild(leftLeg4);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(2.5F, -6.05F, -4.05F);
        this.leftLeg.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.1745F, 0.0F, 0.0F);


        this.leftLeg6 = new ModelRenderer(this);
        this.leftLeg6.setRotationPoint(-3.0F, 1.7348F, -23.6514F);
        this.leftLeg5.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.1745F, 0.0F, 0.0F);


        this.leftLeg7 = new ModelRenderer(this);
        this.leftLeg7.setRotationPoint(0.0F, 3.3054F, -16.4392F);
        this.leftLeg6.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, -0.3054F, 0.0F, 0.0F);


        this.leftLeg8 = new ModelRenderer(this);
        this.leftLeg8.setRotationPoint(0.0F, -8.3537F, -8.8561F);
        this.leftLeg7.addChild(leftLeg8);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(-29.5F, -6.05F, -4.05F);
        this.leftLeg.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, -0.2182F, 0.0F, 0.0F);


        this.rightLeg6 = new ModelRenderer(this);
        this.rightLeg6.setRotationPoint(3.0F, 1.7348F, -23.6514F);
        this.rightLeg5.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.5236F, 0.0F, 0.0F);


        this.rightLeg7 = new ModelRenderer(this);
        this.rightLeg7.setRotationPoint(0.0F, 3.3054F, -16.4392F);
        this.rightLeg6.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, -0.2194F, 0.0006F, 0.0103F);


        this.rightLeg8 = new ModelRenderer(this);
        this.rightLeg8.setRotationPoint(0.0F, -8.3537F, -8.8561F);
        this.rightLeg7.addChild(rightLeg8);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 2.4F, 8.6F);
        this.hip.addChild(tail1);
        this.setRotateAngle(tail1, -0.3846F, -0.1541F, -0.0311F);


        this.frame13_r1 = new ModelRenderer(this);
        this.frame13_r1.setRotationPoint(-3.0F, 2.0103F, 0.0003F);
        this.tail1.addChild(frame13_r1);
        this.setRotateAngle(frame13_r1, 0.1745F, 0.0F, 0.0F);
        this.frame13_r1.cubeList.add(new ModelBox(frame13_r1, 43, 44, 2.5F, 0.1F, -0.8F, 1, 1, 34, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -6.0897F, 31.7003F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0876F, -0.0869F, -0.0076F);


        this.frame14_r1 = new ModelRenderer(this);
        this.frame14_r1.setRotationPoint(-2.5F, 2.5651F, 0.6421F);
        this.tail2.addChild(frame14_r1);
        this.setRotateAngle(frame14_r1, 0.1047F, 0.0F, 0.0F);
        this.frame14_r1.cubeList.add(new ModelBox(frame14_r1, 3, 0, 2.0F, 0.0F, -0.5F, 1, 1, 36, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -3.6349F, 35.3421F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0876F, -0.0869F, -0.0076F);


        this.frame15_r1 = new ModelRenderer(this);
        this.frame15_r1.setRotationPoint(-2.0F, 2.499F, 0.0489F);
        this.tail3.addChild(frame15_r1);
        this.setRotateAngle(frame15_r1, 0.0785F, 0.0F, 0.0F);
        this.frame15_r1.cubeList.add(new ModelBox(frame15_r1, 46, -1, 1.5F, 0.0F, 0.1F, 1, 1, 33, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -2.201F, 32.2489F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0876F, 0.0869F, 0.0076F);


        this.frame16_r1 = new ModelRenderer(this);
        this.frame16_r1.setRotationPoint(-1.5F, 2.3895F, -0.169F);
        this.tail4.addChild(frame16_r1);
        this.setRotateAngle(frame16_r1, 0.0611F, 0.0F, 0.0F);
        this.frame16_r1.cubeList.add(new ModelBox(frame16_r1, 0, 41, 1.0F, -0.2F, 0.0F, 1, 1, 35, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -1.2105F, 34.331F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);


        this.frame17_r1 = new ModelRenderer(this);
        this.frame17_r1.setRotationPoint(-2.0F, 4.2667F, 2.8181F);
        this.tail5.addChild(frame17_r1);
        this.setRotateAngle(frame17_r1, 0.0087F, 0.0F, 0.0F);
        this.frame17_r1.cubeList.add(new ModelBox(frame17_r1, 115, 116, 1.52F, -3.0F, -3.0F, 1, 1, 19, -0.1F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.1667F, 17.8181F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0436F, 0.0F, 0.0F);


        this.frame18_r1 = new ModelRenderer(this);
        this.frame18_r1.setRotationPoint(-2.0F, 0.999F, -0.0436F);
        this.tail6.addChild(frame18_r1);
        this.setRotateAngle(frame18_r1, -0.0349F, 0.0F, 0.0F);
        this.frame18_r1.cubeList.add(new ModelBox(frame18_r1, 0, 126, 1.5F, 0.0F, 0.0F, 1, 1, 16, -0.1F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.001F, 15.9564F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, 0.0438F, 0.0872F, 0.0038F);


        this.frame19_r1 = new ModelRenderer(this);
        this.frame19_r1.setRotationPoint(0.0F, 1.9995F, -0.1671F);
        this.tail7.addChild(frame19_r1);
        this.setRotateAngle(frame19_r1, 0.0297F, 0.0F, 0.0F);
        this.frame19_r1.cubeList.add(new ModelBox(frame19_r1, 118, 45, -0.5F, -0.5F, -0.5F, 1, 1, 17, -0.1F, false));

        this.tail8 = new ModelRenderer(this);
        this.tail8.setRotationPoint(-1.0F, -0.0005F, 16.0829F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, 0.0F, 0.0873F, 0.0F);


        this.frame20_r1 = new ModelRenderer(this);
        this.frame20_r1.setRotationPoint(0.0F, 1.1F, -0.1F);
        this.tail8.addChild(frame20_r1);
        this.setRotateAngle(frame20_r1, 0.0087F, 0.0F, 0.0F);
        this.frame20_r1.cubeList.add(new ModelBox(frame20_r1, 0, 18, 0.5F, -0.1F, 0.1F, 1, 1, 16, -0.1F, false));

        this.tail9 = new ModelRenderer(this);
        this.tail9.setRotationPoint(1.0F, 0.35F, 16.0F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, -0.044F, 0.1308F, -0.0057F);


        this.frame21_r1 = new ModelRenderer(this);
        this.frame21_r1.setRotationPoint(-0.5F, 0.4928F, -0.1598F);
        this.tail9.addChild(frame21_r1);
        this.setRotateAngle(frame21_r1, -0.0175F, 0.0F, 0.0F);
        this.frame21_r1.cubeList.add(new ModelBox(frame21_r1, 0, 41, 0.0F, 0.0F, 0.1F, 1, 1, 15, -0.1F, false));

        this.tail10 = new ModelRenderer(this);
        this.tail10.setRotationPoint(0.0F, 0.2928F, 14.9402F);
        this.tail9.addChild(tail10);
        this.setRotateAngle(tail10, -0.1752F, 0.0859F, -0.0152F);
        this.tail10.cubeList.add(new ModelBox(tail10, 157, 141, -0.5F, 0.4693F, -0.2064F, 1, 1, 10, -0.1F, false));

        this.frame23_r1 = new ModelRenderer(this);
        this.frame23_r1.setRotationPoint(0.0F, 0.4693F, 9.7936F);
        this.tail10.addChild(frame23_r1);
        this.setRotateAngle(frame23_r1, -0.2094F, 0.0F, 0.0F);
        this.frame23_r1.cubeList.add(new ModelBox(frame23_r1, 181, 144, -0.5F, 0.0F, 0.0F, 1, 1, 6, -0.1F, false));

        this.tail11 = new ModelRenderer(this);
        this.tail11.setRotationPoint(0.0F, 1.2693F, 15.7936F);
        this.tail10.addChild(tail11);
        this.setRotateAngle(tail11, -0.4835F, 0.116F, -0.0607F);
        this.tail11.cubeList.add(new ModelBox(tail11, 74, 109, -0.5F, 0.5623F, -0.3625F, 1, 1, 14, -0.1F, false));

        this.tail12 = new ModelRenderer(this);
        this.tail12.setRotationPoint(0.0F, 0.0623F, 13.6375F);
        this.tail11.addChild(tail12);
        this.setRotateAngle(tail12, -0.3193F, 0.2909F, -0.0945F);
        this.tail12.cubeList.add(new ModelBox(tail12, 84, 62, -0.5F, 0.5F, -0.25F, 1, 1, 14, -0.1F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.0F, -17.0F);
        this.hip.addChild(body);


        this.frame11_r1 = new ModelRenderer(this);
        this.frame11_r1.setRotationPoint(-2.5F, 0.6F, -18.4F);
        this.body.addChild(frame11_r1);
        this.setRotateAngle(frame11_r1, -0.096F, 0.0F, 0.0F);
        this.frame11_r1.cubeList.add(new ModelBox(frame11_r1, 50, 109, 2.0F, -0.0146F, 0.0856F, 1, 1, 18, -0.1F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(-0.5F, -2.2F, -17.35F);
        this.body.addChild(chest);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(-1.5F, 2.4F, -15.25F);
        this.chest.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, -0.0087F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 40, 84, 1.51F, 0.25F, -0.1678F, 1, 1, 15, -0.1F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(12.0F, 24.25F, -9.75F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0873F, 0.0F, 0.0F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(2.3412F, -3.5576F, 0.5371F);
        this.leftArm.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.6545F, 0.0F, 0.0F);


        this.leftArm5 = new ModelRenderer(this);
        this.leftArm5.setRotationPoint(-0.4079F, 16.3588F, -1.2446F);
        this.leftArm4.addChild(leftArm5);
        this.setRotateAngle(leftArm5, -0.829F, 0.0F, 0.0F);


        this.leftArm6 = new ModelRenderer(this);
        this.leftArm6.setRotationPoint(-1.1063F, 15.6475F, -3.1181F);
        this.leftArm5.addChild(leftArm6);
        this.setRotateAngle(leftArm6, 0.3927F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(-25.3412F, -3.5576F, 0.5371F);
        this.leftArm.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.1309F, 0.0F, 0.0F);


        this.rightArm5 = new ModelRenderer(this);
        this.rightArm5.setRotationPoint(0.4079F, 16.3588F, -1.2446F);
        this.rightArm4.addChild(rightArm5);
        this.setRotateAngle(rightArm5, -0.5236F, 0.0F, 0.0F);


        this.rightArm6 = new ModelRenderer(this);
        this.rightArm6.setRotationPoint(1.1063F, 15.6475F, -3.1181F);
        this.rightArm5.addChild(rightArm6);
        this.setRotateAngle(rightArm6, 0.3054F, 0.0F, 0.0F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 13.0F, -1.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.1745F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 17.0F, 1.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0873F, 0.0F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.0F, -15.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2214F, 0.1704F, -0.0381F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(-1.5F, 1.5877F, -20.2355F);
        this.neck1.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, -0.0524F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 87, 36, 1.5F, 0.0F, 0.0F, 1, 1, 21, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.5123F, -19.3355F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3695F, 0.3272F, -0.1238F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.5F, 2.3541F, -18.8767F);
        this.neck2.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, -0.0349F, -0.014F, 0.0006F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 68, 84, -0.5F, 0.1F, -0.3F, 1, 1, 20, -0.1F, false));

        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.5F, -0.5106F, -27.1233F);
        this.neck2.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.3665F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 152, 58, -0.5F, -0.2158F, 0.2349F, 1, 1, 9, -0.1F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -3.4459F, -26.8767F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2494F, 0.2127F, 0.2463F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(-1.0F, 2.0214F, -9.9131F);
        this.neck3.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.0875F, 0.0695F, -0.0061F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 76, 147, 1.0F, -0.5193F, 0.1309F, 1, 1, 11, -0.1F, false));

        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(-0.5F, 0.0214F, -25.4131F);
        this.neck3.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.1047F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 124, 89, 0.5F, -0.2F, 0.0F, 1, 1, 16, -0.1F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.6786F, -25.3131F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.1302F, -0.0076F, 0.1744F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.5F, 1.1041F, -14.9626F);
        this.neck4.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.0349F, 0.0174F, -0.0006F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 0, 0, -0.5F, -0.1F, 0.0F, 1, 1, 15, -0.1F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.4959F, -14.9626F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.4363F, 0.0F, 0.0F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(-0.5F, -0.4855F, -9.6197F);
        this.neck5.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.2094F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 93, 151, 0.5F, 0.0763F, 0.1073F, 1, 1, 10, -0.1F, false));

        this.neck6 = new ModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -1.7855F, -9.0197F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.829F, 0.0F, 0.0F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.5F, -1.5471F, -5.8028F);
        this.neck6.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.4974F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 92, 114, 0.51F, -0.1509F, -0.0049F, 1, 1, 5, -0.1F, false));

        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(-0.5F, -3.7971F, -7.0528F);
        this.neck6.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.1745F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 120, 171, 0.5F, 1.9639F, 0.4988F, 1, 1, 2, -0.1F, false));

        this.frame0_r1 = new ModelRenderer(this);
        this.frame0_r1.setRotationPoint(-0.5F, -3.9971F, -7.8528F);
        this.neck6.addChild(frame0_r1);
        this.setRotateAngle(frame0_r1, -0.1745F, 0.0F, 0.0F);
        this.frame0_r1.cubeList.add(new ModelBox(frame0_r1, 121, 172, 0.51F, 2.0052F, 0.4988F, 1, 1, 1, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -3.0471F, -6.6028F);
        this.neck6.addChild(head);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.6299F, -1.6684F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2618F, 0.0F, 0.0F);


        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.5F, 3.2259F, -4.0487F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0873F, 0.0F, 0.0F);

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
