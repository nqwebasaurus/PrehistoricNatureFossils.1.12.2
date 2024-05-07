package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSclerodus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Sclerodus;
    private final ModelRenderer Head;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Leftside;
    private final ModelRenderer cube_r8;
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
    private final ModelRenderer Rightside;
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

    public ModelSkeletonSclerodus() {
        this.textureWidth = 96;
        this.textureHeight = 78;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 35, 58, -13.0F, -2.0F, -10.0F, 15, 2, 6, -0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-12.3944F, -4.0F, 5.7423F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 63, 0, -3.5F, -1.0F, -9.0F, 7, 3, 9, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-13.2202F, -3.5F, 9.6263F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.6981F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 67, 0.184F, -1.5F, -2.0093F, 5, 3, 6, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-7.0F, 0.0F, -21.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.9163F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 62, -27.9F, -6.0F, 2.7F, 6, 4, 11, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-13.0F, 0.0F, -10.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.9163F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 21, -17.0F, -3.0F, 0.0F, 7, 3, 21, 0.003F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 21, -10.0F, -2.0F, 0.0F, 10, 2, 17, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(2.0F, 0.0F, -10.0F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.9163F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 41, 13.0F, -3.0F, 10.0F, 9, 3, 13, -0.003F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 46, 15.0F, -4.0F, 0.0F, 7, 2, 13, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, -2.0F, 0.0F, 22, 2, 18, 0.007F, false));

        this.Sclerodus = new ModelRenderer(this);
        this.Sclerodus.setRotationPoint(0.0F, 1.3F, 0.0F);
        this.fossil.addChild(Sclerodus);


        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-1.7F, -3.0F, 0.0F);
        this.Sclerodus.addChild(Head);
        this.setRotateAngle(Head, 0.0F, -0.3054F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 7, -0.5F, -1.1F, -8.25F, 1, 1, 5, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.1F, -7.95F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2269F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, -0.022F, -0.0299F, 1, 1, 5, -0.01F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.1F, 0.1F, -2.75F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 1.5708F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 21, -0.0839F, -1.0F, 0.0328F, 5, 1, 4, 0.001F, false));

        this.Leftside = new ModelRenderer(this);
        this.Leftside.setRotationPoint(0.0F, -1.1F, -7.95F);
        this.Head.addChild(Leftside);
        this.Leftside.cubeList.add(new ModelBox(Leftside, 36, 21, -0.5401F, 0.2F, -0.6224F, 1, 1, 3, -0.002F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.2F, 0.2F, -0.5F);
        this.Leftside.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.0742F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 26, -1.0401F, 0.0F, -0.0224F, 1, 1, 3, -0.001F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(4.3F, 0.2F, 12.7F);
        this.Leftside.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -2.0988F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 63, 15, 2.0227F, 0.5F, -0.3939F, 1, 0, 1, -0.001F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 37, 55, 0.8227F, 0.5F, -0.3939F, 1, 0, 1, -0.001F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 27, -0.2773F, 0.5F, -0.3939F, 1, 0, 1, -0.001F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 37, 46, 0.0227F, 0.0F, 0.0061F, 3, 1, 1, -0.001F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(5.4F, 0.2F, 10.0F);
        this.Leftside.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -1.9766F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 56, 0.1376F, 0.5F, -0.449F, 1, 0, 1, -0.002F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 64, 1.3376F, 0.5F, -0.449F, 1, 0, 1, -0.002F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 49, -0.0624F, 0.0F, -0.049F, 3, 1, 1, -0.002F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(5.6F, 0.2F, 7.0F);
        this.Leftside.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -1.645F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 47, 52, -0.2558F, 0.5F, -0.4719F, 1, 0, 1, -0.001F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 4, 57, 0.8442F, 0.5F, -0.4719F, 1, 0, 1, -0.001F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 57, 1.9442F, 0.5F, -0.4719F, 1, 0, 1, -0.001F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 46, 46, -0.0558F, 0.0F, -0.0719F, 3, 1, 1, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(4.8F, 0.2F, 4.1F);
        this.Leftside.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -1.2959F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 46, -0.4475F, 0.5F, -0.5547F, 1, 0, 1, -0.002F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 62, 0.6525F, 0.5F, -0.5547F, 1, 0, 1, -0.002F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 64, 1.7525F, 0.5F, -0.5547F, 1, 0, 1, -0.002F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 46, -0.0475F, 0.0F, -0.0547F, 3, 1, 1, -0.001F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(2.0F, 0.2F, 4.9F);
        this.Leftside.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.8072F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 14, -0.0575F, 0.0F, -0.9667F, 4, 1, 1, -0.002F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(3.5F, 0.2F, 1.3F);
        this.Leftside.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.528F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 5, -2.8605F, 0.5F, -0.563F, 1, 0, 1, -0.001F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(3.5F, 0.2F, 1.3F);
        this.Leftside.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.5629F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 10, 27, -1.7605F, 0.5F, -0.563F, 1, 0, 1, -0.001F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(3.5F, 0.2F, 1.3F);
        this.Leftside.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.7723F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 16, -0.6605F, 0.5F, -0.463F, 1, 0, 1, -0.001F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(3.5F, 0.2F, 1.3F);
        this.Leftside.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -1.1388F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 49, 0.4395F, 0.5F, -0.663F, 1, 0, 1, -0.001F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 5, 62, 1.5395F, 0.5F, -0.663F, 1, 0, 1, -0.001F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 21, 0.0395F, 0.0F, 0.937F, 1, 1, 1, -0.001F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 45, 28, 2.0395F, 0.0F, 0.937F, 1, 1, 1, -0.001F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 39, 0.0395F, 0.0F, -0.063F, 3, 1, 1, -0.002F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 42, 21, 0.0395F, 0.0F, 1.937F, 3, 1, 1, -0.001F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(4.2F, 0.2F, 5.7F);
        this.Leftside.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.685F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 7, -0.2494F, 0.0F, -0.2694F, 1, 1, 1, -0.003F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(1.5F, 0.0F, -0.3F);
        this.Leftside.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.6501F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 27, -0.4F, 0.2F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -0.739F, 3.2695F);
        this.Leftside.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2325F, 0.0066F, 0.1164F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 46, -0.0719F, 0.3203F, -0.3239F, 2, 1, 2, 0.003F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 37, -0.0719F, 0.0203F, -0.3239F, 2, 1, 2, -0.001F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 34, -0.0719F, 0.0203F, -3.0239F, 2, 1, 3, 0.0F, false));

        this.Rightside = new ModelRenderer(this);
        this.Rightside.setRotationPoint(0.0F, -1.1F, -7.95F);
        this.Head.addChild(Rightside);
        this.Rightside.cubeList.add(new ModelBox(Rightside, 8, 0, -0.4599F, 0.2F, -0.6224F, 1, 1, 3, -0.002F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.2F, 0.2F, -0.5F);
        this.Rightside.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0742F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 8, 7, 0.0401F, 0.0F, -0.0224F, 1, 1, 3, -0.001F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-4.3F, 0.2F, 12.7F);
        this.Rightside.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 2.0988F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 29, 64, -3.0227F, 0.5F, -0.3939F, 1, 0, 1, -0.001F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 24, 62, -1.8227F, 0.5F, -0.3939F, 1, 0, 1, -0.001F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 29, 62, -0.7227F, 0.5F, -0.3939F, 1, 0, 1, -0.001F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 55, -3.0227F, 0.0F, 0.0061F, 3, 1, 1, -0.001F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-5.4F, 0.2F, 10.0F);
        this.Rightside.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 1.9766F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 34, 62, -1.1376F, 0.5F, -0.449F, 1, 0, 1, -0.002F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 63, 0, -2.3376F, 0.5F, -0.449F, 1, 0, 1, -0.002F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 50, -2.9376F, 0.0F, -0.049F, 3, 1, 1, -0.002F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-5.6F, 0.2F, 7.0F);
        this.Rightside.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 1.645F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 52, 52, -0.7442F, 0.5F, -0.4719F, 1, 0, 1, -0.001F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 8, 55, -2.9442F, 0.5F, -0.4719F, 1, 0, 1, -0.001F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 24, 64, -1.8442F, 0.5F, -0.4719F, 1, 0, 1, -0.001F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 28, 49, -2.9442F, 0.0F, -0.0719F, 3, 1, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-4.8F, 0.2F, 4.1F);
        this.Rightside.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 1.2959F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 63, 2, -0.5525F, 0.5F, -0.5547F, 1, 0, 1, -0.002F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 63, 4, -1.6525F, 0.5F, -0.5547F, 1, 0, 1, -0.002F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 8, 52, -2.7525F, 0.5F, -0.5547F, 1, 0, 1, -0.002F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 37, 49, -2.9525F, 0.0F, -0.0547F, 3, 1, 1, -0.001F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.0F, 0.2F, 4.9F);
        this.Rightside.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.8072F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 36, 31, -3.9425F, 0.0F, -0.9667F, 4, 1, 1, -0.002F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-3.5F, 0.2F, 1.3F);
        this.Rightside.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.528F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 3, 1.8605F, 0.5F, -0.563F, 1, 0, 1, -0.001F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-3.5F, 0.2F, 1.3F);
        this.Rightside.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.5629F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 10, 0.7605F, 0.5F, -0.563F, 1, 0, 1, -0.001F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-3.5F, 0.2F, 1.3F);
        this.Rightside.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.7723F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 42, 52, -0.3395F, 0.5F, -0.463F, 1, 0, 1, -0.001F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-3.5F, 0.2F, 1.3F);
        this.Rightside.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 1.1388F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 63, 6, -1.4395F, 0.5F, -0.663F, 1, 0, 1, -0.001F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 63, 13, -2.5395F, 0.5F, -0.663F, 1, 0, 1, -0.001F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 37, 52, -1.0395F, 0.0F, 0.937F, 1, 1, 1, -0.001F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 47, 31, -3.0395F, 0.0F, 0.937F, 1, 1, 1, -0.001F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 52, -3.0395F, 0.0F, -0.063F, 3, 1, 1, -0.002F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 53, -3.0395F, 0.0F, 1.937F, 3, 1, 1, -0.001F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-4.2F, 0.2F, 5.7F);
        this.Rightside.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.685F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 45, 34, -0.7506F, 0.0F, -0.2694F, 1, 1, 1, -0.003F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.5F, 0.0F, -0.3F);
        this.Rightside.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.6501F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 32, -2.6F, 0.2F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -0.739F, 3.2695F);
        this.Rightside.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2325F, -0.0066F, -0.1164F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 43, 24, -1.9281F, 0.3203F, -0.3239F, 2, 1, 2, 0.003F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 36, 34, -1.9281F, 0.0203F, -0.3239F, 2, 1, 2, -0.001F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 10, 29, -1.9281F, 0.0203F, -3.0239F, 2, 1, 3, 0.0F, false));

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
