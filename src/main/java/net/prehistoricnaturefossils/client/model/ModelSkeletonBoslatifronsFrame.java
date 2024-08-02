package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBoslatifronsFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r10;
    private final ModelRenderer head;
    private final ModelRenderer leftHorn;
    private final ModelRenderer rightHorn;
    private final ModelRenderer leftMaxilla;
    private final ModelRenderer rightMaxilla;
    private final ModelRenderer leftOrbit;
    private final ModelRenderer rightOrbit;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;

    public ModelSkeletonBoslatifronsFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -30.0F, 26.0F, 1, 30, 1, -0.004F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -26.0F, 26.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 1.5F, -7.0F, -0.5F, 1, 12, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -25.5F, -14.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1047F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.0F, -6.0F, -0.5F, 1, 15, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -25.5F, -14.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1047F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 1.3F, -3.5F, -0.5F, 1, 29, 1, -0.004F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -31.0F, 26.0F);
        this.fossil.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.1F, -3.5F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4451F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 14, -0.5F, 0.9014F, 0.3389F, 1, 2, 11, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.9F, 3.6F, -0.4F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3578F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 10.3652F, 0.7178F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.6581F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 10.6475F, -0.4467F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.2654F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 7.9414F, -0.3063F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 2.2777F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, -0.0696F, -2.9933F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.9F, 3.6F, -0.4F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -1.1868F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 10.3652F, 0.7178F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.7017F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 10.6475F, -0.4467F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.309F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 7.9414F, -0.3063F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 2.8013F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, -0.0696F, -2.9933F);
        this.rightLeg4.addChild(rightLeg5);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -3.0F, -5.0F);
        this.hips.addChild(body2);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.9F, -11.9F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2094F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, 0.8488F, -0.2526F, 1, 2, 14, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -13.0F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.0873F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 28, -0.5F, 0.0F, -8.0F, 1, 2, 9, 0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3316F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 0, -0.5F, 0.8362F, -8.0438F, 1, 2, 8, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 3.5F, -15.3F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0436F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 4.2F, -9.5F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3403F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 0, -0.5F, -0.908F, -0.16F, 1, 2, 11, 0.003F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(6.4F, 8.4651F, -6.6441F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.4363F, 0.0F, 0.0F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 8.5499F, 4.0325F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.1745F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 8.0F, 0.4F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.7767F, 0.0F, 0.0F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.3054F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-6.4F, 8.4651F, -6.6441F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.2182F, 0.0F, 0.0F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 8.5499F, 4.0325F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.1745F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 8.0F, 0.4F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2094F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.7418F, 0.0F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.9F, -9.8F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.219F, -0.0852F, -0.0189F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.0F, -5.3F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 43, -0.5F, 0.8F, -0.2F, 1, 2, 6, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.4F, -5.9F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0F, -0.0436F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.6F, -4.0F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.192F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 56, -0.5F, -0.1F, -0.2F, 1, 2, 5, 0.003F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0F, -0.0436F, 0.0F);


        this.leftHorn = new ModelRenderer(this);
        this.leftHorn.setRotationPoint(3.0F, -0.6248F, -3.7081F);
        this.head.addChild(leftHorn);
        this.setRotateAngle(leftHorn, 0.5127F, 0.0417F, -0.1027F);


        this.rightHorn = new ModelRenderer(this);
        this.rightHorn.setRotationPoint(-3.0F, -0.6248F, -3.7081F);
        this.head.addChild(rightHorn);
        this.setRotateAngle(rightHorn, 0.5127F, -0.0417F, 0.1027F);


        this.leftMaxilla = new ModelRenderer(this);
        this.leftMaxilla.setRotationPoint(0.0F, 8.8742F, -3.9729F);
        this.head.addChild(leftMaxilla);


        this.rightMaxilla = new ModelRenderer(this);
        this.rightMaxilla.setRotationPoint(0.0F, 8.8742F, -3.9729F);
        this.head.addChild(rightMaxilla);


        this.leftOrbit = new ModelRenderer(this);
        this.leftOrbit.setRotationPoint(2.4F, 3.3856F, -4.5235F);
        this.head.addChild(leftOrbit);


        this.rightOrbit = new ModelRenderer(this);
        this.rightOrbit.setRotationPoint(-2.4F, 3.3856F, -4.5235F);
        this.head.addChild(rightOrbit);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 1.5F, -2.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.0385F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.7F, 6.4F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -1.441F, 0.017F, -0.1298F);
        this.tail.cubeList.add(new ModelBox(tail, 30, 19, -0.5F, 0.6F, 0.4F, 1, 1, 4, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.5043F, -0.2344F, 0.0923F);
        this.tail2.cubeList.add(new ModelBox(tail2, 8, 54, -0.4F, 0.6F, -0.6F, 1, 1, 7, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.553F, 0.0734F, -0.0611F);
        this.tail3.cubeList.add(new ModelBox(tail3, 54, 53, -0.5F, 0.6F, -0.6F, 1, 1, 6, -0.15F, false));

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
