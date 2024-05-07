package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCaihong extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Anchiornis;
    private final ModelRenderer Basin_r1;
    private final ModelRenderer Basin_r2;
    private final ModelRenderer Basin_r3;
    private final ModelRenderer Basin_r4;
    private final ModelRenderer UpperLegL;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer LowerLegL;
    private final ModelRenderer cube_r4;
    private final ModelRenderer FootL;
    private final ModelRenderer cube_r5;
    private final ModelRenderer ToesL;
    private final ModelRenderer cube_r6;
    private final ModelRenderer UpperLegL2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer LowerLegL2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer FootL2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer ToesL2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r12;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r23;
    private final ModelRenderer UpperArmL;
    private final ModelRenderer feathers2;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer LowerArmL;
    private final ModelRenderer cube_r28;
    private final ModelRenderer feathers;
    private final ModelRenderer cube_r29;
    private final ModelRenderer HandL;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer HandwingL;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer UpperArmL2;
    private final ModelRenderer feathers3;
    private final ModelRenderer LowerArmL2;
    private final ModelRenderer cube_r35;
    private final ModelRenderer feathers4;
    private final ModelRenderer HandL2;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer HandwingL2;
    private final ModelRenderer Neck1;
    private final ModelRenderer cube_r39;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r40;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r41;
    private final ModelRenderer head;
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
    private final ModelRenderer Jaw;
    private final ModelRenderer cube_r53;

    public ModelSkeletonCaihong() {
        this.textureWidth = 160;
        this.textureHeight = 75;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -16.0F, -2.0F, -16.0F, 37, 2, 43, 0.0F, false));

        this.Anchiornis = new ModelRenderer(this);
        this.Anchiornis.setRotationPoint(1.8F, -2.2F, -0.6F);
        this.fossil.addChild(Anchiornis);
        this.setRotateAngle(Anchiornis, -0.3054F, 0.0F, -1.5708F);


        this.Basin_r1 = new ModelRenderer(this);
        this.Basin_r1.setRotationPoint(0.1F, 0.9798F, 1.9603F);
        this.Anchiornis.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -1.6581F, 0.0F, 0.0F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 47, 59, -0.8F, -0.3F, -1.0F, 1, 1, 4, -0.2F, false));

        this.Basin_r2 = new ModelRenderer(this);
        this.Basin_r2.setRotationPoint(0.1F, 3.7949F, 1.3601F);
        this.Anchiornis.addChild(Basin_r2);
        this.setRotateAngle(Basin_r2, -0.4363F, 0.0F, 0.0F);
        this.Basin_r2.cubeList.add(new ModelBox(Basin_r2, 33, 63, -0.8F, -0.6525F, 0.3433F, 1, 1, 1, -0.2F, false));
        this.Basin_r2.cubeList.add(new ModelBox(Basin_r2, 0, 59, -0.8F, -0.6525F, -0.2567F, 1, 1, 1, -0.2F, false));

        this.Basin_r3 = new ModelRenderer(this);
        this.Basin_r3.setRotationPoint(0.1F, 0.8654F, 2.774F);
        this.Anchiornis.addChild(Basin_r3);
        this.setRotateAngle(Basin_r3, -0.9599F, 0.0F, 0.0F);
        this.Basin_r3.cubeList.add(new ModelBox(Basin_r3, 0, 68, -0.8F, -0.2F, -1.2F, 1, 1, 2, -0.2F, false));

        this.Basin_r4 = new ModelRenderer(this);
        this.Basin_r4.setRotationPoint(-0.4F, 0.2F, 3.7F);
        this.Anchiornis.addChild(Basin_r4);
        this.setRotateAngle(Basin_r4, -0.0873F, 0.0F, 0.0F);
        this.Basin_r4.cubeList.add(new ModelBox(Basin_r4, 66, 46, -0.4F, -0.5715F, -2.6652F, 1, 1, 2, 0.01F, false));
        this.Basin_r4.cubeList.add(new ModelBox(Basin_r4, 58, 46, -0.6F, -0.4715F, -5.1652F, 1, 1, 5, 0.01F, false));

        this.UpperLegL = new ModelRenderer(this);
        this.UpperLegL.setRotationPoint(0.6F, 0.7F, 2.3F);
        this.Anchiornis.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 1.2217F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.63F, 5.7705F, -3.5723F);
        this.UpperLegL.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.0472F, 0.0F, -3.1416F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 19, 0.0F, -1.5F, -4.5F, 0, 3, 9, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.65F, 5.6246F, 1.09F);
        this.UpperLegL.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7854F, 0.0F, -3.1416F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 10, 0.0F, -3.5F, -4.5F, 0, 7, 9, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.1086F, 0.4314F);
        this.UpperLegL.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 32, -1.4F, -0.4F, -0.95F, 1, 6, 1, 0.0F, false));

        this.LowerLegL = new ModelRenderer(this);
        this.LowerLegL.setRotationPoint(-0.5F, 3.5914F, -3.9686F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.3491F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLegL.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4712F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 26, -0.9F, -0.2F, -0.3F, 1, 7, 1, -0.001F, false));

        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 6.35F, 3.2F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, -0.3491F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootL.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6283F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 62, 64, -0.9F, -0.1F, -0.6F, 1, 4, 1, -0.002F, false));

        this.ToesL = new ModelRenderer(this);
        this.ToesL.setRotationPoint(0.0F, 3.6F, -3.0F);
        this.FootL.addChild(ToesL);
        this.setRotateAngle(ToesL, 0.0F, -0.829F, 1.5708F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ToesL.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 56, -1.0F, 0.0995F, -3.0209F, 2, 1, 4, 0.0F, false));

        this.UpperLegL2 = new ModelRenderer(this);
        this.UpperLegL2.setRotationPoint(0.0F, 1.0F, 3.2F);
        this.Anchiornis.addChild(UpperLegL2);
        this.setRotateAngle(UpperLegL2, 0.9599F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.9F, -0.6F);
        this.UpperLegL2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.7854F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 32, -1.0F, -0.4F, -0.95F, 1, 6, 1, 0.0F, false));

        this.LowerLegL2 = new ModelRenderer(this);
        this.LowerLegL2.setRotationPoint(-0.2F, 2.8F, -5.0F);
        this.UpperLegL2.addChild(LowerLegL2);
        this.setRotateAngle(LowerLegL2, 0.3927F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLegL2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4712F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 46, -0.8F, -0.2F, -0.3F, 1, 7, 1, -0.001F, false));

        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 5.85F, 3.5F);
        this.LowerLegL2.addChild(FootL2);
        this.setRotateAngle(FootL2, -0.0873F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.2F, 3.2417F, 1.2294F);
        this.FootL2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6283F, 0.0F, -3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 30, 0.0F, -2.0F, -2.5F, 0, 4, 5, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootL2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6283F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 57, 64, -0.8F, -0.1F, -0.6F, 1, 4, 1, -0.002F, false));

        this.ToesL2 = new ModelRenderer(this);
        this.ToesL2.setRotationPoint(0.0F, 3.6F, -3.0F);
        this.FootL2.addChild(ToesL2);
        this.setRotateAngle(ToesL2, 0.0F, 0.829F, -1.5708F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.0479F, 0.9118F);
        this.ToesL2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0175F, 1.5708F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 29, 0, -1.7F, -0.4006F, -3.8974F, 2, 1, 4, 0.0F, false));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(-0.5F, -0.3F, 3.5F);
        this.Anchiornis.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.5323F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 0.6F, -0.1F);
        this.Tail1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 63, -1.0F, -0.7F, -0.3F, 1, 1, 3, 0.003F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 2.8F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.3054F, 0.0F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.4F, -1.5603F, 1.7708F);
        this.Tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.0873F, 1.5708F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 0, -1.5F, 0.0F, -2.5F, 3, 0, 5, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.4F, 2.3249F, 2.1107F);
        this.Tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.0873F, 1.5708F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 35, -1.5F, 0.0F, -2.5F, 3, 0, 5, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 52, -1.0F, 0.0F, -0.6F, 1, 1, 5, 0.0F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.375F, 4.4F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0436F, 0.0F, 0.0F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.4F, -0.1925F, 8.037F);
        this.Tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.0873F, 1.5708F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 46, -4.5F, 0.0F, -8.0F, 9, 0, 16, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -0.0391F, 0.5469F);
        this.Tail3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 34, -1.0F, 0.0F, -0.6F, 1, 1, 6, -0.01F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 1.3F, -1.0F);
        this.Anchiornis.addChild(Body);
        this.setRotateAngle(Body, -0.4363F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 5, 55, -1.0F, -2.0F, -4.0F, 1, 1, 4, 0.001F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.1F, -0.5247F, -4.3845F);
        this.Body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 2.4609F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 67, 66, -0.5F, -2.3143F, -0.9861F, 1, 1, 2, -0.2F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.1F, -0.7515F, -3.0328F);
        this.Body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5236F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 9, 63, -0.5F, -0.9395F, -3.1919F, 1, 1, 3, -0.2F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.4F, -0.5F, 0.5F);
        this.Body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3927F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 38, 0, -0.5F, -1.5F, -0.5F, 1, 2, 1, 0.001F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.4F, -0.305F, -3.1162F);
        this.Body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.4363F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 58, 46, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.001F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.4F, -0.5F, -1.5F);
        this.Body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3054F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 7, 68, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.001F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(-0.5F, -1.625F, -3.7F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.48F, 0.0F, 0.0F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.3304F, -2.2231F);
        this.Chest.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 67, 62, -0.5F, -0.2074F, 0.0777F, 1, 1, 2, 0.03F, false));

        this.UpperArmL = new ModelRenderer(this);
        this.UpperArmL.setRotationPoint(1.15F, 2.1696F, -2.2731F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.671F, 0.0F, 0.0F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 32, 20, -1.4913F, -0.0326F, -0.9348F, 1, 1, 4, 0.0F, false));

        this.feathers2 = new ModelRenderer(this);
        this.feathers2.setRotationPoint(-0.8144F, -0.2244F, -1.2619F);
        this.UpperArmL.addChild(feathers2);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0231F, -5.0098F, -1.4788F);
        this.feathers2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.0036F, 0.0F, 3.1416F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 46, 46, 0.0F, -3.0F, -2.0F, 0, 6, 4, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0231F, -4.2608F, 6.4017F);
        this.feathers2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -2.1817F, 0.0F, 3.1416F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, 0.0F, -4.0F, -5.0F, 0, 8, 10, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0344F, -2.3242F, -0.2318F);
        this.feathers2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.5236F, 0.0F, -3.1416F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 31, 8, 0.0F, -3.0F, -2.5F, 0, 6, 5, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.1231F, -0.5582F, 2.8271F);
        this.feathers2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -3.1416F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 35, 46, 0.0F, -2.0F, -2.5F, 0, 4, 5, 0.0F, false));

        this.LowerArmL = new ModelRenderer(this);
        this.LowerArmL.setRotationPoint(-0.8144F, -0.2244F, 3.4881F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, 0.025F, 0.0F, 0.0F);


        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.0123F, -1.0271F, 0.1265F);
        this.LowerArmL.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -1.4835F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 63, -0.5857F, 1.0919F, 1.9098F, 1, 1, 3, -0.001F, false));

        this.feathers = new ModelRenderer(this);
        this.feathers.setRotationPoint(-0.2623F, -1.0271F, 0.1265F);
        this.LowerArmL.addChild(feathers);


        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0641F, 1.757F, 1.8291F);
        this.feathers.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -1.6581F, 0.0F, -3.1416F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 22, 0, 0.0F, -3.0F, -3.0F, 0, 6, 6, 0.0F, false));

        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.5877F, 2.8729F, -0.0735F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.7418F, 0.0F, 0.0F);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.HandL.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.5518F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 20, 27, -1.3757F, -0.8875F, -2.1057F, 1, 3, 1, -0.01F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.4007F, 1.6897F, -1.6975F);
        this.HandL.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 2.7207F, 0.0F, -3.1416F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 11, 0, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.HandL.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.4209F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 37, 6, -1.3757F, -1.4517F, -2.4795F, 1, 5, 1, 0.0F, false));

        this.HandwingL = new ModelRenderer(this);
        this.HandwingL.setRotationPoint(0.1F, 0.8F, 1.5F);
        this.HandL.addChild(HandwingL);
        this.setRotateAngle(HandwingL, 0.4363F, 0.0F, 0.0F);


        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.6692F, 1.856F, -0.0588F);
        this.HandwingL.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.3773F, 0.0F, -3.1416F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 0, 0.0F, -3.0F, -1.5F, 0, 6, 3, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5603F, 0.3876F, 2.049F);
        this.HandwingL.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -1.1973F, 0.0F, -3.1416F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 46, 0.0F, -4.0F, -2.0F, 0, 8, 4, 0.0F, false));

        this.UpperArmL2 = new ModelRenderer(this);
        this.UpperArmL2.setRotationPoint(-3.75F, -5.8304F, 3.7269F);
        this.Chest.addChild(UpperArmL2);
        this.setRotateAngle(UpperArmL2, -0.671F, -0.3793F, -0.0432F);


        this.feathers3 = new ModelRenderer(this);
        this.feathers3.setRotationPoint(0.8144F, -0.2244F, -1.2619F);
        this.UpperArmL2.addChild(feathers3);


        this.LowerArmL2 = new ModelRenderer(this);
        this.LowerArmL2.setRotationPoint(2.8269F, 5.235F, 0.8069F);
        this.UpperArmL2.addChild(LowerArmL2);
        this.setRotateAngle(LowerArmL2, 1.6237F, 0.2745F, 0.2631F);


        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.9139F, -3.5333F, 1.2741F);
        this.LowerArmL2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -1.4835F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 36, 63, -1.5139F, 1.0757F, 1.9081F, 1, 1, 3, -0.001F, false));

        this.feathers4 = new ModelRenderer(this);
        this.feathers4.setRotationPoint(1.1639F, -3.5333F, 1.2741F);
        this.LowerArmL2.addChild(feathers4);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(0.1141F, 0.3652F, 1.0664F);
        this.LowerArmL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 0.7418F, 0.0F, 0.0F);


        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.HandL2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.5518F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 35, 46, -0.7239F, -0.873F, -2.0983F, 1, 3, 1, -0.01F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.2F, 1.6738F, -1.7207F);
        this.HandL2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 2.7207F, 0.0F, 3.1416F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 23, 0, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.HandL2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.4209F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 64, 53, -0.7239F, -1.4382F, -2.4703F, 1, 5, 1, 0.0F, false));

        this.HandwingL2 = new ModelRenderer(this);
        this.HandwingL2.setRotationPoint(-0.4F, 0.8F, 1.5F);
        this.HandL2.addChild(HandwingL2);
        this.setRotateAngle(HandwingL2, 0.4363F, -0.0873F, 0.0F);


        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -1.0554F, -1.0731F);
        this.Chest.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.3491F, 0.0F, 0.0F);


        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.32F, -1.1156F);
        this.Neck1.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -1.2043F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 67, 58, -0.5F, -0.2168F, -1.6714F, 1, 1, 2, 0.001F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(-0.6F, 0.195F, -1.3906F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.6283F, 0.0F, 0.0F);


        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.6F, -3.1887F, -0.5295F);
        this.Neck2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -1.5359F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 27, 63, -0.5F, -0.0092F, -0.0184F, 1, 1, 3, 0.01F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.6F, -1.4377F, -1.0673F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.9163F, 0.0F, 0.0F);


        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -1.6627F, -1.8308F);
        this.Neck3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.7679F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 50, 67, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.3F, -2.6488F, -1.9332F);
        this.Neck3.addChild(head);
        this.setRotateAngle(head, -0.446F, -0.063F, 0.0301F);
        this.head.cubeList.add(new ModelBox(head, 41, 46, -1.5F, -0.2983F, -2.3488F, 2, 1, 2, -0.14F, false));
        this.head.cubeList.add(new ModelBox(head, 54, 59, -1.5F, -0.6983F, -2.0988F, 2, 1, 1, -0.1F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 40, -1.28F, -0.6983F, -2.0988F, 2, 1, 1, -0.3F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, -0.1983F, -4.0488F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1745F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 51, 46, -0.5F, -0.1735F, -0.8037F, 1, 1, 2, -0.15F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 4, 0, -0.5F, -0.1735F, 0.5463F, 1, 1, 1, -0.15F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -0.3983F, -3.0488F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.3229F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 4, 19, -1.0F, -0.1213F, 0.1239F, 1, 1, 1, -0.152F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -0.5983F, -2.2488F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.4276F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 33, 68, -1.5F, -0.1855F, -0.0982F, 2, 1, 1, -0.15F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.3F, 0.6017F, -2.1488F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0163F, 0.2091F, -0.0111F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 58, 59, -0.8F, -0.8999F, -2.6052F, 1, 1, 3, -0.15F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.1F, 0.0877F, -3.468F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0179F, 0.2181F, 0.0039F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 6, 63, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.3F, 0.1017F, -4.2679F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0179F, 0.2181F, 0.0039F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 58, 53, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.2F, -0.0262F, -2.6699F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0181F, 0.2618F, 0.0047F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 15, 63, -0.6F, -0.4F, -0.7F, 1, 1, 1, -0.3F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 15, 40, -0.6F, -0.4F, -0.3F, 1, 1, 1, -0.3F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.2F, -0.1983F, -0.6988F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.3491F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 24, 63, -0.5F, 0.0F, -0.5F, 1, 1, 1, -0.3F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 44, 57, -0.5F, -0.4F, -0.5F, 1, 1, 1, -0.3F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.5F, -0.6633F, -0.4319F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 1.0996F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 40, 69, -1.0F, -0.7374F, -0.8775F, 2, 1, 1, -0.15F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.5F, 0.0367F, -0.8319F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.2793F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 26, 68, -1.0F, -0.7F, -0.3F, 2, 1, 1, -0.16F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(-0.5F, -0.9106F, -1.606F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0436F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 12, 68, -1.0F, 0.2369F, -0.1782F, 2, 1, 1, -0.15F, false));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 19, 68, -1.0F, -0.1631F, -0.1782F, 2, 1, 1, -0.14F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(-0.1F, 0.5017F, -0.5488F);
        this.head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.1047F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 11, 6, -1.5F, -0.1005F, -1.6537F, 2, 1, 2, -0.15F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 45, 65, -1.0F, -0.1005F, -4.1182F, 1, 1, 2, -0.15F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.2F, 0.7995F, -3.9537F);
        this.Jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.1745F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 22, 13, -0.7671F, -0.9F, -0.1487F, 1, 1, 3, -0.15F, false));

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
