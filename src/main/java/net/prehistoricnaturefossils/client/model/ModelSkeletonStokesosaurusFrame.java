package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonStokesosaurusFrame extends ModelBase {
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
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer body;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r10;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonStokesosaurusFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.1F, -11.75F, -5.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -5.25F, -0.5F, 1, 17, 1, -0.21F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.1F, -11.75F, -5.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -5.35F, -2.2F, -0.5F, 1, 5, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -11.75F, -15.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -1.85F, -3.0F, -0.5F, 1, 6, 1, -0.2F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -11.75F, -15.5F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.5F, -5.25F, -0.5F, 1, 17, 1, -0.21F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -17.0F, -5.0F);
        this.fossil.addChild(hips);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.5F, -2.3F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1396F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 22, -0.5F, 0.8F, -0.2F, 1, 1, 6, -0.2F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(1.5F, 0.5F, 0.1F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0873F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.7F, 0.2F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.8901F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 8.0F, 0.7F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.5672F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 4.1F, -0.2F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, -0.2182F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.5F, 0.5F, 0.1F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -1.2584F, 0.2079F, 0.0666F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.7F, 0.2F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.501F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.0F, 0.7F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.0F, -0.116F, -0.0607F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 4.1F, -0.2F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 1.6144F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1F, -2.4F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.0436F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 26, -0.5F, 0.4F, -5.8F, 1, 1, 6, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -5.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0873F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.2F, -3.8F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1571F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 36, -0.5F, 0.8F, 0.3F, 1, 1, 4, -0.2F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(2.5F, 4.8843F, -2.5887F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.3554F, 0.1546F, -0.0812F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.5F, -0.3F, 2.7F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.5708F, 0.0F, -0.3927F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.8F, 0.0F, 3.2F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0983F, -0.478F, -0.0453F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-2.5F, 4.8843F, -2.5887F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -1.2654F, 0.0F, 0.0F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.5F, -0.3F, 2.7F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.4865F, -0.0226F, 0.2608F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.8F, 0.0F, 3.2F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.1034F, 0.5648F, 0.0555F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.1F, 0.6F, -3.8F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.0437F, -0.0436F, -0.0019F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.1F, 0.2178F, -3.0815F);
        this.neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6563F, -0.0692F, 0.0532F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 48, 25, -0.3F, -0.5F, -1.0F, 1, 1, 3, -0.2F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.4F, 0.8F, -1.9F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1571F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 41, -1.0F, -0.1F, -0.1F, 1, 1, 3, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.8F, -3.1F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.337F, -0.4623F, -0.1339F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.4F, -2.4F, -1.6F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.8465F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 39, -1.0F, 0.8059F, -0.0866F, 1, 1, 3, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.92F, -2.1688F, -1.8434F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.3646F, -0.2865F, 0.1074F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.4F, -1.75F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2094F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 49, -1, -1.52F, 0.4F, -0.8F, 1, 1, 3, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.92F, -0.3312F, -1.9566F);
        this.neck.addChild(head);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.2F, 1.3F, 0.1F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2182F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2F, 3.4F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0786F, -0.0435F, 0.0034F);
        this.tail.cubeList.add(new ModelBox(tail, -1, 34, -0.5F, 0.2037F, -0.5609F, 1, 1, 6, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0963F, 4.9391F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1048F, -0.0434F, -0.0046F);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 22, -0.5F, 0.2967F, -0.0627F, 1, 1, 8, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0033F, 7.9373F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1747F, -0.0433F, -0.0057F);
        this.tail3.cubeList.add(new ModelBox(tail3, -2, -2, -0.5F, 0.1949F, -0.5783F, 1, 1, 12, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0949F, 10.9217F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.262F, -0.0426F, 0.0094F);
        this.tail4.cubeList.add(new ModelBox(tail4, 14, 0, -0.5F, -0.0119F, -0.0918F, 1, 1, 9, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.1119F, 8.8082F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3054F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 13, -0.5F, 0.037F, -0.1404F, 1, 1, 9, -0.2F, false));

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
