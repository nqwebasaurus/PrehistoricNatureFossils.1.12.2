package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonRubidgeaFrame extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Belly;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjaw1;
    private final ModelRenderer Upperjaw3;
    private final ModelRenderer Nose;
    private final ModelRenderer Upperjawteeth2;
    private final ModelRenderer Leftsabre;
    private final ModelRenderer Rightsabre;
    private final ModelRenderer Upperjawteeth1;
    private final ModelRenderer Lowerjaw1;
    private final ModelRenderer Lowerjaw2;
    private final ModelRenderer Lowerjaw3;
    private final ModelRenderer Lowerjawteeth2;
    private final ModelRenderer Lowerjawteeth4;
    private final ModelRenderer Lowerjawteeth3;
    private final ModelRenderer Lowerjawteeth1;
    private final ModelRenderer Jawparting;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer Tail4;

    public ModelSkeletonRubidgeaFrame() {
        this.textureWidth = 95;
        this.textureHeight = 95;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -2.6435F, 2.0F);
        this.root.cubeList.add(new ModelBox(root, 1, 1, -0.5F, 5.7435F, 12.0F, 1, 21, 1, -0.1F, false));
        this.root.cubeList.add(new ModelBox(root, -3, 1, -4.5F, 5.8935F, 12.0F, 9, 1, 1, -0.1F, false));
        this.root.cubeList.add(new ModelBox(root, 1, 1, -2.0F, 6.7435F, -16.502F, 1, 20, 1, -0.1F, false));
        this.root.cubeList.add(new ModelBox(root, -3, 1, -6.5F, 11.8935F, -16.5F, 10, 1, 1, -0.1F, false));

        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 3.6185F, 7.0116F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1274F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 21, -0.5F, 1.2257F, -0.3166F, 1, 1, 13, -0.1F, false));

        this.Belly = new ModelRenderer(this);
        this.Belly.setRotationPoint(0.0F, 0.2234F, -0.3065F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.1062F, 0.0434F, 0.0046F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.5F, 24.2547F, -6.6348F);
        this.Belly.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.0524F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 0, 0, -1.0F, -22.8843F, -9.9913F, 1, 1, 18, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 1.0188F, -17.7508F);
        this.Belly.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0639F, 0.0871F, 0.0056F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.5F, 2.9868F, -7.8092F);
        this.Bodyfront.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.1309F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 43, 34, -1.0F, -1.0345F, -0.4275F, 1, 1, 9, -0.1F, false));

        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(4.3304F, 7.166F, -4.6843F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.0929F, 0.1244F, -0.2309F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-0.2558F, 6.1319F, 0.5551F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.6783F, 0.0153F, 0.2534F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.5F, 7.2159F, -0.333F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.5013F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(-4.3304F, 7.166F, -4.6843F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 1.035F, -0.2754F, 0.3204F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.2558F, 6.1319F, 0.5551F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -1.379F, 0.0352F, -0.5104F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.5F, 7.2159F, -0.333F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.9376F, 0.0F, 0.0F);


        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.7941F, -7.4614F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.1311F, 0.4659F, -0.1199F);
        this.Neck.cubeList.add(new ModelBox(Neck, 59, 11, -0.5F, 1.2562F, -7.0501F, 1, 1, 7, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.1984F, -6.711F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.4837F, 0.2422F, 0.0448F);


        this.Upperjaw1 = new ModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, -1.6652F, -6.6609F);
        this.Head.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, 0.1485F, 0.0F, 0.0F);


        this.Upperjaw3 = new ModelRenderer(this);
        this.Upperjaw3.setRotationPoint(0.0F, 0.0F, -6.2168F);
        this.Upperjaw1.addChild(Upperjaw3);
        this.setRotateAngle(Upperjaw3, -0.1061F, 0.0F, 0.0F);


        this.Nose = new ModelRenderer(this);
        this.Nose.setRotationPoint(0.0F, 0.0F, -2.2203F);
        this.Upperjaw3.addChild(Nose);
        this.setRotateAngle(Nose, 0.2972F, 0.0F, 0.0F);


        this.Upperjawteeth2 = new ModelRenderer(this);
        this.Upperjawteeth2.setRotationPoint(0.0F, 3.8855F, -1.9983F);
        this.Upperjaw3.addChild(Upperjawteeth2);
        this.setRotateAngle(Upperjawteeth2, 0.1061F, 0.0F, 0.0F);


        this.Leftsabre = new ModelRenderer(this);
        this.Leftsabre.setRotationPoint(2.1093F, 4.4406F, -6.2168F);
        this.Upperjaw1.addChild(Leftsabre);
        this.setRotateAngle(Leftsabre, 0.0201F, 0.0F, 0.0F);


        this.Rightsabre = new ModelRenderer(this);
        this.Rightsabre.setRotationPoint(-2.1093F, 4.4406F, -6.2168F);
        this.Upperjaw1.addChild(Rightsabre);
        this.setRotateAngle(Rightsabre, 0.0201F, 0.0F, 0.0F);


        this.Upperjawteeth1 = new ModelRenderer(this);
        this.Upperjawteeth1.setRotationPoint(0.0F, 4.4406F, -4.8846F);
        this.Upperjaw1.addChild(Upperjawteeth1);
        this.setRotateAngle(Upperjawteeth1, 0.1061F, 0.0F, 0.0F);


        this.Lowerjaw1 = new ModelRenderer(this);
        this.Lowerjaw1.setRotationPoint(0.0F, 2.7754F, -1.1101F);
        this.Head.addChild(Lowerjaw1);
        this.setRotateAngle(Lowerjaw1, 0.5672F, 0.0F, 0.0F);


        this.Lowerjaw2 = new ModelRenderer(this);
        this.Lowerjaw2.setRotationPoint(0.0F, 0.0F, -5.5507F);
        this.Lowerjaw1.addChild(Lowerjaw2);
        this.setRotateAngle(Lowerjaw2, 0.1485F, 0.0F, 0.0F);


        this.Lowerjaw3 = new ModelRenderer(this);
        this.Lowerjaw3.setRotationPoint(0.0F, 0.111F, -4.7736F);
        this.Lowerjaw2.addChild(Lowerjaw3);
        this.setRotateAngle(Lowerjaw3, -0.1274F, 0.0F, 0.0F);


        this.Lowerjawteeth2 = new ModelRenderer(this);
        this.Lowerjawteeth2.setRotationPoint(0.0F, 0.5551F, -3.5525F);
        this.Lowerjaw3.addChild(Lowerjawteeth2);
        this.setRotateAngle(Lowerjawteeth2, -0.0213F, 0.0F, 0.0F);


        this.Lowerjawteeth4 = new ModelRenderer(this);
        this.Lowerjawteeth4.setRotationPoint(0.0F, 0.5551F, -3.5525F);
        this.Lowerjaw3.addChild(Lowerjawteeth4);
        this.setRotateAngle(Lowerjawteeth4, -0.0213F, 0.0F, 0.0F);


        this.Lowerjawteeth3 = new ModelRenderer(this);
        this.Lowerjawteeth3.setRotationPoint(0.0F, 0.5551F, -3.5525F);
        this.Lowerjaw3.addChild(Lowerjawteeth3);
        this.setRotateAngle(Lowerjawteeth3, -0.0213F, 0.0F, 0.0F);


        this.Lowerjawteeth1 = new ModelRenderer(this);
        this.Lowerjawteeth1.setRotationPoint(0.0F, 0.0F, -5.8985F);
        this.Lowerjaw2.addChild(Lowerjawteeth1);
        this.setRotateAngle(Lowerjawteeth1, -0.0377F, 0.0F, 0.0F);


        this.Jawparting = new ModelRenderer(this);
        this.Jawparting.setRotationPoint(0.0F, 0.222F, -5.3287F);
        this.Lowerjaw1.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.4882F, 0.0F, 0.0F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(3.3304F, 2.1538F, 5.6764F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.4198F, 0.0F, 0.0F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.7101F, 10.4491F, -1.5218F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.7076F, 0.0F, 0.0F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.5F, 8.8812F, 2.9974F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 0.2217F, 0.0F, 0.0F);


        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(-3.3304F, 2.1538F, 5.6764F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.322F, 0.0F, 0.0F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(-0.7101F, 10.4491F, -1.5218F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.5767F, 0.0F, 0.0F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(-0.5F, 8.8812F, 2.9974F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.0401F, 0.0F, 0.0F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.1547F, 12.25F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.4621F, -0.2751F, 0.1345F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 57, 48, -0.5F, 0.9743F, 0.3207F, 1, 1, 8, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0407F, 7.8918F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.1867F, -0.1286F, 0.0242F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 58, 27, -0.5F, 0.9302F, -0.3008F, 1, 1, 7, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.3231F, 6.5601F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0246F, -0.5235F, -0.0123F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, 1.7336F, -0.6532F);
        this.Tail3.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.0873F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 13, 58, -0.5F, -0.5F, 0.0F, 1, 1, 8, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.0256F, 7.1178F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.026F, -0.6107F, -0.0149F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 44, 24, -0.5F, 0.5542F, 0.0F, 1, 1, 8, -0.1F, false));

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
