package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLisowicia extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer basin;
    private final ModelRenderer basin_r1;
    private final ModelRenderer basin_r2;
    private final ModelRenderer basin_r3;
    private final ModelRenderer basin_r4;
    private final ModelRenderer basin_r5;
    private final ModelRenderer basin_r6;
    private final ModelRenderer basin_r7;
    private final ModelRenderer basin_r8;
    private final ModelRenderer body;
    private final ModelRenderer body_r1;
    private final ModelRenderer neck13_r1;
    private final ModelRenderer neck10_r1;
    private final ModelRenderer neck9_r1;
    private final ModelRenderer neck8_r1;
    private final ModelRenderer neck16_r1;
    private final ModelRenderer neck14_r1;
    private final ModelRenderer neck15_r1;
    private final ModelRenderer neck14_r2;
    private final ModelRenderer neck15_r2;
    private final ModelRenderer neck13_r2;
    private final ModelRenderer neck12_r1;
    private final ModelRenderer neck13_r3;
    private final ModelRenderer neck14_r3;
    private final ModelRenderer neck13_r4;
    private final ModelRenderer neck11_r1;
    private final ModelRenderer neck12_r2;
    private final ModelRenderer neck12_r3;
    private final ModelRenderer neck11_r2;
    private final ModelRenderer neck10_r2;
    private final ModelRenderer neck9_r2;
    private final ModelRenderer neck10_r3;
    private final ModelRenderer neck11_r3;
    private final ModelRenderer neck10_r4;
    private final ModelRenderer neck9_r3;
    private final ModelRenderer neck8_r2;
    private final ModelRenderer neck15_r3;
    private final ModelRenderer neck14_r4;
    private final ModelRenderer neck13_r5;
    private final ModelRenderer neck14_r5;
    private final ModelRenderer neck13_r6;
    private final ModelRenderer neck12_r4;
    private final ModelRenderer neck13_r7;
    private final ModelRenderer neck12_r5;
    private final ModelRenderer neck11_r4;
    private final ModelRenderer neck12_r6;
    private final ModelRenderer neck11_r5;
    private final ModelRenderer neck10_r5;
    private final ModelRenderer neck11_r6;
    private final ModelRenderer neck10_r6;
    private final ModelRenderer neck9_r4;
    private final ModelRenderer neck10_r7;
    private final ModelRenderer neck9_r5;
    private final ModelRenderer neck8_r3;
    private final ModelRenderer neck7_r1;
    private final ModelRenderer neck8_r4;
    private final ModelRenderer neck9_r6;
    private final ModelRenderer body_r2;
    private final ModelRenderer chest;
    private final ModelRenderer neck9_r7;
    private final ModelRenderer neck7_r2;
    private final ModelRenderer neck8_r5;
    private final ModelRenderer neck8_r6;
    private final ModelRenderer neck7_r3;
    private final ModelRenderer neck6_r1;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer neck6_r2;
    private final ModelRenderer neck7_r4;
    private final ModelRenderer neck8_r7;
    private final ModelRenderer neck7_r5;
    private final ModelRenderer neck6_r3;
    private final ModelRenderer neck7_r6;
    private final ModelRenderer neck6_r4;
    private final ModelRenderer neck5_r2;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer neck6_r5;
    private final ModelRenderer neck5_r3;
    private final ModelRenderer neck4_r2;
    private final ModelRenderer neck5_r4;
    private final ModelRenderer neck6_r6;
    private final ModelRenderer chest_r1;
    private final ModelRenderer chest_r2;
    private final ModelRenderer chest_r3;
    private final ModelRenderer chest_r4;
    private final ModelRenderer chest_r5;
    private final ModelRenderer chest_r6;
    private final ModelRenderer chest_r7;
    private final ModelRenderer chest_r8;
    private final ModelRenderer chest_r9;
    private final ModelRenderer chest_r10;
    private final ModelRenderer chest_r11;
    private final ModelRenderer chest_r12;
    private final ModelRenderer chest_r13;
    private final ModelRenderer upperarm2;
    private final ModelRenderer arm2;
    private final ModelRenderer hand2;
    private final ModelRenderer upperarm3;
    private final ModelRenderer arm3;
    private final ModelRenderer hand3;
    private final ModelRenderer neck1;
    private final ModelRenderer neck6_r7;
    private final ModelRenderer neck5_r5;
    private final ModelRenderer neck4_r3;
    private final ModelRenderer neck4_r4;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck5_r6;
    private final ModelRenderer neck5_r7;
    private final ModelRenderer neck4_r5;
    private final ModelRenderer neck3_r2;
    private final ModelRenderer neck4_r6;
    private final ModelRenderer neck3_r3;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck3_r4;
    private final ModelRenderer neck2_r2;
    private final ModelRenderer neck1_r1;
    private final ModelRenderer head1;
    private final ModelRenderer head2;
    private final ModelRenderer head5_r1;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head3_r1;
    private final ModelRenderer head4_r2;
    private final ModelRenderer head3_r2;
    private final ModelRenderer head3;
    private final ModelRenderer head3_r3;
    private final ModelRenderer head4;
    private final ModelRenderer head4_r3;
    private final ModelRenderer beak1;
    private final ModelRenderer beak1_r1;
    private final ModelRenderer tusk1;
    private final ModelRenderer tusk2;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer beak2;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer foot2;
    private final ModelRenderer toes2;
    private final ModelRenderer upperleg3;
    private final ModelRenderer leg3;
    private final ModelRenderer foot3;
    private final ModelRenderer toes3;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;

    public ModelSkeletonLisowicia() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.basin = new ModelRenderer(this);
        this.basin.setRotationPoint(0.0F, -10.0F, -3.0F);
        this.root.addChild(basin);
        this.setRotateAngle(basin, 0.0456F, 0.0F, 0.0F);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(0.0F, 2.8916F, 18.3086F);
        this.basin.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.1484F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 96, 43, -6.0F, -0.1F, -6.9F, 2, 6, 6, 0.0F, true));
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 96, 43, 4.0F, -0.1F, -6.9F, 2, 6, 6, 0.0F, false));

        this.basin_r2 = new ModelRenderer(this);
        this.basin_r2.setRotationPoint(0.0F, 2.8916F, 18.3086F);
        this.basin.addChild(basin_r2);
        this.setRotateAngle(basin_r2, -1.3701F, 0.0F, 0.0F);
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 85, 107, -6.0F, -6.2F, 2.2F, 2, 10, 3, -0.002F, true));
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 85, 107, 4.0F, -6.2F, 2.2F, 2, 10, 3, -0.002F, false));

        this.basin_r3 = new ModelRenderer(this);
        this.basin_r3.setRotationPoint(0.0F, 2.8916F, 18.3086F);
        this.basin.addChild(basin_r3);
        this.setRotateAngle(basin_r3, -0.8901F, 0.0F, 0.0F);
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 54, 52, -6.0F, -4.5F, -5.3F, 2, 9, 10, 0.003F, true));
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 54, 52, 4.0F, -4.5F, -5.3F, 2, 9, 10, 0.003F, false));

        this.basin_r4 = new ModelRenderer(this);
        this.basin_r4.setRotationPoint(-5.0F, 7.6451F, 17.6393F);
        this.basin.addChild(basin_r4);
        this.setRotateAngle(basin_r4, -1.5198F, 0.0118F, -0.2266F);
        this.basin_r4.cubeList.add(new ModelBox(basin_r4, 105, 4, -1.0F, -2.1656F, -0.13F, 2, 5, 5, 0.003F, true));

        this.basin_r5 = new ModelRenderer(this);
        this.basin_r5.setRotationPoint(-4.3F, 11.4451F, 17.6393F);
        this.basin.addChild(basin_r5);
        this.setRotateAngle(basin_r5, -1.5259F, 0.027F, -0.5404F);
        this.basin_r5.cubeList.add(new ModelBox(basin_r5, 70, 16, -1.0284F, -6.3644F, 0.615F, 2, 11, 8, 0.002F, true));

        this.basin_r6 = new ModelRenderer(this);
        this.basin_r6.setRotationPoint(4.3F, 11.4451F, 17.6393F);
        this.basin.addChild(basin_r6);
        this.setRotateAngle(basin_r6, -1.5259F, -0.027F, 0.5404F);
        this.basin_r6.cubeList.add(new ModelBox(basin_r6, 70, 16, -0.9716F, -6.3644F, 0.615F, 2, 11, 8, 0.003F, false));

        this.basin_r7 = new ModelRenderer(this);
        this.basin_r7.setRotationPoint(5.0F, 7.6451F, 17.6393F);
        this.basin.addChild(basin_r7);
        this.setRotateAngle(basin_r7, -1.5198F, -0.0118F, 0.2266F);
        this.basin_r7.cubeList.add(new ModelBox(basin_r7, 105, 4, -1.0F, -2.1656F, -0.13F, 2, 5, 5, 0.003F, false));

        this.basin_r8 = new ModelRenderer(this);
        this.basin_r8.setRotationPoint(0.0F, 0.6706F, 11.1275F);
        this.basin.addChild(basin_r8);
        this.setRotateAngle(basin_r8, -0.3665F, 0.0F, 0.0F);
        this.basin_r8.cubeList.add(new ModelBox(basin_r8, 21, 0, -4.0F, -1.0F, 3.5F, 3, 1, 9, 0.003F, true));
        this.basin_r8.cubeList.add(new ModelBox(basin_r8, 21, 0, 1.0F, -1.0F, 3.5F, 3, 1, 9, 0.003F, false));
        this.basin_r8.cubeList.add(new ModelBox(basin_r8, 27, 30, -1.0F, -2.0F, 0.5F, 2, 3, 14, 0.003F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.9706F, 11.9275F);
        this.basin.addChild(body);
        this.setRotateAngle(body, 0.0456F, 0.0F, 0.0F);


        this.body_r1 = new ModelRenderer(this);
        this.body_r1.setRotationPoint(0.0F, -1.534F, -11.2038F);
        this.body.addChild(body_r1);
        this.setRotateAngle(body_r1, -0.0698F, 0.0F, 0.0F);
        this.body_r1.cubeList.add(new ModelBox(body_r1, 58, 0, -1.0F, -1.1808F, 0.0916F, 2, 3, 12, 0.0F, false));

        this.neck13_r1 = new ModelRenderer(this);
        this.neck13_r1.setRotationPoint(0.0F, -2.3548F, -7.6699F);
        this.body.addChild(neck13_r1);
        this.setRotateAngle(neck13_r1, -0.4276F, 0.0F, 0.0F);
        this.neck13_r1.cubeList.add(new ModelBox(neck13_r1, 37, 15, 0.0F, -3.3694F, 5.2953F, 0, 3, 1, 0.0F, false));
        this.neck13_r1.cubeList.add(new ModelBox(neck13_r1, 36, 48, 0.0F, -3.0694F, 2.2953F, 0, 3, 1, 0.0F, false));
        this.neck13_r1.cubeList.add(new ModelBox(neck13_r1, 51, 30, 0.0F, -2.1694F, -0.7047F, 0, 3, 1, 0.0F, false));

        this.neck10_r1 = new ModelRenderer(this);
        this.neck10_r1.setRotationPoint(0.0F, -1.965F, -10.8678F);
        this.body.addChild(neck10_r1);
        this.setRotateAngle(neck10_r1, -0.2967F, 0.0F, 0.0F);
        this.neck10_r1.cubeList.add(new ModelBox(neck10_r1, 60, 51, 0.0F, -2.9772F, -0.7605F, 0, 3, 1, 0.0F, false));

        this.neck9_r1 = new ModelRenderer(this);
        this.neck9_r1.setRotationPoint(0.0F, -2.6969F, -13.9858F);
        this.body.addChild(neck9_r1);
        this.setRotateAngle(neck9_r1, -0.1745F, 0.0F, 0.0F);
        this.neck9_r1.cubeList.add(new ModelBox(neck9_r1, 17, 61, 0.0F, -2.3978F, -0.5628F, 0, 3, 1, 0.0F, false));

        this.neck8_r1 = new ModelRenderer(this);
        this.neck8_r1.setRotationPoint(0.0F, -2.1245F, -20.1231F);
        this.body.addChild(neck8_r1);
        this.setRotateAngle(neck8_r1, -0.0698F, 0.0F, 0.0F);
        this.neck8_r1.cubeList.add(new ModelBox(neck8_r1, 0, 0, 0.0F, -3.197F, 2.0697F, 0, 3, 2, 0.0F, false));
        this.neck8_r1.cubeList.add(new ModelBox(neck8_r1, 9, 0, 0.0F, -2.897F, -0.9303F, 0, 3, 2, 0.0F, false));

        this.neck16_r1 = new ModelRenderer(this);
        this.neck16_r1.setRotationPoint(-1.0F, -0.4828F, -2.0098F);
        this.body.addChild(neck16_r1);
        this.setRotateAngle(neck16_r1, 0.0224F, -0.1623F, -1.2589F);
        this.neck16_r1.cubeList.add(new ModelBox(neck16_r1, 25, 42, -8.5849F, -3.279F, -0.2688F, 5, 0, 1, 0.0F, true));

        this.neck14_r1 = new ModelRenderer(this);
        this.neck14_r1.setRotationPoint(-1.0F, -0.4828F, -2.0098F);
        this.body.addChild(neck14_r1);
        this.setRotateAngle(neck14_r1, -0.096F, -0.0864F, -0.2006F);
        this.neck14_r1.cubeList.add(new ModelBox(neck14_r1, 71, 16, -2.0F, 0.0301F, -0.4046F, 2, 0, 1, 0.0F, true));

        this.neck15_r1 = new ModelRenderer(this);
        this.neck15_r1.setRotationPoint(-1.0F, -0.4828F, -2.0098F);
        this.body.addChild(neck15_r1);
        this.setRotateAngle(neck15_r1, -0.0866F, -0.1141F, -0.7108F);
        this.neck15_r1.cubeList.add(new ModelBox(neck15_r1, 29, 32, -4.7625F, -0.9498F, -0.4614F, 3, 0, 1, 0.0F, true));

        this.neck14_r2 = new ModelRenderer(this);
        this.neck14_r2.setRotationPoint(-1.0F, -0.6828F, -5.0098F);
        this.body.addChild(neck14_r2);
        this.setRotateAngle(neck14_r2, -0.027F, -0.0627F, -0.7161F);
        this.neck14_r2.cubeList.add(new ModelBox(neck14_r2, 0, 34, -4.7625F, -0.9498F, -0.4614F, 3, 0, 1, 0.0F, true));

        this.neck15_r2 = new ModelRenderer(this);
        this.neck15_r2.setRotationPoint(-1.0F, -0.6828F, -5.0098F);
        this.body.addChild(neck15_r2);
        this.setRotateAngle(neck15_r2, 0.0466F, -0.0875F, -1.2619F);
        this.neck15_r2.cubeList.add(new ModelBox(neck15_r2, 21, 11, -11.5849F, -3.279F, -0.2688F, 8, 0, 1, 0.0F, true));

        this.neck13_r2 = new ModelRenderer(this);
        this.neck13_r2.setRotationPoint(-1.0F, -0.6828F, -5.0098F);
        this.body.addChild(neck13_r2);
        this.setRotateAngle(neck13_r2, -0.0189F, -0.0705F, -0.2066F);
        this.neck13_r2.cubeList.add(new ModelBox(neck13_r2, 71, 18, -2.0F, 0.0301F, -0.4046F, 2, 0, 1, 0.0F, true));

        this.neck12_r1 = new ModelRenderer(this);
        this.neck12_r1.setRotationPoint(-1.0F, -0.8828F, -8.0098F);
        this.body.addChild(neck12_r1);
        this.setRotateAngle(neck12_r1, 0.0496F, -0.056F, -0.211F);
        this.neck12_r1.cubeList.add(new ModelBox(neck12_r1, 55, 76, -2.0F, 0.0301F, -0.4046F, 2, 0, 1, 0.0F, true));

        this.neck13_r3 = new ModelRenderer(this);
        this.neck13_r3.setRotationPoint(-1.0F, -0.8828F, -8.0098F);
        this.body.addChild(neck13_r3);
        this.setRotateAngle(neck13_r3, 0.0256F, -0.0168F, -0.7182F);
        this.neck13_r3.cubeList.add(new ModelBox(neck13_r3, 29, 34, -4.7625F, -0.9498F, -0.4614F, 3, 0, 1, 0.0F, true));

        this.neck14_r3 = new ModelRenderer(this);
        this.neck14_r3.setRotationPoint(-1.0F, -0.8828F, -8.0098F);
        this.body.addChild(neck14_r3);
        this.setRotateAngle(neck14_r3, 0.0678F, -0.021F, -1.263F);
        this.neck14_r3.cubeList.add(new ModelBox(neck14_r3, 45, 10, -14.5849F, -3.279F, -0.2688F, 11, 0, 1, 0.0F, true));

        this.neck13_r4 = new ModelRenderer(this);
        this.neck13_r4.setRotationPoint(-1.0F, -0.8828F, -11.0098F);
        this.body.addChild(neck13_r4);
        this.setRotateAngle(neck13_r4, 0.081F, 0.0206F, -1.263F);
        this.neck13_r4.cubeList.add(new ModelBox(neck13_r4, 37, 6, -16.5849F, -3.279F, -0.2688F, 13, 0, 1, 0.0F, true));

        this.neck11_r1 = new ModelRenderer(this);
        this.neck11_r1.setRotationPoint(-1.0F, -0.8828F, -11.0098F);
        this.body.addChild(neck11_r1);
        this.setRotateAngle(neck11_r1, 0.0923F, -0.0469F, -0.2132F);
        this.neck11_r1.cubeList.add(new ModelBox(neck11_r1, 15, 77, -2.0F, 0.0301F, -0.4046F, 2, 0, 1, 0.0F, true));

        this.neck12_r2 = new ModelRenderer(this);
        this.neck12_r2.setRotationPoint(-1.0F, -0.8828F, -11.0098F);
        this.body.addChild(neck12_r2);
        this.setRotateAngle(neck12_r2, 0.0585F, 0.0119F, -0.7183F);
        this.neck12_r2.cubeList.add(new ModelBox(neck12_r2, 46, 8, -4.7625F, -0.9498F, -0.4614F, 3, 0, 1, 0.0F, true));

        this.neck12_r3 = new ModelRenderer(this);
        this.neck12_r3.setRotationPoint(-1.0F, -0.8828F, -14.0098F);
        this.body.addChild(neck12_r3);
        this.setRotateAngle(neck12_r3, 0.0943F, 0.0622F, -1.2625F);
        this.neck12_r3.cubeList.add(new ModelBox(neck12_r3, 37, 0, -18.5849F, -3.279F, -0.2688F, 15, 0, 1, 0.0F, true));

        this.neck11_r2 = new ModelRenderer(this);
        this.neck11_r2.setRotationPoint(-1.0F, -0.8828F, -14.0098F);
        this.body.addChild(neck11_r2);
        this.setRotateAngle(neck11_r2, 0.0914F, 0.0406F, -0.7174F);
        this.neck11_r2.cubeList.add(new ModelBox(neck11_r2, 55, 8, -4.7625F, -0.9498F, -0.4614F, 3, 0, 1, 0.0F, true));

        this.neck10_r2 = new ModelRenderer(this);
        this.neck10_r2.setRotationPoint(-1.0F, -0.8828F, -14.0098F);
        this.body.addChild(neck10_r2);
        this.setRotateAngle(neck10_r2, 0.135F, -0.0376F, -0.215F);
        this.neck10_r2.cubeList.add(new ModelBox(neck10_r2, 22, 77, -2.0F, 0.0301F, -0.4046F, 2, 0, 1, 0.0F, true));

        this.neck9_r2 = new ModelRenderer(this);
        this.neck9_r2.setRotationPoint(-1.0F, -0.8828F, -17.0098F);
        this.body.addChild(neck9_r2);
        this.setRotateAngle(neck9_r2, 0.1776F, -0.0283F, -0.2164F);
        this.neck9_r2.cubeList.add(new ModelBox(neck9_r2, 78, 37, -2.0F, 0.0301F, -0.4046F, 2, 0, 1, 0.0F, true));

        this.neck10_r3 = new ModelRenderer(this);
        this.neck10_r3.setRotationPoint(-1.0F, -0.8828F, -17.0098F);
        this.body.addChild(neck10_r3);
        this.setRotateAngle(neck10_r3, 0.1243F, 0.0692F, -0.7156F);
        this.neck10_r3.cubeList.add(new ModelBox(neck10_r3, 31, 55, -4.7625F, -0.9498F, -0.4614F, 3, 0, 1, 0.0F, true));

        this.neck11_r3 = new ModelRenderer(this);
        this.neck11_r3.setRotationPoint(-1.0F, -0.8828F, -17.0098F);
        this.body.addChild(neck11_r3);
        this.setRotateAngle(neck11_r3, 0.1076F, 0.1038F, -1.2614F);
        this.neck11_r3.cubeList.add(new ModelBox(neck11_r3, 37, 2, -18.5849F, -3.279F, -0.2688F, 15, 0, 1, 0.0F, true));

        this.neck10_r4 = new ModelRenderer(this);
        this.neck10_r4.setRotationPoint(-1.0F, -0.4828F, -20.0098F);
        this.body.addChild(neck10_r4);
        this.setRotateAngle(neck10_r4, 0.121F, 0.1453F, -1.2597F);
        this.neck10_r4.cubeList.add(new ModelBox(neck10_r4, 37, 4, -18.5849F, -3.279F, -0.2688F, 15, 0, 1, 0.0F, true));

        this.neck9_r3 = new ModelRenderer(this);
        this.neck9_r3.setRotationPoint(-1.0F, -0.4828F, -20.0098F);
        this.body.addChild(neck9_r3);
        this.setRotateAngle(neck9_r3, 0.1574F, 0.0978F, -0.7128F);
        this.neck9_r3.cubeList.add(new ModelBox(neck9_r3, 69, 60, -4.7625F, -0.9498F, -0.4614F, 3, 0, 1, 0.0F, true));

        this.neck8_r2 = new ModelRenderer(this);
        this.neck8_r2.setRotationPoint(-1.0F, -0.4828F, -20.0098F);
        this.body.addChild(neck8_r2);
        this.setRotateAngle(neck8_r2, 0.2202F, -0.0189F, -0.2174F);
        this.neck8_r2.cubeList.add(new ModelBox(neck8_r2, 78, 60, -2.0F, 0.0301F, -0.4046F, 2, 0, 1, 0.0F, true));

        this.neck15_r3 = new ModelRenderer(this);
        this.neck15_r3.setRotationPoint(1.0F, -0.4828F, -2.0098F);
        this.body.addChild(neck15_r3);
        this.setRotateAngle(neck15_r3, 0.0224F, 0.1623F, 1.2589F);
        this.neck15_r3.cubeList.add(new ModelBox(neck15_r3, 25, 42, 3.5849F, -3.279F, -0.2688F, 5, 0, 1, 0.0F, false));

        this.neck14_r4 = new ModelRenderer(this);
        this.neck14_r4.setRotationPoint(1.0F, -0.4828F, -2.0098F);
        this.body.addChild(neck14_r4);
        this.setRotateAngle(neck14_r4, -0.0866F, 0.1141F, 0.7108F);
        this.neck14_r4.cubeList.add(new ModelBox(neck14_r4, 29, 32, 1.7625F, -0.9498F, -0.4614F, 3, 0, 1, 0.0F, false));

        this.neck13_r5 = new ModelRenderer(this);
        this.neck13_r5.setRotationPoint(1.0F, -0.4828F, -2.0098F);
        this.body.addChild(neck13_r5);
        this.setRotateAngle(neck13_r5, -0.096F, 0.0864F, 0.2006F);
        this.neck13_r5.cubeList.add(new ModelBox(neck13_r5, 71, 16, 0.0F, 0.0301F, -0.4046F, 2, 0, 1, 0.0F, false));

        this.neck14_r5 = new ModelRenderer(this);
        this.neck14_r5.setRotationPoint(1.0F, -0.6828F, -5.0098F);
        this.body.addChild(neck14_r5);
        this.setRotateAngle(neck14_r5, 0.0466F, 0.0875F, 1.2619F);
        this.neck14_r5.cubeList.add(new ModelBox(neck14_r5, 21, 11, 3.5849F, -3.279F, -0.2688F, 8, 0, 1, 0.0F, false));

        this.neck13_r6 = new ModelRenderer(this);
        this.neck13_r6.setRotationPoint(1.0F, -0.6828F, -5.0098F);
        this.body.addChild(neck13_r6);
        this.setRotateAngle(neck13_r6, -0.027F, 0.0627F, 0.7161F);
        this.neck13_r6.cubeList.add(new ModelBox(neck13_r6, 0, 34, 1.7625F, -0.9498F, -0.4614F, 3, 0, 1, 0.0F, false));

        this.neck12_r4 = new ModelRenderer(this);
        this.neck12_r4.setRotationPoint(1.0F, -0.6828F, -5.0098F);
        this.body.addChild(neck12_r4);
        this.setRotateAngle(neck12_r4, -0.0189F, 0.0705F, 0.2066F);
        this.neck12_r4.cubeList.add(new ModelBox(neck12_r4, 71, 18, 0.0F, 0.0301F, -0.4046F, 2, 0, 1, 0.0F, false));

        this.neck13_r7 = new ModelRenderer(this);
        this.neck13_r7.setRotationPoint(1.0F, -0.8828F, -8.0098F);
        this.body.addChild(neck13_r7);
        this.setRotateAngle(neck13_r7, 0.0678F, 0.021F, 1.263F);
        this.neck13_r7.cubeList.add(new ModelBox(neck13_r7, 45, 10, 3.5849F, -3.279F, -0.2688F, 11, 0, 1, 0.0F, false));

        this.neck12_r5 = new ModelRenderer(this);
        this.neck12_r5.setRotationPoint(1.0F, -0.8828F, -8.0098F);
        this.body.addChild(neck12_r5);
        this.setRotateAngle(neck12_r5, 0.0256F, 0.0168F, 0.7182F);
        this.neck12_r5.cubeList.add(new ModelBox(neck12_r5, 29, 34, 1.7625F, -0.9498F, -0.4614F, 3, 0, 1, 0.0F, false));

        this.neck11_r4 = new ModelRenderer(this);
        this.neck11_r4.setRotationPoint(1.0F, -0.8828F, -8.0098F);
        this.body.addChild(neck11_r4);
        this.setRotateAngle(neck11_r4, 0.0496F, 0.056F, 0.211F);
        this.neck11_r4.cubeList.add(new ModelBox(neck11_r4, 55, 76, 0.0F, 0.0301F, -0.4046F, 2, 0, 1, 0.0F, false));

        this.neck12_r6 = new ModelRenderer(this);
        this.neck12_r6.setRotationPoint(1.0F, -0.8828F, -11.0098F);
        this.body.addChild(neck12_r6);
        this.setRotateAngle(neck12_r6, 0.081F, -0.0206F, 1.263F);
        this.neck12_r6.cubeList.add(new ModelBox(neck12_r6, 37, 6, 3.5849F, -3.279F, -0.2688F, 13, 0, 1, 0.0F, false));

        this.neck11_r5 = new ModelRenderer(this);
        this.neck11_r5.setRotationPoint(1.0F, -0.8828F, -11.0098F);
        this.body.addChild(neck11_r5);
        this.setRotateAngle(neck11_r5, 0.0585F, -0.0119F, 0.7183F);
        this.neck11_r5.cubeList.add(new ModelBox(neck11_r5, 46, 8, 1.7625F, -0.9498F, -0.4614F, 3, 0, 1, 0.0F, false));

        this.neck10_r5 = new ModelRenderer(this);
        this.neck10_r5.setRotationPoint(1.0F, -0.8828F, -11.0098F);
        this.body.addChild(neck10_r5);
        this.setRotateAngle(neck10_r5, 0.0923F, 0.0469F, 0.2132F);
        this.neck10_r5.cubeList.add(new ModelBox(neck10_r5, 15, 77, 0.0F, 0.0301F, -0.4046F, 2, 0, 1, 0.0F, false));

        this.neck11_r6 = new ModelRenderer(this);
        this.neck11_r6.setRotationPoint(1.0F, -0.8828F, -14.0098F);
        this.body.addChild(neck11_r6);
        this.setRotateAngle(neck11_r6, 0.0943F, -0.0622F, 1.2625F);
        this.neck11_r6.cubeList.add(new ModelBox(neck11_r6, 37, 0, 3.5849F, -3.279F, -0.2688F, 15, 0, 1, 0.0F, false));

        this.neck10_r6 = new ModelRenderer(this);
        this.neck10_r6.setRotationPoint(1.0F, -0.8828F, -14.0098F);
        this.body.addChild(neck10_r6);
        this.setRotateAngle(neck10_r6, 0.0914F, -0.0406F, 0.7174F);
        this.neck10_r6.cubeList.add(new ModelBox(neck10_r6, 55, 8, 1.7625F, -0.9498F, -0.4614F, 3, 0, 1, 0.0F, false));

        this.neck9_r4 = new ModelRenderer(this);
        this.neck9_r4.setRotationPoint(1.0F, -0.8828F, -14.0098F);
        this.body.addChild(neck9_r4);
        this.setRotateAngle(neck9_r4, 0.135F, 0.0376F, 0.215F);
        this.neck9_r4.cubeList.add(new ModelBox(neck9_r4, 22, 77, 0.0F, 0.0301F, -0.4046F, 2, 0, 1, 0.0F, false));

        this.neck10_r7 = new ModelRenderer(this);
        this.neck10_r7.setRotationPoint(1.0F, -0.8828F, -17.0098F);
        this.body.addChild(neck10_r7);
        this.setRotateAngle(neck10_r7, 0.1076F, -0.1038F, 1.2614F);
        this.neck10_r7.cubeList.add(new ModelBox(neck10_r7, 37, 2, 3.5849F, -3.279F, -0.2688F, 15, 0, 1, 0.0F, false));

        this.neck9_r5 = new ModelRenderer(this);
        this.neck9_r5.setRotationPoint(1.0F, -0.8828F, -17.0098F);
        this.body.addChild(neck9_r5);
        this.setRotateAngle(neck9_r5, 0.1243F, -0.0692F, 0.7156F);
        this.neck9_r5.cubeList.add(new ModelBox(neck9_r5, 31, 55, 1.7625F, -0.9498F, -0.4614F, 3, 0, 1, 0.0F, false));

        this.neck8_r3 = new ModelRenderer(this);
        this.neck8_r3.setRotationPoint(1.0F, -0.8828F, -17.0098F);
        this.body.addChild(neck8_r3);
        this.setRotateAngle(neck8_r3, 0.1776F, 0.0283F, 0.2164F);
        this.neck8_r3.cubeList.add(new ModelBox(neck8_r3, 78, 37, 0.0F, 0.0301F, -0.4046F, 2, 0, 1, 0.0F, false));

        this.neck7_r1 = new ModelRenderer(this);
        this.neck7_r1.setRotationPoint(1.0F, -0.4828F, -20.0098F);
        this.body.addChild(neck7_r1);
        this.setRotateAngle(neck7_r1, 0.2202F, 0.0189F, 0.2174F);
        this.neck7_r1.cubeList.add(new ModelBox(neck7_r1, 78, 60, 0.0F, 0.0301F, -0.4046F, 2, 0, 1, 0.0F, false));

        this.neck8_r4 = new ModelRenderer(this);
        this.neck8_r4.setRotationPoint(1.0F, -0.4828F, -20.0098F);
        this.body.addChild(neck8_r4);
        this.setRotateAngle(neck8_r4, 0.1574F, -0.0978F, 0.7128F);
        this.neck8_r4.cubeList.add(new ModelBox(neck8_r4, 69, 60, 1.7625F, -0.9498F, -0.4614F, 3, 0, 1, 0.0F, false));

        this.neck9_r6 = new ModelRenderer(this);
        this.neck9_r6.setRotationPoint(1.0F, -0.4828F, -20.0098F);
        this.body.addChild(neck9_r6);
        this.setRotateAngle(neck9_r6, 0.121F, -0.1453F, 1.2597F);
        this.neck9_r6.cubeList.add(new ModelBox(neck9_r6, 37, 4, 3.5849F, -3.279F, -0.2688F, 15, 0, 1, 0.0F, false));

        this.body_r2 = new ModelRenderer(this);
        this.body_r2.setRotationPoint(4.9513F, 10.7779F, -35.8874F);
        this.body.addChild(body_r2);
        this.setRotateAngle(body_r2, 0.0524F, 0.0F, 0.0F);
        this.body_r2.cubeList.add(new ModelBox(body_r2, 52, 72, -5.9513F, -12.1839F, 15.4859F, 2, 3, 10, 0.002F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.7019F, -20.882F);
        this.body.addChild(chest);


        this.neck9_r7 = new ModelRenderer(this);
        this.neck9_r7.setRotationPoint(-5.2F, 1.2191F, -1.9279F);
        this.chest.addChild(neck9_r7);
        this.setRotateAngle(neck9_r7, 0.1318F, 0.1786F, -1.2579F);
        this.neck9_r7.cubeList.add(new ModelBox(neck9_r7, 96, 56, -14.2676F, 0.6838F, -0.7592F, 12, 0, 1, 0.0F, true));

        this.neck7_r2 = new ModelRenderer(this);
        this.neck7_r2.setRotationPoint(-5.2F, 1.2191F, -1.9279F);
        this.chest.addChild(neck7_r2);
        this.setRotateAngle(neck7_r2, 0.2543F, -0.0113F, -0.2179F);
        this.neck7_r2.cubeList.add(new ModelBox(neck7_r2, 67, 78, 2.1004F, 0.8369F, -0.8687F, 2, 0, 1, 0.0F, true));

        this.neck8_r5 = new ModelRenderer(this);
        this.neck8_r5.setRotationPoint(-5.2F, 1.2191F, -1.9279F);
        this.chest.addChild(neck8_r5);
        this.setRotateAngle(neck8_r5, 0.184F, 0.1206F, -0.7099F);
        this.neck8_r5.cubeList.add(new ModelBox(neck8_r5, 0, 70, -1.5695F, 1.7677F, -0.7782F, 3, 0, 1, 0.0F, true));

        this.neck8_r6 = new ModelRenderer(this);
        this.neck8_r6.setRotationPoint(-5.2F, 4.7191F, -4.6279F);
        this.chest.addChild(neck8_r6);
        this.setRotateAngle(neck8_r6, 0.1484F, 0.2283F, -1.2546F);
        this.neck8_r6.cubeList.add(new ModelBox(neck8_r6, 21, 13, -7.9779F, -0.0211F, -0.4272F, 8, 0, 1, 0.0F, true));

        this.neck7_r3 = new ModelRenderer(this);
        this.neck7_r3.setRotationPoint(-1.0F, 2.3191F, -5.0279F);
        this.chest.addChild(neck7_r3);
        this.setRotateAngle(neck7_r3, 0.2242F, 0.1546F, -0.7044F);
        this.neck7_r3.cubeList.add(new ModelBox(neck7_r3, 70, 36, -4.7471F, -0.9718F, -0.5577F, 3, 0, 1, 0.0F, true));

        this.neck6_r1 = new ModelRenderer(this);
        this.neck6_r1.setRotationPoint(-1.0F, 2.3191F, -5.0279F);
        this.chest.addChild(neck6_r1);
        this.setRotateAngle(neck6_r1, 0.3054F, 0.0F, -0.2182F);
        this.neck6_r1.cubeList.add(new ModelBox(neck6_r1, 74, 78, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(-1.0F, 3.2191F, -8.0279F);
        this.chest.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, 0.3054F, 0.0F, -0.2182F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 0, 79, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck6_r2 = new ModelRenderer(this);
        this.neck6_r2.setRotationPoint(-1.0F, 3.2191F, -8.0279F);
        this.chest.addChild(neck6_r2);
        this.setRotateAngle(neck6_r2, 0.2242F, 0.1546F, -0.7044F);
        this.neck6_r2.cubeList.add(new ModelBox(neck6_r2, 17, 71, -4.7471F, -0.9718F, -0.5577F, 3, 0, 1, 0.0F, true));

        this.neck7_r4 = new ModelRenderer(this);
        this.neck7_r4.setRotationPoint(-5.2F, 5.6191F, -7.6279F);
        this.chest.addChild(neck7_r4);
        this.setRotateAngle(neck7_r4, 0.1484F, 0.2283F, -1.2546F);
        this.neck7_r4.cubeList.add(new ModelBox(neck7_r4, 0, 14, -5.9779F, -0.0211F, -0.4272F, 6, 0, 1, 0.0F, true));

        this.neck8_r7 = new ModelRenderer(this);
        this.neck8_r7.setRotationPoint(5.2F, 1.2191F, -1.9279F);
        this.chest.addChild(neck8_r7);
        this.setRotateAngle(neck8_r7, 0.1318F, -0.1786F, 1.2579F);
        this.neck8_r7.cubeList.add(new ModelBox(neck8_r7, 96, 56, 2.2676F, 0.6838F, -0.7592F, 12, 0, 1, 0.0F, false));

        this.neck7_r5 = new ModelRenderer(this);
        this.neck7_r5.setRotationPoint(5.2F, 1.2191F, -1.9279F);
        this.chest.addChild(neck7_r5);
        this.setRotateAngle(neck7_r5, 0.184F, -0.1206F, 0.7099F);
        this.neck7_r5.cubeList.add(new ModelBox(neck7_r5, 0, 70, -1.4305F, 1.7677F, -0.7782F, 3, 0, 1, 0.0F, false));

        this.neck6_r3 = new ModelRenderer(this);
        this.neck6_r3.setRotationPoint(5.2F, 1.2191F, -1.9279F);
        this.chest.addChild(neck6_r3);
        this.setRotateAngle(neck6_r3, 0.2543F, 0.0113F, 0.2179F);
        this.neck6_r3.cubeList.add(new ModelBox(neck6_r3, 67, 78, -4.1004F, 0.8369F, -0.8687F, 2, 0, 1, 0.0F, false));

        this.neck7_r6 = new ModelRenderer(this);
        this.neck7_r6.setRotationPoint(5.2F, 4.7191F, -4.6279F);
        this.chest.addChild(neck7_r6);
        this.setRotateAngle(neck7_r6, 0.1484F, -0.2283F, 1.2546F);
        this.neck7_r6.cubeList.add(new ModelBox(neck7_r6, 21, 13, -0.0221F, -0.0211F, -0.4272F, 8, 0, 1, 0.0F, false));

        this.neck6_r4 = new ModelRenderer(this);
        this.neck6_r4.setRotationPoint(0.0F, -0.8612F, -2.2298F);
        this.chest.addChild(neck6_r4);
        this.setRotateAngle(neck6_r4, -0.0175F, 0.0F, 0.0F);
        this.neck6_r4.cubeList.add(new ModelBox(neck6_r4, 0, 42, 0.0F, -2.5958F, -0.9041F, 0, 3, 2, 0.0F, false));

        this.neck5_r2 = new ModelRenderer(this);
        this.neck5_r2.setRotationPoint(0.0F, 0.2984F, -5.1748F);
        this.chest.addChild(neck5_r2);
        this.setRotateAngle(neck5_r2, -0.0436F, 0.0F, 0.0F);
        this.neck5_r2.cubeList.add(new ModelBox(neck5_r2, 55, 51, 0.0F, -2.9943F, -0.8693F, 0, 3, 2, 0.0F, false));

        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.0F, 0.8572F, -8.1023F);
        this.chest.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, 0.0175F, 0.0F, 0.0F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 52, 76, 0.0F, -2.2958F, -0.9041F, 0, 3, 2, 0.0F, false));

        this.neck6_r5 = new ModelRenderer(this);
        this.neck6_r5.setRotationPoint(1.0F, 2.3191F, -5.0279F);
        this.chest.addChild(neck6_r5);
        this.setRotateAngle(neck6_r5, 0.2242F, -0.1546F, 0.7044F);
        this.neck6_r5.cubeList.add(new ModelBox(neck6_r5, 70, 36, 1.7471F, -0.9718F, -0.5577F, 3, 0, 1, 0.0F, false));

        this.neck5_r3 = new ModelRenderer(this);
        this.neck5_r3.setRotationPoint(1.0F, 2.3191F, -5.0279F);
        this.chest.addChild(neck5_r3);
        this.setRotateAngle(neck5_r3, 0.3054F, 0.0F, 0.2182F);
        this.neck5_r3.cubeList.add(new ModelBox(neck5_r3, 74, 78, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck4_r2 = new ModelRenderer(this);
        this.neck4_r2.setRotationPoint(1.0F, 3.2191F, -8.0279F);
        this.chest.addChild(neck4_r2);
        this.setRotateAngle(neck4_r2, 0.3054F, 0.0F, 0.2182F);
        this.neck4_r2.cubeList.add(new ModelBox(neck4_r2, 0, 79, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck5_r4 = new ModelRenderer(this);
        this.neck5_r4.setRotationPoint(1.0F, 3.2191F, -8.0279F);
        this.chest.addChild(neck5_r4);
        this.setRotateAngle(neck5_r4, 0.2242F, -0.1546F, 0.7044F);
        this.neck5_r4.cubeList.add(new ModelBox(neck5_r4, 17, 71, 1.7471F, -0.9718F, -0.5577F, 3, 0, 1, 0.0F, false));

        this.neck6_r6 = new ModelRenderer(this);
        this.neck6_r6.setRotationPoint(5.2F, 5.6191F, -7.6279F);
        this.chest.addChild(neck6_r6);
        this.setRotateAngle(neck6_r6, 0.1484F, -0.2283F, 1.2546F);
        this.neck6_r6.cubeList.add(new ModelBox(neck6_r6, 0, 14, -0.0221F, -0.0211F, -0.4272F, 6, 0, 1, 0.0F, false));

        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(-4.9513F, 11.4798F, -15.0055F);
        this.chest.addChild(chest_r1);
        this.setRotateAngle(chest_r1, -1.4135F, 0.5041F, -2.095F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 15, 91, -0.7276F, -11.0809F, -0.1694F, 1, 11, 1, 0.0F, true));

        this.chest_r2 = new ModelRenderer(this);
        this.chest_r2.setRotationPoint(-1.3513F, 15.5798F, -15.0055F);
        this.chest.addChild(chest_r2);
        this.setRotateAngle(chest_r2, -0.8036F, 1.1546F, -1.5452F);
        this.chest_r2.cubeList.add(new ModelBox(chest_r2, 46, 30, 0.8415F, -5.4481F, -0.2917F, 1, 6, 1, 0.0F, true));

        this.chest_r3 = new ModelRenderer(this);
        this.chest_r3.setRotationPoint(-1.3513F, 17.2798F, -15.0055F);
        this.chest.addChild(chest_r3);
        this.setRotateAngle(chest_r3, 1.2745F, 0.3837F, 0.8725F);
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 31, 48, -1.2535F, -2.2896F, 0.6277F, 1, 5, 1, 0.0F, true));

        this.chest_r4 = new ModelRenderer(this);
        this.chest_r4.setRotationPoint(-6.5F, 19.9698F, -6.6578F);
        this.chest.addChild(chest_r4);
        this.setRotateAngle(chest_r4, 1.1669F, 0.0F, 0.0822F);
        this.chest_r4.cubeList.add(new ModelBox(chest_r4, 21, 0, 3.1484F, -5.0569F, 0.5204F, 3, 6, 1, 0.0F, true));

        this.chest_r5 = new ModelRenderer(this);
        this.chest_r5.setRotationPoint(-6.5657F, 15.7211F, -10.0147F);
        this.chest.addChild(chest_r5);
        this.setRotateAngle(chest_r5, 0.9327F, -0.5997F, -0.3618F);
        this.chest_r5.cubeList.add(new ModelBox(chest_r5, 0, 110, -0.9504F, -3.5726F, -3.7007F, 2, 7, 4, 0.0F, true));

        this.chest_r6 = new ModelRenderer(this);
        this.chest_r6.setRotationPoint(-6.1F, 9.0698F, 1.2422F);
        this.chest.addChild(chest_r6);
        this.setRotateAngle(chest_r6, 0.7309F, -0.1166F, 0.1848F);
        this.chest_r6.cubeList.add(new ModelBox(chest_r6, 0, 0, -1.5F, -6.1644F, -12.513F, 2, 7, 16, 0.0F, true));

        this.chest_r7 = new ModelRenderer(this);
        this.chest_r7.setRotationPoint(4.9513F, 11.4798F, -15.0055F);
        this.chest.addChild(chest_r7);
        this.setRotateAngle(chest_r7, -1.4135F, -0.5041F, 2.095F);
        this.chest_r7.cubeList.add(new ModelBox(chest_r7, 15, 91, -0.2724F, -11.0809F, -0.1694F, 1, 11, 1, 0.0F, false));

        this.chest_r8 = new ModelRenderer(this);
        this.chest_r8.setRotationPoint(1.3513F, 15.5798F, -15.0055F);
        this.chest.addChild(chest_r8);
        this.setRotateAngle(chest_r8, -0.8036F, -1.1546F, 1.5452F);
        this.chest_r8.cubeList.add(new ModelBox(chest_r8, 46, 30, -1.8415F, -5.4481F, -0.2917F, 1, 6, 1, 0.0F, false));

        this.chest_r9 = new ModelRenderer(this);
        this.chest_r9.setRotationPoint(1.3513F, 17.2798F, -15.0055F);
        this.chest.addChild(chest_r9);
        this.setRotateAngle(chest_r9, 1.2745F, -0.3837F, -0.8725F);
        this.chest_r9.cubeList.add(new ModelBox(chest_r9, 31, 48, 0.2535F, -2.2896F, 0.6277F, 1, 5, 1, 0.0F, false));

        this.chest_r10 = new ModelRenderer(this);
        this.chest_r10.setRotationPoint(6.5F, 19.9698F, -6.6578F);
        this.chest.addChild(chest_r10);
        this.setRotateAngle(chest_r10, 1.1669F, 0.0F, -0.0822F);
        this.chest_r10.cubeList.add(new ModelBox(chest_r10, 21, 0, -6.1484F, -5.0569F, 0.5204F, 3, 6, 1, 0.0F, false));

        this.chest_r11 = new ModelRenderer(this);
        this.chest_r11.setRotationPoint(6.5657F, 15.7211F, -10.0147F);
        this.chest.addChild(chest_r11);
        this.setRotateAngle(chest_r11, 0.9327F, 0.5997F, 0.3618F);
        this.chest_r11.cubeList.add(new ModelBox(chest_r11, 0, 110, -1.0496F, -3.5726F, -3.7007F, 2, 7, 4, 0.0F, false));

        this.chest_r12 = new ModelRenderer(this);
        this.chest_r12.setRotationPoint(6.1F, 9.0698F, 1.2422F);
        this.chest.addChild(chest_r12);
        this.setRotateAngle(chest_r12, 0.7309F, 0.1166F, -0.1848F);
        this.chest_r12.cubeList.add(new ModelBox(chest_r12, 0, 0, -0.5F, -6.1644F, -12.513F, 2, 7, 16, 0.0F, false));

        this.chest_r13 = new ModelRenderer(this);
        this.chest_r13.setRotationPoint(0.0F, 3.5F, -11.1F);
        this.chest.addChild(chest_r13);
        this.setRotateAngle(chest_r13, 0.3054F, 0.0F, 0.0F);
        this.chest_r13.cubeList.add(new ModelBox(chest_r13, 0, 61, -1.0F, -1.5F, 0.0F, 2, 3, 12, 0.0F, false));

        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(8.0F, 13.6F, -6.3F);
        this.chest.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.7664F, 0.1217F, -0.1254F);
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 15, 104, -1.8758F, -0.7042F, -2.801F, 4, 4, 5, 0.0F, false));
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 107, 39, -1.8758F, 3.2958F, -1.901F, 4, 3, 4, 0.0F, false));
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 102, 92, -1.8758F, 6.2958F, -2.801F, 4, 4, 5, 0.0F, false));

        this.arm2 = new ModelRenderer(this);
        this.arm2.setRotationPoint(-0.4758F, 8.6958F, 0.699F);
        this.upperarm2.addChild(arm2);
        this.setRotateAngle(arm2, -0.9885F, -0.0217F, 0.1933F);
        this.arm2.cubeList.add(new ModelBox(arm2, 91, 12, -1.5F, -3.0F, 1.0F, 4, 12, 3, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 96, 112, -1.5F, 3.0F, -2.0F, 4, 7, 2, 0.0F, false));

        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.6F, 9.1F, 2.9F);
        this.arm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.1367F, 0.0F, 0.0F);
        this.hand2.cubeList.add(new ModelBox(hand2, 31, 48, -3.5F, -0.4273F, -8.3445F, 7, 4, 9, 0.0F, false));

        this.upperarm3 = new ModelRenderer(this);
        this.upperarm3.setRotationPoint(-8.0F, 13.6F, -6.3F);
        this.chest.addChild(upperarm3);
        this.setRotateAngle(upperarm3, 0.0683F, -0.1217F, 0.1254F);
        this.upperarm3.cubeList.add(new ModelBox(upperarm3, 102, 82, -2.1242F, -0.7042F, -2.801F, 4, 4, 5, 0.0F, false));
        this.upperarm3.cubeList.add(new ModelBox(upperarm3, 58, 16, -2.1242F, 3.2958F, -1.901F, 4, 3, 4, 0.0F, false));
        this.upperarm3.cubeList.add(new ModelBox(upperarm3, 36, 100, -2.1242F, 6.2958F, -2.801F, 4, 4, 5, 0.0F, false));

        this.arm3 = new ModelRenderer(this);
        this.arm3.setRotationPoint(0.4758F, 8.6958F, 0.699F);
        this.upperarm3.addChild(arm3);
        this.setRotateAngle(arm3, -1.3376F, 0.0217F, -0.1933F);
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 91, -2.5F, -3.0F, 1.0F, 4, 12, 3, 0.0F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 34, 110, -2.5F, 3.0F, -2.0F, 4, 7, 2, 0.0F, false));

        this.hand3 = new ModelRenderer(this);
        this.hand3.setRotationPoint(-0.6F, 9.1F, 0.9F);
        this.arm3.addChild(hand3);
        this.setRotateAngle(hand3, 1.5272F, 0.0F, 0.0F);
        this.hand3.cubeList.add(new ModelBox(hand3, 46, 30, -3.5F, 0.0F, -6.1F, 7, 4, 9, 0.0F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 2.9F, -9.6F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2028F, -0.0888F, 0.2275F);


        this.neck6_r7 = new ModelRenderer(this);
        this.neck6_r7.setRotationPoint(-5.2F, 3.5529F, -0.4767F);
        this.neck1.addChild(neck6_r7);
        this.setRotateAngle(neck6_r7, 0.1484F, 0.2283F, -1.2546F);
        this.neck6_r7.cubeList.add(new ModelBox(neck6_r7, 29, 30, -3.9779F, -0.0211F, -0.4272F, 4, 0, 1, 0.0F, true));

        this.neck5_r5 = new ModelRenderer(this);
        this.neck5_r5.setRotationPoint(-1.0F, 1.1529F, -0.8767F);
        this.neck1.addChild(neck5_r5);
        this.setRotateAngle(neck5_r5, 0.2242F, 0.1546F, -0.7044F);
        this.neck5_r5.cubeList.add(new ModelBox(neck5_r5, 75, 7, -4.7471F, -0.9718F, -0.5577F, 3, 0, 1, 0.0F, true));

        this.neck4_r3 = new ModelRenderer(this);
        this.neck4_r3.setRotationPoint(-1.0F, 1.1529F, -0.8767F);
        this.neck1.addChild(neck4_r3);
        this.setRotateAngle(neck4_r3, 0.3054F, 0.0F, -0.2182F);
        this.neck4_r3.cubeList.add(new ModelBox(neck4_r3, 15, 79, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck4_r4 = new ModelRenderer(this);
        this.neck4_r4.setRotationPoint(-1.0F, 2.0529F, -3.8767F);
        this.neck1.addChild(neck4_r4);
        this.setRotateAngle(neck4_r4, 0.2242F, 0.1546F, -0.7044F);
        this.neck4_r4.cubeList.add(new ModelBox(neck4_r4, 0, 77, -4.7471F, -0.9718F, -0.5577F, 3, 0, 1, 0.0F, true));

        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(-1.0F, 2.0529F, -3.8767F);
        this.neck1.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 0.3054F, 0.0F, -0.2182F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 79, 41, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.neck5_r6 = new ModelRenderer(this);
        this.neck5_r6.setRotationPoint(-5.2F, 4.4529F, -3.4767F);
        this.neck1.addChild(neck5_r6);
        this.setRotateAngle(neck5_r6, 0.1484F, 0.2283F, -1.2546F);
        this.neck5_r6.cubeList.add(new ModelBox(neck5_r6, 79, 39, -1.9779F, -0.0211F, -0.4272F, 2, 0, 1, 0.0F, true));

        this.neck5_r7 = new ModelRenderer(this);
        this.neck5_r7.setRotationPoint(5.2F, 3.5529F, -0.4767F);
        this.neck1.addChild(neck5_r7);
        this.setRotateAngle(neck5_r7, 0.1484F, -0.2283F, 1.2546F);
        this.neck5_r7.cubeList.add(new ModelBox(neck5_r7, 29, 30, -0.0221F, -0.0211F, -0.4272F, 4, 0, 1, 0.0F, false));

        this.neck4_r5 = new ModelRenderer(this);
        this.neck4_r5.setRotationPoint(1.0F, 1.1529F, -0.8767F);
        this.neck1.addChild(neck4_r5);
        this.setRotateAngle(neck4_r5, 0.2242F, -0.1546F, 0.7044F);
        this.neck4_r5.cubeList.add(new ModelBox(neck4_r5, 75, 7, 1.7471F, -0.9718F, -0.5577F, 3, 0, 1, 0.0F, false));

        this.neck3_r2 = new ModelRenderer(this);
        this.neck3_r2.setRotationPoint(1.0F, 1.1529F, -0.8767F);
        this.neck1.addChild(neck3_r2);
        this.setRotateAngle(neck3_r2, 0.3054F, 0.0F, 0.2182F);
        this.neck3_r2.cubeList.add(new ModelBox(neck3_r2, 15, 79, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck4_r6 = new ModelRenderer(this);
        this.neck4_r6.setRotationPoint(5.2F, 4.4529F, -3.4767F);
        this.neck1.addChild(neck4_r6);
        this.setRotateAngle(neck4_r6, 0.1484F, -0.2283F, 1.2546F);
        this.neck4_r6.cubeList.add(new ModelBox(neck4_r6, 79, 39, -0.0221F, -0.0211F, -0.4272F, 2, 0, 1, 0.0F, false));

        this.neck3_r3 = new ModelRenderer(this);
        this.neck3_r3.setRotationPoint(1.0F, 2.0529F, -3.8767F);
        this.neck1.addChild(neck3_r3);
        this.setRotateAngle(neck3_r3, 0.2242F, -0.1546F, 0.7044F);
        this.neck3_r3.cubeList.add(new ModelBox(neck3_r3, 0, 77, 1.7471F, -0.9718F, -0.5577F, 3, 0, 1, 0.0F, false));

        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(1.0F, 2.0529F, -3.8767F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.3054F, 0.0F, 0.2182F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 79, 41, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck3_r4 = new ModelRenderer(this);
        this.neck3_r4.setRotationPoint(0.0F, -0.6082F, -1.5789F);
        this.neck1.addChild(neck3_r4);
        this.setRotateAngle(neck3_r4, 0.1571F, 0.0F, 0.0F);
        this.neck3_r4.cubeList.add(new ModelBox(neck3_r4, 63, 44, 0.0F, -2.0357F, -0.8568F, 0, 2, 2, 0.0F, false));

        this.neck2_r2 = new ModelRenderer(this);
        this.neck2_r2.setRotationPoint(0.0F, 0.1918F, -4.7789F);
        this.neck1.addChild(neck2_r2);
        this.setRotateAngle(neck2_r2, 0.0873F, 0.0F, 0.0F);
        this.neck2_r2.cubeList.add(new ModelBox(neck2_r2, 37, 20, 0.0F, -1.6537F, 0.1007F, 0, 2, 1, 0.0F, false));

        this.neck1_r1 = new ModelRenderer(this);
        this.neck1_r1.setRotationPoint(0.0F, 2.8339F, -8.3489F);
        this.neck1.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, 0.3054F, 0.0F, 0.0F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 0, 77, -1.0F, -1.4F, -1.0F, 2, 3, 10, 0.004F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, 2.3339F, -7.8489F);
        this.neck1.addChild(head1);
        this.setRotateAngle(head1, -0.2419F, -0.4807F, 0.2754F);
        this.head1.cubeList.add(new ModelBox(head1, 0, 42, -4.5F, -6.3954F, -6.2004F, 9, 12, 6, -0.003F, false));
        this.head1.cubeList.add(new ModelBox(head1, 69, 44, -5.5F, -7.3954F, -2.2004F, 11, 13, 2, 0.0F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -0.4954F, -5.2004F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.182F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 25, 76, -4.5F, -3.0F, -9.0F, 9, 9, 4, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 55, 102, -1.5F, -3.0F, -5.0F, 3, 6, 5, 0.0F, false));

        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(-4.0F, 5.5F, -1.5F);
        this.head2.addChild(head5_r1);
        this.setRotateAngle(head5_r1, 0.0F, -0.48F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 55, 44, -0.5F, -0.5F, -4.4F, 1, 1, 5, -0.002F, true));

        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(-4.4F, 0.4F, -0.5F);
        this.head2.addChild(head4_r1);
        this.setRotateAngle(head4_r1, 0.6988F, -0.1632F, -0.0182F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 75, 0, -1.5073F, -1.1965F, -8.0905F, 2, 2, 9, 0.0F, true));

        this.head3_r1 = new ModelRenderer(this);
        this.head3_r1.setRotationPoint(4.4F, 0.4F, -0.5F);
        this.head2.addChild(head3_r1);
        this.setRotateAngle(head3_r1, 0.6988F, 0.1632F, 0.0182F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 75, 0, -0.4927F, -1.1965F, -8.0905F, 2, 2, 9, 0.0F, false));

        this.head4_r2 = new ModelRenderer(this);
        this.head4_r2.setRotationPoint(4.0F, 5.5F, -1.5F);
        this.head2.addChild(head4_r2);
        this.setRotateAngle(head4_r2, 0.0F, 0.48F, 0.0F);
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 55, 44, -0.5F, -0.5F, -4.4F, 1, 1, 5, -0.002F, false));

        this.head3_r2 = new ModelRenderer(this);
        this.head3_r2.setRotationPoint(0.0F, 6.7F, -11.5F);
        this.head2.addChild(head3_r2);
        this.setRotateAngle(head3_r2, 0.0873F, 0.0F, 0.0F);
        this.head3_r2.cubeList.add(new ModelBox(head3_r2, 8, 119, -2.5F, -3.9F, -1.3F, 5, 4, 5, -0.01F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, -5.1F, 1.4F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.5463F, 0.0F, 0.0F);


        this.head3_r3 = new ModelRenderer(this);
        this.head3_r3.setRotationPoint(0.0F, -1.8F, -7.2F);
        this.head3.addChild(head3_r3);
        this.setRotateAngle(head3_r3, -0.1047F, 0.0F, 0.0F);
        this.head3_r3.cubeList.add(new ModelBox(head3_r3, 29, 63, -3.0F, -0.2F, -2.8F, 6, 3, 9, 0.0F, false));

        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, 0.8F, -7.4F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.182F, 0.0F, 0.0F);


        this.head4_r3 = new ModelRenderer(this);
        this.head4_r3.setRotationPoint(0.0F, -4.3222F, -2.5918F);
        this.head4.addChild(head4_r3);
        this.setRotateAngle(head4_r3, 0.4538F, 0.0F, 0.0F);
        this.head4_r3.cubeList.add(new ModelBox(head4_r3, 77, 78, -3.5F, 1.2398F, -3.6386F, 7, 8, 5, 0.0F, false));

        this.beak1 = new ModelRenderer(this);
        this.beak1.setRotationPoint(0.0F, -0.7F, -4.4F);
        this.head4.addChild(beak1);
        this.setRotateAngle(beak1, -0.4554F, 0.0F, 0.0F);


        this.beak1_r1 = new ModelRenderer(this);
        this.beak1_r1.setRotationPoint(0.0F, -0.0222F, -0.9918F);
        this.beak1.addChild(beak1_r1);
        this.setRotateAngle(beak1_r1, -0.1396F, 0.0F, 0.0F);
        this.beak1_r1.cubeList.add(new ModelBox(beak1_r1, 97, 71, -2.5F, -0.2201F, -0.2051F, 5, 6, 4, 0.0F, false));

        this.tusk1 = new ModelRenderer(this);
        this.tusk1.setRotationPoint(2.7F, 1.5F, -4.6F);
        this.head4.addChild(tusk1);
        this.setRotateAngle(tusk1, -0.2443F, 0.0524F, -0.4538F);
        this.tusk1.cubeList.add(new ModelBox(tusk1, 0, 0, -1.0F, 0.0F, 0.0F, 1, 7, 6, 0.0F, false));

        this.tusk2 = new ModelRenderer(this);
        this.tusk2.setRotationPoint(-2.7F, 1.5F, -4.6F);
        this.head4.addChild(tusk2);
        this.setRotateAngle(tusk2, -0.2443F, -0.0524F, 0.4538F);
        this.tusk2.cubeList.add(new ModelBox(tusk2, 0, 0, 0.0F, 0.0F, 0.0F, 1, 7, 6, 0.0F, true));

        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 8.7046F, 0.1996F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, -0.2314F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, -3.3F, -3.7F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.8063F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 69, 62, 2.0F, 0.0F, -10.0F, 2, 5, 10, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 69, 62, -4.0F, 0.0F, -10.0F, 2, 5, 10, 0.0F, true));

        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.1367F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 0, 61, 1.0F, 0.0F, -3.0F, 2, 5, 3, 0.0F, false));
        this.jaw3.cubeList.add(new ModelBox(jaw3, 0, 61, -3.0F, 0.0F, -3.0F, 2, 5, 3, 0.0F, true));

        this.beak2 = new ModelRenderer(this);
        this.beak2.setRotationPoint(0.0F, 1.4F, -0.4F);
        this.jaw3.addChild(beak2);
        this.setRotateAngle(beak2, -0.6829F, 0.0F, 0.0F);
        this.beak2.cubeList.add(new ModelBox(beak2, 97, 102, -2.0F, 0.0F, -5.0F, 4, 4, 5, 0.0F, false));

        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(8.5F, 6.1706F, 17.6275F);
        this.basin.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.019F, 0.0F, 0.0F);
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 89, 0, -3.0F, 9.3242F, -1.5834F, 6, 4, 4, 0.0F, false));
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 105, 58, -1.7F, 5.3242F, -1.5834F, 4, 4, 4, 0.0F, false));
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 87, 32, -3.0F, -0.6758F, -1.5834F, 6, 6, 4, 0.0F, false));

        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(-0.3F, 12.1242F, -0.5834F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.6829F, 0.0F, 0.0F);
        this.leg2.cubeList.add(new ModelBox(leg2, 85, 92, -2.5F, 0.0796F, -1.4621F, 5, 11, 3, -0.003F, false));
        this.leg2.cubeList.add(new ModelBox(leg2, 72, 107, -2.5F, 1.0796F, 2.5379F, 5, 10, 1, -0.003F, false));

        this.foot2 = new ModelRenderer(this);
        this.foot2.setRotationPoint(0.0F, 10.7796F, 2.0379F);
        this.leg2.addChild(foot2);
        this.setRotateAngle(foot2, -0.404F, 0.0F, 0.0F);
        this.foot2.cubeList.add(new ModelBox(foot2, 20, 90, -2.5F, -1.0F, -3.5F, 5, 8, 5, 0.0F, false));

        this.toes2 = new ModelRenderer(this);
        this.toes2.setRotationPoint(0.0F, 5.6F, -1.4F);
        this.foot2.addChild(toes2);
        this.setRotateAngle(toes2, -0.1309F, 0.0F, 0.0F);
        this.toes2.cubeList.add(new ModelBox(toes2, 29, 12, -4.0F, -2.5F, -9.0F, 8, 5, 12, 0.0F, false));

        this.upperleg3 = new ModelRenderer(this);
        this.upperleg3.setRotationPoint(-8.5F, 6.1706F, 17.6275F);
        this.basin.addChild(upperleg3);
        this.setRotateAngle(upperleg3, -0.5863F, 0.0F, 0.0F);
        this.upperleg3.cubeList.add(new ModelBox(upperleg3, 17, 62, -3.0F, 9.3242F, -1.5834F, 6, 4, 4, 0.0F, false));
        this.upperleg3.cubeList.add(new ModelBox(upperleg3, 104, 27, -2.3F, 5.3242F, -1.5834F, 4, 4, 4, 0.0F, false));
        this.upperleg3.cubeList.add(new ModelBox(upperleg3, 84, 60, -3.0F, -0.6758F, -1.5834F, 6, 6, 4, 0.0F, false));

        this.leg3 = new ModelRenderer(this);
        this.leg3.setRotationPoint(0.3F, 12.1242F, -0.5834F);
        this.upperleg3.addChild(leg3);
        this.setRotateAngle(leg3, 0.5084F, 0.0F, 0.0F);
        this.leg3.cubeList.add(new ModelBox(leg3, 68, 92, -2.5F, 0.0796F, -1.4621F, 5, 11, 3, -0.003F, false));
        this.leg3.cubeList.add(new ModelBox(leg3, 106, 15, -2.5F, 1.0796F, 2.5379F, 5, 10, 1, -0.003F, false));

        this.foot3 = new ModelRenderer(this);
        this.foot3.setRotationPoint(0.0F, 10.7796F, 2.0379F);
        this.leg3.addChild(foot3);
        this.setRotateAngle(foot3, -0.1859F, 0.0F, 0.0F);
        this.foot3.cubeList.add(new ModelBox(foot3, 47, 86, -2.5F, -1.0F, -3.5F, 5, 8, 5, 0.0F, false));

        this.toes3 = new ModelRenderer(this);
        this.toes3.setRotationPoint(0.0F, 5.6F, -1.4F);
        this.foot3.addChild(toes3);
        this.setRotateAngle(toes3, 0.2182F, 0.0F, 0.0F);
        this.toes3.cubeList.add(new ModelBox(toes3, 0, 24, -4.0F, -2.5F, -9.0F, 8, 5, 12, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 4.8706F, 25.0275F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, 0.5558F, 0.2152F, -0.3311F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 24, -1.0F, -0.211F, -2.332F, 2, 6, 3, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 5.689F, -0.332F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.4683F, -0.1848F, -0.3485F);
        this.tail2.cubeList.add(new ModelBox(tail2, 75, 0, -0.5F, -0.5198F, -0.3771F, 1, 5, 1, 0.0F, false));

    }

    public void renderAll(float f) {
        this.root.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
