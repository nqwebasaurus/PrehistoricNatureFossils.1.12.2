package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEuropasaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Hips;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Tail5;
    private final ModelRenderer UpperlegL;
    private final ModelRenderer LowerlegL;
    private final ModelRenderer FootL;
    private final ModelRenderer UpperlegL2;
    private final ModelRenderer LowerlegL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Shoulder;
    private final ModelRenderer cube_r9;
    private final ModelRenderer UpperArmL;
    private final ModelRenderer LowerArmL;
    private final ModelRenderer HandL;
    private final ModelRenderer UpperArmL2;
    private final ModelRenderer LowerArmL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer Neck1;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Neck2;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer Neck4;
    private final ModelRenderer Neck5;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;

    public ModelSkeletonEuropasaurusFrame() {
        this.textureWidth = 105;
        this.textureHeight = 105;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(4.9F, -26.0F, -7.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.7069F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.2F, -10.0F, -0.5F, 1, 36, 1, -0.1F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(4.9F, -26.0F, -7.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3578F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -2.75F, -9.0F, -0.5F, 1, 17, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.1F, -26.0F, 14.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.096F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.5F, 2.0F, -0.5F, 1, 24, 1, -0.1F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.1F, -26.0F, 14.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.096F, 0.0F, -1.5708F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -5.5F, -6.0F, -0.5F, 1, 13, 1, -0.15F, false));

        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -13.0F, 5.0F);
        this.fossil.addChild(Hips);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -13.75F, 14.0F);
        this.Hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6021F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 47, -0.5F, 4.65F, -7.0F, 1, 1, 9, -0.1F, false));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -10.5F, 13.7F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.3981F, -0.1611F, 0.0674F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.7F, 0.0F);
        this.Tail1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 22, -0.5F, -0.9F, -0.4F, 1, 1, 11, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.1F, 9.9F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.176F, -0.1289F, -0.0229F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 44, 38, -0.5F, 1.0F, 0.0F, 1, 1, 10, -0.13F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.25F, 9.9F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.132F, -0.1298F, -0.0172F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 57, 14, -0.5F, 1.25F, -1.0F, 1, 1, 10, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.9F, 9.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.088F, 0.1304F, -0.0115F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 50, -0.5F, -0.6F, -0.75F, 1, 1, 10, -0.13F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, -0.4F, 9.0F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.1806F, 0.2577F, -0.0465F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 17, 17, -0.5F, 0.0F, 0.0F, 1, 1, 14, -0.1F, false));

        this.UpperlegL = new ModelRenderer(this);
        this.UpperlegL.setRotationPoint(6.0F, -11.75F, 8.5F);
        this.Hips.addChild(UpperlegL);
        this.setRotateAngle(UpperlegL, 0.0436F, 0.0F, 0.0F);


        this.LowerlegL = new ModelRenderer(this);
        this.LowerlegL.setRotationPoint(0.65F, 14.6803F, -0.953F);
        this.UpperlegL.addChild(LowerlegL);
        this.setRotateAngle(LowerlegL, 0.48F, 0.0F, 0.0F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.5F, 9.0F, 1.25F);
        this.LowerlegL.addChild(FootL);
        this.setRotateAngle(FootL, -0.1745F, 0.0F, 0.0F);


        this.UpperlegL2 = new ModelRenderer(this);
        this.UpperlegL2.setRotationPoint(-6.0F, -10.35F, 8.5F);
        this.Hips.addChild(UpperlegL2);
        this.setRotateAngle(UpperlegL2, -0.5236F, 0.0F, 0.0F);


        this.LowerlegL2 = new ModelRenderer(this);
        this.LowerlegL2.setRotationPoint(-0.65F, 14.6803F, -0.953F);
        this.UpperlegL2.addChild(LowerlegL2);
        this.setRotateAngle(LowerlegL2, 0.48F, 0.0F, 0.0F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(-0.5F, 9.0F, 1.25F);
        this.LowerlegL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.0436F, 0.0F, 0.0F);


        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -10.0F, 5.5F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.0F, -0.1745F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -11.25F, -9.0F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5236F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 14, -0.5F, 1.889F, -0.3852F, 1, 1, 13, -0.1F, false));

        this.Shoulder = new ModelRenderer(this);
        this.Shoulder.setRotationPoint(0.0F, -7.25F, -11.0F);
        this.Body.addChild(Shoulder);
        this.setRotateAngle(Shoulder, 0.0F, -0.2182F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.15F, 1.0F);
        this.Shoulder.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.454F, -0.0275F, 0.0134F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 60, 30, -0.13F, -0.2134F, -8.0785F, 1, 1, 8, -0.1F, false));

        this.UpperArmL = new ModelRenderer(this);
        this.UpperArmL.setRotationPoint(7.0F, 6.75F, -7.0F);
        this.Shoulder.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.5672F, 0.0F, 0.0F);


        this.LowerArmL = new ModelRenderer(this);
        this.LowerArmL.setRotationPoint(0.0F, 12.3264F, -0.2348F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -0.3927F, 0.0F, 0.0F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(1.6F, 6.8196F, 0.5722F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.7854F, 0.0F, 0.0F);


        this.UpperArmL2 = new ModelRenderer(this);
        this.UpperArmL2.setRotationPoint(-7.0F, 6.75F, -7.0F);
        this.Shoulder.addChild(UpperArmL2);
        this.setRotateAngle(UpperArmL2, -0.0873F, 0.0F, 0.0F);


        this.LowerArmL2 = new ModelRenderer(this);
        this.LowerArmL2.setRotationPoint(0.0F, 12.3264F, -0.2348F);
        this.UpperArmL2.addChild(LowerArmL2);
        this.setRotateAngle(LowerArmL2, -0.3054F, 0.0F, 0.0F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(-1.6F, 6.8196F, 0.5722F);
        this.LowerArmL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 0.4363F, 0.0F, 0.0F);


        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.6F, -5.25F, -6.0F);
        this.Shoulder.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.7913F, -0.3082F, -0.0609F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.Neck1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 42, -0.5F, 1.4819F, -0.3952F, 1, 1, 5, -0.1F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Neck1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1746F, -0.0435F, 0.0038F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 73, 29, -0.5F, -0.5162F, -4.908F, 1, 1, 5, -0.1F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -2.0F, -10.0F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.0185F, -0.2451F, -0.1421F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 29, 35, -0.5F, 1.75F, -8.0F, 1, 1, 9, -0.1F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.1327F, -0.239F, -0.1444F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.Neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.0873F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 31, -0.5F, 0.65F, -8.0F, 1, 1, 11, -0.1F, false));

        this.Neck4 = new ModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, -0.0967F, -0.2384F, -0.299F);
        this.Neck4.cubeList.add(new ModelBox(Neck4, 44, 52, -0.5F, 1.7F, -8.9F, 1, 1, 10, -0.1F, false));

        this.Neck5 = new ModelRenderer(this);
        this.Neck5.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Neck4.addChild(Neck5);
        this.setRotateAngle(Neck5, 0.5899F, -0.1354F, -0.1923F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Neck5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 76, -0.5F, 0.8F, -4.9F, 1, 1, 5, -0.1F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.0F, -7.5F);
        this.Neck5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.192F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 33, 84, -0.5F, 0.7F, -0.9F, 1, 1, 4, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.Neck5.addChild(Head);
        this.setRotateAngle(Head, 0.4098F, -0.1996F, -0.1706F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(-0.5F, 2.0F, -0.5F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.5672F, 0.0F, 0.0F);

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
