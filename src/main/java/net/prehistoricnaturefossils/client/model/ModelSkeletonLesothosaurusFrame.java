package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLesothosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer hips;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r3;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck;
    private final ModelRenderer CervicalDistal_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer CervicalMedial_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer CervicalProximal_r1;
    private final ModelRenderer Head;
    private final ModelRenderer HeadslopeL;
    private final ModelRenderer HeadslopeL2;
    private final ModelRenderer BrowL;
    private final ModelRenderer Jaw;
    private final ModelRenderer JawslopeL;
    private final ModelRenderer JawslopeL2;
    private final ModelRenderer MasseterR;

    public ModelSkeletonLesothosaurusFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.6F, -3.95F, -16.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2094F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.05F, -3.5F, -0.5F, 1, 6, 1, -0.21F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.6F, -3.95F, -16.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2094F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.5F, -2.05F, -0.5F, 1, 6, 1, -0.21F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -2.0F, -1.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.2002F, -0.0531F, -0.6527F);
        this.hips.cubeList.add(new ModelBox(hips, 24, 29, -0.6F, -0.4F, -2.9F, 1, 1, 5, -0.2F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.1F, -0.6F, -0.6F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -1.1447F, -0.1559F, -0.3136F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.0F, 6.5046F, -0.0146F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 2.3289F, 0.1273F, 0.1197F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-1.0F, 9.1229F, 0.5046F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.2934F, -0.4623F, 0.1339F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.4F, 2.5F, -2.8F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.7418F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.1F, -0.6F, -0.6F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.5704F, 0.1033F, -0.86F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.5046F, -0.0146F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.23F, 0.038F, -0.0215F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.7229F, 0.5046F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.9599F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.4F, 2.7294F, -2.4723F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 2.0071F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.6F, 2.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0F, 0.2182F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, -1, 17, -0.5F, 0.2F, -0.4F, 1, 1, 6, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1F, 5.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2241F, 0.261F, 0.021F);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 0, -0.5F, 0.243F, -0.0315F, 1, 1, 8, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.043F, 7.9685F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2712F, 0.3927F, -0.0036F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 18, -0.5F, 0.0993F, -0.1305F, 1, 1, 13, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.5F, 0.1993F, 12.8695F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.3342F, 0.566F, -0.0389F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -1.0F, -0.0453F, -0.444F, 1, 1, 16, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.7F, -2.9F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.1786F, -0.0262F, 0.3043F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.8011F, -3.5655F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0349F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 9, -0.5F, -0.5F, -4.7F, 1, 1, 9, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0011F, -7.8655F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.2182F, 0.1309F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.3F, 0.7F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, 1.3F, -7.0F, 1, 1, 6, -0.2F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(2.7F, 4.4F, -3.7F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.2182F, 0.2182F, 0.0F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.1F, 2.7F, 2.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.6545F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.6F, 2.5F, -2.3F);
        this.leftArm2.addChild(leftArm3);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-2.7F, 4.4F, -3.7F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.6584F, -0.5207F, 0.8684F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.1F, 2.7F, 2.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.4363F, 0.0F, -0.6109F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.6F, 2.5F, -2.3F);
        this.rightArm2.addChild(rightArm3);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.1F, 2.1F, -5.0F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.3777F, -0.1418F, 0.164F);


        this.CervicalDistal_r1 = new ModelRenderer(this);
        this.CervicalDistal_r1.setRotationPoint(0.0F, -0.4866F, -0.1095F);
        this.neck.addChild(CervicalDistal_r1);
        this.setRotateAngle(CervicalDistal_r1, -0.0524F, 0.0F, 0.0F);
        this.CervicalDistal_r1.cubeList.add(new ModelBox(CervicalDistal_r1, 43, 24, -0.5F, 0.6269F, -2.2045F, 1, 1, 3, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.1866F, -1.7095F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.1464F, -0.3706F, -0.2216F);


        this.CervicalMedial_r1 = new ModelRenderer(this);
        this.CervicalMedial_r1.setRotationPoint(0.0F, -0.1405F, -0.1284F);
        this.neck2.addChild(CervicalMedial_r1);
        this.setRotateAngle(CervicalMedial_r1, -0.8029F, 0.0F, 0.0F);
        this.CervicalMedial_r1.cubeList.add(new ModelBox(CervicalMedial_r1, 30, 0, -0.6F, 0.2577F, -3.3641F, 1, 1, 4, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -2.6405F, -2.6284F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3001F, -0.4294F, -0.2322F);


        this.CervicalProximal_r1 = new ModelRenderer(this);
        this.CervicalProximal_r1.setRotationPoint(-0.6F, -0.1545F, 0.2842F);
        this.neck3.addChild(CervicalProximal_r1);
        this.setRotateAngle(CervicalProximal_r1, -0.1571F, 0.0F, 0.0F);
        this.CervicalProximal_r1.cubeList.add(new ModelBox(CervicalProximal_r1, 39, 8, 0.0F, 0.3639F, -3.1094F, 1, 1, 3, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.6F, -0.2912F, -2.1069F);
        this.neck3.addChild(Head);
        this.setRotateAngle(Head, 0.0084F, 0.0023F, -0.2618F);


        this.HeadslopeL = new ModelRenderer(this);
        this.HeadslopeL.setRotationPoint(1.0F, 0.5415F, 1.1145F);
        this.Head.addChild(HeadslopeL);


        this.HeadslopeL2 = new ModelRenderer(this);
        this.HeadslopeL2.setRotationPoint(0.0F, 0.5415F, 1.1145F);
        this.Head.addChild(HeadslopeL2);


        this.BrowL = new ModelRenderer(this);
        this.BrowL.setRotationPoint(1.0147F, 0.5239F, -2.5201F);
        this.Head.addChild(BrowL);
        this.setRotateAngle(BrowL, -0.0698F, 0.0F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.7415F, -0.0855F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0785F, 0.0F, 0.0F);


        this.JawslopeL = new ModelRenderer(this);
        this.JawslopeL.setRotationPoint(1.0F, 0.0413F, 1.699F);
        this.Jaw.addChild(JawslopeL);


        this.JawslopeL2 = new ModelRenderer(this);
        this.JawslopeL2.setRotationPoint(0.0F, 0.0413F, 1.699F);
        this.Jaw.addChild(JawslopeL2);


        this.MasseterR = new ModelRenderer(this);
        this.MasseterR.setRotationPoint(-0.3F, -1.7587F, 2.399F);
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
