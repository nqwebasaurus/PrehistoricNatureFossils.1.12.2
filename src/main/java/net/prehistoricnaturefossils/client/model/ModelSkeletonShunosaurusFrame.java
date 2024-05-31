package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonShunosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer root;
    private final ModelRenderer Hip;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer body;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer chest;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer neck1;
    private final ModelRenderer Neckbase_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer Neckmiddlebase_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer Neckmiddle_r1;
    private final ModelRenderer neck4;
    private final ModelRenderer Neckmiddlefront_r1;
    private final ModelRenderer neck5;
    private final ModelRenderer Neckfront_r1;
    private final ModelRenderer Throatpouch;
    private final ModelRenderer head;
    private final ModelRenderer Upperjawbase;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Upperfrontteeth;
    private final ModelRenderer Upperbackteeth;
    private final ModelRenderer Nosebase;
    private final ModelRenderer Nosefront;
    private final ModelRenderer jaw;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerjawtruefront;
    private final ModelRenderer Lowerjawteeth;
    private final ModelRenderer Lowerjawslope;
    private final ModelRenderer Bodyfrontslope;
    private final ModelRenderer upperarmleft;
    private final ModelRenderer lowerarmleft;
    private final ModelRenderer handleft;
    private final ModelRenderer Leftclaw;
    private final ModelRenderer upperarmright;
    private final ModelRenderer lowerarmright;
    private final ModelRenderer handright;
    private final ModelRenderer Rightclaw;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4_r1;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tail5_r1;
    private final ModelRenderer Tail5;
    private final ModelRenderer Tail6_r1;
    private final ModelRenderer Tail6;
    private final ModelRenderer Tail7_r1;
    private final ModelRenderer Tailclub;
    private final ModelRenderer upperlegleft;
    private final ModelRenderer lowerlegleft;
    private final ModelRenderer footleft;
    private final ModelRenderer upperlegright;
    private final ModelRenderer lowerlegright;
    private final ModelRenderer footright;
    private final ModelRenderer Hipslope;

    public ModelSkeletonShunosaurusFrame() {
        this.textureWidth = 118;
        this.textureHeight = 118;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.2752F, -21.0F, 15.1162F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -8.55F, -6.6705F, -1.1019F, 2, 13, 2, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.2752F, -21.0F, 15.1162F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.6705F, -10.0F, -0.8981F, 2, 31, 2, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(5.3248F, -21.0F, -13.3838F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2618F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.7705F, -14.0F, -0.8981F, 2, 35, 2, -0.2F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(5.3248F, -21.0F, -13.3838F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 1.5708F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -4.0F, -8.6705F, -1.1019F, 2, 20, 2, -0.2F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hip = new ModelRenderer(this);
        this.Hip.setRotationPoint(0.0F, -8.1F, 15.0F);
        this.root.addChild(Hip);
        this.setRotateAngle(Hip, -0.1911F, 0.0F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, -0.5871F, -7.1777F);
        this.Hip.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.0524F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 23, 27, -1.0F, 0.441F, 0.4822F, 2, 2, 14, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6449F, -6.9481F);
        this.Hip.addChild(body);
        this.setRotateAngle(body, 0.0216F, -0.1745F, -0.0038F);


        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, -0.7168F, -15.9781F);
        this.body.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, 0.0175F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, -3, 18, -0.9413F, 1.4767F, -0.6016F, 2, 2, 18, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.1914F, -15.2497F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1279F, -0.0866F, -0.0111F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 0.5582F, -13.1299F);
        this.chest.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0436F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 0, 41, -0.9346F, 0.4989F, -0.1129F, 2, 2, 13, -0.2F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.7394F, -13.2716F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.0978F, -0.2648F, -0.0178F);


        this.Neckbase_r1 = new ModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(0.0F, -1.0644F, -6.9973F);
        this.neck1.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, -0.1222F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 54, 73, -0.9517F, 0.2863F, -0.0016F, 2, 2, 9, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.5304F, -6.0736F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1352F, -0.185F, -0.0617F);


        this.Neckmiddlebase_r1 = new ModelRenderer(this);
        this.Neckmiddlebase_r1.setRotationPoint(0.0F, -0.6627F, -9.0898F);
        this.neck2.addChild(Neckmiddlebase_r1);
        this.setRotateAngle(Neckmiddlebase_r1, -0.0873F, 0.0F, 0.0F);
        this.Neckmiddlebase_r1.cubeList.add(new ModelBox(Neckmiddlebase_r1, 23, 59, -1.0252F, 0.6239F, 0.5985F, 2, 2, 9, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.2481F, -8.0364F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2834F, -0.2177F, 0.0141F);


        this.Neckmiddle_r1 = new ModelRenderer(this);
        this.Neckmiddle_r1.setRotationPoint(0.0F, -2.3264F, -8.1798F);
        this.neck3.addChild(Neckmiddle_r1);
        this.setRotateAngle(Neckmiddle_r1, -0.1745F, 0.0F, 0.0F);
        this.Neckmiddle_r1.cubeList.add(new ModelBox(Neckmiddle_r1, 76, 75, -0.883F, 1.0995F, 2.3183F, 2, 2, 7, -0.2F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.8823F, -7.2989F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.0446F, -0.2596F, -0.034F);


        this.Neckmiddlefront_r1 = new ModelRenderer(this);
        this.Neckmiddlefront_r1.setRotationPoint(0.0F, -3.2732F, -9.1078F);
        this.neck4.addChild(Neckmiddlefront_r1);
        this.setRotateAngle(Neckmiddlefront_r1, -0.3927F, 0.0F, 0.0F);
        this.Neckmiddlefront_r1.cubeList.add(new ModelBox(Neckmiddlefront_r1, 44, 60, -0.6766F, 0.0338F, 1.2548F, 2, 2, 11, -0.2F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -3.1104F, -8.1092F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.5062F, -0.2969F, -0.0728F);


        this.Neckfront_r1 = new ModelRenderer(this);
        this.Neckfront_r1.setRotationPoint(0.0F, -0.9927F, -5.2982F);
        this.neck5.addChild(Neckfront_r1);
        this.setRotateAngle(Neckfront_r1, -0.2705F, 0.0F, 0.0F);
        this.Neckfront_r1.cubeList.add(new ModelBox(Neckfront_r1, 24, 72, -0.547F, 0.011F, -0.1219F, 2, 2, 6, -0.2F, false));

        this.Throatpouch = new ModelRenderer(this);
        this.Throatpouch.setRotationPoint(0.0F, 4.2073F, 1.2018F);
        this.neck5.addChild(Throatpouch);
        this.setRotateAngle(Throatpouch, 0.1911F, 0.0F, 0.0F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.1988F, -5.7982F);
        this.neck5.addChild(head);
        this.setRotateAngle(head, 0.5568F, -0.3773F, -0.1115F);


        this.Upperjawbase = new ModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, -0.3539F, -4.0389F);
        this.head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.2972F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.Upperjawbase.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.3821F, 0.0F, 0.0F);


        this.Upperfrontteeth = new ModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(-0.01F, -0.5F, -3.7F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, 0.1911F, 0.0F, 0.0F);


        this.Upperbackteeth = new ModelRenderer(this);
        this.Upperbackteeth.setRotationPoint(0.0F, 2.8F, -4.0F);
        this.Upperjawbase.addChild(Upperbackteeth);
        this.setRotateAngle(Upperbackteeth, 0.2546F, 0.0F, 0.0F);


        this.Nosebase = new ModelRenderer(this);
        this.Nosebase.setRotationPoint(0.01F, -2.1239F, -4.0389F);
        this.head.addChild(Nosebase);
        this.setRotateAngle(Nosebase, 0.1485F, 0.0F, 0.0F);


        this.Nosefront = new ModelRenderer(this);
        this.Nosefront.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Nosebase.addChild(Nosefront);
        this.setRotateAngle(Nosefront, 0.4033F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.7311F, 0.2209F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3491F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.jaw.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.2972F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.3396F, 0.0F, 0.0F);


        this.Lowerjawtruefront = new ModelRenderer(this);
        this.Lowerjawtruefront.setRotationPoint(-0.01F, 0.0F, -3.7F);
        this.Lowerjawfront.addChild(Lowerjawtruefront);
        this.setRotateAngle(Lowerjawtruefront, -0.0087F, 0.0F, 0.0F);


        this.Lowerjawteeth = new ModelRenderer(this);
        this.Lowerjawteeth.setRotationPoint(0.0F, -1.7F, -4.3F);
        this.Lowerjawfront.addChild(Lowerjawteeth);
        this.setRotateAngle(Lowerjawteeth, -0.0424F, 0.0F, 0.0F);


        this.Lowerjawslope = new ModelRenderer(this);
        this.Lowerjawslope.setRotationPoint(0.01F, 2.0F, -2.8F);
        this.Lowerjawmiddle.addChild(Lowerjawslope);
        this.setRotateAngle(Lowerjawslope, -0.2335F, 0.0F, 0.0F);


        this.Bodyfrontslope = new ModelRenderer(this);
        this.Bodyfrontslope.setRotationPoint(0.0F, 9.5582F, -13.1299F);
        this.chest.addChild(Bodyfrontslope);
        this.setRotateAngle(Bodyfrontslope, -0.4458F, 0.0F, 0.0F);


        this.upperarmleft = new ModelRenderer(this);
        this.upperarmleft.setRotationPoint(9.9F, 12.3617F, -6.7793F);
        this.chest.addChild(upperarmleft);
        this.setRotateAngle(upperarmleft, 0.4552F, 0.0F, 0.0F);


        this.lowerarmleft = new ModelRenderer(this);
        this.lowerarmleft.setRotationPoint(0.0F, 12.3226F, 0.4916F);
        this.upperarmleft.addChild(lowerarmleft);
        this.setRotateAngle(lowerarmleft, -0.6297F, 0.0F, 0.0F);


        this.handleft = new ModelRenderer(this);
        this.handleft.setRotationPoint(-0.01F, 8.4811F, -1.6829F);
        this.lowerarmleft.addChild(handleft);
        this.setRotateAngle(handleft, 0.3042F, 0.0F, 0.0F);


        this.Leftclaw = new ModelRenderer(this);
        this.Leftclaw.setRotationPoint(-2.98F, 1.4337F, 1.3758F);
        this.handleft.addChild(Leftclaw);
        this.setRotateAngle(Leftclaw, 0.3183F, 0.2122F, 0.5732F);


        this.upperarmright = new ModelRenderer(this);
        this.upperarmright.setRotationPoint(-9.9F, 12.3617F, -6.7793F);
        this.chest.addChild(upperarmright);
        this.setRotateAngle(upperarmright, 0.0625F, 0.0F, 0.0F);


        this.lowerarmright = new ModelRenderer(this);
        this.lowerarmright.setRotationPoint(0.0F, 12.3226F, 0.4916F);
        this.upperarmright.addChild(lowerarmright);
        this.setRotateAngle(lowerarmright, -0.4552F, 0.0F, 0.0F);


        this.handright = new ModelRenderer(this);
        this.handright.setRotationPoint(0.01F, 8.4811F, -1.6829F);
        this.lowerarmright.addChild(handright);
        this.setRotateAngle(handright, 0.4351F, 0.0F, 0.0F);


        this.Rightclaw = new ModelRenderer(this);
        this.Rightclaw.setRotationPoint(2.98F, 1.4337F, 1.3758F);
        this.handright.addChild(Rightclaw);
        this.setRotateAngle(Rightclaw, 0.3183F, -0.2122F, -0.5732F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.435F, 6.5883F);
        this.Hip.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.1089F, 0.5149F, 0.1345F);


        this.Tail2_r1 = new ModelRenderer(this);
        this.Tail2_r1.setRotationPoint(0.0F, -0.2931F, 0.0306F);
        this.Tail1.addChild(Tail2_r1);
        this.setRotateAngle(Tail2_r1, 0.0436F, 0.0F, 0.0F);
        this.Tail2_r1.cubeList.add(new ModelBox(Tail2_r1, 46, 34, -0.9579F, 0.3182F, -0.8407F, 2, 2, 11, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -1.1501F, 9.4203F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.1644F, 0.3083F, -0.0082F);


        this.Tail3_r1 = new ModelRenderer(this);
        this.Tail3_r1.setRotationPoint(0.0F, -0.547F, 0.2856F);
        this.Tail2.addChild(Tail3_r1);
        this.setRotateAngle(Tail3_r1, 0.1047F, 0.0F, 0.0F);
        this.Tail3_r1.cubeList.add(new ModelBox(Tail3_r1, 41, 0, -1.05F, 1.4166F, -0.1397F, 2, 1, 12, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -1.3753F, 11.639F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0454F, 0.5618F, 0.193F);


        this.Tail4_r1 = new ModelRenderer(this);
        this.Tail4_r1.setRotationPoint(0.0F, -0.4696F, -0.0443F);
        this.Tail3.addChild(Tail4_r1);
        this.setRotateAngle(Tail4_r1, 0.192F, 0.0F, 0.0F);
        this.Tail4_r1.cubeList.add(new ModelBox(Tail4_r1, 41, 20, -1.0305F, 1.5164F, -0.7363F, 2, 1, 12, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -1.8205F, 10.7952F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0454F, 0.3888F, 0.091F);


        this.Tail5_r1 = new ModelRenderer(this);
        this.Tail5_r1.setRotationPoint(0.0F, -0.6326F, -0.0324F);
        this.Tail4.addChild(Tail5_r1);
        this.setRotateAngle(Tail5_r1, 0.2183F, 0.0192F, -0.034F);
        this.Tail5_r1.cubeList.add(new ModelBox(Tail5_r1, 31, 45, -0.9492F, 1.4518F, 0.0103F, 2, 1, 11, -0.2F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, -1.6753F, 10.8181F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.0995F, 0.4847F, -0.1629F);


        this.Tail6_r1 = new ModelRenderer(this);
        this.Tail6_r1.setRotationPoint(0.0F, 0.021F, 0.0185F);
        this.Tail5.addChild(Tail6_r1);
        this.setRotateAngle(Tail6_r1, 0.0873F, 0.0F, 0.0F);
        this.Tail6_r1.cubeList.add(new ModelBox(Tail6_r1, 46, 48, -0.5017F, 0.2835F, -0.5429F, 1, 1, 11, -0.2F, false));

        this.Tail6 = new ModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, -1.0175F, 10.5348F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.0216F, 0.1745F, -0.0038F);


        this.Tail7_r1 = new ModelRenderer(this);
        this.Tail7_r1.setRotationPoint(0.0F, 0.1454F, -0.0325F);
        this.Tail6.addChild(Tail7_r1);
        this.setRotateAngle(Tail7_r1, 0.0524F, 0.0F, 0.0F);
        this.Tail7_r1.cubeList.add(new ModelBox(Tail7_r1, 61, 24, -0.4915F, 0.2273F, -0.646F, 1, 1, 11, -0.2F, false));

        this.Tailclub = new ModelRenderer(this);
        this.Tailclub.setRotationPoint(0.0F, -0.5546F, 9.1675F);
        this.Tail6.addChild(Tailclub);
        this.setRotateAngle(Tailclub, -0.0424F, 0.0F, 0.0F);


        this.upperlegleft = new ModelRenderer(this);
        this.upperlegleft.setRotationPoint(6.0F, 2.3002F, 0.1463F);
        this.Hip.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, -0.3927F, 0.0F, 0.0F);


        this.lowerlegleft = new ModelRenderer(this);
        this.lowerlegleft.setRotationPoint(0.0F, 18.2596F, -0.7136F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 0.6262F, 0.0F, 0.0F);


        this.footleft = new ModelRenderer(this);
        this.footleft.setRotationPoint(-0.5F, 11.9185F, 2.519F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, -0.0424F, 0.0F, 0.0F);


        this.upperlegright = new ModelRenderer(this);
        this.upperlegright.setRotationPoint(-6.0F, 2.3002F, 0.1463F);
        this.Hip.addChild(upperlegright);
        this.setRotateAngle(upperlegright, 0.0436F, 0.0F, 0.0F);


        this.lowerlegright = new ModelRenderer(this);
        this.lowerlegright.setRotationPoint(0.0F, 18.2596F, -0.7136F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 0.8008F, 0.0F, 0.0F);


        this.footright = new ModelRenderer(this);
        this.footright.setRotationPoint(0.5F, 11.9185F, 2.519F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, -0.566F, 0.0F, 0.0F);


        this.Hipslope = new ModelRenderer(this);
        this.Hipslope.setRotationPoint(0.0F, 16.0092F, -7.3397F);
        this.Hip.addChild(Hipslope);
        this.setRotateAngle(Hipslope, 0.2546F, 0.0F, 0.0F);

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
