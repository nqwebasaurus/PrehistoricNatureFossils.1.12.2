package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAeger extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer bone;
    private final ModelRenderer antennaL1;
    private final ModelRenderer cube_r1;
    private final ModelRenderer antennaL4;
    private final ModelRenderer cube_r2;
    private final ModelRenderer antennaR2;
    private final ModelRenderer antennaR3;
    private final ModelRenderer antennaL3;
    private final ModelRenderer cube_r3;
    private final ModelRenderer antennaR5;
    private final ModelRenderer legL1;
    private final ModelRenderer legL2;
    private final ModelRenderer legL3;
    private final ModelRenderer legL4;
    private final ModelRenderer legL5;
    private final ModelRenderer legL6;
    private final ModelRenderer legL7;
    private final ModelRenderer legR7;
    private final ModelRenderer legR3;
    private final ModelRenderer legR2;
    private final ModelRenderer eyeL;
    private final ModelRenderer cube_r4;
    private final ModelRenderer eyeR;
    private final ModelRenderer body1;
    private final ModelRenderer body2;
    private final ModelRenderer pleopodR2;
    private final ModelRenderer body3;
    private final ModelRenderer pleopodR3;
    private final ModelRenderer body4;
    private final ModelRenderer body5;
    private final ModelRenderer body6;
    private final ModelRenderer tail;
    private final ModelRenderer tailfanL;

    public ModelSkeletonAeger() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-1.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -22.0F, -1.0F, -22.0F, 23, 1, 50, -0.01F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 51, 81, 0.0F, -1.0F, -21.0F, 11, 1, 19, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 52, -1.0F, -1.0F, -3.0F, 15, 1, 26, 0.01F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(-9.6F, -2.25F, 5.5F);
        this.fossil.addChild(bone);
        this.setRotateAngle(bone, -2.618F, 0.0F, 1.5708F);
        this.bone.cubeList.add(new ModelBox(bone, 63, 66, 1.09F, 1.7134F, 0.45F, 0, 1, 5, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 52, 1.1F, -1.2F, -0.1F, 0, 3, 6, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 40, 23, 1.1F, -1.2F, -1.1F, 0, 2, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 33, 16, 1.1F, -1.2F, -5.1F, 0, 1, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 16, 5, 1.1F, -1.2F, -2.1F, 0, 1, 1, 0.0F, false));

        this.antennaL1 = new ModelRenderer(this);
        this.antennaL1.setRotationPoint(1.2F, 0.4F, -0.6F);
        this.bone.addChild(antennaL1);
        this.setRotateAngle(antennaL1, 0.0F, 0.0436F, -1.5708F);
        this.antennaL1.cubeList.add(new ModelBox(antennaL1, 11, 0, -0.75F, 0.0F, -8.0F, 1, 0, 8, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.3259F, -0.1407F, -7.9628F);
        this.antennaL1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5236F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 62, 57, -0.4241F, 0.1407F, -6.0372F, 1, 0, 6, 0.0F, false));

        this.antennaL4 = new ModelRenderer(this);
        this.antennaL4.setRotationPoint(1.2F, 0.4F, -0.6F);
        this.bone.addChild(antennaL4);
        this.setRotateAngle(antennaL4, 0.0F, -0.2182F, -1.5708F);
        this.antennaL4.cubeList.add(new ModelBox(antennaL4, 11, 0, -0.75F, 0.0F, -8.0F, 1, 0, 8, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.3259F, -0.1407F, -7.9628F);
        this.antennaL4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 62, 57, -0.4241F, 0.1407F, -6.0372F, 1, 0, 6, 0.0F, false));

        this.antennaR2 = new ModelRenderer(this);
        this.antennaR2.setRotationPoint(1.1F, 0.55F, -0.6F);
        this.bone.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.0F, -0.6109F, 1.5708F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 33, 23, 0.0F, 0.0F, -4.0F, 1, 0, 4, 0.0F, false));

        this.antennaR3 = new ModelRenderer(this);
        this.antennaR3.setRotationPoint(1.3F, 1.616F, -1.1F);
        this.bone.addChild(antennaR3);
        this.setRotateAngle(antennaR3, 0.0F, 0.5483F, 1.586F);
        this.antennaR3.cubeList.add(new ModelBox(antennaR3, 0, 80, -1.1978F, 0.0131F, -5.6813F, 11, 0, 28, 0.0F, false));

        this.antennaL3 = new ModelRenderer(this);
        this.antennaL3.setRotationPoint(-1.0F, 0.75F, -0.6F);
        this.bone.addChild(antennaL3);
        this.setRotateAngle(antennaL3, 0.0039F, -0.2619F, -1.5283F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0943F, 2.2978F, -1.0343F);
        this.antennaL3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0175F, -0.2269F, -0.0349F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 55, 52, -10.7541F, -0.0999F, -4.9985F, 11, 0, 28, 0.0F, false));

        this.antennaR5 = new ModelRenderer(this);
        this.antennaR5.setRotationPoint(0.0F, 0.4F, -0.6F);
        this.bone.addChild(antennaR5);
        this.setRotateAngle(antennaR5, -0.141F, 0.192F, 1.658F);


        this.legL1 = new ModelRenderer(this);
        this.legL1.setRotationPoint(1.25F, 1.15F, 0.15F);
        this.bone.addChild(legL1);
        this.setRotateAngle(legL1, 0.1745F, 0.0F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 11, 63, 0.0F, -0.5F, -5.0F, 0, 1, 5, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(-1.0F, 2.15F, 0.65F);
        this.bone.addChild(legL2);
        this.setRotateAngle(legL2, -0.3846F, 0.011F, 0.0031F);
        this.legL2.cubeList.add(new ModelBox(legL2, 11, 9, 2.2999F, -0.5133F, -9.9774F, 0, 8, 10, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(-0.75F, 2.4F, 2.4F);
        this.bone.addChild(legL3);
        this.setRotateAngle(legL3, 0.469F, 0.0586F, -0.0026F);
        this.legL3.cubeList.add(new ModelBox(legL3, 23, 19, 2.2961F, -0.4337F, -8.8827F, 0, 10, 9, 0.0F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(1.2F, 2.15F, 1.65F);
        this.bone.addChild(legL4);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 62, -0.01F, -0.5F, -5.0F, 0, 5, 5, 0.0F, false));

        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(1.25F, 2.15F, 2.65F);
        this.bone.addChild(legL5);
        this.setRotateAngle(legL5, 1.3526F, 0.0F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 13, 52, -0.01F, -0.5F, -5.0F, 0, 5, 5, 0.0F, false));

        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(1.25F, 2.15F, 4.65F);
        this.bone.addChild(legL6);
        this.setRotateAngle(legL6, -0.0689F, 0.0F, 0.0F);
        this.legL6.cubeList.add(new ModelBox(legL6, 37, 34, 0.0F, -0.5F, -5.0F, 0, 9, 5, 0.0F, false));

        this.legL7 = new ModelRenderer(this);
        this.legL7.setRotationPoint(1.2F, 2.15F, 5.65F);
        this.bone.addChild(legL7);
        this.setRotateAngle(legL7, 0.762F, 0.0F, 0.0F);
        this.legL7.cubeList.add(new ModelBox(legL7, 14, 34, 0.0F, -0.5F, -5.0F, 0, 9, 5, 0.0F, false));

        this.legR7 = new ModelRenderer(this);
        this.legR7.setRotationPoint(1.2F, 2.15F, 5.65F);
        this.bone.addChild(legR7);
        this.setRotateAngle(legR7, 0.2531F, 0.0F, 0.0F);
        this.legR7.cubeList.add(new ModelBox(legR7, 25, 4, 0.01F, -0.5F, -5.0F, 0, 9, 5, 0.0F, false));

        this.legR3 = new ModelRenderer(this);
        this.legR3.setRotationPoint(1.15F, 2.4F, 2.4F);
        this.bone.addChild(legR3);
        this.setRotateAngle(legR3, -0.0992F, 0.0F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 19, 0.0F, -0.5F, -9.0F, 0, 10, 9, 0.0F, false));

        this.legR2 = new ModelRenderer(this);
        this.legR2.setRotationPoint(1.1F, 2.15F, 0.65F);
        this.bone.addChild(legR2);
        this.setRotateAngle(legR2, 0.7062F, 0.0F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 0, 0.1F, -0.5F, -10.0F, 0, 8, 10, 0.0F, false));

        this.eyeL = new ModelRenderer(this);
        this.eyeL.setRotationPoint(0.0F, 0.3F, -0.6F);
        this.bone.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, 0.2182F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.7385F, 0.3F, 0.4155F);
        this.eyeL.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, -0.2094F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 19, -0.6882F, -1.3F, -2.961F, 1, 1, 3, 0.0F, false));

        this.eyeR = new ModelRenderer(this);
        this.eyeR.setRotationPoint(0.0F, 0.3F, -0.6F);
        this.bone.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, -0.2182F, 0.0F);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.1F, 5.4F);
        this.bone.addChild(body1);
        this.setRotateAngle(body1, 0.2182F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 43, 15, 1.2F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, -0.2618F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 42, 26, 1.21F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.pleopodR2 = new ModelRenderer(this);
        this.pleopodR2.setRotationPoint(1.2F, 4.0F, 1.0F);
        this.body2.addChild(pleopodR2);
        this.setRotateAngle(pleopodR2, 0.0F, -1.5708F, 0.0F);
        this.pleopodR2.cubeList.add(new ModelBox(pleopodR2, 36, 0, -0.5F, -0.5F, 0.0F, 1, 4, 0, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.3054F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 39, 1.19F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.pleopodR3 = new ModelRenderer(this);
        this.pleopodR3.setRotationPoint(0.5F, 4.0F, 1.0F);
        this.body3.addChild(pleopodR3);
        this.setRotateAngle(pleopodR3, 0.0F, -1.5708F, 0.0F);
        this.pleopodR3.cubeList.add(new ModelBox(pleopodR3, 22, 9, 0.6411F, -1.2127F, -0.7F, 1, 4, 0, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.3491F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 31, 2, 1.21F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.3054F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 11, 0, 1.2F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, -0.5236F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 43, 33, 1.21F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body6.addChild(tail);
        this.setRotateAngle(tail, -0.3927F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, 1.21F, 0.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.tailfanL = new ModelRenderer(this);
        this.tailfanL.setRotationPoint(1.25F, 0.7439F, -0.0695F);
        this.tail.addChild(tailfanL);
        this.setRotateAngle(tailfanL, 0.0F, 0.3738F, 1.5708F);
        this.tailfanL.cubeList.add(new ModelBox(tailfanL, 5, 6, -0.49F, 0.0F, -0.25F, 1, 0, 1, 0.0F, false));
        this.tailfanL.cubeList.add(new ModelBox(tailfanL, 0, 6, -0.49F, 0.0F, 3.75F, 1, 0, 1, 0.0F, false));
        this.tailfanL.cubeList.add(new ModelBox(tailfanL, 63, 52, -0.99F, 0.0F, 0.75F, 2, 0, 3, 0.0F, false));

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
