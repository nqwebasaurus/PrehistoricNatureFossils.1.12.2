package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPriscomyzon extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body;
    private final ModelRenderer mouth;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer body4;
    private final ModelRenderer body5;

    public ModelSkeletonPriscomyzon() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 21.9125F, -8.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -8.35F, 1.5875F, -3.0F, 11, 1, 15, 0.01F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 33, 2.65F, 1.5875F, 5.75F, 4, 1, 18, 0.01F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-5.25F, 2.5875F, 12.35F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 17, -2.975F, -1.0F, -0.875F, 11, 1, 14, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(6.675F, 2.0875F, 5.75F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.4669F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 33, -4.025F, -0.5F, -9.0F, 4, 1, 9, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-1.85F, 1.55F, -1.4F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.0436F, -3.1416F);
        this.body.cubeList.add(new ModelBox(body, 45, 44, -2.0F, -0.9725F, 4.0F, 4, 1, 6, 0.0F, false));

        this.mouth = new ModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, -2.0F, 4.15F);
        this.body.addChild(mouth);
        this.mouth.cubeList.add(new ModelBox(mouth, 51, 17, -2.5F, 1.0375F, -4.0F, 5, 1, 5, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.75F, 10.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 53, 0, -1.5F, -0.2325F, -0.25F, 3, 1, 1, -0.01F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.25F, 1.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 53, -1.0F, -0.4925F, -1.0F, 2, 1, 4, -0.01F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.05F, 3.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 45, 52, -0.5F, -0.4775F, -1.0F, 1, 1, 5, 0.01F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.0087F, -0.0873F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 51, 24, -0.5F, -0.4775F, 0.0F, 1, 1, 6, 0.0F, false));

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
