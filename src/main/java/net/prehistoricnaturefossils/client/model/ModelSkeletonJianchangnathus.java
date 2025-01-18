package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonJianchangnathus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer chest1;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer chest5_r1;
    private final ModelRenderer chest4_r1;
    private final ModelRenderer chest5_r2;
    private final ModelRenderer chest5_r3;
    private final ModelRenderer chest4_r2;
    private final ModelRenderer chest6_r1;
    private final ModelRenderer chest4_r3;
    private final ModelRenderer chest3_r2;
    private final ModelRenderer chest4_r4;
    private final ModelRenderer chest4_r5;
    private final ModelRenderer chest3_r3;
    private final ModelRenderer chest2_r2;
    private final ModelRenderer chest5_r4;
    private final ModelRenderer body1;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer body5_r1;
    private final ModelRenderer chest7_r1;
    private final ModelRenderer chest8_r1;
    private final ModelRenderer chest6_r2;
    private final ModelRenderer chest7_r2;
    private final ModelRenderer body4_r1;
    private final ModelRenderer body5_r2;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body7_r1;
    private final ModelRenderer body6_r2;
    private final ModelRenderer body5_r3;
    private final ModelRenderer body3_r2;
    private final ModelRenderer body4_r2;
    private final ModelRenderer body5_r4;
    private final ModelRenderer body4_r3;
    private final ModelRenderer body2_r2;
    private final ModelRenderer body2_r3;
    private final ModelRenderer chest7_r3;
    private final ModelRenderer chest6_r3;
    private final ModelRenderer chest6_r4;
    private final ModelRenderer chest5_r5;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer leftleg1;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leg6_r1;
    private final ModelRenderer leftfoot;
    private final ModelRenderer feet6_r1;
    private final ModelRenderer leftlegwing2;
    private final ModelRenderer leftlegwing1;
    private final ModelRenderer rightleg1;
    private final ModelRenderer rightleg2;
    private final ModelRenderer leg7_r1;
    private final ModelRenderer rightfoot;
    private final ModelRenderer feet7_r1;
    private final ModelRenderer rightlegwing2;
    private final ModelRenderer rightlegwing1;
    private final ModelRenderer neck1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck1_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer head;
    private final ModelRenderer head10_r1;
    private final ModelRenderer head11_r1;
    private final ModelRenderer head11_r2;
    private final ModelRenderer head12_r1;
    private final ModelRenderer head10_r2;
    private final ModelRenderer head11_r3;
    private final ModelRenderer head7_r1;
    private final ModelRenderer head8_r1;
    private final ModelRenderer head9_r1;
    private final ModelRenderer head11_r4;
    private final ModelRenderer head8_r2;
    private final ModelRenderer head7_r2;
    private final ModelRenderer head6_r1;
    private final ModelRenderer head7_r3;
    private final ModelRenderer head7_r4;
    private final ModelRenderer head9_r2;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head5_r1;
    private final ModelRenderer head3_r1;
    private final ModelRenderer head2_r1;
    private final ModelRenderer head1_r1;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2_r1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw6_r1;
    private final ModelRenderer jaw5_r1;
    private final ModelRenderer jaw5_r2;
    private final ModelRenderer jaw5_r3;
    private final ModelRenderer jaw5_r4;
    private final ModelRenderer jaw4_r1;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw2_r2;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw5;
    private final ModelRenderer jaw5_r5;
    private final ModelRenderer shape64;
    private final ModelRenderer jaw4;
    private final ModelRenderer underneck3;
    private final ModelRenderer gums1;
    private final ModelRenderer head2;
    private final ModelRenderer head4_r2;
    private final ModelRenderer head2_r2;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer head7_r5;
    private final ModelRenderer lips1;
    private final ModelRenderer lips2;
    private final ModelRenderer head4;
    private final ModelRenderer head9_r3;
    private final ModelRenderer head9_r4;
    private final ModelRenderer head8_r3;
    private final ModelRenderer head9_r5;
    private final ModelRenderer head10_r3;
    private final ModelRenderer head11_r5;
    private final ModelRenderer head12_r2;
    private final ModelRenderer head5_r2;
    private final ModelRenderer head8_r4;
    private final ModelRenderer head11_r6;
    private final ModelRenderer head10_r4;
    private final ModelRenderer head9_r6;
    private final ModelRenderer head9_r7;
    private final ModelRenderer head7_r6;
    private final ModelRenderer head6_r2;
    private final ModelRenderer head5_r3;
    private final ModelRenderer crest1;
    private final ModelRenderer crest2;
    private final ModelRenderer leftwing1;
    private final ModelRenderer upperwing8_r1;
    private final ModelRenderer upperwing7_r1;
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
    private final ModelRenderer upperwing8_r2;
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

    public ModelSkeletonJianchangnathus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -9.25F, 0.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);


        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, -1.0681F, -1.5176F);
        this.root.addChild(chest1);
        this.setRotateAngle(chest1, -0.6241F, 0.0F, 0.0F);


        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(0.0F, -1.0503F, -0.3905F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, 0.0698F, 0.0F, 0.0F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 45, 53, 0.0F, -0.3F, -0.5F, 0, 1, 1, 0.0F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, -0.4F, -1.3F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.1571F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 59, 40, 0.0F, -0.7F, -1.5F, 0, 1, 1, 0.0F, false));
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 27, 43, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.003F, false));

        this.chest5_r1 = new ModelRenderer(this);
        this.chest5_r1.setRotationPoint(-2.2F, -0.2963F, -2.4469F);
        this.chest1.addChild(chest5_r1);
        this.setRotateAngle(chest5_r1, 1.9477F, 0.6105F, -0.2383F);
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 45, 43, -0.6197F, -0.6653F, -2.8318F, 1, 1, 3, -0.2F, true));

        this.chest4_r1 = new ModelRenderer(this);
        this.chest4_r1.setRotationPoint(-1.0F, -0.2963F, -0.9469F);
        this.chest1.addChild(chest4_r1);
        this.setRotateAngle(chest4_r1, 0.1767F, 0.4736F, 0.0813F);
        this.chest4_r1.cubeList.add(new ModelBox(chest4_r1, 0, 44, -1.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, true));

        this.chest5_r2 = new ModelRenderer(this);
        this.chest5_r2.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r2);
        this.setRotateAngle(chest5_r2, 0.2362F, 0.0906F, -0.6958F);
        this.chest5_r2.cubeList.add(new ModelBox(chest5_r2, 20, 26, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest5_r3 = new ModelRenderer(this);
        this.chest5_r3.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest5_r3);
        this.setRotateAngle(chest5_r3, 0.2567F, 0.3201F, -1.2334F);
        this.chest5_r3.cubeList.add(new ModelBox(chest5_r3, 59, 30, -1.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest4_r2 = new ModelRenderer(this);
        this.chest4_r2.setRotationPoint(-0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r2);
        this.setRotateAngle(chest4_r2, 0.3904F, 0.1198F, -0.6404F);
        this.chest4_r2.cubeList.add(new ModelBox(chest4_r2, 59, 32, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest6_r1 = new ModelRenderer(this);
        this.chest6_r1.setRotationPoint(-0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest6_r1);
        this.setRotateAngle(chest6_r1, 0.1426F, 0.2093F, -1.3024F);
        this.chest6_r1.cubeList.add(new ModelBox(chest6_r1, 13, 26, -2.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest4_r3 = new ModelRenderer(this);
        this.chest4_r3.setRotationPoint(2.2F, -0.2963F, -2.4469F);
        this.chest1.addChild(chest4_r3);
        this.setRotateAngle(chest4_r3, 1.9477F, -0.6105F, 0.2383F);
        this.chest4_r3.cubeList.add(new ModelBox(chest4_r3, 45, 43, -0.3803F, -0.6653F, -2.8318F, 1, 1, 3, -0.2F, false));

        this.chest3_r2 = new ModelRenderer(this);
        this.chest3_r2.setRotationPoint(1.0F, -0.2963F, -0.9469F);
        this.chest1.addChild(chest3_r2);
        this.setRotateAngle(chest3_r2, 0.1767F, -0.4736F, -0.0813F);
        this.chest3_r2.cubeList.add(new ModelBox(chest3_r2, 0, 44, 0.0F, -0.5F, -2.0F, 1, 1, 3, -0.2F, false));

        this.chest4_r4 = new ModelRenderer(this);
        this.chest4_r4.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest4_r4);
        this.setRotateAngle(chest4_r4, 0.2362F, -0.0906F, 0.6958F);
        this.chest4_r4.cubeList.add(new ModelBox(chest4_r4, 20, 26, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest4_r5 = new ModelRenderer(this);
        this.chest4_r5.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest4_r5);
        this.setRotateAngle(chest4_r5, 0.2567F, -0.3201F, 1.2334F);
        this.chest4_r5.cubeList.add(new ModelBox(chest4_r5, 59, 30, 0.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest3_r3 = new ModelRenderer(this);
        this.chest3_r3.setRotationPoint(0.5F, -0.4436F, -2.2877F);
        this.chest1.addChild(chest3_r3);
        this.setRotateAngle(chest3_r3, 0.3904F, -0.1198F, 0.6404F);
        this.chest3_r3.cubeList.add(new ModelBox(chest3_r3, 59, 32, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest2_r2 = new ModelRenderer(this);
        this.chest2_r2.setRotationPoint(0.0F, 1.2791F, -1.0341F);
        this.chest1.addChild(chest2_r2);
        this.setRotateAngle(chest2_r2, -0.1571F, 0.0F, 0.0F);
        this.chest2_r2.cubeList.add(new ModelBox(chest2_r2, 26, 28, -1.5F, 0.6F, -0.9F, 3, 1, 3, 0.0F, false));

        this.chest5_r4 = new ModelRenderer(this);
        this.chest5_r4.setRotationPoint(0.5F, -0.6436F, -0.2877F);
        this.chest1.addChild(chest5_r4);
        this.setRotateAngle(chest5_r4, 0.1426F, -0.2093F, 1.3024F);
        this.chest5_r4.cubeList.add(new ModelBox(chest5_r4, 13, 26, 0.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.8F, 0.1F);
        this.chest1.addChild(body1);
        this.setRotateAngle(body1, -0.0494F, 0.0F, 0.0F);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -0.032F, 3.5171F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.1658F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 22, 49, 0.0F, -0.2F, -0.5F, 0, 1, 1, 0.0F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -0.1576F, -0.0808F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0349F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 59, 37, 0.0F, -0.5F, 1.1F, 0, 1, 1, 0.0F, false));
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 0, 33, -0.5F, -0.1F, 0.1F, 1, 1, 4, 0.0F, false));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(0.1318F, 2.6136F, 4.0665F);
        this.body1.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -0.8269F, 0.0282F, 0.1083F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 58, 24, -0.5F, -0.5F, -0.6869F, 1, 1, 1, -0.31F, false));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 25, 57, -0.5F, -0.5F, -0.3131F, 1, 1, 1, -0.31F, false));

        this.chest7_r1 = new ModelRenderer(this);
        this.chest7_r1.setRotationPoint(-0.5F, 0.1564F, 3.6123F);
        this.body1.addChild(chest7_r1);
        this.setRotateAngle(chest7_r1, -0.0728F, -0.1669F, -0.6838F);
        this.chest7_r1.cubeList.add(new ModelBox(chest7_r1, 30, 59, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest8_r1 = new ModelRenderer(this);
        this.chest8_r1.setRotationPoint(-0.5F, 0.1564F, 3.6123F);
        this.body1.addChild(chest8_r1);
        this.setRotateAngle(chest8_r1, 0.0371F, -0.1782F, -1.3041F);
        this.chest8_r1.cubeList.add(new ModelBox(chest8_r1, 51, 19, -1.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest6_r2 = new ModelRenderer(this);
        this.chest6_r2.setRotationPoint(-0.5F, 0.1564F, 1.6123F);
        this.body1.addChild(chest6_r2);
        this.setRotateAngle(chest6_r2, 0.1826F, 0.0458F, -0.6994F);
        this.chest6_r2.cubeList.add(new ModelBox(chest6_r2, 47, 36, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest7_r2 = new ModelRenderer(this);
        this.chest7_r2.setRotationPoint(-0.5F, 0.1564F, 1.6123F);
        this.body1.addChild(chest7_r2);
        this.setRotateAngle(chest7_r2, 0.1239F, 0.142F, -1.3057F);
        this.chest7_r2.cubeList.add(new ModelBox(chest7_r2, 39, 31, -2.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(-1.6F, 0.8678F, 5.9031F);
        this.body1.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -0.7859F, 0.0386F, -0.5263F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 10, 53, -0.0369F, 0.9758F, -0.0098F, 1, 2, 1, -0.31F, true));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(-1.6F, 0.8678F, 5.9031F);
        this.body1.addChild(body5_r2);
        this.setRotateAngle(body5_r2, -0.9139F, -0.0848F, -0.6498F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 5, 53, -0.3059F, -0.5403F, -0.6344F, 1, 2, 1, -0.31F, true));

        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-1.6F, 0.8678F, 5.9031F);
        this.body1.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -1.1582F, -0.0848F, -0.6498F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 47, 31, -0.3059F, -0.5942F, -0.2612F, 1, 2, 2, -0.3F, true));

        this.body7_r1 = new ModelRenderer(this);
        this.body7_r1.setRotationPoint(-1.6F, 0.8678F, 5.3031F);
        this.body1.addChild(body7_r1);
        this.setRotateAngle(body7_r1, 0.1484F, 0.0F, 0.0F);
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 48, 3, -0.3F, -0.7911F, -0.3333F, 1, 1, 2, -0.3F, true));
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 48, 3, 2.5F, -0.7911F, -0.3333F, 1, 1, 2, -0.3F, false));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(-1.6F, 0.8678F, 5.9031F);
        this.body1.addChild(body6_r2);
        this.setRotateAngle(body6_r2, -0.4014F, 0.0F, 0.0F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 42, 17, 0.1F, -0.6245F, -1.1093F, 2, 1, 2, -0.3F, true));
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 42, 17, 1.1F, -0.6245F, -1.1093F, 2, 1, 2, -0.3F, false));

        this.body5_r3 = new ModelRenderer(this);
        this.body5_r3.setRotationPoint(-1.6F, 0.8678F, 5.9031F);
        this.body1.addChild(body5_r3);
        this.setRotateAngle(body5_r3, -0.2336F, -0.1766F, 0.0758F);
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 38, 21, -0.3049F, -0.6245F, -2.9088F, 1, 1, 3, -0.3F, true));

        this.body3_r2 = new ModelRenderer(this);
        this.body3_r2.setRotationPoint(1.6F, 0.8678F, 5.9031F);
        this.body1.addChild(body3_r2);
        this.setRotateAngle(body3_r2, -0.7859F, -0.0386F, 0.5263F);
        this.body3_r2.cubeList.add(new ModelBox(body3_r2, 10, 53, -0.9631F, 0.9758F, -0.0098F, 1, 2, 1, -0.31F, false));

        this.body4_r2 = new ModelRenderer(this);
        this.body4_r2.setRotationPoint(1.6F, 0.8678F, 5.9031F);
        this.body1.addChild(body4_r2);
        this.setRotateAngle(body4_r2, -0.9139F, 0.0848F, 0.6498F);
        this.body4_r2.cubeList.add(new ModelBox(body4_r2, 5, 53, -0.6941F, -0.5403F, -0.6344F, 1, 2, 1, -0.31F, false));

        this.body5_r4 = new ModelRenderer(this);
        this.body5_r4.setRotationPoint(1.6F, 0.8678F, 5.9031F);
        this.body1.addChild(body5_r4);
        this.setRotateAngle(body5_r4, -1.1582F, 0.0848F, 0.6498F);
        this.body5_r4.cubeList.add(new ModelBox(body5_r4, 47, 31, -0.6941F, -0.5942F, -0.2612F, 1, 2, 2, -0.3F, false));

        this.body4_r3 = new ModelRenderer(this);
        this.body4_r3.setRotationPoint(1.6F, 0.8678F, 5.9031F);
        this.body1.addChild(body4_r3);
        this.setRotateAngle(body4_r3, -0.2336F, 0.1766F, -0.0758F);
        this.body4_r3.cubeList.add(new ModelBox(body4_r3, 38, 21, -0.6951F, -0.6245F, -2.9088F, 1, 1, 3, -0.3F, false));

        this.body2_r2 = new ModelRenderer(this);
        this.body2_r2.setRotationPoint(0.0F, -0.1576F, 4.0192F);
        this.body1.addChild(body2_r2);
        this.setRotateAngle(body2_r2, -0.1222F, 0.0F, 0.0F);
        this.body2_r2.cubeList.add(new ModelBox(body2_r2, 39, 26, -0.5F, 0.0431F, 0.0025F, 1, 1, 3, 0.0F, false));

        this.body2_r3 = new ModelRenderer(this);
        this.body2_r3.setRotationPoint(0.0F, 2.9424F, 4.1192F);
        this.body1.addChild(body2_r3);
        this.setRotateAngle(body2_r3, 0.2967F, 0.0F, 0.0F);
        this.body2_r3.cubeList.add(new ModelBox(body2_r3, 13, 28, -1.5F, -0.9515F, -2.9056F, 3, 1, 3, 0.0F, false));

        this.chest7_r3 = new ModelRenderer(this);
        this.chest7_r3.setRotationPoint(0.5F, 0.1564F, 3.6123F);
        this.body1.addChild(chest7_r3);
        this.setRotateAngle(chest7_r3, 0.0371F, 0.1782F, 1.3041F);
        this.chest7_r3.cubeList.add(new ModelBox(chest7_r3, 51, 19, 0.8192F, -0.5736F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest6_r3 = new ModelRenderer(this);
        this.chest6_r3.setRotationPoint(0.5F, 0.1564F, 3.6123F);
        this.body1.addChild(chest6_r3);
        this.setRotateAngle(chest6_r3, -0.0728F, 0.1669F, 0.6838F);
        this.chest6_r3.cubeList.add(new ModelBox(chest6_r3, 30, 59, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest6_r4 = new ModelRenderer(this);
        this.chest6_r4.setRotationPoint(0.5F, 0.1564F, 1.6123F);
        this.body1.addChild(chest6_r4);
        this.setRotateAngle(chest6_r4, 0.1239F, -0.142F, 1.3057F);
        this.chest6_r4.cubeList.add(new ModelBox(chest6_r4, 39, 31, 0.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, false));

        this.chest5_r5 = new ModelRenderer(this);
        this.chest5_r5.setRotationPoint(0.5F, 0.1564F, 1.6123F);
        this.body1.addChild(chest5_r5);
        this.setRotateAngle(chest5_r5, 0.1826F, -0.0458F, 0.6994F);
        this.chest5_r5.cubeList.add(new ModelBox(chest5_r5, 47, 36, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.6975F, 6.8519F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, 0.6432F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 27, 38, -0.5F, -0.4684F, -0.0634F, 1, 1, 3, 0.003F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.009F, 2.7893F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.4266F, 0.076F, 0.0429F);
        this.tail2.cubeList.add(new ModelBox(tail2, 25, 12, -0.5F, -0.4684F, -0.0634F, 1, 1, 7, 0.003F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0283F, 6.9994F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2159F, 0.087F, 0.0074F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -0.5F, -0.4997F, -0.0911F, 1, 1, 11, 0.003F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.4601F, 0.8564F, 5.4692F);
        this.body1.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.1631F, -0.1274F, -0.4204F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 16, 38, -0.3039F, 0.0711F, -0.3881F, 1, 4, 1, 0.0F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.1435F, 3.9933F, 0.3866F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.7593F, 0.1076F, 0.3583F);


        this.leg6_r1 = new ModelRenderer(this);
        this.leg6_r1.setRotationPoint(-0.0191F, 1.592F, -0.1464F);
        this.leftleg2.addChild(leg6_r1);
        this.setRotateAngle(leg6_r1, 3.0543F, 0.0F, 3.1416F);
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 25, 48, -1.15F, -2.0F, -0.5F, 1, 4, 1, -0.2F, false));
        this.leg6_r1.cubeList.add(new ModelBox(leg6_r1, 48, 25, -0.05F, -2.0F, -0.5F, 1, 4, 1, -0.1F, false));

        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0416F, 3.9665F, 0.196F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.0927F, 0.0938F, 0.0177F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 11, 33, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

        this.feet6_r1 = new ModelRenderer(this);
        this.feet6_r1.setRotationPoint(-0.8F, 0.3F, 0.0F);
        this.leftfoot.addChild(feet6_r1);
        this.setRotateAngle(feet6_r1, 0.2265F, -0.5556F, -0.121F);
        this.feet6_r1.cubeList.add(new ModelBox(feet6_r1, 36, 43, -0.4F, -0.8F, -0.2F, 1, 1, 3, -0.15F, false));

        this.leftlegwing2 = new ModelRenderer(this);
        this.leftlegwing2.setRotationPoint(-0.4691F, 0.092F, 0.4536F);
        this.leftleg2.addChild(leftlegwing2);
        this.setRotateAngle(leftlegwing2, -0.0141F, 0.0F, 0.0F);


        this.leftlegwing1 = new ModelRenderer(this);
        this.leftlegwing1.setRotationPoint(-0.6039F, 0.0711F, 1.1119F);
        this.leftleg1.addChild(leftlegwing1);
        this.setRotateAngle(leftlegwing1, 0.1367F, 0.0F, 0.0F);


        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.4601F, 0.8564F, 5.4692F);
        this.body1.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.0551F, 0.1274F, 0.4204F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 16, 38, -0.6961F, 0.0711F, -0.3881F, 1, 4, 1, 0.0F, true));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.1435F, 3.9933F, 0.3866F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.7593F, -0.1076F, -0.3583F);


        this.leg7_r1 = new ModelRenderer(this);
        this.leg7_r1.setRotationPoint(0.0191F, 1.592F, -0.1464F);
        this.rightleg2.addChild(leg7_r1);
        this.setRotateAngle(leg7_r1, 3.0543F, 0.0F, -3.1416F);
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 25, 48, 0.15F, -2.0F, -0.5F, 1, 4, 1, -0.2F, true));
        this.leg7_r1.cubeList.add(new ModelBox(leg7_r1, 48, 25, -0.95F, -2.0F, -0.5F, 1, 4, 1, -0.1F, true));

        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.0416F, 3.9665F, 0.196F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.3545F, -0.0938F, -0.0177F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 11, 33, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, true));

        this.feet7_r1 = new ModelRenderer(this);
        this.feet7_r1.setRotationPoint(0.8F, 0.3F, 0.0F);
        this.rightfoot.addChild(feet7_r1);
        this.setRotateAngle(feet7_r1, 0.2265F, 0.5556F, 0.121F);
        this.feet7_r1.cubeList.add(new ModelBox(feet7_r1, 36, 43, -0.6F, -0.8F, -0.2F, 1, 1, 3, -0.15F, true));

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
        this.setRotateAngle(neck1, -0.1772F, -0.1719F, 0.0306F);


        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, 0.1539F, -0.8135F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.1745F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 38, 59, 0.0F, -0.4F, -0.5F, 0, 1, 1, 0.0F, false));

        this.neck1_r1 = new ModelRenderer(this);
        this.neck1_r1.setRotationPoint(0.0F, 0.8445F, -0.5832F);
        this.neck1.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, 0.0436F, 0.0F, 0.0F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 48, 7, -0.5F, -0.9F, -0.7F, 1, 1, 2, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4119F, -1.1294F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3352F, -0.5416F, 0.1777F);
        this.neck2.cubeList.add(new ModelBox(neck2, 45, 38, -0.5F, -0.4178F, -2.9187F, 1, 1, 3, 0.003F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 35, 59, 0.0F, -0.6178F, -1.9187F, 0, 1, 1, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0178F, -2.8187F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.608F, -0.4131F, -0.5232F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.0F, -0.2072F, -0.1519F);
        this.neck3.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, -0.0873F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 55, 6, -0.5F, -0.3F, -0.5F, 1, 1, 1, -0.01F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0527F, -0.5388F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 1.7645F, -0.1879F, -1.034F);


        this.head10_r1 = new ModelRenderer(this);
        this.head10_r1.setRotationPoint(-1.32F, -1.9702F, -4.8978F);
        this.head.addChild(head10_r1);
        this.setRotateAngle(head10_r1, -1.4748F, 0.0F, 0.0F);
        this.head10_r1.cubeList.add(new ModelBox(head10_r1, 51, 11, 0.56F, -0.5F, -0.5F, 1, 2, 1, -0.25F, true));
        this.head10_r1.cubeList.add(new ModelBox(head10_r1, 51, 11, 1.08F, -0.5F, -0.5F, 1, 2, 1, -0.25F, false));

        this.head11_r1 = new ModelRenderer(this);
        this.head11_r1.setRotationPoint(-0.51F, -1.2194F, -4.1212F);
        this.head.addChild(head11_r1);
        this.setRotateAngle(head11_r1, -2.81F, 0.0F, 0.0F);
        this.head11_r1.cubeList.add(new ModelBox(head11_r1, 56, 21, -0.53F, -0.4F, -0.5F, 1, 1, 1, -0.105F, true));
        this.head11_r1.cubeList.add(new ModelBox(head11_r1, 56, 21, 0.55F, -0.4F, -0.5F, 1, 1, 1, -0.105F, false));

        this.head11_r2 = new ModelRenderer(this);
        this.head11_r2.setRotationPoint(-0.51F, -0.6655F, -3.6054F);
        this.head.addChild(head11_r2);
        this.setRotateAngle(head11_r2, 2.8711F, 0.0F, 0.0F);
        this.head11_r2.cubeList.add(new ModelBox(head11_r2, 30, 56, -0.53F, -0.1304F, -0.07F, 1, 1, 1, -0.099F, true));
        this.head11_r2.cubeList.add(new ModelBox(head11_r2, 30, 56, 0.55F, -0.1304F, -0.07F, 1, 1, 1, -0.099F, false));

        this.head12_r1 = new ModelRenderer(this);
        this.head12_r1.setRotationPoint(-0.51F, -1.8194F, -3.9212F);
        this.head.addChild(head12_r1);
        this.setRotateAngle(head12_r1, -3.0718F, 0.0F, 0.0F);
        this.head12_r1.cubeList.add(new ModelBox(head12_r1, 35, 56, -0.53F, -0.9022F, -0.9156F, 1, 1, 1, -0.1F, true));
        this.head12_r1.cubeList.add(new ModelBox(head12_r1, 40, 56, -0.53F, -0.9022F, -1.2156F, 1, 1, 1, -0.105F, true));
        this.head12_r1.cubeList.add(new ModelBox(head12_r1, 40, 56, 0.55F, -0.9022F, -1.2156F, 1, 1, 1, -0.105F, false));
        this.head12_r1.cubeList.add(new ModelBox(head12_r1, 35, 56, 0.55F, -0.9022F, -0.9156F, 1, 1, 1, -0.1F, false));

        this.head10_r2 = new ModelRenderer(this);
        this.head10_r2.setRotationPoint(-0.51F, -0.5655F, -2.8054F);
        this.head.addChild(head10_r2);
        this.setRotateAngle(head10_r2, 2.9932F, 0.0F, 0.0F);
        this.head10_r2.cubeList.add(new ModelBox(head10_r2, 20, 56, -0.53F, -0.1498F, -0.064F, 1, 1, 1, -0.097F, true));
        this.head10_r2.cubeList.add(new ModelBox(head10_r2, 20, 56, 0.55F, -0.1498F, -0.064F, 1, 1, 1, -0.097F, false));

        this.head11_r3 = new ModelRenderer(this);
        this.head11_r3.setRotationPoint(-0.82F, 0.2111F, -0.97F);
        this.head.addChild(head11_r3);
        this.setRotateAngle(head11_r3, -1.1781F, 0.0F, 0.0F);
        this.head11_r3.cubeList.add(new ModelBox(head11_r3, 54, 37, -0.5F, -2.2231F, -0.5485F, 1, 1, 1, -0.303F, true));
        this.head11_r3.cubeList.add(new ModelBox(head11_r3, 12, 49, -0.5F, -1.7231F, -0.5485F, 1, 2, 1, -0.299F, true));
        this.head11_r3.cubeList.add(new ModelBox(head11_r3, 54, 37, 1.14F, -2.2231F, -0.5485F, 1, 1, 1, -0.303F, false));
        this.head11_r3.cubeList.add(new ModelBox(head11_r3, 12, 49, 1.14F, -1.7231F, -0.5485F, 1, 2, 1, -0.299F, false));

        this.head7_r1 = new ModelRenderer(this);
        this.head7_r1.setRotationPoint(-0.82F, 0.1111F, -0.47F);
        this.head.addChild(head7_r1);
        this.setRotateAngle(head7_r1, -1.021F, 0.0F, 0.0F);
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 0, 52, -0.5F, -1.4F, -0.5F, 1, 2, 1, -0.3F, true));
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 40, 53, -0.5F, 0.0F, -0.5F, 1, 1, 1, -0.3F, true));
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 40, 53, 1.14F, 0.0F, -0.5F, 1, 1, 1, -0.3F, false));
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 0, 52, 1.14F, -1.4F, -0.5F, 1, 2, 1, -0.3F, false));

        this.head8_r1 = new ModelRenderer(this);
        this.head8_r1.setRotationPoint(-0.82F, -0.4889F, 0.43F);
        this.head.addChild(head8_r1);
        this.setRotateAngle(head8_r1, -1.405F, 0.0F, 0.0F);
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 30, 52, -0.5F, -0.3191F, -0.4587F, 1, 2, 1, -0.298F, true));
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 30, 52, 1.14F, -0.3191F, -0.4587F, 1, 2, 1, -0.298F, false));

        this.head9_r1 = new ModelRenderer(this);
        this.head9_r1.setRotationPoint(-0.82F, -0.4889F, -0.97F);
        this.head.addChild(head9_r1);
        this.setRotateAngle(head9_r1, -1.0908F, 0.0F, 0.0F);
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 25, 54, -0.5F, -0.2999F, -0.2276F, 1, 1, 1, -0.303F, true));
        this.head9_r1.cubeList.add(new ModelBox(head9_r1, 25, 54, 1.14F, -0.2999F, -0.2276F, 1, 1, 1, -0.303F, false));

        this.head11_r4 = new ModelRenderer(this);
        this.head11_r4.setRotationPoint(-0.82F, -0.1889F, -1.27F);
        this.head.addChild(head11_r4);
        this.setRotateAngle(head11_r4, -0.6196F, 0.0F, 0.0F);
        this.head11_r4.cubeList.add(new ModelBox(head11_r4, 54, 34, -0.5F, -0.3046F, 0.0448F, 1, 1, 1, -0.303F, true));
        this.head11_r4.cubeList.add(new ModelBox(head11_r4, 54, 31, -0.5F, -0.3046F, -0.3552F, 1, 1, 1, -0.3F, true));
        this.head11_r4.cubeList.add(new ModelBox(head11_r4, 54, 34, 1.14F, -0.3046F, 0.0448F, 1, 1, 1, -0.303F, false));
        this.head11_r4.cubeList.add(new ModelBox(head11_r4, 54, 31, 1.14F, -0.3046F, -0.3552F, 1, 1, 1, -0.3F, false));

        this.head8_r2 = new ModelRenderer(this);
        this.head8_r2.setRotationPoint(0.5F, -0.1682F, -1.9652F);
        this.head.addChild(head8_r2);
        this.setRotateAngle(head8_r2, -2.5395F, 0.0F, 0.0F);
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 56, 15, -1.52F, -0.007F, -1.0144F, 1, 1, 1, 0.003F, true));
        this.head8_r2.cubeList.add(new ModelBox(head8_r2, 56, 15, -0.48F, -0.007F, -1.0144F, 1, 1, 1, 0.003F, false));

        this.head7_r2 = new ModelRenderer(this);
        this.head7_r2.setRotationPoint(0.5F, -1.7682F, -0.3652F);
        this.head.addChild(head7_r2);
        this.setRotateAngle(head7_r2, -1.2828F, 0.0F, 0.0F);
        this.head7_r2.cubeList.add(new ModelBox(head7_r2, 49, 48, -1.52F, -0.0185F, 0.0653F, 1, 2, 1, 0.006F, true));
        this.head7_r2.cubeList.add(new ModelBox(head7_r2, 49, 48, -0.48F, -0.0185F, 0.0653F, 1, 2, 1, 0.006F, false));

        this.head6_r1 = new ModelRenderer(this);
        this.head6_r1.setRotationPoint(0.5F, -1.4682F, -0.7652F);
        this.head.addChild(head6_r1);
        this.setRotateAngle(head6_r1, -0.6545F, 0.0F, 0.0F);
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 55, 3, -1.52F, -0.5F, -0.8F, 1, 1, 1, 0.003F, true));
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 55, 3, -0.48F, -0.5F, -0.8F, 1, 1, 1, 0.003F, false));

        this.head7_r3 = new ModelRenderer(this);
        this.head7_r3.setRotationPoint(0.5F, -2.3682F, -1.0652F);
        this.head.addChild(head7_r3);
        this.setRotateAngle(head7_r3, 0.1309F, 0.0F, 0.0F);
        this.head7_r3.cubeList.add(new ModelBox(head7_r3, 15, 56, -1.52F, 0.0314F, -1.0141F, 1, 1, 1, 0.0F, true));
        this.head7_r3.cubeList.add(new ModelBox(head7_r3, 15, 56, -0.48F, 0.0314F, -1.0141F, 1, 1, 1, 0.0F, false));

        this.head7_r4 = new ModelRenderer(this);
        this.head7_r4.setRotationPoint(0.5F, -1.4682F, -0.9652F);
        this.head.addChild(head7_r4);
        this.setRotateAngle(head7_r4, -0.6545F, 0.0F, 0.0F);
        this.head7_r4.cubeList.add(new ModelBox(head7_r4, 58, 27, -1.64F, -0.1F, -0.9F, 1, 1, 1, -0.1F, true));
        this.head7_r4.cubeList.add(new ModelBox(head7_r4, 54, 52, -1.85F, -0.1F, -0.9F, 1, 1, 1, -0.3F, true));
        this.head7_r4.cubeList.add(new ModelBox(head7_r4, 54, 52, -0.15F, -0.1F, -0.9F, 1, 1, 1, -0.3F, false));
        this.head7_r4.cubeList.add(new ModelBox(head7_r4, 58, 27, -0.36F, -0.1F, -0.9F, 1, 1, 1, -0.1F, false));

        this.head9_r2 = new ModelRenderer(this);
        this.head9_r2.setRotationPoint(0.5F, -0.9682F, -2.4652F);
        this.head.addChild(head9_r2);
        this.setRotateAngle(head9_r2, -2.9583F, 0.0F, 0.0F);
        this.head9_r2.cubeList.add(new ModelBox(head9_r2, 56, 18, -1.52F, 0.0505F, -0.9733F, 1, 1, 1, -0.003F, true));
        this.head9_r2.cubeList.add(new ModelBox(head9_r2, 56, 18, -0.48F, 0.0505F, -0.9733F, 1, 1, 1, -0.003F, false));

        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(0.0F, -2.3862F, -1.7866F);
        this.head.addChild(head4_r1);
        this.setRotateAngle(head4_r1, -0.1833F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 42, 12, -1.0F, -0.0196F, -0.9001F, 2, 2, 2, 0.0F, false));
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 0, 39, -1.0F, -0.0196F, -0.0001F, 2, 2, 2, 0.003F, false));

        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(0.0F, -1.8275F, 1.0464F);
        this.head.addChild(head5_r1);
        this.setRotateAngle(head5_r1, -1.3003F, 0.0F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 0, 56, -0.5F, 0.0045F, 0.589F, 1, 1, 1, -0.003F, false));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 54, 55, -0.5F, 0.0045F, -0.011F, 1, 1, 1, -0.007F, false));

        this.head3_r1 = new ModelRenderer(this);
        this.head3_r1.setRotationPoint(0.0F, -2.4275F, 0.2464F);
        this.head.addChild(head3_r1);
        this.setRotateAngle(head3_r1, -0.637F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 54, 49, -0.5F, 0.0109F, -0.0111F, 1, 1, 1, -0.003F, false));

        this.head2_r1 = new ModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, -0.1275F, 0.6464F);
        this.head.addChild(head2_r1);
        this.setRotateAngle(head2_r1, -1.117F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 36, 38, -1.0F, -0.3807F, -1.9489F, 2, 2, 2, -0.003F, false));

        this.head1_r1 = new ModelRenderer(this);
        this.head1_r1.setRotationPoint(0.0F, -2.4553F, 0.2205F);
        this.head.addChild(head1_r1);
        this.setRotateAngle(head1_r1, -0.0524F, 0.0F, 0.0F);
        this.head1_r1.cubeList.add(new ModelBox(head1_r1, 38, 33, -0.5F, 0.0243F, -2.9735F, 1, 1, 3, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.8138F, -0.6593F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.4538F, 0.0F, 0.0F);


        this.jaw2_r1 = new ModelRenderer(this);
        this.jaw2_r1.setRotationPoint(0.0F, -0.1834F, -2.702F);
        this.jaw.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, -0.0349F, 0.0F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 0, 49, -1.0F, 0.0F, 2.0F, 2, 1, 1, 0.0F, false));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.4394F, 0.3975F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.0456F, 0.0F, 0.0F);


        this.jaw6_r1 = new ModelRenderer(this);
        this.jaw6_r1.setRotationPoint(-0.4F, 1.6987F, -6.935F);
        this.jaw2.addChild(jaw6_r1);
        this.setRotateAngle(jaw6_r1, 0.5429F, 0.2097F, -0.6247F);
        this.jaw6_r1.cubeList.add(new ModelBox(jaw6_r1, 15, 53, -0.302F, -0.7742F, -0.7545F, 1, 1, 1, -0.2F, true));
        this.jaw6_r1.cubeList.add(new ModelBox(jaw6_r1, 20, 53, -0.302F, -1.0742F, -0.7545F, 1, 1, 1, -0.203F, true));

        this.jaw5_r1 = new ModelRenderer(this);
        this.jaw5_r1.setRotationPoint(-0.8F, 1.3987F, -6.235F);
        this.jaw2.addChild(jaw5_r1);
        this.setRotateAngle(jaw5_r1, 0.4556F, 0.2097F, -0.6247F);
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 50, 58, -0.0105F, -0.5622F, -0.531F, 1, 1, 1, -0.2F, true));
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 55, 58, -0.0105F, -1.0622F, -0.531F, 1, 1, 1, -0.203F, true));

        this.jaw5_r2 = new ModelRenderer(this);
        this.jaw5_r2.setRotationPoint(-0.8F, 1.1987F, -5.635F);
        this.jaw2.addChild(jaw5_r2);
        this.setRotateAngle(jaw5_r2, 0.2811F, 0.2097F, -0.6247F);
        this.jaw5_r2.cubeList.add(new ModelBox(jaw5_r2, 53, 28, -0.2F, -1.1759F, -0.3632F, 1, 1, 1, -0.203F, true));
        this.jaw5_r2.cubeList.add(new ModelBox(jaw5_r2, 54, 40, -0.2F, -0.8759F, -0.3632F, 1, 1, 1, -0.2F, true));
        this.jaw5_r2.cubeList.add(new ModelBox(jaw5_r2, 54, 43, -0.2F, -0.8759F, 0.7368F, 1, 1, 1, -0.2F, true));
        this.jaw5_r2.cubeList.add(new ModelBox(jaw5_r2, 54, 46, -0.2F, -0.5759F, 1.7368F, 1, 1, 1, -0.2F, true));

        this.jaw5_r3 = new ModelRenderer(this);
        this.jaw5_r3.setRotationPoint(0.4F, 1.6987F, -6.935F);
        this.jaw2.addChild(jaw5_r3);
        this.setRotateAngle(jaw5_r3, 0.5429F, -0.2097F, 0.6247F);
        this.jaw5_r3.cubeList.add(new ModelBox(jaw5_r3, 15, 53, -0.698F, -0.7742F, -0.7545F, 1, 1, 1, -0.2F, false));
        this.jaw5_r3.cubeList.add(new ModelBox(jaw5_r3, 20, 53, -0.698F, -1.0742F, -0.7545F, 1, 1, 1, -0.203F, false));

        this.jaw5_r4 = new ModelRenderer(this);
        this.jaw5_r4.setRotationPoint(0.8F, 1.3987F, -6.235F);
        this.jaw2.addChild(jaw5_r4);
        this.setRotateAngle(jaw5_r4, 0.4556F, -0.2097F, 0.6247F);
        this.jaw5_r4.cubeList.add(new ModelBox(jaw5_r4, 55, 58, -0.9895F, -1.0622F, -0.531F, 1, 1, 1, -0.203F, false));
        this.jaw5_r4.cubeList.add(new ModelBox(jaw5_r4, 50, 58, -0.9895F, -0.5622F, -0.531F, 1, 1, 1, -0.2F, false));

        this.jaw4_r1 = new ModelRenderer(this);
        this.jaw4_r1.setRotationPoint(0.8F, 1.1987F, -5.635F);
        this.jaw2.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, 0.2811F, -0.2097F, 0.6247F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 53, 28, -0.8F, -1.1759F, -0.3632F, 1, 1, 1, -0.203F, false));
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 54, 46, -0.8F, -0.5759F, 1.7368F, 1, 1, 1, -0.2F, false));
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 54, 43, -0.8F, -0.8759F, 0.7368F, 1, 1, 1, -0.2F, false));
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 54, 40, -0.8F, -0.8759F, -0.3632F, 1, 1, 1, -0.2F, false));

        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(0.0F, -0.5F, -1.1F);
        this.jaw2.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, 0.3491F, 0.0F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 25, 21, -0.8F, -0.0307F, -5.0057F, 1, 1, 5, -0.004F, true));

        this.jaw2_r2 = new ModelRenderer(this);
        this.jaw2_r2.setRotationPoint(0.0F, -0.5F, -1.1F);
        this.jaw2.addChild(jaw2_r2);
        this.setRotateAngle(jaw2_r2, 0.3491F, 0.0F, 0.0F);
        this.jaw2_r2.cubeList.add(new ModelBox(jaw2_r2, 25, 21, -0.2F, -0.0307F, -5.0057F, 1, 1, 5, 0.001F, false));

        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -1.1F, -2.75F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.2353F, 0.0F, 0.0F);


        this.jaw5 = new ModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 0.6F, -3.0F);
        this.jaw3.addChild(jaw5);
        this.setRotateAngle(jaw5, 0.0454F, 0.0F, 0.0F);


        this.jaw5_r5 = new ModelRenderer(this);
        this.jaw5_r5.setRotationPoint(0.0F, 0.8744F, -0.6026F);
        this.jaw5.addChild(jaw5_r5);
        this.setRotateAngle(jaw5_r5, 0.192F, 0.0F, 0.0F);
        this.jaw5_r5.cubeList.add(new ModelBox(jaw5_r5, 37, 48, -0.5F, 0.0078F, -1.918F, 1, 1, 2, -0.004F, false));

        this.shape64 = new ModelRenderer(this);
        this.shape64.setRotationPoint(0.0F, -0.1256F, -1.9026F);
        this.jaw5.addChild(shape64);
        this.setRotateAngle(shape64, -1.4114F, 0.0F, 0.0F);


        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(0.0F, 1.0F, 0.9F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.0456F, 0.0F, 0.0F);


        this.underneck3 = new ModelRenderer(this);
        this.underneck3.setRotationPoint(0.0F, 0.8166F, -3.302F);
        this.jaw.addChild(underneck3);
        this.setRotateAngle(underneck3, -0.2246F, 0.0F, 0.0F);


        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.7166F, -1.502F);
        this.jaw.addChild(gums1);
        this.setRotateAngle(gums1, -0.055F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -0.9568F, -2.6969F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, -0.0456F, 0.0F, 0.0F);


        this.head4_r2 = new ModelRenderer(this);
        this.head4_r2.setRotationPoint(-0.3676F, 0.413F, -2.4497F);
        this.head2.addChild(head4_r2);
        this.setRotateAngle(head4_r2, -0.1833F, 0.0F, 0.0F);
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 16, 44, -0.4324F, -1.0166F, -0.2915F, 1, 1, 3, 0.015F, true));
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 16, 44, 0.1676F, -1.0166F, -0.2915F, 1, 1, 3, 0.015F, false));

        this.head2_r2 = new ModelRenderer(this);
        this.head2_r2.setRotationPoint(0.0F, 1.8F, 2.0F);
        this.head2.addChild(head2_r2);
        this.setRotateAngle(head2_r2, -0.4625F, 0.0F, 0.0F);
        this.head2_r2.cubeList.add(new ModelBox(head2_r2, 27, 33, -1.0F, -1.006F, -2.9245F, 2, 1, 3, 0.015F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.4F, -7.5F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1367F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -0.66F, 4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.0948F, 0.0F, 0.0F);


        this.head7_r5 = new ModelRenderer(this);
        this.head7_r5.setRotationPoint(0.0F, -1.3685F, -0.6556F);
        this.head5.addChild(head7_r5);
        this.setRotateAngle(head7_r5, 0.2967F, 0.0F, 0.0F);
        this.head7_r5.cubeList.add(new ModelBox(head7_r5, 53, 25, -0.5F, -0.1186F, -1.5369F, 1, 1, 1, -0.1F, false));
        this.head7_r5.cubeList.add(new ModelBox(head7_r5, 20, 59, -0.5F, -0.1186F, -0.7369F, 1, 1, 1, -0.1F, false));

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


        this.head9_r3 = new ModelRenderer(this);
        this.head9_r3.setRotationPoint(0.0F, -0.15F, -1.0F);
        this.head4.addChild(head9_r3);
        this.setRotateAngle(head9_r3, 1.5708F, 0.0F, 0.0F);
        this.head9_r3.cubeList.add(new ModelBox(head9_r3, 56, 12, -0.5F, -0.998F, -1.7736F, 1, 1, 1, -0.05F, false));
        this.head9_r3.cubeList.add(new ModelBox(head9_r3, 44, 48, -0.5F, -2.998F, -0.9736F, 1, 3, 1, -0.01F, false));

        this.head9_r4 = new ModelRenderer(this);
        this.head9_r4.setRotationPoint(-0.4F, 0.4327F, -4.9664F);
        this.head4.addChild(head9_r4);
        this.setRotateAngle(head9_r4, 0.734F, 0.2442F, 0.4276F);
        this.head9_r4.cubeList.add(new ModelBox(head9_r4, 45, 56, -0.0518F, -0.6338F, -1.0478F, 1, 1, 1, -0.2F, true));

        this.head8_r3 = new ModelRenderer(this);
        this.head8_r3.setRotationPoint(-0.4F, 0.7327F, -4.6664F);
        this.head4.addChild(head8_r3);
        this.setRotateAngle(head8_r3, 1.083F, 0.2442F, 0.4276F);
        this.head8_r3.cubeList.add(new ModelBox(head8_r3, 30, 48, -0.3F, -0.3455F, -1.3572F, 1, 1, 2, -0.2F, true));

        this.head9_r5 = new ModelRenderer(this);
        this.head9_r5.setRotationPoint(-0.3676F, 1.1996F, -3.9506F);
        this.head4.addChild(head9_r5);
        this.setRotateAngle(head9_r5, 1.2461F, 0.211F, 0.545F);
        this.head9_r5.cubeList.add(new ModelBox(head9_r5, 0, 59, -0.3251F, -0.3497F, -0.6768F, 1, 1, 1, -0.2F, true));
        this.head9_r5.cubeList.add(new ModelBox(head9_r5, 15, 59, -0.3251F, -0.3497F, -0.9768F, 1, 1, 1, -0.203F, true));

        this.head10_r3 = new ModelRenderer(this);
        this.head10_r3.setRotationPoint(-0.5709F, 1.7837F, -2.84F);
        this.head4.addChild(head10_r3);
        this.setRotateAngle(head10_r3, 1.1773F, 0.1824F, 0.4609F);
        this.head10_r3.cubeList.add(new ModelBox(head10_r3, 57, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, true));

        this.head11_r5 = new ModelRenderer(this);
        this.head11_r5.setRotationPoint(-0.4535F, 2.0463F, -1.637F);
        this.head4.addChild(head11_r5);
        this.setRotateAngle(head11_r5, 1.3082F, 0.1824F, 0.4609F);
        this.head11_r5.cubeList.add(new ModelBox(head11_r5, 5, 57, -0.5F, -0.8F, -0.6F, 1, 1, 1, -0.2F, true));

        this.head12_r2 = new ModelRenderer(this);
        this.head12_r2.setRotationPoint(-0.4327F, 2.2015F, -1.1621F);
        this.head4.addChild(head12_r2);
        this.setRotateAngle(head12_r2, 1.4479F, 0.1824F, 0.4609F);
        this.head12_r2.cubeList.add(new ModelBox(head12_r2, 10, 57, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, true));

        this.head5_r2 = new ModelRenderer(this);
        this.head5_r2.setRotationPoint(0.0F, -0.05F, -0.1F);
        this.head4.addChild(head5_r2);
        this.setRotateAngle(head5_r2, -0.0698F, 0.0F, 0.0F);
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 17, 49, -0.8F, 0.2785F, -0.9802F, 1, 2, 1, 0.003F, true));
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 17, 49, -0.2F, 0.2785F, -0.9802F, 1, 2, 1, 0.003F, false));

        this.head8_r4 = new ModelRenderer(this);
        this.head8_r4.setRotationPoint(0.4F, 0.4327F, -4.9664F);
        this.head4.addChild(head8_r4);
        this.setRotateAngle(head8_r4, 0.734F, -0.2442F, -0.4276F);
        this.head8_r4.cubeList.add(new ModelBox(head8_r4, 45, 56, -0.9482F, -0.6338F, -1.0478F, 1, 1, 1, -0.2F, false));

        this.head11_r6 = new ModelRenderer(this);
        this.head11_r6.setRotationPoint(0.4327F, 2.2015F, -1.1621F);
        this.head4.addChild(head11_r6);
        this.setRotateAngle(head11_r6, 1.4479F, -0.1824F, -0.4609F);
        this.head11_r6.cubeList.add(new ModelBox(head11_r6, 10, 57, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

        this.head10_r4 = new ModelRenderer(this);
        this.head10_r4.setRotationPoint(0.4535F, 2.0463F, -1.637F);
        this.head4.addChild(head10_r4);
        this.setRotateAngle(head10_r4, 1.3082F, -0.1824F, -0.4609F);
        this.head10_r4.cubeList.add(new ModelBox(head10_r4, 5, 57, -0.5F, -0.8F, -0.6F, 1, 1, 1, -0.2F, false));

        this.head9_r6 = new ModelRenderer(this);
        this.head9_r6.setRotationPoint(0.5709F, 1.7837F, -2.84F);
        this.head4.addChild(head9_r6);
        this.setRotateAngle(head9_r6, 1.1773F, -0.1824F, -0.4609F);
        this.head9_r6.cubeList.add(new ModelBox(head9_r6, 57, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

        this.head9_r7 = new ModelRenderer(this);
        this.head9_r7.setRotationPoint(0.3676F, 1.1996F, -3.9506F);
        this.head4.addChild(head9_r7);
        this.setRotateAngle(head9_r7, 1.2461F, -0.211F, -0.545F);
        this.head9_r7.cubeList.add(new ModelBox(head9_r7, 15, 59, -0.6749F, -0.3497F, -0.9768F, 1, 1, 1, -0.203F, false));
        this.head9_r7.cubeList.add(new ModelBox(head9_r7, 0, 59, -0.6749F, -0.3497F, -0.6768F, 1, 1, 1, -0.2F, false));

        this.head7_r6 = new ModelRenderer(this);
        this.head7_r6.setRotationPoint(0.4F, 0.7327F, -4.6664F);
        this.head4.addChild(head7_r6);
        this.setRotateAngle(head7_r6, 1.083F, -0.2442F, -0.4276F);
        this.head7_r6.cubeList.add(new ModelBox(head7_r6, 30, 48, -0.7F, -0.3455F, -1.3572F, 1, 1, 2, -0.2F, false));

        this.head6_r2 = new ModelRenderer(this);
        this.head6_r2.setRotationPoint(0.0F, 1.55F, -2.9F);
        this.head4.addChild(head6_r2);
        this.setRotateAngle(head6_r2, 1.1519F, 0.0F, 0.0F);
        this.head6_r2.cubeList.add(new ModelBox(head6_r2, 7, 49, -0.5F, -2.0241F, -0.0459F, 1, 2, 1, -0.02F, false));

        this.head5_r3 = new ModelRenderer(this);
        this.head5_r3.setRotationPoint(0.0F, -0.05F, -0.1F);
        this.head4.addChild(head5_r3);
        this.setRotateAngle(head5_r3, -0.1047F, 0.0F, 0.0F);
        this.head5_r3.cubeList.add(new ModelBox(head5_r3, 56, 9, -0.5F, -0.0215F, -0.9802F, 1, 1, 1, 0.003F, false));

        this.crest1 = new ModelRenderer(this);
        this.crest1.setRotationPoint(0.0F, -0.2568F, 4.7531F);
        this.head.addChild(crest1);
        this.setRotateAngle(crest1, -0.0911F, 0.0F, 0.0F);


        this.crest2 = new ModelRenderer(this);
        this.crest2.setRotationPoint(0.0F, -0.7F, 1.3F);
        this.crest1.addChild(crest2);
        this.setRotateAngle(crest2, 0.0456F, 0.0F, 0.0F);


        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.124F, 1.508F, -1.6002F);
        this.chest1.addChild(leftwing1);
        this.setRotateAngle(leftwing1, 0.5466F, -1.0342F, 0.3751F);


        this.upperwing8_r1 = new ModelRenderer(this);
        this.upperwing8_r1.setRotationPoint(1.3246F, 0.0368F, 0.2605F);
        this.leftwing1.addChild(upperwing8_r1);
        this.setRotateAngle(upperwing8_r1, -1.1639F, 0.2575F, 0.1093F);
        this.upperwing8_r1.cubeList.add(new ModelBox(upperwing8_r1, 48, 0, -0.7F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.upperwing7_r1 = new ModelRenderer(this);
        this.upperwing7_r1.setRotationPoint(1.0746F, 0.0368F, 0.2605F);
        this.leftwing1.addChild(upperwing7_r1);
        this.setRotateAngle(upperwing7_r1, -1.1781F, 0.0F, 0.0F);
        this.upperwing7_r1.cubeList.add(new ModelBox(upperwing7_r1, 35, 52, -1.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(3.7463F, -0.2855F, -0.8231F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -2.0317F, 0.0853F, -2.1427F);


        this.wing10_r1 = new ModelRenderer(this);
        this.wing10_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing10_r1);
        this.setRotateAngle(wing10_r1, 0.0F, 0.0F, 0.0F);
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 11, 38, -0.9072F, -2.9026F, -0.7631F, 1, 9, 1, -0.2F, false));
        this.wing10_r1.cubeList.add(new ModelBox(wing10_r1, 22, 33, -0.9072F, -2.9026F, 0.0369F, 1, 9, 1, -0.15F, false));

        this.wing8_r1 = new ModelRenderer(this);
        this.wing8_r1.setRotationPoint(-0.0717F, 2.864F, -0.1798F);
        this.leftwing2.addChild(wing8_r1);
        this.setRotateAngle(wing8_r1, 0.0F, -1.5708F, 0.4974F);
        this.wing8_r1.cubeList.add(new ModelBox(wing8_r1, 49, 52, -0.1511F, 3.2736F, -3.1009F, 1, 2, 1, -0.21F, false));

        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.6649F, 8.4184F, -0.4154F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.3349F, 0.2623F, 0.8907F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 51, 15, -0.5F, 0.0F, 0.0F, 1, 2, 1, -0.11F, false));

        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(-0.17F, 2.2328F, 0.3069F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.2659F, -0.5762F, -0.6295F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 0, 26, -0.5799F, -0.5164F, 0.346F, 1, 1, 5, -0.2F, false));

        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.1226F, 0.5025F, 5.2223F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.2871F, -0.2658F, 0.1099F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 25, 0, -0.5F, -1.0F, -0.3F, 1, 1, 10, -0.2F, false));

        this.wingfinger9_r1 = new ModelRenderer(this);
        this.wingfinger9_r1.setRotationPoint(0.0F, -0.5F, 9.4F);
        this.leftwing5.addChild(wingfinger9_r1);
        this.setRotateAngle(wingfinger9_r1, 0.3578F, 0.0F, 0.0F);
        this.wingfinger9_r1.cubeList.add(new ModelBox(wingfinger9_r1, 0, 13, -0.5F, -0.5033F, -0.1277F, 1, 1, 11, -0.2F, false));

        this.leftwing6 = new ModelRenderer(this);
        this.leftwing6.setRotationPoint(-0.0799F, 0.4836F, 8.346F);
        this.leftwing4.addChild(leftwing6);
        this.setRotateAngle(leftwing6, 0.0594F, 0.0781F, 0.2095F);


        this.leftwing5membrance2 = new ModelRenderer(this);
        this.leftwing5membrance2.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.leftwing6.addChild(leftwing5membrance2);


        this.lefthand2 = new ModelRenderer(this);
        this.lefthand2.setRotationPoint(0.1941F, -0.2764F, 0.7256F);
        this.leftwing4.addChild(lefthand2);
        this.setRotateAngle(lefthand2, -0.7055F, 0.5346F, 0.4364F);
        this.lefthand2.cubeList.add(new ModelBox(lefthand2, 47, 21, -1.0495F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, false));

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
        this.rightwing1.setRotationPoint(-2.124F, 1.508F, -1.6002F);
        this.chest1.addChild(rightwing1);
        this.setRotateAngle(rightwing1, 0.5466F, 1.0342F, -0.3751F);


        this.upperwing9_r1 = new ModelRenderer(this);
        this.upperwing9_r1.setRotationPoint(-1.3246F, 0.0368F, 0.2605F);
        this.rightwing1.addChild(upperwing9_r1);
        this.setRotateAngle(upperwing9_r1, -1.1639F, -0.2575F, -0.1093F);
        this.upperwing9_r1.cubeList.add(new ModelBox(upperwing9_r1, 48, 0, -2.3F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.upperwing8_r2 = new ModelRenderer(this);
        this.upperwing8_r2.setRotationPoint(-1.0746F, 0.0368F, 0.2605F);
        this.rightwing1.addChild(upperwing8_r2);
        this.setRotateAngle(upperwing8_r2, -1.1781F, 0.0F, 0.0F);
        this.upperwing8_r2.cubeList.add(new ModelBox(upperwing8_r2, 35, 52, 0.25F, -1.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-3.7463F, -0.2855F, -0.8231F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -2.0317F, -0.0853F, 2.1427F);


        this.wing11_r1 = new ModelRenderer(this);
        this.wing11_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing11_r1);
        this.setRotateAngle(wing11_r1, 0.0F, 0.0F, 0.0F);
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 11, 38, -0.0928F, -2.9026F, -0.7631F, 1, 9, 1, -0.2F, true));
        this.wing11_r1.cubeList.add(new ModelBox(wing11_r1, 22, 33, -0.0928F, -2.9026F, 0.0369F, 1, 9, 1, -0.15F, true));

        this.wing9_r1 = new ModelRenderer(this);
        this.wing9_r1.setRotationPoint(0.0717F, 2.864F, -0.1798F);
        this.rightwing2.addChild(wing9_r1);
        this.setRotateAngle(wing9_r1, 0.0F, 1.5708F, -0.4974F);
        this.wing9_r1.cubeList.add(new ModelBox(wing9_r1, 49, 52, -0.8489F, 3.2736F, -3.1009F, 1, 2, 1, -0.21F, true));

        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.6649F, 8.4184F, -0.4154F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.3349F, -0.2623F, -0.8907F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 51, 15, -0.5F, 0.0F, 0.0F, 1, 2, 1, -0.11F, true));

        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(0.17F, 2.2328F, 0.3069F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.1662F, 0.5154F, 0.438F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 0, 26, -0.4201F, -0.5164F, 0.346F, 1, 1, 5, -0.2F, true));

        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.1226F, 0.5025F, 5.2223F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.2871F, 0.2658F, -0.1099F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 25, 0, -0.5F, -1.0F, -0.3F, 1, 1, 10, -0.2F, true));

        this.wingfinger10_r1 = new ModelRenderer(this);
        this.wingfinger10_r1.setRotationPoint(0.0F, -0.5F, 9.4F);
        this.rightwing5.addChild(wingfinger10_r1);
        this.setRotateAngle(wingfinger10_r1, 0.1396F, 0.0F, 0.0F);
        this.wingfinger10_r1.cubeList.add(new ModelBox(wingfinger10_r1, 0, 13, -0.5F, -0.5033F, -0.1277F, 1, 1, 11, -0.2F, true));

        this.rightwing6 = new ModelRenderer(this);
        this.rightwing6.setRotationPoint(0.0799F, 0.4836F, 8.346F);
        this.rightwing4.addChild(rightwing6);
        this.setRotateAngle(rightwing6, 0.0594F, -0.0781F, -0.2095F);


        this.rightwing5membrance2 = new ModelRenderer(this);
        this.rightwing5membrance2.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.rightwing6.addChild(rightwing5membrance2);


        this.righthand2 = new ModelRenderer(this);
        this.righthand2.setRotationPoint(-0.1941F, -0.2764F, 0.7256F);
        this.rightwing4.addChild(righthand2);
        this.setRotateAngle(righthand2, -0.8403F, -0.4391F, -0.335F);
        this.righthand2.cubeList.add(new ModelBox(righthand2, 47, 21, -0.9505F, -0.3636F, -0.0678F, 2, 1, 2, 0.0F, true));

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
