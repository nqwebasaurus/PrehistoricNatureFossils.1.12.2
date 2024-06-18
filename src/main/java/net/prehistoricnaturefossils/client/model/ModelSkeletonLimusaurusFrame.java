package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLimusaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Root;
    private final ModelRenderer Hips;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer Body;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer Chest;
    private final ModelRenderer Neck;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer Neck2;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Neck3;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer UpperArmL;
    private final ModelRenderer LowerArmL;
    private final ModelRenderer UpperArmL2;
    private final ModelRenderer LowerArmL2;
    private final ModelRenderer Tail;
    private final ModelRenderer Tail2;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer frame12_r1;
    private final ModelRenderer UpperLegL;
    private final ModelRenderer LowerLegL;
    private final ModelRenderer FootL;
    private final ModelRenderer ToesL;
    private final ModelRenderer UpperLegL2;
    private final ModelRenderer LowerLegL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer ToesL2;

    public ModelSkeletonLimusaurusFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -23.85F, -0.6F, 1, 24, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, -1, 1, -3.0F, -23.9F, -0.65F, 6, 1, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.495F, -26.9F, -16.155F, 1, 27, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, -1, 1, -3.5F, -24.65F, -16.15F, 7, 1, 1, -0.1F, false));

        this.Root = new ModelRenderer(this);
        this.Root.setRotationPoint(0.0F, -19.5F, 0.0F);
        this.fossil.addChild(Root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -3.4F, 0.5F);
        this.Root.addChild(Hips);
        this.setRotateAngle(Hips, -0.2618F, 0.0F, 0.0F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, -0.5F, -4.0F);
        this.Hips.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, -0.0436F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 28, 0, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.1F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.6F, -3.6F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.0873F, 0.0F, 0.0F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, 0.061F, -7.8443F);
        this.Body.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.0698F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 0, 27, -0.495F, 0.0F, 0.0F, 1, 1, 8, -0.1F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.5379F, -7.559F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0436F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 26, 24, -0.5F, 0.6395F, -6.9713F, 1, 1, 7, -0.1F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.1714F, -7.062F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.2184F, 0.0426F, -0.0094F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 1.1143F, -1.347F);
        this.Neck.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.1134F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 0, 0, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.1F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.0224F, -3.5966F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.3338F, 0.167F, 0.0796F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 0.7435F, -1.1988F);
        this.Neck2.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.1745F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 40, 4, -0.495F, -0.5F, -2.5F, 1, 1, 5, -0.1F, false));

        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, -1.3056F, -5.5665F);
        this.Neck2.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.4712F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 42, 11, -0.5F, -0.0321F, -0.0283F, 1, 1, 3, -0.1F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -1.7347F, -5.3247F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.1578F, 0.1149F, 0.1578F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 1.3669F, -3.177F);
        this.Neck3.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.6021F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 48, 5, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.1F, false));

        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.5F, 0.645F, -3.0399F);
        this.Neck3.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.035F, 0.0698F, 0.0024F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 38, 0, 0.0F, -0.1F, 0.0F, 1, 1, 3, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.945F, -4.2899F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.8727F, 0.0F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.7868F, -0.0904F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.8116F, 0.0F, 0.0F);


        this.UpperArmL = new ModelRenderer(this);
        this.UpperArmL.setRotationPoint(3.3F, 3.9895F, -5.0713F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.8476F, 0.3427F, -0.3423F);


        this.LowerArmL = new ModelRenderer(this);
        this.LowerArmL.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -0.6206F, -0.1001F, 0.1942F);


        this.UpperArmL2 = new ModelRenderer(this);
        this.UpperArmL2.setRotationPoint(-3.3F, 3.9895F, -5.0713F);
        this.Chest.addChild(UpperArmL2);
        this.setRotateAngle(UpperArmL2, -0.8476F, -0.3427F, 0.3423F);


        this.LowerArmL2 = new ModelRenderer(this);
        this.LowerArmL2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.UpperArmL2.addChild(LowerArmL2);
        this.setRotateAngle(LowerArmL2, -1.1006F, 0.1001F, -0.1942F);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -1.4F, 2.9F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, -0.0873F, 0.0435F, -0.0038F);
        this.Tail.cubeList.add(new ModelBox(Tail, 13, 23, -0.5F, 0.6957F, -0.4045F, 1, 1, 10, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.0043F, 9.0955F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1314F, 0.0865F, 0.0114F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Tail2.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, 0.0175F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 15, 0, -0.5F, -0.3F, -0.1F, 1, 1, 10, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.1004F, 9.8826F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0438F, 0.0872F, 0.0038F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, -2, 12, -0.5F, 0.6004F, -0.5174F, 1, 1, 11, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0802F, 9.8181F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.4422F, 0.158F, 0.0744F);


        this.frame12_r1 = new ModelRenderer(this);
        this.frame12_r1.setRotationPoint(0.0F, 0.7702F, -0.0856F);
        this.Tail4.addChild(frame12_r1);
        this.setRotateAngle(frame12_r1, -0.2269F, 0.0F, 0.0F);
        this.frame12_r1.cubeList.add(new ModelBox(frame12_r1, 0, 0, -0.5F, -0.209F, -0.1723F, 1, 1, 12, -0.1F, false));

        this.UpperLegL = new ModelRenderer(this);
        this.UpperLegL.setRotationPoint(3.0F, -0.2F, -0.9F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.0436F, 0.0019F, 0.0436F);


        this.LowerLegL = new ModelRenderer(this);
        this.LowerLegL.setRotationPoint(0.5F, 8.4055F, 0.1758F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 1.0455F, -0.0756F, 0.0437F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(-0.4F, 8.9494F, 0.5464F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, -0.4796F, -0.0201F, -0.0387F);


        this.ToesL = new ModelRenderer(this);
        this.ToesL.setRotationPoint(-0.1F, 6.6467F, -0.0887F);
        this.FootL.addChild(ToesL);
        this.setRotateAngle(ToesL, 0.1304F, 0.0114F, -0.0865F);


        this.UpperLegL2 = new ModelRenderer(this);
        this.UpperLegL2.setRotationPoint(-3.0F, -0.2F, -0.9F);
        this.Hips.addChild(UpperLegL2);
        this.setRotateAngle(UpperLegL2, -0.9599F, 0.0F, 0.0F);


        this.LowerLegL2 = new ModelRenderer(this);
        this.LowerLegL2.setRotationPoint(-0.5F, 8.4055F, 0.1758F);
        this.UpperLegL2.addChild(LowerLegL2);
        this.setRotateAngle(LowerLegL2, 1.5708F, 0.1745F, 0.0F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.4F, 8.9494F, 0.5464F);
        this.LowerLegL2.addChild(FootL2);
        this.setRotateAngle(FootL2, -1.4848F, -0.0151F, 0.1739F);


        this.ToesL2 = new ModelRenderer(this);
        this.ToesL2.setRotationPoint(0.1F, 6.6467F, -0.0887F);
        this.FootL2.addChild(ToesL2);
        this.setRotateAngle(ToesL2, 1.9199F, 0.0F, 0.0F);

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
