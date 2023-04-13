package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGemuendina extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer body4;
    private final ModelRenderer body5;
    private final ModelRenderer body6;
    private final ModelRenderer finL2;
    private final ModelRenderer finL4;
    private final ModelRenderer jawupper;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer finL;
    private final ModelRenderer finL3;

    public ModelSkeletonGemuendina() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-8.1275F, -0.4F, 7.7297F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -2.7053F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 48, -12.4F, -0.5F, -11.4F, 19, 1, 29, -0.015F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(21.7552F, -0.4F, 10.1403F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.7243F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 68, 50, -16.1218F, -0.5F, 0.2117F, 16, 1, 29, -0.015F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(10.2947F, -0.4F, 1.7051F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 79, -9.3F, -0.5F, -11.3F, 16, 1, 24, -0.01F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-17.9945F, -0.4F, -1.1872F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1309F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 11.8321F, -0.5F, -14.0568F, 16, 1, 46, 0.01F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.fossil.addChild(body);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.25F, 1.25F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -0.0873F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -3.49F, 0.24F, 0.0F, 7, 1, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 10, -2.5F, 0.05F, -0.25F, 5, 1, 8, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, -0.0436F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 13, 40, -2.49F, 0.25F, 0.0F, 5, 1, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 30, 16, -1.5F, 0.15F, -0.25F, 3, 1, 4, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0F, -0.0873F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 15, 26, -1.49F, 0.24F, -0.25F, 3, 1, 6, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, 0.0F, -0.1F, 1.75F, 0, 1, 2, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 5.6F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.0F, 0.1745F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 0, 36, -0.99F, 0.25F, 0.0F, 2, 1, 6, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.5F, 5.7F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0F, 0.1309F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 19, 16, -0.49F, 0.75F, 0.0F, 1, 1, 8, 0.0F, false));

        this.finL2 = new ModelRenderer(this);
        this.finL2.setRotationPoint(2.5F, -0.85F, 0.0F);
        this.body3.addChild(finL2);
        this.setRotateAngle(finL2, 0.0F, -0.4363F, 0.0F);
        this.finL2.cubeList.add(new ModelBox(finL2, 28, 26, 0.0869F, 1.11F, -0.0405F, 3, 0, 5, 0.0F, false));

        this.finL4 = new ModelRenderer(this);
        this.finL4.setRotationPoint(-2.5F, -0.85F, 0.0F);
        this.body3.addChild(finL4);
        this.setRotateAngle(finL4, 0.0F, 0.4363F, 0.0F);
        this.finL4.cubeList.add(new ModelBox(finL4, 28, 26, -3.0869F, 1.11F, -0.0405F, 3, 0, 5, 0.0F, true));

        this.jawupper = new ModelRenderer(this);
        this.jawupper.setRotationPoint(0.0F, -2.05F, -1.4F);
        this.body.addChild(jawupper);
        this.setRotateAngle(jawupper, -0.0524F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 1.35F, -2.6F);
        this.jawupper.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 1.2654F, 0.1745F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 21, -5.15F, -0.45F, -3.55F, 5, 1, 5, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 1.35F, -2.6F);
        this.jawupper.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, -1.2654F, -0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 0, 0.15F, -0.45F, -3.55F, 5, 1, 5, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.0F, 1.35F, -5.6F);
        this.jawupper.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, -0.6109F, -0.1309F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 32, 0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(3.0F, 1.35F, -5.6F);
        this.jawupper.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.6109F, 0.1309F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 48, -2.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.35F, -1.6F);
        this.jawupper.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 28, -1.5F, -1.65F, -0.5F, 3, 1, 6, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.35F, -5.6F);
        this.jawupper.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 3, 0, -1.5F, -1.01F, 1.25F, 1, 0, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 4, 0.5F, -1.01F, 1.25F, 1, 0, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 34, -3.0F, -1.0F, 0.0F, 6, 1, 4, 0.0F, false));

        this.finL = new ModelRenderer(this);
        this.finL.setRotationPoint(3.5F, -1.0F, -5.0F);
        this.body.addChild(finL);
        this.setRotateAngle(finL, 0.0F, -0.5672F, 0.0F);
        this.finL.cubeList.add(new ModelBox(finL, 79, 0, 1.0F, 0.0F, 0.0F, 12, 0, 12, 0.0F, false));

        this.finL3 = new ModelRenderer(this);
        this.finL3.setRotationPoint(-3.5F, -1.0F, -5.0F);
        this.body.addChild(finL3);
        this.setRotateAngle(finL3, 0.0F, 0.5672F, 0.0F);
        this.finL3.cubeList.add(new ModelBox(finL3, 79, 0, -13.0F, 0.0F, 0.0F, 12, 0, 12, 0.0F, true));

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
