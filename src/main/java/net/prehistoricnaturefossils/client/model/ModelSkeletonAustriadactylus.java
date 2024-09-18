package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAustriadactylus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer body2;
    private final ModelRenderer chest_r1;
    private final ModelRenderer chest_r2;
    private final ModelRenderer chest_r3;
    private final ModelRenderer neck6_r1;
    private final ModelRenderer neck7_r1;
    private final ModelRenderer neck8_r1;
    private final ModelRenderer neck7_r2;
    private final ModelRenderer neck6_r2;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer neck6_r3;
    private final ModelRenderer neck5_r2;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer neck7_r3;
    private final ModelRenderer neck6_r4;
    private final ModelRenderer neck5_r3;
    private final ModelRenderer neck4_r2;
    private final ModelRenderer neck5_r4;
    private final ModelRenderer neck6_r5;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck4_r3;
    private final ModelRenderer neck5_r5;
    private final ModelRenderer hips;
    private final ModelRenderer body_r1;
    private final ModelRenderer body_r2;
    private final ModelRenderer body_r3;
    private final ModelRenderer body_r4;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tailthing1;
    private final ModelRenderer upperleg1;
    private final ModelRenderer leg1;
    private final ModelRenderer feet1;
    private final ModelRenderer feet2_r1;
    private final ModelRenderer legwing12;
    private final ModelRenderer legwing11;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer feet2;
    private final ModelRenderer feet3_r1;
    private final ModelRenderer legwing2;
    private final ModelRenderer legwing3;
    private final ModelRenderer chest;
    private final ModelRenderer neck3_r2;
    private final ModelRenderer neck4_r4;
    private final ModelRenderer neck3_r3;
    private final ModelRenderer neck4_r5;
    private final ModelRenderer neck5_r6;
    private final ModelRenderer neck6_r6;
    private final ModelRenderer neck5_r7;
    private final ModelRenderer neck4_r6;
    private final ModelRenderer neck3_r4;
    private final ModelRenderer neck5_r8;
    private final ModelRenderer neck4_r7;
    private final ModelRenderer neck3_r5;
    private final ModelRenderer neck4_r8;
    private final ModelRenderer neck3_r6;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck3_r7;
    private final ModelRenderer neck2_r2;
    private final ModelRenderer neck2_r3;
    private final ModelRenderer upperwing1;
    private final ModelRenderer wing1;
    private final ModelRenderer wing2_r1;
    private final ModelRenderer wingfingerbase1;
    private final ModelRenderer wingfinger2;
    private final ModelRenderer wingfinger1_r1;
    private final ModelRenderer hand1;
    private final ModelRenderer upperwing2;
    private final ModelRenderer wing2;
    private final ModelRenderer wing3_r1;
    private final ModelRenderer wingfingerbase2;
    private final ModelRenderer wingfinger3;
    private final ModelRenderer wingfinger2_r1;
    private final ModelRenderer hand2;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer underneck1;
    private final ModelRenderer head1;
    private final ModelRenderer head2_r1;
    private final ModelRenderer head6_r1;
    private final ModelRenderer head5_r1;
    private final ModelRenderer head4_r1;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer lowerteeth1;
    private final ModelRenderer underhead1;
    private final ModelRenderer lowerteeth2;
    private final ModelRenderer gums1;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer head4_r2;
    private final ModelRenderer head5;
    private final ModelRenderer crest2;
    private final ModelRenderer crest2_r1;
    private final ModelRenderer teeth1;
    private final ModelRenderer head4;
    private final ModelRenderer head4_r3;
    private final ModelRenderer crest1;
    private final ModelRenderer crest1_r1;
    private final ModelRenderer teeth2;

    public ModelSkeletonAustriadactylus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 4.9F, -4.6F);
        this.root.addChild(body2);
        this.setRotateAngle(body2, 0.2281F, 0.0F, 0.0F);


        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(0.0F, -2.1F, -3.2F);
        this.body2.addChild(chest_r1);
        this.setRotateAngle(chest_r1, -0.0524F, 0.0F, 0.0F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 17, 5, 0.0F, -0.5F, 4.0F, 0, 1, 1, 0.0F, false));
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 17, 16, 0.0F, -0.6F, 2.0F, 0, 1, 1, 0.0F, false));
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 11, 35, -0.5F, -0.2F, 0.0F, 1, 1, 6, 0.004F, false));

        this.chest_r2 = new ModelRenderer(this);
        this.chest_r2.setRotationPoint(0.0F, -2.0738F, -2.7007F);
        this.body2.addChild(chest_r2);
        this.setRotateAngle(chest_r2, 0.0785F, 0.0F, 0.0F);
        this.chest_r2.cubeList.add(new ModelBox(chest_r2, 23, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.chest_r3 = new ModelRenderer(this);
        this.chest_r3.setRotationPoint(0.0F, 1.4523F, -0.3821F);
        this.body2.addChild(chest_r3);
        this.setRotateAngle(chest_r3, 0.2443F, 0.0F, 0.0F);
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 10, 60, -2.0F, -0.5F, -1.3F, 4, 1, 3, 0.0F, false));

        this.neck6_r1 = new ModelRenderer(this);
        this.neck6_r1.setRotationPoint(-0.5F, -1.6786F, 1.1215F);
        this.body2.addChild(neck6_r1);
        this.setRotateAngle(neck6_r1, 0.4609F, 0.3399F, -0.5738F);
        this.neck6_r1.cubeList.add(new ModelBox(neck6_r1, 8, 2, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.neck7_r1 = new ModelRenderer(this);
        this.neck7_r1.setRotationPoint(-0.5F, -1.6786F, 1.1215F);
        this.body2.addChild(neck7_r1);
        this.setRotateAngle(neck7_r1, 0.2556F, 0.4878F, -1.0741F);
        this.neck7_r1.cubeList.add(new ModelBox(neck7_r1, 8, 7, -1.887F, -0.4611F, -0.4758F, 1, 0, 1, 0.0F, true));

        this.neck8_r1 = new ModelRenderer(this);
        this.neck8_r1.setRotationPoint(-0.5F, -1.6786F, 1.1215F);
        this.body2.addChild(neck8_r1);
        this.setRotateAngle(neck8_r1, -0.0478F, 0.544F, -1.675F);
        this.neck8_r1.cubeList.add(new ModelBox(neck8_r1, 0, 9, -2.4036F, -1.3428F, -0.4758F, 1, 0, 1, 0.0F, true));

        this.neck7_r2 = new ModelRenderer(this);
        this.neck7_r2.setRotationPoint(-0.5F, -1.7786F, -0.8785F);
        this.body2.addChild(neck7_r2);
        this.setRotateAngle(neck7_r2, 0.0562F, 0.5762F, -1.4825F);
        this.neck7_r2.cubeList.add(new ModelBox(neck7_r2, 17, 28, -3.4036F, -1.3428F, -0.4758F, 2, 0, 1, 0.0F, true));

        this.neck6_r2 = new ModelRenderer(this);
        this.neck6_r2.setRotationPoint(-0.5F, -1.7786F, -0.8785F);
        this.body2.addChild(neck6_r2);
        this.setRotateAngle(neck6_r2, 0.358F, 0.4648F, -0.8899F);
        this.neck6_r2.cubeList.add(new ModelBox(neck6_r2, 8, 9, -1.887F, -0.4611F, -0.4758F, 1, 0, 1, 0.0F, true));

        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(-0.5F, -1.7786F, -0.8785F);
        this.body2.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, 0.534F, 0.2769F, -0.4144F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 9, 16, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.neck6_r3 = new ModelRenderer(this);
        this.neck6_r3.setRotationPoint(-0.5F, -1.6786F, -2.7785F);
        this.body2.addChild(neck6_r3);
        this.setRotateAngle(neck6_r3, 0.1823F, 0.5696F, -1.3102F);
        this.neck6_r3.cubeList.add(new ModelBox(neck6_r3, 24, 28, -3.4036F, -1.3428F, -0.4758F, 2, 0, 1, 0.0F, true));

        this.neck5_r2 = new ModelRenderer(this);
        this.neck5_r2.setRotationPoint(-0.5F, -1.6786F, -2.7785F);
        this.body2.addChild(neck5_r2);
        this.setRotateAngle(neck5_r2, 0.4518F, 0.4014F, -0.7467F);
        this.neck5_r2.cubeList.add(new ModelBox(neck5_r2, 9, 18, -1.887F, -0.4611F, -0.4758F, 1, 0, 1, 0.0F, true));

        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(-0.5F, -1.6786F, -2.7785F);
        this.body2.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, 0.5833F, 0.1823F, -0.2994F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 0, 23, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.neck7_r3 = new ModelRenderer(this);
        this.neck7_r3.setRotationPoint(0.5F, -1.6786F, 1.1215F);
        this.body2.addChild(neck7_r3);
        this.setRotateAngle(neck7_r3, -0.0478F, -0.544F, 1.675F);
        this.neck7_r3.cubeList.add(new ModelBox(neck7_r3, 0, 9, 1.4036F, -1.3428F, -0.4758F, 1, 0, 1, 0.0F, false));

        this.neck6_r4 = new ModelRenderer(this);
        this.neck6_r4.setRotationPoint(0.5F, -1.6786F, 1.1215F);
        this.body2.addChild(neck6_r4);
        this.setRotateAngle(neck6_r4, 0.2556F, -0.4878F, 1.0741F);
        this.neck6_r4.cubeList.add(new ModelBox(neck6_r4, 8, 7, 0.887F, -0.4611F, -0.4758F, 1, 0, 1, 0.0F, false));

        this.neck5_r3 = new ModelRenderer(this);
        this.neck5_r3.setRotationPoint(0.5F, -1.6786F, 1.1215F);
        this.body2.addChild(neck5_r3);
        this.setRotateAngle(neck5_r3, 0.4609F, -0.3399F, 0.5738F);
        this.neck5_r3.cubeList.add(new ModelBox(neck5_r3, 8, 2, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.neck4_r2 = new ModelRenderer(this);
        this.neck4_r2.setRotationPoint(0.5F, -1.7786F, -0.8785F);
        this.body2.addChild(neck4_r2);
        this.setRotateAngle(neck4_r2, 0.534F, -0.2769F, 0.4144F);
        this.neck4_r2.cubeList.add(new ModelBox(neck4_r2, 9, 16, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.neck5_r4 = new ModelRenderer(this);
        this.neck5_r4.setRotationPoint(0.5F, -1.7786F, -0.8785F);
        this.body2.addChild(neck5_r4);
        this.setRotateAngle(neck5_r4, 0.358F, -0.4648F, 0.8899F);
        this.neck5_r4.cubeList.add(new ModelBox(neck5_r4, 8, 9, 0.887F, -0.4611F, -0.4758F, 1, 0, 1, 0.0F, false));

        this.neck6_r5 = new ModelRenderer(this);
        this.neck6_r5.setRotationPoint(0.5F, -1.7786F, -0.8785F);
        this.body2.addChild(neck6_r5);
        this.setRotateAngle(neck6_r5, 0.0562F, -0.5762F, 1.4825F);
        this.neck6_r5.cubeList.add(new ModelBox(neck6_r5, 17, 28, 1.4036F, -1.3428F, -0.4758F, 2, 0, 1, 0.0F, false));

        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.5F, -1.6786F, -2.7785F);
        this.body2.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 0.5833F, -0.1823F, 0.2994F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 0, 23, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.neck4_r3 = new ModelRenderer(this);
        this.neck4_r3.setRotationPoint(0.5F, -1.6786F, -2.7785F);
        this.body2.addChild(neck4_r3);
        this.setRotateAngle(neck4_r3, 0.4518F, -0.4014F, 0.7467F);
        this.neck4_r3.cubeList.add(new ModelBox(neck4_r3, 9, 18, 0.887F, -0.4611F, -0.4758F, 1, 0, 1, 0.0F, false));

        this.neck5_r5 = new ModelRenderer(this);
        this.neck5_r5.setRotationPoint(0.5F, -1.6786F, -2.7785F);
        this.body2.addChild(neck5_r5);
        this.setRotateAngle(neck5_r5, 0.1823F, -0.5696F, 1.3102F);
        this.neck5_r5.cubeList.add(new ModelBox(neck5_r5, 24, 28, 1.4036F, -1.3428F, -0.4758F, 2, 0, 1, 0.0F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -0.3F, 3.4F);
        this.body2.addChild(hips);
        this.setRotateAngle(hips, 0.085F, -0.1308F, 0.006F);
        this.hips.cubeList.add(new ModelBox(hips, 30, 22, -1.5F, 0.4915F, -1.8444F, 3, 1, 1, 0.0F, false));

        this.body_r1 = new ModelRenderer(this);
        this.body_r1.setRotationPoint(0.0F, -1.1F, 0.8F);
        this.hips.addChild(body_r1);
        this.setRotateAngle(body_r1, -0.0349F, 0.0F, 0.0F);
        this.body_r1.cubeList.add(new ModelBox(body_r1, 41, 16, -1.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F, true));
        this.body_r1.cubeList.add(new ModelBox(body_r1, 17, 5, -2.5F, -0.5F, -2.0F, 1, 1, 3, 0.0F, true));
        this.body_r1.cubeList.add(new ModelBox(body_r1, 17, 5, 1.5F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));
        this.body_r1.cubeList.add(new ModelBox(body_r1, 41, 16, 0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F, false));
        this.body_r1.cubeList.add(new ModelBox(body_r1, 0, 23, -0.5F, -0.5F, -1.5F, 1, 1, 5, 0.0F, false));

        this.body_r2 = new ModelRenderer(this);
        this.body_r2.setRotationPoint(-2.0F, -0.6006F, -0.3349F);
        this.hips.addChild(body_r2);
        this.setRotateAngle(body_r2, 0.7553F, -0.259F, -0.2367F);
        this.body_r2.cubeList.add(new ModelBox(body_r2, 50, 10, -0.5F, -0.0079F, -2.0095F, 1, 1, 2, 0.0F, true));

        this.body_r3 = new ModelRenderer(this);
        this.body_r3.setRotationPoint(-2.0F, -0.1006F, 0.7651F);
        this.hips.addChild(body_r3);
        this.setRotateAngle(body_r3, 0.1833F, 0.0F, 0.0F);
        this.body_r3.cubeList.add(new ModelBox(body_r3, 51, 39, -0.5F, -0.7F, -1.0F, 1, 1, 2, 0.0F, true));
        this.body_r3.cubeList.add(new ModelBox(body_r3, 51, 39, 3.5F, -0.7F, -1.0F, 1, 1, 2, 0.0F, false));

        this.body_r4 = new ModelRenderer(this);
        this.body_r4.setRotationPoint(2.0F, -0.6006F, -0.3349F);
        this.hips.addChild(body_r4);
        this.setRotateAngle(body_r4, 0.7553F, 0.259F, 0.2367F);
        this.body_r4.cubeList.add(new ModelBox(body_r4, 50, 10, -0.5F, -0.0079F, -2.0095F, 1, 1, 2, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.2F, 4.3F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.162F, 0.1274F, 0.0361F);
        this.tail1.cubeList.add(new ModelBox(tail1, 17, 16, -0.5F, -0.3152F, -0.1517F, 1, 1, 10, 0.004F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.6848F, 9.9483F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.3068F, 0.1665F, 0.0525F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 0, -0.5F, -1.0F, -0.2F, 1, 1, 10, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5F, 9.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0019F, 0.0873F, 0.0002F);
        this.tail3.cubeList.add(new ModelBox(tail3, 30, 12, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.004F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0769F, 0.087F, -0.0067F);
        this.tail4.cubeList.add(new ModelBox(tail4, 30, 0, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0506F, 0.0872F, -0.0044F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 32, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, false));

        this.tailthing1 = new ModelRenderer(this);
        this.tailthing1.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail5.addChild(tailthing1);
        this.setRotateAngle(tailthing1, 0.0F, 0.3054F, 0.0F);
        this.tailthing1.cubeList.add(new ModelBox(tailthing1, 38, 37, -0.5F, -0.5F, -0.1F, 1, 1, 5, 0.004F, false));

        this.upperleg1 = new ModelRenderer(this);
        this.upperleg1.setRotationPoint(1.7F, -0.1F, 0.5F);
        this.hips.addChild(upperleg1);
        this.setRotateAngle(upperleg1, 0.739F, 0.1921F, -1.256F);
        this.upperleg1.cubeList.add(new ModelBox(upperleg1, 30, 0, 0.3518F, 0.0108F, -0.5105F, 1, 6, 1, 0.0F, false));

        this.leg1 = new ModelRenderer(this);
        this.leg1.setRotationPoint(0.9518F, 5.7108F, 0.5895F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.9871F, -0.158F, 0.2132F);
        this.leg1.cubeList.add(new ModelBox(leg1, 5, 53, -0.1F, 0.0F, -1.0F, 1, 7, 1, -0.2F, false));
        this.leg1.cubeList.add(new ModelBox(leg1, 0, 53, -1.1F, 0.0F, -1.0F, 1, 7, 1, 0.0F, false));

        this.feet1 = new ModelRenderer(this);
        this.feet1.setRotationPoint(-0.2F, 6.9F, 0.2F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, 0.5555F, -0.0365F, 0.115F);
        this.feet1.cubeList.add(new ModelBox(feet1, 34, 22, -1.0F, -0.5F, -6.0F, 2, 1, 6, 0.0F, false));

        this.feet2_r1 = new ModelRenderer(this);
        this.feet2_r1.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.feet1.addChild(feet2_r1);
        this.setRotateAngle(feet2_r1, 0.0F, 0.9599F, 0.0F);
        this.feet2_r1.cubeList.add(new ModelBox(feet2_r1, 10, 35, -0.5F, -0.5F, -2.0F, 1, 1, 2, -0.003F, false));

        this.legwing12 = new ModelRenderer(this);
        this.legwing12.setRotationPoint(0.0F, 0.0F, 1.2F);
        this.leg1.addChild(legwing12);
        this.setRotateAngle(legwing12, -0.1367F, 0.0F, 0.0F);


        this.legwing11 = new ModelRenderer(this);
        this.legwing11.setRotationPoint(0.4518F, 0.3108F, 1.9895F);
        this.upperleg1.addChild(legwing11);


        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(-1.7F, -0.1F, 0.5F);
        this.hips.addChild(upperleg2);
        this.setRotateAngle(upperleg2, 0.3027F, -0.1921F, 1.256F);
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 30, 0, -1.3518F, 0.0108F, -0.5105F, 1, 6, 1, 0.0F, true));

        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(-0.9518F, 5.7108F, 0.5895F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 1.6416F, 0.158F, -0.2132F);
        this.leg2.cubeList.add(new ModelBox(leg2, 5, 53, -0.9F, 0.0F, -1.0F, 1, 7, 1, -0.2F, true));
        this.leg2.cubeList.add(new ModelBox(leg2, 0, 53, 0.1F, 0.0F, -1.0F, 1, 7, 1, 0.0F, true));

        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(0.2F, 6.9F, 0.2F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, 0.3809F, 0.0365F, -0.115F);
        this.feet2.cubeList.add(new ModelBox(feet2, 34, 22, -1.0F, -0.5F, -6.0F, 2, 1, 6, 0.0F, true));

        this.feet3_r1 = new ModelRenderer(this);
        this.feet3_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.feet2.addChild(feet3_r1);
        this.setRotateAngle(feet3_r1, 0.0F, -0.9599F, 0.0F);
        this.feet3_r1.cubeList.add(new ModelBox(feet3_r1, 10, 35, -0.5F, -0.5F, -2.0F, 1, 1, 2, -0.003F, true));

        this.legwing2 = new ModelRenderer(this);
        this.legwing2.setRotationPoint(0.0F, 0.0F, 1.2F);
        this.leg2.addChild(legwing2);
        this.setRotateAngle(legwing2, -0.1367F, 0.0F, 0.0F);


        this.legwing3 = new ModelRenderer(this);
        this.legwing3.setRotationPoint(-0.4518F, 0.3108F, 1.9895F);
        this.upperleg2.addChild(legwing3);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2F, -1.8F);
        this.body2.addChild(chest);
        this.setRotateAngle(chest, 0.1215F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 42, 44, -1.5F, 1.6384F, -3.1596F, 3, 1, 3, 0.0F, false));

        this.neck3_r2 = new ModelRenderer(this);
        this.neck3_r2.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.chest.addChild(neck3_r2);
        this.setRotateAngle(neck3_r2, 0.0524F, 0.0F, 0.0F);
        this.neck3_r2.cubeList.add(new ModelBox(neck3_r2, 0, 16, 0.0F, -0.2F, 0.9F, 0, 1, 1, 0.0F, false));
        this.neck3_r2.cubeList.add(new ModelBox(neck3_r2, 17, 0, 0.0F, -0.2F, 2.9F, 0, 1, 1, 0.0F, false));
        this.neck3_r2.cubeList.add(new ModelBox(neck3_r2, 0, 0, -0.5F, 0.0F, -0.1F, 1, 1, 5, 0.0F, false));

        this.neck4_r4 = new ModelRenderer(this);
        this.neck4_r4.setRotationPoint(-2.0F, -1.3F, -5.3F);
        this.chest.addChild(neck4_r4);
        this.setRotateAngle(neck4_r4, -0.9686F, 0.1097F, -0.1579F);
        this.neck4_r4.cubeList.add(new ModelBox(neck4_r4, 47, 27, -0.4089F, -0.2395F, -0.3166F, 1, 1, 4, 0.0F, true));

        this.neck3_r3 = new ModelRenderer(this);
        this.neck3_r3.setRotationPoint(-2.0F, -2.0F, -6.0F);
        this.chest.addChild(neck3_r3);
        this.setRotateAngle(neck3_r3, 0.2303F, 0.17F, 0.0396F);
        this.neck3_r3.cubeList.add(new ModelBox(neck3_r3, 49, 4, -0.5F, 0.6F, 0.2F, 1, 1, 4, 0.0F, true));

        this.neck4_r5 = new ModelRenderer(this);
        this.neck4_r5.setRotationPoint(-0.5F, -1.5786F, -4.5785F);
        this.chest.addChild(neck4_r5);
        this.setRotateAngle(neck4_r5, 0.6443F, 0.3456F, -0.4227F);
        this.neck4_r5.cubeList.add(new ModelBox(neck4_r5, 0, 7, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.neck5_r6 = new ModelRenderer(this);
        this.neck5_r6.setRotationPoint(-0.5F, -1.5786F, -4.5785F);
        this.chest.addChild(neck5_r6);
        this.setRotateAngle(neck5_r6, 0.4294F, 0.5739F, -0.8965F);
        this.neck5_r6.cubeList.add(new ModelBox(neck5_r6, 8, 0, -1.887F, -0.4611F, -0.4758F, 1, 0, 1, 0.0F, true));

        this.neck6_r6 = new ModelRenderer(this);
        this.neck6_r6.setRotationPoint(-0.5F, -1.5786F, -4.5785F);
        this.chest.addChild(neck6_r6);
        this.setRotateAngle(neck6_r6, 0.041F, 0.701F, -1.5336F);
        this.neck6_r6.cubeList.add(new ModelBox(neck6_r6, 17, 12, -4.4036F, -1.3428F, -0.4758F, 3, 0, 1, 0.0F, true));

        this.neck5_r7 = new ModelRenderer(this);
        this.neck5_r7.setRotationPoint(-0.5F, -1.6786F, -2.5785F);
        this.chest.addChild(neck5_r7);
        this.setRotateAngle(neck5_r7, 0.1719F, 0.5359F, -1.3855F);
        this.neck5_r7.cubeList.add(new ModelBox(neck5_r7, 26, 12, -4.4036F, -1.3428F, -0.4758F, 3, 0, 1, 0.0F, true));

        this.neck4_r6 = new ModelRenderer(this);
        this.neck4_r6.setRotationPoint(-0.5F, -1.6786F, -2.5785F);
        this.chest.addChild(neck4_r6);
        this.setRotateAngle(neck4_r6, 0.4243F, 0.3775F, -0.827F);
        this.neck4_r6.cubeList.add(new ModelBox(neck4_r6, 8, 23, -1.887F, -0.4611F, -0.4758F, 1, 0, 1, 0.0F, true));

        this.neck3_r4 = new ModelRenderer(this);
        this.neck3_r4.setRotationPoint(-0.5F, -1.6786F, -2.5785F);
        this.chest.addChild(neck3_r4);
        this.setRotateAngle(neck3_r4, 0.5495F, 0.1719F, -0.3752F);
        this.neck3_r4.cubeList.add(new ModelBox(neck3_r4, 0, 25, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.neck5_r8 = new ModelRenderer(this);
        this.neck5_r8.setRotationPoint(0.5F, -1.5786F, -4.5785F);
        this.chest.addChild(neck5_r8);
        this.setRotateAngle(neck5_r8, 0.041F, -0.701F, 1.5336F);
        this.neck5_r8.cubeList.add(new ModelBox(neck5_r8, 17, 12, 1.4036F, -1.3428F, -0.4758F, 3, 0, 1, 0.0F, false));

        this.neck4_r7 = new ModelRenderer(this);
        this.neck4_r7.setRotationPoint(0.5F, -1.5786F, -4.5785F);
        this.chest.addChild(neck4_r7);
        this.setRotateAngle(neck4_r7, 0.4294F, -0.5739F, 0.8965F);
        this.neck4_r7.cubeList.add(new ModelBox(neck4_r7, 8, 0, 0.887F, -0.4611F, -0.4758F, 1, 0, 1, 0.0F, false));

        this.neck3_r5 = new ModelRenderer(this);
        this.neck3_r5.setRotationPoint(0.5F, -1.5786F, -4.5785F);
        this.chest.addChild(neck3_r5);
        this.setRotateAngle(neck3_r5, 0.6443F, -0.3456F, 0.4227F);
        this.neck3_r5.cubeList.add(new ModelBox(neck3_r5, 0, 7, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.neck4_r8 = new ModelRenderer(this);
        this.neck4_r8.setRotationPoint(0.5F, -1.6786F, -2.5785F);
        this.chest.addChild(neck4_r8);
        this.setRotateAngle(neck4_r8, 0.1719F, -0.5359F, 1.3855F);
        this.neck4_r8.cubeList.add(new ModelBox(neck4_r8, 26, 12, 1.4036F, -1.3428F, -0.4758F, 3, 0, 1, 0.0F, false));

        this.neck3_r6 = new ModelRenderer(this);
        this.neck3_r6.setRotationPoint(0.5F, -1.6786F, -2.5785F);
        this.chest.addChild(neck3_r6);
        this.setRotateAngle(neck3_r6, 0.4243F, -0.3775F, 0.827F);
        this.neck3_r6.cubeList.add(new ModelBox(neck3_r6, 8, 23, 0.887F, -0.4611F, -0.4758F, 1, 0, 1, 0.0F, false));

        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.5F, -1.6786F, -2.5785F);
        this.chest.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.5495F, -0.1719F, 0.3752F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 0, 25, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.neck3_r7 = new ModelRenderer(this);
        this.neck3_r7.setRotationPoint(2.0F, -1.3F, -5.3F);
        this.chest.addChild(neck3_r7);
        this.setRotateAngle(neck3_r7, -0.9686F, -0.1097F, 0.1579F);
        this.neck3_r7.cubeList.add(new ModelBox(neck3_r7, 47, 27, -0.5911F, -0.2395F, -0.3166F, 1, 1, 4, 0.0F, false));

        this.neck2_r2 = new ModelRenderer(this);
        this.neck2_r2.setRotationPoint(2.0F, -2.0F, -6.0F);
        this.chest.addChild(neck2_r2);
        this.setRotateAngle(neck2_r2, 0.2303F, -0.17F, -0.0396F);
        this.neck2_r2.cubeList.add(new ModelBox(neck2_r2, 49, 4, -0.5F, 0.6F, 0.2F, 1, 1, 4, 0.0F, false));

        this.neck2_r3 = new ModelRenderer(this);
        this.neck2_r3.setRotationPoint(0.0F, 2.2265F, -2.5741F);
        this.chest.addChild(neck2_r3);
        this.setRotateAngle(neck2_r3, -0.192F, 0.0F, 0.0F);
        this.neck2_r3.cubeList.add(new ModelBox(neck2_r3, 48, 0, -1.5F, -0.5F, -2.5F, 3, 1, 2, 0.0F, false));

        this.upperwing1 = new ModelRenderer(this);
        this.upperwing1.setRotationPoint(2.3F, -1.1F, -4.7F);
        this.chest.addChild(upperwing1);
        this.setRotateAngle(upperwing1, 0.0611F, -0.2154F, -0.7776F);
        this.upperwing1.cubeList.add(new ModelBox(upperwing1, 10, 32, 0.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.wing1 = new ModelRenderer(this);
        this.wing1.setRotationPoint(5.9F, -0.6F, 0.1F);
        this.upperwing1.addChild(wing1);
        this.setRotateAngle(wing1, -0.598F, -0.3005F, -1.4872F);
        this.wing1.cubeList.add(new ModelBox(wing1, 18, 44, -0.5F, 0.0F, -0.3F, 1, 11, 1, 0.0F, false));
        this.wing1.cubeList.add(new ModelBox(wing1, 13, 43, -0.5F, 0.0F, 0.9F, 1, 11, 1, -0.2F, false));

        this.wing2_r1 = new ModelRenderer(this);
        this.wing2_r1.setRotationPoint(-11.9F, 10.6F, 0.9F);
        this.wing1.addChild(wing2_r1);
        this.setRotateAngle(wing2_r1, 0.5236F, 0.0F, 0.0F);
        this.wing2_r1.cubeList.add(new ModelBox(wing2_r1, 53, 49, 11.4F, -5.0F, -0.8F, 1, 4, 1, -0.005F, false));

        this.wingfingerbase1 = new ModelRenderer(this);
        this.wingfingerbase1.setRotationPoint(0.1F, 11.0F, -0.2F);
        this.wing1.addChild(wingfingerbase1);
        this.setRotateAngle(wingfingerbase1, -1.0472F, 0.0F, 0.0911F);
        this.wingfingerbase1.cubeList.add(new ModelBox(wingfingerbase1, 22, 28, -0.5F, -1.0F, 0.0F, 1, 1, 9, 0.0F, false));

        this.wingfinger2 = new ModelRenderer(this);
        this.wingfinger2.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.wingfingerbase1.addChild(wingfinger2);
        this.setRotateAngle(wingfinger2, 0.1903F, -0.2573F, -0.049F);
        this.wingfinger2.cubeList.add(new ModelBox(wingfinger2, 0, 16, -0.5F, -1.0F, 0.0F, 1, 1, 14, 0.0F, false));

        this.wingfinger1_r1 = new ModelRenderer(this);
        this.wingfinger1_r1.setRotationPoint(0.0F, 0.1F, 13.7F);
        this.wingfinger2.addChild(wingfinger1_r1);
        this.setRotateAngle(wingfinger1_r1, 0.3064F, -0.4183F, -0.1278F);
        this.wingfinger1_r1.cubeList.add(new ModelBox(wingfinger1_r1, 0, 0, -0.5F, -1.1F, 0.3F, 1, 1, 14, 0.0F, false));

        this.hand1 = new ModelRenderer(this);
        this.hand1.setRotationPoint(0.1F, 0.2F, -0.5F);
        this.wingfingerbase1.addChild(hand1);
        this.setRotateAngle(hand1, -0.0707F, -0.766F, -1.5798F);
        this.hand1.cubeList.add(new ModelBox(hand1, 23, 51, -0.5F, -0.5F, 0.0F, 2, 1, 3, 0.0F, false));

        this.upperwing2 = new ModelRenderer(this);
        this.upperwing2.setRotationPoint(-2.3F, -1.1F, -4.7F);
        this.chest.addChild(upperwing2);
        this.setRotateAngle(upperwing2, -0.0076F, 0.2236F, 0.4647F);
        this.upperwing2.cubeList.add(new ModelBox(upperwing2, 10, 32, -6.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, true));

        this.wing2 = new ModelRenderer(this);
        this.wing2.setRotationPoint(-5.9F, -0.6F, 0.1F);
        this.upperwing2.addChild(wing2);
        this.setRotateAngle(wing2, -0.5597F, 0.3722F, 1.6033F);
        this.wing2.cubeList.add(new ModelBox(wing2, 18, 44, -0.5F, 0.0F, -0.3F, 1, 11, 1, 0.0F, true));
        this.wing2.cubeList.add(new ModelBox(wing2, 13, 43, -0.5F, 0.0F, 0.9F, 1, 11, 1, -0.2F, true));

        this.wing3_r1 = new ModelRenderer(this);
        this.wing3_r1.setRotationPoint(11.9F, 10.6F, 0.9F);
        this.wing2.addChild(wing3_r1);
        this.setRotateAngle(wing3_r1, 0.5236F, 0.0F, 0.0F);
        this.wing3_r1.cubeList.add(new ModelBox(wing3_r1, 53, 49, -12.4F, -5.0F, -0.8F, 1, 4, 1, -0.005F, true));

        this.wingfingerbase2 = new ModelRenderer(this);
        this.wingfingerbase2.setRotationPoint(-0.1F, 11.0F, -0.2F);
        this.wing2.addChild(wingfingerbase2);
        this.setRotateAngle(wingfingerbase2, -1.0472F, 0.0F, -0.0911F);
        this.wingfingerbase2.cubeList.add(new ModelBox(wingfingerbase2, 22, 28, -0.5F, -1.0F, 0.0F, 1, 1, 9, 0.0F, true));

        this.wingfinger3 = new ModelRenderer(this);
        this.wingfinger3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.wingfingerbase2.addChild(wingfinger3);
        this.setRotateAngle(wingfinger3, 0.1867F, 0.1716F, 0.0322F);
        this.wingfinger3.cubeList.add(new ModelBox(wingfinger3, 0, 16, -0.5F, -1.0F, 0.0F, 1, 1, 14, 0.0F, true));

        this.wingfinger2_r1 = new ModelRenderer(this);
        this.wingfinger2_r1.setRotationPoint(0.0F, 0.1F, 13.7F);
        this.wingfinger3.addChild(wingfinger2_r1);
        this.setRotateAngle(wingfinger2_r1, 0.2921F, 0.2932F, 0.0867F);
        this.wingfinger2_r1.cubeList.add(new ModelBox(wingfinger2_r1, 0, 0, -0.5F, -1.1F, 0.3F, 1, 1, 14, 0.0F, true));

        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(-0.1F, 0.2F, -0.5F);
        this.wingfingerbase2.addChild(hand2);
        this.setRotateAngle(hand2, -0.0707F, 0.766F, 1.5798F);
        this.hand2.cubeList.add(new ModelBox(hand2, 23, 51, -1.5F, -0.5F, 0.0F, 2, 1, 3, 0.0F, true));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.5643F, -5.8905F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.5619F, 0.1361F, 0.0301F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.2922F, 0.0808F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.096F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 16, -0.5F, -0.7588F, -3.1659F, 1, 1, 3, 0.004F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.5F, -0.0357F, -2.8095F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.5279F, -0.3762F, 0.0498F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 7, -1.092F, -0.0958F, -4.6463F, 1, 1, 5, 0.0F, false));

        this.underneck1 = new ModelRenderer(this);
        this.underneck1.setRotationPoint(-0.592F, 0.8042F, 2.6537F);
        this.neck2.addChild(underneck1);
        this.setRotateAngle(underneck1, 0.182F, 0.0F, 0.0F);


        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(-0.592F, 0.3042F, -4.1463F);
        this.neck2.addChild(head1);
        this.setRotateAngle(head1, 0.8863F, -0.1583F, -0.1599F);
        this.head1.cubeList.add(new ModelBox(head1, 34, 30, -2.0F, -1.8396F, -3.4991F, 4, 3, 3, 0.0F, false));
        this.head1.cubeList.add(new ModelBox(head1, 0, 32, 1.02F, -1.5396F, -3.3991F, 1, 2, 2, 0.0F, false));
        this.head1.cubeList.add(new ModelBox(head1, 30, 14, 1.4F, -1.5396F, -3.3991F, 1, 2, 2, -0.3F, false));
        this.head1.cubeList.add(new ModelBox(head1, 17, 21, 0.62F, -1.5396F, -3.3991F, 2, 2, 2, -0.5F, false));
        this.head1.cubeList.add(new ModelBox(head1, 54, 27, 0.1F, -0.4396F, -5.5991F, 1, 1, 2, -0.004F, false));
        this.head1.cubeList.add(new ModelBox(head1, 17, 21, -2.62F, -1.5396F, -3.3991F, 2, 2, 2, -0.5F, true));
        this.head1.cubeList.add(new ModelBox(head1, 30, 14, -2.4F, -1.5396F, -3.3991F, 1, 2, 2, -0.3F, true));
        this.head1.cubeList.add(new ModelBox(head1, 0, 32, -2.02F, -1.5396F, -3.3991F, 1, 2, 2, 0.0F, true));
        this.head1.cubeList.add(new ModelBox(head1, 54, 27, -1.1F, -0.4396F, -5.5991F, 1, 1, 2, -0.004F, true));

        this.head2_r1 = new ModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, -1.8396F, -0.5991F);
        this.head1.addChild(head2_r1);
        this.setRotateAngle(head2_r1, -0.2443F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 42, 49, -2.0F, 0.0F, 0.1F, 4, 3, 1, 0.004F, false));

        this.head6_r1 = new ModelRenderer(this);
        this.head6_r1.setRotationPoint(0.9F, 0.1913F, -6.9637F);
        this.head1.addChild(head6_r1);
        this.setRotateAngle(head6_r1, 0.1396F, 0.0F, 0.0F);
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 52, 43, -2.0F, -0.8F, -0.9F, 1, 1, 2, 0.0F, true));
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 52, 43, -0.8F, -0.8F, -0.9F, 1, 1, 2, 0.0F, false));

        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(0.9F, -0.4396F, -5.5991F);
        this.head1.addChild(head5_r1);
        this.setRotateAngle(head5_r1, 0.3665F, 0.0F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 53, 33, -2.0F, 0.0F, -0.2F, 1, 1, 2, 0.0F, true));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 53, 33, -0.8F, 0.0F, -0.2F, 1, 1, 2, 0.0F, false));

        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(-0.3F, -0.1396F, -0.4991F);
        this.head1.addChild(head4_r1);
        this.setRotateAngle(head4_r1, -0.1571F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 0, 0, -1.73F, -0.9F, -0.6F, 1, 2, 1, 0.0F, true));
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 0, 0, 1.33F, -0.9F, -0.6F, 1, 2, 1, 0.0F, false));

        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 1.3604F, -0.0991F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.733F, 0.0F, 0.0F);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 46, 33, 1.0F, -0.1277F, -3.1493F, 1, 1, 4, -0.005F, false));
        this.jaw1.cubeList.add(new ModelBox(jaw1, 46, 33, -2.0F, -0.1277F, -3.1493F, 1, 1, 4, -0.005F, true));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.3723F, -3.0493F);
        this.jaw1.addChild(jaw2);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 0, 47, 0.5F, -0.5F, -3.4F, 1, 1, 4, -0.003F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 0, 47, -1.5F, -0.5F, -3.4F, 1, 1, 4, -0.003F, true));

        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 0.0F, -3.8F);
        this.jaw2.addChild(jaw3);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 22, 39, -1.0F, -0.5F, -3.0F, 2, 1, 4, -0.005F, false));

        this.lowerteeth1 = new ModelRenderer(this);
        this.lowerteeth1.setRotationPoint(0.0F, -0.8F, 0.1F);
        this.jaw3.addChild(lowerteeth1);
        this.lowerteeth1.cubeList.add(new ModelBox(lowerteeth1, 17, 0, -0.5F, -0.2F, -3.0F, 1, 1, 3, 0.0F, false));

        this.underhead1 = new ModelRenderer(this);
        this.underhead1.setRotationPoint(0.0F, 0.0F, -2.6F);
        this.jaw2.addChild(underhead1);
        this.setRotateAngle(underhead1, -0.0911F, 0.0F, 0.0F);


        this.lowerteeth2 = new ModelRenderer(this);
        this.lowerteeth2.setRotationPoint(0.0F, -0.6F, -2.7F);
        this.jaw2.addChild(lowerteeth2);
        this.setRotateAngle(lowerteeth2, -0.0911F, 0.0F, 0.0F);
        this.lowerteeth2.cubeList.add(new ModelBox(lowerteeth2, 31, 49, -1.0F, -0.1F, -1.0F, 2, 1, 3, -0.006F, false));

        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.3723F, -1.1493F);
        this.jaw1.addChild(gums1);
        this.setRotateAngle(gums1, -0.3643F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.6604F, -2.4991F);
        this.head1.addChild(head2);
        this.head2.cubeList.add(new ModelBox(head2, 45, 22, -1.5F, -0.5F, -4.0F, 3, 1, 3, 0.0F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.9F, -4.6F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.0456F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 41, 10, -1.0F, -1.4F, -3.0F, 2, 1, 4, 0.0F, false));

        this.head4_r2 = new ModelRenderer(this);
        this.head4_r2.setRotationPoint(0.0F, -1.3F, -2.9F);
        this.head3.addChild(head4_r2);
        this.setRotateAngle(head4_r2, 0.2793F, 0.0F, 0.0F);
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 0, 41, -1.0F, -0.1F, -0.1F, 2, 1, 4, 0.0F, false));

        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -1.2F, 0.1F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.2731F, 0.0F, 0.0F);


        this.crest2 = new ModelRenderer(this);
        this.crest2.setRotationPoint(0.0F, -0.3F, 1.2F);
        this.head5.addChild(crest2);
        this.setRotateAngle(crest2, -0.3187F, 0.0F, 0.0F);


        this.crest2_r1 = new ModelRenderer(this);
        this.crest2_r1.setRotationPoint(0.0F, -1.4F, -0.2F);
        this.crest2.addChild(crest2_r1);
        this.setRotateAngle(crest2_r1, -0.1396F, 0.0F, 0.0F);
        this.crest2_r1.cubeList.add(new ModelBox(crest2_r1, 31, 41, -0.5F, -0.1F, -3.7F, 1, 3, 4, 0.0F, false));

        this.teeth1 = new ModelRenderer(this);
        this.teeth1.setRotationPoint(0.0F, 0.9F, 1.1F);
        this.head3.addChild(teeth1);
        this.setRotateAngle(teeth1, -0.0456F, 0.0F, 0.0F);
        this.teeth1.cubeList.add(new ModelBox(teeth1, 23, 45, -0.5F, -1.8F, -4.0F, 1, 1, 4, 0.0F, false));

        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -1.1F, 0.2F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.3643F, 0.0F, 0.0F);


        this.head4_r3 = new ModelRenderer(this);
        this.head4_r3.setRotationPoint(0.0F, -1.4F, 0.4F);
        this.head4.addChild(head4_r3);
        this.setRotateAngle(head4_r3, -0.1396F, 0.0F, 0.0F);
        this.head4_r3.cubeList.add(new ModelBox(head4_r3, 0, 16, -1.0F, 0.0F, -4.1F, 2, 2, 4, 0.0F, false));

        this.crest1 = new ModelRenderer(this);
        this.crest1.setRotationPoint(0.0F, 0.2F, -2.2F);
        this.head2.addChild(crest1);
        this.setRotateAngle(crest1, -0.182F, 0.0F, 0.0F);


        this.crest1_r1 = new ModelRenderer(this);
        this.crest1_r1.setRotationPoint(0.0F, -3.1F, 1.7F);
        this.crest1.addChild(crest1_r1);
        this.setRotateAngle(crest1_r1, 0.2094F, 0.0F, 0.0F);
        this.crest1_r1.cubeList.add(new ModelBox(crest1_r1, 41, 0, -0.5F, 0.0F, -3.7F, 1, 3, 4, 0.004F, false));

        this.teeth2 = new ModelRenderer(this);
        this.teeth2.setRotationPoint(0.0F, 1.6F, -2.8F);
        this.head2.addChild(teeth2);
        this.setRotateAngle(teeth2, 0.0911F, 0.0F, 0.0F);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 49, 16, -1.0F, -1.7F, -1.0F, 2, 1, 3, 0.0F, false));

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
