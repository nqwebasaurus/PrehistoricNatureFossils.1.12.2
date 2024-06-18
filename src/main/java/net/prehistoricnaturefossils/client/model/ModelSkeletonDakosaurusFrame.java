package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDakosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Neck;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjaw;
    private final ModelRenderer Lowerjaw;
    private final ModelRenderer UpperArmL;
    private final ModelRenderer HandL;
    private final ModelRenderer UpperArmL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer Body2;
    private final ModelRenderer Body3;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Body4;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer UpperLegL;
    private final ModelRenderer LowerLegL;
    private final ModelRenderer FootL;
    private final ModelRenderer UpperLegL2;
    private final ModelRenderer LowerLegL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer Tail;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;

    public ModelSkeletonDakosaurusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(6.0F, -19.5F, -1.0F);
        this.fossil.addChild(Body);
        this.setRotateAngle(Body, -0.0381F, -0.1704F, -0.4767F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(3.635F, 0.6679F, -13.7546F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.5708F, -0.0873F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 43, 59, -1.4F, -1.0F, -5.5F, 1, 1, 11, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(3.635F, -2.3207F, -14.0161F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.6581F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 68, -0.5F, -0.9F, -2.5F, 1, 1, 2, -0.21F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(3.635F, -3.3567F, -16.5159F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 49, 65, -1.0F, 0.25F, -0.1F, 2, 2, 5, -0.2F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(3.635F, -3.1067F, -15.6659F);
        this.Body.addChild(Neck);
        this.setRotateAngle(Neck, -0.0596F, 0.5659F, -0.1791F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.25F, -7.25F);
        this.Neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 46, -1.0F, 0.0F, -1.0F, 2, 2, 9, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.05F, -7.35F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.2806F, 0.4148F, 0.0366F);


        this.Upperjaw = new ModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, 1.8F, -0.9F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, -0.0436F, 0.0F, 0.0F);


        this.Lowerjaw = new ModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 1.45F, 0.05F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.7418F, 0.0F, 0.0F);


        this.UpperArmL = new ModelRenderer(this);
        this.UpperArmL.setRotationPoint(8.635F, -0.2067F, -14.6659F);
        this.Body.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.5236F, 0.5672F, 0.0F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(-0.35F, -1.0F, 3.6F);
        this.UpperArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.1672F, -0.4394F, -0.0723F);


        this.UpperArmL2 = new ModelRenderer(this);
        this.UpperArmL2.setRotationPoint(-1.365F, -0.2067F, -14.6659F);
        this.Body.addChild(UpperArmL2);
        this.setRotateAngle(UpperArmL2, -0.5236F, -0.5672F, 0.0F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(0.35F, -1.0F, 3.6F);
        this.UpperArmL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 0.1672F, 0.4394F, 0.0723F);


        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(3.635F, -3.7567F, -11.5659F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, 0.0F, -0.2618F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 31, 31, -1.0F, 0.25F, -0.55F, 2, 2, 12, -0.2F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.1F, 10.5F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, 0.0154F, -0.1739F, -0.0886F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.1F, -0.1F);
        this.Body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 28, -1.0F, 0.0F, 0.0F, 2, 2, 13, -0.2F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.5F, 12.3F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, -0.0172F, 0.1298F, -0.132F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 3.1997F, 2.3184F);
        this.Body4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.5708F, -0.0873F, -1.5708F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 31, 0.5F, 0.1F, -3.5F, 1, 1, 7, -0.2F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.15F, -0.4F);
        this.Body4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 31, -1.0F, 0.1F, 0.0F, 2, 2, 7, -0.2F, false));

        this.UpperLegL = new ModelRenderer(this);
        this.UpperLegL.setRotationPoint(3.75F, 1.7F, 2.5F);
        this.Body4.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 0.6981F, 0.6109F, 0.0F);


        this.LowerLegL = new ModelRenderer(this);
        this.LowerLegL.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.6109F, -0.3491F, 0.0F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(-0.3F, 4.0F, 0.0F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.2571F, 0.1128F, 0.037F);


        this.UpperLegL2 = new ModelRenderer(this);
        this.UpperLegL2.setRotationPoint(-3.75F, 1.7F, 2.5F);
        this.Body4.addChild(UpperLegL2);
        this.setRotateAngle(UpperLegL2, 0.6981F, -0.6109F, 0.0F);


        this.LowerLegL2 = new ModelRenderer(this);
        this.LowerLegL2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.UpperLegL2.addChild(LowerLegL2);
        this.setRotateAngle(LowerLegL2, 0.6109F, 0.3491F, 0.0F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.3F, 4.0F, 0.0F);
        this.LowerLegL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.2571F, -0.1128F, -0.037F);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.Body4.addChild(Tail);
        this.setRotateAngle(Tail, -0.0385F, 0.436F, -0.0163F);
        this.Tail.cubeList.add(new ModelBox(Tail, 39, 0, -1.0F, 0.2498F, -0.3895F, 2, 2, 11, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.2998F, 10.3105F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0726F, 0.4314F, -0.2283F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 44, 14, -0.5F, -0.0272F, -0.6917F, 1, 2, 11, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0228F, 9.7083F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0813F, -0.3403F, -0.1916F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 19, 46, -0.5F, -0.0912F, -0.1431F, 1, 2, 10, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.1912F, 9.6069F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0504F, -0.523F, 0.0252F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 5.4391F, 6.0398F);
        this.Tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.192F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 61, -0.5F, 0.3841F, -0.1669F, 1, 1, 5, -0.2F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.3609F, 0.0398F);
        this.Tail4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6981F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 31, -0.5F, 1.8F, 1.5F, 1, 1, 8, -0.2F, false));

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
