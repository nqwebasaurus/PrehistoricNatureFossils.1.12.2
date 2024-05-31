package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCompsognathusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Compsognathus;
    private final ModelRenderer basin_r1;
    private final ModelRenderer LegL;
    private final ModelRenderer KneeL;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer FootL;
    private final ModelRenderer LegL2;
    private final ModelRenderer KneeL2;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Tail4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Body;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer ArmL;
    private final ModelRenderer ElbowL;
    private final ModelRenderer HandL;
    private final ModelRenderer ArmL2;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Neck1;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;

    public ModelSkeletonCompsognathusFrame() {
        this.textureWidth = 46;
        this.textureHeight = 46;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -12.0F, 5.0F, 1, 12, 1, -0.2F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -9.0F, 5.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 2.0F, -3.0F, -0.5F, 1, 6, 1, -0.21F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, -10.8F, -2.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2443F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.2F, -2.0F, -0.5F, 1, 4, 1, -0.21F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -10.8F, -2.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2443F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.7F, -4.2F, -0.5F, 1, 15, 1, -0.2F, false));

        this.Compsognathus = new ModelRenderer(this);
        this.Compsognathus.setRotationPoint(0.0F, -12.3F, 6.0F);
        this.fossil.addChild(Compsognathus);
        this.setRotateAngle(Compsognathus, -0.2618F, 0.0F, 0.0F);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(0.6F, -0.7F, -2.3F);
        this.Compsognathus.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.1047F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 26, 0, -1.1F, 0.2938F, -0.0212F, 1, 1, 5, -0.2F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(2.8F, 0.7F, -0.3F);
        this.Compsognathus.addChild(LegL);
        this.setRotateAngle(LegL, -0.6085F, -0.0456F, 0.0949F);


        this.KneeL = new ModelRenderer(this);
        this.KneeL.setRotationPoint(0.0F, 4.85F, -0.0851F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 0.1731F, -0.0227F, 0.1289F);


        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 1.2486F, 4.6117F);
        this.KneeL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -0.48F, 0.0F, 0.0F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 3.5F, 1.0F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 1.3977F, -0.0227F, -0.1289F);


        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-2.8F, 0.7F, -0.3F);
        this.Compsognathus.addChild(LegL2);
        this.setRotateAngle(LegL2, -0.1289F, -0.0227F, -0.1731F);


        this.KneeL2 = new ModelRenderer(this);
        this.KneeL2.setRotationPoint(0.0F, 4.85F, -0.0851F);
        this.LegL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, -0.0436F, 0.0F, 0.0F);


        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(0.0F, 1.2486F, 4.6117F);
        this.KneeL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, 0.1745F, 0.0F, 0.1309F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 3.5F, 1.0F);
        this.MetatarsalL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.2614F, -0.025F, 0.0357F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 2.6F);
        this.Compsognathus.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.0006F, -0.1771F, -0.0066F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 20, -0.5F, 0.1F, -0.4F, 1, 1, 8, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 1.0F, 7.9F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1806F, -0.2577F, -0.0465F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.2F, 0.3872F, -0.9981F);
        this.Tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0175F, 0.0175F, -0.0003F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -1, 12, -0.5F, -0.4F, 0.0F, 1, 1, 10, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.5F, 0.1872F, 8.8019F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.2823F, -0.3786F, -0.1068F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 0, -1.0F, 0.1F, 1.7F, 1, 1, 9, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.7F, 8.7F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0F, -0.6109F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.7872F, -2.0981F);
        this.Tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.192F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.1F, 0.6227F, 2.1937F, 1, 1, 11, -0.2F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.6F, -2.3F);
        this.Compsognathus.addChild(Body);
        this.setRotateAngle(Body, -0.0252F, 0.221F, 0.0797F);
        this.Body.cubeList.add(new ModelBox(Body, 28, 11, -0.5F, 0.2F, -4.6F, 1, 1, 5, -0.2F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.2F, -4.9F);
        this.Body.addChild(Chest);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.1F, 1.7F, -2.9F);
        this.Chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1312F, 0.0692F, 0.0091F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 35, -0.6F, -0.8923F, -0.1825F, 1, 1, 4, -0.2F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(2.0F, 2.8F, -1.8F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, -0.0948F, 0.4353F, -0.0249F);


        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.5F, 1.0F, 2.7F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.2182F, 0.0F, 0.0F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.0F, 3.0F, -0.2F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0F, 0.0F, 0.1309F);


        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-2.0F, 2.8F, -1.8F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, -0.0948F, -0.4353F, 0.0249F);


        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(-0.5F, 1.0F, 2.7F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.2182F, 0.0F, 0.0F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(0.0F, 3.0F, -0.2F);
        this.ElbowL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 0.0F, 0.0F, -0.1309F);


        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 1.1F, -2.1F);
        this.Chest.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.1683F, 0.607F, 0.1361F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.2F, 0.3928F, 0.1668F);
        this.Neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2628F, 0.0843F, -0.0226F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 0, -0.4F, -0.3449F, -3.4166F, 1, 1, 3, -0.2F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.6F, -2.5F);
        this.Neck3.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.1308F, 0.5273F, 0.2057F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.1F, -1.4729F, -2.8744F);
        this.Neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6563F, 0.0692F, -0.0532F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 30, -0.5F, -0.6143F, -0.4957F, 1, 1, 4, -0.2F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -3.1F, -2.7F);
        this.Neck2.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.0615F, 0.3904F, 0.2653F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.5F, -1.5F);
        this.Neck1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1683F, 0.1721F, -0.0291F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 16, -0.5F, 0.2F, -0.4F, 1, 1, 2, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.6F, -1.5F);
        this.Neck1.addChild(Head);
        this.setRotateAngle(Head, 0.0995F, 0.2924F, 0.1959F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.8231F, 0.4496F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.2182F, 0.0F, 0.0F);

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
