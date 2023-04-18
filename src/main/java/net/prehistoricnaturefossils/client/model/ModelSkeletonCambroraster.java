package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCambroraster extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer bodybase;
    private final ModelRenderer body1;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer tailfinR;
    private final ModelRenderer tailfinL;
    private final ModelRenderer finR8;
    private final ModelRenderer fin8;
    private final ModelRenderer finR7;
    private final ModelRenderer fin7;
    private final ModelRenderer finR4;
    private final ModelRenderer finR3;
    private final ModelRenderer finR2;
    private final ModelRenderer finR1;
    private final ModelRenderer fin4;
    private final ModelRenderer fin3;
    private final ModelRenderer fin2;
    private final ModelRenderer fin1;
    private final ModelRenderer apepndageL2;
    private final ModelRenderer apepndageL3;

    public ModelSkeletonCambroraster() {
        this.textureWidth = 80;
        this.textureHeight = 65;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 19.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 4.5F, -8.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.8727F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 18, -14.9F, -0.5F, -6.8F, 20, 1, 13, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(9.0298F, 4.5F, 8.2831F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 2.7227F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 33, -0.0381F, -0.5F, -0.0546F, 14, 1, 16, -0.002F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-14.8352F, 4.5F, -0.9183F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 2.0944F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -19.9392F, -0.5F, 0.0124F, 20, 1, 16, 0.0F, false));

        this.bodybase = new ModelRenderer(this);
        this.bodybase.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.fossil.addChild(bodybase);
        this.setRotateAngle(bodybase, 0.0F, 0.0F, -3.1416F);
        this.bodybase.cubeList.add(new ModelBox(bodybase, 45, 43, -2.99F, -4.4F, -5.0F, 6, 0, 5, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 45, 33, -3.5F, -4.5F, -5.25F, 7, 0, 9, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 14, -2.5F, -4.5F, -6.25F, 5, 0, 1, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 23, -4.0F, -4.52F, -4.95F, 1, 0, 4, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 7, -4.8F, -4.54F, -4.95F, 1, 0, 6, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 17, 51, -5.4F, -4.56F, -4.95F, 1, 0, 7, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 51, 51, -6.1F, -4.58F, -3.95F, 1, 0, 7, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 34, 51, 5.1F, -4.58F, -3.95F, 1, 0, 7, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 51, 4.4F, -4.56F, -4.95F, 1, 0, 7, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 0, 3.8F, -4.54F, -4.95F, 1, 0, 6, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 18, 3.0F, -4.52F, -4.95F, 1, 0, 4, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 9, 7, -3.5F, -4.3F, -1.25F, 1, 0, 2, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 9, 3, 2.5F, -4.3F, -1.25F, 1, 0, 2, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 33, -1.0F, -4.3F, -4.8F, 2, 0, 2, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 7, -0.5F, -4.29F, -4.3F, 1, 0, 1, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -2.25F, 0.0F);
        this.bodybase.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 54, 18, -2.5F, -2.15F, 0.0F, 5, 0, 4, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 28, -2.0F, -2.4F, 0.0F, 4, 0, 1, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 7, 33, -1.0F, -2.4F, 0.0F, 2, 0, 1, 0.0F, false));

        this.tailfinR = new ModelRenderer(this);
        this.tailfinR.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.body3.addChild(tailfinR);
        this.setRotateAngle(tailfinR, 0.0F, -0.0436F, 0.0F);
        this.tailfinR.cubeList.add(new ModelBox(tailfinR, 9, 10, -1.0F, -2.5F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tailfinL = new ModelRenderer(this);
        this.tailfinL.setRotationPoint(0.1F, 0.0F, 0.5F);
        this.body3.addChild(tailfinL);
        this.setRotateAngle(tailfinL, 0.0F, 0.0436F, 0.0F);
        this.tailfinL.cubeList.add(new ModelBox(tailfinL, 9, 0, -0.1F, -2.5F, 0.0F, 1, 0, 2, 0.0F, false));

        this.finR8 = new ModelRenderer(this);
        this.finR8.setRotationPoint(-1.0F, -0.25F, 0.25F);
        this.body3.addChild(finR8);
        this.finR8.cubeList.add(new ModelBox(finR8, 0, 9, -1.0F, -2.2F, -0.5F, 1, 0, 1, 0.0F, false));

        this.fin8 = new ModelRenderer(this);
        this.fin8.setRotationPoint(1.0F, -0.25F, 0.25F);
        this.body3.addChild(fin8);
        this.fin8.cubeList.add(new ModelBox(fin8, 8, 35, 0.0F, -2.2F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finR7 = new ModelRenderer(this);
        this.finR7.setRotationPoint(-2.0F, -0.4F, 0.5F);
        this.body2.addChild(finR7);
        this.finR7.cubeList.add(new ModelBox(finR7, 0, 11, -1.0F, -2.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.fin7 = new ModelRenderer(this);
        this.fin7.setRotationPoint(2.0F, -0.4F, 0.5F);
        this.body2.addChild(fin7);
        this.fin7.cubeList.add(new ModelBox(fin7, 0, 36, 0.0F, -2.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finR4 = new ModelRenderer(this);
        this.finR4.setRotationPoint(-2.5F, -0.25F, 3.5F);
        this.body1.addChild(finR4);
        this.finR4.cubeList.add(new ModelBox(finR4, 7, 18, -1.0F, -1.9F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finR3 = new ModelRenderer(this);
        this.finR3.setRotationPoint(-2.5F, -0.25F, 2.5F);
        this.body1.addChild(finR3);
        this.finR3.cubeList.add(new ModelBox(finR3, 7, 20, -1.0F, -1.9F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finR2 = new ModelRenderer(this);
        this.finR2.setRotationPoint(-2.5F, -0.25F, 1.5F);
        this.body1.addChild(finR2);
        this.finR2.cubeList.add(new ModelBox(finR2, 7, 23, -1.0F, -1.9F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finR1 = new ModelRenderer(this);
        this.finR1.setRotationPoint(-2.5F, -0.25F, 0.5F);
        this.body1.addChild(finR1);
        this.finR1.cubeList.add(new ModelBox(finR1, 7, 25, -1.0F, -1.9F, -0.6F, 1, 0, 1, 0.0F, false));

        this.fin4 = new ModelRenderer(this);
        this.fin4.setRotationPoint(2.5F, -0.25F, 3.5F);
        this.body1.addChild(fin4);
        this.fin4.cubeList.add(new ModelBox(fin4, 4, 37, 0.0F, -1.9F, -0.5F, 1, 0, 1, 0.0F, false));

        this.fin3 = new ModelRenderer(this);
        this.fin3.setRotationPoint(2.5F, -0.25F, 2.5F);
        this.body1.addChild(fin3);
        this.fin3.cubeList.add(new ModelBox(fin3, 9, 37, 0.0F, -1.9F, -0.5F, 1, 0, 1, 0.0F, false));

        this.fin2 = new ModelRenderer(this);
        this.fin2.setRotationPoint(2.5F, -0.25F, 1.5F);
        this.body1.addChild(fin2);
        this.fin2.cubeList.add(new ModelBox(fin2, 0, 38, 0.0F, -1.9F, -0.5F, 1, 0, 1, 0.0F, false));

        this.fin1 = new ModelRenderer(this);
        this.fin1.setRotationPoint(2.5F, -0.25F, 0.5F);
        this.body1.addChild(fin1);
        this.fin1.cubeList.add(new ModelBox(fin1, 4, 39, 0.0F, -1.9F, -0.6F, 1, 0, 1, 0.0F, false));

        this.apepndageL2 = new ModelRenderer(this);
        this.apepndageL2.setRotationPoint(-1.75F, -4.75F, -4.25F);
        this.bodybase.addChild(apepndageL2);
        this.setRotateAngle(apepndageL2, 0.7854F, 0.0F, 1.5708F);
        this.apepndageL2.cubeList.add(new ModelBox(apepndageL2, 3, 0, 0.5F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.apepndageL3 = new ModelRenderer(this);
        this.apepndageL3.setRotationPoint(1.75F, -4.75F, -4.25F);
        this.bodybase.addChild(apepndageL3);
        this.setRotateAngle(apepndageL3, 0.7854F, 0.0F, -1.5708F);
        this.apepndageL3.cubeList.add(new ModelBox(apepndageL3, 0, 0, -0.5F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

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
