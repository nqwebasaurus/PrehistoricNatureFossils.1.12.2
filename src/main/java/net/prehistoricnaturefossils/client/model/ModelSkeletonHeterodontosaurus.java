package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHeterodontosaurus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Heterodontosaurus;
    private final ModelRenderer basin_r1;
    private final ModelRenderer basin_r2;
    private final ModelRenderer basin_r3;
    private final ModelRenderer basin_r4;
    private final ModelRenderer basin_r5;
    private final ModelRenderer basin_r6;
    private final ModelRenderer basin_r7;
    private final ModelRenderer basin_r8;
    private final ModelRenderer basin_r9;
    private final ModelRenderer basin_r10;
    private final ModelRenderer basin_r11;
    private final ModelRenderer basin_r12;
    private final ModelRenderer basin_r13;
    private final ModelRenderer cube_r1;
    private final ModelRenderer LegL;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer KneeL;
    private final ModelRenderer cube_r5;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer cube_r6;
    private final ModelRenderer FootL;
    private final ModelRenderer cube_r7;
    private final ModelRenderer LegL2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer KneeL2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer cube_r12;
    private final ModelRenderer FootL2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r23;
    private final ModelRenderer Tail4;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer ArmL;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer ElbowL;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer HandL;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer ArmL2;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer HandL2;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r84;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r85;
    private final ModelRenderer Neck1;
    private final ModelRenderer cube_r86;
    private final ModelRenderer Head;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer cube_r98;
    private final ModelRenderer HeadSlopeL;
    private final ModelRenderer cube_r99;
    private final ModelRenderer HeadSlopeL2;
    private final ModelRenderer cube_r100;
    private final ModelRenderer BrowL;
    private final ModelRenderer cube_r101;
    private final ModelRenderer cube_r102;
    private final ModelRenderer cube_r103;
    private final ModelRenderer cube_r104;
    private final ModelRenderer BrowL2;
    private final ModelRenderer cube_r105;
    private final ModelRenderer cube_r106;
    private final ModelRenderer cube_r107;
    private final ModelRenderer cube_r108;
    private final ModelRenderer TeethML;
    private final ModelRenderer cube_r109;
    private final ModelRenderer cube_r110;
    private final ModelRenderer TeethML2;
    private final ModelRenderer cube_r111;
    private final ModelRenderer cube_r112;
    private final ModelRenderer Jaw;
    private final ModelRenderer cube_r113;
    private final ModelRenderer cube_r114;
    private final ModelRenderer cube_r115;
    private final ModelRenderer JawSlopeL;
    private final ModelRenderer cube_r116;
    private final ModelRenderer JawSlopeL2;
    private final ModelRenderer cube_r117;
    private final ModelRenderer TeethL;
    private final ModelRenderer cube_r118;
    private final ModelRenderer cube_r119;
    private final ModelRenderer TeethL2;
    private final ModelRenderer cube_r120;
    private final ModelRenderer cube_r121;

    public ModelSkeletonHeterodontosaurus() {
        this.textureWidth = 53;
        this.textureHeight = 53;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Heterodontosaurus = new ModelRenderer(this);
        this.Heterodontosaurus.setRotationPoint(0.0F, -16.0F, 3.0F);
        this.fossil.addChild(Heterodontosaurus);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(-0.5F, -0.5F, -1.3F);
        this.Heterodontosaurus.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.1571F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 25, 32, -1.0F, -0.307F, -0.3524F, 1, 1, 3, 0.0F, true));
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 25, 32, 1.0F, -0.307F, -0.3524F, 1, 1, 3, 0.0F, false));
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 26, 21, 0.0F, -0.307F, -0.1524F, 1, 1, 4, 0.003F, false));

        this.basin_r2 = new ModelRenderer(this);
        this.basin_r2.setRotationPoint(-1.6F, 1.2133F, -0.4426F);
        this.Heterodontosaurus.addChild(basin_r2);
        this.setRotateAngle(basin_r2, -0.48F, 0.3491F, 0.0F);
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 35, 18, -0.5F, -0.1622F, -0.8525F, 1, 1, 3, -0.3F, true));
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 16, 0, -0.5F, -0.7229F, -0.7545F, 1, 1, 3, -0.2F, true));

        this.basin_r3 = new ModelRenderer(this);
        this.basin_r3.setRotationPoint(-1.6F, 1.2133F, -0.4426F);
        this.Heterodontosaurus.addChild(basin_r3);
        this.setRotateAngle(basin_r3, -0.8116F, 0.3491F, 0.0F);
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 35, 24, -0.5F, -0.7761F, 1.5395F, 1, 1, 3, -0.3F, true));
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 19, 30, -0.5F, -1.3827F, 1.5789F, 1, 1, 3, -0.2F, true));

        this.basin_r4 = new ModelRenderer(this);
        this.basin_r4.setRotationPoint(-1.6F, 0.9133F, -0.8426F);
        this.Heterodontosaurus.addChild(basin_r4);
        this.setRotateAngle(basin_r4, -0.3604F, 0.2457F, -0.0914F);
        this.basin_r4.cubeList.add(new ModelBox(basin_r4, 35, 41, -0.6F, -0.1974F, -1.2819F, 1, 1, 2, -0.2F, true));

        this.basin_r5 = new ModelRenderer(this);
        this.basin_r5.setRotationPoint(-1.6F, -0.4281F, 1.1554F);
        this.Heterodontosaurus.addChild(basin_r5);
        this.setRotateAngle(basin_r5, -0.3491F, 0.0F, 0.0F);
        this.basin_r5.cubeList.add(new ModelBox(basin_r5, 0, 39, -0.5F, 0.9322F, -1.9502F, 1, 1, 2, 0.0F, true));
        this.basin_r5.cubeList.add(new ModelBox(basin_r5, 30, 39, -0.5F, -0.0678F, -1.9502F, 1, 1, 2, 0.0F, true));
        this.basin_r5.cubeList.add(new ModelBox(basin_r5, 0, 39, 2.7F, 0.9322F, -1.9502F, 1, 1, 2, 0.0F, false));
        this.basin_r5.cubeList.add(new ModelBox(basin_r5, 30, 39, 2.7F, -0.0678F, -1.9502F, 1, 1, 2, 0.0F, false));

        this.basin_r6 = new ModelRenderer(this);
        this.basin_r6.setRotationPoint(-2.1F, 5.5F, -1.3F);
        this.Heterodontosaurus.addChild(basin_r6);
        this.setRotateAngle(basin_r6, -0.1571F, 0.0F, 0.0F);
        this.basin_r6.cubeList.add(new ModelBox(basin_r6, 0, 34, 0.0F, -6.307F, -0.4524F, 1, 1, 3, -0.002F, true));
        this.basin_r6.cubeList.add(new ModelBox(basin_r6, 0, 34, 3.2F, -6.307F, -0.4524F, 1, 1, 3, -0.002F, false));

        this.basin_r7 = new ModelRenderer(this);
        this.basin_r7.setRotationPoint(-1.6F, -0.3281F, -2.5446F);
        this.Heterodontosaurus.addChild(basin_r7);
        this.setRotateAngle(basin_r7, 0.7586F, 0.2721F, -0.0041F);
        this.basin_r7.cubeList.add(new ModelBox(basin_r7, 20, 35, -0.6656F, -0.4996F, -0.6764F, 1, 1, 1, 0.0F, true));

        this.basin_r8 = new ModelRenderer(this);
        this.basin_r8.setRotationPoint(-1.6F, -0.9281F, -0.6446F);
        this.Heterodontosaurus.addChild(basin_r8);
        this.setRotateAngle(basin_r8, 0.1396F, 0.0873F, 0.0F);
        this.basin_r8.cubeList.add(new ModelBox(basin_r8, 0, 43, -0.5F, -0.2718F, -1.9966F, 1, 1, 2, 0.0F, true));

        this.basin_r9 = new ModelRenderer(this);
        this.basin_r9.setRotationPoint(1.6F, -0.3281F, -2.5446F);
        this.Heterodontosaurus.addChild(basin_r9);
        this.setRotateAngle(basin_r9, 0.7586F, -0.2721F, 0.0041F);
        this.basin_r9.cubeList.add(new ModelBox(basin_r9, 20, 35, -0.3344F, -0.4996F, -0.6764F, 1, 1, 1, 0.0F, false));

        this.basin_r10 = new ModelRenderer(this);
        this.basin_r10.setRotationPoint(1.6F, -0.9281F, -0.6446F);
        this.Heterodontosaurus.addChild(basin_r10);
        this.setRotateAngle(basin_r10, 0.1396F, -0.0873F, 0.0F);
        this.basin_r10.cubeList.add(new ModelBox(basin_r10, 0, 43, -0.5F, -0.2718F, -1.9966F, 1, 1, 2, 0.0F, false));

        this.basin_r11 = new ModelRenderer(this);
        this.basin_r11.setRotationPoint(1.6F, 0.9133F, -0.8426F);
        this.Heterodontosaurus.addChild(basin_r11);
        this.setRotateAngle(basin_r11, -0.3604F, -0.2457F, 0.0914F);
        this.basin_r11.cubeList.add(new ModelBox(basin_r11, 35, 41, -0.4F, -0.1974F, -1.2819F, 1, 1, 2, -0.2F, false));

        this.basin_r12 = new ModelRenderer(this);
        this.basin_r12.setRotationPoint(1.6F, 1.2133F, -0.4426F);
        this.Heterodontosaurus.addChild(basin_r12);
        this.setRotateAngle(basin_r12, -0.48F, -0.3491F, 0.0F);
        this.basin_r12.cubeList.add(new ModelBox(basin_r12, 35, 18, -0.5F, -0.1622F, -0.8525F, 1, 1, 3, -0.3F, false));
        this.basin_r12.cubeList.add(new ModelBox(basin_r12, 16, 0, -0.5F, -0.7229F, -0.7545F, 1, 1, 3, -0.2F, false));

        this.basin_r13 = new ModelRenderer(this);
        this.basin_r13.setRotationPoint(1.6F, 1.2133F, -0.4426F);
        this.Heterodontosaurus.addChild(basin_r13);
        this.setRotateAngle(basin_r13, -0.8116F, -0.3491F, 0.0F);
        this.basin_r13.cubeList.add(new ModelBox(basin_r13, 35, 24, -0.5F, -0.7761F, 1.5395F, 1, 1, 3, -0.3F, false));
        this.basin_r13.cubeList.add(new ModelBox(basin_r13, 19, 30, -0.5F, -1.3827F, 1.5789F, 1, 1, 3, -0.2F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.8578F, 0.1518F);
        this.Heterodontosaurus.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1658F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 15, 0.0F, -0.4F, -0.9F, 0, 1, 3, 0.0F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(3.1F, 0.7F, -0.2F);
        this.Heterodontosaurus.addChild(LegL);
        this.setRotateAngle(LegL, -1.2654F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.6F, 1.7197F, 0.3095F);
        this.LegL.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5411F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 44, -0.5F, -0.8F, -0.6F, 1, 2, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.4101F, -0.0428F);
        this.LegL.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0698F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.1F, 0.1F, -0.5F, 1, 3, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.6899F, -0.7428F);
        this.LegL.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 0, -1.1F, -0.0413F, -0.018F, 1, 3, 1, 0.0F, false));

        this.KneeL = new ModelRenderer(this);
        this.KneeL.setRotationPoint(0.0F, 5.9899F, -0.4428F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 0.5186F, -0.1139F, -0.0647F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.3047F, -1.4701F);
        this.KneeL.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.0647F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 15, -1.1F, 1.8953F, 0.3315F, 1, 8, 1, -0.3F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 5, 15, -1.1F, 1.8953F, -0.4685F, 1, 8, 1, -0.001F, false));

        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 2.9736F, 7.3809F);
        this.KneeL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -1.0581F, 0.1525F, 0.0853F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.6F, -0.2F);
        this.MetatarsalL.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.9599F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 24, -1.1F, -0.8F, -0.3F, 1, 1, 4, -0.002F, false));

        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 3.1F, 1.6F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 1.6493F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.2F, 0.4F);
        this.FootL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9599F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 15, -2.0F, -0.5F, -3.5F, 3, 1, 4, 0.0F, false));

        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-3.1F, 0.7F, -0.2F);
        this.Heterodontosaurus.addChild(LegL2);
        this.setRotateAngle(LegL2, -0.0873F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.6F, 1.7197F, 0.3095F);
        this.LegL2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5411F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 44, -0.5F, -0.8F, -0.6F, 1, 2, 1, -0.2F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.4101F, -0.0428F);
        this.LegL2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0698F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.1F, 0.1F, -0.5F, 1, 3, 1, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.6899F, -0.7428F);
        this.LegL2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0349F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 0, 0.1F, -0.0413F, -0.018F, 1, 3, 1, 0.0F, true));

        this.KneeL2 = new ModelRenderer(this);
        this.KneeL2.setRotationPoint(0.7F, 5.6899F, -0.4428F);
        this.LegL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, -0.0086F, -0.0015F, -0.1745F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.7F, -1.0047F, -1.4674F);
        this.KneeL2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.0647F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 15, 0.1F, 1.8953F, 0.3315F, 1, 8, 1, -0.3F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 5, 15, 0.1F, 1.8953F, -0.4685F, 1, 8, 1, -0.001F, true));

        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(-0.7F, 3.2736F, 7.3836F);
        this.KneeL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, -0.1478F, 0.008F, 0.1307F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.6F, -0.2F);
        this.MetatarsalL2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.9599F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 24, 0.1F, -0.8F, -0.3F, 1, 1, 4, -0.002F, true));

        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 3.1F, 1.6F);
        this.MetatarsalL2.addChild(FootL2);
        this.setRotateAngle(FootL2, -0.3578F, 0.0F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.2F, 0.4F);
        this.FootL2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.9599F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 15, -1.0F, -0.5F, -3.5F, 3, 1, 4, 0.0F, true));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.3F, 2.6F);
        this.Heterodontosaurus.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0425F, -0.0769F, -0.0031F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.4F, -0.1F);
        this.Tail1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1047F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 15, -0.5F, -0.1374F, -0.0858F, 1, 1, 7, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.0578F, -1.4482F);
        this.Tail1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1658F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 33, 49, 0.0F, -0.2F, 6.3F, 0, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 49, 33, 0.0F, -0.2F, 4.3F, 0, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 39, 49, 0.0F, -0.2F, 2.3F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.0796F, 4.8163F);
        this.Tail1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.576F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 7, 0.0F, -0.5F, -0.1F, 0, 2, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.3796F, 3.0163F);
        this.Tail1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.576F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 23, 15, 0.0F, -0.5F, -0.1F, 0, 2, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.1796F, 1.0163F);
        this.Tail1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.576F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 49, 29, 0.0F, -0.6F, -0.1F, 0, 1, 1, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.4F, 6.7F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.132F, -0.1298F, -0.0172F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 16, 0, -0.5F, -0.2F, 0.0F, 1, 1, 9, 0.003F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.1204F, 5.8163F);
        this.Tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.576F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 16, 0, 0.0F, 0.5F, -0.1F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0796F, 3.8163F);
        this.Tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.576F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 17, 15, 0.0F, 0.5F, -0.1F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.2796F, 1.8163F);
        this.Tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.576F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 46, 48, 0.0F, 0.5F, -0.1F, 0, 1, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.3796F, -0.1837F);
        this.Tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.576F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 22, 0, 0.0F, 0.5F, -0.1F, 0, 1, 1, 0.0F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.5F, 0.1F, 9.2F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1896F, 0.2573F, -0.0488F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, -0.3F);
        this.Tail3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0175F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 15, -1.0F, -0.3F, 0.0F, 1, 1, 10, 0.0F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 9.8F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.2903F, 0.1255F, -0.0374F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -1.0F, -0.4F, -0.2F, 1, 1, 13, 0.002F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.2F, -1.5F);
        this.Heterodontosaurus.addChild(Body);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.6874F, -2.8385F);
        this.Body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0262F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 34, 13, -0.5F, -0.0068F, -0.052F, 1, 1, 3, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.0276F, -2.3435F);
        this.Body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0349F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 15, 48, 0.0F, -0.4F, 1.5F, 0, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 43, 48, 0.0F, -0.4F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.8359F, -4.3343F);
        this.Body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.096F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 13, 15, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, -0.3354F, -0.1034F);
        this.Body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0511F, -0.0976F, -1.0619F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 13, 20, -2.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -0.3354F, -0.1034F);
        this.Body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0846F, -0.0706F, -0.6687F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 31, 32, -1.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, -0.3354F, -2.1034F);
        this.Body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1155F, 0.0166F, -0.5433F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 6, 33, -1.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, -0.3354F, -2.1034F);
        this.Body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0617F, 0.0991F, -1.4138F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 25, 11, -3.4282F, -1.6854F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, -0.3354F, -2.1034F);
        this.Body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1005F, 0.0594F, -0.9339F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 40, 8, -2.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, true));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, -0.2354F, -4.0034F);
        this.Body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.14F, 0.3496F, -1.405F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 44, 2, -4.4282F, -1.6854F, -0.7245F, 2, 0, 1, 0.0F, true));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -0.2354F, -4.0034F);
        this.Body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2869F, 0.2457F, -0.9141F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 43, 0, -2.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, true));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, -0.2354F, -4.0034F);
        this.Body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.3567F, 0.12F, -0.5354F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 33, 23, -1.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, -0.3354F, -0.1034F);
        this.Body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0846F, 0.0706F, 0.6687F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 31, 32, 0.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, -0.3354F, -0.1034F);
        this.Body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0511F, 0.0976F, 1.0619F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 13, 20, 0.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, -0.3354F, -2.1034F);
        this.Body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1005F, -0.0594F, 0.9339F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 40, 8, 0.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, -0.3354F, -2.1034F);
        this.Body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1155F, -0.0166F, 0.5433F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 6, 33, 0.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, -0.3354F, -2.1034F);
        this.Body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0617F, -0.0991F, 1.4138F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 25, 11, 2.4282F, -1.6854F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.5F, -0.2354F, -4.0034F);
        this.Body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.14F, -0.3496F, 1.405F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 44, 2, 2.4282F, -1.6854F, -0.7245F, 2, 0, 1, 0.0F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, -0.2354F, -4.0034F);
        this.Body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.2869F, -0.2457F, 0.9141F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 43, 0, 0.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, -0.2354F, -4.0034F);
        this.Body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.3567F, -0.12F, 0.5354F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 33, 23, 0.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.2F, -5.8F);
        this.Body.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1309F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 14, 35, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -5.7F);
        this.Body.addChild(Chest);


        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.9F, 5.0322F, -1.7944F);
        this.Chest.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.6573F, -0.6233F, -0.6791F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 35, 29, -0.5F, -0.0373F, -0.5915F, 1, 0, 3, 0.0F, true));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.9F, 5.0322F, -1.7944F);
        this.Chest.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.2914F, -0.4509F, -0.5641F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 11, 27, -0.5F, -0.0373F, -0.0915F, 1, 0, 4, 0.0F, true));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 4.7F, -4.1F);
        this.Chest.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.2705F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 41, 16, -1.4F, -0.8332F, 0.319F, 1, 1, 2, -0.002F, true));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 41, 16, 0.4F, -0.8332F, 0.319F, 1, 1, 2, -0.002F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-2.6F, 3.8348F, -3.8889F);
        this.Chest.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.8863F, 0.2867F, 0.3336F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 37, 33, 0.1F, -1.0985F, 0.0541F, 2, 2, 1, 0.0F, true));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(-2.0F, 1.5708F, -2.2531F);
        this.Chest.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.7679F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 14, 40, -0.5F, -0.2993F, 0.0771F, 1, 1, 2, -0.002F, true));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 38, 37, -0.5F, 0.0007F, 0.0771F, 1, 1, 2, 0.003F, true));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 38, 37, 3.5F, 0.0007F, 0.0771F, 1, 1, 2, 0.003F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 14, 40, 3.5F, -0.2993F, 0.0771F, 1, 1, 2, -0.002F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-2.0F, 1.8708F, -2.2531F);
        this.Chest.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.8378F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 34, 8, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, true));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 34, 8, 3.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.9F, 5.0322F, -1.7944F);
        this.Chest.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.2914F, 0.4509F, 0.5641F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 11, 27, -0.5F, -0.0373F, -0.0915F, 1, 0, 4, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.9F, 5.0322F, -1.7944F);
        this.Chest.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.6573F, 0.6233F, 0.6791F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 35, 29, -0.5F, -0.0373F, -0.5915F, 1, 0, 3, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 2.2F, -2.8F);
        this.Chest.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.3142F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 28, 0, 0.0F, -2.1F, 2.4F, 0, 1, 1, 0.0F, false));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 33, 0.0F, -1.7F, 0.4F, 0, 1, 1, 0.0F, false));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 0, -0.5F, -1.5F, -1.6F, 1, 1, 5, 0.002F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.5F, 0.1646F, -0.3034F);
        this.Chest.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.4381F, 0.1532F, -0.5243F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 47, 41, -1.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.5F, 0.1646F, -0.3034F);
        this.Chest.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.3523F, 0.3062F, -0.8963F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 43, 36, -2.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, true));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.5F, 0.1646F, -0.3034F);
        this.Chest.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.1689F, 0.4327F, -1.394F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 16, 11, -5.4282F, -1.6854F, -0.7245F, 3, 0, 1, 0.0F, true));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(-0.5F, 0.7646F, -2.1034F);
        this.Chest.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.4244F, 0.3608F, -0.9425F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 43, 32, -2.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, true));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.5F, 0.7646F, -2.1034F);
        this.Chest.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.2066F, 0.5132F, -1.4466F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 44, 20, -4.4282F, -1.6854F, -0.7245F, 2, 0, 1, 0.0F, true));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.5F, 0.7646F, -2.1034F);
        this.Chest.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.5225F, 0.1797F, -0.5802F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 46, 7, -1.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(-0.5F, 1.4646F, -4.1034F);
        this.Chest.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.5736F, 0.5571F, -1.0521F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 26, 43, -2.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, true));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.5F, 1.4646F, -4.1034F);
        this.Chest.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.722F, 0.3175F, -0.707F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 44, 34, -1.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.5F, 1.4646F, -4.1034F);
        this.Chest.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.722F, -0.3175F, 0.707F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 44, 34, 0.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.5F, 1.4646F, -4.1034F);
        this.Chest.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.5736F, -0.5571F, 1.0521F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 26, 43, 0.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, false));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(0.5F, 0.7646F, -2.1034F);
        this.Chest.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.2066F, -0.5132F, 1.4466F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 44, 20, 2.4282F, -1.6854F, -0.7245F, 2, 0, 1, 0.0F, false));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(0.5F, 0.7646F, -2.1034F);
        this.Chest.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.4244F, -0.3608F, 0.9425F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 43, 32, 0.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, false));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(0.5F, 0.7646F, -2.1034F);
        this.Chest.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.5225F, -0.1797F, 0.5802F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 46, 7, 0.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.5F, 0.1646F, -0.3034F);
        this.Chest.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.3523F, -0.3062F, 0.8963F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 43, 36, 0.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(0.5F, 0.1646F, -0.3034F);
        this.Chest.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.4381F, -0.1532F, 0.5243F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 47, 41, 0.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.5F, 0.1646F, -0.3034F);
        this.Chest.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.1689F, -0.4327F, 1.394F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 16, 11, 2.4282F, -1.6854F, -0.7245F, 3, 0, 1, 0.0F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(2.6F, 3.8348F, -3.8889F);
        this.Chest.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.8863F, -0.2867F, -0.3336F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 37, 33, -2.1F, -1.0985F, 0.0541F, 2, 2, 1, 0.0F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(2.1F, 4.6F, -3.5F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.2323F, 0.3767F, -0.2457F);


        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(-1.9F, 0.0F, 0.2F);
        this.ArmL.addChild(cube_r70);
        this.setRotateAngle(cube_r70, -0.8901F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 0, 7, 1.4F, -0.7373F, -0.1701F, 1, 1, 4, -0.001F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.0F, 0.1474F, -0.1042F);
        this.ArmL.addChild(cube_r71);
        this.setRotateAngle(cube_r71, -0.4363F, 0.0F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 41, 23, -0.5F, -0.1462F, -0.091F, 1, 1, 2, 0.0F, false));

        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.0F, 2.5F, 2.9F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.6282F, 0.0023F, 0.1309F);


        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(0.0F, 0.2F, -0.1F);
        this.ElbowL.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.384F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 9, 37, -0.5F, -0.2F, -0.3F, 1, 4, 1, -0.002F, false));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(0.0F, 0.1F, -0.4F);
        this.ElbowL.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -0.384F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 21, 41, -0.5F, 0.1F, -0.9F, 1, 4, 1, -0.3F, false));

        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.0F, 3.6F, -1.9F);
        this.ElbowL.addChild(HandL);


        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(-0.3F, -0.1F, 0.0F);
        this.HandL.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.9174F, 0.078F, 0.1946F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 19, 46, 0.49F, -0.1F, -0.6F, 0, 3, 1, 0.0F, false));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(-0.3F, -0.1F, 0.0F);
        this.HandL.addChild(cube_r75);
        this.setRotateAngle(cube_r75, -0.5683F, 0.078F, 0.1946F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 26, 45, 0.5F, -0.1F, -0.6F, 0, 4, 1, 0.0F, false));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(-0.3F, -0.1F, 0.1F);
        this.HandL.addChild(cube_r76);
        this.setRotateAngle(cube_r76, -0.3065F, 0.078F, 0.1946F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 36, 45, 0.52F, -0.1F, -0.4F, 0, 4, 1, 0.0F, false));

        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-2.1F, 4.6F, -3.5F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, -0.1168F, -0.3767F, 0.2457F);


        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(1.9F, 0.0F, 0.2F);
        this.ArmL2.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.8901F, 0.0F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 0, 7, -2.4F, -0.7373F, -0.1701F, 1, 1, 4, -0.001F, true));

        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(0.0F, 0.1474F, -0.1042F);
        this.ArmL2.addChild(cube_r78);
        this.setRotateAngle(cube_r78, -0.4363F, 0.0F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 41, 23, -0.5F, -0.1462F, -0.091F, 1, 1, 2, 0.0F, true));

        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(0.0F, 2.5F, 2.9F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.0173F, -0.0023F, -0.1309F);


        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(0.0F, 0.2F, -0.1F);
        this.ElbowL2.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.384F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 9, 37, -0.5F, -0.2F, -0.3F, 1, 4, 1, -0.002F, true));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(0.0F, 0.1F, -0.4F);
        this.ElbowL2.addChild(cube_r80);
        this.setRotateAngle(cube_r80, -0.384F, 0.0F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 21, 41, -0.5F, 0.1F, -0.9F, 1, 4, 1, -0.3F, true));

        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(0.0F, 3.6F, -1.9F);
        this.ElbowL2.addChild(HandL2);


        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(0.3F, -0.1F, 0.0F);
        this.HandL2.addChild(cube_r81);
        this.setRotateAngle(cube_r81, -0.9174F, -0.078F, -0.1946F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 19, 46, -0.49F, -0.1F, -0.6F, 0, 3, 1, 0.0F, true));

        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(0.3F, -0.1F, 0.0F);
        this.HandL2.addChild(cube_r82);
        this.setRotateAngle(cube_r82, -0.5683F, -0.078F, -0.1946F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 26, 45, -0.5F, -0.1F, -0.6F, 0, 4, 1, 0.0F, true));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(0.3F, -0.1F, 0.1F);
        this.HandL2.addChild(cube_r83);
        this.setRotateAngle(cube_r83, -0.3065F, -0.078F, -0.1946F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 36, 45, -0.52F, -0.1F, -0.4F, 0, 4, 1, 0.0F, true));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 1.6F, -4.4F);
        this.Chest.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.0436F, 0.0F, 0.0F);


        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(0.0F, -1.6F, -2.4F);
        this.Neck3.addChild(cube_r84);
        this.setRotateAngle(cube_r84, -0.2793F, 0.0F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 31, 34, -0.5F, 0.5465F, -0.1643F, 1, 1, 3, 0.0F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.6F, -2.7F);
        this.Neck3.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0713F, -0.2129F, 0.0985F);


        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(0.0F, -2.2F, -1.8F);
        this.Neck2.addChild(cube_r85);
        this.setRotateAngle(cube_r85, -0.7679F, 0.0F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 8, 32, -0.5F, -0.1425F, -0.06F, 1, 1, 3, -0.001F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -2.1F, -2.0F);
        this.Neck2.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.0F, -0.1745F, 0.0F);


        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(0.0F, -0.7F, -0.7F);
        this.Neck1.addChild(cube_r86);
        this.setRotateAngle(cube_r86, -0.1745F, 0.0F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 42, 41, -0.5F, 0.2F, -1.0F, 1, 1, 2, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.4F, -1.4F);
        this.Neck1.addChild(Head);
        this.setRotateAngle(Head, -0.1745F, 0.0F, 0.0F);


        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(-0.21F, 2.4158F, -4.7289F);
        this.Head.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.5149F, 0.0F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 14, 32, -0.5F, -0.6F, -0.4F, 1, 1, 1, -0.2F, true));
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 14, 32, -0.08F, -0.6F, -0.4F, 1, 1, 1, -0.2F, false));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(0.0F, 1.0F, -2.8F);
        this.Head.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.3142F, 0.0F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 5, 47, -0.8F, -0.3F, -0.5F, 1, 1, 1, 0.2F, true));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 10, 47, -1.23F, -0.3F, -0.5F, 1, 1, 1, -0.2F, true));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 47, 26, -1.0F, -0.3F, -0.5F, 1, 1, 1, 0.02F, true));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 10, 47, 0.23F, -0.3F, -0.5F, 1, 1, 1, -0.2F, false));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 5, 47, -0.2F, -0.3F, -0.5F, 1, 1, 1, 0.2F, false));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 47, 26, 0.0F, -0.3F, -0.5F, 1, 1, 1, 0.02F, false));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(-0.3F, 0.508F, -1.0621F);
        this.Head.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.3142F, 0.0F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 48, 12, -0.5F, -0.6F, -0.4F, 1, 1, 1, 0.2F, true));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 48, 12, 0.1F, -0.6F, -0.4F, 1, 1, 1, 0.2F, false));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(-0.59F, -0.4892F, -0.6589F);
        this.Head.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -1.2828F, 0.0F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 7, 7, -0.5F, -1.0F, -0.4511F, 1, 2, 1, -0.2F, false));
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 7, 7, 0.68F, -1.0F, -0.4511F, 1, 2, 1, -0.2F, true));

        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(-0.7F, 1.7504F, -1.4112F);
        this.Head.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -0.7767F, 0.0F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 7, 7, -0.51F, -1.7F, -0.6F, 1, 2, 1, -0.2F, true));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 7, 7, 0.91F, -1.7F, -0.6F, 1, 2, 1, -0.2F, false));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(1.0F, 0.6F, -3.5F);
        this.Head.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.7679F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 36, 0, -2.0F, -0.0379F, 0.1089F, 2, 1, 1, -0.004F, false));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(0.5F, 2.6F, -5.3F);
        this.Head.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 1.5533F, 0.0F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 46, 4, -1.0F, -0.0324F, -0.97F, 1, 1, 1, 0.0001F, false));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(0.5F, 2.6F, -5.3F);
        this.Head.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.9076F, 0.0F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 46, 9, -1.0F, -0.0324F, 0.009F, 1, 1, 1, 0.0F, false));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(0.5F, 2.0F, -4.9F);
        this.Head.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.8029F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 41, 11, -1.0F, -0.0033F, 0.2885F, 1, 1, 2, 0.001F, false));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(0.5F, 2.2F, -5.4F);
        this.Head.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.2269F, 0.0F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 16, 5, -1.5F, -0.7857F, 1.9207F, 2, 1, 2, -0.002F, false));
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 28, 5, -1.5F, -0.0857F, 1.9207F, 2, 1, 2, -0.003F, false));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(0.0F, -0.2F, -2.6F);
        this.Head.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.2793F, 0.0F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 8, 27, -1.0F, 2.0119F, 1.8687F, 2, 1, 1, 0.003F, false));
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 0, 27, -1.0F, 0.0119F, -0.1313F, 2, 2, 3, -0.002F, false));

        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(0.0F, 1.3682F, -1.4126F);
        this.Head.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.0349F, 0.0F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 37, 3, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.001F, false));

        this.HeadSlopeL = new ModelRenderer(this);
        this.HeadSlopeL.setRotationPoint(0.0F, 2.2F, -4.8F);
        this.Head.addChild(HeadSlopeL);


        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadSlopeL.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.2409F, 0.3398F, 0.0817F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 46, 22, -0.5F, -0.2207F, 0.136F, 1, 1, 1, -0.002F, false));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 0, 47, -0.5F, -0.2207F, 0.636F, 1, 1, 1, 0.0001F, false));

        this.HeadSlopeL2 = new ModelRenderer(this);
        this.HeadSlopeL2.setRotationPoint(0.0F, 2.2F, -4.8F);
        this.Head.addChild(HeadSlopeL2);


        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadSlopeL2.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.2409F, -0.3398F, -0.0817F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 46, 22, -0.5F, -0.2207F, 0.136F, 1, 1, 1, -0.003F, true));
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 0, 47, -0.5F, -0.2207F, 0.636F, 1, 1, 1, -0.002F, true));

        this.BrowL = new ModelRenderer(this);
        this.BrowL.setRotationPoint(0.8F, 0.3F, -3.4F);
        this.Head.addChild(BrowL);


        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(0.4F, 0.9F, -0.3F);
        this.BrowL.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.4942F, 0.0061F, 0.1166F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 29, 11, -0.7519F, -0.5832F, -0.3057F, 1, 1, 2, -0.3F, false));

        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(0.4F, 1.5F, -0.8F);
        this.BrowL.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.9575F, 0.2969F, 0.369F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 42, 27, -1.1623F, -0.4945F, -0.8937F, 1, 1, 2, -0.3F, false));

        this.cube_r103 = new ModelRenderer(this);
        this.cube_r103.setRotationPoint(-0.3F, 1.5F, 0.4F);
        this.BrowL.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.811F, 0.1443F, 0.11F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 29, 47, -0.6464F, -1.2279F, -0.0113F, 1, 1, 1, 0.0F, false));

        this.cube_r104 = new ModelRenderer(this);
        this.cube_r104.setRotationPoint(-0.3F, 1.5F, -1.3F);
        this.BrowL.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.8293F, 0.2337F, 0.2074F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 46, 15, -1.04F, -0.0083F, 0.1057F, 1, 1, 1, 0.0F, false));

        this.BrowL2 = new ModelRenderer(this);
        this.BrowL2.setRotationPoint(-0.8F, 0.3F, -3.4F);
        this.Head.addChild(BrowL2);


        this.cube_r105 = new ModelRenderer(this);
        this.cube_r105.setRotationPoint(-0.4F, 0.9F, -0.3F);
        this.BrowL2.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.4942F, -0.0061F, -0.1166F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 29, 11, -0.2481F, -0.5832F, -0.3057F, 1, 1, 2, -0.3F, true));

        this.cube_r106 = new ModelRenderer(this);
        this.cube_r106.setRotationPoint(-0.4F, 1.5F, -0.8F);
        this.BrowL2.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.9575F, -0.2969F, -0.369F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 42, 27, 0.1623F, -0.4945F, -0.8937F, 1, 1, 2, -0.3F, true));

        this.cube_r107 = new ModelRenderer(this);
        this.cube_r107.setRotationPoint(0.3F, 1.5F, 0.4F);
        this.BrowL2.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.811F, -0.1443F, -0.11F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 29, 47, -0.3536F, -1.2279F, -0.0113F, 1, 1, 1, 0.0F, true));

        this.cube_r108 = new ModelRenderer(this);
        this.cube_r108.setRotationPoint(0.3F, 1.5F, -1.3F);
        this.BrowL2.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.8293F, -0.2337F, -0.2074F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 46, 15, 0.04F, -0.0083F, 0.1057F, 1, 1, 1, 0.0F, true));

        this.TeethML = new ModelRenderer(this);
        this.TeethML.setRotationPoint(0.4F, 2.8F, -3.9F);
        this.Head.addChild(TeethML);


        this.cube_r109 = new ModelRenderer(this);
        this.cube_r109.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TeethML.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.1792F, 0.1854F, 0.0503F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 31, 43, 0.0F, -0.7151F, -0.0165F, 0, 1, 2, 0.0F, false));

        this.cube_r110 = new ModelRenderer(this);
        this.cube_r110.setRotationPoint(-0.4F, 0.2F, -0.7F);
        this.TeethML.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.2618F, 0.0F, 0.0F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 22, 47, 0.4F, -0.6F, -0.5F, 0, 1, 1, 0.0F, false));

        this.TeethML2 = new ModelRenderer(this);
        this.TeethML2.setRotationPoint(-0.4F, 2.8F, -3.9F);
        this.Head.addChild(TeethML2);


        this.cube_r111 = new ModelRenderer(this);
        this.cube_r111.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TeethML2.addChild(cube_r111);
        this.setRotateAngle(cube_r111, 0.1792F, -0.1854F, -0.0503F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 31, 43, 0.0F, -0.7151F, -0.0165F, 0, 1, 2, 0.0F, true));

        this.cube_r112 = new ModelRenderer(this);
        this.cube_r112.setRotationPoint(0.4F, 0.2F, -0.7F);
        this.TeethML2.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 0.2618F, 0.0F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 22, 47, -0.4F, -0.6F, -0.5F, 0, 1, 1, 0.0F, true));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.1F, 0.5F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.2182F, 0.0F, 0.0F);


        this.cube_r113 = new ModelRenderer(this);
        this.cube_r113.setRotationPoint(0.0F, 2.7795F, -3.8256F);
        this.Jaw.addChild(cube_r113);
        this.setRotateAngle(cube_r113, 0.1396F, 0.0F, 0.0F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 44, 45, -0.5F, -0.9689F, -1.0264F, 1, 1, 1, -0.001F, false));

        this.cube_r114 = new ModelRenderer(this);
        this.cube_r114.setRotationPoint(0.0F, 0.3795F, -0.3256F);
        this.Jaw.addChild(cube_r114);
        this.setRotateAngle(cube_r114, 0.4189F, 0.0F, 0.0F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 45, 38, -0.5F, -0.2F, -4.2F, 1, 1, 1, -0.002F, false));
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 27, 27, -1.0F, -0.2F, -2.2F, 2, 1, 3, 0.001F, false));
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 28, 0, -1.0F, -0.2F, -2.5F, 2, 1, 3, -0.001F, false));

        this.cube_r115 = new ModelRenderer(this);
        this.cube_r115.setRotationPoint(0.0F, 0.3795F, -0.7256F);
        this.Jaw.addChild(cube_r115);
        this.setRotateAngle(cube_r115, -0.0262F, 0.0F, 0.0F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 23, 37, -1.0F, -0.0547F, -1.7026F, 2, 1, 2, -0.003F, false));

        this.JawSlopeL = new ModelRenderer(this);
        this.JawSlopeL.setRotationPoint(0.0F, 2.0795F, -4.0256F);
        this.Jaw.addChild(JawSlopeL);


        this.cube_r116 = new ModelRenderer(this);
        this.cube_r116.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.JawSlopeL.addChild(cube_r116);
        this.setRotateAngle(cube_r116, 0.4357F, 0.2704F, 0.1237F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 7, 43, -0.5F, -0.2481F, -0.0284F, 1, 1, 2, 0.0F, false));

        this.JawSlopeL2 = new ModelRenderer(this);
        this.JawSlopeL2.setRotationPoint(0.0F, 2.0795F, -4.0256F);
        this.Jaw.addChild(JawSlopeL2);


        this.cube_r117 = new ModelRenderer(this);
        this.cube_r117.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.JawSlopeL2.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 0.4357F, -0.2704F, -0.1237F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 7, 43, -0.5F, -0.2481F, -0.0284F, 1, 1, 2, -0.003F, true));

        this.TeethL = new ModelRenderer(this);
        this.TeethL.setRotationPoint(0.5F, 1.6795F, -4.0256F);
        this.Jaw.addChild(TeethL);


        this.cube_r118 = new ModelRenderer(this);
        this.cube_r118.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TeethL.addChild(cube_r118);
        this.setRotateAngle(cube_r118, 0.4658F, 0.2192F, 0.1089F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 39, 45, -0.2F, -0.1738F, 0.0786F, 0, 1, 2, 0.0F, false));

        this.cube_r119 = new ModelRenderer(this);
        this.cube_r119.setRotationPoint(-0.5F, 0.6F, 0.2F);
        this.TeethL.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 0.8378F, 0.0F, 0.0F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 6, 42, 0.42F, -0.952F, -0.6324F, 0, 1, 1, 0.0F, false));

        this.TeethL2 = new ModelRenderer(this);
        this.TeethL2.setRotationPoint(-0.5F, 1.6795F, -4.0256F);
        this.Jaw.addChild(TeethL2);


        this.cube_r120 = new ModelRenderer(this);
        this.cube_r120.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TeethL2.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.4658F, -0.2192F, -0.1089F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 39, 45, 0.2F, -0.1738F, 0.0786F, 0, 1, 2, 0.0F, true));

        this.cube_r121 = new ModelRenderer(this);
        this.cube_r121.setRotationPoint(0.5F, 0.6F, 0.2F);
        this.TeethL2.addChild(cube_r121);
        this.setRotateAngle(cube_r121, 0.8378F, 0.0F, 0.0F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 6, 42, -0.42F, -0.952F, -0.6324F, 0, 1, 1, 0.0F, true));

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
