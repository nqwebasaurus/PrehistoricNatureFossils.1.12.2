package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDilophosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Dilophosaurus;
    private final ModelRenderer basin_r1;
    private final ModelRenderer basin_r2;
    private final ModelRenderer LegL;
    private final ModelRenderer TibiaL;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer FootL;
    private final ModelRenderer FootL2;
    private final ModelRenderer LegL2;
    private final ModelRenderer TibiaL2;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer FootL3;
    private final ModelRenderer FootL4;
    private final ModelRenderer Tail1;
    private final ModelRenderer CaudalProximal_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer CaudalMedioproximal_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer CaudalDistal_r1;
    private final ModelRenderer Tail5;
    private final ModelRenderer CaudalDistalmost_r1;
    private final ModelRenderer Body;
    private final ModelRenderer Thorax_r1;
    private final ModelRenderer Thorax_r2;
    private final ModelRenderer Chest;
    private final ModelRenderer Scapulo_coracoid_r1;
    private final ModelRenderer ArmL;
    private final ModelRenderer ElbowL;
    private final ModelRenderer HandL;
    private final ModelRenderer ArmL2;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer Neck1;
    private final ModelRenderer CervicalDistal_r1;
    private final ModelRenderer Neck2;
    private final ModelRenderer CervicalMedial_r1;
    private final ModelRenderer Neck3;
    private final ModelRenderer CervicalProximal_r1;
    private final ModelRenderer Head;
    private final ModelRenderer ParasagittalCrest2;
    private final ModelRenderer ParasagittalCrest3;
    private final ModelRenderer Jaw;

    public ModelSkeletonDilophosaurusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -22.0F, 6.0F, 1, 22, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(3.5F, -19.2F, -12.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3316F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.3F, -5.8F, -0.5F, 1, 25, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(3.5F, -19.2F, -12.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3316F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -1.7F, -2.5F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -20.9F, 6.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.7104F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 0.1F, -3.0F, -0.5F, 1, 7, 1, -0.15F, false));

        this.Dilophosaurus = new ModelRenderer(this);
        this.Dilophosaurus.setRotationPoint(0.0F, -22.3F, 8.0F);
        this.fossil.addChild(Dilophosaurus);
        this.setRotateAngle(Dilophosaurus, -0.2182F, 0.0F, 0.0F);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.Dilophosaurus.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.1571F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 41, 47, -0.5F, 0.5154F, 5.5763F, 1, 1, 1, -0.15F, false));
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 36, 42, -0.5F, 0.5154F, -0.1237F, 1, 1, 6, -0.15F, false));

        this.basin_r2 = new ModelRenderer(this);
        this.basin_r2.setRotationPoint(0.0F, -0.5F, -6.4F);
        this.Dilophosaurus.addChild(basin_r2);
        this.setRotateAngle(basin_r2, -0.0785F, 0.0F, 0.0F);
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 24, 62, -0.5F, 0.131F, 1.9612F, 1, 1, 3, -0.15F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(2.2F, 2.3128F, -1.6962F);
        this.Dilophosaurus.addChild(LegL);
        this.setRotateAngle(LegL, -0.7375F, -0.0883F, -0.0968F);


        this.TibiaL = new ModelRenderer(this);
        this.TibiaL.setRotationPoint(-0.1F, 7.6476F, -2.868F);
        this.LegL.addChild(TibiaL);
        this.setRotateAngle(TibiaL, 0.7505F, 0.0F, 0.0F);


        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 6.9872F, 3.692F);
        this.TibiaL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -0.6109F, 0.0F, 0.0F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(-0.5F, 4.2911F, -1.2535F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 1.5272F, 0.0F, 0.0F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.5F, 0.0F, -2.3F);
        this.FootL.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.6545F, 0.0F, 0.0F);


        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-2.2F, 2.3128F, -1.6962F);
        this.Dilophosaurus.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.3491F, 0.0F, 0.0F);


        this.TibiaL2 = new ModelRenderer(this);
        this.TibiaL2.setRotationPoint(0.1F, 7.6476F, -2.868F);
        this.LegL2.addChild(TibiaL2);
        this.setRotateAngle(TibiaL2, -0.0349F, 0.0F, 0.0F);


        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(0.0F, 6.9872F, 3.692F);
        this.TibiaL2.addChild(MetatarsalL2);


        this.FootL3 = new ModelRenderer(this);
        this.FootL3.setRotationPoint(0.5F, 4.2911F, -1.2535F);
        this.MetatarsalL2.addChild(FootL3);
        this.setRotateAngle(FootL3, -0.0873F, 0.0F, 0.0F);


        this.FootL4 = new ModelRenderer(this);
        this.FootL4.setRotationPoint(-0.5F, 0.0F, -2.3F);
        this.FootL3.addChild(FootL4);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(-0.2F, 0.8F, 4.5F);
        this.Dilophosaurus.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0784F, -0.2189F, -0.0853F);


        this.CaudalProximal_r1 = new ModelRenderer(this);
        this.CaudalProximal_r1.setRotationPoint(0.7F, -0.284F, -0.0072F);
        this.Tail1.addChild(CaudalProximal_r1);
        this.setRotateAngle(CaudalProximal_r1, -0.096F, 0.0F, 0.0F);
        this.CaudalProximal_r1.cubeList.add(new ModelBox(CaudalProximal_r1, 29, 0, -1.0F, 0.492F, 0.0304F, 1, 1, 11, -0.15F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.2F, 1.0966F, 10.6773F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.064F, -0.3048F, -0.0192F);


        this.CaudalMedioproximal_r1 = new ModelRenderer(this);
        this.CaudalMedioproximal_r1.setRotationPoint(0.0F, -0.0324F, -0.0959F);
        this.Tail2.addChild(CaudalMedioproximal_r1);
        this.setRotateAngle(CaudalMedioproximal_r1, -0.0087F, 0.0F, 0.0F);
        this.CaudalMedioproximal_r1.cubeList.add(new ModelBox(CaudalMedioproximal_r1, 11, 11, -0.5F, 0.2F, 12.5F, 1, 1, 1, -0.15F, false));
        this.CaudalMedioproximal_r1.cubeList.add(new ModelBox(CaudalMedioproximal_r1, 0, 0, -0.5F, 0.2F, -0.2F, 1, 1, 13, -0.15F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.1F, 0.1365F, 12.8245F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0302F, -0.5234F, 0.0151F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 31, 13, -0.6F, 0.1772F, 0.0341F, 1, 1, 11, -0.15F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(-0.3F, -0.0109F, 11.0431F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.022F, -0.6544F, 0.0134F);


        this.CaudalDistal_r1 = new ModelRenderer(this);
        this.CaudalDistal_r1.setRotationPoint(0.2F, 0.1121F, 0.0778F);
        this.Tail4.addChild(CaudalDistal_r1);
        this.setRotateAngle(CaudalDistal_r1, -0.1309F, 0.0F, 0.0F);
        this.CaudalDistal_r1.cubeList.add(new ModelBox(CaudalDistal_r1, 0, 28, -0.5F, 0.1379F, -0.5463F, 1, 1, 12, -0.15F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.2F, 1.5156F, 11.4095F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.1276F, -0.607F, -0.0731F);


        this.CaudalDistalmost_r1 = new ModelRenderer(this);
        this.CaudalDistalmost_r1.setRotationPoint(0.5F, -0.5002F, 0.0939F);
        this.Tail5.addChild(CaudalDistalmost_r1);
        this.setRotateAngle(CaudalDistalmost_r1, -0.4363F, 0.0F, 0.0F);
        this.CaudalDistalmost_r1.cubeList.add(new ModelBox(CaudalDistalmost_r1, 27, 28, -1.0F, 0.7F, -0.2F, 1, 1, 12, -0.15F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.4629F, -4.3441F);
        this.Dilophosaurus.addChild(Body);
        this.setRotateAngle(Body, 0.0177F, -0.1745F, -0.0031F);


        this.Thorax_r1 = new ModelRenderer(this);
        this.Thorax_r1.setRotationPoint(0.0F, -0.6146F, -8.0325F);
        this.Body.addChild(Thorax_r1);
        this.setRotateAngle(Thorax_r1, 0.1134F, 0.0F, 0.0F);
        this.Thorax_r1.cubeList.add(new ModelBox(Thorax_r1, 56, 20, -0.5F, 0.6784F, -4.1885F, 1, 1, 4, -0.15F, false));

        this.Thorax_r2 = new ModelRenderer(this);
        this.Thorax_r2.setRotationPoint(-0.5F, -1.3F, 1.0F);
        this.Body.addChild(Thorax_r2);
        this.setRotateAngle(Thorax_r2, -0.0262F, 0.0F, 0.0F);
        this.Thorax_r2.cubeList.add(new ModelBox(Thorax_r2, 6, 49, 0.0F, 1.6F, -1.7F, 1, 1, 1, -0.15F, false));
        this.Thorax_r2.cubeList.add(new ModelBox(Thorax_r2, 0, 42, 0.0F, 1.6F, -9.4F, 1, 1, 8, -0.15F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.1994F, -11.9238F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.1152F, -0.1734F, -0.02F);


        this.Scapulo_coracoid_r1 = new ModelRenderer(this);
        this.Scapulo_coracoid_r1.setRotationPoint(-0.5F, 0.2709F, -3.8339F);
        this.Chest.addChild(Scapulo_coracoid_r1);
        this.setRotateAngle(Scapulo_coracoid_r1, 0.0436F, 0.0F, 0.0F);
        this.Scapulo_coracoid_r1.cubeList.add(new ModelBox(Scapulo_coracoid_r1, 19, 42, 0.0F, 0.2338F, -3.0652F, 1, 1, 7, -0.15F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(2.3246F, 5.7867F, -4.7464F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, -0.118F, -0.4784F, -0.5613F);


        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.4977F, 2.5646F, 3.3518F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.4944F, -0.3345F, 0.0922F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(-0.1F, 3.1257F, -1.6879F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, -0.0852F, 0.0189F, 0.3221F);


        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-2.3246F, 5.7867F, -4.7464F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, -0.2116F, -0.2101F, 0.4951F);


        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(-0.4977F, 2.5646F, 3.3518F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.288F, 0.0F, 0.0F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(0.1F, 3.1257F, -1.6879F);
        this.ElbowL2.addChild(HandL2);
        this.setRotateAngle(HandL2, -0.0852F, -0.0189F, -0.3221F);


        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.3356F, -6.5625F);
        this.Chest.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.1309F, 0.0F, 0.0F);


        this.CervicalDistal_r1 = new ModelRenderer(this);
        this.CervicalDistal_r1.setRotationPoint(0.0F, -2.1123F, -3.7315F);
        this.Neck1.addChild(CervicalDistal_r1);
        this.setRotateAngle(CervicalDistal_r1, -0.4538F, 0.0F, 0.0F);
        this.CervicalDistal_r1.cubeList.add(new ModelBox(CervicalDistal_r1, 3, 55, -0.5F, 0.6101F, 3.9026F, 1, 1, 1, -0.153F, false));
        this.CervicalDistal_r1.cubeList.add(new ModelBox(CervicalDistal_r1, 0, 52, -0.5F, 0.6101F, 0.2026F, 1, 1, 4, -0.15F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -1.8703F, -3.8877F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.1309F, 0.0F, 0.0F);


        this.CervicalMedial_r1 = new ModelRenderer(this);
        this.CervicalMedial_r1.setRotationPoint(-0.5F, -2.8558F, -2.8571F);
        this.Neck2.addChild(CervicalMedial_r1);
        this.setRotateAngle(CervicalMedial_r1, -0.7243F, 0.0F, 0.0F);
        this.CervicalMedial_r1.cubeList.add(new ModelBox(CervicalMedial_r1, 53, 5, 0.0F, 0.4544F, 0.0601F, 1, 1, 5, -0.15F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -2.5081F, -2.8638F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.2256F, -0.2555F, -0.0579F);


        this.CervicalProximal_r1 = new ModelRenderer(this);
        this.CervicalProximal_r1.setRotationPoint(-0.5F, -3.1054F, -2.9029F);
        this.Neck3.addChild(CervicalProximal_r1);
        this.setRotateAngle(CervicalProximal_r1, -0.7243F, 0.0F, 0.0F);
        this.CervicalProximal_r1.cubeList.add(new ModelBox(CervicalProximal_r1, 54, 26, 0.0F, 0.5149F, 0.153F, 1, 1, 4, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -3.0584F, -4.0611F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.7002F, -0.1846F, -0.1169F);


        this.ParasagittalCrest2 = new ModelRenderer(this);
        this.ParasagittalCrest2.setRotationPoint(0.2F, -2.3258F, -8.7438F);
        this.Head.addChild(ParasagittalCrest2);
        this.setRotateAngle(ParasagittalCrest2, -0.2226F, 0.0905F, 0.0702F);


        this.ParasagittalCrest3 = new ModelRenderer(this);
        this.ParasagittalCrest3.setRotationPoint(-0.2F, -2.3258F, -8.7438F);
        this.Head.addChild(ParasagittalCrest3);
        this.setRotateAngle(ParasagittalCrest3, -0.2226F, -0.0905F, -0.0702F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(-0.5F, 2.8099F, -0.1023F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.2618F, 0.0F, 0.0F);

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
