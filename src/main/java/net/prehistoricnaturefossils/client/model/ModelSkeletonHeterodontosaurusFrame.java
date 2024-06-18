package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHeterodontosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer Heterodontosaurus;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer LegL;
    private final ModelRenderer KneeL;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer FootL;
    private final ModelRenderer LegL2;
    private final ModelRenderer KneeL2;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer Tail1;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer Tail4;
    private final ModelRenderer Body;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer Chest;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer ArmL;
    private final ModelRenderer ElbowL;
    private final ModelRenderer HandL;
    private final ModelRenderer ArmL2;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer Neck3;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Neck2;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Neck1;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer Head;
    private final ModelRenderer HeadSlopeL;
    private final ModelRenderer HeadSlopeL2;
    private final ModelRenderer BrowL;
    private final ModelRenderer BrowL2;
    private final ModelRenderer TeethML;
    private final ModelRenderer TeethML2;
    private final ModelRenderer Jaw;
    private final ModelRenderer JawSlopeL;
    private final ModelRenderer JawSlopeL2;
    private final ModelRenderer TeethL;
    private final ModelRenderer TeethL2;

    public ModelSkeletonHeterodontosaurusFrame() {
        this.textureWidth = 53;
        this.textureHeight = 53;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -14.9F, 2.25F, 1, 15, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -13.9F, -8.0F, 1, 14, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(0.5F, -11.35F, -7.36F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0006F, -0.0349F, -0.0349F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -1, 1, -3.0F, -0.5F, -0.5F, 5, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -15.0F, 2.65F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, 0.0175F, -0.0436F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -1, 1, -3.0F, -0.5F, -0.5F, 6, 1, 1, -0.1F, false));

        this.Heterodontosaurus = new ModelRenderer(this);
        this.Heterodontosaurus.setRotationPoint(0.0F, -16.0F, 3.0F);
        this.fossil.addChild(Heterodontosaurus);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.5F, 0.5F, -1.3F);
        this.Heterodontosaurus.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.1571F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 26, 21, -1.0F, -0.307F, -0.1524F, 1, 1, 4, -0.1F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(3.1F, 0.7F, -0.2F);
        this.Heterodontosaurus.addChild(LegL);
        this.setRotateAngle(LegL, -1.2654F, 0.0F, 0.0F);


        this.KneeL = new ModelRenderer(this);
        this.KneeL.setRotationPoint(0.0F, 5.9899F, -0.4428F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 0.5186F, -0.1139F, -0.0647F);


        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 2.9736F, 7.3809F);
        this.KneeL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -1.0581F, 0.1525F, 0.0853F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 3.1F, 1.6F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 1.6493F, 0.0F, 0.0F);


        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-3.1F, 0.7F, -0.2F);
        this.Heterodontosaurus.addChild(LegL2);
        this.setRotateAngle(LegL2, -0.0873F, 0.0F, 0.0F);


        this.KneeL2 = new ModelRenderer(this);
        this.KneeL2.setRotationPoint(0.7F, 5.6899F, -0.4428F);
        this.LegL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, -0.0086F, -0.0015F, -0.1745F);


        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(-0.7F, 3.2736F, 7.3836F);
        this.KneeL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, -0.1478F, 0.008F, 0.1307F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 3.1F, 1.6F);
        this.MetatarsalL2.addChild(FootL2);
        this.setRotateAngle(FootL2, -0.3578F, 0.0F, 0.0F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.3F, 2.6F);
        this.Heterodontosaurus.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0425F, -0.0769F, -0.0031F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, 1.2697F, 3.4048F);
        this.Tail1.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, -0.0873F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 12, 14, -0.5F, -0.5F, -4.0F, 1, 1, 8, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.4F, 6.7F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.132F, -0.1298F, -0.0172F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 16, 0, -0.5F, 0.8F, 0.1F, 1, 1, 9, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.5F, 0.1F, 9.2F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1896F, 0.2573F, -0.0488F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.0F, 1.0F, -0.4F);
        this.Tail3.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, 0.0175F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 0, 15, -1.0F, -0.3F, 0.0F, 1, 1, 10, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 9.8F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.2903F, 0.1255F, -0.0374F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -1.0F, 0.6F, -0.3F, 1, 1, 13, -0.1F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.2F, -1.5F);
        this.Heterodontosaurus.addChild(Body);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.0F, 0.3126F, -3.3385F);
        this.Body.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.0262F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 33, 12, -0.49F, -0.0068F, -0.052F, 1, 1, 4, -0.1F, false));

        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 1.2F, -5.8F);
        this.Body.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.1309F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 14, 35, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.1F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -5.7F);
        this.Body.addChild(Chest);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-0.01F, 2.0208F, -2.0531F);
        this.Chest.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.3578F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 0, 0, -0.5F, -0.5F, -2.5F, 1, 1, 5, -0.1F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(2.1F, 4.6F, -3.5F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.2323F, 0.3767F, -0.2457F);


        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.0F, 2.5F, 2.9F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.6282F, 0.0023F, 0.1309F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.0F, 3.6F, -1.9F);
        this.ElbowL.addChild(HandL);


        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-2.1F, 4.6F, -3.5F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, -0.1168F, -0.3767F, 0.2457F);


        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(0.0F, 2.5F, 2.9F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.0173F, -0.0023F, -0.1309F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(0.0F, 3.6F, -1.9F);
        this.ElbowL2.addChild(HandL2);


        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 1.6F, -4.4F);
        this.Chest.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.0436F, 0.0F, 0.0F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 0.7119F, -1.5739F);
        this.Neck3.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.2793F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 30, 33, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.1F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.6F, -2.7F);
        this.Neck3.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0713F, -0.2129F, 0.0985F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, -1.2F, -2.05F);
        this.Neck2.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.7679F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 8, 32, -0.5F, -0.1425F, -0.06F, 1, 1, 3, -0.1F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -2.1F, -2.0F);
        this.Neck2.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.0F, -0.1745F, 0.0F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 1.0894F, -0.9216F);
        this.Neck1.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.2967F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 42, 41, -0.5F, -0.5494F, -1.0F, 1, 1, 2, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.4F, -1.4F);
        this.Neck1.addChild(Head);
        this.setRotateAngle(Head, -0.1745F, 0.0F, 0.0F);


        this.HeadSlopeL = new ModelRenderer(this);
        this.HeadSlopeL.setRotationPoint(0.0F, 2.2F, -4.8F);
        this.Head.addChild(HeadSlopeL);


        this.HeadSlopeL2 = new ModelRenderer(this);
        this.HeadSlopeL2.setRotationPoint(0.0F, 2.2F, -4.8F);
        this.Head.addChild(HeadSlopeL2);


        this.BrowL = new ModelRenderer(this);
        this.BrowL.setRotationPoint(0.8F, 0.3F, -3.4F);
        this.Head.addChild(BrowL);


        this.BrowL2 = new ModelRenderer(this);
        this.BrowL2.setRotationPoint(-0.8F, 0.3F, -3.4F);
        this.Head.addChild(BrowL2);


        this.TeethML = new ModelRenderer(this);
        this.TeethML.setRotationPoint(0.4F, 2.8F, -3.9F);
        this.Head.addChild(TeethML);


        this.TeethML2 = new ModelRenderer(this);
        this.TeethML2.setRotationPoint(-0.4F, 2.8F, -3.9F);
        this.Head.addChild(TeethML2);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.1F, 0.5F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.2182F, 0.0F, 0.0F);


        this.JawSlopeL = new ModelRenderer(this);
        this.JawSlopeL.setRotationPoint(0.0F, 2.0795F, -4.0256F);
        this.Jaw.addChild(JawSlopeL);


        this.JawSlopeL2 = new ModelRenderer(this);
        this.JawSlopeL2.setRotationPoint(0.0F, 2.0795F, -4.0256F);
        this.Jaw.addChild(JawSlopeL2);


        this.TeethL = new ModelRenderer(this);
        this.TeethL.setRotationPoint(0.5F, 1.6795F, -4.0256F);
        this.Jaw.addChild(TeethL);


        this.TeethL2 = new ModelRenderer(this);
        this.TeethL2.setRotationPoint(-0.5F, 1.6795F, -4.0256F);
        this.Jaw.addChild(TeethL2);

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
