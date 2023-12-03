package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSlimonia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer body;
    private final ModelRenderer tergite1;
    private final ModelRenderer tergite2_3;
    private final ModelRenderer tergite4_5;
    private final ModelRenderer tergite6;
    private final ModelRenderer tergite7;
    private final ModelRenderer tergite8;
    private final ModelRenderer tergite9;
    private final ModelRenderer tergite10;
    private final ModelRenderer tergite11;
    private final ModelRenderer tergite12;
    private final ModelRenderer telson;
    private final ModelRenderer legL2;
    private final ModelRenderer legL7;
    private final ModelRenderer leg1L_r1;
    private final ModelRenderer legL3;
    private final ModelRenderer leg1L_r2;
    private final ModelRenderer legL4;
    private final ModelRenderer leg1L_r3;
    private final ModelRenderer legL5;
    private final ModelRenderer legL5_2;
    private final ModelRenderer legL5_3;
    private final ModelRenderer legL6;
    private final ModelRenderer legL5_4;
    private final ModelRenderer legL5_5;
    private final ModelRenderer legL1;
    private final ModelRenderer legR1;
    private final ModelRenderer cheliceraL;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cheliceraR;
    private final ModelRenderer cube_r2;

    public ModelSkeletonSlimonia() {
        this.textureWidth = 144;
        this.textureHeight = 52;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-4.0F, 24.0F, -1.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -11.0F, -2.0F, -17.0F, 32, 2, 38, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.8F, -3.3F, 0.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.5236F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.1131F, 0.9F, -12.5315F, 8, 0, 8, 0.0F, false));

        this.tergite1 = new ModelRenderer(this);
        this.tergite1.setRotationPoint(-2.1131F, 0.0F, -4.5315F);
        this.body.addChild(tergite1);
        this.setRotateAngle(tergite1, 0.0F, 0.0436F, 0.0F);
        this.tergite1.cubeList.add(new ModelBox(tergite1, 0, 31, -4.5F, 1.0F, -0.2F, 9, 0, 2, 0.0F, false));
        this.tergite1.cubeList.add(new ModelBox(tergite1, 0, 31, -4.5F, 1.0F, 1.8F, 9, 0, 2, 0.0F, false));

        this.tergite2_3 = new ModelRenderer(this);
        this.tergite2_3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite1.addChild(tergite2_3);
        this.setRotateAngle(tergite2_3, 0.0F, 0.1309F, 0.0F);
        this.tergite2_3.cubeList.add(new ModelBox(tergite2_3, 0, 23, -5.5F, 0.9F, 0.0F, 11, 0, 4, 0.0F, false));

        this.tergite4_5 = new ModelRenderer(this);
        this.tergite4_5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergite2_3.addChild(tergite4_5);
        this.setRotateAngle(tergite4_5, 0.0F, 0.1745F, 0.0F);
        this.tergite4_5.cubeList.add(new ModelBox(tergite4_5, 0, 18, -5.5F, 1.0F, 0.0F, 11, 0, 4, 0.0F, false));
        this.tergite4_5.cubeList.add(new ModelBox(tergite4_5, 0, 18, -5.5F, 1.1F, -2.0F, 11, 0, 4, 0.0F, false));

        this.tergite6 = new ModelRenderer(this);
        this.tergite6.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergite4_5.addChild(tergite6);
        this.setRotateAngle(tergite6, 0.0F, 0.1745F, 0.0F);
        this.tergite6.cubeList.add(new ModelBox(tergite6, 0, 28, -4.5F, 0.9F, 0.0F, 9, 0, 2, 0.0F, false));
        this.tergite6.cubeList.add(new ModelBox(tergite6, 0, 28, -4.5F, 1.1F, -1.0F, 9, 0, 2, 0.0F, false));

        this.tergite7 = new ModelRenderer(this);
        this.tergite7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite6.addChild(tergite7);
        this.setRotateAngle(tergite7, 0.0F, 0.1745F, 0.0F);
        this.tergite7.cubeList.add(new ModelBox(tergite7, 19, 14, -3.5F, 1.0F, 0.0F, 7, 0, 2, 0.0F, false));
        this.tergite7.cubeList.add(new ModelBox(tergite7, 19, 14, -3.5F, 1.1F, -1.0F, 7, 0, 2, 0.0F, false));

        this.tergite8 = new ModelRenderer(this);
        this.tergite8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite7.addChild(tergite8);
        this.setRotateAngle(tergite8, 0.0F, 0.1309F, 0.0F);
        this.tergite8.cubeList.add(new ModelBox(tergite8, 21, 32, -2.5F, 1.1F, 0.0F, 5, 0, 2, 0.0F, false));
        this.tergite8.cubeList.add(new ModelBox(tergite8, 21, 32, -2.5F, 1.2F, -0.4F, 5, 0, 2, 0.0F, false));

        this.tergite9 = new ModelRenderer(this);
        this.tergite9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite8.addChild(tergite9);
        this.setRotateAngle(tergite9, 0.0F, 0.2618F, 0.0F);
        this.tergite9.cubeList.add(new ModelBox(tergite9, 25, 3, -2.0F, 1.2F, 0.0F, 4, 0, 2, 0.0F, false));
        this.tergite9.cubeList.add(new ModelBox(tergite9, 25, 3, -2.0F, 1.1F, 0.4F, 4, 0, 2, 0.0F, false));
        this.tergite9.cubeList.add(new ModelBox(tergite9, 25, 3, -2.0F, 1.3F, -0.5F, 4, 0, 2, 0.0F, false));

        this.tergite10 = new ModelRenderer(this);
        this.tergite10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite9.addChild(tergite10);
        this.setRotateAngle(tergite10, 0.0F, 0.2182F, 0.0F);
        this.tergite10.cubeList.add(new ModelBox(tergite10, 25, 0, -2.0F, 0.9F, 0.0F, 4, 0, 2, 0.0F, false));

        this.tergite11 = new ModelRenderer(this);
        this.tergite11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergite10.addChild(tergite11);
        this.setRotateAngle(tergite11, 0.0F, 0.3054F, 0.0F);
        this.tergite11.cubeList.add(new ModelBox(tergite11, 21, 28, -2.0F, 1.0F, -0.6F, 4, 0, 3, 0.0F, false));

        this.tergite12 = new ModelRenderer(this);
        this.tergite12.setRotationPoint(0.0F, 0.0F, 1.9F);
        this.tergite11.addChild(tergite12);
        this.setRotateAngle(tergite12, 0.0F, 0.2618F, 0.0F);
        this.tergite12.cubeList.add(new ModelBox(tergite12, 19, 9, -2.0F, 0.9F, 0.0F, 4, 0, 4, 0.0F, false));

        this.telson = new ModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 3.6F);
        this.tergite12.addChild(telson);
        this.setRotateAngle(telson, 0.0F, 0.3491F, 0.0F);
        this.telson.cubeList.add(new ModelBox(telson, 0, 41, -0.5F, 1.0F, 0.0F, 1, 0, 10, 0.0F, false));
        this.telson.cubeList.add(new ModelBox(telson, 0, 9, -2.5F, 1.1F, 0.0F, 5, 0, 8, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(-1.7131F, 0.6F, -9.9315F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, -0.0873F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 25, 6, 0.0F, 0.5F, -0.5F, 5, 0, 1, 0.0F, false));

        this.legL7 = new ModelRenderer(this);
        this.legL7.setRotationPoint(-1.7131F, 0.6F, -9.9315F);
        this.body.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, -0.0873F, 0.0F);


        this.leg1L_r1 = new ModelRenderer(this);
        this.leg1L_r1.setRotationPoint(5.0F, 0.5F, 0.0F);
        this.legL7.addChild(leg1L_r1);
        this.setRotateAngle(leg1L_r1, 0.0F, -0.48F, 0.0F);
        this.leg1L_r1.cubeList.add(new ModelBox(leg1L_r1, 24, 44, -0.2F, -0.1F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(-1.7131F, 0.6F, -8.8315F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.1745F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 13, 44, 0.0F, 0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leg1L_r2 = new ModelRenderer(this);
        this.leg1L_r2.setRotationPoint(4.0F, 0.5F, 0.0F);
        this.legL3.addChild(leg1L_r2);
        this.setRotateAngle(leg1L_r2, 0.0F, -0.1745F, 0.0F);
        this.leg1L_r2.cubeList.add(new ModelBox(leg1L_r2, 27, 20, 0.0F, -0.1F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(-1.7131F, 0.6F, -7.7315F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -0.2182F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 21, 35, 0.0F, 0.5F, -0.5F, 6, 0, 1, 0.0F, false));

        this.leg1L_r3 = new ModelRenderer(this);
        this.leg1L_r3.setRotationPoint(6.0F, 0.5F, 0.0F);
        this.legL4.addChild(leg1L_r3);
        this.setRotateAngle(leg1L_r3, 0.0F, -0.6981F, 0.0F);
        this.leg1L_r3.cubeList.add(new ModelBox(leg1L_r3, 0, 0, -0.3F, 0.1F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(1.3869F, 0.6F, -5.5315F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, -0.3054F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 43, 42, 0.0F, 0.5F, -1.0F, 3, 0, 2, 0.0F, false));

        this.legL5_2 = new ModelRenderer(this);
        this.legL5_2.setRotationPoint(3.0F, -0.1F, 0.0F);
        this.legL5.addChild(legL5_2);
        this.setRotateAngle(legL5_2, 0.0F, -0.7854F, 0.0F);
        this.legL5_2.cubeList.add(new ModelBox(legL5_2, 13, 41, 0.0F, 0.5F, -1.0F, 8, 0, 2, 0.001F, false));

        this.legL5_3 = new ModelRenderer(this);
        this.legL5_3.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.legL5_2.addChild(legL5_3);
        this.legL5_3.cubeList.add(new ModelBox(legL5_3, 0, 4, 0.0F, 0.5F, -0.5F, 1, 0, 1, 0.0F, false));

        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(-3.6131F, 0.7F, -5.5315F);
        this.body.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, -0.3491F, 0.0F);
        this.legL6.cubeList.add(new ModelBox(legL6, 34, 41, 0.0F, 0.5F, -1.0F, 3, 0, 2, 0.0F, false));

        this.legL5_4 = new ModelRenderer(this);
        this.legL5_4.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.legL6.addChild(legL5_4);
        this.setRotateAngle(legL5_4, 0.0F, -0.4363F, 0.0F);
        this.legL5_4.cubeList.add(new ModelBox(legL5_4, 0, 34, 0.0F, 0.5F, -1.0F, 8, 0, 2, 0.001F, false));

        this.legL5_5 = new ModelRenderer(this);
        this.legL5_5.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.legL5_4.addChild(legL5_5);
        this.legL5_5.cubeList.add(new ModelBox(legL5_5, 0, 2, 0.0F, 0.5F, -0.5F, 1, 0, 1, 0.0F, false));

        this.legL1 = new ModelRenderer(this);
        this.legL1.setRotationPoint(-0.9131F, 0.75F, -10.5315F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.3927F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 27, 23, 0.0F, 0.5F, -2.0F, 3, 0, 2, 0.0F, false));

        this.legR1 = new ModelRenderer(this);
        this.legR1.setRotationPoint(-3.3131F, 0.75F, -10.5315F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.3927F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 27, 17, -3.0F, 0.5F, -2.0F, 3, 0, 2, 0.0F, false));

        this.cheliceraL = new ModelRenderer(this);
        this.cheliceraL.setRotationPoint(-1.7131F, 1.45F, -10.2315F);
        this.body.addChild(cheliceraL);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cheliceraL.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5236F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 44, -0.5F, 0.0F, -1.5F, 2, 0, 2, 0.0F, false));

        this.cheliceraR = new ModelRenderer(this);
        this.cheliceraR.setRotationPoint(-2.5131F, 1.45F, -10.2315F);
        this.body.addChild(cheliceraR);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cheliceraR.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.5236F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 41, -1.5F, 0.0F, -1.5F, 2, 0, 2, 0.0F, false));

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
