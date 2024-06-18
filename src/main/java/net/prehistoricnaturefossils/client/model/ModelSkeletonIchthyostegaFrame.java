package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonIchthyostegaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer body;
    private final ModelRenderer bodyfront;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer armL;
    private final ModelRenderer armL2;
    private final ModelRenderer handL;
    private final ModelRenderer armL3;
    private final ModelRenderer armL4;
    private final ModelRenderer handL2;
    private final ModelRenderer bodyfront2;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head;
    private final ModelRenderer upperjaw1;
    private final ModelRenderer snout;
    private final ModelRenderer lowerjaw1;
    private final ModelRenderer lowerjaw2;
    private final ModelRenderer underjaw;
    private final ModelRenderer bodyrear;
    private final ModelRenderer tailbase;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer legL3;
    private final ModelRenderer legL4;
    private final ModelRenderer footL2;
    private final ModelRenderer legL;
    private final ModelRenderer legL2;
    private final ModelRenderer footL;
    private final ModelRenderer tail1;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonIchthyostegaFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.31F, -3.9F, 8.75F, 1, 4, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 0.65F, -6.9F, -9.25F, 1, 7, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(0.7F, -3.75F, -8.85F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0039F, -0.2181F, 0.0694F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -2, 1, -4.0F, -0.5F, -0.5F, 8, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.65F, -1.55F, 8.65F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, 0.1833F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -1, 1, -3.0F, -1.0F, 0.001F, 5, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -5.2F, 0.0F);
        this.fossil.addChild(root);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6F, 0.0F);
        this.root.addChild(body);
        this.setRotateAngle(body, -0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 22, -0.5F, -0.05F, -3.5F, 1, 1, 6, -0.1F, false));

        this.bodyfront = new ModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, -0.7F, -3.3F);
        this.body.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0F, -0.1745F, 0.0F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.5F, 1.35F, -4.8F);
        this.bodyfront.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0436F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 32, 17, -1.0F, -0.5F, -0.1F, 1, 1, 5, -0.1F, false));

        this.armL = new ModelRenderer(this);
        this.armL.setRotationPoint(3.75F, 4.5F, -5.95F);
        this.bodyfront.addChild(armL);
        this.setRotateAngle(armL, -0.2992F, -0.833F, 0.8226F);


        this.armL2 = new ModelRenderer(this);
        this.armL2.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 0.0F, 0.829F, 0.1309F);


        this.handL = new ModelRenderer(this);
        this.handL.setRotationPoint(2.5F, 0.0F, 0.25F);
        this.armL2.addChild(handL);
        this.setRotateAngle(handL, 0.49F, 0.4431F, -0.6164F);


        this.armL3 = new ModelRenderer(this);
        this.armL3.setRotationPoint(-3.75F, 4.5F, -5.95F);
        this.bodyfront.addChild(armL3);
        this.setRotateAngle(armL3, 0.406F, 0.9778F, -0.6259F);


        this.armL4 = new ModelRenderer(this);
        this.armL4.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.armL3.addChild(armL4);
        this.setRotateAngle(armL4, 0.0948F, -0.8249F, -0.2597F);


        this.handL2 = new ModelRenderer(this);
        this.handL2.setRotationPoint(-2.5F, 0.0F, 0.25F);
        this.armL4.addChild(handL2);
        this.setRotateAngle(handL2, -0.0211F, -0.4172F, 1.0952F);


        this.bodyfront2 = new ModelRenderer(this);
        this.bodyfront2.setRotationPoint(0.0F, 0.2F, -4.9F);
        this.bodyfront.addChild(bodyfront2);
        this.setRotateAngle(bodyfront2, -0.1309F, -0.2182F, 0.0F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 0.2551F, -3.2224F);
        this.bodyfront2.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.1222F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 33, 42, -0.5F, -0.0551F, -0.0776F, 1, 1, 4, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4F, -2.65F);
        this.bodyfront2.addChild(head);
        this.setRotateAngle(head, -0.219F, -0.0852F, 0.0189F);


        this.upperjaw1 = new ModelRenderer(this);
        this.upperjaw1.setRotationPoint(0.0F, 0.9744F, -4.6638F);
        this.head.addChild(upperjaw1);


        this.snout = new ModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 0.4F, 0.4F);
        this.upperjaw1.addChild(snout);
        this.setRotateAngle(snout, 0.1852F, 0.0F, -0.0035F);


        this.lowerjaw1 = new ModelRenderer(this);
        this.lowerjaw1.setRotationPoint(0.0F, 1.4744F, 0.3362F);
        this.head.addChild(lowerjaw1);
        this.setRotateAngle(lowerjaw1, 0.6545F, 0.0F, 0.0F);


        this.lowerjaw2 = new ModelRenderer(this);
        this.lowerjaw2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.lowerjaw1.addChild(lowerjaw2);


        this.underjaw = new ModelRenderer(this);
        this.underjaw.setRotationPoint(0.0F, 0.5F, -2.7F);
        this.lowerjaw2.addChild(underjaw);
        this.setRotateAngle(underjaw, -0.2037F, 0.0F, 0.0F);


        this.bodyrear = new ModelRenderer(this);
        this.bodyrear.setRotationPoint(0.0F, -0.6F, 2.2F);
        this.body.addChild(bodyrear);
        this.setRotateAngle(bodyrear, 0.0436F, 0.0F, 0.0F);
        this.bodyrear.cubeList.add(new ModelBox(bodyrear, 25, 3, -0.49F, 0.5621F, -0.0772F, 1, 1, 6, -0.1F, false));

        this.tailbase = new ModelRenderer(this);
        this.tailbase.setRotationPoint(0.0F, 0.0121F, 5.9228F);
        this.bodyrear.addChild(tailbase);
        this.setRotateAngle(tailbase, 0.0436F, 0.1745F, 0.0F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 1.1634F, 1.393F);
        this.tailbase.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0698F, 0.0174F, -0.0012F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 42, 39, -0.44F, -0.5F, -2.0F, 1, 1, 4, -0.1F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(-2.0F, 2.9757F, 1.7424F);
        this.tailbase.addChild(legL3);
        this.setRotateAngle(legL3, 0.5815F, 0.4327F, -0.5383F);


        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(-2.55F, -0.5F, 0.25F);
        this.legL3.addChild(legL4);
        this.setRotateAngle(legL4, -0.1309F, 0.5672F, -0.1309F);


        this.footL2 = new ModelRenderer(this);
        this.footL2.setRotationPoint(-2.3F, 0.1F, 0.0F);
        this.legL4.addChild(footL2);
        this.setRotateAngle(footL2, -0.3927F, 0.1745F, -0.3054F);


        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(2.0F, 2.9757F, 1.7424F);
        this.tailbase.addChild(legL);
        this.setRotateAngle(legL, 0.5711F, -0.3961F, 0.5643F);


        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(2.55F, -0.5F, 0.25F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, -0.0436F, -0.5672F, 0.1309F);


        this.footL = new ModelRenderer(this);
        this.footL.setRotationPoint(2.3F, 0.1F, 0.0F);
        this.legL2.addChild(footL);
        this.setRotateAngle(footL, -0.2618F, -0.1745F, 0.3054F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.2F, 2.7F);
        this.tailbase.addChild(tail1);
        this.setRotateAngle(tail1, -0.1355F, 0.2595F, -0.035F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 43, -0.5F, 0.5328F, 0.0441F, 1, 1, 3, -0.1F, false));

        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(1.85F, -0.0172F, 14.8941F);
        this.tail1.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, 0.2045F, -0.3049F, -0.0242F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, -4, 39, -0.5F, -0.445F, 0.0F, 1, 1, 7, -0.1F, false));

        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.4F, 0.5828F, 6.4941F);
        this.tail1.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.0711F, 0.1564F, 0.0091F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, -6, 37, -0.5F, -0.5F, 0.0F, 1, 1, 9, -0.1F, false));

        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, 1.0328F, 2.7441F);
        this.tail1.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, 0.1222F, 0.1047F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, -1, 42, -0.5F, -0.5F, 0.0F, 1, 1, 4, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1624F, 5.0008F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0894F, 0.2173F, 0.0193F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.8962F, 6.1628F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0263F, -0.0872F, 0.0023F);


        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.4F, 4.5026F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1473F, -0.4755F, -0.0678F);

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
