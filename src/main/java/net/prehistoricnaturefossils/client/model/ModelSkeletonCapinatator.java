package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCapinatator extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer root;
    private final ModelRenderer body;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer leftTeeth;
    private final ModelRenderer lefttooth3;
    private final ModelRenderer lefttooth4;
    private final ModelRenderer lefttooth5;
    private final ModelRenderer lefttooth6;
    private final ModelRenderer rightTeeth;
    private final ModelRenderer righttooth3;
    private final ModelRenderer righttooth4;
    private final ModelRenderer righttooth5;
    private final ModelRenderer righttooth6;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer body4;
    private final ModelRenderer body5;
    private final ModelRenderer body6;
    private final ModelRenderer body7;
    private final ModelRenderer body8;

    public ModelSkeletonCapinatator() {
        this.textureWidth = 72;
        this.textureHeight = 55;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(3.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(5.0F, -1.0F, 1.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.9599F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 23, -13.8756F, -1.0F, -10.1753F, 7, 2, 10, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -13.8756F, -1.0F, -0.1753F, 14, 2, 20, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(5.0F, -1.0F, -7.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.3491F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 23, -2.9F, -1.0F, -8.0F, 6, 2, 16, 0.003F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.fossil.addChild(root);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(2.4F, 0.0F, -0.1F);
        this.root.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.3491F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 32, -3.0F, -0.7F, -8.0F, 3, 0, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 9, 13, -1.25F, -0.5F, -8.0F, 2, 0, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 11, 46, -3.75F, -0.5F, -8.0F, 2, 0, 3, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(-1.5F, -1.0F, -7.5F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0F, -0.1309F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 9, 8, -1.0F, 0.4F, -3.0F, 2, 0, 3, 0.001F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.2F, -2.85F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 11, 17, -1.0F, 0.125F, -2.0F, 2, 0, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 36, -1.5F, 0.175F, -2.275F, 3, 0, 2, 0.0F, false));

        this.leftTeeth = new ModelRenderer(this);
        this.leftTeeth.setRotationPoint(0.8F, 0.8F, -0.95F);
        this.head.addChild(leftTeeth);
        this.setRotateAngle(leftTeeth, 0.0F, -0.3054F, 0.0F);


        this.lefttooth3 = new ModelRenderer(this);
        this.lefttooth3.setRotationPoint(-0.8F, -0.8774F, -0.2653F);
        this.leftTeeth.addChild(lefttooth3);
        this.setRotateAngle(lefttooth3, -1.5708F, 0.0F, 0.0F);
        this.lefttooth3.cubeList.add(new ModelBox(lefttooth3, 12, 4, 0.0F, 0.5274F, 0.2653F, 1, 2, 0, 0.0F, false));

        this.lefttooth4 = new ModelRenderer(this);
        this.lefttooth4.setRotationPoint(0.4F, -0.537F, -1.6427F);
        this.leftTeeth.addChild(lefttooth4);
        this.setRotateAngle(lefttooth4, -1.5708F, -0.3491F, 0.0F);
        this.lefttooth4.cubeList.add(new ModelBox(lefttooth4, 0, 0, -0.5F, -1.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.lefttooth5 = new ModelRenderer(this);
        this.lefttooth5.setRotationPoint(0.5291F, -0.212F, -0.5232F);
        this.leftTeeth.addChild(lefttooth5);
        this.setRotateAngle(lefttooth5, -1.5708F, -0.7854F, 0.0F);
        this.lefttooth5.cubeList.add(new ModelBox(lefttooth5, 0, 8, -0.5F, -0.5F, -0.4F, 1, 2, 0, 0.0F, false));

        this.lefttooth6 = new ModelRenderer(this);
        this.lefttooth6.setRotationPoint(0.875F, 0.113F, -0.0177F);
        this.leftTeeth.addChild(lefttooth6);
        this.setRotateAngle(lefttooth6, 1.5708F, 0.8727F, 3.1416F);
        this.lefttooth6.cubeList.add(new ModelBox(lefttooth6, 0, 4, -0.5F, -1.0F, -0.7F, 1, 2, 0, 0.0F, false));

        this.rightTeeth = new ModelRenderer(this);
        this.rightTeeth.setRotationPoint(-0.8F, 0.8F, -0.95F);
        this.head.addChild(rightTeeth);
        this.setRotateAngle(rightTeeth, 0.0F, 0.3054F, 0.0F);


        this.righttooth3 = new ModelRenderer(this);
        this.righttooth3.setRotationPoint(0.8F, -0.8774F, -0.2653F);
        this.rightTeeth.addChild(righttooth3);
        this.setRotateAngle(righttooth3, -1.5708F, 0.0F, 0.0F);
        this.righttooth3.cubeList.add(new ModelBox(righttooth3, 9, 13, -1.0F, 0.5274F, 0.2653F, 1, 2, 0, 0.0F, false));

        this.righttooth4 = new ModelRenderer(this);
        this.righttooth4.setRotationPoint(-0.4F, -0.537F, -1.6427F);
        this.rightTeeth.addChild(righttooth4);
        this.setRotateAngle(righttooth4, -1.5708F, 0.3491F, 0.0F);
        this.righttooth4.cubeList.add(new ModelBox(righttooth4, 9, 8, -0.5F, -1.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.righttooth5 = new ModelRenderer(this);
        this.righttooth5.setRotationPoint(-0.5291F, -0.212F, -0.5232F);
        this.rightTeeth.addChild(righttooth5);
        this.setRotateAngle(righttooth5, -1.5708F, 0.7854F, 0.0F);
        this.righttooth5.cubeList.add(new ModelBox(righttooth5, 12, 0, -0.5F, -0.5F, -0.4F, 1, 2, 0, 0.0F, false));

        this.righttooth6 = new ModelRenderer(this);
        this.righttooth6.setRotationPoint(-0.875F, 0.113F, -0.0177F);
        this.rightTeeth.addChild(righttooth6);
        this.setRotateAngle(righttooth6, 1.5708F, -0.8727F, -3.1416F);
        this.righttooth6.cubeList.add(new ModelBox(righttooth6, 0, 13, -0.5F, -1.0F, -0.7F, 1, 2, 0, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(-1.525F, -1.0F, -5.5F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -0.2182F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 26, 42, -1.475F, 0.4F, 0.0F, 3, 0, 3, 0.001F, false));
        this.body2.cubeList.add(new ModelBox(body2, 49, 4, 0.775F, 0.475F, 0.0F, 2, 0, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 49, 0, -2.725F, 0.475F, 0.0F, 2, 0, 3, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.025F, 0.0F, 2.5F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, -0.0873F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 38, 48, 1.5F, 0.5F, 0.0F, 2, 0, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 46, -3.5F, 0.5F, 0.0F, 2, 0, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 13, 42, -1.5F, 0.3F, 0.0F, 3, 0, 3, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(-0.025F, 0.0F, 2.5F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0F, -0.0436F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 4, 0.025F, 0.475F, 0.0F, 4, 0, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, -3.975F, 0.475F, 0.0F, 4, 0, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 42, -1.475F, 0.4F, 0.0F, 3, 0, 3, 0.001F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.0F, -0.1309F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 30, 47, 1.475F, 0.5F, 0.0F, 2, 0, 3, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 36, 43, -3.425F, 0.5F, 0.0F, 2, 0, 3, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 28, -1.475F, 0.3F, 0.0F, 3, 0, 3, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0F, -0.1745F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 0, 23, 0.775F, 0.475F, 0.0F, 2, 0, 4, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 13, -2.725F, 0.475F, 0.0F, 2, 0, 4, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 8, -0.975F, 0.4F, 0.0F, 2, 0, 4, 0.0F, false));

        this.body7 = new ModelRenderer(this);
        this.body7.setRotationPoint(0.025F, 0.0F, 3.5F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, 0.0F, -0.1745F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 22, 46, -0.25F, 0.5F, 0.0F, 2, 0, 3, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 44, 44, -1.75F, 0.5F, 0.0F, 2, 0, 3, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 29, 27, -0.5F, 0.3F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body8 = new ModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body7.addChild(body8);
        this.setRotateAngle(body8, 0.0F, -0.1745F, 0.0F);
        this.body8.cubeList.add(new ModelBox(body8, 29, 23, -0.5F, 0.4F, 0.0F, 1, 0, 3, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 40, 37, -2.5F, 0.5F, 0.0F, 5, 0, 5, 0.0F, false));

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
