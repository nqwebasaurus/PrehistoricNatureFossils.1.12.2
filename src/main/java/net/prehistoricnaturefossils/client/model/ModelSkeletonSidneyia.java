package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSidneyia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer body;
    private final ModelRenderer antennaeL;
    private final ModelRenderer cube_r2;
    private final ModelRenderer antennaeR;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r6;

    public ModelSkeletonSidneyia() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 2.7F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(9.4926F, -0.5F, 4.0689F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.3614F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -23.9F, -0.5F, -8.0F, 28, 1, 28, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, 1.0036F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -1.01F, 1.0F, 8, 0, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 9, -4.0F, -1.01F, -6.0F, 8, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 14, -3.5F, -1.01F, -7.0F, 7, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 30, -4.5F, -1.01F, -5.0F, 9, 0, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 11, -3.0F, -1.02F, 3.0F, 6, 0, 2, 0.0F, false));

        this.antennaeL = new ModelRenderer(this);
        this.antennaeL.setRotationPoint(4.0F, -1.0F, -5.5F);
        this.body.addChild(antennaeL);
        this.setRotateAngle(antennaeL, 0.0F, 0.1745F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.0F, -0.5F);
        this.antennaeL.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3491F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 6, -0.7F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.antennaeR = new ModelRenderer(this);
        this.antennaeR.setRotationPoint(-4.0F, -1.0F, -5.5F);
        this.body.addChild(antennaeR);
        this.setRotateAngle(antennaeR, 0.0F, -0.1745F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5652F, 0.0F, 1.9254F);
        this.antennaeR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.789F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 3, -0.5F, 0.0F, -0.3F, 1, 0, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.8888F, 0.0F, 2.0845F);
        this.antennaeR.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.4399F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 5, 0.9F, 0.0F, -0.2F, 1, 0, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 11, -1.5F, 0.0F, -3.5F, 1, 0, 5, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.0F, -1.5F);
        this.antennaeR.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.48F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 17, -0.5F, 0.0F, -1.5F, 1, 0, 3, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.0F, 0.1745F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 3, -1.5F, 0.0F, -1.0F, 3, 0, 5, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.8F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, 0.1309F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 17, -1.5F, -0.01F, 0.0F, 3, 0, 1, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 2.75F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3054F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 16, -1.8F, 0.0F, -0.15F, 5, 0, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 3, -1.3F, 0.0F, -2.15F, 4, 0, 2, 0.0F, false));

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
