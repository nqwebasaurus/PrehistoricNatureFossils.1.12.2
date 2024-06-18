package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPholiderpetonFrame extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Bodyfront_r2;
    private final ModelRenderer Shoulderslope;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawmidbase;
    private final ModelRenderer Lowerjawmidfront;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerjawslopefront;
    private final ModelRenderer Lowerfrontteeth;
    private final ModelRenderer Rightlowerteeth;
    private final ModelRenderer Leftlowerteeth;
    private final ModelRenderer Upperjawbase;
    private final ModelRenderer Upperjawmiddle;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Snoutfront;
    private final ModelRenderer Upperfrontteeth;
    private final ModelRenderer Snoutmiddle;
    private final ModelRenderer Rightupperteeth;
    private final ModelRenderer Leftupperteeth;
    private final ModelRenderer Snoutbase;
    private final ModelRenderer Righteye;
    private final ModelRenderer Lefteye;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailbase_r1;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailmiddlebase_r1;
    private final ModelRenderer Tailmiddle;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailend;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonPholiderpetonFrame() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(-1.0F, 17.0F, 0.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.0213F, 0.0F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-1.0F, -1.0194F, 6.9966F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.1484F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 10, 10, -3.9F, 2.9F, 10.8F, 8, 1, 1, -0.2F, false));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 10, 10, -0.5F, 0.8F, 10.8F, 1, 3, 1, -0.25F, false));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 0, -0.5F, 0.3F, -0.2F, 1, 1, 12, -0.2F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(-1.0F, -1.2194F, 7.9966F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0216F, -0.1745F, -0.0038F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 14, -0.5F, -0.2F, -21.0F, 1, 1, 11, -0.2F, false));

        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, -0.5F, -10.0F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, -0.0698F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 15, 23, -0.6F, 0.3F, -0.5F, 1, 1, 10, -0.2F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.3F, -20.0F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.022F, -0.2617F, -0.0057F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, -0.4F, -8.1F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0262F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 38, 23, -0.5F, 0.4F, 1.0F, 1, 3, 1, -0.25F, false));
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 38, 23, -4.5F, 3.0F, 1.0F, 10, 1, 1, -0.2F, false));
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 31, 16, -0.5F, 0.1F, 0.0F, 1, 1, 8, -0.2F, false));

        this.Bodyfront_r2 = new ModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(0.0F, -0.2F, -11.8F);
        this.Bodyfront.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, 0.096F, 0.0F, 0.0F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 0, 6, -0.5F, 0.275F, 0.1F, 1, 1, 4, -0.2F, false));

        this.Shoulderslope = new ModelRenderer(this);
        this.Shoulderslope.setRotationPoint(0.0F, -3.3F, 0.0F);
        this.Bodyfront.addChild(Shoulderslope);
        this.setRotateAngle(Shoulderslope, 0.1772F, 0.0F, 0.0F);


        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.5F, -11.0F);
        this.Bodyfront.addChild(Head);
        this.setRotateAngle(Head, -0.1923F, 0.3932F, -0.005F);


        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Head.addChild(Lowerjawback);


        this.Lowerjawmidbase = new ModelRenderer(this);
        this.Lowerjawmidbase.setRotationPoint(0.0F, -0.7381F, -0.9992F);
        this.Lowerjawback.addChild(Lowerjawmidbase);
        this.setRotateAngle(Lowerjawmidbase, 0.4489F, 0.0F, 0.0F);


        this.Lowerjawmidfront = new ModelRenderer(this);
        this.Lowerjawmidfront.setRotationPoint(0.0F, 0.1011F, -5.9323F);
        this.Lowerjawmidbase.addChild(Lowerjawmidfront);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.Lowerjawmidfront.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.0213F, 0.0F, 0.0F);


        this.Lowerjawslopefront = new ModelRenderer(this);
        this.Lowerjawslopefront.setRotationPoint(0.0F, 1.0F, 0.1F);
        this.Lowerjawfront.addChild(Lowerjawslopefront);
        this.setRotateAngle(Lowerjawslopefront, -0.3396F, 0.0F, 0.0F);


        this.Lowerfrontteeth = new ModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, -0.5F, -2.6F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);


        this.Rightlowerteeth = new ModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(2.45F, 0.5F, -1.0F);
        this.Lowerjawmidfront.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, 0.0F, 0.1911F, 0.0F);


        this.Leftlowerteeth = new ModelRenderer(this);
        this.Leftlowerteeth.setRotationPoint(-2.45F, 0.5F, -1.0F);
        this.Lowerjawmidfront.addChild(Leftlowerteeth);
        this.setRotateAngle(Leftlowerteeth, 0.0F, -0.1911F, 0.0F);


        this.Upperjawbase = new ModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.0213F, 0.0F, 0.0F);


        this.Upperjawmiddle = new ModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Upperjawbase.addChild(Upperjawmiddle);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.0213F, 0.0F, 0.0F);


        this.Snoutfront = new ModelRenderer(this);
        this.Snoutfront.setRotationPoint(0.0F, -2.02F, -0.1F);
        this.Upperjawfront.addChild(Snoutfront);
        this.setRotateAngle(Snoutfront, 0.2972F, 0.0F, 0.0F);


        this.Upperfrontteeth = new ModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, -0.5F, -2.7F);
        this.Upperjawfront.addChild(Upperfrontteeth);


        this.Snoutmiddle = new ModelRenderer(this);
        this.Snoutmiddle.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Upperjawmiddle.addChild(Snoutmiddle);
        this.setRotateAngle(Snoutmiddle, 0.4245F, 0.0F, 0.0F);


        this.Rightupperteeth = new ModelRenderer(this);
        this.Rightupperteeth.setRotationPoint(2.45F, 1.5F, -1.1F);
        this.Upperjawmiddle.addChild(Rightupperteeth);
        this.setRotateAngle(Rightupperteeth, 0.0F, 0.1911F, 0.0F);


        this.Leftupperteeth = new ModelRenderer(this);
        this.Leftupperteeth.setRotationPoint(-2.45F, 1.5F, -1.1F);
        this.Upperjawmiddle.addChild(Leftupperteeth);
        this.setRotateAngle(Leftupperteeth, 0.0F, -0.1911F, 0.0F);


        this.Snoutbase = new ModelRenderer(this);
        this.Snoutbase.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Upperjawbase.addChild(Snoutbase);
        this.setRotateAngle(Snoutbase, 0.3187F, 0.0F, 0.0F);


        this.Righteye = new ModelRenderer(this);
        this.Righteye.setRotationPoint(2.3293F, 0.4708F, -0.9565F);
        this.Upperjawbase.addChild(Righteye);
        this.setRotateAngle(Righteye, 0.3321F, -0.0529F, 0.3743F);


        this.Lefteye = new ModelRenderer(this);
        this.Lefteye.setRotationPoint(-2.3293F, 0.4708F, -0.9565F);
        this.Upperjawbase.addChild(Lefteye);
        this.setRotateAngle(Lefteye, 0.3321F, 0.0529F, -0.3743F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(3.5F, 4.0F, -7.5F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.1717F, -1.4481F, -0.3616F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(4.3678F, -0.0209F, -0.4818F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.3712F, -0.3035F, -1.1647F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.5F, 3.8F, 0.0F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 1.7783F, -0.1698F, 0.3183F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-3.5F, 4.0F, -7.5F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.96F, 1.2813F, 1.1676F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-4.3678F, -0.0209F, -0.4818F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.1137F, 0.2379F, 1.1815F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.5F, 3.8F, 0.0F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 1.6474F, 0.1698F, -0.3183F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(-1.0F, 0.7806F, 17.9966F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.0672F, 0.2612F, -0.0174F);


        this.Tailbase_r1 = new ModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, -0.2002F, 0.0192F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, -0.1222F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 15, 0, -0.5F, 0.4F, 0.0F, 1, 1, 10, -0.2F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 1.2998F, 9.0192F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.0349F, 0.0436F, 0.0015F);


        this.Tailmiddlebase_r1 = new ModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.Tailmiddlebase.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, -0.0698F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, -2, 25, -0.5F, 0.3F, -0.1F, 1, 1, 11, -0.2F, false));

        this.Tailmiddle = new ModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, 0.5F, 9.9F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.0F, -0.3054F, 0.0F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 28, 26, -0.5F, 0.3F, -0.1F, 1, 1, 9, -0.2F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.4F, 8.4F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.0406F, -0.3052F, -0.0122F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 29, 3, -0.5F, -0.1F, 0.3F, 1, 1, 9, -0.2F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -0.4F, 9.1F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.0481F, -0.4359F, -0.0203F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 13, 35, -0.5F, 0.3F, -0.2F, 1, 1, 8, -0.2F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.0F, 3.1593F, 15.9964F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 2.7787F, -0.1761F, -1.6876F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(-0.5697F, 0.0443F, -5.6829F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, -1.1085F, 0.0F, 0.0F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 3.5F, 0.5F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 0.8196F, 0.4033F, 0.1274F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-4.0F, 3.1593F, 15.9964F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 2.91F, 0.1328F, 1.694F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.5697F, 0.0443F, -5.6829F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, -0.8467F, 0.0F, 0.0F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 3.5F, 0.5F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 1.0792F, -0.3441F, -0.002F);

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
