package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBethesdaichthys extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer root;
    private final ModelRenderer cube_r3;
    private final ModelRenderer backLeftFin;
    private final ModelRenderer cube_r4;
    private final ModelRenderer head;
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
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer frontLeftFin;
    private final ModelRenderer cube_r20;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r26;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;

    public ModelSkeletonBethesdaichthys() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(7.0F, 24.0F, -4.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -4.0F, -2.0F, -16.0F, 13, 2, 44, -0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 70, -30.0F, -2.0F, -3.0F, 27, 2, 20, 0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-30.0F, 0.0F, -3.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.4712F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 47, 0.0F, -2.0F, 0.0F, 29, 2, 20, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-5.0F, 0.0F, 28.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.6807F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 71, 0, 0.8F, -2.0F, -15.5F, 9, 2, 16, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(-3.2F, -2.2F, 0.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, -0.3927F, 0.0F, -1.5708F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.2F, 0.0F, 0.0F);
        this.root.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -3.1416F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 13, 0.0F, -4.5F, -5.0F, 0, 9, 10, 0.0F, false));

        this.backLeftFin = new ModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.25F, 3.8F, -0.5F);
        this.root.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.2988F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.5F, 2.0F);
        this.backLeftFin.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 3.1416F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 23, 0.0F, -2.5F, -2.0F, 0, 5, 4, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.5F, 4.4929F, -4.9778F);
        this.root.addChild(head);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.9F, -3.0568F, -5.2393F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5236F, 0.0F, -3.1416F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 0, 0.3F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.2F, -4.4473F, -4.1478F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -2.618F, 0.0F, -3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 57, 0.5F, -2.0F, -2.0F, 0, 4, 4, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.8F, -2.8665F, -1.4337F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -2.9234F, 0.0F, -3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 47, 0.0F, -2.5F, -2.0F, 0, 5, 4, 0.001F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.2F, -4.6505F, -7.5852F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, -3.1416F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 8, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, -5.112F, -6.6635F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.0F, -3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 0, 0.1F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.05F, -3.9998F, -7.4222F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, -3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.1F, -4.2439F, -7.3681F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, 0.0F, -3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, -4.9589F, -7.9182F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6109F, 0.0F, -3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 6, 0, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.001F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, -5.977F, -5.1486F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 2.6616F, 0.0F, -3.1416F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 36, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.001F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -1.5333F, -4.0982F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5236F, 0.0F, -3.1416F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.9F, -6.0071F, -1.1778F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 2.8362F, 0.0F, -3.1416F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 9, 47, 0.0F, -2.5F, -2.0F, 0, 5, 4, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.2198F, -4.2945F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3054F, 0.0F, 0.0F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(1.15F, -1.7297F, -3.9872F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3491F, 0.0F, -3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 5, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(1.2F, -1.3494F, -3.6733F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3491F, 0.0F, -3.1416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 31, 0, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(1.05F, -0.779F, -1.8444F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.5236F, 0.0F, -3.1416F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 5, 23, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(1.1F, -0.3125F, -1.5364F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5236F, 0.0F, -3.1416F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 15, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.frontLeftFin = new ModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.9F, -1.4429F, -2.0222F);
        this.head.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.1129F, 0.0F, 0.0F);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 3.0F, 2.0F);
        this.frontLeftFin.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 3.1416F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 32, 29, 0.0F, -3.0F, -2.0F, 0, 6, 4, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, 0.0F, 4.5F);
        this.root.addChild(tail);
        this.setRotateAngle(tail, 0.1309F, 0.0F, 0.0F);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.4F, -3.6311F, 4.6756F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -1.9853F, 0.0F, 3.1416F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 0, 0.0F, -3.5F, -2.5F, 0, 7, 5, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, -2.5796F, 2.378F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4145F, 0.0F, -3.1416F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 16, 33, 0.0F, -1.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.4F, 3.9547F, 4.4224F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.9599F, 0.0F, -3.1416F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 13, 0, 0.0F, -3.0F, -2.0F, 0, 6, 4, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 2.6154F, 2.3713F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3927F, 0.0F, -3.1416F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 36, 0.0F, -1.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.6F, 0.0F, 2.5F);
        this.tail.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -3.1416F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, 0.0F, -2.5F, -2.5F, 0, 5, 5, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail.addChild(tail2);


        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.7F, 0.0F, 3.0F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -3.1416F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 7, 0.0F, -2.0F, -3.0F, 0, 4, 6, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -2.0F, 6.0F);
        this.tail2.addChild(tail3);


        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 0.5266F, 3.6128F);
        this.tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3927F, 0.0F, -3.1416F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, 0.0F, -5.0F, -6.0F, 0, 10, 12, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.8F, -0.6602F, 4.0699F);
        this.tail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.4058F, 0.0F, -3.1416F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 23, 0.0F, -1.0F, -5.0F, 0, 2, 10, 0.0F, false));

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
