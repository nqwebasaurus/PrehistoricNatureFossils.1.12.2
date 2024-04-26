package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPhylloceras extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer root;
    private final ModelRenderer Shell1;
    private final ModelRenderer Shell2;
    private final ModelRenderer Shell3;
    private final ModelRenderer Shell4;
    private final ModelRenderer Shell5;
    private final ModelRenderer Shell6;
    private final ModelRenderer Shell7;
    private final ModelRenderer Shell8;
    private final ModelRenderer Shell9;
    private final ModelRenderer Shellbase;

    public ModelSkeletonPhylloceras() {
        this.textureWidth = 73;
        this.textureHeight = 68;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 21.0F, -2.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 14, 27, -2.5F, -2.0F, -3.0F, 2, 3, 9, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 15, 55, -3.0F, 1.0F, -3.0F, 4, 2, 4, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 15, -1.5F, -5.0F, -6.0F, 4, 8, 7, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 16, 0, -1.5F, -2.0F, 1.0F, 4, 5, 3, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 49, 54, -3.5F, 1.0F, -7.0F, 4, 2, 4, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 38, 21, -4.0F, 1.0F, 1.0F, 6, 2, 6, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 46, 30, -3.5F, -2.0F, 4.0F, 4, 5, 4, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 57, 19, -3.0F, 1.0F, 6.6F, 3, 2, 4, 0.004F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.0F, 6.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 9, -2.6F, -8.0F, -6.0F, 4, 11, 6, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.0F, 8.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7156F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 59, 0, -3.0F, 0.0F, -3.0F, 3, 4, 3, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.6581F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 49, 43, -2.5F, -4.98F, -4.8969F, 2, 5, 5, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.0F, 4.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.8116F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, 0.0F, -9.0F, 3, 5, 9, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.fossil.addChild(root);


        this.Shell1 = new ModelRenderer(this);
        this.Shell1.setRotationPoint(-1.6F, -3.612F, 3.1055F);
        this.root.addChild(Shell1);
        this.setRotateAngle(Shell1, 0.7716F, 0.0F, -3.1416F);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 32, 48, -2.5F, -4.0F, -1.5F, 5, 8, 3, 0.01F, false));

        this.Shell2 = new ModelRenderer(this);
        this.Shell2.setRotationPoint(-0.01F, 4.025F, -1.5F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.6109F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 38, 0, -2.49F, -8.0F, -5.0F, 5, 8, 5, 0.0F, false));

        this.Shell3 = new ModelRenderer(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.6981F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 31, 34, -1.99F, -7.0F, -6.0F, 4, 7, 6, -0.01F, false));

        this.Shell4 = new ModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.6545F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 0, 35, -1.99F, -7.0F, -5.0F, 4, 7, 5, 0.01F, false));

        this.Shell5 = new ModelRenderer(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -0.8727F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 13, 42, -1.49F, -6.0F, -6.0F, 3, 6, 6, 0.0F, false));

        this.Shell6 = new ModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.7854F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 0, 51, -1.49F, -6.0F, -4.0F, 3, 6, 4, -0.01F, false));

        this.Shell7 = new ModelRenderer(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.8727F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 54, 9, -0.99F, -4.0F, -5.0F, 2, 4, 5, 0.01F, false));

        this.Shell8 = new ModelRenderer(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -1.0036F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 29, 60, -0.99F, -4.0F, -3.0F, 2, 4, 3, 0.0F, false));

        this.Shell9 = new ModelRenderer(this);
        this.Shell9.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -0.5236F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 59, 40, -0.99F, -4.0F, -3.0F, 2, 4, 3, -0.01F, false));

        this.Shellbase = new ModelRenderer(this);
        this.Shellbase.setRotationPoint(0.01F, 2.135F, -4.5F);
        this.Shell1.addChild(Shellbase);
        this.setRotateAngle(Shellbase, -0.1274F, 0.0F, 0.0F);

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
