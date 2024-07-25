package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonKlamelisaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftFoot2;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightFoot2;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer neck7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck6;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r16;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r17;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r18;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;

    public ModelSkeletonKlamelisaurusFrame() {
        this.textureWidth = 208;
        this.textureHeight = 208;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, -40.0F, 14.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 46.0F, 6.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0F, 0.0F, 1.0036F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -0.3859F, 0.9147F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5708F, -0.2094F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, -7, 100, -0.5F, -0.5F, -12.0F, 1, 1, 26, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.3422F, 1.3306F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.7802F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 116, -0.5F, -0.5F, 2.0F, 1, 1, 11, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.8F, -7.4F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2094F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 107, -0.5F, -4.2F, 0.2F, 1, 5, 20, 0.0F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(15.5F, -1.3F, 0.0F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1061F, 0.1107F, 0.4039F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-4.7F, 31.5159F, -0.177F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7732F, -0.1576F, 0.1514F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(1.0F, 21.1765F, 1.4434F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.0436F, -0.0015F, 0.0349F);


        this.leftFoot2 = new ModelRenderer(this);
        this.leftFoot2.setRotationPoint(0.0F, 7.0F, -7.0F);
        this.leftFoot.addChild(leftFoot2);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-15.5F, -1.3F, 0.0F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.5934F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(4.7F, 31.5159F, -0.177F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.4221F, -0.0403F, 0.0167F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(-1.0F, 21.1765F, 1.4434F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.0051F, 0.3237F, 0.305F);


        this.rightFoot2 = new ModelRenderer(this);
        this.rightFoot2.setRotationPoint(0.0F, 7.0F, -7.0F);
        this.rightFoot.addChild(rightFoot2);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -5.7F, -7.4F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0F, -0.1571F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.3F, -1.6F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3752F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, -1.0F, -32.0F, 1, 5, 35, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -13.3F, -31.6F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0154F, 0.1739F, -0.1296F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.1456F, 17.9088F, -16.4409F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.6146F, 0.3653F, 1.6778F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 78, -4, 5.7203F, -0.5F, -12.9658F, 1, 1, 26, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.1456F, 17.9088F, -16.4409F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.9286F, -0.0873F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 75, -7, -0.1456F, -0.5F, -19.7932F, 1, 1, 29, -0.004F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3578F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 82, 0, -0.5F, -1.0F, -22.0F, 1, 5, 23, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(12.0F, 24.45F, -18.5F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.3458F, -0.0521F, 0.8345F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.5F, 24.9487F, 0.2168F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.6981F, 0.0F, 0.0F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(1.5F, 15.8963F, -2.6258F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.8116F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-10.0F, 23.45F, -18.5F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.3049F, -0.0663F, 0.5286F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.5F, 24.9487F, 0.2168F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.414F, -0.08F, -0.1306F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-1.5F, 15.8963F, -2.6258F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 1.2479F, 0.0F, 0.0F);


        this.neck7 = new ModelRenderer(this);
        this.neck7.setRotationPoint(0.0F, -7.0F, -18.0F);
        this.chest.addChild(neck7);
        this.setRotateAngle(neck7, -0.0718F, 0.12F, -0.2253F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -15.1F, -15.2F);
        this.neck7.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.733F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 85, 40, -0.5F, 0.7969F, -1.65F, 1, 4, 22, 0.0F, false));

        this.neck6 = new ModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -14.0F, -17.0F);
        this.neck7.addChild(neck6);
        this.setRotateAngle(neck6, -0.0296F, 0.1275F, -0.2288F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -21.0F, -8.0F);
        this.neck6.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.1345F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 82, 68, -0.5F, 0.6245F, -0.5866F, 1, 4, 23, 0.0F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -20.0F, -8.0F);
        this.neck6.addChild(neck5);
        this.setRotateAngle(neck5, 0.0842F, 0.1745F, -0.105F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -33.5F, -4.2F);
        this.neck5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.4312F, 0.0024F, -0.0173F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 41, -0.5F, 0.681F, -0.2796F, 1, 3, 33, 0.0F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -34.0F, -5.0F);
        this.neck5.addChild(neck4);
        this.setRotateAngle(neck4, 0.1638F, 0.1742F, -0.062F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -30.0F, -2.0F);
        this.neck4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.4573F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 46, 0, -0.5F, 1.2329F, -0.2956F, 1, 2, 31, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -30.0F, -3.0F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.1309F, 0.1396F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -17.2F, -5.4F);
        this.neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.2305F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 116, 0, -0.5F, 0.9064F, -0.0733F, 1, 2, 18, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -17.0F, -6.0F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.2269F, 0.1571F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -10.8F, -6.8F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.9599F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 139, 0, -0.5F, 0.933F, -0.0558F, 1, 2, 13, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -10.0F, -7.0F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.4712F, 0.0F, 0.0F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -5.5F, -4.9F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.733F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 163, 25, -0.5F, 0.9342F, -0.0316F, 1, 2, 7, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -5.9F, -7.1F);
        this.neck.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.4538F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 185, 134, -0.5F, 0.3F, -0.9F, 1, 2, 3, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -6.0F, -7.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0242F, -0.0316F, 0.1271F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.7F, 0.7F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6109F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.4F, 12.9F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.3627F, -0.1221F, -0.4532F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 78, -0.5F, -0.2491F, 0.0696F, 1, 4, 24, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2F, 24.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0678F, -0.2213F, -0.1502F);
        this.tail2.cubeList.add(new ModelBox(tail2, 48, 62, -0.5F, 0.0F, 0.0F, 1, 3, 25, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6F, 25.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0271F, -0.4532F, -0.2486F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.6493F, 2.9289F);
        this.tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.0698F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 76, 125, -0.5F, 0.0F, -4.0F, 1, 2, 16, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.3F, 15.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0852F, -0.396F, -0.1403F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.tail4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.1222F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 109, 103, -0.5F, 1.0F, -1.1F, 1, 2, 22, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.4F, 21.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1241F, -0.4537F, 0.0085F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.tail5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0175F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 114, 67, -0.5F, 0.2F, -0.3F, 1, 1, 19, -0.1F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 19.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.3549F, 0.6603F, 0.068F);
        this.tail6.cubeList.add(new ModelBox(tail6, 55, 122, -0.5F, 0.3F, -0.6F, 1, 1, 17, -0.1F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.0F, 17.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.1041F, 0.5282F, -0.1907F);
        this.tail7.cubeList.add(new ModelBox(tail7, 33, 119, -0.5F, 0.2F, -0.7F, 1, 1, 18, -0.1F, false));

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
