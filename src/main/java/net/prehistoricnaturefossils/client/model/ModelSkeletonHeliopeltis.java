package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHeliopeltis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Heliopeltis;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
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
    private final ModelRenderer IMMOVABLESPINE1;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer IMMOVABLESPINE2;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer IMMOVABLESPINE4;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer Thorax;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer Pygidium;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;

    public ModelSkeletonHeliopeltis() {
        this.textureWidth = 112;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(3.4155F, 23.0F, -4.7178F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 44, -9.4155F, -1.0F, -10.2822F, 14, 2, 8, 0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.4155F, 0.0F, -2.2822F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.6545F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -10.5F, -1.0F, -2.2F, 28, 2, 23, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(4.5845F, -0.5F, -10.2822F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.829F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 26, 0.0F, -0.5F, 0.0F, 18, 2, 8, -0.003F, false));

        this.Heliopeltis = new ModelRenderer(this);
        this.Heliopeltis.setRotationPoint(-2.4155F, -1.0F, -2.2822F);
        this.fossil.addChild(Heliopeltis);
        this.Heliopeltis.cubeList.add(new ModelBox(Heliopeltis, 0, 7, -4.0F, -1.0F, -4.0F, 8, 1, 1, -0.02F, false));
        this.Heliopeltis.cubeList.add(new ModelBox(Heliopeltis, 0, 0, -2.0F, -1.0F, -7.0F, 4, 1, 5, -0.01F, false));
        this.Heliopeltis.cubeList.add(new ModelBox(Heliopeltis, 0, 77, -4.0F, -1.0F, -5.5F, 8, 1, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.798F, -1.6331F, -3.6537F);
        this.Heliopeltis.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.213F, -0.5236F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.55F, -0.3743F, -0.4887F, 0, 1, 2, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.15F, -1.3F, -3.65F);
        this.Heliopeltis.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2139F, 0.6699F, 0.3365F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 17, 0.6285F, -0.1F, -0.8257F, 1, 1, 1, -0.003F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 16, 0.1285F, -0.1F, -0.8257F, 1, 1, 1, 0.0F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.2F, 0.0F, 0.0F);
        this.Heliopeltis.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5672F, -0.5236F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 17, -4.4F, -2.5F, -2.2F, 1, 1, 2, 0.0F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.3342F, -1.042F, -3.7571F);
        this.Heliopeltis.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.7663F, -0.8352F, -0.3114F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 5, 40, -0.7F, -0.5F, -0.4F, 1, 1, 1, -0.003F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(2.15F, -1.3F, -3.65F);
        this.Heliopeltis.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2139F, -0.6699F, -0.3365F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 17, -1.6285F, -0.1F, -0.8257F, 1, 1, 1, -0.003F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 16, -1.1285F, -0.1F, -0.8257F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Heliopeltis.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2182F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 37, -3.6857F, -1.0F, 0.3622F, 2, 1, 1, -0.03F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Heliopeltis.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2182F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 39, 37, 1.6857F, -1.0F, 0.3622F, 2, 1, 1, -0.03F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-4.9F, -11.3F, -4.25F);
        this.Heliopeltis.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.9163F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 56, 51, -0.4F, 10.95F, -1.7F, 7, 0, 14, 0.0F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.0F, -6.0F);
        this.Heliopeltis.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.6545F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 40, -1.1794F, -1.0F, -1.4395F, 1, 1, 1, -0.03F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 26, -2.7294F, -1.0F, -1.4395F, 2, 1, 2, -0.02F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 0.0F, -6.0F);
        this.Heliopeltis.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.6545F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 40, 0.1794F, -1.0F, -1.4395F, 1, 1, 1, -0.03F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 26, 0.7294F, -1.0F, -1.4395F, 2, 1, 2, -0.02F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(2.798F, -1.6331F, -3.6537F);
        this.Heliopeltis.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.213F, 0.5236F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.55F, -0.3743F, -0.4887F, 0, 1, 2, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(2.3342F, -1.042F, -3.7571F);
        this.Heliopeltis.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7663F, 0.8352F, 0.3114F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 5, 40, -0.3F, -0.5F, -0.4F, 1, 1, 1, -0.003F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.2F, 0.0F, 0.0F);
        this.Heliopeltis.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.5672F, 0.5236F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 17, 3.4F, -2.5F, -2.2F, 1, 1, 2, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Heliopeltis.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5672F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 37, 44, -1.0F, -3.4F, -2.9F, 2, 1, 2, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.2F, -2.2F);
        this.Heliopeltis.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1658F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 34, -1.0F, -0.5F, -3.8F, 2, 1, 4, 0.004F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(4.9F, -11.3F, -4.25F);
        this.Heliopeltis.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.9163F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 56, 51, -6.6F, 10.95F, -1.7F, 7, 0, 14, 0.0F, false));

        this.IMMOVABLESPINE1 = new ModelRenderer(this);
        this.IMMOVABLESPINE1.setRotationPoint(0.0F, -4.1F, 8.2F);
        this.Heliopeltis.addChild(IMMOVABLESPINE1);
        this.setRotateAngle(IMMOVABLESPINE1, -0.0873F, 0.0F, 0.0F);
        this.IMMOVABLESPINE1.cubeList.add(new ModelBox(IMMOVABLESPINE1, 57, 52, -0.5F, -0.0117F, -0.2482F, 1, 0, 4, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 2.0F, -9.7F);
        this.IMMOVABLESPINE1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3054F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 12, 39, -0.5F, 0.5614F, -1.1878F, 1, 1, 1, -0.01F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.1F, -5.1F);
        this.IMMOVABLESPINE1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2182F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 8, 17, -0.5F, -0.0359F, -0.0251F, 1, 0, 5, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 4.95F, -7.45F);
        this.IMMOVABLESPINE1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3491F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 30, 26, -0.5F, -2.85F, -1.5F, 1, 4, 2, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 37, 48, -0.5F, -2.85F, 0.5F, 1, 0, 3, 0.0F, false));

        this.IMMOVABLESPINE2 = new ModelRenderer(this);
        this.IMMOVABLESPINE2.setRotationPoint(8.05F, -2.7F, 6.15F);
        this.Heliopeltis.addChild(IMMOVABLESPINE2);
        this.setRotateAngle(IMMOVABLESPINE2, -0.1745F, 0.5236F, 0.0F);
        this.IMMOVABLESPINE2.cubeList.add(new ModelBox(IMMOVABLESPINE2, 50, 51, -0.5F, -0.0117F, -0.2482F, 1, 0, 4, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.1732F, 3.2365F, -10.1353F);
        this.IMMOVABLESPINE2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3065F, 0.0832F, 0.0263F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 18, 12, -0.4F, -0.5F, -0.5F, 1, 1, 1, -0.01F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.1F, -5.1F);
        this.IMMOVABLESPINE2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2182F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 16, -0.5F, -0.0359F, -0.0251F, 1, 0, 5, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 4.95F, -7.45F);
        this.IMMOVABLESPINE2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3491F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 9, 32, -0.5F, -2.85F, -1.5F, 1, 3, 2, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 14, 0, -0.5F, -2.85F, 0.5F, 1, 0, 3, 0.0F, false));

        this.IMMOVABLESPINE4 = new ModelRenderer(this);
        this.IMMOVABLESPINE4.setRotationPoint(-8.05F, -2.7F, 6.15F);
        this.Heliopeltis.addChild(IMMOVABLESPINE4);
        this.setRotateAngle(IMMOVABLESPINE4, -0.1745F, -0.5236F, 0.0F);
        this.IMMOVABLESPINE4.cubeList.add(new ModelBox(IMMOVABLESPINE4, 50, 43, -0.5F, -0.0117F, -0.2482F, 1, 0, 4, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.1732F, 3.2365F, -10.1353F);
        this.IMMOVABLESPINE4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3065F, -0.0832F, -0.0263F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 9, -0.6F, -0.5F, -0.5F, 1, 1, 1, -0.01F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.1F, -5.1F);
        this.IMMOVABLESPINE4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2182F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 10, 11, -0.5F, -0.0359F, -0.0251F, 1, 0, 5, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 4.95F, -7.45F);
        this.IMMOVABLESPINE4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3491F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 26, -0.5F, -2.85F, -1.5F, 1, 3, 4, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 18, 6, -0.5F, -2.85F, 2.5F, 1, 0, 1, 0.0F, false));

        this.Thorax = new ModelRenderer(this);
        this.Thorax.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.Heliopeltis.addChild(Thorax);
        this.setRotateAngle(Thorax, 0.0F, 0.0F, 0.0F);
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 10, -1.5F, -0.5F, -1.0F, 3, 1, 4, -0.02F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 50, 37, -0.5F, -0.75F, -1.0F, 1, 1, 4, -0.01F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-6.9F, -22.65F, -2.35F);
        this.Thorax.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -1.2217F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 58, 6.034F, 22.95F, -3.5794F, 11, 0, 10, 0.0F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-6.9F, -22.65F, -2.25F);
        this.Thorax.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -1.4835F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 62, 66, 2.2743F, 22.85F, -5.4424F, 4, 0, 8, 0.0F, true));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-6.9F, -22.65F, -2.35F);
        this.Thorax.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -1.3526F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 33, 66, 4.2829F, 22.9F, -4.6526F, 9, 0, 10, 0.0F, true));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(4.9F, -22.65F, -2.35F);
        this.Thorax.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 1.2217F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 58, -16.35F, 22.95F, -1.7F, 11, 0, 10, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(4.9F, -22.65F, -2.25F);
        this.Thorax.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 1.4835F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 62, 66, -6.1F, 22.85F, -3.45F, 4, 0, 8, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(4.9F, -22.65F, -2.35F);
        this.Thorax.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 1.3526F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 33, 66, -12.85F, 22.9F, -2.7F, 9, 0, 10, 0.0F, false));

        this.Pygidium = new ModelRenderer(this);
        this.Pygidium.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Thorax.addChild(Pygidium);
        this.setRotateAngle(Pygidium, 0.0F, 0.0F, 0.0F);
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 27, 37, -0.5F, 0.45F, 3.0F, 1, 0, 20, 0.0F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 30, 37, -1.0F, -0.5F, -1.0F, 2, 1, 4, -0.03F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-6.9F, -22.6F, -5.25F);
        this.Pygidium.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.3927F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 26, 7.9478F, 23.05F, 3.4346F, 6, 0, 17, 0.0F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-6.9F, -22.6F, -5.45F);
        this.Pygidium.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.8727F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 50, 37, 7.8856F, 22.95F, -1.4821F, 10, 0, 13, 0.0F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(4.9F, -22.6F, -5.45F);
        this.Pygidium.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.8727F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 50, 37, -16.6F, 22.95F, 0.05F, 10, 0, 13, 0.0F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(4.9F, -22.6F, -5.25F);
        this.Pygidium.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.3927F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 26, -12.1F, 23.05F, 4.2F, 6, 0, 17, 0.0F, false));

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
