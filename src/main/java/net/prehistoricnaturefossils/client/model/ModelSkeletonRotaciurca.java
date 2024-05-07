package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonRotaciurca extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer main;
    private final ModelRenderer squish;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cone;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer uppercap;
    private final ModelRenderer cube_r7;
    private final ModelRenderer uppercap3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer uppercap2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer uppercap4;
    private final ModelRenderer cube_r10;

    public ModelSkeletonRotaciurca() {
        this.textureWidth = 64;
        this.textureHeight = 55;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 38, -7.0F, -2.0F, -5.0F, 15, 2, 10, 0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-13.0F, 0.0F, 1.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5236F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 21, 4.2302F, -2.0F, -0.0948F, 12, 2, 14, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(8.0F, 0.0F, -5.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.6981F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -12.0F, -2.0F, 0.0F, 12, 2, 18, -0.003F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(5.0F, -4.2F, 0.0F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.0F, 0.0F, -1.5708F);


        this.squish = new ModelRenderer(this);
        this.squish.setRotationPoint(-1.5F, 2.075F, 0.5F);
        this.main.addChild(squish);
        this.setRotateAngle(squish, 0.0F, 0.0F, -1.5708F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(3.0F, -0.4F, -0.5F);
        this.squish.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 3.1416F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.5F, -0.1F, -2.0F, 3, 0, 4, 0.0F, false));

        this.cone = new ModelRenderer(this);
        this.cone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(cone);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, -14.0F, 0.0F);
        this.cone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 3.1416F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 12, 0.0F, -2.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0F, -9.5F, 0.0F);
        this.cone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 3.1416F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 21, 0.0F, -2.5F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, -2.5F, 0.0F);
        this.cone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 3.1416F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 6, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.001F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 21, 0.0F, -4.5F, -1.5F, 0, 4, 3, 0.0F, false));

        this.uppercap = new ModelRenderer(this);
        this.uppercap.setRotationPoint(-1.9F, -2.7F, 0.0F);
        this.cone.addChild(uppercap);
        this.setRotateAngle(uppercap, 0.0F, 0.0F, 1.5708F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.uppercap.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 3.1416F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 5, -1.0F, 0.0F, -2.0F, 2, 0, 4, 0.0F, false));

        this.uppercap3 = new ModelRenderer(this);
        this.uppercap3.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.cone.addChild(uppercap3);
        this.setRotateAngle(uppercap3, 0.0F, 0.0F, -1.5708F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.uppercap3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 3.1416F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 10, -1.0F, 0.0F, -2.0F, 2, 0, 4, 0.0F, false));

        this.uppercap2 = new ModelRenderer(this);
        this.uppercap2.setRotationPoint(-2.0F, -1.0F, 2.0F);
        this.cone.addChild(uppercap2);
        this.setRotateAngle(uppercap2, 0.0F, 0.0F, 1.5708F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.0F, 1.0F);
        this.uppercap2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.5236F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 29, -0.7F, 0.1F, -1.5F, 3, 0, 2, 0.0F, false));

        this.uppercap4 = new ModelRenderer(this);
        this.uppercap4.setRotationPoint(-2.0F, -1.0F, -2.0F);
        this.cone.addChild(uppercap4);
        this.setRotateAngle(uppercap4, 0.0F, 0.0F, 1.5708F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.6556F, 0.0F, -0.5248F);
        this.uppercap4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3054F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 15, -1.5F, 0.1F, -1.0F, 3, 0, 2, 0.0F, false));

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
