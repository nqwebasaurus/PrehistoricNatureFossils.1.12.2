package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEffigiaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer body;
    private final ModelRenderer bodyback;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer legL;
    private final ModelRenderer legL2;
    private final ModelRenderer legL3;
    private final ModelRenderer legL4;
    private final ModelRenderer legL5;
    private final ModelRenderer legL6;
    private final ModelRenderer legL7;
    private final ModelRenderer legL8;
    private final ModelRenderer tail;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer bodymiddle;
    private final ModelRenderer bodyfront;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer ArmL;
    private final ModelRenderer ArmL2;
    private final ModelRenderer ArmL3;
    private final ModelRenderer ArmL4;
    private final ModelRenderer neck;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer upperjaw;

    public ModelSkeletonEffigiaFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 22.75F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -16.65F, 2.5F, 1, 18, 1, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -17.65F, -15.2F, 1, 19, 1, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, -3, 1, -4.5F, -13.95F, -15.21F, 9, 1, 1, 0.0F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -15.05F, 3.5F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, -0.0524F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -1, 1, -3.0F, -1.0F, -1.0F, 6, 1, 1, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.15F, -8.0F);
        this.fossil.addChild(body);


        this.bodyback = new ModelRenderer(this);
        this.bodyback.setRotationPoint(0.0F, -12.3F, 7.0F);
        this.body.addChild(bodyback);
        this.setRotateAngle(bodyback, -0.0436F, 0.0F, 0.0F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, -1.9F, 1.3F);
        this.bodyback.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, -0.0262F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 32, 0, -0.49F, -0.2F, -0.3F, 1, 1, 6, -0.1F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(2.7F, -0.65F, 4.05F);
        this.bodyback.addChild(legL);
        this.setRotateAngle(legL, 0.1309F, 0.0F, 0.0F);


        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(0.75F, 9.5824F, -0.3681F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 1.2654F, 0.0F, 0.0F);


        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(0.0F, 8.8468F, 1.0613F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, -1.9635F, 0.0F, 0.0F);


        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(0.0F, 4.05F, 0.5383F);
        this.legL3.addChild(legL4);
        this.setRotateAngle(legL4, -0.3054F, 0.0F, 0.0F);


        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(-2.7F, -0.65F, 4.05F);
        this.bodyback.addChild(legL5);
        this.setRotateAngle(legL5, -0.7854F, 0.0F, 0.0F);


        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(-0.75F, 9.5824F, -0.3681F);
        this.legL5.addChild(legL6);
        this.setRotateAngle(legL6, 1.0472F, 0.0F, 0.0F);


        this.legL7 = new ModelRenderer(this);
        this.legL7.setRotationPoint(0.0F, 8.8468F, 1.0613F);
        this.legL6.addChild(legL7);
        this.setRotateAngle(legL7, -1.4399F, 0.0F, 0.0F);


        this.legL8 = new ModelRenderer(this);
        this.legL8.setRotationPoint(0.0F, 4.05F, 0.5383F);
        this.legL7.addChild(legL8);
        this.setRotateAngle(legL8, -0.3054F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.6F, 7.0F);
        this.bodyback.addChild(tail);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.0F, 0.5939F, -1.8606F);
        this.tail.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, -0.0436F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 16, 18, -0.5F, 0.0F, 1.0F, 1, 1, 11, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5939F, 9.7394F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.0F, 16.0311F, -9.4887F);
        this.tail2.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, -0.0017F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 0, 15, -0.49F, -15.55F, 9.0F, 1, 1, 12, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0189F, 11.2113F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -0.5F, 0.541F, -0.0748F, 1, 1, 13, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.041F, 12.9252F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2618F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 17, 3, -0.49F, 0.5897F, -0.1907F, 1, 1, 12, -0.1F, false));

        this.bodymiddle = new ModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.0F, -2.8F, 1.0F);
        this.bodyback.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, -0.0436F, 0.0F, 0.0F);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 0, 29, -0.5F, 0.6984F, -9.6742F, 1, 1, 10, -0.1F, false));

        this.bodyfront = new ModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 0.0901F, -9.6943F);
        this.bodymiddle.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.2182F, 0.0F, 0.0F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.0F, 0.2156F, -8.9003F);
        this.bodyfront.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.0436F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 0, 0, -0.51F, 0.0013F, 4.2368F, 1, 1, 5, -0.1F, false));

        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 0.5817F, -4.9163F);
        this.bodyfront.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.0262F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 33, 29, -0.5F, -0.1582F, -3.9297F, 1, 1, 5, -0.1F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(4.0F, 4.7117F, -6.396F);
        this.bodyfront.addChild(ArmL);
        this.setRotateAngle(ArmL, 1.1727F, 0.1611F, -0.0674F);


        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-0.15F, 5.55F, 0.3F);
        this.ArmL.addChild(ArmL2);
        this.setRotateAngle(ArmL2, -2.1817F, 0.0F, 0.0F);


        this.ArmL3 = new ModelRenderer(this);
        this.ArmL3.setRotationPoint(-4.0F, 4.7117F, -6.396F);
        this.bodyfront.addChild(ArmL3);
        this.setRotateAngle(ArmL3, 1.0877F, -0.2163F, 0.0289F);


        this.ArmL4 = new ModelRenderer(this);
        this.ArmL4.setRotationPoint(0.15F, 5.55F, 0.3F);
        this.ArmL3.addChild(ArmL4);
        this.setRotateAngle(ArmL4, -1.789F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.6065F, -9.4627F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, -0.7418F, 0.0F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 1.3592F, -2.3403F);
        this.neck.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.2007F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 15, 5, -0.52F, -0.4576F, -0.4608F, 1, 1, 5, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.3588F, -2.659F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1355F, -0.2595F, 0.035F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 1.432F, -7.6654F);
        this.neck2.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.0908F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 23, 31, -0.5F, -0.1326F, 0.1515F, 1, 1, 8, -0.1F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.082F, -7.3154F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1168F, -0.4389F, -0.3527F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 1.95F, -4.6F);
        this.neck3.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.48F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 54, 52, -0.49F, -1.4244F, 0.15F, 1, 1, 1, -0.1F, false));

        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, 0.4F, -3.5F);
        this.neck3.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0175F, -0.0349F, -0.0003F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 14, 32, -0.5F, -0.1878F, -1.0493F, 1, 1, 5, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0258F, -4.4268F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.303F, 0.0393F, -0.1249F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.5F, 1.2776F, -0.3125F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.0432F, 0.0499F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.5F, 1.2776F, -0.3125F);
        this.head.addChild(upperjaw);

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
