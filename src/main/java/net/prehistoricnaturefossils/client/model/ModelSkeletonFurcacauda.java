package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonFurcacauda extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer body;
    private final ModelRenderer eyeL_r1;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer fin_r1;
    private final ModelRenderer cube_r12;

    public ModelSkeletonFurcacauda() {
        this.textureWidth = 86;
        this.textureHeight = 42;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(4.0F, 24.0F, -3.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -12.0F, -2.0F, -11.0F, 16, 2, 26, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0F, -1.5708F);


        this.eyeL_r1 = new ModelRenderer(this);
        this.eyeL_r1.setRotationPoint(-3.75F, -3.5F, -6.5F);
        this.body.addChild(eyeL_r1);
        this.setRotateAngle(eyeL_r1, 0.0F, 3.1416F, 0.0F);
        this.eyeL_r1.cubeList.add(new ModelBox(eyeL_r1, 9, 3, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.9F, -0.4773F, -2.7267F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5236F, 0.0F, -3.1416F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 16, 0.0F, -0.5F, -2.5F, 0, 1, 5, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.9F, -7.2875F, -0.7369F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, -3.1416F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 8, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.8F, -4.0F, 0.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -3.1416F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 29, 0.0F, -3.0F, -3.0F, 0, 6, 6, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.91F, -4.4641F, -4.957F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6109F, 0.0F, -3.1416F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 29, 0.0F, -1.0F, -3.0F, 0, 2, 6, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.85F, -2.743F, -4.4414F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, -3.1416F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 19, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.89F, -3.5F, -4.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0F, -1.5F, -1.0F, 0, 3, 2, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.815F, -0.6173F, 2.0307F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5236F, 0.0F, 3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 0, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.885F, -1.0953F, -0.2241F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, -3.1416F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 0, 0.0F, -1.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.885F, -1.9065F, -5.1832F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, -3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 29, 0.0F, -0.5F, -2.5F, 0, 1, 5, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -4.0F, 3.0F);
        this.body.addChild(tail);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.8F, 0.0F, 0.5F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 14, 0.0F, -3.0F, -0.5F, 0, 6, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.79F, -3.1821F, 4.6186F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, -3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 16, 0.0F, -0.5F, -4.0F, 0, 1, 8, 0.0F, false));

        this.fin_r1 = new ModelRenderer(this);
        this.fin_r1.setRotationPoint(-3.8F, 0.0F, 4.0F);
        this.tail.addChild(fin_r1);
        this.setRotateAngle(fin_r1, 0.0F, 0.0F, -3.1416F);
        this.fin_r1.cubeList.add(new ModelBox(fin_r1, 0, 0, 0.0F, -3.5F, -3.0F, 0, 7, 6, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.79F, 3.2343F, 4.7507F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, -3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 6, 0.0F, -0.5F, -4.0F, 0, 1, 8, 0.0F, false));

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
