package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTapejara extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer chest1;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer chest4_r1;
    private final ModelRenderer chest3_r2;
    private final ModelRenderer chest4_r2;
    private final ModelRenderer chest4_r3;
    private final ModelRenderer chest3_r3;
    private final ModelRenderer chest3_r4;
    private final ModelRenderer chest2_r2;
    private final ModelRenderer chest2_r3;
    private final ModelRenderer chest3_r5;
    private final ModelRenderer chest5_r1;
    private final ModelRenderer chest4_r4;
    private final ModelRenderer chest3_r6;
    private final ModelRenderer chest2_r4;
    private final ModelRenderer body1;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer body3_r2;
    private final ModelRenderer body4_r1;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body5_r2;
    private final ModelRenderer body5_r3;
    private final ModelRenderer body4_r2;
    private final ModelRenderer chest5_r2;
    private final ModelRenderer body3_r3;
    private final ModelRenderer body4_r3;
    private final ModelRenderer body3_r4;
    private final ModelRenderer body2_r2;
    private final ModelRenderer chest4_r5;
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
    private final ModelRenderer head8_r1;
    private final ModelRenderer head6_r1;
    private final ModelRenderer head7_r1;
    private final ModelRenderer head8_r2;
    private final ModelRenderer head7_r2;
    private final ModelRenderer head6_r2;
    private final ModelRenderer head5_r1;
    private final ModelRenderer head3_r1;
    private final ModelRenderer head3_r2;
    private final ModelRenderer head1_r1;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2_r1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw5;
    private final ModelRenderer jaw5_r1;
    private final ModelRenderer shape64;
    private final ModelRenderer jaw4;
    private final ModelRenderer jaw8_r1;
    private final ModelRenderer jaw8_r2;
    private final ModelRenderer jaw7_r1;
    private final ModelRenderer jaw6_r1;
    private final ModelRenderer jaw4_r1;
    private final ModelRenderer underneck3;
    private final ModelRenderer gums1;
    private final ModelRenderer head2;
    private final ModelRenderer head2_r1;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer head6_r3;
    private final ModelRenderer lips1;
    private final ModelRenderer lips2;
    private final ModelRenderer head4;
    private final ModelRenderer head8_r3;
    private final ModelRenderer head6_r4;
    private final ModelRenderer head5_r2;
    private final ModelRenderer crest1;
    private final ModelRenderer crest4_r1;
    private final ModelRenderer crest3_r1;
    private final ModelRenderer crest2_r1;
    private final ModelRenderer crest2;
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

    public ModelSkeletonTapejara() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -9.25F, 0.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);


        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, 0.025F, -0.5694F);
        this.root.addChild(chest1);
        this.setRotateAngle(chest1, -0.6241F, 0.0F, 0.0F);


        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(0.0F, -1.0503F, -0.3905F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, 0.0698F, 0.0F, 0.0F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 0, 20, 0.0F, -0.3F, -0.5F, 0, 1, 1, 0.0F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, -0.4F, -1.3F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.1571F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 23, 0, 0.0F, -1.0F, -1.5F, 0, 1, 1, 0.0F, false));
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 29, 11, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.003F, false));

        this.chest4_r1 = new ModelRenderer(this);
        this.chest4_r1.setRotationPoint(2.2F, -0.6963F, -2.8469F);
        this.chest1.addChild(chest4_r1);
        this.setRotateAngle(chest4_r1, 1.9477F, -0.6105F, 0.2383F);
        this.chest4_r1.cubeList.add(new ModelBox(chest4_r1, 30, 23, -0.3803F, -0.6653F, -2.8318F, 1, 1, 3, -0.2F, true));

        this.chest3_r2 = new ModelRenderer(this);
        this.chest3_r2.setRotationPoint(1.0F, -0.6963F, -1.3469F);
        this.chest1.addChild(chest3_r2);
        this.setRotateAngle(chest3_r2, 0.1767F, -0.4736F, -0.0813F);
        this.chest3_r2.cubeList.add(new ModelBox(chest3_r2, 26, 6, 0.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, true));

        this.chest4_r2 = new ModelRenderer(this);
        this.chest4_r2.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest4_r2);
        this.setRotateAngle(chest4_r2, 0.2362F, -0.0906F, 0.6958F);
        this.chest4_r2.cubeList.add(new ModelBox(chest4_r2, 14, 29, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest4_r3 = new ModelRenderer(this);
        this.chest4_r3.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r3);
        this.setRotateAngle(chest4_r3, 0.2567F, -0.3201F, 1.2334F);
        this.chest4_r3.cubeList.add(new ModelBox(chest4_r3, 36, 24, 0.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest3_r3 = new ModelRenderer(this);
        this.chest3_r3.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest3_r3);
        this.setRotateAngle(chest3_r3, 0.3904F, -0.1198F, 0.6404F);
        this.chest3_r3.cubeList.add(new ModelBox(chest3_r3, 26, 36, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest3_r4 = new ModelRenderer(this);
        this.chest3_r4.setRotationPoint(-2.2F, -0.6963F, -2.8469F);
        this.chest1.addChild(chest3_r4);
        this.setRotateAngle(chest3_r4, 1.9477F, 0.6105F, -0.2383F);
        this.chest3_r4.cubeList.add(new ModelBox(chest3_r4, 30, 23, -0.6197F, -0.6653F, -2.8318F, 1, 1, 3, -0.2F, false));

        this.chest2_r2 = new ModelRenderer(this);
        this.chest2_r2.setRotationPoint(-1.0F, -0.6963F, -1.3469F);
        this.chest1.addChild(chest2_r2);
        this.setRotateAngle(chest2_r2, 0.1767F, 0.4736F, 0.0813F);
        this.chest2_r2.cubeList.add(new ModelBox(chest2_r2, 26, 6, -1.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, false));

        this.chest2_r3 = new ModelRenderer(this);
        this.chest2_r3.setRotationPoint(0.0F, 1.2791F, -1.0341F);
        this.chest1.addChild(chest2_r3);
        this.setRotateAngle(chest2_r3, -0.1571F, 0.0F, 0.0F);
        this.chest2_r3.cubeList.add(new ModelBox(chest2_r3, 0, 20, -1.5F, -0.3F, -1.5F, 3, 1, 3, 0.0F, false));

        this.chest3_r5 = new ModelRenderer(this);
        this.chest3_r5.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest3_r5);
        this.setRotateAngle(chest3_r5, 0.2362F, 0.0906F, -0.6958F);
        this.chest3_r5.cubeList.add(new ModelBox(chest3_r5, 14, 29, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest5_r1 = new ModelRenderer(this);
        this.chest5_r1.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r1);
        this.setRotateAngle(chest5_r1, 0.1426F, -0.2093F, 1.3024F);
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 0, 16, 0.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest4_r4 = new ModelRenderer(this);
        this.chest4_r4.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest4_r4);
        this.setRotateAngle(chest4_r4, 0.1426F, 0.2093F, -1.3024F);
        this.chest4_r4.cubeList.add(new ModelBox(chest4_r4, 0, 16, -2.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, false));

        this.chest3_r6 = new ModelRenderer(this);
        this.chest3_r6.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest3_r6);
        this.setRotateAngle(chest3_r6, 0.2567F, 0.3201F, -1.2334F);
        this.chest3_r6.cubeList.add(new ModelBox(chest3_r6, 36, 24, -1.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest2_r4 = new ModelRenderer(this);
        this.chest2_r4.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest2_r4);
        this.setRotateAngle(chest2_r4, 0.3904F, 0.1198F, -0.6404F);
        this.chest2_r4.cubeList.add(new ModelBox(chest2_r4, 26, 36, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.chest1.addChild(body1);
        this.setRotateAngle(body1, -0.1372F, -0.0865F, 0.0119F);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -0.9744F, 4.4978F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.1658F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 0, 0, 0.0F, -0.2F, -0.5F, 0, 1, 1, 0.0F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -1.1F, 0.9F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0349F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 6, 0, 0.0F, -0.5F, 1.1F, 0, 1, 1, 0.0F, false));
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 22, 20, -0.5F, -0.1F, 0.1F, 1, 1, 4, 0.0F, false));

        this.body3_r2 = new ModelRenderer(this);
        this.body3_r2.setRotationPoint(0.2397F, 0.8793F, 3.034F);
        this.body1.addChild(body3_r2);
        this.setRotateAngle(body3_r2, -0.6645F, -0.1083F, 0.5174F);
        this.body3_r2.cubeList.add(new ModelBox(body3_r2, 42, 43, -0.4F, -1.0F, -0.5F, 1, 2, 1, -0.31F, true));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(1.011F, -0.6259F, 3.6737F);
        this.body1.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -0.8029F, 0.0F, 0.6545F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 43, 29, -0.1956F, -0.7841F, -0.4476F, 1, 2, 1, -0.31F, true));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(1.1F, -0.2419F, 4.0576F);
        this.body1.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -1.0472F, 0.0F, 0.6545F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 7, 34, -0.5F, -0.8145F, -0.6902F, 1, 2, 2, -0.3F, true));

        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(1.4F, -0.4801F, 4.897F);
        this.body1.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -0.1658F, 0.0F, 0.0F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 37, 31, -0.5F, -0.5532F, -1.5217F, 1, 1, 2, -0.3F, true));
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 37, 31, -3.3F, -0.5532F, -1.5217F, 1, 1, 2, -0.3F, false));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(1.4F, -0.9801F, 4.497F);
        this.body1.addChild(body5_r2);
        this.setRotateAngle(body5_r2, -0.6545F, 0.0F, 0.0F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 26, 39, -0.5F, -0.5F, -0.9F, 1, 1, 2, -0.31F, true));
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 26, 39, -3.3F, -0.5F, -0.9F, 1, 1, 2, -0.31F, false));

        this.body5_r3 = new ModelRenderer(this);
        this.body5_r3.setRotationPoint(1.4F, -0.6746F, 3.5838F);
        this.body1.addChild(body5_r3);
        this.setRotateAngle(body5_r3, -0.2618F, 0.0F, 0.0F);
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 0, 5, -1.9F, -0.6315F, -0.6971F, 2, 1, 2, -0.31F, true));
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 0, 5, -2.9F, -0.6315F, -0.6971F, 2, 1, 2, -0.31F, false));

        this.body4_r2 = new ModelRenderer(this);
        this.body4_r2.setRotationPoint(1.6F, -0.6746F, 3.9838F);
        this.body1.addChild(body4_r2);
        this.setRotateAngle(body4_r2, -0.2665F, 0.1854F, -0.0503F);
        this.body4_r2.cubeList.add(new ModelBox(body4_r2, 0, 0, -0.7F, -0.5279F, -2.5834F, 1, 1, 3, -0.3F, true));

        this.chest5_r2 = new ModelRenderer(this);
        this.chest5_r2.setRotationPoint(0.5F, -0.8436F, 2.3123F);
        this.body1.addChild(chest5_r2);
        this.setRotateAngle(chest5_r2, 0.2054F, -0.1483F, 0.953F);
        this.chest5_r2.cubeList.add(new ModelBox(chest5_r2, 18, 22, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body3_r3 = new ModelRenderer(this);
        this.body3_r3.setRotationPoint(-1.6F, -0.6746F, 3.9838F);
        this.body1.addChild(body3_r3);
        this.setRotateAngle(body3_r3, -0.2665F, -0.1854F, 0.0503F);
        this.body3_r3.cubeList.add(new ModelBox(body3_r3, 0, 0, -0.3F, -0.5279F, -2.5834F, 1, 1, 3, -0.3F, false));

        this.body4_r3 = new ModelRenderer(this);
        this.body4_r3.setRotationPoint(-1.1F, -0.2419F, 4.0576F);
        this.body1.addChild(body4_r3);
        this.setRotateAngle(body4_r3, -1.0472F, 0.0F, -0.6545F);
        this.body4_r3.cubeList.add(new ModelBox(body4_r3, 7, 34, -0.5F, -0.8145F, -0.6902F, 1, 2, 2, -0.3F, false));

        this.body3_r4 = new ModelRenderer(this);
        this.body3_r4.setRotationPoint(-1.011F, -0.6259F, 3.6737F);
        this.body1.addChild(body3_r4);
        this.setRotateAngle(body3_r4, -0.8029F, 0.0F, -0.6545F);
        this.body3_r4.cubeList.add(new ModelBox(body3_r4, 43, 29, -0.8044F, -0.7841F, -0.4476F, 1, 2, 1, -0.31F, false));

        this.body2_r2 = new ModelRenderer(this);
        this.body2_r2.setRotationPoint(-0.2397F, 0.8793F, 3.034F);
        this.body1.addChild(body2_r2);
        this.setRotateAngle(body2_r2, -0.6645F, 0.1083F, -0.5174F);
        this.body2_r2.cubeList.add(new ModelBox(body2_r2, 42, 43, -0.6F, -1.0F, -0.5F, 1, 2, 1, -0.31F, false));

        this.chest4_r5 = new ModelRenderer(this);
        this.chest4_r5.setRotationPoint(-0.5F, -0.8436F, 2.3123F);
        this.body1.addChild(chest4_r5);
        this.setRotateAngle(chest4_r5, 0.2054F, 0.1483F, -0.953F);
        this.chest4_r5.cubeList.add(new ModelBox(chest4_r5, 18, 22, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 4.7F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.2794F, -0.21F, 0.0597F);
        this.tail1.cubeList.add(new ModelBox(tail1, 21, 36, -0.5F, -1.0604F, 0.0341F, 1, 1, 2, 0.003F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.7F, -0.35F, 3.9F);
        this.body1.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.2296F, -0.1274F, -0.4204F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 12, 0, -0.3039F, 0.0711F, -0.3881F, 1, 4, 1, 0.0F, true));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.1435F, 3.9933F, 0.3866F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.6682F, 0.1376F, 0.3263F);


        this.leg6_r1 = new ModelRenderer(this);
        this.leg6_r1.setRotationPoint(-0.0191F, 1.592F, -0.1464F);
        this.leftleg2.addChild(leg6_r1);
        this.setRotateAngle(leg6_r1, 3.0543F, 0.0F, 3.1416F);
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 12, 40, -1.15F, -2.0F, -0.5F, 1, 4, 1, -0.2F, true));
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 37, 39, -0.05F, -2.0F, -0.5F, 1, 4, 1, -0.1F, true));

        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0416F, 3.9665F, 0.196F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.3145F, 0.0804F, -0.024F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 0, 26, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, true));

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
        this.setRotateAngle(rightleg1, 0.8841F, 0.1274F, 0.4204F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 12, 0, -0.6961F, 0.0711F, -0.3881F, 1, 4, 1, 0.0F, false));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.1435F, 3.9933F, 0.3866F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.8427F, -0.1376F, -0.3263F);


        this.leg7_r1 = new ModelRenderer(this);
        this.leg7_r1.setRotationPoint(0.0191F, 1.592F, -0.1464F);
        this.rightleg2.addChild(leg7_r1);
        this.setRotateAngle(leg7_r1, 3.0543F, 0.0F, -3.1416F);
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 12, 40, 0.15F, -2.0F, -0.5F, 1, 4, 1, -0.2F, false));
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 37, 39, -0.95F, -2.0F, -0.5F, 1, 4, 1, -0.1F, false));

        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.0416F, 3.9665F, 0.196F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.3145F, -0.0804F, 0.024F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 0, 26, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

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
        this.setRotateAngle(neck1, -0.2626F, 0.0852F, -0.0189F);


        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, 0.1539F, -0.8135F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.1745F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 0, 25, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.neck1_r1 = new ModelRenderer(this);
        this.neck1_r1.setRotationPoint(0.0F, 0.8445F, -0.5832F);
        this.neck1.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, 0.0436F, 0.0F, 0.0F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 0, 31, -0.5F, -0.9F, -1.7F, 1, 1, 3, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4445F, -1.9832F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2635F, 0.2127F, 0.255F);
        this.neck2.cubeList.add(new ModelBox(neck2, 29, 17, -0.5F, -0.4178F, -2.9187F, 1, 1, 3, 0.003F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 45, 3, 0.0F, -0.7178F, -2.9187F, 0, 1, 1, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 31, 0.0F, -0.7178F, -0.9187F, 0, 1, 1, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0178F, -2.8187F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.4101F, 0.0559F, 0.1654F);


        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.0F, -0.2072F, -0.1519F);
        this.neck3.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, -0.0873F, 0.0F, 0.0F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 10, 45, 0.0F, -0.6F, -1.5F, 0, 1, 1, 0.0F, false));
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 29, 28, -0.5F, -0.3F, -2.5F, 1, 1, 3, -0.01F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0335F, -2.2161F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.9163F, 0.0F, 0.0F);


        this.head9_r1 = new ModelRenderer(this);
        this.head9_r1.setRotationPoint(-0.5F, -0.6722F, -5.3058F);
        this.head.addChild(head9_r1);
        this.setRotateAngle(head9_r1, 2.9758F, 0.0F, 0.0F);
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 35, 16, 0.52F, -0.9447F, -1.9696F, 1, 1, 2, 0.003F, true));
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 35, 16, -0.52F, -0.9447F, -1.9696F, 1, 1, 2, 0.003F, false));

        this.head8_r1 = new ModelRenderer(this);
        this.head8_r1.setRotationPoint(-0.5F, -0.6804F, -3.7552F);
        this.head.addChild(head8_r1);
        this.setRotateAngle(head8_r1, -2.6354F, 0.0F, 0.0F);
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 8, 29, 0.52F, -1.0F, -0.9F, 1, 1, 3, 0.0F, true));
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 8, 29, -0.52F, -1.0F, -0.9F, 1, 1, 3, 0.0F, false));

        this.head6_r1 = new ModelRenderer(this);
        this.head6_r1.setRotationPoint(-0.5F, 0.5404F, -2.0965F);
        this.head.addChild(head6_r1);
        this.setRotateAngle(head6_r1, -0.2705F, 0.0F, 0.0F);
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 5, 43, 0.52F, -2.0421F, -0.976F, 1, 2, 1, 0.0F, true));
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 5, 43, -0.52F, -2.0421F, -0.976F, 1, 2, 1, 0.0F, false));

        this.head7_r1 = new ModelRenderer(this);
        this.head7_r1.setRotationPoint(-0.5F, -1.6596F, -3.4965F);
        this.head.addChild(head7_r1);
        this.setRotateAngle(head7_r1, -1.5446F, 0.0F, 0.0F);
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 39, 0, 0.52F, -1.0157F, -0.0278F, 1, 1, 2, 0.003F, true));
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 39, 0, -0.52F, -1.0157F, -0.0278F, 1, 1, 2, 0.003F, false));

        this.head8_r2 = new ModelRenderer(this);
        this.head8_r2.setRotationPoint(-0.5F, -0.5722F, -4.5058F);
        this.head.addChild(head8_r2);
        this.setRotateAngle(head8_r2, 2.0682F, 0.0F, 0.0F);
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 0, 43, 0.52F, -0.6F, -0.5F, 1, 2, 1, 0.007F, true));
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 0, 43, -0.52F, -0.6F, -0.5F, 1, 2, 1, 0.007F, false));

        this.head7_r2 = new ModelRenderer(this);
        this.head7_r2.setRotationPoint(-0.5F, 0.5404F, -1.9965F);
        this.head.addChild(head7_r2);
        this.setRotateAngle(head7_r2, 1.7715F, 0.0F, 0.0F);
        this.head7_r2.cubeList.add(new ModelBox(head7_r2, 42, 16, 0.52F, -3.0121F, 0.0287F, 1, 3, 1, 0.005F, true));
        this.head7_r2.cubeList.add(new ModelBox(head7_r2, 42, 16, -0.52F, -3.0121F, 0.0287F, 1, 3, 1, 0.005F, false));

        this.head6_r2 = new ModelRenderer(this);
        this.head6_r2.setRotationPoint(0.0F, 0.1014F, -0.0925F);
        this.head.addChild(head6_r2);
        this.setRotateAngle(head6_r2, -0.8116F, 0.0F, 0.0F);
        this.head6_r2.cubeList.add(new ModelBox(head6_r2, 32, 42, 0.82F, -1.0F, -0.5F, 1, 2, 1, -0.3F, true));
        this.head6_r2.cubeList.add(new ModelBox(head6_r2, 32, 42, -1.82F, -1.0F, -0.5F, 1, 2, 1, -0.3F, false));

        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(0.0F, -0.5682F, -0.9652F);
        this.head.addChild(head5_r1);
        this.setRotateAngle(head5_r1, -0.6545F, 0.0F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 42, 39, 0.51F, -1.0F, -0.3F, 1, 2, 1, 0.003F, true));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 42, 10, 0.83F, -1.0F, -0.3F, 1, 1, 1, -0.3F, true));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 44, 36, 0.62F, -1.0F, -0.3F, 1, 1, 1, -0.1F, true));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 42, 10, -1.83F, -1.0F, -0.3F, 1, 1, 1, -0.3F, false));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 44, 36, -1.62F, -1.0F, -0.3F, 1, 1, 1, -0.1F, false));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 42, 39, -1.51F, -1.0F, -0.3F, 1, 2, 1, 0.003F, false));

        this.head3_r1 = new ModelRenderer(this);
        this.head3_r1.setRotationPoint(0.0F, -0.0862F, -1.3866F);
        this.head.addChild(head3_r1);
        this.setRotateAngle(head3_r1, -0.0436F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 20, 14, -1.5F, -1.5F, -0.5F, 3, 3, 2, 0.003F, false));

        this.head3_r2 = new ModelRenderer(this);
        this.head3_r2.setRotationPoint(0.0F, -1.0275F, 0.0464F);
        this.head.addChild(head3_r2);
        this.setRotateAngle(head3_r2, -0.9163F, 0.0F, 0.0F);
        this.head3_r2.cubeList.add(new ModelBox(head3_r2, 44, 33, -0.5F, -1.4F, -0.2F, 1, 1, 1, -0.003F, false));
        this.head3_r2.cubeList.add(new ModelBox(head3_r2, 21, 26, -1.5F, -0.5F, -0.8F, 3, 2, 2, -0.003F, false));

        this.head1_r1 = new ModelRenderer(this);
        this.head1_r1.setRotationPoint(0.0F, -2.1553F, -2.4795F);
        this.head.addChild(head1_r1);
        this.setRotateAngle(head1_r1, -0.0175F, 0.0F, 0.0F);
        this.head1_r1.cubeList.add(new ModelBox(head1_r1, 0, 11, -0.5F, -0.1276F, -0.6794F, 1, 1, 7, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.4432F, -0.5969F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7679F, 0.0F, 0.0F);


        this.jaw2_r1 = new ModelRenderer(this);
        this.jaw2_r1.setRotationPoint(0.0F, -0.2078F, -2.3027F);
        this.jaw.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, -0.0349F, 0.0F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 5, 39, 0.5F, 0.0F, 1.0F, 1, 1, 2, 0.0F, true));
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 5, 39, -1.5F, 0.0F, 1.0F, 1, 1, 2, 0.0F, false));

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


        this.jaw5_r1 = new ModelRenderer(this);
        this.jaw5_r1.setRotationPoint(0.0F, -0.8256F, 0.3974F);
        this.jaw5.addChild(jaw5_r1);
        this.setRotateAngle(jaw5_r1, -0.0175F, 0.0F, 0.0F);
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 23, 31, -0.5F, 0.225F, -2.7882F, 1, 1, 3, -0.004F, false));

        this.shape64 = new ModelRenderer(this);
        this.shape64.setRotationPoint(0.0F, -0.1256F, -1.9026F);
        this.jaw5.addChild(shape64);
        this.setRotateAngle(shape64, -1.4114F, 0.0F, 0.0F);


        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(0.0F, 1.0F, 0.9F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.0456F, 0.0F, 0.0F);


        this.jaw8_r1 = new ModelRenderer(this);
        this.jaw8_r1.setRotationPoint(0.0F, 0.97F, -6.7413F);
        this.jaw4.addChild(jaw8_r1);
        this.setRotateAngle(jaw8_r1, 2.9147F, 0.0F, 0.0F);
        this.jaw8_r1.cubeList.add(new ModelBox(jaw8_r1, 22, 42, -0.5F, -0.2087F, -0.9486F, 1, 2, 1, -0.018F, false));

        this.jaw8_r2 = new ModelRenderer(this);
        this.jaw8_r2.setRotationPoint(0.0F, 0.0648F, -6.9258F);
        this.jaw4.addChild(jaw8_r2);
        this.setRotateAngle(jaw8_r2, 2.8449F, 0.0F, 0.0F);
        this.jaw8_r2.cubeList.add(new ModelBox(jaw8_r2, 20, 31, -0.5F, -0.5F, 0.0F, 1, 1, 1, -0.018F, false));

        this.jaw7_r1 = new ModelRenderer(this);
        this.jaw7_r1.setRotationPoint(0.0F, 1.1951F, -6.7906F);
        this.jaw4.addChild(jaw7_r1);
        this.setRotateAngle(jaw7_r1, 2.1468F, 0.0F, 0.0F);
        this.jaw7_r1.cubeList.add(new ModelBox(jaw7_r1, 37, 26, -0.5F, 0.0022F, 0.0216F, 1, 1, 2, -0.018F, false));

        this.jaw6_r1 = new ModelRenderer(this);
        this.jaw6_r1.setRotationPoint(0.0F, 0.9951F, -6.0906F);
        this.jaw4.addChild(jaw6_r1);
        this.setRotateAngle(jaw6_r1, 0.9076F, 0.0F, 0.0F);
        this.jaw6_r1.cubeList.add(new ModelBox(jaw6_r1, 40, 6, -0.5F, -0.605F, -0.1635F, 1, 1, 2, -0.015F, false));

        this.jaw4_r1 = new ModelRenderer(this);
        this.jaw4_r1.setRotationPoint(0.0F, -0.6626F, -5.0172F);
        this.jaw4.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, 0.2269F, 0.0F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 32, 4, -1.0F, -0.3F, -0.3F, 2, 1, 2, -0.015F, false));

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


        this.head2_r1 = new ModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, 2.3F, -0.2F);
        this.head2.addChild(head2_r1);
        this.setRotateAngle(head2_r1, -0.0087F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 12, 0, -1.0F, -1.0252F, -3.8289F, 2, 1, 6, 0.015F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.4F, -7.5F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1367F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -0.66F, 4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.0948F, 0.0F, 0.0F);


        this.head6_r3 = new ModelRenderer(this);
        this.head6_r3.setRotationPoint(0.0F, 2.0315F, -0.6556F);
        this.head5.addChild(head6_r3);
        this.setRotateAngle(head6_r3, 0.4363F, 0.0F, 0.0F);
        this.head6_r3.cubeList.add(new ModelBox(head6_r3, 14, 31, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

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
        this.head8_r3.setRotationPoint(0.0F, 0.95F, -4.5F);
        this.head4.addChild(head8_r3);
        this.setRotateAngle(head8_r3, 1.2741F, 0.0F, 0.0F);
        this.head8_r3.cubeList.add(new ModelBox(head8_r3, 0, 11, -0.5F, -0.0725F, -0.1984F, 1, 2, 2, -0.01F, false));

        this.head6_r4 = new ModelRenderer(this);
        this.head6_r4.setRotationPoint(0.0F, 0.45F, -4.6F);
        this.head4.addChild(head6_r4);
        this.setRotateAngle(head6_r4, 1.309F, 0.0F, 0.0F);
        this.head6_r4.cubeList.add(new ModelBox(head6_r4, 35, 8, -0.5F, 0.2027F, -2.4684F, 1, 2, 2, -0.02F, false));

        this.head5_r2 = new ModelRenderer(this);
        this.head5_r2.setRotationPoint(0.0F, 0.35F, 0.1F);
        this.head4.addChild(head5_r2);
        this.setRotateAngle(head5_r2, -0.0524F, 0.0F, 0.0F);
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 37, 35, -1.0F, 0.9F, 0.0F, 2, 2, 1, 0.003F, false));
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 10, 22, -1.0F, -0.1F, -3.0F, 2, 3, 3, 0.003F, false));

        this.crest1 = new ModelRenderer(this);
        this.crest1.setRotationPoint(0.0F, -0.2568F, 4.7531F);
        this.head.addChild(crest1);
        this.setRotateAngle(crest1, -0.0911F, 0.0F, 0.0F);


        this.crest4_r1 = new ModelRenderer(this);
        this.crest4_r1.setRotationPoint(0.0F, -2.642F, -10.086F);
        this.crest1.addChild(crest4_r1);
        this.setRotateAngle(crest4_r1, -2.3998F, 0.0F, 0.0F);
        this.crest4_r1.cubeList.add(new ModelBox(crest4_r1, 42, 23, -0.5F, -1.9753F, 0.0053F, 1, 2, 1, 0.003F, false));

        this.crest3_r1 = new ModelRenderer(this);
        this.crest3_r1.setRotationPoint(0.0F, -2.342F, -11.086F);
        this.crest1.addChild(crest3_r1);
        this.setRotateAngle(crest3_r1, -1.3177F, 0.0F, 0.0F);
        this.crest3_r1.cubeList.add(new ModelBox(crest3_r1, 14, 36, -0.5F, -1.0186F, -0.0347F, 1, 1, 2, 0.0F, false));

        this.crest2_r1 = new ModelRenderer(this);
        this.crest2_r1.setRotationPoint(0.0F, -1.542F, -11.586F);
        this.crest1.addChild(crest2_r1);
        this.setRotateAngle(crest2_r1, -0.5847F, 0.0F, 0.0F);
        this.crest2_r1.cubeList.add(new ModelBox(crest2_r1, 36, 20, -0.5F, -0.9617F, -0.0593F, 1, 1, 2, -0.02F, false));

        this.crest2 = new ModelRenderer(this);
        this.crest2.setRotationPoint(0.0F, -0.7F, 1.3F);
        this.crest1.addChild(crest2);
        this.setRotateAngle(crest2, 0.0456F, 0.0F, 0.0F);


        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.4F, -0.5F, -2.4F);
        this.chest1.addChild(leftwing1);
        this.setRotateAngle(leftwing1, 0.0342F, -0.0752F, 0.4299F);


        this.upperwing8_r1 = new ModelRenderer(this);
        this.upperwing8_r1.setRotationPoint(1.0746F, 0.0368F, 0.2605F);
        this.leftwing1.addChild(upperwing8_r1);
        this.setRotateAngle(upperwing8_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 38, 13, -0.25F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 27, 43, -1.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(2.4709F, 0.2106F, -0.2119F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.0706F, 1.1687F, -1.5106F);


        this.wing10_r1 = new ModelRenderer(this);
        this.wing10_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing10_r1);
        this.setRotateAngle(wing10_r1, 0.0F, 0.0F, 0.0F);
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 10, 11, -0.9072F, -2.9026F, -0.7631F, 1, 5, 1, -0.2F, true));
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 0, 36, -0.9072F, -2.9026F, 0.0369F, 1, 5, 1, -0.15F, true));

        this.wing8_r1 = new ModelRenderer(this);
        this.wing8_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing8_r1);
        this.setRotateAngle(wing8_r1, 0.0F, -1.5708F, 0.4974F);
        this.wing8_r1.cubeList.add(new ModelBox(wing8_r1, 17, 40, -0.3631F, -1.2367F, -1.3225F, 1, 3, 1, -0.21F, true));

        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.3415F, 4.754F, -0.649F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.2645F, 0.1014F, 0.6665F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 32, 33, -0.5F, 0.0F, 0.0F, 1, 6, 1, -0.11F, true));

        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(0.1172F, 5.6557F, 0.301F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.5615F, -0.5239F, -0.6187F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 0, 0, -0.5799F, -0.5164F, -0.654F, 1, 1, 9, -0.2F, true));

        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.0799F, 0.4836F, 8.346F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.2889F, 0.2876F, 0.2714F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 11, 14, -0.5F, -1.0F, -0.3F, 1, 1, 6, -0.2F, true));

        this.wingfinger9_r1 = new ModelRenderer(this);
        this.wingfinger9_r1.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.leftwing5.addChild(wingfinger9_r1);
        this.setRotateAngle(wingfinger9_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger9_r1.cubeList.add(new ModelBox(wingfinger9_r1, 23, 0, -0.5F, -1.0F, 0.2F, 1, 1, 4, -0.2F, true));

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
        this.setRotateAngle(lefthand2, -2.1762F, -0.0989F, -2.0846F);
        this.lefthand2.cubeList.add(new ModelBox(lefthand2, 30, 0, -1.0495F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, true));

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
        this.setRotateAngle(rightwing1, -0.0965F, -0.0117F, -0.4215F);


        this.upperwing9_r1 = new ModelRenderer(this);
        this.upperwing9_r1.setRotationPoint(-1.0746F, 0.0368F, 0.2605F);
        this.rightwing1.addChild(upperwing9_r1);
        this.setRotateAngle(upperwing9_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 38, 13, -1.75F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 27, 43, 0.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-2.4709F, 0.2106F, -0.2119F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -1.0161F, -1.2064F, 1.4518F);


        this.wing11_r1 = new ModelRenderer(this);
        this.wing11_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing11_r1);
        this.setRotateAngle(wing11_r1, 0.0F, 0.0F, 0.0F);
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 10, 11, -0.0928F, -2.9026F, -0.7631F, 1, 5, 1, -0.2F, false));
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 0, 36, -0.0928F, -2.9026F, 0.0369F, 1, 5, 1, -0.15F, false));

        this.wing9_r1 = new ModelRenderer(this);
        this.wing9_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing9_r1);
        this.setRotateAngle(wing9_r1, 0.0F, 1.5708F, -0.4974F);
        this.wing9_r1.cubeList.add(new ModelBox(wing9_r1, 17, 40, -0.6369F, -1.2367F, -1.3225F, 1, 3, 1, -0.21F, false));

        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.3415F, 4.754F, -0.649F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.2229F, -0.1756F, -0.3673F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 32, 33, -0.5F, 0.0F, 0.0F, 1, 6, 1, -0.11F, false));

        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(-0.1172F, 5.6557F, 0.301F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.4864F, 0.5178F, 0.4679F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 0, 0, -0.4201F, -0.5164F, -0.654F, 1, 1, 9, -0.2F, false));

        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.0799F, 0.4836F, 8.346F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.2889F, -0.2876F, -0.2714F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 11, 14, -0.5F, -1.0F, -0.3F, 1, 1, 6, -0.2F, false));

        this.wingfinger10_r1 = new ModelRenderer(this);
        this.wingfinger10_r1.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.rightwing5.addChild(wingfinger10_r1);
        this.setRotateAngle(wingfinger10_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger10_r1.cubeList.add(new ModelBox(wingfinger10_r1, 23, 0, -0.5F, -1.0F, 0.2F, 1, 1, 4, -0.2F, false));

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
        this.setRotateAngle(righthand2, -2.6655F, 0.1393F, 2.0067F);
        this.righthand2.cubeList.add(new ModelBox(righthand2, 30, 0, -0.9505F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

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
