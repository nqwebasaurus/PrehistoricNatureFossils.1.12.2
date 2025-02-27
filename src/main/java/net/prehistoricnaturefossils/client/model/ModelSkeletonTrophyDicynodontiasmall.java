package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTrophyDicynodontiasmall extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
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

    public ModelSkeletonTrophyDicynodontiasmall() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 53, -12.0F, -5.0F, -22.0F, 24, 5, 44, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -15.0F, -2.0F, -25.0F, 30, 2, 50, 0.005F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-12.0F, -5.0F, 0.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.7505F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 103, 0.0F, 0.0F, -7.0F, 2, 4, 14, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(2.0F, 5.6F, -1.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1274F, -0.3054F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 60, 103, -1.0F, -2.4003F, 5.681F, 2, 2, 8, 0.003F, false));

        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-2.0F, 2.0944F, 10.518F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.0123F, 0.0547F, -0.4419F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 65, 124, -0.1793F, -0.1188F, -1.7152F, 1, 4, 5, 0.003F, false));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(-2.7F, 0.0944F, 10.518F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.0076F, 0.0435F, -0.3465F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 125, 141, -0.2F, -1.0F, -0.7F, 1, 3, 2, 0.003F, false));

        this.Hips_r3 = new ModelRenderer(this);
        this.Hips_r3.setRotationPoint(-2.7F, -1.9003F, 10.681F);
        this.Hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.3491F, 0.0F, 0.0F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 15, 122, -0.5F, -1.1F, -3.0F, 1, 3, 6, 0.003F, false));
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 0, 122, 4.9F, -1.1F, -3.0F, 1, 3, 6, 0.003F, false));

        this.Hips_r4 = new ModelRenderer(this);
        this.Hips_r4.setRotationPoint(-1.5F, -1.7003F, 11.181F);
        this.Hips.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, -0.1309F, 0.0F, 0.0F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 30, 125, -1.0F, -0.5F, -2.5F, 2, 1, 5, 0.003F, false));
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 123, 112, 2.0F, -0.5F, -2.5F, 2, 1, 5, 0.003F, false));

        this.Hips_r5 = new ModelRenderer(this);
        this.Hips_r5.setRotationPoint(2.0F, 2.0944F, 10.518F);
        this.Hips.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, -0.0123F, -0.0547F, 0.4419F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 52, 124, -0.8207F, -0.1188F, -1.7152F, 1, 4, 5, 0.003F, false));

        this.Hips_r6 = new ModelRenderer(this);
        this.Hips_r6.setRotationPoint(2.7F, 0.0944F, 10.518F);
        this.Hips.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, -0.0076F, -0.0435F, 0.3465F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 98, 141, -0.8F, -1.0F, -0.7F, 1, 3, 2, 0.003F, false));

        this.Neck_r1 = new ModelRenderer(this);
        this.Neck_r1.setRotationPoint(-1.0F, -0.9593F, 6.1758F);
        this.Hips.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, -0.1349F, 0.1385F, 0.364F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 148, 65, -1.4097F, 1.4545F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r2 = new ModelRenderer(this);
        this.Neck_r2.setRotationPoint(-1.0F, -0.9593F, 6.1758F);
        this.Hips.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, -0.005F, 0.193F, 1.1146F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 147, 53, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r3 = new ModelRenderer(this);
        this.Neck_r3.setRotationPoint(1.0F, -0.9593F, 6.1758F);
        this.Hips.addChild(Neck_r3);
        this.setRotateAngle(Neck_r3, -0.1349F, -0.1385F, -0.364F);
        this.Neck_r3.cubeList.add(new ModelBox(Neck_r3, 148, 61, 1.4097F, 1.4545F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r4 = new ModelRenderer(this);
        this.Neck_r4.setRotationPoint(0.0F, -1.8277F, -14.0891F);
        this.Hips.addChild(Neck_r4);
        this.setRotateAngle(Neck_r4, -0.0873F, 0.0F, 0.0F);
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 48, 131, 0.0F, -3.6F, 25.7F, 0, 1, 1, 0.0F, false));
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 30, 122, 0.0F, -3.6F, 23.7F, 0, 1, 1, 0.0F, false));
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 146, 89, 0.0F, -3.6F, 21.7F, 0, 2, 1, 0.0F, false));
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 146, 85, 0.0F, -3.6F, 19.7F, 0, 2, 1, 0.0F, false));

        this.Neck_r5 = new ModelRenderer(this);
        this.Neck_r5.setRotationPoint(1.0F, -0.9593F, 6.1758F);
        this.Hips.addChild(Neck_r5);
        this.setRotateAngle(Neck_r5, -0.005F, -0.193F, -1.1146F);
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 42, 147, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -1.5003F, 5.981F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1739F, 0.215F, 0.0375F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 33, 103, -1.0F, -0.9489F, -11.1001F, 2, 2, 11, 0.0F, false));

        this.Neck_r6 = new ModelRenderer(this);
        this.Neck_r6.setRotationPoint(-1.0F, 0.241F, -1.7053F);
        this.Bodymiddle.addChild(Neck_r6);
        this.setRotateAngle(Neck_r6, -0.1349F, 0.1385F, 0.364F);
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 111, 145, -1.4097F, 1.4545F, -0.3777F, 0, 4, 1, 0.0F, false));

        this.Neck_r7 = new ModelRenderer(this);
        this.Neck_r7.setRotationPoint(-1.0F, 0.241F, -1.7053F);
        this.Bodymiddle.addChild(Neck_r7);
        this.setRotateAngle(Neck_r7, -0.005F, 0.193F, 1.1146F);
        this.Neck_r7.cubeList.add(new ModelBox(Neck_r7, 147, 57, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r8 = new ModelRenderer(this);
        this.Neck_r8.setRotationPoint(-1.0F, 0.241F, -3.7053F);
        this.Bodymiddle.addChild(Neck_r8);
        this.setRotateAngle(Neck_r8, -0.0529F, 0.107F, 0.374F);
        this.Neck_r8.cubeList.add(new ModelBox(Neck_r8, 84, 144, -1.4097F, 1.4545F, -0.3777F, 0, 5, 1, 0.0F, false));

        this.Neck_r9 = new ModelRenderer(this);
        this.Neck_r9.setRotationPoint(-1.0F, 0.241F, -3.7053F);
        this.Bodymiddle.addChild(Neck_r9);
        this.setRotateAngle(Neck_r9, 0.0336F, 0.1145F, 1.1206F);
        this.Neck_r9.cubeList.add(new ModelBox(Neck_r9, 96, 147, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r10 = new ModelRenderer(this);
        this.Neck_r10.setRotationPoint(-1.0F, 0.241F, -5.7053F);
        this.Bodymiddle.addChild(Neck_r10);
        this.setRotateAngle(Neck_r10, -0.0121F, 0.091F, 0.3781F);
        this.Neck_r10.cubeList.add(new ModelBox(Neck_r10, 144, 53, -1.4097F, 1.4545F, -0.3777F, 0, 6, 1, 0.0F, false));

        this.Neck_r11 = new ModelRenderer(this);
        this.Neck_r11.setRotationPoint(-1.0F, 0.241F, -5.7053F);
        this.Bodymiddle.addChild(Neck_r11);
        this.setRotateAngle(Neck_r11, 0.0527F, 0.0752F, 1.1224F);
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 99, 147, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r12 = new ModelRenderer(this);
        this.Neck_r12.setRotationPoint(-1.0F, 0.241F, -7.7053F);
        this.Bodymiddle.addChild(Neck_r12);
        this.setRotateAngle(Neck_r12, 0.0286F, 0.0748F, 0.3814F);
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 108, 141, -1.4097F, 1.4545F, -0.3777F, 0, 7, 1, 0.0F, false));

        this.Neck_r13 = new ModelRenderer(this);
        this.Neck_r13.setRotationPoint(-1.0F, 0.241F, -7.7053F);
        this.Bodymiddle.addChild(Neck_r13);
        this.setRotateAngle(Neck_r13, 0.0716F, 0.0359F, 1.1234F);
        this.Neck_r13.cubeList.add(new ModelBox(Neck_r13, 102, 147, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r14 = new ModelRenderer(this);
        this.Neck_r14.setRotationPoint(-1.0F, 0.241F, -9.7053F);
        this.Bodymiddle.addChild(Neck_r14);
        this.setRotateAngle(Neck_r14, 0.0716F, 0.0359F, 1.1234F);
        this.Neck_r14.cubeList.add(new ModelBox(Neck_r14, 147, 110, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r15 = new ModelRenderer(this);
        this.Neck_r15.setRotationPoint(-1.0F, 0.241F, -9.7053F);
        this.Bodymiddle.addChild(Neck_r15);
        this.setRotateAngle(Neck_r15, 0.0286F, 0.0748F, 0.3814F);
        this.Neck_r15.cubeList.add(new ModelBox(Neck_r15, 62, 141, -1.4097F, 1.4545F, -0.3777F, 0, 8, 1, 0.0F, false));

        this.Neck_r16 = new ModelRenderer(this);
        this.Neck_r16.setRotationPoint(1.0F, 0.241F, -1.7053F);
        this.Bodymiddle.addChild(Neck_r16);
        this.setRotateAngle(Neck_r16, -0.1349F, -0.1385F, -0.364F);
        this.Neck_r16.cubeList.add(new ModelBox(Neck_r16, 90, 144, 1.4097F, 1.4545F, -0.3777F, 0, 4, 1, 0.0F, false));

        this.Neck_r17 = new ModelRenderer(this);
        this.Neck_r17.setRotationPoint(1.0F, 0.241F, -1.7053F);
        this.Bodymiddle.addChild(Neck_r17);
        this.setRotateAngle(Neck_r17, -0.005F, -0.193F, -1.1146F);
        this.Neck_r17.cubeList.add(new ModelBox(Neck_r17, 39, 147, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r18 = new ModelRenderer(this);
        this.Neck_r18.setRotationPoint(1.0F, 0.241F, -3.7053F);
        this.Bodymiddle.addChild(Neck_r18);
        this.setRotateAngle(Neck_r18, -0.0529F, -0.107F, -0.374F);
        this.Neck_r18.cubeList.add(new ModelBox(Neck_r18, 81, 144, 1.4097F, 1.4545F, -0.3777F, 0, 5, 1, 0.0F, false));

        this.Neck_r19 = new ModelRenderer(this);
        this.Neck_r19.setRotationPoint(1.0F, 0.241F, -3.7053F);
        this.Bodymiddle.addChild(Neck_r19);
        this.setRotateAngle(Neck_r19, 0.0336F, -0.1145F, -1.1206F);
        this.Neck_r19.cubeList.add(new ModelBox(Neck_r19, 144, 146, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r20 = new ModelRenderer(this);
        this.Neck_r20.setRotationPoint(1.0F, 0.241F, -5.7053F);
        this.Bodymiddle.addChild(Neck_r20);
        this.setRotateAngle(Neck_r20, -0.0121F, -0.091F, -0.3781F);
        this.Neck_r20.cubeList.add(new ModelBox(Neck_r20, 53, 144, 1.4097F, 1.4545F, -0.3777F, 0, 6, 1, 0.0F, false));

        this.Neck_r21 = new ModelRenderer(this);
        this.Neck_r21.setRotationPoint(1.0F, 0.241F, -5.7053F);
        this.Bodymiddle.addChild(Neck_r21);
        this.setRotateAngle(Neck_r21, 0.0527F, -0.0752F, -1.1224F);
        this.Neck_r21.cubeList.add(new ModelBox(Neck_r21, 146, 142, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r22 = new ModelRenderer(this);
        this.Neck_r22.setRotationPoint(0.0F, -0.3274F, -20.0702F);
        this.Bodymiddle.addChild(Neck_r22);
        this.setRotateAngle(Neck_r22, -0.0873F, 0.0F, 0.0F);
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 146, 81, 0.0F, -3.6F, 17.9F, 0, 2, 1, 0.0F, false));
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 120, 145, 0.0F, -3.5F, 15.9F, 0, 2, 1, 0.0F, false));
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 117, 145, 0.0F, -3.4F, 13.9F, 0, 2, 1, 0.0F, false));
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 138, 115, 0.0F, -3.3F, 11.9F, 0, 2, 1, 0.0F, false));
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 75, 134, 0.0F, -3.1F, 9.9F, 0, 2, 1, 0.0F, false));

        this.Neck_r23 = new ModelRenderer(this);
        this.Neck_r23.setRotationPoint(1.0F, 0.241F, -7.7053F);
        this.Bodymiddle.addChild(Neck_r23);
        this.setRotateAngle(Neck_r23, 0.0286F, -0.0748F, -0.3814F);
        this.Neck_r23.cubeList.add(new ModelBox(Neck_r23, 105, 141, 1.4097F, 1.4545F, -0.3777F, 0, 7, 1, 0.0F, false));

        this.Neck_r24 = new ModelRenderer(this);
        this.Neck_r24.setRotationPoint(1.0F, 0.241F, -7.7053F);
        this.Bodymiddle.addChild(Neck_r24);
        this.setRotateAngle(Neck_r24, 0.0716F, -0.0359F, -1.1234F);
        this.Neck_r24.cubeList.add(new ModelBox(Neck_r24, 141, 146, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r25 = new ModelRenderer(this);
        this.Neck_r25.setRotationPoint(1.0F, 0.241F, -9.7053F);
        this.Bodymiddle.addChild(Neck_r25);
        this.setRotateAngle(Neck_r25, 0.0286F, -0.0748F, -0.3814F);
        this.Neck_r25.cubeList.add(new ModelBox(Neck_r25, 36, 138, 1.4097F, 1.4545F, -0.3777F, 0, 8, 1, 0.0F, false));

        this.Neck_r26 = new ModelRenderer(this);
        this.Neck_r26.setRotationPoint(1.0F, 0.241F, -9.7053F);
        this.Bodymiddle.addChild(Neck_r26);
        this.setRotateAngle(Neck_r26, 0.0716F, -0.0359F, -1.1234F);
        this.Neck_r26.cubeList.add(new ModelBox(Neck_r26, 146, 138, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.1511F, -11.1001F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1345F, 0.3474F, 0.0165F);


        this.Neck_r27 = new ModelRenderer(this);
        this.Neck_r27.setRotationPoint(-1.0F, 0.09F, -0.4052F);
        this.Bodyfront.addChild(Neck_r27);
        this.setRotateAngle(Neck_r27, -0.0447F, 0.1038F, 0.3749F);
        this.Neck_r27.cubeList.add(new ModelBox(Neck_r27, 21, 144, -1.4097F, 1.4545F, -0.3777F, 0, 7, 1, 0.0F, false));

        this.Neck_r28 = new ModelRenderer(this);
        this.Neck_r28.setRotationPoint(-1.0F, 0.09F, -0.4052F);
        this.Bodyfront.addChild(Neck_r28);
        this.setRotateAngle(Neck_r28, 0.0375F, 0.1067F, 1.121F);
        this.Neck_r28.cubeList.add(new ModelBox(Neck_r28, 123, 147, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r29 = new ModelRenderer(this);
        this.Neck_r29.setRotationPoint(-1.0F, 0.09F, -2.4052F);
        this.Bodyfront.addChild(Neck_r29);
        this.setRotateAngle(Neck_r29, 0.0286F, 0.0748F, 0.3814F);
        this.Neck_r29.cubeList.add(new ModelBox(Neck_r29, 68, 144, -1.4097F, 1.4545F, -0.3777F, 0, 6, 1, 0.0F, false));

        this.Neck_r30 = new ModelRenderer(this);
        this.Neck_r30.setRotationPoint(-1.0F, 0.09F, -2.4052F);
        this.Bodyfront.addChild(Neck_r30);
        this.setRotateAngle(Neck_r30, 0.0716F, 0.0359F, 1.1234F);
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 126, 147, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r31 = new ModelRenderer(this);
        this.Neck_r31.setRotationPoint(-1.0F, 0.09F, -4.4052F);
        this.Bodyfront.addChild(Neck_r31);
        this.setRotateAngle(Neck_r31, 0.0691F, 0.0585F, 0.3841F);
        this.Neck_r31.cubeList.add(new ModelBox(Neck_r31, 114, 145, -1.4097F, 1.4545F, -0.3777F, 0, 4, 1, 0.0F, false));

        this.Neck_r32 = new ModelRenderer(this);
        this.Neck_r32.setRotationPoint(-1.0F, 0.09F, -4.4052F);
        this.Bodyfront.addChild(Neck_r32);
        this.setRotateAngle(Neck_r32, 0.0905F, -0.0035F, 1.1237F);
        this.Neck_r32.cubeList.add(new ModelBox(Neck_r32, 129, 147, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r33 = new ModelRenderer(this);
        this.Neck_r33.setRotationPoint(-1.0F, 0.09F, -6.4052F);
        this.Bodyfront.addChild(Neck_r33);
        this.setRotateAngle(Neck_r33, 0.0286F, 0.0748F, 0.3814F);
        this.Neck_r33.cubeList.add(new ModelBox(Neck_r33, 148, 69, -1.4097F, 1.4545F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r34 = new ModelRenderer(this);
        this.Neck_r34.setRotationPoint(-1.0F, 0.09F, -6.4052F);
        this.Bodyfront.addChild(Neck_r34);
        this.setRotateAngle(Neck_r34, 0.0716F, 0.0359F, 1.1234F);
        this.Neck_r34.cubeList.add(new ModelBox(Neck_r34, 147, 146, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r35 = new ModelRenderer(this);
        this.Neck_r35.setRotationPoint(1.0F, 0.09F, -0.4052F);
        this.Bodyfront.addChild(Neck_r35);
        this.setRotateAngle(Neck_r35, -0.0447F, -0.1038F, -0.3749F);
        this.Neck_r35.cubeList.add(new ModelBox(Neck_r35, 65, 141, 1.4097F, 1.4545F, -0.3777F, 0, 7, 1, 0.0F, false));

        this.Neck_r36 = new ModelRenderer(this);
        this.Neck_r36.setRotationPoint(1.0F, 0.09F, -0.4052F);
        this.Bodyfront.addChild(Neck_r36);
        this.setRotateAngle(Neck_r36, 0.0375F, -0.1067F, -1.121F);
        this.Neck_r36.cubeList.add(new ModelBox(Neck_r36, 138, 146, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r37 = new ModelRenderer(this);
        this.Neck_r37.setRotationPoint(1.0F, 0.09F, -2.4052F);
        this.Bodyfront.addChild(Neck_r37);
        this.setRotateAngle(Neck_r37, 0.0716F, -0.0359F, -1.1234F);
        this.Neck_r37.cubeList.add(new ModelBox(Neck_r37, 135, 146, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r38 = new ModelRenderer(this);
        this.Neck_r38.setRotationPoint(1.0F, 0.09F, -2.4052F);
        this.Bodyfront.addChild(Neck_r38);
        this.setRotateAngle(Neck_r38, 0.0286F, -0.0748F, -0.3814F);
        this.Neck_r38.cubeList.add(new ModelBox(Neck_r38, 31, 144, 1.4097F, 1.4545F, -0.3777F, 0, 6, 1, 0.0F, false));

        this.Neck_r39 = new ModelRenderer(this);
        this.Neck_r39.setRotationPoint(1.0F, 0.09F, -4.4052F);
        this.Bodyfront.addChild(Neck_r39);
        this.setRotateAngle(Neck_r39, 0.0905F, 0.0035F, -1.1237F);
        this.Neck_r39.cubeList.add(new ModelBox(Neck_r39, 146, 134, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r40 = new ModelRenderer(this);
        this.Neck_r40.setRotationPoint(1.0F, 0.09F, -4.4052F);
        this.Bodyfront.addChild(Neck_r40);
        this.setRotateAngle(Neck_r40, 0.0691F, -0.0585F, -0.3841F);
        this.Neck_r40.cubeList.add(new ModelBox(Neck_r40, 87, 144, 1.4097F, 1.4545F, -0.3777F, 0, 4, 1, 0.0F, false));

        this.Neck_r41 = new ModelRenderer(this);
        this.Neck_r41.setRotationPoint(1.0F, 0.09F, -6.4052F);
        this.Bodyfront.addChild(Neck_r41);
        this.setRotateAngle(Neck_r41, 0.0716F, -0.0359F, -1.1234F);
        this.Neck_r41.cubeList.add(new ModelBox(Neck_r41, 132, 146, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r42 = new ModelRenderer(this);
        this.Neck_r42.setRotationPoint(1.0F, 0.09F, -6.4052F);
        this.Bodyfront.addChild(Neck_r42);
        this.setRotateAngle(Neck_r42, 0.0286F, -0.0748F, -0.3814F);
        this.Neck_r42.cubeList.add(new ModelBox(Neck_r42, 34, 148, 1.4097F, 1.4545F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-2.6762F, 6.2525F, -6.5401F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 1.0895F, -0.16F, 0.1809F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 13, 132, -2.3F, -2.0F, 0.2F, 5, 4, 1, 0.003F, false));

        this.Bodyfront_r2 = new ModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(-3.9191F, 3.7251F, -6.9118F);
        this.Bodyfront.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, 0.7898F, -0.2615F, 0.2964F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 52, 117, -0.5425F, -0.6526F, -1.0568F, 1, 3, 2, 0.003F, false));
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 75, 138, -0.5425F, -0.2526F, 0.6432F, 1, 2, 3, 0.0F, false));
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 137, 88, -0.5425F, -0.7526F, 3.6432F, 1, 3, 3, 0.003F, false));

        this.Bodyfront_r3 = new ModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(3.9191F, 3.7251F, -6.9118F);
        this.Bodyfront.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, 0.7898F, 0.2615F, -0.2964F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 137, 81, -0.4575F, -0.7526F, 3.6432F, 1, 3, 3, 0.003F, false));
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 45, 125, -0.4575F, -0.6526F, -1.0568F, 1, 3, 2, 0.003F, false));
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 84, 138, -0.4575F, -0.2526F, 0.6432F, 1, 2, 3, 0.0F, false));

        this.Bodyfront_r4 = new ModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(2.6762F, 6.2525F, -6.5401F);
        this.Bodyfront.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, 1.0895F, 0.16F, -0.1809F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 130, 119, -2.7F, -2.0F, 0.2F, 5, 4, 1, 0.003F, false));

        this.Bodyfront_r5 = new ModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(0.0F, -0.1903F, -6.8475F);
        this.Bodyfront.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, 0.0873F, 0.0F, 0.0F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 60, 114, -1.0F, -0.3F, 0.0F, 2, 2, 7, 0.003F, false));

        this.Neck_r43 = new ModelRenderer(this);
        this.Neck_r43.setRotationPoint(0.0F, -1.522F, -0.2459F);
        this.Bodyfront.addChild(Neck_r43);
        this.setRotateAngle(Neck_r43, -0.1745F, 0.0F, 0.0F);
        this.Neck_r43.cubeList.add(new ModelBox(Neck_r43, 146, 130, 0.0F, -1.0F, -0.4F, 0, 2, 1, 0.0F, false));

        this.Neck_r44 = new ModelRenderer(this);
        this.Neck_r44.setRotationPoint(0.0F, -0.4784F, -8.9701F);
        this.Bodyfront.addChild(Neck_r44);
        this.setRotateAngle(Neck_r44, -0.0873F, 0.0F, 0.0F);
        this.Neck_r44.cubeList.add(new ModelBox(Neck_r44, 93, 146, 0.0F, -2.5F, 6.1F, 0, 2, 1, 0.0F, false));
        this.Neck_r44.cubeList.add(new ModelBox(Neck_r44, 148, 73, 0.0F, -2.0F, 4.1F, 0, 2, 1, 0.0F, false));
        this.Neck_r44.cubeList.add(new ModelBox(Neck_r44, 148, 93, 0.0F, -1.4F, 2.1F, 0, 2, 1, 0.0F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.5097F, -6.4475F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.4995F, 0.6517F, -0.0649F);
        this.Neck.cubeList.add(new ModelBox(Neck, 127, 103, -1.0F, -0.9882F, -4.0226F, 2, 2, 4, 0.0F, false));

        this.Neck_r45 = new ModelRenderer(this);
        this.Neck_r45.setRotationPoint(0.0F, -0.9882F, -2.5226F);
        this.Neck.addChild(Neck_r45);
        this.setRotateAngle(Neck_r45, -0.0873F, 0.0F, 0.0F);
        this.Neck_r45.cubeList.add(new ModelBox(Neck_r45, 148, 125, 0.0F, -1.2F, 0.5F, 0, 2, 1, 0.0F, false));
        this.Neck_r45.cubeList.add(new ModelBox(Neck_r45, 148, 77, 0.0F, -1.0F, -1.5F, 0, 2, 1, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, -0.0882F, -3.0226F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.2878F, 0.6107F, 0.0149F);


        this.Head_r1 = new ModelRenderer(this);
        this.Head_r1.setRotationPoint(-2.38F, 0.5002F, -4.983F);
        this.Head.addChild(Head_r1);
        this.setRotateAngle(Head_r1, 0.0293F, 0.01F, 0.9448F);
        this.Head_r1.cubeList.add(new ModelBox(Head_r1, 139, 130, -2.6372F, -0.6806F, 3.9303F, 2, 1, 1, -0.002F, false));

        this.Head_r2 = new ModelRenderer(this);
        this.Head_r2.setRotationPoint(-2.38F, 0.5002F, -4.983F);
        this.Head.addChild(Head_r2);
        this.setRotateAngle(Head_r2, 0.0379F, -0.6877F, 0.9204F);
        this.Head_r2.cubeList.add(new ModelBox(Head_r2, 96, 120, -0.8902F, -0.6806F, -0.3698F, 2, 1, 6, 0.0F, false));

        this.Head_r3 = new ModelRenderer(this);
        this.Head_r3.setRotationPoint(-2.98F, -0.7998F, -0.483F);
        this.Head.addChild(Head_r3);
        this.setRotateAngle(Head_r3, 0.0F, 0.3054F, 0.0F);
        this.Head_r3.cubeList.add(new ModelBox(Head_r3, 126, 134, -0.5F, -2.5F, -0.5F, 4, 5, 1, 0.002F, false));

        this.Head_r4 = new ModelRenderer(this);
        this.Head_r4.setRotationPoint(3.0F, -0.7998F, -0.483F);
        this.Head.addChild(Head_r4);
        this.setRotateAngle(Head_r4, 0.0F, -0.3054F, 0.0F);
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 57, 134, -3.5F, -2.5F, -0.5F, 4, 5, 1, 0.0F, false));

        this.Head_r5 = new ModelRenderer(this);
        this.Head_r5.setRotationPoint(2.4F, 0.5002F, -4.983F);
        this.Head.addChild(Head_r5);
        this.setRotateAngle(Head_r5, 0.0293F, -0.01F, -0.9448F);
        this.Head_r5.cubeList.add(new ModelBox(Head_r5, 130, 125, 0.6372F, -0.6806F, 3.9303F, 2, 1, 1, -0.002F, false));

        this.Head_r6 = new ModelRenderer(this);
        this.Head_r6.setRotationPoint(2.4F, 0.5002F, -4.983F);
        this.Head.addChild(Head_r6);
        this.setRotateAngle(Head_r6, 0.0379F, 0.6877F, -0.9204F);
        this.Head_r6.cubeList.add(new ModelBox(Head_r6, 79, 120, -1.1098F, -0.6806F, -0.3698F, 2, 1, 6, 0.0F, false));

        this.Head_r7 = new ModelRenderer(this);
        this.Head_r7.setRotationPoint(0.0F, 1.0002F, -0.883F);
        this.Head.addChild(Head_r7);
        this.setRotateAngle(Head_r7, -0.0785F, 0.0F, 0.0F);
        this.Head_r7.cubeList.add(new ModelBox(Head_r7, 26, 132, -1.0F, -0.3574F, -4.1522F, 2, 1, 4, 0.0F, false));

        this.Head_r8 = new ModelRenderer(this);
        this.Head_r8.setRotationPoint(0.0F, -2.9998F, -3.883F);
        this.Head.addChild(Head_r8);
        this.setRotateAngle(Head_r8, 0.1309F, 0.0F, 0.0F);
        this.Head_r8.cubeList.add(new ModelBox(Head_r8, 137, 134, -0.49F, 1.0F, -0.1F, 1, 3, 3, 0.0F, false));
        this.Head_r8.cubeList.add(new ModelBox(Head_r8, 137, 95, -1.0F, 0.0F, -0.1F, 2, 1, 3, 0.0F, false));

        this.Upperjaw1 = new ModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, -2.9998F, -3.983F);
        this.Head.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, 0.2335F, 0.0F, 0.0F);
        this.Upperjaw1.cubeList.add(new ModelBox(Upperjaw1, 33, 117, -3.0F, 0.0F, -3.0F, 6, 4, 3, 0.0F, false));
        this.Upperjaw1.cubeList.add(new ModelBox(Upperjaw1, 24, 144, 2.1F, 0.3F, -2.4F, 1, 2, 2, 0.0F, false));
        this.Upperjaw1.cubeList.add(new ModelBox(Upperjaw1, 46, 144, -3.08F, 0.3F, -2.4F, 1, 2, 2, 0.0F, false));

        this.Upperjaw2 = new ModelRenderer(this);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Upperjaw1.addChild(Upperjaw2);
        this.setRotateAngle(Upperjaw2, 0.3609F, 0.0F, 0.0F);
        this.Upperjaw2.cubeList.add(new ModelBox(Upperjaw2, 113, 120, -2.5F, 0.0F, -3.0F, 5, 4, 3, 0.0F, false));

        this.Upperbeak = new ModelRenderer(this);
        this.Upperbeak.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Upperjaw2.addChild(Upperbeak);
        this.setRotateAngle(Upperbeak, 0.6369F, 0.0F, 0.0F);
        this.Upperbeak.cubeList.add(new ModelBox(Upperbeak, 137, 69, -1.5F, 0.0F, -2.0F, 3, 3, 2, 0.0F, false));

        this.Righttusk = new ModelRenderer(this);
        this.Righttusk.setRotationPoint(1.9F, 2.5F, -2.5F);
        this.Upperjaw2.addChild(Righttusk);
        this.setRotateAngle(Righttusk, -0.6793F, 0.0F, 0.0F);
        this.Righttusk.cubeList.add(new ModelBox(Righttusk, 71, 144, -0.5F, -0.5F, -0.5F, 1, 3, 1, 0.0F, false));

        this.Lefttusk = new ModelRenderer(this);
        this.Lefttusk.setRotationPoint(-1.88F, 2.5F, -2.5F);
        this.Upperjaw2.addChild(Lefttusk);
        this.setRotateAngle(Lefttusk, -0.6793F, 0.0F, 0.0F);
        this.Lefttusk.cubeList.add(new ModelBox(Lefttusk, 76, 144, -0.5F, -0.5F, -0.5F, 1, 3, 1, 0.0F, false));

        this.Lowerjaw1 = new ModelRenderer(this);
        this.Lowerjaw1.setRotationPoint(0.0F, 0.7002F, -0.973F);
        this.Head.addChild(Lowerjaw1);
        this.setRotateAngle(Lowerjaw1, 0.5672F, 0.0F, 0.0F);
        this.Lowerjaw1.cubeList.add(new ModelBox(Lowerjaw1, 0, 138, 2.0F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));
        this.Lowerjaw1.cubeList.add(new ModelBox(Lowerjaw1, 27, 138, -2.98F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.Lowerjaw3_r1 = new ModelRenderer(this);
        this.Lowerjaw3_r1.setRotationPoint(-2.48F, 1.0F, -2.9F);
        this.Lowerjaw1.addChild(Lowerjaw3_r1);
        this.setRotateAngle(Lowerjaw3_r1, -0.3054F, 0.0F, 0.0F);
        this.Lowerjaw3_r1.cubeList.add(new ModelBox(Lowerjaw3_r1, 140, 105, -0.5F, 0.0F, -0.1F, 1, 1, 3, -0.003F, false));
        this.Lowerjaw3_r1.cubeList.add(new ModelBox(Lowerjaw3_r1, 140, 100, 4.48F, 0.0F, -0.1F, 1, 1, 3, -0.003F, false));

        this.Lowerjaw2 = new ModelRenderer(this);
        this.Lowerjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjaw1.addChild(Lowerjaw2);
        this.setRotateAngle(Lowerjaw2, 0.1485F, 0.0F, 0.0F);
        this.Lowerjaw2.cubeList.add(new ModelBox(Lowerjaw2, 139, 141, 1.5F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));
        this.Lowerjaw2.cubeList.add(new ModelBox(Lowerjaw2, 0, 144, -2.48F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.Lowerjaw3 = new ModelRenderer(this);
        this.Lowerjaw3.setRotationPoint(0.0F, 3.0F, -2.0F);
        this.Lowerjaw2.addChild(Lowerjaw3);
        this.setRotateAngle(Lowerjaw3, -0.1485F, 0.0F, 0.0F);
        this.Lowerjaw3.cubeList.add(new ModelBox(Lowerjaw3, 132, 141, 0.5F, -3.0F, -2.0F, 1, 2, 2, 0.0F, false));
        this.Lowerjaw3.cubeList.add(new ModelBox(Lowerjaw3, 7, 144, -1.48F, -3.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.Lowerjaw5_r1 = new ModelRenderer(this);
        this.Lowerjaw5_r1.setRotationPoint(-0.98F, 0.0F, -2.0F);
        this.Lowerjaw3.addChild(Lowerjaw5_r1);
        this.setRotateAngle(Lowerjaw5_r1, 0.3054F, 0.0F, 0.0F);
        this.Lowerjaw5_r1.cubeList.add(new ModelBox(Lowerjaw5_r1, 143, 120, -1.5F, -2.0F, 2.0F, 1, 2, 2, -0.005F, false));
        this.Lowerjaw5_r1.cubeList.add(new ModelBox(Lowerjaw5_r1, 14, 144, -0.5F, -2.0F, 0.0F, 1, 2, 2, -0.005F, false));
        this.Lowerjaw5_r1.cubeList.add(new ModelBox(Lowerjaw5_r1, 143, 115, 1.48F, -2.0F, 0.0F, 1, 2, 2, -0.005F, false));
        this.Lowerjaw5_r1.cubeList.add(new ModelBox(Lowerjaw5_r1, 39, 142, 2.48F, -2.0F, 2.0F, 1, 2, 2, -0.005F, false));

        this.Lowerjaw4 = new ModelRenderer(this);
        this.Lowerjaw4.setRotationPoint(0.01F, 0.0F, -1.6F);
        this.Lowerjaw3.addChild(Lowerjaw4);
        this.setRotateAngle(Lowerjaw4, -0.2759F, 0.0F, 0.0F);
        this.Lowerjaw4.cubeList.add(new ModelBox(Lowerjaw4, 138, 110, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.Lowerbeak = new ModelRenderer(this);
        this.Lowerbeak.setRotationPoint(-0.01F, -3.0F, -2.0F);
        this.Lowerjaw3.addChild(Lowerbeak);
        this.setRotateAngle(Lowerbeak, 0.2122F, 0.0F, 0.0F);
        this.Lowerbeak.cubeList.add(new ModelBox(Lowerbeak, 139, 125, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(5.5F, 4.3097F, -4.3475F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 1.1815F, -0.1852F, -0.8606F);


        this.Rightupperarm_r1 = new ModelRenderer(this);
        this.Rightupperarm_r1.setRotationPoint(0.0F, 2.25F, 0.0F);
        this.Rightupperarm.addChild(Rightupperarm_r1);
        this.setRotateAngle(Rightupperarm_r1, 0.0F, 0.0F, -0.3927F);
        this.Rightupperarm_r1.cubeList.add(new ModelBox(Rightupperarm_r1, 100, 128, -1.0F, -3.25F, -2.0F, 2, 2, 4, 0.0F, false));
        this.Rightupperarm_r1.cubeList.add(new ModelBox(Rightupperarm_r1, 9, 138, -1.0F, -1.25F, -1.0F, 2, 3, 2, 0.0F, false));
        this.Rightupperarm_r1.cubeList.add(new ModelBox(Rightupperarm_r1, 126, 128, -1.0F, 1.75F, -2.0F, 2, 1, 4, 0.0F, false));

        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -1.46F, 0.4967F, 1.0615F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 68, 134, 0.5F, -1.0F, -0.1F, 1, 7, 2, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 111, 135, -1.0F, -1.0F, -0.8F, 1, 7, 2, -0.2F, false));

        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 4.53F, 0.3F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 1.4163F, 0.0F, 0.0F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 81, 112, -2.3F, 0.0F, -3.5F, 5, 2, 5, 0.0F, false));

        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-5.5F, 4.3097F, -4.3475F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.2913F, 0.0F, 0.9765F);


        this.Rightupperarm_r2 = new ModelRenderer(this);
        this.Rightupperarm_r2.setRotationPoint(0.0F, 2.25F, 0.0F);
        this.Leftupperarm.addChild(Rightupperarm_r2);
        this.setRotateAngle(Rightupperarm_r2, 0.0F, 0.0F, 0.3927F);
        this.Rightupperarm_r2.cubeList.add(new ModelBox(Rightupperarm_r2, 113, 128, -1.0F, -3.25F, -2.0F, 2, 2, 4, 0.0F, false));
        this.Rightupperarm_r2.cubeList.add(new ModelBox(Rightupperarm_r2, 18, 138, -1.0F, -1.25F, -1.0F, 2, 3, 2, 0.0F, false));
        this.Rightupperarm_r2.cubeList.add(new ModelBox(Rightupperarm_r2, 0, 132, -1.0F, 1.75F, -2.0F, 2, 1, 4, 0.0F, false));

        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.3821F, -0.1061F, -1.0189F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 118, 135, -1.5F, -1.0F, -0.1F, 1, 7, 2, 0.0F, false));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 137, 53, 0.0F, -1.0F, -0.8F, 1, 7, 2, -0.2F, false));

        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(-0.0077F, 4.8088F, 0.4105F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.3691F, 0.0F, 0.0F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 102, 112, -2.7F, 0.0F, -3.5F, 5, 2, 5, 0.0F, false));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -1.2003F, 13.581F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.0724F, 0.4353F, -0.0306F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 137, 75, -1.0F, -1.0537F, -0.4356F, 2, 2, 3, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.0537F, 2.7644F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.3565F, 0.3731F, -0.2318F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 137, 63, -0.5F, -0.5349F, -0.6074F, 1, 1, 4, 0.003F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.1349F, 3.0926F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.7288F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 100, 135, -0.5F, -0.4498F, 0.087F, 1, 1, 4, 0.0F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.2F, 0.4997F, 10.181F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.2889F, 0.0F, -0.5095F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 78, 128, -1.0F, -1.0F, -1.0F, 2, 6, 3, 0.0F, false));

        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.3864F, 5.0131F, 0.4087F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.3396F, -0.0213F, 0.5308F);


        this.Rightshin_r1 = new ModelRenderer(this);
        this.Rightshin_r1.setRotationPoint(-0.5712F, 0.2533F, 0.6388F);
        this.Rightshin.addChild(Rightshin_r1);
        this.setRotateAngle(Rightshin_r1, -0.0055F, -0.3486F, 0.0173F);
        this.Rightshin_r1.cubeList.add(new ModelBox(Rightshin_r1, 93, 138, -0.5288F, 0.2467F, 0.3612F, 1, 6, 1, 0.0F, false));
        this.Rightshin_r1.cubeList.add(new ModelBox(Rightshin_r1, 39, 132, -0.9288F, -0.7533F, -2.1388F, 2, 7, 2, 0.0F, false));

        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 5.5F, 0.4F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.3176F, -0.3951F, 0.1109F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 81, 103, -2.9F, 0.0F, -4.0F, 5, 2, 6, 0.0F, false));

        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.2F, 0.4997F, 10.181F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.1911F, 0.0F, 0.5095F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 89, 128, -1.0F, -1.0F, -1.0F, 2, 6, 3, 0.0F, false));

        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.3864F, 5.0131F, 0.4087F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.3396F, 0.0213F, -0.5308F);


        this.Rightshin_r2 = new ModelRenderer(this);
        this.Rightshin_r2.setRotationPoint(0.5712F, 0.2533F, 0.6388F);
        this.Leftshin.addChild(Rightshin_r2);
        this.setRotateAngle(Rightshin_r2, -0.0055F, 0.3486F, -0.0173F);
        this.Rightshin_r2.cubeList.add(new ModelBox(Rightshin_r2, 57, 141, -0.4712F, 0.2467F, 0.3612F, 1, 6, 1, 0.0F, false));
        this.Rightshin_r2.cubeList.add(new ModelBox(Rightshin_r2, 48, 134, -1.0712F, -0.7533F, -2.1388F, 2, 7, 2, 0.0F, false));

        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 5.5F, 0.4F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.0637F, 0.4245F, -0.0213F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 104, 103, -2.1F, 0.0F, -4.0F, 5, 2, 6, 0.0F, false));

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
