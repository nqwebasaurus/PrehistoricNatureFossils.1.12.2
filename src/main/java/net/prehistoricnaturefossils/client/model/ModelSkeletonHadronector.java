package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHadronector extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer main;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer eye;
    private final ModelRenderer cube_r20;
    private final ModelRenderer frontLeftFin;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer bone;
    private final ModelRenderer backLeftFin;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;

    public ModelSkeletonHadronector() {
        this.textureWidth = 176;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-9.0F, 24.0F, -4.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 75, 48, -13.0F, -2.0F, -21.0F, 24, 2, 22, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(11.0F, 0.0F, -21.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.7418F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -32.0F, -2.0F, 0.0F, 32, 2, 45, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-13.0F, 0.0F, 1.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3927F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 48, 0.0F, -2.0F, 0.0F, 16, 2, 42, -0.003F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(3.5F, -1.95F, -6.75F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, -0.2618F, 0.0F, -1.5708F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.1F, -10.954F, -2.9954F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -2.5307F, 0.0F, 3.1416F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 0, 0.0F, -1.5F, -2.0F, 0, 3, 4, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.2F, -9.1689F, -3.41F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -2.8362F, 0.0F, 3.1416F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 7, 0.0F, -1.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.3F, -9.2546F, -7.0319F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 2.7925F, 0.0F, -3.1416F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 20, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.3F, -2.3965F, -3.3907F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 3.0761F, 0.0F, 3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 27, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.2F, -2.6082F, -7.2443F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -2.9671F, 0.0F, 3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 5, 30, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.4F, -6.0F, -5.25F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 3.1416F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, -3.5F, -4.0F, 0, 7, 8, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -9.5F, -9.25F);
        this.main.addChild(head);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.8F, 2.4054F, -3.1251F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 2.5744F, 0.0F, 3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 33, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.7F, 2.7927F, -4.3445F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 2.138F, 0.0F, -3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.9F, 3.1197F, -2.9433F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -2.9583F, 0.0F, -3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 0, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 3.5263F, -0.4789F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -3.002F, 0.0F, -3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 6, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.6F, 3.5397F, -4.0771F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -3.0543F, 0.0F, -3.1416F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 0, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(1.1F, 4.6885F, -0.6421F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 3.1416F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 21, 0.0F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(1.2F, 4.7257F, -2.3813F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -2.5351F, 0.0F, -3.1416F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 28, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.6F, 6.0946F, -1.2337F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -2.8362F, 0.0F, 3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 30, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.7F, 1.9226F, -0.8965F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 2.7925F, 0.0F, -3.1416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 16, 0.0F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.6F, 5.2098F, -2.5119F);
        this.head.addChild(jaw);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(1.3F, 0.2624F, -1.198F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -3.0107F, 0.0F, -3.1416F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 26, 15, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(1.4F, 0.0543F, -1.2704F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 3.1416F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 32, 18, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.eye = new ModelRenderer(this);
        this.eye.setRotationPoint(0.6625F, 2.575F, -2.45F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.0154F, 0.0F, 0.0F);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5625F, 0.0F, 0.0F);
        this.eye.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 2.6616F, 0.0F, -3.1416F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 33, 35, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.frontLeftFin = new ModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.825F, -5.25F, -7.675F);
        this.main.addChild(frontLeftFin);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.4F, -0.5F, 2.0F);
        this.frontLeftFin.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 3.1416F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 14, 31, 0.0F, -2.0F, -1.5F, 0, 4, 3, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.3F, 0.0F, 1.0F);
        this.frontLeftFin.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 3.1416F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 18, 12, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(bone);


        this.backLeftFin = new ModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.7F, -2.6308F, -5.7299F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.3487F, 0.0F, 0.0F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.2F, -0.25F, 3.0F);
        this.backLeftFin.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 3.1416F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 21, 31, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.1F, 0.0F, 1.5F);
        this.backLeftFin.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 3.1416F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 33, 24, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -7.0F, -1.25F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.0873F, 0.0F, 0.0F);


        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, 1.0F, 2.0F);
        this.tail.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 3.1416F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 0, 0.0F, -3.0F, -2.5F, 0, 6, 5, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.9F, 4.8952F, 2.4755F);
        this.tail.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.7418F, 0.0F, 3.1416F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 32, 12, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.6F, 4.4368F, 0.4039F);
        this.tail.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 3.0761F, 0.0F, 3.1416F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 36, 4, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.7F, -3.2724F, 2.4518F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -2.3562F, 0.0F, -3.1416F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, 0.0F, -2.0F, -1.5F, 0, 4, 3, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.8F, -2.2117F, 0.6841F);
        this.tail.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -2.3562F, 0.0F, -3.1416F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 18, 0, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(-0.2F, 1.025F, 3.7656F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(1.1F, -0.025F, 8.7594F);
        this.tail2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -2.3998F, 0.0F, -3.1416F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 34, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(1.2F, -0.025F, 6.7344F);
        this.tail2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 3.1416F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 29, 0, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.9F, 2.425F, 4.2344F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 3.1416F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 16, 0.0F, -2.0F, -3.5F, 0, 4, 7, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.8F, -2.275F, 4.2344F);
        this.tail2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 3.1416F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 10, 9, 0.0F, -2.0F, -3.5F, 0, 4, 7, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.9F, -1.0224F, 2.5343F);
        this.tail2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -2.6834F, 0.0F, -3.1416F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 10, 23, 0.0F, -1.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(1.0F, 0.9724F, 2.5343F);
        this.tail2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 2.6834F, 0.0F, 3.1416F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 20, 16, 0.0F, -1.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(1.2F, -0.025F, 2.7344F);
        this.tail2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 3.1416F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 21, 24, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

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
