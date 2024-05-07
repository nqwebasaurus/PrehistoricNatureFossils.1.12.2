package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGantarostrataspis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Gantarostrataspis;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;

    public ModelSkeletonGantarostrataspis() {
        this.textureWidth = 60;
        this.textureHeight = 50;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 25.0F, 3.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 15, 13, -4.0F, -2.0F, -3.0F, 8, 1, 5, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 33, 33, -4.0F, -2.0F, 2.0F, 7, 1, 2, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 37, 14, -4.0F, -2.0F, 4.0F, 6, 1, 2, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5F, 0.0F, -6.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.637F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 31, -3.0013F, -2.0F, -0.6822F, 3, 1, 5, -0.006F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -5.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0698F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 13, -0.6F, -2.0F, -8.2F, 2, 1, 10, 0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, 0.0F, -6.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.637F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 26, 0.0013F, -2.0F, -0.6822F, 3, 1, 5, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -5.3F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0698F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.4F, -2.0F, -8.2F, 2, 1, 11, -0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(4.0F, 0.0F, 2.0F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 1.1083F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 16, -4.5F, -2.0F, -2.0F, 4, 1, 2, 0.005F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 16, -4.0F, -2.0F, -2.0F, 4, 1, 2, -0.003F, false));

        this.Gantarostrataspis = new ModelRenderer(this);
        this.Gantarostrataspis.setRotationPoint(0.0F, -1.2F, 6.0F);
        this.fossil.addChild(Gantarostrataspis);
        this.Gantarostrataspis.cubeList.add(new ModelBox(Gantarostrataspis, 28, 0, -3.5F, -1.4F, -9.0F, 7, 1, 5, 0.0F, false));
        this.Gantarostrataspis.cubeList.add(new ModelBox(Gantarostrataspis, 44, 26, -3.5F, -1.4F, -2.0F, 5, 1, 2, 0.0F, false));
        this.Gantarostrataspis.cubeList.add(new ModelBox(Gantarostrataspis, 0, 25, -0.5F, -0.95F, -19.25F, 1, 1, 9, 0.001F, false));
        this.Gantarostrataspis.cubeList.add(new ModelBox(Gantarostrataspis, 31, 37, -3.5F, -1.4F, -4.0F, 6, 1, 2, 0.0F, false));
        this.Gantarostrataspis.cubeList.add(new ModelBox(Gantarostrataspis, 16, 20, 0.25F, -0.95F, -19.25F, 1, 1, 9, 0.0F, false));
        this.Gantarostrataspis.cubeList.add(new ModelBox(Gantarostrataspis, 16, 0, -1.25F, -0.95F, -19.25F, 1, 1, 9, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -0.95F, -12.2F);
        this.Gantarostrataspis.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.5F, 0.0282F, 1.091F, 2, 0, 3, 0.001F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 38, -2.0F, 0.0282F, 0.091F, 3, 1, 4, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 1.6F, 0.0F);
        this.Gantarostrataspis.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 20, -3.5F, -3.7F, -7.75F, 6, 1, 4, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 43, -3.5F, -3.7F, -3.75F, 5, 1, 2, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 25, -3.5F, -3.7F, -1.75F, 4, 1, 2, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.75F, 0.1F, -8.05F);
        this.Gantarostrataspis.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.5236F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 36, -1.8F, -1.05F, -4.9F, 2, 1, 5, -0.001F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(1.75F, 0.1F, -8.05F);
        this.Gantarostrataspis.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.5236F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 37, 7, -0.2F, -1.05F, -4.9F, 2, 1, 5, -0.001F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(2.4F, 1.75F, -0.3F);
        this.Gantarostrataspis.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1309F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 41, -1.75F, -2.7F, -19.0F, 1, 1, 5, -0.001F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.4F, 1.75F, -0.3F);
        this.Gantarostrataspis.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1309F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 41, 0.75F, -2.7F, -19.0F, 1, 1, 5, -0.001F, false));

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
