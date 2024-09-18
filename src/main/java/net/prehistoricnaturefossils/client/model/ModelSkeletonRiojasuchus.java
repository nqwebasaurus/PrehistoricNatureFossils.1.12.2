package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonRiojasuchus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer hip;
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
    private final ModelRenderer leftLeg;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer body;
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
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
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
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r87;
    private final ModelRenderer head;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
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
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r121;
    private final ModelRenderer cube_r122;
    private final ModelRenderer cube_r123;
    private final ModelRenderer cube_r124;
    private final ModelRenderer cube_r125;
    private final ModelRenderer cube_r126;
    private final ModelRenderer cube_r127;
    private final ModelRenderer cube_r128;
    private final ModelRenderer cube_r129;
    private final ModelRenderer cube_r130;
    private final ModelRenderer cube_r131;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r132;
    private final ModelRenderer cube_r133;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r134;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r135;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r136;
    private final ModelRenderer cube_r137;
    private final ModelRenderer tail5;

    public ModelSkeletonRiojasuchus() {
        this.textureWidth = 60;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hip = new ModelRenderer(this);
        this.hip.setRotationPoint(0.0F, -9.7F, 1.5F);
        this.fossil.addChild(hip);
        this.setRotateAngle(hip, -0.1745F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.3F, 0.8955F, 0.526F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.1868F, 0.5411F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 0, -0.2F, -0.6754F, -1.4415F, 1, 1, 2, -0.211F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, 1.3057F, 0.263F);
        this.hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0349F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 46, -0.5F, -0.9406F, -1.8601F, 1, 1, 2, -0.004F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 46, 3.5F, -0.9406F, -1.8601F, 1, 1, 2, -0.004F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.2F, -0.0943F, -1.137F);
        this.hip.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3682F, -0.2068F, -0.3961F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 50, -0.2F, 2.3353F, -0.6626F, 1, 2, 1, -0.211F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.2F, -0.0943F, -1.137F);
        this.hip.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.9092F, -0.2068F, -0.3961F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 53, -0.2F, -0.7094F, -0.5393F, 1, 1, 1, -0.211F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.2F, -0.0943F, -1.137F);
        this.hip.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4205F, -0.2068F, -0.3961F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 14, -0.2F, -0.2457F, -0.5274F, 1, 3, 1, -0.2F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.3F, 0.8955F, 0.526F);
        this.hip.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3403F, 0.5411F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 29, -0.2F, -0.3563F, -0.2722F, 1, 1, 4, -0.2F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.0F, -1.0943F, 0.263F);
        this.hip.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3665F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 40, -0.5F, -0.7F, -1.0F, 1, 3, 2, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 40, 3.5F, -0.7F, -1.0F, 1, 3, 2, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.5F, -1.5F, -1.4F);
        this.hip.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1222F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 37, 0.0F, -0.3F, 0.9F, 1, 1, 3, -0.005F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 37, 4.0F, -0.3F, 0.9F, 1, 1, 3, -0.005F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 17, 2.5F, -1.5F, 0.9F, 0, 2, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 13, 2.0F, -1.6F, -0.6F, 1, 1, 6, 0.004F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 23, 10, 2.0F, -0.2F, -0.1F, 1, 1, 5, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.0F, -1.0943F, 0.263F);
        this.hip.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2356F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 30, 0.5F, -0.2F, -0.8F, 1, 1, 2, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 30, 2.5F, -0.2F, -0.8F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(2.2F, -0.0943F, -1.137F);
        this.hip.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3682F, 0.2068F, 0.3961F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 50, -0.8F, 2.3353F, -0.6626F, 1, 2, 1, -0.211F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(2.3F, 0.8955F, 0.526F);
        this.hip.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.1868F, -0.5411F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 0, -0.8F, -0.6754F, -1.4415F, 1, 1, 2, -0.211F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(2.3F, 0.8955F, 0.526F);
        this.hip.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3403F, -0.5411F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 29, -0.8F, -0.3563F, -0.2722F, 1, 1, 4, -0.2F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(2.2F, -0.0943F, -1.137F);
        this.hip.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.9092F, 0.2068F, 0.3961F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 53, -0.8F, -0.7094F, -0.5393F, 1, 1, 1, -0.211F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(2.2F, -0.0943F, -1.137F);
        this.hip.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4205F, 0.2068F, 0.3961F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 14, -0.8F, -0.2457F, -0.5274F, 1, 3, 1, -0.2F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -1.5F, 1.6F);
        this.hip.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 56, -0.5F, -1.0344F, -0.0776F, 0, 2, 1, 0.0F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.0F, -0.0943F, 0.063F);
        this.hip.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.2182F, 0.0F, 0.0F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 4.2F, -0.5F);
        this.leftLeg.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.8203F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 34, 51, 0.0F, -0.0668F, -0.1185F, 1, 1, 1, -0.004F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.3F, -0.8F);
        this.leftLeg.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1571F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 49, 44, 0.0F, 0.0567F, -0.0194F, 1, 2, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.3F, -0.2F);
        this.leftLeg.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 14, 47, 0.0F, -0.8F, -0.3F, 1, 3, 1, -0.004F, false));

        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, 5.0F, 0.3F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9599F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 51, 28, -1.0F, 0.0F, -0.7F, 1, 1, 1, 0.004F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 51, 11, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 13, -1.0F, 1.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.3F, -0.6F);
        this.leftLeg2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2967F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 5, 50, 0.0F, -1.8358F, -0.1507F, 1, 2, 1, -0.2F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.leftLeg2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1222F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 21, 0.0F, -1.5F, -0.6F, 1, 3, 1, -0.199F, false));

        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 4.7152F, 0.0765F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.3927F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 26, 35, -1.0F, -0.2F, -2.0F, 2, 1, 3, 0.0F, false));

        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 0.3F, -2.0F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, -0.3927F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 34, 15, -1.0F, -0.5F, -2.5F, 2, 1, 3, -0.004F, false));

        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.0F, -0.0943F, 0.063F);
        this.hip.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.9638F, 0.0857F, -0.0467F);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 4.2F, -0.5F);
        this.rightLeg.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.8203F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 51, -1.0F, -0.0668F, -0.1185F, 1, 1, 1, -0.004F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 2.3F, -0.8F);
        this.rightLeg.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1571F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 49, 44, -1.0F, 0.0567F, -0.0194F, 1, 2, 1, 0.0F, true));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.3F, -0.2F);
        this.rightLeg.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 14, 47, -1.0F, -0.8F, -0.3F, 1, 3, 1, -0.004F, true));

        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, 5.0F, 0.3F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.7017F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 51, 28, 0.0F, 0.0F, -0.7F, 1, 1, 1, 0.004F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 51, 11, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 13, 0.0F, 1.0F, -0.5F, 1, 4, 1, 0.0F, true));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.3F, -0.6F);
        this.rightLeg2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2967F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 5, 50, -1.0F, -1.8358F, -0.1507F, 1, 2, 1, -0.2F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.rightLeg2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1222F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 21, -1.0F, -1.5F, -0.6F, 1, 3, 1, -0.199F, true));

        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 4.7152F, 0.0765F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.2182F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 26, 35, -1.0F, -0.2F, -2.0F, 2, 1, 3, 0.0F, true));

        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 0.3F, -2.0F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3491F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 34, 15, -1.0F, -0.5F, -2.5F, 2, 1, 3, -0.004F, true));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.3F, -1.7F);
        this.hip.addChild(body);
        this.setRotateAngle(body, -0.0873F, 0.0435F, -0.0038F);


        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 0.3F, -0.8F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0524F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 28, -0.5F, -1.911F, -0.0029F, 0, 2, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 0.3F, -2.6F);
        this.body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0175F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 31, 9, -0.5F, -1.9796F, -0.2032F, 0, 2, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 0.3F, -0.3F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0524F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 34, -0.5F, -2.1F, -4.5F, 0, 2, 1, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 9, 15, -1.0F, -0.7F, -5.5F, 1, 1, 6, 0.004F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 0.3096F, -0.305F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2027F, 0.1706F, -0.9471F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 54, 26, -1.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, true));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 0.3096F, -0.305F);
        this.body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1157F, 0.238F, -1.3695F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 5, 54, -2.5829F, -1.1494F, -0.4787F, 1, 0, 1, 0.0F, true));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, 0.3096F, -0.305F);
        this.body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2586F, 0.0952F, -0.5312F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 10, 54, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, 0.3096F, -2.305F);
        this.body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1434F, 0.3211F, -1.2746F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 47, 9, -3.5829F, -1.1494F, -0.4787F, 2, 0, 1, 0.0F, true));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, 0.3096F, -2.305F);
        this.body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2624F, 0.2354F, -0.8477F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 30, 54, -1.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, true));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, 0.3096F, -2.305F);
        this.body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.3387F, 0.131F, -0.4349F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 54, 34, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, 0.3096F, -4.305F);
        this.body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1548F, 0.3543F, -1.1835F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 40, 37, -4.5829F, -1.1494F, -0.4787F, 3, 0, 1, 0.0F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 0.3096F, -4.305F);
        this.body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.2868F, 0.2611F, -0.7545F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 43, 54, -1.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, 0.3096F, -4.305F);
        this.body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.371F, 0.1451F, -0.3432F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 54, 44, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, 0.3096F, -0.305F);
        this.body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.2027F, -0.1706F, 0.9471F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 54, 26, 0.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, 0.3096F, -0.305F);
        this.body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.2586F, -0.0952F, 0.5312F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 10, 54, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.5F, 0.3096F, -0.305F);
        this.body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.1157F, -0.238F, 1.3695F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 5, 54, 1.5829F, -1.1494F, -0.4787F, 1, 0, 1, 0.0F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, 0.3096F, -2.305F);
        this.body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.3387F, -0.131F, 0.4349F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 54, 34, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, 0.3096F, -2.305F);
        this.body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.2624F, -0.2354F, 0.8477F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 30, 54, 0.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, 0.3096F, -2.305F);
        this.body.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1434F, -0.3211F, 1.2746F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 47, 9, 1.5829F, -1.1494F, -0.4787F, 2, 0, 1, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.5F, 0.3096F, -4.305F);
        this.body.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1548F, -0.3543F, 1.1835F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 40, 37, 1.5829F, -1.1494F, -0.4787F, 3, 0, 1, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, 0.3096F, -4.305F);
        this.body.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.2868F, -0.2611F, 0.7545F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 43, 54, 0.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5F, 0.3096F, -4.305F);
        this.body.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.371F, -0.1451F, 0.3432F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 54, 44, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 4.3778F, -3.5911F);
        this.body.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.096F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 0, -2.5F, -1.0F, -2.0F, 5, 2, 4, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.5F, -1.6F, -6.0F);
        this.body.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0349F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 37, 26, -1.0F, -0.1043F, 2.8928F, 1, 1, 3, 0.0F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 37, 0, -1.5F, -0.1043F, -0.1072F, 2, 1, 3, 0.004F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.3F, -5.8F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0873F, 0.0F);


        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-3.0F, 3.1316F, -4.9486F);
        this.chest.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.9686F, -0.3776F, -0.4923F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 45, 0.0F, -0.7644F, -1.9503F, 1, 2, 2, 0.0F, true));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(-2.5F, 0.1165F, -2.2417F);
        this.chest.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -1.0908F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 43, 51, -0.5F, 0.1F, -0.1F, 1, 1, 1, 0.0F, true));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 43, 51, 4.5F, 0.1F, -0.1F, 1, 1, 1, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(-2.5F, 2.0316F, -3.8486F);
        this.chest.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.8727F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 38, 6, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.005F, true));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 38, 6, 4.5F, -0.5F, -1.5F, 1, 1, 3, 0.005F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(3.0F, 3.1316F, -4.9486F);
        this.chest.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.9686F, 0.3776F, 0.4923F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 45, -1.0F, -0.7644F, -1.9503F, 1, 2, 2, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 0.6F, -4.7F);
        this.chest.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.1222F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 35, 54, 0.0F, -1.8053F, 3.8267F, 0, 2, 1, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 55, 13, 0.0F, -1.8053F, 1.8267F, 0, 2, 1, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 14, 55, 0.0F, -1.8053F, -0.1733F, 0, 2, 1, 0.0F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.5F, 0.1096F, -0.505F);
        this.chest.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.3872F, 0.152F, -0.3233F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 53, 53, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.5F, 0.1096F, -0.505F);
        this.chest.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.2991F, 0.2739F, -0.7338F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 54, -1.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, true));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(-0.5F, 0.1096F, -0.505F);
        this.chest.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.1607F, 0.3709F, -1.164F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 30, 0, -4.5829F, -1.1494F, -0.4787F, 3, 0, 1, 0.0F, true));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.5F, 0.4096F, -2.505F);
        this.chest.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.1849F, 0.4371F, -1.1195F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 16, 25, -4.5829F, -1.1494F, -0.4787F, 3, 0, 1, 0.0F, true));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.5F, 0.4096F, -2.505F);
        this.chest.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.3492F, 0.3246F, -0.6841F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 53, 39, -1.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, true));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(-0.5F, 0.4096F, -2.505F);
        this.chest.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.4522F, 0.1796F, -0.2777F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 53, 8, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.5F, 0.8096F, -4.505F);
        this.chest.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.2383F, 0.5686F, -1.2159F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 25, 31, -3.5829F, -1.1494F, -0.4787F, 2, 0, 1, 0.0F, true));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.5F, 0.8096F, -4.505F);
        this.chest.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.4551F, 0.4236F, -0.7675F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 52, 0, -1.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, true));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.5F, 0.8096F, -4.505F);
        this.chest.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.5843F, 0.2323F, -0.3728F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 35, 42, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(0.5F, 0.8096F, -4.505F);
        this.chest.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.2383F, -0.5686F, 1.2159F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 25, 31, 1.5829F, -1.1494F, -0.4787F, 2, 0, 1, 0.0F, false));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(0.5F, 0.8096F, -4.505F);
        this.chest.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.4551F, -0.4236F, 0.7675F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 52, 0, 0.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, false));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(0.5F, 0.8096F, -4.505F);
        this.chest.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.5843F, -0.2323F, 0.3728F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 35, 42, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.5F, 0.4096F, -2.505F);
        this.chest.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.1849F, -0.4371F, 1.1195F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 16, 25, 1.5829F, -1.1494F, -0.4787F, 3, 0, 1, 0.0F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(0.5F, 0.4096F, -2.505F);
        this.chest.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.3492F, -0.3246F, 0.6841F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 53, 39, 0.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.5F, 0.4096F, -2.505F);
        this.chest.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.4522F, -0.1796F, 0.2777F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 53, 8, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(0.5F, 0.1096F, -0.505F);
        this.chest.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.3872F, -0.152F, 0.3233F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 53, 53, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(0.5F, 0.1096F, -0.505F);
        this.chest.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.2991F, -0.2739F, 0.7338F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 0, 54, 0.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.5F, 0.1096F, -0.505F);
        this.chest.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.1607F, -0.3709F, 1.164F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 30, 0, 1.5829F, -1.1494F, -0.4787F, 3, 0, 1, 0.0F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(0.0F, 5.3F, 0.4F);
        this.chest.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.0349F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 0, 7, -2.5F, -1.0195F, -4.0797F, 5, 1, 4, 0.0F, false));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(0.0F, -1.3F, -5.2F);
        this.chest.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.1222F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 11, 37, -1.5F, -0.1473F, -0.0108F, 3, 2, 2, 0.003F, false));
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 37, 20, -1.0F, -0.1473F, 1.9892F, 2, 1, 3, 0.0F, false));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(0.0F, 0.0F, 0.4F);
        this.chest.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.1745F, 0.0F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 19, 18, -0.5F, -0.5F, -5.3F, 1, 1, 5, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(2.5F, 3.9316F, -4.6486F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.436F, 0.1183F, -0.3146F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 34, -0.5F, -0.5496F, -0.0742F, 1, 1, 4, 0.0F, false));

        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 0.2F, 4.4F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.5922F, -0.5523F, 0.2859F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 22, 7, -0.1864F, -0.0404F, -0.3021F, 1, 4, 1, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 18, 15, -1.2864F, -0.0404F, -0.3021F, 1, 4, 1, -0.2F, false));

        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 3.7F, 0.5F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 2.4958F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 36, 32, -1.1F, -0.1F, -2.8F, 2, 1, 3, 0.0F, false));

        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-2.5F, 3.9316F, -4.6486F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.2248F, -0.3029F, 0.2692F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 34, -0.5F, -0.5496F, -0.0742F, 1, 1, 4, 0.0F, true));

        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 0.2F, 4.4F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.4877F, 0.4938F, 0.009F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 22, 7, -0.8136F, -0.0404F, -0.3021F, 1, 4, 1, 0.0F, true));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 18, 15, 0.2864F, -0.0404F, -0.3021F, 1, 4, 1, -0.2F, true));

        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 3.7F, 0.5F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 2.4086F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 36, 32, -0.9F, -0.1F, -2.8F, 2, 1, 3, 0.0F, true));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.9F, -4.8F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, -0.1242F, -0.1244F, 0.0589F);


        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(0.0F, 0.1F, -0.7F);
        this.neck2.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.1309F, 0.0F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 17, 55, 0.0F, -2.0F, -1.3F, 0, 2, 1, 0.0F, false));
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 47, 55, 0.0F, -1.8F, -3.3F, 0, 2, 1, 0.0F, false));
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 18, 31, -0.5F, -0.5F, -3.3F, 1, 1, 4, 0.004F, false));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(-0.5F, 0.2096F, -1.705F);
        this.neck2.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0514F, 0.9149F, -1.5309F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 42, 15, -2.5829F, -1.1494F, -0.4787F, 1, 0, 1, 0.0F, true));

        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(-0.5F, 0.2096F, -1.705F);
        this.neck2.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.5227F, 0.7912F, -0.9148F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 25, 40, -1.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, true));

        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(-0.5F, 0.2096F, -1.705F);
        this.neck2.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.7994F, 0.547F, -0.4764F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 38, 11, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(-0.5F, 0.5096F, -3.705F);
        this.neck2.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.3436F, 0.9329F, -1.1497F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 20, 37, -1.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, true));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(-0.5F, 0.5096F, -3.705F);
        this.neck2.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.7549F, 0.7266F, -0.6014F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 7, 36, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(0.5F, 0.5096F, -3.705F);
        this.neck2.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.3436F, -0.9329F, 1.1497F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 20, 37, 0.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, false));

        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(0.5F, 0.5096F, -3.705F);
        this.neck2.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.7549F, -0.7266F, 0.6014F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 7, 36, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(0.5F, 0.2096F, -1.705F);
        this.neck2.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.0514F, -0.9149F, 1.5309F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 42, 15, 1.5829F, -1.1494F, -0.4787F, 1, 0, 1, 0.0F, false));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(0.5F, 0.2096F, -1.705F);
        this.neck2.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.5227F, -0.7912F, 0.9148F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 25, 40, 0.9135F, -0.4062F, -0.4787F, 1, 0, 1, 0.0F, false));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(0.5F, 0.2096F, -1.705F);
        this.neck2.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.7994F, -0.547F, 0.4764F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 38, 11, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(0.0F, -1.5F, -4.0F);
        this.neck2.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.2356F, 0.0F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 19, 0, -1.5F, 0.017F, -0.2371F, 3, 2, 4, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -3.9F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0381F, -0.1271F, -0.0918F);
        this.neck.cubeList.add(new ModelBox(neck, 19, 39, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 56, 28, 0.0F, -1.4F, -2.0F, 0, 1, 1, 0.0F, false));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(0.0F, -1.2F, -1.5F);
        this.neck.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.1745F, 0.0F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 29, 23, -1.0F, -0.5F, -1.5F, 2, 2, 3, -0.01F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1F, -2.6F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.011F, -0.4618F, -0.2149F);


        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(0.0F, -0.6882F, -0.551F);
        this.head.addChild(cube_r88);
        this.setRotateAngle(cube_r88, -1.6842F, 0.0F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 15, 52, -1.1F, -0.2194F, -0.179F, 1, 1, 1, -0.2F, true));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 52, 17, -1.1F, 0.3806F, -0.179F, 1, 1, 1, -0.2F, true));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(-0.4F, 2.5032F, -5.2543F);
        this.head.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -0.8203F, 0.0F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 52, 41, -0.52F, -1.4122F, -0.2456F, 1, 1, 1, -0.2F, true));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 29, 51, -0.52F, -0.8122F, -0.2456F, 1, 1, 1, -0.197F, true));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(-0.4F, 2.6032F, -4.9543F);
        this.head.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.3142F, 0.0F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 48, 52, -0.52F, -0.4F, -0.5F, 1, 1, 1, -0.21F, true));

        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(-0.4F, 2.1032F, -4.0543F);
        this.head.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -0.5934F, 0.0F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 52, 20, -0.52F, 0.2382F, -0.7714F, 1, 1, 1, -0.2F, true));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 52, 36, -0.52F, -0.2618F, -0.7714F, 1, 1, 1, -0.199F, true));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(-0.7F, 1.5918F, -2.5654F);
        this.head.addChild(cube_r92);
        this.setRotateAngle(cube_r92, -0.6894F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 8, 23, -0.42F, -0.5F, -0.5F, 1, 1, 1, -0.1F, true));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(-0.2F, 0.3314F, -2.1712F);
        this.head.addChild(cube_r93);
        this.setRotateAngle(cube_r93, -1.6581F, 0.0F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 10, 51, -0.92F, -0.7F, -0.6F, 1, 1, 1, -0.099F, true));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(-0.2F, 0.6302F, -2.1973F);
        this.head.addChild(cube_r94);
        this.setRotateAngle(cube_r94, -0.8727F, 0.0F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 51, 2, -0.92F, -0.5F, -0.4F, 1, 1, 1, -0.11F, true));
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 24, 50, -0.92F, -0.5F, -0.8F, 1, 1, 1, -0.1F, true));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(-0.32F, 0.3401F, -2.0716F);
        this.head.addChild(cube_r95);
        this.setRotateAngle(cube_r95, -1.6581F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 6, 40, -1.02F, -0.5F, -0.5F, 1, 1, 1, -0.3F, true));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 50, 14, -0.91F, -0.5F, -0.5F, 1, 1, 1, -0.2F, true));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(-0.2F, 0.6029F, -0.937F);
        this.head.addChild(cube_r96);
        this.setRotateAngle(cube_r96, -1.2654F, 0.0F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 53, 5, -0.83F, -1.0F, 0.1F, 1, 1, 1, -0.004F, true));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(-0.2F, 0.2044F, -0.9022F);
        this.head.addChild(cube_r97);
        this.setRotateAngle(cube_r97, -0.0873F, 0.0F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 50, 23, -0.83F, -0.6F, -0.5F, 1, 2, 1, 0.004F, true));

        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(-0.5F, 3.5118F, -5.451F);
        this.head.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 1.213F, 0.0F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 29, 56, 0.1F, 0.5002F, 0.1322F, 0, 1, 1, 0.0F, true));

        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(0.3F, 1.9118F, -0.151F);
        this.head.addChild(cube_r99);
        this.setRotateAngle(cube_r99, -1.3352F, 0.0F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 50, 55, -1.2F, 1.3626F, -0.4936F, 0, 2, 1, 0.0F, true));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 20, 53, -1.0F, 3.6626F, -0.9936F, 1, 1, 1, 0.0F, true));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 48, 48, -1.3F, 1.6626F, -0.9936F, 1, 2, 1, 0.004F, true));

        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(0.5F, 3.5118F, -5.451F);
        this.head.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 1.213F, 0.0F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 29, 56, -0.1F, 0.5002F, 0.1322F, 0, 1, 1, 0.0F, false));
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 45, 15, -1.0F, 0.0002F, -0.0678F, 1, 1, 2, 0.0F, false));

        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(0.3F, 2.8118F, -4.151F);
        this.head.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.4625F, 0.0F, 0.0F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 0, 40, -1.0F, -0.9723F, 0.0212F, 1, 1, 3, 0.005F, true));

        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(-0.3F, 2.8118F, -4.151F);
        this.head.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.4625F, 0.0F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 0, 40, 0.0F, -0.9723F, 0.0212F, 1, 1, 3, 0.005F, false));

        this.cube_r103 = new ModelRenderer(this);
        this.cube_r103.setRotationPoint(0.5F, 2.5118F, -5.651F);
        this.head.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.1309F, 0.0F, 0.0F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 25, 53, -1.0F, 0.0178F, -0.0001F, 1, 1, 1, 0.005F, false));

        this.cube_r104 = new ModelRenderer(this);
        this.cube_r104.setRotationPoint(0.5F, 1.8118F, -4.951F);
        this.head.addChild(cube_r104);
        this.setRotateAngle(cube_r104, -0.7243F, 0.0F, 0.0F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 53, 31, -1.0F, 0.0059F, -0.0605F, 1, 1, 1, 0.0F, false));

        this.cube_r105 = new ModelRenderer(this);
        this.cube_r105.setRotationPoint(0.5F, -0.0882F, -2.651F);
        this.head.addChild(cube_r105);
        this.setRotateAngle(cube_r105, -0.8988F, 0.0F, 0.0F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 19, 48, -1.0F, -0.0114F, -0.0053F, 1, 3, 1, 0.004F, false));

        this.cube_r106 = new ModelRenderer(this);
        this.cube_r106.setRotationPoint(0.0F, -0.7882F, -1.951F);
        this.head.addChild(cube_r106);
        this.setRotateAngle(cube_r106, -0.7592F, 0.0F, 0.0F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 41, 40, -1.0F, -0.0217F, -0.0312F, 2, 2, 2, 0.008F, false));

        this.cube_r107 = new ModelRenderer(this);
        this.cube_r107.setRotationPoint(0.0F, -0.6882F, -0.551F);
        this.head.addChild(cube_r107);
        this.setRotateAngle(cube_r107, -1.6842F, 0.0F, 0.0F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 18, 44, -1.0F, 0.3806F, 0.0279F, 2, 1, 2, 0.0F, false));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 15, 52, 0.1F, -0.2194F, -0.179F, 1, 1, 1, -0.2F, false));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 52, 17, 0.1F, 0.3806F, -0.179F, 1, 1, 1, -0.2F, false));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 32, 48, -1.0F, -1.0194F, 0.0279F, 2, 1, 1, 0.0F, false));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 44, 29, -1.0F, -0.0194F, 0.0279F, 2, 1, 2, -0.004F, false));

        this.cube_r108 = new ModelRenderer(this);
        this.cube_r108.setRotationPoint(-0.3F, 1.9118F, -0.151F);
        this.head.addChild(cube_r108);
        this.setRotateAngle(cube_r108, -1.3352F, 0.0F, 0.0F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 50, 55, 1.2F, 1.3626F, -0.4936F, 0, 2, 1, 0.0F, false));
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 48, 48, 0.3F, 1.6626F, -0.9936F, 1, 2, 1, 0.004F, false));
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 20, 53, 0.0F, 3.6626F, -0.9936F, 1, 1, 1, 0.0F, false));

        this.cube_r109 = new ModelRenderer(this);
        this.cube_r109.setRotationPoint(0.0F, 1.9118F, -0.151F);
        this.head.addChild(cube_r109);
        this.setRotateAngle(cube_r109, -1.3352F, 0.0F, 0.0F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 9, 42, -1.0F, -0.0374F, -1.9936F, 2, 2, 2, 0.003F, false));

        this.cube_r110 = new ModelRenderer(this);
        this.cube_r110.setRotationPoint(0.0F, 1.2118F, 0.249F);
        this.head.addChild(cube_r110);
        this.setRotateAngle(cube_r110, -1.1781F, 0.0F, 0.0F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 45, 19, -1.0F, -1.4F, -0.5F, 2, 2, 1, 0.0F, false));

        this.cube_r111 = new ModelRenderer(this);
        this.cube_r111.setRotationPoint(0.2F, 0.6302F, -2.1973F);
        this.head.addChild(cube_r111);
        this.setRotateAngle(cube_r111, -0.8727F, 0.0F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 24, 50, -0.08F, -0.5F, -0.8F, 1, 1, 1, -0.1F, false));
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 51, 2, -0.08F, -0.5F, -0.4F, 1, 1, 1, -0.11F, false));

        this.cube_r112 = new ModelRenderer(this);
        this.cube_r112.setRotationPoint(0.4F, 2.1032F, -4.0543F);
        this.head.addChild(cube_r112);
        this.setRotateAngle(cube_r112, -0.5934F, 0.0F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 52, 20, -0.48F, 0.2382F, -0.7714F, 1, 1, 1, -0.2F, false));
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 52, 36, -0.48F, -0.2618F, -0.7714F, 1, 1, 1, -0.199F, false));

        this.cube_r113 = new ModelRenderer(this);
        this.cube_r113.setRotationPoint(0.4F, 2.5032F, -5.2543F);
        this.head.addChild(cube_r113);
        this.setRotateAngle(cube_r113, -0.8203F, 0.0F, 0.0F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 52, 41, -0.48F, -1.4122F, -0.2456F, 1, 1, 1, -0.2F, false));
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 29, 51, -0.48F, -0.8122F, -0.2456F, 1, 1, 1, -0.197F, false));

        this.cube_r114 = new ModelRenderer(this);
        this.cube_r114.setRotationPoint(0.4F, 2.6032F, -4.9543F);
        this.head.addChild(cube_r114);
        this.setRotateAngle(cube_r114, 0.3142F, 0.0F, 0.0F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 48, 52, -0.48F, -0.4F, -0.5F, 1, 1, 1, -0.21F, false));

        this.cube_r115 = new ModelRenderer(this);
        this.cube_r115.setRotationPoint(0.7F, 1.5918F, -2.5654F);
        this.head.addChild(cube_r115);
        this.setRotateAngle(cube_r115, -0.6894F, 0.0F, 0.0F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 8, 23, -0.58F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

        this.cube_r116 = new ModelRenderer(this);
        this.cube_r116.setRotationPoint(0.32F, 0.3401F, -2.0716F);
        this.head.addChild(cube_r116);
        this.setRotateAngle(cube_r116, -1.6581F, 0.0F, 0.0F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 6, 40, 0.02F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 50, 14, -0.09F, -0.5F, -0.5F, 1, 1, 1, -0.2F, false));

        this.cube_r117 = new ModelRenderer(this);
        this.cube_r117.setRotationPoint(0.2F, 0.3314F, -2.1712F);
        this.head.addChild(cube_r117);
        this.setRotateAngle(cube_r117, -1.6581F, 0.0F, 0.0F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 10, 51, -0.08F, -0.7F, -0.6F, 1, 1, 1, -0.099F, false));

        this.cube_r118 = new ModelRenderer(this);
        this.cube_r118.setRotationPoint(0.2F, 0.6029F, -0.937F);
        this.head.addChild(cube_r118);
        this.setRotateAngle(cube_r118, -1.2654F, 0.0F, 0.0F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 53, 5, -0.17F, -1.0F, 0.1F, 1, 1, 1, -0.004F, false));

        this.cube_r119 = new ModelRenderer(this);
        this.cube_r119.setRotationPoint(0.2F, 0.2044F, -0.9022F);
        this.head.addChild(cube_r119);
        this.setRotateAngle(cube_r119, -0.0873F, 0.0F, 0.0F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 50, 23, -0.17F, -0.6F, -0.5F, 1, 2, 1, 0.004F, false));

        this.cube_r120 = new ModelRenderer(this);
        this.cube_r120.setRotationPoint(0.0F, 0.4F, -0.5F);
        this.head.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.6545F, 0.0F, 0.0F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 42, 45, -1.0F, -0.9F, -0.4F, 2, 2, 1, 0.004F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.9F, 1.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.1157F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 33, 44, -1.0F, -0.0281F, -1.7268F, 2, 1, 2, -0.006F, false));

        this.cube_r121 = new ModelRenderer(this);
        this.cube_r121.setRotationPoint(0.0F, -0.5526F, -3.0192F);
        this.jaw.addChild(cube_r121);
        this.setRotateAngle(cube_r121, -0.2531F, 0.0F, 0.0F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 42, 11, -1.0F, 0.0344F, 0.0341F, 2, 1, 2, -0.003F, false));

        this.cube_r122 = new ModelRenderer(this);
        this.cube_r122.setRotationPoint(-0.73F, 0.6317F, -1.7248F);
        this.jaw.addChild(cube_r122);
        this.setRotateAngle(cube_r122, -1.9199F, 0.0F, 0.0F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 48, 38, -0.5F, -0.6F, -0.6F, 1, 2, 1, -0.2F, true));

        this.cube_r123 = new ModelRenderer(this);
        this.cube_r123.setRotationPoint(-0.73F, -0.1683F, -2.7248F);
        this.jaw.addChild(cube_r123);
        this.setRotateAngle(cube_r123, -1.6755F, 0.0F, 0.0F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 53, 50, -0.5F, -0.2133F, -0.1903F, 1, 1, 1, -0.211F, true));

        this.cube_r124 = new ModelRenderer(this);
        this.cube_r124.setRotationPoint(0.0F, -0.5526F, -5.0192F);
        this.jaw.addChild(cube_r124);
        this.setRotateAngle(cube_r124, -0.0262F, 0.0F, 0.0F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 39, 48, -0.89F, -0.318F, 0.0335F, 0, 1, 2, 0.0F, true));
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 39, 48, 0.89F, -0.318F, 0.0335F, 0, 1, 2, 0.0F, false));
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 43, 25, -1.0F, -0.018F, 0.0335F, 2, 1, 2, -0.006F, false));

        this.cube_r125 = new ModelRenderer(this);
        this.cube_r125.setRotationPoint(0.0F, 0.0474F, -5.3192F);
        this.jaw.addChild(cube_r125);
        this.setRotateAngle(cube_r125, 0.3054F, 0.0F, 0.0F);
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 53, 47, -0.8F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 32, 56, -0.77F, -1.1F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 32, 56, 0.77F, -1.1F, -0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 53, 47, -0.2F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r126 = new ModelRenderer(this);
        this.cube_r126.setRotationPoint(0.0F, 0.5719F, -4.6268F);
        this.jaw.addChild(cube_r126);
        this.setRotateAngle(cube_r126, 0.0436F, 0.0F, 0.0F);
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 47, 33, -1.0F, -1.0542F, -0.6689F, 2, 1, 1, 0.0F, false));

        this.cube_r127 = new ModelRenderer(this);
        this.cube_r127.setRotationPoint(0.0F, 0.5719F, -3.6268F);
        this.jaw.addChild(cube_r127);
        this.setRotateAngle(cube_r127, -0.2094F, 0.0F, 0.0F);
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 44, 5, -1.0F, -0.9462F, -1.0471F, 2, 1, 2, 0.006F, false));

        this.cube_r128 = new ModelRenderer(this);
        this.cube_r128.setRotationPoint(0.0F, 0.8719F, -2.7268F);
        this.jaw.addChild(cube_r128);
        this.setRotateAngle(cube_r128, -0.2967F, 0.0F, 0.0F);
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 7, 47, -1.0F, -0.97F, -0.9955F, 2, 1, 1, 0.0F, false));

        this.cube_r129 = new ModelRenderer(this);
        this.cube_r129.setRotationPoint(0.73F, -0.1683F, -2.7248F);
        this.jaw.addChild(cube_r129);
        this.setRotateAngle(cube_r129, -1.6755F, 0.0F, 0.0F);
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 53, 50, -0.5F, -0.2133F, -0.1903F, 1, 1, 1, -0.211F, false));

        this.cube_r130 = new ModelRenderer(this);
        this.cube_r130.setRotationPoint(0.73F, 0.6317F, -1.7248F);
        this.jaw.addChild(cube_r130);
        this.setRotateAngle(cube_r130, -1.9199F, 0.0F, 0.0F);
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 48, 38, -0.5F, -0.6F, -0.6F, 1, 2, 1, -0.2F, false));

        this.cube_r131 = new ModelRenderer(this);
        this.cube_r131.setRotationPoint(0.0F, 0.9719F, -1.7268F);
        this.jaw.addChild(cube_r131);
        this.setRotateAngle(cube_r131, -0.0698F, 0.0F, 0.0F);
        this.cube_r131.cubeList.add(new ModelBox(cube_r131, 45, 0, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.004F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.6F, 3.4F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.3057F, -0.0416F, 0.0131F);
        this.tail.cubeList.add(new ModelBox(tail, 31, 9, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.004F, false));
        this.tail.cubeList.add(new ModelBox(tail, 26, 56, 0.0F, -1.5F, 0.0F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 23, 56, 0.0F, -1.5F, 2.0F, 0, 1, 1, 0.0F, false));

        this.cube_r132 = new ModelRenderer(this);
        this.cube_r132.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.tail.addChild(cube_r132);
        this.setRotateAngle(cube_r132, 0.576F, 0.0F, 0.0F);
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 0, 7, 0.0F, 1.1F, 2.0F, 0, 2, 1, 0.0F, false));
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 15, 7, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r133 = new ModelRenderer(this);
        this.cube_r133.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.tail.addChild(cube_r133);
        this.setRotateAngle(cube_r133, -0.1047F, 0.0F, 0.0F);
        this.cube_r133.cubeList.add(new ModelBox(cube_r133, 0, 28, -0.5F, 0.0F, 0.2F, 1, 1, 4, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.5F, 4.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1986F, -0.2569F, 0.0511F);
        this.tail2.cubeList.add(new ModelBox(tail2, 8, 23, -0.5F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 21, -0.5F, -1.1F, 0.0F, 1, 1, 5, 0.004F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 56, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 56, 10, 0.0F, -1.0F, 2.0F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 9, 56, 0.0F, -0.7F, 4.0F, 0, 1, 1, 0.0F, false));

        this.cube_r134 = new ModelRenderer(this);
        this.cube_r134.setRotationPoint(0.0F, 1.1F, -4.0F);
        this.tail2.addChild(cube_r134);
        this.setRotateAngle(cube_r134, 0.576F, 0.0F, 0.0F);
        this.cube_r134.cubeList.add(new ModelBox(cube_r134, 55, 23, 0.0F, 4.1F, 6.0F, 0, 1, 1, 0.0F, false));
        this.cube_r134.cubeList.add(new ModelBox(cube_r134, 0, 0, 0.0F, 2.1F, 4.0F, 0, 2, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2706F, -0.2527F, -0.0692F);
        this.tail3.cubeList.add(new ModelBox(tail3, 7, 30, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.004F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 27, 17, -0.5F, -2.1F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 6, 56, 0.0F, -1.6F, 1.0F, 0, 1, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 3, 56, 0.0F, -1.6F, 3.0F, 0, 1, 1, 0.0F, false));

        this.cube_r135 = new ModelRenderer(this);
        this.cube_r135.setRotationPoint(0.0F, 0.1F, -9.0F);
        this.tail3.addChild(cube_r135);
        this.setRotateAngle(cube_r135, 0.576F, 0.0F, 0.0F);
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 35, 30, 0.0F, 6.3F, 10.0F, 0, 1, 1, 0.0F, false));
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 0, 40, 0.0F, 5.4F, 8.0F, 0, 1, 1, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2568F, -0.1689F, -0.0441F);
        this.tail4.cubeList.add(new ModelBox(tail4, 30, 3, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 56, 1, 0.0F, -1.3F, 1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r136 = new ModelRenderer(this);
        this.cube_r136.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.tail4.addChild(cube_r136);
        this.setRotateAngle(cube_r136, -0.1047F, 0.0F, 0.0F);
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 21, 25, -0.5F, -0.3F, 0.2F, 1, 1, 4, 0.004F, false));

        this.cube_r137 = new ModelRenderer(this);
        this.cube_r137.setRotationPoint(0.0F, 0.1F, -13.0F);
        this.tail4.addChild(cube_r137);
        this.setRotateAngle(cube_r137, 0.576F, 0.0F, 0.0F);
        this.cube_r137.cubeList.add(new ModelBox(cube_r137, 27, 7, 0.0F, 7.4F, 12.0F, 0, 1, 1, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.318F, 0.1347F, -0.03F);
        this.tail5.cubeList.add(new ModelBox(tail5, 13, 7, -0.5F, -1.0F, 0.0F, 1, 1, 6, 0.004F, false));

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
