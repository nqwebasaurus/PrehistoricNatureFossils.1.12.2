package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMarrella extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer body;
    private final ModelRenderer legL6;
    private final ModelRenderer legL5;
    private final ModelRenderer legL4;
    private final ModelRenderer legL3;
    private final ModelRenderer legL2;
    private final ModelRenderer legL1;
    private final ModelRenderer frontlegL;
    private final ModelRenderer frontlegR;
    private final ModelRenderer antennaL2;
    private final ModelRenderer antennaL;

    public ModelSkeletonMarrella() {
        this.textureWidth = 96;
        this.textureHeight = 50;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 23.0F, -0.5F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -10.0F, -1.0F, -10.5F, 20, 2, 21, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.6F, 6.4F);
        this.fossil.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 23, 34, 1.0F, -2.9F, -8.5F, 5, 0, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 10, 0, -1.0F, -2.9F, -8.75F, 2, 0, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, -2.95F, -6.0F, 1, 0, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 33, -2.0F, -3.0F, -5.75F, 4, 0, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 34, 24, -6.0F, -2.9F, -8.5F, 5, 0, 6, 0.0F, false));

        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(0.5F, -3.25F, -2.25F);
        this.body.addChild(legL6);


        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(0.5F, -3.25F, -3.0F);
        this.body.addChild(legL5);


        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(0.5F, -3.25F, -3.75F);
        this.body.addChild(legL4);


        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(0.5F, -3.25F, -4.4F);
        this.body.addChild(legL3);


        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(0.5F, -3.25F, -5.0F);
        this.body.addChild(legL2);


        this.legL1 = new ModelRenderer(this);
        this.legL1.setRotationPoint(0.5F, -3.25F, -5.5F);
        this.body.addChild(legL1);
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 4, 0.0F, 0.4F, 2.0F, 2, 0, 1, 0.0F, false));
        this.legL1.cubeList.add(new ModelBox(legL1, 10, 14, 2.0F, 0.4F, 3.0F, 1, 0, 1, 0.0F, false));
        this.legL1.cubeList.add(new ModelBox(legL1, 10, 4, 0.0F, 0.4F, 3.3F, 1, 0, 1, 0.0F, false));
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 14, 0.0F, 0.4F, 5.1F, 1, 0, 1, 0.0F, false));
        this.legL1.cubeList.add(new ModelBox(legL1, 14, 15, 1.0F, 0.4F, 4.3F, 1, 0, 1, 0.0F, false));
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 0, 0.0F, 0.4F, 0.7F, 2, 0, 1, 0.0F, false));
        this.legL1.cubeList.add(new ModelBox(legL1, 5, 14, 2.0F, 0.4F, 1.7F, 1, 0, 1, 0.0F, false));
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 2, 0.0F, 0.4F, -0.6F, 2, 0, 1, 0.0F, false));
        this.legL1.cubeList.add(new ModelBox(legL1, 14, 5, 2.0F, 0.4F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 2, -3.0F, 0.4F, -0.6F, 2, 0, 1, 0.0F, true));
        this.legL1.cubeList.add(new ModelBox(legL1, 14, 5, -4.0F, 0.4F, 0.4F, 1, 0, 1, 0.0F, true));
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 0, -3.0F, 0.4F, 0.7F, 2, 0, 1, 0.0F, true));
        this.legL1.cubeList.add(new ModelBox(legL1, 5, 14, -4.0F, 0.4F, 1.7F, 1, 0, 1, 0.0F, true));
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 4, -3.0F, 0.4F, 2.0F, 2, 0, 1, 0.0F, true));
        this.legL1.cubeList.add(new ModelBox(legL1, 10, 14, -4.0F, 0.4F, 3.0F, 1, 0, 1, 0.0F, true));
        this.legL1.cubeList.add(new ModelBox(legL1, 10, 4, -2.0F, 0.4F, 3.3F, 1, 0, 1, 0.0F, true));
        this.legL1.cubeList.add(new ModelBox(legL1, 14, 15, -3.0F, 0.4F, 4.3F, 1, 0, 1, 0.0F, true));
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 14, -2.0F, 0.4F, 5.1F, 1, 0, 1, 0.0F, true));

        this.frontlegL = new ModelRenderer(this);
        this.frontlegL.setRotationPoint(1.0F, -3.5F, -7.0F);
        this.body.addChild(frontlegL);
        this.setRotateAngle(frontlegL, 0.0F, -0.6981F, 0.0F);
        this.frontlegL.cubeList.add(new ModelBox(frontlegL, 0, 8, -0.5F, 0.8F, 0.0F, 7, 0, 2, 0.0F, false));

        this.frontlegR = new ModelRenderer(this);
        this.frontlegR.setRotationPoint(-1.0F, -3.5F, -7.0F);
        this.body.addChild(frontlegR);
        this.setRotateAngle(frontlegR, 0.0F, -0.3491F, 0.0F);
        this.frontlegR.cubeList.add(new ModelBox(frontlegR, 0, 11, -6.5F, 0.8F, 0.0F, 7, 0, 2, 0.0F, false));

        this.antennaL2 = new ModelRenderer(this);
        this.antennaL2.setRotationPoint(-1.0F, -3.0F, -7.0F);
        this.body.addChild(antennaL2);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 0, 24, -3.25F, 0.3F, -8.0F, 4, 0, 8, 0.0F, false));

        this.antennaL = new ModelRenderer(this);
        this.antennaL.setRotationPoint(1.0F, -3.0F, -7.0F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.1309F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 17, 25, -0.75F, 0.3F, -8.0F, 4, 0, 8, 0.0F, false));

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
