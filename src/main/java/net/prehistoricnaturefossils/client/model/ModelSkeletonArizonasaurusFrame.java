package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonArizonasaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Base;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer RightArm3;
    private final ModelRenderer RightArm4;
    private final ModelRenderer RightArmHand2;
    private final ModelRenderer LeftArm3;
    private final ModelRenderer LeftArm4;
    private final ModelRenderer LeftArmHand2;
    private final ModelRenderer Neck;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer RLeg;
    private final ModelRenderer RLeg2;
    private final ModelRenderer RFoot;
    private final ModelRenderer RFoot2;
    private final ModelRenderer RLeg3;
    private final ModelRenderer RLeg4;
    private final ModelRenderer RFoot3;
    private final ModelRenderer RFoot4;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;

    public ModelSkeletonArizonasaurusFrame() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -1.0F, -14.0F, -9.5F, 1, 14, 1, -0.11F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -14.0F, 5.1F, 1, 14, 1, -0.11F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -8.0F, 5.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 5.5F, -3.0F, -0.5F, 1, 6, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -8.0F, -9.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 2.1F, -2.5F, -0.5F, 1, 5, 1, -0.2F, false));

        this.Base = new ModelRenderer(this);
        this.Base.setRotationPoint(0.0F, -14.75F, 5.0F);
        this.fossil.addChild(Base);
        this.setRotateAngle(Base, -0.0436F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.5038F, -1.8255F);
        this.Base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0524F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 32, -0.5F, 0.5F, -0.2F, 1, 1, 6, -0.1F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.2038F, -2.0255F);
        this.Base.addChild(Body);
        this.setRotateAngle(Body, 0.0F, 0.0436F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.286F, -8.88F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 12, -0.5F, 0.2593F, -0.6619F, 1, 1, 10, -0.101F, false));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.3F, -8.8F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.0436F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.3167F, -4.8535F);
        this.Body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1396F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, 1.2174F, 0.3016F, 1, 1, 4, -0.1F, false));

        this.RightArm3 = new ModelRenderer(this);
        this.RightArm3.setRotationPoint(1.0F, 5.0972F, -2.8735F);
        this.Body2.addChild(RightArm3);
        this.setRotateAngle(RightArm3, 1.0385F, 0.5233F, 0.0804F);


        this.RightArm4 = new ModelRenderer(this);
        this.RightArm4.setRotationPoint(0.5F, 4.7F, 0.8F);
        this.RightArm3.addChild(RightArm4);
        this.setRotateAngle(RightArm4, -1.2725F, 0.3286F, 0.219F);


        this.RightArmHand2 = new ModelRenderer(this);
        this.RightArmHand2.setRotationPoint(1.0F, 4.39F, 0.5F);
        this.RightArm4.addChild(RightArmHand2);
        this.setRotateAngle(RightArmHand2, 0.0F, 0.0F, 1.0036F);


        this.LeftArm3 = new ModelRenderer(this);
        this.LeftArm3.setRotationPoint(-1.0F, 5.0972F, -2.8735F);
        this.Body2.addChild(LeftArm3);
        this.setRotateAngle(LeftArm3, 0.6627F, -0.3598F, -0.0004F);


        this.LeftArm4 = new ModelRenderer(this);
        this.LeftArm4.setRotationPoint(-0.5F, 4.7F, 0.8F);
        this.LeftArm3.addChild(LeftArm4);
        this.setRotateAngle(LeftArm4, -1.1345F, 0.0F, 0.0F);


        this.LeftArmHand2 = new ModelRenderer(this);
        this.LeftArmHand2.setRotationPoint(-1.0F, 4.39F, 0.5F);
        this.LeftArm4.addChild(LeftArmHand2);
        this.setRotateAngle(LeftArmHand2, 0.0F, 0.0F, -0.9599F);


        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.3972F, -3.8735F);
        this.Body2.addChild(Neck);
        this.setRotateAngle(Neck, 0.0864F, 0.045F, -0.0401F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.0805F, -0.207F);
        this.Neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1396F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 44, -0.5F, 0.4759F, -3.199F, 1, 1, 3, -0.101F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.4971F, -2.8691F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0269F, 0.0656F, 0.0598F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.3019F, -3.0128F);
        this.Neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 14, -0.5F, 1.534F, 0.0985F, 1, 1, 3, -0.1F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.2019F, -4.9128F);
        this.Neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 24, -0.5F, 1.6F, 0.0F, 1, 1, 2, -0.101F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.3019F, -4.7128F);
        this.Neck2.addChild(Head);
        this.setRotateAngle(Head, -0.0028F, -0.0577F, 0.0759F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.1314F, 0.2393F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.4014F, 0.0F, 0.0F);


        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(1.6F, 0.6962F, 0.6745F);
        this.Base.addChild(RLeg);
        this.setRotateAngle(RLeg, -0.0873F, 0.0F, 0.0F);


        this.RLeg2 = new ModelRenderer(this);
        this.RLeg2.setRotationPoint(1.0F, 6.9314F, 0.2871F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.829F, 0.0F, 0.0F);


        this.RFoot = new ModelRenderer(this);
        this.RFoot.setRotationPoint(0.0F, 6.7631F, 0.7156F);
        this.RLeg2.addChild(RFoot);
        this.setRotateAngle(RFoot, -0.1309F, 0.0F, 0.0F);


        this.RFoot2 = new ModelRenderer(this);
        this.RFoot2.setRotationPoint(0.0F, 0.5532F, -2.8625F);
        this.RFoot.addChild(RFoot2);
        this.setRotateAngle(RFoot2, -0.5236F, 0.0F, 0.0F);


        this.RLeg3 = new ModelRenderer(this);
        this.RLeg3.setRotationPoint(-1.6F, 0.6962F, 0.6745F);
        this.Base.addChild(RLeg3);
        this.setRotateAngle(RLeg3, -0.3054F, 0.0F, 0.0F);


        this.RLeg4 = new ModelRenderer(this);
        this.RLeg4.setRotationPoint(-1.0F, 6.9314F, 0.2871F);
        this.RLeg3.addChild(RLeg4);
        this.setRotateAngle(RLeg4, 0.48F, 0.0F, 0.0F);


        this.RFoot3 = new ModelRenderer(this);
        this.RFoot3.setRotationPoint(0.0F, 6.7631F, 0.7156F);
        this.RLeg4.addChild(RFoot3);
        this.setRotateAngle(RFoot3, -0.1309F, 0.0F, 0.0F);


        this.RFoot4 = new ModelRenderer(this);
        this.RFoot4.setRotationPoint(0.0F, 0.5532F, -2.8625F);
        this.RFoot3.addChild(RFoot4);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.5038F, 3.8745F);
        this.Base.addChild(Tail);
        this.setRotateAngle(Tail, -0.0886F, 0.1739F, -0.0154F);
        this.Tail.cubeList.add(new ModelBox(Tail, 10, 37, -0.5F, 0.21F, 0.0F, 1, 1, 5, -0.101F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.4F, 5.0F);
        this.Tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 29, 0.0F, 0.61F, -0.2F, 1, 1, 6, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.1F, 11.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0452F, 0.2615F, -0.0117F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.2072F, 0.0627F);
        this.Tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0175F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 0, -0.5F, 0.5F, -0.4F, 1, 1, 10, -0.101F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.1728F, 9.7627F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0443F, 0.1744F, -0.0077F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 14, -0.5F, 0.3118F, -0.4345F, 1, 1, 12, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.2818F, 11.4655F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0457F, 0.3051F, -0.0138F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -0.5F, 0.0095F, -0.0939F, 1, 1, 12, -0.101F, false));

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
