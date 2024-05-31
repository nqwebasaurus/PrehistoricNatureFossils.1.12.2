package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonApatosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer hip;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;
    private final ModelRenderer tail8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer tail11;
    private final ModelRenderer tail12;
    private final ModelRenderer body;
    private final ModelRenderer cube_r12;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r13;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r14;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r15;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r16;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r17;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r18;
    private final ModelRenderer neck6;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer throat;

    public ModelSkeletonApatosaurusFrame() {
        this.textureWidth = 208;
        this.textureHeight = 208;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -1.0F, -55.0F, 22.7F, 2, 55, 2, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -30.5F, 23.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -21.2F, -14.5F, -1.0F, 2, 29, 2, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(3.9F, -34.75F, -20.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -5.25F, -16.5F, -1.0F, 2, 33, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(3.9F, -34.75F, -20.6F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -26.25F, -1.0F, 2, 61, 2, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -51.0F, 10.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 1.5708F, 0.0F, 0.0F);


        this.hip = new ModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 16.0F, 4.0F);
        this.root.addChild(hip);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -15.484F, 5.1554F);
        this.hip.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.8762F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 27, -2.0F, -0.0702F, -0.4404F, 4, 4, 28, -0.2F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(16.0F, -3.25F, -5.0F);
        this.hip.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0436F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-3.0F, 1.7348F, -27.6514F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.2618F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 3.0F, -15.5F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.0873F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, -6.3142F, -8.231F);
        this.leftLeg3.addChild(leftLeg4);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-16.0F, -3.25F, -6.0F);
        this.hip.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3491F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(3.0F, 1.7348F, -27.6514F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.1309F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 3.0F, -15.5F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.2618F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, -6.3142F, -8.231F);
        this.rightLeg3.addChild(rightLeg4);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 10.8F, -4.1F);
        this.hip.addChild(tail1);
        this.setRotateAngle(tail1, -0.4737F, -0.0803F, -0.1551F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -6.929F, -1.156F);
        this.tail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 113, 150, -1.5F, 5.9F, -3.6F, 3, 20, 4, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 18.171F, 5.044F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1705F, 0.0376F, -0.215F);
        this.tail2.cubeList.add(new ModelBox(tail2, 59, 126, -1.5F, -0.7482F, -3.1932F, 3, 28, 4, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 27.9518F, 0.2068F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1719F, 0.0302F, -0.1719F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.0679F, 0.096F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 91, 132, -1.5F, -1.6F, -2.5F, 3, 28, 3, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 26.3321F, -0.604F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0807F, 0.0334F, -0.3914F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.6241F, -0.7911F);
        this.tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 104, 149, -1.0F, 0.0F, -1.7F, 2, 29, 2, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 27.1759F, 2.8089F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0859F, 0.0151F, -0.1739F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.1864F, -0.2971F);
        this.tail5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 27, -0.5F, -0.5F, -1.5F, 1, 17, 1, -0.2F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 16.3136F, 0.7029F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0F, 0.0F, -0.3491F);
        this.tail6.cubeList.add(new ModelBox(tail6, 75, 190, -0.5F, -1.0F, -1.4F, 1, 14, 1, -0.2F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 12.8F, 0.05F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.0832F, -0.0262F, -0.3043F);
        this.tail7.cubeList.add(new ModelBox(tail7, 189, 183, -0.5F, -0.1784F, -1.4443F, 1, 14, 1, -0.2F, false));

        this.tail8 = new ModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, 14.3216F, -0.4443F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.1278F, -0.0283F, -0.2164F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.5077F, 0.6175F);
        this.tail8.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 164, 185, 0.1F, -0.5F, -1.7F, 1, 15, 1, -0.2F, false));

        this.tail9 = new ModelRenderer(this);
        this.tail9.setRotationPoint(0.0F, 14.1923F, 1.3175F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, -0.1278F, 0.0283F, 0.2164F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.2146F, 0.2974F);
        this.tail9.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 186, -0.5F, -0.4F, -1.5F, 1, 14, 1, -0.2F, false));

        this.tail10 = new ModelRenderer(this);
        this.tail10.setRotationPoint(0.0F, 13.9854F, 0.6974F);
        this.tail9.addChild(tail10);
        this.setRotateAngle(tail10, -0.0807F, 0.0334F, 0.3914F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.2F, -0.6026F, -0.8608F);
        this.tail10.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.0175F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 107, 190, -0.5F, -0.1F, -0.5F, 1, 11, 1, -0.2F, false));

        this.tail11 = new ModelRenderer(this);
        this.tail11.setRotationPoint(0.0F, 10.1974F, -0.1608F);
        this.tail10.addChild(tail11);
        this.setRotateAngle(tail11, -0.3655F, 0.147F, 0.3655F);
        this.tail11.cubeList.add(new ModelBox(tail11, 169, 185, -0.5F, -0.3166F, -1.3485F, 1, 14, 1, -0.2F, false));

        this.tail12 = new ModelRenderer(this);
        this.tail12.setRotationPoint(0.0F, 13.6834F, 0.1515F);
        this.tail11.addChild(tail12);
        this.setRotateAngle(tail12, -0.3271F, 0.2213F, 0.5742F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -15.5F, 5.0F);
        this.hip.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0873F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -23.2718F, 3.015F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.7191F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 37, 27, -2.0F, -0.8186F, 0.2757F, 4, 4, 23, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -22.8F, 3.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.0F, 0.1309F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -15.333F, 0.9079F);
        this.chest.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.6144F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 76, 62, -2.0F, -0.5638F, -2.0095F, 4, 4, 18, -0.2F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(15.0F, -8.95F, -24.5F);
        this.chest.addChild(leftArm);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.5F, -4.3855F, -17.0197F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.829F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(1.0F, -0.5111F, -13.9829F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.7418F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-15.0F, -8.95F, -24.5F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.48F, 0.0F, 0.0F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.5F, -4.3855F, -17.0197F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.5236F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.0F, -0.5111F, -13.9829F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0873F, 0.0F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -15.7F, 0.95F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.3747F, 0.0747F, 0.2995F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -5.2961F, -0.0567F);
        this.neck1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 37, 27, -2.0F, -11.9529F, -3.4544F, 4, 18, 4, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -16.3067F, -0.5158F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1711F, -0.0914F, 0.2372F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -23.5632F, 4.1558F);
        this.neck2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1134F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 74, 128, -2.0F, -0.7F, -4.4F, 4, 26, 4, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -24.2377F, 3.1173F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1765F, -0.2633F, 0.2678F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -16.0374F, 2.8717F);
        this.neck3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, -0.0175F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 162, -1.5F, -0.1522F, -2.5013F, 3, 20, 3, -0.2F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -15.2374F, 3.4217F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.1344F, -0.1793F, 0.373F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.8F, -18.3588F, -0.6306F);
        this.neck4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0645F, -0.0077F, 0.0375F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 53, 175, -1.0F, -1.0207F, -0.4071F, 2, 19, 2, -0.2F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -18.3343F, 1.326F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.1701F, -0.3248F, 0.3434F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -7.5945F, 2.0058F);
        this.neck5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1047F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 43, -1.0F, -0.4608F, -3.5326F, 2, 8, 2, -0.2F, false));

        this.neck6 = new ModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -7.3445F, 0.6558F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.1309F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 85, 63, -1.0F, -5.7922F, -2.1568F, 2, 5, 2, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -4.8692F, -0.7612F);
        this.neck6.addChild(head);
        this.setRotateAngle(head, -0.0269F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -0.35F, -1.05F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5672F, 0.0F, 0.0F);


        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.5F, -8.0461F, -4.2632F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0436F, 0.0F, 0.0F);

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
