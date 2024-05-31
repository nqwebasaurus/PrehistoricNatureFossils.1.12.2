package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAnteosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Upperfrontteeth;
    private final ModelRenderer Uppersecondfrontteeth;
    private final ModelRenderer Rightupperfang;
    private final ModelRenderer Leftupperfang;
    private final ModelRenderer Upperbackteeth;
    private final ModelRenderer Browslope;
    private final ModelRenderer Headslope;
    private final ModelRenderer Snoutslopebase;
    private final ModelRenderer Snoutslopefront;
    private final ModelRenderer Rightbrowhornfront;
    private final ModelRenderer Rightbrowhornback;
    private final ModelRenderer Leftbrowhornfront;
    private final ModelRenderer Leftbrowhornback;
    private final ModelRenderer Lowerjawbase;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerfrontteeth;
    private final ModelRenderer Lowersecondfrontteeth;
    private final ModelRenderer Rightlowerfang;
    private final ModelRenderer Leftlowerfang;
    private final ModelRenderer Lowerbackteeth;
    private final ModelRenderer Lowerjawslope;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailend;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonAnteosaurusFrame() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(5.3F, -11.25F, -10.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4014F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -5.75F, 0.0F, 1, 18, 1, -0.21F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(5.3F, -11.25F, -10.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4014F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -2.15F, -6.5F, 0.0F, 1, 13, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -11.5F, 8.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0087F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 2.0F, -5.5F, 0.0F, 1, 11, 1, -0.2F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -11.5F, 8.4F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0087F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.5F, -5.5F, 0.0F, 1, 18, 1, -0.21F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 7.7F, 10.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.2546F, 0.0F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, -1.5F, -5.0F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.0698F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 32, -1.0F, 0.0F, -0.6F, 2, 2, 9, -0.2F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -1.6905F, -5.2932F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.2632F, -0.2532F, -0.0674F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 16, -1.0F, 0.1F, -12.0F, 2, 2, 12, -0.2F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.1F, -11.1F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0216F, -0.1745F, -0.0038F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 0.9018F, -7.932F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0873F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 36, 33, -1.0F, 0.0F, 0.0F, 2, 2, 8, -0.2F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.7017F, -7.6405F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.2773F, -0.4369F, -0.0749F);
        this.Neck.cubeList.add(new ModelBox(Neck, 48, 31, -1.0F, 0.1058F, -5.9676F, 2, 2, 7, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.7942F, -4.5676F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.179F, -0.4734F, 0.0823F);


        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, 3.43F, -3.8F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.3396F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(-0.01F, 0.0F, -4.0F);
        this.Upperjawback.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.3183F, 0.0F, 0.0F);


        this.Upperfrontteeth = new ModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, -0.7F, -2.8F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, 0.2122F, 0.0F, 0.0F);


        this.Uppersecondfrontteeth = new ModelRenderer(this);
        this.Uppersecondfrontteeth.setRotationPoint(0.0F, 0.0F, -1.7F);
        this.Upperjawfront.addChild(Uppersecondfrontteeth);
        this.setRotateAngle(Uppersecondfrontteeth, 0.1698F, 0.0F, 0.0F);


        this.Rightupperfang = new ModelRenderer(this);
        this.Rightupperfang.setRotationPoint(1.85F, -0.3F, -0.6F);
        this.Upperjawfront.addChild(Rightupperfang);
        this.setRotateAngle(Rightupperfang, 0.1485F, -0.0424F, -0.0424F);


        this.Leftupperfang = new ModelRenderer(this);
        this.Leftupperfang.setRotationPoint(-1.83F, -0.3F, -0.6F);
        this.Upperjawfront.addChild(Leftupperfang);
        this.setRotateAngle(Leftupperfang, 0.1485F, 0.0424F, 0.0424F);


        this.Upperbackteeth = new ModelRenderer(this);
        this.Upperbackteeth.setRotationPoint(-0.01F, -0.4F, -3.9F);
        this.Upperjawback.addChild(Upperbackteeth);
        this.setRotateAngle(Upperbackteeth, 0.1061F, 0.0F, 0.0F);


        this.Browslope = new ModelRenderer(this);
        this.Browslope.setRotationPoint(0.0F, -2.5F, -3.1F);
        this.Head.addChild(Browslope);
        this.setRotateAngle(Browslope, 0.2972F, 0.0F, 0.0F);


        this.Headslope = new ModelRenderer(this);
        this.Headslope.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Browslope.addChild(Headslope);
        this.setRotateAngle(Headslope, -0.7854F, 0.0F, 0.0F);


        this.Snoutslopebase = new ModelRenderer(this);
        this.Snoutslopebase.setRotationPoint(0.01F, 0.0F, -3.0F);
        this.Browslope.addChild(Snoutslopebase);
        this.setRotateAngle(Snoutslopebase, 0.5308F, 0.0F, 0.0F);


        this.Snoutslopefront = new ModelRenderer(this);
        this.Snoutslopefront.setRotationPoint(-0.01F, 2.0F, -2.9F);
        this.Snoutslopebase.addChild(Snoutslopefront);
        this.setRotateAngle(Snoutslopefront, -0.3187F, 0.0F, 0.0F);


        this.Rightbrowhornfront = new ModelRenderer(this);
        this.Rightbrowhornfront.setRotationPoint(0.85F, 1.8F, -4.0F);
        this.Head.addChild(Rightbrowhornfront);
        this.setRotateAngle(Rightbrowhornfront, 0.9765F, 0.1274F, 0.3183F);


        this.Rightbrowhornback = new ModelRenderer(this);
        this.Rightbrowhornback.setRotationPoint(0.35F, -3.1F, 3.1F);
        this.Rightbrowhornfront.addChild(Rightbrowhornback);
        this.setRotateAngle(Rightbrowhornback, -0.8702F, -0.8278F, 0.8067F);


        this.Leftbrowhornfront = new ModelRenderer(this);
        this.Leftbrowhornfront.setRotationPoint(-0.85F, 1.8F, -4.0F);
        this.Head.addChild(Leftbrowhornfront);
        this.setRotateAngle(Leftbrowhornfront, 0.9765F, -0.1274F, -0.3183F);


        this.Leftbrowhornback = new ModelRenderer(this);
        this.Leftbrowhornback.setRotationPoint(-0.35F, -3.1F, 3.1F);
        this.Leftbrowhornfront.addChild(Leftbrowhornback);
        this.setRotateAngle(Leftbrowhornback, -0.8702F, 0.8278F, -0.8067F);


        this.Lowerjawbase = new ModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 3.5F, -1.0F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 1.0908F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.3396F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.01F, 0.0F, -3.45F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.2759F, 0.0F, 0.0F);


        this.Lowerfrontteeth = new ModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, 0.7F, -2.75F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, 0.0424F, 0.0F, 0.0F);


        this.Lowersecondfrontteeth = new ModelRenderer(this);
        this.Lowersecondfrontteeth.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerjawfront.addChild(Lowersecondfrontteeth);
        this.setRotateAngle(Lowersecondfrontteeth, -0.0424F, 0.0F, 0.0F);


        this.Rightlowerfang = new ModelRenderer(this);
        this.Rightlowerfang.setRotationPoint(1.7F, 0.3F, -0.5F);
        this.Lowerjawfront.addChild(Rightlowerfang);
        this.setRotateAngle(Rightlowerfang, -0.1274F, -0.0424F, 0.0424F);


        this.Leftlowerfang = new ModelRenderer(this);
        this.Leftlowerfang.setRotationPoint(-1.72F, 0.3F, -0.5F);
        this.Lowerjawfront.addChild(Leftlowerfang);
        this.setRotateAngle(Leftlowerfang, -0.1274F, 0.0424F, -0.0424F);


        this.Lowerbackteeth = new ModelRenderer(this);
        this.Lowerbackteeth.setRotationPoint(0.0F, 0.3F, -3.0F);
        this.Lowerjawmiddle.addChild(Lowerbackteeth);
        this.setRotateAngle(Lowerbackteeth, -0.2972F, 0.0F, 0.0F);


        this.Lowerjawslope = new ModelRenderer(this);
        this.Lowerjawslope.setRotationPoint(-0.01F, 2.0F, -2.9F);
        this.Lowerjawbase.addChild(Lowerjawslope);
        this.setRotateAngle(Lowerjawslope, 0.0424F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(5.5F, 9.1318F, -4.932F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.3302F, 0.4708F, -1.0298F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.0754F, 5.4695F, -0.0126F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.5424F, 0.0204F, 1.1289F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.1137F, 6.0079F, -1.2158F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, -0.0223F, 0.0F, 0.0F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-5.5F, 9.1318F, -4.932F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 1.1156F, -0.4708F, 1.0298F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.0754F, 5.4695F, -0.0126F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.106F, -0.0204F, -1.1289F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.1137F, 6.0079F, -1.2158F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.7631F, 0.0F, 0.0F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.9756F, 3.1903F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.3311F, 0.5107F, -0.121F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 17, 26, -1.0F, 0.0815F, -0.3428F, 2, 2, 11, -0.2F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.1606F, 9.848F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, -0.1129F, 0.347F, -0.0385F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 17, 0, -1.0F, -0.0431F, -0.0297F, 2, 2, 11, -0.2F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.4533F, 10.9021F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, -0.1917F, 0.6343F, 0.174F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 19, 14, -0.5F, 0.4125F, -0.2931F, 1, 1, 12, -0.2F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -0.0702F, 10.9063F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.2452F, 0.8636F, 0.146F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 0, 0, -0.5F, 0.48F, -0.0358F, 1, 1, 14, -0.2F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(4.5F, 2.56F, -0.5F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.3177F, -0.5573F, -0.2592F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.0201F, 6.8883F, -2.0223F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.7275F, -0.0323F, 0.0811F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 6.5F, 2.2F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.296F, 0.0F, 0.0F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-4.5F, 2.56F, -0.5F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.0123F, 0.5573F, 0.2592F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.0201F, 6.8883F, -2.0223F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.3785F, 0.0323F, -0.0811F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 6.5F, 2.2F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.0778F, 0.0F, 0.0F);

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
