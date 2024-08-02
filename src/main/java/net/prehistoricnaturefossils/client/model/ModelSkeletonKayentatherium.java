package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonKayentatherium extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Hips_r2;
    private final ModelRenderer Hips_r3;
    private final ModelRenderer Hips_r4;
    private final ModelRenderer Hips_r5;
    private final ModelRenderer Hips_r6;
    private final ModelRenderer Hips_r7;
    private final ModelRenderer Hips_r8;
    private final ModelRenderer Hips_r9;
    private final ModelRenderer Hips_r10;
    private final ModelRenderer Hips_r11;
    private final ModelRenderer Hips_r12;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailmiddle;
    private final ModelRenderer Tailend;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodymiddle_r2;
    private final ModelRenderer Bodymiddle_r3;
    private final ModelRenderer Bodymiddle_r4;
    private final ModelRenderer Bodymiddle_r5;
    private final ModelRenderer Bodymiddle_r6;
    private final ModelRenderer Bodymiddle_r7;
    private final ModelRenderer Bodymiddle_r8;
    private final ModelRenderer Bodymiddle_r9;
    private final ModelRenderer Bodymiddle_r10;
    private final ModelRenderer Bodymiddle_r11;
    private final ModelRenderer Bodymiddle_r12;
    private final ModelRenderer Bodymiddle_r13;
    private final ModelRenderer Bodymiddle_r14;
    private final ModelRenderer Bodymiddle_r15;
    private final ModelRenderer Bodymiddle_r16;
    private final ModelRenderer Bodymiddle_r17;
    private final ModelRenderer Bodymiddle_r18;
    private final ModelRenderer Bodymiddle_r19;
    private final ModelRenderer Bodymiddle_r20;
    private final ModelRenderer Bodymiddle_r21;
    private final ModelRenderer Bodymiddle_r22;
    private final ModelRenderer Bodymiddle_r23;
    private final ModelRenderer Bodymiddle_r24;
    private final ModelRenderer Bodymiddle_r25;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Bodymiddle_r26;
    private final ModelRenderer Bodyfront_r2;
    private final ModelRenderer Bodyfront_r3;
    private final ModelRenderer Bodyfront_r4;
    private final ModelRenderer Bodyfront_r5;
    private final ModelRenderer Bodymiddle_r27;
    private final ModelRenderer Bodymiddle_r28;
    private final ModelRenderer Bodymiddle_r29;
    private final ModelRenderer Bodymiddle_r30;
    private final ModelRenderer Bodymiddle_r31;
    private final ModelRenderer Bodymiddle_r32;
    private final ModelRenderer Bodymiddle_r33;
    private final ModelRenderer Bodymiddle_r34;
    private final ModelRenderer Bodymiddle_r35;
    private final ModelRenderer Bodymiddle_r36;
    private final ModelRenderer Bodymiddle_r37;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Head_r1;
    private final ModelRenderer Head_r2;
    private final ModelRenderer Eyeportion;
    private final ModelRenderer Snout;
    private final ModelRenderer Snout_r1;
    private final ModelRenderer Nose;
    private final ModelRenderer Nose_r1;
    private final ModelRenderer Nose_r2;
    private final ModelRenderer Nose_r3;
    private final ModelRenderer Nose_r4;
    private final ModelRenderer Nose_r5;
    private final ModelRenderer Nose_r6;
    private final ModelRenderer Nose_r7;
    private final ModelRenderer Nose_r8;
    private final ModelRenderer Noseunderslope;
    private final ModelRenderer Rightupperfang;
    private final ModelRenderer Leftupperfang_r1;
    private final ModelRenderer Rightupperfang_r1;
    private final ModelRenderer Rightupperbackteeth;
    private final ModelRenderer Leftupperbackteeth_r1;
    private final ModelRenderer leftZygomaticarch;
    private final ModelRenderer Eyeportion_r1;
    private final ModelRenderer Eyeportion_r2;
    private final ModelRenderer Eyeportion_r3;
    private final ModelRenderer Eyeportion_r4;
    private final ModelRenderer Eyeportion_r5;
    private final ModelRenderer Eyeportion_r6;
    private final ModelRenderer Eyeportion_r7;
    private final ModelRenderer rightZygomaticarch;
    private final ModelRenderer Eyeportion_r8;
    private final ModelRenderer Eyeportion_r9;
    private final ModelRenderer Eyeportion_r10;
    private final ModelRenderer Eyeportion_r11;
    private final ModelRenderer Eyeportion_r12;
    private final ModelRenderer Eyeportion_r13;
    private final ModelRenderer Eyeportion_r14;
    private final ModelRenderer Lowerjawbase;
    private final ModelRenderer Lowerjawbase_r1;
    private final ModelRenderer Lowerjawbase_r2;
    private final ModelRenderer Lowerjawbase_r3;
    private final ModelRenderer Lowerjawbase_r4;
    private final ModelRenderer Lowerjawbase_r5;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawmiddle_r1;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerjawfront_r1;
    private final ModelRenderer Lowerjawfront_r2;
    private final ModelRenderer Lowerfrontteeth;
    private final ModelRenderer Lowerfrontteeth_r1;
    private final ModelRenderer Rightlowerfang;
    private final ModelRenderer Leftlowerfang_r1;
    private final ModelRenderer Mouthinterior;
    private final ModelRenderer Jawparting;
    private final ModelRenderer Lowerjawfluff;
    private final ModelRenderer Lowerjawfluff_r1;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightlowerarm_r1;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftlowerarm_r1;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Chestslope;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonKayentatherium() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 16.9F, 6.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.4245F, 0.0F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, 0.1F, -3.5F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.1222F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 25, 24, 0.0F, -1.0F, 1.9F, 0, 1, 1, 0.0F, false));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 26, 0.0F, -1.0F, -0.1F, 0, 1, 1, 0.0F, false));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 28, 21, 0.5F, 0.0F, 0.4F, 1, 1, 3, 0.0F, false));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 20, 12, -0.5F, 0.0F, -0.1F, 1, 1, 4, 0.008F, false));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(0.0F, 0.1F, -3.5F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.1222F, 0.0F, 0.0F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 28, 21, -1.5F, 0.0F, 0.4F, 1, 1, 3, 0.0F, true));

        this.Hips_r3 = new ModelRenderer(this);
        this.Hips_r3.setRotationPoint(-2.0F, 1.1651F, -2.1229F);
        this.Hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, 0.2094F, 0.0F, 0.0F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 27, 2, -0.5F, -0.5961F, -0.8498F, 1, 1, 4, 0.0F, true));

        this.Hips_r4 = new ModelRenderer(this);
        this.Hips_r4.setRotationPoint(-2.0F, 1.1651F, -2.1229F);
        this.Hips.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, -0.4363F, 0.0F, 0.0F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 0, 20, -0.5F, -0.4841F, -3.8782F, 1, 1, 4, 0.0F, true));

        this.Hips_r5 = new ModelRenderer(this);
        this.Hips_r5.setRotationPoint(-2.0F, 1.1651F, -2.1229F);
        this.Hips.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, 0.0F, 0.0F, 0.0F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 11, 27, -0.5F, -0.7369F, -0.7196F, 1, 2, 3, 0.005F, true));

        this.Hips_r6 = new ModelRenderer(this);
        this.Hips_r6.setRotationPoint(-2.0F, 1.1651F, -2.1229F);
        this.Hips.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, 0.3491F, 0.0F, 0.0F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 34, 14, -0.5F, -0.1F, -2.207F, 1, 1, 2, -0.004F, true));

        this.Hips_r7 = new ModelRenderer(this);
        this.Hips_r7.setRotationPoint(-2.0F, 1.1651F, -2.1229F);
        this.Hips.addChild(Hips_r7);
        this.setRotateAngle(Hips_r7, 1.1519F, 0.0F, 0.0F);
        this.Hips_r7.cubeList.add(new ModelBox(Hips_r7, 7, 20, -0.5F, 1.552F, -0.1759F, 1, 1, 2, -0.004F, true));

        this.Hips_r8 = new ModelRenderer(this);
        this.Hips_r8.setRotationPoint(2.0F, 1.1651F, -2.1229F);
        this.Hips.addChild(Hips_r8);
        this.setRotateAngle(Hips_r8, 0.3491F, 0.0F, 0.0F);
        this.Hips_r8.cubeList.add(new ModelBox(Hips_r8, 34, 14, -0.5F, -0.1F, -2.207F, 1, 1, 2, -0.004F, false));

        this.Hips_r9 = new ModelRenderer(this);
        this.Hips_r9.setRotationPoint(2.0F, 1.1651F, -2.1229F);
        this.Hips.addChild(Hips_r9);
        this.setRotateAngle(Hips_r9, 0.0F, 0.0F, 0.0F);
        this.Hips_r9.cubeList.add(new ModelBox(Hips_r9, 11, 27, -0.5F, -0.7369F, -0.7196F, 1, 2, 3, 0.005F, false));

        this.Hips_r10 = new ModelRenderer(this);
        this.Hips_r10.setRotationPoint(2.0F, 1.1651F, -2.1229F);
        this.Hips.addChild(Hips_r10);
        this.setRotateAngle(Hips_r10, 1.1519F, 0.0F, 0.0F);
        this.Hips_r10.cubeList.add(new ModelBox(Hips_r10, 7, 20, -0.5F, 1.552F, -0.1759F, 1, 1, 2, -0.004F, false));

        this.Hips_r11 = new ModelRenderer(this);
        this.Hips_r11.setRotationPoint(2.0F, 1.1651F, -2.1229F);
        this.Hips.addChild(Hips_r11);
        this.setRotateAngle(Hips_r11, 0.2094F, 0.0F, 0.0F);
        this.Hips_r11.cubeList.add(new ModelBox(Hips_r11, 27, 2, -0.5F, -0.5961F, -0.8498F, 1, 1, 4, 0.0F, false));

        this.Hips_r12 = new ModelRenderer(this);
        this.Hips_r12.setRotationPoint(2.0F, 1.1651F, -2.1229F);
        this.Hips.addChild(Hips_r12);
        this.setRotateAngle(Hips_r12, -0.4363F, 0.0F, 0.0F);
        this.Hips_r12.cubeList.add(new ModelBox(Hips_r12, 0, 20, -0.5F, -0.4841F, -3.8782F, 1, 1, 4, 0.0F, false));

        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 1.1F, 0.1F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.1017F, -0.042F, 0.0119F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 17, 30, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 21, 1, 0.0F, -1.5F, 0.0F, 0, 1, 1, 0.0F, false));
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 0, 15, 0.0F, -1.5F, 2.0F, 0, 1, 1, 0.0F, false));

        this.Tailmiddle = new ModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tailbase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.2393F, -0.1697F, -0.0412F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 18, 24, -0.5F, -0.474F, -0.0945F, 1, 1, 4, 0.008F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(-0.01F, 0.126F, 3.8055F);
        this.Tailmiddle.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.3253F, -0.1258F, -0.0363F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 8, 8, -0.49F, -0.6184F, 0.0088F, 1, 1, 5, 0.0F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.8F, -4.0F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.4458F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 20, 18, -0.5F, -0.1F, -7.8F, 1, 1, 4, 0.008F, false));
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 28, 43, 0.0F, -1.1F, -7.8F, 0, 1, 1, 0.0F, false));
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 12, 43, 0.0F, -1.1F, -5.8F, 0, 1, 1, 0.0F, false));

        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, -0.1F, -3.8F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, -0.2793F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 10, 37, 0.0F, -1.0F, 2.0F, 0, 1, 1, 0.0F, false));
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 9, 43, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 20, 6, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Bodymiddle_r2 = new ModelRenderer(this);
        this.Bodymiddle_r2.setRotationPoint(-0.5F, 0.4F, -3.3F);
        this.Bodymiddle.addChild(Bodymiddle_r2);
        this.setRotateAngle(Bodymiddle_r2, -0.0785F, -0.0382F, -0.5046F);
        this.Bodymiddle_r2.cubeList.add(new ModelBox(Bodymiddle_r2, 19, 42, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Bodymiddle_r3 = new ModelRenderer(this);
        this.Bodymiddle_r3.setRotationPoint(-0.5F, 0.4F, -5.3F);
        this.Bodymiddle.addChild(Bodymiddle_r3);
        this.setRotateAngle(Bodymiddle_r3, 0.0F, 0.0F, -0.4538F);
        this.Bodymiddle_r3.cubeList.add(new ModelBox(Bodymiddle_r3, 43, 5, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Bodymiddle_r4 = new ModelRenderer(this);
        this.Bodymiddle_r4.setRotationPoint(-0.5F, 0.4F, -7.3F);
        this.Bodymiddle.addChild(Bodymiddle_r4);
        this.setRotateAngle(Bodymiddle_r4, 0.0785F, 0.0382F, -0.4348F);
        this.Bodymiddle_r4.cubeList.add(new ModelBox(Bodymiddle_r4, 33, 42, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Bodymiddle_r5 = new ModelRenderer(this);
        this.Bodymiddle_r5.setRotationPoint(-0.5F, 1.0F, -1.5F);
        this.Bodymiddle.addChild(Bodymiddle_r5);
        this.setRotateAngle(Bodymiddle_r5, -0.173F, -0.0837F, -0.5861F);
        this.Bodymiddle_r5.cubeList.add(new ModelBox(Bodymiddle_r5, 42, 3, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Bodymiddle_r6 = new ModelRenderer(this);
        this.Bodymiddle_r6.setRotationPoint(-0.5F, 1.0F, -1.5F);
        this.Bodymiddle.addChild(Bodymiddle_r6);
        this.setRotateAngle(Bodymiddle_r6, -0.0304F, -0.1896F, -1.5505F);
        this.Bodymiddle_r6.cubeList.add(new ModelBox(Bodymiddle_r6, 16, 8, -3.4396F, -1.3192F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Bodymiddle_r7 = new ModelRenderer(this);
        this.Bodymiddle_r7.setRotationPoint(-0.5F, 1.0F, -1.5F);
        this.Bodymiddle.addChild(Bodymiddle_r7);
        this.setRotateAngle(Bodymiddle_r7, -0.1217F, -0.1488F, -1.0207F);
        this.Bodymiddle_r7.cubeList.add(new ModelBox(Bodymiddle_r7, 38, 41, -1.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Bodymiddle_r8 = new ModelRenderer(this);
        this.Bodymiddle_r8.setRotationPoint(-0.5F, 0.4F, -5.3F);
        this.Bodymiddle.addChild(Bodymiddle_r8);
        this.setRotateAngle(Bodymiddle_r8, 0.0F, 0.0F, -1.4137F);
        this.Bodymiddle_r8.cubeList.add(new ModelBox(Bodymiddle_r8, 32, 28, -4.4396F, -1.3192F, -0.5F, 3, 0, 1, 0.0F, true));

        this.Bodymiddle_r9 = new ModelRenderer(this);
        this.Bodymiddle_r9.setRotationPoint(-0.5F, 0.4F, -3.3F);
        this.Bodymiddle.addChild(Bodymiddle_r9);
        this.setRotateAngle(Bodymiddle_r9, -0.0137F, -0.0862F, -1.4655F);
        this.Bodymiddle_r9.cubeList.add(new ModelBox(Bodymiddle_r9, 32, 26, -4.4396F, -1.3192F, -0.5F, 3, 0, 1, 0.0F, true));

        this.Bodymiddle_r10 = new ModelRenderer(this);
        this.Bodymiddle_r10.setRotationPoint(-0.5F, 0.4F, -3.3F);
        this.Bodymiddle.addChild(Bodymiddle_r10);
        this.setRotateAngle(Bodymiddle_r10, -0.055F, -0.0678F, -0.9406F);
        this.Bodymiddle_r10.cubeList.add(new ModelBox(Bodymiddle_r10, 5, 42, -1.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Bodymiddle_r11 = new ModelRenderer(this);
        this.Bodymiddle_r11.setRotationPoint(-0.5F, 0.4F, -5.3F);
        this.Bodymiddle.addChild(Bodymiddle_r11);
        this.setRotateAngle(Bodymiddle_r11, 0.0F, 0.0F, -0.8901F);
        this.Bodymiddle_r11.cubeList.add(new ModelBox(Bodymiddle_r11, 42, 42, -1.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Bodymiddle_r12 = new ModelRenderer(this);
        this.Bodymiddle_r12.setRotationPoint(-0.5F, 0.4F, -7.3F);
        this.Bodymiddle.addChild(Bodymiddle_r12);
        this.setRotateAngle(Bodymiddle_r12, 0.0137F, 0.0862F, -1.3957F);
        this.Bodymiddle_r12.cubeList.add(new ModelBox(Bodymiddle_r12, 11, 0, -5.4396F, -1.3192F, -0.5F, 4, 0, 1, 0.0F, true));

        this.Bodymiddle_r13 = new ModelRenderer(this);
        this.Bodymiddle_r13.setRotationPoint(-0.5F, 0.4F, -7.3F);
        this.Bodymiddle.addChild(Bodymiddle_r13);
        this.setRotateAngle(Bodymiddle_r13, 0.055F, 0.0678F, -0.8708F);
        this.Bodymiddle_r13.cubeList.add(new ModelBox(Bodymiddle_r13, 24, 42, -1.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Bodymiddle_r14 = new ModelRenderer(this);
        this.Bodymiddle_r14.setRotationPoint(0.5F, 0.4F, -7.3F);
        this.Bodymiddle.addChild(Bodymiddle_r14);
        this.setRotateAngle(Bodymiddle_r14, 0.0785F, -0.0382F, 0.4348F);
        this.Bodymiddle_r14.cubeList.add(new ModelBox(Bodymiddle_r14, 33, 42, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Bodymiddle_r15 = new ModelRenderer(this);
        this.Bodymiddle_r15.setRotationPoint(0.5F, 0.4F, -7.3F);
        this.Bodymiddle.addChild(Bodymiddle_r15);
        this.setRotateAngle(Bodymiddle_r15, 0.055F, -0.0678F, 0.8708F);
        this.Bodymiddle_r15.cubeList.add(new ModelBox(Bodymiddle_r15, 24, 42, 0.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Bodymiddle_r16 = new ModelRenderer(this);
        this.Bodymiddle_r16.setRotationPoint(0.5F, 0.4F, -7.3F);
        this.Bodymiddle.addChild(Bodymiddle_r16);
        this.setRotateAngle(Bodymiddle_r16, 0.0137F, -0.0862F, 1.3957F);
        this.Bodymiddle_r16.cubeList.add(new ModelBox(Bodymiddle_r16, 11, 0, 1.4396F, -1.3192F, -0.5F, 4, 0, 1, 0.0F, false));

        this.Bodymiddle_r17 = new ModelRenderer(this);
        this.Bodymiddle_r17.setRotationPoint(0.5F, 1.0F, -1.5F);
        this.Bodymiddle.addChild(Bodymiddle_r17);
        this.setRotateAngle(Bodymiddle_r17, -0.173F, 0.0837F, 0.5861F);
        this.Bodymiddle_r17.cubeList.add(new ModelBox(Bodymiddle_r17, 42, 3, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Bodymiddle_r18 = new ModelRenderer(this);
        this.Bodymiddle_r18.setRotationPoint(0.5F, 1.0F, -1.5F);
        this.Bodymiddle.addChild(Bodymiddle_r18);
        this.setRotateAngle(Bodymiddle_r18, -0.1217F, 0.1488F, 1.0207F);
        this.Bodymiddle_r18.cubeList.add(new ModelBox(Bodymiddle_r18, 38, 41, 0.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Bodymiddle_r19 = new ModelRenderer(this);
        this.Bodymiddle_r19.setRotationPoint(0.5F, 1.0F, -1.5F);
        this.Bodymiddle.addChild(Bodymiddle_r19);
        this.setRotateAngle(Bodymiddle_r19, -0.0304F, 0.1896F, 1.5505F);
        this.Bodymiddle_r19.cubeList.add(new ModelBox(Bodymiddle_r19, 16, 8, 1.4396F, -1.3192F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Bodymiddle_r20 = new ModelRenderer(this);
        this.Bodymiddle_r20.setRotationPoint(0.5F, 0.4F, -3.3F);
        this.Bodymiddle.addChild(Bodymiddle_r20);
        this.setRotateAngle(Bodymiddle_r20, -0.0785F, 0.0382F, 0.5046F);
        this.Bodymiddle_r20.cubeList.add(new ModelBox(Bodymiddle_r20, 19, 42, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Bodymiddle_r21 = new ModelRenderer(this);
        this.Bodymiddle_r21.setRotationPoint(0.5F, 0.4F, -3.3F);
        this.Bodymiddle.addChild(Bodymiddle_r21);
        this.setRotateAngle(Bodymiddle_r21, -0.055F, 0.0678F, 0.9406F);
        this.Bodymiddle_r21.cubeList.add(new ModelBox(Bodymiddle_r21, 5, 42, 0.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Bodymiddle_r22 = new ModelRenderer(this);
        this.Bodymiddle_r22.setRotationPoint(0.5F, 0.4F, -3.3F);
        this.Bodymiddle.addChild(Bodymiddle_r22);
        this.setRotateAngle(Bodymiddle_r22, -0.0137F, 0.0862F, 1.4655F);
        this.Bodymiddle_r22.cubeList.add(new ModelBox(Bodymiddle_r22, 32, 26, 1.4396F, -1.3192F, -0.5F, 3, 0, 1, 0.0F, false));

        this.Bodymiddle_r23 = new ModelRenderer(this);
        this.Bodymiddle_r23.setRotationPoint(0.5F, 0.4F, -5.3F);
        this.Bodymiddle.addChild(Bodymiddle_r23);
        this.setRotateAngle(Bodymiddle_r23, 0.0F, 0.0F, 1.4137F);
        this.Bodymiddle_r23.cubeList.add(new ModelBox(Bodymiddle_r23, 32, 28, 1.4396F, -1.3192F, -0.5F, 3, 0, 1, 0.0F, false));

        this.Bodymiddle_r24 = new ModelRenderer(this);
        this.Bodymiddle_r24.setRotationPoint(0.5F, 0.4F, -5.3F);
        this.Bodymiddle.addChild(Bodymiddle_r24);
        this.setRotateAngle(Bodymiddle_r24, 0.0F, 0.0F, 0.8901F);
        this.Bodymiddle_r24.cubeList.add(new ModelBox(Bodymiddle_r24, 42, 42, 0.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Bodymiddle_r25 = new ModelRenderer(this);
        this.Bodymiddle_r25.setRotationPoint(0.5F, 0.4F, -5.3F);
        this.Bodymiddle.addChild(Bodymiddle_r25);
        this.setRotateAngle(Bodymiddle_r25, 0.0F, 0.0F, 0.4538F);
        this.Bodymiddle_r25.cubeList.add(new ModelBox(Bodymiddle_r25, 43, 5, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(-0.01F, 0.6F, -7.5F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.0215F, -0.1309F, 0.0028F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 0.3F, -5.2F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.1047F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 21, 12, 0.01F, -2.3314F, 3.0016F, 0, 2, 1, 0.0F, false));
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 0, 0, 0.01F, -1.8314F, 1.0016F, 0, 2, 1, 0.0F, false));
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 0, 6, -0.49F, -0.4314F, 0.0016F, 1, 1, 5, 0.0F, false));

        this.Bodymiddle_r26 = new ModelRenderer(this);
        this.Bodymiddle_r26.setRotationPoint(-0.49F, 0.2F, -3.8F);
        this.Bodyfront.addChild(Bodymiddle_r26);
        this.setRotateAngle(Bodymiddle_r26, 0.0631F, 0.379F, -1.6634F);
        this.Bodymiddle_r26.cubeList.add(new ModelBox(Bodymiddle_r26, 0, 13, -3.4396F, -1.3192F, -0.5F, 2, 0, 1, 0.0F, true));
        this.Bodymiddle_r26.cubeList.add(new ModelBox(Bodymiddle_r26, 0, 13, -3.4396F, -1.3192F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r2 = new ModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(-1.98F, 1.0925F, -2.8397F);
        this.Bodyfront.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, 2.4347F, 0.0F, 0.0F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 40, 23, -0.5F, -1.0334F, 1.4225F, 1, 1, 1, 0.005F, true));
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 40, 23, 3.48F, -1.0334F, 1.4225F, 1, 1, 1, 0.005F, false));

        this.Bodyfront_r3 = new ModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(-1.98F, 1.0925F, -2.8397F);
        this.Bodyfront.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, 1.6144F, 0.0F, 0.0F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 28, 15, -0.5F, -1.7825F, -1.3497F, 1, 1, 3, 0.0F, true));
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 28, 15, 3.48F, -1.7825F, -1.3497F, 1, 1, 3, 0.0F, false));

        this.Bodyfront_r4 = new ModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(-1.98F, 1.0925F, -2.8397F);
        this.Bodyfront.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, 1.6668F, 0.0F, 0.0F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 20, 0, -0.5F, -1.3941F, -2.2927F, 1, 1, 4, -0.004F, true));
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 20, 0, 3.48F, -1.3941F, -2.2927F, 1, 1, 4, -0.004F, false));

        this.Bodyfront_r5 = new ModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(-1.98F, 1.0925F, -2.8397F);
        this.Bodyfront.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, 1.1257F, 0.0F, 0.0F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 27, 8, -0.5F, -1.3386F, -2.7287F, 1, 1, 4, 0.005F, true));
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 27, 8, 3.48F, -1.3386F, -2.7287F, 1, 1, 4, 0.005F, false));

        this.Bodymiddle_r27 = new ModelRenderer(this);
        this.Bodymiddle_r27.setRotationPoint(-0.49F, 0.0F, -1.8F);
        this.Bodyfront.addChild(Bodymiddle_r27);
        this.setRotateAngle(Bodymiddle_r27, 0.1888F, 0.0913F, -0.4451F);
        this.Bodymiddle_r27.cubeList.add(new ModelBox(Bodymiddle_r27, 41, 21, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Bodymiddle_r28 = new ModelRenderer(this);
        this.Bodymiddle_r28.setRotationPoint(-0.49F, 0.0F, -1.8F);
        this.Bodyfront.addChild(Bodymiddle_r28);
        this.setRotateAngle(Bodymiddle_r28, 0.133F, 0.1623F, -0.8793F);
        this.Bodymiddle_r28.cubeList.add(new ModelBox(Bodymiddle_r28, 41, 36, -1.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Bodymiddle_r29 = new ModelRenderer(this);
        this.Bodymiddle_r29.setRotationPoint(-0.49F, 0.0F, -1.8F);
        this.Bodyfront.addChild(Bodymiddle_r29);
        this.setRotateAngle(Bodymiddle_r29, 0.0332F, 0.2068F, -1.4103F);
        this.Bodymiddle_r29.cubeList.add(new ModelBox(Bodymiddle_r29, 27, 0, -4.4396F, -1.3192F, -0.5F, 3, 0, 1, 0.0F, true));

        this.Bodymiddle_r30 = new ModelRenderer(this);
        this.Bodymiddle_r30.setRotationPoint(-0.49F, 0.2F, -3.8F);
        this.Bodyfront.addChild(Bodymiddle_r30);
        this.setRotateAngle(Bodymiddle_r30, 0.249F, 0.2954F, -1.1147F);
        this.Bodymiddle_r30.cubeList.add(new ModelBox(Bodymiddle_r30, 16, 11, -1.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Bodymiddle_r31 = new ModelRenderer(this);
        this.Bodymiddle_r31.setRotationPoint(-0.49F, 0.2F, -3.8F);
        this.Bodyfront.addChild(Bodymiddle_r31);
        this.setRotateAngle(Bodymiddle_r31, 0.3483F, 0.165F, -0.6865F);
        this.Bodymiddle_r31.cubeList.add(new ModelBox(Bodymiddle_r31, 12, 33, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Bodymiddle_r32 = new ModelRenderer(this);
        this.Bodymiddle_r32.setRotationPoint(0.51F, 0.2F, -3.8F);
        this.Bodyfront.addChild(Bodymiddle_r32);
        this.setRotateAngle(Bodymiddle_r32, 0.3483F, -0.165F, 0.6865F);
        this.Bodymiddle_r32.cubeList.add(new ModelBox(Bodymiddle_r32, 12, 33, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Bodymiddle_r33 = new ModelRenderer(this);
        this.Bodymiddle_r33.setRotationPoint(0.51F, 0.2F, -3.8F);
        this.Bodyfront.addChild(Bodymiddle_r33);
        this.setRotateAngle(Bodymiddle_r33, 0.249F, -0.2954F, 1.1147F);
        this.Bodymiddle_r33.cubeList.add(new ModelBox(Bodymiddle_r33, 16, 11, 0.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Bodymiddle_r34 = new ModelRenderer(this);
        this.Bodymiddle_r34.setRotationPoint(0.51F, 0.2F, -3.8F);
        this.Bodyfront.addChild(Bodymiddle_r34);
        this.setRotateAngle(Bodymiddle_r34, 0.0631F, -0.379F, 1.6634F);
        this.Bodymiddle_r34.cubeList.add(new ModelBox(Bodymiddle_r34, 0, 13, 1.4396F, -1.3192F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Bodymiddle_r35 = new ModelRenderer(this);
        this.Bodymiddle_r35.setRotationPoint(0.51F, 0.0F, -1.8F);
        this.Bodyfront.addChild(Bodymiddle_r35);
        this.setRotateAngle(Bodymiddle_r35, 0.133F, -0.1623F, 0.8793F);
        this.Bodymiddle_r35.cubeList.add(new ModelBox(Bodymiddle_r35, 41, 36, 0.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Bodymiddle_r36 = new ModelRenderer(this);
        this.Bodymiddle_r36.setRotationPoint(0.51F, 0.0F, -1.8F);
        this.Bodyfront.addChild(Bodymiddle_r36);
        this.setRotateAngle(Bodymiddle_r36, 0.0332F, -0.2068F, 1.4103F);
        this.Bodymiddle_r36.cubeList.add(new ModelBox(Bodymiddle_r36, 27, 0, 1.4396F, -1.3192F, -0.5F, 3, 0, 1, 0.0F, false));

        this.Bodymiddle_r37 = new ModelRenderer(this);
        this.Bodymiddle_r37.setRotationPoint(0.51F, 0.0F, -1.8F);
        this.Bodyfront.addChild(Bodymiddle_r37);
        this.setRotateAngle(Bodymiddle_r37, 0.1888F, -0.0913F, 0.4451F);
        this.Bodymiddle_r37.cubeList.add(new ModelBox(Bodymiddle_r37, 41, 21, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.4F, -5.0F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.2903F, -0.3424F, 0.069F);
        this.Neck.cubeList.add(new ModelBox(Neck, 11, 21, -0.49F, -0.5F, -4.0F, 1, 1, 4, 0.008F, false));
        this.Neck.cubeList.add(new ModelBox(Neck, 37, 43, 0.01F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));
        this.Neck.cubeList.add(new ModelBox(Neck, 31, 43, 0.01F, -1.5F, -1.0F, 0, 1, 1, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.01F, -0.3F, -3.0F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.0725F, 0.0975F, 0.0003F);


        this.Head_r1 = new ModelRenderer(this);
        this.Head_r1.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.Head.addChild(Head_r1);
        this.setRotateAngle(Head_r1, -0.1222F, 0.0F, 0.0F);
        this.Head_r1.cubeList.add(new ModelBox(Head_r1, 0, 32, -1.5F, -0.3F, 0.0F, 3, 1, 1, 0.0F, false));

        this.Head_r2 = new ModelRenderer(this);
        this.Head_r2.setRotationPoint(0.0F, -0.7632F, -1.5328F);
        this.Head.addChild(Head_r2);
        this.setRotateAngle(Head_r2, -0.0175F, 0.0F, 0.0F);
        this.Head_r2.cubeList.add(new ModelBox(Head_r2, 14, 41, -0.5F, -0.5F, -0.4F, 1, 1, 1, 0.0F, false));

        this.Eyeportion = new ModelRenderer(this);
        this.Eyeportion.setRotationPoint(-0.01F, -1.5F, -2.0F);
        this.Head.addChild(Eyeportion);
        this.setRotateAngle(Eyeportion, 0.0637F, 0.0F, 0.0F);


        this.Snout = new ModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, 0.0F, -1.1F);
        this.Eyeportion.addChild(Snout);
        this.setRotateAngle(Snout, 0.0637F, 0.0F, 0.0F);


        this.Snout_r1 = new ModelRenderer(this);
        this.Snout_r1.setRotationPoint(0.0F, 1.0F, -1.5F);
        this.Snout.addChild(Snout_r1);
        this.setRotateAngle(Snout_r1, -0.1745F, 0.0F, 0.0F);
        this.Snout_r1.cubeList.add(new ModelBox(Snout_r1, 13, 15, -0.2F, -0.5F, 0.3F, 1, 1, 4, 0.0F, false));
        this.Snout_r1.cubeList.add(new ModelBox(Snout_r1, 11, 2, -0.99F, 0.1F, -0.5F, 2, 1, 4, 0.0F, false));

        this.Nose = new ModelRenderer(this);
        this.Nose.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Snout.addChild(Nose);
        this.setRotateAngle(Nose, 0.5095F, 0.0F, 0.0F);
        this.Nose.cubeList.add(new ModelBox(Nose, 41, 15, -0.2F, 0.4F, -1.3F, 1, 1, 1, -0.105F, false));
        this.Nose.cubeList.add(new ModelBox(Nose, 41, 15, -0.78F, 0.4F, -1.3F, 1, 1, 1, -0.1F, true));

        this.Nose_r1 = new ModelRenderer(this);
        this.Nose_r1.setRotationPoint(0.02F, 1.6F, -0.6F);
        this.Nose.addChild(Nose_r1);
        this.setRotateAngle(Nose_r1, -0.7505F, 0.0F, 0.0F);
        this.Nose_r1.cubeList.add(new ModelBox(Nose_r1, 41, 0, -0.9F, -0.9903F, -0.1104F, 1, 1, 1, -0.004F, true));
        this.Nose_r1.cubeList.add(new ModelBox(Nose_r1, 41, 0, -0.12F, -0.9903F, -0.1104F, 1, 1, 1, -0.004F, false));

        this.Nose_r2 = new ModelRenderer(this);
        this.Nose_r2.setRotationPoint(0.12F, 0.5F, -0.4F);
        this.Nose.addChild(Nose_r2);
        this.setRotateAngle(Nose_r2, -0.3491F, 0.0F, 0.0F);
        this.Nose_r2.cubeList.add(new ModelBox(Nose_r2, 7, 33, -0.91F, -0.1F, -0.1F, 1, 1, 2, -0.105F, true));
        this.Nose_r2.cubeList.add(new ModelBox(Nose_r2, 7, 33, -0.31F, -0.1F, -0.1F, 1, 1, 2, -0.1F, false));

        this.Nose_r3 = new ModelRenderer(this);
        this.Nose_r3.setRotationPoint(0.0F, 1.3F, -1.1F);
        this.Nose.addChild(Nose_r3);
        this.setRotateAngle(Nose_r3, -0.384F, 0.0F, 0.0F);
        this.Nose_r3.cubeList.add(new ModelBox(Nose_r3, 41, 8, -0.2F, -0.7995F, -0.2344F, 1, 1, 1, -0.104F, false));

        this.Nose_r4 = new ModelRenderer(this);
        this.Nose_r4.setRotationPoint(0.0F, 2.0F, 3.7F);
        this.Nose.addChild(Nose_r4);
        this.setRotateAngle(Nose_r4, -0.7505F, 0.0F, 0.0F);
        this.Nose_r4.cubeList.add(new ModelBox(Nose_r4, 34, 38, 0.01F, 0.0108F, 0.0303F, 0, 1, 2, 0.0F, false));

        this.Nose_r5 = new ModelRenderer(this);
        this.Nose_r5.setRotationPoint(0.0F, 1.5F, 1.9F);
        this.Nose.addChild(Nose_r5);
        this.setRotateAngle(Nose_r5, -0.3491F, 0.0F, 0.0F);
        this.Nose_r5.cubeList.add(new ModelBox(Nose_r5, 36, 34, 0.01F, -0.135F, -0.1072F, 0, 1, 2, 0.0F, false));

        this.Nose_r6 = new ModelRenderer(this);
        this.Nose_r6.setRotationPoint(0.02F, 2.5F, 3.5F);
        this.Nose.addChild(Nose_r6);
        this.setRotateAngle(Nose_r6, -0.5509F, 0.1792F, -0.109F);
        this.Nose_r6.cubeList.add(new ModelBox(Nose_r6, 34, 20, -0.51F, -0.2196F, -2.008F, 1, 1, 2, -0.104F, true));

        this.Nose_r7 = new ModelRenderer(this);
        this.Nose_r7.setRotationPoint(0.0F, 2.5F, 3.5F);
        this.Nose.addChild(Nose_r7);
        this.setRotateAngle(Nose_r7, -0.5509F, -0.1792F, 0.109F);
        this.Nose_r7.cubeList.add(new ModelBox(Nose_r7, 34, 20, -0.49F, -0.2196F, -2.008F, 1, 1, 2, -0.1F, false));

        this.Nose_r8 = new ModelRenderer(this);
        this.Nose_r8.setRotationPoint(-0.1F, 1.1F, 1.3F);
        this.Nose.addChild(Nose_r8);
        this.setRotateAngle(Nose_r8, -0.4538F, 0.0F, 0.0F);
        this.Nose_r8.cubeList.add(new ModelBox(Nose_r8, 10, 15, -0.89F, -0.0824F, -0.1027F, 2, 1, 1, -0.1F, false));

        this.Noseunderslope = new ModelRenderer(this);
        this.Noseunderslope.setRotationPoint(-0.01F, 1.0F, -1.0F);
        this.Nose.addChild(Noseunderslope);
        this.setRotateAngle(Noseunderslope, 0.3821F, 0.0F, 0.0F);


        this.Rightupperfang = new ModelRenderer(this);
        this.Rightupperfang.setRotationPoint(0.6F, 1.5F, -2.1F);
        this.Snout.addChild(Rightupperfang);
        this.setRotateAngle(Rightupperfang, -0.4882F, 0.0F, -0.0213F);


        this.Leftupperfang_r1 = new ModelRenderer(this);
        this.Leftupperfang_r1.setRotationPoint(-1.08F, 0.9F, -1.0F);
        this.Rightupperfang.addChild(Leftupperfang_r1);
        this.setRotateAngle(Leftupperfang_r1, 0.0865F, -0.0114F, 0.1304F);
        this.Leftupperfang_r1.cubeList.add(new ModelBox(Leftupperfang_r1, 5, 37, -0.6F, -1.1F, -0.5F, 1, 2, 1, -0.3F, true));

        this.Rightupperfang_r1 = new ModelRenderer(this);
        this.Rightupperfang_r1.setRotationPoint(-0.1F, 0.9F, -1.0F);
        this.Rightupperfang.addChild(Rightupperfang_r1);
        this.setRotateAngle(Rightupperfang_r1, 0.0865F, 0.0114F, -0.1304F);
        this.Rightupperfang_r1.cubeList.add(new ModelBox(Rightupperfang_r1, 5, 37, -0.4F, -1.1F, -0.5F, 1, 2, 1, -0.3F, false));

        this.Rightupperbackteeth = new ModelRenderer(this);
        this.Rightupperbackteeth.setRotationPoint(0.78F, 2.3F, -2.3F);
        this.Snout.addChild(Rightupperbackteeth);
        this.setRotateAngle(Rightupperbackteeth, 1.5708F, 0.0F, 0.0F);


        this.Leftupperbackteeth_r1 = new ModelRenderer(this);
        this.Leftupperbackteeth_r1.setRotationPoint(-1.54F, 1.0F, 0.3F);
        this.Rightupperbackteeth.addChild(Leftupperbackteeth_r1);
        this.setRotateAngle(Leftupperbackteeth_r1, -0.2269F, 0.0F, 0.0F);
        this.Leftupperbackteeth_r1.cubeList.add(new ModelBox(Leftupperbackteeth_r1, 0, 20, 0.0F, -0.8F, -0.5F, 0, 2, 1, 0.0F, true));
        this.Leftupperbackteeth_r1.cubeList.add(new ModelBox(Leftupperbackteeth_r1, 0, 20, 1.54F, -0.8F, -0.5F, 0, 2, 1, 0.0F, false));

        this.leftZygomaticarch = new ModelRenderer(this);
        this.leftZygomaticarch.setRotationPoint(1.9F, 0.4F, 0.9F);
        this.Eyeportion.addChild(leftZygomaticarch);
        this.leftZygomaticarch.cubeList.add(new ModelBox(leftZygomaticarch, 19, 35, -0.5F, 0.4F, -3.0F, 1, 1, 2, -0.099F, false));

        this.Eyeportion_r1 = new ModelRenderer(this);
        this.Eyeportion_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftZygomaticarch.addChild(Eyeportion_r1);
        this.setRotateAngle(Eyeportion_r1, -2.3388F, -0.4816F, 0.4206F);
        this.Eyeportion_r1.cubeList.add(new ModelBox(Eyeportion_r1, 7, 26, -0.5F, -1.6843F, -0.1323F, 1, 2, 1, -0.1F, false));

        this.Eyeportion_r2 = new ModelRenderer(this);
        this.Eyeportion_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftZygomaticarch.addChild(Eyeportion_r2);
        this.setRotateAngle(Eyeportion_r2, -1.7104F, 0.0F, 0.0F);
        this.Eyeportion_r2.cubeList.add(new ModelBox(Eyeportion_r2, 9, 40, -0.5F, -0.0757F, -0.164F, 1, 1, 1, -0.099F, false));

        this.Eyeportion_r3 = new ModelRenderer(this);
        this.Eyeportion_r3.setRotationPoint(0.0F, 1.4F, -0.7F);
        this.leftZygomaticarch.addChild(Eyeportion_r3);
        this.setRotateAngle(Eyeportion_r3, -0.6981F, 0.0F, 0.0F);
        this.Eyeportion_r3.cubeList.add(new ModelBox(Eyeportion_r3, 39, 18, -0.5F, -0.9016F, -0.9071F, 1, 1, 1, -0.1F, false));

        this.Eyeportion_r4 = new ModelRenderer(this);
        this.Eyeportion_r4.setRotationPoint(0.0F, 1.3F, -1.4F);
        this.leftZygomaticarch.addChild(Eyeportion_r4);
        this.setRotateAngle(Eyeportion_r4, -0.1396F, 0.0F, 0.0F);
        this.Eyeportion_r4.cubeList.add(new ModelBox(Eyeportion_r4, 19, 39, -0.5F, -0.9F, -0.2F, 1, 1, 1, -0.102F, false));

        this.Eyeportion_r5 = new ModelRenderer(this);
        this.Eyeportion_r5.setRotationPoint(0.0F, -0.2F, -0.8F);
        this.leftZygomaticarch.addChild(Eyeportion_r5);
        this.setRotateAngle(Eyeportion_r5, -1.5184F, 0.0F, 0.0F);
        this.Eyeportion_r5.cubeList.add(new ModelBox(Eyeportion_r5, 39, 38, -0.5F, -0.0957F, -0.0773F, 1, 1, 1, -0.105F, false));

        this.Eyeportion_r6 = new ModelRenderer(this);
        this.Eyeportion_r6.setRotationPoint(0.0F, -0.1F, -1.6F);
        this.leftZygomaticarch.addChild(Eyeportion_r6);
        this.setRotateAngle(Eyeportion_r6, -1.0297F, 0.0F, 0.0F);
        this.Eyeportion_r6.cubeList.add(new ModelBox(Eyeportion_r6, 24, 39, -0.5F, 0.4001F, -0.1353F, 1, 1, 1, -0.102F, false));
        this.Eyeportion_r6.cubeList.add(new ModelBox(Eyeportion_r6, 39, 12, -0.5F, -0.0999F, -0.1353F, 1, 1, 1, -0.1F, false));

        this.Eyeportion_r7 = new ModelRenderer(this);
        this.Eyeportion_r7.setRotationPoint(0.4F, 0.9F, -2.8F);
        this.leftZygomaticarch.addChild(Eyeportion_r7);
        this.setRotateAngle(Eyeportion_r7, 0.0F, 0.925F, 0.0F);
        this.Eyeportion_r7.cubeList.add(new ModelBox(Eyeportion_r7, 31, 32, -0.8F, -0.5F, -1.9F, 1, 1, 2, -0.102F, false));

        this.rightZygomaticarch = new ModelRenderer(this);
        this.rightZygomaticarch.setRotationPoint(-1.88F, 0.4F, 0.9F);
        this.Eyeportion.addChild(rightZygomaticarch);
        this.rightZygomaticarch.cubeList.add(new ModelBox(rightZygomaticarch, 19, 35, -0.5F, 0.4F, -3.0F, 1, 1, 2, -0.099F, true));

        this.Eyeportion_r8 = new ModelRenderer(this);
        this.Eyeportion_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightZygomaticarch.addChild(Eyeportion_r8);
        this.setRotateAngle(Eyeportion_r8, -2.3388F, 0.4816F, -0.4206F);
        this.Eyeportion_r8.cubeList.add(new ModelBox(Eyeportion_r8, 7, 26, -0.5F, -1.6843F, -0.1323F, 1, 2, 1, -0.1F, true));

        this.Eyeportion_r9 = new ModelRenderer(this);
        this.Eyeportion_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightZygomaticarch.addChild(Eyeportion_r9);
        this.setRotateAngle(Eyeportion_r9, -1.7104F, 0.0F, 0.0F);
        this.Eyeportion_r9.cubeList.add(new ModelBox(Eyeportion_r9, 9, 40, -0.5F, -0.0757F, -0.164F, 1, 1, 1, -0.099F, true));

        this.Eyeportion_r10 = new ModelRenderer(this);
        this.Eyeportion_r10.setRotationPoint(0.0F, 1.4F, -0.7F);
        this.rightZygomaticarch.addChild(Eyeportion_r10);
        this.setRotateAngle(Eyeportion_r10, -0.6981F, 0.0F, 0.0F);
        this.Eyeportion_r10.cubeList.add(new ModelBox(Eyeportion_r10, 39, 18, -0.5F, -0.9016F, -0.9071F, 1, 1, 1, -0.1F, true));

        this.Eyeportion_r11 = new ModelRenderer(this);
        this.Eyeportion_r11.setRotationPoint(0.0F, 1.3F, -1.4F);
        this.rightZygomaticarch.addChild(Eyeportion_r11);
        this.setRotateAngle(Eyeportion_r11, -0.1396F, 0.0F, 0.0F);
        this.Eyeportion_r11.cubeList.add(new ModelBox(Eyeportion_r11, 19, 39, -0.5F, -0.9F, -0.2F, 1, 1, 1, -0.102F, true));

        this.Eyeportion_r12 = new ModelRenderer(this);
        this.Eyeportion_r12.setRotationPoint(0.0F, -0.2F, -0.8F);
        this.rightZygomaticarch.addChild(Eyeportion_r12);
        this.setRotateAngle(Eyeportion_r12, -1.5184F, 0.0F, 0.0F);
        this.Eyeportion_r12.cubeList.add(new ModelBox(Eyeportion_r12, 39, 38, -0.5F, -0.0957F, -0.0773F, 1, 1, 1, -0.105F, true));

        this.Eyeportion_r13 = new ModelRenderer(this);
        this.Eyeportion_r13.setRotationPoint(0.0F, -0.1F, -1.6F);
        this.rightZygomaticarch.addChild(Eyeportion_r13);
        this.setRotateAngle(Eyeportion_r13, -1.0297F, 0.0F, 0.0F);
        this.Eyeportion_r13.cubeList.add(new ModelBox(Eyeportion_r13, 24, 39, -0.5F, 0.4001F, -0.1353F, 1, 1, 1, -0.102F, true));
        this.Eyeportion_r13.cubeList.add(new ModelBox(Eyeportion_r13, 39, 12, -0.5F, -0.0999F, -0.1353F, 1, 1, 1, -0.1F, true));

        this.Eyeportion_r14 = new ModelRenderer(this);
        this.Eyeportion_r14.setRotationPoint(-0.4F, 0.9F, -2.8F);
        this.rightZygomaticarch.addChild(Eyeportion_r14);
        this.setRotateAngle(Eyeportion_r14, 0.0F, -0.925F, 0.0F);
        this.Eyeportion_r14.cubeList.add(new ModelBox(Eyeportion_r14, 31, 32, -0.2F, -0.5F, -1.9F, 1, 1, 2, -0.102F, true));

        this.Lowerjawbase = new ModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.01F, 0.01F, -2.3F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 0.7442F, 0.0F, 0.0F);


        this.Lowerjawbase_r1 = new ModelRenderer(this);
        this.Lowerjawbase_r1.setRotationPoint(0.48F, 1.1978F, 0.131F);
        this.Lowerjawbase.addChild(Lowerjawbase_r1);
        this.setRotateAngle(Lowerjawbase_r1, -0.0698F, 0.0F, 0.0F);
        this.Lowerjawbase_r1.cubeList.add(new ModelBox(Lowerjawbase_r1, 41, 26, -2.0F, -0.0412F, -1.0197F, 1, 1, 1, -0.003F, true));

        this.Lowerjawbase_r2 = new ModelRenderer(this);
        this.Lowerjawbase_r2.setRotationPoint(0.48F, 0.6978F, -0.069F);
        this.Lowerjawbase.addChild(Lowerjawbase_r2);
        this.setRotateAngle(Lowerjawbase_r2, -0.925F, 0.0F, 0.0F);
        this.Lowerjawbase_r2.cubeList.add(new ModelBox(Lowerjawbase_r2, 38, 4, -2.0F, -1.2F, -0.5F, 1, 2, 1, 0.0F, true));

        this.Lowerjawbase_r3 = new ModelRenderer(this);
        this.Lowerjawbase_r3.setRotationPoint(0.48F, 0.836F, -0.8377F);
        this.Lowerjawbase.addChild(Lowerjawbase_r3);
        this.setRotateAngle(Lowerjawbase_r3, -0.1309F, 0.0F, 0.0F);
        this.Lowerjawbase_r3.cubeList.add(new ModelBox(Lowerjawbase_r3, 0, 6, -2.0F, -0.7F, -0.5F, 1, 2, 1, 0.004F, true));
        this.Lowerjawbase_r3.cubeList.add(new ModelBox(Lowerjawbase_r3, 0, 6, 0.02F, -0.7F, -0.5F, 1, 2, 1, 0.004F, false));

        this.Lowerjawbase_r4 = new ModelRenderer(this);
        this.Lowerjawbase_r4.setRotationPoint(-0.5F, 1.1978F, 0.131F);
        this.Lowerjawbase.addChild(Lowerjawbase_r4);
        this.setRotateAngle(Lowerjawbase_r4, -0.0698F, 0.0F, 0.0F);
        this.Lowerjawbase_r4.cubeList.add(new ModelBox(Lowerjawbase_r4, 41, 26, 1.0F, -0.0412F, -1.0197F, 1, 1, 1, -0.003F, false));

        this.Lowerjawbase_r5 = new ModelRenderer(this);
        this.Lowerjawbase_r5.setRotationPoint(-0.5F, 0.6978F, -0.069F);
        this.Lowerjawbase.addChild(Lowerjawbase_r5);
        this.setRotateAngle(Lowerjawbase_r5, -0.925F, 0.0F, 0.0F);
        this.Lowerjawbase_r5.cubeList.add(new ModelBox(Lowerjawbase_r5, 38, 4, 1.0F, -1.2F, -0.5F, 1, 2, 1, 0.0F, false));

        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(-0.01F, 0.866F, -2.5877F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.0848F, 0.0F, 0.0F);


        this.Lowerjawmiddle_r1 = new ModelRenderer(this);
        this.Lowerjawmiddle_r1.setRotationPoint(0.0F, 1.7021F, 1.5408F);
        this.Lowerjawmiddle.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, -0.2618F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 34, 0, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 34, 0, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.005F, false));

        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 1.45F, 0.39F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.1911F, 0.0F, 0.0F);


        this.Lowerjawfront_r1 = new ModelRenderer(this);
        this.Lowerjawfront_r1.setRotationPoint(0.0F, 0.1F, -1.3F);
        this.Lowerjawfront.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, 0.7767F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 40, 33, -0.9F, -0.891F, -0.0892F, 1, 1, 1, -0.1F, true));
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 40, 33, -0.1F, -0.891F, -0.0892F, 1, 1, 1, -0.105F, false));

        this.Lowerjawfront_r2 = new ModelRenderer(this);
        this.Lowerjawfront_r2.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.Lowerjawfront.addChild(Lowerjawfront_r2);
        this.setRotateAngle(Lowerjawfront_r2, 0.2356F, 0.0F, 0.0F);
        this.Lowerjawfront_r2.cubeList.add(new ModelBox(Lowerjawfront_r2, 0, 41, -1.0F, -1.1F, -1.3F, 1, 1, 1, 0.005F, true));
        this.Lowerjawfront_r2.cubeList.add(new ModelBox(Lowerjawfront_r2, 0, 41, 0.0F, -1.1F, -1.3F, 1, 1, 1, 0.004F, false));

        this.Lowerfrontteeth = new ModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, -0.1F, -1.9F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, -0.8067F, 0.0F, 0.0F);


        this.Lowerfrontteeth_r1 = new ModelRenderer(this);
        this.Lowerfrontteeth_r1.setRotationPoint(-0.7F, -0.3F, -0.3F);
        this.Lowerfrontteeth.addChild(Lowerfrontteeth_r1);
        this.setRotateAngle(Lowerfrontteeth_r1, -0.1745F, 0.0F, 0.0F);
        this.Lowerfrontteeth_r1.cubeList.add(new ModelBox(Lowerfrontteeth_r1, 34, 8, -0.1F, -0.7F, -1.6F, 1, 1, 2, -0.3F, true));
        this.Lowerfrontteeth_r1.cubeList.add(new ModelBox(Lowerfrontteeth_r1, 34, 8, 0.5F, -0.7F, -1.6F, 1, 1, 2, -0.3F, false));

        this.Rightlowerfang = new ModelRenderer(this);
        this.Rightlowerfang.setRotationPoint(0.51F, -0.7F, -0.4F);
        this.Lowerjawfront.addChild(Rightlowerfang);
        this.setRotateAngle(Rightlowerfang, 0.0F, 0.0F, 0.1485F);


        this.Leftlowerfang_r1 = new ModelRenderer(this);
        this.Leftlowerfang_r1.setRotationPoint(-1.02F, -0.1F, 0.5F);
        this.Rightlowerfang.addChild(Leftlowerfang_r1);
        this.setRotateAngle(Leftlowerfang_r1, -0.0698F, 0.0F, 0.0F);
        this.Leftlowerfang_r1.cubeList.add(new ModelBox(Leftlowerfang_r1, 8, 6, 0.0F, -0.4F, -1.3F, 0, 1, 2, 0.0F, true));
        this.Leftlowerfang_r1.cubeList.add(new ModelBox(Leftlowerfang_r1, 8, 6, 1.02F, -0.4F, -1.3F, 0, 1, 2, 0.0F, false));

        this.Mouthinterior = new ModelRenderer(this);
        this.Mouthinterior.setRotationPoint(-0.01F, -1.0F, -2.0F);
        this.Lowerjawfront.addChild(Mouthinterior);
        this.setRotateAngle(Mouthinterior, 0.2335F, 0.0F, 0.0F);


        this.Jawparting = new ModelRenderer(this);
        this.Jawparting.setRotationPoint(0.02F, 0.0F, 0.3F);
        this.Lowerjawmiddle.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.4671F, 0.0F, 0.0F);


        this.Lowerjawfluff = new ModelRenderer(this);
        this.Lowerjawfluff.setRotationPoint(-0.02F, 1.45F, -0.03F);
        this.Lowerjawmiddle.addChild(Lowerjawfluff);
        this.setRotateAngle(Lowerjawfluff, -0.0637F, 0.0F, 0.0F);


        this.Lowerjawfluff_r1 = new ModelRenderer(this);
        this.Lowerjawfluff_r1.setRotationPoint(0.04F, -0.0682F, 2.5291F);
        this.Lowerjawfluff.addChild(Lowerjawfluff_r1);
        this.setRotateAngle(Lowerjawfluff_r1, 0.2443F, 0.0F, 0.0F);
        this.Lowerjawfluff_r1.cubeList.add(new ModelBox(Lowerjawfluff_r1, 41, 29, -1.5F, -1.0F, -1.0F, 1, 1, 1, 0.004F, true));
        this.Lowerjawfluff_r1.cubeList.add(new ModelBox(Lowerjawfluff_r1, 41, 29, 0.46F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(2.2F, 3.5F, -3.5F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, -2.1739F, 0.4451F, -0.4333F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 31, 36, 0.0F, -1.0195F, -0.2583F, 1, 2, 1, 0.0F, false));
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 29, 40, 0.0F, -0.5195F, 0.7417F, 1, 1, 1, 0.0F, false));
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 36, 30, 0.0F, -1.0195F, 1.7417F, 1, 2, 1, 0.0F, false));

        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.8F, -0.3838F, 2.642F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, 1.244F, -0.1077F, -0.554F);


        this.Rightlowerarm_r1 = new ModelRenderer(this);
        this.Rightlowerarm_r1.setRotationPoint(0.0F, 2.0592F, 0.1044F);
        this.Rightlowerarm.addChild(Rightlowerarm_r1);
        this.setRotateAngle(Rightlowerarm_r1, -0.1745F, 0.0F, 0.0F);
        this.Rightlowerarm_r1.cubeList.add(new ModelBox(Rightlowerarm_r1, 14, 35, -1.0F, -1.3F, -1.3F, 1, 4, 1, -0.2F, false));
        this.Rightlowerarm_r1.cubeList.add(new ModelBox(Rightlowerarm_r1, 26, 32, 0.0F, -2.9F, -0.4F, 1, 5, 1, 0.0F, false));

        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 3.8559F, 0.1488F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.8467F, -0.0637F, -0.0213F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 0, 15, -1.5F, -0.5F, -3.0F, 3, 1, 3, 0.0F, false));

        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-2.18F, 3.5F, -3.5F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.5594F, -0.4451F, 0.4333F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 31, 36, -1.0F, -1.0195F, -0.2583F, 1, 2, 1, 0.0F, true));
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 29, 40, -1.0F, -0.5195F, 0.7417F, 1, 1, 1, 0.0F, true));
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 36, 30, -1.0F, -1.0195F, 1.7417F, 1, 2, 1, 0.0F, true));

        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-0.8F, -0.3838F, 2.642F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, 0.8805F, 0.5763F, -0.0784F);


        this.Leftlowerarm_r1 = new ModelRenderer(this);
        this.Leftlowerarm_r1.setRotationPoint(0.0F, 2.0592F, 0.1044F);
        this.Leftlowerarm.addChild(Leftlowerarm_r1);
        this.setRotateAngle(Leftlowerarm_r1, -0.1745F, 0.0F, 0.0F);
        this.Leftlowerarm_r1.cubeList.add(new ModelBox(Leftlowerarm_r1, 14, 35, 0.0F, -1.3F, -1.3F, 1, 4, 1, -0.2F, true));
        this.Leftlowerarm_r1.cubeList.add(new ModelBox(Leftlowerarm_r1, 26, 32, -1.0F, -2.9F, -0.4F, 1, 5, 1, 0.0F, true));

        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 3.8559F, 0.1488F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.0555F, 0.0688F, -0.066F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 0, 15, -1.5F, -0.5F, -3.0F, 3, 1, 3, 0.0F, true));

        this.Chestslope = new ModelRenderer(this);
        this.Chestslope.setRotationPoint(0.0F, 4.5F, -4.5F);
        this.Bodyfront.addChild(Chestslope);
        this.setRotateAngle(Chestslope, -0.1698F, 0.0F, 0.0F);


        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.4F, 1.5F, -1.1F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.5212F, 0.0F, 0.0F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 0, 35, 0.0F, -0.5F, -0.5F, 1, 4, 1, 0.0F, false));

        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.8F, 3.2F, -0.1F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, -0.3318F, 0.0F, 0.0F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 0, 26, -0.3F, -0.8008F, -0.3916F, 1, 1, 4, -0.2F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 25, 26, -1.3F, -0.8008F, -0.3916F, 1, 1, 4, 0.0F, false));

        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(-0.4F, 0.0729F, 3.3327F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 0.7663F, 0.1006F, -0.0081F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 0, 0, -1.5F, -0.5F, -3.5F, 3, 1, 4, 0.0F, false));

        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.4F, 1.5F, -1.1F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.2642F, 0.0F, 0.0F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 0, 35, -1.0F, -0.5F, -0.5F, 1, 4, 1, 0.0F, true));

        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.8F, 3.2F, -0.1F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, -0.6372F, 0.0F, 0.0F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 0, 26, -0.7F, -0.8008F, -0.3916F, 1, 1, 4, -0.2F, true));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 25, 26, 0.3F, -0.8008F, -0.3916F, 1, 1, 4, 0.0F, true));

        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.4F, 0.0729F, 3.3327F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 1.3298F, 0.0637F, 0.2122F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 0, 0, -1.5F, -0.5F, -3.5F, 3, 1, 4, 0.0F, true));

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
