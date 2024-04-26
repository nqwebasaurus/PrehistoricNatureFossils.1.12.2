package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMecochirus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer eyeL;
    private final ModelRenderer cube_r7;
    private final ModelRenderer antennaR;
    private final ModelRenderer antennaL;
    private final ModelRenderer antennaR2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer antennaL2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer armR;
    private final ModelRenderer cube_r10;
    private final ModelRenderer armR2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer armR3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer armR4;
    private final ModelRenderer cube_r14;
    private final ModelRenderer armL;
    private final ModelRenderer cube_r15;
    private final ModelRenderer armL2;
    private final ModelRenderer cube_r16;
    private final ModelRenderer armL3;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer armL4;
    private final ModelRenderer cube_r19;
    private final ModelRenderer legR;
    private final ModelRenderer cube_r20;
    private final ModelRenderer legL;
    private final ModelRenderer cube_r21;
    private final ModelRenderer legR2;
    private final ModelRenderer cube_r22;
    private final ModelRenderer legL2;
    private final ModelRenderer cube_r23;
    private final ModelRenderer legR3;
    private final ModelRenderer cube_r24;
    private final ModelRenderer legL3;
    private final ModelRenderer cube_r25;
    private final ModelRenderer legR4;
    private final ModelRenderer cube_r26;
    private final ModelRenderer legL4;
    private final ModelRenderer cube_r27;
    private final ModelRenderer body1;
    private final ModelRenderer cube_r28;
    private final ModelRenderer pleopodR;
    private final ModelRenderer pleopodL;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r29;
    private final ModelRenderer pleopodR2;
    private final ModelRenderer pleopodL2;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r30;
    private final ModelRenderer pleopodR3;
    private final ModelRenderer pleopodL3;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer pleopodR4;
    private final ModelRenderer pleopodL4;
    private final ModelRenderer body5;
    private final ModelRenderer cube_r33;
    private final ModelRenderer body6;
    private final ModelRenderer cube_r34;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r35;
    private final ModelRenderer tailfanL;
    private final ModelRenderer tailfanL2;

    public ModelSkeletonMecochirus() {
        this.textureWidth = 144;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(1.0F, 24.0F, 13.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 66, -20.0F, -2.0F, -35.0F, 33, 2, 19, -0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-8.6F, 0.0F, 12.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.9199F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.1829F, -2.0F, -0.2312F, 23, 2, 30, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-20.0F, 0.0F, -16.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3927F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 33, 0.0F, -2.0F, 0.0F, 21, 2, 30, 0.004F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -1.45F, 0.0F);
        this.fossil.addChild(bone);
        this.setRotateAngle(bone, 0.0F, 0.0F, -1.5708F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, -5.5F, -7.5F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -3.1416F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 14, 0.3F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, -5.0F, -6.5F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -3.1416F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.3F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, -4.5F, -5.5F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -3.1416F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 23, 0.3F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, -4.0F, -3.0F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.3F, -2.0F, -2.0F, 0, 4, 4, 0.0F, false));

        this.eyeL = new ModelRenderer(this);
        this.eyeL.setRotationPoint(0.6F, -4.9F, -7.0F);
        this.bone.addChild(eyeL);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.85F, 0.0F, -0.5F);
        this.eyeL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 3, 9, 0.2F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.antennaR = new ModelRenderer(this);
        this.antennaR.setRotationPoint(0.65F, -9.3602F, -19.0667F);
        this.bone.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.1309F, 0.0F, -3.1416F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 82, 8, 0.0F, -3.0F, -12.5F, 0, 6, 25, 0.0F, false));

        this.antennaL = new ModelRenderer(this);
        this.antennaL.setRotationPoint(0.85F, -5.3432F, -7.5918F);
        this.bone.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.3491F, 0.0F, -3.1416F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 80, 63, 0.0F, -0.3597F, -24.4176F, 0, 6, 25, 0.0F, false));

        this.antennaR2 = new ModelRenderer(this);
        this.antennaR2.setRotationPoint(1.175F, -5.25F, -7.0F);
        this.bone.addChild(antennaR2);
        this.setRotateAngle(antennaR2, -0.3054F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.antennaR2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -3.1416F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 33, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.antennaL2 = new ModelRenderer(this);
        this.antennaL2.setRotationPoint(1.425F, -5.25F, -7.0F);
        this.bone.addChild(antennaL2);
        this.setRotateAngle(antennaL2, -0.5236F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.antennaL2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 14, 0.4F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.armR = new ModelRenderer(this);
        this.armR.setRotationPoint(0.8F, -2.75F, -4.5F);
        this.bone.addChild(armR);
        this.setRotateAngle(armR, -0.2618F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.1F, 0.0F, -5.5F);
        this.armR.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 77, 0, 0.0F, -0.5F, -5.5F, 0, 1, 11, 0.0F, false));

        this.armR2 = new ModelRenderer(this);
        this.armR2.setRotationPoint(0.0F, -0.1F, -10.6F);
        this.armR.addChild(armR2);
        this.setRotateAngle(armR2, 0.3491F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.armR2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 33, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.armR3 = new ModelRenderer(this);
        this.armR3.setRotationPoint(0.0F, -0.025F, -2.75F);
        this.armR2.addChild(armR3);
        this.setRotateAngle(armR3, 0.1309F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.1F, -0.2094F, -5.9963F);
        this.armR3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0349F, 0.0F, -3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 33, 0.0F, -0.5F, -6.0F, 0, 1, 12, 0.01F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.1F, 0.2617F, -5.9943F);
        this.armR3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0436F, 0.0F, -3.1416F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 47, 0.0F, -0.5F, -6.0F, 0, 1, 12, 0.0F, false));

        this.armR4 = new ModelRenderer(this);
        this.armR4.setRotationPoint(-0.5F, 0.0F, -12.0F);
        this.armR3.addChild(armR4);
        this.setRotateAngle(armR4, 0.6981F, 0.0F, 0.0F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.0952F, -3.0052F);
        this.armR4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0349F, 0.0F, -3.1416F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 14, 0.0F, -1.0F, -3.5F, 0, 2, 7, 0.0F, false));

        this.armL = new ModelRenderer(this);
        this.armL.setRotationPoint(1.6F, -2.75F, -4.5F);
        this.bone.addChild(armL);
        this.setRotateAngle(armL, -0.0436F, 0.0F, 0.0F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.0F, -5.5F);
        this.armL.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -3.1416F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 73, 40, 0.0F, -0.5F, -5.5F, 0, 1, 11, 0.0F, false));

        this.armL2 = new ModelRenderer(this);
        this.armL2.setRotationPoint(0.0F, -0.1F, -10.6F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 0.3535F, 0.0F, 0.0F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.6F, 0.0F, -1.5F);
        this.armL2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 21, 0, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.armL3 = new ModelRenderer(this);
        this.armL3.setRotationPoint(0.0F, -0.025F, -2.75F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, 0.3927F, 0.0F, 0.0F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -0.2094F, -5.9963F);
        this.armL3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0349F, 0.0F, -3.1416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0F, -0.5F, -6.0F, 0, 1, 12, 0.01F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.2617F, -5.9943F);
        this.armL3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, -3.1416F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 14, 0.0F, -0.5F, -6.0F, 0, 1, 12, 0.0F, false));

        this.armL4 = new ModelRenderer(this);
        this.armL4.setRotationPoint(0.5F, 0.0F, -12.0F);
        this.armL3.addChild(armL4);
        this.setRotateAngle(armL4, 0.9163F, 0.0F, 0.0F);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.0952F, -3.0052F);
        this.armL4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0349F, 0.0F, -3.1416F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 0, 0.3F, -1.0F, -3.5F, 0, 2, 7, 0.0F, false));

        this.legR = new ModelRenderer(this);
        this.legR.setRotationPoint(1.05F, -3.0F, -5.0F);
        this.bone.addChild(legR);
        this.setRotateAngle(legR, -0.1309F, 0.0F, 0.0F);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.25F, -4.5F);
        this.legR.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -3.1416F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 77, 13, 0.0F, -2.0F, -4.5F, 0, 4, 9, 0.0F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(1.25F, -3.0F, -5.0F);
        this.bone.addChild(legL);
        this.setRotateAngle(legL, 0.48F, 0.0F, 0.0F);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.1F, 1.25F, -4.5F);
        this.legL.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -3.1416F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 66, 0.4F, -2.0F, -4.5F, 0, 4, 9, 0.0F, false));

        this.legR2 = new ModelRenderer(this);
        this.legR2.setRotationPoint(1.0F, -2.25F, -4.0F);
        this.bone.addChild(legR2);
        this.setRotateAngle(legR2, 0.1745F, 0.0F, 0.0F);


        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.legR2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -3.1416F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 85, 40, 0.0F, -1.5F, -3.0F, 0, 3, 6, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(1.5F, -2.25F, -4.0F);
        this.bone.addChild(legL2);
        this.setRotateAngle(legL2, 1.7453F, 0.0F, 0.0F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.1F, -0.25F, -3.0F);
        this.legL2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -3.1416F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 13, 47, 0.4F, -1.5F, -3.0F, 0, 3, 6, 0.0F, false));

        this.legR3 = new ModelRenderer(this);
        this.legR3.setRotationPoint(0.9F, -2.25F, -3.0F);
        this.bone.addChild(legR3);
        this.setRotateAngle(legR3, 0.48F, 0.0F, 0.0F);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.legR3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -3.1416F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 73, 53, 0.1F, -1.5F, -3.0F, 0, 3, 6, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(1.5F, -2.25F, -3.0F);
        this.bone.addChild(legL3);
        this.setRotateAngle(legL3, 0.7418F, 0.0F, 0.0F);


        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.2F, -0.25F, -3.0F);
        this.legL3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -3.1416F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 13, 33, 0.4F, -1.5F, -3.0F, 0, 3, 6, 0.0F, false));

        this.legR4 = new ModelRenderer(this);
        this.legR4.setRotationPoint(0.7F, -2.25F, -2.0F);
        this.bone.addChild(legR4);
        this.setRotateAngle(legR4, 0.829F, 0.0F, 0.0F);


        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.25F, -1.5F);
        this.legR4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -3.1416F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 13, 14, 0.0F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(1.5F, -2.25F, -2.0F);
        this.bone.addChild(legL4);
        this.setRotateAngle(legL4, 1.789F, 0.0F, 0.0F);


        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.2F, -0.25F, -1.5F);
        this.legL4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -3.1416F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 13, 0, 0.4F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(-0.4F, -5.9F, -1.5F);
        this.bone.addChild(body1);
        this.setRotateAngle(body1, 0.1309F, 0.0F, 0.0F);


        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(1.4F, 1.25F, 0.75F);
        this.body1.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -3.1416F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 9, 3, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.pleopodR = new ModelRenderer(this);
        this.pleopodR.setRotationPoint(1.3F, 2.4F, 1.9F);
        this.body1.addChild(pleopodR);
        this.setRotateAngle(pleopodR, 0.0F, -1.5708F, 0.0F);
        this.pleopodR.cubeList.add(new ModelBox(pleopodR, 21, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodL = new ModelRenderer(this);
        this.pleopodL.setRotationPoint(1.4F, 2.6F, 2.1F);
        this.body1.addChild(pleopodL);
        this.setRotateAngle(pleopodL, 1.5708F, -0.8727F, -1.5708F);
        this.pleopodL.cubeList.add(new ModelBox(pleopodL, 8, 14, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.25F, 1.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, 0.1745F, 0.0F, 0.0F);


        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(1.6F, 1.25F, 1.0F);
        this.body2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, -3.1416F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 7, 33, -0.1F, -1.5F, -1.0F, 0, 3, 2, 0.0F, false));

        this.pleopodR2 = new ModelRenderer(this);
        this.pleopodR2.setRotationPoint(1.3F, 2.75F, 2.25F);
        this.body2.addChild(pleopodR2);
        this.setRotateAngle(pleopodR2, 1.5708F, -0.8727F, -1.5708F);
        this.pleopodR2.cubeList.add(new ModelBox(pleopodR2, 13, 14, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodL2 = new ModelRenderer(this);
        this.pleopodL2.setRotationPoint(1.4F, 2.75F, 2.25F);
        this.body2.addChild(pleopodL2);
        this.setRotateAngle(pleopodL2, 1.5708F, -1.2654F, -1.5708F);
        this.pleopodL2.cubeList.add(new ModelBox(pleopodL2, 0, 9, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.2F, 1.9F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(1.6F, 1.5F, 0.75F);
        this.body3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -3.1416F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 25, 10, 0.0F, -1.5F, -1.0F, 0, 3, 2, 0.0F, false));

        this.pleopodR3 = new ModelRenderer(this);
        this.pleopodR3.setRotationPoint(1.1F, 2.7F, 2.35F);
        this.body3.addChild(pleopodR3);
        this.setRotateAngle(pleopodR3, -1.5708F, -1.309F, 1.5708F);
        this.pleopodR3.cubeList.add(new ModelBox(pleopodR3, 8, 18, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodL3 = new ModelRenderer(this);
        this.pleopodL3.setRotationPoint(1.3F, 2.7F, 2.35F);
        this.body3.addChild(pleopodL3);
        this.setRotateAngle(pleopodL3, 1.5708F, -1.2654F, -1.5708F);
        this.pleopodL3.cubeList.add(new ModelBox(pleopodL3, 17, 0, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, 1.75F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.2618F, 0.0F, 0.0F);


        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(1.5F, 1.85F, 1.0F);
        this.body4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -3.1416F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 5, 0, 0.1F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(1.5F, 0.9F, 1.0F);
        this.body4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, -3.1416F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 7, 7, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.pleopodR4 = new ModelRenderer(this);
        this.pleopodR4.setRotationPoint(-0.5F, 2.2F, 2.35F);
        this.body4.addChild(pleopodR4);
        this.setRotateAngle(pleopodR4, 0.0F, 0.3491F, 0.2182F);
        this.pleopodR4.cubeList.add(new ModelBox(pleopodR4, 0, 18, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodL4 = new ModelRenderer(this);
        this.pleopodL4.setRotationPoint(0.5F, 2.2F, 2.35F);
        this.body4.addChild(pleopodL4);
        this.setRotateAngle(pleopodL4, 0.0F, -0.3491F, -0.2182F);
        this.pleopodL4.cubeList.add(new ModelBox(pleopodL4, 17, 14, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 2.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.4363F, 0.0F, 0.0F);


        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(1.4F, 1.0F, 0.5F);
        this.body5.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, -3.1416F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 13, 33, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(-0.1F, 0.25F, 1.5F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, -0.3491F, 0.0F, 0.0F);


        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(1.4F, 0.5F, 0.5F);
        this.body6.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, -3.1416F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 13, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body6.addChild(tail2);
        this.setRotateAngle(tail2, -0.5236F, 0.0F, 0.0F);


        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(1.31F, 0.45F, 1.5F);
        this.tail2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, -3.1416F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 22, 25, -0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.tailfanL = new ModelRenderer(this);
        this.tailfanL.setRotationPoint(1.35F, 0.25F, 0.0F);
        this.tail2.addChild(tailfanL);
        this.setRotateAngle(tailfanL, 0.0F, 0.1309F, 1.5708F);
        this.tailfanL.cubeList.add(new ModelBox(tailfanL, 0, 14, -0.29F, -0.1F, 0.0F, 2, 0, 3, 0.0F, false));

        this.tailfanL2 = new ModelRenderer(this);
        this.tailfanL2.setRotationPoint(1.25F, 0.25F, 0.0F);
        this.tail2.addChild(tailfanL2);
        this.setRotateAngle(tailfanL2, 0.02F, 0.4325F, 1.5202F);
        this.tailfanL2.cubeList.add(new ModelBox(tailfanL2, 0, 18, -0.2854F, -0.0998F, 0.0041F, 2, 0, 3, 0.0F, false));

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
