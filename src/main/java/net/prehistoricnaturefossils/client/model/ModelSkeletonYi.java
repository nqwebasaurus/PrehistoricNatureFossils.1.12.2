package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonYi extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer Basin_r1;
    private final ModelRenderer Basin_r2;
    private final ModelRenderer Basin_r3;
    private final ModelRenderer Basin_r4;
    private final ModelRenderer Basin_r5;
    private final ModelRenderer Basin_r6;
    private final ModelRenderer Basin_r7;
    private final ModelRenderer Basin_r8;
    private final ModelRenderer Basin_r9;
    private final ModelRenderer Basin_r10;
    private final ModelRenderer Basin_r11;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Body;
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
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer UpperArmL;
    private final ModelRenderer WingL;
    private final ModelRenderer LowerArmL;
    private final ModelRenderer cube_r30;
    private final ModelRenderer HandL;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer HandwingL;
    private final ModelRenderer UpperArmL2;
    private final ModelRenderer WingL2;
    private final ModelRenderer LowerArmL2;
    private final ModelRenderer cube_r37;
    private final ModelRenderer HandL2;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer HandwingL2;
    private final ModelRenderer Neck1;
    private final ModelRenderer cube_r44;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r45;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r46;
    private final ModelRenderer head;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer Jaw;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer UpperLegL;
    private final ModelRenderer cube_r60;
    private final ModelRenderer LowerLegL;
    private final ModelRenderer cube_r61;
    private final ModelRenderer FootL;
    private final ModelRenderer cube_r62;
    private final ModelRenderer ToesL;
    private final ModelRenderer cube_r63;
    private final ModelRenderer UpperLegL2;
    private final ModelRenderer cube_r64;
    private final ModelRenderer LowerLegL2;
    private final ModelRenderer cube_r65;
    private final ModelRenderer FootL2;
    private final ModelRenderer cube_r66;
    private final ModelRenderer ToesL2;
    private final ModelRenderer cube_r67;

    public ModelSkeletonYi() {
        this.textureWidth = 46;
        this.textureHeight = 44;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -13.0F, 3.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.5F, 0.1F, -2.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.2182F, 0.0F, 0.0F);


        this.Basin_r1 = new ModelRenderer(this);
        this.Basin_r1.setRotationPoint(-2.3F, 0.4654F, 0.3471F);
        this.hips.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.192F, 0.0F, -0.4363F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 10, 35, -0.5F, -0.1131F, -0.8028F, 1, 4, 1, -0.2F, true));

        this.Basin_r2 = new ModelRenderer(this);
        this.Basin_r2.setRotationPoint(-2.3F, 0.4654F, 0.3471F);
        this.hips.addChild(Basin_r2);
        this.setRotateAngle(Basin_r2, 0.9204F, 0.1133F, -0.5273F);
        this.Basin_r2.cubeList.add(new ModelBox(Basin_r2, 23, 20, -0.5F, 1.3913F, -0.8132F, 1, 3, 1, -0.2F, true));

        this.Basin_r3 = new ModelRenderer(this);
        this.Basin_r3.setRotationPoint(-2.3F, 0.4654F, 0.3471F);
        this.hips.addChild(Basin_r3);
        this.setRotateAngle(Basin_r3, 0.7458F, 0.1133F, -0.5273F);
        this.Basin_r3.cubeList.add(new ModelBox(Basin_r3, 22, 38, -0.5F, -0.0507F, -0.5221F, 1, 2, 1, -0.2F, true));

        this.Basin_r4 = new ModelRenderer(this);
        this.Basin_r4.setRotationPoint(-2.5F, -0.1985F, -0.9064F);
        this.hips.addChild(Basin_r4);
        this.setRotateAngle(Basin_r4, 0.0175F, 0.0F, 0.0F);
        this.Basin_r4.cubeList.add(new ModelBox(Basin_r4, 34, 35, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.21F, true));
        this.Basin_r4.cubeList.add(new ModelBox(Basin_r4, 34, 35, 3.5F, -0.5F, -1.0F, 1, 1, 2, -0.21F, false));

        this.Basin_r5 = new ModelRenderer(this);
        this.Basin_r5.setRotationPoint(-1.8F, 15.0F, 0.2F);
        this.hips.addChild(Basin_r5);
        this.setRotateAngle(Basin_r5, -0.192F, 0.0F, 0.0F);
        this.Basin_r5.cubeList.add(new ModelBox(Basin_r5, 31, 23, -1.0F, -15.2087F, -3.5317F, 2, 1, 2, 0.002F, true));
        this.Basin_r5.cubeList.add(new ModelBox(Basin_r5, 31, 23, 1.6F, -15.2087F, -3.5317F, 2, 1, 2, 0.002F, false));

        this.Basin_r6 = new ModelRenderer(this);
        this.Basin_r6.setRotationPoint(-2.5F, -0.0797F, 1.9558F);
        this.hips.addChild(Basin_r6);
        this.setRotateAngle(Basin_r6, -0.2793F, 0.0F, 0.0F);
        this.Basin_r6.cubeList.add(new ModelBox(Basin_r6, 22, 29, -0.5F, -0.271F, -2.378F, 1, 1, 3, -0.21F, true));
        this.Basin_r6.cubeList.add(new ModelBox(Basin_r6, 22, 29, 3.5F, -0.271F, -2.378F, 1, 1, 3, -0.21F, false));

        this.Basin_r7 = new ModelRenderer(this);
        this.Basin_r7.setRotationPoint(-2.5F, -0.6797F, -0.1442F);
        this.hips.addChild(Basin_r7);
        this.setRotateAngle(Basin_r7, 0.0698F, 0.0F, 0.0F);
        this.Basin_r7.cubeList.add(new ModelBox(Basin_r7, 15, 36, -0.5F, -0.2731F, -1.7939F, 1, 1, 2, -0.2F, true));
        this.Basin_r7.cubeList.add(new ModelBox(Basin_r7, 15, 36, 3.5F, -0.2731F, -1.7939F, 1, 1, 2, -0.2F, false));

        this.Basin_r8 = new ModelRenderer(this);
        this.Basin_r8.setRotationPoint(1.3F, 0.4654F, 0.3471F);
        this.hips.addChild(Basin_r8);
        this.setRotateAngle(Basin_r8, 0.9204F, -0.1133F, 0.5273F);
        this.Basin_r8.cubeList.add(new ModelBox(Basin_r8, 23, 20, -0.5F, 1.3913F, -0.8132F, 1, 3, 1, -0.2F, false));

        this.Basin_r9 = new ModelRenderer(this);
        this.Basin_r9.setRotationPoint(1.3F, 0.4654F, 0.3471F);
        this.hips.addChild(Basin_r9);
        this.setRotateAngle(Basin_r9, 0.7458F, -0.1133F, 0.5273F);
        this.Basin_r9.cubeList.add(new ModelBox(Basin_r9, 22, 38, -0.5F, -0.0507F, -0.5221F, 1, 2, 1, -0.2F, false));

        this.Basin_r10 = new ModelRenderer(this);
        this.Basin_r10.setRotationPoint(1.3F, 0.4654F, 0.3471F);
        this.hips.addChild(Basin_r10);
        this.setRotateAngle(Basin_r10, -0.192F, 0.0F, 0.4363F);
        this.Basin_r10.cubeList.add(new ModelBox(Basin_r10, 10, 35, -0.5F, -0.1131F, -0.8028F, 1, 4, 1, -0.2F, false));

        this.Basin_r11 = new ModelRenderer(this);
        this.Basin_r11.setRotationPoint(-1.0F, -2.0F, -1.0F);
        this.hips.addChild(Basin_r11);
        this.setRotateAngle(Basin_r11, -0.192F, 0.0F, 0.0F);
        this.Basin_r11.cubeList.add(new ModelBox(Basin_r11, 24, 23, 0.0F, 0.7913F, 0.5683F, 1, 1, 4, 0.01F, false));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(-0.5F, -0.05F, 3.0F);
        this.hips.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.4887F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.1507F, 0.1265F);
        this.Tail1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1222F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 18, -1.0F, -0.2F, 0.0F, 1, 1, 3, -0.002F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.2993F, 3.0265F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1745F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -0.3145F, 0.0327F);
        this.Tail2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 0, -1.0F, 0.0F, -0.1F, 1, 1, 3, 0.0F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.0F, -0.7F);
        this.hips.addChild(Body);
        this.setRotateAngle(Body, -0.0873F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 4.335F, -2.9154F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2793F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 13, -2.0F, -0.8F, -3.4F, 4, 1, 5, 0.001F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.7F, -4.9F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 20, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.001F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.2F, -0.4F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0851F, -0.2939F, -1.3843F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 15, -2.5416F, -1.2373F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.2F, -0.4F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.222F, -0.2118F, -0.8496F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 34, -1.9537F, -0.3007F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 0.2F, -0.4F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2745F, -0.1362F, -0.5491F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 6, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -0.1F, -2.4F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0378F, -0.1256F, -1.307F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 0, -4.5416F, -1.2373F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -0.1F, -2.4F);
        this.Body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1181F, -0.057F, -0.4769F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 41, 36, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -0.1F, -2.4F);
        this.Body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0956F, -0.0899F, -0.7814F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 41, -1.9537F, -0.3007F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -0.2F, -4.4F);
        this.Body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0076F, 0.043F, -1.3088F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 11, -3.5416F, -1.2373F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -0.2F, -4.4F);
        this.Body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0281F, 0.0334F, -0.7849F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 41, 41, -1.9537F, -0.3007F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -0.2F, -4.4F);
        this.Body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0368F, 0.0234F, -0.4795F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 38, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.2F, -0.4F);
        this.Body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.222F, 0.2118F, 0.8496F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 34, 0.9537F, -0.3007F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.2F, -0.4F);
        this.Body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0851F, 0.2939F, 1.3843F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 35, 15, 1.5416F, -1.2373F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.2F, -0.4F);
        this.Body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2745F, 0.1362F, 0.5491F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 39, 6, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.1F, -2.4F);
        this.Body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0956F, 0.0899F, 0.7814F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 41, 0.9537F, -0.3007F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.1F, -2.4F);
        this.Body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0378F, 0.1256F, 1.307F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 15, 0, 1.5416F, -1.2373F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.1F, -2.4F);
        this.Body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1181F, 0.057F, 0.4769F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 41, 36, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.2F, -4.4F);
        this.Body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0368F, -0.0234F, 0.4795F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 41, 38, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.2F, -4.4F);
        this.Body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0281F, -0.0334F, 0.7849F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 41, 41, 0.9537F, -0.3007F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.2F, -4.4F);
        this.Body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0076F, -0.043F, 1.3088F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 15, 11, 1.5416F, -1.2373F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.5F, -4.9F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, -0.0873F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 21, 34, -1.0F, -0.2F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, 0.3F, -1.5F);
        this.Chest.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2F, 0.2324F, -0.8492F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 20, 7, -1.9537F, -0.3007F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, 0.3F, -1.5F);
        this.Chest.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2599F, 0.1623F, -0.546F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 32, 9, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.25F, 1.9263F, -2.024F);
        this.Chest.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.6545F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 16, 27, -0.75F, -0.65F, -0.3F, 1, 1, 3, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 16, 27, 3.25F, -0.65F, -0.3F, 1, 1, 3, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.25F, 1.9263F, -2.024F);
        this.Chest.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.6848F, 0.2748F, 0.218F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 34, 17, -0.55F, -0.55F, -0.5F, 2, 2, 1, 0.0F, true));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(1.25F, 1.9263F, -2.024F);
        this.Chest.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.6848F, -0.2748F, -0.218F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 34, 17, -1.45F, -0.55F, -0.5F, 2, 2, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.3F, -1.5F);
        this.Chest.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2F, -0.2324F, 0.8492F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 20, 7, 0.9537F, -0.3007F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.3F, -1.5F);
        this.Chest.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2599F, -0.1623F, 0.546F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 32, 9, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.UpperArmL = new ModelRenderer(this);
        this.UpperArmL.setRotationPoint(2.0F, 2.35F, -0.95F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -1.0285F, -0.3163F, -1.6881F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 10, 2, -0.6591F, -0.5295F, -0.155F, 1, 1, 7, 0.0F, false));

        this.WingL = new ModelRenderer(this);
        this.WingL.setRotationPoint(-0.0841F, -1.2795F, 5.845F);
        this.UpperArmL.addChild(WingL);
        this.setRotateAngle(WingL, 0.0F, 0.0F, -0.6981F);


        this.LowerArmL = new ModelRenderer(this);
        this.LowerArmL.setRotationPoint(-0.6591F, -0.1795F, 6.845F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, 0.114F, -0.1459F, 0.114F);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.0559F, 0.2915F);
        this.LowerArmL.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -1.4835F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 0, 0.0F, -0.55F, -0.2F, 1, 1, 7, -0.2F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 9, 0.0F, 0.25F, 0.0F, 1, 1, 7, -0.1F, false));

        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.6F, 6.8441F, 0.0915F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.1044F, -0.2319F, 0.1044F);


        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.8F);
        this.HandL.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.48F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 18, -0.5F, -1.2549F, 4.2613F, 1, 1, 6, -0.21F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.8F);
        this.HandL.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.6109F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 20, 0, -0.5F, -0.663F, -0.2596F, 1, 1, 5, -0.2F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.2F, 0.5F);
        this.HandL.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.9041F, 0.0297F, 0.0966F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 31, 29, -0.6017F, 3.5359F, -1.6989F, 1, 6, 1, -0.21F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.2F, 0.5F);
        this.HandL.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.6423F, 0.0297F, 0.0966F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 9, -0.6017F, -0.7802F, -0.6784F, 1, 5, 1, -0.2F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.2F, 0.6F);
        this.HandL.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0932F, -0.0234F, 0.0075F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 18, -0.6F, -0.6F, -1.0F, 1, 4, 1, -0.21F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.2F, 0.6F);
        this.HandL.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.4304F, -0.0234F, 0.0075F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 11, 26, -0.6F, -0.6F, -1.0F, 1, 7, 1, -0.19F, false));

        this.HandwingL = new ModelRenderer(this);
        this.HandwingL.setRotationPoint(0.4F, 0.8F, 1.5F);
        this.HandL.addChild(HandwingL);
        this.setRotateAngle(HandwingL, 0.4363F, 0.0873F, 0.0F);


        this.UpperArmL2 = new ModelRenderer(this);
        this.UpperArmL2.setRotationPoint(-3.0F, 2.35F, -0.95F);
        this.Chest.addChild(UpperArmL2);
        this.setRotateAngle(UpperArmL2, -1.0285F, 0.3163F, 1.6881F);
        this.UpperArmL2.cubeList.add(new ModelBox(UpperArmL2, 10, 2, -0.3409F, -0.5295F, -0.155F, 1, 1, 7, 0.0F, true));

        this.WingL2 = new ModelRenderer(this);
        this.WingL2.setRotationPoint(0.0841F, -1.2795F, 5.845F);
        this.UpperArmL2.addChild(WingL2);
        this.setRotateAngle(WingL2, 0.0F, 0.0F, 0.6981F);


        this.LowerArmL2 = new ModelRenderer(this);
        this.LowerArmL2.setRotationPoint(0.6591F, -0.1795F, 6.845F);
        this.UpperArmL2.addChild(LowerArmL2);
        this.setRotateAngle(LowerArmL2, 0.114F, 0.1459F, -0.114F);


        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -0.0559F, 0.2915F);
        this.LowerArmL2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -1.4835F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 0, -1.0F, -0.55F, -0.2F, 1, 1, 7, -0.2F, true));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 9, -1.0F, 0.25F, 0.0F, 1, 1, 7, -0.1F, true));

        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(-0.6F, 6.8441F, 0.0915F);
        this.LowerArmL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 0.0939F, 0.1595F, -0.2457F);


        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.8F);
        this.HandL2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.48F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 18, -0.5F, -1.2549F, 4.2613F, 1, 1, 6, -0.21F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.0F, 0.8F);
        this.HandL2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.6109F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 20, 0, -0.5F, -0.663F, -0.2596F, 1, 1, 5, -0.2F, true));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.2F, 0.5F);
        this.HandL2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.9041F, -0.0297F, -0.0966F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 31, 29, -0.3983F, 3.5359F, -1.6989F, 1, 6, 1, -0.21F, true));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.2F, 0.5F);
        this.HandL2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.6423F, -0.0297F, -0.0966F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 9, -0.3983F, -0.7802F, -0.6784F, 1, 5, 1, -0.2F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.2F, 0.6F);
        this.HandL2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0932F, 0.0234F, -0.0075F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 18, -0.4F, -0.6F, -1.0F, 1, 4, 1, -0.21F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.2F, 0.6F);
        this.HandL2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.4304F, 0.0234F, -0.0075F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 11, 26, -0.4F, -0.6F, -1.0F, 1, 7, 1, -0.19F, true));

        this.HandwingL2 = new ModelRenderer(this);
        this.HandwingL2.setRotationPoint(-0.4F, 0.8F, 1.5F);
        this.HandL2.addChild(HandwingL2);
        this.setRotateAngle(HandwingL2, 0.4363F, -0.0873F, 0.0F);


        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.1F, -1.9F);
        this.Chest.addChild(Neck1);


        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -0.0587F, -0.2037F);
        this.Neck1.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.4887F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 41, 25, -1.0F, -0.3341F, -0.7179F, 1, 1, 1, 0.001F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(-0.6F, -0.3587F, -0.8037F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.5149F, 0.0F, 0.0F);


        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.1F, -1.3668F, -1.1622F);
        this.Neck2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.6807F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 34, 11, -0.5F, -0.0733F, -0.0318F, 1, 1, 2, 0.01F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.6F, -1.0943F, -1.2773F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.3491F, 0.0F, 0.0F);


        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 1.4868F, -1.2076F);
        this.Neck3.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.4887F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 41, 17, -1.0F, -2.26F, -0.6234F, 1, 1, 1, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3132F, -0.6076F);
        this.Neck3.addChild(head);
        this.setRotateAngle(head, 0.1047F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 26, 13, -1.5F, -0.8988F, -2.0349F, 2, 2, 2, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 41, 11, -0.5F, -0.4988F, -2.5849F, 1, 1, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 41, -0.27F, -0.4988F, -2.5849F, 1, 1, 1, -0.2F, false));
        this.head.cubeList.add(new ModelBox(head, 37, 39, -0.79F, -0.4988F, -2.5849F, 1, 1, 1, 0.3F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 41, -1.73F, -0.4988F, -2.5849F, 1, 1, 1, -0.2F, true));
        this.head.cubeList.add(new ModelBox(head, 37, 39, -1.21F, -0.4988F, -2.5849F, 1, 1, 1, 0.3F, true));
        this.head.cubeList.add(new ModelBox(head, 41, 11, -1.5F, -0.4988F, -2.5849F, 1, 1, 1, 0.02F, true));
        this.head.cubeList.add(new ModelBox(head, 37, 3, -1.5F, 0.1012F, -3.0349F, 2, 1, 1, 0.001F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, -1.1738F, -1.9599F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.3229F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 34, 0, -1.0F, -0.02F, -1.0391F, 2, 1, 1, 0.0F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 35, 27, -1.0F, 0.03F, -1.4391F, 2, 1, 1, -0.001F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 36, 30, -1.0F, -0.02F, -1.4391F, 2, 1, 1, -0.001F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.5F, 0.3012F, -4.4849F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.4843F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 32, 39, -0.5F, -0.3F, 0.925F, 1, 1, 1, -0.002F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.5F, 0.3012F, -4.4849F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.7854F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 39, 33, -0.5F, -0.025F, -0.025F, 1, 1, 1, -0.001F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.5F, 1.1012F, -3.0349F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.3229F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 10, 11, -0.5F, -0.7914F, -1.2695F, 1, 1, 2, -0.1F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.5F, 0.1012F, -3.0349F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.1309F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 32, 5, -0.5F, 0.0F, -1.5F, 1, 1, 2, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(-1.23F, 0.0012F, -0.6849F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0524F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 16, 32, -0.38F, -1.3F, -1.3F, 1, 1, 2, -0.2F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 38, 21, -0.48F, -1.0F, -0.5F, 1, 2, 1, -0.2F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 16, 32, 0.84F, -1.3F, -1.3F, 1, 1, 2, -0.2F, false));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 38, 21, 0.94F, -1.0F, -0.5F, 1, 2, 1, -0.2F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.71F, 0.1486F, -3.89F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.7243F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 40, 14, -0.6F, -0.5F, -0.6F, 1, 1, 1, -0.3F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 14, 40, -0.6F, -0.5F, -0.2F, 1, 1, 1, -0.3F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 14, 40, 0.02F, -0.5F, -0.2F, 1, 1, 1, -0.3F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 40, 14, 0.02F, -0.5F, -0.6F, 1, 1, 1, -0.3F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(-1.21F, 0.5642F, -3.318F);
        this.head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.1571F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 41, 0, 0.0F, -0.5F, -0.4F, 1, 1, 1, -0.2F, true));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 41, 0, 0.42F, -0.5F, -0.4F, 1, 1, 1, -0.2F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.5F, -0.8988F, -3.0349F);
        this.head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.0698F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 9, 20, -1.0F, -0.35F, 1.0F, 2, 1, 2, 0.0015F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.6012F, -0.0349F);
        this.head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.5672F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 26, -1.5F, 0.0F, -3.0F, 2, 1, 3, 0.0002F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.2618F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 20, 2, -1.0F, 0.0F, -0.95F, 1, 1, 1, -0.022F, false));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 5, 39, -1.0F, 0.0F, -1.45F, 1, 1, 1, -0.02F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.5F, -0.1195F, -3.7209F);
        this.Jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.1484F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 38, 8, -0.5F, -0.215F, 0.1245F, 1, 1, 1, -0.1F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.5F, 0.5805F, -3.6209F);
        this.Jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.3927F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 39, -0.5F, -0.8F, -0.7F, 1, 1, 1, -0.1F, false));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(-1.21F, 1.3973F, -0.7547F);
        this.Jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 1.5621F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 27, 37, -0.5F, -1.9F, 0.3F, 1, 2, 1, -0.2F, true));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 27, 37, 0.92F, -1.9F, 0.3F, 1, 2, 1, -0.2F, false));

        this.UpperLegL = new ModelRenderer(this);
        this.UpperLegL.setRotationPoint(2.5F, 0.6F, -1.6F);
        this.root.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.0869F, 0.0983F, 0.1228F);


        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.5F, -0.1298F, 0.8889F);
        this.UpperLegL.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.7854F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 0, 0.0F, 0.4F, -0.95F, 1, 5, 1, 0.0F, false));

        this.LowerLegL = new ModelRenderer(this);
        this.LowerLegL.setRotationPoint(0.0F, 3.5702F, -3.2111F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, -0.0436F, 0.0019F, 0.0436F);


        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLegL.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.4712F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 31, -0.5F, 0.1F, 0.6F, 1, 6, 1, -0.2F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 5, 31, -0.5F, -0.2F, -0.3F, 1, 6, 1, -0.001F, false));

        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 4.9552F, 3.4213F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.2166F, -0.057F, -0.1466F);


        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, -0.0518F, -0.1932F);
        this.FootL.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.6283F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 10, 0, -0.5F, -0.1F, -0.6F, 1, 4, 1, -0.002F, false));

        this.ToesL = new ModelRenderer(this);
        this.ToesL.setRotationPoint(0.0F, 2.9482F, -2.4432F);
        this.FootL.addChild(ToesL);
        this.setRotateAngle(ToesL, -0.0872F, -0.0038F, -0.0435F);


        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0F, -0.0687F, -0.6366F);
        this.ToesL.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0524F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 23, 7, -1.0F, -0.3F, -3.0F, 2, 1, 4, 0.0F, false));

        this.UpperLegL2 = new ModelRenderer(this);
        this.UpperLegL2.setRotationPoint(-2.5F, 0.6F, -1.6F);
        this.root.addChild(UpperLegL2);
        this.setRotateAngle(UpperLegL2, 0.1731F, -0.0203F, -0.1364F);


        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(0.5F, -0.1298F, 0.8889F);
        this.UpperLegL2.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.7854F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 0, -1.0F, 0.4F, -0.95F, 1, 5, 1, 0.0F, true));

        this.LowerLegL2 = new ModelRenderer(this);
        this.LowerLegL2.setRotationPoint(0.0F, 3.5702F, -3.2111F);
        this.UpperLegL2.addChild(LowerLegL2);
        this.setRotateAngle(LowerLegL2, 0.0872F, 0.0038F, -0.0435F);


        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLegL2.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.4712F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 31, -0.5F, 0.1F, 0.6F, 1, 6, 1, -0.2F, true));
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 5, 31, -0.5F, -0.2F, -0.3F, 1, 6, 1, -0.001F, true));

        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 4.9552F, 3.4213F);
        this.LowerLegL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.5231F, 0.0481F, 0.1787F);


        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, -0.0518F, -0.1932F);
        this.FootL2.addChild(cube_r66);
        this.setRotateAngle(cube_r66, -0.6283F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 10, 0, -0.5F, -0.1F, -0.6F, 1, 4, 1, -0.002F, true));

        this.ToesL2 = new ModelRenderer(this);
        this.ToesL2.setRotationPoint(0.0F, 2.9482F, -2.4432F);
        this.FootL2.addChild(ToesL2);
        this.setRotateAngle(ToesL2, -0.829F, 0.0F, 0.0F);


        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(0.0F, -0.0687F, -0.6366F);
        this.ToesL2.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0524F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 23, 7, -1.0F, -0.3F, -3.0F, 2, 1, 4, 0.0F, true));

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
