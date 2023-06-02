package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAphetoceras extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer root;
    private final ModelRenderer shellbase;
    private final ModelRenderer shell1;
    private final ModelRenderer shell2;
    private final ModelRenderer shell3;
    private final ModelRenderer shell4;
    private final ModelRenderer shell5;
    private final ModelRenderer shell6;
    private final ModelRenderer shell7;
    private final ModelRenderer shell8;
    private final ModelRenderer shell9;
    private final ModelRenderer shell10;
    private final ModelRenderer shell11;
    private final ModelRenderer shell12;
    private final ModelRenderer shelltip;

    public ModelSkeletonAphetoceras() {
        this.textureWidth = 176;
        this.textureHeight = 150;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(20.0F, -2.0F, 0.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.3491F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 69, 52, -18.0F, -4.0F, -12.0F, 22, 6, 25, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(11.0389F, -6.0F, -13.0108F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.0908F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 79, 0, -5.7F, -7.0F, -6.0F, 16, 14, 18, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(19.9741F, -4.5F, -2.6768F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1309F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 52, -9.5F, -2.5F, -19.0F, 18, 8, 32, 0.002F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(13.0603F, -10.0F, 33.3399F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -6.5F, 0.0F, -57.0F, 19, 11, 40, 0.005F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.shellbase = new ModelRenderer(this);
        this.shellbase.setRotationPoint(18.0F, 16.9F, 0.0F);
        this.root.addChild(shellbase);
        this.setRotateAngle(shellbase, 0.0F, 0.0F, -0.7418F);
        this.shellbase.cubeList.add(new ModelBox(shellbase, 0, 93, -6.5F, -6.4F, -10.0F, 13, 13, 10, 0.0F, false));

        this.shell1 = new ModelRenderer(this);
        this.shell1.setRotationPoint(0.0F, 1.1F, -2.6F);
        this.shellbase.addChild(shell1);
        this.setRotateAngle(shell1, 0.4538F, 0.0F, 0.0F);
        this.shell1.cubeList.add(new ModelBox(shell1, 86, 84, -6.0F, -6.0F, 0.0F, 12, 12, 15, 0.0F, false));

        this.shell2 = new ModelRenderer(this);
        this.shell2.setRotationPoint(-1.0F, 1.9F, 12.1F);
        this.shell1.addChild(shell2);
        this.setRotateAngle(shell2, 0.4887F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 47, 100, -4.5F, -6.5F, 0.0F, 11, 11, 12, 0.0F, false));

        this.shell3 = new ModelRenderer(this);
        this.shell3.setRotationPoint(1.0F, 0.1F, 9.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, 0.6109F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 81, 112, -5.0F, -5.0F, 0.0F, 10, 10, 13, 0.0F, false));

        this.shell4 = new ModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.9F, 11.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, 0.4887F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 0, 0, -4.5F, -4.5F, 0.0F, 9, 9, 10, 0.0F, false));

        this.shell5 = new ModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.8F, 7.9F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, 0.4887F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 0, 117, -4.0F, -4.0F, 0.0F, 8, 8, 12, 0.0F, false));

        this.shell6 = new ModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.7F, 10.2F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, 0.5236F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 0, 20, -3.5F, -3.5F, 0.0F, 7, 7, 11, 0.0F, false));

        this.shell7 = new ModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.7F, 9.2F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, 0.5236F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 119, 33, -3.0F, -3.0F, 0.0F, 6, 6, 10, 0.0F, false));

        this.shell8 = new ModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.6F, 8.3F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, 0.6632F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 0, 52, -2.5F, -2.5F, 0.0F, 5, 5, 9, 0.0F, false));

        this.shell9 = new ModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, 0.2F, 7.8F);
        this.shell8.addChild(shell9);
        this.setRotateAngle(shell9, 0.5585F, 0.0F, 0.0F);
        this.shell9.cubeList.add(new ModelBox(shell9, 0, 67, -2.0F, -2.0F, 0.0F, 4, 4, 7, 0.0F, false));

        this.shell10 = new ModelRenderer(this);
        this.shell10.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.shell9.addChild(shell10);
        this.setRotateAngle(shell10, 0.6283F, 0.0F, 0.0F);
        this.shell10.cubeList.add(new ModelBox(shell10, 79, 0, -1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F, false));

        this.shell11 = new ModelRenderer(this);
        this.shell11.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.shell10.addChild(shell11);
        this.setRotateAngle(shell11, 0.5585F, 0.0F, 0.0F);
        this.shell11.cubeList.add(new ModelBox(shell11, 79, 9, -1.0F, -1.5F, 0.0F, 2, 3, 5, 0.0F, false));

        this.shell12 = new ModelRenderer(this);
        this.shell12.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.shell11.addChild(shell12);
        this.setRotateAngle(shell12, 0.6283F, 0.0F, 0.0F);
        this.shell12.cubeList.add(new ModelBox(shell12, 26, 20, -0.5F, -1.5F, 0.0F, 1, 3, 5, 0.0F, false));

        this.shelltip = new ModelRenderer(this);
        this.shelltip.setRotationPoint(0.0F, -1.5F, 1.2F);
        this.shell12.addChild(shelltip);
        this.setRotateAngle(shelltip, 0.9317F, 0.0F, 0.0F);
        this.shelltip.cubeList.add(new ModelBox(shelltip, 69, 52, 0.0F, -5.0F, 0.0F, 0, 10, 10, 0.0F, false));

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
