package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHallucigenia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer body;
    private final ModelRenderer spikeL1;
    private final ModelRenderer spikeL2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer spikeL3;
    private final ModelRenderer cube_r3;
    private final ModelRenderer spikeL4;
    private final ModelRenderer cube_r4;
    private final ModelRenderer spikeL5;
    private final ModelRenderer cube_r5;
    private final ModelRenderer armL3;
    private final ModelRenderer legL1;
    private final ModelRenderer legL2;
    private final ModelRenderer legL3;
    private final ModelRenderer legL4;
    private final ModelRenderer legR2;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer head;
    private final ModelRenderer cube_r8;
    private final ModelRenderer armL1;
    private final ModelRenderer armL2;
    private final ModelRenderer tail;
    private final ModelRenderer legL5;
    private final ModelRenderer legL6;
    private final ModelRenderer legL7;
    private final ModelRenderer spikeL6;
    private final ModelRenderer cube_r9;
    private final ModelRenderer spikeL7;
    private final ModelRenderer cube_r10;

    public ModelSkeletonHallucigenia() {
        this.textureWidth = 160;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(9.0732F, 23.5F, 9.6822F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.3614F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -29.9F, -0.5F, -11.0F, 42, 1, 37, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-9.0732F, -0.1F, -14.6822F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0F, -1.5708F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, 0.5F, -2.0F, 0.0F, 0, 2, 13, 0.0F, false));

        this.spikeL1 = new ModelRenderer(this);
        this.spikeL1.setRotationPoint(0.35F, -2.0F, 1.25F);
        this.body.addChild(spikeL1);
        this.setRotateAngle(spikeL1, 0.48F, 0.0F, 0.0F);
        this.spikeL1.cubeList.add(new ModelBox(spikeL1, 22, 21, 0.25F, -8.0F, -0.5F, 0, 8, 1, 0.0F, false));

        this.spikeL2 = new ModelRenderer(this);
        this.spikeL2.setRotationPoint(0.25F, -2.0F, 3.25F);
        this.body.addChild(spikeL2);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 0.0F, -0.5F);
        this.spikeL2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 22, -0.75F, -8.0F, 0.0F, 0, 8, 1, 0.0F, false));

        this.spikeL3 = new ModelRenderer(this);
        this.spikeL3.setRotationPoint(0.25F, -2.0F, 5.75F);
        this.body.addChild(spikeL3);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 0.0F, -0.5F);
        this.spikeL3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 22, -0.75F, -8.0F, 0.0F, 0, 8, 1, 0.0F, false));

        this.spikeL4 = new ModelRenderer(this);
        this.spikeL4.setRotationPoint(0.25F, -2.0F, 8.25F);
        this.body.addChild(spikeL4);
        this.setRotateAngle(spikeL4, -0.0436F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 0.0F, -0.5F);
        this.spikeL4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 0, -0.75F, -8.0F, 0.0F, 0, 8, 1, 0.0F, false));

        this.spikeL5 = new ModelRenderer(this);
        this.spikeL5.setRotationPoint(0.25F, -2.0F, 10.75F);
        this.body.addChild(spikeL5);
        this.setRotateAngle(spikeL5, -0.0873F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 0.0F, -0.5F);
        this.spikeL5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 0, -0.75F, -8.0F, 0.0F, 0, 8, 1, 0.0F, false));

        this.armL3 = new ModelRenderer(this);
        this.armL3.setRotationPoint(0.6F, -0.5F, 1.0F);
        this.body.addChild(armL3);
        this.setRotateAngle(armL3, 0.3054F, 0.0F, 0.0F);
        this.armL3.cubeList.add(new ModelBox(armL3, 5, 16, -0.12F, -0.5F, -1.75F, 0, 8, 2, 0.0F, false));

        this.legL1 = new ModelRenderer(this);
        this.legL1.setRotationPoint(0.75F, -0.5F, 3.25F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, -0.1745F, 0.0F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 25, 0, -0.3F, 0.0F, -0.5F, 0, 7, 1, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(0.75F, -0.5F, 5.75F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, -0.2182F, 0.0F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 12, 26, -0.3F, 0.0F, -0.5F, 0, 7, 1, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(0.75F, -0.5F, 8.25F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, -0.1745F, 0.0F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 9, 26, -0.3F, 0.0F, -0.5F, 0, 7, 1, 0.0F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(0.75F, -0.5F, 10.75F);
        this.body.addChild(legL4);
        this.legL4.cubeList.add(new ModelBox(legL4, 25, 25, -0.3F, 0.0F, -0.5F, 0, 7, 1, 0.0F, false));

        this.legR2 = new ModelRenderer(this);
        this.legR2.setRotationPoint(-0.75F, -0.5F, 5.75F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, 0.2618F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.0F, 0.25F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.5236F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 9, 0.51F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.005F, 0.3107F, -3.9103F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5672F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 0, 0.515F, -0.231F, -2.0479F, 0, 1, 2, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.005F, -0.1151F, -2.0478F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.495F, -0.3849F, -1.9522F, 0, 1, 2, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.3F, -5.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.3054F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.005F, -1.039F, 1.8216F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5672F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 9, 0.505F, -0.231F, -2.9479F, 0, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 16, 0.495F, -0.481F, -5.9479F, 0, 2, 3, 0.0F, false));

        this.armL1 = new ModelRenderer(this);
        this.armL1.setRotationPoint(0.45F, 0.5F, -2.25F);
        this.neck.addChild(armL1);
        this.setRotateAngle(armL1, -0.48F, 0.0F, 0.0F);
        this.armL1.cubeList.add(new ModelBox(armL1, 0, 16, 0.0F, -0.5F, -1.75F, 0, 8, 2, 0.0F, false));

        this.armL2 = new ModelRenderer(this);
        this.armL2.setRotationPoint(0.45F, 0.5F, -0.75F);
        this.neck.addChild(armL2);
        this.setRotateAngle(armL2, -0.3491F, 0.0F, 0.0F);
        this.armL2.cubeList.add(new ModelBox(armL2, 14, 0, 0.0F, -0.5F, -1.75F, 0, 8, 2, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.75F, 13.0F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.4363F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, 0.51F, -0.25F, 0.0F, 0, 2, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 5, 9, 0.61F, 0.5F, 5.5F, 0, 1, 1, 0.0F, false));

        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(0.75F, 0.75F, 1.0F);
        this.tail.addChild(legL5);
        this.setRotateAngle(legL5, 0.6109F, 0.0F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 25, 16, -0.3F, 0.0F, -0.5F, 0, 7, 1, 0.0F, false));

        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(0.75F, 1.25F, 4.5F);
        this.tail.addChild(legL6);
        this.setRotateAngle(legL6, 0.3054F, 0.0F, 0.0F);
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 27, -0.3F, 0.0F, -0.5F, 0, 5, 1, 0.0F, false));

        this.legL7 = new ModelRenderer(this);
        this.legL7.setRotationPoint(0.75F, 1.5F, 6.0F);
        this.tail.addChild(legL7);
        this.setRotateAngle(legL7, 0.9599F, 0.0F, 0.0F);
        this.legL7.cubeList.add(new ModelBox(legL7, 3, 27, -0.3F, 0.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.spikeL6 = new ModelRenderer(this);
        this.spikeL6.setRotationPoint(0.25F, -0.25F, 0.5F);
        this.tail.addChild(spikeL6);
        this.setRotateAngle(spikeL6, -0.1745F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 0.0F, -0.5F);
        this.spikeL6.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 16, -0.75F, -8.0F, 0.0F, 0, 8, 1, 0.0F, false));

        this.spikeL7 = new ModelRenderer(this);
        this.spikeL7.setRotationPoint(0.25F, -0.25F, 3.75F);
        this.tail.addChild(spikeL7);
        this.setRotateAngle(spikeL7, -0.3491F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 0.0F, -0.5F);
        this.spikeL7.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 16, -0.75F, -8.0F, 0.0F, 0, 8, 1, 0.0F, false));

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
