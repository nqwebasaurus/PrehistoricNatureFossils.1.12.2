package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBeipiaosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r3;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightToes;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
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
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;

    public ModelSkeletonBeipiaosaurusFrame() {
        this.textureWidth = 73;
        this.textureHeight = 73;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -18.0F, 3.3F, 1, 18, 1, -0.21F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -1.4F, -21.0F, -10.7F, 1, 21, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -14.0F, -10.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 3.5F, -2.4F, -0.5F, 1, 5, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -14.0F, 3.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 2.0F, -2.0F, -0.5F, 1, 4, 1, -0.2F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -17.6F, 4.0F);
        this.fossil.addChild(hips);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.0F, -3.1F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3142F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 10, -0.5F, 0.6F, -0.2F, 1, 1, 6, -0.15F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.9F, 1.3711F, -0.3712F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -1.0647F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.1473F, 0.5958F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.7715F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 9.0056F, 0.2103F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.1781F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 3.1309F, -0.2031F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.829F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -1.5F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, 0.48F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.9F, 1.3711F, -0.3712F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.4538F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.1473F, 0.5958F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.2479F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 9.0056F, 0.2103F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.1781F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 3.1309F, -0.2031F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.4363F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -1.5F);
        this.rightFoot.addChild(rightToes);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.6F, -3.2F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.1309F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.5F, -4.7F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2094F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 0, -1.0F, 0.5184F, -2.6767F, 1, 1, 3, -0.15F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2443F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 0, -1.0F, 0.2F, -4.9F, 1, 1, 5, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.8F, -7.8F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.1745F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.2F, -4.8F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1746F, 0.0172F, -0.003F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, -2, 27, -0.6F, -0.47F, -0.4189F, 1, 1, 6, -0.15F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(2.2467F, 2.8686F, -3.2856F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.4417F, -0.3523F, -0.5031F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.1622F, 6.1012F, 0.3478F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -2.297F, 0.1413F, 0.1198F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.098F, 4.9434F, 0.069F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 1.126F, -0.1333F, 0.1908F);


        this.leftFinger = new ModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.3568F, -0.2795F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.3927F, 0.0F, 0.0F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.2467F, 2.8686F, -3.2856F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.688F, 0.322F, 0.2259F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.1622F, 6.1012F, 0.3478F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -2.2028F, -0.0359F, -0.1977F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.098F, 4.9434F, 0.069F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 1.126F, 0.1333F, -0.1908F);


        this.rightFinger = new ModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.3568F, -0.2795F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.3927F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.6F, -4.0F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, 0.2618F, -0.0436F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.4F, -3.3F);
        this.neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6109F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 41, -0.5F, -0.4258F, 0.0825F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.0F, -0.48F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -5.2F, -2.1F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.0996F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 21, -0.5F, 0.5F, 0.6F, 1, 1, 6, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -4.7F, -2.3F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0F, -0.2182F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.4F, -1.6F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4712F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 49, 54, -0.5F, 0.7F, 0.3F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.8F, -1.2F);
        this.neck.addChild(head);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.6F, 0.2F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.3F, 2.4F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0688F, -0.479F, 0.0318F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.2F, 0.0F, -0.7F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0175F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 33, -0.4F, 0.1F, 0.0F, 1, 1, 5, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0087F, 3.8004F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0903F, -0.2608F, -0.0233F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 21, -0.5F, 0.1F, 0.0F, 1, 1, 6, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0052F, 5.9001F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0567F, -0.3921F, 0.0217F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 10, -0.5F, 0.1F, -0.2F, 1, 1, 9, -0.15F, false));

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
