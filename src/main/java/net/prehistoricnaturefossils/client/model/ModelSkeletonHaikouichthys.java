package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHaikouichthys extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer bone2;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer bone5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer bone6;
    private final ModelRenderer cube_r8;
    private final ModelRenderer bone7;

    public ModelSkeletonHaikouichthys() {
        this.textureWidth = 192;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(1.0F, 23.0F, 0.5F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -16.0F, -1.0F, -31.5F, 32, 2, 63, 0.0F, false));

        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(1.0F, -4.5F, -19.5F);
        this.fossil.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, 0.0F, -1.5708F);
        this.bone2.cubeList.add(new ModelBox(bone2, 24, 0, -3.0F, -2.5F, -4.0F, 0, 7, 10, 0.02F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 17, 66, -3.2F, -7.0F, -1.0F, 0, 5, 7, 0.0F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(-1.5F, 1.0F, -3.0F);
        this.bone2.addChild(bone);
        this.setRotateAngle(bone, -0.1309F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -1.4F, -2.0F, -5.0F, 0, 4, 5, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.1F, 3.25F, -1.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3229F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 0, -1.5F, -2.0F, -4.0F, 0, 2, 5, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.1F, -3.25F, -1.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3229F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 22, -1.5F, 0.0F, -4.0F, 0, 2, 4, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -2.0F, -5.0F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5882F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -2.49F, -0.01F, -1.5F, 0, 1, 1, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 0, -2.5F, 0.0F, -2.0F, 0, 3, 2, -0.01F, false));

        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(-1.0F, 0.5F, 6.0F);
        this.bone2.addChild(bone3);
        this.setRotateAngle(bone3, 0.1309F, 0.0F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 31, -2.1F, -9.0F, 0.0F, 0, 15, 8, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 33, 18, -2.0F, -3.0F, -1.0F, 0, 7, 9, 0.01F, false));

        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(-0.5F, 4.0F, 8.0F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, 0.1745F, 0.0F, 0.0F);
        this.bone4.cubeList.add(new ModelBox(bone4, 43, 9, -1.5F, -6.0F, -1.0F, 0, 6, 9, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -1.5F, 2.0F);
        this.bone4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 14, -2.9F, -12.5F, -2.0F, 0, 16, 8, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.bone4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1257F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 0, -1.6F, 0.0F, 0.0F, 0, 1, 8, 0.0F, false));

        this.bone5 = new ModelRenderer(this);
        this.bone5.setRotationPoint(-0.5F, 0.0F, 7.75F);
        this.bone4.addChild(bone5);
        this.setRotateAngle(bone5, -0.0436F, 0.0F, 0.0F);
        this.bone5.cubeList.add(new ModelBox(bone5, 9, 47, -1.0F, -5.0F, -0.75F, 0, 5, 8, -0.01F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -6.0F, 0.25F);
        this.bone5.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1431F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 0, -1.1F, 0.0F, -1.0F, 0, 1, 8, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -1.5F, 2.25F);
        this.bone5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 41, 35, -2.3F, -9.5F, -2.3F, 0, 13, 7, 0.0F, false));

        this.bone6 = new ModelRenderer(this);
        this.bone6.setRotationPoint(-0.5F, -0.5F, 7.25F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, -0.0873F, 0.0F, 0.0F);
        this.bone6.cubeList.add(new ModelBox(bone6, 0, 66, -0.5F, -3.5F, -1.0F, 0, 4, 8, -0.02F, false));
        this.bone6.cubeList.add(new ModelBox(bone6, 24, 31, -0.6F, -8.5F, -1.0F, 0, 11, 8, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -4.5F, 0.0F);
        this.bone6.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1431F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 51, -0.5F, 0.0F, -1.0F, 0, 2, 8, 0.0F, false));

        this.bone7 = new ModelRenderer(this);
        this.bone7.setRotationPoint(0.0F, -1.5F, 7.0F);
        this.bone6.addChild(bone7);
        this.setRotateAngle(bone7, -0.0873F, 0.0F, 0.0F);
        this.bone7.cubeList.add(new ModelBox(bone7, 32, 66, -0.5F, -1.5F, 0.0F, 0, 3, 7, -0.03F, false));
        this.bone7.cubeList.add(new ModelBox(bone7, 0, 0, -0.7F, -6.0F, -1.0F, 0, 10, 11, 0.0F, false));
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
