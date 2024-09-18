package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDrepanosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Drepanosaurus;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Neck;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Neck4;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer LArm;
    private final ModelRenderer LArm2;
    private final ModelRenderer LHand;
    private final ModelRenderer LClaw;
    private final ModelRenderer LArm3;
    private final ModelRenderer LArm4;
    private final ModelRenderer LHand2;
    private final ModelRenderer LClaw2;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r12;
    private final ModelRenderer LLeg;
    private final ModelRenderer LLeg3;
    private final ModelRenderer LFoot;
    private final ModelRenderer finger;
    private final ModelRenderer finger2;
    private final ModelRenderer LFoot2;
    private final ModelRenderer LLeg2;
    private final ModelRenderer LLeg4;
    private final ModelRenderer LFoot3;
    private final ModelRenderer finger3;
    private final ModelRenderer finger4;
    private final ModelRenderer LFoot4;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tail5;
    private final ModelRenderer TailClaw;
    private final ModelRenderer cube_r13;

    public ModelSkeletonDrepanosaurusFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -12.0F, 15.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2094F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.9F, 1.0F, -0.5F, 1, 11, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -12.0F, 15.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2094F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 2.5F, -2.0F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -11.6F, -6.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0524F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 2.9F, -4.0F, -0.5F, 1, 7, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -11.6F, -6.8F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0524F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, 0.0F, -1.4F, -0.5F, 1, 13, 1, -0.16F, false));

        this.Drepanosaurus = new ModelRenderer(this);
        this.Drepanosaurus.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.fossil.addChild(Drepanosaurus);
        this.setRotateAngle(Drepanosaurus, -0.0436F, 0.0F, 0.0F);
        this.Drepanosaurus.cubeList.add(new ModelBox(Drepanosaurus, 22, -1, -0.5F, -1.5095F, -0.2033F, 1, 1, 6, -0.15F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -2.0872F, -5.8019F);
        this.Drepanosaurus.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 21, 0.0F, 0.7872F, -0.0981F, 1, 1, 6, -0.15F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.8F, -5.7F);
        this.Drepanosaurus.addChild(Body);
        this.setRotateAngle(Body, 0.0436F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.5421F, -2.9593F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2967F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 38, 0.0F, 0.7872F, -0.0981F, 1, 1, 3, -0.15F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 1.0293F, -2.4574F);
        this.Body.addChild(Neck);
        this.setRotateAngle(Neck, 0.5498F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0438F, -4.166F);
        this.Neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 31, -0.5F, -0.2128F, 0.0019F, 1, 1, 4, -0.15F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.4689F, -3.9641F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.354F, -0.1639F, 0.0602F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.7069F, -4.7823F);
        this.Neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2443F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 22, -0.5F, -0.3128F, -0.3981F, 1, 1, 6, -0.15F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -1.2196F, -4.4804F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.3862F, 0.1138F, 0.0476F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.6633F, -4.7532F);
        this.Neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 30, -0.5F, 0.5872F, 3.1019F, 1, 1, 3, -0.15F, false));

        this.Neck4 = new ModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, -0.9633F, -2.4532F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, -0.0873F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.6F, -2.2F);
        this.Neck4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4363F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 39, -0.5F, 0.4872F, 0.3019F, 1, 1, 3, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.0128F, -2.5981F);
        this.Neck4.addChild(Head);
        this.setRotateAngle(Head, -0.0422F, 0.0107F, 0.0186F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.4428F, 0.8655F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.6981F, 0.0F, 0.0F);


        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(3.5F, 5.8293F, -0.3574F);
        this.Body.addChild(LArm);
        this.setRotateAngle(LArm, 0.1621F, 0.4955F, -0.7707F);


        this.LArm2 = new ModelRenderer(this);
        this.LArm2.setRotationPoint(0.8F, 4.8F, -0.6F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, -0.9192F, 0.3457F, 0.2952F);


        this.LHand = new ModelRenderer(this);
        this.LHand.setRotationPoint(0.4598F, 5.8923F, -0.1104F);
        this.LArm2.addChild(LHand);
        this.setRotateAngle(LHand, 0.035F, 0.2595F, -1.4353F);


        this.LClaw = new ModelRenderer(this);
        this.LClaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LHand.addChild(LClaw);


        this.LArm3 = new ModelRenderer(this);
        this.LArm3.setRotationPoint(-2.5F, 5.8293F, -0.3574F);
        this.Body.addChild(LArm3);
        this.setRotateAngle(LArm3, 1.3065F, -0.444F, -0.0763F);


        this.LArm4 = new ModelRenderer(this);
        this.LArm4.setRotationPoint(-0.8F, 4.8F, -0.6F);
        this.LArm3.addChild(LArm4);
        this.setRotateAngle(LArm4, -1.0104F, 0.1313F, -0.3355F);


        this.LHand2 = new ModelRenderer(this);
        this.LHand2.setRotationPoint(-0.4598F, 5.8923F, -0.1104F);
        this.LArm4.addChild(LHand2);
        this.setRotateAngle(LHand2, 0.0F, 0.1745F, 1.5708F);


        this.LClaw2 = new ModelRenderer(this);
        this.LClaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LHand2.addChild(LClaw2);


        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.8F, 5.0F);
        this.Drepanosaurus.addChild(Body2);
        this.setRotateAngle(Body2, -0.0437F, -0.0436F, 0.0019F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -0.5017F, 0.0785F);
        this.Body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0524F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 18, -1.0F, 0.8F, 0.4F, 1, 1, 5, -0.15F, false));

        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0983F, 5.0785F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, 0.2628F, -0.0843F, -0.0226F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.3409F, 0.0894F);
        this.Tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3491F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 12, -0.5F, 0.8F, 0.0F, 1, 1, 7, -0.15F, false));

        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(2.0F, 4.4591F, 4.9894F);
        this.Tail.addChild(LLeg);
        this.setRotateAngle(LLeg, 0.0076F, -0.5725F, -0.7303F);


        this.LLeg3 = new ModelRenderer(this);
        this.LLeg3.setRotationPoint(0.3171F, 4.5972F, 1.1377F);
        this.LLeg.addChild(LLeg3);
        this.setRotateAngle(LLeg3, 1.5264F, 0.5574F, 0.4268F);


        this.LFoot = new ModelRenderer(this);
        this.LFoot.setRotationPoint(-0.3F, 4.7F, -0.2F);
        this.LLeg3.addChild(LFoot);
        this.setRotateAngle(LFoot, 0.6109F, -0.192F, 0.0F);


        this.finger = new ModelRenderer(this);
        this.finger.setRotationPoint(-1.2053F, -0.1F, 0.0294F);
        this.LFoot.addChild(finger);
        this.setRotateAngle(finger, 0.0F, 0.5672F, 0.0F);


        this.finger2 = new ModelRenderer(this);
        this.finger2.setRotationPoint(0.006F, 0.0F, -2.6068F);
        this.finger.addChild(finger2);


        this.LFoot2 = new ModelRenderer(this);
        this.LFoot2.setRotationPoint(-0.3053F, 0.6F, -2.4706F);
        this.LFoot.addChild(LFoot2);


        this.LLeg2 = new ModelRenderer(this);
        this.LLeg2.setRotationPoint(-2.0F, 4.4591F, 4.9894F);
        this.Tail.addChild(LLeg2);
        this.setRotateAngle(LLeg2, -0.9317F, 1.0521F, -0.2735F);


        this.LLeg4 = new ModelRenderer(this);
        this.LLeg4.setRotationPoint(-0.3171F, 4.5972F, 1.1377F);
        this.LLeg2.addChild(LLeg4);
        this.setRotateAngle(LLeg4, 0.6973F, -0.5574F, -0.4268F);


        this.LFoot3 = new ModelRenderer(this);
        this.LFoot3.setRotationPoint(0.3F, 4.7F, -0.2F);
        this.LLeg4.addChild(LFoot3);
        this.setRotateAngle(LFoot3, 0.0F, 0.192F, 0.0F);


        this.finger3 = new ModelRenderer(this);
        this.finger3.setRotationPoint(1.2053F, -0.1F, 0.0294F);
        this.LFoot3.addChild(finger3);
        this.setRotateAngle(finger3, 0.0F, -0.5672F, 0.0F);


        this.finger4 = new ModelRenderer(this);
        this.finger4.setRotationPoint(-0.006F, 0.0F, -2.6068F);
        this.finger3.addChild(finger4);


        this.LFoot4 = new ModelRenderer(this);
        this.LFoot4.setRotationPoint(0.3053F, 0.6F, -2.4706F);
        this.LFoot3.addChild(LFoot4);


        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 2.8591F, 6.3894F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1839F, -0.0858F, -0.0159F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, -2, -2, -0.5F, -0.1972F, -0.7265F, 1, 1, 11, -0.15F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.5972F, 9.6735F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1294F, -0.2615F, 0.0117F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 13, 0, -0.5F, 0.3979F, -0.004F, 1, 1, 7, -0.15F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0979F, 7.096F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1919F, 0.3002F, -0.0574F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 10, 14, -0.5F, 0.3167F, -0.2547F, 1, 1, 7, -0.15F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 6.9F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.4548F, 0.276F, -0.1325F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 20, 9, -0.5F, 0.3F, -0.1F, 1, 1, 6, -0.15F, false));

        this.TailClaw = new ModelRenderer(this);
        this.TailClaw.setRotationPoint(0.0F, -0.2833F, 6.0253F);
        this.Tail5.addChild(TailClaw);
        this.setRotateAngle(TailClaw, -0.7918F, -0.0294F, -0.3379F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.02F);
        this.TailClaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0524F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 34, -0.7F, 0.7F, -0.02F, 1, 1, 4, -0.15F, false));

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
