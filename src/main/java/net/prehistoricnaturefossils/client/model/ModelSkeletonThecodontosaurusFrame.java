package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonThecodontosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer Thecodontosaurus;
    private final ModelRenderer Basin;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer HindlimbL;
    private final ModelRenderer KneeL;
    private final ModelRenderer MetatarsalsL;
    private final ModelRenderer PesL;
    private final ModelRenderer HindlimbL2;
    private final ModelRenderer KneeL2;
    private final ModelRenderer MetatarsalsL2;
    private final ModelRenderer PesL2;
    private final ModelRenderer Body;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer Chest;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer ForearmL;
    private final ModelRenderer ElbowL;
    private final ModelRenderer ManusL;
    private final ModelRenderer ForearmL2;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer ManusL2;
    private final ModelRenderer Neck1;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Neck2;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Neck3;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer ThroatPouch;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer Tail1;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer Tail4;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer Tail5;

    public ModelSkeletonThecodontosaurusFrame() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -22.9F, 5.0F, 1, 23, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, -1, 1, -2.5F, -22.5F, 5.02F, 5, 1, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, 2.78F, -22.9F, -12.25F, 1, 23, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(3.75F, -18.0F, -12.25F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, -0.48F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -2, 1, -4.0F, -1.0F, 0.0F, 8, 1, 1, -0.1F, false));

        this.Thecodontosaurus = new ModelRenderer(this);
        this.Thecodontosaurus.setRotationPoint(1.0F, 6.3F, -23.0F);
        this.fossil.addChild(Thecodontosaurus);


        this.Basin = new ModelRenderer(this);
        this.Basin.setRotationPoint(-1.2F, -31.0F, 25.6F);
        this.Thecodontosaurus.addChild(Basin);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(1.2F, 1.4F, -0.3F);
        this.Basin.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.0436F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 36, 0, -1.5F, -0.4F, -0.3F, 1, 1, 8, -0.1F, false));

        this.HindlimbL = new ModelRenderer(this);
        this.HindlimbL.setRotationPoint(2.0F, 1.6F, 3.1F);
        this.Basin.addChild(HindlimbL);
        this.setRotateAngle(HindlimbL, -0.0622F, -0.0021F, 0.0138F);


        this.KneeL = new ModelRenderer(this);
        this.KneeL.setRotationPoint(0.0F, 8.9F, -2.1F);
        this.HindlimbL.addChild(KneeL);
        this.setRotateAngle(KneeL, 0.9559F, -0.1071F, 0.0754F);


        this.MetatarsalsL = new ModelRenderer(this);
        this.MetatarsalsL.setRotationPoint(0.0F, 10.9F, 1.7F);
        this.KneeL.addChild(MetatarsalsL);
        this.setRotateAngle(MetatarsalsL, -0.6981F, 0.0F, 0.0F);


        this.PesL = new ModelRenderer(this);
        this.PesL.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.MetatarsalsL.addChild(PesL);
        this.setRotateAngle(PesL, 0.2077F, 0.0271F, -0.1281F);


        this.HindlimbL2 = new ModelRenderer(this);
        this.HindlimbL2.setRotationPoint(-1.6F, 1.6F, 3.1F);
        this.Basin.addChild(HindlimbL2);
        this.setRotateAngle(HindlimbL2, -0.6283F, 0.0F, 0.0F);


        this.KneeL2 = new ModelRenderer(this);
        this.KneeL2.setRotationPoint(0.0F, 8.9F, -2.1F);
        this.HindlimbL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, 0.8656F, 0.0719F, -0.1178F);


        this.MetatarsalsL2 = new ModelRenderer(this);
        this.MetatarsalsL2.setRotationPoint(0.0F, 10.9F, 1.7F);
        this.KneeL2.addChild(MetatarsalsL2);
        this.setRotateAngle(MetatarsalsL2, -0.5234F, 0.0186F, 0.0398F);


        this.PesL2 = new ModelRenderer(this);
        this.PesL2.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.MetatarsalsL2.addChild(PesL2);
        this.setRotateAngle(PesL2, 0.3399F, -0.0091F, 0.0429F);


        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.2F, 2.0F, -0.6F);
        this.Basin.addChild(Body);
        this.setRotateAngle(Body, 0.0447F, -0.218F, -0.0097F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(1.0F, -0.9F, -13.3F);
        this.Body.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0175F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 0, 19, -1.5F, -0.3F, -0.3F, 1, 1, 14, -0.1F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -1.0F, -13.0F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.1309F, -0.2618F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 0.6F, -5.0F);
        this.Chest.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.1309F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 48, 44, -0.5F, -0.2F, 0.0F, 1, 1, 5, -0.1F, false));

        this.ForearmL = new ModelRenderer(this);
        this.ForearmL.setRotationPoint(3.5F, 4.1F, -3.4F);
        this.Chest.addChild(ForearmL);
        this.setRotateAngle(ForearmL, 0.6109F, 0.0F, 0.0F);


        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.0F, 4.5F, 0.4F);
        this.ForearmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.829F, 0.0F, 0.0F);


        this.ManusL = new ModelRenderer(this);
        this.ManusL.setRotationPoint(0.3F, 4.2729F, 0.5161F);
        this.ElbowL.addChild(ManusL);
        this.setRotateAngle(ManusL, 0.0F, 0.0F, 0.2182F);


        this.ForearmL2 = new ModelRenderer(this);
        this.ForearmL2.setRotationPoint(-3.5F, 4.1F, -3.4F);
        this.Chest.addChild(ForearmL2);
        this.setRotateAngle(ForearmL2, 0.6109F, 0.0F, 0.0F);


        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(0.0F, 4.5F, 0.4F);
        this.ForearmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.829F, 0.0F, 0.0F);


        this.ManusL2 = new ModelRenderer(this);
        this.ManusL2.setRotationPoint(-0.3F, 4.2729F, 0.5161F);
        this.ElbowL2.addChild(ManusL2);
        this.setRotateAngle(ManusL2, 0.0F, 0.0F, -0.2182F);


        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.0F, -4.6F);
        this.Chest.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.0F, -0.4363F, 0.0F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 0.1F, -5.2F);
        this.Neck1.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.1571F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 0, 47, -0.5F, -0.5209F, -0.5223F, 1, 1, 6, -0.1F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.0233F, -0.085F, 0.0682F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Neck2.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.2793F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 56, 3, -0.5F, -2.5F, 0.2F, 1, 1, 4, -0.1F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.0447F, -0.218F, -0.0097F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(1.0F, 0.0F, -3.0F);
        this.Neck3.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.48F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 47, 0, -1.5F, -2.1F, -1.4F, 1, 1, 5, -0.1F, false));

        this.ThroatPouch = new ModelRenderer(this);
        this.ThroatPouch.setRotationPoint(0.0F, 0.0F, -3.6F);
        this.Neck3.addChild(ThroatPouch);
        this.setRotateAngle(ThroatPouch, 1.0472F, 0.0F, 0.0F);


        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -3.4F, -3.1F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, -0.0641F, -0.1335F, 0.0606F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.403F, 0.0388F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.1309F, 0.0F, 0.0F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(-0.3F, 2.0F, 6.3F);
        this.Basin.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0262F, -0.0436F, -0.0011F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, -0.2F, 0.1F);
        this.Tail1.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.0436F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 34, 15, 0.0F, -0.5F, -0.1F, 1, 1, 12, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.5F, 0.0F, 11.2F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.035F, -0.0872F, -0.0031F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 18, 22, -0.5F, -0.2F, 0.0F, 1, 1, 13, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 12.3F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0F, -0.0873F, 0.0F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.0F, 0.4F, 0.4F);
        this.Tail3.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, -0.096F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 20, 0, -0.5F, -0.5799F, -0.3681F, 1, 1, 13, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.3F, 12.4F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0F, 0.1309F, 0.0F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.0F, 1.7F, 0.0F);
        this.Tail4.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, -0.2531F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 0, 0, -0.5F, -0.4847F, -0.1455F, 1, 1, 17, -0.1F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 2.9F, 13.0F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.4363F, 0.0F, 0.0F);

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
