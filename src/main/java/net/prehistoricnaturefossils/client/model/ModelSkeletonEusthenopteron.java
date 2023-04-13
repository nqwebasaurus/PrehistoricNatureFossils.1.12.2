package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEusthenopteron extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body;
    private final ModelRenderer body4_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer pectoralfinR;
    private final ModelRenderer dorsalfin1;
    private final ModelRenderer head;
    private final ModelRenderer headlow_r1;
    private final ModelRenderer head_r1;
    private final ModelRenderer upperjaw;
    private final ModelRenderer tooth3_r1;
    private final ModelRenderer tooth2_r1;
    private final ModelRenderer head1_r1;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2_r1;
    private final ModelRenderer jaw1_r1;
    private final ModelRenderer tooth2_r2;
    private final ModelRenderer body2;
    private final ModelRenderer pelvicfinR;
    private final ModelRenderer body3;
    private final ModelRenderer body4;
    private final ModelRenderer dorsalfin2;
    private final ModelRenderer fin_r1;
    private final ModelRenderer analfin;
    private final ModelRenderer body5;
    private final ModelRenderer finbase2_r1;
    private final ModelRenderer finbase1_r1;

    public ModelSkeletonEusthenopteron() {
        this.textureWidth = 176;
        this.textureHeight = 176;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 121, -6.0F, -10.0F, -13.0F, 3, 10, 18, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 124, 33, -8.0F, -6.0F, -13.0F, 2, 6, 19, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 63, 0, -5.0F, -10.0F, 5.0F, 2, 10, 22, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 124, 0, -4.0F, -15.0F, 27.0F, 1, 15, 17, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 124, 4, -4.0F, -25.0F, 27.0F, 1, 10, 17, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 130, 9, -4.0F, -21.0F, 16.0F, 1, 11, 11, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 121, 87, -11.0F, -14.0F, -26.0F, 8, 14, 13, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 88, 138, -8.0F, -17.0F, -31.0F, 8, 17, 5, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -3.0F, -21.0F, -27.0F, 6, 21, 50, 0.002F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 72, -3.0F, -27.0F, 23.0F, 7, 27, 21, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 57, 87, 1.0F, -19.0F, 28.0F, 9, 19, 19, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 66, 25, 3.0F, -14.0F, -18.0F, 5, 14, 47, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -26.9F, 23.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.576F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -3.0F, -0.1F, -17.0F, 6, 18, 17, -0.001F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-6.7638F, -28.9769F, -41.5602F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.8708F, 0.0668F, -0.0562F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 64, 1, -3.4432F, 1.3192F, -0.8648F, 4, 11, 4, -0.002F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-6.7638F, -29.0769F, -41.5602F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.8479F, 0.239F, -0.2059F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 64, 1, -3.2565F, 0.3821F, -0.9414F, 4, 12, 4, -0.002F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.0F, -19.5F, -28.5F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.8618F, 0.16F, -0.1358F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 63, 0, -2.7F, -16.0F, -2.0F, 4, 12, 5, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.0F, 0.0F, -4.0F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.0785F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 130, -1.6F, -10.0F, 9.0F, 3, 10, 9, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-4.0F, -19.0F, -36.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, -0.3491F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 35, 147, -2.5F, -9.0F, 8.5F, 5, 10, 8, 0.0F, false));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(0.0F, -3.0F, 16.0F);
        this.body.addChild(body4_r1);
        this.setRotateAngle(body4_r1, 0.1309F, 0.0F, 0.0F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 90, 102, -1.5F, -6.5F, 0.5F, 3, 11, 24, 0.0F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -2.8305F, 16.0524F);
        this.body.addChild(body2_r1);
        this.setRotateAngle(body2_r1, 0.0436F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 87, 33, -2.0F, -6.6224F, -7.3106F, 4, 1, 8, 0.0F, false));

        this.pectoralfinR = new ModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-1.5F, -1.25F, 9.75F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, -0.7174F, 1.1786F, 0.3743F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 8, 72, -4.0F, 0.0F, -1.0F, 4, 2, 2, 0.0F, false));
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 30, 0, -6.0F, 0.0F, -0.5F, 2, 2, 1, 0.0F, false));
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 57, 97, -13.0F, -1.5F, 0.0F, 8, 5, 0, 0.0F, false));

        this.dorsalfin1 = new ModelRenderer(this);
        this.dorsalfin1.setRotationPoint(0.0F, -13.0F, 40.0F);
        this.body.addChild(dorsalfin1);
        this.setRotateAngle(dorsalfin1, -1.5087F, -0.0602F, 0.1519F);
        this.dorsalfin1.cubeList.add(new ModelBox(dorsalfin1, 0, 121, 0.0F, -8.5F, 0.3F, 0, 9, 6, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -4.0F, 9.0F);
        this.body.addChild(head);
        this.setRotateAngle(head, -0.3124F, 0.2079F, -0.0666F);
        this.head.cubeList.add(new ModelBox(head, 95, 87, -4.5F, -4.0F, -5.5F, 7, 8, 5, 0.0F, false));

        this.headlow_r1 = new ModelRenderer(this);
        this.headlow_r1.setRotationPoint(0.0F, 1.1695F, 7.0524F);
        this.head.addChild(headlow_r1);
        this.setRotateAngle(headlow_r1, -0.0873F, 0.0F, 0.0F);
        this.headlow_r1.cubeList.add(new ModelBox(headlow_r1, 123, 115, -3.5F, 3.2188F, -12.2446F, 5, 1, 5, 0.0F, false));

        this.head_r1 = new ModelRenderer(this);
        this.head_r1.setRotationPoint(0.0F, 1.1695F, 7.0524F);
        this.head.addChild(head_r1);
        this.setRotateAngle(head_r1, 0.1309F, 0.0F, 0.0F);
        this.head_r1.cubeList.add(new ModelBox(head_r1, 0, 36, -3.4F, -4.289F, -17.7845F, 6, 1, 8, 0.0F, false));
        this.head_r1.cubeList.add(new ModelBox(head_r1, 0, 46, -2.99F, -6.889F, -19.1845F, 5, 1, 1, 0.02F, false));
        this.head_r1.cubeList.add(new ModelBox(head_r1, 43, 126, -2.99F, -7.289F, -23.6845F, 5, 3, 17, 0.0F, false));

        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 3.25F, -5.45F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, -0.1745F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 36, 75, -3.0F, -4.0F, -12.9F, 5, 3, 12, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 21, 36, -3.0F, -1.25F, -12.65F, 5, 1, 0, 0.0F, false));

        this.tooth3_r1 = new ModelRenderer(this);
        this.tooth3_r1.setRotationPoint(0.0F, -2.0805F, 12.5024F);
        this.upperjaw.addChild(tooth3_r1);
        this.setRotateAngle(tooth3_r1, 0.0F, -0.1309F, 0.0F);
        this.tooth3_r1.cubeList.add(new ModelBox(tooth3_r1, 71, 128, -5.9345F, 0.7305F, -24.3526F, 0, 1, 10, 0.0F, false));
        this.tooth3_r1.cubeList.add(new ModelBox(tooth3_r1, 25, 121, -6.3648F, -1.9295F, -24.5638F, 2, 3, 13, 0.0F, false));

        this.tooth2_r1 = new ModelRenderer(this);
        this.tooth2_r1.setRotationPoint(4.1751F, 0.1195F, -11.8883F);
        this.upperjaw.addChild(tooth2_r1);
        this.setRotateAngle(tooth2_r1, 0.0104F, 0.0838F, -0.0494F);
        this.tooth2_r1.cubeList.add(new ModelBox(tooth2_r1, 145, 59, -1.9885F, -1.4695F, -0.7156F, 0, 1, 10, 0.0F, false));

        this.head1_r1 = new ModelRenderer(this);
        this.head1_r1.setRotationPoint(2.9611F, -2.51F, -12.1071F);
        this.upperjaw.addChild(head1_r1);
        this.setRotateAngle(head1_r1, 0.0F, 0.1309F, 0.0F);
        this.head1_r1.cubeList.add(new ModelBox(head1_r1, 90, 0, -2.8832F, -1.5F, -0.1513F, 2, 3, 13, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.65F, -6.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1222F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 10, 4, -1.5F, -0.75F, -11.35F, 3, 1, 0, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 63, 33, -2.5F, 0.0F, -11.5F, 5, 2, 13, 0.0F, false));

        this.jaw2_r1 = new ModelRenderer(this);
        this.jaw2_r1.setRotationPoint(2.5464F, 0.99F, -10.3439F);
        this.jaw.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, 0.0F, 0.0873F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 144, 0, -1.7309F, -1.0F, -0.9479F, 2, 2, 13, 0.0F, false));

        this.jaw1_r1 = new ModelRenderer(this);
        this.jaw1_r1.setRotationPoint(0.0F, -0.4805F, 13.5524F);
        this.jaw.addChild(jaw1_r1);
        this.setRotateAngle(jaw1_r1, 0.0F, -0.1309F, 0.0F);
        this.jaw1_r1.cubeList.add(new ModelBox(jaw1_r1, 146, 115, -5.9127F, 0.4705F, -24.3073F, 2, 2, 13, 0.0F, false));
        this.jaw1_r1.cubeList.add(new ModelBox(jaw1_r1, 108, 0, -5.6258F, -0.2795F, -24.4065F, 0, 1, 10, 0.0F, false));

        this.tooth2_r2 = new ModelRenderer(this);
        this.tooth2_r2.setRotationPoint(4.1751F, 1.7195F, -10.8383F);
        this.jaw.addChild(tooth2_r2);
        this.setRotateAngle(tooth2_r2, 0.0104F, 0.0757F, -0.0404F);
        this.tooth2_r2.cubeList.add(new ModelBox(tooth2_r2, 124, 59, -1.6972F, -2.4795F, -0.7694F, 0, 1, 10, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -8.0F, 37.7F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.3873F, -0.0665F, 0.1615F);
        this.body2.cubeList.add(new ModelBox(body2, 30, 0, -0.5F, -3.75F, 0.5F, 1, 9, 7, 0.0F, false));

        this.pelvicfinR = new ModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.45F, 3.25F, 0.0F);
        this.body2.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, -1.3796F, 0.895F, -1.6012F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 38, 36, -4.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F, false));
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 10, 0, -6.0F, 0.0F, -0.5F, 2, 2, 1, 0.0F, false));
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 57, 91, -13.0F, -1.5F, 0.0F, 8, 5, 0, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -0.5F, -3.749F, 0.5F, 1, 9, 7, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 7.25F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 62, 147, -1.0F, -2.75F, 0.25F, 1, 7, 10, 0.0F, false));

        this.dorsalfin2 = new ModelRenderer(this);
        this.dorsalfin2.setRotationPoint(-0.8F, -3.0F, -0.25F);
        this.body4.addChild(dorsalfin2);
        this.setRotateAngle(dorsalfin2, -1.7358F, -0.0646F, -0.0196F);


        this.fin_r1 = new ModelRenderer(this);
        this.fin_r1.setRotationPoint(-0.3F, 0.25F, 2.0F);
        this.dorsalfin2.addChild(fin_r1);
        this.setRotateAngle(fin_r1, 0.0F, 0.0F, 0.0524F);
        this.fin_r1.cubeList.add(new ModelBox(fin_r1, 0, 72, -0.2F, -12.0F, -2.9F, 0, 12, 7, 0.0F, false));

        this.analfin = new ModelRenderer(this);
        this.analfin.setRotationPoint(-0.5F, 3.3F, -0.45F);
        this.body4.addChild(analfin);
        this.setRotateAngle(analfin, 0.5452F, -0.0011F, -0.1811F);
        this.analfin.cubeList.add(new ModelBox(analfin, 115, 138, 0.0F, 0.25F, -1.5F, 0, 15, 7, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 9.75F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.0F, 0.0F, -0.1745F);
        this.body5.cubeList.add(new ModelBox(body5, 131, 124, -0.01F, -10.0F, 1.0F, 0, 20, 14, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 40, 0, -0.5F, -0.7F, 7.5F, 1, 1, 3, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 36, -0.5F, -1.0F, 6.5F, 1, 2, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, -0.4F, -1.25F, 4.5F, 1, 3, 2, 0.0F, false));

        this.finbase2_r1 = new ModelRenderer(this);
        this.finbase2_r1.setRotationPoint(0.0F, 6.75F, -62.0F);
        this.body5.addChild(finbase2_r1);
        this.setRotateAngle(finbase2_r1, 0.3142F, 0.0F, 0.0F);
        this.finbase2_r1.cubeList.add(new ModelBox(finbase2_r1, 63, 33, -0.1F, 12.725F, 59.95F, 0, 4, 6, 0.0F, false));

        this.finbase1_r1 = new ModelRenderer(this);
        this.finbase1_r1.setRotationPoint(0.0F, 6.75F, -62.0F);
        this.body5.addChild(finbase1_r1);
        this.setRotateAngle(finbase1_r1, -0.3491F, 0.0F, 0.0F);
        this.finbase1_r1.cubeList.add(new ModelBox(finbase1_r1, 90, 0, -0.5F, -30.6F, 55.4F, 1, 4, 5, 0.0F, false));
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
