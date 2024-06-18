package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonProceratosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r9;
    private final ModelRenderer body;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r13;
    private final ModelRenderer throatPouch;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonProceratosaurusFrame() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -21.0F, -0.3F, 1, 21, 1, -0.2F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.4F, -12.5F, -14.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0524F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -9.125F, -0.5F, 1, 22, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.4F, -12.5F, -14.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0524F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 3.9F, -3.5F, -0.5F, 1, 7, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -12.5F, 0.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 8.0F, -2.5F, -0.5F, 1, 5, 1, -0.2F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -21.7F, 0.0F);
        this.root.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.8F, -4.0F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 27, -1, -0.5F, 0.5182F, -0.1258F, 1, 1, 9, -0.2F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(3.5F, 0.5F, 0.0F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.9944F, -0.1858F, 0.0791F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 8.6305F, 1.0926F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.3526F, -0.0385F, 0.0205F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.5F, 9.0602F, 1.7263F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.3526F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 6.129F, 0.4123F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 1.9635F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.5F, 0.5F, 0.0F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3054F, 0.0234F, 0.0368F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 8.6305F, 1.0926F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0435F, 0.1099F, -0.0708F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.5F, 9.0602F, 1.7263F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.654F, -0.0347F, 0.0797F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 6.129F, -0.5877F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -0.0348F, -0.0015F, 0.0487F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.4F, 3.6F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0876F, -0.0869F, 0.0076F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.0364F, 0.2333F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0305F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 23, -0.5015F, 0.3005F, -0.2139F, 1, 1, 9, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.3364F, 9.0333F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0438F, -0.0872F, -0.0038F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0168F, 0.0691F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, -2, 25, -0.5F, 0.3F, -1.1F, 1, 1, 11, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2832F, 9.0691F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.088F, 0.1304F, 0.0115F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.2777F, -0.0883F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 14, -0.5F, 0.4F, -0.1F, 1, 1, 11, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5777F, 10.8117F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1806F, 0.2577F, -0.0465F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0032F, 0.0065F);
        this.tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0175F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 0, -0.5F, 0.1F, -0.2F, 1, 1, 10, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.2032F, 9.8065F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3124F, 0.2079F, -0.0666F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.1077F, -0.0011F);
        this.tail5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.5F, 0.3F, -0.3F, 1, 1, 12, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, -4.0F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 28, 25, -0.5F, 0.275F, -8.0F, 1, 1, 9, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.1F, -8.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0873F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 2.4F, 0.0F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 0, -1.0F, -2.2F, -4.1F, 1, 1, 5, -0.2F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(3.0F, 4.8F, -2.8F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 1.075F, 0.2201F, -0.143F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 5.2F, 0.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.5131F, 0.2926F, 0.0654F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.8F, 4.3F, -1.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, -0.015F, -0.0029F, 0.3463F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-3.0F, 4.8F, -2.8F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.8132F, -0.2201F, 0.143F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 5.2F, 0.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.9983F, -0.2111F, -0.0317F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.7F, 4.3F, -1.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.0143F, 0.0055F, -0.1718F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.4F, -4.0F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.0933F, -0.0429F, -0.0793F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.0F, -2.9F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3142F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 52, -1, -0.5F, 0.1813F, -0.4812F, 1, 1, 4, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.6F, -2.4F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.1619F, -0.1077F, -0.1927F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.8F, -3.5F);
        this.neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.8378F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 26, -0.5F, 0.1657F, -0.1846F, 1, 1, 5, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -3.9F, -3.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.6332F, -0.358F, -0.0259F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.346F, -3.6803F);
        this.neck3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0611F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 51, -0.5F, 0.4111F, -0.1697F, 1, 1, 4, -0.2F, false));

        this.throatPouch = new ModelRenderer(this);
        this.throatPouch.setRotationPoint(0.0F, 2.054F, -3.7803F);
        this.neck3.addChild(throatPouch);
        this.setRotateAngle(throatPouch, 1.0036F, 0.0F, 0.0F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.054F, -3.1803F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, -0.03F, -0.2616F, -0.0595F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.2F, 0.4F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7592F, 0.0F, 0.0F);

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
