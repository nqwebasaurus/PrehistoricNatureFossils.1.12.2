package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLiliensternusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer Neckbase;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Neckmiddle;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Neckend;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjawbase;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Rightlowerteeth;
    private final ModelRenderer Lowerjawunderside;
    private final ModelRenderer Upperjawbase;
    private final ModelRenderer Upperjawend;
    private final ModelRenderer Snout;
    private final ModelRenderer Rightupperfrontteeth;
    private final ModelRenderer Leftupperfrontteeth;
    private final ModelRenderer Headslope;
    private final ModelRenderer Rightcrestbase;
    private final ModelRenderer Rightcrestfront;
    private final ModelRenderer Rightcrestfront2;
    private final ModelRenderer Leftcrestbase;
    private final ModelRenderer Leftcrestfront;
    private final ModelRenderer Leftcrestfront2;
    private final ModelRenderer Headslope2;
    private final ModelRenderer Rightupperbackteeth;
    private final ModelRenderer Leftupperbackteeth;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Righthand;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Lefthand;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer Tailend;
    private final ModelRenderer frame11_r1;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Rightankle;
    private final ModelRenderer Rightfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Leftankle;
    private final ModelRenderer Leftfoot;

    public ModelSkeletonLiliensternusFrame() {
        this.textureWidth = 85;
        this.textureHeight = 85;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.49F, -23.8F, 0.75F, 1, 24, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -32.9F, -20.75F, 1, 33, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, -2, 1, -4.0F, -28.0F, -20.76F, 8, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -21.5F, 1.25F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, -0.0436F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -2, 1, -4.0F, -0.5F, -0.5F, 8, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -1.1F, 1.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.3466F, 0.0F, 0.0F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(-0.5F, 2.0989F, -5.9746F);
        this.Hips.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.0175F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 1, 40, 0.0F, -1.1F, 0.0F, 1, 1, 12, -0.1F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(-0.01F, -0.0011F, -5.4746F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.0248F, 0.0F, 0.0F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(-0.49F, 1.2407F, -8.784F);
        this.Bodymiddle.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.0349F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 30, 43, 0.01F, -0.5F, -0.1F, 1, 1, 9, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.3593F, -8.234F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.1321F, 0.0F, 0.0F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(-0.49F, 2.2172F, -8.5876F);
        this.Bodyfront.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.0524F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 45, 0, -0.01F, -0.7F, -0.2F, 1, 1, 9, -0.1F, false));

        this.Neckbase = new ModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, 0.4172F, -8.6876F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.6014F, 0.0F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-0.49F, 2.7002F, -6.7514F);
        this.Neckbase.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.096F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 21, 54, 0.005F, -1.0825F, -0.1002F, 1, 1, 8, -0.1F, false));

        this.Neckmiddle = new ModelRenderer(this);
        this.Neckmiddle.setRotationPoint(0.0F, 0.2002F, -6.3514F);
        this.Neckbase.addChild(Neckmiddle);
        this.setRotateAngle(Neckmiddle, -0.598F, -0.1963F, -0.1295F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(-0.49F, 2.5021F, -6.3621F);
        this.Neckmiddle.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.035F, -0.0523F, -0.0018F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 0, 55, -0.01F, -1.0F, -0.5F, 1, 1, 8, -0.1F, false));

        this.Neckend = new ModelRenderer(this);
        this.Neckend.setRotationPoint(0.01F, 0.3021F, -7.3621F);
        this.Neckmiddle.addChild(Neckend);
        this.setRotateAngle(Neckend, 0.4946F, 0.1013F, -0.446F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(-0.5F, 2.0064F, -3.4907F);
        this.Neckend.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.1658F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 59, 0, 0.0F, -1.6587F, -3.6963F, 1, 1, 4, -0.1F, false));

        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.5F, 1.0064F, -3.7407F);
        this.Neckend.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.1876F, -0.2145F, 0.0404F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 34, 55, 0.0F, -0.6548F, -0.1438F, 1, 1, 4, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.3436F, -6.2407F);
        this.Neckend.addChild(Head);
        this.setRotateAngle(Head, 1.1301F, 0.0194F, -0.261F);


        this.Lowerjawbase = new ModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 2.2642F, 0.314F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 0.4363F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.01F, 1.0F, -3.9F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.1061F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, -1.0F, -3.5F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.1061F, 0.0F, 0.0F);


        this.Rightlowerteeth = new ModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(0.83F, -0.2F, -1.5F);
        this.Lowerjawmiddle.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, -0.1061F, 0.1344F, 0.0F);


        this.Lowerjawunderside = new ModelRenderer(this);
        this.Lowerjawunderside.setRotationPoint(-0.01F, 1.0F, 0.0F);
        this.Lowerjawmiddle.addChild(Lowerjawunderside);
        this.setRotateAngle(Lowerjawunderside, -0.2546F, 0.0F, 0.0F);


        this.Upperjawbase = new ModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, 1.2342F, -3.416F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.1061F, 0.0F, 0.0F);


        this.Upperjawend = new ModelRenderer(this);
        this.Upperjawend.setRotationPoint(0.0F, 0.55F, -4.5F);
        this.Upperjawbase.addChild(Upperjawend);
        this.setRotateAngle(Upperjawend, 0.0213F, 0.0F, 0.0F);


        this.Snout = new ModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, -2.4F, -0.4F);
        this.Upperjawend.addChild(Snout);
        this.setRotateAngle(Snout, 0.2122F, 0.0F, 0.0F);


        this.Rightupperfrontteeth = new ModelRenderer(this);
        this.Rightupperfrontteeth.setRotationPoint(0.9F, -0.8F, 0.2F);
        this.Upperjawend.addChild(Rightupperfrontteeth);
        this.setRotateAngle(Rightupperfrontteeth, 0.1485F, 0.2335F, 0.1485F);


        this.Leftupperfrontteeth = new ModelRenderer(this);
        this.Leftupperfrontteeth.setRotationPoint(-0.9F, -0.8F, 0.2F);
        this.Upperjawend.addChild(Leftupperfrontteeth);
        this.setRotateAngle(Leftupperfrontteeth, 0.1485F, -0.2335F, -0.1485F);


        this.Headslope = new ModelRenderer(this);
        this.Headslope.setRotationPoint(0.0F, -3.05F, 0.1F);
        this.Upperjawbase.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.2335F, 0.0F, 0.0F);


        this.Rightcrestbase = new ModelRenderer(this);
        this.Rightcrestbase.setRotationPoint(0.8F, -0.4F, -0.2F);
        this.Headslope.addChild(Rightcrestbase);
        this.setRotateAngle(Rightcrestbase, -0.3821F, 0.1485F, 0.2546F);


        this.Rightcrestfront = new ModelRenderer(this);
        this.Rightcrestfront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Rightcrestbase.addChild(Rightcrestfront);
        this.setRotateAngle(Rightcrestfront, 0.6117F, -0.0424F, -0.0213F);


        this.Rightcrestfront2 = new ModelRenderer(this);
        this.Rightcrestfront2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Rightcrestbase.addChild(Rightcrestfront2);
        this.setRotateAngle(Rightcrestfront2, 0.6117F, -0.0424F, -0.0213F);


        this.Leftcrestbase = new ModelRenderer(this);
        this.Leftcrestbase.setRotationPoint(-0.8F, -0.4F, -0.2F);
        this.Headslope.addChild(Leftcrestbase);
        this.setRotateAngle(Leftcrestbase, -0.3821F, -0.1485F, -0.2546F);


        this.Leftcrestfront = new ModelRenderer(this);
        this.Leftcrestfront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Leftcrestbase.addChild(Leftcrestfront);
        this.setRotateAngle(Leftcrestfront, 0.6117F, 0.0424F, 0.0213F);


        this.Leftcrestfront2 = new ModelRenderer(this);
        this.Leftcrestfront2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Leftcrestbase.addChild(Leftcrestfront2);
        this.setRotateAngle(Leftcrestfront2, 0.6117F, 0.0424F, 0.0213F);


        this.Headslope2 = new ModelRenderer(this);
        this.Headslope2.setRotationPoint(0.0F, -3.05F, 0.1F);
        this.Upperjawbase.addChild(Headslope2);
        this.setRotateAngle(Headslope2, 0.2335F, 0.0F, 0.0F);


        this.Rightupperbackteeth = new ModelRenderer(this);
        this.Rightupperbackteeth.setRotationPoint(1.15F, 0.75F, -4.6F);
        this.Upperjawbase.addChild(Rightupperbackteeth);
        this.setRotateAngle(Rightupperbackteeth, 0.0873F, 0.0637F, 0.0F);


        this.Leftupperbackteeth = new ModelRenderer(this);
        this.Leftupperbackteeth.setRotationPoint(-1.15F, 0.75F, -4.6F);
        this.Upperjawbase.addChild(Leftupperbackteeth);
        this.setRotateAngle(Leftupperbackteeth, 0.0873F, -0.0637F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.45F, 6.2172F, -5.5876F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.7535F, -0.1807F, -0.6201F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.51F, 4.5F, 0.4F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.9976F, 0.0F, 0.0F);


        this.Righthand = new ModelRenderer(this);
        this.Righthand.setRotationPoint(0.7F, 4.2F, -0.5F);
        this.Rightlowerarm.addChild(Righthand);
        this.setRotateAngle(Righthand, 0.1485F, 0.0F, 0.4458F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.43F, 6.2172F, -5.5876F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.5954F, 0.3586F, 0.7062F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.51F, 4.5F, 0.4F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.9976F, 0.0F, 0.0F);


        this.Lefthand = new ModelRenderer(this);
        this.Lefthand.setRotationPoint(-0.7F, 4.2F, -0.5F);
        this.Leftlowerarm.addChild(Lefthand);
        this.setRotateAngle(Lefthand, 0.1485F, 0.0F, -0.4458F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.1011F, 5.0254F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.1971F, -0.0428F, -0.0085F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 26, 26, -0.5F, 1.3F, 0.0F, 1, 1, 14, -0.1F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.3F, 13.0F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.3099F, -0.2081F, -0.0661F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 24, 4, -0.5F, 1.0F, 0.0F, 1, 1, 16, -0.1F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.4F, 15.7F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.1962F, -0.1284F, -0.0255F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.0F, 1.8809F, -0.4994F);
        this.Tailmiddleend.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, 0.0262F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 18, -0.1F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -0.0191F, 17.3006F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.1065F, -0.0868F, 0.0093F);


        this.frame11_r1 = new ModelRenderer(this);
        this.frame11_r1.setRotationPoint(0.0F, 1.41F, -0.0888F);
        this.Tailend.addChild(frame11_r1);
        this.setRotateAngle(frame11_r1, 0.0209F, 0.0F, 0.0F);
        this.frame11_r1.cubeList.add(new ModelBox(frame11_r1, 0, 20, -0.5F, -0.5F, 0.0F, 1, 1, 18, -0.1F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.5F, 2.7989F, 1.0254F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.0354F, 0.0F, 0.0F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(-0.1F, 8.9929F, -0.5562F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.7217F, 0.0F, 0.0F);


        this.Rightankle = new ModelRenderer(this);
        this.Rightankle.setRotationPoint(-0.01F, 8.3393F, 1.7493F);
        this.Rightshin.addChild(Rightankle);
        this.setRotateAngle(Rightankle, -0.5943F, 0.0F, 0.0F);


        this.Rightfoot = new ModelRenderer(this);
        this.Rightfoot.setRotationPoint(0.0F, 5.3F, -1.2F);
        this.Rightankle.addChild(Rightfoot);
        this.setRotateAngle(Rightfoot, 0.2546F, 0.0F, 0.0F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.5F, 2.7989F, 1.0254F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.6463F, 0.0F, 0.0F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.1F, 8.9929F, -0.5562F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 1.5507F, 0.0F, 0.0F);


        this.Leftankle = new ModelRenderer(this);
        this.Leftankle.setRotationPoint(0.01F, 8.3393F, 1.7493F);
        this.Leftshin.addChild(Leftankle);
        this.setRotateAngle(Leftankle, -1.4233F, 0.0F, 0.0F);


        this.Leftfoot = new ModelRenderer(this);
        this.Leftfoot.setRotationPoint(0.0F, 5.3F, -1.2F);
        this.Leftankle.addChild(Leftfoot);
        this.setRotateAngle(Leftfoot, 2.3054F, 0.0F, 0.0F);

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
