package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLaidleriaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer Laidleria;
    private final ModelRenderer hips;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer leftLeg1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg1;
    private final ModelRenderer body;
    private final ModelRenderer chest;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer leftArm1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm1;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer branchialskeleton;
    private final ModelRenderer tail1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame6_r1;

    public ModelSkeletonLaidleriaFrame() {
        this.textureWidth = 50;
        this.textureHeight = 47;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(0.5F, -0.5F, -8.4F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, -0.0873F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -4, 1, -6.0F, -0.5F, -0.5F, 11, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(-0.7F, -0.5F, 9.0F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, 0.0262F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -1, 1, -3.0F, -0.5F, -0.54F, 8, 1, 1, -0.1F, false));

        this.Laidleria = new ModelRenderer(this);
        this.Laidleria.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(Laidleria);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -1.0F, 8.8F);
        this.Laidleria.addChild(hips);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.9F, -0.62F, -0.6F);
        this.hips.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.0984F, 0.1724F, -0.0276F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 0, 18, -1.4F, -0.0382F, 0.0027F, 1, 1, 3, -0.1F, false));

        this.leftLeg1 = new ModelRenderer(this);
        this.leftLeg1.setRotationPoint(4.1F, 1.0F, 0.8F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, -0.5236F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.3484F, 0.0F, -0.7182F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -0.7418F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.7074F, 0.0F, 0.2342F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.1745F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(-4.1F, 1.0F, 0.8F);
        this.hips.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, -0.3054F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.3484F, 0.0F, -0.7182F);
        this.leftLeg4.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.1309F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.7074F, 0.0F, 0.2342F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, -0.1745F, 0.0F);


        this.rightLeg1 = new ModelRenderer(this);
        this.rightLeg1.setRotationPoint(-4.8F, 1.0F, 0.8F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, 0.1745F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.4F, -1.0F, -0.4F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.9F, 0.38F, -15.65F, 1, 1, 16, -0.1F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2F, -15.8F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.1309F, -0.084F, 0.0044F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.9F, 1.1048F, -3.2799F);
        this.chest.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0698F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 24, 31, 0.0F, -0.3F, -0.08F, 1, 1, 4, -0.1F, false));

        this.leftArm1 = new ModelRenderer(this);
        this.leftArm1.setRotationPoint(4.5F, 1.1048F, -1.2299F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.1213F, -0.4989F, 0.1626F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(2.9194F, 0.7F, 1.0549F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.0879F, 1.0266F, -0.0042F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(2.0206F, 0.0F, -0.463F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.1745F, 0.0F);


        this.rightArm1 = new ModelRenderer(this);
        this.rightArm1.setRotationPoint(-5.3F, 1.1048F, -1.2299F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.0551F, -0.1388F, -0.1304F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.9194F, 0.7F, 1.0549F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.0417F, -0.9432F, 0.0488F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-2.0206F, 0.0F, -0.463F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.1745F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.4048F, -3.6299F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.2217F, -0.2159F, 0.0114F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(-0.3992F, 0.9008F, -0.1008F);
        this.neck.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.0873F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 8, 7, -0.5F, -0.5456F, -1.0F, 1, 1, 2, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.4F, -0.4F, -1.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.4361F, 0.0119F, 0.0006F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7852F, -0.0077F, -0.0037F);


        this.branchialskeleton = new ModelRenderer(this);
        this.branchialskeleton.setRotationPoint(-0.4037F, 1.8373F, -0.051F);
        this.jaw.addChild(branchialskeleton);
        this.setRotateAngle(branchialskeleton, -0.0873F, -0.0034F, 0.0006F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.1F, 2.3F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.0F, 0.2618F, 0.0F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.4F, -0.6F, -0.2F);
        this.tail1.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0447F, 0.1299F, -0.016F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 17, 29, -0.5F, 0.3F, 0.2F, 1, 1, 4, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.9F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, 0.2618F, 0.0F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.35F, 1.5F, -0.2F);
        this.tail2.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.0436F, 0.0175F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 0, 7, 0.0F, -1.5996F, 0.1996F, 1, 1, 5, -0.1F, false));

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
