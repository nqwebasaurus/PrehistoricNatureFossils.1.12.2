package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonYunnanosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer basin;
    private final ModelRenderer basin_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail4_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail5_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer upperlegL;
    private final ModelRenderer lowerlegL;
    private final ModelRenderer feetL;
    private final ModelRenderer toesL;
    private final ModelRenderer toesL2;
    private final ModelRenderer upperlegL2;
    private final ModelRenderer lowerlegL2;
    private final ModelRenderer feetL2;
    private final ModelRenderer toesL3;
    private final ModelRenderer toesL4;
    private final ModelRenderer body;
    private final ModelRenderer body_r1;
    private final ModelRenderer chest;
    private final ModelRenderer chest_r1;
    private final ModelRenderer neck1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer neck;
    private final ModelRenderer neck5_r2;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r4;
    private final ModelRenderer head2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer jaw2;
    private final ModelRenderer upperarmL;
    private final ModelRenderer lowerarmL;
    private final ModelRenderer handL;
    private final ModelRenderer thumbclawL;
    private final ModelRenderer upperarmL2;
    private final ModelRenderer lowerarmL2;
    private final ModelRenderer handL2;
    private final ModelRenderer thumbclawL2;

    public ModelSkeletonYunnanosaurusFrame() {
        this.textureWidth = 138;
        this.textureHeight = 138;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -32.0F, -3.3F, 1, 32, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.9F, -34.0F, -39.1F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3403F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.8F, -9.0F, -0.5F, 1, 43, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.9F, -34.0F, -39.1F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3403F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -1.5F, -5.0F, -0.5F, 1, 10, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.1F, -34.0F, -2.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 2.5F, -6.0F, -0.5F, 1, 12, 1, -0.15F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.basin = new ModelRenderer(this);
        this.basin.setRotationPoint(0.0F, -6.1672F, 0.8983F);
        this.root.addChild(basin);
        this.setRotateAngle(basin, -0.3074F, 0.0F, 0.0F);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(0.0F, -2.5F, -6.3F);
        this.basin.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.0873F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 31, 51, -0.5F, 0.5F, -2.0F, 1, 2, 14, -0.15F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.0257F, 5.5875F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, -0.134F, -0.2163F, 0.0289F);


        this.tail2_r1 = new ModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.0F, -0.6325F, -0.1287F);
        this.tail1.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, -0.0873F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 0, 33, -0.5F, 0.7F, 0.0F, 1, 2, 15, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.6983F, 14.7641F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0189F, -0.1755F, -0.0397F);


        this.tail4_r1 = new ModelRenderer(this);
        this.tail4_r1.setRotationPoint(0.0F, -0.1115F, -0.0829F);
        this.tail2.addChild(tail4_r1);
        this.setRotateAngle(tail4_r1, -0.0175F, 0.0F, 0.0F);
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 13, 64, -0.5F, 0.7845F, 13.3652F, 1, 2, 1, -0.15F, false));
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 0, 51, -0.5F, 0.7845F, -0.3348F, 1, 2, 14, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3051F, 13.6327F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.312F, 0.4114F, -0.007F);


        this.tail5_r1 = new ModelRenderer(this);
        this.tail5_r1.setRotationPoint(0.0F, -0.3765F, 0.122F);
        this.tail3.addChild(tail5_r1);
        this.setRotateAngle(tail5_r1, -0.1396F, 0.0F, 0.0F);
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 73, 61, -0.5F, 0.8F, 11.4F, 1, 2, 1, -0.15F, false));
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 62, 51, -0.5F, 0.8F, -0.3F, 1, 2, 12, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 1.8235F, 11.622F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1263F, 0.1984F, -0.1595F);
        this.tail4.cubeList.add(new ModelBox(tail4, 35, 15, -0.5F, 0.2185F, 0.0755F, 1, 1, 15, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.2418F, 15.2765F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1995F, 0.3661F, -0.2175F);
        this.tail5.cubeList.add(new ModelBox(tail5, 66, 32, -0.5F, 0.4033F, -0.581F, 1, 1, 12, -0.15F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 76, 42, -0.5F, 0.4033F, 11.119F, 1, 1, 1, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.041F, 11.9419F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.128F, -0.3031F, 0.0384F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 15, -0.5F, 0.4033F, -0.181F, 1, 1, 16, -0.15F, false));

        this.upperlegL = new ModelRenderer(this);
        this.upperlegL.setRotationPoint(5.2F, 0.2722F, -3.0798F);
        this.basin.addChild(upperlegL);
        this.setRotateAngle(upperlegL, 0.0F, 0.0F, 0.0F);


        this.lowerlegL = new ModelRenderer(this);
        this.lowerlegL.setRotationPoint(0.3F, 14.3666F, 2.6101F);
        this.upperlegL.addChild(lowerlegL);
        this.setRotateAngle(lowerlegL, 1.0414F, 0.0F, 0.0F);


        this.feetL = new ModelRenderer(this);
        this.feetL.setRotationPoint(-0.4F, 13.2801F, 1.685F);
        this.lowerlegL.addChild(feetL);
        this.setRotateAngle(feetL, -0.7664F, 0.0F, 0.0F);


        this.toesL = new ModelRenderer(this);
        this.toesL.setRotationPoint(0.3F, 4.7997F, 0.6996F);
        this.feetL.addChild(toesL);
        this.setRotateAngle(toesL, 0.5854F, 0.0F, 0.0F);


        this.toesL2 = new ModelRenderer(this);
        this.toesL2.setRotationPoint(0.0F, -0.0417F, -3.0825F);
        this.toesL.addChild(toesL2);
        this.setRotateAngle(toesL2, -0.4356F, 0.0F, 0.0F);


        this.upperlegL2 = new ModelRenderer(this);
        this.upperlegL2.setRotationPoint(-5.2F, 0.2722F, -3.0798F);
        this.basin.addChild(upperlegL2);
        this.setRotateAngle(upperlegL2, -0.2182F, 0.0F, 0.0F);


        this.lowerlegL2 = new ModelRenderer(this);
        this.lowerlegL2.setRotationPoint(-0.3F, 14.3666F, 2.6101F);
        this.upperlegL2.addChild(lowerlegL2);
        this.setRotateAngle(lowerlegL2, 0.9542F, 0.0F, 0.0F);


        this.feetL2 = new ModelRenderer(this);
        this.feetL2.setRotationPoint(0.4F, 13.2801F, 1.685F);
        this.lowerlegL2.addChild(feetL2);
        this.setRotateAngle(feetL2, -0.7664F, 0.0F, 0.0F);


        this.toesL3 = new ModelRenderer(this);
        this.toesL3.setRotationPoint(-0.3F, 4.7997F, 0.6996F);
        this.feetL2.addChild(toesL3);
        this.setRotateAngle(toesL3, 0.3323F, 0.0F, 0.0F);


        this.toesL4 = new ModelRenderer(this);
        this.toesL4.setRotationPoint(0.0F, -0.0417F, -3.0825F);
        this.toesL3.addChild(toesL4);
        this.setRotateAngle(toesL4, 0.0094F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-0.1F, -2.4086F, -8.1116F);
        this.basin.addChild(body);
        this.setRotateAngle(body, 0.0095F, 0.0868F, 0.0878F);
        this.body.cubeList.add(new ModelBox(body, 33, 33, -0.4F, 0.2434F, -15.0967F, 1, 2, 15, -0.15F, false));

        this.body_r1 = new ModelRenderer(this);
        this.body_r1.setRotationPoint(0.1F, -0.7566F, -15.0967F);
        this.body.addChild(body_r1);
        this.setRotateAngle(body_r1, 0.0873F, 0.0F, 0.0F);
        this.body_r1.cubeList.add(new ModelBox(body_r1, 61, 65, -0.5F, 1.0F, -11.2F, 1, 2, 12, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.1122F, -25.967F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0704F, 0.1306F, 0.0092F);


        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(0.1F, -0.1838F, -8.5571F);
        this.chest.addChild(chest_r1);
        this.setRotateAngle(chest_r1, 0.0524F, 0.0F, 0.0F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 0, 68, -0.5F, 0.7F, -0.4F, 1, 2, 9, -0.15F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.1F, -0.0955F, -8.4221F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.281F, 0.1082F, 0.0593F);
        this.neck1.cubeList.add(new ModelBox(neck1, 68, 20, -0.5F, 0.6904F, -7.9748F, 1, 2, 8, -0.15F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 75, 27, -0.5F, 0.6904F, -0.3748F, 1, 2, 1, -0.156F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.2894F, -7.3583F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.4157F, 0.0531F, 0.1197F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.0F, 1.3927F, -0.2099F);
        this.neck2.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 0.0F, 0.0175F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 20, 67, -0.5F, -1.0F, -8.1F, 1, 2, 9, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0162F, -7.6324F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.3962F, 0.1396F, 0.321F);


        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(0.0F, 1.2349F, -3.2097F);
        this.neck3.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, 0.0F, 0.0349F, 0.0F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 22, 92, -0.5F, -1.0F, 2.7F, 1, 2, 1, -0.15F, false));
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 17, 87, -0.5F, -1.0F, -3.0F, 1, 2, 6, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.4317F, -5.9155F);
        this.neck3.addChild(neck);
        this.setRotateAngle(neck, -0.0843F, 0.0226F, 0.2608F);


        this.neck5_r2 = new ModelRenderer(this);
        this.neck5_r2.setRotationPoint(0.0F, 0.812F, -6.7946F);
        this.neck.addChild(neck5_r2);
        this.setRotateAngle(neck5_r2, 0.0F, 0.0175F, 0.0F);
        this.neck5_r2.cubeList.add(new ModelBox(neck5_r2, 40, 77, -0.5F, -1.0F, 0.0F, 1, 2, 7, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.6655F, -6.8098F);
        this.neck.addChild(neck4);
        this.setRotateAngle(neck4, 0.3054F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.2F, 0.3391F, -2.2351F);
        this.neck4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 110, 117, -0.3F, 0.4F, -0.4F, 1, 1, 3, -0.15F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.3525F, -2.745F);
        this.neck4.addChild(head2);
        this.setRotateAngle(head2, 0.6981F, 0.0F, 0.0F);


        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, -0.8962F, -2.5616F);
        this.head2.addChild(bone3);
        this.setRotateAngle(bone3, 0.1309F, 0.0F, 0.0F);


        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, 0.6545F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(-0.1F, 1.1195F, -0.0612F);
        this.head2.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.5236F, 0.0F, 0.0F);


        this.upperarmL = new ModelRenderer(this);
        this.upperarmL.setRotationPoint(4.5669F, 7.9355F, -6.3857F);
        this.chest.addChild(upperarmL);
        this.setRotateAngle(upperarmL, -0.8776F, -0.3328F, -0.6064F);


        this.lowerarmL = new ModelRenderer(this);
        this.lowerarmL.setRotationPoint(0.7226F, 8.0147F, 0.448F);
        this.upperarmL.addChild(lowerarmL);
        this.setRotateAngle(lowerarmL, 0.6955F, 0.0337F, 0.3747F);


        this.handL = new ModelRenderer(this);
        this.handL.setRotationPoint(0.1409F, -0.397F, -5.4888F);
        this.lowerarmL.addChild(handL);
        this.setRotateAngle(handL, 0.0F, 0.4363F, 0.0F);


        this.thumbclawL = new ModelRenderer(this);
        this.thumbclawL.setRotationPoint(-0.4F, -1.2F, -0.9F);
        this.handL.addChild(thumbclawL);
        this.setRotateAngle(thumbclawL, -0.3927F, 0.0F, 0.0F);


        this.upperarmL2 = new ModelRenderer(this);
        this.upperarmL2.setRotationPoint(-4.3669F, 7.9355F, -6.3857F);
        this.chest.addChild(upperarmL2);
        this.setRotateAngle(upperarmL2, 0.5109F, 0.4386F, 0.2007F);


        this.lowerarmL2 = new ModelRenderer(this);
        this.lowerarmL2.setRotationPoint(-0.7226F, 8.0147F, 0.448F);
        this.upperarmL2.addChild(lowerarmL2);
        this.setRotateAngle(lowerarmL2, 0.6716F, -0.1996F, -0.1706F);


        this.handL2 = new ModelRenderer(this);
        this.handL2.setRotationPoint(-0.1409F, -0.397F, -5.4888F);
        this.lowerarmL2.addChild(handL2);
        this.setRotateAngle(handL2, 0.0F, -0.4363F, 0.0F);


        this.thumbclawL2 = new ModelRenderer(this);
        this.thumbclawL2.setRotationPoint(0.4F, -1.2F, -0.9F);
        this.handL2.addChild(thumbclawL2);
        this.setRotateAngle(thumbclawL2, -0.3927F, 0.0F, 0.0F);

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
