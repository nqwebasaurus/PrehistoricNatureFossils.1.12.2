package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDilophosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer Dilophosaurus;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer LegL;
    private final ModelRenderer TibiaL;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer FootL;
    private final ModelRenderer LegL2;
    private final ModelRenderer TibiaL2;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer Tail1;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer frame11_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer frame13_r1;
    private final ModelRenderer Tail5;
    private final ModelRenderer frame14_r1;
    private final ModelRenderer Body;
    private final ModelRenderer frame7_r1;
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
    private final ModelRenderer frame1_r1;
    private final ModelRenderer Head;
    private final ModelRenderer ParasagittalCrest;
    private final ModelRenderer ParasagittalCrest2;
    private final ModelRenderer Jaw;

    public ModelSkeletonDilophosaurusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.48F, -22.9F, 7.5F, 1, 23, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -1.0F, -23.9F, -13.0F, 1, 24, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-0.4418F, -19.0252F, -12.3712F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, 0.0873F, 0.0175F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -3, 1, -3.5F, -0.5F, -0.5F, 7, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(-0.0436F, -21.9981F, 8.0F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, -0.0436F, 0.0F, -0.0873F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -2, 1, -4.0F, -0.5F, -0.5F, 8, 1, 1, -0.1F, false));

        this.Dilophosaurus = new ModelRenderer(this);
        this.Dilophosaurus.setRotationPoint(0.0F, -24.0F, 8.0F);
        this.fossil.addChild(Dilophosaurus);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.0F, 0.5F, -1.75F);
        this.Dilophosaurus.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, -0.1571F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 42, 44, -0.5F, -0.1846F, 0.0763F, 1, 1, 6, -0.1F, false));

        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, 0.5F, -6.4F);
        this.Dilophosaurus.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, -0.0785F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 45, 17, -0.5F, -0.569F, -0.0388F, 1, 1, 5, -0.1F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(3.0F, 2.4F, -0.7F);
        this.Dilophosaurus.addChild(LegL);
        this.setRotateAngle(LegL, 0.48F, 0.0F, 0.0F);


        this.TibiaL = new ModelRenderer(this);
        this.TibiaL.setRotationPoint(0.0F, 7.5092F, -2.9F);
        this.LegL.addChild(TibiaL);
        this.setRotateAngle(TibiaL, -0.1211F, 0.0159F, 0.1299F);


        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 7.7993F, 4.4236F);
        this.TibiaL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -0.5672F, 0.0F, 0.0F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(-0.5F, 5.7443F, -1.3272F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 0.5199F, 0.0653F, -0.1135F);


        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-3.0F, 2.4F, -0.7F);
        this.Dilophosaurus.addChild(LegL2);
        this.setRotateAngle(LegL2, -0.2618F, 0.0F, 0.0F);


        this.TibiaL2 = new ModelRenderer(this);
        this.TibiaL2.setRotationPoint(0.0F, 7.5092F, -2.9F);
        this.LegL2.addChild(TibiaL2);
        this.setRotateAngle(TibiaL2, 0.0087F, 0.0011F, -0.1309F);


        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(0.0F, 7.7993F, 4.4236F);
        this.TibiaL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, 0.0436F, -0.0019F, 0.0436F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.5F, 4.7941F, -0.1838F);
        this.MetatarsalL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.2174F, -0.0189F, 0.0852F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(-0.2F, 0.8F, 4.5F);
        this.Dilophosaurus.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.035F, 0.0872F, 0.0031F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.7F, 0.716F, -0.5072F);
        this.Tail1.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, -0.096F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 12, 30, -1.0F, -0.208F, -0.0696F, 1, 1, 12, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.2F, 1.0966F, 10.6773F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0876F, 0.0869F, 0.0076F);


        this.frame11_r1 = new ModelRenderer(this);
        this.frame11_r1.setRotationPoint(0.0F, 0.9676F, -0.0959F);
        this.Tail2.addChild(frame11_r1);
        this.setRotateAngle(frame11_r1, -0.0087F, 0.0F, 0.0F);
        this.frame11_r1.cubeList.add(new ModelBox(frame11_r1, 0, 15, -0.5F, -0.5F, 0.0F, 1, 1, 13, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.1F, 0.1365F, 12.8245F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1152F, -0.1734F, -0.02F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, -1, 29, -0.6F, 0.4772F, -0.4659F, 1, 1, 12, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(-0.3F, -0.0109F, 11.0431F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.044F, -0.1308F, 0.0057F);


        this.frame13_r1 = new ModelRenderer(this);
        this.frame13_r1.setRotationPoint(0.2F, 1.1121F, 0.0778F);
        this.Tail4.addChild(frame13_r1);
        this.setRotateAngle(frame13_r1, -0.1309F, 0.0F, 0.0F);
        this.frame13_r1.cubeList.add(new ModelBox(frame13_r1, 25, 3, -0.5F, -0.5621F, -0.3463F, 1, 1, 12, -0.1F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.2F, 1.5156F, 11.4095F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.0F, -0.2182F, 0.0F);


        this.frame14_r1 = new ModelRenderer(this);
        this.frame14_r1.setRotationPoint(0.5F, 0.4998F, -0.3061F);
        this.Tail5.addChild(frame14_r1);
        this.setRotateAngle(frame14_r1, -0.4363F, 0.0F, 0.0F);
        this.frame14_r1.cubeList.add(new ModelBox(frame14_r1, 17, 18, -1.0F, 0.0F, 0.0F, 1, 1, 12, -0.1F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.6F, -6.15F);
        this.Dilophosaurus.addChild(Body);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(-0.5F, -0.3F, 3.0F);
        this.Body.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.0262F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 32, 17, 0.0F, 0.9F, -13.0F, 1, 1, 10, -0.1F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.4F, -9.95F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0F, 0.0873F, 0.0F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(-0.5F, 1.2709F, -3.8339F);
        this.Chest.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.0436F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 47, 36, 0.0F, -0.4662F, -0.0652F, 1, 1, 4, -0.1F, false));

        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(-0.5F, 1.8709F, -7.2339F);
        this.Chest.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.2269F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 56, 46, 0.0F, -0.1986F, 0.0654F, 1, 1, 4, -0.1F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(3.4F, 6.0709F, -4.6339F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, -0.5546F, 0.1077F, -0.2867F);


        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.4977F, 2.6068F, 3.7518F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.1792F, -0.387F, 0.0683F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(-0.1F, 3.1257F, -1.6879F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, -0.0774F, 0.0403F, 0.5831F);


        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-3.4F, 6.0709F, -4.6339F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, -0.2804F, -0.3334F, 0.3595F);


        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(-0.4977F, 2.6068F, 3.7518F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.0428F, 0.3011F, -0.052F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(0.1F, 3.1257F, -1.6879F);
        this.ElbowL2.addChild(HandL2);
        this.setRotateAngle(HandL2, -0.0737F, -0.0468F, -0.6702F);


        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 1.019F, -6.411F);
        this.Chest.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.3957F, 0.1209F, 0.0503F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, -1.3623F, -4.4815F);
        this.Neck1.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.4538F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 17, 45, -0.5F, -0.1899F, -0.2974F, 1, 1, 5, -0.1F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -1.8703F, -3.8877F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0892F, 0.1627F, -0.1837F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(-0.5F, -1.8557F, -3.3571F);
        this.Neck2.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.7243F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 25, 1, 0.0F, -0.2456F, -0.9399F, 1, 1, 5, -0.1F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -2.4865F, -2.9614F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.3057F, 0.0416F, -0.0131F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.5F, -2.1054F, -3.4029F);
        this.Neck3.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.7243F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 0, 0, 0.0F, -0.1851F, 0.153F, 1, 1, 4, -0.1F, false));

        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(-0.5F, -2.1054F, -5.0529F);
        this.Neck3.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.1658F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 12, 66, 0.002F, -0.3133F, 0.111F, 1, 1, 2, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -2.9759F, -4.5542F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, -0.0566F, 0.0443F, -0.0131F);


        this.ParasagittalCrest = new ModelRenderer(this);
        this.ParasagittalCrest.setRotationPoint(0.0F, -0.0901F, -8.7023F);
        this.Head.addChild(ParasagittalCrest);
        this.setRotateAngle(ParasagittalCrest, 0.0038F, 0.0697F, 0.2183F);


        this.ParasagittalCrest2 = new ModelRenderer(this);
        this.ParasagittalCrest2.setRotationPoint(0.0F, -0.0901F, -8.7023F);
        this.Head.addChild(ParasagittalCrest2);
        this.setRotateAngle(ParasagittalCrest2, 0.0038F, -0.0697F, -0.2183F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.8099F, 0.0977F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.6545F, 0.0F, 0.0F);

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
