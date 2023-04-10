package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCrotalocephalus extends ModelBase {
    private final ModelRenderer Rock;
    private final ModelRenderer Crotalocephalus;
    private final ModelRenderer Cephalon3;
    private final ModelRenderer Librigena_r1;
    private final ModelRenderer Librigena_r2;
    private final ModelRenderer Librigena_r3;
    private final ModelRenderer Librigena_r4;
    private final ModelRenderer Librigena_r5;
    private final ModelRenderer Librigena_r6;
    private final ModelRenderer Glabella_r1;
    private final ModelRenderer Thorax2;
    private final ModelRenderer ThoracicSegment6;
    private final ModelRenderer PleuralBand3_r1;
    private final ModelRenderer PleuralBand2_r1;
    private final ModelRenderer PleuralBand2_r2;
    private final ModelRenderer PleuralBand1_r1;
    private final ModelRenderer LegL6;
    private final ModelRenderer LegL5;
    private final ModelRenderer ThoracicSegment7;
    private final ModelRenderer PleuralBand4_r1;
    private final ModelRenderer PleuralBand3_r2;
    private final ModelRenderer PleuralBand3_r3;
    private final ModelRenderer PleuralBand2_r3;
    private final ModelRenderer LegL7;
    private final ModelRenderer LegL10;
    private final ModelRenderer ThoracicSegment8;
    private final ModelRenderer PleuralBand5_r1;
    private final ModelRenderer PleuralBand4_r2;
    private final ModelRenderer PleuralBand4_r3;
    private final ModelRenderer PleuralBand3_r4;
    private final ModelRenderer LegL8;
    private final ModelRenderer LegL11;
    private final ModelRenderer ThoracicSegment9;
    private final ModelRenderer PleuralBand6_r1;
    private final ModelRenderer PleuralBand5_r2;
    private final ModelRenderer PleuralBand5_r3;
    private final ModelRenderer PleuralBand4_r4;
    private final ModelRenderer LegL9;
    private final ModelRenderer LegL12;
    private final ModelRenderer ThoracicSegment2;
    private final ModelRenderer PleuralBand7_r1;
    private final ModelRenderer PleuralBand6_r2;
    private final ModelRenderer PleuralBand6_r3;
    private final ModelRenderer PleuralBand5_r4;
    private final ModelRenderer LegL2;
    private final ModelRenderer LegL13;
    private final ModelRenderer ThoracicSegment3;
    private final ModelRenderer PleuralBand11_r1;
    private final ModelRenderer PleuralBand10_r1;
    private final ModelRenderer PleuralBand10_r2;
    private final ModelRenderer PleuralBand9_r1;
    private final ModelRenderer PleuralBand9_r2;
    private final ModelRenderer PleuralBand8_r1;
    private final ModelRenderer PleuralBand8_r2;
    private final ModelRenderer PleuralBand7_r2;
    private final ModelRenderer PleuralBand7_r3;
    private final ModelRenderer PleuralBand6_r4;
    private final ModelRenderer LegL3;
    private final ModelRenderer LegL4;

    public ModelSkeletonCrotalocephalus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Rock = new ModelRenderer(this);
        this.Rock.setRotationPoint(0.0F, 28.5F, 10.4F);
        this.Rock.cubeList.add(new ModelBox(Rock, 8, 8, -3.6F, -4.8F, -3.8F, 12, 1, 8, 0.0F, false));
        this.Rock.cubeList.add(new ModelBox(Rock, 3, 0, -3.6F, -4.8F, -19.7F, 12, 1, 16, 0.0F, false));
        this.Rock.cubeList.add(new ModelBox(Rock, 7, 1, -2.6F, -5.8F, -19.4F, 11, 1, 15, 0.0F, false));
        this.Rock.cubeList.add(new ModelBox(Rock, 7, 3, -1.6F, -6.8F, -16.5F, 10, 1, 13, 0.0F, false));
        this.Rock.cubeList.add(new ModelBox(Rock, 9, 3, 0.4F, -7.2F, -15.5F, 8, 1, 13, -0.001F, false));
        this.Rock.cubeList.add(new ModelBox(Rock, 17, 6, 0.6F, -8.2F, -12.7F, 7, 1, 10, 0.0F, false));
        this.Rock.cubeList.add(new ModelBox(Rock, 17, 6, 0.6F, -9.2F, -11.5F, 6, 1, 8, 0.0F, false));
        this.Rock.cubeList.add(new ModelBox(Rock, 17, 6, 1.2F, -10.2F, -11.5F, 5, 1, 7, 0.0F, false));
        this.Rock.cubeList.add(new ModelBox(Rock, 18, 8, 1.4F, -6.8F, -3.5F, 7, 1, 3, 0.0F, false));
        this.Rock.cubeList.add(new ModelBox(Rock, 15, 9, -1.6F, -5.8F, -4.7F, 10, 1, 7, 0.001F, false));

        this.Crotalocephalus = new ModelRenderer(this);
        this.Crotalocephalus.setRotationPoint(2.9F, -9.0F, -10.4F);
        this.Rock.addChild(Crotalocephalus);


        this.Cephalon3 = new ModelRenderer(this);
        this.Cephalon3.setRotationPoint(0.3F, 1.4F, -3.7F);
        this.Crotalocephalus.addChild(Cephalon3);
        this.setRotateAngle(Cephalon3, 0.5613F, -0.0204F, -0.1041F);
        this.Cephalon3.cubeList.add(new ModelBox(Cephalon3, 15, 33, -1.5F, -2.0F, -3.5F, 3, 2, 3, 0.0F, false));
        this.Cephalon3.cubeList.add(new ModelBox(Cephalon3, 0, 38, -1.5F, -3.4F, -2.1F, 3, 3, 2, 0.0F, false));
        this.Cephalon3.cubeList.add(new ModelBox(Cephalon3, 0, 0, -1.5F, -2.4F, -0.1F, 3, 2, 4, 0.0F, false));
        this.Cephalon3.cubeList.add(new ModelBox(Cephalon3, 0, 18, -1.0F, -3.3F, -0.1F, 2, 3, 4, -0.002F, false));
        this.Cephalon3.cubeList.add(new ModelBox(Cephalon3, 0, 13, -2.0F, -1.75F, 0.8F, 4, 1, 1, 0.0F, false));

        this.Librigena_r1 = new ModelRenderer(this);
        this.Librigena_r1.setRotationPoint(-3.5F, 0.0F, 1.1F);
        this.Cephalon3.addChild(Librigena_r1);
        this.setRotateAngle(Librigena_r1, 0.2967F, -0.0611F, -0.3927F);
        this.Librigena_r1.cubeList.add(new ModelBox(Librigena_r1, 0, 33, 0.0956F, -0.0433F, -0.1763F, 4, 1, 3, 0.0F, true));

        this.Librigena_r2 = new ModelRenderer(this);
        this.Librigena_r2.setRotationPoint(3.5F, 0.0F, 1.1F);
        this.Cephalon3.addChild(Librigena_r2);
        this.setRotateAngle(Librigena_r2, 0.2967F, 0.0611F, 0.3927F);
        this.Librigena_r2.cubeList.add(new ModelBox(Librigena_r2, 0, 33, -4.0956F, -0.0433F, -0.1763F, 4, 1, 3, 0.0F, false));

        this.Librigena_r3 = new ModelRenderer(this);
        this.Librigena_r3.setRotationPoint(3.5F, 0.6F, 3.0F);
        this.Cephalon3.addChild(Librigena_r3);
        this.setRotateAngle(Librigena_r3, 0.0F, 0.2007F, 0.3927F);
        this.Librigena_r3.cubeList.add(new ModelBox(Librigena_r3, 44, 23, -0.5806F, -0.0976F, -0.0195F, 1, 0, 3, 0.0F, false));

        this.Librigena_r4 = new ModelRenderer(this);
        this.Librigena_r4.setRotationPoint(-3.5F, 0.6F, 3.0F);
        this.Cephalon3.addChild(Librigena_r4);
        this.setRotateAngle(Librigena_r4, 0.0F, -0.2007F, -0.3927F);
        this.Librigena_r4.cubeList.add(new ModelBox(Librigena_r4, 44, 23, -0.4194F, -0.0976F, -0.0195F, 1, 0, 3, 0.0F, true));

        this.Librigena_r5 = new ModelRenderer(this);
        this.Librigena_r5.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Cephalon3.addChild(Librigena_r5);
        this.setRotateAngle(Librigena_r5, 0.0F, -0.3927F, -0.3927F);
        this.Librigena_r5.cubeList.add(new ModelBox(Librigena_r5, 30, 29, -2.0F, -1.0F, -4.0F, 3, 1, 7, 0.0F, true));

        this.Librigena_r6 = new ModelRenderer(this);
        this.Librigena_r6.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Cephalon3.addChild(Librigena_r6);
        this.setRotateAngle(Librigena_r6, 0.0F, 0.3927F, 0.3927F);
        this.Librigena_r6.cubeList.add(new ModelBox(Librigena_r6, 30, 29, -1.0F, -1.0F, -4.0F, 3, 1, 7, 0.0F, false));

        this.Glabella_r1 = new ModelRenderer(this);
        this.Glabella_r1.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.Cephalon3.addChild(Glabella_r1);
        this.setRotateAngle(Glabella_r1, -0.7592F, 0.0F, 0.0F);
        this.Glabella_r1.cubeList.add(new ModelBox(Glabella_r1, 0, 26, -1.0F, -1.0F, -3.9F, 3, 2, 3, 0.001F, false));

        this.Thorax2 = new ModelRenderer(this);
        this.Thorax2.setRotationPoint(0.0F, -1.7F, 3.1F);
        this.Crotalocephalus.addChild(Thorax2);
        this.setRotateAngle(Thorax2, 0.0873F, 0.0F, -0.192F);


        this.ThoracicSegment6 = new ModelRenderer(this);
        this.ThoracicSegment6.setRotationPoint(0.0F, 0.0F, -5.1F);
        this.Thorax2.addChild(ThoracicSegment6);
        this.ThoracicSegment6.cubeList.add(new ModelBox(ThoracicSegment6, 44, 18, -0.99F, -2.31F, 0.0F, 2, 2, 2, 0.0F, false));

        this.PleuralBand3_r1 = new ModelRenderer(this);
        this.PleuralBand3_r1.setRotationPoint(-3.0F, 0.3F, 1.0F);
        this.ThoracicSegment6.addChild(PleuralBand3_r1);
        this.setRotateAngle(PleuralBand3_r1, 0.0F, 0.0F, -0.4538F);
        this.PleuralBand3_r1.cubeList.add(new ModelBox(PleuralBand3_r1, 45, 47, -2.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, true));

        this.PleuralBand2_r1 = new ModelRenderer(this);
        this.PleuralBand2_r1.setRotationPoint(3.0F, 0.3F, 1.0F);
        this.ThoracicSegment6.addChild(PleuralBand2_r1);
        this.setRotateAngle(PleuralBand2_r1, 0.0F, 0.0F, 0.4538F);
        this.PleuralBand2_r1.cubeList.add(new ModelBox(PleuralBand2_r1, 45, 47, 0.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, false));

        this.PleuralBand2_r2 = new ModelRenderer(this);
        this.PleuralBand2_r2.setRotationPoint(-1.0F, -2.0F, 2.0F);
        this.ThoracicSegment6.addChild(PleuralBand2_r2);
        this.setRotateAngle(PleuralBand2_r2, 0.0F, 0.0F, -0.6632F);
        this.PleuralBand2_r2.cubeList.add(new ModelBox(PleuralBand2_r2, 31, 42, -3.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, true));

        this.PleuralBand1_r1 = new ModelRenderer(this);
        this.PleuralBand1_r1.setRotationPoint(1.0F, -2.0F, 2.0F);
        this.ThoracicSegment6.addChild(PleuralBand1_r1);
        this.setRotateAngle(PleuralBand1_r1, 0.0F, 0.0F, 0.6632F);
        this.PleuralBand1_r1.cubeList.add(new ModelBox(PleuralBand1_r1, 31, 42, 0.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, false));

        this.LegL6 = new ModelRenderer(this);
        this.LegL6.setRotationPoint(0.2F, -0.3F, 1.0F);
        this.ThoracicSegment6.addChild(LegL6);
        this.setRotateAngle(LegL6, 0.0F, 0.0F, 0.7156F);
        this.LegL6.cubeList.add(new ModelBox(LegL6, 0, 0, 3.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegL5 = new ModelRenderer(this);
        this.LegL5.setRotationPoint(-0.2F, -0.3F, 1.0F);
        this.ThoracicSegment6.addChild(LegL5);
        this.setRotateAngle(LegL5, 0.0F, 0.0F, -0.7156F);
        this.LegL5.cubeList.add(new ModelBox(LegL5, 0, 0, -0.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, true));

        this.ThoracicSegment7 = new ModelRenderer(this);
        this.ThoracicSegment7.setRotationPoint(0.0F, 0.0F, -3.3F);
        this.Thorax2.addChild(ThoracicSegment7);
        this.setRotateAngle(ThoracicSegment7, -0.0873F, 0.0F, 0.0F);
        this.ThoracicSegment7.cubeList.add(new ModelBox(ThoracicSegment7, 0, 44, -0.99F, -2.31F, 0.0F, 2, 2, 2, 0.0F, false));

        this.PleuralBand4_r1 = new ModelRenderer(this);
        this.PleuralBand4_r1.setRotationPoint(-3.0F, 0.3F, 1.0F);
        this.ThoracicSegment7.addChild(PleuralBand4_r1);
        this.setRotateAngle(PleuralBand4_r1, 0.0F, 0.0F, -0.4538F);
        this.PleuralBand4_r1.cubeList.add(new ModelBox(PleuralBand4_r1, 38, 47, -2.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, true));

        this.PleuralBand3_r2 = new ModelRenderer(this);
        this.PleuralBand3_r2.setRotationPoint(3.0F, 0.3F, 1.0F);
        this.ThoracicSegment7.addChild(PleuralBand3_r2);
        this.setRotateAngle(PleuralBand3_r2, 0.0F, 0.0F, 0.4538F);
        this.PleuralBand3_r2.cubeList.add(new ModelBox(PleuralBand3_r2, 38, 47, 0.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, false));

        this.PleuralBand3_r3 = new ModelRenderer(this);
        this.PleuralBand3_r3.setRotationPoint(-1.0F, -2.0F, 2.0F);
        this.ThoracicSegment7.addChild(PleuralBand3_r3);
        this.setRotateAngle(PleuralBand3_r3, 0.0F, 0.0F, -0.6632F);
        this.PleuralBand3_r3.cubeList.add(new ModelBox(PleuralBand3_r3, 20, 42, -3.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, true));

        this.PleuralBand2_r3 = new ModelRenderer(this);
        this.PleuralBand2_r3.setRotationPoint(1.0F, -2.0F, 2.0F);
        this.ThoracicSegment7.addChild(PleuralBand2_r3);
        this.setRotateAngle(PleuralBand2_r3, 0.0F, 0.0F, 0.6632F);
        this.PleuralBand2_r3.cubeList.add(new ModelBox(PleuralBand2_r3, 20, 42, 0.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, false));

        this.LegL7 = new ModelRenderer(this);
        this.LegL7.setRotationPoint(0.2F, -0.3F, 1.0F);
        this.ThoracicSegment7.addChild(LegL7);
        this.setRotateAngle(LegL7, 0.0F, 0.0F, 0.7156F);
        this.LegL7.cubeList.add(new ModelBox(LegL7, 0, 0, 3.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegL10 = new ModelRenderer(this);
        this.LegL10.setRotationPoint(-0.2F, -0.3F, 1.0F);
        this.ThoracicSegment7.addChild(LegL10);
        this.setRotateAngle(LegL10, 0.0F, 0.0F, -0.7156F);
        this.LegL10.cubeList.add(new ModelBox(LegL10, 0, 0, -0.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, true));

        this.ThoracicSegment8 = new ModelRenderer(this);
        this.ThoracicSegment8.setRotationPoint(0.0F, 0.2F, -1.6F);
        this.Thorax2.addChild(ThoracicSegment8);
        this.setRotateAngle(ThoracicSegment8, -0.2094F, 0.0F, 0.0F);
        this.ThoracicSegment8.cubeList.add(new ModelBox(ThoracicSegment8, 9, 43, -0.99F, -2.31F, 0.0F, 2, 2, 2, 0.0F, false));

        this.PleuralBand5_r1 = new ModelRenderer(this);
        this.PleuralBand5_r1.setRotationPoint(-3.0F, 0.3F, 1.0F);
        this.ThoracicSegment8.addChild(PleuralBand5_r1);
        this.setRotateAngle(PleuralBand5_r1, 0.0F, 0.0F, -0.4538F);
        this.PleuralBand5_r1.cubeList.add(new ModelBox(PleuralBand5_r1, 46, 38, -2.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, true));

        this.PleuralBand4_r2 = new ModelRenderer(this);
        this.PleuralBand4_r2.setRotationPoint(3.0F, 0.3F, 1.0F);
        this.ThoracicSegment8.addChild(PleuralBand4_r2);
        this.setRotateAngle(PleuralBand4_r2, 0.0F, 0.0F, 0.4538F);
        this.PleuralBand4_r2.cubeList.add(new ModelBox(PleuralBand4_r2, 46, 38, 0.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, false));

        this.PleuralBand4_r3 = new ModelRenderer(this);
        this.PleuralBand4_r3.setRotationPoint(-1.0F, -2.0F, 2.0F);
        this.ThoracicSegment8.addChild(PleuralBand4_r3);
        this.setRotateAngle(PleuralBand4_r3, 0.0F, 0.0F, -0.6632F);
        this.PleuralBand4_r3.cubeList.add(new ModelBox(PleuralBand4_r3, 11, 39, -3.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, true));

        this.PleuralBand3_r4 = new ModelRenderer(this);
        this.PleuralBand3_r4.setRotationPoint(1.0F, -2.0F, 2.0F);
        this.ThoracicSegment8.addChild(PleuralBand3_r4);
        this.setRotateAngle(PleuralBand3_r4, 0.0F, 0.0F, 0.6632F);
        this.PleuralBand3_r4.cubeList.add(new ModelBox(PleuralBand3_r4, 11, 39, 0.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, false));

        this.LegL8 = new ModelRenderer(this);
        this.LegL8.setRotationPoint(0.2F, -0.3F, 1.0F);
        this.ThoracicSegment8.addChild(LegL8);
        this.setRotateAngle(LegL8, 0.0F, 0.0F, 0.7156F);
        this.LegL8.cubeList.add(new ModelBox(LegL8, 0, 0, 3.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegL11 = new ModelRenderer(this);
        this.LegL11.setRotationPoint(-0.2F, -0.3F, 1.0F);
        this.ThoracicSegment8.addChild(LegL11);
        this.setRotateAngle(LegL11, 0.0F, 0.0F, -0.7156F);
        this.LegL11.cubeList.add(new ModelBox(LegL11, 0, 0, -0.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, true));

        this.ThoracicSegment9 = new ModelRenderer(this);
        this.ThoracicSegment9.setRotationPoint(0.0F, 0.6F, 0.3F);
        this.Thorax2.addChild(ThoracicSegment9);
        this.setRotateAngle(ThoracicSegment9, -0.2443F, 0.0F, 0.0F);
        this.ThoracicSegment9.cubeList.add(new ModelBox(ThoracicSegment9, 42, 42, -0.99F, -2.31F, 0.0F, 2, 2, 2, 0.0F, false));

        this.PleuralBand6_r1 = new ModelRenderer(this);
        this.PleuralBand6_r1.setRotationPoint(-3.0F, 0.3F, 1.0F);
        this.ThoracicSegment9.addChild(PleuralBand6_r1);
        this.setRotateAngle(PleuralBand6_r1, 0.0F, 0.0F, -0.4538F);
        this.PleuralBand6_r1.cubeList.add(new ModelBox(PleuralBand6_r1, 32, 46, -2.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, true));

        this.PleuralBand5_r2 = new ModelRenderer(this);
        this.PleuralBand5_r2.setRotationPoint(3.0F, 0.3F, 1.0F);
        this.ThoracicSegment9.addChild(PleuralBand5_r2);
        this.setRotateAngle(PleuralBand5_r2, 0.0F, 0.0F, 0.4538F);
        this.PleuralBand5_r2.cubeList.add(new ModelBox(PleuralBand5_r2, 32, 46, 0.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, false));

        this.PleuralBand5_r3 = new ModelRenderer(this);
        this.PleuralBand5_r3.setRotationPoint(-1.0F, -2.0F, 2.0F);
        this.ThoracicSegment9.addChild(PleuralBand5_r3);
        this.setRotateAngle(PleuralBand5_r3, 0.0F, 0.0F, -0.6632F);
        this.PleuralBand5_r3.cubeList.add(new ModelBox(PleuralBand5_r3, 37, 38, -3.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, true));

        this.PleuralBand4_r4 = new ModelRenderer(this);
        this.PleuralBand4_r4.setRotationPoint(1.0F, -2.0F, 2.0F);
        this.ThoracicSegment9.addChild(PleuralBand4_r4);
        this.setRotateAngle(PleuralBand4_r4, 0.0F, 0.0F, 0.6632F);
        this.PleuralBand4_r4.cubeList.add(new ModelBox(PleuralBand4_r4, 37, 38, 0.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, false));

        this.LegL9 = new ModelRenderer(this);
        this.LegL9.setRotationPoint(0.2F, -0.3F, 1.0F);
        this.ThoracicSegment9.addChild(LegL9);
        this.setRotateAngle(LegL9, 0.0F, 0.0F, 0.7156F);
        this.LegL9.cubeList.add(new ModelBox(LegL9, 0, 0, 3.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegL12 = new ModelRenderer(this);
        this.LegL12.setRotationPoint(-0.2F, -0.3F, 1.0F);
        this.ThoracicSegment9.addChild(LegL12);
        this.setRotateAngle(LegL12, 0.0F, 0.0F, -0.7156F);
        this.LegL12.cubeList.add(new ModelBox(LegL12, 0, 0, -0.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, true));

        this.ThoracicSegment2 = new ModelRenderer(this);
        this.ThoracicSegment2.setRotationPoint(0.0F, 1.0F, 1.7F);
        this.Thorax2.addChild(ThoracicSegment2);
        this.setRotateAngle(ThoracicSegment2, -0.4887F, 0.0F, 0.0F);
        this.ThoracicSegment2.cubeList.add(new ModelBox(ThoracicSegment2, 23, 23, -0.99F, -2.31F, 0.0F, 2, 2, 2, 0.0F, false));

        this.PleuralBand7_r1 = new ModelRenderer(this);
        this.PleuralBand7_r1.setRotationPoint(-3.0F, 0.3F, 1.0F);
        this.ThoracicSegment2.addChild(PleuralBand7_r1);
        this.setRotateAngle(PleuralBand7_r1, 0.0F, 0.0F, -0.4538F);
        this.PleuralBand7_r1.cubeList.add(new ModelBox(PleuralBand7_r1, 25, 46, -2.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, true));

        this.PleuralBand6_r2 = new ModelRenderer(this);
        this.PleuralBand6_r2.setRotationPoint(3.0F, 0.3F, 1.0F);
        this.ThoracicSegment2.addChild(PleuralBand6_r2);
        this.setRotateAngle(PleuralBand6_r2, 0.0F, 0.0F, 0.4538F);
        this.PleuralBand6_r2.cubeList.add(new ModelBox(PleuralBand6_r2, 25, 46, 0.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, false));

        this.PleuralBand6_r3 = new ModelRenderer(this);
        this.PleuralBand6_r3.setRotationPoint(-1.0F, -2.0F, 2.0F);
        this.ThoracicSegment2.addChild(PleuralBand6_r3);
        this.setRotateAngle(PleuralBand6_r3, 0.0F, 0.0F, -0.6632F);
        this.PleuralBand6_r3.cubeList.add(new ModelBox(PleuralBand6_r3, 26, 38, -3.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, true));

        this.PleuralBand5_r4 = new ModelRenderer(this);
        this.PleuralBand5_r4.setRotationPoint(1.0F, -2.0F, 2.0F);
        this.ThoracicSegment2.addChild(PleuralBand5_r4);
        this.setRotateAngle(PleuralBand5_r4, 0.0F, 0.0F, 0.6632F);
        this.PleuralBand5_r4.cubeList.add(new ModelBox(PleuralBand5_r4, 26, 38, 0.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, false));

        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(0.2F, -0.3F, 1.0F);
        this.ThoracicSegment2.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.0F, 0.0F, 0.7156F);
        this.LegL2.cubeList.add(new ModelBox(LegL2, 0, 0, 3.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegL13 = new ModelRenderer(this);
        this.LegL13.setRotationPoint(-0.2F, -0.3F, 1.0F);
        this.ThoracicSegment2.addChild(LegL13);
        this.setRotateAngle(LegL13, 0.0F, 0.0F, -0.7156F);
        this.LegL13.cubeList.add(new ModelBox(LegL13, 0, 0, -0.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, true));

        this.ThoracicSegment3 = new ModelRenderer(this);
        this.ThoracicSegment3.setRotationPoint(0.0F, 1.6F, 3.0F);
        this.Thorax2.addChild(ThoracicSegment3);
        this.setRotateAngle(ThoracicSegment3, -0.6981F, 0.0F, 0.0F);
        this.ThoracicSegment3.cubeList.add(new ModelBox(ThoracicSegment3, 23, 18, -0.99F, -2.31F, 0.0F, 2, 2, 2, 0.0F, false));
        this.ThoracicSegment3.cubeList.add(new ModelBox(ThoracicSegment3, 44, 29, -0.99F, -2.31F, 2.0F, 2, 1, 2, 0.0F, false));

        this.PleuralBand11_r1 = new ModelRenderer(this);
        this.PleuralBand11_r1.setRotationPoint(-3.2F, 0.3F, 4.0F);
        this.ThoracicSegment3.addChild(PleuralBand11_r1);
        this.setRotateAngle(PleuralBand11_r1, 0.0F, 1.4486F, -0.4538F);
        this.PleuralBand11_r1.cubeList.add(new ModelBox(PleuralBand11_r1, 23, 29, -3.3382F, -0.6034F, 2.7F, 4, 0, 1, 0.0F, true));

        this.PleuralBand10_r1 = new ModelRenderer(this);
        this.PleuralBand10_r1.setRotationPoint(3.2F, 0.3F, 4.0F);
        this.ThoracicSegment3.addChild(PleuralBand10_r1);
        this.setRotateAngle(PleuralBand10_r1, 0.0F, -1.4486F, 0.4538F);
        this.PleuralBand10_r1.cubeList.add(new ModelBox(PleuralBand10_r1, 23, 29, -0.6618F, -0.6034F, 2.7F, 4, 0, 1, 0.0F, false));

        this.PleuralBand10_r2 = new ModelRenderer(this);
        this.PleuralBand10_r2.setRotationPoint(-3.2F, 0.3F, 4.0F);
        this.ThoracicSegment3.addChild(PleuralBand10_r2);
        this.setRotateAngle(PleuralBand10_r2, 0.0F, 1.2392F, -0.4538F);
        this.PleuralBand10_r2.cubeList.add(new ModelBox(PleuralBand10_r2, 25, 33, -2.3382F, -0.0034F, 0.9F, 3, 0, 1, 0.0F, true));

        this.PleuralBand9_r1 = new ModelRenderer(this);
        this.PleuralBand9_r1.setRotationPoint(3.2F, 0.3F, 4.0F);
        this.ThoracicSegment3.addChild(PleuralBand9_r1);
        this.setRotateAngle(PleuralBand9_r1, 0.0F, -1.2392F, 0.4538F);
        this.PleuralBand9_r1.cubeList.add(new ModelBox(PleuralBand9_r1, 25, 33, -0.6618F, -0.0034F, 0.9F, 3, 0, 1, 0.0F, false));

        this.PleuralBand9_r2 = new ModelRenderer(this);
        this.PleuralBand9_r2.setRotationPoint(-3.2F, 0.3F, 4.0F);
        this.ThoracicSegment3.addChild(PleuralBand9_r2);
        this.setRotateAngle(PleuralBand9_r2, 0.0F, 0.6283F, -0.4538F);
        this.PleuralBand9_r2.cubeList.add(new ModelBox(PleuralBand9_r2, 44, 33, -1.3382F, -0.0034F, -1.1F, 2, 0, 1, 0.0F, true));

        this.PleuralBand8_r1 = new ModelRenderer(this);
        this.PleuralBand8_r1.setRotationPoint(3.2F, 0.3F, 4.0F);
        this.ThoracicSegment3.addChild(PleuralBand8_r1);
        this.setRotateAngle(PleuralBand8_r1, 0.0F, -0.6283F, 0.4538F);
        this.PleuralBand8_r1.cubeList.add(new ModelBox(PleuralBand8_r1, 44, 33, -0.6618F, -0.0034F, -1.1F, 2, 0, 1, 0.0F, false));

        this.PleuralBand8_r2 = new ModelRenderer(this);
        this.PleuralBand8_r2.setRotationPoint(-3.0F, 0.3F, 1.0F);
        this.ThoracicSegment3.addChild(PleuralBand8_r2);
        this.setRotateAngle(PleuralBand8_r2, 0.0F, 0.0F, -0.4538F);
        this.PleuralBand8_r2.cubeList.add(new ModelBox(PleuralBand8_r2, 18, 46, -2.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, true));

        this.PleuralBand7_r2 = new ModelRenderer(this);
        this.PleuralBand7_r2.setRotationPoint(3.0F, 0.3F, 1.0F);
        this.ThoracicSegment3.addChild(PleuralBand7_r2);
        this.setRotateAngle(PleuralBand7_r2, 0.0F, 0.0F, 0.4538F);
        this.PleuralBand7_r2.cubeList.add(new ModelBox(PleuralBand7_r2, 18, 46, 0.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, false));

        this.PleuralBand7_r3 = new ModelRenderer(this);
        this.PleuralBand7_r3.setRotationPoint(-1.0F, -2.0F, 2.0F);
        this.ThoracicSegment3.addChild(PleuralBand7_r3);
        this.setRotateAngle(PleuralBand7_r3, 0.0F, 0.0F, -0.6632F);
        this.PleuralBand7_r3.cubeList.add(new ModelBox(PleuralBand7_r3, 0, 7, -3.01F, 0.09F, -2.0F, 3, 1, 4, 0.0F, true));

        this.PleuralBand6_r4 = new ModelRenderer(this);
        this.PleuralBand6_r4.setRotationPoint(1.0F, -2.0F, 2.0F);
        this.ThoracicSegment3.addChild(PleuralBand6_r4);
        this.setRotateAngle(PleuralBand6_r4, 0.0F, 0.0F, 0.6632F);
        this.PleuralBand6_r4.cubeList.add(new ModelBox(PleuralBand6_r4, 0, 7, 0.01F, 0.09F, -2.0F, 3, 1, 4, 0.0F, false));

        this.LegL3 = new ModelRenderer(this);
        this.LegL3.setRotationPoint(0.2F, -0.3F, 1.0F);
        this.ThoracicSegment3.addChild(LegL3);
        this.setRotateAngle(LegL3, 0.0F, 0.0F, 0.7156F);
        this.LegL3.cubeList.add(new ModelBox(LegL3, 0, 0, 3.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegL4 = new ModelRenderer(this);
        this.LegL4.setRotationPoint(-0.2F, -0.3F, 1.0F);
        this.ThoracicSegment3.addChild(LegL4);
        this.setRotateAngle(LegL4, 0.0F, 0.0F, -0.7156F);
        this.LegL4.cubeList.add(new ModelBox(LegL4, 0, 0, -0.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, true));

    }

    public void renderAll(float f) {
        this.Rock.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
