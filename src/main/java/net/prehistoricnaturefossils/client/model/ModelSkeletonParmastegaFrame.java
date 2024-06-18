package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonParmastegaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Parmastega;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjaw;
    private final ModelRenderer Snout;
    private final ModelRenderer Jawwhole;
    private final ModelRenderer Jaw;
    private final ModelRenderer Jaw2;
    private final ModelRenderer LArm;
    private final ModelRenderer LArm2;
    private final ModelRenderer LArm3;
    private final ModelRenderer LArm4;
    private final ModelRenderer Body;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Body2;
    private final ModelRenderer LLeg;
    private final ModelRenderer LLeg2;
    private final ModelRenderer LLeg3;
    private final ModelRenderer LLeg4;
    private final ModelRenderer Tail;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;

    public ModelSkeletonParmastegaFrame() {
        this.textureWidth = 57;
        this.textureHeight = 57;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Parmastega = new ModelRenderer(this);
        this.Parmastega.setRotationPoint(0.0F, -14.0F, -7.0F);
        this.fossil.addChild(Parmastega);
        this.setRotateAngle(Parmastega, -0.2182F, 0.0F, 0.0F);
        this.Parmastega.cubeList.add(new ModelBox(Parmastega, 0, 0, -0.5F, 0.0F, -2.0F, 1, 1, 4, -0.1F, false));
        this.Parmastega.cubeList.add(new ModelBox(Parmastega, 3, 3, -0.495F, 0.35F, -0.25F, 1, 2, 1, -0.1F, false));
        this.Parmastega.cubeList.add(new ModelBox(Parmastega, 1, 3, -2.995F, 1.75F, -0.24F, 6, 1, 1, -0.1F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Parmastega.addChild(Neck);
        this.setRotateAngle(Neck, -0.0436F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 35, 43, -0.5F, 0.0F, -1.75F, 1, 1, 2, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Neck.addChild(Head);


        this.Upperjaw = new ModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, 0.0F, 0.7F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, 0.2214F, -0.1704F, -0.0381F);


        this.Snout = new ModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Upperjaw.addChild(Snout);
        this.setRotateAngle(Snout, -0.0436F, 0.0F, 0.0F);


        this.Jawwhole = new ModelRenderer(this);
        this.Jawwhole.setRotationPoint(0.0F, 0.8F, 0.3F);
        this.Upperjaw.addChild(Jawwhole);
        this.setRotateAngle(Jawwhole, 0.3491F, 0.0F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.8F, 0.1F, 0.4F);
        this.Jawwhole.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.1635F, 0.2259F, 0.0F);


        this.Jaw2 = new ModelRenderer(this);
        this.Jaw2.setRotationPoint(-0.8F, 0.1F, 0.4F);
        this.Jawwhole.addChild(Jaw2);
        this.setRotateAngle(Jaw2, 0.1635F, -0.2259F, 0.0F);


        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(2.5F, 2.5F, -0.5F);
        this.Parmastega.addChild(LArm);
        this.setRotateAngle(LArm, 0.6831F, -0.6593F, 0.2503F);


        this.LArm2 = new ModelRenderer(this);
        this.LArm2.setRotationPoint(3.0F, 0.0F, 0.5F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, 0.0692F, 0.2527F, 0.2706F);


        this.LArm3 = new ModelRenderer(this);
        this.LArm3.setRotationPoint(-2.5F, 2.5F, -0.5F);
        this.Parmastega.addChild(LArm3);
        this.setRotateAngle(LArm3, 0.6831F, 0.6593F, -0.2503F);


        this.LArm4 = new ModelRenderer(this);
        this.LArm4.setRotationPoint(-3.0F, 0.0F, 0.5F);
        this.LArm3.addChild(LArm4);
        this.setRotateAngle(LArm4, 0.0465F, -0.2577F, -0.1806F);


        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Parmastega.addChild(Body);
        this.setRotateAngle(Body, -0.044F, 0.1308F, -0.0057F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.1F, 1.0F, -1.5F);
        this.Body.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.0F, -0.0175F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, -1, -1, -0.45F, -1.0F, 0.0F, 1, 1, 12, -0.1F, false));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.0443F, 0.1744F, -0.0077F);
        this.Body2.cubeList.add(new ModelBox(Body2, 26, 0, -0.5F, 0.0F, 0.0F, 1, 1, 7, -0.1F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 30, 6, -2.995F, 0.8F, 4.5F, 6, 1, 1, -0.1F, false));

        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(2.5F, 1.0F, 5.0F);
        this.Body2.addChild(LLeg);
        this.setRotateAngle(LLeg, -0.3224F, -0.9464F, 1.612F);


        this.LLeg2 = new ModelRenderer(this);
        this.LLeg2.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, -0.0411F, -0.3027F, 0.1372F);


        this.LLeg3 = new ModelRenderer(this);
        this.LLeg3.setRotationPoint(-2.5F, 1.0F, 5.0F);
        this.Body2.addChild(LLeg3);
        this.setRotateAngle(LLeg3, 0.6013F, 0.5805F, -0.4957F);


        this.LLeg4 = new ModelRenderer(this);
        this.LLeg4.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.LLeg3.addChild(LLeg4);
        this.setRotateAngle(LLeg4, -0.0681F, 0.298F, -0.2284F);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.4F, 7.2F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, 0.0438F, -0.0872F, -0.0038F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 1.1284F, 2.0204F);
        this.Tail.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0873F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 36, 36, -0.5F, -0.5F, -2.5F, 1, 1, 5, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.3473F, 4.7837F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0F, -0.2182F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 28, 8, -0.5F, 0.5F, -0.6F, 1, 1, 7, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 5.8F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0F, -0.1745F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 8, 41, -0.5F, 0.5F, 0.35F, 1, 1, 5, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 4.9F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0F, -0.1309F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 26, 28, -0.5F, 0.5F, 0.2F, 1, 1, 6, -0.1F, false));

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
