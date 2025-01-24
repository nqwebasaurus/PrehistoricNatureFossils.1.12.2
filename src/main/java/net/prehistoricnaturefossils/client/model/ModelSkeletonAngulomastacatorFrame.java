package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAngulomastacatorFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r3;
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
    private final ModelRenderer cube_r4;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r5;
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
    private final ModelRenderer neck5;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer heads;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r12;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonAngulomastacatorFrame() {
        this.textureWidth = 176;
        this.textureHeight = 176;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -41.0F, 3.0F, 1, 47, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -3.5F, -39.0F, -40.0F, 1, 45, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.0F, -38.0F, -39.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -10.5F, -6.6F, -0.5F, 1, 14, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -38.0F, 3.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.5F, -7.0F, -0.5F, 1, 15, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -41.8655F, 1.016F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.0785F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.4114F, -5.2615F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1396F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 48, -0.5F, 0.9F, 1.0F, 1, 2, 17, 0.0F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(6.5F, 0.8654F, 2.625F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.096F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 19.9151F, -0.161F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.0908F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 23.1528F, -2.9908F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6981F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.4414F, -0.3063F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.4451F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, -0.1995F, -4.5791F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, -0.2182F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-6.5F, 0.8654F, 2.625F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.4276F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 19.9151F, -0.161F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0036F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 23.1528F, -2.9908F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6981F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.4414F, -0.3063F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.6196F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, -0.1995F, -4.5791F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, -0.3927F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.7114F, -4.2632F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0792F, 0.1305F, -0.0103F);
        this.body.cubeList.add(new ModelBox(body, 1, 65, -0.5F, 0.3446F, -11.0243F, 1, 2, 11, -0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5554F, -11.0243F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 79, -0.5F, 0.9191F, -9.9753F, 1, 2, 10, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.2879F, -20.8503F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.2175F, -0.0945F, -0.0257F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.7341F, -5.6582F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5061F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 106, 78, -0.5F, 0.9552F, -0.0381F, 1, 2, 6, -0.003F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 5.3341F, -8.9582F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.8203F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 109, 107, -0.5F, 0.9135F, -1.1546F, 1, 2, 6, -0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 6.1842F, -9.7844F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.925F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 51, 68, -0.5F, 0.9369F, -9.9239F, 1, 2, 10, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(6.2282F, 21.9321F, -7.368F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 1.4526F, 0.0072F, -0.0364F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.1956F, 9.7195F, 1.8209F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.4219F, 0.9476F, -1.092F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.2276F, 12.7369F, -0.2626F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.4074F, 0.2391F, 0.635F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(-0.1321F, 0.1729F, 0.6956F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 0.1222F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-6.2282F, 21.9321F, -7.368F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 1.1472F, -0.0072F, 0.0364F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.1956F, 9.7195F, 1.8209F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.4219F, -0.9476F, 1.092F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.2276F, 12.7369F, -0.2626F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.3746F, -0.2891F, -0.5096F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(0.1321F, 0.1729F, 0.6956F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.1222F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 14.2416F, -14.9156F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, 0.0882F, 0.0331F, 0.1729F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.6772F, -3.6376F);
        this.neck4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5411F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 1, 121, -0.5F, -1.1F, 0.3F, 1, 2, 5, -0.003F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 2.2511F, -3.739F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.2007F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.9164F, -6.5763F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4712F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 103, 66, -0.5F, -1.3487F, -0.8339F, 1, 2, 9, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.6164F, -5.6763F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.2711F, -0.1074F, -0.0608F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -6.6263F, -7.1488F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6807F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 132, 87, -0.5F, 0.6982F, 5.5419F, 1, 2, 4, -0.15F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -2.0468F, -2.8524F);
        this.neck2.addChild(neck5);
        this.setRotateAngle(neck5, 0.5735F, 0.0108F, -0.0969F);
        this.neck5.cubeList.add(new ModelBox(neck5, 65, 141, -0.5F, -5.75F, -1.9206F, 1, 6, 2, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -5.5476F, -0.0736F);
        this.neck5.addChild(neck);
        this.setRotateAngle(neck, -0.7679F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.7867F, -1.2451F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2967F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 136, 73, -0.5F, 0.2F, -2.6F, 1, 2, 4, -0.155F, false));

        this.heads = new ModelRenderer(this);
        this.heads.setRotationPoint(0.0F, -1.8192F, -3.6743F);
        this.neck.addChild(heads);
        this.setRotateAngle(heads, 0.2408F, -0.1928F, -0.1347F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(2.5F, -3.4735F, 0.3161F);
        this.heads.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-2.5F, -3.4735F, 0.3161F);
        this.heads.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 4.4989F, 0.1045F);
        this.heads.addChild(jaw);
        this.setRotateAngle(jaw, 0.6981F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.5498F, 12.3411F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0352F, 0.1308F, 0.0046F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.3401F, -2.0786F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0175F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 1, 49, -0.5F, -1.0F, 1.8F, 1, 2, 13, -0.003F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1401F, 12.9214F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0968F, 0.1303F, -0.0126F);
        this.tail2.cubeList.add(new ModelBox(tail2, 55, 0, -0.5F, 0.4F, -0.4F, 1, 2, 13, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 12.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0452F, -0.2615F, 0.0117F);
        this.tail3.cubeList.add(new ModelBox(tail3, -1, 27, -0.5F, 0.2F, -0.6F, 1, 2, 19, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0327F, 17.9013F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0709F, -0.1741F, 0.0123F);
        this.tail4.cubeList.add(new ModelBox(tail4, 39, 28, -0.5F, 0.2F, 0.0F, 1, 1, 18, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0052F, 18.0608F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0361F, 0.2616F, 0.0094F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -0.5F, 0.2F, -0.4F, 1, 1, 26, -0.15F, false));

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
