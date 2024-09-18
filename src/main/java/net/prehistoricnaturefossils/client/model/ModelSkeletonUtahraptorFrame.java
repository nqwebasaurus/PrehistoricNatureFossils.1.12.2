package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonUtahraptorFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftSickleClaw;
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightSickleClaw;
    private final ModelRenderer rightToes;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftFinger;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer rightFinger;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonUtahraptorFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -25.0F, -7.4F, 1, 25, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.0F, -22.25F, -24.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3927F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.2F, -6.75F, -0.5F, 1, 29, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.0F, -22.25F, -24.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3927F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -2.75F, -4.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -20.0F, -6.9F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -5.0F, -4.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -26.0F, -7.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0F, 0.0F, 0.0436F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.9F, -3.7F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 0, -0.5F, 1.0F, 0.1F, 1, 2, 10, 0.0F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(4.0F, 1.3F, 0.05F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -1.0472F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-0.5F, 11.3139F, 2.4218F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.5359F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 13.4546F, 0.5832F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9425F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.1F, 4.8763F, -0.0528F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.4363F, 0.0F, 0.0F);


        this.leftSickleClaw = new ModelRenderer(this);
        this.leftSickleClaw.setRotationPoint(-1.5F, -1.0F, -0.8F);
        this.leftFoot.addChild(leftSickleClaw);
        this.setRotateAngle(leftSickleClaw, -0.7418F, 0.3054F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.leftFoot.addChild(leftToes);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-4.0F, 1.3F, 0.05F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.0872F, -0.0038F, -0.0435F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.5F, 11.3139F, 2.4218F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.1868F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 13.4546F, 0.5832F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.2477F, 0.0419F, 0.012F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(-0.1F, 4.8763F, -0.0528F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.4363F, 0.0F, 0.0F);


        this.rightSickleClaw = new ModelRenderer(this);
        this.rightSickleClaw.setRotationPoint(1.5F, -1.0F, -0.8F);
        this.rightFoot.addChild(rightSickleClaw);
        this.setRotateAngle(rightSickleClaw, -0.7418F, -0.3054F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -2.5F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.1309F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.9F, -3.7F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.2182F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.9F, -0.5F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 35, -0.5F, -0.9F, -7.8F, 1, 2, 8, 0.005F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.7F, -8.2F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.1309F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.6F, -0.1F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 38, -0.5F, -0.2F, -7.6F, 1, 2, 8, 0.0F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(3.7474F, 3.9395F, -6.0157F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.2691F, -0.4755F, -1.2957F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0941F, 6.0353F, -0.6475F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.9498F, 0.1575F, 0.2628F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 7.2F, -0.5F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.7836F, -0.0692F, 0.0532F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.3491F, 0.0F, 0.0F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.7474F, 3.9395F, -6.0157F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.2211F, 0.3356F, 1.2749F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0941F, 6.0353F, -0.6475F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.0807F, -0.1575F, -0.2628F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2F, 7.2F, -0.5F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.7836F, 0.0692F, -0.0532F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.3927F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.4F, -6.9F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.0451F, 0.1289F, 0.0229F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0F, -3.9F);
        this.neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5934F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 59, 53, -0.5F, -0.98F, 0.2823F, 1, 2, 4, 0.005F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.0F, -3.1F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.041F, 0.1719F, 0.0306F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -5.4F, -4.3F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.8203F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 15, -0.5F, 0.7499F, 0.7896F, 1, 2, 7, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -4.7F, -4.4F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.1273F, 0.1718F, -0.0302F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.3F, -2.7F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 70, -0.5F, 1.0F, -0.1F, 1, 2, 3, 0.005F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3366F, -2.9073F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0005F, 0.1857F, -0.0345F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.4F, 3.2165F, 0.1666F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1561F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.6F, 5.6F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.186F, -0.2069F, 0.0823F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 32, -0.5F, 0.0F, 0.0F, 1, 2, 9, 0.005F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 8.8F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2673F, -0.2224F, 0.0035F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 17, -0.5F, -0.5F, -0.4F, 1, 2, 12, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 11.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1353F, -0.1624F, 0.1859F);
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 25, -0.5F, -0.4F, -1.0F, 1, 1, 11, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 10.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2523F, -0.1743F, 0.0092F);
        this.tail4.cubeList.add(new ModelBox(tail4, 33, 3, -0.5F, 0.0F, -0.6F, 1, 1, 10, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 8.9F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.2918F, -0.2592F, 0.0373F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -0.5F, 0.0F, -0.2F, 1, 1, 15, -0.15F, false));

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
