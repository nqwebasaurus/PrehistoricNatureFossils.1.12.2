package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMinqariaFrame extends ModelBase {
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
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
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
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer leftHead;
    private final ModelRenderer rightHead;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonMinqariaFrame() {
        this.textureWidth = 72;
        this.textureHeight = 72;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -20.0F, 6.0F, 1, 20, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, -18.5F, -8.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2094F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.4F, 3.5F, -0.5F, 1, 15, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -18.5F, -8.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2094F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 9.5F, -3.5F, -0.5F, 1, 7, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -18.5F, 6.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -1.2F, -3.5F, -0.5F, 1, 7, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -20.075F, 7.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.1309F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.5F, -3.3F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 0, -1.0F, 0.8F, -0.2F, 1, 1, 7, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.2F, 0.7F, -0.9F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.2269F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.6486F, 0.9687F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7854F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 8.3208F, -1.8471F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.0472F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(-1.0F, 3.3414F, 0.7937F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.3796F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, -0.0696F, -1.9933F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.2F, 0.7F, -0.9F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.7069F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.6486F, 0.9687F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0036F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.3208F, -1.8471F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7418F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(1.0F, 3.3414F, 0.7937F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3229F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, -0.0696F, -1.9933F);
        this.rightLeg4.addChild(rightLeg5);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -3.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.1309F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, -0.5F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 9, -1.0F, 0.3F, -6.3F, 1, 1, 7, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.2F, -6.8F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0873F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 1.4F, -3.3F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3316F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 33, -1.0F, 0.113F, -0.3675F, 1, 1, 4, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 1.5F, -3.7F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.7156F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 18, -1.0F, 0.3F, -5.8F, 1, 1, 6, -0.15F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(3.2F, 10.524F, -6.7378F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 1.0222F, 0.5789F, -0.3744F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.1845F, 3.2874F, 1.1638F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.6274F, 0.205F, -0.1967F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.0583F, 5.8999F, -0.3572F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.4496F, 0.5583F, 0.5829F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(-0.3383F, -1.6081F, 0.6487F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 0.3927F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-3.2F, 10.524F, -6.7378F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.8127F, -0.6446F, 0.3171F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.1845F, 3.2874F, 1.1638F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.4117F, 0.2291F, 0.4052F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0583F, 5.8999F, -0.3572F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2085F, -0.246F, -0.7392F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(0.3383F, -1.6081F, 0.6487F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.3927F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 5.1F, -7.7F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, 0.1745F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.neck4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1396F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 11, -1.0F, 0.2F, -2.7F, 1, 1, 3, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.3F, -2.7F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.4378F, -0.0791F, -0.037F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -1.0F, -2.7F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6021F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 17, -1.0F, -0.5597F, -0.5433F, 1, 1, 4, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.4F, -2.3F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.3428F, -0.1152F, 0.1907F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -0.2F, 0.0F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.405F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 44, -1.0F, 0.1F, -2.8F, 1, 1, 3, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.8F, -0.4F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0F, -0.0436F, 0.1745F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.8F, 0.5F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.213F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 56, -0.5F, 0.5606F, -1.8231F, 1, 1, 2, -0.15F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.8F, 0.5F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.6144F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 6, -0.5F, 0.5606F, 0.1769F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.4F, -0.6F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.3054F, 0.0F, 0.0F);


        this.leftHead = new ModelRenderer(this);
        this.leftHead.setRotationPoint(0.1592F, -0.9679F, -2.6172F);
        this.head.addChild(leftHead);


        this.rightHead = new ModelRenderer(this);
        this.rightHead.setRotationPoint(-0.1592F, -0.9679F, -2.6172F);
        this.head.addChild(rightHead);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.4F, -1.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.0F, 3.6F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0289F, 0.2163F, -0.134F);
        this.tail.cubeList.add(new ModelBox(tail, -2, -2, -0.5F, 0.4F, -0.5F, 1, 1, 8, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1418F, -0.1728F, 0.0245F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 18, -0.5F, 0.3F, 0.2F, 1, 1, 7, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1321F, -0.3896F, 0.0504F);
        this.tail3.cubeList.add(new ModelBox(tail3, 10, 11, -0.5F, 0.3F, -0.2F, 1, 1, 7, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2032F, -0.2611F, 0.0187F);
        this.tail4.cubeList.add(new ModelBox(tail4, 10, 2, -0.6F, 0.4F, -0.4F, 1, 1, 7, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1393F, -0.1308F, -0.0046F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 9, -0.6F, 0.3F, -0.6F, 1, 1, 7, -0.15F, false));

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
