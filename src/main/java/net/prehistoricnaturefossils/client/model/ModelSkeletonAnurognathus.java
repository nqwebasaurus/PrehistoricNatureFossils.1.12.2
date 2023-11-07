package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAnurognathus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer main;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
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
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer leftwing;
    private final ModelRenderer leftwing2;
    private final ModelRenderer cube_r33;
    private final ModelRenderer leftwing3;
    private final ModelRenderer leftmembrane;
    private final ModelRenderer cube_r34;
    private final ModelRenderer lefthand;
    private final ModelRenderer cube_r35;
    private final ModelRenderer rightwing;
    private final ModelRenderer rightwing2;
    private final ModelRenderer cube_r36;
    private final ModelRenderer rightwing3;
    private final ModelRenderer rightmembrane;
    private final ModelRenderer cube_r37;
    private final ModelRenderer righthand;
    private final ModelRenderer cube_r38;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer Head;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer cube_r61;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer cube_r62;

    public ModelSkeletonAnurognathus() {
        this.textureWidth = 45;
        this.textureHeight = 42;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -7.75F, -2.5F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.3286F, 0.1758F, 0.7245F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.3362F, -0.142F, 3.4215F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5101F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 8, -2.8362F, -0.3965F, -1.9772F, 3, 1, 1, -0.203F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.3362F, -0.142F, 3.4215F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5101F, 0.1346F, -0.1008F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 31, -0.3164F, -0.3965F, -1.3772F, 1, 1, 2, -0.203F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -1.0742F, 3.4062F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2679F, 0.2106F, -0.0573F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 33, -0.8F, 0.1F, -0.2F, 1, 1, 2, -0.2F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 21, -0.8F, 0.5F, -0.2F, 1, 1, 2, -0.203F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.8F, -0.5F, -2.2F, 1, 1, 5, -0.2F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.25F, 2.5F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 33, -1.1F, -0.3648F, 0.4208F, 1, 1, 2, 0.003F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 33, 0.1F, -0.3648F, 0.4208F, 1, 1, 2, 0.003F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 26, -0.5F, -0.5648F, 0.4208F, 1, 1, 2, 0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(1.3362F, -0.142F, 3.4215F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5101F, -0.1346F, 0.1008F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 31, -0.6836F, -0.3965F, -1.3772F, 1, 1, 2, -0.203F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -1.0742F, 3.4062F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2679F, -0.2106F, 0.0573F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 21, -0.2F, 0.5F, -0.2F, 1, 1, 2, -0.203F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 33, -0.2F, 0.1F, -0.2F, 1, 1, 2, -0.2F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.2F, -0.5F, -2.2F, 1, 1, 5, -0.2F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.3F, 0.3F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 20, -0.5F, -0.6309F, -0.1971F, 1, 1, 3, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -1.1F, 3.5F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2841F, -0.401F, -0.7175F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 35, -1.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.4F, 1.8F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1515F, -0.0869F, -0.517F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 15, -2.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -1.4F, 1.8F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1739F, -0.0151F, -0.0859F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 3, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -1.5F, -0.2F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.037F, 0.0791F, -1.133F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 10, -3.1383F, -2.0132F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -1.5F, -0.2F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0756F, 0.0436F, -0.5219F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 37, -2.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -1.5F, -0.2F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0869F, 0.0076F, -0.0869F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 28, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -1.5F, -2.2F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0401F, 0.2757F, -0.5372F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 39, 17, -2.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -1.5F, -2.2F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1548F, 0.2325F, -0.0883F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 12, 33, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -1.1F, 3.5F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2841F, 0.401F, 0.7175F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 35, 0.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -1.1F, 3.5F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.4239F, 0.2473F, 0.2858F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -1.4F, 1.8F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1739F, 0.0151F, 0.0859F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 8, 3, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -1.4F, 1.8F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1515F, 0.0869F, 0.517F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 15, 0.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -1.5F, -0.2F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0869F, -0.0076F, 0.0869F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 28, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -1.5F, -0.2F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0756F, -0.0436F, 0.5219F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 38, 37, 0.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, -1.5F, -0.2F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.037F, -0.0791F, 1.133F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 8, 10, 2.1383F, -2.0132F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, -1.5F, -2.2F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1548F, -0.2325F, 0.0883F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 12, 33, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, -1.5F, -2.2F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0401F, -0.2757F, 0.5372F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 39, 17, 0.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.4F, 1.6317F, -1.0706F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1135F, 0.0653F, 0.5199F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 36, -0.9F, -0.5F, -0.5F, 1, 1, 2, 0.0F, true));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.4029F, 0.041F, -2.6596F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1285F, 0.6991F, -0.4264F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 7, -0.5F, -1.5F, -0.5F, 1, 3, 1, -0.2F, true));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.0F, -1.3654F, -1.2014F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2553F, 0.4782F, 0.0295F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 13, 0.2F, -0.5F, -1.9F, 1, 1, 3, -0.2F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(1.4029F, 0.041F, -2.6596F);
        this.main.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1285F, -0.6991F, 0.4264F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 7, -0.5F, -1.5F, -0.5F, 1, 3, 1, -0.2F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(2.0F, -1.3654F, -1.2014F);
        this.main.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2553F, -0.4782F, -0.0295F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 24, 13, -1.2F, -0.5F, -1.9F, 1, 1, 3, -0.2F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(1.4F, 1.6317F, -1.0706F);
        this.main.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1135F, -0.0653F, -0.5199F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 36, -0.1F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.6317F, -1.0706F);
        this.main.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1309F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 10, 11, -1.5F, -0.5F, -1.5F, 3, 1, 3, 0.003F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 24, 26, 0.0F, -0.5F, -2.5F, 0, 2, 3, 0.003F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -1.3F, -2.7F);
        this.main.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0436F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 23, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.003F, false));

        this.leftwing = new ModelRenderer(this);
        this.leftwing.setRotationPoint(1.9F, -0.5F, -2.15F);
        this.main.addChild(leftwing);
        this.setRotateAngle(leftwing, 0.2897F, -0.3122F, -0.2629F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 20, 10, 1.1F, 0.0F, -1.0F, 4, 1, 1, -0.2F, false));
        this.leftwing.cubeList.add(new ModelBox(leftwing, 32, 17, 0.1F, -0.5F, -1.0F, 2, 2, 1, -0.18F, false));

        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(4.9F, -0.1F, -0.7F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -0.3759F, 0.4845F, -0.5047F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 8, 7, -0.507F, -0.1174F, -0.2007F, 7, 1, 1, -0.2F, false));
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 8, 0, -0.507F, 0.5826F, -0.2007F, 7, 1, 1, -0.3F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(5.493F, 0.3826F, -0.4007F);
        this.leftwing2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.5236F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 8, 0, -0.7F, -0.5F, -0.6F, 2, 1, 1, -0.3F, false));

        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(6.493F, 0.5826F, -0.2007F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, -3.0589F, 0.5079F, -2.874F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 11, 16, -5.0F, -0.5F, -1.0F, 5, 1, 1, -0.2F, false));

        this.leftmembrane = new ModelRenderer(this);
        this.leftmembrane.setRotationPoint(-4.75F, 0.0F, -0.5F);
        this.leftwing3.addChild(leftmembrane);
        this.setRotateAngle(leftmembrane, 0.0172F, -0.1298F, -0.132F);
        this.leftmembrane.cubeList.add(new ModelBox(leftmembrane, 13, 3, -5.75F, -0.5F, -0.5F, 6, 1, 1, -0.2F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-5.45F, 0.0F, 0.0F);
        this.leftmembrane.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1074F, -0.2865F, -0.3646F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 14, 3, -4.9F, -0.5F, -0.5F, 5, 1, 1, -0.2F, false));

        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(-0.5F, 0.0F, -0.25F);
        this.leftwing3.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0922F, 0.0606F, 0.0084F);


        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.lefthand.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.4363F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 7, 37, -1.05F, -0.5F, -1.375F, 1, 1, 2, 0.01F, false));

        this.rightwing = new ModelRenderer(this);
        this.rightwing.setRotationPoint(-1.9F, -0.5F, -2.15F);
        this.main.addChild(rightwing);
        this.setRotateAngle(rightwing, 0.3765F, 0.1969F, 0.6037F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 20, 10, -5.1F, 0.0F, -1.0F, 4, 1, 1, -0.2F, true));
        this.rightwing.cubeList.add(new ModelBox(rightwing, 32, 17, -2.1F, -0.5F, -1.0F, 2, 2, 1, -0.18F, true));

        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-4.9F, -0.1F, -0.7F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -0.3759F, -0.4845F, 0.5047F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 8, 7, -6.493F, -0.1174F, -0.2007F, 7, 1, 1, -0.2F, true));
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 8, 0, -6.493F, 0.5826F, -0.2007F, 7, 1, 1, -0.3F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-5.493F, 0.3826F, -0.4007F);
        this.rightwing2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.5236F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 8, 0, -1.3F, -0.5F, -0.6F, 2, 1, 1, -0.3F, true));

        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(-6.493F, 0.5826F, -0.2007F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, -3.0349F, -0.5038F, 2.8244F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 11, 16, 0.0F, -0.5F, -1.0F, 5, 1, 1, -0.2F, true));

        this.rightmembrane = new ModelRenderer(this);
        this.rightmembrane.setRotationPoint(4.75F, 0.0F, -0.5F);
        this.rightwing3.addChild(rightmembrane);
        this.setRotateAngle(rightmembrane, 0.0341F, 0.1264F, 0.264F);
        this.rightmembrane.cubeList.add(new ModelBox(rightmembrane, 13, 3, -0.25F, -0.5F, -0.5F, 6, 1, 1, -0.2F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(5.45F, 0.0F, 0.0F);
        this.rightmembrane.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1074F, 0.2865F, 0.3646F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 14, 3, -0.1F, -0.5F, -0.5F, 5, 1, 1, -0.2F, true));

        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(0.5F, 0.0F, -0.25F);
        this.rightwing3.addChild(righthand);
        this.setRotateAngle(righthand, 0.0922F, -0.0606F, -0.0084F);


        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.righthand.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.4363F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 7, 37, 0.05F, -0.5F, -1.375F, 1, 1, 2, 0.01F, true));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.4F, -2.525F);
        this.main.addChild(neck);
        this.setRotateAngle(neck, -0.517F, -0.0869F, -0.1515F);


        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.2431F, -2.4856F);
        this.neck.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1571F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 40, 8, -0.5F, -0.5F, -0.45F, 1, 1, 1, -0.003F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.2431F, -1.9856F);
        this.neck.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0349F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 37, 11, -0.5F, -0.5782F, -0.0438F, 1, 1, 2, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.5F, 0.1931F, -2.4106F);
        this.neck.addChild(Head);
        this.setRotateAngle(Head, -0.49F, -0.1925F, -0.3444F);
        this.Head.cubeList.add(new ModelBox(Head, 17, 37, 1.0F, 0.8304F, -1.8469F, 1, 1, 2, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 36, 30, -1.5F, 0.8304F, -0.8469F, 2, 1, 1, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 28, 35, -0.9754F, 0.8304F, -4.6377F, 1, 1, 2, -0.21F, false));
        this.Head.cubeList.add(new ModelBox(Head, 40, 27, -1.3F, 1.3304F, -4.5469F, 2, 1, 0, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 40, 27, -1.7F, 1.3304F, -4.5469F, 2, 1, 0, 0.0F, true));
        this.Head.cubeList.add(new ModelBox(Head, 0, 28, -2.0F, 0.9304F, -4.8469F, 3, 1, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 17, 37, -3.0F, 0.8304F, -1.8469F, 1, 1, 2, 0.01F, true));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-1.0F, 0.8804F, 0.1531F);
        this.Head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0436F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 31, -2.0F, -2.0F, -2.0F, 1, 2, 2, 0.0F, true));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 31, 2.0F, -2.0F, -2.0F, 1, 2, 2, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 11, 19, -1.0F, -2.0F, -2.0F, 3, 1, 2, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 19, -1.0F, -2.0F, -4.0F, 3, 1, 2, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-2.946F, 0.0195F, -2.1541F);
        this.Head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.049F, -0.4708F, -0.0222F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 36, 4, 0.0382F, 0.8607F, -2.6527F, 1, 1, 2, -0.004F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 25, 18, 0.0382F, -0.1393F, -1.6527F, 1, 2, 2, 0.002F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 13, 28, 0.0382F, -1.0393F, -2.0527F, 1, 2, 2, 0.003F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 28, 23, 0.0382F, -1.0393F, -1.6527F, 1, 2, 2, -0.002F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-2.7406F, 0.4636F, -3.144F);
        this.Head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0045F, -0.482F, 0.039F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 29, 30, 0.05F, -1.5F, -1.0F, 1, 2, 2, -0.1F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 30, 11, -0.0894F, -1.5F, -1.0F, 1, 2, 2, -0.23F, true));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(1.7406F, 0.4636F, -3.144F);
        this.Head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0045F, 0.482F, -0.039F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 30, 11, -0.9106F, -1.5F, -1.0F, 1, 2, 2, -0.23F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 29, 30, -1.05F, -1.5F, -1.0F, 1, 2, 2, -0.1F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.8804F, -4.8469F);
        this.Head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.4538F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 18, 25, -2.0F, -2.0F, 0.0F, 3, 2, 1, -0.003F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(1.946F, 0.0195F, -2.1541F);
        this.Head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.049F, 0.4708F, 0.0222F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 13, 28, -1.0382F, -1.0393F, -2.0527F, 1, 2, 2, 0.003F, false));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 36, 4, -1.0382F, 0.8607F, -2.6527F, 1, 1, 2, -0.004F, false));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 25, 18, -1.0382F, -0.1393F, -1.6527F, 1, 2, 2, 0.002F, false));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 28, 23, -1.0382F, -1.0393F, -1.6527F, 1, 2, 2, -0.002F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-2.3012F, 1.8111F, -3.0261F);
        this.Head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1799F, -0.4708F, -0.0222F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 25, 3, 0.0F, -0.7F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(1.3012F, 1.8111F, -3.0261F);
        this.Head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.1799F, 0.4708F, 0.0222F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 25, 3, 0.0F, -0.7F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.8225F, 1.3304F, -2.3416F);
        this.Head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, -1.9897F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 6, 23, -0.3F, -0.5F, 0.1F, 1, 1, 1, -0.2F, true));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(-1.5067F, 1.3304F, -1.5655F);
        this.Head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.48F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 24, 38, -0.6F, -0.5F, 0.1F, 1, 1, 1, -0.2F, true));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(-1.2829F, 1.3304F, -1.6326F);
        this.Head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, -0.6894F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 12, 35, -0.4694F, -0.5F, -0.339F, 1, 1, 2, -0.23F, true));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(-1.194F, 1.3304F, -1.6768F);
        this.Head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, -0.5498F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 34, 33, -0.5306F, -0.5F, -1.761F, 1, 1, 2, -0.22F, true));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.5067F, 1.3304F, -1.5655F);
        this.Head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, -0.48F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 24, 38, -0.4F, -0.5F, 0.1F, 1, 1, 1, -0.2F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.2829F, 1.3304F, -1.6326F);
        this.Head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.6894F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 12, 35, -0.5306F, -0.5F, -0.339F, 1, 1, 2, -0.23F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.1775F, 1.3304F, -2.3416F);
        this.Head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, 1.9897F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 6, 23, -0.7F, -0.5F, 0.1F, 1, 1, 1, -0.2F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.194F, 1.3304F, -1.6768F);
        this.Head.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, 0.5498F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 34, 33, -0.4694F, -0.5F, -1.761F, 1, 1, 2, -0.22F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.7804F, 0.1531F);
        this.Head.addChild(jaw);
        this.setRotateAngle(jaw, 1.1781F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 33, 37, 1.0F, 0.0F, -2.0F, 1, 1, 2, 0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 33, 37, -3.0F, 0.0F, -2.0F, 1, 1, 2, 0.003F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 29, 3, -2.0F, 0.0F, -5.0F, 3, 1, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 39, 33, -1.3F, -0.5F, -4.8F, 2, 1, 0, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 39, 33, -1.7F, -0.5F, -4.8F, 2, 1, 0, 0.0F, true));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-2.5F, 0.5F, -2.0F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, -0.48F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 40, -0.5F, -0.5F, -2.5F, 1, 1, 1, -0.003F, true));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 37, 0, -0.5F, -0.5F, -1.8F, 1, 1, 2, 0.0F, true));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(1.5F, 0.5F, -2.0F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.48F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 40, -0.5F, -0.5F, -2.5F, 1, 1, 1, -0.003F, false));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 37, 0, -0.5F, -0.5F, -1.8F, 1, 1, 2, 0.0F, false));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(-2.2582F, 0.1F, -3.3142F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.1309F, -0.48F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 6, 28, 0.0F, -0.4F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(1.2582F, 0.1F, -3.3142F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.1309F, 0.48F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 6, 28, 0.0F, -0.4F, -1.5F, 0, 1, 3, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.75F, 4.7F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 38, 19, -0.5F, -0.4588F, 0.0042F, 1, 1, 2, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.05F, 1.725F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 38, 23, -0.5F, -0.3442F, 0.0913F, 1, 1, 2, 0.003F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(1.7875F, 0.0F, 4.65F);
        this.main.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.3182F, 0.3F, -1.38F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 0, -0.5375F, -0.75F, -0.7F, 1, 3, 1, 0.0F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.0375F, 2.25F, 0.0F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, -0.9599F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 7, -0.5F, -0.5F, -0.5F, 1, 1, 5, 0.002F, false));

        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(-0.8F, 0.35F, 4.25F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 2.3828F, -0.1596F, 0.3432F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 0, 14, -0.5F, 0.0F, -2.75F, 2, 1, 3, 0.0F, false));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0114F, 0.3685F, 0.5003F);
        this.leftleg3.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 2.1456F, 1.4496F, 1.38F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 9, 23, -0.0468F, -0.3685F, -2.741F, 1, 1, 3, 0.0F, false));

        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-1.7875F, 0.0F, 4.65F);
        this.main.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.214F, -0.2191F, 1.2987F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 0, -0.4625F, -0.75F, -0.7F, 1, 3, 1, 0.0F, true));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0375F, 2.25F, 0.0F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, -0.9599F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 7, -0.5F, -0.5F, -0.5F, 1, 1, 5, 0.002F, true));

        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.8F, 0.35F, 4.25F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 2.3828F, 0.1596F, -0.3432F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 0, 14, -1.5F, 0.0F, -2.75F, 2, 1, 3, 0.0F, true));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.0114F, 0.3685F, 0.5003F);
        this.rightleg3.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 2.1456F, -1.4496F, -1.38F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 9, 23, -0.9532F, -0.3685F, -2.741F, 1, 1, 3, 0.0F, true));

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
