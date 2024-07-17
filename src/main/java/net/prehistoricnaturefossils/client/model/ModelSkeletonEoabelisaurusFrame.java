package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEoabelisaurusFrame extends ModelBase {
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
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer bony;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
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

    public ModelSkeletonEoabelisaurusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -21.0F, 1.2F, 1, 21, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -14.15F, -15.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.2F, -4.85F, -0.5F, 1, 19, 1, -0.21F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -14.15F, -15.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.15F, -4.5F, -0.5F, 1, 7, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -14.5F, 1.7F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -6.5F, -4.5F, -0.5F, 1, 9, 1, -0.2F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -22.25F, 2.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.1745F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.4F, -4.5F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 15, -0.5F, 1.0F, -0.1F, 1, 2, 10, -0.2F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.9F, 1.1807F, -0.5F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3476F, 0.0227F, 0.1289F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-0.4F, 10.0F, -0.4F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.4392F, -0.0151F, 0.0859F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.0F, 10.0F, 1.2F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.132F, -0.1248F, -0.0396F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.3932F, -0.0114F, -0.0865F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.9F, 1.1807F, -0.5F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.7608F, 0.2063F, -0.1347F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.4F, 10.0F, -0.4F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.3243F, -0.1183F, -0.289F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.0F, 10.0F, 1.2F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.8592F, 0.1126F, 0.1335F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.2205F, -0.0145F, 0.086F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1051F, -0.0868F, 0.0091F);
        this.tail.cubeList.add(new ModelBox(tail, -2, 9, -0.4981F, 0.2984F, -0.4251F, 1, 2, 12, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2984F, 10.8314F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0876F, -0.0869F, -0.0076F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0344F, -0.0002F, -0.0061F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -1, 24, -0.5F, -0.2F, -0.2F, 1, 2, 11, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1139F, -0.0867F, -0.0099F);
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 0, -0.5F, 0.2961F, 0.2321F, 1, 1, 11, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0961F, 10.8321F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0437F, 0.0436F, -0.0019F);
        this.tail4.cubeList.add(new ModelBox(tail4, 36, 0, -0.5F, 0.1995F, 0.0218F, 1, 1, 8, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.5005F, 8.0218F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.264F, 0.1264F, -0.0341F);
        this.tail5.cubeList.add(new ModelBox(tail5, 13, 28, -0.5F, 0.7F, -0.2F, 1, 1, 10, -0.2F, false));

        this.bony = new ModelRenderer(this);
        this.bony.setRotationPoint(0.5F, -0.6F, -4.6F);
        this.hips.addChild(bony);
        this.setRotateAngle(bony, 0.0F, -0.0436F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.2F, -5.8F);
        this.bony.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 46, -0.4995F, 0.8765F, -4.958F, 1, 2, 5, -0.2F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -1.2F, -5.7F);
        this.bony.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 37, -0.4995F, 0.8901F, -0.0565F, 1, 2, 6, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.4F, -10.0F);
        this.bony.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0436F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.6F, -5.0F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2094F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 23, -0.4981F, 0.9091F, 0.0426F, 1, 2, 5, -0.2F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(2.7F, 6.375F, -3.4659F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.9041F, 0.3068F, -0.375F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.5F, -0.1343F, 4.6657F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.0538F, -0.0869F, 0.1515F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 0.3F, 3.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.5236F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-3.7F, 6.375F, -3.4659F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.8455F, -0.3315F, 0.4708F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.5F, -0.1343F, 4.6657F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.8356F, 0.0869F, -0.1515F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 0.3F, 3.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.5672F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.9F, -4.9F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, 0.1752F, -0.0859F, -0.0152F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.2F, -2.9F);
        this.neck4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3316F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 56, 29, -1.0F, 0.5F, 0.2F, 1, 1, 4, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(-0.5F, -0.9F, -2.7F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.1329F, -0.173F, -0.023F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.3F, -1.9F, -3.5F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6679F, -0.031F, 0.0154F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 56, -0.7F, -0.3967F, -0.3122F, 1, 1, 5, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.5F, -3.0F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.0F, -0.1745F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -2.4F, -3.2F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5585F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 57, 48, -1.0F, 0.7F, 0.0F, 1, 1, 4, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.1F, -3.4F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.0465F, -0.2577F, 0.1806F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.6F, -1.7F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1396F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 68, 52, -0.4F, 0.7F, -0.1F, 1, 1, 2, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1F, -1.8F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0F, -0.0873F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.7F, 1.9F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.2182F, 0.0F, 0.0F);

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
