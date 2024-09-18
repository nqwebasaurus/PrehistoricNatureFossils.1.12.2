package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLeaellynasauraFrame extends ModelBase {
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
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
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
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer head;
    private final ModelRenderer leftBrow;
    private final ModelRenderer rightBrow;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;
    private final ModelRenderer tail8;
    private final ModelRenderer tail9;

    public ModelSkeletonLeaellynasauraFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.6F, -16.0F, 0.0F, 1, 16, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -11.0F, -8.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0349F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.0F, 0.0F, -0.5F, 1, 11, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -11.0F, -8.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0349F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 4.0F, -3.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -15.5F, 0.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.7F, -3.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -16.3F, 0.5F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.5236F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.5F, -2.6F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 36, -1.0F, 0.7F, -0.3F, 1, 1, 7, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.6F, 0.2F, -0.2F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -1.1868F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.1046F, 0.4854F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.3614F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 8.5229F, -0.0954F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.4363F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.1F, 2.5F, -2.8F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.3316F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.6F, 0.2F, -0.2F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -1.405F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.1046F, 0.4854F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.3177F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.5229F, -0.0954F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.2182F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.1F, 2.5F, -2.8F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3752F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.9F, -2.6F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 12, 28, -0.5F, 0.1F, -4.1F, 1, 1, 4, -0.15F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.6F, -4.4F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 41, -1.0F, 0.7F, -3.5F, 1, 1, 4, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.2F, -7.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.0873F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 1.8F, -3.7F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3142F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 27, -1.0F, -0.3516F, -0.3772F, 1, 1, 5, -0.15F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(3.0F, 4.6011F, -2.2655F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.577F, 0.4826F, -0.3713F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.1F, 2.7F, 2.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.1309F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.6F, 2.5F, -2.3F);
        this.leftArm2.addChild(leftArm3);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-3.0F, 4.6011F, -2.2655F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.5392F, -0.3865F, 0.2675F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.1F, 2.7F, 2.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.1745F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.6F, 2.5F, -2.3F);
        this.rightArm2.addChild(rightArm3);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.3F, -3.7F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, -0.3491F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.6F, -1.9F);
        this.neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, -2, -1.0F, -0.3F, -0.7F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1F, -1.8F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.4539F, 0.1347F, 0.0787F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -2.6F, -2.8F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6109F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 44, -1, -1.0F, 0.6F, -0.4F, 1, 1, 5, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.3F, -2.8F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.5958F, 0.2926F, -0.1931F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 45, -0.4F, 0.2F, -2.3F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.3F, -2.1F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2714F, 0.3154F, 0.01F);


        this.leftBrow = new ModelRenderer(this);
        this.leftBrow.setRotationPoint(0.8F, -0.3F, -2.1F);
        this.head.addChild(leftBrow);
        this.setRotateAngle(leftBrow, 0.0F, 0.0698F, 0.0F);


        this.rightBrow = new ModelRenderer(this);
        this.rightBrow.setRotationPoint(-0.8F, -0.3F, -2.1F);
        this.head.addChild(rightBrow);
        this.setRotateAngle(rightBrow, 0.0F, -0.0698F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.2F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.9163F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4F, 3.3F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 38, 7, -0.5F, 0.2F, 0.0F, 1, 1, 6, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.4538F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 14, 24, -0.5F, 0.1F, -0.8F, 1, 1, 10, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.3927F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 27, 21, -0.5F, 0.0F, -0.4F, 1, 1, 9, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.3391F, 0.0222F, 0.0103F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 28, -0.5F, 0.0F, 0.0F, 1, 1, 9, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 15, -0.5F, 0.0F, -0.3F, 1, 1, 11, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3316F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 25, 10, -0.5F, 0.1F, -0.5F, 1, 1, 10, -0.15F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.2182F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 16, 0, -0.5F, 0.0F, 0.2F, 1, 1, 9, -0.15F, false));

        this.tail8 = new ModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.1396F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 14, 15, -0.5F, 0.0F, -0.2F, 1, 1, 9, -0.15F, false));

        this.tail9 = new ModelRenderer(this);
        this.tail9.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, -0.2705F, 0.0F, 0.0F);
        this.tail9.cubeList.add(new ModelBox(tail9, 0, 0, -0.5F, 0.0F, -0.4F, 1, 1, 13, -0.15F, false));

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
