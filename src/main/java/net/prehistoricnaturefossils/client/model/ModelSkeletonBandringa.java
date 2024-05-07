package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBandringa extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer body3;
    private final ModelRenderer pelvicfinL;
    private final ModelRenderer pelvicfinL2;
    private final ModelRenderer body4;
    private final ModelRenderer body5;
    private final ModelRenderer body6;
    private final ModelRenderer body7;
    private final ModelRenderer pectoralfinL;
    private final ModelRenderer pectoralfinL2;
    private final ModelRenderer lowerjaw;

    public ModelSkeletonBandringa() {
        this.textureWidth = 112;
        this.textureHeight = 94;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -10.0F, -1.0F, -9.0F, 20, 1, 24, 0.002F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 47, -6.0F, -1.0F, 15.0F, 14, 1, 15, -0.002F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(8.0F, -0.5F, 30.1F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1222F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 58, -3.0F, -0.5F, -15.3F, 3, 1, 15, -0.001F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-5.8F, -0.5F, 30.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 26, -0.2F, -0.5F, -15.6F, 14, 1, 19, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.1296F, -0.5F, -15.4018F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 26, -5.6F, -0.5F, -5.7F, 12, 1, 16, -0.002F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-9.7F, -0.5F, -9.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.309F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 47, -0.095F, -0.5F, -0.3045F, 17, 1, 9, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-3.0F, -0.4F, -7.0F);
        this.fossil.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 64, -2.0F, -0.83F, 7.0F, 4, 0, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 65, 0, -1.5F, -0.95F, 7.01F, 3, 1, 9, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.5F, 7.1F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.2182F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 47, -1.01F, 0.6691F, -7.0533F, 2, 1, 5, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.7F, 7.1F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.3054F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 16, -1.7645F, 0.95F, -2.9575F, 1, 0, 3, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.7F, 7.1F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1309F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 64, 0.7645F, 0.95F, -2.9575F, 1, 0, 3, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.5F, 7.1F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2182F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 54, -1.5F, 0.6199F, -2.7888F, 3, 1, 3, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.7F, 7.1F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.2182F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 26, -1.5F, 1.0F, -6.85F, 3, 0, 4, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 8, -1.0F, 0.95F, -13.85F, 2, 0, 7, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -1.5F, 0.95F, -20.85F, 3, 0, 7, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -2.0F, 16.0F);
        this.body.addChild(body3);
        this.setRotateAngle(body3, 0.0F, 0.3054F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 7, 31, -1.0F, 1.1F, -1.0F, 2, 1, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 58, -1.5F, 1.2F, -0.99F, 3, 0, 3, 0.0F, false));

        this.pelvicfinL = new ModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.5F, 1.25F, 1.0F);
        this.body3.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, -0.3491F, 0.0F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 0, 54, 0.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.pelvicfinL2 = new ModelRenderer(this);
        this.pelvicfinL2.setRotationPoint(-1.5F, 1.25F, 1.0F);
        this.body3.addChild(pelvicfinL2);
        this.setRotateAngle(pelvicfinL2, 0.0F, 0.3491F, 0.0F);
        this.pelvicfinL2.cubeList.add(new ModelBox(pelvicfinL2, 0, 41, -4.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.5F, 2.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0F, 0.1047F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 44, 58, -1.0F, 1.7F, 0.0F, 2, 0, 3, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 1.4F, 3.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.1309F, 0.0F, -1.5708F);
        this.body5.cubeList.add(new ModelBox(body5, 0, 64, -0.4F, 0.45F, 0.7F, 0, 3, 4, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 48, 31, -0.3F, -0.76F, 0.0F, 0, 2, 5, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0873F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 44, 47, -0.4F, 0.4F, -0.6F, 0, 3, 4, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 14, 0, -0.3F, -0.75F, 0.0F, 0, 2, 4, 0.0F, false));

        this.body7 = new ModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, 0.1309F, 0.0F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 0, 31, -0.43F, 0.25F, -1.0F, 0, 3, 6, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 12, 8, -0.3F, -0.5F, 0.0F, 0, 1, 5, 0.0F, false));

        this.pectoralfinL = new ModelRenderer(this);
        this.pectoralfinL.setRotationPoint(2.0F, -1.0F, 7.0F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.0F, -0.2618F, 0.0F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 26, 0.0F, 0.2F, 0.0F, 5, 0, 4, 0.0F, false));

        this.pectoralfinL2 = new ModelRenderer(this);
        this.pectoralfinL2.setRotationPoint(-1.0F, -1.0F, 7.0F);
        this.body.addChild(pectoralfinL2);
        this.setRotateAngle(pectoralfinL2, 0.0F, 0.2618F, 0.0F);
        this.pectoralfinL2.cubeList.add(new ModelBox(pectoralfinL2, 0, 16, -5.0F, 0.2F, 0.0F, 5, 0, 4, 0.0F, false));

        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, -1.0F, 3.25F);
        this.body.addChild(lowerjaw);

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
