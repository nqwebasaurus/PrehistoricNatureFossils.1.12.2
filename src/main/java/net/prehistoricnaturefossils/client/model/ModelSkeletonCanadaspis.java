package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCanadaspis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body5;
    private final ModelRenderer antennaL;
    private final ModelRenderer antennaR2;
    private final ModelRenderer shell2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer antennaR;
    private final ModelRenderer shell;
    private final ModelRenderer body1;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r4;
    private final ModelRenderer legL;
    private final ModelRenderer legL2;
    private final ModelRenderer legL3;
    private final ModelRenderer legL4;
    private final ModelRenderer legL5;
    private final ModelRenderer legL6;
    private final ModelRenderer legL7;

    public ModelSkeletonCanadaspis() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 26, -8.0F, -2.0F, -10.0F, 16, 2, 22, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(2.2228F, -1.0F, 18.6538F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.1345F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.7F, -1.0F, -12.1F, 15, 2, 23, 0.002F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(3.0F, -1.0F, 1.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.5236F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 51, -1.2F, -1.0F, -7.0F, 11, 2, 22, -0.002F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(6.0F, -4.5833F, 12.1667F);
        this.fossil.addChild(body5);
        this.setRotateAngle(body5, 0.0F, 1.9635F, 0.0F);


        this.antennaL = new ModelRenderer(this);
        this.antennaL.setRotationPoint(-11.0F, 0.8333F, -10.9167F);
        this.body5.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.3054F, 0.0F);


        this.antennaR2 = new ModelRenderer(this);
        this.antennaR2.setRotationPoint(-11.0F, 0.8333F, -10.9167F);
        this.body5.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.0F, 0.3054F, 0.0F);


        this.shell2 = new ModelRenderer(this);
        this.shell2.setRotationPoint(-11.0F, 1.9833F, -11.4167F);
        this.body5.addChild(shell2);
        this.shell2.cubeList.add(new ModelBox(shell2, 0, 51, 10.5F, 0.4587F, 9.5581F, 1, 0, 9, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(12.4026F, 0.4721F, 15.2081F);
        this.shell2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.0F, -7.0F, -4.5F, 0, 11, 9, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.55F, 0.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0F, -1.5708F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -3.0F, -5.0F, 0, 3, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.35F, -2.5F, -6.0F, 0, 1, 1, 0.0F, false));

        this.antennaR = new ModelRenderer(this);
        this.antennaR.setRotationPoint(-1.4F, -2.8F, -4.95F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, -0.1309F, 0.0F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 26, 0.0F, -0.5F, -3.0F, 0, 2, 3, 0.0F, false));

        this.shell = new ModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -3.25F, -5.25F);
        this.body.addChild(shell);
        this.setRotateAngle(shell, 0.0873F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 26, -1.3F, -0.55F, -0.25F, 0, 5, 9, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.body.addChild(body1);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, -0.6109F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 41, -1.4F, -1.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.3054F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 17, 39, -1.39F, -1.01F, 0.0F, 0, 3, 2, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.4363F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 10, 0, -1.4F, -0.5F, 0.0F, 0, 2, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 17, 19, -1.45F, -0.05F, 0.9F, 0, 1, 2, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.55F, 1.05F, 0.9F);
        this.body4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6283F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 0, 0.1F, -0.7F, 0.0F, 0, 1, 2, 0.0F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(-1.45F, 1.75F, 0.1F);
        this.body1.addChild(legL);
        this.setRotateAngle(legL, -0.3491F, 0.0F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 5, 41, 0.1F, 0.0F, -2.0F, 0, 3, 1, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(-1.45F, 1.75F, 0.6F);
        this.body1.addChild(legL2);
        this.setRotateAngle(legL2, -0.2618F, 0.0F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 19, 33, 0.1F, 0.0F, -1.4F, 0, 3, 1, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(0.25F, 1.75F, 1.1F);
        this.body1.addChild(legL3);
        this.setRotateAngle(legL3, -0.0873F, 0.0F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 19, 26, -1.6F, 0.0F, -1.1F, 0, 3, 1, 0.0F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(-1.45F, 1.75F, 1.8F);
        this.body1.addChild(legL4);
        this.setRotateAngle(legL4, 0.0436F, 0.0F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 16, 26, 0.1F, 0.0F, -1.0F, 0, 3, 1, 0.0F, false));

        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(-1.35F, 1.75F, 2.8F);
        this.body1.addChild(legL5);
        this.setRotateAngle(legL5, 0.1309F, 0.0F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 10, 26, 0.0F, 0.0F, -1.0F, 0, 3, 1, 0.0F, false));

        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(-1.55F, 1.55F, 3.0F);
        this.body1.addChild(legL6);
        this.setRotateAngle(legL6, 0.1745F, 0.0F, 0.0F);
        this.legL6.cubeList.add(new ModelBox(legL6, 19, 14, 0.1F, 0.0F, 0.0F, 0, 3, 1, 0.0F, false));

        this.legL7 = new ModelRenderer(this);
        this.legL7.setRotationPoint(-1.55F, 1.15F, 4.0F);
        this.body1.addChild(legL7);
        this.setRotateAngle(legL7, 0.2182F, 0.0F, 0.0F);
        this.legL7.cubeList.add(new ModelBox(legL7, 19, 9, 0.1F, 0.0F, 0.0F, 0, 3, 1, 0.0F, false));

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
