package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCoelophysis extends ModelBase {
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
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodymiddle_r2;
    private final ModelRenderer Bodyfront_r2;
    private final ModelRenderer Bodyfront_r3;
    private final ModelRenderer Bodyfront_r4;
    private final ModelRenderer Bodyfront_r5;
    private final ModelRenderer Bodyfront_r6;
    private final ModelRenderer Bodyfront_r7;
    private final ModelRenderer Bodyfront_r8;
    private final ModelRenderer Bodyfront_r9;
    private final ModelRenderer Bodyfront_r10;
    private final ModelRenderer Bodyfront_r11;
    private final ModelRenderer Bodyfront_r12;
    private final ModelRenderer Bodyfront_r13;
    private final ModelRenderer Bodyfront_r14;
    private final ModelRenderer Bodyfront_r15;
    private final ModelRenderer Bodyfront_r16;
    private final ModelRenderer Bodyfront_r17;
    private final ModelRenderer Bodyfront_r18;
    private final ModelRenderer Bodyfront_r19;
    private final ModelRenderer Bodyfront_r20;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r21;
    private final ModelRenderer Bodyfront_r22;
    private final ModelRenderer Bodyfront_r23;
    private final ModelRenderer Bodyfront_r24;
    private final ModelRenderer Bodyfront_r25;
    private final ModelRenderer Bodyfront_r26;
    private final ModelRenderer Bodyfront_r27;
    private final ModelRenderer Bodyfront_r28;
    private final ModelRenderer Bodyfront_r29;
    private final ModelRenderer Bodyfront_r30;
    private final ModelRenderer Bodyfront_r31;
    private final ModelRenderer Bodyfront_r32;
    private final ModelRenderer Neckend_r1;
    private final ModelRenderer Bodyfront_r33;
    private final ModelRenderer Bodyfront_r34;
    private final ModelRenderer Bodyfront_r35;
    private final ModelRenderer Bodyfront_r36;
    private final ModelRenderer Bodyfront_r37;
    private final ModelRenderer Bodyfront_r38;
    private final ModelRenderer Neckend_r2;
    private final ModelRenderer Neckbase;
    private final ModelRenderer Neckbase_r1;
    private final ModelRenderer Neckend_r3;
    private final ModelRenderer Neckend_r4;
    private final ModelRenderer Neckmiddle;
    private final ModelRenderer Neckmiddle_r1;
    private final ModelRenderer Neckmiddle_r2;
    private final ModelRenderer Neckend_r5;
    private final ModelRenderer Neckend_r6;
    private final ModelRenderer Neckend_r7;
    private final ModelRenderer Neckend_r8;
    private final ModelRenderer Neckend_r9;
    private final ModelRenderer Neckend_r10;
    private final ModelRenderer Neckend_r11;
    private final ModelRenderer Neckend_r12;
    private final ModelRenderer Neckend;
    private final ModelRenderer Neckend_r13;
    private final ModelRenderer Neckend_r14;
    private final ModelRenderer Neckend_r15;
    private final ModelRenderer Neckend_r16;
    private final ModelRenderer Neckend_r17;
    private final ModelRenderer Head;
    private final ModelRenderer Head_r1;
    private final ModelRenderer Lowerjawbase;
    private final ModelRenderer Lowerjawbase_r1;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawmiddle_r1;
    private final ModelRenderer Lowerjawmiddle_r2;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerjawfront_r1;
    private final ModelRenderer Leftlowerteeth;
    private final ModelRenderer Rightlowerteeth;
    private final ModelRenderer Rightlowerteeth_r1;
    private final ModelRenderer Rightlowerteeth2;
    private final ModelRenderer Rightlowerteeth_r2;
    private final ModelRenderer Jawparting;
    private final ModelRenderer Upperjawbase;
    private final ModelRenderer Upperjawbase_r1;
    private final ModelRenderer Upperjawbase_r2;
    private final ModelRenderer Upperjawend;
    private final ModelRenderer Upperjawend_r1;
    private final ModelRenderer Snout;
    private final ModelRenderer Leftupperfrontteeth;
    private final ModelRenderer Rightupperfrontteeth;
    private final ModelRenderer Headslope;
    private final ModelRenderer Headslope_r1;
    private final ModelRenderer Leftupperbackteeth;
    private final ModelRenderer Rightupperbackteeth;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Righthand;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Lefthand;
    private final ModelRenderer Shoulderquills;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailbase_r1;
    private final ModelRenderer Bodyfront_r39;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailmiddlebase_r1;
    private final ModelRenderer Bodyfront_r40;
    private final ModelRenderer Tailbase_r2;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailmiddleend_r1;
    private final ModelRenderer Tailbase_r3;
    private final ModelRenderer Tailend;
    private final ModelRenderer Tailend_r1;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightthigh_r1;
    private final ModelRenderer Rightthigh_r2;
    private final ModelRenderer Rightthigh_r3;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Rightankle;
    private final ModelRenderer Rightfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Rightthigh_r4;
    private final ModelRenderer Rightthigh_r5;
    private final ModelRenderer Rightthigh_r6;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Leftankle;
    private final ModelRenderer Leftfoot;

    public ModelSkeletonCoelophysis() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -20.6F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 1.6F, -0.5F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.0637F, 0.0F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, 1.9702F, 0.4353F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.0175F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 37, 36, -0.5F, -2.3016F, -4.4595F, 1, 1, 9, 0.0F, false));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 35, -2.5F, -1.4305F, -3.15F, 1, 2, 3, 0.0F, true));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 0, -2.5F, -3.099F, -3.5243F, 1, 2, 6, 0.0F, true));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 18, -1.5F, -2.499F, -3.2243F, 1, 1, 5, 0.0F, true));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 35, 1.5F, -1.4305F, -3.15F, 1, 2, 3, 0.0F, false));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 18, 0.5F, -2.499F, -3.2243F, 1, 1, 5, 0.0F, false));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 0, 1.5F, -3.099F, -3.5243F, 1, 2, 6, 0.0F, false));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 37, 36, -0.5F, -2.8F, -4.5F, 1, 1, 9, 0.001F, false));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(-2.0F, 1.2641F, -1.9933F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.5847F, 0.0F, -0.2618F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 46, 61, -0.5F, 4.0222F, -1.6263F, 1, 5, 1, 0.0F, true));

        this.Hips_r3 = new ModelRenderer(this);
        this.Hips_r3.setRotationPoint(-2.0F, 1.2641F, -1.9933F);
        this.Hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.8029F, 0.0F, -0.2618F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 41, 61, -0.5F, -0.6273F, -0.664F, 1, 5, 1, 0.0F, true));

        this.Hips_r4 = new ModelRenderer(this);
        this.Hips_r4.setRotationPoint(-2.0F, 0.5597F, -0.8321F);
        this.Hips.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, 0.6404F, 0.1862F, -0.2435F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 41, 35, -0.7F, 0.1901F, -0.5018F, 1, 6, 1, 0.0F, true));

        this.Hips_r5 = new ModelRenderer(this);
        this.Hips_r5.setRotationPoint(2.0F, 0.5597F, -0.8321F);
        this.Hips.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, 0.6404F, -0.1862F, 0.2435F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 41, 35, -0.3F, 0.1901F, -0.5018F, 1, 6, 1, 0.0F, false));

        this.Hips_r6 = new ModelRenderer(this);
        this.Hips_r6.setRotationPoint(2.0F, 1.2641F, -1.9933F);
        this.Hips.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, -0.5847F, 0.0F, 0.2618F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 46, 61, -0.5F, 4.0222F, -1.6263F, 1, 5, 1, 0.0F, false));

        this.Hips_r7 = new ModelRenderer(this);
        this.Hips_r7.setRotationPoint(2.0F, 1.2641F, -1.9933F);
        this.Hips.addChild(Hips_r7);
        this.setRotateAngle(Hips_r7, -0.8029F, 0.0F, 0.2618F);
        this.Hips_r7.cubeList.add(new ModelBox(Hips_r7, 41, 61, -0.5F, -0.6273F, -0.664F, 1, 5, 1, 0.0F, false));

        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, -1.2565F, 0.2875F);
        this.Hips.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.0349F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 45, 48, 0.0F, -0.3F, -2.5F, 0, 1, 5, 0.0F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(-0.01F, -0.3298F, -3.6647F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.0286F, -0.0872F, 0.0025F);


        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, 2.2145F, -6.0226F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, 0.0436F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 32, 2, -0.5F, -2.0F, -3.5F, 1, 1, 10, -0.002F, false));
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 32, 2, -0.5F, -2.5F, -3.5F, 1, 1, 10, 0.0F, false));

        this.Bodymiddle_r2 = new ModelRenderer(this);
        this.Bodymiddle_r2.setRotationPoint(0.0F, 9.4046F, -5.8521F);
        this.Bodymiddle.addChild(Bodymiddle_r2);
        this.setRotateAngle(Bodymiddle_r2, -0.0436F, 0.0F, 0.0F);
        this.Bodymiddle_r2.cubeList.add(new ModelBox(Bodymiddle_r2, 45, 0, -2.5F, -3.9511F, -2.5172F, 5, 3, 5, 0.0F, false));

        this.Bodyfront_r2 = new ModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(-0.48F, -0.2195F, 0.0896F);
        this.Bodymiddle.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, 0.081F, 0.02F, -0.6106F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 32, 8, -1.9991F, -0.0079F, -0.6258F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r3 = new ModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(-0.48F, -0.0354F, -1.9019F);
        this.Bodymiddle.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, 0.1077F, 0.2778F, -1.2978F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 12, 39, -2.5263F, -1.291F, -0.6258F, 1, 0, 1, 0.0F, true));

        this.Bodyfront_r4 = new ModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(-0.48F, -0.0354F, -1.9019F);
        this.Bodymiddle.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, 0.2611F, 0.1441F, -0.5957F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 20, 54, -1.9991F, -0.0079F, -0.6258F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r5 = new ModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(-0.48F, 0.1486F, -3.8935F);
        this.Bodymiddle.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, 0.1329F, 0.3617F, -1.2898F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 62, 24, -3.5263F, -1.291F, -0.6258F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r6 = new ModelRenderer(this);
        this.Bodyfront_r6.setRotationPoint(-0.48F, 0.1486F, -3.8935F);
        this.Bodymiddle.addChild(Bodyfront_r6);
        this.setRotateAngle(Bodyfront_r6, 0.3347F, 0.1927F, -0.5834F);
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 7, 56, -1.9991F, -0.0079F, -0.6258F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r7 = new ModelRenderer(this);
        this.Bodyfront_r7.setRotationPoint(-0.48F, 0.3327F, -5.885F);
        this.Bodymiddle.addChild(Bodyfront_r7);
        this.setRotateAngle(Bodyfront_r7, 0.1596F, 0.4455F, -1.2793F);
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 19, 8, -4.5263F, -1.291F, -0.6258F, 3, 0, 1, 0.0F, true));

        this.Bodyfront_r8 = new ModelRenderer(this);
        this.Bodyfront_r8.setRotationPoint(-0.48F, 0.3327F, -5.885F);
        this.Bodymiddle.addChild(Bodyfront_r8);
        this.setRotateAngle(Bodyfront_r8, 0.4096F, 0.2402F, -0.5673F);
        this.Bodyfront_r8.cubeList.add(new ModelBox(Bodyfront_r8, 25, 58, -1.9991F, -0.0079F, -0.6258F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r9 = new ModelRenderer(this);
        this.Bodyfront_r9.setRotationPoint(-0.48F, 0.5167F, -7.8765F);
        this.Bodymiddle.addChild(Bodyfront_r9);
        this.setRotateAngle(Bodyfront_r9, 0.2042F, 0.5704F, -1.2576F);
        this.Bodyfront_r9.cubeList.add(new ModelBox(Bodyfront_r9, 38, 0, -5.5263F, -1.291F, -0.6258F, 4, 0, 1, 0.0F, true));

        this.Bodyfront_r10 = new ModelRenderer(this);
        this.Bodyfront_r10.setRotationPoint(-0.48F, 0.5167F, -7.8765F);
        this.Bodymiddle.addChild(Bodyfront_r10);
        this.setRotateAngle(Bodyfront_r10, 0.5255F, 0.3088F, -0.5359F);
        this.Bodyfront_r10.cubeList.add(new ModelBox(Bodyfront_r10, 58, 37, -1.9991F, -0.0079F, -0.6258F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r11 = new ModelRenderer(this);
        this.Bodyfront_r11.setRotationPoint(0.5F, -0.2195F, 0.0896F);
        this.Bodymiddle.addChild(Bodyfront_r11);
        this.setRotateAngle(Bodyfront_r11, 0.081F, -0.02F, 0.6106F);
        this.Bodyfront_r11.cubeList.add(new ModelBox(Bodyfront_r11, 32, 8, -0.0009F, -0.0079F, -0.6258F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r12 = new ModelRenderer(this);
        this.Bodyfront_r12.setRotationPoint(0.5F, -0.0354F, -1.9019F);
        this.Bodymiddle.addChild(Bodyfront_r12);
        this.setRotateAngle(Bodyfront_r12, 0.2611F, -0.1441F, 0.5957F);
        this.Bodyfront_r12.cubeList.add(new ModelBox(Bodyfront_r12, 20, 54, -0.0009F, -0.0079F, -0.6258F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r13 = new ModelRenderer(this);
        this.Bodyfront_r13.setRotationPoint(0.5F, -0.0354F, -1.9019F);
        this.Bodymiddle.addChild(Bodyfront_r13);
        this.setRotateAngle(Bodyfront_r13, 0.1077F, -0.2778F, 1.2978F);
        this.Bodyfront_r13.cubeList.add(new ModelBox(Bodyfront_r13, 12, 39, 1.5263F, -1.291F, -0.6258F, 1, 0, 1, 0.0F, false));

        this.Bodyfront_r14 = new ModelRenderer(this);
        this.Bodyfront_r14.setRotationPoint(0.5F, 0.1486F, -3.8935F);
        this.Bodymiddle.addChild(Bodyfront_r14);
        this.setRotateAngle(Bodyfront_r14, 0.3347F, -0.1927F, 0.5834F);
        this.Bodyfront_r14.cubeList.add(new ModelBox(Bodyfront_r14, 7, 56, -0.0009F, -0.0079F, -0.6258F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r15 = new ModelRenderer(this);
        this.Bodyfront_r15.setRotationPoint(0.5F, 0.1486F, -3.8935F);
        this.Bodymiddle.addChild(Bodyfront_r15);
        this.setRotateAngle(Bodyfront_r15, 0.1329F, -0.3617F, 1.2898F);
        this.Bodyfront_r15.cubeList.add(new ModelBox(Bodyfront_r15, 62, 24, 1.5263F, -1.291F, -0.6258F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r16 = new ModelRenderer(this);
        this.Bodyfront_r16.setRotationPoint(0.5F, 0.3327F, -5.885F);
        this.Bodymiddle.addChild(Bodyfront_r16);
        this.setRotateAngle(Bodyfront_r16, 0.4096F, -0.2402F, 0.5673F);
        this.Bodyfront_r16.cubeList.add(new ModelBox(Bodyfront_r16, 25, 58, -0.0009F, -0.0079F, -0.6258F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r17 = new ModelRenderer(this);
        this.Bodyfront_r17.setRotationPoint(0.5F, 0.3327F, -5.885F);
        this.Bodymiddle.addChild(Bodyfront_r17);
        this.setRotateAngle(Bodyfront_r17, 0.1596F, -0.4455F, 1.2793F);
        this.Bodyfront_r17.cubeList.add(new ModelBox(Bodyfront_r17, 19, 8, 1.5263F, -1.291F, -0.6258F, 3, 0, 1, 0.0F, false));

        this.Bodyfront_r18 = new ModelRenderer(this);
        this.Bodyfront_r18.setRotationPoint(0.5F, 0.5167F, -7.8765F);
        this.Bodymiddle.addChild(Bodyfront_r18);
        this.setRotateAngle(Bodyfront_r18, 0.2042F, -0.5704F, 1.2576F);
        this.Bodyfront_r18.cubeList.add(new ModelBox(Bodyfront_r18, 38, 0, 1.5263F, -1.291F, -0.6258F, 4, 0, 1, 0.0F, false));

        this.Bodyfront_r19 = new ModelRenderer(this);
        this.Bodyfront_r19.setRotationPoint(0.5F, 0.5167F, -7.8765F);
        this.Bodymiddle.addChild(Bodyfront_r19);
        this.setRotateAngle(Bodyfront_r19, 0.5255F, -0.3088F, 0.5359F);
        this.Bodyfront_r19.cubeList.add(new ModelBox(Bodyfront_r19, 58, 37, -0.0009F, -0.0079F, -0.6258F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r20 = new ModelRenderer(this);
        this.Bodyfront_r20.setRotationPoint(0.0F, 0.3645F, -9.9226F);
        this.Bodymiddle.addChild(Bodyfront_r20);
        this.setRotateAngle(Bodyfront_r20, 0.0524F, 0.0F, 0.0F);
        this.Bodyfront_r20.cubeList.add(new ModelBox(Bodyfront_r20, 62, 26, 0.01F, -1.05F, 9.4F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r20.cubeList.add(new ModelBox(Bodyfront_r20, 62, 49, 0.01F, -1.05F, 7.4F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r20.cubeList.add(new ModelBox(Bodyfront_r20, 63, 15, 0.01F, -1.15F, 5.4F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r20.cubeList.add(new ModelBox(Bodyfront_r20, 63, 29, 0.01F, -1.25F, 3.4F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r20.cubeList.add(new ModelBox(Bodyfront_r20, 63, 32, 0.01F, -1.15F, 1.4F, 0, 1, 1, 0.0F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.2145F, -9.5226F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1373F, -0.1297F, -0.0179F);


        this.Bodyfront_r21 = new ModelRenderer(this);
        this.Bodyfront_r21.setRotationPoint(0.0F, 9.4528F, 3.9253F);
        this.Bodyfront.addChild(Bodyfront_r21);
        this.setRotateAngle(Bodyfront_r21, -0.2094F, 0.0F, 0.0F);
        this.Bodyfront_r21.cubeList.add(new ModelBox(Bodyfront_r21, 24, 45, -1.9F, -1.3573F, -7.8736F, 4, 1, 4, 0.0F, false));

        this.Bodyfront_r22 = new ModelRenderer(this);
        this.Bodyfront_r22.setRotationPoint(-2.98F, 3.8049F, -5.7713F);
        this.Bodyfront.addChild(Bodyfront_r22);
        this.setRotateAngle(Bodyfront_r22, 0.747F, -0.1717F, 0.4303F);
        this.Bodyfront_r22.cubeList.add(new ModelBox(Bodyfront_r22, 0, 56, -0.2F, 0.057F, 0.9959F, 1, 1, 4, 0.0F, true));
        this.Bodyfront_r22.cubeList.add(new ModelBox(Bodyfront_r22, 58, 61, -0.2F, -0.443F, -1.0041F, 1, 2, 2, 0.0F, true));

        this.Bodyfront_r23 = new ModelRenderer(this);
        this.Bodyfront_r23.setRotationPoint(-2.98F, 3.3049F, -5.2713F);
        this.Bodyfront.addChild(Bodyfront_r23);
        this.setRotateAngle(Bodyfront_r23, 0.747F, -0.1717F, 0.4303F);
        this.Bodyfront_r23.cubeList.add(new ModelBox(Bodyfront_r23, 59, 41, 0.8F, -0.443F, -2.0041F, 3, 2, 1, 0.0F, true));

        this.Bodyfront_r24 = new ModelRenderer(this);
        this.Bodyfront_r24.setRotationPoint(3.0F, 3.3049F, -5.2713F);
        this.Bodyfront.addChild(Bodyfront_r24);
        this.setRotateAngle(Bodyfront_r24, 0.747F, 0.1717F, -0.4303F);
        this.Bodyfront_r24.cubeList.add(new ModelBox(Bodyfront_r24, 59, 41, -3.8F, -0.443F, -2.0041F, 3, 2, 1, 0.0F, false));

        this.Bodyfront_r25 = new ModelRenderer(this);
        this.Bodyfront_r25.setRotationPoint(3.0F, 3.8049F, -5.7713F);
        this.Bodyfront.addChild(Bodyfront_r25);
        this.setRotateAngle(Bodyfront_r25, 0.747F, 0.1717F, -0.4303F);
        this.Bodyfront_r25.cubeList.add(new ModelBox(Bodyfront_r25, 58, 61, -0.8F, -0.443F, -1.0041F, 1, 2, 2, 0.0F, false));
        this.Bodyfront_r25.cubeList.add(new ModelBox(Bodyfront_r25, 0, 56, -0.8F, 0.057F, 0.9959F, 1, 1, 4, 0.0F, false));

        this.Bodyfront_r26 = new ModelRenderer(this);
        this.Bodyfront_r26.setRotationPoint(0.0F, 0.4128F, -0.1452F);
        this.Bodyfront.addChild(Bodyfront_r26);
        this.setRotateAngle(Bodyfront_r26, 0.0524F, 0.0F, 0.0F);
        this.Bodyfront_r26.cubeList.add(new ModelBox(Bodyfront_r26, 0, 47, -0.5F, -0.25F, -6.8F, 1, 1, 7, -0.003F, false));
        this.Bodyfront_r26.cubeList.add(new ModelBox(Bodyfront_r26, 63, 55, 0.01F, -1.25F, -0.8F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r26.cubeList.add(new ModelBox(Bodyfront_r26, 21, 64, 0.01F, -1.25F, -2.8F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r26.cubeList.add(new ModelBox(Bodyfront_r26, 24, 64, 0.01F, -1.15F, -4.8F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r26.cubeList.add(new ModelBox(Bodyfront_r26, 64, 38, 0.01F, -1.05F, -6.8F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r26.cubeList.add(new ModelBox(Bodyfront_r26, 0, 47, -0.5F, -0.75F, -6.8F, 1, 1, 7, 0.001F, false));

        this.Bodyfront_r27 = new ModelRenderer(this);
        this.Bodyfront_r27.setRotationPoint(-0.48F, 0.5682F, -0.3082F);
        this.Bodyfront.addChild(Bodyfront_r27);
        this.setRotateAngle(Bodyfront_r27, 0.1856F, 0.5206F, -1.2672F);
        this.Bodyfront_r27.cubeList.add(new ModelBox(Bodyfront_r27, 45, 9, -6.4719F, -1.3041F, -0.5777F, 5, 0, 1, 0.0F, true));

        this.Bodyfront_r28 = new ModelRenderer(this);
        this.Bodyfront_r28.setRotationPoint(-0.48F, 0.5682F, -0.3082F);
        this.Bodyfront.addChild(Bodyfront_r28);
        this.setRotateAngle(Bodyfront_r28, 0.4786F, 0.2818F, -0.5495F);
        this.Bodyfront_r28.cubeList.add(new ModelBox(Bodyfront_r28, 59, 45, -1.9659F, -0.0529F, -0.5777F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r29 = new ModelRenderer(this);
        this.Bodyfront_r29.setRotationPoint(-0.48F, 0.4759F, -2.4062F);
        this.Bodyfront.addChild(Bodyfront_r29);
        this.setRotateAngle(Bodyfront_r29, 0.4941F, 0.2909F, -0.5451F);
        this.Bodyfront_r29.cubeList.add(new ModelBox(Bodyfront_r29, 21, 62, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r30 = new ModelRenderer(this);
        this.Bodyfront_r30.setRotationPoint(-0.48F, 0.4759F, -2.4062F);
        this.Bodyfront.addChild(Bodyfront_r30);
        this.setRotateAngle(Bodyfront_r30, 0.1917F, 0.5372F, -1.2642F);
        this.Bodyfront_r30.cubeList.add(new ModelBox(Bodyfront_r30, 19, 14, -7.5321F, -1.2856F, -0.5F, 6, 0, 1, 0.0F, true));

        this.Bodyfront_r31 = new ModelRenderer(this);
        this.Bodyfront_r31.setRotationPoint(-0.48F, 0.8875F, -4.4262F);
        this.Bodyfront.addChild(Bodyfront_r31);
        this.setRotateAngle(Bodyfront_r31, 0.238F, 0.6532F, -1.2381F);
        this.Bodyfront_r31.cubeList.add(new ModelBox(Bodyfront_r31, 19, 12, -6.5321F, -1.2856F, -0.5F, 5, 0, 1, 0.0F, true));

        this.Bodyfront_r32 = new ModelRenderer(this);
        this.Bodyfront_r32.setRotationPoint(-0.48F, 0.8875F, -4.4262F);
        this.Bodyfront.addChild(Bodyfront_r32);
        this.setRotateAngle(Bodyfront_r32, 0.6054F, 0.3524F, -0.5099F);
        this.Bodyfront_r32.cubeList.add(new ModelBox(Bodyfront_r32, 62, 22, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Neckend_r1 = new ModelRenderer(this);
        this.Neckend_r1.setRotationPoint(-0.49F, 1.349F, -6.5996F);
        this.Bodyfront.addChild(Neckend_r1);
        this.setRotateAngle(Neckend_r1, -0.6333F, -0.5736F, 0.1876F);
        this.Neckend_r1.cubeList.add(new ModelBox(Neckend_r1, 20, 56, -0.0232F, -0.6272F, -0.0189F, 0, 1, 4, 0.0F, true));

        this.Bodyfront_r33 = new ModelRenderer(this);
        this.Bodyfront_r33.setRotationPoint(0.5F, 0.5682F, -0.3082F);
        this.Bodyfront.addChild(Bodyfront_r33);
        this.setRotateAngle(Bodyfront_r33, 0.1856F, -0.5206F, 1.2672F);
        this.Bodyfront_r33.cubeList.add(new ModelBox(Bodyfront_r33, 45, 9, 1.4719F, -1.3041F, -0.5777F, 5, 0, 1, 0.0F, false));

        this.Bodyfront_r34 = new ModelRenderer(this);
        this.Bodyfront_r34.setRotationPoint(0.5F, 0.5682F, -0.3082F);
        this.Bodyfront.addChild(Bodyfront_r34);
        this.setRotateAngle(Bodyfront_r34, 0.4786F, -0.2818F, 0.5495F);
        this.Bodyfront_r34.cubeList.add(new ModelBox(Bodyfront_r34, 59, 45, -0.0341F, -0.0529F, -0.5777F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r35 = new ModelRenderer(this);
        this.Bodyfront_r35.setRotationPoint(0.5F, 0.4759F, -2.4062F);
        this.Bodyfront.addChild(Bodyfront_r35);
        this.setRotateAngle(Bodyfront_r35, 0.4941F, -0.2909F, 0.5451F);
        this.Bodyfront_r35.cubeList.add(new ModelBox(Bodyfront_r35, 21, 62, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r36 = new ModelRenderer(this);
        this.Bodyfront_r36.setRotationPoint(0.5F, 0.4759F, -2.4062F);
        this.Bodyfront.addChild(Bodyfront_r36);
        this.setRotateAngle(Bodyfront_r36, 0.1917F, -0.5372F, 1.2642F);
        this.Bodyfront_r36.cubeList.add(new ModelBox(Bodyfront_r36, 19, 14, 1.5321F, -1.2856F, -0.5F, 6, 0, 1, 0.0F, false));

        this.Bodyfront_r37 = new ModelRenderer(this);
        this.Bodyfront_r37.setRotationPoint(0.5F, 0.8875F, -4.4262F);
        this.Bodyfront.addChild(Bodyfront_r37);
        this.setRotateAngle(Bodyfront_r37, 0.238F, -0.6532F, 1.2381F);
        this.Bodyfront_r37.cubeList.add(new ModelBox(Bodyfront_r37, 19, 12, 1.5321F, -1.2856F, -0.5F, 5, 0, 1, 0.0F, false));

        this.Bodyfront_r38 = new ModelRenderer(this);
        this.Bodyfront_r38.setRotationPoint(0.5F, 0.8875F, -4.4262F);
        this.Bodyfront.addChild(Bodyfront_r38);
        this.setRotateAngle(Bodyfront_r38, 0.6054F, -0.3524F, 0.5099F);
        this.Bodyfront_r38.cubeList.add(new ModelBox(Bodyfront_r38, 62, 22, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Neckend_r2 = new ModelRenderer(this);
        this.Neckend_r2.setRotationPoint(0.51F, 1.349F, -6.5996F);
        this.Bodyfront.addChild(Neckend_r2);
        this.setRotateAngle(Neckend_r2, -0.6333F, 0.5736F, -0.1876F);
        this.Neckend_r2.cubeList.add(new ModelBox(Neckend_r2, 20, 56, 0.0232F, -0.6272F, -0.0189F, 0, 1, 4, 0.0F, false));

        this.Neckbase = new ModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, 0.6628F, -6.8452F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.296F, 0.0F, 0.0F);


        this.Neckbase_r1 = new ModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(0.0F, -0.0924F, -3.1767F);
        this.Neckbase.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, -0.1745F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 10, 46, -0.5F, -1.0987F, -0.5632F, 1, 1, 4, 0.0F, false));
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 10, 46, -0.5F, -0.6987F, -0.5632F, 1, 1, 4, -0.002F, false));

        this.Neckend_r3 = new ModelRenderer(this);
        this.Neckend_r3.setRotationPoint(-0.49F, 0.3311F, -1.8426F);
        this.Neckbase.addChild(Neckend_r3);
        this.setRotateAngle(Neckend_r3, -0.2847F, -0.4663F, 0.101F);
        this.Neckend_r3.cubeList.add(new ModelBox(Neckend_r3, 57, 9, -0.0026F, -0.3372F, 0.0393F, 0, 1, 4, 0.0F, true));

        this.Neckend_r4 = new ModelRenderer(this);
        this.Neckend_r4.setRotationPoint(0.51F, 0.3311F, -1.8426F);
        this.Neckbase.addChild(Neckend_r4);
        this.setRotateAngle(Neckend_r4, -0.2847F, 0.4663F, -0.101F);
        this.Neckend_r4.cubeList.add(new ModelBox(Neckend_r4, 57, 9, 0.0026F, -0.3372F, 0.0393F, 0, 1, 4, 0.0F, false));

        this.Neckmiddle = new ModelRenderer(this);
        this.Neckmiddle.setRotationPoint(0.0F, -0.7848F, -3.5897F);
        this.Neckbase.addChild(Neckmiddle);
        this.setRotateAngle(Neckmiddle, -0.4098F, 0.2431F, 0.1373F);


        this.Neckmiddle_r1 = new ModelRenderer(this);
        this.Neckmiddle_r1.setRotationPoint(0.0F, 0.1828F, -4.2879F);
        this.Neckmiddle.addChild(Neckmiddle_r1);
        this.setRotateAngle(Neckmiddle_r1, 0.1571F, 0.0F, 0.0F);
        this.Neckmiddle_r1.cubeList.add(new ModelBox(Neckmiddle_r1, 0, 25, -0.5F, -0.6829F, -4.4025F, 1, 1, 5, -0.003F, false));

        this.Neckmiddle_r2 = new ModelRenderer(this);
        this.Neckmiddle_r2.setRotationPoint(0.0F, 0.1828F, 0.3121F);
        this.Neckmiddle.addChild(Neckmiddle_r2);
        this.setRotateAngle(Neckmiddle_r2, -0.0175F, 0.0F, 0.0F);
        this.Neckmiddle_r2.cubeList.add(new ModelBox(Neckmiddle_r2, 43, 55, -0.5F, -0.682F, -4.2524F, 1, 1, 4, 0.001F, false));

        this.Neckend_r5 = new ModelRenderer(this);
        this.Neckend_r5.setRotationPoint(-0.49F, 0.5033F, -2.9335F);
        this.Neckmiddle.addChild(Neckend_r5);
        this.setRotateAngle(Neckend_r5, -0.1813F, -0.2562F, 0.0541F);
        this.Neckend_r5.cubeList.add(new ModelBox(Neckend_r5, 26, 51, -0.022F, -0.5561F, -0.0067F, 0, 1, 5, 0.0F, true));

        this.Neckend_r6 = new ModelRenderer(this);
        this.Neckend_r6.setRotationPoint(-0.49F, 0.7147F, -0.2511F);
        this.Neckmiddle.addChild(Neckend_r6);
        this.setRotateAngle(Neckend_r6, -0.0518F, -0.3434F, 0.0588F);
        this.Neckend_r6.cubeList.add(new ModelBox(Neckend_r6, 57, 49, -0.0024F, -0.4886F, 0.0645F, 0, 1, 4, 0.0F, true));

        this.Neckend_r7 = new ModelRenderer(this);
        this.Neckend_r7.setRotationPoint(-0.49F, 0.5299F, -5.4334F);
        this.Neckmiddle.addChild(Neckend_r7);
        this.setRotateAngle(Neckend_r7, -0.1795F, -0.2133F, 0.0461F);
        this.Neckend_r7.cubeList.add(new ModelBox(Neckend_r7, 51, 50, -0.0055F, -0.4886F, 0.0652F, 0, 1, 5, 0.0F, true));

        this.Neckend_r8 = new ModelRenderer(this);
        this.Neckend_r8.setRotationPoint(-0.49F, 0.9533F, -7.629F);
        this.Neckmiddle.addChild(Neckend_r8);
        this.setRotateAngle(Neckend_r8, -0.0914F, -0.1699F, 0.042F);
        this.Neckend_r8.cubeList.add(new ModelBox(Neckend_r8, 32, 53, -0.0384F, -0.6357F, -0.0662F, 0, 1, 5, 0.0F, true));

        this.Neckend_r9 = new ModelRenderer(this);
        this.Neckend_r9.setRotationPoint(0.51F, 0.7147F, -0.2511F);
        this.Neckmiddle.addChild(Neckend_r9);
        this.setRotateAngle(Neckend_r9, -0.0518F, 0.3434F, -0.0588F);
        this.Neckend_r9.cubeList.add(new ModelBox(Neckend_r9, 57, 49, 0.0024F, -0.4886F, 0.0645F, 0, 1, 4, 0.0F, false));

        this.Neckend_r10 = new ModelRenderer(this);
        this.Neckend_r10.setRotationPoint(0.51F, 0.5033F, -2.9335F);
        this.Neckmiddle.addChild(Neckend_r10);
        this.setRotateAngle(Neckend_r10, -0.1813F, 0.2562F, -0.0541F);
        this.Neckend_r10.cubeList.add(new ModelBox(Neckend_r10, 26, 51, 0.022F, -0.5561F, -0.0067F, 0, 1, 5, 0.0F, false));

        this.Neckend_r11 = new ModelRenderer(this);
        this.Neckend_r11.setRotationPoint(0.51F, 0.5299F, -5.4334F);
        this.Neckmiddle.addChild(Neckend_r11);
        this.setRotateAngle(Neckend_r11, -0.1795F, 0.2133F, -0.0461F);
        this.Neckend_r11.cubeList.add(new ModelBox(Neckend_r11, 51, 50, 0.0055F, -0.4886F, 0.0652F, 0, 1, 5, 0.0F, false));

        this.Neckend_r12 = new ModelRenderer(this);
        this.Neckend_r12.setRotationPoint(0.51F, 0.9533F, -7.629F);
        this.Neckmiddle.addChild(Neckend_r12);
        this.setRotateAngle(Neckend_r12, -0.0914F, 0.1699F, -0.042F);
        this.Neckend_r12.cubeList.add(new ModelBox(Neckend_r12, 32, 53, 0.0384F, -0.6357F, -0.0662F, 0, 1, 5, 0.0F, false));

        this.Neckend = new ModelRenderer(this);
        this.Neckend.setRotationPoint(0.01F, 0.6623F, -8.5523F);
        this.Neckmiddle.addChild(Neckend);
        this.setRotateAngle(Neckend, 0.3424F, 0.425F, 0.2302F);


        this.Neckend_r13 = new ModelRenderer(this);
        this.Neckend_r13.setRotationPoint(-0.5F, 0.6039F, -0.669F);
        this.Neckend.addChild(Neckend_r13);
        this.setRotateAngle(Neckend_r13, -0.3857F, -0.1729F, 0.0293F);
        this.Neckend_r13.cubeList.add(new ModelBox(Neckend_r13, 9, 0, -0.0424F, -0.6018F, -0.0782F, 0, 1, 3, 0.0F, true));

        this.Neckend_r14 = new ModelRenderer(this);
        this.Neckend_r14.setRotationPoint(-0.5F, 1.0742F, -2.6155F);
        this.Neckend.addChild(Neckend_r14);
        this.setRotateAngle(Neckend_r14, -0.1292F, -0.1681F, 0.0518F);
        this.Neckend_r14.cubeList.add(new ModelBox(Neckend_r14, 8, 18, 0.0F, -0.4665F, -0.1724F, 0, 1, 3, 0.0F, true));

        this.Neckend_r15 = new ModelRenderer(this);
        this.Neckend_r15.setRotationPoint(0.5F, 0.6039F, -0.669F);
        this.Neckend.addChild(Neckend_r15);
        this.setRotateAngle(Neckend_r15, -0.3857F, 0.1729F, -0.0293F);
        this.Neckend_r15.cubeList.add(new ModelBox(Neckend_r15, 9, 0, 0.0424F, -0.6018F, -0.0782F, 0, 1, 3, 0.0F, false));

        this.Neckend_r16 = new ModelRenderer(this);
        this.Neckend_r16.setRotationPoint(0.5F, 1.0742F, -2.6155F);
        this.Neckend.addChild(Neckend_r16);
        this.setRotateAngle(Neckend_r16, -0.1292F, 0.1681F, -0.0518F);
        this.Neckend_r16.cubeList.add(new ModelBox(Neckend_r16, 8, 18, 0.0F, -0.4665F, -0.1724F, 0, 1, 3, 0.0F, false));

        this.Neckend_r17 = new ModelRenderer(this);
        this.Neckend_r17.setRotationPoint(0.0F, -0.8388F, -4.8388F);
        this.Neckend.addChild(Neckend_r17);
        this.setRotateAngle(Neckend_r17, 0.2269F, 0.0F, 0.0F);
        this.Neckend_r17.cubeList.add(new ModelBox(Neckend_r17, 18, 18, -0.5F, 1.3996F, -0.2199F, 1, 1, 5, -0.005F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.7955F, -4.1714F);
        this.Neckend.addChild(Head);
        this.setRotateAngle(Head, 0.3609F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 47, 14, -1.5F, 0.0F, -3.0F, 3, 2, 3, 0.005F, false));
        this.Head.cubeList.add(new ModelBox(Head, 62, 9, -0.47F, 0.0F, -3.0F, 2, 1, 1, 0.04F, false));
        this.Head.cubeList.add(new ModelBox(Head, 45, 2, 0.35F, 0.0F, -3.0F, 1, 1, 1, 0.2F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 41, -1.22F, 0.0F, -3.0F, 3, 1, 1, -0.2F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 41, -1.78F, 0.0F, -3.0F, 3, 1, 1, -0.2F, true));
        this.Head.cubeList.add(new ModelBox(Head, 62, 9, -1.53F, 0.0F, -3.0F, 2, 1, 1, 0.04F, true));
        this.Head.cubeList.add(new ModelBox(Head, 45, 2, -1.35F, 0.0F, -3.0F, 1, 1, 1, 0.2F, true));
        this.Head.cubeList.add(new ModelBox(Head, 61, 0, -1.5F, 0.0F, -4.0F, 3, 2, 1, 0.005F, false));
        this.Head.cubeList.add(new ModelBox(Head, 54, 57, -1.5F, -0.9F, -2.0F, 3, 1, 2, 0.0F, false));

        this.Head_r1 = new ModelRenderer(this);
        this.Head_r1.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Head.addChild(Head_r1);
        this.setRotateAngle(Head_r1, 0.2793F, 0.0F, 0.0F);
        this.Head_r1.cubeList.add(new ModelBox(Head_r1, 34, 26, -1.5F, 0.0F, 0.1F, 3, 1, 2, -0.002F, false));

        this.Lowerjawbase = new ModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 2.0F, 0.7F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 0.2269F, 0.0F, 0.0F);
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 56, 16, 0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 32, 51, 0.5F, 0.0F, -4.7F, 1, 1, 1, -0.003F, false));
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 56, 16, -1.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, true));
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 32, 51, -1.5F, 0.0F, -4.7F, 1, 1, 1, -0.003F, true));

        this.Lowerjawbase_r1 = new ModelRenderer(this);
        this.Lowerjawbase_r1.setRotationPoint(0.5F, 0.5F, 0.0F);
        this.Lowerjawbase.addChild(Lowerjawbase_r1);
        this.setRotateAngle(Lowerjawbase_r1, -0.1047F, 0.0F, 0.0F);
        this.Lowerjawbase_r1.cubeList.add(new ModelBox(Lowerjawbase_r1, 38, 53, -2.0F, -0.5F, -3.0F, 1, 1, 3, -0.003F, true));
        this.Lowerjawbase_r1.cubeList.add(new ModelBox(Lowerjawbase_r1, 38, 53, 0.0F, -0.5F, -3.0F, 1, 1, 3, -0.003F, false));

        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.01F, 1.0F, -2.9F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, -0.0637F, 0.0F, 0.0F);


        this.Lowerjawmiddle_r1 = new ModelRenderer(this);
        this.Lowerjawmiddle_r1.setRotationPoint(0.0F, -1.3F, -0.1F);
        this.Lowerjawmiddle.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, 0.1571F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 37, 47, -1.0F, 0.0272F, -3.9114F, 2, 1, 4, -0.003F, false));

        this.Lowerjawmiddle_r2 = new ModelRenderer(this);
        this.Lowerjawmiddle_r2.setRotationPoint(0.0F, -0.5316F, -0.3253F);
        this.Lowerjawmiddle.addChild(Lowerjawmiddle_r2);
        this.setRotateAngle(Lowerjawmiddle_r2, 0.1047F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r2.cubeList.add(new ModelBox(Lowerjawmiddle_r2, 49, 35, -1.0F, -0.4684F, -3.6747F, 2, 1, 4, 0.0F, false));

        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.0424F, 0.0F, 0.0F);


        this.Lowerjawfront_r1 = new ModelRenderer(this);
        this.Lowerjawfront_r1.setRotationPoint(0.0F, 0.4684F, 4.6747F);
        this.Lowerjawfront.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, 0.1047F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 0, 62, -0.5F, -0.4788F, -5.4246F, 1, 1, 2, 0.0F, false));

        this.Leftlowerteeth = new ModelRenderer(this);
        this.Leftlowerteeth.setRotationPoint(-0.9F, -0.2F, -1.9F);
        this.Lowerjawmiddle.addChild(Leftlowerteeth);
        this.setRotateAngle(Leftlowerteeth, -0.0424F, -0.1344F, 0.0F);


        this.Rightlowerteeth = new ModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(0.9F, -0.2F, -1.9F);
        this.Lowerjawmiddle.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, -0.0424F, 0.1344F, 0.0F);


        this.Rightlowerteeth_r1 = new ModelRenderer(this);
        this.Rightlowerteeth_r1.setRotationPoint(-0.1314F, -0.3453F, -1.5208F);
        this.Rightlowerteeth.addChild(Rightlowerteeth_r1);
        this.setRotateAngle(Rightlowerteeth_r1, 0.1571F, 0.0F, 0.0F);
        this.Rightlowerteeth_r1.cubeList.add(new ModelBox(Rightlowerteeth_r1, 53, 42, -0.036F, -0.4572F, -2.2254F, 0, 1, 5, 0.0F, false));

        this.Rightlowerteeth2 = new ModelRenderer(this);
        this.Rightlowerteeth2.setRotationPoint(-0.92F, -0.2F, -1.9F);
        this.Lowerjawmiddle.addChild(Rightlowerteeth2);
        this.setRotateAngle(Rightlowerteeth2, -0.0424F, -0.1344F, 0.0F);


        this.Rightlowerteeth_r2 = new ModelRenderer(this);
        this.Rightlowerteeth_r2.setRotationPoint(0.1314F, -0.3453F, -1.5208F);
        this.Rightlowerteeth2.addChild(Rightlowerteeth_r2);
        this.setRotateAngle(Rightlowerteeth_r2, 0.1571F, 0.0F, 0.0F);
        this.Rightlowerteeth_r2.cubeList.add(new ModelBox(Rightlowerteeth_r2, 53, 42, 0.036F, -0.4572F, -2.2254F, 0, 1, 5, 0.0F, true));

        this.Jawparting = new ModelRenderer(this);
        this.Jawparting.setRotationPoint(-0.01F, 0.2F, -3.5F);
        this.Lowerjawbase.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.2335F, 0.0F, 0.0F);


        this.Upperjawbase = new ModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, 1.1F, -3.83F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.0637F, 0.0F, 0.0F);
        this.Upperjawbase.cubeList.add(new ModelBox(Upperjawbase, 18, 25, -1.0F, 0.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.Upperjawbase_r1 = new ModelRenderer(this);
        this.Upperjawbase_r1.setRotationPoint(0.0F, -0.2F, -0.4F);
        this.Upperjawbase.addChild(Upperjawbase_r1);
        this.setRotateAngle(Upperjawbase_r1, 0.2618F, 0.0F, 0.0F);
        this.Upperjawbase_r1.cubeList.add(new ModelBox(Upperjawbase_r1, 47, 20, -1.0F, -0.4F, -1.3F, 2, 1, 2, -0.002F, false));

        this.Upperjawbase_r2 = new ModelRenderer(this);
        this.Upperjawbase_r2.setRotationPoint(0.0F, 0.5F, -3.2F);
        this.Upperjawbase.addChild(Upperjawbase_r2);
        this.setRotateAngle(Upperjawbase_r2, -0.3316F, 0.0F, 0.0F);
        this.Upperjawbase_r2.cubeList.add(new ModelBox(Upperjawbase_r2, 21, 28, -1.0F, -0.6F, -0.6F, 2, 1, 1, -0.002F, false));

        this.Upperjawend = new ModelRenderer(this);
        this.Upperjawend.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Upperjawbase.addChild(Upperjawend);
        this.setRotateAngle(Upperjawend, -0.1274F, 0.0F, 0.0F);


        this.Upperjawend_r1 = new ModelRenderer(this);
        this.Upperjawend_r1.setRotationPoint(0.0F, -0.8F, 2.0F);
        this.Upperjawend.addChild(Upperjawend_r1);
        this.setRotateAngle(Upperjawend_r1, 0.48F, 0.0F, 0.0F);
        this.Upperjawend_r1.cubeList.add(new ModelBox(Upperjawend_r1, 27, 35, -0.8F, -0.5F, -1.4F, 0, 1, 2, 0.0F, true));
        this.Upperjawend_r1.cubeList.add(new ModelBox(Upperjawend_r1, 27, 35, 0.8F, -0.5F, -1.4F, 0, 1, 2, 0.0F, false));
        this.Upperjawend_r1.cubeList.add(new ModelBox(Upperjawend_r1, 49, 41, -1.0F, -0.9F, -1.4F, 2, 1, 2, -0.005F, false));

        this.Snout = new ModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, -2.7F, -0.2F);
        this.Upperjawend.addChild(Snout);
        this.setRotateAngle(Snout, 0.3183F, 0.0F, 0.0F);


        this.Leftupperfrontteeth = new ModelRenderer(this);
        this.Leftupperfrontteeth.setRotationPoint(-1.0F, -0.5F, 0.5F);
        this.Upperjawend.addChild(Leftupperfrontteeth);
        this.setRotateAngle(Leftupperfrontteeth, -0.0424F, -0.2335F, 0.1485F);


        this.Rightupperfrontteeth = new ModelRenderer(this);
        this.Rightupperfrontteeth.setRotationPoint(1.0F, -0.5F, 0.5F);
        this.Upperjawend.addChild(Rightupperfrontteeth);
        this.setRotateAngle(Rightupperfrontteeth, -0.0424F, 0.2335F, -0.1485F);


        this.Headslope = new ModelRenderer(this);
        this.Headslope.setRotationPoint(0.0F, -1.85F, 0.0F);
        this.Upperjawbase.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.0175F, 0.0F, 0.0F);


        this.Headslope_r1 = new ModelRenderer(this);
        this.Headslope_r1.setRotationPoint(0.0F, 0.0F, 0.9F);
        this.Headslope.addChild(Headslope_r1);
        this.setRotateAngle(Headslope_r1, 0.2443F, 0.0F, 0.0F);
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 0, 9, -1.0F, 0.3F, -3.9F, 2, 1, 5, -0.003F, false));

        this.Leftupperbackteeth = new ModelRenderer(this);
        this.Leftupperbackteeth.setRotationPoint(-1.25F, 0.55F, -4.1F);
        this.Upperjawbase.addChild(Leftupperbackteeth);
        this.setRotateAngle(Leftupperbackteeth, 0.0873F, 0.0F, 0.0F);


        this.Rightupperbackteeth = new ModelRenderer(this);
        this.Rightupperbackteeth.setRotationPoint(1.25F, 0.55F, -4.1F);
        this.Upperjawbase.addChild(Rightupperbackteeth);
        this.setRotateAngle(Rightupperbackteeth, 0.0873F, 0.0F, 0.0F);
        this.Rightupperbackteeth.cubeList.add(new ModelBox(Rightupperbackteeth, 58, 31, -0.5F, 0.0F, 1.2F, 0, 1, 4, 0.0F, false));
        this.Rightupperbackteeth.cubeList.add(new ModelBox(Rightupperbackteeth, 58, 31, -2.0F, 0.0F, 1.2F, 0, 1, 4, 0.0F, true));

        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(2.75F, 5.0628F, -4.8452F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.4002F, 0.0F, 0.0F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 16, 61, 0.5F, -0.3353F, -0.4912F, 1, 5, 1, 0.0F, false));

        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.49F, 4.3647F, 0.9088F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.8873F, 0.2398F, 0.1911F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 0, 25, 0.0F, 0.5F, -1.5F, 1, 3, 1, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 0, 18, 0.0F, 0.5F, -0.5F, 1, 3, 1, -0.2F, false));

        this.Righthand = new ModelRenderer(this);
        this.Righthand.setRotationPoint(1.1F, 3.2F, -0.5F);
        this.Rightlowerarm.addChild(Righthand);
        this.setRotateAngle(Righthand, 0.1485F, 0.0F, 0.4458F);
        this.Righthand.cubeList.add(new ModelBox(Righthand, 32, 0, -1.0F, 0.0F, -1.5F, 1, 4, 3, 0.0F, false));

        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-2.73F, 5.0628F, -4.8452F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.824F, -0.2424F, -0.2537F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 36, 60, -1.5F, -0.3353F, -0.4912F, 1, 5, 1, 0.0F, false));

        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-0.49F, 4.3647F, 0.9088F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -1.0849F, 0.0F, 0.0F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 10, 9, -1.0F, 0.5F, -1.5F, 1, 3, 1, 0.0F, false));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 0, 9, -1.0F, 0.5F, -0.5F, 1, 3, 1, -0.2F, false));

        this.Lefthand = new ModelRenderer(this);
        this.Lefthand.setRotationPoint(-1.1F, 3.2F, -0.5F);
        this.Leftlowerarm.addChild(Lefthand);
        this.setRotateAngle(Lefthand, 0.1485F, 0.0F, -0.4458F);
        this.Lefthand.cubeList.add(new ModelBox(Lefthand, 19, 0, 0.0F, 0.0F, -1.5F, 1, 4, 3, 0.0F, false));

        this.Shoulderquills = new ModelRenderer(this);
        this.Shoulderquills.setRotationPoint(0.0F, -1.0372F, -4.4452F);
        this.Bodyfront.addChild(Shoulderquills);
        this.setRotateAngle(Shoulderquills, 0.1698F, 0.0F, 0.0F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.1298F, 4.3353F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.0455F, 0.1744F, -0.0079F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 34, 14, -0.5F, -0.6257F, 0.6545F, 1, 1, 10, 0.0F, false));
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 34, 14, -0.5F, -0.1257F, 0.6545F, 1, 1, 10, -0.002F, false));

        this.Tailbase_r1 = new ModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, 0.8743F, 0.1545F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, 0.829F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 40, 18, 0.0F, 6.766F, 6.6008F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 24, 45, 0.0F, 5.7288F, 5.1161F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 10, 46, 0.0F, 4.4093F, 3.6131F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 17, 46, 0.0F, 3.0899F, 2.1101F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 46, 47, 0.0F, 1.5449F, 0.8051F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 49, 35, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Bodyfront_r39 = new ModelRenderer(this);
        this.Bodyfront_r39.setRotationPoint(0.0F, -1.1536F, -4.0484F);
        this.Tailbase.addChild(Bodyfront_r39);
        this.setRotateAngle(Bodyfront_r39, 0.0087F, 0.0F, 0.0F);
        this.Bodyfront_r39.cubeList.add(new ModelBox(Bodyfront_r39, 53, 50, 0.0F, 0.3F, 13.5F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r39.cubeList.add(new ModelBox(Bodyfront_r39, 0, 56, 0.0F, 0.3F, 11.5F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r39.cubeList.add(new ModelBox(Bodyfront_r39, 57, 10, 0.0F, 0.2F, 9.5F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r39.cubeList.add(new ModelBox(Bodyfront_r39, 57, 49, 0.0F, 0.2F, 7.5F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r39.cubeList.add(new ModelBox(Bodyfront_r39, 7, 62, 0.0F, 0.1F, 5.5F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r39.cubeList.add(new ModelBox(Bodyfront_r39, 13, 0, 0.0F, 0.1F, 3.5F, 0, 1, 1, 0.0F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.1257F, 9.6545F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.0878F, 0.0869F, 0.0076F);


        this.Tailmiddlebase_r1 = new ModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.0F, 0.1038F, 0.9873F);
        this.Tailmiddlebase.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, 0.0524F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 18, 18, -0.5F, -0.5F, -0.9F, 1, 1, 13, 0.002F, false));

        this.Bodyfront_r40 = new ModelRenderer(this);
        this.Bodyfront_r40.setRotationPoint(0.0F, -1.0241F, -13.6156F);
        this.Tailmiddlebase.addChild(Bodyfront_r40);
        this.setRotateAngle(Bodyfront_r40, 0.0087F, 0.0F, 0.0F);
        this.Bodyfront_r40.cubeList.add(new ModelBox(Bodyfront_r40, 6, 35, 0.0F, 0.3F, 19.5F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r40.cubeList.add(new ModelBox(Bodyfront_r40, 0, 35, 0.0F, 0.3F, 23.5F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r40.cubeList.add(new ModelBox(Bodyfront_r40, 47, 14, 0.0F, 0.3F, 21.5F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r40.cubeList.add(new ModelBox(Bodyfront_r40, 51, 48, 0.0F, 0.3F, 17.5F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r40.cubeList.add(new ModelBox(Bodyfront_r40, 38, 53, 0.0F, 0.3F, 15.5F, 0, 1, 1, 0.0F, false));

        this.Tailbase_r2 = new ModelRenderer(this);
        this.Tailbase_r2.setRotationPoint(0.0F, 1.0038F, -9.4127F);
        this.Tailmiddlebase.addChild(Tailbase_r2);
        this.setRotateAngle(Tailbase_r2, 0.829F, 0.0F, 0.0F);
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 19, 0, 0.0F, 15.4752F, 15.4571F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 25, 0, 0.0F, 14.0986F, 14.0028F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 32, 0, 0.0F, 12.7911F, 12.4762F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 18, 25, 0.0F, 10.4837F, 10.9496F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 27, 25, 0.0F, 9.1762F, 9.423F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 40, 14, 0.0F, 7.8687F, 7.8964F, 0, 2, 1, 0.0F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.3962F, 12.4873F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, -0.0968F, -0.1303F, 0.0126F);


        this.Tailmiddleend_r1 = new ModelRenderer(this);
        this.Tailmiddleend_r1.setRotationPoint(0.0F, 0.0046F, 0.4042F);
        this.Tailmiddleend.addChild(Tailmiddleend_r1);
        this.setRotateAngle(Tailmiddleend_r1, 0.0524F, 0.0F, 0.0F);
        this.Tailmiddleend_r1.cubeList.add(new ModelBox(Tailmiddleend_r1, 0, 18, -0.5F, -0.6F, -0.5F, 1, 1, 15, 0.0F, false));

        this.Tailbase_r3 = new ModelRenderer(this);
        this.Tailbase_r3.setRotationPoint(0.0F, 1.4046F, -21.9958F);
        this.Tailmiddleend.addChild(Tailbase_r3);
        this.setRotateAngle(Tailbase_r3, 0.829F, 0.0F, 0.0F);
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 9, 0, 0.0F, 19.3069F, 20.0635F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 8, 18, 0.0F, 18.0004F, 18.5493F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 12, 18, 0.0F, 16.6938F, 17.0351F, 0, 1, 1, 0.0F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -0.8954F, 14.4042F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.1801F, -0.2147F, 0.0388F);


        this.Tailend_r1 = new ModelRenderer(this);
        this.Tailend_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tailend.addChild(Tailend_r1);
        this.setRotateAngle(Tailend_r1, 0.0349F, 0.0F, 0.0F);
        this.Tailend_r1.cubeList.add(new ModelBox(Tailend_r1, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 16, -0.002F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.0F, 1.1702F, -0.9647F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.8645F, 0.0F, 0.0F);


        this.Rightthigh_r1 = new ModelRenderer(this);
        this.Rightthigh_r1.setRotationPoint(0.5F, 0.054F, 0.0771F);
        this.Rightthigh.addChild(Rightthigh_r1);
        this.setRotateAngle(Rightthigh_r1, -0.096F, 0.0F, 0.0F);
        this.Rightthigh_r1.cubeList.add(new ModelBox(Rightthigh_r1, 51, 61, -1.0F, -0.5F, -0.5F, 2, 3, 1, 0.0F, false));

        this.Rightthigh_r2 = new ModelRenderer(this);
        this.Rightthigh_r2.setRotationPoint(0.5F, 3.554F, -0.4229F);
        this.Rightthigh.addChild(Rightthigh_r2);
        this.setRotateAngle(Rightthigh_r2, 0.3927F, 0.0F, 0.0F);
        this.Rightthigh_r2.cubeList.add(new ModelBox(Rightthigh_r2, 12, 35, -0.5F, 1.6F, -0.8F, 1, 2, 1, 0.0F, false));

        this.Rightthigh_r3 = new ModelRenderer(this);
        this.Rightthigh_r3.setRotationPoint(0.5F, 2.254F, -0.4229F);
        this.Rightthigh.addChild(Rightthigh_r3);
        this.setRotateAngle(Rightthigh_r3, 0.0611F, 0.0F, 0.0F);
        this.Rightthigh_r3.cubeList.add(new ModelBox(Rightthigh_r3, 18, 18, -0.5F, 0.0692F, -0.2814F, 1, 3, 1, 0.0F, false));

        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.5F, 7.554F, 0.8771F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 1.8975F, 0.0F, 0.0F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 11, 60, -1.0F, -0.5712F, -0.217F, 1, 8, 1, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 57, 22, 0.2F, -0.5712F, -0.217F, 1, 8, 1, -0.2F, false));

        this.Rightankle = new ModelRenderer(this);
        this.Rightankle.setRotationPoint(-0.01F, 7.1288F, 0.483F);
        this.Rightshin.addChild(Rightankle);
        this.setRotateAngle(Rightankle, -1.6828F, 0.0F, 0.0F);
        this.Rightankle.cubeList.add(new ModelBox(Rightankle, 29, 60, -1.0F, 0.0F, -0.5F, 2, 6, 1, 0.0F, false));

        this.Rightfoot = new ModelRenderer(this);
        this.Rightfoot.setRotationPoint(0.0F, 4.3F, -0.6F);
        this.Rightankle.addChild(Rightfoot);
        this.setRotateAngle(Rightfoot, 1.5425F, 0.0F, 0.0F);
        this.Rightfoot.cubeList.add(new ModelBox(Rightfoot, 41, 27, -1.9F, 1.0F, -5.0F, 4, 1, 6, 0.0F, false));

        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.0F, 1.1702F, -0.9647F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.3845F, 0.0F, 0.0F);


        this.Rightthigh_r4 = new ModelRenderer(this);
        this.Rightthigh_r4.setRotationPoint(-0.5F, 0.054F, 0.0771F);
        this.Leftthigh.addChild(Rightthigh_r4);
        this.setRotateAngle(Rightthigh_r4, -0.096F, 0.0F, 0.0F);
        this.Rightthigh_r4.cubeList.add(new ModelBox(Rightthigh_r4, 8, 25, -1.0F, -0.5F, -0.5F, 2, 3, 1, 0.0F, false));

        this.Rightthigh_r5 = new ModelRenderer(this);
        this.Rightthigh_r5.setRotationPoint(-0.5F, 3.554F, -0.4229F);
        this.Leftthigh.addChild(Rightthigh_r5);
        this.setRotateAngle(Rightthigh_r5, 0.3927F, 0.0F, 0.0F);
        this.Rightthigh_r5.cubeList.add(new ModelBox(Rightthigh_r5, 26, 18, -0.5F, 1.6F, -0.8F, 1, 2, 1, 0.0F, false));

        this.Rightthigh_r6 = new ModelRenderer(this);
        this.Rightthigh_r6.setRotationPoint(-0.5F, 2.254F, -0.4229F);
        this.Leftthigh.addChild(Rightthigh_r6);
        this.setRotateAngle(Rightthigh_r6, 0.0611F, 0.0F, 0.0F);
        this.Rightthigh_r6.cubeList.add(new ModelBox(Rightthigh_r6, 0, 0, -0.5F, 0.0692F, -0.2814F, 1, 3, 1, 0.0F, false));

        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.5F, 7.554F, 0.8771F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 1.1994F, 0.0F, 0.0F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 36, 33, 0.0F, -0.5712F, -0.217F, 1, 8, 1, 0.0F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 35, 14, -1.2F, -0.5712F, -0.217F, 1, 8, 1, -0.2F, false));

        this.Leftankle = new ModelRenderer(this);
        this.Leftankle.setRotationPoint(0.01F, 7.1288F, 0.483F);
        this.Leftshin.addChild(Leftankle);
        this.setRotateAngle(Leftankle, -1.072F, 0.0F, 0.0F);
        this.Leftankle.cubeList.add(new ModelBox(Leftankle, 0, 46, -1.0F, 0.0F, -0.5F, 2, 6, 1, 0.0F, false));

        this.Leftfoot = new ModelRenderer(this);
        this.Leftfoot.setRotationPoint(0.0F, 4.3F, -0.6F);
        this.Leftankle.addChild(Leftfoot);
        this.setRotateAngle(Leftfoot, 0.3208F, 0.0F, 0.0F);
        this.Leftfoot.cubeList.add(new ModelBox(Leftfoot, 12, 35, -2.1F, 1.0F, -5.0F, 4, 1, 6, 0.0F, false));

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
