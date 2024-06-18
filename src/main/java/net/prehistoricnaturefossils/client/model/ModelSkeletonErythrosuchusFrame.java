package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonErythrosuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperlipback;
    private final ModelRenderer UpperteethbackR;
    private final ModelRenderer Upperjawmiddle;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Upperfrontteeth;
    private final ModelRenderer Snoutslope;
    private final ModelRenderer Upperlipfront;
    private final ModelRenderer UpperteethmidfrontR;
    private final ModelRenderer UpperteethmiddleR;
    private final ModelRenderer UpperteethmiddleR2;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawmiddleback;
    private final ModelRenderer Lowerjawmiddlefront;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerteethfront;
    private final ModelRenderer Lowerteethback;
    private final ModelRenderer Lowerjawslope;
    private final ModelRenderer Jawparting;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Tailbase;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailmiddle;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer Tailend;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Rightankle;
    private final ModelRenderer Righttoes;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Leftankle;
    private final ModelRenderer Lefttoes;

    public ModelSkeletonErythrosuchusFrame() {
        this.textureWidth = 100;
        this.textureHeight = 98;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.51F, -17.9F, 11.6F, 1, 18, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -3.02F, -17.9F, -11.0F, 1, 18, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-2.7F, -10.0F, -11.0F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, -0.0038F, 0.0872F, -0.0438F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -3, 1, -5.0F, -1.0F, 0.0F, 10, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -15.0F, 11.6F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, -0.0436F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -2, 1, -4.0F, -1.0F, 0.0F, 8, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(1.0F, 5.4F, 0.8F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.2972F, 0.0F, 0.0F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(-1.5F, -2.6763F, 7.4945F);
        this.Hips.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.0349F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 20, 17, 0.0F, 0.0715F, -0.8309F, 1, 1, 10, -0.1F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(-1.0F, -3.7763F, 7.1945F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.2398F, 0.1272F, 0.031F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-0.5F, 2.6333F, -13.4687F);
        this.Bodymiddle.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.0524F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 0, 17, 0.0F, -0.8F, -0.3F, 1, 1, 14, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.7333F, -13.0687F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.2132F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 12, 58, -0.49F, 0.9884F, -5.1641F, 1, 1, 5, -0.1F, false));

        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.5F, 3.1592F, -11.6427F);
        this.Bodyfront.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.1047F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 49, 48, 0.0F, -1.4419F, -0.0628F, 1, 1, 7, -0.1F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.4302F, -11.6053F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.0006F, 0.3491F, 0.0F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(-0.5F, 2.7284F, -2.7373F);
        this.Neck.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.0524F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 23, 61, 0.0F, -1.5991F, -2.0606F, 1, 1, 5, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.0527F, -4.0883F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.21F, 0.0F, 0.0F);


        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, -3.4677F, -5.0934F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.4245F, 0.0F, 0.0F);


        this.Upperlipback = new ModelRenderer(this);
        this.Upperlipback.setRotationPoint(-0.01F, 5.65F, -5.9F);
        this.Upperjawback.addChild(Upperlipback);
        this.setRotateAngle(Upperlipback, -0.2388F, 0.0F, 0.0F);


        this.UpperteethbackR = new ModelRenderer(this);
        this.UpperteethbackR.setRotationPoint(3.05F, -0.5F, 0.4F);
        this.Upperlipback.addChild(UpperteethbackR);
        this.setRotateAngle(UpperteethbackR, 0.1485F, 0.1061F, 0.0F);


        this.Upperjawmiddle = new ModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.01F, 5.73F, -5.6F);
        this.Upperjawback.addChild(Upperjawmiddle);
        this.setRotateAngle(Upperjawmiddle, -0.2546F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, -5.0F, -4.0F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.4245F, 0.0F, 0.0F);


        this.Upperfrontteeth = new ModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, 2.0F, -4.8F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, -0.1698F, 0.0F, 0.0F);


        this.Snoutslope = new ModelRenderer(this);
        this.Snoutslope.setRotationPoint(0.0F, -5.0F, -4.0F);
        this.Upperjawmiddle.addChild(Snoutslope);
        this.setRotateAngle(Snoutslope, 0.2175F, 0.0F, 0.0F);


        this.Upperlipfront = new ModelRenderer(this);
        this.Upperlipfront.setRotationPoint(-0.01F, 0.0F, -4.0F);
        this.Upperjawmiddle.addChild(Upperlipfront);
        this.setRotateAngle(Upperlipfront, -0.1911F, 0.0F, 0.0F);


        this.UpperteethmidfrontR = new ModelRenderer(this);
        this.UpperteethmidfrontR.setRotationPoint(2.05F, -0.5F, -3.2F);
        this.Upperlipfront.addChild(UpperteethmidfrontR);
        this.setRotateAngle(UpperteethmidfrontR, 0.2972F, 0.1274F, 0.0F);


        this.UpperteethmiddleR = new ModelRenderer(this);
        this.UpperteethmiddleR.setRotationPoint(2.6F, -0.9F, -4.0F);
        this.Upperjawmiddle.addChild(UpperteethmiddleR);
        this.setRotateAngle(UpperteethmiddleR, 0.0848F, 0.0848F, 0.0F);


        this.UpperteethmiddleR2 = new ModelRenderer(this);
        this.UpperteethmiddleR2.setRotationPoint(-2.62F, -0.9F, -4.0F);
        this.Upperjawmiddle.addChild(UpperteethmiddleR2);
        this.setRotateAngle(UpperteethmiddleR2, 0.0848F, -0.0848F, 0.0F);


        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 4.3323F, 0.4066F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.1309F, 0.0F, 0.0F);


        this.Lowerjawmiddleback = new ModelRenderer(this);
        this.Lowerjawmiddleback.setRotationPoint(0.0F, -0.6259F, -5.3665F);
        this.Lowerjawback.addChild(Lowerjawmiddleback);
        this.setRotateAngle(Lowerjawmiddleback, 0.1698F, 0.0F, 0.0F);


        this.Lowerjawmiddlefront = new ModelRenderer(this);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 3.0F, -3.0F);
        this.Lowerjawmiddleback.addChild(Lowerjawmiddlefront);
        this.setRotateAngle(Lowerjawmiddlefront, -0.1061F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, -3.0F, -4.0F);
        this.Lowerjawmiddlefront.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.1485F, 0.0F, 0.0F);


        this.Lowerteethfront = new ModelRenderer(this);
        this.Lowerteethfront.setRotationPoint(-0.01F, 0.0F, -2.8F);
        this.Lowerjawfront.addChild(Lowerteethfront);
        this.setRotateAngle(Lowerteethfront, -0.0424F, 0.0F, 0.0F);


        this.Lowerteethback = new ModelRenderer(this);
        this.Lowerteethback.setRotationPoint(0.0F, -3.0F, -3.6F);
        this.Lowerjawmiddlefront.addChild(Lowerteethback);
        this.setRotateAngle(Lowerteethback, -0.0637F, 0.0F, 0.0F);


        this.Lowerjawslope = new ModelRenderer(this);
        this.Lowerjawslope.setRotationPoint(0.01F, 3.3741F, -5.3665F);
        this.Lowerjawback.addChild(Lowerjawslope);
        this.setRotateAngle(Lowerjawslope, -0.1114F, 0.0F, 0.0F);


        this.Jawparting = new ModelRenderer(this);
        this.Jawparting.setRotationPoint(0.01F, -0.5259F, -3.8665F);
        this.Lowerjawback.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.2759F, 0.0F, 0.0F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(4.8F, 8.4534F, -8.5172F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.8463F, -0.0751F, -0.5434F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.3194F, 6.5283F, 1.7249F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.3082F, 0.2814F, 0.4365F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(-0.4875F, 6.3504F, -2.2012F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, -0.3729F, 0.0152F, 0.0623F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(-4.8F, 8.4534F, -8.5172F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, -0.0596F, 0.0836F, 0.6744F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.3194F, 6.5283F, 1.7249F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.6572F, -0.2814F, -0.4365F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.4875F, 6.3504F, -2.2012F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.5897F, 0.4973F, 0.0809F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(-1.0F, -3.8763F, 16.2945F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.1482F, 0.1307F, -0.0079F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(-0.5F, 1.8023F, -0.0929F);
        this.Tailbase.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.0524F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 35, 41, 0.0F, -0.8F, 0.0F, 1, 1, 8, -0.1F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.1023F, 7.4071F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, -0.0756F, 0.0868F, 0.0086F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 14, 49, -0.5F, 1.2847F, -0.5964F, 1, 1, 6, -0.1F, false));

        this.Tailmiddle = new ModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, -0.0986F, 4.6755F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.0364F, 0.1308F, 0.0047F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 25, 52, -0.5F, 1.3876F, 0.1106F, 1, 1, 6, -0.1F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.0124F, 5.7106F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.2432F, 0.0F, 0.0F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.0F, 1.8586F, -0.4063F);
        this.Tailmiddleend.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, 0.1309F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 62, 42, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.1F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.2086F, 4.9937F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.419F, 0.0F, 0.0F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 0, 63, -0.5F, 0.5055F, -0.126F, 1, 1, 6, -0.1F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.5F, -0.0163F, 12.6945F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.2343F, 0.1472F, -0.2173F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.0F, 9.08F, -1.1228F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.8876F, -0.2295F, 0.167F);


        this.Rightankle = new ModelRenderer(this);
        this.Rightankle.setRotationPoint(0.0035F, 6.9631F, 1.1114F);
        this.Rightshin.addChild(Rightankle);
        this.setRotateAngle(Rightankle, -0.3704F, 0.0F, 0.0F);


        this.Righttoes = new ModelRenderer(this);
        this.Righttoes.setRotationPoint(0.01F, 0.49F, -2.8F);
        this.Rightankle.addChild(Righttoes);
        this.setRotateAngle(Righttoes, 0.0F, 0.0F, 0.0F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-4.5F, -0.0163F, 12.6945F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.4639F, -0.1472F, 0.2173F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.0F, 9.08F, -1.1228F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 1.193F, 0.2295F, -0.167F);


        this.Leftankle = new ModelRenderer(this);
        this.Leftankle.setRotationPoint(-0.0035F, 6.9631F, 1.1114F);
        this.Leftshin.addChild(Leftankle);
        this.setRotateAngle(Leftankle, -0.3704F, 0.0F, 0.0F);


        this.Lefttoes = new ModelRenderer(this);
        this.Lefttoes.setRotationPoint(-0.01F, 0.49F, -2.8F);
        this.Leftankle.addChild(Lefttoes);
        this.setRotateAngle(Lefttoes, -0.3052F, -0.0131F, -0.0416F);

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
