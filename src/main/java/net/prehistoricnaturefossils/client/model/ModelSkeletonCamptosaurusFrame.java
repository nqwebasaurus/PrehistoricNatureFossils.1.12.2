package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCamptosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Camptosaurus;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tail5;
    private final ModelRenderer LegL;
    private final ModelRenderer KneeL;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer FootL;
    private final ModelRenderer FootL2;
    private final ModelRenderer LegL2;
    private final ModelRenderer KneeL2;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer FootL3;
    private final ModelRenderer FootL4;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer ArmL;
    private final ModelRenderer ElbowL;
    private final ModelRenderer HandL;
    private final ModelRenderer OpposableL;
    private final ModelRenderer ArmL2;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer OpposableL2;
    private final ModelRenderer Neck4;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r12;
    private final ModelRenderer Neck1;
    private final ModelRenderer cube_r13;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;

    public ModelSkeletonCamptosaurusFrame() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.9F, -20.55F, -24.1F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.192F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -3.45F, -0.5F, 1, 24, 1, -0.21F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.9F, -20.55F, -24.1F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.192F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.85F, -3.6F, -0.5F, 1, 8, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -22.5F, -2.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 3.5F, -5.5F, -0.5F, 1, 11, 1, -0.2F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -22.5F, -2.4F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0873F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.5F, -6.5F, -0.5F, 1, 29, 1, -0.21F, false));

        this.Camptosaurus = new ModelRenderer(this);
        this.Camptosaurus.setRotationPoint(0.0F, -29.0F, 0.0F);
        this.fossil.addChild(Camptosaurus);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.1897F, -7.5097F);
        this.Camptosaurus.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.096F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 16, -0.5F, -0.2092F, -0.6091F, 1, 2, 12, -0.2F, false));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.7F, 4.1F);
        this.Camptosaurus.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.4378F, 0.0791F, -0.037F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 0, 34, -0.4926F, 0.5715F, -0.3232F, 1, 2, 10, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 1.1528F, 9.561F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0175F, -0.0873F, -0.0015F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, -1, 17, -0.4997F, -0.6044F, -0.3008F, 1, 2, 14, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.6217F, 12.7806F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1965F, -0.2141F, -0.0423F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 19, 0, -0.5095F, 0.1779F, 0.0534F, 1, 2, 13, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.2272F, 12.4974F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0928F, -0.3477F, -0.0317F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -0.5181F, 0.4907F, 0.0091F, 1, 1, 16, -0.2F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, -0.1113F, 16.2311F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.0903F, -0.2608F, 0.0233F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 16, 21, -0.5276F, 0.6047F, -0.6331F, 1, 1, 13, -0.2F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(5.0F, -0.1F, -1.4F);
        this.Camptosaurus.addChild(LegL);
        this.setRotateAngle(LegL, -0.1309F, 0.0F, 0.0F);


        this.KneeL = new ModelRenderer(this);
        this.KneeL.setRotationPoint(0.0F, 13.6378F, 1.0243F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 1.309F, 0.0F, 0.0F);


        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 13.5189F, 0.0436F);
        this.KneeL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -0.7418F, 0.0F, 0.0F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(-0.1F, 6.3996F, -0.8833F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, -1.309F, 0.0F, 0.0F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.5F, 2.4F, 0.0F);
        this.FootL.addChild(FootL2);
        this.setRotateAngle(FootL2, -0.3927F, 0.0F, 0.0F);


        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-5.0F, -0.1F, -1.4F);
        this.Camptosaurus.addChild(LegL2);
        this.setRotateAngle(LegL2, -0.7418F, 0.0F, 0.0F);


        this.KneeL2 = new ModelRenderer(this);
        this.KneeL2.setRotationPoint(0.0F, 13.6378F, 1.0243F);
        this.LegL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, 1.0908F, 0.0F, 0.0F);


        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(0.0F, 13.5189F, 0.0436F);
        this.KneeL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, -1.0908F, 0.0F, 0.0F);


        this.FootL3 = new ModelRenderer(this);
        this.FootL3.setRotationPoint(0.1F, 6.3996F, -0.8833F);
        this.MetatarsalL2.addChild(FootL3);
        this.setRotateAngle(FootL3, -0.829F, 0.0F, 0.0F);


        this.FootL4 = new ModelRenderer(this);
        this.FootL4.setRotationPoint(-0.5F, 2.4F, 0.0F);
        this.FootL3.addChild(FootL4);


        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.4F, -8.0F);
        this.Camptosaurus.addChild(Body);
        this.setRotateAngle(Body, 0.0F, 0.1745F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.181F, -6.6698F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 31, -0.5F, 0.549F, 0.0353F, 1, 2, 7, -0.2F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 1.2F, -12.6F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2531F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 50, 0.0F, 0.7512F, 0.2946F, 1, 2, 6, -0.2F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 1.8F, -12.3F);
        this.Body.addChild(Chest);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.2957F, 0.0961F);
        this.Chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.733F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 59, -0.5F, 0.2835F, -8.6465F, 1, 2, 5, -0.2F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 1.9043F, -2.9039F);
        this.Chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6981F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 70, 36, 0.0F, 0.6514F, -0.2502F, 1, 2, 4, -0.2F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(3.4F, 8.6F, -4.3F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.4728F, 0.0998F, -0.1434F);


        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.4F, 7.2455F, 0.4442F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, 0.5132F, 0.2151F, -0.0303F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.6573F, -0.7082F, -5.8535F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0F, 0.48F, 0.0F);


        this.OpposableL = new ModelRenderer(this);
        this.OpposableL.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.HandL.addChild(OpposableL);
        this.setRotateAngle(OpposableL, -0.2618F, 0.0F, 0.0F);


        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-3.4F, 8.6F, -4.3F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 0.9528F, -0.0998F, 0.1434F);


        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(-0.4F, 7.2455F, 0.4442F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, 0.2951F, -0.2151F, 0.0303F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(-0.6573F, -0.7082F, -5.8535F);
        this.ElbowL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 0.0F, -0.4363F, 0.0F);


        this.OpposableL2 = new ModelRenderer(this);
        this.OpposableL2.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.HandL2.addChild(OpposableL2);
        this.setRotateAngle(OpposableL2, -0.2161F, -0.149F, -0.5947F);


        this.Neck4 = new ModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, 5.0F, -6.3F);
        this.Chest.addChild(Neck4);
        this.setRotateAngle(Neck4, 0.0F, 0.1309F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.8739F, -4.5769F);
        this.Neck4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2443F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 61, 15, -0.5F, 0.7763F, -0.1763F, 1, 1, 6, -0.2F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 1.3F, -4.3F);
        this.Neck4.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.1787F, 0.2148F, 0.0385F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.3156F, -3.5699F);
        this.Neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4189F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 66, 72, -0.5075F, -0.0285F, -0.5795F, 1, 1, 5, -0.2F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -1.4584F, -3.3099F);
        this.Neck3.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0131F, 0.0434F, -0.0422F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -5.069F, -2.9311F);
        this.Neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.9861F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, -1, 55, -0.5007F, 0.654F, 0.0687F, 1, 1, 6, -0.2F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -5.0F, -2.9F);
        this.Neck2.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.1572F, 0.0431F, -0.0068F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0203F, -1.2957F);
        this.Neck1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3142F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 77, 0, -0.5007F, 0.1643F, -0.8771F, 1, 1, 2, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.103F, -1.5206F);
        this.Neck1.addChild(Head);
        this.setRotateAngle(Head, -0.2414F, 0.0876F, 0.0016F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.4F, -0.2F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.6196F, 0.0F, 0.0F);

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
