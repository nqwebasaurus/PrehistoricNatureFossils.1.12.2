package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPlaceriasFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer root;
    private final ModelRenderer body1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer chest1;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer upperarm1;
    private final ModelRenderer lowerarm1;
    private final ModelRenderer hand1;
    private final ModelRenderer upperarm2;
    private final ModelRenderer lowerarm2;
    private final ModelRenderer hand2;
    private final ModelRenderer neck1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer head1;
    private final ModelRenderer head2;
    private final ModelRenderer beak1;
    private final ModelRenderer beak2;
    private final ModelRenderer beak3;
    private final ModelRenderer beak4;
    private final ModelRenderer tusk1;
    private final ModelRenderer fronttusk1;
    private final ModelRenderer tusk3;
    private final ModelRenderer fronttusk3;
    private final ModelRenderer tusk2;
    private final ModelRenderer fronttusk2;
    private final ModelRenderer jaw1;
    private final ModelRenderer lowerbeak1;
    private final ModelRenderer lowerbeak2;
    private final ModelRenderer basin1;
    private final ModelRenderer basin2_r1;
    private final ModelRenderer upperleg1;
    private final ModelRenderer leg1;
    private final ModelRenderer feet1;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer feet2;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;

    public ModelSkeletonPlaceriasFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 6.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 48, -0.5F, -25.0F, -18.0F, 1, 25, 1, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 23, 41, -0.5F, -26.0F, 9.5F, 1, 26, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -12.5F, 10.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 77, 8.5F, -7.5F, -0.5F, 1, 15, 1, -0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 67, 88, 4.5F, -5.5F, -28.0F, 1, 11, 1, -0.003F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -4.9F, -1.7F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);


        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -0.6769F, -4.8245F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0524F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 0, 0, -0.9F, 0.8069F, -0.0895F, 2, 2, 15, -0.2F, false));

        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, -0.1512F, -4.7511F);
        this.body1.addChild(chest1);
        this.setRotateAngle(chest1, 0.2182F, 0.0F, 0.0F);


        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(0.0F, -0.9039F, -0.0922F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, -0.0698F, 0.0F, 0.0F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 5, 58, -0.9F, 1.1316F, -5.7115F, 2, 2, 6, -0.2F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, -1.0039F, -5.7922F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.2007F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 26, 29, -0.9F, 0.8462F, -9.0051F, 2, 2, 9, -0.2F, false));

        this.upperarm1 = new ModelRenderer(this);
        this.upperarm1.setRotationPoint(4.9F, 9.9124F, -14.521F);
        this.chest1.addChild(upperarm1);
        this.setRotateAngle(upperarm1, 0.7531F, 0.0F, -0.6374F);


        this.lowerarm1 = new ModelRenderer(this);
        this.lowerarm1.setRotationPoint(0.1698F, 8.7583F, 0.8645F);
        this.upperarm1.addChild(lowerarm1);
        this.setRotateAngle(lowerarm1, -0.747F, 0.1776F, 0.6672F);


        this.hand1 = new ModelRenderer(this);
        this.hand1.setRotationPoint(-0.5421F, 8.0269F, -1.4569F);
        this.lowerarm1.addChild(hand1);
        this.setRotateAngle(hand1, 1.2216F, -0.0234F, 0.0077F);


        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(-4.9F, 9.9124F, -14.521F);
        this.chest1.addChild(upperarm2);
        this.setRotateAngle(upperarm2, -0.3377F, 0.0F, 0.6374F);


        this.lowerarm2 = new ModelRenderer(this);
        this.lowerarm2.setRotationPoint(-0.1698F, 8.7583F, 0.8645F);
        this.upperarm2.addChild(lowerarm2);
        this.setRotateAngle(lowerarm2, -0.451F, -0.1179F, -0.6028F);


        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.5421F, 8.0269F, -1.4569F);
        this.lowerarm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.873F, -0.0383F, -0.0694F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.3101F, -14.483F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.0873F, -0.3054F, 0.0F);


        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.1F, 0.5006F, -8.8397F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.0785F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 20, 0, -1.0F, 0.4787F, -1.4445F, 2, 2, 11, -0.2F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, 0.4948F, -8.3845F);
        this.neck1.addChild(head1);
        this.setRotateAngle(head1, 0.0457F, -0.3051F, -0.0138F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.3197F, -2.4504F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.0822F, 0.0F, 0.0F);


        this.beak1 = new ModelRenderer(this);
        this.beak1.setRotationPoint(0.0F, 0.9F, -6.0F);
        this.head2.addChild(beak1);
        this.setRotateAngle(beak1, -0.0897F, 0.0F, 0.0F);


        this.beak2 = new ModelRenderer(this);
        this.beak2.setRotationPoint(0.0F, -5.1F, 2.7F);
        this.beak1.addChild(beak2);
        this.setRotateAngle(beak2, 0.3142F, 0.0F, 0.0F);


        this.beak3 = new ModelRenderer(this);
        this.beak3.setRotationPoint(0.0F, -1.4F, -4.5F);
        this.beak2.addChild(beak3);
        this.setRotateAngle(beak3, 0.7629F, 0.0F, 0.0F);


        this.beak4 = new ModelRenderer(this);
        this.beak4.setRotationPoint(0.0F, 1.2F, -4.4F);
        this.beak3.addChild(beak4);
        this.setRotateAngle(beak4, -0.8196F, 0.0F, 0.0F);


        this.tusk1 = new ModelRenderer(this);
        this.tusk1.setRotationPoint(0.6F, 1.0F, 0.9F);
        this.beak1.addChild(tusk1);
        this.setRotateAngle(tusk1, -1.0846F, 0.0458F, 2.907F);


        this.fronttusk1 = new ModelRenderer(this);
        this.fronttusk1.setRotationPoint(-2.0085F, 0.6345F, -3.1366F);
        this.tusk1.addChild(fronttusk1);
        this.setRotateAngle(fronttusk1, 0.4508F, 0.1848F, -0.1952F);


        this.tusk3 = new ModelRenderer(this);
        this.tusk3.setRotationPoint(-0.6F, 1.0F, 0.9F);
        this.beak1.addChild(tusk3);
        this.setRotateAngle(tusk3, -1.0846F, -0.0458F, -2.907F);


        this.fronttusk3 = new ModelRenderer(this);
        this.fronttusk3.setRotationPoint(2.0085F, 0.6345F, -3.1366F);
        this.tusk3.addChild(fronttusk3);
        this.setRotateAngle(fronttusk3, 0.4508F, -0.1848F, 0.1952F);


        this.tusk2 = new ModelRenderer(this);
        this.tusk2.setRotationPoint(-1.9F, -0.7F, 0.9F);
        this.beak1.addChild(tusk2);
        this.setRotateAngle(tusk2, -1.0221F, 0.0822F, -2.5756F);


        this.fronttusk2 = new ModelRenderer(this);
        this.fronttusk2.setRotationPoint(0.7F, -0.4F, -5.1F);
        this.tusk2.addChild(fronttusk2);
        this.setRotateAngle(fronttusk2, 0.3336F, -0.253F, -0.0157F);


        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 3.4F, -1.3F);
        this.head2.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.2182F, 0.0F, 0.0F);


        this.lowerbeak1 = new ModelRenderer(this);
        this.lowerbeak1.setRotationPoint(0.0F, 1.1531F, -5.2725F);
        this.jaw1.addChild(lowerbeak1);
        this.setRotateAngle(lowerbeak1, 0.0848F, 0.0F, 0.0F);


        this.lowerbeak2 = new ModelRenderer(this);
        this.lowerbeak2.setRotationPoint(0.0F, 1.4F, -2.2F);
        this.lowerbeak1.addChild(lowerbeak2);
        this.setRotateAngle(lowerbeak2, -0.6981F, 0.0F, 0.0F);


        this.basin1 = new ModelRenderer(this);
        this.basin1.setRotationPoint(0.0F, 0.8027F, 9.7707F);
        this.body1.addChild(basin1);
        this.setRotateAngle(basin1, -0.0911F, 0.0F, 0.0F);


        this.basin2_r1 = new ModelRenderer(this);
        this.basin2_r1.setRotationPoint(0.0F, -0.8259F, 0.0176F);
        this.basin1.addChild(basin2_r1);
        this.setRotateAngle(basin2_r1, -0.2269F, 0.0F, 0.0F);
        this.basin2_r1.cubeList.add(new ModelBox(basin2_r1, 41, 35, -0.9F, 0.8274F, 0.0373F, 2, 2, 8, -0.2F, false));

        this.upperleg1 = new ModelRenderer(this);
        this.upperleg1.setRotationPoint(6.5F, 4.8638F, 3.3675F);
        this.basin1.addChild(upperleg1);
        this.setRotateAngle(upperleg1, -0.131F, -0.0699F, -0.2643F);


        this.leg1 = new ModelRenderer(this);
        this.leg1.setRotationPoint(0.2839F, 11.1184F, -0.9447F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.4068F, -0.083F, 0.3154F);


        this.feet1 = new ModelRenderer(this);
        this.feet1.setRotationPoint(1.0885F, 8.9576F, 0.4756F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, -0.1153F, -0.0204F, -0.0277F);


        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(-6.5F, 4.8638F, 3.3675F);
        this.basin1.addChild(upperleg2);
        this.setRotateAngle(upperleg2, 0.1308F, 0.0699F, 0.2643F);


        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(-0.2839F, 11.1184F, -0.9447F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 1.0177F, 0.083F, -0.3154F);


        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(-1.0885F, 8.9576F, 0.4756F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, 0.6701F, 0.0204F, 0.0277F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.5174F, 7.4848F);
        this.basin1.addChild(tail1);
        this.setRotateAngle(tail1, -0.5654F, 0.1478F, -0.0932F);
        this.tail1.cubeList.add(new ModelBox(tail1, 5, 48, -0.5F, 0.2306F, -0.4012F, 1, 2, 7, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2369F, 5.3875F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.2589F, 0.2111F, -0.0555F);
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 87, -0.5F, 0.2375F, 0.9228F, 1, 1, 5, -0.2F, false));

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
