package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHupehsuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Hupehsuchus;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer pole2_r1;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer LArm;
    private final ModelRenderer LArm2;
    private final ModelRenderer LArm3;
    private final ModelRenderer LArm4;
    private final ModelRenderer Neck;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer Throat;
    private final ModelRenderer Throat2;
    private final ModelRenderer Body;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer stomach;
    private final ModelRenderer Body2;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer pole1_r1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer LLeg;
    private final ModelRenderer LLeg2;
    private final ModelRenderer LLeg3;
    private final ModelRenderer LLeg4;
    private final ModelRenderer Tail;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer bone2;

    public ModelSkeletonHupehsuchusFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Hupehsuchus = new ModelRenderer(this);
        this.Hupehsuchus.setRotationPoint(0.0F, -12.0F, -4.5F);
        this.fossil.addChild(Hupehsuchus);
        this.setRotateAngle(Hupehsuchus, 0.3229F, 0.0F, 0.0F);


        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-0.5F, 3.4392F, -12.7868F);
        this.Hupehsuchus.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.1309F, 0.0F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, 37, 45, -3.5F, -0.4174F, 0.8868F, 6, 1, 1, -0.1F, false));

        this.pole2_r1 = new ModelRenderer(this);
        this.pole2_r1.setRotationPoint(-1.0F, 2.7892F, -12.8868F);
        this.Hupehsuchus.addChild(pole2_r1);
        this.setRotateAngle(pole2_r1, 0.1309F, 0.0F, 0.0F);
        this.pole2_r1.cubeList.add(new ModelBox(pole2_r1, 40, 45, -0.46F, -1.4174F, 0.9015F, 1, 2, 1, -0.1F, false));

        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.9F, 0.8924F, -9.8993F);
        this.Hupehsuchus.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.1309F, -0.0173F, -0.0023F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 35, 40, -0.55F, -0.5F, -3.0F, 1, 1, 6, -0.1F, false));

        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(1.4F, 2.9892F, -11.4868F);
        this.Hupehsuchus.addChild(LArm);
        this.setRotateAngle(LArm, 0.6155F, -0.5445F, 0.6071F);


        this.LArm2 = new ModelRenderer(this);
        this.LArm2.setRotationPoint(2.0F, 0.0F, 0.5F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, 0.0F, 0.2618F, 0.0F);


        this.LArm3 = new ModelRenderer(this);
        this.LArm3.setRotationPoint(-3.4F, 2.9892F, -11.4868F);
        this.Hupehsuchus.addChild(LArm3);
        this.setRotateAngle(LArm3, 0.5932F, 0.5693F, -0.6494F);


        this.LArm4 = new ModelRenderer(this);
        this.LArm4.setRotationPoint(-2.0F, 0.0F, 0.5F);
        this.LArm3.addChild(LArm4);
        this.setRotateAngle(LArm4, 0.0F, -0.2618F, 0.0F);


        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(-1.0F, 0.4892F, -11.9868F);
        this.Hupehsuchus.addChild(Neck);
        this.setRotateAngle(Neck, -0.0346F, -0.2018F, 0.0055F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 0.2973F, -4.9804F);
        this.Neck.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.1309F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 45, 20, -0.5F, -0.5465F, -0.3F, 1, 1, 5, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.6527F, -4.5304F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.5387F, -0.2261F, 0.1332F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.55F, 0.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.6109F, 0.0F, 0.0F);


        this.Throat = new ModelRenderer(this);
        this.Throat.setRotationPoint(0.0F, 0.95F, -11.0F);
        this.Jaw.addChild(Throat);


        this.Throat2 = new ModelRenderer(this);
        this.Throat2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Throat.addChild(Throat2);


        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(-1.0F, -0.5108F, -6.9868F);
        this.Hupehsuchus.addChild(Body);
        this.setRotateAngle(Body, -0.0176F, 0.1309F, -0.0023F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 0.9F, 7.9403F);
        this.Body.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.0873F, -0.0174F, 0.0015F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 15, 44, -0.5F, -0.5F, -2.5F, 1, 1, 5, -0.1F, false));

        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 0.9825F, -0.2914F);
        this.Body.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.0524F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 0, 43, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.1F, false));

        this.stomach = new ModelRenderer(this);
        this.stomach.setRotationPoint(0.0F, 6.4825F, 0.0086F);
        this.Body.addChild(stomach);
        this.setRotateAngle(stomach, -0.2618F, 0.0F, 0.0F);


        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.1825F, 11.0086F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.0177F, 0.1745F, -0.0031F);


        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(-0.5F, 4.3F, -1.1948F);
        this.Body2.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, -0.0873F, 0.0F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, 39, 27, -2.51F, -1.9F, 5.973F, 6, 1, 1, -0.1F, false));

        this.pole1_r1 = new ModelRenderer(this);
        this.pole1_r1.setRotationPoint(0.2F, 2.95F, -1.1948F);
        this.Body2.addChild(pole1_r1);
        this.setRotateAngle(pole1_r1, -0.0873F, 0.0F, 0.0F);
        this.pole1_r1.cubeList.add(new ModelBox(pole1_r1, 41, 27, -0.61F, -1.9F, 6.0F, 1, 2, 1, -0.1F, false));

        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.1F, 1.2501F, 3.1249F);
        this.Body2.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0873F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 34, 20, -0.5F, -0.5F, -4.0F, 1, 1, 8, -0.1F, false));

        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(2.7F, 3.2F, 5.6052F);
        this.Body2.addChild(LLeg);
        this.setRotateAngle(LLeg, 0.0453F, -0.478F, 0.818F);


        this.LLeg2 = new ModelRenderer(this);
        this.LLeg2.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 0.0F, -0.2618F, 0.0F);


        this.LLeg3 = new ModelRenderer(this);
        this.LLeg3.setRotationPoint(-2.7F, 3.2F, 5.6052F);
        this.Body2.addChild(LLeg3);
        this.setRotateAngle(LLeg3, 0.0453F, 0.478F, -0.818F);


        this.LLeg4 = new ModelRenderer(this);
        this.LLeg4.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.LLeg3.addChild(LLeg4);
        this.setRotateAngle(LLeg4, 0.0F, 0.2618F, 0.0F);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.5F, 6.5052F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, 0.088F, 0.218F, 0.0039F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.0F, 1.3F, 0.2F);
        this.Tail.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.0349F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 14, 13, -0.5F, -0.7F, -0.1F, 1, 1, 11, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.4F, 11.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0F, 0.2618F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 11, -0.5F, 0.6F, -0.2465F, 1, 1, 11, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.1F, 10.5F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0944F, -0.3911F, 0.0361F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 22, 1, -0.5F, 0.5008F, -0.0227F, 1, 1, 10, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.0992F, 9.7826F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1509F, -0.5187F, 0.0752F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 24, -0.5F, 0.5747F, -0.2348F, 1, 1, 9, -0.1F, false));

        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, -2.5175F, 0.0086F);
        this.Body.addChild(bone2);
        this.setRotateAngle(bone2, 0.1745F, 0.0F, 0.0F);

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
