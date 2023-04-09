package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTurboscinetes extends ModelBase {
    private final ModelRenderer Fossil;
    private final ModelRenderer Turboscinetes;
    private final ModelRenderer Head;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Jaw;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Body1;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer PectoralL;
    private final ModelRenderer Body2;
    private final ModelRenderer VentralL;
    private final ModelRenderer VentralR;
    private final ModelRenderer Body3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer Body4;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer Body5;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;

    public ModelSkeletonTurboscinetes() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.Fossil = new ModelRenderer(this);
        this.Fossil.setRotationPoint(5.0F, 22.3F, -5.0F);
        this.Fossil.cubeList.add(new ModelBox(Fossil, 0, 18, -6.0F, 0.7F, -10.0F, 11, 1, 13, 0.003F, false));
        this.Fossil.cubeList.add(new ModelBox(Fossil, 57, 10, -2.0F, 0.7F, 2.0F, 6, 1, 8, 0.01F, false));
        this.Fossil.cubeList.add(new ModelBox(Fossil, 49, 0, -3.0F, 0.7F, 8.0F, 6, 1, 8, -0.01F, false));
        this.Fossil.cubeList.add(new ModelBox(Fossil, 36, 20, -7.0F, 0.7F, 9.0F, 6, 1, 13, 0.01F, false));
        this.Fossil.cubeList.add(new ModelBox(Fossil, 0, 33, -16.0F, 0.7F, 9.0F, 9, 1, 14, -0.01F, false));
        this.Fossil.cubeList.add(new ModelBox(Fossil, 0, 74, -22.0F, 0.7F, 9.0F, 9, 1, 14, 0.0F, false));
        this.Fossil.cubeList.add(new ModelBox(Fossil, 39, 47, -23.0F, 0.7F, 3.5F, 11, 1, 8, 0.03F, false));
        this.Fossil.cubeList.add(new ModelBox(Fossil, 0, 49, -22.0F, 0.7F, -1.0F, 9, 1, 8, -0.01F, false));
        this.Fossil.cubeList.add(new ModelBox(Fossil, 0, 0, -22.0F, 0.7F, -12.0F, 16, 1, 16, 0.01F, false));
        this.Fossil.cubeList.add(new ModelBox(Fossil, 33, 35, -10.0F, 0.7F, -6.7F, 8, 1, 10, 0.0F, false));
        this.Fossil.cubeList.add(new ModelBox(Fossil, 27, 57, -13.0F, 0.7F, 4.0F, 4, 1, 8, 0.0F, false));
        this.Fossil.cubeList.add(new ModelBox(Fossil, 27, 57, -9.0F, 0.7F, 3.2F, 4, 1, 8, -0.003F, false));
        this.Fossil.cubeList.add(new ModelBox(Fossil, 27, 57, -5.0F, 0.7F, 3.2F, 4, 1, 8, -0.003F, false));
        this.Fossil.cubeList.add(new ModelBox(Fossil, 27, 57, -5.0F, 0.7F, 4.0F, 4, 1, 8, 0.0F, false));
        this.Fossil.cubeList.add(new ModelBox(Fossil, 27, 57, -9.0F, 0.7F, 4.0F, 4, 1, 8, 0.0F, false));

        this.Turboscinetes = new ModelRenderer(this);
        this.Turboscinetes.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Fossil.addChild(Turboscinetes);
        this.setRotateAngle(Turboscinetes, 0.0F, 0.0F, -1.5708F);


        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.3F, -8.0F, -3.0F);
        this.Turboscinetes.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 33, -0.8F, -4.0F, -3.0F, 0, 8, 4, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 6.0F, -0.1F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.8552F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 67, -0.9F, -2.9592F, -3.0207F, 0, 3, 3, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.3F, -5.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.0734F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.9F, 0.469F, 0.9969F, 0, 1, 1, -0.001F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 35, -0.9F, -0.031F, -0.0031F, 0, 1, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 3.0F, -3.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 18, -0.9F, -1.3F, -1.7F, 0, 1, 3, 0.01F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.4F, -4.5F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 53, 57, -0.9F, 0.0F, 0.0F, 0, 3, 2, 0.011F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.0F, -3.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.9425F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 59, -0.9F, -3.0F, 0.0F, 0, 3, 2, -0.01F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.0F, -3.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5236F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 67, -0.9F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.7F, -1.0406F, -2.5496F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 3.1416F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 67, -0.09F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.7F, -3.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.6109F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 18, -0.9F, 0.0F, -1.8F, 0, 1, 2, 0.0F, false));

        this.Body1 = new ModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 59, -0.8F, -6.0F, -0.9F, 0, 11, 4, 0.01F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 6.0F, -1.0F);
        this.Body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 57, -0.9F, -2.0F, -0.1F, 0, 2, 4, 0.01F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -6.3F, -0.8F);
        this.Body1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2793F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 60, 57, -0.9F, 0.1F, -0.3F, 0, 2, 4, 0.0F, false));

        this.PectoralL = new ModelRenderer(this);
        this.PectoralL.setRotationPoint(-0.7F, 3.5F, -0.3F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, -0.6109F, 0.0F, 0.0F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 67, 28, 0.0F, -1.575F, -1.1651F, 0, 2, 2, 0.0F, false));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -0.8F, -6.0F, -1.0F, 0, 11, 4, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 56, 10, -0.9F, 4.5F, -0.2F, 0, 2, 3, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 36, 49, -0.9F, -7.2F, -0.2F, 0, 2, 3, 0.01F, false));

        this.VentralL = new ModelRenderer(this);
        this.VentralL.setRotationPoint(-0.9F, 5.9F, 1.4F);
        this.Body2.addChild(VentralL);
        this.setRotateAngle(VentralL, -1.0703F, 0.0206F, -0.0213F);
        this.VentralL.cubeList.add(new ModelBox(VentralL, 62, 28, 0.0F, -1.4F, 0.0F, 0, 2, 2, 0.0F, false));

        this.VentralR = new ModelRenderer(this);
        this.VentralR.setRotationPoint(-1.0F, 5.9F, 1.4F);
        this.Body2.addChild(VentralR);
        this.setRotateAngle(VentralR, -0.5993F, -0.5459F, 0.3509F);


        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 9, 0, -0.8F, -5.0F, -0.3F, 0, 9, 3, -0.01F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 6.5F, -0.2F);
        this.Body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2443F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 49, -0.9F, -3.0F, 0.0F, 0, 3, 3, -0.01F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -7.3F, -0.1F);
        this.Body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.7156F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 18, -0.91F, -6.8F, 0.0F, 0, 7, 4, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -7.3F, -0.1F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4887F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 67, -0.9F, 0.1F, -0.1F, 0, 3, 4, 0.0F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.7F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 33, 35, -0.8F, -2.0F, -1.0F, 0, 4, 4, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -5.5F, -13.9F);
        this.Body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.9076F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 18, -1.4F, 17.9F, -0.3F, 0, 5, 5, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 5.7F, 0.6F);
        this.Body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.9774F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 27, 49, -1.4F, -3.1216F, -0.0014F, 0, 3, 4, -0.01F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -5.5F, 0.5F);
        this.Body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.9076F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 60, 35, -1.4F, 0.0F, 0.1F, 0, 3, 4, -0.01F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 62, 20, -1.5F, 0.0F, 0.7F, 0, 3, 4, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -7.3F, -2.8F);
        this.Body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.7156F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 59, -0.9F, -4.0F, 3.8F, 0, 4, 4, 0.0F, false));

        this.Body5 = new ModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 49, 10, -0.8F, -1.0F, -1.0F, 0, 2, 3, 0.02F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 52, 57, -0.899F, -5.0F, 1.0F, 0, 10, 7, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -5.5F, -16.9F);
        this.Body5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.9076F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 18, -1.4F, 17.9F, 4.7F, 0, 2, 2, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -7.3F, -5.8F);
        this.Body5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.7156F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 9, 33, -0.9F, -2.0F, 7.8F, 0, 3, 2, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.1F, -5.5F, -2.5F);
        this.Body5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.9076F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 9, 39, -1.0F, 0.0F, 4.3F, 0, 3, 2, 0.01F, false));

    }

    public void renderAll(float f) {
        this.Fossil.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
