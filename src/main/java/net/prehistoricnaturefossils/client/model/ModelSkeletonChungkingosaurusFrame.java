package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonChungkingosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer HipPlates;
    private final ModelRenderer LeftPlate11;
    private final ModelRenderer RightPlate11;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftFoot;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightFoot;
    private final ModelRenderer tail;
    private final ModelRenderer TailPlates;
    private final ModelRenderer leftPlate13;
    private final ModelRenderer rightPlate13;
    private final ModelRenderer tail2;
    private final ModelRenderer Tailmiddlebase_r1;
    private final ModelRenderer Tail2Plates;
    private final ModelRenderer leftPlate14;
    private final ModelRenderer rightPlate14;
    private final ModelRenderer leftPlate15;
    private final ModelRenderer rightPlate15;
    private final ModelRenderer tail3;
    private final ModelRenderer Tail3Plates;
    private final ModelRenderer leftPlate17;
    private final ModelRenderer rightPlate17;
    private final ModelRenderer leftPlate4;
    private final ModelRenderer rightPlate4;
    private final ModelRenderer tail4;
    private final ModelRenderer Tailmiddleend_r1;
    private final ModelRenderer Tail4Spikes;
    private final ModelRenderer leftTailSpike1;
    private final ModelRenderer rightTailSpike1;
    private final ModelRenderer leftTailSpike4;
    private final ModelRenderer rightTailSpike4;
    private final ModelRenderer tail5;
    private final ModelRenderer Tailend_r1;
    private final ModelRenderer Tail5Spikes;
    private final ModelRenderer leftTailSpike2;
    private final ModelRenderer rightTailSpike2;
    private final ModelRenderer leftTailSpike3;
    private final ModelRenderer rightTailSpike3;
    private final ModelRenderer body;
    private final ModelRenderer BodyPlates;
    private final ModelRenderer leftPlate8;
    private final ModelRenderer rightPlate8;
    private final ModelRenderer leftPlate10;
    private final ModelRenderer rightPlate10;
    private final ModelRenderer chest;
    private final ModelRenderer Bodyfrontslope_r1;
    private final ModelRenderer Bodyfrontslope_r2;
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
    private final ModelRenderer bone;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer bone2;
    private final ModelRenderer neck;
    private final ModelRenderer Neckbase_r1;
    private final ModelRenderer NeckPlates;
    private final ModelRenderer leftPlate3;
    private final ModelRenderer rightPlate3;
    private final ModelRenderer neck2;
    private final ModelRenderer Neckmiddle_r1;
    private final ModelRenderer Neck2Plates;
    private final ModelRenderer leftPlate2;
    private final ModelRenderer rightPlate2;
    private final ModelRenderer neck3;
    private final ModelRenderer Neckfront_r1;
    private final ModelRenderer Neck3Plates;
    private final ModelRenderer leftPlate1;
    private final ModelRenderer rightPlate1;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonChungkingosaurusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -21.0F, 0.7F, 1, 21, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(4.0F, -14.2F, -13.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2705F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.0F, 0.2F, -0.5F, 1, 14, 1, -0.21F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(4.0F, -14.2F, -13.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2705F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 5.5F, -5.5F, -0.5F, 1, 12, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -20.5F, 1.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 1.1F, -5.5F, -0.5F, 1, 10, 1, -0.2F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -17.1F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -0.1F, -2.7F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, 0.3491F, 0.0F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, -3.45F, 3.5F);
        this.hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.2269F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 13, 17, -0.5F, 0.252F, -0.5887F, 1, 2, 8, -0.2F, false));

        this.HipPlates = new ModelRenderer(this);
        this.HipPlates.setRotationPoint(0.0F, 1.2F, 2.0F);
        this.hips.addChild(HipPlates);


        this.LeftPlate11 = new ModelRenderer(this);
        this.LeftPlate11.setRotationPoint(2.5F, -13.55F, 7.85F);
        this.HipPlates.addChild(LeftPlate11);
        this.setRotateAngle(LeftPlate11, -0.468F, 0.1468F, 0.162F);


        this.RightPlate11 = new ModelRenderer(this);
        this.RightPlate11.setRotationPoint(-2.5F, -13.55F, 7.85F);
        this.HipPlates.addChild(RightPlate11);
        this.setRotateAngle(RightPlate11, -0.468F, -0.1468F, -0.162F);


        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.25F, -1.0F, 4.75F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.8184F, -0.5553F, 0.1766F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.13F, 8.6623F, 0.2128F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.0021F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(-0.6F, 8.8139F, -0.615F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.1309F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.25F, -1.0F, 4.75F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.6101F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.13F, 8.6623F, 0.2128F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.3912F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.6F, 8.8139F, -0.615F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.0873F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -1.85F, 10.1F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1378F, -0.3449F, 0.0941F);
        this.tail.cubeList.add(new ModelBox(tail, -2, 23, 0.0F, -0.0512F, -0.4018F, 1, 2, 8, -0.2F, false));

        this.TailPlates = new ModelRenderer(this);
        this.TailPlates.setRotationPoint(0.0F, -2.5512F, 0.2482F);
        this.tail.addChild(TailPlates);


        this.leftPlate13 = new ModelRenderer(this);
        this.leftPlate13.setRotationPoint(2.5F, -3.0F, 4.75F);
        this.TailPlates.addChild(leftPlate13);
        this.setRotateAngle(leftPlate13, -0.3004F, 0.0469F, 0.2132F);


        this.rightPlate13 = new ModelRenderer(this);
        this.rightPlate13.setRotationPoint(-1.5F, -3.0F, 4.75F);
        this.TailPlates.addChild(rightPlate13);
        this.setRotateAngle(rightPlate13, -0.3004F, -0.0469F, -0.2132F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1488F, 6.2982F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.422F, 0.0F, 0.0F);


        this.Tailmiddlebase_r1 = new ModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.5F, 0.1102F, -0.0188F);
        this.tail2.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, 0.0087F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 24, 20, -0.5F, 0.0F, 0.2F, 1, 2, 8, -0.2F, false));

        this.Tail2Plates = new ModelRenderer(this);
        this.Tail2Plates.setRotationPoint(0.0F, -2.0898F, 0.9812F);
        this.tail2.addChild(Tail2Plates);


        this.leftPlate14 = new ModelRenderer(this);
        this.leftPlate14.setRotationPoint(2.0F, -0.9F, 1.2F);
        this.Tail2Plates.addChild(leftPlate14);
        this.setRotateAngle(leftPlate14, -0.3883F, 0.0522F, 0.1666F);


        this.rightPlate14 = new ModelRenderer(this);
        this.rightPlate14.setRotationPoint(-1.0F, -0.9F, 1.2F);
        this.Tail2Plates.addChild(rightPlate14);
        this.setRotateAngle(rightPlate14, -0.3883F, -0.0522F, -0.1666F);


        this.leftPlate15 = new ModelRenderer(this);
        this.leftPlate15.setRotationPoint(1.3319F, -1.1205F, 6.0101F);
        this.Tail2Plates.addChild(leftPlate15);
        this.setRotateAngle(leftPlate15, -0.6957F, 0.0393F, 0.1249F);


        this.rightPlate15 = new ModelRenderer(this);
        this.rightPlate15.setRotationPoint(-0.3319F, -1.1205F, 6.0101F);
        this.Tail2Plates.addChild(rightPlate15);
        this.setRotateAngle(rightPlate15, -0.6957F, -0.0393F, -0.1249F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1602F, 7.5812F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.105F, -0.3908F, -0.0401F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 13, 0.0F, -0.1806F, -0.4131F, 1, 2, 9, -0.2F, false));

        this.Tail3Plates = new ModelRenderer(this);
        this.Tail3Plates.setRotationPoint(0.0F, -1.9806F, 0.4869F);
        this.tail3.addChild(Tail3Plates);


        this.leftPlate17 = new ModelRenderer(this);
        this.leftPlate17.setRotationPoint(1.25F, 0.85F, 2.75F);
        this.Tail3Plates.addChild(leftPlate17);
        this.setRotateAngle(leftPlate17, 0.1348F, 0.0847F, 0.3631F);


        this.rightPlate17 = new ModelRenderer(this);
        this.rightPlate17.setRotationPoint(-0.25F, 0.85F, 2.75F);
        this.Tail3Plates.addChild(rightPlate17);
        this.setRotateAngle(rightPlate17, 0.1348F, -0.0847F, -0.3631F);


        this.leftPlate4 = new ModelRenderer(this);
        this.leftPlate4.setRotationPoint(1.95F, 0.2747F, 5.7582F);
        this.Tail3Plates.addChild(leftPlate4);
        this.setRotateAngle(leftPlate4, 0.0875F, 0.0332F, 0.8449F);


        this.rightPlate4 = new ModelRenderer(this);
        this.rightPlate4.setRotationPoint(-0.95F, 0.2747F, 5.7582F);
        this.Tail3Plates.addChild(rightPlate4);
        this.setRotateAngle(rightPlate4, 0.0875F, -0.0332F, -0.8449F);


        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.4806F, 8.4869F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0021F, -0.1745F, -0.0004F);


        this.Tailmiddleend_r1 = new ModelRenderer(this);
        this.Tailmiddleend_r1.setRotationPoint(0.5F, 0.301F, -0.0564F);
        this.tail4.addChild(Tailmiddleend_r1);
        this.setRotateAngle(Tailmiddleend_r1, -0.0524F, 0.0F, 0.0F);
        this.Tailmiddleend_r1.cubeList.add(new ModelBox(Tailmiddleend_r1, 33, 17, -0.5F, 0.0F, -0.4F, 1, 1, 8, -0.2F, false));

        this.Tail4Spikes = new ModelRenderer(this);
        this.Tail4Spikes.setRotationPoint(0.0F, -0.999F, 0.0436F);
        this.tail4.addChild(Tail4Spikes);


        this.leftTailSpike1 = new ModelRenderer(this);
        this.leftTailSpike1.setRotationPoint(0.2F, 1.15F, 3.35F);
        this.Tail4Spikes.addChild(leftTailSpike1);
        this.setRotateAngle(leftTailSpike1, -0.6128F, 0.0739F, 1.3052F);


        this.rightTailSpike1 = new ModelRenderer(this);
        this.rightTailSpike1.setRotationPoint(0.8F, 1.15F, 3.35F);
        this.Tail4Spikes.addChild(rightTailSpike1);
        this.setRotateAngle(rightTailSpike1, -0.6128F, -0.0739F, -1.3052F);


        this.leftTailSpike4 = new ModelRenderer(this);
        this.leftTailSpike4.setRotationPoint(0.1F, 1.45F, -0.35F);
        this.Tail4Spikes.addChild(leftTailSpike4);
        this.setRotateAngle(leftTailSpike4, -0.7471F, -0.0143F, 1.3006F);


        this.rightTailSpike4 = new ModelRenderer(this);
        this.rightTailSpike4.setRotationPoint(0.9F, 1.45F, -0.35F);
        this.Tail4Spikes.addChild(rightTailSpike4);
        this.setRotateAngle(rightTailSpike4, -0.7471F, 0.0143F, -1.3006F);


        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.601F, 6.9436F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1806F, -0.2577F, 0.0465F);


        this.Tailend_r1 = new ModelRenderer(this);
        this.Tailend_r1.setRotationPoint(0.5F, 0.1451F, 0.2125F);
        this.tail5.addChild(Tailend_r1);
        this.setRotateAngle(Tailend_r1, -0.0873F, 0.0F, 0.0F);
        this.Tailend_r1.cubeList.add(new ModelBox(Tailend_r1, 0, 35, -0.5F, 0.0F, -0.5F, 1, 1, 7, -0.2F, false));

        this.Tail5Spikes = new ModelRenderer(this);
        this.Tail5Spikes.setRotationPoint(0.0F, -1.0049F, 0.0125F);
        this.tail5.addChild(Tail5Spikes);


        this.leftTailSpike2 = new ModelRenderer(this);
        this.leftTailSpike2.setRotationPoint(1.7F, 1.0F, 0.85F);
        this.Tail5Spikes.addChild(leftTailSpike2);
        this.setRotateAngle(leftTailSpike2, -0.8889F, -0.0208F, 1.2572F);


        this.rightTailSpike2 = new ModelRenderer(this);
        this.rightTailSpike2.setRotationPoint(-0.7F, 1.0F, 0.85F);
        this.Tail5Spikes.addChild(rightTailSpike2);
        this.setRotateAngle(rightTailSpike2, -0.8889F, 0.0208F, -1.2572F);


        this.leftTailSpike3 = new ModelRenderer(this);
        this.leftTailSpike3.setRotationPoint(1.8F, 1.9F, 3.15F);
        this.Tail5Spikes.addChild(leftTailSpike3);
        this.setRotateAngle(leftTailSpike3, -1.388F, 0.0273F, 1.1905F);


        this.rightTailSpike3 = new ModelRenderer(this);
        this.rightTailSpike3.setRotationPoint(-0.8F, 1.9F, 3.15F);
        this.Tail5Spikes.addChild(rightTailSpike3);
        this.setRotateAngle(rightTailSpike3, -1.388F, -0.0273F, -1.1905F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.8F, 3.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0097F, -0.218F, 0.0447F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, 0.45F, -10.0F, 1, 2, 10, -0.2F, false));

        this.BodyPlates = new ModelRenderer(this);
        this.BodyPlates.setRotationPoint(0.0F, 5.0F, -1.0F);
        this.body.addChild(BodyPlates);


        this.leftPlate8 = new ModelRenderer(this);
        this.leftPlate8.setRotationPoint(2.75F, -7.9F, -7.05F);
        this.BodyPlates.addChild(leftPlate8);
        this.setRotateAngle(leftPlate8, -0.0539F, 0.056F, 0.2559F);


        this.rightPlate8 = new ModelRenderer(this);
        this.rightPlate8.setRotationPoint(-2.75F, -7.9F, -7.05F);
        this.BodyPlates.addChild(rightPlate8);
        this.setRotateAngle(rightPlate8, -0.0539F, -0.056F, -0.2559F);


        this.leftPlate10 = new ModelRenderer(this);
        this.leftPlate10.setRotationPoint(2.5F, -13.3F, 1.7F);
        this.BodyPlates.addChild(leftPlate10);
        this.setRotateAngle(leftPlate10, -0.2951F, 0.1084F, 0.1897F);


        this.rightPlate10 = new ModelRenderer(this);
        this.rightPlate10.setRotationPoint(-2.5F, -13.3F, 1.7F);
        this.BodyPlates.addChild(rightPlate10);
        this.setRotateAngle(rightPlate10, -0.2951F, -0.1084F, -0.1897F);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.246F, -10.1452F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0873F, 0.0F);


        this.Bodyfrontslope_r1 = new ModelRenderer(this);
        this.Bodyfrontslope_r1.setRotationPoint(0.0F, 1.3178F, -3.3834F);
        this.chest.addChild(Bodyfrontslope_r1);
        this.setRotateAngle(Bodyfrontslope_r1, 0.2306F, 0.0F, 0.0F);
        this.Bodyfrontslope_r1.cubeList.add(new ModelBox(Bodyfrontslope_r1, 18, 54, -0.5F, -0.2781F, -0.0133F, 1, 2, 4, -0.2F, false));

        this.Bodyfrontslope_r2 = new ModelRenderer(this);
        this.Bodyfrontslope_r2.setRotationPoint(0.0F, 2.9136F, -5.5196F);
        this.chest.addChild(Bodyfrontslope_r2);
        this.setRotateAngle(Bodyfrontslope_r2, 0.3608F, 0.0372F, 0.0228F);
        this.Bodyfrontslope_r2.cubeList.add(new ModelBox(Bodyfrontslope_r2, -1, 43, -0.6F, -1.0F, -3.1F, 1, 2, 6, -0.2F, false));

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
        this.Leftlegspike.setRotationPoint(-0.4F, 1.7F, -2.3F);
        this.ChestPlates.addChild(Leftlegspike);
        this.setRotateAngle(Leftlegspike, 0.1248F, 0.4402F, -0.1009F);


        this.Rightlegspike = new ModelRenderer(this);
        this.Rightlegspike.setRotationPoint(-6.3F, 1.7F, -2.3F);
        this.ChestPlates.addChild(Rightlegspike);
        this.setRotateAngle(Rightlegspike, 0.1248F, -0.4402F, 0.1009F);


        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.75F, 7.754F, -7.1048F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0699F, 0.103F, -0.5086F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(1.1F, 5.5175F, 0.7867F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.6893F, 0.2599F, 0.0604F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(-0.9764F, 5.0507F, 1.4044F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 1.1578F, -0.3567F, -0.0469F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftArm.addChild(bone);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.75F, 7.754F, -7.1048F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.697F, -0.0262F, 0.2578F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-1.1F, 5.5175F, 0.7867F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.8713F, -0.3938F, 0.0439F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(0.9764F, 5.0507F, 1.4044F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, -0.1762F, 0.4907F, 0.0787F);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightArm.addChild(bone2);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, 2.7629F, -7.8454F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.2248F, -0.3367F, 0.2778F);


        this.Neckbase_r1 = new ModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(0.0F, -0.3317F, -4.8753F);
        this.neck.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, 0.0873F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 45, 16, 0.0F, 0.75F, 0.05F, 1, 2, 5, -0.2F, false));

        this.NeckPlates = new ModelRenderer(this);
        this.NeckPlates.setRotationPoint(0.0F, -1.5727F, -0.7658F);
        this.neck.addChild(NeckPlates);


        this.leftPlate3 = new ModelRenderer(this);
        this.leftPlate3.setRotationPoint(2.0F, -1.409F, -2.9595F);
        this.NeckPlates.addChild(leftPlate3);
        this.setRotateAngle(leftPlate3, 0.1745F, 0.0F, 0.1309F);


        this.rightPlate3 = new ModelRenderer(this);
        this.rightPlate3.setRotationPoint(-1.0F, -1.409F, -2.9595F);
        this.NeckPlates.addChild(rightPlate3);
        this.setRotateAngle(rightPlate3, 0.1745F, 0.0F, -0.1309F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0683F, -4.4253F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.6995F, -0.1219F, 0.0843F);


        this.Neckmiddle_r1 = new ModelRenderer(this);
        this.Neckmiddle_r1.setRotationPoint(0.0F, -0.1682F, -4.2469F);
        this.neck2.addChild(Neckmiddle_r1);
        this.setRotateAngle(Neckmiddle_r1, -0.0698F, 0.0F, 0.0F);
        this.Neckmiddle_r1.cubeList.add(new ModelBox(Neckmiddle_r1, 46, 23, 0.0F, 0.15F, -0.35F, 1, 1, 6, -0.2F, false));

        this.Neck2Plates = new ModelRenderer(this);
        this.Neck2Plates.setRotationPoint(0.0F, -1.4182F, -0.1969F);
        this.neck2.addChild(Neck2Plates);


        this.leftPlate2 = new ModelRenderer(this);
        this.leftPlate2.setRotationPoint(1.25F, -0.1F, -2.3F);
        this.Neck2Plates.addChild(leftPlate2);
        this.setRotateAngle(leftPlate2, 0.3491F, 0.0F, 0.0F);


        this.rightPlate2 = new ModelRenderer(this);
        this.rightPlate2.setRotationPoint(-0.25F, -0.1F, -2.3F);
        this.Neck2Plates.addChild(rightPlate2);
        this.setRotateAngle(rightPlate2, 0.3491F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0682F, -4.5969F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.0464F, -0.123F, 0.045F);


        this.Neckfront_r1 = new ModelRenderer(this);
        this.Neckfront_r1.setRotationPoint(0.5F, -0.0992F, -0.8545F);
        this.neck3.addChild(Neckfront_r1);
        this.setRotateAngle(Neckfront_r1, -0.3054F, 0.0F, 0.0F);
        this.Neckfront_r1.cubeList.add(new ModelBox(Neckfront_r1, 63, 17, -0.5F, -0.2F, -1.6F, 1, 1, 3, -0.2F, false));

        this.Neck3Plates = new ModelRenderer(this);
        this.Neck3Plates.setRotationPoint(0.0F, -1.0992F, 0.5455F);
        this.neck3.addChild(Neck3Plates);


        this.leftPlate1 = new ModelRenderer(this);
        this.leftPlate1.setRotationPoint(1.0F, -0.25F, -1.6F);
        this.Neck3Plates.addChild(leftPlate1);
        this.setRotateAngle(leftPlate1, 0.0436F, 0.0F, 0.0F);


        this.rightPlate1 = new ModelRenderer(this);
        this.rightPlate1.setRotationPoint(0.0F, -0.25F, -1.6F);
        this.Neck3Plates.addChild(rightPlate1);
        this.setRotateAngle(rightPlate1, 0.0436F, 0.0F, 0.0F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(1.0F, -0.3992F, -2.1545F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.2162F, 0.0227F, -0.1731F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.9467F, -0.2679F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);

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
