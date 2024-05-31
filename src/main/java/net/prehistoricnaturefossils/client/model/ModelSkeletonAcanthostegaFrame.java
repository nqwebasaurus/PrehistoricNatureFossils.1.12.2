package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAcanthostegaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer root;
    private final ModelRenderer chest;
    private final ModelRenderer body;
    private final ModelRenderer basin;
    private final ModelRenderer basin_r1;
    private final ModelRenderer upperleg1;
    private final ModelRenderer leg1;
    private final ModelRenderer feet1;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer feet2;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tailfin3;
    private final ModelRenderer tailfin2;
    private final ModelRenderer tailfin1;
    private final ModelRenderer upperarm1;
    private final ModelRenderer arm1;
    private final ModelRenderer hand1;
    private final ModelRenderer upperarm2;
    private final ModelRenderer arm2;
    private final ModelRenderer hand2;
    private final ModelRenderer neck1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer head1;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer eyes1;

    public ModelSkeletonAcanthostegaFrame() {
        this.textureWidth = 75;
        this.textureHeight = 65;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.1F, -25.4F, -8.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1029F, 0.0479F, 1.1369F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 61, 52, -0.5F, -4.0F, -0.5F, 1, 7, 1, -0.21F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.1F, -19.8F, -8.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.1134F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 65, 36, -0.5F, -7.9F, -0.5F, 1, 28, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.8F, -14.2F, 9.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6021F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 61, 53, -0.5F, -4.0F, -0.5F, 1, 6, 1, -0.2F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.7F, 0.0F, 9.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.6021F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 61, 41, -1.2F, -17.6F, 0.0F, 1, 18, 1, -0.2F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -3.2F, -8.2F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.4678F, 0.0033F, -0.3886F);
        this.chest.cubeList.add(new ModelBox(chest, 63, 59, -0.5F, -0.8F, 0.0F, 1, 1, 5, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1F, 4.8F);
        this.chest.addChild(body);
        this.setRotateAngle(body, -0.044F, -0.1308F, 0.0057F);
        this.body.cubeList.add(new ModelBox(body, 49, 52, -0.5F, 0.2913F, -0.2002F, 1, 1, 12, -0.2F, false));

        this.basin = new ModelRenderer(this);
        this.basin.setRotationPoint(0.0F, 0.0F, 12.2F);
        this.body.addChild(basin);
        this.setRotateAngle(basin, -0.0915F, -0.3042F, 0.0275F);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(0.0F, -0.0003F, 0.0131F);
        this.basin.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.0175F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 55, 55, -0.6F, 0.3F, -0.8F, 1, 1, 9, -0.2F, false));

        this.upperleg1 = new ModelRenderer(this);
        this.upperleg1.setRotationPoint(2.1F, 2.8F, 6.3F);
        this.basin.addChild(upperleg1);
        this.setRotateAngle(upperleg1, 1.0629F, 0.0345F, -1.2827F);


        this.leg1 = new ModelRenderer(this);
        this.leg1.setRotationPoint(-0.0723F, 3.856F, -0.9389F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.3201F, 0.3415F, 0.1731F);


        this.feet1 = new ModelRenderer(this);
        this.feet1.setRotationPoint(0.0F, 1.6284F, 0.3482F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, 0.1487F, 0.0031F, -0.0003F);


        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(-2.1F, 2.8F, 6.3F);
        this.basin.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.6824F, -0.0345F, 1.2827F);


        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(0.0723F, 3.856F, -0.9389F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.2139F, 0.0329F, -0.0523F);


        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(0.0F, 1.6284F, 0.3482F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, 0.1478F, 0.0162F, -0.1292F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.2F, 7.9F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, 0.0649F, -0.392F, -0.0419F);


        this.tail2_r1 = new ModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.0F, -0.1F, -0.1F);
        this.tail1.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, -0.0349F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 61, 58, -0.6F, 0.3F, -0.1F, 1, 1, 6, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3F, 5.8F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0452F, 0.2615F, 0.0117F);
        this.tail2.cubeList.add(new ModelBox(tail2, 57, 56, -0.5F, 0.1F, -0.6F, 1, 1, 8, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1F, 7.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1412F, 0.6488F, 0.0952F);
        this.tail3.cubeList.add(new ModelBox(tail3, 55, 55, -0.5F, 0.2F, -0.3F, 1, 1, 9, -0.2F, false));

        this.tailfin3 = new ModelRenderer(this);
        this.tailfin3.setRotationPoint(0.0F, -2.9F, -0.5F);
        this.tail3.addChild(tailfin3);


        this.tailfin2 = new ModelRenderer(this);
        this.tailfin2.setRotationPoint(0.0F, -3.7F, 0.0F);
        this.tail2.addChild(tailfin2);


        this.tailfin1 = new ModelRenderer(this);
        this.tailfin1.setRotationPoint(0.0F, -2.8F, 3.2F);
        this.tail1.addChild(tailfin1);


        this.upperarm1 = new ModelRenderer(this);
        this.upperarm1.setRotationPoint(3.2F, 1.6F, 0.7F);
        this.chest.addChild(upperarm1);
        this.setRotateAngle(upperarm1, -0.7104F, 0.3076F, -1.7447F);


        this.arm1 = new ModelRenderer(this);
        this.arm1.setRotationPoint(-0.0534F, 4.167F, 0.1378F);
        this.upperarm1.addChild(arm1);
        this.setRotateAngle(arm1, -0.3676F, 0.4721F, 0.2383F);


        this.hand1 = new ModelRenderer(this);
        this.hand1.setRotationPoint(0.0F, 2.3378F, -0.7481F);
        this.arm1.addChild(hand1);
        this.setRotateAngle(hand1, 0.0989F, -0.2207F, -0.0392F);


        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(-3.2F, 1.6F, 0.7F);
        this.chest.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 1.0481F, -0.1046F, 0.9599F);


        this.arm2 = new ModelRenderer(this);
        this.arm2.setRotationPoint(0.0534F, 4.167F, 0.1378F);
        this.upperarm2.addChild(arm2);
        this.setRotateAngle(arm2, -0.3559F, -0.6413F, -0.1841F);


        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.0F, 2.3378F, -0.7481F);
        this.arm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.0869F, -0.036F, -0.0284F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.9F, 0.3F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.044F, 0.1308F, 0.0057F);


        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, -0.4F, -4.7F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.0349F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 61, 58, -0.5F, 0.6835F, -1.3167F, 1, 1, 6, -0.2F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, 0.2012F, -4.7433F);
        this.neck1.addChild(head1);
        this.setRotateAngle(head1, -0.0326F, 0.1546F, -0.0548F);


        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 0.7948F, 0.4842F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.1745F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 1.171F, -5.3302F);
        this.jaw1.addChild(jaw2);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.1367F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -0.2052F, -5.0158F);
        this.head1.addChild(head2);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, -1.4F, 0.0F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.1367F, 0.0F, 0.0F);


        this.eyes1 = new ModelRenderer(this);
        this.eyes1.setRotationPoint(1.6F, -1.7F, 0.7F);
        this.head2.addChild(eyes1);
        this.setRotateAngle(eyes1, -0.182F, 0.0F, 0.0F);

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
