package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonIguanodonFrame extends ModelBase {
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
    private final ModelRenderer body;
    private final ModelRenderer cube_r3;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer opposablePinkie;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer opposablePinkie2;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;

    public ModelSkeletonIguanodonFrame() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.4F, -40.0F, 0.8F, 1, 40, 1, -0.12F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.4F, -36.0F, -27.1F, 1, 36, 1, -0.12F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -34.0F, -26.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -6.9F, -6.0F, -0.5F, 1, 11, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 2.5F, -8.0F, 27.4F, 1, 15, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -39.9F, 3.0F);
        this.fossil.addChild(hips);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.3F, -6.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0524F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 24, -0.5F, 1.0F, 0.0F, 1, 3, 14, 0.005F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(6.5F, 2.8F, -1.3F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.1222F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 16.3686F, -0.9016F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7592F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 16.8354F, -2.6811F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6981F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.2F, -1.0F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.6021F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, -0.6545F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-6.5F, 2.8F, -1.3F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.4014F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 16.3686F, -0.9016F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7156F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 16.8354F, -2.6811F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6109F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.2F, -1.0F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.2967F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.rightLeg4.addChild(rightLeg5);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.hips.addChild(body);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0175F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -0.3F, -14.9F, 1, 3, 15, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -15.0F);
        this.body.addChild(chest);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 49, -0.5F, 0.0F, -11.6F, 1, 3, 12, 0.005F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.8F, 12.8F, -8.4F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.5164F, -0.0048F, -0.3447F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0611F, 12.3871F, 2.0344F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.6564F, 0.5468F, -0.0034F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.7942F, 10.8866F, 0.9749F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2646F, 0.265F, 0.467F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(-0.2492F, 0.1824F, 1.8494F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 1.1695F, -0.2013F, 0.0846F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.8F, 12.8F, -8.4F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0433F, -0.0167F, 0.2148F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0611F, 12.3871F, 2.0344F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.7722F, -0.4388F, 0.1865F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.7942F, 10.8866F, 0.9749F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.4152F, -0.2868F, -0.3792F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(0.2492F, 0.1824F, 1.8494F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 1.0208F, 0.7493F, -0.3956F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 3.0F, -11.0F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, 0.0F, -0.2182F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.5F, -8.0F);
        this.neck4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -1, 68, -0.5F, -0.7736F, 0.0238F, 1, 2, 9, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.7F, -7.8F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, -0.4363F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.1F, -6.9F);
        this.neck3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2967F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 73, -0.5F, -1.0F, 0.6F, 1, 2, 7, 0.005F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.9F, -6.5F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.0F, -0.4363F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -6.5F, -7.5F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6196F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 55, 17, -0.5F, 0.6911F, 1.1071F, 1, 2, 10, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -5.6F, -7.5F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.2182F, -0.4363F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 100, -0.5F, 0.0066F, -3.1212F, 1, 2, 3, 0.005F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2F, -3.2F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(1.4F, 4.8F, 0.7F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2182F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.0F, 7.8F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2322F, 0.2125F, -0.0498F);
        this.tail.cubeList.add(new ModelBox(tail, 40, 0, -0.5F, -0.6F, -0.1F, 1, 3, 13, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0529F, 0.085F, -0.0091F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 19, -0.5F, -0.6F, -0.2F, 1, 3, 15, 0.005F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.7F, 14.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0266F, -0.1745F, -0.0046F);
        this.tail3.cubeList.add(new ModelBox(tail3, 19, 3, -0.5F, 0.1F, -0.7F, 1, 2, 16, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 14.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1519F, -0.2157F, -0.0328F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 38, -0.5F, 0.1F, -0.1F, 1, 2, 14, 0.005F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.6F, 13.9F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0715F, -0.2176F, 0.0155F);
        this.tail5.cubeList.add(new ModelBox(tail5, 19, 42, -0.5F, 0.5F, -0.1F, 1, 1, 14, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0536F, -0.2179F, 0.0116F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 55, -0.5F, 0.5F, -0.3F, 1, 1, 12, -0.15F, false));

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
