package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDearcFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer wingleft1;
    private final ModelRenderer wingleft2;
    private final ModelRenderer wingleft3;
    private final ModelRenderer wingleft4;
    private final ModelRenderer handleft;
    private final ModelRenderer wingright1;
    private final ModelRenderer wingright2;
    private final ModelRenderer wingright3;
    private final ModelRenderer wingright4;
    private final ModelRenderer handright;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer head4;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2;
    private final ModelRenderer throat;
    private final ModelRenderer body1;
    private final ModelRenderer cube_r8;
    private final ModelRenderer upperlegleft;
    private final ModelRenderer lowerlegleft;
    private final ModelRenderer footleft;
    private final ModelRenderer upperlegright;
    private final ModelRenderer lowerlegright;
    private final ModelRenderer footright;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonDearcFrame() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -10.75F, 0.5F);
        this.fossil.addChild(root);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -8.25F, -5.7F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.4669F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.65F, 2.3F);
        this.chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0524F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 6, -0.5F, 0.4374F, 0.3853F, 1, 1, 4, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.142F, 0.1152F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.5708F, -0.1396F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 53, -2.6F, 0.1F, -3.0F, 1, 1, 6, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.4973F, 1.1365F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.4312F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 3, 55, -0.5F, 0.7F, -0.8F, 1, 1, 4, -0.16F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.35F, -0.7F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 3, 55, -0.5F, 0.6F, -0.3F, 1, 1, 4, -0.15F, false));

        this.wingleft1 = new ModelRenderer(this);
        this.wingleft1.setRotationPoint(3.1F, -1.6152F, -2.1332F);
        this.chest.addChild(wingleft1);
        this.setRotateAngle(wingleft1, 0.6676F, 0.2914F, -0.2661F);


        this.wingleft2 = new ModelRenderer(this);
        this.wingleft2.setRotationPoint(7.0762F, 0.1784F, 0.1503F);
        this.wingleft1.addChild(wingleft2);
        this.setRotateAngle(wingleft2, -0.0796F, 0.5786F, -1.812F);


        this.wingleft3 = new ModelRenderer(this);
        this.wingleft3.setRotationPoint(0.1F, 10.3F, 1.0F);
        this.wingleft2.addChild(wingleft3);
        this.setRotateAngle(wingleft3, -1.9547F, -1.4023F, 1.1516F);


        this.wingleft4 = new ModelRenderer(this);
        this.wingleft4.setRotationPoint(0.3863F, 0.4901F, 7.4559F);
        this.wingleft3.addChild(wingleft4);
        this.setRotateAngle(wingleft4, 0.1752F, 0.0873F, -1.4393F);


        this.handleft = new ModelRenderer(this);
        this.handleft.setRotationPoint(-0.2137F, 1.2901F, 2.5559F);
        this.wingleft3.addChild(handleft);
        this.setRotateAngle(handleft, -0.0421F, 1.2222F, 1.0472F);


        this.wingright1 = new ModelRenderer(this);
        this.wingright1.setRotationPoint(-3.1F, -1.6152F, -2.1332F);
        this.chest.addChild(wingright1);
        this.setRotateAngle(wingright1, 0.7003F, -0.181F, 0.1271F);


        this.wingright2 = new ModelRenderer(this);
        this.wingright2.setRotationPoint(-7.0762F, 0.1784F, 0.1503F);
        this.wingright1.addChild(wingright2);
        this.setRotateAngle(wingright2, -0.1022F, -0.5601F, 1.8604F);


        this.wingright3 = new ModelRenderer(this);
        this.wingright3.setRotationPoint(-0.1F, 10.3F, 1.0F);
        this.wingright2.addChild(wingright3);
        this.setRotateAngle(wingright3, -2.3336F, 1.3635F, -1.5799F);


        this.wingright4 = new ModelRenderer(this);
        this.wingright4.setRotationPoint(-0.3863F, 0.4901F, 7.4559F);
        this.wingright3.addChild(wingright4);
        this.setRotateAngle(wingright4, 0.1752F, -0.0873F, 1.4393F);


        this.handright = new ModelRenderer(this);
        this.handright.setRotationPoint(0.2137F, 1.2901F, 2.5559F);
        this.wingright3.addChild(handright);
        this.setRotateAngle(handright, -0.0421F, -1.2222F, -1.0472F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.75F, -0.6F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.0424F, 0.2602F, -0.0193F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.5828F, -0.5635F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2094F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 20, -0.5F, -0.479F, -3.3319F, 1, 1, 4, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.5828F, -3.8635F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.578F, 0.1492F, 0.1988F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -0.8475F, -4.6567F);
        this.neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 55, -1.0F, 0.5373F, -2.9718F, 1, 1, 3, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -0.3475F, -0.2567F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 39, -1.0F, 0.5F, -4.6F, 1, 1, 5, -0.15F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.1025F, -6.6817F);
        this.neck2.addChild(head2);
        this.setRotateAngle(head2, 0.3469F, 0.1517F, 0.0866F);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 1.7732F, -2.1823F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.1309F, 0.0F, 0.0F);


        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, 1.0F, -4.825F);
        this.head3.addChild(head4);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.3732F, -1.1823F);
        this.head2.addChild(jaw);
        this.setRotateAngle(jaw, 0.3796F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, -0.4008F, -1.0017F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.48F, 0.0F, 0.0F);


        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw2.addChild(throat);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.95F, 6.2F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, -0.0412F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 19, 56, -0.5F, -0.0558F, 0.042F, 1, 1, 3, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.4442F, 1.542F);
        this.body1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -1.5708F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 54, -0.5F, -0.1F, -2.5F, 1, 1, 5, -0.15F, false));

        this.upperlegleft = new ModelRenderer(this);
        this.upperlegleft.setRotationPoint(2.0F, 0.8174F, 1.9066F);
        this.body1.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, 0.3753F, -0.2484F, -1.3667F);


        this.lowerlegleft = new ModelRenderer(this);
        this.lowerlegleft.setRotationPoint(0.1F, 3.7F, -0.3F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 1.0683F, 0.0F, 0.0227F);


        this.footleft = new ModelRenderer(this);
        this.footleft.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, 0.8992F, 0.4554F, 0.0094F);


        this.upperlegright = new ModelRenderer(this);
        this.upperlegright.setRotationPoint(-2.0F, 0.8174F, 1.9066F);
        this.body1.addChild(upperlegright);
        this.setRotateAngle(upperlegright, 0.3753F, 0.2484F, 1.3667F);


        this.lowerlegright = new ModelRenderer(this);
        this.lowerlegright.setRotationPoint(-0.1F, 3.7F, -0.3F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 1.1555F, 0.0F, -0.0227F);


        this.footright = new ModelRenderer(this);
        this.footright.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, 0.8556F, -0.4554F, -0.0094F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.2308F, 2.842F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, 0.0394F, -0.0872F, -0.0034F);
        this.tail1.cubeList.add(new ModelBox(tail1, 52, 33, -0.5F, 0.1434F, -0.1336F, 1, 1, 4, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1066F, 3.9664F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0179F, -0.2181F, -0.0039F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 0, -0.5F, 0.2088F, -0.3101F, 1, 1, 6, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1338F, 6.0899F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.2618F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 33, 32, -0.5F, 0.1077F, -0.7507F, 1, 1, 6, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0077F, 4.5493F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0226F, 0.2617F, -0.0058F);
        this.tail4.cubeList.add(new ModelBox(tail4, 34, 40, -0.5F, 0.1F, 0.2F, 1, 1, 5, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0285F, 0.6979F, 0.0183F);
        this.tail5.cubeList.add(new ModelBox(tail5, 15, 14, -0.5F, 0.1F, -0.3F, 1, 1, 6, -0.15F, false));

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
