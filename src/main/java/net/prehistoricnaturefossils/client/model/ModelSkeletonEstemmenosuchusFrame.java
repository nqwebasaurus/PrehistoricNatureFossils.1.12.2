package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEstemmenosuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Belly;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Front;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjawbase;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowermiddleteeth;
    private final ModelRenderer Lowerfrontteeth;
    private final ModelRenderer Rightlowerfang;
    private final ModelRenderer Leftlowerfang;
    private final ModelRenderer Lowerjawfiller;
    private final ModelRenderer Lowerteethback;
    private final ModelRenderer Jawparting;
    private final ModelRenderer Upperjawbase;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Uppermiddleteeth;
    private final ModelRenderer Leftupperfang;
    private final ModelRenderer Rightupperfang;
    private final ModelRenderer Upperfrontteeth;
    private final ModelRenderer Upperteethback;
    private final ModelRenderer Snoutbase;
    private final ModelRenderer Snoutfront;
    private final ModelRenderer Nosehorn;
    private final ModelRenderer Rightcheekflarebase;
    private final ModelRenderer Rightcheekflareend;
    private final ModelRenderer Leftcheekflarebase;
    private final ModelRenderer Leftcheekflareend;
    private final ModelRenderer Righteye;
    private final ModelRenderer Lefteye;
    private final ModelRenderer Rightantler;
    private final ModelRenderer Rightantlerpronga;
    private final ModelRenderer Rightantlerprongb;
    private final ModelRenderer Leftantler;
    private final ModelRenderer Leftantlerpronga;
    private final ModelRenderer Leftantlerprongb;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailmiddle;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer Tailend;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonEstemmenosuchusFrame() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.49F, -14.9F, 13.15F, 1, 15, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 0.55F, -20.9F, -11.0F, 1, 21, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(1.5F, -12.75F, -11.0F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, -0.2182F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -5, 1, -7.0F, -1.0F, 0.0F, 13, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -12.0F, 14.15F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, 0.0436F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -3, 1, -5.0F, -1.0F, -1.0F, 10, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 5.35F, 10.4F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.5308F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 10, -0.5F, 1.1431F, -0.6924F, 1, 1, 10, -0.1F, false));

        this.Belly = new ModelRenderer(this);
        this.Belly.setRotationPoint(0.0F, 0.1431F, -0.1924F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.2759F, 0.0F, 0.0F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(-0.5F, 1.6031F, -8.8706F);
        this.Belly.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0436F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 21, 1, 0.01F, -1.016F, -0.0786F, 1, 1, 9, -0.1F, false));

        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-0.5F, 2.0031F, -15.1706F);
        this.Belly.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.0436F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 43, 22, 0.0F, -1.116F, -0.1786F, 1, 1, 7, -0.1F, false));

        this.Front = new ModelRenderer(this);
        this.Front.setRotationPoint(0.0F, -0.0935F, -15.0504F);
        this.Belly.addChild(Front);
        this.setRotateAngle(Front, 0.1508F, -0.1726F, -0.0261F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(-0.5F, 3.0489F, -9.4788F);
        this.Front.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.0873F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 16, 13, 0.0F, -1.25F, -0.5F, 1, 1, 10, -0.1F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.8251F, -9.171F);
        this.Front.addChild(Neck);
        this.setRotateAngle(Neck, -0.3818F, -0.4312F, 0.0689F);
        this.Neck.cubeList.add(new ModelBox(Neck, 57, 59, -0.5F, 1.4567F, -8.4618F, 1, 1, 5, -0.1F, false));

        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-1.0F, 2.2067F, -3.7618F);
        this.Neck.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0961F, -0.0347F, -0.0033F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 66, 36, 0.5F, -0.75F, 0.0F, 1, 1, 4, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.2045F, -6.735F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.0718F, -0.2877F, -0.2329F);


        this.Lowerjawbase = new ModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 2.706F, -0.0597F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 0.9599F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(-0.01F, 0.0F, -4.0F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.4033F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 2.0F, -3.6F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.1911F, 0.0F, 0.0F);


        this.Lowermiddleteeth = new ModelRenderer(this);
        this.Lowermiddleteeth.setRotationPoint(0.0F, -1.5F, -2.2F);
        this.Lowerjawfront.addChild(Lowermiddleteeth);


        this.Lowerfrontteeth = new ModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, -2.0F, -3.8F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, 0.1698F, 0.0F, 0.0F);


        this.Rightlowerfang = new ModelRenderer(this);
        this.Rightlowerfang.setRotationPoint(1.6F, -1.5F, -3.0F);
        this.Lowerjawfront.addChild(Rightlowerfang);
        this.setRotateAngle(Rightlowerfang, 0.1274F, -0.1061F, 0.1485F);


        this.Leftlowerfang = new ModelRenderer(this);
        this.Leftlowerfang.setRotationPoint(-1.58F, -1.5F, -3.0F);
        this.Lowerjawfront.addChild(Leftlowerfang);
        this.setRotateAngle(Leftlowerfang, 0.1274F, 0.1061F, -0.1485F);


        this.Lowerjawfiller = new ModelRenderer(this);
        this.Lowerjawfiller.setRotationPoint(0.02F, 3.0F, -4.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfiller);
        this.setRotateAngle(Lowerjawfiller, -0.2847F, 0.0F, 0.0F);


        this.Lowerteethback = new ModelRenderer(this);
        this.Lowerteethback.setRotationPoint(0.0F, 0.5F, -3.4F);
        this.Lowerjawmiddle.addChild(Lowerteethback);


        this.Jawparting = new ModelRenderer(this);
        this.Jawparting.setRotationPoint(0.0F, 0.4F, -4.7F);
        this.Lowerjawbase.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.3609F, 0.0F, 0.0F);


        this.Upperjawbase = new ModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, -0.554F, -3.9597F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.4033F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.01F, 3.0F, -4.9F);
        this.Upperjawbase.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.1061F, 0.0F, 0.0F);


        this.Uppermiddleteeth = new ModelRenderer(this);
        this.Uppermiddleteeth.setRotationPoint(0.0F, -0.7F, -1.6F);
        this.Upperjawfront.addChild(Uppermiddleteeth);
        this.setRotateAngle(Uppermiddleteeth, -0.1061F, 0.0F, 0.0F);


        this.Leftupperfang = new ModelRenderer(this);
        this.Leftupperfang.setRotationPoint(2.0F, -0.3F, -2.0F);
        this.Upperjawfront.addChild(Leftupperfang);
        this.setRotateAngle(Leftupperfang, 0.0F, -0.2546F, -0.2759F);


        this.Rightupperfang = new ModelRenderer(this);
        this.Rightupperfang.setRotationPoint(-2.02F, -0.3F, -2.0F);
        this.Upperjawfront.addChild(Rightupperfang);
        this.setRotateAngle(Rightupperfang, 0.0F, 0.2546F, 0.2759F);


        this.Upperfrontteeth = new ModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, 0.0F, -3.7F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, 0.1485F, 0.0F, 0.0F);


        this.Upperteethback = new ModelRenderer(this);
        this.Upperteethback.setRotationPoint(0.0F, 2.5F, -4.9F);
        this.Upperjawbase.addChild(Upperteethback);
        this.setRotateAngle(Upperteethback, 0.1274F, 0.0F, 0.0F);


        this.Snoutbase = new ModelRenderer(this);
        this.Snoutbase.setRotationPoint(0.0F, -1.894F, -3.9597F);
        this.Head.addChild(Snoutbase);
        this.setRotateAngle(Snoutbase, 0.3271F, 0.0F, 0.0F);


        this.Snoutfront = new ModelRenderer(this);
        this.Snoutfront.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Snoutbase.addChild(Snoutfront);
        this.setRotateAngle(Snoutfront, 0.4033F, 0.0F, 0.0F);


        this.Nosehorn = new ModelRenderer(this);
        this.Nosehorn.setRotationPoint(0.0F, 0.0F, -3.3F);
        this.Snoutfront.addChild(Nosehorn);
        this.setRotateAngle(Nosehorn, 0.2759F, 0.0F, 0.0F);


        this.Rightcheekflarebase = new ModelRenderer(this);
        this.Rightcheekflarebase.setRotationPoint(3.3F, 0.706F, -2.2597F);
        this.Head.addChild(Rightcheekflarebase);
        this.setRotateAngle(Rightcheekflarebase, 0.7217F, 0.0213F, 0.4033F);


        this.Rightcheekflareend = new ModelRenderer(this);
        this.Rightcheekflareend.setRotationPoint(2.5F, 1.0F, -0.2F);
        this.Rightcheekflarebase.addChild(Rightcheekflareend);
        this.setRotateAngle(Rightcheekflareend, -0.2759F, -0.1698F, -0.1698F);


        this.Leftcheekflarebase = new ModelRenderer(this);
        this.Leftcheekflarebase.setRotationPoint(-3.3F, 0.706F, -2.2597F);
        this.Head.addChild(Leftcheekflarebase);
        this.setRotateAngle(Leftcheekflarebase, 0.7217F, -0.0213F, -0.4033F);


        this.Leftcheekflareend = new ModelRenderer(this);
        this.Leftcheekflareend.setRotationPoint(-2.5F, 1.0F, -0.2F);
        this.Leftcheekflarebase.addChild(Leftcheekflareend);
        this.setRotateAngle(Leftcheekflareend, -0.2759F, 0.1698F, 0.1698F);


        this.Righteye = new ModelRenderer(this);
        this.Righteye.setRotationPoint(1.3F, -0.694F, -3.2597F);
        this.Head.addChild(Righteye);
        this.setRotateAngle(Righteye, -0.0637F, 0.7854F, -0.1274F);


        this.Lefteye = new ModelRenderer(this);
        this.Lefteye.setRotationPoint(-1.3F, -0.694F, -3.2597F);
        this.Head.addChild(Lefteye);
        this.setRotateAngle(Lefteye, -0.0637F, -0.7854F, 0.1274F);


        this.Rightantler = new ModelRenderer(this);
        this.Rightantler.setRotationPoint(1.95F, -1.994F, -3.9597F);
        this.Head.addChild(Rightantler);
        this.setRotateAngle(Rightantler, -0.1698F, -0.3609F, 0.2335F);


        this.Rightantlerpronga = new ModelRenderer(this);
        this.Rightantlerpronga.setRotationPoint(0.3F, -2.3F, 0.0F);
        this.Rightantler.addChild(Rightantlerpronga);
        this.setRotateAngle(Rightantlerpronga, -0.2759F, -0.1698F, 1.1037F);


        this.Rightantlerprongb = new ModelRenderer(this);
        this.Rightantlerprongb.setRotationPoint(-0.2F, -0.9F, 0.0F);
        this.Rightantler.addChild(Rightantlerprongb);
        this.setRotateAngle(Rightantlerprongb, 0.0F, 0.1911F, 0.8067F);


        this.Leftantler = new ModelRenderer(this);
        this.Leftantler.setRotationPoint(-1.95F, -1.994F, -3.9597F);
        this.Head.addChild(Leftantler);
        this.setRotateAngle(Leftantler, -0.1698F, 0.3609F, -0.2335F);


        this.Leftantlerpronga = new ModelRenderer(this);
        this.Leftantlerpronga.setRotationPoint(-0.3F, -2.3F, 0.0F);
        this.Leftantler.addChild(Leftantlerpronga);
        this.setRotateAngle(Leftantlerpronga, -0.2759F, 0.1698F, -1.1037F);


        this.Leftantlerprongb = new ModelRenderer(this);
        this.Leftantlerprongb.setRotationPoint(0.2F, -0.9F, 0.0F);
        this.Leftantler.addChild(Leftantlerprongb);
        this.setRotateAngle(Leftantlerprongb, 0.0F, -0.1911F, -0.8067F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(5.0F, 9.3045F, -5.5849F);
        this.Front.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 1.1573F, 0.2286F, -0.7784F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.1048F, 7.2253F, 0.2417F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.9363F, 0.3971F, 0.8071F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 7.2F, -0.6F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 1.1994F, 0.0F, 0.0F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-5.0F, 9.3045F, -5.5849F);
        this.Front.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.5095F, -0.1485F, 0.743F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.1048F, 7.2253F, 0.2417F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.4033F, -0.2546F, -0.7006F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 7.2F, -0.6F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.0213F, 0.0F, 0.0F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 0.0163F, 9.31F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.2759F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 24, 56, -0.49F, 1.1438F, -0.3399F, 1, 1, 5, -0.1F, false));

        this.Tailmiddle = new ModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, -0.1616F, 4.4444F);
        this.Tailbase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, -0.1061F, 0.0F, 0.0F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, 1.8039F, -0.4281F);
        this.Tailmiddle.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.0873F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 62, 7, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.1F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.1418F, 4.3223F);
        this.Tailmiddle.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.0637F, 0.0F, 0.0F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.0F, 1.2957F, -0.5039F);
        this.Tailend.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, 0.0611F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 56, 49, -0.51F, -0.5F, 0.0F, 1, 1, 6, -0.1F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(4.5F, 3.0745F, 5.6638F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.1333F, 0.0424F, -0.3821F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(-0.2467F, 7.1277F, -2.1901F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.4671F, 0.0F, 0.3821F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.994F, 6.0361F, 3.0053F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 0.2841F, 0.0F, 0.0F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-4.5F, 3.0745F, 5.6638F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.5648F, -0.0424F, 0.3821F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.2467F, 7.1277F, -2.1901F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.4671F, 0.0F, -0.3821F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(-0.994F, 6.0361F, 3.0053F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.4576F, 0.0F, 0.0F);

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
