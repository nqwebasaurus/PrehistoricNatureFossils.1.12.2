package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTetraceratopsFrame extends ModelBase {
    private final ModelRenderer Tetraceratops;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer LFrontLeg2;
    private final ModelRenderer LowerLFrontLeg2;
    private final ModelRenderer LFrontFoot2;
    private final ModelRenderer LFrontLeg;
    private final ModelRenderer LowerLFrontLeg;
    private final ModelRenderer LFrontFoot;
    private final ModelRenderer Neck1;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Head;
    private final ModelRenderer Mandible;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r9;
    private final ModelRenderer LBackLeg;
    private final ModelRenderer LowerLBackLeg;
    private final ModelRenderer LBackFoot;
    private final ModelRenderer LBackLeg2;
    private final ModelRenderer LowerLBackLeg2;
    private final ModelRenderer LBackFoot2;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Tail4;
    private final ModelRenderer cube_r12;

    public ModelSkeletonTetraceratopsFrame() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.Tetraceratops = new ModelRenderer(this);
        this.Tetraceratops.setRotationPoint(0.0F, 8.8F, 3.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.1F, 9.2F, 12.5F);
        this.Tetraceratops.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 4.9F, -3.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tetraceratops.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.2F, 3.2F, 12.0F, 1, 12, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.1F, 8.55F, -6.575F);
        this.Tetraceratops.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 3.7F, -6.3F, -0.5F, 1, 11, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(4.5863F, 9.0797F, 8.9732F);
        this.Tetraceratops.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -7.4642F, -6.8297F, -14.8818F, 1, 13, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 4.4F, -14.0F);
        this.Tetraceratops.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.55F, -3.9F, 12.45F, 1, 1, 11, 0.002F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.4F, -1.4F);
        this.Tetraceratops.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.1745F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.1321F, -9.7389F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.096F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 15, -0.5F, 1.2399F, -0.0052F, 1, 1, 10, 0.0F, false));

        this.LFrontLeg2 = new ModelRenderer(this);
        this.LFrontLeg2.setRotationPoint(-5.0F, 4.5F, -5.6F);
        this.chest.addChild(LFrontLeg2);
        this.setRotateAngle(LFrontLeg2, 0.9599F, 0.0F, 0.0F);


        this.LowerLFrontLeg2 = new ModelRenderer(this);
        this.LowerLFrontLeg2.setRotationPoint(-3.75F, 3.0F, 2.25F);
        this.LFrontLeg2.addChild(LowerLFrontLeg2);
        this.setRotateAngle(LowerLFrontLeg2, -1.2217F, 0.0F, 0.0F);


        this.LFrontFoot2 = new ModelRenderer(this);
        this.LFrontFoot2.setRotationPoint(-2.05F, 6.0F, -1.25F);
        this.LowerLFrontLeg2.addChild(LFrontFoot2);
        this.setRotateAngle(LFrontFoot2, 1.0094F, 0.029F, -0.5303F);


        this.LFrontLeg = new ModelRenderer(this);
        this.LFrontLeg.setRotationPoint(5.0F, 4.5F, -5.6F);
        this.chest.addChild(LFrontLeg);
        this.setRotateAngle(LFrontLeg, 0.0F, 0.0F, 0.0F);


        this.LowerLFrontLeg = new ModelRenderer(this);
        this.LowerLFrontLeg.setRotationPoint(3.75F, 3.0F, 2.25F);
        this.LFrontLeg.addChild(LowerLFrontLeg);


        this.LFrontFoot = new ModelRenderer(this);
        this.LFrontFoot.setRotationPoint(1.75F, 6.0F, -1.25F);
        this.LowerLFrontLeg.addChild(LFrontFoot);


        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 1.5F, -9.3F);
        this.chest.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.0F, -0.3927F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.9F, -3.3F);
        this.Neck1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 48, -0.65F, -2.3F, 1.0F, 1, 1, 2, 0.002F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.0F, -1.6F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.0F, -0.4363F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.3F, 0.1F);
        this.Neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 58, -0.9075F, 1.0348F, -2.827F, 1, 1, 3, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.2F, -1.7F);
        this.Neck2.addChild(Head);
        this.setRotateAngle(Head, -0.5958F, -0.2926F, 0.1931F);


        this.Mandible = new ModelRenderer(this);
        this.Mandible.setRotationPoint(0.0F, 2.3F, -0.1F);
        this.Head.addChild(Mandible);
        this.setRotateAngle(Mandible, 0.7418F, 0.0F, 0.0F);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.4F, 10.0F);
        this.Tetraceratops.addChild(Tail);
        this.setRotateAngle(Tail, 0.0F, 0.1745F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 7.5F, -23.0F);
        this.Tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 32, -0.5F, -12.85F, 19.5F, 1, 1, 6, 0.0F, false));

        this.LBackLeg = new ModelRenderer(this);
        this.LBackLeg.setRotationPoint(3.0F, 2.45F, 2.75F);
        this.Tail.addChild(LBackLeg);


        this.LowerLBackLeg = new ModelRenderer(this);
        this.LowerLBackLeg.setRotationPoint(4.7F, 6.0F, -1.9F);
        this.LBackLeg.addChild(LowerLBackLeg);


        this.LBackFoot = new ModelRenderer(this);
        this.LBackFoot.setRotationPoint(0.2F, 4.25F, 1.7F);
        this.LowerLBackLeg.addChild(LBackFoot);


        this.LBackLeg2 = new ModelRenderer(this);
        this.LBackLeg2.setRotationPoint(-3.0F, 2.45F, 2.75F);
        this.Tail.addChild(LBackLeg2);


        this.LowerLBackLeg2 = new ModelRenderer(this);
        this.LowerLBackLeg2.setRotationPoint(-4.7F, 6.0F, -1.9F);
        this.LBackLeg2.addChild(LowerLBackLeg2);


        this.LBackFoot2 = new ModelRenderer(this);
        this.LBackFoot2.setRotationPoint(-0.2F, 4.25F, 1.7F);
        this.LowerLBackLeg2.addChild(LBackFoot2);


        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 2.3F, 6.2F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0915F, 0.3042F, -0.0275F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.4F, 0.9382F, -1.1696F);
        this.Tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3843F, -0.0395F, 0.0184F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 42, -0.7F, -0.2998F, 0.0749F, 1, 1, 6, -0.002F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 2.4761F, 4.9466F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1922F, 0.4293F, -0.0808F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.1F, 1.6993F, -0.2657F);
        this.Tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2096F, -0.0426F, 0.0094F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 45, -0.5F, -1.106F, -0.3664F, 1, 1, 6, 0.0F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 1.1296F, 5.4332F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1806F, -0.2577F, 0.0465F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(6.5678F, 6.4772F, -11.1586F);
        this.Tail4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 56, -7.1678F, -3.2327F, 12.266F, 1, 1, 4, 0.002F, false));

    }

    public void renderAll(float f) {
        this.Tetraceratops.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
