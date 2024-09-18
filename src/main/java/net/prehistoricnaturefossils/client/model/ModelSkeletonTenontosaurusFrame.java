package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTenontosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r5;
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
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer body;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r11;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer opposablePinkie;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer opposablePinkie2;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r14;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonTenontosaurusFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -16.0F, -2.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 4.25F, -6.0F, -0.5F, 1, 10, 1, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -16.0F, -2.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 30, -0.9F, -5.0F, -0.5F, 1, 21, 1, 0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.5F, -9.0F, -20.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 1.75F, -3.75F, -0.5F, 1, 10, 1, 0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.5F, -9.0F, -20.5F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 41, 28, 0.5F, -5.0F, -0.5F, 1, 14, 1, 0.003F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -21.5F, -1.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.1298F, 0.017F, -0.1298F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 28, -0.5F, -0.3F, -4.8F, 1, 2, 10, -0.1F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.5F, -0.5F, -0.7F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.5603F, 0.0934F, 0.1476F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 10.0F, -0.9F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.1606F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 10.0354F, -0.1811F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.1345F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.5F, -0.4F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.4276F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.5F, -0.5F, -0.7F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2182F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 10.0F, -0.9F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.2122F, 0.0776F, 0.2041F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 10.0354F, -0.1811F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.1345F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.5F, -0.4F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.384F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, -0.3491F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.9F, 4.8F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0966F, 0.13F, 0.0164F);
        this.tail.cubeList.add(new ModelBox(tail, 40, 38, -0.5F, 1.6F, -0.3F, 1, 2, 6, -0.1F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.2F, 5.0F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 30, -0.5F, 0.4F, 0.2F, 1, 2, 10, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 14.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0176F, 0.1309F, 0.0023F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.tail2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0785F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, 0.7F, -0.1F, 1, 2, 12, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 11.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0964F, 0.0869F, 0.0084F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.3351F, 4.4688F);
        this.tail3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0299F, -0.0099F, -0.0198F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 29, -1, -0.5F, -0.8F, -5.5F, 1, 1, 11, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.6282F, 9.495F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.035F, 0.0872F, 0.0031F);
        this.tail4.cubeList.add(new ModelBox(tail4, 16, 17, -0.5F, -0.1928F, 0.3405F, 1, 1, 11, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.3072F, 11.2405F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0886F, 0.1739F, -0.0154F);
        this.tail5.cubeList.add(new ModelBox(tail5, 16, 3, -0.5F, -0.5F, 0.0F, 1, 1, 11, -0.1F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.9F, 11.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2182F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 14, -0.5F, 0.4F, 0.0F, 1, 1, 12, -0.1F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0076F, 0.0869F, 0.0876F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.8F, -5.4F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1833F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 39, 12, -0.5F, 0.5463F, -6.0286F, 1, 2, 6, -0.1F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.0F, 0.4F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1484F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 16, -0.5F, 0.8608F, -6.1576F, 1, 2, 6, -0.1F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 3.0F, -12.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.0873F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.6F, 0.7F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4102F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 20, -0.5F, 0.53F, -6.0614F, 1, 2, 6, -0.1F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.6F, 5.2F, -3.3F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.8335F, 0.2975F, -0.4347F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.2F, 5.6F, 1.4F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.3715F, 0.4881F, -0.1995F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 7.0F, -1.5F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1855F, 0.3435F, 0.0631F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.leftArm3.addChild(leftArm4);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(0.0294F, 0.3F, 1.749F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 1.1781F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.6F, 5.2F, -3.3F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.8555F, -0.1996F, 0.3451F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.2F, 5.6F, 1.4F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.3211F, -0.3497F, 0.1757F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 7.0F, -1.5F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0518F, -0.3854F, 0.3081F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.0F, 0.0F, -0.3927F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.0294F, 0.3F, 1.749F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 1.1781F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.1F, -3.9F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.4251F, 0.2559F, 0.0592F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.3113F, -0.4934F);
        this.neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2708F, 0.042F, -0.0117F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 40, -0.4F, -1.2619F, -5.9697F, 1, 2, 6, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.9887F, -4.9934F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.3302F, 0.3027F, -0.0594F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -3.2F, -3.7F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4712F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 42, -0.5F, 1.7F, -0.1F, 1, 1, 5, -0.1F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.0F, -4.3F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.1282F, 0.5988F, 0.1582F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.3F, -3.3F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1573F, 0.0517F, -0.0082F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 14, -0.5F, -0.4318F, -0.8252F, 1, 1, 4, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.8F, -3.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.4494F, 0.1581F, -0.2103F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.8464F, -1.1F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);

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
