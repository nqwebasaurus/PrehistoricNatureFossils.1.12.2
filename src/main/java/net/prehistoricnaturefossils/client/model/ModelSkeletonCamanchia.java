package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCamanchia extends ModelBase {
    private final ModelRenderer Everything;
    private final ModelRenderer Fossil;
    private final ModelRenderer bone2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer bone3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Matrix;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;

    public ModelSkeletonCamanchia() {
        this.textureWidth = 70;
        this.textureHeight = 50;

        this.Everything = new ModelRenderer(this);
        this.Everything.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(Everything, 0.0F, -0.3054F, 0.0F);


        this.Fossil = new ModelRenderer(this);
        this.Fossil.setRotationPoint(-0.5F, -0.95F, 0.0F);
        this.Everything.addChild(Fossil);
        this.setRotateAngle(Fossil, 0.0F, 0.5236F, 0.0F);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.Fossil.addChild(bone2);
        this.bone2.cubeList.add(new ModelBox(bone2, 10, 46, -0.5F, -0.25F, -2.0F, 3, 0, 2, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 41, -2.5F, -0.25F, -6.0F, 4, 0, 4, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 42, 4, 1.5F, -0.25F, -6.0F, 2, 0, 4, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 42, 8, -2.5F, -0.25F, -8.1F, 4, 0, 2, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.bone2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3927F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 45, -1.0F, 0.0F, -2.0F, 2, 0, 3, 0.0F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Fossil.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 36, 40, -1.5F, -0.3F, -7.0F, 4, 0, 5, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 42, 0, -3.5F, -0.225F, -6.0F, 2, 0, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 40, 45, -2.5F, -0.25F, -2.0F, 3, 0, 2, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.45F, -0.225F, 7.5F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.144F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 10, -0.5F, 0.0F, -4.0F, 1, 0, 4, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(3.8F, -0.325F, -6.675F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 45, -2.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.8F, -0.325F, -6.675F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.7854F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 26, -1.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.2F, 0.0F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.1004F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 41, -1.0F, 0.0F, -1.0F, 2, 0, 5, 0.0F, false));

        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(1.0F, -0.175F, 1.0F);
        this.bone.addChild(bone3);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.bone3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3927F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 20, -1.0F, 0.0F, -2.0F, 2, 0, 3, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.25F, 0.025F, 0.3F);
        this.bone3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.48F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 14, -1.0F, 0.0F, -2.0F, 2, 0, 3, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.175F, 0.0F, 0.0F);
        this.bone3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3927F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 17, -1.0F, 0.0F, -2.0F, 2, 0, 3, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.025F, 0.05F, 0.3F);
        this.bone3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.48F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 23, -1.0F, 0.0F, -2.0F, 2, 0, 3, 0.0F, false));

        this.Matrix = new ModelRenderer(this);
        this.Matrix.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Everything.addChild(Matrix);
        this.Matrix.cubeList.add(new ModelBox(Matrix, 0, 0, -7.0F, -1.0F, -9.0F, 8, 1, 13, 0.01F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(3.825F, 0.0F, 2.65F);
        this.Matrix.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 2.0508F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 28, -7.0F, -1.0F, -8.0F, 6, 1, 12, -0.01F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(4.75F, 0.0F, -0.95F);
        this.Matrix.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.6109F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 14, -7.0F, -1.0F, -9.0F, 8, 1, 13, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(3.575F, -0.025F, 4.775F);
        this.Matrix.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.7854F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 28, -7.0F, -1.0F, -8.0F, 5, 1, 11, 0.0F, false));

    }

    public void renderAll(float f) {
        this.Everything.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
