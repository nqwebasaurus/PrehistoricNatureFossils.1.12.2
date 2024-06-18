package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEdaphosaurusFrame extends ModelBase {
    private final ModelRenderer body;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer neck;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer body2;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer tail;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer hindlegL;
    private final ModelRenderer hindlegL1;
    private final ModelRenderer hindlegL2;
    private final ModelRenderer hindlegL3;
    private final ModelRenderer hindlegL5;
    private final ModelRenderer hindlegL6;
    private final ModelRenderer hindlegL7;
    private final ModelRenderer hindlegL8;
    private final ModelRenderer hindlegL4;
    private final ModelRenderer frontlegL;
    private final ModelRenderer frontlegL1;
    private final ModelRenderer frontlegL2;
    private final ModelRenderer frontlegL3;
    private final ModelRenderer frontlegL5;
    private final ModelRenderer frontlegL6;
    private final ModelRenderer frontlegL7;
    private final ModelRenderer frontlegL8;
    private final ModelRenderer frontlegL4;

    public ModelSkeletonEdaphosaurusFrame() {
        this.textureWidth = 68;
        this.textureHeight = 68;

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 12.5F, -5.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, 0.55F, -1.85F, 1, 1, 9, -0.1F, false));
        this.body.cubeList.add(new ModelBox(body, 1, 1, -2.0F, 1.6F, 13.0F, 1, 10, 1, -0.1F, false));
        this.body.cubeList.add(new ModelBox(body, 1, 1, -0.5F, 1.6F, -6.5F, 1, 10, 1, -0.1F, false));
        this.body.cubeList.add(new ModelBox(body, -2, 1, -4.0F, 4.5F, -6.5F, 8, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.3304F, 4.5F, 7.1586F);
        this.body.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, -0.3054F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -1, 1, -2.5F, -0.5F, 6.0F, 5, 1, 1, -0.1F, false));

        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, 1.65F, -8.5F);
        this.body.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0873F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 10, 25, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.1F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.65F, -8.5F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.0452F, 0.2615F, -0.0117F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 0.5F, -3.25F);
        this.neck.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.1309F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 43, 14, -0.5F, -0.5F, -1.0F, 1, 1, 5, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.6F, -3.75F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.3518F, 0.123F, -0.045F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 1.0472F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -0.2182F, 0.0F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(-0.5F, 1.6F, 5.0F);
        this.body2.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.2182F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 0, 32, 0.0F, -0.8473F, -0.1967F, 1, 1, 6, -0.1F, false));

        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-0.5F, 1.6F, 1.5F);
        this.body2.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.0436F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 0, 40, 0.0F, -1.0F, -1.5F, 1, 1, 5, -0.1F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.25F, 10.55F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.2778F, -0.3367F, 0.0939F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.0F, 1.0817F, -0.8709F);
        this.tail.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.1309F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 0, 11, -0.5F, -0.5F, 1.0F, 1, 1, 9, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.0817F, 9.0291F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, -0.4363F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 14, -0.5F, 0.85F, -0.6F, 1, 1, 9, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 8.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2315F, -0.6973F, 0.0366F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, 1.1005F, -0.2218F);
        this.tail3.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.0873F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 25, 9, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.6995F, 6.1782F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0285F, -0.6049F, -0.0911F);
        this.tail4.cubeList.add(new ModelBox(tail4, 24, 0, -0.5F, 0.7087F, 0.1084F, 1, 1, 7, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.2087F, 6.7584F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1745F, -0.6981F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 18, 39, -0.5F, 0.5F, 0.0F, 1, 1, 5, -0.1F, false));

        this.hindlegL = new ModelRenderer(this);
        this.hindlegL.setRotationPoint(2.5F, 5.5F, 8.0F);
        this.body2.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 0.3491F, 0.0F);


        this.hindlegL1 = new ModelRenderer(this);
        this.hindlegL1.setRotationPoint(0.0F, -1.0F, -0.5F);
        this.hindlegL.addChild(hindlegL1);
        this.setRotateAngle(hindlegL1, 0.5672F, 0.0F, -1.2217F);


        this.hindlegL2 = new ModelRenderer(this);
        this.hindlegL2.setRotationPoint(-0.7214F, 3.7443F, -0.1F);
        this.hindlegL1.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0F, 0.0F, 1.2217F);


        this.hindlegL3 = new ModelRenderer(this);
        this.hindlegL3.setRotationPoint(-0.5F, 4.0F, 0.6F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.0F, -0.6981F, 0.0F);


        this.hindlegL5 = new ModelRenderer(this);
        this.hindlegL5.setRotationPoint(-2.5F, 5.5F, 8.0F);
        this.body2.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 0.0F, -0.3491F, 0.0F);


        this.hindlegL6 = new ModelRenderer(this);
        this.hindlegL6.setRotationPoint(0.0F, -1.0F, -0.5F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, -0.4068F, 0.1624F, 1.5809F);


        this.hindlegL7 = new ModelRenderer(this);
        this.hindlegL7.setRotationPoint(0.7214F, 3.7443F, -0.1F);
        this.hindlegL6.addChild(hindlegL7);
        this.setRotateAngle(hindlegL7, 0.0F, 0.48F, -1.309F);


        this.hindlegL8 = new ModelRenderer(this);
        this.hindlegL8.setRotationPoint(0.5F, 4.0F, 0.6F);
        this.hindlegL7.addChild(hindlegL8);
        this.setRotateAngle(hindlegL8, 0.829F, 0.6981F, 0.0F);


        this.hindlegL4 = new ModelRenderer(this);
        this.hindlegL4.setRotationPoint(-2.5F, 5.5F, 8.0F);
        this.body2.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, 0.0F, -0.3491F, 0.0F);


        this.frontlegL = new ModelRenderer(this);
        this.frontlegL.setRotationPoint(3.0F, 5.5F, -5.5F);
        this.body.addChild(frontlegL);
        this.setRotateAngle(frontlegL, 0.0F, -0.6981F, 0.0F);


        this.frontlegL1 = new ModelRenderer(this);
        this.frontlegL1.setRotationPoint(0.0518F, -1.0F, -0.8556F);
        this.frontlegL.addChild(frontlegL1);
        this.setRotateAngle(frontlegL1, -1.0577F, 0.3463F, -1.0328F);


        this.frontlegL2 = new ModelRenderer(this);
        this.frontlegL2.setRotationPoint(-0.4172F, 4.5801F, -0.4785F);
        this.frontlegL1.addChild(frontlegL2);
        this.setRotateAngle(frontlegL2, -0.5672F, -0.3054F, 1.2217F);


        this.frontlegL3 = new ModelRenderer(this);
        this.frontlegL3.setRotationPoint(-0.5F, 4.0F, 0.0F);
        this.frontlegL2.addChild(frontlegL3);
        this.setRotateAngle(frontlegL3, 1.1781F, 0.0F, 0.0F);


        this.frontlegL5 = new ModelRenderer(this);
        this.frontlegL5.setRotationPoint(-3.0F, 5.5F, -5.5F);
        this.body.addChild(frontlegL5);
        this.setRotateAngle(frontlegL5, 0.0F, 0.6981F, 0.0F);


        this.frontlegL6 = new ModelRenderer(this);
        this.frontlegL6.setRotationPoint(-0.0518F, -1.0F, -0.8556F);
        this.frontlegL5.addChild(frontlegL6);
        this.setRotateAngle(frontlegL6, 0.0F, 0.0F, 1.2217F);


        this.frontlegL7 = new ModelRenderer(this);
        this.frontlegL7.setRotationPoint(0.4172F, 4.5801F, -0.4785F);
        this.frontlegL6.addChild(frontlegL7);
        this.setRotateAngle(frontlegL7, 0.6109F, -0.3491F, -1.2217F);


        this.frontlegL8 = new ModelRenderer(this);
        this.frontlegL8.setRotationPoint(0.5F, 4.0F, 0.0F);
        this.frontlegL7.addChild(frontlegL8);
        this.setRotateAngle(frontlegL8, -0.2618F, 0.0F, 0.0F);


        this.frontlegL4 = new ModelRenderer(this);
        this.frontlegL4.setRotationPoint(-3.0F, 5.5F, -5.5F);
        this.body.addChild(frontlegL4);
        this.setRotateAngle(frontlegL4, 0.0F, 0.6981F, 0.0F);

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
