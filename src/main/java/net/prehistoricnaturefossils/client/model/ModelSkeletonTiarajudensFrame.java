package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTiarajudensFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer pole2_r1;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjaw1;
    private final ModelRenderer Upperjaw2;
    private final ModelRenderer Upperlip;
    private final ModelRenderer Upperteeth;
    private final ModelRenderer Righttusk;
    private final ModelRenderer Righttuskend;
    private final ModelRenderer Headslope;
    private final ModelRenderer Lowerjaw1;
    private final ModelRenderer Lowerjaw2;
    private final ModelRenderer Lowerjaw3;
    private final ModelRenderer Lowerjaw4;
    private final ModelRenderer Lowerjaw5;
    private final ModelRenderer Lowerlip;
    private final ModelRenderer Lowerteeth;
    private final ModelRenderer Jawparting;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Tail1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer Tail4;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;

    public ModelSkeletonTiarajudensFrame() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 1.51F, -7.9F, 8.5F, 1, 8, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, -2, 1, -1.25F, -6.5F, 8.51F, 7, 1, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-2.5F, -6.5F, -9.0F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, -0.0453F, 0.478F, -0.0983F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -3, 1, -4.5F, -0.5F, -0.5F, 9, 1, 1, -0.1F, false));

        this.pole2_r1 = new ModelRenderer(this);
        this.pole2_r1.setRotationPoint(-2.5F, -0.4F, -9.0F);
        this.fossil.addChild(pole2_r1);
        this.setRotateAngle(pole2_r1, 0.0F, 0.0F, -0.0218F);
        this.pole2_r1.cubeList.add(new ModelBox(pole2_r1, 1, 1, -0.5F, -10.5F, -0.5F, 1, 11, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(1.0F, -11.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(1.0F, 1.3F, 8.1F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.3656F, 0.0F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 1.6308F, -3.8079F);
        this.Hips.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.0524F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 2, 2, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.1F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, 0.0308F, -3.7079F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1521F, 0.2157F, 0.0328F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 16, 13, -0.5F, 1.0929F, -7.8953F, 1, 1, 8, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.1071F, -7.8953F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1098F, 0.2603F, 0.0284F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, 2.7266F, -3.5794F);
        this.Bodyfront.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.1309F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 1, 21, -0.5F, -1.0F, -4.0F, 1, 1, 8, -0.1F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.9452F, -7.2493F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.2428F, 0.8086F, -0.0214F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.5F, 1.1833F, -5.3859F);
        this.Neck.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.0436F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 21, 24, -1.0F, -0.2082F, -1.409F, 1, 1, 7, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, -0.2167F, -5.1859F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.0253F, 0.0198F, 0.1734F);


        this.Upperjaw1 = new ModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, -2.7927F, -5.724F);
        this.Head.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, 0.4033F, 0.0F, 0.0F);


        this.Upperjaw2 = new ModelRenderer(this);
        this.Upperjaw2.setRotationPoint(-0.01F, 0.0F, -2.0F);
        this.Upperjaw1.addChild(Upperjaw2);
        this.setRotateAngle(Upperjaw2, 0.1061F, 0.0F, 0.0F);


        this.Upperlip = new ModelRenderer(this);
        this.Upperlip.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Upperjaw2.addChild(Upperlip);
        this.setRotateAngle(Upperlip, 0.8067F, 0.0F, 0.0F);


        this.Upperteeth = new ModelRenderer(this);
        this.Upperteeth.setRotationPoint(0.0F, 0.75F, -4.3F);
        this.Upperlip.addChild(Upperteeth);
        this.setRotateAngle(Upperteeth, 0.3396F, 0.0F, 0.0F);


        this.Righttusk = new ModelRenderer(this);
        this.Righttusk.setRotationPoint(2.15F, 5.75F, -2.65F);
        this.Upperjaw2.addChild(Righttusk);
        this.setRotateAngle(Righttusk, -0.5732F, 0.0F, -0.0848F);


        this.Righttuskend = new ModelRenderer(this);
        this.Righttuskend.setRotationPoint(0.01F, 1.45F, 0.01F);
        this.Righttusk.addChild(Righttuskend);
        this.setRotateAngle(Righttuskend, 0.1061F, 0.0F, 0.0F);


        this.Headslope = new ModelRenderer(this);
        this.Headslope.setRotationPoint(0.01F, 0.0F, 0.0F);
        this.Upperjaw1.addChild(Headslope);
        this.setRotateAngle(Headslope, -0.5095F, 0.0F, 0.0F);


        this.Lowerjaw1 = new ModelRenderer(this);
        this.Lowerjaw1.setRotationPoint(0.0F, 2.6073F, -0.724F);
        this.Head.addChild(Lowerjaw1);
        this.setRotateAngle(Lowerjaw1, 1.0472F, 0.0F, 0.0F);


        this.Lowerjaw2 = new ModelRenderer(this);
        this.Lowerjaw2.setRotationPoint(0.0F, -0.2F, -4.5F);
        this.Lowerjaw1.addChild(Lowerjaw2);
        this.setRotateAngle(Lowerjaw2, 0.5308F, 0.0F, 0.0F);


        this.Lowerjaw3 = new ModelRenderer(this);
        this.Lowerjaw3.setRotationPoint(0.01F, 2.0F, -1.7F);
        this.Lowerjaw2.addChild(Lowerjaw3);
        this.setRotateAngle(Lowerjaw3, -0.6793F, 0.0F, 0.0F);


        this.Lowerjaw4 = new ModelRenderer(this);
        this.Lowerjaw4.setRotationPoint(0.01F, 0.4F, -2.9F);
        this.Lowerjaw3.addChild(Lowerjaw4);
        this.setRotateAngle(Lowerjaw4, -0.4245F, 0.0F, 0.0F);


        this.Lowerjaw5 = new ModelRenderer(this);
        this.Lowerjaw5.setRotationPoint(-0.03F, 0.0F, 0.0F);
        this.Lowerjaw4.addChild(Lowerjaw5);
        this.setRotateAngle(Lowerjaw5, 0.407F, 0.0F, 0.0F);


        this.Lowerlip = new ModelRenderer(this);
        this.Lowerlip.setRotationPoint(-0.01F, -2.2F, -1.8F);
        this.Lowerjaw3.addChild(Lowerlip);
        this.setRotateAngle(Lowerlip, -0.0848F, 0.0F, 0.0F);


        this.Lowerteeth = new ModelRenderer(this);
        this.Lowerteeth.setRotationPoint(0.0F, 1.1F, -2.75F);
        this.Lowerlip.addChild(Lowerteeth);
        this.setRotateAngle(Lowerteeth, -0.1061F, 0.0F, 0.0F);


        this.Jawparting = new ModelRenderer(this);
        this.Jawparting.setRotationPoint(-0.01F, 0.0F, -3.7F);
        this.Lowerjaw1.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.4033F, 0.0F, 0.0F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.3F, 6.8452F, -6.0493F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 1.2494F, -0.1688F, 0.9296F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.4205F, 5.8414F, -0.216F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -1.5178F, -0.8547F, -0.6648F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.878F, 3.9847F, 0.1216F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.6077F, -0.0616F, 0.0619F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.3F, 6.8452F, -6.0493F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.5076F, 0.1688F, -0.9296F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.4205F, 5.8414F, -0.216F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -1.4129F, 0.291F, 1.0617F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.878F, 3.9847F, 0.1216F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 1.0877F, 0.0616F, -0.0619F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.0692F, 3.9921F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.5224F, 0.0F, 0.0F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.01F, 1.7004F, -0.5212F);
        this.Tail1.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.0436F, -0.0873F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 45, 26, -0.4128F, -0.5F, -0.0019F, 1, 1, 4, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.1004F, 3.1788F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.1798F, -0.387F, 0.0685F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(-0.5F, 1.4263F, 0.0743F);
        this.Tail2.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.0611F, -0.3054F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 50, 33, 0.0F, -0.5F, 0.0F, 1, 1, 4, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.0737F, 3.3243F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.5861F, -0.7818F, 0.4375F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, 0.908F, 1.2108F);
        this.Tail3.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, 0.0437F, -0.0436F, -0.0019F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 45, 16, -0.5F, -0.4128F, -0.0019F, 1, 1, 4, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(-0.1F, 0.008F, 4.4608F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.1148F, -0.3904F, -0.0438F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 53, 39, -0.4F, 0.4011F, 0.0212F, 1, 1, 4, -0.1F, false));

        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.3F, 3.2308F, 2.1921F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.6268F, 0.0244F, 1.6244F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.6282F, 6.9032F, 0.1109F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.6552F, 1.3873F, -1.3386F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.2028F, 5.1545F, -0.5163F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.1442F, 0.0505F, 0.1735F);


        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.3F, 3.2308F, 2.1921F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -1.0196F, 0.0216F, -1.5608F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(-0.6282F, 6.9032F, 0.1109F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.2007F, -0.979F, 1.8184F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(-0.2028F, 5.1545F, -0.5163F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.0154F, -0.046F, -0.1301F);

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
