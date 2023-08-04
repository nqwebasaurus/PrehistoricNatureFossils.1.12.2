package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBirkenia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Birkenia;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r7;

    public ModelSkeletonBirkenia() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(17.0F, 24.0F, -8.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -27.0F, -2.0F, -17.0F, 27, 2, 48, 0.005F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 93, 0.0F, -2.0F, -15.0F, 14, 2, 48, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-29.1735F, -1.0F, 23.0553F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.7418F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 22, -3.5F, -1.0F, -3.4F, 6, 2, 11, -0.005F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-47.5F, -1.0F, 6.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3054F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 51, -8.5F, -1.0F, -16.2F, 35, 2, 39, 0.0F, false));

        this.Birkenia = new ModelRenderer(this);
        this.Birkenia.setRotationPoint(-4.0F, -4.8F, 7.0F);
        this.fossil.addChild(Birkenia);
        this.setRotateAngle(Birkenia, 0.5236F, 0.0F, -1.5708F);
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 0, 0, -2.5F, -9.0F, -7.0F, 0, 7, 14, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 15, 0, -2.5F, -2.0F, -2.0F, 0, 1, 9, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 15, 11, -2.6F, -9.25F, -7.0F, 0, 1, 1, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 15, 0, -2.6F, -9.25F, -5.0F, 0, 1, 1, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 9, 11, -2.6F, -9.25F, -3.0F, 0, 1, 1, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 6, 11, -2.6F, -9.25F, -1.0F, 0, 1, 1, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 3, 11, -2.7F, -9.5F, 2.0F, 0, 1, 1, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 11, 0, -2.7F, -9.75F, 4.0F, 0, 1, 1, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 0, 11, -2.6F, -9.75F, 5.75F, 0, 1, 1, 0.0F, false));
        this.Birkenia.cubeList.add(new ModelBox(Birkenia, 0, 0, -2.7F, -10.5F, 1.5F, 0, 1, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.6F, -9.0F, -7.0F);
        this.Birkenia.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 36, -2.0F, 0.0F, -6.0F, 0, 1, 6, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 9, -2.0F, 1.0F, -6.0F, 0, 2, 6, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.6F, -1.75F, -7.0F);
        this.Birkenia.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.8F, -4.25F, -6.0F, 0, 4, 6, -0.01F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.4F, -6.5F, 7.0F);
        this.Birkenia.addChild(tail);
        this.setRotateAngle(tail, 0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 7, 0, -2.2F, -2.75F, 0.5F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 18, 11, -2.2F, -2.5F, 2.5F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 24, 17, -2.0F, -2.0F, -1.0F, 0, 6, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 15, 0, -2.1F, 3.5F, 0.0F, 0, 2, 4, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 2.25F, 4.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2618F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 22, -2.1F, -3.25F, -1.0F, 0, 4, 3, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.1F, 1.25F, 0.5F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 0, 0.1F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.1F, 1.25F, 0.5F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 0, 0.0F, -0.7F, -1.5F, 0, 1, 3, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.7038F, 2.0634F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.6109F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 23, 24, -2.2F, -6.5462F, -0.0634F, 0, 11, 12, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.4538F, 0.9366F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 0, -1.9F, -1.75F, -1.8F, 0, 2, 6, 0.0F, false));

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
