package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonOttoia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail;
    private final ModelRenderer body18;
    private final ModelRenderer body17;
    private final ModelRenderer body16;
    private final ModelRenderer body15;
    private final ModelRenderer body14;
    private final ModelRenderer body13;
    private final ModelRenderer body12;
    private final ModelRenderer body11;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body10;
    private final ModelRenderer body9;
    private final ModelRenderer body8;
    private final ModelRenderer body7;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer body5;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer body3;
    private final ModelRenderer body2;
    private final ModelRenderer body1;
    private final ModelRenderer head;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer mouth;
    private final ModelRenderer mouth2;
    private final ModelRenderer cube_r13;

    public ModelSkeletonOttoia() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-20.023F, -0.5F, 14.3719F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5585F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 69, 32, -0.2198F, -0.5F, 0.316F, 10, 1, 16, 0.001F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(2.4244F, -0.5F, 14.7169F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -14.9F, -0.5F, -17.5F, 29, 1, 30, -0.015F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-17.9945F, -0.5F, -1.1872F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1309F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 32, -0.1679F, -0.5F, -16.0568F, 18, 1, 32, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.214F, -0.5F, -1.2193F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -2.2689F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 66, -11.5F, -0.5F, -9.5F, 23, 1, 17, -0.01F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.2F, -1.0F, -4.8F);
        this.fossil.addChild(tail);
        this.setRotateAngle(tail, 3.098F, 0.0F, 1.5708F);
        this.tail.cubeList.add(new ModelBox(tail, 15, 0, 0.0F, 2.0F, -1.0F, 0, 1, 2, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 20, 17, -0.05F, -1.0F, -1.5F, 0, 3, 3, 0.0F, false));

        this.body18 = new ModelRenderer(this);
        this.body18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(body18);
        this.setRotateAngle(body18, 0.3054F, 0.0F, 0.0F);
        this.body18.cubeList.add(new ModelBox(body18, 10, 0, -0.09F, -3.0F, -2.01F, 0, 3, 4, 0.0F, false));

        this.body17 = new ModelRenderer(this);
        this.body17.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body18.addChild(body17);
        this.setRotateAngle(body17, 0.1745F, 0.0F, 0.0F);
        this.body17.cubeList.add(new ModelBox(body17, 83, 50, -0.04F, -2.0F, -2.4F, 0, 2, 5, 0.0F, false));

        this.body16 = new ModelRenderer(this);
        this.body16.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body17.addChild(body16);
        this.body16.cubeList.add(new ModelBox(body16, 0, 44, -0.09F, -3.0F, -3.51F, 0, 3, 7, 0.0F, false));

        this.body15 = new ModelRenderer(this);
        this.body15.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body16.addChild(body15);
        this.setRotateAngle(body15, 0.2182F, 0.0F, 0.0F);
        this.body15.cubeList.add(new ModelBox(body15, 0, 0, -0.11F, -3.0F, -4.5F, 0, 3, 9, 0.0F, false));

        this.body14 = new ModelRenderer(this);
        this.body14.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body15.addChild(body14);
        this.setRotateAngle(body14, 0.1745F, 0.0F, 0.0F);
        this.body14.cubeList.add(new ModelBox(body14, 10, 4, -0.09F, -3.0F, -4.51F, 0, 3, 9, 0.0F, false));

        this.body13 = new ModelRenderer(this);
        this.body13.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body14.addChild(body13);
        this.setRotateAngle(body13, 0.1745F, 0.0F, 0.0F);
        this.body13.cubeList.add(new ModelBox(body13, 0, 13, -0.13F, -3.0F, -4.5F, 0, 3, 9, 0.0F, false));

        this.body12 = new ModelRenderer(this);
        this.body12.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body13.addChild(body12);
        this.setRotateAngle(body12, 0.2182F, 0.0F, 0.0F);
        this.body12.cubeList.add(new ModelBox(body12, 10, 17, -0.09F, -3.0F, -4.51F, 0, 3, 9, 0.0F, false));

        this.body11 = new ModelRenderer(this);
        this.body11.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body12.addChild(body11);
        this.setRotateAngle(body11, 0.0873F, 0.0F, 0.0F);
        this.body11.cubeList.add(new ModelBox(body11, 10, 35, -0.12F, -2.0F, -4.5F, 0, 2, 9, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.1F, -1.0F, 0.0F);
        this.body11.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 32, 0.0F, -1.0F, -4.5F, 0, 2, 9, 0.0F, false));

        this.body10 = new ModelRenderer(this);
        this.body10.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body11.addChild(body10);
        this.setRotateAngle(body10, 0.1309F, 0.0F, 0.0F);
        this.body10.cubeList.add(new ModelBox(body10, 0, 66, -0.09F, -2.0F, -3.51F, 0, 2, 7, 0.0F, false));

        this.body9 = new ModelRenderer(this);
        this.body9.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body10.addChild(body9);
        this.setRotateAngle(body9, 0.2182F, 0.0F, 0.0F);
        this.body9.cubeList.add(new ModelBox(body9, 15, 47, -0.1F, -2.0F, -3.6F, 0, 3, 7, 0.0F, false));
        this.body9.cubeList.add(new ModelBox(body9, 27, 17, -0.2F, -1.9564F, -0.3019F, 0, 3, 1, 0.0F, false));

        this.body8 = new ModelRenderer(this);
        this.body8.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body9.addChild(body8);
        this.setRotateAngle(body8, 0.2182F, 0.0F, 0.0F);
        this.body8.cubeList.add(new ModelBox(body8, 69, 50, -0.09F, -2.0F, -2.81F, 0, 3, 6, 0.0F, false));

        this.body7 = new ModelRenderer(this);
        this.body7.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body8.addChild(body7);
        this.setRotateAngle(body7, 0.2618F, 0.0F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 0, 55, -0.12F, -2.0F, -2.5F, 0, 3, 5, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.2F, 0.5F, 0.0F);
        this.body7.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 5, 0.0F, -1.5F, -0.6F, 0, 3, 1, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body7.addChild(body6);
        this.setRotateAngle(body6, 0.2182F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 72, 72, -0.09F, -2.0F, -2.51F, 0, 3, 5, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.19F, -0.5F, -0.01F);
        this.body6.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 17, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body6.addChild(body5);
        this.setRotateAngle(body5, 0.0873F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 77, 55, -0.13F, -2.0F, -2.5F, 0, 3, 5, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body5.addChild(body4);
        this.setRotateAngle(body4, 0.1309F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 78, 66, -0.09F, -2.0F, -2.51F, 0, 3, 5, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.19F, 0.5F, -0.01F);
        this.body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 17, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body4.addChild(body3);
        this.setRotateAngle(body3, 0.0873F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 78, 80, -0.12F, -2.0F, -2.5F, 0, 3, 5, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 10, 17, -0.2F, -2.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body3.addChild(body2);
        this.setRotateAngle(body2, 0.1309F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 13, 0.01F, -2.0F, -2.01F, 0, 3, 4, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -2.3F, -0.1F);
        this.body2.addChild(body1);
        this.setRotateAngle(body1, 0.1745F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -0.01F, -3.0F, -2.0F, 0, 4, 4, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body1.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 20, 32, -0.11F, -4.0F, -2.5F, 0, 4, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 64, 66, 0.0F, -4.0F, -3.0F, 0, 4, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 25, 0, -0.12F, -4.01F, -0.5F, 0, 4, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.08F, -4.4296F, 1.3937F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.9635F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 5, 0, 0.0F, 2.3F, 1.5F, 0, 2, 1, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.08F, -4.3063F, 2.8025F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.2217F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, -1.0F, 0.1F, 0, 2, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.08F, -4.3679F, 2.0981F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.8727F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 0, 0.0F, -0.5F, -1.0F, 0, 2, 1, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.11F, -4.6F, -1.5F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5236F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 13, 0.03F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.mouth = new ModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head.addChild(mouth);
        this.mouth.cubeList.add(new ModelBox(mouth, 20, 0, -0.1F, -6.0F, -1.0F, 0, 7, 2, 0.0F, false));

        this.mouth2 = new ModelRenderer(this);
        this.mouth2.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.mouth.addChild(mouth2);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.13F, -3.0F, 0.0F);
        this.mouth2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.7854F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 7, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

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
