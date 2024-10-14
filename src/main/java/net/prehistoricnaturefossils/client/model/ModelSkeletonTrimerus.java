package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTrimerus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Trimerus;
    private final ModelRenderer cube_r4;
    private final ModelRenderer LEFTCEPHALON1;
    private final ModelRenderer LEFTCEPHALON2;
    private final ModelRenderer LEFTCEPHALON3;
    private final ModelRenderer RIGHTCEPHALON1;
    private final ModelRenderer RIGHTCEPHALON2;
    private final ModelRenderer RIGHTCEPHALON3;
    private final ModelRenderer leftAntenna;
    private final ModelRenderer rightAntenna;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer body1;
    private final ModelRenderer LEFTRIDGE1;
    private final ModelRenderer RIGHTRIDGE1;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer body2;
    private final ModelRenderer LEFTRIDGE2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer RIGHTRIDGE2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftLeg6;
    private final ModelRenderer rightLeg6;
    private final ModelRenderer leftLeg7;
    private final ModelRenderer rightLeg7;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer LEFTRIDGE3;
    private final ModelRenderer RIGHTRIDGE3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftLeg8;
    private final ModelRenderer rightLeg8;
    private final ModelRenderer leftLeg9;
    private final ModelRenderer rightLeg9;
    private final ModelRenderer leftLeg10;
    private final ModelRenderer rightLeg10;

    public ModelSkeletonTrimerus() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 23.875F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -7.0F, -0.9F, -10.0F, 8, 1, 20, 0.02F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 22, -0.075F, -0.875F, -6.0F, 6, 1, 16, 0.001F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 0.1F, -9.975F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4363F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 43, 40, 0.0F, -1.0F, -0.025F, 8, 1, 11, 0.01F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-7.0F, -1.5F, 0.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.0044F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 22, 0.0F, 0.0F, -3.0F, 1, 1, 13, 0.01F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-6.025F, -1.5F, 0.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.0611F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 40, 0.0F, 0.0F, -3.0F, 8, 1, 13, 0.0F, false));

        this.Trimerus = new ModelRenderer(this);
        this.Trimerus.setRotationPoint(0.55F, -2.725F, -3.0F);
        this.fossil.addChild(Trimerus);
        this.setRotateAngle(Trimerus, 0.2175F, 0.4782F, 0.0415F);
        this.Trimerus.cubeList.add(new ModelBox(Trimerus, 15, 55, -1.0F, 0.35F, -5.0F, 2, 1, 5, -0.02F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0F, -5.0F);
        this.Trimerus.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 55, -1.5F, -0.15F, 0.0F, 2, 1, 5, 0.0F, false));

        this.LEFTCEPHALON1 = new ModelRenderer(this);
        this.LEFTCEPHALON1.setRotationPoint(1.0F, 0.0F, -1.0F);
        this.Trimerus.addChild(LEFTCEPHALON1);
        this.setRotateAngle(LEFTCEPHALON1, 0.0F, 0.0F, 0.6109F);
        this.LEFTCEPHALON1.cubeList.add(new ModelBox(LEFTCEPHALON1, 57, 5, 0.0F, 0.0F, -3.0F, 3, 1, 4, 0.0F, false));
        this.LEFTCEPHALON1.cubeList.add(new ModelBox(LEFTCEPHALON1, 42, 65, -0.5F, -0.25F, -1.5F, 1, 1, 1, 0.0F, false));

        this.LEFTCEPHALON2 = new ModelRenderer(this);
        this.LEFTCEPHALON2.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.LEFTCEPHALON1.addChild(LEFTCEPHALON2);
        this.setRotateAngle(LEFTCEPHALON2, 0.0F, -0.5672F, 0.0F);
        this.LEFTCEPHALON2.cubeList.add(new ModelBox(LEFTCEPHALON2, 59, 37, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.LEFTCEPHALON3 = new ModelRenderer(this);
        this.LEFTCEPHALON3.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.LEFTCEPHALON2.addChild(LEFTCEPHALON3);
        this.setRotateAngle(LEFTCEPHALON3, 0.0F, -0.5847F, 0.0F);
        this.LEFTCEPHALON3.cubeList.add(new ModelBox(LEFTCEPHALON3, 45, 37, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.02F, false));
        this.LEFTCEPHALON3.cubeList.add(new ModelBox(LEFTCEPHALON3, 30, 55, 1.3F, -1.0F, 0.0F, 2, 1, 1, -0.03F, false));

        this.RIGHTCEPHALON1 = new ModelRenderer(this);
        this.RIGHTCEPHALON1.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.Trimerus.addChild(RIGHTCEPHALON1);
        this.setRotateAngle(RIGHTCEPHALON1, 0.0F, 0.0F, -0.6109F);
        this.RIGHTCEPHALON1.cubeList.add(new ModelBox(RIGHTCEPHALON1, 57, 11, -3.0F, 0.0F, -3.0F, 3, 1, 4, 0.0F, false));
        this.RIGHTCEPHALON1.cubeList.add(new ModelBox(RIGHTCEPHALON1, 37, 55, -0.5F, -0.25F, -1.5F, 1, 1, 1, 0.0F, false));

        this.RIGHTCEPHALON2 = new ModelRenderer(this);
        this.RIGHTCEPHALON2.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.RIGHTCEPHALON1.addChild(RIGHTCEPHALON2);
        this.setRotateAngle(RIGHTCEPHALON2, 0.0F, 0.5672F, 0.0F);
        this.RIGHTCEPHALON2.cubeList.add(new ModelBox(RIGHTCEPHALON2, 52, 37, -2.0F, -1.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.RIGHTCEPHALON3 = new ModelRenderer(this);
        this.RIGHTCEPHALON3.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.RIGHTCEPHALON2.addChild(RIGHTCEPHALON3);
        this.setRotateAngle(RIGHTCEPHALON3, 0.0F, 0.5847F, 0.0F);
        this.RIGHTCEPHALON3.cubeList.add(new ModelBox(RIGHTCEPHALON3, 58, 63, -2.0F, -1.0F, 0.0F, 2, 1, 1, -0.02F, false));
        this.RIGHTCEPHALON3.cubeList.add(new ModelBox(RIGHTCEPHALON3, 35, 63, -3.3F, -1.0F, 0.0F, 2, 1, 1, -0.03F, false));

        this.leftAntenna = new ModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.5F, 1.4F, -4.15F);
        this.Trimerus.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, -0.1085F, -0.3433F, 0.0779F);


        this.rightAntenna = new ModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.5F, 1.4F, -4.15F);
        this.Trimerus.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, -0.1085F, 0.3433F, -0.0779F);


        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.0F, 1.25F, -3.0F);
        this.Trimerus.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.0F, 0.3927F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(0.0F, 1.25F, -3.0F);
        this.Trimerus.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, 0.0F, -0.3927F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 1.25F, -1.5F);
        this.Trimerus.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 0.3927F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 1.25F, -1.5F);
        this.Trimerus.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -0.3927F);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.65F, -0.2F);
        this.Trimerus.addChild(body1);
        this.setRotateAngle(body1, -0.176F, -0.1289F, 0.0229F);
        this.body1.cubeList.add(new ModelBox(body1, 45, 58, -1.0F, 0.0F, 0.0F, 2, 2, 4, -0.01F, false));

        this.LEFTRIDGE1 = new ModelRenderer(this);
        this.LEFTRIDGE1.setRotationPoint(1.0F, 0.75F, 0.0F);
        this.body1.addChild(LEFTRIDGE1);
        this.setRotateAngle(LEFTRIDGE1, 0.0F, 0.0F, 0.7418F);
        this.LEFTRIDGE1.cubeList.add(new ModelBox(LEFTRIDGE1, 57, 0, -1.1F, 0.0F, 0.0F, 4, 0, 4, 0.0F, false));

        this.RIGHTRIDGE1 = new ModelRenderer(this);
        this.RIGHTRIDGE1.setRotationPoint(-1.0F, 0.75F, 0.0F);
        this.body1.addChild(RIGHTRIDGE1);
        this.setRotateAngle(RIGHTRIDGE1, 0.0F, 0.0F, -0.7418F);
        this.RIGHTRIDGE1.cubeList.add(new ModelBox(RIGHTRIDGE1, 43, 53, -2.9F, 0.0F, 0.0F, 4, 0, 4, 0.0F, false));

        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 1.9F, 0.7F);
        this.body1.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.0F, 0.48F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 1.9F, 0.7F);
        this.body1.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.0F, -0.48F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 1.9F, 2.2F);
        this.body1.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 0.48F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 1.9F, 2.2F);
        this.body1.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0F, 0.0F, -0.48F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 1.9F, 3.7F);
        this.body1.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.0F, 0.0F, 0.48F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 1.9F, 3.7F);
        this.body1.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.0F, 0.0F, -0.48F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, -0.0876F, -0.0869F, 0.0076F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 62, -1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.LEFTRIDGE2 = new ModelRenderer(this);
        this.LEFTRIDGE2.setRotationPoint(1.0F, 0.75F, 2.0F);
        this.body2.addChild(LEFTRIDGE2);
        this.setRotateAngle(LEFTRIDGE2, 0.0F, 0.0F, 0.7418F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LEFTRIDGE2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 58, 58, -0.25F, 0.0F, -2.0F, 3, 0, 4, 0.0F, false));

        this.RIGHTRIDGE2 = new ModelRenderer(this);
        this.RIGHTRIDGE2.setRotationPoint(-1.0F, 0.75F, 2.0F);
        this.body2.addChild(RIGHTRIDGE2);
        this.setRotateAngle(RIGHTRIDGE2, 0.0F, 0.0F, -0.7418F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RIGHTRIDGE2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 57, 17, -2.75F, 0.0F, -2.0F, 3, 0, 4, 0.0F, false));

        this.leftLeg6 = new ModelRenderer(this);
        this.leftLeg6.setRotationPoint(0.0F, 1.9F, 1.2F);
        this.body2.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.0F, 0.0F, 0.4363F);


        this.rightLeg6 = new ModelRenderer(this);
        this.rightLeg6.setRotationPoint(0.0F, 1.9F, 1.2F);
        this.body2.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.0F, 0.0F, -0.4363F);


        this.leftLeg7 = new ModelRenderer(this);
        this.leftLeg7.setRotationPoint(0.0F, 1.9F, 2.7F);
        this.body2.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, 0.0F, 0.0F, 0.3927F);


        this.rightLeg7 = new ModelRenderer(this);
        this.rightLeg7.setRotationPoint(0.0F, 1.9F, 2.7F);
        this.body2.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, 0.0F, 0.0F, -0.3927F);


        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, -0.0436F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 13, 62, -0.5F, 1.0F, -0.15F, 1, 1, 4, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 63, -0.5F, 0.0F, 0.0F, 1, 1, 4, -0.01F, false));

        this.LEFTRIDGE3 = new ModelRenderer(this);
        this.LEFTRIDGE3.setRotationPoint(0.5F, 0.5F, 0.0F);
        this.body3.addChild(LEFTRIDGE3);
        this.setRotateAngle(LEFTRIDGE3, -0.2177F, -0.0615F, 0.7532F);
        this.LEFTRIDGE3.cubeList.add(new ModelBox(LEFTRIDGE3, 60, 53, -0.2F, -0.15F, -0.2F, 3, 0, 4, 0.0F, false));

        this.RIGHTRIDGE3 = new ModelRenderer(this);
        this.RIGHTRIDGE3.setRotationPoint(-0.5F, 0.5F, 0.0F);
        this.body3.addChild(RIGHTRIDGE3);
        this.setRotateAngle(RIGHTRIDGE3, -0.2177F, 0.0615F, -0.7532F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RIGHTRIDGE3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 58, -2.8F, -0.15F, -0.2F, 3, 0, 4, 0.0F, false));

        this.leftLeg8 = new ModelRenderer(this);
        this.leftLeg8.setRotationPoint(0.0F, 1.9F, 0.2F);
        this.body3.addChild(leftLeg8);
        this.setRotateAngle(leftLeg8, 0.0F, 0.0F, 0.5236F);


        this.rightLeg8 = new ModelRenderer(this);
        this.rightLeg8.setRotationPoint(0.0F, 1.9F, 0.2F);
        this.body3.addChild(rightLeg8);
        this.setRotateAngle(rightLeg8, 0.0F, 0.0F, -0.5236F);


        this.leftLeg9 = new ModelRenderer(this);
        this.leftLeg9.setRotationPoint(0.0F, 1.9F, 1.7F);
        this.body3.addChild(leftLeg9);
        this.setRotateAngle(leftLeg9, 0.0F, 0.0F, 0.48F);


        this.rightLeg9 = new ModelRenderer(this);
        this.rightLeg9.setRotationPoint(0.0F, 1.9F, 1.7F);
        this.body3.addChild(rightLeg9);
        this.setRotateAngle(rightLeg9, 0.0F, 0.0F, -0.48F);


        this.leftLeg10 = new ModelRenderer(this);
        this.leftLeg10.setRotationPoint(0.0F, 1.9F, 3.2F);
        this.body3.addChild(leftLeg10);
        this.setRotateAngle(leftLeg10, 0.0F, 0.0F, 0.8727F);


        this.rightLeg10 = new ModelRenderer(this);
        this.rightLeg10.setRotationPoint(0.0F, 1.9F, 3.2F);
        this.body3.addChild(rightLeg10);
        this.setRotateAngle(rightLeg10, 0.0F, 0.0F, -0.8727F);

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
