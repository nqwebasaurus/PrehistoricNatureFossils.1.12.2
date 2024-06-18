package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonJonkeriaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer body1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer chest1;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer neck1;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head1;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer head4;
    private final ModelRenderer fang1;
    private final ModelRenderer fang2;
    private final ModelRenderer upperteeth2;
    private final ModelRenderer upperteeth1;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer lowerfang1;
    private final ModelRenderer lowerteeth2;
    private final ModelRenderer jaw4;
    private final ModelRenderer lowerteeth1;
    private final ModelRenderer gums1;
    private final ModelRenderer gums2;
    private final ModelRenderer upperarm1;
    private final ModelRenderer arm1;
    private final ModelRenderer hand1;
    private final ModelRenderer upperarm2;
    private final ModelRenderer arm2;
    private final ModelRenderer hand2;
    private final ModelRenderer body2;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer basin1;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer upperleg1;
    private final ModelRenderer leg1;
    private final ModelRenderer feet1;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer feet2;

    public ModelSkeletonJonkeriaFrame() {
        this.textureWidth = 120;
        this.textureHeight = 120;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 0.85F, -24.9F, 21.5F, 1, 25, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -1.75F, -27.9F, -13.0F, 1, 28, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-1.25F, -16.0F, -13.0F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0233F, 0.2608F, 0.0903F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -9, 1, -11.0F, -1.0F, 0.0F, 22, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(1.5F, -17.5F, 21.5F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, -0.0117F, 0.2615F, -0.0452F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -4, 1, -6.0F, -1.0F, 0.0F, 12, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -5.9F, 2.5F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(-1.0F, 3.9964F, -10.8887F);
        this.body1.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.0873F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 45, 57, 0.5F, -1.9755F, 0.3883F, 1, 1, 10, -0.1F, false));

        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(-1.0F, 2.3903F, -1.0975F);
        this.body1.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.0436F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 47, 42, 0.5F, -1.2498F, -0.0052F, 1, 1, 11, -0.1F, false));

        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, 0.5F, -9.7F);
        this.body1.addChild(chest1);
        this.setRotateAngle(chest1, -0.0034F, 0.2093F, 0.0326F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-1.0F, 3.5F, -10.7F);
        this.chest1.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.096F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 49, 14, 0.5F, -1.1034F, -0.3522F, 1, 1, 11, -0.1F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.1F, -11.0F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.1478F, 0.3888F, -0.0564F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 2.9104F, -3.6531F);
        this.neck1.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.262F, -0.0337F, -0.009F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 93, 31, -0.5F, -0.5619F, -0.4129F, 1, 1, 5, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.978F, -4.0342F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.0925F, 0.1738F, -0.016F);
        this.neck2.cubeList.add(new ModelBox(neck2, 93, 64, -0.5F, 1.4644F, -4.225F, 1, 1, 5, -0.1F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.3356F, -3.525F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.008F, 0.3491F, 0.0027F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 2.1656F, -2.977F);
        this.neck3.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.0524F, 0.0174F, -0.0009F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 80, 99, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.1F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, 0.3656F, -3.077F);
        this.neck3.addChild(head1);
        this.setRotateAngle(head1, 0.0484F, 0.4309F, 0.2214F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -0.8374F, -6.9962F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.2276F, 0.0F, 0.0F);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 1.1F, -7.6F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1663F, 0.0F, 0.0F);


        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -2.55F, -0.8F);
        this.head3.addChild(head4);
        this.setRotateAngle(head4, 0.2574F, 0.0F, 0.0F);


        this.fang1 = new ModelRenderer(this);
        this.fang1.setRotationPoint(1.7F, 1.4F, -1.4F);
        this.head3.addChild(fang1);
        this.setRotateAngle(fang1, 0.0911F, 0.0F, 0.0F);


        this.fang2 = new ModelRenderer(this);
        this.fang2.setRotationPoint(-1.7F, 1.4F, -1.4F);
        this.head3.addChild(fang2);
        this.setRotateAngle(fang2, 0.0911F, 0.0F, 0.0F);


        this.upperteeth2 = new ModelRenderer(this);
        this.upperteeth2.setRotationPoint(0.0F, 1.3F, -3.2F);
        this.head3.addChild(upperteeth2);
        this.setRotateAngle(upperteeth2, -0.0456F, 0.0F, 0.0F);


        this.upperteeth1 = new ModelRenderer(this);
        this.upperteeth1.setRotationPoint(0.0F, 1.5F, -4.6F);
        this.head2.addChild(upperteeth1);
        this.setRotateAngle(upperteeth1, 0.1367F, 0.0F, 0.0F);


        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 2.4626F, -1.0962F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.8727F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.0081F, -4.2189F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.2276F, 0.0F, 0.0F);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -1.0F, -6.3F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.1367F, 0.0F, 0.0F);


        this.lowerfang1 = new ModelRenderer(this);
        this.lowerfang1.setRotationPoint(1.7F, -0.8F, -2.6F);
        this.jaw3.addChild(lowerfang1);
        this.setRotateAngle(lowerfang1, -0.0456F, 0.0F, 0.0F);


        this.lowerteeth2 = new ModelRenderer(this);
        this.lowerteeth2.setRotationPoint(0.0F, -0.3F, -4.3F);
        this.jaw3.addChild(lowerteeth2);
        this.setRotateAngle(lowerteeth2, 0.0911F, 0.0F, 0.0F);


        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(0.0F, 1.7F, -0.9F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.2416F, 0.0F, 0.0F);


        this.lowerteeth1 = new ModelRenderer(this);
        this.lowerteeth1.setRotationPoint(0.0F, -2.2F, -3.9F);
        this.jaw2.addChild(lowerteeth1);
        this.setRotateAngle(lowerteeth1, -0.4098F, 0.0F, 0.0F);


        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.0F, 2.4F);
        this.jaw2.addChild(gums1);
        this.setRotateAngle(gums1, -0.5009F, 0.0F, 0.0F);


        this.gums2 = new ModelRenderer(this);
        this.gums2.setRotationPoint(0.0F, 0.0F, 0.3F);
        this.jaw2.addChild(gums2);
        this.setRotateAngle(gums2, -0.4554F, 0.0F, 0.0F);


        this.upperarm1 = new ModelRenderer(this);
        this.upperarm1.setRotationPoint(10.0F, 13.0F, -6.6F);
        this.chest1.addChild(upperarm1);
        this.setRotateAngle(upperarm1, 0.3187F, 0.0F, -0.4098F);


        this.arm1 = new ModelRenderer(this);
        this.arm1.setRotationPoint(-0.436F, 8.5723F, 2.5371F);
        this.upperarm1.addChild(arm1);
        this.setRotateAngle(arm1, -0.3187F, 0.0F, 0.4098F);


        this.hand1 = new ModelRenderer(this);
        this.hand1.setRotationPoint(-1.7141F, 8.263F, -2.3492F);
        this.arm1.addChild(hand1);


        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(-10.0F, 13.0F, -6.6F);
        this.chest1.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 1.0605F, 0.0F, 0.4098F);


        this.arm2 = new ModelRenderer(this);
        this.arm2.setRotationPoint(0.436F, 8.5723F, 2.5371F);
        this.upperarm2.addChild(arm2);
        this.setRotateAngle(arm2, -1.1041F, 0.0F, -0.4098F);


        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(1.7141F, 8.263F, -2.3492F);
        this.arm2.addChild(hand2);
        this.setRotateAngle(hand2, 1.0908F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.6F, 9.3F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, -0.0907F, 0.1308F, 0.006F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(-1.0F, 3.3174F, 0.0559F);
        this.body2.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.1047F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 3, 46, 0.5F, -2.3174F, -0.0559F, 1, 1, 11, -0.1F, false));

        this.basin1 = new ModelRenderer(this);
        this.basin1.setRotationPoint(0.0F, 0.0F, 10.9F);
        this.body2.addChild(basin1);
        this.setRotateAngle(basin1, -0.2264F, 0.1297F, 0.0179F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(-1.0F, 3.6969F, 0.1153F);
        this.basin1.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, -0.2182F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 69, 49, 0.5F, -1.6969F, -0.1153F, 1, 1, 8, -0.1F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.7219F, 7.5672F);
        this.basin1.addChild(tail1);
        this.setRotateAngle(tail1, -0.5044F, 0.4276F, -0.2251F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(-0.5F, 2.114F, 0.8265F);
        this.tail1.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, 0.0436F, 0.2182F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 93, 15, -0.5F, -0.5F, 0.0F, 1, 1, 4, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.386F, 4.8765F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.4649F, 0.4764F, -0.2261F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.0F, 2.2102F, 0.7823F);
        this.tail2.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, 0.3054F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 34, 67, -0.5F, -0.5F, -0.5F, 1, 1, 4, -0.1F, false));

        this.upperleg1 = new ModelRenderer(this);
        this.upperleg1.setRotationPoint(5.8F, 10.5F, 2.9F);
        this.basin1.addChild(upperleg1);
        this.setRotateAngle(upperleg1, -0.3471F, 0.0F, -0.4098F);


        this.leg1 = new ModelRenderer(this);
        this.leg1.setRotationPoint(-1.1421F, 7.3589F, 0.9737F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.6678F, 0.0F, 0.4098F);


        this.feet1 = new ModelRenderer(this);
        this.feet1.setRotationPoint(0.0F, 8.1F, 0.0F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, 0.1309F, 0.0F, 0.0F);


        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(-5.8F, 10.5F, 2.9F);
        this.basin1.addChild(upperleg2);
        this.setRotateAngle(upperleg2, 0.0456F, 0.0F, 0.4098F);


        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(1.1421F, 7.3589F, 0.9737F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.3187F, 0.0F, -0.4098F);


        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(0.0F, 8.1F, 0.0F);
        this.leg2.addChild(feet2);

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
