package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPlacerias extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer body1;
    private final ModelRenderer body1_r1;
    private final ModelRenderer neck16_r1;
    private final ModelRenderer neck15_r1;
    private final ModelRenderer neck14_r1;
    private final ModelRenderer neck19_r1;
    private final ModelRenderer neck18_r1;
    private final ModelRenderer neck17_r1;
    private final ModelRenderer neck18_r2;
    private final ModelRenderer neck17_r2;
    private final ModelRenderer neck16_r2;
    private final ModelRenderer neck17_r3;
    private final ModelRenderer neck16_r3;
    private final ModelRenderer neck15_r2;
    private final ModelRenderer neck16_r4;
    private final ModelRenderer neck15_r3;
    private final ModelRenderer neck14_r2;
    private final ModelRenderer neck15_r4;
    private final ModelRenderer neck14_r3;
    private final ModelRenderer neck13_r1;
    private final ModelRenderer neck14_r4;
    private final ModelRenderer neck12_r1;
    private final ModelRenderer neck13_r2;
    private final ModelRenderer neck13_r3;
    private final ModelRenderer neck11_r1;
    private final ModelRenderer neck12_r2;
    private final ModelRenderer neck10_r1;
    private final ModelRenderer neck11_r2;
    private final ModelRenderer neck12_r3;
    private final ModelRenderer neck18_r3;
    private final ModelRenderer neck17_r4;
    private final ModelRenderer neck16_r5;
    private final ModelRenderer neck17_r5;
    private final ModelRenderer neck16_r6;
    private final ModelRenderer neck15_r5;
    private final ModelRenderer neck16_r7;
    private final ModelRenderer neck15_r6;
    private final ModelRenderer neck14_r5;
    private final ModelRenderer neck15_r7;
    private final ModelRenderer neck14_r6;
    private final ModelRenderer neck13_r4;
    private final ModelRenderer neck14_r7;
    private final ModelRenderer neck13_r5;
    private final ModelRenderer neck12_r4;
    private final ModelRenderer neck13_r6;
    private final ModelRenderer neck12_r5;
    private final ModelRenderer neck11_r3;
    private final ModelRenderer neck12_r6;
    private final ModelRenderer neck11_r4;
    private final ModelRenderer neck10_r2;
    private final ModelRenderer neck11_r5;
    private final ModelRenderer neck10_r3;
    private final ModelRenderer neck9_r1;
    private final ModelRenderer chest1;
    private final ModelRenderer chest_r1;
    private final ModelRenderer chest_r2;
    private final ModelRenderer chest_r3;
    private final ModelRenderer chest_r4;
    private final ModelRenderer chest_r5;
    private final ModelRenderer chest_r6;
    private final ModelRenderer chest1_r1;
    private final ModelRenderer neck8_r1;
    private final ModelRenderer neck11_r6;
    private final ModelRenderer neck10_r4;
    private final ModelRenderer neck9_r2;
    private final ModelRenderer neck8_r2;
    private final ModelRenderer neck9_r3;
    private final ModelRenderer neck10_r5;
    private final ModelRenderer neck7_r1;
    private final ModelRenderer neck8_r3;
    private final ModelRenderer neck7_r2;
    private final ModelRenderer neck6_r1;
    private final ModelRenderer neck8_r4;
    private final ModelRenderer neck9_r4;
    private final ModelRenderer neck10_r6;
    private final ModelRenderer neck7_r3;
    private final ModelRenderer neck8_r5;
    private final ModelRenderer neck9_r5;
    private final ModelRenderer neck8_r6;
    private final ModelRenderer neck7_r4;
    private final ModelRenderer neck6_r2;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer neck6_r3;
    private final ModelRenderer upperarm1;
    private final ModelRenderer lowerarm1;
    private final ModelRenderer hand1;
    private final ModelRenderer upperarm2;
    private final ModelRenderer lowerarm2;
    private final ModelRenderer hand2;
    private final ModelRenderer neck1;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck5_r2;
    private final ModelRenderer neck6_r4;
    private final ModelRenderer neck4_r2;
    private final ModelRenderer neck5_r3;
    private final ModelRenderer head1;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head3_r1;
    private final ModelRenderer head2_r1;
    private final ModelRenderer head1_r1;
    private final ModelRenderer head2;
    private final ModelRenderer head5_r1;
    private final ModelRenderer head5_r2;
    private final ModelRenderer beak1;
    private final ModelRenderer beak1_r1;
    private final ModelRenderer beak2;
    private final ModelRenderer beak3;
    private final ModelRenderer beak4;
    private final ModelRenderer tusk1;
    private final ModelRenderer tusk2_r1;
    private final ModelRenderer fronttusk1;
    private final ModelRenderer tusk2;
    private final ModelRenderer tusk3_r1;
    private final ModelRenderer fronttusk2;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw4_r1;
    private final ModelRenderer lowerbeak1;
    private final ModelRenderer lowerbeak3_r1;
    private final ModelRenderer lowerbeak2;
    private final ModelRenderer lowerbeak4_r1;
    private final ModelRenderer lowerbeak3_r2;
    private final ModelRenderer basin1;
    private final ModelRenderer basin_r1;
    private final ModelRenderer basin_r2;
    private final ModelRenderer basin_r3;
    private final ModelRenderer basin_r4;
    private final ModelRenderer basin_r5;
    private final ModelRenderer basin_r6;
    private final ModelRenderer basin_r7;
    private final ModelRenderer basin_r8;
    private final ModelRenderer basin_r9;
    private final ModelRenderer basin1_r1;
    private final ModelRenderer neck21_r1;
    private final ModelRenderer neck17_r6;
    private final ModelRenderer upperleg1;
    private final ModelRenderer leg1;
    private final ModelRenderer feet1;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer feet2;
    private final ModelRenderer tail1;
    private final ModelRenderer neck24_r1;
    private final ModelRenderer tail2;

    public ModelSkeletonPlacerias() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.9F, -1.7F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);


        this.body1_r1 = new ModelRenderer(this);
        this.body1_r1.setRotationPoint(0.0F, -0.0769F, -5.2245F);
        this.body1.addChild(body1_r1);
        this.setRotateAngle(body1_r1, -0.0175F, 0.0F, 0.0F);
        this.body1_r1.cubeList.add(new ModelBox(body1_r1, 0, 0, -0.9F, -1.0F, -0.1F, 2, 2, 16, 0.0F, false));

        this.neck16_r1 = new ModelRenderer(this);
        this.neck16_r1.setRotationPoint(0.1F, -0.6769F, 9.2755F);
        this.body1.addChild(neck16_r1);
        this.setRotateAngle(neck16_r1, -0.1571F, 0.0F, 0.0F);
        this.neck16_r1.cubeList.add(new ModelBox(neck16_r1, 82, 80, 0.0F, -2.344F, -0.38F, 0, 3, 1, 0.0F, false));

        this.neck15_r1 = new ModelRenderer(this);
        this.neck15_r1.setRotationPoint(0.1F, -0.6769F, 7.2755F);
        this.body1.addChild(neck15_r1);
        this.setRotateAngle(neck15_r1, -0.1222F, 0.0F, 0.0F);
        this.neck15_r1.cubeList.add(new ModelBox(neck15_r1, 66, 26, 0.0F, -2.4835F, -0.3849F, 0, 3, 1, 0.0F, false));

        this.neck14_r1 = new ModelRenderer(this);
        this.neck14_r1.setRotationPoint(0.1F, -0.1769F, -12.7245F);
        this.body1.addChild(neck14_r1);
        this.setRotateAngle(neck14_r1, -0.0698F, 0.0F, 0.0F);
        this.neck14_r1.cubeList.add(new ModelBox(neck14_r1, 70, 14, 0.0F, -4.3774F, 17.5315F, 0, 3, 1, 0.0F, false));
        this.neck14_r1.cubeList.add(new ModelBox(neck14_r1, 0, 19, 0.0F, -4.3774F, 15.5315F, 0, 3, 1, 0.0F, false));
        this.neck14_r1.cubeList.add(new ModelBox(neck14_r1, 68, 72, 0.0F, -4.3774F, 13.5315F, 0, 3, 1, 0.0F, false));
        this.neck14_r1.cubeList.add(new ModelBox(neck14_r1, 79, 80, 0.0F, -4.3774F, 11.5315F, 0, 3, 1, 0.0F, false));
        this.neck14_r1.cubeList.add(new ModelBox(neck14_r1, 0, 73, 0.0F, -4.3774F, 9.5315F, 0, 3, 1, 0.0F, false));
        this.neck14_r1.cubeList.add(new ModelBox(neck14_r1, 3, 73, 0.0F, -4.2774F, 7.5315F, 0, 3, 1, 0.0F, false));

        this.neck19_r1 = new ModelRenderer(this);
        this.neck19_r1.setRotationPoint(-1.1F, 0.4231F, 9.3755F);
        this.body1.addChild(neck19_r1);
        this.setRotateAngle(neck19_r1, -0.0758F, -0.1881F, -1.2604F);
        this.neck19_r1.cubeList.add(new ModelBox(neck19_r1, 37, 15, -9.6791F, -3.3688F, -0.5F, 5, 0, 1, 0.0F, true));

        this.neck18_r1 = new ModelRenderer(this);
        this.neck18_r1.setRotationPoint(-1.1F, 0.4231F, 9.3755F);
        this.body1.addChild(neck18_r1);
        this.setRotateAngle(neck18_r1, -0.1484F, -0.1385F, -0.8209F);
        this.neck18_r1.cubeList.add(new ModelBox(neck18_r1, 63, 83, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck17_r1 = new ModelRenderer(this);
        this.neck17_r1.setRotationPoint(-1.1F, 0.4231F, 9.3755F);
        this.body1.addChild(neck17_r1);
        this.setRotateAngle(neck17_r1, -0.1991F, -0.0378F, -0.2602F);
        this.neck17_r1.cubeList.add(new ModelBox(neck17_r1, 70, 12, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck18_r2 = new ModelRenderer(this);
        this.neck18_r2.setRotationPoint(-1.1F, 0.3231F, 7.3755F);
        this.body1.addChild(neck18_r2);
        this.setRotateAngle(neck18_r2, -0.0623F, -0.1465F, -1.2626F);
        this.neck18_r2.cubeList.add(new ModelBox(neck18_r2, 0, 10, -10.6791F, -3.3688F, -0.5F, 6, 0, 1, 0.0F, true));

        this.neck17_r2 = new ModelRenderer(this);
        this.neck17_r2.setRotationPoint(-1.1F, 0.3231F, 7.3755F);
        this.body1.addChild(neck17_r2);
        this.setRotateAngle(neck17_r2, -0.1185F, -0.1065F, -0.8246F);
        this.neck17_r2.cubeList.add(new ModelBox(neck17_r2, 17, 38, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck16_r2 = new ModelRenderer(this);
        this.neck16_r2.setRotationPoint(-1.1F, 0.3231F, 7.3755F);
        this.body1.addChild(neck16_r2);
        this.setRotateAngle(neck16_r2, -0.1569F, -0.0265F, -0.2616F);
        this.neck16_r2.cubeList.add(new ModelBox(neck16_r2, 45, 50, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck17_r3 = new ModelRenderer(this);
        this.neck17_r3.setRotationPoint(-1.1F, 0.2231F, 5.3755F);
        this.body1.addChild(neck17_r3);
        this.setRotateAngle(neck17_r3, -0.0463F, -0.0966F, -1.2646F);
        this.neck17_r3.cubeList.add(new ModelBox(neck17_r3, 44, 26, -11.6791F, -3.3688F, -0.5F, 7, 0, 1, 0.0F, true));

        this.neck16_r3 = new ModelRenderer(this);
        this.neck16_r3.setRotationPoint(-1.1F, 0.2231F, 5.3755F);
        this.body1.addChild(neck16_r3);
        this.setRotateAngle(neck16_r3, -0.0828F, -0.068F, -0.8277F);
        this.neck16_r3.cubeList.add(new ModelBox(neck16_r3, 47, 0, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck15_r2 = new ModelRenderer(this);
        this.neck15_r2.setRotationPoint(-1.1F, 0.2231F, 5.3755F);
        this.body1.addChild(neck15_r2);
        this.setRotateAngle(neck15_r2, -0.1063F, -0.0129F, -0.2626F);
        this.neck15_r2.cubeList.add(new ModelBox(neck15_r2, 47, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck16_r4 = new ModelRenderer(this);
        this.neck16_r4.setRotationPoint(-1.1F, 0.1231F, 3.4755F);
        this.body1.addChild(neck16_r4);
        this.setRotateAngle(neck16_r4, -0.0358F, -0.0633F, -1.2654F);
        this.neck16_r4.cubeList.add(new ModelBox(neck16_r4, 86, 28, -12.6791F, -3.3688F, -0.5F, 8, 0, 1, 0.0F, true));

        this.neck15_r3 = new ModelRenderer(this);
        this.neck15_r3.setRotationPoint(-1.1F, 0.1231F, 3.4755F);
        this.body1.addChild(neck15_r3);
        this.setRotateAngle(neck15_r3, -0.0592F, -0.0423F, -0.829F);
        this.neck15_r3.cubeList.add(new ModelBox(neck15_r3, 47, 2, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck14_r2 = new ModelRenderer(this);
        this.neck14_r2.setRotationPoint(-1.1F, 0.1231F, 3.4755F);
        this.body1.addChild(neck14_r2);
        this.setRotateAngle(neck14_r2, -0.0726F, -0.0039F, -0.2628F);
        this.neck14_r2.cubeList.add(new ModelBox(neck14_r2, 47, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck15_r4 = new ModelRenderer(this);
        this.neck15_r4.setRotationPoint(-1.1F, 0.0231F, 1.4755F);
        this.body1.addChild(neck15_r4);
        this.setRotateAngle(neck15_r4, -0.0253F, -0.03F, -1.2659F);
        this.neck15_r4.cubeList.add(new ModelBox(neck15_r4, 77, 59, -13.6791F, -3.3688F, -0.5F, 9, 0, 1, 0.0F, true));

        this.neck14_r3 = new ModelRenderer(this);
        this.neck14_r3.setRotationPoint(-1.1F, 0.0231F, 1.4755F);
        this.body1.addChild(neck14_r3);
        this.setRotateAngle(neck14_r3, -0.0356F, -0.0165F, -0.8297F);
        this.neck14_r3.cubeList.add(new ModelBox(neck14_r3, 59, 40, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck13_r1 = new ModelRenderer(this);
        this.neck13_r1.setRotationPoint(-1.1F, 0.0231F, 1.4755F);
        this.body1.addChild(neck13_r1);
        this.setRotateAngle(neck13_r1, -0.0389F, 0.0052F, -0.2628F);
        this.neck13_r1.cubeList.add(new ModelBox(neck13_r1, 0, 61, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck14_r4 = new ModelRenderer(this);
        this.neck14_r4.setRotationPoint(-1.1F, 0.1231F, -0.5245F);
        this.body1.addChild(neck14_r4);
        this.setRotateAngle(neck14_r4, -0.0148F, 0.0033F, -1.266F);
        this.neck14_r4.cubeList.add(new ModelBox(neck14_r4, 66, 35, -14.6791F, -3.3688F, -0.5F, 10, 0, 1, 0.0F, true));

        this.neck12_r1 = new ModelRenderer(this);
        this.neck12_r1.setRotationPoint(-1.1F, 0.1231F, -0.5245F);
        this.body1.addChild(neck12_r1);
        this.setRotateAngle(neck12_r1, -0.0052F, 0.0143F, -0.2625F);
        this.neck12_r1.cubeList.add(new ModelBox(neck12_r1, 69, 45, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck13_r2 = new ModelRenderer(this);
        this.neck13_r2.setRotationPoint(-1.1F, 0.1231F, -0.5245F);
        this.body1.addChild(neck13_r2);
        this.setRotateAngle(neck13_r2, -0.0121F, 0.0092F, -0.8297F);
        this.neck13_r2.cubeList.add(new ModelBox(neck13_r2, 59, 42, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck13_r3 = new ModelRenderer(this);
        this.neck13_r3.setRotationPoint(-1.1F, 0.0231F, -2.5245F);
        this.body1.addChild(neck13_r3);
        this.setRotateAngle(neck13_r3, -0.0044F, 0.0366F, -1.2658F);
        this.neck13_r3.cubeList.add(new ModelBox(neck13_r3, 21, 13, -15.6791F, -3.3688F, -0.5F, 11, 0, 1, 0.0F, true));

        this.neck11_r1 = new ModelRenderer(this);
        this.neck11_r1.setRotationPoint(-1.1F, 0.0231F, -2.5245F);
        this.body1.addChild(neck11_r1);
        this.setRotateAngle(neck11_r1, 0.0285F, 0.0233F, -0.2619F);
        this.neck11_r1.cubeList.add(new ModelBox(neck11_r1, 49, 62, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck12_r2 = new ModelRenderer(this);
        this.neck12_r2.setRotationPoint(-1.1F, 0.0231F, -2.5245F);
        this.body1.addChild(neck12_r2);
        this.setRotateAngle(neck12_r2, 0.0115F, 0.035F, -0.8292F);
        this.neck12_r2.cubeList.add(new ModelBox(neck12_r2, 14, 61, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck10_r1 = new ModelRenderer(this);
        this.neck10_r1.setRotationPoint(-1.1F, 0.0231F, -4.5245F);
        this.body1.addChild(neck10_r1);
        this.setRotateAngle(neck10_r1, 0.0791F, 0.0368F, -0.2603F);
        this.neck10_r1.cubeList.add(new ModelBox(neck10_r1, 0, 63, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck11_r2 = new ModelRenderer(this);
        this.neck11_r2.setRotationPoint(-1.1F, 0.0231F, -4.5245F);
        this.body1.addChild(neck11_r2);
        this.setRotateAngle(neck11_r2, 0.047F, 0.0736F, -0.8273F);
        this.neck11_r2.cubeList.add(new ModelBox(neck11_r2, 14, 63, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck12_r3 = new ModelRenderer(this);
        this.neck12_r3.setRotationPoint(-1.1F, 0.0231F, -4.5245F);
        this.body1.addChild(neck12_r3);
        this.setRotateAngle(neck12_r3, 0.0114F, 0.0865F, -1.2649F);
        this.neck12_r3.cubeList.add(new ModelBox(neck12_r3, 77, 61, -13.6791F, -3.3688F, -0.5F, 9, 0, 1, 0.0F, true));

        this.neck18_r3 = new ModelRenderer(this);
        this.neck18_r3.setRotationPoint(1.1F, 0.4231F, 9.3755F);
        this.body1.addChild(neck18_r3);
        this.setRotateAngle(neck18_r3, -0.0758F, 0.1881F, 1.2604F);
        this.neck18_r3.cubeList.add(new ModelBox(neck18_r3, 37, 15, 4.6791F, -3.3688F, -0.5F, 5, 0, 1, 0.0F, false));

        this.neck17_r4 = new ModelRenderer(this);
        this.neck17_r4.setRotationPoint(1.1F, 0.4231F, 9.3755F);
        this.body1.addChild(neck17_r4);
        this.setRotateAngle(neck17_r4, -0.1484F, 0.1385F, 0.8209F);
        this.neck17_r4.cubeList.add(new ModelBox(neck17_r4, 63, 83, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck16_r5 = new ModelRenderer(this);
        this.neck16_r5.setRotationPoint(1.1F, 0.4231F, 9.3755F);
        this.body1.addChild(neck16_r5);
        this.setRotateAngle(neck16_r5, -0.1991F, 0.0378F, 0.2602F);
        this.neck16_r5.cubeList.add(new ModelBox(neck16_r5, 70, 12, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck17_r5 = new ModelRenderer(this);
        this.neck17_r5.setRotationPoint(1.1F, 0.3231F, 7.3755F);
        this.body1.addChild(neck17_r5);
        this.setRotateAngle(neck17_r5, -0.0623F, 0.1465F, 1.2626F);
        this.neck17_r5.cubeList.add(new ModelBox(neck17_r5, 0, 10, 4.6791F, -3.3688F, -0.5F, 6, 0, 1, 0.0F, false));

        this.neck16_r6 = new ModelRenderer(this);
        this.neck16_r6.setRotationPoint(1.1F, 0.3231F, 7.3755F);
        this.body1.addChild(neck16_r6);
        this.setRotateAngle(neck16_r6, -0.1185F, 0.1065F, 0.8246F);
        this.neck16_r6.cubeList.add(new ModelBox(neck16_r6, 17, 38, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck15_r5 = new ModelRenderer(this);
        this.neck15_r5.setRotationPoint(1.1F, 0.3231F, 7.3755F);
        this.body1.addChild(neck15_r5);
        this.setRotateAngle(neck15_r5, -0.1569F, 0.0265F, 0.2616F);
        this.neck15_r5.cubeList.add(new ModelBox(neck15_r5, 45, 50, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck16_r7 = new ModelRenderer(this);
        this.neck16_r7.setRotationPoint(1.1F, 0.2231F, 5.3755F);
        this.body1.addChild(neck16_r7);
        this.setRotateAngle(neck16_r7, -0.0463F, 0.0966F, 1.2646F);
        this.neck16_r7.cubeList.add(new ModelBox(neck16_r7, 44, 26, 4.6791F, -3.3688F, -0.5F, 7, 0, 1, 0.0F, false));

        this.neck15_r6 = new ModelRenderer(this);
        this.neck15_r6.setRotationPoint(1.1F, 0.2231F, 5.3755F);
        this.body1.addChild(neck15_r6);
        this.setRotateAngle(neck15_r6, -0.0828F, 0.068F, 0.8277F);
        this.neck15_r6.cubeList.add(new ModelBox(neck15_r6, 47, 0, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck14_r5 = new ModelRenderer(this);
        this.neck14_r5.setRotationPoint(1.1F, 0.2231F, 5.3755F);
        this.body1.addChild(neck14_r5);
        this.setRotateAngle(neck14_r5, -0.1063F, 0.0129F, 0.2626F);
        this.neck14_r5.cubeList.add(new ModelBox(neck14_r5, 47, 4, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck15_r7 = new ModelRenderer(this);
        this.neck15_r7.setRotationPoint(1.1F, 0.1231F, 3.4755F);
        this.body1.addChild(neck15_r7);
        this.setRotateAngle(neck15_r7, -0.0358F, 0.0633F, 1.2654F);
        this.neck15_r7.cubeList.add(new ModelBox(neck15_r7, 86, 28, 4.6791F, -3.3688F, -0.5F, 8, 0, 1, 0.0F, false));

        this.neck14_r6 = new ModelRenderer(this);
        this.neck14_r6.setRotationPoint(1.1F, 0.1231F, 3.4755F);
        this.body1.addChild(neck14_r6);
        this.setRotateAngle(neck14_r6, -0.0592F, 0.0423F, 0.829F);
        this.neck14_r6.cubeList.add(new ModelBox(neck14_r6, 47, 2, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck13_r4 = new ModelRenderer(this);
        this.neck13_r4.setRotationPoint(1.1F, 0.1231F, 3.4755F);
        this.body1.addChild(neck13_r4);
        this.setRotateAngle(neck13_r4, -0.0726F, 0.0039F, 0.2628F);
        this.neck13_r4.cubeList.add(new ModelBox(neck13_r4, 47, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck14_r7 = new ModelRenderer(this);
        this.neck14_r7.setRotationPoint(1.1F, 0.0231F, 1.4755F);
        this.body1.addChild(neck14_r7);
        this.setRotateAngle(neck14_r7, -0.0253F, 0.03F, 1.2659F);
        this.neck14_r7.cubeList.add(new ModelBox(neck14_r7, 77, 59, 4.6791F, -3.3688F, -0.5F, 9, 0, 1, 0.0F, false));

        this.neck13_r5 = new ModelRenderer(this);
        this.neck13_r5.setRotationPoint(1.1F, 0.0231F, 1.4755F);
        this.body1.addChild(neck13_r5);
        this.setRotateAngle(neck13_r5, -0.0356F, 0.0165F, 0.8297F);
        this.neck13_r5.cubeList.add(new ModelBox(neck13_r5, 59, 40, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck12_r4 = new ModelRenderer(this);
        this.neck12_r4.setRotationPoint(1.1F, 0.0231F, 1.4755F);
        this.body1.addChild(neck12_r4);
        this.setRotateAngle(neck12_r4, -0.0389F, -0.0052F, 0.2628F);
        this.neck12_r4.cubeList.add(new ModelBox(neck12_r4, 0, 61, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck13_r6 = new ModelRenderer(this);
        this.neck13_r6.setRotationPoint(1.1F, 0.1231F, -0.5245F);
        this.body1.addChild(neck13_r6);
        this.setRotateAngle(neck13_r6, -0.0148F, -0.0033F, 1.266F);
        this.neck13_r6.cubeList.add(new ModelBox(neck13_r6, 66, 35, 4.6791F, -3.3688F, -0.5F, 10, 0, 1, 0.0F, false));

        this.neck12_r5 = new ModelRenderer(this);
        this.neck12_r5.setRotationPoint(1.1F, 0.1231F, -0.5245F);
        this.body1.addChild(neck12_r5);
        this.setRotateAngle(neck12_r5, -0.0121F, -0.0092F, 0.8297F);
        this.neck12_r5.cubeList.add(new ModelBox(neck12_r5, 59, 42, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck11_r3 = new ModelRenderer(this);
        this.neck11_r3.setRotationPoint(1.1F, 0.1231F, -0.5245F);
        this.body1.addChild(neck11_r3);
        this.setRotateAngle(neck11_r3, -0.0052F, -0.0143F, 0.2625F);
        this.neck11_r3.cubeList.add(new ModelBox(neck11_r3, 69, 45, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck12_r6 = new ModelRenderer(this);
        this.neck12_r6.setRotationPoint(1.1F, 0.0231F, -2.5245F);
        this.body1.addChild(neck12_r6);
        this.setRotateAngle(neck12_r6, -0.0044F, -0.0366F, 1.2658F);
        this.neck12_r6.cubeList.add(new ModelBox(neck12_r6, 21, 13, 4.6791F, -3.3688F, -0.5F, 11, 0, 1, 0.0F, false));

        this.neck11_r4 = new ModelRenderer(this);
        this.neck11_r4.setRotationPoint(1.1F, 0.0231F, -2.5245F);
        this.body1.addChild(neck11_r4);
        this.setRotateAngle(neck11_r4, 0.0115F, -0.035F, 0.8292F);
        this.neck11_r4.cubeList.add(new ModelBox(neck11_r4, 14, 61, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck10_r2 = new ModelRenderer(this);
        this.neck10_r2.setRotationPoint(1.1F, 0.0231F, -2.5245F);
        this.body1.addChild(neck10_r2);
        this.setRotateAngle(neck10_r2, 0.0285F, -0.0233F, 0.2619F);
        this.neck10_r2.cubeList.add(new ModelBox(neck10_r2, 49, 62, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck11_r5 = new ModelRenderer(this);
        this.neck11_r5.setRotationPoint(1.1F, 0.0231F, -4.5245F);
        this.body1.addChild(neck11_r5);
        this.setRotateAngle(neck11_r5, 0.0114F, -0.0865F, 1.2649F);
        this.neck11_r5.cubeList.add(new ModelBox(neck11_r5, 77, 61, 4.6791F, -3.3688F, -0.5F, 9, 0, 1, 0.0F, false));

        this.neck10_r3 = new ModelRenderer(this);
        this.neck10_r3.setRotationPoint(1.1F, 0.0231F, -4.5245F);
        this.body1.addChild(neck10_r3);
        this.setRotateAngle(neck10_r3, 0.047F, -0.0736F, 0.8273F);
        this.neck10_r3.cubeList.add(new ModelBox(neck10_r3, 14, 63, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck9_r1 = new ModelRenderer(this);
        this.neck9_r1.setRotationPoint(1.1F, 0.0231F, -4.5245F);
        this.body1.addChild(neck9_r1);
        this.setRotateAngle(neck9_r1, 0.0791F, -0.0368F, 0.2603F);
        this.neck9_r1.cubeList.add(new ModelBox(neck9_r1, 0, 63, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, -0.1239F, -5.3504F);
        this.body1.addChild(chest1);
        this.setRotateAngle(chest1, 0.2202F, 0.0852F, 0.019F);


        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(-6.5F, 16.2377F, -5.5133F);
        this.chest1.addChild(chest_r1);
        this.setRotateAngle(chest_r1, 1.1669F, 0.0F, 0.0822F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 18, 19, 3.1484F, -5.0569F, 0.5204F, 3, 6, 1, 0.0F, true));

        this.chest_r2 = new ModelRenderer(this);
        this.chest_r2.setRotationPoint(-6.5657F, 11.989F, -8.8703F);
        this.chest1.addChild(chest_r2);
        this.setRotateAngle(chest_r2, 0.9327F, -0.5997F, -0.3618F);
        this.chest_r2.cubeList.add(new ModelBox(chest_r2, 84, 8, -0.9504F, -3.5726F, -3.7007F, 2, 6, 4, 0.0F, true));

        this.chest_r3 = new ModelRenderer(this);
        this.chest_r3.setRotationPoint(-6.1F, 5.3377F, 2.3867F);
        this.chest1.addChild(chest_r3);
        this.setRotateAngle(chest_r3, 0.7309F, -0.1166F, 0.1848F);
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 29, 45, -1.5F, -6.1644F, -12.513F, 2, 5, 11, 0.0F, true));

        this.chest_r4 = new ModelRenderer(this);
        this.chest_r4.setRotationPoint(6.5657F, 11.989F, -8.8703F);
        this.chest1.addChild(chest_r4);
        this.setRotateAngle(chest_r4, 0.9327F, 0.5997F, 0.3618F);
        this.chest_r4.cubeList.add(new ModelBox(chest_r4, 84, 8, -1.0496F, -3.5726F, -3.7007F, 2, 6, 4, 0.0F, false));

        this.chest_r5 = new ModelRenderer(this);
        this.chest_r5.setRotationPoint(6.1F, 5.3377F, 2.3867F);
        this.chest1.addChild(chest_r5);
        this.setRotateAngle(chest_r5, 0.7309F, 0.1166F, -0.1848F);
        this.chest_r5.cubeList.add(new ModelBox(chest_r5, 29, 45, -0.5F, -6.1644F, -12.513F, 2, 5, 11, 0.0F, false));

        this.chest_r6 = new ModelRenderer(this);
        this.chest_r6.setRotationPoint(6.5F, 16.2377F, -5.5133F);
        this.chest1.addChild(chest_r6);
        this.setRotateAngle(chest_r6, 1.1669F, 0.0F, -0.0822F);
        this.chest_r6.cubeList.add(new ModelBox(chest_r6, 18, 19, -6.1484F, -5.0569F, 0.5204F, 3, 6, 1, 0.0F, false));

        this.chest1_r1 = new ModelRenderer(this);
        this.chest1_r1.setRotationPoint(0.0F, 0.8992F, -8.8011F);
        this.chest1.addChild(chest1_r1);
        this.setRotateAngle(chest1_r1, 0.0873F, 0.0F, 0.0F);
        this.chest1_r1.cubeList.add(new ModelBox(chest1_r1, 0, 61, -0.9F, -1.0F, 0.0F, 2, 2, 9, 0.001F, false));

        this.neck8_r1 = new ModelRenderer(this);
        this.neck8_r1.setRotationPoint(0.1F, -0.0008F, -7.3011F);
        this.chest1.addChild(neck8_r1);
        this.setRotateAngle(neck8_r1, -0.0698F, 0.0F, 0.0F);
        this.neck8_r1.cubeList.add(new ModelBox(neck8_r1, 13, 0, 0.0F, -4.0774F, 5.5315F, 0, 3, 1, 0.0F, false));
        this.neck8_r1.cubeList.add(new ModelBox(neck8_r1, 73, 14, 0.0F, -3.7774F, 3.5315F, 0, 3, 1, 0.0F, false));
        this.neck8_r1.cubeList.add(new ModelBox(neck8_r1, 15, 73, 0.0F, -3.4774F, 1.5315F, 0, 3, 1, 0.0F, false));
        this.neck8_r1.cubeList.add(new ModelBox(neck8_r1, 18, 73, 0.0F, -3.0774F, -0.4685F, 0, 3, 1, 0.0F, false));

        this.neck11_r6 = new ModelRenderer(this);
        this.neck11_r6.setRotationPoint(-1.1F, 0.1992F, -1.2011F);
        this.chest1.addChild(neck11_r6);
        this.setRotateAngle(neck11_r6, -0.0677F, -0.1631F, -1.2618F);
        this.neck11_r6.cubeList.add(new ModelBox(neck11_r6, 77, 37, -13.6791F, -3.3688F, -0.5F, 9, 0, 1, 0.0F, true));

        this.neck10_r4 = new ModelRenderer(this);
        this.neck10_r4.setRotationPoint(-1.1F, 0.1992F, -1.2011F);
        this.chest1.addChild(neck10_r4);
        this.setRotateAngle(neck10_r4, -0.1304F, -0.1193F, -0.8232F);
        this.neck10_r4.cubeList.add(new ModelBox(neck10_r4, 37, 17, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck9_r2 = new ModelRenderer(this);
        this.neck9_r2.setRotationPoint(-1.1F, 0.1992F, -1.2011F);
        this.chest1.addChild(neck9_r2);
        this.setRotateAngle(neck9_r2, -0.1738F, -0.031F, -0.2611F);
        this.neck9_r2.cubeList.add(new ModelBox(neck9_r2, 46, 13, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck8_r2 = new ModelRenderer(this);
        this.neck8_r2.setRotationPoint(-1.1F, 0.3992F, -3.3011F);
        this.chest1.addChild(neck8_r2);
        this.setRotateAngle(neck8_r2, 0.0791F, 0.0368F, -0.3651F);
        this.neck8_r2.cubeList.add(new ModelBox(neck8_r2, 0, 65, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck9_r3 = new ModelRenderer(this);
        this.neck9_r3.setRotationPoint(-1.1F, 0.3992F, -3.3011F);
        this.chest1.addChild(neck9_r3);
        this.setRotateAngle(neck9_r3, 0.047F, 0.0736F, -0.932F);
        this.neck9_r3.cubeList.add(new ModelBox(neck9_r3, 14, 65, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck10_r5 = new ModelRenderer(this);
        this.neck10_r5.setRotationPoint(-1.1F, 0.3992F, -3.3011F);
        this.chest1.addChild(neck10_r5);
        this.setRotateAngle(neck10_r5, 0.0114F, 0.0865F, -1.3696F);
        this.neck10_r5.cubeList.add(new ModelBox(neck10_r5, 18, 32, -9.6791F, -3.3688F, -0.5F, 5, 0, 1, 0.0F, true));

        this.neck7_r1 = new ModelRenderer(this);
        this.neck7_r1.setRotationPoint(-1.1F, 0.5992F, -5.3011F);
        this.chest1.addChild(neck7_r1);
        this.setRotateAngle(neck7_r1, 0.0791F, 0.0368F, -0.4349F);
        this.neck7_r1.cubeList.add(new ModelBox(neck7_r1, 0, 67, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck8_r3 = new ModelRenderer(this);
        this.neck8_r3.setRotationPoint(-1.1F, 0.5992F, -5.3011F);
        this.chest1.addChild(neck8_r3);
        this.setRotateAngle(neck8_r3, 0.047F, 0.0736F, -1.0018F);
        this.neck8_r3.cubeList.add(new ModelBox(neck8_r3, 79, 21, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck7_r2 = new ModelRenderer(this);
        this.neck7_r2.setRotationPoint(-1.1F, 0.8992F, -7.3011F);
        this.chest1.addChild(neck7_r2);
        this.setRotateAngle(neck7_r2, 0.0376F, 0.0589F, -1.0025F);
        this.neck7_r2.cubeList.add(new ModelBox(neck7_r2, 47, 83, -5.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, true));

        this.neck6_r1 = new ModelRenderer(this);
        this.neck6_r1.setRotationPoint(-1.1F, 0.8992F, -7.3011F);
        this.chest1.addChild(neck6_r1);
        this.setRotateAngle(neck6_r1, 0.0633F, 0.0295F, -0.4354F);
        this.neck6_r1.cubeList.add(new ModelBox(neck6_r1, 14, 67, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck8_r4 = new ModelRenderer(this);
        this.neck8_r4.setRotationPoint(1.1F, 0.1992F, -1.2011F);
        this.chest1.addChild(neck8_r4);
        this.setRotateAngle(neck8_r4, -0.0473F, -0.0029F, 0.2629F);
        this.neck8_r4.cubeList.add(new ModelBox(neck8_r4, 46, 13, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck9_r4 = new ModelRenderer(this);
        this.neck9_r4.setRotationPoint(1.1F, 0.1992F, -1.2011F);
        this.chest1.addChild(neck9_r4);
        this.setRotateAngle(neck9_r4, -0.0415F, 0.0229F, 0.8295F);
        this.neck9_r4.cubeList.add(new ModelBox(neck9_r4, 37, 17, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck10_r6 = new ModelRenderer(this);
        this.neck10_r6.setRotationPoint(1.1F, 0.1992F, -1.2011F);
        this.chest1.addChild(neck10_r6);
        this.setRotateAngle(neck10_r6, -0.0279F, 0.0383F, 1.2658F);
        this.neck10_r6.cubeList.add(new ModelBox(neck10_r6, 77, 37, 4.6791F, -3.3688F, -0.5F, 9, 0, 1, 0.0F, false));

        this.neck7_r3 = new ModelRenderer(this);
        this.neck7_r3.setRotationPoint(1.1F, 0.3992F, -3.3011F);
        this.chest1.addChild(neck7_r3);
        this.setRotateAngle(neck7_r3, 0.0791F, -0.0368F, 0.3651F);
        this.neck7_r3.cubeList.add(new ModelBox(neck7_r3, 0, 65, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck8_r5 = new ModelRenderer(this);
        this.neck8_r5.setRotationPoint(1.1F, 0.3992F, -3.3011F);
        this.chest1.addChild(neck8_r5);
        this.setRotateAngle(neck8_r5, 0.047F, -0.0736F, 0.932F);
        this.neck8_r5.cubeList.add(new ModelBox(neck8_r5, 14, 65, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck9_r5 = new ModelRenderer(this);
        this.neck9_r5.setRotationPoint(1.1F, 0.3992F, -3.3011F);
        this.chest1.addChild(neck9_r5);
        this.setRotateAngle(neck9_r5, 0.0114F, -0.0865F, 1.3696F);
        this.neck9_r5.cubeList.add(new ModelBox(neck9_r5, 18, 32, 4.6791F, -3.3688F, -0.5F, 5, 0, 1, 0.0F, false));

        this.neck8_r6 = new ModelRenderer(this);
        this.neck8_r6.setRotationPoint(1.1F, 0.5992F, -5.3011F);
        this.chest1.addChild(neck8_r6);
        this.setRotateAngle(neck8_r6, 0.0114F, -0.0865F, 1.4394F);
        this.neck8_r6.cubeList.add(new ModelBox(neck8_r6, 77, 63, 4.6791F, -3.3688F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck7_r4 = new ModelRenderer(this);
        this.neck7_r4.setRotationPoint(1.1F, 0.5992F, -5.3011F);
        this.chest1.addChild(neck7_r4);
        this.setRotateAngle(neck7_r4, 0.047F, -0.0736F, 1.0018F);
        this.neck7_r4.cubeList.add(new ModelBox(neck7_r4, 79, 21, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck6_r2 = new ModelRenderer(this);
        this.neck6_r2.setRotationPoint(1.1F, 0.5992F, -5.3011F);
        this.chest1.addChild(neck6_r2);
        this.setRotateAngle(neck6_r2, 0.0791F, -0.0368F, 0.4349F);
        this.neck6_r2.cubeList.add(new ModelBox(neck6_r2, 0, 67, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(1.1F, 0.8992F, -7.3011F);
        this.chest1.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, 0.0633F, -0.0295F, 0.4354F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 14, 67, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck6_r3 = new ModelRenderer(this);
        this.neck6_r3.setRotationPoint(1.1F, 0.8992F, -7.3011F);
        this.chest1.addChild(neck6_r3);
        this.setRotateAngle(neck6_r3, 0.0376F, -0.0589F, 1.0025F);
        this.neck6_r3.cubeList.add(new ModelBox(neck6_r3, 47, 83, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.upperarm1 = new ModelRenderer(this);
        this.upperarm1.setRotationPoint(7.5F, 10.0006F, -6.1017F);
        this.chest1.addChild(upperarm1);
        this.setRotateAngle(upperarm1, -0.0323F, 0.0F, -0.6374F);
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 0, 19, -1.083F, -0.2576F, -1.8887F, 2, 4, 5, 0.0F, false));
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 55, 92, -1.083F, 3.7424F, -0.8887F, 2, 5, 3, 0.0F, false));

        this.lowerarm1 = new ModelRenderer(this);
        this.lowerarm1.setRotationPoint(0.0264F, 8.2365F, 1.8878F);
        this.upperarm1.addChild(lowerarm1);
        this.setRotateAngle(lowerarm1, -0.9276F, 0.0F, 0.6597F);
        this.lowerarm1.cubeList.add(new ModelBox(lowerarm1, 86, 93, -0.4931F, 0.9975F, -2.4173F, 1, 8, 1, 0.0F, false));
        this.lowerarm1.cubeList.add(new ModelBox(lowerarm1, 37, 90, -1.0F, -1.0F, -0.5F, 2, 10, 2, 0.0F, false));

        this.hand1 = new ModelRenderer(this);
        this.hand1.setRotationPoint(-0.4931F, 8.4975F, 1.4827F);
        this.lowerarm1.addChild(hand1);
        this.setRotateAngle(hand1, 0.743F, 0.0F, 0.0F);
        this.hand1.cubeList.add(new ModelBox(hand1, 21, 0, -4.0F, -1.0F, -8.0F, 8, 3, 9, 0.0F, false));

        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(-7.5F, 10.0006F, -6.1017F);
        this.chest1.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.9276F, 0.0F, 0.6374F);
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 0, 0, -0.917F, -0.2576F, -1.8887F, 2, 4, 5, 0.0F, false));
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 92, 47, -0.917F, 3.7424F, -0.8887F, 2, 5, 3, 0.0F, false));

        this.lowerarm2 = new ModelRenderer(this);
        this.lowerarm2.setRotationPoint(-0.0264F, 8.2365F, 1.8878F);
        this.upperarm2.addChild(lowerarm2);
        this.setRotateAngle(lowerarm2, -0.8564F, -0.2184F, -0.5142F);
        this.lowerarm2.cubeList.add(new ModelBox(lowerarm2, 44, 62, -0.5069F, 0.9975F, -2.4173F, 1, 8, 1, 0.0F, false));
        this.lowerarm2.cubeList.add(new ModelBox(lowerarm2, 86, 80, -1.0F, -1.0F, -0.5F, 2, 10, 2, 0.0F, false));

        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.4931F, 8.4975F, 1.4827F);
        this.lowerarm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.3067F, 0.0F, 0.0F);
        this.hand2.cubeList.add(new ModelBox(hand2, 18, 19, -4.0F, -1.0F, -8.0F, 8, 3, 9, 0.0F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.9997F, -8.6032F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, 0.3889F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 55, 72, -0.9F, -1.086F, -7.9283F, 2, 2, 8, 0.0F, false));

        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.1F, -0.986F, -0.4283F);
        this.neck1.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, 0.0175F, 0.0F, 0.0F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 0, 0, 0.0F, -2.7514F, -0.4848F, 0, 3, 1, 0.0F, false));

        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.1F, -0.986F, -2.4283F);
        this.neck1.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, -0.0349F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 21, 74, 0.0F, -2.6257F, -0.4924F, 0, 3, 1, 0.0F, false));

        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.1F, -0.986F, -4.4283F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, -0.0175F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 80, 0, 0.0F, -2.2F, -0.5F, 0, 3, 1, 0.0F, false));

        this.neck5_r2 = new ModelRenderer(this);
        this.neck5_r2.setRotationPoint(-1.1F, -0.086F, -0.4283F);
        this.neck1.addChild(neck5_r2);
        this.setRotateAngle(neck5_r2, 0.0F, 0.0F, -0.4363F);
        this.neck5_r2.cubeList.add(new ModelBox(neck5_r2, 17, 40, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));
        this.neck5_r2.cubeList.add(new ModelBox(neck5_r2, 69, 41, -2.0F, 0.0F, -2.5F, 2, 0, 1, 0.0F, true));
        this.neck5_r2.cubeList.add(new ModelBox(neck5_r2, 69, 43, -2.0F, 0.0F, -4.5F, 2, 0, 1, 0.0F, true));

        this.neck6_r4 = new ModelRenderer(this);
        this.neck6_r4.setRotationPoint(-1.1F, -0.086F, -0.4283F);
        this.neck1.addChild(neck6_r4);
        this.setRotateAngle(neck6_r4, 0.0F, 0.0F, -1.0036F);
        this.neck6_r4.cubeList.add(new ModelBox(neck6_r4, 21, 7, -3.6868F, -1.0746F, -0.5F, 2, 0, 1, 0.0F, true));
        this.neck6_r4.cubeList.add(new ModelBox(neck6_r4, 28, 38, -2.6868F, -1.0746F, -2.5F, 1, 0, 1, 0.0F, true));

        this.neck4_r2 = new ModelRenderer(this);
        this.neck4_r2.setRotationPoint(1.1F, -0.086F, -0.4283F);
        this.neck1.addChild(neck4_r2);
        this.setRotateAngle(neck4_r2, 0.0F, 0.0F, 0.4363F);
        this.neck4_r2.cubeList.add(new ModelBox(neck4_r2, 17, 40, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));
        this.neck4_r2.cubeList.add(new ModelBox(neck4_r2, 69, 41, 0.0F, 0.0F, -2.5F, 2, 0, 1, 0.0F, false));
        this.neck4_r2.cubeList.add(new ModelBox(neck4_r2, 69, 43, 0.0F, 0.0F, -4.5F, 2, 0, 1, 0.0F, false));

        this.neck5_r3 = new ModelRenderer(this);
        this.neck5_r3.setRotationPoint(1.1F, -0.086F, -0.4283F);
        this.neck1.addChild(neck5_r3);
        this.setRotateAngle(neck5_r3, 0.0F, 0.0F, 1.0036F);
        this.neck5_r3.cubeList.add(new ModelBox(neck5_r3, 21, 7, 1.6868F, -1.0746F, -0.5F, 2, 0, 1, 0.0F, false));
        this.neck5_r3.cubeList.add(new ModelBox(neck5_r3, 28, 38, 1.6868F, -1.0746F, -2.5F, 1, 0, 1, 0.0F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, 0.0433F, -5.8118F);
        this.neck1.addChild(head1);
        this.setRotateAngle(head1, 0.1453F, 0.431F, -0.4851F);
        this.head1.cubeList.add(new ModelBox(head1, 45, 45, -4.0F, 0.3462F, -14.9487F, 8, 3, 7, 0.0F, false));
        this.head1.cubeList.add(new ModelBox(head1, 71, 66, -1.5F, -4.6538F, -7.9487F, 3, 7, 6, 0.0F, false));

        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(0.0F, 0.8462F, 0.0513F);
        this.head1.addChild(head4_r1);
        this.setRotateAngle(head4_r1, -0.2182F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 0, 45, -6.0F, -6.4F, -1.7F, 12, 13, 2, 0.0F, false));

        this.head3_r1 = new ModelRenderer(this);
        this.head3_r1.setRotationPoint(0.0F, 0.8462F, -2.4487F);
        this.head1.addChild(head3_r1);
        this.setRotateAngle(head3_r1, -0.3491F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 56, 56, -3.5F, -6.1F, -1.5F, 7, 12, 3, 0.0F, false));

        this.head2_r1 = new ModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, -5.7225F, -1.876F);
        this.head1.addChild(head2_r1);
        this.setRotateAngle(head2_r1, -0.1309F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 0, 38, -3.0F, -0.3F, -2.3F, 6, 2, 4, 0.0F, false));

        this.head1_r1 = new ModelRenderer(this);
        this.head1_r1.setRotationPoint(0.0F, -5.6538F, -7.4487F);
        this.head1.addChild(head1_r1);
        this.setRotateAngle(head1_r1, 0.1745F, 0.0F, 0.0F);
        this.head1_r1.cubeList.add(new ModelBox(head1_r1, 74, 52, -3.0F, -0.1F, -0.5F, 6, 2, 4, 0.0F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 1.1462F, -7.5487F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, -0.1796F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 56, 0, -4.5F, -6.8F, -5.0F, 9, 6, 5, 0.01F, false));

        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(4.0F, 1.7F, -5.1F);
        this.head2.addChild(head5_r1);
        this.setRotateAngle(head5_r1, 0.5708F, 0.0981F, 0.0729F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 69, 40, -4.6706F, -2.3982F, -1.2784F, 4, 3, 7, 0.01F, false));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 0, 19, -0.6706F, -1.7982F, -1.2784F, 1, 3, 15, 0.01F, false));

        this.head5_r2 = new ModelRenderer(this);
        this.head5_r2.setRotationPoint(-4.0F, 1.7F, -5.1F);
        this.head2.addChild(head5_r2);
        this.setRotateAngle(head5_r2, 0.5708F, -0.0981F, -0.0729F);
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 0, 19, -0.3294F, -1.7982F, -1.2784F, 1, 3, 15, 0.01F, true));

        this.beak1 = new ModelRenderer(this);
        this.beak1.setRotationPoint(0.0F, 0.9F, -6.0F);
        this.head2.addChild(beak1);
        this.setRotateAngle(beak1, -0.0897F, 0.0F, 0.0F);


        this.beak1_r1 = new ModelRenderer(this);
        this.beak1_r1.setRotationPoint(0.0F, 2.2F, -5.4F);
        this.beak1.addChild(beak1_r1);
        this.setRotateAngle(beak1_r1, -0.1571F, 0.0F, 0.0F);
        this.beak1_r1.cubeList.add(new ModelBox(beak1_r1, 66, 26, -3.5F, -3.2F, 0.4F, 7, 3, 5, 0.0F, false));

        this.beak2 = new ModelRenderer(this);
        this.beak2.setRotationPoint(0.0F, -5.1F, 2.7F);
        this.beak1.addChild(beak2);
        this.setRotateAngle(beak2, 0.3142F, 0.0F, 0.0F);
        this.beak2.cubeList.add(new ModelBox(beak2, 23, 62, -2.5F, -3.0F, -6.0F, 5, 7, 5, 0.01F, false));

        this.beak3 = new ModelRenderer(this);
        this.beak3.setRotationPoint(0.0F, -1.4F, -4.5F);
        this.beak2.addChild(beak3);
        this.setRotateAngle(beak3, 0.7629F, 0.0F, 0.0F);
        this.beak3.cubeList.add(new ModelBox(beak3, 0, 73, -2.0F, -2.0F, -6.0F, 4, 4, 6, 0.0F, false));

        this.beak4 = new ModelRenderer(this);
        this.beak4.setRotationPoint(0.0F, 1.2F, -4.4F);
        this.beak3.addChild(beak4);
        this.setRotateAngle(beak4, -0.8196F, 0.0F, 0.0F);
        this.beak4.cubeList.add(new ModelBox(beak4, 21, 75, -3.0F, -1.0F, -4.0F, 6, 4, 4, 0.01F, false));

        this.tusk1 = new ModelRenderer(this);
        this.tusk1.setRotationPoint(1.9F, -0.7F, 0.9F);
        this.beak1.addChild(tusk1);
        this.setRotateAngle(tusk1, -1.0221F, -0.0822F, 2.5756F);
        this.tusk1.cubeList.add(new ModelBox(tusk1, 36, 80, -1.4F, -2.1F, -6.0F, 2, 3, 6, 0.0F, false));

        this.tusk2_r1 = new ModelRenderer(this);
        this.tusk2_r1.setRotationPoint(-1.2F, 0.7F, -3.2F);
        this.tusk1.addChild(tusk2_r1);
        this.setRotateAngle(tusk2_r1, -1.1219F, 0.1321F, -0.1458F);
        this.tusk2_r1.cubeList.add(new ModelBox(tusk2_r1, 95, 5, 0.2F, -0.7F, -1.0F, 2, 3, 3, -0.01F, false));

        this.fronttusk1 = new ModelRenderer(this);
        this.fronttusk1.setRotationPoint(-0.7F, -0.4F, -5.1F);
        this.tusk1.addChild(fronttusk1);
        this.setRotateAngle(fronttusk1, 0.3336F, 0.253F, 0.0157F);
        this.fronttusk1.cubeList.add(new ModelBox(fronttusk1, 90, 72, -0.3F, -0.9F, -3.1F, 1, 2, 5, 0.0F, false));

        this.tusk2 = new ModelRenderer(this);
        this.tusk2.setRotationPoint(-1.9F, -0.7F, 0.9F);
        this.beak1.addChild(tusk2);
        this.setRotateAngle(tusk2, -1.0221F, 0.0822F, -2.5756F);
        this.tusk2.cubeList.add(new ModelBox(tusk2, 36, 80, -0.6F, -2.1F, -6.0F, 2, 3, 6, 0.0F, true));

        this.tusk3_r1 = new ModelRenderer(this);
        this.tusk3_r1.setRotationPoint(1.2F, 0.7F, -3.2F);
        this.tusk2.addChild(tusk3_r1);
        this.setRotateAngle(tusk3_r1, -1.1219F, -0.1321F, 0.1458F);
        this.tusk3_r1.cubeList.add(new ModelBox(tusk3_r1, 95, 5, -2.2F, -0.7F, -1.0F, 2, 3, 3, -0.01F, true));

        this.fronttusk2 = new ModelRenderer(this);
        this.fronttusk2.setRotationPoint(0.7F, -0.4F, -5.1F);
        this.tusk2.addChild(fronttusk2);
        this.setRotateAngle(fronttusk2, 0.3336F, -0.253F, -0.0157F);
        this.fronttusk2.cubeList.add(new ModelBox(fronttusk2, 90, 72, -0.7F, -0.9F, -3.1F, 1, 2, 5, 0.0F, true));

        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 3.4F, 1.7F);
        this.head2.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.4363F, 0.0F, 0.0F);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 86, 19, 2.5F, -0.4758F, -5.9562F, 1, 3, 5, -0.003F, false));
        this.jaw1.cubeList.add(new ModelBox(jaw1, 86, 19, -3.5F, -0.4758F, -5.9562F, 1, 3, 5, -0.003F, true));

        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(-3.0F, 0.5242F, 0.0438F);
        this.jaw1.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, -0.5236F, 0.0F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 21, 0, -0.5F, -1.0F, -2.8F, 1, 3, 3, 0.002F, true));
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 21, 0, 5.5F, -1.0F, -2.8F, 1, 3, 3, 0.002F, false));

        this.jaw4_r1 = new ModelRenderer(this);
        this.jaw4_r1.setRotationPoint(-3.0F, -1.1928F, -3.9301F);
        this.jaw1.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, -0.0436F, 0.0F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 50, 28, -0.5F, -0.6F, -2.0F, 1, 3, 4, 0.0F, true));
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 50, 28, 5.5F, -0.6F, -2.0F, 1, 3, 4, 0.0F, false));

        this.lowerbeak1 = new ModelRenderer(this);
        this.lowerbeak1.setRotationPoint(0.0F, -0.1758F, -5.7562F);
        this.jaw1.addChild(lowerbeak1);
        this.setRotateAngle(lowerbeak1, 0.0848F, 0.0F, 0.0F);
        this.lowerbeak1.cubeList.add(new ModelBox(lowerbeak1, 24, 85, 2.0F, -1.5F, -5.0F, 1, 3, 5, 0.0F, false));
        this.lowerbeak1.cubeList.add(new ModelBox(lowerbeak1, 24, 85, -3.0F, -1.5F, -5.0F, 1, 3, 5, 0.0F, true));

        this.lowerbeak3_r1 = new ModelRenderer(this);
        this.lowerbeak3_r1.setRotationPoint(-2.5F, 0.0F, -2.5F);
        this.lowerbeak1.addChild(lowerbeak3_r1);
        this.setRotateAngle(lowerbeak3_r1, -0.1745F, 0.0F, 0.0F);
        this.lowerbeak3_r1.cubeList.add(new ModelBox(lowerbeak3_r1, 84, 63, -0.5F, -0.8F, -2.5F, 1, 3, 5, -0.003F, true));
        this.lowerbeak3_r1.cubeList.add(new ModelBox(lowerbeak3_r1, 84, 63, 4.5F, -0.8F, -2.5F, 1, 3, 5, -0.003F, false));

        this.lowerbeak2 = new ModelRenderer(this);
        this.lowerbeak2.setRotationPoint(0.0F, 0.0F, -4.7F);
        this.lowerbeak1.addChild(lowerbeak2);


        this.lowerbeak4_r1 = new ModelRenderer(this);
        this.lowerbeak4_r1.setRotationPoint(1.0F, 0.0F, -1.75F);
        this.lowerbeak2.addChild(lowerbeak4_r1);
        this.setRotateAngle(lowerbeak4_r1, -0.2182F, 0.0F, 0.0F);
        this.lowerbeak4_r1.cubeList.add(new ModelBox(lowerbeak4_r1, 0, 12, -3.5F, -0.5F, -0.75F, 5, 2, 1, -0.002F, false));
        this.lowerbeak4_r1.cubeList.add(new ModelBox(lowerbeak4_r1, 45, 45, -3.5F, -0.5F, 0.25F, 1, 2, 2, -0.003F, true));
        this.lowerbeak4_r1.cubeList.add(new ModelBox(lowerbeak4_r1, 45, 45, 0.5F, -0.5F, 0.25F, 1, 2, 2, -0.003F, false));

        this.lowerbeak3_r2 = new ModelRenderer(this);
        this.lowerbeak3_r2.setRotationPoint(-1.0F, 0.0F, -1.75F);
        this.lowerbeak2.addChild(lowerbeak3_r2);
        this.setRotateAngle(lowerbeak3_r2, 0.1745F, 0.0F, 0.0F);
        this.lowerbeak3_r2.cubeList.add(new ModelBox(lowerbeak3_r2, 46, 17, -1.5F, -1.0F, -0.25F, 1, 2, 2, 0.0F, true));
        this.lowerbeak3_r2.cubeList.add(new ModelBox(lowerbeak3_r2, 0, 29, -1.5F, -1.0F, -1.25F, 5, 2, 1, 0.0F, false));
        this.lowerbeak3_r2.cubeList.add(new ModelBox(lowerbeak3_r2, 46, 17, 2.5F, -1.0F, -0.25F, 1, 2, 2, 0.0F, false));

        this.basin1 = new ModelRenderer(this);
        this.basin1.setRotationPoint(0.0F, -0.0238F, 10.3336F);
        this.body1.addChild(basin1);
        this.setRotateAngle(basin1, -0.0911F, 0.0F, 0.0F);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(-4.3F, 8.1934F, 3.8715F);
        this.basin1.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -1.5423F, 0.0439F, -0.9942F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 94, 16, -1.1028F, 1.7245F, -0.4298F, 2, 3, 3, 0.003F, true));
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 92, 90, -1.1028F, -5.2755F, -0.4298F, 2, 5, 3, 0.003F, true));

        this.basin_r2 = new ModelRenderer(this);
        this.basin_r2.setRotationPoint(-5.0F, 6.0934F, 3.8715F);
        this.basin1.addChild(basin_r2);
        this.setRotateAngle(basin_r2, -1.5198F, 0.0118F, -0.2266F);
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 21, 94, -1.0F, -2.1656F, -0.13F, 2, 5, 3, 0.003F, true));

        this.basin_r3 = new ModelRenderer(this);
        this.basin_r3.setRotationPoint(0.0F, 1.3399F, 4.5408F);
        this.basin1.addChild(basin_r3);
        this.setRotateAngle(basin_r3, -1.3701F, 0.0F, 0.0F);
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 0, 84, -6.0F, -5.2F, 2.2F, 2, 9, 3, -0.003F, true));
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 0, 84, 4.0F, -5.2F, 2.2F, 2, 9, 3, -0.003F, false));

        this.basin_r4 = new ModelRenderer(this);
        this.basin_r4.setRotationPoint(0.0F, 1.3399F, 4.5408F);
        this.basin1.addChild(basin_r4);
        this.setRotateAngle(basin_r4, -0.1484F, 0.0F, 0.0F);
        this.basin_r4.cubeList.add(new ModelBox(basin_r4, 11, 84, -6.0F, -0.1F, -4.9F, 2, 6, 4, 0.0F, true));
        this.basin_r4.cubeList.add(new ModelBox(basin_r4, 11, 84, 4.0F, -0.1F, -4.9F, 2, 6, 4, 0.0F, false));

        this.basin_r5 = new ModelRenderer(this);
        this.basin_r5.setRotationPoint(0.0F, 1.3399F, 4.5408F);
        this.basin1.addChild(basin_r5);
        this.setRotateAngle(basin_r5, -1.2828F, 0.0F, 0.0F);
        this.basin_r5.cubeList.add(new ModelBox(basin_r5, 44, 65, -6.0F, -2.5F, -2.0F, 2, 7, 7, 0.003F, true));
        this.basin_r5.cubeList.add(new ModelBox(basin_r5, 44, 65, 4.0F, -2.5F, -2.0F, 2, 7, 7, 0.003F, false));

        this.basin_r6 = new ModelRenderer(this);
        this.basin_r6.setRotationPoint(0.0F, 3.3399F, 9.5408F);
        this.basin1.addChild(basin_r6);
        this.setRotateAngle(basin_r6, -0.8029F, 0.0F, 0.0F);
        this.basin_r6.cubeList.add(new ModelBox(basin_r6, 53, 83, -6.0F, -0.9991F, -5.3567F, 2, 3, 5, -0.002F, true));
        this.basin_r6.cubeList.add(new ModelBox(basin_r6, 53, 83, 4.0F, -0.9991F, -5.3567F, 2, 3, 5, -0.002F, false));

        this.basin_r7 = new ModelRenderer(this);
        this.basin_r7.setRotationPoint(0.0F, -0.881F, -2.6402F);
        this.basin1.addChild(basin_r7);
        this.setRotateAngle(basin_r7, -0.3665F, 0.0F, 0.0F);
        this.basin_r7.cubeList.add(new ModelBox(basin_r7, 70, 12, -4.0F, -1.0F, 5.5F, 3, 1, 7, 0.003F, true));
        this.basin_r7.cubeList.add(new ModelBox(basin_r7, 70, 12, 1.0F, -1.0F, 5.5F, 3, 1, 7, 0.003F, false));

        this.basin_r8 = new ModelRenderer(this);
        this.basin_r8.setRotationPoint(5.0F, 6.0934F, 3.8715F);
        this.basin1.addChild(basin_r8);
        this.setRotateAngle(basin_r8, -1.5198F, -0.0118F, 0.2266F);
        this.basin_r8.cubeList.add(new ModelBox(basin_r8, 21, 94, -1.0F, -2.1656F, -0.13F, 2, 5, 3, 0.003F, false));

        this.basin_r9 = new ModelRenderer(this);
        this.basin_r9.setRotationPoint(4.3F, 8.1934F, 3.8715F);
        this.basin1.addChild(basin_r9);
        this.setRotateAngle(basin_r9, -1.5423F, -0.0439F, 0.9942F);
        this.basin_r9.cubeList.add(new ModelBox(basin_r9, 92, 90, -0.8972F, -5.2755F, -0.4298F, 2, 5, 3, 0.003F, false));
        this.basin_r9.cubeList.add(new ModelBox(basin_r9, 94, 16, -0.8972F, 1.7245F, -0.4298F, 2, 3, 3, 0.003F, false));

        this.basin1_r1 = new ModelRenderer(this);
        this.basin1_r1.setRotationPoint(0.0F, 0.2484F, -0.1678F);
        this.basin1.addChild(basin1_r1);
        this.setRotateAngle(basin1_r1, -0.2269F, 0.0F, 0.0F);
        this.basin1_r1.cubeList.add(new ModelBox(basin1_r1, 50, 26, -0.9F, -1.0F, 0.0F, 2, 2, 11, 0.001F, false));

        this.neck21_r1 = new ModelRenderer(this);
        this.neck21_r1.setRotationPoint(0.1F, 0.3484F, 0.8322F);
        this.basin1.addChild(neck21_r1);
        this.setRotateAngle(neck21_r1, -0.2443F, 0.0F, 0.0F);
        this.neck21_r1.cubeList.add(new ModelBox(neck21_r1, 10, 19, 0.0F, -2.2023F, 7.5621F, 0, 3, 1, 0.0F, false));
        this.neck21_r1.cubeList.add(new ModelBox(neck21_r1, 10, 0, 0.0F, -2.4023F, 5.5621F, 0, 3, 1, 0.0F, false));
        this.neck21_r1.cubeList.add(new ModelBox(neck21_r1, 58, 0, 0.0F, -2.7023F, 3.5621F, 0, 3, 1, 0.0F, false));
        this.neck21_r1.cubeList.add(new ModelBox(neck21_r1, 25, 61, 0.0F, -2.9023F, 1.5621F, 0, 3, 1, 0.0F, false));

        this.neck17_r6 = new ModelRenderer(this);
        this.neck17_r6.setRotationPoint(0.1F, 0.3484F, 0.8322F);
        this.basin1.addChild(neck17_r6);
        this.setRotateAngle(neck17_r6, -0.1571F, 0.0F, 0.0F);
        this.neck17_r6.cubeList.add(new ModelBox(neck17_r6, 39, 62, 0.0F, -3.0023F, -0.4379F, 0, 3, 1, 0.0F, false));

        this.upperleg1 = new ModelRenderer(this);
        this.upperleg1.setRotationPoint(6.5F, 3.9484F, 5.7322F);
        this.basin1.addChild(upperleg1);
        this.setRotateAngle(upperleg1, 0.1215F, 0.0F, -0.2731F);
        this.upperleg1.cubeList.add(new ModelBox(upperleg1, 75, 90, -1.0F, 3.8F, -2.0F, 2, 7, 3, 0.0F, false));
        this.upperleg1.cubeList.add(new ModelBox(upperleg1, 85, 39, -1.5F, -0.2F, -2.0F, 3, 4, 3, 0.0F, false));

        this.leg1 = new ModelRenderer(this);
        this.leg1.setRotationPoint(-0.038F, 10.9278F, -1.3392F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.7569F, -0.0911F, 0.2731F);
        this.leg1.cubeList.add(new ModelBox(leg1, 66, 90, -0.9188F, 0.09F, -0.5057F, 2, 10, 2, 0.0F, false));
        this.leg1.cubeList.add(new ModelBox(leg1, 0, 97, -0.8668F, 0.1069F, 1.4935F, 2, 10, 1, -0.2F, false));

        this.feet1 = new ModelRenderer(this);
        this.feet1.setRotationPoint(0.6072F, 9.2984F, 0.9939F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, -0.3927F, 0.0F, 0.0F);
        this.feet1.cubeList.add(new ModelBox(feet1, 44, 13, -4.0519F, -0.8169F, -6.9993F, 8, 3, 9, 0.0F, false));

        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(-6.5F, 3.9484F, 5.7322F);
        this.basin1.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.3149F, 0.0F, 0.2731F);
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 29, 45, -1.0F, 3.8F, -2.0F, 2, 7, 3, 0.0F, false));
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 85, 0, -1.5F, -0.2F, -2.0F, 3, 4, 3, 0.0F, false));

        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(0.038F, 10.9278F, -1.3392F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.5388F, 0.0911F, -0.2731F);
        this.leg2.cubeList.add(new ModelBox(leg2, 46, 90, -1.0812F, 0.09F, -0.5057F, 2, 10, 2, 0.0F, false));
        this.leg2.cubeList.add(new ModelBox(leg2, 11, 95, -1.1332F, 0.1069F, 1.4935F, 2, 10, 1, -0.2F, false));

        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(-0.6072F, 9.2984F, 0.9939F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, -0.0873F, 0.0F, 0.0F);
        this.feet2.cubeList.add(new ModelBox(feet2, 24, 32, -3.9481F, -0.8169F, -6.9993F, 8, 3, 9, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 2.9428F, 10.414F);
        this.basin1.addChild(tail1);
        this.setRotateAngle(tail1, -0.7601F, -0.6271F, 0.5089F);
        this.tail1.cubeList.add(new ModelBox(tail1, 69, 80, -0.5F, -1.0524F, -0.624F, 1, 2, 7, 0.0F, false));

        this.neck24_r1 = new ModelRenderer(this);
        this.neck24_r1.setRotationPoint(0.1F, -0.9477F, 0.1005F);
        this.tail1.addChild(neck24_r1);
        this.setRotateAngle(neck24_r1, -0.0524F, 0.0F, 0.0F);
        this.neck24_r1.cubeList.add(new ModelBox(neck24_r1, 13, 12, 0.0F, -0.9385F, 3.4963F, 0, 1, 1, 0.0F, false));
        this.neck24_r1.cubeList.add(new ModelBox(neck24_r1, 21, 0, 0.0F, -0.9385F, 1.4963F, 0, 1, 1, 0.0F, false));
        this.neck24_r1.cubeList.add(new ModelBox(neck24_r1, 27, 0, 0.0F, -0.9385F, -0.5037F, 0, 1, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.32F, 6.1646F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.7835F, -1.0417F, 0.7103F);
        this.tail2.cubeList.add(new ModelBox(tail2, 89, 30, -0.5F, -0.5625F, -0.0772F, 1, 1, 5, -0.002F, false));

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
