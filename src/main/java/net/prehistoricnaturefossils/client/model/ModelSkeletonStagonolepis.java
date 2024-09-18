package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonStagonolepis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Stagonolepis;
    private final ModelRenderer body3;
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
    private final ModelRenderer tail;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer leftBackLeg;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer leftBjoint;
    private final ModelRenderer cube_r34;
    private final ModelRenderer leftBfoot;
    private final ModelRenderer cube_r35;
    private final ModelRenderer rightBackLeg;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer rightBjoint;
    private final ModelRenderer cube_r39;
    private final ModelRenderer rightBfoot;
    private final ModelRenderer cube_r40;
    private final ModelRenderer body2;
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
    private final ModelRenderer body;
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
    private final ModelRenderer cube_r87;
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
    private final ModelRenderer leftFrontLeg;
    private final ModelRenderer cube_r104;
    private final ModelRenderer LeftFjoint;
    private final ModelRenderer cube_r105;
    private final ModelRenderer LeftFFoot;
    private final ModelRenderer cube_r106;
    private final ModelRenderer rightFrontLeg;
    private final ModelRenderer cube_r107;
    private final ModelRenderer RightFjoint;
    private final ModelRenderer cube_r108;
    private final ModelRenderer RightFFoot;
    private final ModelRenderer cube_r109;
    private final ModelRenderer neck;
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
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r122;
    private final ModelRenderer cube_r123;
    private final ModelRenderer cube_r124;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r125;
    private final ModelRenderer cube_r126;
    private final ModelRenderer cube_r127;
    private final ModelRenderer head;
    private final ModelRenderer cube_r128;
    private final ModelRenderer cube_r129;
    private final ModelRenderer cube_r130;
    private final ModelRenderer cube_r131;
    private final ModelRenderer cube_r132;
    private final ModelRenderer cube_r133;
    private final ModelRenderer cube_r134;
    private final ModelRenderer cube_r135;
    private final ModelRenderer cube_r136;
    private final ModelRenderer cube_r137;
    private final ModelRenderer cube_r138;
    private final ModelRenderer cube_r139;
    private final ModelRenderer cube_r140;
    private final ModelRenderer cube_r141;
    private final ModelRenderer cube_r142;
    private final ModelRenderer cube_r143;
    private final ModelRenderer cube_r144;
    private final ModelRenderer cube_r145;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r146;
    private final ModelRenderer cube_r147;
    private final ModelRenderer cube_r148;
    private final ModelRenderer cube_r149;
    private final ModelRenderer cube_r150;

    public ModelSkeletonStagonolepis() {
        this.textureWidth = 87;
        this.textureHeight = 87;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Stagonolepis = new ModelRenderer(this);
        this.Stagonolepis.setRotationPoint(-0.5F, -5.325F, 5.0F);
        this.fossil.addChild(Stagonolepis);


        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -7.0335F, 0.4753F);
        this.Stagonolepis.addChild(body3);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.3524F, -0.7172F);
        this.body3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0175F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 0, 0.0F, -2.9F, 4.9F, 0, 3, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 65, 80, 0.0F, -3.0F, 2.9F, 0, 3, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 74, 82, 0.0F, -2.8F, 0.9F, 0, 2, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 30, -1.5F, -0.8F, 0.2F, 1, 1, 3, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 26, -2.5F, -1.6F, 0.9F, 1, 1, 4, 0.007F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 26, 1.5F, -1.6F, 0.9F, 1, 1, 4, 0.007F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 30, 0.5F, -0.8F, 0.2F, 1, 1, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 65, -0.5F, -0.8F, -0.1F, 1, 1, 6, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -2.8524F, -0.7172F);
        this.body3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 0, -4.5F, -0.3004F, -0.3436F, 9, 3, 6, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, 2.9476F, 2.0828F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.576F, 0.5672F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 18, 0.0F, -0.947F, -0.1141F, 1, 1, 3, 0.004F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 2.9476F, 2.0828F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.5672F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 26, 0.0F, -0.1021F, -0.0119F, 1, 1, 3, 0.0F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0F, 2.3476F, -1.6172F);
        this.body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0314F, 0.0153F, -0.4535F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 65, 0.0F, 0.0082F, -0.2763F, 1, 4, 1, 0.0F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.6476F, -1.2172F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6807F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 52, -2.5F, -3.1434F, -0.0207F, 1, 3, 1, 0.0F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 3.5476F, 2.6828F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3665F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 39, -2.5F, -1.4532F, -4.7009F, 1, 2, 4, -0.004F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.1476F, 2.1828F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1396F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 7, 73, -2.5F, -0.5167F, -1.979F, 1, 3, 2, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 7, 73, 1.5F, -0.5167F, -1.979F, 1, 3, 2, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -0.9524F, 0.0828F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5236F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 30, -2.5F, -1.4141F, 0.3897F, 1, 4, 2, 0.004F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 30, 1.5F, -1.4141F, 0.3897F, 1, 4, 2, 0.004F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -2.2524F, 3.1828F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0524F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 54, -2.5F, -0.0366F, -1.9843F, 1, 1, 2, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 54, 1.5F, -0.0366F, -1.9843F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -2.2524F, 1.1828F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2094F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 54, -2.5F, 0.0681F, -2.987F, 1, 1, 3, -0.004F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 54, 1.5F, 0.0681F, -2.987F, 1, 1, 3, -0.004F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -1.9524F, 4.1828F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2443F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 66, 25, -2.5F, -0.0858F, -1.0272F, 1, 1, 1, -0.004F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 66, 25, 1.5F, -0.0858F, -1.0272F, 1, 1, 1, -0.004F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 0.6476F, -1.2172F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6807F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 52, 1.5F, -3.1434F, -0.0207F, 1, 3, 1, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(3.0F, 2.3476F, -1.6172F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0314F, -0.0153F, 0.4535F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 65, -1.0F, 0.0082F, -0.2763F, 1, 4, 1, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(3.0F, 2.9476F, 2.0828F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.576F, -0.5672F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 18, -1.0F, -0.947F, -0.1141F, 1, 1, 3, 0.004F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(3.0F, 2.9476F, 2.0828F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2618F, -0.5672F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 26, -1.0F, -0.1021F, -0.0119F, 1, 1, 3, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 3.5476F, 2.6828F);
        this.body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3665F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 39, 1.5F, -1.4532F, -4.7009F, 1, 2, 4, -0.004F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5524F, 5.1828F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.0277F, -0.0011F, -0.0114F);
        this.tail.cubeList.add(new ModelBox(tail, 54, 25, 0.0F, -0.6507F, -0.0746F, 1, 1, 9, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 57, 80, 0.5F, -2.7507F, 0.9254F, 0, 3, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 80, 54, 0.5F, -2.8507F, 2.9254F, 0, 3, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 59, 25, 0.5F, -2.8507F, 4.9254F, 0, 3, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 44, 54, 0.5F, -2.7507F, 6.9254F, 0, 3, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 0.2493F, 6.4254F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.5498F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 65, 0.0F, 0.122F, -0.1864F, 0, 2, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 0.2493F, 1.4254F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.7418F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 17, 65, 0.0F, 1.9F, 1.5F, 0, 2, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 69, 48, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 2.4493F, 7.8254F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2094F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 25, 18, -3.5F, -2.8561F, -6.893F, 7, 3, 8, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -2.9507F, -0.3746F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0175F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 14, -3.5F, 0.0F, 0.0F, 7, 2, 9, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, -0.5007F, 9.0254F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0896F, 0.0869F, -0.0078F);
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 54, -0.5F, -0.0142F, -0.151F, 1, 1, 9, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 71, 82, 0.0F, -2.0142F, -0.151F, 0, 2, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 82, 63, 0.0F, -1.8142F, 1.849F, 0, 2, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 60, 82, 0.0F, -1.7142F, 3.849F, 0, 2, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 82, 0.0F, -1.6142F, 5.849F, 0, 2, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 41, 82, 0.0F, -1.4142F, 7.849F, 0, 2, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 2.1858F, 8.049F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1047F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 26, -2.5F, -2.8896F, -8.979F, 5, 3, 9, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -2.1142F, -0.551F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0698F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 20, 30, -2.5F, -0.1F, -0.1F, 5, 3, 9, 0.005F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.75F, -2.6F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.5498F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 39, 0.0F, 4.522F, 7.8136F, 0, 2, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 7, 39, 0.0F, 3.622F, 5.8136F, 0, 2, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 54, 36, 0.0F, 2.322F, 3.8136F, 0, 2, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 53, 58, 0.0F, 1.022F, 1.8136F, 0, 2, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2858F, 8.849F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0177F, 0.2618F, 0.0046F);
        this.tail3.cubeList.add(new ModelBox(tail3, 65, 59, -0.5F, -0.25F, 0.0F, 1, 1, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 38, 82, 0.0F, -1.55F, 1.0F, 0, 2, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 23, 82, 0.0F, -1.45F, 3.0F, 0, 2, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 20, 30, 0.0F, -1.25F, 5.0F, 0, 1, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.05F, 6.4F);
        this.tail3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1222F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 58, -1.5F, -2.0297F, -7.2422F, 3, 2, 7, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -1.85F, -0.6F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0524F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 58, 38, -1.5F, 0.0F, 0.0F, 3, 2, 7, 0.005F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.4642F, -11.449F);
        this.tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.5498F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 7, 5, 0.0F, 8.222F, 13.8136F, 0, 1, 1, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 18, 0.0F, 7.222F, 11.8136F, 0, 1, 1, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 26, 0.0F, 6.322F, 9.8136F, 0, 1, 1, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1F, 7.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1578F, 0.3019F, 0.0473F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 39, -0.5F, -0.3506F, -0.1391F, 1, 1, 11, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 30, 18, 0.0F, -1.1506F, -0.1391F, 0, 1, 1, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 27, 0, 0.0F, -0.8506F, 1.8609F, 0, 1, 1, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 6, 26, 0.0F, -0.5506F, 3.8609F, 0, 1, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.8494F, -1.1391F);
        this.tail4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0175F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 25, 2, -1.0F, -0.9774F, -0.0015F, 2, 1, 12, -0.004F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.5506F, -0.5391F);
        this.tail4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0524F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 14, 43, -1.0F, -0.3945F, -0.1045F, 2, 1, 5, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -1.5506F, -0.5391F);
        this.tail4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1047F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 38, 32, -1.0F, -0.1F, 0.0F, 2, 1, 11, 0.005F, false));

        this.leftBackLeg = new ModelRenderer(this);
        this.leftBackLeg.setRotationPoint(3.65F, 0.4976F, 0.9828F);
        this.body3.addChild(leftBackLeg);
        this.setRotateAngle(leftBackLeg, -0.1745F, 0.0F, 0.0F);


        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(2.4301F, 5.8599F, 1.5379F);
        this.leftBackLeg.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.4841F, 0.0905F, -0.2921F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 28, 76, -1.0F, -1.7F, -0.5F, 1, 2, 2, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(1.6251F, 3.3191F, 1.1063F);
        this.leftBackLeg.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1612F, 0.0905F, -0.2921F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 73, -1.0F, -1.8F, -1.0F, 1, 3, 2, 0.005F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.723F, 0.5903F, 0.2459F);
        this.leftBackLeg.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.4666F, 0.0905F, -0.2921F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 21, 73, -1.0F, -1.5F, -1.0F, 1, 3, 2, 0.0F, false));

        this.leftBjoint = new ModelRenderer(this);
        this.leftBjoint.setRotationPoint(1.0F, 6.3861F, 1.7445F);
        this.leftBackLeg.addChild(leftBjoint);
        this.setRotateAngle(leftBjoint, 0.6981F, 0.0F, 0.0F);


        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.25F, 4.3864F, 1.9502F);
        this.leftBjoint.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.2182F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 60, 75, 0.8F, -4.5F, -1.1F, 1, 5, 1, -0.15F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 14, -0.5F, -4.5F, -1.5F, 1, 5, 2, 0.0F, false));

        this.leftBfoot = new ModelRenderer(this);
        this.leftBfoot.setRotationPoint(0.25F, 5.1775F, 1.634F);
        this.leftBjoint.addChild(leftBfoot);
        this.setRotateAngle(leftBfoot, -0.6535F, -0.0118F, 0.0063F);


        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 1.5398F, -1.1724F);
        this.leftBfoot.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3054F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 66, 25, -1.5F, -1.5F, -3.0F, 4, 1, 6, 0.0F, false));

        this.rightBackLeg = new ModelRenderer(this);
        this.rightBackLeg.setRotationPoint(-2.65F, 0.4976F, 0.9828F);
        this.body3.addChild(rightBackLeg);
        this.setRotateAngle(rightBackLeg, -0.6109F, 0.0F, 0.0F);


        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-2.4301F, 5.8599F, 1.5379F);
        this.rightBackLeg.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.4841F, -0.0905F, 0.2921F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 65, 75, 0.0F, -1.7F, -0.5F, 1, 2, 2, 0.0F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.6251F, 3.3191F, 1.1063F);
        this.rightBackLeg.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1612F, -0.0905F, 0.2921F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 39, 68, 0.0F, -1.8F, -1.0F, 1, 3, 2, 0.005F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.723F, 0.5903F, 0.2459F);
        this.rightBackLeg.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.4666F, -0.0905F, 0.2921F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 72, 38, 0.0F, -1.5F, -1.0F, 1, 3, 2, 0.0F, false));

        this.rightBjoint = new ModelRenderer(this);
        this.rightBjoint.setRotationPoint(-1.0F, 6.3861F, 1.7445F);
        this.rightBackLeg.addChild(rightBjoint);
        this.setRotateAngle(rightBjoint, 0.6981F, 0.0F, 0.0F);


        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.25F, 4.3864F, 1.9502F);
        this.rightBjoint.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.2182F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 75, 54, -1.8F, -4.5F, -1.1F, 1, 5, 1, -0.15F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 0, -0.5F, -4.5F, -1.5F, 1, 5, 2, 0.0F, false));

        this.rightBfoot = new ModelRenderer(this);
        this.rightBfoot.setRotationPoint(-0.25F, 5.1775F, 1.634F);
        this.rightBjoint.addChild(rightBfoot);
        this.setRotateAngle(rightBfoot, -0.2618F, 0.0F, 0.0F);


        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 1.5398F, -1.1724F);
        this.rightBfoot.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3054F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 51, 58, -2.5F, -1.5F, -3.0F, 4, 1, 6, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.8702F, -0.921F);
        this.body3.addChild(body2);
        this.setRotateAngle(body2, 0.0968F, 0.1303F, 0.0126F);


        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, -0.1146F, -4.8435F);
        this.body2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0611F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 82, 75, 0.0F, -2.2139F, 3.9295F, 0, 2, 1, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 77, 82, 0.0F, -2.2139F, 1.9295F, 0, 2, 1, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 80, 82, 0.0F, -2.1139F, -0.0705F, 0, 2, 1, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 69, 6, -0.5F, -0.4139F, -0.0705F, 1, 1, 5, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.0552F, -2.339F);
        this.body2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0389F, -0.035F, -1.0291F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 44, 68, -2.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0552F, -2.339F);
        this.body2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0512F, -0.0109F, -0.5059F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 80, 59, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -0.0448F, -4.339F);
        this.body2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0234F, 0.0841F, -1.404F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 80, 61, -3.1485F, -1.9616F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -0.0448F, -4.339F);
        this.body2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0649F, 0.0584F, -0.8359F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 73, 13, -2.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, -0.0448F, -4.339F);
        this.body2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0854F, 0.0181F, -0.3134F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 81, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(1.0F, 0.0552F, -2.339F);
        this.body2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.0512F, 0.0109F, 0.5059F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 80, 59, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(1.0F, 0.0552F, -2.339F);
        this.body2.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0389F, 0.035F, 1.0291F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 44, 68, 0.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(1.0F, -0.0448F, -4.339F);
        this.body2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0854F, -0.0181F, 0.3134F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 81, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(1.0F, -0.0448F, -4.339F);
        this.body2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0649F, -0.0584F, 0.8359F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 73, 13, 0.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(1.0F, -0.0448F, -4.339F);
        this.body2.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0234F, -0.0841F, 1.404F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 80, 61, 2.1485F, -1.9616F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5F, 7.4854F, -6.0435F);
        this.body2.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.1134F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 48, 16, -4.0F, -2.8283F, 0.0652F, 8, 3, 5, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.5F, -2.2146F, -4.8435F);
        this.body2.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.0087F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 47, 49, -4.0F, -0.1178F, 0.0577F, 8, 3, 5, 0.005F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.5F, 7.0854F, -4.7435F);
        this.body2.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.096F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 67, 0, -2.5F, -1.9944F, -0.0098F, 5, 2, 3, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.5F, -0.0568F, -4.8612F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.0175F, 0.0436F, 0.0008F);


        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, 6.712F, -8.2778F);
        this.body.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.1309F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 65, -3.0F, -2.9222F, -1.8623F, 6, 3, 4, 0.0F, false));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 25, 45, -4.0F, -2.9222F, 2.1377F, 8, 3, 5, 0.005F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, -1.288F, -9.7778F);
        this.body.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0873F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 0, -4.0F, -0.1208F, -0.0801F, 8, 3, 10, 0.0F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, -0.388F, -4.7778F);
        this.body.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0873F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 30, 81, 0.0F, -1.5F, -1.2F, 0, 2, 1, 0.0F, false));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 68, 81, 0.0F, -1.4F, -3.2F, 0, 2, 1, 0.0F, false));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 20, 82, 0.0F, -1.3F, -5.2F, 0, 2, 1, 0.0F, false));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 30, 68, -0.5F, -0.1F, -6.2F, 1, 1, 6, 0.0F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-3.5F, 3.359F, -10.9145F);
        this.body.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 1.1768F, -0.3942F, -0.4634F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 14, 73, 0.0F, -1.6938F, -2.0194F, 1, 3, 2, 0.0F, true));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(-3.0F, 3.3633F, -10.8702F);
        this.body.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 1.6057F, 0.0F, 0.2269F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 71, 68, -0.5F, -0.2183F, 0.5433F, 1, 1, 3, -0.005F, true));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(-3.0F, 3.3633F, -10.8702F);
        this.body.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -1.3614F, 0.0F, 0.2269F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 43, 1, -0.5F, -3.542F, -2.7853F, 1, 3, 1, 0.0F, true));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(-3.0F, 3.3633F, -10.8702F);
        this.body.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.384F, 0.0F, 0.2269F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 66, 28, -0.5F, -4.2748F, 0.3071F, 1, 1, 1, -0.004F, true));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(-3.0F, 3.3633F, -10.8702F);
        this.body.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.1222F, 0.0F, 0.2269F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 28, 59, -0.5F, -3.5614F, 0.3201F, 1, 1, 2, 0.008F, true));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(-3.0F, 3.3633F, -10.8702F);
        this.body.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.6109F, 0.0F, 0.2269F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 75, 21, -0.5F, -1.4833F, 2.0028F, 1, 1, 2, -0.004F, true));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(-3.0F, 3.3633F, -10.8702F);
        this.body.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 1.1345F, 0.0F, 0.2269F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 54, 36, -0.5F, -0.4357F, -0.0343F, 1, 1, 4, 0.005F, true));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(-0.5F, 0.412F, -9.4778F);
        this.body.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.1471F, 0.4861F, -1.3336F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 24, 43, -6.1485F, -1.9616F, -0.5F, 4, 0, 1, 0.0F, true));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.5F, 0.412F, -9.4778F);
        this.body.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.3907F, 0.3304F, -0.7369F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 54, 32, -2.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.5F, 0.412F, -9.4778F);
        this.body.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.4968F, 0.101F, -0.2536F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 34, 54, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(-0.5F, 0.212F, -7.4778F);
        this.body.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.124F, 0.4194F, -1.3088F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 24, 16, -7.1485F, -1.9616F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.5F, 0.212F, -7.4778F);
        this.body.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.3336F, 0.2867F, -0.7194F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 45, 30, -2.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(-0.5F, 0.212F, -7.4778F);
        this.body.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.4279F, 0.088F, -0.2252F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 14, 46, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(-0.5F, 0.112F, -5.4778F);
        this.body.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.3592F, 0.0746F, -0.1959F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 40, 76, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(-0.5F, 0.112F, -5.4778F);
        this.body.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.2779F, 0.2422F, -0.699F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 61, 36, -2.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(-0.5F, 0.112F, -5.4778F);
        this.body.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.1022F, 0.3526F, -1.282F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 0, 46, -6.1485F, -1.9616F, -0.5F, 4, 0, 1, 0.0F, true));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(-0.5F, 0.012F, -1.4778F);
        this.body.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.1708F, 0.0361F, -0.2762F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 81, 17, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(-0.5F, 0.012F, -1.4778F);
        this.body.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.1303F, 0.1165F, -0.7952F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 77, 38, -2.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(-0.5F, 0.012F, -1.4778F);
        this.body.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0471F, 0.1681F, -1.3661F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 78, 43, -4.1485F, -1.9616F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(-0.5F, 0.012F, -3.4778F);
        this.body.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.0715F, 0.2521F, -1.2912F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 0, 8, -5.1485F, -1.9616F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(-0.5F, 0.012F, -3.4778F);
        this.body.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.1966F, 0.1741F, -0.7158F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 78, 50, -2.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(-0.5F, 0.012F, -3.4778F);
        this.body.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.2563F, 0.0538F, -0.2025F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 81, 24, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(3.0F, 3.3633F, -10.8702F);
        this.body.addChild(cube_r80);
        this.setRotateAngle(cube_r80, -1.3614F, 0.0F, -0.2269F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 43, 1, -0.5F, -3.542F, -2.7853F, 1, 3, 1, 0.0F, false));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(3.0F, 3.3633F, -10.8702F);
        this.body.addChild(cube_r81);
        this.setRotateAngle(cube_r81, -0.384F, 0.0F, -0.2269F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 66, 28, -0.5F, -4.2748F, 0.3071F, 1, 1, 1, -0.004F, false));

        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(3.0F, 3.3633F, -10.8702F);
        this.body.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 1.6057F, 0.0F, -0.2269F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 71, 68, -0.5F, -0.2183F, 0.5433F, 1, 1, 3, -0.005F, false));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(3.0F, 3.3633F, -10.8702F);
        this.body.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.1222F, 0.0F, -0.2269F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 28, 59, -0.5F, -3.5614F, 0.3201F, 1, 1, 2, 0.008F, false));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(3.0F, 3.3633F, -10.8702F);
        this.body.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.6109F, 0.0F, -0.2269F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 75, 21, -0.5F, -1.4833F, 2.0028F, 1, 1, 2, -0.004F, false));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(3.5F, 3.359F, -10.9145F);
        this.body.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 1.1768F, 0.3942F, 0.4634F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 14, 73, -1.0F, -1.6938F, -2.0194F, 1, 3, 2, 0.0F, false));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(3.0F, 3.3633F, -10.8702F);
        this.body.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 1.1345F, 0.0F, -0.2269F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 54, 36, -0.5F, -0.4357F, -0.0343F, 1, 1, 4, 0.005F, false));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(0.0F, 7.212F, -4.9778F);
        this.body.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.1396F, 0.0F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 54, 10, -2.5F, -1.0536F, -4.0384F, 5, 1, 4, 0.0F, false));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(0.0F, 0.112F, 0.1222F);
        this.body.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.0F, 0.0F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 81, 26, 0.0F, -2.2F, -2.1F, 0, 2, 1, 0.0F, false));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 27, 81, 0.0F, -2.1F, -4.1F, 0, 2, 1, 0.0F, false));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 0, 52, -3.5F, 5.1F, -5.1F, 7, 2, 5, 0.0F, false));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 63, 68, -0.5F, -0.6F, -5.1F, 1, 1, 5, 0.0F, false));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(0.5F, 0.012F, -1.4778F);
        this.body.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.0471F, -0.1681F, 1.3661F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 78, 43, 2.1485F, -1.9616F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(0.5F, 0.012F, -1.4778F);
        this.body.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.1303F, -0.1165F, 0.7952F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 77, 38, 0.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(0.5F, 0.012F, -1.4778F);
        this.body.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.1708F, -0.0361F, 0.2762F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 81, 17, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(0.5F, 0.412F, -9.4778F);
        this.body.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.4968F, -0.101F, 0.2536F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 34, 54, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(0.5F, 0.412F, -9.4778F);
        this.body.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.3907F, -0.3304F, 0.7369F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 54, 32, 0.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(0.5F, 0.412F, -9.4778F);
        this.body.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.1471F, -0.4861F, 1.3336F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 24, 43, 2.1485F, -1.9616F, -0.5F, 4, 0, 1, 0.0F, false));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(0.5F, 0.212F, -7.4778F);
        this.body.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.4279F, -0.088F, 0.2252F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 14, 46, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(0.5F, 0.212F, -7.4778F);
        this.body.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.3336F, -0.2867F, 0.7194F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 45, 30, 0.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(0.5F, 0.212F, -7.4778F);
        this.body.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.124F, -0.4194F, 1.3088F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 24, 16, 2.1485F, -1.9616F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(0.5F, 0.112F, -5.4778F);
        this.body.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.1022F, -0.3526F, 1.282F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 0, 46, 2.1485F, -1.9616F, -0.5F, 4, 0, 1, 0.0F, false));

        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(0.5F, 0.112F, -5.4778F);
        this.body.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.2779F, -0.2422F, 0.699F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 61, 36, 0.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(0.5F, 0.112F, -5.4778F);
        this.body.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.3592F, -0.0746F, 0.1959F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 40, 76, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(0.5F, 0.012F, -3.4778F);
        this.body.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.0715F, -0.2521F, 1.2912F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 0, 8, 2.1485F, -1.9616F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(0.5F, 0.012F, -3.4778F);
        this.body.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.1966F, -0.1741F, 0.7158F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 78, 50, 0.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r103 = new ModelRenderer(this);
        this.cube_r103.setRotationPoint(0.5F, 0.012F, -3.4778F);
        this.body.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.2563F, -0.0538F, 0.2025F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 81, 24, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.leftFrontLeg = new ModelRenderer(this);
        this.leftFrontLeg.setRotationPoint(4.0F, 5.1771F, -10.6219F);
        this.body.addChild(leftFrontLeg);
        this.setRotateAngle(leftFrontLeg, -0.6184F, 0.3044F, -0.2201F);


        this.cube_r104 = new ModelRenderer(this);
        this.cube_r104.setRotationPoint(-0.4059F, -0.7694F, -0.4768F);
        this.leftFrontLeg.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 1.1862F, 0.0981F, 0.1095F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 75, 61, -0.326F, 0.1969F, -1.0649F, 1, 2, 2, 0.0F, false));
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 0, 52, -0.326F, 2.1969F, -0.3649F, 1, 3, 1, 0.0F, false));

        this.LeftFjoint = new ModelRenderer(this);
        this.LeftFjoint.setRotationPoint(0.6518F, 1.0023F, 4.5709F);
        this.leftFrontLeg.addChild(LeftFjoint);
        this.setRotateAngle(LeftFjoint, 0.603F, 0.1607F, 0.2841F);


        this.cube_r105 = new ModelRenderer(this);
        this.cube_r105.setRotationPoint(-0.0892F, -2.5467F, -0.1933F);
        this.LeftFjoint.addChild(cube_r105);
        this.setRotateAngle(cube_r105, -0.2182F, 0.0F, 0.0F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 50, 73, -1.0F, 2.5F, -0.2F, 1, 5, 1, -0.1F, false));
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 55, 73, -1.0F, 2.0F, 0.9F, 1, 5, 1, 0.0F, false));

        this.LeftFFoot = new ModelRenderer(this);
        this.LeftFFoot.setRotationPoint(-1.0892F, 4.6576F, -0.2639F);
        this.LeftFjoint.addChild(LeftFFoot);
        this.setRotateAngle(LeftFFoot, 0.3766F, -0.52F, 0.0503F);


        this.cube_r106 = new ModelRenderer(this);
        this.cube_r106.setRotationPoint(-0.3955F, -1.2658F, -0.2774F);
        this.LeftFFoot.addChild(cube_r106);
        this.setRotateAngle(cube_r106, -0.4363F, 0.0F, 0.0F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 69, 48, -0.5F, 0.7828F, -2.8345F, 2, 1, 4, -0.01F, false));

        this.rightFrontLeg = new ModelRenderer(this);
        this.rightFrontLeg.setRotationPoint(-4.0F, 5.1771F, -10.6219F);
        this.body.addChild(rightFrontLeg);
        this.setRotateAngle(rightFrontLeg, -1.6656F, -0.3044F, 0.2201F);


        this.cube_r107 = new ModelRenderer(this);
        this.cube_r107.setRotationPoint(0.4059F, -0.7694F, -0.4768F);
        this.rightFrontLeg.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 1.1862F, -0.0981F, -0.1095F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 74, 73, -0.674F, 0.1969F, -1.0649F, 1, 2, 2, 0.0F, false));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 48, 16, -0.674F, 2.1969F, -0.3649F, 1, 3, 1, 0.0F, false));

        this.RightFjoint = new ModelRenderer(this);
        this.RightFjoint.setRotationPoint(-0.6518F, 1.0023F, 4.5709F);
        this.rightFrontLeg.addChild(RightFjoint);
        this.setRotateAngle(RightFjoint, 0.8212F, -0.1607F, -0.2841F);


        this.cube_r108 = new ModelRenderer(this);
        this.cube_r108.setRotationPoint(0.0892F, -2.5467F, -0.1933F);
        this.RightFjoint.addChild(cube_r108);
        this.setRotateAngle(cube_r108, -0.2182F, 0.0F, 0.0F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 14, 39, 0.0F, 2.5F, -0.2F, 1, 5, 1, -0.1F, false));
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 45, 73, 0.0F, 2.0F, 0.9F, 1, 5, 1, 0.0F, false));

        this.RightFFoot = new ModelRenderer(this);
        this.RightFFoot.setRotationPoint(1.0892F, 4.6576F, -0.2639F);
        this.RightFjoint.addChild(RightFFoot);
        this.setRotateAngle(RightFFoot, 1.2802F, 0.5622F, 0.0944F);


        this.cube_r109 = new ModelRenderer(this);
        this.cube_r109.setRotationPoint(0.3955F, -1.2658F, -0.2774F);
        this.RightFFoot.addChild(cube_r109);
        this.setRotateAngle(cube_r109, -0.4363F, 0.0F, 0.0F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 44, 58, -1.5F, 0.7828F, -2.8345F, 2, 1, 4, -0.01F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.612F, -10.8778F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.0095F, 0.1743F, -0.0092F);
        this.neck.cubeList.add(new ModelBox(neck, 72, 33, -0.5F, -0.5548F, -3.0062F, 1, 1, 3, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 28, 54, 0.0F, -1.3548F, -3.0062F, 0, 1, 1, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 26, 30, 0.0F, -1.5548F, -1.0062F, 0, 1, 1, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 0, 0, 0.0F, -1.0548F, -5.0162F, 0, 1, 0, 0.0F, false));

        this.cube_r110 = new ModelRenderer(this);
        this.cube_r110.setRotationPoint(0.0F, -1.5548F, -3.0062F);
        this.neck.addChild(cube_r110);
        this.setRotateAngle(cube_r110, -0.1309F, 0.0F, 0.0F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 0, 60, -2.0F, -0.0548F, -2.0223F, 4, 1, 3, 0.0F, false));
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 42, 10, -1.5F, -0.0548F, -4.0223F, 3, 1, 2, 0.0F, false));

        this.cube_r111 = new ModelRenderer(this);
        this.cube_r111.setRotationPoint(0.0F, -1.5548F, 1.0938F);
        this.neck.addChild(cube_r111);
        this.setRotateAngle(cube_r111, 0.096F, 0.0F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 47, 66, -3.0F, -0.4478F, -4.1034F, 6, 2, 4, 0.007F, false));

        this.cube_r112 = new ModelRenderer(this);
        this.cube_r112.setRotationPoint(-0.5F, 0.0F, -2.6F);
        this.neck.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 0.6915F, 0.5273F, -0.6465F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 47, 48, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r113 = new ModelRenderer(this);
        this.cube_r113.setRotationPoint(-0.5F, 0.0F, -2.6F);
        this.neck.addChild(cube_r113);
        this.setRotateAngle(cube_r113, 0.3268F, 0.7914F, -1.2265F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 33, 0, -4.866F, -0.5F, -0.5F, 4, 0, 1, 0.0F, true));

        this.cube_r114 = new ModelRenderer(this);
        this.cube_r114.setRotationPoint(-0.5F, -0.1F, -0.6F);
        this.neck.addChild(cube_r114);
        this.setRotateAngle(cube_r114, 0.0865F, 0.6853F, -1.4461F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 37, 16, -6.1485F, -1.9616F, -0.5F, 4, 0, 1, 0.0F, true));

        this.cube_r115 = new ModelRenderer(this);
        this.cube_r115.setRotationPoint(-0.5F, -0.1F, -0.6F);
        this.neck.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 0.4748F, 0.5211F, -0.7809F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 51, 10, -2.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r116 = new ModelRenderer(this);
        this.cube_r116.setRotationPoint(-0.5F, -0.1F, -0.6F);
        this.neck.addChild(cube_r116);
        this.setRotateAngle(cube_r116, 0.6548F, 0.2351F, -0.3059F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 53, 12, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r117 = new ModelRenderer(this);
        this.cube_r117.setRotationPoint(0.5F, 0.0F, -2.6F);
        this.neck.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 0.3268F, -0.7914F, 1.2265F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 33, 0, 0.866F, -0.5F, -0.5F, 4, 0, 1, 0.0F, false));

        this.cube_r118 = new ModelRenderer(this);
        this.cube_r118.setRotationPoint(0.5F, 0.0F, -2.6F);
        this.neck.addChild(cube_r118);
        this.setRotateAngle(cube_r118, 0.6915F, -0.5273F, 0.6465F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 47, 48, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r119 = new ModelRenderer(this);
        this.cube_r119.setRotationPoint(0.5F, -0.1F, -0.6F);
        this.neck.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 0.6548F, -0.2351F, 0.3059F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 53, 12, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r120 = new ModelRenderer(this);
        this.cube_r120.setRotationPoint(0.5F, -0.1F, -0.6F);
        this.neck.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.4748F, -0.5211F, 0.7809F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 51, 10, 0.866F, -0.5F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r121 = new ModelRenderer(this);
        this.cube_r121.setRotationPoint(0.5F, -0.1F, -0.6F);
        this.neck.addChild(cube_r121);
        this.setRotateAngle(cube_r121, 0.0865F, -0.6853F, 1.4461F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 37, 16, 2.1485F, -1.9616F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck.addChild(neck2);


        this.cube_r122 = new ModelRenderer(this);
        this.cube_r122.setRotationPoint(0.0F, 0.3452F, -0.0062F);
        this.neck2.addChild(cube_r122);
        this.setRotateAngle(cube_r122, -0.192F, 0.0F, 0.0F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 44, 59, 0.0F, -1.5F, -2.0F, 0, 1, 1, 0.0F, false));
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 27, 0, -0.5F, -0.9F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r123 = new ModelRenderer(this);
        this.cube_r123.setRotationPoint(-0.5F, -0.2F, -1.5F);
        this.neck2.addChild(cube_r123);
        this.setRotateAngle(cube_r123, 0.4541F, 0.9473F, -0.9438F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 40, 37, -2.0173F, -0.0074F, -0.6505F, 2, 0, 1, 0.0F, true));

        this.cube_r124 = new ModelRenderer(this);
        this.cube_r124.setRotationPoint(0.5F, -0.2F, -1.5F);
        this.neck2.addChild(cube_r124);
        this.setRotateAngle(cube_r124, 0.4541F, -0.9473F, 0.9438F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 40, 37, 0.0173F, -0.0074F, -0.6505F, 2, 0, 1, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.6F, -2.9F);
        this.neck2.addChild(neck3);


        this.cube_r125 = new ModelRenderer(this);
        this.cube_r125.setRotationPoint(0.0F, -0.4548F, 0.0938F);
        this.neck3.addChild(cube_r125);
        this.setRotateAngle(cube_r125, -0.0349F, 0.0F, 0.0F);
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 0, 60, 0.0F, -0.56F, -0.9843F, 0, 1, 1, 0.0F, false));
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 35, 76, -0.5F, -0.06F, -1.9843F, 1, 1, 2, 0.0F, false));

        this.cube_r126 = new ModelRenderer(this);
        this.cube_r126.setRotationPoint(-0.5F, 0.4F, 1.4F);
        this.neck3.addChild(cube_r126);
        this.setRotateAngle(cube_r126, 0.4541F, 0.9473F, -0.9438F);
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 0, 48, -0.1993F, -0.6131F, -1.4108F, 2, 0, 1, 0.0F, true));

        this.cube_r127 = new ModelRenderer(this);
        this.cube_r127.setRotationPoint(0.5F, 0.4F, 1.4F);
        this.neck3.addChild(cube_r127);
        this.setRotateAngle(cube_r127, 0.4541F, -0.9473F, 0.9438F);
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 0, 48, -1.8007F, -0.6131F, -1.4108F, 2, 0, 1, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1452F, -1.7062F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.1861F, 0.2428F, 0.0985F);
        this.head.cubeList.add(new ModelBox(head, 27, 5, -1.0F, -1.579F, -2.2337F, 2, 2, 2, 0.01F, false));

        this.cube_r128 = new ModelRenderer(this);
        this.cube_r128.setRotationPoint(0.0F, 1.1448F, -7.3531F);
        this.head.addChild(cube_r128);
        this.setRotateAngle(cube_r128, 0.9599F, 0.0F, 0.0F);
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 77, 68, -1.0F, -0.2716F, 1.5536F, 2, 1, 1, 0.0F, false));

        this.cube_r129 = new ModelRenderer(this);
        this.cube_r129.setRotationPoint(0.2F, 0.8331F, -3.8278F);
        this.head.addChild(cube_r129);
        this.setRotateAngle(cube_r129, 0.096F, 0.0F, 0.0F);
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 71, 68, -0.8F, -1.0059F, -0.0416F, 0, 1, 1, 0.0F, true));
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 71, 68, 0.4F, -1.0059F, -0.0416F, 0, 1, 1, 0.0F, false));

        this.cube_r130 = new ModelRenderer(this);
        this.cube_r130.setRotationPoint(0.2F, 0.5331F, -4.9278F);
        this.head.addChild(cube_r130);
        this.setRotateAngle(cube_r130, -0.3229F, 0.0F, 0.0F);
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 67, 0, -0.79F, -0.9312F, -1.0038F, 0, 1, 1, 0.0F, true));

        this.cube_r131 = new ModelRenderer(this);
        this.cube_r131.setRotationPoint(0.2F, 0.1331F, -3.7278F);
        this.head.addChild(cube_r131);
        this.setRotateAngle(cube_r131, -0.2007F, 0.0F, 0.0F);
        this.cube_r131.cubeList.add(new ModelBox(cube_r131, 82, 10, -0.79F, -0.3F, -1.0F, 0, 1, 1, 0.0F, true));
        this.cube_r131.cubeList.add(new ModelBox(cube_r131, 82, 10, 0.39F, -0.3F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r132 = new ModelRenderer(this);
        this.cube_r132.setRotationPoint(-0.2F, 0.5331F, -4.9278F);
        this.head.addChild(cube_r132);
        this.setRotateAngle(cube_r132, -0.3229F, 0.0F, 0.0F);
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 67, 0, 0.79F, -0.9312F, -1.0038F, 0, 1, 1, 0.0F, false));

        this.cube_r133 = new ModelRenderer(this);
        this.cube_r133.setRotationPoint(0.0F, -0.6539F, -5.2194F);
        this.head.addChild(cube_r133);
        this.setRotateAngle(cube_r133, 0.2182F, 0.0F, 0.0F);
        this.cube_r133.cubeList.add(new ModelBox(cube_r133, 78, 46, -0.5F, -0.0632F, -0.4402F, 1, 1, 2, 0.0F, false));

        this.cube_r134 = new ModelRenderer(this);
        this.cube_r134.setRotationPoint(0.8F, -0.1319F, -4.8241F);
        this.head.addChild(cube_r134);
        this.setRotateAngle(cube_r134, -0.0349F, 0.0F, 0.0F);
        this.cube_r134.cubeList.add(new ModelBox(cube_r134, 77, 6, -1.4F, -0.5F, -1.0F, 1, 1, 2, 0.014F, true));
        this.cube_r134.cubeList.add(new ModelBox(cube_r134, 77, 6, -1.2F, -0.5F, -1.0F, 1, 1, 2, 0.01F, false));

        this.cube_r135 = new ModelRenderer(this);
        this.cube_r135.setRotationPoint(0.8F, 0.621F, -3.4337F);
        this.head.addChild(cube_r135);
        this.setRotateAngle(cube_r135, -0.1745F, 0.0F, 0.0F);
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 70, 78, -1.4F, -1.0F, -1.9F, 1, 1, 2, 0.013F, true));
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 70, 78, -1.2F, -1.0F, -1.9F, 1, 1, 2, 0.016F, false));

        this.cube_r136 = new ModelRenderer(this);
        this.cube_r136.setRotationPoint(1.3F, -1.379F, -3.1337F);
        this.head.addChild(cube_r136);
        this.setRotateAngle(cube_r136, 0.3403F, 0.0F, 0.0F);
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 40, 78, -1.9F, 0.0672F, -2.0543F, 1, 1, 2, 0.024F, true));
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 40, 78, -1.7F, 0.0672F, -2.0543F, 1, 1, 2, 0.022F, false));

        this.cube_r137 = new ModelRenderer(this);
        this.cube_r137.setRotationPoint(1.3F, -1.579F, -2.2337F);
        this.head.addChild(cube_r137);
        this.setRotateAngle(cube_r137, 0.2182F, 0.0F, 0.0F);
        this.cube_r137.cubeList.add(new ModelBox(cube_r137, 19, 60, -2.0F, 0.0676F, -0.9763F, 1, 1, 1, 0.019F, true));
        this.cube_r137.cubeList.add(new ModelBox(cube_r137, 19, 60, -1.6F, 0.0676F, -0.9763F, 1, 1, 1, 0.02F, false));

        this.cube_r138 = new ModelRenderer(this);
        this.cube_r138.setRotationPoint(0.0F, 0.321F, -1.1837F);
        this.head.addChild(cube_r138);
        this.setRotateAngle(cube_r138, 0.192F, 0.0F, 0.0F);
        this.cube_r138.cubeList.add(new ModelBox(cube_r138, 7, 79, -1.1F, -1.1F, -2.2F, 1, 1, 2, 0.02F, true));
        this.cube_r138.cubeList.add(new ModelBox(cube_r138, 7, 79, 0.1F, -1.1F, -2.2F, 1, 1, 2, 0.02F, false));

        this.cube_r139 = new ModelRenderer(this);
        this.cube_r139.setRotationPoint(1.1F, -0.4194F, -4.1437F);
        this.head.addChild(cube_r139);
        this.setRotateAngle(cube_r139, 0.2094F, 0.0F, 0.0F);
        this.cube_r139.cubeList.add(new ModelBox(cube_r139, 14, 79, -1.95F, -0.4999F, -1.7632F, 1, 1, 2, -0.2F, true));
        this.cube_r139.cubeList.add(new ModelBox(cube_r139, 14, 79, -1.25F, -0.4999F, -1.7632F, 1, 1, 2, -0.2F, false));

        this.cube_r140 = new ModelRenderer(this);
        this.cube_r140.setRotationPoint(1.1F, 0.1806F, -2.8437F);
        this.head.addChild(cube_r140);
        this.setRotateAngle(cube_r140, 0.0349F, 0.0F, 0.0F);
        this.cube_r140.cubeList.add(new ModelBox(cube_r140, 79, 72, -2.45F, -0.7449F, -0.8414F, 1, 1, 1, -0.2F, true));
        this.cube_r140.cubeList.add(new ModelBox(cube_r140, 79, 72, -0.75F, -0.7449F, -0.8414F, 1, 1, 1, -0.2F, false));

        this.cube_r141 = new ModelRenderer(this);
        this.cube_r141.setRotationPoint(1.1F, -0.0194F, -3.0437F);
        this.head.addChild(cube_r141);
        this.setRotateAngle(cube_r141, 0.2618F, 0.0F, 0.0F);
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 80, 20, -2.45F, -0.5F, -0.1F, 1, 1, 1, -0.21F, true));
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 80, 20, -0.75F, -0.5F, -0.1F, 1, 1, 1, -0.21F, false));

        this.cube_r142 = new ModelRenderer(this);
        this.cube_r142.setRotationPoint(-0.2F, 0.421F, -2.2337F);
        this.head.addChild(cube_r142);
        this.setRotateAngle(cube_r142, -0.2793F, 0.0F, 0.0F);
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 52, 80, -1.25F, -1.6F, -0.1F, 1, 1, 1, 0.1F, true));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 47, 80, -1.47F, -1.6F, -0.1F, 1, 1, 1, -0.1F, true));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 34, 80, -1.64F, -1.6F, -0.1F, 1, 1, 1, -0.25F, true));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 34, 80, 1.04F, -1.6F, -0.1F, 1, 1, 1, -0.25F, false));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 47, 80, 0.87F, -1.6F, -0.1F, 1, 1, 1, -0.1F, false));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 52, 80, 0.65F, -1.6F, -0.1F, 1, 1, 1, 0.1F, false));
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 70, 16, -1.3F, -2.0F, 0.1F, 3, 2, 2, 0.016F, false));

        this.cube_r143 = new ModelRenderer(this);
        this.cube_r143.setRotationPoint(-0.4F, 0.3538F, -0.654F);
        this.head.addChild(cube_r143);
        this.setRotateAngle(cube_r143, 0.7243F, 0.0F, 0.0F);
        this.cube_r143.cubeList.add(new ModelBox(cube_r143, 21, 79, -1.44F, -0.7F, -0.5F, 2, 1, 1, -0.3F, true));
        this.cube_r143.cubeList.add(new ModelBox(cube_r143, 78, 33, -1.44F, -0.3F, -0.5F, 2, 1, 1, -0.3F, true));
        this.cube_r143.cubeList.add(new ModelBox(cube_r143, 78, 33, 0.24F, -0.3F, -0.5F, 2, 1, 1, -0.3F, false));
        this.cube_r143.cubeList.add(new ModelBox(cube_r143, 21, 79, 0.24F, -0.7F, -0.5F, 2, 1, 1, -0.3F, false));

        this.cube_r144 = new ModelRenderer(this);
        this.cube_r144.setRotationPoint(0.0F, -0.979F, 0.5663F);
        this.head.addChild(cube_r144);
        this.setRotateAngle(cube_r144, -1.1519F, 0.0F, 0.0F);
        this.cube_r144.cubeList.add(new ModelBox(cube_r144, 79, 40, -1.5F, -0.0675F, 0.0023F, 1, 1, 1, -0.01F, true));
        this.cube_r144.cubeList.add(new ModelBox(cube_r144, 79, 40, 0.5F, -0.0675F, 0.0023F, 1, 1, 1, -0.01F, false));

        this.cube_r145 = new ModelRenderer(this);
        this.cube_r145.setRotationPoint(0.0F, -1.579F, -0.2337F);
        this.head.addChild(cube_r145);
        this.setRotateAngle(cube_r145, -0.576F, 0.0F, 0.0F);
        this.cube_r145.cubeList.add(new ModelBox(cube_r145, 24, 45, -1.5F, -0.1239F, 0.0F, 1, 1, 1, -0.1F, true));
        this.cube_r145.cubeList.add(new ModelBox(cube_r145, 24, 45, 0.5F, -0.1239F, 0.0F, 1, 1, 1, -0.1F, false));
        this.cube_r145.cubeList.add(new ModelBox(cube_r145, 47, 45, -1.5F, 0.0F, 0.0F, 3, 1, 1, 0.01F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.9718F, -0.2133F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 77, 78, 0.0F, 1.3516F, -5.442F, 1, 1, 2, -0.1F, false));

        this.cube_r146 = new ModelRenderer(this);
        this.cube_r146.setRotationPoint(0.5F, 0.9886F, -3.6109F);
        this.jaw.addChild(cube_r146);
        this.setRotateAngle(cube_r146, 0.5236F, 0.0F, 0.0F);
        this.cube_r146.cubeList.add(new ModelBox(cube_r146, 0, 31, -1.0F, 0.3F, 0.4F, 2, 1, 2, -0.01F, false));
        this.cube_r146.cubeList.add(new ModelBox(cube_r146, 30, 68, -0.6F, 0.3F, -0.6F, 1, 1, 1, 0.014F, true));
        this.cube_r146.cubeList.add(new ModelBox(cube_r146, 30, 68, -0.4F, 0.3F, -0.6F, 1, 1, 1, 0.01F, false));

        this.cube_r147 = new ModelRenderer(this);
        this.cube_r147.setRotationPoint(0.5F, 0.4516F, -0.642F);
        this.jaw.addChild(cube_r147);
        this.setRotateAngle(cube_r147, -0.0698F, 0.0F, 0.0F);
        this.cube_r147.cubeList.add(new ModelBox(cube_r147, 66, 61, -1.5F, -0.5F, 0.5F, 1, 1, 1, -0.011F, true));
        this.cube_r147.cubeList.add(new ModelBox(cube_r147, 0, 79, -1.5F, -0.5F, -1.1F, 1, 1, 2, 0.011F, true));
        this.cube_r147.cubeList.add(new ModelBox(cube_r147, 66, 58, -1.8F, -0.2863F, -1.3254F, 1, 1, 1, -0.2F, true));
        this.cube_r147.cubeList.add(new ModelBox(cube_r147, 66, 61, 0.5F, -0.5F, 0.5F, 1, 1, 1, -0.011F, false));
        this.cube_r147.cubeList.add(new ModelBox(cube_r147, 66, 58, 0.8F, -0.2863F, -1.3254F, 1, 1, 1, -0.2F, false));
        this.cube_r147.cubeList.add(new ModelBox(cube_r147, 0, 79, 0.5F, -0.5F, -1.1F, 1, 1, 2, 0.011F, false));

        this.cube_r148 = new ModelRenderer(this);
        this.cube_r148.setRotationPoint(-0.35F, 0.8395F, -1.948F);
        this.jaw.addChild(cube_r148);
        this.setRotateAngle(cube_r148, 0.6545F, 0.0F, 0.0F);
        this.cube_r148.cubeList.add(new ModelBox(cube_r148, 79, 13, -0.4F, -0.4F, -0.8F, 1, 1, 2, -0.2F, true));
        this.cube_r148.cubeList.add(new ModelBox(cube_r148, 79, 13, 1.1F, -0.4F, -0.8F, 1, 1, 2, -0.2F, false));

        this.cube_r149 = new ModelRenderer(this);
        this.cube_r149.setRotationPoint(0.3F, 1.3082F, -2.9645F);
        this.jaw.addChild(cube_r149);
        this.setRotateAngle(cube_r149, 0.4363F, 0.0F, 0.0F);
        this.cube_r149.cubeList.add(new ModelBox(cube_r149, 20, 26, -0.4F, -0.5F, -0.9F, 0, 1, 2, 0.0F, true));
        this.cube_r149.cubeList.add(new ModelBox(cube_r149, 20, 26, 0.8F, -0.5F, -0.9F, 0, 1, 2, 0.0F, false));

        this.cube_r150 = new ModelRenderer(this);
        this.cube_r150.setRotationPoint(0.5F, -0.1484F, -1.692F);
        this.jaw.addChild(cube_r150);
        this.setRotateAngle(cube_r150, 0.8552F, 0.0F, 0.0F);
        this.cube_r150.cubeList.add(new ModelBox(cube_r150, 12, 60, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.01F, false));

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
