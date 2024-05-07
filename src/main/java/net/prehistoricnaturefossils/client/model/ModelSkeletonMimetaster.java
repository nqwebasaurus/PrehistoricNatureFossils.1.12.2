package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMimetaster extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer leg2R;
    private final ModelRenderer leg2L;
    private final ModelRenderer legL1;
    private final ModelRenderer legL2;
    private final ModelRenderer legR1;
    private final ModelRenderer legR2;
    private final ModelRenderer antennaL;
    private final ModelRenderer antennaR;
    private final ModelRenderer eyeL;
    private final ModelRenderer cube_r14;
    private final ModelRenderer eyeR;
    private final ModelRenderer cube_r15;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer leg2R2;
    private final ModelRenderer leg2L2;
    private final ModelRenderer legL3;
    private final ModelRenderer legL4;
    private final ModelRenderer legR3;
    private final ModelRenderer legR4;
    private final ModelRenderer antennaL2;
    private final ModelRenderer antennaR2;
    private final ModelRenderer eyeL2;
    private final ModelRenderer cube_r24;
    private final ModelRenderer eyeR2;
    private final ModelRenderer cube_r25;

    public ModelSkeletonMimetaster() {
        this.textureWidth = 144;
        this.textureHeight = 90;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-18.0F, -1.0F, 7.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.4363F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 68, -0.0895F, -1.0F, -15.9849F, 27, 2, 16, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(4.0F, -1.0F, 22.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.1345F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -39.0865F, -1.0F, -30.8992F, 39, 2, 31, -0.008F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -1.0F, 0.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.6109F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 34, -10.0F, -1.0F, -15.5F, 27, 2, 31, 0.008F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(16.0F, 0.0F, 3.0F);
        this.fossil.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 58, -1.5F, -2.4F, -4.0F, 3, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 19, 10, -0.5F, -2.35F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.85F, 2.25F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.5708F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, -1.0F, -0.5F, -0.2F, 2, 1, 0, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.25F, 3.5F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.5708F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 10, -1.0F, -0.5F, 0.2F, 2, 1, 0, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.3532F, -2.0F, -21.4185F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3927F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 46, -4.0F, 0.0F, -1.5F, 8, 0, 3, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-6.0F, -1.9F, -16.4611F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -3.1416F, 0.5672F, 3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 54, 1.3093F, -0.1F, -2.5514F, 7, 0, 3, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.0472F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 42, -8.25F, -2.7F, -2.5F, 8, 0, 3, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -1.0472F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 46, 0.25F, -2.7F, -2.5F, 8, 0, 3, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1309F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 54, 1.5F, -2.7F, -4.0F, 7, 0, 3, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.6109F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 20, -0.5F, -2.75F, -10.25F, 3, 0, 7, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.6109F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 34, -2.5F, -2.75F, -10.25F, 3, 0, 7, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.1309F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 50, -8.5F, -2.7F, -4.0F, 7, 0, 3, 0.0F, false));

        this.leg2R = new ModelRenderer(this);
        this.leg2R.setRotationPoint(-1.0F, -2.05F, -1.0F);
        this.body.addChild(leg2R);
        this.setRotateAngle(leg2R, 0.0F, 0.2182F, 0.0F);
        this.leg2R.cubeList.add(new ModelBox(leg2R, 0, 8, -6.0F, -0.2F, -0.5F, 6, 0, 5, 0.0F, false));

        this.leg2L = new ModelRenderer(this);
        this.leg2L.setRotationPoint(1.0F, -1.95F, -1.0F);
        this.body.addChild(leg2L);
        this.setRotateAngle(leg2L, 0.0F, 0.3054F, 0.0F);
        this.leg2L.cubeList.add(new ModelBox(leg2L, 0, 14, 0.0F, -0.3F, -0.5F, 6, 0, 5, 0.0F, false));

        this.legL1 = new ModelRenderer(this);
        this.legL1.setRotationPoint(1.5F, -2.2F, -2.0F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.829F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 14, 25, 0.0F, 0.0F, -0.5F, 7, 0, 1, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(6.5F, 0.0F, 0.0F);
        this.legL1.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, -1.6581F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 0, 0.0F, 0.01F, -0.5F, 12, 0, 3, 0.0F, false));

        this.legR1 = new ModelRenderer(this);
        this.legR1.setRotationPoint(-1.5F, -2.2F, -2.0F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.829F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 28, -7.0F, 0.0F, -0.5F, 7, 0, 1, 0.0F, false));

        this.legR2 = new ModelRenderer(this);
        this.legR2.setRotationPoint(-6.5F, 0.0F, 0.0F);
        this.legR1.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 2.2689F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 4, -12.0F, 0.01F, -0.5F, 12, 0, 3, 0.0F, false));

        this.antennaL = new ModelRenderer(this);
        this.antennaL.setRotationPoint(0.1F, -2.25F, -4.0F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.1745F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 14, 20, 0.0F, -0.01F, -4.0F, 4, 0, 4, 0.0F, false));

        this.antennaR = new ModelRenderer(this);
        this.antennaR.setRotationPoint(-0.1F, -2.25F, -4.0F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.1745F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 14, 34, -4.0F, 0.0F, -4.0F, 4, 0, 4, 0.0F, false));

        this.eyeL = new ModelRenderer(this);
        this.eyeL.setRotationPoint(1.0F, -2.4F, -3.0F);
        this.body.addChild(eyeL);
        this.setRotateAngle(eyeL, 1.5708F, -1.0472F, 0.0F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.5F, 0.1F);
        this.eyeL.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 3.1416F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 14, -0.5F, -1.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.eyeR = new ModelRenderer(this);
        this.eyeR.setRotationPoint(-1.0F, -2.4F, -3.0F);
        this.body.addChild(eyeR);
        this.setRotateAngle(eyeR, 1.5708F, 1.0472F, 0.0F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.5F, 0.1F);
        this.eyeR.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 3.1416F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 8, -0.5F, -1.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(-13.0F, 0.0F, -2.6F);
        this.fossil.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -1.8326F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 58, -1.5F, -2.4F, -4.0F, 3, 1, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 19, 10, -0.5F, -2.35F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.85F, 2.25F);
        this.body2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.5708F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 8, -1.0F, -0.5F, -0.2F, 2, 1, 0, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -2.25F, 3.5F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.5708F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 10, -1.0F, -0.5F, 0.2F, 2, 1, 0, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 1.0472F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 42, -8.25F, -2.7F, -2.5F, 8, 0, 3, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -1.0472F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 46, 0.25F, -2.7F, -2.5F, 8, 0, 3, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.1309F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 54, 1.5F, -2.7F, -4.0F, 7, 0, 3, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.body2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.6109F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 20, -0.5F, -2.75F, -10.25F, 3, 0, 7, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.body2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.6109F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 34, -2.5F, -2.75F, -10.25F, 3, 0, 7, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.body2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.1309F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 50, -8.5F, -2.7F, -4.0F, 7, 0, 3, 0.0F, false));

        this.leg2R2 = new ModelRenderer(this);
        this.leg2R2.setRotationPoint(-1.0F, -2.05F, -1.0F);
        this.body2.addChild(leg2R2);
        this.setRotateAngle(leg2R2, 0.0F, -0.48F, 0.0F);
        this.leg2R2.cubeList.add(new ModelBox(leg2R2, 0, 8, -6.0F, -0.2F, -0.5F, 6, 0, 5, 0.0F, false));

        this.leg2L2 = new ModelRenderer(this);
        this.leg2L2.setRotationPoint(1.0F, -1.95F, -1.0F);
        this.body2.addChild(leg2L2);
        this.setRotateAngle(leg2L2, 0.0F, 0.0873F, 0.0F);
        this.leg2L2.cubeList.add(new ModelBox(leg2L2, 0, 14, 0.0F, -0.3F, -0.5F, 6, 0, 5, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(1.5F, -2.2F, -2.0F);
        this.body2.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 1.4399F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 14, 25, 0.0F, 0.0F, -0.5F, 7, 0, 1, 0.0F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(6.5F, 0.0F, 0.0F);
        this.legL3.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -1.0036F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 0, 0.0F, 0.01F, -0.5F, 12, 0, 3, 0.0F, false));

        this.legR3 = new ModelRenderer(this);
        this.legR3.setRotationPoint(-1.5F, -2.2F, -2.0F);
        this.body2.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, -1.8762F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 28, -7.0F, 0.0F, -0.5F, 7, 0, 1, 0.0F, false));

        this.legR4 = new ModelRenderer(this);
        this.legR4.setRotationPoint(-6.5F, 0.0F, 0.0F);
        this.legR3.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 2.138F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 4, -12.0F, 0.01F, -0.5F, 12, 0, 3, 0.0F, false));

        this.antennaL2 = new ModelRenderer(this);
        this.antennaL2.setRotationPoint(0.1F, -2.25F, -4.0F);
        this.body2.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.0F, -0.1745F, 0.0F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 14, 20, 0.0F, -0.01F, -4.0F, 4, 0, 4, 0.0F, false));

        this.antennaR2 = new ModelRenderer(this);
        this.antennaR2.setRotationPoint(-0.1F, -2.25F, -4.0F);
        this.body2.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.0F, 0.1745F, 0.0F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 14, 34, -4.0F, 0.0F, -4.0F, 4, 0, 4, 0.0F, false));

        this.eyeL2 = new ModelRenderer(this);
        this.eyeL2.setRotationPoint(1.0F, -2.4F, -3.0F);
        this.body2.addChild(eyeL2);
        this.setRotateAngle(eyeL2, 1.5708F, -1.0472F, 0.0F);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -1.5F, 0.1F);
        this.eyeL2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 3.1416F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 14, -0.5F, -1.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.eyeR2 = new ModelRenderer(this);
        this.eyeR2.setRotationPoint(-1.0F, -2.4F, -3.0F);
        this.body2.addChild(eyeR2);
        this.setRotateAngle(eyeR2, 1.5708F, 1.0472F, 0.0F);


        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.5F, 0.1F);
        this.eyeR2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 3.1416F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 8, -0.5F, -1.5F, 0.0F, 1, 3, 0, 0.0F, false));

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
