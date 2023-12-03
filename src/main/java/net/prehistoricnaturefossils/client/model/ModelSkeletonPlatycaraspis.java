package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPlatycaraspis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer platycaraspis;
    private final ModelRenderer Cephalon;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer HEadinclination;

    public ModelSkeletonPlatycaraspis() {
        this.textureWidth = 90;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-4.0F, 24.0F, -2.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(8.9707F, -1.0F, 16.1265F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2007F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 41, -18.2181F, -1.0F, -15.0663F, 18, 2, 15, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(13.9707F, -1.0F, -6.7735F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 17, -10.0561F, -1.0F, 0.2086F, 10, 2, 21, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.6981F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -15.0F, -2.0F, -10.0F, 30, 2, 14, 0.003F, false));

        this.platycaraspis = new ModelRenderer(this);
        this.platycaraspis.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.fossil.addChild(platycaraspis);


        this.Cephalon = new ModelRenderer(this);
        this.Cephalon.setRotationPoint(1.784F, 1.4724F, 1.4196F);
        this.platycaraspis.addChild(Cephalon);
        this.setRotateAngle(Cephalon, 0.0F, -0.2182F, 0.0F);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 42, 17, -5.9717F, -0.2724F, -3.566F, 12, 1, 8, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 21, 59, -3.9717F, -0.2724F, -5.566F, 8, 1, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 47, 8.0283F, -0.2724F, 0.434F, 3, 1, 4, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 26, 6.0283F, -0.2724F, -1.566F, 3, 1, 7, 0.01F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 42, 27, -3.9717F, -1.2724F, -3.566F, 8, 1, 8, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 17, -8.9717F, -0.2724F, -1.566F, 3, 1, 7, 0.01F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 41, -10.9717F, -0.2724F, 0.434F, 3, 1, 4, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0283F, -1.3724F, 4.434F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 59, -3.0F, -0.5F, -8.0F, 6, 1, 8, 0.002F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0283F, 0.7276F, -6.566F);
        this.Cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0524F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 10, -0.7F, -1.0F, -0.7F, 1, 1, 2, -0.01F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-4.1717F, 0.7276F, -6.566F);
        this.Cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -3.1416F, -0.7243F, -3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 41, -0.0422F, -1.0F, -4.1931F, 14, 1, 4, -0.023F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-6.2717F, 0.7276F, 7.534F);
        this.Cephalon.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -2.426F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -3.6304F, -1.0F, -0.9391F, 2, 1, 3, -0.01F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(6.3283F, 0.7276F, 7.534F);
        this.Cephalon.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 2.426F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 5, 1.6304F, -1.0F, -0.9391F, 2, 1, 3, -0.01F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.9717F, 0.7276F, -5.566F);
        this.Cephalon.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0008F, 0.2444F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 55, 59, -0.1784F, -1.0F, -0.847F, 4, 1, 4, -0.02F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(4.2283F, 0.7276F, -6.566F);
        this.Cephalon.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -3.1416F, 0.7243F, 3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 52, 47, -13.9578F, -1.0F, -4.1931F, 14, 1, 4, -0.023F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(4.0283F, 0.7276F, -5.566F);
        this.Cephalon.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -3.1416F, 0.2182F, 3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 59, 0.1216F, -1.0F, -3.1259F, 4, 1, 4, -0.02F, false));

        this.HEadinclination = new ModelRenderer(this);
        this.HEadinclination.setRotationPoint(0.0283F, -0.2724F, -3.566F);
        this.Cephalon.addChild(HEadinclination);
        this.setRotateAngle(HEadinclination, -1.0908F, 0.0F, 0.0F);
        this.HEadinclination.cubeList.add(new ModelBox(HEadinclination, 21, 63, -3.0F, -0.5F, -0.9F, 6, 2, 1, 0.0F, false));

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
