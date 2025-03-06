package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTuzoia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer body;
    private final ModelRenderer valveright;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer valveleft;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;

    public ModelSkeletonTuzoia() {
        this.textureWidth = 192;
        this.textureHeight = 192;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 19.25F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.9F, 4.0F, -4.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 58, -10.3856F, -1.0F, -3.754F, 41, 1, 17, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.9F, 4.0F, -4.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.5272F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 10.9503F, -1.0F, -14.0368F, 22, 1, 37, 0.02F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-4.9F, 4.0F, -4.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.7418F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 77, 3.1138F, -1.0F, -3.7697F, 30, 1, 17, 0.01F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.9F, 4.0F, -4.3F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0436F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 39, -11.4711F, -1.0F, -12.5696F, 42, 1, 17, 0.02F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.9F, 4.0F, -4.3F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.5672F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 96, 11.7758F, -1.0F, -12.6674F, 21, 1, 17, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 77, 114, -9.8004F, -1.0F, -19.8794F, 17, 1, 14, 0.01F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-4.9F, 4.0F, -4.3F);
        this.fossil.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 1.4181F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 77, 98, -15.4624F, -1.0F, -20.617F, 24, 1, 14, 0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-4.9F, 4.0F, -4.3F);
        this.fossil.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 1.0472F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 115, 12.8925F, -1.0F, -15.6642F, 12, 1, 14, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.9F, 4.0F, -4.3F);
        this.fossil.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.0436F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 95, 77, -2.4002F, -1.0F, -29.3128F, 22, 1, 19, 0.03F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-9.0F, 6.2F, 5.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.5236F, 0.0F);


        this.valveright = new ModelRenderer(this);
        this.valveright.setRotationPoint(0.0F, -3.4F, -6.0F);
        this.body.addChild(valveright);
        this.setRotateAngle(valveright, 0.0F, 0.0F, 0.3491F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-4.7F, 1.75F, 0.0F);
        this.valveright.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -1.9199F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 119, 18, -1.0F, -4.0F, -1.0F, 1, 4, 17, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-5.3481F, -3.0041F, -26.0F);
        this.valveright.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -3.1416F, 0.829F, 2.7925F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 117, 58, -3.0F, 4.5F, -8.0F, 6, 1, 16, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(9.6519F, -3.0041F, -16.0F);
        this.valveright.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 1.2217F, -0.3491F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 119, 0, -5.3246F, -0.5F, -2.1182F, 6, 1, 16, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.05F, 0.0F);
        this.valveright.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.3491F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 119, 40, -5.0F, 0.0F, -1.0F, 5, 1, 15, 0.0F, false));

        this.valveleft = new ModelRenderer(this);
        this.valveleft.setRotationPoint(0.0F, -3.4F, -6.0F);
        this.body.addChild(valveleft);
        this.setRotateAngle(valveleft, 0.0F, 0.0F, -0.3491F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(4.7F, 1.75F, 0.0F);
        this.valveleft.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 1.9199F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 53, 130, 0.0F, -4.0F, -1.0F, 1, 4, 17, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.05F, 0.0F);
        this.valveleft.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.3491F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 90, 130, 0.0F, 0.0F, -1.0F, 5, 1, 15, 0.0F, false));

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
