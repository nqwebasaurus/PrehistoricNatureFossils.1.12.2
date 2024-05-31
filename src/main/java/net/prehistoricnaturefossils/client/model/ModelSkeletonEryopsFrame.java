package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEryopsFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer pole2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer body;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer neck;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer legFL3;
    private final ModelRenderer legFL4;
    private final ModelRenderer legFL5;
    private final ModelRenderer legFL;
    private final ModelRenderer legFL1;
    private final ModelRenderer legFL2;
    private final ModelRenderer headpart;
    private final ModelRenderer head;
    private final ModelRenderer eyeL;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer legHL;
    private final ModelRenderer legHL1;
    private final ModelRenderer legHL2;
    private final ModelRenderer legHL3;
    private final ModelRenderer legHL4;
    private final ModelRenderer legHL5;

    public ModelSkeletonEryopsFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -7.8F, 7.5F, 1, 8, 1, -0.2F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-0.1376F, -4.3F, -4.3536F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, -0.2618F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -2, 1, -4.5F, -0.5F, -0.55F, 9, 1, 1, -0.2F, false));

        this.pole2_r1 = new ModelRenderer(this);
        this.pole2_r1.setRotationPoint(0.1201F, -4.3F, -4.3464F);
        this.fossil.addChild(pole2_r1);
        this.setRotateAngle(pole2_r1, 0.0F, -0.0873F, 0.0F);
        this.pole2_r1.cubeList.add(new ModelBox(pole2_r1, 1, 1, -0.59F, -3.5F, -0.5F, 1, 8, 1, -0.2F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -4.05F, 8.0F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0097F, -0.218F, -0.0447F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, 1, 1, -1.5F, -0.5F, -0.5F, 3, 1, 1, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -9.1F, 1.6F);
        this.fossil.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 27, -1, -0.49F, 0.5411F, -3.2193F, 1, 1, 8, -0.2F, false));

        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 0.55F, 3.6F);
        this.body.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.1833F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 38, 28, -0.5F, -0.1299F, 0.1037F, 1, 1, 6, -0.2F, false));

        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.5F, 1.4F, -6.7F);
        this.body.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0873F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 13, 41, 0.0F, -0.5F, 0.1F, 1, 1, 4, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(-1.0F, 0.4F, -6.6F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0F, -0.2618F, 0.0F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(1.0F, 1.21F, -4.5F);
        this.neck.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.1047F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 47, 31, -0.5F, -0.2995F, 0.0105F, 1, 1, 5, -0.2F, false));

        this.legFL3 = new ModelRenderer(this);
        this.legFL3.setRotationPoint(-3.0F, 3.7F, 0.25F);
        this.neck.addChild(legFL3);
        this.setRotateAngle(legFL3, 0.0F, 0.3491F, 0.0F);


        this.legFL4 = new ModelRenderer(this);
        this.legFL4.setRotationPoint(-2.75F, 1.0F, 0.0F);
        this.legFL3.addChild(legFL4);
        this.setRotateAngle(legFL4, -0.3341F, 0.103F, 0.288F);


        this.legFL5 = new ModelRenderer(this);
        this.legFL5.setRotationPoint(0.0333F, 3.1058F, 0.5725F);
        this.legFL4.addChild(legFL5);
        this.setRotateAngle(legFL5, 0.3631F, 0.3758F, -0.1392F);


        this.legFL = new ModelRenderer(this);
        this.legFL.setRotationPoint(5.0F, 3.7F, 0.25F);
        this.neck.addChild(legFL);
        this.setRotateAngle(legFL, 0.0F, 0.0436F, 0.0F);


        this.legFL1 = new ModelRenderer(this);
        this.legFL1.setRotationPoint(2.75F, 1.0F, 0.0F);
        this.legFL.addChild(legFL1);
        this.setRotateAngle(legFL1, -0.3341F, -0.103F, -0.288F);


        this.legFL2 = new ModelRenderer(this);
        this.legFL2.setRotationPoint(-0.0333F, 3.1058F, 0.5725F);
        this.legFL1.addChild(legFL2);
        this.setRotateAngle(legFL2, 0.3574F, -0.3349F, 0.1556F);


        this.headpart = new ModelRenderer(this);
        this.headpart.setRotationPoint(1.0F, 0.4F, -4.0F);
        this.neck.addChild(headpart);
        this.setRotateAngle(headpart, -0.3927F, -0.3491F, 0.0F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.headpart.addChild(head);


        this.eyeL = new ModelRenderer(this);
        this.eyeL.setRotationPoint(2.0F, -2.0F, -4.0F);
        this.head.addChild(eyeL);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, 0.4F);
        this.headpart.addChild(jaw);
        this.setRotateAngle(jaw, 0.6632F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.0F, 9.1F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.2317F, -0.3405F, 0.0786F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0148F, 1.6711F, 1.6762F);
        this.tail.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.2705F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 0, 48, -0.5222F, -0.7659F, -2.1371F, 1, 1, 4, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.8681F, 3.4546F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0944F, -0.3911F, 0.0361F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.0357F, 1.5129F, 2.033F);
        this.tail2.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.1309F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 42, 46, -0.5535F, -0.7747F, -2.608F, 1, 1, 5, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.6F, 3.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0903F, -0.2608F, -0.0233F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, 0.9989F, -0.0261F);
        this.tail3.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.0873F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 32, 47, -0.5212F, -0.5959F, -0.0186F, 1, 1, 4, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.3489F, 3.9239F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0962F, -0.4346F, -0.0406F);
        this.tail4.cubeList.add(new ModelBox(tail4, 46, 25, -0.7699F, 0.3841F, -0.7092F, 1, 1, 5, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0318F, 3.4333F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.2444F, -0.7703F, -0.1719F);
        this.tail5.cubeList.add(new ModelBox(tail5, 21, 47, -0.4969F, 0.4088F, -0.0265F, 1, 1, 4, -0.2F, false));

        this.legHL = new ModelRenderer(this);
        this.legHL.setRotationPoint(1.0F, 4.6F, 6.4F);
        this.body.addChild(legHL);
        this.setRotateAngle(legHL, 0.0F, -0.4363F, -0.2618F);


        this.legHL1 = new ModelRenderer(this);
        this.legHL1.setRotationPoint(4.7659F, 0.5588F, -0.25F);
        this.legHL.addChild(legHL1);
        this.setRotateAngle(legHL1, 0.5671F, 0.0057F, -0.0433F);


        this.legHL2 = new ModelRenderer(this);
        this.legHL2.setRotationPoint(-0.4047F, 4.4868F, 1.2914F);
        this.legHL1.addChild(legHL2);
        this.setRotateAngle(legHL2, -0.5476F, -1.0988F, 0.7298F);


        this.legHL3 = new ModelRenderer(this);
        this.legHL3.setRotationPoint(-1.0F, 4.6F, 6.4F);
        this.body.addChild(legHL3);
        this.setRotateAngle(legHL3, 0.0F, -0.4363F, 0.2618F);


        this.legHL4 = new ModelRenderer(this);
        this.legHL4.setRotationPoint(-4.7659F, 0.5588F, -0.25F);
        this.legHL3.addChild(legHL4);
        this.setRotateAngle(legHL4, -0.4416F, 0.606F, 0.1253F);


        this.legHL5 = new ModelRenderer(this);
        this.legHL5.setRotationPoint(0.4047F, 4.4868F, 1.2914F);
        this.legHL4.addChild(legHL5);
        this.setRotateAngle(legHL5, 0.559F, 0.5315F, -0.0999F);

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
