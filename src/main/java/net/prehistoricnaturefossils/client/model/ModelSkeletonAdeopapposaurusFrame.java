package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAdeopapposaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Root;
    private final ModelRenderer Hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Body;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r5;
    private final ModelRenderer arm2;
    private final ModelRenderer forearm2;
    private final ModelRenderer hand2;
    private final ModelRenderer arm3;
    private final ModelRenderer forearm3;
    private final ModelRenderer hand3;
    private final ModelRenderer Neck;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Head;
    private final ModelRenderer lips;
    private final ModelRenderer lips2;
    private final ModelRenderer nose;
    private final ModelRenderer teeth2;
    private final ModelRenderer teeth3;
    private final ModelRenderer Jaw;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Tail4;
    private final ModelRenderer UpperLegR2;
    private final ModelRenderer LowerLegR2;
    private final ModelRenderer FootR2;
    private final ModelRenderer ToesR2;
    private final ModelRenderer UpperLegR3;
    private final ModelRenderer LowerLegR3;
    private final ModelRenderer FootR3;
    private final ModelRenderer ToesR3;

    public ModelSkeletonAdeopapposaurusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 67, 46, -0.5F, -18.3F, 1.7F, 1, 19, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -8.8F, 2.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 64, 46, -8.5F, -3.5F, -0.5F, 1, 7, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.1F, -10.5F, -11.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 67, 46, -2.4F, -5.0F, -0.5F, 1, 10, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.1F, -10.5F, -11.6F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1309F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 67, 46, -0.5F, -7.1F, -0.5F, 1, 18, 1, -0.21F, false));

        this.Root = new ModelRenderer(this);
        this.Root.setRotationPoint(0.0F, -17.5F, 1.0F);
        this.fossil.addChild(Root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.Root.addChild(Hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5F, -3.3F);
        this.Hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 57, 56, -0.5F, 0.5F, -0.1F, 1, 1, 7, -0.2F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.6F, -3.4F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.0438F, 0.0872F, 0.0038F);
        this.Body.cubeList.add(new ModelBox(Body, 56, 55, -0.5F, 0.5636F, -7.669F, 1, 1, 8, -0.2F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.0393F, -7.8991F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0437F, 0.0436F, 0.0019F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.0204F, -6.9319F);
        this.Chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0173F, 0.0023F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 56, -0.6F, 0.5131F, -0.4009F, 1, 1, 8, -0.2F, false));

        this.arm2 = new ModelRenderer(this);
        this.arm2.setRotationPoint(4.5F, 6.1652F, -3.1168F);
        this.Chest.addChild(arm2);
        this.setRotateAngle(arm2, 0.7858F, 0.025F, 0.0357F);


        this.forearm2 = new ModelRenderer(this);
        this.forearm2.setRotationPoint(0.0048F, 4.5571F, -0.3199F);
        this.arm2.addChild(forearm2);
        this.setRotateAngle(forearm2, -0.9163F, 0.0F, 0.0F);


        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.0F, 4.2042F, -0.7344F);
        this.forearm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.0F, 0.0F, 0.4363F);


        this.arm3 = new ModelRenderer(this);
        this.arm3.setRotationPoint(-4.5F, 6.1652F, -3.1168F);
        this.Chest.addChild(arm3);
        this.setRotateAngle(arm3, 1.4418F, -0.2149F, -0.1433F);


        this.forearm3 = new ModelRenderer(this);
        this.forearm3.setRotationPoint(-0.0048F, 4.5571F, -0.3199F);
        this.arm3.addChild(forearm3);
        this.setRotateAngle(forearm3, -1.4399F, 0.0F, 0.0F);


        this.hand3 = new ModelRenderer(this);
        this.hand3.setRotationPoint(0.0F, 4.2042F, -0.7344F);
        this.forearm3.addChild(hand3);
        this.setRotateAngle(hand3, 0.0F, 0.0F, -0.48F);


        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.8909F, -6.7492F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.4199F, 0.2128F, 0.0466F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.396F, -4.7072F);
        this.Neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3142F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 60, 59, -0.5F, 0.7762F, 0.0337F, 1, 1, 5, -0.2F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 1.5324F, -4.4324F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.1354F, 0.1489F, 0.1057F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.9383F, -4.5572F);
        this.Neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 58, 58, -0.5F, 0.5F, -0.4F, 1, 1, 6, -0.2F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 1.8187F, -4.5232F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.3079F, 0.1248F, 0.0396F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0693F, -4.4938F);
        this.Neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 59, 59, -0.5F, 0.5F, -0.2F, 1, 1, 5, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.2307F, -4.4938F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.2447F, 0.1282F, -0.1473F);


        this.lips = new ModelRenderer(this);
        this.lips.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Head.addChild(lips);
        this.setRotateAngle(lips, 0.0349F, 0.0F, 0.0F);


        this.lips2 = new ModelRenderer(this);
        this.lips2.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.lips.addChild(lips2);
        this.setRotateAngle(lips2, -0.1309F, 0.0F, 0.0F);


        this.nose = new ModelRenderer(this);
        this.nose.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.lips2.addChild(nose);
        this.setRotateAngle(nose, 0.7854F, 0.0F, 0.0F);


        this.teeth2 = new ModelRenderer(this);
        this.teeth2.setRotationPoint(0.65F, 1.0F, -6.8F);
        this.Head.addChild(teeth2);
        this.setRotateAngle(teeth2, -0.1291F, 0.1139F, -0.0052F);


        this.teeth3 = new ModelRenderer(this);
        this.teeth3.setRotationPoint(-0.65F, 1.0F, -6.8F);
        this.Head.addChild(teeth3);
        this.setRotateAngle(teeth3, -0.1291F, -0.1139F, 0.0052F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.3927F, 0.0F, 0.0F);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.3F, 3.5F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, -0.0873F, 0.0435F, -0.0038F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.1383F, 0.0239F);
        this.Tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 54, 53, -0.5F, 0.5F, -0.2F, 1, 1, 10, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.9314F, 9.68F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0876F, 0.0869F, -0.0076F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.0902F, -0.0117F);
        this.Tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0175F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 52, 50, -0.5F, 0.6F, -0.3F, 1, 1, 13, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.1563F, 12.8863F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.088F, -0.1304F, -0.0115F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.4147F, 0.0474F);
        this.Tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0262F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 51, 50, -0.5F, 0.9F, -0.7F, 1, 1, 13, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.4981F, 11.9564F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0903F, -0.2608F, -0.0233F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 54, 51, -0.5F, 0.7F, -0.1F, 1, 1, 12, -0.2F, false));

        this.UpperLegR2 = new ModelRenderer(this);
        this.UpperLegR2.setRotationPoint(3.2F, 1.2F, 0.3F);
        this.Hips.addChild(UpperLegR2);
        this.setRotateAngle(UpperLegR2, -0.3054F, 0.0F, 0.0F);


        this.LowerLegR2 = new ModelRenderer(this);
        this.LowerLegR2.setRotationPoint(-0.1F, 7.5454F, -0.0108F);
        this.UpperLegR2.addChild(LowerLegR2);
        this.setRotateAngle(LowerLegR2, 1.1345F, 0.0F, 0.0F);


        this.FootR2 = new ModelRenderer(this);
        this.FootR2.setRotationPoint(0.0F, 6.6971F, 1.1162F);
        this.LowerLegR2.addChild(FootR2);
        this.setRotateAngle(FootR2, -0.6981F, 0.0F, 0.0F);


        this.ToesR2 = new ModelRenderer(this);
        this.ToesR2.setRotationPoint(0.0F, 5.0163F, -0.5822F);
        this.FootR2.addChild(ToesR2);


        this.UpperLegR3 = new ModelRenderer(this);
        this.UpperLegR3.setRotationPoint(-3.2F, 1.2F, 0.3F);
        this.Hips.addChild(UpperLegR3);
        this.setRotateAngle(UpperLegR3, -0.6545F, 0.0F, 0.0F);


        this.LowerLegR3 = new ModelRenderer(this);
        this.LowerLegR3.setRotationPoint(0.1F, 7.5454F, -0.0108F);
        this.UpperLegR3.addChild(LowerLegR3);
        this.setRotateAngle(LowerLegR3, 1.0036F, 0.0F, 0.0F);


        this.FootR3 = new ModelRenderer(this);
        this.FootR3.setRotationPoint(0.0F, 6.6971F, 1.1162F);
        this.LowerLegR3.addChild(FootR3);
        this.setRotateAngle(FootR3, -0.7418F, 0.0F, 0.0F);


        this.ToesR3 = new ModelRenderer(this);
        this.ToesR3.setRotationPoint(0.0F, 5.0163F, -0.5822F);
        this.FootR3.addChild(ToesR3);
        this.setRotateAngle(ToesR3, 0.3927F, 0.0F, 0.0F);

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
