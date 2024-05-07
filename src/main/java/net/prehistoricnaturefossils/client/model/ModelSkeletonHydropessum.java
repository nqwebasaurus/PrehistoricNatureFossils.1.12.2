package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHydropessum extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer main;
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
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r21;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r22;
    private final ModelRenderer frontLeftFin;
    private final ModelRenderer cube_r23;
    private final ModelRenderer head;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer eye;
    private final ModelRenderer cube_r28;
    private final ModelRenderer eye2;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;

    public ModelSkeletonHydropessum() {
        this.textureWidth = 112;
        this.textureHeight = 75;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(3.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-14.7F, 0.0F, 16.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.4661F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 50, 32, -0.1207F, -2.0F, -0.1544F, 9, 2, 16, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-16.7F, 0.0F, -5.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 32, 0.0414F, -2.0F, -0.06F, 14, 2, 21, -0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(13.0F, 0.0F, -14.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.6545F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -29.0F, -2.0F, -11.0F, 22, 2, 29, 0.003F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(7.5F, -2.7F, -4.0F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.0F, 0.0F, -1.5708F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.2874F, 7.5002F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -2.4478F, 0.0F, 3.1416F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 32, 0.0F, -3.5F, -2.5F, 0, 7, 5, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.4F, -3.3361F, 5.8145F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -2.5787F, 0.0F, -3.1416F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 43, 0.0F, -2.5F, -1.5F, 0, 5, 3, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.3F, 0.2855F, 4.3341F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -2.3562F, 0.0F, 3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 0, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.4F, -0.5142F, 2.4465F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4363F, 0.0F, 3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 56, 0.0F, -1.5F, -2.0F, 0, 3, 4, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -3.413F, -1.1625F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6545F, 0.0F, -3.1416F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 0, 0.0F, -2.0F, -3.0F, 0, 4, 6, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.2F, -2.0F, 2.5F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.0F, -2.0F, -2.5F, 0, 4, 5, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.4F, -13.6155F, 5.3454F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.781F, 0.0F, -3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 56, 0.0F, -1.5F, -2.5F, 0, 3, 5, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -18.0253F, 5.8129F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.6807F, 0.0F, -3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 32, 0.0F, -2.5F, -4.0F, 0, 5, 8, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.3F, -16.6319F, 2.3992F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5498F, 0.0F, -3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 22, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -17.9012F, 1.1639F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.781F, 0.0F, -3.1416F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.4F, -16.3982F, 1.0821F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.781F, 0.0F, -3.1416F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 0, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.3F, -13.8785F, -1.22F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -2.4173F, 0.0F, 3.1416F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 22, 19, 0.0F, -2.5F, -1.5F, 0, 5, 3, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.2F, -14.5F, 1.5F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 56, -0.1F, -1.5F, -2.5F, 0, 3, 5, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.2F, -8.5F, 2.0F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -3.1416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0F, -4.5F, -6.0F, 0, 9, 12, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -8.5564F, 7.3916F);
        this.main.addChild(tail);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.1F, -2.0115F, 0.6737F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 2.4435F, 0.0F, 3.1416F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 32, 0.0F, -2.0F, -1.5F, 0, 4, 3, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0564F, 1.6084F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -3.1416F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 46, 0.0F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.1F, 2.0331F, 0.6553F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -2.4653F, 0.0F, -3.1416F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 42, 56, 0.0F, -2.0F, -1.5F, 0, 4, 3, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0564F, 2.6084F);
        this.tail.addChild(tail2);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.1F, 0.0F, 1.0F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -3.1416F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 49, 56, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tail2.addChild(tail3);


        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.5F, 2.5F);
        this.tail3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -3.1416F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 56, 0.0F, -6.0F, -2.5F, 0, 11, 5, 0.0F, false));

        this.frontLeftFin = new ModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.025F, -4.9F, -3.1F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.4363F, 0.0F, 0.0F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.frontLeftFin.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -3.1416F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 22, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -13.0F, -4.0F);
        this.main.addChild(head);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.1F, 4.5958F, -1.636F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 2.0769F, 0.0F, 3.1416F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 56, 56, 0.0F, -2.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 2.4648F, -0.4182F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.7592F, 0.0F, -3.1416F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 9, 32, 0.0F, -1.5F, -2.0F, 0, 3, 4, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.2F, 7.2231F, -0.4784F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.9207F, 0.0F, -3.1416F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 7, 46, 0.0F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.4F, 5.0F, -0.5F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -3.1416F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 13, 0, 0.0F, -2.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.eye = new ModelRenderer(this);
        this.eye.setRotationPoint(0.85F, 4.024F, -1.882F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, -0.5236F, 0.0F, 0.0F);


        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.4F, 0.0F, 0.0F);
        this.eye.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -3.1416F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, -0.1F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.eye2 = new ModelRenderer(this);
        this.eye2.setRotationPoint(-0.85F, 4.024F, -1.882F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, -0.5236F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 5.9483F, -1.2497F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5672F, 0.0F, 0.0F);


        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.017F, -1.5992F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 2.3387F, 0.0F, 3.1416F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 16, 0, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.1F, -0.283F, -1.5508F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 2.0769F, 0.0F, 3.1416F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 6, 0, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

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
