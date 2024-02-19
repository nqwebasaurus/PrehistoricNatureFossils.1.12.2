package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDickinsonia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Body;

    public ModelSkeletonDickinsonia() {
        this.textureWidth = 75;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 27, -8.075F, -1.0F, -0.1F, 17, 1, 11, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -0.075F, -1.0F, -14.1F, 9, 1, 25, -0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1309F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 40, -8.0F, -1.0F, -14.0F, 9, 1, 15, 0.0F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.025F, 0.0F);
        this.fossil.addChild(Body);
        this.setRotateAngle(Body, 0.0F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 12, -4.0F, 0.0F, -8.0F, 8, 0, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 2, -5.0F, 0.0F, -7.0F, 10, 0, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 44, 7, -6.0F, 0.0F, -6.0F, 12, 0, 3, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 34, 40, -7.0F, 0.0F, -3.0F, 14, 0, 6, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 44, 11, -6.0F, 0.0F, 3.0F, 12, 0, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -5.0F, 0.0F, 5.0F, 10, 0, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 10, -4.0F, 0.0F, 6.0F, 8, 0, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 14, -3.0F, 0.0F, 7.0F, 6, 0, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 18, -3.0F, -0.1F, -6.0F, 6, 0, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 7, -4.0F, -0.1F, -5.0F, 8, 0, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 44, 0, -5.0F, -0.1F, -3.0F, 10, 0, 6, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 4, -4.0F, -0.1F, 3.0F, 8, 0, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 16, -3.0F, -0.1F, 5.0F, 6, 0, 1, 0.0F, false));

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
