package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSquatinactis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer finL;
    private final ModelRenderer finR;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer body4;
    private final ModelRenderer body5;
    private final ModelRenderer body6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer body7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tailfin;
    private final ModelRenderer cube_r9;

    public ModelSkeletonSquatinactis() {
        this.textureWidth = 110;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-23.0F, -1.0F, 2.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4014F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 52, 3.8482F, -1.0F, -23.7958F, 12, 2, 23, 0.006F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(18.0F, -1.0F, 19.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0524F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 52, -29.9011F, -1.0F, -23.9263F, 14, 2, 15, -0.003F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 34, -37.9011F, -1.0F, -15.1263F, 31, 2, 15, 0.003F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 16, -6.9011F, -1.0F, -5.1263F, 7, 2, 5, -0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.8F, -1.0F, -13.1F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5585F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -10.8258F, -1.0F, -0.1008F, 11, 2, 31, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.8F, -1.0F, -12.8F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.5585F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 52, -2.7258F, -1.0F, 30.5992F, 3, 2, 6, 0.003F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-3.4F, 0.4F, -4.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.5585F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 54, 25, -2.5F, -2.85F, -9.0F, 5, 0, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 47, -1.99F, -2.825F, -9.25F, 4, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 61, -2.99F, -2.75F, -8.6F, 6, 0, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 45, -2.49F, -2.95F, -6.6F, 5, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 8, -2.5F, -3.0F, -3.0F, 5, 0, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, -7, 8, -0.5F, -3.1F, -3.0F, 1, 0, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 54, 21, -2.5F, -3.0F, -6.0F, 5, 0, 3, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.3F, 0.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.0873F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 16, -3.1F, -2.6F, -6.15F, 1, 0, 4, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.3F, 0.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0873F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 40, 2.1F, -2.6F, -6.15F, 1, 0, 4, 0.0F, false));

        this.finL = new ModelRenderer(this);
        this.finL.setRotationPoint(2.5F, -1.0F, -2.0F);
        this.body.addChild(finL);
        this.finL.cubeList.add(new ModelBox(finL, 0, 0, 0.0F, -1.7F, -1.0F, 6, 0, 7, 0.0F, false));

        this.finR = new ModelRenderer(this);
        this.finR.setRotationPoint(-2.5F, -1.0F, -2.0F);
        this.body.addChild(finR);
        this.finR.cubeList.add(new ModelBox(finR, 54, 0, -10.0F, -1.7F, -1.0F, 10, 0, 7, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -0.1745F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 24, -2.0F, -1.9F, -1.0F, 4, 0, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, -4, 11, -0.5F, -2.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.5F, 4.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, -0.3927F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, -4, 11, -0.5F, -1.4F, 0.0F, 1, 0, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 54, 15, -1.5F, -1.35F, -1.0F, 3, 0, 5, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0F, -0.3927F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 54, 8, -1.0F, -1.5F, -1.0F, 2, 0, 6, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, -5, 10, -0.5F, -1.75F, 0.0F, 1, 0, 5, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.25F, 5.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.0F, -0.4363F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, -5, 10, -0.5F, -1.4F, 0.0F, 1, 0, 5, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 13, 24, -1.0F, -1.15F, -0.5F, 2, 0, 6, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.25F, 5.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0F, -0.6109F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 0, 34, -0.9F, -0.8F, 0.0F, 2, 0, 5, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, -5, 10, -0.5F, -0.95F, 0.0F, 1, 0, 5, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.6971F, -1.0F, 1.5556F);
        this.body6.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -2.3562F, 0.0F, 1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.body7 = new ModelRenderer(this);
        this.body7.setRotationPoint(0.1F, 0.0F, 4.4F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, 0.48F, 0.0F, -1.5708F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.7F, 0.21F, 2.0F);
        this.body7.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -3.1416F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 0, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.tailfin = new ModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body7.addChild(tailfin);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.7F, 0.2F, 2.0F);
        this.tailfin.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 8, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

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
