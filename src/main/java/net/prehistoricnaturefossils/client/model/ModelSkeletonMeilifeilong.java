package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMeilifeilong extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer chest1;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer chest6_r1;
    private final ModelRenderer chest5_r1;
    private final ModelRenderer chest5_r2;
    private final ModelRenderer chest5_r3;
    private final ModelRenderer chest4_r1;
    private final ModelRenderer chest4_r2;
    private final ModelRenderer chest4_r3;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest4_r4;
    private final ModelRenderer chest4_r5;
    private final ModelRenderer chest3_r2;
    private final ModelRenderer chest2_r2;
    private final ModelRenderer chest5_r4;
    private final ModelRenderer body1;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer body4_r1;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body7_r1;
    private final ModelRenderer body5_r2;
    private final ModelRenderer body6_r2;
    private final ModelRenderer chest6_r2;
    private final ModelRenderer body4_r2;
    private final ModelRenderer body5_r3;
    private final ModelRenderer body4_r3;
    private final ModelRenderer chest5_r5;
    private final ModelRenderer tail1;
    private final ModelRenderer leftleg1;
    private final ModelRenderer upperleg6_r1;
    private final ModelRenderer upperleg5_r1;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leg6_r1;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftlegwing2;
    private final ModelRenderer leftlegwing1;
    private final ModelRenderer rightleg1;
    private final ModelRenderer upperleg7_r1;
    private final ModelRenderer upperleg6_r2;
    private final ModelRenderer rightleg2;
    private final ModelRenderer leg7_r1;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightlegwing2;
    private final ModelRenderer rightlegwing1;
    private final ModelRenderer neck1;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck1_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer head;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head4_r2;
    private final ModelRenderer head4_r3;
    private final ModelRenderer head3_r1;
    private final ModelRenderer head2_r1;
    private final ModelRenderer head3_r2;
    private final ModelRenderer head3_r3;
    private final ModelRenderer head2_r2;
    private final ModelRenderer head2_r3;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3_r2;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw5;
    private final ModelRenderer jaw8_r1;
    private final ModelRenderer jaw7_r1;
    private final ModelRenderer jaw6_r1;
    private final ModelRenderer jaw6_r2;
    private final ModelRenderer jaw5_r1;
    private final ModelRenderer shape64;
    private final ModelRenderer underneck3;
    private final ModelRenderer gums1;
    private final ModelRenderer head2;
    private final ModelRenderer head2_r4;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer head8_r1;
    private final ModelRenderer head8_r2;
    private final ModelRenderer head7_r1;
    private final ModelRenderer head7_r2;
    private final ModelRenderer head6_r1;
    private final ModelRenderer lips1;
    private final ModelRenderer lips2;
    private final ModelRenderer head4;
    private final ModelRenderer head16_r1;
    private final ModelRenderer head15_r1;
    private final ModelRenderer head14_r1;
    private final ModelRenderer head13_r1;
    private final ModelRenderer head12_r1;
    private final ModelRenderer head11_r1;
    private final ModelRenderer head10_r1;
    private final ModelRenderer head9_r1;
    private final ModelRenderer head8_r3;
    private final ModelRenderer head6_r2;
    private final ModelRenderer head5_r1;
    private final ModelRenderer bone;
    private final ModelRenderer head7_r3;
    private final ModelRenderer head7_r4;
    private final ModelRenderer head6_r3;
    private final ModelRenderer head8_r4;
    private final ModelRenderer head7_r5;
    private final ModelRenderer head7_r6;
    private final ModelRenderer head7_r7;
    private final ModelRenderer bone2;
    private final ModelRenderer leftwing1;
    private final ModelRenderer upperwing8_r1;
    private final ModelRenderer leftwing2;
    private final ModelRenderer wing10_r1;
    private final ModelRenderer wing8_r1;
    private final ModelRenderer leftwing3;
    private final ModelRenderer leftwing4;
    private final ModelRenderer leftwing5;
    private final ModelRenderer wingfinger9_r1;
    private final ModelRenderer leftwing6;
    private final ModelRenderer leftwing5membrance2;
    private final ModelRenderer lefthand2;
    private final ModelRenderer leftwing4membrance;
    private final ModelRenderer leftwing3membrance;
    private final ModelRenderer leftwing1membrance;
    private final ModelRenderer rightwing1;
    private final ModelRenderer upperwing9_r1;
    private final ModelRenderer rightwing2;
    private final ModelRenderer wing11_r1;
    private final ModelRenderer wing9_r1;
    private final ModelRenderer rightwing3;
    private final ModelRenderer rightwing4;
    private final ModelRenderer rightwing5;
    private final ModelRenderer wingfinger10_r1;
    private final ModelRenderer rightwing6;
    private final ModelRenderer rightwing5membrance2;
    private final ModelRenderer righthand2;
    private final ModelRenderer rightwing4membrance;
    private final ModelRenderer rightwing3membrance;
    private final ModelRenderer rightwing1membrance;

    public ModelSkeletonMeilifeilong() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 28.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -9.25F, 0.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);


        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, -4.4776F, 2.2083F);
        this.root.addChild(chest1);
        this.setRotateAngle(chest1, -0.4932F, 0.0F, 0.0F);


        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, -0.4F, -1.3F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.1571F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 0, 24, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 21, 31, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.003F, false));

        this.chest6_r1 = new ModelRenderer(this);
        this.chest6_r1.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest6_r1);
        this.setRotateAngle(chest6_r1, 0.1426F, 0.2093F, -1.3024F);
        this.chest6_r1.cubeList.add(new ModelBox(chest6_r1, 31, 11, -1.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest5_r1 = new ModelRenderer(this);
        this.chest5_r1.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r1);
        this.setRotateAngle(chest5_r1, 0.2362F, 0.0906F, -0.6958F);
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 27, 32, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest5_r2 = new ModelRenderer(this);
        this.chest5_r2.setRotationPoint(-2.2F, -0.6963F, -2.8469F);
        this.chest1.addChild(chest5_r2);
        this.setRotateAngle(chest5_r2, 1.9477F, 0.6105F, -0.2383F);
        this.chest5_r2.cubeList.add(new ModelBox(chest5_r2, 30, 32, -0.6197F, -0.6653F, -2.8318F, 1, 1, 3, -0.2F, true));

        this.chest5_r3 = new ModelRenderer(this);
        this.chest5_r3.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest5_r3);
        this.setRotateAngle(chest5_r3, 0.2567F, 0.3201F, -1.2334F);
        this.chest5_r3.cubeList.add(new ModelBox(chest5_r3, 14, 20, -1.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest4_r1 = new ModelRenderer(this);
        this.chest4_r1.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r1);
        this.setRotateAngle(chest4_r1, 0.3904F, 0.1198F, -0.6404F);
        this.chest4_r1.cubeList.add(new ModelBox(chest4_r1, 21, 22, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest4_r2 = new ModelRenderer(this);
        this.chest4_r2.setRotationPoint(-1.0F, -0.6963F, -1.3469F);
        this.chest1.addChild(chest4_r2);
        this.setRotateAngle(chest4_r2, 0.1767F, 0.4736F, 0.0813F);
        this.chest4_r2.cubeList.add(new ModelBox(chest4_r2, 29, 27, -1.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, true));

        this.chest4_r3 = new ModelRenderer(this);
        this.chest4_r3.setRotationPoint(2.2F, -0.6963F, -2.8469F);
        this.chest1.addChild(chest4_r3);
        this.setRotateAngle(chest4_r3, 1.9477F, -0.6105F, 0.2383F);
        this.chest4_r3.cubeList.add(new ModelBox(chest4_r3, 30, 32, -0.3803F, -0.6653F, -2.8318F, 1, 1, 3, -0.2F, false));

        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(1.0F, -0.6963F, -1.3469F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, 0.1767F, -0.4736F, -0.0813F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 29, 27, 0.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, false));

        this.chest4_r4 = new ModelRenderer(this);
        this.chest4_r4.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest4_r4);
        this.setRotateAngle(chest4_r4, 0.2362F, -0.0906F, 0.6958F);
        this.chest4_r4.cubeList.add(new ModelBox(chest4_r4, 27, 32, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest4_r5 = new ModelRenderer(this);
        this.chest4_r5.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r5);
        this.setRotateAngle(chest4_r5, 0.2567F, -0.3201F, 1.2334F);
        this.chest4_r5.cubeList.add(new ModelBox(chest4_r5, 14, 20, 0.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest3_r2 = new ModelRenderer(this);
        this.chest3_r2.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest3_r2);
        this.setRotateAngle(chest3_r2, 0.3904F, -0.1198F, 0.6404F);
        this.chest3_r2.cubeList.add(new ModelBox(chest3_r2, 21, 22, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest2_r2 = new ModelRenderer(this);
        this.chest2_r2.setRotationPoint(0.0F, 1.2791F, -1.0341F);
        this.chest1.addChild(chest2_r2);
        this.setRotateAngle(chest2_r2, -0.0262F, 0.0F, 0.0F);
        this.chest2_r2.cubeList.add(new ModelBox(chest2_r2, 28, 20, -1.5F, -0.5F, -1.7F, 3, 1, 2, 0.0F, false));

        this.chest5_r4 = new ModelRenderer(this);
        this.chest5_r4.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r4);
        this.setRotateAngle(chest5_r4, 0.1426F, -0.2093F, 1.3024F);
        this.chest5_r4.cubeList.add(new ModelBox(chest5_r4, 31, 11, 0.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.chest1.addChild(body1);
        this.setRotateAngle(body1, -0.1367F, 0.0F, 0.0F);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -0.9744F, 4.4978F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.1658F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 6, 0, 0.0F, -0.2F, -1.5F, 0, 1, 1, 0.0F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -1.1F, 0.9F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0349F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 41, 7, 0.0F, -0.5F, 0.1F, 0, 1, 1, 0.0F, false));
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 7, 20, -0.5F, -0.1F, 0.1F, 1, 1, 4, 0.0F, false));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(-0.6867F, 0.3324F, 2.8734F);
        this.body1.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -1.1013F, -0.2719F, -0.6165F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 33, 24, -0.3F, -0.35F, -0.5F, 1, 1, 1, -0.31F, true));
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 0, 49, -0.3F, -0.65F, -0.5F, 1, 1, 1, -0.32F, true));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(-1.011F, -0.6259F, 3.6737F);
        this.body1.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -0.8029F, 0.0F, -0.6545F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 47, 47, -0.8044F, -0.7841F, -0.4476F, 1, 2, 1, -0.31F, true));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 42, 47, -0.8044F, -0.7841F, -0.1476F, 1, 2, 1, -0.3F, true));

        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-1.4F, -0.9801F, 4.497F);
        this.body1.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -0.6545F, 0.0F, 0.0F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 5, 49, -0.5F, -0.5F, -0.6F, 1, 1, 1, -0.31F, true));
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 5, 49, 2.3F, -0.5F, -0.6F, 1, 1, 1, -0.31F, false));

        this.body7_r1 = new ModelRenderer(this);
        this.body7_r1.setRotationPoint(-1.4F, -0.6187F, 4.3912F);
        this.body1.addChild(body7_r1);
        this.setRotateAngle(body7_r1, 0.2705F, 0.0F, 0.0F);
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 10, 41, -0.5F, -0.8F, -1.5F, 1, 1, 2, -0.3F, true));
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 10, 41, 2.3F, -0.8F, -1.5F, 1, 1, 2, -0.3F, false));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(-1.6F, -0.6746F, 3.9838F);
        this.body1.addChild(body5_r2);
        this.setRotateAngle(body5_r2, -0.1268F, -0.1854F, 0.0503F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 31, 0, -0.3F, -0.5279F, -2.6834F, 1, 1, 3, -0.3F, true));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(-1.4F, -0.6746F, 3.5838F);
        this.body1.addChild(body6_r2);
        this.setRotateAngle(body6_r2, -0.2618F, 0.0F, 0.0F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 38, 35, -0.1F, -0.6315F, -0.6971F, 2, 1, 2, -0.3F, true));
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 38, 35, 0.9F, -0.6315F, -0.6971F, 2, 1, 2, -0.3F, false));

        this.chest6_r2 = new ModelRenderer(this);
        this.chest6_r2.setRotationPoint(-0.5F, -0.8436F, 2.3123F);
        this.body1.addChild(chest6_r2);
        this.setRotateAngle(chest6_r2, 0.2054F, 0.1483F, -0.953F);
        this.chest6_r2.cubeList.add(new ModelBox(chest6_r2, 12, 7, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body4_r2 = new ModelRenderer(this);
        this.body4_r2.setRotationPoint(0.6867F, 0.3324F, 2.8734F);
        this.body1.addChild(body4_r2);
        this.setRotateAngle(body4_r2, -1.1013F, 0.2719F, 0.6165F);
        this.body4_r2.cubeList.add(new ModelBox(body4_r2, 0, 49, -0.7F, -0.65F, -0.5F, 1, 1, 1, -0.32F, false));
        this.body4_r2.cubeList.add(new ModelBox(body4_r2, 33, 24, -0.7F, -0.35F, -0.5F, 1, 1, 1, -0.31F, false));

        this.body5_r3 = new ModelRenderer(this);
        this.body5_r3.setRotationPoint(1.011F, -0.6259F, 3.6737F);
        this.body1.addChild(body5_r3);
        this.setRotateAngle(body5_r3, -0.8029F, 0.0F, 0.6545F);
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 42, 47, -0.1956F, -0.7841F, -0.1476F, 1, 2, 1, -0.3F, false));
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 47, 47, -0.1956F, -0.7841F, -0.4476F, 1, 2, 1, -0.31F, false));

        this.body4_r3 = new ModelRenderer(this);
        this.body4_r3.setRotationPoint(1.6F, -0.6746F, 3.9838F);
        this.body1.addChild(body4_r3);
        this.setRotateAngle(body4_r3, -0.1268F, 0.1854F, -0.0503F);
        this.body4_r3.cubeList.add(new ModelBox(body4_r3, 31, 0, -0.7F, -0.5279F, -2.6834F, 1, 1, 3, -0.3F, false));

        this.chest5_r5 = new ModelRenderer(this);
        this.chest5_r5.setRotationPoint(0.5F, -0.8436F, 2.3123F);
        this.body1.addChild(chest5_r5);
        this.setRotateAngle(chest5_r5, 0.2054F, -0.1483F, 0.953F);
        this.chest5_r5.cubeList.add(new ModelBox(chest5_r5, 12, 7, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.7979F, 5.0215F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.3604F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 41, 21, -0.5F, -0.2053F, -0.0603F, 1, 1, 2, 0.003F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.7F, -0.35F, 3.9F);
        this.body1.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.4336F, -0.0911F, -0.3406F);


        this.upperleg6_r1 = new ModelRenderer(this);
        this.upperleg6_r1.setRotationPoint(0.1669F, 4.6413F, -0.0605F);
        this.leftleg1.addChild(upperleg6_r1);
        this.setRotateAngle(upperleg6_r1, 0.2007F, 0.0F, 0.0F);
        this.upperleg6_r1.cubeList.add(new ModelBox(upperleg6_r1, 0, 11, -0.5F, -1.8F, -0.5F, 1, 3, 1, -0.3F, false));

        this.upperleg5_r1 = new ModelRenderer(this);
        this.upperleg5_r1.setRotationPoint(0.8606F, 3.7104F, -0.1448F);
        this.leftleg1.addChild(upperleg5_r1);
        this.setRotateAngle(upperleg5_r1, -0.0349F, 0.0F, 0.0F);
        this.upperleg5_r1.cubeList.add(new ModelBox(upperleg5_r1, 16, 44, -1.1645F, -4.2167F, -0.7295F, 1, 4, 1, -0.3F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0266F, 5.7318F, 0.1798F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 1.3758F, 0.0046F, 0.2975F);


        this.leg6_r1 = new ModelRenderer(this);
        this.leg6_r1.setRotationPoint(-0.0885F, 2.7638F, 0.2437F);
        this.leftleg2.addChild(leg6_r1);
        this.setRotateAngle(leg6_r1, 3.0543F, 0.0F, 3.1416F);
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 21, 36, -1.15F, -3.0F, -0.5F, 1, 7, 1, -0.3F, false));
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 26, 36, -0.3F, -3.0F, -0.5F, 1, 7, 1, -0.25F, false));

        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.1711F, 6.9929F, 0.8682F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.5765F, 0.0788F, -0.0263F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 26, 15, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

        this.leftlegwing2 = new ModelRenderer(this);
        this.leftlegwing2.setRotationPoint(-0.5385F, 1.2638F, 0.8437F);
        this.leftleg2.addChild(leftlegwing2);
        this.setRotateAngle(leftlegwing2, -0.0141F, 0.0F, 0.0F);


        this.leftlegwing1 = new ModelRenderer(this);
        this.leftlegwing1.setRotationPoint(-0.6039F, 0.0711F, 1.1119F);
        this.leftleg1.addChild(leftlegwing1);
        this.setRotateAngle(leftlegwing1, 0.1367F, 0.0F, 0.0F);


        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.7F, -0.35F, 3.9F);
        this.body1.addChild(rightleg1);
        this.setRotateAngle(rightleg1, -0.6068F, 0.0779F, 0.3481F);


        this.upperleg7_r1 = new ModelRenderer(this);
        this.upperleg7_r1.setRotationPoint(-0.1669F, 4.6413F, -0.0605F);
        this.rightleg1.addChild(upperleg7_r1);
        this.setRotateAngle(upperleg7_r1, 0.2007F, 0.0F, 0.0F);
        this.upperleg7_r1.cubeList.add(new ModelBox(upperleg7_r1, 0, 11, -0.5F, -1.8F, -0.5F, 1, 3, 1, -0.3F, true));

        this.upperleg6_r2 = new ModelRenderer(this);
        this.upperleg6_r2.setRotationPoint(-0.8606F, 3.7104F, -0.1448F);
        this.rightleg1.addChild(upperleg6_r2);
        this.setRotateAngle(upperleg6_r2, -0.0349F, 0.0F, 0.0F);
        this.upperleg6_r2.cubeList.add(new ModelBox(upperleg6_r2, 16, 44, 0.1645F, -4.2167F, -0.7295F, 1, 4, 1, -0.3F, true));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.0266F, 5.7318F, 0.1798F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 1.3504F, 0.0293F, -0.2234F);


        this.leg7_r1 = new ModelRenderer(this);
        this.leg7_r1.setRotationPoint(0.0885F, 2.7638F, 0.2437F);
        this.rightleg2.addChild(leg7_r1);
        this.setRotateAngle(leg7_r1, 3.0543F, 0.0F, -3.1416F);
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 21, 36, 0.15F, -3.0F, -0.5F, 1, 7, 1, -0.3F, true));
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 26, 36, -0.7F, -3.0F, -0.5F, 1, 7, 1, -0.25F, true));

        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.1711F, 6.9929F, 0.8682F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.3893F, -0.1293F, -0.0952F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 26, 15, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, true));

        this.rightlegwing2 = new ModelRenderer(this);
        this.rightlegwing2.setRotationPoint(0.5385F, 1.2638F, 0.8437F);
        this.rightleg2.addChild(rightlegwing2);
        this.setRotateAngle(rightlegwing2, -0.0141F, 0.0F, 0.0F);


        this.rightlegwing1 = new ModelRenderer(this);
        this.rightlegwing1.setRotationPoint(0.6039F, 0.0711F, 1.1119F);
        this.rightleg1.addChild(rightlegwing1);
        this.setRotateAngle(rightlegwing1, 0.1367F, 0.0F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.2925F, -3.1493F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, 0.2103F, 0.0413F, 0.0204F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.0F, 0.6734F, -2.4728F);
        this.neck1.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 0.1047F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 7, 32, 0.0F, -1.2113F, 1.9962F, 0, 1, 1, 0.0F, false));

        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, -0.1853F, -2.0641F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.0349F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 7, 32, 0.0F, -0.6F, -0.5F, 0, 1, 1, 0.0F, false));

        this.neck1_r1 = new ModelRenderer(this);
        this.neck1_r1.setRotationPoint(0.0F, 0.6734F, -2.4728F);
        this.neck1.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, -0.0262F, 0.0F, 0.0F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 32, 6, -0.5F, -1.1005F, -0.1095F, 1, 1, 3, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1207F, -2.5762F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3828F, -0.0835F, 0.0254F);
        this.neck2.cubeList.add(new ModelBox(neck2, 15, 29, -0.5F, -0.5F, -2.901F, 1, 1, 3, 0.003F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 18, 0.0F, -0.8F, -1.901F, 0, 1, 1, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0964F, -2.7411F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.3271F, -0.0305F, -0.0826F);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 0, 0.0F, -0.7036F, -1.0598F, 0, 1, 1, 0.0F, false));

        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.0F, 0.0929F, -3.8518F);
        this.neck3.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, 0.0349F, 0.0F, 0.0F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 26, 15, 0.0F, -0.6876F, 0.7874F, 0, 1, 1, 0.0F, false));
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 0, 18, -0.5F, -0.3876F, -0.2126F, 1, 1, 4, -0.01F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1852F, -3.8109F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.5358F, -0.129F, 0.0097F);


        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(-0.4985F, 0.6629F, -2.106F);
        this.head.addChild(head4_r1);
        this.setRotateAngle(head4_r1, -0.5323F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 0, 45, -0.5F, -1.9214F, -0.0179F, 2, 2, 1, 0.003F, false));

        this.head4_r2 = new ModelRenderer(this);
        this.head4_r2.setRotationPoint(-0.4985F, -0.71F, -0.963F);
        this.head.addChild(head4_r2);
        this.setRotateAngle(head4_r2, -1.6144F, 0.0F, 0.0F);
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 37, 17, -0.5F, -0.3F, -0.8F, 2, 1, 2, 0.001F, false));

        this.head4_r3 = new ModelRenderer(this);
        this.head4_r3.setRotationPoint(-0.4985F, 0.2629F, -1.606F);
        this.head.addChild(head4_r3);
        this.setRotateAngle(head4_r3, -0.0436F, 0.0F, 0.0F);
        this.head4_r3.cubeList.add(new ModelBox(head4_r3, 31, 37, -0.5F, -1.5F, 0.1F, 2, 1, 2, 0.002F, false));
        this.head4_r3.cubeList.add(new ModelBox(head4_r3, 38, 3, -0.5F, -1.8F, 0.1F, 2, 1, 2, 0.004F, false));

        this.head3_r1 = new ModelRenderer(this);
        this.head3_r1.setRotationPoint(0.0015F, -1.5971F, 1.5169F);
        this.head.addChild(head3_r1);
        this.setRotateAngle(head3_r1, -1.6581F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 0, 30, -0.4982F, -1.916F, -0.9089F, 1, 4, 2, -0.3F, false));

        this.head2_r1 = new ModelRenderer(this);
        this.head2_r1.setRotationPoint(-0.4985F, -0.4903F, -0.911F);
        this.head.addChild(head2_r1);
        this.setRotateAngle(head2_r1, -1.0036F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 45, 0, -0.5F, -1.0F, 0.0F, 2, 2, 1, -0.003F, false));

        this.head3_r2 = new ModelRenderer(this);
        this.head3_r2.setRotationPoint(0.0015F, -2.0062F, -1.2989F);
        this.head.addChild(head3_r2);
        this.setRotateAngle(head3_r2, 0.0349F, 0.0F, 0.0F);
        this.head3_r2.cubeList.add(new ModelBox(head3_r2, 10, 37, -0.5F, -1.5785F, -0.0968F, 1, 2, 1, 0.0F, false));

        this.head3_r3 = new ModelRenderer(this);
        this.head3_r3.setRotationPoint(0.0015F, -2.5062F, 2.2011F);
        this.head.addChild(head3_r3);
        this.setRotateAngle(head3_r3, -0.6283F, 0.0F, 0.0F);
        this.head3_r3.cubeList.add(new ModelBox(head3_r3, 0, 0, -0.5F, -0.0753F, -2.2143F, 1, 2, 3, -0.3F, false));

        this.head2_r2 = new ModelRenderer(this);
        this.head2_r2.setRotationPoint(0.0015F, -3.6062F, -0.4989F);
        this.head.addChild(head2_r2);
        this.setRotateAngle(head2_r2, -0.4014F, 0.0F, 0.0F);
        this.head2_r2.cubeList.add(new ModelBox(head2_r2, 20, 0, -0.5F, -0.0222F, -0.0196F, 1, 2, 2, 0.003F, false));

        this.head2_r3 = new ModelRenderer(this);
        this.head2_r3.setRotationPoint(-0.0015F, -1.8062F, -2.6989F);
        this.head.addChild(head2_r3);
        this.setRotateAngle(head2_r3, -0.0175F, 0.0F, 0.0F);
        this.head2_r3.cubeList.add(new ModelBox(head2_r3, 44, 43, -0.8F, -0.4276F, 1.3206F, 1, 1, 2, 0.0F, true));
        this.head2_r3.cubeList.add(new ModelBox(head2_r3, 44, 43, -0.197F, -0.4276F, 1.3206F, 1, 1, 2, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0015F, 1.1923F, -1.9163F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5061F, 0.0009F, 0.0001F);


        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(-1.003F, 0.3617F, -0.3214F);
        this.jaw.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, -0.1658F, 0.0F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 35, 45, -0.2F, -0.7F, -1.0F, 1, 1, 2, -0.2F, true));
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 35, 45, 1.203F, -0.7F, -1.0F, 1, 1, 2, -0.2F, false));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.3922F, 0.2973F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.0456F, 0.0F, 0.0F);


        this.jaw3_r2 = new ModelRenderer(this);
        this.jaw3_r2.setRotationPoint(-0.003F, -0.5F, -1.3F);
        this.jaw2.addChild(jaw3_r2);
        this.setRotateAngle(jaw3_r2, 0.0175F, 0.0F, 0.0F);
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 7, 26, -1.0F, -0.2307F, -3.8057F, 1, 1, 4, -0.2F, true));
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 7, 26, 0.003F, -0.2307F, -3.8057F, 1, 1, 4, -0.2F, false));

        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -1.1F, -2.75F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.2353F, 0.0F, 0.0F);


        this.jaw5 = new ModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 0.6F, -3.0F);
        this.jaw3.addChild(jaw5);
        this.setRotateAngle(jaw5, 0.0454F, 0.0F, 0.0F);


        this.jaw8_r1 = new ModelRenderer(this);
        this.jaw8_r1.setRotationPoint(0.0F, -0.875F, -3.1389F);
        this.jaw5.addChild(jaw8_r1);
        this.setRotateAngle(jaw8_r1, -0.5323F, 0.0F, 0.0F);
        this.jaw8_r1.cubeList.add(new ModelBox(jaw8_r1, 45, 5, -0.5F, -0.6069F, -1.5702F, 1, 1, 2, -0.3F, false));

        this.jaw7_r1 = new ModelRenderer(this);
        this.jaw7_r1.setRotationPoint(0.0F, -1.575F, -3.6389F);
        this.jaw5.addChild(jaw7_r1);
        this.setRotateAngle(jaw7_r1, -0.288F, 0.0F, 0.0F);
        this.jaw7_r1.cubeList.add(new ModelBox(jaw7_r1, 7, 45, -0.5F, -0.3169F, -0.4035F, 1, 1, 2, -0.3F, false));

        this.jaw6_r1 = new ModelRenderer(this);
        this.jaw6_r1.setRotationPoint(0.0F, -1.875F, -5.0389F);
        this.jaw5.addChild(jaw6_r1);
        this.setRotateAngle(jaw6_r1, -0.4102F, 0.0F, 0.0F);
        this.jaw6_r1.cubeList.add(new ModelBox(jaw6_r1, 34, 12, -0.5F, -0.6F, -1.3F, 1, 1, 3, -0.3F, false));

        this.jaw6_r2 = new ModelRenderer(this);
        this.jaw6_r2.setRotationPoint(0.3F, -1.3145F, -3.1034F);
        this.jaw5.addChild(jaw6_r2);
        this.setRotateAngle(jaw6_r2, -0.4189F, 0.0F, 0.0F);
        this.jaw6_r2.cubeList.add(new ModelBox(jaw6_r2, 24, 3, -0.8F, -0.3072F, -0.1752F, 1, 1, 4, -0.21F, false));

        this.jaw5_r1 = new ModelRenderer(this);
        this.jaw5_r1.setRotationPoint(0.3F, -1.3145F, -3.1034F);
        this.jaw5.addChild(jaw5_r1);
        this.setRotateAngle(jaw5_r1, -0.2356F, 0.0F, 0.0F);
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 14, 22, -0.8F, -0.2635F, 0.2055F, 1, 1, 4, -0.2F, false));

        this.shape64 = new ModelRenderer(this);
        this.shape64.setRotationPoint(0.0F, -0.1256F, -1.9026F);
        this.jaw5.addChild(shape64);
        this.setRotateAngle(shape64, -1.4114F, 0.0F, 0.0F);


        this.underneck3 = new ModelRenderer(this);
        this.underneck3.setRotationPoint(0.0F, 0.7922F, -2.9027F);
        this.jaw.addChild(underneck3);
        this.setRotateAngle(underneck3, -0.2246F, 0.0F, 0.0F);


        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.6922F, -1.1027F);
        this.jaw.addChild(gums1);
        this.setRotateAngle(gums1, -0.055F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0015F, -0.6077F, -2.9163F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, -0.0456F, 0.0F, 0.0F);


        this.head2_r4 = new ModelRenderer(this);
        this.head2_r4.setRotationPoint(0.0F, 1.7F, 1.0F);
        this.head2.addChild(head2_r4);
        this.setRotateAngle(head2_r4, 0.0436F, 0.0F, 0.0F);
        this.head2_r4.cubeList.add(new ModelBox(head2_r4, 0, 11, -1.0F, -0.9858F, -4.6221F, 2, 1, 5, -0.2F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.4F, -7.5F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1367F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -0.66F, 4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.0948F, 0.0F, 0.0F);


        this.head8_r1 = new ModelRenderer(this);
        this.head8_r1.setRotationPoint(0.0F, 0.9315F, -3.1556F);
        this.head5.addChild(head8_r1);
        this.setRotateAngle(head8_r1, 0.4189F, 0.0F, 0.0F);
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 0, 24, -0.5F, -0.3863F, -1.929F, 1, 1, 4, -0.2F, false));

        this.head8_r2 = new ModelRenderer(this);
        this.head8_r2.setRotationPoint(0.0F, 0.9941F, -2.0653F);
        this.head5.addChild(head8_r2);
        this.setRotateAngle(head8_r2, 0.2443F, -0.0005F, -0.0002F);
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 28, 45, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.2F, false));

        this.head7_r1 = new ModelRenderer(this);
        this.head7_r1.setRotationPoint(0.0F, 1.8315F, -3.1556F);
        this.head5.addChild(head7_r1);
        this.setRotateAngle(head7_r1, 0.1396F, 0.0F, 0.0F);
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 21, 24, -0.5F, -0.7775F, -0.5037F, 1, 1, 4, -0.2F, false));

        this.head7_r2 = new ModelRenderer(this);
        this.head7_r2.setRotationPoint(0.0F, 0.8315F, -3.2556F);
        this.head5.addChild(head7_r2);
        this.setRotateAngle(head7_r2, 0.3665F, -0.0002F, -0.0001F);
        this.head7_r2.cubeList.add(new ModelBox(head7_r2, 24, 9, -0.5007F, -0.3412F, -3.0295F, 1, 1, 4, -0.3F, false));

        this.head6_r1 = new ModelRenderer(this);
        this.head6_r1.setRotationPoint(0.0F, 2.3315F, -7.0556F);
        this.head5.addChild(head6_r1);
        this.setRotateAngle(head6_r1, 0.1047F, -0.0002F, -0.0001F);
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 10, 13, -0.5F, -0.7671F, -0.3728F, 1, 1, 5, -0.3F, false));

        this.lips1 = new ModelRenderer(this);
        this.lips1.setRotationPoint(-0.85F, 0.1F, 3.9F);
        this.head3.addChild(lips1);
        this.setRotateAngle(lips1, 0.0025F, -0.0138F, 0.2732F);


        this.lips2 = new ModelRenderer(this);
        this.lips2.setRotationPoint(0.85F, 0.1F, 3.9F);
        this.head3.addChild(lips2);
        this.setRotateAngle(lips2, 0.0025F, 0.0138F, -0.2732F);


        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.1559F, 0.0F, 0.0F);


        this.head16_r1 = new ModelRenderer(this);
        this.head16_r1.setRotationPoint(0.0F, -1.75F, 2.3F);
        this.head4.addChild(head16_r1);
        this.setRotateAngle(head16_r1, 0.0349F, 0.0F, 0.0F);
        this.head16_r1.cubeList.add(new ModelBox(head16_r1, 45, 31, -0.5F, -0.1996F, -1.7965F, 1, 1, 2, -0.2F, false));

        this.head15_r1 = new ModelRenderer(this);
        this.head15_r1.setRotationPoint(0.0F, -1.45F, 3.9F);
        this.head4.addChild(head15_r1);
        this.setRotateAngle(head15_r1, -0.1745F, 0.0F, 0.0F);
        this.head15_r1.cubeList.add(new ModelBox(head15_r1, 21, 45, -0.5F, -0.2172F, -1.8243F, 1, 1, 2, -0.2F, false));

        this.head14_r1 = new ModelRenderer(this);
        this.head14_r1.setRotationPoint(0.0F, -0.25F, 4.9F);
        this.head4.addChild(head14_r1);
        this.setRotateAngle(head14_r1, -0.8378F, 0.0F, 0.0F);
        this.head14_r1.cubeList.add(new ModelBox(head14_r1, 17, 7, -0.5F, -0.277F, -1.7852F, 1, 1, 4, -0.2F, false));

        this.head13_r1 = new ModelRenderer(this);
        this.head13_r1.setRotationPoint(0.0F, -0.55F, 3.4F);
        this.head4.addChild(head13_r1);
        this.setRotateAngle(head13_r1, -0.5411F, 0.0F, 0.0F);
        this.head13_r1.cubeList.add(new ModelBox(head13_r1, 31, 41, -0.5F, -0.7924F, -0.3449F, 1, 1, 2, -0.2F, false));

        this.head12_r1 = new ModelRenderer(this);
        this.head12_r1.setRotationPoint(0.0F, -1.15F, 1.8F);
        this.head4.addChild(head12_r1);
        this.setRotateAngle(head12_r1, -0.3491F, 0.0F, 0.0F);
        this.head12_r1.cubeList.add(new ModelBox(head12_r1, 43, 27, -0.5F, -0.7758F, -0.1362F, 1, 1, 2, -0.2F, false));

        this.head11_r1 = new ModelRenderer(this);
        this.head11_r1.setRotationPoint(0.0F, -1.15F, 0.6F);
        this.head4.addChild(head11_r1);
        this.setRotateAngle(head11_r1, 0.0175F, 0.0F, 0.0F);
        this.head11_r1.cubeList.add(new ModelBox(head11_r1, 44, 15, -0.5F, -0.7549F, -0.3364F, 1, 1, 2, -0.2F, false));

        this.head10_r1 = new ModelRenderer(this);
        this.head10_r1.setRotationPoint(0.0F, -1.25F, -1.1F);
        this.head4.addChild(head10_r1);
        this.setRotateAngle(head10_r1, 0.2443F, 0.0F, 0.0F);
        this.head10_r1.cubeList.add(new ModelBox(head10_r1, 45, 37, -0.5F, -0.2466F, -0.1111F, 1, 1, 2, -0.2F, false));

        this.head9_r1 = new ModelRenderer(this);
        this.head9_r1.setRotationPoint(0.0F, -0.05F, -3.2F);
        this.head4.addChild(head9_r1);
        this.setRotateAngle(head9_r1, 0.5411F, 0.0F, 0.0F);
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 35, 24, -0.5F, -0.1936F, -0.293F, 1, 1, 3, -0.2F, false));

        this.head8_r3 = new ModelRenderer(this);
        this.head8_r3.setRotationPoint(0.0F, 1.15F, -5.6F);
        this.head4.addChild(head8_r3);
        this.setRotateAngle(head8_r3, 0.4712F, 0.0F, 0.0F);
        this.head8_r3.cubeList.add(new ModelBox(head8_r3, 7, 32, -0.5F, -0.1732F, -0.1098F, 1, 1, 3, -0.2F, false));

        this.head6_r2 = new ModelRenderer(this);
        this.head6_r2.setRotationPoint(0.0F, 1.2843F, 0.7186F);
        this.head4.addChild(head6_r2);
        this.setRotateAngle(head6_r2, -0.9425F, 0.0016F, -0.0001F);
        this.head6_r2.cubeList.add(new ModelBox(head6_r2, 40, 10, -1.001F, -0.7693F, -0.1713F, 2, 3, 1, -0.11F, false));

        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(0.0F, 0.3843F, 1.4186F);
        this.head4.addChild(head5_r1);
        this.setRotateAngle(head5_r1, -0.6807F, 0.0016F, -0.0001F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 39, 40, -0.9999F, -0.2293F, -0.0489F, 2, 3, 1, -0.1F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0015F, 0.4505F, -0.3119F);
        this.head.addChild(bone);


        this.head7_r3 = new ModelRenderer(this);
        this.head7_r3.setRotationPoint(-0.923F, -0.2933F, -0.8305F);
        this.bone.addChild(head7_r3);
        this.setRotateAngle(head7_r3, -1.0647F, 0.0F, 0.0F);
        this.head7_r3.cubeList.add(new ModelBox(head7_r3, 47, 9, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.4F, true));
        this.head7_r3.cubeList.add(new ModelBox(head7_r3, 47, 9, 1.343F, -1.0F, -0.5F, 1, 2, 1, -0.4F, false));

        this.head7_r4 = new ModelRenderer(this);
        this.head7_r4.setRotationPoint(-0.7933F, -1.7056F, -1.2994F);
        this.bone.addChild(head7_r4);
        this.setRotateAngle(head7_r4, -1.4486F, 0.0F, 0.0F);
        this.head7_r4.cubeList.add(new ModelBox(head7_r4, 28, 24, -0.3897F, -0.8085F, -0.2382F, 1, 1, 1, -0.175F, true));
        this.head7_r4.cubeList.add(new ModelBox(head7_r4, 28, 24, 0.9733F, -0.8085F, -0.2382F, 1, 1, 1, -0.175F, false));

        this.head6_r3 = new ModelRenderer(this);
        this.head6_r3.setRotationPoint(-0.7933F, -1.1056F, -1.2994F);
        this.bone.addChild(head6_r3);
        this.setRotateAngle(head6_r3, -0.5672F, 0.0F, 0.0F);
        this.head6_r3.cubeList.add(new ModelBox(head6_r3, 18, 13, -0.3897F, -0.7145F, -0.5606F, 1, 2, 1, -0.17F, true));
        this.head6_r3.cubeList.add(new ModelBox(head6_r3, 18, 13, 0.9733F, -0.7145F, -0.5606F, 1, 2, 1, -0.17F, false));

        this.head8_r4 = new ModelRenderer(this);
        this.head8_r4.setRotationPoint(-0.7933F, -1.8056F, -0.6994F);
        this.bone.addChild(head8_r4);
        this.setRotateAngle(head8_r4, -2.5133F, -0.0049F, 0.0016F);
        this.head8_r4.cubeList.add(new ModelBox(head8_r4, 27, 0, -0.3897F, -0.8007F, -0.2121F, 1, 1, 1, -0.17F, true));

        this.head7_r5 = new ModelRenderer(this);
        this.head7_r5.setRotationPoint(-0.7933F, -0.2056F, -2.2994F);
        this.bone.addChild(head7_r5);
        this.setRotateAngle(head7_r5, -1.0734F, 0.0F, 0.0F);
        this.head7_r5.cubeList.add(new ModelBox(head7_r5, 12, 0, -0.4097F, -2.4595F, -0.4865F, 1, 2, 1, -0.18F, true));
        this.head7_r5.cubeList.add(new ModelBox(head7_r5, 12, 0, 0.9933F, -2.4595F, -0.4865F, 1, 2, 1, -0.18F, false));

        this.head7_r6 = new ModelRenderer(this);
        this.head7_r6.setRotationPoint(-0.7933F, -1.1056F, -1.2994F);
        this.bone.addChild(head7_r6);
        this.setRotateAngle(head7_r6, -0.829F, 0.0F, 0.0F);
        this.head7_r6.cubeList.add(new ModelBox(head7_r6, 37, 0, -0.4497F, -0.7127F, -0.4739F, 1, 1, 1, -0.2F, true));
        this.head7_r6.cubeList.add(new ModelBox(head7_r6, 47, 24, -0.6097F, -0.7127F, -0.4739F, 1, 1, 1, -0.35F, true));
        this.head7_r6.cubeList.add(new ModelBox(head7_r6, 37, 0, 1.0333F, -0.7127F, -0.4739F, 1, 1, 1, -0.2F, false));
        this.head7_r6.cubeList.add(new ModelBox(head7_r6, 47, 24, 1.1933F, -0.7127F, -0.4739F, 1, 1, 1, -0.35F, false));

        this.head7_r7 = new ModelRenderer(this);
        this.head7_r7.setRotationPoint(0.7903F, -1.8056F, -0.6994F);
        this.bone.addChild(head7_r7);
        this.setRotateAngle(head7_r7, -2.5133F, 0.0049F, -0.0016F);
        this.head7_r7.cubeList.add(new ModelBox(head7_r7, 27, 0, -0.6103F, -0.8007F, -0.2121F, 1, 1, 1, -0.17F, false));

        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(bone2);


        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.4F, 0.0F, -2.4F);
        this.chest1.addChild(leftwing1);
        this.setRotateAngle(leftwing1, 0.1127F, 0.0863F, 0.1107F);


        this.upperwing8_r1 = new ModelRenderer(this);
        this.upperwing8_r1.setRotationPoint(1.0746F, 0.0368F, 0.2605F);
        this.leftwing1.addChild(upperwing8_r1);
        this.setRotateAngle(upperwing8_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 0, 6, -0.25F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 46, 19, -1.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(3.7549F, 0.1825F, 0.4233F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.8279F, 1.0975F, -2.1558F);


        this.wing10_r1 = new ModelRenderer(this);
        this.wing10_r1.setRotationPoint(0.4534F, 1.8204F, -0.2518F);
        this.leftwing2.addChild(wing10_r1);
        this.setRotateAngle(wing10_r1, 0.0F, 0.0F, 0.0F);
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 0, 37, -0.9072F, -1.9026F, -0.7631F, 1, 6, 1, -0.2F, false));
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 5, 37, -0.9072F, -1.9026F, 0.0369F, 1, 6, 1, -0.15F, false));

        this.wing8_r1 = new ModelRenderer(this);
        this.wing8_r1.setRotationPoint(0.4534F, 1.8204F, -0.2518F);
        this.leftwing2.addChild(wing8_r1);
        this.setRotateAngle(wing8_r1, 0.0F, -1.5708F, 0.4974F);
        this.wing8_r1.cubeList.add(new ModelBox(wing8_r1, 10, 11, -0.3631F, 0.5633F, -2.1225F, 1, 3, 1, -0.21F, false));

        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.0869F, 5.8009F, 0.3333F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.3244F, 0.1557F, 0.4534F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 16, 34, -0.3607F, -0.1869F, -0.8325F, 1, 7, 1, -0.11F, false));

        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(0.3159F, 6.5818F, -0.136F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 0.6957F, -0.5083F, -0.3684F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 0, 0, -0.5799F, -0.5164F, -0.654F, 1, 1, 9, -0.2F, false));

        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.0678F, 0.2873F, 8.3099F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.1758F, 0.162F, 0.2337F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 19, 16, -0.4714F, -0.8024F, -0.3117F, 1, 1, 4, -0.2F, false));

        this.wingfinger9_r1 = new ModelRenderer(this);
        this.wingfinger9_r1.setRotationPoint(0.0286F, 0.1976F, 5.0883F);
        this.leftwing5.addChild(wingfinger9_r1);
        this.setRotateAngle(wingfinger9_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger9_r1.cubeList.add(new ModelBox(wingfinger9_r1, 12, 0, -0.4F, -1.3F, -1.8F, 1, 1, 5, -0.2F, false));

        this.leftwing6 = new ModelRenderer(this);
        this.leftwing6.setRotationPoint(-0.0799F, 0.4836F, 8.346F);
        this.leftwing4.addChild(leftwing6);
        this.setRotateAngle(leftwing6, 0.0594F, 0.0781F, 0.2095F);


        this.leftwing5membrance2 = new ModelRenderer(this);
        this.leftwing5membrance2.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.leftwing6.addChild(leftwing5membrance2);


        this.lefthand2 = new ModelRenderer(this);
        this.lefthand2.setRotationPoint(0.0413F, -0.1155F, 0.5237F);
        this.leftwing4.addChild(lefthand2);
        this.setRotateAngle(lefthand2, -2.0913F, 0.5531F, -1.3916F);
        this.lefthand2.cubeList.add(new ModelBox(lefthand2, 36, 30, -1.0495F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

        this.leftwing4membrance = new ModelRenderer(this);
        this.leftwing4membrance.setRotationPoint(-12.2799F, 3.7836F, 3.946F);
        this.leftwing4.addChild(leftwing4membrance);


        this.leftwing3membrance = new ModelRenderer(this);
        this.leftwing3membrance.setRotationPoint(1.0649F, -0.8826F, 0.8782F);
        this.leftwing2.addChild(leftwing3membrance);


        this.leftwing1membrance = new ModelRenderer(this);
        this.leftwing1membrance.setRotationPoint(1.3496F, 0.2368F, 2.9355F);
        this.leftwing1.addChild(leftwing1membrance);
        this.setRotateAngle(leftwing1membrance, 0.0021F, -0.3752F, -0.0093F);


        this.rightwing1 = new ModelRenderer(this);
        this.rightwing1.setRotationPoint(-2.4F, 0.0F, -2.4F);
        this.chest1.addChild(rightwing1);
        this.setRotateAngle(rightwing1, 0.1294F, 0.0426F, -0.0951F);


        this.upperwing9_r1 = new ModelRenderer(this);
        this.upperwing9_r1.setRotationPoint(-1.0746F, 0.0368F, 0.2605F);
        this.rightwing1.addChild(upperwing9_r1);
        this.setRotateAngle(upperwing9_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 0, 6, -2.75F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 46, 19, 0.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-3.7549F, 0.1825F, 0.4233F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -1.8279F, -1.0975F, 2.1558F);


        this.wing11_r1 = new ModelRenderer(this);
        this.wing11_r1.setRotationPoint(-0.4534F, 1.8204F, -0.2518F);
        this.rightwing2.addChild(wing11_r1);
        this.setRotateAngle(wing11_r1, 0.0F, 0.0F, 0.0F);
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 0, 37, -0.0928F, -1.9026F, -0.7631F, 1, 6, 1, -0.2F, true));
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 5, 37, -0.0928F, -1.9026F, 0.0369F, 1, 6, 1, -0.15F, true));

        this.wing9_r1 = new ModelRenderer(this);
        this.wing9_r1.setRotationPoint(-0.4534F, 1.8204F, -0.2518F);
        this.rightwing2.addChild(wing9_r1);
        this.setRotateAngle(wing9_r1, 0.0F, 1.5708F, -0.4974F);
        this.wing9_r1.cubeList.add(new ModelBox(wing9_r1, 10, 11, -0.6369F, 0.5633F, -2.1225F, 1, 3, 1, -0.21F, true));

        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.0869F, 5.8009F, 0.3333F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.3244F, -0.1557F, -0.4534F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 16, 34, -0.6393F, -0.1869F, -0.8325F, 1, 7, 1, -0.11F, true));

        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(-0.3159F, 6.5818F, -0.136F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 0.6957F, 0.5083F, 0.3684F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 0, 0, -0.4201F, -0.5164F, -0.654F, 1, 1, 9, -0.2F, true));

        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.0678F, 0.2873F, 8.3099F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.1758F, -0.162F, -0.2337F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 19, 16, -0.5286F, -0.8024F, -0.3117F, 1, 1, 4, -0.2F, true));

        this.wingfinger10_r1 = new ModelRenderer(this);
        this.wingfinger10_r1.setRotationPoint(-0.0286F, 0.1976F, 5.0883F);
        this.rightwing5.addChild(wingfinger10_r1);
        this.setRotateAngle(wingfinger10_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger10_r1.cubeList.add(new ModelBox(wingfinger10_r1, 12, 0, -0.6F, -1.3F, -1.8F, 1, 1, 5, -0.2F, true));

        this.rightwing6 = new ModelRenderer(this);
        this.rightwing6.setRotationPoint(0.0799F, 0.4836F, 8.346F);
        this.rightwing4.addChild(rightwing6);
        this.setRotateAngle(rightwing6, 0.0594F, -0.0781F, -0.2095F);


        this.rightwing5membrance2 = new ModelRenderer(this);
        this.rightwing5membrance2.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.rightwing6.addChild(rightwing5membrance2);


        this.righthand2 = new ModelRenderer(this);
        this.righthand2.setRotationPoint(-0.0413F, -0.1155F, 0.5237F);
        this.rightwing4.addChild(righthand2);
        this.setRotateAngle(righthand2, -2.0913F, -0.5531F, 1.3916F);
        this.righthand2.cubeList.add(new ModelBox(righthand2, 36, 30, -0.9505F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, true));

        this.rightwing4membrance = new ModelRenderer(this);
        this.rightwing4membrance.setRotationPoint(12.2799F, 3.7836F, 3.946F);
        this.rightwing4.addChild(rightwing4membrance);


        this.rightwing3membrance = new ModelRenderer(this);
        this.rightwing3membrance.setRotationPoint(-1.0649F, -0.8826F, 0.8782F);
        this.rightwing2.addChild(rightwing3membrance);


        this.rightwing1membrance = new ModelRenderer(this);
        this.rightwing1membrance.setRotationPoint(-1.3496F, 0.2368F, 2.9355F);
        this.rightwing1.addChild(rightwing1membrance);
        this.setRotateAngle(rightwing1membrance, 0.0021F, 0.3752F, 0.0093F);

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
