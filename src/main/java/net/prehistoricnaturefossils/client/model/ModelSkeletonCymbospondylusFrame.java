package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCymbospondylusFrame extends ModelBase {
    private final ModelRenderer Chest;
    private final ModelRenderer Body;
    private final ModelRenderer Chest2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Neck;
    private final ModelRenderer cube_r3;
    private final ModelRenderer FrontFinR2;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer LowerSnout;
    private final ModelRenderer LowerSnout2;
    private final ModelRenderer LowerTeetj;
    private final ModelRenderer Snout;
    private final ModelRenderer Snout2;
    private final ModelRenderer UpperTeeth;
    private final ModelRenderer FrontFinR;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Hips;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer BackFinR;
    private final ModelRenderer BackFinR2;
    private final ModelRenderer Tail;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tail5;
    private final ModelRenderer Tail6;

    public ModelSkeletonCymbospondylusFrame() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 4.0F, 0.0F);


        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.Chest.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -1.0F, -0.8F, -11.0F, 2, 2, 24, -0.2F, false));

        this.Chest2 = new ModelRenderer(this);
        this.Chest2.setRotationPoint(1.9F, -0.8F, -10.1F);
        this.Body.addChild(Chest2);
        this.setRotateAngle(Chest2, 0.0361F, -0.2616F, -0.0094F);
        this.Chest2.cubeList.add(new ModelBox(Chest2, 1, 28, -2.9F, -0.0282F, -19.589F, 2, 2, 20, -0.2F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.9F, 12.1718F, -16.689F);
        this.Chest2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.309F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 28, -1.95F, -1.0F, -10.0F, 2, 2, 20, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.9F, 12.1718F, -16.689F);
        this.Chest2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.5708F, -0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 35, -1.2F, -1.0F, -10.95F, 2, 2, 12, -0.21F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(-1.9F, 3.1718F, -17.889F);
        this.Chest2.addChild(Neck);
        this.setRotateAngle(Neck, 0.0F, -0.3054F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.3F, -11.9F);
        this.Neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 76, -1.0F, 0.1F, -0.1F, 2, 2, 11, -0.2F, false));

        this.FrontFinR2 = new ModelRenderer(this);
        this.FrontFinR2.setRotationPoint(-8.2F, 8.6F, 1.0F);
        this.Neck.addChild(FrontFinR2);
        this.setRotateAngle(FrontFinR2, 0.4499F, 0.3498F, -0.649F);


        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.0F, -0.1745F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.0F, -11.0F);
        this.Neck2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 76, 32, -1.0F, 0.0F, -1.4F, 2, 2, 11, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Neck2.addChild(Head);
        this.setRotateAngle(Head, -0.3054F, -0.3927F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 3.0F, -2.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.7854F, 0.0F, 0.0F);


        this.LowerSnout = new ModelRenderer(this);
        this.LowerSnout.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Jaw.addChild(LowerSnout);
        this.setRotateAngle(LowerSnout, 0.0175F, 0.0F, 0.0F);


        this.LowerSnout2 = new ModelRenderer(this);
        this.LowerSnout2.setRotationPoint(0.0F, 0.0F, -6.9F);
        this.LowerSnout.addChild(LowerSnout2);
        this.setRotateAngle(LowerSnout2, 0.0175F, 0.0F, 0.0F);


        this.LowerTeetj = new ModelRenderer(this);
        this.LowerTeetj.setRotationPoint(0.0F, 0.0F, -7.6F);
        this.LowerSnout2.addChild(LowerTeetj);
        this.setRotateAngle(LowerTeetj, -0.0262F, 0.0F, 0.0F);


        this.Snout = new ModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.Head.addChild(Snout);
        this.setRotateAngle(Snout, 0.0175F, 0.0F, 0.0F);


        this.Snout2 = new ModelRenderer(this);
        this.Snout2.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.Snout.addChild(Snout2);
        this.setRotateAngle(Snout2, 0.0175F, 0.0F, 0.0F);


        this.UpperTeeth = new ModelRenderer(this);
        this.UpperTeeth.setRotationPoint(0.0F, 3.0F, -7.5F);
        this.Snout2.addChild(UpperTeeth);
        this.setRotateAngle(UpperTeeth, 0.0087F, 0.0F, 0.0F);


        this.FrontFinR = new ModelRenderer(this);
        this.FrontFinR.setRotationPoint(8.2F, 8.6F, 1.0F);
        this.Neck.addChild(FrontFinR);
        this.setRotateAngle(FrontFinR, 0.4638F, -0.3305F, 0.6074F);


        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, 0.0F, 0.2182F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 35, -1.4F, 0.0F, 1.3F, 2, 2, 16, -0.2F, false));

        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 2.0F, 19.0F);
        this.Body2.addChild(Hips);
        this.setRotateAngle(Hips, 0.0F, 0.2618F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.6059F, 4.5893F);
        this.Hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.5708F, -0.0262F, -1.5708F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 61, -6.1F, -1.0F, -5.5F, 2, 2, 11, -0.2F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.6426F, 5.9888F);
        this.Hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.597F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 67, -1.0F, 0.4F, -0.5F, 2, 2, 5, -0.21F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.Hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 55, -1.0F, 1.2F, 0.0F, 2, 2, 17, -0.2F, false));

        this.BackFinR = new ModelRenderer(this);
        this.BackFinR.setRotationPoint(4.0F, 5.5F, 4.0F);
        this.Hips.addChild(BackFinR);
        this.setRotateAngle(BackFinR, 0.4363F, -0.6109F, 1.0472F);


        this.BackFinR2 = new ModelRenderer(this);
        this.BackFinR2.setRotationPoint(-4.0F, 5.5F, 4.0F);
        this.Hips.addChild(BackFinR2);
        this.setRotateAngle(BackFinR2, 0.4363F, 0.6109F, -1.0472F);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 2.0F, 14.0F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, -0.0457F, 0.3051F, -0.0138F);
        this.Tail.cubeList.add(new ModelBox(Tail, 29, 0, -1.0F, 0.0F, 0.0F, 2, 2, 20, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 19.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0F, 0.1309F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 56, 2, -1.0F, 0.0F, 0.0F, 2, 2, 15, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0179F, -0.2181F, -0.0039F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 53, 36, -1.0F, -0.0002F, -0.0175F, 2, 2, 18, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.1998F, 17.9825F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.5585F, -0.3378F, 0.2042F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 51, -1.0F, 0.0928F, -0.466F, 2, 2, 18, -0.2F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.3928F, 17.034F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.1415F, -0.3892F, -0.054F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 48, 66, -0.5F, 0.4236F, -0.6654F, 1, 1, 16, -0.2F, false));

        this.Tail6 = new ModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 0.0236F, 14.3346F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, 0.1372F, -0.3027F, -0.0411F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 76, 0, -0.5F, 0.4897F, -0.1566F, 1, 1, 12, -0.2F, false));

    }

    public void renderAll(float f) {
        this.Chest.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
