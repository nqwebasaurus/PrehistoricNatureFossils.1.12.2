package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonYohoia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer body;
    private final ModelRenderer finfL;
    private final ModelRenderer finfL2;
    private final ModelRenderer legL2;
    private final ModelRenderer armL;
    private final ModelRenderer armR;
    private final ModelRenderer body2;
    private final ModelRenderer finL;
    private final ModelRenderer finL2;
    private final ModelRenderer legL4;
    private final ModelRenderer body3;
    private final ModelRenderer legL6;
    private final ModelRenderer finL3;
    private final ModelRenderer finL4;
    private final ModelRenderer body4;
    private final ModelRenderer legL8;
    private final ModelRenderer finL5;
    private final ModelRenderer finL6;
    private final ModelRenderer body5;
    private final ModelRenderer legL10;
    private final ModelRenderer finL7;
    private final ModelRenderer finL8;
    private final ModelRenderer body6;
    private final ModelRenderer legL12;
    private final ModelRenderer finL9;
    private final ModelRenderer body7;
    private final ModelRenderer body8;

    public ModelSkeletonYohoia() {
        this.textureWidth = 96;
        this.textureHeight = 50;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -8.0F, -2.0F, -14.0F, 16, 2, 28, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-1.9967F, -3.7F, -6.6063F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.5672F, 0.0F, -1.5708F);
        this.body.cubeList.add(new ModelBox(body, 0, 12, -1.4933F, -1.0F, -0.3937F, 0, 3, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 6, 0, -1.4033F, -0.75F, -1.1437F, 0, 1, 1, 0.0F, false));

        this.finfL = new ModelRenderer(this);
        this.finfL.setRotationPoint(-1.4033F, 2.0F, 1.1063F);
        this.body.addChild(finfL);
        this.setRotateAngle(finfL, 0.0F, 0.0F, 1.5708F);
        this.finfL.cubeList.add(new ModelBox(finfL, 23, 7, 0.0F, 0.1F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finfL2 = new ModelRenderer(this);
        this.finfL2.setRotationPoint(-1.5033F, 2.0F, 2.1063F);
        this.body.addChild(finfL2);
        this.setRotateAngle(finfL2, 0.0F, 0.0F, 1.5708F);
        this.finfL2.cubeList.add(new ModelBox(finfL2, 19, 2, 0.0F, -0.03F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(-1.5533F, 1.25F, 1.1063F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, -1.5708F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 21, 20, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.armL = new ModelRenderer(this);
        this.armL.setRotationPoint(-1.5033F, 0.25F, 0.3563F);
        this.body.addChild(armL);
        this.setRotateAngle(armL, -0.6545F, 0.0F, 0.0F);
        this.armL.cubeList.add(new ModelBox(armL, 6, 5, 0.0F, 0.0F, -5.0F, 0, 4, 5, 0.0F, false));

        this.armR = new ModelRenderer(this);
        this.armR.setRotationPoint(-1.6033F, 0.25F, 0.3563F);
        this.body.addChild(armR);
        this.setRotateAngle(armR, 0.1745F, 0.0F, 0.0F);
        this.armR.cubeList.add(new ModelBox(armR, 0, 0, 0.0F, 0.0F, -5.0F, 0, 4, 5, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(-0.0033F, 0.25F, 2.6063F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.1745F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 10, 19, -1.5F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.finL = new ModelRenderer(this);
        this.finL.setRotationPoint(1.5F, 1.0F, 0.5F);
        this.body2.addChild(finL);
        this.setRotateAngle(finL, 0.0F, 0.0F, 1.5708F);
        this.finL.cubeList.add(new ModelBox(finL, 15, 18, 0.0F, 3.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL2 = new ModelRenderer(this);
        this.finL2.setRotationPoint(1.5F, 1.0F, 1.5F);
        this.body2.addChild(finL2);
        this.setRotateAngle(finL2, 0.0F, 0.0F, 1.5708F);
        this.finL2.cubeList.add(new ModelBox(finL2, 17, 11, -0.02F, 3.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(-1.55F, 1.0F, 0.5F);
        this.body2.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -1.5708F, 0.0F);


        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 5, 19, -1.49F, -1.01F, 0.0F, 0, 2, 2, 0.0F, false));

        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(-1.55F, 1.0F, 0.5F);
        this.body3.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, -1.5708F, 0.0F);


        this.finL3 = new ModelRenderer(this);
        this.finL3.setRotationPoint(1.5F, 1.0F, 0.5F);
        this.body3.addChild(finL3);
        this.setRotateAngle(finL3, 0.0F, 0.0F, 1.5708F);
        this.finL3.cubeList.add(new ModelBox(finL3, 17, 9, 0.0F, 3.02F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL4 = new ModelRenderer(this);
        this.finL4.setRotationPoint(1.5F, 1.0F, 1.5F);
        this.body3.addChild(finL4);
        this.setRotateAngle(finL4, 0.0F, 0.0F, 1.5708F);
        this.finL4.cubeList.add(new ModelBox(finL4, 7, 17, -0.03F, 3.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.2182F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 19, -1.5F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.legL8 = new ModelRenderer(this);
        this.legL8.setRotationPoint(-1.55F, 1.0F, 0.5F);
        this.body4.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, -1.5708F, 0.0F);


        this.finL5 = new ModelRenderer(this);
        this.finL5.setRotationPoint(1.5F, 1.0F, 0.5F);
        this.body4.addChild(finL5);
        this.setRotateAngle(finL5, 0.0F, 0.0F, 1.5708F);
        this.finL5.cubeList.add(new ModelBox(finL5, 15, 16, 0.0F, 2.97F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL6 = new ModelRenderer(this);
        this.finL6.setRotationPoint(1.5F, 1.0F, 1.5F);
        this.body4.addChild(finL6);
        this.setRotateAngle(finL6, 0.0F, 0.0F, 1.5708F);
        this.finL6.cubeList.add(new ModelBox(finL6, 16, 14, -0.25F, 2.99F, -0.5F, 3, 0, 1, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.1745F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, -1.49F, -1.01F, 0.0F, 0, 2, 2, 0.0F, false));

        this.legL10 = new ModelRenderer(this);
        this.legL10.setRotationPoint(-1.55F, 1.0F, 0.5F);
        this.body5.addChild(legL10);
        this.setRotateAngle(legL10, 0.0F, -1.5708F, 0.0F);
        this.legL10.cubeList.add(new ModelBox(legL10, 18, 20, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.finL7 = new ModelRenderer(this);
        this.finL7.setRotationPoint(1.5F, 1.0F, 0.5F);
        this.body5.addChild(finL7);
        this.setRotateAngle(finL7, 0.0F, 0.0F, 1.5708F);
        this.finL7.cubeList.add(new ModelBox(finL7, 16, 4, -0.5F, 2.98F, -0.5F, 3, 0, 1, 0.0F, false));

        this.finL8 = new ModelRenderer(this);
        this.finL8.setRotationPoint(1.5F, 1.0F, 1.5F);
        this.body5.addChild(finL8);
        this.setRotateAngle(finL8, 0.0F, 0.0F, 1.5708F);
        this.finL8.cubeList.add(new ModelBox(finL8, 16, 0, -0.75F, 2.99F, -0.5F, 3, 0, 1, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, -0.2182F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 0, 10, -1.5F, -1.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.legL12 = new ModelRenderer(this);
        this.legL12.setRotationPoint(-1.55F, 1.0F, 0.5F);
        this.body6.addChild(legL12);
        this.setRotateAngle(legL12, 0.0F, -1.5708F, 0.0F);
        this.legL12.cubeList.add(new ModelBox(legL12, 15, 20, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.finL9 = new ModelRenderer(this);
        this.finL9.setRotationPoint(1.5F, 1.0F, 0.5F);
        this.body6.addChild(finL9);
        this.setRotateAngle(finL9, 0.0F, 0.0F, 1.5708F);
        this.finL9.cubeList.add(new ModelBox(finL9, 7, 15, -1.0F, 3.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.body7 = new ModelRenderer(this);
        this.body7.setRotationPoint(-0.5F, -0.35F, 0.9F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, -0.2618F, 0.0F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 12, 4, -1.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.body8 = new ModelRenderer(this);
        this.body8.setRotationPoint(-1.1F, 0.1F, 2.7F);
        this.body7.addChild(body8);
        this.setRotateAngle(body8, 0.0F, 0.3491F, 1.5708F);
        this.body8.cubeList.add(new ModelBox(body8, 6, 0, -1.5F, 0.0F, 1.0F, 3, 0, 3, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 19, 6, -0.6F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

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
