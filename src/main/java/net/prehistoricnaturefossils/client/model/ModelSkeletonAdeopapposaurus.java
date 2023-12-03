package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAdeopapposaurus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Root;
    private final ModelRenderer Hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Body;
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
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
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
    private final ModelRenderer Chest;
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
    private final ModelRenderer arm2;
    private final ModelRenderer forearm2;
    private final ModelRenderer hand2;
    private final ModelRenderer cube_r63;
    private final ModelRenderer arm3;
    private final ModelRenderer forearm3;
    private final ModelRenderer hand3;
    private final ModelRenderer cube_r64;
    private final ModelRenderer Neck;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer Head;
    private final ModelRenderer cube_r82;
    private final ModelRenderer lips;
    private final ModelRenderer lips2;
    private final ModelRenderer nose;
    private final ModelRenderer cube_r83;
    private final ModelRenderer teeth2;
    private final ModelRenderer cube_r84;
    private final ModelRenderer teeth3;
    private final ModelRenderer cube_r85;
    private final ModelRenderer Jaw;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer Tail4;
    private final ModelRenderer UpperLegR2;
    private final ModelRenderer LowerLegR2;
    private final ModelRenderer FootR2;
    private final ModelRenderer ToesR2;
    private final ModelRenderer UpperLegR3;
    private final ModelRenderer LowerLegR3;
    private final ModelRenderer FootR3;
    private final ModelRenderer ToesR3;

    public ModelSkeletonAdeopapposaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Root = new ModelRenderer(this);
        this.Root.setRotationPoint(0.0F, -17.5F, 1.0F);
        this.fossil.addChild(Root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.Root.addChild(Hips);
        this.Hips.cubeList.add(new ModelBox(Hips, 61, 52, 0.0F, -1.7422F, -2.3726F, 0, 1, 1, 0.0F, false));
        this.Hips.cubeList.add(new ModelBox(Hips, 35, 43, 1.5F, 1.8403F, -1.9242F, 1, 2, 3, 0.0F, false));
        this.Hips.cubeList.add(new ModelBox(Hips, 46, 37, 1.5F, -1.4147F, -1.1754F, 1, 1, 3, 0.0F, false));
        this.Hips.cubeList.add(new ModelBox(Hips, 46, 37, -2.5F, -1.4147F, -1.1754F, 1, 1, 3, 0.0F, true));
        this.Hips.cubeList.add(new ModelBox(Hips, 35, 43, -2.5F, 1.8403F, -1.9242F, 1, 2, 3, 0.0F, true));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, 2.6856F, 0.11F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.7182F, 0.2046F, -0.2284F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 50, -0.5F, 0.5368F, -0.6976F, 1, 6, 1, 0.002F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, 1.9647F, -1.7811F);
        this.Hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4659F, -0.1198F, -0.2333F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 49, 26, -0.5F, -0.0425F, -0.2585F, 1, 7, 1, 0.002F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, 0.2089F, 1.2571F);
        this.Hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6545F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 42, -0.5F, -0.8F, -1.6F, 1, 4, 3, -0.003F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 42, 3.5F, -0.8F, -1.6F, 1, 4, 3, -0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, -0.274F, 1.3865F);
        this.Hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6981F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 5, 55, -0.5F, -1.1F, -0.4F, 1, 1, 2, 0.002F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 5, 55, 3.5F, -1.1F, -0.4F, 1, 1, 2, 0.002F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.5F, -3.3F);
        this.Hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 49, -1.5F, -0.5F, 2.4F, 1, 1, 3, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 49, 0.5F, -0.5F, 2.4F, 1, 1, 3, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 17, -0.5F, -0.5F, -0.1F, 1, 1, 7, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(2.0F, 1.9647F, -1.7811F);
        this.Hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4659F, 0.1198F, 0.2333F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 49, 26, -0.5F, -0.0425F, -0.2585F, 1, 7, 1, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0F, 2.6856F, 0.11F);
        this.Hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.7182F, -0.2046F, 0.2284F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 50, -0.5F, 0.5368F, -0.6976F, 1, 6, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.2422F, 0.1274F);
        this.Hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 61, 0.0F, -0.2F, 1.5F, 0, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 61, 46, 0.0F, -0.3F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.6F, -3.4F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.0438F, 0.0872F, 0.0038F);
        this.Body.cubeList.add(new ModelBox(Body, 61, 34, 0.0F, -1.3572F, -6.9295F, 0, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 33, 61, 0.0F, -1.3572F, -4.9295F, 0, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 61, 29, 0.0F, -1.3572F, -2.9295F, 0, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 28, 30, -0.5F, -0.4364F, -7.869F, 1, 1, 8, 0.003F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 8.056F, -4.218F);
        this.Body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 15, -3.5F, -3.6736F, -5.1082F, 7, 4, 8, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.0391F, -0.1072F);
        this.Body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0511F, -0.1393F, -1.2182F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 42, -4.4774F, -1.6675F, -0.7235F, 2, 0, 1, 0.0F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.0391F, -0.1072F);
        this.Body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1097F, -0.1F, -0.7363F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 52, 38, -2.9674F, -0.3352F, -0.7235F, 2, 0, 1, 0.0F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.0391F, -0.1072F);
        this.Body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1395F, -0.0506F, -0.3455F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 58, 37, -1.022F, 0.0606F, -0.7235F, 1, 0, 1, 0.0F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.0481F, -2.1053F);
        this.Body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0359F, -0.0984F, -1.22F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 8, -5.4651F, -1.672F, -0.7246F, 3, 0, 1, 0.0F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.0481F, -2.1053F);
        this.Body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0773F, -0.0707F, -0.739F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 54, 19, -2.9586F, -0.3448F, -0.7246F, 2, 0, 1, 0.0F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -0.0481F, -2.1053F);
        this.Body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0984F, -0.0358F, -0.3473F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 58, 50, -1.0176F, 0.0483F, -0.7246F, 1, 0, 1, 0.0F, true));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.1354F, -4.1034F);
        this.Body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.009F, 0.0246F, -1.2216F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 29, 12, -6.4282F, -1.6854F, -0.7245F, 4, 0, 1, 0.0F, true));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -0.1354F, -4.1034F);
        this.Body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0193F, 0.0177F, -0.7416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 54, 31, -2.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, true));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -0.1354F, -4.1034F);
        this.Body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0246F, 0.009F, -0.349F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 59, 4, -1.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, true));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -0.0315F, -6.3101F);
        this.Body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0968F, 0.0883F, -0.7375F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 56, 44, -2.9345F, -0.3711F, -0.5237F, 2, 0, 1, 0.0F, true));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -0.0315F, -6.3101F);
        this.Body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1231F, 0.0447F, -0.3463F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 59, 12, -1.0054F, 0.0148F, -0.5237F, 1, 0, 1, 0.0F, true));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -0.0315F, -6.3101F);
        this.Body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.045F, 0.123F, -1.219F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 15, 38, -7.4316F, -1.6842F, -0.5237F, 5, 0, 1, 0.0F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 0.0391F, -0.1072F);
        this.Body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0511F, 0.1393F, 1.2182F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 46, 42, 2.4774F, -1.6675F, -0.7235F, 2, 0, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.0391F, -0.1072F);
        this.Body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1097F, 0.1F, 0.7363F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 52, 38, 0.9674F, -0.3352F, -0.7235F, 2, 0, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 0.0391F, -0.1072F);
        this.Body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1395F, 0.0506F, 0.3455F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 58, 37, 0.022F, 0.0606F, -0.7235F, 1, 0, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, -0.0481F, -2.1053F);
        this.Body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0984F, 0.0358F, 0.3473F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 58, 50, 0.0176F, 0.0483F, -0.7246F, 1, 0, 1, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, -0.0481F, -2.1053F);
        this.Body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0773F, 0.0707F, 0.739F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 54, 19, 0.9586F, -0.3448F, -0.7246F, 2, 0, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, -0.0481F, -2.1053F);
        this.Body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0359F, 0.0984F, 1.22F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 8, 2.4651F, -1.672F, -0.7246F, 3, 0, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, -0.1354F, -4.1034F);
        this.Body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0246F, -0.009F, 0.349F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 59, 4, 0.0042F, 0.0114F, -0.7245F, 1, 0, 1, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, -0.1354F, -4.1034F);
        this.Body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0193F, -0.0177F, 0.7416F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 54, 31, 0.9321F, -0.3737F, -0.7245F, 2, 0, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, -0.1354F, -4.1034F);
        this.Body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.009F, -0.0246F, 1.2216F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 29, 12, 2.4282F, -1.6854F, -0.7245F, 4, 0, 1, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, -0.0315F, -6.3101F);
        this.Body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.045F, -0.123F, 1.219F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 15, 38, 2.4316F, -1.6842F, -0.5237F, 5, 0, 1, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, -0.0315F, -6.3101F);
        this.Body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0968F, -0.0883F, 0.7375F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 56, 44, 0.9345F, -0.3711F, -0.5237F, 2, 0, 1, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -0.8441F, -0.1298F);
        this.Body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0873F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 61, 17, 0.0F, -0.3869F, -0.7997F, 0, 1, 1, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, -0.0315F, -6.3101F);
        this.Body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1231F, -0.0447F, 0.3463F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 59, 12, 0.0054F, 0.0148F, -0.5237F, 1, 0, 1, 0.0F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.0393F, -7.8991F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0437F, 0.0436F, 0.0019F);


        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, 0.0336F, -0.3796F);
        this.Chest.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0602F, 0.1639F, -1.2168F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 34, 26, -8.4723F, -1.6693F, -0.3268F, 6, 0, 1, 0.0F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 0.0336F, -0.3796F);
        this.Chest.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1642F, 0.0594F, -0.3442F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 28, 14, -1.0202F, 0.0555F, -0.3268F, 1, 0, 1, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, 0.0336F, -0.3796F);
        this.Chest.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1293F, 0.1176F, -0.7341F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 21, -2.9638F, -0.3392F, -0.3268F, 2, 0, 1, 0.0F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, 0.2752F, -2.2076F);
        this.Chest.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0914F, 0.2457F, -1.2104F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 30, 40, -8.408F, -1.6927F, -0.5147F, 6, 0, 1, 0.0F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.5F, 0.2752F, -2.2076F);
        this.Chest.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.2467F, 0.0886F, -0.3381F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 44, 22, -0.9968F, -0.0088F, -0.5147F, 1, 0, 1, 0.0F, true));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, 0.2752F, -2.2076F);
        this.Chest.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.195F, 0.1758F, -0.7245F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 23, 21, -2.9176F, -0.3896F, -0.5147F, 2, 0, 1, 0.0F, true));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, 0.5989F, -4.2436F);
        this.Chest.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1407F, 0.3678F, -1.1955F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 29, 8, -6.4914F, -1.6624F, -0.5609F, 4, 0, 1, 0.0F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, 0.5989F, -4.2436F);
        this.Chest.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.2964F, 0.2615F, -0.7025F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 19, 42, -2.9775F, -0.3242F, -0.5609F, 2, 0, 1, 0.0F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5F, 0.5989F, -4.2436F);
        this.Chest.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.3712F, 0.1313F, -0.3244F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 57, 33, -1.0271F, 0.0746F, -0.5609F, 1, 0, 1, 0.0F, true));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, 1.122F, -6.297F);
        this.Chest.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.2145F, 0.5293F, -1.207F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 30, 42, -4.4168F, -1.6895F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, 1.122F, -6.297F);
        this.Chest.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.5394F, 0.1848F, -0.3415F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 58, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, 1.122F, -6.297F);
        this.Chest.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.4391F, 0.3715F, -0.7016F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 44, 13, -2.9239F, -0.3827F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(0.5F, 0.0336F, -0.3796F);
        this.Chest.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1642F, -0.0594F, 0.3442F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 28, 14, 0.0202F, 0.0555F, -0.3268F, 1, 0, 1, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.5F, 0.0336F, -0.3796F);
        this.Chest.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.1293F, -0.1176F, 0.7341F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 21, 0.9638F, -0.3392F, -0.3268F, 2, 0, 1, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.5F, 0.0336F, -0.3796F);
        this.Chest.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0602F, -0.1639F, 1.2168F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 34, 26, 2.4723F, -1.6693F, -0.3268F, 6, 0, 1, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.5F, 0.2752F, -2.2076F);
        this.Chest.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.2467F, -0.0886F, 0.3381F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 44, 22, -0.0032F, -0.0088F, -0.5147F, 1, 0, 1, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, 0.2752F, -2.2076F);
        this.Chest.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.195F, -0.1758F, 0.7245F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 23, 21, 0.9176F, -0.3896F, -0.5147F, 2, 0, 1, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5F, 0.2752F, -2.2076F);
        this.Chest.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0914F, -0.2457F, 1.2104F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 30, 40, 2.408F, -1.6927F, -0.5147F, 6, 0, 1, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.5F, 0.5989F, -4.2436F);
        this.Chest.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.1407F, -0.3678F, 1.1955F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 29, 8, 2.4914F, -1.6624F, -0.5609F, 4, 0, 1, 0.0F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.5F, 0.5989F, -4.2436F);
        this.Chest.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.2964F, -0.2615F, 0.7025F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 19, 42, 0.9775F, -0.3242F, -0.5609F, 2, 0, 1, 0.0F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(0.5F, 0.5989F, -4.2436F);
        this.Chest.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.3712F, -0.1313F, 0.3244F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 57, 33, 0.0271F, 0.0746F, -0.5609F, 1, 0, 1, 0.0F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.5F, 1.122F, -6.297F);
        this.Chest.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.5394F, -0.1848F, 0.3415F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 58, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(0.5F, 1.122F, -6.297F);
        this.Chest.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.2145F, -0.5293F, 1.207F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 30, 42, 2.4168F, -1.6895F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(0.5F, 1.122F, -6.297F);
        this.Chest.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.4391F, -0.3715F, 0.7016F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 44, 13, 0.9239F, -0.3827F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, 1.0204F, -6.8319F);
        this.Chest.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.1309F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 24, 60, 0.0F, -1.2F, 6.0F, 0, 1, 1, 0.0F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 27, 60, 0.0F, -1.1F, 4.0F, 0, 1, 1, 0.0F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 45, 60, 0.0F, -1.0F, 2.0F, 0, 1, 1, 0.0F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 54, 60, 0.0F, -0.9F, 0.0F, 0, 1, 1, 0.0F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 34, 8, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, false));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(-4.5F, 5.8806F, -4.3143F);
        this.Chest.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.7813F, 0.286F, 0.2729F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 44, 8, 0.2F, -1.3F, 0.4F, 3, 3, 1, 0.0F, true));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, 4.5294F, -2.8397F);
        this.Chest.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.7418F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 54, 56, -4.5F, -1.0F, -1.5F, 1, 2, 1, 0.0F, true));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 44, 17, -4.5F, -0.5F, -0.5F, 1, 1, 3, 0.0F, true));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 53, 8, -4.5F, -0.9F, 2.5F, 1, 2, 2, 0.0F, true));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 53, 8, 3.5F, -0.9F, 2.5F, 1, 2, 2, 0.0F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 54, 56, 3.5F, -1.0F, -1.5F, 1, 2, 1, 0.0F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 44, 17, 3.5F, -0.5F, -0.5F, 1, 1, 3, 0.0F, false));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(4.5F, 5.8806F, -4.3143F);
        this.Chest.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.7813F, -0.286F, -0.2729F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 44, 8, -3.2F, -1.3F, 0.4F, 3, 3, 1, 0.0F, false));

        this.arm2 = new ModelRenderer(this);
        this.arm2.setRotationPoint(4.5F, 6.1652F, -3.1168F);
        this.Chest.addChild(arm2);
        this.setRotateAngle(arm2, 0.7858F, 0.025F, 0.0357F);
        this.arm2.cubeList.add(new ModelBox(arm2, 8, 0, -0.4952F, 1.5571F, -0.6199F, 1, 3, 1, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 53, 0, -0.4952F, -0.4429F, -0.9199F, 1, 2, 2, 0.0F, false));

        this.forearm2 = new ModelRenderer(this);
        this.forearm2.setRotationPoint(0.0048F, 4.5571F, -0.3199F);
        this.arm2.addChild(forearm2);
        this.setRotateAngle(forearm2, -0.9163F, 0.0F, 0.0F);
        this.forearm2.cubeList.add(new ModelBox(forearm2, 34, 54, -0.5F, -0.2958F, -0.6344F, 1, 5, 1, -0.002F, false));
        this.forearm2.cubeList.add(new ModelBox(forearm2, 54, 24, -0.5F, -0.2958F, -1.6344F, 1, 5, 1, -0.2F, false));

        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.0F, 4.2042F, -0.7344F);
        this.forearm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.0F, 0.0F, 0.4363F);
        this.hand2.cubeList.add(new ModelBox(hand2, 0, 28, -0.5F, 0.0F, -1.5F, 1, 4, 3, 0.0F, false));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(0.5F, 0.0F, -1.5F);
        this.hand2.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.5178F, 0.045F, 0.258F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 23, 15, -1.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, false));

        this.arm3 = new ModelRenderer(this);
        this.arm3.setRotationPoint(-4.5F, 6.1652F, -3.1168F);
        this.Chest.addChild(arm3);
        this.setRotateAngle(arm3, 1.4418F, -0.2149F, -0.1433F);
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 0, -0.5048F, 1.5571F, -0.6199F, 1, 3, 1, 0.0F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 52, 33, -0.5048F, -0.4429F, -0.9199F, 1, 2, 2, 0.0F, false));

        this.forearm3 = new ModelRenderer(this);
        this.forearm3.setRotationPoint(-0.0048F, 4.5571F, -0.3199F);
        this.arm3.addChild(forearm3);
        this.setRotateAngle(forearm3, -1.4399F, 0.0F, 0.0F);
        this.forearm3.cubeList.add(new ModelBox(forearm3, 49, 52, -0.5F, -0.2958F, -0.6344F, 1, 5, 1, -0.002F, false));
        this.forearm3.cubeList.add(new ModelBox(forearm3, 12, 52, -0.5F, -0.2958F, -1.6344F, 1, 5, 1, -0.2F, false));

        this.hand3 = new ModelRenderer(this);
        this.hand3.setRotationPoint(0.0F, 4.2042F, -0.7344F);
        this.forearm3.addChild(hand3);
        this.setRotateAngle(hand3, 0.0F, 0.0F, -0.48F);
        this.hand3.cubeList.add(new ModelBox(hand3, 16, 0, -0.5F, 0.0F, -1.5F, 1, 4, 3, 0.0F, false));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(-0.5F, 0.0F, -1.5F);
        this.hand3.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.5178F, -0.045F, -0.258F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 15, 0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.8909F, -6.7492F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.4199F, 0.2128F, 0.0466F);


        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, 1.396F, -4.7072F);
        this.Neck.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.3142F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 22, 40, -0.5F, -0.2238F, 0.0337F, 1, 1, 5, 0.003F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.5F, 1.2578F, -1.5805F);
        this.Neck.addChild(cube_r66);
        this.setRotateAngle(cube_r66, -0.2656F, -0.6503F, 0.0837F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 41, 40, 0.0778F, -0.6596F, 0.0009F, 0, 1, 4, 0.0F, true));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.5F, 1.976F, -3.5539F);
        this.Neck.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -0.126F, -0.4318F, 0.0636F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 50, 19, 0.1098F, -0.6883F, 0.1208F, 0, 1, 3, 0.0F, true));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.5F, 1.2578F, -1.5805F);
        this.Neck.addChild(cube_r68);
        this.setRotateAngle(cube_r68, -0.2656F, 0.6503F, -0.0837F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 41, 40, -0.0778F, -0.6596F, 0.0009F, 0, 1, 4, 0.0F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(0.5F, 1.976F, -3.5539F);
        this.Neck.addChild(cube_r69);
        this.setRotateAngle(cube_r69, -0.126F, 0.4318F, -0.0636F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 50, 19, -0.1098F, -0.6883F, 0.1208F, 0, 1, 3, 0.0F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 1.5324F, -4.4324F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.1354F, 0.1489F, 0.1057F);


        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(0.0F, 1.9383F, -4.5572F);
        this.Neck2.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.3927F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 39, 30, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(-0.5F, 0.8024F, -0.6332F);
        this.Neck2.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0612F, -0.3461F, 0.0198F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 27, 56, 0.0078F, -0.6091F, 0.0782F, 0, 1, 2, 0.0F, true));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(-0.5F, 1.2328F, -2.5787F);
        this.Neck2.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.1069F, -0.3454F, 0.0118F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 44, 56, 0.028F, -0.2949F, 0.1072F, 0, 1, 2, 0.0F, true));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(-0.5F, 2.0328F, -3.9643F);
        this.Neck2.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.1021F, -0.1719F, 0.0306F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 56, 46, -0.0587F, -0.4042F, -0.3729F, 0, 1, 2, 0.0F, true));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(0.5F, 0.8024F, -0.6332F);
        this.Neck2.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0612F, 0.3461F, -0.0198F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 27, 56, -0.0078F, -0.6091F, 0.0782F, 0, 1, 2, 0.0F, false));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(0.5F, 1.2328F, -2.5787F);
        this.Neck2.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.1069F, 0.3454F, -0.0118F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 44, 56, -0.028F, -0.2949F, 0.1072F, 0, 1, 2, 0.0F, false));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(0.5F, 2.0328F, -3.9643F);
        this.Neck2.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.1021F, 0.1719F, -0.0306F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 56, 46, 0.0587F, -0.4042F, -0.3729F, 0, 1, 2, 0.0F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 1.8187F, -4.5232F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.3079F, 0.1248F, 0.0396F);


        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(-0.5F, 0.5246F, -1.833F);
        this.Neck3.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.247F, -0.1719F, 0.0306F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 17, 56, -0.0066F, -0.5924F, -0.0377F, 0, 1, 2, 0.0F, true));

        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(-0.5F, 0.4693F, -3.8938F);
        this.Neck3.addChild(cube_r78);
        this.setRotateAngle(cube_r78, -0.1772F, -0.1719F, 0.0306F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 22, 56, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(0.5F, 0.5246F, -1.833F);
        this.Neck3.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.247F, 0.1719F, -0.0306F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 17, 56, 0.0066F, -0.5924F, -0.0377F, 0, 1, 2, 0.0F, false));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(0.5F, 0.4693F, -3.8938F);
        this.Neck3.addChild(cube_r80);
        this.setRotateAngle(cube_r80, -0.1772F, 0.1719F, -0.0306F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 22, 56, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(0.0F, 0.0693F, -4.4938F);
        this.Neck3.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0F, 0.0F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 0, 0, -0.5F, -0.5F, -0.4F, 1, 1, 5, -0.002F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.2307F, -4.4938F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.2447F, 0.1282F, -0.1473F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 7, -1.5F, -1.0F, -2.0F, 3, 2, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 51, 13, -1.5F, -0.7F, -1.98F, 3, 1, 1, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 51, 13, 0.0F, -0.457F, -3.2918F, 1, 1, 1, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 50, 16, -1.33F, -0.7F, -1.98F, 3, 1, 1, -0.15F, false));
        this.Head.cubeList.add(new ModelBox(Head, 50, 5, -1.22F, -0.7F, -1.98F, 3, 1, 1, -0.25F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 36, -1.29F, -0.9F, -0.98F, 3, 2, 1, -0.2F, false));
        this.Head.cubeList.add(new ModelBox(Head, 50, 5, -1.78F, -0.7F, -1.98F, 3, 1, 1, -0.25F, true));
        this.Head.cubeList.add(new ModelBox(Head, 50, 16, -1.67F, -0.7F, -1.98F, 3, 1, 1, -0.15F, true));
        this.Head.cubeList.add(new ModelBox(Head, 0, 36, -1.71F, -0.9F, -0.98F, 3, 2, 1, -0.2F, true));
        this.Head.cubeList.add(new ModelBox(Head, 51, 13, -1.0F, -0.457F, -3.2918F, 1, 1, 1, 0.01F, true));

        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.Head.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.0262F, 0.0F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 44, 0, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.lips = new ModelRenderer(this);
        this.lips.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Head.addChild(lips);
        this.setRotateAngle(lips, 0.0349F, 0.0F, 0.0F);
        this.lips.cubeList.add(new ModelBox(lips, 49, 48, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.002F, false));

        this.lips2 = new ModelRenderer(this);
        this.lips2.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.lips.addChild(lips2);
        this.setRotateAngle(lips2, -0.1309F, 0.0F, 0.0F);
        this.lips2.cubeList.add(new ModelBox(lips2, 54, 52, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.nose = new ModelRenderer(this);
        this.nose.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.lips2.addChild(nose);
        this.setRotateAngle(nose, 0.7854F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 58, 39, -0.5F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.nose.addChild(cube_r83);
        this.setRotateAngle(cube_r83, -0.5236F, 0.0F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 57, 21, -0.5F, 0.0F, 0.1F, 1, 1, 1, -0.002F, false));
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 58, 7, -0.5F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

        this.teeth2 = new ModelRenderer(this);
        this.teeth2.setRotationPoint(0.65F, 1.0F, -6.8F);
        this.Head.addChild(teeth2);
        this.setRotateAngle(teeth2, -0.1291F, 0.1139F, -0.0052F);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 21, 60, -0.5F, -0.8F, 1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(-0.5F, -0.3F, 3.0F);
        this.teeth2.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.2182F, 0.0F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 39, 30, 0.0F, -0.5F, -0.1F, 0, 1, 2, 0.0F, true));

        this.teeth3 = new ModelRenderer(this);
        this.teeth3.setRotationPoint(-0.65F, 1.0F, -6.8F);
        this.Head.addChild(teeth3);
        this.setRotateAngle(teeth3, -0.1291F, -0.1139F, 0.0052F);
        this.teeth3.cubeList.add(new ModelBox(teeth3, 21, 60, 0.5F, -0.8F, 1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(0.5F, -0.3F, 3.0F);
        this.teeth3.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.2182F, 0.0F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 39, 30, 0.0F, -0.5F, -0.1F, 0, 1, 2, 0.0F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.3927F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 39, 54, 0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 39, 54, -1.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(0.25F, 0.0F, -5.0F);
        this.Jaw.addChild(cube_r86);
        this.setRotateAngle(cube_r86, -0.0436F, 0.1309F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 5, 50, 0.0F, -0.5F, -0.4F, 0, 1, 3, 0.0F, false));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.Jaw.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.0436F, 0.0F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 53, 40, -0.5F, -1.0F, -3.998F, 1, 1, 2, -0.002F, false));
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 49, 44, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.3F, 3.5F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, -0.0873F, 0.0435F, -0.0038F);


        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(0.0F, 3.0837F, 10.0478F);
        this.Tail.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.3054F, 0.0F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 39, 58, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(0.0F, 3.2576F, 1.2567F);
        this.Tail.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.3491F, 0.0F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 9, 28, 0.0F, -0.2709F, 5.9144F, 0, 4, 1, 0.0F, false));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 29, 0, 0.0F, -0.692F, 3.9566F, 0, 4, 1, 0.0F, false));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 30, 30, 0.0F, -1.4994F, 2.1024F, 0, 4, 1, 0.0F, false));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 32, 0, 0.0F, -2.5F, 0.3F, 0, 4, 1, 0.0F, false));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(0.0F, 0.1383F, 0.0239F);
        this.Tail.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -0.0873F, 0.0F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 16, 0, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.003F, false));

        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(0.0F, -0.4298F, 1.1345F);
        this.Tail.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -0.1309F, 0.0F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 48, 59, 0.0F, -1.0F, 6.9F, 0, 1, 1, 0.0F, false));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 51, 59, 0.0F, -1.0F, 4.9F, 0, 1, 1, 0.0F, false));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 59, 56, 0.0F, -0.9F, 2.9F, 0, 1, 1, 0.0F, false));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 58, 59, 0.0F, -0.8F, 0.9F, 0, 1, 1, 0.0F, false));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 18, 60, 0.0F, -0.7F, -1.1F, 0, 1, 1, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.9314F, 9.68F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0876F, 0.0869F, -0.0076F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 42, 59, 0.0F, -1.2487F, -0.0214F, 0, 1, 1, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 31, 59, 0.0F, -1.2487F, 1.9786F, 0, 1, 1, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 59, 27, 0.0F, -1.2487F, 3.9786F, 0, 1, 1, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 59, 24, 0.0F, -1.2487F, 5.9786F, 0, 1, 1, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 59, 15, 0.0F, -1.2487F, 7.9786F, 0, 1, 1, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 15, 59, 0.0F, -1.2487F, 9.9786F, 0, 1, 1, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 15, 59, 0.0F, -1.2487F, 11.9786F, 0, 1, 1, 0.0F, false));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(0.0F, -0.0902F, -0.0117F);
        this.Tail2.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.0175F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 0, 0, -0.5F, -0.4F, 0.0F, 1, 1, 13, 0.0F, false));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(0.0F, 2.3291F, -8.3788F);
        this.Tail2.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.3491F, 0.0F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 9, 59, 0.0F, 4.6125F, 19.6684F, 0, 2, 1, 0.0F, false));
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 12, 59, 0.0F, 4.2652F, 17.6988F, 0, 2, 1, 0.0F, false));
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 33, 30, 0.0F, 2.9179F, 15.7292F, 0, 3, 1, 0.0F, false));
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 9, 34, 0.0F, 2.5706F, 13.7596F, 0, 3, 1, 0.0F, false));
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 0, 58, 0.0F, 2.2233F, 11.79F, 0, 3, 1, 0.0F, false));
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 3, 58, 0.0F, 1.7776F, 9.8377F, 0, 3, 1, 0.0F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.1563F, 12.8863F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.088F, -0.1304F, -0.0115F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 6, 42, 0.0F, -1.0732F, 1.0376F, 0, 1, 1, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 42, 0.0F, -0.9732F, 3.0376F, 0, 1, 1, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 6, 28, 0.0F, -0.9732F, 5.0376F, 0, 1, 1, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 28, 0.0F, -0.9732F, 7.0376F, 0, 1, 1, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 22, 0, 0.0F, -0.9732F, 9.0376F, 0, 1, 1, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 16, 0, 0.0F, -0.9732F, 11.0376F, 0, 1, 1, 0.0F, false));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(0.0F, -0.4147F, 0.0474F);
        this.Tail3.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.0262F, 0.0F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 0, 28, -0.5F, -0.1F, 0.0F, 1, 1, 12, 0.003F, false));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(0.0F, 2.4046F, -21.3198F);
        this.Tail3.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.3491F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 44, 17, 0.0F, 6.574F, 23.544F, 0, 1, 1, 0.0F, false));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 19, 44, 0.0F, 8.6446F, 31.2714F, 0, 1, 1, 0.0F, false));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 34, 49, 0.0F, 8.127F, 29.3396F, 0, 1, 1, 0.0F, false));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 40, 49, 0.0F, 7.6093F, 27.4077F, 0, 1, 1, 0.0F, false));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 5, 50, 0.0F, 7.0917F, 25.4759F, 0, 1, 1, 0.0F, false));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 6, 59, 0.0F, 5.0564F, 21.6122F, 0, 2, 1, 0.0F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.4981F, 11.9564F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0903F, -0.2608F, -0.0233F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 19, 16, -0.5F, -0.3F, 0.0F, 1, 1, 12, 0.0F, false));

        this.UpperLegR2 = new ModelRenderer(this);
        this.UpperLegR2.setRotationPoint(3.2F, 1.2F, 0.3F);
        this.Hips.addChild(UpperLegR2);
        this.setRotateAngle(UpperLegR2, -0.3054F, 0.0F, 0.0F);
        this.UpperLegR2.cubeList.add(new ModelBox(UpperLegR2, 14, 42, -0.6F, -0.4742F, -0.4768F, 1, 8, 1, 0.0F, false));

        this.LowerLegR2 = new ModelRenderer(this);
        this.LowerLegR2.setRotationPoint(-0.1F, 7.5454F, -0.0108F);
        this.UpperLegR2.addChild(LowerLegR2);
        this.setRotateAngle(LowerLegR2, 1.1345F, 0.0F, 0.0F);
        this.LowerLegR2.cubeList.add(new ModelBox(LowerLegR2, 29, 47, -0.5F, -0.0651F, -0.475F, 1, 7, 1, -0.002F, false));
        this.LowerLegR2.cubeList.add(new ModelBox(LowerLegR2, 24, 47, -0.5F, -0.0651F, 0.525F, 1, 7, 1, -0.2F, false));

        this.FootR2 = new ModelRenderer(this);
        this.FootR2.setRotationPoint(0.0F, 6.6971F, 1.1162F);
        this.LowerLegR2.addChild(FootR2);
        this.setRotateAngle(FootR2, -0.6981F, 0.0F, 0.0F);
        this.FootR2.cubeList.add(new ModelBox(FootR2, 34, 17, -0.5F, -0.0099F, -0.7834F, 1, 5, 1, 0.0F, false));

        this.ToesR2 = new ModelRenderer(this);
        this.ToesR2.setRotationPoint(0.0F, 5.0163F, -0.5822F);
        this.FootR2.addChild(ToesR2);
        this.ToesR2.cubeList.add(new ModelBox(ToesR2, 15, 30, -2.0F, 0.0F, -5.0F, 4, 1, 6, 0.0F, false));

        this.UpperLegR3 = new ModelRenderer(this);
        this.UpperLegR3.setRotationPoint(-3.2F, 1.2F, 0.3F);
        this.Hips.addChild(UpperLegR3);
        this.setRotateAngle(UpperLegR3, -0.6545F, 0.0F, 0.0F);
        this.UpperLegR3.cubeList.add(new ModelBox(UpperLegR3, 9, 42, -0.4F, -0.4742F, -0.4768F, 1, 8, 1, 0.0F, false));

        this.LowerLegR3 = new ModelRenderer(this);
        this.LowerLegR3.setRotationPoint(0.1F, 7.5454F, -0.0108F);
        this.UpperLegR3.addChild(LowerLegR3);
        this.setRotateAngle(LowerLegR3, 1.0036F, 0.0F, 0.0F);
        this.LowerLegR3.cubeList.add(new ModelBox(LowerLegR3, 19, 47, -0.5F, -0.0651F, -0.475F, 1, 7, 1, -0.002F, false));
        this.LowerLegR3.cubeList.add(new ModelBox(LowerLegR3, 44, 46, -0.5F, -0.0651F, 0.525F, 1, 7, 1, -0.2F, false));

        this.FootR3 = new ModelRenderer(this);
        this.FootR3.setRotationPoint(0.0F, 6.6971F, 1.1162F);
        this.LowerLegR3.addChild(FootR3);
        this.setRotateAngle(FootR3, -0.7418F, 0.0F, 0.0F);
        this.FootR3.cubeList.add(new ModelBox(FootR3, 15, 29, -0.5F, -0.0099F, -0.7834F, 1, 5, 1, 0.0F, false));

        this.ToesR3 = new ModelRenderer(this);
        this.ToesR3.setRotationPoint(0.0F, 5.0163F, -0.5822F);
        this.FootR3.addChild(ToesR3);
        this.setRotateAngle(ToesR3, 0.3927F, 0.0F, 0.0F);
        this.ToesR3.cubeList.add(new ModelBox(ToesR3, 29, 0, -2.0F, 0.0F, -5.0F, 4, 1, 6, 0.0F, false));

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
