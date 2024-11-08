package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAlienum extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer main;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r8;

    public ModelSkeletonAlienum() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-3.2422F, 23.0F, -2.231F);
        this.setRotateAngle(fossil, 1.5708F, 0.0F, -1.5708F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -1.0F, -3.0828F, -11.569F, 1, 12, 17, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.0828F, -11.569F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3229F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 30, -1.0F, 0.0F, 0.0F, 1, 6, 13, 0.02F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -7.1578F, 0.756F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6807F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 30, -1.0F, -0.025F, 0.0F, 1, 5, 8, 0.01F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.1578F, 6.981F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 44, -1.0F, 0.0F, -2.0F, 1, 9, 2, 0.03F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(-0.45F, 2.9172F, -1.819F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.0873F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.25F, 2.0F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 39, 0, -0.45F, -0.75F, -8.0F, 1, 4, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 31, 44, -0.4F, -0.25F, -7.0F, 1, 3, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 50, -0.45F, -0.75F, -0.5F, 1, 2, 1, -0.001F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.75F, -8.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2443F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 22, -0.45F, 2.0F, 0.5F, 1, 1, 1, 0.001F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 50, -0.45F, 0.0F, 0.0F, 1, 3, 1, -0.002F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.975F, 3.3028F, 1.0621F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 39, 13, -1.45F, 0.0F, -8.0F, 1, 1, 7, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 4.1637F, -0.0599F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.7017F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 22, -1.45F, 0.0F, 0.0F, 1, 1, 4, -0.002F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.25F, 0.4F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 50, -0.45F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -0.075F, 2.375F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 50, -0.95F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail.addChild(tail2);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.05F, -0.3F, -0.2F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1614F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 51, -1.45F, -0.3673F, -0.0846F, 1, 1, 1, 0.0F, false));

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
