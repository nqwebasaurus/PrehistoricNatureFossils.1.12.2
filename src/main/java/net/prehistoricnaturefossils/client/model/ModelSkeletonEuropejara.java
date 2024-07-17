package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEuropejara extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer chest1;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer chest5_r1;
    private final ModelRenderer chest4_r1;
    private final ModelRenderer chest4_r2;
    private final ModelRenderer chest3_r2;
    private final ModelRenderer chest6_r1;
    private final ModelRenderer chest5_r2;
    private final ModelRenderer chest4_r3;
    private final ModelRenderer chest5_r3;
    private final ModelRenderer chest4_r4;
    private final ModelRenderer chest4_r5;
    private final ModelRenderer chest3_r3;
    private final ModelRenderer chest2_r2;
    private final ModelRenderer chest5_r4;
    private final ModelRenderer body1;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body4_r1;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body7_r1;
    private final ModelRenderer body6_r2;
    private final ModelRenderer body5_r2;
    private final ModelRenderer body6_r3;
    private final ModelRenderer body3_r2;
    private final ModelRenderer body4_r2;
    private final ModelRenderer body5_r3;
    private final ModelRenderer body4_r3;
    private final ModelRenderer chest6_r2;
    private final ModelRenderer chest5_r5;
    private final ModelRenderer tail1;
    private final ModelRenderer leftleg1;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leg6_r1;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftlegwing2;
    private final ModelRenderer leftlegwing1;
    private final ModelRenderer rightleg1;
    private final ModelRenderer rightleg2;
    private final ModelRenderer leg7_r1;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightlegwing2;
    private final ModelRenderer rightlegwing1;
    private final ModelRenderer neck1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck1_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer head;
    private final ModelRenderer head9_r1;
    private final ModelRenderer head10_r1;
    private final ModelRenderer head11_r1;
    private final ModelRenderer head9_r2;
    private final ModelRenderer head8_r1;
    private final ModelRenderer head8_r2;
    private final ModelRenderer head6_r1;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head4_r2;
    private final ModelRenderer head4_r3;
    private final ModelRenderer head3_r1;
    private final ModelRenderer head2_r1;
    private final ModelRenderer head1_r1;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw5;
    private final ModelRenderer jaw6_r1;
    private final ModelRenderer jaw5_r1;
    private final ModelRenderer shape64;
    private final ModelRenderer jaw4;
    private final ModelRenderer jaw9_r1;
    private final ModelRenderer jaw7_r1;
    private final ModelRenderer jaw6_r2;
    private final ModelRenderer jaw5_r2;
    private final ModelRenderer jaw4_r1;
    private final ModelRenderer underneck3;
    private final ModelRenderer gums1;
    private final ModelRenderer head2;
    private final ModelRenderer head2_r2;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer head6_r2;
    private final ModelRenderer lips1;
    private final ModelRenderer lips2;
    private final ModelRenderer head4;
    private final ModelRenderer head8_r3;
    private final ModelRenderer head6_r3;
    private final ModelRenderer head5_r1;
    private final ModelRenderer head4_r4;
    private final ModelRenderer crest1;
    private final ModelRenderer crest4_r1;
    private final ModelRenderer crest3_r1;
    private final ModelRenderer crest3_r2;
    private final ModelRenderer crest2_r1;
    private final ModelRenderer crest2;
    private final ModelRenderer bone;
    private final ModelRenderer head7_r1;
    private final ModelRenderer head6_r4;
    private final ModelRenderer head7_r2;
    private final ModelRenderer head7_r3;
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

    public ModelSkeletonEuropejara() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -9.25F, 0.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);


        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, 0.025F, -0.5694F);
        this.root.addChild(chest1);
        this.setRotateAngle(chest1, -0.3623F, 0.0F, 0.0F);


        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(0.0F, -1.0503F, -0.3905F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, 0.0698F, 0.0F, 0.0F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 19, 45, 0.0F, -0.3F, -0.5F, 0, 1, 1, 0.0F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, -0.4F, -1.3F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.1571F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 20, 14, 0.0F, -1.0F, -1.5F, 0, 1, 1, 0.0F, false));
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 30, 10, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.003F, false));

        this.chest5_r1 = new ModelRenderer(this);
        this.chest5_r1.setRotationPoint(-2.2F, -0.6963F, -2.8469F);
        this.chest1.addChild(chest5_r1);
        this.setRotateAngle(chest5_r1, 1.9477F, 0.6105F, -0.2383F);
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 6, 32, -0.6197F, -0.6653F, -2.8318F, 1, 1, 3, -0.2F, true));

        this.chest4_r1 = new ModelRenderer(this);
        this.chest4_r1.setRotationPoint(-1.0F, -0.6963F, -1.3469F);
        this.chest1.addChild(chest4_r1);
        this.setRotateAngle(chest4_r1, 0.1767F, 0.4736F, 0.0813F);
        this.chest4_r1.cubeList.add(new ModelBox(chest4_r1, 30, 16, -1.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, true));

        this.chest4_r2 = new ModelRenderer(this);
        this.chest4_r2.setRotationPoint(2.2F, -0.6963F, -2.8469F);
        this.chest1.addChild(chest4_r2);
        this.setRotateAngle(chest4_r2, 1.9477F, -0.6105F, 0.2383F);
        this.chest4_r2.cubeList.add(new ModelBox(chest4_r2, 6, 32, -0.3803F, -0.6653F, -2.8318F, 1, 1, 3, -0.2F, false));

        this.chest3_r2 = new ModelRenderer(this);
        this.chest3_r2.setRotationPoint(1.0F, -0.6963F, -1.3469F);
        this.chest1.addChild(chest3_r2);
        this.setRotateAngle(chest3_r2, 0.1767F, -0.4736F, -0.0813F);
        this.chest3_r2.cubeList.add(new ModelBox(chest3_r2, 30, 16, 0.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, false));

        this.chest6_r1 = new ModelRenderer(this);
        this.chest6_r1.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest6_r1);
        this.setRotateAngle(chest6_r1, 0.1426F, 0.2093F, -1.3024F);
        this.chest6_r1.cubeList.add(new ModelBox(chest6_r1, 26, 10, -2.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest5_r2 = new ModelRenderer(this);
        this.chest5_r2.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r2);
        this.setRotateAngle(chest5_r2, 0.2362F, 0.0906F, -0.6958F);
        this.chest5_r2.cubeList.add(new ModelBox(chest5_r2, 45, 23, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest4_r3 = new ModelRenderer(this);
        this.chest4_r3.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r3);
        this.setRotateAngle(chest4_r3, 0.3904F, 0.1198F, -0.6404F);
        this.chest4_r3.cubeList.add(new ModelBox(chest4_r3, 23, 28, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest5_r3 = new ModelRenderer(this);
        this.chest5_r3.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest5_r3);
        this.setRotateAngle(chest5_r3, 0.2567F, 0.3201F, -1.2334F);
        this.chest5_r3.cubeList.add(new ModelBox(chest5_r3, 35, 6, -1.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest4_r4 = new ModelRenderer(this);
        this.chest4_r4.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest4_r4);
        this.setRotateAngle(chest4_r4, 0.2362F, -0.0906F, 0.6958F);
        this.chest4_r4.cubeList.add(new ModelBox(chest4_r4, 45, 23, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest4_r5 = new ModelRenderer(this);
        this.chest4_r5.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r5);
        this.setRotateAngle(chest4_r5, 0.2567F, -0.3201F, 1.2334F);
        this.chest4_r5.cubeList.add(new ModelBox(chest4_r5, 35, 6, 0.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest3_r3 = new ModelRenderer(this);
        this.chest3_r3.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest3_r3);
        this.setRotateAngle(chest3_r3, 0.3904F, -0.1198F, 0.6404F);
        this.chest3_r3.cubeList.add(new ModelBox(chest3_r3, 23, 28, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest2_r2 = new ModelRenderer(this);
        this.chest2_r2.setRotationPoint(0.0F, 1.2791F, -1.0341F);
        this.chest1.addChild(chest2_r2);
        this.setRotateAngle(chest2_r2, -0.1571F, 0.0F, 0.0F);
        this.chest2_r2.cubeList.add(new ModelBox(chest2_r2, 20, 14, -1.5F, -0.3F, -1.5F, 3, 1, 3, 0.0F, false));

        this.chest5_r4 = new ModelRenderer(this);
        this.chest5_r4.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r4);
        this.setRotateAngle(chest5_r4, 0.1426F, -0.2093F, 1.3024F);
        this.chest5_r4.cubeList.add(new ModelBox(chest5_r4, 26, 10, 0.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.chest1.addChild(body1);
        this.setRotateAngle(body1, -0.1367F, 0.0F, 0.0F);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -0.9744F, 4.4978F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.1658F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 6, 0, 0.0F, -0.2F, -0.5F, 0, 1, 1, 0.0F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -1.1F, 0.9F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0349F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 14, 11, 0.0F, -0.5F, 1.1F, 0, 1, 1, 0.0F, false));
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 21, 0, -0.5F, -0.1F, 0.1F, 1, 1, 4, 0.0F, false));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(-1.011F, -0.6259F, 3.6737F);
        this.body1.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -0.8029F, 0.0F, -0.6545F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 42, 43, -0.8044F, -0.7841F, -0.4476F, 1, 2, 1, -0.31F, true));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(-0.2397F, 0.8793F, 3.034F);
        this.body1.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -0.6645F, 0.1083F, -0.5174F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 37, 43, -0.6F, -1.0F, -0.5F, 1, 2, 1, -0.31F, true));

        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-1.1F, -0.2419F, 4.0576F);
        this.body1.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -1.0472F, 0.0F, -0.6545F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 10, 37, -0.5F, -0.8145F, -0.6902F, 1, 2, 2, -0.3F, true));

        this.body7_r1 = new ModelRenderer(this);
        this.body7_r1.setRotationPoint(-1.4F, -0.4801F, 4.897F);
        this.body1.addChild(body7_r1);
        this.setRotateAngle(body7_r1, -0.1658F, 0.0F, 0.0F);
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 24, 37, -0.5F, -0.5532F, -1.5217F, 1, 1, 2, -0.3F, true));
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 24, 37, 2.3F, -0.5532F, -1.5217F, 1, 1, 2, -0.3F, false));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(-1.4F, -0.9801F, 4.497F);
        this.body1.addChild(body6_r2);
        this.setRotateAngle(body6_r2, -0.6545F, 0.0F, 0.0F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 17, 37, -0.5F, -0.5F, -0.9F, 1, 1, 2, -0.31F, true));
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 17, 37, 2.3F, -0.5F, -0.9F, 1, 1, 2, -0.31F, false));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(-1.6F, -0.6746F, 3.9838F);
        this.body1.addChild(body5_r2);
        this.setRotateAngle(body5_r2, -0.2665F, -0.1854F, 0.0503F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 8, 27, -0.3F, -0.5279F, -2.5834F, 1, 1, 3, -0.3F, true));

        this.body6_r3 = new ModelRenderer(this);
        this.body6_r3.setRotationPoint(-1.4F, -0.6746F, 3.5838F);
        this.body1.addChild(body6_r3);
        this.setRotateAngle(body6_r3, -0.2618F, 0.0F, 0.0F);
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 33, 21, -0.1F, -0.6315F, -0.6971F, 2, 1, 2, -0.3F, true));
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 33, 21, 0.9F, -0.6315F, -0.6971F, 2, 1, 2, -0.3F, false));

        this.body3_r2 = new ModelRenderer(this);
        this.body3_r2.setRotationPoint(0.2397F, 0.8793F, 3.034F);
        this.body1.addChild(body3_r2);
        this.setRotateAngle(body3_r2, -0.6645F, -0.1083F, 0.5174F);
        this.body3_r2.cubeList.add(new ModelBox(body3_r2, 37, 43, -0.4F, -1.0F, -0.5F, 1, 2, 1, -0.31F, false));

        this.body4_r2 = new ModelRenderer(this);
        this.body4_r2.setRotationPoint(1.011F, -0.6259F, 3.6737F);
        this.body1.addChild(body4_r2);
        this.setRotateAngle(body4_r2, -0.8029F, 0.0F, 0.6545F);
        this.body4_r2.cubeList.add(new ModelBox(body4_r2, 42, 43, -0.1956F, -0.7841F, -0.4476F, 1, 2, 1, -0.31F, false));

        this.body5_r3 = new ModelRenderer(this);
        this.body5_r3.setRotationPoint(1.1F, -0.2419F, 4.0576F);
        this.body1.addChild(body5_r3);
        this.setRotateAngle(body5_r3, -1.0472F, 0.0F, 0.6545F);
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 10, 37, -0.5F, -0.8145F, -0.6902F, 1, 2, 2, -0.3F, false));

        this.body4_r3 = new ModelRenderer(this);
        this.body4_r3.setRotationPoint(1.6F, -0.6746F, 3.9838F);
        this.body1.addChild(body4_r3);
        this.setRotateAngle(body4_r3, -0.2665F, 0.1854F, -0.0503F);
        this.body4_r3.cubeList.add(new ModelBox(body4_r3, 8, 27, -0.7F, -0.5279F, -2.5834F, 1, 1, 3, -0.3F, false));

        this.chest6_r2 = new ModelRenderer(this);
        this.chest6_r2.setRotationPoint(-0.5F, -0.8436F, 2.3123F);
        this.body1.addChild(chest6_r2);
        this.setRotateAngle(chest6_r2, 0.2054F, 0.1483F, -0.953F);
        this.chest6_r2.cubeList.add(new ModelBox(chest6_r2, 45, 19, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest5_r5 = new ModelRenderer(this);
        this.chest5_r5.setRotationPoint(0.5F, -0.8436F, 2.3123F);
        this.body1.addChild(chest5_r5);
        this.setRotateAngle(chest5_r5, 0.2054F, -0.1483F, 0.953F);
        this.chest5_r5.cubeList.add(new ModelBox(chest5_r5, 45, 19, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 4.7F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.2754F, 0.126F, -0.0355F);
        this.tail1.cubeList.add(new ModelBox(tail1, 36, 15, -0.5F, -1.0604F, 0.0341F, 1, 1, 2, 0.003F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.7F, -0.35F, 3.9F);
        this.body1.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.8814F, 0.0464F, -1.1341F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 0, 11, -0.3039F, 0.0711F, -0.3881F, 1, 4, 1, 0.0F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.1435F, 3.9933F, 0.3866F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.93F, 0.1376F, 0.3263F);


        this.leg6_r1 = new ModelRenderer(this);
        this.leg6_r1.setRotationPoint(-0.0191F, 1.592F, -0.1464F);
        this.leftleg2.addChild(leg6_r1);
        this.setRotateAngle(leg6_r1, 3.0543F, 0.0F, 3.1416F);
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 9, 11, -1.15F, -2.0F, -0.5F, 1, 4, 1, -0.2F, false));
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 12, 0, -0.05F, -2.0F, -0.5F, 1, 4, 1, -0.1F, false));

        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0416F, 3.9665F, 0.196F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.5581F, 0.0804F, -0.024F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 22, 19, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

        this.leftlegwing2 = new ModelRenderer(this);
        this.leftlegwing2.setRotationPoint(-0.4691F, 0.092F, 0.4536F);
        this.leftleg2.addChild(leftlegwing2);
        this.setRotateAngle(leftlegwing2, -0.0141F, 0.0F, 0.0F);


        this.leftlegwing1 = new ModelRenderer(this);
        this.leftlegwing1.setRotationPoint(-0.6039F, 0.0711F, 1.1119F);
        this.leftleg1.addChild(leftlegwing1);
        this.setRotateAngle(leftlegwing1, 0.1367F, 0.0F, 0.0F);


        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.7F, -0.35F, 3.9F);
        this.body1.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.8259F, -0.1897F, 1.2344F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 0, 11, -0.6961F, 0.0711F, -0.3881F, 1, 4, 1, 0.0F, true));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.1435F, 3.9933F, 0.3866F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.6682F, -0.1376F, -0.3263F);


        this.leg7_r1 = new ModelRenderer(this);
        this.leg7_r1.setRotationPoint(0.0191F, 1.592F, -0.1464F);
        this.rightleg2.addChild(leg7_r1);
        this.setRotateAngle(leg7_r1, 3.0543F, 0.0F, -3.1416F);
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 9, 11, 0.15F, -2.0F, -0.5F, 1, 4, 1, -0.2F, true));
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 12, 0, -0.95F, -2.0F, -0.5F, 1, 4, 1, -0.1F, true));

        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.0416F, 3.9665F, 0.196F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.34F, -0.0804F, 0.024F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 22, 19, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, true));

        this.rightlegwing2 = new ModelRenderer(this);
        this.rightlegwing2.setRotationPoint(0.4691F, 0.092F, 0.4536F);
        this.rightleg2.addChild(rightlegwing2);
        this.setRotateAngle(rightlegwing2, -0.0141F, 0.0F, 0.0F);


        this.rightlegwing1 = new ModelRenderer(this);
        this.rightlegwing1.setRotationPoint(0.6039F, 0.0711F, 1.1119F);
        this.rightleg1.addChild(rightlegwing1);
        this.setRotateAngle(rightlegwing1, 0.1367F, 0.0F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.7F, -2.9F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.1355F, -0.2595F, 0.035F);


        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, 0.1539F, -0.8135F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.1745F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 46, 4, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.neck1_r1 = new ModelRenderer(this);
        this.neck1_r1.setRotationPoint(0.0F, 0.8445F, -0.5832F);
        this.neck1.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, 0.0436F, 0.0F, 0.0F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 15, 32, -0.5F, -0.9F, -1.7F, 1, 1, 3, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4445F, -1.9832F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.029F, -0.3038F, 0.0102F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 0, -0.5F, -0.4178F, -2.9187F, 1, 1, 3, 0.003F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 0, 0.0F, -0.7178F, -2.9187F, 0, 1, 1, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 21, 0, 0.0F, -0.7178F, -0.9187F, 0, 1, 1, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0178F, -2.8187F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.3692F, -0.3241F, -0.1018F);


        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.0F, -0.2072F, -0.1519F);
        this.neck3.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, -0.0873F, 0.0F, 0.0F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 21, 32, 0.0F, -0.6F, -1.5F, 0, 1, 1, 0.0F, false));
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 32, 0, -0.5F, -0.3F, -2.5F, 1, 1, 3, -0.01F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0335F, -2.2161F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.7419F, -0.0047F, 0.002F);


        this.head9_r1 = new ModelRenderer(this);
        this.head9_r1.setRotationPoint(-0.52F, -0.7007F, -3.3546F);
        this.head.addChild(head9_r1);
        this.setRotateAngle(head9_r1, -2.8274F, 0.0F, 0.0F);
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 17, 27, -0.5F, -0.2863F, -0.8822F, 1, 1, 3, 0.0F, true));
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 17, 27, 0.54F, -0.2863F, -0.8822F, 1, 1, 3, 0.0F, false));

        this.head10_r1 = new ModelRenderer(this);
        this.head10_r1.setRotationPoint(-0.52F, -0.7007F, -5.5546F);
        this.head.addChild(head10_r1);
        this.setRotateAngle(head10_r1, 2.4173F, 0.0F, 0.0F);
        this.head10_r1.cubeList.add(new ModelBox(head10_r1, 38, 0, -0.5F, -0.0312F, -1.028F, 1, 1, 1, 0.004F, true));
        this.head10_r1.cubeList.add(new ModelBox(head10_r1, 38, 0, 0.54F, -0.0312F, -1.028F, 1, 1, 1, 0.004F, false));

        this.head11_r1 = new ModelRenderer(this);
        this.head11_r1.setRotationPoint(-0.52F, -1.4007F, -4.9546F);
        this.head.addChild(head11_r1);
        this.setRotateAngle(head11_r1, 2.0333F, 0.0F, 0.0F);
        this.head11_r1.cubeList.add(new ModelBox(head11_r1, 12, 32, -0.5F, 0.047F, -1.0425F, 1, 1, 1, 0.003F, true));
        this.head11_r1.cubeList.add(new ModelBox(head11_r1, 12, 32, 0.54F, 0.047F, -1.0425F, 1, 1, 1, 0.003F, false));

        this.head9_r2 = new ModelRenderer(this);
        this.head9_r2.setRotationPoint(-0.52F, -2.1007F, -2.2546F);
        this.head.addChild(head9_r2);
        this.setRotateAngle(head9_r2, 1.7017F, 0.0F, 0.0F);
        this.head9_r2.cubeList.add(new ModelBox(head9_r2, 43, 15, -0.5F, -2.0045F, -1.0286F, 1, 2, 1, 0.007F, true));
        this.head9_r2.cubeList.add(new ModelBox(head9_r2, 43, 15, 0.54F, -2.0045F, -1.0286F, 1, 2, 1, 0.007F, false));

        this.head8_r1 = new ModelRenderer(this);
        this.head8_r1.setRotationPoint(-0.52F, -1.6007F, -1.3546F);
        this.head.addChild(head8_r1);
        this.setRotateAngle(head8_r1, -1.9635F, 0.0F, 0.0F);
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 38, 35, -0.5F, 0.0119F, -0.0722F, 1, 1, 2, 0.003F, true));
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 38, 35, 0.54F, 0.0119F, -0.0722F, 1, 1, 2, 0.003F, false));

        this.head8_r2 = new ModelRenderer(this);
        this.head8_r2.setRotationPoint(-0.52F, -0.2295F, -3.6795F);
        this.head.addChild(head8_r2);
        this.setRotateAngle(head8_r2, 1.5272F, 0.0F, 0.0F);
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 27, 41, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.005F, true));
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 27, 41, 0.54F, -1.5F, -0.5F, 1, 3, 1, 0.005F, false));

        this.head6_r1 = new ModelRenderer(this);
        this.head6_r1.setRotationPoint(0.52F, -0.6997F, -1.864F);
        this.head.addChild(head6_r1);
        this.setRotateAngle(head6_r1, -0.0698F, 0.0F, 0.0F);
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 0, 43, -0.5F, -1.0F, -0.6F, 1, 2, 1, 0.0F, false));

        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(0.0F, 0.3138F, -1.8866F);
        this.head.addChild(head4_r1);
        this.setRotateAngle(head4_r1, -0.5323F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 0, 5, -1.5F, -1.9214F, -0.0179F, 3, 2, 1, 0.003F, false));

        this.head4_r2 = new ModelRenderer(this);
        this.head4_r2.setRotationPoint(0.0F, -1.059F, -0.7435F);
        this.head.addChild(head4_r2);
        this.setRotateAngle(head4_r2, -1.6144F, 0.0F, 0.0F);
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 0, 26, -1.5F, -0.3F, -0.8F, 3, 1, 2, 0.001F, false));

        this.head4_r3 = new ModelRenderer(this);
        this.head4_r3.setRotationPoint(0.0F, -0.0862F, -1.3866F);
        this.head.addChild(head4_r3);
        this.setRotateAngle(head4_r3, -0.0436F, 0.0F, 0.0F);
        this.head4_r3.cubeList.add(new ModelBox(head4_r3, 24, 24, -1.5F, -1.5F, 0.1F, 3, 1, 2, 0.002F, false));
        this.head4_r3.cubeList.add(new ModelBox(head4_r3, 26, 6, -1.5F, -1.8F, 0.1F, 3, 1, 2, 0.004F, false));

        this.head3_r1 = new ModelRenderer(this);
        this.head3_r1.setRotationPoint(0.0F, -1.9461F, 1.7364F);
        this.head.addChild(head3_r1);
        this.setRotateAngle(head3_r1, -1.0908F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 22, 41, -0.5F, -1.5F, -0.5F, 1, 3, 1, -0.003F, false));

        this.head2_r1 = new ModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, -0.8394F, -0.6916F);
        this.head.addChild(head2_r1);
        this.setRotateAngle(head2_r1, -1.0036F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 24, 33, -1.5F, -1.0F, 0.0F, 3, 2, 1, -0.003F, false));

        this.head1_r1 = new ModelRenderer(this);
        this.head1_r1.setRotationPoint(0.0F, -2.1553F, -2.4795F);
        this.head.addChild(head1_r1);
        this.setRotateAngle(head1_r1, -0.0175F, 0.0F, 0.0F);
        this.head1_r1.cubeList.add(new ModelBox(head1_r1, 0, 19, -0.5F, -0.4276F, -0.6794F, 1, 1, 5, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.8432F, -0.9969F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5061F, 0.0F, 0.0F);


        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(0.0F, -0.2078F, -2.3027F);
        this.jaw.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, -0.0349F, 0.0F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 39, 3, -1.5F, 0.0F, 1.0F, 1, 1, 2, 0.0F, true));
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 39, 3, 0.5F, 0.0F, 1.0F, 1, 1, 2, 0.0F, false));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.3922F, 0.2973F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.0456F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 17, 8, -1.0F, -0.5307F, -5.1057F, 2, 1, 4, 0.001F, false));

        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -1.1F, -2.75F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.2353F, 0.0F, 0.0F);


        this.jaw5 = new ModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 0.6F, -3.0F);
        this.jaw3.addChild(jaw5);
        this.setRotateAngle(jaw5, 0.0454F, 0.0F, 0.0F);


        this.jaw6_r1 = new ModelRenderer(this);
        this.jaw6_r1.setRotationPoint(0.0F, -0.1302F, -1.3032F);
        this.jaw5.addChild(jaw6_r1);
        this.setRotateAngle(jaw6_r1, -0.192F, 0.0F, 0.0F);
        this.jaw6_r1.cubeList.add(new ModelBox(jaw6_r1, 5, 44, -0.5F, -0.5F, -0.7F, 1, 1, 1, -0.004F, false));

        this.jaw5_r1 = new ModelRenderer(this);
        this.jaw5_r1.setRotationPoint(0.0F, -0.8256F, 0.3974F);
        this.jaw5.addChild(jaw5_r1);
        this.setRotateAngle(jaw5_r1, -0.0175F, 0.0F, 0.0F);
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 38, 39, -0.5F, 0.225F, -1.7882F, 1, 1, 2, -0.006F, false));

        this.shape64 = new ModelRenderer(this);
        this.shape64.setRotationPoint(0.0F, -0.1256F, -1.9026F);
        this.jaw5.addChild(shape64);
        this.setRotateAngle(shape64, -1.4114F, 0.0F, 0.0F);


        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(0.0F, 1.3F, 1.0F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.0456F, 0.0F, 0.0F);


        this.jaw9_r1 = new ModelRenderer(this);
        this.jaw9_r1.setRotationPoint(0.0F, 1.0999F, -5.5262F);
        this.jaw4.addChild(jaw9_r1);
        this.setRotateAngle(jaw9_r1, -2.3736F, 0.0F, 0.0F);
        this.jaw9_r1.cubeList.add(new ModelBox(jaw9_r1, 45, 27, -0.5F, -0.0897F, -0.0452F, 1, 1, 1, -0.019F, false));

        this.jaw7_r1 = new ModelRenderer(this);
        this.jaw7_r1.setRotationPoint(0.0F, 1.1951F, -6.7906F);
        this.jaw4.addChild(jaw7_r1);
        this.setRotateAngle(jaw7_r1, 2.1118F, 0.0F, 0.0F);
        this.jaw7_r1.cubeList.add(new ModelBox(jaw7_r1, 40, 19, -0.5F, 0.0022F, 0.0216F, 1, 1, 2, -0.017F, false));

        this.jaw6_r2 = new ModelRenderer(this);
        this.jaw6_r2.setRotationPoint(0.0F, 0.2678F, -6.0583F);
        this.jaw4.addChild(jaw6_r2);
        this.setRotateAngle(jaw6_r2, 1.8239F, 0.0F, 0.0F);
        this.jaw6_r2.cubeList.add(new ModelBox(jaw6_r2, 15, 41, -0.5F, -0.6F, -1.0F, 1, 1, 2, -0.01F, false));

        this.jaw5_r2 = new ModelRenderer(this);
        this.jaw5_r2.setRotationPoint(-0.5F, -0.3626F, -5.5172F);
        this.jaw4.addChild(jaw5_r2);
        this.setRotateAngle(jaw5_r2, 0.3665F, 0.0F, 0.0F);
        this.jaw5_r2.cubeList.add(new ModelBox(jaw5_r2, 14, 45, 0.0F, -0.9202F, 0.0235F, 1, 1, 1, -0.016F, false));

        this.jaw4_r1 = new ModelRenderer(this);
        this.jaw4_r1.setRotationPoint(-0.5F, 0.1374F, -5.7172F);
        this.jaw4.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, 1.1868F, 0.0F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 44, 38, 0.0F, -0.922F, -0.038F, 1, 1, 1, -0.015F, false));

        this.underneck3 = new ModelRenderer(this);
        this.underneck3.setRotationPoint(0.0F, 0.7922F, -2.9027F);
        this.jaw.addChild(underneck3);
        this.setRotateAngle(underneck3, -0.2246F, 0.0F, 0.0F);


        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.6922F, -1.1027F);
        this.jaw.addChild(gums1);
        this.setRotateAngle(gums1, -0.055F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -0.9568F, -2.6969F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, -0.0456F, 0.0F, 0.0F);


        this.head2_r2 = new ModelRenderer(this);
        this.head2_r2.setRotationPoint(0.0F, 1.7F, -3.9F);
        this.head2.addChild(head2_r2);
        this.setRotateAngle(head2_r2, 0.0262F, 0.0F, 0.0F);
        this.head2_r2.cubeList.add(new ModelBox(head2_r2, 10, 14, -1.0F, -1.0575F, 0.2762F, 2, 1, 5, 0.015F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.4F, -7.5F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1367F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -0.66F, 4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.0948F, 0.0F, 0.0F);


        this.head6_r2 = new ModelRenderer(this);
        this.head6_r2.setRotationPoint(0.0F, 2.0315F, -0.6556F);
        this.head5.addChild(head6_r2);
        this.setRotateAngle(head6_r2, 0.4363F, 0.0F, 0.0F);
        this.head6_r2.cubeList.add(new ModelBox(head6_r2, 32, 25, -0.5F, -1.2F, -1.3F, 1, 1, 3, 0.0F, false));

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


        this.head8_r3 = new ModelRenderer(this);
        this.head8_r3.setRotationPoint(0.0F, -0.45F, -3.2F);
        this.head4.addChild(head8_r3);
        this.setRotateAngle(head8_r3, 1.0297F, 0.0F, 0.0F);
        this.head8_r3.cubeList.add(new ModelBox(head8_r3, 26, 28, -0.5F, -0.0064F, -3.0173F, 1, 1, 3, -0.01F, false));

        this.head6_r3 = new ModelRenderer(this);
        this.head6_r3.setRotationPoint(0.0F, 0.45F, -4.6F);
        this.head4.addChild(head6_r3);
        this.setRotateAngle(head6_r3, 1.309F, 0.0F, 0.0F);
        this.head6_r3.cubeList.add(new ModelBox(head6_r3, 36, 8, -0.5F, 1.0027F, -1.5684F, 1, 2, 2, -0.02F, false));

        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(0.0F, 0.25F, 0.1F);
        this.head4.addChild(head5_r1);
        this.setRotateAngle(head5_r1, -0.2443F, 0.0F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 0, 30, -1.0F, -0.0001F, 0.0052F, 2, 2, 2, 0.003F, false));

        this.head4_r4 = new ModelRenderer(this);
        this.head4_r4.setRotationPoint(0.0F, 0.35F, 0.1F);
        this.head4.addChild(head4_r4);
        this.setRotateAngle(head4_r4, -0.0524F, 0.0F, 0.0F);
        this.head4_r4.cubeList.add(new ModelBox(head4_r4, 13, 21, -1.0F, -0.1F, -3.0F, 2, 2, 3, 0.0F, false));

        this.crest1 = new ModelRenderer(this);
        this.crest1.setRotationPoint(0.0F, -2.333F, -3.5457F);
        this.head.addChild(crest1);
        this.setRotateAngle(crest1, -0.1609F, 0.0F, 0.0F);


        this.crest4_r1 = new ModelRenderer(this);
        this.crest4_r1.setRotationPoint(0.0F, -1.4295F, -0.5373F);
        this.crest1.addChild(crest4_r1);
        this.setRotateAngle(crest4_r1, -2.3998F, 0.0F, 0.0F);
        this.crest4_r1.cubeList.add(new ModelBox(crest4_r1, 44, 0, -0.5F, -1.9753F, 0.0053F, 1, 2, 1, 0.003F, false));

        this.crest3_r1 = new ModelRenderer(this);
        this.crest3_r1.setRotationPoint(0.0F, -1.9295F, -0.7373F);
        this.crest1.addChild(crest3_r1);
        this.setRotateAngle(crest3_r1, -1.1257F, 0.0F, 0.0F);
        this.crest3_r1.cubeList.add(new ModelBox(crest3_r1, 40, 23, -0.5F, -0.0438F, 0.0395F, 1, 1, 2, 0.0F, false));

        this.crest3_r2 = new ModelRenderer(this);
        this.crest3_r2.setRotationPoint(0.0F, -0.7295F, -2.0373F);
        this.crest1.addChild(crest3_r2);
        this.setRotateAngle(crest3_r2, -0.3752F, 0.0F, 0.0F);
        this.crest3_r2.cubeList.add(new ModelBox(crest3_r2, 40, 28, -0.5F, -0.0281F, 0.0108F, 1, 1, 2, -0.023F, false));

        this.crest2_r1 = new ModelRenderer(this);
        this.crest2_r1.setRotationPoint(0.0F, -1.5295F, -1.5373F);
        this.crest1.addChild(crest2_r1);
        this.setRotateAngle(crest2_r1, -0.5323F, 0.0F, 0.0F);
        this.crest2_r1.cubeList.add(new ModelBox(crest2_r1, 41, 11, -0.5F, 0.015F, -0.014F, 1, 1, 2, -0.02F, false));

        this.crest2 = new ModelRenderer(this);
        this.crest2.setRotationPoint(0.0F, 0.5125F, 10.8487F);
        this.crest1.addChild(crest2);
        this.setRotateAngle(crest2, 0.0456F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.1014F, -0.0925F);
        this.head.addChild(bone);


        this.head7_r1 = new ModelRenderer(this);
        this.head7_r1.setRotationPoint(-1.32F, -0.5163F, 0.0357F);
        this.bone.addChild(head7_r1);
        this.setRotateAngle(head7_r1, -0.8552F, 0.0F, 0.0F);
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 43, 7, -0.6F, -0.7F, -0.5F, 1, 2, 1, -0.4F, true));
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 43, 7, 2.24F, -0.7F, -0.5F, 1, 2, 1, -0.4F, false));

        this.head6_r4 = new ModelRenderer(this);
        this.head6_r4.setRotationPoint(-1.18F, 0.0703F, -1.1689F);
        this.bone.addChild(head6_r4);
        this.setRotateAngle(head6_r4, -0.4276F, 0.0F, 0.0F);
        this.head6_r4.cubeList.add(new ModelBox(head6_r4, 32, 42, -0.5F, -1.9062F, -0.4966F, 1, 2, 1, -0.17F, true));
        this.head6_r4.cubeList.add(new ModelBox(head6_r4, 32, 42, 1.86F, -1.9062F, -0.4966F, 1, 2, 1, -0.17F, false));

        this.head7_r2 = new ModelRenderer(this);
        this.head7_r2.setRotationPoint(-1.18F, 0.0703F, -1.1689F);
        this.bone.addChild(head7_r2);
        this.setRotateAngle(head7_r2, -0.5847F, 0.0F, 0.0F);
        this.head7_r2.cubeList.add(new ModelBox(head7_r2, 10, 42, -0.52F, -1.8062F, -0.4966F, 1, 2, 1, -0.18F, true));
        this.head7_r2.cubeList.add(new ModelBox(head7_r2, 10, 42, 1.88F, -1.8062F, -0.4966F, 1, 2, 1, -0.18F, false));

        this.head7_r3 = new ModelRenderer(this);
        this.head7_r3.setRotationPoint(-1.17F, -1.1462F, -0.3618F);
        this.bone.addChild(head7_r3);
        this.setRotateAngle(head7_r3, -0.5149F, 0.0F, 0.0F);
        this.head7_r3.cubeList.add(new ModelBox(head7_r3, 14, 27, -0.57F, -0.25F, -0.6F, 1, 1, 1, -0.2F, true));
        this.head7_r3.cubeList.add(new ModelBox(head7_r3, 28, 0, -0.73F, -0.25F, -0.6F, 1, 1, 1, -0.35F, true));
        this.head7_r3.cubeList.add(new ModelBox(head7_r3, 14, 27, 1.91F, -0.25F, -0.6F, 1, 1, 1, -0.2F, false));
        this.head7_r3.cubeList.add(new ModelBox(head7_r3, 28, 0, 2.07F, -0.25F, -0.6F, 1, 1, 1, -0.35F, false));

        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(bone2);


        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.4F, -0.5F, -2.4F);
        this.chest1.addChild(leftwing1);
        this.setRotateAngle(leftwing1, -0.6623F, -0.2935F, -0.488F);


        this.upperwing8_r1 = new ModelRenderer(this);
        this.upperwing8_r1.setRotationPoint(1.0746F, 0.0368F, 0.2605F);
        this.leftwing1.addChild(upperwing8_r1);
        this.setRotateAngle(upperwing8_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 8, 21, -0.25F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 43, 32, -1.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(2.4709F, 0.2106F, -0.2119F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.3443F, 0.985F, -3.0864F);


        this.wing10_r1 = new ModelRenderer(this);
        this.wing10_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing10_r1);
        this.setRotateAngle(wing10_r1, 0.0F, 0.0F, 0.0F);
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 33, 35, -0.9072F, -2.9026F, -0.7631F, 1, 5, 1, -0.2F, false));
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 5, 37, -0.9072F, -2.9026F, 0.0369F, 1, 5, 1, -0.15F, false));

        this.wing8_r1 = new ModelRenderer(this);
        this.wing8_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing8_r1);
        this.setRotateAngle(wing8_r1, 0.0F, -1.5708F, 0.4974F);
        this.wing8_r1.cubeList.add(new ModelBox(wing8_r1, 0, 19, -0.3631F, -1.2367F, -1.3225F, 1, 3, 1, -0.21F, false));

        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.3415F, 4.754F, -0.649F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, -0.0481F, 0.1612F, 0.3153F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 0, 35, -0.5F, 0.0F, 0.0F, 1, 6, 1, -0.11F, false));

        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(0.1172F, 5.6557F, 0.301F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 2.0141F, 0.3531F, -2.4537F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 0, 0, -0.5799F, -0.5164F, -0.654F, 1, 1, 9, -0.2F, false));

        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.0799F, 0.4836F, 8.346F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.309F, 0.4545F, 0.3265F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 12, 0, -0.5F, -1.0F, -0.3F, 1, 1, 6, -0.2F, false));

        this.wingfinger9_r1 = new ModelRenderer(this);
        this.wingfinger9_r1.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.leftwing5.addChild(wingfinger9_r1);
        this.setRotateAngle(wingfinger9_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger9_r1.cubeList.add(new ModelBox(wingfinger9_r1, 0, 11, -0.5F, -1.0F, 0.2F, 1, 1, 6, -0.2F, false));

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
        this.setRotateAngle(lefthand2, -0.3371F, -1.3691F, 0.4229F);
        this.lefthand2.cubeList.add(new ModelBox(lefthand2, 33, 31, -1.0495F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

        this.leftwing4membrance = new ModelRenderer(this);
        this.leftwing4membrance.setRotationPoint(-12.2799F, 3.7836F, 3.946F);
        this.leftwing4.addChild(leftwing4membrance);


        this.leftwing3membrance = new ModelRenderer(this);
        this.leftwing3membrance.setRotationPoint(0.5397F, 0.1609F, 0.9501F);
        this.leftwing2.addChild(leftwing3membrance);


        this.leftwing1membrance = new ModelRenderer(this);
        this.leftwing1membrance.setRotationPoint(1.3496F, 0.2368F, 2.9355F);
        this.leftwing1.addChild(leftwing1membrance);
        this.setRotateAngle(leftwing1membrance, 0.0021F, -0.3752F, -0.0093F);


        this.rightwing1 = new ModelRenderer(this);
        this.rightwing1.setRotationPoint(-2.4F, -0.5F, -2.4F);
        this.chest1.addChild(rightwing1);
        this.setRotateAngle(rightwing1, -0.6882F, -0.2133F, -0.1191F);


        this.upperwing9_r1 = new ModelRenderer(this);
        this.upperwing9_r1.setRotationPoint(-1.0746F, 0.0368F, 0.2605F);
        this.rightwing1.addChild(upperwing9_r1);
        this.setRotateAngle(upperwing9_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 8, 21, -1.75F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 43, 32, 0.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-2.4709F, 0.2106F, -0.2119F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -1.1686F, -0.8064F, 2.8869F);


        this.wing11_r1 = new ModelRenderer(this);
        this.wing11_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing11_r1);
        this.setRotateAngle(wing11_r1, 0.0F, 0.0F, 0.0F);
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 33, 35, -0.0928F, -2.9026F, -0.7631F, 1, 5, 1, -0.2F, true));
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 5, 37, -0.0928F, -2.9026F, 0.0369F, 1, 5, 1, -0.15F, true));

        this.wing9_r1 = new ModelRenderer(this);
        this.wing9_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing9_r1);
        this.setRotateAngle(wing9_r1, 0.0F, 1.5708F, -0.4974F);
        this.wing9_r1.cubeList.add(new ModelBox(wing9_r1, 0, 19, -0.6369F, -1.2367F, -1.3225F, 1, 3, 1, -0.21F, true));

        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.3415F, 4.754F, -0.649F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, -0.0481F, -0.1612F, -0.3153F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 0, 35, -0.5F, 0.0F, 0.0F, 1, 6, 1, -0.11F, true));

        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(-0.1172F, 5.6557F, 0.301F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.9145F, -0.1076F, 2.6538F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 0, 0, -0.4201F, -0.5164F, -0.654F, 1, 1, 9, -0.2F, true));

        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.0799F, 0.4836F, 8.346F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.309F, -0.4545F, -0.3265F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 12, 0, -0.5F, -1.0F, -0.3F, 1, 1, 6, -0.2F, true));

        this.wingfinger10_r1 = new ModelRenderer(this);
        this.wingfinger10_r1.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.rightwing5.addChild(wingfinger10_r1);
        this.setRotateAngle(wingfinger10_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger10_r1.cubeList.add(new ModelBox(wingfinger10_r1, 0, 11, -0.5F, -1.0F, 0.2F, 1, 1, 6, -0.2F, true));

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
        this.setRotateAngle(righthand2, -0.3371F, 1.3691F, -0.4229F);
        this.righthand2.cubeList.add(new ModelBox(righthand2, 33, 31, -0.9505F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, true));

        this.rightwing4membrance = new ModelRenderer(this);
        this.rightwing4membrance.setRotationPoint(12.2799F, 3.7836F, 3.946F);
        this.rightwing4.addChild(rightwing4membrance);


        this.rightwing3membrance = new ModelRenderer(this);
        this.rightwing3membrance.setRotationPoint(-0.5397F, 0.1609F, 0.9501F);
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
