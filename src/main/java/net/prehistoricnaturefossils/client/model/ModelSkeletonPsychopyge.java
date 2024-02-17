package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPsychopyge extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer main;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer body;
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
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer headspike;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer headspike2;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;

    public ModelSkeletonPsychopyge() {
        this.textureWidth = 70;
        this.textureHeight = 65;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -5.0F, -1.0F, -7.0F, 13, 2, 10, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 13, -6.0F, -3.3F, 0.5F, 12, 4, 9, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 46, 21, -2.0F, 0.0F, -13.0F, 4, 1, 6, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.4F, -10.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0524F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 39, -2.0F, -0.3F, -2.5F, 4, 1, 6, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.5F, 0.0F, -9.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.3054F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 27, -0.9F, -1.0F, -1.6F, 3, 2, 4, -0.003F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 52, -0.9F, -1.0F, -4.6F, 2, 2, 3, -0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(4.7F, 0.0F, -13.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1658F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 50, -7.0031F, -1.0F, -1.0247F, 7, 2, 1, 0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(4.0F, 0.0F, -9.9F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1309F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 0, -2.8522F, -1.0F, -3.4034F, 4, 2, 7, 0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(8.0F, 0.0F, -7.0F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 39, -3.0402F, -1.0F, -7.9225F, 3, 2, 8, -0.004F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-8.6F, 0.0F, 2.3F);
        this.fossil.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3316F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 27, 0.1021F, -2.0F, 0.0296F, 4, 3, 8, 0.004F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-5.0F, 0.0F, -7.0F);
        this.fossil.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3491F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 27, -0.1F, -1.0F, 0.0F, 4, 2, 10, 0.004F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(8.0F, 0.0F, 3.0F);
        this.fossil.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3054F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 40, -3.0F, -2.0F, 0.0F, 3, 3, 7, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -3.5575F, 2.2749F);
        this.fossil.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5236F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 13, -4.5F, -0.6581F, -5.649F, 9, 3, 4, -0.003F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -0.9F, 0.0F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.0436F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 46, 29, -3.0F, -1.0F, -7.0F, 6, 1, 3, 0.003F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.9479F, -1.0F, -7.0325F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 1.1912F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 55, -0.9754F, 0.0F, -1.9433F, 1, 1, 2, -0.002F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(2.5F, -1.0F, -6.0F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.7505F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 54, 56, -0.675F, 0.0F, -1.075F, 1, 1, 2, -0.003F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 52, -1.675F, 0.0F, 0.925F, 2, 1, 1, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.9479F, -1.0F, -7.0325F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -1.1912F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 55, -0.0246F, 0.0F, -1.9433F, 1, 1, 2, -0.002F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.5F, -1.0F, -6.0F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.7505F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 60, 6, -0.325F, 0.0F, 0.925F, 2, 1, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 57, -0.325F, 0.0F, -1.075F, 1, 1, 2, -0.003F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 18, -1.0F, -0.325F, -9.625F, 2, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 27, -0.5F, -0.325F, -12.625F, 1, 1, 3, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.7F, -3.9F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3099F, 0.1664F, 0.053F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 39, -3.8739F, 0.3F, -0.727F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.7F, -3.9F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3242F, 0.3364F, 0.1105F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 37, 4, -4.5898F, 0.25F, -0.1736F, 2, 1, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.4621F, -2.1142F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.476F, 0.2299F, 0.1169F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 53, 3, -4.4324F, 0.3899F, -0.4896F, 3, 1, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.4621F, -2.1142F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4941F, 0.3457F, 0.1806F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 43, 24, -4.7407F, 0.3649F, 0.2922F, 3, 1, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -2.8621F, 0.5858F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0443F, 0.1744F, 0.0077F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 40, -2.1557F, 0.438F, 1.5278F, 1, 1, 2, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -2.8621F, 0.5858F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0537F, 0.6233F, 0.0314F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 53, 0, -5.0302F, 0.488F, -1.8257F, 4, 1, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -2.8621F, 0.5858F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0878F, 1.0499F, 0.0762F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 14, 40, -6.5515F, 0.338F, -2.1757F, 6, 1, 1, 0.003F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -2.8621F, 0.5858F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3331F, 1.437F, 0.3303F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 47, 10, -6.8964F, 0.338F, -2.2224F, 7, 1, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -2.8621F, 0.5858F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0443F, -0.1744F, -0.0077F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 37, 0, 1.1557F, 0.438F, 1.5278F, 1, 1, 2, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -2.8621F, 0.5858F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0436F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 53, 60, -0.5F, 0.438F, 1.9267F, 1, 1, 1, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 52, 52, -2.0F, -0.062F, -0.0733F, 4, 1, 2, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.5F, -1.2413F, -5.86F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0433F, -0.0057F, 0.1308F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 18, 60, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 8, 60, -0.5F, -0.2F, -0.5F, 1, 1, 1, -0.004F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(1.5F, -1.2413F, -5.86F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0433F, 0.0057F, -0.1308F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 23, 60, -0.5F, -0.2F, -0.5F, 1, 1, 1, -0.004F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 28, 60, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.7F, -3.9F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3099F, -0.1664F, -0.053F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 36, 42, 2.8739F, 0.3F, -0.727F, 1, 1, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.7F, -3.9F);
        this.body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3242F, -0.3364F, -0.1105F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 44, 2.5898F, 0.25F, -0.1736F, 2, 1, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -1.4621F, -2.1142F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.476F, -0.2299F, -0.1169F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 43, 21, 1.4324F, 0.3899F, -0.4896F, 3, 1, 1, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -1.4621F, -2.1142F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4941F, -0.3457F, -0.1806F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 19, 34, 1.7407F, 0.3649F, 0.2922F, 3, 1, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -2.8621F, 0.5858F);
        this.body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0537F, -0.6233F, -0.0314F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 51, 42, 1.0302F, 0.488F, -1.8257F, 4, 1, 1, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -2.8621F, 0.5858F);
        this.body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0878F, -1.0499F, -0.0762F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 14, 43, 0.5515F, 0.338F, -2.1757F, 6, 1, 1, 0.003F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -2.8621F, 0.5858F);
        this.body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3331F, -1.437F, -0.3303F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 51, 39, -0.1036F, 0.338F, -2.2224F, 7, 1, 1, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -0.7F, -3.9F);
        this.body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2675F, 0.0468F, -0.1647F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 6, 0, -2.7496F, -1.0582F, -0.1042F, 0, 1, 1, 0.001F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -1.4621F, -2.1142F);
        this.body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.4564F, -0.0776F, 0.1565F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 6, 5, 2.395F, -0.6472F, 1.9677F, 0, 1, 1, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 6, 5, 2.395F, -0.7472F, -0.0323F, 0, 1, 1, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -1.4621F, -2.1142F);
        this.body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.4564F, 0.0776F, -0.1565F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 5, -2.395F, -0.6472F, 1.9677F, 0, 1, 1, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 5, -2.395F, -0.7472F, -0.0323F, 0, 1, 1, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -2.8621F, 0.5858F);
        this.body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0433F, 0.0057F, -0.1308F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 19, 27, -1.914F, -0.4251F, -0.0733F, 0, 1, 1, 0.0F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -2.8621F, 0.5858F);
        this.body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0433F, -0.0057F, 0.1308F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 34, 13, 1.914F, -0.4251F, -0.0733F, 0, 1, 1, 0.0F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -1.4621F, -2.1142F);
        this.body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.4625F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 41, 47, -2.5F, -0.1101F, -0.0323F, 5, 1, 3, 0.0F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -0.7F, -3.9F);
        this.body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.2675F, -0.0468F, 0.1647F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 13, 2.7496F, -1.0582F, -0.1042F, 0, 1, 1, 0.001F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -0.7F, -3.9F);
        this.body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3054F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 51, -3.0F, -0.3F, -0.1F, 6, 1, 2, 0.001F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -0.925F, -6.5F);
        this.body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.2182F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 38, 60, -0.5F, -0.45F, -1.425F, 1, 1, 1, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 32, -1.0F, -0.45F, -0.425F, 2, 1, 2, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -2.8621F, 0.5858F);
        this.body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0262F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, 0.0F, -0.3289F, 0.7503F, 0, 1, 1, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 30, 27, -0.5F, -0.1779F, -0.3042F, 1, 1, 2, -0.003F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -1.4621F, -2.1142F);
        this.body.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.3927F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 6, 13, 0.0F, -0.6891F, -0.2195F, 0, 1, 1, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 6, 13, 0.0F, -0.6891F, 1.7805F, 0, 1, 1, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 0, -0.5F, -0.5829F, -0.174F, 1, 1, 3, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -0.7F, -3.9F);
        this.body.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.2356F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 27, 0.0F, -1.1133F, 0.1949F, 0, 1, 1, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 57, 13, -0.5F, -0.9071F, -0.2596F, 1, 1, 2, 0.004F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -1.7637F, -5.1594F);
        this.body.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.4625F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 6, 27, 0.0F, -0.9339F, -0.0291F, 0, 1, 1, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, -1.6F, -5.2F);
        this.body.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.0698F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 33, 60, -0.5F, -0.1F, 0.0F, 1, 1, 1, 0.0F, false));

        this.headspike = new ModelRenderer(this);
        this.headspike.setRotationPoint(-2.5F, -1.0F, -6.0F);
        this.main.addChild(headspike);


        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(8.5289F, 0.5F, 3.3683F);
        this.headspike.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.384F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 45, 52, -0.9587F, 0.05F, -0.0201F, 1, 1, 4, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.headspike.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.7505F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 13, -0.675F, 0.5F, 1.925F, 1, 1, 3, 0.0F, false));

        this.headspike2 = new ModelRenderer(this);
        this.headspike2.setRotationPoint(2.5F, -1.0F, -6.0F);
        this.main.addChild(headspike2);


        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-8.5289F, 0.5F, 3.3683F);
        this.headspike2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, -0.384F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 13, 51, -0.0413F, 0.05F, -0.0201F, 1, 1, 4, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.headspike2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, -0.7505F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 5, -0.325F, 0.5F, 1.925F, 1, 1, 3, 0.0F, false));

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
