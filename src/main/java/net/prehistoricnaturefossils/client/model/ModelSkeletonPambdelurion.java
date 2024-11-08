package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPambdelurion extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Pambdelurion;
    private final ModelRenderer leftFin4;
    private final ModelRenderer cube_r3;
    private final ModelRenderer rightFin4;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftFin5;
    private final ModelRenderer cube_r5;
    private final ModelRenderer rightFin5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftFin6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer rightFin6;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail1;
    private final ModelRenderer leftFin7;
    private final ModelRenderer cube_r9;
    private final ModelRenderer rightFin7;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leftFin8;
    private final ModelRenderer cube_r11;
    private final ModelRenderer rightFin8;
    private final ModelRenderer cube_r12;
    private final ModelRenderer tail2;
    private final ModelRenderer leftFin9;
    private final ModelRenderer cube_r13;
    private final ModelRenderer rightFin9;
    private final ModelRenderer cube_r14;
    private final ModelRenderer tail3;
    private final ModelRenderer leftFin10;
    private final ModelRenderer cube_r15;
    private final ModelRenderer rightFin10;
    private final ModelRenderer cube_r16;
    private final ModelRenderer tail4;
    private final ModelRenderer leftFin11;
    private final ModelRenderer cube_r17;
    private final ModelRenderer rightFin11;
    private final ModelRenderer cube_r18;
    private final ModelRenderer leftFin12;
    private final ModelRenderer cube_r19;
    private final ModelRenderer rightFin12;
    private final ModelRenderer cube_r20;
    private final ModelRenderer leftLeg11;
    private final ModelRenderer rightLeg11;
    private final ModelRenderer neck1;
    private final ModelRenderer leftFin2;
    private final ModelRenderer cube_r21;
    private final ModelRenderer rightFin2;
    private final ModelRenderer cube_r22;
    private final ModelRenderer leftFin3;
    private final ModelRenderer cube_r23;
    private final ModelRenderer rightFin3;
    private final ModelRenderer cube_r24;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer neck2;
    private final ModelRenderer leftFin1;
    private final ModelRenderer cube_r25;
    private final ModelRenderer rightFin1;
    private final ModelRenderer cube_r26;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer head;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer leftAppendage1;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer leftAppendage2;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer leftAppendage3;
    private final ModelRenderer cube_r41;
    private final ModelRenderer leftSpine2;
    private final ModelRenderer cube_r42;
    private final ModelRenderer leftSpine3;
    private final ModelRenderer rightAppendage1;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer rightAppendage2;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer rightAppendage3;
    private final ModelRenderer cube_r48;
    private final ModelRenderer rightSpine1;
    private final ModelRenderer rightSpine2;
    private final ModelRenderer cube_r49;
    private final ModelRenderer rightSpine3;

    public ModelSkeletonPambdelurion() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 22.25F, -1.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 77, -11.0F, -1.0F, -7.0F, 22, 1, 23, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 27, -11.275F, -1.0F, -29.525F, 23, 1, 23, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 52, -21.275F, -1.0F, -29.525F, 23, 1, 23, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(10.575F, -0.5F, 1.025F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1614F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 91, 77, -9.175F, -0.5F, -8.05F, 9, 1, 8, 0.004F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-21.175F, -0.5F, -5.975F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3011F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.108F, -0.5F, -0.5805F, 23, 1, 25, 0.02F, false));

        this.Pambdelurion = new ModelRenderer(this);
        this.Pambdelurion.setRotationPoint(-2.0F, -0.125F, -0.8F);
        this.bone.addChild(Pambdelurion);
        this.setRotateAngle(Pambdelurion, 0.0F, -0.2618F, -3.1416F);
        this.Pambdelurion.cubeList.add(new ModelBox(Pambdelurion, 91, 87, -4.0F, 0.17F, -4.0F, 8, 1, 8, 0.04F, false));

        this.leftFin4 = new ModelRenderer(this);
        this.leftFin4.setRotationPoint(4.0F, -0.25F, -3.0F);
        this.Pambdelurion.addChild(leftFin4);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1309F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 57, 102, -1.0458F, 0.325F, -1.5128F, 6, 1, 3, 0.0F, false));

        this.rightFin4 = new ModelRenderer(this);
        this.rightFin4.setRotationPoint(-4.0F, -0.25F, -3.0F);
        this.Pambdelurion.addChild(rightFin4);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 76, 102, -4.9542F, 0.325F, -1.5128F, 6, 1, 3, 0.0F, false));

        this.leftFin5 = new ModelRenderer(this);
        this.leftFin5.setRotationPoint(4.0F, -0.25F, -0.25F);
        this.Pambdelurion.addChild(leftFin5);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0873F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 91, 97, -0.6307F, 0.25F, -1.5057F, 6, 1, 3, 0.0F, false));

        this.rightFin5 = new ModelRenderer(this);
        this.rightFin5.setRotationPoint(-4.0F, -0.25F, -0.25F);
        this.Pambdelurion.addChild(rightFin5);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin5.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.0873F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 102, -5.3693F, 0.25F, -1.5057F, 6, 1, 3, 0.0F, false));

        this.leftFin6 = new ModelRenderer(this);
        this.leftFin6.setRotationPoint(4.0F, -0.25F, 2.5F);
        this.Pambdelurion.addChild(leftFin6);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin6.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0436F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 102, -0.5654F, 0.325F, -1.5014F, 6, 1, 3, 0.0F, false));

        this.rightFin6 = new ModelRenderer(this);
        this.rightFin6.setRotationPoint(-4.0F, -0.25F, 2.5F);
        this.Pambdelurion.addChild(rightFin6);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin6.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0433F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 102, -5.4346F, 0.325F, -1.5014F, 6, 1, 3, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Pambdelurion.addChild(tail1);
        this.setRotateAngle(tail1, 0.0F, 0.0873F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 93, 27, -3.5F, 0.1F, -1.0F, 7, 1, 6, 0.03F, false));

        this.leftFin7 = new ModelRenderer(this);
        this.leftFin7.setRotationPoint(3.5F, -0.4F, 1.0F);
        this.tail1.addChild(leftFin7);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin7.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.0436F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 97, 5, -0.3846F, 0.4F, -1.5014F, 6, 1, 3, 0.0F, false));

        this.rightFin7 = new ModelRenderer(this);
        this.rightFin7.setRotationPoint(-3.5F, -0.4F, 1.0F);
        this.tail1.addChild(rightFin7);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin7.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0436F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 97, 15, -5.6154F, 0.4F, -1.5014F, 6, 1, 3, 0.0F, false));

        this.leftFin8 = new ModelRenderer(this);
        this.leftFin8.setRotationPoint(3.5F, -0.35F, 3.5F);
        this.tail1.addChild(leftFin8);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin8.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1309F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 97, 10, -1.3042F, 0.425F, -1.5128F, 6, 1, 3, 0.0F, false));

        this.rightFin8 = new ModelRenderer(this);
        this.rightFin8.setRotationPoint(-3.5F, -0.35F, 3.5F);
        this.tail1.addChild(rightFin8);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin8.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.1309F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 97, 20, -4.6958F, 0.425F, -1.5128F, 6, 1, 3, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, 0.0873F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 97, 0, -3.0F, 0.08F, -1.0F, 6, 1, 3, 0.02F, false));

        this.leftFin9 = new ModelRenderer(this);
        this.leftFin9.setRotationPoint(3.0F, -0.35F, 0.15F);
        this.tail2.addChild(leftFin9);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin9.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.3491F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 104, 107, -0.6917F, 0.35F, -1.3339F, 5, 1, 3, 0.0F, false));

        this.rightFin9 = new ModelRenderer(this);
        this.rightFin9.setRotationPoint(-3.0F, -0.35F, 0.15F);
        this.tail2.addChild(rightFin9);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin9.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.3491F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 110, 97, -4.3083F, 0.35F, -1.3339F, 5, 1, 3, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.0873F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 53, 107, -2.5F, 0.0F, -1.0F, 5, 1, 3, 0.01F, false));

        this.leftFin10 = new ModelRenderer(this);
        this.leftFin10.setRotationPoint(2.5F, -0.35F, 0.8F);
        this.tail3.addChild(leftFin10);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin10.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.3491F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 112, 66, -0.5019F, 0.425F, -1.0261F, 4, 1, 2, 0.0F, false));

        this.rightFin10 = new ModelRenderer(this);
        this.rightFin10.setRotationPoint(-2.5F, -0.35F, 0.8F);
        this.tail3.addChild(rightFin10);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin10.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.3491F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 112, 70, -3.4981F, 0.425F, -1.0261F, 4, 1, 2, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, 0.1745F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 30, 112, -1.5F, 0.0F, -1.5F, 3, 1, 3, -0.01F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 57, 116, -1.0F, 0.0F, 1.0F, 2, 1, 1, -0.01F, false));

        this.leftFin11 = new ModelRenderer(this);
        this.leftFin11.setRotationPoint(1.5F, -0.35F, 0.4F);
        this.tail4.addChild(leftFin11);
        this.setRotateAngle(leftFin11, 0.0F, -0.2182F, 0.0F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin11.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.3927F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 69, 112, -0.7863F, 0.35F, -1.1732F, 4, 1, 2, 0.0F, false));

        this.rightFin11 = new ModelRenderer(this);
        this.rightFin11.setRotationPoint(-1.5F, -0.35F, 0.4F);
        this.tail4.addChild(rightFin11);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin11.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.3927F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 82, 112, -3.2137F, 0.35F, -1.1732F, 4, 1, 2, 0.0F, false));

        this.leftFin12 = new ModelRenderer(this);
        this.leftFin12.setRotationPoint(0.5F, -0.25F, 1.5F);
        this.tail4.addChild(leftFin12);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin12.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.2618F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 116, 19, -0.3709F, 0.25F, -0.0817F, 1, 1, 2, 0.0F, false));

        this.rightFin12 = new ModelRenderer(this);
        this.rightFin12.setRotationPoint(-0.5F, -0.25F, 1.5F);
        this.tail4.addChild(rightFin12);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin12.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.2618F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 116, 23, -0.6291F, 0.25F, -0.0817F, 1, 1, 2, 0.0F, false));

        this.leftLeg11 = new ModelRenderer(this);
        this.leftLeg11.setRotationPoint(1.25F, 1.0F, 0.25F);
        this.tail4.addChild(leftLeg11);


        this.rightLeg11 = new ModelRenderer(this);
        this.rightLeg11.setRotationPoint(-1.25F, 1.0F, 0.25F);
        this.tail4.addChild(rightLeg11);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Pambdelurion.addChild(neck1);
        this.setRotateAngle(neck1, 0.0F, -0.1309F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 93, 35, -3.5F, 0.1F, -4.0F, 7, 1, 5, 0.03F, false));

        this.leftFin2 = new ModelRenderer(this);
        this.leftFin2.setRotationPoint(3.5F, -0.35F, -3.5F);
        this.neck1.addChild(leftFin2);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.3491F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 112, -1.342F, 0.425F, -1.0603F, 5, 1, 2, 0.0F, false));

        this.rightFin2 = new ModelRenderer(this);
        this.rightFin2.setRotationPoint(-3.5F, -0.35F, -3.5F);
        this.neck1.addChild(rightFin2);


        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.3491F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 15, 112, -3.658F, 0.425F, -1.0603F, 5, 1, 2, 0.0F, false));

        this.leftFin3 = new ModelRenderer(this);
        this.leftFin3.setRotationPoint(3.5F, -0.35F, -1.5F);
        this.neck1.addChild(leftFin3);
        this.setRotateAngle(leftFin3, 0.0F, 0.0F, 0.0F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.2182F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 95, 102, -1.3247F, 0.35F, -1.5356F, 6, 1, 3, 0.0F, false));

        this.rightFin3 = new ModelRenderer(this);
        this.rightFin3.setRotationPoint(-3.5F, -0.35F, -1.5F);
        this.neck1.addChild(rightFin3);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.1309F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 107, -4.6753F, 0.35F, -1.5356F, 6, 1, 3, 0.0F, false));

        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(2.5F, 1.0F, -3.15F);
        this.neck1.addChild(leftLeg2);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-2.5F, 1.0F, -3.15F);
        this.neck1.addChild(rightLeg2);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(2.75F, 1.0F, -1.2F);
        this.neck1.addChild(leftLeg3);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-2.75F, 1.0F, -1.2F);
        this.neck1.addChild(rightLeg3);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.0F, -0.0436F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 93, 42, -3.0F, 0.08F, -3.0F, 6, 1, 4, 0.02F, false));

        this.leftFin1 = new ModelRenderer(this);
        this.leftFin1.setRotationPoint(3.0F, -0.45F, -1.5F);
        this.neck2.addChild(leftFin1);


        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin1.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.3927F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 112, 62, -0.9784F, 0.45F, -0.8452F, 4, 1, 2, 0.0F, false));

        this.rightFin1 = new ModelRenderer(this);
        this.rightFin1.setRotationPoint(-3.0F, -0.45F, -1.5F);
        this.neck2.addChild(rightFin1);


        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin1.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.3927F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 95, 112, -3.0216F, 0.45F, -0.8452F, 4, 1, 2, 0.0F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.0F, 1.0F, -1.25F);
        this.neck2.addChild(leftLeg1);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.0F, 1.0F, -1.25F);
        this.neck2.addChild(rightLeg1);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.25F, -3.0F);
        this.neck2.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 112, 74, -2.0F, -0.23F, -4.0F, 4, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 93, 64, -2.5F, -0.25F, -3.0F, 5, 1, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 25, 116, 1.75F, -0.15F, -1.0F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 71, 116, -2.75F, -0.15F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.3512F, 0.75F, -0.8754F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1745F, 2.3998F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 86, 116, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.8514F, 0.75F, -3.5074F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1745F, 0.6545F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 101, 116, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.7026F, 0.75F, -2.2829F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 1.5708F, 0.1745F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 91, 116, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(1.7026F, 0.75F, -2.2829F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -1.5708F, -0.1745F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 81, 116, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(1.3512F, 0.75F, -0.8754F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1745F, -2.3998F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 76, 116, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.8514F, 0.75F, -3.5074F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1745F, -0.6545F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 96, 116, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.05F, 1.725F, -4.0F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.1309F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 43, 116, -1.0F, -1.975F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.15F, 1.725F, -4.0F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.2618F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 50, 116, -1.0F, -1.975F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(1.15F, 1.725F, -4.0F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.2618F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 11, 116, 0.0F, -1.975F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.05F, 1.725F, -4.0F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.1309F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 116, 15, 0.0F, -1.975F, -2.0F, 1, 1, 2, 0.0F, false));

        this.leftAppendage1 = new ModelRenderer(this);
        this.leftAppendage1.setRotationPoint(2.5F, 0.25F, -1.0F);
        this.head.addChild(leftAppendage1);
        this.setRotateAngle(leftAppendage1, 0.0088F, 0.6605F, -0.0016F);
        this.leftAppendage1.cubeList.add(new ModelBox(leftAppendage1, 93, 58, -1.0F, -0.48F, -2.0F, 5, 1, 4, -0.01F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(3.25F, -0.9F, -2.0F);
        this.leftAppendage1.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.2182F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 114, 102, -0.5F, 0.4F, -2.5F, 1, 1, 3, 0.0F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(1.75F, -0.9F, -2.0F);
        this.leftAppendage1.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.2618F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 18, 116, -0.25F, 0.4F, -1.9F, 1, 1, 2, 0.0F, false));

        this.leftAppendage2 = new ModelRenderer(this);
        this.leftAppendage2.setRotationPoint(4.0F, 0.0F, -0.5F);
        this.leftAppendage1.addChild(leftAppendage2);
        this.setRotateAngle(leftAppendage2, 0.0F, 0.3927F, 0.0F);
        this.leftAppendage2.cubeList.add(new ModelBox(leftAppendage2, 70, 107, -1.0F, -0.48F, -1.5F, 5, 1, 3, 0.0F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(2.25F, -0.25F, -1.5F);
        this.leftAppendage2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.3927F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 108, 112, -0.0081F, -0.25F, -3.4946F, 1, 1, 4, 0.0F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.75F, -0.25F, -1.5F);
        this.leftAppendage2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -0.5061F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 116, 5, -0.0111F, -0.25F, -2.9906F, 1, 1, 3, 0.0F, false));

        this.leftAppendage3 = new ModelRenderer(this);
        this.leftAppendage3.setRotationPoint(3.95F, 0.5F, -0.5F);
        this.leftAppendage2.addChild(leftAppendage3);
        this.setRotateAngle(leftAppendage3, 0.0F, 0.2618F, 0.0F);
        this.leftAppendage3.cubeList.add(new ModelBox(leftAppendage3, 43, 112, -1.0F, -0.98F, -1.0F, 4, 1, 2, -0.01F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.2F, -0.75F, -1.0F);
        this.leftAppendage3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, -0.7854F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 114, 48, 0.0F, -0.25F, -4.0F, 1, 1, 4, 0.0F, false));

        this.leftSpine2 = new ModelRenderer(this);
        this.leftSpine2.setRotationPoint(2.45F, -0.6F, -0.5F);
        this.leftAppendage3.addChild(leftSpine2);
        this.setRotateAngle(leftSpine2, 0.0F, 0.6109F, 0.0F);


        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, -0.9F, 2.0F);
        this.leftSpine2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -0.0436F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 19, 107, 0.5F, 0.5F, -4.0F, 5, 1, 3, 0.0F, false));

        this.leftSpine3 = new ModelRenderer(this);
        this.leftSpine3.setRotationPoint(2.95F, -0.5F, 1.0F);
        this.leftAppendage3.addChild(leftSpine3);
        this.setRotateAngle(leftSpine3, 0.0F, 0.3927F, 0.0F);
        this.leftSpine3.cubeList.add(new ModelBox(leftSpine3, 93, 48, 0.0F, -0.5F, -3.0F, 7, 1, 3, 0.0F, false));

        this.rightAppendage1 = new ModelRenderer(this);
        this.rightAppendage1.setRotationPoint(-2.5F, 0.2F, -1.0F);
        this.head.addChild(rightAppendage1);
        this.setRotateAngle(rightAppendage1, 0.0065F, -0.0933F, 0.0091F);
        this.rightAppendage1.cubeList.add(new ModelBox(rightAppendage1, 93, 70, -4.0F, -0.43F, -2.0F, 5, 1, 4, -0.01F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-3.25F, -0.9F, -2.0F);
        this.rightAppendage1.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.2182F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 116, 0, -0.5F, 0.45F, -2.5F, 1, 1, 3, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.75F, -0.9F, -2.0F);
        this.rightAppendage1.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.2618F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 64, 116, -0.75F, 1.45F, -1.9F, 1, 0, 2, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.25F, -0.9F, -2.0F);
        this.rightAppendage1.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.2618F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 114, 54, -1.0F, 0.45F, -1.5F, 1, 1, 2, 0.0F, false));

        this.rightAppendage2 = new ModelRenderer(this);
        this.rightAppendage2.setRotationPoint(-4.0F, 0.0F, -0.5F);
        this.rightAppendage1.addChild(rightAppendage2);
        this.setRotateAngle(rightAppendage2, 0.0F, -0.3927F, 0.0F);
        this.rightAppendage2.cubeList.add(new ModelBox(rightAppendage2, 87, 107, -4.0F, -0.43F, -1.5F, 5, 1, 3, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-2.25F, -0.25F, -1.5F);
        this.rightAppendage2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.3927F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 114, 42, -0.9919F, -0.2F, -3.4946F, 1, 1, 4, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.75F, -0.25F, -1.5F);
        this.rightAppendage2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.5061F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 116, 10, -0.9889F, -0.2F, -2.9906F, 1, 1, 3, 0.0F, false));

        this.rightAppendage3 = new ModelRenderer(this);
        this.rightAppendage3.setRotationPoint(-3.95F, 0.5F, -0.5F);
        this.rightAppendage2.addChild(rightAppendage3);
        this.setRotateAngle(rightAppendage3, 0.0F, -0.3927F, 0.0F);
        this.rightAppendage3.cubeList.add(new ModelBox(rightAppendage3, 56, 112, -3.0F, -0.93F, -1.0F, 4, 1, 2, -0.01F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.2F, -0.75F, -1.0F);
        this.rightAppendage3.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.7854F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 116, -1.0F, -0.2F, -4.0F, 1, 1, 4, 0.0F, false));

        this.rightSpine1 = new ModelRenderer(this);
        this.rightSpine1.setRotationPoint(-1.2F, -0.7F, -0.9F);
        this.rightAppendage3.addChild(rightSpine1);
        this.setRotateAngle(rightSpine1, 0.0F, -0.3927F, 0.0F);
        this.rightSpine1.cubeList.add(new ModelBox(rightSpine1, 112, 58, -4.2701F, -0.25F, -0.9865F, 4, 1, 2, 0.0F, false));

        this.rightSpine2 = new ModelRenderer(this);
        this.rightSpine2.setRotationPoint(-2.45F, -0.6F, -0.5F);
        this.rightAppendage3.addChild(rightSpine2);
        this.setRotateAngle(rightSpine2, 0.0F, -0.2618F, 0.0F);


        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.5F, -0.9F, 2.0F);
        this.rightSpine2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.0436F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 36, 107, -5.5F, 0.55F, -4.0F, 5, 1, 3, 0.0F, false));

        this.rightSpine3 = new ModelRenderer(this);
        this.rightSpine3.setRotationPoint(-2.95F, -0.5F, 1.0F);
        this.rightAppendage3.addChild(rightSpine3);
        this.setRotateAngle(rightSpine3, 0.0F, -0.1745F, 0.0F);
        this.rightSpine3.cubeList.add(new ModelBox(rightSpine3, 93, 53, -7.0F, -0.45F, -3.0F, 7, 1, 3, 0.0F, false));

    }

    public void renderAll(float f) {
        this.bone.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
