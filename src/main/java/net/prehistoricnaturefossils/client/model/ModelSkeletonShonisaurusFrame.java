package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonShonisaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer tailbase1;
    private final ModelRenderer tail1;
    private final ModelRenderer tail5;
    private final ModelRenderer body3_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer Tail6;
    private final ModelRenderer tail3;
    private final ModelRenderer tail7;
    private final ModelRenderer tail4;
    private final ModelRenderer fluke1;
    private final ModelRenderer fluke3_r1;
    private final ModelRenderer belly3;
    private final ModelRenderer rearflipper2;
    private final ModelRenderer rearflipperfingers2;
    private final ModelRenderer rearflipper3;
    private final ModelRenderer rearflipperfingers3;
    private final ModelRenderer lowerbody3;
    private final ModelRenderer lowerbody2;
    private final ModelRenderer lowerbody1;
    private final ModelRenderer neck1;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer head1;
    private final ModelRenderer rostrum1;
    private final ModelRenderer rostrum2;
    private final ModelRenderer teeth2;
    private final ModelRenderer beak1;
    private final ModelRenderer teeth1;
    private final ModelRenderer jaw1;
    private final ModelRenderer lowerrostrum1;
    private final ModelRenderer lowerrostrum2;
    private final ModelRenderer teeth4;
    private final ModelRenderer lowerbeak2;
    private final ModelRenderer beak3;
    private final ModelRenderer teeth3;
    private final ModelRenderer head2;
    private final ModelRenderer flipper2;
    private final ModelRenderer flipperfingers2;
    private final ModelRenderer flipper3;
    private final ModelRenderer flipperfingers3;
    private final ModelRenderer body3;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body4_r1;
    private final ModelRenderer underbelly2;
    private final ModelRenderer body2;
    private final ModelRenderer body3_r2;
    private final ModelRenderer underbelly3;
    private final ModelRenderer body1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer hips;
    private final ModelRenderer body5_r2;
    private final ModelRenderer body4_r2;

    public ModelSkeletonShonisaurusFrame() {
        this.textureWidth = 144;
        this.textureHeight = 144;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.tailbase1 = new ModelRenderer(this);
        this.tailbase1.setRotationPoint(0.0F, -6.8F, 0.9F);
        this.root.addChild(tailbase1);
        this.setRotateAngle(tailbase1, -0.3481F, 0.0226F, 0.0843F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(-0.054F, 0.2713F, 42.8883F);
        this.tailbase1.addChild(tail1);
        this.setRotateAngle(tail1, 0.0903F, 0.2608F, 0.0233F);


        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 2.5826F, -0.7992F);
        this.tail1.addChild(tail5);
        this.setRotateAngle(tail5, -0.0456F, 0.0F, 0.0F);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -2.4F, 0.0F);
        this.tail5.addChild(body3_r1);
        this.setRotateAngle(body3_r1, 0.0175F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 0, 75, -1.0F, -0.3F, 0.3F, 2, 2, 16, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1826F, 14.8008F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.134F, 0.2163F, 0.0289F);


        this.Tail6 = new ModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 3.4F, 1.9F);
        this.tail2.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.0456F, 0.0F, 0.0F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 82, 58, -1.0F, -3.1F, -2.0F, 2, 2, 13, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.9F, 12.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.1745F, 0.0F);


        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -1.3025F, 1.0093F);
        this.tail3.addChild(tail7);
        this.setRotateAngle(tail7, -0.0456F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 25, 87, -0.996F, 1.1F, -1.1F, 2, 2, 12, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.2975F, 11.7093F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, 0.3491F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 24, 52, -0.996F, -0.095F, -0.5092F, 2, 2, 9, -0.2F, false));

        this.fluke1 = new ModelRenderer(this);
        this.fluke1.setRotationPoint(0.0F, 0.105F, 8.5908F);
        this.tail4.addChild(fluke1);
        this.setRotateAngle(fluke1, -0.6472F, 0.1402F, -0.0223F);
        this.fluke1.cubeList.add(new ModelBox(fluke1, 30, 43, -0.996F, -0.1695F, 0.031F, 2, 2, 21, -0.2F, false));

        this.fluke3_r1 = new ModelRenderer(this);
        this.fluke3_r1.setRotationPoint(0.0F, 0.7305F, 20.931F);
        this.fluke1.addChild(fluke3_r1);
        this.setRotateAngle(fluke3_r1, 0.3054F, 0.0F, 0.0F);
        this.fluke3_r1.cubeList.add(new ModelBox(fluke3_r1, 0, 52, -0.496F, -0.1F, -0.5F, 1, 1, 21, -0.2F, false));

        this.belly3 = new ModelRenderer(this);
        this.belly3.setRotationPoint(-0.054F, 14.6713F, 19.6883F);
        this.tailbase1.addChild(belly3);
        this.setRotateAngle(belly3, 0.406F, 0.0F, 0.0F);


        this.rearflipper2 = new ModelRenderer(this);
        this.rearflipper2.setRotationPoint(6.646F, 10.418F, 35.2471F);
        this.tailbase1.addChild(rearflipper2);
        this.setRotateAngle(rearflipper2, 0.2997F, 0.3879F, -1.0484F);


        this.rearflipperfingers2 = new ModelRenderer(this);
        this.rearflipperfingers2.setRotationPoint(0.0F, 0.0F, -5.1F);
        this.rearflipper2.addChild(rearflipperfingers2);


        this.rearflipper3 = new ModelRenderer(this);
        this.rearflipper3.setRotationPoint(-6.646F, 10.418F, 35.2471F);
        this.tailbase1.addChild(rearflipper3);
        this.setRotateAngle(rearflipper3, 0.2376F, -0.3298F, 1.3529F);


        this.rearflipperfingers3 = new ModelRenderer(this);
        this.rearflipperfingers3.setRotationPoint(0.0F, 0.0F, -5.1F);
        this.rearflipper3.addChild(rearflipperfingers3);


        this.lowerbody3 = new ModelRenderer(this);
        this.lowerbody3.setRotationPoint(-0.054F, -0.5287F, 20.8883F);
        this.tailbase1.addChild(lowerbody3);
        this.setRotateAngle(lowerbody3, 0.0F, -0.2182F, 0.0F);


        this.lowerbody2 = new ModelRenderer(this);
        this.lowerbody2.setRotationPoint(0.0F, -1.3228F, -16.1113F);
        this.lowerbody3.addChild(lowerbody2);
        this.setRotateAngle(lowerbody2, 0.1309F, 0.0F, 0.0F);


        this.lowerbody1 = new ModelRenderer(this);
        this.lowerbody1.setRotationPoint(0.0F, -0.4009F, -19.8483F);
        this.lowerbody2.addChild(lowerbody1);
        this.setRotateAngle(lowerbody1, 0.0886F, -0.1739F, -0.0154F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.019F, -17.2795F);
        this.lowerbody1.addChild(neck1);
        this.setRotateAngle(neck1, -0.088F, -0.1304F, 0.0115F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(4.024F, 0.549F, -6.6028F);
        this.neck1.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 0.0873F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 0, 0, -5.024F, 0.151F, -0.3972F, 2, 2, 7, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.7F, -6.8F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2085F, -0.6102F, -0.0305F);
        this.neck2.cubeList.add(new ModelBox(neck2, 106, 73, -0.9F, -0.0417F, -4.9531F, 2, 2, 6, -0.2F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, -0.3417F, -4.0531F);
        this.neck2.addChild(head1);
        this.setRotateAngle(head1, -0.0973F, -0.2056F, 0.1871F);


        this.rostrum1 = new ModelRenderer(this);
        this.rostrum1.setRotationPoint(0.0F, 0.6683F, -10.6954F);
        this.head1.addChild(rostrum1);


        this.rostrum2 = new ModelRenderer(this);
        this.rostrum2.setRotationPoint(0.0F, 0.5F, -7.8F);
        this.rostrum1.addChild(rostrum2);


        this.teeth2 = new ModelRenderer(this);
        this.teeth2.setRotationPoint(0.0F, 1.0F, 0.3F);
        this.rostrum2.addChild(teeth2);


        this.beak1 = new ModelRenderer(this);
        this.beak1.setRotationPoint(0.0F, -0.9F, 1.7F);
        this.rostrum1.addChild(beak1);
        this.setRotateAngle(beak1, 0.0422F, 0.0F, 0.0F);


        this.teeth1 = new ModelRenderer(this);
        this.teeth1.setRotationPoint(0.0F, 0.7F, 1.2F);
        this.rostrum1.addChild(teeth1);
        this.setRotateAngle(teeth1, 0.0911F, 0.0F, 0.0F);


        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 2.2683F, 1.2046F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.5236F, 0.0F, 0.0F);


        this.lowerrostrum1 = new ModelRenderer(this);
        this.lowerrostrum1.setRotationPoint(0.0F, 1.2853F, -11.8586F);
        this.jaw1.addChild(lowerrostrum1);


        this.lowerrostrum2 = new ModelRenderer(this);
        this.lowerrostrum2.setRotationPoint(0.0F, 0.1F, -8.0F);
        this.lowerrostrum1.addChild(lowerrostrum2);


        this.teeth4 = new ModelRenderer(this);
        this.teeth4.setRotationPoint(0.0F, -1.4F, 0.3F);
        this.lowerrostrum2.addChild(teeth4);


        this.lowerbeak2 = new ModelRenderer(this);
        this.lowerbeak2.setRotationPoint(0.0F, 0.5F, -7.3F);
        this.lowerrostrum1.addChild(lowerbeak2);
        this.setRotateAngle(lowerbeak2, -0.0543F, 0.0F, 0.0F);


        this.beak3 = new ModelRenderer(this);
        this.beak3.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.lowerrostrum1.addChild(beak3);
        this.setRotateAngle(beak3, -0.0873F, 0.0F, 0.0F);


        this.teeth3 = new ModelRenderer(this);
        this.teeth3.setRotationPoint(0.0F, -0.8F, 1.2F);
        this.lowerrostrum1.addChild(teeth3);
        this.setRotateAngle(teeth3, -0.0456F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -2.0317F, -1.6954F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.3187F, 0.0F, 0.0F);


        this.flipper2 = new ModelRenderer(this);
        this.flipper2.setRotationPoint(8.0F, 12.919F, -13.5795F);
        this.lowerbody1.addChild(flipper2);
        this.setRotateAngle(flipper2, 0.3992F, 0.239F, -0.8824F);


        this.flipperfingers2 = new ModelRenderer(this);
        this.flipperfingers2.setRotationPoint(0.1237F, 1.1146F, -7.065F);
        this.flipper2.addChild(flipperfingers2);


        this.flipper3 = new ModelRenderer(this);
        this.flipper3.setRotationPoint(-7.892F, 12.919F, -13.5795F);
        this.lowerbody1.addChild(flipper3);
        this.setRotateAngle(flipper3, 0.1186F, -0.1284F, 0.8214F);


        this.flipperfingers3 = new ModelRenderer(this);
        this.flipperfingers3.setRotationPoint(-0.1237F, 1.1146F, -7.065F);
        this.flipper3.addChild(flipperfingers3);


        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 6.219F, 3.0205F);
        this.lowerbody1.addChild(body3);


        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-0.1F, 2.8762F, -17.319F);
        this.body3.addChild(body6_r1);
        this.setRotateAngle(body6_r1, 1.5708F, -0.0087F, 1.5708F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 63, 0, 3.2F, -0.5F, -9.0F, 1, 1, 18, -0.19F, false));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(0.0F, -5.1715F, -11.889F);
        this.body3.addChild(body5_r1);
        this.setRotateAngle(body5_r1, 1.5795F, 0.0F, 0.0F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 68, 5, -0.6F, -6.0F, -12.0F, 1, 1, 13, -0.2F, false));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(0.0F, -6.3804F, -20.6143F);
        this.body3.addChild(body4_r1);
        this.setRotateAngle(body4_r1, 0.0087F, 0.0F, 0.0F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 63, 0, -1.0F, 0.285F, -0.2856F, 2, 2, 18, -0.2F, false));

        this.underbelly2 = new ModelRenderer(this);
        this.underbelly2.setRotationPoint(0.0F, 19.769F, -16.2795F);
        this.lowerbody1.addChild(underbelly2);
        this.setRotateAngle(underbelly2, -0.3491F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 5.4991F, 2.0517F);
        this.lowerbody2.addChild(body2);


        this.body3_r2 = new ModelRenderer(this);
        this.body3_r2.setRotationPoint(0.0F, -6.3919F, -21.7934F);
        this.body2.addChild(body3_r2);
        this.setRotateAngle(body3_r2, -0.0349F, 0.0F, 0.0F);
        this.body3_r2.cubeList.add(new ModelBox(body3_r2, 57, 58, -1.0F, 0.4918F, -0.4112F, 2, 2, 20, -0.2F, false));

        this.underbelly3 = new ModelRenderer(this);
        this.underbelly3.setRotationPoint(0.0F, 19.8772F, -12.0113F);
        this.lowerbody3.addChild(underbelly3);
        this.setRotateAngle(underbelly3, 0.1745F, 0.0F, 0.0F);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 5.1772F, 0.9887F);
        this.lowerbody3.addChild(body1);
        this.setRotateAngle(body1, -0.0349F, 0.0F, 0.0F);


        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -5.2892F, -17.905F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0349F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 28, 67, -1.0F, -0.3106F, -0.1054F, 2, 2, 17, -0.21F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(-0.054F, 4.4713F, 20.0883F);
        this.tailbase1.addChild(hips);
        this.setRotateAngle(hips, -0.0281F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 26, -1.0F, -4.9079F, 0.0402F, 2, 2, 23, -0.2F, false));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(0.9106F, 5.0461F, 15.1675F);
        this.hips.addChild(body5_r2);
        this.setRotateAngle(body5_r2, 1.5904F, -0.4649F, 1.5708F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 7, 33, 0.0F, -0.1F, -8.5F, 1, 1, 15, -0.19F, false));

        this.body4_r2 = new ModelRenderer(this);
        this.body4_r2.setRotationPoint(0.0F, -3.9079F, 11.5402F);
        this.hips.addChild(body4_r2);
        this.setRotateAngle(body4_r2, 1.9643F, -0.0662F, -0.1292F);
        this.body4_r2.cubeList.add(new ModelBox(body4_r2, 11, 37, -0.7F, 0.0F, -10.5F, 1, 1, 11, -0.2F, false));

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
