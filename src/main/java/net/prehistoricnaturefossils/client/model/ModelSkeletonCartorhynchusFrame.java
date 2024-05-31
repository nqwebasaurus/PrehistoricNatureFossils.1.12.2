package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCartorhynchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer basin2_r1;
    private final ModelRenderer body1;
    private final ModelRenderer body1_r1;
    private final ModelRenderer chest1;
    private final ModelRenderer neck1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer head1;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer rostrum1;
    private final ModelRenderer rostrum2;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw2;
    private final ModelRenderer lowerrostrum1;
    private final ModelRenderer jaw3;
    private final ModelRenderer gums;
    private final ModelRenderer FrontFlipperL;
    private final ModelRenderer flipper2;
    private final ModelRenderer flipper6;
    private final ModelRenderer flipper7;
    private final ModelRenderer FrontFlipperL2;
    private final ModelRenderer flipper3;
    private final ModelRenderer flipper4;
    private final ModelRenderer flipper5;
    private final ModelRenderer backflipperL;
    private final ModelRenderer backflipper2;
    private final ModelRenderer backflipperL2;
    private final ModelRenderer backflipper3;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;

    public ModelSkeletonCartorhynchusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 66, 62, -0.5F, -8.4F, 10.7F, 1, 11, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.4F, 11.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 68, -1.0F, -4.5F, -0.5F, 1, 9, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.8F, -4.6F, -18.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 68, -1.0F, -4.6F, -0.5F, 1, 9, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.8F, -4.6F, -18.6F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 42, -0.5F, -6.0F, -0.5F, 1, 13, 1, -0.21F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -7.5F, -6.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, -0.0698F, 0.0F, 0.0F);


        this.basin2_r1 = new ModelRenderer(this);
        this.basin2_r1.setRotationPoint(0.0F, -3.1F, 8.8F);
        this.root.addChild(basin2_r1);
        this.setRotateAngle(basin2_r1, -0.0873F, 0.0F, 0.0F);
        this.basin2_r1.cubeList.add(new ModelBox(basin2_r1, 0, 58, -0.5F, 0.0062F, -0.1782F, 1, 1, 11, -0.2F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -3.4F, 8.9F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, 0.0524F, 0.1309F, 0.0F);


        this.body1_r1 = new ModelRenderer(this);
        this.body1_r1.setRotationPoint(0.0F, -0.6F, -15.9F);
        this.body1.addChild(body1_r1);
        this.setRotateAngle(body1_r1, -0.0349F, 0.0F, 0.0F);
        this.body1_r1.cubeList.add(new ModelBox(body1_r1, 44, 21, -0.5F, 0.4007F, -0.0262F, 1, 1, 16, -0.2F, false));

        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, 3.1F, -15.4F);
        this.body1.addChild(chest1);
        this.setRotateAngle(chest1, 0.0436F, 0.0F, 0.0F);
        this.chest1.cubeList.add(new ModelBox(chest1, 58, 9, -0.5F, -3.2998F, -7.9869F, 1, 1, 8, -0.2F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.3F, -8.2F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.2201F, 0.0F, 0.0F);


        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, -1.5F, -3.0F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.0873F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 22, 29, -0.5F, -1.1988F, -3.3661F, 1, 1, 7, -0.2F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, -1.3F, -6.4F);
        this.neck1.addChild(head1);
        this.setRotateAngle(head1, -0.2162F, 0.3491F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -1.5681F, -4.3007F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.6199F, 0.0F, 0.0F);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 1.8F, -2.0F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.8196F, 0.0F, 0.0F);


        this.rostrum1 = new ModelRenderer(this);
        this.rostrum1.setRotationPoint(0.0F, 1.0F, -4.1F);
        this.head3.addChild(rostrum1);
        this.setRotateAngle(rostrum1, 0.3187F, 0.0F, 0.0F);


        this.rostrum2 = new ModelRenderer(this);
        this.rostrum2.setRotationPoint(0.0F, -1.2F, 0.8F);
        this.rostrum1.addChild(rostrum2);
        this.setRotateAngle(rostrum2, 0.2731F, 0.0F, 0.0F);


        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 2.2315F, -0.0493F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.5498F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.4337F, -4.9997F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.182F, 0.0F, 0.0F);


        this.lowerrostrum1 = new ModelRenderer(this);
        this.lowerrostrum1.setRotationPoint(0.0F, 0.3F, -3.7F);
        this.jaw2.addChild(lowerrostrum1);
        this.setRotateAngle(lowerrostrum1, 0.3204F, 0.0F, 0.0F);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 0.9F, 0.0F);
        this.jaw2.addChild(jaw3);


        this.gums = new ModelRenderer(this);
        this.gums.setRotationPoint(0.0F, 0.6337F, -0.9997F);
        this.jaw1.addChild(gums);
        this.setRotateAngle(gums, -0.4554F, 0.0F, 0.0F);


        this.FrontFlipperL = new ModelRenderer(this);
        this.FrontFlipperL.setRotationPoint(4.1737F, 2.0897F, -6.6F);
        this.chest1.addChild(FrontFlipperL);
        this.setRotateAngle(FrontFlipperL, 0.137F, -0.1085F, -0.9047F);


        this.flipper2 = new ModelRenderer(this);
        this.flipper2.setRotationPoint(0.27F, 5.1976F, -0.0866F);
        this.FrontFlipperL.addChild(flipper2);
        this.setRotateAngle(flipper2, -0.5083F, 0.1452F, -0.3623F);


        this.flipper6 = new ModelRenderer(this);
        this.flipper6.setRotationPoint(-0.4F, 2.7F, 0.05F);
        this.flipper2.addChild(flipper6);
        this.setRotateAngle(flipper6, 0.0F, 0.0F, -0.2618F);


        this.flipper7 = new ModelRenderer(this);
        this.flipper7.setRotationPoint(-7.158F, 1.6104F, 1.6F);
        this.FrontFlipperL.addChild(flipper7);


        this.FrontFlipperL2 = new ModelRenderer(this);
        this.FrontFlipperL2.setRotationPoint(-4.1737F, 2.0897F, -6.6F);
        this.chest1.addChild(FrontFlipperL2);
        this.setRotateAngle(FrontFlipperL2, -0.4239F, -0.3172F, 0.9661F);


        this.flipper3 = new ModelRenderer(this);
        this.flipper3.setRotationPoint(-0.27F, 5.1976F, -0.0866F);
        this.FrontFlipperL2.addChild(flipper3);
        this.setRotateAngle(flipper3, -0.3337F, -0.1584F, 0.3848F);


        this.flipper4 = new ModelRenderer(this);
        this.flipper4.setRotationPoint(0.4F, 2.7F, 0.05F);
        this.flipper3.addChild(flipper4);
        this.setRotateAngle(flipper4, 0.0F, 0.0F, 0.2618F);


        this.flipper5 = new ModelRenderer(this);
        this.flipper5.setRotationPoint(7.158F, 1.6104F, 1.6F);
        this.FrontFlipperL2.addChild(flipper5);


        this.backflipperL = new ModelRenderer(this);
        this.backflipperL.setRotationPoint(3.7581F, 2.2665F, 17.2087F);
        this.root.addChild(backflipperL);
        this.setRotateAngle(backflipperL, 0.8753F, -0.0745F, -1.079F);


        this.backflipper2 = new ModelRenderer(this);
        this.backflipper2.setRotationPoint(0.0425F, 4.0683F, 0.5623F);
        this.backflipperL.addChild(backflipper2);
        this.setRotateAngle(backflipper2, 0.2207F, -0.1301F, -0.1171F);


        this.backflipperL2 = new ModelRenderer(this);
        this.backflipperL2.setRotationPoint(-3.7581F, 2.2665F, 17.2087F);
        this.root.addChild(backflipperL2);
        this.setRotateAngle(backflipperL2, 0.94F, 0.1295F, 1.1323F);


        this.backflipper3 = new ModelRenderer(this);
        this.backflipper3.setRotationPoint(-0.0425F, 4.0683F, 0.5623F);
        this.backflipperL2.addChild(backflipper3);
        this.setRotateAngle(backflipper3, 0.3545F, 0.1045F, 0.0831F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -2.4F, 19.7F);
        this.root.addChild(tail1);
        this.setRotateAngle(tail1, -0.1833F, -0.0873F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 40, -0.5F, 0.3159F, -0.4252F, 1, 1, 16, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2F, 15.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, -0.3491F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 19, -0.5F, 0.1069F, -0.1825F, 1, 1, 19, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.1F, 18.3F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, -0.5236F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 39, 3, -0.5F, -0.9963F, 0.1391F, 1, 1, 16, -0.2F, false));

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
