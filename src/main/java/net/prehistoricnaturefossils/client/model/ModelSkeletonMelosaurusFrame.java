package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMelosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Melosaurus;
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
    private final ModelRenderer cube_r33;
    private final ModelRenderer Body;
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
    private final ModelRenderer cube_r57;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer LLeg;
    private final ModelRenderer LLeg2;
    private final ModelRenderer LFoot;
    private final ModelRenderer LLeg3;
    private final ModelRenderer LLeg4;
    private final ModelRenderer LFoot2;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer Tail4;
    private final ModelRenderer LArm;
    private final ModelRenderer LArm2;
    private final ModelRenderer LHand;
    private final ModelRenderer LArm3;
    private final ModelRenderer LArm4;
    private final ModelRenderer LHand2;
    private final ModelRenderer Neck;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer bone2;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjaw;
    private final ModelRenderer cube_r97;
    private final ModelRenderer cube_r98;
    private final ModelRenderer cube_r99;
    private final ModelRenderer cube_r100;
    private final ModelRenderer cube_r101;
    private final ModelRenderer cube_r102;
    private final ModelRenderer cube_r103;
    private final ModelRenderer cube_r104;
    private final ModelRenderer cube_r105;
    private final ModelRenderer cube_r106;
    private final ModelRenderer cube_r107;
    private final ModelRenderer cube_r108;
    private final ModelRenderer cube_r109;
    private final ModelRenderer cube_r110;
    private final ModelRenderer cube_r111;
    private final ModelRenderer cube_r112;
    private final ModelRenderer cube_r113;
    private final ModelRenderer cube_r114;
    private final ModelRenderer cube_r115;
    private final ModelRenderer cube_r116;
    private final ModelRenderer cube_r117;
    private final ModelRenderer cube_r118;
    private final ModelRenderer cube_r119;
    private final ModelRenderer cube_r120;
    private final ModelRenderer cube_r121;
    private final ModelRenderer cube_r122;
    private final ModelRenderer Lowerjaw;
    private final ModelRenderer cube_r123;
    private final ModelRenderer cube_r124;
    private final ModelRenderer cube_r125;
    private final ModelRenderer cube_r126;
    private final ModelRenderer cube_r127;
    private final ModelRenderer cube_r128;
    private final ModelRenderer cube_r129;
    private final ModelRenderer cube_r130;
    private final ModelRenderer cube_r131;
    private final ModelRenderer cube_r132;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r133;
    private final ModelRenderer cube_r134;
    private final ModelRenderer cube_r135;
    private final ModelRenderer cube_r136;
    private final ModelRenderer cube_r137;
    private final ModelRenderer cube_r138;

    public ModelSkeletonMelosaurusFrame() {
        this.textureWidth = 68;
        this.textureHeight = 68;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Melosaurus = new ModelRenderer(this);
        this.Melosaurus.setRotationPoint(0.0F, -3.0F, -6.0F);
        this.fossil.addChild(Melosaurus);
        this.setRotateAngle(Melosaurus, 0.0262F, 0.0F, 0.0F);
        this.Melosaurus.cubeList.add(new ModelBox(Melosaurus, 19, 35, -0.5F, -1.0F, -3.7F, 1, 1, 8, -0.2F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.7998F, -6.3131F);
        this.Melosaurus.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.0F, 2.7998F, -6.7131F);
        this.Melosaurus.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0658F, 0.8454F, -0.0493F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.0692F, 1.2717F, -4.3023F);
        this.Melosaurus.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1282F, -0.7156F, -1.2142F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.4F, 2.9089F, -3.4155F);
        this.Melosaurus.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1055F, -0.4122F, -1.2562F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(3.0692F, 1.2717F, -4.3023F);
        this.Melosaurus.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1282F, 0.7156F, 1.2142F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(3.4F, 2.9089F, -3.4155F);
        this.Melosaurus.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1055F, 0.4122F, 1.2562F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(4.0F, 2.7998F, -6.7131F);
        this.Melosaurus.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0658F, -0.8454F, 0.0493F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.0002F, -0.8131F);
        this.Melosaurus.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.0002F, -2.8131F);
        this.Melosaurus.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.2F, -1.0002F, 3.1869F);
        this.Melosaurus.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2147F, 0.1069F, -1.0636F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.2F, -1.0002F, 3.1869F);
        this.Melosaurus.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1564F, 0.1905F, -0.6754F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.2F, -1.0002F, 3.1869F);
        this.Melosaurus.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0904F, 0.2364F, -0.3664F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.2F, -1.0002F, 1.1869F);
        this.Melosaurus.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0904F, 0.2364F, -0.3664F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.2F, -1.0002F, 1.1869F);
        this.Melosaurus.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1564F, 0.1905F, -0.6754F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.2F, -1.0002F, 1.1869F);
        this.Melosaurus.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2147F, 0.1069F, -1.0636F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.2F, -1.0002F, -0.8131F);
        this.Melosaurus.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2147F, 0.1069F, -1.0636F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.2F, -1.0002F, -0.8131F);
        this.Melosaurus.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1564F, 0.1905F, -0.6754F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.2F, -1.0002F, -0.8131F);
        this.Melosaurus.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0904F, 0.2364F, -0.3664F);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.1F, -1.0002F, -2.8131F);
        this.Melosaurus.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2147F, 0.1069F, -1.0636F);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.1F, -1.0002F, -2.8131F);
        this.Melosaurus.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1564F, 0.1905F, -0.6754F);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.1F, -1.0002F, -2.8131F);
        this.Melosaurus.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0904F, 0.2364F, -0.3664F);


        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.2F, -1.0002F, 3.1869F);
        this.Melosaurus.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2147F, -0.1069F, 1.0636F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.2F, -1.0002F, 3.1869F);
        this.Melosaurus.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1564F, -0.1905F, 0.6754F);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.2F, -1.0002F, 3.1869F);
        this.Melosaurus.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0904F, -0.2364F, 0.3664F);


        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.2F, -1.0002F, 1.1869F);
        this.Melosaurus.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0904F, -0.2364F, 0.3664F);


        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.2F, -1.0002F, 1.1869F);
        this.Melosaurus.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1564F, -0.1905F, 0.6754F);


        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.2F, -1.0002F, 1.1869F);
        this.Melosaurus.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2147F, -0.1069F, 1.0636F);


        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.2F, -1.0002F, -0.8131F);
        this.Melosaurus.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0904F, -0.2364F, 0.3664F);


        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.2F, -1.0002F, -0.8131F);
        this.Melosaurus.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1564F, -0.1905F, 0.6754F);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.2F, -1.0002F, -0.8131F);
        this.Melosaurus.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.2147F, -0.1069F, 1.0636F);


        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.1F, -1.0002F, -2.8131F);
        this.Melosaurus.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.2147F, -0.1069F, 1.0636F);


        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.1F, -1.0002F, -2.8131F);
        this.Melosaurus.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1564F, -0.1905F, 0.6754F);


        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.1F, -1.0002F, -2.8131F);
        this.Melosaurus.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0904F, -0.2364F, 0.3664F);


        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.1F, 3.7F);
        this.Melosaurus.addChild(Body);
        this.setRotateAngle(Body, -0.1056F, -0.1302F, 0.0138F);
        this.Body.cubeList.add(new ModelBox(Body, 14, 3, -0.5F, 0.103F, 0.187F, 1, 1, 9, -0.2F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.3F, 0.2013F, 7.4166F);
        this.Body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0904F, 0.2364F, -0.3664F);


        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.3F, 0.2013F, 7.4166F);
        this.Body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1564F, 0.1905F, -0.6754F);


        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.3F, 0.2013F, 7.4166F);
        this.Body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.2147F, 0.1069F, -1.0636F);


        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.3F, 0.2013F, 5.4166F);
        this.Body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.2147F, 0.1069F, -1.0636F);


        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.3F, 0.2013F, 5.4166F);
        this.Body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1564F, 0.1905F, -0.6754F);


        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.3F, 0.2013F, 5.4166F);
        this.Body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0904F, 0.2364F, -0.3664F);


        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.3F, 0.2013F, 3.4166F);
        this.Body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.2147F, 0.1069F, -1.0636F);


        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.3F, 0.2013F, 3.4166F);
        this.Body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1564F, 0.1905F, -0.6754F);


        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.3F, 0.2013F, 3.4166F);
        this.Body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0904F, 0.2364F, -0.3664F);


        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.3F, 0.2013F, 1.4166F);
        this.Body.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.2147F, 0.1069F, -1.0636F);


        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.3F, 0.2013F, 1.4166F);
        this.Body.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.1564F, 0.1905F, -0.6754F);


        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.3F, 0.2013F, 1.4166F);
        this.Body.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0904F, 0.2364F, -0.3664F);


        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.3F, 0.2013F, 1.4166F);
        this.Body.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.1564F, -0.1905F, 0.6754F);


        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(0.3F, 0.2013F, 1.4166F);
        this.Body.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.2147F, -0.1069F, 1.0636F);


        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.3F, 0.2013F, 1.4166F);
        this.Body.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0904F, -0.2364F, 0.3664F);


        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.3F, 0.2013F, 7.4166F);
        this.Body.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.2147F, -0.1069F, 1.0636F);


        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.3F, 0.2013F, 7.4166F);
        this.Body.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.1564F, -0.1905F, 0.6754F);


        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.3F, 0.2013F, 7.4166F);
        this.Body.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.0904F, -0.2364F, 0.3664F);


        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.3F, 0.2013F, 5.4166F);
        this.Body.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.2147F, -0.1069F, 1.0636F);


        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.3F, 0.2013F, 5.4166F);
        this.Body.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.1564F, -0.1905F, 0.6754F);


        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.3F, 0.2013F, 5.4166F);
        this.Body.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.0904F, -0.2364F, 0.3664F);


        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(0.3F, 0.2013F, 3.4166F);
        this.Body.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.1564F, -0.1905F, 0.6754F);


        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.3F, 0.2013F, 3.4166F);
        this.Body.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.2147F, -0.1069F, 1.0636F);


        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(0.3F, 0.2013F, 3.4166F);
        this.Body.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.0904F, -0.2364F, 0.3664F);


        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.1057F, 8.9137F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.0089F, -0.1745F, 0.0015F);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 23, -0.5F, 0.2328F, -0.1766F, 1, 1, 9, -0.2F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-1.5F, 3.5309F, 1.567F);
        this.Body2.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.6545F, 1.1345F);


        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(1.5F, 3.5309F, 1.567F);
        this.Body2.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, -0.6545F, -1.1345F);


        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, 0.6309F, 5.667F);
        this.Body2.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.6545F, 0.0F, 0.0F);


        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, -0.7691F, 6.467F);
        this.Body2.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.2182F, 0.0F, 0.0F);


        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, -0.7691F, 4.467F);
        this.Body2.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.1745F, 0.0F, 0.0F);


        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(-0.3F, 0.3308F, 4.5469F);
        this.Body2.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.1757F, 0.4392F, -0.391F);


        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(-0.4F, 0.3308F, 2.5469F);
        this.Body2.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.1402F, 0.3583F, -0.3787F);


        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(-0.4F, 0.3308F, 2.5469F);
        this.Body2.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.2416F, 0.2919F, -0.6935F);


        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.3F, 0.3308F, 0.5469F);
        this.Body2.addChild(cube_r66);
        this.setRotateAngle(cube_r66, -0.1402F, 0.3583F, -0.3787F);


        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.3F, 0.3308F, 0.5469F);
        this.Body2.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -0.2416F, 0.2919F, -0.6935F);


        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.3F, 0.3308F, 4.5469F);
        this.Body2.addChild(cube_r68);
        this.setRotateAngle(cube_r68, -0.1757F, -0.4392F, 0.391F);


        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(0.0F, 2.4044F, 2.5104F);
        this.Body2.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 1.6578F, 0.0111F, -0.0034F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 0, 5, -0.503F, -0.3F, -0.9999F, 1, 1, 3, -0.201F, false));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(0.0F, 2.4044F, 2.5104F);
        this.Body2.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 1.5596F, 0.087F, -1.5752F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 11, 34, -1.3999F, -0.3F, -2.997F, 1, 1, 6, -0.2F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.4F, 0.3308F, 2.5469F);
        this.Body2.addChild(cube_r71);
        this.setRotateAngle(cube_r71, -0.1402F, -0.3583F, 0.3787F);


        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(0.4F, 0.3308F, 2.5469F);
        this.Body2.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.2416F, -0.2919F, 0.6935F);


        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(0.3F, 0.3308F, 0.5469F);
        this.Body2.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -0.2416F, -0.2919F, 0.6935F);


        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(0.3F, 0.3308F, 0.5469F);
        this.Body2.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.1402F, -0.3583F, 0.3787F);


        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(2.7F, 2.331F, 2.56F);
        this.Body2.addChild(LLeg);
        this.setRotateAngle(LLeg, -0.0173F, -0.9839F, 0.7613F);


        this.LLeg2 = new ModelRenderer(this);
        this.LLeg2.setRotationPoint(2.6F, 0.0F, -0.6F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 0.1533F, -0.8502F, 0.0463F);


        this.LFoot = new ModelRenderer(this);
        this.LFoot.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.LLeg2.addChild(LFoot);
        this.setRotateAngle(LFoot, 0.0238F, 0.3428F, -0.1868F);


        this.LLeg3 = new ModelRenderer(this);
        this.LLeg3.setRotationPoint(-2.7F, 2.331F, 2.56F);
        this.Body2.addChild(LLeg3);
        this.setRotateAngle(LLeg3, -0.3437F, 1.0822F, -0.9816F);


        this.LLeg4 = new ModelRenderer(this);
        this.LLeg4.setRotationPoint(-2.6F, 0.0F, -0.6F);
        this.LLeg3.addChild(LLeg4);
        this.setRotateAngle(LLeg4, 0.1345F, 0.7206F, -0.0728F);


        this.LFoot2 = new ModelRenderer(this);
        this.LFoot2.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.LLeg4.addChild(LFoot2);
        this.setRotateAngle(LFoot2, -0.0482F, -0.0546F, 0.0513F);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.1499F, 7.9167F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, -0.062F, -0.1742F, 0.0108F);
        this.Tail.cubeList.add(new ModelBox(Tail, 38, 12, -0.5F, 0.1345F, 0.105F, 1, 1, 7, -0.2F, false));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(0.0F, -0.2698F, -0.0525F);
        this.Tail.addChild(cube_r75);
        this.setRotateAngle(cube_r75, -0.2618F, 0.0F, 0.0F);


        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(0.0F, 0.6189F, 0.0987F);
        this.Tail.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.6981F, 0.0F, 0.0F);


        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(-0.3F, 0.2301F, -3.2656F);
        this.Tail.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.1757F, 0.4392F, -0.391F);


        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(0.3F, 0.2301F, -3.2656F);
        this.Tail.addChild(cube_r78);
        this.setRotateAngle(cube_r78, -0.1757F, -0.4392F, 0.391F);


        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0302F, 6.8475F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0087F, 0.0436F, -0.0004F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 12, 14, -0.5F, 0.1046F, -0.148F, 1, 1, 9, -0.2F, false));

        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(0.0F, -0.3015F, 0.9302F);
        this.Tail2.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.2269F, 0.0F, 0.0F);


        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(0.0F, 0.1753F, 7.1566F);
        this.Tail2.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.5061F, 0.0F, 0.0F);


        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(0.0F, 0.4725F, 5.28F);
        this.Tail2.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.6283F, 0.0F, 0.0F);


        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(0.0F, 0.4725F, 0.88F);
        this.Tail2.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.7156F, 0.0F, 0.0F);


        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.2015F, 7.8302F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0089F, 0.2182F, 0.0019F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 21, 25, -0.5F, 0.3043F, 0.4828F, 1, 1, 8, -0.2F, false));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(0.0F, -0.2012F, 1.0567F);
        this.Tail3.addChild(cube_r83);
        this.setRotateAngle(cube_r83, -0.2182F, 0.0F, 0.0F);


        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(0.0F, 0.6988F, 1.0567F);
        this.Tail3.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.3927F, 0.0F, 0.0F);


        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.0012F, 7.9567F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0472F, 0.3923F, 0.0181F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 32, 43, -0.5F, 0.302F, -0.0174F, 1, 1, 6, -0.2F, false));

        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(4.3F, 2.2657F, -5.2179F);
        this.Melosaurus.addChild(LArm);
        this.setRotateAngle(LArm, 0.5589F, -1.0423F, 0.6997F);


        this.LArm2 = new ModelRenderer(this);
        this.LArm2.setRotationPoint(2.9F, 0.0F, 0.4F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, -0.0681F, 0.298F, -0.2284F);


        this.LHand = new ModelRenderer(this);
        this.LHand.setRotationPoint(2.0757F, 0.0F, -0.4243F);
        this.LArm2.addChild(LHand);
        this.setRotateAngle(LHand, 0.1535F, -0.3826F, 0.2348F);


        this.LArm3 = new ModelRenderer(this);
        this.LArm3.setRotationPoint(-4.3F, 2.2657F, -5.2179F);
        this.Melosaurus.addChild(LArm3);
        this.setRotateAngle(LArm3, -0.0304F, 0.9902F, -1.4289F);


        this.LArm4 = new ModelRenderer(this);
        this.LArm4.setRotationPoint(-2.9F, 0.0F, 0.4F);
        this.LArm3.addChild(LArm4);
        this.setRotateAngle(LArm4, 0.1322F, 0.0104F, 0.0646F);


        this.LHand2 = new ModelRenderer(this);
        this.LHand2.setRotationPoint(-2.0757F, 0.0F, -0.4243F);
        this.LArm4.addChild(LHand2);
        this.setRotateAngle(LHand2, 0.1434F, 0.1236F, -0.2747F);


        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -1.0948F, -3.3001F);
        this.Melosaurus.addChild(Neck);
        this.setRotateAngle(Neck, 0.0698F, 0.0F, 0.0F);


        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(0.0F, -0.9735F, -3.3072F);
        this.Neck.addChild(cube_r85);
        this.setRotateAngle(cube_r85, -0.2007F, 0.0F, 0.0F);


        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(0.0F, 0.1109F, -4.7427F);
        this.Neck.addChild(cube_r86);
        this.setRotateAngle(cube_r86, -0.0698F, 0.0F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 0, 44, -0.5F, -0.3757F, -0.8654F, 1, 1, 6, -0.2F, false));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(0.2F, 0.1107F, -1.6558F);
        this.Neck.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.1564F, 0.1905F, -0.6754F);


        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(0.2F, 0.1107F, -1.6558F);
        this.Neck.addChild(cube_r88);
        this.setRotateAngle(cube_r88, -0.0904F, 0.2364F, -0.3664F);


        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(0.5F, -0.2893F, -3.6558F);
        this.Neck.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -0.1564F, 0.1905F, -0.6754F);


        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(0.5F, -0.2893F, -3.6558F);
        this.Neck.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -0.0904F, 0.2364F, -0.3664F);


        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(-0.5F, -0.2893F, -3.6558F);
        this.Neck.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -0.1564F, -0.1905F, 0.6754F);


        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(-0.5F, -0.2893F, -3.6558F);
        this.Neck.addChild(cube_r92);
        this.setRotateAngle(cube_r92, -0.0904F, -0.2364F, 0.3664F);


        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(-0.2F, 0.1107F, -1.6558F);
        this.Neck.addChild(cube_r93);
        this.setRotateAngle(cube_r93, -0.1564F, -0.1905F, 0.6754F);


        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(-0.2F, 0.1107F, -1.6558F);
        this.Neck.addChild(cube_r94);
        this.setRotateAngle(cube_r94, -0.0904F, -0.2364F, 0.3664F);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 2.2548F, -1.708F);
        this.Neck.addChild(bone2);


        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 1.5708F, -0.2182F, -1.5708F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 32, 33, -1.4F, -0.5F, -4.0F, 1, 1, 8, -0.2F, false));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 1.3526F, 0.0F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 0, 12, -0.5F, -0.5F, -1.0F, 1, 1, 3, -0.201F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.3891F, -4.6427F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.4333F, 0.0763F, -0.2793F);


        this.Upperjaw = new ModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, 0.7397F, 1.8716F);
        this.Head.addChild(Upperjaw);


        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(-1.0035F, -0.8169F, -4.91F);
        this.Upperjaw.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.0352F, -0.0046F, -0.1308F);


        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(-1.1435F, -1.1141F, -4.9215F);
        this.Upperjaw.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.047F, -0.0163F, -0.3486F);


        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(-2.6F, -0.6478F, -3.3749F);
        this.Upperjaw.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.0446F, -0.0244F, -0.357F);


        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(-2.6F, -0.6478F, -3.3749F);
        this.Upperjaw.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.048F, -0.0244F, -0.357F);


        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(-0.494F, -1.1847F, -4.3094F);
        this.Upperjaw.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.0162F, -0.7138F, -0.1052F);


        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(-0.494F, -1.1847F, -4.3094F);
        this.Upperjaw.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.0182F, -0.2258F, -0.1319F);


        this.cube_r103 = new ModelRenderer(this);
        this.cube_r103.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.Upperjaw.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.0F, -0.3491F, 0.0F);


        this.cube_r104 = new ModelRenderer(this);
        this.cube_r104.setRotationPoint(-0.494F, -1.1847F, -4.3094F);
        this.Upperjaw.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.018F, -0.2608F, -0.1361F);


        this.cube_r105 = new ModelRenderer(this);
        this.cube_r105.setRotationPoint(-1.9F, 0.0F, -10.7F);
        this.Upperjaw.addChild(cube_r105);
        this.setRotateAngle(cube_r105, -0.0034F, -0.6713F, 0.0214F);


        this.cube_r106 = new ModelRenderer(this);
        this.cube_r106.setRotationPoint(-1.1734F, 0.0022F, -7.4372F);
        this.Upperjaw.addChild(cube_r106);
        this.setRotateAngle(cube_r106, -0.0034F, -0.3047F, 0.022F);


        this.cube_r107 = new ModelRenderer(this);
        this.cube_r107.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.Upperjaw.addChild(cube_r107);
        this.setRotateAngle(cube_r107, -0.0094F, 0.1295F, -0.0361F);


        this.cube_r108 = new ModelRenderer(this);
        this.cube_r108.setRotationPoint(-1.694F, -1.1847F, -8.8094F);
        this.Upperjaw.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.0126F, -0.4007F, -0.1275F);


        this.cube_r109 = new ModelRenderer(this);
        this.cube_r109.setRotationPoint(0.0F, -1.3F, -6.9F);
        this.Upperjaw.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.0846F, 0.0143F, -0.1399F);


        this.cube_r110 = new ModelRenderer(this);
        this.cube_r110.setRotationPoint(1.0035F, -0.8169F, -4.91F);
        this.Upperjaw.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.0352F, 0.0046F, 0.1308F);


        this.cube_r111 = new ModelRenderer(this);
        this.cube_r111.setRotationPoint(1.1435F, -1.1141F, -4.9215F);
        this.Upperjaw.addChild(cube_r111);
        this.setRotateAngle(cube_r111, 0.047F, 0.0163F, 0.3486F);


        this.cube_r112 = new ModelRenderer(this);
        this.cube_r112.setRotationPoint(2.6F, -0.6478F, -3.3749F);
        this.Upperjaw.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 0.0446F, 0.0244F, 0.357F);


        this.cube_r113 = new ModelRenderer(this);
        this.cube_r113.setRotationPoint(2.6F, -0.6478F, -3.3749F);
        this.Upperjaw.addChild(cube_r113);
        this.setRotateAngle(cube_r113, 0.048F, 0.0244F, 0.357F);


        this.cube_r114 = new ModelRenderer(this);
        this.cube_r114.setRotationPoint(0.494F, -1.1847F, -4.3094F);
        this.Upperjaw.addChild(cube_r114);
        this.setRotateAngle(cube_r114, 0.0162F, 0.7138F, 0.1052F);


        this.cube_r115 = new ModelRenderer(this);
        this.cube_r115.setRotationPoint(0.494F, -1.1847F, -4.3094F);
        this.Upperjaw.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 0.0182F, 0.2258F, 0.1319F);


        this.cube_r116 = new ModelRenderer(this);
        this.cube_r116.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.Upperjaw.addChild(cube_r116);
        this.setRotateAngle(cube_r116, 0.0F, 0.3491F, 0.0F);


        this.cube_r117 = new ModelRenderer(this);
        this.cube_r117.setRotationPoint(0.494F, -1.1847F, -4.3094F);
        this.Upperjaw.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 0.018F, 0.2608F, 0.1361F);


        this.cube_r118 = new ModelRenderer(this);
        this.cube_r118.setRotationPoint(1.9F, 0.0F, -10.7F);
        this.Upperjaw.addChild(cube_r118);
        this.setRotateAngle(cube_r118, -0.0034F, 0.6713F, -0.0214F);


        this.cube_r119 = new ModelRenderer(this);
        this.cube_r119.setRotationPoint(1.1734F, 0.0022F, -7.4372F);
        this.Upperjaw.addChild(cube_r119);
        this.setRotateAngle(cube_r119, -0.0034F, 0.3047F, -0.022F);


        this.cube_r120 = new ModelRenderer(this);
        this.cube_r120.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.Upperjaw.addChild(cube_r120);
        this.setRotateAngle(cube_r120, -0.0094F, -0.1295F, 0.0361F);


        this.cube_r121 = new ModelRenderer(this);
        this.cube_r121.setRotationPoint(1.694F, -1.1847F, -8.8094F);
        this.Upperjaw.addChild(cube_r121);
        this.setRotateAngle(cube_r121, 0.0126F, 0.4007F, 0.1275F);


        this.cube_r122 = new ModelRenderer(this);
        this.cube_r122.setRotationPoint(0.0F, -1.3F, -6.9F);
        this.Upperjaw.addChild(cube_r122);
        this.setRotateAngle(cube_r122, 0.0846F, -0.0143F, 0.1399F);


        this.Lowerjaw = new ModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 0.9397F, 1.9716F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.5847F, 0.0F, 0.0F);


        this.cube_r123 = new ModelRenderer(this);
        this.cube_r123.setRotationPoint(-1.5F, 1.0F, -9.0F);
        this.Lowerjaw.addChild(cube_r123);
        this.setRotateAngle(cube_r123, 0.0F, -0.3054F, 0.0F);


        this.cube_r124 = new ModelRenderer(this);
        this.cube_r124.setRotationPoint(-1.5F, 1.0F, -9.0F);
        this.Lowerjaw.addChild(cube_r124);
        this.setRotateAngle(cube_r124, 0.0F, -0.3927F, 0.0F);


        this.cube_r125 = new ModelRenderer(this);
        this.cube_r125.setRotationPoint(-1.9F, 0.46F, -10.5F);
        this.Lowerjaw.addChild(cube_r125);
        this.setRotateAngle(cube_r125, -0.0123F, -0.6273F, 0.038F);


        this.cube_r126 = new ModelRenderer(this);
        this.cube_r126.setRotationPoint(-1.5F, 0.46F, -8.6F);
        this.Lowerjaw.addChild(cube_r126);
        this.setRotateAngle(cube_r126, -0.0007F, 0.1569F, -0.0083F);


        this.cube_r127 = new ModelRenderer(this);
        this.cube_r127.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.Lowerjaw.addChild(cube_r127);
        this.setRotateAngle(cube_r127, 0.0F, -0.3491F, 0.0F);


        this.cube_r128 = new ModelRenderer(this);
        this.cube_r128.setRotationPoint(1.5F, 1.0F, -9.0F);
        this.Lowerjaw.addChild(cube_r128);
        this.setRotateAngle(cube_r128, 0.0F, 0.3054F, 0.0F);


        this.cube_r129 = new ModelRenderer(this);
        this.cube_r129.setRotationPoint(1.5F, 1.0F, -9.0F);
        this.Lowerjaw.addChild(cube_r129);
        this.setRotateAngle(cube_r129, 0.0F, 0.3927F, 0.0F);


        this.cube_r130 = new ModelRenderer(this);
        this.cube_r130.setRotationPoint(1.9F, 0.46F, -10.5F);
        this.Lowerjaw.addChild(cube_r130);
        this.setRotateAngle(cube_r130, -0.0123F, 0.6273F, -0.038F);


        this.cube_r131 = new ModelRenderer(this);
        this.cube_r131.setRotationPoint(1.5F, 0.46F, -8.6F);
        this.Lowerjaw.addChild(cube_r131);
        this.setRotateAngle(cube_r131, -0.0007F, -0.1569F, 0.0083F);


        this.cube_r132 = new ModelRenderer(this);
        this.cube_r132.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.Lowerjaw.addChild(cube_r132);
        this.setRotateAngle(cube_r132, 0.0F, 0.3491F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Lowerjaw.addChild(bone);
        this.setRotateAngle(bone, -0.1379F, 0.0F, 0.0F);


        this.cube_r133 = new ModelRenderer(this);
        this.cube_r133.setRotationPoint(-1.5F, 0.9F, -2.6F);
        this.bone.addChild(cube_r133);
        this.setRotateAngle(cube_r133, 0.2921F, -0.2932F, -0.0867F);


        this.cube_r134 = new ModelRenderer(this);
        this.cube_r134.setRotationPoint(-1.5F, 1.0F, -9.0F);
        this.bone.addChild(cube_r134);
        this.setRotateAngle(cube_r134, 0.0F, -0.3054F, 0.0F);


        this.cube_r135 = new ModelRenderer(this);
        this.cube_r135.setRotationPoint(-1.5F, 1.0F, -9.0F);
        this.bone.addChild(cube_r135);
        this.setRotateAngle(cube_r135, 0.0F, -0.3927F, 0.0F);


        this.cube_r136 = new ModelRenderer(this);
        this.cube_r136.setRotationPoint(1.5F, 0.9F, -2.6F);
        this.bone.addChild(cube_r136);
        this.setRotateAngle(cube_r136, 0.2921F, 0.2932F, 0.0867F);


        this.cube_r137 = new ModelRenderer(this);
        this.cube_r137.setRotationPoint(1.5F, 1.0F, -9.0F);
        this.bone.addChild(cube_r137);
        this.setRotateAngle(cube_r137, 0.0F, 0.3054F, 0.0F);


        this.cube_r138 = new ModelRenderer(this);
        this.cube_r138.setRotationPoint(1.5F, 1.0F, -9.0F);
        this.bone.addChild(cube_r138);
        this.setRotateAngle(cube_r138, 0.0F, 0.3927F, 0.0F);

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
