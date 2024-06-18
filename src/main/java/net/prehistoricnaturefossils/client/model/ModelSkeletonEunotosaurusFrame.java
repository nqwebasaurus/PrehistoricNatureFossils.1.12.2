package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEunotosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer body;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer body2;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer body3;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer tail;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer hindlegL;
    private final ModelRenderer hindlegL2;
    private final ModelRenderer hindlegL3;
    private final ModelRenderer hindlegL4;
    private final ModelRenderer hindlegL5;
    private final ModelRenderer hindlegL6;
    private final ModelRenderer hindlegL7;
    private final ModelRenderer hindlegL8;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer hindlegRx;
    private final ModelRenderer hindlegLx;
    private final ModelRenderer neck;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer upperjaw;
    private final ModelRenderer forelegR;
    private final ModelRenderer forelegL;
    private final ModelRenderer forelegLx;
    private final ModelRenderer forelegL2;
    private final ModelRenderer forelegLx2;
    private final ModelRenderer forelegL3;
    private final ModelRenderer forelegL4;
    private final ModelRenderer forelegLx3;
    private final ModelRenderer forelegL5;
    private final ModelRenderer forelegLx4;
    private final ModelRenderer forelegL6;

    public ModelSkeletonEunotosaurusFrame() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -1.55F, -6.9F, 13.95F, 1, 7, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.49F, -8.78F, -4.75F, 1, 9, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(0.55F, -4.95F, -4.25F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, 0.0349F, 0.0436F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -3, 1, -5.0F, -0.5F, -0.5F, 9, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(-1.1082F, -4.25F, 14.4381F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, -0.0097F, -0.218F, 0.0447F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -1, 1, -3.0F, -0.5F, -0.5F, 6, 1, 1, -0.1F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -9.3F, 3.0F);
        this.fossil.addChild(body);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 1.3F, -9.0F);
        this.body.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.1047F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 35, 33, -0.5F, -0.6F, 0.0F, 1, 1, 6, -0.1F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.25F, -3.6F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0436F, -0.0436F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 1.0154F, -0.144F);
        this.body2.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.0349F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 0, 14, -0.5F, -0.7167F, 0.1658F, 1, 1, 11, -0.1F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.3499F, 10.5695F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0435F, -0.0872F, -0.0038F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 0.7462F, 0.0872F);
        this.body3.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.1745F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 26, 31, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.1F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.8595F, 5.3375F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.0433F, -0.0869F, -0.0076F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.0F, 0.8035F, -0.2277F);
        this.tail.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.0934F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 14, 30, -0.5F, -0.5F, 0.0F, 1, 1, 9, -0.1F, false));

        this.hindlegL = new ModelRenderer(this);
        this.hindlegL.setRotationPoint(3.0F, 2.953F, -0.159F);
        this.tail.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.6613F, -0.2366F, -0.3157F);


        this.hindlegL2 = new ModelRenderer(this);
        this.hindlegL2.setRotationPoint(4.8F, -0.7F, -0.3F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0F, 0.0F, 1.5708F);


        this.hindlegL3 = new ModelRenderer(this);
        this.hindlegL3.setRotationPoint(4.4F, -0.2F, -0.8F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, -0.6981F, 0.0F, 0.0F);


        this.hindlegL4 = new ModelRenderer(this);
        this.hindlegL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hindlegL3.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, -0.0369F, 1.1592F, -0.4666F);


        this.hindlegL5 = new ModelRenderer(this);
        this.hindlegL5.setRotationPoint(-3.0F, 2.953F, -0.159F);
        this.tail.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 0.1392F, -0.346F, -0.0475F);


        this.hindlegL6 = new ModelRenderer(this);
        this.hindlegL6.setRotationPoint(-4.8F, -0.7F, -0.3F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, 0.0F, 0.0F, -1.5708F);


        this.hindlegL7 = new ModelRenderer(this);
        this.hindlegL7.setRotationPoint(-4.4F, -0.2F, -0.8F);
        this.hindlegL6.addChild(hindlegL7);
        this.setRotateAngle(hindlegL7, -0.6981F, 0.0F, 0.0F);


        this.hindlegL8 = new ModelRenderer(this);
        this.hindlegL8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hindlegL7.addChild(hindlegL8);
        this.setRotateAngle(hindlegL8, 0.0F, -1.5708F, 0.0F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.6669F, 8.6306F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0795F, -0.2142F, -0.0175F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 17, -0.49F, 0.4688F, -0.4865F, 1, 1, 10, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0975F, 9.7567F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1618F, -0.5535F, -0.1308F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(-0.25F, 0.8413F, -0.7111F);
        this.tail3.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.0F, 0.0436F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 28, 19, -0.5F, -0.5F, 0.0F, 1, 1, 10, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0737F, 9.3962F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0622F, -0.7391F, -0.0695F);
        this.tail4.cubeList.add(new ModelBox(tail4, -1, 26, -0.74F, 0.45F, -0.9F, 1, 1, 11, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.1F, 9.3F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0511F, -0.872F, -0.0376F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.0F, 6.1064F, -68.7143F);
        this.tail5.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, 0.0F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 23, 4, -0.5F, -5.51F, 68.7F, 1, 1, 10, -0.1F, false));

        this.hindlegRx = new ModelRenderer(this);
        this.hindlegRx.setRotationPoint(-3.0F, 3.6962F, 5.2872F);
        this.body3.addChild(hindlegRx);
        this.setRotateAngle(hindlegRx, 0.0873F, 0.0F, 0.0F);


        this.hindlegLx = new ModelRenderer(this);
        this.hindlegLx.setRotationPoint(3.0F, 3.7962F, 5.6872F);
        this.body3.addChild(hindlegLx);
        this.setRotateAngle(hindlegLx, 0.0873F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1F, -8.4F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.1919F, 0.3829F, -0.0894F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, 1.2748F, -4.04F);
        this.neck.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0698F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 0, 0, -0.5F, -0.3603F, 0.0602F, 1, 1, 4, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4083F, -3.8176F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1382F, 0.5841F, 0.0882F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 0.9804F, -3.3582F);
        this.neck2.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.0349F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, -1, 26, -0.49F, -0.4543F, -0.0347F, 1, 1, 4, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0299F, -2.8057F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.2648F, -0.3112F, -0.1496F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.8966F, -0.0522F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.123F, 0.0093F, 0.0743F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.8966F, -0.0522F);
        this.head.addChild(upperjaw);


        this.forelegR = new ModelRenderer(this);
        this.forelegR.setRotationPoint(-3.7F, 3.9F, -7.0F);
        this.body.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.0F, 0.48F, 0.0F);


        this.forelegL = new ModelRenderer(this);
        this.forelegL.setRotationPoint(4.0F, 4.0F, -6.6F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.48F, 0.0F);


        this.forelegLx = new ModelRenderer(this);
        this.forelegLx.setRotationPoint(-0.5541F, 0.0F, -1.0644F);
        this.forelegL.addChild(forelegLx);
        this.setRotateAngle(forelegLx, 0.0571F, 0.6084F, 0.1063F);


        this.forelegL2 = new ModelRenderer(this);
        this.forelegL2.setRotationPoint(4.3F, -0.5F, -0.1F);
        this.forelegLx.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 0.0F, 1.1781F);


        this.forelegLx2 = new ModelRenderer(this);
        this.forelegLx2.setRotationPoint(1.3126F, 0.3236F, -0.1347F);
        this.forelegL2.addChild(forelegLx2);
        this.setRotateAngle(forelegLx2, -0.2503F, 0.5385F, 0.123F);


        this.forelegL3 = new ModelRenderer(this);
        this.forelegL3.setRotationPoint(3.9F, 0.0F, 0.05F);
        this.forelegLx2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.1013F, 0.9605F, 0.0736F);


        this.forelegL4 = new ModelRenderer(this);
        this.forelegL4.setRotationPoint(-4.0F, 4.0F, -6.6F);
        this.body.addChild(forelegL4);
        this.setRotateAngle(forelegL4, 0.0F, 0.48F, 0.0F);


        this.forelegLx3 = new ModelRenderer(this);
        this.forelegLx3.setRotationPoint(0.5541F, 0.0F, -1.0644F);
        this.forelegL4.addChild(forelegLx3);
        this.setRotateAngle(forelegLx3, 0.4563F, 0.2098F, 0.12F);


        this.forelegL5 = new ModelRenderer(this);
        this.forelegL5.setRotationPoint(-4.3F, -0.5F, -0.1F);
        this.forelegLx3.addChild(forelegL5);
        this.setRotateAngle(forelegL5, 0.0F, 0.0F, -1.1781F);


        this.forelegLx4 = new ModelRenderer(this);
        this.forelegLx4.setRotationPoint(-1.3126F, 0.3236F, -0.1347F);
        this.forelegL5.addChild(forelegLx4);
        this.setRotateAngle(forelegLx4, -0.1139F, 0.0948F, 0.0957F);


        this.forelegL6 = new ModelRenderer(this);
        this.forelegL6.setRotationPoint(-3.9F, 0.0F, 0.05F);
        this.forelegLx4.addChild(forelegL6);
        this.setRotateAngle(forelegL6, 0.4104F, -1.4278F, -0.7443F);

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
