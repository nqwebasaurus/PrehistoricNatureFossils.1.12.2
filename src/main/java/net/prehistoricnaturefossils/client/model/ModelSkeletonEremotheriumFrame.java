package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEremotheriumFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer body;
    private final ModelRenderer cube_r8;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer leftArm5;
    private final ModelRenderer leftArm6;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer rightArm5;
    private final ModelRenderer rightArm6;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer leftSygomaticarch;
    private final ModelRenderer rightSygomaticarch;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;

    public ModelSkeletonEremotheriumFrame() {
        this.textureWidth = 135;
        this.textureHeight = 135;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.4F, -30.0F, 11.7F, 1, 30, 1, -0.1F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -35.5F, 12.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -11.4F, -9.5F, -0.5F, 1, 19, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -46.55F, -20.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0524F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 10.55F, -5.5F, -0.5F, 1, 14, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -46.55F, -20.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.0524F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 1.7F, -14.45F, -0.5F, 1, 61, 1, -0.1F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -29.0F, 15.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.4778F, -0.008F, 0.0302F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.0F, -6.4F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5411F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, 0.7943F, 0.0747F, 1, 2, 19, 0.005F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(9.0F, 6.5F, -1.4F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.6429F, -0.1726F, -0.1341F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-1.0F, 13.1F, 3.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.4162F, 0.0425F, 0.1238F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.2F, -3.2F, 12.4F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.7396F, -1.0849F, 0.1496F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-9.0F, 6.5F, -1.4F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3374F, 0.1726F, 0.1341F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(1.0F, 13.1F, 3.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.329F, -0.0425F, -0.1238F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.2F, -3.2F, 12.4F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -2.8433F, 1.1735F, -1.3269F);


        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -2.25F, -6.6F);
        this.hips.addChild(body4);
        this.setRotateAngle(body4, -0.218F, -0.0094F, -0.0426F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.7243F, -5.3348F);
        this.body4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3142F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 71, 16, -0.5F, 0.93F, 0.0731F, 1, 2, 6, 0.004F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.9233F, -2.43F, -5.2721F);
        this.body4.addChild(body3);
        this.setRotateAngle(body3, -0.1134F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.9233F, -1.2943F, -6.8627F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1222F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 62, 26, -0.5F, 1.0939F, -0.0558F, 1, 2, 7, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(-0.9233F, -0.6443F, -6.8627F);
        this.body3.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.4F, -0.1F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 37, -0.5F, 0.0F, -8.4F, 1, 2, 9, 0.004F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.4F, -9.1F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.0436F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.5F, 0.2F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 13, -0.5F, 1.0599F, -8.5382F, 1, 2, 9, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 2.8F, -6.1F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0038F, -0.0435F, -0.0002F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.2F, -0.9F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 37, -0.5F, 0.2F, -12.8F, 1, 2, 12, 0.004F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(6.8906F, 7.8609F, -9.1092F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.8875F, 0.5391F, -0.5596F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, -0.6F, 14.4F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.7316F, -0.0278F, -0.4777F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.8F, 16.9035F, -0.8472F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, 0.0F, 0.1745F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, -0.2164F, 0.0283F, 0.1278F);


        this.leftArm5 = new ModelRenderer(this);
        this.leftArm5.setRotationPoint(0.0F, 3.0F, 1.9F);
        this.leftArm3.addChild(leftArm5);
        this.setRotateAngle(leftArm5, 0.0F, 0.0F, 0.3054F);


        this.leftArm6 = new ModelRenderer(this);
        this.leftArm6.setRotationPoint(0.0F, 3.0F, 3.7F);
        this.leftArm3.addChild(leftArm6);
        this.setRotateAngle(leftArm6, 0.2314F, -0.084F, 0.6939F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-6.8906F, 7.8609F, -9.1092F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.9059F, -0.4241F, 0.4113F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, -0.6F, 14.4F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.3639F, 0.1237F, 0.2333F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.8F, 16.9035F, -0.8472F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.0F, 0.1309F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.211F, -0.056F, -0.2559F);


        this.rightArm5 = new ModelRenderer(this);
        this.rightArm5.setRotationPoint(0.0F, 3.0F, 1.9F);
        this.rightArm3.addChild(rightArm5);
        this.setRotateAngle(rightArm5, 0.0F, 0.0F, -0.48F);


        this.rightArm6 = new ModelRenderer(this);
        this.rightArm6.setRotationPoint(0.0F, 3.0F, 3.7F);
        this.rightArm3.addChild(rightArm6);
        this.setRotateAngle(rightArm6, 0.2314F, 0.084F, -0.6939F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 5.9F, -13.6F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, -0.1309F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.9F, -3.6F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4014F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 82, 11, -0.5F, 0.8F, 0.2F, 1, 2, 5, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.0F, -3.9F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.2831F, -0.165F, -0.1164F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3316F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 96, 67, -0.5F, 0.0F, -3.1F, 1, 2, 4, 0.004F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.3F, -3.1F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0435F, 0.0038F, -0.0872F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.1F, -3.8F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5236F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 97, 82, -0.5F, 0.7742F, 0.0409F, 1, 2, 4, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.9F, -2.3F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.3042F, 0.0741F, -0.1684F);


        this.leftSygomaticarch = new ModelRenderer(this);
        this.leftSygomaticarch.setRotationPoint(2.9479F, 7.3281F, 0.4418F);
        this.head.addChild(leftSygomaticarch);


        this.rightSygomaticarch = new ModelRenderer(this);
        this.rightSygomaticarch.setRotationPoint(-2.9479F, 7.3281F, 0.4418F);
        this.head.addChild(rightSygomaticarch);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.9F, -2.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5672F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 7.2F, 9.3F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.5536F, 0.1115F, -0.0687F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 56, -0.5F, 0.0933F, 0.3971F, 1, 2, 7, 0.006F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1F, 6.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2526F, 0.2538F, 0.0647F);
        this.tail2.cubeList.add(new ModelBox(tail2, 42, 0, -0.5F, 0.0F, -0.1F, 1, 2, 10, 0.006F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.3155F, 0.2494F, 0.0804F);
        this.tail3.cubeList.add(new ModelBox(tail3, 34, 40, -0.5F, -0.3F, -0.7F, 1, 2, 12, -0.15F, false));

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
