package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEorhynchochelysFrame extends ModelBase {
    private final ModelRenderer body;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer pole2_r1;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer body2;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer body3;
    private final ModelRenderer pole1_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer backleftleg3;
    private final ModelRenderer backrightleg;
    private final ModelRenderer backrightleg2;
    private final ModelRenderer backrightleg3;
    private final ModelRenderer tail;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer neck;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer upperjaw;
    private final ModelRenderer frontleftarm;
    private final ModelRenderer frontleftarm2;
    private final ModelRenderer frontleftarm3;
    private final ModelRenderer frontrightarm;
    private final ModelRenderer frontrightarm2;
    private final ModelRenderer frontrightarm3;

    public ModelSkeletonEorhynchochelysFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 15.0F, -0.5F);
        this.setRotateAngle(body, 0.0F, 0.0F, -0.48F);


        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(0.0536F, 3.5477F, -15.9528F);
        this.body.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0532F, 0.0427F, 0.0197F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, 18, 48, -5.5F, -0.5F, -0.5F, 11, 1, 1, -0.1F, false));

        this.pole2_r1 = new ModelRenderer(this);
        this.pole2_r1.setRotationPoint(0.0F, 1.85F, -16.95F);
        this.body.addChild(pole2_r1);
        this.setRotateAngle(pole2_r1, 0.0524F, 0.0F, 0.0F);
        this.pole2_r1.cubeList.add(new ModelBox(pole2_r1, 23, 48, -0.49F, -0.5F, 0.5F, 1, 2, 1, -0.1F, false));

        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 1.1F, -17.2F);
        this.body.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.0524F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 20, 45, -0.5F, -0.5F, -0.5F, 1, 1, 4, -0.1F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.15F, -13.75F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -0.0436F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 28, -0.49F, 0.6037F, -0.3543F, 1, 1, 9, -0.1F, false));

        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 1.1037F, 8.1457F);
        this.body2.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0873F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, -1, 14, -0.5F, -0.5F, -0.1F, 1, 1, 5, -0.1F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.3537F, 12.6457F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.1309F, -0.1745F, 0.0F);


        this.pole1_r1 = new ModelRenderer(this);
        this.pole1_r1.setRotationPoint(0.0F, 1.8491F, 2.4229F);
        this.body3.addChild(pole1_r1);
        this.setRotateAngle(pole1_r1, -0.1225F, -0.078F, 0.0096F);
        this.pole1_r1.cubeList.add(new ModelBox(pole1_r1, 31, 44, -0.49F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, 2.3491F, 2.4229F);
        this.body3.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, -0.1224F, -0.0606F, 0.0075F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, 28, 44, -3.5F, -0.5F, -0.5F, 7, 1, 1, -0.1F, false));

        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.0F, 1.0444F, -0.3085F);
        this.body3.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.1222F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 27, 40, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.1F, false));

        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(2.95F, 2.2944F, 2.3915F);
        this.body3.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.2242F, -0.9363F, 0.3557F);


        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(5.9194F, 0.0723F, -0.1501F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.3583F, -1.0434F, 0.1924F);


        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(4.8577F, 0.4777F, 1.0119F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, 0.0F, 0.48F, 0.0873F);


        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-2.95F, 2.2944F, 2.3915F);
        this.body3.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.1688F, -0.7452F, -0.0512F);


        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(-5.9194F, 0.0723F, -0.1501F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.3141F, 0.3675F, -0.3711F);


        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(-4.8577F, 0.4777F, 1.0119F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 0.0F, -0.48F, -0.0873F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.5184F, 4.6659F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, 0.0F, -0.2618F, 0.0F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, 1.1545F, -0.3137F);
        this.tail.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.0873F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 9, 45, -0.5F, -0.5366F, -0.2F, 1, 1, 4, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2545F, 3.0863F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, -0.1309F, 0.0F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, 1.1422F, 0.0664F);
        this.tail2.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, -0.0698F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 21, 30, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5422F, 6.5664F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.2182F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 31, 0, -0.5F, 0.5417F, -0.107F, 1, 1, 6, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0017F, 5.893F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0177F, 0.1745F, 0.0031F);
        this.tail4.cubeList.add(new ModelBox(tail4, 27, 14, -0.5F, 0.55F, -0.5F, 1, 1, 9, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.1F, 8.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0447F, 0.218F, -0.0097F);
        this.tail5.cubeList.add(new ModelBox(tail5, 14, 17, -0.4F, 0.4498F, -0.4932F, 1, 1, 11, -0.1F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.0002F, 10.0087F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0492F, 0.4795F, -0.0227F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 15, -0.5F, 0.4503F, -0.015F, 1, 1, 11, -0.1F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.2F, -17.5F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.0436F, 0.3054F, 0.0F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.1F, 1.0767F, -2.1019F);
        this.neck.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0524F, 0.0174F, 0.0009F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 45, 4, -0.45F, -0.5F, -2.5F, 1, 1, 5, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0F, 0.3054F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 49, -0.5F, 0.6564F, -2.999F, 1, 1, 3, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.5F, 0.2564F, -2.749F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.1116F, 0.2557F, 0.2666F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.9564F, 0.001F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.48F, 0.0F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.9564F, 0.001F);
        this.head.addChild(upperjaw);


        this.frontleftarm = new ModelRenderer(this);
        this.frontleftarm.setRotationPoint(5.35F, 3.5F, -16.05F);
        this.body.addChild(frontleftarm);
        this.setRotateAngle(frontleftarm, 0.3749F, 0.7208F, 0.0161F);


        this.frontleftarm2 = new ModelRenderer(this);
        this.frontleftarm2.setRotationPoint(3.9732F, 0.1873F, -0.143F);
        this.frontleftarm.addChild(frontleftarm2);
        this.setRotateAngle(frontleftarm2, 0.0568F, 0.6575F, 0.1278F);


        this.frontleftarm3 = new ModelRenderer(this);
        this.frontleftarm3.setRotationPoint(4.6512F, -0.5158F, 0.9643F);
        this.frontleftarm2.addChild(frontleftarm3);
        this.setRotateAngle(frontleftarm3, 0.0F, -0.4363F, 0.0F);


        this.frontrightarm = new ModelRenderer(this);
        this.frontrightarm.setRotationPoint(-5.35F, 3.5F, -16.05F);
        this.body.addChild(frontrightarm);
        this.setRotateAngle(frontrightarm, 0.1655F, 1.0F, -0.6425F);


        this.frontrightarm2 = new ModelRenderer(this);
        this.frontrightarm2.setRotationPoint(-3.9732F, 0.1873F, -0.143F);
        this.frontrightarm.addChild(frontrightarm2);
        this.setRotateAngle(frontrightarm2, 0.0638F, -0.7882F, -0.1384F);


        this.frontrightarm3 = new ModelRenderer(this);
        this.frontrightarm3.setRotationPoint(-4.6512F, -0.5158F, 0.9643F);
        this.frontrightarm2.addChild(frontrightarm3);
        this.setRotateAngle(frontrightarm3, -0.1393F, 0.4149F, -0.3348F);

    }

    public void renderAll(float f) {
        this.body.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
