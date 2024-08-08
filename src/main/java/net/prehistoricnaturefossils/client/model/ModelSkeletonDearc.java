package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDearc extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer chest_r1;
    private final ModelRenderer chest_r2;
    private final ModelRenderer chest_r3;
    private final ModelRenderer chest_r4;
    private final ModelRenderer chest_r5;
    private final ModelRenderer chest_r6;
    private final ModelRenderer chest_r7;
    private final ModelRenderer chest_r8;
    private final ModelRenderer chest_r9;
    private final ModelRenderer chest_r10;
    private final ModelRenderer chest_r11;
    private final ModelRenderer chest_r12;
    private final ModelRenderer chest_r13;
    private final ModelRenderer chest_r14;
    private final ModelRenderer chest_r15;
    private final ModelRenderer chest_r16;
    private final ModelRenderer chest_r17;
    private final ModelRenderer chest_r18;
    private final ModelRenderer chest_r19;
    private final ModelRenderer chest_r20;
    private final ModelRenderer chest_r21;
    private final ModelRenderer chest_r22;
    private final ModelRenderer chest_r23;
    private final ModelRenderer chest_r24;
    private final ModelRenderer chest_r25;
    private final ModelRenderer chest_r26;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer wingleft1;
    private final ModelRenderer wingleft2;
    private final ModelRenderer handR_r1;
    private final ModelRenderer wingleft3;
    private final ModelRenderer wingleft4;
    private final ModelRenderer wing4R_r1;
    private final ModelRenderer handleft;
    private final ModelRenderer wingright1;
    private final ModelRenderer wingright2;
    private final ModelRenderer handR_r2;
    private final ModelRenderer wingright3;
    private final ModelRenderer wingright4;
    private final ModelRenderer wing4R_r2;
    private final ModelRenderer handright;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer head3;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer head4;
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
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2;
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
    private final ModelRenderer throat;
    private final ModelRenderer body1;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body6_r2;
    private final ModelRenderer body2_r1;
    private final ModelRenderer body5_r2;
    private final ModelRenderer body5_r3;
    private final ModelRenderer body6_r3;
    private final ModelRenderer upperlegleft;
    private final ModelRenderer lowerlegleft;
    private final ModelRenderer footleft;
    private final ModelRenderer upperlegright;
    private final ModelRenderer lowerlegright;
    private final ModelRenderer footright;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonDearc() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -10.75F, 0.5F);
        this.fossil.addChild(root);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -8.25F, -5.7F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.4669F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.7867F, 4.1079F);
        this.chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2531F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 41, -1.5F, -1.5F, -1.4F, 3, 2, 3, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.5301F, 5.7838F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1047F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 0, 0.0F, -0.4F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.65F, 2.3F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0524F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 0, 0.0F, -0.5626F, 0.9853F, 0, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 6, -0.5F, -0.1626F, -0.0147F, 1, 1, 4, 0.0F, false));

        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(-0.5F, -2.2196F, -0.0332F);
        this.chest.addChild(chest_r1);
        this.setRotateAngle(chest_r1, 0.3141F, 0.2814F, -0.8374F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 34, 5, -2.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest_r2 = new ModelRenderer(this);
        this.chest_r2.setRotationPoint(-0.5F, -2.2196F, -0.0332F);
        this.chest.addChild(chest_r2);
        this.setRotateAngle(chest_r2, 0.4001F, 0.1266F, -0.4202F);
        this.chest_r2.cubeList.add(new ModelBox(chest_r2, 26, 22, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r3 = new ModelRenderer(this);
        this.chest_r3.setRotationPoint(-0.5F, -2.4196F, 1.9668F);
        this.chest.addChild(chest_r3);
        this.setRotateAngle(chest_r3, 0.0146F, 0.0102F, -0.4799F);
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 42, 36, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r4 = new ModelRenderer(this);
        this.chest_r4.setRotationPoint(-0.5F, -2.4196F, 3.9668F);
        this.chest.addChild(chest_r4);
        this.setRotateAngle(chest_r4, 0.0F, 0.0F, -0.3054F);
        this.chest_r4.cubeList.add(new ModelBox(chest_r4, 48, 49, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));
        this.chest_r4.cubeList.add(new ModelBox(chest_r4, 52, 26, -1.0F, 0.0F, 1.5F, 1, 0, 1, 0.0F, true));

        this.chest_r5 = new ModelRenderer(this);
        this.chest_r5.setRotationPoint(-0.5F, -2.4196F, 5.9668F);
        this.chest.addChild(chest_r5);
        this.setRotateAngle(chest_r5, 0.0F, 0.0F, -1.2654F);
        this.chest_r5.cubeList.add(new ModelBox(chest_r5, 51, 7, -3.3056F, -1.8192F, -0.5F, 1, 0, 1, 0.0F, true));
        this.chest_r5.cubeList.add(new ModelBox(chest_r5, 50, 20, -3.3056F, -1.8192F, -2.5F, 1, 0, 1, 0.0F, true));

        this.chest_r6 = new ModelRenderer(this);
        this.chest_r6.setRotationPoint(-0.5F, -2.4196F, 5.9668F);
        this.chest.addChild(chest_r6);
        this.setRotateAngle(chest_r6, 0.0F, 0.0F, -0.7418F);
        this.chest_r6.cubeList.add(new ModelBox(chest_r6, 44, 5, -2.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, true));
        this.chest_r6.cubeList.add(new ModelBox(chest_r6, 40, 26, -2.9063F, -0.4226F, -2.5F, 2, 0, 1, 0.0F, true));

        this.chest_r7 = new ModelRenderer(this);
        this.chest_r7.setRotationPoint(-1.0259F, 1.1666F, 2.7836F);
        this.chest.addChild(chest_r7);
        this.setRotateAngle(chest_r7, 0.1263F, 0.5103F, 0.4812F);
        this.chest_r7.cubeList.add(new ModelBox(chest_r7, 10, 41, -2.7015F, 0.0921F, -0.6676F, 3, 0, 1, 0.0F, true));

        this.chest_r8 = new ModelRenderer(this);
        this.chest_r8.setRotationPoint(-1.7259F, 1.4666F, 2.2836F);
        this.chest.addChild(chest_r8);
        this.setRotateAngle(chest_r8, -0.1439F, -0.0351F, 1.2092F);
        this.chest_r8.cubeList.add(new ModelBox(chest_r8, 44, 14, -1.9962F, 0.1801F, -0.6873F, 2, 0, 1, 0.0F, true));

        this.chest_r9 = new ModelRenderer(this);
        this.chest_r9.setRotationPoint(-0.5F, -2.4196F, 1.9668F);
        this.chest.addChild(chest_r9);
        this.setRotateAngle(chest_r9, 0.0089F, 0.0154F, -0.9162F);
        this.chest_r9.cubeList.add(new ModelBox(chest_r9, 34, 14, -2.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest_r10 = new ModelRenderer(this);
        this.chest_r10.setRotationPoint(-2.0F, -2.4196F, 2.4668F);
        this.chest.addChild(chest_r10);
        this.setRotateAngle(chest_r10, 0.3054F, 0.3927F, 0.0F);
        this.chest_r10.cubeList.add(new ModelBox(chest_r10, 0, 0, 0.0543F, -0.5F, -2.7704F, 1, 1, 4, 0.0F, true));

        this.chest_r11 = new ModelRenderer(this);
        this.chest_r11.setRotationPoint(-1.7643F, -1.473F, -0.5416F);
        this.chest.addChild(chest_r11);
        this.setRotateAngle(chest_r11, 0.3178F, 0.5113F, -0.1025F);
        this.chest_r11.cubeList.add(new ModelBox(chest_r11, 0, 33, -1.2646F, -0.6481F, -0.7497F, 1, 4, 1, 0.0F, true));

        this.chest_r12 = new ModelRenderer(this);
        this.chest_r12.setRotationPoint(2.0F, -2.4196F, 2.4668F);
        this.chest.addChild(chest_r12);
        this.setRotateAngle(chest_r12, 0.3054F, -0.3927F, 0.0F);
        this.chest_r12.cubeList.add(new ModelBox(chest_r12, 0, 0, -1.0543F, -0.5F, -2.7704F, 1, 1, 4, 0.0F, false));

        this.chest_r13 = new ModelRenderer(this);
        this.chest_r13.setRotationPoint(1.7643F, -1.473F, -0.5416F);
        this.chest.addChild(chest_r13);
        this.setRotateAngle(chest_r13, 0.3178F, -0.5113F, 0.1025F);
        this.chest_r13.cubeList.add(new ModelBox(chest_r13, 0, 33, 0.2646F, -0.6481F, -0.7497F, 1, 4, 1, 0.0F, false));

        this.chest_r14 = new ModelRenderer(this);
        this.chest_r14.setRotationPoint(0.7788F, 1.8751F, 0.1704F);
        this.chest.addChild(chest_r14);
        this.setRotateAngle(chest_r14, 0.3316F, 0.0F, 0.0F);
        this.chest_r14.cubeList.add(new ModelBox(chest_r14, 44, 9, -2.2788F, -0.4324F, -0.3624F, 3, 1, 3, 0.004F, false));

        this.chest_r15 = new ModelRenderer(this);
        this.chest_r15.setRotationPoint(0.7788F, 1.8751F, 0.1704F);
        this.chest.addChild(chest_r15);
        this.setRotateAngle(chest_r15, 0.2356F, 0.0F, 0.0F);
        this.chest_r15.cubeList.add(new ModelBox(chest_r15, 24, 0, -0.7788F, -0.7397F, -1.6178F, 0, 2, 3, 0.0F, false));

        this.chest_r16 = new ModelRenderer(this);
        this.chest_r16.setRotationPoint(-0.7788F, 1.8751F, 0.1704F);
        this.chest.addChild(chest_r16);
        this.setRotateAngle(chest_r16, 0.2667F, -0.1995F, 0.6277F);
        this.chest_r16.cubeList.add(new ModelBox(chest_r16, 48, 58, -1.2104F, -0.1465F, -0.3624F, 1, 1, 3, 0.0F, true));

        this.chest_r17 = new ModelRenderer(this);
        this.chest_r17.setRotationPoint(0.7788F, 1.8751F, 0.1704F);
        this.chest.addChild(chest_r17);
        this.setRotateAngle(chest_r17, 0.2667F, 0.1995F, -0.6277F);
        this.chest_r17.cubeList.add(new ModelBox(chest_r17, 48, 58, 0.2104F, -0.1465F, -0.3624F, 1, 1, 3, 0.0F, false));

        this.chest_r18 = new ModelRenderer(this);
        this.chest_r18.setRotationPoint(1.7259F, 1.4666F, 2.2836F);
        this.chest.addChild(chest_r18);
        this.setRotateAngle(chest_r18, -0.1439F, 0.0351F, -1.2092F);
        this.chest_r18.cubeList.add(new ModelBox(chest_r18, 44, 14, -0.0038F, 0.1801F, -0.6873F, 2, 0, 1, 0.0F, false));

        this.chest_r19 = new ModelRenderer(this);
        this.chest_r19.setRotationPoint(1.0259F, 1.1666F, 2.7836F);
        this.chest.addChild(chest_r19);
        this.setRotateAngle(chest_r19, 0.1263F, -0.5103F, -0.4812F);
        this.chest_r19.cubeList.add(new ModelBox(chest_r19, 10, 41, -0.2985F, 0.0921F, -0.6676F, 3, 0, 1, 0.0F, false));

        this.chest_r20 = new ModelRenderer(this);
        this.chest_r20.setRotationPoint(0.5F, -2.2196F, -0.0332F);
        this.chest.addChild(chest_r20);
        this.setRotateAngle(chest_r20, 0.3141F, -0.2814F, 0.8374F);
        this.chest_r20.cubeList.add(new ModelBox(chest_r20, 34, 5, 0.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, false));

        this.chest_r21 = new ModelRenderer(this);
        this.chest_r21.setRotationPoint(0.5F, -2.2196F, -0.0332F);
        this.chest.addChild(chest_r21);
        this.setRotateAngle(chest_r21, 0.4001F, -0.1266F, 0.4202F);
        this.chest_r21.cubeList.add(new ModelBox(chest_r21, 26, 22, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest_r22 = new ModelRenderer(this);
        this.chest_r22.setRotationPoint(0.5F, -2.4196F, 1.9668F);
        this.chest.addChild(chest_r22);
        this.setRotateAngle(chest_r22, 0.0089F, -0.0154F, 0.9162F);
        this.chest_r22.cubeList.add(new ModelBox(chest_r22, 34, 14, 0.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, false));

        this.chest_r23 = new ModelRenderer(this);
        this.chest_r23.setRotationPoint(0.5F, -2.4196F, 1.9668F);
        this.chest.addChild(chest_r23);
        this.setRotateAngle(chest_r23, 0.0146F, -0.0102F, 0.4799F);
        this.chest_r23.cubeList.add(new ModelBox(chest_r23, 42, 36, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest_r24 = new ModelRenderer(this);
        this.chest_r24.setRotationPoint(0.5F, -2.4196F, 3.9668F);
        this.chest.addChild(chest_r24);
        this.setRotateAngle(chest_r24, 0.0F, 0.0F, 0.7418F);
        this.chest_r24.cubeList.add(new ModelBox(chest_r24, 40, 26, 0.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, false));
        this.chest_r24.cubeList.add(new ModelBox(chest_r24, 44, 5, 0.9063F, -0.4226F, 1.5F, 2, 0, 1, 0.0F, false));

        this.chest_r25 = new ModelRenderer(this);
        this.chest_r25.setRotationPoint(0.5F, -2.4196F, 3.9668F);
        this.chest.addChild(chest_r25);
        this.setRotateAngle(chest_r25, 0.0F, 0.0F, 1.2654F);
        this.chest_r25.cubeList.add(new ModelBox(chest_r25, 50, 20, 2.3056F, -1.8192F, -0.5F, 1, 0, 1, 0.0F, false));
        this.chest_r25.cubeList.add(new ModelBox(chest_r25, 51, 7, 2.3056F, -1.8192F, 1.5F, 1, 0, 1, 0.0F, false));

        this.chest_r26 = new ModelRenderer(this);
        this.chest_r26.setRotationPoint(0.5F, -2.4196F, 3.9668F);
        this.chest.addChild(chest_r26);
        this.setRotateAngle(chest_r26, 0.0F, 0.0F, 0.3054F);
        this.chest_r26.cubeList.add(new ModelBox(chest_r26, 48, 49, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));
        this.chest_r26.cubeList.add(new ModelBox(chest_r26, 52, 26, 0.0F, 0.0F, 1.5F, 1, 0, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.797F, 1.7618F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 33, 0.0F, -0.4F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.35F, -0.7F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1396F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 0, 0.0F, -0.6F, 0.0F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 5, 56, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.wingleft1 = new ModelRenderer(this);
        this.wingleft1.setRotationPoint(3.1F, -1.6152F, -2.1332F);
        this.chest.addChild(wingleft1);
        this.setRotateAngle(wingleft1, 0.6676F, 0.2914F, -0.2661F);
        this.wingleft1.cubeList.add(new ModelBox(wingleft1, 54, 47, -0.6238F, -0.3216F, 0.0503F, 3, 1, 2, 0.0F, false));
        this.wingleft1.cubeList.add(new ModelBox(wingleft1, 13, 28, 2.3762F, -0.3216F, 0.0503F, 5, 1, 1, 0.0F, false));

        this.wingleft2 = new ModelRenderer(this);
        this.wingleft2.setRotationPoint(7.0762F, 0.1784F, 0.1503F);
        this.wingleft1.addChild(wingleft2);
        this.setRotateAngle(wingleft2, -0.0796F, 0.5786F, -1.812F);
        this.wingleft2.cubeList.add(new ModelBox(wingleft2, 0, 47, -0.5F, 0.0F, -0.3F, 1, 11, 1, 0.0F, false));
        this.wingleft2.cubeList.add(new ModelBox(wingleft2, 17, 46, -0.5F, 0.0F, 0.8F, 1, 11, 1, -0.2F, false));

        this.handR_r1 = new ModelRenderer(this);
        this.handR_r1.setRotationPoint(0.7F, 9.7758F, 0.4642F);
        this.wingleft2.addChild(handR_r1);
        this.setRotateAngle(handR_r1, 1.9845F, -0.2507F, 0.5144F);
        this.handR_r1.cubeList.add(new ModelBox(handR_r1, 42, 56, 0.2F, -1.0F, -1.5F, 1, 1, 3, -0.2F, false));

        this.wingleft3 = new ModelRenderer(this);
        this.wingleft3.setRotationPoint(0.1F, 10.3F, 1.0F);
        this.wingleft2.addChild(wingleft3);
        this.setRotateAngle(wingleft3, -1.9547F, -1.4023F, 1.1516F);
        this.wingleft3.cubeList.add(new ModelBox(wingleft3, 34, 9, -0.7137F, -0.0099F, 0.3559F, 1, 1, 7, 0.0F, false));

        this.wingleft4 = new ModelRenderer(this);
        this.wingleft4.setRotationPoint(0.3863F, 0.4901F, 7.4559F);
        this.wingleft3.addChild(wingleft4);
        this.setRotateAngle(wingleft4, 0.1752F, 0.0873F, -1.4393F);
        this.wingleft4.cubeList.add(new ModelBox(wingleft4, 0, 14, -0.5F, -1.0F, 0.0F, 1, 1, 12, 0.0F, false));

        this.wing4R_r1 = new ModelRenderer(this);
        this.wing4R_r1.setRotationPoint(0.7F, -0.4F, 12.0F);
        this.wingleft4.addChild(wing4R_r1);
        this.setRotateAngle(wing4R_r1, 0.0873F, 0.3054F, 0.0F);
        this.wing4R_r1.cubeList.add(new ModelBox(wing4R_r1, 0, 33, -1.2F, -0.6F, -0.4F, 1, 1, 31, 0.0F, false));

        this.handleft = new ModelRenderer(this);
        this.handleft.setRotationPoint(-0.2137F, 1.2901F, 2.5559F);
        this.wingleft3.addChild(handleft);
        this.setRotateAngle(handleft, -0.0421F, 1.2222F, 1.0472F);
        this.handleft.cubeList.add(new ModelBox(handleft, 54, 2, -1.5F, -0.5F, 0.2F, 2, 1, 3, 0.0F, false));

        this.wingright1 = new ModelRenderer(this);
        this.wingright1.setRotationPoint(-3.1F, -1.6152F, -2.1332F);
        this.chest.addChild(wingright1);
        this.setRotateAngle(wingright1, 0.7003F, -0.181F, 0.1271F);
        this.wingright1.cubeList.add(new ModelBox(wingright1, 54, 7, -2.3762F, -0.3216F, 0.0503F, 3, 1, 2, 0.0F, false));
        this.wingright1.cubeList.add(new ModelBox(wingright1, 0, 28, -7.3762F, -0.3216F, 0.0503F, 5, 1, 1, 0.0F, false));

        this.wingright2 = new ModelRenderer(this);
        this.wingright2.setRotationPoint(-7.0762F, 0.1784F, 0.1503F);
        this.wingright1.addChild(wingright2);
        this.setRotateAngle(wingright2, -0.1022F, -0.5601F, 1.8604F);
        this.wingright2.cubeList.add(new ModelBox(wingright2, 12, 46, -0.5F, 0.0F, -0.3F, 1, 11, 1, 0.0F, false));
        this.wingright2.cubeList.add(new ModelBox(wingright2, 26, 45, -0.5F, 0.0F, 0.8F, 1, 11, 1, -0.2F, false));

        this.handR_r2 = new ModelRenderer(this);
        this.handR_r2.setRotationPoint(-0.7F, 9.7758F, 0.4642F);
        this.wingright2.addChild(handR_r2);
        this.setRotateAngle(handR_r2, 1.9845F, 0.2507F, -0.5144F);
        this.handR_r2.cubeList.add(new ModelBox(handR_r2, 56, 26, -1.2F, -1.0F, -1.5F, 1, 1, 3, -0.2F, false));

        this.wingright3 = new ModelRenderer(this);
        this.wingright3.setRotationPoint(-0.1F, 10.3F, 1.0F);
        this.wingright2.addChild(wingright3);
        this.setRotateAngle(wingright3, -2.3336F, 1.3635F, -1.5799F);
        this.wingright3.cubeList.add(new ModelBox(wingright3, 34, 0, -0.2863F, -0.0099F, 0.3559F, 1, 1, 7, 0.0F, false));

        this.wingright4 = new ModelRenderer(this);
        this.wingright4.setRotationPoint(-0.3863F, 0.4901F, 7.4559F);
        this.wingright3.addChild(wingright4);
        this.setRotateAngle(wingright4, 0.1752F, -0.0873F, 1.4393F);
        this.wingright4.cubeList.add(new ModelBox(wingright4, 0, 0, -0.5F, -1.0F, 0.0F, 1, 1, 12, 0.0F, false));

        this.wing4R_r2 = new ModelRenderer(this);
        this.wing4R_r2.setRotationPoint(-0.7F, -0.4F, 12.0F);
        this.wingright4.addChild(wing4R_r2);
        this.setRotateAngle(wing4R_r2, 0.0873F, -0.3054F, 0.0F);
        this.wing4R_r2.cubeList.add(new ModelBox(wing4R_r2, 0, 0, 0.2F, -0.6F, -0.4F, 1, 1, 31, 0.0F, false));

        this.handright = new ModelRenderer(this);
        this.handright.setRotationPoint(0.2137F, 1.2901F, 2.5559F);
        this.wingright3.addChild(handright);
        this.setRotateAngle(handright, -0.0421F, -1.2222F, -1.0472F);
        this.handright.cubeList.add(new ModelBox(handright, 52, 42, -0.5F, -0.5F, 0.2F, 2, 1, 3, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.75F, -0.6F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.0424F, 0.2602F, -0.0193F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.5828F, -0.5635F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2094F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 26, 0.0F, -1.579F, -1.3319F, 0, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 37, 0.0F, -1.579F, -3.3319F, 0, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 20, -0.5F, -1.079F, -3.3319F, 1, 1, 4, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.5828F, -3.8635F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.578F, 0.1492F, 0.1988F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -0.8475F, -4.6567F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 41, -0.5F, -0.7627F, -0.9718F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 56, 55, -1.0F, -0.0627F, -2.9718F, 1, 1, 3, -0.03F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -0.3475F, -0.2567F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 0, -0.5F, -0.5F, -1.5F, 0, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 39, -0.5F, -0.8F, -3.5F, 0, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 39, -1.0F, -0.1F, -4.5F, 1, 1, 5, -0.03F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.1025F, -6.6817F);
        this.neck2.addChild(head2);
        this.setRotateAngle(head2, 0.3469F, 0.1517F, 0.0866F);
        this.head2.cubeList.add(new ModelBox(head2, 55, 51, -2.0F, -1.2268F, -2.1823F, 4, 2, 1, -0.005F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.6F, 0.6929F, -6.7607F);
        this.head2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -2.81F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 14, 0.38F, -0.3803F, 0.2171F, 1, 1, 4, -0.2F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 26, 0.0F, -0.7803F, -2.7829F, 1, 1, 3, 0.005F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 14, 1.82F, -0.3803F, 0.2171F, 1, 1, 4, -0.2F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 26, 2.2F, -0.7803F, -2.7829F, 1, 1, 3, 0.005F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.1F, 0.6929F, -4.4607F);
        this.head2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -3.0194F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 39, -0.5F, -0.5F, -0.5F, 1, 1, 3, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 39, 1.7F, -0.5F, -0.5F, 1, 1, 3, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.6F, 0.2696F, -3.7332F);
        this.head2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -2.3911F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 60, -0.5F, -1.0343F, -0.9395F, 1, 1, 1, -0.003F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 60, 2.7F, -1.0343F, -0.9395F, 1, 1, 1, -0.003F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.6F, -0.1304F, -3.2332F);
        this.head2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 3.002F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 60, 42, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.007F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 60, 42, 2.7F, -0.5F, -0.5F, 1, 1, 1, -0.007F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.6F, 1.0732F, -3.0823F);
        this.head2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.9687F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 7, 14, -0.5F, -2.0121F, -0.9897F, 1, 2, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 7, 14, 2.7F, -2.0121F, -0.9897F, 1, 2, 1, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.6F, -0.14F, -2.0834F);
        this.head2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.3177F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 59, -0.6F, 0.0F, -0.7F, 1, 1, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 42, -0.82F, 0.0F, -0.7F, 1, 1, 1, -0.2F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 7, 6, -0.5F, -0.7F, -0.9F, 1, 2, 1, 0.004F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 42, 3.02F, 0.0F, -0.7F, 1, 1, 1, -0.2F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 59, 2.8F, 0.0F, -0.7F, 1, 1, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 7, 6, 2.7F, -0.7F, -0.9F, 1, 2, 1, 0.004F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.6F, -0.2268F, -0.9823F);
        this.head2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6545F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 20, -0.5F, -0.5F, -0.1F, 1, 2, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 20, 2.7F, -0.5F, -0.1F, 1, 2, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.7732F, -1.1823F);
        this.head2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.6458F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 34, 18, -2.0F, -2.9F, -1.0F, 1, 3, 1, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 34, 18, 1.0F, -2.9F, -1.0F, 1, 3, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.3451F, -0.0382F);
        this.head2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.885F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 57, 60, -2.0F, -0.9882F, -0.0398F, 1, 1, 1, 0.005F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 57, 60, 1.0F, -0.9882F, -0.0398F, 1, 1, 1, 0.005F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.0451F, -0.4382F);
        this.head2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.4835F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 42, 33, -2.0F, 0.0F, -0.3F, 4, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 55, -2.0F, -0.5F, -1.3F, 4, 2, 1, 0.003F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 1.7732F, -2.1823F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.1309F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 13, 33, -1.5F, -1.6F, -5.0F, 3, 1, 4, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -2.9F, 0.4F);
        this.head3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1309F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 0, -1.5F, 0.0176F, -4.9623F, 3, 1, 3, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 22, -2.0F, 0.0176F, -1.9623F, 4, 1, 2, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.5F, 0.0F, -3.5F);
        this.head3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.1309F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 34, 0, -0.087F, -1.161F, -1.1866F, 0, 1, 3, 0.0F, true));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(1.5F, 0.0F, -3.5F);
        this.head3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.1309F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 0, 0.087F, -1.161F, -1.1866F, 0, 1, 3, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.7637F, -0.2516F);
        this.head3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1222F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 33, -1.5F, -0.5F, -5.0F, 3, 1, 6, 0.002F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.7F, -1.5F);
        this.head3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2094F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 15, 8, -2.0F, -1.0F, 0.0F, 4, 1, 2, 0.002F, false));

        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, 1.0F, -4.825F);
        this.head3.addChild(head4);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -0.9927F, -6.4156F);
        this.head4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.5236F, 0.0F, 0.2618F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 6, 0.1F, -0.45F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -0.9927F, -4.4156F);
        this.head4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3593F, 0.013F, 0.2054F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 20, 0.1F, -0.525F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0F, -0.9927F, -2.4156F);
        this.head4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.3054F, 0.0F, 0.2182F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 44, 0, -0.1031F, -0.6385F, -0.4731F, 0, 1, 1, 0.0F, true));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, -1.0F, -0.85F);
        this.head4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.0873F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 34, 33, -0.0415F, -0.9744F, -0.6726F, 0, 1, 2, 0.0F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, -0.9927F, -6.4156F);
        this.head4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.5236F, 0.0F, -0.2618F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 6, -0.1F, -0.45F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, -0.9927F, -4.4156F);
        this.head4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.3593F, -0.013F, -0.2054F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 20, -0.1F, -0.525F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(1.0F, -0.9927F, -2.4156F);
        this.head4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.3054F, 0.0F, -0.2182F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 44, 0, 0.1031F, -0.6385F, -0.4731F, 0, 1, 1, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(1.0F, -1.0F, -0.85F);
        this.head4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -0.0873F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 34, 33, 0.0415F, -0.9744F, -0.6726F, 0, 1, 2, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -1.5F, -4.1F);
        this.head4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1222F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 41, 49, -0.5F, -0.6927F, -3.0156F, 1, 1, 4, -0.12F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -1.7F, -0.2F);
        this.head4.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0698F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 43, 24, -1.0F, -0.9F, -3.8F, 2, 1, 4, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -2.3881F, -3.5747F);
        this.head4.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.192F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 20, -0.5F, -0.1002F, -3.7798F, 1, 1, 4, -0.1F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -3.2131F, 0.3253F);
        this.head4.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2051F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 34, 47, -0.5F, 0.0113F, -3.9424F, 1, 1, 4, -0.001F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.001F, -2.0008F, -7.0012F);
        this.head4.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.144F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 12, 59, -0.999F, 0.1F, 5.8F, 2, 1, 2, -0.001F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.3732F, -1.1823F);
        this.head2.addChild(jaw);
        this.setRotateAngle(jaw, 0.3796F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 5, 61, 1.0F, -0.4008F, -1.0017F, 1, 1, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 5, 61, -2.0F, -0.4008F, -1.0017F, 1, 1, 1, -0.01F, true));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, -0.4008F, -1.0017F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.48F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 50, 14, 0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 50, 14, -1.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.9F, -3.925F);
        this.jaw2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.7219F, 0.0181F, -0.2612F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 28, 8, -0.0912F, -7.8099F, -5.225F, 0, 3, 1, 0.0F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.9F, -3.925F);
        this.jaw2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.4983F, 0.0322F, -0.479F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 0, 0.2388F, -5.2454F, -4.502F, 0, 2, 1, 0.0F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.9F, -3.925F);
        this.jaw2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.2112F, -0.0135F, -0.2615F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 14, -0.7152F, -3.3751F, -3.6291F, 0, 2, 1, 0.0F, true));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.5F, 0.0F, -4.0F);
        this.jaw2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, -0.3927F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 41, 18, 0.0F, -0.375F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.9F, -3.925F);
        this.jaw2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1107F, -0.0319F, -0.655F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 26, 26, -0.2153F, -1.7917F, -1.7317F, 0, 1, 2, 0.0F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.9F, -5.6F);
        this.jaw2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.3294F, 0.043F, 0.0566F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 7, 0, -0.9286F, 1.9218F, 5.3333F, 0, 1, 2, 0.0F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.9F, -5.6F);
        this.jaw2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.1745F, -0.1222F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 34, 18, 0.0F, -1.0342F, 0.1495F, 0, 1, 6, 0.0F, true));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.9F, -3.925F);
        this.jaw2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.7219F, -0.0181F, 0.2612F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 28, 8, 0.0912F, -7.8099F, -5.225F, 0, 3, 1, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.9F, -3.925F);
        this.jaw2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.4983F, -0.0322F, 0.479F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 0, -0.2388F, -5.2454F, -4.502F, 0, 2, 1, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.9F, -3.925F);
        this.jaw2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.2112F, 0.0135F, 0.2615F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 14, 0.7152F, -3.3751F, -3.6291F, 0, 2, 1, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.9F, -3.925F);
        this.jaw2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.1107F, 0.0319F, 0.655F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 26, 26, 0.2153F, -1.7917F, -1.7317F, 0, 1, 2, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(1.5F, 0.0F, -4.0F);
        this.jaw2.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.0F, 0.3927F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 41, 18, 0.0F, -0.375F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.9F, -5.6F);
        this.jaw2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.1745F, 0.1222F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 34, 18, 0.0F, -1.0342F, 0.1495F, 0, 1, 6, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.9F, -5.6F);
        this.jaw2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.3294F, -0.043F, -0.0566F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 7, 0, 0.9286F, 1.9218F, 5.3333F, 0, 1, 2, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 0.9F, -3.925F);
        this.jaw2.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.0524F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 41, 18, -1.0F, -0.9254F, -4.0337F, 2, 1, 4, -0.02F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 0.9F, -3.925F);
        this.jaw2.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0698F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 48, 51, -0.5F, -1.406F, -7.6767F, 1, 1, 4, -0.02F, false));

        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw2.addChild(throat);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.95F, 6.2F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, -0.0412F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 19, 56, -0.5F, -0.6558F, 0.042F, 1, 1, 3, 0.0F, false));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(-2.0F, 0.1381F, 1.7837F);
        this.body1.addChild(body5_r1);
        this.setRotateAngle(body5_r1, 0.096F, 0.0F, 0.0F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 59, 20, 0.5F, -0.9305F, -1.2086F, 1, 1, 2, 0.003F, true));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 59, 33, -0.5F, -0.9305F, -0.7086F, 1, 1, 2, 0.003F, true));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 34, 9, -0.5F, -0.9305F, -1.1086F, 1, 2, 2, 0.0F, true));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 59, 20, 2.5F, -0.9305F, -1.2086F, 1, 1, 2, 0.003F, false));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 59, 33, 3.5F, -0.9305F, -0.7086F, 1, 1, 2, 0.003F, false));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 34, 9, 3.5F, -0.9305F, -1.1086F, 1, 2, 2, 0.0F, false));

        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(-2.0F, 0.1381F, 1.7837F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.0797F, 0.174F, -0.0138F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 24, 33, -0.3014F, -0.8007F, -2.1527F, 1, 1, 2, 0.003F, true));

        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-1.7821F, 2.0912F, 2.8667F);
        this.body1.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -0.7831F, -0.0933F, -0.154F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 24, 14, -0.5F, -1.2F, -2.0F, 1, 2, 2, 0.0F, true));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(-0.7879F, 1.9073F, 0.4241F);
        this.body1.addChild(body6_r2);
        this.setRotateAngle(body6_r2, -1.0014F, -0.4526F, -0.2729F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 34, 40, -0.8978F, -1.3867F, -0.4464F, 1, 2, 1, 0.0F, true));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(2.0F, 0.1381F, 1.7837F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0797F, -0.174F, 0.0138F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 24, 33, -0.6986F, -0.8007F, -2.1527F, 1, 1, 2, 0.003F, false));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(1.7821F, 2.0912F, 2.8667F);
        this.body1.addChild(body5_r2);
        this.setRotateAngle(body5_r2, -0.7831F, 0.0933F, 0.154F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 24, 14, -0.5F, -1.2F, -2.0F, 1, 2, 2, 0.0F, false));

        this.body5_r3 = new ModelRenderer(this);
        this.body5_r3.setRotationPoint(0.7879F, 1.9073F, 0.4241F);
        this.body1.addChild(body5_r3);
        this.setRotateAngle(body5_r3, -1.0014F, 0.4526F, 0.2729F);
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 34, 40, -0.1022F, -1.3867F, -0.4464F, 1, 2, 1, 0.0F, false));

        this.body6_r3 = new ModelRenderer(this);
        this.body6_r3.setRotationPoint(0.7879F, 1.9073F, 0.4241F);
        this.body1.addChild(body6_r3);
        this.setRotateAngle(body6_r3, -0.2793F, 0.0F, 0.0F);
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 56, 39, -1.7879F, -0.1355F, -0.9402F, 2, 1, 1, 0.0F, false));

        this.upperlegleft = new ModelRenderer(this);
        this.upperlegleft.setRotationPoint(2.0F, 0.8174F, 1.9066F);
        this.body1.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, 0.3753F, -0.2484F, -1.3667F);
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 15, 14, -0.4F, -0.1F, -1.0F, 1, 4, 1, 0.0F, false));

        this.lowerlegleft = new ModelRenderer(this);
        this.lowerlegleft.setRotationPoint(0.1F, 3.7F, -0.3F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 1.0683F, 0.0F, 0.0227F);
        this.lowerlegleft.cubeList.add(new ModelBox(lowerlegleft, 61, 11, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, false));

        this.footleft = new ModelRenderer(this);
        this.footleft.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, 0.8992F, 0.4554F, 0.0094F);
        this.footleft.cubeList.add(new ModelBox(footleft, 43, 43, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, false));

        this.upperlegright = new ModelRenderer(this);
        this.upperlegright.setRotationPoint(-2.0F, 0.8174F, 1.9066F);
        this.body1.addChild(upperlegright);
        this.setRotateAngle(upperlegright, 0.3753F, 0.2484F, 1.3667F);
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 15, 0, -0.6F, -0.1F, -1.0F, 1, 4, 1, 0.0F, false));

        this.lowerlegright = new ModelRenderer(this);
        this.lowerlegright.setRotationPoint(-0.1F, 3.7F, -0.3F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 1.1555F, 0.0F, -0.0227F);
        this.lowerlegright.cubeList.add(new ModelBox(lowerlegright, 5, 47, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, false));

        this.footright = new ModelRenderer(this);
        this.footright.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, 0.8556F, -0.4554F, -0.0094F);
        this.footright.cubeList.add(new ModelBox(footright, 43, 36, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.2308F, 2.842F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, 0.0394F, -0.0872F, -0.0034F);
        this.tail1.cubeList.add(new ModelBox(tail1, 52, 33, -0.5F, -0.4566F, 0.0664F, 1, 1, 4, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1066F, 3.9664F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0179F, -0.2181F, -0.0039F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 0, -0.5F, -0.3912F, -0.0101F, 1, 1, 6, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1338F, 6.0899F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.2618F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 34, 33, -0.5F, -0.4923F, -0.1507F, 1, 1, 5, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0077F, 4.5493F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0226F, 0.2617F, -0.0058F);
        this.tail4.cubeList.add(new ModelBox(tail4, 34, 40, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.01F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0285F, 0.6979F, 0.0183F);
        this.tail5.cubeList.add(new ModelBox(tail5, 15, 14, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

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
