package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDryosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer Dryosaurus;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer Body;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer Chest;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer ArmL;
    private final ModelRenderer ElbowL;
    private final ModelRenderer HandL;
    private final ModelRenderer ArmL2;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer Neck1;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Neck2;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Neck3;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Neck4;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer Head;
    private final ModelRenderer HeadslopeNOANIMATION;
    private final ModelRenderer HeadslopeNOANIMATION2;
    private final ModelRenderer Jaw;
    private final ModelRenderer JawSlopeNOANIMATION;
    private final ModelRenderer JawSlopeNOANIMATION2;
    private final ModelRenderer CheeksNOANIMATION;
    private final ModelRenderer CheeksNOANIMATION2;
    private final ModelRenderer Tail1;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer frame11_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer frame12_r1;
    private final ModelRenderer Tail4;
    private final ModelRenderer frame13_r1;
    private final ModelRenderer Tail5;
    private final ModelRenderer frame14_r1;
    private final ModelRenderer LegL;
    private final ModelRenderer KneeL;
    private final ModelRenderer TarsalsL;
    private final ModelRenderer FootL;
    private final ModelRenderer LegL2;
    private final ModelRenderer KneeL2;
    private final ModelRenderer TarsalsL2;
    private final ModelRenderer FootL2;

    public ModelSkeletonDryosaurusFrame() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -21.9F, 5.75F, 1, 22, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -19.9F, -14.5F, 1, 20, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(0.0F, -14.55F, -14.5F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, 0.0087F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -2, 1, -4.0F, -1.0F, 0.0F, 8, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -20.5F, 6.25F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, -0.0116F, -0.174F, 0.0885F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -2, 1, -4.0F, -0.5F, -0.5F, 8, 1, 1, -0.1F, false));

        this.Dryosaurus = new ModelRenderer(this);
        this.Dryosaurus.setRotationPoint(1.1F, -20.1F, -1.7F);
        this.fossil.addChild(Dryosaurus);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(-0.5F, -2.1226F, 3.5662F);
        this.Dryosaurus.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, -0.2094F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 13, 28, -1.0F, -0.6467F, -0.0823F, 1, 1, 8, -0.1F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 4.34F);
        this.Dryosaurus.addChild(Body);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(-1.0F, -2.16F, -10.24F);
        this.Body.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.0175F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 15, 16, -0.5F, -0.5F, 0.0F, 1, 1, 10, -0.1F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(-0.5F, -0.2F, -9.54F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.1396F, 0.0F, 0.0F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(-0.5F, -1.4855F, -4.4408F);
        this.Chest.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.1222F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 45, 46, -0.498F, -0.4428F, -0.1237F, 1, 1, 5, -0.1F, false));

        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(-0.5F, 0.706F, -9.3477F);
        this.Chest.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.3665F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 40, 25, -0.5F, -0.6485F, -0.2526F, 1, 1, 6, -0.1F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(3.0F, 4.3F, -8.9F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.7941F, 0.0F, 0.0F);


        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.0F, 5.7F, 1.7F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.5149F, 0.0F, 0.0F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(1.0F, 0.9F, -5.0F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0698F, 0.0F, 0.0F);


        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-4.2F, 4.3F, -8.9F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 0.7069F, 0.0F, 0.0F);


        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(0.0F, 5.7F, 1.7F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.5149F, 0.0F, 0.0F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(-1.0F, 0.9F, -5.0F);
        this.ElbowL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 0.0698F, 0.0F, 0.0F);


        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.14F, -8.66F);
        this.Chest.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.0F, 0.1309F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, -0.45F, -4.36F);
        this.Neck1.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.192F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 52, 42, -1.0F, -0.3643F, -0.0522F, 1, 1, 4, -0.1F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.28F, -3.22F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.0F, 0.2182F, 0.0F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, -2.13F, -3.71F);
        this.Neck2.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.6458F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 14, 15, -1.0F, -0.4569F, -0.1512F, 1, 1, 4, -0.1F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -3.0F, -2.0F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0873F, 0.0F, 0.0F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, -0.7512F, -3.7153F);
        this.Neck3.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.7505F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 50, 0, -0.998F, -0.5708F, -0.0574F, 1, 1, 3, -0.1F, false));

        this.Neck4 = new ModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, -1.6612F, -2.7253F);
        this.Neck3.addChild(Neck4);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(-0.5F, 0.56F, -1.9F);
        this.Neck4.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.2443F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 40, 57, -0.5F, -0.3148F, -0.4007F, 1, 1, 2, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.5F, -0.3F, -1.7F);
        this.Neck4.addChild(Head);
        this.setRotateAngle(Head, -0.0715F, 0.2176F, -0.0155F);


        this.HeadslopeNOANIMATION = new ModelRenderer(this);
        this.HeadslopeNOANIMATION.setRotationPoint(1.5F, 1.7039F, -2.6679F);
        this.Head.addChild(HeadslopeNOANIMATION);


        this.HeadslopeNOANIMATION2 = new ModelRenderer(this);
        this.HeadslopeNOANIMATION2.setRotationPoint(-1.5F, 1.7039F, -2.6679F);
        this.Head.addChild(HeadslopeNOANIMATION2);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.5039F, 0.2321F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.4363F, 0.0F, 0.0F);


        this.JawSlopeNOANIMATION = new ModelRenderer(this);
        this.JawSlopeNOANIMATION.setRotationPoint(0.4F, 0.1F, -3.1F);
        this.Jaw.addChild(JawSlopeNOANIMATION);


        this.JawSlopeNOANIMATION2 = new ModelRenderer(this);
        this.JawSlopeNOANIMATION2.setRotationPoint(-0.4F, 0.1F, -3.1F);
        this.Jaw.addChild(JawSlopeNOANIMATION2);


        this.CheeksNOANIMATION = new ModelRenderer(this);
        this.CheeksNOANIMATION.setRotationPoint(1.4F, 0.0F, -1.1F);
        this.Jaw.addChild(CheeksNOANIMATION);


        this.CheeksNOANIMATION2 = new ModelRenderer(this);
        this.CheeksNOANIMATION2.setRotationPoint(-1.4F, 0.0F, -1.1F);
        this.Jaw.addChild(CheeksNOANIMATION2);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(-1.0F, -1.42F, 11.44F);
        this.Dryosaurus.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.088F, -0.1304F, -0.0115F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(1.5F, 0.8F, -0.34F);
        this.Tail1.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, -0.2967F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 0, 13, -2.0F, -0.4835F, -0.1704F, 1, 1, 11, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 2.6F, 9.8F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0438F, -0.0872F, -0.0038F);


        this.frame11_r1 = new ModelRenderer(this);
        this.frame11_r1.setRotationPoint(0.4F, 1.3154F, -0.1548F);
        this.Tail2.addChild(frame11_r1);
        this.setRotateAngle(frame11_r1, -0.2094F, 0.0F, 0.0F);
        this.frame11_r1.cubeList.add(new ModelBox(frame11_r1, 0, 0, -0.9F, -0.4915F, -0.3029F, 1, 1, 11, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 2.32F, 9.84F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0F, 0.1745F, 0.0F);


        this.frame12_r1 = new ModelRenderer(this);
        this.frame12_r1.setRotationPoint(1.0F, -0.5F, 0.4F);
        this.Tail3.addChild(frame12_r1);
        this.setRotateAngle(frame12_r1, -0.0873F, 0.0F, 0.0F);
        this.frame12_r1.cubeList.add(new ModelBox(frame12_r1, 15, 3, -1.5F, 1.2F, -0.14F, 1, 1, 10, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 1.0F, 9.36F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.2204F, 0.1283F, -0.0259F);


        this.frame13_r1 = new ModelRenderer(this);
        this.frame13_r1.setRotationPoint(0.5F, 0.76F, 0.54F);
        this.Tail4.addChild(frame13_r1);
        this.setRotateAngle(frame13_r1, -0.0175F, 0.0F, 0.0F);
        this.frame13_r1.cubeList.add(new ModelBox(frame13_r1, 29, 25, -1.0F, -0.3272F, -0.2389F, 1, 1, 8, -0.1F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 8.2F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.2628F, 0.0843F, -0.0226F);


        this.frame14_r1 = new ModelRenderer(this);
        this.frame14_r1.setRotationPoint(1.0F, -0.52F, 0.57F);
        this.Tail5.addChild(frame14_r1);
        this.setRotateAngle(frame14_r1, -0.1745F, 0.0F, 0.0F);
        this.frame14_r1.cubeList.add(new ModelBox(frame14_r1, 28, 15, -1.5F, 1.2596F, -0.7196F, 1, 1, 8, -0.1F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(2.0F, -1.0F, 8.12F);
        this.Dryosaurus.addChild(LegL);
        this.setRotateAngle(LegL, 0.0087F, 0.0F, 0.0F);


        this.KneeL = new ModelRenderer(this);
        this.KneeL.setRotationPoint(0.0F, 8.6018F, -0.3526F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 1.2741F, 0.0F, 0.0F);


        this.TarsalsL = new ModelRenderer(this);
        this.TarsalsL.setRotationPoint(-0.6F, 7.0027F, 0.8964F);
        this.KneeL.addChild(TarsalsL);
        this.setRotateAngle(TarsalsL, -0.6545F, 0.0F, 0.0F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 7.2023F, 0.0633F);
        this.TarsalsL.addChild(FootL);
        this.setRotateAngle(FootL, 0.9687F, 0.0F, 0.0F);


        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-4.2F, -1.0F, 8.12F);
        this.Dryosaurus.addChild(LegL2);
        this.setRotateAngle(LegL2, -1.2555F, 0.083F, 0.027F);


        this.KneeL2 = new ModelRenderer(this);
        this.KneeL2.setRotationPoint(0.0F, 8.6018F, -0.3526F);
        this.LegL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, 1.5795F, 0.0F, 0.0F);


        this.TarsalsL2 = new ModelRenderer(this);
        this.TarsalsL2.setRotationPoint(0.6F, 7.0027F, 0.8964F);
        this.KneeL2.addChild(TarsalsL2);
        this.setRotateAngle(TarsalsL2, -1.5271F, -0.0436F, -0.0019F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 7.2023F, 0.0633F);
        this.TarsalsL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 1.885F, 0.0F, 0.0F);

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
