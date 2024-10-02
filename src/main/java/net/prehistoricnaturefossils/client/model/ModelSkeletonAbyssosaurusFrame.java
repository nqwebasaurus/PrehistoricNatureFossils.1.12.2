package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAbyssosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
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
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
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
    private final ModelRenderer Neck6;
    private final ModelRenderer Neck7;
    private final ModelRenderer cube_r14;
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

    public ModelSkeletonAbyssosaurusFrame() {
        this.textureWidth = 85;
        this.textureHeight = 85;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -17.1543F, 2.952F);
        this.fossil.addChild(Hips);
        this.setRotateAngle(Hips, 0.6429F, 0.1321F, -0.1741F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -2.0F, 3.7F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 33, -1.0F, 0.7978F, -0.115F, 1, 1, 8, 0.0F, false));

        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.6962F, 11.3425F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, -0.2172F, -0.101F, 0.1551F);
        this.Tail.cubeList.add(new ModelBox(Tail, 34, 45, -0.5F, 0.5197F, 0.0363F, 1, 1, 6, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 4.5197F, 2.3363F);
        this.Tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.5708F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 40, -0.5F, -0.5F, -5.5F, 1, 1, 11, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0197F, 2.3363F);
        this.Tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.5708F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 48, -0.5F, -0.5F, 0.5F, 1, 1, 3, -0.1F, false));

        this.BackFlipperR2 = new ModelRenderer(this);
        this.BackFlipperR2.setRotationPoint(5.4F, 4.7082F, 2.09F);
        this.Tail.addChild(BackFlipperR2);
        this.setRotateAngle(BackFlipperR2, 0.2849F, -0.3618F, 0.5453F);


        this.BackFlipperMiddleR2 = new ModelRenderer(this);
        this.BackFlipperMiddleR2.setRotationPoint(6.5092F, 0.0209F, 1.0724F);
        this.BackFlipperR2.addChild(BackFlipperMiddleR2);
        this.setRotateAngle(BackFlipperMiddleR2, 0.1061F, -0.324F, -0.3228F);


        this.BackFlipperEndR2 = new ModelRenderer(this);
        this.BackFlipperEndR2.setRotationPoint(-1.415F, -0.4473F, -17.069F);
        this.BackFlipperMiddleR2.addChild(BackFlipperEndR2);
        this.setRotateAngle(BackFlipperEndR2, 0.0F, -0.1309F, 0.0F);


        this.BackFlipperR3 = new ModelRenderer(this);
        this.BackFlipperR3.setRotationPoint(-5.4F, 4.7082F, 2.09F);
        this.Tail.addChild(BackFlipperR3);
        this.setRotateAngle(BackFlipperR3, 0.301F, 0.4375F, -0.7182F);


        this.BackFlipperMiddleR3 = new ModelRenderer(this);
        this.BackFlipperMiddleR3.setRotationPoint(-6.5092F, 0.0209F, 1.0724F);
        this.BackFlipperR3.addChild(BackFlipperMiddleR3);
        this.setRotateAngle(BackFlipperMiddleR3, 0.1205F, 0.3191F, 0.3685F);


        this.BackFlipperEndR3 = new ModelRenderer(this);
        this.BackFlipperEndR3.setRotationPoint(1.415F, -0.4473F, -17.069F);
        this.BackFlipperMiddleR3.addChild(BackFlipperEndR3);
        this.setRotateAngle(BackFlipperEndR3, 0.0F, 0.1309F, 0.0F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1916F, 6.0976F);
        this.Tail.addChild(tail3);
        this.setRotateAngle(tail3, 0.0715F, -0.2176F, -0.0155F);
        this.tail3.cubeList.add(new ModelBox(tail3, 10, 47, -0.5F, 0.4887F, -0.7726F, 1, 1, 7, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1882F, 5.8814F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0354F, 0.1744F, 0.0062F);
        this.tail4.cubeList.add(new ModelBox(tail4, 46, 0, -0.5F, 0.1741F, -0.035F, 1, 1, 6, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0993F, 5.8479F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0181F, 0.2618F, 0.0047F);
        this.tail5.cubeList.add(new ModelBox(tail5, 26, 48, -0.5F, -0.0094F, -0.1604F, 1, 1, 5, -0.15F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.8212F, 3.6925F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, -0.049F, 0.0375F, -0.1328F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.8F, -8.0F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 45, -0.5F, 0.8795F, -5.9815F, 1, 1, 6, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.5F, -7.0F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 23, -0.5F, 0.65F, -1.0F, 1, 1, 8, 0.0F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -13.8F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, -0.1333F, 0.0221F, -0.2472F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.5F, -4.7F);
        this.Chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, -1, 24, -0.5F, -0.2784F, -3.7094F, 1, 1, 4, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 4.5529F, -3.3342F);
        this.Chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.5708F, 0.1745F, -1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 42, -1.6F, -0.5F, -6.5F, 1, 1, 13, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.5985F, -3.8552F);
        this.Chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.7453F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 51, -0.5F, -0.5F, -4.5F, 1, 1, 4, -0.1F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.Chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 46, 50, -0.5F, 0.7F, -4.9F, 1, 1, 5, 0.0F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 1.2F, -7.7F);
        this.Chest.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2734F, 0.1338F, -0.1727F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.Neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0349F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 35, -1.5F, 0.4F, -6.1F, 1, 1, 8, -0.15F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 0.25F, -7.9F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.3713F, 0.2435F, -0.1391F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 0.3F, -4.1F);
        this.Neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0698F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 14, 14, -1.6F, -0.3F, -6.3F, 1, 1, 11, -0.15F, false));

        this.Neck4 = new ModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, -0.55F, -10.0F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, -0.3317F, 0.2513F, 0.098F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 0.4197F, -0.1042F);
        this.Neck4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, -1, 24, -1.5F, -0.2F, -9.6F, 1, 1, 10, -0.15F, false));

        this.Neck5 = new ModelRenderer(this);
        this.Neck5.setRotationPoint(0.0F, -0.6303F, -9.1042F);
        this.Neck4.addChild(Neck5);
        this.setRotateAngle(Neck5, -0.3601F, 0.2428F, 0.0464F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 0.7F, 0.0F);
        this.Neck5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0698F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 12, -1.5F, -0.3F, -10.7F, 1, 1, 11, -0.15F, false));

        this.Neck6 = new ModelRenderer(this);
        this.Neck6.setRotationPoint(0.0F, -0.3F, -11.0F);
        this.Neck5.addChild(Neck6);
        this.setRotateAngle(Neck6, 0.255F, 0.3345F, 0.2326F);
        this.Neck6.cubeList.add(new ModelBox(Neck6, 28, 12, -0.5F, 0.0F, -8.4F, 1, 1, 9, -0.15F, false));

        this.Neck7 = new ModelRenderer(this);
        this.Neck7.setRotationPoint(0.0F, -0.1952F, -8.8025F);
        this.Neck6.addChild(Neck7);
        this.setRotateAngle(Neck7, 0.2436F, 0.325F, 0.1304F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Neck7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.0175F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 26, -0.6F, 0.2F, -9.3F, 1, 1, 10, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.5F, -0.2F, -8.8F);
        this.Neck7.addChild(Head);
        this.setRotateAngle(Head, 0.1242F, 0.3421F, 0.0691F);


        this.snout = new ModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 1.1557F, -2.9796F);
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
        this.Jaw.setRotationPoint(-0.5F, 1.9557F, -0.0296F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.6109F, 0.0F, 0.0F);


        this.FrontFlipperR2 = new ModelRenderer(this);
        this.FrontFlipperR2.setRotationPoint(6.5F, 5.5806F, -3.22F);
        this.Chest.addChild(FrontFlipperR2);
        this.setRotateAngle(FrontFlipperR2, 0.2112F, 0.1903F, -0.7811F);


        this.FrontFlipperMiddleR2 = new ModelRenderer(this);
        this.FrontFlipperMiddleR2.setRotationPoint(4.2723F, -0.2839F, -0.6396F);
        this.FrontFlipperR2.addChild(FrontFlipperMiddleR2);
        this.setRotateAngle(FrontFlipperMiddleR2, 0.0149F, 0.041F, 0.3494F);


        this.FrontFlipperEndR2 = new ModelRenderer(this);
        this.FrontFlipperEndR2.setRotationPoint(3.9888F, -4.0F, -18.8073F);
        this.FrontFlipperMiddleR2.addChild(FrontFlipperEndR2);
        this.setRotateAngle(FrontFlipperEndR2, 0.0F, -0.1309F, 0.0F);


        this.FrontFlipperR3 = new ModelRenderer(this);
        this.FrontFlipperR3.setRotationPoint(-6.5F, 5.5806F, -3.22F);
        this.Chest.addChild(FrontFlipperR3);
        this.setRotateAngle(FrontFlipperR3, 0.456F, -0.2552F, 0.8548F);


        this.FrontFlipperMiddleR3 = new ModelRenderer(this);
        this.FrontFlipperMiddleR3.setRotationPoint(-4.2723F, -0.2839F, -0.6396F);
        this.FrontFlipperR3.addChild(FrontFlipperMiddleR3);
        this.setRotateAngle(FrontFlipperMiddleR3, 0.0167F, -0.0403F, -0.393F);


        this.FrontFlipperEndR3 = new ModelRenderer(this);
        this.FrontFlipperEndR3.setRotationPoint(-3.9888F, -4.0F, -18.8073F);
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
