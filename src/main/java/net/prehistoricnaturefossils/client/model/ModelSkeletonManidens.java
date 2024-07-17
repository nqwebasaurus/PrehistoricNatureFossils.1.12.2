package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonManidens extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Manidens;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer LegL;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer KneeL;
    private final ModelRenderer cube_r15;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer cube_r16;
    private final ModelRenderer FootL;
    private final ModelRenderer cube_r17;
    private final ModelRenderer LegL2;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer KneeL2;
    private final ModelRenderer cube_r21;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer cube_r22;
    private final ModelRenderer FootL2;
    private final ModelRenderer cube_r23;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r29;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r30;
    private final ModelRenderer body;
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
    private final ModelRenderer chest;
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
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer leftArm;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer ElbowL;
    private final ModelRenderer cube_r78;
    private final ModelRenderer cube_r79;
    private final ModelRenderer HandL;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer rightArm;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer HandL2;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r88;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r89;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r90;
    private final ModelRenderer head;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer cube_r98;
    private final ModelRenderer cube_r99;
    private final ModelRenderer cube_r100;
    private final ModelRenderer cube_r101;
    private final ModelRenderer cube_r102;
    private final ModelRenderer cube_r103;
    private final ModelRenderer cube_r104;
    private final ModelRenderer cube_r105;
    private final ModelRenderer cube_r106;
    private final ModelRenderer cube_r107;
    private final ModelRenderer cube_r108;
    private final ModelRenderer cube_r109;
    private final ModelRenderer cube_r110;
    private final ModelRenderer cube_r111;
    private final ModelRenderer cube_r112;
    private final ModelRenderer cube_r113;
    private final ModelRenderer cube_r114;
    private final ModelRenderer cube_r115;
    private final ModelRenderer cube_r116;
    private final ModelRenderer cube_r117;
    private final ModelRenderer cube_r118;
    private final ModelRenderer cube_r119;
    private final ModelRenderer cube_r120;
    private final ModelRenderer cube_r121;
    private final ModelRenderer cube_r122;
    private final ModelRenderer cube_r123;
    private final ModelRenderer cube_r124;
    private final ModelRenderer cube_r125;
    private final ModelRenderer cube_r126;
    private final ModelRenderer cube_r127;
    private final ModelRenderer cube_r128;
    private final ModelRenderer cube_r129;
    private final ModelRenderer cube_r130;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r131;
    private final ModelRenderer cube_r132;
    private final ModelRenderer cube_r133;
    private final ModelRenderer cube_r134;
    private final ModelRenderer cube_r135;
    private final ModelRenderer cube_r136;
    private final ModelRenderer cube_r137;
    private final ModelRenderer cube_r138;
    private final ModelRenderer cube_r139;
    private final ModelRenderer cube_r140;
    private final ModelRenderer cube_r141;
    private final ModelRenderer cube_r142;
    private final ModelRenderer cube_r143;

    public ModelSkeletonManidens() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Manidens = new ModelRenderer(this);
        this.Manidens.setRotationPoint(0.0F, -19.0F, 5.0F);
        this.fossil.addChild(Manidens);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.Manidens.addChild(hips);
        this.setRotateAngle(hips, -0.4908F, 0.4311F, -0.0175F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5F, -0.4107F, -0.2093F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0444F, 0.1918F, -0.0085F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 36, -0.2F, -0.4433F, -2.7988F, 1, 1, 3, -0.2F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, 0.7556F, 0.0388F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6021F, 0.0F, -0.3316F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 29, -0.5F, 0.4071F, -1.4184F, 1, 1, 2, -0.2F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, 0.7556F, 0.0388F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4276F, 0.0F, -0.3316F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 11, -0.5F, -0.2598F, -0.4749F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 0.7556F, 0.0388F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.8639F, 0.0F, -0.3316F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 26, -0.5F, 0.4845F, 0.1306F, 1, 1, 7, -0.35F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 11, -0.5F, -0.1155F, 0.1306F, 1, 1, 7, -0.25F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.2064F, 0.7246F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4276F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 35, -2.2F, -0.1F, -1.0F, 2, 1, 3, -0.2F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 35, 0.2F, -0.1F, -1.0F, 2, 1, 3, -0.2F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, 1.8908F, 0.2789F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4276F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 20, -0.5F, -2.1932F, -1.4641F, 1, 1, 3, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 20, 3.5F, -2.1932F, -1.4641F, 1, 1, 3, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(2.5F, -0.4107F, -0.2093F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0444F, -0.1918F, 0.0085F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 36, -0.8F, -0.4433F, -2.7988F, 1, 1, 3, -0.2F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(2.0F, 0.7556F, 0.0388F);
        this.hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6021F, 0.0F, 0.3316F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 29, -0.5F, 0.4071F, -1.4184F, 1, 1, 2, -0.2F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(2.0F, 0.7556F, 0.0388F);
        this.hips.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.8639F, 0.0F, 0.3316F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 26, -0.5F, 0.4845F, 0.1306F, 1, 1, 7, -0.35F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 27, 11, -0.5F, -0.1155F, 0.1306F, 1, 1, 7, -0.25F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(2.0F, 0.7556F, 0.0388F);
        this.hips.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4276F, 0.0F, 0.3316F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 11, -0.5F, -0.2598F, -0.4749F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.7535F, -1.5286F);
        this.hips.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2531F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 15, 0.0F, -0.6404F, 0.7068F, 0, 1, 4, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 30, -0.5F, -0.2404F, -0.2932F, 1, 1, 6, 0.0F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(3.1F, 0.925F, -0.0821F);
        this.hips.addChild(LegL);
        this.setRotateAngle(LegL, -0.8696F, 0.05F, 0.121F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 1.0015F, -0.1905F);
        this.LegL.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5585F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 0, 1.0F, 0.0F, -0.3F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 0.3743F, -0.2748F);
        this.LegL.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2269F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 42, 0.5F, -0.8078F, -0.2768F, 1, 4, 1, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 3.4743F, -1.2748F);
        this.LegL.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0785F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 27, 45, 0.5F, -0.0533F, 0.0002F, 1, 4, 1, -0.003F, false));

        this.KneeL = new ModelRenderer(this);
        this.KneeL.setRotationPoint(0.0F, 7.4387F, -0.3215F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 0.6877F, 0.0271F, -0.1281F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 10.5256F, -9.4025F);
        this.KneeL.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.0647F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 15, 38, -0.6F, 2.819F, 13.7012F, 1, 7, 1, -0.15F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 37, -1.6F, 2.819F, 13.3012F, 1, 7, 1, -0.001F, false));

        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 3.0039F, 5.8485F);
        this.KneeL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -1.2828F, 0.0F, 0.0F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 12.8453F, -6.9877F);
        this.MetatarsalL.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.9599F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 7, -1.6F, -13.6584F, -6.5978F, 2, 1, 4, -0.004F, false));

        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 3.0345F, 2.0111F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 2.3126F, 0.0F, 0.0F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 13.5108F, -6.7987F);
        this.FootL.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.9599F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 29, -2.0F, -2.0202F, 10.0369F, 3, 1, 5, 0.0F, false));

        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-3.1F, 0.925F, -0.0821F);
        this.hips.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.1298F, 0.017F, -0.1298F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, 1.0015F, -0.1905F);
        this.LegL2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.5585F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 0, -1.0F, 0.0F, -0.3F, 0, 1, 1, 0.0F, true));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, 0.3743F, -0.2748F);
        this.LegL2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2269F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 39, 42, -1.5F, -0.8078F, -0.2768F, 1, 4, 1, 0.0F, true));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, 3.4743F, -1.2748F);
        this.LegL2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0785F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 27, 45, -1.5F, -0.0533F, 0.0002F, 1, 4, 1, -0.003F, true));

        this.KneeL2 = new ModelRenderer(this);
        this.KneeL2.setRotationPoint(0.0F, 7.4387F, -0.3215F);
        this.LegL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, -0.0964F, 0.145F, 0.1421F);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 10.5256F, -9.4025F);
        this.KneeL2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 1.0647F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 15, 38, -0.4F, 2.819F, 13.7012F, 1, 7, 1, -0.15F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 37, 0.6F, 2.819F, 13.3012F, 1, 7, 1, -0.001F, true));

        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(0.0F, 3.0039F, 5.8485F);
        this.KneeL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, -0.3229F, 0.0F, 0.0F);


        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 12.8453F, -6.9877F);
        this.MetatarsalL2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.9599F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 7, -0.4F, -13.6584F, -6.5978F, 2, 1, 4, -0.004F, true));

        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 2.0345F, 2.0111F);
        this.MetatarsalL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.6545F, 0.0F, 0.0F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 13.5108F, -6.7987F);
        this.FootL2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.9599F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 29, -1.0F, -2.0202F, 10.0369F, 3, 1, 5, 0.0F, true));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.8465F, 3.6714F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0987F, 0.0808F, -0.0421F);
        this.tail1.cubeList.add(new ModelBox(tail1, 16, 0, -0.5F, -0.4505F, -0.0198F, 1, 1, 9, -0.003F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.5505F, -0.0198F);
        this.tail1.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0175F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 38, 0, 0.0F, -0.3F, 8.0F, 0, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 12, 38, 0.0F, -0.3F, 6.0F, 0, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 39, 37, 0.0F, -0.3F, 4.0F, 0, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 48, 0.0F, -0.3F, 2.0F, 0, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 13, 49, 0.0F, -0.3F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 2.1578F, 0.433F);
        this.tail1.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5498F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 9, 7, 0.0F, 2.0F, 6.5F, 0, 2, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 15, 0.0F, 1.0F, 4.5F, 0, 2, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 15, 15, 0.0F, 0.0F, 2.5F, 0, 2, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 20, 15, 0.0F, -1.0F, 0.5F, 0, 2, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0495F, 8.8802F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.628F, 0.5057F, 0.228F);


        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.4066F, 1.0645F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0611F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 22, 5, 0.0F, -0.2007F, 6.0305F, 0, 1, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 26, 0.0F, -0.2007F, 4.0305F, 0, 1, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 36, 0.0F, -0.2007F, 2.0305F, 0, 1, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 37, 25, 0.0F, -0.2007F, 0.0305F, 0, 1, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.2934F, 1.0645F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0436F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 15, 15, -0.5F, -0.7F, -1.0F, 1, 1, 9, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 2.1059F, -8.4785F);
        this.tail2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.5498F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 16, 5, 0.0F, 7.0F, 14.5F, 0, 1, 1, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 21, 0.0F, 6.0F, 12.5F, 0, 1, 1, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 22, 0, 0.0F, 5.0F, 10.5F, 0, 1, 1, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 7, 0.0F, 3.0F, 8.5F, 0, 2, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3934F, 9.0645F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2256F, 0.2555F, 0.0579F);


        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.2791F, 0.9445F);
        this.tail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0436F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 15, -0.5F, -0.1F, -1.0F, 1, 1, 12, -0.003F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5209F, 11.8445F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.4674F, -0.3542F, 0.1733F);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0436F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 0, -0.5F, -0.4F, 0.0F, 1, 1, 13, -0.002F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6535F, -1.7286F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.2376F, -0.1273F, 0.0307F);


        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, -0.374F, -6.2749F);
        this.body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3523F, 0.3062F, -0.8963F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 38, 5, -2.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, true));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, -0.374F, -6.2749F);
        this.body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.4381F, 0.1532F, -0.5243F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 31, 50, -1.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -0.374F, -4.2749F);
        this.body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2689F, 0.2031F, -0.9173F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 28, 5, -2.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, true));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, -0.374F, -4.2749F);
        this.body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.3245F, 0.0868F, -0.538F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 49, 42, -1.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, -0.174F, -2.2749F);
        this.body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2155F, 0.1335F, -0.9263F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 27, 11, -2.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, -0.174F, -2.2749F);
        this.body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.2495F, 0.0419F, -0.5428F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 49, 7, -1.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, -0.174F, -0.2749F);
        this.body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0589F, -0.0765F, -0.9308F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 50, 32, -1.9321F, -0.3737F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, -0.174F, -0.2749F);
        this.body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.025F, -0.0932F, -0.537F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 10, 43, -1.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.5F, -0.174F, -2.2749F);
        this.body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1299F, 0.2176F, -1.4065F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 6, 36, -3.4282F, -1.6854F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, -0.374F, -4.2749F);
        this.body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.1448F, 0.3037F, -1.4026F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 45, 37, -4.4282F, -1.6854F, -0.7245F, 2, 0, 1, 0.0F, true));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, -0.374F, -6.2749F);
        this.body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1689F, 0.4327F, -1.394F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 37, 14, -5.4282F, -1.6854F, -0.7245F, 3, 0, 1, 0.0F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, -0.174F, -0.2749F);
        this.body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0589F, 0.0765F, 0.9308F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 50, 32, 0.9321F, -0.3737F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, -0.174F, -0.2749F);
        this.body.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.025F, 0.0932F, 0.537F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 10, 43, 0.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.5F, -0.174F, -2.2749F);
        this.body.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.2155F, -0.1335F, 0.9263F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 27, 11, 0.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, -0.174F, -2.2749F);
        this.body.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1299F, -0.2176F, 1.4065F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 6, 36, 2.4282F, -1.6854F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5F, -0.174F, -2.2749F);
        this.body.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.2495F, -0.0419F, 0.5428F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 49, 7, 0.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(0.5F, -0.374F, -4.2749F);
        this.body.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.2689F, -0.2031F, 0.9173F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 28, 5, 0.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.5F, -0.374F, -4.2749F);
        this.body.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.1448F, -0.3037F, 1.4026F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 45, 37, 2.4282F, -1.6854F, -0.7245F, 2, 0, 1, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.5F, -0.374F, -4.2749F);
        this.body.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.3245F, -0.0868F, 0.538F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 49, 42, 0.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.5F, -0.374F, -6.2749F);
        this.body.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.4381F, -0.1532F, 0.5243F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 31, 50, 0.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, -0.374F, -6.2749F);
        this.body.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.3523F, -0.3062F, 0.8963F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 38, 5, 0.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5F, -0.374F, -6.2749F);
        this.body.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.1689F, -0.4327F, 1.394F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 37, 14, 2.4282F, -1.6854F, -0.7245F, 3, 0, 1, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, -2.2921F, -6.4001F);
        this.body.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.0698F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 39, 51, 0.0F, 1.1F, 5.7F, 0, 1, 1, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 42, 51, 0.0F, 1.1F, 3.7F, 0, 1, 1, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 9, 52, 0.0F, 1.1F, 1.7F, 0, 1, 1, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 12, 52, 0.0F, 1.1F, -0.3F, 0, 1, 1, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 28, 0, -0.5F, 1.5F, -0.3F, 1, 1, 7, -0.003F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.3921F, -6.8001F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0F, 0.0F);


        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.5F, 0.6166F, -3.5096F);
        this.chest.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.3812F, 0.3402F, -0.8871F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 32, 20, -2.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, true));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.5F, 0.6166F, -3.5096F);
        this.chest.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.4765F, 0.1749F, -0.5181F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 50, 10, -1.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(-0.5F, 0.2166F, -1.5096F);
        this.chest.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.3523F, 0.3062F, -0.8963F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 37, 16, -2.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, true));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.5F, 0.2166F, -1.5096F);
        this.chest.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.4381F, 0.1532F, -0.5243F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 50, 27, -1.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.5F, 0.2166F, -1.5096F);
        this.chest.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.1689F, 0.4327F, -1.394F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 16, 11, -6.4282F, -1.6854F, -0.7245F, 4, 0, 1, 0.0F, true));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, 4.552F, -4.9062F);
        this.chest.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.373F, -0.7696F, -0.4955F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 16, 5, -0.009F, 1.0886F, 1.3694F, 1, 0, 3, 0.0F, true));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.5F, 0.6166F, -3.5096F);
        this.chest.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.1775F, 0.4756F, -1.3902F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 15, 21, -5.4282F, -1.6854F, -0.7245F, 3, 0, 1, 0.0F, true));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, 4.552F, -4.9062F);
        this.chest.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0274F, -0.577F, -0.4335F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 33, 32, -0.4269F, 0.4326F, 2.173F, 1, 0, 4, 0.0F, true));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 4.552F, -4.9062F);
        this.chest.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.5323F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 32, 46, -1.4F, -0.7798F, 0.1263F, 1, 1, 2, -0.002F, true));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 32, 46, 0.4F, -0.7798F, 0.1263F, 1, 1, 2, -0.002F, false));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(-3.0F, 3.1773F, -4.2347F);
        this.chest.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.7072F, -0.6925F, -0.4995F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 27, 13, 0.0F, -0.2974F, -1.983F, 1, 2, 2, 0.003F, true));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(0.0F, 2.2443F, -2.2134F);
        this.chest.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.5236F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 15, -3.0F, -0.5F, -2.2F, 1, 1, 4, 0.0F, true));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, 4.552F, -4.9062F);
        this.chest.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.373F, 0.7696F, 0.4955F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 16, 5, -0.991F, 1.0886F, 1.3694F, 1, 0, 3, 0.0F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, 4.552F, -4.9062F);
        this.chest.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0274F, 0.577F, 0.4335F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 33, 32, -0.5731F, 0.4326F, 2.173F, 1, 0, 4, 0.0F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(3.0F, 3.1773F, -4.2347F);
        this.chest.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.7072F, 0.6925F, 0.4995F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 27, 13, -1.0F, -0.2974F, -1.983F, 1, 2, 2, 0.003F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.0F, 2.2443F, -2.2134F);
        this.chest.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.5236F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 0, 15, 2.0F, -0.5F, -2.2F, 1, 1, 4, 0.0F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(0.5F, 0.6166F, -3.5096F);
        this.chest.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.1775F, -0.4756F, 1.3902F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 15, 21, 2.4282F, -1.6854F, -0.7245F, 3, 0, 1, 0.0F, false));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(0.5F, 0.6166F, -3.5096F);
        this.chest.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.3812F, -0.3402F, 0.8871F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 32, 20, 0.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.5F, 0.6166F, -3.5096F);
        this.chest.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.4765F, -0.1749F, 0.5181F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 50, 10, 0.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(0.5F, 0.2166F, -1.5096F);
        this.chest.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.1689F, -0.4327F, 1.394F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 16, 11, 2.4282F, -1.6854F, -0.7245F, 4, 0, 1, 0.0F, false));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(0.5F, 0.2166F, -1.5096F);
        this.chest.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.3523F, -0.3062F, 0.8963F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 37, 16, 0.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, false));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(0.5F, 0.2166F, -1.5096F);
        this.chest.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.4381F, -0.1532F, 0.5243F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 50, 27, 0.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(0.0F, 1.1985F, -4.7349F);
        this.chest.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.1309F, 0.0F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 25, 51, 0.0F, -1.2341F, 0.8634F, 0, 1, 1, 0.0F, false));
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 28, 51, 0.0F, -1.3341F, 2.8634F, 0, 1, 1, 0.0F, false));
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 0, 0, -0.5F, -0.9341F, -0.1366F, 1, 1, 5, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(3.0F, 4.5985F, -3.3349F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.1511F, -0.3573F, -0.7424F);


        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(0.1F, 1.4637F, 0.4294F);
        this.leftArm.addChild(cube_r76);
        this.setRotateAngle(cube_r76, -0.4712F, 0.0F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 27, 20, -0.5F, -0.8962F, -1.7659F, 1, 1, 2, -0.003F, false));

        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(-2.8F, 0.659F, -14.5532F);
        this.leftArm.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.8901F, 0.0F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 0, 21, 2.4F, -12.0334F, 8.0882F, 1, 1, 4, 0.0F, false));

        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.1F, 3.259F, 1.8468F);
        this.leftArm.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.1136F, -0.1998F, 0.0882F);


        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(-1.0F, 5.5273F, -11.8503F);
        this.ElbowL.addChild(cube_r78);
        this.setRotateAngle(cube_r78, -0.384F, 0.0F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 44, 46, 0.5F, -9.8508F, 8.7413F, 1, 4, 1, -0.002F, false));

        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(-1.0F, 5.4273F, -12.1503F);
        this.ElbowL.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.384F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 0, 41, 0.5F, -10.5508F, 8.0913F, 1, 5, 1, -0.2F, false));

        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.5F, 3.5273F, -1.6503F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, -0.0436F, 0.0F, 0.0F);


        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(-1.8F, -0.0131F, -0.1003F);
        this.HandL.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.1766F, 0.0704F, 0.2377F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 16, 48, 0.7765F, -0.4024F, -0.0849F, 1, 2, 1, 0.0F, false));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(-1.8F, 6.4869F, -12.7003F);
        this.HandL.addChild(cube_r81);
        this.setRotateAngle(cube_r81, -0.3065F, 0.078F, 0.1946F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 7, 21, -1.4579F, -10.2436F, 9.5735F, 1, 2, 1, 0.0F, false));

        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-3.0F, 4.5985F, -3.3349F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.5538F, 0.0118F, 1.0003F);


        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(-0.1F, 1.4637F, 0.4294F);
        this.rightArm.addChild(cube_r82);
        this.setRotateAngle(cube_r82, -0.4712F, 0.0F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 27, 20, -0.5F, -0.8962F, -1.7659F, 1, 1, 2, -0.003F, true));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(2.8F, 0.659F, -14.5532F);
        this.rightArm.addChild(cube_r83);
        this.setRotateAngle(cube_r83, -0.8901F, 0.0F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 0, 21, -3.4F, -12.0334F, 8.0882F, 1, 1, 4, 0.0F, true));

        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(-0.1F, 3.259F, 1.8468F);
        this.rightArm.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.4653F, 0.4763F, -0.2263F);


        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(1.0F, 5.5273F, -11.8503F);
        this.ElbowL2.addChild(cube_r84);
        this.setRotateAngle(cube_r84, -0.384F, 0.0F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 44, 46, -1.5F, -9.8508F, 8.7413F, 1, 4, 1, -0.002F, true));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(1.0F, 5.4273F, -12.1503F);
        this.ElbowL2.addChild(cube_r85);
        this.setRotateAngle(cube_r85, -0.384F, 0.0F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 0, 41, -1.5F, -10.5508F, 8.0913F, 1, 5, 1, -0.2F, true));

        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(-0.5F, 3.5273F, -1.6503F);
        this.ElbowL2.addChild(HandL2);
        this.setRotateAngle(HandL2, -0.0435F, -0.0038F, -0.0872F);


        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(1.8F, -0.0131F, -0.1003F);
        this.HandL2.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.1766F, -0.0704F, -0.2377F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 16, 48, -1.7765F, -0.4024F, -0.0849F, 1, 2, 1, 0.0F, true));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(1.8F, 6.4869F, -12.7003F);
        this.HandL2.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.3065F, -0.078F, -0.1946F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 7, 21, 0.4579F, -10.2436F, 9.5735F, 1, 2, 1, 0.0F, true));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.6985F, -4.6349F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.3079F, -0.1248F, 0.0396F);


        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(0.0F, -0.301F, -3.8564F);
        this.neck1.addChild(cube_r88);
        this.setRotateAngle(cube_r88, -0.2356F, 0.0F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 3, 51, 0.0F, -1.1272F, 0.9265F, 0, 1, 1, 0.0F, false));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 6, 51, 0.0F, -1.2272F, 2.9265F, 0, 1, 1, 0.0F, false));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 30, 26, -0.5F, -0.9272F, -0.0735F, 1, 1, 4, -0.003F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.701F, -3.5564F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3414F, -0.0741F, -0.2054F);


        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(0.0F, -2.4F, -1.5F);
        this.neck2.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -0.8814F, 0.0F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 36, 50, 0.0F, -0.2769F, -0.1021F, 0, 1, 1, -0.002F, false));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 0, 51, 0.0F, -0.2769F, 1.8979F, 0, 1, 1, -0.002F, false));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 39, 37, -0.5F, -0.0769F, -0.1021F, 1, 1, 3, -0.002F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -2.1F, -1.7F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.2618F, 0.0F, 0.0F);


        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(0.0F, -1.2F, -1.3F);
        this.neck3.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -0.6458F, 0.0F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 45, 3, -0.5F, -0.2945F, -0.3229F, 1, 1, 2, -0.003F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.9F, -1.2F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);


        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(-1.05F, -0.8339F, -0.4071F);
        this.head.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -1.4137F, 0.0F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 21, 49, -0.46F, -0.1956F, -0.2315F, 1, 1, 1, -0.2F, true));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 21, 49, 1.56F, -0.1956F, -0.2315F, 1, 1, 1, -0.2F, false));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(-1.05F, -0.3339F, -1.4071F);
        this.head.addChild(cube_r92);
        this.setRotateAngle(cube_r92, -0.7854F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 49, 18, -0.46F, -0.7615F, -0.2311F, 1, 1, 1, -0.21F, true));
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 49, 18, 1.56F, -0.7615F, -0.2311F, 1, 1, 1, -0.21F, false));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(-1.05F, 0.1517F, -1.5829F);
        this.head.addChild(cube_r93);
        this.setRotateAngle(cube_r93, -0.2967F, 0.0F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 49, 46, -0.46F, -0.7152F, -0.2082F, 1, 1, 1, -0.2F, true));
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 49, 46, 1.56F, -0.7152F, -0.2082F, 1, 1, 1, -0.2F, false));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(-1.05F, -0.2483F, -0.9829F);
        this.head.addChild(cube_r94);
        this.setRotateAngle(cube_r94, -0.8552F, 0.0F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 12, 29, -0.46F, -1.0F, -0.3F, 1, 2, 1, -0.19F, true));
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 12, 29, -0.16F, -1.0F, -0.3F, 1, 2, 1, -0.19F, true));
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 12, 29, 1.56F, -1.0F, -0.3F, 1, 2, 1, -0.19F, false));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(0.2F, 0.9347F, 0.4957F);
        this.head.addChild(cube_r95);
        this.setRotateAngle(cube_r95, -0.6545F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 45, 33, -1.7F, -1.5F, -2.1F, 1, 1, 2, -0.2F, true));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 45, 33, 0.3F, -1.5F, -2.1F, 1, 1, 2, -0.2F, false));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(-0.3F, 0.0527F, -1.0377F);
        this.head.addChild(cube_r96);
        this.setRotateAngle(cube_r96, -0.5672F, 0.0F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 20, 45, -1.0F, -1.5F, 0.0F, 2, 2, 1, -0.003F, true));
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 20, 45, -0.4F, -1.5F, 0.0F, 2, 2, 1, -0.005F, false));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(0.2F, 1.1568F, -0.8616F);
        this.head.addChild(cube_r97);
        this.setRotateAngle(cube_r97, -0.0436F, 0.0F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 7, 15, -1.7F, -1.4F, -0.2F, 1, 2, 1, -0.2F, true));
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 7, 15, 0.3F, -1.4F, -0.2F, 1, 2, 1, -0.2F, false));

        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(-0.3F, -0.3871F, -1.2186F);
        this.head.addChild(cube_r98);
        this.setRotateAngle(cube_r98, -0.0436F, 0.0F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 44, 0, -1.0F, 0.6F, -0.9F, 2, 1, 1, 0.0F, true));
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 44, 0, -0.4F, 0.6F, -0.9F, 2, 1, 1, 0.0F, false));

        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(-0.3F, -0.4826F, -1.1144F);
        this.head.addChild(cube_r99);
        this.setRotateAngle(cube_r99, -0.0436F, 0.0F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 37, 9, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.01F, true));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 37, 9, -0.4F, -1.0F, -1.0F, 2, 2, 2, -0.011F, false));

        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(0.0F, 0.7347F, -6.0043F);
        this.head.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 1.0123F, 0.0F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 50, 13, -0.5F, -0.0191F, -1.0652F, 1, 1, 1, 0.02F, false));

        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(0.0F, -0.0653F, -5.5043F);
        this.head.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.7854F, 0.0F, 0.0F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 50, 24, -0.5F, 0.2F, -1.0F, 1, 1, 1, 0.002F, false));

        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(-0.35F, 0.9542F, -5.4936F);
        this.head.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.9338F, 0.0F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 8, 49, -0.38F, -0.5F, -0.7F, 1, 1, 1, -0.2F, true));

        this.cube_r103 = new ModelRenderer(this);
        this.cube_r103.setRotationPoint(-0.35F, 0.7542F, -5.6936F);
        this.head.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.7767F, 0.0F, 0.0F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 48, 39, -0.38F, -0.2203F, -0.1418F, 1, 1, 1, -0.19F, true));

        this.cube_r104 = new ModelRenderer(this);
        this.cube_r104.setRotationPoint(-0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.384F, -0.2793F, 0.0F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 50, 2, -0.0801F, 0.6944F, 1.4947F, 1, 1, 1, -0.005F, true));

        this.cube_r105 = new ModelRenderer(this);
        this.cube_r105.setRotationPoint(-0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.0524F, -0.2793F, 0.0F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 0, 0, 0.1199F, 0.4661F, 0.0012F, 0, 1, 2, 0.0F, true));
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 44, 14, -0.0801F, 0.1661F, 0.0012F, 1, 1, 2, 0.0F, true));

        this.cube_r106 = new ModelRenderer(this);
        this.cube_r106.setRotationPoint(-0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.5061F, -0.2793F, 0.0F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 49, 49, -0.0801F, 0.0443F, -0.5134F, 1, 1, 1, -0.005F, true));

        this.cube_r107 = new ModelRenderer(this);
        this.cube_r107.setRotationPoint(-0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.2564F, -0.1949F, 0.023F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 6, 38, -0.1641F, -0.4688F, -0.5136F, 1, 1, 3, -0.004F, true));

        this.cube_r108 = new ModelRenderer(this);
        this.cube_r108.setRotationPoint(-0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.5411F, -0.2739F, 0.0F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 20, 40, -0.3747F, -0.6665F, 0.8169F, 1, 2, 2, -0.3F, true));

        this.cube_r109 = new ModelRenderer(this);
        this.cube_r109.setRotationPoint(-0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.5847F, -0.2739F, 0.0F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 8, 0, -0.2948F, -0.4462F, 0.7874F, 1, 2, 1, -0.21F, true));

        this.cube_r110 = new ModelRenderer(this);
        this.cube_r110.setRotationPoint(-0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.3752F, -0.2739F, 0.0F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 44, 7, -0.2948F, 0.3256F, 1.0428F, 1, 1, 2, -0.2F, true));

        this.cube_r111 = new ModelRenderer(this);
        this.cube_r111.setRotationPoint(-0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r111);
        this.setRotateAngle(cube_r111, 0.192F, -0.2739F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 48, 21, -0.3141F, -0.6629F, 1.7998F, 1, 1, 1, -0.2F, true));
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 39, 48, -0.1041F, -0.6629F, 1.7998F, 1, 1, 1, 0.0F, true));

        this.cube_r112 = new ModelRenderer(this);
        this.cube_r112.setRotationPoint(-0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 1.405F, -0.2739F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 28, 0, -0.3747F, 1.3483F, 0.2041F, 1, 2, 2, -0.29F, true));

        this.cube_r113 = new ModelRenderer(this);
        this.cube_r113.setRotationPoint(-0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r113);
        this.setRotateAngle(cube_r113, 0.351F, -0.3433F, -0.0867F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 27, 40, 0.2874F, -0.9147F, 1.2499F, 1, 2, 2, -0.002F, true));

        this.cube_r114 = new ModelRenderer(this);
        this.cube_r114.setRotationPoint(-0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r114);
        this.setRotateAngle(cube_r114, 0.6806F, -0.3222F, -0.3509F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 38, 0, -0.2337F, -0.2993F, -0.1797F, 1, 1, 3, -0.3F, true));

        this.cube_r115 = new ModelRenderer(this);
        this.cube_r115.setRotationPoint(0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 0.6806F, 0.3222F, 0.3509F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 38, 0, -0.7663F, -0.2993F, -0.1797F, 1, 1, 3, -0.3F, false));

        this.cube_r116 = new ModelRenderer(this);
        this.cube_r116.setRotationPoint(0.0F, -0.7653F, -3.9043F);
        this.head.addChild(cube_r116);
        this.setRotateAngle(cube_r116, 0.5585F, 0.0F, 0.0F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 44, 42, -0.5F, -0.0418F, -1.7459F, 1, 1, 2, 0.0F, false));

        this.cube_r117 = new ModelRenderer(this);
        this.cube_r117.setRotationPoint(0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 0.351F, 0.3433F, 0.0867F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 27, 40, -1.2874F, -0.9147F, 1.2499F, 1, 2, 2, -0.002F, false));

        this.cube_r118 = new ModelRenderer(this);
        this.cube_r118.setRotationPoint(0.0F, -1.4653F, -2.1043F);
        this.head.addChild(cube_r118);
        this.setRotateAngle(cube_r118, 0.3316F, 0.0F, 0.0F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 40, 30, -0.5F, -0.0681F, -1.8731F, 1, 2, 2, -0.002F, false));

        this.cube_r119 = new ModelRenderer(this);
        this.cube_r119.setRotationPoint(0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 0.5061F, 0.2793F, 0.0F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 49, 49, -0.9199F, 0.0443F, -0.5134F, 1, 1, 1, -0.005F, false));

        this.cube_r120 = new ModelRenderer(this);
        this.cube_r120.setRotationPoint(0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.0524F, 0.2793F, 0.0F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 0, 0, -0.1199F, 0.4661F, 0.0012F, 0, 1, 2, 0.0F, false));
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 44, 14, -0.9199F, 0.1661F, 0.0012F, 1, 1, 2, 0.0F, false));

        this.cube_r121 = new ModelRenderer(this);
        this.cube_r121.setRotationPoint(0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r121);
        this.setRotateAngle(cube_r121, 0.384F, 0.2793F, 0.0F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 50, 2, -0.9199F, 0.6944F, 1.4947F, 1, 1, 1, -0.005F, false));

        this.cube_r122 = new ModelRenderer(this);
        this.cube_r122.setRotationPoint(0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r122);
        this.setRotateAngle(cube_r122, 0.2564F, 0.1949F, -0.023F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 6, 38, -0.8359F, -0.4688F, -0.5136F, 1, 1, 3, -0.004F, false));

        this.cube_r123 = new ModelRenderer(this);
        this.cube_r123.setRotationPoint(0.35F, 0.7542F, -5.6936F);
        this.head.addChild(cube_r123);
        this.setRotateAngle(cube_r123, 0.7767F, 0.0F, 0.0F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 48, 39, -0.62F, -0.2203F, -0.1418F, 1, 1, 1, -0.19F, false));

        this.cube_r124 = new ModelRenderer(this);
        this.cube_r124.setRotationPoint(0.35F, 0.9542F, -5.4936F);
        this.head.addChild(cube_r124);
        this.setRotateAngle(cube_r124, 0.9338F, 0.0F, 0.0F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 8, 49, -0.62F, -0.5F, -0.7F, 1, 1, 1, -0.2F, false));

        this.cube_r125 = new ModelRenderer(this);
        this.cube_r125.setRotationPoint(0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r125);
        this.setRotateAngle(cube_r125, 0.5847F, 0.2739F, 0.0F);
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 8, 0, -0.7052F, -0.4462F, 0.7874F, 1, 2, 1, -0.21F, false));

        this.cube_r126 = new ModelRenderer(this);
        this.cube_r126.setRotationPoint(0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r126);
        this.setRotateAngle(cube_r126, 1.405F, 0.2739F, 0.0F);
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 28, 0, -0.6253F, 1.3483F, 0.2041F, 1, 2, 2, -0.29F, false));

        this.cube_r127 = new ModelRenderer(this);
        this.cube_r127.setRotationPoint(0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r127);
        this.setRotateAngle(cube_r127, 0.3752F, 0.2739F, 0.0F);
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 44, 7, -0.7052F, 0.3256F, 1.0428F, 1, 1, 2, -0.2F, false));

        this.cube_r128 = new ModelRenderer(this);
        this.cube_r128.setRotationPoint(0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r128);
        this.setRotateAngle(cube_r128, 0.192F, 0.2739F, 0.0F);
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 48, 21, -0.6859F, -0.6629F, 1.7998F, 1, 1, 1, -0.2F, false));
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 39, 48, -0.8959F, -0.6629F, 1.7998F, 1, 1, 1, 0.0F, false));

        this.cube_r129 = new ModelRenderer(this);
        this.cube_r129.setRotationPoint(0.4463F, 0.4608F, -4.8476F);
        this.head.addChild(cube_r129);
        this.setRotateAngle(cube_r129, 0.5411F, 0.2739F, 0.0F);
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 20, 40, -0.6253F, -0.6665F, 0.8169F, 1, 2, 2, -0.3F, false));

        this.cube_r130 = new ModelRenderer(this);
        this.cube_r130.setRotationPoint(-0.61F, -1.2418F, -0.5484F);
        this.head.addChild(cube_r130);
        this.setRotateAngle(cube_r130, -0.0524F, 0.0F, 0.0F);
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 43, 23, -0.7F, -0.4299F, -1.3772F, 1, 1, 2, -0.2F, true));
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 43, 23, 0.92F, -0.4299F, -1.3772F, 1, 1, 2, -0.2F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.6347F, -0.4043F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5672F, 0.0F, 0.0F);


        this.cube_r131 = new ModelRenderer(this);
        this.cube_r131.setRotationPoint(-1.114F, 0.7138F, -1.9118F);
        this.jaw.addChild(cube_r131);
        this.setRotateAngle(cube_r131, 0.2258F, -0.2617F, 0.0069F);
        this.cube_r131.cubeList.add(new ModelBox(cube_r131, 42, 18, -0.3355F, -0.5787F, -1.5987F, 1, 1, 2, -0.19F, true));

        this.cube_r132 = new ModelRenderer(this);
        this.cube_r132.setRotationPoint(-1.114F, 0.7138F, -1.9118F);
        this.jaw.addChild(cube_r132);
        this.setRotateAngle(cube_r132, -0.1931F, -0.2617F, 0.0069F);
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 5, 43, -0.3355F, -0.0162F, -2.9783F, 1, 1, 2, -0.2F, true));

        this.cube_r133 = new ModelRenderer(this);
        this.cube_r133.setRotationPoint(-1.114F, 0.7138F, -1.9118F);
        this.jaw.addChild(cube_r133);
        this.setRotateAngle(cube_r133, 0.17F, 0.011F, -0.0352F);
        this.cube_r133.cubeList.add(new ModelBox(cube_r133, 0, 29, 0.2005F, -1.9778F, -2.96F, 1, 2, 1, -0.3F, true));

        this.cube_r134 = new ModelRenderer(this);
        this.cube_r134.setRotationPoint(-1.114F, 0.7138F, -1.9118F);
        this.jaw.addChild(cube_r134);
        this.setRotateAngle(cube_r134, 0.0861F, -0.2617F, 0.0069F);
        this.cube_r134.cubeList.add(new ModelBox(cube_r134, 3, 47, 0.1273F, -0.8562F, -2.2597F, 0, 1, 2, 0.0F, true));

        this.cube_r135 = new ModelRenderer(this);
        this.cube_r135.setRotationPoint(-1.114F, 0.7138F, -1.9118F);
        this.jaw.addChild(cube_r135);
        this.setRotateAngle(cube_r135, 0.0861F, -0.2617F, 0.0069F);
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 16, 0, -0.3355F, -0.6845F, -2.603F, 1, 1, 3, -0.21F, true));

        this.cube_r136 = new ModelRenderer(this);
        this.cube_r136.setRotationPoint(1.114F, 0.7138F, -1.9118F);
        this.jaw.addChild(cube_r136);
        this.setRotateAngle(cube_r136, 0.0861F, 0.2617F, -0.0069F);
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 3, 47, -0.1273F, -0.8562F, -2.2597F, 0, 1, 2, 0.0F, false));

        this.cube_r137 = new ModelRenderer(this);
        this.cube_r137.setRotationPoint(1.114F, 0.7138F, -1.9118F);
        this.jaw.addChild(cube_r137);
        this.setRotateAngle(cube_r137, 0.17F, -0.011F, 0.0352F);
        this.cube_r137.cubeList.add(new ModelBox(cube_r137, 0, 29, -1.2005F, -1.9778F, -2.96F, 1, 2, 1, -0.3F, false));

        this.cube_r138 = new ModelRenderer(this);
        this.cube_r138.setRotationPoint(1.114F, 0.7138F, -1.9118F);
        this.jaw.addChild(cube_r138);
        this.setRotateAngle(cube_r138, 0.2258F, 0.2617F, -0.0069F);
        this.cube_r138.cubeList.add(new ModelBox(cube_r138, 42, 18, -0.6645F, -0.5787F, -1.5987F, 1, 1, 2, -0.19F, false));

        this.cube_r139 = new ModelRenderer(this);
        this.cube_r139.setRotationPoint(1.114F, 0.7138F, -1.9118F);
        this.jaw.addChild(cube_r139);
        this.setRotateAngle(cube_r139, -0.1931F, 0.2617F, -0.0069F);
        this.cube_r139.cubeList.add(new ModelBox(cube_r139, 5, 43, -0.6645F, -0.0162F, -2.9783F, 1, 1, 2, -0.2F, false));

        this.cube_r140 = new ModelRenderer(this);
        this.cube_r140.setRotationPoint(1.114F, 0.7138F, -1.9118F);
        this.jaw.addChild(cube_r140);
        this.setRotateAngle(cube_r140, 0.0861F, 0.2617F, -0.0069F);
        this.cube_r140.cubeList.add(new ModelBox(cube_r140, 16, 0, -0.6645F, -0.6845F, -2.603F, 1, 1, 3, -0.21F, false));

        this.cube_r141 = new ModelRenderer(this);
        this.cube_r141.setRotationPoint(0.0F, 0.2138F, -5.1201F);
        this.jaw.addChild(cube_r141);
        this.setRotateAngle(cube_r141, -0.3927F, 0.0F, 0.0F);
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 10, 45, -0.5F, -0.3F, -0.6F, 1, 1, 2, -0.2F, false));

        this.cube_r142 = new ModelRenderer(this);
        this.cube_r142.setRotationPoint(0.0F, 0.7138F, -1.1201F);
        this.jaw.addChild(cube_r142);
        this.setRotateAngle(cube_r142, -0.2182F, 0.0F, 0.0F);
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 45, 28, -1.5F, -0.9929F, -1.2351F, 1, 1, 2, -0.21F, true));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 45, 28, 0.5F, -0.9929F, -1.2351F, 1, 1, 2, -0.21F, false));

        this.cube_r143 = new ModelRenderer(this);
        this.cube_r143.setRotationPoint(0.0F, 1.1138F, -0.6201F);
        this.jaw.addChild(cube_r143);
        this.setRotateAngle(cube_r143, 0.2182F, 0.0F, 0.0F);
        this.cube_r143.cubeList.add(new ModelBox(cube_r143, 37, 25, -1.5F, -1.2F, -1.5F, 1, 1, 3, -0.2F, true));
        this.cube_r143.cubeList.add(new ModelBox(cube_r143, 37, 25, 0.5F, -1.2F, -1.5F, 1, 1, 3, -0.2F, false));

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
