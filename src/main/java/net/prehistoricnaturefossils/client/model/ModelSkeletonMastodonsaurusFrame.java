package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMastodonsaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer Mastodonsaurus;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
    private final ModelRenderer RArm2;
    private final ModelRenderer RHand;
    private final ModelRenderer RArm3;
    private final ModelRenderer RArm4;
    private final ModelRenderer RHand2;
    private final ModelRenderer Neck;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer Head;
    private final ModelRenderer RGill;
    private final ModelRenderer RGill2;
    private final ModelRenderer UpperJaw;
    private final ModelRenderer LowerJaw;
    private final ModelRenderer bone;
    private final ModelRenderer Body2;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Body3;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer RLeg;
    private final ModelRenderer RLeg2;
    private final ModelRenderer RFoot;
    private final ModelRenderer RLeg3;
    private final ModelRenderer RLeg4;
    private final ModelRenderer RFoot2;
    private final ModelRenderer Tail;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer frame8_r1;

    public ModelSkeletonMastodonsaurusFrame() {
        this.textureWidth = 95;
        this.textureHeight = 95;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -2.15F, -4.9F, 15.0F, 1, 5, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -2.0F, -6.9F, -12.5F, 1, 7, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-1.5F, -3.0F, -11.5F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, 0.2618F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -4, 1, -6.0F, -1.0F, -1.0F, 12, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(-1.5F, -3.0F, 16.0F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, -0.2182F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -2, 1, -4.0F, -1.0F, -1.0F, 8, 1, 1, -0.1F, false));

        this.Mastodonsaurus = new ModelRenderer(this);
        this.Mastodonsaurus.setRotationPoint(0.0F, -8.4F, -2.3F);
        this.fossil.addChild(Mastodonsaurus);
        this.setRotateAngle(Mastodonsaurus, -0.0436F, 0.0F, 0.0F);
        this.Mastodonsaurus.cubeList.add(new ModelBox(Mastodonsaurus, 55, 62, -0.5F, 0.8656F, -2.5567F, 1, 1, 9, -0.1F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.3344F, -0.9567F);
        this.Mastodonsaurus.addChild(Body);
        this.setRotateAngle(Body, 0.0443F, 0.1744F, 0.0077F);
        this.Body.cubeList.add(new ModelBox(Body, 44, 44, -0.5F, 1.1278F, -11.7075F, 1, 1, 12, -0.1F, false));

        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(5.5F, 5.1278F, -9.5075F);
        this.Body.addChild(RArm);
        this.setRotateAngle(RArm, 0.0F, 0.3054F, 0.1745F);


        this.RArm2 = new ModelRenderer(this);
        this.RArm2.setRotationPoint(4.4355F, 1.1066F, -0.6344F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, 0.0F, 0.8727F, 0.0F);


        this.RHand = new ModelRenderer(this);
        this.RHand.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.RArm2.addChild(RHand);
        this.setRotateAngle(RHand, 0.119F, 0.3603F, -0.0995F);


        this.RArm3 = new ModelRenderer(this);
        this.RArm3.setRotationPoint(-5.5F, 5.1278F, -9.5075F);
        this.Body.addChild(RArm3);
        this.setRotateAngle(RArm3, 0.0F, 1.0908F, -0.1745F);


        this.RArm4 = new ModelRenderer(this);
        this.RArm4.setRotationPoint(-4.4355F, 1.1066F, -0.6344F);
        this.RArm3.addChild(RArm4);
        this.setRotateAngle(RArm4, 0.0F, -0.9163F, 0.0F);


        this.RHand2 = new ModelRenderer(this);
        this.RHand2.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.RArm4.addChild(RHand2);
        this.setRotateAngle(RHand2, 0.1263F, -0.4903F, 0.0819F);


        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.0722F, -11.1075F);
        this.Body.addChild(Neck);
        this.setRotateAngle(Neck, 0.0447F, 0.218F, 0.0097F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.5F, 2.5601F, -5.545F);
        this.Neck.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.0873F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 14, 72, -1.0F, -0.9F, -1.1F, 1, 1, 7, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 1.5601F, -5.645F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.3455F, 0.3923F, 0.0181F);


        this.RGill = new ModelRenderer(this);
        this.RGill.setRotationPoint(6.5F, 0.0F, -1.0F);
        this.Head.addChild(RGill);
        this.setRotateAngle(RGill, 0.0F, 0.6109F, 0.0F);


        this.RGill2 = new ModelRenderer(this);
        this.RGill2.setRotationPoint(-6.5F, 0.0F, -1.0F);
        this.Head.addChild(RGill2);
        this.setRotateAngle(RGill2, 0.0F, -0.6109F, 0.0F);


        this.UpperJaw = new ModelRenderer(this);
        this.UpperJaw.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Head.addChild(UpperJaw);
        this.setRotateAngle(UpperJaw, -0.3927F, 0.0F, 0.0F);


        this.LowerJaw = new ModelRenderer(this);
        this.LowerJaw.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Head.addChild(LowerJaw);
        this.setRotateAngle(LowerJaw, 0.6545F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 2.0F, -15.99F);
        this.LowerJaw.addChild(bone);
        this.setRotateAngle(bone, -0.1833F, 0.0F, 0.0F);


        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.5344F, 5.5433F);
        this.Mastodonsaurus.addChild(Body2);
        this.setRotateAngle(Body2, -0.044F, -0.1308F, 0.0057F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-0.5F, 2.8327F, 0.0207F);
        this.Body2.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.0873F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 1, 64, 0.01F, -1.4309F, -0.0029F, 1, 1, 7, -0.1F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.8018F, 6.2179F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, -0.0436F, 0.0F, 0.0F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.5F, 2.2378F, 0.8859F);
        this.Body3.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0436F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 61, 45, -1.0F, -1.0282F, -1.0639F, 1, 1, 8, -0.1F, false));

        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(3.5F, 3.0378F, 6.8859F);
        this.Body3.addChild(RLeg);
        this.setRotateAngle(RLeg, 0.0341F, -0.2231F, 0.3009F);


        this.RLeg2 = new ModelRenderer(this);
        this.RLeg2.setRotationPoint(4.5F, 0.3691F, -0.0029F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.0F, -1.2654F, 0.0F);


        this.RFoot = new ModelRenderer(this);
        this.RFoot.setRotationPoint(5.5F, 0.0F, 0.0F);
        this.RLeg2.addChild(RFoot);
        this.setRotateAngle(RFoot, -0.1668F, 0.8294F, -0.3932F);


        this.RLeg3 = new ModelRenderer(this);
        this.RLeg3.setRotationPoint(-3.5F, 3.0378F, 6.8859F);
        this.Body3.addChild(RLeg3);
        this.setRotateAngle(RLeg3, 0.0778F, -1.1282F, -0.3787F);


        this.RLeg4 = new ModelRenderer(this);
        this.RLeg4.setRotationPoint(-4.5F, 0.3691F, -0.0029F);
        this.RLeg3.addChild(RLeg4);
        this.setRotateAngle(RLeg4, -0.2056F, 1.0437F, -0.4376F);


        this.RFoot2 = new ModelRenderer(this);
        this.RFoot2.setRotationPoint(-5.5F, 0.0F, 0.0F);
        this.RLeg4.addChild(RFoot2);
        this.setRotateAngle(RFoot2, -0.0333F, -0.5915F, 0.5021F);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.4069F, 6.8831F);
        this.Body3.addChild(Tail);
        this.setRotateAngle(Tail, -0.1355F, -0.2595F, 0.035F);
        this.Tail.cubeList.add(new ModelBox(Tail, 42, 60, -0.5F, 0.9986F, -0.0654F, 1, 1, 8, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.0014F, 6.9346F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.088F, 0.1304F, 0.0115F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 27, 56, -0.5F, 0.999F, -0.0436F, 1, 1, 9, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.199F, 7.9564F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0944F, 0.3911F, 0.0361F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, 1.2996F, 0.0174F);
        this.Tail3.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.0524F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 69, 67, -0.5F, -0.5F, 0.0F, 1, 1, 8, -0.1F, false));

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
