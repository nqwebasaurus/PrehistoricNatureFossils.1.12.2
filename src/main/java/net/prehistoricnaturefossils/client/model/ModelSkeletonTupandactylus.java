package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTupandactylus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer chest1;
    private final ModelRenderer chest5_r1;
    private final ModelRenderer chest6_r1;
    private final ModelRenderer chest4_r1;
    private final ModelRenderer chest7_r1;
    private final ModelRenderer chest6_r2;
    private final ModelRenderer chest6_r3;
    private final ModelRenderer chest5_r2;
    private final ModelRenderer chest5_r3;
    private final ModelRenderer chest5_r4;
    private final ModelRenderer chest4_r2;
    private final ModelRenderer chest5_r5;
    private final ModelRenderer chest4_r3;
    private final ModelRenderer chest4_r4;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest6_r4;
    private final ModelRenderer chest5_r6;
    private final ModelRenderer chest4_r5;
    private final ModelRenderer chest4_r6;
    private final ModelRenderer chest3_r2;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer chest5_r7;
    private final ModelRenderer chest3_r3;
    private final ModelRenderer chest3_r4;
    private final ModelRenderer body1;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body4_r1;
    private final ModelRenderer body7_r1;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body7_r2;
    private final ModelRenderer body8_r1;
    private final ModelRenderer body6_r2;
    private final ModelRenderer body7_r3;
    private final ModelRenderer body6_r3;
    private final ModelRenderer body5_r2;
    private final ModelRenderer chest6_r5;
    private final ModelRenderer chest8_r1;
    private final ModelRenderer chest7_r2;
    private final ModelRenderer body4_r2;
    private final ModelRenderer body3_r2;
    private final ModelRenderer body6_r4;
    private final ModelRenderer body5_r3;
    private final ModelRenderer body4_r3;
    private final ModelRenderer chest5_r8;
    private final ModelRenderer chest7_r3;
    private final ModelRenderer chest6_r6;
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
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer head;
    private final ModelRenderer head7_r1;
    private final ModelRenderer head8_r1;
    private final ModelRenderer head8_r2;
    private final ModelRenderer head7_r2;
    private final ModelRenderer head6_r1;
    private final ModelRenderer head3_r1;
    private final ModelRenderer head3_r2;
    private final ModelRenderer head2_r1;
    private final ModelRenderer head2_r2;
    private final ModelRenderer head1_r1;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw4_r1;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw2_r1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw2_r2;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw5;
    private final ModelRenderer jaw5_r1;
    private final ModelRenderer shape64;
    private final ModelRenderer jaw4;
    private final ModelRenderer jaw9_r1;
    private final ModelRenderer jaw8_r1;
    private final ModelRenderer jaw7_r1;
    private final ModelRenderer jaw7_r2;
    private final ModelRenderer jaw5_r2;
    private final ModelRenderer underneck3;
    private final ModelRenderer gums1;
    private final ModelRenderer head2;
    private final ModelRenderer head3_r3;
    private final ModelRenderer head2_r3;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer head6_r2;
    private final ModelRenderer lips1;
    private final ModelRenderer lips2;
    private final ModelRenderer head4;
    private final ModelRenderer head6_r3;
    private final ModelRenderer head6_r4;
    private final ModelRenderer head6_r5;
    private final ModelRenderer head5_r1;
    private final ModelRenderer head5_r2;
    private final ModelRenderer head6_r6;
    private final ModelRenderer head5_r3;
    private final ModelRenderer crest1;
    private final ModelRenderer crest4_r1;
    private final ModelRenderer crest6_r1;
    private final ModelRenderer crest5_r1;
    private final ModelRenderer crest4_r2;
    private final ModelRenderer crest6_r2;
    private final ModelRenderer crest5_r2;
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

    public ModelSkeletonTupandactylus() {
        this.textureWidth = 74;
        this.textureHeight = 74;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -9.25F, 0.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);


        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, 7.425F, -0.9694F);
        this.root.addChild(chest1);
        this.setRotateAngle(chest1, -0.7466F, 0.4681F, 0.4803F);


        this.chest5_r1 = new ModelRenderer(this);
        this.chest5_r1.setRotationPoint(-2.2F, 3.3037F, -1.5469F);
        this.chest1.addChild(chest5_r1);
        this.setRotateAngle(chest5_r1, 2.2444F, 0.6105F, -0.2383F);
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 38, 45, 0.5174F, -0.0211F, -0.6544F, 1, 1, 3, -0.2F, true));

        this.chest6_r1 = new ModelRenderer(this);
        this.chest6_r1.setRotationPoint(-2.2F, 1.5037F, -2.9469F);
        this.chest1.addChild(chest6_r1);
        this.setRotateAngle(chest6_r1, 1.4822F, 0.5761F, -0.0103F);
        this.chest6_r1.cubeList.add(new ModelBox(chest6_r1, 63, 22, -0.6334F, -0.4061F, 0.0149F, 1, 1, 2, -0.2F, true));

        this.chest4_r1 = new ModelRenderer(this);
        this.chest4_r1.setRotationPoint(-2.0F, -0.6963F, -3.1469F);
        this.chest1.addChild(chest4_r1);
        this.setRotateAngle(chest4_r1, 0.1579F, 0.2474F, 0.0746F);
        this.chest4_r1.cubeList.add(new ModelBox(chest4_r1, 12, 33, -0.9074F, 0.1775F, -0.0121F, 1, 1, 3, -0.2F, true));

        this.chest7_r1 = new ModelRenderer(this);
        this.chest7_r1.setRotationPoint(-0.5F, -0.6436F, 1.7123F);
        this.chest1.addChild(chest7_r1);
        this.setRotateAngle(chest7_r1, 0.1239F, 0.142F, -1.3057F);
        this.chest7_r1.cubeList.add(new ModelBox(chest7_r1, 47, 28, -3.8192F, -0.5736F, -0.5F, 3, 0, 1, 0.0F, true));

        this.chest6_r2 = new ModelRenderer(this);
        this.chest6_r2.setRotationPoint(-0.5F, -0.6436F, 1.7123F);
        this.chest1.addChild(chest6_r2);
        this.setRotateAngle(chest6_r2, 0.1826F, 0.0458F, -0.6994F);
        this.chest6_r2.cubeList.add(new ModelBox(chest6_r2, 41, 24, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest6_r3 = new ModelRenderer(this);
        this.chest6_r3.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest6_r3);
        this.setRotateAngle(chest6_r3, 0.1426F, 0.2093F, -1.3024F);
        this.chest6_r3.cubeList.add(new ModelBox(chest6_r3, 63, 38, -3.8192F, -0.5736F, -0.5F, 3, 0, 1, 0.0F, true));

        this.chest5_r2 = new ModelRenderer(this);
        this.chest5_r2.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r2);
        this.setRotateAngle(chest5_r2, 0.2362F, 0.0906F, -0.6958F);
        this.chest5_r2.cubeList.add(new ModelBox(chest5_r2, 32, 53, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest5_r3 = new ModelRenderer(this);
        this.chest5_r3.setRotationPoint(-2.0F, -0.6963F, -3.1469F);
        this.chest1.addChild(chest5_r3);
        this.setRotateAngle(chest5_r3, 0.0357F, 0.2474F, 0.0746F);
        this.chest5_r3.cubeList.add(new ModelBox(chest5_r3, 39, 19, -0.9074F, -0.181F, 2.6195F, 1, 1, 3, -0.2F, true));

        this.chest5_r4 = new ModelRenderer(this);
        this.chest5_r4.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest5_r4);
        this.setRotateAngle(chest5_r4, 0.2567F, 0.3201F, -1.2334F);
        this.chest5_r4.cubeList.add(new ModelBox(chest5_r4, 28, 3, -1.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest4_r2 = new ModelRenderer(this);
        this.chest4_r2.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r2);
        this.setRotateAngle(chest4_r2, 0.3904F, 0.1198F, -0.6404F);
        this.chest4_r2.cubeList.add(new ModelBox(chest4_r2, 18, 33, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest5_r5 = new ModelRenderer(this);
        this.chest5_r5.setRotationPoint(2.2F, 1.5037F, -2.9469F);
        this.chest1.addChild(chest5_r5);
        this.setRotateAngle(chest5_r5, 1.4822F, -0.5761F, 0.0103F);
        this.chest5_r5.cubeList.add(new ModelBox(chest5_r5, 63, 22, -0.3666F, -0.4061F, 0.0149F, 1, 1, 2, -0.2F, false));

        this.chest4_r3 = new ModelRenderer(this);
        this.chest4_r3.setRotationPoint(2.2F, 3.3037F, -1.5469F);
        this.chest1.addChild(chest4_r3);
        this.setRotateAngle(chest4_r3, 2.2444F, -0.6105F, 0.2383F);
        this.chest4_r3.cubeList.add(new ModelBox(chest4_r3, 38, 45, -1.5174F, -0.0211F, -0.6544F, 1, 1, 3, -0.2F, false));

        this.chest4_r4 = new ModelRenderer(this);
        this.chest4_r4.setRotationPoint(2.0F, -0.6963F, -3.1469F);
        this.chest1.addChild(chest4_r4);
        this.setRotateAngle(chest4_r4, 0.0357F, -0.2474F, -0.0746F);
        this.chest4_r4.cubeList.add(new ModelBox(chest4_r4, 39, 19, -0.0926F, -0.181F, 2.6195F, 1, 1, 3, -0.2F, false));

        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(2.0F, -0.6963F, -3.1469F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, 0.1579F, -0.2474F, -0.0746F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 12, 33, -0.0926F, 0.1775F, -0.0121F, 1, 1, 3, -0.2F, false));

        this.chest6_r4 = new ModelRenderer(this);
        this.chest6_r4.setRotationPoint(0.5F, -0.6436F, 1.7123F);
        this.chest1.addChild(chest6_r4);
        this.setRotateAngle(chest6_r4, 0.1239F, -0.142F, 1.3057F);
        this.chest6_r4.cubeList.add(new ModelBox(chest6_r4, 47, 28, 0.8192F, -0.5736F, -0.5F, 3, 0, 1, 0.0F, false));

        this.chest5_r6 = new ModelRenderer(this);
        this.chest5_r6.setRotationPoint(0.5F, -0.6436F, 1.7123F);
        this.chest1.addChild(chest5_r6);
        this.setRotateAngle(chest5_r6, 0.1826F, -0.0458F, 0.6994F);
        this.chest5_r6.cubeList.add(new ModelBox(chest5_r6, 41, 24, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest4_r5 = new ModelRenderer(this);
        this.chest4_r5.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest4_r5);
        this.setRotateAngle(chest4_r5, 0.2362F, -0.0906F, 0.6958F);
        this.chest4_r5.cubeList.add(new ModelBox(chest4_r5, 32, 53, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest4_r6 = new ModelRenderer(this);
        this.chest4_r6.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r6);
        this.setRotateAngle(chest4_r6, 0.2567F, -0.3201F, 1.2334F);
        this.chest4_r6.cubeList.add(new ModelBox(chest4_r6, 28, 3, 0.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest3_r2 = new ModelRenderer(this);
        this.chest3_r2.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest3_r2);
        this.setRotateAngle(chest3_r2, 0.3904F, -0.1198F, 0.6404F);
        this.chest3_r2.cubeList.add(new ModelBox(chest3_r2, 18, 33, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, 1.2791F, -1.0341F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, -0.1571F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 0, 10, -1.5F, 1.8311F, -0.3217F, 3, 1, 3, 0.0F, false));

        this.chest5_r7 = new ModelRenderer(this);
        this.chest5_r7.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r7);
        this.setRotateAngle(chest5_r7, 0.1426F, -0.2093F, 1.3024F);
        this.chest5_r7.cubeList.add(new ModelBox(chest5_r7, 63, 38, 0.8192F, -0.5736F, -0.5F, 3, 0, 1, 0.0F, false));

        this.chest3_r3 = new ModelRenderer(this);
        this.chest3_r3.setRotationPoint(0.0F, -1.1F, 1.1F);
        this.chest1.addChild(chest3_r3);
        this.setRotateAngle(chest3_r3, 0.0F, 0.0F, 0.0F);
        this.chest3_r3.cubeList.add(new ModelBox(chest3_r3, 18, 9, 0.0F, -0.3924F, 1.0318F, 0, 1, 1, 0.0F, false));
        this.chest3_r3.cubeList.add(new ModelBox(chest3_r3, 8, 64, -0.5F, 0.0076F, 0.0318F, 1, 1, 2, 0.003F, false));

        this.chest3_r4 = new ModelRenderer(this);
        this.chest3_r4.setRotationPoint(0.0F, -0.4F, -2.5F);
        this.chest1.addChild(chest3_r4);
        this.setRotateAngle(chest3_r4, 0.1047F, 0.0F, 0.0F);
        this.chest3_r4.cubeList.add(new ModelBox(chest3_r4, 12, 33, 0.0F, -0.7123F, 2.6852F, 0, 1, 1, 0.0F, false));
        this.chest3_r4.cubeList.add(new ModelBox(chest3_r4, 41, 28, 0.0F, -0.7123F, 0.6852F, 0, 1, 1, 0.0F, false));
        this.chest3_r4.cubeList.add(new ModelBox(chest3_r4, 52, 41, -0.5F, -0.3123F, -0.3148F, 1, 1, 4, 0.003F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.2F, 4.9F);
        this.chest1.addChild(body1);
        this.setRotateAngle(body1, -0.2163F, -0.1298F, 0.0168F);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -0.368F, 3.4013F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.1658F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 45, 19, 0.0F, -0.2F, -0.5F, 0, 1, 1, 0.0F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -0.4937F, -0.1965F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0349F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 38, 45, 0.0F, -0.5F, 1.1F, 0, 1, 1, 0.0F, false));
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 0, 25, 0.0F, -0.5F, -0.9F, 0, 1, 1, 0.0F, false));
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 43, 45, -0.5F, -0.1F, -1.9F, 1, 1, 6, 0.0F, false));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(-0.5397F, 2.2856F, 0.3375F);
        this.body1.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -1.1183F, 0.1083F, -0.5174F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 10, 10, -0.4288F, -0.2595F, -0.1792F, 1, 1, 1, -0.2F, true));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(-0.5397F, 2.1856F, 1.5375F);
        this.body1.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -1.3277F, 0.1083F, -0.5174F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 9, 46, -0.3482F, -0.4755F, -0.4833F, 1, 2, 1, -0.31F, true));

        this.body7_r1 = new ModelRenderer(this);
        this.body7_r1.setRotationPoint(-1.6F, 2.2644F, 3.1611F);
        this.body1.addChild(body7_r1);
        this.setRotateAngle(body7_r1, -1.501F, 0.0F, -0.6545F);
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 44, 10, 0.5958F, -0.1553F, -1.027F, 1, 2, 2, -0.31F, true));

        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-1.6F, 0.4644F, 2.9611F);
        this.body1.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -1.0472F, 0.0F, -0.6545F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 42, 62, -0.5F, -0.8145F, 0.2098F, 1, 2, 2, -0.3F, true));

        this.body7_r2 = new ModelRenderer(this);
        this.body7_r2.setRotationPoint(-1.4F, -0.2758F, 3.5428F);
        this.body1.addChild(body7_r2);
        this.setRotateAngle(body7_r2, -1.9809F, 0.0F, 0.0F);
        this.body7_r2.cubeList.add(new ModelBox(body7_r2, 61, 11, -0.5F, -0.5F, -0.6F, 1, 1, 2, -0.31F, true));
        this.body7_r2.cubeList.add(new ModelBox(body7_r2, 61, 11, 2.3F, -0.5F, -0.6F, 1, 1, 2, -0.31F, false));

        this.body8_r1 = new ModelRenderer(this);
        this.body8_r1.setRotationPoint(-1.4F, 0.4923F, 2.7564F);
        this.body1.addChild(body8_r1);
        this.setRotateAngle(body8_r1, 0.1309F, 0.0F, 0.0F);
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 61, 45, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.3F, true));
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 61, 45, 2.3F, -1.0F, -1.0F, 1, 2, 2, -0.3F, false));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(-1.4F, -0.551F, 3.6624F);
        this.body1.addChild(body6_r2);
        this.setRotateAngle(body6_r2, -0.4102F, 0.0F, 0.0F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 65, 30, -0.5F, -0.4F, -1.0F, 1, 1, 2, -0.31F, true));
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 65, 30, 2.3F, -0.4F, -1.0F, 1, 1, 2, -0.31F, false));

        this.body7_r3 = new ModelRenderer(this);
        this.body7_r3.setRotationPoint(-1.4F, -0.1279F, 1.6043F);
        this.body1.addChild(body7_r3);
        this.setRotateAngle(body7_r3, 0.0785F, 0.0F, 0.0F);
        this.body7_r3.cubeList.add(new ModelBox(body7_r3, 13, 61, -0.5F, -0.2913F, -0.4F, 1, 2, 2, -0.3F, true));
        this.body7_r3.cubeList.add(new ModelBox(body7_r3, 13, 61, 2.3F, -0.2913F, -0.4F, 1, 2, 2, -0.3F, false));

        this.body6_r3 = new ModelRenderer(this);
        this.body6_r3.setRotationPoint(-0.5F, -0.1169F, 2.814F);
        this.body1.addChild(body6_r3);
        this.setRotateAngle(body6_r3, -0.192F, 0.0F, 0.0F);
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 52, 47, -1.0F, -0.2F, -1.3F, 2, 1, 2, -0.3F, true));
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 52, 47, 0.0F, -0.2F, -1.3F, 2, 1, 2, -0.3F, false));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(-1.6F, -0.0683F, 1.5873F);
        this.body1.addChild(body5_r2);
        this.setRotateAngle(body5_r2, -0.1094F, -0.1854F, 0.0503F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 41, 28, -0.3604F, -0.3644F, -2.7508F, 1, 1, 3, -0.3F, true));

        this.chest6_r5 = new ModelRenderer(this);
        this.chest6_r5.setRotationPoint(-0.5F, -0.2372F, 1.2158F);
        this.body1.addChild(chest6_r5);
        this.setRotateAngle(chest6_r5, 0.2031F, 0.0116F, -0.9814F);
        this.chest6_r5.cubeList.add(new ModelBox(chest6_r5, 55, 0, -0.9869F, -0.0493F, -0.8967F, 1, 0, 1, 0.0F, true));

        this.chest8_r1 = new ModelRenderer(this);
        this.chest8_r1.setRotationPoint(-0.5F, -0.3436F, -1.1877F);
        this.body1.addChild(chest8_r1);
        this.setRotateAngle(chest8_r1, 0.1379F, 0.1925F, -1.3033F);
        this.chest8_r1.cubeList.add(new ModelBox(chest8_r1, 31, 30, -2.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest7_r2 = new ModelRenderer(this);
        this.chest7_r2.setRotationPoint(-0.5F, -0.3436F, -1.1877F);
        this.body1.addChild(chest7_r2);
        this.setRotateAngle(chest7_r2, 0.2228F, 0.0794F, -0.6969F);
        this.chest7_r2.cubeList.add(new ModelBox(chest7_r2, 24, 39, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body4_r2 = new ModelRenderer(this);
        this.body4_r2.setRotationPoint(0.5397F, 2.2856F, 0.3375F);
        this.body1.addChild(body4_r2);
        this.setRotateAngle(body4_r2, -1.1183F, -0.1083F, 0.5174F);
        this.body4_r2.cubeList.add(new ModelBox(body4_r2, 10, 10, -0.5712F, -0.2595F, -0.1792F, 1, 1, 1, -0.2F, false));

        this.body3_r2 = new ModelRenderer(this);
        this.body3_r2.setRotationPoint(0.5397F, 2.1856F, 1.5375F);
        this.body1.addChild(body3_r2);
        this.setRotateAngle(body3_r2, -1.3277F, -0.1083F, 0.5174F);
        this.body3_r2.cubeList.add(new ModelBox(body3_r2, 9, 46, -0.6518F, -0.4755F, -0.4833F, 1, 2, 1, -0.31F, false));

        this.body6_r4 = new ModelRenderer(this);
        this.body6_r4.setRotationPoint(1.6F, 2.2644F, 3.1611F);
        this.body1.addChild(body6_r4);
        this.setRotateAngle(body6_r4, -1.501F, 0.0F, 0.6545F);
        this.body6_r4.cubeList.add(new ModelBox(body6_r4, 44, 10, -1.5958F, -0.1553F, -1.027F, 1, 2, 2, -0.31F, false));

        this.body5_r3 = new ModelRenderer(this);
        this.body5_r3.setRotationPoint(1.6F, 0.4644F, 2.9611F);
        this.body1.addChild(body5_r3);
        this.setRotateAngle(body5_r3, -1.0472F, 0.0F, 0.6545F);
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 42, 62, -0.5F, -0.8145F, 0.2098F, 1, 2, 2, -0.3F, false));

        this.body4_r3 = new ModelRenderer(this);
        this.body4_r3.setRotationPoint(1.6F, -0.0683F, 1.5873F);
        this.body1.addChild(body4_r3);
        this.setRotateAngle(body4_r3, -0.1094F, 0.1854F, -0.0503F);
        this.body4_r3.cubeList.add(new ModelBox(body4_r3, 41, 28, -0.6396F, -0.3644F, -2.7508F, 1, 1, 3, -0.3F, false));

        this.chest5_r8 = new ModelRenderer(this);
        this.chest5_r8.setRotationPoint(0.5F, -0.2372F, 1.2158F);
        this.body1.addChild(chest5_r8);
        this.setRotateAngle(chest5_r8, 0.2031F, -0.0116F, 0.9814F);
        this.chest5_r8.cubeList.add(new ModelBox(chest5_r8, 55, 0, -0.0131F, -0.0493F, -0.8967F, 1, 0, 1, 0.0F, false));

        this.chest7_r3 = new ModelRenderer(this);
        this.chest7_r3.setRotationPoint(0.5F, -0.3436F, -1.1877F);
        this.body1.addChild(chest7_r3);
        this.setRotateAngle(chest7_r3, 0.1379F, -0.1925F, 1.3033F);
        this.chest7_r3.cubeList.add(new ModelBox(chest7_r3, 31, 30, 0.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, false));

        this.chest6_r6 = new ModelRenderer(this);
        this.chest6_r6.setRotationPoint(0.5F, -0.3436F, -1.1877F);
        this.body1.addChild(chest6_r6);
        this.setRotateAngle(chest6_r6, 0.2228F, -0.0794F, 0.6969F);
        this.chest6_r6.cubeList.add(new ModelBox(chest6_r6, 24, 39, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.6063F, 3.7035F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.2241F, -0.1703F, 0.0386F);
        this.tail1.cubeList.add(new ModelBox(tail1, 36, 3, -0.5F, -1.0604F, 0.0341F, 1, 1, 2, 0.003F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.7F, 0.8217F, 2.3788F);
        this.body1.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.7524F, -0.1502F, -1.3956F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 30, 59, -0.3039F, 0.0711F, -0.3881F, 1, 7, 1, 0.0F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.31F, 7.0094F, 0.2905F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.7303F, 0.2917F, 0.1681F);


        this.leg6_r1 = new ModelRenderer(this);
        this.leg6_r1.setRotationPoint(-0.0191F, 1.592F, -0.1464F);
        this.leftleg2.addChild(leg6_r1);
        this.setRotateAngle(leg6_r1, 3.0543F, 0.0F, 3.1416F);
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 0, 52, -1.15F, -2.0F, -0.5F, 1, 11, 1, -0.2F, false));
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 5, 52, -0.05F, -2.0F, -0.5F, 1, 11, 1, -0.1F, false));

        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0171F, 10.3798F, 0.6075F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 1.4046F, 0.0804F, -0.024F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 0, 25, -1.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F, false));

        this.leftlegwing2 = new ModelRenderer(this);
        this.leftlegwing2.setRotationPoint(-0.4691F, 0.092F, 0.4536F);
        this.leftleg2.addChild(leftlegwing2);
        this.setRotateAngle(leftlegwing2, -0.0141F, 0.0F, 0.0F);


        this.leftlegwing1 = new ModelRenderer(this);
        this.leftlegwing1.setRotationPoint(-0.6039F, 0.0711F, 1.1119F);
        this.leftleg1.addChild(leftlegwing1);
        this.setRotateAngle(leftlegwing1, 0.1367F, 0.0F, 0.0F);


        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.7F, 0.8217F, 2.3788F);
        this.body1.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.6215F, 0.1502F, 1.3956F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 25, 59, -0.6961F, 0.0711F, -0.3881F, 1, 7, 1, 0.0F, false));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.31F, 7.0094F, 0.2905F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.8175F, -0.2917F, -0.1681F);


        this.leg7_r1 = new ModelRenderer(this);
        this.leg7_r1.setRotationPoint(0.0191F, 1.592F, -0.1464F);
        this.rightleg2.addChild(leg7_r1);
        this.setRotateAngle(leg7_r1, 3.0543F, 0.0F, -3.1416F);
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 20, 46, 0.15F, -2.0F, -0.5F, 1, 11, 1, -0.2F, false));
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 51, 10, -0.95F, -2.0F, -0.5F, 1, 11, 1, -0.1F, false));

        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.0171F, 10.3798F, 0.6075F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 1.4046F, -0.0804F, 0.024F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 18, 9, -1.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F, false));

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
        this.setRotateAngle(neck1, 0.1053F, -0.0136F, -0.0862F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.0F, 0.8445F, -0.5832F);
        this.neck1.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 0.0436F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 48, 0, 0.0F, -1.2F, -0.7F, 0, 1, 1, 0.0F, false));
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 25, 50, 0.0F, -1.2F, -2.7F, 0, 1, 1, 0.0F, false));
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 36, 10, -0.5F, -0.9F, -3.7F, 1, 1, 5, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4445F, -3.9832F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.1239F, 0.3054F, -0.082F);
        this.neck2.cubeList.add(new ModelBox(neck2, 25, 53, -0.5F, -0.4178F, -3.9187F, 1, 1, 4, 0.003F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 10, 0.0F, -0.7178F, -2.9187F, 0, 1, 1, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 25, 53, 0.0F, -0.7178F, -0.9187F, 0, 1, 1, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0178F, -3.8187F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.0343F, 0.3421F, -0.071F);


        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.0F, -0.2072F, -0.1519F);
        this.neck3.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, -0.0873F, 0.0F, 0.0F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 67, 44, 0.0F, -0.6F, -1.5F, 0, 1, 1, 0.0F, false));
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 54, 36, -0.5F, -0.3F, -2.5F, 1, 1, 3, -0.01F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2335F, -3.4161F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.8739F, -0.1344F, 0.1117F);
        this.head.cubeList.add(new ModelBox(head, 0, 33, -0.5F, -2.5043F, 2.0418F, 1, 1, 9, 0.003F, false));

        this.head7_r1 = new ModelRenderer(this);
        this.head7_r1.setRotationPoint(-1.32F, 0.2782F, 0.8997F);
        this.head.addChild(head7_r1);
        this.setRotateAngle(head7_r1, -0.8465F, 0.0F, 0.0F);
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 18, 0, -0.5F, -1.2F, -0.6F, 1, 2, 1, -0.3F, true));

        this.head8_r1 = new ModelRenderer(this);
        this.head8_r1.setRotationPoint(-1.17F, -0.5729F, 0.425F);
        this.head.addChild(head8_r1);
        this.setRotateAngle(head8_r1, -0.7941F, 0.0F, 0.0F);
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 67, 26, -0.66F, -0.85F, -0.6F, 1, 1, 1, -0.3F, true));
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 40, 67, -0.45F, -0.85F, -0.6F, 1, 1, 1, -0.1F, true));
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 15, 66, -0.34F, -1.05F, -0.5F, 1, 2, 1, 0.003F, true));
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 15, 66, 1.68F, -1.05F, -0.5F, 1, 2, 1, 0.003F, false));
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 67, 26, 2.0F, -0.85F, -0.6F, 1, 1, 1, -0.3F, false));
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 40, 67, 1.79F, -0.85F, -0.6F, 1, 1, 1, -0.1F, false));

        this.head8_r2 = new ModelRenderer(this);
        this.head8_r2.setRotationPoint(-1.01F, -1.408F, -0.0394F);
        this.head.addChild(head8_r2);
        this.setRotateAngle(head8_r2, -1.3439F, 0.0F, 0.0F);
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 66, 40, -0.5F, -0.9863F, -0.0088F, 1, 1, 1, -0.003F, true));
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 66, 40, 1.52F, -0.9863F, -0.0088F, 1, 1, 1, -0.003F, false));

        this.head7_r2 = new ModelRenderer(this);
        this.head7_r2.setRotationPoint(-1.01F, -0.608F, 0.4606F);
        this.head.addChild(head7_r2);
        this.setRotateAngle(head7_r2, -0.4363F, 0.0F, 0.0F);
        this.head7_r2.cubeList.add(new ModelBox(head7_r2, 66, 0, -0.5F, -0.5F, -0.8F, 1, 2, 1, 0.0F, true));
        this.head7_r2.cubeList.add(new ModelBox(head7_r2, 66, 0, 1.52F, -0.5F, -0.8F, 1, 2, 1, 0.0F, false));

        this.head6_r1 = new ModelRenderer(this);
        this.head6_r1.setRotationPoint(1.32F, 0.2782F, 0.8997F);
        this.head.addChild(head6_r1);
        this.setRotateAngle(head6_r1, -0.8465F, 0.0F, 0.0F);
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 18, 0, -0.5F, -1.2F, -0.6F, 1, 2, 1, -0.3F, false));

        this.head3_r1 = new ModelRenderer(this);
        this.head3_r1.setRotationPoint(0.0F, -0.0862F, -1.3866F);
        this.head.addChild(head3_r1);
        this.setRotateAngle(head3_r1, -0.0436F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 36, 53, -1.5F, -2.2F, 1.0F, 3, 3, 2, 0.003F, false));

        this.head3_r2 = new ModelRenderer(this);
        this.head3_r2.setRotationPoint(0.0F, -1.0275F, 0.0464F);
        this.head.addChild(head3_r2);
        this.setRotateAngle(head3_r2, -0.9163F, 0.0F, 0.0F);
        this.head3_r2.cubeList.add(new ModelBox(head3_r2, 9, 25, -0.5F, -2.7F, 0.7F, 1, 2, 1, -0.003F, false));

        this.head2_r1 = new ModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, -2.7222F, -0.1179F);
        this.head.addChild(head2_r1);
        this.setRotateAngle(head2_r1, -1.8937F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 29, 22, -1.0F, -2.4175F, -0.0153F, 2, 2, 2, -0.003F, false));

        this.head2_r2 = new ModelRenderer(this);
        this.head2_r2.setRotationPoint(0.0F, -3.0553F, 16.8205F);
        this.head.addChild(head2_r2);
        this.setRotateAngle(head2_r2, 0.1047F, 0.0F, 0.0F);
        this.head2_r2.cubeList.add(new ModelBox(head2_r2, 0, 0, -0.5F, -0.013F, -14.9101F, 1, 1, 15, 0.0F, false));

        this.head1_r1 = new ModelRenderer(this);
        this.head1_r1.setRotationPoint(0.0F, -2.4553F, 3.0205F);
        this.head.addChild(head1_r1);
        this.setRotateAngle(head1_r1, -0.1745F, 0.0F, 0.0F);
        this.head1_r1.cubeList.add(new ModelBox(head1_r1, 12, 35, -0.5F, -0.349F, -8.1787F, 1, 1, 9, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.4432F, -0.4969F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4974F, 0.0F, 0.0F);


        this.jaw4_r1 = new ModelRenderer(this);
        this.jaw4_r1.setRotationPoint(0.5F, 0.1029F, -1.8606F);
        this.jaw.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, 0.0524F, 0.0F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 12, 38, -1.5F, -0.5F, -1.0F, 2, 1, 2, -0.003F, false));

        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(0.5F, -0.6882F, -1.5809F);
        this.jaw.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, 0.1396F, 0.0F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 46, 39, -1.5F, -0.0555F, -1.987F, 2, 1, 2, 0.003F, false));

        this.jaw2_r1 = new ModelRenderer(this);
        this.jaw2_r1.setRotationPoint(0.5F, 0.1118F, -0.8809F);
        this.jaw.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, -0.3142F, 0.0F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 59, 41, -1.5F, -0.6F, -0.9F, 2, 1, 2, 0.0F, false));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.1772F, -0.2629F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.0456F, 0.0F, 0.0F);


        this.jaw2_r2 = new ModelRenderer(this);
        this.jaw2_r2.setRotationPoint(0.0F, -0.3F, -10.2F);
        this.jaw2.addChild(jaw2_r2);
        this.setRotateAngle(jaw2_r2, 0.0175F, 0.0F, 0.0F);
        this.jaw2_r2.cubeList.add(new ModelBox(jaw2_r2, 33, 35, -1.0F, -0.0307F, -0.0057F, 2, 1, 8, 0.001F, false));

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
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 0, 65, -0.5F, -0.875F, -6.7882F, 1, 1, 2, -0.004F, false));

        this.shape64 = new ModelRenderer(this);
        this.shape64.setRotationPoint(0.0F, -0.1256F, -1.9026F);
        this.jaw5.addChild(shape64);
        this.setRotateAngle(shape64, -1.4114F, 0.0F, 0.0F);


        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(0.0F, 1.6F, -4.1F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.0456F, 0.0F, 0.0F);


        this.jaw9_r1 = new ModelRenderer(this);
        this.jaw9_r1.setRotationPoint(0.0F, 1.17F, -6.7413F);
        this.jaw4.addChild(jaw9_r1);
        this.setRotateAngle(jaw9_r1, 2.618F, 0.0F, 0.0F);
        this.jaw9_r1.cubeList.add(new ModelBox(jaw9_r1, 0, 17, -0.5F, -0.0138F, -0.9036F, 1, 2, 1, -0.02F, false));

        this.jaw8_r1 = new ModelRenderer(this);
        this.jaw8_r1.setRotationPoint(0.0F, 1.57F, -6.0413F);
        this.jaw4.addChild(jaw8_r1);
        this.setRotateAngle(jaw8_r1, -3.1067F, 0.0F, 0.0F);
        this.jaw8_r1.cubeList.add(new ModelBox(jaw8_r1, 8, 17, -0.5F, -0.0174F, -0.9974F, 1, 2, 1, -0.014F, false));

        this.jaw7_r1 = new ModelRenderer(this);
        this.jaw7_r1.setRotationPoint(0.0F, 1.1951F, -6.7906F);
        this.jaw4.addChild(jaw7_r1);
        this.setRotateAngle(jaw7_r1, 2.2166F, 0.0F, 0.0F);
        this.jaw7_r1.cubeList.add(new ModelBox(jaw7_r1, 55, 62, -0.5F, 0.0022F, 0.0216F, 1, 2, 2, -0.018F, false));

        this.jaw7_r2 = new ModelRenderer(this);
        this.jaw7_r2.setRotationPoint(0.0F, 1.4951F, -4.9906F);
        this.jaw4.addChild(jaw7_r2);
        this.setRotateAngle(jaw7_r2, 0.6109F, 0.0F, 0.0F);
        this.jaw7_r2.cubeList.add(new ModelBox(jaw7_r2, 44, 45, -0.5F, -2.4796F, 0.3533F, 1, 1, 1, -0.015F, false));
        this.jaw7_r2.cubeList.add(new ModelBox(jaw7_r2, 62, 55, -0.5F, -1.9796F, -0.0467F, 1, 2, 2, -0.019F, false));

        this.jaw5_r2 = new ModelRenderer(this);
        this.jaw5_r2.setRotationPoint(0.0F, 0.3374F, -3.4172F);
        this.jaw4.addChild(jaw5_r2);
        this.setRotateAngle(jaw5_r2, 0.9599F, 0.0F, 0.0F);
        this.jaw5_r2.cubeList.add(new ModelBox(jaw5_r2, 42, 59, -0.5F, -1.8343F, -0.034F, 1, 1, 1, -0.015F, false));
        this.jaw5_r2.cubeList.add(new ModelBox(jaw5_r2, 62, 64, -0.5F, -0.9343F, -0.034F, 1, 1, 2, -0.014F, false));

        this.underneck3 = new ModelRenderer(this);
        this.underneck3.setRotationPoint(0.0F, 0.5772F, -3.4629F);
        this.jaw.addChild(underneck3);
        this.setRotateAngle(underneck3, -0.2246F, 0.0F, 0.0F);


        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.4772F, -1.6629F);
        this.jaw.addChild(gums1);
        this.setRotateAngle(gums1, -0.055F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -0.9568F, -2.6969F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, -0.0456F, 0.0F, 0.0F);


        this.head3_r3 = new ModelRenderer(this);
        this.head3_r3.setRotationPoint(0.0F, 2.3F, -4.0F);
        this.head2.addChild(head3_r3);
        this.setRotateAngle(head3_r3, -0.0785F, 0.0F, 0.0F);
        this.head3_r3.cubeList.add(new ModelBox(head3_r3, 28, 45, -1.0F, -1.0583F, -5.0291F, 2, 1, 5, 0.015F, false));

        this.head2_r3 = new ModelRenderer(this);
        this.head2_r3.setRotationPoint(0.0F, 2.3F, -4.0F);
        this.head2.addChild(head2_r3);
        this.setRotateAngle(head2_r3, 0.0611F, 0.0F, 0.0F);
        this.head2_r3.cubeList.add(new ModelBox(head2_r3, 18, 0, -1.0F, -1.0583F, -0.0291F, 2, 1, 5, 0.01F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.4F, -7.5F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1367F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -0.66F, 4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.0948F, 0.0F, 0.0F);


        this.head6_r2 = new ModelRenderer(this);
        this.head6_r2.setRotationPoint(0.0F, 2.0315F, -8.0556F);
        this.head5.addChild(head6_r2);
        this.setRotateAngle(head6_r2, 0.3491F, 0.0F, 0.0F);
        this.head6_r2.cubeList.add(new ModelBox(head6_r2, 53, 28, -0.5F, -0.0726F, -0.1933F, 1, 1, 4, 0.0F, false));

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


        this.head6_r3 = new ModelRenderer(this);
        this.head6_r3.setRotationPoint(0.0F, 1.3896F, -11.3886F);
        this.head4.addChild(head6_r3);
        this.setRotateAngle(head6_r3, 1.1519F, 0.0F, 0.0F);
        this.head6_r3.cubeList.add(new ModelBox(head6_r3, 0, 17, -0.5F, 0.0057F, -0.1278F, 1, 2, 5, -0.021F, false));

        this.head6_r4 = new ModelRenderer(this);
        this.head6_r4.setRotationPoint(0.0F, 4.0226F, 1.6536F);
        this.head4.addChild(head6_r4);
        this.setRotateAngle(head6_r4, 0.2356F, 0.0F, 0.0F);
        this.head6_r4.cubeList.add(new ModelBox(head6_r4, 61, 7, -1.0F, -1.037F, 0.0281F, 2, 1, 2, 0.003F, false));

        this.head6_r5 = new ModelRenderer(this);
        this.head6_r5.setRotationPoint(0.0F, 1.2226F, -0.4464F);
        this.head4.addChild(head6_r5);
        this.setRotateAngle(head6_r5, -0.2705F, 0.0F, 0.0F);
        this.head6_r5.cubeList.add(new ModelBox(head6_r5, 3, 3, -1.0F, 1.1F, 1.2F, 2, 1, 1, 0.003F, false));

        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(0.0F, 2.0405F, 2.1287F);
        this.head4.addChild(head5_r1);
        this.setRotateAngle(head5_r1, -0.3142F, 0.0F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 3, 3, -1.0F, -2.0F, -0.5F, 2, 4, 1, 0.003F, false));

        this.head5_r2 = new ModelRenderer(this);
        this.head5_r2.setRotationPoint(0.0F, -1.85F, -2.3F);
        this.head4.addChild(head5_r2);
        this.setRotateAngle(head5_r2, 0.0175F, 0.0F, 0.0F);
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 41, 19, -0.5F, -0.0286F, -6.8882F, 1, 1, 7, 0.003F, false));
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 42, 6, -0.5F, 0.9714F, -6.8882F, 1, 2, 1, 0.006F, false));

        this.head6_r6 = new ModelRenderer(this);
        this.head6_r6.setRotationPoint(-0.5F, -0.4674F, -6.7528F);
        this.head4.addChild(head6_r6);
        this.setRotateAngle(head6_r6, -1.3439F, 0.0F, 0.0F);
        this.head6_r6.cubeList.add(new ModelBox(head6_r6, 42, 6, 0.0F, -1.959F, -1.0453F, 1, 2, 1, 0.006F, false));

        this.head5_r3 = new ModelRenderer(this);
        this.head5_r3.setRotationPoint(-0.5F, 0.4326F, -8.1528F);
        this.head4.addChild(head5_r3);
        this.setRotateAngle(head5_r3, -0.9774F, 0.0F, 0.0F);
        this.head5_r3.cubeList.add(new ModelBox(head5_r3, 42, 6, 0.0F, -2.0229F, -1.0086F, 1, 2, 1, 0.009F, false));

        this.crest1 = new ModelRenderer(this);
        this.crest1.setRotationPoint(0.0F, -6.2568F, 7.7531F);
        this.head.addChild(crest1);
        this.setRotateAngle(crest1, -0.0911F, 0.0F, 0.0F);


        this.crest4_r1 = new ModelRenderer(this);
        this.crest4_r1.setRotationPoint(0.0F, -1.2855F, -16.3311F);
        this.crest1.addChild(crest4_r1);
        this.setRotateAngle(crest4_r1, -2.7489F, 0.0F, 0.0F);
        this.crest4_r1.cubeList.add(new ModelBox(crest4_r1, 49, 64, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.003F, false));

        this.crest6_r1 = new ModelRenderer(this);
        this.crest6_r1.setRotationPoint(0.0F, 1.3896F, -13.2386F);
        this.crest1.addChild(crest6_r1);
        this.setRotateAngle(crest6_r1, -1.2479F, 0.0F, 0.0F);
        this.crest6_r1.cubeList.add(new ModelBox(crest6_r1, 17, 19, -0.5F, -0.152F, -0.0386F, 1, 6, 2, -0.02F, false));

        this.crest5_r1 = new ModelRenderer(this);
        this.crest5_r1.setRotationPoint(0.0F, -0.2104F, -14.2386F);
        this.crest1.addChild(crest5_r1);
        this.setRotateAngle(crest5_r1, -0.9512F, 0.0F, 0.0F);
        this.crest5_r1.cubeList.add(new ModelBox(crest5_r1, 59, 0, -0.5F, -0.037F, -0.0553F, 1, 4, 2, -0.022F, false));

        this.crest4_r2 = new ModelRenderer(this);
        this.crest4_r2.setRotationPoint(0.0F, -1.4104F, -15.9386F);
        this.crest1.addChild(crest4_r2);
        this.setRotateAngle(crest4_r2, -0.6196F, 0.0F, 0.0F);
        this.crest4_r2.cubeList.add(new ModelBox(crest4_r2, 0, 33, -0.5F, -0.0473F, 0.1255F, 1, 5, 2, -0.017F, false));

        this.crest6_r2 = new ModelRenderer(this);
        this.crest6_r2.setRotationPoint(0.0F, -6.6104F, -15.7386F);
        this.crest1.addChild(crest6_r2);
        this.setRotateAngle(crest6_r2, -0.5847F, 0.0F, 0.0F);
        this.crest6_r2.cubeList.add(new ModelBox(crest6_r2, 15, 46, -0.5F, -12.7665F, -0.2693F, 1, 13, 1, -0.31F, false));

        this.crest5_r2 = new ModelRenderer(this);
        this.crest5_r2.setRotationPoint(0.0F, 1.7896F, -19.2386F);
        this.crest1.addChild(crest5_r2);
        this.setRotateAngle(crest5_r2, -0.3927F, 0.0F, 0.0F);
        this.crest5_r2.cubeList.add(new ModelBox(crest5_r2, 0, 0, -0.5F, -9.4665F, -0.2503F, 1, 3, 1, -0.3F, false));
        this.crest5_r2.cubeList.add(new ModelBox(crest5_r2, 10, 0, -0.5F, -6.8665F, -0.0503F, 1, 3, 1, -0.02F, false));
        this.crest5_r2.cubeList.add(new ModelBox(crest5_r2, 59, 15, -0.5F, -3.9665F, -0.0503F, 1, 4, 2, -0.02F, false));

        this.crest2_r1 = new ModelRenderer(this);
        this.crest2_r1.setRotationPoint(0.0F, 3.6896F, -19.6386F);
        this.crest1.addChild(crest2_r1);
        this.setRotateAngle(crest2_r1, -0.288F, 0.0F, 0.0F);
        this.crest2_r1.cubeList.add(new ModelBox(crest2_r1, 62, 50, -0.5F, -2.0019F, -0.2064F, 1, 2, 2, -0.023F, false));

        this.crest2 = new ModelRenderer(this);
        this.crest2.setRotationPoint(0.0F, -0.7F, 1.3F);
        this.crest1.addChild(crest2);
        this.setRotateAngle(crest2, 0.0456F, 0.0F, 0.0F);


        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.4F, -0.5F, -1.1F);
        this.chest1.addChild(leftwing1);
        this.setRotateAngle(leftwing1, -0.2106F, -0.5437F, -0.4287F);


        this.upperwing8_r1 = new ModelRenderer(this);
        this.upperwing8_r1.setRotationPoint(1.0746F, 0.0368F, 0.2605F);
        this.leftwing1.addChild(upperwing8_r1);
        this.setRotateAngle(upperwing8_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 29, 19, -0.25F, -0.5F, -0.5F, 5, 1, 1, 0.0F, false));
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 36, 10, -1.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(5.4709F, 0.2106F, -0.2119F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.4413F, 0.5865F, -2.9665F);


        this.wing10_r1 = new ModelRenderer(this);
        this.wing10_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing10_r1);
        this.setRotateAngle(wing10_r1, 0.0F, 0.0F, 0.0F);
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 56, 7, -0.9072F, -2.9026F, -0.7631F, 1, 8, 1, -0.2F, false));
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 20, 59, -0.9072F, -2.9026F, 0.0369F, 1, 8, 1, -0.15F, false));

        this.wing8_r1 = new ModelRenderer(this);
        this.wing8_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing8_r1);
        this.setRotateAngle(wing8_r1, 0.0F, -1.5708F, 0.4974F);
        this.wing8_r1.cubeList.add(new ModelBox(wing8_r1, 0, 44, -0.3631F, 0.9633F, -3.2225F, 1, 4, 1, -0.21F, false));

        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.7436F, 7.6223F, -0.3825F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.1002F, 0.2192F, 0.5542F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 47, 53, -0.5F, 0.0F, 0.0F, 1, 9, 1, -0.11F, false));

        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(-0.1051F, 9.0992F, 0.6788F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.9385F, -0.6132F, -3.0972F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 19, 3, -0.5799F, -0.5164F, -0.654F, 1, 1, 14, -0.2F, false));

        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.1256F, 0.4829F, 13.3508F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.1461F, 0.0632F, 0.1958F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 0, 44, -0.5F, -1.0F, -0.3F, 1, 1, 6, -0.2F, false));

        this.wingfinger9_r1 = new ModelRenderer(this);
        this.wingfinger9_r1.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.leftwing5.addChild(wingfinger9_r1);
        this.setRotateAngle(wingfinger9_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger9_r1.cubeList.add(new ModelBox(wingfinger9_r1, 29, 24, -0.5F, -1.0F, 0.2F, 1, 1, 9, -0.2F, false));

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
        this.setRotateAngle(lefthand2, 1.2451F, 1.4993F, -2.6545F);
        this.lefthand2.cubeList.add(new ModelBox(lefthand2, 60, 60, -1.0495F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

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
        this.rightwing1.setRotationPoint(-2.4F, -0.5F, -1.1F);
        this.chest1.addChild(rightwing1);
        this.setRotateAngle(rightwing1, -0.2608F, 0.5233F, 0.3301F);


        this.upperwing9_r1 = new ModelRenderer(this);
        this.upperwing9_r1.setRotationPoint(-1.0746F, 0.0368F, 0.2605F);
        this.rightwing1.addChild(upperwing9_r1);
        this.setRotateAngle(upperwing9_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 28, 0, -4.75F, -0.5F, -0.5F, 5, 1, 1, 0.0F, false));
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 27, 9, 0.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-5.4709F, 0.2106F, -0.2119F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -1.4079F, -0.8455F, 2.9161F);


        this.wing11_r1 = new ModelRenderer(this);
        this.wing11_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing11_r1);
        this.setRotateAngle(wing11_r1, 0.0F, 0.0F, 0.0F);
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 52, 53, -0.0928F, -2.9026F, -0.7631F, 1, 8, 1, -0.2F, false));
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 57, 52, -0.0928F, -2.9026F, 0.0369F, 1, 8, 1, -0.15F, false));

        this.wing9_r1 = new ModelRenderer(this);
        this.wing9_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing9_r1);
        this.setRotateAngle(wing9_r1, 0.0F, 1.5708F, -0.4974F);
        this.wing9_r1.cubeList.add(new ModelBox(wing9_r1, 24, 33, -0.6369F, 0.9633F, -3.2225F, 1, 4, 1, -0.21F, false));

        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.7436F, 7.6223F, -0.3825F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.0179F, -0.2401F, -0.1963F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 10, 52, -0.5F, 0.0F, 0.0F, 1, 9, 1, -0.11F, false));

        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(0.1051F, 9.0992F, 0.6788F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.8949F, 0.6132F, 3.0972F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 0, 17, -0.4201F, -0.5164F, -0.654F, 1, 1, 14, -0.2F, false));

        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.1256F, 0.4829F, 13.3508F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.1461F, -0.0632F, -0.1958F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 24, 35, -0.5F, -1.0F, -0.3F, 1, 1, 6, -0.2F, false));

        this.wingfinger10_r1 = new ModelRenderer(this);
        this.wingfinger10_r1.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.rightwing5.addChild(wingfinger10_r1);
        this.setRotateAngle(wingfinger10_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger10_r1.cubeList.add(new ModelBox(wingfinger10_r1, 17, 19, -0.5F, -1.0F, 0.2F, 1, 1, 9, -0.2F, false));

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
        this.setRotateAngle(righthand2, 1.2451F, -1.4993F, 2.6545F);
        this.righthand2.cubeList.add(new ModelBox(righthand2, 60, 34, -0.9505F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

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
