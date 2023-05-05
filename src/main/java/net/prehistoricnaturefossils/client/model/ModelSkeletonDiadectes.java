package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDiadectes extends ModelBase {
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
    private final ModelRenderer Neck_r1;
    private final ModelRenderer Neck_r2;
    private final ModelRenderer Neck_r3;
    private final ModelRenderer Neck_r4;
    private final ModelRenderer Neck_r5;
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
    private final ModelRenderer Belly;
    private final ModelRenderer Belly_r1;
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
    private final ModelRenderer Neck_r43;
    private final ModelRenderer Neck_r44;
    private final ModelRenderer Neck_r45;
    private final ModelRenderer Neck_r46;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Bodyfront_r2;
    private final ModelRenderer Neck_r47;
    private final ModelRenderer Neck_r48;
    private final ModelRenderer Neck_r49;
    private final ModelRenderer Neck_r50;
    private final ModelRenderer Neck_r51;
    private final ModelRenderer Neck_r52;
    private final ModelRenderer Neck_r53;
    private final ModelRenderer Neck_r54;
    private final ModelRenderer Neck_r55;
    private final ModelRenderer Neck_r56;
    private final ModelRenderer Neck_r57;
    private final ModelRenderer Neck_r58;
    private final ModelRenderer Neck_r59;
    private final ModelRenderer Neck_r60;
    private final ModelRenderer Neck_r61;
    private final ModelRenderer Neck_r62;
    private final ModelRenderer Neck_r63;
    private final ModelRenderer Neck_r64;
    private final ModelRenderer Neck_r65;
    private final ModelRenderer Neck_r66;
    private final ModelRenderer Neck_r67;
    private final ModelRenderer Neck_r68;
    private final ModelRenderer Neck_r69;
    private final ModelRenderer Neck_r70;
    private final ModelRenderer Neck;
    private final ModelRenderer Neck_r71;
    private final ModelRenderer Neck_r72;
    private final ModelRenderer Head;
    private final ModelRenderer Head_r1;
    private final ModelRenderer Head_r2;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Upperjawfront_r1;
    private final ModelRenderer Upperfrontteeth;
    private final ModelRenderer Upperfrontteeth_r1;
    private final ModelRenderer Upperfrontteeth_r2;
    private final ModelRenderer Upperfrontteeth_r3;
    private final ModelRenderer Rightupperteeth;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawback_r1;
    private final ModelRenderer Lowerjawback_r2;
    private final ModelRenderer Lowerjawback_r3;
    private final ModelRenderer Lowerjawback_r4;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawmiddle_r1;
    private final ModelRenderer Lowerjawmiddle_r2;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerjawfront_r1;
    private final ModelRenderer Lowerjawfront_r2;
    private final ModelRenderer Rightlowerteeth;
    private final ModelRenderer Rightlowerteeth_r1;
    private final ModelRenderer Rightlowerteeth_r2;
    private final ModelRenderer Lowerfrontteeth;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightupperarm_r1;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Rightupperarm_r2;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailbase_r1;
    private final ModelRenderer Tailbase_r2;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailbase_r3;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailend;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightthigh_r1;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Rightthigh_r2;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonDiadectes() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(1.0F, 16.6F, -1.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.0576F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 39, 48, -1.0F, -1.7599F, 7.0217F, 0, 1, 1, 0.0F, false));

        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-3.3F, 4.4875F, 12.7043F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.0697F, -0.0037F, -0.0522F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 13, 0, -0.4F, -2.0024F, -1.9302F, 1, 2, 3, 0.0F, true));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(-3.3F, 4.4875F, 12.7043F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.0643F, -0.0273F, -0.4005F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 11, 47, -0.4F, -0.2024F, -1.9302F, 1, 2, 3, 0.0F, true));

        this.Hips_r3 = new ModelRenderer(this);
        this.Hips_r3.setRotationPoint(-2.3149F, 6.0223F, 12.5969F);
        this.Hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.0091F, 0.0355F, -1.4405F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 34, 16, -0.4057F, -0.7036F, -1.9302F, 1, 2, 5, -0.002F, true));

        this.Hips_r4 = new ModelRenderer(this);
        this.Hips_r4.setRotationPoint(-3.4F, 2.5219F, 12.6727F);
        this.Hips.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, -0.1133F, 0.0049F, 0.0696F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 25, 36, -0.5F, -1.8978F, -2.0628F, 1, 2, 5, 0.0F, true));

        this.Hips_r5 = new ModelRenderer(this);
        this.Hips_r5.setRotationPoint(0.3149F, 6.0223F, 12.5969F);
        this.Hips.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, -0.0091F, -0.0355F, 1.4405F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 34, 16, -0.5943F, -0.7036F, -1.9302F, 1, 2, 5, 0.0F, false));

        this.Hips_r6 = new ModelRenderer(this);
        this.Hips_r6.setRotationPoint(1.3F, 4.4875F, 12.7043F);
        this.Hips.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, -0.0697F, 0.0037F, 0.0522F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 13, 0, -0.6F, -2.0024F, -1.9302F, 1, 2, 3, 0.0F, false));

        this.Hips_r7 = new ModelRenderer(this);
        this.Hips_r7.setRotationPoint(1.3F, 4.4875F, 12.7043F);
        this.Hips.addChild(Hips_r7);
        this.setRotateAngle(Hips_r7, -0.0643F, 0.0273F, 0.4005F);
        this.Hips_r7.cubeList.add(new ModelBox(Hips_r7, 11, 47, -0.6F, -0.2024F, -1.9302F, 1, 2, 3, 0.0F, false));

        this.Hips_r8 = new ModelRenderer(this);
        this.Hips_r8.setRotationPoint(1.4F, 2.5219F, 12.6727F);
        this.Hips.addChild(Hips_r8);
        this.setRotateAngle(Hips_r8, -0.1133F, -0.0049F, -0.0696F);
        this.Hips_r8.cubeList.add(new ModelBox(Hips_r8, 25, 36, -0.5F, -1.8978F, -2.0628F, 1, 2, 5, 0.0F, false));

        this.Hips_r9 = new ModelRenderer(this);
        this.Hips_r9.setRotationPoint(-1.0F, -0.5599F, 7.1217F);
        this.Hips.addChild(Hips_r9);
        this.setRotateAngle(Hips_r9, -0.0698F, 0.0F, 0.0F);
        this.Hips_r9.cubeList.add(new ModelBox(Hips_r9, 14, 3, -0.5F, -0.5F, -0.1F, 1, 1, 9, 0.001F, false));

        this.Neck_r1 = new ModelRenderer(this);
        this.Neck_r1.setRotationPoint(-1.4693F, 0.2099F, 15.3198F);
        this.Hips.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, -0.0937F, -0.3075F, -0.4509F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 0, 29, -1.8286F, -0.0026F, -0.3212F, 2, 0, 1, 0.0F, true));

        this.Neck_r2 = new ModelRenderer(this);
        this.Neck_r2.setRotationPoint(-1.4693F, -0.2901F, 11.3198F);
        this.Hips.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, -0.0893F, -0.0033F, -0.479F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 39, 30, -2.0459F, 0.0826F, 1.7032F, 2, 0, 1, 0.0F, true));
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 48, 25, -2.0459F, 0.0826F, -0.2968F, 2, 0, 1, 0.0F, true));

        this.Neck_r3 = new ModelRenderer(this);
        this.Neck_r3.setRotationPoint(-1.4693F, -0.2901F, 9.5198F);
        this.Hips.addChild(Neck_r3);
        this.setRotateAngle(Neck_r3, -0.0369F, -0.0033F, -0.479F);
        this.Neck_r3.cubeList.add(new ModelBox(Neck_r3, 52, 44, -2.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, true));

        this.Neck_r4 = new ModelRenderer(this);
        this.Neck_r4.setRotationPoint(-1.4693F, -0.2901F, 9.5198F);
        this.Hips.addChild(Neck_r4);
        this.setRotateAngle(Neck_r4, -0.0311F, -0.0203F, -0.9674F);
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 13, 6, -4.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, true));

        this.Neck_r5 = new ModelRenderer(this);
        this.Neck_r5.setRotationPoint(-1.4693F, -0.4901F, 7.5198F);
        this.Hips.addChild(Neck_r5);
        this.setRotateAngle(Neck_r5, 0.0278F, 0.0426F, -1.4918F);
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 18, 24, -4.3791F, -3.5487F, -0.3809F, 1, 0, 1, 0.0F, true));

        this.Neck_r6 = new ModelRenderer(this);
        this.Neck_r6.setRotationPoint(-1.4693F, -0.4901F, 7.5198F);
        this.Hips.addChild(Neck_r6);
        this.setRotateAngle(Neck_r6, 0.0333F, 0.0404F, -0.8807F);
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 13, 8, -4.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, true));

        this.Neck_r7 = new ModelRenderer(this);
        this.Neck_r7.setRotationPoint(-1.4693F, -0.4901F, 7.5198F);
        this.Hips.addChild(Neck_r7);
        this.setRotateAngle(Neck_r7, 0.0484F, 0.02F, -0.3922F);
        this.Neck_r7.cubeList.add(new ModelBox(Neck_r7, 52, 46, -2.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, true));

        this.Neck_r8 = new ModelRenderer(this);
        this.Neck_r8.setRotationPoint(-0.5307F, 0.2099F, 15.3198F);
        this.Hips.addChild(Neck_r8);
        this.setRotateAngle(Neck_r8, -0.0937F, 0.3075F, 0.4509F);
        this.Neck_r8.cubeList.add(new ModelBox(Neck_r8, 0, 29, -0.1714F, -0.0026F, -0.3212F, 2, 0, 1, 0.0F, false));

        this.Neck_r9 = new ModelRenderer(this);
        this.Neck_r9.setRotationPoint(-0.5307F, -0.2901F, 11.3198F);
        this.Hips.addChild(Neck_r9);
        this.setRotateAngle(Neck_r9, -0.0893F, 0.0033F, 0.479F);
        this.Neck_r9.cubeList.add(new ModelBox(Neck_r9, 39, 30, 0.0459F, 0.0826F, 1.7032F, 2, 0, 1, 0.0F, false));
        this.Neck_r9.cubeList.add(new ModelBox(Neck_r9, 48, 25, 0.0459F, 0.0826F, -0.2968F, 2, 0, 1, 0.0F, false));

        this.Neck_r10 = new ModelRenderer(this);
        this.Neck_r10.setRotationPoint(-0.5307F, -0.2901F, 9.5198F);
        this.Hips.addChild(Neck_r10);
        this.setRotateAngle(Neck_r10, -0.0369F, 0.0033F, 0.479F);
        this.Neck_r10.cubeList.add(new ModelBox(Neck_r10, 52, 44, 0.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, false));

        this.Neck_r11 = new ModelRenderer(this);
        this.Neck_r11.setRotationPoint(-0.5307F, -0.2901F, 9.5198F);
        this.Hips.addChild(Neck_r11);
        this.setRotateAngle(Neck_r11, -0.0311F, 0.0203F, 0.9674F);
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 13, 6, 1.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, false));

        this.Neck_r12 = new ModelRenderer(this);
        this.Neck_r12.setRotationPoint(-1.0F, 9.0401F, 1.0217F);
        this.Hips.addChild(Neck_r12);
        this.setRotateAngle(Neck_r12, -0.0698F, 0.0F, 0.0F);
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 11, 47, 0.0F, -10.9F, 13.5F, 0, 1, 1, 0.0F, false));

        this.Neck_r13 = new ModelRenderer(this);
        this.Neck_r13.setRotationPoint(-1.0F, 9.0401F, 0.7217F);
        this.Hips.addChild(Neck_r13);
        this.setRotateAngle(Neck_r13, -0.0698F, 0.0F, 0.0F);
        this.Neck_r13.cubeList.add(new ModelBox(Neck_r13, 17, 47, 0.0F, -11.1F, 11.7F, 0, 1, 1, 0.0F, false));
        this.Neck_r13.cubeList.add(new ModelBox(Neck_r13, 20, 47, 0.0F, -11.1F, 9.7F, 0, 1, 1, 0.0F, false));
        this.Neck_r13.cubeList.add(new ModelBox(Neck_r13, 47, 20, 0.0F, -11.3F, 7.7F, 0, 1, 1, 0.0F, false));

        this.Neck_r14 = new ModelRenderer(this);
        this.Neck_r14.setRotationPoint(-0.5307F, -0.4901F, 7.5198F);
        this.Hips.addChild(Neck_r14);
        this.setRotateAngle(Neck_r14, 0.0484F, -0.02F, 0.3922F);
        this.Neck_r14.cubeList.add(new ModelBox(Neck_r14, 52, 46, 0.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, false));

        this.Neck_r15 = new ModelRenderer(this);
        this.Neck_r15.setRotationPoint(-0.5307F, -0.4901F, 7.5198F);
        this.Hips.addChild(Neck_r15);
        this.setRotateAngle(Neck_r15, 0.0278F, -0.0426F, 1.4918F);
        this.Neck_r15.cubeList.add(new ModelBox(Neck_r15, 18, 24, 3.3791F, -3.5487F, -0.3809F, 1, 0, 1, 0.0F, false));

        this.Neck_r16 = new ModelRenderer(this);
        this.Neck_r16.setRotationPoint(-0.5307F, -0.4901F, 7.5198F);
        this.Hips.addChild(Neck_r16);
        this.setRotateAngle(Neck_r16, 0.0333F, -0.0404F, 0.8807F);
        this.Neck_r16.cubeList.add(new ModelBox(Neck_r16, 13, 8, 1.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, false));

        this.Belly = new ModelRenderer(this);
        this.Belly.setRotationPoint(-1.0F, -0.5599F, 7.0217F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.0205F, -0.1735F, -0.0187F);
        this.Belly.cubeList.add(new ModelBox(Belly, 17, 55, 0.0F, -1.6885F, -9.8997F, 0, 1, 1, 0.0F, false));
        this.Belly.cubeList.add(new ModelBox(Belly, 37, 53, 0.0F, -1.6885F, -7.8997F, 0, 1, 1, 0.0F, false));
        this.Belly.cubeList.add(new ModelBox(Belly, 15, 53, 0.0F, -1.5885F, -5.8997F, 0, 1, 1, 0.0F, false));
        this.Belly.cubeList.add(new ModelBox(Belly, 53, 13, 0.0F, -1.4885F, -3.8997F, 0, 1, 1, 0.0F, false));
        this.Belly.cubeList.add(new ModelBox(Belly, 50, 13, 0.0F, -1.3885F, -1.8997F, 0, 1, 1, 0.0F, false));

        this.Belly_r1 = new ModelRenderer(this);
        this.Belly_r1.setRotationPoint(0.0F, -0.3885F, -9.8997F);
        this.Belly.addChild(Belly_r1);
        this.setRotateAngle(Belly_r1, -0.0349F, 0.0F, 0.0F);
        this.Belly_r1.cubeList.add(new ModelBox(Belly_r1, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F, false));

        this.Neck_r17 = new ModelRenderer(this);
        this.Neck_r17.setRotationPoint(-0.4693F, -0.1186F, -1.4016F);
        this.Belly.addChild(Neck_r17);
        this.setRotateAngle(Neck_r17, -0.0749F, 0.1004F, -0.3594F);
        this.Neck_r17.cubeList.add(new ModelBox(Neck_r17, 30, 53, -2.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, true));

        this.Neck_r18 = new ModelRenderer(this);
        this.Neck_r18.setRotationPoint(-0.4693F, -0.1186F, -1.4016F);
        this.Belly.addChild(Neck_r18);
        this.setRotateAngle(Neck_r18, -0.0998F, -0.0303F, -1.4524F);
        this.Neck_r18.cubeList.add(new ModelBox(Neck_r18, 54, 4, -5.3791F, -3.5487F, -0.3809F, 2, 0, 1, 0.0F, true));

        this.Neck_r19 = new ModelRenderer(this);
        this.Neck_r19.setRotationPoint(-0.4693F, -0.1186F, -1.4016F);
        this.Belly.addChild(Neck_r19);
        this.setRotateAngle(Neck_r19, -0.1132F, 0.0536F, -0.8474F);
        this.Neck_r19.cubeList.add(new ModelBox(Neck_r19, 0, 18, -4.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, true));

        this.Neck_r20 = new ModelRenderer(this);
        this.Neck_r20.setRotationPoint(-0.4693F, -0.1186F, -3.4016F);
        this.Belly.addChild(Neck_r20);
        this.setRotateAngle(Neck_r20, -0.0251F, 0.0005F, -1.3695F);
        this.Neck_r20.cubeList.add(new ModelBox(Neck_r20, 0, 20, -6.3791F, -3.5487F, -0.3809F, 3, 0, 1, 0.0F, true));

        this.Neck_r21 = new ModelRenderer(this);
        this.Neck_r21.setRotationPoint(-0.4693F, -0.1186F, -3.4016F);
        this.Belly.addChild(Neck_r21);
        this.setRotateAngle(Neck_r21, -0.0342F, 0.0362F, -0.7599F);
        this.Neck_r21.cubeList.add(new ModelBox(Neck_r21, 26, 9, -4.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, true));

        this.Neck_r22 = new ModelRenderer(this);
        this.Neck_r22.setRotationPoint(-0.4693F, -0.1186F, -3.4016F);
        this.Belly.addChild(Neck_r22);
        this.setRotateAngle(Neck_r22, -0.0132F, 0.048F, -0.2709F);
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 54, 19, -2.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, true));

        this.Neck_r23 = new ModelRenderer(this);
        this.Neck_r23.setRotationPoint(-0.4693F, -0.2186F, -5.4016F);
        this.Belly.addChild(Neck_r23);
        this.setRotateAngle(Neck_r23, 0.028F, -0.0104F, -1.2825F);
        this.Neck_r23.cubeList.add(new ModelBox(Neck_r23, 29, 16, -6.3791F, -3.5487F, -0.3809F, 3, 0, 1, 0.0F, true));

        this.Neck_r24 = new ModelRenderer(this);
        this.Neck_r24.setRotationPoint(-0.4693F, -0.2186F, -5.4016F);
        this.Belly.addChild(Neck_r24);
        this.setRotateAngle(Neck_r24, 0.0031F, -0.0032F, -0.672F);
        this.Neck_r24.cubeList.add(new ModelBox(Neck_r24, 9, 33, -4.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, true));

        this.Neck_r25 = new ModelRenderer(this);
        this.Neck_r25.setRotationPoint(-0.4693F, -0.2186F, -5.4016F);
        this.Belly.addChild(Neck_r25);
        this.setRotateAngle(Neck_r25, 0.0013F, -0.0043F, -0.1833F);
        this.Neck_r25.cubeList.add(new ModelBox(Neck_r25, 54, 21, -2.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, true));

        this.Neck_r26 = new ModelRenderer(this);
        this.Neck_r26.setRotationPoint(-0.4693F, -0.3186F, -7.4016F);
        this.Belly.addChild(Neck_r26);
        this.setRotateAngle(Neck_r26, 0.0282F, -0.0104F, -1.2738F);
        this.Neck_r26.cubeList.add(new ModelBox(Neck_r26, 19, 0, -7.3791F, -3.5487F, -0.3809F, 4, 0, 1, 0.0F, true));

        this.Neck_r27 = new ModelRenderer(this);
        this.Neck_r27.setRotationPoint(-0.4693F, -0.3186F, -7.4016F);
        this.Belly.addChild(Neck_r27);
        this.setRotateAngle(Neck_r27, 0.0032F, -0.0033F, -0.6633F);
        this.Neck_r27.cubeList.add(new ModelBox(Neck_r27, 34, 24, -4.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, true));

        this.Neck_r28 = new ModelRenderer(this);
        this.Neck_r28.setRotationPoint(-0.4693F, -0.3186F, -7.4016F);
        this.Belly.addChild(Neck_r28);
        this.setRotateAngle(Neck_r28, 0.0013F, -0.0045F, -0.1746F);
        this.Neck_r28.cubeList.add(new ModelBox(Neck_r28, 54, 38, -2.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, true));

        this.Neck_r29 = new ModelRenderer(this);
        this.Neck_r29.setRotationPoint(-0.4693F, -0.3186F, -9.4016F);
        this.Belly.addChild(Neck_r29);
        this.setRotateAngle(Neck_r29, 0.1452F, -0.045F, -1.2858F);
        this.Neck_r29.cubeList.add(new ModelBox(Neck_r29, 47, 36, -7.3791F, -3.5487F, -0.3809F, 4, 0, 1, 0.0F, true));

        this.Neck_r30 = new ModelRenderer(this);
        this.Neck_r30.setRotationPoint(-0.4693F, -0.3186F, -9.4016F);
        this.Belly.addChild(Neck_r30);
        this.setRotateAngle(Neck_r30, 0.0794F, -0.0987F, -0.6759F);
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 9, 35, -4.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, true));

        this.Neck_r31 = new ModelRenderer(this);
        this.Neck_r31.setRotationPoint(-0.4693F, -0.3186F, -9.4016F);
        this.Belly.addChild(Neck_r31);
        this.setRotateAngle(Neck_r31, 0.0237F, -0.1244F, -0.1848F);
        this.Neck_r31.cubeList.add(new ModelBox(Neck_r31, 54, 40, -2.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, true));

        this.Neck_r32 = new ModelRenderer(this);
        this.Neck_r32.setRotationPoint(0.4693F, -0.1186F, -1.4016F);
        this.Belly.addChild(Neck_r32);
        this.setRotateAngle(Neck_r32, -0.0216F, 0.0274F, 0.8462F);
        this.Neck_r32.cubeList.add(new ModelBox(Neck_r32, 0, 18, 1.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, false));

        this.Neck_r33 = new ModelRenderer(this);
        this.Neck_r33.setRotationPoint(0.4693F, -0.1186F, -1.4016F);
        this.Belly.addChild(Neck_r33);
        this.setRotateAngle(Neck_r33, 0.0216F, 0.0444F, 1.4569F);
        this.Neck_r33.cubeList.add(new ModelBox(Neck_r33, 54, 4, 3.3791F, -3.5487F, -0.3809F, 2, 0, 1, 0.0F, false));

        this.Neck_r34 = new ModelRenderer(this);
        this.Neck_r34.setRotationPoint(0.4693F, -0.1186F, -1.4016F);
        this.Belly.addChild(Neck_r34);
        this.setRotateAngle(Neck_r34, -0.032F, 0.014F, 0.3576F);
        this.Neck_r34.cubeList.add(new ModelBox(Neck_r34, 30, 53, 0.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, false));

        this.Neck_r35 = new ModelRenderer(this);
        this.Neck_r35.setRotationPoint(0.4693F, -0.1186F, -3.4016F);
        this.Belly.addChild(Neck_r35);
        this.setRotateAngle(Neck_r35, 0.0019F, 0.0018F, 0.7592F);
        this.Neck_r35.cubeList.add(new ModelBox(Neck_r35, 26, 9, 1.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, false));

        this.Neck_r36 = new ModelRenderer(this);
        this.Neck_r36.setRotationPoint(0.4693F, -0.1186F, -3.4016F);
        this.Belly.addChild(Neck_r36);
        this.setRotateAngle(Neck_r36, 0.0262F, 0.0099F, 1.3697F);
        this.Neck_r36.cubeList.add(new ModelBox(Neck_r36, 0, 20, 3.3791F, -3.5487F, -0.3809F, 3, 0, 1, 0.0F, false));

        this.Neck_r37 = new ModelRenderer(this);
        this.Neck_r37.setRotationPoint(0.4693F, -0.1186F, -3.4016F);
        this.Belly.addChild(Neck_r37);
        this.setRotateAngle(Neck_r37, 0.0008F, 0.0025F, 0.2706F);
        this.Neck_r37.cubeList.add(new ModelBox(Neck_r37, 54, 19, 0.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, false));

        this.Neck_r38 = new ModelRenderer(this);
        this.Neck_r38.setRotationPoint(0.4693F, -0.2186F, -5.4016F);
        this.Belly.addChild(Neck_r38);
        this.setRotateAngle(Neck_r38, 0.0031F, 0.0032F, 0.672F);
        this.Neck_r38.cubeList.add(new ModelBox(Neck_r38, 9, 33, 1.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, false));

        this.Neck_r39 = new ModelRenderer(this);
        this.Neck_r39.setRotationPoint(0.4693F, -0.2186F, -5.4016F);
        this.Belly.addChild(Neck_r39);
        this.setRotateAngle(Neck_r39, 0.028F, 0.0104F, 1.2825F);
        this.Neck_r39.cubeList.add(new ModelBox(Neck_r39, 29, 16, 3.3791F, -3.5487F, -0.3809F, 3, 0, 1, 0.0F, false));

        this.Neck_r40 = new ModelRenderer(this);
        this.Neck_r40.setRotationPoint(0.4693F, -0.2186F, -5.4016F);
        this.Belly.addChild(Neck_r40);
        this.setRotateAngle(Neck_r40, 0.0013F, 0.0043F, 0.1833F);
        this.Neck_r40.cubeList.add(new ModelBox(Neck_r40, 54, 21, 0.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, false));

        this.Neck_r41 = new ModelRenderer(this);
        this.Neck_r41.setRotationPoint(0.4693F, -0.3186F, -7.4016F);
        this.Belly.addChild(Neck_r41);
        this.setRotateAngle(Neck_r41, -0.0183F, -0.0242F, 0.6635F);
        this.Neck_r41.cubeList.add(new ModelBox(Neck_r41, 34, 24, 1.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, false));

        this.Neck_r42 = new ModelRenderer(this);
        this.Neck_r42.setRotationPoint(0.4693F, -0.3186F, -7.4016F);
        this.Belly.addChild(Neck_r42);
        this.setRotateAngle(Neck_r42, -0.0052F, 0.0002F, 1.2736F);
        this.Neck_r42.cubeList.add(new ModelBox(Neck_r42, 19, 0, 3.3791F, -3.5487F, -0.3809F, 4, 0, 1, 0.0F, false));

        this.Neck_r43 = new ModelRenderer(this);
        this.Neck_r43.setRotationPoint(0.4693F, -0.3186F, -7.4016F);
        this.Belly.addChild(Neck_r43);
        this.setRotateAngle(Neck_r43, -0.0048F, -0.0299F, 0.1747F);
        this.Neck_r43.cubeList.add(new ModelBox(Neck_r43, 54, 38, 0.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, false));

        this.Neck_r44 = new ModelRenderer(this);
        this.Neck_r44.setRotationPoint(0.4693F, -0.3186F, -9.4016F);
        this.Belly.addChild(Neck_r44);
        this.setRotateAngle(Neck_r44, -0.0841F, -0.106F, 0.6765F);
        this.Neck_r44.cubeList.add(new ModelBox(Neck_r44, 9, 35, 1.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, false));

        this.Neck_r45 = new ModelRenderer(this);
        this.Neck_r45.setRotationPoint(0.4693F, -0.3186F, -9.4016F);
        this.Belly.addChild(Neck_r45);
        this.setRotateAngle(Neck_r45, -0.1059F, -0.0293F, 1.2838F);
        this.Neck_r45.cubeList.add(new ModelBox(Neck_r45, 47, 36, 3.3791F, -3.5487F, -0.3809F, 4, 0, 1, 0.0F, false));

        this.Neck_r46 = new ModelRenderer(this);
        this.Neck_r46.setRotationPoint(0.4693F, -0.3186F, -9.4016F);
        this.Belly.addChild(Neck_r46);
        this.setRotateAngle(Neck_r46, -0.0243F, -0.133F, 0.185F);
        this.Neck_r46.cubeList.add(new ModelBox(Neck_r46, 54, 40, 0.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.3885F, -9.8997F);
        this.Belly.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0581F, -0.3048F, -0.0201F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 57, 13, 0.0F, -1.298F, -9.8363F, 0, 1, 1, 0.0F, false));
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 57, 10, 0.0F, -1.298F, -7.8363F, 0, 1, 1, 0.0F, false));
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 56, 56, 0.0F, -1.298F, -5.8363F, 0, 1, 1, 0.0F, false));
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 36, 56, 0.0F, -1.298F, -3.8363F, 0, 1, 1, 0.0F, false));
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 39, 55, 0.0F, -1.298F, -1.8363F, 0, 1, 1, 0.0F, false));
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 12, -0.5F, -0.498F, -9.9363F, 1, 1, 10, 0.001F, false));

        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-4.0F, 4.502F, -8.9363F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.7128F, -0.2635F, 0.6324F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 0, 0, -0.8F, -5.0F, -1.3F, 1, 6, 2, 0.0F, true));
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 36, 0, 0.2F, 0.5F, -1.3F, 4, 1, 3, 0.0F, true));

        this.Bodyfront_r2 = new ModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(4.0F, 4.502F, -8.9363F);
        this.Bodyfront.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, -0.7128F, 0.2635F, -0.6324F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 36, 0, -4.2F, 0.5F, -1.3F, 4, 1, 3, 0.0F, false));
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 0, 0, -0.2F, -5.0F, -1.3F, 1, 6, 2, 0.0F, false));

        this.Neck_r47 = new ModelRenderer(this);
        this.Neck_r47.setRotationPoint(-0.4693F, 0.0719F, -1.4383F);
        this.Bodyfront.addChild(Neck_r47);
        this.setRotateAngle(Neck_r47, -0.0685F, 0.0152F, -1.3003F);
        this.Neck_r47.cubeList.add(new ModelBox(Neck_r47, 48, 0, -7.3791F, -3.5487F, -0.3809F, 4, 0, 1, 0.0F, true));

        this.Neck_r48 = new ModelRenderer(this);
        this.Neck_r48.setRotationPoint(-0.4693F, 0.0719F, -1.4383F);
        this.Bodyfront.addChild(Neck_r48);
        this.setRotateAngle(Neck_r48, -0.0614F, 0.073F, -0.6918F);
        this.Neck_r48.cubeList.add(new ModelBox(Neck_r48, 36, 5, -4.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, true));

        this.Neck_r49 = new ModelRenderer(this);
        this.Neck_r49.setRotationPoint(-0.4693F, 0.0719F, -1.4383F);
        this.Bodyfront.addChild(Neck_r49);
        this.setRotateAngle(Neck_r49, -0.0198F, 0.0933F, -0.2018F);
        this.Neck_r49.cubeList.add(new ModelBox(Neck_r49, 55, 8, -2.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, true));

        this.Neck_r50 = new ModelRenderer(this);
        this.Neck_r50.setRotationPoint(-0.4693F, 0.0719F, -3.4383F);
        this.Bodyfront.addChild(Neck_r50);
        this.setRotateAngle(Neck_r50, -0.0018F, 0.0053F, -0.2619F);
        this.Neck_r50.cubeList.add(new ModelBox(Neck_r50, 30, 55, -2.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, true));

        this.Neck_r51 = new ModelRenderer(this);
        this.Neck_r51.setRotationPoint(-0.4693F, 0.0719F, -3.4383F);
        this.Bodyfront.addChild(Neck_r51);
        this.setRotateAngle(Neck_r51, -0.004F, 0.0038F, -0.7506F);
        this.Neck_r51.cubeList.add(new ModelBox(Neck_r51, 33, 38, -4.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, true));

        this.Neck_r52 = new ModelRenderer(this);
        this.Neck_r52.setRotationPoint(-0.4693F, 0.0719F, -3.4383F);
        this.Bodyfront.addChild(Neck_r52);
        this.setRotateAngle(Neck_r52, 0.0182F, -0.0088F, -1.361F);
        this.Neck_r52.cubeList.add(new ModelBox(Neck_r52, 33, 36, -6.3791F, -3.5487F, -0.3809F, 3, 0, 1, 0.0F, true));

        this.Neck_r53 = new ModelRenderer(this);
        this.Neck_r53.setRotationPoint(-0.4693F, 0.0719F, -5.4383F);
        this.Bodyfront.addChild(Neck_r53);
        this.setRotateAngle(Neck_r53, 0.0236F, -0.0096F, -1.4919F);
        this.Neck_r53.cubeList.add(new ModelBox(Neck_r53, 0, 33, -4.3791F, -3.5487F, -0.3809F, 1, 0, 1, 0.0F, true));

        this.Neck_r54 = new ModelRenderer(this);
        this.Neck_r54.setRotationPoint(-0.4693F, 0.0719F, -5.4383F);
        this.Bodyfront.addChild(Neck_r54);
        this.setRotateAngle(Neck_r54, 0.0F, 0.0F, -0.8814F);
        this.Neck_r54.cubeList.add(new ModelBox(Neck_r54, 51, 2, -4.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, true));

        this.Neck_r55 = new ModelRenderer(this);
        this.Neck_r55.setRotationPoint(-0.4693F, 0.0719F, -5.4383F);
        this.Bodyfront.addChild(Neck_r55);
        this.setRotateAngle(Neck_r55, 0.0F, 0.0F, -0.3927F);
        this.Neck_r55.cubeList.add(new ModelBox(Neck_r55, 55, 48, -2.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, true));

        this.Neck_r56 = new ModelRenderer(this);
        this.Neck_r56.setRotationPoint(-0.5F, 0.102F, -7.4363F);
        this.Bodyfront.addChild(Neck_r56);
        this.setRotateAngle(Neck_r56, 0.0F, 0.0F, -0.3927F);
        this.Neck_r56.cubeList.add(new ModelBox(Neck_r56, 56, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Neck_r57 = new ModelRenderer(this);
        this.Neck_r57.setRotationPoint(-0.5F, 0.102F, -9.4363F);
        this.Bodyfront.addChild(Neck_r57);
        this.setRotateAngle(Neck_r57, 0.0F, 0.0F, -0.8814F);
        this.Neck_r57.cubeList.add(new ModelBox(Neck_r57, 34, 18, -2.7659F, -0.9389F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Neck_r58 = new ModelRenderer(this);
        this.Neck_r58.setRotationPoint(-0.5F, 0.102F, -9.4363F);
        this.Bodyfront.addChild(Neck_r58);
        this.setRotateAngle(Neck_r58, 0.0F, 0.0F, -0.3927F);
        this.Neck_r58.cubeList.add(new ModelBox(Neck_r58, 56, 24, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Neck_r59 = new ModelRenderer(this);
        this.Neck_r59.setRotationPoint(0.4693F, 0.0719F, -1.4383F);
        this.Bodyfront.addChild(Neck_r59);
        this.setRotateAngle(Neck_r59, 0.0327F, 0.1632F, 0.2036F);
        this.Neck_r59.cubeList.add(new ModelBox(Neck_r59, 55, 8, 0.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, false));

        this.Neck_r60 = new ModelRenderer(this);
        this.Neck_r60.setRotationPoint(0.4693F, 0.0719F, -1.4383F);
        this.Bodyfront.addChild(Neck_r60);
        this.setRotateAngle(Neck_r60, 0.1059F, 0.1287F, 0.6965F);
        this.Neck_r60.cubeList.add(new ModelBox(Neck_r60, 36, 5, 1.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, false));

        this.Neck_r61 = new ModelRenderer(this);
        this.Neck_r61.setRotationPoint(0.4693F, 0.0719F, -1.4383F);
        this.Bodyfront.addChild(Neck_r61);
        this.setRotateAngle(Neck_r61, 0.184F, 0.0545F, 1.3053F);
        this.Neck_r61.cubeList.add(new ModelBox(Neck_r61, 48, 0, 3.3791F, -3.5487F, -0.3809F, 4, 0, 1, 0.0F, false));

        this.Neck_r62 = new ModelRenderer(this);
        this.Neck_r62.setRotationPoint(0.4693F, 0.0719F, -3.4383F);
        this.Bodyfront.addChild(Neck_r62);
        this.setRotateAngle(Neck_r62, 0.0163F, 0.0622F, 0.2624F);
        this.Neck_r62.cubeList.add(new ModelBox(Neck_r62, 30, 55, 0.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, false));

        this.Neck_r63 = new ModelRenderer(this);
        this.Neck_r63.setRotationPoint(0.4693F, 0.0719F, -3.4383F);
        this.Bodyfront.addChild(Neck_r63);
        this.setRotateAngle(Neck_r63, 0.0436F, 0.0472F, 0.7517F);
        this.Neck_r63.cubeList.add(new ModelBox(Neck_r63, 33, 38, 1.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, false));

        this.Neck_r64 = new ModelRenderer(this);
        this.Neck_r64.setRotationPoint(0.4693F, 0.0719F, -3.4383F);
        this.Bodyfront.addChild(Neck_r64);
        this.setRotateAngle(Neck_r64, 0.0865F, 0.0233F, 1.3621F);
        this.Neck_r64.cubeList.add(new ModelBox(Neck_r64, 33, 36, 3.3791F, -3.5487F, -0.3809F, 3, 0, 1, 0.0F, false));

        this.Neck_r65 = new ModelRenderer(this);
        this.Neck_r65.setRotationPoint(0.4693F, 0.0719F, -5.4383F);
        this.Bodyfront.addChild(Neck_r65);
        this.setRotateAngle(Neck_r65, 0.0F, 0.0F, 0.3927F);
        this.Neck_r65.cubeList.add(new ModelBox(Neck_r65, 55, 48, 0.0399F, 0.0161F, -0.4981F, 2, 0, 1, 0.0F, false));

        this.Neck_r66 = new ModelRenderer(this);
        this.Neck_r66.setRotationPoint(0.4693F, 0.0719F, -5.4383F);
        this.Bodyfront.addChild(Neck_r66);
        this.setRotateAngle(Neck_r66, 0.0236F, 0.0096F, 1.4919F);
        this.Neck_r66.cubeList.add(new ModelBox(Neck_r66, 0, 33, 3.3791F, -3.5487F, -0.3809F, 1, 0, 1, 0.0F, false));

        this.Neck_r67 = new ModelRenderer(this);
        this.Neck_r67.setRotationPoint(0.4693F, 0.0719F, -5.4383F);
        this.Bodyfront.addChild(Neck_r67);
        this.setRotateAngle(Neck_r67, 0.0F, 0.0F, 0.8814F);
        this.Neck_r67.cubeList.add(new ModelBox(Neck_r67, 51, 2, 1.8087F, -0.9435F, -0.4981F, 3, 0, 1, 0.0F, false));

        this.Neck_r68 = new ModelRenderer(this);
        this.Neck_r68.setRotationPoint(0.5F, 0.102F, -7.4363F);
        this.Bodyfront.addChild(Neck_r68);
        this.setRotateAngle(Neck_r68, 0.0F, 0.0F, 0.3927F);
        this.Neck_r68.cubeList.add(new ModelBox(Neck_r68, 56, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Neck_r69 = new ModelRenderer(this);
        this.Neck_r69.setRotationPoint(0.5F, 0.102F, -9.4363F);
        this.Bodyfront.addChild(Neck_r69);
        this.setRotateAngle(Neck_r69, 0.0F, 0.0F, 0.8814F);
        this.Neck_r69.cubeList.add(new ModelBox(Neck_r69, 34, 18, 1.7659F, -0.9389F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Neck_r70 = new ModelRenderer(this);
        this.Neck_r70.setRotationPoint(0.5F, 0.102F, -9.4363F);
        this.Bodyfront.addChild(Neck_r70);
        this.setRotateAngle(Neck_r70, 0.0F, 0.0F, 0.3927F);
        this.Neck_r70.cubeList.add(new ModelBox(Neck_r70, 56, 24, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.002F, -9.6363F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, 0.0664F, -0.1076F, -0.0863F);
        this.Neck.cubeList.add(new ModelBox(Neck, 33, 48, -0.5F, -0.5078F, -3.0341F, 1, 1, 3, 0.0F, false));
        this.Neck.cubeList.add(new ModelBox(Neck, 15, 57, 0.0F, -1.1078F, -2.0341F, 0, 1, 1, 0.0F, false));

        this.Neck_r71 = new ModelRenderer(this);
        this.Neck_r71.setRotationPoint(-0.5F, 0.0922F, -1.5341F);
        this.Neck.addChild(Neck_r71);
        this.setRotateAngle(Neck_r71, 0.0F, 0.0F, -0.3927F);
        this.Neck_r71.cubeList.add(new ModelBox(Neck_r71, 0, 35, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Neck_r72 = new ModelRenderer(this);
        this.Neck_r72.setRotationPoint(0.5F, 0.0922F, -1.5341F);
        this.Neck.addChild(Neck_r72);
        this.setRotateAngle(Neck_r72, 0.0F, 0.0F, 0.3927F);
        this.Neck_r72.cubeList.add(new ModelBox(Neck_r72, 0, 35, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, -0.2078F, -2.8341F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.5306F, -0.2054F, 0.0641F);
        this.Head.cubeList.add(new ModelBox(Head, 15, 34, -2.0F, -1.5F, -3.0F, 4, 3, 3, 0.0F, false));

        this.Head_r1 = new ModelRenderer(this);
        this.Head_r1.setRotationPoint(-2.48F, 1.0F, -3.0F);
        this.Head.addChild(Head_r1);
        this.setRotateAngle(Head_r1, -0.2007F, -0.3456F, 0.0497F);
        this.Head_r1.cubeList.add(new ModelBox(Head_r1, 48, 20, 0.5F, -0.9F, -0.5F, 1, 1, 3, 0.0F, true));

        this.Head_r2 = new ModelRenderer(this);
        this.Head_r2.setRotationPoint(2.5F, 1.0F, -3.0F);
        this.Head.addChild(Head_r2);
        this.setRotateAngle(Head_r2, -0.2007F, 0.3456F, -0.0497F);
        this.Head_r2.cubeList.add(new ModelBox(Head_r2, 48, 20, -1.5F, -0.9F, -0.5F, 1, 1, 3, 0.0F, false));

        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, -1.5F, -3.0F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.1485F, 0.0F, 0.0F);
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 45, 30, -2.0F, 0.0F, -2.0F, 4, 3, 2, 0.001F, false));

        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 3.02F, -2.0F);
        this.Upperjawback.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.1061F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 23, 45, -1.5F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.Upperjawfront_r1 = new ModelRenderer(this);
        this.Upperjawfront_r1.setRotationPoint(0.0F, -1.9F, -3.0F);
        this.Upperjawfront.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, 0.3316F, 0.0F, 0.0F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 13, 41, -1.5F, -0.1F, 0.0F, 3, 2, 3, -0.002F, false));

        this.Upperfrontteeth = new ModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, -0.3F, -2.25F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, -0.5095F, 0.0F, 0.0F);


        this.Upperfrontteeth_r1 = new ModelRenderer(this);
        this.Upperfrontteeth_r1.setRotationPoint(-0.48F, 0.3F, -0.2F);
        this.Upperfrontteeth.addChild(Upperfrontteeth_r1);
        this.setRotateAngle(Upperfrontteeth_r1, -0.4127F, 0.7533F, 0.3866F);
        this.Upperfrontteeth_r1.cubeList.add(new ModelBox(Upperfrontteeth_r1, 30, 0, -1.0F, -0.0708F, 0.0F, 1, 1, 0, 0.0F, true));

        this.Upperfrontteeth_r2 = new ModelRenderer(this);
        this.Upperfrontteeth_r2.setRotationPoint(0.5F, 0.3F, -0.2F);
        this.Upperfrontteeth.addChild(Upperfrontteeth_r2);
        this.setRotateAngle(Upperfrontteeth_r2, -0.4127F, -0.7533F, -0.3866F);
        this.Upperfrontteeth_r2.cubeList.add(new ModelBox(Upperfrontteeth_r2, 30, 0, 0.0F, -0.0708F, 0.0F, 1, 1, 0, 0.0F, false));

        this.Upperfrontteeth_r3 = new ModelRenderer(this);
        this.Upperfrontteeth_r3.setRotationPoint(0.0F, 0.8F, -0.4F);
        this.Upperfrontteeth.addChild(Upperfrontteeth_r3);
        this.setRotateAngle(Upperfrontteeth_r3, -0.5672F, 0.0F, 0.0F);
        this.Upperfrontteeth_r3.cubeList.add(new ModelBox(Upperfrontteeth_r3, 17, 30, -0.5F, -0.6F, -0.1F, 1, 1, 0, 0.0F, false));

        this.Rightupperteeth = new ModelRenderer(this);
        this.Rightupperteeth.setRotationPoint(0.94F, -0.5F, -0.4F);
        this.Upperjawfront.addChild(Rightupperteeth);
        this.setRotateAngle(Rightupperteeth, -0.0213F, 0.1485F, 0.0F);
        this.Rightupperteeth.cubeList.add(new ModelBox(Rightupperteeth, 53, 13, 0.4F, 0.0F, -1.3F, 0, 1, 3, 0.0F, false));
        this.Rightupperteeth.cubeList.add(new ModelBox(Rightupperteeth, 53, 13, -2.26F, 0.0F, -1.3F, 0, 1, 3, 0.0F, true));

        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 1.5F, -0.2F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.5149F, 0.0F, 0.0F);


        this.Lowerjawback_r1 = new ModelRenderer(this);
        this.Lowerjawback_r1.setRotationPoint(-2.6169F, 0.7536F, -3.4752F);
        this.Lowerjawback.addChild(Lowerjawback_r1);
        this.setRotateAngle(Lowerjawback_r1, -0.0013F, -0.1014F, 0.0261F);
        this.Lowerjawback_r1.cubeList.add(new ModelBox(Lowerjawback_r1, 0, 12, 0.2035F, -0.8523F, -0.0096F, 1, 2, 3, -0.001F, true));

        this.Lowerjawback_r2 = new ModelRenderer(this);
        this.Lowerjawback_r2.setRotationPoint(-2.6169F, -0.5464F, -3.3752F);
        this.Lowerjawback.addChild(Lowerjawback_r2);
        this.setRotateAngle(Lowerjawback_r2, -0.1759F, -0.101F, 0.0278F);
        this.Lowerjawback_r2.cubeList.add(new ModelBox(Lowerjawback_r2, 48, 39, 0.2271F, -0.1335F, 0.059F, 1, 1, 3, 0.0F, true));

        this.Lowerjawback_r3 = new ModelRenderer(this);
        this.Lowerjawback_r3.setRotationPoint(2.6369F, 0.7536F, -3.4752F);
        this.Lowerjawback.addChild(Lowerjawback_r3);
        this.setRotateAngle(Lowerjawback_r3, -0.0013F, 0.1014F, -0.0261F);
        this.Lowerjawback_r3.cubeList.add(new ModelBox(Lowerjawback_r3, 0, 12, -1.2035F, -0.8523F, -0.0096F, 1, 2, 3, -0.001F, false));

        this.Lowerjawback_r4 = new ModelRenderer(this);
        this.Lowerjawback_r4.setRotationPoint(2.6369F, -0.5464F, -3.3752F);
        this.Lowerjawback.addChild(Lowerjawback_r4);
        this.setRotateAngle(Lowerjawback_r4, -0.1759F, 0.101F, -0.0278F);
        this.Lowerjawback_r4.cubeList.add(new ModelBox(Lowerjawback_r4, 48, 39, -1.2271F, -0.1335F, 0.059F, 1, 1, 3, 0.0F, false));

        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, -0.4645F, -2.3818F);
        this.Lowerjawback.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.0637F, 0.0F, 0.0F);


        this.Lowerjawmiddle_r1 = new ModelRenderer(this);
        this.Lowerjawmiddle_r1.setRotationPoint(-1.6983F, 1.153F, -0.6863F);
        this.Lowerjawmiddle.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, -0.0566F, -0.5736F, 0.0247F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 26, 2, -0.6152F, -1.2488F, -1.6084F, 1, 2, 2, 0.0F, true));
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 0, 24, -0.6152F, -0.7966F, -1.7312F, 1, 2, 2, -0.002F, true));

        this.Lowerjawmiddle_r2 = new ModelRenderer(this);
        this.Lowerjawmiddle_r2.setRotationPoint(1.7183F, 1.153F, -0.6863F);
        this.Lowerjawmiddle.addChild(Lowerjawmiddle_r2);
        this.setRotateAngle(Lowerjawmiddle_r2, -0.0566F, 0.5736F, -0.0247F);
        this.Lowerjawmiddle_r2.cubeList.add(new ModelBox(Lowerjawmiddle_r2, 0, 24, -0.3848F, -0.7966F, -1.7312F, 1, 2, 2, -0.002F, false));
        this.Lowerjawmiddle_r2.cubeList.add(new ModelBox(Lowerjawmiddle_r2, 26, 2, -0.3848F, -1.2488F, -1.6084F, 1, 2, 2, 0.0F, false));

        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.1274F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 44, 45, -1.0F, -2.0F, -2.7F, 2, 1, 3, 0.002F, false));

        this.Lowerjawfront_r1 = new ModelRenderer(this);
        this.Lowerjawfront_r1.setRotationPoint(0.0F, -1.0F, -2.7F);
        this.Lowerjawfront.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, -0.5585F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 9, 41, -1.0F, -1.6F, 1.5F, 2, 1, 1, -0.002F, false));

        this.Lowerjawfront_r2 = new ModelRenderer(this);
        this.Lowerjawfront_r2.setRotationPoint(0.0F, -1.0F, -2.7F);
        this.Lowerjawfront.addChild(Lowerjawfront_r2);
        this.setRotateAngle(Lowerjawfront_r2, -0.4887F, 0.0F, 0.0F);
        this.Lowerjawfront_r2.cubeList.add(new ModelBox(Lowerjawfront_r2, 10, 25, -1.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.Rightlowerteeth = new ModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(0.95F, -1.5F, -0.6F);
        this.Lowerjawfront.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, 0.0F, 0.0637F, 0.0F);


        this.Rightlowerteeth_r1 = new ModelRenderer(this);
        this.Rightlowerteeth_r1.setRotationPoint(-1.88F, -0.5F, 0.0F);
        this.Rightlowerteeth.addChild(Rightlowerteeth_r1);
        this.setRotateAngle(Rightlowerteeth_r1, 0.0F, -0.3054F, 0.0F);
        this.Rightlowerteeth_r1.cubeList.add(new ModelBox(Rightlowerteeth_r1, 52, 25, -0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.Rightlowerteeth_r2 = new ModelRenderer(this);
        this.Rightlowerteeth_r2.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Rightlowerteeth.addChild(Rightlowerteeth_r2);
        this.setRotateAngle(Rightlowerteeth_r2, 0.0F, 0.3054F, 0.0F);
        this.Rightlowerteeth_r2.cubeList.add(new ModelBox(Rightlowerteeth_r2, 52, 25, 0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.Lowerfrontteeth = new ModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, -2.0F, -2.1F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, 0.9128F, 0.0F, 0.0F);
        this.Lowerfrontteeth.cubeList.add(new ModelBox(Lowerfrontteeth, 0, 37, -1.0F, -1.2F, -0.4F, 2, 1, 0, 0.0F, false));

        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.3F, 5.062F, -7.4363F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.1173F, -0.0209F, 0.0895F);


        this.Rightupperarm_r1 = new ModelRenderer(this);
        this.Rightupperarm_r1.setRotationPoint(0.6271F, -0.0411F, -0.0971F);
        this.Rightupperarm.addChild(Rightupperarm_r1);
        this.setRotateAngle(Rightupperarm_r1, 0.0F, 0.0F, 0.2094F);
        this.Rightupperarm_r1.cubeList.add(new ModelBox(Rightupperarm_r1, 0, 41, -0.7706F, -0.3206F, -2.1425F, 2, 1, 4, 0.0F, false));
        this.Rightupperarm_r1.cubeList.add(new ModelBox(Rightupperarm_r1, 0, 47, 1.2294F, -0.3206F, -1.1425F, 3, 1, 2, 0.0F, false));

        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(4.408F, 0.992F, -0.5058F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -1.5623F, 0.103F, -0.0489F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 10, 53, 0.5F, 0.5F, -0.5F, 1, 5, 1, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 25, 51, -0.9F, 0.5F, -0.5F, 1, 5, 1, 0.0F, false));

        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.1632F, 5.9005F, 0.0901F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 1.4034F, 0.0043F, -0.1835F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 31, 10, -2.4947F, 0.0F, -3.0014F, 5, 1, 4, 0.0F, false));

        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.3F, 5.062F, -7.4363F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.2429F, -0.5965F, 0.1682F);


        this.Rightupperarm_r2 = new ModelRenderer(this);
        this.Rightupperarm_r2.setRotationPoint(-0.6271F, -0.0411F, -0.0971F);
        this.Leftupperarm.addChild(Rightupperarm_r2);
        this.setRotateAngle(Rightupperarm_r2, 0.0F, 0.0F, -0.2094F);
        this.Rightupperarm_r2.cubeList.add(new ModelBox(Rightupperarm_r2, 39, 24, -1.2294F, -0.3206F, -2.1425F, 2, 1, 4, 0.0F, false));
        this.Rightupperarm_r2.cubeList.add(new ModelBox(Rightupperarm_r2, 46, 9, -4.2294F, -0.3206F, -1.1425F, 3, 1, 2, 0.0F, false));

        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-4.408F, 0.992F, -0.5058F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -1.1417F, -0.1481F, -0.0362F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 5, 51, -1.5F, 0.5F, -0.5F, 1, 5, 1, 0.0F, false));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 0, 51, -0.1F, 0.5F, -0.5F, 1, 5, 1, 0.0F, false));

        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(-0.1632F, 5.9005F, 0.0901F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 1.2973F, 0.1497F, 0.0903F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 17, 28, -2.5053F, 0.0F, -3.0014F, 5, 1, 4, 0.0F, false));

        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(-1.0F, 0.1401F, 15.8217F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.4038F, 0.3276F, -0.1225F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 43, 42, 0.0F, -1.2381F, 1.122F, 0, 1, 1, 0.0F, false));
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 0, 41, 0.0F, -1.2381F, 3.122F, 0, 1, 1, 0.0F, false));

        this.Tailbase_r1 = new ModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, 0.5619F, 1.622F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, 0.5236F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 7, 0, 0.0F, 1.2F, 1.5F, 0, 3, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 13, 14, 0.0F, 0.4F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Tailbase_r2 = new ModelRenderer(this);
        this.Tailbase_r2.setRotationPoint(0.0F, -0.0381F, 0.022F);
        this.Tailbase.addChild(Tailbase_r2);
        this.setRotateAngle(Tailbase_r2, 0.0F, 0.0F, 0.0F);
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 0, 33, -0.5F, -0.5F, 0.1F, 1, 1, 5, 0.0F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.1381F, 5.022F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, -0.1915F, 0.4354F, 0.0297F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 36, 0, 0.0F, -1.0988F, 0.0382F, 0, 1, 1, 0.0F, false));
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 27, 34, 0.0F, -1.0988F, 2.0382F, 0, 1, 1, 0.0F, false));
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 32, 28, 0.0F, -1.0988F, 4.0382F, 0, 1, 1, 0.0F, false));
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 30, 28, -0.5F, -0.3988F, 0.0382F, 1, 1, 6, 0.001F, false));

        this.Tailbase_r3 = new ModelRenderer(this);
        this.Tailbase_r3.setRotationPoint(0.0F, 0.7012F, -3.3618F);
        this.Tailmiddlebase.addChild(Tailbase_r3);
        this.setRotateAngle(Tailbase_r3, 0.5236F, 0.0F, 0.0F);
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 29, 57, 0.0F, 3.9F, 7.5F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 7, 5, 0.0F, 2.6F, 5.5F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 10, 24, 0.0F, 2.4F, 3.5F, 0, 2, 1, 0.0F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.0988F, 5.8382F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.2319F, 0.5982F, 0.1322F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 1, 25, -0.5F, -0.2913F, 0.0471F, 1, 1, 6, 0.0F, false));
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 13, 0, 0.0F, -0.8913F, 0.0471F, 0, 1, 1, 0.0F, false));
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 6, 12, 0.0F, -0.6913F, 2.0471F, 0, 1, 1, 0.0F, false));
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 0, 12, 0.0F, -0.4913F, 4.0471F, 0, 1, 1, 0.0F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.1087F, 6.0471F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.172F, 0.6502F, 0.0811F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 26, 0, -0.5F, -0.3966F, -0.1364F, 1, 1, 7, 0.001F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.3F, 4.1201F, 13.0217F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.7437F, -0.241F, -0.0807F);


        this.Rightthigh_r1 = new ModelRenderer(this);
        this.Rightthigh_r1.setRotationPoint(-0.3086F, -1.0452F, 0.0464F);
        this.Rightthigh.addChild(Rightthigh_r1);
        this.setRotateAngle(Rightthigh_r1, 0.0F, 0.0F, 0.2182F);
        this.Rightthigh_r1.cubeList.add(new ModelBox(Rightthigh_r1, 43, 5, 1.5F, -0.42F, -1.0F, 4, 1, 2, 0.0F, false));
        this.Rightthigh_r1.cubeList.add(new ModelBox(Rightthigh_r1, 34, 42, -0.5F, -0.42F, -2.0F, 2, 1, 4, 0.0F, false));

        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(5.6914F, 0.7348F, 0.7464F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.8401F, -1.1357F, 0.0474F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 52, 50, -0.4924F, -0.1059F, -1.9367F, 1, 5, 1, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 20, 51, -0.4924F, -0.1059F, -0.4367F, 1, 5, 1, 0.0F, false));

        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.7076F, 4.8941F, -0.4367F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.9558F, -0.6336F, 1.8689F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 18, 21, -2.6225F, 0.0446F, -3.7312F, 5, 1, 5, 0.0F, false));

        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-4.3F, 4.1201F, 13.0217F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.8807F, -0.1319F, -0.0952F);


        this.Rightthigh_r2 = new ModelRenderer(this);
        this.Rightthigh_r2.setRotationPoint(0.3086F, -1.0452F, 0.0464F);
        this.Leftthigh.addChild(Rightthigh_r2);
        this.setRotateAngle(Rightthigh_r2, 0.0F, 0.0F, -0.2182F);
        this.Rightthigh_r2.cubeList.add(new ModelBox(Rightthigh_r2, 42, 16, -5.5F, -0.42F, -1.0F, 4, 1, 2, 0.0F, false));
        this.Rightthigh_r2.cubeList.add(new ModelBox(Rightthigh_r2, 38, 36, -1.5F, -0.42F, -2.0F, 2, 1, 4, 0.0F, false));

        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-5.6914F, 0.7348F, 0.7464F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.5213F, 0.579F, -0.291F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 47, 50, -0.5076F, -0.1059F, -1.9367F, 1, 5, 1, 0.0F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 42, 50, -0.5076F, -0.1059F, -0.4367F, 1, 5, 1, 0.0F, false));

        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(-0.7076F, 4.8941F, -0.4367F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -1.4648F, 0.2184F, -2.0197F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 13, 14, -2.3775F, 0.0446F, -3.7312F, 5, 1, 5, 0.0F, false));

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
