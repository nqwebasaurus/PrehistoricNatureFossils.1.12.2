package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonParexus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer root;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Bodyfrontslope;
    private final ModelRenderer Bodyfrontslope_r1;
    private final ModelRenderer Bigdorsalspinebase;
    private final ModelRenderer Bigdorsalspineend;
    private final ModelRenderer Dorsalspineserrations;
    private final ModelRenderer Dorsalspineserrations_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Head_r1;
    private final ModelRenderer Headfront;
    private final ModelRenderer Headfront_r1;
    private final ModelRenderer Headfront_r2;
    private final ModelRenderer Nose;
    private final ModelRenderer Nose_r1;
    private final ModelRenderer Upperjaw;
    private final ModelRenderer Upperjaw_r1;
    private final ModelRenderer Headslope;
    private final ModelRenderer Headslope_r1;
    private final ModelRenderer Lowerjaw;
    private final ModelRenderer Lowerjaw_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodyend;
    private final ModelRenderer Bodyend_r1;
    private final ModelRenderer Bodyendslope;
    private final ModelRenderer Bodyendslope_r1;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailbase_r1;
    private final ModelRenderer Tailbaseslope;
    private final ModelRenderer Tailbaseslope_r1;
    private final ModelRenderer Seconddorsalfin;
    private final ModelRenderer Seconddorsalfin_r1;
    private final ModelRenderer Tailmiddle;
    private final ModelRenderer Tailmiddle_r1;
    private final ModelRenderer Tailend;
    private final ModelRenderer Tailend_r1;
    private final ModelRenderer Tailfin;
    private final ModelRenderer Tailfin_r1;
    private final ModelRenderer Analfin;
    private final ModelRenderer Analfin_r1;
    private final ModelRenderer Rightpelvicfin;
    private final ModelRenderer Rightpelvicfin_r1;
    private final ModelRenderer Firstdorsalfin;
    private final ModelRenderer Firstdorsalfin_r1;
    private final ModelRenderer Bellyspines;
    private final ModelRenderer Bellyspines_r1;
    private final ModelRenderer Leftpectoralspinebase;
    private final ModelRenderer Leftpectoralspineend;
    private final ModelRenderer Rightpectoralspinebase;
    private final ModelRenderer Rightpectoralspineend;

    public ModelSkeletonParexus() {
        this.textureWidth = 240;
        this.textureHeight = 170;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(3.0F, 24.0F, -1.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-36.5F, -1.0F, 8.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4189F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 104, 0.0879F, -1.0F, -48.7678F, 29, 2, 49, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(19.5F, -1.0F, 30.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -3.0107F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 102, 104, -11.0334F, -1.0F, -0.1185F, 11, 2, 55, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-27.5F, -1.0F, 7.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.4399F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.0954F, -1.0F, -43.7143F, 29, 2, 53, -0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.5F, -1.0F, 0.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 56, -20.5F, -1.0F, -32.0F, 41, 2, 45, 0.003F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 17.0F, -6.0F);
        this.root.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0F, 0.0F, -1.5708F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-4.4F, 3.0F, -4.5F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0F, 0.0F, -3.1416F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 0, 0, 0.0F, -4.0F, -4.5F, 0, 8, 9, 0.0F, false));

        this.Bodyfrontslope = new ModelRenderer(this);
        this.Bodyfrontslope.setRotationPoint(0.0F, -6.0F, -0.5F);
        this.Bodyfront.addChild(Bodyfrontslope);
        this.setRotateAngle(Bodyfrontslope, 0.3044F, 0.0F, 0.0F);


        this.Bodyfrontslope_r1 = new ModelRenderer(this);
        this.Bodyfrontslope_r1.setRotationPoint(-4.5F, 3.0F, -4.5F);
        this.Bodyfrontslope.addChild(Bodyfrontslope_r1);
        this.setRotateAngle(Bodyfrontslope_r1, 0.0F, 0.0F, -3.1416F);
        this.Bodyfrontslope_r1.cubeList.add(new ModelBox(Bodyfrontslope_r1, 17, 104, 0.0F, -3.0F, -4.5F, 0, 6, 9, 0.0F, false));

        this.Bigdorsalspinebase = new ModelRenderer(this);
        this.Bigdorsalspinebase.setRotationPoint(-4.8F, 0.0F, -6.0F);
        this.Bodyfrontslope.addChild(Bigdorsalspinebase);
        this.setRotateAngle(Bigdorsalspinebase, 0.4705F, 0.0F, 0.0F);
        this.Bigdorsalspinebase.cubeList.add(new ModelBox(Bigdorsalspinebase, 0, 34, -1.4F, 0.0F, 0.0F, 2, 3, 15, 0.0F, false));

        this.Bigdorsalspineend = new ModelRenderer(this);
        this.Bigdorsalspineend.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.Bigdorsalspinebase.addChild(Bigdorsalspineend);
        this.setRotateAngle(Bigdorsalspineend, -0.1485F, 0.0F, 0.0F);
        this.Bigdorsalspineend.cubeList.add(new ModelBox(Bigdorsalspineend, 0, 56, -0.5F, 0.0F, 0.0F, 1, 2, 13, 0.0F, false));

        this.Dorsalspineserrations = new ModelRenderer(this);
        this.Dorsalspineserrations.setRotationPoint(0.0F, 1.7F, 0.7F);
        this.Bigdorsalspineend.addChild(Dorsalspineserrations);
        this.setRotateAngle(Dorsalspineserrations, 0.0424F, 0.0F, 0.0F);


        this.Dorsalspineserrations_r1 = new ModelRenderer(this);
        this.Dorsalspineserrations_r1.setRotationPoint(-0.1F, 0.5F, 5.5F);
        this.Dorsalspineserrations.addChild(Dorsalspineserrations_r1);
        this.setRotateAngle(Dorsalspineserrations_r1, 0.0F, 0.0F, -3.1416F);
        this.Dorsalspineserrations_r1.cubeList.add(new ModelBox(Dorsalspineserrations_r1, 15, 81, 0.0F, -0.5F, -5.5F, 0, 1, 11, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, 1.9F, -9.1F);
        this.Bodyfront.addChild(Head);
        this.setRotateAngle(Head, -0.1958F, 0.0F, 0.0F);


        this.Head_r1 = new ModelRenderer(this);
        this.Head_r1.setRotationPoint(-4.5F, 1.5F, -2.0F);
        this.Head.addChild(Head_r1);
        this.setRotateAngle(Head_r1, 0.0F, 0.0F, -3.1416F);
        this.Head_r1.cubeList.add(new ModelBox(Head_r1, 30, 56, 0.0F, -3.5F, -3.0F, 0, 7, 6, 0.0F, false));

        this.Headfront = new ModelRenderer(this);
        this.Headfront.setRotationPoint(-0.01F, -3.4F, -5.0F);
        this.Head.addChild(Headfront);
        this.setRotateAngle(Headfront, 0.4458F, 0.0F, 0.0F);


        this.Headfront_r1 = new ModelRenderer(this);
        this.Headfront_r1.setRotationPoint(-4.5F, 2.5F, -5.5F);
        this.Headfront.addChild(Headfront_r1);
        this.setRotateAngle(Headfront_r1, 0.0F, 0.0F, -3.1416F);
        this.Headfront_r1.cubeList.add(new ModelBox(Headfront_r1, 0, 0, 0.0F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.Headfront_r2 = new ModelRenderer(this);
        this.Headfront_r2.setRotationPoint(-4.6F, 2.5F, -3.5F);
        this.Headfront.addChild(Headfront_r2);
        this.setRotateAngle(Headfront_r2, 0.0F, 0.0F, -3.1416F);
        this.Headfront_r2.cubeList.add(new ModelBox(Headfront_r2, 0, 34, 0.0F, -2.5F, -3.5F, 0, 5, 7, 0.0F, false));

        this.Nose = new ModelRenderer(this);
        this.Nose.setRotationPoint(0.0F, 0.0F, -6.6F);
        this.Headfront.addChild(Nose);
        this.setRotateAngle(Nose, 0.2546F, 0.0F, 0.0F);


        this.Nose_r1 = new ModelRenderer(this);
        this.Nose_r1.setRotationPoint(-4.7F, 2.0F, -1.0F);
        this.Nose.addChild(Nose_r1);
        this.setRotateAngle(Nose_r1, 0.0F, 0.0F, -3.1416F);
        this.Nose_r1.cubeList.add(new ModelBox(Nose_r1, 10, 0, 0.0F, -2.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.Upperjaw = new ModelRenderer(this);
        this.Upperjaw.setRotationPoint(-0.01F, 4.7F, -7.0F);
        this.Headfront.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, -0.2759F, 0.0F, 0.0F);


        this.Upperjaw_r1 = new ModelRenderer(this);
        this.Upperjaw_r1.setRotationPoint(-4.7F, -0.5F, 2.5F);
        this.Upperjaw.addChild(Upperjaw_r1);
        this.setRotateAngle(Upperjaw_r1, 0.0F, 0.0F, -3.1416F);
        this.Upperjaw_r1.cubeList.add(new ModelBox(Upperjaw_r1, 16, 61, 0.0F, -0.5F, -2.5F, 0, 1, 5, 0.0F, false));

        this.Headslope = new ModelRenderer(this);
        this.Headslope.setRotationPoint(0.0F, -5.35F, 0.4F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.3484F, 0.0F, 0.0F);


        this.Headslope_r1 = new ModelRenderer(this);
        this.Headslope_r1.setRotationPoint(-4.6F, 2.0F, -3.0F);
        this.Headslope.addChild(Headslope_r1);
        this.setRotateAngle(Headslope_r1, 0.0F, 0.0F, -3.1416F);
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 0, 56, 0.0F, -2.0F, -3.0F, 0, 4, 6, 0.0F, false));

        this.Lowerjaw = new ModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.01F, 4.1F, -1.5F);
        this.Head.addChild(Lowerjaw);


        this.Lowerjaw_r1 = new ModelRenderer(this);
        this.Lowerjaw_r1.setRotationPoint(-4.8F, 0.0F, -4.0F);
        this.Lowerjaw.addChild(Lowerjaw_r1);
        this.setRotateAngle(Lowerjaw_r1, 0.0F, 0.0F, -3.1416F);
        this.Lowerjaw_r1.cubeList.add(new ModelBox(Lowerjaw_r1, 27, 81, 0.0F, -1.0F, -4.0F, 0, 2, 8, 0.0F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.01F, -1.9F, -1.0F);
        this.Bodyfront.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1309F, 0.0F, 0.0F);


        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(-4.3F, 2.5F, 3.5F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, 0.0F, 0.0F, -3.1416F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 0, 72, 0.0F, -6.5F, -3.5F, 0, 13, 7, 0.0F, false));

        this.Bodyend = new ModelRenderer(this);
        this.Bodyend.setRotationPoint(0.0F, 2.9F, 6.0F);
        this.Bodymiddle.addChild(Bodyend);
        this.setRotateAngle(Bodyend, 0.1522F, 0.0F, 0.0F);


        this.Bodyend_r1 = new ModelRenderer(this);
        this.Bodyend_r1.setRotationPoint(-4.4F, 2.0F, 4.5F);
        this.Bodyend.addChild(Bodyend_r1);
        this.setRotateAngle(Bodyend_r1, 0.0F, 0.0F, -3.1416F);
        this.Bodyend_r1.cubeList.add(new ModelBox(Bodyend_r1, 20, 63, 0.0F, -4.0F, -4.5F, 0, 8, 9, 0.0F, false));

        this.Bodyendslope = new ModelRenderer(this);
        this.Bodyendslope.setRotationPoint(0.0F, -6.9F, 0.5F);
        this.Bodyend.addChild(Bodyendslope);
        this.setRotateAngle(Bodyendslope, -0.2759F, 0.0F, 0.0F);


        this.Bodyendslope_r1 = new ModelRenderer(this);
        this.Bodyendslope_r1.setRotationPoint(-4.5F, 2.5F, 4.5F);
        this.Bodyendslope.addChild(Bodyendslope_r1);
        this.setRotateAngle(Bodyendslope_r1, 0.0F, 0.0F, -3.1416F);
        this.Bodyendslope_r1.cubeList.add(new ModelBox(Bodyendslope_r1, 27, 111, 0.0F, -2.5F, -4.5F, 0, 5, 9, 0.0F, false));

        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 3.0F, 8.0F);
        this.Bodyend.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.2819F, 0.0F, 0.0F);


        this.Tailbase_r1 = new ModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(-4.5F, 0.0F, 4.0F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, 0.0F, 0.0F, -3.1416F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 112, 0, 0.0F, -3.0F, -4.0F, 0, 6, 8, 0.0F, false));

        this.Tailbaseslope = new ModelRenderer(this);
        this.Tailbaseslope.setRotationPoint(0.0F, -7.7F, 0.6F);
        this.Tailbase.addChild(Tailbaseslope);
        this.setRotateAngle(Tailbaseslope, -0.3908F, 0.0F, 0.0F);


        this.Tailbaseslope_r1 = new ModelRenderer(this);
        this.Tailbaseslope_r1.setRotationPoint(-4.6F, 2.5F, 4.5F);
        this.Tailbaseslope.addChild(Tailbaseslope_r1);
        this.setRotateAngle(Tailbaseslope_r1, 0.0F, 0.0F, -3.1416F);
        this.Tailbaseslope_r1.cubeList.add(new ModelBox(Tailbaseslope_r1, 108, 104, 0.0F, -2.5F, -4.5F, 0, 5, 9, 0.0F, false));

        this.Seconddorsalfin = new ModelRenderer(this);
        this.Seconddorsalfin.setRotationPoint(-4.7F, 0.0F, -0.5F);
        this.Tailbaseslope.addChild(Seconddorsalfin);
        this.setRotateAngle(Seconddorsalfin, 0.9976F, 0.0F, 0.0F);


        this.Seconddorsalfin_r1 = new ModelRenderer(this);
        this.Seconddorsalfin_r1.setRotationPoint(0.0F, 4.5F, 5.0F);
        this.Seconddorsalfin.addChild(Seconddorsalfin_r1);
        this.setRotateAngle(Seconddorsalfin_r1, 0.0F, 0.0F, -3.1416F);
        this.Seconddorsalfin_r1.cubeList.add(new ModelBox(Seconddorsalfin_r1, 31, 24, 0.0F, -4.5F, -5.0F, 0, 9, 10, 0.0F, false));

        this.Tailmiddle = new ModelRenderer(this);
        this.Tailmiddle.setRotationPoint(-0.01F, -2.4F, 7.5F);
        this.Tailbase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.0908F, 0.0F, 0.0F);


        this.Tailmiddle_r1 = new ModelRenderer(this);
        this.Tailmiddle_r1.setRotationPoint(-4.6F, 1.5F, 2.0F);
        this.Tailmiddle.addChild(Tailmiddle_r1);
        this.setRotateAngle(Tailmiddle_r1, 0.0F, 0.0F, -3.1416F);
        this.Tailmiddle_r1.cubeList.add(new ModelBox(Tailmiddle_r1, 42, 18, 0.0F, -3.5F, -2.0F, 0, 7, 4, 0.0F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -1.0F, 3.5F);
        this.Tailmiddle.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.4753F, 0.0F, 0.0F);


        this.Tailend_r1 = new ModelRenderer(this);
        this.Tailend_r1.setRotationPoint(-4.5F, 0.0F, 7.5F);
        this.Tailend.addChild(Tailend_r1);
        this.setRotateAngle(Tailend_r1, 0.0F, 0.0F, -3.1416F);
        this.Tailend_r1.cubeList.add(new ModelBox(Tailend_r1, 21, 0, 0.0F, -1.0F, -7.5F, 0, 2, 15, 0.0F, false));

        this.Tailfin = new ModelRenderer(this);
        this.Tailfin.setRotationPoint(0.0F, -3.0F, -1.0F);
        this.Tailend.addChild(Tailfin);
        this.setRotateAngle(Tailfin, -0.1222F, 0.0F, 0.0F);


        this.Tailfin_r1 = new ModelRenderer(this);
        this.Tailfin_r1.setRotationPoint(-4.8F, 6.5F, 10.0F);
        this.Tailfin.addChild(Tailfin_r1);
        this.setRotateAngle(Tailfin_r1, 0.0F, 0.0F, -3.1416F);
        this.Tailfin_r1.cubeList.add(new ModelBox(Tailfin_r1, 0, 0, 0.0F, -6.5F, -10.0F, 0, 13, 20, 0.0F, false));

        this.Analfin = new ModelRenderer(this);
        this.Analfin.setRotationPoint(-5.0F, 3.0F, 3.5F);
        this.Tailbase.addChild(Analfin);
        this.setRotateAngle(Analfin, 0.4245F, 0.0F, 0.0F);


        this.Analfin_r1 = new ModelRenderer(this);
        this.Analfin_r1.setRotationPoint(0.0F, 3.5F, 3.0F);
        this.Analfin.addChild(Analfin_r1);
        this.setRotateAngle(Analfin_r1, 0.0F, 3.1416F, 0.0F);
        this.Analfin_r1.cubeList.add(new ModelBox(Analfin_r1, 37, 0, 0.0F, -3.5F, -3.0F, 0, 7, 6, 0.0F, false));

        this.Rightpelvicfin = new ModelRenderer(this);
        this.Rightpelvicfin.setRotationPoint(-4.5F, 6.0F, 4.0F);
        this.Bodyend.addChild(Rightpelvicfin);
        this.setRotateAngle(Rightpelvicfin, 0.48F, 0.0F, 0.0F);


        this.Rightpelvicfin_r1 = new ModelRenderer(this);
        this.Rightpelvicfin_r1.setRotationPoint(0.0F, 3.5F, 3.5F);
        this.Rightpelvicfin.addChild(Rightpelvicfin_r1);
        this.setRotateAngle(Rightpelvicfin_r1, 0.0F, 3.1416F, 0.0F);
        this.Rightpelvicfin_r1.cubeList.add(new ModelBox(Rightpelvicfin_r1, 21, 0, 0.2F, -3.5F, -3.5F, 0, 7, 7, 0.0F, false));

        this.Firstdorsalfin = new ModelRenderer(this);
        this.Firstdorsalfin.setRotationPoint(-4.1F, -4.5F, 2.0F);
        this.Bodymiddle.addChild(Firstdorsalfin);
        this.setRotateAngle(Firstdorsalfin, -0.8915F, 0.0F, 0.0F);


        this.Firstdorsalfin_r1 = new ModelRenderer(this);
        this.Firstdorsalfin_r1.setRotationPoint(-0.7F, -3.5F, 4.0F);
        this.Firstdorsalfin.addChild(Firstdorsalfin_r1);
        this.setRotateAngle(Firstdorsalfin_r1, 0.0F, 3.1416F, 0.0F);
        this.Firstdorsalfin_r1.cubeList.add(new ModelBox(Firstdorsalfin_r1, 0, 104, 0.0F, -4.5F, -4.0F, 0, 9, 8, 0.0F, false));

        this.Bellyspines = new ModelRenderer(this);
        this.Bellyspines.setRotationPoint(0.0F, 8.5F, -0.8F);
        this.Bodymiddle.addChild(Bellyspines);
        this.setRotateAngle(Bellyspines, 0.0424F, 0.0F, 0.0F);


        this.Bellyspines_r1 = new ModelRenderer(this);
        this.Bellyspines_r1.setRotationPoint(-4.6F, 1.5F, 4.5F);
        this.Bellyspines.addChild(Bellyspines_r1);
        this.setRotateAngle(Bellyspines_r1, 0.0F, 0.0F, -3.1416F);
        this.Bellyspines_r1.cubeList.add(new ModelBox(Bellyspines_r1, 20, 35, 0.0F, -1.5F, -4.5F, 0, 3, 9, 0.0F, false));

        this.Leftpectoralspinebase = new ModelRenderer(this);
        this.Leftpectoralspinebase.setRotationPoint(-5.3F, 22.4F, -16.0F);
        this.Bodyfront.addChild(Leftpectoralspinebase);
        this.setRotateAngle(Leftpectoralspinebase, -3.1416F, 0.5672F, 1.5708F);
        this.Leftpectoralspinebase.cubeList.add(new ModelBox(Leftpectoralspinebase, 16, 56, -5.0F, -1.2F, 0.0F, 5, 2, 2, 0.0F, false));

        this.Leftpectoralspineend = new ModelRenderer(this);
        this.Leftpectoralspineend.setRotationPoint(-5.0F, 0.0F, 0.1F);
        this.Leftpectoralspinebase.addChild(Leftpectoralspineend);
        this.setRotateAngle(Leftpectoralspineend, 0.0F, 0.1911F, 0.0F);
        this.Leftpectoralspineend.cubeList.add(new ModelBox(Leftpectoralspineend, 0, 93, -6.0F, -0.5F, 0.0F, 6, 1, 1, 0.0F, false));

        this.Rightpectoralspinebase = new ModelRenderer(this);
        this.Rightpectoralspinebase.setRotationPoint(-4.8F, 6.0F, -8.0F);
        this.Bodyfront.addChild(Rightpectoralspinebase);
        this.setRotateAngle(Rightpectoralspinebase, 0.0F, -0.7418F, 1.5708F);
        this.Rightpectoralspinebase.cubeList.add(new ModelBox(Rightpectoralspinebase, 37, 46, 0.0F, -0.7F, 0.0F, 5, 2, 2, 0.0F, false));

        this.Rightpectoralspineend = new ModelRenderer(this);
        this.Rightpectoralspineend.setRotationPoint(5.0F, 0.0F, 0.1F);
        this.Rightpectoralspinebase.addChild(Rightpectoralspineend);
        this.setRotateAngle(Rightpectoralspineend, 0.0F, -0.1911F, 0.0F);
        this.Rightpectoralspineend.cubeList.add(new ModelBox(Rightpectoralspineend, 15, 94, 0.0F, -0.5F, 0.0F, 6, 1, 1, 0.0F, false));

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
