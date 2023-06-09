package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMaclurina extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer shell;
    private final ModelRenderer body3;
    private final ModelRenderer shell3;
    private final ModelRenderer body4;
    private final ModelRenderer shell4;
    private final ModelRenderer body8;
    private final ModelRenderer shell8;
    private final ModelRenderer body7;
    private final ModelRenderer shell7;

    public ModelSkeletonMaclurina() {
        this.textureWidth = 128;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(1.0F, 26.0F, -1.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 55, -8.0F, -9.0F, -8.0F, 16, 7, 18, -0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 63, 41, -10.0F, -12.0F, -6.0F, 11, 10, 14, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, -4.5F, 0.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -11.0F, -2.5F, -10.5F, 22, 5, 21, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-5.0822F, -3.5F, 2.8815F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.9163F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 29, -9.4F, -1.5F, -6.0F, 18, 3, 20, 0.005F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-4.0F, -3.5F, -2.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 29, -9.0F, -1.5F, -10.0F, 18, 3, 20, 0.003F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(2.9F, -10.6F, -5.3F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, -0.4408F, -0.1964F, -0.3922F);


        this.shell = new ModelRenderer(this);
        this.shell.setRotationPoint(-0.7231F, 4.2831F, 0.0F);
        this.body.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 66, 0, -2.0F, -6.0F, -1.0F, 4, 5, 7, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(-6.0F, -2.7F, -4.5F);
        this.fossil.addChild(body3);
        this.setRotateAngle(body3, -1.6967F, -0.4114F, 1.5613F);


        this.shell3 = new ModelRenderer(this);
        this.shell3.setRotationPoint(-6.2005F, 1.6768F, -2.3F);
        this.body3.addChild(shell3);
        this.setRotateAngle(shell3, -0.9599F, 0.2182F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 66, 0, -2.0F, -6.0F, -1.0F, 4, 5, 7, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(9.1F, -7.9F, 6.5F);
        this.fossil.addChild(body4);
        this.setRotateAngle(body4, -0.6205F, -1.0258F, 1.5403F);


        this.shell4 = new ModelRenderer(this);
        this.shell4.setRotationPoint(-0.3883F, 0.5052F, -3.6587F);
        this.body4.addChild(shell4);
        this.setRotateAngle(shell4, -0.9599F, 0.2182F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 66, 0, -2.0F, -6.0F, -1.0F, 4, 5, 7, 0.0F, false));

        this.body8 = new ModelRenderer(this);
        this.body8.setRotationPoint(-4.5F, -14.0F, 0.5F);
        this.fossil.addChild(body8);
        this.setRotateAngle(body8, 1.0488F, -0.6429F, -0.2187F);


        this.shell8 = new ModelRenderer(this);
        this.shell8.setRotationPoint(-0.3883F, 0.5052F, -3.6587F);
        this.body8.addChild(shell8);
        this.setRotateAngle(shell8, -0.9599F, 0.2182F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 66, 0, -2.0F, -6.0F, -1.0F, 4, 5, 7, 0.0F, false));

        this.body7 = new ModelRenderer(this);
        this.body7.setRotationPoint(-2.7F, -5.0F, 10.2F);
        this.fossil.addChild(body7);
        this.setRotateAngle(body7, -0.7726F, 1.3479F, -1.8985F);


        this.shell7 = new ModelRenderer(this);
        this.shell7.setRotationPoint(-0.3883F, 0.5052F, -3.6587F);
        this.body7.addChild(shell7);
        this.setRotateAngle(shell7, -0.9599F, 0.2182F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 66, 0, -2.0F, -6.0F, -1.0F, 4, 5, 7, 0.0F, false));

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
