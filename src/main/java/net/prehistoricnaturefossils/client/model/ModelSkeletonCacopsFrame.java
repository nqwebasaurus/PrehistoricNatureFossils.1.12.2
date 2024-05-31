package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCacopsFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Hip;
    private final ModelRenderer cube_r5;
    private final ModelRenderer UpperLegL;
    private final ModelRenderer LowerLegL;
    private final ModelRenderer FootL;
    private final ModelRenderer UpperLegL2;
    private final ModelRenderer LowerLegL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body1;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer upperjaw;
    private final ModelRenderer UpperArmL;
    private final ModelRenderer LowerArmL;
    private final ModelRenderer HandL;
    private final ModelRenderer UpperArmL2;
    private final ModelRenderer LowerArmL2;
    private final ModelRenderer HandL2;

    public ModelSkeletonCacopsFrame() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.5F, 3.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0175F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -0.5F, -0.5F, 1, 5, 1, -0.1F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.5F, 3.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0175F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.0F, -2.0F, -0.5F, 1, 4, 1, -0.11F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.0F, -3.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -2.1F, -3.0F, -0.5F, 1, 6, 1, -0.11F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -5.0F, -3.2F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.4F, -1.0F, -0.5F, 1, 6, 1, -0.1F, false));

        this.Hip = new ModelRenderer(this);
        this.Hip.setRotationPoint(0.0F, -5.5F, 3.75F);
        this.fossil.addChild(Hip);
        this.setRotateAngle(Hip, -0.2182F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.1606F, 0.6753F);
        this.Hip.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 33, 32, -0.5F, 0.4076F, -2.0383F, 1, 1, 3, -0.1F, false));

        this.UpperLegL = new ModelRenderer(this);
        this.UpperLegL.setRotationPoint(2.25F, 1.502F, 0.699F);
        this.Hip.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 0.0533F, 0.6124F, 0.3538F);


        this.LowerLegL = new ModelRenderer(this);
        this.LowerLegL.setRotationPoint(2.7127F, 0.5782F, -0.6753F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.0133F, -0.7672F, 1.3451F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(2.5F, -0.5F, 0.45F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.8069F, 0.4686F, 0.0743F);


        this.UpperLegL2 = new ModelRenderer(this);
        this.UpperLegL2.setRotationPoint(-2.25F, 1.502F, 0.699F);
        this.Hip.addChild(UpperLegL2);
        this.setRotateAngle(UpperLegL2, 0.6357F, 0.3104F, -0.0714F);


        this.LowerLegL2 = new ModelRenderer(this);
        this.LowerLegL2.setRotationPoint(-2.7127F, 0.5782F, -0.6753F);
        this.UpperLegL2.addChild(LowerLegL2);
        this.setRotateAngle(LowerLegL2, 0.051F, 1.0688F, -1.2614F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(-2.5F, -0.5F, 0.45F);
        this.LowerLegL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.8545F, -0.1936F, -0.0916F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.3856F, 1.5753F);
        this.Hip.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1752F, 0.0859F, -0.0152F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 25, 15, -0.4967F, 0.3083F, -0.1458F, 1, 1, 4, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.1743F, 3.8923F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0903F, 0.2608F, 0.0233F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 33, 18, -0.489F, 0.4824F, -0.2976F, 1, 1, 3, -0.1F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.3644F, -0.9247F);
        this.Hip.addChild(body);
        this.setRotateAngle(body, 0.088F, -0.1304F, -0.0115F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.5223F, -1.9936F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1571F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 39, -0.5017F, 0.8041F, -0.0283F, 1, 1, 2, -0.1F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.1473F, -1.9436F);
        this.body.addChild(body1);
        this.setRotateAngle(body1, 0.088F, 0.1304F, 0.0115F);
        this.body1.cubeList.add(new ModelBox(body1, 7, 25, -0.5011F, 0.4406F, -3.9534F, 1, 1, 4, -0.1F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0655F, -3.7489F);
        this.body1.addChild(Chest);
        this.setRotateAngle(Chest, 0.0886F, 0.1739F, 0.0154F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0261F, -2.9428F);
        this.Chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 22, -0.5019F, 0.6511F, -0.9356F, 1, 1, 4, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.1261F, -2.8428F);
        this.Chest.addChild(Head);
        this.setRotateAngle(Head, -0.2618F, 0.0F, 0.0F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.9F, -0.8F);
        this.Head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.48F, 0.0F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.9F, -0.8F);
        this.Head.addChild(upperjaw);


        this.UpperArmL = new ModelRenderer(this);
        this.UpperArmL.setRotationPoint(3.2F, 3.0763F, -0.5341F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.2215F, 0.1819F, -0.1024F);


        this.LowerArmL = new ModelRenderer(this);
        this.LowerArmL.setRotationPoint(2.9541F, 0.3403F, -0.132F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -0.2232F, 0.8404F, 1.1391F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(1.75F, 0.5F, -0.3F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, -0.1263F, -0.788F, 0.069F);


        this.UpperArmL2 = new ModelRenderer(this);
        this.UpperArmL2.setRotationPoint(-3.2F, 3.0763F, -0.5341F);
        this.Chest.addChild(UpperArmL2);
        this.setRotateAngle(UpperArmL2, 0.1412F, 0.6801F, -0.2835F);


        this.LowerArmL2 = new ModelRenderer(this);
        this.LowerArmL2.setRotationPoint(-2.9541F, 0.3403F, -0.132F);
        this.UpperArmL2.addChild(LowerArmL2);
        this.setRotateAngle(LowerArmL2, -0.2232F, -0.8404F, -1.1391F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(-1.75F, 0.5F, -0.3F);
        this.LowerArmL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 0.0248F, 0.5326F, -0.1146F);

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
