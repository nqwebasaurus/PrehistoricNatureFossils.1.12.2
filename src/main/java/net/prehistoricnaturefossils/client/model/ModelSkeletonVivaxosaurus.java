package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonVivaxosaurus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Hips_r2;
    private final ModelRenderer Hips_r3;
    private final ModelRenderer Hips_r4;
    private final ModelRenderer Hips_r5;
    private final ModelRenderer Hips_r6;
    private final ModelRenderer Neck_r1;
    private final ModelRenderer Neck_r2;
    private final ModelRenderer Neck_r3;
    private final ModelRenderer Neck_r4;
    private final ModelRenderer Neck_r5;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Neck_r6;
    private final ModelRenderer Neck_r7;
    private final ModelRenderer Neck_r8;
    private final ModelRenderer Neck_r9;
    private final ModelRenderer Neck_r10;
    private final ModelRenderer Neck_r11;
    private final ModelRenderer Neck_r12;
    private final ModelRenderer Neck_r13;
    private final ModelRenderer Neck_r14;
    private final ModelRenderer Neck_r15;
    private final ModelRenderer Neck_r16;
    private final ModelRenderer Neck_r17;
    private final ModelRenderer Neck_r18;
    private final ModelRenderer Neck_r19;
    private final ModelRenderer Neck_r20;
    private final ModelRenderer Neck_r21;
    private final ModelRenderer Neck_r22;
    private final ModelRenderer Neck_r23;
    private final ModelRenderer Neck_r24;
    private final ModelRenderer Neck_r25;
    private final ModelRenderer Neck_r26;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Neck_r27;
    private final ModelRenderer Neck_r28;
    private final ModelRenderer Neck_r29;
    private final ModelRenderer Neck_r30;
    private final ModelRenderer Neck_r31;
    private final ModelRenderer Neck_r32;
    private final ModelRenderer Neck_r33;
    private final ModelRenderer Neck_r34;
    private final ModelRenderer Neck_r35;
    private final ModelRenderer Neck_r36;
    private final ModelRenderer Neck_r37;
    private final ModelRenderer Neck_r38;
    private final ModelRenderer Neck_r39;
    private final ModelRenderer Neck_r40;
    private final ModelRenderer Neck_r41;
    private final ModelRenderer Neck_r42;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Bodyfront_r2;
    private final ModelRenderer Bodyfront_r3;
    private final ModelRenderer Bodyfront_r4;
    private final ModelRenderer Bodyfront_r5;
    private final ModelRenderer Neck_r43;
    private final ModelRenderer Neck_r44;
    private final ModelRenderer Neck;
    private final ModelRenderer Neck_r45;
    private final ModelRenderer Head;
    private final ModelRenderer Head_r1;
    private final ModelRenderer Head_r2;
    private final ModelRenderer Head_r3;
    private final ModelRenderer Head_r4;
    private final ModelRenderer Head_r5;
    private final ModelRenderer Head_r6;
    private final ModelRenderer Head_r7;
    private final ModelRenderer Head_r8;
    private final ModelRenderer Upperjaw1;
    private final ModelRenderer Upperjaw2;
    private final ModelRenderer Upperbeak;
    private final ModelRenderer Righttusk;
    private final ModelRenderer Lefttusk;
    private final ModelRenderer Lowerjaw1;
    private final ModelRenderer Lowerjaw3_r1;
    private final ModelRenderer Lowerjaw2;
    private final ModelRenderer Lowerjaw3;
    private final ModelRenderer Lowerjaw5_r1;
    private final ModelRenderer Lowerjaw4;
    private final ModelRenderer Lowerbeak;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightupperarm_r1;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Rightupperarm_r2;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Rightshin_r1;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Rightshin_r2;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonVivaxosaurus() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 14.6F, -1.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.3892F, -0.0013F, -0.0051F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 14, -1.0F, -2.4003F, 5.681F, 2, 2, 8, 0.003F, false));

        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-2.0F, 2.0944F, 10.518F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.0123F, 0.0547F, -0.4419F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 38, 4, -0.1793F, -0.1188F, -1.7152F, 1, 4, 5, 0.003F, true));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(-2.7F, 0.0944F, 10.518F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.0076F, 0.0435F, -0.3465F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 33, 60, -0.2F, -1.0F, -0.7F, 1, 3, 2, 0.003F, true));

        this.Hips_r3 = new ModelRenderer(this);
        this.Hips_r3.setRotationPoint(-2.7F, -1.9003F, 10.681F);
        this.Hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.3491F, 0.0F, 0.0F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 34, 33, -0.5F, -1.1F, -3.0F, 1, 3, 6, 0.003F, true));
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 34, 33, 4.9F, -1.1F, -3.0F, 1, 3, 6, 0.003F, false));

        this.Hips_r4 = new ModelRenderer(this);
        this.Hips_r4.setRotationPoint(-1.5F, -1.7003F, 11.181F);
        this.Hips.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, -0.1309F, 0.0F, 0.0F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 17, 38, -1.0F, -0.5F, -2.5F, 2, 1, 5, 0.003F, true));
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 17, 38, 2.0F, -0.5F, -2.5F, 2, 1, 5, 0.003F, false));

        this.Hips_r5 = new ModelRenderer(this);
        this.Hips_r5.setRotationPoint(2.0F, 2.0944F, 10.518F);
        this.Hips.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, -0.0123F, -0.0547F, 0.4419F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 38, 4, -0.8207F, -0.1188F, -1.7152F, 1, 4, 5, 0.003F, false));

        this.Hips_r6 = new ModelRenderer(this);
        this.Hips_r6.setRotationPoint(2.7F, 0.0944F, 10.518F);
        this.Hips.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, -0.0076F, -0.0435F, 0.3465F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 33, 60, -0.8F, -1.0F, -0.7F, 1, 3, 2, 0.003F, false));

        this.Neck_r1 = new ModelRenderer(this);
        this.Neck_r1.setRotationPoint(-1.0F, -0.9593F, 6.1758F);
        this.Hips.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, -0.1349F, 0.1385F, 0.364F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 63, 42, -1.4097F, 1.4545F, -0.3777F, 0, 2, 1, 0.0F, true));

        this.Neck_r2 = new ModelRenderer(this);
        this.Neck_r2.setRotationPoint(-1.0F, -0.9593F, 6.1758F);
        this.Hips.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, -0.005F, 0.193F, 1.1146F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 51, 6, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, true));

        this.Neck_r3 = new ModelRenderer(this);
        this.Neck_r3.setRotationPoint(1.0F, -0.9593F, 6.1758F);
        this.Hips.addChild(Neck_r3);
        this.setRotateAngle(Neck_r3, -0.1349F, -0.1385F, -0.364F);
        this.Neck_r3.cubeList.add(new ModelBox(Neck_r3, 63, 42, 1.4097F, 1.4545F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r4 = new ModelRenderer(this);
        this.Neck_r4.setRotationPoint(0.0F, -1.8277F, -14.0891F);
        this.Hips.addChild(Neck_r4);
        this.setRotateAngle(Neck_r4, -0.0873F, 0.0F, 0.0F);
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 0, 0, 0.0F, -3.6F, 25.7F, 0, 1, 1, 0.0F, false));
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 8, 0, 0.0F, -3.6F, 23.7F, 0, 1, 1, 0.0F, false));
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 42, 0, 0.0F, -3.6F, 21.7F, 0, 2, 1, 0.0F, false));
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 43, 33, 0.0F, -3.6F, 19.7F, 0, 2, 1, 0.0F, false));

        this.Neck_r5 = new ModelRenderer(this);
        this.Neck_r5.setRotationPoint(1.0F, -0.9593F, 6.1758F);
        this.Hips.addChild(Neck_r5);
        this.setRotateAngle(Neck_r5, -0.005F, -0.193F, -1.1146F);
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 51, 6, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -1.5003F, 5.981F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1698F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -1.0F, -0.9489F, -11.1001F, 2, 2, 11, 0.0F, false));

        this.Neck_r6 = new ModelRenderer(this);
        this.Neck_r6.setRotationPoint(-1.0F, 0.241F, -1.7053F);
        this.Bodymiddle.addChild(Neck_r6);
        this.setRotateAngle(Neck_r6, -0.1349F, 0.1385F, 0.364F);
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 17, 36, -1.4097F, 1.4545F, -0.3777F, 0, 4, 1, 0.0F, true));

        this.Neck_r7 = new ModelRenderer(this);
        this.Neck_r7.setRotationPoint(-1.0F, 0.241F, -1.7053F);
        this.Bodymiddle.addChild(Neck_r7);
        this.setRotateAngle(Neck_r7, -0.005F, 0.193F, 1.1146F);
        this.Neck_r7.cubeList.add(new ModelBox(Neck_r7, 51, 16, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, true));

        this.Neck_r8 = new ModelRenderer(this);
        this.Neck_r8.setRotationPoint(-1.0F, 0.241F, -3.7053F);
        this.Bodymiddle.addChild(Neck_r8);
        this.setRotateAngle(Neck_r8, -0.0529F, 0.107F, 0.374F);
        this.Neck_r8.cubeList.add(new ModelBox(Neck_r8, 25, 28, -1.4097F, 1.4545F, -0.3777F, 0, 5, 1, 0.0F, true));

        this.Neck_r9 = new ModelRenderer(this);
        this.Neck_r9.setRotationPoint(-1.0F, 0.241F, -3.7053F);
        this.Bodymiddle.addChild(Neck_r9);
        this.setRotateAngle(Neck_r9, 0.0336F, 0.1145F, 1.1206F);
        this.Neck_r9.cubeList.add(new ModelBox(Neck_r9, 52, 31, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, true));

        this.Neck_r10 = new ModelRenderer(this);
        this.Neck_r10.setRotationPoint(-1.0F, 0.241F, -5.7053F);
        this.Bodymiddle.addChild(Neck_r10);
        this.setRotateAngle(Neck_r10, -0.0121F, 0.091F, 0.3781F);
        this.Neck_r10.cubeList.add(new ModelBox(Neck_r10, 5, 14, -1.4097F, 1.4545F, -0.3777F, 0, 6, 1, 0.0F, true));

        this.Neck_r11 = new ModelRenderer(this);
        this.Neck_r11.setRotationPoint(-1.0F, 0.241F, -5.7053F);
        this.Bodymiddle.addChild(Neck_r11);
        this.setRotateAngle(Neck_r11, 0.0527F, 0.0752F, 1.1224F);
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 53, 46, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, true));

        this.Neck_r12 = new ModelRenderer(this);
        this.Neck_r12.setRotationPoint(-1.0F, 0.241F, -7.7053F);
        this.Bodymiddle.addChild(Neck_r12);
        this.setRotateAngle(Neck_r12, 0.0286F, 0.0748F, 0.3814F);
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 60, 37, -1.4097F, 1.4545F, -0.3777F, 0, 7, 1, 0.0F, true));

        this.Neck_r13 = new ModelRenderer(this);
        this.Neck_r13.setRotationPoint(-1.0F, 0.241F, -7.7053F);
        this.Bodymiddle.addChild(Neck_r13);
        this.setRotateAngle(Neck_r13, 0.0716F, 0.0359F, 1.1234F);
        this.Neck_r13.cubeList.add(new ModelBox(Neck_r13, 55, 0, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, true));

        this.Neck_r14 = new ModelRenderer(this);
        this.Neck_r14.setRotationPoint(-1.0F, 0.241F, -9.7053F);
        this.Bodymiddle.addChild(Neck_r14);
        this.setRotateAngle(Neck_r14, 0.2298F, 0.1106F, 1.135F);
        this.Neck_r14.cubeList.add(new ModelBox(Neck_r14, 26, 61, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, true));

        this.Neck_r15 = new ModelRenderer(this);
        this.Neck_r15.setRotationPoint(-1.0F, 0.241F, -9.7053F);
        this.Bodymiddle.addChild(Neck_r15);
        this.setRotateAngle(Neck_r15, 0.0951F, 0.2365F, 0.3918F);
        this.Neck_r15.cubeList.add(new ModelBox(Neck_r15, 30, 60, -1.4097F, 1.4545F, -0.3777F, 0, 8, 1, 0.0F, true));

        this.Neck_r16 = new ModelRenderer(this);
        this.Neck_r16.setRotationPoint(1.0F, 0.241F, -1.7053F);
        this.Bodymiddle.addChild(Neck_r16);
        this.setRotateAngle(Neck_r16, -0.1349F, -0.1385F, -0.364F);
        this.Neck_r16.cubeList.add(new ModelBox(Neck_r16, 17, 36, 1.4097F, 1.4545F, -0.3777F, 0, 4, 1, 0.0F, false));

        this.Neck_r17 = new ModelRenderer(this);
        this.Neck_r17.setRotationPoint(1.0F, 0.241F, -1.7053F);
        this.Bodymiddle.addChild(Neck_r17);
        this.setRotateAngle(Neck_r17, -0.005F, -0.193F, -1.1146F);
        this.Neck_r17.cubeList.add(new ModelBox(Neck_r17, 51, 16, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r18 = new ModelRenderer(this);
        this.Neck_r18.setRotationPoint(1.0F, 0.241F, -3.7053F);
        this.Bodymiddle.addChild(Neck_r18);
        this.setRotateAngle(Neck_r18, -0.0529F, -0.107F, -0.374F);
        this.Neck_r18.cubeList.add(new ModelBox(Neck_r18, 25, 28, 1.4097F, 1.4545F, -0.3777F, 0, 5, 1, 0.0F, false));

        this.Neck_r19 = new ModelRenderer(this);
        this.Neck_r19.setRotationPoint(1.0F, 0.241F, -3.7053F);
        this.Bodymiddle.addChild(Neck_r19);
        this.setRotateAngle(Neck_r19, 0.0336F, -0.1145F, -1.1206F);
        this.Neck_r19.cubeList.add(new ModelBox(Neck_r19, 52, 31, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r20 = new ModelRenderer(this);
        this.Neck_r20.setRotationPoint(1.0F, 0.241F, -5.7053F);
        this.Bodymiddle.addChild(Neck_r20);
        this.setRotateAngle(Neck_r20, -0.0121F, -0.091F, -0.3781F);
        this.Neck_r20.cubeList.add(new ModelBox(Neck_r20, 5, 14, 1.4097F, 1.4545F, -0.3777F, 0, 6, 1, 0.0F, false));

        this.Neck_r21 = new ModelRenderer(this);
        this.Neck_r21.setRotationPoint(1.0F, 0.241F, -5.7053F);
        this.Bodymiddle.addChild(Neck_r21);
        this.setRotateAngle(Neck_r21, 0.0527F, -0.0752F, -1.1224F);
        this.Neck_r21.cubeList.add(new ModelBox(Neck_r21, 53, 46, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r22 = new ModelRenderer(this);
        this.Neck_r22.setRotationPoint(0.0F, -0.3274F, -20.0702F);
        this.Bodymiddle.addChild(Neck_r22);
        this.setRotateAngle(Neck_r22, -0.0873F, 0.0F, 0.0F);
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 40, 43, 0.0F, -3.6F, 17.9F, 0, 2, 1, 0.0F, false));
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 0, 44, 0.0F, -3.5F, 15.9F, 0, 2, 1, 0.0F, false));
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 9, 44, 0.0F, -3.4F, 13.9F, 0, 2, 1, 0.0F, false));
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 12, 44, 0.0F, -3.3F, 11.9F, 0, 2, 1, 0.0F, false));
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 45, 0, 0.0F, -3.1F, 9.9F, 0, 2, 1, 0.0F, false));

        this.Neck_r23 = new ModelRenderer(this);
        this.Neck_r23.setRotationPoint(1.0F, 0.241F, -7.7053F);
        this.Bodymiddle.addChild(Neck_r23);
        this.setRotateAngle(Neck_r23, 0.0286F, -0.0748F, -0.3814F);
        this.Neck_r23.cubeList.add(new ModelBox(Neck_r23, 60, 37, 1.4097F, 1.4545F, -0.3777F, 0, 7, 1, 0.0F, false));

        this.Neck_r24 = new ModelRenderer(this);
        this.Neck_r24.setRotationPoint(1.0F, 0.241F, -7.7053F);
        this.Bodymiddle.addChild(Neck_r24);
        this.setRotateAngle(Neck_r24, 0.0716F, -0.0359F, -1.1234F);
        this.Neck_r24.cubeList.add(new ModelBox(Neck_r24, 55, 0, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r25 = new ModelRenderer(this);
        this.Neck_r25.setRotationPoint(1.0F, 0.241F, -9.7053F);
        this.Bodymiddle.addChild(Neck_r25);
        this.setRotateAngle(Neck_r25, 0.0286F, -0.0748F, -0.3814F);
        this.Neck_r25.cubeList.add(new ModelBox(Neck_r25, 30, 60, 1.4097F, 1.4545F, -0.3777F, 0, 8, 1, 0.0F, false));

        this.Neck_r26 = new ModelRenderer(this);
        this.Neck_r26.setRotationPoint(1.0F, 0.241F, -9.7053F);
        this.Bodymiddle.addChild(Neck_r26);
        this.setRotateAngle(Neck_r26, 0.0716F, -0.0359F, -1.1234F);
        this.Neck_r26.cubeList.add(new ModelBox(Neck_r26, 26, 61, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.1511F, -11.1001F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1286F, 0.1278F, 0.0286F);


        this.Neck_r27 = new ModelRenderer(this);
        this.Neck_r27.setRotationPoint(-1.0F, 0.09F, -0.4052F);
        this.Bodyfront.addChild(Neck_r27);
        this.setRotateAngle(Neck_r27, -0.0607F, 0.0632F, 0.3736F);
        this.Neck_r27.cubeList.add(new ModelBox(Neck_r27, 40, 60, -1.4097F, 1.4545F, -0.3777F, 0, 7, 1, 0.0F, true));

        this.Neck_r28 = new ModelRenderer(this);
        this.Neck_r28.setRotationPoint(-1.0F, 0.09F, -0.4052F);
        this.Bodyfront.addChild(Neck_r28);
        this.setRotateAngle(Neck_r28, -0.002F, 0.0876F, 1.1172F);
        this.Neck_r28.cubeList.add(new ModelBox(Neck_r28, 14, 62, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, true));

        this.Neck_r29 = new ModelRenderer(this);
        this.Neck_r29.setRotationPoint(-1.0F, 0.09F, -2.4052F);
        this.Bodyfront.addChild(Neck_r29);
        this.setRotateAngle(Neck_r29, 0.0286F, 0.0748F, 0.3814F);
        this.Neck_r29.cubeList.add(new ModelBox(Neck_r29, 21, 52, -1.4097F, 1.4545F, -0.3777F, 0, 6, 1, 0.0F, true));

        this.Neck_r30 = new ModelRenderer(this);
        this.Neck_r30.setRotationPoint(-1.0F, 0.09F, -2.4052F);
        this.Bodyfront.addChild(Neck_r30);
        this.setRotateAngle(Neck_r30, 0.0716F, 0.0359F, 1.1234F);
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 63, 20, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, true));

        this.Neck_r31 = new ModelRenderer(this);
        this.Neck_r31.setRotationPoint(-1.0F, 0.09F, -4.4052F);
        this.Bodyfront.addChild(Neck_r31);
        this.setRotateAngle(Neck_r31, 0.0691F, 0.0585F, 0.3841F);
        this.Neck_r31.cubeList.add(new ModelBox(Neck_r31, 26, 45, -1.4097F, 1.4545F, -0.3777F, 0, 4, 1, 0.0F, true));

        this.Neck_r32 = new ModelRenderer(this);
        this.Neck_r32.setRotationPoint(-1.0F, 0.09F, -4.4052F);
        this.Bodyfront.addChild(Neck_r32);
        this.setRotateAngle(Neck_r32, 0.0905F, -0.0035F, 1.1237F);
        this.Neck_r32.cubeList.add(new ModelBox(Neck_r32, 63, 34, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, true));

        this.Neck_r33 = new ModelRenderer(this);
        this.Neck_r33.setRotationPoint(-1.0F, 0.09F, -6.4052F);
        this.Bodyfront.addChild(Neck_r33);
        this.setRotateAngle(Neck_r33, 0.0286F, 0.0748F, 0.3814F);
        this.Neck_r33.cubeList.add(new ModelBox(Neck_r33, 57, 63, -1.4097F, 1.4545F, -0.3777F, 0, 2, 1, 0.0F, true));

        this.Neck_r34 = new ModelRenderer(this);
        this.Neck_r34.setRotationPoint(-1.0F, 0.09F, -6.4052F);
        this.Bodyfront.addChild(Neck_r34);
        this.setRotateAngle(Neck_r34, 0.0716F, 0.0359F, 1.1234F);
        this.Neck_r34.cubeList.add(new ModelBox(Neck_r34, 63, 38, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, true));

        this.Neck_r35 = new ModelRenderer(this);
        this.Neck_r35.setRotationPoint(1.0F, 0.09F, -0.4052F);
        this.Bodyfront.addChild(Neck_r35);
        this.setRotateAngle(Neck_r35, -0.0447F, -0.1038F, -0.3749F);
        this.Neck_r35.cubeList.add(new ModelBox(Neck_r35, 40, 60, 1.4097F, 1.4545F, -0.3777F, 0, 7, 1, 0.0F, false));

        this.Neck_r36 = new ModelRenderer(this);
        this.Neck_r36.setRotationPoint(1.0F, 0.09F, -0.4052F);
        this.Bodyfront.addChild(Neck_r36);
        this.setRotateAngle(Neck_r36, 0.0375F, -0.1067F, -1.121F);
        this.Neck_r36.cubeList.add(new ModelBox(Neck_r36, 14, 62, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r37 = new ModelRenderer(this);
        this.Neck_r37.setRotationPoint(1.0F, 0.09F, -2.4052F);
        this.Bodyfront.addChild(Neck_r37);
        this.setRotateAngle(Neck_r37, 0.0716F, -0.0359F, -1.1234F);
        this.Neck_r37.cubeList.add(new ModelBox(Neck_r37, 63, 20, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r38 = new ModelRenderer(this);
        this.Neck_r38.setRotationPoint(1.0F, 0.09F, -2.4052F);
        this.Bodyfront.addChild(Neck_r38);
        this.setRotateAngle(Neck_r38, 0.0286F, -0.0748F, -0.3814F);
        this.Neck_r38.cubeList.add(new ModelBox(Neck_r38, 21, 52, 1.4097F, 1.4545F, -0.3777F, 0, 6, 1, 0.0F, false));

        this.Neck_r39 = new ModelRenderer(this);
        this.Neck_r39.setRotationPoint(1.0F, 0.09F, -4.4052F);
        this.Bodyfront.addChild(Neck_r39);
        this.setRotateAngle(Neck_r39, 0.0905F, 0.0035F, -1.1237F);
        this.Neck_r39.cubeList.add(new ModelBox(Neck_r39, 63, 34, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r40 = new ModelRenderer(this);
        this.Neck_r40.setRotationPoint(1.0F, 0.09F, -4.4052F);
        this.Bodyfront.addChild(Neck_r40);
        this.setRotateAngle(Neck_r40, 0.0691F, -0.0585F, -0.3841F);
        this.Neck_r40.cubeList.add(new ModelBox(Neck_r40, 26, 45, 1.4097F, 1.4545F, -0.3777F, 0, 4, 1, 0.0F, false));

        this.Neck_r41 = new ModelRenderer(this);
        this.Neck_r41.setRotationPoint(1.0F, 0.09F, -6.4052F);
        this.Bodyfront.addChild(Neck_r41);
        this.setRotateAngle(Neck_r41, 0.0716F, -0.0359F, -1.1234F);
        this.Neck_r41.cubeList.add(new ModelBox(Neck_r41, 63, 38, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r42 = new ModelRenderer(this);
        this.Neck_r42.setRotationPoint(1.0F, 0.09F, -6.4052F);
        this.Bodyfront.addChild(Neck_r42);
        this.setRotateAngle(Neck_r42, 0.0286F, -0.0748F, -0.3814F);
        this.Neck_r42.cubeList.add(new ModelBox(Neck_r42, 57, 63, 1.4097F, 1.4545F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-2.6762F, 6.2525F, -6.5401F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 1.0895F, -0.16F, 0.1809F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 44, 25, -2.3F, -2.0F, 0.2F, 5, 4, 1, 0.003F, true));

        this.Bodyfront_r2 = new ModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(-3.9191F, 3.7251F, -6.9118F);
        this.Bodyfront.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, 0.7898F, -0.2615F, 0.2964F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 19, 60, -0.5425F, -0.6526F, -1.0568F, 1, 3, 2, 0.003F, true));
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 55, 57, -0.5425F, -0.2526F, 0.6432F, 1, 2, 3, 0.0F, true));
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 31, 53, -0.5425F, -0.7526F, 3.6432F, 1, 3, 3, 0.003F, true));

        this.Bodyfront_r3 = new ModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(3.9191F, 3.7251F, -6.9118F);
        this.Bodyfront.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, 0.7898F, 0.2615F, -0.2964F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 31, 53, -0.4575F, -0.7526F, 3.6432F, 1, 3, 3, 0.003F, false));
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 19, 60, -0.4575F, -0.6526F, -1.0568F, 1, 3, 2, 0.003F, false));
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 55, 57, -0.4575F, -0.2526F, 0.6432F, 1, 2, 3, 0.0F, false));

        this.Bodyfront_r4 = new ModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(2.6762F, 6.2525F, -6.5401F);
        this.Bodyfront.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, 1.0895F, 0.16F, -0.1809F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 44, 25, -2.7F, -2.0F, 0.2F, 5, 4, 1, 0.003F, false));

        this.Bodyfront_r5 = new ModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(0.0F, -0.1903F, -6.8475F);
        this.Bodyfront.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, 0.0873F, 0.0F, 0.0F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 21, 28, -1.0F, -0.3F, 0.0F, 2, 2, 7, 0.003F, false));

        this.Neck_r43 = new ModelRenderer(this);
        this.Neck_r43.setRotationPoint(0.0F, -1.522F, -0.2459F);
        this.Bodyfront.addChild(Neck_r43);
        this.setRotateAngle(Neck_r43, -0.1745F, 0.0F, 0.0F);
        this.Neck_r43.cubeList.add(new ModelBox(Neck_r43, 22, 45, 0.0F, -1.0F, -0.4F, 0, 2, 1, 0.0F, false));

        this.Neck_r44 = new ModelRenderer(this);
        this.Neck_r44.setRotationPoint(0.0F, -0.4784F, -8.9701F);
        this.Bodyfront.addChild(Neck_r44);
        this.setRotateAngle(Neck_r44, -0.0873F, 0.0F, 0.0F);
        this.Neck_r44.cubeList.add(new ModelBox(Neck_r44, 48, 16, 0.0F, -2.5F, 6.1F, 0, 2, 1, 0.0F, false));
        this.Neck_r44.cubeList.add(new ModelBox(Neck_r44, 60, 63, 0.0F, -2.0F, 4.1F, 0, 2, 1, 0.0F, false));
        this.Neck_r44.cubeList.add(new ModelBox(Neck_r44, 63, 62, 0.0F, -1.4F, 2.1F, 0, 2, 1, 0.0F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.5097F, -6.4475F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, 0.1658F, -0.1999F, -0.0341F);
        this.Neck.cubeList.add(new ModelBox(Neck, 40, 43, -1.0F, -0.9882F, -4.0226F, 2, 2, 4, 0.0F, false));

        this.Neck_r45 = new ModelRenderer(this);
        this.Neck_r45.setRotationPoint(0.0F, -0.9882F, -2.5226F);
        this.Neck.addChild(Neck_r45);
        this.setRotateAngle(Neck_r45, -0.0873F, 0.0F, 0.0F);
        this.Neck_r45.cubeList.add(new ModelBox(Neck_r45, 64, 57, 0.0F, -1.2F, 0.5F, 0, 2, 1, 0.0F, false));
        this.Neck_r45.cubeList.add(new ModelBox(Neck_r45, 64, 57, 0.0F, -1.0F, -1.5F, 0, 2, 1, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, -0.0882F, -3.0226F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.1554F, -0.3846F, 0.0898F);


        this.Head_r1 = new ModelRenderer(this);
        this.Head_r1.setRotationPoint(-2.38F, 0.5002F, -4.983F);
        this.Head.addChild(Head_r1);
        this.setRotateAngle(Head_r1, 0.0293F, 0.01F, 0.9448F);
        this.Head_r1.cubeList.add(new ModelBox(Head_r1, 13, 19, -2.6372F, -0.6806F, 3.9303F, 2, 1, 1, -0.002F, true));

        this.Head_r2 = new ModelRenderer(this);
        this.Head_r2.setRotationPoint(-2.38F, 0.5002F, -4.983F);
        this.Head.addChild(Head_r2);
        this.setRotateAngle(Head_r2, 0.0379F, -0.6877F, 0.9204F);
        this.Head_r2.cubeList.add(new ModelBox(Head_r2, 33, 25, -0.8902F, -0.6806F, -0.3698F, 2, 1, 6, 0.0F, true));

        this.Head_r3 = new ModelRenderer(this);
        this.Head_r3.setRotationPoint(-2.98F, -0.7998F, -0.483F);
        this.Head.addChild(Head_r3);
        this.setRotateAngle(Head_r3, 0.0F, 0.3054F, 0.0F);
        this.Head_r3.cubeList.add(new ModelBox(Head_r3, 49, 39, -0.5F, -2.5F, -0.5F, 4, 5, 1, 0.002F, true));

        this.Head_r4 = new ModelRenderer(this);
        this.Head_r4.setRotationPoint(3.0F, -0.7998F, -0.483F);
        this.Head.addChild(Head_r4);
        this.setRotateAngle(Head_r4, 0.0F, -0.3054F, 0.0F);
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 49, 39, -3.5F, -2.5F, -0.5F, 4, 5, 1, 0.0F, false));

        this.Head_r5 = new ModelRenderer(this);
        this.Head_r5.setRotationPoint(2.4F, 0.5002F, -4.983F);
        this.Head.addChild(Head_r5);
        this.setRotateAngle(Head_r5, 0.0293F, -0.01F, -0.9448F);
        this.Head_r5.cubeList.add(new ModelBox(Head_r5, 13, 19, 0.6372F, -0.6806F, 3.9303F, 2, 1, 1, -0.002F, false));

        this.Head_r6 = new ModelRenderer(this);
        this.Head_r6.setRotationPoint(2.4F, 0.5002F, -4.983F);
        this.Head.addChild(Head_r6);
        this.setRotateAngle(Head_r6, 0.0379F, 0.6877F, -0.9204F);
        this.Head_r6.cubeList.add(new ModelBox(Head_r6, 33, 25, -1.1098F, -0.6806F, -0.3698F, 2, 1, 6, 0.0F, false));

        this.Head_r7 = new ModelRenderer(this);
        this.Head_r7.setRotationPoint(0.0F, 1.0002F, -0.883F);
        this.Head.addChild(Head_r7);
        this.setRotateAngle(Head_r7, -0.0785F, 0.0F, 0.0F);
        this.Head_r7.cubeList.add(new ModelBox(Head_r7, 47, 10, -1.0F, -0.3574F, -4.1522F, 2, 1, 4, 0.0F, false));

        this.Head_r8 = new ModelRenderer(this);
        this.Head_r8.setRotationPoint(0.0F, -2.9998F, -3.883F);
        this.Head.addChild(Head_r8);
        this.setRotateAngle(Head_r8, 0.1309F, 0.0F, 0.0F);
        this.Head_r8.cubeList.add(new ModelBox(Head_r8, 57, 22, -0.49F, 1.0F, -0.1F, 1, 3, 3, 0.0F, false));
        this.Head_r8.cubeList.add(new ModelBox(Head_r8, 13, 14, -1.0F, 0.0F, -0.1F, 2, 1, 3, 0.0F, false));

        this.Upperjaw1 = new ModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, -2.9998F, -3.983F);
        this.Head.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, 0.2335F, 0.0F, 0.0F);
        this.Upperjaw1.cubeList.add(new ModelBox(Upperjaw1, 32, 17, -3.0F, 0.0F, -3.0F, 6, 4, 3, 0.0F, false));
        this.Upperjaw1.cubeList.add(new ModelBox(Upperjaw1, 50, 61, 2.1F, 0.3F, -2.4F, 1, 2, 2, 0.0F, false));
        this.Upperjaw1.cubeList.add(new ModelBox(Upperjaw1, 50, 61, -3.08F, 0.3F, -2.4F, 1, 2, 2, 0.0F, true));

        this.Upperjaw2 = new ModelRenderer(this);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Upperjaw1.addChild(Upperjaw2);
        this.setRotateAngle(Upperjaw2, 0.3609F, 0.0F, 0.0F);
        this.Upperjaw2.cubeList.add(new ModelBox(Upperjaw2, 0, 36, -2.5F, 0.0F, -3.0F, 5, 4, 3, 0.0F, false));

        this.Upperbeak = new ModelRenderer(this);
        this.Upperbeak.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Upperjaw2.addChild(Upperbeak);
        this.setRotateAngle(Upperbeak, 0.6369F, 0.0F, 0.0F);
        this.Upperbeak.cubeList.add(new ModelBox(Upperbeak, 56, 6, -1.5F, 0.0F, -2.0F, 3, 3, 2, 0.0F, false));

        this.Righttusk = new ModelRenderer(this);
        this.Righttusk.setRotationPoint(1.9F, 2.5F, -2.5F);
        this.Upperjaw2.addChild(Righttusk);
        this.setRotateAngle(Righttusk, -0.6793F, 0.0F, 0.0F);
        this.Righttusk.cubeList.add(new ModelBox(Righttusk, 16, 0, -0.5F, -0.5F, -0.5F, 1, 3, 1, 0.0F, false));

        this.Lefttusk = new ModelRenderer(this);
        this.Lefttusk.setRotationPoint(-1.88F, 2.5F, -2.5F);
        this.Upperjaw2.addChild(Lefttusk);
        this.setRotateAngle(Lefttusk, -0.6793F, 0.0F, 0.0F);
        this.Lefttusk.cubeList.add(new ModelBox(Lefttusk, 16, 0, -0.5F, -0.5F, -0.5F, 1, 3, 1, 0.0F, true));

        this.Lowerjaw1 = new ModelRenderer(this);
        this.Lowerjaw1.setRotationPoint(0.0F, 0.7002F, -0.973F);
        this.Head.addChild(Lowerjaw1);
        this.setRotateAngle(Lowerjaw1, 0.1745F, 0.0F, 0.0F);
        this.Lowerjaw1.cubeList.add(new ModelBox(Lowerjaw1, 59, 0, 2.0F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));
        this.Lowerjaw1.cubeList.add(new ModelBox(Lowerjaw1, 59, 0, -2.98F, 0.0F, -3.0F, 1, 2, 3, 0.0F, true));

        this.Lowerjaw3_r1 = new ModelRenderer(this);
        this.Lowerjaw3_r1.setRotationPoint(-2.48F, 1.0F, -2.9F);
        this.Lowerjaw1.addChild(Lowerjaw3_r1);
        this.setRotateAngle(Lowerjaw3_r1, -0.3054F, 0.0F, 0.0F);
        this.Lowerjaw3_r1.cubeList.add(new ModelBox(Lowerjaw3_r1, 16, 28, -0.5F, 0.0F, -0.1F, 1, 1, 3, -0.003F, true));
        this.Lowerjaw3_r1.cubeList.add(new ModelBox(Lowerjaw3_r1, 16, 28, 4.48F, 0.0F, -0.1F, 1, 1, 3, -0.003F, false));

        this.Lowerjaw2 = new ModelRenderer(this);
        this.Lowerjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjaw1.addChild(Lowerjaw2);
        this.setRotateAngle(Lowerjaw2, 0.1485F, 0.0F, 0.0F);
        this.Lowerjaw2.cubeList.add(new ModelBox(Lowerjaw2, 0, 61, 1.5F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));
        this.Lowerjaw2.cubeList.add(new ModelBox(Lowerjaw2, 0, 61, -2.48F, 0.0F, -2.0F, 1, 2, 2, 0.0F, true));

        this.Lowerjaw3 = new ModelRenderer(this);
        this.Lowerjaw3.setRotationPoint(0.0F, 3.0F, -2.0F);
        this.Lowerjaw2.addChild(Lowerjaw3);
        this.setRotateAngle(Lowerjaw3, -0.1485F, 0.0F, 0.0F);
        this.Lowerjaw3.cubeList.add(new ModelBox(Lowerjaw3, 7, 61, 0.5F, -3.0F, -2.0F, 1, 2, 2, 0.0F, false));
        this.Lowerjaw3.cubeList.add(new ModelBox(Lowerjaw3, 7, 61, -1.48F, -3.0F, -2.0F, 1, 2, 2, 0.0F, true));

        this.Lowerjaw5_r1 = new ModelRenderer(this);
        this.Lowerjaw5_r1.setRotationPoint(-0.98F, 0.0F, -2.0F);
        this.Lowerjaw3.addChild(Lowerjaw5_r1);
        this.setRotateAngle(Lowerjaw5_r1, 0.3054F, 0.0F, 0.0F);
        this.Lowerjaw5_r1.cubeList.add(new ModelBox(Lowerjaw5_r1, 43, 60, -1.5F, -2.0F, 2.0F, 1, 2, 2, -0.005F, true));
        this.Lowerjaw5_r1.cubeList.add(new ModelBox(Lowerjaw5_r1, 27, 38, -0.5F, -2.0F, 0.0F, 1, 2, 2, -0.005F, true));
        this.Lowerjaw5_r1.cubeList.add(new ModelBox(Lowerjaw5_r1, 27, 38, 1.48F, -2.0F, 0.0F, 1, 2, 2, -0.005F, false));
        this.Lowerjaw5_r1.cubeList.add(new ModelBox(Lowerjaw5_r1, 43, 60, 2.48F, -2.0F, 2.0F, 1, 2, 2, -0.005F, false));

        this.Lowerjaw4 = new ModelRenderer(this);
        this.Lowerjaw4.setRotationPoint(0.01F, 0.0F, -1.6F);
        this.Lowerjaw3.addChild(Lowerjaw4);
        this.setRotateAngle(Lowerjaw4, -0.2759F, 0.0F, 0.0F);
        this.Lowerjaw4.cubeList.add(new ModelBox(Lowerjaw4, 59, 29, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.Lowerbeak = new ModelRenderer(this);
        this.Lowerbeak.setRotationPoint(-0.01F, -3.0F, -2.0F);
        this.Lowerjaw3.addChild(Lowerbeak);
        this.setRotateAngle(Lowerbeak, 0.2122F, 0.0F, 0.0F);
        this.Lowerbeak.cubeList.add(new ModelBox(Lowerbeak, 58, 52, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(5.5F, 4.3097F, -4.3475F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.4396F, -0.3124F, -1.0036F);


        this.Rightupperarm_r1 = new ModelRenderer(this);
        this.Rightupperarm_r1.setRotationPoint(0.0F, 2.25F, 0.0F);
        this.Rightupperarm.addChild(Rightupperarm_r1);
        this.setRotateAngle(Rightupperarm_r1, 0.0F, 0.0F, -0.3927F);
        this.Rightupperarm_r1.cubeList.add(new ModelBox(Rightupperarm_r1, 13, 45, -1.0F, -3.25F, -2.0F, 2, 2, 4, 0.0F, false));
        this.Rightupperarm_r1.cubeList.add(new ModelBox(Rightupperarm_r1, 58, 14, -1.0F, -1.25F, -1.0F, 2, 3, 2, 0.0F, false));
        this.Rightupperarm_r1.cubeList.add(new ModelBox(Rightupperarm_r1, 46, 0, -1.0F, 1.75F, -2.0F, 2, 1, 4, 0.0F, false));

        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.863F, 0.1863F, 1.3358F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 14, 52, 0.5F, -1.0F, -0.1F, 1, 7, 2, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 24, 51, -1.0F, -1.0F, -0.8F, 1, 7, 2, -0.2F, false));

        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 4.53F, 0.3F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.9841F, 0.2719F, -0.3277F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 0, 28, -2.3F, 0.0F, -3.5F, 5, 2, 5, 0.0F, false));

        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-5.5F, 4.3097F, -4.3475F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.1767F, 0.2517F, 0.3849F);


        this.Rightupperarm_r2 = new ModelRenderer(this);
        this.Rightupperarm_r2.setRotationPoint(0.0F, 2.25F, 0.0F);
        this.Leftupperarm.addChild(Rightupperarm_r2);
        this.setRotateAngle(Rightupperarm_r2, 0.0F, 0.0F, 0.3927F);
        this.Rightupperarm_r2.cubeList.add(new ModelBox(Rightupperarm_r2, 0, 44, -1.0F, -3.25F, -2.0F, 2, 2, 4, 0.0F, false));
        this.Rightupperarm_r2.cubeList.add(new ModelBox(Rightupperarm_r2, 33, 0, -1.0F, -1.25F, -1.0F, 2, 3, 2, 0.0F, false));
        this.Rightupperarm_r2.cubeList.add(new ModelBox(Rightupperarm_r2, 43, 33, -1.0F, 1.75F, -2.0F, 2, 1, 4, 0.0F, false));

        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.98F, -0.6525F, -0.6138F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 7, 51, -1.5F, -1.0F, -0.1F, 1, 7, 2, 0.0F, false));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 0, 51, 0.0F, -1.0F, -0.8F, 1, 7, 2, -0.2F, false));

        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 4.53F, 0.3F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 1.46F, 0.0F, 0.0F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 22, 9, -2.7F, 0.0F, -3.5F, 5, 2, 5, 0.0F, false));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -1.2003F, 13.581F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.5077F, -0.3869F, 0.207F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 56, 46, -1.0F, -1.0537F, -0.4356F, 2, 2, 3, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.0537F, 2.7644F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.6411F, -0.2229F, 0.4564F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 52, 31, -0.5F, -0.5349F, -0.6074F, 1, 1, 4, 0.003F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.1349F, 3.0926F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.3825F, -0.5761F, 0.2158F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 51, 16, -0.5F, -0.4498F, 0.087F, 1, 1, 4, 0.0F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.2F, 0.4997F, 10.181F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -1.8621F, -0.5133F, 0.0537F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 29, 43, -1.0F, -1.0F, -1.0F, 2, 6, 3, 0.0F, false));

        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.3864F, 5.0131F, 0.4087F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 2.3414F, -0.1468F, 0.5633F);


        this.Rightshin_r1 = new ModelRenderer(this);
        this.Rightshin_r1.setRotationPoint(-0.5712F, 0.2533F, 0.6388F);
        this.Rightshin.addChild(Rightshin_r1);
        this.setRotateAngle(Rightshin_r1, -0.0055F, -0.3486F, 0.0173F);
        this.Rightshin_r1.cubeList.add(new ModelBox(Rightshin_r1, 0, 25, -0.5288F, 0.2467F, 0.3612F, 1, 6, 1, 0.0F, false));
        this.Rightshin_r1.cubeList.add(new ModelBox(Rightshin_r1, 49, 50, -0.9288F, -0.7533F, -2.1388F, 2, 7, 2, 0.0F, false));

        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 5.5F, 0.4F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.0637F, -0.4245F, 0.0213F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 15, 19, -2.9F, 0.0F, -4.0F, 5, 2, 6, 0.0F, false));

        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.2F, 0.4997F, 10.181F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -1.8615F, 0.5014F, -0.0436F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 0, 0, -1.0F, -1.0F, -1.0F, 2, 6, 3, 0.0F, false));

        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.3864F, 5.0131F, 0.4087F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 2.2111F, 0.1446F, -0.5536F);


        this.Rightshin_r2 = new ModelRenderer(this);
        this.Rightshin_r2.setRotationPoint(0.5712F, 0.2533F, 0.6388F);
        this.Leftshin.addChild(Rightshin_r2);
        this.setRotateAngle(Rightshin_r2, -0.0055F, 0.3486F, -0.0173F);
        this.Rightshin_r2.cubeList.add(new ModelBox(Rightshin_r2, 0, 14, -0.4712F, 0.2467F, 0.3612F, 1, 6, 1, 0.0F, false));
        this.Rightshin_r2.cubeList.add(new ModelBox(Rightshin_r2, 40, 50, -1.0712F, -0.7533F, -2.1388F, 2, 7, 2, 0.0F, false));

        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 5.5F, 0.4F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.0637F, 0.4245F, -0.0213F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 16, 0, -2.1F, 0.0F, -4.0F, 5, 2, 6, 0.0F, false));

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
