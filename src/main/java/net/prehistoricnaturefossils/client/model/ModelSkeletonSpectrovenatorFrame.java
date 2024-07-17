package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSpectrovenatorFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r2;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r3;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head;
    private final ModelRenderer crest;
    private final ModelRenderer crest2;
    private final ModelRenderer jugal_quadratojugal;
    private final ModelRenderer jugal_quadratojugal2;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonSpectrovenatorFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -18.0F, 3.0F, 1, 18, 1, -0.21F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 0.3F, -18.6F, 13.9F, 1, 19, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -12.5F, 14.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 2.3F, -2.5F, -0.5F, 1, 6, 1, -0.2F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 4.5F, -3.5F, -11.4F, 1, 7, 1, -0.2F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -18.25F, 4.0F);
        this.fossil.addChild(hips);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.1F, 2.3F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 24, 0.0F, 0.6F, -6.6F, 1, 1, 7, -0.2F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(-3.0F, 0.6987F, -0.3458F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.654F, 0.0266F, -0.0346F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.3F, -1.5F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -1.3475F, -0.2129F, -0.0479F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.1F, 6.9443F, 0.0155F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.6939F, -0.0505F, 0.1285F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 0.0873F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(3.0F, 0.6987F, -0.3458F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.0F, 0.0F, 0.0873F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.3F, -1.5F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -1.6131F, 0.0806F, 0.0335F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.1F, 6.9443F, 0.0155F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 1.0894F, 0.0667F, -0.0536F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -0.2182F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.1317F, 0.1304F, -0.0096F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.1F, 5.1F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 7, 0.0F, 0.6F, -5.9F, 1, 1, 6, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.6F, 5.2F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0436F, -0.0871F, 0.0076F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -0.6F, 3.8F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 33, 0.0F, 0.6F, -4.0F, 1, 1, 4, -0.2F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(-2.5F, 3.3807F, 2.7771F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.7218F, 0.2143F, 0.2194F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.8F, 0.0F, -2.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.6144F, -0.116F, -0.0607F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 0.0F, -1.9F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.1745F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(2.5F, 3.3807F, 2.7771F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.5909F, -0.2143F, -0.2194F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.8F, 0.0F, -2.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.6981F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 0.0F, -1.9F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.1745F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, -0.3033F, -0.2211F, 0.024F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.1828F, 1.2627F);
        this.neck3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5585F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 49, -0.5F, -0.7F, -1.0F, 1, 1, 2, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.1F, 1.8F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.0013F, 0.1739F, 0.0154F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -3.0F, 1.2F);
        this.neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5759F, -0.0095F, -0.0146F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 24, -1.1F, 0.1F, 0.6F, 1, 4, 1, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.6F, 1.6F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0751F, -0.2653F, 0.047F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -1.7F, 1.1F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.733F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 28, 0.1F, 0.5662F, -2.2738F, 1, 1, 2, -0.2F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -1.4F, 2.0F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.192F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 49, 39, 0.0F, 0.1F, -0.8F, 1, 1, 2, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.4F, 2.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.4476F, -0.0826F, -0.1313F);


        this.crest = new ModelRenderer(this);
        this.crest.setRotationPoint(-0.3F, 0.4828F, 5.0783F);
        this.head.addChild(crest);
        this.setRotateAngle(crest, 0.0F, -0.0175F, 0.0F);


        this.crest2 = new ModelRenderer(this);
        this.crest2.setRotationPoint(0.3F, 0.4828F, 5.0783F);
        this.head.addChild(crest2);
        this.setRotateAngle(crest2, 0.0F, 0.0175F, 0.0F);


        this.jugal_quadratojugal = new ModelRenderer(this);
        this.jugal_quadratojugal.setRotationPoint(-1.2F, 0.8F, -0.4F);
        this.head.addChild(jugal_quadratojugal);
        this.setRotateAngle(jugal_quadratojugal, -0.0886F, 0.2157F, -0.2215F);


        this.jugal_quadratojugal2 = new ModelRenderer(this);
        this.jugal_quadratojugal2.setRotationPoint(1.2F, 0.8F, -0.4F);
        this.head.addChild(jugal_quadratojugal2);
        this.setRotateAngle(jugal_quadratojugal2, -0.0886F, -0.2157F, 0.2215F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.8F, -0.95F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.6109F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.2F, -3.6F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0887F, -0.1734F, -0.0192F);
        this.tail.cubeList.add(new ModelBox(tail, 12, -1, -0.5F, 0.3F, -8.8F, 1, 1, 9, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, -7.7F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2568F, 0.1689F, -0.0441F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 22, -0.5F, 0.4F, -7.0F, 1, 1, 7, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, -6.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2701F, 0.3006F, -0.0547F);
        this.tail3.cubeList.add(new ModelBox(tail3, 15, 12, -0.5F, 0.3F, -8.4F, 1, 1, 9, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.4241F, 0.0942F, -0.0089F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.2F, -10.0F, 1, 1, 10, -0.2F, false));

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
