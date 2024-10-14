package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLungmenshanaspis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Lungmenshanaspis;
    private final ModelRenderer Cephalon;
    private final ModelRenderer Rostrum_r1;
    private final ModelRenderer CornualPlateL;
    private final ModelRenderer CornualR2_r1;
    private final ModelRenderer PlateSlatedR_r1;
    private final ModelRenderer CornualplateR;
    private final ModelRenderer Plateslated_r1;
    private final ModelRenderer CornualL2_r1;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;

    public ModelSkeletonLungmenshanaspis() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(fossil, 0.0F, -2.618F, 0.0F);


        this.Lungmenshanaspis = new ModelRenderer(this);
        this.Lungmenshanaspis.setRotationPoint(0.0F, -3.8F, 0.0F);
        this.fossil.addChild(Lungmenshanaspis);
        this.setRotateAngle(Lungmenshanaspis, -3.0646F, 0.6519F, 3.1092F);


        this.Cephalon = new ModelRenderer(this);
        this.Cephalon.setRotationPoint(-0.7615F, -0.2614F, 3.75F);
        this.Lungmenshanaspis.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 10, -1.0F, -1.3F, -8.0F, 2, 2, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 37, -1.5F, -1.3F, -6.0F, 3, 2, 3, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 31, -2.5F, -1.3F, -3.0F, 5, 2, 3, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 13, 10, -1.0F, -1.5F, -5.0F, 2, 1, 5, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 13, 44, -2.5F, -1.2F, -5.0F, 5, 1, 1, 0.0F, false));

        this.Rostrum_r1 = new ModelRenderer(this);
        this.Rostrum_r1.setRotationPoint(0.0F, -0.5F, -16.0F);
        this.Cephalon.addChild(Rostrum_r1);
        this.setRotateAngle(Rostrum_r1, 0.0873F, 0.0F, 0.0F);
        this.Rostrum_r1.cubeList.add(new ModelBox(Rostrum_r1, 0, 10, -0.5F, 0.25F, -2.0F, 1, 1, 10, 0.0F, false));

        this.CornualPlateL = new ModelRenderer(this);
        this.CornualPlateL.setRotationPoint(2.5F, -1.0F, -1.0F);
        this.Cephalon.addChild(CornualPlateL);
        this.setRotateAngle(CornualPlateL, 0.0F, 0.0F, 0.0436F);
        this.CornualPlateL.cubeList.add(new ModelBox(CornualPlateL, 17, 3, 0.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, false));

        this.CornualR2_r1 = new ModelRenderer(this);
        this.CornualR2_r1.setRotationPoint(9.7066F, 0.5F, -2.6692F);
        this.CornualPlateL.addChild(CornualR2_r1);
        this.setRotateAngle(CornualR2_r1, 0.0914F, 0.3283F, 0.2769F);
        this.CornualR2_r1.cubeList.add(new ModelBox(CornualR2_r1, 13, 17, -6.2F, 1.1F, -0.5F, 6, 1, 1, -0.01F, false));

        this.PlateSlatedR_r1 = new ModelRenderer(this);
        this.PlateSlatedR_r1.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.CornualPlateL.addChild(PlateSlatedR_r1);
        this.setRotateAngle(PlateSlatedR_r1, 0.0F, -0.9425F, 0.0F);
        this.PlateSlatedR_r1.cubeList.add(new ModelBox(PlateSlatedR_r1, 0, 43, -3.224F, -1.0F, -0.8313F, 4, 1, 2, -0.01F, false));

        this.CornualplateR = new ModelRenderer(this);
        this.CornualplateR.setRotationPoint(-2.5F, -1.0F, -2.0F);
        this.Cephalon.addChild(CornualplateR);
        this.setRotateAngle(CornualplateR, 0.0F, 0.0F, -0.0873F);
        this.CornualplateR.cubeList.add(new ModelBox(CornualplateR, 17, 0, -4.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.Plateslated_r1 = new ModelRenderer(this);
        this.Plateslated_r1.setRotationPoint(5.0F, 1.0F, 0.0F);
        this.CornualplateR.addChild(Plateslated_r1);
        this.setRotateAngle(Plateslated_r1, 0.0F, 0.9425F, 0.0F);
        this.Plateslated_r1.cubeList.add(new ModelBox(Plateslated_r1, 13, 40, -3.724F, -1.0F, -5.0313F, 4, 1, 2, -0.01F, false));

        this.CornualL2_r1 = new ModelRenderer(this);
        this.CornualL2_r1.setRotationPoint(-4.0F, 1.0F, 1.0F);
        this.CornualplateR.addChild(CornualL2_r1);
        this.setRotateAngle(CornualL2_r1, 0.0614F, -0.335F, -0.1849F);
        this.CornualL2_r1.cubeList.add(new ModelBox(CornualL2_r1, 10, 37, -6.0161F, -1.0F, -1.0134F, 6, 1, 1, -0.01F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 62, 0, -10.0F, -2.0F, -5.0F, 3, 1, 18, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 57, 52, -7.0F, -2.0F, -5.0F, 19, 1, 14, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 62, -13.0F, -2.0F, -11.0F, 25, 1, 6, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -13.0F, -1.0F, -12.0F, 16, 1, 29, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 31, 3.0F, -1.0F, -12.0F, 9, 1, 26, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 45, 31, -7.0F, -3.0F, -10.0F, 18, 1, 19, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(5.0848F, -3.5F, -8.822F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.0023F, -0.5F, 0.1347F, 4, 1, 8, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3054F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 68, -3.5F, -4.0F, -6.75F, 11, 1, 12, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(3.0F, -1.0F, 17.0F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.3491F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 22, 0.0F, 0.0F, -3.0F, 9, 1, 3, 0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-7.0F, -2.0F, 13.0F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 62, 20, 0.0F, 0.0F, -4.0F, 19, 1, 4, 0.0F, false));

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
