package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonVetulicola extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Vetulicola;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer JawUpper;
    private final ModelRenderer cube_r5;
    private final ModelRenderer JawLower;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;

    public ModelSkeletonVetulicola() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -6.4074F, -1.0F, -11.2311F, 14, 1, 23, 0.0F, false));

        this.Vetulicola = new ModelRenderer(this);
        this.Vetulicola.setRotationPoint(0.0F, -1.175F, -2.625F);
        this.fossil.addChild(Vetulicola);
        this.setRotateAngle(Vetulicola, 0.0F, 0.0F, -1.5708F);
        this.Vetulicola.cubeList.add(new ModelBox(Vetulicola, 0, 25, -0.05F, -1.325F, -3.375F, 0, 4, 9, 0.0F, false));
        this.Vetulicola.cubeList.add(new ModelBox(Vetulicola, 0, 0, -0.06F, -1.825F, -3.375F, 0, 5, 10, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.07F, -0.8811F, -3.733F);
        this.Vetulicola.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5585F, 0.0F, -3.1416F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.07F, -1.0401F, -3.4786F);
        this.Vetulicola.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5585F, 0.0F, -3.1416F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 0, 0.1F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.02F, 0.475F, -3.875F);
        this.Vetulicola.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -3.1416F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 16, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.1F, -2.325F, 3.125F);
        this.Vetulicola.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 3.1416F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 6, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.JawUpper = new ModelRenderer(this);
        this.JawUpper.setRotationPoint(0.0F, -0.725F, -4.375F);
        this.Vetulicola.addChild(JawUpper);
        this.setRotateAngle(JawUpper, -0.2182F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.1F, 0.683F, 0.183F);
        this.JawUpper.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.0472F, 0.0F, 3.1416F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 16, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.JawLower = new ModelRenderer(this);
        this.JawLower.setRotationPoint(0.0F, 1.675F, -4.375F);
        this.Vetulicola.addChild(JawLower);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.1F, 0.0435F, 0.6364F);
        this.JawLower.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 2.3562F, 0.0F, 3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 0, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.11F, -0.2393F, 0.3536F);
        this.JawLower.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 2.3562F, 0.0F, 3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 6, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.325F, 3.625F);
        this.Vetulicola.addChild(Tail);
        this.setRotateAngle(Tail, 0.0873F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -3.1416F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 4, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.01F, 2.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0873F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.09F, 1.49F);
        this.Tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.01F, -0.51F, 1.49F);
        this.Tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 4, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.01F, 0.49F);
        this.Tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 3, 16, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.09F, 1.98F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1309F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.3F, 3.5F);
        this.Tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 6, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.01F, 0.0F, 1.5F);
        this.Tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -3.1416F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.5F, 1.5F);
        this.Tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -3.1416F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 0, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.01F, 0.3742F, -0.1515F);
        this.Tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4625F, 0.0F, -3.1416F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 6, 16, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.01F, -0.817F, -0.163F);
        this.Tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.5236F, 0.0F, 3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 9, 16, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

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
