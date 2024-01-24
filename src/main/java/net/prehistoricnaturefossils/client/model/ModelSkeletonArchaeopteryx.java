package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonArchaeopteryx extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Anchiornis;
    private final ModelRenderer Basin_r1;
    private final ModelRenderer Basin_r2;
    private final ModelRenderer Basin_r3;
    private final ModelRenderer Basin_r4;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer UpperLegR;
    private final ModelRenderer cube_r3;
    private final ModelRenderer LowerLegR;
    private final ModelRenderer cube_r4;
    private final ModelRenderer FootR;
    private final ModelRenderer cube_r5;
    private final ModelRenderer ToesR;
    private final ModelRenderer cube_r6;
    private final ModelRenderer clawR;
    private final ModelRenderer cube_r7;
    private final ModelRenderer UpperLegL;
    private final ModelRenderer cube_r8;
    private final ModelRenderer LowerLegL;
    private final ModelRenderer cube_r9;
    private final ModelRenderer FootL;
    private final ModelRenderer cube_r10;
    private final ModelRenderer ToesL;
    private final ModelRenderer cube_r11;
    private final ModelRenderer clawL;
    private final ModelRenderer cube_r12;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer Body;
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
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r30;
    private final ModelRenderer UpperArmR;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer feathers3;
    private final ModelRenderer LowerArmR;
    private final ModelRenderer cube_r34;
    private final ModelRenderer feathers4;
    private final ModelRenderer cube_r35;
    private final ModelRenderer HandR;
    private final ModelRenderer HandwingR;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer HandsR;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer UpperArmR2;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer feathers2;
    private final ModelRenderer LowerArmR2;
    private final ModelRenderer cube_r44;
    private final ModelRenderer feathers5;
    private final ModelRenderer cube_r45;
    private final ModelRenderer HandR2;
    private final ModelRenderer HandwingR2;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer HandsR2;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer Neck1;
    private final ModelRenderer cube_r51;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r55;
    private final ModelRenderer head;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer Jaw;

    public ModelSkeletonArchaeopteryx() {
        this.textureWidth = 192;
        this.textureHeight = 83;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -23.0F, -13.2F, -20.0F, 44, 2, 52, 0.0F, false));

        this.Anchiornis = new ModelRenderer(this);
        this.Anchiornis.setRotationPoint(0.2F, -12.9F, 1.7F);
        this.fossil.addChild(Anchiornis);
        this.setRotateAngle(Anchiornis, -0.1745F, 0.0F, 1.5708F);


        this.Basin_r1 = new ModelRenderer(this);
        this.Basin_r1.setRotationPoint(-0.3F, 3.0996F, 6.2584F);
        this.Anchiornis.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.4538F, 0.0F, 0.0F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 0, 75, -0.4F, -1.368F, 0.3799F, 1, 1, 1, -0.2F, false));
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 17, 48, -0.4F, -0.8096F, -0.6201F, 1, 1, 2, -0.2F, false));

        this.Basin_r2 = new ModelRenderer(this);
        this.Basin_r2.setRotationPoint(-0.3F, 0.8521F, 5.3093F);
        this.Anchiornis.addChild(Basin_r2);
        this.setRotateAngle(Basin_r2, -0.576F, 0.0F, 0.0F);
        this.Basin_r2.cubeList.add(new ModelBox(Basin_r2, 40, 41, -0.5F, 0.6F, -2.1F, 1, 1, 4, -0.2F, false));
        this.Basin_r2.cubeList.add(new ModelBox(Basin_r2, 24, 48, -0.5F, -0.1F, -1.0F, 1, 1, 2, -0.2F, false));

        this.Basin_r3 = new ModelRenderer(this);
        this.Basin_r3.setRotationPoint(-0.4F, -0.3896F, 2.9306F);
        this.Anchiornis.addChild(Basin_r3);
        this.setRotateAngle(Basin_r3, -0.0175F, 0.0F, 0.0F);
        this.Basin_r3.cubeList.add(new ModelBox(Basin_r3, 31, 48, -0.5F, 0.4F, -0.2F, 1, 1, 2, -0.1F, false));
        this.Basin_r3.cubeList.add(new ModelBox(Basin_r3, 43, 33, -0.4F, -0.5F, -0.9F, 1, 1, 3, 0.01F, false));

        this.Basin_r4 = new ModelRenderer(this);
        this.Basin_r4.setRotationPoint(-0.5F, -0.8695F, 1.1929F);
        this.Anchiornis.addChild(Basin_r4);
        this.setRotateAngle(Basin_r4, 0.0698F, 0.0F, 0.0F);
        this.Basin_r4.cubeList.add(new ModelBox(Basin_r4, 65, 66, -0.2F, 0.1F, -1.8F, 1, 1, 6, 0.01F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.4F, -1.6053F, -9.3547F);
        this.Anchiornis.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.0472F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 0, -1.1F, 0.0F, -1.9F, 1, 0, 4, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.4F, 3.3096F, -5.9132F);
        this.Anchiornis.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -3.1416F, 0.7418F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 41, -2.8F, 0.0F, -3.0F, 5, 0, 6, 0.0F, false));

        this.UpperLegR = new ModelRenderer(this);
        this.UpperLegR.setRotationPoint(0.1F, 0.8F, 3.7F);
        this.Anchiornis.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, 0.9599F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.9F, -0.6F);
        this.UpperLegR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 5, -1.0F, -0.4F, 1.05F, 1, 6, 1, 0.0F, false));

        this.LowerLegR = new ModelRenderer(this);
        this.LowerLegR.setRotationPoint(-0.4F, 4.8F, -2.5F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.7854F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.9444F, 1.4305F);
        this.LowerLegR.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.384F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 73, -0.2F, -4.0F, -1.4F, 0, 8, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 72, -0.5F, -4.0F, -0.5F, 1, 8, 1, -0.001F, false));

        this.FootR = new ModelRenderer(this);
        this.FootR.setRotationPoint(0.1F, 6.5316F, 2.6769F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, -0.2182F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootR.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6283F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 65, 64, -0.5F, -0.1F, -0.6F, 1, 3, 1, -0.002F, false));

        this.ToesR = new ModelRenderer(this);
        this.ToesR.setRotationPoint(0.0F, 2.25F, -2.15F);
        this.FootR.addChild(ToesR);
        this.setRotateAngle(ToesR, 1.0908F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ToesR.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 27, -0.4F, -0.3F, -3.75F, 2, 1, 4, 0.0F, false));

        this.clawR = new ModelRenderer(this);
        this.clawR.setRotationPoint(-0.25F, -0.25F, 0.0F);
        this.ToesR.addChild(clawR);
        this.setRotateAngle(clawR, 0.6109F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.75F, 1.75F);
        this.clawR.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 39, 0.1F, -1.3F, -3.75F, 0, 2, 2, 0.0F, false));

        this.UpperLegL = new ModelRenderer(this);
        this.UpperLegL.setRotationPoint(0.5F, -0.8F, 5.4F);
        this.Anchiornis.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 2.2689F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.6203F, -2.7567F);
        this.UpperLegL.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.0036F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 13, -1.0F, -3.9F, -0.5F, 1, 5, 1, 0.0F, false));

        this.LowerLegL = new ModelRenderer(this);
        this.LowerLegL.setRotationPoint(-0.5F, 1.8F, -4.2F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.1309F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLegL.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4712F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 55, 72, -0.5F, -0.8F, -0.3F, 1, 8, 1, -0.001F, false));

        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 6.15F, 3.55F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, -0.6109F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FootL.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6283F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 13, -0.5F, -0.1F, -0.6F, 1, 5, 1, -0.002F, false));

        this.ToesL = new ModelRenderer(this);
        this.ToesL.setRotationPoint(0.0F, 3.35F, -2.75F);
        this.FootL.addChild(ToesL);
        this.setRotateAngle(ToesL, 1.309F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ToesL.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0524F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 42, -0.6F, -0.3F, -3.75F, 2, 1, 4, 0.0F, false));

        this.clawL = new ModelRenderer(this);
        this.clawL.setRotationPoint(0.65F, -0.25F, 0.0F);
        this.ToesL.addChild(clawL);
        this.setRotateAngle(clawL, 0.5672F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.75F, 1.75F);
        this.clawL.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 31, 0, -1.0F, -1.3F, -3.75F, 0, 2, 2, 0.0F, false));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(-0.9F, -0.1F, 3.5F);
        this.Anchiornis.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0F, 0.8378F, -1.5708F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 0.4F, 3.7F);
        this.Tail1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.0873F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 34, -3.5F, 0.1F, -3.0F, 7, 0, 6, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5211F, 0.9F, 3.9479F);
        this.Tail1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.0436F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 0, 0.0F, -0.7F, -2.6F, 1, 1, 5, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(-1.2F, -0.15F, 6.9F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0873F, -0.0435F, 0.0038F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0015F, -0.0174F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 34, -3.9992F, 0.65F, -0.6F, 7, 0, 7, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0698F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 56, 64, -1.0F, 0.3F, -0.6F, 1, 1, 6, 0.0F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.5F, 5.5F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0328F, -0.3866F, -0.0505F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.8212F, -0.1847F, 6.5859F);
        this.Tail3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1272F, -0.0442F, 0.004F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -5.8F, 0.0F, -7.1F, 9, 0, 12, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0997F, 0.5246F, 3.4158F);
        this.Tail3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1299F, 0.046F, -0.0075F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 39, 55, -0.5F, -0.5F, -3.5F, 1, 1, 7, -0.01F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 1.3F, -1.0F);
        this.Anchiornis.addChild(Body);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.3F, -1.0176F, -3.8683F);
        this.Body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5672F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 7, 55, -0.3F, -0.5F, -2.0F, 1, 1, 4, 0.001F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.3F, 1.2726F, -1.9177F);
        this.Body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4363F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 20, 55, -0.3F, -1.4F, -2.8F, 1, 1, 4, 0.001F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, -0.8265F, 3.0649F);
        this.Body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.7854F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 6, 0.5F, -0.6555F, -1.1607F, 0, 1, 1, 0.001F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.9F, -0.8265F, 3.0649F);
        this.Body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.0908F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, 0.5F, -0.5504F, -0.3231F, 0, 1, 1, 0.001F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.8F, -0.4265F, 1.9649F);
        this.Body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.9599F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 13, 0.5F, -0.6555F, -1.1607F, 0, 1, 1, 0.001F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.9F, -0.4265F, 1.9649F);
        this.Body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -1.2654F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 38, 48, 0.5F, -0.5504F, -0.3231F, 0, 1, 2, 0.001F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.8F, -0.0265F, 0.7649F);
        this.Body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -1.2217F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 5, 13, 0.5F, -0.6555F, -1.1607F, 0, 1, 1, 0.001F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.9F, -0.0265F, 0.7649F);
        this.Body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.5272F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 46, 0, 0.5F, -0.5504F, -0.3231F, 0, 1, 2, 0.001F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.9F, 0.2027F, -0.2404F);
        this.Body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -1.3963F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 47, 27, 0.5F, -0.3F, -0.6F, 0, 1, 2, 0.001F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.8F, -0.0634F, -0.379F);
        this.Body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -1.0908F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 7, 6, 0.5F, -0.5F, -2.2F, 0, 1, 2, 0.001F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, -1.9F, -1.5F);
        this.Body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1309F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 33, 55, -0.2F, -0.3F, -2.0F, 1, 1, 4, 0.001F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(-0.5F, -3.0F, -4.0F);
        this.Body.addChild(Chest);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.5F, -0.5F);
        this.Chest.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.4363F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 39, 64, -0.2F, -0.5F, -0.7F, 1, 1, 2, 0.0F, false));

        this.UpperArmR = new ModelRenderer(this);
        this.UpperArmR.setRotationPoint(0.0F, 6.5F, 0.4F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, -0.0436F, 0.0F, 0.0F);


        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.1386F, -0.5475F, 0.8548F);
        this.UpperArmR.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1745F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 19, 42, -0.2F, -0.6F, -1.2F, 1, 1, 2, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.1386F, -1.0073F, 0.6583F);
        this.UpperArmR.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.5236F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 29, 13, -0.3F, -0.7F, -1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.1386F, -0.2291F, 3.7238F);
        this.UpperArmR.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0436F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 6, -0.2F, -0.5F, -1.5F, 1, 1, 4, 0.0F, false));

        this.feathers3 = new ModelRenderer(this);
        this.feathers3.setRotationPoint(-0.3614F, -0.7291F, 2.9738F);
        this.UpperArmR.addChild(feathers3);
        this.setRotateAngle(feathers3, -0.5236F, 0.0F, 0.0F);


        this.LowerArmR = new ModelRenderer(this);
        this.LowerArmR.setRotationPoint(0.8886F, 1.0709F, 5.9738F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, -1.1781F, 0.0F, 0.0F);


        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -0.4F, -0.2F);
        this.LowerArmR.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -1.4835F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 56, 55, -1.1F, -0.75F, -0.25F, 1, 1, 7, -0.2F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 39, 64, -1.1F, 0.05F, -0.25F, 1, 1, 7, -0.2F, false));

        this.feathers4 = new ModelRenderer(this);
        this.feathers4.setRotationPoint(-0.75F, 2.6F, -0.2F);
        this.LowerArmR.addChild(feathers4);
        this.setRotateAngle(feathers4, 0.9164F, -0.0032F, 0.0245F);


        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0549F, -2.0188F, 5.9949F);
        this.feathers4.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -1.3963F, -0.0168F, -0.006F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 19, 13, -0.2F, -3.9F, -4.5F, 0, 11, 9, 0.0F, false));

        this.HandR = new ModelRenderer(this);
        this.HandR.setRotationPoint(-0.6F, 5.0F, 0.1F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 1.4835F, 0.0436F, 0.0F);


        this.HandwingR = new ModelRenderer(this);
        this.HandwingR.setRotationPoint(-0.7F, 0.8F, 1.5F);
        this.HandR.addChild(HandwingR);
        this.setRotateAngle(HandwingR, -0.7005F, 0.0514F, 0.1813F);


        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(1.3146F, 4.129F, 5.9309F);
        this.HandwingR.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -2.0665F, 0.0122F, -0.1594F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 38, 7, -0.2F, -6.5F, -2.3F, 0, 13, 6, 0.0F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.HandwingR.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -1.5952F, 0.0389F, -0.1356F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 26, 55, -0.75F, -13.1127F, -0.6518F, 0, 13, 6, 0.0F, false));

        this.HandsR = new ModelRenderer(this);
        this.HandsR.setRotationPoint(0.0F, 1.1F, -0.7F);
        this.HandR.addChild(HandsR);
        this.setRotateAngle(HandsR, -0.3894F, -0.0925F, 0.235F);


        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandsR.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.3337F, 0.0956F, -0.1667F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 42, -0.375F, 0.15F, -2.5F, 0, 4, 2, 0.0F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandsR.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.5518F, 0.0956F, -0.1667F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 22, 34, -0.4F, 0.15F, -0.75F, 1, 4, 1, -0.01F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandsR.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.4209F, 0.0956F, -0.1667F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 39, 73, -0.4F, -0.6F, -1.0F, 1, 7, 1, 0.0F, false));

        this.UpperArmR2 = new ModelRenderer(this);
        this.UpperArmR2.setRotationPoint(0.0F, 1.9F, -2.4F);
        this.Chest.addChild(UpperArmR2);
        this.setRotateAngle(UpperArmR2, 1.4835F, 0.0F, 0.0F);


        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.3386F, 0.5475F, 0.8548F);
        this.UpperArmR2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1745F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 56, 58, -0.3F, -0.4F, -1.2F, 1, 1, 2, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.3386F, 1.0073F, 0.6583F);
        this.UpperArmR2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.5236F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 43, 47, -0.4F, -0.3F, -1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.3386F, 0.2291F, 3.7238F);
        this.UpperArmR2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0436F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 0, -0.3F, -0.5F, -1.5F, 1, 1, 4, 0.0F, false));

        this.feathers2 = new ModelRenderer(this);
        this.feathers2.setRotationPoint(-0.3614F, 0.7291F, 2.9738F);
        this.UpperArmR2.addChild(feathers2);
        this.setRotateAngle(feathers2, 0.5236F, 0.0F, 0.0F);


        this.LowerArmR2 = new ModelRenderer(this);
        this.LowerArmR2.setRotationPoint(0.8886F, -1.0709F, 5.9738F);
        this.UpperArmR2.addChild(LowerArmR2);
        this.setRotateAngle(LowerArmR2, 1.1781F, 0.0F, 0.0F);


        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.4F, -0.2F);
        this.LowerArmR2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 1.4835F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 10, 13, -1.2F, -0.25F, -0.25F, 1, 1, 7, -0.2F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 42, -1.2F, -1.05F, -0.25F, 1, 1, 7, -0.2F, false));

        this.feathers5 = new ModelRenderer(this);
        this.feathers5.setRotationPoint(-0.75F, -2.6F, -0.2F);
        this.LowerArmR2.addChild(feathers5);
        this.setRotateAngle(feathers5, -0.9163F, -0.0351F, 0.0171F);


        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0022F, 3.056F, 4.3913F);
        this.feathers5.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 1.2042F, 0.0348F, -0.003F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 13, 0.1F, -6.7F, -4.4F, 0, 11, 9, 0.0F, false));

        this.HandR2 = new ModelRenderer(this);
        this.HandR2.setRotationPoint(-0.6F, -5.0F, 0.1F);
        this.LowerArmR2.addChild(HandR2);
        this.setRotateAngle(HandR2, -1.4835F, 0.0436F, 0.0F);


        this.HandwingR2 = new ModelRenderer(this);
        this.HandwingR2.setRotationPoint(-0.8F, -0.8F, 1.5F);
        this.HandR2.addChild(HandwingR2);
        this.setRotateAngle(HandwingR2, 0.6565F, 0.0402F, -0.1679F);


        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(1.3146F, -4.129F, 0.4309F);
        this.HandwingR2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 1.8916F, 0.0441F, 0.137F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 55, -0.4426F, -0.2844F, -4.5203F, 0, 13, 6, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(0.8157F, -1.5377F, 5.7784F);
        this.HandwingR2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 1.4207F, 0.0389F, 0.1356F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 13, 55, 0.0F, -6.2F, -3.5F, 0, 13, 6, 0.0F, false));

        this.HandsR2 = new ModelRenderer(this);
        this.HandsR2.setRotationPoint(0.0F, -1.1F, -0.7F);
        this.HandR2.addChild(HandsR2);
        this.setRotateAngle(HandsR2, 0.5678F, -0.0167F, -0.2547F);


        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandsR2.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.3337F, 0.0956F, 0.1667F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 34, -0.375F, -4.15F, -2.5F, 0, 4, 2, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandsR2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.5518F, 0.0956F, 0.1667F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 55, -0.4F, -4.15F, -0.75F, 1, 4, 1, -0.01F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandsR2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.4209F, 0.0956F, 0.1667F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 44, 73, -0.4F, -6.4F, -1.0F, 1, 7, 1, 0.0F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.4F, 0.9F, -1.5F);
        this.Chest.addChild(Neck1);


        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -1.7705F, 1.0F);
        this.Neck1.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -1.7628F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 49, 64, -0.5F, -0.4F, -1.5F, 1, 1, 3, 0.001F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.5053F, 0.117F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.9948F, 0.0F, 0.0F);


        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, -2.8939F, -1.4129F);
        this.Neck2.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -3.0281F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 7, 0, -0.5F, -0.8F, -0.3F, 1, 2, 1, -0.011F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, -5.5397F, -0.7297F);
        this.Neck2.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -2.2951F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 13, -0.3F, -0.4F, -1.0F, 0, 2, 4, 0.0F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, -2.9197F, -2.0957F);
        this.Neck2.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -2.4696F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 71, 62, -0.5F, -0.1F, -2.7F, 1, 1, 2, 0.01F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -2.4428F, -2.3397F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -1.9199F, 0.0F, 0.0F);


        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, -0.9441F, -3.4248F);
        this.Neck3.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.0524F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 66, 55, -0.5F, -0.7F, -2.4F, 1, 1, 3, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5F, -1.8F, -5.35F);
        this.Neck3.addChild(head);
        this.setRotateAngle(head, 0.7156F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 49, 55, -1.0F, -0.4F, -2.0F, 2, 2, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 72, 55, -1.0F, 0.15F, -2.2F, 2, 1, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 39, 68, -1.18F, 0.15F, -2.2F, 2, 1, 1, -0.15F, false));
        this.head.cubeList.add(new ModelBox(head, 55, 64, -1.18F, 0.45F, -1.0F, 2, 1, 1, -0.15F, false));
        this.head.cubeList.add(new ModelBox(head, 27, 55, -1.18F, 0.45F, -3.8F, 1, 1, 1, -0.15F, false));
        this.head.cubeList.add(new ModelBox(head, 5, 75, -1.18F, 0.45F, -3.2F, 1, 1, 1, -0.15F, false));
        this.head.cubeList.add(new ModelBox(head, 74, 59, -1.39F, 0.15F, -2.2F, 2, 1, 1, -0.35F, false));
        this.head.cubeList.add(new ModelBox(head, 74, 69, -1.0F, 0.6F, -3.0F, 2, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 29, 18, -1.0F, 0.6F, -4.5F, 1, 1, 2, 0.0F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.6F, -5.1F);
        this.head.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.1309F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 39, 7, -1.0F, 0.0566F, 0.5662F, 1, 1, 1, -0.002F, false));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 72, 74, -1.0F, 0.0566F, 1.3162F, 1, 1, 1, -0.001F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(0.5F, -0.4F, -3.0F);
        this.head.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.6545F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 65, 74, -1.5F, 0.6841F, -0.5022F, 2, 1, 1, -0.002F, false));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 74, 66, -1.5F, 0.6841F, -0.2522F, 2, 1, 1, 0.0F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.39F, 0.95F, -4.2F);
        this.head.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.1309F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 10, 75, -1.0F, -0.7F, -0.2F, 1, 1, 1, -0.35F, false));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 40, 55, -1.0F, -0.7F, -0.5F, 1, 1, 1, -0.35F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.5F, 1.1F, 0.0F);
        this.head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.096F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 31, 7, -1.5F, 0.0F, -3.0F, 2, 1, 3, 0.005F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 58, 55, -1.5F, 0.0F, -3.975F, 1, 1, 1, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 14, 55, -1.5F, 0.0F, -4.475F, 1, 1, 1, -0.02F, false));

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
