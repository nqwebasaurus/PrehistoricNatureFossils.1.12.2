package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonYawunik extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer bodybase;
    private final ModelRenderer cube_r1;
    private final ModelRenderer body1;
    private final ModelRenderer legL4;
    private final ModelRenderer cube_r2;
    private final ModelRenderer legL3;
    private final ModelRenderer cube_r3;
    private final ModelRenderer legL1;
    private final ModelRenderer cube_r4;
    private final ModelRenderer legL2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer legL5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer legL7;
    private final ModelRenderer cube_r7;
    private final ModelRenderer body2;
    private final ModelRenderer legL9;
    private final ModelRenderer cube_r8;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer legL11;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tentacle1;
    private final ModelRenderer tentacle1_1;
    private final ModelRenderer tentacle1_2;
    private final ModelRenderer tentacle1_3;

    public ModelSkeletonYawunik() {
        this.textureWidth = 96;
        this.textureHeight = 50;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -10.0F, -2.0F, -11.0F, 20, 2, 21, 0.0F, false));

        this.bodybase = new ModelRenderer(this);
        this.bodybase.setRotationPoint(6.0F, -4.2F, 1.0F);
        this.fossil.addChild(bodybase);
        this.setRotateAngle(bodybase, 0.0F, 0.0F, -1.5708F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodybase.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.9F, -9.5F, -7.0F, 0, 4, 2, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -9.0F, -6.0F);
        this.bodybase.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 10, 8, -1.87F, 0.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(-1.7F, 2.5F, 2.5F);
        this.body1.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -1.5708F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.2618F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 3, 3.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(-1.7F, 2.25F, 1.75F);
        this.body1.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -1.5708F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.2618F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 5, 13, 3.85F, -2.05F, -4.75F, 2, 3, 0, 0.0F, false));

        this.legL1 = new ModelRenderer(this);
        this.legL1.setRotationPoint(-1.7F, 2.25F, 0.25F);
        this.body1.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, -1.5708F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.2618F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 17, 3.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(-1.7F, 2.25F, 1.0F);
        this.body1.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, -1.5708F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.2618F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 7, 3.85F, -2.05F, -4.79F, 2, 3, 0, 0.0F, false));

        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(-1.7F, 2.5F, 3.25F);
        this.body1.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, -1.5708F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL5.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.2618F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 13, 3.85F, -2.05F, -4.75F, 2, 3, 0, 0.0F, false));

        this.legL7 = new ModelRenderer(this);
        this.legL7.setRotationPoint(-1.7F, 2.25F, 4.75F);
        this.body1.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, -1.5708F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL7.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.2618F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 3, 3.85F, -2.05F, -4.749F, 2, 3, 0, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, 0.0F, 5.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 30, 24, -1.4F, 0.0F, 0.0F, 0, 4, 4, 0.0F, false));

        this.legL9 = new ModelRenderer(this);
        this.legL9.setRotationPoint(-1.2F, 2.0F, 1.25F);
        this.body2.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, -1.5708F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL9.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.2618F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 24, 3.85F, -2.05F, -4.77F, 2, 3, 0, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(-0.5F, 0.0F, 5.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0436F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 8, 24, -0.9F, 0.0F, -1.0F, 0, 2, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.2F, 0.0F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.5672F, 1.5708F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 0, -0.5F, 0.95F, -0.9F, 2, 0, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 11, 0.0F, 0.95F, 1.1F, 1, 0, 1, 0.0F, false));

        this.legL11 = new ModelRenderer(this);
        this.legL11.setRotationPoint(-0.8F, 1.25F, -2.25F);
        this.body3.addChild(legL11);
        this.setRotateAngle(legL11, 0.0F, -1.5708F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.5F, 3.0F, 5.0F);
        this.legL11.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.2618F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 5, 17, 3.85F, -2.05F, -4.8F, 2, 3, 0, 0.0F, false));

        this.tentacle1 = new ModelRenderer(this);
        this.tentacle1.setRotationPoint(-2.5F, -7.5F, -6.6F);
        this.bodybase.addChild(tentacle1);
        this.setRotateAngle(tentacle1, 0.2182F, 0.0F, 0.0F);
        this.tentacle1.cubeList.add(new ModelBox(tentacle1, 18, 0, 0.5F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle1_1 = new ModelRenderer(this);
        this.tentacle1_1.setRotationPoint(0.2F, 3.0F, 0.0F);
        this.tentacle1.addChild(tentacle1_1);
        this.setRotateAngle(tentacle1_1, -0.2182F, 0.0F, 0.0F);
        this.tentacle1_1.cubeList.add(new ModelBox(tentacle1_1, 15, 24, 0.2F, 0.0F, -0.5F, 0, 5, 7, 0.0F, false));

        this.tentacle1_2 = new ModelRenderer(this);
        this.tentacle1_2.setRotationPoint(0.4F, 3.0F, 0.0F);
        this.tentacle1.addChild(tentacle1_2);
        this.setRotateAngle(tentacle1_2, 0.3927F, 0.0F, 0.0F);
        this.tentacle1_2.cubeList.add(new ModelBox(tentacle1_2, 0, 24, -0.04F, 0.0F, -0.5F, 0, 5, 7, 0.0F, false));

        this.tentacle1_3 = new ModelRenderer(this);
        this.tentacle1_3.setRotationPoint(-0.3F, 3.0F, 0.0F);
        this.tentacle1.addChild(tentacle1_3);
        this.tentacle1_3.cubeList.add(new ModelBox(tentacle1_3, 0, 0, 0.8F, 0.0F, -0.5F, 0, 5, 7, 0.0F, false));

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
