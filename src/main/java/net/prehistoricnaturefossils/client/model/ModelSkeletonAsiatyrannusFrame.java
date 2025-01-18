package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAsiatyrannusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightToes;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonAsiatyrannusFrame() {
        this.textureWidth = 73;
        this.textureHeight = 73;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -17.0F, -5.5F, 1, 17, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.9F, -13.0F, -14.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.4189F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.5F, -3.0F, -0.5F, 1, 16, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.9F, -13.2F, -14.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4184F, 0.0213F, -1.523F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -0.7F, -2.6F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -13.0F, -5.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 2.9F, -2.0F, -0.5F, 1, 4, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -17.2F, -5.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0435F, -0.0057F, 0.0433F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.7F, -2.6F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 17, -0.5F, 0.7F, -0.2F, 1, 1, 6, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.2182F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 25, 0.0F, 0.0F, -4.5F, 1, 1, 5, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.1309F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.0F, -0.8F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 19, 0.0F, 0.2F, 0.2F, 1, 1, 1, -0.154F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 17, 0.0F, 0.2F, -3.2F, 1, 1, 4, -0.15F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(2.401F, 3.5767F, -2.9481F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.3229F, 0.2618F, 0.0F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.2812F, 2.6518F, 0.1564F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.9163F, 0.0F, 0.0F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.0446F, 1.2099F, 0.0219F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1571F, 0.0F, 0.4363F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.401F, 3.5767F, -2.9481F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 1.0647F, -0.2618F, 0.0F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.2812F, 2.6518F, 0.1564F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.9163F, 0.0F, 0.0F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.0446F, 1.2099F, 0.0219F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.1571F, 0.0F, -0.4363F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.4F, -3.9F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, -0.0873F, 0.3054F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1222F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 40, -0.5F, -0.2F, 1.6F, 1, 1, 1, -0.155F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 39, -0.5F, -0.2F, 0.0F, 1, 1, 2, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.5F, -1.6F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.2896F, 0.2001F, -0.0849F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -3.0F, -2.6F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7679F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 32, -0.5F, 0.767F, 0.361F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.7F, -3.0F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.48F, 0.1745F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.7F, -1.4F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2443F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 48, -0.5F, 0.6F, 0.3F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2F, -1.0F);
        this.neck.addChild(head);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.6F, 1.24F, -2.4455F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.6F, 1.24F, -2.4455F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.1F, 1.2F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0057F, 0.0F, 0.0F);


        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.9F, 0.4668F, -0.1211F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.8548F, -0.0353F, -0.0257F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.3F, 6.5292F, 1.1169F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.4748F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.1F, 7.5278F, -0.2113F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9599F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 4.8399F, 0.0158F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3054F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 0.0972F, -1.5163F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, 0.0038F, 0.0F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.9F, 0.4668F, -0.1211F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0616F, 0.1822F, -0.12F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.3F, 6.5292F, 1.1169F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.1257F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.1F, 7.5278F, -0.2113F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.0908F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 4.8399F, 0.0158F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.48F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 0.0972F, -1.5163F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.3066F, 0.0062F, -0.0133F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 3.4F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0709F, 0.1741F, -0.0123F);
        this.tail.cubeList.add(new ModelBox(tail, -1, -1, -0.5F, 0.3F, -0.6F, 1, 1, 9, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0156F, 7.8012F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1646F, 0.3016F, 0.0493F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 27, -0.5F, 0.3F, 0.0F, 1, 1, 5, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0131F, 4.9009F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1372F, 0.3027F, 0.0411F);
        this.tail3.cubeList.add(new ModelBox(tail3, -2, 8, -0.5F, 0.2F, -0.7F, 1, 1, 8, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0259F, 6.9034F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.3213F, 0.2073F, -0.0684F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 19, -0.5F, 0.2F, -0.3F, 1, 1, 6, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0684F, 5.8121F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3819F, 0.4084F, -0.1582F);
        this.tail5.cubeList.add(new ModelBox(tail5, 19, 0, -0.5F, 0.2F, -0.4F, 1, 1, 5, -0.15F, false));

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
