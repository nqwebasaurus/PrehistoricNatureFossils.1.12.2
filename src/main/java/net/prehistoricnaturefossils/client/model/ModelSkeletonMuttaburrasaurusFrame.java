package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMuttaburrasaurusFrame extends ModelBase {
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
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
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
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonMuttaburrasaurusFrame() {
        this.textureWidth = 102;
        this.textureHeight = 102;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -35.0F, -8.0F, 1, 35, 1, -0.15F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.2F, -28.4F, -36.1F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1309F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -9.6F, -0.5F, 1, 38, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.2F, -28.4F, -36.1F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.9F, -7.0F, -0.5F, 1, 13, 1, -0.1F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -27.0F, -7.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -7.5F, -7.0F, -0.5F, 1, 13, 1, -0.1F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -33.0F, -8.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1309F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -6.0F, -5.2F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2967F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 24, -0.5F, 1.0F, 0.3F, 1, 2, 16, 0.004F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(5.5F, -1.2F, 0.6F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1309F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 15.7086F, 1.594F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.8988F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 15.9544F, 1.2932F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7418F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.5F, -0.4F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.1222F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-5.5F, -1.2F, 0.6F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.4363F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 15.7086F, 1.594F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.8988F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 15.9544F, 1.2932F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.829F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.5F, -0.4F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.5585F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.rightLeg4.addChild(rightLeg5);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -5.0F, -5.3F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0003F, 0.0869F, -0.0076F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.1F, -13.9F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2007F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 10, -0.5F, 0.9916F, -0.2872F, 1, 2, 7, 0.004F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -0.7F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 55, 48, -0.5F, 0.0F, -6.4F, 1, 2, 7, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.8F, -13.7F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.044F, 0.1308F, -0.0057F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.7F, -2.0F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 45, 0, -0.5F, 0.1F, -8.0F, 1, 2, 10, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(6.1F, 11.2F, -7.9F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 1.0787F, 0.473F, -0.4867F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.2F, 8.9F, 2.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.4403F, 0.5682F, 0.0691F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.638F, 9.008F, -0.4458F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2562F, 0.2955F, 0.2874F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(-0.6578F, 3.0F, -0.2394F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.0F, 0.0F, 1.5708F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(-0.6284F, 0.3F, 1.5096F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 0.4363F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-6.1F, 11.2F, -7.9F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.999F, -0.2503F, 0.3401F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.2F, 8.9F, 2.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.3975F, -0.2786F, 0.038F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.638F, 9.008F, -0.4458F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2562F, -0.2955F, -0.2874F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.6578F, 3.0F, -0.2394F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.0F, 0.0F, -1.5708F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(0.6284F, 0.3F, 1.5096F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.4363F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 3.2F, -9.2F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, -0.0863F, -0.0876F, -0.0076F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.6F, -2.6F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1396F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 76, 57, -0.5F, -1.0637F, 0.0065F, 1, 2, 3, 0.004F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1222F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 59, 13, -0.5F, 0.5F, -5.4F, 1, 2, 6, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.6F, -8.3F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.1204F, -0.2685F, -0.0126F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -5.0F, -6.2F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6284F, -0.0141F, 0.0103F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 45, -0.8F, 0.6677F, 0.0703F, 1, 1, 9, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -4.5F, -6.0F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.3614F, -0.3976F, -0.2565F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 0.6F, -4.0F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.035F, -0.0698F, -0.0024F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 77, 0, -1.0F, -0.2F, 0.0F, 1, 1, 4, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1F, -3.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.07F, 0.0593F, 0.1113F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.2F, -0.6F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.2217F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4F, 9.6F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.3193F, 0.2909F, -0.0945F);
        this.tail.cubeList.add(new ModelBox(tail, 23, 29, -0.5F, 0.0F, 0.1F, 1, 2, 14, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 13.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0699F, 0.0435F, 0.003F);
        this.tail2.cubeList.add(new ModelBox(tail2, 25, 0, -0.5F, 0.0F, 0.1F, 1, 2, 15, 0.004F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5F, 15.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0464F, -0.3487F, -0.0159F);
        this.tail3.cubeList.add(new ModelBox(tail3, 40, 16, -0.5F, 0.2995F, -0.3218F, 1, 1, 15, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1005F, 13.9782F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0371F, -0.3488F, 0.0127F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.3F, 0.0F, 1, 1, 22, -0.15F, false));

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
