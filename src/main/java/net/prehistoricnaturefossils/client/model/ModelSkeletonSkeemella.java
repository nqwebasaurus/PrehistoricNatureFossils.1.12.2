package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSkeemella extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Root;
    private final ModelRenderer Tail;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Tail4;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Tail5;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Tail6;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Tail7;
    private final ModelRenderer cube_r12;

    public ModelSkeletonSkeemella() {
        this.textureWidth = 80;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -8.0F, -2.0F, -13.0F, 13, 2, 14, 0.002F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(8.0F, 0.0F, 1.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 17, -16.0F, -2.0F, -10.8F, 13, 2, 10, -0.002F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-8.0F, 0.0F, -16.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.192F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 44, 0.0F, -2.0F, 3.0F, 3, 2, 7, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(5.0F, 0.0F, 1.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.0472F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 17, 0.0228F, -2.0F, -6.9274F, 11, 2, 7, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(13.0F, 0.0F, -1.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.9163F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 41, -18.8224F, -2.0F, 0.0621F, 12, 2, 9, 0.002F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(5.0F, 0.0F, 3.0F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 30, -1.8815F, -2.0F, -0.1822F, 9, 2, 11, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.7F, 0.0F, 4.6F);
        this.fossil.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.4014F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 30, -0.0414F, -2.0F, 0.1388F, 15, 2, 8, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.fossil.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.2182F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 41, 0, -4.0F, -2.0F, 0.9F, 9, 2, 6, -0.003F, false));

        this.Root = new ModelRenderer(this);
        this.Root.setRotationPoint(0.0F, -3.1F, -6.0F);
        this.fossil.addChild(Root);
        this.setRotateAngle(Root, 0.0F, 0.0F, -1.5708F);
        this.Root.cubeList.add(new ModelBox(Root, 0, 0, -0.8F, -2.11F, -2.6F, 0, 3, 4, 0.0F, false));

        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(-0.5F, -0.5F, 2.0F);
        this.Root.addChild(Tail);
        this.setRotateAngle(Tail, -0.48F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 5, 4, -0.5F, -0.9964F, -0.1236F, 0, 2, 4, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 0, -0.49F, -0.5964F, -1.0236F, 0, 1, 1, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1745F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 41, -0.47F, -0.99F, 0.0F, 0, 2, 2, 0.0F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 37, 17, -0.47F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Tail3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 30, -0.5F, -1.0F, 0.1F, 0, 2, 2, 0.0F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.3F, 4.2F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1745F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 3, 33, -0.47F, -0.99F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Tail4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 5, 22, -0.5F, -0.966F, -0.0598F, 0, 2, 2, 0.0F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.5F, 4.2F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.4363F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 0, 30, -0.47F, -0.8987F, -0.346F, 0, 2, 2, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Tail5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6109F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 8, -0.5F, -0.6186F, -0.5254F, 0, 2, 2, 0.0F, false));

        this.Tail6 = new ModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -1.2217F, 0.0F, 0.0F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 41, 0, -0.47F, -0.1402F, -0.0232F, 0, 1, 2, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Tail6.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5672F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 5, 0, -0.5F, -0.1841F, -0.1262F, 0, 1, 2, 0.0F, false));

        this.Tail7 = new ModelRenderer(this);
        this.Tail7.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail6.addChild(Tail7);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail7.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.5672F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 17, -0.5F, -0.3841F, 0.1738F, 0, 3, 3, 0.0F, false));

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
