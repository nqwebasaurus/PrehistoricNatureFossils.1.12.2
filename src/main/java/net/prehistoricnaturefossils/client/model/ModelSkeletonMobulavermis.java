package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMobulavermis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Head;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer leftFlipper1;
    private final ModelRenderer rightFlipper1;
    private final ModelRenderer leftFlipper2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer rightFlipper2;
    private final ModelRenderer leftAppendage1;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftAppendage2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leftAppendage3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer leftAppendageClaw1;
    private final ModelRenderer leftAppendageClaw2;
    private final ModelRenderer leftAppendageClaw3;
    private final ModelRenderer rightAppendage1;
    private final ModelRenderer cube_r12;
    private final ModelRenderer rightAppendage2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer rightAppendage3;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer rightAppendageClaw1;
    private final ModelRenderer rightAppendageClaw2;
    private final ModelRenderer rightAppendageClaw3;
    private final ModelRenderer body1;
    private final ModelRenderer leftFlipper3;
    private final ModelRenderer rightFlipper3;
    private final ModelRenderer leftFlipper4;
    private final ModelRenderer rightFlipper4;
    private final ModelRenderer leftFlipper5;
    private final ModelRenderer rightFlipper5;
    private final ModelRenderer body2;
    private final ModelRenderer leftFlipper6;
    private final ModelRenderer rightFlipper6;
    private final ModelRenderer leftFlipper7;
    private final ModelRenderer rightFlipper7;
    private final ModelRenderer leftFlipper8;
    private final ModelRenderer rightFlipper8;
    private final ModelRenderer body3;
    private final ModelRenderer leftFlipper9;
    private final ModelRenderer rightFlipper9;
    private final ModelRenderer leftFlipper10;
    private final ModelRenderer rightFlipper10;
    private final ModelRenderer leftFlipper11;
    private final ModelRenderer rightFlipper11;
    private final ModelRenderer leftFlipper12;
    private final ModelRenderer rightFlipper12;
    private final ModelRenderer leftFlipper13;
    private final ModelRenderer rightFlipper13;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;

    public ModelSkeletonMobulavermis() {
        this.textureWidth = 170;
        this.textureHeight = 95;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(5.5F, 22.95F, -1.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(1.5F, 0.0F, -5.0F);
        this.fossil.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -21.0F, 0.05F, -11.0F, 35, 1, 33, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 75, 64, -13.0F, 0.05F, -29.0F, 27, 1, 18, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-21.0F, 1.05F, -11.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 78, 35, 0.0F, -1.0F, -20.0F, 24, 1, 20, 0.005F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(14.0F, 1.05F, 22.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 35, -25.0F, -1.0F, 0.0F, 25, 1, 27, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-21.0F, 0.55F, 22.0F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.3054F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 64, 0.0F, -0.5F, 0.0F, 24, 1, 26, 0.005F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(1.5F, 0.0F, -5.0F);
        this.fossil.addChild(Head);
        this.setRotateAngle(Head, 0.0F, 0.2618F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 39, -1.0F, -0.01F, -5.0F, 2, 0, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 24, 13, -1.0F, -0.04F, -7.0F, 2, 0, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 11, 22, 0.5F, -0.025F, -6.25F, 1, 0, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 11, 18, -1.5F, -0.025F, -6.25F, 1, 0, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 0.5F, -7.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.7854F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 21, -0.6F, -0.475F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.5F, -7.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.7854F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 19, -0.4F, -0.475F, -0.5F, 1, 0, 1, 0.0F, false));

        this.leftFlipper1 = new ModelRenderer(this);
        this.leftFlipper1.setRotationPoint(1.0F, 0.0F, -2.5F);
        this.Head.addChild(leftFlipper1);
        this.leftFlipper1.cubeList.add(new ModelBox(leftFlipper1, 14, 66, -0.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightFlipper1 = new ModelRenderer(this);
        this.rightFlipper1.setRotationPoint(-1.0F, 0.0F, -2.5F);
        this.Head.addChild(rightFlipper1);
        this.rightFlipper1.cubeList.add(new ModelBox(rightFlipper1, 11, 60, -3.5F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leftFlipper2 = new ModelRenderer(this);
        this.leftFlipper2.setRotationPoint(1.0F, 0.0F, -1.0F);
        this.Head.addChild(leftFlipper2);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.25F, 0.0F, 0.0F);
        this.leftFlipper2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.0436F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 75, 73, 0.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.rightFlipper2 = new ModelRenderer(this);
        this.rightFlipper2.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.Head.addChild(rightFlipper2);
        this.rightFlipper2.cubeList.add(new ModelBox(rightFlipper2, 0, 64, -4.25F, 0.025F, -1.0F, 5, 0, 2, 0.0F, false));

        this.leftAppendage1 = new ModelRenderer(this);
        this.leftAppendage1.setRotationPoint(1.0F, -0.2F, -4.0F);
        this.Head.addChild(leftAppendage1);
        this.setRotateAngle(leftAppendage1, 0.0F, 0.48F, 0.0F);
        this.leftAppendage1.cubeList.add(new ModelBox(leftAppendage1, 0, 76, -1.0F, 0.2F, -1.0F, 5, 0, 2, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 0.5F, -1.0F);
        this.leftAppendage1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.2182F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 17, 0.0F, -0.275F, -0.75F, 1, 0, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(2.5F, 0.5F, -1.0F);
        this.leftAppendage1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2182F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 23, 0.0F, -0.275F, -1.0F, 1, 0, 1, 0.0F, false));

        this.leftAppendage2 = new ModelRenderer(this);
        this.leftAppendage2.setRotationPoint(4.0F, 0.0F, 0.5F);
        this.leftAppendage1.addChild(leftAppendage2);
        this.setRotateAngle(leftAppendage2, 0.0F, 0.4363F, 0.0F);
        this.leftAppendage2.cubeList.add(new ModelBox(leftAppendage2, 13, 70, 0.0F, 0.2F, -1.5F, 4, 0, 1, 0.0F, false));
        this.leftAppendage2.cubeList.add(new ModelBox(leftAppendage2, 13, 64, 0.0F, 0.2F, -1.0F, 4, 0, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.5F, -1.25F);
        this.leftAppendage2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.2182F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 8, 0.0F, -0.275F, -1.75F, 1, 0, 2, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(2.0F, 0.5F, -1.25F);
        this.leftAppendage2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.2182F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 11, 0.0F, -0.275F, -2.0F, 1, 0, 2, 0.0F, false));

        this.leftAppendage3 = new ModelRenderer(this);
        this.leftAppendage3.setRotationPoint(4.0F, 0.0F, -0.5F);
        this.leftAppendage2.addChild(leftAppendage3);
        this.setRotateAngle(leftAppendage3, 0.0F, 0.3491F, 0.0F);
        this.leftAppendage3.cubeList.add(new ModelBox(leftAppendage3, 15, 68, 0.0F, 0.19F, -1.0F, 4, 0, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.5F, 0.5F, -1.0F);
        this.leftAppendage3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.2182F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 9, 0.0F, -0.275F, -2.75F, 1, 0, 3, 0.0F, false));

        this.leftAppendageClaw1 = new ModelRenderer(this);
        this.leftAppendageClaw1.setRotationPoint(3.0F, -0.1F, -1.0F);
        this.leftAppendage3.addChild(leftAppendageClaw1);
        this.setRotateAngle(leftAppendageClaw1, 0.0F, 1.0908F, 0.0F);
        this.leftAppendageClaw1.cubeList.add(new ModelBox(leftAppendageClaw1, 13, 52, 0.0F, 0.32F, -1.0F, 4, 0, 2, 0.0F, false));

        this.leftAppendageClaw2 = new ModelRenderer(this);
        this.leftAppendageClaw2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leftAppendage3.addChild(leftAppendageClaw2);
        this.setRotateAngle(leftAppendageClaw2, 0.0F, 0.48F, 0.0F);
        this.leftAppendageClaw2.cubeList.add(new ModelBox(leftAppendageClaw2, 0, 35, 0.0F, 0.23F, -3.0F, 6, 0, 3, 0.0F, false));

        this.leftAppendageClaw3 = new ModelRenderer(this);
        this.leftAppendageClaw3.setRotationPoint(4.0F, 0.0F, -0.5F);
        this.leftAppendage3.addChild(leftAppendageClaw3);
        this.setRotateAngle(leftAppendageClaw3, 0.0F, -0.1309F, 0.0F);
        this.leftAppendageClaw3.cubeList.add(new ModelBox(leftAppendageClaw3, 0, 4, -1.0F, 0.24F, -0.5F, 10, 0, 3, 0.0F, false));

        this.rightAppendage1 = new ModelRenderer(this);
        this.rightAppendage1.setRotationPoint(-1.0F, -0.25F, -4.0F);
        this.Head.addChild(rightAppendage1);
        this.setRotateAngle(rightAppendage1, 0.0F, -0.48F, 0.0F);
        this.rightAppendage1.cubeList.add(new ModelBox(rightAppendage1, 0, 30, -4.0F, 0.25F, -1.0F, 5, 0, 2, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 0.5F, -1.0F);
        this.rightAppendage1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2182F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 14, -1.0F, -0.225F, -0.75F, 1, 0, 1, 0.0F, false));

        this.rightAppendage2 = new ModelRenderer(this);
        this.rightAppendage2.setRotationPoint(-4.0F, 0.0F, 0.5F);
        this.rightAppendage1.addChild(rightAppendage2);
        this.setRotateAngle(rightAppendage2, 0.0F, -0.4363F, 0.0F);
        this.rightAppendage2.cubeList.add(new ModelBox(rightAppendage2, 0, 60, -4.0F, 0.25F, -1.5F, 4, 0, 1, 0.0F, false));
        this.rightAppendage2.cubeList.add(new ModelBox(rightAppendage2, 15, 58, -4.0F, 0.14F, -1.0F, 4, 0, 1, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.5F, -1.25F);
        this.rightAppendage2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.2182F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 8, -1.0F, -0.225F, -1.75F, 1, 0, 2, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.0F, 0.5F, -1.25F);
        this.rightAppendage2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.2182F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 11, -1.0F, -0.225F, -2.0F, 1, 0, 2, 0.0F, false));

        this.rightAppendage3 = new ModelRenderer(this);
        this.rightAppendage3.setRotationPoint(-4.0F, 0.0F, -0.5F);
        this.rightAppendage2.addChild(rightAppendage3);
        this.setRotateAngle(rightAppendage3, 0.0F, -0.3491F, 0.0F);
        this.rightAppendage3.cubeList.add(new ModelBox(rightAppendage3, 16, 35, -4.0F, 0.24F, -1.0F, 4, 0, 1, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, 0.5F, -1.0F);
        this.rightAppendage3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.2182F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 1, -1.0F, -0.225F, -2.75F, 1, 0, 3, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.rightAppendage3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.2182F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 5, -1.0F, -0.225F, -2.25F, 1, 0, 3, 0.0F, false));

        this.rightAppendageClaw1 = new ModelRenderer(this);
        this.rightAppendageClaw1.setRotationPoint(-3.0F, -0.1F, -1.0F);
        this.rightAppendage3.addChild(rightAppendageClaw1);
        this.setRotateAngle(rightAppendageClaw1, 0.0F, -1.0908F, 0.0F);
        this.rightAppendageClaw1.cubeList.add(new ModelBox(rightAppendageClaw1, 13, 43, -4.0F, 0.37F, -1.0F, 4, 0, 2, 0.0F, false));

        this.rightAppendageClaw2 = new ModelRenderer(this);
        this.rightAppendageClaw2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.rightAppendage3.addChild(rightAppendageClaw2);
        this.setRotateAngle(rightAppendageClaw2, 0.0F, -0.48F, 0.0F);
        this.rightAppendageClaw2.cubeList.add(new ModelBox(rightAppendageClaw2, 0, 26, -6.0F, 0.28F, -3.0F, 6, 0, 3, 0.0F, false));

        this.rightAppendageClaw3 = new ModelRenderer(this);
        this.rightAppendageClaw3.setRotationPoint(-4.0F, 0.0F, -0.5F);
        this.rightAppendage3.addChild(rightAppendageClaw3);
        this.setRotateAngle(rightAppendageClaw3, 0.0F, 0.1309F, 0.0F);
        this.rightAppendageClaw3.cubeList.add(new ModelBox(rightAppendageClaw3, 0, 0, -9.0F, 0.27F, -0.5F, 10, 0, 3, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(body1);
        this.setRotateAngle(body1, 0.0F, -0.0873F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 13, 25, -1.5F, -0.01F, 0.0F, 3, 0, 6, 0.0F, false));

        this.leftFlipper3 = new ModelRenderer(this);
        this.leftFlipper3.setRotationPoint(1.5F, 0.0F, 1.0F);
        this.body1.addChild(leftFlipper3);
        this.leftFlipper3.cubeList.add(new ModelBox(leftFlipper3, 75, 70, -0.75F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));
        this.leftFlipper3.cubeList.add(new ModelBox(leftFlipper3, 75, 70, -7.25F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        this.rightFlipper3 = new ModelRenderer(this);
        this.rightFlipper3.setRotationPoint(-1.5F, 0.0F, 1.0F);
        this.body1.addChild(rightFlipper3);


        this.leftFlipper4 = new ModelRenderer(this);
        this.leftFlipper4.setRotationPoint(1.5F, 0.0F, 3.0F);
        this.body1.addChild(leftFlipper4);
        this.leftFlipper4.cubeList.add(new ModelBox(leftFlipper4, 75, 67, -0.5F, 0.025F, -1.0F, 5, 0, 2, 0.0F, false));

        this.rightFlipper4 = new ModelRenderer(this);
        this.rightFlipper4.setRotationPoint(-1.5F, 0.0F, 3.0F);
        this.body1.addChild(rightFlipper4);
        this.rightFlipper4.cubeList.add(new ModelBox(rightFlipper4, 0, 57, -4.5F, 0.025F, -1.0F, 5, 0, 2, 0.0F, false));

        this.leftFlipper5 = new ModelRenderer(this);
        this.leftFlipper5.setRotationPoint(1.5F, 0.0F, 5.0F);
        this.body1.addChild(leftFlipper5);
        this.setRotateAngle(leftFlipper5, 0.0F, -0.0436F, 0.0F);
        this.leftFlipper5.cubeList.add(new ModelBox(leftFlipper5, 0, 54, -0.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.rightFlipper5 = new ModelRenderer(this);
        this.rightFlipper5.setRotationPoint(-1.5F, 0.0F, 5.0F);
        this.body1.addChild(rightFlipper5);
        this.rightFlipper5.cubeList.add(new ModelBox(rightFlipper5, 0, 54, -4.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -0.0873F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 11, 18, -1.5F, -0.01F, 0.0F, 3, 0, 6, 0.0F, false));

        this.leftFlipper6 = new ModelRenderer(this);
        this.leftFlipper6.setRotationPoint(1.5F, 0.0F, 1.0F);
        this.body2.addChild(leftFlipper6);
        this.leftFlipper6.cubeList.add(new ModelBox(leftFlipper6, 75, 64, -0.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.rightFlipper6 = new ModelRenderer(this);
        this.rightFlipper6.setRotationPoint(-1.5F, 0.0F, 1.0F);
        this.body2.addChild(rightFlipper6);
        this.rightFlipper6.cubeList.add(new ModelBox(rightFlipper6, 0, 51, -4.5F, 0.025F, -1.0F, 5, 0, 2, 0.0F, false));

        this.leftFlipper7 = new ModelRenderer(this);
        this.leftFlipper7.setRotationPoint(1.5F, 0.0F, 3.0F);
        this.body2.addChild(leftFlipper7);
        this.setRotateAngle(leftFlipper7, 0.0F, -0.0436F, 0.0F);
        this.leftFlipper7.cubeList.add(new ModelBox(leftFlipper7, 0, 73, -0.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.rightFlipper7 = new ModelRenderer(this);
        this.rightFlipper7.setRotationPoint(-1.5F, 0.0F, 3.0F);
        this.body2.addChild(rightFlipper7);
        this.rightFlipper7.cubeList.add(new ModelBox(rightFlipper7, 0, 48, -4.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.leftFlipper8 = new ModelRenderer(this);
        this.leftFlipper8.setRotationPoint(1.5F, 0.0F, 5.0F);
        this.body2.addChild(leftFlipper8);
        this.setRotateAngle(leftFlipper8, 0.0F, -0.1309F, 0.0F);
        this.leftFlipper8.cubeList.add(new ModelBox(leftFlipper8, 0, 70, -0.75F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.rightFlipper8 = new ModelRenderer(this);
        this.rightFlipper8.setRotationPoint(-1.5F, 0.0F, 5.0F);
        this.body2.addChild(rightFlipper8);
        this.rightFlipper8.cubeList.add(new ModelBox(rightFlipper8, 0, 45, -4.25F, 0.025F, -1.0F, 5, 0, 2, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, -0.1309F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 8, -1.0F, -0.01F, 0.0F, 2, 0, 8, 0.0F, false));

        this.leftFlipper9 = new ModelRenderer(this);
        this.leftFlipper9.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.body3.addChild(leftFlipper9);
        this.leftFlipper9.cubeList.add(new ModelBox(leftFlipper9, 0, 67, -0.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.rightFlipper9 = new ModelRenderer(this);
        this.rightFlipper9.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.body3.addChild(rightFlipper9);
        this.rightFlipper9.cubeList.add(new ModelBox(rightFlipper9, 10, 39, -4.5F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.leftFlipper10 = new ModelRenderer(this);
        this.leftFlipper10.setRotationPoint(1.0F, 0.0F, 3.0F);
        this.body3.addChild(leftFlipper10);
        this.leftFlipper10.cubeList.add(new ModelBox(leftFlipper10, 13, 49, 0.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, true));

        this.rightFlipper10 = new ModelRenderer(this);
        this.rightFlipper10.setRotationPoint(-1.0F, 0.0F, 3.0F);
        this.body3.addChild(rightFlipper10);
        this.rightFlipper10.cubeList.add(new ModelBox(rightFlipper10, 13, 49, -4.0F, 0.025F, -1.0F, 4, 0, 2, 0.0F, false));

        this.leftFlipper11 = new ModelRenderer(this);
        this.leftFlipper11.setRotationPoint(1.0F, 0.0F, 5.0F);
        this.body3.addChild(leftFlipper11);
        this.leftFlipper11.cubeList.add(new ModelBox(leftFlipper11, 13, 55, -0.75F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.rightFlipper11 = new ModelRenderer(this);
        this.rightFlipper11.setRotationPoint(-1.0F, 0.0F, 5.0F);
        this.body3.addChild(rightFlipper11);
        this.rightFlipper11.cubeList.add(new ModelBox(rightFlipper11, 13, 46, -3.25F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.leftFlipper12 = new ModelRenderer(this);
        this.leftFlipper12.setRotationPoint(1.0F, 0.0F, 6.5F);
        this.body3.addChild(leftFlipper12);
        this.leftFlipper12.cubeList.add(new ModelBox(leftFlipper12, 24, 20, -0.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightFlipper12 = new ModelRenderer(this);
        this.rightFlipper12.setRotationPoint(-1.0F, 0.0F, 6.5F);
        this.body3.addChild(rightFlipper12);
        this.rightFlipper12.cubeList.add(new ModelBox(rightFlipper12, 24, 18, -2.25F, 0.025F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leftFlipper13 = new ModelRenderer(this);
        this.leftFlipper13.setRotationPoint(1.0F, 0.0F, 7.5F);
        this.body3.addChild(leftFlipper13);
        this.leftFlipper13.cubeList.add(new ModelBox(leftFlipper13, 11, 20, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightFlipper13 = new ModelRenderer(this);
        this.rightFlipper13.setRotationPoint(-1.0F, 0.0F, 7.5F);
        this.body3.addChild(rightFlipper13);
        this.rightFlipper13.cubeList.add(new ModelBox(rightFlipper13, 13, 14, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body3.addChild(tail1);
        this.setRotateAngle(tail1, 0.0F, -0.1309F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 17, -0.5F, -0.01F, 0.0F, 1, 0, 8, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, -0.1309F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 9, -0.5F, -0.01F, 0.0F, 1, 0, 8, 0.0F, false));

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
