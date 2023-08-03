package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonConodont extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer head;
    private final ModelRenderer eyeR;
    private final ModelRenderer eyeL;
    private final ModelRenderer mouth;
    private final ModelRenderer gill;
    private final ModelRenderer body;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer body4;
    private final ModelRenderer body5;
    private final ModelRenderer body6;
    private final ModelRenderer body7;
    private final ModelRenderer body8;
    private final ModelRenderer body9;
    private final ModelRenderer body10;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonConodont() {
        this.textureWidth = 352;
        this.textureHeight = 200;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -30.8F, -2.0F, -65.9F, 26, 2, 90, -0.004F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(2.5F, -1.0F, -65.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1309F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 93, -7.5F, -1.0F, 0.0F, 25, 2, 89, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(29.0266F, -1.0F, 36.1513F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.7453F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 140, 93, 0.5301F, -1.0F, -13.2044F, 86, 2, 13, -0.004F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-21.3F, -1.0F, 24.1F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5672F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 140, 109, -0.5F, -1.0F, 0.0F, 37, 2, 37, -0.007F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-8.0F, -1.5F, -45.0F);
        this.fossil.addChild(head);
        this.setRotateAngle(head, 0.0F, 0.3927F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 41, 10, -1.5F, -1.0F, -7.0F, 3, 0, 4, 0.0F, false));

        this.eyeR = new ModelRenderer(this);
        this.eyeR.setRotationPoint(-1.0F, -3.0F, -6.0F);
        this.head.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, -0.2182F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 3, -1.75F, 1.95F, -1.25F, 2, 0, 2, 0.0F, false));

        this.eyeL = new ModelRenderer(this);
        this.eyeL.setRotationPoint(1.0F, -3.0F, -6.0F);
        this.head.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, 0.2182F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 0, 0, -0.25F, 1.95F, -1.25F, 2, 0, 2, 0.0F, false));

        this.mouth = new ModelRenderer(this);
        this.mouth.setRotationPoint(-0.9F, -1.65F, -5.25F);
        this.head.addChild(mouth);
        this.mouth.cubeList.add(new ModelBox(mouth, 33, 25, -1.49F, 1.0F, -1.75F, 3, 0, 4, 0.0F, false));

        this.gill = new ModelRenderer(this);
        this.gill.setRotationPoint(0.0F, -2.5F, -3.0F);
        this.head.addChild(gill);
        this.setRotateAngle(gill, 0.0F, -0.1745F, 0.0F);
        this.gill.cubeList.add(new ModelBox(gill, 11, 0, -1.5F, 1.49F, 0.0F, 3, 0, 9, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.gill.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 35, 17, -1.5F, 1.5F, 0.0F, 3, 0, 6, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 32, 32, -1.5F, 1.49F, 0.0F, 3, 0, 6, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, -0.1309F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 13, 32, -1.5F, 1.5F, 0.0F, 3, 0, 6, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0F, -0.2182F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 31, -1.5F, 1.49F, 0.0F, 3, 0, 6, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.0F, -0.2182F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 28, 10, -1.5F, 1.5F, 0.0F, 3, 0, 6, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0F, -0.0873F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 27, 0, -1.5F, 1.49F, 0.0F, 3, 0, 6, 0.0F, false));

        this.body7 = new ModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, 0.0F, 0.1309F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 20, 25, -1.5F, 1.5F, 0.0F, 3, 0, 6, 0.0F, false));

        this.body8 = new ModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body7.addChild(body8);
        this.setRotateAngle(body8, 0.0F, 0.2182F, 0.0F);
        this.body8.cubeList.add(new ModelBox(body8, 7, 24, -1.5F, 1.49F, 0.0F, 3, 0, 6, 0.0F, false));

        this.body9 = new ModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body8.addChild(body9);
        this.setRotateAngle(body9, 0.0F, 0.1745F, 0.0F);
        this.body9.cubeList.add(new ModelBox(body9, 22, 18, -1.5F, 1.5F, 0.0F, 3, 0, 6, 0.0F, false));

        this.body10 = new ModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body9.addChild(body10);
        this.setRotateAngle(body10, 0.2182F, 0.0F, 1.5708F);
        this.body10.cubeList.add(new ModelBox(body10, 26, 39, 1.5F, -1.51F, 0.0F, 0, 3, 6, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.5F, 0.0F, 6.0F);
        this.body10.addChild(tail1);
        this.setRotateAngle(tail1, 0.2618F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 13, 39, 1.0F, -1.5F, 0.0F, 0, 3, 6, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.3927F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 39, 39, 1.0F, -1.51F, 0.0F, 0, 3, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 10, 1.3F, -4.0F, 0.0F, 0, 7, 6, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 38, 1.0F, -1.5F, 0.0F, 0, 3, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 16, 1.3F, -4.0F, 0.0F, 0, 7, 6, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 40, 1, 0.5F, -1.0F, 0.0F, 0, 2, 6, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 1.3F, -2.5F, 0.0F, 0, 5, 10, 0.0F, false));

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
