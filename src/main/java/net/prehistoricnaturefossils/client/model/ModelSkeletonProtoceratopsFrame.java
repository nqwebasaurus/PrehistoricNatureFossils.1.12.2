package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonProtoceratopsFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r2;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftfoot2;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightfoot2;
    private final ModelRenderer body;
    private final ModelRenderer cube_r3;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r6;
    private final ModelRenderer head;
    private final ModelRenderer leftCheek;
    private final ModelRenderer rightCheek;
    private final ModelRenderer leftBeak;
    private final ModelRenderer rightBeak;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer frill;
    private final ModelRenderer leftFrill;
    private final ModelRenderer rightFrill;
    private final ModelRenderer jaw;
    private final ModelRenderer leftLowerbeak;
    private final ModelRenderer rightLowerbeak;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonProtoceratopsFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -27.0F, -1.1F, 1, 27, 1, 0.005F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.7F, -23.0F, -13.7F, 1, 23, 1, 0.005F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -23.5F, -13.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -7.9F, -6.5F, -0.5F, 1, 12, 1, -0.005F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 2.7F, -5.5F, 12.1F, 1, 11, 1, -0.005F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -26.5F, -1.0F);
        this.fossil.addChild(hips);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.4F, -3.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 13, -0.5F, 0.9F, 0.0F, 1, 2, 10, 0.0F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(3.9F, 0.0033F, 0.2206F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.1484F, 0.0F, 0.0F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(1.0F, 9.3948F, -2.5816F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.4189F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 10.7246F, 5.8116F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.0436F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 4.7F, -1.6F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.2618F, 0.0F, 0.0F);


        this.leftfoot2 = new ModelRenderer(this);
        this.leftfoot2.setRotationPoint(0.0F, 3.3686F, -1.7616F);
        this.leftfoot.addChild(leftfoot2);
        this.setRotateAngle(leftfoot2, -0.0175F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-3.9F, 0.0033F, 0.2206F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.288F, 0.0F, 0.0F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-1.0F, 9.3948F, -2.5816F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.3752F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 10.7246F, 5.8116F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.1309F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 4.7F, -1.6F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.3054F, 0.0F, 0.0F);


        this.rightfoot2 = new ModelRenderer(this);
        this.rightfoot2.setRotationPoint(0.0F, 3.3686F, -1.7616F);
        this.rightfoot.addChild(rightfoot2);
        this.setRotateAngle(rightfoot2, -0.1047F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.3F, -3.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0436F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.3F, 0.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2705F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 0, -0.5F, -0.6F, -7.6F, 1, 2, 8, 0.004F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 2.0F, -7.6F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.0436F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5934F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 15, -0.5F, -0.2F, -8.1F, 1, 2, 8, 0.0F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(5.5F, 10.4651F, -2.3441F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.691F, -0.0998F, -0.4052F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.5796F, 7.2904F, 4.4653F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.3665F, -0.3596F, 0.4729F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(0.4F, 5.6076F, -2.1054F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 1.1522F, -0.0377F, -0.2007F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-5.5F, 10.4651F, -2.3441F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.0436F, 0.0F, 0.2618F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.5796F, 7.2904F, 4.4653F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.2356F, 0.3596F, -0.4729F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(-0.4F, 5.6076F, -2.1054F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.6286F, 0.0377F, 0.2007F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 4.1F, -5.9F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, -0.076F, 0.1815F, 0.0844F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.2F, -1.5F);
        this.neck2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 47, 37, -0.5F, -0.1F, -3.3F, 1, 2, 5, 0.004F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -4.6F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.0635F, 0.3148F, 0.1074F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.4F, -0.2F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 48, -0.4F, -0.4F, -4.3F, 1, 2, 5, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.7F, -3.9F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.0516F, 0.2709F, 0.1354F);


        this.leftCheek = new ModelRenderer(this);
        this.leftCheek.setRotationPoint(2.274F, 2.2982F, -3.537F);
        this.head.addChild(leftCheek);
        this.setRotateAngle(leftCheek, 0.0F, 0.0349F, 0.0F);


        this.rightCheek = new ModelRenderer(this);
        this.rightCheek.setRotationPoint(-2.274F, 2.2982F, -3.537F);
        this.head.addChild(rightCheek);
        this.setRotateAngle(rightCheek, 0.0F, -0.0349F, 0.0F);


        this.leftBeak = new ModelRenderer(this);
        this.leftBeak.setRotationPoint(0.5296F, 2.3472F, -10.2652F);
        this.head.addChild(leftBeak);


        this.rightBeak = new ModelRenderer(this);
        this.rightBeak.setRotationPoint(-0.5296F, 2.3472F, -10.2652F);
        this.head.addChild(rightBeak);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.3F, 3.2F, -8.0F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.3F, 3.2F, -8.0F);
        this.head.addChild(rightFace);


        this.frill = new ModelRenderer(this);
        this.frill.setRotationPoint(0.0F, -5.1F, -3.0F);
        this.head.addChild(frill);
        this.setRotateAngle(frill, -0.0873F, 0.0F, 0.0F);


        this.leftFrill = new ModelRenderer(this);
        this.leftFrill.setRotationPoint(1.517F, -5.2636F, 3.2365F);
        this.frill.addChild(leftFrill);
        this.setRotateAngle(leftFrill, 0.0175F, -0.6109F, 0.0F);


        this.rightFrill = new ModelRenderer(this);
        this.rightFrill.setRotationPoint(-1.517F, -5.2636F, 3.2365F);
        this.frill.addChild(rightFrill);
        this.setRotateAngle(rightFrill, 0.0175F, 0.6109F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(1.0F, 3.6F, 0.7F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5958F, 0.0F, 0.0F);


        this.leftLowerbeak = new ModelRenderer(this);
        this.leftLowerbeak.setRotationPoint(0.3F, 5.7917F, -5.994F);
        this.jaw.addChild(leftLowerbeak);
        this.setRotateAngle(leftLowerbeak, 0.0533F, 0.2018F, 0.2671F);


        this.rightLowerbeak = new ModelRenderer(this);
        this.rightLowerbeak.setRotationPoint(-2.3F, 5.7917F, -5.994F);
        this.jaw.addChild(rightLowerbeak);
        this.setRotateAngle(rightLowerbeak, 0.0533F, -0.2018F, -0.2671F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.0F, 6.7F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.2143F, -0.1685F, 0.0456F);
        this.tail.cubeList.add(new ModelBox(tail, 33, 32, -0.5F, 0.1F, -0.5F, 1, 2, 7, 0.004F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2291F, -0.2608F, 0.0064F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, -0.6F, 0.0F, -0.3F, 1, 2, 10, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2033F, -0.3441F, 0.0578F);
        this.tail3.cubeList.add(new ModelBox(tail3, 15, 3, -0.5F, -0.1F, -0.4F, 1, 1, 10, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2F, 10.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1947F, -0.343F, 0.0662F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 39, -0.6F, 0.1F, -0.7F, 1, 1, 8, -0.2F, false));

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
