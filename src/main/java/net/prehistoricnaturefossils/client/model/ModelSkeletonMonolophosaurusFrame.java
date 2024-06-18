package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMonolophosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer Monolophosaurus;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer Body;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer Chest;
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
    private final ModelRenderer frame1_r1;
    private final ModelRenderer ThroatPouch;
    private final ModelRenderer Skull;
    private final ModelRenderer Jaw;
    private final ModelRenderer LegL;
    private final ModelRenderer TibiaL;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer FootL;
    private final ModelRenderer LegL2;
    private final ModelRenderer TibiaL2;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer Tail1;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer Tail4;
    private final ModelRenderer frame11_r1;
    private final ModelRenderer Tail5;
    private final ModelRenderer frame12_r1;

    public ModelSkeletonMonolophosaurusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -20.9F, 4.25F, 1, 21, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -1.31F, -20.9F, -13.2F, 1, 21, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-0.9F, -16.25F, -12.75F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0057F, 0.1308F, 0.044F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -2, 1, -4.0F, -0.5F, -0.5F, 8, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -19.5F, 4.25F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, 0.0436F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -2, 1, -4.0F, -1.0F, 0.0F, 8, 1, 1, -0.1F, false));

        this.Monolophosaurus = new ModelRenderer(this);
        this.Monolophosaurus.setRotationPoint(0.0F, -21.65F, 6.3F);
        this.fossil.addChild(Monolophosaurus);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(-2.0F, 0.3F, -3.8F);
        this.Monolophosaurus.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.1134F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 0, 40, 1.5F, -0.41F, -0.2835F, 1, 1, 8, -0.1F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.7F, -3.75F);
        this.Monolophosaurus.addChild(Body);
        this.setRotateAngle(Body, 0.0436F, 0.0436F, 0.0F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(-0.5F, 0.6F, 1.1F);
        this.Body.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.0262F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 15, 15, 0.0F, 0.0F, -13.0F, 1, 1, 12, -0.1F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.4F, -11.95F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0F, 0.0436F, 0.0F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 1.2F, -5.7F);
        this.Chest.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.0785F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 45, 26, -0.5F, -0.0436F, 0.001F, 1, 1, 6, -0.1F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(3.8F, 5.2F, -4.2F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, -0.4613F, 0.3652F, -0.0817F);


        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.1622F, 3.4F, 4.0765F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.3053F, -0.1719F, -0.4971F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.4F, 3.6F, -1.6F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0F, -0.3054F, -0.0698F);


        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-3.8F, 5.2F, -4.2F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 0.0F, -0.3054F, 0.0F);


        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(-0.1622F, 3.4F, 4.0765F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.3271F, 0.2213F, 0.5742F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(-0.4F, 3.6F, -1.6F);
        this.ElbowL2.addChild(HandL2);
        this.setRotateAngle(HandL2, -0.0608F, 0.4323F, -0.0308F);


        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.7F, -5.2F);
        this.Chest.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.1309F, 0.0F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, -1.4738F, -2.8262F);
        this.Neck1.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.5236F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 58, 7, -0.49F, 0.35F, -0.5F, 1, 1, 4, -0.1F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -1.6738F, -2.6262F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.2854F, 0.327F, -0.0602F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.1F, -0.8849F, -2.6007F);
        this.Neck2.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.7422F, 0.0322F, -0.0295F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 36, 52, -0.5F, -0.5F, -2.5F, 1, 1, 5, -0.1F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -3.3349F, -3.7508F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.176F, 0.1289F, -0.0229F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.5F, 0.0217F, -2.8551F);
        this.Neck3.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.1833F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 65, 43, 0.0F, 0.0F, 0.0F, 1, 1, 3, -0.1F, false));

        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(-0.5F, 0.0217F, -2.6051F);
        this.Neck3.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.2531F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 71, 11, 0.01F, 0.0F, -2.0F, 1, 1, 2, -0.1F, false));

        this.ThroatPouch = new ModelRenderer(this);
        this.ThroatPouch.setRotationPoint(0.0F, 4.2717F, -3.7551F);
        this.Neck3.addChild(ThroatPouch);
        this.setRotateAngle(ThroatPouch, -0.2967F, 0.0F, 0.0F);


        this.Skull = new ModelRenderer(this);
        this.Skull.setRotationPoint(0.0F, -0.5783F, -4.1551F);
        this.Neck3.addChild(Skull);
        this.setRotateAngle(Skull, 0.3982F, 0.0598F, 0.0886F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(-0.5F, 2.35F, 0.55F);
        this.Skull.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.3054F, 0.0F, 0.0F);


        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(3.0F, 1.3F, -1.3F);
        this.Monolophosaurus.addChild(LegL);
        this.setRotateAngle(LegL, -0.4363F, 0.0F, 0.0F);


        this.TibiaL = new ModelRenderer(this);
        this.TibiaL.setRotationPoint(0.0F, 9.1011F, -4.0345F);
        this.LegL.addChild(TibiaL);
        this.setRotateAngle(TibiaL, 0.1745F, 0.0F, 0.0F);


        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 8.0702F, 4.8356F);
        this.TibiaL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -0.1745F, 0.0F, 0.0F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 4.4771F, -1.2957F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 0.4363F, 0.0F, 0.0F);


        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-3.0F, 1.3F, -1.3F);
        this.Monolophosaurus.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.3491F, 0.0F, 0.0F);


        this.TibiaL2 = new ModelRenderer(this);
        this.TibiaL2.setRotationPoint(0.0F, 9.1011F, -4.0345F);
        this.LegL2.addChild(TibiaL2);
        this.setRotateAngle(TibiaL2, 0.5672F, 0.0F, 0.0F);


        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(0.0F, 8.0702F, 4.8356F);
        this.TibiaL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, 0.0873F, 0.0F, 0.0F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 4.4771F, -1.2957F);
        this.MetatarsalL2.addChild(FootL2);
        this.setRotateAngle(FootL2, -0.0878F, 0.0005F, 0.0065F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(-0.2F, -0.05F, 3.7F);
        this.Monolophosaurus.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.0699F, -0.0435F, 0.003F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.7F, 0.8494F, 1.9174F);
        this.Tail1.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, -0.0436F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 0, 13, -1.0F, 0.0F, -2.0F, 1, 1, 12, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.2F, 0.5412F, 11.9189F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0354F, 0.1744F, 0.0062F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.0F, 0.7275F, -0.5676F);
        this.Tail2.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, 0.0349F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 19, -1, -0.5F, 0.0F, 0.0F, 1, 1, 13, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.1F, -0.1757F, 11.8114F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0876F, -0.0869F, -0.0076F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(-0.6F, 0.4277F, -0.7401F);
        this.Tail3.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, -0.0698F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 14, 29, 0.0F, 0.0F, 1.0F, 1, 1, 11, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(-0.3F, 0.6493F, 11.0355F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0352F, -0.1308F, -0.0046F);


        this.frame11_r1 = new ModelRenderer(this);
        this.frame11_r1.setRotationPoint(0.2F, 0.5997F, -0.1105F);
        this.Tail4.addChild(frame11_r1);
        this.setRotateAngle(frame11_r1, -0.2705F, 0.0F, 0.0F);
        this.frame11_r1.cubeList.add(new ModelBox(frame11_r1, 0, 27, -0.5F, 0.0F, 0.0F, 1, 1, 11, -0.1F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.2F, 2.7997F, 10.1395F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.0177F, -0.1745F, -0.0031F);


        this.frame12_r1 = new ModelRenderer(this);
        this.frame12_r1.setRotationPoint(0.5F, 0.9544F, 0.55F);
        this.Tail5.addChild(frame12_r1);
        this.setRotateAngle(frame12_r1, -0.48F, 0.0F, 0.0F);
        this.frame12_r1.cubeList.add(new ModelBox(frame12_r1, 36, 0, -1.0F, 0.0F, -0.9F, 1, 1, 9, -0.1F, false));

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
