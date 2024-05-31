package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLystrosaurusFrame extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjaw1;
    private final ModelRenderer Upperjaw2;
    private final ModelRenderer Upperbeak;
    private final ModelRenderer Lefttusk;
    private final ModelRenderer Righttusk;
    private final ModelRenderer Lowerjaw1;
    private final ModelRenderer Lowerjaw2;
    private final ModelRenderer Lowerjaw3;
    private final ModelRenderer Lowerjaw4;
    private final ModelRenderer Lowerbeak;
    private final ModelRenderer Jawparting;
    private final ModelRenderer Eyes;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Tail1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;
    private final ModelRenderer bb_main;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;

    public ModelSkeletonLystrosaurusFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 9.85F, 1.1F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1061F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 1, 15, -0.5F, 0.0565F, 7.749F, 1, 1, 9, -0.1F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -1.0446F, 8.2702F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1062F, -0.0434F, -0.0046F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -0.5F, 1.1023F, -11.4576F, 1, 1, 12, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.0023F, -11.0576F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0639F, -0.0871F, -0.0056F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.5F, 2.1888F, -7.3821F);
        this.Bodyfront.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.1309F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 17, 0, -1.0F, -0.15F, -0.3F, 1, 1, 8, -0.1F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.9388F, -7.1821F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.2754F, -0.7215F, -0.0937F);
        this.Neck.cubeList.add(new ModelBox(Neck, 13, 35, -0.5F, 1.0016F, -4.9686F, 1, 1, 6, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, 0.1016F, -2.9686F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.0266F, -0.2134F, -0.1711F);


        this.Upperjaw1 = new ModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, -3.5843F, -3.0526F);
        this.Head.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, 0.0637F, 0.0F, 0.0F);


        this.Upperjaw2 = new ModelRenderer(this);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Upperjaw1.addChild(Upperjaw2);
        this.setRotateAngle(Upperjaw2, 1.0613F, 0.0F, 0.0F);


        this.Upperbeak = new ModelRenderer(this);
        this.Upperbeak.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Upperjaw2.addChild(Upperbeak);
        this.setRotateAngle(Upperbeak, 0.2972F, 0.0F, 0.0F);


        this.Lefttusk = new ModelRenderer(this);
        this.Lefttusk.setRotationPoint(-1.4F, 2.3F, -4.3F);
        this.Upperjaw2.addChild(Lefttusk);
        this.setRotateAngle(Lefttusk, -1.1037F, 0.1274F, 0.0F);


        this.Righttusk = new ModelRenderer(this);
        this.Righttusk.setRotationPoint(1.4F, 2.3F, -4.3F);
        this.Upperjaw2.addChild(Righttusk);
        this.setRotateAngle(Righttusk, -1.1037F, -0.1274F, 0.0F);


        this.Lowerjaw1 = new ModelRenderer(this);
        this.Lowerjaw1.setRotationPoint(0.0F, 0.8157F, -0.8426F);
        this.Head.addChild(Lowerjaw1);
        this.setRotateAngle(Lowerjaw1, 1.0267F, 0.0F, 0.0F);


        this.Lowerjaw2 = new ModelRenderer(this);
        this.Lowerjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjaw1.addChild(Lowerjaw2);
        this.setRotateAngle(Lowerjaw2, 0.2972F, 0.0F, 0.0F);


        this.Lowerjaw3 = new ModelRenderer(this);
        this.Lowerjaw3.setRotationPoint(0.0F, 3.0F, -2.0F);
        this.Lowerjaw2.addChild(Lowerjaw3);
        this.setRotateAngle(Lowerjaw3, -0.3609F, 0.0F, 0.0F);


        this.Lowerjaw4 = new ModelRenderer(this);
        this.Lowerjaw4.setRotationPoint(0.01F, 0.0F, -1.4F);
        this.Lowerjaw3.addChild(Lowerjaw4);
        this.setRotateAngle(Lowerjaw4, -0.4882F, 0.0F, 0.0F);


        this.Lowerbeak = new ModelRenderer(this);
        this.Lowerbeak.setRotationPoint(-0.01F, -3.0F, -1.4F);
        this.Lowerjaw3.addChild(Lowerbeak);


        this.Jawparting = new ModelRenderer(this);
        this.Jawparting.setRotationPoint(0.01F, 0.5F, -4.2F);
        this.Lowerjaw1.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.3183F, 0.0F, 0.0F);


        this.Eyes = new ModelRenderer(this);
        this.Eyes.setRotationPoint(0.0F, -2.2843F, -4.2526F);
        this.Head.addChild(Eyes);
        this.setRotateAngle(Eyes, -0.0637F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(3.3F, 5.6388F, -4.2821F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.8469F, 0.1059F, -1.2821F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.8997F, 5.7208F, 0.4243F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.8844F, 0.1959F, 1.3144F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 4.53F, 0.3F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.6746F, 0.0F, -0.0213F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-3.3F, 5.6388F, -4.2821F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.5573F, -0.037F, 1.3937F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.8997F, 5.7208F, 0.4243F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, 0.1086F, -0.1798F, -1.4913F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 4.53F, 0.3F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.0199F, -0.0026F, 0.1522F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.9446F, 16.6702F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.3879F, -0.3662F, 0.1452F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.4F, 1.6037F, 0.0817F);
        this.Tail1.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.0F, -0.0524F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 47, 14, -0.9F, -0.5F, -0.2F, 1, 1, 3, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.3034F, 2.4703F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.2702F, -0.3374F, 0.0914F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.0F, 1.9102F, 0.363F);
        this.Tail2.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.4363F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 50, 27, -0.4F, -0.5F, 0.2F, 1, 1, 2, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.0399F, 2.5309F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.3557F, -0.454F, 0.1615F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 3, 27, -0.5F, 0.5989F, -0.3162F, 1, 1, 2, -0.1F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.9F, 1.9554F, 12.2702F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.4785F, 0.0152F, -1.0078F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(-0.7285F, 5.9161F, -0.1225F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.2508F, -0.2325F, 1.2031F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0752F, 4.6818F, 0.6547F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.0637F, -0.4245F, 0.0213F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.9F, 1.9554F, 12.2702F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.5751F, -0.0299F, 0.7061F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.7285F, 5.9161F, -0.1225F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.5754F, 0.1343F, -0.8622F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(-0.0752F, 4.6818F, 0.6547F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.0637F, 0.4245F, -0.0213F);


        this.bb_main = new ModelRenderer(this);
        this.bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bb_main.cubeList.add(new ModelBox(bb_main, 2, 1, -0.5F, -12.9F, 13.0F, 1, 13, 1, -0.1F, false));
        this.bb_main.cubeList.add(new ModelBox(bb_main, 2, 1, 0.5F, -11.9F, -6.5F, 1, 12, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(1.0F, -8.0F, -6.5F);
        this.bb_main.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, -0.0436F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -2, 1, -4.0F, -1.0F, 0.0F, 8, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -10.0F, 14.0F);
        this.bb_main.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, -0.0436F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -1, 1, -3.0F, -1.0F, -1.0F, 6, 1, 1, -0.1F, false));

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
