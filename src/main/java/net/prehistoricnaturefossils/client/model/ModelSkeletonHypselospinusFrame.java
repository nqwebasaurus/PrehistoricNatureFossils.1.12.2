package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHypselospinusFrame extends ModelBase {
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
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer opposablePinkie;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer opposablePinkie2;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer heads;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonHypselospinusFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -26.0F, 7.0F, 1, 26, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -18.0F, -16.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1047F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.8F, -6.0F, -0.5F, 1, 24, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -18.0F, -16.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1047F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.5F, -7.0F, -0.5F, 1, 12, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -19.0F, 7.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 5.5F, -5.0F, -0.5F, 1, 11, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -25.778F, 6.3237F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.0873F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.4076F, -4.8257F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 33, -0.5F, 1.0F, 1.0F, 1, 2, 10, 0.0F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(5.0F, 0.4587F, 1.241F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.2531F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 12.6475F, -1.8549F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.8029F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 10.6662F, -0.9948F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.8727F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 3.8217F, 0.1167F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.4102F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, -0.0696F, -1.9933F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, -0.2618F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-5.0F, 0.4587F, 1.241F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2705F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 12.6475F, -1.8549F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.8029F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 10.6662F, -0.9948F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.8727F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 3.8217F, 0.1167F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.4102F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, -0.0696F, -1.9933F);
        this.rightLeg4.addChild(rightLeg5);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.6123F, -3.8127F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0873F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 26, 35, -0.5F, 0.329F, -7.9355F, 1, 2, 8, -0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.2481F, -7.931F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 46, -0.5F, 0.608F, -6.9179F, 1, 2, 7, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.8726F, -14.6793F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.131F, 0.0433F, -0.0057F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 3.0199F, -4.8724F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6807F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 68, 20, -0.5F, 1.0855F, 2.0911F, 1, 2, 4, -0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.5199F, -2.4724F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.7592F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 45, -0.5F, 0.0238F, -6.7611F, 1, 2, 7, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(5.7523F, 10.6437F, -1.6645F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.8893F, 0.1356F, -0.1363F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.523F, 7.1971F, 1.8766F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.8283F, 0.1788F, 0.0722F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.358F, 8.781F, -0.2268F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2294F, 0.3165F, 0.1985F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(0.0365F, 0.3564F, 0.6637F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 0.48F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-5.7523F, 10.6437F, -1.6645F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.3429F, -0.2878F, 0.3105F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.523F, 7.1971F, 1.8766F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.8856F, -0.299F, 0.0282F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.358F, 8.781F, -0.2268F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.5846F, -0.2204F, -0.5468F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.0365F, 0.3564F, 0.6637F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.48F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 6.4632F, -6.9852F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, -0.3499F, 0.0852F, -0.0189F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.9F, -4.1F);
        this.neck4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5411F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 69, 48, -0.5F, -1.0F, 2.0F, 1, 2, 4, -0.003F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.8524F, -2.5106F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.1745F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.5477F, -3.8023F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1222F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 78, 34, -0.5F, -1.0F, 0.4F, 1, 2, 4, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.4523F, -3.3023F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.1537F, 0.3262F, 0.2153F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.9F, -4.3F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5934F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 52, 20, -0.5F, 0.878F, 0.66F, 1, 2, 6, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.1F, -4.7F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.0F, -2.8F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2967F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 94, 67, -0.5F, 1.2F, 1.8F, 1, 2, 2, -0.15F, false));

        this.heads = new ModelRenderer(this);
        this.heads.setRotationPoint(0.0F, -0.2341F, -1.3186F);
        this.neck.addChild(heads);
        this.setRotateAngle(heads, -0.6329F, 0.2569F, 0.0785F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.4266F, -0.2013F);
        this.heads.addChild(jaw);
        this.setRotateAngle(jaw, 0.7505F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2076F, 5.9743F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.062F, -0.2589F, 0.0589F);
        this.tail.cubeList.add(new ModelBox(tail, 1, 17, -0.5F, 0.1732F, -0.3252F, 1, 2, 13, -0.003F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1221F, 12.6761F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1052F, -0.3083F, 0.0098F);
        this.tail2.cubeList.add(new ModelBox(tail2, 33, 0, -0.5F, 0.2F, -0.4F, 1, 2, 9, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.043F, 8.741F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.063F, -0.351F, -0.022F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 46, -0.5F, 0.2F, -0.3F, 1, 2, 8, -0.15F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 7, 53, -0.5F, 0.2F, 7.2F, 1, 2, 1, -0.154F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0015F, 7.8855F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0789F, 0.4309F, -0.1123F);
        this.tail4.cubeList.add(new ModelBox(tail4, 46, 35, -0.5F, 0.2F, -0.1F, 1, 1, 7, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0253F, 6.9951F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1415F, 0.3892F, -0.054F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -0.5F, 0.2F, -0.5F, 1, 1, 15, -0.15F, false));

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
