package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonOrnatopsFrame extends ModelBase {
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
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer opposablePinkie;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer opposablePinkie2;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer heads;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r13;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonOrnatopsFrame() {
        this.textureWidth = 144;
        this.textureHeight = 144;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -39.0F, 2.2F, 1, 45, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -26.55F, -28.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 1.9F, -7.45F, -0.5F, 1, 40, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -26.55F, -28.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -5.95F, -4.5F, -0.5F, 1, 13, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -32.0F, 2.7F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 4.7F, -8.0F, -0.5F, 1, 15, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -39.1666F, 3.3439F);
        this.fossil.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.4114F, -5.2615F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 53, -0.5F, 0.9F, 1.0F, 1, 2, 12, 0.0F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(6.5F, 1.4219F, 0.131F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3142F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 19.4952F, 0.4663F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7418F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 19.2315F, -1.3948F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6109F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.4414F, -0.3063F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.4451F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, -0.1995F, -4.5791F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, -0.2182F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-6.5F, 1.4219F, 0.131F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.096F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 19.4952F, 0.4663F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0036F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 19.2315F, -1.3948F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6109F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.4414F, -0.3063F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.4451F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, -0.1995F, -4.5791F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, -0.2182F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.7114F, -5.2632F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0175F, -0.0873F, 0.0015F);
        this.body.cubeList.add(new ModelBox(body, 63, 37, -0.5F, 0.2661F, -10.0274F, 1, 2, 11, -0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.6339F, -9.9274F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1571F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 1, 69, -0.5F, 0.9034F, -8.0741F, 1, 2, 8, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.2161F, -17.9746F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.219F, -0.0852F, 0.0189F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.2579F, -3.5104F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5061F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 103, 45, -0.5F, 0.9552F, -0.0381F, 1, 2, 4, -0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 4.8579F, -6.8104F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.8203F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 87, 87, -0.5F, 0.9135F, -1.1546F, 1, 2, 6, -0.003F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 5.7081F, -7.6365F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.1868F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 63, 51, -0.5F, 0.9369F, -8.9239F, 1, 2, 9, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(6.1591F, 19.2059F, -3.4503F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 1.1734F, 0.0072F, -0.0364F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.6294F, 8.6365F, 1.5062F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.4303F, 0.9045F, -1.1025F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.2276F, 12.7369F, -0.2626F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.4074F, 0.2391F, 0.635F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(-0.1321F, 0.1729F, 0.6956F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 0.1222F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-6.1591F, 19.2059F, -3.4503F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.5189F, -0.0072F, 0.0364F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.6294F, 8.6365F, 1.5062F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.4375F, -0.8612F, 1.1119F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.2276F, 12.7369F, -0.2626F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.3863F, -0.2729F, -0.5518F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(0.1321F, 0.1729F, 0.6956F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.1222F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 13.4779F, -9.7815F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, 0.1891F, 0.3588F, 0.2717F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.6772F, -3.6376F);
        this.neck4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5411F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 88, 96, -0.5F, -1.0F, 0.0F, 1, 2, 5, -0.003F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 2.5772F, -3.4376F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.3529F, 0.346F, 0.1392F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.7F, -5.6F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4712F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 88, 35, -0.5F, -1.0487F, -0.5339F, 1, 2, 7, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.4F, -4.7F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.3927F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -6.6263F, -7.1488F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6807F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 108, 0, -0.5F, 0.6982F, 6.2419F, 1, 2, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.9991F, -2.6096F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.0436F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.7867F, -1.2451F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2967F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 108, 7, -0.5F, 0.2F, -2.6F, 1, 2, 4, -0.15F, false));

        this.heads = new ModelRenderer(this);
        this.heads.setRotationPoint(0.0F, -2.0366F, -3.3024F);
        this.neck.addChild(heads);
        this.setRotateAngle(heads, -0.048F, 0.329F, -0.0296F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(2.5F, -2.0417F, 0.306F);
        this.heads.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-2.5F, -2.0417F, 0.306F);
        this.heads.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.7006F, 0.6661F);
        this.heads.addChild(jaw);
        this.setRotateAngle(jaw, 0.6545F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.8886F, 7.3385F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0886F, -0.1739F, 0.0154F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.4099F, -0.0798F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0175F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 1, 19, -0.5F, -1.0F, 0.0F, 1, 2, 15, -0.003F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2099F, 14.9202F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0542F, -0.2614F, -0.014F);
        this.tail2.cubeList.add(new ModelBox(tail2, 33, 37, -0.5F, 0.4F, -0.5F, 1, 2, 13, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 12.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0452F, -0.2615F, 0.0117F);
        this.tail3.cubeList.add(new ModelBox(tail3, 34, 18, -0.5F, 0.3F, -0.7F, 1, 2, 16, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0397F, 15.0011F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, 0.3927F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 37, 0, -0.5F, 0.2F, 0.0F, 1, 1, 15, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0052F, 15.0608F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, 0.6109F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -0.5F, 0.2F, -0.5F, 1, 1, 17, -0.15F, false));

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
