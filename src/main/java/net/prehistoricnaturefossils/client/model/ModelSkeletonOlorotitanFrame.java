package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonOlorotitanFrame extends ModelBase {
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
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r13;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonOlorotitanFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -36.0F, 4.1F, 1, 42, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.75F, -16.95F, -21.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2443F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 1.45F, -6.25F, -0.5F, 1, 12, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.75F, -16.95F, -21.7F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2443F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.25F, -14.05F, -0.5F, 1, 37, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -31.0F, 4.6F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 1.5F, -7.0F, -0.5F, 1, 13, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -33.3F, 5.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0873F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.4F, -5.0F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 18, -0.5F, 0.9F, 0.0F, 1, 2, 13, 0.0F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(6.5F, 1.0F, 0.1F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.4887F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 15.9248F, -0.4555F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6545F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 18.1208F, -2.2471F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6545F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.4414F, -0.3063F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.4538F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, -0.0696F, -2.9933F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-6.5F, 1.0F, 0.1F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0524F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 15.9248F, -0.4555F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5236F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 18.1208F, -2.2471F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.9163F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.4414F, -0.3063F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.4538F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, -0.0696F, -2.9933F);
        this.rightLeg4.addChild(rightLeg5);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.8F, -5.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0873F, 0.0435F, -0.0038F);
        this.body.cubeList.add(new ModelBox(body, 17, 39, -0.5F, 0.2661F, -10.0274F, 1, 2, 10, -0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.7339F, -9.9274F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 47, 47, -0.5F, 1.0F, -8.1F, 1, 2, 8, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 2.0661F, -17.7274F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.044F, 0.1308F, 0.0057F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.2579F, -3.5104F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5061F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 79, -0.5F, 0.9552F, -0.0381F, 1, 2, 4, -0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 4.8579F, -6.8104F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.8203F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 73, 28, -0.5F, 0.9135F, -0.1546F, 1, 2, 5, -0.003F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 10.3081F, -9.6365F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.7679F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 58, -0.5F, -1.0025F, -0.1586F, 1, 2, 6, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(5.6F, 14.7579F, -4.3104F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.1121F, 0.1952F, -0.1478F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.2155F, 9.2874F, 2.1638F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.6937F, 0.3693F, -0.1353F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.0583F, 12.1999F, -0.2572F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.5673F, 0.2479F, 0.3146F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(0.0365F, 0.3564F, 0.6637F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 0.3927F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-5.6F, 14.7579F, -4.3104F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.6297F, -0.1952F, 0.1478F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.2155F, 9.2874F, 2.1638F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.6937F, -0.3693F, 0.1353F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0583F, 12.1999F, -0.2572F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.4594F, -0.2548F, -0.6951F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.0365F, 0.3564F, 0.6637F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.3927F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 9.1579F, -10.1104F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, -0.2399F, 0.2327F, 0.0312F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.6772F, -3.6376F);
        this.neck4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5411F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 69, 41, -0.5F, -1.0F, -0.8F, 1, 2, 6, -0.003F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 2.5772F, -3.9376F);
        this.neck4.addChild(neck3);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.7F, -5.6F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4526F, 0.1405F, 0.2036F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 65, 62, -0.7F, -0.9487F, 0.0661F, 1, 2, 7, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.4F, -4.7F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.4302F, 0.2046F, 0.1427F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -6.6263F, -7.1488F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6807F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 42, -0.5F, 0.6982F, 0.8419F, 1, 2, 10, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -5.8263F, -7.2488F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0386F, 0.3393F, 0.1555F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.7867F, -1.2451F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4712F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 60, -0.4F, 0.2F, -1.6F, 1, 2, 4, -0.15F, false));

        this.heads = new ModelRenderer(this);
        this.heads.setRotationPoint(0.0F, -0.8867F, -2.9451F);
        this.neck.addChild(heads);
        this.setRotateAngle(heads, -0.0385F, -0.2129F, -0.0479F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.3583F, 0.106F);
        this.heads.addChild(jaw);
        this.setRotateAngle(jaw, 0.6109F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.1F, 7.6F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0F, -0.1745F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.4099F, -0.0798F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0175F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.5F, -1.0F, 0.0F, 1, 2, 15, -0.003F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2099F, 14.9202F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1672F, -0.1291F, 0.0217F);
        this.tail2.cubeList.add(new ModelBox(tail2, 18, 21, -0.5F, 0.4F, 0.0F, 1, 2, 13, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 12.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1519F, 0.2157F, -0.0328F);
        this.tail3.cubeList.add(new ModelBox(tail3, 36, 26, -0.5F, 0.4F, 0.0F, 1, 2, 11, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0354F, 0.1744F, -0.0062F);
        this.tail4.cubeList.add(new ModelBox(tail4, 35, -1, -0.5F, 0.1F, -0.3F, 1, 1, 12, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1994F, 0.2089F, 0.0007F);
        this.tail5.cubeList.add(new ModelBox(tail5, 20, 0, -0.5F, 0.1F, -0.1F, 1, 1, 13, -0.15F, false));

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
