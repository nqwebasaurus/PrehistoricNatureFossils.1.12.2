package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonRhamphorhynchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer chest;
    private final ModelRenderer chest_r1;
    private final ModelRenderer body1;
    private final ModelRenderer body4_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer upperlegleft;
    private final ModelRenderer lowerlegleft;
    private final ModelRenderer footleft;
    private final ModelRenderer upperlegright;
    private final ModelRenderer lowerlegright;
    private final ModelRenderer footright;
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
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer head;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer head4;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;

    public ModelSkeletonRhamphorhynchusFrame() {
        this.textureWidth = 72;
        this.textureHeight = 72;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 12.4804F, -1.7332F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.1911F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 31, 38, -3.5F, 0.1F, -1.475F, 7, 1, 1, -0.2F, false));

        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(0.0F, 0.35F, 3.975F);
        this.chest.addChild(chest_r1);
        this.setRotateAngle(chest_r1, 0.0175F, -0.0218F, 0.0F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 25, 32, -0.5F, -0.5F, -6.275F, 1, 1, 7, -0.25F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.3F, 4.1F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, 0.0037F, 0.0F, 0.0F);


        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(0.0F, 4.0786F, 4.8271F);
        this.body1.addChild(body4_r1);
        this.setRotateAngle(body4_r1, 0.0F, 0.1309F, 1.5708F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 31, 5, -2.9F, -3.0F, -0.5F, 1, 6, 1, -0.2F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, 0.0967F, -0.9022F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.1309F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 26, 0, -0.5F, -0.025F, 0.7F, 1, 1, 7, -0.2F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.7967F, 6.1978F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.341F, 0.174F, -0.0216F);
        this.tail1.cubeList.add(new ModelBox(tail1, 26, 9, -0.5F, 0.075F, 0.0F, 1, 1, 7, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1F, 6.6F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0463F, 0.1308F, 0.006F);
        this.tail2.cubeList.add(new ModelBox(tail2, 47, 20, -0.5F, 0.15F, 0.0F, 1, 1, 11, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 10.4F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0523F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, -2, 23, -0.5F, 0.15F, -0.55F, 1, 1, 9, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.7F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0249F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 35, -0.5F, 0.2F, 0.0F, 1, 1, 8, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 7.4F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0523F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 10, -0.5F, 0.25F, 0.0F, 1, 1, 8, -0.2F, false));

        this.upperlegleft = new ModelRenderer(this);
        this.upperlegleft.setRotationPoint(2.0F, 2.1467F, 5.4978F);
        this.body1.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, 0.3753F, -0.2484F, -1.3667F);


        this.lowerlegleft = new ModelRenderer(this);
        this.lowerlegleft.setRotationPoint(0.1F, 3.7F, -0.3F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 0.501F, 0.0F, 0.0227F);


        this.footleft = new ModelRenderer(this);
        this.footleft.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, 1.3355F, 0.4554F, 0.0094F);


        this.upperlegright = new ModelRenderer(this);
        this.upperlegright.setRotationPoint(-2.0F, 2.1467F, 5.4978F);
        this.body1.addChild(upperlegright);
        this.setRotateAngle(upperlegright, 0.3753F, 0.2484F, 1.3667F);


        this.lowerlegright = new ModelRenderer(this);
        this.lowerlegright.setRotationPoint(-0.1F, 3.7F, -0.3F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 0.501F, 0.0F, -0.0227F);


        this.footright = new ModelRenderer(this);
        this.footright.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, 1.3355F, -0.4554F, -0.0094F);


        this.wingleft1 = new ModelRenderer(this);
        this.wingleft1.setRotationPoint(3.1F, 0.4045F, -1.6F);
        this.chest.addChild(wingleft1);
        this.setRotateAngle(wingleft1, -0.0845F, 0.0401F, -0.7336F);


        this.wingleft2 = new ModelRenderer(this);
        this.wingleft2.setRotationPoint(9.0762F, 0.1784F, 0.1503F);
        this.wingleft1.addChild(wingleft2);
        this.setRotateAngle(wingleft2, -0.1881F, -0.0046F, -1.4427F);


        this.wingleft3 = new ModelRenderer(this);
        this.wingleft3.setRotationPoint(0.1F, 12.0F, 0.3F);
        this.wingleft2.addChild(wingleft3);
        this.setRotateAngle(wingleft3, -1.3528F, 0.001F, 0.3673F);


        this.wingleft4 = new ModelRenderer(this);
        this.wingleft4.setRotationPoint(0.1F, 0.0F, 10.7F);
        this.wingleft3.addChild(wingleft4);
        this.setRotateAngle(wingleft4, 0.2069F, -0.2586F, -0.0182F);


        this.handleft = new ModelRenderer(this);
        this.handleft.setRotationPoint(0.0F, 0.3F, -0.8F);
        this.wingleft3.addChild(handleft);
        this.setRotateAngle(handleft, 0.0204F, 0.8112F, 1.5893F);


        this.wingright1 = new ModelRenderer(this);
        this.wingright1.setRotationPoint(-3.1F, 0.4045F, -1.6F);
        this.chest.addChild(wingright1);
        this.setRotateAngle(wingright1, -0.0657F, -0.0666F, 0.385F);


        this.wingright2 = new ModelRenderer(this);
        this.wingright2.setRotationPoint(-9.0762F, 0.1784F, 0.1503F);
        this.wingright1.addChild(wingright2);
        this.setRotateAngle(wingright2, -0.1881F, 0.0046F, 1.4427F);


        this.wingright3 = new ModelRenderer(this);
        this.wingright3.setRotationPoint(-0.1F, 12.0F, 0.3F);
        this.wingright2.addChild(wingright3);
        this.setRotateAngle(wingright3, -1.3535F, 0.0178F, -0.4525F);


        this.wingright4 = new ModelRenderer(this);
        this.wingright4.setRotationPoint(-0.1F, 0.0F, 10.7F);
        this.wingright3.addChild(wingright4);
        this.setRotateAngle(wingright4, 0.2069F, 0.2586F, 0.0182F);


        this.handright = new ModelRenderer(this);
        this.handright.setRotationPoint(0.0F, 0.3F, -0.8F);
        this.wingright3.addChild(handright);
        this.setRotateAngle(handright, 0.0204F, -0.8112F, -1.5893F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.4F, -1.3F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.0112F, -0.1742F, -0.0449F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.4F, -3.1031F);
        this.neck1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 60, 13, -0.5F, 0.275F, -0.2F, 1, 1, 3, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.3F, -3.0031F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1675F, -0.3014F, 0.0502F);
        this.neck2.cubeList.add(new ModelBox(neck2, 46, -2, -0.5F, 0.3301F, -4.0637F, 1, 1, 5, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0051F, -3.3637F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.3829F, -0.2576F, 0.0475F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 1.41F, -3.5495F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, 0.1745F, 0.0F, 0.0F);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, -2.95F, 0.525F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.2379F, 0.0F, 0.0F);


        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, 0.0F, -3.2F);
        this.head3.addChild(head4);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.41F, -0.5495F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5843F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.1745F, 0.0F, 0.0F);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.3927F, 0.0F, 0.0F);

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
