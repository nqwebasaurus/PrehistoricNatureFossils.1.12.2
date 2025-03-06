package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTethyshadrosFrame extends ModelBase {
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
    private final ModelRenderer tail;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail6;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer opposablePinkie;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer opposablePinkie2;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r13;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r14;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r15;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer bone;
    private final ModelRenderer jaw;

    public ModelSkeletonTethyshadrosFrame() {
        this.textureWidth = 85;
        this.textureHeight = 85;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 29.0F, -5.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -24.0F, 3.7F, 1, 19, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, -17.85F, -8.1F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3491F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.3F, -3.15F, -0.5F, 1, 16, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -17.85F, -8.1F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 2.15F, -3.0F, -0.5F, 1, 6, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -20.5F, 4.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, -3.2F, -3.5F, -0.5F, 1, 7, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -23.582F, 6.6326F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0611F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.1F, -4.6F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, -0.5F, 1.4926F, -0.1693F, 1, 1, 8, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(3.5F, -0.0743F, -2.0876F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.2967F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 5.8323F, -1.5128F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.5585F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 9.8425F, -1.694F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7243F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 2.6531F, -0.2944F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.4102F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.2681F, -1.0504F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.5F, -0.0743F, -2.0876F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.1833F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 5.8323F, -1.5128F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5585F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 9.8425F, -1.694F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.8116F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 2.6531F, -0.2944F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.8029F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.2681F, -1.0504F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, -0.6981F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.9919F, 3.1708F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1576F, -0.1307F, 0.008F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 20, -0.5F, 0.3232F, 4.5275F, 1, 1, 5, -0.15F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.3768F, 3.9275F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 10, -0.5F, 0.7F, -4.1F, 1, 1, 5, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0157F, 8.9267F);
        this.tail.addChild(tail6);
        this.setRotateAngle(tail6, -0.1253F, -0.2146F, 0.0358F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0075F, 0.0008F);
        this.tail6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 8, -0.5F, 0.3F, 0.1F, 1, 1, 6, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1576F, 5.9006F);
        this.tail6.addChild(tail2);
        this.setRotateAngle(tail2, 0.0451F, -0.2132F, -0.0451F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.2999F, -0.0157F);
        this.tail2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, 0.5F, -0.1F, 1, 1, 8, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.765F, 7.8853F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.096F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 25, 28, -0.5F, 0.6712F, -0.3996F, 1, 1, 5, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.049F, 3.8892F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0698F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 19, 0, -0.5F, 0.7F, 0.0F, 1, 1, 6, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.9F, -4.6F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0165F, -0.1742F, 0.0108F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.6F, -11.8F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2705F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 32, -0.5F, 0.6514F, 4.1985F, 1, 1, 2, -0.15F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.1F, -6.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0611F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 16, -0.5F, 0.7499F, 0.106F, 1, 1, 6, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.734F, -7.8186F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0885F, -0.174F, 0.0138F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.0F, -2.8F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7592F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 6, -0.5F, 0.6999F, -4.5167F, 1, 1, 4, -0.15F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 2.3F, -5.5F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4451F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 9, -0.5F, 0.789F, 2.48F, 1, 1, 4, -0.15F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(2.6543F, 7.5499F, -2.4092F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 1.0781F, 0.2134F, 0.0499F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0891F, 4.23F, 0.9411F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.3576F, -0.5775F, -1.3035F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.372F, 5.3027F, 0.289F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1194F, 0.0554F, 1.095F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(-0.1532F, 0.0858F, 0.8397F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 0.9599F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-2.6543F, 7.5499F, -2.4092F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.6854F, -0.2134F, -0.0499F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0891F, 4.23F, 0.9411F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.363F, -0.5368F, 1.0784F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.372F, 5.3027F, 0.289F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2366F, -0.3066F, -0.3357F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(0.1532F, 0.0858F, 0.8397F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.9599F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.5F, 4.063F, -5.2153F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, -0.4602F, -0.3914F, 0.0325F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.2623F, -3.4861F);
        this.neck4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4887F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 18, -1.0F, 0.717F, 1.1615F, 1, 1, 3, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(-0.5F, 0.8569F, -1.4535F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.4717F, -0.239F, -0.1777F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.2683F, -2.4789F);
        this.neck3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2443F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 51, 53, -0.5F, 0.7928F, 0.3233F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.6097F, -1.7924F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.0944F, -0.1759F, -0.2509F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -3.3626F, -3.5573F);
        this.neck2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4712F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 46, 33, -0.5F, 1.7F, 1.9F, 1, 1, 3, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.115F, -2.4679F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.1311F, -0.0907F, -0.2004F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.111F, -3.5428F);
        this.neck.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2443F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 52, 62, -0.5F, 0.416F, 1.7966F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1986F, -1.3683F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.68F, -0.078F, -0.0063F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.7F, 0.376F, -1.8214F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.7F, 0.376F, -1.8214F);
        this.head.addChild(rightFace);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -0.0552F, -5.9918F);
        this.head.addChild(bone);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0032F, 1.116F, -0.5625F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5674F, -0.0021F, 0.0112F);

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
