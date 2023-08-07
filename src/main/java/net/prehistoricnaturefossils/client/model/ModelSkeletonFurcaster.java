package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonFurcaster extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer core;
    private final ModelRenderer arm1base;
    private final ModelRenderer arm1a;
    private final ModelRenderer arm1b;
    private final ModelRenderer arm1c;
    private final ModelRenderer arm1d;
    private final ModelRenderer arm1e;
    private final ModelRenderer arm1e_r1;
    private final ModelRenderer arm2base;
    private final ModelRenderer arm2a;
    private final ModelRenderer arm2b;
    private final ModelRenderer arm2c;
    private final ModelRenderer arm2d;
    private final ModelRenderer arm2e;
    private final ModelRenderer arm5base;
    private final ModelRenderer arm5a;
    private final ModelRenderer arm5b;
    private final ModelRenderer arm5c;
    private final ModelRenderer arm5d;
    private final ModelRenderer arm5e;
    private final ModelRenderer arm3base;
    private final ModelRenderer arm3a;
    private final ModelRenderer arm3b;
    private final ModelRenderer arm3c;
    private final ModelRenderer arm3d;
    private final ModelRenderer arm3e;
    private final ModelRenderer arm4base;
    private final ModelRenderer arm4a;
    private final ModelRenderer arm4b;
    private final ModelRenderer arm4c;
    private final ModelRenderer arm4d;
    private final ModelRenderer arm4d_r1;
    private final ModelRenderer arm4e;
    private final ModelRenderer arm4e2;
    private final ModelRenderer arm4e_r1;

    public ModelSkeletonFurcaster() {
        this.textureWidth = 288;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(18.0F, 24.0F, 11.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -53.0F, -2.0F, -47.0F, 71, 2, 71, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.core = new ModelRenderer(this);
        this.core.setRotationPoint(0.0F, 22.8F, 0.0F);
        this.root.addChild(core);
        this.core.cubeList.add(new ModelBox(core, 50, 12, -2.5F, -2.83F, -2.5F, 5, 2, 5, 0.0F, false));

        this.arm1base = new ModelRenderer(this);
        this.arm1base.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.core.addChild(arm1base);
        this.arm1base.cubeList.add(new ModelBox(arm1base, 60, 85, -2.0F, -0.6F, -3.0F, 4, 1, 3, 0.0F, false));

        this.arm1a = new ModelRenderer(this);
        this.arm1a.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm1base.addChild(arm1a);
        this.setRotateAngle(arm1a, 0.0F, 0.48F, 0.0F);
        this.arm1a.cubeList.add(new ModelBox(arm1a, 0, 26, -1.5F, -0.5F, -11.0F, 3, 1, 11, 0.0F, false));

        this.arm1b = new ModelRenderer(this);
        this.arm1b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.arm1a.addChild(arm1b);
        this.setRotateAngle(arm1b, 0.0F, 0.4363F, 0.0F);
        this.arm1b.cubeList.add(new ModelBox(arm1b, 0, 74, -1.0F, -0.5F, -10.0F, 2, 1, 10, 0.0F, false));

        this.arm1c = new ModelRenderer(this);
        this.arm1c.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.arm1b.addChild(arm1c);
        this.setRotateAngle(arm1c, 0.0F, 0.2182F, 0.0F);
        this.arm1c.cubeList.add(new ModelBox(arm1c, 16, 85, -1.0F, -0.5F, -9.0F, 2, 1, 9, 0.0F, false));

        this.arm1d = new ModelRenderer(this);
        this.arm1d.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arm1c.addChild(arm1d);
        this.setRotateAngle(arm1d, 0.0F, -0.2182F, 0.0F);
        this.arm1d.cubeList.add(new ModelBox(arm1d, 0, 53, -0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F, false));

        this.arm1e = new ModelRenderer(this);
        this.arm1e.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.arm1d.addChild(arm1e);
        this.setRotateAngle(arm1e, 0.0F, -0.3927F, 0.0F);
        this.arm1e.cubeList.add(new ModelBox(arm1e, 70, 85, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm1e_r1 = new ModelRenderer(this);
        this.arm1e_r1.setRotationPoint(0.0F, 0.0F, -4.9F);
        this.arm1e.addChild(arm1e_r1);
        this.setRotateAngle(arm1e_r1, 0.0F, -0.1745F, 0.0F);
        this.arm1e_r1.cubeList.add(new ModelBox(arm1e_r1, 51, 0, -0.5F, -0.5F, -7.1F, 1, 1, 7, 0.0F, false));

        this.arm2base = new ModelRenderer(this);
        this.arm2base.setRotationPoint(1.4F, -0.5F, -0.5F);
        this.core.addChild(arm2base);
        this.setRotateAngle(arm2base, 0.0F, -1.117F, 0.0F);
        this.arm2base.cubeList.add(new ModelBox(arm2base, 45, 85, -2.0F, -0.58F, -3.0F, 4, 1, 3, 0.0F, false));

        this.arm2a = new ModelRenderer(this);
        this.arm2a.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm2base.addChild(arm2a);
        this.setRotateAngle(arm2a, 0.0F, 0.9163F, 0.0F);
        this.arm2a.cubeList.add(new ModelBox(arm2a, 18, 15, -1.5F, -0.5F, -11.0F, 3, 1, 11, 0.0F, false));

        this.arm2b = new ModelRenderer(this);
        this.arm2b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.arm2a.addChild(arm2b);
        this.setRotateAngle(arm2b, 0.0F, 0.829F, 0.0F);
        this.arm2b.cubeList.add(new ModelBox(arm2b, 42, 58, -1.0F, -0.5F, -10.0F, 2, 1, 10, 0.0F, false));

        this.arm2c = new ModelRenderer(this);
        this.arm2c.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.arm2b.addChild(arm2c);
        this.setRotateAngle(arm2c, 0.0F, 0.48F, 0.0F);
        this.arm2c.cubeList.add(new ModelBox(arm2c, 71, 74, -1.0F, -0.5F, -9.0F, 2, 1, 9, 0.0F, false));

        this.arm2d = new ModelRenderer(this);
        this.arm2d.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arm2c.addChild(arm2d);
        this.setRotateAngle(arm2d, 0.0F, -0.1309F, 0.0F);
        this.arm2d.cubeList.add(new ModelBox(arm2d, 15, 42, -0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F, false));

        this.arm2e = new ModelRenderer(this);
        this.arm2e.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.arm2d.addChild(arm2e);
        this.setRotateAngle(arm2e, 0.0F, 0.2618F, 0.0F);
        this.arm2e.cubeList.add(new ModelBox(arm2e, 30, 44, -0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F, false));

        this.arm5base = new ModelRenderer(this);
        this.arm5base.setRotationPoint(-1.4F, -0.5F, -0.5F);
        this.core.addChild(arm5base);
        this.setRotateAngle(arm5base, 0.0F, 1.117F, 0.0F);
        this.arm5base.cubeList.add(new ModelBox(arm5base, 39, 74, -2.0F, -0.62F, -3.0F, 4, 1, 3, 0.0F, false));

        this.arm5a = new ModelRenderer(this);
        this.arm5a.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm5base.addChild(arm5a);
        this.setRotateAngle(arm5a, 0.0F, -0.0873F, 0.0F);
        this.arm5a.cubeList.add(new ModelBox(arm5a, 18, 2, -1.5F, -0.5F, -11.0F, 3, 1, 11, 0.0F, false));

        this.arm5b = new ModelRenderer(this);
        this.arm5b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.arm5a.addChild(arm5b);
        this.setRotateAngle(arm5b, 0.0F, -0.1309F, 0.0F);
        this.arm5b.cubeList.add(new ModelBox(arm5b, 17, 58, -1.0F, -0.5F, -10.0F, 2, 1, 10, 0.0F, false));

        this.arm5c = new ModelRenderer(this);
        this.arm5c.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.arm5b.addChild(arm5c);
        this.setRotateAngle(arm5c, 0.0F, -0.1745F, 0.0F);
        this.arm5c.cubeList.add(new ModelBox(arm5c, 48, 74, -1.0F, -0.5F, -9.0F, 2, 1, 9, 0.0F, false));

        this.arm5d = new ModelRenderer(this);
        this.arm5d.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arm5c.addChild(arm5d);
        this.setRotateAngle(arm5d, 0.0F, 0.1745F, 0.0F);
        this.arm5d.cubeList.add(new ModelBox(arm5d, 35, 16, -0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F, false));

        this.arm5e = new ModelRenderer(this);
        this.arm5e.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.arm5d.addChild(arm5e);
        this.setRotateAngle(arm5e, 0.0F, 0.3491F, 0.0F);
        this.arm5e.cubeList.add(new ModelBox(arm5e, 0, 39, -0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F, false));

        this.arm3base = new ModelRenderer(this);
        this.arm3base.setRotationPoint(1.0F, -0.5F, 1.2F);
        this.core.addChild(arm3base);
        this.setRotateAngle(arm3base, 0.0F, -2.4435F, 0.0F);
        this.arm3base.cubeList.add(new ModelBox(arm3base, 30, 85, -2.0F, -0.62F, -3.0F, 4, 1, 3, 0.0F, false));

        this.arm3a = new ModelRenderer(this);
        this.arm3a.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm3base.addChild(arm3a);
        this.setRotateAngle(arm3a, 0.0F, -1.2654F, 0.0F);
        this.arm3a.cubeList.add(new ModelBox(arm3a, 0, 13, -1.5F, -0.5F, -11.0F, 3, 1, 11, 0.0F, false));

        this.arm3b = new ModelRenderer(this);
        this.arm3b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.arm3a.addChild(arm3b);
        this.setRotateAngle(arm3b, 0.0F, -0.9163F, 0.0F);
        this.arm3b.cubeList.add(new ModelBox(arm3b, 45, 44, -1.0F, -0.5F, -10.0F, 2, 1, 10, 0.0F, false));

        this.arm3c = new ModelRenderer(this);
        this.arm3c.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.arm3b.addChild(arm3c);
        this.setRotateAngle(arm3c, 0.0F, -0.6545F, 0.0F);
        this.arm3c.cubeList.add(new ModelBox(arm3c, 25, 74, -1.0F, -0.5F, -9.0F, 2, 1, 9, 0.0F, false));

        this.arm3d = new ModelRenderer(this);
        this.arm3d.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arm3c.addChild(arm3d);
        this.setRotateAngle(arm3d, 0.0F, -0.5236F, 0.0F);
        this.arm3d.cubeList.add(new ModelBox(arm3d, 17, 28, -0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F, false));

        this.arm3e = new ModelRenderer(this);
        this.arm3e.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.arm3d.addChild(arm3e);
        this.setRotateAngle(arm3e, 0.0F, 0.3054F, 0.0F);
        this.arm3e.cubeList.add(new ModelBox(arm3e, 32, 30, -0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F, false));

        this.arm4base = new ModelRenderer(this);
        this.arm4base.setRotationPoint(-1.0F, -0.5F, 1.2F);
        this.core.addChild(arm4base);
        this.setRotateAngle(arm4base, 0.0F, 2.4435F, 0.0F);
        this.arm4base.cubeList.add(new ModelBox(arm4base, 62, 74, -2.0F, -0.6F, -3.0F, 4, 1, 3, 0.0F, false));

        this.arm4a = new ModelRenderer(this);
        this.arm4a.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm4base.addChild(arm4a);
        this.setRotateAngle(arm4a, 0.0F, -0.5672F, 0.0F);
        this.arm4a.cubeList.add(new ModelBox(arm4a, 0, 0, -1.5F, -0.5F, -11.0F, 3, 1, 11, 0.0F, false));

        this.arm4b = new ModelRenderer(this);
        this.arm4b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.arm4a.addChild(arm4b);
        this.setRotateAngle(arm4b, 0.0F, -0.8727F, 0.0F);
        this.arm4b.cubeList.add(new ModelBox(arm4b, 36, 0, -1.0F, -0.5F, -10.0F, 2, 1, 10, 0.0F, false));

        this.arm4c = new ModelRenderer(this);
        this.arm4c.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.arm4b.addChild(arm4c);
        this.setRotateAngle(arm4c, 0.0F, -0.8727F, 0.0F);
        this.arm4c.cubeList.add(new ModelBox(arm4c, 47, 30, -1.0F, -0.5F, -9.0F, 2, 1, 9, 0.0F, false));

        this.arm4d = new ModelRenderer(this);
        this.arm4d.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arm4c.addChild(arm4d);
        this.setRotateAngle(arm4d, 0.0F, 1.0036F, 0.0F);
        this.arm4d.cubeList.add(new ModelBox(arm4d, 15, 74, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.arm4d_r1 = new ModelRenderer(this);
        this.arm4d_r1.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm4d.addChild(arm4d_r1);
        this.setRotateAngle(arm4d_r1, 0.0F, -0.1745F, 0.0F);
        this.arm4d_r1.cubeList.add(new ModelBox(arm4d_r1, 50, 20, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.arm4e = new ModelRenderer(this);
        this.arm4e.setRotationPoint(1.2F, 0.0F, -11.5F);
        this.arm4d.addChild(arm4e);
        this.setRotateAngle(arm4e, 0.0F, -0.5236F, 0.0F);
        this.arm4e.cubeList.add(new ModelBox(arm4e, 57, 56, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm4e2 = new ModelRenderer(this);
        this.arm4e2.setRotationPoint(-0.5647F, 0.0F, -4.6289F);
        this.arm4e.addChild(arm4e2);
        this.setRotateAngle(arm4e2, 0.0F, -0.3054F, 0.0F);


        this.arm4e_r1 = new ModelRenderer(this);
        this.arm4e_r1.setRotationPoint(0.4647F, 0.0F, 0.1471F);
        this.arm4e2.addChild(arm4e_r1);
        this.setRotateAngle(arm4e_r1, 0.0F, 0.6981F, 0.0F);
        this.arm4e_r1.cubeList.add(new ModelBox(arm4e_r1, 32, 58, -0.5F, -0.5F, -6.9F, 1, 1, 7, 0.0F, false));

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
