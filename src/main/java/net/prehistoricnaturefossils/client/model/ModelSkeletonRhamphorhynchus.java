package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonRhamphorhynchus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer chest;
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
    private final ModelRenderer body1;
    private final ModelRenderer chest_r26;
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
    private final ModelRenderer body2_r1;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body6_r2;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body5_r2;
    private final ModelRenderer body5_r3;
    private final ModelRenderer body2_r2;
    private final ModelRenderer body1_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer upperlegleft;
    private final ModelRenderer lowerlegleft;
    private final ModelRenderer footleft;
    private final ModelRenderer upperlegright;
    private final ModelRenderer lowerlegright;
    private final ModelRenderer footright;
    private final ModelRenderer wingleft1;
    private final ModelRenderer wingleft2;
    private final ModelRenderer handR_r1;
    private final ModelRenderer wingleft3;
    private final ModelRenderer wingleft4;
    private final ModelRenderer wing4R_r1;
    private final ModelRenderer handleft;
    private final ModelRenderer wingright1;
    private final ModelRenderer wingright2;
    private final ModelRenderer handR_r2;
    private final ModelRenderer wingright3;
    private final ModelRenderer wingright4;
    private final ModelRenderer wing4R_r2;
    private final ModelRenderer handright;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer head;
    private final ModelRenderer head2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head3;
    private final ModelRenderer head4;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer jaw3;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;

    public ModelSkeletonRhamphorhynchus() {
        this.textureWidth = 72;
        this.textureHeight = 72;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 12.4804F, -1.7332F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.1911F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 26, 33, -0.5F, -0.9F, -2.0F, 1, 1, 6, 0.0F, false));

        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(-0.5F, -0.4F, 2.5F);
        this.chest.addChild(chest_r1);
        this.setRotateAngle(chest_r1, 0.0F, 0.0F, -0.7418F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 36, 9, -2.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest_r2 = new ModelRenderer(this);
        this.chest_r2.setRotationPoint(-0.5F, -0.4F, 2.5F);
        this.chest.addChild(chest_r2);
        this.setRotateAngle(chest_r2, 0.0F, 0.0F, -1.2654F);
        this.chest_r2.cubeList.add(new ModelBox(chest_r2, 26, 41, -3.3056F, -1.8192F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r3 = new ModelRenderer(this);
        this.chest_r3.setRotationPoint(-0.5F, -0.4F, 2.5F);
        this.chest.addChild(chest_r3);
        this.setRotateAngle(chest_r3, 0.0F, 0.0F, -0.3054F);
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 31, 41, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r4 = new ModelRenderer(this);
        this.chest_r4.setRotationPoint(-0.5F, -0.4F, 0.5F);
        this.chest.addChild(chest_r4);
        this.setRotateAngle(chest_r4, 0.0F, 0.0F, -0.925F);
        this.chest_r4.cubeList.add(new ModelBox(chest_r4, 36, 11, -2.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest_r5 = new ModelRenderer(this);
        this.chest_r5.setRotationPoint(-0.5F, -0.4F, 0.5F);
        this.chest.addChild(chest_r5);
        this.setRotateAngle(chest_r5, 0.0F, 0.0F, -0.4887F);
        this.chest_r5.cubeList.add(new ModelBox(chest_r5, 36, 41, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r6 = new ModelRenderer(this);
        this.chest_r6.setRotationPoint(-0.5F, -0.4F, -1.5F);
        this.chest.addChild(chest_r6);
        this.setRotateAngle(chest_r6, 0.0F, 0.0F, -1.0996F);
        this.chest_r6.cubeList.add(new ModelBox(chest_r6, 43, 20, -1.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r7 = new ModelRenderer(this);
        this.chest_r7.setRotationPoint(-0.5F, -0.4F, -1.5F);
        this.chest.addChild(chest_r7);
        this.setRotateAngle(chest_r7, 0.0F, 0.0F, -0.6632F);
        this.chest_r7.cubeList.add(new ModelBox(chest_r7, 18, 44, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r8 = new ModelRenderer(this);
        this.chest_r8.setRotationPoint(0.5F, -0.4F, 2.5F);
        this.chest.addChild(chest_r8);
        this.setRotateAngle(chest_r8, 0.0F, 0.0F, 0.3054F);
        this.chest_r8.cubeList.add(new ModelBox(chest_r8, 31, 41, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest_r9 = new ModelRenderer(this);
        this.chest_r9.setRotationPoint(0.5F, -0.4F, 2.5F);
        this.chest.addChild(chest_r9);
        this.setRotateAngle(chest_r9, 0.0F, 0.0F, 0.7418F);
        this.chest_r9.cubeList.add(new ModelBox(chest_r9, 36, 9, 0.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, false));

        this.chest_r10 = new ModelRenderer(this);
        this.chest_r10.setRotationPoint(0.5F, -0.4F, 2.5F);
        this.chest.addChild(chest_r10);
        this.setRotateAngle(chest_r10, 0.0F, 0.0F, 1.2654F);
        this.chest_r10.cubeList.add(new ModelBox(chest_r10, 26, 41, 2.3056F, -1.8192F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest_r11 = new ModelRenderer(this);
        this.chest_r11.setRotationPoint(0.5F, -0.4F, 0.5F);
        this.chest.addChild(chest_r11);
        this.setRotateAngle(chest_r11, 0.0F, 0.0F, 0.4887F);
        this.chest_r11.cubeList.add(new ModelBox(chest_r11, 36, 41, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest_r12 = new ModelRenderer(this);
        this.chest_r12.setRotationPoint(0.5F, -0.4F, 0.5F);
        this.chest.addChild(chest_r12);
        this.setRotateAngle(chest_r12, 0.0F, 0.0F, 0.925F);
        this.chest_r12.cubeList.add(new ModelBox(chest_r12, 36, 11, 0.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, false));

        this.chest_r13 = new ModelRenderer(this);
        this.chest_r13.setRotationPoint(0.5F, -0.4F, -1.5F);
        this.chest.addChild(chest_r13);
        this.setRotateAngle(chest_r13, 0.0F, 0.0F, 1.0996F);
        this.chest_r13.cubeList.add(new ModelBox(chest_r13, 43, 20, 0.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest_r14 = new ModelRenderer(this);
        this.chest_r14.setRotationPoint(0.5F, -0.4F, -1.5F);
        this.chest.addChild(chest_r14);
        this.setRotateAngle(chest_r14, 0.0F, 0.0F, 0.6632F);
        this.chest_r14.cubeList.add(new ModelBox(chest_r14, 18, 44, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest_r15 = new ModelRenderer(this);
        this.chest_r15.setRotationPoint(-2.0F, -0.4F, 1.0F);
        this.chest.addChild(chest_r15);
        this.setRotateAngle(chest_r15, 0.079F, 0.4867F, -0.5216F);
        this.chest_r15.cubeList.add(new ModelBox(chest_r15, 11, 10, 0.0543F, -0.1F, -3.7704F, 1, 3, 1, 0.0F, true));

        this.chest_r16 = new ModelRenderer(this);
        this.chest_r16.setRotationPoint(-2.0F, -0.4F, 1.0F);
        this.chest.addChild(chest_r16);
        this.setRotateAngle(chest_r16, 0.3054F, 0.3927F, 0.0F);
        this.chest_r16.cubeList.add(new ModelBox(chest_r16, 11, 35, 0.0543F, -0.5F, -2.7704F, 1, 1, 4, 0.0F, true));

        this.chest_r17 = new ModelRenderer(this);
        this.chest_r17.setRotationPoint(2.0F, -0.4F, 1.0F);
        this.chest.addChild(chest_r17);
        this.setRotateAngle(chest_r17, 0.079F, -0.4867F, 0.5216F);
        this.chest_r17.cubeList.add(new ModelBox(chest_r17, 11, 10, -1.0543F, -0.1F, -3.7704F, 1, 3, 1, 0.0F, false));

        this.chest_r18 = new ModelRenderer(this);
        this.chest_r18.setRotationPoint(2.0F, -0.4F, 1.0F);
        this.chest.addChild(chest_r18);
        this.setRotateAngle(chest_r18, 0.3054F, -0.3927F, 0.0F);
        this.chest_r18.cubeList.add(new ModelBox(chest_r18, 11, 35, -1.0543F, -0.5F, -2.7704F, 1, 1, 4, 0.0F, false));

        this.chest_r19 = new ModelRenderer(this);
        this.chest_r19.setRotationPoint(0.0F, 3.3F, -2.0F);
        this.chest.addChild(chest_r19);
        this.setRotateAngle(chest_r19, -0.48F, 0.0F, 0.0F);
        this.chest_r19.cubeList.add(new ModelBox(chest_r19, 11, 10, 0.0F, -0.9915F, -2.2791F, 0, 2, 5, 0.0F, false));

        this.chest_r20 = new ModelRenderer(this);
        this.chest_r20.setRotationPoint(1.7259F, 3.4863F, 0.8168F);
        this.chest.addChild(chest_r20);
        this.setRotateAngle(chest_r20, -0.1439F, 0.0351F, -1.2092F);
        this.chest_r20.cubeList.add(new ModelBox(chest_r20, 0, 6, -0.0038F, 0.1801F, -0.6873F, 2, 0, 1, 0.0F, false));

        this.chest_r21 = new ModelRenderer(this);
        this.chest_r21.setRotationPoint(1.7259F, 3.8863F, 1.3168F);
        this.chest.addChild(chest_r21);
        this.setRotateAngle(chest_r21, 0.1229F, -0.7644F, -0.9287F);
        this.chest_r21.cubeList.add(new ModelBox(chest_r21, 11, 31, -0.3883F, 0.1098F, -0.1132F, 4, 0, 1, 0.0F, false));

        this.chest_r22 = new ModelRenderer(this);
        this.chest_r22.setRotationPoint(1.7259F, 3.8863F, 1.3168F);
        this.chest.addChild(chest_r22);
        this.setRotateAngle(chest_r22, 0.1166F, -0.5002F, -0.9126F);
        this.chest_r22.cubeList.add(new ModelBox(chest_r22, 11, 41, -0.3883F, 0.1098F, -0.6132F, 3, 0, 1, 0.0F, false));

        this.chest_r23 = new ModelRenderer(this);
        this.chest_r23.setRotationPoint(0.0F, 3.3F, -2.0F);
        this.chest.addChild(chest_r23);
        this.setRotateAngle(chest_r23, -0.3102F, 0.2301F, 0.6184F);
        this.chest_r23.cubeList.add(new ModelBox(chest_r23, 61, 25, -1.9027F, 0.2306F, 0.9942F, 1, 1, 3, 0.0F, true));

        this.chest_r24 = new ModelRenderer(this);
        this.chest_r24.setRotationPoint(0.0F, 3.3F, -2.0F);
        this.chest.addChild(chest_r24);
        this.setRotateAngle(chest_r24, -0.3102F, -0.2301F, -0.6184F);
        this.chest_r24.cubeList.add(new ModelBox(chest_r24, 61, 25, 0.9027F, 0.2306F, 0.9942F, 1, 1, 3, 0.0F, false));

        this.chest_r25 = new ModelRenderer(this);
        this.chest_r25.setRotationPoint(0.0F, 3.3F, -2.0F);
        this.chest.addChild(chest_r25);
        this.setRotateAngle(chest_r25, -0.384F, 0.0F, 0.0F);
        this.chest_r25.cubeList.add(new ModelBox(chest_r25, 30, 50, -1.5F, -0.5547F, -0.0058F, 3, 1, 4, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.3F, 4.1F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, 0.0037F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 36, 0, -1.0F, 4.384F, 3.5119F, 2, 1, 1, 0.0F, false));

        this.chest_r26 = new ModelRenderer(this);
        this.chest_r26.setRotationPoint(-0.5F, 0.3677F, 4.37F);
        this.body1.addChild(chest_r26);
        this.setRotateAngle(chest_r26, -0.2428F, -0.0914F, -0.5584F);
        this.chest_r26.cubeList.add(new ModelBox(chest_r26, 18, 37, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r27 = new ModelRenderer(this);
        this.chest_r27.setRotationPoint(-0.5F, 0.3677F, 4.37F);
        this.body1.addChild(chest_r27);
        this.setRotateAngle(chest_r27, -0.1825F, -0.1849F, -0.9889F);
        this.chest_r27.cubeList.add(new ModelBox(chest_r27, 0, 31, -2.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest_r28 = new ModelRenderer(this);
        this.chest_r28.setRotationPoint(-0.5F, 0.1322F, 2.3839F);
        this.body1.addChild(chest_r28);
        this.setRotateAngle(chest_r28, -0.0602F, -0.1639F, -1.3477F);
        this.chest_r28.cubeList.add(new ModelBox(chest_r28, 39, 25, -3.3056F, -1.8192F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r29 = new ModelRenderer(this);
        this.chest_r29.setRotationPoint(-0.5F, 0.1322F, 2.3839F);
        this.body1.addChild(chest_r29);
        this.setRotateAngle(chest_r29, -0.1343F, -0.1119F, -0.8215F);
        this.chest_r29.cubeList.add(new ModelBox(chest_r29, 36, 3, -2.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest_r30 = new ModelRenderer(this);
        this.chest_r30.setRotationPoint(-0.5F, 0.1322F, 2.3839F);
        this.body1.addChild(chest_r30);
        this.setRotateAngle(chest_r30, -0.1687F, -0.045F, -0.3889F);
        this.chest_r30.cubeList.add(new ModelBox(chest_r30, 0, 39, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r31 = new ModelRenderer(this);
        this.chest_r31.setRotationPoint(-0.5F, -0.1033F, 0.3978F);
        this.body1.addChild(chest_r31);
        this.setRotateAngle(chest_r31, -0.1343F, -0.1119F, -0.6906F);
        this.chest_r31.cubeList.add(new ModelBox(chest_r31, 36, 5, -2.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, true));

        this.chest_r32 = new ModelRenderer(this);
        this.chest_r32.setRotationPoint(-0.5F, -0.1033F, 0.3978F);
        this.body1.addChild(chest_r32);
        this.setRotateAngle(chest_r32, -0.0602F, -0.1639F, -1.2168F);
        this.chest_r32.cubeList.add(new ModelBox(chest_r32, 0, 41, -3.3056F, -1.8192F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r33 = new ModelRenderer(this);
        this.chest_r33.setRotationPoint(-0.5F, -0.1033F, 0.3978F);
        this.body1.addChild(chest_r33);
        this.setRotateAngle(chest_r33, -0.1687F, -0.045F, -0.258F);
        this.chest_r33.cubeList.add(new ModelBox(chest_r33, 39, 27, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r34 = new ModelRenderer(this);
        this.chest_r34.setRotationPoint(0.5F, 0.3677F, 4.37F);
        this.body1.addChild(chest_r34);
        this.setRotateAngle(chest_r34, -0.1825F, 0.1849F, 0.9889F);
        this.chest_r34.cubeList.add(new ModelBox(chest_r34, 0, 31, 0.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, false));

        this.chest_r35 = new ModelRenderer(this);
        this.chest_r35.setRotationPoint(0.5F, 0.3677F, 4.37F);
        this.body1.addChild(chest_r35);
        this.setRotateAngle(chest_r35, -0.2428F, 0.0914F, 0.5584F);
        this.chest_r35.cubeList.add(new ModelBox(chest_r35, 18, 37, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest_r36 = new ModelRenderer(this);
        this.chest_r36.setRotationPoint(0.5F, 0.1322F, 2.3839F);
        this.body1.addChild(chest_r36);
        this.setRotateAngle(chest_r36, -0.0602F, 0.1639F, 1.3477F);
        this.chest_r36.cubeList.add(new ModelBox(chest_r36, 39, 25, 2.3056F, -1.8192F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest_r37 = new ModelRenderer(this);
        this.chest_r37.setRotationPoint(0.5F, 0.1322F, 2.3839F);
        this.body1.addChild(chest_r37);
        this.setRotateAngle(chest_r37, -0.1343F, 0.1119F, 0.8215F);
        this.chest_r37.cubeList.add(new ModelBox(chest_r37, 36, 3, 0.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, false));

        this.chest_r38 = new ModelRenderer(this);
        this.chest_r38.setRotationPoint(0.5F, 0.1322F, 2.3839F);
        this.body1.addChild(chest_r38);
        this.setRotateAngle(chest_r38, -0.1687F, 0.045F, 0.3889F);
        this.chest_r38.cubeList.add(new ModelBox(chest_r38, 0, 39, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest_r39 = new ModelRenderer(this);
        this.chest_r39.setRotationPoint(0.5F, -0.1033F, 0.3978F);
        this.body1.addChild(chest_r39);
        this.setRotateAngle(chest_r39, -0.0602F, 0.1639F, 1.2168F);
        this.chest_r39.cubeList.add(new ModelBox(chest_r39, 0, 41, 2.3056F, -1.8192F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest_r40 = new ModelRenderer(this);
        this.chest_r40.setRotationPoint(0.5F, -0.1033F, 0.3978F);
        this.body1.addChild(chest_r40);
        this.setRotateAngle(chest_r40, -0.1343F, 0.1119F, 0.6906F);
        this.chest_r40.cubeList.add(new ModelBox(chest_r40, 36, 5, 0.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, false));

        this.chest_r41 = new ModelRenderer(this);
        this.chest_r41.setRotationPoint(0.5F, -0.1033F, 0.3978F);
        this.body1.addChild(chest_r41);
        this.setRotateAngle(chest_r41, -0.1687F, 0.045F, 0.258F);
        this.chest_r41.cubeList.add(new ModelBox(chest_r41, 39, 27, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, 5.8004F, 2.5831F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0436F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 47, 33, -3.0F, -2.0F, -4.6F, 6, 2, 6, 0.003F, false));

        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(-2.0F, 2.7674F, 6.2749F);
        this.body1.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -0.1289F, 0.0206F, -0.1787F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 13, 0, -0.5F, 0.0911F, -0.3382F, 1, 3, 3, 0.0F, true));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(-2.0F, 3.6355F, 5.4119F);
        this.body1.addChild(body6_r2);
        this.setRotateAngle(body6_r2, -0.7137F, -0.3614F, -0.3876F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 17, 10, -0.5F, -0.6515F, -0.5F, 1, 3, 1, 0.0F, true));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(-2.0F, 1.7674F, 7.1749F);
        this.body1.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -0.1309F, 0.0F, 0.0F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 0, 0, -0.5F, -0.8F, -2.1F, 1, 3, 2, 0.0F, true));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 50, 58, -0.5F, -0.8F, -1.7F, 1, 1, 3, 0.003F, true));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 35, 33, 0.5F, -0.8F, -2.7F, 1, 1, 3, 0.003F, true));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 0, 0, 3.5F, -0.8F, -2.1F, 1, 3, 2, 0.0F, false));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 35, 33, 2.5F, -0.8F, -2.7F, 1, 1, 3, 0.003F, false));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 50, 58, 3.5F, -0.8F, -1.7F, 1, 1, 3, 0.003F, false));

        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, 1.0415F, 3.2097F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.3099F, 0.1664F, -0.053F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 11, 25, -2.8F, -1.0F, -1.5F, 1, 1, 4, 0.003F, true));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(2.0F, 2.7674F, 6.2749F);
        this.body1.addChild(body5_r2);
        this.setRotateAngle(body5_r2, -0.1289F, -0.0206F, 0.1787F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 13, 0, -0.5F, 0.0911F, -0.3382F, 1, 3, 3, 0.0F, false));

        this.body5_r3 = new ModelRenderer(this);
        this.body5_r3.setRotationPoint(2.0F, 3.6355F, 5.4119F);
        this.body1.addChild(body5_r3);
        this.setRotateAngle(body5_r3, -0.7137F, 0.3614F, 0.3876F);
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 17, 10, -0.5F, -0.6515F, -0.5F, 1, 3, 1, 0.0F, false));

        this.body2_r2 = new ModelRenderer(this);
        this.body2_r2.setRotationPoint(0.0F, 1.0415F, 3.2097F);
        this.body1.addChild(body2_r2);
        this.setRotateAngle(body2_r2, -0.3099F, -0.1664F, 0.053F);
        this.body2_r2.cubeList.add(new ModelBox(body2_r2, 11, 25, 1.8F, -1.0F, -1.5F, 1, 1, 4, 0.003F, false));

        this.body1_r1 = new ModelRenderer(this);
        this.body1_r1.setRotationPoint(0.0F, 0.0967F, -0.9022F);
        this.body1.addChild(body1_r1);
        this.setRotateAngle(body1_r1, -0.1309F, 0.0F, 0.0F);
        this.body1_r1.cubeList.add(new ModelBox(body1_r1, 26, 0, -0.5F, -0.8F, 0.7F, 1, 1, 7, 0.003F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.7967F, 6.1978F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.341F, 0.174F, -0.0216F);
        this.tail1.cubeList.add(new ModelBox(tail1, 26, 9, -0.5F, -0.6F, 0.0F, 1, 1, 7, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1F, 6.6F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0463F, 0.1308F, 0.006F);
        this.tail2.cubeList.add(new ModelBox(tail2, 47, 20, -0.5F, -0.5F, 0.0F, 1, 1, 11, 0.003F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 10.4F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0523F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 25, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.7F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0249F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 35, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.003F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 7.4F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0523F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 10, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.upperlegleft = new ModelRenderer(this);
        this.upperlegleft.setRotationPoint(2.0F, 2.1467F, 5.4978F);
        this.body1.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, 0.3753F, -0.2484F, -1.3667F);
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 26, 0, -0.4F, -0.1F, -1.0F, 1, 4, 1, 0.0F, false));

        this.lowerlegleft = new ModelRenderer(this);
        this.lowerlegleft.setRotationPoint(0.1F, 3.7F, -0.3F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 0.501F, 0.0F, 0.0227F);
        this.lowerlegleft.cubeList.add(new ModelBox(lowerlegleft, 59, 58, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, false));

        this.footleft = new ModelRenderer(this);
        this.footleft.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, 1.3355F, 0.4554F, 0.0094F);
        this.footleft.cubeList.add(new ModelBox(footleft, 26, 56, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, false));

        this.upperlegright = new ModelRenderer(this);
        this.upperlegright.setRotationPoint(-2.0F, 2.1467F, 5.4978F);
        this.body1.addChild(upperlegright);
        this.setRotateAngle(upperlegright, 0.3753F, 0.2484F, 1.3667F);
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 0, 25, -0.6F, -0.1F, -1.0F, 1, 4, 1, 0.0F, false));

        this.lowerlegright = new ModelRenderer(this);
        this.lowerlegright.setRotationPoint(-0.1F, 3.7F, -0.3F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 0.501F, 0.0F, -0.0227F);
        this.lowerlegright.cubeList.add(new ModelBox(lowerlegright, 20, 57, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, false));

        this.footright = new ModelRenderer(this);
        this.footright.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, 1.3355F, -0.4554F, -0.0094F);
        this.footright.cubeList.add(new ModelBox(footright, 52, 45, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, false));

        this.wingleft1 = new ModelRenderer(this);
        this.wingleft1.setRotationPoint(3.1F, 0.4045F, -1.6F);
        this.chest.addChild(wingleft1);
        this.setRotateAngle(wingleft1, -0.0845F, 0.0401F, -0.7336F);
        this.wingleft1.cubeList.add(new ModelBox(wingleft1, 39, 58, -0.6238F, -0.3216F, 0.0503F, 3, 1, 2, 0.0F, false));
        this.wingleft1.cubeList.add(new ModelBox(wingleft1, 26, 20, 2.3762F, -0.3216F, 0.0503F, 7, 1, 1, 0.0F, false));

        this.wingleft2 = new ModelRenderer(this);
        this.wingleft2.setRotationPoint(9.0762F, 0.1784F, 0.1503F);
        this.wingleft1.addChild(wingleft2);
        this.setRotateAngle(wingleft2, -0.1881F, -0.0046F, -1.4427F);
        this.wingleft2.cubeList.add(new ModelBox(wingleft2, 15, 57, -0.5F, 0.0F, -0.3F, 1, 12, 1, 0.0F, false));
        this.wingleft2.cubeList.add(new ModelBox(wingleft2, 10, 57, -0.5F, 0.0F, 0.8F, 1, 12, 1, -0.2F, false));

        this.handR_r1 = new ModelRenderer(this);
        this.handR_r1.setRotationPoint(-0.4F, 11.5F, 1.7F);
        this.wingleft2.addChild(handR_r1);
        this.setRotateAngle(handR_r1, 2.0508F, 0.0F, 0.0F);
        this.handR_r1.cubeList.add(new ModelBox(handR_r1, 61, 20, -0.1F, -2.2F, 0.6F, 1, 1, 3, -0.2F, false));

        this.wingleft3 = new ModelRenderer(this);
        this.wingleft3.setRotationPoint(0.1F, 12.0F, 0.3F);
        this.wingleft2.addChild(wingleft3);
        this.setRotateAngle(wingleft3, -1.3528F, 0.001F, 0.3673F);
        this.wingleft3.cubeList.add(new ModelBox(wingleft3, 47, 0, -0.5F, -1.0F, 0.0F, 1, 1, 11, 0.0F, false));

        this.wingleft4 = new ModelRenderer(this);
        this.wingleft4.setRotationPoint(0.1F, 0.0F, 10.7F);
        this.wingleft3.addChild(wingleft4);
        this.setRotateAngle(wingleft4, 0.2069F, -0.2586F, -0.0182F);
        this.wingleft4.cubeList.add(new ModelBox(wingleft4, 26, 25, -0.5F, -1.0F, 0.0F, 1, 1, 18, 0.0F, false));

        this.wing4R_r1 = new ModelRenderer(this);
        this.wing4R_r1.setRotationPoint(0.0F, -0.5F, 17.9F);
        this.wingleft4.addChild(wing4R_r1);
        this.setRotateAngle(wing4R_r1, 0.1309F, -0.1309F, 0.0F);
        this.wing4R_r1.cubeList.add(new ModelBox(wing4R_r1, 0, 25, -0.5F, -0.5F, 0.1F, 1, 1, 23, 0.0F, false));

        this.handleft = new ModelRenderer(this);
        this.handleft.setRotationPoint(0.0F, 0.3F, -0.8F);
        this.wingleft3.addChild(handleft);
        this.setRotateAngle(handleft, 0.0204F, 0.8112F, 1.5893F);
        this.handleft.cubeList.add(new ModelBox(handleft, 47, 22, -1.5F, -0.5F, 0.2F, 2, 1, 3, 0.0F, false));

        this.wingright1 = new ModelRenderer(this);
        this.wingright1.setRotationPoint(-3.1F, 0.4045F, -1.6F);
        this.chest.addChild(wingright1);
        this.setRotateAngle(wingright1, -0.0657F, -0.0666F, 0.385F);
        this.wingright1.cubeList.add(new ModelBox(wingright1, 47, 27, -2.3762F, -0.3216F, 0.0503F, 3, 1, 2, 0.0F, false));
        this.wingright1.cubeList.add(new ModelBox(wingright1, 0, 20, -9.3762F, -0.3216F, 0.0503F, 7, 1, 1, 0.0F, false));

        this.wingright2 = new ModelRenderer(this);
        this.wingright2.setRotationPoint(-9.0762F, 0.1784F, 0.1503F);
        this.wingright1.addChild(wingright2);
        this.setRotateAngle(wingright2, -0.1881F, 0.0046F, 1.4427F);
        this.wingright2.cubeList.add(new ModelBox(wingright2, 5, 57, -0.5F, 0.0F, -0.3F, 1, 12, 1, 0.0F, false));
        this.wingright2.cubeList.add(new ModelBox(wingright2, 0, 57, -0.5F, 0.0F, 0.8F, 1, 12, 1, -0.2F, false));

        this.handR_r2 = new ModelRenderer(this);
        this.handR_r2.setRotationPoint(0.4F, 11.5F, 1.7F);
        this.wingright2.addChild(handR_r2);
        this.setRotateAngle(handR_r2, 2.0508F, 0.0F, 0.0F);
        this.handR_r2.cubeList.add(new ModelBox(handR_r2, 61, 5, -0.9F, -2.2F, 0.6F, 1, 1, 3, -0.2F, false));

        this.wingright3 = new ModelRenderer(this);
        this.wingright3.setRotationPoint(-0.1F, 12.0F, 0.3F);
        this.wingright2.addChild(wingright3);
        this.setRotateAngle(wingright3, -1.3535F, 0.0178F, -0.4525F);
        this.wingright3.cubeList.add(new ModelBox(wingright3, 38, 45, -0.5F, -1.0F, 0.0F, 1, 1, 11, 0.0F, false));

        this.wingright4 = new ModelRenderer(this);
        this.wingright4.setRotationPoint(-0.1F, 0.0F, 10.7F);
        this.wingright3.addChild(wingright4);
        this.setRotateAngle(wingright4, 0.2069F, 0.2586F, 0.0182F);
        this.wingright4.cubeList.add(new ModelBox(wingright4, 26, 0, -0.5F, -1.0F, 0.0F, 1, 1, 18, 0.0F, false));

        this.wing4R_r2 = new ModelRenderer(this);
        this.wing4R_r2.setRotationPoint(0.0F, -0.5F, 17.9F);
        this.wingright4.addChild(wing4R_r2);
        this.setRotateAngle(wing4R_r2, 0.0907F, 0.3047F, 0.0159F);
        this.wing4R_r2.cubeList.add(new ModelBox(wing4R_r2, 0, 0, -0.5F, -0.5F, 0.1F, 1, 1, 23, 0.0F, false));

        this.handright = new ModelRenderer(this);
        this.handright.setRotationPoint(0.0F, 0.3F, -0.8F);
        this.wingright3.addChild(handright);
        this.setRotateAngle(handright, 0.0204F, -0.8112F, -1.5893F);
        this.handright.cubeList.add(new ModelBox(handright, 47, 6, -0.5F, -0.5F, 0.2F, 2, 1, 3, 0.0F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.4F, -1.3F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.0112F, -0.1742F, -0.0449F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.4F, -3.1031F);
        this.neck1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 60, 13, -0.5F, -0.5F, -0.2F, 1, 1, 3, 0.003F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.3F, -3.0031F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1675F, -0.3014F, 0.0502F);
        this.neck2.cubeList.add(new ModelBox(neck2, 47, 0, -0.5F, -0.3949F, -4.0637F, 1, 1, 4, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0051F, -3.3637F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.3829F, -0.2576F, 0.0475F);
        this.head.cubeList.add(new ModelBox(head, 26, 25, -2.0F, -1.59F, -3.5495F, 4, 3, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 34, 0.83F, -0.89F, -3.1495F, 1, 1, 1, 0.2F, false));
        this.head.cubeList.add(new ModelBox(head, 26, 33, 1.15F, -0.89F, -3.1495F, 1, 1, 1, -0.1F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 19, -2.15F, -0.89F, -3.1495F, 1, 1, 1, -0.1F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 25, -1.83F, -0.89F, -3.1495F, 1, 1, 1, 0.2F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 1.41F, -3.5495F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, 0.1745F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 0, 0, -1.0F, -1.0F, -7.5F, 2, 1, 8, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 0, 50, -1.5F, -2.0F, -2.5F, 3, 2, 4, 0.002F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -7.5F);
        this.head2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 35, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.0F, -6.0F);
        this.head2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.829F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 25, 0.0F, -0.5F, -1.0F, 0, 2, 1, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 0.0F, -3.75F);
        this.head2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3491F, 0.0F, 0.48F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 0, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, 0.0F, -1.25F);
        this.head2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.48F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 35, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 0.0F, -3.75F);
        this.head2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3491F, 0.0F, -0.48F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 0, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 0.0F, -6.0F);
        this.head2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, -0.829F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 25, 0.0F, -0.5F, -1.0F, 0, 2, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5F, 0.0F, -1.25F);
        this.head2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, -0.48F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 35, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, -2.95F, 0.525F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.2379F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 47, 13, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.001F, false));
        this.head3.cubeList.add(new ModelBox(head3, 0, 45, -1.5F, 0.0F, -3.3F, 3, 1, 1, 0.0F, false));

        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, 0.0F, -3.2F);
        this.head3.addChild(head4);
        this.head4.cubeList.add(new ModelBox(head4, 15, 50, -1.0F, 0.0F, -5.05F, 2, 1, 5, -0.001F, false));
        this.head4.cubeList.add(new ModelBox(head4, 0, 10, -1.0F, 0.0F, -1.1F, 2, 2, 1, -0.002F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.41F, -0.5495F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5843F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 61, 0, 1.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 61, 0, -2.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.1745F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 52, 51, -1.0F, 0.0F, -5.0F, 2, 1, 3, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 0, 14, 0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 26, 36, 0.5F, 0.0F, -2.5F, 1, 1, 1, -0.001F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 26, 36, -1.5F, 0.0F, -2.5F, 1, 1, 1, -0.001F, true));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 0, 14, -1.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.0F, -2.75F);
        this.jaw2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 2.618F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 25, 0.0F, 0.0F, -0.75F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.jaw2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 2.618F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 33, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 0.0F, -2.75F);
        this.jaw2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -2.618F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 25, 0.0F, 0.0F, -0.75F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.jaw2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -2.618F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 35, 33, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.3927F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 11, 50, -1.0F, 0.0F, -2.0F, 2, 1, 2, -0.001F, false));
        this.jaw3.cubeList.add(new ModelBox(jaw3, 26, 13, -1.0F, 0.0F, -2.75F, 2, 1, 1, -0.002F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.0F, -2.75F);
        this.jaw3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.48F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 13, -0.5F, -1.0F, -2.5F, 1, 1, 1, -0.001F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 9, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 0.0F, -1.75F);
        this.jaw3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.5672F, 0.0F, 2.4435F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 5, 25, 0.0F, -0.5F, -1.0F, 0, 2, 1, 0.0F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.jaw3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 2.618F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 13, 0, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, 0.0F, -1.75F);
        this.jaw3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.5672F, 0.0F, -2.4435F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 5, 25, 0.0F, -0.5F, -1.0F, 0, 2, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.jaw3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1745F, 0.0F, -2.618F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 13, 0, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

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
