package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLabidosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer body;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer neck;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer upperjaw;
    private final ModelRenderer leg;
    private final ModelRenderer legs;
    private final ModelRenderer foot;
    private final ModelRenderer leg2;
    private final ModelRenderer legs2;
    private final ModelRenderer foot2;
    private final ModelRenderer bodyback;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer leg4;
    private final ModelRenderer legs4;
    private final ModelRenderer foot4;
    private final ModelRenderer leg3;
    private final ModelRenderer legs3;
    private final ModelRenderer foot3;

    public ModelSkeletonLabidosaurusFrame() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.495F, -5.9F, 9.6F, 1, 6, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.495F, -5.9F, -6.5F, 1, 6, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(0.5F, -3.75F, -6.0F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, 0.0436F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -2, 1, -4.0F, -0.5F, -0.5F, 7, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -4.75F, 10.2F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, -0.0873F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -1, 1, -3.0F, -0.49F, -0.5F, 6, 1, 1, -0.1F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.0F, 1.0F);
        this.fossil.addChild(body);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, 1.0F, -8.5F);
        this.body.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0873F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 11, 10, -0.5F, -0.3F, 0.0F, 1, 1, 8, -0.1F, false));

        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 0.4F, -0.9F);
        this.body.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.0349F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 16, 2, -0.495F, -0.35F, -0.1F, 1, 1, 7, -0.1F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.2F, -8.2F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.2823F, 0.3786F, -0.1068F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.01F, 0.9254F, -1.054F);
        this.neck.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.0087F, -0.0436F, -0.0004F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 0, 40, -0.5F, -0.45F, -1.5F, 1, 1, 3, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.05F, -2.7F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.0239F, 0.4751F, 0.3513F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.8848F, 0.1736F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.4363F, 0.0F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 1.9848F, 0.1736F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.0436F, 0.0F, 0.0F);


        this.leg = new ModelRenderer(this);
        this.leg.setRotationPoint(3.0F, 3.0F, -7.25F);
        this.body.addChild(leg);
        this.setRotateAngle(leg, 0.0F, -0.4363F, 0.0F);


        this.legs = new ModelRenderer(this);
        this.legs.setRotationPoint(3.0387F, 0.0F, -0.6532F);
        this.leg.addChild(legs);
        this.setRotateAngle(legs, -0.3491F, 0.0F, 0.0F);


        this.foot = new ModelRenderer(this);
        this.foot.setRotationPoint(-0.25F, 3.25F, 0.0F);
        this.legs.addChild(foot);
        this.setRotateAngle(foot, 0.3491F, 0.0F, 0.0F);


        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(-3.0F, 3.0F, -7.25F);
        this.body.addChild(leg2);
        this.setRotateAngle(leg2, 0.9124F, 0.7429F, 0.3778F);


        this.legs2 = new ModelRenderer(this);
        this.legs2.setRotationPoint(-3.0387F, 0.0F, -0.6532F);
        this.leg2.addChild(legs2);
        this.setRotateAngle(legs2, -1.3963F, 0.0F, 0.0F);


        this.foot2 = new ModelRenderer(this);
        this.foot2.setRotationPoint(0.25F, 3.25F, 0.0F);
        this.legs2.addChild(foot2);
        this.setRotateAngle(foot2, 1.1345F, 0.0F, 0.0F);


        this.bodyback = new ModelRenderer(this);
        this.bodyback.setRotationPoint(0.0F, -0.25F, 6.0F);
        this.body.addChild(bodyback);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 1.4F, 0.0F);
        this.bodyback.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.1396F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 0, 18, -0.5F, -0.8F, -0.35F, 1, 1, 6, -0.1F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.85F, 5.55F);
        this.bodyback.addChild(tail1);
        this.setRotateAngle(tail1, -0.2355F, 0.3829F, -0.0894F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 1.3709F, -0.2346F);
        this.tail1.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0349F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 18, 31, -0.5F, -0.85F, 0.0F, 1, 1, 5, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1709F, 4.8154F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.1034F, 0.5648F, -0.0555F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.0F, 1.0152F, 2.8264F);
        this.tail2.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.0F, -0.0436F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 17, 21, -0.5F, -0.5F, -3.5F, 1, 1, 7, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0848F, 5.8764F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1231F, 0.7816F, 0.0869F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, 1.0952F, 2.6959F);
        this.tail3.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, 0.0F, 0.0436F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 9, 20, -0.5F, -0.5F, -3.0F, 1, 1, 6, -0.1F, false));

        this.leg4 = new ModelRenderer(this);
        this.leg4.setRotationPoint(3.0F, 2.25F, 2.5F);
        this.bodyback.addChild(leg4);
        this.setRotateAngle(leg4, -0.0797F, 0.7383F, -0.1181F);


        this.legs4 = new ModelRenderer(this);
        this.legs4.setRotationPoint(3.25F, 1.0F, 0.5F);
        this.leg4.addChild(legs4);
        this.setRotateAngle(legs4, -0.3722F, -0.5082F, 0.0469F);


        this.foot4 = new ModelRenderer(this);
        this.foot4.setRotationPoint(-0.25F, 3.25F, 0.0F);
        this.legs4.addChild(foot4);
        this.setRotateAngle(foot4, 0.492F, -0.1338F, -0.0257F);


        this.leg3 = new ModelRenderer(this);
        this.leg3.setRotationPoint(-3.0F, 2.25F, 2.5F);
        this.bodyback.addChild(leg3);
        this.setRotateAngle(leg3, 0.0F, 0.1309F, 0.0F);


        this.legs3 = new ModelRenderer(this);
        this.legs3.setRotationPoint(-3.25F, 1.0F, 0.5F);
        this.leg3.addChild(legs3);
        this.setRotateAngle(legs3, 0.3491F, 0.5236F, 0.0F);


        this.foot3 = new ModelRenderer(this);
        this.foot3.setRotationPoint(0.25F, 3.25F, 0.0F);
        this.legs3.addChild(foot3);
        this.setRotateAngle(foot3, -0.3491F, 0.1745F, -0.0524F);

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
