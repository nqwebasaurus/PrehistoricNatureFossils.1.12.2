package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonProbactrosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r2;
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
    private final ModelRenderer cube_r3;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer opposablePinkie;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer opposablePinkie2;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonProbactrosaurusFrame() {
        this.textureWidth = 86;
        this.textureHeight = 86;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -27.0F, -4.0F, 1, 27, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -28.0F, -23.3F, 1, 28, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -24.0F, -22.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.4F, -5.0F, -0.5F, 1, 11, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.5F, -4.5F, 18.8F, 1, 10, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -24.6F, 1.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.3578F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.1F, -4.6F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0175F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 4, -0.5F, 0.6926F, -1.3693F, 1, 2, 8, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.5F, 0.1F, -3.9F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1396F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 11.0F, 0.1F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9861F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 11.5354F, -1.6811F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6981F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 3.2F, -0.4F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.2094F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.5F, 0.1F, -3.9F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.0785F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 11.0F, 0.1F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.9431F, 0.0042F, -0.0059F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 11.5354F, -1.6811F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.829F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 3.2F, -0.4F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.1658F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.rightLeg4.addChild(rightLeg5);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.9F, 2.3F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0709F, 0.1741F, -0.0123F);
        this.tail.cubeList.add(new ModelBox(tail, 35, 39, -0.5F, -0.3766F, -0.5972F, 1, 2, 6, -0.154F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.6766F, 4.7028F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0349F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 12, -0.5F, 0.3F, 0.3F, 1, 2, 9, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.8766F, 13.6028F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1787F, 0.2148F, 0.0385F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.1999F, -0.014F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, 0.4F, -0.1F, 1, 1, 10, -0.154F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6999F, 9.886F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0804F, 0.2175F, -0.0174F);
        this.tail3.cubeList.add(new ModelBox(tail3, 13, 16, -0.5F, 0.4712F, -0.0996F, 1, 1, 8, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0288F, 7.8004F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.186F, -0.1716F, 0.0321F);
        this.tail4.cubeList.add(new ModelBox(tail4, 33, 9, -0.5F, 0.5F, -0.1F, 1, 1, 6, -0.154F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 1.0F, 5.9F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2303F, -0.17F, 0.0396F);
        this.tail5.cubeList.add(new ModelBox(tail5, 17, 32, -0.5F, -0.5F, -0.4F, 1, 1, 6, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -5.6F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0436F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.8738F, -10.8006F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2705F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 15, -0.5F, 0.7514F, -0.1015F, 1, 2, 6, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.8262F, -5.0006F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0611F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 40, -0.5F, 0.8499F, -0.194F, 1, 2, 5, -0.154F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.9738F, -10.4006F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1833F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.4F, -5.6F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4276F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 24, -0.5F, 0.6459F, -0.1103F, 1, 2, 6, -0.154F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.6F, 6.9883F, -6.5343F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.8995F, -0.0076F, -0.1744F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.1326F, 6.2005F, 0.9431F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.1102F, 0.4228F, -0.0958F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.2F, 7.9F, -1.6F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1265F, 0.3067F, 0.2896F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(0.0294F, 0.3F, 1.749F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 0.6109F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.6F, 6.9883F, -6.5343F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.4531F, 0.0076F, 0.1744F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.1326F, 6.2005F, 0.9431F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.2F, -0.1543F, -0.14F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.2F, 7.9F, -1.6F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.1395F, 0.1684F, -0.2295F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.0294F, 0.3F, 1.749F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.4038F, 0.3639F, -0.6092F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.5F, 1.675F, -5.4299F);
        this.chest.addChild(neck4);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.682F, -4.0258F);
        this.neck4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4712F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 24, -1.0F, -0.2375F, -0.4515F, 1, 1, 6, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(-0.5F, 2.025F, -3.8701F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.4276F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.3436F, -3.51F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6981F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 70, 51, -0.5F, -0.1052F, 0.3453F, 1, 1, 2, -0.15F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.0436F, -2.01F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3142F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 72, 23, -0.5F, -0.1368F, -0.2394F, 1, 1, 2, -0.154F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.5436F, -3.21F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.3316F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -3.2195F, -3.0783F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4712F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 0, -0.5F, 1.7F, -1.1F, 1, 1, 6, -0.154F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.5195F, -5.0783F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.733F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.111F, -3.5428F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2443F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 47, 62, -0.5F, 0.416F, 0.7966F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.011F, -1.8428F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.8154F, 0.0109F, 0.1848F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.7192F, -1.5788F);
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
