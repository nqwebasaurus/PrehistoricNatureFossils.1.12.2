package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonProburnetiaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer proburnetia;
    private final ModelRenderer main;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer RBackLeg2;
    private final ModelRenderer LowerRBackLeg2;
    private final ModelRenderer RBackFoot2;
    private final ModelRenderer RBackLeg3;
    private final ModelRenderer LowerRBackLeg3;
    private final ModelRenderer RBackFoot3;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tail5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer Neck1;
    private final ModelRenderer RFrontLeg2;
    private final ModelRenderer LowerRFrontLeg2;
    private final ModelRenderer RFrontFoot2;
    private final ModelRenderer RFrontLeg3;
    private final ModelRenderer LowerRFrontLeg3;
    private final ModelRenderer RFrontFoot3;

    public ModelSkeletonProburnetiaFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.5F, 11.9F, 3.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -1.0F, 0.2F, 3.5F, 1, 12, 1, -0.13F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 5.5F, -12.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0698F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.8F, -4.5F, -0.5F, 1, 9, 1, -0.1F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 5.5F, -12.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.1309F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.5F, -6.0F, -0.5F, 1, 13, 1, -0.13F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 5.5F, 4.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 3.4F, -2.5F, -0.5F, 1, 5, 1, -0.1F, false));

        this.proburnetia = new ModelRenderer(this);
        this.proburnetia.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(proburnetia);


        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -1.3F, -6.0F);
        this.proburnetia.addChild(main);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.5769F, 7.2014F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2094F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 20, -0.5F, 0.2169F, -0.4056F, 1, 1, 6, -0.1F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.999F, 2.361F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0611F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, -0.6F, -5.0F, 1, 1, 10, -0.13F, false));

        this.RBackLeg2 = new ModelRenderer(this);
        this.RBackLeg2.setRotationPoint(2.0495F, 2.4065F, 10.066F);
        this.main.addChild(RBackLeg2);
        this.setRotateAngle(RBackLeg2, 0.3505F, -0.0227F, -0.1289F);


        this.LowerRBackLeg2 = new ModelRenderer(this);
        this.LowerRBackLeg2.setRotationPoint(1.5505F, 5.2435F, -2.016F);
        this.RBackLeg2.addChild(LowerRBackLeg2);
        this.setRotateAngle(LowerRBackLeg2, 0.4786F, 0.0021F, 0.1416F);


        this.RBackFoot2 = new ModelRenderer(this);
        this.RBackFoot2.setRotationPoint(0.5424F, 5.25F, 1.3487F);
        this.LowerRBackLeg2.addChild(RBackFoot2);
        this.setRotateAngle(RBackFoot2, -0.3491F, 0.0F, 0.0F);


        this.RBackLeg3 = new ModelRenderer(this);
        this.RBackLeg3.setRotationPoint(-3.0495F, 2.4065F, 10.066F);
        this.main.addChild(RBackLeg3);
        this.setRotateAngle(RBackLeg3, -0.1294F, 0.0227F, 0.1289F);


        this.LowerRBackLeg3 = new ModelRenderer(this);
        this.LowerRBackLeg3.setRotationPoint(-1.5505F, 5.2435F, -2.016F);
        this.RBackLeg3.addChild(LowerRBackLeg3);
        this.setRotateAngle(LowerRBackLeg3, 0.1745F, 0.0F, -0.1309F);


        this.RBackFoot3 = new ModelRenderer(this);
        this.RBackFoot3.setRotationPoint(-0.5424F, 5.25F, 1.3487F);
        this.LowerRBackLeg3.addChild(RBackFoot3);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(-0.5F, 1.5F, 12.7F);
        this.main.addChild(Tail);
        this.setRotateAngle(Tail, -0.2256F, -0.2555F, 0.0579F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.1801F, -3.9607F);
        this.Tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, -2, 39, -0.5F, 0.275F, 3.9F, 1, 1, 6, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.5F, 0.4699F, 4.7393F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.1806F, -0.2577F, 0.0465F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 25, 3, -0.9F, 0.2088F, 0.1096F, 1, 1, 7, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(-0.5F, -0.0102F, 7.1125F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1855F, -0.3435F, 0.0631F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.7774F, 3.0477F);
        this.Tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0218F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 36, -0.5F, -0.5F, -3.5F, 1, 1, 7, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.12F, 5.8531F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0819F, -0.504F, -0.1483F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 7, 41, -0.5F, 0.317F, -0.1206F, 1, 1, 5, -0.2F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, -0.033F, 4.8794F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.109F, -0.4721F, -0.0902F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 35, 0, -0.5F, 0.3076F, -0.5632F, 1, 1, 6, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.4F, -2.3F);
        this.main.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.1309F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.8762F, -8.8598F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1134F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 12, -0.5F, 0.5963F, 0.0957F, 1, 1, 9, -0.1F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(-0.5F, 1.15F, -8.7F);
        this.chest.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.0F, 0.2182F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.4F, -3.1F);
        this.Neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0698F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 8, -0.5F, 0.4648F, -1.1347F, 1, 1, 5, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.45F, -3.4F);
        this.Neck2.addChild(Head);
        this.setRotateAngle(Head, 0.2934F, 0.4623F, 0.1339F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.25F, -1.475F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.48F, 0.0F, 0.0F);


        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(-0.5F, 0.95F, -6.7F);
        this.chest.addChild(Neck1);


        this.RFrontLeg2 = new ModelRenderer(this);
        this.RFrontLeg2.setRotationPoint(3.8F, 6.0F, -3.8F);
        this.chest.addChild(RFrontLeg2);
        this.setRotateAngle(RFrontLeg2, 1.2217F, 0.0F, 0.0F);


        this.LowerRFrontLeg2 = new ModelRenderer(this);
        this.LowerRFrontLeg2.setRotationPoint(2.3F, 4.5358F, -0.0886F);
        this.RFrontLeg2.addChild(LowerRFrontLeg2);
        this.setRotateAngle(LowerRFrontLeg2, -1.1432F, 0.0F, 0.0F);


        this.RFrontFoot2 = new ModelRenderer(this);
        this.RFrontFoot2.setRotationPoint(-0.25F, 5.1171F, -1.2781F);
        this.LowerRFrontLeg2.addChild(RFrontFoot2);
        this.setRotateAngle(RFrontFoot2, -0.0873F, 0.0F, 0.0F);


        this.RFrontLeg3 = new ModelRenderer(this);
        this.RFrontLeg3.setRotationPoint(-4.8F, 6.0F, -3.8F);
        this.chest.addChild(RFrontLeg3);
        this.setRotateAngle(RFrontLeg3, -0.0436F, 0.0F, 0.0F);


        this.LowerRFrontLeg3 = new ModelRenderer(this);
        this.LowerRFrontLeg3.setRotationPoint(-2.3F, 4.5358F, -0.0886F);
        this.RFrontLeg3.addChild(LowerRFrontLeg3);
        this.setRotateAngle(LowerRFrontLeg3, -1.0123F, 0.0F, 0.0F);


        this.RFrontFoot3 = new ModelRenderer(this);
        this.RFrontFoot3.setRotationPoint(0.25F, 5.1171F, -1.2781F);
        this.LowerRFrontLeg3.addChild(RFrontFoot3);
        this.setRotateAngle(RFrontFoot3, 1.3963F, 0.0F, 0.0F);

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
