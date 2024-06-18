package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLotosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Belly;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperjawmiddle;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Faceslopefront;
    private final ModelRenderer Faceslopemiddle;
    private final ModelRenderer Lefteye;
    private final ModelRenderer Righteye;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawmiddleback;
    private final ModelRenderer Lowerjawmiddlefront;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerjawslopeback;
    private final ModelRenderer Lowerjawslopefront;
    private final ModelRenderer Neckhump;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Bellyhump;
    private final ModelRenderer Tailbase;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer Tailmiddle;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer Tailend;
    private final ModelRenderer Tailbasehump;
    private final ModelRenderer Hiphumpfront;
    private final ModelRenderer Hiphumpback;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Rightheel;
    private final ModelRenderer Righttoes;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Leftheel;
    private final ModelRenderer Lefttoes;

    public ModelSkeletonLotosaurusFrame() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.595F, -15.9F, 7.9F, 1, 16, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.66F, -15.9F, -9.75F, 1, 16, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(0.0F, -11.0F, -9.25F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, 0.0436F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -3, 1, -5.0F, -0.5F, -0.5F, 9, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -14.05F, 7.9F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, -0.0006F, 0.0349F, -0.0175F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -1, 1, -3.0F, -1.0F, 0.0F, 6, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 6.3F, -2.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.0848F, 0.0F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-0.4F, 1.1655F, 6.0198F);
        this.Hips.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.0349F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 1, 16, -0.1F, -0.9F, 0.0F, 1, 1, 9, -0.1F, false));

        this.Belly = new ModelRenderer(this);
        this.Belly.setRotationPoint(0.0F, -0.9345F, 7.5198F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.0848F, 0.0F, 0.0F);
        this.Belly.cubeList.add(new ModelBox(Belly, 1, 1, -0.5F, 1.0989F, -12.0254F, 1, 1, 11, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.3011F, -11.3254F);
        this.Belly.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0425F, 0.0436F, 0.0019F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.5F, 3.0119F, -6.5384F);
        this.Bodyfront.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0873F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 1, 28, 0.0F, -1.1F, -0.2F, 1, 1, 7, -0.1F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.7119F, -6.0384F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.4468F, 0.5092F, -0.1049F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(-0.5F, 3.1937F, -4.4393F);
        this.Neck.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.2618F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 31, 13, 0.0F, -0.7F, -0.8F, 1, 1, 6, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 1.7437F, -5.2393F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.1547F, 0.591F, 0.1581F);


        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, -2.1761F, -2.6269F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.0424F, 0.0F, 0.0F);


        this.Upperjawmiddle = new ModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 0.93F, -1.6F);
        this.Upperjawback.addChild(Upperjawmiddle);
        this.setRotateAngle(Upperjawmiddle, 0.1061F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 0.82F, -1.0F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.1698F, 0.0F, 0.0F);


        this.Faceslopefront = new ModelRenderer(this);
        this.Faceslopefront.setRotationPoint(0.01F, 0.0F, -2.0F);
        this.Upperjawfront.addChild(Faceslopefront);
        this.setRotateAngle(Faceslopefront, 0.7391F, 0.0F, 0.0F);


        this.Faceslopemiddle = new ModelRenderer(this);
        this.Faceslopemiddle.setRotationPoint(-0.01F, -0.41F, -1.75F);
        this.Upperjawmiddle.addChild(Faceslopemiddle);
        this.setRotateAngle(Faceslopemiddle, 0.2546F, 0.0F, 0.0F);


        this.Lefteye = new ModelRenderer(this);
        this.Lefteye.setRotationPoint(-1.45F, 1.1F, -1.9F);
        this.Upperjawback.addChild(Lefteye);
        this.setRotateAngle(Lefteye, -0.0424F, -0.1911F, 0.0F);


        this.Righteye = new ModelRenderer(this);
        this.Righteye.setRotationPoint(1.45F, 1.1F, -1.9F);
        this.Upperjawback.addChild(Righteye);
        this.setRotateAngle(Righteye, -0.0424F, 0.1911F, 0.0F);


        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 0.8239F, 0.1731F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.6109F, 0.0F, 0.0F);


        this.Lowerjawmiddleback = new ModelRenderer(this);
        this.Lowerjawmiddleback.setRotationPoint(0.0F, -0.01F, -2.67F);
        this.Lowerjawback.addChild(Lowerjawmiddleback);
        this.setRotateAngle(Lowerjawmiddleback, 0.0424F, 0.0F, 0.0F);


        this.Lowerjawmiddlefront = new ModelRenderer(this);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerjawmiddleback.addChild(Lowerjawmiddlefront);
        this.setRotateAngle(Lowerjawmiddlefront, 0.0848F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Lowerjawmiddlefront.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.1323F, 0.0F, 0.0F);


        this.Lowerjawslopeback = new ModelRenderer(this);
        this.Lowerjawslopeback.setRotationPoint(-0.01F, 1.9F, -0.12F);
        this.Lowerjawmiddleback.addChild(Lowerjawslopeback);
        this.setRotateAngle(Lowerjawslopeback, -0.1698F, 0.0F, 0.0F);


        this.Lowerjawslopefront = new ModelRenderer(this);
        this.Lowerjawslopefront.setRotationPoint(0.0F, -0.01F, -1.7F);
        this.Lowerjawslopeback.addChild(Lowerjawslopefront);
        this.setRotateAngle(Lowerjawslopefront, -0.0087F, 0.0F, 0.0F);


        this.Neckhump = new ModelRenderer(this);
        this.Neckhump.setRotationPoint(0.0F, -3.9563F, 0.5607F);
        this.Neck.addChild(Neckhump);
        this.setRotateAngle(Neckhump, 0.4458F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(3.0F, 7.2119F, -3.8384F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.7936F, 0.0F, -0.0424F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(1.0339F, 5.1065F, 0.8216F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.5295F, 0.0F, 0.0424F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 5.7F, -1.2F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, -0.0449F, 0.0F, 0.0F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-3.0F, 7.2119F, -3.8384F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.0791F, 0.0F, 0.0424F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-1.0339F, 5.1065F, 0.8216F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.4423F, 0.0F, -0.0424F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 5.7F, -1.2F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.4787F, 0.0F, 0.0F);


        this.Bellyhump = new ModelRenderer(this);
        this.Bellyhump.setRotationPoint(0.0F, -1.2011F, -6.0254F);
        this.Belly.addChild(Bellyhump);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.7345F, 15.0198F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.1724F, -0.172F, 0.0298F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(-0.5F, 2.6F, -0.15F);
        this.Tailbase.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0436F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 16, 18, 0.0F, -1.3F, -0.1F, 1, 1, 10, -0.1F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.1F, 9.3F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, -0.0861F, -0.1739F, 0.0149F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(-0.5F, 2.4F, 0.1F);
        this.Tailmiddlebase.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.0698F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 18, 0, 0.0F, -0.8F, -0.1F, 1, 1, 7, -0.1F, false));

        this.Tailmiddle = new ModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, -0.2F, 6.4F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.0659F, -0.2613F, -0.0171F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, 1.8745F, -0.3992F);
        this.Tailmiddle.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, 0.0698F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 41, 8, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.1F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.0255F, 4.8008F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.0439F, 0.2616F, 0.0114F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.Tailmiddleend.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.1309F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 46, 37, -0.5F, -0.5F, 0.0F, 1, 1, 4, -0.1F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.0F, 3.2F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.1148F, 0.3904F, 0.0438F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 48, 0, -0.5F, 0.6F, 0.0F, 1, 1, 4, -0.1F, false));

        this.Tailbasehump = new ModelRenderer(this);
        this.Tailbasehump.setRotationPoint(0.0F, -0.9F, -0.2F);
        this.Tailbase.addChild(Tailbasehump);
        this.setRotateAngle(Tailbasehump, -0.1061F, 0.0F, 0.0F);


        this.Hiphumpfront = new ModelRenderer(this);
        this.Hiphumpfront.setRotationPoint(0.0F, -1.7345F, 5.4198F);
        this.Hips.addChild(Hiphumpfront);
        this.setRotateAngle(Hiphumpfront, -0.0637F, 0.0F, 0.0F);


        this.Hiphumpback = new ModelRenderer(this);
        this.Hiphumpback.setRotationPoint(-0.01F, -5.0F, 6.0F);
        this.Hiphumpfront.addChild(Hiphumpback);
        this.setRotateAngle(Hiphumpback, -0.2122F, 0.0F, 0.0F);


        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.8F, 1.2655F, 10.5198F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.454F, -0.0424F, 0.0F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.0F, 6.9F, -0.4F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.3833F, 0.0F, 0.0F);


        this.Rightheel = new ModelRenderer(this);
        this.Rightheel.setRotationPoint(0.0F, 7.6669F, 0.0571F);
        this.Rightshin.addChild(Rightheel);
        this.setRotateAngle(Rightheel, 0.4611F, 0.0F, 0.0F);


        this.Righttoes = new ModelRenderer(this);
        this.Righttoes.setRotationPoint(0.01F, 0.49F, -2.25F);
        this.Rightheel.addChild(Righttoes);
        this.setRotateAngle(Righttoes, -0.3054F, 0.0F, 0.0F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.8F, 1.2655F, 10.5198F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.0696F, 0.0424F, 0.0F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.0F, 6.9F, -0.4F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.8196F, 0.0F, 0.0F);


        this.Leftheel = new ModelRenderer(this);
        this.Leftheel.setRotationPoint(0.0F, 7.6669F, 0.0571F);
        this.Leftshin.addChild(Leftheel);
        this.setRotateAngle(Leftheel, 0.1121F, 0.0F, 0.0F);


        this.Lefttoes = new ModelRenderer(this);
        this.Lefttoes.setRotationPoint(-0.01F, 0.49F, -2.25F);
        this.Leftheel.addChild(Lefttoes);
        this.setRotateAngle(Lefttoes, -0.829F, 0.0F, 0.0F);

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
