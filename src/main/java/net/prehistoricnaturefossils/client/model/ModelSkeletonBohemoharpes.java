package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBohemoharpes extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer main;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;

    public ModelSkeletonBohemoharpes() {
        this.textureWidth = 100;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 42, -8.0F, -2.0F, -8.0F, 16, 2, 16, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(11.7244F, -0.5F, 7.3835F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.6144F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.2173F, -0.5F, -19.0846F, 18, 1, 19, 0.009F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-14.3439F, -0.5F, 5.7238F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.7418F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 21, -0.1191F, -0.5F, -0.2495F, 18, 1, 19, 0.004F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-14.4F, 0.0F, 5.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 46, 0.0264F, -1.0F, -15.0704F, 7, 1, 15, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -2.5F, 1.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 56, 21, -2.0F, -0.5F, -4.0F, 6, 2, 10, 0.0F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -2.9F, 3.4F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, -0.2182F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 6, -2.0F, -1.0F, 0.0F, 4, 1, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 9, 24, -1.0F, -1.4F, 0.075F, 2, 1, 2, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.6125F, 4.025F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 5, 33, -0.5F, -0.2625F, -2.175F, 1, 1, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 16, -1.0F, 0.0625F, 0.275F, 2, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 26, -1.5F, 0.0125F, -1.225F, 3, 1, 2, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.9112F, 0.1723F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 21, -1.0F, -1.1614F, -3.747F, 2, 1, 3, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.9112F, 0.1723F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 11, -1.5F, -0.5888F, -3.0223F, 3, 1, 3, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 28, -2.5F, -0.2388F, 0.8277F, 0, 1, 3, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 30, 2.5F, -0.2388F, 0.8277F, 0, 1, 3, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 56, 0, -5.5F, 0.7612F, -7.1723F, 11, 0, 12, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -2.5F, -0.0888F, -4.1723F, 5, 1, 4, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.9112F, 0.1723F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1922F, -0.4293F, -0.0808F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 8, -1.916F, -0.2388F, -1.1933F, 0, 1, 3, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.5F, -0.95F, 2.0F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, -0.4363F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 21, -1.0F, 0.525F, -2.0F, 1, 0, 2, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(2.5F, -0.95F, 2.0F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.4363F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 28, 0.0F, 0.525F, -2.0F, 1, 0, 2, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.9112F, 0.1723F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1922F, 0.4293F, 0.0808F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 13, 1.916F, -0.2388F, -1.1933F, 0, 1, 3, 0.0F, false));

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
