package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSimolestesFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Pliosaurus;
    private final ModelRenderer basin_r1;
    private final ModelRenderer basin_r2;
    private final ModelRenderer basin_r3;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Shoulder;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Neck3;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Neck1;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer FrontFlipperL;
    private final ModelRenderer FrontFlipperMiddleL;
    private final ModelRenderer FrontFlipperEndL;
    private final ModelRenderer FrontFlipperL2;
    private final ModelRenderer FrontFlipperMiddleL2;
    private final ModelRenderer FrontFlipperEndL2;
    private final ModelRenderer BackFlipperL;
    private final ModelRenderer BackFlipperMiddleL;
    private final ModelRenderer BackFlipperEndL;
    private final ModelRenderer BackFlipperL2;
    private final ModelRenderer BackFlipperMiddleL2;
    private final ModelRenderer BackFlipperEndL2;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Tail4;

    public ModelSkeletonSimolestesFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 32.0F, 28.0F);


        this.Pliosaurus = new ModelRenderer(this);
        this.Pliosaurus.setRotationPoint(0.5F, -19.0F, -9.4F);
        this.fossil.addChild(Pliosaurus);
        this.setRotateAngle(Pliosaurus, -0.1745F, 0.0F, 0.0F);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(-0.5F, 3.1144F, -2.0188F);
        this.Pliosaurus.addChild(basin_r1);
        this.setRotateAngle(basin_r1, 1.5708F, 0.1047F, 1.5708F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 36, 44, -0.1F, -0.5F, -6.5F, 1, 1, 13, -0.003F, false));

        this.basin_r2 = new ModelRenderer(this);
        this.basin_r2.setRotationPoint(-0.5F, 0.5178F, 0.064F);
        this.Pliosaurus.addChild(basin_r2);
        this.setRotateAngle(basin_r2, 1.4661F, 0.0F, 0.0F);
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 46, 54, -0.5F, -2.3F, -3.3F, 1, 1, 3, -0.006F, false));

        this.basin_r3 = new ModelRenderer(this);
        this.basin_r3.setRotationPoint(-0.5F, -2.3F, -2.0F);
        this.Pliosaurus.addChild(basin_r3);
        this.setRotateAngle(basin_r3, -0.1047F, 0.0F, 0.0F);
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 45, 53, -0.5F, 1.5867F, -0.1527F, 1, 2, 5, -0.003F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.9F, -2.3F);
        this.Pliosaurus.addChild(Chest);
        this.setRotateAngle(Chest, -0.1489F, -0.0863F, 0.0129F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.0959F, -9.449F);
        this.Chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0785F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 9, -1.0F, 0.9398F, -0.4209F, 1, 2, 10, -0.003F, false));

        this.Shoulder = new ModelRenderer(this);
        this.Shoulder.setRotationPoint(0.0F, 0.2041F, -9.649F);
        this.Chest.addChild(Shoulder);
        this.setRotateAngle(Shoulder, 0.2009F, -0.0428F, -0.0087F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 5.5692F, -11.4827F);
        this.Shoulder.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.5708F, -0.0524F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 9, 0.7F, -0.5F, -6.5F, 1, 1, 13, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.0004F, -12.6405F);
        this.Shoulder.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.6232F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 18, -0.5F, -2.0F, 1.7F, 1, 1, 4, -0.004F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -1.0004F, -12.6405F);
        this.Shoulder.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 9, -0.5F, 1.0F, 0.0F, 1, 2, 13, 0.0F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -0.2077F, -12.5223F);
        this.Shoulder.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.0F, -0.0436F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 15, 56, -1.0F, 0.2246F, -4.3057F, 1, 2, 5, 0.0F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.3F, -4.7F);
        this.Neck3.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.1752F, -0.1744F, 0.0077F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.1556F, -4.9315F);
        this.Neck2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -1, 53, -1.0F, -1.0F, 0.0F, 1, 2, 6, -0.001F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -0.4444F, -4.8315F);
        this.Neck2.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.1923F, -0.1745F, 0.0031F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.0646F, -3.759F);
        this.Neck1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 51, 60, -1.0F, 0.7F, -1.6F, 1, 2, 6, -0.01F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.2301F, -4.4901F);
        this.Neck1.addChild(Head);
        this.setRotateAngle(Head, -0.3424F, -0.01F, 0.2345F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(-1.0F, 4.1357F, 0.8573F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.9338F, 0.0F, 0.0F);


        this.FrontFlipperL = new ModelRenderer(this);
        this.FrontFlipperL.setRotationPoint(6.4F, 4.8864F, -11.0035F);
        this.Shoulder.addChild(FrontFlipperL);
        this.setRotateAngle(FrontFlipperL, 0.1318F, -0.0683F, 0.4755F);


        this.FrontFlipperMiddleL = new ModelRenderer(this);
        this.FrontFlipperMiddleL.setRotationPoint(7.7742F, -1.7954F, -0.248F);
        this.FrontFlipperL.addChild(FrontFlipperMiddleL);
        this.setRotateAngle(FrontFlipperMiddleL, -0.035F, -0.2595F, 0.1355F);


        this.FrontFlipperEndL = new ModelRenderer(this);
        this.FrontFlipperEndL.setRotationPoint(7.6443F, 0.5F, -0.0469F);
        this.FrontFlipperMiddleL.addChild(FrontFlipperEndL);
        this.setRotateAngle(FrontFlipperEndL, 0.0F, -0.1309F, 0.0F);


        this.FrontFlipperL2 = new ModelRenderer(this);
        this.FrontFlipperL2.setRotationPoint(-7.4F, 4.8864F, -11.0035F);
        this.Shoulder.addChild(FrontFlipperL2);
        this.setRotateAngle(FrontFlipperL2, 0.1318F, 0.0683F, -0.4755F);


        this.FrontFlipperMiddleL2 = new ModelRenderer(this);
        this.FrontFlipperMiddleL2.setRotationPoint(-7.7742F, -1.7954F, -0.248F);
        this.FrontFlipperL2.addChild(FrontFlipperMiddleL2);
        this.setRotateAngle(FrontFlipperMiddleL2, -0.1022F, 0.2415F, -0.4051F);


        this.FrontFlipperEndL2 = new ModelRenderer(this);
        this.FrontFlipperEndL2.setRotationPoint(-7.6443F, 0.5F, -0.0469F);
        this.FrontFlipperMiddleL2.addChild(FrontFlipperEndL2);
        this.setRotateAngle(FrontFlipperEndL2, 0.0F, 0.1309F, 0.0F);


        this.BackFlipperL = new ModelRenderer(this);
        this.BackFlipperL.setRotationPoint(5.9F, 3.2806F, -1.92F);
        this.Pliosaurus.addChild(BackFlipperL);
        this.setRotateAngle(BackFlipperL, 0.2227F, -0.3007F, -0.3379F);


        this.BackFlipperMiddleL = new ModelRenderer(this);
        this.BackFlipperMiddleL.setRotationPoint(10.167F, 0.5F, -0.3177F);
        this.BackFlipperL.addChild(BackFlipperMiddleL);
        this.setRotateAngle(BackFlipperMiddleL, 0.0396F, -0.1248F, -0.3079F);


        this.BackFlipperEndL = new ModelRenderer(this);
        this.BackFlipperEndL.setRotationPoint(4.8307F, 0.5F, -1.0037F);
        this.BackFlipperMiddleL.addChild(BackFlipperEndL);
        this.setRotateAngle(BackFlipperEndL, 0.0F, 0.1658F, 0.0F);


        this.BackFlipperL2 = new ModelRenderer(this);
        this.BackFlipperL2.setRotationPoint(-6.9F, 3.2806F, -1.92F);
        this.Pliosaurus.addChild(BackFlipperL2);
        this.setRotateAngle(BackFlipperL2, 0.1954F, 0.3188F, 0.2482F);


        this.BackFlipperMiddleL2 = new ModelRenderer(this);
        this.BackFlipperMiddleL2.setRotationPoint(-10.167F, 0.5F, -0.3177F);
        this.BackFlipperL2.addChild(BackFlipperMiddleL2);
        this.setRotateAngle(BackFlipperMiddleL2, 0.0172F, 0.1298F, 0.132F);


        this.BackFlipperEndL2 = new ModelRenderer(this);
        this.BackFlipperEndL2.setRotationPoint(-4.8307F, 0.5F, -1.0037F);
        this.BackFlipperMiddleL2.addChild(BackFlipperEndL2);
        this.setRotateAngle(BackFlipperEndL2, 0.0F, -0.1658F, 0.0F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.1F, 2.6F);
        this.Pliosaurus.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1496F, 0.1295F, -0.0195F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.4143F, 1.0271F);
        this.Tail1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 64, -1.0F, 0.9F, -1.2F, 1, 2, 4, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.9857F, 8.0271F);
        this.Tail1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1222F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 80, -1.0F, -2.1F, -4.2F, 1, 2, 3, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -1.0143F, 5.7271F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0709F, 0.1741F, 0.0123F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.9F, 0.2F);
        this.Tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1571F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 9, -1.0F, 0.9284F, -0.3169F, 1, 2, 3, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.5F, 2.8F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0549F, 0.305F, -0.0165F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.7227F, -0.0287F);
        this.Tail3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1047F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 55, -1.0F, 0.8F, -0.5F, 1, 1, 4, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.3227F, 2.9713F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0755F, 0.3917F, 0.0289F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 72, -1.0F, 0.1017F, -0.0512F, 1, 1, 4, -0.2F, false));

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
