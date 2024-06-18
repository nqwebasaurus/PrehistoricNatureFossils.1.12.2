package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPrionosuchusFrame extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Eyeportion;
    private final ModelRenderer Upperjaw1;
    private final ModelRenderer Upperjaw2;
    private final ModelRenderer Upperjawslope2;
    private final ModelRenderer Leftupperteeth2;
    private final ModelRenderer Rightupperteeth2;
    private final ModelRenderer Upperjawslope1;
    private final ModelRenderer Lefteye;
    private final ModelRenderer Righteye;
    private final ModelRenderer Righteye2;
    private final ModelRenderer Leftupperlip1;
    private final ModelRenderer Leftupperlip2;
    private final ModelRenderer Leftupperlip3;
    private final ModelRenderer Leftupperteeth1;
    private final ModelRenderer Rightupperlip1;
    private final ModelRenderer Rightupperlip2;
    private final ModelRenderer Rightupperlip3;
    private final ModelRenderer Rightupperteeth1;
    private final ModelRenderer Lowerjawbase;
    private final ModelRenderer Lowerjawmiddlebase;
    private final ModelRenderer Lowerjawmiddlefront;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Leftlowerteeth2;
    private final ModelRenderer Rightlowerteeth2;
    private final ModelRenderer Rightlowerteeth4;
    private final ModelRenderer Leftlowerlip3;
    private final ModelRenderer Rightlowerlip3;
    private final ModelRenderer Rightlowerlip4;
    private final ModelRenderer Lowerjawslope1;
    private final ModelRenderer Lowerjawslope2;
    private final ModelRenderer Leftlowerteeth1;
    private final ModelRenderer Rightlowerteeth1;
    private final ModelRenderer Rightlowerteeth3;
    private final ModelRenderer Leftlowerlip1;
    private final ModelRenderer Leftlowerlip2;
    private final ModelRenderer Rightlowerlip1;
    private final ModelRenderer Rightlowerlip2;
    private final ModelRenderer Rightlowerlip5;
    private final ModelRenderer Rightlowerlip6;
    private final ModelRenderer Jawparting;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailmiddle;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailend;
    private final ModelRenderer Tailfinend;
    private final ModelRenderer Tailfindorsal4;
    private final ModelRenderer Tailfinventral4;
    private final ModelRenderer Tailfindorsal3;
    private final ModelRenderer Tailfinventral3;
    private final ModelRenderer Tailfindorsal2;
    private final ModelRenderer Tailfinventral2;
    private final ModelRenderer Tailfindorsal1;
    private final ModelRenderer Tailfinventral1;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonPrionosuchusFrame() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(-1.0F, 17.0F, 0.0F);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(4.0F, 1.1F, 11.5F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.3F, -0.1994F, -0.4008F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 29, -0.5F, 0.0972F, -5.4109F, 1, 1, 9, -0.2F, false));
        this.Hips.cubeList.add(new ModelBox(Hips, 8, 37, -0.5F, 0.2972F, -0.1109F, 1, 3, 1, -0.25F, false));

        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, 3.7972F, 0.3891F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 0.0F, 0.0F, 1.5708F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 8, 37, -1.5F, -2.9F, -0.5F, 1, 6, 1, -0.2F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.2885F, -4.6614F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.1608F, 0.3466F, -0.017F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 12, 31, -0.5F, 0.4F, -8.8F, 1, 1, 9, -0.2F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(-0.1F, 0.1F, -8.1F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.2765F, 0.3862F, -0.0392F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 10, 26, -0.4F, 0.5126F, -10.9545F, 1, 3, 1, -0.25F, false));
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 15, -0.4F, 0.3126F, -11.7045F, 1, 1, 12, -0.2F, false));

        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.1F, 4.2626F, -10.4545F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0F, 0.0F, 1.5708F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 10, 26, -1.5F, -5.0F, -0.5F, 1, 9, 1, -0.2F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.1F, -0.445F, -10.7054F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.1541F, 0.2137F, -0.0634F);
        this.Neck.cubeList.add(new ModelBox(Neck, 38, 56, -0.5F, 0.7363F, -4.998F, 1, 1, 5, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, 0.1363F, -3.998F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.3265F, 0.3807F, -0.138F);


        this.Eyeportion = new ModelRenderer(this);
        this.Eyeportion.setRotationPoint(0.0F, -0.9F, -3.0F);
        this.Head.addChild(Eyeportion);
        this.setRotateAngle(Eyeportion, 0.1061F, 0.0F, 0.0F);


        this.Upperjaw1 = new ModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, 2.7F, -2.0F);
        this.Eyeportion.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, -0.1061F, 0.0F, 0.0F);


        this.Upperjaw2 = new ModelRenderer(this);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Upperjaw1.addChild(Upperjaw2);


        this.Upperjawslope2 = new ModelRenderer(this);
        this.Upperjawslope2.setRotationPoint(-0.01F, -1.0F, -5.9F);
        this.Upperjaw2.addChild(Upperjawslope2);
        this.setRotateAngle(Upperjawslope2, 0.1663F, 0.0F, 0.0F);


        this.Leftupperteeth2 = new ModelRenderer(this);
        this.Leftupperteeth2.setRotationPoint(-0.4F, -0.5F, -5.3F);
        this.Upperjaw2.addChild(Leftupperteeth2);
        this.setRotateAngle(Leftupperteeth2, 0.0F, -0.0157F, 0.0F);


        this.Rightupperteeth2 = new ModelRenderer(this);
        this.Rightupperteeth2.setRotationPoint(0.4F, -0.5F, -5.3F);
        this.Upperjaw2.addChild(Rightupperteeth2);
        this.setRotateAngle(Rightupperteeth2, 0.0F, 0.0157F, 0.0F);


        this.Upperjawslope1 = new ModelRenderer(this);
        this.Upperjawslope1.setRotationPoint(0.01F, -2.0F, -4.0F);
        this.Upperjaw1.addChild(Upperjawslope1);
        this.setRotateAngle(Upperjawslope1, 0.1998F, 0.0F, 0.0F);


        this.Lefteye = new ModelRenderer(this);
        this.Lefteye.setRotationPoint(0.4F, 0.0F, -1.9F);
        this.Eyeportion.addChild(Lefteye);
        this.setRotateAngle(Lefteye, -0.0848F, 0.2122F, -0.2546F);


        this.Righteye = new ModelRenderer(this);
        this.Righteye.setRotationPoint(-0.4F, 0.0F, -1.9F);
        this.Eyeportion.addChild(Righteye);
        this.setRotateAngle(Righteye, 0.0F, -0.2122F, 0.2546F);


        this.Righteye2 = new ModelRenderer(this);
        this.Righteye2.setRotationPoint(0.42F, 0.0F, -1.9F);
        this.Eyeportion.addChild(Righteye2);
        this.setRotateAngle(Righteye2, 0.0F, 0.2122F, -0.2546F);


        this.Leftupperlip1 = new ModelRenderer(this);
        this.Leftupperlip1.setRotationPoint(-3.5F, -0.02F, -2.2F);
        this.Head.addChild(Leftupperlip1);
        this.setRotateAngle(Leftupperlip1, 0.0F, -0.3821F, 0.0F);


        this.Leftupperlip2 = new ModelRenderer(this);
        this.Leftupperlip2.setRotationPoint(0.0F, 1.99F, -4.0F);
        this.Leftupperlip1.addChild(Leftupperlip2);
        this.setRotateAngle(Leftupperlip2, 0.0F, 0.0424F, 0.0F);


        this.Leftupperlip3 = new ModelRenderer(this);
        this.Leftupperlip3.setRotationPoint(0.0F, 0.01F, -3.0F);
        this.Leftupperlip2.addChild(Leftupperlip3);
        this.setRotateAngle(Leftupperlip3, 0.0F, 0.1698F, 0.0F);


        this.Leftupperteeth1 = new ModelRenderer(this);
        this.Leftupperteeth1.setRotationPoint(0.1F, 1.5F, -5.1F);
        this.Leftupperlip1.addChild(Leftupperteeth1);
        this.setRotateAngle(Leftupperteeth1, 0.0F, 0.0424F, 0.0F);


        this.Rightupperlip1 = new ModelRenderer(this);
        this.Rightupperlip1.setRotationPoint(3.5F, -0.01F, -2.2F);
        this.Head.addChild(Rightupperlip1);
        this.setRotateAngle(Rightupperlip1, 0.0F, 0.3821F, 0.0F);


        this.Rightupperlip2 = new ModelRenderer(this);
        this.Rightupperlip2.setRotationPoint(0.0F, 1.99F, -4.0F);
        this.Rightupperlip1.addChild(Rightupperlip2);
        this.setRotateAngle(Rightupperlip2, 0.0F, -0.0424F, 0.0F);


        this.Rightupperlip3 = new ModelRenderer(this);
        this.Rightupperlip3.setRotationPoint(0.0F, 0.01F, -3.0F);
        this.Rightupperlip2.addChild(Rightupperlip3);
        this.setRotateAngle(Rightupperlip3, 0.0F, -0.1698F, 0.0F);


        this.Rightupperteeth1 = new ModelRenderer(this);
        this.Rightupperteeth1.setRotationPoint(-0.1F, 1.5F, -5.1F);
        this.Rightupperlip1.addChild(Rightupperteeth1);
        this.setRotateAngle(Rightupperteeth1, 0.0F, -0.0424F, 0.0F);


        this.Lowerjawbase = new ModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 0.1745F, 0.0F, 0.0F);


        this.Lowerjawmiddlebase = new ModelRenderer(this);
        this.Lowerjawmiddlebase.setRotationPoint(0.0F, -0.01F, -3.0F);
        this.Lowerjawbase.addChild(Lowerjawmiddlebase);


        this.Lowerjawmiddlefront = new ModelRenderer(this);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjawmiddlebase.addChild(Lowerjawmiddlefront);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.01F, -2.6F);
        this.Lowerjawmiddlefront.addChild(Lowerjawfront);


        this.Leftlowerteeth2 = new ModelRenderer(this);
        this.Leftlowerteeth2.setRotationPoint(-0.4F, 0.5F, -4.1F);
        this.Lowerjawfront.addChild(Leftlowerteeth2);
        this.setRotateAngle(Leftlowerteeth2, 0.0F, -0.0213F, 0.0F);


        this.Rightlowerteeth2 = new ModelRenderer(this);
        this.Rightlowerteeth2.setRotationPoint(0.3F, 0.5F, -4.0F);
        this.Lowerjawfront.addChild(Rightlowerteeth2);
        this.setRotateAngle(Rightlowerteeth2, 0.0F, 0.0213F, 0.0F);


        this.Rightlowerteeth4 = new ModelRenderer(this);
        this.Rightlowerteeth4.setRotationPoint(-0.28F, 0.5F, -4.0F);
        this.Lowerjawfront.addChild(Rightlowerteeth4);
        this.setRotateAngle(Rightlowerteeth4, 0.0F, -0.0213F, 0.0F);


        this.Leftlowerlip3 = new ModelRenderer(this);
        this.Leftlowerlip3.setRotationPoint(-1.0F, 0.02F, -3.0F);
        this.Lowerjawmiddlefront.addChild(Leftlowerlip3);
        this.setRotateAngle(Leftlowerlip3, 0.0F, -0.1698F, 0.0F);


        this.Rightlowerlip3 = new ModelRenderer(this);
        this.Rightlowerlip3.setRotationPoint(1.0F, 0.02F, -3.0F);
        this.Lowerjawmiddlefront.addChild(Rightlowerlip3);
        this.setRotateAngle(Rightlowerlip3, 0.0F, 0.1698F, 0.0F);


        this.Rightlowerlip4 = new ModelRenderer(this);
        this.Rightlowerlip4.setRotationPoint(-0.98F, 0.02F, -3.0F);
        this.Lowerjawmiddlefront.addChild(Rightlowerlip4);
        this.setRotateAngle(Rightlowerlip4, 0.0F, -0.1698F, 0.0F);


        this.Lowerjawslope1 = new ModelRenderer(this);
        this.Lowerjawslope1.setRotationPoint(-0.01F, 2.0F, -3.0F);
        this.Lowerjawmiddlebase.addChild(Lowerjawslope1);
        this.setRotateAngle(Lowerjawslope1, -0.1698F, 0.0F, 0.0F);


        this.Lowerjawslope2 = new ModelRenderer(this);
        this.Lowerjawslope2.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.Lowerjawslope1.addChild(Lowerjawslope2);
        this.setRotateAngle(Lowerjawslope2, 0.0726F, 0.0F, 0.0F);


        this.Leftlowerteeth1 = new ModelRenderer(this);
        this.Leftlowerteeth1.setRotationPoint(-1.7F, 0.5F, -3.3F);
        this.Lowerjawmiddlebase.addChild(Leftlowerteeth1);
        this.setRotateAngle(Leftlowerteeth1, 0.0F, -0.3396F, 0.0F);


        this.Rightlowerteeth1 = new ModelRenderer(this);
        this.Rightlowerteeth1.setRotationPoint(1.7F, 0.5F, -3.3F);
        this.Lowerjawmiddlebase.addChild(Rightlowerteeth1);
        this.setRotateAngle(Rightlowerteeth1, 0.0F, 0.3396F, 0.0F);


        this.Rightlowerteeth3 = new ModelRenderer(this);
        this.Rightlowerteeth3.setRotationPoint(-1.68F, 0.5F, -3.3F);
        this.Lowerjawmiddlebase.addChild(Rightlowerteeth3);
        this.setRotateAngle(Rightlowerteeth3, 0.0F, -0.3396F, 0.0F);


        this.Leftlowerlip1 = new ModelRenderer(this);
        this.Leftlowerlip1.setRotationPoint(-3.5F, 0.02F, -2.2F);
        this.Lowerjawbase.addChild(Leftlowerlip1);
        this.setRotateAngle(Leftlowerlip1, 0.0F, -0.3821F, 0.0F);


        this.Leftlowerlip2 = new ModelRenderer(this);
        this.Leftlowerlip2.setRotationPoint(0.0F, -0.01F, -4.0F);
        this.Leftlowerlip1.addChild(Leftlowerlip2);
        this.setRotateAngle(Leftlowerlip2, 0.0F, 0.0424F, 0.0F);


        this.Rightlowerlip1 = new ModelRenderer(this);
        this.Rightlowerlip1.setRotationPoint(3.5F, 0.01F, -2.2F);
        this.Lowerjawbase.addChild(Rightlowerlip1);
        this.setRotateAngle(Rightlowerlip1, 0.0F, 0.3821F, 0.0F);


        this.Rightlowerlip2 = new ModelRenderer(this);
        this.Rightlowerlip2.setRotationPoint(0.0F, -0.01F, -4.0F);
        this.Rightlowerlip1.addChild(Rightlowerlip2);
        this.setRotateAngle(Rightlowerlip2, 0.0F, -0.0424F, 0.0F);


        this.Rightlowerlip5 = new ModelRenderer(this);
        this.Rightlowerlip5.setRotationPoint(-3.48F, 0.01F, -2.2F);
        this.Lowerjawbase.addChild(Rightlowerlip5);
        this.setRotateAngle(Rightlowerlip5, 0.0F, -0.3821F, 0.0F);


        this.Rightlowerlip6 = new ModelRenderer(this);
        this.Rightlowerlip6.setRotationPoint(0.0F, -0.01F, -4.0F);
        this.Rightlowerlip5.addChild(Rightlowerlip6);
        this.setRotateAngle(Rightlowerlip6, 0.0F, 0.0424F, 0.0F);


        this.Jawparting = new ModelRenderer(this);
        this.Jawparting.setRotationPoint(0.0F, 0.2F, -2.1F);
        this.Lowerjawbase.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.3396F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.3F, 2.6137F, -10.3536F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, -0.3091F, -1.1444F, 0.5561F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(1.9F, 0.5F, 0.0F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.3572F, -0.1545F, -0.8875F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.2F, 1.0F, 0.0F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 1.5601F, -0.1698F, 0.3183F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.1F, 2.6137F, -10.3536F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.3415F, 1.1857F, -0.5915F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-1.9F, 0.5F, 0.0F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.1236F, 0.1183F, 1.167F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.2F, 1.0F, 0.0F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 1.4729F, 0.1698F, -0.3183F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.3131F, 3.1123F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.1964F, -0.5185F, -0.0602F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 42, 11, -0.5F, 0.4103F, -0.1232F, 1, 1, 7, -0.2F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.0227F, 6.1004F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.248F, -0.3F, -0.0514F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 25, 35, -0.5F, 0.4F, 0.0F, 1, 1, 8, -0.2F, false));

        this.Tailmiddle = new ModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, -0.1F, 7.3F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.0694F, -0.3483F, -0.0464F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 30, 13, -0.5F, 0.4976F, 0.0764F, 1, 1, 9, -0.2F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.2994F, 8.3191F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, -0.2327F, -0.462F, 0.1718F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 36, 37, -0.5F, 0.1992F, 0.0255F, 1, 1, 8, -0.2F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -0.0988F, 7.4618F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.2862F, -0.3653F, 0.1967F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 14, 42, -0.5F, 0.1982F, 0.0424F, 1, 1, 7, -0.2F, false));

        this.Tailfinend = new ModelRenderer(this);
        this.Tailfinend.setRotationPoint(0.0F, 1.5942F, 0.1358F);
        this.Tailend.addChild(Tailfinend);


        this.Tailfindorsal4 = new ModelRenderer(this);
        this.Tailfindorsal4.setRotationPoint(0.01F, 0.198F, 0.0637F);
        this.Tailmiddleend.addChild(Tailfindorsal4);
        this.setRotateAngle(Tailfindorsal4, -0.0848F, 0.0F, 0.0F);


        this.Tailfinventral4 = new ModelRenderer(this);
        this.Tailfinventral4.setRotationPoint(0.01F, 2.798F, 0.0637F);
        this.Tailmiddleend.addChild(Tailfinventral4);
        this.setRotateAngle(Tailfinventral4, 0.0848F, 0.0F, 0.0F);


        this.Tailfindorsal3 = new ModelRenderer(this);
        this.Tailfindorsal3.setRotationPoint(0.0F, 0.1974F, 0.0828F);
        this.Tailmiddle.addChild(Tailfindorsal3);
        this.setRotateAngle(Tailfindorsal3, -0.0213F, 0.0F, 0.0F);


        this.Tailfinventral3 = new ModelRenderer(this);
        this.Tailfinventral3.setRotationPoint(0.0F, 3.5974F, 0.0828F);
        this.Tailmiddle.addChild(Tailfinventral3);
        this.setRotateAngle(Tailfinventral3, 0.0637F, 0.0F, 0.0F);


        this.Tailfindorsal2 = new ModelRenderer(this);
        this.Tailfindorsal2.setRotationPoint(-0.01F, -0.6F, 0.0F);
        this.Tailmiddlebase.addChild(Tailfindorsal2);
        this.setRotateAngle(Tailfindorsal2, 0.0213F, 0.0F, 0.0F);


        this.Tailfinventral2 = new ModelRenderer(this);
        this.Tailfinventral2.setRotationPoint(0.01F, 3.2F, 0.0F);
        this.Tailmiddlebase.addChild(Tailfinventral2);
        this.setRotateAngle(Tailfinventral2, -0.0213F, 0.0F, 0.0F);


        this.Tailfindorsal1 = new ModelRenderer(this);
        this.Tailfindorsal1.setRotationPoint(0.0F, 0.9103F, 0.0768F);
        this.Tailbase.addChild(Tailfindorsal1);
        this.setRotateAngle(Tailfindorsal1, 0.2122F, 0.0F, 0.0F);


        this.Tailfinventral1 = new ModelRenderer(this);
        this.Tailfinventral1.setRotationPoint(0.0F, 4.2103F, 0.8768F);
        this.Tailbase.addChild(Tailfinventral1);
        this.setRotateAngle(Tailfinventral1, -0.1698F, 0.0F, 0.0F);


        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.5F, 2.6472F, 0.3891F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 2.4133F, -0.1035F, -1.6977F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.0F, 0.5F, -2.3F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, -0.7594F, 0.0F, 0.0F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 2.0F, 0.5F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 1.2123F, 0.4033F, 0.0213F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.5F, 2.6472F, 0.3891F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 2.6873F, 0.3946F, 1.1699F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.0F, 0.5F, -2.3F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, -0.8467F, 0.0F, 0.0F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 2.0F, 0.5F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 1.0378F, -0.4033F, -0.0213F);

    }

    public void renderAll(float f) {
        this.root.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
