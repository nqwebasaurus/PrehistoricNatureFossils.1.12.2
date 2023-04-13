package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonVetulicola extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Vetulicola;
    private final ModelRenderer cube_r1;
    private final ModelRenderer JawUpper;
    private final ModelRenderer cube_r2;
    private final ModelRenderer JawLower;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Tail;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;

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
        this.Vetulicola.cubeList.add(new ModelBox(Vetulicola, 11, 6, -0.1F, -3.325F, 2.625F, 0, 2, 1, 0.0F, false));
        this.Vetulicola.cubeList.add(new ModelBox(Vetulicola, 0, 0, -0.06F, -1.825F, -3.375F, 0, 5, 10, 0.0F, false));
        this.Vetulicola.cubeList.add(new ModelBox(Vetulicola, 0, 16, -0.02F, -1.025F, -4.375F, 0, 3, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.125F, -4.475F);
        this.Vetulicola.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5585F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 0, -0.07F, 0.1F, 0.0F, 0, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 0, -0.07F, 0.1F, 0.3F, 0, 1, 1, 0.0F, false));

        this.JawUpper = new ModelRenderer(this);
        this.JawUpper.setRotationPoint(0.0F, -0.725F, -4.375F);
        this.Vetulicola.addChild(JawUpper);
        this.setRotateAngle(JawUpper, -0.2182F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.JawUpper.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.0472F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 16, -0.1F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.JawLower = new ModelRenderer(this);
        this.JawLower.setRotationPoint(0.0F, 1.675F, -4.375F);
        this.Vetulicola.addChild(JawLower);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.3F, 0.0F);
        this.JawLower.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 7, 0, -0.1F, 0.4F, -1.0F, 0, 2, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 6, -0.11F, 0.0F, -1.0F, 0, 2, 1, 0.0F, false));

        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.325F, 3.625F);
        this.Vetulicola.addChild(Tail);
        this.setRotateAngle(Tail, 0.0873F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 5, 4, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.01F, 2.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0873F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 3, 16, 0.0F, -1.01F, -0.01F, 0, 2, 1, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 4, 0, 0.01F, -1.01F, 0.99F, 0, 1, 1, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 0, 0.0F, -0.41F, 0.99F, 0, 1, 1, 0.0F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.09F, 1.98F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1309F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 11, 0, 0.0F, -1.5F, 0.0F, 0, 2, 3, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 0, 0.01F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 6, 0.0F, -1.3F, 3.0F, 0, 2, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -0.98F);
        this.Tail3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4625F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 16, -0.01F, -0.5348F, 0.4084F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -0.98F);
        this.Tail3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5236F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 16, -0.01F, -0.799F, 0.616F, 0, 1, 1, 0.0F, false));

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
