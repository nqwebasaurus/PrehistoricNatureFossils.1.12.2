package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSpriggina extends ModelBase {
    private final ModelRenderer body1;
    private final ModelRenderer head;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer body4;
    private final ModelRenderer body5;
    private final ModelRenderer body6;
    private final ModelRenderer body7;
    private final ModelRenderer body8;
    private final ModelRenderer body9;
    private final ModelRenderer body10;
    private final ModelRenderer body11;
    private final ModelRenderer body12;
    private final ModelRenderer body13;
    private final ModelRenderer head2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body14;
    private final ModelRenderer body15;
    private final ModelRenderer body16;
    private final ModelRenderer body17;
    private final ModelRenderer body18;
    private final ModelRenderer body19;
    private final ModelRenderer body20;
    private final ModelRenderer body21;
    private final ModelRenderer body22;
    private final ModelRenderer body23;
    private final ModelRenderer body24;
    private final ModelRenderer body25;
    private final ModelRenderer block;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;

    public ModelSkeletonSpriggina() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(-1.0F, 23.5F, -12.0F);
        this.setRotateAngle(body1, 0.0F, 1.5708F, 0.0F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-2.5F, -0.525F, 5.3F);
        this.body1.addChild(head);
        this.setRotateAngle(head, -3.1355F, 0.6108F, -3.1309F);
        this.head.cubeList.add(new ModelBox(head, 0, 11, -2.0F, 0.0F, -8.0F, 4, 0, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 4, -1.5F, -0.0095F, -7.9186F, 3, 0, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 34, -1.99F, 0.015F, -6.0F, 4, 0, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, 0.0F, -8.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 15, 0.0F, -0.02F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, 0.0F, -8.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 30, -1.0F, -0.02F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.head.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 31, 33, -2.0F, 0.5F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, 0.0436F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 31, 31, -1.99F, 0.49F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0F, 0.0436F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 31, 29, -2.0F, 0.5F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.0F, 0.0436F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 31, 27, -1.99F, 0.49F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0F, 0.0436F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 31, 25, -2.0F, 0.5F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body7 = new ModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, 0.0F, 0.0873F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 31, 23, -1.99F, 0.49F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body8 = new ModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body7.addChild(body8);
        this.setRotateAngle(body8, 0.0F, 0.0873F, 0.0F);
        this.body8.cubeList.add(new ModelBox(body8, 31, 21, -2.0F, 0.5F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body9 = new ModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 39, 36, -1.49F, 0.49F, 0.0F, 3, 0, 1, 0.0F, false));

        this.body10 = new ModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body9.addChild(body10);
        this.setRotateAngle(body10, 0.0F, 0.0873F, 0.0F);
        this.body10.cubeList.add(new ModelBox(body10, 31, 37, -1.5F, 0.5F, 0.0F, 3, 0, 1, 0.0F, false));

        this.body11 = new ModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body10.addChild(body11);
        this.setRotateAngle(body11, 0.0F, -0.0436F, 0.0F);
        this.body11.cubeList.add(new ModelBox(body11, 9, 36, -1.49F, 0.49F, 0.0F, 3, 0, 1, 0.0F, false));

        this.body12 = new ModelRenderer(this);
        this.body12.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body11.addChild(body12);
        this.setRotateAngle(body12, 0.0F, -0.0873F, 0.0F);
        this.body12.cubeList.add(new ModelBox(body12, 11, 25, -1.0F, 0.5F, 0.0F, 2, 0, 1, 0.0F, false));

        this.body13 = new ModelRenderer(this);
        this.body13.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body12.addChild(body13);
        this.setRotateAngle(body13, 0.0F, -0.0873F, 0.0F);
        this.body13.cubeList.add(new ModelBox(body13, 11, 23, -0.99F, 0.49F, 0.0F, 2, 0, 1, 0.0F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(-18.0F, -0.55F, 0.0F);
        this.body1.addChild(head2);
        this.setRotateAngle(head2, 0.0023F, 0.0436F, -0.0083F);
        this.head2.cubeList.add(new ModelBox(head2, 0, 8, -2.0F, 0.0F, -8.0F, 4, 0, 2, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 0, 0, -1.5F, -0.0345F, -7.9186F, 3, 0, 3, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 0, 31, -1.99F, -0.01F, -6.0F, 4, 0, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, 0.0F, -8.0F);
        this.head2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 1, 0.0F, -0.02F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(2.0F, 0.0F, -8.0F);
        this.head2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 11, -1.0F, -0.02F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body14 = new ModelRenderer(this);
        this.body14.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.head2.addChild(body14);
        this.body14.cubeList.add(new ModelBox(body14, 0, 29, -2.0F, 0.5F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body15 = new ModelRenderer(this);
        this.body15.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body14.addChild(body15);
        this.setRotateAngle(body15, 0.0F, 0.0436F, 0.0F);
        this.body15.cubeList.add(new ModelBox(body15, 0, 27, -1.99F, 0.49F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body16 = new ModelRenderer(this);
        this.body16.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body15.addChild(body16);
        this.setRotateAngle(body16, 0.0F, 0.0436F, 0.0F);
        this.body16.cubeList.add(new ModelBox(body16, 0, 25, -2.0F, 0.5F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body17 = new ModelRenderer(this);
        this.body17.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body16.addChild(body17);
        this.setRotateAngle(body17, 0.0F, 0.0436F, 0.0F);
        this.body17.cubeList.add(new ModelBox(body17, 0, 23, -1.99F, 0.49F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body18 = new ModelRenderer(this);
        this.body18.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body17.addChild(body18);
        this.setRotateAngle(body18, 0.0F, 0.0436F, 0.0F);
        this.body18.cubeList.add(new ModelBox(body18, 0, 21, -2.0F, 0.5F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body19 = new ModelRenderer(this);
        this.body19.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body18.addChild(body19);
        this.setRotateAngle(body19, 0.0F, 0.0436F, 0.0F);
        this.body19.cubeList.add(new ModelBox(body19, 0, 16, -1.99F, 0.49F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body20 = new ModelRenderer(this);
        this.body20.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body19.addChild(body20);
        this.setRotateAngle(body20, 0.0F, 0.0436F, 0.0F);
        this.body20.cubeList.add(new ModelBox(body20, 0, 14, -2.0F, 0.5F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body21 = new ModelRenderer(this);
        this.body21.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body20.addChild(body21);
        this.setRotateAngle(body21, 0.0F, 0.0436F, 0.0F);
        this.body21.cubeList.add(new ModelBox(body21, 0, 36, -1.49F, 0.49F, 0.0F, 3, 0, 1, 0.0F, false));

        this.body22 = new ModelRenderer(this);
        this.body22.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body21.addChild(body22);
        this.setRotateAngle(body22, 0.0F, 0.0436F, 0.0F);
        this.body22.cubeList.add(new ModelBox(body22, 31, 35, -1.5F, 0.5F, 0.0F, 3, 0, 1, 0.0F, false));

        this.body23 = new ModelRenderer(this);
        this.body23.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body22.addChild(body23);
        this.setRotateAngle(body23, 0.0F, 0.0436F, 0.0F);
        this.body23.cubeList.add(new ModelBox(body23, 10, 5, -1.49F, 0.49F, 0.0F, 3, 0, 1, 0.0F, false));

        this.body24 = new ModelRenderer(this);
        this.body24.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body23.addChild(body24);
        this.setRotateAngle(body24, 0.0F, 0.0436F, 0.0F);
        this.body24.cubeList.add(new ModelBox(body24, 11, 21, -1.0F, 0.5F, 0.0F, 2, 0, 1, 0.0F, false));

        this.body25 = new ModelRenderer(this);
        this.body25.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body24.addChild(body25);
        this.setRotateAngle(body25, 0.0F, 0.0873F, 0.0F);
        this.body25.cubeList.add(new ModelBox(body25, 11, 8, -0.99F, 0.49F, 0.0F, 2, 0, 1, 0.0F, false));

        this.block = new ModelRenderer(this);
        this.block.setRotationPoint(2.0F, 0.5F, -3.0F);
        this.body1.addChild(block);
        this.block.cubeList.add(new ModelBox(block, 23, 43, -11.0F, -1.0F, 11.0F, 5, 1, 6, 0.001F, false));
        this.block.cubeList.add(new ModelBox(block, 0, 0, -28.0F, -1.0F, -8.0F, 22, 1, 19, 0.003F, false));
        this.block.cubeList.add(new ModelBox(block, 32, 24, -6.0F, -1.0F, 0.0F, 6, 1, 17, -0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.block.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.7418F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 41, -6.0F, -1.0F, -10.0F, 6, 1, 10, 0.0002F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-11.0F, -1.0F, 17.0F);
        this.block.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 1.2217F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 21, 0.0F, 0.0F, -18.0F, 6, 1, 18, 0.0F, false));

    }

    public void renderAll(float f) {
        this.body1.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
