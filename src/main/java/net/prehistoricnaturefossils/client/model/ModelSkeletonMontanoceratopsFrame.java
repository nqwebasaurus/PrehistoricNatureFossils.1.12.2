package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMontanoceratopsFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer leftfoot;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer rightfoot;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r8;
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

    public ModelSkeletonMontanoceratopsFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -15.0F, 0.3F, 1, 15, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -9.75F, -9.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0175F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -1.25F, -0.5F, 1, 11, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -9.75F, -9.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0175F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.25F, -4.5F, -0.5F, 1, 9, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -11.5F, 0.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -3.3F, -3.5F, -0.5F, 1, 7, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -14.4779F, 0.8381F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.1222F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.4F, -3.0F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 9, -0.5F, 1.7F, 0.9F, 1, 1, 6, -0.15F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(1.9F, -0.2608F, -0.1114F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.1134F, 0.0F, 0.0F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(1.0F, 6.3051F, -2.8363F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.1484F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 6.2405F, 3.8951F);
        this.leftleg2.addChild(leftleg3);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 2.7977F, -0.7022F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -1.3526F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-1.9F, -0.2608F, -0.1114F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.2306F, -0.0345F, -0.0276F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-1.0F, 6.3051F, -2.8363F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.1571F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 6.2405F, 3.8951F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.6545F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 2.7977F, -0.7022F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.3491F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.7634F, -2.1417F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.1309F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -0.3F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2705F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 7, -0.5F, 0.3F, -4.6F, 1, 1, 5, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.1F, -4.7F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0349F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -0.7F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5934F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 17, -0.5F, 0.8F, -5.4F, 1, 1, 6, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(3.56F, 5.4262F, -2.7924F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.0774F, -0.009F, -0.2616F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.3962F, 3.8961F, 2.7698F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.5062F, -0.3596F, 0.4729F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(-0.2909F, 3.4172F, -1.0175F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 2.5063F, -0.0718F, -0.2279F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-3.56F, 5.4262F, -2.7924F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.0337F, 0.009F, 0.2616F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.3962F, 3.8961F, 2.7698F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.1483F, 0.3596F, -0.4729F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(0.2909F, 3.4172F, -1.0175F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.6737F, 0.0718F, 0.2279F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 3.3F, -4.7F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.0F, -0.3491F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.9F, -1.6F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1314F, 0.0865F, 0.0114F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 61, -0.6F, -0.4F, 1.4F, 1, 1, 1, -0.15F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 5, 60, -0.6F, -0.4F, -0.3F, 1, 1, 2, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.327F, -1.7887F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.1443F, -0.4323F, 0.0608F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.2F, 1.3F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 42, -0.5F, -0.9F, -4.8F, 1, 1, 4, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1F, -2.7F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.726F, 0.0086F, -0.1534F);


        this.leftCheek = new ModelRenderer(this);
        this.leftCheek.setRotationPoint(2.5F, 0.5348F, -0.1352F);
        this.head.addChild(leftCheek);
        this.setRotateAngle(leftCheek, -0.7496F, -0.0783F, 0.0577F);


        this.rightCheek = new ModelRenderer(this);
        this.rightCheek.setRotationPoint(-2.5F, 0.5348F, -0.1352F);
        this.head.addChild(rightCheek);
        this.setRotateAngle(rightCheek, -0.7496F, 0.0783F, -0.0577F);


        this.leftBeak = new ModelRenderer(this);
        this.leftBeak.setRotationPoint(0.3296F, 2.5364F, -7.2437F);
        this.head.addChild(leftBeak);
        this.setRotateAngle(leftBeak, 0.2094F, 0.0F, 0.0F);


        this.rightBeak = new ModelRenderer(this);
        this.rightBeak.setRotationPoint(-0.3296F, 2.5364F, -7.2437F);
        this.head.addChild(rightBeak);
        this.setRotateAngle(rightBeak, 0.2094F, 0.0F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.3F, 5.3F, -7.3F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.3F, 5.3F, -7.3F);
        this.head.addChild(rightFace);


        this.frill = new ModelRenderer(this);
        this.frill.setRotationPoint(0.0F, -3.0F, -2.3F);
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
        this.jaw.setRotationPoint(1.0F, 1.5794F, 0.0618F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0722F, 0.0F, 0.0F);


        this.leftLowerbeak = new ModelRenderer(this);
        this.leftLowerbeak.setRotationPoint(0.2948F, 3.8016F, -3.5187F);
        this.jaw.addChild(leftLowerbeak);
        this.setRotateAngle(leftLowerbeak, 0.0101F, 0.3654F, 0.0549F);


        this.rightLowerbeak = new ModelRenderer(this);
        this.rightLowerbeak.setRotationPoint(-2.2948F, 3.8016F, -3.5187F);
        this.jaw.addChild(rightLowerbeak);
        this.setRotateAngle(rightLowerbeak, 0.0101F, -0.3654F, -0.0549F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.7329F, 3.8332F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.4456F, 0.1974F, -0.0934F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -0.5F, 0.5F, -0.1F, 1, 1, 7, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2002F, 6.8895F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0915F, 0.3042F, 0.0275F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 9, -0.5F, 0.3F, -0.5F, 1, 1, 6, -0.15F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 5, 14, -0.5F, 0.3F, 5.2F, 1, 1, 1, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1193F, 5.9522F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0709F, -0.1741F, -0.0123F);
        this.tail3.cubeList.add(new ModelBox(tail3, 15, 30, -0.5F, 0.4F, -0.1F, 1, 1, 5, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.2379F, 4.9912F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0366F, -0.3052F, -0.011F);
        this.tail4.cubeList.add(new ModelBox(tail4, 13, 37, -0.5F, 0.1F, -0.5F, 1, 1, 4, -0.15F, false));

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
