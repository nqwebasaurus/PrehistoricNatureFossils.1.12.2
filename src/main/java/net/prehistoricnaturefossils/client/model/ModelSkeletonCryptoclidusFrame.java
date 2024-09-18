package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCryptoclidusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Tail;
    private final ModelRenderer BackFlipperR2;
    private final ModelRenderer BackFlipperMiddleR2;
    private final ModelRenderer BackFlipperEndR2;
    private final ModelRenderer BackFlipperR3;
    private final ModelRenderer BackFlipperMiddleR3;
    private final ModelRenderer BackFlipperEndR3;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Neck4;
    private final ModelRenderer cube_r12;
    private final ModelRenderer Neck5;
    private final ModelRenderer cube_r13;
    private final ModelRenderer Head;
    private final ModelRenderer snout;
    private final ModelRenderer snout2;
    private final ModelRenderer forehead;
    private final ModelRenderer forehead2;
    private final ModelRenderer Jaw;
    private final ModelRenderer FrontFlipperR2;
    private final ModelRenderer FrontFlipperMiddleR2;
    private final ModelRenderer FrontFlipperEndR2;
    private final ModelRenderer FrontFlipperR3;
    private final ModelRenderer FrontFlipperMiddleR3;
    private final ModelRenderer FrontFlipperEndR3;

    public ModelSkeletonCryptoclidusFrame() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -21.1543F, 11.952F);
        this.fossil.addChild(Hips);
        this.setRotateAngle(Hips, 0.0839F, -0.009F, 0.3042F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.8572F, 4.8292F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5708F, -0.1309F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, -3, 23, -1.4F, -0.5F, -5.0F, 1, 1, 10, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -2.0F, -2.3F);
        this.Hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.7017F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 4, 30, -1.0F, -8.2022F, 1.685F, 1, 1, 3, -0.004F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -2.0F, -2.3F);
        this.Hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 26, -1.0F, 0.7978F, -0.115F, 1, 1, 7, 0.0F, false));

        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.7962F, 4.4425F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, -0.2007F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 46, 23, -0.5F, 0.5231F, 0.0165F, 1, 1, 5, 0.0F, false));

        this.BackFlipperR2 = new ModelRenderer(this);
        this.BackFlipperR2.setRotationPoint(5.4F, 4.7116F, 1.0702F);
        this.Tail.addChild(BackFlipperR2);
        this.setRotateAngle(BackFlipperR2, 0.1245F, -0.237F, 0.5164F);


        this.BackFlipperMiddleR2 = new ModelRenderer(this);
        this.BackFlipperMiddleR2.setRotationPoint(3.9029F, 0.0189F, 0.7426F);
        this.BackFlipperR2.addChild(BackFlipperMiddleR2);
        this.setRotateAngle(BackFlipperMiddleR2, -0.1201F, -0.2815F, 0.4097F);


        this.BackFlipperEndR2 = new ModelRenderer(this);
        this.BackFlipperEndR2.setRotationPoint(6.6407F, 0.0F, -0.9261F);
        this.BackFlipperMiddleR2.addChild(BackFlipperEndR2);
        this.setRotateAngle(BackFlipperEndR2, 0.0F, -0.1309F, 0.0F);


        this.BackFlipperR3 = new ModelRenderer(this);
        this.BackFlipperR3.setRotationPoint(-5.4F, 4.7116F, 1.0702F);
        this.Tail.addChild(BackFlipperR3);
        this.setRotateAngle(BackFlipperR3, 0.1245F, 0.237F, -0.5164F);


        this.BackFlipperMiddleR3 = new ModelRenderer(this);
        this.BackFlipperMiddleR3.setRotationPoint(-3.9029F, 0.0189F, 0.7426F);
        this.BackFlipperR3.addChild(BackFlipperMiddleR3);
        this.setRotateAngle(BackFlipperMiddleR3, -0.1446F, 0.27F, -0.4996F);


        this.BackFlipperEndR3 = new ModelRenderer(this);
        this.BackFlipperEndR3.setRotationPoint(-6.6407F, 0.0F, -0.9261F);
        this.BackFlipperMiddleR3.addChild(BackFlipperEndR3);
        this.setRotateAngle(BackFlipperEndR3, 0.0F, 0.1309F, 0.0F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0769F, 4.8165F);
        this.Tail.addChild(tail3);
        this.setRotateAngle(tail3, 0.0732F, -0.3047F, -0.022F);
        this.tail3.cubeList.add(new ModelBox(tail3, 28, 41, -0.5F, 0.2958F, 0.0959F, 1, 1, 6, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1542F, 6.0959F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0371F, -0.3488F, -0.0127F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 35, -0.5F, 0.3253F, -0.2897F, 1, 1, 6, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.2253F, 5.8103F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0183F, -0.3054F, -0.0055F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 45, -0.5F, 0.0173F, -0.4798F, 1, 1, 5, -0.15F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.8212F, -2.3075F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.0F, -0.1309F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 3.0663F, -14.3616F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.5708F, -0.1047F, 1.5708F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 20, 2.2F, -0.5F, -7.0F, 1, 1, 14, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.8F, -6.1F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.6755F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 30, -0.5F, -9.1205F, -5.5815F, 1, 1, 4, -0.004F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.8F, -8.0F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 28, -0.5F, 0.8795F, -5.9815F, 1, 1, 6, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.5F, -7.0F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 23, -0.5F, 0.65F, -1.0F, 1, 1, 8, 0.0F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -13.8F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0F, -0.0436F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.5F, -4.7F);
        this.Chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 11, -0.5F, -0.2784F, -3.2094F, 1, 1, 4, -0.15F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.Chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 46, 41, -0.5F, 0.7F, -4.9F, 1, 1, 5, 0.0F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 1.0F, -7.7F);
        this.Chest.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.0F, -0.2618F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.Neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0349F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 43, -1.5F, 0.4F, -5.8F, 1, 1, 6, -0.15F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 0.35F, -5.9F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.0F, -0.3054F, 0.0873F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 0.5F, -0.1F);
        this.Neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0698F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 41, -1.5F, -0.3F, -6.4F, 1, 1, 7, -0.15F, false));

        this.Neck4 = new ModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, -0.45F, -6.0F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, -0.0541F, -0.2592F, 0.0576F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 0.581F, -0.0738F);
        this.Neck4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 12, -1.5F, -0.3F, -9.0F, 1, 1, 9, -0.15F, false));

        this.Neck5 = new ModelRenderer(this);
        this.Neck5.setRotationPoint(0.0F, -0.469F, -8.8738F);
        this.Neck4.addChild(Neck5);
        this.setRotateAngle(Neck5, 0.0F, -0.2182F, 0.0873F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 0.7F, -0.2F);
        this.Neck5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0698F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 12, -1.5F, -0.4F, -10.6F, 1, 1, 11, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -11.8F);
        this.Neck5.addChild(Head);
        this.setRotateAngle(Head, -0.0436F, 0.0F, 0.0F);


        this.snout = new ModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 0.5F, -1.95F);
        this.Head.addChild(snout);
        this.setRotateAngle(snout, 0.0436F, 0.0F, 0.0F);


        this.snout2 = new ModelRenderer(this);
        this.snout2.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.snout.addChild(snout2);
        this.setRotateAngle(snout2, -0.0873F, 0.0F, 0.0F);


        this.forehead = new ModelRenderer(this);
        this.forehead.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.snout2.addChild(forehead);
        this.setRotateAngle(forehead, 0.3578F, 0.0F, 0.0F);


        this.forehead2 = new ModelRenderer(this);
        this.forehead2.setRotationPoint(0.0F, -0.025F, 1.8F);
        this.forehead.addChild(forehead2);
        this.setRotateAngle(forehead2, -0.1876F, 0.0F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(-0.5F, 0.3F, 1.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.3927F, 0.0F, 0.0F);


        this.FrontFlipperR2 = new ModelRenderer(this);
        this.FrontFlipperR2.setRotationPoint(7.5F, 5.5806F, -0.52F);
        this.Chest.addChild(FrontFlipperR2);
        this.setRotateAngle(FrontFlipperR2, 0.1657F, 0.1698F, -0.5595F);


        this.FrontFlipperMiddleR2 = new ModelRenderer(this);
        this.FrontFlipperMiddleR2.setRotationPoint(3.9522F, -0.071F, -0.3716F);
        this.FrontFlipperR2.addChild(FrontFlipperMiddleR2);
        this.setRotateAngle(FrontFlipperMiddleR2, 0.0F, -0.1309F, 0.0F);


        this.FrontFlipperEndR2 = new ModelRenderer(this);
        this.FrontFlipperEndR2.setRotationPoint(5.3469F, 0.0F, -0.8308F);
        this.FrontFlipperMiddleR2.addChild(FrontFlipperEndR2);
        this.setRotateAngle(FrontFlipperEndR2, 0.0F, -0.1309F, 0.0F);


        this.FrontFlipperR3 = new ModelRenderer(this);
        this.FrontFlipperR3.setRotationPoint(-7.5F, 5.5806F, -0.52F);
        this.Chest.addChild(FrontFlipperR3);
        this.setRotateAngle(FrontFlipperR3, 0.1729F, -0.1625F, 0.5159F);


        this.FrontFlipperMiddleR3 = new ModelRenderer(this);
        this.FrontFlipperMiddleR3.setRotationPoint(-3.9522F, -0.071F, -0.3716F);
        this.FrontFlipperR3.addChild(FrontFlipperMiddleR3);
        this.setRotateAngle(FrontFlipperMiddleR3, 0.0F, 0.1309F, 0.0F);


        this.FrontFlipperEndR3 = new ModelRenderer(this);
        this.FrontFlipperEndR3.setRotationPoint(-5.3469F, 0.0F, -0.8308F);
        this.FrontFlipperMiddleR3.addChild(FrontFlipperEndR3);
        this.setRotateAngle(FrontFlipperEndR3, 0.0F, 0.1309F, 0.0F);

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
