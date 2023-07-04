package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGonioceras extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;

    public ModelSkeletonGonioceras() {
        this.textureWidth = 75;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, -5.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -6.0F, -1.0F, -0.7F, 12, 1, 11, 0.004F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 45, 5.0F, -4.0F, -3.7F, 3, 4, 6, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 52, 0, 8.0F, -1.0F, -2.7F, 2, 1, 5, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 14, 51, -9.0F, -3.0F, 1.3F, 3, 3, 5, 0.002F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 17, 40, -11.0F, -2.0F, 2.3F, 2, 2, 8, -0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 38, 40, -10.0F, -5.0F, 6.3F, 5, 5, 5, -0.004F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-6.5F, -1.0F, 11.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 0, -0.5F, -1.0F, -8.5F, 4, 2, 7, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.5F, 17.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3491F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 29, -6.0F, -2.5F, -9.0F, 4, 3, 8, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 24, -2.0F, -0.5F, -9.0F, 4, 1, 9, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 13, 2.0F, -1.5F, -8.0F, 6, 2, 8, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(6.0F, -1.0F, 6.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 13, -2.0F, -2.0F, -6.0F, 5, 3, 12, -0.004F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5F, -2.2F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0873F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 10, -10.0F, -1.5F, -1.7F, 4, 2, 6, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 35, -6.0F, -0.5F, -1.7F, 12, 1, 3, -0.004F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.fossil.addChild(bone);
        this.setRotateAngle(bone, 0.1047F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 44, 24, -3.0F, -1.975F, -3.0F, 6, 2, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 56, 2.05F, -1.274F, -1.975F, 3, 1, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 54, 38, -5.05F, -1.274F, -1.975F, 3, 1, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 31, 51, -2.0F, -2.5F, -3.0F, 4, 1, 4, -0.003F, false));
        this.bone.cubeList.add(new ModelBox(bone, 30, 40, -1.5F, -2.5F, 1.0F, 3, 1, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 13, -1.49F, -2.4F, 3.25F, 3, 1, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 48, 51, -2.5F, -2.0F, 1.0F, 5, 2, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 52, 19, -2.0F, -2.01F, 3.15F, 4, 2, 2, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.0327F, 6.3899F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0802F, -0.1728F, -0.1418F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 17, -0.5F, -0.7173F, 7.8601F, 1, 1, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 21, -1.0F, -0.9673F, 5.8601F, 2, 1, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 60, -1.5F, -0.9673F, 0.1101F, 3, 2, 3, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.99F, -1.1173F, 3.1101F, 2, 2, 3, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 6, -1.0F, -1.2673F, 0.1101F, 2, 1, 3, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.005F, -1.455F, 6.25F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.023F, -0.173F, -0.1329F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 17, -2.005F, -0.555F, -0.5F, 4, 2, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 32, -1.495F, -0.945F, -0.5F, 3, 1, 1, -0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0327F, 6.3899F);
        this.bone.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0791F, 0.0447F, -0.1591F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 13, -2.6255F, -0.2413F, 7.2853F, 1, 1, 2, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 59, 7, -2.9005F, -0.2413F, 3.2853F, 2, 1, 4, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 57, -3.2588F, -0.2433F, -0.2266F, 3, 1, 4, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.0327F, 6.3899F);
        this.bone.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0854F, -0.3902F, -0.123F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 29, 1.6255F, -0.2423F, 7.2853F, 1, 1, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 59, 44, 0.9005F, -0.2423F, 3.2853F, 2, 1, 4, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 31, 1.2588F, -0.2433F, -1.2266F, 2, 1, 5, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2182F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 33, -5.0F, -1.275F, 4.1F, 1, 1, 1, -0.004F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 27, 57, -5.0F, -1.275F, 0.5F, 3, 1, 4, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.25F, 0.0F, 0.0F);
        this.bone.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.48F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 29, -3.325F, -1.275F, -4.05F, 3, 1, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.25F, 0.0F, 0.0F);
        this.bone.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.48F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 29, 0.325F, -1.275F, -4.05F, 3, 1, 1, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.2182F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 57, 57, 2.0F, -1.275F, 0.5F, 3, 1, 4, 0.0F, false));

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
