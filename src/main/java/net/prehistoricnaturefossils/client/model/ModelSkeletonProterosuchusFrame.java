package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonProterosuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Proterosuchus;
    private final ModelRenderer Basin_r1;
    private final ModelRenderer LegL;
    private final ModelRenderer KneeL;
    private final ModelRenderer FootL;
    private final ModelRenderer LegL2;
    private final ModelRenderer KneeL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Tail4;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer ArmL;
    private final ModelRenderer ElbowL;
    private final ModelRenderer HandL;
    private final ModelRenderer ArmL2;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Neck1;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;

    public ModelSkeletonProterosuchusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 8.0F, 1.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 0.875F, 1.5F, -10.5F, 1, 15, 1, -0.25F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -0.475F, 11.2F, 1, 17, 1, -0.25F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 7.0F, 11.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 4.35F, -4.0F, -0.5F, 1, 8, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.4F, 7.0F, -10.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.6F, -5.0F, -0.5F, 1, 10, 1, -0.2F, false));

        this.Proterosuchus = new ModelRenderer(this);
        this.Proterosuchus.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(Proterosuchus);


        this.Basin_r1 = new ModelRenderer(this);
        this.Basin_r1.setRotationPoint(0.0F, -1.0F, 7.9F);
        this.Proterosuchus.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.0524F, 0.0F, 0.0F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, -1, -1, -0.5F, 0.25F, -1.0F, 1, 1, 8, -0.2F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(4.0F, 1.0F, 12.0F);
        this.Proterosuchus.addChild(LegL);
        this.setRotateAngle(LegL, 0.1785F, 0.5416F, -0.2978F);


        this.KneeL = new ModelRenderer(this);
        this.KneeL.setRotationPoint(2.0F, 6.0F, -2.0F);
        this.LegL.addChild(KneeL);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(-4.0F, 7.7F, 0.0F);
        this.KneeL.addChild(FootL);


        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-4.0F, 1.0F, 12.0F);
        this.Proterosuchus.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.1785F, -0.5416F, 0.2978F);


        this.KneeL2 = new ModelRenderer(this);
        this.KneeL2.setRotationPoint(-2.0F, 6.0F, -2.0F);
        this.LegL2.addChild(KneeL2);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(4.0F, 7.7F, 0.0F);
        this.KneeL2.addChild(FootL2);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.6F, 15.0F);
        this.Proterosuchus.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.044F, 0.1308F, -0.0057F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -0.3F);
        this.Tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2007F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 38, -0.5F, 0.1976F, -0.0936F, 1, 1, 10, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 1.8F, 9.2F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0886F, 0.1739F, 0.0154F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.1F, -0.1F);
        this.Tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 35, -0.5F, 0.2143F, -0.1791F, 1, 1, 14, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 3.4F, 12.8F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0894F, 0.2173F, 0.0193F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.5977F, -0.0523F);
        this.Tail3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2967F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 19, -0.5F, -0.25F, -0.9F, 1, 1, 17, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 4.6977F, 14.7477F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0F, 0.3054F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.3F, 0.6F);
        this.Tail4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1571F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, -0.025F, -0.7F, 1, 1, 17, -0.2F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.0F, 8.0F);
        this.Proterosuchus.addChild(Body);
        this.setRotateAngle(Body, 0.0F, -0.0873F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 19, -0.5F, 0.25F, -14.0F, 1, 1, 14, -0.2F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 1.1F, -13.3F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0F, 0.0436F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.7F, -3.8F);
        this.Chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 64, 54, 0.0F, 0.2475F, -0.0261F, 1, 1, 4, -0.2F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 1.9F, -7.6F);
        this.Chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2443F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, -1, 64, 0.0F, 0.0024F, 0.0513F, 1, 1, 5, -0.22F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(4.5F, 5.9F, -5.2F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.5657F, 0.2185F, -0.329F);


        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(-1.2F, 6.7336F, 2.1759F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.0324F, 0.0131F, 0.3838F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.0F, 2.277F, -4.6669F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, -0.0873F, 0.0F, 0.0F);


        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-4.5F, 5.9F, -5.2F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 1.133F, -0.2185F, 0.329F);


        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(1.2F, 6.7336F, 2.1759F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.5123F, -0.0131F, -0.3838F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(0.0F, 2.277F, -4.6669F);
        this.ElbowL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 0.9599F, 0.0F, 0.0F);


        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 1.4F, -7.2F);
        this.Chest.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2457F, 0.1595F, 0.0939F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.6333F, -0.3939F);
        this.Neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1094F, 0.0782F, -0.0069F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 63, -0.5F, -0.3257F, -4.9924F, 1, 1, 6, -0.2F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -0.1F, -4.1F);
        this.Neck2.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.4662F, 0.3908F, 0.0855F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.0F, -6.0F);
        this.Neck1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.192F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 58, -0.5F, 0.1593F, 1.0255F, 1, 1, 5, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.0F, -6.0F);
        this.Neck1.addChild(Head);
        this.setRotateAngle(Head, 0.1661F, 0.1666F, 0.4162F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.92F, 0.0568F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.624F, 0.0F, 0.0F);

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
