package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHadranax extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer head;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer leftAppendage1;
    private final ModelRenderer leftClaw1;
    private final ModelRenderer LeftAppendage2;
    private final ModelRenderer leftClaw2;
    private final ModelRenderer LeftAppendage3;
    private final ModelRenderer leftClaw3;
    private final ModelRenderer leftClaw4;
    private final ModelRenderer rightAppendage1;
    private final ModelRenderer rightClaw1;
    private final ModelRenderer RightAppendage2;
    private final ModelRenderer rightClaw2;
    private final ModelRenderer RightAppendage3;
    private final ModelRenderer rightClaw3;
    private final ModelRenderer rightClaw4;
    private final ModelRenderer RightAppendage4;
    private final ModelRenderer rightClaw5;
    private final ModelRenderer RightAppendage5;
    private final ModelRenderer rightClaw6;
    private final ModelRenderer rightClaw7;
    private final ModelRenderer body1;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer leftLeg6;
    private final ModelRenderer rightLeg6;
    private final ModelRenderer body2;
    private final ModelRenderer leftLeg7;
    private final ModelRenderer rightLeg7;
    private final ModelRenderer leftLeg8;
    private final ModelRenderer rightLeg8;
    private final ModelRenderer leftLeg9;
    private final ModelRenderer rightLeg9;
    private final ModelRenderer leftLeg10;
    private final ModelRenderer rightLeg10;
    private final ModelRenderer leftLeg11;
    private final ModelRenderer rightLeg11;
    private final ModelRenderer body3;
    private final ModelRenderer leftLeg12;
    private final ModelRenderer rightLeg12;
    private final ModelRenderer leftLeg13;
    private final ModelRenderer rightLeg13;
    private final ModelRenderer leftLeg14;
    private final ModelRenderer rightLeg14;
    private final ModelRenderer leftLeg15;
    private final ModelRenderer rightLeg15;
    private final ModelRenderer tail;
    private final ModelRenderer leftLeg16;
    private final ModelRenderer rightLeg16;
    private final ModelRenderer leftLeg17;
    private final ModelRenderer rightLeg17;

    public ModelSkeletonHadranax() {
        this.textureWidth = 160;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(2.0F, 24.0F, 8.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 30, -1.0F, -2.0F, -32.0F, 12, 2, 33, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-11.0F, 0.0F, 1.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.5272F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 58, 30, -12.2963F, -2.0F, -22.1195F, 27, 2, 22, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.0F, -32.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.9599F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, -2.0F, 0.0F, 21, 2, 27, 0.003F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -3.3F, -9.25F);
        this.fossil.addChild(head);
        this.setRotateAngle(head, 0.0F, 0.3927F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 38, -1.0F, 1.0F, -5.75F, 2, 0, 6, 0.0F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.0F, 1.6F, -1.75F);
        this.head.addChild(leftLeg1);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 59, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.0F, 1.6F, -1.75F);
        this.head.addChild(rightLeg1);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 22, 51, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.0F, 1.6F, -0.5F);
        this.head.addChild(leftLeg2);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 58, 57, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.0F, 1.6F, -0.5F);
        this.head.addChild(rightLeg2);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 11, 51, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leftAppendage1 = new ModelRenderer(this);
        this.leftAppendage1.setRotationPoint(1.0F, 2.0F, -2.75F);
        this.head.addChild(leftAppendage1);
        this.setRotateAngle(leftAppendage1, 0.0F, 0.3054F, 0.0F);
        this.leftAppendage1.cubeList.add(new ModelBox(leftAppendage1, 22, 55, 0.0F, -1.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.leftClaw1 = new ModelRenderer(this);
        this.leftClaw1.setRotationPoint(3.0F, 0.0F, -1.0F);
        this.leftAppendage1.addChild(leftClaw1);
        this.setRotateAngle(leftClaw1, 0.0F, -0.6981F, 0.0F);
        this.leftClaw1.cubeList.add(new ModelBox(leftClaw1, 15, 4, -1.0F, -1.0F, -3.0F, 2, 0, 3, 0.0F, false));

        this.LeftAppendage2 = new ModelRenderer(this);
        this.LeftAppendage2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leftAppendage1.addChild(LeftAppendage2);
        this.setRotateAngle(LeftAppendage2, 0.0F, 0.3927F, 0.0F);
        this.LeftAppendage2.cubeList.add(new ModelBox(LeftAppendage2, 11, 55, 0.0F, -1.0F, -1.0F, 4, 0, 1, 0.01F, false));

        this.leftClaw2 = new ModelRenderer(this);
        this.leftClaw2.setRotationPoint(3.0F, 0.0F, -1.0F);
        this.LeftAppendage2.addChild(leftClaw2);
        this.setRotateAngle(leftClaw2, 0.0F, -0.5672F, 0.0F);
        this.leftClaw2.cubeList.add(new ModelBox(leftClaw2, 14, 17, -1.0F, -1.0F, -4.0F, 2, 0, 4, 0.0F, false));

        this.LeftAppendage3 = new ModelRenderer(this);
        this.LeftAppendage3.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.LeftAppendage2.addChild(LeftAppendage3);
        this.setRotateAngle(LeftAppendage3, 0.0F, 0.3054F, 0.0F);
        this.LeftAppendage3.cubeList.add(new ModelBox(LeftAppendage3, 0, 55, 0.0F, -1.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.leftClaw3 = new ModelRenderer(this);
        this.leftClaw3.setRotationPoint(3.0F, 0.0F, -1.0F);
        this.LeftAppendage3.addChild(leftClaw3);
        this.setRotateAngle(leftClaw3, 0.0F, -0.9163F, 0.0F);
        this.leftClaw3.cubeList.add(new ModelBox(leftClaw3, 17, 39, -1.0F, -1.0F, -5.0F, 2, 0, 5, 0.0F, false));

        this.leftClaw4 = new ModelRenderer(this);
        this.leftClaw4.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.LeftAppendage3.addChild(leftClaw4);
        this.setRotateAngle(leftClaw4, 0.0F, 0.1309F, 0.0F);
        this.leftClaw4.cubeList.add(new ModelBox(leftClaw4, 0, 34, 0.0F, -1.01F, -3.0F, 8, 0, 3, 0.0F, false));

        this.rightAppendage1 = new ModelRenderer(this);
        this.rightAppendage1.setRotationPoint(-1.0F, 2.0F, -2.75F);
        this.head.addChild(rightAppendage1);
        this.setRotateAngle(rightAppendage1, 0.0F, -0.0436F, 0.0F);
        this.rightAppendage1.cubeList.add(new ModelBox(rightAppendage1, 22, 53, -4.0F, -1.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.rightClaw1 = new ModelRenderer(this);
        this.rightClaw1.setRotationPoint(-3.0F, 0.0F, -1.0F);
        this.rightAppendage1.addChild(rightClaw1);
        this.setRotateAngle(rightClaw1, 0.0F, 0.6981F, 0.0F);
        this.rightClaw1.cubeList.add(new ModelBox(rightClaw1, 15, 0, -1.0F, -1.0F, -3.0F, 2, 0, 3, 0.0F, false));

        this.RightAppendage2 = new ModelRenderer(this);
        this.RightAppendage2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.rightAppendage1.addChild(RightAppendage2);
        this.setRotateAngle(RightAppendage2, 0.0F, -0.3927F, 0.0F);
        this.RightAppendage2.cubeList.add(new ModelBox(RightAppendage2, 11, 53, -4.0F, -1.0F, -1.0F, 4, 0, 1, 0.01F, false));

        this.rightClaw2 = new ModelRenderer(this);
        this.rightClaw2.setRotationPoint(-3.0F, 0.0F, -1.0F);
        this.RightAppendage2.addChild(rightClaw2);
        this.setRotateAngle(rightClaw2, 0.0F, 0.5672F, 0.0F);
        this.rightClaw2.cubeList.add(new ModelBox(rightClaw2, 14, 9, -1.0F, -1.0F, -4.0F, 2, 0, 4, 0.0F, false));

        this.RightAppendage3 = new ModelRenderer(this);
        this.RightAppendage3.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.RightAppendage2.addChild(RightAppendage3);
        this.setRotateAngle(RightAppendage3, 0.0F, -0.3054F, 0.0F);
        this.RightAppendage3.cubeList.add(new ModelBox(RightAppendage3, 0, 53, -4.0F, -1.0F, -1.0F, 4, 0, 1, 0.0F, false));

        this.rightClaw3 = new ModelRenderer(this);
        this.rightClaw3.setRotationPoint(-3.0F, 0.0F, -1.0F);
        this.RightAppendage3.addChild(rightClaw3);
        this.setRotateAngle(rightClaw3, 0.0F, 0.9163F, 0.0F);
        this.rightClaw3.cubeList.add(new ModelBox(rightClaw3, 18, 33, -1.0F, -1.0F, -5.0F, 2, 0, 5, 0.0F, false));

        this.rightClaw4 = new ModelRenderer(this);
        this.rightClaw4.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.RightAppendage3.addChild(rightClaw4);
        this.setRotateAngle(rightClaw4, 0.0F, -0.1309F, 0.0F);
        this.rightClaw4.cubeList.add(new ModelBox(rightClaw4, 0, 30, -8.0F, -1.01F, -3.0F, 8, 0, 3, 0.0F, false));

        this.RightAppendage4 = new ModelRenderer(this);
        this.RightAppendage4.setRotationPoint(-14.6814F, -1.0F, 12.1977F);
        this.rightAppendage1.addChild(RightAppendage4);
        this.setRotateAngle(RightAppendage4, 0.0F, -1.3875F, 0.0F);


        this.rightClaw5 = new ModelRenderer(this);
        this.rightClaw5.setRotationPoint(-1.0F, 1.0F, -0.5F);
        this.RightAppendage4.addChild(rightClaw5);
        this.setRotateAngle(rightClaw5, 0.0F, -0.1309F, 0.0F);


        this.RightAppendage5 = new ModelRenderer(this);
        this.RightAppendage5.setRotationPoint(-2.0F, 1.0F, 0.5F);
        this.RightAppendage4.addChild(RightAppendage5);
        this.setRotateAngle(RightAppendage5, 0.0F, -0.9599F, 0.0F);


        this.rightClaw6 = new ModelRenderer(this);
        this.rightClaw6.setRotationPoint(-3.0F, 0.0F, -1.0F);
        this.RightAppendage5.addChild(rightClaw6);
        this.setRotateAngle(rightClaw6, 0.0F, 0.2182F, 0.0F);
        this.rightClaw6.cubeList.add(new ModelBox(rightClaw6, 18, 33, -1.0F, -1.0F, -5.0F, 2, 0, 5, 0.0F, false));

        this.rightClaw7 = new ModelRenderer(this);
        this.rightClaw7.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.RightAppendage5.addChild(rightClaw7);
        this.setRotateAngle(rightClaw7, 0.0F, -0.6109F, 0.0F);
        this.rightClaw7.cubeList.add(new ModelBox(rightClaw7, 0, 30, -8.0F, -1.01F, -3.0F, 8, 0, 3, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(body1);
        this.setRotateAngle(body1, 0.0F, 0.0873F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 17, -1.5F, 1.0F, 0.0F, 3, 0, 7, 0.01F, false));

        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.5F, 1.5F, 1.0F);
        this.body1.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.4363F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 58, 55, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.5F, 1.5F, 1.0F);
        this.body1.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, -0.3054F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 51, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(1.5F, 1.5F, 2.5F);
        this.body1.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, 0.1309F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 58, 50, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(-1.5F, 1.5F, 2.5F);
        this.body1.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0F, 0.0873F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 22, 49, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(1.5F, 1.5F, 4.0F);
        this.body1.addChild(leftLeg5);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 58, 48, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(-1.5F, 1.5F, 4.0F);
        this.body1.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.0F, 0.1309F, 0.0F);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 11, 49, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leftLeg6 = new ModelRenderer(this);
        this.leftLeg6.setRotationPoint(1.5F, 1.5F, 5.5F);
        this.body1.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.0F, -0.2182F, 0.0F);
        this.leftLeg6.cubeList.add(new ModelBox(leftLeg6, 58, 46, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg6 = new ModelRenderer(this);
        this.rightLeg6.setRotationPoint(-1.5F, 1.5F, 5.5F);
        this.body1.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.0F, 0.1309F, 0.0F);
        this.rightLeg6.cubeList.add(new ModelBox(rightLeg6, 0, 49, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.75F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -0.1309F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.5F, 1.0F, 0.0F, 3, 0, 8, 0.02F, false));

        this.leftLeg7 = new ModelRenderer(this);
        this.leftLeg7.setRotationPoint(1.5F, 1.5F, 0.5F);
        this.body2.addChild(leftLeg7);
        this.leftLeg7.cubeList.add(new ModelBox(leftLeg7, 58, 44, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg7 = new ModelRenderer(this);
        this.rightLeg7.setRotationPoint(-1.5F, 1.5F, 0.5F);
        this.body2.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, 0.0F, 0.3054F, 0.0F);
        this.rightLeg7.cubeList.add(new ModelBox(rightLeg7, 22, 47, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leftLeg8 = new ModelRenderer(this);
        this.leftLeg8.setRotationPoint(1.5F, 1.5F, 2.25F);
        this.body2.addChild(leftLeg8);
        this.leftLeg8.cubeList.add(new ModelBox(leftLeg8, 58, 42, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg8 = new ModelRenderer(this);
        this.rightLeg8.setRotationPoint(-1.5F, 1.5F, 2.25F);
        this.body2.addChild(rightLeg8);
        this.setRotateAngle(rightLeg8, 0.0F, 0.2618F, 0.0F);
        this.rightLeg8.cubeList.add(new ModelBox(rightLeg8, 11, 47, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leftLeg9 = new ModelRenderer(this);
        this.leftLeg9.setRotationPoint(1.5F, 1.5F, 4.0F);
        this.body2.addChild(leftLeg9);
        this.leftLeg9.cubeList.add(new ModelBox(leftLeg9, 58, 40, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg9 = new ModelRenderer(this);
        this.rightLeg9.setRotationPoint(-1.5F, 1.5F, 4.0F);
        this.body2.addChild(rightLeg9);
        this.setRotateAngle(rightLeg9, 0.0F, 0.2182F, 0.0F);
        this.rightLeg9.cubeList.add(new ModelBox(rightLeg9, 0, 47, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leftLeg10 = new ModelRenderer(this);
        this.leftLeg10.setRotationPoint(1.5F, 1.5F, 5.75F);
        this.body2.addChild(leftLeg10);
        this.leftLeg10.cubeList.add(new ModelBox(leftLeg10, 58, 38, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg10 = new ModelRenderer(this);
        this.rightLeg10.setRotationPoint(-1.5F, 1.5F, 5.75F);
        this.body2.addChild(rightLeg10);
        this.setRotateAngle(rightLeg10, 0.0F, 0.2618F, 0.0F);
        this.rightLeg10.cubeList.add(new ModelBox(rightLeg10, 22, 45, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leftLeg11 = new ModelRenderer(this);
        this.leftLeg11.setRotationPoint(1.5F, 1.6F, 7.5F);
        this.body2.addChild(leftLeg11);
        this.leftLeg11.cubeList.add(new ModelBox(leftLeg11, 58, 36, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg11 = new ModelRenderer(this);
        this.rightLeg11.setRotationPoint(-1.5F, 1.6F, 7.5F);
        this.body2.addChild(rightLeg11);
        this.rightLeg11.cubeList.add(new ModelBox(rightLeg11, 11, 45, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, -0.1745F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 9, -1.5F, 1.0F, -0.25F, 3, 0, 7, 0.01F, false));

        this.leftLeg12 = new ModelRenderer(this);
        this.leftLeg12.setRotationPoint(1.5F, 1.5F, 1.25F);
        this.body3.addChild(leftLeg12);
        this.setRotateAngle(leftLeg12, 0.0F, -0.1309F, 0.0F);
        this.leftLeg12.cubeList.add(new ModelBox(leftLeg12, 58, 34, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg12 = new ModelRenderer(this);
        this.rightLeg12.setRotationPoint(-1.5F, 1.5F, 1.25F);
        this.body3.addChild(rightLeg12);
        this.setRotateAngle(rightLeg12, 0.0F, 0.3054F, 0.0F);
        this.rightLeg12.cubeList.add(new ModelBox(rightLeg12, 0, 45, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leftLeg13 = new ModelRenderer(this);
        this.leftLeg13.setRotationPoint(1.5F, 1.6F, 2.75F);
        this.body3.addChild(leftLeg13);
        this.leftLeg13.cubeList.add(new ModelBox(leftLeg13, 58, 32, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg13 = new ModelRenderer(this);
        this.rightLeg13.setRotationPoint(-1.5F, 1.6F, 2.75F);
        this.body3.addChild(rightLeg13);
        this.rightLeg13.cubeList.add(new ModelBox(rightLeg13, 20, 30, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leftLeg14 = new ModelRenderer(this);
        this.leftLeg14.setRotationPoint(1.5F, 1.5F, 4.25F);
        this.body3.addChild(leftLeg14);
        this.leftLeg14.cubeList.add(new ModelBox(leftLeg14, 58, 30, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg14 = new ModelRenderer(this);
        this.rightLeg14.setRotationPoint(-1.5F, 1.5F, 4.25F);
        this.body3.addChild(rightLeg14);
        this.rightLeg14.cubeList.add(new ModelBox(rightLeg14, 11, 25, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leftLeg15 = new ModelRenderer(this);
        this.leftLeg15.setRotationPoint(1.5F, 1.5F, 5.75F);
        this.body3.addChild(leftLeg15);
        this.setRotateAngle(leftLeg15, 0.0F, -0.2182F, 0.0F);
        this.leftLeg15.cubeList.add(new ModelBox(leftLeg15, 22, 57, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg15 = new ModelRenderer(this);
        this.rightLeg15.setRotationPoint(-1.5F, 1.5F, 5.75F);
        this.body3.addChild(rightLeg15);
        this.setRotateAngle(rightLeg15, 0.0F, 0.3054F, 0.0F);
        this.rightLeg15.cubeList.add(new ModelBox(rightLeg15, 0, 25, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 6.75F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, 0.0F, -0.1745F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 11, 39, -1.0F, 1.0F, -0.25F, 2, 0, 3, 0.0F, false));

        this.leftLeg16 = new ModelRenderer(this);
        this.leftLeg16.setRotationPoint(1.0F, 1.6F, 0.5F);
        this.tail.addChild(leftLeg16);
        this.leftLeg16.cubeList.add(new ModelBox(leftLeg16, 11, 57, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg16 = new ModelRenderer(this);
        this.rightLeg16.setRotationPoint(-1.0F, 1.6F, 0.5F);
        this.tail.addChild(rightLeg16);
        this.rightLeg16.cubeList.add(new ModelBox(rightLeg16, 14, 22, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leftLeg17 = new ModelRenderer(this);
        this.leftLeg17.setRotationPoint(1.0F, 1.6F, 1.75F);
        this.tail.addChild(leftLeg17);
        this.leftLeg17.cubeList.add(new ModelBox(leftLeg17, 0, 57, -1.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.rightLeg17 = new ModelRenderer(this);
        this.rightLeg17.setRotationPoint(-1.0F, 1.6F, 1.75F);
        this.tail.addChild(rightLeg17);
        this.rightLeg17.cubeList.add(new ModelBox(rightLeg17, 14, 14, -3.0F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

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
