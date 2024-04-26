package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPraearcturus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer carapace_r1;
    private final ModelRenderer cube_r5;
    private final ModelRenderer carapace_r2;
    private final ModelRenderer abdomen;
    private final ModelRenderer baby5;
    private final ModelRenderer abdomen2;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer baby4;
    private final ModelRenderer baby3;
    private final ModelRenderer baby2;
    private final ModelRenderer baby1;
    private final ModelRenderer armR;
    private final ModelRenderer armR2;
    private final ModelRenderer armR2_r1;
    private final ModelRenderer armR3;
    private final ModelRenderer clawR;
    private final ModelRenderer armL;
    private final ModelRenderer armL2;
    private final ModelRenderer armR3_r1;
    private final ModelRenderer armL3;
    private final ModelRenderer clawL;
    private final ModelRenderer cheliceraR;
    private final ModelRenderer cheliceraL;
    private final ModelRenderer legsR;
    private final ModelRenderer legR;
    private final ModelRenderer leg1R_r1;
    private final ModelRenderer legR2;
    private final ModelRenderer leg2R_r1;
    private final ModelRenderer legR3;
    private final ModelRenderer leg3R_r1;
    private final ModelRenderer legR4;
    private final ModelRenderer leg4R_r1;
    private final ModelRenderer legsL;
    private final ModelRenderer legL;
    private final ModelRenderer leg1R_r2;
    private final ModelRenderer legL2;
    private final ModelRenderer leg2R_r2;
    private final ModelRenderer legL3;
    private final ModelRenderer leg3R_r2;
    private final ModelRenderer legL4;
    private final ModelRenderer leg4R_r2;

    public ModelSkeletonPraearcturus() {
        this.textureWidth = 112;
        this.textureHeight = 95;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, -4.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 34, -11.0F, -2.0F, -11.0F, 20, 2, 27, 0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-23.8F, 0.0F, 16.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.6021F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.1177F, -2.0F, -31.1333F, 8, 2, 31, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(16.0F, 0.0F, 15.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.2217F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -12.0F, -2.0F, 7.0F, 11, 2, 31, -0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(16.0F, 0.0F, -11.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 64, -26.0F, -2.0F, -26.0F, 21, 2, 21, -0.003F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.fossil.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 51, -1.5F, -1.8F, -7.25F, 3, 2, 5, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 78, 48, -2.5F, -1.9F, -2.5F, 5, 2, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(2.0F, 1.1F, -7.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 14, -1.0F, -3.0F, -0.25F, 1, 1, 1, 0.0F, false));

        this.carapace_r1 = new ModelRenderer(this);
        this.carapace_r1.setRotationPoint(1.5F, 1.2F, -7.25F);
        this.body.addChild(carapace_r1);
        this.setRotateAngle(carapace_r1, 0.0F, 0.2269F, 0.0F);
        this.carapace_r1.cubeList.add(new ModelBox(carapace_r1, 0, 64, -1.9F, -3.0F, 0.5F, 2, 2, 5, -0.015F, false));
        this.carapace_r1.cubeList.add(new ModelBox(carapace_r1, 0, 18, -1.9F, -3.0F, 0.0F, 2, 2, 1, -0.02F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0F, 1.1F, -7.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3927F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 22, 0.0F, -3.0F, -0.25F, 1, 1, 1, 0.0F, false));

        this.carapace_r2 = new ModelRenderer(this);
        this.carapace_r2.setRotationPoint(-1.5F, 1.2F, -7.25F);
        this.body.addChild(carapace_r2);
        this.setRotateAngle(carapace_r2, 0.0F, -0.2269F, 0.0F);
        this.carapace_r2.cubeList.add(new ModelBox(carapace_r2, 12, 19, -0.1F, -3.0F, 0.0F, 2, 2, 1, -0.02F, false));
        this.carapace_r2.cubeList.add(new ModelBox(carapace_r2, 68, 48, -0.1F, -3.0F, 0.5F, 2, 2, 5, -0.015F, false));

        this.abdomen = new ModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.body.addChild(abdomen);
        this.setRotateAngle(abdomen, 0.0F, -0.1309F, 0.0F);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 64, 64, -3.49F, 0.0F, 1.0F, 7, 2, 10, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 12, 51, -3.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F, false));

        this.baby5 = new ModelRenderer(this);
        this.baby5.setRotationPoint(0.0F, -1.0F, 9.25F);
        this.abdomen.addChild(baby5);
        this.setRotateAngle(baby5, 0.0F, 2.8362F, 0.0F);


        this.abdomen2 = new ModelRenderer(this);
        this.abdomen2.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.abdomen.addChild(abdomen2);
        this.setRotateAngle(abdomen2, 0.0F, -0.1309F, 0.0F);
        this.abdomen2.cubeList.add(new ModelBox(abdomen2, 0, 44, -2.5F, 0.1F, -1.0F, 5, 2, 4, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.abdomen2.addChild(tail1);
        this.setRotateAngle(tail1, 0.0F, -0.2182F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 79, 77, -1.5F, 0.2F, -1.0F, 3, 2, 4, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, -0.1309F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 80, 0, -1.499F, 0.2F, 0.0F, 3, 2, 3, -0.003F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, -0.1309F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 79, 52, -1.5F, 0.2F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, -0.2182F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 64, 77, -1.499F, 0.2F, 0.0F, 3, 2, 4, -0.003F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, -0.3054F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 72, -1.5F, 0.2F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0F, -0.1745F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 19, 27, -0.999F, 0.3F, 0.0F, 2, 1, 2, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 14, -0.499F, 0.5F, 2.0F, 1, 0, 2, 0.0F, false));

        this.baby4 = new ModelRenderer(this);
        this.baby4.setRotationPoint(-2.0F, -1.0F, 7.0F);
        this.abdomen.addChild(baby4);
        this.setRotateAngle(baby4, 0.0F, 0.5236F, 0.0F);


        this.baby3 = new ModelRenderer(this);
        this.baby3.setRotationPoint(1.75F, -1.0F, 7.0F);
        this.abdomen.addChild(baby3);
        this.setRotateAngle(baby3, 0.0F, -2.4435F, 0.0F);


        this.baby2 = new ModelRenderer(this);
        this.baby2.setRotationPoint(1.75F, -1.0F, 4.0F);
        this.abdomen.addChild(baby2);
        this.setRotateAngle(baby2, 0.0F, 0.2182F, 0.0F);


        this.baby1 = new ModelRenderer(this);
        this.baby1.setRotationPoint(-1.5F, -1.0F, 3.5F);
        this.abdomen.addChild(baby1);
        this.setRotateAngle(baby1, 0.0F, -0.4363F, 0.0F);


        this.armR = new ModelRenderer(this);
        this.armR.setRotationPoint(-1.5F, -1.8F, -7.0F);
        this.body.addChild(armR);
        this.setRotateAngle(armR, 0.0F, 0.3054F, 0.0F);
        this.armR.cubeList.add(new ModelBox(armR, 68, 44, -6.25F, 0.0F, -1.5F, 7, 1, 2, 0.0F, false));

        this.armR2 = new ModelRenderer(this);
        this.armR2.setRotationPoint(-6.25F, 0.0F, -0.5F);
        this.armR.addChild(armR2);
        this.setRotateAngle(armR2, 0.0F, 1.2654F, 0.0F);


        this.armR2_r1 = new ModelRenderer(this);
        this.armR2_r1.setRotationPoint(6.75F, 2.0F, 8.0F);
        this.armR2.addChild(armR2_r1);
        this.setRotateAngle(armR2_r1, 0.0F, 0.0873F, 0.0F);
        this.armR2_r1.cubeList.add(new ModelBox(armR2_r1, 0, 79, -7.0F, -2.1F, -12.0F, 2, 1, 4, 0.0F, false));

        this.armR3 = new ModelRenderer(this);
        this.armR3.setRotationPoint(-0.25F, -0.1F, -3.0F);
        this.armR2.addChild(armR3);
        this.setRotateAngle(armR3, 0.0F, -0.5672F, 0.0F);
        this.armR3.cubeList.add(new ModelBox(armR3, 12, 19, -0.75F, 0.15F, -10.0F, 2, 0, 7, 0.0F, false));
        this.armR3.cubeList.add(new ModelBox(armR3, 80, 22, -1.0F, -0.1F, -3.0F, 2, 2, 3, 0.0F, false));

        this.clawR = new ModelRenderer(this);
        this.clawR.setRotationPoint(0.25F, 1.0F, -3.0F);
        this.armR3.addChild(clawR);
        this.setRotateAngle(clawR, 0.0F, -0.3491F, 0.0F);
        this.clawR.cubeList.add(new ModelBox(clawR, 0, 18, -0.75F, -0.75F, -7.0F, 2, 0, 7, 0.0F, false));

        this.armL = new ModelRenderer(this);
        this.armL.setRotationPoint(1.5F, -1.7F, -7.0F);
        this.body.addChild(armL);
        this.setRotateAngle(armL, 0.0F, 0.9163F, 0.0F);
        this.armL.cubeList.add(new ModelBox(armL, 0, 27, -0.75F, 0.0F, -1.5F, 7, 1, 2, 0.0F, false));

        this.armL2 = new ModelRenderer(this);
        this.armL2.setRotationPoint(6.25F, 0.0F, -0.5F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 0.0F, -0.3054F, 0.0F);


        this.armR3_r1 = new ModelRenderer(this);
        this.armR3_r1.setRotationPoint(-6.75F, 2.0F, 8.0F);
        this.armL2.addChild(armR3_r1);
        this.setRotateAngle(armR3_r1, 0.0F, -0.0873F, 0.0F);
        this.armR3_r1.cubeList.add(new ModelBox(armR3_r1, 13, 55, 5.0F, -2.1F, -12.0F, 2, 1, 4, 0.0F, false));

        this.armL3 = new ModelRenderer(this);
        this.armL3.setRotationPoint(0.25F, 0.2F, -3.0F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, 0.0F, 0.2618F, 0.0F);
        this.armL3.cubeList.add(new ModelBox(armL3, 12, 11, -1.25F, -0.35F, -10.0F, 2, 0, 7, 0.0F, false));
        this.armL3.cubeList.add(new ModelBox(armL3, 80, 16, -1.0F, -0.5F, -3.0F, 2, 2, 3, 0.0F, false));

        this.clawL = new ModelRenderer(this);
        this.clawL.setRotationPoint(-0.25F, 1.0F, -3.0F);
        this.armL3.addChild(clawL);
        this.setRotateAngle(clawL, 0.0F, 0.3491F, 0.0F);
        this.clawL.cubeList.add(new ModelBox(clawL, 0, 10, -1.25F, -1.15F, -7.0F, 2, 0, 7, 0.0F, false));

        this.cheliceraR = new ModelRenderer(this);
        this.cheliceraR.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.body.addChild(cheliceraR);
        this.cheliceraR.cubeList.add(new ModelBox(cheliceraR, 12, 10, -1.125F, 0.199F, -1.75F, 1, 1, 2, 0.0F, false));

        this.cheliceraL = new ModelRenderer(this);
        this.cheliceraL.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.body.addChild(cheliceraL);
        this.cheliceraL.cubeList.add(new ModelBox(cheliceraL, 0, 10, 0.125F, 0.199F, -1.75F, 1, 1, 2, 0.0F, false));

        this.legsR = new ModelRenderer(this);
        this.legsR.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.body.addChild(legsR);


        this.legR = new ModelRenderer(this);
        this.legR.setRotationPoint(-1.75F, -2.5F, -6.5F);
        this.legsR.addChild(legR);
        this.setRotateAngle(legR, 1.5708F, 0.1745F, 0.0F);


        this.leg1R_r1 = new ModelRenderer(this);
        this.leg1R_r1.setRotationPoint(-3.0F, 1.5F, 0.2F);
        this.legR.addChild(leg1R_r1);
        this.setRotateAngle(leg1R_r1, 3.1416F, 0.0F, 0.0F);
        this.leg1R_r1.cubeList.add(new ModelBox(leg1R_r1, 80, 11, -3.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.legR2 = new ModelRenderer(this);
        this.legR2.setRotationPoint(-2.0F, -2.0F, -5.75F);
        this.legsR.addChild(legR2);
        this.setRotateAngle(legR2, 1.5708F, 0.1745F, 0.0F);


        this.leg2R_r1 = new ModelRenderer(this);
        this.leg2R_r1.setRotationPoint(-4.8307F, 0.0F, 0.5825F);
        this.legR2.addChild(leg2R_r1);
        this.setRotateAngle(leg2R_r1, 3.1416F, 0.0F, 0.0F);
        this.leg2R_r1.cubeList.add(new ModelBox(leg2R_r1, 0, 39, -5.0F, -2.0F, 0.0F, 10, 4, 0, 0.0F, false));

        this.legR3 = new ModelRenderer(this);
        this.legR3.setRotationPoint(-2.0F, -2.0F, -4.45F);
        this.legsR.addChild(legR3);
        this.setRotateAngle(legR3, 1.5708F, 0.5236F, 0.0F);


        this.leg3R_r1 = new ModelRenderer(this);
        this.leg3R_r1.setRotationPoint(-6.5391F, 0.0F, 0.6498F);
        this.legR3.addChild(leg3R_r1);
        this.setRotateAngle(leg3R_r1, 3.1416F, 0.0F, 0.0F);
        this.leg3R_r1.cubeList.add(new ModelBox(leg3R_r1, 0, 5, -6.5F, -2.0F, 0.0F, 13, 4, 0, 0.0F, false));

        this.legR4 = new ModelRenderer(this);
        this.legR4.setRotationPoint(-2.0F, -2.0F, -2.75F);
        this.legsR.addChild(legR4);
        this.setRotateAngle(legR4, 1.5708F, 0.8727F, 0.0F);


        this.leg4R_r1 = new ModelRenderer(this);
        this.leg4R_r1.setRotationPoint(-8.3533F, 0.0F, 0.6031F);
        this.legR4.addChild(leg4R_r1);
        this.setRotateAngle(leg4R_r1, 3.1416F, 0.0F, 0.0F);
        this.leg4R_r1.cubeList.add(new ModelBox(leg4R_r1, 68, 39, -8.5F, -2.0F, 0.0F, 17, 4, 0, 0.0F, false));

        this.legsL = new ModelRenderer(this);
        this.legsL.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.body.addChild(legsL);


        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(1.75F, -2.4F, -6.5F);
        this.legsL.addChild(legL);
        this.setRotateAngle(legL, 1.5708F, 0.6545F, 0.0F);


        this.leg1R_r2 = new ModelRenderer(this);
        this.leg1R_r2.setRotationPoint(3.0F, 1.5F, 0.2F);
        this.legL.addChild(leg1R_r2);
        this.setRotateAngle(leg1R_r2, 3.1416F, 0.0F, 0.0F);
        this.leg1R_r2.cubeList.add(new ModelBox(leg1R_r2, 80, 6, -3.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(2.0F, -2.0F, -5.75F);
        this.legsL.addChild(legL2);
        this.setRotateAngle(legL2, 1.5708F, -0.3491F, 0.0F);


        this.leg2R_r2 = new ModelRenderer(this);
        this.leg2R_r2.setRotationPoint(4.8307F, 0.0F, 0.5825F);
        this.legL2.addChild(leg2R_r2);
        this.setRotateAngle(leg2R_r2, 3.1416F, 0.0F, 0.0F);
        this.leg2R_r2.cubeList.add(new ModelBox(leg2R_r2, 0, 34, -5.0F, -2.0F, 0.0F, 10, 4, 0, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(2.0F, -2.0F, -4.45F);
        this.legsL.addChild(legL3);
        this.setRotateAngle(legL3, 1.5708F, -0.5236F, 0.0F);


        this.leg3R_r2 = new ModelRenderer(this);
        this.leg3R_r2.setRotationPoint(6.5391F, 0.0F, 0.6498F);
        this.legL3.addChild(leg3R_r2);
        this.setRotateAngle(leg3R_r2, 3.1416F, 0.0F, 0.0F);
        this.leg3R_r2.cubeList.add(new ModelBox(leg3R_r2, 0, 0, -6.5F, -2.0F, 0.0F, 13, 4, 0, 0.0F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(2.0F, -2.0F, -2.75F);
        this.legsL.addChild(legL4);
        this.setRotateAngle(legL4, 1.5708F, -0.9599F, 0.0F);


        this.leg4R_r2 = new ModelRenderer(this);
        this.leg4R_r2.setRotationPoint(8.3533F, 0.0F, 0.6031F);
        this.legL4.addChild(leg4R_r2);
        this.setRotateAngle(leg4R_r2, 3.1416F, 0.0F, 0.0F);
        this.leg4R_r2.cubeList.add(new ModelBox(leg4R_r2, 68, 34, -8.5F, -2.0F, 0.0F, 17, 4, 0, 0.0F, false));

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
