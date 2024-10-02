package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEocursorFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Eocursor;
    private final ModelRenderer basin_r1;
    private final ModelRenderer LegL;
    private final ModelRenderer KneeL;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer PesL;
    private final ModelRenderer LegL2;
    private final ModelRenderer KneeL2;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer PesL2;
    private final ModelRenderer Tail1;
    private final ModelRenderer Caudalproximal_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Caudalmedialproximal_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer Caudalmedialdistal_r1;
    private final ModelRenderer Tail4;
    private final ModelRenderer Caudaldistal_r1;
    private final ModelRenderer Body;
    private final ModelRenderer Thorax_r1;
    private final ModelRenderer Thorax_r2;
    private final ModelRenderer Chest;
    private final ModelRenderer Scapulo_Coracoid_r1;
    private final ModelRenderer ArmL;
    private final ModelRenderer ElbowL;
    private final ModelRenderer HandL;
    private final ModelRenderer ArmL2;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer Neck1;
    private final ModelRenderer CervicalDistal_r1;
    private final ModelRenderer Neck2;
    private final ModelRenderer CervicalMedial_r1;
    private final ModelRenderer Neck3;
    private final ModelRenderer Head;
    private final ModelRenderer HeadslopeL;
    private final ModelRenderer HeadslopeL2;
    private final ModelRenderer BrowL;
    private final ModelRenderer Jaw;
    private final ModelRenderer JawslopeL;
    private final ModelRenderer JawslopeL2;
    private final ModelRenderer MasseterR;

    public ModelSkeletonEocursorFrame() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -17.0F, -1.1F, 1, 17, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -16.0F, -11.0F, 1, 16, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -17.0F, -10.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -4.4F, -4.0F, -0.5F, 1, 7, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.0F, -3.0F, 9.4F, 1, 5, 1, -0.15F, false));

        this.Eocursor = new ModelRenderer(this);
        this.Eocursor.setRotationPoint(0.0F, -17.5F, 0.1F);
        this.fossil.addChild(Eocursor);
        this.setRotateAngle(Eocursor, -0.0873F, 0.0F, 0.0F);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(0.0F, -0.6F, -2.3F);
        this.Eocursor.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.0175F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 0, 26, -0.5F, 0.6285F, 0.1648F, 1, 1, 5, -0.15F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(2.7F, 0.9F, -0.6F);
        this.Eocursor.addChild(LegL);
        this.setRotateAngle(LegL, -1.7017F, 0.0F, 0.0F);


        this.KneeL = new ModelRenderer(this);
        this.KneeL.setRotationPoint(-0.1F, 5.4868F, 1.4076F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 2.3998F, 0.0F, 0.0F);


        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 8.3536F, 0.6562F);
        this.KneeL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -1.0385F, 0.0F, 0.0F);


        this.PesL = new ModelRenderer(this);
        this.PesL.setRotationPoint(-0.1F, 2.7F, -3.1F);
        this.MetatarsalL.addChild(PesL);
        this.setRotateAngle(PesL, 2.0944F, 0.0F, 0.0F);


        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-2.6F, 0.9F, -0.6F);
        this.Eocursor.addChild(LegL2);
        this.setRotateAngle(LegL2, -0.2182F, 0.0F, 0.0F);


        this.KneeL2 = new ModelRenderer(this);
        this.KneeL2.setRotationPoint(0.0F, 5.4868F, 1.4076F);
        this.LegL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, 0.9687F, 0.0522F, -0.0593F);


        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(0.0F, 8.3536F, 0.6562F);
        this.KneeL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, 0.1396F, 0.0F, 0.0F);


        this.PesL2 = new ModelRenderer(this);
        this.PesL2.setRotationPoint(0.1F, 2.7F, -3.1F);
        this.MetatarsalL2.addChild(PesL2);
        this.setRotateAngle(PesL2, -0.1745F, 0.0F, 0.0F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.3F, 2.6F);
        this.Eocursor.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0616F, -0.1307F, -0.008F);


        this.Caudalproximal_r1 = new ModelRenderer(this);
        this.Caudalproximal_r1.setRotationPoint(0.0F, 0.7052F, 0.6F);
        this.Tail1.addChild(Caudalproximal_r1);
        this.setRotateAngle(Caudalproximal_r1, -0.0873F, 0.0F, 0.0F);
        this.Caudalproximal_r1.cubeList.add(new ModelBox(Caudalproximal_r1, 13, 14, -0.5F, -0.2F, -0.7F, 1, 1, 7, -0.15F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.8052F, 6.7F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1139F, -0.0867F, -0.0099F);


        this.Caudalmedialproximal_r1 = new ModelRenderer(this);
        this.Caudalmedialproximal_r1.setRotationPoint(0.5F, 0.9F, 0.0F);
        this.Tail2.addChild(Caudalmedialproximal_r1);
        this.setRotateAngle(Caudalmedialproximal_r1, -0.0175F, 0.0F, 0.0F);
        this.Caudalmedialproximal_r1.cubeList.add(new ModelBox(Caudalmedialproximal_r1, 0, 14, -1.0F, -0.7F, -0.3F, 1, 1, 10, -0.15F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.4F, 10.1F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0089F, 0.1745F, -0.0015F);


        this.Caudalmedialdistal_r1 = new ModelRenderer(this);
        this.Caudalmedialdistal_r1.setRotationPoint(0.5F, 0.4997F, -0.0174F);
        this.Tail3.addChild(Caudalmedialdistal_r1);
        this.setRotateAngle(Caudalmedialdistal_r1, -0.1222F, 0.0F, 0.0F);
        this.Caudalmedialdistal_r1.cubeList.add(new ModelBox(Caudalmedialdistal_r1, 15, 0, -1.0F, -0.5F, -0.7F, 1, 1, 9, -0.15F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(-0.1F, 0.8997F, 8.9826F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0886F, 0.1739F, -0.0154F);


        this.Caudaldistal_r1 = new ModelRenderer(this);
        this.Caudaldistal_r1.setRotationPoint(0.6F, -0.4F, 0.0F);
        this.Tail4.addChild(Caudaldistal_r1);
        this.setRotateAngle(Caudaldistal_r1, -0.2269F, 0.0F, 0.0F);
        this.Caudaldistal_r1.cubeList.add(new ModelBox(Caudaldistal_r1, 0, 0, -1.0F, 0.7F, -0.7F, 1, 1, 12, -0.15F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.2F, -2.2F);
        this.Eocursor.addChild(Body);


        this.Thorax_r1 = new ModelRenderer(this);
        this.Thorax_r1.setRotationPoint(0.0F, 0.9F, -6.9F);
        this.Body.addChild(Thorax_r1);
        this.setRotateAngle(Thorax_r1, 0.2618F, 0.0F, 0.0F);
        this.Thorax_r1.cubeList.add(new ModelBox(Thorax_r1, 11, 35, -0.5F, 0.6295F, 0.5701F, 1, 1, 3, -0.15F, false));

        this.Thorax_r2 = new ModelRenderer(this);
        this.Thorax_r2.setRotationPoint(0.0F, 0.1F, -4.0F);
        this.Body.addChild(Thorax_r2);
        this.setRotateAngle(Thorax_r2, 0.1396F, 0.0F, 0.0F);
        this.Thorax_r2.cubeList.add(new ModelBox(Thorax_r2, 27, 32, -0.5F, 0.6517F, 0.2618F, 1, 1, 4, -0.15F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.1F, 1.4F, -6.8F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0436F, 0.0F, 0.0F);


        this.Scapulo_Coracoid_r1 = new ModelRenderer(this);
        this.Scapulo_Coracoid_r1.setRotationPoint(0.0F, 2.0F, -3.3F);
        this.Chest.addChild(Scapulo_Coracoid_r1);
        this.setRotateAngle(Scapulo_Coracoid_r1, 0.4189F, 0.0F, 0.0F);
        this.Scapulo_Coracoid_r1.cubeList.add(new ModelBox(Scapulo_Coracoid_r1, -1, 32, -0.6F, -0.2534F, -0.3052F, 1, 1, 5, -0.15F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(3.0F, 4.0F, -1.7F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.4451F, 0.0F, 0.0F);


        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.0F, 3.3F, 3.6F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, 0.0737F, -0.0468F, 0.5655F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.5F, 2.1F, -2.7F);
        this.ElbowL.addChild(HandL);


        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-3.2F, 4.0F, -1.7F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 0.1833F, 0.0F, 0.0F);


        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(0.0F, 3.3F, 3.6F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, 0.0807F, 0.0334F, -0.3914F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(-0.5F, 2.1F, -2.7F);
        this.ElbowL2.addChild(HandL2);


        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 1.3F, -3.3F);
        this.Chest.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.1355F, -0.2595F, 0.035F);


        this.CervicalDistal_r1 = new ModelRenderer(this);
        this.CervicalDistal_r1.setRotationPoint(0.5F, 0.0F, -1.9F);
        this.Neck1.addChild(CervicalDistal_r1);
        this.setRotateAngle(CervicalDistal_r1, -0.2967F, 0.0F, 0.0F);
        this.CervicalDistal_r1.cubeList.add(new ModelBox(CervicalDistal_r1, 40, 39, -1.1F, -0.2313F, -0.4487F, 1, 1, 3, -0.15F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.3F, -1.7F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2618F, 0.0F, 0.0F);


        this.CervicalMedial_r1 = new ModelRenderer(this);
        this.CervicalMedial_r1.setRotationPoint(0.5F, -1.7F, 1.4F);
        this.Neck2.addChild(CervicalMedial_r1);
        this.setRotateAngle(CervicalMedial_r1, -0.6458F, 0.0F, 0.0F);
        this.CervicalMedial_r1.cubeList.add(new ModelBox(CervicalMedial_r1, 35, 35, -1.1F, 2.3568F, -2.7613F, 1, 1, 3, -0.15F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.1F, -1.6F, -2.2F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.25F, -0.2116F, -0.0536F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 26, 43, -0.7F, 0.0917F, -1.8286F, 1, 1, 2, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.2F, -0.0255F, -1.2389F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, -0.0344F, -0.0061F, -0.1744F);


        this.HeadslopeL = new ModelRenderer(this);
        this.HeadslopeL.setRotationPoint(0.5F, 0.0779F, 0.9272F);
        this.Head.addChild(HeadslopeL);


        this.HeadslopeL2 = new ModelRenderer(this);
        this.HeadslopeL2.setRotationPoint(-0.5F, 0.0779F, 0.9272F);
        this.Head.addChild(HeadslopeL2);


        this.BrowL = new ModelRenderer(this);
        this.BrowL.setRotationPoint(0.5147F, 0.0603F, -2.7074F);
        this.Head.addChild(BrowL);
        this.setRotateAngle(BrowL, -0.0698F, 0.0F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(-0.5F, 0.9779F, 0.3272F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.1745F, 0.0F, 0.0F);


        this.JawslopeL = new ModelRenderer(this);
        this.JawslopeL.setRotationPoint(1.0F, -0.5808F, 0.9268F);
        this.Jaw.addChild(JawslopeL);


        this.JawslopeL2 = new ModelRenderer(this);
        this.JawslopeL2.setRotationPoint(0.0F, -0.5808F, 0.9268F);
        this.Jaw.addChild(JawslopeL2);


        this.MasseterR = new ModelRenderer(this);
        this.MasseterR.setRotationPoint(-0.3F, -2.3808F, 1.6268F);
        this.Jaw.addChild(MasseterR);

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
