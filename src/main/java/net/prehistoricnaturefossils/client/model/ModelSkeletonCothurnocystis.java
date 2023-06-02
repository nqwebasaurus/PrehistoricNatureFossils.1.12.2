package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCothurnocystis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer main;
    private final ModelRenderer cube_r4;
    private final ModelRenderer front;
    private final ModelRenderer arm1;
    private final ModelRenderer arm2;
    private final ModelRenderer arm3;
    private final ModelRenderer arm5;
    private final ModelRenderer arm6;
    private final ModelRenderer arm7;
    private final ModelRenderer arm11;
    private final ModelRenderer arm12;
    private final ModelRenderer armlong;
    private final ModelRenderer armmedium;
    private final ModelRenderer armshort;
    private final ModelRenderer main4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer front3;
    private final ModelRenderer arm8;
    private final ModelRenderer arm9;
    private final ModelRenderer arm10;
    private final ModelRenderer armlong4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer armmedium4;
    private final ModelRenderer armshort4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer main3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer armlong3;
    private final ModelRenderer armmedium3;
    private final ModelRenderer armshort3;
    private final ModelRenderer main2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer front2;
    private final ModelRenderer arm4;
    private final ModelRenderer armlong2;
    private final ModelRenderer armmedium2;
    private final ModelRenderer armshort2;

    public ModelSkeletonCothurnocystis() {
        this.textureWidth = 256;
        this.textureHeight = 180;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-31.1046F, -1.0F, 17.6544F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.213F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 105, -0.6838F, -1.0F, -0.3317F, 13, 2, 45, -0.002F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-6.1046F, -1.0F, -18.3456F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.8762F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -27.5F, -1.0F, -35.0F, 54, 2, 67, 0.002F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(25.0F, -1.0F, -3.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.829F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 70, -37.2F, -1.0F, -17.3F, 55, 2, 32, 0.0F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -2.0F, 3.0F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.0F, -0.0873F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 19, 1, 2.0F, -0.4F, -6.0F, 4, 0, 10, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 19, 29, -5.0F, -0.4F, -6.0F, 7, 0, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 21, 40, -6.0F, -0.4F, -4.0F, 1, 0, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 19, 14, -6.0F, -0.4F, -6.0F, 1, 0, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 19, 12, -3.0F, -0.4F, -7.0F, 1, 0, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(5.5F, 0.0F, -6.0F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.7854F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 40, -0.65F, -0.35F, -0.7F, 1, 0, 2, 0.0F, false));

        this.front = new ModelRenderer(this);
        this.front.setRotationPoint(0.5F, -0.5F, -6.0F);
        this.main.addChild(front);
        this.setRotateAngle(front, 0.0F, 0.3927F, 0.0F);
        this.front.cubeList.add(new ModelBox(front, 38, 4, -1.5F, 0.125F, -3.0F, 3, 0, 3, 0.0F, false));

        this.arm1 = new ModelRenderer(this);
        this.arm1.setRotationPoint(0.0F, 0.2F, -3.0F);
        this.front.addChild(arm1);
        this.setRotateAngle(arm1, 0.0F, 0.3927F, 0.0F);
        this.arm1.cubeList.add(new ModelBox(arm1, 19, 0, -0.5F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.arm2 = new ModelRenderer(this);
        this.arm2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm1.addChild(arm2);
        this.setRotateAngle(arm2, 0.0F, 0.3927F, 0.0F);
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 15, -0.5F, 0.01F, -3.0F, 1, 0, 3, 0.0F, false));

        this.arm3 = new ModelRenderer(this);
        this.arm3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm2.addChild(arm3);
        this.setRotateAngle(arm3, 0.0F, 0.4363F, 0.0F);
        this.arm3.cubeList.add(new ModelBox(arm3, 7, 40, -0.5F, 0.02F, -4.0F, 1, 0, 4, 0.0F, false));

        this.arm5 = new ModelRenderer(this);
        this.arm5.setRotationPoint(19.0F, 0.0F, 2.0F);
        this.front.addChild(arm5);
        this.setRotateAngle(arm5, 0.0F, 2.618F, 0.0F);
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 4, -0.5F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.arm6 = new ModelRenderer(this);
        this.arm6.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm5.addChild(arm6);
        this.setRotateAngle(arm6, 0.0F, -0.4363F, 0.0F);
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 0, -0.5F, 0.01F, -3.0F, 1, 0, 3, 0.0F, false));

        this.arm7 = new ModelRenderer(this);
        this.arm7.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm6.addChild(arm7);
        this.setRotateAngle(arm7, 0.0F, 0.4363F, 0.0F);
        this.arm7.cubeList.add(new ModelBox(arm7, 0, 39, -0.5F, 0.02F, -4.0F, 1, 0, 4, 0.0F, false));

        this.arm11 = new ModelRenderer(this);
        this.arm11.setRotationPoint(42.0F, 0.0F, -19.0F);
        this.arm5.addChild(arm11);
        this.setRotateAngle(arm11, 0.0F, 0.5236F, 0.0F);
        this.arm11.cubeList.add(new ModelBox(arm11, 0, 0, -0.5F, 0.01F, -3.0F, 1, 0, 3, 0.0F, false));

        this.arm12 = new ModelRenderer(this);
        this.arm12.setRotationPoint(-12.0F, 0.0F, -26.0F);
        this.arm11.addChild(arm12);
        this.setRotateAngle(arm12, 0.0F, 1.8762F, 0.0F);
        this.arm12.cubeList.add(new ModelBox(arm12, 0, 39, -0.5F, 0.02F, -4.0F, 1, 0, 4, 0.0F, false));

        this.armlong = new ModelRenderer(this);
        this.armlong.setRotationPoint(2.5F, 0.0F, 4.0F);
        this.main.addChild(armlong);
        this.armlong.cubeList.add(new ModelBox(armlong, 22, 23, -7.5F, -0.5F, 0.0F, 8, 0, 5, 0.0F, false));

        this.armmedium = new ModelRenderer(this);
        this.armmedium.setRotationPoint(-6.0F, 0.0F, -2.0F);
        this.main.addChild(armmedium);
        this.armmedium.cubeList.add(new ModelBox(armmedium, 33, 34, -4.0F, -0.5F, 0.0F, 4, 0, 5, 0.0F, false));

        this.armshort = new ModelRenderer(this);
        this.armshort.setRotationPoint(5.5F, 0.0F, 4.0F);
        this.main.addChild(armshort);
        this.armshort.cubeList.add(new ModelBox(armshort, 28, 40, -0.5F, -0.5F, 0.0F, 1, 0, 2, 0.0F, false));

        this.main4 = new ModelRenderer(this);
        this.main4.setRotationPoint(32.0F, -2.0F, -2.0F);
        this.fossil.addChild(main4);
        this.setRotateAngle(main4, 0.0F, -1.1781F, 0.0F);
        this.main4.cubeList.add(new ModelBox(main4, 19, 29, -5.0F, -0.4F, -6.0F, 7, 0, 4, 0.0F, false));
        this.main4.cubeList.add(new ModelBox(main4, 21, 40, -6.0F, -0.4F, -4.0F, 1, 0, 2, 0.0F, false));
        this.main4.cubeList.add(new ModelBox(main4, 19, 14, -6.0F, -0.4F, -6.0F, 1, 0, 1, 0.0F, false));
        this.main4.cubeList.add(new ModelBox(main4, 19, 12, -3.0F, -0.4F, -7.0F, 1, 0, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(2.4109F, 0.0F, -5.8204F);
        this.main4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.091F, 0.7825F, -0.091F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 40, 1.6613F, -0.35F, 1.3574F, 1, 0, 2, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(2.4109F, 0.0F, -5.8204F);
        this.main4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0645F, -0.0009F, -0.0267F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 1, -0.4109F, -0.4F, -0.1796F, 4, 0, 10, 0.0F, false));

        this.front3 = new ModelRenderer(this);
        this.front3.setRotationPoint(0.5F, -0.5F, -5.5F);
        this.main4.addChild(front3);
        this.setRotateAngle(front3, 0.0F, 0.5236F, 0.0F);
        this.front3.cubeList.add(new ModelBox(front3, 38, 4, -1.5F, 0.125F, -3.0F, 3, 0, 3, 0.0F, false));

        this.arm8 = new ModelRenderer(this);
        this.arm8.setRotationPoint(0.0F, 0.2F, -3.0F);
        this.front3.addChild(arm8);
        this.setRotateAngle(arm8, 0.0F, 0.6981F, 0.0F);
        this.arm8.cubeList.add(new ModelBox(arm8, 19, 0, -0.5F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.arm9 = new ModelRenderer(this);
        this.arm9.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm8.addChild(arm9);
        this.setRotateAngle(arm9, 0.0F, -0.7418F, 0.0F);
        this.arm9.cubeList.add(new ModelBox(arm9, 0, 15, -0.5F, 0.01F, -3.0F, 1, 0, 3, 0.0F, false));

        this.arm10 = new ModelRenderer(this);
        this.arm10.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm9.addChild(arm10);
        this.setRotateAngle(arm10, 0.0F, -1.6144F, 0.0F);
        this.arm10.cubeList.add(new ModelBox(arm10, 7, 40, -0.5F, 0.02F, -4.0F, 1, 0, 4, 0.0F, false));

        this.armlong4 = new ModelRenderer(this);
        this.armlong4.setRotationPoint(2.5F, 0.0F, 4.0F);
        this.main4.addChild(armlong4);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.0891F, 0.0F, -9.8204F);
        this.armlong4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0645F, -0.0009F, -0.0267F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 23, -7.4109F, -0.5F, 9.8204F, 8, 0, 5, 0.0F, false));

        this.armmedium4 = new ModelRenderer(this);
        this.armmedium4.setRotationPoint(-6.0F, 0.0F, -2.0F);
        this.main4.addChild(armmedium4);
        this.armmedium4.cubeList.add(new ModelBox(armmedium4, 33, 34, -4.0F, -0.5F, 0.0F, 4, 0, 5, 0.0F, false));

        this.armshort4 = new ModelRenderer(this);
        this.armshort4.setRotationPoint(5.5F, 0.0F, 4.0F);
        this.main4.addChild(armshort4);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.0891F, 0.0F, -9.8204F);
        this.armshort4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0645F, -0.0009F, -0.0267F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 40, 2.5891F, -0.5F, 9.8204F, 1, 0, 2, 0.0F, false));

        this.main3 = new ModelRenderer(this);
        this.main3.setRotationPoint(-23.0F, -2.0F, -18.0F);
        this.fossil.addChild(main3);
        this.setRotateAngle(main3, 0.0F, 1.9635F, 0.0F);
        this.main3.cubeList.add(new ModelBox(main3, 0, 0, 2.0F, -0.2F, -6.0F, 4, 0, 10, 0.0F, false));
        this.main3.cubeList.add(new ModelBox(main3, 25, 18, -5.0F, -0.2F, -6.0F, 7, 0, 4, 0.0F, false));
        this.main3.cubeList.add(new ModelBox(main3, 19, 18, -6.0F, -0.2F, -4.0F, 1, 0, 2, 0.0F, false));
        this.main3.cubeList.add(new ModelBox(main3, 5, 8, -6.0F, -0.2F, -6.0F, 1, 0, 1, 0.0F, false));
        this.main3.cubeList.add(new ModelBox(main3, 0, 8, -3.0F, -0.2F, -7.0F, 1, 0, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(5.5F, -0.2F, -6.0F);
        this.main3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.7854F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 7, -0.65F, 0.05F, -0.7F, 1, 0, 2, 0.0F, false));

        this.armlong3 = new ModelRenderer(this);
        this.armlong3.setRotationPoint(2.5F, 0.0F, 4.0F);
        this.main3.addChild(armlong3);
        this.armlong3.cubeList.add(new ModelBox(armlong3, 19, 12, -7.5F, -0.2F, 0.0F, 8, 0, 5, 0.0F, false));

        this.armmedium3 = new ModelRenderer(this);
        this.armmedium3.setRotationPoint(-6.0F, 0.0F, -2.0F);
        this.main3.addChild(armmedium3);
        this.armmedium3.cubeList.add(new ModelBox(armmedium3, 0, 33, -4.0F, -0.2F, 0.0F, 4, 0, 5, 0.0F, false));

        this.armshort3 = new ModelRenderer(this);
        this.armshort3.setRotationPoint(5.5F, 0.0F, 4.0F);
        this.main3.addChild(armshort3);
        this.armshort3.cubeList.add(new ModelBox(armshort3, 19, 4, -0.5F, -0.2F, 0.0F, 1, 0, 2, 0.0F, false));

        this.main2 = new ModelRenderer(this);
        this.main2.setRotationPoint(12.0F, -2.0F, -30.0F);
        this.fossil.addChild(main2);
        this.setRotateAngle(main2, 0.0F, -1.6144F, 0.0F);
        this.main2.cubeList.add(new ModelBox(main2, 0, 11, 2.0F, -0.2F, -6.0F, 4, 0, 10, 0.0F, false));
        this.main2.cubeList.add(new ModelBox(main2, 0, 28, -5.0F, -0.2F, -6.0F, 7, 0, 4, 0.0F, false));
        this.main2.cubeList.add(new ModelBox(main2, 38, 29, -6.0F, -0.2F, -4.0F, 1, 0, 2, 0.0F, false));
        this.main2.cubeList.add(new ModelBox(main2, 5, 19, -6.0F, -0.2F, -6.0F, 1, 0, 1, 0.0F, false));
        this.main2.cubeList.add(new ModelBox(main2, 0, 19, -3.0F, -0.2F, -7.0F, 1, 0, 1, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(5.5F, -0.2F, -6.0F);
        this.main2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.7854F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 8, -0.65F, 0.05F, -0.7F, 1, 0, 2, 0.0F, false));

        this.front2 = new ModelRenderer(this);
        this.front2.setRotationPoint(0.5F, -0.5F, -6.0F);
        this.main2.addChild(front2);
        this.setRotateAngle(front2, 0.0F, 0.3927F, 0.0F);
        this.front2.cubeList.add(new ModelBox(front2, 38, 0, -1.5F, 0.325F, -3.0F, 3, 0, 3, 0.0F, false));

        this.arm4 = new ModelRenderer(this);
        this.arm4.setRotationPoint(0.0F, 0.4F, -3.0F);
        this.front2.addChild(arm4);
        this.setRotateAngle(arm4, 0.0F, 0.3927F, 0.0F);
        this.arm4.cubeList.add(new ModelBox(arm4, 0, 11, -0.5F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.armlong2 = new ModelRenderer(this);
        this.armlong2.setRotationPoint(2.5F, 0.0F, 4.0F);
        this.main2.addChild(armlong2);
        this.armlong2.cubeList.add(new ModelBox(armlong2, 0, 22, -7.5F, -0.2F, 0.0F, 8, 0, 5, 0.0F, false));

        this.armmedium2 = new ModelRenderer(this);
        this.armmedium2.setRotationPoint(-6.0F, 0.0F, -2.0F);
        this.main2.addChild(armmedium2);
        this.armmedium2.cubeList.add(new ModelBox(armmedium2, 14, 34, -4.0F, -0.2F, 0.0F, 4, 0, 5, 0.0F, false));

        this.armshort2 = new ModelRenderer(this);
        this.armshort2.setRotationPoint(5.5F, 0.0F, 4.0F);
        this.main2.addChild(armshort2);
        this.armshort2.cubeList.add(new ModelBox(armshort2, 28, 34, -0.5F, -0.2F, 0.0F, 1, 0, 2, 0.0F, false));

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
