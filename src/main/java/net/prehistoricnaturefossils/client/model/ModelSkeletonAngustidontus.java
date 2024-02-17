package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAngustidontus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer antennaR2;
    private final ModelRenderer antennaL2;
    private final ModelRenderer antennaR3;
    private final ModelRenderer antennaL3;
    private final ModelRenderer antennaR1;
    private final ModelRenderer antennaL1;
    private final ModelRenderer eyeL;
    private final ModelRenderer body1;
    private final ModelRenderer body2;
    private final ModelRenderer legL;
    private final ModelRenderer body3;
    private final ModelRenderer legL2;
    private final ModelRenderer body4;
    private final ModelRenderer legL3;
    private final ModelRenderer body5;
    private final ModelRenderer legL4;
    private final ModelRenderer body6;
    private final ModelRenderer legL5;
    private final ModelRenderer body7;
    private final ModelRenderer body8;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer armR;
    private final ModelRenderer armsR;
    private final ModelRenderer armL;
    private final ModelRenderer armsL;
    private final ModelRenderer armL2;
    private final ModelRenderer armL3;
    private final ModelRenderer armL4;
    private final ModelRenderer armL5;
    private final ModelRenderer armL6;
    private final ModelRenderer armL7;
    private final ModelRenderer armL8;

    public ModelSkeletonAngustidontus() {
        this.textureWidth = 144;
        this.textureHeight = 120;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -9.0F, -2.0F, 2.0F, 26, 2, 24, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 56, 27, -9.0F, -2.0F, -26.0F, 14, 2, 28, 0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-21.5F, -1.0F, -6.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.9286F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 61, -34.6724F, -1.0F, 0.1557F, 35, 2, 9, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(4.0F, -1.0F, -2.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.0036F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 73, -10.0F, -1.0F, -23.5F, 23, 2, 15, -0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(17.0F, 0.0F, 2.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.3927F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 27, -12.0F, -2.0F, -30.5F, 12, 2, 31, 0.0F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(1.0F, 0.15F, 5.7F);
        this.fossil.addChild(bone);
        this.setRotateAngle(bone, -0.3054F, 0.0F, -1.5708F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 2.8F, -5.9F, -4.65F, 0, 3, 5, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 0, 3.1F, -6.35F, -7.25F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 3.1F, -6.35F, -6.25F, 0, 6, 11, 0.0F, false));

        this.antennaR2 = new ModelRenderer(this);
        this.antennaR2.setRotationPoint(2.25F, -3.75F, -5.5F);
        this.bone.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.5236F, 0.0F, 0.0F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 9, 32, 0.0F, -2.5F, -8.0F, 0, 4, 8, 0.0F, false));

        this.antennaL2 = new ModelRenderer(this);
        this.antennaL2.setRotationPoint(1.55F, -3.75F, -5.5F);
        this.bone.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.1745F, 0.0F, 0.0F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 0, 27, 1.0F, -2.5F, -8.0F, 0, 4, 8, 0.0F, false));

        this.antennaR3 = new ModelRenderer(this);
        this.antennaR3.setRotationPoint(2.2F, -2.25F, -6.5F);
        this.bone.addChild(antennaR3);
        this.setRotateAngle(antennaR3, 0.0F, 0.48F, -1.5708F);
        this.antennaR3.cubeList.add(new ModelBox(antennaR3, 56, 27, -2.0F, 0.0F, -5.5F, 2, 0, 7, 0.0F, false));

        this.antennaL3 = new ModelRenderer(this);
        this.antennaL3.setRotationPoint(0.3F, -2.95F, -5.1F);
        this.bone.addChild(antennaL3);
        this.setRotateAngle(antennaL3, 0.0F, -0.2182F, 1.5708F);
        this.antennaL3.cubeList.add(new ModelBox(antennaL3, 0, 45, 0.0F, -2.0F, -6.9F, 2, 0, 7, 0.0F, false));

        this.antennaR1 = new ModelRenderer(this);
        this.antennaR1.setRotationPoint(2.45F, -3.4F, -5.0F);
        this.bone.addChild(antennaR1);
        this.setRotateAngle(antennaR1, 0.2182F, 0.0F, 0.0F);
        this.antennaR1.cubeList.add(new ModelBox(antennaR1, 55, 85, -0.25F, 0.0F, -22.0F, 0, 4, 22, 0.0F, false));

        this.antennaL1 = new ModelRenderer(this);
        this.antennaL1.setRotationPoint(2.05F, -3.4F, -5.0F);
        this.bone.addChild(antennaL1);
        this.setRotateAngle(antennaL1, -0.0873F, 0.0F, 0.0F);
        this.antennaL1.cubeList.add(new ModelBox(antennaL1, 67, 58, 0.25F, 0.0F, -22.0F, 0, 4, 22, 0.0F, false));

        this.eyeL = new ModelRenderer(this);
        this.eyeL.setRotationPoint(1.8F, -4.25F, -6.2F);
        this.bone.addChild(eyeL);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 0, 0, 1.0F, -1.0F, -2.0F, 0, 1, 2, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -5.9F, -1.5F);
        this.bone.addChild(body1);
        this.setRotateAngle(body1, 0.0436F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, -0.2182F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 10, 73, 3.11F, 0.0F, 0.0F, 0, 5, 2, 0.015F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(2.8F, 5.0F, 1.0F);
        this.body2.addChild(legL);
        this.setRotateAngle(legL, -0.3491F, 0.0F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 72, 32, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.1745F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 5, 73, 3.11F, 0.0F, 0.0F, 0, 5, 2, 0.01F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(2.9F, 5.0F, 1.0F);
        this.body3.addChild(legL2);
        this.setRotateAngle(legL2, -0.3491F, 0.0F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 61, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.1745F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 73, 3.11F, 0.0F, 0.0F, 0, 5, 2, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(3.0F, 5.0F, 1.0F);
        this.body4.addChild(legL3);
        this.setRotateAngle(legL3, -0.3491F, 0.0F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 40, -0.3F, 0.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 2.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.1309F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 67, 73, 3.11F, 0.0F, 0.0F, 0, 4, 2, -0.01F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(3.1F, 4.0F, 1.0F);
        this.body5.addChild(legL4);
        this.setRotateAngle(legL4, -0.3491F, 0.0F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 12, 0, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(1.0F, 0.05F, 2.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, -0.1745F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 0, 27, 2.01F, 0.0F, -0.5F, 0, 4, 3, 0.01F, false));

        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(2.0F, 4.0F, 1.0F);
        this.body6.addChild(legL5);
        this.setRotateAngle(legL5, -0.0873F, 0.0F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 9, 27, 0.0F, 0.0F, -0.5F, 0, 4, 3, 0.0F, false));

        this.body7 = new ModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.25F, 2.0F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, -0.1745F, 0.0F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 12, 45, 2.01F, 0.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.body8 = new ModelRenderer(this);
        this.body8.setRotationPoint(1.1F, 0.75F, 3.0F);
        this.body7.addChild(body8);
        this.setRotateAngle(body8, -0.2182F, 0.0F, 0.0F);
        this.body8.cubeList.add(new ModelBox(body8, 0, 18, 1.01F, -0.5F, 0.0F, 0, 2, 3, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 7, 18, 0.91F, 0.1F, 3.0F, 0, 1, 3, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.9197F, 1.1537F, 0.2833F);
        this.body8.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.6919F, 1.5708F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 35, -1.2058F, 0.0937F, -0.0455F, 2, 0, 7, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.9197F, 1.1537F, 0.2833F);
        this.body8.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.4323F, 1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 56, 43, -1.2288F, -0.1168F, -0.2712F, 2, 0, 6, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.9309F, 1.1969F, 0.5186F);
        this.body8.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.1745F, -1.5708F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 46, -0.6656F, -0.3063F, -0.4588F, 2, 0, 7, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.9309F, 1.1969F, 0.5186F);
        this.body8.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0436F, -1.5708F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 67, 44, -0.5468F, -0.1168F, -0.6377F, 2, 0, 6, 0.0F, false));

        this.armR = new ModelRenderer(this);
        this.armR.setRotationPoint(2.35F, -2.5F, -4.0F);
        this.bone.addChild(armR);
        this.setRotateAngle(armR, -0.829F, 0.0F, 0.0F);
        this.armR.cubeList.add(new ModelBox(armR, 26, 37, 0.0F, 0.0F, -1.0F, 0, 7, 2, 0.0F, false));

        this.armsR = new ModelRenderer(this);
        this.armsR.setRotationPoint(0.0F, 7.0F, -0.5F);
        this.armR.addChild(armsR);
        this.setRotateAngle(armsR, 1.8326F, 0.0F, 0.0F);
        this.armsR.cubeList.add(new ModelBox(armsR, 23, 27, 0.01F, 0.0F, -0.5F, 0, 9, 2, 0.0F, false));

        this.armL = new ModelRenderer(this);
        this.armL.setRotationPoint(2.65F, -2.5F, -4.0F);
        this.bone.addChild(armL);
        this.setRotateAngle(armL, -1.4835F, 0.0F, 0.0F);
        this.armL.cubeList.add(new ModelBox(armL, 19, 0, 0.0F, 0.0F, -1.0F, 0, 7, 2, 0.0F, false));

        this.armsL = new ModelRenderer(this);
        this.armsL.setRotationPoint(0.0F, 7.0F, -0.5F);
        this.armL.addChild(armsL);
        this.setRotateAngle(armsL, 0.829F, 0.0F, 0.0F);
        this.armsL.cubeList.add(new ModelBox(armsL, 18, 27, -0.01F, 0.0F, -0.5F, 0, 9, 2, 0.0F, false));

        this.armL2 = new ModelRenderer(this);
        this.armL2.setRotationPoint(2.6F, -2.5F, -3.5F);
        this.bone.addChild(armL2);
        this.setRotateAngle(armL2, -0.6545F, 0.0F, 0.0F);
        this.armL2.cubeList.add(new ModelBox(armL2, 62, 73, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

        this.armL3 = new ModelRenderer(this);
        this.armL3.setRotationPoint(2.8F, -2.5F, -2.5F);
        this.bone.addChild(armL3);
        this.setRotateAngle(armL3, -0.6109F, 0.0F, 0.0F);
        this.armL3.cubeList.add(new ModelBox(armL3, 68, 27, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

        this.armL4 = new ModelRenderer(this);
        this.armL4.setRotationPoint(2.9F, -2.75F, -1.5F);
        this.bone.addChild(armL4);
        this.setRotateAngle(armL4, -0.3491F, 0.0F, 0.0F);
        this.armL4.cubeList.add(new ModelBox(armL4, 56, 35, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

        this.armL5 = new ModelRenderer(this);
        this.armL5.setRotationPoint(2.8F, -2.0F, -0.75F);
        this.bone.addChild(armL5);
        this.setRotateAngle(armL5, -0.2618F, 0.0F, 0.0F);
        this.armL5.cubeList.add(new ModelBox(armL5, 77, 0, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

        this.armL6 = new ModelRenderer(this);
        this.armL6.setRotationPoint(2.9F, -2.0F, 0.0F);
        this.bone.addChild(armL6);
        this.setRotateAngle(armL6, -0.1309F, 0.0F, 0.0F);
        this.armL6.cubeList.add(new ModelBox(armL6, 76, 27, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

        this.armL7 = new ModelRenderer(this);
        this.armL7.setRotationPoint(2.8F, -2.0F, 0.75F);
        this.bone.addChild(armL7);
        this.setRotateAngle(armL7, -0.0436F, 0.0F, 0.0F);
        this.armL7.cubeList.add(new ModelBox(armL7, 72, 73, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

        this.armL8 = new ModelRenderer(this);
        this.armL8.setRotationPoint(2.7F, -2.0F, 1.5F);
        this.bone.addChild(armL8);
        this.setRotateAngle(armL8, 0.2618F, 0.0F, 0.0F);
        this.armL8.cubeList.add(new ModelBox(armL8, 56, 27, 0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F, false));

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
