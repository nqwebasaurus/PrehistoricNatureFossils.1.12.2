package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBatrachotomusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Root;
    private final ModelRenderer Hips;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Body;
    private final ModelRenderer Chest;
    private final ModelRenderer Neck;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Head;
    private final ModelRenderer Lips;
    private final ModelRenderer Lips2;
    private final ModelRenderer Teeth;
    private final ModelRenderer Forehead;
    private final ModelRenderer Jaw;
    private final ModelRenderer ThroatPouch;
    private final ModelRenderer UpperArmL;
    private final ModelRenderer LowerArmL;
    private final ModelRenderer HandL;
    private final ModelRenderer UpperArmL2;
    private final ModelRenderer LowerArmL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tail5;
    private final ModelRenderer UpperLegL;
    private final ModelRenderer LowerLegL;
    private final ModelRenderer FootL;
    private final ModelRenderer ToesL;
    private final ModelRenderer UpperLegL2;
    private final ModelRenderer LowerLegL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer ToesL2;

    public ModelSkeletonBatrachotomusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.1F, -11.5F, -9.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -7.5F, -0.5F, 1, 19, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.1F, -11.5F, -9.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -2.5F, -5.5F, -0.5F, 1, 12, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.2F, -14.05F, 10.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -4.75F, -4.5F, -0.5F, 1, 9, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.2F, -14.05F, 10.8F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.5F, -6.95F, -0.5F, 1, 21, 1, 0.0F, false));

        this.Root = new ModelRenderer(this);
        this.Root.setRotationPoint(0.0F, -20.0F, 0.0F);
        this.fossil.addChild(Root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -2.0F, 11.0F);
        this.Root.addChild(Hips);
        this.setRotateAngle(Hips, 0.0873F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.0962F, -6.9128F);
        this.Hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 0, -1.0F, 0.0F, 0.0F, 2, 2, 10, -0.2F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.2962F, -5.9128F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.0176F, 0.1309F, 0.0023F);
        this.Body.cubeList.add(new ModelBox(Body, 45, 19, -1.0F, 0.1827F, -11.9876F, 2, 2, 12, -0.2F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.1827F, -11.9876F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.131F, 0.0433F, 0.0057F);
        this.Chest.cubeList.add(new ModelBox(Chest, 32, 63, -1.0F, 0.0743F, -6.0529F, 2, 2, 7, -0.2F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.0312F, -5.8996F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, 0.044F, 0.1308F, 0.0057F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.1442F, -3.8748F);
        this.Neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 74, -1.0F, 0.0765F, 0.1406F, 2, 2, 4, -0.2F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.0558F, -3.2748F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.1806F, 0.2577F, -0.0465F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.1042F, -3.7447F);
        this.Neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1222F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 20, -1.0F, 0.0F, -0.5F, 2, 2, 5, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.5242F, -3.7447F);
        this.Neck2.addChild(Head);
        this.setRotateAngle(Head, 0.1283F, 0.1719F, -0.0306F);


        this.Lips = new ModelRenderer(this);
        this.Lips.setRotationPoint(0.0F, -0.9573F, -3.9554F);
        this.Head.addChild(Lips);
        this.setRotateAngle(Lips, 0.0175F, 0.0F, 0.0F);


        this.Lips2 = new ModelRenderer(this);
        this.Lips2.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.Lips.addChild(Lips2);
        this.setRotateAngle(Lips2, -0.2723F, 0.0F, 0.0F);


        this.Teeth = new ModelRenderer(this);
        this.Teeth.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.Lips2.addChild(Teeth);
        this.setRotateAngle(Teeth, 0.0524F, 0.0F, 0.0F);


        this.Forehead = new ModelRenderer(this);
        this.Forehead.setRotationPoint(0.0F, -1.9573F, -3.9554F);
        this.Head.addChild(Forehead);
        this.setRotateAngle(Forehead, 0.1047F, 0.0F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.0427F, 0.0446F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.288F, 0.0F, 0.0F);


        this.ThroatPouch = new ModelRenderer(this);
        this.ThroatPouch.setRotationPoint(0.0F, 4.4758F, 0.2553F);
        this.Neck2.addChild(ThroatPouch);


        this.UpperArmL = new ModelRenderer(this);
        this.UpperArmL.setRotationPoint(6.0F, 6.0653F, -4.1637F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.1309F, 0.0F, 0.0F);


        this.LowerArmL = new ModelRenderer(this);
        this.LowerArmL.setRotationPoint(1.0F, 7.0005F, 0.6626F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -0.7592F, 0.0F, 0.0F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(-0.6F, 7.0F, -1.0F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.3927F, 0.0F, 0.0F);


        this.UpperArmL2 = new ModelRenderer(this);
        this.UpperArmL2.setRotationPoint(-6.0F, 6.0653F, -4.1637F);
        this.Chest.addChild(UpperArmL2);
        this.setRotateAngle(UpperArmL2, 0.8722F, 0.0334F, -0.0281F);


        this.LowerArmL2 = new ModelRenderer(this);
        this.LowerArmL2.setRotationPoint(-1.0F, 7.0005F, 0.6626F);
        this.UpperArmL2.addChild(LowerArmL2);
        this.setRotateAngle(LowerArmL2, -1.2392F, 0.0F, 0.0F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(0.6F, 7.0F, -1.0F);
        this.LowerArmL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 2.2689F, 0.0F, 0.0F);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.2962F, 2.0872F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, -0.0443F, -0.1744F, 0.0077F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.6993F, -0.0305F);
        this.Tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0175F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 31, -1.0F, 1.01F, 0.0F, 2, 2, 13, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.4007F, 12.6695F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0845F, -0.1304F, 0.011F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 38, 34, -1.0F, 0.1411F, -0.314F, 2, 2, 13, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.2589F, 12.286F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1329F, 0.173F, -0.023F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 43, -1.0F, 0.3392F, -0.2974F, 2, 1, 13, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0392F, 12.2026F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0452F, 0.2615F, -0.0117F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 57, 35, -0.5F, 0.3218F, 0.1005F, 1, 1, 9, -0.2F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0218F, 9.3005F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.0452F, 0.2615F, -0.0117F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 0, 58, -0.4F, 0.3131F, -0.5997F, 1, 1, 10, -0.2F, false));

        this.UpperLegL = new ModelRenderer(this);
        this.UpperLegL.setRotationPoint(4.0F, 2.0038F, 0.5872F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 0.2182F, 0.0F, 0.0F);


        this.LowerLegL = new ModelRenderer(this);
        this.LowerLegL.setRotationPoint(0.5F, 8.0F, -3.5F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.4363F, 0.0F, 0.0F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 12.0F, 2.5F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, -1.6144F, 0.0F, 0.0F);


        this.ToesL = new ModelRenderer(this);
        this.ToesL.setRotationPoint(0.0F, 2.4527F, 0.3696F);
        this.FootL.addChild(ToesL);
        this.setRotateAngle(ToesL, 1.1349F, -0.0044F, 0.0143F);


        this.UpperLegL2 = new ModelRenderer(this);
        this.UpperLegL2.setRotationPoint(-4.0F, 2.0038F, 0.5872F);
        this.Hips.addChild(UpperLegL2);
        this.setRotateAngle(UpperLegL2, -0.7854F, 0.0F, 0.0F);


        this.LowerLegL2 = new ModelRenderer(this);
        this.LowerLegL2.setRotationPoint(-0.5F, 8.0F, -3.5F);
        this.UpperLegL2.addChild(LowerLegL2);
        this.setRotateAngle(LowerLegL2, 0.5672F, 0.0F, 0.0F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 12.0F, 2.5F);
        this.LowerLegL2.addChild(FootL2);
        this.setRotateAngle(FootL2, -0.6545F, 0.0F, 0.0F);


        this.ToesL2 = new ModelRenderer(this);
        this.ToesL2.setRotationPoint(0.0F, 2.4527F, 0.3696F);
        this.FootL2.addChild(ToesL2);
        this.setRotateAngle(ToesL2, 0.9599F, 0.0F, 0.0F);

    }

    public void renderAll(float f) {

        this.fossil.render(0.01f);
        //this.cube_r82.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
