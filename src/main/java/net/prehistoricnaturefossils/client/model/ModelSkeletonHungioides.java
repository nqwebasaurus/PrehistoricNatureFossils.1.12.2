package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHungioides extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Hungioides;
    private final ModelRenderer Cephalon;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer Thorax1;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer Thorax2;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer Thorax3;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer Thorax4;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer Thorax5;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer Pygidium;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer Thorax6;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer Pygidium2;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;

    public ModelSkeletonHungioides() {
        this.textureWidth = 176;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-4.0F, 23.0F, -4.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.4618F, -0.5F, 3.3947F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1309F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 34, -11.3F, -0.5F, -13.2F, 17, 2, 31, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(17.7495F, -0.5F, 21.2972F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.5934F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 68, -21.5002F, -0.5F, 0.0258F, 22, 2, 16, -0.004F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(24.4527F, -0.5F, 4.2176F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.0873F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -26.7F, -0.5F, -13.2F, 22, 2, 31, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.2554F, -0.5F, -14.3496F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.9163F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 66, 34, -13.4F, -0.5F, -6.8F, 22, 2, 26, -0.003F, false));

        this.Hungioides = new ModelRenderer(this);
        this.Hungioides.setRotationPoint(3.0F, -2.25F, 0.0F);
        this.fossil.addChild(Hungioides);
        this.setRotateAngle(Hungioides, 0.0F, 0.5672F, 0.0F);


        this.Cephalon = new ModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.1F, -6.0F);
        this.Hungioides.addChild(Cephalon);
        this.setRotateAngle(Cephalon, 0.1309F, 0.0F, 0.0F);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 76, 13, -4.0F, -0.9F, -8.0F, 8, 2, 8, 0.001F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 66, 34, -2.5F, -1.45F, -7.0F, 5, 1, 7, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 61, 73, 2.25F, -1.45F, -4.0F, 2, 1, 3, -0.001F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 61, 68, -4.25F, -1.45F, -4.0F, 2, 1, 3, -0.001F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0463F, -0.4246F, -0.2811F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 41, -7.5117F, -1.5885F, 2.8F, 1, 1, 4, -0.001F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0971F, -1.1213F, -0.3496F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 0, -4.9617F, -1.5885F, 1.15F, 1, 1, 3, -0.001F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0589F, -0.7732F, -0.3032F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 8, -6.0617F, -1.5885F, 2.2F, 1, 1, 3, -0.001F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0463F, 0.4246F, 0.2811F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 50, 6.5117F, -1.5885F, 2.8F, 1, 1, 4, -0.001F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0971F, 1.1213F, 0.3496F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 76, 0, 3.9617F, -1.5885F, 1.15F, 1, 1, 3, -0.001F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0589F, 0.7732F, 0.3032F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 76, 5, 5.0617F, -1.5885F, 2.2F, 1, 1, 3, -0.001F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0421F, 0.0113F, -0.2616F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 61, 68, -9.7117F, -1.5885F, -3.0F, 6, 1, 11, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Cephalon.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0421F, -0.0113F, 0.2616F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 76, 0, 3.7117F, -1.5885F, -3.0F, 6, 1, 11, 0.0F, false));

        this.Thorax1 = new ModelRenderer(this);
        this.Thorax1.setRotationPoint(0.0F, 0.2F, -6.0F);
        this.Hungioides.addChild(Thorax1);
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 19, 87, -2.5F, -0.9F, -0.5F, 5, 2, 4, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.1F, 7.8F);
        this.Thorax1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0349F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 68, -1.5F, -2.2F, -8.4F, 3, 1, 4, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.9F, 8.0F);
        this.Thorax1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.2182F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 23, -9.15F, -2.1F, -8.0F, 8, 0, 6, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.9F, 8.0F);
        this.Thorax1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.2182F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 85, 68, 1.15F, -2.1F, -8.0F, 8, 0, 6, 0.0F, false));

        this.Thorax2 = new ModelRenderer(this);
        this.Thorax2.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Thorax1.addChild(Thorax2);
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 38, 87, -2.5F, -0.9F, 0.0F, 5, 2, 3, -0.001F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.1F, 4.3F);
        this.Thorax2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0349F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 72, 88, -1.5F, -2.2F, -4.4F, 3, 1, 3, -0.001F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.9F, 4.5F);
        this.Thorax2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.2182F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 34, -9.05F, -2.0F, -5.0F, 8, 0, 6, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.9F, 4.5F);
        this.Thorax2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.2182F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 71, 81, 1.05F, -2.0F, -5.0F, 8, 0, 6, 0.0F, false));

        this.Thorax3 = new ModelRenderer(this);
        this.Thorax3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Thorax2.addChild(Thorax3);
        this.setRotateAngle(Thorax3, 0.0F, 0.0873F, 0.0F);
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 55, 87, -2.5F, -0.9F, 0.0F, 5, 2, 3, -0.002F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.1F, 1.3F);
        this.Thorax3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0349F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 79, -1.5F, -2.2F, -1.4F, 3, 1, 3, -0.002F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.9F, 1.5F);
        this.Thorax3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.2182F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 16, -8.95F, -1.9F, -2.0F, 8, 0, 6, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.9F, 1.5F);
        this.Thorax3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.2182F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 76, 24, 0.95F, -1.9F, -2.0F, 8, 0, 6, 0.0F, false));

        this.Thorax4 = new ModelRenderer(this);
        this.Thorax4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Thorax3.addChild(Thorax4);
        this.setRotateAngle(Thorax4, 0.0F, 0.0873F, 0.0F);
        this.Thorax4.cubeList.add(new ModelBox(Thorax4, 0, 59, -2.5F, -0.9F, 0.0F, 5, 2, 3, -0.003F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.1F, -1.7F);
        this.Thorax4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0349F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 17, 59, -1.5F, -2.2F, 1.6F, 3, 1, 3, -0.003F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.9F, -1.5F);
        this.Thorax4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.2182F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, -8.85F, -1.8F, 1.0F, 7, 0, 7, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.9F, -1.5F);
        this.Thorax4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.2182F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 8, 1.85F, -1.8F, 1.0F, 7, 0, 7, 0.0F, false));

        this.Thorax5 = new ModelRenderer(this);
        this.Thorax5.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.Thorax4.addChild(Thorax5);
        this.setRotateAngle(Thorax5, 0.0F, 0.0873F, 0.0F);
        this.Thorax5.cubeList.add(new ModelBox(Thorax5, 0, 74, -2.5F, -0.4F, 0.0F, 5, 2, 2, -0.004F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.6F, -4.7F);
        this.Thorax5.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0349F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 66, 57, -1.5F, -2.2F, 4.6F, 3, 1, 1, -0.004F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.4F, -4.5F);
        this.Thorax5.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.2182F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 66, 43, -6.95F, -1.7F, 4.0F, 6, 0, 6, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 1.4F, -4.5F);
        this.Thorax5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.2182F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 66, 50, 0.95F, -1.7F, 4.0F, 6, 0, 6, 0.0F, false));

        this.Pygidium = new ModelRenderer(this);
        this.Pygidium.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax5.addChild(Pygidium);
        this.setRotateAngle(Pygidium, 0.0F, 0.1309F, 0.0F);


        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.9F, -6.5F);
        this.Pygidium.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0843F, -0.0226F, -0.2608F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 41, -4.55F, -1.65F, 6.5F, 5, 0, 8, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.9F, -6.5F);
        this.Pygidium.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0843F, 0.0226F, 0.2608F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 50, -0.45F, -1.65F, 6.5F, 5, 0, 8, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.6F, -6.5F);
        this.Pygidium.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0873F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 87, -1.5F, -2.45F, 6.0F, 3, 2, 6, 0.0F, false));

        this.Thorax6 = new ModelRenderer(this);
        this.Thorax6.setRotationPoint(-4.0F, -2.15F, 25.0F);
        this.fossil.addChild(Thorax6);
        this.setRotateAngle(Thorax6, 0.0F, 2.5307F, 0.0F);
        this.Thorax6.cubeList.add(new ModelBox(Thorax6, 0, 74, -2.5F, -0.4F, 0.0F, 5, 2, 2, -0.004F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.6F, -4.7F);
        this.Thorax6.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0349F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 66, 57, -1.5F, -2.2F, 4.6F, 3, 1, 1, -0.004F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 1.4F, -4.5F);
        this.Thorax6.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, -0.2182F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 66, 43, -6.95F, -1.7F, 4.0F, 6, 0, 6, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 1.4F, -4.5F);
        this.Thorax6.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, 0.2182F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 66, 50, 0.95F, -1.7F, 4.0F, 6, 0, 6, 0.0F, false));

        this.Pygidium2 = new ModelRenderer(this);
        this.Pygidium2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax6.addChild(Pygidium2);
        this.setRotateAngle(Pygidium2, 0.0F, 0.1309F, 0.0F);


        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.9F, -6.5F);
        this.Pygidium2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0843F, -0.0226F, -0.2608F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 41, -4.55F, -1.65F, 6.5F, 5, 0, 8, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.9F, -6.5F);
        this.Pygidium2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0843F, 0.0226F, 0.2608F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 50, -0.45F, -1.65F, 6.5F, 5, 0, 8, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 1.6F, -6.5F);
        this.Pygidium2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0873F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 87, -1.5F, -2.45F, 6.0F, 3, 2, 6, 0.0F, false));

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
