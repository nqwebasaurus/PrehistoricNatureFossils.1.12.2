package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTenontosaurusFrame extends ModelBase {
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
    private final ModelRenderer tail6;
    private final ModelRenderer body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r9;
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
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonTenontosaurusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -22.0F, -2.6F, 1, 22, 1, -0.15F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-5.8F, -21.0F, -22.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.4451F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.4F, -4.0F, -0.5F, 1, 25, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-5.8F, -21.0F, -22.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4451F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.1F, -5.5F, -0.5F, 1, 11, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -20.5F, -2.1F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -1.5F, -5.5F, -0.5F, 1, 10, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -21.5F, -1.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.2618F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, -0.0174F, 0.0015F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 29, -0.5F, -0.2F, -4.6F, 1, 2, 10, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.5F, -0.5F, -0.7F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1745F, 0.0F, 0.0F);


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
        this.setRotateAngle(rightLeg, 0.3054F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 10.0F, -0.9F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.8988F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 10.0354F, -0.1811F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.3526F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.5F, -0.4F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.4276F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.rightLeg4.addChild(rightLeg5);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.9F, 4.8F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1264F, -0.2598F, 0.0326F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 51, -0.5F, 1.5F, 0.4F, 1, 2, 5, -0.15F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.2F, 5.0F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 29, -1, -0.5F, 0.3F, -0.1F, 1, 2, 10, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 14.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0633F, -0.4799F, -0.0091F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, -1, -1, -0.6F, 0.6F, -0.7F, 1, 2, 13, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 11.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0526F, -0.2182F, -0.0019F);
        this.tail3.cubeList.add(new ModelBox(tail3, 30, 17, -0.5F, 0.6712F, -0.0996F, 1, 1, 10, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.3782F, 9.745F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0532F, -0.1303F, 0.0126F);
        this.tail4.cubeList.add(new ModelBox(tail4, 16, 18, -0.5F, 0.28F, -0.1843F, 1, 1, 11, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.58F, 11.0157F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0928F, -0.3477F, 0.0317F);
        this.tail5.cubeList.add(new ModelBox(tail5, 15, 3, -0.6F, -0.3F, -0.6F, 1, 1, 12, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.9F, 11.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0268F, -0.4677F, 0.1122F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 15, -0.5F, 0.5F, -0.3F, 1, 1, 12, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0456F, 0.3089F, 0.0735F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.8F, -5.4F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1833F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 40, -0.4F, 0.6463F, -5.7286F, 1, 2, 6, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.3765F, -2.2353F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1484F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 42, -0.5F, -1.0F, -3.0F, 1, 2, 6, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 3.0F, -12.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.088F, 0.1304F, -0.0115F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.6F, 0.7F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4102F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 43, 0, -0.5F, 0.63F, -5.6614F, 1, 2, 6, -0.15F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.6F, 5.2F, -3.3F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0316F, 0.3332F, -0.7489F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.2F, 5.6F, 1.4F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.1946F, 0.036F, 0.3006F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 7.0F, -1.5F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1855F, 0.3435F, 0.0631F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.0F, 0.0F, 1.2217F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(0.0294F, 0.3F, 1.749F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 1.1781F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.6F, 5.2F, -3.3F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.721F, -0.2635F, 0.3309F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.2F, 5.6F, 1.4F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.1702F, 0.4613F, -0.2434F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 7.0F, -1.5F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.2508F, -0.3435F, -0.0631F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.0F, 0.0F, -1.4835F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.0294F, 0.3F, 1.749F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 1.1781F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.1F, -3.9F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.2946F, 0.209F, 0.0629F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.3113F, -2.4934F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1396F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 43, 13, -0.5F, -0.5F, -3.1F, 1, 2, 6, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.9887F, -4.9934F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.5029F, 0.3879F, -0.2051F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -3.2F, -3.7F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4712F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 51, 8, -0.5F, 1.8F, -0.1F, 1, 1, 6, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.0F, -4.3F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.2044F, 0.6447F, -0.0429F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.7F, -2.3F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1571F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 17, -0.5F, 1.8F, -1.5F, 1, 1, 4, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.8F, -3.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2564F, 0.2463F, 0.4401F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.8464F, -1.1F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.48F, 0.0F, 0.0F);

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
