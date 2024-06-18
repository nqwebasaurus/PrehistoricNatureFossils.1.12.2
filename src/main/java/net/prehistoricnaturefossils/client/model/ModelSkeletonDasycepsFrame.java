package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDasycepsFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer Dasyceps;
    private final ModelRenderer Basin;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer FemurR2;
    private final ModelRenderer Tibia_FibulaR2;
    private final ModelRenderer PesR2;
    private final ModelRenderer FemurR3;
    private final ModelRenderer Tibia_FibulaR3;
    private final ModelRenderer PesR3;
    private final ModelRenderer Body2;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Body3;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Neck2;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer Cephalon2;
    private final ModelRenderer Cranium2;
    private final ModelRenderer Jaw2;
    private final ModelRenderer ForearmL3;
    private final ModelRenderer Radio_UlnaL3;
    private final ModelRenderer ManusL3;
    private final ModelRenderer ForearmL4;
    private final ModelRenderer Radio_UlnaL4;
    private final ModelRenderer ManusL4;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer Tail3;

    public ModelSkeletonDasycepsFrame() {
        this.textureWidth = 70;
        this.textureHeight = 65;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -1.6F, -2.9F, 3.8F, 1, 3, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -1.9F, -2.9F, -10.0F, 1, 3, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-1.4F, -1.0F, -9.0F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, -0.1309F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -2, 1, -4.0F, -1.0F, -1.0F, 8, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(-0.7F, -2.0F, 4.25F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, 0.1484F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -2, 1, -4.0F, -0.5F, -0.5F, 7, 1, 1, -0.1F, false));

        this.Dasyceps = new ModelRenderer(this);
        this.Dasyceps.setRotationPoint(-1.2F, -10.0F, 3.0F);
        this.fossil.addChild(Dasyceps);


        this.Basin = new ModelRenderer(this);
        this.Basin.setRotationPoint(0.0F, 6.5F, 0.6F);
        this.Dasyceps.addChild(Basin);
        this.setRotateAngle(Basin, 0.1309F, 0.1745F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 2.5974F, -2.7392F);
        this.Basin.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.1745F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 15, 52, -0.5F, -2.7958F, -0.1912F, 1, 1, 6, -0.1F, false));

        this.FemurR2 = new ModelRenderer(this);
        this.FemurR2.setRotationPoint(3.25F, 1.7669F, 0.2694F);
        this.Basin.addChild(FemurR2);
        this.setRotateAngle(FemurR2, 0.324F, -0.3548F, -0.7365F);


        this.Tibia_FibulaR2 = new ModelRenderer(this);
        this.Tibia_FibulaR2.setRotationPoint(4.0491F, 2.7718F, 1.9914F);
        this.FemurR2.addChild(Tibia_FibulaR2);
        this.setRotateAngle(Tibia_FibulaR2, -0.5116F, -0.8554F, 0.4579F);


        this.PesR2 = new ModelRenderer(this);
        this.PesR2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Tibia_FibulaR2.addChild(PesR2);
        this.setRotateAngle(PesR2, 0.6638F, -0.2768F, -0.1718F);


        this.FemurR3 = new ModelRenderer(this);
        this.FemurR3.setRotationPoint(-3.15F, 1.7669F, 0.2694F);
        this.Basin.addChild(FemurR3);
        this.setRotateAngle(FemurR3, -0.7006F, -0.5571F, 1.0716F);


        this.Tibia_FibulaR3 = new ModelRenderer(this);
        this.Tibia_FibulaR3.setRotationPoint(-4.0491F, 2.7718F, 1.9914F);
        this.FemurR3.addChild(Tibia_FibulaR3);
        this.setRotateAngle(Tibia_FibulaR3, -0.3969F, 0.8736F, -0.297F);


        this.PesR3 = new ModelRenderer(this);
        this.PesR3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Tibia_FibulaR3.addChild(PesR3);
        this.setRotateAngle(PesR3, 0.5526F, 0.0635F, -0.1256F);


        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.8436F, -2.4906F);
        this.Basin.addChild(Body2);
        this.setRotateAngle(Body2, 0.0853F, -0.173F, 0.023F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 0.1858F, -4.4643F);
        this.Body2.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.2356F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, -2, 41, -0.5F, -0.5422F, -4.0F, 1, 1, 9, -0.1F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -1.8171F, -7.7512F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, -0.0455F, -0.1278F, 0.0285F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, 0.4496F, -5.2906F);
        this.Body3.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.1484F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 25, 55, -0.5F, -0.6195F, 0.2479F, 1, 1, 5, -0.1F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.1F, -0.7064F, -5.1426F);
        this.Body3.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2216F, 0.1705F, -0.0362F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 0.7754F, -4.264F);
        this.Neck2.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.0F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 25, 34, -0.6F, -0.2011F, -0.6261F, 1, 1, 6, -0.1F, false));

        this.Cephalon2 = new ModelRenderer(this);
        this.Cephalon2.setRotationPoint(0.0F, -0.1489F, -4.0201F);
        this.Neck2.addChild(Cephalon2);
        this.setRotateAngle(Cephalon2, -0.0884F, 0.2171F, -0.0305F);


        this.Cranium2 = new ModelRenderer(this);
        this.Cranium2.setRotationPoint(-0.3F, -0.6F, 0.2F);
        this.Cephalon2.addChild(Cranium2);
        this.setRotateAngle(Cranium2, -0.1621F, 0.0F, 0.0F);


        this.Jaw2 = new ModelRenderer(this);
        this.Jaw2.setRotationPoint(-0.0071F, 1.944F, 1.3495F);
        this.Cephalon2.addChild(Jaw2);
        this.setRotateAngle(Jaw2, 0.1639F, 0.0F, 0.0F);


        this.ForearmL3 = new ModelRenderer(this);
        this.ForearmL3.setRotationPoint(4.6F, 1.8328F, -2.7816F);
        this.Body3.addChild(ForearmL3);
        this.setRotateAngle(ForearmL3, -0.534F, 0.5242F, -0.9358F);


        this.Radio_UlnaL3 = new ModelRenderer(this);
        this.Radio_UlnaL3.setRotationPoint(4.5F, 3.1F, 0.7F);
        this.ForearmL3.addChild(Radio_UlnaL3);
        this.setRotateAngle(Radio_UlnaL3, -0.7413F, -0.6027F, 0.5747F);


        this.ManusL3 = new ModelRenderer(this);
        this.ManusL3.setRotationPoint(0.9679F, 4.544F, -2.0594F);
        this.Radio_UlnaL3.addChild(ManusL3);
        this.setRotateAngle(ManusL3, 0.6442F, -0.0278F, 0.193F);


        this.ForearmL4 = new ModelRenderer(this);
        this.ForearmL4.setRotationPoint(-4.4F, 1.8328F, -2.7816F);
        this.Body3.addChild(ForearmL4);
        this.setRotateAngle(ForearmL4, 0.7196F, 0.8164F, 0.7772F);


        this.Radio_UlnaL4 = new ModelRenderer(this);
        this.Radio_UlnaL4.setRotationPoint(-4.5F, 3.1F, 0.7F);
        this.ForearmL4.addChild(Radio_UlnaL4);
        this.setRotateAngle(Radio_UlnaL4, -0.8172F, 0.0057F, -0.4891F);


        this.ManusL4 = new ModelRenderer(this);
        this.ManusL4.setRotationPoint(-0.9679F, 4.544F, -2.0594F);
        this.Radio_UlnaL4.addChild(ManusL4);
        this.setRotateAngle(ManusL4, 0.6631F, 0.2381F, -0.0353F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.2016F, 3.4506F);
        this.Basin.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.2664F, 0.2595F, -0.035F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 45, 32, -0.5F, 0.6569F, -0.0931F, 1, 1, 7, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0522F, 6.9034F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0083F, -0.346F, -0.0475F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(-0.1F, 1.0392F, -0.7974F);
        this.Tail2.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.0175F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 33, 34, -0.5F, -0.4015F, 0.0698F, 1, 1, 9, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0306F, 7.5331F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1473F, -0.4755F, -0.0678F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 30, 24, -0.5F, 0.5F, 0.0F, 1, 1, 9, -0.1F, false));

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
