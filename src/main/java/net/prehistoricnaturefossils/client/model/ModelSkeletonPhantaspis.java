package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPhantaspis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Group;
    private final ModelRenderer Cephalon;
    private final ModelRenderer AntennaL;
    private final ModelRenderer AntennaL_r1;
    private final ModelRenderer AntennaL2;
    private final ModelRenderer Thorax;

    public ModelSkeletonPhantaspis() {
        this.textureWidth = 150;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 5.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 52, -10.0F, -2.0F, -11.0F, 18, 2, 22, 0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(16.0F, 0.0F, -11.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.4363F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -29.0F, -2.0F, -21.0F, 30, 2, 22, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-10.0F, 0.0F, 11.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.2654F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 76, 72, -30.0F, -2.0F, -3.0F, 30, 2, 5, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(8.0F, 0.0F, 11.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 25, -18.0F, -2.0F, -24.0F, 18, 2, 24, 0.0F, false));

        this.Group = new ModelRenderer(this);
        this.Group.setRotationPoint(0.9F, -2.1F, -1.8F);
        this.fossil.addChild(Group);
        this.setRotateAngle(Group, 0.0F, 0.2618F, 0.0F);


        this.Cephalon = new ModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Group.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 77, -0.7F, -0.1F, -12.0F, 7, 0, 15, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 45, 77, -6.3F, -0.1F, -10.0F, 7, 0, 15, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 8, -3.0F, -1.0F, -3.0F, 6, 1, 3, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 9, 25, 3.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 16, 25, -4.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 11, 0, -2.0F, -1.5F, -1.0F, 4, 1, 1, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 25, -1.0F, -1.5F, -3.01F, 2, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 17, -3.0F, -1.4F, -2.01F, 6, 1, 2, 0.0F, false));

        this.AntennaL = new ModelRenderer(this);
        this.AntennaL.setRotationPoint(0.0F, -0.4F, -2.0F);
        this.Cephalon.addChild(AntennaL);
        this.setRotateAngle(AntennaL, -0.1372F, 0.3027F, -0.0583F);


        this.AntennaL_r1 = new ModelRenderer(this);
        this.AntennaL_r1.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.AntennaL.addChild(AntennaL_r1);
        this.setRotateAngle(AntennaL_r1, 0.1309F, 0.0F, 0.0F);
        this.AntennaL_r1.cubeList.add(new ModelBox(AntennaL_r1, 61, 25, -1.0F, 0.1F, -19.0F, 16, 0, 17, 0.0F, false));

        this.AntennaL2 = new ModelRenderer(this);
        this.AntennaL2.setRotationPoint(0.0F, -0.1F, -2.0F);
        this.Cephalon.addChild(AntennaL2);
        this.setRotateAngle(AntennaL2, -0.0005F, -0.1316F, 0.0F);
        this.AntennaL2.cubeList.add(new ModelBox(AntennaL2, 59, 52, -15.0F, 0.1F, -17.0F, 16, 0, 17, 0.0F, false));

        this.Thorax = new ModelRenderer(this);
        this.Thorax.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Group.addChild(Thorax);
        this.Thorax.cubeList.add(new ModelBox(Thorax, 75, 80, -3.0F, -1.0F, 0.0F, 6, 1, 6, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 11, 3, -2.0F, -1.0F, 6.0F, 4, 1, 1, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 29, -1.0F, -1.0F, 7.0F, 2, 1, 1, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 0, -1.0F, -1.5F, 0.0F, 2, 1, 6, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 30, 77, -4.0F, -0.1F, -2.0F, 8, 0, 6, 0.0F, false));
        this.Thorax.cubeList.add(new ModelBox(Thorax, 0, 13, -3.0F, -0.1F, 6.0F, 6, 0, 3, 0.0F, false));

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
