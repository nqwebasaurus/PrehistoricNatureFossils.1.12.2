package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDoryaspis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Doryaspis;
    private final ModelRenderer Head;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer BrachialPlateL_NOANIMATION;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer BrachialPlateL_NOANIMATION2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer Head2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer BrachialPlateL_NOANIMATION3;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer BrachialPlateL_NOANIMATION4;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer Head3;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer BrachialPlateL_NOANIMATION5;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer BrachialPlateL_NOANIMATION6;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r29;
    private final ModelRenderer Doryaspis2;
    private final ModelRenderer Head4;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer BrachialPlateL_NOANIMATION7;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer BrachialPlateL_NOANIMATION8;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer cube_r38;

    public ModelSkeletonDoryaspis() {
        this.textureWidth = 128;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-17.0F, 24.0F, -2.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 32, -9.0F, -2.0F, -19.0F, 13, 2, 31, -0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, 4.0F, -2.0F, -10.0F, 33, 2, 29, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 58, 32, 37.0F, -2.0F, -6.0F, 7, 2, 25, -0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 41, 77, 21.0F, -2.0F, -18.0F, 14, 2, 8, -0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(21.0F, 0.0F, -18.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.6109F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 66, -14.0F, -2.0F, 0.0F, 14, 2, 8, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(35.0F, 0.0F, -18.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3054F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 73, 77, -4.0F, -2.0F, 0.0F, 4, 2, 13, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-9.0F, 0.0F, 12.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.4974F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 66, 0.0F, -2.0F, -9.0F, 15, 2, 9, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(4.0F, 0.0F, -19.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.6109F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 78, -6.0F, -2.0F, 0.0F, 6, 2, 11, -0.005F, false));

        this.Doryaspis = new ModelRenderer(this);
        this.Doryaspis.setRotationPoint(6.4F, -2.5F, -0.4F);
        this.fossil.addChild(Doryaspis);
        this.setRotateAngle(Doryaspis, 0.0F, -0.0436F, 0.0F);
        this.Doryaspis.cubeList.add(new ModelBox(Doryaspis, 0, 19, -1.5F, 0.2F, -1.4F, 3, 3, 6, 0.0F, false));
        this.Doryaspis.cubeList.add(new ModelBox(Doryaspis, 16, 43, -0.5F, -0.05F, -1.4F, 1, 1, 6, -0.01F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 2.1F, -1.0F);
        this.Doryaspis.addChild(Head);
        this.setRotateAngle(Head, 0.0F, 0.1745F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 14, 10, -0.5F, -1.9F, -14.0F, 1, 1, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 18, 0, -1.5F, -2.0F, -9.0F, 3, 2, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -2.5F, -2.0F, -7.0F, 5, 2, 7, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.9F, -7.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 10, -1.5F, -0.1102F, 0.0248F, 3, 1, 7, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.1F, -5.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4119F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 51, -1.5F, -1.0F, -5.0F, 3, 1, 3, -0.01F, false));

        this.BrachialPlateL_NOANIMATION = new ModelRenderer(this);
        this.BrachialPlateL_NOANIMATION.setRotationPoint(1.8F, -1.35F, 0.0F);
        this.Head.addChild(BrachialPlateL_NOANIMATION);
        this.setRotateAngle(BrachialPlateL_NOANIMATION, 0.0F, 0.0F, -0.2007F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(3.2F, 0.0F, 0.0F);
        this.BrachialPlateL_NOANIMATION.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0873F, 0.3403F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 58, 32, -0.05F, 0.02F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.7F, -0.5F, -1.5F);
        this.BrachialPlateL_NOANIMATION.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.2025F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 56, -0.5F, 0.0F, 0.5F, 3, 1, 1, -0.01F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.7F, -0.5F, -2.0F);
        this.BrachialPlateL_NOANIMATION.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.4102F, 0.2025F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 7, 35, -0.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.BrachialPlateL_NOANIMATION2 = new ModelRenderer(this);
        this.BrachialPlateL_NOANIMATION2.setRotationPoint(-1.9F, -1.35F, 0.0F);
        this.Head.addChild(BrachialPlateL_NOANIMATION2);
        this.setRotateAngle(BrachialPlateL_NOANIMATION2, 0.0F, 0.0F, 0.2182F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.2F, 0.0F, 0.0F);
        this.BrachialPlateL_NOANIMATION2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.0873F, -0.3403F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 57, -2.95F, 0.02F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.7F, -0.5F, -1.5F);
        this.BrachialPlateL_NOANIMATION2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.2025F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 32, -2.5F, 0.0F, 0.5F, 3, 1, 1, -0.01F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.7F, -0.5F, -2.0F);
        this.BrachialPlateL_NOANIMATION2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.4102F, -0.2025F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 56, -2.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.Head2 = new ModelRenderer(this);
        this.Head2.setRotationPoint(27.6F, 2.1F, 3.8F);
        this.Doryaspis.addChild(Head2);
        this.setRotateAngle(Head2, 0.0F, -2.7489F, 0.0F);
        this.Head2.cubeList.add(new ModelBox(Head2, 14, 10, -0.5F, -1.9F, -14.0F, 1, 1, 5, 0.0F, false));
        this.Head2.cubeList.add(new ModelBox(Head2, 18, 0, -1.5F, -2.0F, -9.0F, 3, 2, 2, 0.0F, false));
        this.Head2.cubeList.add(new ModelBox(Head2, 0, 0, -2.5F, -2.0F, -7.0F, 5, 2, 7, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.9F, -7.0F);
        this.Head2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0175F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 10, -1.5F, -0.1102F, 0.0248F, 3, 1, 7, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.1F, -5.0F);
        this.Head2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4119F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 51, -1.5F, -1.0F, -5.0F, 3, 1, 3, -0.01F, false));

        this.BrachialPlateL_NOANIMATION3 = new ModelRenderer(this);
        this.BrachialPlateL_NOANIMATION3.setRotationPoint(1.8F, -1.35F, 0.0F);
        this.Head2.addChild(BrachialPlateL_NOANIMATION3);
        this.setRotateAngle(BrachialPlateL_NOANIMATION3, 0.0F, 0.0F, -0.2007F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(3.2F, 0.0F, 0.0F);
        this.BrachialPlateL_NOANIMATION3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0873F, 0.3403F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 58, 32, -0.05F, 0.02F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.7F, -0.5F, -1.5F);
        this.BrachialPlateL_NOANIMATION3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.2025F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 12, 56, -0.5F, 0.0F, 0.5F, 3, 1, 1, -0.01F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.7F, -0.5F, -2.0F);
        this.BrachialPlateL_NOANIMATION3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.4102F, 0.2025F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 7, 35, -0.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.BrachialPlateL_NOANIMATION4 = new ModelRenderer(this);
        this.BrachialPlateL_NOANIMATION4.setRotationPoint(-1.9F, -1.35F, 0.0F);
        this.Head2.addChild(BrachialPlateL_NOANIMATION4);
        this.setRotateAngle(BrachialPlateL_NOANIMATION4, 0.0F, 0.0F, 0.2182F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-3.2F, 0.0F, 0.0F);
        this.BrachialPlateL_NOANIMATION4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.0873F, -0.3403F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 57, -2.95F, 0.02F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.7F, -0.5F, -1.5F);
        this.BrachialPlateL_NOANIMATION4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.2025F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 7, 32, -2.5F, 0.0F, 0.5F, 3, 1, 1, -0.01F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.7F, -0.5F, -2.0F);
        this.BrachialPlateL_NOANIMATION4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.4102F, -0.2025F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 21, 56, -2.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.Head3 = new ModelRenderer(this);
        this.Head3.setRotationPoint(8.9421F, 2.1F, 7.6802F);
        this.Doryaspis.addChild(Head3);
        this.setRotateAngle(Head3, 0.1082F, -0.2535F, -0.1027F);
        this.Head3.cubeList.add(new ModelBox(Head3, 14, 10, -0.5F, -1.9F, -14.0F, 1, 1, 5, 0.0F, false));
        this.Head3.cubeList.add(new ModelBox(Head3, 18, 0, -1.5F, -2.0F, -9.0F, 3, 2, 2, 0.0F, false));
        this.Head3.cubeList.add(new ModelBox(Head3, 0, 0, -2.5F, -2.0F, -7.0F, 5, 2, 7, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -1.9F, -7.0F);
        this.Head3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0175F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 10, -1.5F, -0.1102F, 0.0248F, 3, 1, 7, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.1F, -5.0F);
        this.Head3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.4119F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 14, 51, -1.5F, -1.0F, -5.0F, 3, 1, 3, -0.01F, false));

        this.BrachialPlateL_NOANIMATION5 = new ModelRenderer(this);
        this.BrachialPlateL_NOANIMATION5.setRotationPoint(1.8F, -1.35F, 0.0F);
        this.Head3.addChild(BrachialPlateL_NOANIMATION5);
        this.setRotateAngle(BrachialPlateL_NOANIMATION5, 0.0F, 0.0F, -0.2007F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(3.2F, 0.0F, 0.0F);
        this.BrachialPlateL_NOANIMATION5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0873F, 0.3403F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 58, 32, -0.05F, 0.02F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.7F, -0.5F, -1.5F);
        this.BrachialPlateL_NOANIMATION5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.2025F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 12, 56, -0.5F, 0.0F, 0.5F, 3, 1, 1, -0.01F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.7F, -0.5F, -2.0F);
        this.BrachialPlateL_NOANIMATION5.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.4102F, 0.2025F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 7, 35, -0.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.BrachialPlateL_NOANIMATION6 = new ModelRenderer(this);
        this.BrachialPlateL_NOANIMATION6.setRotationPoint(-1.9F, -1.35F, 0.0F);
        this.Head3.addChild(BrachialPlateL_NOANIMATION6);
        this.setRotateAngle(BrachialPlateL_NOANIMATION6, 0.0F, 0.0F, 0.2182F);


        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-3.2F, 0.0F, 0.0F);
        this.BrachialPlateL_NOANIMATION6.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.0873F, -0.3403F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 57, -2.95F, 0.02F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.7F, -0.5F, -1.5F);
        this.BrachialPlateL_NOANIMATION6.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.2025F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 7, 32, -2.5F, 0.0F, 0.5F, 3, 1, 1, -0.01F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.7F, -0.5F, -2.0F);
        this.BrachialPlateL_NOANIMATION6.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.4102F, -0.2025F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 21, 56, -2.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Doryaspis.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0F, -0.3054F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 13, 32, -1.0F, 0.4F, 0.0F, 2, 2, 6, 0.0F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 7, 41, -0.5F, 0.15F, 0.0F, 1, 1, 6, -0.01F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.3F, 0.8F, 4.0F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0F, -0.2618F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 19, 23, -0.5F, -0.5F, 2.0F, 1, 1, 3, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.2329F, 3.0F, -9.1307F);
        this.Tail2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 1.5708F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 32, -3.4F, -3.2671F, 13.1307F, 0, 7, 6, 0.0F, false));

        this.Doryaspis2 = new ModelRenderer(this);
        this.Doryaspis2.setRotationPoint(30.4F, -2.5F, -11.0F);
        this.fossil.addChild(Doryaspis2);
        this.setRotateAngle(Doryaspis2, 0.0F, 1.309F, 0.0F);
        this.Doryaspis2.cubeList.add(new ModelBox(Doryaspis2, 0, 19, -1.5F, 0.2F, -1.4F, 3, 3, 6, 0.0F, false));
        this.Doryaspis2.cubeList.add(new ModelBox(Doryaspis2, 16, 43, -0.5F, -0.05F, -1.4F, 1, 1, 6, -0.01F, false));

        this.Head4 = new ModelRenderer(this);
        this.Head4.setRotationPoint(0.0F, 2.1F, -0.5F);
        this.Doryaspis2.addChild(Head4);
        this.setRotateAngle(Head4, 0.0F, 0.7418F, 0.0F);
        this.Head4.cubeList.add(new ModelBox(Head4, 14, 10, -0.5F, -1.9F, -14.0F, 1, 1, 5, 0.0F, false));
        this.Head4.cubeList.add(new ModelBox(Head4, 18, 0, -1.5F, -2.0F, -9.0F, 3, 2, 2, 0.0F, false));
        this.Head4.cubeList.add(new ModelBox(Head4, 0, 0, -2.5F, -2.0F, -7.0F, 5, 2, 7, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -1.9F, -7.0F);
        this.Head4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0175F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 10, -1.5F, -0.1102F, 0.0248F, 3, 1, 7, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.1F, -5.0F);
        this.Head4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.4119F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 14, 51, -1.5F, -1.0F, -5.0F, 3, 1, 3, -0.01F, false));

        this.BrachialPlateL_NOANIMATION7 = new ModelRenderer(this);
        this.BrachialPlateL_NOANIMATION7.setRotationPoint(1.8F, -1.35F, 0.0F);
        this.Head4.addChild(BrachialPlateL_NOANIMATION7);
        this.setRotateAngle(BrachialPlateL_NOANIMATION7, 0.0F, 0.0F, -0.2007F);


        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(3.2F, 0.0F, 0.0F);
        this.BrachialPlateL_NOANIMATION7.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0873F, 0.3403F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 58, 32, -0.05F, 0.02F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.7F, -0.5F, -1.5F);
        this.BrachialPlateL_NOANIMATION7.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, 0.2025F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 12, 56, -0.5F, 0.0F, 0.5F, 3, 1, 1, -0.01F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.7F, -0.5F, -2.0F);
        this.BrachialPlateL_NOANIMATION7.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.4102F, 0.2025F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 7, 35, -0.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.BrachialPlateL_NOANIMATION8 = new ModelRenderer(this);
        this.BrachialPlateL_NOANIMATION8.setRotationPoint(-1.9F, -1.35F, 0.0F);
        this.Head4.addChild(BrachialPlateL_NOANIMATION8);
        this.setRotateAngle(BrachialPlateL_NOANIMATION8, 0.0F, 0.0F, 0.2182F);


        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-3.2F, 0.0F, 0.0F);
        this.BrachialPlateL_NOANIMATION8.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.0873F, -0.3403F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 57, -2.95F, 0.02F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.7F, -0.5F, -1.5F);
        this.BrachialPlateL_NOANIMATION8.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -0.2025F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 7, 32, -2.5F, 0.0F, 0.5F, 3, 1, 1, -0.01F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.7F, -0.5F, -2.0F);
        this.BrachialPlateL_NOANIMATION8.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.4102F, -0.2025F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 21, 56, -2.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Doryaspis2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0F, -0.8727F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 13, 32, -1.0F, 0.4F, 0.0F, 2, 2, 6, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 7, 41, -0.5F, 0.15F, 0.0F, 1, 1, 6, -0.01F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(1.8F, 0.8F, 4.1F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0F, -0.7854F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 19, 23, -0.5F, -0.5F, 2.0F, 1, 1, 3, 0.0F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.2329F, 3.0F, -9.1307F);
        this.Tail4.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, 1.5708F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 32, -3.4F, -3.2671F, 13.1307F, 0, 7, 6, 0.0F, false));

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
