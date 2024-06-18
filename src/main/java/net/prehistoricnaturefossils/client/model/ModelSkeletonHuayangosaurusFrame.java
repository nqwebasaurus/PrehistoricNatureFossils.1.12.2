package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHuayangosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer HipPlates;
    private final ModelRenderer LeftPlate11;
    private final ModelRenderer RightPlate11;
    private final ModelRenderer LeftPlate12;
    private final ModelRenderer RightPlate12;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftFoot;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightFoot;
    private final ModelRenderer tail;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer TailPlates;
    private final ModelRenderer leftPlate13;
    private final ModelRenderer rightPlate13;
    private final ModelRenderer tail2;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer Tail2Plates;
    private final ModelRenderer leftPlate14;
    private final ModelRenderer rightPlate14;
    private final ModelRenderer leftPlate15;
    private final ModelRenderer rightPlate15;
    private final ModelRenderer tail3;
    private final ModelRenderer Tail3Plates;
    private final ModelRenderer leftPlate16;
    private final ModelRenderer rightPlate16;
    private final ModelRenderer leftPlate17;
    private final ModelRenderer rightPlate17;
    private final ModelRenderer leftPlate18;
    private final ModelRenderer rightPlate18;
    private final ModelRenderer tail4;
    private final ModelRenderer frame11_r1;
    private final ModelRenderer Tail4Spikes;
    private final ModelRenderer leftTailSpike1;
    private final ModelRenderer rightTailSpike1;
    private final ModelRenderer tail5;
    private final ModelRenderer Tail5Spikes;
    private final ModelRenderer leftTailSpike2;
    private final ModelRenderer rightTailSpike2;
    private final ModelRenderer body;
    private final ModelRenderer BodyPlates;
    private final ModelRenderer leftPlate7;
    private final ModelRenderer rightPlate7;
    private final ModelRenderer leftPlate8;
    private final ModelRenderer rightPlate8;
    private final ModelRenderer leftPlate9;
    private final ModelRenderer rightPlate9;
    private final ModelRenderer leftPlate10;
    private final ModelRenderer rightPlate10;
    private final ModelRenderer chest;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer ChestPlates;
    private final ModelRenderer leftPlate5;
    private final ModelRenderer rightPlate5;
    private final ModelRenderer leftPlate6;
    private final ModelRenderer rightPlate6;
    private final ModelRenderer Leftlegspike;
    private final ModelRenderer Rightlegspike;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer neck;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer NeckPlates;
    private final ModelRenderer leftPlate3;
    private final ModelRenderer rightPlate3;
    private final ModelRenderer leftPlate4;
    private final ModelRenderer rightPlate4;
    private final ModelRenderer neck2;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Neck2Plates;
    private final ModelRenderer leftPlate2;
    private final ModelRenderer rightPlate2;
    private final ModelRenderer neck3;
    private final ModelRenderer Neck3Plates;
    private final ModelRenderer leftPlate1;
    private final ModelRenderer rightPlate1;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonHuayangosaurusFrame() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.49F, -19.9F, 4.04F, 1, 20, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -1.0F, -18.9F, -14.0F, 1, 19, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-0.5F, -14.25F, -13.5F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, 0.0F, 0.0436F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -4, 1, -6.0F, -0.5F, -0.51F, 12, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -17.75F, 4.55F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, -0.0175F, 0.0436F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -2, 1, -4.0F, -0.5F, -0.5F, 8, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -17.1F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -1.2F, -1.0F);
        this.root.addChild(hips);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, -1.45F, 3.5F);
        this.hips.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.2443F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 27, 9, -0.5F, -0.748F, -0.7887F, 1, 1, 8, -0.1F, false));

        this.HipPlates = new ModelRenderer(this);
        this.HipPlates.setRotationPoint(0.0F, 1.2F, 2.0F);
        this.hips.addChild(HipPlates);


        this.LeftPlate11 = new ModelRenderer(this);
        this.LeftPlate11.setRotationPoint(2.5F, -9.25F, 7.85F);
        this.HipPlates.addChild(LeftPlate11);
        this.setRotateAngle(LeftPlate11, -0.7298F, 0.1468F, 0.162F);


        this.RightPlate11 = new ModelRenderer(this);
        this.RightPlate11.setRotationPoint(-2.5F, -9.25F, 7.85F);
        this.HipPlates.addChild(RightPlate11);
        this.setRotateAngle(RightPlate11, -0.7298F, -0.1468F, -0.162F);


        this.LeftPlate12 = new ModelRenderer(this);
        this.LeftPlate12.setRotationPoint(2.25F, -7.0F, 10.3F);
        this.HipPlates.addChild(LeftPlate12);
        this.setRotateAngle(LeftPlate12, -0.5996F, 0.1245F, 0.1796F);


        this.RightPlate12 = new ModelRenderer(this);
        this.RightPlate12.setRotationPoint(-2.25F, -7.0F, 10.3F);
        this.HipPlates.addChild(RightPlate12);
        this.setRotateAngle(RightPlate12, -0.5996F, -0.1245F, -0.1796F);


        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.25F, 0.25F, 5.75F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.088F, -0.0114F, -0.1304F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.13F, 8.2623F, -2.0872F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1731F, -0.0227F, 0.1289F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(-0.6F, 8.6125F, 1.8933F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.2618F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.25F, -0.05F, 5.75F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.4356F, 0.0114F, 0.1304F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.13F, 8.2623F, -2.0872F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5658F, 0.0227F, -0.1289F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.6F, 8.6125F, 1.8933F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3491F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -1.85F, 10.1F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2657F, 0.1685F, -0.0456F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.5F, 1.7488F, 3.9982F);
        this.tail.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.0F, 0.0436F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 19, 29, -0.5F, -0.5F, -3.5F, 1, 1, 7, -0.1F, false));

        this.TailPlates = new ModelRenderer(this);
        this.TailPlates.setRotationPoint(0.0F, -2.5512F, 0.2482F);
        this.tail.addChild(TailPlates);


        this.leftPlate13 = new ModelRenderer(this);
        this.leftPlate13.setRotationPoint(2.5F, -1.3F, 4.45F);
        this.TailPlates.addChild(leftPlate13);
        this.setRotateAngle(leftPlate13, -0.2132F, 0.0469F, 0.2132F);


        this.rightPlate13 = new ModelRenderer(this);
        this.rightPlate13.setRotationPoint(-1.5F, -1.3F, 4.45F);
        this.TailPlates.addChild(rightPlate13);
        this.setRotateAngle(rightPlate13, -0.2132F, -0.0469F, -0.2132F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1488F, 6.2982F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.134F, 0.2163F, 0.0289F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.5F, 2.1102F, 0.4812F);
        this.tail2.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, -0.0436F, 0.0174F, -0.0008F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 0, 26, -0.5F, -1.0F, 0.0F, 1, 1, 8, -0.1F, false));

        this.Tail2Plates = new ModelRenderer(this);
        this.Tail2Plates.setRotationPoint(0.0F, -2.0898F, 0.9812F);
        this.tail2.addChild(Tail2Plates);


        this.leftPlate14 = new ModelRenderer(this);
        this.leftPlate14.setRotationPoint(2.0F, -1.8F, 1.5F);
        this.Tail2Plates.addChild(leftPlate14);
        this.setRotateAngle(leftPlate14, -0.3011F, 0.0522F, 0.1666F);


        this.rightPlate14 = new ModelRenderer(this);
        this.rightPlate14.setRotationPoint(-1.0F, -1.8F, 1.5F);
        this.Tail2Plates.addChild(rightPlate14);
        this.setRotateAngle(rightPlate14, -0.3011F, -0.0522F, -0.1666F);


        this.leftPlate15 = new ModelRenderer(this);
        this.leftPlate15.setRotationPoint(2.0F, -1.15F, 5.2F);
        this.Tail2Plates.addChild(leftPlate15);
        this.setRotateAngle(leftPlate15, -0.303F, 0.0393F, 0.1249F);


        this.rightPlate15 = new ModelRenderer(this);
        this.rightPlate15.setRotationPoint(-1.0F, -1.15F, 5.2F);
        this.Tail2Plates.addChild(rightPlate15);
        this.setRotateAngle(rightPlate15, -0.303F, -0.0393F, -0.1249F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1602F, 7.5812F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0447F, 0.218F, 0.0097F);
        this.tail3.cubeList.add(new ModelBox(tail3, 14, 4, 0.0F, 1.3194F, 0.4869F, 1, 1, 9, -0.1F, false));

        this.Tail3Plates = new ModelRenderer(this);
        this.Tail3Plates.setRotationPoint(0.0F, -1.9806F, 0.4869F);
        this.tail3.addChild(Tail3Plates);


        this.leftPlate16 = new ModelRenderer(this);
        this.leftPlate16.setRotationPoint(1.5F, -1.0F, 0.85F);
        this.Tail3Plates.addChild(leftPlate16);
        this.setRotateAngle(leftPlate16, 0.1309F, 0.0F, 0.0F);


        this.rightPlate16 = new ModelRenderer(this);
        this.rightPlate16.setRotationPoint(-0.5F, -1.0F, 0.85F);
        this.Tail3Plates.addChild(rightPlate16);
        this.setRotateAngle(rightPlate16, 0.1309F, 0.0F, 0.0F);


        this.leftPlate17 = new ModelRenderer(this);
        this.leftPlate17.setRotationPoint(1.25F, 0.25F, 3.85F);
        this.Tail3Plates.addChild(leftPlate17);
        this.setRotateAngle(leftPlate17, 0.1309F, 0.0F, 0.0F);


        this.rightPlate17 = new ModelRenderer(this);
        this.rightPlate17.setRotationPoint(-0.25F, 0.25F, 3.85F);
        this.Tail3Plates.addChild(rightPlate17);
        this.setRotateAngle(rightPlate17, 0.1309F, 0.0F, 0.0F);


        this.leftPlate18 = new ModelRenderer(this);
        this.leftPlate18.setRotationPoint(1.0F, 0.5F, 7.35F);
        this.Tail3Plates.addChild(leftPlate18);
        this.setRotateAngle(leftPlate18, 0.1309F, 0.0F, 0.0F);


        this.rightPlate18 = new ModelRenderer(this);
        this.rightPlate18.setRotationPoint(0.0F, 0.5F, 7.35F);
        this.Tail3Plates.addChild(rightPlate18);
        this.setRotateAngle(rightPlate18, 0.1309F, 0.0F, 0.0F);


        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.4806F, 8.4869F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0457F, -0.3051F, -0.0138F);


        this.frame11_r1 = new ModelRenderer(this);
        this.frame11_r1.setRotationPoint(0.5F, 2.3213F, 3.8435F);
        this.tail4.addChild(frame11_r1);
        this.setRotateAngle(frame11_r1, 0.0087F, -0.0436F, -0.0004F);
        this.frame11_r1.cubeList.add(new ModelBox(frame11_r1, 10, 39, -0.5F, -0.5F, -3.5F, 1, 1, 7, -0.1F, false));

        this.Tail4Spikes = new ModelRenderer(this);
        this.Tail4Spikes.setRotationPoint(0.0F, -0.999F, 0.0436F);
        this.tail4.addChild(Tail4Spikes);


        this.leftTailSpike1 = new ModelRenderer(this);
        this.leftTailSpike1.setRotationPoint(1.5F, 4.15F, 3.65F);
        this.Tail4Spikes.addChild(leftTailSpike1);
        this.setRotateAngle(leftTailSpike1, -0.4504F, -0.039F, 1.0778F);


        this.rightTailSpike1 = new ModelRenderer(this);
        this.rightTailSpike1.setRotationPoint(-0.5F, 4.15F, 3.65F);
        this.Tail4Spikes.addChild(rightTailSpike1);
        this.setRotateAngle(rightTailSpike1, -0.4504F, 0.039F, -1.0778F);


        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.601F, 6.9436F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0962F, -0.4346F, 0.0406F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 37, 0.0F, 1.1451F, -0.2875F, 1, 1, 7, -0.1F, false));

        this.Tail5Spikes = new ModelRenderer(this);
        this.Tail5Spikes.setRotationPoint(0.0F, -1.0049F, 0.0125F);
        this.tail5.addChild(Tail5Spikes);


        this.leftTailSpike2 = new ModelRenderer(this);
        this.leftTailSpike2.setRotationPoint(0.2F, 1.9F, 0.85F);
        this.Tail5Spikes.addChild(leftTailSpike2);
        this.setRotateAngle(leftTailSpike2, -0.7352F, -0.0196F, 1.1086F);


        this.rightTailSpike2 = new ModelRenderer(this);
        this.rightTailSpike2.setRotationPoint(0.8F, 1.9F, 0.85F);
        this.Tail5Spikes.addChild(rightTailSpike2);
        this.setRotateAngle(rightTailSpike2, -0.7352F, 0.0196F, -1.1086F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.8F, 3.0F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, -1, -1, -0.49F, 1.45F, -10.6F, 1, 1, 11, -0.1F, false));

        this.BodyPlates = new ModelRenderer(this);
        this.BodyPlates.setRotationPoint(0.0F, 5.0F, -1.0F);
        this.body.addChild(BodyPlates);


        this.leftPlate7 = new ModelRenderer(this);
        this.leftPlate7.setRotationPoint(2.5F, -8.85F, -7.9F);
        this.BodyPlates.addChild(leftPlate7);
        this.setRotateAngle(leftPlate7, 0.0F, 0.0F, 0.2618F);


        this.rightPlate7 = new ModelRenderer(this);
        this.rightPlate7.setRotationPoint(-2.5F, -8.85F, -7.9F);
        this.BodyPlates.addChild(rightPlate7);
        this.setRotateAngle(rightPlate7, 0.0F, 0.0F, -0.2618F);


        this.leftPlate8 = new ModelRenderer(this);
        this.leftPlate8.setRotationPoint(2.75F, -9.5F, -4.05F);
        this.BodyPlates.addChild(leftPlate8);
        this.setRotateAngle(leftPlate8, -0.211F, 0.056F, 0.2559F);


        this.rightPlate8 = new ModelRenderer(this);
        this.rightPlate8.setRotationPoint(-2.75F, -9.5F, -4.05F);
        this.BodyPlates.addChild(rightPlate8);
        this.setRotateAngle(rightPlate8, -0.211F, -0.056F, -0.2559F);


        this.leftPlate9 = new ModelRenderer(this);
        this.leftPlate9.setRotationPoint(2.75F, -9.75F, -0.45F);
        this.BodyPlates.addChild(leftPlate9);
        this.setRotateAngle(leftPlate9, -0.211F, 0.056F, 0.2559F);


        this.rightPlate9 = new ModelRenderer(this);
        this.rightPlate9.setRotationPoint(-2.75F, -9.75F, -0.45F);
        this.BodyPlates.addChild(rightPlate9);
        this.setRotateAngle(rightPlate9, -0.211F, -0.056F, -0.2559F);


        this.leftPlate10 = new ModelRenderer(this);
        this.leftPlate10.setRotationPoint(2.5F, -10.0F, 3.4F);
        this.BodyPlates.addChild(leftPlate10);
        this.setRotateAngle(leftPlate10, -0.5133F, 0.1084F, 0.1897F);


        this.rightPlate10 = new ModelRenderer(this);
        this.rightPlate10.setRotationPoint(-2.5F, -10.0F, 3.4F);
        this.BodyPlates.addChild(rightPlate10);
        this.setRotateAngle(rightPlate10, -0.5133F, -0.1084F, -0.1897F);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.246F, -10.1452F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.0873F, 0.0F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 3.3178F, -3.6334F);
        this.chest.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.2306F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 31, 57, -0.5F, -1.2781F, -0.2133F, 1, 1, 4, -0.1F, false));

        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 4.1178F, -8.3834F);
        this.chest.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.3615F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 48, 46, -0.51F, -0.2428F, -0.1027F, 1, 1, 5, -0.1F, false));

        this.ChestPlates = new ModelRenderer(this);
        this.ChestPlates.setRotationPoint(3.35F, 3.054F, -4.3548F);
        this.chest.addChild(ChestPlates);


        this.leftPlate5 = new ModelRenderer(this);
        this.leftPlate5.setRotationPoint(-1.35F, -4.45F, -3.15F);
        this.ChestPlates.addChild(leftPlate5);
        this.setRotateAngle(leftPlate5, 0.1278F, -0.0283F, 0.2164F);


        this.rightPlate5 = new ModelRenderer(this);
        this.rightPlate5.setRotationPoint(-5.35F, -4.45F, -3.15F);
        this.ChestPlates.addChild(rightPlate5);
        this.setRotateAngle(rightPlate5, 0.1278F, 0.0283F, -0.2164F);


        this.leftPlate6 = new ModelRenderer(this);
        this.leftPlate6.setRotationPoint(-1.1F, -5.95F, -0.15F);
        this.ChestPlates.addChild(leftPlate6);
        this.setRotateAngle(leftPlate6, 0.0F, 0.0F, 0.2182F);


        this.rightPlate6 = new ModelRenderer(this);
        this.rightPlate6.setRotationPoint(-5.6F, -5.95F, -0.15F);
        this.ChestPlates.addChild(rightPlate6);
        this.setRotateAngle(rightPlate6, 0.0F, 0.0F, -0.2182F);


        this.Leftlegspike = new ModelRenderer(this);
        this.Leftlegspike.setRotationPoint(2.0F, 1.0F, 0.0F);
        this.ChestPlates.addChild(Leftlegspike);
        this.setRotateAngle(Leftlegspike, -0.0061F, 0.4402F, -0.1009F);


        this.Rightlegspike = new ModelRenderer(this);
        this.Rightlegspike.setRotationPoint(-8.7F, 1.0F, 0.0F);
        this.ChestPlates.addChild(Rightlegspike);
        this.setRotateAngle(Rightlegspike, -0.0061F, -0.4402F, 0.1009F);


        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.75F, 6.754F, -5.1048F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.9163F, 0.0F, -0.1745F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(1.1F, 10.5175F, 1.5867F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.7353F, 0.1273F, 0.1175F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(-1.0148F, 7.0905F, -2.1915F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1745F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.75F, 6.754F, -5.1048F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.0436F, 0.0F, 0.1745F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-1.1F, 10.5175F, 1.5867F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.7789F, -0.1273F, -0.1175F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(0.9148F, 7.0905F, -2.1915F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.7854F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, 2.7629F, -7.8454F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.0886F, 0.1739F, 0.0154F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 1.6683F, -4.8753F);
        this.neck.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.0873F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 47, 27, 0.0F, -0.25F, 0.05F, 1, 1, 5, -0.1F, false));

        this.NeckPlates = new ModelRenderer(this);
        this.NeckPlates.setRotationPoint(0.0F, -1.5727F, -0.7658F);
        this.neck.addChild(NeckPlates);


        this.leftPlate3 = new ModelRenderer(this);
        this.leftPlate3.setRotationPoint(2.0F, -1.309F, -3.2595F);
        this.NeckPlates.addChild(leftPlate3);
        this.setRotateAngle(leftPlate3, 0.0F, 0.0F, 0.1309F);


        this.rightPlate3 = new ModelRenderer(this);
        this.rightPlate3.setRotationPoint(-1.0F, -1.309F, -3.2595F);
        this.NeckPlates.addChild(rightPlate3);
        this.setRotateAngle(rightPlate3, 0.0F, 0.0F, -0.1309F);


        this.leftPlate4 = new ModelRenderer(this);
        this.leftPlate4.setRotationPoint(2.25F, -2.659F, 0.7405F);
        this.NeckPlates.addChild(leftPlate4);
        this.setRotateAngle(leftPlate4, 0.0886F, 0.0151F, 0.1739F);


        this.rightPlate4 = new ModelRenderer(this);
        this.rightPlate4.setRotationPoint(-1.25F, -2.659F, 0.7405F);
        this.NeckPlates.addChild(rightPlate4);
        this.setRotateAngle(rightPlate4, 0.0886F, -0.0151F, -0.1739F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0683F, -4.4253F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3819F, 0.4084F, -0.1582F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, 0.8318F, -4.1469F);
        this.neck2.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.201F, -0.0513F, 0.0104F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 31, 41, 0.0F, -0.55F, 0.15F, 1, 1, 5, -0.1F, false));

        this.Neck2Plates = new ModelRenderer(this);
        this.Neck2Plates.setRotationPoint(0.0F, -1.4182F, -0.1969F);
        this.neck2.addChild(Neck2Plates);


        this.leftPlate2 = new ModelRenderer(this);
        this.leftPlate2.setRotationPoint(1.25F, -0.1F, -2.6F);
        this.Neck2Plates.addChild(leftPlate2);
        this.setRotateAngle(leftPlate2, 0.1745F, 0.0F, 0.0F);


        this.rightPlate2 = new ModelRenderer(this);
        this.rightPlate2.setRotationPoint(-0.25F, -0.1F, -2.6F);
        this.Neck2Plates.addChild(rightPlate2);
        this.setRotateAngle(rightPlate2, 0.1745F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0682F, -3.8969F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1314F, 0.0865F, 0.0114F);
        this.neck3.cubeList.add(new ModelBox(neck3, 74, 4, 0.0F, 0.4409F, -1.8039F, 1, 1, 2, -0.1F, false));

        this.Neck3Plates = new ModelRenderer(this);
        this.Neck3Plates.setRotationPoint(0.0F, -1.1297F, -0.1539F);
        this.neck3.addChild(Neck3Plates);


        this.leftPlate1 = new ModelRenderer(this);
        this.leftPlate1.setRotationPoint(1.0F, -0.25F, -0.9F);
        this.Neck3Plates.addChild(leftPlate1);
        this.setRotateAngle(leftPlate1, 0.0436F, 0.0F, 0.0F);


        this.rightPlate1 = new ModelRenderer(this);
        this.rightPlate1.setRotationPoint(0.0F, -0.25F, -0.9F);
        this.Neck3Plates.addChild(rightPlate1);
        this.setRotateAngle(rightPlate1, 0.0436F, 0.0F, 0.0F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(1.0F, 0.0703F, -1.8539F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.448F, 0.1201F, 0.043F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 1.3467F, -0.2679F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6109F, 0.0F, 0.0F);

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
