package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGuanlongFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Neckbase;
    private final ModelRenderer Neckbase_r1;
    private final ModelRenderer Neckmiddle;
    private final ModelRenderer Neckmiddle_r1;
    private final ModelRenderer Neckfront;
    private final ModelRenderer Neckfront_r1;
    private final ModelRenderer Neckfront_r2;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjawbase;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Headcrest;
    private final ModelRenderer Leftupperfrontteeth;
    private final ModelRenderer Upperbackteeth;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerjawmiddleslope;
    private final ModelRenderer Rightlowerteeth;
    private final ModelRenderer Leftlowerteeth;
    private final ModelRenderer Lowerjawchinslope;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftFinger;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightFinger;
    private final ModelRenderer Belly;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailbase_r1;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailmiddlebase_r1;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailmiddleend_r1;
    private final ModelRenderer Tailend;
    private final ModelRenderer Tailend_r1;
    private final ModelRenderer Tailend2;
    private final ModelRenderer Tailend_r2;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftToes;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightToes;

    public ModelSkeletonGuanlongFrame() {
        this.textureWidth = 88;
        this.textureHeight = 88;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -18.0F, -0.7F, 1, 18, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.4F, -15.0F, -13.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.4363F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 0.0F, -1.0F, -0.5F, 1, 16, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.4F, -15.0F, -13.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4363F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -3.2F, -2.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -15.0F, -0.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 1.3F, -3.0F, -0.5F, 1, 5, 1, -0.15F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 5.8F, -1.5F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1057F, -0.0092F, -0.0868F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 30, -0.5F, -0.2F, -2.6F, 1, 1, 8, -0.15F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.247F, -2.8972F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.2481F, 0.2966F, 0.0739F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 34, 39, -0.5F, 0.161F, -5.1342F, 1, 1, 5, -0.15F, false));
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 38, 43, -0.5F, 0.161F, -0.4342F, 1, 1, 1, -0.16F, false));

        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, 0.161F, -8.3342F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, 0.0698F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 49, 56, -0.5F, 0.2F, 0.5F, 1, 1, 3, -0.15F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.161F, -7.6342F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1422F, 0.1296F, 0.0185F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 0.0771F, -4.1135F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.0175F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 48, 49, -0.5F, 0.0168F, 3.2952F, 1, 1, 1, -0.16F, false));
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 45, 46, -0.5F, 0.0168F, -0.2048F, 1, 1, 4, -0.15F, false));

        this.Neckbase = new ModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, -0.0229F, -3.9635F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.0978F, 0.2172F, -0.0211F);


        this.Neckbase_r1 = new ModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(0.0F, -0.4786F, -2.9207F);
        this.Neckbase.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, -0.0698F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 28, 56, -0.5F, 0.4908F, 0.1184F, 1, 1, 3, -0.15F, false));

        this.Neckmiddle = new ModelRenderer(this);
        this.Neckmiddle.setRotationPoint(0.0F, -0.1847F, -2.6239F);
        this.Neckbase.addChild(Neckmiddle);
        this.setRotateAngle(Neckmiddle, -0.5673F, 0.1476F, -0.0935F);


        this.Neckmiddle_r1 = new ModelRenderer(this);
        this.Neckmiddle_r1.setRotationPoint(0.5F, 0.4756F, -0.0873F);
        this.Neckmiddle.addChild(Neckmiddle_r1);
        this.setRotateAngle(Neckmiddle_r1, 0.0524F, 0.0F, 0.0F);
        this.Neckmiddle_r1.cubeList.add(new ModelBox(Neckmiddle_r1, 35, 13, -1.0F, -0.2116F, -0.2856F, 1, 1, 1, -0.16F, false));
        this.Neckmiddle_r1.cubeList.add(new ModelBox(Neckmiddle_r1, 31, 9, -1.0F, -0.2116F, -4.8856F, 1, 1, 5, -0.15F, false));

        this.Neckfront = new ModelRenderer(this);
        this.Neckfront.setRotationPoint(-0.01F, 0.1756F, -4.9373F);
        this.Neckmiddle.addChild(Neckfront);
        this.setRotateAngle(Neckfront, 0.2274F, 0.31F, 0.2383F);


        this.Neckfront_r1 = new ModelRenderer(this);
        this.Neckfront_r1.setRotationPoint(0.0F, -0.4664F, -1.8282F);
        this.Neckfront.addChild(Neckfront_r1);
        this.setRotateAngle(Neckfront_r1, 0.3054F, 0.0F, 0.0F);
        this.Neckfront_r1.cubeList.add(new ModelBox(Neckfront_r1, 66, 0, -0.49F, 0.7303F, -1.9906F, 1, 1, 2, -0.15F, false));

        this.Neckfront_r2 = new ModelRenderer(this);
        this.Neckfront_r2.setRotationPoint(0.0F, -0.2664F, -2.5282F);
        this.Neckfront.addChild(Neckfront_r2);
        this.setRotateAngle(Neckfront_r2, -0.0436F, 0.0F, 0.0F);
        this.Neckfront_r2.cubeList.add(new ModelBox(Neckfront_r2, 63, 65, -0.49F, 0.5F, 0.8F, 1, 1, 2, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.3163F, -2.7662F);
        this.Neckfront.addChild(Head);
        this.setRotateAngle(Head, 0.4255F, 0.0F, 0.0F);


        this.Upperjawbase = new ModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, -1.0964F, -2.84F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.4245F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, -0.2F, -4.1F);
        this.Upperjawbase.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.0424F, 0.0F, 0.0F);


        this.Headcrest = new ModelRenderer(this);
        this.Headcrest.setRotationPoint(0.0F, -0.2F, -1.75F);
        this.Upperjawfront.addChild(Headcrest);
        this.setRotateAngle(Headcrest, 0.1285F, 0.0F, 0.0F);


        this.Leftupperfrontteeth = new ModelRenderer(this);
        this.Leftupperfrontteeth.setRotationPoint(0.35F, 1.8F, -1.85F);
        this.Upperjawfront.addChild(Leftupperfrontteeth);
        this.setRotateAngle(Leftupperfrontteeth, -0.1471F, 0.0424F, 0.0F);


        this.Upperbackteeth = new ModelRenderer(this);
        this.Upperbackteeth.setRotationPoint(0.0F, 1.7F, -4.0F);
        this.Upperjawbase.addChild(Upperbackteeth);
        this.setRotateAngle(Upperbackteeth, 0.1061F, 0.0F, 0.0F);


        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 1.1336F, 0.06F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.5236F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.4245F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.7F, -3.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.2728F, 0.0F, 0.0F);


        this.Lowerjawmiddleslope = new ModelRenderer(this);
        this.Lowerjawmiddleslope.setRotationPoint(0.01F, 0.1F, -3.0F);
        this.Lowerjawmiddle.addChild(Lowerjawmiddleslope);
        this.setRotateAngle(Lowerjawmiddleslope, -0.2335F, 0.0F, 0.0F);


        this.Rightlowerteeth = new ModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(0.22F, 0.0F, -4.8F);
        this.Lowerjawmiddle.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, -0.2806F, 0.1061F, 0.0F);


        this.Leftlowerteeth = new ModelRenderer(this);
        this.Leftlowerteeth.setRotationPoint(-0.2F, 0.0F, -4.8F);
        this.Lowerjawmiddle.addChild(Leftlowerteeth);
        this.setRotateAngle(Leftlowerteeth, -0.2806F, -0.1061F, 0.0F);


        this.Lowerjawchinslope = new ModelRenderer(this);
        this.Lowerjawchinslope.setRotationPoint(-0.01F, 0.9F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawchinslope);
        this.setRotateAngle(Lowerjawchinslope, 0.2759F, 0.0F, 0.0F);


        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(2.8744F, 3.9764F, -3.4227F);
        this.Bodyfront.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.0527F, 0.3187F, -0.1359F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.1146F, 4.7004F, -0.1522F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.79F, -0.8215F, 0.1473F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2229F, 3.6536F, -0.087F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.4345F, -0.0692F, 0.0532F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(-0.0064F, 0.6654F, -0.5338F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.2618F, 0.0F, 0.0F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.8744F, 3.9764F, -3.4227F);
        this.Bodyfront.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.2964F, -0.3187F, 0.1359F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.1146F, 4.7004F, -0.1522F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.5223F, 0.9487F, -0.196F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2229F, 3.6536F, -0.087F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.4345F, 0.0692F, -0.0532F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0064F, 0.6654F, -0.5338F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.2618F, 0.0F, 0.0F);


        this.Belly = new ModelRenderer(this);
        this.Belly.setRotationPoint(-0.01F, 5.861F, -8.3342F);
        this.Bodymiddle.addChild(Belly);
        this.setRotateAngle(Belly, -0.2122F, 0.0F, 0.0F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.4F, 5.2F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.0216F, -0.1745F, 0.0038F);


        this.Tailbase_r1 = new ModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, 0.1107F, -0.0063F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, 0.0436F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 27, 28, -0.5F, 0.1F, -0.1F, 1, 1, 9, -0.15F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.3893F, 8.6937F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.1279F, -0.2598F, -0.033F);


        this.Tailmiddlebase_r1 = new ModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.0F, 0.1015F, 0.0247F);
        this.Tailmiddlebase.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, 0.0611F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 11, 27, -0.5F, 0.1F, 11.2F, 1, 1, 1, -0.16F, false));
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 0, 16, -0.5F, 0.1F, -0.4F, 1, 1, 12, -0.15F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(-0.49F, -0.6985F, 11.9247F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.1979F, 0.4288F, 0.0832F);


        this.Tailmiddleend_r1 = new ModelRenderer(this);
        this.Tailmiddleend_r1.setRotationPoint(0.0F, 0.0895F, -0.0261F);
        this.Tailmiddleend.addChild(Tailmiddleend_r1);
        this.setRotateAngle(Tailmiddleend_r1, -0.0873F, 0.0F, 0.0F);
        this.Tailmiddleend_r1.cubeList.add(new ModelBox(Tailmiddleend_r1, 19, 39, 0.0F, 0.1F, 0.0F, 1, 1, 6, -0.15F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(-0.01F, 0.5766F, 5.8759F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.0168F, 0.3054F, 0.0051F);


        this.Tailend_r1 = new ModelRenderer(this);
        this.Tailend_r1.setRotationPoint(0.0F, 0.0056F, 0.1941F);
        this.Tailend.addChild(Tailend_r1);
        this.setRotateAngle(Tailend_r1, -0.3054F, 0.0F, 0.0F);
        this.Tailend_r1.cubeList.add(new ModelBox(Tailend_r1, 31, 0, 0.0F, 0.2F, -0.3F, 1, 1, 7, -0.15F, false));

        this.Tailend2 = new ModelRenderer(this);
        this.Tailend2.setRotationPoint(0.0F, 2.097F, 6.5757F);
        this.Tailend.addChild(Tailend2);
        this.setRotateAngle(Tailend2, -0.2572F, 0.296F, -0.0766F);


        this.Tailend_r2 = new ModelRenderer(this);
        this.Tailend_r2.setRotationPoint(0.0F, 0.0072F, 0.2941F);
        this.Tailend2.addChild(Tailend_r2);
        this.setRotateAngle(Tailend_r2, -0.3054F, 0.0F, 0.0F);
        this.Tailend_r2.cubeList.add(new ModelBox(Tailend_r2, 0, 0, 0.0F, 0.2F, -0.4F, 1, 1, 14, -0.15F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.5F, 0.8254F, 1.394F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.0072F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-0.4F, 7.1031F, 1.6361F);
        this.Rightthigh.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.3439F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.1F, 8.7724F, -0.4035F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7418F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 4.1723F, -0.1947F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.8727F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 0.0972F, -1.5163F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, -0.258F, 0.0F, 0.0F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.5F, 0.8254F, 1.394F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.6894F, 0.0397F, 0.0777F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.4F, 7.1031F, 1.6361F);
        this.Leftthigh.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.5184F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.1F, 8.7724F, -0.4035F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.3079F, -0.0055F, 0.0162F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 4.1723F, -0.1947F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.6545F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 0.0972F, -1.5163F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, -0.0835F, 0.0F, 0.0F);

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
