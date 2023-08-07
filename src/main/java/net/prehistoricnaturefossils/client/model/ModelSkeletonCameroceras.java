package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCameroceras extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer root;
    private final ModelRenderer head;
    private final ModelRenderer shellbase;
    private final ModelRenderer shell1;
    private final ModelRenderer shell2;
    private final ModelRenderer shell3;
    private final ModelRenderer shell4;
    private final ModelRenderer shell5;
    private final ModelRenderer shell6;
    private final ModelRenderer shell7;
    private final ModelRenderer shell7top;
    private final ModelRenderer shell7bottom;
    private final ModelRenderer shell6top;
    private final ModelRenderer shell6bottom;
    private final ModelRenderer shell5top;
    private final ModelRenderer shell5bottom;
    private final ModelRenderer shell4top;
    private final ModelRenderer shell4bottom;
    private final ModelRenderer shell3top;
    private final ModelRenderer shell3bottom;
    private final ModelRenderer shell2top;
    private final ModelRenderer shell2bottom;

    public ModelSkeletonCameroceras() {
        this.textureWidth = 128;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-7.0F, -0.6065F, -16.4404F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5708F, 0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 120, 42, -3.0F, -25.0678F, -1.448F, 2, 26, 2, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(7.0F, -0.6065F, -16.4404F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.5708F, -0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 120, 42, 1.0F, -25.0678F, -1.448F, 2, 26, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(6.1204F, -0.8501F, 10.6327F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 113, 47, -0.6784F, -16.5187F, -28.5532F, 2, 21, 2, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 113, 47, -0.6784F, -12.5187F, -16.7532F, 2, 13, 2, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 113, 47, -0.4784F, -11.5187F, -3.3532F, 5, 11, 2, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(9.0F, -1.1065F, -14.4404F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0861F, -0.0144F, -0.1652F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 120, 42, -1.0F, -54.8973F, -3.3532F, 2, 56, 2, 0.0F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-9.0F, -1.1065F, -14.4404F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0861F, 0.0144F, 0.1652F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 120, 42, -1.0F, -54.8973F, -3.3532F, 2, 56, 2, -0.004F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -56.0F, -12.0F);
        this.fossil.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 120, 42, -1.0F, 0.0F, -1.0F, 2, 56, 2, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 29.5F, 1.0F);
        this.root.addChild(head);
        this.setRotateAngle(head, -1.5708F, 0.0F, 3.1416F);


        this.shellbase = new ModelRenderer(this);
        this.shellbase.setRotationPoint(0.0F, -1.2F, 17.0F);
        this.head.addChild(shellbase);


        this.shell1 = new ModelRenderer(this);
        this.shell1.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.shellbase.addChild(shell1);


        this.shell2 = new ModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, -1.0F, 3.6F);
        this.shell1.addChild(shell2);
        this.setRotateAngle(shell2, -0.2182F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 0, 26, -5.5F, -4.5F, 1.0F, 11, 2, 17, 0.0F, false));
        this.shell2.cubeList.add(new ModelBox(shell2, 0, 0, -5.5F, -2.5F, 0.0F, 11, 7, 18, 0.0F, false));

        this.shell3 = new ModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, 18.0F);
        this.shell2.addChild(shell3);
        this.shell3.cubeList.add(new ModelBox(shell3, 0, 46, -5.0F, -4.0F, 0.0F, 10, 8, 11, 0.0F, false));

        this.shell4 = new ModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.shell3.addChild(shell4);
        this.shell4.cubeList.add(new ModelBox(shell4, 43, 48, -4.5F, -3.5F, 0.0F, 9, 7, 10, 0.0F, false));

        this.shell5 = new ModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.shell4.addChild(shell5);
        this.shell5.cubeList.add(new ModelBox(shell5, 72, 56, -4.0F, -3.0F, 0.0F, 8, 6, 10, 0.0F, false));

        this.shell6 = new ModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.shell5.addChild(shell6);
        this.shell6.cubeList.add(new ModelBox(shell6, 0, 79, -0.5F, -2.5F, 0.0F, 4, 5, 8, 0.0F, false));
        this.shell6.cubeList.add(new ModelBox(shell6, 25, 79, -2.5F, -2.5F, 0.0F, 2, 3, 8, 0.0F, false));

        this.shell7 = new ModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.shell6.addChild(shell7);
        this.shell7.cubeList.add(new ModelBox(shell7, 0, 0, 2.0F, -2.0F, 0.0F, 1, 2, 7, 0.0F, false));
        this.shell7.cubeList.add(new ModelBox(shell7, 0, 0, -2.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
        this.shell7.cubeList.add(new ModelBox(shell7, 0, 10, 2.0F, 0.0F, 0.0F, 1, 2, 4, 0.0F, false));
        this.shell7.cubeList.add(new ModelBox(shell7, 0, 26, 0.0F, -2.0F, 0.0F, 2, 4, 2, 0.0F, false));

        this.shell7top = new ModelRenderer(this);
        this.shell7top.setRotationPoint(0.0F, -3.0F, 10.0F);
        this.shell7.addChild(shell7top);
        this.shell7top.cubeList.add(new ModelBox(shell7top, 32, 48, 0.5F, 0.0F, -10.0F, 2, 1, 7, 0.0F, false));

        this.shell7bottom = new ModelRenderer(this);
        this.shell7bottom.setRotationPoint(0.0F, 2.0F, 10.0F);
        this.shell7.addChild(shell7bottom);
        this.shell7bottom.cubeList.add(new ModelBox(shell7bottom, 6, 30, 1.5F, 0.0F, -10.0F, 1, 1, 3, 0.0F, false));

        this.shell6top = new ModelRenderer(this);
        this.shell6top.setRotationPoint(0.0F, -3.5F, 10.0F);
        this.shell6.addChild(shell6top);
        this.shell6top.cubeList.add(new ModelBox(shell6top, 51, 18, -2.0F, 0.0F, -10.0F, 5, 1, 8, 0.0F, false));

        this.shell6bottom = new ModelRenderer(this);
        this.shell6bottom.setRotationPoint(0.0F, 2.5F, 10.0F);
        this.shell6.addChild(shell6bottom);
        this.shell6bottom.cubeList.add(new ModelBox(shell6bottom, 30, 66, 1.0F, 0.0F, -10.0F, 2, 1, 8, 0.0F, false));

        this.shell5top = new ModelRenderer(this);
        this.shell5top.setRotationPoint(0.0F, -4.0F, 10.0F);
        this.shell5.addChild(shell5top);
        this.shell5top.cubeList.add(new ModelBox(shell5top, 78, 30, -3.5F, 0.0F, -10.0F, 7, 1, 10, 0.0F, false));

        this.shell5bottom = new ModelRenderer(this);
        this.shell5bottom.setRotationPoint(0.0F, 3.0F, 10.0F);
        this.shell5.addChild(shell5bottom);
        this.shell5bottom.cubeList.add(new ModelBox(shell5bottom, 78, 18, -3.5F, 0.0F, -10.0F, 7, 1, 10, 0.0F, false));

        this.shell4top = new ModelRenderer(this);
        this.shell4top.setRotationPoint(0.0F, -4.5F, 10.0F);
        this.shell4.addChild(shell4top);
        this.shell4top.cubeList.add(new ModelBox(shell4top, 78, 0, -4.0F, 0.0F, -10.0F, 8, 1, 10, 0.0F, false));

        this.shell4bottom = new ModelRenderer(this);
        this.shell4bottom.setRotationPoint(0.0F, 3.5F, 10.0F);
        this.shell4.addChild(shell4bottom);
        this.shell4bottom.cubeList.add(new ModelBox(shell4bottom, 72, 73, -4.0F, 0.0F, -10.0F, 8, 1, 10, 0.0F, false));

        this.shell3top = new ModelRenderer(this);
        this.shell3top.setRotationPoint(0.0F, -5.0F, 10.0F);
        this.shell3.addChild(shell3top);
        this.shell3top.cubeList.add(new ModelBox(shell3top, 41, 66, -4.5F, 0.0F, -10.0F, 9, 1, 11, 0.0F, false));

        this.shell3bottom = new ModelRenderer(this);
        this.shell3bottom.setRotationPoint(0.0F, 4.0F, 10.0F);
        this.shell3.addChild(shell3bottom);
        this.shell3bottom.cubeList.add(new ModelBox(shell3bottom, 0, 66, -4.5F, 0.0F, -10.0F, 9, 1, 11, 0.0F, false));

        this.shell2top = new ModelRenderer(this);
        this.shell2top.setRotationPoint(0.0F, -5.5F, 10.0F);
        this.shell2.addChild(shell2top);
        this.shell2top.cubeList.add(new ModelBox(shell2top, 41, 0, -5.0F, 0.0F, -8.0F, 10, 1, 16, 0.0F, false));

        this.shell2bottom = new ModelRenderer(this);
        this.shell2bottom.setRotationPoint(0.0F, 4.5F, 10.0F);
        this.shell2.addChild(shell2bottom);
        this.shell2bottom.cubeList.add(new ModelBox(shell2bottom, 39, 28, -5.0F, 0.0F, -10.0F, 10, 1, 18, 0.0F, false));

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
