package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLagosuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Lagosuchus;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Neck;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Neck3;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer RArm;
    private final ModelRenderer RArm2;
    private final ModelRenderer RHand;
    private final ModelRenderer RArm3;
    private final ModelRenderer RArm4;
    private final ModelRenderer RHand2;
    private final ModelRenderer Tail;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer RLeg;
    private final ModelRenderer RLeg2;
    private final ModelRenderer RLeg3;
    private final ModelRenderer RFoot;
    private final ModelRenderer RLeg4;
    private final ModelRenderer RLeg5;
    private final ModelRenderer RLeg6;
    private final ModelRenderer RFoot2;

    public ModelSkeletonLagosuchusFrame() {
        this.textureWidth = 67;
        this.textureHeight = 67;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.9993F, -15.7F, -18.6262F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2531F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 1.3F, -2.0F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.9993F, -15.7F, -18.6262F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2531F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.2F, -6.9F, -0.5F, 1, 23, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -22.2F, -1.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0524F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 2.2F, -3.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -22.2F, -1.8F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0524F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -1.0F, -2.8F, -0.5F, 1, 25, 1, -0.16F, false));

        this.Lagosuchus = new ModelRenderer(this);
        this.Lagosuchus.setRotationPoint(0.0F, -25.75F, -2.0F);
        this.fossil.addChild(Lagosuchus);
        this.setRotateAngle(Lagosuchus, -0.0436F, 0.0F, 0.0F);
        this.Lagosuchus.cubeList.add(new ModelBox(Lagosuchus, 44, 42, -0.5F, -0.0891F, -2.1147F, 1, 1, 6, -0.15F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.1891F, -1.9147F);
        this.Lagosuchus.addChild(Body);
        this.setRotateAngle(Body, 0.2193F, 0.1298F, 0.0172F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.5025F, -5.0134F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 24, -0.5F, -0.2495F, 0.0913F, 1, 1, 5, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.2025F, -10.0134F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 44, -0.5F, -0.2F, -0.2F, 1, 1, 6, -0.15F, false));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.5025F, -10.1134F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, 0.0004F, 0.1308F, 0.0057F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.5975F, -6.7134F);
        this.Body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1571F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 24, -0.5F, -0.4F, 0.0F, 1, 1, 7, -0.15F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.7975F, -6.6134F);
        this.Body2.addChild(Neck);
        this.setRotateAngle(Neck, -0.1459F, 0.2254F, -0.0115F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.2728F, -2.9387F);
        this.Neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1396F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 49, -0.5F, -0.3727F, -0.3402F, 1, 1, 4, -0.15F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.3272F, -2.6387F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0994F, -0.2947F, 0.0814F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.9472F, -6.6802F);
        this.Neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2443F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 13, -0.5F, 0.6F, 0.0F, 1, 1, 7, -0.15F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -1.4472F, -6.6802F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.1309F, 0.3054F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 0, 52, -0.5F, 0.0773F, -2.8813F, 1, 1, 3, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.2227F, -2.2813F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.2618F, 0.0F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.1F, 1.0633F, 0.238F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.1745F, 0.0F, 0.0F);


        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(2.0F, 6.1975F, -6.2134F);
        this.Body2.addChild(RArm);
        this.setRotateAngle(RArm, -0.537F, 0.2368F, -0.0429F);


        this.RArm2 = new ModelRenderer(this);
        this.RArm2.setRotationPoint(-0.0771F, -0.2307F, 6.0801F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, 0.3403F, 0.0F, 0.0F);


        this.RHand = new ModelRenderer(this);
        this.RHand.setRotationPoint(0.99F, 5.0F, 0.0F);
        this.RArm2.addChild(RHand);
        this.setRotateAngle(RHand, 0.0F, 0.0F, 0.48F);


        this.RArm3 = new ModelRenderer(this);
        this.RArm3.setRotationPoint(-2.0F, 6.1975F, -6.2134F);
        this.Body2.addChild(RArm3);
        this.setRotateAngle(RArm3, -1.2352F, -0.2368F, 0.0429F);


        this.RArm4 = new ModelRenderer(this);
        this.RArm4.setRotationPoint(0.0771F, -0.2307F, 6.0801F);
        this.RArm3.addChild(RArm4);
        this.setRotateAngle(RArm4, 0.6021F, 0.0F, 0.0F);


        this.RHand2 = new ModelRenderer(this);
        this.RHand2.setRotationPoint(-0.99F, 5.0F, 0.0F);
        this.RArm4.addChild(RHand2);
        this.setRotateAngle(RHand2, 0.0F, 0.0F, -0.48F);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.1891F, 3.8853F);
        this.Lagosuchus.addChild(Tail);
        this.setRotateAngle(Tail, 0.0702F, 0.1745F, 0.0046F);
        this.Tail.cubeList.add(new ModelBox(Tail, 24, -1, -0.5F, 0.0987F, -0.4611F, 1, 1, 12, -0.15F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.0013F, 10.9389F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1506F, 0.1726F, 0.0261F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 22, 24, -0.5F, 0.0416F, 0.0624F, 1, 1, 14, -0.15F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.2584F, 13.8624F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0903F, -0.2608F, -0.0233F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 24, -0.5F, 0.2853F, -0.0526F, 1, 1, 19, -0.15F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0853F, 19.4474F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.065F, -0.3484F, 0.0222F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -0.6F, 0.2244F, -0.7993F, 1, 1, 22, -0.15F, false));

        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(2.0F, 1.0109F, 0.1853F);
        this.Lagosuchus.addChild(RLeg);
        this.setRotateAngle(RLeg, -0.8901F, 0.0F, 0.0F);


        this.RLeg2 = new ModelRenderer(this);
        this.RLeg2.setRotationPoint(1.0F, 10.1067F, 1.6421F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 1.4835F, 0.0F, 0.0F);


        this.RLeg3 = new ModelRenderer(this);
        this.RLeg3.setRotationPoint(0.0F, 12.6486F, 1.1721F);
        this.RLeg2.addChild(RLeg3);
        this.setRotateAngle(RLeg3, -0.6196F, 0.0F, 0.0F);


        this.RFoot = new ModelRenderer(this);
        this.RFoot.setRotationPoint(-0.5F, 6.0F, 0.3F);
        this.RLeg3.addChild(RFoot);
        this.setRotateAngle(RFoot, 0.0873F, 0.0F, 0.0F);


        this.RLeg4 = new ModelRenderer(this);
        this.RLeg4.setRotationPoint(-2.0F, 1.0109F, 0.1853F);
        this.Lagosuchus.addChild(RLeg4);
        this.setRotateAngle(RLeg4, 0.1134F, 0.0F, 0.0F);


        this.RLeg5 = new ModelRenderer(this);
        this.RLeg5.setRotationPoint(-1.0F, 10.1067F, 1.6421F);
        this.RLeg4.addChild(RLeg5);
        this.setRotateAngle(RLeg5, 1.1345F, 0.0F, 0.0F);


        this.RLeg6 = new ModelRenderer(this);
        this.RLeg6.setRotationPoint(0.0F, 12.6486F, 1.1721F);
        this.RLeg5.addChild(RLeg6);
        this.setRotateAngle(RLeg6, -0.7941F, 0.0F, 0.0F);


        this.RFoot2 = new ModelRenderer(this);
        this.RFoot2.setRotationPoint(0.5F, 6.0F, 0.3F);
        this.RLeg6.addChild(RFoot2);
        this.setRotateAngle(RFoot2, 0.6109F, 0.0F, 0.0F);

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
