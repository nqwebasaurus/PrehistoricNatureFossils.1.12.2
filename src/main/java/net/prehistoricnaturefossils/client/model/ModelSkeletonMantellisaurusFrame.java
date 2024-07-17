package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMantellisaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r2;
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
    private final ModelRenderer cube_r3;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
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
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonMantellisaurusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -24.0F, 0.3F, 1, 24, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.6F, -21.0F, -19.0F, 1, 21, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -19.0F, -18.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -3.2F, -4.0F, -0.5F, 1, 9, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 3.6F, -5.0F, 18.8F, 1, 11, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -22.5F, 5.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1745F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.1F, -4.6F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0175F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 14, -0.5F, 0.9926F, -0.2693F, 1, 2, 10, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.5F, -0.5F, -3.7F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.0419F, 0.0114F, -0.0044F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 10.0F, 0.1F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9425F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 10.2354F, -1.1811F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6109F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 3.2F, -0.4F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.2793F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, -0.3491F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.5F, -0.5F, -3.7F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.5672F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 10.0F, 0.1F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.5533F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 10.2354F, -1.1811F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.1345F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 3.2F, -0.4F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 1.0647F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.1745F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.8F, 4.8F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1139F, 0.0867F, -0.0099F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 44, -0.5F, 1.8F, 0.3F, 1, 2, 5, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.2F, 5.0F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0349F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 4, -0.5F, 0.3F, -0.1F, 1, 2, 10, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 14.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0263F, 0.0872F, 0.0023F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, -1, -1, -0.5F, 0.5F, -0.3F, 1, 1, 13, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 11.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0526F, 0.0871F, 0.0046F);
        this.tail3.cubeList.add(new ModelBox(tail3, 28, 27, -0.5F, 0.6712F, 0.5004F, 1, 1, 8, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0288F, 7.9004F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0704F, -0.1306F, -0.0092F);
        this.tail4.cubeList.add(new ModelBox(tail4, 26, 17, -0.5F, 0.7F, 0.0F, 1, 1, 8, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.9F, 7.9F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1063F, -0.1736F, 0.0184F);
        this.tail5.cubeList.add(new ModelBox(tail5, 13, 17, -0.5F, -0.3F, -0.2F, 1, 1, 10, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0403F, 0.0116F, -0.0204F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.1F, -11.4F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2705F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 37, 11, -0.5F, 0.9514F, -0.0015F, 1, 2, 6, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.8F, -5.6F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0611F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 37, -0.5F, 1.0499F, 0.006F, 1, 2, 6, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 3.0F, -12.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0436F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.1F, -4.8F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4451F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 32, -0.5F, 0.0572F, 0.2813F, 1, 2, 6, -0.15F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.6F, 6.5F, -5.4F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.9599F, 0.0F, -0.1745F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.2F, 5.6F, 1.4F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.1865F, 0.3624F, -0.2385F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.2F, 5.0F, -1.5F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.3228F, 0.2204F, 0.5468F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(0.0294F, 0.3F, 1.749F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 1.1781F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.6F, 6.5F, -5.4F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 1.0036F, 0.0F, 0.1745F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.2F, 5.6F, 1.4F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.2308F, -0.3507F, 0.2465F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.2F, 5.0F, -1.5F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2294F, -0.3165F, -0.1985F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.0294F, 0.3F, 1.749F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 1.1781F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.5F, 0.257F, -4.9557F);
        this.chest.addChild(neck4);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.8F, -3.0F);
        this.neck4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4887F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 52, -1.0F, 0.817F, 0.1615F, 1, 1, 4, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(-0.5F, 0.343F, -2.9443F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.2882F, -0.0418F, -0.0124F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.4887F, -3.5934F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2443F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 52, 18, -0.5F, 0.6928F, -0.2767F, 1, 1, 5, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.0887F, -3.8934F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.288F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.3626F, -3.5573F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4712F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 44, 37, -0.5F, 1.6F, -0.4F, 1, 1, 6, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.0626F, -4.2573F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.131F, -0.0433F, -0.0057F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.111F, -3.5428F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2443F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 52, 48, -0.5F, 0.416F, -0.2034F, 1, 1, 4, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.111F, -3.1428F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.288F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.6629F, -1.2864F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0002F, -0.0016F, 0.0113F);

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
