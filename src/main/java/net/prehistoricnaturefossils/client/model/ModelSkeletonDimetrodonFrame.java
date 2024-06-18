package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDimetrodonFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Neckbase;
    private final ModelRenderer Neckend;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerfrontteeth;
    private final ModelRenderer Lowerfrontteeth2;
    private final ModelRenderer Lowerjawslope;
    private final ModelRenderer Rightlowerteeth;
    private final ModelRenderer Rightlowerteeth2;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperjawmiddle;
    private final ModelRenderer Nosebridge;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Upperfrontteeth;
    private final ModelRenderer Rightupperteethback;
    private final ModelRenderer Rightupperteethback2;
    private final ModelRenderer Forehead;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Sailmiddlefront;
    private final ModelRenderer Tailbase;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailend;
    private final ModelRenderer frame11_r1;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonDimetrodonFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -9.9F, 10.5F, 1, 10, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -2.5F, -12.9F, -13.25F, 1, 13, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-2.0F, -8.3F, -12.75F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0077F, 0.1744F, 0.0443F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -2, 1, -4.0F, -0.5F, -0.5F, 8, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(-0.5F, -7.5F, 10.5F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, 0.0436F, -0.0436F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, 0, 1, -2.0F, -1.0F, 0.0F, 5, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -23.8F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 12.8F, 10.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.4245F, 0.0F, 0.0F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.001F, 0.8536F, -0.3049F);
        this.Hips.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.1658F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 8, 19, -0.5F, -0.5F, -3.5F, 1, 1, 7, -0.1F, false));

        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.0F, 0.3199F, -4.7934F);
        this.Hips.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.0262F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 48, 48, -0.5F, -0.45F, -2.0F, 1, 1, 4, -0.1F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.6234F, -6.7758F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.3834F, 0.081F, 0.0326F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.5F, 0.8414F, -5.9852F);
        this.Bodymiddle.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.0262F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 31, 25, -0.998F, -0.1045F, 0.0098F, 1, 1, 6, -0.1F, false));

        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.5F, 1.6414F, -11.5352F);
        this.Bodymiddle.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.1309F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 32, 10, -1.0F, -0.1406F, -0.1354F, 1, 1, 6, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.7782F, -11.4708F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1065F, 0.0868F, 0.0093F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 0.0153F, -5.7468F);
        this.Bodyfront.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.1222F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 27, 33, -0.5F, 0.0389F, 0.029F, 1, 1, 6, -0.1F, false));

        this.Neckbase = new ModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, -0.7431F, -5.6146F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.1061F, 0.0F, 0.0F);
        this.Neckbase.cubeList.add(new ModelBox(Neckbase, 6, 60, -0.5F, 0.8015F, -2.8221F, 1, 1, 3, -0.1F, false));

        this.Neckend = new ModelRenderer(this);
        this.Neckend.setRotationPoint(0.0F, 0.237F, -3.031F);
        this.Neckbase.addChild(Neckend);
        this.setRotateAngle(Neckend, 0.0647F, -0.1742F, -0.0112F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 1.2945F, -1.5494F);
        this.Neckend.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.0087F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 24, 60, -0.5F, -0.7F, -1.0F, 1, 1, 3, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, 0.2167F, -2.6779F);
        this.Neckend.addChild(Head);
        this.setRotateAngle(Head, 0.243F, 0.4994F, 0.1312F);


        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 1.2861F, -1.1427F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.3927F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.65F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.1911F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.2335F, 0.0F, 0.0F);


        this.Lowerfrontteeth = new ModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, 0.7006F, 0.0F, 0.0F);


        this.Lowerfrontteeth2 = new ModelRenderer(this);
        this.Lowerfrontteeth2.setRotationPoint(0.02F, 0.0F, -2.0F);
        this.Lowerjawfront.addChild(Lowerfrontteeth2);
        this.setRotateAngle(Lowerfrontteeth2, 0.7006F, 0.0F, 0.0F);


        this.Lowerjawslope = new ModelRenderer(this);
        this.Lowerjawslope.setRotationPoint(-0.01F, -0.1F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawslope);
        this.setRotateAngle(Lowerjawslope, 0.3768F, 0.0F, 0.0F);


        this.Rightlowerteeth = new ModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(1.5F, 0.6F, 0.0F);
        this.Lowerjawslope.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, -0.0637F, 0.1698F, 0.0F);


        this.Rightlowerteeth2 = new ModelRenderer(this);
        this.Rightlowerteeth2.setRotationPoint(-1.46F, 0.6F, 0.0F);
        this.Lowerjawslope.addChild(Rightlowerteeth2);
        this.setRotateAngle(Rightlowerteeth2, -0.0637F, -0.1698F, 0.0F);


        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, -0.9639F, -5.1427F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.4245F, 0.0F, 0.0F);


        this.Upperjawmiddle = new ModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Upperjawback.addChild(Upperjawmiddle);
        this.setRotateAngle(Upperjawmiddle, -0.5943F, 0.0F, 0.0F);


        this.Nosebridge = new ModelRenderer(this);
        this.Nosebridge.setRotationPoint(0.0F, -4.4F, -1.25F);
        this.Upperjawmiddle.addChild(Nosebridge);
        this.setRotateAngle(Nosebridge, 0.9976F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(-0.01F, -2.0F, -2.8F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.9128F, 0.0F, 0.0F);


        this.Upperfrontteeth = new ModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, 1.0F, -1.5F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, -0.1227F, 0.0F, 0.0F);


        this.Rightupperteethback = new ModelRenderer(this);
        this.Rightupperteethback.setRotationPoint(1.8F, 1.7F, 1.17F);
        this.Upperjawback.addChild(Rightupperteethback);
        this.setRotateAngle(Rightupperteethback, -0.1061F, 0.0213F, 0.0F);


        this.Rightupperteethback2 = new ModelRenderer(this);
        this.Rightupperteethback2.setRotationPoint(-1.78F, 1.7F, 1.17F);
        this.Upperjawback.addChild(Rightupperteethback2);
        this.setRotateAngle(Rightupperteethback2, -0.1061F, -0.0213F, 0.0F);


        this.Forehead = new ModelRenderer(this);
        this.Forehead.setRotationPoint(0.01F, -2.9639F, -5.6427F);
        this.Head.addChild(Forehead);
        this.setRotateAngle(Forehead, 0.3183F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(3.5F, 5.3616F, -5.9681F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, -0.2784F, 0.1061F, -0.2122F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.573F, 4.4027F, 0.5233F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.6344F, 0.0637F, 0.2122F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 4.4F, -0.5F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.8491F, 0.0F, 0.0F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-3.5F, 5.3616F, -5.9681F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.6954F, -0.2487F, 0.3801F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-0.573F, 4.4027F, 0.5233F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.8312F, -0.0742F, -0.3972F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 4.4F, -0.5F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.0637F, 0.0F, 0.0F);


        this.Sailmiddlefront = new ModelRenderer(this);
        this.Sailmiddlefront.setRotationPoint(-0.01F, -2.4397F, -6.6063F);
        this.Bodyfront.addChild(Sailmiddlefront);
        this.setRotateAngle(Sailmiddlefront, -0.0637F, 0.0F, 0.0F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 0.0495F, 3.5908F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.1988F, -0.1712F, -0.0343F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(-0.1F, 1.1482F, -0.9619F);
        this.Tailbase.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.0961F, 0.0347F, 0.0033F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 9, 28, -0.5F, -0.5F, -0.3F, 1, 1, 6, -0.1F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.5499F, 4.722F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, -0.1356F, -0.173F, 0.0235F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.0F, 0.8165F, -0.0899F);
        this.Tailmiddlebase.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, 0.1396F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 18, 31, -0.5F, -0.1F, -0.1F, 1, 1, 6, -0.1F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.7741F, 5.5583F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.1444F, -0.2614F, -0.0148F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 11, -2, -0.5F, 0.6885F, -0.5256F, 1, 1, 8, -0.1F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -0.0255F, 6.9651F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.0723F, -0.3047F, -0.0217F);


        this.frame11_r1 = new ModelRenderer(this);
        this.frame11_r1.setRotationPoint(0.0F, 0.8085F, -0.0707F);
        this.Tailend.addChild(frame11_r1);
        this.setRotateAngle(frame11_r1, -0.0524F, 0.0F, 0.0F);
        this.frame11_r1.cubeList.add(new ModelBox(frame11_r1, 0, 0, -0.5F, -0.1F, 0.0F, 1, 1, 10, -0.1F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.3F, 2.2387F, 2.205F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.7236F, -0.1664F, -0.295F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.4882F, 4.1774F, -0.2708F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 1.3043F, -0.1274F, 0.0848F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(-0.0365F, 5.642F, 0.5809F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.0636F, 0.0028F, 0.0648F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.3F, 2.2387F, 2.205F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.9281F, 0.0223F, 0.1867F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.4882F, 4.1774F, -0.2708F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.9552F, 0.1274F, -0.0848F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0365F, 5.642F, 0.5809F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.0636F, -0.0028F, -0.0648F);

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
