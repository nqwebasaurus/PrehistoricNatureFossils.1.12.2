package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonOuranosaurusFrame extends ModelBase {
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

    public ModelSkeletonOuranosaurusFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -36.0F, -3.2F, 1, 36, 1, -0.03F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -27.5F, -34.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0524F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.9F, -6.5F, -0.5F, 1, 34, 1, -0.03F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -27.5F, -34.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0524F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.0F, -7.0F, -0.5F, 1, 12, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -28.0F, -2.7F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 5.1F, -6.0F, -0.5F, 1, 14, 1, 0.0F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -34.0F, -3.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.2618F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.4F, -5.0F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, 1.0F, 0.0F, 1, 2, 15, 0.0F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(6.5F, 1.0F, 0.1F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0086F, 0.0015F, 0.1745F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 15.3652F, 0.7178F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.0647F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 16.0475F, -0.9467F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7777F, -0.1231F, -0.124F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.4414F, -0.3063F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0175F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, -0.0696F, -2.9933F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-6.5F, 1.0F, 0.1F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.6632F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 15.3652F, 0.7178F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.5882F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 16.0475F, -0.9467F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.1795F, 0.0042F, 0.0102F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.4414F, -0.3063F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.8029F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, -0.0696F, -2.9933F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.3927F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.0F, -8.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0436F, -0.0019F, 0.0436F);
        this.body.cubeList.add(new ModelBox(body, 19, 37, -0.5F, -0.4F, -7.0F, 1, 2, 10, -0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.4F, -7.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3316F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 0, -0.5F, 1.0F, -10.0F, 1, 2, 10, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 4.0F, -18.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0455F, 0.0416F, 0.0455F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.4F, -3.0F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6807F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 51, 57, -0.5F, 1.0855F, 0.0911F, 1, 2, 6, -0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.8029F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 52, -0.5F, -0.1F, -9.0F, 1, 2, 6, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(5.6F, 12.3F, -3.8F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.8106F, 0.276F, -0.307F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.2155F, 9.2874F, 2.0638F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.4148F, 0.5902F, -0.0909F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.0583F, 10.7999F, -0.2572F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.3228F, 0.2204F, 0.5468F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(0.0365F, 0.3564F, 0.6637F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 1.1781F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-5.6F, 12.3F, -3.8F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.3743F, -0.276F, 0.307F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.2155F, 9.2874F, 2.0638F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.4584F, -0.5902F, 0.0909F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0583F, 10.7999F, -0.2572F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.3401F, -0.192F, -0.6311F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.0365F, 0.3564F, 0.6637F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 1.1781F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 6.2F, -6.3F);
        this.chest.addChild(neck4);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.9F, -4.1F);
        this.neck4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5411F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 54, -0.5F, -1.0F, 0.0F, 1, 2, 6, -0.003F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 2.8F, -3.7F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.0324F, 0.1794F, 0.1247F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.6F, -4.4F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1222F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 82, 12, -0.5F, -1.2F, -0.1F, 1, 2, 5, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.4F, -3.9F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.0176F, 0.2633F, 0.1206F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.9F, -4.3F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5934F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 61, -0.5F, 0.678F, 0.46F, 1, 2, 6, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.1F, -4.7F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0816F, -0.1135F, -0.1764F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.0F, -2.8F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2967F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 50, -0.5F, 1.0F, -0.6F, 1, 2, 5, -0.15F, false));

        this.heads = new ModelRenderer(this);
        this.heads.setRotationPoint(0.0F, -0.5F, -3.4F);
        this.neck.addChild(heads);
        this.setRotateAngle(heads, -0.1944F, -0.0836F, -0.0732F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, 0.5F);
        this.heads.addChild(jaw);
        this.setRotateAngle(jaw, 0.829F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.1F, 8.5F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.15F, -0.1285F, 0.0251F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 18, -0.5F, 0.4F, 1.0F, 1, 2, 13, -0.003F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0348F, -0.1309F, -0.0011F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 20, -0.5F, 0.4F, -0.3F, 1, 2, 14, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1598F, 0.2167F, 0.0251F);
        this.tail3.cubeList.add(new ModelBox(tail3, 35, 28, -0.5F, 0.4F, -0.3F, 1, 2, 12, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1573F, 0.5643F, 0.061F);
        this.tail4.cubeList.add(new ModelBox(tail4, 34, 15, -0.5F, 0.2F, 0.0F, 1, 2, 11, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.3551F, 0.2577F, 0.0465F);
        this.tail5.cubeList.add(new ModelBox(tail5, 20, 0, -0.5F, 0.1F, -0.9F, 1, 1, 13, -0.15F, false));

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
