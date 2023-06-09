package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSacabambaspis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer head;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer mouth_r1;
    private final ModelRenderer body1;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer tail1;

    public ModelSkeletonSacabambaspis() {
        this.textureWidth = 128;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(1.0F, 24.0F, -7.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 30, -6.0F, -2.0F, -7.0F, 12, 2, 24, -0.004F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.6537F, -5.0F, 16.6276F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5672F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 0, -1.5F, -2.0F, -2.5F, 9, 7, 11, 0.004F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, -5.0F, 7.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1309F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 57, -2.9F, -5.0F, -11.0F, 4, 10, 18, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.5F, -3.5F, 5.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -6.5F, -3.5F, -11.0F, 13, 7, 22, 0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(2.0F, -2.0F, 16.5F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.5236F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 30, -7.0F, -2.0F, -10.5F, 14, 4, 18, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(5.0F, -0.5F, 7.0F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.0873F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 53, -1.0F, -0.5F, -12.0F, 5, 1, 24, 0.002F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.fossil.addChild(head);
        this.setRotateAngle(head, -0.1446F, -0.27F, 0.4996F);
        this.head.cubeList.add(new ModelBox(head, 49, 19, -1.99F, -5.75F, -7.0F, 4, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 27, 69, -2.5F, -7.0F, 6.25F, 5, 3, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 35, 79, -3.0F, -6.5F, -3.75F, 6, 2, 10, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 30, -3.5F, -4.85F, -2.75F, 7, 3, 4, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 62, -3.51F, -4.35F, -4.1F, 7, 3, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 49, 38, -3.01F, -4.35F, -6.1F, 6, 3, 2, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 45, 69, -3.49F, -5.451F, 0.85F, 7, 1, 5, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 70, -2.49F, -6.7F, -4.3F, 5, 2, 2, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 44, -2.5F, -7.0F, -5.75F, 5, 2, 3, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 57, -2.99F, -4.6F, 1.5F, 6, 3, 2, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 63, 1.8F, -5.25F, -3.45F, 2, 1, 5, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3491F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 10, -4.71F, -5.4F, -5.55F, 1, 1, 4, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.3491F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 46, 3.71F, -5.4F, -5.55F, 1, 1, 4, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.3491F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 5, 2.5F, -6.65F, -5.0F, 2, 1, 3, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, -0.3491F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 49, 0, -4.5F, -6.65F, -5.0F, 2, 1, 3, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 27, 57, -3.5F, -6.75F, -3.4F, 7, 1, 10, 0.0F, false));

        this.mouth_r1 = new ModelRenderer(this);
        this.mouth_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(mouth_r1);
        this.setRotateAngle(mouth_r1, 0.3491F, 0.0F, 0.0F);
        this.mouth_r1.cubeList.add(new ModelBox(mouth_r1, 0, 50, -1.99F, -6.85F, -5.0F, 4, 2, 1, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -5.0F, 8.0F);
        this.head.addChild(body1);
        this.setRotateAngle(body1, 0.0F, 0.0873F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -2.0F, -2.01F, -0.75F, 4, 4, 5, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, 4.25F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.2618F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 49, 30, -1.5F, -1.25F, -1.0F, 3, 3, 4, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, 0.2618F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 79, 0, -1.0F, -1.26F, -1.0F, 2, 3, 4, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(tail1);
        this.setRotateAngle(tail1, 0.0F, 0.3491F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 10, -0.5F, -1.0F, -1.0F, 1, 2, 7, 0.0F, false));

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
