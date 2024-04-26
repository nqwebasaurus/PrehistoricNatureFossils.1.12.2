package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSenekichthys extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer head;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer eye;
    private final ModelRenderer cube_r21;
    private final ModelRenderer leftpectoral;
    private final ModelRenderer cube_r22;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r23;
    private final ModelRenderer leftpelvic;
    private final ModelRenderer cube_r24;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer tail6;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer head2;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer eye2;
    private final ModelRenderer cube_r42;
    private final ModelRenderer leftpectoral2;
    private final ModelRenderer cube_r43;
    private final ModelRenderer jaw2;
    private final ModelRenderer cube_r44;
    private final ModelRenderer leftpelvic2;
    private final ModelRenderer cube_r45;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r46;
    private final ModelRenderer tail7;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer tail8;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer tail9;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer head3;
    private final ModelRenderer cube_r57;
    private final ModelRenderer eye3;
    private final ModelRenderer leftpectoral3;
    private final ModelRenderer jaw3;
    private final ModelRenderer leftpelvic3;

    public ModelSkeletonSenekichthys() {
        this.textureWidth = 144;
        this.textureHeight = 110;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(8.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-11.0F, 0.0F, -28.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.6981F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 79, 0.0F, -2.0F, 0.0F, 30, 2, 21, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-11.0F, 0.0F, -28.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.4276F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -24.0F, -2.0F, 0.0F, 24, 2, 47, 0.01F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(12.0F, 0.0F, -9.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2531F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 50, -32.0F, -2.0F, 0.0F, 32, 2, 26, -0.01F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(2.5F, -1.9F, 0.0F);
        this.root.addChild(body);
        this.setRotateAngle(body, -0.6109F, 0.0F, -1.5708F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.1843F, -1.1495F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, -3.1416F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, -1.5F, -2.0F, 0, 3, 4, 0.01F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.25F, -1.45F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -3.1416F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 12, 0.1F, -1.0F, -2.0F, 0, 2, 4, 0.001F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-1.0F, -0.4616F, 0.2825F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, 0.5616F, 1.5175F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 12, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, -2.8753F, 2.5836F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -2.5307F, 0.0F, -3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 9, 0.0F, -2.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.6F, -0.5616F, 1.4825F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, -3.1416F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 15, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(-0.1F, 0.0464F, 2.8349F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, -0.0349F, 1.2077F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 18, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.001F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.3F, 3.0028F, 2.1972F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 2.5656F, 0.0F, -3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 10, 0.0F, -2.5F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.4F, 0.5147F, 0.6204F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5236F, 0.0F, -3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 25, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(1.4F, -0.4799F, 1.1719F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, -3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 21, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.8F, -0.463F, 2.5029F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.425F, 2.0528F, 2.9593F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.48F, 0.0F, -3.1416F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 0, 0.0F, -0.5F, -3.5F, 0, 1, 7, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.4F, -0.1612F, 4.2871F);
        this.tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2182F, 0.0F, -3.1416F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 0.0F, -1.0F, -4.5F, 0, 2, 9, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.0F, 1.25F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2182F, 0.0F, -3.1416F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 0, 0.0F, -0.5F, -1.5F, 0, 1, 2, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.4F, -2.0F, -3.9F);
        this.body.addChild(head);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, 3.0436F, 0.5363F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2182F, 0.0F, -3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 21, 0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(1.2F, 2.3094F, -1.1176F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.48F, 0.0F, -3.1416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 24, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.001F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(1.1F, 2.5794F, -2.3855F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -3.1416F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 21, 16, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(1.2F, 1.5358F, -2.4334F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.685F, 0.0F, 3.1416F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 17, 18, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, 0.9723F, 0.3198F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.4363F, 0.0F, -3.1416F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 0, 0.0F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.eye = new ModelRenderer(this);
        this.eye.setRotationPoint(0.525F, 2.025F, -1.4F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.6981F, 0.0F, 0.0F);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.7F, -0.5F, -0.5F);
        this.eye.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -3.1416F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.leftpectoral = new ModelRenderer(this);
        this.leftpectoral.setRotationPoint(1.1F, 3.5794F, 0.4895F);
        this.head.addChild(leftpectoral);
        this.setRotateAngle(leftpectoral, -0.8306F, 0.0F, 0.0F);


        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.5F, 1.0F);
        this.leftpectoral.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -3.1416F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 23, 3, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 2.825F, -0.7F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5F, 0.5F, -1.5F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -3.1416F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 20, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.leftpelvic = new ModelRenderer(this);
        this.leftpelvic.setRotationPoint(0.55F, 0.7827F, 0.2011F);
        this.body.addChild(leftpelvic);
        this.setRotateAngle(leftpelvic, -1.0549F, 0.0F, 0.0F);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.1077F, 0.7989F);
        this.leftpelvic.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -3.1416F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 5, 23, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(-11.1F, -2.0F, -3.8F);
        this.root.addChild(body2);
        this.setRotateAngle(body2, 0.5236F, 0.0F, -1.5708F);


        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, -1.1843F, -1.1495F);
        this.body2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1745F, 0.0F, -3.1416F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, 0.0F, -1.5F, -2.0F, 0, 3, 4, 0.01F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 0.25F, -1.45F);
        this.body2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -3.1416F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 12, 0.1F, -1.0F, -2.0F, 0, 2, 4, 0.001F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(-1.0F, -0.4616F, 0.2825F);
        this.body2.addChild(tail4);
        this.setRotateAngle(tail4, 0.2618F, 0.0F, 0.0F);


        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(1.5F, 0.5616F, 1.5175F);
        this.tail4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -3.1416F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 9, 12, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(1.5F, -2.8753F, 2.5836F);
        this.tail4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -2.5307F, 0.0F, -3.1416F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 22, 9, 0.0F, -2.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(1.6F, -0.5616F, 1.4825F);
        this.tail4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2182F, 0.0F, -3.1416F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 13, 15, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(-0.1F, 0.0464F, 2.8349F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.3927F, 0.0F, 0.0F);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(1.5F, -0.0349F, 1.2077F);
        this.tail5.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -3.1416F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 6, 18, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.001F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(1.3F, 3.0028F, 2.1972F);
        this.tail5.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 2.5656F, 0.0F, -3.1416F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 17, 10, 0.0F, -2.5F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(1.4F, 0.5147F, 0.6204F);
        this.tail5.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.5236F, 0.0F, -3.1416F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 25, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(1.4F, -0.4799F, 1.1719F);
        this.tail5.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1745F, 0.0F, -3.1416F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 21, 21, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.8F, -0.463F, 2.5029F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.4363F, 0.0F, 0.0F);


        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.425F, 2.0528F, 2.9593F);
        this.tail6.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.48F, 0.0F, -3.1416F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 10, 0, 0.0F, -0.5F, -3.5F, 0, 1, 7, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.4F, -0.1612F, 4.2871F);
        this.tail6.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.2182F, 0.0F, -3.1416F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 0, 0.0F, -1.0F, -4.5F, 0, 2, 9, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, 0.0F, 1.25F);
        this.tail6.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.2182F, 0.0F, -3.1416F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 19, 1, 0.0F, -0.5F, -1.5F, 0, 1, 2, 0.0F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(-0.4F, -2.4F, -3.9F);
        this.body2.addChild(head2);
        this.setRotateAngle(head2, -0.3054F, 0.0F, 0.0F);


        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(1.0F, 3.0436F, 0.5363F);
        this.head2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.2182F, 0.0F, -3.1416F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 10, 21, 0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(1.2F, 2.3094F, -1.1176F);
        this.head2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.48F, 0.0F, -3.1416F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 15, 24, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.001F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(1.1F, 2.5794F, -2.3855F);
        this.head2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, -3.1416F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 21, 16, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(1.2F, 1.5358F, -2.4334F);
        this.head2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.685F, 0.0F, 3.1416F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 17, 18, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(1.0F, 0.9723F, 0.3198F);
        this.head2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.4363F, 0.0F, -3.1416F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 10, 0, 0.0F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.eye2 = new ModelRenderer(this);
        this.eye2.setRotationPoint(0.525F, 2.025F, -1.4F);
        this.head2.addChild(eye2);
        this.setRotateAngle(eye2, 0.6981F, 0.0F, 0.0F);


        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.7F, -0.5F, -0.5F);
        this.eye2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, -3.1416F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.leftpectoral2 = new ModelRenderer(this);
        this.leftpectoral2.setRotationPoint(1.1F, 3.5794F, 0.4895F);
        this.head2.addChild(leftpectoral2);
        this.setRotateAngle(leftpectoral2, -0.8306F, 0.0F, 0.0F);


        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -0.5F, 1.0F);
        this.leftpectoral2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, -3.1416F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 23, 3, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(-0.5F, 2.825F, -0.7F);
        this.head2.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.6545F, 0.0F, 0.0F);


        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(1.5F, 0.5F, -1.5F);
        this.jaw2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, -3.1416F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 20, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.leftpelvic2 = new ModelRenderer(this);
        this.leftpelvic2.setRotationPoint(0.55F, 0.7827F, 0.2011F);
        this.body2.addChild(leftpelvic2);
        this.setRotateAngle(leftpelvic2, -1.0549F, 0.0F, 0.0F);


        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -0.1077F, 0.7989F);
        this.leftpelvic2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, -3.1416F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 5, 23, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(-7.5F, -2.0F, 23.55F);
        this.root.addChild(body3);
        this.setRotateAngle(body3, 1.5446F, 0.0F, -1.5708F);


        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5F, -1.1843F, -1.1495F);
        this.body3.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1745F, 0.0F, -3.1416F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 0, 0.0F, -0.1F, -2.0F, 0, 1, 4, 0.01F, false));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 0, 0.0F, 0.5F, -2.0F, 0, 1, 4, 0.01F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(-1.0F, -0.4616F, 0.2825F);
        this.body3.addChild(tail7);
        this.setRotateAngle(tail7, 0.2618F, 0.0F, 0.0F);


        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(1.5F, 0.0616F, 2.0175F);
        this.tail7.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.48F, 0.0F, -3.1416F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 10, 13, 0.0F, -0.6F, -7.1F, 0, 1, 2, 0.0F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 10, 13, 0.1F, -0.6F, -3.1F, 0, 1, 2, 0.0F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 10, 13, 0.1F, -0.6F, -1.1F, 0, 1, 2, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(1.5F, -2.8753F, 2.5836F);
        this.tail7.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -2.5307F, 0.0F, -3.1416F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 22, 9, 0.0F, -2.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(1.6F, -0.5616F, 1.4825F);
        this.tail7.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.2182F, 0.0F, -3.1416F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 13, 15, 0.1F, -0.6F, -1.5F, 0, 1, 3, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 13, 15, -0.1F, 0.0F, -1.5F, 0, 1, 3, 0.0F, false));

        this.tail8 = new ModelRenderer(this);
        this.tail8.setRotationPoint(-0.1F, 0.0464F, 2.8349F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, 0.3927F, 0.0F, 0.0F);


        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(1.5F, -0.0349F, 1.2077F);
        this.tail8.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.0F, -3.1416F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 6, 18, -0.2F, -0.5F, -1.5F, 0, 1, 3, 0.001F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(1.3F, 3.0028F, 2.1972F);
        this.tail8.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 2.5656F, 0.0F, -3.1416F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 17, 10, 0.0F, -2.5F, -1.0F, 0, 3, 2, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(1.4F, 0.5147F, 0.6204F);
        this.tail8.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.5236F, 0.0F, -3.1416F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 25, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(1.4F, -0.4799F, 1.1719F);
        this.tail8.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.1745F, 0.0F, -3.1416F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 21, 21, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.tail9 = new ModelRenderer(this);
        this.tail9.setRotationPoint(0.8F, -0.463F, 2.5029F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, 0.4363F, 0.0F, 0.0F);


        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.425F, 2.0528F, 2.9593F);
        this.tail9.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.48F, 0.0F, -3.1416F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 11, 1, 0.0F, -0.5F, -3.5F, 0, 1, 5, 0.0F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(0.4F, -0.1612F, 4.2871F);
        this.tail9.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.2182F, 0.0F, -3.1416F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 0, 0.0F, -1.0F, -4.5F, 0, 2, 9, 0.0F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.5F, 0.0F, 1.25F);
        this.tail9.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.2182F, 0.0F, -3.1416F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 19, 1, 0.0F, -0.5F, -1.5F, 0, 1, 2, 0.0F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(-0.4F, -2.4F, -3.9F);
        this.body3.addChild(head3);
        this.setRotateAngle(head3, -0.3054F, 0.0F, 0.0F);


        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(1.0F, 0.9723F, 0.3198F);
        this.head3.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.4363F, 0.0F, -3.1416F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 10, 0, 0.0F, 0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.eye3 = new ModelRenderer(this);
        this.eye3.setRotationPoint(0.525F, 2.025F, -1.4F);
        this.head3.addChild(eye3);
        this.setRotateAngle(eye3, 0.6981F, 0.0F, 0.0F);


        this.leftpectoral3 = new ModelRenderer(this);
        this.leftpectoral3.setRotationPoint(1.1F, 3.5794F, 0.4895F);
        this.head3.addChild(leftpectoral3);
        this.setRotateAngle(leftpectoral3, -0.8306F, 0.0F, 0.0F);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(-0.5F, 2.825F, -0.7F);
        this.head3.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.6545F, 0.0F, 0.0F);


        this.leftpelvic3 = new ModelRenderer(this);
        this.leftpelvic3.setRotationPoint(0.55F, 0.7827F, 0.2011F);
        this.body3.addChild(leftpelvic3);
        this.setRotateAngle(leftpelvic3, -1.0549F, 0.0F, 0.0F);

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
