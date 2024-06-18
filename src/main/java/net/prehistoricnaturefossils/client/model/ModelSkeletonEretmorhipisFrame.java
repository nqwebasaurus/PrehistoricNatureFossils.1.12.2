package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEretmorhipisFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Eretmorhipis;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Neck;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer LArm;
    private final ModelRenderer LArm2;
    private final ModelRenderer LArm3;
    private final ModelRenderer LArm4;
    private final ModelRenderer Body2;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer LLeg;
    private final ModelRenderer LLeg2;
    private final ModelRenderer LLeg3;
    private final ModelRenderer LLeg4;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tail5;

    public ModelSkeletonEretmorhipisFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Eretmorhipis = new ModelRenderer(this);
        this.Eretmorhipis.setRotationPoint(0.0F, -8.1697F, -18.8529F);
        this.fossil.addChild(Eretmorhipis);
        this.setRotateAngle(Eretmorhipis, 0.1047F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.6543F, 3.4432F);
        this.Eretmorhipis.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.5708F, 0.0698F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 30, 0.8F, -0.5F, -3.0F, 1, 1, 6, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.3527F, 1.9797F);
        this.Eretmorhipis.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.501F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 43, -0.5F, 1.1F, -3.9F, 1, 1, 4, -0.201F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.7F, -1.7F);
        this.Eretmorhipis.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0175F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 54, -0.5F, -0.0955F, -0.2269F, 1, 1, 7, -0.2F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.5F, -1.75F);
        this.Eretmorhipis.addChild(Neck);
        this.setRotateAngle(Neck, 0.0F, -0.1745F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.7455F, -1.2512F);
        this.Neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2094F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 15, -0.5F, 0.2033F, -3.2627F, 1, 1, 5, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.405F, -3.9137F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.0873F, -0.3054F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0366F, 0.2634F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.5847F, 0.0F, 0.0F);


        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Eretmorhipis.addChild(Body);
        this.setRotateAngle(Body, -0.0175F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.6F, 8.8F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 51, -0.5F, 0.4045F, -7.9269F, 1, 1, 8, -0.202F, false));

        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(2.0368F, 3.1816F, -0.931F);
        this.Body.addChild(LArm);
        this.setRotateAngle(LArm, 1.1008F, -0.6878F, 0.5479F);


        this.LArm2 = new ModelRenderer(this);
        this.LArm2.setRotationPoint(2.0F, -0.5F, 0.5F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, -0.1966F, 0.3331F, -0.4142F);


        this.LArm3 = new ModelRenderer(this);
        this.LArm3.setRotationPoint(-2.0368F, 3.1816F, -0.931F);
        this.Body.addChild(LArm3);
        this.setRotateAngle(LArm3, 1.0055F, 0.7442F, -0.3593F);


        this.LArm4 = new ModelRenderer(this);
        this.LArm4.setRotationPoint(-2.0F, -0.5F, 0.5F);
        this.LArm3.addChild(LArm4);
        this.setRotateAngle(LArm4, -0.124F, -0.4197F, 0.0649F);


        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.4036F, 8.793F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.1222F, -0.0873F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 29, 49, -0.5F, 0.2001F, -0.1895F, 1, 1, 8, -0.2F, false));

        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.0003F, 6.9314F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, -0.1571F, -0.1309F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 45, 0, -0.5F, 0.1776F, -0.0456F, 1, 1, 9, -0.202F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.0531F, 8.8788F);
        this.Tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.7453F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 46, 40, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.205F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.0531F, 8.8788F);
        this.Tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.5708F, 0.1745F, -1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.5F, -0.5F, -2.5F, 1, 1, 5, -0.202F, false));

        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(2.0192F, 2.948F, 9.0123F);
        this.Tail.addChild(LLeg);
        this.setRotateAngle(LLeg, 0.0581F, -0.8758F, 1.0807F);


        this.LLeg2 = new ModelRenderer(this);
        this.LLeg2.setRotationPoint(2.6377F, -0.5738F, 0.2126F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 0.0F, -0.2618F, 0.0F);


        this.LLeg3 = new ModelRenderer(this);
        this.LLeg3.setRotationPoint(-2.0192F, 2.948F, 9.0123F);
        this.Tail.addChild(LLeg3);
        this.setRotateAngle(LLeg3, 0.8675F, 0.4757F, -0.5184F);


        this.LLeg4 = new ModelRenderer(this);
        this.LLeg4.setRotationPoint(-2.6377F, -0.5738F, 0.2126F);
        this.LLeg3.addChild(LLeg4);
        this.setRotateAngle(LLeg4, 0.0F, 0.2618F, -0.2618F);


        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.0334F, 9.0689F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.1745F, -0.2182F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 18, 27, -0.5F, 0.2399F, -0.415F, 1, 1, 11, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.8F, 10.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0524F, -0.2182F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 0, -0.5F, -0.5706F, 0.0146F, 1, 1, 13, -0.202F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.5F, 12.5F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.192F, 0.3491F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 34, 38, -0.5F, -0.0955F, -0.0731F, 1, 1, 9, -0.2F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, -0.0412F, 9.0249F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.1484F, 0.48F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 35, 11, -0.5F, -0.0998F, -0.5843F, 1, 1, 9, -0.202F, false));

    }

    public void renderAll(float f) {
        this.Eretmorhipis.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
