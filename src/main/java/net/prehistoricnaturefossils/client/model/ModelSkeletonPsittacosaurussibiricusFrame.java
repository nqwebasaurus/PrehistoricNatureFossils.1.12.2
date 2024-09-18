package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPsittacosaurussibiricusFrame extends ModelBase {
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
    private final ModelRenderer leftfoot2;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightfoot2;
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
    private final ModelRenderer leftBeak;
    private final ModelRenderer rightBeak;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer leftLowerbeak;
    private final ModelRenderer rightLowerbeak;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonPsittacosaurussibiricusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -21.0F, -4.0F, 1, 21, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(3.9F, -16.0F, -20.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3665F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.1F, -4.0F, -0.5F, 1, 20, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(3.9F, -16.0F, -20.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3665F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.5F, -6.0F, -0.5F, 1, 12, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -17.0F, -3.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 3.5F, -6.0F, -0.5F, 1, 11, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -21.5F, -3.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.1309F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.4F, -3.0F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 26, -0.5F, 0.9F, 0.0F, 1, 2, 9, 0.0F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(3.9F, 0.4033F, -0.4794F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.2094F, 0.0F, 0.0F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(1.0F, 8.749F, -2.6285F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.0349F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 7.8246F, 4.3116F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.0087F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 3.7F, -1.2F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.8901F, 0.0F, 0.0F);


        this.leftfoot2 = new ModelRenderer(this);
        this.leftfoot2.setRotationPoint(0.0F, 1.6686F, -0.7616F);
        this.leftfoot.addChild(leftfoot2);
        this.setRotateAngle(leftfoot2, 0.9425F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-3.9F, 0.4033F, -0.4794F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.2705F, 0.0F, 0.0F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-1.0F, 8.749F, -2.6285F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, -0.2269F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 7.8246F, 4.3116F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.1222F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 3.7F, -1.2F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.8901F, 0.0F, 0.0F);


        this.rightfoot2 = new ModelRenderer(this);
        this.rightfoot2.setRotationPoint(0.0F, 1.6686F, -0.7616F);
        this.rightfoot.addChild(rightfoot2);
        this.setRotateAngle(rightfoot2, 0.8116F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.4F, -3.3F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.3099F, -0.1664F, 0.053F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.6F, -9.6F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2705F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 13, -0.5F, 0.9128F, -0.0017F, 1, 2, 10, 0.004F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 2.6F, -9.6F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.2721F, -0.1619F, -0.0897F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5934F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 15, -0.5F, 0.0F, -6.4F, 1, 2, 7, 0.0F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(5.5F, 7.4651F, -1.7441F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.8509F, 0.0971F, -0.1486F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.2384F, 5.9326F, 2.5003F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.3465F, -1.0637F, 1.0636F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(0.0913F, 4.351F, -1.1512F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 1.894F, -0.0377F, -0.2007F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-5.5F, 7.4651F, -1.7441F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.4387F, -0.1538F, 0.0519F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.2384F, 5.9326F, 2.5003F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.9862F, 0.6201F, -1.8276F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(-0.0913F, 4.351F, -1.1512F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 1.6322F, 0.0377F, 0.2007F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 3.5F, -5.1F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.5868F, -0.1459F, -0.1082F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.2F, -1.5F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 25, -0.5F, -0.1F, -3.7F, 1, 2, 5, 0.004F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -4.6F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.1546F, -0.3146F, -0.0264F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.4F, -0.2F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 23, 28, -0.5F, -0.4F, -5.7F, 1, 2, 6, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.9F, -4.6F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.6466F, -0.4725F, -0.2373F);


        this.leftBeak = new ModelRenderer(this);
        this.leftBeak.setRotationPoint(0.5296F, 0.3549F, -6.83F);
        this.head.addChild(leftBeak);
        this.setRotateAngle(leftBeak, 0.1396F, 0.0F, 0.0F);


        this.rightBeak = new ModelRenderer(this);
        this.rightBeak.setRotationPoint(-0.5296F, 0.3549F, -6.83F);
        this.head.addChild(rightBeak);
        this.setRotateAngle(rightBeak, 0.1396F, 0.0F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.3F, 2.2077F, -2.3648F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.3F, 2.2077F, -2.3648F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(1.0F, 1.5077F, -0.5648F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4649F, 0.0F, 0.0F);


        this.leftLowerbeak = new ModelRenderer(this);
        this.leftLowerbeak.setRotationPoint(-0.3F, 3.5917F, -3.022F);
        this.jaw.addChild(leftLowerbeak);
        this.setRotateAngle(leftLowerbeak, 0.3088F, 0.1074F, 0.0011F);


        this.rightLowerbeak = new ModelRenderer(this);
        this.rightLowerbeak.setRotationPoint(-1.7F, 3.5917F, -3.022F);
        this.jaw.addChild(rightLowerbeak);
        this.setRotateAngle(rightLowerbeak, 0.3088F, -0.1074F, -0.0011F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.0F, 5.7F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.3688F, 0.1258F, -0.0363F);
        this.tail.cubeList.add(new ModelBox(tail, 41, 40, -0.5F, 0.2F, 3.1F, 1, 1, 4, 0.004F, false));
        this.tail.cubeList.add(new ModelBox(tail, 20, 44, -0.5F, 0.2F, 0.1F, 1, 2, 3, 0.004F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0083F, 0.2554F, 0.0541F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 3, -0.5F, 0.2F, 0.0F, 1, 1, 10, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0701F, 0.218F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 15, 16, -0.5F, -0.1F, -0.3F, 1, 1, 10, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2F, 10.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0361F, 0.2174F, 0.0154F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.0F, -0.7F, 1, 1, 11, -0.15F, false));

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