package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonArandaspis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer root;
    private final ModelRenderer Bodyhead;
    private final ModelRenderer Bodyhead_r1;
    private final ModelRenderer Head1;
    private final ModelRenderer Headunderside1;
    private final ModelRenderer Head2;
    private final ModelRenderer Headunderside2;
    private final ModelRenderer Headslope2;
    private final ModelRenderer Headslope1;

    public ModelSkeletonArandaspis() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 26, 20, -5.0F, -2.0F, -3.0F, 12, 3, 5, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -1.2F, -4.0F, -15.0F, 12, 5, 14, 0.002F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 40, -5.9209F, -6.0F, -9.6145F, 5, 7, 7, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 28, 31, -0.9209F, -5.0F, -20.6145F, 9, 6, 9, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0653F, -2.5F, -4.6363F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 0, -5.0F, -1.0F, -4.5F, 10, 3, 9, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.5F, -4.5F, -12.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.3491F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 20, -2.6F, -2.5F, -5.5F, 7, 8, 11, -0.003F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Bodyhead = new ModelRenderer(this);
        this.Bodyhead.setRotationPoint(-1.1F, 17.5F, -9.2F);
        this.root.addChild(Bodyhead);
        this.setRotateAngle(Bodyhead, 0.3912F, -0.4637F, -1.0856F);
        this.Bodyhead.cubeList.add(new ModelBox(Bodyhead, 61, 24, -3.5F, -1.5F, -1.0F, 7, 2, 2, 0.0F, false));
        this.Bodyhead.cubeList.add(new ModelBox(Bodyhead, 0, 0, -2.5F, -1.5F, 1.0F, 5, 1, 1, 0.0F, false));
        this.Bodyhead.cubeList.add(new ModelBox(Bodyhead, 15, 67, -3.5F, 0.5F, -1.0F, 7, 1, 1, 0.0F, false));
        this.Bodyhead.cubeList.add(new ModelBox(Bodyhead, 56, 35, -3.5F, 4.5F, -2.0F, 7, 1, 3, 0.0F, false));
        this.Bodyhead.cubeList.add(new ModelBox(Bodyhead, 59, 60, -3.5F, 3.5F, -2.0F, 7, 1, 2, 0.0F, false));
        this.Bodyhead.cubeList.add(new ModelBox(Bodyhead, 56, 29, -3.5F, 5.5F, -2.0F, 7, 1, 4, 0.0F, false));
        this.Bodyhead.cubeList.add(new ModelBox(Bodyhead, 63, 64, -3.5F, -1.5F, -2.0F, 7, 4, 1, 0.0F, false));
        this.Bodyhead.cubeList.add(new ModelBox(Bodyhead, 25, 47, -3.5F, -1.5F, -6.0F, 7, 8, 4, 0.0F, false));
        this.Bodyhead.cubeList.add(new ModelBox(Bodyhead, 48, 47, -3.0F, -1.0F, -2.0F, 6, 7, 5, 0.003F, false));

        this.Bodyhead_r1 = new ModelRenderer(this);
        this.Bodyhead_r1.setRotationPoint(1.1F, 2.5F, 3.2F);
        this.Bodyhead.addChild(Bodyhead_r1);
        this.setRotateAngle(Bodyhead_r1, 0.0F, -0.6981F, 0.0F);
        this.Bodyhead_r1.cubeList.add(new ModelBox(Bodyhead_r1, 56, 13, -4.0F, -3.0F, -1.5F, 5, 6, 4, 0.003F, false));

        this.Head1 = new ModelRenderer(this);
        this.Head1.setRotationPoint(0.0F, 0.0F, -5.9F);
        this.Bodyhead.addChild(Head1);
        this.Head1.cubeList.add(new ModelBox(Head1, 0, 55, -3.0F, 0.0F, -4.0F, 6, 5, 4, 0.0F, false));

        this.Headunderside1 = new ModelRenderer(this);
        this.Headunderside1.setRotationPoint(-0.01F, 6.5F, -0.1F);
        this.Head1.addChild(Headunderside1);
        this.setRotateAngle(Headunderside1, -0.3821F, 0.0F, 0.0F);
        this.Headunderside1.cubeList.add(new ModelBox(Headunderside1, 42, 60, -3.0F, -2.0F, -4.0F, 6, 2, 4, 0.0F, false));

        this.Head2 = new ModelRenderer(this);
        this.Head2.setRotationPoint(0.0F, 2.5F, -3.9F);
        this.Head1.addChild(Head2);
        this.Head2.cubeList.add(new ModelBox(Head2, 66, 46, -2.5F, -1.5F, -2.0F, 5, 3, 2, 0.0F, false));

        this.Headunderside2 = new ModelRenderer(this);
        this.Headunderside2.setRotationPoint(-0.01F, 2.5F, 0.2F);
        this.Head2.addChild(Headunderside2);
        this.setRotateAngle(Headunderside2, -0.4245F, 0.0F, 0.0F);
        this.Headunderside2.cubeList.add(new ModelBox(Headunderside2, 65, 40, -2.0F, -2.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.Headslope2 = new ModelRenderer(this);
        this.Headslope2.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.Head2.addChild(Headslope2);
        this.setRotateAngle(Headslope2, 0.4426F, 0.0F, 0.0F);
        this.Headslope2.cubeList.add(new ModelBox(Headslope2, 0, 65, -2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.Headslope1 = new ModelRenderer(this);
        this.Headslope1.setRotationPoint(0.01F, -1.5F, -0.1F);
        this.Head1.addChild(Headslope1);
        this.setRotateAngle(Headslope1, 0.3821F, 0.0F, 0.0F);
        this.Headslope1.cubeList.add(new ModelBox(Headslope1, 21, 60, -3.0F, 0.0F, -4.0F, 6, 2, 4, 0.0F, false));

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
