package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHelianthaster extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer root;
    private final ModelRenderer core;
    private final ModelRenderer armmiddlebase;
    private final ModelRenderer armbase;
    private final ModelRenderer arma;
    private final ModelRenderer armb;
    private final ModelRenderer armc;
    private final ModelRenderer armd;
    private final ModelRenderer armmiddlebase7;
    private final ModelRenderer armbase7;
    private final ModelRenderer arma7;
    private final ModelRenderer armb7;
    private final ModelRenderer armc7;
    private final ModelRenderer armd7;
    private final ModelRenderer armmiddlebase15;
    private final ModelRenderer armbase15;
    private final ModelRenderer arma15;
    private final ModelRenderer armb15;
    private final ModelRenderer armc15;
    private final ModelRenderer armd15;
    private final ModelRenderer armmiddlebase6;
    private final ModelRenderer armbase6;
    private final ModelRenderer arma6;
    private final ModelRenderer armb6;
    private final ModelRenderer armc6;
    private final ModelRenderer armd6;
    private final ModelRenderer armmiddlebase14;
    private final ModelRenderer armbase14;
    private final ModelRenderer arma14;
    private final ModelRenderer armb14;
    private final ModelRenderer armc14;
    private final ModelRenderer armd14;
    private final ModelRenderer armmiddlebase9;
    private final ModelRenderer armbase9;
    private final ModelRenderer arma9;
    private final ModelRenderer armb9;
    private final ModelRenderer armc9;
    private final ModelRenderer armd9;
    private final ModelRenderer armmiddlebase16;
    private final ModelRenderer armbase16;
    private final ModelRenderer arma16;
    private final ModelRenderer armb16;
    private final ModelRenderer armc16;
    private final ModelRenderer armd16;
    private final ModelRenderer armmiddlebase8;
    private final ModelRenderer armbase8;
    private final ModelRenderer arma8;
    private final ModelRenderer armb8;
    private final ModelRenderer armc8;
    private final ModelRenderer armd8;
    private final ModelRenderer armmiddlebase2;
    private final ModelRenderer armbase2;
    private final ModelRenderer arma2;
    private final ModelRenderer armb2;
    private final ModelRenderer armc2;
    private final ModelRenderer armd2;
    private final ModelRenderer armmiddlebase11;
    private final ModelRenderer armbase11;
    private final ModelRenderer arma11;
    private final ModelRenderer armb11;
    private final ModelRenderer armc11;
    private final ModelRenderer armd11;
    private final ModelRenderer armmiddlebase4;
    private final ModelRenderer armbase4;
    private final ModelRenderer arma4;
    private final ModelRenderer armb4;
    private final ModelRenderer armc4;
    private final ModelRenderer armd4;
    private final ModelRenderer armmiddlebase10;
    private final ModelRenderer armbase10;
    private final ModelRenderer arma10;
    private final ModelRenderer armb10;
    private final ModelRenderer armc10;
    private final ModelRenderer armd10;
    private final ModelRenderer armmiddlebase13;
    private final ModelRenderer armbase13;
    private final ModelRenderer arma13;
    private final ModelRenderer armb13;
    private final ModelRenderer armc13;
    private final ModelRenderer armd13;
    private final ModelRenderer armmiddlebase5;
    private final ModelRenderer armbase5;
    private final ModelRenderer arma5;
    private final ModelRenderer armb5;
    private final ModelRenderer armc5;
    private final ModelRenderer armd5;
    private final ModelRenderer armmiddlebase12;
    private final ModelRenderer armbase12;
    private final ModelRenderer arma12;
    private final ModelRenderer armb12;
    private final ModelRenderer armc12;
    private final ModelRenderer armd12;
    private final ModelRenderer armmiddlebase3;
    private final ModelRenderer armbase3;
    private final ModelRenderer arma3;
    private final ModelRenderer armb3;
    private final ModelRenderer armc3;
    private final ModelRenderer armd3;

    public ModelSkeletonHelianthaster() {
        this.textureWidth = 272;
        this.textureHeight = 180;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 39, -44.0F, -2.0F, -17.0F, 89, 2, 36, 0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-43.1F, 0.0F, -19.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.4014F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 78, -0.3628F, -2.0F, -0.2711F, 81, 2, 38, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(45.0F, 0.0F, 19.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.4102F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -96.0F, -2.0F, 0.0F, 96, 2, 36, -0.003F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -1.2F, 0.0F);
        this.fossil.addChild(root);


        this.core = new ModelRenderer(this);
        this.core.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.root.addChild(core);
        this.core.cubeList.add(new ModelBox(core, 0, 78, -4.5F, -1.475F, -5.5F, 9, 2, 9, 0.0F, false));

        this.armmiddlebase = new ModelRenderer(this);
        this.armmiddlebase.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase);


        this.armbase = new ModelRenderer(this);
        this.armbase.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase.addChild(armbase);
        this.armbase.cubeList.add(new ModelBox(armbase, 45, 161, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma = new ModelRenderer(this);
        this.arma.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase.addChild(arma);
        this.setRotateAngle(arma, 0.0F, -0.6545F, 0.0F);
        this.arma.cubeList.add(new ModelBox(arma, 25, 130, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb = new ModelRenderer(this);
        this.armb.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma.addChild(armb);
        this.setRotateAngle(armb, 0.0F, -0.6981F, 0.0F);
        this.armb.cubeList.add(new ModelBox(armb, 148, 131, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc = new ModelRenderer(this);
        this.armc.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb.addChild(armc);
        this.setRotateAngle(armc, 0.0F, -0.3491F, 0.0F);
        this.armc.cubeList.add(new ModelBox(armc, 167, 155, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd = new ModelRenderer(this);
        this.armd.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc.addChild(armd);
        this.armd.cubeList.add(new ModelBox(armd, 75, 161, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

        this.armmiddlebase7 = new ModelRenderer(this);
        this.armmiddlebase7.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase7);
        this.setRotateAngle(armmiddlebase7, 0.0F, -0.7854F, 0.0F);


        this.armbase7 = new ModelRenderer(this);
        this.armbase7.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase7.addChild(armbase7);
        this.armbase7.cubeList.add(new ModelBox(armbase7, 70, 150, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma7 = new ModelRenderer(this);
        this.arma7.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase7.addChild(arma7);
        this.setRotateAngle(arma7, 0.0F, -0.2182F, 0.0F);
        this.arma7.cubeList.add(new ModelBox(arma7, 100, 119, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb7 = new ModelRenderer(this);
        this.armb7.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma7.addChild(armb7);
        this.setRotateAngle(armb7, 0.0F, -0.3491F, 0.0F);
        this.armb7.cubeList.add(new ModelBox(armb7, 23, 142, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc7 = new ModelRenderer(this);
        this.armc7.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb7.addChild(armc7);
        this.setRotateAngle(armc7, 0.0F, -0.1745F, 0.0F);
        this.armc7.cubeList.add(new ModelBox(armc7, 164, 128, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd7 = new ModelRenderer(this);
        this.armd7.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc7.addChild(armd7);
        this.setRotateAngle(armd7, 0.0F, 0.0873F, 0.0F);
        this.armd7.cubeList.add(new ModelBox(armd7, 115, 160, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

        this.armmiddlebase15 = new ModelRenderer(this);
        this.armmiddlebase15.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase15);
        this.setRotateAngle(armmiddlebase15, 0.0F, -1.5708F, 0.0F);


        this.armbase15 = new ModelRenderer(this);
        this.armbase15.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase15.addChild(armbase15);
        this.armbase15.cubeList.add(new ModelBox(armbase15, 57, 140, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma15 = new ModelRenderer(this);
        this.arma15.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase15.addChild(arma15);
        this.setRotateAngle(arma15, 0.0F, -0.0436F, 0.0F);
        this.arma15.cubeList.add(new ModelBox(arma15, 0, 119, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb15 = new ModelRenderer(this);
        this.armb15.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma15.addChild(armb15);
        this.setRotateAngle(armb15, 0.0F, 0.1745F, 0.0F);
        this.armb15.cubeList.add(new ModelBox(armb15, 65, 140, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc15 = new ModelRenderer(this);
        this.armc15.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb15.addChild(armc15);
        this.armc15.cubeList.add(new ModelBox(armc15, 162, 144, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd15 = new ModelRenderer(this);
        this.armd15.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc15.addChild(armd15);
        this.setRotateAngle(armd15, 0.0F, 0.1745F, 0.0F);
        this.armd15.cubeList.add(new ModelBox(armd15, 150, 151, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

        this.armmiddlebase6 = new ModelRenderer(this);
        this.armmiddlebase6.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase6);
        this.setRotateAngle(armmiddlebase6, 0.0F, -2.3562F, 0.0F);


        this.armbase6 = new ModelRenderer(this);
        this.armbase6.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase6.addChild(armbase6);
        this.armbase6.cubeList.add(new ModelBox(armbase6, 16, 130, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma6 = new ModelRenderer(this);
        this.arma6.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase6.addChild(arma6);
        this.setRotateAngle(arma6, 0.0F, -0.0873F, 0.0F);
        this.arma6.cubeList.add(new ModelBox(arma6, 0, 50, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb6 = new ModelRenderer(this);
        this.armb6.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma6.addChild(armb6);
        this.setRotateAngle(armb6, 0.0F, 0.5236F, 0.0F);
        this.armb6.cubeList.add(new ModelBox(armb6, 132, 119, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc6 = new ModelRenderer(this);
        this.armc6.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb6.addChild(armc6);
        this.setRotateAngle(armc6, 0.0F, 0.2618F, 0.0F);
        this.armc6.cubeList.add(new ModelBox(armc6, 16, 50, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd6 = new ModelRenderer(this);
        this.armd6.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc6.addChild(armd6);
        this.setRotateAngle(armd6, 0.0F, 0.1309F, 0.0F);
        this.armd6.cubeList.add(new ModelBox(armd6, 58, 150, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

        this.armmiddlebase14 = new ModelRenderer(this);
        this.armmiddlebase14.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase14);
        this.setRotateAngle(armmiddlebase14, 0.0F, 3.1416F, 0.0F);


        this.armbase14 = new ModelRenderer(this);
        this.armbase14.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase14.addChild(armbase14);
        this.armbase14.cubeList.add(new ModelBox(armbase14, 16, 119, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma14 = new ModelRenderer(this);
        this.arma14.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase14.addChild(arma14);
        this.setRotateAngle(arma14, 0.0F, 0.6981F, 0.0F);
        this.arma14.cubeList.add(new ModelBox(arma14, 0, 0, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb14 = new ModelRenderer(this);
        this.armb14.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma14.addChild(armb14);
        this.setRotateAngle(armb14, 0.0F, 0.4363F, 0.0F);
        this.armb14.cubeList.add(new ModelBox(armb14, 50, 130, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc14 = new ModelRenderer(this);
        this.armc14.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb14.addChild(armc14);
        this.setRotateAngle(armc14, 0.0F, 0.3054F, 0.0F);
        this.armc14.cubeList.add(new ModelBox(armc14, 16, 0, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd14 = new ModelRenderer(this);
        this.armd14.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc14.addChild(armd14);
        this.setRotateAngle(armd14, 0.0F, -0.2182F, 0.0F);
        this.armd14.cubeList.add(new ModelBox(armd14, 16, 92, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

        this.armmiddlebase9 = new ModelRenderer(this);
        this.armmiddlebase9.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase9);
        this.setRotateAngle(armmiddlebase9, 0.0F, 2.3562F, 0.0F);


        this.armbase9 = new ModelRenderer(this);
        this.armbase9.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase9.addChild(armbase9);
        this.armbase9.cubeList.add(new ModelBox(armbase9, 91, 119, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma9 = new ModelRenderer(this);
        this.arma9.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase9.addChild(arma9);
        this.setRotateAngle(arma9, 0.0F, -0.0873F, 0.0F);
        this.arma9.cubeList.add(new ModelBox(arma9, 0, 39, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb9 = new ModelRenderer(this);
        this.armb9.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma9.addChild(armb9);
        this.setRotateAngle(armb9, 0.0F, -0.7854F, 0.0F);
        this.armb9.cubeList.add(new ModelBox(armb9, 111, 132, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc9 = new ModelRenderer(this);
        this.armc9.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb9.addChild(armc9);
        this.setRotateAngle(armc9, 0.0F, 0.2618F, 0.0F);
        this.armc9.cubeList.add(new ModelBox(armc9, 16, 39, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd9 = new ModelRenderer(this);
        this.armd9.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc9.addChild(armd9);
        this.setRotateAngle(armd9, 0.0F, -0.3927F, 0.0F);
        this.armd9.cubeList.add(new ModelBox(armd9, 37, 150, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

        this.armmiddlebase16 = new ModelRenderer(this);
        this.armmiddlebase16.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase16);
        this.setRotateAngle(armmiddlebase16, 0.0F, 1.5708F, 0.0F);


        this.armbase16 = new ModelRenderer(this);
        this.armbase16.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase16.addChild(armbase16);
        this.armbase16.cubeList.add(new ModelBox(armbase16, 88, 130, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma16 = new ModelRenderer(this);
        this.arma16.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase16.addChild(arma16);
        this.arma16.cubeList.add(new ModelBox(arma16, 0, 101, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb16 = new ModelRenderer(this);
        this.armb16.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma16.addChild(armb16);
        this.setRotateAngle(armb16, 0.0F, 0.1309F, 0.0F);
        this.armb16.cubeList.add(new ModelBox(armb16, 42, 140, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc16 = new ModelRenderer(this);
        this.armc16.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb16.addChild(armc16);
        this.setRotateAngle(armc16, 0.0F, -0.3054F, 0.0F);
        this.armc16.cubeList.add(new ModelBox(armc16, 136, 162, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd16 = new ModelRenderer(this);
        this.armd16.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc16.addChild(armd16);
        this.setRotateAngle(armd16, 0.0F, 0.3054F, 0.0F);
        this.armd16.cubeList.add(new ModelBox(armd16, 129, 151, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

        this.armmiddlebase8 = new ModelRenderer(this);
        this.armmiddlebase8.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase8);
        this.setRotateAngle(armmiddlebase8, 0.0F, 0.7854F, 0.0F);


        this.armbase8 = new ModelRenderer(this);
        this.armbase8.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase8.addChild(armbase8);
        this.armbase8.cubeList.add(new ModelBox(armbase8, 49, 150, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma8 = new ModelRenderer(this);
        this.arma8.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase8.addChild(arma8);
        this.setRotateAngle(arma8, 0.0F, 0.2618F, 0.0F);
        this.arma8.cubeList.add(new ModelBox(arma8, 75, 119, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb8 = new ModelRenderer(this);
        this.armb8.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma8.addChild(armb8);
        this.setRotateAngle(armb8, 0.0F, 0.6545F, 0.0F);
        this.armb8.cubeList.add(new ModelBox(armb8, 141, 141, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc8 = new ModelRenderer(this);
        this.armc8.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb8.addChild(armc8);
        this.setRotateAngle(armc8, 0.0F, -0.3054F, 0.0F);
        this.armc8.cubeList.add(new ModelBox(armc8, 12, 164, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd8 = new ModelRenderer(this);
        this.armd8.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc8.addChild(armd8);
        this.setRotateAngle(armd8, 0.0F, -0.6981F, 0.0F);
        this.armd8.cubeList.add(new ModelBox(armd8, 103, 154, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

        this.armmiddlebase2 = new ModelRenderer(this);
        this.armmiddlebase2.setRotationPoint(0.0F, -0.025F, -1.0F);
        this.core.addChild(armmiddlebase2);
        this.setRotateAngle(armmiddlebase2, 0.0F, -0.3927F, 0.0F);


        this.armbase2 = new ModelRenderer(this);
        this.armbase2.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase2.addChild(armbase2);
        this.armbase2.cubeList.add(new ModelBox(armbase2, 141, 151, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma2 = new ModelRenderer(this);
        this.arma2.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase2.addChild(arma2);
        this.setRotateAngle(arma2, 0.0F, -0.3927F, 0.0F);
        this.arma2.cubeList.add(new ModelBox(arma2, 0, 130, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb2 = new ModelRenderer(this);
        this.armb2.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma2.addChild(armb2);
        this.setRotateAngle(armb2, 0.0F, -0.6109F, 0.0F);
        this.armb2.cubeList.add(new ModelBox(armb2, 148, 121, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc2 = new ModelRenderer(this);
        this.armc2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb2.addChild(armc2);
        this.setRotateAngle(armc2, 0.0F, -0.2618F, 0.0F);
        this.armc2.cubeList.add(new ModelBox(armc2, 101, 167, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd2 = new ModelRenderer(this);
        this.armd2.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc2.addChild(armd2);
        this.setRotateAngle(armd2, 0.0F, 0.0873F, 0.0F);
        this.armd2.cubeList.add(new ModelBox(armd2, 54, 161, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

        this.armmiddlebase11 = new ModelRenderer(this);
        this.armmiddlebase11.setRotationPoint(0.0F, -0.025F, -1.0F);
        this.core.addChild(armmiddlebase11);
        this.setRotateAngle(armmiddlebase11, 0.0F, -1.1781F, 0.0F);


        this.armbase11 = new ModelRenderer(this);
        this.armbase11.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase11.addChild(armbase11);
        this.armbase11.cubeList.add(new ModelBox(armbase11, 15, 141, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma11 = new ModelRenderer(this);
        this.arma11.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase11.addChild(arma11);
        this.setRotateAngle(arma11, 0.0F, -0.1309F, 0.0F);
        this.arma11.cubeList.add(new ModelBox(arma11, 50, 119, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb11 = new ModelRenderer(this);
        this.armb11.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma11.addChild(armb11);
        this.setRotateAngle(armb11, 0.0F, 0.0873F, 0.0F);
        this.armb11.cubeList.add(new ModelBox(armb11, 0, 141, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc11 = new ModelRenderer(this);
        this.armc11.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb11.addChild(armc11);
        this.setRotateAngle(armc11, 0.0F, -0.3491F, 0.0F);
        this.armc11.cubeList.add(new ModelBox(armc11, 163, 119, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd11 = new ModelRenderer(this);
        this.armd11.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc11.addChild(armd11);
        this.setRotateAngle(armd11, 0.0F, -0.1745F, 0.0F);
        this.armd11.cubeList.add(new ModelBox(armd11, 91, 152, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

        this.armmiddlebase4 = new ModelRenderer(this);
        this.armmiddlebase4.setRotationPoint(0.0F, -0.025F, -1.0F);
        this.core.addChild(armmiddlebase4);
        this.setRotateAngle(armmiddlebase4, 0.0F, -1.9635F, 0.0F);


        this.armbase4 = new ModelRenderer(this);
        this.armbase4.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase4.addChild(armbase4);
        this.armbase4.cubeList.add(new ModelBox(armbase4, 65, 130, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma4 = new ModelRenderer(this);
        this.arma4.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase4.addChild(arma4);
        this.setRotateAngle(arma4, 0.0F, 0.0436F, 0.0F);
        this.arma4.cubeList.add(new ModelBox(arma4, 0, 90, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb4 = new ModelRenderer(this);
        this.armb4.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma4.addChild(armb4);
        this.setRotateAngle(armb4, 0.0F, 0.2618F, 0.0F);
        this.armb4.cubeList.add(new ModelBox(armb4, 126, 139, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc4 = new ModelRenderer(this);
        this.armc4.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb4.addChild(armc4);
        this.setRotateAngle(armc4, 0.0F, 0.2618F, 0.0F);
        this.armc4.cubeList.add(new ModelBox(armc4, 0, 162, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd4 = new ModelRenderer(this);
        this.armd4.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc4.addChild(armd4);
        this.setRotateAngle(armd4, 0.0F, -0.6545F, 0.0F);
        this.armd4.cubeList.add(new ModelBox(armd4, 0, 151, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

        this.armmiddlebase10 = new ModelRenderer(this);
        this.armmiddlebase10.setRotationPoint(0.0F, -0.025F, -1.0F);
        this.core.addChild(armmiddlebase10);
        this.setRotateAngle(armmiddlebase10, 0.0F, -2.7489F, 0.0F);


        this.armbase10 = new ModelRenderer(this);
        this.armbase10.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase10.addChild(armbase10);
        this.armbase10.cubeList.add(new ModelBox(armbase10, 66, 119, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma10 = new ModelRenderer(this);
        this.arma10.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase10.addChild(arma10);
        this.setRotateAngle(arma10, 0.0F, 0.1745F, 0.0F);
        this.arma10.cubeList.add(new ModelBox(arma10, 0, 22, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb10 = new ModelRenderer(this);
        this.armb10.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma10.addChild(armb10);
        this.setRotateAngle(armb10, 0.0F, 0.6109F, 0.0F);
        this.armb10.cubeList.add(new ModelBox(armb10, 96, 130, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc10 = new ModelRenderer(this);
        this.armc10.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb10.addChild(armc10);
        this.setRotateAngle(armc10, 0.0F, 0.8727F, 0.0F);
        this.armc10.cubeList.add(new ModelBox(armc10, 16, 22, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd10 = new ModelRenderer(this);
        this.armd10.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc10.addChild(armd10);
        this.setRotateAngle(armd10, 0.0F, -0.2182F, 0.0F);
        this.armd10.cubeList.add(new ModelBox(armd10, 117, 149, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

        this.armmiddlebase13 = new ModelRenderer(this);
        this.armmiddlebase13.setRotationPoint(0.0F, -0.025F, -1.0F);
        this.core.addChild(armmiddlebase13);
        this.setRotateAngle(armmiddlebase13, 0.0F, 2.7489F, 0.0F);


        this.armbase13 = new ModelRenderer(this);
        this.armbase13.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase13.addChild(armbase13);
        this.armbase13.cubeList.add(new ModelBox(armbase13, 41, 119, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma13 = new ModelRenderer(this);
        this.arma13.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase13.addChild(arma13);
        this.setRotateAngle(arma13, 0.0F, 0.6981F, 0.0F);
        this.arma13.cubeList.add(new ModelBox(arma13, 0, 11, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb13 = new ModelRenderer(this);
        this.armb13.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma13.addChild(armb13);
        this.setRotateAngle(armb13, 0.0F, 0.5236F, 0.0F);
        this.armb13.cubeList.add(new ModelBox(armb13, 73, 130, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc13 = new ModelRenderer(this);
        this.armc13.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb13.addChild(armc13);
        this.setRotateAngle(armc13, 0.0F, 0.3054F, 0.0F);
        this.armc13.cubeList.add(new ModelBox(armc13, 16, 11, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd13 = new ModelRenderer(this);
        this.armd13.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc13.addChild(armd13);
        this.setRotateAngle(armd13, 0.0F, -0.2182F, 0.0F);
        this.armd13.cubeList.add(new ModelBox(armd13, 16, 103, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

        this.armmiddlebase5 = new ModelRenderer(this);
        this.armmiddlebase5.setRotationPoint(0.0F, -0.025F, -1.0F);
        this.core.addChild(armmiddlebase5);
        this.setRotateAngle(armmiddlebase5, 0.0F, 1.9635F, 0.0F);


        this.armbase5 = new ModelRenderer(this);
        this.armbase5.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase5.addChild(armbase5);
        this.armbase5.cubeList.add(new ModelBox(armbase5, 41, 130, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma5 = new ModelRenderer(this);
        this.arma5.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase5.addChild(arma5);
        this.setRotateAngle(arma5, 0.0F, -0.0873F, 0.0F);
        this.arma5.cubeList.add(new ModelBox(arma5, 0, 61, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb5 = new ModelRenderer(this);
        this.armb5.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma5.addChild(armb5);
        this.setRotateAngle(armb5, 0.0F, -0.2182F, 0.0F);
        this.armb5.cubeList.add(new ModelBox(armb5, 133, 129, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc5 = new ModelRenderer(this);
        this.armc5.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb5.addChild(armc5);
        this.setRotateAngle(armc5, 0.0F, 0.3491F, 0.0F);
        this.armc5.cubeList.add(new ModelBox(armc5, 16, 61, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd5 = new ModelRenderer(this);
        this.armd5.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc5.addChild(armd5);
        this.setRotateAngle(armd5, 0.0F, -0.3054F, 0.0F);
        this.armd5.cubeList.add(new ModelBox(armd5, 79, 150, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

        this.armmiddlebase12 = new ModelRenderer(this);
        this.armmiddlebase12.setRotationPoint(0.0F, -0.025F, -1.0F);
        this.core.addChild(armmiddlebase12);
        this.setRotateAngle(armmiddlebase12, 0.0F, 1.1781F, 0.0F);


        this.armbase12 = new ModelRenderer(this);
        this.armbase12.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase12.addChild(armbase12);
        this.armbase12.cubeList.add(new ModelBox(armbase12, 80, 140, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma12 = new ModelRenderer(this);
        this.arma12.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase12.addChild(arma12);
        this.setRotateAngle(arma12, 0.0F, 0.0873F, 0.0F);
        this.arma12.cubeList.add(new ModelBox(arma12, 25, 119, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb12 = new ModelRenderer(this);
        this.armb12.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma12.addChild(armb12);
        this.setRotateAngle(armb12, 0.0F, 0.3927F, 0.0F);
        this.armb12.cubeList.add(new ModelBox(armb12, 88, 140, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc12 = new ModelRenderer(this);
        this.armc12.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb12.addChild(armc12);
        this.setRotateAngle(armc12, 0.0F, 0.2618F, 0.0F);
        this.armc12.cubeList.add(new ModelBox(armc12, 155, 162, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd12 = new ModelRenderer(this);
        this.armd12.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc12.addChild(armd12);
        this.setRotateAngle(armd12, 0.0F, -0.2182F, 0.0F);
        this.armd12.cubeList.add(new ModelBox(armd12, 21, 152, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

        this.armmiddlebase3 = new ModelRenderer(this);
        this.armmiddlebase3.setRotationPoint(0.0F, -0.025F, -1.0F);
        this.core.addChild(armmiddlebase3);
        this.setRotateAngle(armmiddlebase3, 0.0F, 0.3927F, 0.0F);


        this.armbase3 = new ModelRenderer(this);
        this.armbase3.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase3.addChild(armbase3);
        this.armbase3.cubeList.add(new ModelBox(armbase3, 12, 151, -1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F, false));

        this.arma3 = new ModelRenderer(this);
        this.arma3.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase3.addChild(arma3);
        this.setRotateAngle(arma3, 0.0F, -0.1745F, 0.0F);
        this.arma3.cubeList.add(new ModelBox(arma3, 116, 121, -1.5F, -0.51F, -9.0F, 3, 1, 9, 0.0F, false));

        this.armb3 = new ModelRenderer(this);
        this.armb3.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arma3.addChild(armb3);
        this.setRotateAngle(armb3, 0.0F, -0.829F, 0.0F);
        this.armb3.cubeList.add(new ModelBox(armb3, 103, 142, -1.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F, false));

        this.armc3 = new ModelRenderer(this);
        this.armc3.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.armb3.addChild(armc3);
        this.setRotateAngle(armc3, 0.0F, -0.5672F, 0.0F);
        this.armc3.cubeList.add(new ModelBox(armc3, 89, 165, -1.0F, -0.51F, -7.0F, 2, 1, 7, 0.0F, false));

        this.armd3 = new ModelRenderer(this);
        this.armd3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.armc3.addChild(armd3);
        this.setRotateAngle(armd3, 0.0F, 0.1309F, 0.0F);
        this.armd3.cubeList.add(new ModelBox(armd3, 33, 161, -0.5F, -0.5F, -9.0F, 1, 1, 9, 0.0F, false));

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
