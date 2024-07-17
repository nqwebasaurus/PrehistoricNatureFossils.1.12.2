package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonShonisaurus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer tailbase1;
    private final ModelRenderer tail1;
    private final ModelRenderer tail5;
    private final ModelRenderer body2_r1;
    private final ModelRenderer neck49_r1;
    private final ModelRenderer neck50_r1;
    private final ModelRenderer neck48_r1;
    private final ModelRenderer neck47_r1;
    private final ModelRenderer neck43_r1;
    private final ModelRenderer neck42_r1;
    private final ModelRenderer neck41_r1;
    private final ModelRenderer neck42_r2;
    private final ModelRenderer neck41_r2;
    private final ModelRenderer neck40_r1;
    private final ModelRenderer neck44_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer Tail6;
    private final ModelRenderer neck51_r1;
    private final ModelRenderer neck56_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail7;
    private final ModelRenderer neck57_r1;
    private final ModelRenderer neck62_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer neck66_r1;
    private final ModelRenderer fluke1;
    private final ModelRenderer fluke2_r1;
    private final ModelRenderer belly3;
    private final ModelRenderer rearflipper2;
    private final ModelRenderer rearflipper3_r1;
    private final ModelRenderer rearflipper2_r1;
    private final ModelRenderer rearflipperfingers2;
    private final ModelRenderer rearflipper3;
    private final ModelRenderer rearflipper4_r1;
    private final ModelRenderer rearflipper3_r2;
    private final ModelRenderer rearflipperfingers3;
    private final ModelRenderer lowerbody3;
    private final ModelRenderer lowerbody2;
    private final ModelRenderer lowerbody3_r1;
    private final ModelRenderer lowerbody1;
    private final ModelRenderer neck1;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck6_r1;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer neck5_r2;
    private final ModelRenderer neck4_r2;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck2_r2;
    private final ModelRenderer neck3_r2;
    private final ModelRenderer neck5_r3;
    private final ModelRenderer neck4_r3;
    private final ModelRenderer neck3_r3;
    private final ModelRenderer neck3_r4;
    private final ModelRenderer neck2_r3;
    private final ModelRenderer neck2_r4;
    private final ModelRenderer neck1_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck4_r4;
    private final ModelRenderer neck3_r5;
    private final ModelRenderer neck4_r5;
    private final ModelRenderer neck3_r6;
    private final ModelRenderer neck3_r7;
    private final ModelRenderer neck2_r5;
    private final ModelRenderer head1;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head3_r1;
    private final ModelRenderer head2_r1;
    private final ModelRenderer rostrum1;
    private final ModelRenderer rostrum3_r1;
    private final ModelRenderer rostrum2_r1;
    private final ModelRenderer rostrum2;
    private final ModelRenderer teeth2;
    private final ModelRenderer beak1;
    private final ModelRenderer beak2_r1;
    private final ModelRenderer beak1_r1;
    private final ModelRenderer teeth1;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw3_r2;
    private final ModelRenderer jaw5_r1;
    private final ModelRenderer jaw4_r1;
    private final ModelRenderer jaw4_r2;
    private final ModelRenderer jaw3_r3;
    private final ModelRenderer jaw2_r1;
    private final ModelRenderer jaw2_r2;
    private final ModelRenderer lowerrostrum1;
    private final ModelRenderer lowerrostrum4_r1;
    private final ModelRenderer lowerrostrum3_r1;
    private final ModelRenderer lowerrostrum2;
    private final ModelRenderer lowerrostrum5_r1;
    private final ModelRenderer teeth4;
    private final ModelRenderer lowerbeak2;
    private final ModelRenderer lowerbeak3_r1;
    private final ModelRenderer beak3;
    private final ModelRenderer beak5_r1;
    private final ModelRenderer teeth3;
    private final ModelRenderer head2;
    private final ModelRenderer head4_r2;
    private final ModelRenderer head2_r2;
    private final ModelRenderer flipper2;
    private final ModelRenderer flipper5_r1;
    private final ModelRenderer flipperfingers2;
    private final ModelRenderer flipperfingers2_r1;
    private final ModelRenderer flipper3;
    private final ModelRenderer flipper6_r1;
    private final ModelRenderer flipperfingers3;
    private final ModelRenderer flipperfingers3_r1;
    private final ModelRenderer body3;
    private final ModelRenderer body3_r1;
    private final ModelRenderer neck15_r1;
    private final ModelRenderer neck14_r1;
    private final ModelRenderer neck13_r1;
    private final ModelRenderer neck12_r1;
    private final ModelRenderer neck13_r2;
    private final ModelRenderer neck14_r2;
    private final ModelRenderer neck13_r3;
    private final ModelRenderer neck12_r2;
    private final ModelRenderer neck11_r1;
    private final ModelRenderer neck10_r1;
    private final ModelRenderer neck11_r2;
    private final ModelRenderer neck12_r3;
    private final ModelRenderer neck11_r3;
    private final ModelRenderer neck10_r2;
    private final ModelRenderer neck9_r1;
    private final ModelRenderer neck8_r1;
    private final ModelRenderer neck9_r2;
    private final ModelRenderer neck10_r3;
    private final ModelRenderer neck9_r3;
    private final ModelRenderer neck8_r2;
    private final ModelRenderer neck7_r1;
    private final ModelRenderer neck8_r3;
    private final ModelRenderer neck7_r2;
    private final ModelRenderer neck6_r2;
    private final ModelRenderer neck5_r4;
    private final ModelRenderer neck6_r3;
    private final ModelRenderer neck7_r3;
    private final ModelRenderer neck14_r3;
    private final ModelRenderer neck13_r4;
    private final ModelRenderer neck12_r4;
    private final ModelRenderer neck13_r5;
    private final ModelRenderer neck12_r5;
    private final ModelRenderer neck11_r4;
    private final ModelRenderer neck12_r6;
    private final ModelRenderer neck11_r5;
    private final ModelRenderer neck10_r4;
    private final ModelRenderer neck11_r6;
    private final ModelRenderer neck10_r5;
    private final ModelRenderer neck9_r4;
    private final ModelRenderer neck8_r4;
    private final ModelRenderer neck9_r5;
    private final ModelRenderer neck10_r6;
    private final ModelRenderer neck7_r4;
    private final ModelRenderer neck8_r5;
    private final ModelRenderer neck9_r6;
    private final ModelRenderer neck8_r6;
    private final ModelRenderer neck7_r5;
    private final ModelRenderer neck6_r4;
    private final ModelRenderer neck7_r6;
    private final ModelRenderer neck6_r5;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer neck5_r5;
    private final ModelRenderer neck5_r6;
    private final ModelRenderer neck7_r7;
    private final ModelRenderer neck13_r6;
    private final ModelRenderer neck12_r7;
    private final ModelRenderer neck11_r7;
    private final ModelRenderer neck10_r7;
    private final ModelRenderer neck9_r7;
    private final ModelRenderer neck8_r7;
    private final ModelRenderer neck7_r8;
    private final ModelRenderer neck6_r6;
    private final ModelRenderer neck4_r6;
    private final ModelRenderer underbelly2;
    private final ModelRenderer underbelly3_r1;
    private final ModelRenderer body2;
    private final ModelRenderer body2_r2;
    private final ModelRenderer neck22_r1;
    private final ModelRenderer neck21_r1;
    private final ModelRenderer neck15_r2;
    private final ModelRenderer neck25_r1;
    private final ModelRenderer neck24_r1;
    private final ModelRenderer neck23_r1;
    private final ModelRenderer neck24_r2;
    private final ModelRenderer neck22_r2;
    private final ModelRenderer neck23_r2;
    private final ModelRenderer neck21_r2;
    private final ModelRenderer neck22_r3;
    private final ModelRenderer neck23_r3;
    private final ModelRenderer neck22_r4;
    private final ModelRenderer neck21_r3;
    private final ModelRenderer neck20_r1;
    private final ModelRenderer neck19_r1;
    private final ModelRenderer neck20_r2;
    private final ModelRenderer neck21_r4;
    private final ModelRenderer neck20_r3;
    private final ModelRenderer neck19_r2;
    private final ModelRenderer neck18_r1;
    private final ModelRenderer neck17_r1;
    private final ModelRenderer neck19_r3;
    private final ModelRenderer neck18_r2;
    private final ModelRenderer neck17_r2;
    private final ModelRenderer neck18_r3;
    private final ModelRenderer neck16_r1;
    private final ModelRenderer neck17_r3;
    private final ModelRenderer neck16_r2;
    private final ModelRenderer neck15_r3;
    private final ModelRenderer neck14_r4;
    private final ModelRenderer neck15_r4;
    private final ModelRenderer neck16_r3;
    private final ModelRenderer neck24_r3;
    private final ModelRenderer neck23_r4;
    private final ModelRenderer neck22_r5;
    private final ModelRenderer neck23_r5;
    private final ModelRenderer neck22_r6;
    private final ModelRenderer neck21_r5;
    private final ModelRenderer neck22_r7;
    private final ModelRenderer neck21_r6;
    private final ModelRenderer neck20_r4;
    private final ModelRenderer neck21_r7;
    private final ModelRenderer neck20_r5;
    private final ModelRenderer neck19_r4;
    private final ModelRenderer neck20_r6;
    private final ModelRenderer neck19_r5;
    private final ModelRenderer neck18_r4;
    private final ModelRenderer neck19_r6;
    private final ModelRenderer neck18_r5;
    private final ModelRenderer neck17_r4;
    private final ModelRenderer neck18_r6;
    private final ModelRenderer neck17_r5;
    private final ModelRenderer neck16_r4;
    private final ModelRenderer neck17_r6;
    private final ModelRenderer neck16_r5;
    private final ModelRenderer neck15_r5;
    private final ModelRenderer neck16_r6;
    private final ModelRenderer neck15_r6;
    private final ModelRenderer neck14_r5;
    private final ModelRenderer neck15_r7;
    private final ModelRenderer neck14_r6;
    private final ModelRenderer neck13_r7;
    private final ModelRenderer neck14_r7;
    private final ModelRenderer underbelly3;
    private final ModelRenderer body1;
    private final ModelRenderer body1_r1;
    private final ModelRenderer neck30_r1;
    private final ModelRenderer neck32_r1;
    private final ModelRenderer neck31_r1;
    private final ModelRenderer neck30_r2;
    private final ModelRenderer neck31_r2;
    private final ModelRenderer neck30_r3;
    private final ModelRenderer neck29_r1;
    private final ModelRenderer neck28_r1;
    private final ModelRenderer neck29_r2;
    private final ModelRenderer neck30_r4;
    private final ModelRenderer neck29_r3;
    private final ModelRenderer neck28_r2;
    private final ModelRenderer neck27_r1;
    private final ModelRenderer neck26_r1;
    private final ModelRenderer neck27_r2;
    private final ModelRenderer neck28_r3;
    private final ModelRenderer neck27_r3;
    private final ModelRenderer neck26_r2;
    private final ModelRenderer neck25_r2;
    private final ModelRenderer neck24_r4;
    private final ModelRenderer neck25_r3;
    private final ModelRenderer neck26_r3;
    private final ModelRenderer neck29_r4;
    private final ModelRenderer neck30_r5;
    private final ModelRenderer neck31_r3;
    private final ModelRenderer neck28_r4;
    private final ModelRenderer neck29_r5;
    private final ModelRenderer neck30_r6;
    private final ModelRenderer neck27_r4;
    private final ModelRenderer neck28_r5;
    private final ModelRenderer neck29_r6;
    private final ModelRenderer neck26_r4;
    private final ModelRenderer neck27_r5;
    private final ModelRenderer neck28_r6;
    private final ModelRenderer neck26_r5;
    private final ModelRenderer neck25_r4;
    private final ModelRenderer neck27_r6;
    private final ModelRenderer neck25_r5;
    private final ModelRenderer neck24_r5;
    private final ModelRenderer neck26_r6;
    private final ModelRenderer neck25_r6;
    private final ModelRenderer neck24_r6;
    private final ModelRenderer neck23_r6;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer neck41_r3;
    private final ModelRenderer neck40_r2;
    private final ModelRenderer neck39_r1;
    private final ModelRenderer neck38_r1;
    private final ModelRenderer neck39_r2;
    private final ModelRenderer neck40_r3;
    private final ModelRenderer neck37_r1;
    private final ModelRenderer neck38_r2;
    private final ModelRenderer neck37_r2;
    private final ModelRenderer neck36_r1;
    private final ModelRenderer neck35_r1;
    private final ModelRenderer neck36_r2;
    private final ModelRenderer neck36_r3;
    private final ModelRenderer neck37_r3;
    private final ModelRenderer neck36_r4;
    private final ModelRenderer neck35_r2;
    private final ModelRenderer neck34_r1;
    private final ModelRenderer neck33_r1;
    private final ModelRenderer neck34_r2;
    private final ModelRenderer neck35_r3;
    private final ModelRenderer neck34_r3;
    private final ModelRenderer neck33_r2;
    private final ModelRenderer neck32_r2;
    private final ModelRenderer neck31_r4;
    private final ModelRenderer neck33_r3;
    private final ModelRenderer neck32_r3;
    private final ModelRenderer neck35_r4;
    private final ModelRenderer neck36_r5;
    private final ModelRenderer neck38_r3;
    private final ModelRenderer neck39_r3;
    private final ModelRenderer neck39_r4;
    private final ModelRenderer neck38_r4;
    private final ModelRenderer neck37_r4;
    private final ModelRenderer neck37_r5;
    private final ModelRenderer neck36_r6;
    private final ModelRenderer neck36_r7;
    private final ModelRenderer neck35_r5;
    private final ModelRenderer neck35_r6;
    private final ModelRenderer neck34_r4;
    private final ModelRenderer neck33_r4;
    private final ModelRenderer neck34_r5;
    private final ModelRenderer neck35_r7;
    private final ModelRenderer neck33_r5;
    private final ModelRenderer neck32_r4;
    private final ModelRenderer neck34_r6;
    private final ModelRenderer neck31_r5;
    private final ModelRenderer neck32_r5;
    private final ModelRenderer neck33_r6;
    private final ModelRenderer neck30_r7;
    private final ModelRenderer neck32_r6;
    private final ModelRenderer neck31_r6;

    public ModelSkeletonShonisaurus() {
        this.textureWidth = 144;
        this.textureHeight = 144;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.tailbase1 = new ModelRenderer(this);
        this.tailbase1.setRotationPoint(0.0F, -6.8F, 0.9F);
        this.root.addChild(tailbase1);
        this.setRotateAngle(tailbase1, -0.3481F, 0.0226F, 0.0843F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(-0.054F, 0.2713F, 42.8883F);
        this.tailbase1.addChild(tail1);
        this.setRotateAngle(tail1, 0.0903F, 0.2608F, 0.0233F);


        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 2.5826F, -0.7992F);
        this.tail1.addChild(tail5);
        this.setRotateAngle(tail5, -0.0456F, 0.0F, 0.0F);


        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -2.4F, 0.0F);
        this.tail5.addChild(body2_r1);
        this.setRotateAngle(body2_r1, 0.0175F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 0, 75, -1.0F, -1.1F, 0.0F, 2, 2, 16, 0.0F, false));

        this.neck49_r1 = new ModelRenderer(this);
        this.neck49_r1.setRotationPoint(0.0F, -3.4175F, 6.5115F);
        this.tail5.addChild(neck49_r1);
        this.setRotateAngle(neck49_r1, -0.1047F, 0.0F, 0.0F);
        this.neck49_r1.cubeList.add(new ModelBox(neck49_r1, 19, 26, 0.0F, -1.8704F, 7.9753F, 0, 2, 1, 0.0F, false));
        this.neck49_r1.cubeList.add(new ModelBox(neck49_r1, 0, 39, 0.0F, -1.6704F, 5.9753F, 0, 2, 1, 0.0F, false));
        this.neck49_r1.cubeList.add(new ModelBox(neck49_r1, 47, 45, 0.0F, -1.4704F, 3.9753F, 0, 2, 1, 0.0F, false));
        this.neck49_r1.cubeList.add(new ModelBox(neck49_r1, 10, 52, 0.0F, -1.2704F, 1.9753F, 0, 2, 1, 0.0F, false));
        this.neck49_r1.cubeList.add(new ModelBox(neck49_r1, 12, 122, 0.0F, -1.0704F, -0.0247F, 0, 2, 1, 0.0F, false));

        this.neck50_r1 = new ModelRenderer(this);
        this.neck50_r1.setRotationPoint(0.0F, -0.3741F, 13.5929F);
        this.tail5.addChild(neck50_r1);
        this.setRotateAngle(neck50_r1, 0.4625F, 0.0F, 0.0F);
        this.neck50_r1.cubeList.add(new ModelBox(neck50_r1, 74, 83, 0.0F, -0.69F, 1.3286F, 0, 3, 1, 0.0F, false));
        this.neck50_r1.cubeList.add(new ModelBox(neck50_r1, 82, 83, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.neck48_r1 = new ModelRenderer(this);
        this.neck48_r1.setRotationPoint(0.0F, -0.283F, 11.595F);
        this.tail5.addChild(neck48_r1);
        this.setRotateAngle(neck48_r1, 0.4189F, 0.0F, 0.0F);
        this.neck48_r1.cubeList.add(new ModelBox(neck48_r1, 85, 58, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.neck47_r1 = new ModelRenderer(this);
        this.neck47_r1.setRotationPoint(0.0F, -0.4441F, 8.688F);
        this.tail5.addChild(neck47_r1);
        this.setRotateAngle(neck47_r1, 0.288F, 0.0F, 0.0F);
        this.neck47_r1.cubeList.add(new ModelBox(neck47_r1, 12, 26, 0.0F, -1.0F, 0.3F, 0, 2, 1, 0.0F, false));

        this.neck43_r1 = new ModelRenderer(this);
        this.neck43_r1.setRotationPoint(-0.916F, -2.4312F, 2.0573F);
        this.tail5.addChild(neck43_r1);
        this.setRotateAngle(neck43_r1, 0.0045F, 0.0363F, -1.1181F);
        this.neck43_r1.cubeList.add(new ModelBox(neck43_r1, 0, 5, -1.756F, 0.316F, 3.9352F, 2, 0, 1, 0.0F, true));

        this.neck42_r1 = new ModelRenderer(this);
        this.neck42_r1.setRotationPoint(-0.916F, -2.4312F, 2.0573F);
        this.tail5.addChild(neck42_r1);
        this.setRotateAngle(neck42_r1, 0.0071F, 0.0359F, -1.0482F);
        this.neck42_r1.cubeList.add(new ModelBox(neck42_r1, 24, 59, -2.756F, 0.316F, 1.9352F, 3, 0, 1, 0.0F, true));

        this.neck41_r1 = new ModelRenderer(this);
        this.neck41_r1.setRotationPoint(-0.916F, -2.4312F, 2.0573F);
        this.tail5.addChild(neck41_r1);
        this.setRotateAngle(neck41_r1, 0.0077F, 0.0357F, -1.0307F);
        this.neck41_r1.cubeList.add(new ModelBox(neck41_r1, 119, 99, -2.756F, 0.316F, -0.0648F, 3, 0, 1, 0.0F, true));

        this.neck42_r2 = new ModelRenderer(this);
        this.neck42_r2.setRotationPoint(1.024F, -2.4312F, 2.0573F);
        this.tail5.addChild(neck42_r2);
        this.setRotateAngle(neck42_r2, 0.0045F, -0.0363F, 1.1181F);
        this.neck42_r2.cubeList.add(new ModelBox(neck42_r2, 0, 5, -0.244F, 0.316F, 3.9352F, 2, 0, 1, 0.0F, false));

        this.neck41_r2 = new ModelRenderer(this);
        this.neck41_r2.setRotationPoint(1.024F, -2.4312F, 2.0573F);
        this.tail5.addChild(neck41_r2);
        this.setRotateAngle(neck41_r2, 0.0071F, -0.0359F, 1.0482F);
        this.neck41_r2.cubeList.add(new ModelBox(neck41_r2, 24, 59, -0.244F, 0.316F, 1.9352F, 3, 0, 1, 0.0F, false));

        this.neck40_r1 = new ModelRenderer(this);
        this.neck40_r1.setRotationPoint(1.024F, -2.4312F, 2.0573F);
        this.tail5.addChild(neck40_r1);
        this.setRotateAngle(neck40_r1, 0.0077F, -0.0357F, 1.0307F);
        this.neck40_r1.cubeList.add(new ModelBox(neck40_r1, 119, 99, -0.244F, 0.316F, -0.0648F, 3, 0, 1, 0.0F, false));

        this.neck44_r1 = new ModelRenderer(this);
        this.neck44_r1.setRotationPoint(4.024F, -5.474F, -79.4151F);
        this.tail5.addChild(neck44_r1);
        this.setRotateAngle(neck44_r1, -0.1047F, 0.0F, 0.0F);
        this.neck44_r1.cubeList.add(new ModelBox(neck44_r1, 92, 88, -4.024F, -7.8069F, 83.6462F, 0, 2, 1, 0.0F, false));
        this.neck44_r1.cubeList.add(new ModelBox(neck44_r1, 8, 94, -4.024F, -7.6069F, 81.6462F, 0, 2, 1, 0.0F, false));
        this.neck44_r1.cubeList.add(new ModelBox(neck44_r1, 15, 94, -4.024F, -7.4069F, 79.6462F, 0, 2, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1826F, 14.8008F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.134F, 0.2163F, 0.0289F);


        this.Tail6 = new ModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 3.4F, 1.9F);
        this.tail2.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.0456F, 0.0F, 0.0F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 82, 58, -1.0F, -4.0F, -2.0F, 2, 2, 13, 0.002F, false));

        this.neck51_r1 = new ModelRenderer(this);
        this.neck51_r1.setRotationPoint(0.0F, -3.5067F, 1.5428F);
        this.Tail6.addChild(neck51_r1);
        this.setRotateAngle(neck51_r1, -0.0175F, 0.0F, 0.0F);
        this.neck51_r1.cubeList.add(new ModelBox(neck51_r1, 21, 83, 0.0F, -1.0F, -2.5F, 0, 2, 1, 0.0F, false));
        this.neck51_r1.cubeList.add(new ModelBox(neck51_r1, 32, 87, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));
        this.neck51_r1.cubeList.add(new ModelBox(neck51_r1, 74, 26, 0.0F, -1.0F, 7.5F, 0, 2, 1, 0.0F, false));
        this.neck51_r1.cubeList.add(new ModelBox(neck51_r1, 77, 10, 0.0F, -1.0F, 5.5F, 0, 2, 1, 0.0F, false));
        this.neck51_r1.cubeList.add(new ModelBox(neck51_r1, 81, 26, 0.0F, -1.0F, 3.5F, 0, 2, 1, 0.0F, false));
        this.neck51_r1.cubeList.add(new ModelBox(neck51_r1, 0, 26, 0.0F, -1.0F, 1.5F, 0, 2, 1, 0.0F, false));

        this.neck56_r1 = new ModelRenderer(this);
        this.neck56_r1.setRotationPoint(0.0F, -1.38F, -0.8071F);
        this.Tail6.addChild(neck56_r1);
        this.setRotateAngle(neck56_r1, 0.5323F, 0.0F, 0.0F);
        this.neck56_r1.cubeList.add(new ModelBox(neck56_r1, 10, 75, 0.0F, 3.9068F, 8.9888F, 0, 3, 1, 0.0F, false));
        this.neck56_r1.cubeList.add(new ModelBox(neck56_r1, 13, 75, 0.0F, 3.1041F, 7.1466F, 0, 3, 1, 0.0F, false));
        this.neck56_r1.cubeList.add(new ModelBox(neck56_r1, 21, 75, 0.0F, 2.2151F, 5.3551F, 0, 3, 1, 0.0F, false));
        this.neck56_r1.cubeList.add(new ModelBox(neck56_r1, 24, 75, 0.0F, 1.3262F, 3.5635F, 0, 3, 1, 0.0F, false));
        this.neck56_r1.cubeList.add(new ModelBox(neck56_r1, 78, 5, 0.0F, 0.4372F, 1.7719F, 0, 3, 1, 0.0F, false));
        this.neck56_r1.cubeList.add(new ModelBox(neck56_r1, 82, 58, 0.0F, -0.4517F, -0.0197F, 0, 3, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.9F, 12.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.1745F, 0.0F);


        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -1.3025F, 1.0093F);
        this.tail3.addChild(tail7);
        this.setRotateAngle(tail7, -0.0456F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 25, 87, -0.996F, 0.3F, -1.0F, 2, 2, 12, 0.0F, false));

        this.neck57_r1 = new ModelRenderer(this);
        this.neck57_r1.setRotationPoint(0.0F, 0.2958F, -10.2665F);
        this.tail7.addChild(neck57_r1);
        this.setRotateAngle(neck57_r1, -0.0175F, 0.0F, 0.0F);
        this.neck57_r1.cubeList.add(new ModelBox(neck57_r1, 12, 0, 0.0F, -0.5F, 19.5F, 0, 1, 1, 0.0F, false));
        this.neck57_r1.cubeList.add(new ModelBox(neck57_r1, 18, 0, 0.0F, -0.5F, 17.5F, 0, 1, 1, 0.0F, false));
        this.neck57_r1.cubeList.add(new ModelBox(neck57_r1, 19, 7, 0.0F, -0.5F, 15.5F, 0, 1, 1, 0.0F, false));
        this.neck57_r1.cubeList.add(new ModelBox(neck57_r1, 24, 52, 0.0F, -0.5F, 13.5F, 0, 1, 1, 0.0F, false));
        this.neck57_r1.cubeList.add(new ModelBox(neck57_r1, 30, 52, 0.0F, -0.5F, 11.5F, 0, 1, 1, 0.0F, false));
        this.neck57_r1.cubeList.add(new ModelBox(neck57_r1, 17, 69, 0.0F, -0.5F, 9.5F, 0, 2, 1, 0.0F, false));

        this.neck62_r1 = new ModelRenderer(this);
        this.neck62_r1.setRotationPoint(0.0F, 2.3975F, 0.3836F);
        this.tail7.addChild(neck62_r1);
        this.setRotateAngle(neck62_r1, 0.6021F, 0.0F, 0.0F);
        this.neck62_r1.cubeList.add(new ModelBox(neck62_r1, 63, 43, 0.0F, 4.5734F, 8.025F, 0, 2, 1, 0.0F, false));
        this.neck62_r1.cubeList.add(new ModelBox(neck62_r1, 41, 67, 0.0F, 2.5617F, 6.2998F, 0, 3, 1, 0.0F, false));
        this.neck62_r1.cubeList.add(new ModelBox(neck62_r1, 50, 67, 0.0F, 1.5499F, 4.5746F, 0, 3, 1, 0.0F, false));
        this.neck62_r1.cubeList.add(new ModelBox(neck62_r1, 53, 67, 0.0F, 0.5381F, 2.8494F, 0, 3, 1, 0.0F, false));
        this.neck62_r1.cubeList.add(new ModelBox(neck62_r1, 73, 73, 0.0F, -0.4736F, 1.1242F, 0, 3, 1, 0.0F, false));
        this.neck62_r1.cubeList.add(new ModelBox(neck62_r1, 0, 75, 0.0F, -1.2854F, -0.601F, 0, 3, 1, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.2975F, 11.7093F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, 0.3491F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 24, 52, -0.996F, -0.795F, -0.1092F, 2, 2, 9, -0.01F, false));

        this.neck66_r1 = new ModelRenderer(this);
        this.neck66_r1.setRotationPoint(0.0F, 0.7975F, -10.3164F);
        this.tail4.addChild(neck66_r1);
        this.setRotateAngle(neck66_r1, 0.6021F, 0.0F, 0.0F);
        this.neck66_r1.cubeList.add(new ModelBox(neck66_r1, 17, 52, 0.0F, 9.2341F, 14.5274F, 0, 2, 1, 0.0F, false));
        this.neck66_r1.cubeList.add(new ModelBox(neck66_r1, 56, 43, 0.0F, 8.1902F, 12.8098F, 0, 2, 1, 0.0F, false));
        this.neck66_r1.cubeList.add(new ModelBox(neck66_r1, 47, 60, 0.0F, 7.0664F, 11.1524F, 0, 2, 1, 0.0F, false));
        this.neck66_r1.cubeList.add(new ModelBox(neck66_r1, 9, 62, 0.0F, 6.0225F, 9.4347F, 0, 2, 1, 0.0F, false));

        this.fluke1 = new ModelRenderer(this);
        this.fluke1.setRotationPoint(0.0F, 0.105F, 8.5908F);
        this.tail4.addChild(fluke1);
        this.setRotateAngle(fluke1, -0.6472F, 0.1402F, -0.0223F);
        this.fluke1.cubeList.add(new ModelBox(fluke1, 30, 43, -0.996F, -0.9695F, 0.031F, 2, 2, 21, 0.0F, false));

        this.fluke2_r1 = new ModelRenderer(this);
        this.fluke2_r1.setRotationPoint(0.0F, 0.7305F, 20.931F);
        this.fluke1.addChild(fluke2_r1);
        this.setRotateAngle(fluke2_r1, 0.3054F, 0.0F, 0.0F);
        this.fluke2_r1.cubeList.add(new ModelBox(fluke2_r1, 0, 52, -0.496F, -0.7F, 0.1F, 1, 1, 21, 0.0F, false));

        this.belly3 = new ModelRenderer(this);
        this.belly3.setRotationPoint(-0.054F, 14.6713F, 19.6883F);
        this.tailbase1.addChild(belly3);
        this.setRotateAngle(belly3, 0.406F, 0.0F, 0.0F);
        this.belly3.cubeList.add(new ModelBox(belly3, 74, 21, -5.0F, 0.855F, 0.5531F, 10, 3, 12, 0.0F, false));

        this.rearflipper2 = new ModelRenderer(this);
        this.rearflipper2.setRotationPoint(6.646F, 10.418F, 35.2471F);
        this.tailbase1.addChild(rearflipper2);
        this.setRotateAngle(rearflipper2, 0.2997F, 0.3879F, -1.0484F);
        this.rearflipper2.cubeList.add(new ModelBox(rearflipper2, 86, 7, -1.0F, 3.0F, -1.0F, 2, 2, 3, 0.0F, false));
        this.rearflipper2.cubeList.add(new ModelBox(rearflipper2, 42, 93, -1.0F, 0.0F, -0.5F, 2, 3, 2, 0.0F, false));

        this.rearflipper3_r1 = new ModelRenderer(this);
        this.rearflipper3_r1.setRotationPoint(0.0F, 6.4F, -0.5F);
        this.rearflipper2.addChild(rearflipper3_r1);
        this.setRotateAngle(rearflipper3_r1, -0.1745F, 0.0F, 0.0F);
        this.rearflipper3_r1.cubeList.add(new ModelBox(rearflipper3_r1, 85, 119, -1.0F, -1.0F, -1.4F, 2, 2, 2, 0.0F, false));

        this.rearflipper2_r1 = new ModelRenderer(this);
        this.rearflipper2_r1.setRotationPoint(0.0F, 6.4F, 2.4F);
        this.rearflipper2.addChild(rearflipper2_r1);
        this.setRotateAngle(rearflipper2_r1, 0.2182F, 0.0F, 0.0F);
        this.rearflipper2_r1.cubeList.add(new ModelBox(rearflipper2_r1, 94, 119, -1.0F, -1.2F, -1.3F, 2, 2, 2, 0.0F, false));

        this.rearflipperfingers2 = new ModelRenderer(this);
        this.rearflipperfingers2.setRotationPoint(0.0F, 0.0F, -5.1F);
        this.rearflipper2.addChild(rearflipperfingers2);
        this.rearflipperfingers2.cubeList.add(new ModelBox(rearflipperfingers2, 61, 96, 0.0F, 7.9962F, 2.8872F, 0, 17, 6, 0.0F, false));

        this.rearflipper3 = new ModelRenderer(this);
        this.rearflipper3.setRotationPoint(-6.646F, 10.418F, 35.2471F);
        this.tailbase1.addChild(rearflipper3);
        this.setRotateAngle(rearflipper3, 0.2376F, -0.3298F, 1.3529F);
        this.rearflipper3.cubeList.add(new ModelBox(rearflipper3, 34, 75, -1.0F, 3.0F, -1.0F, 2, 2, 3, 0.0F, false));
        this.rearflipper3.cubeList.add(new ModelBox(rearflipper3, 67, 67, -1.0F, 0.0F, -0.5F, 2, 3, 2, 0.0F, false));

        this.rearflipper4_r1 = new ModelRenderer(this);
        this.rearflipper4_r1.setRotationPoint(0.0F, 6.4F, -0.5F);
        this.rearflipper3.addChild(rearflipper4_r1);
        this.setRotateAngle(rearflipper4_r1, -0.1745F, 0.0F, 0.0F);
        this.rearflipper4_r1.cubeList.add(new ModelBox(rearflipper4_r1, 55, 96, -1.0F, -1.0F, -1.4F, 2, 2, 2, 0.0F, false));

        this.rearflipper3_r2 = new ModelRenderer(this);
        this.rearflipper3_r2.setRotationPoint(0.0F, 6.4F, 2.4F);
        this.rearflipper3.addChild(rearflipper3_r2);
        this.setRotateAngle(rearflipper3_r2, 0.2182F, 0.0F, 0.0F);
        this.rearflipper3_r2.cubeList.add(new ModelBox(rearflipper3_r2, 41, 119, -1.0F, -1.2F, -1.3F, 2, 2, 2, 0.0F, false));

        this.rearflipperfingers3 = new ModelRenderer(this);
        this.rearflipperfingers3.setRotationPoint(0.0F, 0.0F, -5.1F);
        this.rearflipper3.addChild(rearflipperfingers3);
        this.rearflipperfingers3.cubeList.add(new ModelBox(rearflipperfingers3, 48, 96, 0.0F, 7.9962F, 2.8872F, 0, 17, 6, 0.0F, false));

        this.lowerbody3 = new ModelRenderer(this);
        this.lowerbody3.setRotationPoint(-0.054F, -0.5287F, 20.8883F);
        this.tailbase1.addChild(lowerbody3);
        this.setRotateAngle(lowerbody3, 0.0F, -0.2182F, 0.0F);


        this.lowerbody2 = new ModelRenderer(this);
        this.lowerbody2.setRotationPoint(0.0F, -1.3228F, -16.1113F);
        this.lowerbody3.addChild(lowerbody2);
        this.setRotateAngle(lowerbody2, 0.1309F, 0.0F, 0.0F);


        this.lowerbody3_r1 = new ModelRenderer(this);
        this.lowerbody3_r1.setRotationPoint(0.0F, 19.3991F, -20.8483F);
        this.lowerbody2.addChild(lowerbody3_r1);
        this.setRotateAngle(lowerbody3_r1, -0.1396F, 0.0F, 0.0F);
        this.lowerbody3_r1.cubeList.add(new ModelBox(lowerbody3_r1, 0, 0, -10.0F, -3.0444F, 0.0648F, 20, 3, 22, 0.0F, false));

        this.lowerbody1 = new ModelRenderer(this);
        this.lowerbody1.setRotationPoint(0.0F, -0.4009F, -19.8483F);
        this.lowerbody2.addChild(lowerbody1);
        this.setRotateAngle(lowerbody1, 0.0886F, -0.1739F, -0.0154F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.019F, -17.2795F);
        this.lowerbody1.addChild(neck1);
        this.setRotateAngle(neck1, -0.088F, -0.1304F, 0.0115F);


        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(4.024F, -0.374F, -5.7151F);
        this.neck1.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, -0.1047F, 0.0F, 0.0F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 9, 122, -4.024F, -1.8069F, 3.6462F, 0, 2, 1, 0.0F, false));
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 78, 122, -4.024F, -1.3069F, 1.6462F, 0, 2, 1, 0.0F, false));
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 122, 79, -4.024F, -0.4069F, -0.3538F, 0, 2, 1, 0.0F, false));

        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(4.024F, 0.549F, -6.6028F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.0873F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 0, 0, -5.024F, -0.849F, -0.3972F, 2, 2, 7, 0.002F, false));

        this.neck6_r1 = new ModelRenderer(this);
        this.neck6_r1.setRotationPoint(-0.916F, 0.6056F, -1.5871F);
        this.neck1.addChild(neck6_r1);
        this.setRotateAngle(neck6_r1, 0.0435F, 0.6178F, -1.6477F);
        this.neck6_r1.cubeList.add(new ModelBox(neck6_r1, 82, 66, -12.1245F, -6.2088F, -0.3522F, 5, 0, 1, 0.0F, true));

        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(-0.916F, 0.6056F, -1.5871F);
        this.neck1.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, 0.546F, 0.308F, -0.6148F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 82, 68, -4.8423F, -0.2252F, -0.3522F, 5, 0, 1, 0.0F, true));

        this.neck5_r2 = new ModelRenderer(this);
        this.neck5_r2.setRotationPoint(-0.916F, 0.6056F, -1.5871F);
        this.neck1.addChild(neck5_r2);
        this.setRotateAngle(neck5_r2, 0.3278F, 0.5351F, -1.1346F);
        this.neck5_r2.cubeList.add(new ModelBox(neck5_r2, 82, 74, -9.081F, -2.6161F, -0.3522F, 5, 0, 1, 0.0F, true));

        this.neck4_r2 = new ModelRenderer(this);
        this.neck4_r2.setRotationPoint(-0.916F, 0.6046F, -3.7962F);
        this.neck1.addChild(neck4_r2);
        this.setRotateAngle(neck4_r2, 0.3459F, 0.5856F, -1.308F);
        this.neck4_r2.cubeList.add(new ModelBox(neck4_r2, 24, 69, -11.2685F, -2.5078F, -0.1844F, 7, 0, 1, 0.0F, true));

        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(-0.916F, 0.6046F, -3.7962F);
        this.neck1.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 0.5866F, 0.3441F, -0.7848F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 111, 114, -4.9506F, -0.0376F, -0.1844F, 5, 0, 1, 0.0F, true));

        this.neck2_r2 = new ModelRenderer(this);
        this.neck2_r2.setRotationPoint(-0.916F, 0.6309F, -5.7065F);
        this.neck1.addChild(neck2_r2);
        this.setRotateAngle(neck2_r2, 0.576F, 0.3539F, -0.8231F);
        this.neck2_r2.cubeList.add(new ModelBox(neck2_r2, 115, 15, -4.9938F, 0.0372F, -0.2847F, 5, 0, 1, 0.0F, true));

        this.neck3_r2 = new ModelRenderer(this);
        this.neck3_r2.setRotationPoint(-0.916F, 0.6309F, -5.7065F);
        this.neck1.addChild(neck3_r2);
        this.setRotateAngle(neck3_r2, 0.3297F, 0.5891F, -1.3517F);
        this.neck3_r2.cubeList.add(new ModelBox(neck3_r2, 119, 83, -8.3433F, -2.4647F, -0.2847F, 4, 0, 1, 0.0F, true));

        this.neck5_r3 = new ModelRenderer(this);
        this.neck5_r3.setRotationPoint(1.024F, 0.6056F, -1.5871F);
        this.neck1.addChild(neck5_r3);
        this.setRotateAngle(neck5_r3, 0.0435F, -0.6178F, 1.6477F);
        this.neck5_r3.cubeList.add(new ModelBox(neck5_r3, 82, 66, 7.1245F, -6.2088F, -0.3522F, 5, 0, 1, 0.0F, false));

        this.neck4_r3 = new ModelRenderer(this);
        this.neck4_r3.setRotationPoint(1.024F, 0.6056F, -1.5871F);
        this.neck1.addChild(neck4_r3);
        this.setRotateAngle(neck4_r3, 0.3278F, -0.5351F, 1.1346F);
        this.neck4_r3.cubeList.add(new ModelBox(neck4_r3, 82, 74, 4.081F, -2.6161F, -0.3522F, 5, 0, 1, 0.0F, false));

        this.neck3_r3 = new ModelRenderer(this);
        this.neck3_r3.setRotationPoint(1.024F, 0.6056F, -1.5871F);
        this.neck1.addChild(neck3_r3);
        this.setRotateAngle(neck3_r3, 0.546F, -0.308F, 0.6148F);
        this.neck3_r3.cubeList.add(new ModelBox(neck3_r3, 82, 68, -0.1577F, -0.2252F, -0.3522F, 5, 0, 1, 0.0F, false));

        this.neck3_r4 = new ModelRenderer(this);
        this.neck3_r4.setRotationPoint(1.024F, 0.6046F, -3.7962F);
        this.neck1.addChild(neck3_r4);
        this.setRotateAngle(neck3_r4, 0.3459F, -0.5856F, 1.308F);
        this.neck3_r4.cubeList.add(new ModelBox(neck3_r4, 24, 69, 4.2685F, -2.5078F, -0.1844F, 7, 0, 1, 0.0F, false));

        this.neck2_r3 = new ModelRenderer(this);
        this.neck2_r3.setRotationPoint(1.024F, 0.6046F, -3.7962F);
        this.neck1.addChild(neck2_r3);
        this.setRotateAngle(neck2_r3, 0.5866F, -0.3441F, 0.7848F);
        this.neck2_r3.cubeList.add(new ModelBox(neck2_r3, 111, 114, -0.0494F, -0.0376F, -0.1844F, 5, 0, 1, 0.0F, false));

        this.neck2_r4 = new ModelRenderer(this);
        this.neck2_r4.setRotationPoint(1.024F, 0.6309F, -5.7065F);
        this.neck1.addChild(neck2_r4);
        this.setRotateAngle(neck2_r4, 0.3297F, -0.5891F, 1.3517F);
        this.neck2_r4.cubeList.add(new ModelBox(neck2_r4, 119, 83, 4.3433F, -2.4647F, -0.2847F, 4, 0, 1, 0.0F, false));

        this.neck1_r1 = new ModelRenderer(this);
        this.neck1_r1.setRotationPoint(1.024F, 0.6309F, -5.7065F);
        this.neck1.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, 0.576F, -0.3539F, 0.8231F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 115, 15, -0.0062F, 0.0372F, -0.2847F, 5, 0, 1, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.7F, -6.8F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2085F, -0.6102F, -0.0305F);
        this.neck2.cubeList.add(new ModelBox(neck2, 107, 74, -1.0F, -1.0417F, -4.9531F, 2, 2, 5, 0.0F, false));

        this.neck4_r4 = new ModelRenderer(this);
        this.neck4_r4.setRotationPoint(-0.892F, -0.0008F, -0.0337F);
        this.neck2.addChild(neck4_r4);
        this.setRotateAngle(neck4_r4, -0.2889F, 0.5408F, -1.7646F);
        this.neck4_r4.cubeList.add(new ModelBox(neck4_r4, 69, 58, -6.4012F, -2.4589F, -0.5067F, 2, 0, 1, 0.0F, true));

        this.neck3_r5 = new ModelRenderer(this);
        this.neck3_r5.setRotationPoint(-0.892F, -0.0008F, -0.0337F);
        this.neck2.addChild(neck3_r5);
        this.setRotateAngle(neck3_r5, 0.0558F, 0.6041F, -1.143F);
        this.neck3_r5.cubeList.add(new ModelBox(neck3_r5, 74, 114, -5.0411F, 0.0711F, -0.5067F, 5, 0, 1, 0.0F, true));

        this.neck4_r5 = new ModelRenderer(this);
        this.neck4_r5.setRotationPoint(-0.892F, -0.0008F, -2.7837F);
        this.neck2.addChild(neck4_r5);
        this.setRotateAngle(neck4_r5, 0.6062F, 0.5495F, -0.9192F);
        this.neck4_r5.cubeList.add(new ModelBox(neck4_r5, 120, 94, -3.0411F, 0.0711F, -0.5067F, 3, 0, 1, 0.0F, true));

        this.neck3_r6 = new ModelRenderer(this);
        this.neck3_r6.setRotationPoint(1.0F, -0.0008F, -2.7837F);
        this.neck2.addChild(neck3_r6);
        this.setRotateAngle(neck3_r6, 0.6062F, -0.5495F, 0.9192F);
        this.neck3_r6.cubeList.add(new ModelBox(neck3_r6, 120, 94, 0.0411F, 0.0711F, -0.5067F, 3, 0, 1, 0.0F, false));

        this.neck3_r7 = new ModelRenderer(this);
        this.neck3_r7.setRotationPoint(1.0F, -0.0008F, -0.7837F);
        this.neck2.addChild(neck3_r7);
        this.setRotateAngle(neck3_r7, 0.2799F, -0.6224F, 1.5768F);
        this.neck3_r7.cubeList.add(new ModelBox(neck3_r7, 69, 58, 4.4012F, -2.4589F, -0.5067F, 2, 0, 1, 0.0F, false));

        this.neck2_r5 = new ModelRenderer(this);
        this.neck2_r5.setRotationPoint(1.0F, -0.0008F, -0.7837F);
        this.neck2.addChild(neck2_r5);
        this.setRotateAngle(neck2_r5, 0.5566F, -0.4035F, 1.027F);
        this.neck2_r5.cubeList.add(new ModelBox(neck2_r5, 74, 114, 0.0411F, 0.0711F, -0.5067F, 5, 0, 1, 0.0F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, -0.3417F, -4.0531F);
        this.neck2.addChild(head1);
        this.setRotateAngle(head1, -0.0973F, -0.2056F, 0.1871F);
        this.head1.cubeList.add(new ModelBox(head1, 50, 67, -2.5F, -0.8317F, -8.4954F, 5, 4, 6, 0.004F, false));
        this.head1.cubeList.add(new ModelBox(head1, 103, 119, 0.8F, -0.4043F, -6.95F, 2, 2, 2, -0.2F, false));
        this.head1.cubeList.add(new ModelBox(head1, 12, 0, 1.5F, -0.9043F, -7.45F, 1, 3, 3, 0.05F, false));
        this.head1.cubeList.add(new ModelBox(head1, 103, 119, -2.892F, -0.4043F, -6.95F, 2, 2, 2, -0.2F, true));
        this.head1.cubeList.add(new ModelBox(head1, 12, 0, -2.592F, -0.9043F, -7.45F, 1, 3, 3, 0.05F, true));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.692F, 0.8957F, -12.75F);
        this.head1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 95, 74, -0.2F, -0.5F, -1.0F, 2, 1, 2, -0.2F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 95, 74, 1.492F, -0.5F, -1.0F, 2, 1, 2, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.108F, -1.6043F, -4.85F);
        this.head1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -2.2864F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 120, -2.7F, -1.9989F, -0.0747F, 1, 2, 2, 0.01F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 120, 1.392F, -1.9989F, -0.0747F, 1, 2, 2, 0.01F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.108F, -1.5043F, -6.85F);
        this.head1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.501F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 57, 120, -2.7F, -2.001F, -0.0349F, 1, 2, 2, 0.012F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 57, 120, 1.392F, -2.001F, -0.0349F, 1, 2, 2, 0.012F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.108F, 2.1957F, -8.55F);
        this.head1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.637F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 78, -2.7F, -0.9652F, -0.0397F, 1, 1, 1, 0.01F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 78, 1.392F, -0.9652F, -0.0397F, 1, 1, 1, 0.01F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.108F, -0.5043F, -8.55F);
        this.head1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.021F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 26, -2.7F, -1.973F, 0.0007F, 1, 2, 1, 0.01F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 26, 1.392F, -1.973F, 0.0007F, 1, 2, 1, 0.01F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.108F, 0.9957F, -5.95F);
        this.head1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 26, -2.7F, -1.5F, -2.5F, 1, 3, 5, 0.012F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 26, 1.392F, -1.5F, -2.5F, 1, 3, 5, 0.012F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.108F, 1.3957F, -9.15F);
        this.head1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3229F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 26, -2.7F, -1.9652F, -0.0332F, 1, 2, 1, 0.013F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 26, 1.392F, -1.9652F, -0.0332F, 1, 2, 1, 0.013F, false));

        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(0.0F, -2.2317F, -7.1954F);
        this.head1.addChild(head4_r1);
        this.setRotateAngle(head4_r1, 0.0873F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 63, 11, -2.5F, -0.0254F, -0.0365F, 5, 3, 3, -0.003F, false));

        this.head3_r1 = new ModelRenderer(this);
        this.head3_r1.setRotationPoint(0.0F, -1.1317F, -9.3954F);
        this.head1.addChild(head3_r1);
        this.setRotateAngle(head3_r1, 0.4712F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 30, 102, -2.5F, -0.0067F, -0.5769F, 5, 3, 3, 0.0F, false));

        this.head2_r1 = new ModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, -1.8317F, -9.4954F);
        this.head1.addChild(head2_r1);
        this.setRotateAngle(head2_r1, 0.1745F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 90, 101, -1.5F, 0.7F, -5.0F, 3, 2, 5, 0.0F, false));

        this.rostrum1 = new ModelRenderer(this);
        this.rostrum1.setRotationPoint(0.0F, 0.6683F, -10.6954F);
        this.head1.addChild(rostrum1);


        this.rostrum3_r1 = new ModelRenderer(this);
        this.rostrum3_r1.setRotationPoint(0.0F, 0.5F, -1.4F);
        this.rostrum1.addChild(rostrum3_r1);
        this.setRotateAngle(rostrum3_r1, -0.2269F, 0.0F, 0.0F);
        this.rostrum3_r1.cubeList.add(new ModelBox(rostrum3_r1, 56, 50, -1.5F, 0.5078F, 0.0447F, 3, 1, 2, 0.0F, false));
        this.rostrum3_r1.cubeList.add(new ModelBox(rostrum3_r1, 104, 0, -2.0F, -0.9922F, 0.0447F, 4, 2, 4, 0.0F, false));

        this.rostrum2_r1 = new ModelRenderer(this);
        this.rostrum2_r1.setRotationPoint(0.0F, 1.2F, -7.3F);
        this.rostrum1.addChild(rostrum2_r1);
        this.setRotateAngle(rostrum2_r1, -0.0524F, 0.0F, 0.0F);
        this.rostrum2_r1.cubeList.add(new ModelBox(rostrum2_r1, 21, 75, -1.5F, -0.5F, -0.1F, 3, 1, 6, 0.0F, false));
        this.rostrum2_r1.cubeList.add(new ModelBox(rostrum2_r1, 0, 10, -2.0F, -1.0F, -0.1F, 4, 1, 6, -0.003F, false));

        this.rostrum2 = new ModelRenderer(this);
        this.rostrum2.setRotationPoint(0.0F, 0.5F, -7.8F);
        this.rostrum1.addChild(rostrum2);
        this.rostrum2.cubeList.add(new ModelBox(rostrum2, 54, 81, -1.5F, -0.3F, -12.5F, 3, 1, 13, 0.0F, false));
        this.rostrum2.cubeList.add(new ModelBox(rostrum2, 86, 0, -1.0F, 0.1F, -12.4F, 2, 1, 13, 0.0F, false));

        this.teeth2 = new ModelRenderer(this);
        this.teeth2.setRotationPoint(0.0F, 1.0F, 0.3F);
        this.rostrum2.addChild(teeth2);


        this.beak1 = new ModelRenderer(this);
        this.beak1.setRotationPoint(0.0F, -0.9F, 1.7F);
        this.rostrum1.addChild(beak1);
        this.setRotateAngle(beak1, 0.0422F, 0.0F, 0.0F);


        this.beak2_r1 = new ModelRenderer(this);
        this.beak2_r1.setRotationPoint(0.0F, -0.0706F, -8.9936F);
        this.beak1.addChild(beak2_r1);
        this.setRotateAngle(beak2_r1, 0.0524F, 0.0F, 0.0F);
        this.beak2_r1.cubeList.add(new ModelBox(beak2_r1, 107, 17, -1.0F, -0.0564F, -0.1074F, 2, 2, 5, 0.0F, false));

        this.beak1_r1 = new ModelRenderer(this);
        this.beak1_r1.setRotationPoint(0.0F, 0.1F, -22.0F);
        this.beak1.addChild(beak1_r1);
        this.setRotateAngle(beak1_r1, 0.0175F, 0.0F, 0.0F);
        this.beak1_r1.cubeList.add(new ModelBox(beak1_r1, 74, 83, -1.0F, 0.0F, 0.0F, 2, 1, 13, -0.003F, false));

        this.teeth1 = new ModelRenderer(this);
        this.teeth1.setRotationPoint(0.0F, 0.7F, 1.2F);
        this.rostrum1.addChild(teeth1);
        this.setRotateAngle(teeth1, 0.0911F, 0.0F, 0.0F);


        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 2.2683F, 1.2046F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.5236F, 0.0F, 0.0F);


        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(0.608F, 2.7853F, -8.6586F);
        this.jaw1.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, 0.0873F, -0.1745F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 0, 62, -0.1F, 0.3F, 2.2F, 0, 1, 8, 0.0F, true));

        this.jaw3_r2 = new ModelRenderer(this);
        this.jaw3_r2.setRotationPoint(-1.892F, 0.5853F, -3.6586F);
        this.jaw1.addChild(jaw3_r2);
        this.setRotateAngle(jaw3_r2, 0.0087F, 0.0F, 0.0F);
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 0, 52, -0.5F, -0.0486F, -6.94F, 1, 2, 7, 0.0F, true));
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 0, 52, 3.392F, -0.0486F, -6.94F, 1, 2, 7, 0.0F, false));

        this.jaw5_r1 = new ModelRenderer(this);
        this.jaw5_r1.setRotationPoint(-1.892F, 3.2853F, -5.2586F);
        this.jaw1.addChild(jaw5_r1);
        this.setRotateAngle(jaw5_r1, -0.0611F, 0.0F, 0.0F);
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 74, 83, -0.5F, -2.0102F, -5.0274F, 1, 2, 5, 0.002F, true));
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 74, 83, 3.392F, -2.0102F, -5.0274F, 1, 2, 5, 0.002F, false));

        this.jaw4_r1 = new ModelRenderer(this);
        this.jaw4_r1.setRotationPoint(-1.892F, 3.2853F, -5.3586F);
        this.jaw1.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, 0.1833F, 0.0F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 92, 88, -0.5F, -1.9954F, 0.0715F, 1, 2, 4, -0.002F, true));
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 92, 88, 3.392F, -1.9954F, 0.0715F, 1, 2, 4, -0.002F, false));

        this.jaw4_r2 = new ModelRenderer(this);
        this.jaw4_r2.setRotationPoint(-1.892F, 1.6853F, -0.0586F);
        this.jaw1.addChild(jaw4_r2);
        this.setRotateAngle(jaw4_r2, 0.6021F, 0.0F, 0.0F);
        this.jaw4_r2.cubeList.add(new ModelBox(jaw4_r2, 0, 52, -0.5F, -1.9939F, -1.7581F, 1, 2, 2, 0.0F, true));
        this.jaw4_r2.cubeList.add(new ModelBox(jaw4_r2, 0, 52, 3.392F, -1.9939F, -1.7581F, 1, 2, 2, 0.0F, false));

        this.jaw3_r3 = new ModelRenderer(this);
        this.jaw3_r3.setRotationPoint(-1.892F, -0.4147F, 0.1414F);
        this.jaw1.addChild(jaw3_r3);
        this.setRotateAngle(jaw3_r3, 1.0385F, 0.0F, 0.0F);
        this.jaw3_r3.cubeList.add(new ModelBox(jaw3_r3, 15, 39, -0.5F, -0.1004F, -1.869F, 1, 1, 2, -0.002F, true));
        this.jaw3_r3.cubeList.add(new ModelBox(jaw3_r3, 15, 39, 3.392F, -0.1004F, -1.869F, 1, 1, 2, -0.002F, false));

        this.jaw2_r1 = new ModelRenderer(this);
        this.jaw2_r1.setRotationPoint(-1.892F, 0.5853F, -3.6586F);
        this.jaw1.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, 0.2705F, 0.0F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 86, 0, -0.5F, -0.0486F, -0.94F, 1, 1, 5, 0.002F, true));
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 86, 0, 3.392F, -0.0486F, -0.94F, 1, 1, 5, 0.002F, false));

        this.jaw2_r2 = new ModelRenderer(this);
        this.jaw2_r2.setRotationPoint(-0.5F, 2.7853F, -8.6586F);
        this.jaw1.addChild(jaw2_r2);
        this.setRotateAngle(jaw2_r2, 0.0873F, 0.1745F, 0.0F);
        this.jaw2_r2.cubeList.add(new ModelBox(jaw2_r2, 0, 62, 0.1F, 0.3F, 2.2F, 0, 1, 8, 0.0F, false));

        this.lowerrostrum1 = new ModelRenderer(this);
        this.lowerrostrum1.setRotationPoint(0.0F, 1.2853F, -11.8586F);
        this.jaw1.addChild(lowerrostrum1);


        this.lowerrostrum4_r1 = new ModelRenderer(this);
        this.lowerrostrum4_r1.setRotationPoint(-1.392F, -0.6F, 1.6F);
        this.lowerrostrum1.addChild(lowerrostrum4_r1);
        this.setRotateAngle(lowerrostrum4_r1, -0.1047F, 0.0F, 0.0F);
        this.lowerrostrum4_r1.cubeList.add(new ModelBox(lowerrostrum4_r1, 82, 58, 0.2F, -0.7F, -9.6F, 0, 1, 6, 0.0F, true));
        this.lowerrostrum4_r1.cubeList.add(new ModelBox(lowerrostrum4_r1, 74, 102, -0.5F, -0.1F, -9.6F, 1, 1, 6, 0.0F, true));
        this.lowerrostrum4_r1.cubeList.add(new ModelBox(lowerrostrum4_r1, 8, 94, -0.5F, -0.1F, -3.6F, 1, 2, 4, 0.0F, true));
        this.lowerrostrum4_r1.cubeList.add(new ModelBox(lowerrostrum4_r1, 82, 58, 2.692F, -0.7F, -9.6F, 0, 1, 6, 0.0F, false));
        this.lowerrostrum4_r1.cubeList.add(new ModelBox(lowerrostrum4_r1, 74, 102, 2.392F, -0.1F, -9.6F, 1, 1, 6, 0.0F, false));
        this.lowerrostrum4_r1.cubeList.add(new ModelBox(lowerrostrum4_r1, 8, 94, 2.392F, -0.1F, -3.6F, 1, 2, 4, 0.0F, false));

        this.lowerrostrum3_r1 = new ModelRenderer(this);
        this.lowerrostrum3_r1.setRotationPoint(-1.392F, -1.6F, -1.9F);
        this.lowerrostrum1.addChild(lowerrostrum3_r1);
        this.setRotateAngle(lowerrostrum3_r1, -0.192F, 0.0F, 0.0F);
        this.lowerrostrum3_r1.cubeList.add(new ModelBox(lowerrostrum3_r1, 0, 10, 0.2F, -0.0713F, -0.0146F, 0, 1, 2, 0.0F, true));
        this.lowerrostrum3_r1.cubeList.add(new ModelBox(lowerrostrum3_r1, 0, 10, 2.692F, -0.0713F, -0.0146F, 0, 1, 2, 0.0F, false));

        this.lowerrostrum2 = new ModelRenderer(this);
        this.lowerrostrum2.setRotationPoint(0.0F, 0.1F, -8.0F);
        this.lowerrostrum1.addChild(lowerrostrum2);
        this.lowerrostrum2.cubeList.add(new ModelBox(lowerrostrum2, 119, 85, -1.5F, -2.41F, -11.5F, 3, 1, 1, 0.0F, false));

        this.lowerrostrum5_r1 = new ModelRenderer(this);
        this.lowerrostrum5_r1.setRotationPoint(-0.892F, -1.81F, 0.1F);
        this.lowerrostrum2.addChild(lowerrostrum5_r1);
        this.setRotateAngle(lowerrostrum5_r1, -0.0524F, 0.0F, 0.0F);
        this.lowerrostrum5_r1.cubeList.add(new ModelBox(lowerrostrum5_r1, 0, 26, -0.1F, -0.6F, -11.0F, 0, 1, 11, 0.0F, true));
        this.lowerrostrum5_r1.cubeList.add(new ModelBox(lowerrostrum5_r1, 94, 88, -0.5F, 0.0F, -11.0F, 1, 1, 11, 0.003F, true));
        this.lowerrostrum5_r1.cubeList.add(new ModelBox(lowerrostrum5_r1, 0, 26, 1.992F, -0.6F, -11.0F, 0, 1, 11, 0.0F, false));
        this.lowerrostrum5_r1.cubeList.add(new ModelBox(lowerrostrum5_r1, 94, 88, 1.392F, 0.0F, -11.0F, 1, 1, 11, 0.003F, false));

        this.teeth4 = new ModelRenderer(this);
        this.teeth4.setRotationPoint(0.0F, -1.4F, 0.3F);
        this.lowerrostrum2.addChild(teeth4);


        this.lowerbeak2 = new ModelRenderer(this);
        this.lowerbeak2.setRotationPoint(0.0F, 0.5F, -7.3F);
        this.lowerrostrum1.addChild(lowerbeak2);
        this.setRotateAngle(lowerbeak2, -0.0543F, 0.0F, 0.0F);


        this.lowerbeak3_r1 = new ModelRenderer(this);
        this.lowerbeak3_r1.setRotationPoint(-0.892F, -0.5F, -0.7F);
        this.lowerbeak2.addChild(lowerbeak3_r1);
        this.setRotateAngle(lowerbeak3_r1, -0.0524F, 0.0F, 0.0F);
        this.lowerbeak3_r1.cubeList.add(new ModelBox(lowerbeak3_r1, 92, 74, -0.5F, -1.0F, -11.3F, 1, 1, 12, -0.004F, true));
        this.lowerbeak3_r1.cubeList.add(new ModelBox(lowerbeak3_r1, 92, 74, 1.392F, -1.0F, -11.3F, 1, 1, 12, -0.004F, false));

        this.beak3 = new ModelRenderer(this);
        this.beak3.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.lowerrostrum1.addChild(beak3);
        this.setRotateAngle(beak3, -0.0873F, 0.0F, 0.0F);
        this.beak3.cubeList.add(new ModelBox(beak3, 107, 25, 0.9F, -1.0F, -8.0F, 1, 1, 6, 0.0F, false));
        this.beak3.cubeList.add(new ModelBox(beak3, 107, 25, -1.792F, -1.0F, -8.0F, 1, 1, 6, 0.0F, true));

        this.beak5_r1 = new ModelRenderer(this);
        this.beak5_r1.setRotationPoint(-1.292F, 0.0F, -3.0F);
        this.beak3.addChild(beak5_r1);
        this.setRotateAngle(beak5_r1, -0.1571F, 0.0F, 0.0F);
        this.beak5_r1.cubeList.add(new ModelBox(beak5_r1, 101, 103, -0.5F, -0.9F, -1.2F, 1, 1, 6, -0.004F, true));
        this.beak5_r1.cubeList.add(new ModelBox(beak5_r1, 101, 103, 2.192F, -0.9F, -1.2F, 1, 1, 6, -0.004F, false));

        this.teeth3 = new ModelRenderer(this);
        this.teeth3.setRotationPoint(0.0F, -0.8F, 1.2F);
        this.lowerrostrum1.addChild(teeth3);
        this.setRotateAngle(teeth3, -0.0456F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -2.0317F, -1.6954F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.3187F, 0.0F, 0.0F);


        this.head4_r2 = new ModelRenderer(this);
        this.head4_r2.setRotationPoint(0.0F, -0.3F, 1.1F);
        this.head2.addChild(head4_r2);
        this.setRotateAngle(head4_r2, 0.0524F, 0.0F, 0.0F);
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 56, 58, -2.5F, -0.0373F, -1.7338F, 5, 3, 2, 0.003F, false));
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 71, 120, -2.392F, 2.9627F, -1.7338F, 1, 2, 2, -0.004F, true));
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 71, 120, 1.5F, 2.9627F, -1.7338F, 1, 2, 2, -0.004F, false));

        this.head2_r2 = new ModelRenderer(this);
        this.head2_r2.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.head2.addChild(head2_r2);
        this.setRotateAngle(head2_r2, -0.2618F, 0.0F, 0.0F);
        this.head2_r2.cubeList.add(new ModelBox(head2_r2, 0, 39, -2.5F, -1.0F, -1.5F, 5, 4, 4, 0.0F, false));

        this.flipper2 = new ModelRenderer(this);
        this.flipper2.setRotationPoint(8.0F, 12.919F, -13.5795F);
        this.lowerbody1.addChild(flipper2);
        this.setRotateAngle(flipper2, 0.3992F, 0.239F, -0.8824F);
        this.flipper2.cubeList.add(new ModelBox(flipper2, 0, 75, -0.8763F, -0.2854F, -2.865F, 2, 5, 5, 0.0F, false));

        this.flipper5_r1 = new ModelRenderer(this);
        this.flipper5_r1.setRotationPoint(-0.4158F, 4.7106F, 1.0131F);
        this.flipper2.addChild(flipper5_r1);
        this.setRotateAngle(flipper5_r1, -0.0302F, -0.0233F, -0.0895F);
        this.flipper5_r1.cubeList.add(new ModelBox(flipper5_r1, 0, 62, 0.174F, 4.0879F, -3.7904F, 1, 2, 2, 0.0F, false));
        this.flipper5_r1.cubeList.add(new ModelBox(flipper5_r1, 71, 60, 0.174F, 3.3879F, 1.0096F, 1, 1, 1, 0.0F, false));
        this.flipper5_r1.cubeList.add(new ModelBox(flipper5_r1, 73, 0, 0.174F, 4.0879F, -1.2904F, 1, 2, 2, 0.0F, false));
        this.flipper5_r1.cubeList.add(new ModelBox(flipper5_r1, 64, 120, 0.174F, 0.3879F, -0.4904F, 1, 2, 2, 0.0F, false));
        this.flipper5_r1.cubeList.add(new ModelBox(flipper5_r1, 108, 88, 0.174F, 0.3879F, -3.9904F, 1, 3, 3, 0.0F, false));

        this.flipperfingers2 = new ModelRenderer(this);
        this.flipperfingers2.setRotationPoint(0.1237F, 1.1146F, -7.065F);
        this.flipper2.addChild(flipperfingers2);


        this.flipperfingers2_r1 = new ModelRenderer(this);
        this.flipperfingers2_r1.setRotationPoint(-0.5395F, 3.5961F, 8.0782F);
        this.flipperfingers2.addChild(flipperfingers2_r1);
        this.setRotateAngle(flipperfingers2_r1, -0.0302F, -0.0233F, -0.0895F);
        this.flipperfingers2_r1.cubeList.add(new ModelBox(flipperfingers2_r1, 15, 95, 0.674F, 6.5879F, -4.1904F, 0, 20, 7, 0.0F, false));

        this.flipper3 = new ModelRenderer(this);
        this.flipper3.setRotationPoint(-7.892F, 12.919F, -13.5795F);
        this.lowerbody1.addChild(flipper3);
        this.setRotateAngle(flipper3, 0.1186F, -0.1284F, 0.8214F);
        this.flipper3.cubeList.add(new ModelBox(flipper3, 63, 0, -1.1237F, -0.2854F, -2.865F, 2, 5, 5, 0.0F, false));

        this.flipper6_r1 = new ModelRenderer(this);
        this.flipper6_r1.setRotationPoint(0.4158F, 4.7106F, 1.0131F);
        this.flipper3.addChild(flipper6_r1);
        this.setRotateAngle(flipper6_r1, -0.0302F, 0.0233F, 0.0895F);
        this.flipper6_r1.cubeList.add(new ModelBox(flipper6_r1, 0, 0, -1.174F, 4.0879F, -3.7904F, 1, 2, 2, 0.0F, false));
        this.flipper6_r1.cubeList.add(new ModelBox(flipper6_r1, 24, 64, -1.174F, 3.3879F, 1.0096F, 1, 1, 1, 0.0F, false));
        this.flipper6_r1.cubeList.add(new ModelBox(flipper6_r1, 15, 10, -1.174F, 4.0879F, -1.2904F, 1, 2, 2, 0.0F, false));
        this.flipper6_r1.cubeList.add(new ModelBox(flipper6_r1, 0, 94, -1.174F, 0.3879F, -0.4904F, 1, 2, 2, 0.0F, false));
        this.flipper6_r1.cubeList.add(new ModelBox(flipper6_r1, 24, 52, -1.174F, 0.3879F, -3.9904F, 1, 3, 3, 0.0F, false));

        this.flipperfingers3 = new ModelRenderer(this);
        this.flipperfingers3.setRotationPoint(-0.1237F, 1.1146F, -7.065F);
        this.flipper3.addChild(flipperfingers3);


        this.flipperfingers3_r1 = new ModelRenderer(this);
        this.flipperfingers3_r1.setRotationPoint(0.5395F, 3.5961F, 8.0782F);
        this.flipperfingers3.addChild(flipperfingers3_r1);
        this.setRotateAngle(flipperfingers3_r1, -0.0302F, 0.0233F, 0.0895F);
        this.flipperfingers3_r1.cubeList.add(new ModelBox(flipperfingers3_r1, 0, 94, -0.674F, 6.5879F, -4.1904F, 0, 20, 7, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 6.219F, 3.0205F);
        this.lowerbody1.addChild(body3);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -6.3804F, -20.6143F);
        this.body3.addChild(body3_r1);
        this.setRotateAngle(body3_r1, 0.0087F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 63, 0, -1.0F, -0.715F, -0.2856F, 2, 2, 18, 0.0F, false));

        this.neck15_r1 = new ModelRenderer(this);
        this.neck15_r1.setRotationPoint(-0.916F, -5.7788F, -2.9012F);
        this.body3.addChild(neck15_r1);
        this.setRotateAngle(neck15_r1, 0.0371F, 0.3383F, -1.4242F);
        this.neck15_r1.cubeList.add(new ModelBox(neck15_r1, 100, 58, -20.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, true));

        this.neck14_r1 = new ModelRenderer(this);
        this.neck14_r1.setRotationPoint(-0.916F, -5.7788F, -2.9012F);
        this.body3.addChild(neck14_r1);
        this.setRotateAngle(neck14_r1, 0.1804F, 0.29F, -0.9677F);
        this.neck14_r1.cubeList.add(new ModelBox(neck14_r1, 86, 117, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck13_r1 = new ModelRenderer(this);
        this.neck13_r1.setRotationPoint(-0.916F, -5.7788F, -2.9012F);
        this.body3.addChild(neck13_r1);
        this.setRotateAngle(neck13_r1, 0.3003F, 0.1624F, -0.4459F);
        this.neck13_r1.cubeList.add(new ModelBox(neck13_r1, 30, 111, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck12_r1 = new ModelRenderer(this);
        this.neck12_r1.setRotationPoint(-0.916F, -6.0788F, -5.8012F);
        this.body3.addChild(neck12_r1);
        this.setRotateAngle(neck12_r1, 0.3323F, 0.1774F, -0.4405F);
        this.neck12_r1.cubeList.add(new ModelBox(neck12_r1, 111, 53, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck13_r2 = new ModelRenderer(this);
        this.neck13_r2.setRotationPoint(-0.916F, -6.0788F, -5.8012F);
        this.body3.addChild(neck13_r2);
        this.setRotateAngle(neck13_r2, 0.2013F, 0.3187F, -0.9615F);
        this.neck13_r2.cubeList.add(new ModelBox(neck13_r2, 117, 90, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck14_r2 = new ModelRenderer(this);
        this.neck14_r2.setRotationPoint(-0.916F, -6.0788F, -5.8012F);
        this.body3.addChild(neck14_r2);
        this.setRotateAngle(neck14_r2, 0.0426F, 0.3728F, -1.4222F);
        this.neck14_r2.cubeList.add(new ModelBox(neck14_r2, 100, 60, -20.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, true));

        this.neck13_r3 = new ModelRenderer(this);
        this.neck13_r3.setRotationPoint(-0.916F, -6.0788F, -7.8012F);
        this.body3.addChild(neck13_r3);
        this.setRotateAngle(neck13_r3, 0.0454F, 0.3901F, -1.4212F);
        this.neck13_r3.cubeList.add(new ModelBox(neck13_r3, 100, 64, -19.4186F, -6.1831F, -0.4055F, 12, 0, 1, 0.0F, true));

        this.neck12_r2 = new ModelRenderer(this);
        this.neck12_r2.setRotationPoint(-0.916F, -6.0788F, -7.8012F);
        this.body3.addChild(neck12_r2);
        this.setRotateAngle(neck12_r2, 0.2118F, 0.333F, -0.9581F);
        this.neck12_r2.cubeList.add(new ModelBox(neck12_r2, 117, 92, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck11_r1 = new ModelRenderer(this);
        this.neck11_r1.setRotationPoint(-0.916F, -6.0788F, -7.8012F);
        this.body3.addChild(neck11_r1);
        this.setRotateAngle(neck11_r1, 0.3484F, 0.1848F, -0.4376F);
        this.neck11_r1.cubeList.add(new ModelBox(neck11_r1, 111, 55, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck10_r1 = new ModelRenderer(this);
        this.neck10_r1.setRotationPoint(-0.916F, -6.0788F, -9.8012F);
        this.body3.addChild(neck10_r1);
        this.setRotateAngle(neck10_r1, 0.3645F, 0.1922F, -0.4346F);
        this.neck10_r1.cubeList.add(new ModelBox(neck10_r1, 86, 111, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck11_r2 = new ModelRenderer(this);
        this.neck11_r2.setRotationPoint(-0.916F, -6.0788F, -9.8012F);
        this.body3.addChild(neck11_r2);
        this.setRotateAngle(neck11_r2, 0.2225F, 0.3473F, -0.9545F);
        this.neck11_r2.cubeList.add(new ModelBox(neck11_r2, 99, 117, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck12_r3 = new ModelRenderer(this);
        this.neck12_r3.setRotationPoint(-0.916F, -6.0788F, -9.8012F);
        this.body3.addChild(neck12_r3);
        this.setRotateAngle(neck12_r3, 0.0482F, 0.4073F, -1.4201F);
        this.neck12_r3.cubeList.add(new ModelBox(neck12_r3, 100, 66, -19.4186F, -6.1831F, -0.4055F, 12, 0, 1, 0.0F, true));

        this.neck11_r3 = new ModelRenderer(this);
        this.neck11_r3.setRotationPoint(-0.916F, -6.0788F, -11.8012F);
        this.body3.addChild(neck11_r3);
        this.setRotateAngle(neck11_r3, 0.0482F, 0.4073F, -1.4201F);
        this.neck11_r3.cubeList.add(new ModelBox(neck11_r3, 68, 100, -19.4186F, -6.1831F, -0.4055F, 12, 0, 1, 0.0F, true));

        this.neck10_r2 = new ModelRenderer(this);
        this.neck10_r2.setRotationPoint(-0.916F, -6.0788F, -11.8012F);
        this.body3.addChild(neck10_r2);
        this.setRotateAngle(neck10_r2, 0.2225F, 0.3473F, -0.9545F);
        this.neck10_r2.cubeList.add(new ModelBox(neck10_r2, 118, 36, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck9_r1 = new ModelRenderer(this);
        this.neck9_r1.setRotationPoint(-0.916F, -6.0788F, -11.8012F);
        this.body3.addChild(neck9_r1);
        this.setRotateAngle(neck9_r1, 0.3645F, 0.1922F, -0.4346F);
        this.neck9_r1.cubeList.add(new ModelBox(neck9_r1, 99, 111, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck8_r1 = new ModelRenderer(this);
        this.neck8_r1.setRotationPoint(-0.916F, -6.143F, -13.6028F);
        this.body3.addChild(neck8_r1);
        this.setRotateAngle(neck8_r1, 0.3864F, 0.2078F, -0.4471F);
        this.neck8_r1.cubeList.add(new ModelBox(neck8_r1, 113, 71, -5.0214F, 0.085F, -0.62F, 5, 0, 1, 0.0F, true));

        this.neck9_r2 = new ModelRenderer(this);
        this.neck9_r2.setRotationPoint(-0.916F, -6.143F, -13.6028F);
        this.body3.addChild(neck9_r2);
        this.setRotateAngle(neck9_r2, 0.2342F, 0.3715F, -0.9673F);
        this.neck9_r2.cubeList.add(new ModelBox(neck9_r2, 30, 119, -9.3911F, -2.437F, -0.62F, 5, 0, 1, 0.0F, true));

        this.neck10_r3 = new ModelRenderer(this);
        this.neck10_r3.setRotationPoint(-0.916F, -6.143F, -13.6028F);
        this.body3.addChild(neck10_r3);
        this.setRotateAngle(neck10_r3, 0.0469F, 0.4339F, -1.4375F);
        this.neck10_r3.cubeList.add(new ModelBox(neck10_r3, 42, 89, -18.4813F, -6.1776F, -0.62F, 11, 0, 1, 0.0F, true));

        this.neck9_r3 = new ModelRenderer(this);
        this.neck9_r3.setRotationPoint(-0.916F, -5.8634F, -16.0384F);
        this.body3.addChild(neck9_r3);
        this.setRotateAngle(neck9_r3, 0.0464F, 0.4339F, -1.4288F);
        this.neck9_r3.cubeList.add(new ModelBox(neck9_r3, 42, 91, -18.2579F, -6.1971F, -0.1732F, 11, 0, 1, 0.0F, true));

        this.neck8_r2 = new ModelRenderer(this);
        this.neck8_r2.setRotationPoint(-0.916F, -5.8634F, -16.0384F);
        this.body3.addChild(neck8_r2);
        this.setRotateAngle(neck8_r2, 0.2338F, 0.3717F, -0.9586F);
        this.neck8_r2.cubeList.add(new ModelBox(neck8_r2, 111, 118, -9.1969F, -2.5492F, -0.1732F, 5, 0, 1, 0.0F, true));

        this.neck7_r1 = new ModelRenderer(this);
        this.neck7_r1.setRotationPoint(-0.916F, -5.8634F, -16.0384F);
        this.body3.addChild(neck7_r1);
        this.setRotateAngle(neck7_r1, 0.3862F, 0.2082F, -0.4383F);
        this.neck7_r1.cubeList.add(new ModelBox(neck7_r1, 86, 113, -4.9092F, -0.1092F, -0.1732F, 5, 0, 1, 0.0F, true));

        this.neck8_r3 = new ModelRenderer(this);
        this.neck8_r3.setRotationPoint(-0.916F, -5.9367F, -17.9396F);
        this.body3.addChild(neck8_r3);
        this.setRotateAngle(neck8_r3, 0.0425F, 0.4519F, -1.4738F);
        this.neck8_r3.cubeList.add(new ModelBox(neck8_r3, 0, 20, -16.3383F, -6.1901F, -0.2893F, 9, 0, 1, 0.0F, true));

        this.neck7_r2 = new ModelRenderer(this);
        this.neck7_r2.setRotationPoint(-0.916F, -5.9367F, -17.9396F);
        this.body3.addChild(neck7_r2);
        this.setRotateAngle(neck7_r2, 0.2392F, 0.3894F, -0.9998F);
        this.neck7_r2.cubeList.add(new ModelBox(neck7_r2, 74, 118, -9.2668F, -2.5088F, -0.2893F, 5, 0, 1, 0.0F, true));

        this.neck6_r2 = new ModelRenderer(this);
        this.neck6_r2.setRotationPoint(-0.916F, -5.9367F, -17.9396F);
        this.body3.addChild(neck6_r2);
        this.setRotateAngle(neck6_r2, 0.3997F, 0.221F, -0.4787F);
        this.neck6_r2.cubeList.add(new ModelBox(neck6_r2, 99, 113, -4.9496F, -0.0393F, -0.2893F, 5, 0, 1, 0.0F, true));

        this.neck5_r4 = new ModelRenderer(this);
        this.neck5_r4.setRotationPoint(-0.916F, -5.7112F, -19.8681F);
        this.body3.addChild(neck5_r4);
        this.setRotateAngle(neck5_r4, 0.4297F, 0.2403F, -0.559F);
        this.neck5_r4.cubeList.add(new ModelBox(neck5_r4, 114, 88, -4.8423F, -0.2252F, -0.3522F, 5, 0, 1, 0.0F, true));

        this.neck6_r3 = new ModelRenderer(this);
        this.neck6_r3.setRotationPoint(-0.916F, -5.7112F, -19.8681F);
        this.body3.addChild(neck6_r3);
        this.setRotateAngle(neck6_r3, 0.2563F, 0.4207F, -1.0802F);
        this.neck6_r3.cubeList.add(new ModelBox(neck6_r3, 116, 8, -9.081F, -2.6161F, -0.3522F, 5, 0, 1, 0.0F, true));

        this.neck7_r3 = new ModelRenderer(this);
        this.neck7_r3.setRotationPoint(-0.916F, -5.7112F, -19.8681F);
        this.body3.addChild(neck7_r3);
        this.setRotateAngle(neck7_r3, 0.042F, 0.487F, -1.5611F);
        this.neck7_r3.cubeList.add(new ModelBox(neck7_r3, 28, 47, -15.1245F, -6.2088F, -0.3522F, 8, 0, 1, 0.0F, true));

        this.neck14_r3 = new ModelRenderer(this);
        this.neck14_r3.setRotationPoint(1.024F, -6.0788F, -3.8012F);
        this.body3.addChild(neck14_r3);
        this.setRotateAngle(neck14_r3, 0.0398F, -0.3555F, 1.4232F);
        this.neck14_r3.cubeList.add(new ModelBox(neck14_r3, 100, 58, 7.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, false));

        this.neck13_r4 = new ModelRenderer(this);
        this.neck13_r4.setRotationPoint(1.024F, -6.0788F, -3.8012F);
        this.body3.addChild(neck13_r4);
        this.setRotateAngle(neck13_r4, 0.1908F, -0.3044F, 0.9647F);
        this.neck13_r4.cubeList.add(new ModelBox(neck13_r4, 86, 117, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck12_r4 = new ModelRenderer(this);
        this.neck12_r4.setRotationPoint(1.024F, -6.0788F, -3.8012F);
        this.body3.addChild(neck12_r4);
        this.setRotateAngle(neck12_r4, 0.3163F, -0.1699F, 0.4433F);
        this.neck12_r4.cubeList.add(new ModelBox(neck12_r4, 30, 111, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck13_r5 = new ModelRenderer(this);
        this.neck13_r5.setRotationPoint(1.024F, -6.0788F, -5.8012F);
        this.body3.addChild(neck13_r5);
        this.setRotateAngle(neck13_r5, 0.0426F, -0.3728F, 1.4222F);
        this.neck13_r5.cubeList.add(new ModelBox(neck13_r5, 100, 60, 7.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, false));

        this.neck12_r5 = new ModelRenderer(this);
        this.neck12_r5.setRotationPoint(1.024F, -6.0788F, -5.8012F);
        this.body3.addChild(neck12_r5);
        this.setRotateAngle(neck12_r5, 0.2013F, -0.3187F, 0.9615F);
        this.neck12_r5.cubeList.add(new ModelBox(neck12_r5, 117, 90, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck11_r4 = new ModelRenderer(this);
        this.neck11_r4.setRotationPoint(1.024F, -6.0788F, -5.8012F);
        this.body3.addChild(neck11_r4);
        this.setRotateAngle(neck11_r4, 0.3323F, -0.1774F, 0.4405F);
        this.neck11_r4.cubeList.add(new ModelBox(neck11_r4, 111, 53, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck12_r6 = new ModelRenderer(this);
        this.neck12_r6.setRotationPoint(1.024F, -6.0788F, -7.8012F);
        this.body3.addChild(neck12_r6);
        this.setRotateAngle(neck12_r6, 0.0454F, -0.3901F, 1.4212F);
        this.neck12_r6.cubeList.add(new ModelBox(neck12_r6, 100, 64, 7.4186F, -6.1831F, -0.4055F, 12, 0, 1, 0.0F, false));

        this.neck11_r5 = new ModelRenderer(this);
        this.neck11_r5.setRotationPoint(1.024F, -6.0788F, -7.8012F);
        this.body3.addChild(neck11_r5);
        this.setRotateAngle(neck11_r5, 0.2118F, -0.333F, 0.9581F);
        this.neck11_r5.cubeList.add(new ModelBox(neck11_r5, 117, 92, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck10_r4 = new ModelRenderer(this);
        this.neck10_r4.setRotationPoint(1.024F, -6.0788F, -7.8012F);
        this.body3.addChild(neck10_r4);
        this.setRotateAngle(neck10_r4, 0.3484F, -0.1848F, 0.4376F);
        this.neck10_r4.cubeList.add(new ModelBox(neck10_r4, 111, 55, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck11_r6 = new ModelRenderer(this);
        this.neck11_r6.setRotationPoint(1.024F, -6.0788F, -9.8012F);
        this.body3.addChild(neck11_r6);
        this.setRotateAngle(neck11_r6, 0.0482F, -0.4073F, 1.4201F);
        this.neck11_r6.cubeList.add(new ModelBox(neck11_r6, 100, 66, 7.4186F, -6.1831F, -0.4055F, 12, 0, 1, 0.0F, false));

        this.neck10_r5 = new ModelRenderer(this);
        this.neck10_r5.setRotationPoint(1.024F, -6.0788F, -9.8012F);
        this.body3.addChild(neck10_r5);
        this.setRotateAngle(neck10_r5, 0.2225F, -0.3473F, 0.9545F);
        this.neck10_r5.cubeList.add(new ModelBox(neck10_r5, 99, 117, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck9_r4 = new ModelRenderer(this);
        this.neck9_r4.setRotationPoint(1.024F, -6.0788F, -9.8012F);
        this.body3.addChild(neck9_r4);
        this.setRotateAngle(neck9_r4, 0.3645F, -0.1922F, 0.4346F);
        this.neck9_r4.cubeList.add(new ModelBox(neck9_r4, 86, 111, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck8_r4 = new ModelRenderer(this);
        this.neck8_r4.setRotationPoint(1.024F, -6.0788F, -11.8012F);
        this.body3.addChild(neck8_r4);
        this.setRotateAngle(neck8_r4, 0.3645F, -0.1922F, 0.4346F);
        this.neck8_r4.cubeList.add(new ModelBox(neck8_r4, 99, 111, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck9_r5 = new ModelRenderer(this);
        this.neck9_r5.setRotationPoint(1.024F, -6.0788F, -11.8012F);
        this.body3.addChild(neck9_r5);
        this.setRotateAngle(neck9_r5, 0.2225F, -0.3473F, 0.9545F);
        this.neck9_r5.cubeList.add(new ModelBox(neck9_r5, 118, 36, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck10_r6 = new ModelRenderer(this);
        this.neck10_r6.setRotationPoint(1.024F, -6.0788F, -11.8012F);
        this.body3.addChild(neck10_r6);
        this.setRotateAngle(neck10_r6, 0.0482F, -0.4073F, 1.4201F);
        this.neck10_r6.cubeList.add(new ModelBox(neck10_r6, 68, 100, 7.4186F, -6.1831F, -0.4055F, 12, 0, 1, 0.0F, false));

        this.neck7_r4 = new ModelRenderer(this);
        this.neck7_r4.setRotationPoint(1.024F, -6.143F, -13.6028F);
        this.body3.addChild(neck7_r4);
        this.setRotateAngle(neck7_r4, 0.3864F, -0.2078F, 0.4471F);
        this.neck7_r4.cubeList.add(new ModelBox(neck7_r4, 113, 71, 0.0214F, 0.085F, -0.62F, 5, 0, 1, 0.0F, false));

        this.neck8_r5 = new ModelRenderer(this);
        this.neck8_r5.setRotationPoint(1.024F, -6.143F, -13.6028F);
        this.body3.addChild(neck8_r5);
        this.setRotateAngle(neck8_r5, 0.2342F, -0.3715F, 0.9673F);
        this.neck8_r5.cubeList.add(new ModelBox(neck8_r5, 30, 119, 4.3911F, -2.437F, -0.62F, 5, 0, 1, 0.0F, false));

        this.neck9_r6 = new ModelRenderer(this);
        this.neck9_r6.setRotationPoint(1.024F, -6.143F, -13.6028F);
        this.body3.addChild(neck9_r6);
        this.setRotateAngle(neck9_r6, 0.0469F, -0.4339F, 1.4375F);
        this.neck9_r6.cubeList.add(new ModelBox(neck9_r6, 42, 89, 7.4813F, -6.1776F, -0.62F, 11, 0, 1, 0.0F, false));

        this.neck8_r6 = new ModelRenderer(this);
        this.neck8_r6.setRotationPoint(1.024F, -5.8634F, -16.0384F);
        this.body3.addChild(neck8_r6);
        this.setRotateAngle(neck8_r6, 0.0464F, -0.4339F, 1.4288F);
        this.neck8_r6.cubeList.add(new ModelBox(neck8_r6, 42, 91, 7.2579F, -6.1971F, -0.1732F, 11, 0, 1, 0.0F, false));

        this.neck7_r5 = new ModelRenderer(this);
        this.neck7_r5.setRotationPoint(1.024F, -5.8634F, -16.0384F);
        this.body3.addChild(neck7_r5);
        this.setRotateAngle(neck7_r5, 0.2338F, -0.3717F, 0.9586F);
        this.neck7_r5.cubeList.add(new ModelBox(neck7_r5, 111, 118, 4.1969F, -2.5492F, -0.1732F, 5, 0, 1, 0.0F, false));

        this.neck6_r4 = new ModelRenderer(this);
        this.neck6_r4.setRotationPoint(1.024F, -5.8634F, -16.0384F);
        this.body3.addChild(neck6_r4);
        this.setRotateAngle(neck6_r4, 0.3862F, -0.2082F, 0.4383F);
        this.neck6_r4.cubeList.add(new ModelBox(neck6_r4, 86, 113, -0.0908F, -0.1092F, -0.1732F, 5, 0, 1, 0.0F, false));

        this.neck7_r6 = new ModelRenderer(this);
        this.neck7_r6.setRotationPoint(1.024F, -5.9367F, -17.9396F);
        this.body3.addChild(neck7_r6);
        this.setRotateAngle(neck7_r6, 0.0425F, -0.4519F, 1.4738F);
        this.neck7_r6.cubeList.add(new ModelBox(neck7_r6, 0, 20, 7.3383F, -6.1901F, -0.2893F, 9, 0, 1, 0.0F, false));

        this.neck6_r5 = new ModelRenderer(this);
        this.neck6_r5.setRotationPoint(1.024F, -5.9367F, -17.9396F);
        this.body3.addChild(neck6_r5);
        this.setRotateAngle(neck6_r5, 0.2392F, -0.3894F, 0.9998F);
        this.neck6_r5.cubeList.add(new ModelBox(neck6_r5, 74, 118, 4.2668F, -2.5088F, -0.2893F, 5, 0, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.346F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1775F, 1.0326F, 1.3327F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 34, -4.8451F, 3.0787F, -2.4296F, 4, 1, 1, -0.1F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.346F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3865F, 0.7488F, 1.0308F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 92, 83, -2.4993F, 2.5984F, -2.1893F, 4, 1, 1, -0.1F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.346F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5923F, 0.038F, 0.2881F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 35, -2.498F, 1.8615F, -2.3601F, 5, 1, 1, -0.1F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.346F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.9515F, -0.3401F, -1.0502F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 21, 83, -3.7423F, -1.6452F, -2.6189F, 1, 2, 4, 0.003F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.346F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.4751F, -0.3401F, -1.0502F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 26, -3.7423F, -0.9352F, -2.3506F, 1, 3, 4, 0.0F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.346F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.7124F, -0.1868F, -0.4057F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 52, -4.1834F, -0.5339F, 0.0958F, 1, 2, 4, -0.003F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.346F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.1836F, -0.1868F, -0.4057F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 56, 43, -4.1834F, -0.5386F, -0.539F, 1, 2, 4, 0.0F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.346F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.5061F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 26, -5.4F, -1.5021F, 0.9758F, 1, 4, 4, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 26, 11.2F, -1.5021F, 0.9758F, 1, 4, 4, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(3.454F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.5923F, -0.038F, -0.2881F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 35, -2.502F, 1.8615F, -2.3601F, 5, 1, 1, -0.1F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(3.454F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1775F, -1.0326F, -1.3327F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 12, 34, 0.8451F, 3.0787F, -2.4296F, 4, 1, 1, -0.1F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(3.454F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3865F, -0.7488F, -1.0308F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 92, 83, -1.5007F, 2.5984F, -2.1893F, 4, 1, 1, -0.1F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(3.454F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.7124F, 0.1868F, 0.4057F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 52, 3.1834F, -0.5339F, 0.0958F, 1, 2, 4, -0.003F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(3.454F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.1836F, 0.1868F, 0.4057F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 56, 43, 3.1834F, -0.5386F, -0.539F, 1, 2, 4, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(3.454F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 1.4751F, 0.3401F, 1.0502F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 12, 26, 2.7423F, -0.9352F, -2.3506F, 1, 3, 4, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(3.454F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.9515F, 0.3401F, 1.0502F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 21, 83, 2.7423F, -1.6452F, -2.6189F, 1, 2, 4, 0.003F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(2.954F, 4.4235F, -17.4909F);
        this.body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.5061F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 119, 31, -3.4F, 2.5111F, -1.8919F, 1, 1, 3, -0.1F, false));

        this.neck5_r5 = new ModelRenderer(this);
        this.neck5_r5.setRotationPoint(1.024F, -5.9367F, -17.9396F);
        this.body3.addChild(neck5_r5);
        this.setRotateAngle(neck5_r5, 0.3997F, -0.221F, 0.4787F);
        this.neck5_r5.cubeList.add(new ModelBox(neck5_r5, 99, 113, -0.0504F, -0.0393F, -0.2893F, 5, 0, 1, 0.0F, false));

        this.neck5_r6 = new ModelRenderer(this);
        this.neck5_r6.setRotationPoint(1.024F, -5.7112F, -19.8681F);
        this.body3.addChild(neck5_r6);
        this.setRotateAngle(neck5_r6, 0.2563F, -0.4207F, 1.0802F);
        this.neck5_r6.cubeList.add(new ModelBox(neck5_r6, 116, 8, 4.081F, -2.6161F, -0.3522F, 5, 0, 1, 0.0F, false));

        this.neck7_r7 = new ModelRenderer(this);
        this.neck7_r7.setRotationPoint(4.024F, -6.574F, -26.0151F);
        this.body3.addChild(neck7_r7);
        this.setRotateAngle(neck7_r7, -0.1047F, 0.0F, 0.0F);
        this.neck7_r7.cubeList.add(new ModelBox(neck7_r7, 122, 21, -4.024F, -2.1069F, 5.6462F, 0, 2, 1, 0.0F, false));
        this.neck7_r7.cubeList.add(new ModelBox(neck7_r7, 6, 122, -4.024F, -2.5069F, 7.6462F, 0, 2, 1, 0.0F, false));

        this.neck13_r6 = new ModelRenderer(this);
        this.neck13_r6.setRotationPoint(0.0F, -7.1265F, -3.4352F);
        this.body3.addChild(neck13_r6);
        this.setRotateAngle(neck13_r6, -0.3229F, 0.0F, 0.0F);
        this.neck13_r6.cubeList.add(new ModelBox(neck13_r6, 102, 88, 0.0F, -1.4973F, -0.5523F, 0, 2, 1, 0.0F, false));

        this.neck12_r7 = new ModelRenderer(this);
        this.neck12_r7.setRotationPoint(0.0F, -7.157F, -5.6336F);
        this.body3.addChild(neck12_r7);
        this.setRotateAngle(neck12_r7, -0.3229F, 0.0F, 0.0F);
        this.neck12_r7.cubeList.add(new ModelBox(neck12_r7, 7, 26, 0.0F, -1.5967F, -0.3627F, 0, 2, 1, 0.0F, false));

        this.neck11_r7 = new ModelRenderer(this);
        this.neck11_r7.setRotationPoint(0.0F, -6.7671F, -7.6436F);
        this.body3.addChild(neck11_r7);
        this.setRotateAngle(neck11_r7, -0.3229F, 0.0F, 0.0F);
        this.neck11_r7.cubeList.add(new ModelBox(neck11_r7, 104, 0, 0.0F, -1.9945F, -0.6045F, 0, 2, 1, 0.0F, false));

        this.neck10_r7 = new ModelRenderer(this);
        this.neck10_r7.setRotationPoint(0.0F, -7.2773F, -9.6535F);
        this.body3.addChild(neck10_r7);
        this.setRotateAngle(neck10_r7, -0.3316F, 0.0F, 0.0F);
        this.neck10_r7.cubeList.add(new ModelBox(neck10_r7, 0, 122, 0.0F, -1.4973F, -0.5523F, 0, 2, 1, 0.0F, false));

        this.neck9_r7 = new ModelRenderer(this);
        this.neck9_r7.setRotationPoint(0.0F, -7.2902F, -11.7157F);
        this.body3.addChild(neck9_r7);
        this.setRotateAngle(neck9_r7, -0.2793F, 0.0F, 0.0F);
        this.neck9_r7.cubeList.add(new ModelBox(neck9_r7, 121, 120, 0.0F, -1.3F, -0.5F, 0, 2, 1, 0.0F, false));

        this.neck8_r7 = new ModelRenderer(this);
        this.neck8_r7.setRotationPoint(0.0F, -7.3003F, -13.7257F);
        this.body3.addChild(neck8_r7);
        this.setRotateAngle(neck8_r7, -0.2356F, 0.0F, 0.0F);
        this.neck8_r7.cubeList.add(new ModelBox(neck8_r7, 104, 17, 0.0F, -1.2F, -0.5F, 0, 2, 1, 0.0F, false));

        this.neck7_r8 = new ModelRenderer(this);
        this.neck7_r8.setRotationPoint(0.0F, -7.3105F, -15.7356F);
        this.body3.addChild(neck7_r8);
        this.setRotateAngle(neck7_r8, -0.192F, 0.0F, 0.0F);
        this.neck7_r8.cubeList.add(new ModelBox(neck7_r8, 3, 122, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.neck6_r6 = new ModelRenderer(this);
        this.neck6_r6.setRotationPoint(1.024F, -5.7112F, -19.8681F);
        this.body3.addChild(neck6_r6);
        this.setRotateAngle(neck6_r6, 0.042F, -0.487F, 1.5611F);
        this.neck6_r6.cubeList.add(new ModelBox(neck6_r6, 28, 47, 7.1245F, -6.2088F, -0.3522F, 8, 0, 1, 0.0F, false));

        this.neck4_r6 = new ModelRenderer(this);
        this.neck4_r6.setRotationPoint(1.024F, -5.7112F, -19.8681F);
        this.body3.addChild(neck4_r6);
        this.setRotateAngle(neck4_r6, 0.4297F, -0.2403F, 0.559F);
        this.neck4_r6.cubeList.add(new ModelBox(neck4_r6, 114, 88, -0.1577F, -0.2252F, -0.3522F, 5, 0, 1, 0.0F, false));

        this.underbelly2 = new ModelRenderer(this);
        this.underbelly2.setRotationPoint(0.0F, 19.769F, -16.2795F);
        this.lowerbody1.addChild(underbelly2);
        this.setRotateAngle(underbelly2, -0.3491F, 0.0F, 0.0F);


        this.underbelly3_r1 = new ModelRenderer(this);
        this.underbelly3_r1.setRotationPoint(0.0F, -4.5F, 3.3F);
        this.underbelly2.addChild(underbelly3_r1);
        this.setRotateAngle(underbelly3_r1, 0.0262F, 0.0F, 0.0F);
        this.underbelly3_r1.cubeList.add(new ModelBox(underbelly3_r1, 56, 43, -8.0F, -3.0732F, -1.8049F, 16, 3, 11, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 5.4991F, 2.0517F);
        this.lowerbody2.addChild(body2);


        this.body2_r2 = new ModelRenderer(this);
        this.body2_r2.setRotationPoint(0.0F, -6.3919F, -21.7934F);
        this.body2.addChild(body2_r2);
        this.setRotateAngle(body2_r2, -0.0349F, 0.0F, 0.0F);
        this.body2_r2.cubeList.add(new ModelBox(body2_r2, 57, 58, -1.0F, -0.5082F, -0.2112F, 2, 2, 20, 0.01F, false));

        this.neck22_r1 = new ModelRenderer(this);
        this.neck22_r1.setRotationPoint(0.0F, -8.2565F, -3.255F);
        this.body2.addChild(neck22_r1);
        this.setRotateAngle(neck22_r1, -0.288F, 0.0F, 0.0F);
        this.neck22_r1.cubeList.add(new ModelBox(neck22_r1, 64, 96, 0.0F, -0.1226F, -0.7599F, 0, 3, 1, 0.0F, false));

        this.neck21_r1 = new ModelRenderer(this);
        this.neck21_r1.setRotationPoint(0.0F, -8.2565F, -3.255F);
        this.body2.addChild(neck21_r1);
        this.setRotateAngle(neck21_r1, -0.2007F, 0.0F, 0.0F);
        this.neck21_r1.cubeList.add(new ModelBox(neck21_r1, 92, 58, 0.0F, 0.215F, -2.9359F, 0, 3, 1, 0.0F, false));
        this.neck21_r1.cubeList.add(new ModelBox(neck21_r1, 51, 93, 0.0F, 0.5752F, -4.9058F, 0, 3, 1, 0.0F, false));
        this.neck21_r1.cubeList.add(new ModelBox(neck21_r1, 118, 120, 0.0F, 0.9354F, -6.8756F, 0, 3, 1, 0.0F, false));
        this.neck21_r1.cubeList.add(new ModelBox(neck21_r1, 115, 120, 0.0F, 1.3947F, -8.8324F, 0, 3, 1, 0.0F, false));
        this.neck21_r1.cubeList.add(new ModelBox(neck21_r1, 112, 120, 0.0F, 1.8541F, -10.7892F, 0, 3, 1, 0.0F, false));
        this.neck21_r1.cubeList.add(new ModelBox(neck21_r1, 33, 121, 0.0F, 2.3134F, -12.7459F, 0, 3, 1, 0.0F, false));

        this.neck15_r2 = new ModelRenderer(this);
        this.neck15_r2.setRotationPoint(0.0F, -8.2565F, -3.255F);
        this.body2.addChild(neck15_r2);
        this.setRotateAngle(neck15_r2, -0.1571F, 0.0F, 0.0F);
        this.neck15_r2.cubeList.add(new ModelBox(neck15_r2, 94, 0, 0.0F, 2.1528F, -14.9191F, 0, 3, 1, 0.0F, false));

        this.neck25_r1 = new ModelRenderer(this);
        this.neck25_r1.setRotationPoint(-0.916F, -5.3075F, -2.383F);
        this.body2.addChild(neck25_r1);
        this.setRotateAngle(neck25_r1, 0.0278F, 0.2778F, -1.4619F);
        this.neck25_r1.cubeList.add(new ModelBox(neck25_r1, 74, 37, -20.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, true));

        this.neck24_r1 = new ModelRenderer(this);
        this.neck24_r1.setRotationPoint(-0.916F, -5.3075F, -2.383F);
        this.body2.addChild(neck24_r1);
        this.setRotateAngle(neck24_r1, 0.1448F, 0.2396F, -1.012F);
        this.neck24_r1.cubeList.add(new ModelBox(neck24_r1, 111, 116, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck23_r1 = new ModelRenderer(this);
        this.neck23_r1.setRotationPoint(-0.916F, -5.3075F, -2.383F);
        this.body2.addChild(neck23_r1);
        this.setRotateAngle(neck23_r1, 0.2447F, 0.1358F, -0.4891F);
        this.neck23_r1.cubeList.add(new ModelBox(neck23_r1, 107, 82, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck24_r2 = new ModelRenderer(this);
        this.neck24_r2.setRotationPoint(-0.916F, -5.4075F, -4.383F);
        this.body2.addChild(neck24_r2);
        this.setRotateAngle(neck24_r2, 0.0304F, 0.2951F, -1.4437F);
        this.neck24_r2.cubeList.add(new ModelBox(neck24_r2, 74, 81, -20.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, true));

        this.neck22_r2 = new ModelRenderer(this);
        this.neck22_r2.setRotationPoint(-0.916F, -5.4075F, -4.383F);
        this.body2.addChild(neck22_r2);
        this.setRotateAngle(neck22_r2, 0.2605F, 0.1435F, -0.4694F);
        this.neck22_r2.cubeList.add(new ModelBox(neck22_r2, 107, 84, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck23_r2 = new ModelRenderer(this);
        this.neck23_r2.setRotationPoint(-0.916F, -5.4075F, -4.383F);
        this.body2.addChild(neck23_r2);
        this.setRotateAngle(neck23_r2, 0.1549F, 0.254F, -0.9921F);
        this.neck23_r2.cubeList.add(new ModelBox(neck23_r2, 117, 0, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck21_r2 = new ModelRenderer(this);
        this.neck21_r2.setRotationPoint(-0.916F, -5.5075F, -6.383F);
        this.body2.addChild(neck21_r2);
        this.setRotateAngle(neck21_r2, 0.2764F, 0.1511F, -0.4497F);
        this.neck21_r2.cubeList.add(new ModelBox(neck21_r2, 108, 95, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck22_r3 = new ModelRenderer(this);
        this.neck22_r3.setRotationPoint(-0.916F, -5.5075F, -6.383F);
        this.body2.addChild(neck22_r3);
        this.setRotateAngle(neck22_r3, 0.165F, 0.2684F, -0.972F);
        this.neck22_r3.cubeList.add(new ModelBox(neck22_r3, 117, 2, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck23_r3 = new ModelRenderer(this);
        this.neck23_r3.setRotationPoint(-0.916F, -5.5075F, -6.383F);
        this.body2.addChild(neck23_r3);
        this.setRotateAngle(neck23_r3, 0.0331F, 0.3124F, -1.4254F);
        this.neck23_r3.cubeList.add(new ModelBox(neck23_r3, 86, 15, -20.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, true));

        this.neck22_r4 = new ModelRenderer(this);
        this.neck22_r4.setRotationPoint(-0.916F, -5.6075F, -8.383F);
        this.body2.addChild(neck22_r4);
        this.setRotateAngle(neck22_r4, 0.0357F, 0.3297F, -1.4246F);
        this.neck22_r4.cubeList.add(new ModelBox(neck22_r4, 87, 39, -20.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, true));

        this.neck21_r3 = new ModelRenderer(this);
        this.neck21_r3.setRotationPoint(-0.916F, -5.6075F, -8.383F);
        this.body2.addChild(neck21_r3);
        this.setRotateAngle(neck21_r3, 0.1753F, 0.2829F, -0.9692F);
        this.neck21_r3.cubeList.add(new ModelBox(neck21_r3, 117, 12, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck20_r1 = new ModelRenderer(this);
        this.neck20_r1.setRotationPoint(-0.916F, -5.6075F, -8.383F);
        this.body2.addChild(neck20_r1);
        this.setRotateAngle(neck20_r1, 0.2923F, 0.1586F, -0.4472F);
        this.neck20_r1.cubeList.add(new ModelBox(neck20_r1, 108, 97, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck19_r1 = new ModelRenderer(this);
        this.neck19_r1.setRotationPoint(-0.916F, -5.6075F, -10.383F);
        this.body2.addChild(neck19_r1);
        this.setRotateAngle(neck19_r1, 0.3083F, 0.1662F, -0.4446F);
        this.neck19_r1.cubeList.add(new ModelBox(neck19_r1, 30, 109, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck20_r2 = new ModelRenderer(this);
        this.neck20_r2.setRotationPoint(-0.916F, -5.6075F, -10.383F);
        this.body2.addChild(neck20_r2);
        this.setRotateAngle(neck20_r2, 0.1856F, 0.2972F, -0.9662F);
        this.neck20_r2.cubeList.add(new ModelBox(neck20_r2, 117, 17, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck21_r4 = new ModelRenderer(this);
        this.neck21_r4.setRotationPoint(-0.916F, -5.6075F, -10.383F);
        this.body2.addChild(neck21_r4);
        this.setRotateAngle(neck21_r4, 0.0384F, 0.3469F, -1.4237F);
        this.neck21_r4.cubeList.add(new ModelBox(neck21_r4, 87, 41, -20.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, true));

        this.neck20_r3 = new ModelRenderer(this);
        this.neck20_r3.setRotationPoint(-0.916F, -5.7075F, -12.383F);
        this.body2.addChild(neck20_r3);
        this.setRotateAngle(neck20_r3, 0.0398F, 0.3555F, -1.4232F);
        this.neck20_r3.cubeList.add(new ModelBox(neck20_r3, 100, 43, -20.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, true));

        this.neck19_r2 = new ModelRenderer(this);
        this.neck19_r2.setRotationPoint(-0.916F, -5.7075F, -12.383F);
        this.body2.addChild(neck19_r2);
        this.setRotateAngle(neck19_r2, 0.1908F, 0.3044F, -0.9647F);
        this.neck19_r2.cubeList.add(new ModelBox(neck19_r2, 117, 19, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck18_r1 = new ModelRenderer(this);
        this.neck18_r1.setRotationPoint(-0.916F, -5.7075F, -12.383F);
        this.body2.addChild(neck18_r1);
        this.setRotateAngle(neck18_r1, 0.3163F, 0.1699F, -0.4433F);
        this.neck18_r1.cubeList.add(new ModelBox(neck18_r1, 88, 109, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck17_r1 = new ModelRenderer(this);
        this.neck17_r1.setRotationPoint(-0.916F, -5.7075F, -14.383F);
        this.body2.addChild(neck17_r1);
        this.setRotateAngle(neck17_r1, 0.3323F, 0.1774F, -0.4405F);
        this.neck17_r1.cubeList.add(new ModelBox(neck17_r1, 74, 110, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck19_r3 = new ModelRenderer(this);
        this.neck19_r3.setRotationPoint(-0.916F, -5.7075F, -14.383F);
        this.body2.addChild(neck19_r3);
        this.setRotateAngle(neck19_r3, 0.0426F, 0.3728F, -1.4222F);
        this.neck19_r3.cubeList.add(new ModelBox(neck19_r3, 100, 45, -20.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, true));

        this.neck18_r2 = new ModelRenderer(this);
        this.neck18_r2.setRotationPoint(-0.916F, -5.7075F, -14.383F);
        this.body2.addChild(neck18_r2);
        this.setRotateAngle(neck18_r2, 0.2013F, 0.3187F, -0.9615F);
        this.neck18_r2.cubeList.add(new ModelBox(neck18_r2, 30, 117, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck17_r2 = new ModelRenderer(this);
        this.neck17_r2.setRotationPoint(-0.916F, -5.7075F, -16.383F);
        this.body2.addChild(neck17_r2);
        this.setRotateAngle(neck17_r2, 0.2118F, 0.333F, -0.9581F);
        this.neck17_r2.cubeList.add(new ModelBox(neck17_r2, 117, 73, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck18_r3 = new ModelRenderer(this);
        this.neck18_r3.setRotationPoint(-0.916F, -5.7075F, -16.383F);
        this.body2.addChild(neck18_r3);
        this.setRotateAngle(neck18_r3, 0.0454F, 0.3901F, -1.4212F);
        this.neck18_r3.cubeList.add(new ModelBox(neck18_r3, 100, 47, -20.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, true));

        this.neck16_r1 = new ModelRenderer(this);
        this.neck16_r1.setRotationPoint(-0.916F, -5.7075F, -16.383F);
        this.body2.addChild(neck16_r1);
        this.setRotateAngle(neck16_r1, 0.3484F, 0.1848F, -0.4376F);
        this.neck16_r1.cubeList.add(new ModelBox(neck16_r1, 110, 103, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck17_r3 = new ModelRenderer(this);
        this.neck17_r3.setRotationPoint(-0.916F, -5.7075F, -18.383F);
        this.body2.addChild(neck17_r3);
        this.setRotateAngle(neck17_r3, 0.0482F, 0.4073F, -1.4201F);
        this.neck17_r3.cubeList.add(new ModelBox(neck17_r3, 100, 49, -20.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, true));

        this.neck16_r2 = new ModelRenderer(this);
        this.neck16_r2.setRotationPoint(-0.916F, -5.7075F, -18.383F);
        this.body2.addChild(neck16_r2);
        this.setRotateAngle(neck16_r2, 0.2225F, 0.3473F, -0.9545F);
        this.neck16_r2.cubeList.add(new ModelBox(neck16_r2, 117, 75, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck15_r3 = new ModelRenderer(this);
        this.neck15_r3.setRotationPoint(-0.916F, -5.7075F, -18.383F);
        this.body2.addChild(neck15_r3);
        this.setRotateAngle(neck15_r3, 0.3645F, 0.1922F, -0.4346F);
        this.neck15_r3.cubeList.add(new ModelBox(neck15_r3, 110, 105, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck14_r4 = new ModelRenderer(this);
        this.neck14_r4.setRotationPoint(-0.916F, -5.7075F, -20.383F);
        this.body2.addChild(neck14_r4);
        this.setRotateAngle(neck14_r4, 0.3645F, 0.1922F, -0.4346F);
        this.neck14_r4.cubeList.add(new ModelBox(neck14_r4, 110, 107, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck15_r4 = new ModelRenderer(this);
        this.neck15_r4.setRotationPoint(-0.916F, -5.7075F, -20.383F);
        this.body2.addChild(neck15_r4);
        this.setRotateAngle(neck15_r4, 0.2225F, 0.3473F, -0.9545F);
        this.neck15_r4.cubeList.add(new ModelBox(neck15_r4, 117, 77, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck16_r3 = new ModelRenderer(this);
        this.neck16_r3.setRotationPoint(-0.916F, -5.7075F, -20.383F);
        this.body2.addChild(neck16_r3);
        this.setRotateAngle(neck16_r3, 0.0482F, 0.4073F, -1.4201F);
        this.neck16_r3.cubeList.add(new ModelBox(neck16_r3, 100, 51, -20.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, true));

        this.neck24_r3 = new ModelRenderer(this);
        this.neck24_r3.setRotationPoint(1.024F, -5.3075F, -2.383F);
        this.body2.addChild(neck24_r3);
        this.setRotateAngle(neck24_r3, 0.0278F, -0.2778F, 1.4619F);
        this.neck24_r3.cubeList.add(new ModelBox(neck24_r3, 74, 37, 7.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, false));

        this.neck23_r4 = new ModelRenderer(this);
        this.neck23_r4.setRotationPoint(1.024F, -5.3075F, -2.383F);
        this.body2.addChild(neck23_r4);
        this.setRotateAngle(neck23_r4, 0.1448F, -0.2396F, 1.012F);
        this.neck23_r4.cubeList.add(new ModelBox(neck23_r4, 111, 116, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck22_r5 = new ModelRenderer(this);
        this.neck22_r5.setRotationPoint(1.024F, -5.3075F, -2.383F);
        this.body2.addChild(neck22_r5);
        this.setRotateAngle(neck22_r5, 0.2447F, -0.1358F, 0.4891F);
        this.neck22_r5.cubeList.add(new ModelBox(neck22_r5, 107, 82, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck23_r5 = new ModelRenderer(this);
        this.neck23_r5.setRotationPoint(1.024F, -5.4075F, -4.383F);
        this.body2.addChild(neck23_r5);
        this.setRotateAngle(neck23_r5, 0.0304F, -0.2951F, 1.4437F);
        this.neck23_r5.cubeList.add(new ModelBox(neck23_r5, 74, 81, 7.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, false));

        this.neck22_r6 = new ModelRenderer(this);
        this.neck22_r6.setRotationPoint(1.024F, -5.4075F, -4.383F);
        this.body2.addChild(neck22_r6);
        this.setRotateAngle(neck22_r6, 0.1549F, -0.254F, 0.9921F);
        this.neck22_r6.cubeList.add(new ModelBox(neck22_r6, 117, 0, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck21_r5 = new ModelRenderer(this);
        this.neck21_r5.setRotationPoint(1.024F, -5.4075F, -4.383F);
        this.body2.addChild(neck21_r5);
        this.setRotateAngle(neck21_r5, 0.2605F, -0.1435F, 0.4694F);
        this.neck21_r5.cubeList.add(new ModelBox(neck21_r5, 107, 84, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck22_r7 = new ModelRenderer(this);
        this.neck22_r7.setRotationPoint(1.024F, -5.5075F, -6.383F);
        this.body2.addChild(neck22_r7);
        this.setRotateAngle(neck22_r7, 0.0331F, -0.3124F, 1.4254F);
        this.neck22_r7.cubeList.add(new ModelBox(neck22_r7, 86, 15, 7.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, false));

        this.neck21_r6 = new ModelRenderer(this);
        this.neck21_r6.setRotationPoint(1.024F, -5.5075F, -6.383F);
        this.body2.addChild(neck21_r6);
        this.setRotateAngle(neck21_r6, 0.165F, -0.2684F, 0.972F);
        this.neck21_r6.cubeList.add(new ModelBox(neck21_r6, 117, 2, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck20_r4 = new ModelRenderer(this);
        this.neck20_r4.setRotationPoint(1.024F, -5.5075F, -6.383F);
        this.body2.addChild(neck20_r4);
        this.setRotateAngle(neck20_r4, 0.2764F, -0.1511F, 0.4497F);
        this.neck20_r4.cubeList.add(new ModelBox(neck20_r4, 108, 95, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck21_r7 = new ModelRenderer(this);
        this.neck21_r7.setRotationPoint(1.024F, -5.6075F, -8.383F);
        this.body2.addChild(neck21_r7);
        this.setRotateAngle(neck21_r7, 0.0357F, -0.3297F, 1.4246F);
        this.neck21_r7.cubeList.add(new ModelBox(neck21_r7, 87, 39, 7.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, false));

        this.neck20_r5 = new ModelRenderer(this);
        this.neck20_r5.setRotationPoint(1.024F, -5.6075F, -8.383F);
        this.body2.addChild(neck20_r5);
        this.setRotateAngle(neck20_r5, 0.1753F, -0.2829F, 0.9692F);
        this.neck20_r5.cubeList.add(new ModelBox(neck20_r5, 117, 12, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck19_r4 = new ModelRenderer(this);
        this.neck19_r4.setRotationPoint(1.024F, -5.6075F, -8.383F);
        this.body2.addChild(neck19_r4);
        this.setRotateAngle(neck19_r4, 0.2923F, -0.1586F, 0.4472F);
        this.neck19_r4.cubeList.add(new ModelBox(neck19_r4, 108, 97, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck20_r6 = new ModelRenderer(this);
        this.neck20_r6.setRotationPoint(1.024F, -5.6075F, -10.383F);
        this.body2.addChild(neck20_r6);
        this.setRotateAngle(neck20_r6, 0.0384F, -0.3469F, 1.4237F);
        this.neck20_r6.cubeList.add(new ModelBox(neck20_r6, 87, 41, 7.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, false));

        this.neck19_r5 = new ModelRenderer(this);
        this.neck19_r5.setRotationPoint(1.024F, -5.6075F, -10.383F);
        this.body2.addChild(neck19_r5);
        this.setRotateAngle(neck19_r5, 0.1856F, -0.2972F, 0.9662F);
        this.neck19_r5.cubeList.add(new ModelBox(neck19_r5, 117, 17, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck18_r4 = new ModelRenderer(this);
        this.neck18_r4.setRotationPoint(1.024F, -5.6075F, -10.383F);
        this.body2.addChild(neck18_r4);
        this.setRotateAngle(neck18_r4, 0.3083F, -0.1662F, 0.4446F);
        this.neck18_r4.cubeList.add(new ModelBox(neck18_r4, 30, 109, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck19_r6 = new ModelRenderer(this);
        this.neck19_r6.setRotationPoint(1.024F, -5.7075F, -12.383F);
        this.body2.addChild(neck19_r6);
        this.setRotateAngle(neck19_r6, 0.0398F, -0.3555F, 1.4232F);
        this.neck19_r6.cubeList.add(new ModelBox(neck19_r6, 100, 43, 7.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, false));

        this.neck18_r5 = new ModelRenderer(this);
        this.neck18_r5.setRotationPoint(1.024F, -5.7075F, -12.383F);
        this.body2.addChild(neck18_r5);
        this.setRotateAngle(neck18_r5, 0.1908F, -0.3044F, 0.9647F);
        this.neck18_r5.cubeList.add(new ModelBox(neck18_r5, 117, 19, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck17_r4 = new ModelRenderer(this);
        this.neck17_r4.setRotationPoint(1.024F, -5.7075F, -12.383F);
        this.body2.addChild(neck17_r4);
        this.setRotateAngle(neck17_r4, 0.3163F, -0.1699F, 0.4433F);
        this.neck17_r4.cubeList.add(new ModelBox(neck17_r4, 88, 109, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck18_r6 = new ModelRenderer(this);
        this.neck18_r6.setRotationPoint(1.024F, -5.7075F, -14.383F);
        this.body2.addChild(neck18_r6);
        this.setRotateAngle(neck18_r6, 0.0426F, -0.3728F, 1.4222F);
        this.neck18_r6.cubeList.add(new ModelBox(neck18_r6, 100, 45, 7.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, false));

        this.neck17_r5 = new ModelRenderer(this);
        this.neck17_r5.setRotationPoint(1.024F, -5.7075F, -14.383F);
        this.body2.addChild(neck17_r5);
        this.setRotateAngle(neck17_r5, 0.2013F, -0.3187F, 0.9615F);
        this.neck17_r5.cubeList.add(new ModelBox(neck17_r5, 30, 117, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck16_r4 = new ModelRenderer(this);
        this.neck16_r4.setRotationPoint(1.024F, -5.7075F, -14.383F);
        this.body2.addChild(neck16_r4);
        this.setRotateAngle(neck16_r4, 0.3323F, -0.1774F, 0.4405F);
        this.neck16_r4.cubeList.add(new ModelBox(neck16_r4, 74, 110, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck17_r6 = new ModelRenderer(this);
        this.neck17_r6.setRotationPoint(1.024F, -5.7075F, -16.383F);
        this.body2.addChild(neck17_r6);
        this.setRotateAngle(neck17_r6, 0.0454F, -0.3901F, 1.4212F);
        this.neck17_r6.cubeList.add(new ModelBox(neck17_r6, 100, 47, 7.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, false));

        this.neck16_r5 = new ModelRenderer(this);
        this.neck16_r5.setRotationPoint(1.024F, -5.7075F, -16.383F);
        this.body2.addChild(neck16_r5);
        this.setRotateAngle(neck16_r5, 0.2118F, -0.333F, 0.9581F);
        this.neck16_r5.cubeList.add(new ModelBox(neck16_r5, 117, 73, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck15_r5 = new ModelRenderer(this);
        this.neck15_r5.setRotationPoint(1.024F, -5.7075F, -16.383F);
        this.body2.addChild(neck15_r5);
        this.setRotateAngle(neck15_r5, 0.3484F, -0.1848F, 0.4376F);
        this.neck15_r5.cubeList.add(new ModelBox(neck15_r5, 110, 103, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck16_r6 = new ModelRenderer(this);
        this.neck16_r6.setRotationPoint(1.024F, -5.7075F, -18.383F);
        this.body2.addChild(neck16_r6);
        this.setRotateAngle(neck16_r6, 0.0482F, -0.4073F, 1.4201F);
        this.neck16_r6.cubeList.add(new ModelBox(neck16_r6, 100, 49, 7.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, false));

        this.neck15_r6 = new ModelRenderer(this);
        this.neck15_r6.setRotationPoint(1.024F, -5.7075F, -18.383F);
        this.body2.addChild(neck15_r6);
        this.setRotateAngle(neck15_r6, 0.2225F, -0.3473F, 0.9545F);
        this.neck15_r6.cubeList.add(new ModelBox(neck15_r6, 117, 75, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck14_r5 = new ModelRenderer(this);
        this.neck14_r5.setRotationPoint(1.024F, -5.7075F, -18.383F);
        this.body2.addChild(neck14_r5);
        this.setRotateAngle(neck14_r5, 0.3645F, -0.1922F, 0.4346F);
        this.neck14_r5.cubeList.add(new ModelBox(neck14_r5, 110, 105, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck15_r7 = new ModelRenderer(this);
        this.neck15_r7.setRotationPoint(1.024F, -5.7075F, -20.383F);
        this.body2.addChild(neck15_r7);
        this.setRotateAngle(neck15_r7, 0.0482F, -0.4073F, 1.4201F);
        this.neck15_r7.cubeList.add(new ModelBox(neck15_r7, 100, 51, 7.4186F, -6.1831F, -0.4055F, 13, 0, 1, 0.0F, false));

        this.neck14_r6 = new ModelRenderer(this);
        this.neck14_r6.setRotationPoint(1.024F, -5.7075F, -20.383F);
        this.body2.addChild(neck14_r6);
        this.setRotateAngle(neck14_r6, 0.2225F, -0.3473F, 0.9545F);
        this.neck14_r6.cubeList.add(new ModelBox(neck14_r6, 117, 77, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck13_r7 = new ModelRenderer(this);
        this.neck13_r7.setRotationPoint(1.024F, -5.7075F, -20.383F);
        this.body2.addChild(neck13_r7);
        this.setRotateAngle(neck13_r7, 0.3645F, -0.1922F, 0.4346F);
        this.neck13_r7.cubeList.add(new ModelBox(neck13_r7, 110, 107, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck14_r7 = new ModelRenderer(this);
        this.neck14_r7.setRotationPoint(0.0F, -6.8423F, -20.0728F);
        this.body2.addChild(neck14_r7);
        this.setRotateAngle(neck14_r7, -0.2443F, 0.0F, 0.0F);
        this.neck14_r7.cubeList.add(new ModelBox(neck14_r7, 30, 121, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.underbelly3 = new ModelRenderer(this);
        this.underbelly3.setRotationPoint(0.0F, 19.8772F, -12.0113F);
        this.lowerbody3.addChild(underbelly3);
        this.setRotateAngle(underbelly3, 0.1745F, 0.0F, 0.0F);
        this.underbelly3.cubeList.add(new ModelBox(underbelly3, 28, 26, -8.0F, -2.0945F, -0.007F, 16, 3, 13, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 5.1772F, 0.9887F);
        this.lowerbody3.addChild(body1);
        this.setRotateAngle(body1, -0.0349F, 0.0F, 0.0F);


        this.body1_r1 = new ModelRenderer(this);
        this.body1_r1.setRotationPoint(0.0F, -5.2892F, -17.905F);
        this.body1.addChild(body1_r1);
        this.setRotateAngle(body1_r1, -0.0349F, 0.0F, 0.0F);
        this.body1_r1.cubeList.add(new ModelBox(body1_r1, 28, 67, -1.0F, -1.3106F, -0.1054F, 2, 2, 17, 0.0F, false));

        this.neck30_r1 = new ModelRenderer(this);
        this.neck30_r1.setRotationPoint(0.0F, -6.969F, -17.3723F);
        this.body1.addChild(neck30_r1);
        this.setRotateAngle(neck30_r1, -0.1571F, 0.0F, 0.0F);
        this.neck30_r1.cubeList.add(new ModelBox(neck30_r1, 86, 0, 0.0F, -2.7116F, 13.7391F, 0, 3, 1, 0.0F, false));
        this.neck30_r1.cubeList.add(new ModelBox(neck30_r1, 13, 86, 0.0F, -2.6116F, 11.7391F, 0, 3, 1, 0.0F, false));
        this.neck30_r1.cubeList.add(new ModelBox(neck30_r1, 38, 52, 0.0F, -2.5116F, 9.7391F, 0, 3, 1, 0.0F, false));
        this.neck30_r1.cubeList.add(new ModelBox(neck30_r1, 89, 58, 0.0F, -2.4116F, 7.7391F, 0, 3, 1, 0.0F, false));
        this.neck30_r1.cubeList.add(new ModelBox(neck30_r1, 46, 52, 0.0F, -2.3116F, 5.7391F, 0, 3, 1, 0.0F, false));
        this.neck30_r1.cubeList.add(new ModelBox(neck30_r1, 17, 59, 0.0F, -2.1145F, 3.7809F, 0, 3, 1, 0.0F, false));
        this.neck30_r1.cubeList.add(new ModelBox(neck30_r1, 19, 43, 0.0F, -2.0145F, 1.7809F, 0, 3, 1, 0.0F, false));
        this.neck30_r1.cubeList.add(new ModelBox(neck30_r1, 63, 0, 0.0F, -1.8145F, -0.2191F, 0, 3, 1, 0.0F, false));

        this.neck32_r1 = new ModelRenderer(this);
        this.neck32_r1.setRotationPoint(-0.916F, -5.0084F, -2.9313F);
        this.body1.addChild(neck32_r1);
        this.setRotateAngle(neck32_r1, 0.0089F, 0.1483F, -1.5008F);
        this.neck32_r1.cubeList.add(new ModelBox(neck32_r1, 50, 81, -13.4186F, -6.1831F, -0.4055F, 6, 0, 1, 0.0F, true));

        this.neck31_r1 = new ModelRenderer(this);
        this.neck31_r1.setRotationPoint(-0.916F, -5.0084F, -5.4313F);
        this.body1.addChild(neck31_r1);
        this.setRotateAngle(neck31_r1, 0.0151F, 0.1915F, -1.4823F);
        this.neck31_r1.cubeList.add(new ModelBox(neck31_r1, 24, 67, -14.4186F, -6.1831F, -0.4055F, 7, 0, 1, 0.0F, true));

        this.neck30_r2 = new ModelRenderer(this);
        this.neck30_r2.setRotationPoint(-0.916F, -5.0084F, -5.4313F);
        this.body1.addChild(neck30_r2);
        this.setRotateAngle(neck30_r2, 0.0953F, 0.167F, -1.0394F);
        this.neck30_r2.cubeList.add(new ModelBox(neck30_r2, 115, 110, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck31_r2 = new ModelRenderer(this);
        this.neck31_r2.setRotationPoint(-0.916F, -5.0084F, -2.9313F);
        this.body1.addChild(neck31_r2);
        this.setRotateAngle(neck31_r2, 0.0711F, 0.1305F, -1.0605F);
        this.neck31_r2.cubeList.add(new ModelBox(neck31_r2, 115, 101, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck30_r3 = new ModelRenderer(this);
        this.neck30_r3.setRotationPoint(-0.916F, -5.0084F, -2.9313F);
        this.body1.addChild(neck30_r3);
        this.setRotateAngle(neck30_r3, 0.1268F, 0.0776F, -0.5366F);
        this.neck30_r3.cubeList.add(new ModelBox(neck30_r3, 104, 7, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck29_r1 = new ModelRenderer(this);
        this.neck29_r1.setRotationPoint(-0.916F, -5.0084F, -5.4313F);
        this.body1.addChild(neck29_r1);
        this.setRotateAngle(neck29_r1, 0.1659F, 0.0972F, -0.5157F);
        this.neck29_r1.cubeList.add(new ModelBox(neck29_r1, 104, 9, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck28_r1 = new ModelRenderer(this);
        this.neck28_r1.setRotationPoint(-0.916F, -5.2084F, -7.4313F);
        this.body1.addChild(neck28_r1);
        this.setRotateAngle(neck28_r1, 0.2131F, 0.1204F, -0.5106F);
        this.neck28_r1.cubeList.add(new ModelBox(neck28_r1, 112, 69, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck29_r2 = new ModelRenderer(this);
        this.neck29_r2.setRotationPoint(-0.916F, -5.2084F, -7.4313F);
        this.body1.addChild(neck29_r2);
        this.setRotateAngle(neck29_r2, 0.1248F, 0.2106F, -1.0339F);
        this.neck29_r2.cubeList.add(new ModelBox(neck29_r2, 116, 10, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck30_r4 = new ModelRenderer(this);
        this.neck30_r4.setRotationPoint(-0.916F, -5.2084F, -7.4313F);
        this.body1.addChild(neck30_r4);
        this.setRotateAngle(neck30_r4, 0.0227F, 0.2433F, -1.4807F);
        this.neck30_r4.cubeList.add(new ModelBox(neck30_r4, 28, 45, -15.4186F, -6.1831F, -0.4055F, 8, 0, 1, 0.0F, true));

        this.neck29_r3 = new ModelRenderer(this);
        this.neck29_r3.setRotationPoint(-0.916F, -5.4084F, -9.4313F);
        this.body1.addChild(neck29_r3);
        this.setRotateAngle(neck29_r3, 0.0304F, 0.2951F, -1.4786F);
        this.neck29_r3.cubeList.add(new ModelBox(neck29_r3, 0, 18, -16.4186F, -6.1831F, -0.4055F, 9, 0, 1, 0.0F, true));

        this.neck28_r2 = new ModelRenderer(this);
        this.neck28_r2.setRotationPoint(-0.916F, -5.4084F, -9.4313F);
        this.body1.addChild(neck28_r2);
        this.setRotateAngle(neck28_r2, 0.1549F, 0.254F, -1.027F);
        this.neck28_r2.cubeList.add(new ModelBox(neck28_r2, 116, 25, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck27_r1 = new ModelRenderer(this);
        this.neck27_r1.setRotationPoint(-0.916F, -5.4084F, -9.4313F);
        this.body1.addChild(neck27_r1);
        this.setRotateAngle(neck27_r1, 0.2605F, 0.1435F, -0.5044F);
        this.neck27_r1.cubeList.add(new ModelBox(neck27_r1, 74, 112, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck26_r1 = new ModelRenderer(this);
        this.neck26_r1.setRotationPoint(-0.916F, -5.5084F, -11.4313F);
        this.body1.addChild(neck26_r1);
        this.setRotateAngle(neck26_r1, 0.3003F, 0.1624F, -0.5157F);
        this.neck26_r1.cubeList.add(new ModelBox(neck26_r1, 111, 112, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck27_r2 = new ModelRenderer(this);
        this.neck27_r2.setRotationPoint(-0.916F, -5.5084F, -11.4313F);
        this.body1.addChild(neck27_r2);
        this.setRotateAngle(neck27_r2, 0.1804F, 0.29F, -1.0375F);
        this.neck27_r2.cubeList.add(new ModelBox(neck27_r2, 116, 27, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck28_r3 = new ModelRenderer(this);
        this.neck28_r3.setRotationPoint(-0.916F, -5.5084F, -11.4313F);
        this.body1.addChild(neck28_r3);
        this.setRotateAngle(neck28_r3, 0.0371F, 0.3383F, -1.494F);
        this.neck28_r3.cubeList.add(new ModelBox(neck28_r3, 28, 43, -17.4186F, -6.1831F, -0.4055F, 10, 0, 1, 0.0F, true));

        this.neck27_r3 = new ModelRenderer(this);
        this.neck27_r3.setRotationPoint(-0.916F, -5.5084F, -13.4313F);
        this.body1.addChild(neck27_r3);
        this.setRotateAngle(neck27_r3, 0.044F, 0.3814F, -1.4915F);
        this.neck27_r3.cubeList.add(new ModelBox(neck27_r3, 42, 87, -18.4186F, -6.1831F, -0.4055F, 11, 0, 1, 0.0F, true));

        this.neck26_r2 = new ModelRenderer(this);
        this.neck26_r2.setRotationPoint(-0.916F, -5.5084F, -13.4313F);
        this.body1.addChild(neck26_r2);
        this.setRotateAngle(neck26_r2, 0.2065F, 0.3259F, -1.0296F);
        this.neck26_r2.cubeList.add(new ModelBox(neck26_r2, 116, 29, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck25_r2 = new ModelRenderer(this);
        this.neck25_r2.setRotationPoint(-0.916F, -5.5084F, -13.4313F);
        this.body1.addChild(neck25_r2);
        this.setRotateAngle(neck25_r2, 0.3403F, 0.1811F, -0.5089F);
        this.neck25_r2.cubeList.add(new ModelBox(neck25_r2, 30, 113, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck24_r4 = new ModelRenderer(this);
        this.neck24_r4.setRotationPoint(-0.916F, -5.7084F, -15.4313F);
        this.body1.addChild(neck24_r4);
        this.setRotateAngle(neck24_r4, 0.3645F, 0.1922F, -0.487F);
        this.neck24_r4.cubeList.add(new ModelBox(neck24_r4, 104, 11, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck25_r3 = new ModelRenderer(this);
        this.neck25_r3.setRotationPoint(-0.916F, -5.7084F, -15.4313F);
        this.body1.addChild(neck25_r3);
        this.setRotateAngle(neck25_r3, 0.2225F, 0.3473F, -1.0069F);
        this.neck25_r3.cubeList.add(new ModelBox(neck25_r3, 74, 116, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck26_r3 = new ModelRenderer(this);
        this.neck26_r3.setRotationPoint(-0.916F, -5.7084F, -15.4313F);
        this.body1.addChild(neck26_r3);
        this.setRotateAngle(neck26_r3, 0.0482F, 0.4073F, -1.4725F);
        this.neck26_r3.cubeList.add(new ModelBox(neck26_r3, 100, 62, -19.4186F, -6.1831F, -0.4055F, 12, 0, 1, 0.0F, true));

        this.neck29_r4 = new ModelRenderer(this);
        this.neck29_r4.setRotationPoint(1.024F, -5.0084F, -3.4313F);
        this.body1.addChild(neck29_r4);
        this.setRotateAngle(neck29_r4, 0.1268F, -0.0776F, 0.5366F);
        this.neck29_r4.cubeList.add(new ModelBox(neck29_r4, 104, 7, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck30_r5 = new ModelRenderer(this);
        this.neck30_r5.setRotationPoint(1.024F, -5.0084F, -3.4313F);
        this.body1.addChild(neck30_r5);
        this.setRotateAngle(neck30_r5, 0.0711F, -0.1305F, 1.0605F);
        this.neck30_r5.cubeList.add(new ModelBox(neck30_r5, 115, 101, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck31_r3 = new ModelRenderer(this);
        this.neck31_r3.setRotationPoint(1.024F, -5.0084F, -3.4313F);
        this.body1.addChild(neck31_r3);
        this.setRotateAngle(neck31_r3, 0.0089F, -0.1483F, 1.5008F);
        this.neck31_r3.cubeList.add(new ModelBox(neck31_r3, 50, 81, 7.4186F, -6.1831F, -0.4055F, 6, 0, 1, 0.0F, false));

        this.neck28_r4 = new ModelRenderer(this);
        this.neck28_r4.setRotationPoint(1.024F, -5.0084F, -5.4313F);
        this.body1.addChild(neck28_r4);
        this.setRotateAngle(neck28_r4, 0.1659F, -0.0972F, 0.5157F);
        this.neck28_r4.cubeList.add(new ModelBox(neck28_r4, 104, 9, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck29_r5 = new ModelRenderer(this);
        this.neck29_r5.setRotationPoint(1.024F, -5.0084F, -5.4313F);
        this.body1.addChild(neck29_r5);
        this.setRotateAngle(neck29_r5, 0.0953F, -0.167F, 1.0394F);
        this.neck29_r5.cubeList.add(new ModelBox(neck29_r5, 115, 110, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck30_r6 = new ModelRenderer(this);
        this.neck30_r6.setRotationPoint(1.024F, -5.0084F, -5.4313F);
        this.body1.addChild(neck30_r6);
        this.setRotateAngle(neck30_r6, 0.0151F, -0.1915F, 1.4823F);
        this.neck30_r6.cubeList.add(new ModelBox(neck30_r6, 24, 67, 7.4186F, -6.1831F, -0.4055F, 7, 0, 1, 0.0F, false));

        this.neck27_r4 = new ModelRenderer(this);
        this.neck27_r4.setRotationPoint(1.024F, -5.2084F, -7.4313F);
        this.body1.addChild(neck27_r4);
        this.setRotateAngle(neck27_r4, 0.2131F, -0.1204F, 0.5106F);
        this.neck27_r4.cubeList.add(new ModelBox(neck27_r4, 112, 69, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck28_r5 = new ModelRenderer(this);
        this.neck28_r5.setRotationPoint(1.024F, -5.2084F, -7.4313F);
        this.body1.addChild(neck28_r5);
        this.setRotateAngle(neck28_r5, 0.1248F, -0.2106F, 1.0339F);
        this.neck28_r5.cubeList.add(new ModelBox(neck28_r5, 116, 10, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck29_r6 = new ModelRenderer(this);
        this.neck29_r6.setRotationPoint(1.024F, -5.2084F, -7.4313F);
        this.body1.addChild(neck29_r6);
        this.setRotateAngle(neck29_r6, 0.0227F, -0.2433F, 1.4807F);
        this.neck29_r6.cubeList.add(new ModelBox(neck29_r6, 28, 45, 7.4186F, -6.1831F, -0.4055F, 8, 0, 1, 0.0F, false));

        this.neck26_r4 = new ModelRenderer(this);
        this.neck26_r4.setRotationPoint(1.024F, -5.4084F, -9.4313F);
        this.body1.addChild(neck26_r4);
        this.setRotateAngle(neck26_r4, 0.2605F, -0.1435F, 0.5044F);
        this.neck26_r4.cubeList.add(new ModelBox(neck26_r4, 74, 112, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck27_r5 = new ModelRenderer(this);
        this.neck27_r5.setRotationPoint(1.024F, -5.4084F, -9.4313F);
        this.body1.addChild(neck27_r5);
        this.setRotateAngle(neck27_r5, 0.1549F, -0.254F, 1.027F);
        this.neck27_r5.cubeList.add(new ModelBox(neck27_r5, 116, 25, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck28_r6 = new ModelRenderer(this);
        this.neck28_r6.setRotationPoint(1.024F, -5.4084F, -9.4313F);
        this.body1.addChild(neck28_r6);
        this.setRotateAngle(neck28_r6, 0.0304F, -0.2951F, 1.4786F);
        this.neck28_r6.cubeList.add(new ModelBox(neck28_r6, 0, 18, 7.4186F, -6.1831F, -0.4055F, 9, 0, 1, 0.0F, false));

        this.neck26_r5 = new ModelRenderer(this);
        this.neck26_r5.setRotationPoint(1.024F, -5.5084F, -11.4313F);
        this.body1.addChild(neck26_r5);
        this.setRotateAngle(neck26_r5, 0.1804F, -0.29F, 1.0375F);
        this.neck26_r5.cubeList.add(new ModelBox(neck26_r5, 116, 27, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck25_r4 = new ModelRenderer(this);
        this.neck25_r4.setRotationPoint(1.024F, -5.5084F, -11.4313F);
        this.body1.addChild(neck25_r4);
        this.setRotateAngle(neck25_r4, 0.3003F, -0.1624F, 0.5157F);
        this.neck25_r4.cubeList.add(new ModelBox(neck25_r4, 111, 112, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck27_r6 = new ModelRenderer(this);
        this.neck27_r6.setRotationPoint(1.024F, -5.5084F, -11.4313F);
        this.body1.addChild(neck27_r6);
        this.setRotateAngle(neck27_r6, 0.0371F, -0.3383F, 1.494F);
        this.neck27_r6.cubeList.add(new ModelBox(neck27_r6, 28, 43, 7.4186F, -6.1831F, -0.4055F, 10, 0, 1, 0.0F, false));

        this.neck25_r5 = new ModelRenderer(this);
        this.neck25_r5.setRotationPoint(1.024F, -5.5084F, -13.4313F);
        this.body1.addChild(neck25_r5);
        this.setRotateAngle(neck25_r5, 0.2065F, -0.3259F, 1.0296F);
        this.neck25_r5.cubeList.add(new ModelBox(neck25_r5, 116, 29, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck24_r5 = new ModelRenderer(this);
        this.neck24_r5.setRotationPoint(1.024F, -5.5084F, -13.4313F);
        this.body1.addChild(neck24_r5);
        this.setRotateAngle(neck24_r5, 0.3403F, -0.1811F, 0.5089F);
        this.neck24_r5.cubeList.add(new ModelBox(neck24_r5, 30, 113, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck26_r6 = new ModelRenderer(this);
        this.neck26_r6.setRotationPoint(1.024F, -5.5084F, -13.4313F);
        this.body1.addChild(neck26_r6);
        this.setRotateAngle(neck26_r6, 0.044F, -0.3814F, 1.4915F);
        this.neck26_r6.cubeList.add(new ModelBox(neck26_r6, 42, 87, 7.4186F, -6.1831F, -0.4055F, 11, 0, 1, 0.0F, false));

        this.neck25_r6 = new ModelRenderer(this);
        this.neck25_r6.setRotationPoint(1.024F, -5.7084F, -15.4313F);
        this.body1.addChild(neck25_r6);
        this.setRotateAngle(neck25_r6, 0.0482F, -0.4073F, 1.4725F);
        this.neck25_r6.cubeList.add(new ModelBox(neck25_r6, 100, 62, 7.4186F, -6.1831F, -0.4055F, 12, 0, 1, 0.0F, false));

        this.neck24_r6 = new ModelRenderer(this);
        this.neck24_r6.setRotationPoint(1.024F, -5.7084F, -15.4313F);
        this.body1.addChild(neck24_r6);
        this.setRotateAngle(neck24_r6, 0.2225F, -0.3473F, 1.0069F);
        this.neck24_r6.cubeList.add(new ModelBox(neck24_r6, 74, 116, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck23_r6 = new ModelRenderer(this);
        this.neck23_r6.setRotationPoint(1.024F, -5.7084F, -15.4313F);
        this.body1.addChild(neck23_r6);
        this.setRotateAngle(neck23_r6, 0.3645F, -0.1922F, 0.487F);
        this.neck23_r6.cubeList.add(new ModelBox(neck23_r6, 104, 11, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(-0.054F, 4.4713F, 20.0883F);
        this.tailbase1.addChild(hips);
        this.setRotateAngle(hips, -0.0281F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 26, -1.0F, -5.7079F, 0.0402F, 2, 2, 23, 0.002F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-4.7062F, 4.8536F, 14.3032F);
        this.hips.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.3491F, -0.1138F, -1.0399F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 9, 62, -1.0432F, -0.6349F, -3.3137F, 1, 2, 4, 0.0F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-4.7062F, 4.8536F, 15.3032F);
        this.hips.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 1.9844F, 0.5922F, -1.1363F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 38, 52, -0.8956F, -0.7307F, -4.3412F, 1, 2, 5, 0.0F, true));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-4.7062F, 4.8536F, 14.3032F);
        this.hips.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.4037F, -0.0147F, 0.2197F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 74, 26, -1.1127F, -0.4252F, -0.7205F, 1, 2, 4, 0.0F, true));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(4.8142F, 4.8536F, 15.3032F);
        this.hips.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 1.9844F, -0.5922F, 1.1363F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 38, 52, -0.1044F, -0.7307F, -4.3412F, 1, 2, 5, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(4.8142F, 4.8536F, 14.3032F);
        this.hips.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 1.3491F, 0.1138F, 1.0399F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 9, 62, 0.0432F, -0.6349F, -3.3137F, 1, 2, 4, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(4.8142F, 4.8536F, 14.3032F);
        this.hips.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 1.4037F, 0.0147F, -0.2197F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 74, 26, 0.1127F, -0.4252F, -0.7205F, 1, 2, 4, 0.0F, false));

        this.neck41_r3 = new ModelRenderer(this);
        this.neck41_r3.setRotationPoint(0.0F, -6.0823F, 0.5148F);
        this.hips.addChild(neck41_r3);
        this.setRotateAngle(neck41_r3, -0.1222F, 0.0F, 0.0F);
        this.neck41_r3.cubeList.add(new ModelBox(neck41_r3, 99, 88, 0.0F, -3.1499F, 19.9691F, 0, 2, 1, 0.0F, false));
        this.neck41_r3.cubeList.add(new ModelBox(neck41_r3, 19, 94, 0.0F, -3.0499F, 17.9691F, 0, 3, 1, 0.0F, false));
        this.neck41_r3.cubeList.add(new ModelBox(neck41_r3, 77, 102, 0.0F, -2.8499F, 15.9691F, 0, 3, 1, 0.0F, false));
        this.neck41_r3.cubeList.add(new ModelBox(neck41_r3, 107, 17, 0.0F, -2.6499F, 13.9691F, 0, 3, 1, 0.0F, false));
        this.neck41_r3.cubeList.add(new ModelBox(neck41_r3, 45, 113, 0.0F, -2.5499F, 11.9691F, 0, 3, 1, 0.0F, false));
        this.neck41_r3.cubeList.add(new ModelBox(neck41_r3, 36, 121, 0.0F, -2.3499F, 9.9691F, 0, 3, 1, 0.0F, false));
        this.neck41_r3.cubeList.add(new ModelBox(neck41_r3, 107, 25, 0.0F, -2.1499F, 7.9691F, 0, 3, 1, 0.0F, false));
        this.neck41_r3.cubeList.add(new ModelBox(neck41_r3, 107, 74, 0.0F, -1.9499F, 5.9691F, 0, 3, 1, 0.0F, false));
        this.neck41_r3.cubeList.add(new ModelBox(neck41_r3, 43, 109, 0.0F, -1.7499F, 3.9691F, 0, 3, 1, 0.0F, false));
        this.neck41_r3.cubeList.add(new ModelBox(neck41_r3, 74, 102, 0.0F, -1.4499F, 1.9691F, 0, 3, 1, 0.0F, false));
        this.neck41_r3.cubeList.add(new ModelBox(neck41_r3, 110, 25, 0.0F, -1.2452F, -0.0841F, 0, 3, 1, 0.0F, false));

        this.neck40_r2 = new ModelRenderer(this);
        this.neck40_r2.setRotationPoint(-0.916F, -4.3391F, 22.3975F);
        this.hips.addChild(neck40_r2);
        this.setRotateAngle(neck40_r2, 0.0454F, 0.0948F, -1.0109F);
        this.neck40_r2.cubeList.add(new ModelBox(neck40_r2, 120, 6, -2.9899F, 0.0305F, -0.4055F, 3, 0, 1, 0.0F, true));

        this.neck39_r1 = new ModelRenderer(this);
        this.neck39_r1.setRotationPoint(-0.916F, -4.3391F, 20.3975F);
        this.hips.addChild(neck39_r1);
        this.setRotateAngle(neck39_r1, 0.0099F, 0.0183F, -0.996F);
        this.neck39_r1.cubeList.add(new ModelBox(neck39_r1, 0, 35, -3.9899F, 0.0305F, -0.4055F, 4, 0, 1, 0.0F, true));

        this.neck38_r1 = new ModelRenderer(this);
        this.neck38_r1.setRotationPoint(-0.916F, -4.3391F, 18.3975F);
        this.hips.addChild(neck38_r1);
        this.setRotateAngle(neck38_r1, -0.0922F, -0.0576F, -0.9774F);
        this.neck38_r1.cubeList.add(new ModelBox(neck38_r1, 0, 86, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck39_r2 = new ModelRenderer(this);
        this.neck39_r2.setRotationPoint(-0.916F, -4.5391F, 16.3975F);
        this.hips.addChild(neck39_r2);
        this.setRotateAngle(neck39_r2, -0.1456F, -0.061F, -0.9577F);
        this.neck39_r2.cubeList.add(new ModelBox(neck39_r2, 82, 76, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck40_r3 = new ModelRenderer(this);
        this.neck40_r3.setRotationPoint(-0.916F, -4.5391F, 16.3975F);
        this.hips.addChild(neck40_r3);
        this.setRotateAngle(neck40_r3, -0.0958F, -0.1256F, -1.4798F);
        this.neck40_r3.cubeList.add(new ModelBox(neck40_r3, 0, 14, -5.3366F, -2.4685F, -0.4055F, 1, 0, 1, 0.0F, true));

        this.neck37_r1 = new ModelRenderer(this);
        this.neck37_r1.setRotationPoint(-0.916F, -4.5391F, 14.3975F);
        this.hips.addChild(neck37_r1);
        this.setRotateAngle(neck37_r1, -0.1456F, -0.061F, -0.9228F);
        this.neck37_r1.cubeList.add(new ModelBox(neck37_r1, 0, 88, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck38_r2 = new ModelRenderer(this);
        this.neck38_r2.setRotationPoint(-0.916F, -4.5391F, 14.3975F);
        this.hips.addChild(neck38_r2);
        this.setRotateAngle(neck38_r2, -0.0958F, -0.1256F, -1.4449F);
        this.neck38_r2.cubeList.add(new ModelBox(neck38_r2, 0, 57, -6.3366F, -2.4685F, -0.4055F, 2, 0, 1, 0.0F, true));

        this.neck37_r2 = new ModelRenderer(this);
        this.neck37_r2.setRotationPoint(-0.916F, -4.5391F, 12.3975F);
        this.hips.addChild(neck37_r2);
        this.setRotateAngle(neck37_r2, -0.0671F, -0.0817F, -1.3955F);
        this.neck37_r2.cubeList.add(new ModelBox(neck37_r2, 83, 102, -8.3366F, -2.4685F, -0.4055F, 4, 0, 1, 0.0F, true));

        this.neck36_r1 = new ModelRenderer(this);
        this.neck36_r1.setRotationPoint(-0.916F, -4.5391F, 12.3975F);
        this.hips.addChild(neck36_r1);
        this.setRotateAngle(neck36_r1, -0.0989F, -0.0373F, -0.8728F);
        this.neck36_r1.cubeList.add(new ModelBox(neck36_r1, 74, 91, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck35_r1 = new ModelRenderer(this);
        this.neck35_r1.setRotationPoint(-0.916F, -4.5391F, 10.3975F);
        this.hips.addChild(neck35_r1);
        this.setRotateAngle(neck35_r1, -0.06F, -0.0175F, -0.8215F);
        this.neck35_r1.cubeList.add(new ModelBox(neck35_r1, 23, 96, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck36_r2 = new ModelRenderer(this);
        this.neck36_r2.setRotationPoint(-0.916F, -4.5391F, 10.3975F);
        this.hips.addChild(neck36_r2);
        this.setRotateAngle(neck36_r2, -0.0433F, -0.0451F, -1.3446F);
        this.neck36_r2.cubeList.add(new ModelBox(neck36_r2, 30, 115, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck36_r3 = new ModelRenderer(this);
        this.neck36_r3.setRotationPoint(-0.916F, -4.5391F, 8.3975F);
        this.hips.addChild(neck36_r3);
        this.setRotateAngle(neck36_r3, -0.06F, -0.0175F, -0.7691F);
        this.neck36_r3.cubeList.add(new ModelBox(neck36_r3, 23, 94, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck37_r3 = new ModelRenderer(this);
        this.neck37_r3.setRotationPoint(-0.916F, -4.5391F, 8.3975F);
        this.hips.addChild(neck37_r3);
        this.setRotateAngle(neck37_r3, -0.0433F, -0.0451F, -1.2923F);
        this.neck37_r3.cubeList.add(new ModelBox(neck37_r3, 24, 71, -10.3366F, -2.4685F, -0.4055F, 6, 0, 1, 0.0F, true));

        this.neck36_r4 = new ModelRenderer(this);
        this.neck36_r4.setRotationPoint(-0.916F, -4.5391F, 6.3975F);
        this.hips.addChild(neck36_r4);
        this.setRotateAngle(neck36_r4, -0.0141F, -0.016F, -1.6768F);
        this.neck36_r4.cubeList.add(new ModelBox(neck36_r4, 0, 67, -9.4186F, -6.1831F, -0.4055F, 2, 0, 1, 0.0F, true));

        this.neck35_r2 = new ModelRenderer(this);
        this.neck35_r2.setRotationPoint(-0.916F, -4.5391F, 6.3975F);
        this.hips.addChild(neck35_r2);
        this.setRotateAngle(neck35_r2, -0.0195F, -0.0085F, -1.2405F);
        this.neck35_r2.cubeList.add(new ModelBox(neck35_r2, 115, 38, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck34_r1 = new ModelRenderer(this);
        this.neck34_r1.setRotationPoint(-0.916F, -4.5391F, 6.3975F);
        this.hips.addChild(neck34_r1);
        this.setRotateAngle(neck34_r1, -0.0212F, 0.0024F, -0.7171F);
        this.neck34_r1.cubeList.add(new ModelBox(neck34_r1, 68, 98, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck33_r1 = new ModelRenderer(this);
        this.neck33_r1.setRotationPoint(-0.916F, -4.5391F, 4.3975F);
        this.hips.addChild(neck33_r1);
        this.setRotateAngle(neck33_r1, 0.0177F, 0.0223F, -0.6817F);
        this.neck33_r1.cubeList.add(new ModelBox(neck33_r1, 81, 98, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck34_r2 = new ModelRenderer(this);
        this.neck34_r2.setRotationPoint(-0.916F, -4.5391F, 4.3975F);
        this.hips.addChild(neck34_r2);
        this.setRotateAngle(neck34_r2, 0.0042F, 0.0281F, -1.2054F);
        this.neck34_r2.cubeList.add(new ModelBox(neck34_r2, 115, 40, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck35_r3 = new ModelRenderer(this);
        this.neck35_r3.setRotationPoint(-0.916F, -4.5391F, 4.3975F);
        this.hips.addChild(neck35_r3);
        this.setRotateAngle(neck35_r3, -0.0081F, 0.0273F, -1.6419F);
        this.neck35_r3.cubeList.add(new ModelBox(neck35_r3, 76, 120, -10.4186F, -6.1831F, -0.4055F, 3, 0, 1, 0.0F, true));

        this.neck34_r3 = new ModelRenderer(this);
        this.neck34_r3.setRotationPoint(-0.916F, -4.5391F, 2.3975F);
        this.hips.addChild(neck34_r3);
        this.setRotateAngle(neck34_r3, -0.0033F, 0.0618F, -1.6068F);
        this.neck34_r3.cubeList.add(new ModelBox(neck34_r3, 83, 104, -11.4186F, -6.1831F, -0.4055F, 4, 0, 1, 0.0F, true));

        this.neck33_r2 = new ModelRenderer(this);
        this.neck33_r2.setRotationPoint(-0.916F, -4.5391F, 2.3975F);
        this.hips.addChild(neck33_r2);
        this.setRotateAngle(neck33_r2, 0.0232F, 0.0574F, -1.1697F);
        this.neck33_r2.cubeList.add(new ModelBox(neck33_r2, 86, 115, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck32_r2 = new ModelRenderer(this);
        this.neck32_r2.setRotationPoint(-0.916F, -4.5391F, 2.3975F);
        this.hips.addChild(neck32_r2);
        this.setRotateAngle(neck32_r2, 0.0488F, 0.0381F, -0.6458F);
        this.neck32_r2.cubeList.add(new ModelBox(neck32_r2, 100, 68, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck31_r4 = new ModelRenderer(this);
        this.neck31_r4.setRotationPoint(-0.916F, -4.5391F, 0.3975F);
        this.hips.addChild(neck31_r4);
        this.setRotateAngle(neck31_r4, 0.0877F, 0.0579F, -0.5916F);
        this.neck31_r4.cubeList.add(new ModelBox(neck31_r4, 102, 101, -4.9899F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck33_r3 = new ModelRenderer(this);
        this.neck33_r3.setRotationPoint(-0.916F, -4.5391F, 0.3975F);
        this.hips.addChild(neck33_r3);
        this.setRotateAngle(neck33_r3, 0.0028F, 0.105F, -1.5539F);
        this.neck33_r3.cubeList.add(new ModelBox(neck33_r3, 103, 37, -12.4186F, -6.1831F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck32_r3 = new ModelRenderer(this);
        this.neck32_r3.setRotationPoint(-0.916F, -4.5391F, 0.3975F);
        this.hips.addChild(neck32_r3);
        this.setRotateAngle(neck32_r3, 0.047F, 0.094F, -1.1155F);
        this.neck32_r3.cubeList.add(new ModelBox(neck32_r3, 99, 115, -9.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, true));

        this.neck35_r4 = new ModelRenderer(this);
        this.neck35_r4.setRotationPoint(1.024F, -4.5391F, 8.3975F);
        this.hips.addChild(neck35_r4);
        this.setRotateAngle(neck35_r4, -0.06F, 0.0175F, 0.7691F);
        this.neck35_r4.cubeList.add(new ModelBox(neck35_r4, 23, 94, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck36_r5 = new ModelRenderer(this);
        this.neck36_r5.setRotationPoint(1.024F, -4.5391F, 8.3975F);
        this.hips.addChild(neck36_r5);
        this.setRotateAngle(neck36_r5, -0.0433F, 0.0451F, 1.2923F);
        this.neck36_r5.cubeList.add(new ModelBox(neck36_r5, 24, 71, 4.3366F, -2.4685F, -0.4055F, 6, 0, 1, 0.0F, false));

        this.neck38_r3 = new ModelRenderer(this);
        this.neck38_r3.setRotationPoint(1.024F, -4.5391F, 16.3975F);
        this.hips.addChild(neck38_r3);
        this.setRotateAngle(neck38_r3, -0.1456F, 0.061F, 0.9577F);
        this.neck38_r3.cubeList.add(new ModelBox(neck38_r3, 82, 76, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck39_r3 = new ModelRenderer(this);
        this.neck39_r3.setRotationPoint(1.024F, -4.5391F, 16.3975F);
        this.hips.addChild(neck39_r3);
        this.setRotateAngle(neck39_r3, -0.0958F, 0.1256F, 1.4798F);
        this.neck39_r3.cubeList.add(new ModelBox(neck39_r3, 0, 14, 4.3366F, -2.4685F, -0.4055F, 1, 0, 1, 0.0F, false));

        this.neck39_r4 = new ModelRenderer(this);
        this.neck39_r4.setRotationPoint(1.024F, -4.3391F, 22.3975F);
        this.hips.addChild(neck39_r4);
        this.setRotateAngle(neck39_r4, 0.0454F, -0.0948F, 1.0109F);
        this.neck39_r4.cubeList.add(new ModelBox(neck39_r4, 120, 6, -0.0101F, 0.0305F, -0.4055F, 3, 0, 1, 0.0F, false));

        this.neck38_r4 = new ModelRenderer(this);
        this.neck38_r4.setRotationPoint(1.024F, -4.3391F, 20.3975F);
        this.hips.addChild(neck38_r4);
        this.setRotateAngle(neck38_r4, 0.0099F, -0.0183F, 0.996F);
        this.neck38_r4.cubeList.add(new ModelBox(neck38_r4, 0, 35, -0.0101F, 0.0305F, -0.4055F, 4, 0, 1, 0.0F, false));

        this.neck37_r4 = new ModelRenderer(this);
        this.neck37_r4.setRotationPoint(1.024F, -4.3391F, 18.3975F);
        this.hips.addChild(neck37_r4);
        this.setRotateAngle(neck37_r4, -0.0922F, 0.0576F, 0.9774F);
        this.neck37_r4.cubeList.add(new ModelBox(neck37_r4, 0, 86, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck37_r5 = new ModelRenderer(this);
        this.neck37_r5.setRotationPoint(1.024F, -4.5391F, 14.3975F);
        this.hips.addChild(neck37_r5);
        this.setRotateAngle(neck37_r5, -0.0958F, 0.1256F, 1.4449F);
        this.neck37_r5.cubeList.add(new ModelBox(neck37_r5, 0, 57, 4.3366F, -2.4685F, -0.4055F, 2, 0, 1, 0.0F, false));

        this.neck36_r6 = new ModelRenderer(this);
        this.neck36_r6.setRotationPoint(1.024F, -4.5391F, 14.3975F);
        this.hips.addChild(neck36_r6);
        this.setRotateAngle(neck36_r6, -0.1456F, 0.061F, 0.9228F);
        this.neck36_r6.cubeList.add(new ModelBox(neck36_r6, 0, 88, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck36_r7 = new ModelRenderer(this);
        this.neck36_r7.setRotationPoint(1.024F, -4.5391F, 12.3975F);
        this.hips.addChild(neck36_r7);
        this.setRotateAngle(neck36_r7, -0.0671F, 0.0817F, 1.3955F);
        this.neck36_r7.cubeList.add(new ModelBox(neck36_r7, 83, 102, 4.3366F, -2.4685F, -0.4055F, 4, 0, 1, 0.0F, false));

        this.neck35_r5 = new ModelRenderer(this);
        this.neck35_r5.setRotationPoint(1.024F, -4.5391F, 12.3975F);
        this.hips.addChild(neck35_r5);
        this.setRotateAngle(neck35_r5, -0.0989F, 0.0373F, 0.8728F);
        this.neck35_r5.cubeList.add(new ModelBox(neck35_r5, 74, 91, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck35_r6 = new ModelRenderer(this);
        this.neck35_r6.setRotationPoint(1.024F, -4.5391F, 10.3975F);
        this.hips.addChild(neck35_r6);
        this.setRotateAngle(neck35_r6, -0.0433F, 0.0451F, 1.3446F);
        this.neck35_r6.cubeList.add(new ModelBox(neck35_r6, 30, 115, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck34_r4 = new ModelRenderer(this);
        this.neck34_r4.setRotationPoint(1.024F, -4.5391F, 10.3975F);
        this.hips.addChild(neck34_r4);
        this.setRotateAngle(neck34_r4, -0.06F, 0.0175F, 0.8215F);
        this.neck34_r4.cubeList.add(new ModelBox(neck34_r4, 23, 96, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck33_r4 = new ModelRenderer(this);
        this.neck33_r4.setRotationPoint(1.024F, -4.5391F, 6.3975F);
        this.hips.addChild(neck33_r4);
        this.setRotateAngle(neck33_r4, -0.0212F, -0.0024F, 0.7171F);
        this.neck33_r4.cubeList.add(new ModelBox(neck33_r4, 68, 98, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck34_r5 = new ModelRenderer(this);
        this.neck34_r5.setRotationPoint(1.024F, -4.5391F, 6.3975F);
        this.hips.addChild(neck34_r5);
        this.setRotateAngle(neck34_r5, -0.0195F, 0.0085F, 1.2405F);
        this.neck34_r5.cubeList.add(new ModelBox(neck34_r5, 115, 38, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck35_r7 = new ModelRenderer(this);
        this.neck35_r7.setRotationPoint(1.024F, -4.5391F, 6.3975F);
        this.hips.addChild(neck35_r7);
        this.setRotateAngle(neck35_r7, -0.0141F, 0.016F, 1.6768F);
        this.neck35_r7.cubeList.add(new ModelBox(neck35_r7, 0, 67, 7.4186F, -6.1831F, -0.4055F, 2, 0, 1, 0.0F, false));

        this.neck33_r5 = new ModelRenderer(this);
        this.neck33_r5.setRotationPoint(1.024F, -4.5391F, 4.3975F);
        this.hips.addChild(neck33_r5);
        this.setRotateAngle(neck33_r5, 0.0042F, -0.0281F, 1.2054F);
        this.neck33_r5.cubeList.add(new ModelBox(neck33_r5, 115, 40, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck32_r4 = new ModelRenderer(this);
        this.neck32_r4.setRotationPoint(1.024F, -4.5391F, 4.3975F);
        this.hips.addChild(neck32_r4);
        this.setRotateAngle(neck32_r4, 0.0177F, -0.0223F, 0.6817F);
        this.neck32_r4.cubeList.add(new ModelBox(neck32_r4, 81, 98, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck34_r6 = new ModelRenderer(this);
        this.neck34_r6.setRotationPoint(1.024F, -4.5391F, 4.3975F);
        this.hips.addChild(neck34_r6);
        this.setRotateAngle(neck34_r6, -0.0081F, -0.0273F, 1.6419F);
        this.neck34_r6.cubeList.add(new ModelBox(neck34_r6, 76, 120, 7.4186F, -6.1831F, -0.4055F, 3, 0, 1, 0.0F, false));

        this.neck31_r5 = new ModelRenderer(this);
        this.neck31_r5.setRotationPoint(1.024F, -4.5391F, 2.3975F);
        this.hips.addChild(neck31_r5);
        this.setRotateAngle(neck31_r5, 0.0488F, -0.0381F, 0.6458F);
        this.neck31_r5.cubeList.add(new ModelBox(neck31_r5, 100, 68, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck32_r5 = new ModelRenderer(this);
        this.neck32_r5.setRotationPoint(1.024F, -4.5391F, 2.3975F);
        this.hips.addChild(neck32_r5);
        this.setRotateAngle(neck32_r5, 0.0232F, -0.0574F, 1.1697F);
        this.neck32_r5.cubeList.add(new ModelBox(neck32_r5, 86, 115, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck33_r6 = new ModelRenderer(this);
        this.neck33_r6.setRotationPoint(1.024F, -4.5391F, 2.3975F);
        this.hips.addChild(neck33_r6);
        this.setRotateAngle(neck33_r6, -0.0033F, -0.0618F, 1.6068F);
        this.neck33_r6.cubeList.add(new ModelBox(neck33_r6, 83, 104, 7.4186F, -6.1831F, -0.4055F, 4, 0, 1, 0.0F, false));

        this.neck30_r7 = new ModelRenderer(this);
        this.neck30_r7.setRotationPoint(1.024F, -4.5391F, 0.3975F);
        this.hips.addChild(neck30_r7);
        this.setRotateAngle(neck30_r7, 0.0877F, -0.0579F, 0.5916F);
        this.neck30_r7.cubeList.add(new ModelBox(neck30_r7, 102, 101, -0.0101F, 0.0305F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck32_r6 = new ModelRenderer(this);
        this.neck32_r6.setRotationPoint(1.024F, -4.5391F, 0.3975F);
        this.hips.addChild(neck32_r6);
        this.setRotateAngle(neck32_r6, 0.0028F, -0.105F, 1.5539F);
        this.neck32_r6.cubeList.add(new ModelBox(neck32_r6, 103, 37, 7.4186F, -6.1831F, -0.4055F, 5, 0, 1, 0.0F, false));

        this.neck31_r6 = new ModelRenderer(this);
        this.neck31_r6.setRotationPoint(1.024F, -4.5391F, 0.3975F);
        this.hips.addChild(neck31_r6);
        this.setRotateAngle(neck31_r6, 0.047F, -0.094F, 1.1155F);
        this.neck31_r6.cubeList.add(new ModelBox(neck31_r6, 99, 115, 4.3366F, -2.4685F, -0.4055F, 5, 0, 1, 0.0F, false));

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
