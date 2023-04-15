package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPikaia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer root;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodymiddlefront;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Leftantenna;
    private final ModelRenderer Rightantenna;
    private final ModelRenderer Backslope1;
    private final ModelRenderer Rightfrond1;
    private final ModelRenderer Leftfrond1;
    private final ModelRenderer Rightfrond2;
    private final ModelRenderer Leftfrond2;
    private final ModelRenderer Rightfrond3;
    private final ModelRenderer Leftfrond3;
    private final ModelRenderer Rightfrond4;
    private final ModelRenderer Leftfrond4;
    private final ModelRenderer Rightfrond5;
    private final ModelRenderer Leftfrond5;
    private final ModelRenderer Rightfrond6;
    private final ModelRenderer Leftfrond6;
    private final ModelRenderer Rightfrond7;
    private final ModelRenderer Rightfrond10;
    private final ModelRenderer Rightfrond8;
    private final ModelRenderer Leftfrond8;
    private final ModelRenderer Rightfrond9;
    private final ModelRenderer Leftfrond9;
    private final ModelRenderer Backslope2;
    private final ModelRenderer Backslope2_r1;
    private final ModelRenderer Bodymiddleback;
    private final ModelRenderer Bodyback;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailmiddle;
    private final ModelRenderer Tailend;
    private final ModelRenderer Tailslope2;
    private final ModelRenderer Fin5;
    private final ModelRenderer Tailslope1;
    private final ModelRenderer Fin4;
    private final ModelRenderer Fin3;
    private final ModelRenderer Fin2;
    private final ModelRenderer Fin1;
    private final ModelRenderer Backslope3;
    private final ModelRenderer Backslope3_r1;

    public ModelSkeletonPikaia() {
        this.textureWidth = 176;
        this.textureHeight = 155;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-2.7037F, 23.5F, 1.1041F);
        this.fossil.cubeList.add(new ModelBox(fossil, 102, 0, -17.2963F, -0.5F, -47.1041F, 16, 1, 21, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -1.2963F, -0.5F, -29.1041F, 22, 1, 57, 0.002F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-17.2963F, 0.0F, 27.8959F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 64, 59, 0.0F, -0.5F, 0.0F, 26, 1, 24, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-17.2963F, 0.0F, 27.8959F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1396F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 59, 0.0F, -0.5F, -31.0F, 16, 1, 31, -0.002F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.7037F, 0.0F, -13.1041F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1571F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 92, -16.8F, -0.5F, -15.9F, 16, 1, 28, 0.001F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(20.7037F, 0.0F, 28.3959F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 102, 23, -14.0F, -0.5F, -0.5F, 14, 1, 18, -0.001F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(20.7037F, 0.5F, -29.1041F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.8814F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 66, 85, -15.0F, -1.0F, -29.0F, 15, 1, 29, -0.001F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(3.7037F, 2.1F, -5.1041F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.0F, 0.0F, -3.1416F);


        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(-2.0F, 3.8903F, -12.4748F);
        this.root.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.1309F, 0.0F, 1.5708F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 37, 17, -0.9F, -2.5F, -4.5F, 0, 6, 9, 0.0F, false));

        this.Bodymiddlefront = new ModelRenderer(this);
        this.Bodymiddlefront.setRotationPoint(0.0F, 0.4F, -4.0F);
        this.Bodymiddle.addChild(Bodymiddlefront);
        this.setRotateAngle(Bodymiddlefront, -0.1733F, 0.0F, 0.0F);
        this.Bodymiddlefront.cubeList.add(new ModelBox(Bodymiddlefront, 0, 92, -0.7F, -1.0F, -8.0F, 0, 4, 8, 0.0F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(-2.1F, 1.5F, -7.5F);
        this.Bodymiddlefront.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0F, -0.2182F, -1.5708F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 14, 0, -1.1F, 1.3F, -5.0F, 2, 0, 5, 0.0F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(-0.01F, -0.5F, -5.0F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, 0.0F, -0.3054F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 8, 0, -0.4998F, 1.7999F, -0.9886F, 1, 0, 1, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Neck.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 26, 27, -0.9998F, 1.7999F, -0.9886F, 2, 0, 1, 0.0F, false));

        this.Leftantenna = new ModelRenderer(this);
        this.Leftantenna.setRotationPoint(-0.5F, 0.6F, -0.8F);
        this.Head.addChild(Leftantenna);
        this.setRotateAngle(Leftantenna, 0.0F, 0.4033F, 0.0F);
        this.Leftantenna.cubeList.add(new ModelBox(Leftantenna, 0, 4, -1.5067F, 1.1999F, -2.9834F, 2, 0, 3, 0.0F, false));

        this.Rightantenna = new ModelRenderer(this);
        this.Rightantenna.setRotationPoint(0.5F, 0.6F, -0.8F);
        this.Head.addChild(Rightantenna);
        this.setRotateAngle(Rightantenna, 0.0F, -0.4033F, 0.0F);
        this.Rightantenna.cubeList.add(new ModelBox(Rightantenna, 0, 0, -0.4927F, 1.1999F, -2.9837F, 2, 0, 3, 0.0F, false));

        this.Backslope1 = new ModelRenderer(this);
        this.Backslope1.setRotationPoint(-0.01F, -1.7F, -0.4F);
        this.Bodyfront.addChild(Backslope1);
        this.setRotateAngle(Backslope1, 0.4245F, 0.0F, 0.0F);


        this.Rightfrond1 = new ModelRenderer(this);
        this.Rightfrond1.setRotationPoint(0.4F, 1.2F, -4.7F);
        this.Bodyfront.addChild(Rightfrond1);
        this.setRotateAngle(Rightfrond1, 0.0F, 0.5164F, 0.0F);
        this.Rightfrond1.cubeList.add(new ModelBox(Rightfrond1, 20, 26, 0.0F, -0.1F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Leftfrond1 = new ModelRenderer(this);
        this.Leftfrond1.setRotationPoint(-0.8F, 1.2F, -4.7F);
        this.Bodyfront.addChild(Leftfrond1);
        this.setRotateAngle(Leftfrond1, 0.0F, -0.5164F, 0.0F);
        this.Leftfrond1.cubeList.add(new ModelBox(Leftfrond1, 20, 9, -2.0F, -0.1F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Rightfrond2 = new ModelRenderer(this);
        this.Rightfrond2.setRotationPoint(0.4F, 1.2F, -4.2F);
        this.Bodyfront.addChild(Rightfrond2);
        this.setRotateAngle(Rightfrond2, 0.0F, 0.2157F, 0.0F);
        this.Rightfrond2.cubeList.add(new ModelBox(Rightfrond2, 13, 26, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Leftfrond2 = new ModelRenderer(this);
        this.Leftfrond2.setRotationPoint(-1.1F, 1.2F, -4.2F);
        this.Bodyfront.addChild(Leftfrond2);
        this.setRotateAngle(Leftfrond2, 0.0F, -0.2157F, 0.0F);
        this.Leftfrond2.cubeList.add(new ModelBox(Leftfrond2, 20, 7, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Rightfrond3 = new ModelRenderer(this);
        this.Rightfrond3.setRotationPoint(0.4F, 1.2F, -3.7F);
        this.Bodyfront.addChild(Rightfrond3);
        this.setRotateAngle(Rightfrond3, -0.1274F, 0.0637F, 0.0F);
        this.Rightfrond3.cubeList.add(new ModelBox(Rightfrond3, 26, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Leftfrond3 = new ModelRenderer(this);
        this.Leftfrond3.setRotationPoint(-1.1F, 1.2F, -3.7F);
        this.Bodyfront.addChild(Leftfrond3);
        this.setRotateAngle(Leftfrond3, -0.1287F, 0.1527F, -0.0278F);
        this.Leftfrond3.cubeList.add(new ModelBox(Leftfrond3, 14, 10, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Rightfrond4 = new ModelRenderer(this);
        this.Rightfrond4.setRotationPoint(0.4F, 1.2F, -3.2F);
        this.Bodyfront.addChild(Rightfrond4);
        this.setRotateAngle(Rightfrond4, -0.1319F, -0.2596F, 0.034F);
        this.Rightfrond4.cubeList.add(new ModelBox(Rightfrond4, 0, 26, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Leftfrond4 = new ModelRenderer(this);
        this.Leftfrond4.setRotationPoint(-1.1F, 1.2F, -3.2F);
        this.Bodyfront.addChild(Leftfrond4);
        this.setRotateAngle(Leftfrond4, -0.1294F, -0.1731F, 0.0224F);
        this.Leftfrond4.cubeList.add(new ModelBox(Leftfrond4, 14, 8, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Rightfrond5 = new ModelRenderer(this);
        this.Rightfrond5.setRotationPoint(0.4F, 1.2F, -2.7F);
        this.Bodyfront.addChild(Rightfrond5);
        this.setRotateAngle(Rightfrond5, -0.0424F, 0.0F, 0.0F);
        this.Rightfrond5.cubeList.add(new ModelBox(Rightfrond5, 24, 2, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Leftfrond5 = new ModelRenderer(this);
        this.Leftfrond5.setRotationPoint(-1.1F, 1.2F, -2.7F);
        this.Bodyfront.addChild(Leftfrond5);
        this.setRotateAngle(Leftfrond5, -0.0431F, 0.1744F, -0.0075F);
        this.Leftfrond5.cubeList.add(new ModelBox(Leftfrond5, 14, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Rightfrond6 = new ModelRenderer(this);
        this.Rightfrond6.setRotationPoint(0.4F, 1.2F, -2.2F);
        this.Bodyfront.addChild(Rightfrond6);
        this.setRotateAngle(Rightfrond6, -0.0451F, -0.3476F, 0.0136F);
        this.Rightfrond6.cubeList.add(new ModelBox(Rightfrond6, 24, 0, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Leftfrond6 = new ModelRenderer(this);
        this.Leftfrond6.setRotationPoint(-1.1F, 1.2F, -2.2F);
        this.Bodyfront.addChild(Leftfrond6);
        this.setRotateAngle(Leftfrond6, -0.0444F, 0.304F, -0.0115F);
        this.Leftfrond6.cubeList.add(new ModelBox(Leftfrond6, 6, 11, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Rightfrond7 = new ModelRenderer(this);
        this.Rightfrond7.setRotationPoint(0.4F, 1.2F, -1.7F);
        this.Bodyfront.addChild(Rightfrond7);
        this.setRotateAngle(Rightfrond7, -0.0476F, -0.4771F, 0.0183F);
        this.Rightfrond7.cubeList.add(new ModelBox(Rightfrond7, 0, 24, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Rightfrond10 = new ModelRenderer(this);
        this.Rightfrond10.setRotationPoint(-1.2152F, 1.2F, -1.4F);
        this.Bodyfront.addChild(Rightfrond10);
        this.setRotateAngle(Rightfrond10, -0.0423F, 0.046F, -0.0055F);
        this.Rightfrond10.cubeList.add(new ModelBox(Rightfrond10, 0, 10, -1.8189F, 0.0062F, -0.6463F, 2, 0, 1, 0.0F, false));

        this.Rightfrond8 = new ModelRenderer(this);
        this.Rightfrond8.setRotationPoint(0.4F, 1.2F, -1.2F);
        this.Bodyfront.addChild(Rightfrond8);
        this.setRotateAngle(Rightfrond8, -0.0666F, -0.8893F, 0.0455F);
        this.Rightfrond8.cubeList.add(new ModelBox(Rightfrond8, 0, 22, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Leftfrond8 = new ModelRenderer(this);
        this.Leftfrond8.setRotationPoint(-1.0F, 1.2F, -1.2F);
        this.Bodyfront.addChild(Leftfrond8);
        this.setRotateAngle(Leftfrond8, -0.0442F, 0.3229F, -0.0078F);
        this.Leftfrond8.cubeList.add(new ModelBox(Leftfrond8, 6, 9, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Rightfrond9 = new ModelRenderer(this);
        this.Rightfrond9.setRotationPoint(0.4F, 1.2F, -0.7F);
        this.Bodyfront.addChild(Rightfrond9);
        this.setRotateAngle(Rightfrond9, -0.0424F, -0.2122F, 0.0F);
        this.Rightfrond9.cubeList.add(new ModelBox(Rightfrond9, 20, 11, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Leftfrond9 = new ModelRenderer(this);
        this.Leftfrond9.setRotationPoint(-0.9F, 1.2F, -0.7F);
        this.Bodyfront.addChild(Leftfrond9);
        this.setRotateAngle(Leftfrond9, -0.0504F, 0.6045F, -0.0197F);
        this.Leftfrond9.cubeList.add(new ModelBox(Leftfrond9, 0, 8, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Backslope2 = new ModelRenderer(this);
        this.Backslope2.setRotationPoint(0.0F, -3.68F, -0.3F);
        this.Bodymiddlefront.addChild(Backslope2);
        this.setRotateAngle(Backslope2, 0.3449F, 0.0F, 0.0F);


        this.Backslope2_r1 = new ModelRenderer(this);
        this.Backslope2_r1.setRotationPoint(-0.9F, 2.0F, -4.0F);
        this.Backslope2.addChild(Backslope2_r1);
        this.setRotateAngle(Backslope2_r1, -0.0873F, 0.0F, 0.0F);
        this.Backslope2_r1.cubeList.add(new ModelBox(Backslope2_r1, 61, 92, -0.05F, -1.6F, -4.0F, 0, 4, 8, 0.0F, false));

        this.Bodymiddleback = new ModelRenderer(this);
        this.Bodymiddleback.setRotationPoint(0.01F, -1.0F, 4.0F);
        this.Bodymiddle.addChild(Bodymiddleback);
        this.setRotateAngle(Bodymiddleback, 0.1489F, 0.0F, 0.0F);
        this.Bodymiddleback.cubeList.add(new ModelBox(Bodymiddleback, 0, 59, -1.0F, -3.5F, 0.0F, 0, 8, 10, 0.0F, false));

        this.Bodyback = new ModelRenderer(this);
        this.Bodyback.setRotationPoint(-0.01F, 0.0F, 9.5F);
        this.Bodymiddleback.addChild(Bodyback);
        this.setRotateAngle(Bodyback, 0.1096F, 0.0F, 0.0F);
        this.Bodyback.cubeList.add(new ModelBox(Bodyback, 25, 26, -1.0F, -3.5F, 0.0F, 0, 8, 11, 0.0F, false));

        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.01F, 0.0F, 10.5F);
        this.Bodyback.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.1532F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 0, 0, -1.1F, -3.5F, 0.0F, 0, 8, 13, 0.0F, false));

        this.Tailmiddle = new ModelRenderer(this);
        this.Tailmiddle.setRotationPoint(-0.01F, 0.3F, 12.5F);
        this.Tailbase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.1745F, 0.0F, 0.0F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 0, 22, -0.9F, -2.0F, 0.0F, 0, 6, 12, 0.0F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.01F, 0.9F, 11.5F);
        this.Tailmiddle.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.1086F, 0.0F, 0.0F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 40, 38, -1.0F, -1.0F, 0.0F, 0, 4, 8, 0.0F, false));

        this.Tailslope2 = new ModelRenderer(this);
        this.Tailslope2.setRotationPoint(-0.01F, -2.9F, 0.2F);
        this.Tailend.addChild(Tailslope2);
        this.setRotateAngle(Tailslope2, -0.2335F, 0.0F, 0.0F);
        this.Tailslope2.cubeList.add(new ModelBox(Tailslope2, 26, 46, -1.0F, 0.0F, 0.0F, 0, 2, 8, 0.0F, false));

        this.Fin5 = new ModelRenderer(this);
        this.Fin5.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Tailend.addChild(Fin5);
        this.setRotateAngle(Fin5, 0.1274F, 0.0F, 0.0F);
        this.Fin5.cubeList.add(new ModelBox(Fin5, 0, 78, -1.03F, 0.0F, 0.0F, 0, 3, 8, 0.0F, false));

        this.Tailslope1 = new ModelRenderer(this);
        this.Tailslope1.setRotationPoint(0.0F, -3.8F, 0.0F);
        this.Tailmiddle.addChild(Tailslope1);
        this.setRotateAngle(Tailslope1, -0.1485F, 0.0F, 0.0F);
        this.Tailslope1.cubeList.add(new ModelBox(Tailslope1, 0, 41, -1.0F, 0.0F, 0.0F, 0, 3, 12, 0.0F, false));

        this.Fin4 = new ModelRenderer(this);
        this.Fin4.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Tailmiddle.addChild(Fin4);
        this.Fin4.cubeList.add(new ModelBox(Fin4, 28, 0, -1.0F, 0.0F, 0.0F, 0, 3, 12, 0.0F, false));

        this.Fin3 = new ModelRenderer(this);
        this.Fin3.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Tailbase.addChild(Fin3);
        this.Fin3.cubeList.add(new ModelBox(Fin3, 14, 9, -1.0F, 0.0F, 0.0F, 0, 3, 13, 0.0F, false));

        this.Fin2 = new ModelRenderer(this);
        this.Fin2.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Bodyback.addChild(Fin2);
        this.Fin2.cubeList.add(new ModelBox(Fin2, 64, 59, -0.9F, 0.0F, 0.0F, 0, 2, 11, 0.0F, false));

        this.Fin1 = new ModelRenderer(this);
        this.Fin1.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Bodymiddleback.addChild(Fin1);
        this.setRotateAngle(Fin1, -0.0848F, 0.0F, 0.0F);
        this.Fin1.cubeList.add(new ModelBox(Fin1, 13, 41, -1.1F, -1.0F, 0.0F, 0, 1, 10, 0.0F, false));

        this.Backslope3 = new ModelRenderer(this);
        this.Backslope3.setRotationPoint(0.0F, -4.5F, 4.5F);
        this.Bodymiddle.addChild(Backslope3);
        this.setRotateAngle(Backslope3, 0.1114F, 0.0F, 0.0F);


        this.Backslope3_r1 = new ModelRenderer(this);
        this.Backslope3_r1.setRotationPoint(-1.0F, 1.5F, -8.6F);
        this.Backslope3.addChild(Backslope3_r1);
        this.setRotateAngle(Backslope3_r1, 0.1222F, 0.0F, 0.0F);
        this.Backslope3_r1.cubeList.add(new ModelBox(Backslope3_r1, 12, 69, 0.0F, -0.5F, -0.4F, 0, 2, 9, 0.0F, false));

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
