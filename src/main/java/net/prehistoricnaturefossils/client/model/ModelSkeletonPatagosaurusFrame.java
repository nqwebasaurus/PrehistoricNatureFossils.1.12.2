package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPatagosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer leftLeg6;
    private final ModelRenderer leftLeg7;
    private final ModelRenderer leftLeg8;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer rightLeg6;
    private final ModelRenderer rightLeg7;
    private final ModelRenderer rightLeg8;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftArm4;
    private final ModelRenderer leftArm5;
    private final ModelRenderer leftArm6;
    private final ModelRenderer rightArm4;
    private final ModelRenderer rightArm5;
    private final ModelRenderer rightArm6;
    private final ModelRenderer upperarmleft;
    private final ModelRenderer lowerarmleft;
    private final ModelRenderer handleft;
    private final ModelRenderer Leftclaw;
    private final ModelRenderer neck6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;

    public ModelSkeletonPatagosaurusFrame() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -1.0F, -44.0F, 15.9F, 2, 44, 2, -0.1F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -31.0F, 16.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -8.0F, -10.0F, 0.0F, 1, 20, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.2F, -31.0F, -18.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1658F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.0F, -9.0F, 0.0F, 1, 18, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.2F, -31.0F, -18.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1658F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -14.0F, -1.0F, 2, 45, 2, -0.1F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -40.8F, 15.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.0785F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -5.0F, -5.1F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 65, 69, -1.0F, 0.3F, -0.9F, 2, 4, 15, 0.0F, false));

        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(8.0F, 3.45F, 1.2F);
        this.hips.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 1.7017F, 0.0F, 0.0F);


        this.leftLeg6 = new ModelRenderer(this);
        this.leftLeg6.setRotationPoint(1.0F, 3.7348F, -17.1514F);
        this.leftLeg5.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.7418F, 0.0F, 0.0F);


        this.leftLeg7 = new ModelRenderer(this);
        this.leftLeg7.setRotationPoint(0.0F, 3.3054F, -16.4392F);
        this.leftLeg6.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, 0.0873F, 0.0F, 0.0F);


        this.leftLeg8 = new ModelRenderer(this);
        this.leftLeg8.setRotationPoint(0.0F, -7.3537F, -1.8561F);
        this.leftLeg7.addChild(leftLeg8);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(-8.0F, 3.45F, 1.2F);
        this.hips.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 1.3963F, 0.0F, 0.0F);


        this.rightLeg6 = new ModelRenderer(this);
        this.rightLeg6.setRotationPoint(-1.0F, 3.7348F, -17.1514F);
        this.rightLeg5.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.48F, 0.0F, 0.0F);


        this.rightLeg7 = new ModelRenderer(this);
        this.rightLeg7.setRotationPoint(0.0F, 3.3054F, -16.4392F);
        this.rightLeg6.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, -0.2182F, 0.0F, 0.0F);


        this.rightLeg8 = new ModelRenderer(this);
        this.rightLeg8.setRotationPoint(0.0F, -7.3537F, -1.8561F);
        this.rightLeg7.addChild(rightLeg8);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -5.0F, -7.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0435F, 0.0038F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.0F, -18.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1222F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 66, -1.0F, 1.0F, 0.0F, 2, 4, 20, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.5F, -18.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0262F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.1F, -9.9F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1396F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.0F, 0.9217F, -0.1407F, 2, 4, 10, 0.0F, false));

        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(7.8412F, 12.7424F, -9.5629F);
        this.chest.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.0873F, 0.0F, 0.0F);


        this.leftArm5 = new ModelRenderer(this);
        this.leftArm5.setRotationPoint(-0.4079F, 16.4601F, -0.9271F);
        this.leftArm4.addChild(leftArm5);
        this.setRotateAngle(leftArm5, -0.3054F, 0.0F, 0.0F);


        this.leftArm6 = new ModelRenderer(this);
        this.leftArm6.setRotationPoint(4.8937F, 10.9475F, -1.6938F);
        this.leftArm5.addChild(leftArm6);
        this.setRotateAngle(leftArm6, 0.2182F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(-7.8412F, 12.7424F, -9.5629F);
        this.chest.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.6109F, 0.0F, 0.0F);


        this.rightArm5 = new ModelRenderer(this);
        this.rightArm5.setRotationPoint(0.4079F, 16.4601F, -0.9271F);
        this.rightArm4.addChild(rightArm5);
        this.setRotateAngle(rightArm5, -0.6109F, 0.0F, 0.0F);


        this.rightArm6 = new ModelRenderer(this);
        this.rightArm6.setRotationPoint(-4.8937F, 10.9475F, -1.6938F);
        this.rightArm5.addChild(rightArm6);
        this.setRotateAngle(rightArm6, 0.7854F, 0.0F, 0.0F);


        this.upperarmleft = new ModelRenderer(this);
        this.upperarmleft.setRotationPoint(9.9F, 30.1082F, 13.023F);
        this.chest.addChild(upperarmleft);
        this.setRotateAngle(upperarmleft, 0.0625F, 0.0F, 0.0F);


        this.lowerarmleft = new ModelRenderer(this);
        this.lowerarmleft.setRotationPoint(0.0F, 12.3226F, 0.4916F);
        this.upperarmleft.addChild(lowerarmleft);
        this.setRotateAngle(lowerarmleft, -0.4552F, 0.0F, 0.0F);


        this.handleft = new ModelRenderer(this);
        this.handleft.setRotationPoint(-0.01F, 8.4811F, -1.6829F);
        this.lowerarmleft.addChild(handleft);
        this.setRotateAngle(handleft, 0.4351F, 0.0F, 0.0F);


        this.Leftclaw = new ModelRenderer(this);
        this.Leftclaw.setRotationPoint(-2.98F, 1.4337F, 1.3758F);
        this.handleft.addChild(Leftclaw);
        this.setRotateAngle(Leftclaw, 0.3183F, 0.2122F, 0.5732F);


        this.neck6 = new ModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, 2.3F, -9.8F);
        this.chest.addChild(neck6);
        this.setRotateAngle(neck6, 0.0873F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.307F, -7.8292F);
        this.neck6.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 34, -1.0F, 0.6214F, -0.8375F, 2, 4, 9, 0.0F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, 0.393F, -7.3292F);
        this.neck6.addChild(neck5);
        this.setRotateAngle(neck5, 0.0252F, 0.221F, -0.0797F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -6.8F, -11.6F);
        this.neck5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4625F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, -1, 90, -1.0F, 0.4988F, -0.0493F, 2, 3, 14, 0.0F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -6.0F, -11.1F);
        this.neck5.addChild(neck4);
        this.setRotateAngle(neck4, 0.1329F, 0.173F, 0.023F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7418F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 126, -1.0F, -15.0F, -3.0F, 2, 15, 3, -0.1F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -10.3F, -10.3F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.3161F, 0.5872F, -0.1793F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.6545F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 126, -0.4F, -15.2F, -1.8F, 1, 16, 2, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -13.1F, -9.3F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.0F, 0.3054F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -7.1106F, -8.0784F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.672F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 124, 104, -0.5F, 0.9726F, 2.9067F, 1, 2, 9, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -4.3106F, -6.6784F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0452F, 0.2615F, 0.0117F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.3F, -4.0F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 140, 3, -0.5F, -0.1F, -0.1F, 1, 2, 5, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.8F, -4.4F);
        this.neck.addChild(head);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(1.5F, 3.4F, -0.4F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(-1.5F, 3.3F, 0.1F);
        this.head.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.3054F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.0F, 9.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.1232F, 0.1299F, 0.016F);
        this.tail.cubeList.add(new ModelBox(tail, 68, 41, -1.0F, -0.9F, -0.8F, 2, 4, 18, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.7F, 17.7F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.143F, 0.216F, -0.0308F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, -1.0F, 0.8F, 0.0F, 2, 4, 29, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.0F, 29.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0536F, -0.2179F, -0.0116F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 34, -1.0F, 0.0F, -1.0F, 2, 3, 28, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 27.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0542F, -0.2614F, -0.014F);
        this.tail4.cubeList.add(new ModelBox(tail4, 35, 38, -0.5F, 0.0F, -0.4F, 1, 2, 28, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 28.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0264F, -0.1309F, 0.0034F);
        this.tail5.cubeList.add(new ModelBox(tail5, 48, 16, -0.5F, 0.0F, -0.7F, 1, 2, 19, -0.1F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 19.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0723F, -0.2611F, 0.0187F);
        this.tail6.cubeList.add(new ModelBox(tail6, 68, 16, -0.5F, 0.0F, -1.0F, 1, 1, 23, -0.1F, false));

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
