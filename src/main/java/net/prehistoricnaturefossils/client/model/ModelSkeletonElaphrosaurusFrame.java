package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonElaphrosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Neckbase;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Neckmiddlebase;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Neckmiddlefront;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Neckfront;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjawbase;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Upperjawslopebase;
    private final ModelRenderer Upperjawslopefront;
    private final ModelRenderer Lowerjawbase;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Chinslopefront;
    private final ModelRenderer Chinslopeback;
    private final ModelRenderer Lefteye;
    private final ModelRenderer Righteye;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Righthand;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Lefthand;
    private final ModelRenderer Tailbase;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer Tailmiddle;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailend;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Rightankle;
    private final ModelRenderer Rightfoot;
    private final ModelRenderer Righttoes;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Leftankle;
    private final ModelRenderer Leftfoot;
    private final ModelRenderer Lefttoes;

    public ModelSkeletonElaphrosaurusFrame() {
        this.textureWidth = 74;
        this.textureHeight = 74;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.49F, -32.9F, 1.25F, 1, 33, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.49F, -31.9F, -19.75F, 1, 32, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, -2, 1, -4.0F, -27.75F, -19.75F, 8, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -32.0F, 1.25F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, -0.0349F, -0.0436F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -2, 1, -4.0F, -1.0F, 0.0F, 8, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -9.12F, 1.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1911F, 0.0F, 0.0F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, 0.6F, -5.9F);
        this.Hips.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.0349F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 0, 0, -0.5F, -0.5F, -0.1F, 1, 1, 13, -0.1F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.5F, -6.0F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.3007F, 0.0F, 0.0F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.0F, 0.3382F, -10.7266F);
        this.Bodymiddle.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.0698F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 16, 0, -0.49F, -0.5F, -0.1F, 1, 1, 11, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.8618F, -10.7266F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1934F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 40, 27, -0.5F, 0.7F, -8.7F, 1, 1, 9, -0.1F, false));

        this.Neckbase = new ModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, 0.2F, -8.8F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.2759F, 0.0F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.1F, 0.9276F, -2.3378F);
        this.Neckbase.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.0F, -0.0524F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 50, 42, -0.46F, -0.5F, -3.0F, 1, 1, 6, -0.1F, false));

        this.Neckmiddlebase = new ModelRenderer(this);
        this.Neckmiddlebase.setRotationPoint(0.0F, -0.1224F, -4.5378F);
        this.Neckbase.addChild(Neckmiddlebase);
        this.setRotateAngle(Neckmiddlebase, -0.4527F, -0.341F, -0.1415F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(-0.1827F, 1.0617F, -2.9783F);
        this.Neckmiddlebase.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.0314F, 0.0349F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 45, 13, -0.5F, -0.5F, -3.5572F, 1, 1, 7, -0.1F, false));

        this.Neckmiddlefront = new ModelRenderer(this);
        this.Neckmiddlefront.setRotationPoint(0.0F, -0.0703F, -5.9737F);
        this.Neckmiddlebase.addChild(Neckmiddlefront);
        this.setRotateAngle(Neckmiddlefront, -0.1636F, 0.021F, 0.2391F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, 0.5705F, -5.5842F);
        this.Neckmiddlefront.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.096F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 9, 48, -0.5F, -0.4725F, -0.0916F, 1, 1, 6, -0.1F, false));

        this.Neckfront = new ModelRenderer(this);
        this.Neckfront.setRotationPoint(-0.01F, -0.4295F, -5.3842F);
        this.Neckmiddlefront.addChild(Neckfront);
        this.setRotateAngle(Neckfront, 0.3041F, -0.0098F, -0.013F);
        this.Neckfront.cubeList.add(new ModelBox(Neckfront, 0, 61, -0.49F, 0.5041F, -2.894F, 1, 1, 3, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.01F, -0.3683F, -2.594F);
        this.Neckfront.addChild(Head);
        this.setRotateAngle(Head, 0.3438F, -0.0411F, -0.0147F);


        this.Upperjawbase = new ModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, 0.4777F, -2.8522F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.2759F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(-0.01F, 0.0F, -2.0F);
        this.Upperjawbase.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.2122F, 0.0F, 0.0F);


        this.Upperjawslopebase = new ModelRenderer(this);
        this.Upperjawslopebase.setRotationPoint(0.0F, -0.5223F, -2.8522F);
        this.Head.addChild(Upperjawslopebase);
        this.setRotateAngle(Upperjawslopebase, 0.5943F, 0.0F, 0.0F);


        this.Upperjawslopefront = new ModelRenderer(this);
        this.Upperjawslopefront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Upperjawslopebase.addChild(Upperjawslopefront);
        this.setRotateAngle(Upperjawslopefront, 0.1463F, 0.0F, 0.0F);


        this.Lowerjawbase = new ModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 1.4777F, -0.0522F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 0.2618F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -2.9F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.2759F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(-0.01F, -0.02F, -1.6F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.2122F, 0.0F, 0.0F);


        this.Chinslopefront = new ModelRenderer(this);
        this.Chinslopefront.setRotationPoint(-0.01F, 1.0F, -1.05F);
        this.Lowerjawmiddle.addChild(Chinslopefront);
        this.setRotateAngle(Chinslopefront, -0.5308F, 0.0F, 0.0F);


        this.Chinslopeback = new ModelRenderer(this);
        this.Chinslopeback.setRotationPoint(-0.01F, 0.0F, 2.0F);
        this.Chinslopefront.addChild(Chinslopeback);
        this.setRotateAngle(Chinslopeback, 0.0874F, 0.0F, 0.0F);


        this.Lefteye = new ModelRenderer(this);
        this.Lefteye.setRotationPoint(1.57F, 0.3277F, -1.8022F);
        this.Head.addChild(Lefteye);


        this.Righteye = new ModelRenderer(this);
        this.Righteye.setRotationPoint(-1.57F, 0.3277F, -1.8022F);
        this.Head.addChild(Righteye);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(3.5F, 5.5F, -6.0F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.8067F, 0.3609F, -0.1485F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.0703F, 6.1132F, 0.371F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.7383F, -0.0213F, 0.1911F);


        this.Righthand = new ModelRenderer(this);
        this.Righthand.setRotationPoint(0.3614F, 2.2506F, -0.1626F);
        this.Rightlowerarm.addChild(Righthand);
        this.setRotateAngle(Righthand, 0.0637F, 0.0F, 0.2759F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-3.5F, 5.5F, -6.0F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 1.0249F, -0.3609F, 0.1485F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-0.0703F, 6.1132F, 0.371F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.6946F, 0.0213F, -0.1911F);


        this.Lefthand = new ModelRenderer(this);
        this.Lefthand.setRotationPoint(-0.3614F, 2.2506F, -0.1626F);
        this.Leftlowerarm.addChild(Lefthand);
        this.setRotateAngle(Lefthand, 0.0637F, 0.0F, -0.2759F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.1F, 6.4F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.1343F, 0.1302F, 0.0137F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(-0.05F, 0.8936F, 5.0791F);
        this.Tailbase.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.0576F, -0.0105F, -0.001F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 27, 29, -0.5F, -0.5F, -5.0F, 1, 1, 10, -0.1F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.6993F, 10.0831F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.2609F, 0.1687F, 0.0448F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.0F, 1.1831F, -0.8486F);
        this.Tailmiddlebase.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, 0.007F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 18, 14, -0.5F, -0.5F, 0.0F, 1, 1, 13, -0.1F, false));

        this.Tailmiddle = new ModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, -0.1169F, 11.8014F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, -0.1077F, -0.1735F, 0.0187F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.0F, 1.2652F, -0.1284F);
        this.Tailmiddle.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, 0.0349F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 0, 27, -0.5F, -0.6F, 0.0F, 1, 1, 12, -0.1F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.1348F, 11.8716F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, -0.1788F, -0.2969F, 0.0701F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 31, 3, -0.5F, 0.4F, -0.35F, 1, 1, 10, -0.1F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -0.1F, 9.8F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.3376F, -0.2892F, 0.0998F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 34, 15, -0.5F, 0.5444F, -0.2467F, 1, 1, 10, -0.1F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.5F, 0.6F, 0.4F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.1758F, 0.0F, 0.0873F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.5F, 11.0F, -1.5F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.9009F, 0.0F, 0.0F);


        this.Rightankle = new ModelRenderer(this);
        this.Rightankle.setRotationPoint(-0.5F, 13.4035F, 0.1974F);
        this.Rightshin.addChild(Rightankle);
        this.setRotateAngle(Rightankle, -0.2863F, -0.0159F, -0.0406F);


        this.Rightfoot = new ModelRenderer(this);
        this.Rightfoot.setRotationPoint(0.0F, 8.4435F, 0.056F);
        this.Rightankle.addChild(Rightfoot);
        this.setRotateAngle(Rightfoot, 0.5353F, -0.0278F, -0.0551F);


        this.Righttoes = new ModelRenderer(this);
        this.Righttoes.setRotationPoint(0.0F, 0.49F, -2.0F);
        this.Rightfoot.addChild(Righttoes);
        this.setRotateAngle(Righttoes, -0.3927F, 0.0F, 0.0F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.5F, 0.6F, 0.4F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.8714F, 0.0F, 0.0F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.5F, 11.0F, -1.5F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.942F, 0.1242F, -0.0415F);


        this.Leftankle = new ModelRenderer(this);
        this.Leftankle.setRotationPoint(0.5F, 13.4035F, 0.1974F);
        this.Leftshin.addChild(Leftankle);
        this.setRotateAngle(Leftankle, -1.1584F, -0.0908F, 0.1393F);


        this.Leftfoot = new ModelRenderer(this);
        this.Leftfoot.setRotationPoint(0.0F, 9.1435F, 1.156F);
        this.Leftankle.addChild(Leftfoot);
        this.setRotateAngle(Leftfoot, 2.0626F, 0.0F, 0.0F);


        this.Lefttoes = new ModelRenderer(this);
        this.Lefttoes.setRotationPoint(0.0F, 0.49F, -2.0F);
        this.Leftfoot.addChild(Lefttoes);
        this.setRotateAngle(Lefttoes, 0.5672F, 0.0F, 0.0F);

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
