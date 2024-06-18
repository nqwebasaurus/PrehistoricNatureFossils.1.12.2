package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonShringasaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Shringasaurus;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer RLeg;
    private final ModelRenderer RLeg2;
    private final ModelRenderer RFoot;
    private final ModelRenderer RLeg3;
    private final ModelRenderer RLeg4;
    private final ModelRenderer RFoot2;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer shoulder;
    private final ModelRenderer cube_r8;
    private final ModelRenderer RArm;
    private final ModelRenderer RArm2;
    private final ModelRenderer RHand;
    private final ModelRenderer RArm3;
    private final ModelRenderer RArm4;
    private final ModelRenderer RHand2;
    private final ModelRenderer Neck;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Neck3;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;

    public ModelSkeletonShringasaurusFrame() {
        this.textureWidth = 105;
        this.textureHeight = 105;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 6.0F, -2.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.05F, 1.1375F, 13.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1134F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -2.1375F, -0.5F, 1, 19, 1, -0.1F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.05F, 1.1375F, 13.7F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1134F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.1375F, -3.5F, -0.5F, 1, 8, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(3.475F, -0.5F, -11.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 1.9F, -7.5F, 0.725F, 1, 16, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(3.475F, -0.5F, -11.2F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.225F, -4.5F, 0.725F, 1, 23, 1, -0.1F, false));

        this.Shringasaurus = new ModelRenderer(this);
        this.Shringasaurus.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(Shringasaurus);
        this.setRotateAngle(Shringasaurus, -0.0436F, 0.0F, 0.0F);


        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -3.3074F, 9.9086F);
        this.Shringasaurus.addChild(Body2);
        this.setRotateAngle(Body2, -0.2182F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.3264F, -14.2014F);
        this.Body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 38, -1.0F, -0.4861F, 13.7261F, 2, 2, 11, -0.1F, false));

        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(3.0F, 4.0235F, 4.9459F);
        this.Body2.addChild(RLeg);
        this.setRotateAngle(RLeg, -0.1404F, -0.3957F, -0.0993F);


        this.RLeg2 = new ModelRenderer(this);
        this.RLeg2.setRotationPoint(1.0F, 6.0F, 0.0F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.9599F, 0.0F, 0.0F);


        this.RFoot = new ModelRenderer(this);
        this.RFoot.setRotationPoint(-0.5F, 10.3528F, 1.6383F);
        this.RLeg2.addChild(RFoot);
        this.setRotateAngle(RFoot, -0.3752F, 0.0F, 0.0F);


        this.RLeg3 = new ModelRenderer(this);
        this.RLeg3.setRotationPoint(-3.0F, 4.0235F, 4.9459F);
        this.Body2.addChild(RLeg3);
        this.setRotateAngle(RLeg3, -0.7076F, 0.3957F, 0.0993F);


        this.RLeg4 = new ModelRenderer(this);
        this.RLeg4.setRotationPoint(-1.0F, 6.0F, 0.0F);
        this.RLeg3.addChild(RLeg4);
        this.setRotateAngle(RLeg4, 0.829F, 0.0F, 0.0F);


        this.RFoot2 = new ModelRenderer(this);
        this.RFoot2.setRotationPoint(0.5F, 10.3528F, 1.6383F);
        this.RLeg4.addChild(RFoot2);
        this.setRotateAngle(RFoot2, 0.1484F, 0.0F, 0.0F);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 1.2269F, 9.42F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, -0.1329F, 0.173F, -0.023F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.0963F, 0.3822F);
        this.Tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0044F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 23, -1.0329F, -1.9158F, 0.2412F, 2, 2, 11, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.1493F, 11.3262F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1415F, 0.3892F, 0.054F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 34, -1.0165F, 0.9111F, -0.7531F, 2, 1, 12, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.3615F, 9.9973F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.2187F, 0.6429F, 0.1325F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 57, 0, -0.5718F, 0.6683F, 0.3515F, 1, 1, 9, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.3801F, 8.8845F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.2061F, 0.5576F, 0.1102F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 15, 53, -0.4959F, 0.9614F, -0.7341F, 1, 1, 10, -0.1F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.4235F, -0.3541F);
        this.Body2.addChild(Body);
        this.setRotateAngle(Body, 0.044F, -0.1308F, -0.0057F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.7859F, -14.0111F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.9435F, 1.1583F, -0.4096F, 2, 2, 15, -0.1F, false));

        this.shoulder = new ModelRenderer(this);
        this.shoulder.setRotationPoint(0.0F, -0.3887F, -14.1639F);
        this.Body.addChild(shoulder);
        this.setRotateAngle(shoulder, 0.0F, -0.0873F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.9F, -6.0F);
        this.shoulder.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0525F, -0.061F, -0.0032F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 58, -0.5063F, 0.172F, -1.3802F, 2, 2, 8, -0.1F, false));

        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(8.0F, 8.3F, -4.7F);
        this.shoulder.addChild(RArm);
        this.setRotateAngle(RArm, 0.7914F, 0.7999F, -0.4402F);


        this.RArm2 = new ModelRenderer(this);
        this.RArm2.setRotationPoint(-0.9607F, 6.4821F, 0.2221F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, -0.7873F, 0.1407F, 0.5328F);


        this.RHand = new ModelRenderer(this);
        this.RHand.setRotationPoint(-0.503F, 9.8363F, -0.5537F);
        this.RArm2.addChild(RHand);
        this.setRotateAngle(RHand, 0.0F, -0.48F, 0.0F);


        this.RArm3 = new ModelRenderer(this);
        this.RArm3.setRotationPoint(-8.0F, 8.3F, -3.7F);
        this.shoulder.addChild(RArm3);
        this.setRotateAngle(RArm3, 0.088F, -0.8203F, 0.6279F);


        this.RArm4 = new ModelRenderer(this);
        this.RArm4.setRotationPoint(0.2434F, 6.1301F, -0.3793F);
        this.RArm3.addChild(RArm4);
        this.setRotateAngle(RArm4, -0.3946F, -0.1407F, -0.5328F);


        this.RHand2 = new ModelRenderer(this);
        this.RHand2.setRotationPoint(0.503F, 9.8363F, -0.5537F);
        this.RArm4.addChild(RHand2);
        this.setRotateAngle(RHand2, 0.0F, 0.48F, 0.0F);


        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.2F, -5.7F);
        this.shoulder.addChild(Neck);
        this.setRotateAngle(Neck, -0.3265F, -0.1812F, -0.1215F);
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 49, -0.5151F, 0.6964F, -8.1823F, 2, 2, 9, -0.1F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.5384F, -7.6373F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.1238F, -0.3272F, -0.3695F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.4518F, -8.0781F);
        this.Neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 52, 57, -1.0052F, 0.6792F, 0.1686F, 2, 2, 9, -0.1F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -1.3518F, -7.6781F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.0112F, -0.4027F, -0.4024F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 46, 0, -0.979F, 1.0041F, -4.6993F, 2, 1, 6, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.167F, -5.2772F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.5692F, -0.2818F, 0.1243F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.4317F, -1.0101F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.1745F, 0.0F, 0.0F);

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
