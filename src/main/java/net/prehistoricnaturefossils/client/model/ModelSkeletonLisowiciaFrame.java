package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLisowiciaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer root;
    private final ModelRenderer basin;
    private final ModelRenderer basin_r1;
    private final ModelRenderer body;
    private final ModelRenderer body_r1;
    private final ModelRenderer body_r2;
    private final ModelRenderer chest;
    private final ModelRenderer chest_r1;
    private final ModelRenderer chest_r2;
    private final ModelRenderer neck1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer head1;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer head4;
    private final ModelRenderer beak1;
    private final ModelRenderer tusk1;
    private final ModelRenderer tusk2;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer beak2;
    private final ModelRenderer upperarm1;
    private final ModelRenderer lowerarm1;
    private final ModelRenderer hand1;
    private final ModelRenderer upperarm2;
    private final ModelRenderer lowerarm2;
    private final ModelRenderer hand2;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3_r1;
    private final ModelRenderer upperleg1;
    private final ModelRenderer leg1;
    private final ModelRenderer feet1;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer feet2;

    public ModelSkeletonLisowiciaFrame() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 21, 54, 0.5F, -27.0F, -22.0F, 1, 27, 1, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 17, -0.5F, -33.0F, 16.2F, 1, 33, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -13.5F, 16.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 60, 103, 12.5F, -5.5F, -0.5F, 1, 11, 1, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -13.5F, -21.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 92, 3.5F, -7.5F, -0.5F, 1, 15, 1, -0.003F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.basin = new ModelRenderer(this);
        this.basin.setRotationPoint(0.0F, -10.0F, -3.0F);
        this.root.addChild(basin);
        this.setRotateAngle(basin, 0.0456F, 0.0F, 0.0F);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(0.0F, 0.6706F, 11.1275F);
        this.basin.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.3665F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 38, 31, -1.0F, -2.3F, -0.9F, 2, 2, 10, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.9706F, 11.9275F);
        this.basin.addChild(body);
        this.setRotateAngle(body, 0.0456F, -0.0436F, -0.002F);


        this.body_r1 = new ModelRenderer(this);
        this.body_r1.setRotationPoint(0.0F, -1.534F, -11.2038F);
        this.body.addChild(body_r1);
        this.setRotateAngle(body_r1, -0.0698F, 0.0F, 0.0F);
        this.body_r1.cubeList.add(new ModelBox(body_r1, 43, 8, -1.0F, -1.8808F, 0.6916F, 2, 2, 10, -0.201F, false));

        this.body_r2 = new ModelRenderer(this);
        this.body_r2.setRotationPoint(0.0F, -4.2608F, -10.1935F);
        this.body.addChild(body_r2);
        this.setRotateAngle(body_r2, 0.1571F, 0.0F, 0.0F);
        this.body_r2.cubeList.add(new ModelBox(body_r2, 16, 6, -1.0F, 0.9147F, -11.0935F, 2, 2, 11, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.6739F, -20.9552F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.0436F, 0.0F);


        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(0.0F, 4.472F, -12.1268F);
        this.chest.addChild(chest_r1);
        this.setRotateAngle(chest_r1, 0.4712F, 0.0F, 0.0F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 38, 74, -1.0F, 0.9308F, -0.9509F, 2, 2, 7, -0.2F, false));

        this.chest_r2 = new ModelRenderer(this);
        this.chest_r2.setRotationPoint(0.0F, -0.728F, -0.0268F);
        this.chest.addChild(chest_r2);
        this.setRotateAngle(chest_r2, 0.384F, 0.0F, 0.0F);
        this.chest_r2.cubeList.add(new ModelBox(chest_r2, 43, 63, -1.0F, 0.7956F, -7.7262F, 2, 2, 8, -0.201F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 3.872F, -9.5268F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.072F, 0.0435F, -0.0031F);


        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, 3.6339F, -11.0489F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.2618F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 21, 27, -1.0F, 0.5F, -1.8F, 2, 2, 11, -0.201F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, 1.4339F, -10.8489F);
        this.neck1.addChild(head1);
        this.setRotateAngle(head1, -0.0263F, 0.176F, 0.1116F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -0.4954F, -5.2004F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.182F, 0.0F, 0.0F);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, -5.1F, 1.4F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.5463F, 0.0F, 0.0F);


        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, 0.8F, -7.4F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.182F, 0.0F, 0.0F);


        this.beak1 = new ModelRenderer(this);
        this.beak1.setRotationPoint(0.0F, -0.7F, -4.4F);
        this.head4.addChild(beak1);
        this.setRotateAngle(beak1, -0.4554F, 0.0F, 0.0F);


        this.tusk1 = new ModelRenderer(this);
        this.tusk1.setRotationPoint(2.7F, 1.5F, -4.6F);
        this.head4.addChild(tusk1);
        this.setRotateAngle(tusk1, -0.2443F, 0.0524F, -0.4538F);


        this.tusk2 = new ModelRenderer(this);
        this.tusk2.setRotationPoint(-2.7F, 1.5F, -4.6F);
        this.head4.addChild(tusk2);
        this.setRotateAngle(tusk2, -0.2443F, -0.0524F, 0.4538F);


        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 8.7046F, 0.1996F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, -0.2314F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, -1.0F, -3.7F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.9372F, 0.0F, 0.0F);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -2.0174F, -8.8955F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.1367F, 0.0F, 0.0F);


        this.beak2 = new ModelRenderer(this);
        this.beak2.setRotationPoint(0.0F, 1.4F, -0.4F);
        this.jaw3.addChild(beak2);
        this.setRotateAngle(beak2, -0.6829F, 0.0F, 0.0F);


        this.upperarm1 = new ModelRenderer(this);
        this.upperarm1.setRotationPoint(7.2F, 14.8644F, -10.9444F);
        this.chest.addChild(upperarm1);
        this.setRotateAngle(upperarm1, 0.6724F, 0.0628F, -0.4283F);


        this.lowerarm1 = new ModelRenderer(this);
        this.lowerarm1.setRotationPoint(-0.5113F, 11.5228F, 1.0997F);
        this.upperarm1.addChild(lowerarm1);
        this.setRotateAngle(lowerarm1, -1.2386F, -0.0583F, 1.2817F);


        this.hand1 = new ModelRenderer(this);
        this.hand1.setRotationPoint(-1.2371F, 8.7727F, -2.9228F);
        this.lowerarm1.addChild(hand1);
        this.setRotateAngle(hand1, 1.1369F, 1.0156F, 0.033F);


        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(-7.2F, 14.8644F, -10.9444F);
        this.chest.addChild(upperarm2);
        this.setRotateAngle(upperarm2, -0.2439F, -0.0628F, 0.4283F);


        this.lowerarm2 = new ModelRenderer(this);
        this.lowerarm2.setRotationPoint(0.5113F, 11.5228F, 1.0997F);
        this.upperarm2.addChild(lowerarm2);
        this.setRotateAngle(lowerarm2, -1.5265F, 0.5719F, -1.4736F);


        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(1.2371F, 8.7727F, -2.9228F);
        this.lowerarm2.addChild(hand2);
        this.setRotateAngle(hand2, 1.7478F, -1.0156F, -0.033F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.6206F, 20.0275F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, 0.8458F, 0.137F, -0.2238F);


        this.tail2_r1 = new ModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.0F, -0.1122F, 1.0008F);
        this.tail1.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, 0.1571F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 5, 38, -1.0F, 0.0F, -3.0F, 2, 6, 2, -0.201F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 6.0878F, 0.9508F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.4587F, -0.0978F, -0.1953F);


        this.tail3_r1 = new ModelRenderer(this);
        this.tail3_r1.setRotationPoint(0.0F, -0.5223F, 0.6951F);
        this.tail2.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, 0.5061F, 0.0F, 0.0F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 21, 110, -0.5F, -0.1F, -2.0F, 1, 6, 1, -0.2F, false));

        this.upperleg1 = new ModelRenderer(this);
        this.upperleg1.setRotationPoint(4.5F, 8.6665F, 20.1382F);
        this.basin.addChild(upperleg1);
        this.setRotateAngle(upperleg1, 0.0518F, -0.1554F, -0.2256F);


        this.leg1 = new ModelRenderer(this);
        this.leg1.setRotationPoint(-0.4801F, 13.0428F, 0.3058F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.6694F, -0.0905F, 0.2839F);


        this.feet1 = new ModelRenderer(this);
        this.feet1.setRotationPoint(1.9206F, 8.511F, 0.2324F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, -0.3334F, -0.0204F, -0.0277F);


        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(-4.5F, 8.6665F, 20.1382F);
        this.basin.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.4718F, 0.1554F, 0.2256F);


        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(0.4801F, 13.0428F, 0.3058F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.6694F, 0.0905F, -0.2839F);


        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(-1.9206F, 8.511F, 0.2324F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, -0.1153F, 0.0204F, 0.0277F);

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
