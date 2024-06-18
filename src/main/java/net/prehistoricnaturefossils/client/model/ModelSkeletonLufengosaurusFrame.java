package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLufengosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer basin;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer upperlegL;
    private final ModelRenderer lowerlegL;
    private final ModelRenderer feetL;
    private final ModelRenderer toesL;
    private final ModelRenderer upperlegL2;
    private final ModelRenderer lowerlegL2;
    private final ModelRenderer feetL2;
    private final ModelRenderer toesL2;
    private final ModelRenderer body;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer chest;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer neck1;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4;
    private final ModelRenderer frame1_r1;
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

    public ModelSkeletonLufengosaurusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -25.9F, 1.25F, 1, 26, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -2.8F, -25.9F, -22.9F, 1, 26, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-1.75F, -20.5F, -22.4F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0038F, 0.0872F, 0.0438F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -3, 1, -5.0F, -0.5F, -0.5F, 9, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -24.0F, 1.75F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, -0.0019F, -0.0436F, 0.0437F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -3, 1, -5.0F, -0.5F, -0.5F, 10, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.basin = new ModelRenderer(this);
        this.basin.setRotationPoint(0.0F, -1.3F, 6.6F);
        this.root.addChild(basin);
        this.setRotateAngle(basin, -0.0456F, 0.0F, 0.0F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, -0.5F, -6.3F);
        this.basin.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.0873F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 8, -0.1F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.2F, 1.6F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, -0.044F, 0.1308F, -0.0057F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, 1.1677F, -0.1374F);
        this.tail1.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, -0.0873F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 31, 24, -0.5F, -0.3F, 0.0F, 1, 1, 12, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.7323F, 12.3626F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0435F, 0.0872F, -0.0038F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.0F, 2.8137F, -1.1388F);
        this.tail2.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, 0.0087F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 21, -1, -0.5F, -0.2155F, -0.0348F, 1, 1, 15, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.4F, 12.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0437F, -0.1308F, -0.0133F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.0F, 4.0244F, 6.5149F);
        this.tail3.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, -0.1047F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 15, 38, -0.5F, -0.5F, -6.0F, 1, 1, 12, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 3.6F, 12.2F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.219F, -0.0852F, 0.0189F);
        this.tail4.cubeList.add(new ModelBox(tail4, 39, 0, -0.5F, 0.4185F, 0.1755F, 1, 1, 11, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.2815F, 11.2755F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.035F, -0.0872F, 0.0031F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 36, -0.5F, 0.7033F, -0.181F, 1, 1, 12, -0.1F, false));

        this.upperlegL = new ModelRenderer(this);
        this.upperlegL.setRotationPoint(5.0F, 1.1F, -4.2F);
        this.basin.addChild(upperlegL);
        this.setRotateAngle(upperlegL, -0.0436F, 0.0F, 0.0F);


        this.lowerlegL = new ModelRenderer(this);
        this.lowerlegL.setRotationPoint(-0.4F, 12.8F, 1.0321F);
        this.upperlegL.addChild(lowerlegL);
        this.setRotateAngle(lowerlegL, 1.216F, 0.0F, 0.0F);


        this.feetL = new ModelRenderer(this);
        this.feetL.setRotationPoint(-0.8F, 8.375F, 3.2011F);
        this.lowerlegL.addChild(feetL);
        this.setRotateAngle(feetL, -0.81F, 0.0F, 0.0F);


        this.toesL = new ModelRenderer(this);
        this.toesL.setRotationPoint(0.0F, 5.4F, -2.5F);
        this.feetL.addChild(toesL);
        this.setRotateAngle(toesL, 0.2276F, 0.0F, 0.0F);


        this.upperlegL2 = new ModelRenderer(this);
        this.upperlegL2.setRotationPoint(-5.0F, 1.1F, -4.2F);
        this.basin.addChild(upperlegL2);
        this.setRotateAngle(upperlegL2, -0.5236F, 0.0F, 0.0F);


        this.lowerlegL2 = new ModelRenderer(this);
        this.lowerlegL2.setRotationPoint(0.4F, 12.8F, 1.0321F);
        this.upperlegL2.addChild(lowerlegL2);
        this.setRotateAngle(lowerlegL2, 1.1723F, 0.0F, 0.0F);


        this.feetL2 = new ModelRenderer(this);
        this.feetL2.setRotationPoint(0.8F, 8.375F, 3.2011F);
        this.lowerlegL2.addChild(feetL2);
        this.setRotateAngle(feetL2, -0.81F, 0.0F, 0.0F);


        this.toesL2 = new ModelRenderer(this);
        this.toesL2.setRotationPoint(0.0F, 5.4F, -2.5F);
        this.feetL2.addChild(toesL2);
        this.setRotateAngle(toesL2, 0.2276F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-0.1F, -0.1F, -5.1F);
        this.basin.addChild(body);
        this.setRotateAngle(body, 0.0457F, 0.0872F, 0.004F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.1F, -0.4F, -10.4F);
        this.body.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.0F, 0.007F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 0, 0, -0.5F, -0.5F, -9.5F, 1, 1, 19, -0.1F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.7F, -19.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0437F, 0.0436F, 0.0019F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.1F, 0.5F, -8.9F);
        this.chest.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.0524F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 46, 23, -0.5F, -0.3F, 0.6F, 1, 1, 8, -0.1F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.1F, -1.5F, -8.1F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2903F, 0.1255F, -0.0374F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 1.9622F, -3.6253F);
        this.neck1.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.0262F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 44, 48, -0.5F, -0.5F, -4.5F, 1, 1, 9, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.3404F, -7.0748F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1797F, 0.1016F, 0.0702F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 1.2427F, -3.5099F);
        this.neck2.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.1135F, 0.0348F, -0.0027F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 29, 52, -0.5F, -0.5F, -3.5F, 1, 1, 7, -0.1F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.3073F, -6.5599F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1138F, 0.1688F, 0.0624F);
        this.neck3.cubeList.add(new ModelBox(neck3, 12, 52, -0.5F, 0.6769F, -6.98F, 1, 1, 7, -0.1F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.0231F, -6.98F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.1834F, 0.1698F, 0.0595F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(-0.2F, 1.416F, -4.1983F);
        this.neck4.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.0873F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 59, 36, -0.3F, -0.4F, -0.7F, 1, 1, 5, -0.1F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.366F, -4.3983F);
        this.neck4.addChild(head2);
        this.setRotateAngle(head2, 0.1311F, 0.043F, 0.0076F);


        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, -0.8962F, -2.5616F);
        this.head2.addChild(bone3);
        this.setRotateAngle(bone3, 0.1309F, 0.0F, 0.0F);


        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, 0.6545F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(-0.1F, 1.1038F, 0.2384F);
        this.head2.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.5236F, 0.0F, 0.0F);


        this.upperarmL = new ModelRenderer(this);
        this.upperarmL.setRotationPoint(4.05F, 5.85F, -6.2F);
        this.chest.addChild(upperarmL);
        this.setRotateAngle(upperarmL, 0.5863F, 0.253F, -0.1442F);


        this.lowerarmL = new ModelRenderer(this);
        this.lowerarmL.setRotationPoint(-0.4981F, 8.0666F, 1.272F);
        this.upperarmL.addChild(lowerarmL);
        this.setRotateAngle(lowerarmL, 0.3662F, 0.1996F, 0.1706F);


        this.handL = new ModelRenderer(this);
        this.handL.setRotationPoint(1.3F, -1.3106F, -5.1785F);
        this.lowerarmL.addChild(handL);
        this.setRotateAngle(handL, 0.0F, 0.4363F, 0.0F);


        this.thumbclawL = new ModelRenderer(this);
        this.thumbclawL.setRotationPoint(-0.8F, -0.3F, -0.9F);
        this.handL.addChild(thumbclawL);
        this.setRotateAngle(thumbclawL, -0.3927F, 0.0F, 0.0F);


        this.upperarmL2 = new ModelRenderer(this);
        this.upperarmL2.setRotationPoint(-3.85F, 5.85F, -6.2F);
        this.chest.addChild(upperarmL2);
        this.setRotateAngle(upperarmL2, 0.9887F, -0.3938F, 0.2524F);


        this.lowerarmL2 = new ModelRenderer(this);
        this.lowerarmL2.setRotationPoint(0.4981F, 8.0666F, 1.272F);
        this.upperarmL2.addChild(lowerarmL2);
        this.setRotateAngle(lowerarmL2, 0.5407F, -0.1996F, -0.1706F);


        this.handL2 = new ModelRenderer(this);
        this.handL2.setRotationPoint(-1.3F, -1.3106F, -5.1785F);
        this.lowerarmL2.addChild(handL2);
        this.setRotateAngle(handL2, 0.0F, -0.3054F, 0.0F);


        this.thumbclawL2 = new ModelRenderer(this);
        this.thumbclawL2.setRotationPoint(0.8F, -0.3F, -0.9F);
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
