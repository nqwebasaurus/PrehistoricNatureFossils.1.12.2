package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGigantspinosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer plate3;
    private final ModelRenderer plate12;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer tail1;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer plate4;
    private final ModelRenderer plate9;
    private final ModelRenderer tail2;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer plate5;
    private final ModelRenderer plate8;
    private final ModelRenderer tail3;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer frame11_r1;
    private final ModelRenderer tail5;
    private final ModelRenderer frame12_r1;
    private final ModelRenderer tailspike;
    private final ModelRenderer tailspike2;
    private final ModelRenderer tailspike7;
    private final ModelRenderer tailspike8;
    private final ModelRenderer tailspike3;
    private final ModelRenderer tailspike4;
    private final ModelRenderer tailspike5;
    private final ModelRenderer tailspike6;
    private final ModelRenderer body;
    private final ModelRenderer plate10;
    private final ModelRenderer plate16;
    private final ModelRenderer plate11;
    private final ModelRenderer plate15;
    private final ModelRenderer plate;
    private final ModelRenderer plate14;
    private final ModelRenderer plate2;
    private final ModelRenderer plate13;
    private final ModelRenderer chest;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer neck1;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer Leftlegspike;
    private final ModelRenderer spike;
    private final ModelRenderer spike2;
    private final ModelRenderer spike3;
    private final ModelRenderer Rightlegspike;
    private final ModelRenderer spike4;
    private final ModelRenderer spike5;
    private final ModelRenderer spike6;
    private final ModelRenderer plate7;
    private final ModelRenderer plate18;
    private final ModelRenderer plate6;
    private final ModelRenderer plate17;

    public ModelSkeletonGigantspinosaurusFrame() {
        this.textureWidth = 85;
        this.textureHeight = 85;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -22.8F, 4.75F, 1, 23, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 0.6F, -18.8F, -14.75F, 1, 19, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(1.1F, -11.5F, -14.75F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, -0.2182F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -2, 1, -4.0F, -1.0F, 0.0F, 8, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(-0.1F, -20.0F, 4.75F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, -0.0077F, 0.218F, -0.0358F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -1, 1, -3.0F, -1.0F, 0.0F, 6, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -21.7F, 5.8F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, 0.0F, 0.1745F, 0.0F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.1F, -0.55F, -4.15F);
        this.hips.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.0611F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 15, 30, -0.5F, -0.7504F, 0.1519F, 1, 1, 8, -0.1F, false));

        this.plate3 = new ModelRenderer(this);
        this.plate3.setRotationPoint(3.0F, -4.3616F, 0.9352F);
        this.hips.addChild(plate3);
        this.setRotateAngle(plate3, -0.1309F, 0.0F, 0.0F);


        this.plate12 = new ModelRenderer(this);
        this.plate12.setRotationPoint(-3.0F, -4.3616F, 0.9352F);
        this.hips.addChild(plate12);
        this.setRotateAngle(plate12, -0.1309F, 0.0F, 0.0F);


        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(3.15F, 0.5F, -0.25F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.48F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(2.0F, 10.7902F, -1.0118F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.3927F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 9.9161F, 1.648F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0873F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.15F, 0.5F, -0.25F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.0873F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-2.0F, 10.7902F, -1.0118F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.48F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 9.9161F, 1.648F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.2618F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(-0.5F, -1.95F, 3.25F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0886F, 0.1739F, -0.0154F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.5F, 2.223F, 0.1807F);
        this.tail1.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, -0.1309F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 5, 58, -0.5F, -1.1F, 0.0F, 1, 1, 4, -0.1F, false));

        this.plate4 = new ModelRenderer(this);
        this.plate4.setRotationPoint(2.5F, -1.7855F, 2.4154F);
        this.tail1.addChild(plate4);
        this.setRotateAngle(plate4, 0.0873F, 0.0F, 0.0F);


        this.plate9 = new ModelRenderer(this);
        this.plate9.setRotationPoint(-1.5F, -1.7855F, 2.4154F);
        this.tail1.addChild(plate9);
        this.setRotateAngle(plate9, 0.0873F, 0.0F, 0.0F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.423F, 4.0807F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0435F, -0.0038F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.5F, 2.2106F, -0.0524F);
        this.tail2.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, -0.0873F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 38, 35, -0.5F, -1.0F, 0.0F, 1, 1, 7, -0.1F, false));

        this.plate5 = new ModelRenderer(this);
        this.plate5.setRotationPoint(1.8F, -0.9228F, 1.7074F);
        this.tail2.addChild(plate5);
        this.setRotateAngle(plate5, 0.0436F, 0.0F, 0.0F);


        this.plate8 = new ModelRenderer(this);
        this.plate8.setRotationPoint(-0.8F, -0.9228F, 1.7074F);
        this.tail2.addChild(plate8);
        this.setRotateAngle(plate8, 0.0436F, 0.0F, 0.0F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.6606F, 6.9476F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0452F, -0.2615F, 0.0117F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.5F, 1.702F, 3.8084F);
        this.tail3.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, 0.0F, 0.0175F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, -1, 34, -0.5F, -0.5F, -4.5F, 1, 1, 8, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(-0.2F, -0.198F, 7.2084F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0492F, -0.4795F, -0.0227F);


        this.frame11_r1 = new ModelRenderer(this);
        this.frame11_r1.setRotationPoint(0.5F, 1.8513F, -0.9389F);
        this.tail4.addChild(frame11_r1);
        this.setRotateAngle(frame11_r1, 0.0436F, 0.0F, 0.0F);
        this.frame11_r1.cubeList.add(new ModelBox(frame11_r1, 30, 10, -0.5F, -0.5F, 0.0F, 1, 1, 9, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.2013F, 8.0611F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1962F, -0.4721F, 0.0902F);


        this.frame12_r1 = new ModelRenderer(this);
        this.frame12_r1.setRotationPoint(0.5F, 1.2904F, -0.4258F);
        this.tail5.addChild(frame12_r1);
        this.setRotateAngle(frame12_r1, 0.0436F, 0.0F, 0.0F);
        this.frame12_r1.cubeList.add(new ModelBox(frame12_r1, 31, 22, -0.5F, -0.5F, 0.0F, 1, 1, 8, -0.1F, false));

        this.tailspike = new ModelRenderer(this);
        this.tailspike.setRotationPoint(0.8F, -0.1596F, 1.0242F);
        this.tail5.addChild(tailspike);
        this.setRotateAngle(tailspike, -0.517F, 0.0869F, 0.8933F);


        this.tailspike2 = new ModelRenderer(this);
        this.tailspike2.setRotationPoint(-0.5F, 14.25F, -14.5F);
        this.tailspike.addChild(tailspike2);


        this.tailspike7 = new ModelRenderer(this);
        this.tailspike7.setRotationPoint(0.2F, -0.1596F, 1.0242F);
        this.tail5.addChild(tailspike7);
        this.setRotateAngle(tailspike7, -0.517F, -0.0869F, -0.8933F);


        this.tailspike8 = new ModelRenderer(this);
        this.tailspike8.setRotationPoint(0.5F, 14.25F, -14.5F);
        this.tailspike7.addChild(tailspike8);


        this.tailspike3 = new ModelRenderer(this);
        this.tailspike3.setRotationPoint(0.575F, -0.1596F, 5.5992F);
        this.tail5.addChild(tailspike3);
        this.setRotateAngle(tailspike3, -0.7459F, 0.274F, 1.0267F);


        this.tailspike4 = new ModelRenderer(this);
        this.tailspike4.setRotationPoint(-0.5F, 14.25F, -14.5F);
        this.tailspike3.addChild(tailspike4);


        this.tailspike5 = new ModelRenderer(this);
        this.tailspike5.setRotationPoint(0.425F, -0.1596F, 5.5992F);
        this.tail5.addChild(tailspike5);
        this.setRotateAngle(tailspike5, -0.7459F, -0.274F, -1.0267F);


        this.tailspike6 = new ModelRenderer(this);
        this.tailspike6.setRotationPoint(0.5F, 14.25F, -14.5F);
        this.tailspike5.addChild(tailspike6);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.7F, -3.55F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.134F, -0.2163F, -0.0289F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, 1.4174F, -12.7644F, 1, 1, 13, -0.1F, false));

        this.plate10 = new ModelRenderer(this);
        this.plate10.setRotationPoint(3.0F, -2.7576F, -11.3144F);
        this.body.addChild(plate10);


        this.plate16 = new ModelRenderer(this);
        this.plate16.setRotationPoint(-3.0F, -2.7576F, -11.3144F);
        this.body.addChild(plate16);


        this.plate11 = new ModelRenderer(this);
        this.plate11.setRotationPoint(-0.5F, -3.4826F, -9.5144F);
        this.body.addChild(plate11);


        this.plate15 = new ModelRenderer(this);
        this.plate15.setRotationPoint(0.5F, -3.4826F, -9.5144F);
        this.body.addChild(plate15);


        this.plate = new ModelRenderer(this);
        this.plate.setRotationPoint(3.0F, -3.9402F, -4.46F);
        this.body.addChild(plate);


        this.plate14 = new ModelRenderer(this);
        this.plate14.setRotationPoint(-3.0F, -3.9402F, -4.46F);
        this.body.addChild(plate14);


        this.plate2 = new ModelRenderer(this);
        this.plate2.setRotationPoint(3.0F, -2.9152F, -0.66F);
        this.body.addChild(plate2);


        this.plate13 = new ModelRenderer(this);
        this.plate13.setRotationPoint(-3.0F, -2.9152F, -0.66F);
        this.body.addChild(plate13);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.4134F, -12.3096F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.1329F, -0.173F, 0.023F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 5.824F, -6.1419F);
        this.chest.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.6109F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 57, 45, -0.5F, -0.846F, -0.076F, 1, 1, 4, -0.1F, false));

        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.01F, 2.5852F, -1.9105F);
        this.chest.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.5149F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 49, 49, -0.5F, -0.5F, -2.5F, 1, 1, 5, -0.1F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(-0.5F, 3.9192F, -6.9539F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.0928F, -0.3477F, -0.0317F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 2.3243F, -4.4321F);
        this.neck1.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.1222F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 52, 2, 0.0F, -0.55F, 0.05F, 1, 1, 5, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4243F, -4.1821F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1962F, -0.4721F, 0.0902F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.5F, 1.7737F, 0.3002F);
        this.neck2.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.1309F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 63, 33, -0.5F, -0.5F, -4.0F, 1, 1, 4, -0.1F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.1763F, -3.6998F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.264F, -0.1264F, 0.0341F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.5F, 1.34F, 0.6712F);
        this.neck3.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.0873F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 56, 60, -0.5F, -0.5F, -4.0F, 1, 1, 4, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(1.0F, -0.0781F, -3.6762F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.4363F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.9608F, 0.7242F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1727F, 0.0F, 0.0F);


        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.25F, 10.6602F, -4.7633F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.9747F, 0.1975F, -0.2898F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.7004F, 6.0172F, 0.5511F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.3776F, 0.1472F, 0.3789F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.1598F, 6.1079F, 1.3266F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.8727F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.25F, 10.6602F, -4.7633F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.8438F, -0.1975F, 0.2898F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.7004F, 6.0172F, 0.5511F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.8857F, -0.0199F, -0.3986F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.1598F, 6.1079F, 1.3266F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0873F, 0.0F, 0.0F);


        this.Leftlegspike = new ModelRenderer(this);
        this.Leftlegspike.setRotationPoint(4.75F, 0.7602F, -3.0633F);
        this.chest.addChild(Leftlegspike);
        this.setRotateAngle(Leftlegspike, 0.3523F, 0.0439F, -0.6803F);


        this.spike = new ModelRenderer(this);
        this.spike.setRotationPoint(2.75F, 1.0F, -0.5F);
        this.Leftlegspike.addChild(spike);
        this.setRotateAngle(spike, 0.0F, -0.3927F, 0.0F);


        this.spike2 = new ModelRenderer(this);
        this.spike2.setRotationPoint(5.975F, 0.5F, 0.3F);
        this.spike.addChild(spike2);
        this.setRotateAngle(spike2, 0.0F, -0.3927F, 0.0F);


        this.spike3 = new ModelRenderer(this);
        this.spike3.setRotationPoint(6.0F, 0.0F, -0.6F);
        this.spike2.addChild(spike3);
        this.setRotateAngle(spike3, 0.0F, -0.2182F, 0.0F);


        this.Rightlegspike = new ModelRenderer(this);
        this.Rightlegspike.setRotationPoint(-4.75F, 0.7602F, -3.0633F);
        this.chest.addChild(Rightlegspike);
        this.setRotateAngle(Rightlegspike, 0.3523F, -0.0439F, 0.6803F);


        this.spike4 = new ModelRenderer(this);
        this.spike4.setRotationPoint(-2.75F, 1.0F, -0.5F);
        this.Rightlegspike.addChild(spike4);
        this.setRotateAngle(spike4, 0.0F, 0.3927F, 0.0F);


        this.spike5 = new ModelRenderer(this);
        this.spike5.setRotationPoint(-5.975F, 0.5F, 0.3F);
        this.spike4.addChild(spike5);
        this.setRotateAngle(spike5, 0.0F, 0.3927F, 0.0F);


        this.spike6 = new ModelRenderer(this);
        this.spike6.setRotationPoint(-6.0F, 0.0F, -0.6F);
        this.spike5.addChild(spike6);
        this.setRotateAngle(spike6, 0.0F, 0.2182F, 0.0F);


        this.plate7 = new ModelRenderer(this);
        this.plate7.setRotationPoint(1.75F, -0.8375F, -6.3242F);
        this.chest.addChild(plate7);
        this.setRotateAngle(plate7, -0.2182F, 0.0F, 0.0F);


        this.plate18 = new ModelRenderer(this);
        this.plate18.setRotationPoint(-1.75F, -0.8375F, -6.3242F);
        this.chest.addChild(plate18);
        this.setRotateAngle(plate18, -0.2182F, 0.0F, 0.0F);


        this.plate6 = new ModelRenderer(this);
        this.plate6.setRotationPoint(0.0F, -3.2154F, -2.3327F);
        this.chest.addChild(plate6);
        this.setRotateAngle(plate6, -0.1745F, 0.0F, 0.0F);


        this.plate17 = new ModelRenderer(this);
        this.plate17.setRotationPoint(0.0F, -3.2154F, -2.3327F);
        this.chest.addChild(plate17);
        this.setRotateAngle(plate17, -0.1745F, 0.0F, 0.0F);

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
