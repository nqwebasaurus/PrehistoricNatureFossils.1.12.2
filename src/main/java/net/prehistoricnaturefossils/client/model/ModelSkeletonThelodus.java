package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonThelodus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body;
    private final ModelRenderer finL;
    private final ModelRenderer finL2;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body4;
    private final ModelRenderer body5;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;

    public ModelSkeletonThelodus() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-2.0F, 24.0F, 6.0F);
        this.setRotateAngle(fossil, 0.0F, -3.0543F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 47, -5.0F, -2.0F, -7.0F, 13, 2, 20, -0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.9F, -1.0F, -9.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.5672F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 24, -0.5F, -1.0F, 0.3F, 13, 2, 20, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(8.0F, 0.0F, 13.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.2217F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -13.0F, -2.0F, 0.0F, 13, 2, 21, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-3.1F, 2.6F, 15.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, -2.7925F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 47, 24, -3.0F, -5.0F, 2.0F, 6, 0, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 7, 6, -3.25F, -5.05F, 0.75F, 1, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 7, 8, 2.25F, -5.05F, 0.75F, 1, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 15, -2.5F, -5.0F, 0.0F, 5, 0, 2, 0.0F, false));

        this.finL = new ModelRenderer(this);
        this.finL.setRotationPoint(2.5F, -6.5F, 3.0F);
        this.body.addChild(finL);
        this.setRotateAngle(finL, 0.0F, -0.2618F, 0.0F);
        this.finL.cubeList.add(new ModelBox(finL, 47, 47, 0.0F, 1.6F, 0.0F, 6, 0, 5, 0.0F, false));

        this.finL2 = new ModelRenderer(this);
        this.finL2.setRotationPoint(-2.5F, -6.5F, 3.0F);
        this.body.addChild(finL2);
        this.setRotateAngle(finL2, 0.0F, -0.0436F, 0.0F);
        this.finL2.cubeList.add(new ModelBox(finL2, 47, 33, -6.0F, 1.6F, 0.0F, 6, 0, 5, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -6.5F, 10.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -0.48F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.0F, 1.51F, -1.0F, 4, 0, 5, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 1.5F, 4.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.5672F, 0.0F, 1.5708F);
        this.body3.cubeList.add(new ModelBox(body3, 9, 24, 0.0057F, -1.6307F, -1.0F, 0, 3, 4, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.1057F, 4.3693F, 8.0F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6109F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.1F, -0.5F, -7.95F, 0, 2, 2, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.1057F, 0.3693F, 8.0F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6109F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 6, 0.0F, -6.15F, -5.3F, 0, 2, 2, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(-0.8943F, -0.1307F, 3.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.7418F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 6, 1.0F, -1.0F, -1.0F, 0, 2, 6, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 4.5F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.0873F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.6F, 1.4021F, 0.1846F);
        this.body5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 13, 0.51F, -2.0714F, 0.133F, 0, 1, 5, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.4021F, 0.1846F);
        this.body5.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 24, 1.2F, -1.0F, 1.0F, 0, 6, 4, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.6F, 1.4021F, 0.1846F);
        this.body5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5236F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 6, 0.5F, -0.9413F, 0.2119F, 0, 6, 1, 0.0F, false));

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
