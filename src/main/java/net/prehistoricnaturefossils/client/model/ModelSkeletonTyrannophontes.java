package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTyrannophontes extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r4;
    private final ModelRenderer antennaL2;
    private final ModelRenderer antennaL1;
    private final ModelRenderer eyeR;
    private final ModelRenderer eyeL;
    private final ModelRenderer body1;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer body4;
    private final ModelRenderer body5;
    private final ModelRenderer pleopodL;
    private final ModelRenderer body6;
    private final ModelRenderer pleopodL2;
    private final ModelRenderer body7;
    private final ModelRenderer pleopodL3;
    private final ModelRenderer body8;
    private final ModelRenderer pleopodL4;
    private final ModelRenderer body9;
    private final ModelRenderer pleopodL5;
    private final ModelRenderer body10;
    private final ModelRenderer talson;
    private final ModelRenderer talson2;
    private final ModelRenderer talson4;
    private final ModelRenderer talson3;
    private final ModelRenderer talson5;
    private final ModelRenderer legL3;
    private final ModelRenderer legL2;
    private final ModelRenderer legL;
    private final ModelRenderer armR;
    private final ModelRenderer armL;
    private final ModelRenderer armL2;
    private final ModelRenderer armL3;
    private final ModelRenderer armL4;

    public ModelSkeletonTyrannophontes() {
        this.textureWidth = 144;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-10.7713F, -1.0F, 26.2236F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -2.9234F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 27, -32.8684F, -1.0F, 8.0131F, 14, 2, 30, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.3713F, -1.0F, 4.4787F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 2.0944F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -14.0F, -1.0F, -17.0F, 27, 2, 24, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(20.5F, -1.0F, -19.7F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.5498F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 59, 27, -20.1646F, -1.0F, 5.2F, 15, 2, 26, 0.003F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(-2.0F, 0.05F, -5.9F);
        this.fossil.addChild(bone);
        this.setRotateAngle(bone, 0.5236F, 0.0F, -1.5708F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 2.5F, -6.1F, -6.25F, 0, 5, 8, 0.0F, false));

        this.antennaL2 = new ModelRenderer(this);
        this.antennaL2.setRotationPoint(2.1F, -2.75F, -6.5F);
        this.bone.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.2182F, 0.0F, 0.0F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 0, 27, 0.0F, -2.5F, -7.0F, 0, 5, 8, 0.0F, false));

        this.antennaL1 = new ModelRenderer(this);
        this.antennaL1.setRotationPoint(2.05F, -2.9F, -5.0F);
        this.bone.addChild(antennaL1);
        this.setRotateAngle(antennaL1, 0.5236F, 0.0F, 0.0F);
        this.antennaL1.cubeList.add(new ModelBox(antennaL1, 14, 35, 0.25F, 0.0F, -6.0F, 0, 4, 6, 0.0F, false));

        this.eyeR = new ModelRenderer(this);
        this.eyeR.setRotationPoint(-0.5F, -2.5F, -5.5F);
        this.bone.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.2182F, 0.0F);


        this.eyeL = new ModelRenderer(this);
        this.eyeL.setRotationPoint(1.4F, -2.5F, -5.5F);
        this.bone.addChild(eyeL);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 18, 0, 1.0F, -1.0F, -2.0F, 0, 1, 2, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -5.9F, -1.5F);
        this.bone.addChild(body1);
        this.setRotateAngle(body1, 0.0436F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 27, 60, 2.4F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 19, 5, 2.41F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0436F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 49, 2.4F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.2182F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 25, 44, 2.41F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.0873F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 0, 27, 2.4F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.pleopodL = new ModelRenderer(this);
        this.pleopodL.setRotationPoint(2.2F, 4.0F, 1.0F);
        this.body5.addChild(pleopodL);
        this.setRotateAngle(pleopodL, 0.0F, 1.5708F, 0.0F);
        this.pleopodL.cubeList.add(new ModelBox(pleopodL, 21, 35, -0.5F, -0.25F, 0.0F, 1, 4, 0, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, -0.1309F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 32, 60, 2.41F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.pleopodL2 = new ModelRenderer(this);
        this.pleopodL2.setRotationPoint(2.1F, 4.0F, 1.0F);
        this.body6.addChild(pleopodL2);
        this.setRotateAngle(pleopodL2, 0.0F, 1.5708F, 0.0F);
        this.pleopodL2.cubeList.add(new ModelBox(pleopodL2, 24, 35, -0.5F, -0.25F, 0.0F, 1, 4, 0, 0.0F, false));

        this.body7 = new ModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, -0.0873F, 0.0F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 0, 41, 2.4F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.pleopodL3 = new ModelRenderer(this);
        this.pleopodL3.setRotationPoint(2.3F, 4.0F, 1.0F);
        this.body7.addChild(pleopodL3);
        this.setRotateAngle(pleopodL3, 0.0F, 1.5708F, 0.0F);
        this.pleopodL3.cubeList.add(new ModelBox(pleopodL3, 17, 35, -0.5F, -1.05F, 0.0F, 1, 4, 0, 0.0F, false));

        this.body8 = new ModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body7.addChild(body8);
        this.setRotateAngle(body8, -0.0873F, 0.0F, 0.0F);
        this.body8.cubeList.add(new ModelBox(body8, 23, 27, 2.41F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.pleopodL4 = new ModelRenderer(this);
        this.pleopodL4.setRotationPoint(2.2F, 4.0F, 1.0F);
        this.body8.addChild(pleopodL4);
        this.setRotateAngle(pleopodL4, 0.0F, 1.5708F, 0.0F);
        this.pleopodL4.cubeList.add(new ModelBox(pleopodL4, 5, 27, -0.5F, -1.65F, 0.0F, 1, 4, 0, 0.0F, false));

        this.body9 = new ModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body8.addChild(body9);
        this.setRotateAngle(body9, -0.1309F, 0.0F, 0.0F);
        this.body9.cubeList.add(new ModelBox(body9, 9, 27, 2.4F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.pleopodL5 = new ModelRenderer(this);
        this.pleopodL5.setRotationPoint(2.3F, 4.0F, 1.0F);
        this.body9.addChild(pleopodL5);
        this.setRotateAngle(pleopodL5, 1.5708F, 1.4835F, 1.5708F);
        this.pleopodL5.cubeList.add(new ModelBox(pleopodL5, 21, 19, -0.5F, -2.35F, 0.0F, 1, 4, 0, 0.0F, false));

        this.body10 = new ModelRenderer(this);
        this.body10.setRotationPoint(2.5F, 1.5F, 1.8F);
        this.body9.addChild(body10);
        this.setRotateAngle(body10, 0.0F, 0.1745F, 1.5708F);
        this.body10.cubeList.add(new ModelBox(body10, 7, 60, -1.5F, -0.1F, -0.025F, 3, 0, 3, -0.01F, false));

        this.talson = new ModelRenderer(this);
        this.talson.setRotationPoint(0.0F, 0.3F, 3.0F);
        this.body10.addChild(talson);
        this.talson.cubeList.add(new ModelBox(talson, 9, 5, -0.5F, -0.25F, 3.75F, 1, 0, 2, 0.0F, false));
        this.talson.cubeList.add(new ModelBox(talson, 9, 0, -1.0F, -0.35F, -0.25F, 2, 0, 4, 0.0F, false));

        this.talson2 = new ModelRenderer(this);
        this.talson2.setRotationPoint(0.0F, 0.1F, 3.0F);
        this.body10.addChild(talson2);
        this.setRotateAngle(talson2, 0.0F, -0.3491F, 0.0F);
        this.talson2.cubeList.add(new ModelBox(talson2, 0, 49, -2.25F, 0.0F, 0.0F, 3, 0, 7, 0.0F, false));

        this.talson4 = new ModelRenderer(this);
        this.talson4.setRotationPoint(0.0F, 0.2F, 3.0F);
        this.body10.addChild(talson4);
        this.setRotateAngle(talson4, 0.0F, 0.3491F, 0.0F);
        this.talson4.cubeList.add(new ModelBox(talson4, 9, 27, -0.75F, 0.0F, 0.0F, 3, 0, 7, 0.0F, false));

        this.talson3 = new ModelRenderer(this);
        this.talson3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body10.addChild(talson3);
        this.setRotateAngle(talson3, 0.0F, -0.7418F, 0.0F);
        this.talson3.cubeList.add(new ModelBox(talson3, 0, 41, -2.5F, 0.0F, 0.0F, 3, 0, 7, 0.0F, false));

        this.talson5 = new ModelRenderer(this);
        this.talson5.setRotationPoint(0.0F, 0.1F, 3.0F);
        this.body10.addChild(talson5);
        this.setRotateAngle(talson5, 0.0F, 0.7418F, 0.0F);
        this.talson5.cubeList.add(new ModelBox(talson5, 0, 14, -0.5F, 0.0F, 0.0F, 3, 0, 7, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(2.4F, 4.0F, 1.0F);
        this.body4.addChild(legL3);
        this.setRotateAngle(legL3, 0.0873F, 0.0F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 59, 42, -0.1F, 0.0F, -0.5F, 0, 6, 3, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(2.2F, 4.0F, 1.0F);
        this.body3.addChild(legL2);
        this.setRotateAngle(legL2, -0.3491F, 0.0F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 20, 60, 0.0F, 0.0F, -0.5F, 0, 6, 3, 0.0F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(2.4F, 4.0F, 1.0F);
        this.body2.addChild(legL);
        this.setRotateAngle(legL, -0.5236F, 0.0F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 18, 46, 0.0F, 0.0F, -0.5F, 0, 6, 3, 0.0F, false));

        this.armR = new ModelRenderer(this);
        this.armR.setRotationPoint(14.15F, -3.5F, -1.0F);
        this.bone.addChild(armR);
        this.setRotateAngle(armR, 0.0436F, 0.0F, 0.0F);
        this.armR.cubeList.add(new ModelBox(armR, 0, 60, -12.0F, -1.5F, -4.5F, 0, 8, 6, 0.0F, false));

        this.armL = new ModelRenderer(this);
        this.armL.setRotationPoint(15.45F, -2.5F, -1.0F);
        this.bone.addChild(armL);
        this.setRotateAngle(armL, -0.3491F, 0.0F, 0.0F);
        this.armL.cubeList.add(new ModelBox(armL, 59, 27, -13.0F, -1.5F, -4.5F, 0, 8, 6, 0.0F, false));

        this.armL2 = new ModelRenderer(this);
        this.armL2.setRotationPoint(10.1F, -2.25F, -3.0F);
        this.bone.addChild(armL2);
        this.setRotateAngle(armL2, -0.48F, 0.0F, 0.0F);
        this.armL2.cubeList.add(new ModelBox(armL2, 14, 10, -8.0F, 0.0F, -0.5F, 0, 4, 4, 0.0F, false));

        this.armL3 = new ModelRenderer(this);
        this.armL3.setRotationPoint(2.05F, -2.25F, -2.0F);
        this.bone.addChild(armL3);
        this.setRotateAngle(armL3, -0.3927F, 0.0F, 0.0F);
        this.armL3.cubeList.add(new ModelBox(armL3, 0, 14, 0.0F, 0.0F, -0.5F, 0, 3, 3, 0.0F, false));

        this.armL4 = new ModelRenderer(this);
        this.armL4.setRotationPoint(2.3F, -2.25F, -1.25F);
        this.bone.addChild(armL4);
        this.setRotateAngle(armL4, -0.0873F, 0.0F, 0.0F);
        this.armL4.cubeList.add(new ModelBox(armL4, 0, 0, 0.0F, 0.0F, -0.5F, 0, 3, 3, 0.0F, false));

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
