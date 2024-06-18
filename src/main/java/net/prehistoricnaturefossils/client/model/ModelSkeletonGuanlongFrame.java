package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGuanlongFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Neckbase;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Neckmiddle;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Neckfront;
    private final ModelRenderer frame1_r1;
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
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Lefthand;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Righthand;
    private final ModelRenderer Belly;
    private final ModelRenderer Tailbase;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer frame9_r1;
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

    public ModelSkeletonGuanlongFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -19.83F, -0.25F, 1, 20, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, -1, 1, -3.0F, -19.87F, -0.251F, 6, 1, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -1.02F, -22.9F, -15.45F, 1, 23, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(0.5F, -18.75F, -15.45F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, 0.0349F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -3, 1, -5.0F, -1.0F, -0.01F, 8, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 3.8F, -0.5F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.2806F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 32, -0.5F, 0.3059F, -3.7444F, 1, 1, 8, -0.1F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.2941F, -3.5944F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0625F, 0.0435F, 0.0027F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 11, 31, -0.5F, 0.5816F, -4.7459F, 1, 1, 5, -0.1F, false));

        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 1.2816F, -8.6459F);
        this.Bodymiddle.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.0698F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 47, 30, -0.49F, -0.4375F, 0.5F, 1, 1, 4, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.1816F, -7.6459F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0625F, 0.0F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 1.2034F, -3.9364F);
        this.Bodyfront.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.0175F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 45, 8, -0.5F, -0.6832F, -0.0048F, 1, 1, 4, -0.1F, false));

        this.Neckbase = new ModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, -0.0966F, -3.6864F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.8345F, -0.1524F, 0.0387F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 1.1269F, -1.3988F);
        this.Neckbase.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.1484F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 29, 47, -0.5F, -0.5F, -2.5F, 1, 1, 5, -0.1F, false));

        this.Neckmiddle = new ModelRenderer(this);
        this.Neckmiddle.setRotationPoint(0.0F, -0.1761F, -2.7929F);
        this.Neckbase.addChild(Neckmiddle);
        this.setRotateAngle(Neckmiddle, -0.7951F, -0.0006F, -0.0617F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.5F, 2.1364F, 0.8439F);
        this.Neckmiddle.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.0349F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 14, 40, -1.0F, -0.9116F, -4.8856F, 1, 1, 5, -0.1F, false));

        this.Neckfront = new ModelRenderer(this);
        this.Neckfront.setRotationPoint(-0.01F, 0.4364F, -4.8061F);
        this.Neckmiddle.addChild(Neckfront);
        this.setRotateAngle(Neckfront, 0.5365F, 0.1361F, -0.2243F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 0.6485F, -2.1257F);
        this.Neckfront.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.1758F, -0.1203F, 0.0213F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 51, 36, -0.49F, -0.2F, -0.3F, 1, 1, 3, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.2485F, -2.7757F);
        this.Neckfront.addChild(Head);
        this.setRotateAngle(Head, 0.8439F, -0.0326F, 0.029F);


        this.Upperjawbase = new ModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, -1.342F, -2.576F);
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
        this.Lowerjawback.setRotationPoint(0.0F, 0.888F, 0.324F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.7418F, 0.0F, 0.0F);


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


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(3.8F, 4.0762F, -2.8058F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.3651F, 0.3796F, -0.4002F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.0336F, 4.1797F, -0.0221F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -1.2961F, -0.6205F, 0.4906F);


        this.Lefthand = new ModelRenderer(this);
        this.Lefthand.setRotationPoint(0.4F, 3.138F, -0.176F);
        this.Leftlowerarm.addChild(Lefthand);
        this.setRotateAngle(Lefthand, 0.2557F, -0.0353F, 0.5714F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(-3.8F, 4.0762F, -2.8058F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.1303F, -0.6096F, 0.5953F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.0336F, 4.1797F, -0.0221F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -1.2093F, 0.7031F, -0.475F);


        this.Righthand = new ModelRenderer(this);
        this.Righthand.setRotationPoint(-0.4F, 3.138F, -0.176F);
        this.Rightlowerarm.addChild(Righthand);
        this.setRotateAngle(Righthand, 0.2557F, 0.0353F, -0.5714F);


        this.Belly = new ModelRenderer(this);
        this.Belly.setRotationPoint(-0.01F, 5.9816F, -8.1459F);
        this.Bodymiddle.addChild(Belly);
        this.setRotateAngle(Belly, -0.2122F, 0.0F, 0.0F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.2941F, 4.1056F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.066F, -0.0436F, 0.0009F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, 1.1086F, -0.4063F);
        this.Tailbase.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.0436F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 17, 28, -0.5F, -0.5F, -0.1F, 1, 1, 10, -0.1F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.3914F, 8.7937F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.2339F, -0.0706F, -0.0468F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.0F, 1.1011F, -0.2288F);
        this.Tailmiddlebase.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, 0.0524F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 0, 17, -0.5F, -0.5F, 0.0F, 1, 1, 12, -0.1F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(-0.49F, -0.7989F, 12.0212F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.3024F, 0.0866F, 0.0111F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.0F, 1.1086F, -0.8824F);
        this.Tailmiddleend.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, -0.096F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 17, -1, 0.0F, -0.5F, 0.0F, 1, 1, 13, -0.1F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(-0.01F, 1.2186F, 11.5676F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.0222F, 0.2169F, -0.0235F);


        this.frame11_r1 = new ModelRenderer(this);
        this.frame11_r1.setRotationPoint(0.0F, 1.0056F, 0.1941F);
        this.Tailend.addChild(frame11_r1);
        this.setRotateAngle(frame11_r1, -0.3054F, 0.0F, 0.0F);
        this.frame11_r1.cubeList.add(new ModelBox(frame11_r1, 0, 0, 0.0F, -0.4F, -0.3F, 1, 1, 15, -0.1F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.9F, 0.6941F, 0.9944F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.6473F, 0.0F, 0.0F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(-0.1F, 7.959F, 1.1584F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 1.7169F, -0.0872F, 0.0025F);


        this.Rightankle = new ModelRenderer(this);
        this.Rightankle.setRotationPoint(0.01F, 9.7F, 0.6F);
        this.Rightshin.addChild(Rightankle);
        this.setRotateAngle(Rightankle, -0.6709F, 0.0453F, -0.1148F);


        this.Rightfoot = new ModelRenderer(this);
        this.Rightfoot.setRotationPoint(-0.1F, 3.6F, 0.2F);
        this.Rightankle.addChild(Rightfoot);
        this.setRotateAngle(Rightfoot, 0.452F, -0.0785F, -0.0381F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.9F, 0.6941F, 0.9944F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.2537F, -0.022F, -0.0845F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.1F, 7.959F, 1.1584F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 1.1498F, 0.0F, 0.0F);


        this.Leftankle = new ModelRenderer(this);
        this.Leftankle.setRotationPoint(-0.01F, 9.7F, 0.6F);
        this.Leftshin.addChild(Leftankle);
        this.setRotateAngle(Leftankle, -0.807F, 0.1233F, -0.0024F);


        this.Leftfoot = new ModelRenderer(this);
        this.Leftfoot.setRotationPoint(0.1F, 3.6F, 0.2F);
        this.Leftankle.addChild(Leftfoot);
        this.setRotateAngle(Leftfoot, 0.1887F, 0.0F, 0.0F);

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
