package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGregorius extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer body;
    private final ModelRenderer cube_r10;
    private final ModelRenderer frontLeftFin;
    private final ModelRenderer cube_r11;
    private final ModelRenderer head;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer backRightFin;
    private final ModelRenderer backLeftFin;
    private final ModelRenderer cube_r24;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;

    public ModelSkeletonGregorius() {
        this.textureWidth = 112;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 22.5F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(14.2307F, 1.5F, 2.2801F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5672F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 68, -15.9655F, -1.0F, -3.9017F, 16, 1, 4, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(10.8946F, 1.5F, -5.0802F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 41, -11.3F, -1.0F, -9.0F, 13, 1, 17, 0.002F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.5655F, 1.5F, -19.0288F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.9119F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 60, -0.0871F, -1.0F, 0.0449F, 7, 1, 15, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-11.4905F, 1.5F, -2.0538F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0873F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 41, -3.5F, -1.0F, -9.0F, 7, 1, 25, 0.02F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -9.0F, 0.5F, -17.0F, 14, 1, 39, 0.01F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 15, -10.0F, 0.5F, -5.0F, 1, 1, 5, -0.002F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(1.0F, 1.5F, 0.0F);
        this.fossil.addChild(body2);
        this.setRotateAngle(body2, 0.48F, 0.0F, -1.5708F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, 0.525F, -8.75F, -5.0F, 1, 8, 7, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.9F, -9.4843F, -2.6603F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2313F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 5, 16, -0.525F, -1.4396F, 0.2263F, 1, 2, 1, -0.001F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.9F, -9.4843F, -2.6603F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5803F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 16, -0.5F, -3.0896F, -0.3237F, 1, 4, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, -9.675F, -1.0F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1178F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 54, 2.5F, 0.0046F, -3.9949F, 1, 1, 4, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.0F, -9.5F, 2.0F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0567F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 68, 0, 2.5F, 0.0F, -3.0F, 1, 1, 3, -0.001F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body2.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 20, 22, 0.5F, -8.0F, -8.5F, 1, 7, 4, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, -9.25F, -4.75F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3142F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 48, 1.9F, 0.0F, -4.2F, 1, 2, 4, 0.0F, false));

        this.frontLeftFin = new ModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.1F, -2.0F, -6.25F);
        this.body.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0017F, -0.3163F, 1.6212F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 8, 41, -1.0F, 0.5F, 0.0F, 5, 1, 2, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(4.1817F, 0.8004F, 2.0242F);
        this.frontLeftFin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0175F, 0.0F, -0.0436F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 0, -3.5F, 0.0F, -2.5F, 7, 0, 5, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.25F, -1.5F, -9.0F);
        this.body.addChild(head);
        this.setRotateAngle(head, 0.0F, -0.0873F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 48, 46, 1.25F, -4.5F, -2.25F, 1, 3, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 16, 60, 1.0F, -4.35F, -4.6F, 1, 2, 3, 0.001F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -5.1082F, -3.2961F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4887F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 53, 0.5F, -0.0095F, -2.9568F, 1, 1, 3, -0.001F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -6.5F, 0.5F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 45, 1.5F, 0.0F, -4.0F, 1, 2, 4, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.5F, -2.5F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3054F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 32, 0.5F, -1.1F, -3.925F, 1, 1, 5, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 49, 60, 1.5F, -2.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, -1.5086F, -2.2994F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5236F, 0.0F, 0.0F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 1.6015F, -0.1708F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4669F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 7, 52, 0.5F, -0.9844F, -3.9954F, 1, 1, 4, -0.01F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.325F, -0.69F, -3.3631F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -2.4435F, 0.0F, 3.1416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.0086F, -0.2006F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 41, 0.5F, -0.1F, -3.925F, 1, 1, 5, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -5.75F, 1.75F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 20, 1.0F, -0.75F, 0.0F, 1, 4, 6, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(1.525F, -2.2968F, 5.3909F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -2.4435F, 0.0F, -3.1416F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 29, 0.0F, -1.5F, -2.5F, 0, 3, 5, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -2.85F, 3.9F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.6981F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 60, 1.425F, -0.0346F, -0.0024F, 1, 2, 3, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -2.797F, 2.349F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.6981F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 10, 0, 0.425F, -2.222F, -0.7495F, 1, 3, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, -3.75F, 0.0F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2182F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 40, 41, 1.95F, 0.0F, 0.0F, 1, 3, 4, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3011F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 6, 0.975F, -2.0F, 0.0F, 1, 2, 6, 0.0F, false));

        this.backRightFin = new ModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.172F, 3.4077F, 1.5869F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.5286F, -0.3263F, 0.8108F);


        this.backLeftFin = new ModelRenderer(this);
        this.backLeftFin.setRotationPoint(2.172F, 3.4077F, 1.5869F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.5782F, 0.0086F, -0.0162F);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.675F, 1.5F, 0.0F);
        this.backLeftFin.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 3.1416F, 0.0F, -3.098F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, 0.0F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, 1.1883F, 5.5375F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 29, 0.5F, -1.5883F, -0.8875F, 1, 2, 5, 0.02F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(1.025F, 1.8023F, 2.33F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 2.9671F, 0.0F, -3.1416F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 7, 58, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 2.4117F, -0.8875F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3491F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 40, 49, 0.9F, -2.0F, 1.4F, 1, 2, 4, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, -2.1383F, -0.0625F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0873F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 27, 6, 1.45F, -0.075F, 0.2F, 1, 1, 4, -0.001F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.5F, -0.5883F, 3.6125F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2182F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 31, 22, 0.0F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.25F, -0.25F, 2.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1745F, 0.0F, 0.0F);


        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.3F, -0.5F, 3.0F);
        this.tail4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -3.1416F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 11, 10, 0.0F, -4.5F, -3.0F, 0, 9, 6, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.25F, -0.25F, 0.0F);
        this.tail4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1745F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 55, -0.6F, -0.25F, -0.5F, 1, 1, 4, 0.0F, false));

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
