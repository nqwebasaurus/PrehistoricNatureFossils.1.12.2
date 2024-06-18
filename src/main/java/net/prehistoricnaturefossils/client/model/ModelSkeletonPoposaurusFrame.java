package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPoposaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer Poposaurus;
    private final ModelRenderer Basin;
    private final ModelRenderer Body;
    private final ModelRenderer Chest;
    private final ModelRenderer Neck;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Neck2;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer LArm;
    private final ModelRenderer LArm2;
    private final ModelRenderer LHand;
    private final ModelRenderer LArm3;
    private final ModelRenderer LArm4;
    private final ModelRenderer LHand2;
    private final ModelRenderer LLeg;
    private final ModelRenderer LLeg2;
    private final ModelRenderer LFoot;
    private final ModelRenderer LFoot2;
    private final ModelRenderer LLeg3;
    private final ModelRenderer LLeg4;
    private final ModelRenderer LFoot3;
    private final ModelRenderer LFoot4;
    private final ModelRenderer Tail;
    private final ModelRenderer Tail2;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer Tail4;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer tail5;

    public ModelSkeletonPoposaurusFrame() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.25F, -18.9F, 1.0F, 1, 19, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -2.0F, -16.9F, -13.4F, 1, 17, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-1.9816F, -12.4981F, -12.6953F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, -0.0512F, 0.3456F, -0.1391F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, 0, 1, -2.0F, -0.5F, -0.5F, 6, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(-0.25F, -17.75F, 2.0F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0226F, -0.0843F, -0.2628F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -1, 1, -3.0F, -1.0F, -1.0F, 7, 1, 1, -0.1F, false));

        this.Poposaurus = new ModelRenderer(this);
        this.Poposaurus.setRotationPoint(0.0F, -17.5F, -12.0F);
        this.fossil.addChild(Poposaurus);
        this.setRotateAngle(Poposaurus, -0.0436F, 0.0F, 0.0F);


        this.Basin = new ModelRenderer(this);
        this.Basin.setRotationPoint(0.0F, -2.0F, 13.0F);
        this.Poposaurus.addChild(Basin);
        this.setRotateAngle(Basin, 0.0F, 0.0F, -0.2182F);
        this.Basin.cubeList.add(new ModelBox(Basin, 37, 14, -0.5F, 0.9F, -3.0F, 1, 1, 7, -0.1F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.3F, -2.5F);
        this.Basin.addChild(Body);
        this.setRotateAngle(Body, 0.1056F, 0.1302F, 0.0138F);
        this.Body.cubeList.add(new ModelBox(Body, 1, 31, -0.5F, 1.143F, -8.8804F, 1, 1, 9, -0.1F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.043F, -8.9804F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.1056F, 0.217F, 0.0232F);
        this.Chest.cubeList.add(new ModelBox(Chest, 49, 5, -0.5F, 1.134F, -4.7594F, 1, 1, 5, -0.1F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.266F, -4.1594F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.1056F, 0.1302F, -0.0138F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.5F, 2.0472F, -3.0931F);
        this.Neck.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.1222F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 58, 0, -1.0F, -0.9F, 0.0F, 1, 1, 3, -0.1F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.0472F, -2.3931F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.1318F, 0.1108F, 0.1607F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, 1.6869F, -3.5168F);
        this.Neck2.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.0788F, 0.087F, -0.0069F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 57, 20, -0.5F, -0.6569F, 0.4938F, 1, 1, 3, -0.1F, false));

        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 2.1613F, -4.3732F);
        this.Neck2.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.1309F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 59, 40, -0.5F, -0.9F, -0.3F, 1, 1, 2, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.0387F, -4.4732F);
        this.Neck2.addChild(Head);
        this.setRotateAngle(Head, -0.0082F, 0.2531F, -0.1886F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.7855F, 0.4106F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.7418F, 0.0F, 0.0F);


        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(1.8F, 4.934F, -3.2594F);
        this.Chest.addChild(LArm);
        this.setRotateAngle(LArm, 1.1763F, 0.0715F, -0.0501F);


        this.LArm2 = new ModelRenderer(this);
        this.LArm2.setRotationPoint(1.0F, 3.5F, 0.5F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, -1.7017F, 0.0F, 0.0F);


        this.LHand = new ModelRenderer(this);
        this.LHand.setRotationPoint(1.0F, 4.0F, 0.0F);
        this.LArm2.addChild(LHand);
        this.setRotateAngle(LHand, 0.0F, 0.0F, 0.4363F);


        this.LArm3 = new ModelRenderer(this);
        this.LArm3.setRotationPoint(-1.8F, 4.934F, -3.2594F);
        this.Chest.addChild(LArm3);
        this.setRotateAngle(LArm3, 0.9581F, -0.0715F, 0.0501F);


        this.LArm4 = new ModelRenderer(this);
        this.LArm4.setRotationPoint(-1.0F, 3.5F, 0.5F);
        this.LArm3.addChild(LArm4);
        this.setRotateAngle(LArm4, -0.6981F, 0.0F, 0.0F);


        this.LHand2 = new ModelRenderer(this);
        this.LHand2.setRotationPoint(-1.0F, 4.0F, 0.0F);
        this.LArm4.addChild(LHand2);
        this.setRotateAngle(LHand2, 0.0F, 0.0F, -0.4363F);


        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(2.3F, 1.0F, 2.0F);
        this.Basin.addChild(LLeg);
        this.setRotateAngle(LLeg, -1.0472F, 0.0F, 0.0F);


        this.LLeg2 = new ModelRenderer(this);
        this.LLeg2.setRotationPoint(1.0F, 6.0F, -1.8F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 1.309F, 0.0F, 0.0F);


        this.LFoot = new ModelRenderer(this);
        this.LFoot.setRotationPoint(0.0F, 10.4697F, 1.4627F);
        this.LLeg2.addChild(LFoot);
        this.setRotateAngle(LFoot, -0.0873F, 0.0F, 0.0F);


        this.LFoot2 = new ModelRenderer(this);
        this.LFoot2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.LFoot.addChild(LFoot2);
        this.setRotateAngle(LFoot2, 1.0908F, 0.0F, 0.0F);


        this.LLeg3 = new ModelRenderer(this);
        this.LLeg3.setRotationPoint(-2.3F, 1.0F, 2.0F);
        this.Basin.addChild(LLeg3);
        this.setRotateAngle(LLeg3, -0.0433F, 0.0057F, 0.1308F);


        this.LLeg4 = new ModelRenderer(this);
        this.LLeg4.setRotationPoint(-1.0F, 6.0F, -1.8F);
        this.LLeg3.addChild(LLeg4);
        this.setRotateAngle(LLeg4, 0.8708F, -0.0668F, 0.0562F);


        this.LFoot3 = new ModelRenderer(this);
        this.LFoot3.setRotationPoint(0.0F, 10.4697F, 1.4627F);
        this.LLeg4.addChild(LFoot3);
        this.setRotateAngle(LFoot3, 0.6109F, 0.0F, 0.0F);


        this.LFoot4 = new ModelRenderer(this);
        this.LFoot4.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.LFoot3.addChild(LFoot4);
        this.setRotateAngle(LFoot4, -1.3963F, 0.0F, 0.0F);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.2F, 3.0F);
        this.Basin.addChild(Tail);
        this.setRotateAngle(Tail, -0.0436F, 0.0872F, -0.0038F);
        this.Tail.cubeList.add(new ModelBox(Tail, 21, 14, -0.5F, 1.0979F, 0.096F, 1, 1, 11, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.3021F, 10.596F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0682F, 0.2031F, -0.0795F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(-0.5F, 2.1488F, -0.0724F);
        this.Tail2.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, -0.0873F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 19, 28, 0.0F, -0.7F, -0.6F, 1, 1, 9, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 1.0488F, 8.0276F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0616F, 0.1307F, 0.008F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.0F, 1.6282F, 0.2961F);
        this.Tail3.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, -0.0436F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 0, 16, -0.5F, -0.5F, -0.2F, 1, 1, 12, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.2282F, 11.7961F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1745F, -0.0859F, 0.0152F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.0F, 1.9206F, -0.4069F);
        this.Tail4.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, 0.0698F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 14, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0206F, 13.4931F);
        this.Tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3054F, -0.1664F, 0.053F);
        this.tail5.cubeList.add(new ModelBox(tail5, 17, 0, -0.5F, 0.5858F, -0.7098F, 1, 1, 12, -0.1F, false));

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
