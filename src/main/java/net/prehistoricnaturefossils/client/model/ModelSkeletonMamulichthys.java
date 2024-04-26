package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMamulichthys extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer main;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer backLeftFin;
    private final ModelRenderer cube_r11;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer head;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer frontLeftFin;
    private final ModelRenderer cube_r26;
    private final ModelRenderer eyes;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;

    public ModelSkeletonMamulichthys() {
        this.textureWidth = 96;
        this.textureHeight = 75;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(2.0F, 24.0F, -6.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 36, 38, -5.9F, -3.0F, -9.0F, 8, 3, 15, 0.006F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, 0.0F, -8.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.1345F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 0, 0.0495F, -3.0F, 0.0191F, 16, 3, 9, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-6.0F, 0.0F, -8.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.4363F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 53, -5.5F, -2.8F, -0.9F, 6, 3, 9, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(9.7F, 0.0F, 8.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 32, -12.1141F, -3.0F, 0.0328F, 8, 3, 17, 0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-6.0F, 0.0F, 6.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 13, 0.1F, -3.0F, 0.0F, 8, 3, 8, -0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-10.6F, 0.0F, -5.7F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1571F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.098F, -2.0F, -0.1217F, 8, 2, 29, 0.0F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(3.0F, -1.8F, 0.9F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.1745F, 0.0F, -1.5708F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -9.25F, -0.25F, 3, 7, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 34, 40, -1.5F, -10.95F, -1.25F, 3, 3, 4, -0.001F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -10.95F, 2.75F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 0, -0.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -10.95F, -0.75F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.9163F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 12, 1.1F, -3.925F, 0.0F, 1, 4, 1, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.1F, -6.9069F, 6.6632F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 32, -1.0F, -1.8431F, -0.9132F, 3, 5, 5, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 4.6569F, -0.9132F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 15, -1.5F, -1.975F, 0.375F, 3, 2, 5, -0.001F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -3.0547F, 1.4028F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6458F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 15, 0.3F, -2.5819F, -0.1234F, 1, 3, 1, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.4431F, -0.4882F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2531F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 32, -1.5F, -0.047F, -0.1111F, 3, 2, 5, 0.0F, false));

        this.backLeftFin = new ModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.4F, 3.3569F, 0.1868F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.7539F, 0.0F, 0.0F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 22, 23, -0.5F, -0.0005F, -0.5326F, 1, 3, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.3087F, 0.9072F);
        this.backLeftFin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 2.8362F, 0.0F, -3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 12, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, 0.5254F, 4.1286F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2618F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 46, 57, -1.6F, -1.4685F, -0.5919F, 3, 3, 4, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.9F, 3.3842F, 1.7756F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.48F, 0.0F, -3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 1.5315F, 1.4081F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 66, -1.5F, -0.8F, -1.95F, 2, 2, 4, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -1.9685F, 1.4081F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3491F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 66, -0.5F, -0.1F, -2.0F, 2, 2, 4, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.4F, -0.1498F, 3.3836F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.3927F, 0.0F, 0.0F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.6F, 0.8145F, 4.3505F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.4014F, 0.0F, -3.1416F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 15, 0.0F, -2.0F, -4.0F, 0, 4, 8, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.4F, -1.1713F, 2.9818F);
        this.tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2269F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 68, 37, -0.6F, -0.4372F, -0.116F, 1, 1, 4, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -0.7187F, 0.0245F);
        this.tail3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 67, -1.6F, -0.5F, -1.0F, 2, 2, 4, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0687F, 1.1282F);
        this.tail3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.5978F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 68, 43, -1.1F, -1.025F, -1.95F, 2, 2, 3, -0.001F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.4F, -7.0F, 0.0F);
        this.main.addChild(head);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.8F, -7.925F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.5752F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 17, -1.65F, 0.0286F, -1.2582F, 0, 3, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, 1.8F, -7.925F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.5752F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 32, 1.65F, 0.0286F, -1.2582F, 0, 3, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, 1.8F, -7.925F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 1.5752F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 46, 0, -0.5F, 0.0036F, -1.0082F, 3, 4, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, 0.025F, -7.0F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 1.0865F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 68, 57, -0.5F, 0.0114F, -2.0098F, 3, 2, 2, 0.001F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, -3.95F, -1.25F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.6065F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 22, 53, -2.5F, 0.0F, -7.0F, 3, 3, 3, -0.001F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 57, 61, -2.5F, 0.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(1.5F, 1.25F, -0.25F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.1047F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 31, 57, -3.0F, -2.5F, -4.0F, 3, 5, 4, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 4.75F, -0.25F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0436F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 43, -1.5F, -1.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.frontLeftFin = new ModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.8F, 4.35F, -0.75F);
        this.head.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.9599F, 1.5708F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 41, 65, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.5F, 0.0F, 2.5F);
        this.frontLeftFin.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.2182F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 12, 23, -1.0F, -0.1F, -2.8F, 2, 0, 5, 0.0F, false));

        this.eyes = new ModelRenderer(this);
        this.eyes.setRotationPoint(0.65F, 0.925F, -6.3F);
        this.head.addChild(eyes);
        this.setRotateAngle(eyes, 0.5236F, 0.0F, 0.0F);
        this.eyes.cubeList.add(new ModelBox(eyes, 12, 32, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 2.8036F, -4.2582F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);


        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, 1.7596F, 0.0101F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2662F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 66, 32, -0.5F, -0.9888F, -2.9912F, 3, 1, 3, -0.002F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, -1.0036F, -3.6668F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 15, -1.55F, 0.7536F, 0.5168F, 0, 1, 3, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, -1.0036F, -3.6668F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 21, 7, 1.55F, 0.7536F, 0.5168F, 0, 1, 3, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0F, -1.0036F, -3.6668F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 51, 32, -0.5F, 1.0036F, 0.0168F, 3, 1, 4, -0.001F, false));

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
