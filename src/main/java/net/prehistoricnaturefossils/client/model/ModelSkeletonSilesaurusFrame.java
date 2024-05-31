package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSilesaurusFrame extends ModelBase {
    private final ModelRenderer Silesaurus;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer LegL;
    private final ModelRenderer KneeL;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer FootL;
    private final ModelRenderer LegL2;
    private final ModelRenderer KneeL2;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer ArmL;
    private final ModelRenderer ElbowL;
    private final ModelRenderer MetacarpalL;
    private final ModelRenderer HandL;
    private final ModelRenderer ArmL2;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer MetacarpalL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Neck1;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;

    public ModelSkeletonSilesaurusFrame() {
        this.textureWidth = 73;
        this.textureHeight = 73;

        this.Silesaurus = new ModelRenderer(this);
        this.Silesaurus.setRotationPoint(0.0F, 0.2F, 3.0F);
        this.Silesaurus.cubeList.add(new ModelBox(Silesaurus, 31, 14, -0.5F, 1.2F, -4.0F, 1, 1, 10, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 9.5F, -15.5F);
        this.Silesaurus.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0742F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -3.5F, -3.5F, -0.5F, 1, 7, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 9.5F, -15.5F);
        this.Silesaurus.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0742F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.5F, -7.5F, -0.5F, 1, 22, 1, -0.004F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 8.0F, 1.8F);
        this.Silesaurus.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 4.0F, -3.5F, -0.5F, 1, 7, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 8.0F, 1.8F);
        this.Silesaurus.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0436F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.5F, -6.0F, -0.5F, 1, 22, 1, -0.004F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(3.4F, 3.4F, 1.8F);
        this.Silesaurus.addChild(LegL);
        this.setRotateAngle(LegL, 0.0436F, 0.0F, 0.0F);


        this.KneeL = new ModelRenderer(this);
        this.KneeL.setRotationPoint(0.1F, 9.3005F, -0.378F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 1.2654F, 0.0F, 0.0F);


        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(-0.1F, 8.4517F, 0.5813F);
        this.KneeL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -0.6458F, 0.0F, 0.0F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 5.9387F, 0.1833F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 1.1781F, 0.0F, 0.0F);


        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-3.4F, 3.4F, 1.8F);
        this.Silesaurus.addChild(LegL2);
        this.setRotateAngle(LegL2, -1.1781F, 0.0F, 0.0F);


        this.KneeL2 = new ModelRenderer(this);
        this.KneeL2.setRotationPoint(-0.1F, 9.3005F, -0.378F);
        this.LegL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, 1.4835F, 0.0F, 0.0F);


        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(0.1F, 8.4517F, 0.5813F);
        this.KneeL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, -1.4748F, 0.0F, 0.0F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 5.9387F, 0.1833F);
        this.MetatarsalL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 1.9199F, 0.0F, 0.0F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 5.2F);
        this.Silesaurus.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0873F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.Tail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 0, -0.5F, 1.1627F, -0.2662F, 1, 1, 11, 0.001F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.6F, 10.3F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0436F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0218F, 0.4995F);
        this.Tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 18, -0.5F, 1.0829F, -1.2611F, 1, 1, 10, 0.0F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.1784F, 9.4908F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1833F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 18, -0.5F, 0.4973F, -0.8971F, 1, 1, 13, 0.001F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.0913F, 11.9992F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.192F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -0.5F, 0.5432F, -0.1562F, 1, 1, 16, 0.0F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.2F, -3.0F);
        this.Silesaurus.addChild(Body);
        this.setRotateAngle(Body, -0.0873F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.8F, 0.0F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 31, -0.5F, 0.6F, -10.0F, 1, 1, 10, 0.001F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 1.0F, -9.5F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, -0.044F, -0.1308F, 0.0057F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.8F, -6.2F);
        this.Chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 0, -0.4702F, 0.8203F, -0.1964F, 1, 1, 7, 0.0F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(3.9F, 6.8F, -2.6F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 1.0036F, 0.0F, 0.0F);


        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(-0.5F, 6.7F, 0.6F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -1.6319F, 0.0F, 0.0F);


        this.MetacarpalL = new ModelRenderer(this);
        this.MetacarpalL.setRotationPoint(0.0F, 8.9F, -1.4F);
        this.ElbowL.addChild(MetacarpalL);
        this.setRotateAngle(MetacarpalL, 0.8988F, 0.0F, 0.0F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.0F, 1.4F, 1.3F);
        this.MetacarpalL.addChild(HandL);
        this.setRotateAngle(HandL, 0.9338F, 0.0F, 0.0F);


        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-3.9F, 6.8F, -2.6F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 1.309F, 0.0F, 0.0F);


        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(0.5F, 6.7F, 0.6F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -2.0246F, 0.0F, 0.0F);


        this.MetacarpalL2 = new ModelRenderer(this);
        this.MetacarpalL2.setRotationPoint(0.0F, 8.9F, -1.4F);
        this.ElbowL2.addChild(MetacarpalL2);
        this.setRotateAngle(MetacarpalL2, 0.5061F, 0.0F, 0.0F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(0.0F, 1.4F, 1.3F);
        this.MetacarpalL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 1.85F, 0.0F, 0.0F);


        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 1.5F, -6.0F);
        this.Chest.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0436F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.1F, -2.9F);
        this.Neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 55, 47, -0.4702F, 1.0898F, 0.2951F, 1, 1, 3, 0.001F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.3F, -2.5F);
        this.Neck3.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0447F, -0.218F, 0.0097F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4974F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 41, -0.4036F, 1.0055F, -4.4526F, 1, 1, 6, 0.0F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -2.4F, -4.9F);
        this.Neck2.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.1329F, -0.173F, -0.023F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 10, 56, -0.4154F, 1.1733F, -2.9187F, 1, 1, 3, -0.002F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.Neck1.addChild(Head);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(-0.5F, 0.8F, 0.5F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.6894F, 0.0F, 0.0F);

    }

    public void renderAll(float f) {
        this.Silesaurus.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
