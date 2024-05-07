package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGosfordia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer main;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r14;
    private final ModelRenderer Head;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer Eyes;
    private final ModelRenderer Jaw;
    private final ModelRenderer cube_r19;
    private final ModelRenderer BackRightFin;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer FrontRightFin;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;

    public ModelSkeletonGosfordia() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(3.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -10.0F, -2.0F, -10.0F, 11, 2, 19, 0.008F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 22, -2.0F, -2.0F, -1.0F, 7, 2, 19, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(3.6F, 0.0F, -2.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.7592F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 52, -3.0547F, -2.0F, 0.053F, 5, 2, 5, -0.006F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(2.2F, 0.0F, -10.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.4137F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 44, -0.0329F, -2.0F, -0.0939F, 8, 2, 5, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-6.0F, 0.0F, -14.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.4014F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 44, 0.0F, -2.0F, 0.2F, 9, 2, 5, -0.006F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-6.0F, 0.0F, -13.6F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 9, -5.0F, -2.0F, -0.2F, 5, 2, 3, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-8.0F, 0.0F, 14.4F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.3403F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 22, -0.0566F, -2.0F, -6.0031F, 9, 2, 6, 0.003F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, 0.0F, 18.0F);
        this.fossil.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 1.0385F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 31, 0.0F, -2.0F, -7.0F, 7, 2, 7, -0.006F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -5.0F, -0.5F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.0F, 0.0F, 1.5708F);


        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(3.3F, 1.2F, 0.0F);
        this.main.addChild(Body);
        this.setRotateAngle(Body, -2.9234F, 0.0F, 3.1416F);
        this.Body.cubeList.add(new ModelBox(Body, 42, 0, -1.4F, -3.0F, -4.5F, 2, 6, 9, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -4.2F, -4.525F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1222F, 0.0F, -3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 58, 36, 0.0F, -1.0F, 0.0F, 0, 2, 5, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.4F, -3.0F, 0.5F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 44, -1.0F, -0.25F, -5.075F, 2, 1, 8, -0.01F, false));

        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(-1.15F, 0.0F, -4.5F);
        this.Body.addChild(Tail);
        this.setRotateAngle(Tail, -0.1745F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 0, -0.25F, -1.6F, -4.675F, 2, 3, 5, -0.001F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(1.55F, 2.05F, -2.025F);
        this.Tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 0, 0.0F, -1.5F, -2.0F, 0, 3, 4, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.55F, -3.2F, -2.025F);
        this.Tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 22, 0.0F, -2.0F, -2.0F, 0, 4, 4, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.75F, -2.0F, -3.0F);
        this.Tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4363F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 4, 31, -1.0F, -0.3F, -1.6F, 2, 2, 5, -0.002F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.75F, 3.0F, 0.0F);
        this.Tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3316F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 52, -1.0F, -2.018F, -4.955F, 2, 2, 5, -0.002F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(1.05F, 0.0F, -4.75F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 24, 44, -1.4F, -1.1F, -1.925F, 2, 2, 2, 0.01F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -0.7F, -0.775F);
        this.Tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -3.1416F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 59, 59, 0.0F, -4.5F, -1.5F, 0, 9, 3, 0.0F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.1F, 0.0F, -2.2F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 11, 60, -0.5F, -0.6F, -3.725F, 1, 1, 4, 0.01F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.4F, -0.7F, -2.075F);
        this.Tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -3.1416F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 22, 0.0F, -4.5F, -2.0F, 0, 9, 4, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.3F, 0.0F, 4.5F);
        this.Body.addChild(Head);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, -1.0F, 4.0F);
        this.Head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.6101F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 5, 22, -2.0F, -0.425F, 0.625F, 2, 2, 1, -0.01F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, -1.0F, 4.0F);
        this.Head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.6152F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 15, -2.0F, 0.125F, -0.75F, 2, 1, 2, -0.001F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 1.0F, 2.0F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4014F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 56, 0, -2.0F, -1.95F, -2.625F, 2, 3, 4, -0.001F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, 1.0F, 2.0F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.4712F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 49, 54, -2.0F, -2.675F, -3.6F, 2, 3, 4, 0.0F, false));

        this.Eyes = new ModelRenderer(this);
        this.Eyes.setRotationPoint(-0.125F, 1.0F, -3.45F);
        this.Head.addChild(Eyes);
        this.Eyes.cubeList.add(new ModelBox(Eyes, 0, 0, 0.15F, -1.75F, 6.0F, 1, 1, 1, 0.0F, false));
        this.Eyes.cubeList.add(new ModelBox(Eyes, 14, 31, -1.125F, -1.75F, 6.0F, 1, 1, 1, -0.09F, false));
        this.Eyes.cubeList.add(new ModelBox(Eyes, 14, 22, -1.0F, -1.75F, 6.0F, 1, 1, 1, 0.0F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(1.0F, 0.95F, 3.3F);
        this.Head.addChild(Jaw);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.4F, -0.1F);
        this.Jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3622F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 9, 15, -2.0F, -0.0435F, -0.1309F, 2, 1, 2, 0.0F, false));

        this.BackRightFin = new ModelRenderer(this);
        this.BackRightFin.setRotationPoint(0.5F, 2.5F, -4.3F);
        this.Body.addChild(BackRightFin);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.2146F, -1.4418F);
        this.BackRightFin.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.7081F, 0.0F, 3.1416F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 59, 17, 0.0F, -1.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.3F, 0.0F, 0.05F);
        this.BackRightFin.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.7081F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 10, 0, -0.5F, -0.4776F, -3.043F, 1, 1, 3, 0.0F, false));

        this.FrontRightFin = new ModelRenderer(this);
        this.FrontRightFin.setRotationPoint(0.2F, 2.75F, 3.9F);
        this.Body.addChild(FrontRightFin);


        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.15F, 1.9547F, -0.6008F);
        this.FrontRightFin.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.333F, 0.0F, 3.1416F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 36, 52, 0.0F, -1.0F, -3.0F, 0, 2, 6, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.6F);
        this.FrontRightFin.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 1.333F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 60, -0.55F, -1.2066F, -3.6326F, 1, 1, 4, 0.0F, false));

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
