package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCarcharodontosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r2;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftToes;
    private final ModelRenderer leftToes2;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightToes;
    private final ModelRenderer rightToes2;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r3;
    private final ModelRenderer bone;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;
    private final ModelRenderer body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;

    public ModelSkeletonCarcharodontosaurusFrame() {
        this.textureWidth = 168;
        this.textureHeight = 168;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -46.0F, 5.0F, 1, 46, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, 2.4F, -45.0F, -27.5F, 1, 45, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -32.0F, -27.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -4.1F, -11.0F, -0.5F, 1, 18, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -13.0F, -7.0F, 32.0F, 1, 15, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -45.5743F, 4.5076F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0F, 0.0F, 0.0436F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.25F, -4.7F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0785F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 31, -0.5F, -0.9822F, -0.6026F, 1, 2, 16, 0.0F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(6.5F, 1.6698F, 1.509F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.183F, -0.0135F, -0.0415F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 19.0135F, 1.0073F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.966F, -0.0212F, -0.0024F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.2F, 15.9357F, -3.4469F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.829F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 6.3553F, 0.6261F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 1.2305F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, -0.5134F, -3.2129F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, -1.1307F, 0.0F, 0.0F);


        this.leftToes2 = new ModelRenderer(this);
        this.leftToes2.setRotationPoint(-2.3106F, -0.5783F, -3.3157F);
        this.leftFoot.addChild(leftToes2);
        this.setRotateAngle(leftToes2, -1.1397F, 0.1388F, -0.1209F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-6.5F, 1.6698F, 1.509F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -1.0996F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 19.0135F, 1.0073F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.5359F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.2F, 15.9357F, -3.4469F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.0908F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 6.3553F, 0.6261F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 1.0559F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, -0.5134F, -3.2129F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.6583F, 0.0F, 0.0F);


        this.rightToes2 = new ModelRenderer(this);
        this.rightToes2.setRotationPoint(2.3106F, -0.5783F, -3.3157F);
        this.rightFoot.addChild(rightToes2);
        this.setRotateAngle(rightToes2, 0.5204F, -0.1473F, 0.0939F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.2389F, 10.5829F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1578F, -0.0855F, 0.0174F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 1.1562F, 0.0709F);
        this.tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1571F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 50, 0.0F, -0.9F, 0.1F, 1, 2, 16, 0.005F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -8.0925F, 7.6858F);
        this.tail1.addChild(bone);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -2.6938F, 15.7709F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.2588F, 0.2581F, 0.0442F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.2627F, -0.0616F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 50, -0.5F, -0.9F, 0.0F, 1, 2, 16, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0627F, 16.0384F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1354F, 0.4359F, 0.0203F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.059F, -0.4024F);
        this.tail3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 69, -0.5F, 1.1F, -0.3F, 1, 2, 15, 0.005F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.109F, 14.6976F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0092F, -0.3054F, 0.0028F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.6459F, 0.1329F);
        this.tail4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 31, -0.5F, 1.0F, -0.5F, 1, 2, 16, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.5041F, 15.9329F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0567F, -0.3921F, 0.0217F);
        this.tail5.cubeList.add(new ModelBox(tail5, 35, 69, -0.5F, 0.3052F, -0.6213F, 1, 1, 13, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.4448F, 12.8787F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.1372F, -0.3027F, 0.0411F);
        this.tail6.cubeList.add(new ModelBox(tail6, 34, 83, -0.5F, 0.8F, -0.7F, 1, 1, 11, -0.15F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.15F, 10.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.3289F, -0.3736F, 0.1239F);
        this.tail7.cubeList.add(new ModelBox(tail7, 51, 0, -0.5F, 0.6386F, -0.0016F, 1, 1, 16, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1F, -5.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.1309F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 64, 69, -0.5F, -0.669F, -19.9704F, 1, 2, 12, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -1.669F, -7.8704F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 41, 96, -1.0F, 1.0F, -0.1F, 1, 2, 8, 0.005F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.069F, -19.8704F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1314F, 0.0865F, 0.0114F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.5F, -3.0F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 138, 111, -0.5F, -1.2141F, -0.0945F, 1, 2, 3, 0.005F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.5F, -12.0F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 84, -0.5F, -0.9F, 0.0F, 1, 2, 9, 0.0F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(8.5484F, 10.9204F, -8.6532F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.6438F, 0.4012F, -0.1159F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.3F, 5.0347F, 0.6893F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.0036F, 0.0F, 0.0F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2F, 3.8693F, 0.2266F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, 0.0F, 0.4363F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-8.5484F, 10.9204F, -8.6532F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.1128F, -0.2618F, 0.0047F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.3F, 5.0347F, 0.6893F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.0036F, 0.0F, 0.0F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2F, 3.8693F, 0.2266F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.0F, -0.4363F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.6F, -12.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.3957F, 0.6088F, 0.2003F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.7415F, -5.052F);
        this.neck1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3142F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 76, 114, -0.5F, -1.0F, 0.1F, 1, 2, 6, 0.005F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.7415F, -4.952F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.4112F, 0.7051F, 0.609F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.7F, -6.3F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1222F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 74, 18, -0.5F, 0.9F, -4.0F, 1, 2, 11, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.0092F, -10.2773F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3227F, 0.5454F, 0.3421F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -1.1365F, 0.3675F);
        this.neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1047F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 102, 0.0F, 0.8815F, -6.9683F, 1, 2, 7, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.6518F, -7.368F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.626F, 0.5819F, 0.1326F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.0F, -0.6718F, 0.2449F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(0.0F, -0.6718F, 0.2449F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 6.4138F, 2.5387F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3054F, 0.0F, 0.0F);

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
