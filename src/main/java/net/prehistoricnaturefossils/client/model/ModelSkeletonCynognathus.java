package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCynognathus extends ModelBase {
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
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Bodyfront_r2;
    private final ModelRenderer Bodyfront_r3;
    private final ModelRenderer Bodyfront_r4;
    private final ModelRenderer Belly;
    private final ModelRenderer Belly_r1;
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
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r17;
    private final ModelRenderer Bodyfront_r18;
    private final ModelRenderer Bodyfront_r19;
    private final ModelRenderer Bodyfront_r20;
    private final ModelRenderer Bodyfront_r21;
    private final ModelRenderer Bodyfront_r22;
    private final ModelRenderer Bodyfront_r23;
    private final ModelRenderer Bodyfront_r24;
    private final ModelRenderer Bodyfront_r25;
    private final ModelRenderer Bodyfront_r26;
    private final ModelRenderer Bodyfront_r27;
    private final ModelRenderer Bodyfront_r28;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Neck;
    private final ModelRenderer Neck_r1;
    private final ModelRenderer Neck_r2;
    private final ModelRenderer Neck_r3;
    private final ModelRenderer Neck_r4;
    private final ModelRenderer Neck_r5;
    private final ModelRenderer Head;
    private final ModelRenderer Head_r1;
    private final ModelRenderer Head_r2;
    private final ModelRenderer Head_r3;
    private final ModelRenderer Head_r4;
    private final ModelRenderer Head_r5;
    private final ModelRenderer Head_r6;
    private final ModelRenderer Head_r7;
    private final ModelRenderer Head_r8;
    private final ModelRenderer Head_r9;
    private final ModelRenderer Head_r10;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Nose;
    private final ModelRenderer Innernoseslope;
    private final ModelRenderer Upperfrontteeth;
    private final ModelRenderer Rightupperfang;
    private final ModelRenderer Leftupperfang;
    private final ModelRenderer Upperjawteeth;
    private final ModelRenderer Lefteye;
    private final ModelRenderer Righteye;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawback_r1;
    private final ModelRenderer Lowerjawback_r2;
    private final ModelRenderer Lowerjawback_r3;
    private final ModelRenderer Lowerjawmiddleback;
    private final ModelRenderer Lowerjawmiddlefront;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerjawfront_r1;
    private final ModelRenderer Lowerfrontteeth;
    private final ModelRenderer Lowerfrontteeth_r1;
    private final ModelRenderer Lowerfrontteeth2;
    private final ModelRenderer Lowerfrontteeth_r2;
    private final ModelRenderer Lowerfrontteeth_r3;
    private final ModelRenderer Lowerjawteeth;
    private final ModelRenderer Lowerjawbackslope;
    private final ModelRenderer Lowerjawbackslope_r1;
    private final ModelRenderer Lowerjawmiddleslope;
    private final ModelRenderer Headslope;
    private final ModelRenderer Headslope_r1;
    private final ModelRenderer Forehead;
    private final ModelRenderer Neckmuscles;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailend;

    public ModelSkeletonCynognathus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 8.0F, 11.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.4988F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 19, 20, -1.0F, 0.5F, -5.0F, 2, 2, 10, 0.002F, false));
        this.Hips.cubeList.add(new ModelBox(Hips, 29, 33, 2.0F, 2.0F, -2.0F, 1, 2, 7, 0.0F, false));
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 30, -1.5F, 6.9082F, -1.6098F, 3, 1, 6, 0.0F, false));
        this.Hips.cubeList.add(new ModelBox(Hips, 29, 33, -3.0F, 2.0F, -2.0F, 1, 2, 7, 0.0F, true));
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 30, -1.5F, 6.9082F, -1.6098F, 3, 1, 6, 0.0F, true));

        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-2.1F, 4.9F, 1.4F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.0043F, 0.0301F, -0.2864F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 11, 43, -0.5545F, 0.0244F, -3.0081F, 1, 3, 6, 0.0F, true));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(-2.5F, 3.9F, 1.4F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.0057F, 0.0345F, -0.3299F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 55, 45, -0.5F, 0.1F, -2.4F, 1, 1, 3, 0.0F, true));

        this.Hips_r3 = new ModelRenderer(this);
        this.Hips_r3.setRotationPoint(-2.5F, 2.0F, -1.9F);
        this.Hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.3054F, 0.0F, 0.0F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 12, 33, -0.5F, -1.9764F, -0.0938F, 1, 2, 7, -0.002F, true));
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 12, 33, 4.5F, -1.9764F, -0.0938F, 1, 2, 7, -0.002F, false));

        this.Hips_r4 = new ModelRenderer(this);
        this.Hips_r4.setRotationPoint(2.1F, 4.9F, 1.4F);
        this.Hips.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, -0.0043F, -0.0301F, 0.2864F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 11, 43, -0.4455F, 0.0244F, -3.0081F, 1, 3, 6, 0.0F, false));

        this.Hips_r5 = new ModelRenderer(this);
        this.Hips_r5.setRotationPoint(2.5F, 3.9F, 1.4F);
        this.Hips.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, -0.0057F, -0.0345F, 0.3299F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 55, 45, -0.5F, 0.1F, -2.4F, 1, 1, 3, 0.0F, false));

        this.Hips_r6 = new ModelRenderer(this);
        this.Hips_r6.setRotationPoint(-1.5F, 2.0F, 1.5F);
        this.Hips.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, 0.0172F, 0.1711F, 1.6049F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 29, 33, -0.5F, -1.4F, -3.5F, 1, 2, 7, 0.0F, true));

        this.Hips_r7 = new ModelRenderer(this);
        this.Hips_r7.setRotationPoint(1.5F, 2.0F, 1.5F);
        this.Hips.addChild(Hips_r7);
        this.setRotateAngle(Hips_r7, 0.0172F, -0.1711F, -1.6049F);
        this.Hips_r7.cubeList.add(new ModelBox(Hips_r7, 29, 33, -0.5F, -1.4F, -3.5F, 1, 2, 7, 0.0F, false));

        this.Hips_r8 = new ModelRenderer(this);
        this.Hips_r8.setRotationPoint(0.0F, 9.5445F, -3.7692F);
        this.Hips.addChild(Hips_r8);
        this.setRotateAngle(Hips_r8, 0.2531F, 0.0F, 0.0F);
        this.Hips_r8.cubeList.add(new ModelBox(Hips_r8, 0, 73, -3.0F, -2.1488F, -0.3586F, 6, 2, 3, 0.0F, false));

        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-1.0F, 1.5188F, -6.5934F);
        this.Hips.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.021F, -0.0666F, -1.2647F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 29, 15, -2.4824F, -1.2504F, 1.7874F, 1, 0, 1, 0.0F, true));

        this.Bodyfront_r2 = new ModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(-1.0F, 1.5188F, -6.5934F);
        this.Hips.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, -0.0572F, -0.04F, -0.6097F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 39, 38, -1.9373F, -0.0896F, 1.7874F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r3 = new ModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(1.0F, 1.5188F, -6.5934F);
        this.Hips.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, -0.021F, 0.0666F, 1.2647F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 29, 15, 1.4824F, -1.2504F, 1.7874F, 1, 0, 1, 0.0F, false));

        this.Bodyfront_r4 = new ModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(1.0F, 1.5188F, -6.5934F);
        this.Hips.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, -0.0572F, 0.04F, 0.6097F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 39, 38, -0.0627F, -0.0896F, 1.7874F, 2, 0, 1, 0.0F, false));

        this.Belly = new ModelRenderer(this);
        this.Belly.setRotationPoint(0.0F, -0.3F, -6.0F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.0848F, 0.0F, 0.0F);
        this.Belly.cubeList.add(new ModelBox(Belly, 0, 15, -1.0F, 0.7999F, -10.9936F, 2, 2, 12, 0.0F, false));

        this.Belly_r1 = new ModelRenderer(this);
        this.Belly_r1.setRotationPoint(0.0F, 9.8445F, 2.2308F);
        this.Belly.addChild(Belly_r1);
        this.setRotateAngle(Belly_r1, 0.0873F, 0.0F, 0.0F);
        this.Belly_r1.cubeList.add(new ModelBox(Belly_r1, 0, 0, -4.0F, -2.0318F, -13.0493F, 8, 2, 12, 0.0F, false));

        this.Bodyfront_r5 = new ModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(-1.0F, 1.9592F, -2.4909F);
        this.Belly.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, -0.0158F, -0.0499F, -1.265F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 17, 25, -4.596F, -1.2146F, -0.5033F, 3, 0, 1, 0.0F, true));

        this.Bodyfront_r6 = new ModelRenderer(this);
        this.Bodyfront_r6.setRotationPoint(-1.0F, 1.8188F, -0.5934F);
        this.Belly.addChild(Bodyfront_r6);
        this.setRotateAngle(Bodyfront_r6, -0.0572F, -0.04F, -0.6097F);
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 10, 38, -2.0617F, 0.0882F, -0.4012F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r7 = new ModelRenderer(this);
        this.Bodyfront_r7.setRotationPoint(-1.0F, 1.8188F, -0.5934F);
        this.Belly.addChild(Bodyfront_r7);
        this.setRotateAngle(Bodyfront_r7, -0.021F, -0.0666F, -1.2647F);
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 61, 45, -3.6893F, -1.1852F, -0.4012F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r8 = new ModelRenderer(this);
        this.Bodyfront_r8.setRotationPoint(-1.0F, 1.9592F, -2.4909F);
        this.Belly.addChild(Bodyfront_r8);
        this.setRotateAngle(Bodyfront_r8, -0.0429F, -0.03F, -0.6102F);
        this.Bodyfront_r8.cubeList.add(new ModelBox(Bodyfront_r8, 10, 43, -2.0056F, 0.008F, -0.5033F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r9 = new ModelRenderer(this);
        this.Bodyfront_r9.setRotationPoint(-1.0F, 1.7F, -18.5F);
        this.Belly.addChild(Bodyfront_r9);
        this.setRotateAngle(Bodyfront_r9, 0.0F, 0.0F, -1.2654F);
        this.Bodyfront_r9.cubeList.add(new ModelBox(Bodyfront_r9, 22, 38, -6.6931F, -1.184F, 13.5021F, 5, 0, 1, 0.0F, true));
        this.Bodyfront_r9.cubeList.add(new ModelBox(Bodyfront_r9, 53, 6, -7.7338F, -1.1712F, 11.5025F, 6, 0, 1, 0.0F, true));
        this.Bodyfront_r9.cubeList.add(new ModelBox(Bodyfront_r9, 42, 0, -8.679F, -1.1884F, 9.5008F, 7, 0, 1, 0.0F, true));
        this.Bodyfront_r9.cubeList.add(new ModelBox(Bodyfront_r9, 42, 2, -8.7196F, -1.1756F, 7.5013F, 7, 0, 1, 0.0F, true));

        this.Bodyfront_r10 = new ModelRenderer(this);
        this.Bodyfront_r10.setRotationPoint(-1.0F, 1.7F, -18.5F);
        this.Belly.addChild(Bodyfront_r10);
        this.setRotateAngle(Bodyfront_r10, 0.0F, 0.0F, -0.6109F);
        this.Bodyfront_r10.cubeList.add(new ModelBox(Bodyfront_r10, 35, 43, -2.064F, 0.0914F, 13.5021F, 2, 0, 1, 0.0F, true));
        this.Bodyfront_r10.cubeList.add(new ModelBox(Bodyfront_r10, 10, 47, -2.0884F, 0.1263F, 11.5025F, 2, 0, 1, 0.0F, true));
        this.Bodyfront_r10.cubeList.add(new ModelBox(Bodyfront_r10, 35, 47, -2.0555F, 0.0793F, 9.5008F, 2, 0, 1, 0.0F, true));
        this.Bodyfront_r10.cubeList.add(new ModelBox(Bodyfront_r10, 20, 47, -2.0799F, 0.1142F, 7.5013F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r11 = new ModelRenderer(this);
        this.Bodyfront_r11.setRotationPoint(1.0F, 1.8188F, -0.5934F);
        this.Belly.addChild(Bodyfront_r11);
        this.setRotateAngle(Bodyfront_r11, -0.021F, 0.0666F, 1.2647F);
        this.Bodyfront_r11.cubeList.add(new ModelBox(Bodyfront_r11, 61, 45, 1.6893F, -1.1852F, -0.4012F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r12 = new ModelRenderer(this);
        this.Bodyfront_r12.setRotationPoint(1.0F, 1.8188F, -0.5934F);
        this.Belly.addChild(Bodyfront_r12);
        this.setRotateAngle(Bodyfront_r12, -0.0572F, 0.04F, 0.6097F);
        this.Bodyfront_r12.cubeList.add(new ModelBox(Bodyfront_r12, 10, 38, 0.0617F, 0.0882F, -0.4012F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r13 = new ModelRenderer(this);
        this.Bodyfront_r13.setRotationPoint(1.0F, 1.9592F, -2.4909F);
        this.Belly.addChild(Bodyfront_r13);
        this.setRotateAngle(Bodyfront_r13, -0.0158F, 0.0499F, 1.265F);
        this.Bodyfront_r13.cubeList.add(new ModelBox(Bodyfront_r13, 17, 25, 1.596F, -1.2146F, -0.5033F, 3, 0, 1, 0.0F, false));

        this.Bodyfront_r14 = new ModelRenderer(this);
        this.Bodyfront_r14.setRotationPoint(1.0F, 1.9592F, -2.4909F);
        this.Belly.addChild(Bodyfront_r14);
        this.setRotateAngle(Bodyfront_r14, -0.0429F, 0.03F, 0.6102F);
        this.Bodyfront_r14.cubeList.add(new ModelBox(Bodyfront_r14, 10, 43, 0.0056F, 0.008F, -0.5033F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r15 = new ModelRenderer(this);
        this.Bodyfront_r15.setRotationPoint(1.0F, 1.7F, -18.5F);
        this.Belly.addChild(Bodyfront_r15);
        this.setRotateAngle(Bodyfront_r15, 0.0F, 0.0F, 1.2654F);
        this.Bodyfront_r15.cubeList.add(new ModelBox(Bodyfront_r15, 22, 38, 1.6931F, -1.184F, 13.5021F, 5, 0, 1, 0.0F, false));
        this.Bodyfront_r15.cubeList.add(new ModelBox(Bodyfront_r15, 53, 6, 1.7338F, -1.1712F, 11.5025F, 6, 0, 1, 0.0F, false));
        this.Bodyfront_r15.cubeList.add(new ModelBox(Bodyfront_r15, 42, 0, 1.679F, -1.1884F, 9.5008F, 7, 0, 1, 0.0F, false));
        this.Bodyfront_r15.cubeList.add(new ModelBox(Bodyfront_r15, 42, 2, 1.7196F, -1.1756F, 7.5013F, 7, 0, 1, 0.0F, false));

        this.Bodyfront_r16 = new ModelRenderer(this);
        this.Bodyfront_r16.setRotationPoint(1.0F, 1.7F, -18.5F);
        this.Belly.addChild(Bodyfront_r16);
        this.setRotateAngle(Bodyfront_r16, 0.0F, 0.0F, 0.6109F);
        this.Bodyfront_r16.cubeList.add(new ModelBox(Bodyfront_r16, 35, 43, 0.064F, 0.0914F, 13.5021F, 2, 0, 1, 0.0F, false));
        this.Bodyfront_r16.cubeList.add(new ModelBox(Bodyfront_r16, 10, 47, 0.0884F, 0.1263F, 11.5025F, 2, 0, 1, 0.0F, false));
        this.Bodyfront_r16.cubeList.add(new ModelBox(Bodyfront_r16, 35, 47, 0.0555F, 0.0793F, 9.5008F, 2, 0, 1, 0.0F, false));
        this.Bodyfront_r16.cubeList.add(new ModelBox(Bodyfront_r16, 20, 47, 0.0799F, 0.1142F, 7.5013F, 2, 0, 1, 0.0F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.1F, -10.0F);
        this.Belly.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1073F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 29, 0, -1.0F, 0.8F, -9.0F, 2, 2, 8, 0.002F, false));

        this.Bodyfront_r17 = new ModelRenderer(this);
        this.Bodyfront_r17.setRotationPoint(-1.0F, 1.8419F, -2.7966F);
        this.Bodyfront.addChild(Bodyfront_r17);
        this.setRotateAngle(Bodyfront_r17, -0.0158F, -0.0499F, -1.265F);
        this.Bodyfront_r17.cubeList.add(new ModelBox(Bodyfront_r17, 53, 4, -8.5988F, -1.2137F, -0.2003F, 7, 0, 1, 0.0F, true));

        this.Bodyfront_r18 = new ModelRenderer(this);
        this.Bodyfront_r18.setRotationPoint(-1.0F, 1.8419F, -2.7966F);
        this.Bodyfront.addChild(Bodyfront_r18);
        this.setRotateAngle(Bodyfront_r18, -0.0429F, -0.03F, -0.6102F);
        this.Bodyfront_r18.cubeList.add(new ModelBox(Bodyfront_r18, 18, 53, -2.0073F, 0.0104F, -0.2003F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r19 = new ModelRenderer(this);
        this.Bodyfront_r19.setRotationPoint(-1.0F, 1.8F, -8.5F);
        this.Bodyfront.addChild(Bodyfront_r19);
        this.setRotateAngle(Bodyfront_r19, 0.0F, 0.0F, -0.6109F);
        this.Bodyfront_r19.cubeList.add(new ModelBox(Bodyfront_r19, 53, 26, -2.04F, 0.0571F, 3.5006F, 2, 0, 1, 0.0F, true));
        this.Bodyfront_r19.cubeList.add(new ModelBox(Bodyfront_r19, 59, 27, -2.0486F, 0.0695F, 1.4982F, 2, 0, 1, 0.0F, true));
        this.Bodyfront_r19.cubeList.add(new ModelBox(Bodyfront_r19, 61, 15, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r20 = new ModelRenderer(this);
        this.Bodyfront_r20.setRotationPoint(-1.0F, 1.8F, -8.5F);
        this.Bodyfront.addChild(Bodyfront_r20);
        this.setRotateAngle(Bodyfront_r20, 0.0F, 0.0F, -1.2654F);
        this.Bodyfront_r20.cubeList.add(new ModelBox(Bodyfront_r20, 53, 8, -6.6532F, -1.1966F, 3.5006F, 5, 0, 1, 0.0F, true));
        this.Bodyfront_r20.cubeList.add(new ModelBox(Bodyfront_r20, 27, 47, -2.5867F, -1.2175F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Bodyfront_r21 = new ModelRenderer(this);
        this.Bodyfront_r21.setRotationPoint(1.0F, 1.8419F, -2.7966F);
        this.Bodyfront.addChild(Bodyfront_r21);
        this.setRotateAngle(Bodyfront_r21, -0.0429F, 0.03F, 0.6102F);
        this.Bodyfront_r21.cubeList.add(new ModelBox(Bodyfront_r21, 18, 53, 0.0073F, 0.0104F, -0.2003F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r22 = new ModelRenderer(this);
        this.Bodyfront_r22.setRotationPoint(1.0F, 1.8419F, -2.7966F);
        this.Bodyfront.addChild(Bodyfront_r22);
        this.setRotateAngle(Bodyfront_r22, -0.0158F, 0.0499F, 1.265F);
        this.Bodyfront_r22.cubeList.add(new ModelBox(Bodyfront_r22, 53, 4, 1.5988F, -1.2137F, -0.2003F, 7, 0, 1, 0.0F, false));

        this.Bodyfront_r23 = new ModelRenderer(this);
        this.Bodyfront_r23.setRotationPoint(1.0F, 1.8F, -8.5F);
        this.Bodyfront.addChild(Bodyfront_r23);
        this.setRotateAngle(Bodyfront_r23, 0.0F, 0.0F, 0.6109F);
        this.Bodyfront_r23.cubeList.add(new ModelBox(Bodyfront_r23, 53, 26, 0.04F, 0.0571F, 3.5006F, 2, 0, 1, 0.0F, false));
        this.Bodyfront_r23.cubeList.add(new ModelBox(Bodyfront_r23, 59, 27, 0.0486F, 0.0695F, 1.4982F, 2, 0, 1, 0.0F, false));
        this.Bodyfront_r23.cubeList.add(new ModelBox(Bodyfront_r23, 61, 15, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r24 = new ModelRenderer(this);
        this.Bodyfront_r24.setRotationPoint(1.0F, 1.8F, -8.5F);
        this.Bodyfront.addChild(Bodyfront_r24);
        this.setRotateAngle(Bodyfront_r24, 0.0F, 0.0F, 1.2654F);
        this.Bodyfront_r24.cubeList.add(new ModelBox(Bodyfront_r24, 53, 8, 1.6532F, -1.1966F, 3.5006F, 5, 0, 1, 0.0F, false));
        this.Bodyfront_r24.cubeList.add(new ModelBox(Bodyfront_r24, 56, 36, 1.6676F, -1.192F, 1.4982F, 2, 0, 1, 0.0F, false));
        this.Bodyfront_r24.cubeList.add(new ModelBox(Bodyfront_r24, 27, 47, 1.5867F, -1.2175F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Bodyfront_r25 = new ModelRenderer(this);
        this.Bodyfront_r25.setRotationPoint(-4.0F, 7.7522F, -6.2535F);
        this.Bodyfront.addChild(Bodyfront_r25);
        this.setRotateAngle(Bodyfront_r25, 1.6986F, -0.0283F, 0.2164F);
        this.Bodyfront_r25.cubeList.add(new ModelBox(Bodyfront_r25, 44, 5, -0.3905F, -0.8304F, -0.0902F, 1, 2, 6, 0.0F, true));

        this.Bodyfront_r26 = new ModelRenderer(this);
        this.Bodyfront_r26.setRotationPoint(-4.0F, 7.7522F, -6.2535F);
        this.Bodyfront.addChild(Bodyfront_r26);
        this.setRotateAngle(Bodyfront_r26, 1.6896F, -0.0552F, 0.4331F);
        this.Bodyfront_r26.cubeList.add(new ModelBox(Bodyfront_r26, 20, 43, 0.1095F, -0.8304F, -0.8902F, 4, 2, 1, 0.0F, true));

        this.Bodyfront_r27 = new ModelRenderer(this);
        this.Bodyfront_r27.setRotationPoint(4.0F, 7.7522F, -6.2535F);
        this.Bodyfront.addChild(Bodyfront_r27);
        this.setRotateAngle(Bodyfront_r27, 1.6896F, 0.0552F, -0.4331F);
        this.Bodyfront_r27.cubeList.add(new ModelBox(Bodyfront_r27, 20, 43, -4.1095F, -0.8304F, -0.8902F, 4, 2, 1, 0.0F, false));

        this.Bodyfront_r28 = new ModelRenderer(this);
        this.Bodyfront_r28.setRotationPoint(4.0F, 7.7522F, -6.2535F);
        this.Bodyfront.addChild(Bodyfront_r28);
        this.setRotateAngle(Bodyfront_r28, 1.6986F, 0.0283F, -0.2164F);
        this.Bodyfront_r28.cubeList.add(new ModelBox(Bodyfront_r28, 44, 5, -0.6095F, -0.8304F, -0.0902F, 1, 2, 6, 0.0F, false));

        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.5F, 7.6F, -5.8F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.5445F, 0.2634F, -0.406F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 13, 30, -0.5F, 0.6F, 0.0F, 1, 4, 1, 0.0F, false));
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 58, 50, -0.5F, -0.4F, -0.5F, 1, 1, 2, 0.0F, false));

        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.4737F, 4.4099F, 0.647F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.2301F, 0.0359F, 0.4829F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 14, 61, -0.0207F, -0.015F, -0.9005F, 1, 5, 1, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 0, 38, -1.0211F, -0.1038F, -0.9374F, 1, 5, 1, -0.2F, false));

        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 5.0F, -0.3F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 1.8527F, -0.0539F, 0.0192F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 49, 20, -2.0113F, -0.0999F, -3.5044F, 4, 1, 4, 0.0F, false));

        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.5F, 7.6F, -5.8F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.3231F, 0.1638F, 0.4532F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 0, 30, -0.5F, 0.6F, 0.0F, 1, 4, 1, 0.0F, false));
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 42, 4, -0.5F, -0.4F, -0.5F, 1, 1, 2, 0.0F, false));

        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.4737F, 4.4099F, 0.647F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -1.1905F, -0.0231F, -0.4522F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 9, 59, -0.9793F, -0.015F, -0.9005F, 1, 5, 1, 0.0F, false));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 7, 15, 0.0211F, -0.1038F, -0.9374F, 1, 5, 1, -0.2F, false));

        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 5.0F, -0.3F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 2.3332F, 0.0657F, -0.0067F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 48, 14, -1.9887F, -0.0999F, -3.5044F, 4, 1, 4, 0.0F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.7F, -7.0F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.4497F, 0.2616F, -0.0114F);


        this.Neck_r1 = new ModelRenderer(this);
        this.Neck_r1.setRotationPoint(-1.0F, 2.2737F, -2.5006F);
        this.Neck.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, 0.1693F, -0.0298F, 0.3478F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 0, 0, 0.0F, 0.0076F, -0.5174F, 0, 1, 1, 0.0F, true));

        this.Neck_r2 = new ModelRenderer(this);
        this.Neck_r2.setRotationPoint(-1.0F, 2.9F, -4.4F);
        this.Neck.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, 0.082F, -0.0298F, 0.3478F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 0, 6, -0.1665F, -0.4498F, -0.632F, 0, 1, 1, 0.0F, true));

        this.Neck_r3 = new ModelRenderer(this);
        this.Neck_r3.setRotationPoint(1.0F, 2.2737F, -2.5006F);
        this.Neck.addChild(Neck_r3);
        this.setRotateAngle(Neck_r3, 0.1693F, 0.0298F, -0.3478F);
        this.Neck_r3.cubeList.add(new ModelBox(Neck_r3, 0, 0, 0.0F, 0.0076F, -0.5174F, 0, 1, 1, 0.0F, false));

        this.Neck_r4 = new ModelRenderer(this);
        this.Neck_r4.setRotationPoint(1.0F, 2.9F, -4.4F);
        this.Neck.addChild(Neck_r4);
        this.setRotateAngle(Neck_r4, 0.082F, 0.0298F, -0.3478F);
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 0, 6, 0.1665F, -0.4498F, -0.632F, 0, 1, 1, 0.0F, false));

        this.Neck_r5 = new ModelRenderer(this);
        this.Neck_r5.setRotationPoint(0.0F, 2.0F, -5.5F);
        this.Neck.addChild(Neck_r5);
        this.setRotateAngle(Neck_r5, 0.0873F, 0.0F, 0.0F);
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 0, 48, -1.0F, -1.0F, -0.5F, 2, 2, 5, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 2.2F, -4.9F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.3629F, 0.6096F, 0.089F);


        this.Head_r1 = new ModelRenderer(this);
        this.Head_r1.setRotationPoint(-3.6F, -0.1F, -2.2F);
        this.Head.addChild(Head_r1);
        this.setRotateAngle(Head_r1, 0.1735F, 0.2534F, -0.1953F);
        this.Head_r1.cubeList.add(new ModelBox(Head_r1, 5, 22, 0.06F, -0.6381F, -0.0089F, 1, 2, 2, 0.0F, true));

        this.Head_r2 = new ModelRenderer(this);
        this.Head_r2.setRotationPoint(-3.4274F, 1.1294F, -2.6727F);
        this.Head.addChild(Head_r2);
        this.setRotateAngle(Head_r2, -0.209F, 0.2089F, -0.0899F);
        this.Head_r2.cubeList.add(new ModelBox(Head_r2, 0, 61, 0.0562F, -1.203F, -0.0336F, 1, 2, 2, 0.0F, true));

        this.Head_r3 = new ModelRenderer(this);
        this.Head_r3.setRotationPoint(-2.5F, -1.5F, -4.5F);
        this.Head.addChild(Head_r3);
        this.setRotateAngle(Head_r3, -0.2301F, -0.4738F, 0.0605F);
        this.Head_r3.cubeList.add(new ModelBox(Head_r3, 61, 10, 0.1076F, 0.9563F, 0.4017F, 1, 2, 2, -0.002F, true));

        this.Head_r4 = new ModelRenderer(this);
        this.Head_r4.setRotationPoint(-2.5F, -1.5F, -4.5F);
        this.Head.addChild(Head_r4);
        this.setRotateAngle(Head_r4, 0.0317F, -0.4738F, 0.0605F);
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 61, 36, 0.1076F, -0.0437F, -0.9983F, 1, 2, 2, 0.0F, true));

        this.Head_r5 = new ModelRenderer(this);
        this.Head_r5.setRotationPoint(-2.5F, -1.5F, -4.5F);
        this.Head.addChild(Head_r5);
        this.setRotateAngle(Head_r5, -0.4919F, -0.4738F, 0.0605F);
        this.Head_r5.cubeList.add(new ModelBox(Head_r5, 29, 0, 0.1076F, -0.5328F, 0.894F, 1, 2, 2, 0.002F, true));

        this.Head_r6 = new ModelRenderer(this);
        this.Head_r6.setRotationPoint(3.6F, -0.1F, -2.2F);
        this.Head.addChild(Head_r6);
        this.setRotateAngle(Head_r6, 0.1735F, -0.2534F, 0.1953F);
        this.Head_r6.cubeList.add(new ModelBox(Head_r6, 5, 22, -1.06F, -0.6381F, -0.0089F, 1, 2, 2, 0.0F, false));

        this.Head_r7 = new ModelRenderer(this);
        this.Head_r7.setRotationPoint(2.5F, -1.5F, -4.5F);
        this.Head.addChild(Head_r7);
        this.setRotateAngle(Head_r7, -0.4919F, 0.4738F, -0.0605F);
        this.Head_r7.cubeList.add(new ModelBox(Head_r7, 29, 0, -1.1076F, -0.5328F, 0.894F, 1, 2, 2, 0.002F, false));

        this.Head_r8 = new ModelRenderer(this);
        this.Head_r8.setRotationPoint(2.5F, -1.5F, -4.5F);
        this.Head.addChild(Head_r8);
        this.setRotateAngle(Head_r8, 0.0317F, 0.4738F, -0.0605F);
        this.Head_r8.cubeList.add(new ModelBox(Head_r8, 61, 36, -1.1076F, -0.0437F, -0.9983F, 1, 2, 2, 0.0F, false));

        this.Head_r9 = new ModelRenderer(this);
        this.Head_r9.setRotationPoint(3.4274F, 1.1294F, -2.6727F);
        this.Head.addChild(Head_r9);
        this.setRotateAngle(Head_r9, -0.209F, -0.2089F, 0.0899F);
        this.Head_r9.cubeList.add(new ModelBox(Head_r9, 0, 61, -1.0562F, -1.203F, -0.0336F, 1, 2, 2, 0.0F, false));

        this.Head_r10 = new ModelRenderer(this);
        this.Head_r10.setRotationPoint(2.5F, -1.5F, -4.5F);
        this.Head.addChild(Head_r10);
        this.setRotateAngle(Head_r10, -0.2301F, 0.4738F, -0.0605F);
        this.Head_r10.cubeList.add(new ModelBox(Head_r10, 61, 10, -1.1076F, 0.9563F, 0.4017F, 1, 2, 2, -0.002F, false));

        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, -1.6F, -4.5F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.3183F, 0.0F, 0.0F);
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 41, 47, -2.5F, 0.0F, -3.0F, 5, 3, 3, 0.0F, false));

        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 0.03F, -3.0F);
        this.Upperjawback.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.0213F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 49, 38, -2.0F, 0.0F, -3.0F, 4, 3, 3, 0.0F, false));

        this.Nose = new ModelRenderer(this);
        this.Nose.setRotationPoint(0.0F, 2.0F, -2.7F);
        this.Upperjawfront.addChild(Nose);
        this.setRotateAngle(Nose, 0.1274F, 0.0F, 0.0F);
        this.Nose.cubeList.add(new ModelBox(Nose, 17, 20, -1.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.Innernoseslope = new ModelRenderer(this);
        this.Innernoseslope.setRotationPoint(-0.01F, 0.44F, -2.1F);
        this.Nose.addChild(Innernoseslope);
        this.setRotateAngle(Innernoseslope, -0.2546F, 0.0F, 0.0F);
        this.Innernoseslope.cubeList.add(new ModelBox(Innernoseslope, 52, 54, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.Upperfrontteeth = new ModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, -0.4F, 0.05F);
        this.Innernoseslope.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, 0.2335F, 0.0F, 0.0F);
        this.Upperfrontteeth.cubeList.add(new ModelBox(Upperfrontteeth, 39, 33, -0.8F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));
        this.Upperfrontteeth.cubeList.add(new ModelBox(Upperfrontteeth, 39, 33, -2.2F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.Rightupperfang = new ModelRenderer(this);
        this.Rightupperfang.setRotationPoint(1.1F, 2.4F, -6.5F);
        this.Upperjawback.addChild(Rightupperfang);
        this.setRotateAngle(Rightupperfang, -0.0186F, -0.0182F, -0.1915F);
        this.Rightupperfang.cubeList.add(new ModelBox(Rightupperfang, 34, 22, -0.5F, -1.0F, 0.0F, 1, 3, 1, 0.0F, false));

        this.Leftupperfang = new ModelRenderer(this);
        this.Leftupperfang.setRotationPoint(-1.1F, 2.4F, -6.5F);
        this.Upperjawback.addChild(Leftupperfang);
        this.setRotateAngle(Leftupperfang, -0.0186F, 0.0182F, 0.1915F);
        this.Leftupperfang.cubeList.add(new ModelBox(Leftupperfang, 34, 22, -0.5F, -1.0F, 0.0F, 1, 3, 1, 0.0F, true));

        this.Upperjawteeth = new ModelRenderer(this);
        this.Upperjawteeth.setRotationPoint(-0.01F, 2.8F, -5.4F);
        this.Upperjawback.addChild(Upperjawteeth);
        this.setRotateAngle(Upperjawteeth, 0.1061F, 0.0F, 0.0F);
        this.Upperjawteeth.cubeList.add(new ModelBox(Upperjawteeth, 23, 52, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.Lefteye = new ModelRenderer(this);
        this.Lefteye.setRotationPoint(-1.6F, 1.1F, -1.85F);
        this.Upperjawback.addChild(Lefteye);
        this.setRotateAngle(Lefteye, -0.1274F, -0.0424F, 0.0F);


        this.Righteye = new ModelRenderer(this);
        this.Righteye.setRotationPoint(1.6F, 1.1F, -1.85F);
        this.Upperjawback.addChild(Righteye);
        this.setRotateAngle(Righteye, -0.1274F, 0.0424F, 0.0F);


        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 1.5F, -0.4F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.7854F, 0.0F, 0.0F);


        this.Lowerjawback_r1 = new ModelRenderer(this);
        this.Lowerjawback_r1.setRotationPoint(-3.0F, -1.2273F, -2.5439F);
        this.Lowerjawback.addChild(Lowerjawback_r1);
        this.setRotateAngle(Lowerjawback_r1, 0.0262F, 0.0F, 0.0F);
        this.Lowerjawback_r1.cubeList.add(new ModelBox(Lowerjawback_r1, 32, 15, 0.5F, -0.0788F, 0.0973F, 1, 2, 2, 0.0F, true));
        this.Lowerjawback_r1.cubeList.add(new ModelBox(Lowerjawback_r1, 32, 15, 4.5F, -0.0788F, 0.0973F, 1, 2, 2, 0.0F, false));

        this.Lowerjawback_r2 = new ModelRenderer(this);
        this.Lowerjawback_r2.setRotationPoint(-3.0F, 0.0F, -4.0F);
        this.Lowerjawback.addChild(Lowerjawback_r2);
        this.setRotateAngle(Lowerjawback_r2, 0.7418F, 0.0F, 0.0F);
        this.Lowerjawback_r2.cubeList.add(new ModelBox(Lowerjawback_r2, 12, 53, 0.5F, 0.0F, -1.0F, 1, 2, 3, 0.002F, true));

        this.Lowerjawback_r3 = new ModelRenderer(this);
        this.Lowerjawback_r3.setRotationPoint(3.0F, 1.9449F, -9.7851F);
        this.Lowerjawback.addChild(Lowerjawback_r3);
        this.setRotateAngle(Lowerjawback_r3, 0.7418F, 0.0F, 0.0F);
        this.Lowerjawback_r3.cubeList.add(new ModelBox(Lowerjawback_r3, 12, 53, -1.5F, 2.4744F, 4.5792F, 1, 2, 3, 0.002F, false));

        this.Lowerjawmiddleback = new ModelRenderer(this);
        this.Lowerjawmiddleback.setRotationPoint(0.0F, 0.05F, -4.0F);
        this.Lowerjawback.addChild(Lowerjawmiddleback);
        this.setRotateAngle(Lowerjawmiddleback, 0.3183F, 0.0F, 0.0F);
        this.Lowerjawmiddleback.cubeList.add(new ModelBox(Lowerjawmiddleback, 25, 61, 1.3F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));
        this.Lowerjawmiddleback.cubeList.add(new ModelBox(Lowerjawmiddleback, 25, 61, -2.3F, 0.0F, -2.0F, 1, 2, 2, 0.0F, true));

        this.Lowerjawmiddlefront = new ModelRenderer(this);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 0.0F, -1.6F);
        this.Lowerjawmiddleback.addChild(Lowerjawmiddlefront);
        this.setRotateAngle(Lowerjawmiddlefront, 0.0213F, 0.0F, 0.0F);
        this.Lowerjawmiddlefront.cubeList.add(new ModelBox(Lowerjawmiddlefront, 43, 54, 1.0F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));
        this.Lowerjawmiddlefront.cubeList.add(new ModelBox(Lowerjawmiddlefront, 43, 54, -2.0F, 0.0F, -3.0F, 1, 2, 3, 0.0F, true));

        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 2.09F, -2.9F);
        this.Lowerjawmiddlefront.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.1911F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 32, 61, 0.5F, -2.0F, -1.5F, 1, 2, 2, 0.002F, false));
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 32, 61, -1.5F, -2.0F, -1.5F, 1, 2, 2, 0.002F, true));

        this.Lowerjawfront_r1 = new ModelRenderer(this);
        this.Lowerjawfront_r1.setRotationPoint(0.0F, -2.0F, -2.4F);
        this.Lowerjawfront.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, 0.2967F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 27, 57, -1.5F, 0.2F, -0.1F, 3, 2, 1, 0.0F, false));

        this.Lowerfrontteeth = new ModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.01F, -1.8F, -1.3F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, -0.0213F, 0.0F, 0.0F);


        this.Lowerfrontteeth_r1 = new ModelRenderer(this);
        this.Lowerfrontteeth_r1.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.Lowerfrontteeth.addChild(Lowerfrontteeth_r1);
        this.setRotateAngle(Lowerfrontteeth_r1, 0.1719F, -0.0302F, 0.1719F);
        this.Lowerfrontteeth_r1.cubeList.add(new ModelBox(Lowerfrontteeth_r1, 0, 47, -0.2115F, -2.0653F, -0.7845F, 1, 2, 1, 0.0F, false));

        this.Lowerfrontteeth2 = new ModelRenderer(this);
        this.Lowerfrontteeth2.setRotationPoint(-0.01F, -1.8F, -1.3F);
        this.Lowerjawfront.addChild(Lowerfrontteeth2);
        this.setRotateAngle(Lowerfrontteeth2, -0.0213F, 0.0F, 0.0F);


        this.Lowerfrontteeth_r2 = new ModelRenderer(this);
        this.Lowerfrontteeth_r2.setRotationPoint(3.01F, -0.1951F, -0.5851F);
        this.Lowerfrontteeth2.addChild(Lowerfrontteeth_r2);
        this.setRotateAngle(Lowerfrontteeth_r2, 0.3142F, 0.0F, 0.0F);
        this.Lowerfrontteeth_r2.cubeList.add(new ModelBox(Lowerfrontteeth_r2, 29, 5, -5.21F, -0.8049F, -0.4149F, 2, 1, 1, 0.0F, true));
        this.Lowerfrontteeth_r2.cubeList.add(new ModelBox(Lowerfrontteeth_r2, 29, 5, -3.81F, -0.8049F, -0.4149F, 2, 1, 1, 0.0F, true));

        this.Lowerfrontteeth_r3 = new ModelRenderer(this);
        this.Lowerfrontteeth_r3.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.Lowerfrontteeth2.addChild(Lowerfrontteeth_r3);
        this.setRotateAngle(Lowerfrontteeth_r3, 0.1719F, 0.0302F, -0.1719F);
        this.Lowerfrontteeth_r3.cubeList.add(new ModelBox(Lowerfrontteeth_r3, 0, 47, -0.7885F, -2.0653F, -0.7845F, 1, 2, 1, 0.0F, true));

        this.Lowerjawteeth = new ModelRenderer(this);
        this.Lowerjawteeth.setRotationPoint(0.0F, 0.7F, -4.2F);
        this.Lowerjawmiddleback.addChild(Lowerjawteeth);
        this.setRotateAngle(Lowerjawteeth, 0.1061F, 0.0F, 0.0F);
        this.Lowerjawteeth.cubeList.add(new ModelBox(Lowerjawteeth, 22, 33, -1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.Lowerjawbackslope = new ModelRenderer(this);
        this.Lowerjawbackslope.setRotationPoint(-0.01F, 2.7F, -2.0F);
        this.Lowerjawmiddleback.addChild(Lowerjawbackslope);
        this.setRotateAngle(Lowerjawbackslope, -0.1061F, 0.0F, 0.0F);
        this.Lowerjawbackslope.cubeList.add(new ModelBox(Lowerjawbackslope, 0, 24, 1.3F, -1.0F, 1.3F, 1, 1, 1, 0.001F, false));
        this.Lowerjawbackslope.cubeList.add(new ModelBox(Lowerjawbackslope, 59, 0, 1.3F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
        this.Lowerjawbackslope.cubeList.add(new ModelBox(Lowerjawbackslope, 59, 0, -2.28F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));
        this.Lowerjawbackslope.cubeList.add(new ModelBox(Lowerjawbackslope, 0, 24, -2.28F, -1.0F, 1.3F, 1, 1, 1, 0.001F, true));

        this.Lowerjawbackslope_r1 = new ModelRenderer(this);
        this.Lowerjawbackslope_r1.setRotationPoint(-2.98F, -1.5F, 4.9F);
        this.Lowerjawbackslope.addChild(Lowerjawbackslope_r1);
        this.setRotateAngle(Lowerjawbackslope_r1, 0.4974F, 0.0F, 0.0F);
        this.Lowerjawbackslope_r1.cubeList.add(new ModelBox(Lowerjawbackslope_r1, 18, 57, 0.5F, -1.0627F, -2.8384F, 1, 1, 3, 0.0F, true));
        this.Lowerjawbackslope_r1.cubeList.add(new ModelBox(Lowerjawbackslope_r1, 18, 57, 4.48F, -1.0627F, -2.8384F, 1, 1, 3, 0.0F, false));

        this.Lowerjawmiddleslope = new ModelRenderer(this);
        this.Lowerjawmiddleslope.setRotationPoint(0.01F, 2.78F, -1.55F);
        this.Lowerjawmiddleback.addChild(Lowerjawmiddleslope);
        this.setRotateAngle(Lowerjawmiddleslope, -0.2227F, 0.0F, 0.0F);
        this.Lowerjawmiddleslope.cubeList.add(new ModelBox(Lowerjawmiddleslope, 0, 56, 1.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.Lowerjawmiddleslope.cubeList.add(new ModelBox(Lowerjawmiddleslope, 0, 56, -2.02F, -1.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.Headslope = new ModelRenderer(this);
        this.Headslope.setRotationPoint(-0.01F, -1.5F, -4.5F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.2972F, 0.0F, 0.0F);
        this.Headslope.cubeList.add(new ModelBox(Headslope, 0, 66, -1.0F, -0.7F, 0.0F, 2, 3, 3, 0.0F, false));

        this.Headslope_r1 = new ModelRenderer(this);
        this.Headslope_r1.setRotationPoint(0.0F, -0.2F, 3.5F);
        this.Headslope.addChild(Headslope_r1);
        this.setRotateAngle(Headslope_r1, -0.1309F, 0.0F, 0.0F);
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 49, 29, -3.0F, -0.5F, -0.5F, 6, 5, 1, 0.0F, false));

        this.Forehead = new ModelRenderer(this);
        this.Forehead.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.Headslope.addChild(Forehead);
        this.setRotateAngle(Forehead, 0.2122F, 0.0F, 0.0F);
        this.Forehead.cubeList.add(new ModelBox(Forehead, 17, 15, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.Neckmuscles = new ModelRenderer(this);
        this.Neckmuscles.setRotationPoint(0.0F, -1.0F, 0.3F);
        this.Neck.addChild(Neckmuscles);
        this.setRotateAngle(Neckmuscles, -0.1398F, 0.0F, 0.0F);


        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.1F, 4.5028F, 0.047F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.4296F, 0.0898F, -0.1499F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 36, 52, -0.1F, -0.3969F, -0.9414F, 1, 6, 2, 0.0F, false));

        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.4695F, 5.9968F, -0.3414F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.2319F, -0.0184F, 0.1736F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 47, 60, -0.5F, -0.0992F, -0.4873F, 1, 5, 1, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 42, 60, -0.5F, 0.0787F, 0.9014F, 1, 5, 1, 0.0F, false));

        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 4.7737F, 1.1208F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.1274F, 0.0F, 0.0F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 34, 22, -2.0F, 0.0F, -4.5F, 4, 1, 5, 0.0F, false));

        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.1F, 4.5028F, 0.047F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.6469F, -0.12F, 0.127F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 0, 15, -0.9F, -0.3969F, -0.9414F, 1, 6, 2, 0.0F, false));

        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.4695F, 5.9968F, -0.3414F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.6683F, 0.0184F, -0.1736F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 57, 58, -0.5F, -0.0992F, -0.4873F, 1, 5, 1, 0.0F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 52, 58, -0.5F, 0.0787F, 0.9014F, 1, 5, 1, 0.0F, false));

        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 4.7737F, 1.1208F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.1274F, 0.0F, 0.0F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 34, 15, -2.0F, 0.0F, -4.5F, 4, 1, 5, 0.0F, false));

        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.0983F, 4.4682F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.0194F, -0.2293F, -0.1275F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 26, 43, -0.5F, 0.5F, 0.0F, 1, 2, 6, 0.0F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 1.0668F, 6.1593F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.1541F, -0.2299F, -0.1264F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 0, 38, -0.5F, -0.3997F, -0.0335F, 1, 1, 7, 0.002F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.0796F, 6.8372F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.242F, -0.1636F, -0.0612F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 39, 38, -0.5F, -0.2955F, 0.0847F, 1, 1, 7, 0.0F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.1045F, 6.8847F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.4783F, -0.1733F, -0.0207F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 39, 29, -0.5F, -0.3927F, 0.1144F, 1, 1, 7, 0.002F, false));

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
