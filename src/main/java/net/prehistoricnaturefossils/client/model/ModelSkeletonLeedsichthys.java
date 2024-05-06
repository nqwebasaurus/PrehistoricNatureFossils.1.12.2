package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLeedsichthys extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer root;
    private final ModelRenderer tail6;
    private final ModelRenderer cube_r9;

    public ModelSkeletonLeedsichthys() {
        this.textureWidth = 208;
        this.textureHeight = 150;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 0.0F, -26.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -3.1416F, 0.4363F, 3.1416F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 110, 15, -51.2752F, -2.0F, -30.0076F, 31, 2, 12, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 0.0F, -26.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -3.1416F, 1.021F, 3.1416F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 123, -59.2968F, -2.0F, 3.4198F, 25, 2, 10, 0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 0.0F, -26.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -3.1416F, 0.829F, 3.1416F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 62, 104, -38.1985F, -2.0F, -16.2937F, 25, 2, 23, -0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 0.0F, -26.2F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -3.1416F, 0.3927F, 3.1416F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 0, -14.7321F, -2.0F, -35.4533F, 15, 2, 36, 0.006F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-33.0F, 0.0F, 22.7F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 110, 0, 0.2475F, -2.0F, -12.0325F, 31, 2, 12, -0.003F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-28.0F, 0.0F, -4.3F);
        this.fossil.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 1.021F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 61, 130, -25.3863F, -2.0F, -0.1882F, 25, 2, 10, 0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-12.8F, 0.0F, -21.0F);
        this.fossil.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.829F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 85, 78, -24.9678F, -2.0F, -0.1125F, 25, 2, 23, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 0.0F, -27.0F);
        this.fossil.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.3927F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 85, 39, -15.0F, -2.0F, 0.1F, 15, 2, 36, 0.008F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -2.2927F, -8.0201F);
        this.root.addChild(tail6);
        this.setRotateAngle(tail6, 0.0F, 0.0F, -1.5708F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.4073F, -7.9799F);
        this.tail6.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.3F, -40.0F, -8.1F, 0, 80, 42, 0.0F, false));

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
