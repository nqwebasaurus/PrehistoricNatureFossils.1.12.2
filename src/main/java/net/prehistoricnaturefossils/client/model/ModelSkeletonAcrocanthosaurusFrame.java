package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAcrocanthosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Acrocanthosaurus;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r5;
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
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r6;
    private final ModelRenderer bone;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;
    private final ModelRenderer body;
    private final ModelRenderer cube_r10;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r13;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r14;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;

    public ModelSkeletonAcrocanthosaurusFrame() {
        this.textureWidth = 138;
        this.textureHeight = 138;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-9.2F, -31.0F, -28.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3054F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.3F, -6.0F, -0.5F, 1, 37, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-9.2F, -31.0F, -28.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3054F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -2.7F, -8.0F, -0.5F, 1, 17, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -31.0F, 4.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2269F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 5.5F, -8.0F, -0.5F, 1, 15, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -31.0F, 4.3F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2269F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -1.1F, -6.0F, -0.5F, 1, 37, 1, -0.16F, false));

        this.Acrocanthosaurus = new ModelRenderer(this);
        this.Acrocanthosaurus.setRotationPoint(0.0F, -41.0F, 4.5F);
        this.fossil.addChild(Acrocanthosaurus);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Acrocanthosaurus.addChild(hips);
        this.setRotateAngle(hips, -0.0903F, 0.2608F, -0.0233F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.25F, -4.7F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0785F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 50, -0.5F, -0.9822F, -0.6026F, 1, 2, 14, 0.0F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(6.5F, 0.0F, 0.3F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.6074F, 0.0705F, 0.111F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 17.7F, 0.0F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.2217F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.2F, 16.1472F, -1.4617F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6963F, -0.0561F, -0.0669F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 6.5553F, -1.5739F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.6109F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 0.5F, -1.25F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, -0.4326F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-6.5F, 0.0F, 0.3F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0967F, 0.0041F, -0.1973F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 17.7F, 0.0F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.9058F, 0.0408F, 0.0575F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.2F, 16.1472F, -1.4617F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.9205F, 0.0935F, 0.1829F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 6.5553F, -1.5739F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3962F, 0.0015F, -0.0349F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 0.5F, -1.25F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, -0.3453F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.5F, 8.6F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1314F, 0.0865F, -0.0114F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 1.1562F, 0.0709F);
        this.tail1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1571F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 28, 0.0F, -0.9F, 0.1F, 1, 2, 16, 0.005F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -8.0925F, 7.6858F);
        this.tail1.addChild(bone);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -2.6938F, 15.7709F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.2184F, 0.0426F, 0.0094F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.2627F, -0.0616F);
        this.tail2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0175F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 9, -0.5F, -0.9F, 0.0F, 1, 2, 16, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0627F, 16.0384F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0443F, -0.1744F, 0.0077F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.059F, -0.4024F);
        this.tail3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0524F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 32, -0.5F, 1.1F, 0.2F, 1, 2, 15, 0.005F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.109F, 14.6976F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0886F, -0.1739F, 0.0154F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.6459F, 0.1329F);
        this.tail4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 25, -0.5F, 1.0F, -0.2F, 1, 2, 16, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.5041F, 15.9329F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1839F, 0.0858F, -0.0159F);
        this.tail5.cubeList.add(new ModelBox(tail5, 57, 15, -0.5F, 0.3052F, -0.2213F, 1, 1, 13, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.4448F, 12.8787F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.1329F, 0.173F, -0.023F);
        this.tail6.cubeList.add(new ModelBox(tail6, 53, 75, -0.5F, 0.8F, -0.3F, 1, 1, 10, -0.15F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.15F, 10.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.3193F, 0.2909F, -0.0945F);
        this.tail7.cubeList.add(new ModelBox(tail7, 45, 54, -0.5F, 0.6386F, -0.4016F, 1, 1, 13, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1F, -5.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 54, 0, -0.5F, -0.669F, -19.9704F, 1, 2, 12, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -1.669F, -7.8704F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0698F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 83, -1.0F, 1.0F, -0.1F, 1, 2, 8, 0.005F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.069F, -19.8704F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.131F, 0.0433F, 0.0057F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.5F, -3.0F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0349F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 114, 52, -0.5F, -1.2141F, -0.0945F, 1, 2, 3, 0.005F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.5F, -12.0F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0349F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 69, -0.5F, -0.9F, 0.0F, 1, 2, 9, 0.0F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(8.0F, 9.2F, -10.7F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.2106F, 0.0059F, -0.056F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.3F, 5.0347F, 0.6893F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.0908F, 0.0F, 0.0F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 3.8693F, 0.2266F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, 0.0F, 0.4363F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-8.0F, 9.2F, -10.7F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.2618F, -0.2618F, 0.0F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.3F, 5.0347F, 0.6893F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.0908F, 0.0F, 0.0F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2F, 3.8693F, 0.2266F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.0F, -0.4363F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.6F, -12.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.6504F, -0.1915F, 0.0368F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.7415F, -5.052F);
        this.neck1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3146F, -0.0304F, -0.0172F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 97, 14, -0.3F, -1.0F, 0.1F, 1, 2, 6, 0.005F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.7415F, -4.952F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.1095F, -0.2314F, -0.1578F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.7F, -6.3F);
        this.neck2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1222F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 81, -0.5F, 0.9F, -1.0F, 1, 2, 8, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.8572F, -7.4387F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3514F, -0.4393F, -0.2005F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -2.1315F, -2.0346F);
        this.neck3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1047F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 87, 0.0F, 0.8815F, -6.9683F, 1, 2, 7, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.0685F, 1.3654F);
        this.neck3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.48F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 115, 0.0F, 0.5F, -3.6F, 1, 2, 3, 0.005F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.6315F, -8.6346F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.3505F, -0.0791F, -0.037F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.0F, -0.6718F, 0.2449F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(0.0F, -0.6718F, 0.2449F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 4.6782F, 2.3449F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5236F, 0.0F, 0.0F);

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
