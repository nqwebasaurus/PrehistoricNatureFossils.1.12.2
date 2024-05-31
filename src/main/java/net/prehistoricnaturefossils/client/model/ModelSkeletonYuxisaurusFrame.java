package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonYuxisaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer spike;
    private final ModelRenderer spike2;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tripartiteOsteoderm2;
    private final ModelRenderer tripartiteOsteoderm5;
    private final ModelRenderer tripartiteOsteoderm3;
    private final ModelRenderer tripartiteOsteoderm6;
    private final ModelRenderer neck2;
    private final ModelRenderer tripartiteOsteoderm;
    private final ModelRenderer tripartiteOsteoderm4;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer topspike;
    private final ModelRenderer topspike5;
    private final ModelRenderer topspike3;
    private final ModelRenderer spikegroup;
    private final ModelRenderer spikegroup3;
    private final ModelRenderer spikegroup2;
    private final ModelRenderer knobs;
    private final ModelRenderer knobs3;
    private final ModelRenderer knobs2;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer topspike2;
    private final ModelRenderer topspike6;
    private final ModelRenderer topspike4;
    private final ModelRenderer spike3;
    private final ModelRenderer spike4;

    public ModelSkeletonYuxisaurusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.25F, 0.0F, -15.25F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -13.0F, 3.75F, 1, 13, 1, -0.02F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.25F, -10.0F, -11.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -2.0F, -3.0F, -0.5F, 1, 7, 1, -0.02F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.4F, -10.0F, 5.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 3.5F, -3.0F, -0.5F, 1, 7, 1, -0.02F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.4F, 0.0F, 0.75F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0873F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.5F, -16.0F, 3.75F, 1, 16, 1, -0.02F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -14.1141F, 5.66F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.root.addChild(hips);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.2609F, -1.66F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 36, -0.5F, 2.3F, -1.475F, 1, 1, 7, -0.02F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.554F, -2.95F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.1309F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.4103F, -5.8353F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 51, 34, -0.5F, 0.3885F, -0.0786F, 1, 1, 6, -0.02F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.4103F, -5.8353F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1396F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 0, -0.5F, 0.379F, -4.9864F, 1, 1, 5, -0.02F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.8931F, -10.6099F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.131F, 0.0433F, 0.0057F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.6299F, -4.2285F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4931F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 47, -0.5F, 0.5037F, -3.2614F, 1, 1, 4, -0.02F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3272F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 57, -0.5F, 0.7646F, -3.9635F, 1, 1, 4, -0.02F, false));

        this.spike = new ModelRenderer(this);
        this.spike.setRotationPoint(3.5F, 2.9839F, -5.3191F);
        this.chest.addChild(spike);


        this.spike2 = new ModelRenderer(this);
        this.spike2.setRotationPoint(-3.5F, 2.9839F, -5.3191F);
        this.chest.addChild(spike2);


        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.05F, 6.675F, -3.85F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.5503F, 0.1634F, -0.2592F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.0403F, 5.7122F, 0.6182F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.8418F, -0.0173F, 0.3059F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.1506F, 4.3033F, 0.2484F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1614F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.05F, 6.675F, -3.85F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.9866F, -0.1634F, 0.2592F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0403F, 5.7122F, 0.6182F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.2769F, 0.0137F, -0.3164F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.1506F, 4.3033F, 0.2484F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 2.3625F, -0.4741F, 0.0013F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 3.1F, -7.1F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.2794F, 0.4193F, -0.1964F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -0.2894F, 0.3784F);
        this.neck1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 4, -0.45F, 0.7517F, -3.9559F, 1, 1, 4, -0.02F, false));

        this.tripartiteOsteoderm2 = new ModelRenderer(this);
        this.tripartiteOsteoderm2.setRotationPoint(1.6F, -1.1894F, -2.6216F);
        this.neck1.addChild(tripartiteOsteoderm2);


        this.tripartiteOsteoderm5 = new ModelRenderer(this);
        this.tripartiteOsteoderm5.setRotationPoint(-1.6F, -1.1894F, -2.6216F);
        this.neck1.addChild(tripartiteOsteoderm5);


        this.tripartiteOsteoderm3 = new ModelRenderer(this);
        this.tripartiteOsteoderm3.setRotationPoint(1.6F, -1.1894F, -0.6216F);
        this.neck1.addChild(tripartiteOsteoderm3);


        this.tripartiteOsteoderm6 = new ModelRenderer(this);
        this.tripartiteOsteoderm6.setRotationPoint(-1.6F, -1.1894F, -0.6216F);
        this.neck1.addChild(tripartiteOsteoderm6);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.1894F, -3.6216F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.2672F, 0.2981F, -0.3802F);


        this.tripartiteOsteoderm = new ModelRenderer(this);
        this.tripartiteOsteoderm.setRotationPoint(1.0F, -0.9914F, -0.8695F);
        this.neck2.addChild(tripartiteOsteoderm);


        this.tripartiteOsteoderm4 = new ModelRenderer(this);
        this.tripartiteOsteoderm4.setRotationPoint(-1.0F, -0.9914F, -0.8695F);
        this.neck2.addChild(tripartiteOsteoderm4);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0914F, -1.8695F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.3131F, 0.3645F, 0.2887F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.1543F, 0.0578F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);


        this.topspike = new ModelRenderer(this);
        this.topspike.setRotationPoint(1.0F, -1.0086F, -7.0846F);
        this.body.addChild(topspike);


        this.topspike5 = new ModelRenderer(this);
        this.topspike5.setRotationPoint(-1.0F, -1.0086F, -7.0846F);
        this.body.addChild(topspike5);


        this.topspike3 = new ModelRenderer(this);
        this.topspike3.setRotationPoint(-1.0F, -1.0086F, -7.0846F);
        this.body.addChild(topspike3);


        this.spikegroup = new ModelRenderer(this);
        this.spikegroup.setRotationPoint(3.5F, 6.1391F, -8.9669F);
        this.body.addChild(spikegroup);


        this.spikegroup3 = new ModelRenderer(this);
        this.spikegroup3.setRotationPoint(-3.5F, 6.1391F, -8.9669F);
        this.body.addChild(spikegroup3);


        this.spikegroup2 = new ModelRenderer(this);
        this.spikegroup2.setRotationPoint(-3.5F, 6.1391F, -8.9669F);
        this.body.addChild(spikegroup2);


        this.knobs = new ModelRenderer(this);
        this.knobs.setRotationPoint(0.0F, 3.7931F, -5.9599F);
        this.body.addChild(knobs);


        this.knobs3 = new ModelRenderer(this);
        this.knobs3.setRotationPoint(0.0F, 3.7931F, -5.9599F);
        this.body.addChild(knobs3);


        this.knobs2 = new ModelRenderer(this);
        this.knobs2.setRotationPoint(0.0F, 3.7931F, -5.9599F);
        this.body.addChild(knobs2);


        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.0F, 1.2391F, 0.64F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.5236F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.8744F, -1.2234F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9425F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 7.3972F, 0.3763F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.0036F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 2.6892F, -0.0791F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.6109F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.0F, 1.2391F, 0.64F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0873F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.8744F, -1.2234F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.8988F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 7.3972F, 0.3763F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.8727F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 2.6892F, -0.0791F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0873F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.1109F, 3.74F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.132F, -0.1298F, 0.0172F);
        this.tail1.cubeList.add(new ModelBox(tail1, 10, 28, -0.5F, 0.5998F, -0.5966F, 1, 1, 7, -0.02F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0498F, 6.4034F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, -0.1745F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 47, -0.5F, 0.6F, 0.0F, 1, 1, 6, -0.02F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.15F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, -0.0873F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 26, -0.5F, 0.5F, 0.0F, 1, 1, 7, -0.02F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.05F, 6.8F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, -0.1309F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 23, 25, -0.5F, 0.5F, -0.05F, 1, 1, 7, -0.02F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.15F, 6.95F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, -0.0873F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 15, -0.5F, 0.7F, 0.0F, 1, 1, 9, -0.02F, false));

        this.topspike2 = new ModelRenderer(this);
        this.topspike2.setRotationPoint(0.15F, -2.0126F, -1.2846F);
        this.hips.addChild(topspike2);
        this.setRotateAngle(topspike2, -0.1745F, 0.0F, 0.0F);


        this.topspike6 = new ModelRenderer(this);
        this.topspike6.setRotationPoint(-0.15F, -2.0126F, -1.2846F);
        this.hips.addChild(topspike6);
        this.setRotateAngle(topspike6, -0.1745F, 0.0F, 0.0F);


        this.topspike4 = new ModelRenderer(this);
        this.topspike4.setRotationPoint(-0.15F, -2.0126F, -1.2846F);
        this.hips.addChild(topspike4);
        this.setRotateAngle(topspike4, -0.1745F, 0.0F, 0.0F);


        this.spike3 = new ModelRenderer(this);
        this.spike3.setRotationPoint(3.5F, -0.1231F, -1.32F);
        this.hips.addChild(spike3);


        this.spike4 = new ModelRenderer(this);
        this.spike4.setRotationPoint(-3.5F, -0.1231F, -1.32F);
        this.hips.addChild(spike4);
        this.hips.addChild(spike4);

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
