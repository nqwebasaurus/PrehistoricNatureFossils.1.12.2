package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonParmastega extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Parmastega;
    private final ModelRenderer bodyfront_r1;
    private final ModelRenderer bodyfront_r2;
    private final ModelRenderer bodyfront_r3;
    private final ModelRenderer bodyfront_r4;
    private final ModelRenderer neck_r1;
    private final ModelRenderer bodyfront_r5;
    private final ModelRenderer neck_r2;
    private final ModelRenderer neck_r3;
    private final ModelRenderer neck_r4;
    private final ModelRenderer neck_r5;
    private final ModelRenderer neck_r6;
    private final ModelRenderer neck_r7;
    private final ModelRenderer neck_r8;
    private final ModelRenderer neck_r9;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjaw;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Snout;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer Jawwhole;
    private final ModelRenderer Jaw;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer Jaw2;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer LArm;
    private final ModelRenderer LArm2;
    private final ModelRenderer LArm3;
    private final ModelRenderer LArm4;
    private final ModelRenderer Body;
    private final ModelRenderer neck_r10;
    private final ModelRenderer neck_r11;
    private final ModelRenderer neck_r12;
    private final ModelRenderer neck_r13;
    private final ModelRenderer neck_r14;
    private final ModelRenderer neck_r15;
    private final ModelRenderer neck_r16;
    private final ModelRenderer neck_r17;
    private final ModelRenderer neck_r18;
    private final ModelRenderer neck_r19;
    private final ModelRenderer neck_r20;
    private final ModelRenderer neck_r21;
    private final ModelRenderer neck_r22;
    private final ModelRenderer neck_r23;
    private final ModelRenderer neck_r24;
    private final ModelRenderer neck_r25;
    private final ModelRenderer neck_r26;
    private final ModelRenderer neck_r27;
    private final ModelRenderer cube_r25;
    private final ModelRenderer neck_r28;
    private final ModelRenderer neck_r29;
    private final ModelRenderer neck_r30;
    private final ModelRenderer neck_r31;
    private final ModelRenderer neck_r32;
    private final ModelRenderer neck_r33;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r26;
    private final ModelRenderer tailbase_r1;
    private final ModelRenderer tailbase_r2;
    private final ModelRenderer tailbase_r3;
    private final ModelRenderer tailbase_r4;
    private final ModelRenderer tailbase_r5;
    private final ModelRenderer tailbase_r6;
    private final ModelRenderer neck_r34;
    private final ModelRenderer neck_r35;
    private final ModelRenderer neck_r36;
    private final ModelRenderer neck_r37;
    private final ModelRenderer neck_r38;
    private final ModelRenderer neck_r39;
    private final ModelRenderer LLeg;
    private final ModelRenderer LLeg2;
    private final ModelRenderer LLeg3;
    private final ModelRenderer LLeg4;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;

    public ModelSkeletonParmastega() {
        this.textureWidth = 57;
        this.textureHeight = 57;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Parmastega = new ModelRenderer(this);
        this.Parmastega.setRotationPoint(0.0F, -14.0F, -7.0F);
        this.fossil.addChild(Parmastega);
        this.setRotateAngle(Parmastega, -0.2182F, 0.0F, 0.0F);
        this.Parmastega.cubeList.add(new ModelBox(Parmastega, 0, 0, -0.5F, -1.0F, -2.0F, 1, 1, 4, 0.02F, false));

        this.bodyfront_r1 = new ModelRenderer(this);
        this.bodyfront_r1.setRotationPoint(-3.0F, 1.4272F, -0.7463F);
        this.Parmastega.addChild(bodyfront_r1);
        this.setRotateAngle(bodyfront_r1, 1.3861F, 0.0262F, -0.6322F);
        this.bodyfront_r1.cubeList.add(new ModelBox(bodyfront_r1, 0, 13, -0.5F, -1.1882F, -1.76F, 1, 5, 2, 0.0F, true));

        this.bodyfront_r2 = new ModelRenderer(this);
        this.bodyfront_r2.setRotationPoint(-3.5F, 2.05F, -0.5F);
        this.Parmastega.addChild(bodyfront_r2);
        this.setRotateAngle(bodyfront_r2, 1.0537F, 0.1946F, -0.0112F);
        this.bodyfront_r2.cubeList.add(new ModelBox(bodyfront_r2, 44, 34, 0.1F, -1.5019F, 0.0511F, 1, 2, 3, 0.0F, true));

        this.bodyfront_r3 = new ModelRenderer(this);
        this.bodyfront_r3.setRotationPoint(3.5F, 2.05F, -0.5F);
        this.Parmastega.addChild(bodyfront_r3);
        this.setRotateAngle(bodyfront_r3, 1.0537F, -0.1946F, 0.0112F);
        this.bodyfront_r3.cubeList.add(new ModelBox(bodyfront_r3, 44, 34, -1.1F, -1.5019F, 0.0511F, 1, 2, 3, 0.0F, false));

        this.bodyfront_r4 = new ModelRenderer(this);
        this.bodyfront_r4.setRotationPoint(3.0F, 1.4272F, -0.7463F);
        this.Parmastega.addChild(bodyfront_r4);
        this.setRotateAngle(bodyfront_r4, 1.3861F, -0.0262F, 0.6322F);
        this.bodyfront_r4.cubeList.add(new ModelBox(bodyfront_r4, 0, 13, -0.5F, -1.1882F, -1.76F, 1, 5, 2, 0.0F, false));

        this.neck_r1 = new ModelRenderer(this);
        this.neck_r1.setRotationPoint(0.0F, 3.0F, -3.05F);
        this.Parmastega.addChild(neck_r1);
        this.setRotateAngle(neck_r1, -0.0873F, 0.0F, 0.0F);
        this.neck_r1.cubeList.add(new ModelBox(neck_r1, 38, 9, -2.0F, -0.5F, 1.05F, 4, 1, 3, 0.0F, false));

        this.bodyfront_r5 = new ModelRenderer(this);
        this.bodyfront_r5.setRotationPoint(0.0F, 3.6F, 0.0F);
        this.Parmastega.addChild(bodyfront_r5);
        this.setRotateAngle(bodyfront_r5, -0.0175F, 0.0F, 0.0F);
        this.bodyfront_r5.cubeList.add(new ModelBox(bodyfront_r5, 26, 36, -1.5F, 0.05F, 0.0F, 3, 0, 4, 0.0F, false));

        this.neck_r2 = new ModelRenderer(this);
        this.neck_r2.setRotationPoint(-0.55F, -0.6353F, 0.4148F);
        this.Parmastega.addChild(neck_r2);
        this.setRotateAngle(neck_r2, -1.1786F, -0.1964F, 0.4408F);
        this.neck_r2.cubeList.add(new ModelBox(neck_r2, 40, 49, -0.4253F, -0.4903F, 0.7308F, 0, 1, 2, 0.0F, true));

        this.neck_r3 = new ModelRenderer(this);
        this.neck_r3.setRotationPoint(-0.55F, -0.6353F, 0.4148F);
        this.Parmastega.addChild(neck_r3);
        this.setRotateAngle(neck_r3, -1.3417F, -0.3747F, 1.0036F);
        this.neck_r3.cubeList.add(new ModelBox(neck_r3, 45, 22, 0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, true));

        this.neck_r4 = new ModelRenderer(this);
        this.neck_r4.setRotationPoint(-0.55F, -0.6353F, -1.5852F);
        this.Parmastega.addChild(neck_r4);
        this.setRotateAngle(neck_r4, -1.3417F, -0.3747F, 1.0036F);
        this.neck_r4.cubeList.add(new ModelBox(neck_r4, 50, 9, 0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, true));

        this.neck_r5 = new ModelRenderer(this);
        this.neck_r5.setRotationPoint(-0.55F, -0.6353F, -1.5852F);
        this.Parmastega.addChild(neck_r5);
        this.setRotateAngle(neck_r5, -1.1786F, -0.1964F, 0.4408F);
        this.neck_r5.cubeList.add(new ModelBox(neck_r5, 0, 50, -0.4253F, -0.4903F, 0.7308F, 0, 1, 2, 0.0F, true));

        this.neck_r6 = new ModelRenderer(this);
        this.neck_r6.setRotationPoint(0.55F, -0.6353F, 0.4148F);
        this.Parmastega.addChild(neck_r6);
        this.setRotateAngle(neck_r6, -1.3417F, 0.3747F, -1.0036F);
        this.neck_r6.cubeList.add(new ModelBox(neck_r6, 45, 22, -0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, false));

        this.neck_r7 = new ModelRenderer(this);
        this.neck_r7.setRotationPoint(0.55F, -0.6353F, 0.4148F);
        this.Parmastega.addChild(neck_r7);
        this.setRotateAngle(neck_r7, -1.1786F, 0.1964F, -0.4408F);
        this.neck_r7.cubeList.add(new ModelBox(neck_r7, 40, 49, 0.4253F, -0.4903F, 0.7308F, 0, 1, 2, 0.0F, false));

        this.neck_r8 = new ModelRenderer(this);
        this.neck_r8.setRotationPoint(0.55F, -0.6353F, -1.5852F);
        this.Parmastega.addChild(neck_r8);
        this.setRotateAngle(neck_r8, -1.3417F, 0.3747F, -1.0036F);
        this.neck_r8.cubeList.add(new ModelBox(neck_r8, 50, 9, -0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, false));

        this.neck_r9 = new ModelRenderer(this);
        this.neck_r9.setRotationPoint(0.55F, -0.6353F, -1.5852F);
        this.Parmastega.addChild(neck_r9);
        this.setRotateAngle(neck_r9, -1.1786F, 0.1964F, -0.4408F);
        this.neck_r9.cubeList.add(new ModelBox(neck_r9, 0, 50, 0.4253F, -0.4903F, 0.7308F, 0, 1, 2, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -1.5F);
        this.Parmastega.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 22, 0.0F, -0.9F, 1.5F, 0, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 28, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Parmastega.addChild(Neck);
        this.setRotateAngle(Neck, -0.0436F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 35, 43, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.01F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Neck.addChild(Head);


        this.Upperjaw = new ModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, 0.0F, 0.7F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, 0.2214F, -0.1704F, -0.0381F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.3F, -6.7F);
        this.Upperjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3752F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 41, -1.0F, -0.0227F, 0.0223F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.7F, -5.7F);
        this.Upperjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5323F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 46, -1.0F, -0.0171F, -0.0548F, 2, 1, 2, 0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Upperjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1484F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 11, -1.0F, -0.2F, -1.2F, 2, 1, 2, -0.2F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.4F, -2.0F);
        this.Upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 39, -1.0F, -0.5F, -2.1F, 2, 2, 4, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.51F, -1.3F, -3.01F);
        this.Upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.2618F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 0, -0.4F, -1.5F, -1.0F, 1, 3, 2, 0.0F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(1.51F, -1.3F, -3.01F);
        this.Upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2182F, 0.0F, -0.2618F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 0, -0.6F, -1.5F, -1.0F, 1, 3, 2, 0.0F, false));

        this.Snout = new ModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Upperjaw.addChild(Snout);
        this.setRotateAngle(Snout, -0.0436F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5617F, 0.6094F, -8.0083F);
        this.Snout.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0151F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 28, -3.0617F, -0.4306F, -1.8608F, 3, 1, 2, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.3617F, 0.6094F, -0.3083F);
        this.Snout.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0358F, -0.2268F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 0, 0.0097F, -0.6994F, -8.0462F, 1, 1, 9, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(3.3617F, 0.6094F, -0.3083F);
        this.Snout.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0358F, 0.2268F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 0, -1.0097F, -0.6994F, -8.0462F, 1, 1, 9, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5617F, 0.6094F, -0.3083F);
        this.Snout.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0365F, -0.2965F, -0.0107F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 18, -1.647F, -0.3094F, -9.1721F, 0, 1, 8, 0.0F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5048F, 1.0157F, -6.4811F);
        this.Snout.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0357F, -0.2093F, -0.0074F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 31, -0.3913F, -0.3F, -1.9168F, 0, 1, 6, 0.0F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5048F, 1.0157F, -6.4811F);
        this.Snout.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0357F, 0.2093F, 0.0074F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 31, 0.3913F, -0.3F, -1.9168F, 0, 1, 6, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(1.5617F, 0.6094F, -0.3083F);
        this.Snout.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0365F, 0.2965F, 0.0107F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 18, 1.647F, -0.3094F, -9.1721F, 0, 1, 8, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.1F, -0.3F);
        this.Snout.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1571F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 33, 17, -2.5F, -0.9F, -2.7F, 5, 1, 3, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 35, 28, -1.5F, -0.9F, -6.7F, 3, 1, 4, -0.004F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 6, -1.0F, -0.9F, -7.7F, 2, 1, 3, -0.003F, false));

        this.Jawwhole = new ModelRenderer(this);
        this.Jawwhole.setRotationPoint(0.0F, 0.8F, 0.3F);
        this.Upperjaw.addChild(Jawwhole);
        this.setRotateAngle(Jawwhole, 0.3491F, 0.0F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.8F, 0.1F, 0.4F);
        this.Jawwhole.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.1635F, 0.2259F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 21, 41, 1.7F, -0.02F, -3.95F, 1, 1, 4, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 26, 49, 1.7F, 0.58F, -3.95F, 1, 1, 2, -0.015F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(2.661F, -0.2131F, -8.6651F);
        this.Jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3094F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 5, 50, 0.0F, -0.7F, -1.1F, 0, 1, 2, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(2.7F, 0.2F, -4.15F);
        this.Jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0912F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 14, 0, -0.039F, -0.5F, -3.534F, 0, 1, 4, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 39, 43, -0.989F, -0.22F, -3.534F, 1, 1, 4, -0.01F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(1.4752F, -0.4312F, -9.9198F);
        this.Jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1071F, -0.2212F, 0.0445F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 9, 48, -1.5F, -0.5F, -0.5F, 3, 1, 1, -0.01F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(2.7F, 0.6F, -7.85F);
        this.Jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3426F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 33, 49, -0.9565F, -0.941F, -1.8424F, 1, 1, 2, -0.01F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(2.7F, 0.6F, -7.85F);
        this.Jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2369F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 44, 22, -0.9565F, -0.941F, 0.0576F, 1, 1, 4, -0.01F, false));

        this.Jaw2 = new ModelRenderer(this);
        this.Jaw2.setRotationPoint(-0.8F, 0.1F, 0.4F);
        this.Jawwhole.addChild(Jaw2);
        this.setRotateAngle(Jaw2, 0.1635F, -0.2259F, 0.0F);
        this.Jaw2.cubeList.add(new ModelBox(Jaw2, 21, 41, -2.7F, -0.02F, -3.95F, 1, 1, 4, -0.01F, true));
        this.Jaw2.cubeList.add(new ModelBox(Jaw2, 26, 49, -2.7F, 0.58F, -3.95F, 1, 1, 2, -0.015F, true));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.661F, -0.2131F, -8.6651F);
        this.Jaw2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3094F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 5, 50, 0.0F, -0.7F, -1.1F, 0, 1, 2, 0.0F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-2.7F, 0.2F, -4.15F);
        this.Jaw2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0912F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 14, 0, 0.039F, -0.5F, -3.534F, 0, 1, 4, 0.0F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 39, 43, -0.011F, -0.22F, -3.534F, 1, 1, 4, -0.01F, true));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.7F, 0.6F, -7.85F);
        this.Jaw2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3426F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 33, 49, -0.0435F, -0.941F, -1.8424F, 1, 1, 2, -0.01F, true));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.7F, 0.6F, -7.85F);
        this.Jaw2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2369F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 44, 22, -0.0435F, -0.941F, 0.0576F, 1, 1, 4, -0.01F, true));

        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(2.5F, 2.5F, -0.5F);
        this.Parmastega.addChild(LArm);
        this.setRotateAngle(LArm, 0.6831F, -0.6593F, 0.2503F);
        this.LArm.cubeList.add(new ModelBox(LArm, 47, 17, 0.0F, -0.5F, 0.0F, 3, 1, 1, 0.0F, false));

        this.LArm2 = new ModelRenderer(this);
        this.LArm2.setRotationPoint(3.0F, 0.0F, 0.5F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, 0.0692F, 0.2527F, 0.2706F);
        this.LArm2.cubeList.add(new ModelBox(LArm2, 44, 14, 0.0F, -0.5F, -1.0F, 4, 1, 1, -0.01F, false));
        this.LArm2.cubeList.add(new ModelBox(LArm2, 43, 6, 0.0F, -0.5F, 0.3F, 4, 1, 1, -0.2F, false));
        this.LArm2.cubeList.add(new ModelBox(LArm2, 10, 13, 3.0F, 0.0F, -1.3F, 4, 0, 3, 0.0F, false));

        this.LArm3 = new ModelRenderer(this);
        this.LArm3.setRotationPoint(-2.5F, 2.5F, -0.5F);
        this.Parmastega.addChild(LArm3);
        this.setRotateAngle(LArm3, 0.6831F, 0.6593F, -0.2503F);
        this.LArm3.cubeList.add(new ModelBox(LArm3, 47, 17, -3.0F, -0.5F, 0.0F, 3, 1, 1, 0.0F, true));

        this.LArm4 = new ModelRenderer(this);
        this.LArm4.setRotationPoint(-3.0F, 0.0F, 0.5F);
        this.LArm3.addChild(LArm4);
        this.setRotateAngle(LArm4, 0.0465F, -0.2577F, -0.1806F);
        this.LArm4.cubeList.add(new ModelBox(LArm4, 44, 14, -4.0F, -0.5F, -1.0F, 4, 1, 1, -0.01F, true));
        this.LArm4.cubeList.add(new ModelBox(LArm4, 43, 6, -4.0F, -0.5F, 0.3F, 4, 1, 1, -0.2F, true));
        this.LArm4.cubeList.add(new ModelBox(LArm4, 10, 13, -7.0F, 0.0F, -1.3F, 4, 0, 3, 0.0F, true));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Parmastega.addChild(Body);
        this.setRotateAngle(Body, -0.044F, 0.1308F, -0.0057F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -0.5F, -1.0F, -1.0F, 1, 1, 11, 0.03F, false));

        this.neck_r10 = new ModelRenderer(this);
        this.neck_r10.setRotationPoint(-0.55F, -0.6353F, 9.1148F);
        this.Body.addChild(neck_r10);
        this.setRotateAngle(neck_r10, -1.4933F, -0.0403F, 0.4784F);
        this.neck_r10.cubeList.add(new ModelBox(neck_r10, 7, 0, -0.4132F, -0.7891F, 0.754F, 0, 1, 1, 0.0F, true));

        this.neck_r11 = new ModelRenderer(this);
        this.neck_r11.setRotationPoint(-0.55F, -0.6353F, 9.1148F);
        this.Body.addChild(neck_r11);
        this.setRotateAngle(neck_r11, -1.5271F, -0.0756F, 1.0455F);
        this.neck_r11.cubeList.add(new ModelBox(neck_r11, 37, 36, 0.0582F, -0.7891F, -0.1425F, 0, 1, 1, 0.0F, true));

        this.neck_r12 = new ModelRenderer(this);
        this.neck_r12.setRotationPoint(-0.55F, -0.6353F, 7.1148F);
        this.Body.addChild(neck_r12);
        this.setRotateAngle(neck_r12, -1.4933F, -0.0403F, 0.6093F);
        this.neck_r12.cubeList.add(new ModelBox(neck_r12, 8, 6, -0.4132F, -0.7891F, 0.754F, 0, 1, 1, 0.0F, true));

        this.neck_r13 = new ModelRenderer(this);
        this.neck_r13.setRotationPoint(-0.55F, -0.6353F, 7.1148F);
        this.Body.addChild(neck_r13);
        this.setRotateAngle(neck_r13, -1.5271F, -0.0756F, 1.1764F);
        this.neck_r13.cubeList.add(new ModelBox(neck_r13, 38, 9, 0.0582F, -0.7891F, -0.1425F, 0, 1, 1, 0.0F, true));

        this.neck_r14 = new ModelRenderer(this);
        this.neck_r14.setRotationPoint(-0.55F, -0.6353F, 5.1148F);
        this.Body.addChild(neck_r14);
        this.setRotateAngle(neck_r14, -1.4933F, -0.0403F, 0.6529F);
        this.neck_r14.cubeList.add(new ModelBox(neck_r14, 0, 31, -0.4132F, -0.7891F, 0.754F, 0, 1, 2, 0.0F, true));

        this.neck_r15 = new ModelRenderer(this);
        this.neck_r15.setRotationPoint(-0.55F, -0.6353F, 5.1148F);
        this.Body.addChild(neck_r15);
        this.setRotateAngle(neck_r15, -1.5271F, -0.0756F, 1.2201F);
        this.neck_r15.cubeList.add(new ModelBox(neck_r15, 0, 39, 0.0582F, -0.7891F, -0.1425F, 0, 1, 1, 0.0F, true));

        this.neck_r16 = new ModelRenderer(this);
        this.neck_r16.setRotationPoint(-0.55F, -0.6353F, 3.1148F);
        this.Body.addChild(neck_r16);
        this.setRotateAngle(neck_r16, -1.4545F, -0.0603F, 0.6946F);
        this.neck_r16.cubeList.add(new ModelBox(neck_r16, 46, 40, -0.4072F, -0.7877F, 0.7655F, 0, 1, 3, 0.0F, true));

        this.neck_r17 = new ModelRenderer(this);
        this.neck_r17.setRotationPoint(-0.55F, -0.6353F, 3.1148F);
        this.Body.addChild(neck_r17);
        this.setRotateAngle(neck_r17, -1.5051F, -0.1133F, 1.2616F);
        this.neck_r17.cubeList.add(new ModelBox(neck_r17, 9, 39, 0.0695F, -0.7877F, -0.136F, 0, 1, 1, 0.0F, true));

        this.neck_r18 = new ModelRenderer(this);
        this.neck_r18.setRotationPoint(-0.55F, -0.6353F, 1.1148F);
        this.Body.addChild(neck_r18);
        this.setRotateAngle(neck_r18, -1.3375F, -0.1198F, 0.6841F);
        this.neck_r18.cubeList.add(new ModelBox(neck_r18, 47, 46, -0.3894F, -0.7801F, 0.7997F, 0, 1, 3, 0.0F, true));

        this.neck_r19 = new ModelRenderer(this);
        this.neck_r19.setRotationPoint(-0.55F, -0.6353F, 1.1148F);
        this.Body.addChild(neck_r19);
        this.setRotateAngle(neck_r19, -1.4376F, -0.2261F, 1.2502F);
        this.neck_r19.cubeList.add(new ModelBox(neck_r19, 28, 41, 0.1028F, -0.7801F, -0.1168F, 0, 1, 1, 0.0F, true));

        this.neck_r20 = new ModelRenderer(this);
        this.neck_r20.setRotationPoint(-0.55F, -0.6353F, -0.8852F);
        this.Body.addChild(neck_r20);
        this.setRotateAngle(neck_r20, -1.3375F, -0.1198F, 0.5532F);
        this.neck_r20.cubeList.add(new ModelBox(neck_r20, 7, 31, -0.3826F, -0.7764F, 0.8103F, 0, 1, 2, 0.0F, true));

        this.neck_r21 = new ModelRenderer(this);
        this.neck_r21.setRotationPoint(-0.55F, -0.6353F, -0.8852F);
        this.Body.addChild(neck_r21);
        this.setRotateAngle(neck_r21, -1.4376F, -0.2261F, 1.1193F);
        this.neck_r21.cubeList.add(new ModelBox(neck_r21, 44, 34, 0.1142F, -0.7764F, -0.1115F, 0, 1, 1, 0.0F, true));

        this.neck_r22 = new ModelRenderer(this);
        this.neck_r22.setRotationPoint(0.55F, -0.6353F, 9.1148F);
        this.Body.addChild(neck_r22);
        this.setRotateAngle(neck_r22, -1.4933F, 0.0403F, -0.4784F);
        this.neck_r22.cubeList.add(new ModelBox(neck_r22, 7, 0, 0.4132F, -0.7891F, 0.754F, 0, 1, 1, 0.0F, false));

        this.neck_r23 = new ModelRenderer(this);
        this.neck_r23.setRotationPoint(0.55F, -0.6353F, 9.1148F);
        this.Body.addChild(neck_r23);
        this.setRotateAngle(neck_r23, -1.5271F, 0.0756F, -1.0455F);
        this.neck_r23.cubeList.add(new ModelBox(neck_r23, 37, 36, -0.0582F, -0.7891F, -0.1425F, 0, 1, 1, 0.0F, false));

        this.neck_r24 = new ModelRenderer(this);
        this.neck_r24.setRotationPoint(0.55F, -0.6353F, 7.1148F);
        this.Body.addChild(neck_r24);
        this.setRotateAngle(neck_r24, -1.4933F, 0.0403F, -0.6093F);
        this.neck_r24.cubeList.add(new ModelBox(neck_r24, 8, 6, 0.4132F, -0.7891F, 0.754F, 0, 1, 1, 0.0F, false));

        this.neck_r25 = new ModelRenderer(this);
        this.neck_r25.setRotationPoint(0.55F, -0.6353F, 7.1148F);
        this.Body.addChild(neck_r25);
        this.setRotateAngle(neck_r25, -1.5271F, 0.0756F, -1.1764F);
        this.neck_r25.cubeList.add(new ModelBox(neck_r25, 38, 9, -0.0582F, -0.7891F, -0.1425F, 0, 1, 1, 0.0F, false));

        this.neck_r26 = new ModelRenderer(this);
        this.neck_r26.setRotationPoint(0.55F, -0.6353F, 5.1148F);
        this.Body.addChild(neck_r26);
        this.setRotateAngle(neck_r26, -1.4933F, 0.0403F, -0.6529F);
        this.neck_r26.cubeList.add(new ModelBox(neck_r26, 0, 31, 0.4132F, -0.7891F, 0.754F, 0, 1, 2, 0.0F, false));

        this.neck_r27 = new ModelRenderer(this);
        this.neck_r27.setRotationPoint(0.55F, -0.6353F, 5.1148F);
        this.Body.addChild(neck_r27);
        this.setRotateAngle(neck_r27, -1.5271F, 0.0756F, -1.2201F);
        this.neck_r27.cubeList.add(new ModelBox(neck_r27, 0, 39, -0.0582F, -0.7891F, -0.1425F, 0, 1, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.0F, -4.5F);
        this.Body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1745F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 14, 0, 0.0F, -3.1365F, 13.2481F, 0, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 10, 17, 0.0F, -2.7892F, 11.2785F, 0, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 16, 17, 0.0F, -2.4419F, 9.3088F, 0, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 19, 0, 0.0F, -2.0946F, 7.3392F, 0, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 22, 13, 0.0F, -1.7473F, 5.3696F, 0, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 33, 17, 0.0F, -1.4F, 3.4F, 0, 1, 1, 0.0F, false));

        this.neck_r28 = new ModelRenderer(this);
        this.neck_r28.setRotationPoint(0.55F, -0.6353F, 3.1148F);
        this.Body.addChild(neck_r28);
        this.setRotateAngle(neck_r28, -1.4545F, 0.0603F, -0.6946F);
        this.neck_r28.cubeList.add(new ModelBox(neck_r28, 46, 40, 0.4072F, -0.7877F, 0.7655F, 0, 1, 3, 0.0F, false));

        this.neck_r29 = new ModelRenderer(this);
        this.neck_r29.setRotationPoint(0.55F, -0.6353F, 3.1148F);
        this.Body.addChild(neck_r29);
        this.setRotateAngle(neck_r29, -1.5051F, 0.1133F, -1.2616F);
        this.neck_r29.cubeList.add(new ModelBox(neck_r29, 9, 39, -0.0695F, -0.7877F, -0.136F, 0, 1, 1, 0.0F, false));

        this.neck_r30 = new ModelRenderer(this);
        this.neck_r30.setRotationPoint(0.55F, -0.6353F, -0.8852F);
        this.Body.addChild(neck_r30);
        this.setRotateAngle(neck_r30, -1.3375F, 0.1198F, -0.5532F);
        this.neck_r30.cubeList.add(new ModelBox(neck_r30, 7, 31, 0.3826F, -0.7764F, 0.8103F, 0, 1, 2, 0.0F, false));

        this.neck_r31 = new ModelRenderer(this);
        this.neck_r31.setRotationPoint(0.55F, -0.6353F, -0.8852F);
        this.Body.addChild(neck_r31);
        this.setRotateAngle(neck_r31, -1.4376F, 0.2261F, -1.1193F);
        this.neck_r31.cubeList.add(new ModelBox(neck_r31, 44, 34, -0.1142F, -0.7764F, -0.1115F, 0, 1, 1, 0.0F, false));

        this.neck_r32 = new ModelRenderer(this);
        this.neck_r32.setRotationPoint(0.55F, -0.6353F, 1.1148F);
        this.Body.addChild(neck_r32);
        this.setRotateAngle(neck_r32, -1.4376F, 0.2261F, -1.2502F);
        this.neck_r32.cubeList.add(new ModelBox(neck_r32, 28, 41, -0.1028F, -0.7801F, -0.1168F, 0, 1, 1, 0.0F, false));

        this.neck_r33 = new ModelRenderer(this);
        this.neck_r33.setRotationPoint(0.55F, -0.6353F, 1.1148F);
        this.Body.addChild(neck_r33);
        this.setRotateAngle(neck_r33, -1.3375F, 0.1198F, -0.6841F);
        this.neck_r33.cubeList.add(new ModelBox(neck_r33, 47, 46, 0.3894F, -0.7801F, 0.7997F, 0, 1, 3, 0.0F, false));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.0443F, 0.1744F, -0.0077F);
        this.Body2.cubeList.add(new ModelBox(Body2, 26, 0, -0.5F, -1.0F, 0.0F, 1, 1, 7, 0.02F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -1.0F, -14.5F);
        this.Body2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1745F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 50, 34, 0.0F, -4.0566F, 19.1878F, 0, 1, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 50, 40, 0.0F, -3.7214F, 17.2136F, 0, 1, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 10, 13, 0.0F, -3.4838F, 15.2177F, 0, 1, 1, 0.0F, false));

        this.tailbase_r1 = new ModelRenderer(this);
        this.tailbase_r1.setRotationPoint(0.0F, -0.7637F, 3.6675F);
        this.Body2.addChild(tailbase_r1);
        this.setRotateAngle(tailbase_r1, 0.0164F, 0.006F, -0.349F);
        this.tailbase_r1.cubeList.add(new ModelBox(tailbase_r1, 28, 43, -2.9283F, 2.9239F, -0.7506F, 1, 1, 4, 0.0F, true));

        this.tailbase_r2 = new ModelRenderer(this);
        this.tailbase_r2.setRotationPoint(-1.9F, 1.5449F, 4.9816F);
        this.Body2.addChild(tailbase_r2);
        this.setRotateAngle(tailbase_r2, -0.5854F, -0.0284F, -0.4039F);
        this.tailbase_r2.cubeList.add(new ModelBox(tailbase_r2, 19, 47, -0.5F, 0.2335F, -0.9372F, 1, 2, 2, 0.0F, true));

        this.tailbase_r3 = new ModelRenderer(this);
        this.tailbase_r3.setRotationPoint(0.0F, -0.7637F, 3.6675F);
        this.Body2.addChild(tailbase_r3);
        this.setRotateAngle(tailbase_r3, -1.8151F, 0.0F, 0.0F);
        this.tailbase_r3.cubeList.add(new ModelBox(tailbase_r3, 10, 17, -2.4F, -1.795F, -0.7192F, 1, 1, 3, 0.0F, true));
        this.tailbase_r3.cubeList.add(new ModelBox(tailbase_r3, 10, 17, 1.4F, -1.795F, -0.7192F, 1, 1, 3, 0.0F, false));

        this.tailbase_r4 = new ModelRenderer(this);
        this.tailbase_r4.setRotationPoint(1.9F, 1.5449F, 4.9816F);
        this.Body2.addChild(tailbase_r4);
        this.setRotateAngle(tailbase_r4, -0.5854F, 0.0284F, 0.4039F);
        this.tailbase_r4.cubeList.add(new ModelBox(tailbase_r4, 19, 47, -0.5F, 0.2335F, -0.9372F, 1, 2, 2, 0.0F, false));

        this.tailbase_r5 = new ModelRenderer(this);
        this.tailbase_r5.setRotationPoint(0.0F, -0.7637F, 3.6675F);
        this.Body2.addChild(tailbase_r5);
        this.setRotateAngle(tailbase_r5, 0.0164F, -0.006F, 0.349F);
        this.tailbase_r5.cubeList.add(new ModelBox(tailbase_r5, 28, 43, 1.9283F, 2.9239F, -0.7506F, 1, 1, 4, 0.0F, false));

        this.tailbase_r6 = new ModelRenderer(this);
        this.tailbase_r6.setRotationPoint(0.0F, -0.7637F, 3.6675F);
        this.Body2.addChild(tailbase_r6);
        this.setRotateAngle(tailbase_r6, 0.0175F, 0.0F, 0.0F);
        this.tailbase_r6.cubeList.add(new ModelBox(tailbase_r6, 36, 0, -1.6F, 3.7048F, -0.7506F, 3, 1, 4, -0.02F, false));

        this.neck_r34 = new ModelRenderer(this);
        this.neck_r34.setRotationPoint(-0.55F, -0.5353F, 3.4148F);
        this.Body2.addChild(neck_r34);
        this.setRotateAngle(neck_r34, -1.5708F, 0.0F, 1.0472F);
        this.neck_r34.cubeList.add(new ModelBox(neck_r34, 36, 0, 0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, true));

        this.neck_r35 = new ModelRenderer(this);
        this.neck_r35.setRotationPoint(-0.55F, -0.5353F, 1.4148F);
        this.Body2.addChild(neck_r35);
        this.setRotateAngle(neck_r35, -1.4933F, -0.0403F, 0.4784F);
        this.neck_r35.cubeList.add(new ModelBox(neck_r35, 0, 6, -0.4253F, -0.4903F, 0.7308F, 0, 1, 1, 0.0F, true));

        this.neck_r36 = new ModelRenderer(this);
        this.neck_r36.setRotationPoint(-0.55F, -0.5353F, 1.4148F);
        this.Body2.addChild(neck_r36);
        this.setRotateAngle(neck_r36, -1.5271F, -0.0756F, 1.0455F);
        this.neck_r36.cubeList.add(new ModelBox(neck_r36, 26, 36, 0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, true));

        this.neck_r37 = new ModelRenderer(this);
        this.neck_r37.setRotationPoint(0.55F, -0.5353F, 3.4148F);
        this.Body2.addChild(neck_r37);
        this.setRotateAngle(neck_r37, -1.5708F, 0.0F, -1.0472F);
        this.neck_r37.cubeList.add(new ModelBox(neck_r37, 36, 0, -0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, false));

        this.neck_r38 = new ModelRenderer(this);
        this.neck_r38.setRotationPoint(0.55F, -0.5353F, 1.4148F);
        this.Body2.addChild(neck_r38);
        this.setRotateAngle(neck_r38, -1.4933F, 0.0403F, -0.4784F);
        this.neck_r38.cubeList.add(new ModelBox(neck_r38, 0, 6, 0.4253F, -0.4903F, 0.7308F, 0, 1, 1, 0.0F, false));

        this.neck_r39 = new ModelRenderer(this);
        this.neck_r39.setRotationPoint(0.55F, -0.5353F, 1.4148F);
        this.Body2.addChild(neck_r39);
        this.setRotateAngle(neck_r39, -1.5271F, 0.0756F, -1.0455F);
        this.neck_r39.cubeList.add(new ModelBox(neck_r39, 26, 36, -0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, false));

        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(2.5F, 1.0F, 5.0F);
        this.Body2.addChild(LLeg);
        this.setRotateAngle(LLeg, -0.3224F, -0.9464F, 1.612F);
        this.LLeg.cubeList.add(new ModelBox(LLeg, 47, 0, 0.0F, -0.5F, -1.0F, 3, 1, 1, 0.0F, false));

        this.LLeg2 = new ModelRenderer(this);
        this.LLeg2.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, -0.0411F, -0.3027F, 0.1372F);
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 46, 28, 0.0F, -0.5F, -1.2F, 3, 1, 1, -0.01F, false));
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 14, 6, 0.0F, -0.5F, -0.1F, 3, 1, 1, -0.2F, false));
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 33, 22, 2.0F, 0.0F, -1.5F, 4, 0, 3, 0.0F, false));

        this.LLeg3 = new ModelRenderer(this);
        this.LLeg3.setRotationPoint(-2.5F, 1.0F, 5.0F);
        this.Body2.addChild(LLeg3);
        this.setRotateAngle(LLeg3, 0.6013F, 0.5805F, -0.4957F);
        this.LLeg3.cubeList.add(new ModelBox(LLeg3, 47, 0, -3.0F, -0.5F, -1.0F, 3, 1, 1, 0.0F, true));

        this.LLeg4 = new ModelRenderer(this);
        this.LLeg4.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.LLeg3.addChild(LLeg4);
        this.setRotateAngle(LLeg4, -0.0681F, 0.298F, -0.2284F);
        this.LLeg4.cubeList.add(new ModelBox(LLeg4, 46, 28, -3.0F, -0.5F, -1.2F, 3, 1, 1, -0.01F, true));
        this.LLeg4.cubeList.add(new ModelBox(LLeg4, 14, 6, -3.0F, -0.5F, -0.1F, 3, 1, 1, -0.2F, true));
        this.LLeg4.cubeList.add(new ModelBox(LLeg4, 33, 22, -6.0F, 0.0F, -1.5F, 4, 0, 3, 0.0F, true));

        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.4F, 7.2F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, 0.0438F, -0.0872F, -0.0038F);


        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.6527F, -21.7163F);
        this.Tail.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1745F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, 0.0F, -5.2978F, 25.2359F, 0, 2, 1, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 45, 50, 0.0F, -4.4429F, 23.1795F, 0, 1, 1, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 50, 31, 0.0F, -4.2926F, 21.1751F, 0, 1, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.1527F, -0.3163F);
        this.Tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0698F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 36, 36, -0.5F, -0.4F, 0.1F, 1, 1, 5, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.3473F, 4.7837F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0F, -0.2182F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 29, 9, -0.5F, -0.5F, -0.1F, 1, 1, 6, -0.02F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 13, 26, 0.0F, -4.0F, 0.0F, 0, 8, 6, 0.0F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 5.8F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0F, -0.1745F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 8, 41, -0.5F, -0.5F, 0.1F, 1, 1, 5, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 19, 11, -0.01F, -4.0F, -0.8F, 0, 8, 6, 0.0F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 4.9F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0F, -0.1309F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 13, 0.0F, -4.0F, -1.7F, 0, 8, 9, 0.0F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 26, 28, -0.5F, -0.5F, 0.2F, 1, 1, 6, -0.003F, false));

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
