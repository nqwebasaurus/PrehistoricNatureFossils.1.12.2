package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonStensioella extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Stensioella;
    private final ModelRenderer head;
    private final ModelRenderer eyeother_r1;
    private final ModelRenderer eyeother_r2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer body;
    private final ModelRenderer frontLeftFin;
    private final ModelRenderer cube_r8;
    private final ModelRenderer frontRightFin;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer backLeftFin;
    private final ModelRenderer cube_r10;
    private final ModelRenderer backRightFin;

    public ModelSkeletonStensioella() {
        this.textureWidth = 128;
        this.textureHeight = 90;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, -8.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-8.3F, -1.0F, -8.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.8177F, -1.0F, 0.2041F, 12, 2, 36, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(12.0F, -1.0F, 9.1F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.3927F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 42, -10.6174F, -1.0F, -0.4939F, 10, 2, 24, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, -1.0F, 6.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 39, -4.5F, -1.0F, -18.0F, 13, 2, 24, -0.003F, false));

        this.Stensioella = new ModelRenderer(this);
        this.Stensioella.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.fossil.addChild(Stensioella);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5517F, -1.3342F);
        this.Stensioella.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 22, 25, -2.0F, 0.3136F, -7.1464F, 4, 0, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 8, -2.5F, 0.1694F, -6.4707F, 5, 0, 7, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 10, -1.0F, 0.1679F, -6.7037F, 2, 0, 4, 0.0F, false));

        this.eyeother_r1 = new ModelRenderer(this);
        this.eyeother_r1.setRotationPoint(-1.6315F, 0.1038F, -5.2756F);
        this.head.addChild(eyeother_r1);
        this.setRotateAngle(eyeother_r1, 0.0F, -0.2182F, 0.0F);
        this.eyeother_r1.cubeList.add(new ModelBox(eyeother_r1, 0, 0, -0.5F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.eyeother_r2 = new ModelRenderer(this);
        this.eyeother_r2.setRotationPoint(1.6315F, 0.1038F, -5.2756F);
        this.head.addChild(eyeother_r2);
        this.setRotateAngle(eyeother_r2, 0.0F, 0.2182F, 0.0F);
        this.eyeother_r2.cubeList.add(new ModelBox(eyeother_r2, 0, 3, -0.5F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.3517F, 0.8342F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.0897F, -0.0669F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, -0.0501F, -2.3115F, -5.3811F, 1, 0, 2, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.3517F, 0.8342F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.0897F, 0.0669F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 11, -0.9499F, -2.3115F, -5.3811F, 1, 0, 2, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.3517F, 0.8342F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.7848F, -0.0349F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 10, -1.3827F, -2.321F, -4.1027F, 2, 0, 2, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.3517F, 0.8342F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.7848F, 0.0349F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 27, -0.6173F, -2.321F, -4.1027F, 2, 0, 2, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.2517F, -0.1658F);
        this.head.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0436F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, 0.0F, -1.0F, 5, 0, 7, 0.0F, false));

        this.frontLeftFin = new ModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.5F, -0.6215F, -0.2793F);
        this.body.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, -0.2618F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontLeftFin.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.6545F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 66, -5.0038F, 0.75F, -0.7934F, 7, 0, 18, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 39, -1.0038F, 0.65F, -0.7934F, 2, 0, 5, 0.0F, false));

        this.frontRightFin = new ModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.5F, -0.6215F, -0.2793F);
        this.body.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.2356F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontRightFin.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.6545F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 61, 0, -1.9962F, 0.75F, -0.7934F, 7, 0, 18, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 25, -0.9962F, 0.65F, -0.7934F, 2, 0, 5, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 16, -2.0F, 0.1F, -1.25F, 4, 0, 7, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.75F, 5.75F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, -0.0436F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 24, -1.0F, 0.9F, -1.25F, 2, 0, 7, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 5.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, -0.0873F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 15, 16, -0.5F, 0.7F, -1.5F, 1, 0, 8, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 1.4F, 6.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 1.5708F);
        this.tail4.cubeList.add(new ModelBox(tail4, 18, 1, -0.7F, -0.5F, 0.0F, 0, 1, 7, 0.0F, false));

        this.backLeftFin = new ModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 1.1285F, 5.2207F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, -0.3054F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.8715F, -0.85F, 0.0293F);
        this.backLeftFin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 1.5708F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 15, 0.0F, -1.5F, -2.0F, 0, 3, 4, 0.0F, false));

        this.backRightFin = new ModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 0.5285F, 5.2207F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.48F, 0.0F, 1.5708F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 26, 0, -0.25F, -0.6285F, -1.9707F, 0, 3, 4, 0.0F, false));

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
