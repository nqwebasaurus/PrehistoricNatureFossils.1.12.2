package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonYiFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer Basin_r1;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Chest;
    private final ModelRenderer UpperArmL;
    private final ModelRenderer WingL;
    private final ModelRenderer LowerArmL;
    private final ModelRenderer HandL;
    private final ModelRenderer HandwingL;
    private final ModelRenderer UpperArmL2;
    private final ModelRenderer WingL2;
    private final ModelRenderer LowerArmL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer HandwingL2;
    private final ModelRenderer Neck1;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Neck3;
    private final ModelRenderer head;
    private final ModelRenderer Jaw;
    private final ModelRenderer UpperLegL;
    private final ModelRenderer LowerLegL;
    private final ModelRenderer FootL;
    private final ModelRenderer ToesL;
    private final ModelRenderer UpperLegL2;
    private final ModelRenderer LowerLegL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer ToesL2;

    public ModelSkeletonYiFrame() {
        this.textureWidth = 46;
        this.textureHeight = 44;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -13.0F, 0.5F, 1, 13, 1, -0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -15.0F, -6.5F, 1, 15, 1, -0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -12.5F, -6.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.875F, -2.5F, -0.5F, 1, 5, 1, -0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -2.5F, 6.5F, 1, 5, 1, -0.003F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -13.0F, 3.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.5F, 0.1F, -2.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.2182F, 0.0F, 0.0F);


        this.Basin_r1 = new ModelRenderer(this);
        this.Basin_r1.setRotationPoint(-1.0F, -2.0F, -1.0F);
        this.hips.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.192F, 0.0F, 0.0F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 24, 23, 0.0F, 1.7913F, 0.5683F, 1, 1, 4, -0.003F, false));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(-0.5F, -0.05F, 3.0F);
        this.hips.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.4887F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -0.1507F, 0.1265F);
        this.Tail1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1222F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 17, -1.0F, 0.8F, -1.0F, 1, 1, 4, -0.003F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.2993F, 3.0265F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1745F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -0.3145F, 0.0327F);
        this.Tail2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, -1, -1.0F, 0.75F, -1.1F, 1, 1, 4, -0.003F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.0F, -0.7F);
        this.hips.addChild(Body);
        this.setRotateAngle(Body, -0.0873F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.7F, -4.9F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 19, -1.0F, 1.0F, 0.0F, 1, 1, 6, -0.003F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.5F, -4.9F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, -0.0873F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 21, 34, -1.0F, 0.8F, -2.0F, 1, 1, 2, -0.003F, false));

        this.UpperArmL = new ModelRenderer(this);
        this.UpperArmL.setRotationPoint(2.0F, 2.35F, -0.95F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -1.0285F, -0.3163F, -1.6881F);


        this.WingL = new ModelRenderer(this);
        this.WingL.setRotationPoint(-0.0841F, -1.2795F, 5.845F);
        this.UpperArmL.addChild(WingL);
        this.setRotateAngle(WingL, 0.0F, 0.0F, -0.6981F);


        this.LowerArmL = new ModelRenderer(this);
        this.LowerArmL.setRotationPoint(-0.6591F, -0.1795F, 6.845F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, 0.114F, -0.1459F, 0.114F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.6F, 6.8441F, 0.0915F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.1044F, -0.2319F, 0.1044F);


        this.HandwingL = new ModelRenderer(this);
        this.HandwingL.setRotationPoint(0.4F, 0.8F, 1.5F);
        this.HandL.addChild(HandwingL);
        this.setRotateAngle(HandwingL, 0.4363F, 0.0873F, 0.0F);


        this.UpperArmL2 = new ModelRenderer(this);
        this.UpperArmL2.setRotationPoint(-3.0F, 2.35F, -0.95F);
        this.Chest.addChild(UpperArmL2);
        this.setRotateAngle(UpperArmL2, -1.0285F, 0.3163F, 1.6881F);


        this.WingL2 = new ModelRenderer(this);
        this.WingL2.setRotationPoint(0.0841F, -1.2795F, 5.845F);
        this.UpperArmL2.addChild(WingL2);
        this.setRotateAngle(WingL2, 0.0F, 0.0F, 0.6981F);


        this.LowerArmL2 = new ModelRenderer(this);
        this.LowerArmL2.setRotationPoint(0.6591F, -0.1795F, 6.845F);
        this.UpperArmL2.addChild(LowerArmL2);
        this.setRotateAngle(LowerArmL2, 0.114F, 0.1459F, -0.114F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(-0.6F, 6.8441F, 0.0915F);
        this.LowerArmL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 0.0939F, 0.1595F, -0.2457F);


        this.HandwingL2 = new ModelRenderer(this);
        this.HandwingL2.setRotationPoint(-0.4F, 0.8F, 1.5F);
        this.HandL2.addChild(HandwingL2);
        this.setRotateAngle(HandwingL2, 0.4363F, -0.0873F, 0.0F);


        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.1F, -1.9F);
        this.Chest.addChild(Neck1);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.0587F, -0.2037F);
        this.Neck1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4887F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 23, -1.0F, 0.6659F, -0.7179F, 1, 1, 2, -0.01F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(-0.6F, -0.3587F, -0.8037F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.5149F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.1F, -1.3668F, -1.1622F);
        this.Neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6807F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 9, -0.5F, 0.6767F, -0.2068F, 1, 1, 3, -0.003F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.6F, -1.0943F, -1.2773F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.3491F, 0.0F, 0.0F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3132F, -0.6076F);
        this.Neck3.addChild(head);
        this.setRotateAngle(head, 0.1047F, 0.0F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.6012F, -0.0349F);
        this.head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.5672F, 0.0F, 0.0F);


        this.UpperLegL = new ModelRenderer(this);
        this.UpperLegL.setRotationPoint(2.5F, 0.6F, -1.6F);
        this.root.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.0869F, 0.0983F, 0.1228F);


        this.LowerLegL = new ModelRenderer(this);
        this.LowerLegL.setRotationPoint(0.0F, 3.5702F, -3.2111F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, -0.0436F, 0.0019F, 0.0436F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 4.9552F, 3.4213F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.2166F, -0.057F, -0.1466F);


        this.ToesL = new ModelRenderer(this);
        this.ToesL.setRotationPoint(0.0F, 2.9482F, -2.4432F);
        this.FootL.addChild(ToesL);
        this.setRotateAngle(ToesL, -0.0872F, -0.0038F, -0.0435F);


        this.UpperLegL2 = new ModelRenderer(this);
        this.UpperLegL2.setRotationPoint(-2.5F, 0.6F, -1.6F);
        this.root.addChild(UpperLegL2);
        this.setRotateAngle(UpperLegL2, 0.1731F, -0.0203F, -0.1364F);


        this.LowerLegL2 = new ModelRenderer(this);
        this.LowerLegL2.setRotationPoint(0.0F, 3.5702F, -3.2111F);
        this.UpperLegL2.addChild(LowerLegL2);
        this.setRotateAngle(LowerLegL2, 0.0872F, 0.0038F, -0.0435F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 4.9552F, 3.4213F);
        this.LowerLegL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.5231F, 0.0481F, 0.1787F);


        this.ToesL2 = new ModelRenderer(this);
        this.ToesL2.setRotationPoint(0.0F, 2.9482F, -2.4432F);
        this.FootL2.addChild(ToesL2);
        this.setRotateAngle(ToesL2, -0.829F, 0.0F, 0.0F);

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
