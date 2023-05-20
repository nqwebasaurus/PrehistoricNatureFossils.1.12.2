package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBobosaurus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer Bellyflab_r1;
    private final ModelRenderer Bellyflab_r2;
    private final ModelRenderer Bellyflab_r3;
    private final ModelRenderer Bellyflab_r4;
    private final ModelRenderer Bellyflab_r5;
    private final ModelRenderer Bellyflab_r6;
    private final ModelRenderer Bellyflab_r7;
    private final ModelRenderer Bellyflab_r8;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer leftLeg;
    private final ModelRenderer cube_r20;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer cube_r21;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer rightLeg;
    private final ModelRenderer cube_r22;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer cube_r23;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer body;
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
    private final ModelRenderer chest;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Bodyfront_r2;
    private final ModelRenderer Bodyfront_r3;
    private final ModelRenderer Bodyfront_r4;
    private final ModelRenderer Bodyfront_r5;
    private final ModelRenderer Bodyfront_r6;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer cube_r98;
    private final ModelRenderer neck2;
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
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r110;
    private final ModelRenderer cube_r111;
    private final ModelRenderer cube_r112;
    private final ModelRenderer cube_r113;
    private final ModelRenderer cube_r114;
    private final ModelRenderer head;
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
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r127;
    private final ModelRenderer cube_r128;
    private final ModelRenderer cube_r129;
    private final ModelRenderer cube_r130;

    public ModelSkeletonBobosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -13.0F, 7.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.1687F, 0.045F, 0.258F);


        this.Bellyflab_r1 = new ModelRenderer(this);
        this.Bellyflab_r1.setRotationPoint(-2.99F, 1.5621F, -0.883F);
        this.hips.addChild(Bellyflab_r1);
        this.setRotateAngle(Bellyflab_r1, 0.2196F, 0.5771F, 0.6993F);
        this.Bellyflab_r1.cubeList.add(new ModelBox(Bellyflab_r1, 52, 13, -0.3035F, -1.3284F, -0.36F, 3, 1, 1, 0.0F, true));

        this.Bellyflab_r2 = new ModelRenderer(this);
        this.Bellyflab_r2.setRotationPoint(-2.99F, 0.5621F, 0.317F);
        this.hips.addChild(Bellyflab_r2);
        this.setRotateAngle(Bellyflab_r2, 0.1987F, -0.3908F, 0.5016F);
        this.Bellyflab_r2.cubeList.add(new ModelBox(Bellyflab_r2, 53, 4, 0.5636F, -0.6693F, -1.4161F, 2, 1, 2, 0.0F, true));

        this.Bellyflab_r3 = new ModelRenderer(this);
        this.Bellyflab_r3.setRotationPoint(-4.99F, -0.6379F, 3.917F);
        this.hips.addChild(Bellyflab_r3);
        this.setRotateAngle(Bellyflab_r3, -0.162F, -0.1468F, 2.4118F);
        this.Bellyflab_r3.cubeList.add(new ModelBox(Bellyflab_r3, 9, 53, -4.0443F, -2.7796F, -4.8431F, 3, 1, 1, 0.0F, true));

        this.Bellyflab_r4 = new ModelRenderer(this);
        this.Bellyflab_r4.setRotationPoint(4.99F, -0.6379F, 3.917F);
        this.hips.addChild(Bellyflab_r4);
        this.setRotateAngle(Bellyflab_r4, -0.162F, 0.1468F, -2.4118F);
        this.Bellyflab_r4.cubeList.add(new ModelBox(Bellyflab_r4, 9, 53, 1.0443F, -2.7796F, -4.8431F, 3, 1, 1, 0.0F, false));

        this.Bellyflab_r5 = new ModelRenderer(this);
        this.Bellyflab_r5.setRotationPoint(2.99F, 0.5621F, 0.317F);
        this.hips.addChild(Bellyflab_r5);
        this.setRotateAngle(Bellyflab_r5, 0.1987F, 0.3908F, -0.5016F);
        this.Bellyflab_r5.cubeList.add(new ModelBox(Bellyflab_r5, 53, 4, -2.5636F, -0.6693F, -1.4161F, 2, 1, 2, 0.0F, false));

        this.Bellyflab_r6 = new ModelRenderer(this);
        this.Bellyflab_r6.setRotationPoint(2.99F, 1.5621F, -0.883F);
        this.hips.addChild(Bellyflab_r6);
        this.setRotateAngle(Bellyflab_r6, 0.2196F, -0.5771F, -0.6993F);
        this.Bellyflab_r6.cubeList.add(new ModelBox(Bellyflab_r6, 52, 13, -2.6965F, -1.3284F, -0.36F, 3, 1, 1, 0.0F, false));

        this.Bellyflab_r7 = new ModelRenderer(this);
        this.Bellyflab_r7.setRotationPoint(2.99F, 1.4621F, 1.217F);
        this.hips.addChild(Bellyflab_r7);
        this.setRotateAngle(Bellyflab_r7, 0.2182F, 0.0F, 0.0F);
        this.Bellyflab_r7.cubeList.add(new ModelBox(Bellyflab_r7, 29, 51, -4.0F, -0.5F, -1.4F, 2, 1, 2, 0.0F, false));

        this.Bellyflab_r8 = new ModelRenderer(this);
        this.Bellyflab_r8.setRotationPoint(2.99F, 1.4621F, 0.917F);
        this.hips.addChild(Bellyflab_r8);
        this.setRotateAngle(Bellyflab_r8, 0.2182F, 0.0F, 0.0F);
        this.Bellyflab_r8.cubeList.add(new ModelBox(Bellyflab_r8, 0, 52, -4.0F, -0.5F, -4.0F, 2, 1, 2, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.7F, -4.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2007F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 39, -0.5F, -0.2F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.8488F, -17.607F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1833F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 18, 0.0F, -4.2F, 14.8F, 0, 4, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 11, 0.0F, -4.0F, 16.8F, 0, 4, 1, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0873F, 0.3054F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1571F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 35, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.002F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.0291F, 5.8931F);
        this.tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3316F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 46, 0.0F, -0.2074F, -1.1061F, 0, 2, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.3291F, 1.8931F);
        this.tail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3316F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 39, 0.0F, -0.3074F, -1.0061F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0291F, 3.8931F);
        this.tail1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3316F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 59, 0.0F, -0.4074F, -1.0061F, 0, 1, 1, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -3.3488F, -17.607F);
        this.tail1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1833F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 55, 0.0F, -3.3F, 22.9F, 0, 3, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 55, 0.0F, -3.5F, 20.9F, 0, 3, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 11, 0.0F, -3.7F, 18.9F, 0, 4, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.9F, 6.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, 0.2618F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -4.3488F, -24.307F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1833F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 54, 0.0F, -3.0F, 27.5F, 0, 3, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 54, 0.0F, -3.3F, 25.5F, 0, 3, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0291F, 1.1931F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3316F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 37, 35, 0.0F, 0.0926F, -0.6061F, 0, 2, 1, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0291F, 3.1931F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3316F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 25, 0.0F, 0.0926F, -0.6061F, 0, 2, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.4F, -0.1F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1222F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 41, -0.5F, -0.1F, 0.0F, 1, 1, 5, -0.002F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.6F, 4.6F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0903F, 0.2608F, -0.0233F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.0349F, -0.0015F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0698F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 43, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.001F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.5058F, 2.2916F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3316F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 39, 0.0F, 0.8015F, -0.6336F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.5058F, 0.2916F);
        this.tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3316F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 47, 23, 0.0F, 0.8015F, -0.6336F, 0, 1, 1, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -4.8836F, -29.0085F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1833F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 12, 56, 0.0F, -2.9F, 31.4F, 0, 2, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 56, 54, 0.0F, -2.9F, 29.4F, 0, 2, 1, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1651F, 3.9985F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, 0.2618F, 0.0F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.tail4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 30, -0.5F, -0.2209F, -0.1005F, 1, 1, 7, 0.003F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -5.0488F, -32.207F);
        this.tail4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1833F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 14, 59, 0.0F, -2.6F, 38.5F, 0, 1, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 14, 59, 0.0F, -2.7F, 36.5F, 0, 1, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 6, 56, 0.0F, -2.8F, 34.5F, 0, 2, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 56, 0.0F, -2.8F, 32.5F, 0, 2, 1, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.6F, 6.8F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, 0.2618F, 0.0F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.tail5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 10, 30, -0.5F, -0.3305F, -0.0939F, 1, 1, 5, 0.002F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -5.6488F, -39.007F);
        this.tail5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1833F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 48, 34, 0.0F, -2.5F, 40.3F, 0, 1, 1, 0.0F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.5F, 0.9F, -0.2F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.5404F, 0.1857F, -0.2912F);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.1309F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 50, 28, -0.3F, -0.8F, -1.0F, 4, 1, 1, 0.0F, false));

        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(4.0F, 0.2F, -1.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.0602F, -0.1639F, 0.354F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 7, 47, 0.0F, -1.0F, 0.0F, 5, 1, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.leftLeg2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.1222F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 46, 41, 0.0F, -1.0F, -0.4F, 5, 1, 1, 0.0F, false));

        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(4.8F, 0.0F, 1.4F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.1332F, -0.2261F, 0.5387F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 23, 26, -0.1078F, -0.6F, -2.1101F, 9, 0, 4, 0.0F, false));

        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.5F, 0.9F, -0.2F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.4331F, 0.0552F, 0.3176F);


        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.1309F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 11, 50, -3.7F, -0.8F, -1.0F, 4, 1, 1, 0.0F, false));

        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-4.0F, 0.2F, -1.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.0602F, 0.1639F, -0.354F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 46, 17, -5.0F, -1.0F, 0.0F, 5, 1, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.rightLeg2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.1222F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 46, 10, -5.0F, -1.0F, -0.4F, 5, 1, 1, 0.0F, false));

        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-4.8F, 0.0F, 1.4F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.1022F, 0.2415F, -0.4051F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 25, -8.8922F, -0.6F, -2.3101F, 9, 0, 4, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.3F, -4.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0436F, -0.1309F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 38, 8, -0.5F, -2.2F, -12.5F, 1, 1, 5, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 5.7F, -7.6F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1571F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -3.5F, -2.0279F, 0.4313F, 7, 2, 8, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 4.3F, -12.5F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1745F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 23, 0, -3.5F, -1.5F, 0.0F, 7, 2, 5, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -2.5488F, -14.007F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1833F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 3, 18, 0.0F, -4.4F, 13.5F, 0, 4, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 38, 53, 0.0F, -4.6F, 11.5F, 0, 4, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 41, 53, 0.0F, -4.7F, 9.5F, 0, 4, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 44, 53, 0.0F, -4.6F, 7.5F, 0, 4, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 26, 54, 0.0F, -4.3F, 5.5F, 0, 4, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 47, 54, 0.0F, -3.8F, 3.5F, 0, 4, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 23, 0, 0.0F, -2.8F, 1.5F, 0, 3, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.4736F, -0.1973F);
        this.body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0279F, -0.1224F, -1.2607F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 56, 2, -2.5175F, -1.7718F, -0.4279F, 1, 0, 1, 0.0F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.4736F, -0.1973F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0931F, -0.0842F, -0.6476F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 27, 13, -2.2594F, -0.581F, -0.4279F, 2, 0, 1, 0.0F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.4736F, -0.1973F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1112F, 0.0583F, 0.5669F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 46, 44, -0.6346F, 0.045F, -0.4279F, 1, 0, 1, 0.0F, true));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.9736F, -2.1973F);
        this.body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1061F, 0.0711F, 0.57F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 55, 52, -0.6346F, 0.045F, -0.4279F, 1, 0, 1, 0.0F, true));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.9736F, -2.1973F);
        this.body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1033F, -0.075F, -0.6441F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 30, -2.2594F, -0.581F, -0.4279F, 2, 0, 1, 0.0F, true));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -1.3736F, -4.1973F);
        this.body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0484F, -0.161F, -1.1705F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 52, 39, -4.3416F, -1.8626F, -0.3999F, 3, 0, 1, 0.0F, true));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -0.9736F, -2.1973F);
        this.body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0416F, -0.1207F, -1.2563F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 27, 15, -3.5175F, -1.7718F, -0.4279F, 2, 0, 1, 0.0F, true));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -1.3736F, -4.1973F);
        this.body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1322F, -0.1041F, -0.5567F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 32, -2.1673F, -0.7563F, -0.3999F, 2, 0, 1, 0.0F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -1.3736F, -4.1973F);
        this.body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1309F, 0.1057F, 0.7821F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 57, 36, -0.7746F, -0.0003F, -0.3999F, 1, 0, 1, 0.0F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -1.8736F, -6.1973F);
        this.body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0173F, -0.0288F, 0.8301F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 57, 47, -0.6283F, 0.1002F, -0.4279F, 1, 0, 1, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -1.8736F, -6.1973F);
        this.body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0234F, -0.0242F, -0.4794F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 34, -2.2594F, -0.581F, -0.4279F, 2, 0, 1, 0.0F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -1.8736F, -6.1973F);
        this.body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.033F, -0.0064F, -1.0901F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 31, 8, -5.5175F, -1.7718F, -0.4279F, 4, 0, 1, 0.0F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -2.2736F, -8.1973F);
        this.body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0938F, 0.1096F, -1.087F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 29, 43, -6.6055F, -1.7264F, -0.4419F, 5, 0, 1, 0.0F, true));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -2.2736F, -8.1973F);
        this.body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.1395F, 0.0362F, -0.4787F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 27, 35, -2.3054F, -0.4933F, -0.4419F, 2, 0, 1, 0.0F, true));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -2.2736F, -8.1973F);
        this.body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.077F, -0.1219F, 0.7794F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 58, 16, -0.5623F, 0.1429F, -0.4419F, 1, 0, 1, 0.0F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -2.2736F, -10.1973F);
        this.body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1016F, -0.1571F, 0.819F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 29, 58, -0.6259F, 0.1017F, -0.4107F, 1, 0, 1, 0.0F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -2.2736F, -10.1973F);
        this.body.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1783F, 0.0563F, -0.4769F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 21, 40, -2.2602F, -0.5782F, -0.4107F, 2, 0, 1, 0.0F, true));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -2.2736F, -10.1973F);
        this.body.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1143F, 0.1482F, -1.0843F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 32, 24, -7.5198F, -1.77F, -0.4107F, 6, 0, 1, 0.0F, true));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, -2.6736F, -12.1973F);
        this.body.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1337F, -0.1769F, 0.771F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 58, 43, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, -2.6736F, -12.1973F);
        this.body.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.2094F, 0.0723F, -0.4749F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 53, 22, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, -2.6736F, -12.1973F);
        this.body.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1309F, 0.179F, -1.0816F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 38, 15, -7.6383F, -1.1472F, -0.5F, 6, 0, 1, 0.0F, true));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, -0.4736F, -0.1973F);
        this.body.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0279F, 0.1224F, 1.2607F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 56, 2, 1.5175F, -1.7718F, -0.4279F, 1, 0, 1, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -0.4736F, -0.1973F);
        this.body.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.0931F, 0.0842F, 0.6476F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 27, 13, 0.2594F, -0.581F, -0.4279F, 2, 0, 1, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, -0.4736F, -0.1973F);
        this.body.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.1112F, -0.0583F, -0.5669F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 46, 44, -0.3654F, 0.045F, -0.4279F, 1, 0, 1, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -0.9736F, -2.1973F);
        this.body.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.1061F, -0.0711F, -0.57F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 55, 52, -0.3654F, 0.045F, -0.4279F, 1, 0, 1, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, -0.9736F, -2.1973F);
        this.body.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.1033F, 0.075F, 0.6441F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 30, 0.2594F, -0.581F, -0.4279F, 2, 0, 1, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, -0.9736F, -2.1973F);
        this.body.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.0416F, 0.1207F, 1.2563F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 27, 15, 1.5175F, -1.7718F, -0.4279F, 2, 0, 1, 0.0F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, -1.3736F, -4.1973F);
        this.body.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.0484F, 0.161F, 1.1705F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 52, 39, 1.3416F, -1.8626F, -0.3999F, 3, 0, 1, 0.0F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, -1.3736F, -4.1973F);
        this.body.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.1322F, 0.1041F, 0.5567F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 32, 0.1673F, -0.7563F, -0.3999F, 2, 0, 1, 0.0F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, -1.3736F, -4.1973F);
        this.body.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.1309F, -0.1057F, -0.7821F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 57, 36, -0.2254F, -0.0003F, -0.3999F, 1, 0, 1, 0.0F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, -1.8736F, -6.1973F);
        this.body.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.0173F, 0.0288F, -0.8301F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 57, 47, -0.3717F, 0.1002F, -0.4279F, 1, 0, 1, 0.0F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0F, -1.8736F, -6.1973F);
        this.body.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0234F, 0.0242F, 0.4794F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 34, 0.2594F, -0.581F, -0.4279F, 2, 0, 1, 0.0F, false));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, -1.8736F, -6.1973F);
        this.body.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.033F, 0.0064F, 1.0901F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 31, 8, 1.5175F, -1.7718F, -0.4279F, 4, 0, 1, 0.0F, false));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, -2.2736F, -8.1973F);
        this.body.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0938F, -0.1096F, 1.087F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 29, 43, 1.6055F, -1.7264F, -0.4419F, 5, 0, 1, 0.0F, false));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, -2.2736F, -8.1973F);
        this.body.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.1395F, -0.0362F, 0.4787F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 27, 35, 0.3054F, -0.4933F, -0.4419F, 2, 0, 1, 0.0F, false));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, -2.2736F, -8.1973F);
        this.body.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.077F, 0.1219F, -0.7794F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 58, 16, -0.4377F, 0.1429F, -0.4419F, 1, 0, 1, 0.0F, false));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0F, -2.2736F, -10.1973F);
        this.body.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.1016F, 0.1571F, -0.819F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 29, 58, -0.3741F, 0.1017F, -0.4107F, 1, 0, 1, 0.0F, false));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(0.0F, -2.2736F, -10.1973F);
        this.body.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.1783F, -0.0563F, 0.4769F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 21, 40, 0.2602F, -0.5782F, -0.4107F, 2, 0, 1, 0.0F, false));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, -2.2736F, -10.1973F);
        this.body.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.1143F, -0.1482F, 1.0843F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 32, 24, 1.5198F, -1.77F, -0.4107F, 6, 0, 1, 0.0F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.5F, -2.6736F, -12.1973F);
        this.body.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.1309F, -0.179F, 1.0816F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 38, 15, 1.6383F, -1.1472F, -0.5F, 6, 0, 1, 0.0F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(0.5F, -2.6736F, -12.1973F);
        this.body.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.2094F, -0.0723F, 0.4749F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 53, 22, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.5F, -2.6736F, -12.1973F);
        this.body.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.1337F, 0.1769F, -0.771F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 58, 43, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(0.0F, -1.7F, -7.5F);
        this.body.addChild(cube_r69);
        this.setRotateAngle(cube_r69, -0.2094F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 27, 10, -0.5F, -0.5F, -0.1F, 1, 1, 8, 0.002F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.7F, -12.3F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0873F, -0.1309F, 0.0F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-3.401F, 4.9807F, -5.4793F);
        this.chest.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.2885F, -0.0426F, 0.4216F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 48, 31, -0.9517F, -2.1102F, -0.5324F, 4, 1, 1, 0.004F, true));

        this.Bodyfront_r2 = new ModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(-3.401F, 4.9807F, -5.4793F);
        this.chest.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, -0.2948F, 0.2083F, 0.3462F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 8, 39, -0.9474F, -2.1102F, -0.2823F, 1, 1, 3, 0.0F, true));

        this.Bodyfront_r3 = new ModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(-3.401F, 4.9807F, -5.4793F);
        this.chest.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, -0.2885F, 0.0411F, 0.3967F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 43, 0, -0.3218F, -2.1102F, 2.6834F, 4, 1, 2, 0.004F, true));

        this.Bodyfront_r4 = new ModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(3.401F, 4.9807F, -5.4793F);
        this.chest.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, -0.2885F, 0.0426F, -0.4216F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 48, 31, -3.0483F, -2.1102F, -0.5324F, 4, 1, 1, 0.004F, false));

        this.Bodyfront_r5 = new ModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(3.401F, 4.9807F, -5.4793F);
        this.chest.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, -0.2948F, -0.2083F, -0.3462F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 8, 39, -0.0526F, -2.1102F, -0.2823F, 1, 1, 3, 0.0F, false));

        this.Bodyfront_r6 = new ModelRenderer(this);
        this.Bodyfront_r6.setRotationPoint(3.401F, 4.9807F, -5.4793F);
        this.chest.addChild(Bodyfront_r6);
        this.setRotateAngle(Bodyfront_r6, -0.2885F, -0.0411F, -0.3967F);
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 43, 0, -3.6782F, -2.1102F, 2.6834F, 4, 1, 2, 0.004F, false));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(-0.5F, 1.7F, -6.8F);
        this.chest.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.2443F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 17, 31, 0.0F, -0.5F, -0.1F, 1, 1, 7, 0.002F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.0F, -0.8488F, -1.307F);
        this.chest.addChild(cube_r71);
        this.setRotateAngle(cube_r71, -0.1833F, 0.0F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 10, 30, 0.0F, -2.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(-0.5F, -0.5736F, -1.4973F);
        this.chest.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.1561F, 0.2252F, -1.0591F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 46, 20, -5.6383F, -1.1472F, -0.5F, 4, 0, 1, 0.0F, true));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(-0.5F, -0.5736F, -1.4973F);
        this.chest.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.2562F, 0.0962F, -0.4535F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 53, 24, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(-0.5F, -0.5736F, -1.4973F);
        this.chest.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.19F, -0.1975F, 0.6933F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 57, 26, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(-0.5F, 0.0264F, -3.4973F);
        this.chest.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.1989F, -0.1622F, 0.6003F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 57, 20, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(-0.5F, 0.0264F, -3.4973F);
        this.chest.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.2406F, 0.0882F, -0.4201F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 53, 50, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(-0.5F, 0.0264F, -3.4973F);
        this.chest.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.1476F, 0.2098F, -1.026F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 18, 53, -4.6383F, -1.1472F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(-0.5F, 0.4264F, -5.4973F);
        this.chest.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.1819F, 0.2712F, -0.9829F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 27, 11, -3.6383F, -1.1472F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(-0.5F, 0.4264F, -5.4973F);
        this.chest.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.3032F, 0.1198F, -0.3786F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 54, 0, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(-0.5F, 0.4264F, -5.4973F);
        this.chest.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.232F, -0.2301F, 0.7542F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 57, 8, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(0.5F, -0.5736F, -1.4973F);
        this.chest.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.1561F, -0.2252F, 1.0591F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 46, 20, 1.6383F, -1.1472F, -0.5F, 4, 0, 1, 0.0F, false));

        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(0.5F, -0.5736F, -1.4973F);
        this.chest.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.19F, 0.1975F, -0.6933F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 57, 26, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(0.5F, -0.5736F, -1.4973F);
        this.chest.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.2562F, -0.0962F, 0.4535F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 53, 24, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(0.5F, 0.0264F, -3.4973F);
        this.chest.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.1476F, -0.2098F, 1.026F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 18, 53, 1.6383F, -1.1472F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(0.5F, 0.0264F, -3.4973F);
        this.chest.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.1989F, 0.1622F, -0.6003F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 57, 20, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(0.5F, 0.0264F, -3.4973F);
        this.chest.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.2406F, -0.0882F, 0.4201F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 53, 50, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(0.5F, 0.4264F, -5.4973F);
        this.chest.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.232F, 0.2301F, -0.7542F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 57, 8, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(0.5F, 0.4264F, -5.4973F);
        this.chest.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.3032F, -0.1198F, 0.3786F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 54, 0, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(0.5F, 0.4264F, -5.4973F);
        this.chest.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.1819F, -0.2712F, 0.9829F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 27, 11, 1.6383F, -1.1472F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(0.0F, -0.2488F, -3.307F);
        this.chest.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -0.1833F, 0.0F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 18, 30, 0.0F, -2.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(0.0F, 0.2512F, -5.307F);
        this.chest.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -0.1833F, 0.0F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 21, 30, 0.0F, -2.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.1F, 4.3F, -3.7F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0381F, -0.1704F, 0.8694F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 27, 31, -0.2169F, -0.5219F, -1.1762F, 8, 1, 2, -0.002F, false));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 4, 8.4831F, -0.5219F, -1.3762F, 1, 1, 2, -0.002F, false));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 21, 42, 8.4831F, -0.5219F, 1.0238F, 1, 1, 1, -0.002F, false));

        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(9.8831F, -0.1219F, -0.0762F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.0329F, -0.0902F, -0.3506F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 18, 0.0076F, 0.1F, -2.4118F, 10, 0, 6, 0.0F, false));

        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(1.7385F, 0.0F, 0.7833F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.3054F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.1F, 4.3F, -3.7F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0456F, 0.1685F, -0.8252F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 27, 20, -7.7831F, -0.5219F, -1.1762F, 8, 1, 2, -0.002F, false));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 0, -9.4831F, -0.5219F, -1.3762F, 1, 1, 2, -0.002F, false));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 38, 10, -9.4831F, -0.5219F, 1.0238F, 1, 1, 1, -0.002F, false));

        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-9.8831F, -0.1219F, -0.0762F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.0208F, 0.0937F, 0.2191F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 11, -10.0548F, -0.3309F, -2.4118F, 10, 0, 6, 0.0F, false));

        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.7857F, -0.4309F, 0.7833F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.3054F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.7F, -7.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.0436F, -0.3491F, 0.0F);


        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(-0.5F, 0.0264F, -0.2973F);
        this.neck1.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.2443F, 0.0F, -0.48F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 54, 34, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(-0.5F, 0.424F, -2.3503F);
        this.neck1.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.0535F, 0.0449F, -0.6969F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 55, 58, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(0.5F, 0.0264F, -0.2973F);
        this.neck1.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.2443F, 0.0F, 0.48F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 54, 34, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(0.0F, 0.3F, -3.8F);
        this.neck1.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.0873F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 29, 45, -0.5F, -0.45F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(0.5F, 0.424F, -2.3503F);
        this.neck1.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.0535F, -0.0449F, 0.6969F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 55, 58, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(0.0F, -1.0488F, -0.107F);
        this.neck1.addChild(cube_r97);
        this.setRotateAngle(cube_r97, -0.2531F, 0.0F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 0, 39, 0.0F, -2.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(0.0F, -0.8488F, -2.207F);
        this.neck1.addChild(cube_r98);
        this.setRotateAngle(cube_r98, -0.2531F, 0.0F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 23, 55, 0.0F, -2.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.3F, -3.7F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1603F, -0.2648F, -0.039F);


        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(-0.5F, 0.2F, -3.1F);
        this.neck2.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.0524F, 0.0F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 37, 48, 0.0F, -0.4952F, 0.0437F, 1, 1, 3, 0.002F, false));

        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(-0.5F, 0.2F, -5.2F);
        this.neck2.addChild(cube_r100);
        this.setRotateAngle(cube_r100, -0.0698F, 0.0F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 48, 34, 0.0F, -0.6905F, -0.1631F, 1, 1, 3, 0.0F, false));

        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(0.0F, -0.9488F, -0.407F);
        this.neck2.addChild(cube_r101);
        this.setRotateAngle(cube_r101, -0.2967F, 0.0F, 0.0F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 34, 55, 0.0F, -2.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(-0.5F, 0.224F, -0.5503F);
        this.neck2.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.0535F, 0.0449F, -0.6969F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 59, 10, -0.9F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r103 = new ModelRenderer(this);
        this.cube_r103.setRotationPoint(-0.5F, 0.324F, -2.7503F);
        this.neck2.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.0535F, 0.0449F, -0.6969F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 59, 18, -0.7F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r104 = new ModelRenderer(this);
        this.cube_r104.setRotationPoint(-0.5F, 0.224F, -4.7503F);
        this.neck2.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.0535F, 0.0449F, -0.6969F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 59, 23, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r105 = new ModelRenderer(this);
        this.cube_r105.setRotationPoint(0.5F, 0.224F, -0.5503F);
        this.neck2.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.0535F, -0.0449F, 0.6969F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 59, 10, -0.1F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r106 = new ModelRenderer(this);
        this.cube_r106.setRotationPoint(0.5F, 0.324F, -2.7503F);
        this.neck2.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.0535F, -0.0449F, 0.6969F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 59, 18, -0.3F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r107 = new ModelRenderer(this);
        this.cube_r107.setRotationPoint(0.5F, 0.224F, -4.7503F);
        this.neck2.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.0535F, -0.0449F, 0.6969F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 59, 23, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r108 = new ModelRenderer(this);
        this.cube_r108.setRotationPoint(0.0F, -0.8488F, -2.607F);
        this.neck2.addChild(cube_r108);
        this.setRotateAngle(cube_r108, -0.2967F, 0.0F, 0.0F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 0, 56, 0.0F, -2.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r109 = new ModelRenderer(this);
        this.cube_r109.setRotationPoint(0.0F, -0.7488F, -4.607F);
        this.neck2.addChild(cube_r109);
        this.setRotateAngle(cube_r109, -0.2967F, 0.0F, 0.0F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 3, 56, 0.0F, -2.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.1F, -5.3F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2835F, -0.2275F, -0.0669F);


        this.cube_r110 = new ModelRenderer(this);
        this.cube_r110.setRotationPoint(-0.5F, 0.224F, -1.4503F);
        this.neck3.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.0535F, 0.0449F, -0.6969F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 59, 31, -0.4F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r111 = new ModelRenderer(this);
        this.cube_r111.setRotationPoint(0.5F, 0.224F, -1.4503F);
        this.neck3.addChild(cube_r111);
        this.setRotateAngle(cube_r111, 0.0535F, -0.0449F, 0.6969F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 59, 31, -0.6F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r112 = new ModelRenderer(this);
        this.cube_r112.setRotationPoint(0.0F, 0.2F, -4.0F);
        this.neck3.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 0.0698F, 0.0F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 0, 46, -0.5F, -0.4989F, 0.0209F, 1, 1, 4, 0.004F, false));

        this.cube_r113 = new ModelRenderer(this);
        this.cube_r113.setRotationPoint(0.0F, -1.1488F, -1.307F);
        this.neck3.addChild(cube_r113);
        this.setRotateAngle(cube_r113, -0.2967F, 0.0F, 0.0F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 0, 25, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r114 = new ModelRenderer(this);
        this.cube_r114.setRotationPoint(0.0F, -0.1488F, -3.307F);
        this.neck3.addChild(cube_r114);
        this.setRotateAngle(cube_r114, -0.2967F, 0.0F, 0.0F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 36, 59, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.7F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.0833F, -0.1752F, 0.0154F);
        this.head.cubeList.add(new ModelBox(head, 37, 35, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.cube_r115 = new ModelRenderer(this);
        this.cube_r115.setRotationPoint(0.0F, -0.2F, -2.1F);
        this.head.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 0.2443F, 0.0F, 0.0F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 22, 49, -1.0F, -0.3129F, -0.0754F, 2, 1, 2, -0.002F, false));

        this.cube_r116 = new ModelRenderer(this);
        this.cube_r116.setRotationPoint(-0.6642F, 1.2456F, -5.6976F);
        this.head.addChild(cube_r116);
        this.setRotateAngle(cube_r116, -0.1161F, -0.2313F, 0.8015F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 52, 59, -0.2749F, -0.0414F, -1.9917F, 0, 1, 1, 0.0F, true));
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 49, 59, -0.2749F, -0.0414F, 0.0083F, 0, 1, 1, 0.0F, true));

        this.cube_r117 = new ModelRenderer(this);
        this.cube_r117.setRotationPoint(-1.2F, 0.5F, -3.0F);
        this.head.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 0.0F, 0.0F, 0.3927F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 59, 53, -0.1F, 0.0F, -0.8F, 0, 1, 1, 0.0F, true));

        this.cube_r118 = new ModelRenderer(this);
        this.cube_r118.setRotationPoint(0.6642F, 1.2456F, -5.6976F);
        this.head.addChild(cube_r118);
        this.setRotateAngle(cube_r118, -0.1161F, 0.2313F, -0.8015F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 49, 59, 0.2749F, -0.0414F, 0.0083F, 0, 1, 1, 0.0F, false));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 52, 59, 0.2749F, -0.0414F, -1.9917F, 0, 1, 1, 0.0F, false));

        this.cube_r119 = new ModelRenderer(this);
        this.cube_r119.setRotationPoint(0.0F, -0.2F, -7.8F);
        this.head.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 0.0915F, -0.2419F, -0.0347F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 46, 22, -0.5F, 0.5149F, 0.064F, 1, 1, 4, 0.0F, true));

        this.cube_r120 = new ModelRenderer(this);
        this.cube_r120.setRotationPoint(0.0F, -0.2F, -7.8F);
        this.head.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.0915F, 0.2419F, 0.0347F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 46, 22, -0.5F, 0.5149F, 0.064F, 1, 1, 4, 0.0F, false));

        this.cube_r121 = new ModelRenderer(this);
        this.cube_r121.setRotationPoint(0.0F, -0.2F, -4.1F);
        this.head.addChild(cube_r121);
        this.setRotateAngle(cube_r121, 0.1396F, 0.0F, 0.0F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 48, 45, -0.5F, 0.0F, -3.8F, 1, 1, 3, 0.002F, false));

        this.cube_r122 = new ModelRenderer(this);
        this.cube_r122.setRotationPoint(0.0F, -0.1F, -4.9F);
        this.head.addChild(cube_r122);
        this.setRotateAngle(cube_r122, 0.3316F, 0.0F, 0.0F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 54, 44, -0.5F, 0.0123F, -0.0939F, 1, 1, 1, 0.0F, false));

        this.cube_r123 = new ModelRenderer(this);
        this.cube_r123.setRotationPoint(-0.6F, -0.1F, -3.3F);
        this.head.addChild(cube_r123);
        this.setRotateAngle(cube_r123, 0.0F, -0.2618F, 0.3142F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 29, 55, -0.54F, -0.1F, -0.5F, 1, 1, 1, 0.003F, true));

        this.cube_r124 = new ModelRenderer(this);
        this.cube_r124.setRotationPoint(0.6F, -0.1F, -3.3F);
        this.head.addChild(cube_r124);
        this.setRotateAngle(cube_r124, 0.0F, 0.2618F, -0.3142F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 29, 55, -0.46F, -0.1F, -0.5F, 1, 1, 1, 0.003F, false));

        this.cube_r125 = new ModelRenderer(this);
        this.cube_r125.setRotationPoint(0.0F, -0.5F, -2.1F);
        this.head.addChild(cube_r125);
        this.setRotateAngle(cube_r125, 0.0698F, 0.0F, 0.0F);
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 46, 50, -1.0F, -0.0166F, -2.0223F, 2, 1, 2, 0.0F, false));

        this.cube_r126 = new ModelRenderer(this);
        this.cube_r126.setRotationPoint(1.2F, 0.5F, -3.0F);
        this.head.addChild(cube_r126);
        this.setRotateAngle(cube_r126, 0.0F, 0.0F, -0.3927F);
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 59, 53, 0.1F, 0.0F, -0.8F, 0, 1, 1, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7505F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 13, 40, 0.5F, 0.0F, -4.0F, 1, 1, 5, -0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 43, 48, -0.5F, 0.0F, -7.7F, 1, 1, 1, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 13, 40, -1.5F, 0.0F, -4.0F, 1, 1, 5, -0.002F, true));

        this.cube_r127 = new ModelRenderer(this);
        this.cube_r127.setRotationPoint(-0.8322F, 0.0F, -5.129F);
        this.jaw.addChild(cube_r127);
        this.setRotateAngle(cube_r127, 0.1788F, -0.1405F, -0.9115F);
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 42, 59, -0.1138F, -0.9725F, -1.5846F, 0, 1, 1, 0.0F, true));
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 45, 59, -0.1138F, -0.6725F, 0.4154F, 0, 1, 1, 0.0F, true));

        this.cube_r128 = new ModelRenderer(this);
        this.cube_r128.setRotationPoint(0.8322F, 0.0F, -5.129F);
        this.jaw.addChild(cube_r128);
        this.setRotateAngle(cube_r128, 0.1788F, 0.1405F, 0.9115F);
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 42, 59, 0.1138F, -0.9725F, -1.5846F, 0, 1, 1, 0.0F, false));
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 45, 59, 0.1138F, -0.6725F, 0.4154F, 0, 1, 1, 0.0F, false));

        this.cube_r129 = new ModelRenderer(this);
        this.cube_r129.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.jaw.addChild(cube_r129);
        this.setRotateAngle(cube_r129, 0.0F, -0.2269F, 0.0F);
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 46, 4, -0.4F, 0.0F, 0.4F, 1, 1, 4, -0.008F, true));

        this.cube_r130 = new ModelRenderer(this);
        this.cube_r130.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.jaw.addChild(cube_r130);
        this.setRotateAngle(cube_r130, 0.0F, 0.2269F, 0.0F);
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 46, 4, -0.6F, 0.0F, 0.4F, 1, 1, 4, -0.005F, false));

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
