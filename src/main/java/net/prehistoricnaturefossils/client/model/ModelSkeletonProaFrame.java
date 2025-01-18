package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonProaFrame extends ModelBase {
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
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer opposablePinkie;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer opposablePinkie2;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r13;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonProaFrame() {
        this.textureWidth = 103;
        this.textureHeight = 103;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -28.0F, 2.2F, 1, 28, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(4.0F, -24.0F, -18.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2705F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.7F, -5.0F, -0.5F, 1, 29, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(4.0F, -24.0F, -18.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2705F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.7F, -5.0F, -0.5F, 1, 11, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -24.0F, 2.7F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -2.9F, -5.0F, -0.5F, 1, 9, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -27.6951F, 3.9164F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.384F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.1F, -4.6F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, -0.5F, 0.9926F, -0.2693F, 1, 2, 10, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.5F, 0.6439F, -0.5901F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.0524F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 12.5197F, 0.5597F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.8552F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 11.9387F, -1.395F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.672F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 3.2F, -0.4F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.1484F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.5F, 0.6439F, -0.5901F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.3142F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 12.5197F, 0.5597F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0297F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 11.9387F, -1.395F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.672F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 3.2F, -0.4F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.8901F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, -1.1781F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.3F, 4.5F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2304F, -0.4262F, 0.0966F);
        this.tail.cubeList.add(new ModelBox(tail, 46, 19, -0.5F, 0.2715F, 0.4617F, 1, 2, 5, -0.15F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.1285F, 5.0617F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 14, -0.5F, 0.4001F, -0.093F, 1, 2, 10, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -2.0048F, 14.5917F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2346F, -0.2549F, -0.0602F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 11, -0.5F, 0.6F, 11.3F, 1, 1, 1, -0.15F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, 0.6F, -0.4F, 1, 1, 12, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 11.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1535F, -0.2589F, -0.0396F);
        this.tail3.cubeList.add(new ModelBox(tail3, 27, 0, -0.5F, 0.7712F, -0.0996F, 1, 1, 8, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0288F, 7.9004F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2009F, -0.5148F, 0.0999F);
        this.tail4.cubeList.add(new ModelBox(tail4, 32, 50, -0.5F, 0.8F, -0.2F, 1, 1, 5, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.9635F, 4.8612F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1446F, -0.5625F, 0.0775F);
        this.tail5.cubeList.add(new ModelBox(tail5, 45, 50, -0.5F, -0.2F, -0.4F, 1, 1, 5, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.6F, -4.7F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1418F, -0.1728F, -0.0245F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.5F, -11.7F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2705F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 27, -0.5F, 0.9514F, -0.0015F, 1, 2, 6, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.2F, -5.9F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0611F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 39, -0.5F, 1.0499F, 0.006F, 1, 2, 6, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 2.2F, -11.3F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0175F, -0.0873F, -0.0015F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.8F, -5.8F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4451F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 27, -0.5F, 0.989F, -3.02F, 1, 2, 9, -0.15F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(5.0621F, 11.5206F, -5.0148F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.1396F, 0.0F, -0.1745F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.3374F, 7.874F, 2.266F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.3225F, 0.3084F, 0.3913F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.2F, 5.0F, -1.5F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2294F, 0.3165F, 0.1985F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(0.0294F, 0.3F, 1.749F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 0.4363F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-5.0621F, 11.5206F, -5.0148F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.6894F, 0.0F, 0.1745F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.3374F, 7.874F, 2.266F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.4882F, -0.5379F, -0.0026F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.2F, 5.0F, -1.5F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2294F, -0.3165F, -0.1985F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.0294F, 0.3F, 1.749F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.4363F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 3.457F, -8.4557F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, -0.2619F, 0.1843F, 0.18F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 1.4F, -3.3F);
        this.neck4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4887F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 63, -1.0F, 0.717F, -0.1385F, 1, 1, 5, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.943F, -3.2443F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.2277F, 0.0838F, 0.0187F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.4887F, -3.5934F);
        this.neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2443F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 50, 65, -0.5F, 0.6928F, -0.4767F, 1, 1, 5, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.0887F, -3.8934F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.0432F, 0.0469F, -0.0332F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.3626F, -3.5573F);
        this.neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4712F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 36, -0.5F, 1.6F, -2.0F, 1, 1, 7, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.9107F, -6.038F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.2166F, 0.2559F, 0.0557F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.111F, -3.5428F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2443F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 84, 55, -0.5F, 0.316F, 1.9966F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.594F, -1.7977F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.5045F, -0.0423F, 0.0764F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.0226F, 3.6628F, -1.586F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2183F, -0.0016F, 0.0113F);

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
