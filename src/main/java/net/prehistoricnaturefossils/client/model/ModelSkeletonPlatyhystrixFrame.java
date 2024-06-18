package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPlatyhystrixFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Hip;
    private final ModelRenderer cube_r4;
    private final ModelRenderer UpperLegR;
    private final ModelRenderer LowerLegR;
    private final ModelRenderer FootR;
    private final ModelRenderer UpperLegR2;
    private final ModelRenderer LowerLegR2;
    private final ModelRenderer FootR2;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Tail2;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body1;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer upperjaw;
    private final ModelRenderer UpperArmR;
    private final ModelRenderer LowerArmR;
    private final ModelRenderer HandR;
    private final ModelRenderer UpperArmR2;
    private final ModelRenderer LowerArmR2;
    private final ModelRenderer HandR2;

    public ModelSkeletonPlatyhystrixFrame() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, 5.275F, 4.3F, 1, 5, 1, -0.25F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.05F, 6.85F, -4.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3491F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.775F, -3.15F, -0.5F, 1, 7, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.05F, 6.85F, -4.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3229F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.35F, -2.65F, -0.5F, 1, 6, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.1F, 4.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -3.0F, -3.0F, -0.5F, 1, 5, 1, -0.2F, false));

        this.Hip = new ModelRenderer(this);
        this.Hip.setRotationPoint(0.0F, 3.0F, 3.75F);
        this.fossil.addChild(Hip);
        this.setRotateAngle(Hip, -0.2182F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.825F, -0.3F);
        this.Hip.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 37, -0.5F, 0.7F, 0.0F, 1, 1, 2, -0.2F, false));

        this.UpperLegR = new ModelRenderer(this);
        this.UpperLegR.setRotationPoint(2.25F, 3.3795F, 2.3566F);
        this.Hip.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, 0.1707F, 0.8296F, -0.2618F);


        this.LowerLegR = new ModelRenderer(this);
        this.LowerLegR.setRotationPoint(2.795F, 0.0426F, -1.2444F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.4134F, 0.2255F, 1.2984F);


        this.FootR = new ModelRenderer(this);
        this.FootR.setRotationPoint(3.4729F, 0.0003F, 0.6126F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, 0.4258F, 0.2465F, 0.5699F);


        this.UpperLegR2 = new ModelRenderer(this);
        this.UpperLegR2.setRotationPoint(-2.25F, 3.3795F, 2.3566F);
        this.Hip.addChild(UpperLegR2);
        this.setRotateAngle(UpperLegR2, 0.1219F, 0.3389F, 0.429F);


        this.LowerLegR2 = new ModelRenderer(this);
        this.LowerLegR2.setRotationPoint(-2.795F, 0.0426F, -1.2444F);
        this.UpperLegR2.addChild(LowerLegR2);
        this.setRotateAngle(LowerLegR2, 0.3719F, 0.3249F, -1.5815F);


        this.FootR2 = new ModelRenderer(this);
        this.FootR2.setRotationPoint(-3.4729F, 0.0003F, 0.6126F);
        this.LowerLegR2.addChild(FootR2);
        this.setRotateAngle(FootR2, 0.3686F, -0.1702F, -0.2953F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.75F, 2.0F);
        this.Hip.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1806F, -0.2577F, 0.0465F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.5848F, 0.8639F);
        this.Tail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0829F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 8, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1828F, -0.3006F, -0.0547F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 22, -0.5F, 0.9755F, -0.5218F, 1, 1, 4, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Hip.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.975F, -1.05F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0131F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 21, -0.5F, -0.475F, -1.0F, 1, 1, 2, -0.2F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 1.0F, -1.75F);
        this.body.addChild(body1);
        this.setRotateAngle(body1, 0.088F, 0.1304F, 0.0115F);
        this.body1.cubeList.add(new ModelBox(body1, 19, 18, -0.5F, -0.525F, -5.85F, 1, 1, 6, -0.2F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -5.25F);
        this.body1.addChild(Chest);
        this.setRotateAngle(Chest, 0.088F, 0.1304F, 0.0115F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.6F, -2.15F);
        this.Chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 23, -0.5F, 0.25F, -0.65F, 1, 1, 3, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.Chest.addChild(Head);
        this.setRotateAngle(Head, -0.09F, 0.123F, -0.045F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.525F, 0.0F);
        this.Head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.3927F, 0.0F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Head.addChild(upperjaw);


        this.UpperArmR = new ModelRenderer(this);
        this.UpperArmR.setRotationPoint(3.5F, 2.25F, -0.9F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, -0.0436F, -0.0436F, 0.6109F);


        this.LowerArmR = new ModelRenderer(this);
        this.LowerArmR.setRotationPoint(2.6466F, 0.1384F, -0.9439F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, -1.1405F, 1.2249F, -0.123F);


        this.HandR = new ModelRenderer(this);
        this.HandR.setRotationPoint(1.75F, 0.5F, -0.3F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 2.7822F, -1.5145F, -2.6566F);


        this.UpperArmR2 = new ModelRenderer(this);
        this.UpperArmR2.setRotationPoint(-3.5F, 2.25F, -0.9F);
        this.Chest.addChild(UpperArmR2);
        this.setRotateAngle(UpperArmR2, 0.0F, 1.2217F, -0.6109F);


        this.LowerArmR2 = new ModelRenderer(this);
        this.LowerArmR2.setRotationPoint(-2.6466F, 0.1384F, -0.9439F);
        this.UpperArmR2.addChild(LowerArmR2);
        this.setRotateAngle(LowerArmR2, 0.2618F, -1.3963F, -1.2217F);


        this.HandR2 = new ModelRenderer(this);
        this.HandR2.setRotationPoint(-1.75F, 0.5F, -0.3F);
        this.LowerArmR2.addChild(HandR2);
        this.setRotateAngle(HandR2, -0.1738F, 0.7346F, -0.4035F);

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
