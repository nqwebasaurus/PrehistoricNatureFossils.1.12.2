package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHibbertopterus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer carapace;
    private final ModelRenderer carapace4_r1;
    private final ModelRenderer legsR;
    private final ModelRenderer leg_r1;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw_r1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer legL;
    private final ModelRenderer legL2_r1;
    private final ModelRenderer legL1_r1;
    private final ModelRenderer legsL;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw_r2;
    private final ModelRenderer jaw4;
    private final ModelRenderer jaw_r3;
    private final ModelRenderer opisthosoma;
    private final ModelRenderer opisthosoma1_r1;
    private final ModelRenderer opisthosoma2;
    private final ModelRenderer opisthosoma3_r1;
    private final ModelRenderer opisthosoma3;
    private final ModelRenderer opisthosoma3_r2;
    private final ModelRenderer opisthosoma4;
    private final ModelRenderer opisthosoma5_r1;

    public ModelSkeletonHibbertopterus() {
        this.textureWidth = 96;
        this.textureHeight = 75;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-2.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -5.0F, -2.0F, -10.0F, 13, 2, 19, 0.004F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 22, -7.0F, -1.0F, -12.0F, 2, 1, 21, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 33, 61, -5.0F, -2.0F, -13.0F, 9, 2, 3, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 37, 47, 6.0F, -3.0F, -7.0F, 5, 3, 10, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 37, 35, -1.0F, -1.0F, 3.0F, 11, 1, 10, 0.003F, false));

        this.carapace = new ModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.fossil.addChild(carapace);
        this.carapace.cubeList.add(new ModelBox(carapace, 46, 0, -6.0F, -6.0F, -4.0F, 12, 6, 5, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 46, 12, -6.0F, -2.0F, -7.0F, 12, 2, 3, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 26, 22, -6.5F, -0.9F, -7.5F, 13, 1, 9, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 59, -6.0F, -6.0F, 1.0F, 12, 6, 4, 0.0F, false));

        this.carapace4_r1 = new ModelRenderer(this);
        this.carapace4_r1.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.carapace.addChild(carapace4_r1);
        this.setRotateAngle(carapace4_r1, 0.9599F, 0.0F, 0.0F);
        this.carapace4_r1.cubeList.add(new ModelBox(carapace4_r1, 58, 47, -5.5F, -9.0F, 0.9F, 11, 3, 5, 0.0F, false));

        this.legsR = new ModelRenderer(this);
        this.legsR.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.carapace.addChild(legsR);


        this.leg_r1 = new ModelRenderer(this);
        this.leg_r1.setRotationPoint(-2.0F, -4.0F, -6.0F);
        this.legsR.addChild(leg_r1);
        this.setRotateAngle(leg_r1, -0.9967F, -0.8564F, -0.1633F);
        this.leg_r1.cubeList.add(new ModelBox(leg_r1, 26, 39, -5.9392F, -0.6502F, 0.2642F, 6, 1, 1, 0.0F, false));

        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(-1.0F, -4.0F, -5.0F);
        this.legsR.addChild(jaw1);
        this.setRotateAngle(jaw1, -0.5672F, 0.0F, 0.0F);


        this.jaw_r1 = new ModelRenderer(this);
        this.jaw_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw1.addChild(jaw_r1);
        this.setRotateAngle(jaw_r1, 0.5236F, 0.0873F, 0.0F);
        this.jaw_r1.cubeList.add(new ModelBox(jaw_r1, 0, 36, -0.9396F, -0.0018F, -4.1109F, 2, 0, 4, 0.0F, false));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(-2.0F, -4.0F, -6.0F);
        this.legsR.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.3348F, 0.4149F, -0.1393F);


        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(2.0F, 4.0F, 6.0F);
        this.jaw2.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, 0.2618F, 0.0873F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 10, 33, -1.5F, -5.5F, -10.0F, 2, 0, 3, 0.0F, false));
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 0, 22, -2.0F, -6.0F, -10.0F, 1, 1, 5, 0.0F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(-3.0F, -4.0F, -2.0F);
        this.legsR.addChild(legL);
        this.setRotateAngle(legL, 0.0718F, 0.3864F, 0.1886F);


        this.legL2_r1 = new ModelRenderer(this);
        this.legL2_r1.setRotationPoint(-5.366F, 2.2679F, 3.7679F);
        this.legL.addChild(legL2_r1);
        this.setRotateAngle(legL2_r1, 0.2908F, 1.1025F, -0.0346F);
        this.legL2_r1.cubeList.add(new ModelBox(legL2_r1, 13, 27, -0.9915F, -0.617F, -0.7415F, 2, 1, 1, 0.0F, false));

        this.legL1_r1 = new ModelRenderer(this);
        this.legL1_r1.setRotationPoint(3.0F, 4.0F, 2.0F);
        this.legL.addChild(legL1_r1);
        this.setRotateAngle(legL1_r1, 0.0F, 0.5236F, -0.5236F);
        this.legL1_r1.cubeList.add(new ModelBox(legL1_r1, 0, 6, -6.0F, -7.0F, -3.0F, 6, 2, 2, 0.0F, false));

        this.legsL = new ModelRenderer(this);
        this.legsL.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.carapace.addChild(legsL);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(1.0F, -4.0F, -5.0F);
        this.legsL.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.5672F, 0.0F, 0.0F);


        this.jaw_r2 = new ModelRenderer(this);
        this.jaw_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw3.addChild(jaw_r2);
        this.setRotateAngle(jaw_r2, 0.5236F, -0.0873F, 0.0F);
        this.jaw_r2.cubeList.add(new ModelBox(jaw_r2, 8, 22, -1.0604F, -0.0018F, -4.1109F, 2, 0, 4, 0.0F, false));

        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(2.0F, -4.0F, -6.0F);
        this.legsL.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.2679F, -0.2106F, 0.0573F);


        this.jaw_r3 = new ModelRenderer(this);
        this.jaw_r3.setRotationPoint(-2.0F, 4.0F, 6.0F);
        this.jaw4.addChild(jaw_r3);
        this.setRotateAngle(jaw_r3, 0.2618F, -0.0873F, 0.0F);
        this.jaw_r3.cubeList.add(new ModelBox(jaw_r3, 8, 11, -0.5F, -5.5F, -10.0F, 2, 0, 3, 0.0F, false));
        this.jaw_r3.cubeList.add(new ModelBox(jaw_r3, 0, 11, 1.0F, -6.0F, -10.0F, 1, 1, 5, 0.0F, false));

        this.opisthosoma = new ModelRenderer(this);
        this.opisthosoma.setRotationPoint(0.0F, -2.3F, 2.0F);
        this.carapace.addChild(opisthosoma);
        this.setRotateAngle(opisthosoma, 0.0873F, 0.0F, 0.0F);


        this.opisthosoma1_r1 = new ModelRenderer(this);
        this.opisthosoma1_r1.setRotationPoint(0.0F, 6.0F, -2.0F);
        this.opisthosoma.addChild(opisthosoma1_r1);
        this.setRotateAngle(opisthosoma1_r1, -0.2182F, 0.0F, 0.0F);
        this.opisthosoma1_r1.cubeList.add(new ModelBox(opisthosoma1_r1, 0, 45, -5.0F, -9.0F, -1.0F, 10, 5, 8, 0.0F, false));

        this.opisthosoma2 = new ModelRenderer(this);
        this.opisthosoma2.setRotationPoint(0.0F, 1.5F, 6.0F);
        this.opisthosoma.addChild(opisthosoma2);


        this.opisthosoma3_r1 = new ModelRenderer(this);
        this.opisthosoma3_r1.setRotationPoint(0.0F, 4.5F, -8.0F);
        this.opisthosoma2.addChild(opisthosoma3_r1);
        this.setRotateAngle(opisthosoma3_r1, -0.2182F, 0.0F, 0.0F);
        this.opisthosoma3_r1.cubeList.add(new ModelBox(opisthosoma3_r1, 26, 33, -1.0F, -8.0F, 8.0F, 5, 4, 1, 0.0F, false));
        this.opisthosoma3_r1.cubeList.add(new ModelBox(opisthosoma3_r1, 0, 0, -4.0F, -8.0F, 7.0F, 8, 4, 1, 0.0F, false));

        this.opisthosoma3 = new ModelRenderer(this);
        this.opisthosoma3.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.opisthosoma2.addChild(opisthosoma3);


        this.opisthosoma3_r2 = new ModelRenderer(this);
        this.opisthosoma3_r2.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.opisthosoma3.addChild(opisthosoma3_r2);
        this.setRotateAngle(opisthosoma3_r2, -0.2182F, 0.0F, 0.0F);
        this.opisthosoma3_r2.cubeList.add(new ModelBox(opisthosoma3_r2, 0, 29, -1.0F, -8.0F, 9.0F, 4, 4, 2, 0.0F, false));

        this.opisthosoma4 = new ModelRenderer(this);
        this.opisthosoma4.setRotationPoint(0.0F, 1.0F, 2.0F);
        this.opisthosoma3.addChild(opisthosoma4);


        this.opisthosoma5_r1 = new ModelRenderer(this);
        this.opisthosoma5_r1.setRotationPoint(0.0F, 3.0F, -12.0F);
        this.opisthosoma4.addChild(opisthosoma5_r1);
        this.setRotateAngle(opisthosoma5_r1, -0.2182F, 0.0F, 0.0F);
        this.opisthosoma5_r1.cubeList.add(new ModelBox(opisthosoma5_r1, 26, 22, -1.0F, -7.0F, 11.0F, 3, 3, 1, -0.003F, false));
        this.opisthosoma5_r1.cubeList.add(new ModelBox(opisthosoma5_r1, 29, 46, -0.5F, -7.0F, 11.0F, 3, 3, 1, 0.0F, false));

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
