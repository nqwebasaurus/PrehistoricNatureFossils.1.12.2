package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDracoraptorFrame extends ModelBase {
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
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r10;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonDracoraptorFrame() {
        this.textureWidth = 58;
        this.textureHeight = 58;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -13.0F, -11.2F, 1, 13, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -14.0F, -10.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -4.5F, -3.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -14.6F, 0.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0524F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.1F, -3.0F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -14.6F, 0.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0524F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -1.0F, -0.4F, -0.5F, 1, 15, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -15.3F, 0.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.2618F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.5F, 1.0F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 0, -0.5F, -1.6F, -3.5F, 1, 1, 6, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.6F, -0.2F, 0.5F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -1.0903F, 0.0497F, -0.0573F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.1F, 6.8261F, 0.4055F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.1838F, -0.1213F, 0.0493F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.2F, 8.1188F, 0.1069F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.1326F, -0.0643F, -0.059F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 3.7506F, -0.0949F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.7854F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.6F, -0.2F, 0.5F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2856F, -0.0371F, -0.1256F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.1F, 6.8261F, 0.4055F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.1432F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.2F, 8.1188F, 0.1069F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.8273F, 0.0201F, 0.0274F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 3.7506F, -0.0949F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -0.0101F, 0.0284F, 0.0712F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -0.2F, 3.5F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1415F, -0.1308F, 0.0109F);
        this.tail.cubeList.add(new ModelBox(tail, 13, 16, -1.0F, 0.2019F, -0.0051F, 1, 1, 8, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(-0.5F, 0.1019F, 7.9949F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0861F, -0.087F, -0.0302F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 0, -0.5F, 0.0002F, -0.3913F, 1, 1, 9, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1002F, 9.1087F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1836F, 0.1267F, -0.0408F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 16, -0.5F, 0.0058F, -0.8208F, 1, 1, 10, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0942F, 9.9792F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2706F, 0.2527F, -0.0692F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.5582F, -0.7455F);
        this.tail4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.0175F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.3F, -0.2F, -0.3F, 1, 1, 14, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.8F, -2.3F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0003F, 0.0035F, 0.0031F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.5F, -8.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 11, -0.5F, -0.2752F, 0.3203F, 1, 1, 8, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.1F, -8.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1309F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.4F, -1.2F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 29, -0.5F, -0.9F, -2.3F, 1, 1, 4, -0.15F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(2.7F, 3.5F, -2.0F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -1.3493F, 0.1611F, -0.0674F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.5887F, -0.8728F, 3.2529F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.2579F, -0.252F, -0.2177F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.9F, 0.0F, 3.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.2182F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-2.7F, 3.5F, -2.0F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -1.0003F, -0.1611F, 0.0674F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.5887F, -0.8728F, 3.2529F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.0577F, 0.3463F, 0.189F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.9F, 0.0F, 3.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.2182F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.2F, -3.5F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.5672F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.9F, -3.4F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.637F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, -1, -0.5F, -0.8647F, -0.223F, 1, 1, 4, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.2F, -2.4F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.6617F, 0.1427F, -0.1008F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -4.0F, -3.1F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.8116F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.5F, 0.7014F, 0.2918F, 1, 1, 5, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.6F, -3.2F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.2898F, 0.3625F, -0.2154F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.3578F, 0.0688F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1222F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 21, -0.5F, 0.7621F, -2.9756F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4F, -2.1F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.1309F, 0.3491F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.9F, 0.4F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1309F, 0.0F, 0.0F);

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
