package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCrinoidRaft extends ModelBase {
    private final ModelRenderer horizontals;
    private final ModelRenderer verticals;
    private final ModelRenderer bb_main;

    public ModelSkeletonCrinoidRaft() {
        textureWidth = 310;
        textureHeight = 125;

        horizontals = new ModelRenderer(this);
        horizontals.setRotationPoint(0.0F, 24.0F, 0.0F);
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 52, 1.0F, -3.0F, -54.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 46, 24.0F, -3.0F, 57.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 44, 1.0F, -3.0F, 57.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 42, -22.0F, -3.0F, 57.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 40, -45.0F, -3.0F, 57.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 0, -45.0F, -3.0F, 39.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 2, -22.0F, -3.0F, 39.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 4, 1.0F, -3.0F, 39.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 6, 24.0F, -3.0F, 39.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 8, -45.0F, -3.0F, 20.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 10, -22.0F, -3.0F, 20.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 12, 1.0F, -3.0F, 20.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 14, 24.0F, -3.0F, 20.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 16, -45.0F, -3.0F, 2.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 18, -22.0F, -3.0F, 2.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 20, 1.0F, -3.0F, 2.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 22, 24.0F, -3.0F, 2.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 24, -45.0F, -3.0F, -17.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 26, -22.0F, -3.0F, -17.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 28, 1.0F, -3.0F, -17.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 30, 24.0F, -3.0F, -17.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 32, -45.0F, -3.0F, -35.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 34, -22.0F, -3.0F, -35.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 36, 1.0F, -3.0F, -35.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 38, 24.0F, -3.0F, -35.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 54, 24.0F, -3.0F, -54.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 48, -45.0F, -3.0F, -54.0F, 23, 2, 0, 0.0F, false));
        horizontals.cubeList.add(new ModelBox(horizontals, 0, 50, -22.0F, -3.0F, -54.0F, 23, 2, 0, 0.0F, false));

        verticals = new ModelRenderer(this);
        verticals.setRotationPoint(0.0F, 24.0F, 0.0F);
        verticals.cubeList.add(new ModelBox(verticals, 48, -18, 47.0F, -3.0F, 39.0F, 0, 2, 18, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, -17, 47.0F, -3.0F, 20.0F, 0, 2, 19, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, -14, 47.0F, -3.0F, 2.0F, 0, 2, 18, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, -13, 47.0F, -3.0F, -17.0F, 0, 2, 19, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, -10, 47.0F, -3.0F, -35.0F, 0, 2, 18, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, -9, 47.0F, -3.0F, -54.0F, 0, 2, 19, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 2, 24.0F, -3.0F, -35.0F, 0, 2, 18, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, -1, 24.0F, -3.0F, -17.0F, 0, 2, 19, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, -2, 24.0F, -3.0F, 2.0F, 0, 2, 18, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, -5, 24.0F, -3.0F, 20.0F, 0, 2, 19, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, -6, 24.0F, -3.0F, 39.0F, 0, 2, 18, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 3, 24.0F, -3.0F, -54.0F, 0, 2, 19, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 15, 1.0F, -3.0F, -54.0F, 0, 2, 19, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 6, 1.0F, -3.0F, 39.0F, 0, 2, 18, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 7, 1.0F, -3.0F, 20.0F, 0, 2, 19, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 10, 1.0F, -3.0F, 2.0F, 0, 2, 18, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 11, 1.0F, -3.0F, -17.0F, 0, 2, 19, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 14, 1.0F, -3.0F, -35.0F, 0, 2, 18, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 26, -22.0F, -3.0F, -35.0F, 0, 2, 18, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 23, -22.0F, -3.0F, -17.0F, 0, 2, 19, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 22, -22.0F, -3.0F, 2.0F, 0, 2, 18, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 19, -22.0F, -3.0F, 20.0F, 0, 2, 19, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 18, -22.0F, -3.0F, 39.0F, 0, 2, 18, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 27, -22.0F, -3.0F, -54.0F, 0, 2, 19, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 39, -45.0F, -3.0F, -54.0F, 0, 2, 19, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 30, -45.0F, -3.0F, 39.0F, 0, 2, 18, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 31, -45.0F, -3.0F, 20.0F, 0, 2, 19, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 34, -45.0F, -3.0F, 2.0F, 0, 2, 18, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 35, -45.0F, -3.0F, -17.0F, 0, 2, 19, 0.0F, false));
        verticals.cubeList.add(new ModelBox(verticals, 48, 38, -45.0F, -3.0F, -35.0F, 0, 2, 18, 0.0F, false));

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -45.0F, -3.0F, -54.0F, 92, 2, 111, 0.0F, false));

    }

    public void renderAll(float f) {
        horizontals.render(0.01f);
        verticals.render(0.01f);
        bb_main.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
