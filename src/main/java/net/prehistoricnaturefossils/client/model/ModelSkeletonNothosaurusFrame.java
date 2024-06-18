package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonNothosaurusFrame extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Hips_r2;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Neckbase;
    private final ModelRenderer Neckmiddlebase;
    private final ModelRenderer Neckmiddlefront;
    private final ModelRenderer Neckfront;
    private final ModelRenderer Neckfront_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawmiddlebase;
    private final ModelRenderer Lowerjawmiddlefront;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerfrontteeth;
    private final ModelRenderer Rightlowerfrontteeth;
    private final ModelRenderer Leftlowerfrontteeth;
    private final ModelRenderer Rightlowerteeth;
    private final ModelRenderer Leftlowerteeth;
    private final ModelRenderer Lowerjawteethback;
    private final ModelRenderer Throat;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperjawmiddle;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Upperfrontteeth;
    private final ModelRenderer Rightupperfrontteeth;
    private final ModelRenderer Leftupperfrontteeth;
    private final ModelRenderer Rightupperfang;
    private final ModelRenderer Leftupperfang;
    private final ModelRenderer Rightuppermidteeth;
    private final ModelRenderer Leftuppermidteeth;
    private final ModelRenderer Nosebridge;
    private final ModelRenderer Upperbackteeth;
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
    private final ModelRenderer Tailmiddle_r1;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailmiddleend_r1;
    private final ModelRenderer Tailend;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;
    private final ModelRenderer Bellyflab;

    public ModelSkeletonNothosaurusFrame() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 16.4F, 1.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1736F, 0.0804F, 0.4293F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-0.1701F, -0.0714F, 14.897F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 0.8767F, 1.5027F, 0.8755F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 2, 17, 0.2F, 0.4F, -4.0F, 1, 1, 9, 0.0F, false));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(0.0F, -1.0775F, 5.4351F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, 0.0524F, 0.0F, 0.0F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 0, 15, -0.5F, 1.0F, -0.5F, 1, 1, 12, 0.0F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -1.3775F, 5.6351F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.0042F, -0.1279F, -0.0277F);


        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(1.024F, 0.0462F, -11.5478F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, -0.0349F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 0, 32, -1.524F, 0.8381F, -0.5227F, 1, 1, 12, 0.002F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.01F, -0.3158F, -11.6705F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.1535F, -0.1742F, -0.0112F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 62, 50, -0.5F, 1.132F, -5.9293F, 1, 1, 6, 0.0F, false));

        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 0.0617F, -10.8807F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0873F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 65, 69, -4.9F, 2.3083F, 2.9784F, 10, 1, 1, 0.004F, false));
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 61, 65, -0.5F, 1.5083F, -0.0216F, 1, 1, 5, 0.004F, false));

        this.Neckbase = new ModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, 0.67F, -10.5022F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.1508F, -0.1726F, 0.0261F);
        this.Neckbase.cubeList.add(new ModelBox(Neckbase, 52, 1, -0.5F, 0.9167F, -7.9806F, 1, 1, 8, 0.0F, false));

        this.Neckmiddlebase = new ModelRenderer(this);
        this.Neckmiddlebase.setRotationPoint(0.0F, -0.0833F, -6.9806F);
        this.Neckbase.addChild(Neckmiddlebase);
        this.setRotateAngle(Neckmiddlebase, -0.1362F, -0.1867F, -0.0766F);
        this.Neckmiddlebase.cubeList.add(new ModelBox(Neckmiddlebase, 34, 50, -0.5F, 1.1008F, -8.5255F, 1, 1, 9, 0.004F, false));

        this.Neckmiddlefront = new ModelRenderer(this);
        this.Neckmiddlefront.setRotationPoint(-0.01F, 0.0008F, -8.2255F);
        this.Neckmiddlebase.addChild(Neckmiddlefront);
        this.setRotateAngle(Neckmiddlefront, -0.3271F, -0.2567F, -0.0783F);
        this.Neckmiddlefront.cubeList.add(new ModelBox(Neckmiddlefront, 49, 54, -0.5F, 1.1014F, -7.4661F, 1, 1, 8, 0.0F, false));

        this.Neckfront = new ModelRenderer(this);
        this.Neckfront.setRotationPoint(0.0F, 0.1014F, -6.9661F);
        this.Neckmiddlefront.addChild(Neckfront);
        this.setRotateAngle(Neckfront, -0.1525F, -0.4101F, -0.1428F);


        this.Neckfront_r1 = new ModelRenderer(this);
        this.Neckfront_r1.setRotationPoint(0.0F, 1.4849F, -2.6569F);
        this.Neckfront.addChild(Neckfront_r1);
        this.setRotateAngle(Neckfront_r1, 0.0F, -0.0873F, 0.0F);
        this.Neckfront_r1.cubeList.add(new ModelBox(Neckfront_r1, 0, 64, -0.5F, -0.5F, -3.0F, 1, 1, 6, 0.003F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.4151F, -4.6569F);
        this.Neckfront.addChild(Head);
        this.setRotateAngle(Head, 0.1338F, -0.2148F, -0.0382F);


        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 1.021F, 0.0F, 0.0F);


        this.Lowerjawmiddlebase = new ModelRenderer(this);
        this.Lowerjawmiddlebase.setRotationPoint(0.0F, 1.0F, -6.0F);
        this.Lowerjawback.addChild(Lowerjawmiddlebase);
        this.setRotateAngle(Lowerjawmiddlebase, -0.0424F, 0.0F, 0.0F);


        this.Lowerjawmiddlefront = new ModelRenderer(this);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Lowerjawmiddlebase.addChild(Lowerjawmiddlefront);
        this.setRotateAngle(Lowerjawmiddlefront, -0.0213F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerjawmiddlefront.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.0213F, 0.0F, 0.0F);


        this.Lowerfrontteeth = new ModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, -0.8F, -4.0F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, 0.7854F, 0.0F, 0.0F);


        this.Rightlowerfrontteeth = new ModelRenderer(this);
        this.Rightlowerfrontteeth.setRotationPoint(1.4F, -0.7F, -1.8F);
        this.Lowerjawfront.addChild(Rightlowerfrontteeth);
        this.setRotateAngle(Rightlowerfrontteeth, 0.1911F, 0.0F, 0.4882F);


        this.Leftlowerfrontteeth = new ModelRenderer(this);
        this.Leftlowerfrontteeth.setRotationPoint(-1.4F, -0.7F, -1.8F);
        this.Lowerjawfront.addChild(Leftlowerfrontteeth);
        this.setRotateAngle(Leftlowerfrontteeth, 0.1911F, 0.0F, -0.4882F);


        this.Rightlowerteeth = new ModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(2.0F, -0.9F, -1.1F);
        this.Lowerjawmiddlefront.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, 0.1698F, 0.0F, 0.3396F);


        this.Leftlowerteeth = new ModelRenderer(this);
        this.Leftlowerteeth.setRotationPoint(-2.0F, -0.9F, -1.1F);
        this.Lowerjawmiddlefront.addChild(Leftlowerteeth);
        this.setRotateAngle(Leftlowerteeth, 0.1698F, 0.0F, -0.3396F);


        this.Lowerjawteethback = new ModelRenderer(this);
        this.Lowerjawteethback.setRotationPoint(0.0F, -0.9F, -4.9F);
        this.Lowerjawmiddlebase.addChild(Lowerjawteethback);
        this.setRotateAngle(Lowerjawteethback, -0.0637F, 0.0F, 0.0F);


        this.Throat = new ModelRenderer(this);
        this.Throat.setRotationPoint(-0.01F, 1.8F, 0.0F);
        this.Lowerjawback.addChild(Throat);
        this.setRotateAngle(Throat, -0.1253F, 0.0F, 0.0F);


        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, 1.5F, -6.0F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, -0.0424F, 0.0F, 0.0F);


        this.Upperjawmiddle = new ModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Upperjawback.addChild(Upperjawmiddle);
        this.setRotateAngle(Upperjawmiddle, -0.0213F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 0.0F, -1.93F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.0262F, 0.0F, 0.0F);


        this.Upperfrontteeth = new ModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, -0.6F, -4.2F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, -0.7854F, 0.0F, 0.0F);


        this.Rightupperfrontteeth = new ModelRenderer(this);
        this.Rightupperfrontteeth.setRotationPoint(1.4F, -0.2F, -2.5F);
        this.Upperjawfront.addChild(Rightupperfrontteeth);
        this.setRotateAngle(Rightupperfrontteeth, -0.1061F, 0.0F, -0.4882F);


        this.Leftupperfrontteeth = new ModelRenderer(this);
        this.Leftupperfrontteeth.setRotationPoint(-1.4F, -0.2F, -2.5F);
        this.Upperjawfront.addChild(Leftupperfrontteeth);
        this.setRotateAngle(Leftupperfrontteeth, -0.1061F, 0.0F, 0.4882F);


        this.Rightupperfang = new ModelRenderer(this);
        this.Rightupperfang.setRotationPoint(1.97F, -0.2F, -0.7F);
        this.Upperjawmiddle.addChild(Rightupperfang);
        this.setRotateAngle(Rightupperfang, -0.0848F, 0.0F, -0.2122F);


        this.Leftupperfang = new ModelRenderer(this);
        this.Leftupperfang.setRotationPoint(-1.97F, -0.2F, -0.7F);
        this.Upperjawmiddle.addChild(Leftupperfang);
        this.setRotateAngle(Leftupperfang, -0.0848F, 0.0F, 0.2122F);


        this.Rightuppermidteeth = new ModelRenderer(this);
        this.Rightuppermidteeth.setRotationPoint(2.0F, -0.1F, -1.5F);
        this.Upperjawmiddle.addChild(Rightuppermidteeth);
        this.setRotateAngle(Rightuppermidteeth, -0.1698F, 0.0F, -0.3609F);


        this.Leftuppermidteeth = new ModelRenderer(this);
        this.Leftuppermidteeth.setRotationPoint(-2.0F, -0.1F, -1.5F);
        this.Upperjawmiddle.addChild(Leftuppermidteeth);
        this.setRotateAngle(Leftuppermidteeth, -0.1698F, 0.0F, 0.3609F);


        this.Nosebridge = new ModelRenderer(this);
        this.Nosebridge.setRotationPoint(-0.01F, -2.8F, -5.0F);
        this.Upperjawback.addChild(Nosebridge);
        this.setRotateAngle(Nosebridge, 0.1698F, 0.0F, 0.0F);


        this.Upperbackteeth = new ModelRenderer(this);
        this.Upperbackteeth.setRotationPoint(-0.01F, -0.2F, -4.5F);
        this.Upperjawback.addChild(Upperbackteeth);
        this.setRotateAngle(Upperbackteeth, 0.0424F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.3F, 2.97F, -7.4022F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.1662F, -0.5936F, 0.5198F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(9.8188F, -0.2006F, 1.1021F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, 0.3384F, 0.3058F, -1.4427F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 5.7F, 0.0F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, -0.0783F, -0.0804F, 2.011F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.32F, 2.97F, -7.4022F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.0646F, 0.9315F, -0.3173F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-9.8188F, -0.2006F, 1.1021F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, 0.411F, -0.3457F, 1.0168F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 5.7F, 0.0F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, -0.0671F, 0.09F, -1.88F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -1.7775F, 16.8351F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.2981F, 0.2162F, 0.2634F);


        this.Tailbase_r1 = new ModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, 1.5999F, 3.0064F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, 0.0F, -0.0349F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 15, 58, -0.2F, -0.5F, -4.0F, 1, 1, 8, 0.002F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.0001F, 6.9064F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.192F, 0.1302F, 0.0136F);


        this.Tailmiddlebase_r1 = new ModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.0F, -0.0717F, -0.5737F);
        this.Tailmiddlebase.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, -0.0436F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 63, 35, -0.5F, 1.1F, 0.5F, 1, 1, 6, 0.0F, false));

        this.Tailmiddle = new ModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, 0.1283F, 5.8263F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.1328F, 0.2163F, 0.0287F);


        this.Tailmiddle_r1 = new ModelRenderer(this);
        this.Tailmiddle_r1.setRotationPoint(0.0F, 0.0551F, -1.0379F);
        this.Tailmiddle.addChild(Tailmiddle_r1);
        this.setRotateAngle(Tailmiddle_r1, -0.0873F, 0.0F, 0.0F);
        this.Tailmiddle_r1.cubeList.add(new ModelBox(Tailmiddle_r1, 28, 62, -0.5F, 1.0F, 1.0F, 1, 1, 7, 0.002F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.4551F, 6.8621F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, -0.0292F, -0.1745F, 0.0051F);


        this.Tailmiddleend_r1 = new ModelRenderer(this);
        this.Tailmiddleend_r1.setRotationPoint(0.0F, 1.7258F, 4.609F);
        this.Tailmiddleend.addChild(Tailmiddleend_r1);
        this.setRotateAngle(Tailmiddleend_r1, 0.0524F, 0.0F, 0.0F);
        this.Tailmiddleend_r1.cubeList.add(new ModelBox(Tailmiddleend_r1, 18, 46, -0.5F, -0.9F, -5.5F, 1, 1, 11, 0.0F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.0258F, 9.609F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.0787F, -0.4787F, 0.0363F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 16, 17, -0.5F, 0.4998F, 0.007F, 1, 1, 13, 0.002F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(4.1F, 0.6124F, 13.9533F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.0889F, -0.5903F, 0.1838F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(6.1503F, 0.1004F, -0.2235F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.5315F, 0.3667F, -1.3728F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(-0.6898F, 5.1568F, 0.2726F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.2139F, -0.1999F, 1.9006F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-4.1F, 0.6124F, 13.9533F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.0344F, 1.0587F, -0.8722F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-6.1503F, 0.1004F, -0.2235F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.707F, -0.2036F, 1.524F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.6898F, 5.1568F, 0.2726F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.1438F, 0.2546F, -1.5921F);


        this.Bellyflab = new ModelRenderer(this);
        this.Bellyflab.setRotationPoint(-0.01F, 3.8225F, 17.9351F);
        this.Hips.addChild(Bellyflab);
        this.setRotateAngle(Bellyflab, 0.1274F, 0.0F, 0.0F);

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
