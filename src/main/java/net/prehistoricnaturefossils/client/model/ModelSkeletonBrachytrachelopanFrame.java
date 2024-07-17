package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBrachytrachelopanFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Brachytrachelopan;
    private final ModelRenderer Basin_r1;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg8;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg8;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tail5;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Tail6;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Tail7;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Tail8;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Shoulders;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer Neck4;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Neck2;
    private final ModelRenderer Neck1;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;

    public ModelSkeletonBrachytrachelopanFrame() {
        this.textureWidth = 144;
        this.textureHeight = 144;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -30.0F, 2.3F, 1, 30, 1, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -1.0F, -31.0F, -22.4F, 1, 31, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -24.5F, -21.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 4.7F, -10.5F, -0.5F, 1, 20, 1, 0.004F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -4.5F, -7.5F, 24.2F, 1, 14, 1, 0.004F, false));

        this.Brachytrachelopan = new ModelRenderer(this);
        this.Brachytrachelopan.setRotationPoint(1.5572F, -33.4595F, 2.5001F);
        this.fossil.addChild(Brachytrachelopan);


        this.Basin_r1 = new ModelRenderer(this);
        this.Basin_r1.setRotationPoint(-1.5572F, 1.4595F, -5.5001F);
        this.Brachytrachelopan.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.1396F, 0.0F, 0.0F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 61, 0, -0.5F, 1.0F, 0.0F, 1, 2, 11, 0.003F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.4428F, 4.4095F, 0.8999F);
        this.Brachytrachelopan.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 1.8762F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.0F, -0.6003F, -15.7619F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1309F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 2.6175F, -9.6699F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.2182F, 0.0F, 0.0F);


        this.leftLeg8 = new ModelRenderer(this);
        this.leftLeg8.setRotationPoint(0.0F, -5.5364F, 9.8139F);
        this.leftLeg3.addChild(leftLeg8);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-7.5572F, 4.4095F, 0.8999F);
        this.Brachytrachelopan.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 1.5708F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.0F, -0.6003F, -15.7619F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.1309F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 2.6175F, -9.6699F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.1309F, 0.0F, 0.0F);


        this.rightLeg8 = new ModelRenderer(this);
        this.rightLeg8.setRotationPoint(0.0F, -5.5364F, 9.8139F);
        this.rightLeg3.addChild(rightLeg8);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(-1.5572F, 3.5595F, 4.5999F);
        this.Brachytrachelopan.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.3124F, 0.2079F, -0.0666F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 68, 64, -0.5F, 0.2643F, 0.5625F, 1, 2, 9, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.3224F, 9.0565F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0447F, 0.218F, -0.0097F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.0261F, 0.3191F);
        this.Tail2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0524F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 32, -0.5F, 1.0F, -0.2F, 1, 2, 16, 0.003F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.6485F, 15.8965F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0909F, 0.3923F, 0.0181F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 59, 18, -0.5F, 0.1237F, -0.2043F, 1, 2, 12, 0.0F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.0009F, 12.0075F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.2778F, 0.3367F, 0.0939F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, -1, 11, -0.5F, -0.0037F, -0.6459F, 1, 2, 18, 0.003F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.5F, -0.4345F, 16.7818F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.0915F, 0.3042F, 0.0275F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.5296F, -0.1754F);
        this.Tail5.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0524F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 0, -1.0F, 0.6F, -0.1F, 1, 1, 16, -0.15F, false));

        this.Tail6 = new ModelRenderer(this);
        this.Tail6.setRotationPoint(-0.5F, -0.9641F, 15.8472F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, 0.0038F, 0.4728F, -0.1101F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.0716F, -0.2595F);
        this.Tail6.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 56, -0.5F, 0.2F, -0.2F, 1, 1, 14, -0.15F, false));

        this.Tail7 = new ModelRenderer(this);
        this.Tail7.setRotationPoint(0.0F, -0.2973F, 13.8481F);
        this.Tail6.addChild(Tail7);
        this.setRotateAngle(Tail7, -0.5388F, 0.3554F, -0.0352F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.1244F, -0.2267F);
        this.Tail7.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 15, -0.5F, 0.5F, 0.0F, 1, 1, 17, -0.15F, false));

        this.Tail8 = new ModelRenderer(this);
        this.Tail8.setRotationPoint(0.0F, -0.8244F, 16.7733F);
        this.Tail7.addChild(Tail8);
        this.setRotateAngle(Tail8, 0.0967F, 0.7501F, 0.09F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.4F, 0.9F);
        this.Tail8.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4523F, -0.3367F, 0.0939F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 34, -0.5F, 0.9F, -1.0F, 1, 1, 17, -0.15F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(-1.5572F, 2.8595F, -5.2001F);
        this.Brachytrachelopan.addChild(Body);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.8F, -12.5F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 82, -0.5F, 1.0F, 0.0F, 1, 2, 7, 0.003F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.4F, -5.5F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2094F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 72, -0.5F, 0.9669F, -0.0113F, 1, 2, 6, 0.01F, false));

        this.Shoulders = new ModelRenderer(this);
        this.Shoulders.setRotationPoint(0.0F, -1.4F, -12.1F);
        this.Body.addChild(Shoulders);
        this.setRotateAngle(Shoulders, 0.0436F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.5F, -9.2F);
        this.Shoulders.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2094F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 70, -0.5F, 0.9F, 0.0F, 1, 2, 9, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(8.8412F, 12.8424F, -7.6629F);
        this.Shoulders.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.0873F, 0.0F, 0.0F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.4079F, 8.6489F, -0.5426F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.3054F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(4.8937F, 6.9475F, -1.1938F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.3491F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-8.8412F, 12.8424F, -7.6629F);
        this.Shoulders.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.4363F, 0.0F, 0.0F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.4079F, 8.6489F, -0.5426F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.5672F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-4.8937F, 6.9475F, -1.1938F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0868F, -0.0063F, 0.0006F);


        this.Neck4 = new ModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, 1.6F, -8.8F);
        this.Shoulders.addChild(Neck4);
        this.setRotateAngle(Neck4, -0.0873F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.6F, -6.0F);
        this.Neck4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3316F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 64, 44, 0.0F, 1.1238F, -3.0383F, 1, 2, 9, 0.003F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 2.5F, -8.5F);
        this.Neck4.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.0F, -0.2618F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -1.5374F, -8.657F);
        this.Neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0698F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 71, 0.0F, 0.9F, -0.3F, 1, 2, 10, 0.0F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.9374F, -8.957F);
        this.Neck3.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0894F, -0.2173F, 0.0193F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 81, 59, -0.5F, 0.1894F, -7.5217F, 1, 1, 8, -0.15F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.1894F, -7.4217F);
        this.Neck2.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.2288F, -0.1275F, -0.0296F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 64, 91, -0.5F, 0.007F, -4.8951F, 1, 1, 5, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.443F, -3.6951F);
        this.Neck1.addChild(Head);
        this.setRotateAngle(Head, 0.1355F, -0.2595F, -0.035F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.3468F, -2.1331F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.3927F, 0.0F, 0.0F);

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
