package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCyclomedusa extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Cyclomedusae;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;

    public ModelSkeletonCyclomedusa() {
        this.textureWidth = 224;
        this.textureHeight = 110;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -24.0F, -2.0F, -18.0F, 29, 2, 39, 0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-31.5F, 0.0F, 4.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.9722F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 96, 76, -29.803F, -2.0F, 0.1008F, 30, 2, 28, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(9.5F, 0.0F, -24.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.2654F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 42, -38.836F, -2.0F, -30.5819F, 39, 2, 31, -0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(9.6F, 0.0F, -23.7F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.7156F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 76, -31.7198F, -2.0F, 0.1241F, 32, 2, 31, 0.0F, false));

        this.Cyclomedusae = new ModelRenderer(this);
        this.Cyclomedusae.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.fossil.addChild(Cyclomedusae);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Cyclomedusae.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 0, 7, -2.0F, -0.05F, -2.0F, 4, 0, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 12, -1.5F, -0.1F, -1.5F, 3, 0, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 13, 7, -1.0F, -0.15F, -1.0F, 2, 0, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, -0.25F, -0.5F, 1, 0, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, 0.0F, -3.0F, 4, 0, 6, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 15, 0, 2.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 9, 12, -3.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));

        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(-10.0F, -4.0F, -16.0F);
        this.Cyclomedusae.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, 1.0472F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 7, -2.0F, -0.05F, -2.0F, 4, 0, 4, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 12, -1.5F, -0.1F, -1.5F, 3, 0, 3, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 13, 7, -1.0F, -0.15F, -1.0F, 2, 0, 2, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 0, -0.5F, -0.25F, -0.5F, 1, 0, 1, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 0, -2.0F, 0.0F, -3.0F, 4, 0, 6, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 15, 0, 2.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 9, 12, -3.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));

        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(-10.0F, -4.0F, 14.0F);
        this.Cyclomedusae.addChild(bone3);
        this.setRotateAngle(bone3, 0.0F, 1.7017F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 7, -2.0F, -0.05F, -2.0F, 4, 0, 4, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 12, -1.5F, -0.1F, -1.5F, 3, 0, 3, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 13, 7, -1.0F, -0.15F, -1.0F, 2, 0, 2, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 0, -0.5F, -0.25F, -0.5F, 1, 0, 1, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 0, -2.0F, 0.0F, -3.0F, 4, 0, 6, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 15, 0, 2.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 9, 12, -3.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));

        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(-4.0F, -4.0F, 8.0F);
        this.Cyclomedusae.addChild(bone4);
        this.setRotateAngle(bone4, 0.0F, 1.2217F, 0.0F);
        this.bone4.cubeList.add(new ModelBox(bone4, 0, 7, -2.0F, -0.05F, -2.0F, 4, 0, 4, 0.0F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 0, 12, -1.5F, -0.1F, -1.5F, 3, 0, 3, 0.0F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 13, 7, -1.0F, -0.15F, -1.0F, 2, 0, 2, 0.0F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 0, 0, -0.5F, -0.25F, -0.5F, 1, 0, 1, 0.0F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 0, 0, -2.0F, 0.0F, -3.0F, 4, 0, 6, 0.0F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 15, 0, 2.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 9, 12, -3.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));

        this.bone5 = new ModelRenderer(this);
        this.bone5.setRotationPoint(-14.0F, -4.0F, -30.6F);
        this.Cyclomedusae.addChild(bone5);
        this.setRotateAngle(bone5, 0.0F, 1.2566F, 0.0F);
        this.bone5.cubeList.add(new ModelBox(bone5, 1, 7, -2.0F, -0.05F, -2.0F, 3, 0, 4, 0.0F, false));
        this.bone5.cubeList.add(new ModelBox(bone5, 1, 12, -1.5F, -0.1F, -1.5F, 2, 0, 3, 0.0F, false));
        this.bone5.cubeList.add(new ModelBox(bone5, 13, 7, -1.0F, -0.15F, -1.0F, 2, 0, 2, 0.0F, false));
        this.bone5.cubeList.add(new ModelBox(bone5, 0, 0, -0.5F, -0.25F, -0.5F, 1, 0, 1, 0.0F, false));
        this.bone5.cubeList.add(new ModelBox(bone5, 1, 0, -2.0F, 0.2F, -3.0F, 3, 0, 6, 0.0F, false));
        this.bone5.cubeList.add(new ModelBox(bone5, 9, 12, -3.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));

        this.bone6 = new ModelRenderer(this);
        this.bone6.setRotationPoint(-17.0F, -4.0F, -3.0F);
        this.Cyclomedusae.addChild(bone6);
        this.setRotateAngle(bone6, 0.0F, 0.0873F, 0.0F);
        this.bone6.cubeList.add(new ModelBox(bone6, 0, 7, -2.0F, -0.05F, -2.0F, 4, 0, 4, 0.0F, false));
        this.bone6.cubeList.add(new ModelBox(bone6, 0, 12, -1.5F, -0.1F, -1.5F, 3, 0, 3, 0.0F, false));
        this.bone6.cubeList.add(new ModelBox(bone6, 13, 7, -1.0F, -0.15F, -1.0F, 2, 0, 2, 0.0F, false));
        this.bone6.cubeList.add(new ModelBox(bone6, 0, 0, -0.5F, -0.25F, -0.5F, 1, 0, 1, 0.0F, false));
        this.bone6.cubeList.add(new ModelBox(bone6, 0, 0, -2.0F, 0.0F, -3.0F, 4, 0, 6, 0.0F, false));
        this.bone6.cubeList.add(new ModelBox(bone6, 15, 0, 2.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));
        this.bone6.cubeList.add(new ModelBox(bone6, 9, 12, -3.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));

        this.bone7 = new ModelRenderer(this);
        this.bone7.setRotationPoint(11.0F, -4.0F, -11.0F);
        this.Cyclomedusae.addChild(bone7);
        this.setRotateAngle(bone7, 0.0F, -1.0036F, 0.0F);
        this.bone7.cubeList.add(new ModelBox(bone7, 0, 7, -2.0F, -0.05F, -2.0F, 4, 0, 4, 0.0F, false));
        this.bone7.cubeList.add(new ModelBox(bone7, 0, 12, -1.5F, -0.1F, -1.5F, 3, 0, 3, 0.0F, false));
        this.bone7.cubeList.add(new ModelBox(bone7, 13, 7, -1.0F, -0.15F, -1.0F, 2, 0, 2, 0.0F, false));
        this.bone7.cubeList.add(new ModelBox(bone7, 0, 0, -0.5F, -0.25F, -0.5F, 1, 0, 1, 0.0F, false));
        this.bone7.cubeList.add(new ModelBox(bone7, 0, 0, -2.0F, 0.0F, -3.0F, 4, 0, 6, 0.0F, false));
        this.bone7.cubeList.add(new ModelBox(bone7, 15, 0, 2.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));
        this.bone7.cubeList.add(new ModelBox(bone7, 9, 12, -3.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));

        this.bone8 = new ModelRenderer(this);
        this.bone8.setRotationPoint(11.0F, -4.0F, 0.0F);
        this.Cyclomedusae.addChild(bone8);
        this.setRotateAngle(bone8, 0.0F, 0.1745F, 0.0F);
        this.bone8.cubeList.add(new ModelBox(bone8, 0, 7, -2.0F, -0.05F, -2.0F, 4, 0, 4, 0.0F, false));
        this.bone8.cubeList.add(new ModelBox(bone8, 0, 12, -1.5F, -0.1F, -1.5F, 3, 0, 3, 0.0F, false));
        this.bone8.cubeList.add(new ModelBox(bone8, 13, 7, -1.0F, -0.15F, -1.0F, 2, 0, 2, 0.0F, false));
        this.bone8.cubeList.add(new ModelBox(bone8, 0, 0, -0.5F, -0.25F, -0.5F, 1, 0, 1, 0.0F, false));
        this.bone8.cubeList.add(new ModelBox(bone8, 0, 0, -2.0F, 0.0F, -3.0F, 4, 0, 6, 0.0F, false));
        this.bone8.cubeList.add(new ModelBox(bone8, 15, 0, 2.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));
        this.bone8.cubeList.add(new ModelBox(bone8, 9, 12, -3.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));

        this.bone9 = new ModelRenderer(this);
        this.bone9.setRotationPoint(3.0F, -4.0F, -7.0F);
        this.Cyclomedusae.addChild(bone9);
        this.setRotateAngle(bone9, 0.0F, 0.6981F, 0.0F);
        this.bone9.cubeList.add(new ModelBox(bone9, 0, 7, -2.0F, -0.05F, -2.0F, 4, 0, 4, 0.0F, false));
        this.bone9.cubeList.add(new ModelBox(bone9, 0, 12, -1.5F, -0.1F, -1.5F, 3, 0, 3, 0.0F, false));
        this.bone9.cubeList.add(new ModelBox(bone9, 13, 7, -1.0F, -0.15F, -1.0F, 2, 0, 2, 0.0F, false));
        this.bone9.cubeList.add(new ModelBox(bone9, 0, 0, -0.5F, -0.25F, -0.5F, 1, 0, 1, 0.0F, false));
        this.bone9.cubeList.add(new ModelBox(bone9, 0, 0, -2.0F, 0.0F, -3.0F, 4, 0, 6, 0.0F, false));
        this.bone9.cubeList.add(new ModelBox(bone9, 15, 0, 2.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));
        this.bone9.cubeList.add(new ModelBox(bone9, 9, 12, -3.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));

        this.bone10 = new ModelRenderer(this);
        this.bone10.setRotationPoint(15.0F, -4.0F, 8.0F);
        this.Cyclomedusae.addChild(bone10);
        this.setRotateAngle(bone10, 0.0F, 0.6981F, 0.0F);
        this.bone10.cubeList.add(new ModelBox(bone10, 0, 7, -2.0F, -0.05F, -2.0F, 4, 0, 4, 0.0F, false));
        this.bone10.cubeList.add(new ModelBox(bone10, 0, 12, -1.5F, -0.1F, -1.5F, 3, 0, 3, 0.0F, false));
        this.bone10.cubeList.add(new ModelBox(bone10, 13, 7, -1.0F, -0.15F, -1.0F, 2, 0, 2, 0.0F, false));
        this.bone10.cubeList.add(new ModelBox(bone10, 0, 0, -0.5F, -0.25F, -0.5F, 1, 0, 1, 0.0F, false));
        this.bone10.cubeList.add(new ModelBox(bone10, 0, 0, -2.0F, 0.0F, -3.0F, 4, 0, 6, 0.0F, false));
        this.bone10.cubeList.add(new ModelBox(bone10, 15, 0, 2.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));
        this.bone10.cubeList.add(new ModelBox(bone10, 9, 12, -3.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));

        this.bone11 = new ModelRenderer(this);
        this.bone11.setRotationPoint(-17.0F, -4.0F, 28.8F);
        this.Cyclomedusae.addChild(bone11);
        this.setRotateAngle(bone11, 0.0F, 0.6981F, 0.0F);
        this.bone11.cubeList.add(new ModelBox(bone11, 2, 9, -2.0F, -0.05F, -2.0F, 4, 0, 2, 0.0F, false));
        this.bone11.cubeList.add(new ModelBox(bone11, 1, 13, -1.5F, -0.1F, -1.5F, 3, 0, 2, 0.0F, false));
        this.bone11.cubeList.add(new ModelBox(bone11, 13, 7, -1.0F, -0.15F, -1.0F, 2, 0, 2, 0.0F, false));
        this.bone11.cubeList.add(new ModelBox(bone11, 0, 0, -0.5F, -0.25F, -0.5F, 1, 0, 1, 0.0F, false));
        this.bone11.cubeList.add(new ModelBox(bone11, 3, 3, -2.0F, 0.0F, -3.0F, 4, 0, 3, 0.0F, false));
        this.bone11.cubeList.add(new ModelBox(bone11, 18, 3, 2.0F, 0.0F, -2.0F, 1, 0, 1, 0.0F, false));
        this.bone11.cubeList.add(new ModelBox(bone11, 11, 14, -3.0F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.bone12 = new ModelRenderer(this);
        this.bone12.setRotationPoint(-28.0F, -4.0F, 14.0F);
        this.Cyclomedusae.addChild(bone12);
        this.setRotateAngle(bone12, 0.0F, 1.9635F, 0.0F);
        this.bone12.cubeList.add(new ModelBox(bone12, 3, 10, -2.0F, -0.05F, 1.0F, 4, 0, 1, 0.0F, false));
        this.bone12.cubeList.add(new ModelBox(bone12, 2, 14, -1.5F, -0.1F, 0.8F, 3, 0, 1, 0.0F, false));
        this.bone12.cubeList.add(new ModelBox(bone12, 4, 4, -2.0F, 0.0F, 1.0F, 4, 0, 2, 0.0F, false));
        this.bone12.cubeList.add(new ModelBox(bone12, 18, 3, 2.0F, 0.0F, 1.0F, 1, 0, 1, 0.0F, false));
        this.bone12.cubeList.add(new ModelBox(bone12, 12, 15, -3.0F, 0.0F, 1.0F, 1, 0, 1, 0.0F, false));

        this.bone13 = new ModelRenderer(this);
        this.bone13.setRotationPoint(-2.0F, -4.0F, 18.0F);
        this.Cyclomedusae.addChild(bone13);
        this.setRotateAngle(bone13, 0.0F, 1.2217F, 0.0F);
        this.bone13.cubeList.add(new ModelBox(bone13, 0, 7, -2.0F, -0.05F, -2.0F, 4, 0, 4, 0.0F, false));
        this.bone13.cubeList.add(new ModelBox(bone13, 0, 12, -1.5F, -0.1F, -1.5F, 3, 0, 3, 0.0F, false));
        this.bone13.cubeList.add(new ModelBox(bone13, 13, 7, -1.0F, -0.15F, -1.0F, 2, 0, 2, 0.0F, false));
        this.bone13.cubeList.add(new ModelBox(bone13, 0, 0, -0.5F, -0.25F, -0.5F, 1, 0, 1, 0.0F, false));
        this.bone13.cubeList.add(new ModelBox(bone13, 0, 0, -2.0F, 0.0F, -3.0F, 4, 0, 6, 0.0F, false));
        this.bone13.cubeList.add(new ModelBox(bone13, 15, 0, 2.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));
        this.bone13.cubeList.add(new ModelBox(bone13, 9, 12, -3.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));

        this.bone14 = new ModelRenderer(this);
        this.bone14.setRotationPoint(-19.0F, -4.0F, 8.0F);
        this.Cyclomedusae.addChild(bone14);
        this.setRotateAngle(bone14, 0.0F, 2.4435F, 0.0F);
        this.bone14.cubeList.add(new ModelBox(bone14, 0, 7, -2.0F, -0.05F, -2.0F, 4, 0, 4, 0.0F, false));
        this.bone14.cubeList.add(new ModelBox(bone14, 0, 12, -1.5F, -0.1F, -1.5F, 3, 0, 3, 0.0F, false));
        this.bone14.cubeList.add(new ModelBox(bone14, 13, 7, -1.0F, -0.15F, -1.0F, 2, 0, 2, 0.0F, false));
        this.bone14.cubeList.add(new ModelBox(bone14, 0, 0, -0.5F, -0.25F, -0.5F, 1, 0, 1, 0.0F, false));
        this.bone14.cubeList.add(new ModelBox(bone14, 0, 0, -2.0F, 0.0F, -3.0F, 4, 0, 6, 0.0F, false));
        this.bone14.cubeList.add(new ModelBox(bone14, 15, 0, 2.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));
        this.bone14.cubeList.add(new ModelBox(bone14, 9, 12, -3.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));

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
