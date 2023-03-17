package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMegarachne extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer body;
    private final ModelRenderer segments;
    private final ModelRenderer leg2L;
    private final ModelRenderer leg3L;
    private final ModelRenderer leg3L2;
    private final ModelRenderer leh3L3;
    private final ModelRenderer leg4L;
    private final ModelRenderer leg4L2;
    private final ModelRenderer leg2R;
    private final ModelRenderer leg2R2;
    private final ModelRenderer leh2R3;
    private final ModelRenderer leg3R;
    private final ModelRenderer leg3R2;
    private final ModelRenderer leh3R3;
    private final ModelRenderer leg4R;

    public ModelSkeletonMegarachne() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 47, -4.0F, -1.0F, -10.0F, 16, 1, 16, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 47, -9.0F, -1.0F, -8.0F, 16, 1, 16, 0.01F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 47, -13.0F, -1.0F, -11.0F, 16, 1, 16, -0.01F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.1F, -3.0F);
        this.fossil.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 20, 28, -2.5F, 0.85F, -4.0F, 5, 1, 4, 0.0F, false));

        this.segments = new ModelRenderer(this);
        this.segments.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(segments);
        this.segments.cubeList.add(new ModelBox(segments, 2, 27, -3.0F, 0.85F, 0.0F, 6, 1, 4, 0.0F, false));
        this.segments.cubeList.add(new ModelBox(segments, 28, 0, -2.0F, 0.8F, 4.0F, 4, 1, 4, 0.0F, false));

        this.leg2L = new ModelRenderer(this);
        this.leg2L.setRotationPoint(2.0F, 1.0F, -3.0F);
        this.body.addChild(leg2L);
        this.setRotateAngle(leg2L, 0.0F, 0.5236F, 0.0F);
        this.leg2L.cubeList.add(new ModelBox(leg2L, -1, 10, 0.0F, 0.01F, 0.0F, 3, 0, 1, 0.0F, false));

        this.leg3L = new ModelRenderer(this);
        this.leg3L.setRotationPoint(2.0F, 1.0F, -2.0F);
        this.body.addChild(leg3L);
        this.setRotateAngle(leg3L, 0.0F, 0.4363F, 0.0F);
        this.leg3L.cubeList.add(new ModelBox(leg3L, -1, 10, 0.0F, 0.01F, 0.0F, 3, 0, 1, 0.0F, false));

        this.leg3L2 = new ModelRenderer(this);
        this.leg3L2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg3L.addChild(leg3L2);
        this.setRotateAngle(leg3L2, 0.0F, -0.3491F, 0.0F);
        this.leg3L2.cubeList.add(new ModelBox(leg3L2, 6, 5, -0.0436F, 0.02F, 0.001F, 3, 0, 1, 0.0F, false));

        this.leh3L3 = new ModelRenderer(this);
        this.leh3L3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg3L2.addChild(leh3L3);
        this.setRotateAngle(leh3L3, 0.0F, -0.3491F, 0.0F);
        this.leh3L3.cubeList.add(new ModelBox(leh3L3, 0, 6, -0.0436F, 0.03F, 0.001F, 4, 0, 2, 0.0F, false));

        this.leg4L = new ModelRenderer(this);
        this.leg4L.setRotationPoint(2.0F, 1.0F, -1.0F);
        this.body.addChild(leg4L);
        this.setRotateAngle(leg4L, 0.0F, 0.0436F, 0.0F);
        this.leg4L.cubeList.add(new ModelBox(leg4L, -1, 10, 0.0F, 0.01F, 0.0F, 3, 0, 1, 0.0F, false));

        this.leg4L2 = new ModelRenderer(this);
        this.leg4L2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg4L.addChild(leg4L2);
        this.setRotateAngle(leg4L2, 0.0F, -0.3491F, 0.0F);
        this.leg4L2.cubeList.add(new ModelBox(leg4L2, 6, 5, -0.0436F, 0.02F, 0.001F, 3, 0, 1, 0.0F, false));

        this.leg2R = new ModelRenderer(this);
        this.leg2R.setRotationPoint(-2.0F, 1.0F, -3.0F);
        this.body.addChild(leg2R);
        this.setRotateAngle(leg2R, 0.0F, -0.8727F, 0.0F);
        this.leg2R.cubeList.add(new ModelBox(leg2R, -1, 10, -3.0F, 0.01F, 0.0F, 3, 0, 1, 0.0F, true));

        this.leg2R2 = new ModelRenderer(this);
        this.leg2R2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg2R.addChild(leg2R2);
        this.setRotateAngle(leg2R2, 0.0F, 0.3491F, 0.0F);
        this.leg2R2.cubeList.add(new ModelBox(leg2R2, 6, 5, -3.0F, 0.02F, 0.0F, 3, 0, 1, 0.0F, true));

        this.leh2R3 = new ModelRenderer(this);
        this.leh2R3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg2R2.addChild(leh2R3);
        this.setRotateAngle(leh2R3, 0.0F, 0.3491F, 0.0F);
        this.leh2R3.cubeList.add(new ModelBox(leh2R3, 1, 2, -4.0F, 0.03F, 0.0F, 4, 0, 2, 0.0F, true));

        this.leg3R = new ModelRenderer(this);
        this.leg3R.setRotationPoint(-2.0F, 1.0F, -2.0F);
        this.body.addChild(leg3R);
        this.setRotateAngle(leg3R, 0.0F, -0.5236F, 0.0F);
        this.leg3R.cubeList.add(new ModelBox(leg3R, -1, 10, -3.0F, 0.01F, 0.0F, 3, 0, 1, 0.0F, true));

        this.leg3R2 = new ModelRenderer(this);
        this.leg3R2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg3R.addChild(leg3R2);
        this.setRotateAngle(leg3R2, 0.0F, 0.3491F, 0.0F);
        this.leg3R2.cubeList.add(new ModelBox(leg3R2, 6, 5, -2.9564F, 0.02F, 0.001F, 3, 0, 1, 0.0F, true));

        this.leh3R3 = new ModelRenderer(this);
        this.leh3R3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg3R2.addChild(leh3R3);
        this.setRotateAngle(leh3R3, 0.0F, 0.3491F, 0.0F);
        this.leh3R3.cubeList.add(new ModelBox(leh3R3, 0, 6, -3.9564F, 0.03F, 0.001F, 4, 0, 2, 0.0F, true));

        this.leg4R = new ModelRenderer(this);
        this.leg4R.setRotationPoint(-2.0F, 1.0F, -1.0F);
        this.body.addChild(leg4R);
        this.setRotateAngle(leg4R, 0.0F, 0.5236F, 0.0F);
        this.leg4R.cubeList.add(new ModelBox(leg4R, -1, 10, -3.0F, 0.01F, 0.0F, 3, 0, 1, 0.0F, true));

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
