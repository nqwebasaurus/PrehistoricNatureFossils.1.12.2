package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHerrerasaurus extends ModelBase {
    private final ModelRenderer fossil;
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
    private final ModelRenderer basin_r9;
    private final ModelRenderer basin_r10;
    private final ModelRenderer basin_r11;
    private final ModelRenderer basin_r12;
    private final ModelRenderer basin_r13;
    private final ModelRenderer body_r1;
    private final ModelRenderer body_r2;
    private final ModelRenderer body_r3;
    private final ModelRenderer body;
    private final ModelRenderer body_r4;
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
    private final ModelRenderer chest_r14;
    private final ModelRenderer chest_r15;
    private final ModelRenderer chest_r16;
    private final ModelRenderer chest_r17;
    private final ModelRenderer chest_r18;
    private final ModelRenderer chest_r19;
    private final ModelRenderer chest_r20;
    private final ModelRenderer chest_r21;
    private final ModelRenderer chest_r22;
    private final ModelRenderer chest_r23;
    private final ModelRenderer chest_r24;
    private final ModelRenderer chest_r25;
    private final ModelRenderer chest_r26;
    private final ModelRenderer chest;
    private final ModelRenderer chest_r27;
    private final ModelRenderer chest_r28;
    private final ModelRenderer chest_r29;
    private final ModelRenderer chest_r30;
    private final ModelRenderer chest_r31;
    private final ModelRenderer chest_r32;
    private final ModelRenderer chest_r33;
    private final ModelRenderer chest_r34;
    private final ModelRenderer chest_r35;
    private final ModelRenderer chest_r36;
    private final ModelRenderer chest_r37;
    private final ModelRenderer chest_r38;
    private final ModelRenderer chest_r39;
    private final ModelRenderer chest_r40;
    private final ModelRenderer chest_r41;
    private final ModelRenderer chest_r42;
    private final ModelRenderer neck1;
    private final ModelRenderer neck10_r1;
    private final ModelRenderer neck9_r1;
    private final ModelRenderer neck9_r2;
    private final ModelRenderer neck8_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck8_r2;
    private final ModelRenderer neck7_r1;
    private final ModelRenderer neck6_r1;
    private final ModelRenderer neck7_r2;
    private final ModelRenderer neck6_r2;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer neck5_r2;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer head1;
    private final ModelRenderer head3_r1;
    private final ModelRenderer head2_r1;
    private final ModelRenderer head5_r1;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer lowerteeth2;
    private final ModelRenderer lowerteeth2_r1;
    private final ModelRenderer lowerteeth1;
    private final ModelRenderer head2;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head3_r2;
    private final ModelRenderer head2_r2;
    private final ModelRenderer head3;
    private final ModelRenderer head3_r3;
    private final ModelRenderer teeth2;
    private final ModelRenderer teeth2_r1;
    private final ModelRenderer head4;
    private final ModelRenderer head6_r1;
    private final ModelRenderer head5_r2;
    private final ModelRenderer head4_r2;
    private final ModelRenderer teeth1;
    private final ModelRenderer teeth1_r1;
    private final ModelRenderer upperarm2;
    private final ModelRenderer lowerarm2;
    private final ModelRenderer hand2;
    private final ModelRenderer upperarm3;
    private final ModelRenderer lowerarm3;
    private final ModelRenderer hand3;
    private final ModelRenderer tail1;
    private final ModelRenderer body_r5;
    private final ModelRenderer body_r6;
    private final ModelRenderer tail2;
    private final ModelRenderer body_r7;
    private final ModelRenderer body_r8;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer upperleg1;
    private final ModelRenderer lowerleg1;
    private final ModelRenderer feet1;
    private final ModelRenderer toes1;
    private final ModelRenderer upperleg2;
    private final ModelRenderer lowerleg2;
    private final ModelRenderer feet2;
    private final ModelRenderer toes2;

    public ModelSkeletonHerrerasaurus() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.basin = new ModelRenderer(this);
        this.basin.setRotationPoint(-0.2F, -5.2F, -9.5F);
        this.root.addChild(basin);
        this.setRotateAngle(basin, -0.0456F, 0.0F, 0.0F);
        this.basin.cubeList.add(new ModelBox(basin, 3, 79, -0.4F, -2.5811F, 8.1818F, 0, 2, 1, 0.0F, false));
        this.basin.cubeList.add(new ModelBox(basin, 0, 79, -0.4F, -2.5632F, 9.9844F, 0, 2, 1, 0.0F, false));

        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(-1.7F, 2.5595F, 5.6358F);
        this.basin.addChild(basin_r1);
        this.setRotateAngle(basin_r1, 0.0349F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 0, 72, -1.5F, 0.001F, -0.0248F, 1, 3, 3, -0.001F, true));
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 0, 72, 3.3F, 0.001F, -0.0248F, 1, 3, 3, -0.001F, false));

        this.basin_r2 = new ModelRenderer(this);
        this.basin_r2.setRotationPoint(-1.7F, 2.4595F, 9.0358F);
        this.basin.addChild(basin_r2);
        this.setRotateAngle(basin_r2, -0.7679F, 0.0F, 0.0F);
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 76, 19, -1.5F, -4.3187F, -0.0709F, 1, 2, 2, 0.001F, true));
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 76, 19, 3.3F, -4.3187F, -0.0709F, 1, 2, 2, 0.001F, false));

        this.basin_r3 = new ModelRenderer(this);
        this.basin_r3.setRotationPoint(-1.7F, 2.4595F, 9.0358F);
        this.basin.addChild(basin_r3);
        this.setRotateAngle(basin_r3, -0.0524F, 0.0F, 0.0F);
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 9, 58, -1.5F, -2.8485F, -1.7865F, 1, 6, 4, 0.0F, true));
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 9, 58, 3.3F, -2.8485F, -1.7865F, 1, 6, 4, 0.0F, false));

        this.basin_r4 = new ModelRenderer(this);
        this.basin_r4.setRotationPoint(-1.7F, 4.7595F, 10.0358F);
        this.basin.addChild(basin_r4);
        this.setRotateAngle(basin_r4, 0.9057F, 0.0687F, -0.2458F);
        this.basin_r4.cubeList.add(new ModelBox(basin_r4, 71, 8, -1.4677F, -0.3089F, -0.6557F, 1, 7, 2, 0.001F, true));

        this.basin_r5 = new ModelRenderer(this);
        this.basin_r5.setRotationPoint(0.1747F, 10.1169F, 7.777F);
        this.basin.addChild(basin_r5);
        this.setRotateAngle(basin_r5, 0.1739F, -0.0151F, -0.106F);
        this.basin_r5.cubeList.add(new ModelBox(basin_r5, 57, 57, -1.86F, -0.2675F, -2.0976F, 1, 3, 5, 0.001F, true));

        this.basin_r6 = new ModelRenderer(this);
        this.basin_r6.setRotationPoint(-1.7F, 5.3595F, 6.6358F);
        this.basin.addChild(basin_r6);
        this.setRotateAngle(basin_r6, 0.1739F, 0.0151F, -0.2779F);
        this.basin_r6.cubeList.add(new ModelBox(basin_r6, 38, 43, -1.347F, -0.2275F, -0.8467F, 1, 5, 2, 0.001F, true));

        this.basin_r7 = new ModelRenderer(this);
        this.basin_r7.setRotationPoint(-1.7F, 2.4595F, 9.0358F);
        this.basin.addChild(basin_r7);
        this.setRotateAngle(basin_r7, -0.8378F, 0.0F, 0.0F);
        this.basin_r7.cubeList.add(new ModelBox(basin_r7, 42, 62, -1.5F, -2.4054F, -2.2255F, 1, 5, 4, 0.001F, true));
        this.basin_r7.cubeList.add(new ModelBox(basin_r7, 42, 62, 3.3F, -2.4054F, -2.2255F, 1, 5, 4, 0.001F, false));

        this.basin_r8 = new ModelRenderer(this);
        this.basin_r8.setRotationPoint(-1.7F, -0.3163F, 10.4966F);
        this.basin.addChild(basin_r8);
        this.setRotateAngle(basin_r8, -0.0524F, 0.0F, 0.0F);
        this.basin_r8.cubeList.add(new ModelBox(basin_r8, 24, 0, -1.5F, -1.0F, -3.5F, 1, 2, 7, 0.002F, true));
        this.basin_r8.cubeList.add(new ModelBox(basin_r8, 24, 0, 3.3F, -1.0F, -3.5F, 1, 2, 7, 0.002F, false));

        this.basin_r9 = new ModelRenderer(this);
        this.basin_r9.setRotationPoint(-1.7F, -0.6163F, 9.3966F);
        this.basin.addChild(basin_r9);
        this.setRotateAngle(basin_r9, -0.0524F, 0.0F, 0.0F);
        this.basin_r9.cubeList.add(new ModelBox(basin_r9, 47, 54, -0.5F, -0.5F, -2.9F, 1, 1, 6, 0.001F, true));
        this.basin_r9.cubeList.add(new ModelBox(basin_r9, 47, 54, 2.3F, -0.5F, -2.9F, 1, 1, 6, 0.001F, false));

        this.basin_r10 = new ModelRenderer(this);
        this.basin_r10.setRotationPoint(2.1F, 4.7595F, 10.0358F);
        this.basin.addChild(basin_r10);
        this.setRotateAngle(basin_r10, 0.9057F, -0.0687F, 0.2458F);
        this.basin_r10.cubeList.add(new ModelBox(basin_r10, 71, 8, -0.5F, -0.1063F, -0.8061F, 1, 7, 2, 0.001F, false));

        this.basin_r11 = new ModelRenderer(this);
        this.basin_r11.setRotationPoint(0.2253F, 10.1169F, 7.777F);
        this.basin.addChild(basin_r11);
        this.setRotateAngle(basin_r11, 0.1739F, 0.0151F, 0.106F);
        this.basin_r11.cubeList.add(new ModelBox(basin_r11, 57, 57, -0.1343F, -0.1659F, -2.1307F, 1, 3, 5, 0.001F, false));

        this.basin_r12 = new ModelRenderer(this);
        this.basin_r12.setRotationPoint(2.1F, 5.3595F, 6.6358F);
        this.basin.addChild(basin_r12);
        this.setRotateAngle(basin_r12, 0.1739F, -0.0151F, 0.2779F);
        this.basin_r12.cubeList.add(new ModelBox(basin_r12, 38, 43, -0.6145F, 0.0452F, -0.8799F, 1, 5, 2, 0.001F, false));

        this.basin_r13 = new ModelRenderer(this);
        this.basin_r13.setRotationPoint(-0.5F, -0.3205F, 7.8702F);
        this.basin.addChild(basin_r13);
        this.setRotateAngle(basin_r13, -0.0873F, 0.0F, 0.0F);
        this.basin_r13.cubeList.add(new ModelBox(basin_r13, 50, 19, -0.9F, -1.2277F, 0.9948F, 2, 2, 9, 0.001F, false));

        this.body_r1 = new ModelRenderer(this);
        this.body_r1.setRotationPoint(-0.4F, -1.5635F, 12.6867F);
        this.basin.addChild(body_r1);
        this.setRotateAngle(body_r1, -0.0873F, 0.0F, 0.0F);
        this.body_r1.cubeList.add(new ModelBox(body_r1, 78, 10, 0.0F, -0.9085F, 3.346F, 0, 2, 1, 0.0F, false));
        this.body_r1.cubeList.add(new ModelBox(body_r1, 46, 78, 0.0F, -0.941F, 1.3239F, 0, 2, 1, 0.0F, false));
        this.body_r1.cubeList.add(new ModelBox(body_r1, 49, 78, 0.0F, -0.9735F, -0.6982F, 0, 2, 1, 0.0F, false));

        this.body_r2 = new ModelRenderer(this);
        this.body_r2.setRotationPoint(-0.4F, 1.9371F, 14.9485F);
        this.basin.addChild(body_r2);
        this.setRotateAngle(body_r2, 0.7767F, 0.0F, 0.0F);
        this.body_r2.cubeList.add(new ModelBox(body_r2, 21, 77, 0.0F, 1.2401F, 0.9672F, 0, 5, 1, 0.0F, false));
        this.body_r2.cubeList.add(new ModelBox(body_r2, 77, 76, 0.0F, -0.0953F, -0.5217F, 0, 4, 1, 0.0F, false));

        this.body_r3 = new ModelRenderer(this);
        this.body_r3.setRotationPoint(-0.4F, 1.6332F, 12.8324F);
        this.basin.addChild(body_r3);
        this.setRotateAngle(body_r3, 0.7418F, 0.0F, 0.0F);
        this.body_r3.cubeList.add(new ModelBox(body_r3, 9, 31, 0.0F, -0.1079F, -0.3808F, 0, 3, 1, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5826F, 7.7845F);
        this.basin.addChild(body);
        this.setRotateAngle(body, 0.1799F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.4F, -0.8951F, -17.608F, 2, 2, 19, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 48, 72, -0.4F, -1.8951F, -17.6045F, 0, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 43, 72, -0.4F, -2.1881F, -15.6035F, 0, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 79, 44, -0.4F, -2.3812F, -13.6028F, 0, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 79, 40, -0.4F, -2.5742F, -11.6021F, 0, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 79, 26, -0.4F, -2.5672F, -9.6022F, 0, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 15, 79, -0.4F, -2.4602F, -7.6025F, 0, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 79, -0.4F, -2.3532F, -5.6029F, 0, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 9, 79, -0.4F, -2.1463F, -3.6036F, 0, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 6, 79, -0.4F, -1.9393F, -1.6043F, 0, 2, 1, 0.0F, false));

        this.body_r4 = new ModelRenderer(this);
        this.body_r4.setRotationPoint(-0.4F, 8.8717F, -17.6387F);
        this.body.addChild(body_r4);
        this.setRotateAngle(body_r4, -0.3054F, 0.0F, 0.0F);
        this.body_r4.cubeList.add(new ModelBox(body_r4, 0, 22, -4.0F, -2.9668F, 0.0034F, 8, 3, 14, 0.0F, false));

        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(-0.2F, 0.2842F, -3.7172F);
        this.body.addChild(chest_r1);
        this.setRotateAngle(chest_r1, 0.0014F, -0.1007F, -0.692F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 16, 60, -2.7019F, -0.6826F, -0.1578F, 2, 0, 1, 0.0F, true));

        this.chest_r2 = new ModelRenderer(this);
        this.chest_r2.setRotationPoint(-0.2F, 0.2772F, -5.7172F);
        this.body.addChild(chest_r2);
        this.setRotateAngle(chest_r2, 0.082F, -0.0003F, -1.2714F);
        this.chest_r2.cubeList.add(new ModelBox(chest_r2, 24, 13, -2.8942F, -2.044F, -0.1578F, 1, 0, 1, 0.0F, true));

        this.chest_r3 = new ModelRenderer(this);
        this.chest_r3.setRotationPoint(-0.2F, 0.2772F, -5.7172F);
        this.body.addChild(chest_r3);
        this.setRotateAngle(chest_r3, 0.0687F, -0.0449F, -0.6969F);
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 28, 53, -2.7019F, -0.6826F, -0.1578F, 2, 0, 1, 0.0F, true));

        this.chest_r4 = new ModelRenderer(this);
        this.chest_r4.setRotationPoint(-0.2F, 0.2702F, -7.7172F);
        this.body.addChild(chest_r4);
        this.setRotateAngle(chest_r4, 0.0974F, 0.0497F, -1.271F);
        this.chest_r4.cubeList.add(new ModelBox(chest_r4, 50, 25, -4.8942F, -2.044F, -0.1578F, 3, 0, 1, 0.0F, true));

        this.chest_r5 = new ModelRenderer(this);
        this.chest_r5.setRotationPoint(-0.2F, 0.2702F, -7.7172F);
        this.body.addChild(chest_r5);
        this.setRotateAngle(chest_r5, 0.1088F, -0.0112F, -0.6981F);
        this.chest_r5.cubeList.add(new ModelBox(chest_r5, 0, 5, -2.7019F, -0.6826F, -0.1578F, 2, 0, 1, 0.0F, true));

        this.chest_r6 = new ModelRenderer(this);
        this.chest_r6.setRotationPoint(-0.2F, 0.2633F, -9.7172F);
        this.body.addChild(chest_r6);
        this.setRotateAngle(chest_r6, 0.113F, 0.0998F, -1.2698F);
        this.chest_r6.cubeList.add(new ModelBox(chest_r6, 69, 67, -5.8942F, -2.044F, -0.1578F, 4, 0, 1, 0.0F, true));

        this.chest_r7 = new ModelRenderer(this);
        this.chest_r7.setRotationPoint(-0.2F, 0.2633F, -9.7172F);
        this.body.addChild(chest_r7);
        this.setRotateAngle(chest_r7, 0.1489F, 0.0224F, -0.6978F);
        this.chest_r7.cubeList.add(new ModelBox(chest_r7, 12, 5, -2.7019F, -0.6826F, -0.1578F, 2, 0, 1, 0.0F, true));

        this.chest_r8 = new ModelRenderer(this);
        this.chest_r8.setRotationPoint(-0.2F, 0.2563F, -11.7172F);
        this.body.addChild(chest_r8);
        this.setRotateAngle(chest_r8, 0.1287F, 0.1498F, -1.2679F);
        this.chest_r8.cubeList.add(new ModelBox(chest_r8, 67, 43, -6.8942F, -2.044F, -0.1578F, 5, 0, 1, 0.0F, true));

        this.chest_r9 = new ModelRenderer(this);
        this.chest_r9.setRotationPoint(-0.2F, 0.2563F, -11.7172F);
        this.body.addChild(chest_r9);
        this.setRotateAngle(chest_r9, 0.1891F, 0.0561F, -0.6963F);
        this.chest_r9.cubeList.add(new ModelBox(chest_r9, 24, 5, -2.7019F, -0.6826F, -0.1578F, 2, 0, 1, 0.0F, true));

        this.chest_r10 = new ModelRenderer(this);
        this.chest_r10.setRotationPoint(-0.2F, 0.2493F, -13.7172F);
        this.body.addChild(chest_r10);
        this.setRotateAngle(chest_r10, 0.1446F, 0.1997F, -1.2651F);
        this.chest_r10.cubeList.add(new ModelBox(chest_r10, 44, 15, -7.8942F, -2.044F, -0.1578F, 6, 0, 1, 0.0F, true));

        this.chest_r11 = new ModelRenderer(this);
        this.chest_r11.setRotationPoint(-0.2F, 0.2493F, -13.7172F);
        this.body.addChild(chest_r11);
        this.setRotateAngle(chest_r11, 0.2294F, 0.0896F, -0.6933F);
        this.chest_r11.cubeList.add(new ModelBox(chest_r11, 34, 5, -2.7019F, -0.6826F, -0.1578F, 2, 0, 1, 0.0F, true));

        this.chest_r12 = new ModelRenderer(this);
        this.chest_r12.setRotationPoint(-0.2F, 0.2423F, -15.7172F);
        this.body.addChild(chest_r12);
        this.setRotateAngle(chest_r12, 0.1664F, 0.2662F, -1.2601F);
        this.chest_r12.cubeList.add(new ModelBox(chest_r12, 44, 11, -8.8942F, -2.044F, -0.1578F, 7, 0, 1, 0.0F, true));

        this.chest_r13 = new ModelRenderer(this);
        this.chest_r13.setRotationPoint(-0.2F, 0.2423F, -15.7172F);
        this.body.addChild(chest_r13);
        this.setRotateAngle(chest_r13, 0.2836F, 0.134F, -0.6873F);
        this.chest_r13.cubeList.add(new ModelBox(chest_r13, 38, 60, -2.7019F, -0.6826F, -0.1578F, 2, 0, 1, 0.0F, true));

        this.chest_r14 = new ModelRenderer(this);
        this.chest_r14.setRotationPoint(0.6F, 0.2842F, -3.7172F);
        this.body.addChild(chest_r14);
        this.setRotateAngle(chest_r14, 0.0014F, 0.1007F, 0.692F);
        this.chest_r14.cubeList.add(new ModelBox(chest_r14, 16, 60, -0.0641F, -0.0446F, -0.2362F, 2, 0, 1, 0.0F, false));

        this.chest_r15 = new ModelRenderer(this);
        this.chest_r15.setRotationPoint(0.6F, 0.2772F, -5.7172F);
        this.body.addChild(chest_r15);
        this.setRotateAngle(chest_r15, 0.082F, 0.0003F, 1.2714F);
        this.chest_r15.cubeList.add(new ModelBox(chest_r15, 24, 13, 1.5993F, -1.0918F, -0.2362F, 1, 0, 1, 0.0F, false));

        this.chest_r16 = new ModelRenderer(this);
        this.chest_r16.setRotationPoint(0.6F, 0.2772F, -5.7172F);
        this.body.addChild(chest_r16);
        this.setRotateAngle(chest_r16, 0.0687F, 0.0449F, 0.6969F);
        this.chest_r16.cubeList.add(new ModelBox(chest_r16, 28, 53, -0.0641F, -0.0446F, -0.2362F, 2, 0, 1, 0.0F, false));

        this.chest_r17 = new ModelRenderer(this);
        this.chest_r17.setRotationPoint(0.6F, 0.2702F, -7.7172F);
        this.body.addChild(chest_r17);
        this.setRotateAngle(chest_r17, 0.1088F, 0.0112F, 0.6981F);
        this.chest_r17.cubeList.add(new ModelBox(chest_r17, 0, 5, -0.0641F, -0.0446F, -0.2362F, 2, 0, 1, 0.0F, false));

        this.chest_r18 = new ModelRenderer(this);
        this.chest_r18.setRotationPoint(0.6F, 0.2702F, -7.7172F);
        this.body.addChild(chest_r18);
        this.setRotateAngle(chest_r18, 0.0974F, -0.0497F, 1.271F);
        this.chest_r18.cubeList.add(new ModelBox(chest_r18, 50, 25, 1.5993F, -1.0918F, -0.2362F, 3, 0, 1, 0.0F, false));

        this.chest_r19 = new ModelRenderer(this);
        this.chest_r19.setRotationPoint(0.6F, 0.2633F, -9.7172F);
        this.body.addChild(chest_r19);
        this.setRotateAngle(chest_r19, 0.1489F, -0.0224F, 0.6978F);
        this.chest_r19.cubeList.add(new ModelBox(chest_r19, 12, 5, -0.0641F, -0.0446F, -0.2362F, 2, 0, 1, 0.0F, false));

        this.chest_r20 = new ModelRenderer(this);
        this.chest_r20.setRotationPoint(0.6F, 0.2633F, -9.7172F);
        this.body.addChild(chest_r20);
        this.setRotateAngle(chest_r20, 0.113F, -0.0998F, 1.2698F);
        this.chest_r20.cubeList.add(new ModelBox(chest_r20, 69, 67, 1.5993F, -1.0918F, -0.2362F, 4, 0, 1, 0.0F, false));

        this.chest_r21 = new ModelRenderer(this);
        this.chest_r21.setRotationPoint(0.6F, 0.2563F, -11.7172F);
        this.body.addChild(chest_r21);
        this.setRotateAngle(chest_r21, 0.1891F, -0.0561F, 0.6963F);
        this.chest_r21.cubeList.add(new ModelBox(chest_r21, 24, 5, -0.0641F, -0.0446F, -0.2362F, 2, 0, 1, 0.0F, false));

        this.chest_r22 = new ModelRenderer(this);
        this.chest_r22.setRotationPoint(0.6F, 0.2563F, -11.7172F);
        this.body.addChild(chest_r22);
        this.setRotateAngle(chest_r22, 0.1287F, -0.1498F, 1.2679F);
        this.chest_r22.cubeList.add(new ModelBox(chest_r22, 67, 43, 1.5993F, -1.0918F, -0.2362F, 5, 0, 1, 0.0F, false));

        this.chest_r23 = new ModelRenderer(this);
        this.chest_r23.setRotationPoint(0.6F, 0.2493F, -13.7172F);
        this.body.addChild(chest_r23);
        this.setRotateAngle(chest_r23, 0.1446F, -0.1997F, 1.2651F);
        this.chest_r23.cubeList.add(new ModelBox(chest_r23, 44, 15, 1.5993F, -1.0918F, -0.2362F, 6, 0, 1, 0.0F, false));

        this.chest_r24 = new ModelRenderer(this);
        this.chest_r24.setRotationPoint(0.6F, 0.2493F, -13.7172F);
        this.body.addChild(chest_r24);
        this.setRotateAngle(chest_r24, 0.2294F, -0.0896F, 0.6933F);
        this.chest_r24.cubeList.add(new ModelBox(chest_r24, 34, 5, -0.0641F, -0.0446F, -0.2362F, 2, 0, 1, 0.0F, false));

        this.chest_r25 = new ModelRenderer(this);
        this.chest_r25.setRotationPoint(0.6F, 0.2423F, -15.7172F);
        this.body.addChild(chest_r25);
        this.setRotateAngle(chest_r25, 0.1664F, -0.2662F, 1.2601F);
        this.chest_r25.cubeList.add(new ModelBox(chest_r25, 44, 11, 1.5993F, -1.0918F, -0.2362F, 7, 0, 1, 0.0F, false));

        this.chest_r26 = new ModelRenderer(this);
        this.chest_r26.setRotationPoint(0.6F, 0.2423F, -15.7172F);
        this.body.addChild(chest_r26);
        this.setRotateAngle(chest_r26, 0.2836F, -0.134F, 0.6873F);
        this.chest_r26.cubeList.add(new ModelBox(chest_r26, 38, 60, -0.0641F, -0.0446F, -0.2362F, 2, 0, 1, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.1F, 0.1049F, -16.999F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 70, 45, -0.5F, -1.6084F, -3.007F, 0, 2, 1, 0.0F, false));
        this.chest.cubeList.add(new ModelBox(chest, 60, 66, -0.5F, -1.1154F, -5.0087F, 0, 2, 1, 0.0F, false));

        this.chest_r27 = new ModelRenderer(this);
        this.chest_r27.setRotationPoint(-0.3F, 0.1304F, -0.7182F);
        this.chest.addChild(chest_r27);
        this.setRotateAngle(chest_r27, 0.3384F, 0.1781F, -0.6787F);
        this.chest_r27.cubeList.add(new ModelBox(chest_r27, 27, 60, -2.7019F, -0.6826F, -0.1578F, 2, 0, 1, 0.0F, true));

        this.chest_r28 = new ModelRenderer(this);
        this.chest_r28.setRotationPoint(-0.3F, 0.1304F, -0.7182F);
        this.chest.addChild(chest_r28);
        this.setRotateAngle(chest_r28, 0.1889F, 0.3326F, -1.2534F);
        this.chest_r28.cubeList.add(new ModelBox(chest_r28, 44, 13, -8.8942F, -2.044F, -0.1578F, 7, 0, 1, 0.0F, true));

        this.chest_r29 = new ModelRenderer(this);
        this.chest_r29.setRotationPoint(-0.3F, 0.4235F, -2.7192F);
        this.chest.addChild(chest_r29);
        this.setRotateAngle(chest_r29, 0.2065F, 0.3823F, -1.2472F);
        this.chest_r29.cubeList.add(new ModelBox(chest_r29, 61, 34, -7.9821F, -2.0202F, -0.1993F, 6, 0, 1, 0.0F, true));

        this.chest_r30 = new ModelRenderer(this);
        this.chest_r30.setRotationPoint(-0.3F, 0.4235F, -2.7192F);
        this.chest.addChild(chest_r30);
        this.setRotateAngle(chest_r30, 0.3801F, 0.2108F, -0.6707F);
        this.chest_r30.cubeList.add(new ModelBox(chest_r30, 61, 31, -2.7626F, -0.6148F, -0.1993F, 2, 0, 1, 0.0F, true));

        this.chest_r31 = new ModelRenderer(this);
        this.chest_r31.setRotationPoint(-0.3F, 0.5172F, -4.5196F);
        this.chest.addChild(chest_r31);
        this.setRotateAngle(chest_r31, 0.4653F, 0.2751F, -0.6502F);
        this.chest_r31.cubeList.add(new ModelBox(chest_r31, 27, 62, -2.766F, -0.638F, -0.4217F, 2, 0, 1, 0.0F, true));

        this.chest_r32 = new ModelRenderer(this);
        this.chest_r32.setRotationPoint(-0.3F, 0.5172F, -4.5196F);
        this.chest.addChild(chest_r32);
        this.setRotateAngle(chest_r32, 0.244F, 0.4814F, -1.2315F);
        this.chest_r32.cubeList.add(new ModelBox(chest_r32, 68, 52, -6.9723F, -2.0416F, -0.4217F, 5, 0, 1, 0.0F, true));

        this.chest_r33 = new ModelRenderer(this);
        this.chest_r33.setRotationPoint(0.5F, 0.1304F, -0.7182F);
        this.chest.addChild(chest_r33);
        this.setRotateAngle(chest_r33, 0.3384F, -0.1781F, 0.6787F);
        this.chest_r33.cubeList.add(new ModelBox(chest_r33, 27, 60, -0.0641F, -0.0446F, -0.2362F, 2, 0, 1, 0.0F, false));

        this.chest_r34 = new ModelRenderer(this);
        this.chest_r34.setRotationPoint(0.5F, 0.1304F, -0.7182F);
        this.chest.addChild(chest_r34);
        this.setRotateAngle(chest_r34, 0.1889F, -0.3326F, 1.2534F);
        this.chest_r34.cubeList.add(new ModelBox(chest_r34, 44, 13, 1.5993F, -1.0918F, -0.2362F, 7, 0, 1, 0.0F, false));

        this.chest_r35 = new ModelRenderer(this);
        this.chest_r35.setRotationPoint(0.5F, 0.4235F, -2.7192F);
        this.chest.addChild(chest_r35);
        this.setRotateAngle(chest_r35, 0.3801F, -0.2108F, 0.6707F);
        this.chest_r35.cubeList.add(new ModelBox(chest_r35, 61, 31, -0.0034F, 0.0232F, -0.2776F, 2, 0, 1, 0.0F, false));

        this.chest_r36 = new ModelRenderer(this);
        this.chest_r36.setRotationPoint(0.5F, 0.4235F, -2.7192F);
        this.chest.addChild(chest_r36);
        this.setRotateAngle(chest_r36, 0.2065F, -0.3823F, 1.2472F);
        this.chest_r36.cubeList.add(new ModelBox(chest_r36, 61, 34, 1.6871F, -1.068F, -0.2776F, 6, 0, 1, 0.0F, false));

        this.chest_r37 = new ModelRenderer(this);
        this.chest_r37.setRotationPoint(0.5F, 0.5172F, -4.5196F);
        this.chest.addChild(chest_r37);
        this.setRotateAngle(chest_r37, 0.244F, -0.4814F, 1.2315F);
        this.chest_r37.cubeList.add(new ModelBox(chest_r37, 68, 52, 1.6773F, -1.0893F, -0.5F, 5, 0, 1, 0.0F, false));

        this.chest_r38 = new ModelRenderer(this);
        this.chest_r38.setRotationPoint(0.5F, 0.5172F, -4.5196F);
        this.chest.addChild(chest_r38);
        this.setRotateAngle(chest_r38, 0.4653F, -0.2751F, 0.6502F);
        this.chest_r38.cubeList.add(new ModelBox(chest_r38, 27, 62, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.chest_r39 = new ModelRenderer(this);
        this.chest_r39.setRotationPoint(-0.5F, 8.8448F, -0.0604F);
        this.chest.addChild(chest_r39);
        this.setRotateAngle(chest_r39, -0.4014F, 0.0F, 0.0F);
        this.chest_r39.cubeList.add(new ModelBox(chest_r39, 40, 19, -3.0F, -1.8721F, -3.9137F, 6, 2, 3, 0.001F, false));

        this.chest_r40 = new ModelRenderer(this);
        this.chest_r40.setRotationPoint(-3.3F, 5.4F, -4.8084F);
        this.chest.addChild(chest_r40);
        this.setRotateAngle(chest_r40, 1.0385F, 0.0006F, 0.1745F);
        this.chest_r40.cubeList.add(new ModelBox(chest_r40, 75, 35, -0.9848F, -1.0935F, -1.5257F, 3, 3, 1, 0.001F, true));
        this.chest_r40.cubeList.add(new ModelBox(chest_r40, 0, 10, -0.9848F, -1.0935F, -0.5257F, 1, 3, 1, 0.001F, true));
        this.chest_r40.cubeList.add(new ModelBox(chest_r40, 0, 40, -0.9848F, -0.0935F, 0.4743F, 1, 2, 6, 0.001F, true));

        this.chest_r41 = new ModelRenderer(this);
        this.chest_r41.setRotationPoint(3.5F, 5.4F, -4.8084F);
        this.chest.addChild(chest_r41);
        this.setRotateAngle(chest_r41, 1.0385F, -0.0006F, -0.1745F);
        this.chest_r41.cubeList.add(new ModelBox(chest_r41, 75, 35, -3.0F, -1.1811F, -1.3758F, 3, 3, 1, 0.001F, false));
        this.chest_r41.cubeList.add(new ModelBox(chest_r41, 0, 10, -1.0F, -1.1811F, -0.3758F, 1, 3, 1, 0.001F, false));
        this.chest_r41.cubeList.add(new ModelBox(chest_r41, 0, 40, -1.0F, -0.1811F, 0.6242F, 1, 2, 6, 0.001F, false));

        this.chest_r42 = new ModelRenderer(this);
        this.chest_r42.setRotationPoint(-0.5F, 0.7F, -6.0084F);
        this.chest.addChild(chest_r42);
        this.setRotateAngle(chest_r42, 0.1222F, 0.0F, 0.0F);
        this.chest_r42.cubeList.add(new ModelBox(chest_r42, 50, 31, -1.0F, -1.0F, 0.0F, 2, 2, 6, 0.001F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.4983F, -5.3024F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.0113F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 65, 36, -1.5F, -0.6946F, -4.0652F, 2, 2, 4, -0.002F, false));

        this.neck10_r1 = new ModelRenderer(this);
        this.neck10_r1.setRotationPoint(-0.3F, 1.0713F, -1.3666F);
        this.neck1.addChild(neck10_r1);
        this.setRotateAngle(neck10_r1, -0.3491F, -0.3002F, 0.0F);
        this.neck10_r1.cubeList.add(new ModelBox(neck10_r1, 43, 72, -0.9606F, -0.5396F, 0.1889F, 0, 1, 4, 0.0F, true));

        this.neck9_r1 = new ModelRenderer(this);
        this.neck9_r1.setRotationPoint(-0.3F, 1.1222F, -3.4275F);
        this.neck1.addChild(neck9_r1);
        this.setRotateAngle(neck9_r1, -0.1745F, -0.3002F, 0.0F);
        this.neck9_r1.cubeList.add(new ModelBox(neck9_r1, 0, 0, -0.9527F, -0.3993F, 0.244F, 0, 1, 3, 0.0F, true));

        this.neck9_r2 = new ModelRenderer(this);
        this.neck9_r2.setRotationPoint(0.5F, 1.0713F, -1.3666F);
        this.neck1.addChild(neck9_r2);
        this.setRotateAngle(neck9_r2, -0.3491F, 0.3002F, 0.0F);
        this.neck9_r2.cubeList.add(new ModelBox(neck9_r2, 43, 72, 0.0053F, -0.4384F, -0.089F, 0, 1, 4, 0.0F, false));

        this.neck8_r1 = new ModelRenderer(this);
        this.neck8_r1.setRotationPoint(0.5F, 1.1222F, -3.4275F);
        this.neck1.addChild(neck8_r1);
        this.setRotateAngle(neck8_r1, -0.1745F, 0.3002F, 0.0F);
        this.neck8_r1.cubeList.add(new ModelBox(neck8_r1, 0, 0, -0.0026F, -0.3479F, -0.0472F, 0, 1, 3, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0932F, -3.8009F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.6796F, 0.2992F, -0.0144F);


        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(-0.5F, 0.7561F, -6.8926F);
        this.neck2.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.2094F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 0, 0, -1.0F, -0.1F, 0.0F, 2, 2, 7, 0.0F, false));

        this.neck8_r2 = new ModelRenderer(this);
        this.neck8_r2.setRotationPoint(-0.3F, 1.2038F, -1.0051F);
        this.neck2.addChild(neck8_r2);
        this.setRotateAngle(neck8_r2, 0.1396F, -0.3002F, 0.0F);
        this.neck8_r2.cubeList.add(new ModelBox(neck8_r2, 12, 0, -0.9414F, -0.4307F, 0.2999F, 0, 1, 3, 0.0F, true));

        this.neck7_r1 = new ModelRenderer(this);
        this.neck7_r1.setRotationPoint(-0.3F, 2.1123F, -2.9581F);
        this.neck2.addChild(neck7_r1);
        this.setRotateAngle(neck7_r1, 0.0873F, -0.3002F, 0.0F);
        this.neck7_r1.cubeList.add(new ModelBox(neck7_r1, 24, 0, -1.006F, -0.6691F, 0.1117F, 0, 1, 3, 0.0F, true));

        this.neck6_r1 = new ModelRenderer(this);
        this.neck6_r1.setRotationPoint(-0.3F, 1.5561F, -5.5926F);
        this.neck2.addChild(neck6_r1);
        this.setRotateAngle(neck6_r1, 0.0F, -0.3002F, 0.0F);
        this.neck6_r1.cubeList.add(new ModelBox(neck6_r1, 34, 0, -0.9553F, 0.2903F, 0.2767F, 0, 1, 3, 0.0F, true));

        this.neck7_r2 = new ModelRenderer(this);
        this.neck7_r2.setRotationPoint(0.5F, 1.2038F, -1.0051F);
        this.neck2.addChild(neck7_r2);
        this.setRotateAngle(neck7_r2, 0.1396F, 0.3002F, 0.0F);
        this.neck7_r2.cubeList.add(new ModelBox(neck7_r2, 12, 0, -0.0139F, -0.4719F, 0.0072F, 0, 1, 3, 0.0F, false));

        this.neck6_r2 = new ModelRenderer(this);
        this.neck6_r2.setRotationPoint(0.5F, 2.1123F, -2.9581F);
        this.neck2.addChild(neck6_r2);
        this.setRotateAngle(neck6_r2, 0.0873F, 0.3002F, 0.0F);
        this.neck6_r2.cubeList.add(new ModelBox(neck6_r2, 24, 0, 0.0507F, -0.6949F, -0.1829F, 0, 1, 3, 0.0F, false));

        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(0.5F, 1.5561F, -5.5926F);
        this.neck2.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, 0.0F, 0.3002F, 0.0F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 34, 0, 0.0F, 0.2903F, -0.019F, 0, 1, 3, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(-0.5F, 1.4142F, -6.3346F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3568F, 0.3564F, 0.1685F);


        this.neck5_r2 = new ModelRenderer(this);
        this.neck5_r2.setRotationPoint(0.2F, 1.2917F, -1.9295F);
        this.neck3.addChild(neck5_r2);
        this.setRotateAngle(neck5_r2, -0.186F, -0.1716F, 0.0321F);
        this.neck5_r2.cubeList.add(new ModelBox(neck5_r2, 34, 10, -0.9848F, -0.489F, 0.1831F, 0, 1, 3, 0.0F, true));

        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(1.0F, 1.2917F, -1.9295F);
        this.neck3.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, -0.186F, 0.1716F, -0.0321F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 34, 10, 0.0F, -0.489F, 0.0094F, 0, 1, 3, 0.0F, false));

        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.0F, 0.4917F, -3.5295F);
        this.neck3.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 0.1222F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 60, 66, -1.0F, -1.0F, -0.5F, 2, 2, 4, 0.001F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.02F, 0.4016F, -3.5803F);
        this.neck3.addChild(head1);
        this.setRotateAngle(head1, 0.0079F, 0.2301F, -0.1968F);


        this.head3_r1 = new ModelRenderer(this);
        this.head3_r1.setRotationPoint(0.0F, -1.4358F, -0.2355F);
        this.head1.addChild(head3_r1);
        this.setRotateAngle(head3_r1, 0.2705F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 69, 0, -2.0F, -0.6138F, -0.7714F, 4, 3, 1, 0.0F, false));

        this.head2_r1 = new ModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, 1.0642F, -3.2355F);
        this.head1.addChild(head2_r1);
        this.setRotateAngle(head2_r1, -0.1571F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 38, 54, -2.0F, -1.0F, 1.7F, 4, 1, 2, -0.001F, false));
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 55, 43, -2.0F, -3.0F, -0.4F, 4, 3, 3, 0.0F, false));

        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(1.16F, -1.9358F, -3.1355F);
        this.head1.addChild(head5_r1);
        this.setRotateAngle(head5_r1, 0.0349F, 0.0F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 76, 5, -2.97F, 0.2787F, -1.6295F, 1, 2, 2, 0.2F, true));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 76, 5, -3.57F, 0.2787F, -1.6295F, 1, 2, 2, -0.3F, true));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 44, 0, -3.23F, 0.2787F, -1.6295F, 1, 2, 2, 0.002F, true));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 44, 0, -0.03F, 0.2787F, -1.6295F, 1, 2, 2, 0.002F, false));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 76, 5, -0.29F, 0.2787F, -1.6295F, 1, 2, 2, 0.2F, false));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 76, 5, 0.31F, 0.2787F, -1.6295F, 1, 2, 2, -0.3F, false));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 0, 10, -3.16F, -0.0213F, -2.0295F, 4, 3, 5, 0.002F, false));

        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 1.95F, -0.2412F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.3491F, 0.0F, 0.0F);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 61, 0, 1.0F, -0.5F, -4.0F, 1, 2, 5, -0.002F, false));
        this.jaw1.cubeList.add(new ModelBox(jaw1, 61, 0, -1.94F, -0.5F, -4.0F, 1, 2, 5, -0.002F, true));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, -0.4F, -4.2F);
        this.jaw1.addChild(jaw2);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 60, 73, 0.5F, -0.1F, -2.3F, 1, 2, 3, -0.01F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 60, 73, -1.44F, -0.1F, -2.3F, 1, 2, 3, -0.01F, true));

        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 0.84F, -4.8F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.0456F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 58, 50, -1.0F, -1.029F, -2.2295F, 2, 1, 5, 0.0F, false));
        this.jaw3.cubeList.add(new ModelBox(jaw3, 24, 10, -1.0F, -0.629F, -2.2295F, 2, 1, 5, -0.002F, false));

        this.lowerteeth2 = new ModelRenderer(this);
        this.lowerteeth2.setRotationPoint(0.0F, -2.0F, -0.1F);
        this.jaw3.addChild(lowerteeth2);


        this.lowerteeth2_r1 = new ModelRenderer(this);
        this.lowerteeth2_r1.setRotationPoint(0.0F, 0.8574F, -2.0406F);
        this.lowerteeth2.addChild(lowerteeth2_r1);
        this.setRotateAngle(lowerteeth2_r1, -0.0524F, 0.0F, 0.0F);
        this.lowerteeth2_r1.cubeList.add(new ModelBox(lowerteeth2_r1, 68, 45, -0.5F, -0.4328F, 0.0741F, 1, 1, 5, 0.0F, false));

        this.lowerteeth1 = new ModelRenderer(this);
        this.lowerteeth1.setRotationPoint(0.0F, -0.6F, 0.2F);
        this.jaw2.addChild(lowerteeth1);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 2.0642F, -3.6355F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.0585F, 0.0F, 0.0F);


        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(-0.24F, -3.9F, -3.2F);
        this.head2.addChild(head4_r1);
        this.setRotateAngle(head4_r1, -0.0837F, -0.2528F, 0.577F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 75, 15, -1.0738F, 0.6294F, 0.2008F, 1, 0, 3, 0.0F, true));

        this.head3_r2 = new ModelRenderer(this);
        this.head3_r2.setRotationPoint(1.4F, -3.9F, -3.2F);
        this.head2.addChild(head3_r2);
        this.setRotateAngle(head3_r2, -0.0837F, 0.2528F, -0.577F);
        this.head3_r2.cubeList.add(new ModelBox(head3_r2, 75, 15, -0.9F, -0.0018F, -0.1047F, 1, 0, 3, 0.0F, false));

        this.head2_r2 = new ModelRenderer(this);
        this.head2_r2.setRotationPoint(0.0F, -0.9F, -3.2F);
        this.head2.addChild(head2_r2);
        this.setRotateAngle(head2_r2, 0.0349F, 0.0F, 0.0F);
        this.head2_r2.cubeList.add(new ModelBox(head2_r2, 18, 71, -1.5F, -3.0F, 0.0F, 3, 3, 2, 0.0F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, -1.8F, -5.1F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.0911F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 44, 5, -1.0F, -0.3F, -2.6F, 2, 1, 1, 0.0F, false));

        this.head3_r3 = new ModelRenderer(this);
        this.head3_r3.setRotationPoint(0.0F, 0.7F, -1.9F);
        this.head3.addChild(head3_r3);
        this.setRotateAngle(head3_r3, -0.0175F, 0.0F, 0.0F);
        this.head3_r3.cubeList.add(new ModelBox(head3_r3, 67, 20, -1.0F, -2.0F, 0.0F, 2, 2, 4, -0.002F, false));

        this.teeth2 = new ModelRenderer(this);
        this.teeth2.setRotationPoint(0.0F, 2.2F, 0.5F);
        this.head3.addChild(teeth2);


        this.teeth2_r1 = new ModelRenderer(this);
        this.teeth2_r1.setRotationPoint(0.0F, -1.4165F, -2.8396F);
        this.teeth2.addChild(teeth2_r1);
        this.setRotateAngle(teeth2_r1, -0.0698F, 0.0F, 0.0F);
        this.teeth2_r1.cubeList.add(new ModelBox(teeth2_r1, 68, 27, -0.5F, -0.5F, -0.1F, 1, 1, 5, 0.0F, false));

        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -1.0F, 1.7F);
        this.head3.addChild(head4);
        this.setRotateAngle(head4, 0.07F, 0.0F, 0.0F);


        this.head6_r1 = new ModelRenderer(this);
        this.head6_r1.setRotationPoint(0.0F, 0.0059F, -4.1898F);
        this.head4.addChild(head6_r1);
        this.setRotateAngle(head6_r1, 1.4835F, 0.0F, 0.0F);
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 24, 10, -0.5F, -0.097F, -0.8739F, 1, 1, 1, 0.0F, false));

        this.head5_r2 = new ModelRenderer(this);
        this.head5_r2.setRotationPoint(0.0F, -0.7F, -3.5F);
        this.head4.addChild(head5_r2);
        this.setRotateAngle(head5_r2, 0.6807F, 0.0F, 0.0F);
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 14, 10, -0.5F, 0.0175F, -0.9542F, 1, 2, 1, 0.0F, false));

        this.head4_r2 = new ModelRenderer(this);
        this.head4_r2.setRotationPoint(0.0F, -1.3F, 0.4F);
        this.head4.addChild(head4_r2);
        this.setRotateAngle(head4_r2, 0.1571F, 0.0F, 0.0F);
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 69, 69, -0.5F, 0.0F, -3.9F, 1, 2, 4, 0.0F, false));

        this.teeth1 = new ModelRenderer(this);
        this.teeth1.setRotationPoint(0.0F, 0.0F, -0.7F);
        this.head2.addChild(teeth1);


        this.teeth1_r1 = new ModelRenderer(this);
        this.teeth1_r1.setRotationPoint(0.0F, -0.7316F, -0.6921F);
        this.teeth1.addChild(teeth1_r1);
        this.setRotateAngle(teeth1_r1, 0.2094F, 0.0F, 0.0F);
        this.teeth1_r1.cubeList.add(new ModelBox(teeth1_r1, 0, 49, -1.0F, -0.6F, -1.5F, 2, 1, 4, 0.0F, false));

        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(4.0F, 6.4F, -3.3084F);
        this.chest.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.5439F, 0.2121F, -0.224F);
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 36, 71, -0.3F, -0.3851F, -0.9313F, 1, 7, 2, 0.0F, false));

        this.lowerarm2 = new ModelRenderer(this);
        this.lowerarm2.setRotationPoint(0.1F, 6.2149F, 0.3687F);
        this.upperarm2.addChild(lowerarm2);
        this.setRotateAngle(lowerarm2, -0.8446F, 0.0964F, 0.303F);
        this.lowerarm2.cubeList.add(new ModelBox(lowerarm2, 69, 76, -0.4F, -0.1996F, -0.0998F, 1, 7, 1, 0.0F, false));
        this.lowerarm2.cubeList.add(new ModelBox(lowerarm2, 29, 43, -0.4F, -0.1996F, -1.2998F, 1, 7, 1, 0.0F, false));

        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.1F, 6.9004F, -0.0998F);
        this.lowerarm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.1146F, -0.0699F, 0.2937F);
        this.hand2.cubeList.add(new ModelBox(hand2, 31, 60, -0.3696F, -0.3712F, -2.7904F, 1, 6, 4, 0.0F, false));

        this.upperarm3 = new ModelRenderer(this);
        this.upperarm3.setRotationPoint(-4.8F, 6.4F, -3.3084F);
        this.chest.addChild(upperarm3);
        this.setRotateAngle(upperarm3, 0.7621F, -0.2121F, 0.224F);
        this.upperarm3.cubeList.add(new ModelBox(upperarm3, 29, 71, -0.7F, -0.3851F, -0.9313F, 1, 7, 2, 0.0F, false));

        this.lowerarm3 = new ModelRenderer(this);
        this.lowerarm3.setRotationPoint(-0.1F, 6.2149F, 0.3687F);
        this.upperarm3.addChild(lowerarm3);
        this.setRotateAngle(lowerarm3, -1.5428F, -0.0964F, -0.303F);
        this.lowerarm3.cubeList.add(new ModelBox(lowerarm3, 40, 25, -0.6F, -0.1996F, -0.0998F, 1, 7, 1, 0.0F, false));
        this.lowerarm3.cubeList.add(new ModelBox(lowerarm3, 9, 22, -0.6F, -0.1996F, -1.2998F, 1, 7, 1, 0.0F, false));

        this.hand3 = new ModelRenderer(this);
        this.hand3.setRotationPoint(-0.23F, 7.1538F, -1.0584F);
        this.lowerarm3.addChild(hand3);
        this.setRotateAngle(hand3, 0.0968F, 0.093F, -0.5114F);
        this.hand3.cubeList.add(new ModelBox(hand3, 20, 60, -0.5F, -0.4638F, -1.8033F, 1, 6, 4, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(-0.5F, 0.2529F, 17.9149F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, 0.1329F, -0.173F, -0.023F);
        this.tail1.cubeList.add(new ModelBox(tail1, 30, 25, -0.9F, -0.9064F, -0.1575F, 2, 2, 15, 0.0F, false));

        this.body_r5 = new ModelRenderer(this);
        this.body_r5.setRotationPoint(0.1F, -1.8211F, -5.1585F);
        this.tail1.addChild(body_r5);
        this.setRotateAngle(body_r5, -0.0873F, 0.0F, 0.0F);
        this.body_r5.cubeList.add(new ModelBox(body_r5, 49, 62, 0.0F, -1.5443F, 17.1422F, 0, 2, 1, 0.0F, false));
        this.body_r5.cubeList.add(new ModelBox(body_r5, 52, 62, 0.0F, -1.4885F, 15.1205F, 0, 2, 1, 0.0F, false));
        this.body_r5.cubeList.add(new ModelBox(body_r5, 42, 62, 0.0F, -1.5973F, 19.0678F, 0, 2, 1, 0.0F, false));
        this.body_r5.cubeList.add(new ModelBox(body_r5, 64, 24, 0.0F, -1.3344F, 13.1165F, 0, 2, 1, 0.0F, false));
        this.body_r5.cubeList.add(new ModelBox(body_r5, 76, 27, 0.0F, -1.1802F, 11.1124F, 0, 2, 1, 0.0F, false));
        this.body_r5.cubeList.add(new ModelBox(body_r5, 76, 45, 0.0F, -1.026F, 9.1084F, 0, 2, 1, 0.0F, false));
        this.body_r5.cubeList.add(new ModelBox(body_r5, 76, 69, 0.0F, -0.8718F, 7.1043F, 0, 2, 1, 0.0F, false));
        this.body_r5.cubeList.add(new ModelBox(body_r5, 77, 54, 0.0F, -0.8161F, 5.0827F, 0, 2, 1, 0.0F, false));

        this.body_r6 = new ModelRenderer(this);
        this.body_r6.setRotationPoint(0.1F, 1.3143F, 1.187F);
        this.tail1.addChild(body_r6);
        this.setRotateAngle(body_r6, 0.829F, 0.0F, 0.0F);
        this.body_r6.cubeList.add(new ModelBox(body_r6, 9, 40, 0.0F, 7.3114F, 8.0154F, 0, 4, 1, 0.0F, false));
        this.body_r6.cubeList.add(new ModelBox(body_r6, 43, 78, 0.0F, 6.4631F, 6.5383F, 0, 4, 1, 0.0F, false));
        this.body_r6.cubeList.add(new ModelBox(body_r6, 53, 31, 0.0F, 5.5147F, 5.0611F, 0, 4, 1, 0.0F, false));
        this.body_r6.cubeList.add(new ModelBox(body_r6, 24, 77, 0.0F, 4.1664F, 3.584F, 0, 4, 1, 0.0F, false));
        this.body_r6.cubeList.add(new ModelBox(body_r6, 61, 11, 0.0F, 2.818F, 2.1068F, 0, 5, 1, 0.0F, false));
        this.body_r6.cubeList.add(new ModelBox(body_r6, 74, 76, 0.0F, 1.4697F, 0.6297F, 0, 5, 1, 0.0F, false));
        this.body_r6.cubeList.add(new ModelBox(body_r6, 18, 77, 0.0F, -0.0264F, -0.7126F, 0, 5, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0194F, 14.8652F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.2228F, -0.0851F, -0.0193F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 40, -0.9F, -0.9101F, -0.116F, 2, 2, 15, 0.001F, false));

        this.body_r7 = new ModelRenderer(this);
        this.body_r7.setRotationPoint(0.1F, -1.8248F, -20.1178F);
        this.tail2.addChild(body_r7);
        this.setRotateAngle(body_r7, -0.0873F, 0.0F, 0.0F);
        this.body_r7.cubeList.add(new ModelBox(body_r7, 0, 49, 0.0F, -1.9004F, 29.1073F, 0, 2, 1, 0.0F, false));
        this.body_r7.cubeList.add(new ModelBox(body_r7, 9, 49, 0.0F, -1.9407F, 27.0853F, 0, 2, 1, 0.0F, false));
        this.body_r7.cubeList.add(new ModelBox(body_r7, 12, 49, 0.0F, -1.8818F, 25.0762F, 0, 2, 1, 0.0F, false));
        this.body_r7.cubeList.add(new ModelBox(body_r7, 56, 56, 0.0F, -1.8229F, 23.0671F, 0, 2, 1, 0.0F, false));
        this.body_r7.cubeList.add(new ModelBox(body_r7, 9, 58, 0.0F, -1.6648F, 21.0708F, 0, 2, 1, 0.0F, false));

        this.body_r8 = new ModelRenderer(this);
        this.body_r8.setRotationPoint(0.1F, 1.3106F, -13.7723F);
        this.tail2.addChild(body_r8);
        this.setRotateAngle(body_r8, 0.829F, 0.0F, 0.0F);
        this.body_r8.cubeList.add(new ModelBox(body_r8, 61, 0, 0.0F, 15.7444F, 16.55F, 0, 3, 1, 0.0F, false));
        this.body_r8.cubeList.add(new ModelBox(body_r8, 65, 57, 0.0F, 14.3275F, 15.1385F, 0, 3, 1, 0.0F, false));
        this.body_r8.cubeList.add(new ModelBox(body_r8, 12, 40, 0.0F, 12.2106F, 13.7271F, 0, 4, 1, 0.0F, false));
        this.body_r8.cubeList.add(new ModelBox(body_r8, 50, 31, 0.0F, 10.9936F, 12.3156F, 0, 4, 1, 0.0F, false));
        this.body_r8.cubeList.add(new ModelBox(body_r8, 3, 40, 0.0F, 10.0767F, 10.9041F, 0, 4, 1, 0.0F, false));
        this.body_r8.cubeList.add(new ModelBox(body_r8, 0, 40, 0.0F, 8.6598F, 9.4926F, 0, 4, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1915F, 14.8918F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2601F, 0.1265F, -0.0336F);
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 0, -0.4F, -0.5203F, -0.2717F, 1, 1, 17, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1153F, 16.5197F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.3105F, 0.2498F, -0.0792F);
        this.tail4.cubeList.add(new ModelBox(tail4, 20, 43, -0.4F, -0.4331F, 0.0393F, 1, 1, 15, -0.001F, false));

        this.upperleg1 = new ModelRenderer(this);
        this.upperleg1.setRotationPoint(3.4F, 2.3515F, 9.0786F);
        this.basin.addChild(upperleg1);
        this.setRotateAngle(upperleg1, -0.0552F, -0.0692F, -0.1603F);
        this.upperleg1.cubeList.add(new ModelBox(upperleg1, 0, 58, -1.0F, -0.7609F, -0.8515F, 2, 11, 2, 0.0F, false));

        this.lowerleg1 = new ModelRenderer(this);
        this.lowerleg1.setRotationPoint(0.5F, 10.9391F, 0.6485F);
        this.upperleg1.addChild(lowerleg1);
        this.setRotateAngle(lowerleg1, 0.8589F, -0.0486F, 0.1551F);
        this.lowerleg1.cubeList.add(new ModelBox(lowerleg1, 31, 22, -1.5F, -0.534F, -0.834F, 2, 11, 2, 0.001F, false));
        this.lowerleg1.cubeList.add(new ModelBox(lowerleg1, 53, 66, -1.5F, -0.534F, 1.266F, 2, 11, 1, -0.2F, false));

        this.feet1 = new ModelRenderer(this);
        this.feet1.setRotationPoint(-0.5F, 9.766F, 1.666F);
        this.lowerleg1.addChild(feet1);
        this.setRotateAngle(feet1, -0.7247F, 0.0F, 0.0F);
        this.feet1.cubeList.add(new ModelBox(feet1, 70, 57, -1.0F, 1.2F, -2.0F, 2, 7, 2, 0.0F, false));

        this.toes1 = new ModelRenderer(this);
        this.toes1.setRotationPoint(0.0F, 8.1F, 0.2F);
        this.feet1.addChild(toes1);
        this.setRotateAngle(toes1, 0.0019F, 0.0F, 0.0F);
        this.toes1.cubeList.add(new ModelBox(toes1, 44, 0, -2.0F, -0.3F, -8.0F, 4, 2, 8, 0.0F, false));

        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(-4.0F, 2.3515F, 9.0786F);
        this.basin.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.9278F, 0.0692F, 0.1603F);
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 20, 40, -1.0F, -0.7609F, -0.8515F, 2, 11, 2, 0.0F, false));

        this.lowerleg2 = new ModelRenderer(this);
        this.lowerleg2.setRotationPoint(-0.5F, 10.9391F, 0.6485F);
        this.upperleg2.addChild(lowerleg2);
        this.setRotateAngle(lowerleg2, 1.3825F, 0.0486F, -0.1551F);
        this.lowerleg2.cubeList.add(new ModelBox(lowerleg2, 0, 22, -0.5F, -0.534F, -0.834F, 2, 11, 2, 0.001F, false));
        this.lowerleg2.cubeList.add(new ModelBox(lowerleg2, 64, 11, -0.5F, -0.534F, 1.266F, 2, 11, 1, -0.2F, false));

        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(0.5F, 9.766F, 1.666F);
        this.lowerleg2.addChild(feet2);
        this.setRotateAngle(feet2, -1.2919F, 0.0F, 0.0F);
        this.feet2.cubeList.add(new ModelBox(feet2, 9, 69, -1.0F, 1.2F, -2.0F, 2, 7, 2, 0.0F, false));

        this.toes2 = new ModelRenderer(this);
        this.toes2.setRotationPoint(0.0F, 8.1F, 0.2F);
        this.feet2.addChild(toes2);
        this.setRotateAngle(toes2, 1.66F, 0.0F, 0.0F);
        this.toes2.cubeList.add(new ModelBox(toes2, 38, 43, -2.0F, -0.3F, -8.0F, 4, 2, 8, 0.0F, false));

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
