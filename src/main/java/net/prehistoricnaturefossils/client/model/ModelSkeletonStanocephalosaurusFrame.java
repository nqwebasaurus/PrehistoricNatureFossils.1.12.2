package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonStanocephalosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer body;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer armL;
    private final ModelRenderer armL2;
    private final ModelRenderer armL3;
    private final ModelRenderer armL4;
    private final ModelRenderer armL5;
    private final ModelRenderer armL6;
    private final ModelRenderer body2;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer body3;
    private final ModelRenderer legL;
    private final ModelRenderer legL2;
    private final ModelRenderer legL3;
    private final ModelRenderer legL4;
    private final ModelRenderer legL5;
    private final ModelRenderer legL6;
    private final ModelRenderer tail1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer upperjaw;

    public ModelSkeletonStanocephalosaurusFrame() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 1.45F, -1.9F, 4.15F, 1, 2, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.51F, -1.9F, -4.4F, 1, 2, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-0.5F, -1.0F, -4.4F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, -0.0175F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -1, 1, -3.0F, -1.0F, 0.0F, 7, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(1.5F, -1.75F, 4.8F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, 0.5061F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, 0, 1, -2.0F, -0.48F, -0.5F, 5, 1, 1, -0.1F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.2F, 4.0F);
        this.fossil.addChild(body);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, 0.3F, -8.75F);
        this.body.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.0052F, 0.0175F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 15, 25, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.1F, false));

        this.armL = new ModelRenderer(this);
        this.armL.setRotationPoint(3.3F, 0.0F, -8.0F);
        this.body.addChild(armL);
        this.setRotateAngle(armL, 0.1763F, 0.1708F, 0.2204F);


        this.armL2 = new ModelRenderer(this);
        this.armL2.setRotationPoint(1.8527F, 0.7078F, 0.0073F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 1.346F, 1.169F, 2.5851F);


        this.armL3 = new ModelRenderer(this);
        this.armL3.setRotationPoint(1.8722F, 0.1213F, -0.3408F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, -0.006F, -1.3617F, -0.0016F);


        this.armL4 = new ModelRenderer(this);
        this.armL4.setRotationPoint(-3.3F, 0.0F, -8.0F);
        this.body.addChild(armL4);
        this.setRotateAngle(armL4, -0.1546F, -0.0441F, -0.3441F);


        this.armL5 = new ModelRenderer(this);
        this.armL5.setRotationPoint(-1.8527F, 0.7078F, 0.0073F);
        this.armL4.addChild(armL5);
        this.setRotateAngle(armL5, 0.0F, -1.2654F, -1.2217F);


        this.armL6 = new ModelRenderer(this);
        this.armL6.setRotationPoint(-1.8722F, 0.1213F, -0.3408F);
        this.armL5.addChild(armL6);
        this.setRotateAngle(armL6, 0.0047F, 1.4483F, -0.001F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.9F, -4.35F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0452F, 0.2615F, -0.0117F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(-0.1F, 1.2281F, 1.551F);
        this.body2.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.0F, -0.0436F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 10, 29, -0.45F, -0.5F, -1.5F, 1, 1, 3, -0.1F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0519F, 3.1033F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0452F, 0.2615F, -0.0117F);
        this.body3.cubeList.add(new ModelBox(body3, -1, -1, -0.5F, 0.6796F, -0.6046F, 1, 1, 4, -0.1F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(2.25F, 0.5023F, 2.2431F);
        this.body3.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.6981F, 0.0873F);


        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(2.2819F, 0.4436F, 0.1704F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, -1.3236F, -1.0942F, 2.6821F);


        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(1.6029F, 0.0393F, -0.4269F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, -0.8553F, 1.2412F, 0.3494F);


        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(-2.25F, 0.5023F, 2.2431F);
        this.body3.addChild(legL4);
        this.setRotateAngle(legL4, 0.1423F, -0.3431F, -0.0123F);


        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(-2.2819F, 0.4436F, 0.1704F);
        this.legL4.addChild(legL5);
        this.setRotateAngle(legL5, 0.8861F, 0.9212F, -0.2735F);


        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(-1.6029F, 0.0393F, -0.4269F);
        this.legL5.addChild(legL6);
        this.setRotateAngle(legL6, -0.0313F, -1.1015F, -1.2614F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0439F, 3.0386F);
        this.body3.addChild(tail1);
        this.setRotateAngle(tail1, -0.0883F, 0.218F, -0.0097F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 1.1473F, 0.0356F);
        this.tail1.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.0439F, 0.1885F, 0.0019F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 30, 4, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0173F, 2.8356F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0883F, 0.218F, -0.0097F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.5F, 1.0319F, -0.0228F);
        this.tail2.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.132F, 0.1298F, 0.0172F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 24, 23, -0.5F, -0.5F, 0.0F, 1, 1, 4, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.07F, 3.8577F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0888F, 0.2615F, 0.0117F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(1.0F, 0.4708F, -0.0548F);
        this.tail3.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, 0.0873F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 22, 7, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.1F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.7F, -8.25F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.1745F, -0.3491F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 16, 32, -0.5F, 0.5F, -2.9F, 1, 1, 3, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2F, -1.85F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.1255F, -0.1655F, 0.153F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.9F, -0.1F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.3491F, 0.0F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.0436F, 0.0F, 0.0F);

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
