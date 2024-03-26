package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCryolophosaurus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Hips_r2;
    private final ModelRenderer Hips_r3;
    private final ModelRenderer Hips_r4;
    private final ModelRenderer Hips_r5;
    private final ModelRenderer Hips_r6;
    private final ModelRenderer Hips_r7;
    private final ModelRenderer Hips_r8;
    private final ModelRenderer Hips_r9;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Hips_r10;
    private final ModelRenderer Hips_r11;
    private final ModelRenderer Hips_r12;
    private final ModelRenderer Hips_r13;
    private final ModelRenderer Hips_r14;
    private final ModelRenderer Hips_r15;
    private final ModelRenderer Hips_r16;
    private final ModelRenderer Hips_r17;
    private final ModelRenderer Hips_r18;
    private final ModelRenderer body;
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
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer chest;
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
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r69;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer head;
    private final ModelRenderer cube_r74;
    private final ModelRenderer immobile;
    private final ModelRenderer immobile2;
    private final ModelRenderer immobile3;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer immobile4;
    private final ModelRenderer cube_r79;
    private final ModelRenderer immobile5;
    private final ModelRenderer immobile6;
    private final ModelRenderer immobile7;
    private final ModelRenderer immobile8;
    private final ModelRenderer immobile9;
    private final ModelRenderer immobile10;
    private final ModelRenderer cube_r80;
    private final ModelRenderer immobile13;
    private final ModelRenderer immobile14;
    private final ModelRenderer cube_r81;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r82;
    private final ModelRenderer immobile11;
    private final ModelRenderer immobile12;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer throatPouch3;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer throatPouch;
    private final ModelRenderer throatPouch2;
    private final ModelRenderer armLeft;
    private final ModelRenderer armLeft2;
    private final ModelRenderer handLeft;
    private final ModelRenderer armRight;
    private final ModelRenderer armRight2;
    private final ModelRenderer handRight;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r97;
    private final ModelRenderer cube_r98;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r99;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer legLeft;
    private final ModelRenderer legLeft2;
    private final ModelRenderer legLeft3;
    private final ModelRenderer footLeft;
    private final ModelRenderer footLeft2;
    private final ModelRenderer legRight;
    private final ModelRenderer legRight2;
    private final ModelRenderer legRight3;
    private final ModelRenderer footRight;
    private final ModelRenderer footRight2;

    public ModelSkeletonCryolophosaurus() {
        this.textureWidth = 85;
        this.textureHeight = 85;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -27.25F, 3.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.1309F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 50, 75, 0.0F, -2.0337F, -2.7352F, 0, 1, 1, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 56, 71, 0.0F, -1.9973F, -0.7131F, 0, 1, 1, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 22, 32, 0.0F, -1.8617F, 1.322F, 0, 1, 1, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 7, 69, 0.0F, -1.8254F, 3.344F, 0, 1, 1, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 36, 68, 0.0F, -1.6898F, 5.3791F, 0, 1, 1, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 46, 67, 0.0F, -1.6535F, 7.4012F, 0, 1, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.723F, -2.4066F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.032F, -0.0016F, -1.2292F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 25, -3.3599F, -1.4201F, -0.0664F, 2, 0, 1, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.723F, -2.4066F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0215F, -0.0238F, -0.4441F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 9, -1.9658F, -0.0425F, -0.0664F, 2, 0, 1, 0.0F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -0.723F, -2.4066F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.032F, 0.0016F, 1.2292F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 25, 1.3599F, -1.4201F, -0.0664F, 2, 0, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.723F, -2.4066F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0215F, 0.0238F, 0.4441F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 9, -0.0342F, -0.0425F, -0.0664F, 2, 0, 1, 0.0F, false));

        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-2.9F, 2.5039F, 5.1441F);
        this.hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 0.5167F, -0.0135F, -0.1978F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 67, 17, 0.9586F, 5.1419F, -1.8456F, 1, 2, 3, 0.0F, true));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(-2.4F, 1.9039F, 2.5441F);
        this.hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, 0.0586F, -0.0227F, -0.0002F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 30, 68, 1.5348F, 6.9739F, -4.5913F, 1, 2, 3, -0.002F, true));

        this.Hips_r3 = new ModelRenderer(this);
        this.Hips_r3.setRotationPoint(-2.4F, 1.9039F, 2.5441F);
        this.hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.5051F, -0.0094F, -0.218F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 26, 46, -0.2986F, -0.3055F, -0.5563F, 1, 4, 2, 0.0F, true));

        this.Hips_r4 = new ModelRenderer(this);
        this.Hips_r4.setRotationPoint(-2.4F, 5.4039F, 0.9441F);
        this.hips.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, -0.3742F, -0.0094F, -0.218F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 67, 67, 0.4733F, -0.2667F, -0.816F, 1, 5, 2, 0.0F, true));

        this.Hips_r5 = new ModelRenderer(this);
        this.Hips_r5.setRotationPoint(-2.9F, 2.5039F, 5.1441F);
        this.hips.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, 0.5122F, 0.0726F, -0.3498F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 39, 67, -0.1009F, 0.3712F, -0.8456F, 1, 5, 2, 0.0F, true));

        this.Hips_r6 = new ModelRenderer(this);
        this.Hips_r6.setRotationPoint(-2.4F, -1.0961F, 4.2441F);
        this.hips.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, -0.0179F, 0.0102F, -0.0779F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 0, 0, -0.9898F, 1.5996F, -1.9659F, 1, 4, 4, 0.002F, true));

        this.Hips_r7 = new ModelRenderer(this);
        this.Hips_r7.setRotationPoint(-2.4F, 0.5039F, 5.0441F);
        this.hips.addChild(Hips_r7);
        this.setRotateAngle(Hips_r7, -0.2977F, 0.1017F, 0.1552F);
        this.Hips_r7.cubeList.add(new ModelBox(Hips_r7, 63, 10, -0.7366F, -2.449F, 0.3681F, 1, 2, 4, 0.0F, true));

        this.Hips_r8 = new ModelRenderer(this);
        this.Hips_r8.setRotationPoint(-2.4F, 0.5039F, 5.0441F);
        this.hips.addChild(Hips_r8);
        this.setRotateAngle(Hips_r8, -0.001F, 0.1017F, 0.1552F);
        this.Hips_r8.cubeList.add(new ModelBox(Hips_r8, 15, 45, -0.7366F, -1.0164F, -3.9616F, 1, 2, 8, -0.002F, true));
        this.Hips_r8.cubeList.add(new ModelBox(Hips_r8, 0, 52, -0.7366F, -2.3164F, -4.9616F, 1, 2, 6, 0.002F, true));

        this.Hips_r9 = new ModelRenderer(this);
        this.Hips_r9.setRotationPoint(-2.4F, 0.5039F, 5.0441F);
        this.hips.addChild(Hips_r9);
        this.setRotateAngle(Hips_r9, 0.2259F, 0.1017F, 0.1552F);
        this.Hips_r9.cubeList.add(new ModelBox(Hips_r9, 16, 32, -0.7366F, -3.3615F, -6.6737F, 1, 4, 3, 0.0F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -0.2867F, -2.6255F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 29, -2.0F, -1.0F, 3.0F, 2, 1, 8, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 29, 1.0F, -1.0F, 3.0F, 2, 1, 8, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 29, 32, 0.0F, -1.0F, -1.0F, 1, 1, 12, 0.0F, false));

        this.Hips_r10 = new ModelRenderer(this);
        this.Hips_r10.setRotationPoint(2.4F, 0.5039F, 5.0441F);
        this.hips.addChild(Hips_r10);
        this.setRotateAngle(Hips_r10, -0.2977F, -0.1017F, -0.1552F);
        this.Hips_r10.cubeList.add(new ModelBox(Hips_r10, 63, 10, -0.2634F, -2.449F, 0.3681F, 1, 2, 4, 0.0F, false));

        this.Hips_r11 = new ModelRenderer(this);
        this.Hips_r11.setRotationPoint(2.4F, 0.5039F, 5.0441F);
        this.hips.addChild(Hips_r11);
        this.setRotateAngle(Hips_r11, 0.2259F, -0.1017F, -0.1552F);
        this.Hips_r11.cubeList.add(new ModelBox(Hips_r11, 16, 32, -0.2634F, -3.3615F, -6.6737F, 1, 4, 3, 0.0F, false));

        this.Hips_r12 = new ModelRenderer(this);
        this.Hips_r12.setRotationPoint(2.4F, 0.5039F, 5.0441F);
        this.hips.addChild(Hips_r12);
        this.setRotateAngle(Hips_r12, -0.001F, -0.1017F, -0.1552F);
        this.Hips_r12.cubeList.add(new ModelBox(Hips_r12, 0, 52, -0.2634F, -2.3164F, -4.9616F, 1, 2, 6, 0.002F, false));
        this.Hips_r12.cubeList.add(new ModelBox(Hips_r12, 15, 45, -0.2634F, -1.0164F, -3.9616F, 1, 2, 8, -0.002F, false));

        this.Hips_r13 = new ModelRenderer(this);
        this.Hips_r13.setRotationPoint(2.4F, -1.0961F, 4.2441F);
        this.hips.addChild(Hips_r13);
        this.setRotateAngle(Hips_r13, -0.0179F, -0.0102F, 0.0779F);
        this.Hips_r13.cubeList.add(new ModelBox(Hips_r13, 0, 0, -0.0102F, 1.5996F, -1.9659F, 1, 4, 4, 0.002F, false));

        this.Hips_r14 = new ModelRenderer(this);
        this.Hips_r14.setRotationPoint(2.4F, 5.4039F, 0.9441F);
        this.hips.addChild(Hips_r14);
        this.setRotateAngle(Hips_r14, -0.3742F, 0.0094F, 0.218F);
        this.Hips_r14.cubeList.add(new ModelBox(Hips_r14, 67, 67, -1.4733F, -0.2667F, -0.816F, 1, 5, 2, 0.0F, false));

        this.Hips_r15 = new ModelRenderer(this);
        this.Hips_r15.setRotationPoint(2.4F, 1.9039F, 2.5441F);
        this.hips.addChild(Hips_r15);
        this.setRotateAngle(Hips_r15, -0.5051F, 0.0094F, 0.218F);
        this.Hips_r15.cubeList.add(new ModelBox(Hips_r15, 26, 46, -0.7014F, -0.3055F, -0.5563F, 1, 4, 2, 0.0F, false));

        this.Hips_r16 = new ModelRenderer(this);
        this.Hips_r16.setRotationPoint(2.4F, 1.9039F, 2.5441F);
        this.hips.addChild(Hips_r16);
        this.setRotateAngle(Hips_r16, 0.0586F, 0.0227F, 0.0002F);
        this.Hips_r16.cubeList.add(new ModelBox(Hips_r16, 30, 68, -2.5348F, 6.9739F, -4.5913F, 1, 2, 3, -0.002F, false));

        this.Hips_r17 = new ModelRenderer(this);
        this.Hips_r17.setRotationPoint(2.9F, 2.5039F, 5.1441F);
        this.hips.addChild(Hips_r17);
        this.setRotateAngle(Hips_r17, 0.5122F, -0.0726F, 0.3498F);
        this.Hips_r17.cubeList.add(new ModelBox(Hips_r17, 39, 67, -0.8991F, 0.3712F, -0.8456F, 1, 5, 2, 0.0F, false));

        this.Hips_r18 = new ModelRenderer(this);
        this.Hips_r18.setRotationPoint(2.9F, 2.5039F, 5.1441F);
        this.hips.addChild(Hips_r18);
        this.setRotateAngle(Hips_r18, 0.5167F, 0.0135F, 0.1978F);
        this.Hips_r18.cubeList.add(new ModelBox(Hips_r18, 67, 17, -1.9586F, 5.1419F, -1.8456F, 1, 2, 3, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.9867F, -3.2255F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 34, 16, -0.5F, -0.3582F, -10.7879F, 1, 1, 11, 0.003F, false));
        this.body.cubeList.add(new ModelBox(body, 53, 76, 0.0F, -1.0582F, -8.8879F, 0, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 29, 76, 0.0F, -1.0582F, -6.8879F, 0, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 26, 76, 0.0F, -1.0582F, -4.8879F, 0, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 76, 25, 0.0F, -1.0582F, -2.8879F, 0, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 77, 10, 0.0F, -1.0582F, -0.8879F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 9.6418F, -14.6879F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -4.5F, -0.6F, 3.9F, 8, 2, 11, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.0908F, -0.6962F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0151F, -0.1332F, -1.2261F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 9, -5.4134F, -1.4F, -0.0349F, 4, 0, 1, 0.0F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.0908F, -0.6962F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.105F, -0.0834F, -0.4373F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 46, -1.9894F, 0.0095F, -0.0349F, 2, 0, 1, 0.0F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.0908F, -2.6962F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0003F, -0.0921F, -1.2277F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 25, -6.4298F, -1.3942F, -0.033F, 5, 0, 1, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.0908F, -2.6962F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0654F, -0.0649F, -0.4402F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 55, 14, -1.9968F, 0.0252F, -0.033F, 2, 0, 1, 0.0F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.0908F, -4.6962F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0144F, -0.051F, -1.2288F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 57, 32, -7.4462F, -1.3883F, -0.0319F, 6, 0, 1, 0.0F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.0908F, -4.6962F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0259F, -0.0462F, -0.4424F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 66, 41, -2.0043F, 0.0409F, -0.0319F, 2, 0, 1, 0.0F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.0908F, -6.6962F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0291F, -0.0099F, -1.2292F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 55, 8, -8.4626F, -1.3824F, -0.0315F, 7, 0, 1, 0.0F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.0908F, -6.6962F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0136F, -0.0275F, -0.4439F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 66, 48, -2.0117F, 0.0567F, -0.0315F, 2, 0, 1, 0.0F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.0908F, -8.6962F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0466F, 0.0395F, -1.229F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 23, -9.4823F, -1.3754F, -0.0321F, 8, 0, 1, 0.0F, true));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.0908F, -8.6962F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0609F, -0.005F, -0.4446F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 5, 67, -2.0207F, 0.0756F, -0.0321F, 2, 0, 1, 0.0F, true));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.0908F, -0.6962F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.105F, 0.0834F, 0.4373F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 31, 46, -0.0106F, 0.0095F, -0.0349F, 2, 0, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 0.0908F, -0.6962F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0151F, 0.1332F, 1.2261F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 9, 1.4134F, -1.4F, -0.0349F, 4, 0, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 0.0908F, -2.6962F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0654F, 0.0649F, 0.4402F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 55, 14, -0.0032F, 0.0252F, -0.033F, 2, 0, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 0.0908F, -2.6962F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0003F, 0.0921F, 1.2277F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 48, 25, 1.4298F, -1.3942F, -0.033F, 5, 0, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 0.0908F, -4.6962F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0144F, 0.051F, 1.2288F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 57, 32, 1.4462F, -1.3883F, -0.0319F, 6, 0, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 0.0908F, -4.6962F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0259F, 0.0462F, 0.4424F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 66, 41, 0.0043F, 0.0409F, -0.0319F, 2, 0, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.0908F, -6.6962F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0291F, 0.0099F, 1.2292F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 55, 8, 1.4626F, -1.3824F, -0.0315F, 7, 0, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 0.0908F, -6.6962F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0136F, 0.0275F, 0.4439F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 66, 48, 0.0117F, 0.0567F, -0.0315F, 2, 0, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 0.0908F, -8.6962F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0466F, -0.0395F, 1.229F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 48, 23, 1.4823F, -1.3754F, -0.0321F, 8, 0, 1, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 0.0908F, -8.6962F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0609F, 0.005F, 0.4446F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 5, 67, 0.0207F, 0.0756F, -0.0321F, 2, 0, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.3051F, -10.8033F);
        this.body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0436F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 12, 76, 0.0F, -0.5781F, 0.0039F, 0, 1, 1, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.1418F, -10.7879F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.2182F, 0.0F, 0.0F);


        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 9.5531F, -4.0153F);
        this.chest.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.48F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 45, -4.0F, -1.3384F, -2.0462F, 7, 2, 4, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-2.5F, 2.8851F, -2.9226F);
        this.chest.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.6661F, 0.1726F, 0.1341F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 65, 25, -1.0F, -1.8719F, -7.631F, 4, 3, 1, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 28, 32, -1.0F, -1.8719F, -6.631F, 1, 2, 5, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 70, 8, -1.0F, -2.3719F, -1.631F, 1, 3, 2, 0.0F, true));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(2.5F, 2.8851F, -2.9226F);
        this.chest.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.6661F, -0.1726F, -0.1341F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 65, 25, -3.0F, -1.8719F, -7.631F, 4, 3, 1, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 32, 0.0F, -1.8719F, -6.631F, 1, 2, 5, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 70, 8, 0.0F, -2.3719F, -1.631F, 1, 3, 2, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 0.2183F, -5.7115F);
        this.chest.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0436F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 45, 53, -1.0F, -0.9364F, -0.2378F, 1, 1, 6, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, 0.0021F, -0.0236F);
        this.chest.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0121F, -0.1249F, -1.2264F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 42, 12, -9.4621F, -1.3813F, 0.0096F, 8, 0, 1, 0.0F, true));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, 0.0021F, -0.0236F);
        this.chest.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0971F, -0.0797F, -0.4379F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 20, 62, -2.0106F, 0.0572F, 0.0096F, 2, 0, 1, 0.0F, true));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, -0.0946F, -1.8459F);
        this.chest.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0812F, -0.0723F, -0.4391F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 52, 69, -2.0566F, 0.1459F, -0.1041F, 2, 0, 1, 0.0F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, -0.0946F, -1.8459F);
        this.chest.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0062F, -0.1085F, -1.2271F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 44, 39, -9.5574F, -1.3511F, -0.1041F, 8, 0, 1, 0.0F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, -0.137F, -3.8851F);
        this.chest.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0115F, -0.0592F, -1.2286F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 44, 41, -9.4806F, -1.3779F, -0.0902F, 8, 0, 1, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, -0.137F, -3.8851F);
        this.chest.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0338F, -0.05F, -0.442F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 74, 35, -2.0213F, 0.0726F, -0.0902F, 2, 0, 1, 0.0F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, -0.0384F, -5.7506F);
        this.chest.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0216F, -0.035F, -1.1767F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 57, 34, -7.3898F, -1.4125F, -0.1712F, 6, 0, 1, 0.0F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.5F, -0.0384F, -5.7506F);
        this.chest.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0095F, -0.04F, -0.3908F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 38, 75, -1.9815F, -0.0161F, -0.1712F, 2, 0, 1, 0.0F, true));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, 0.1034F, -7.4209F);
        this.chest.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0283F, -0.0189F, -1.1769F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 65, 59, -6.3516F, -1.4358F, -0.3751F, 5, 0, 1, 0.0F, true));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, 0.1034F, -7.4209F);
        this.chest.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0066F, -0.0334F, -0.3914F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 75, 8, -1.9709F, -0.0595F, -0.3751F, 2, 0, 1, 0.0F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, 0.0021F, -0.0236F);
        this.chest.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0121F, 0.1249F, 1.2264F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 42, 12, 1.4621F, -1.3813F, 0.0096F, 8, 0, 1, 0.0F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, 0.0021F, -0.0236F);
        this.chest.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0971F, 0.0797F, 0.4379F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 20, 62, 0.0106F, 0.0572F, 0.0096F, 2, 0, 1, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.5F, -0.0946F, -1.8459F);
        this.chest.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0062F, 0.1085F, 1.2271F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 44, 39, 1.5574F, -1.3511F, -0.1041F, 8, 0, 1, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, -0.0946F, -1.8459F);
        this.chest.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0812F, 0.0723F, 0.4391F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 52, 69, 0.0566F, 0.1459F, -0.1041F, 2, 0, 1, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5F, -0.137F, -3.8851F);
        this.chest.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0115F, 0.0592F, 1.2286F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 44, 41, 1.4806F, -1.3779F, -0.0902F, 8, 0, 1, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(0.5F, -0.137F, -3.8851F);
        this.chest.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.0338F, 0.05F, 0.442F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 74, 35, 0.0213F, 0.0726F, -0.0902F, 2, 0, 1, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.5F, -0.0384F, -5.7506F);
        this.chest.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0095F, 0.04F, 0.3908F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 38, 75, -0.0185F, -0.0161F, -0.1712F, 2, 0, 1, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.5F, -0.0384F, -5.7506F);
        this.chest.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0216F, 0.035F, 1.1767F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 57, 34, 1.3898F, -1.4125F, -0.1712F, 6, 0, 1, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.5F, 0.1034F, -7.4209F);
        this.chest.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0283F, 0.0189F, 1.1769F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 65, 59, 1.3516F, -1.4358F, -0.3751F, 5, 0, 1, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, 0.1034F, -7.4209F);
        this.chest.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0066F, 0.0334F, 0.3914F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 75, 8, -0.0291F, -0.0595F, -0.3751F, 2, 0, 1, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, -0.5307F, -5.9376F);
        this.chest.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0873F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 76, 0.0F, -0.3797F, -0.1185F, 0, 1, 1, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, -0.7605F, -1.8919F);
        this.chest.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.0436F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 3, 76, 0.0F, -0.1696F, -2.0814F, 0, 1, 1, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 76, 3, 0.0F, -0.3321F, -0.1234F, 0, 1, 1, 0.0F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.5F, 0.5457F, -9.7788F);
        this.chest.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0873F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 22, 64, -1.0F, -0.8734F, 0.0395F, 1, 1, 4, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.2531F, -8.8153F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.5688F, 0.0774F, -0.0404F);


        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.5F, -0.013F, -0.5673F);
        this.neck.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.1971F, 0.3755F, -1.2342F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 74, 43, -4.4847F, -1.3841F, -0.4777F, 3, 0, 1, 0.0F, true));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(-0.5F, -0.013F, -0.5673F);
        this.neck.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.4022F, 0.1309F, -0.4596F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 55, 65, -2.0286F, 0.0712F, -0.4777F, 2, 0, 1, 0.0F, true));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.5F, 1.6374F, -2.8803F);
        this.neck.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.6983F, -0.5826F, 0.5196F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 73, 20, -0.4313F, -1.3997F, -0.4821F, 0, 1, 3, 0.0F, true));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.5F, 1.6374F, -4.7803F);
        this.neck.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.3798F, -0.5346F, 0.1408F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 56, 73, -0.159F, -1.4839F, -0.509F, 0, 1, 3, 0.0F, true));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(0.5F, 1.6374F, -2.8803F);
        this.neck.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.6983F, 0.5826F, -0.5196F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 73, 20, 0.4313F, -1.3997F, -0.4821F, 0, 1, 3, 0.0F, false));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(0.5F, 1.6374F, -4.7803F);
        this.neck.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.3798F, 0.5346F, -0.1408F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 56, 73, 0.159F, -1.4839F, -0.509F, 0, 1, 3, 0.0F, false));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.5F, -0.013F, -0.5673F);
        this.neck.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.4022F, -0.1309F, 0.4596F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 55, 65, 0.0286F, 0.0712F, -0.4777F, 2, 0, 1, 0.0F, false));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.5F, -0.013F, -0.5673F);
        this.neck.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.1971F, -0.3755F, 1.2342F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 74, 43, 1.4847F, -1.3841F, -0.4777F, 3, 0, 1, 0.0F, false));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(2.0F, 0.2929F, -5.9351F);
        this.neck.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0436F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 55, 0, -2.5F, -0.5F, 0.0F, 1, 1, 6, 0.003F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.2929F, -5.3351F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.8278F, 0.1821F, -0.0699F);


        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(1.0F, 1.0F, -4.9536F);
        this.neck2.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.2269F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 58, 39, -1.5F, -0.2952F, -0.0742F, 1, 1, 5, 0.0F, false));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(-0.5F, 1.9445F, -1.8988F);
        this.neck2.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.1249F, -0.4669F, 0.0438F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 71, 72, 0.4822F, -2.0728F, 0.7779F, 0, 1, 3, 0.0F, true));
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 71, 72, -0.2767F, -1.4669F, -0.7043F, 0, 1, 3, 0.0F, true));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.5F, 2.3383F, -3.9809F);
        this.neck2.addChild(cube_r66);
        this.setRotateAngle(cube_r66, -0.1201F, -0.3803F, 0.0321F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 74, 38, -0.202F, -1.2059F, -0.5104F, 0, 1, 3, 0.0F, true));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(0.5F, 1.9445F, -1.8988F);
        this.neck2.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -0.1249F, 0.4669F, -0.0438F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 71, 72, -0.4822F, -2.0728F, 0.7779F, 0, 1, 3, 0.0F, false));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 71, 72, 0.2767F, -1.4669F, -0.7043F, 0, 1, 3, 0.0F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.5F, 2.3383F, -3.9809F);
        this.neck2.addChild(cube_r68);
        this.setRotateAngle(cube_r68, -0.1201F, 0.3803F, -0.0321F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 74, 38, 0.202F, -1.2059F, -0.5104F, 0, 1, 3, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.0F, -4.8536F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1883F, 0.2129F, 0.2661F);
        this.neck3.cubeList.add(new ModelBox(neck3, 7, 69, -0.5F, -2.3609F, -7.279F, 1, 1, 3, 0.0F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.5F, 0.8587F, -1.3471F);
        this.neck3.addChild(cube_r69);
        this.setRotateAngle(cube_r69, -0.6718F, -0.1841F, 0.1872F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 26, 71, -0.2379F, -1.2602F, -0.8742F, 0, 1, 3, 0.0F, true));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(-0.5F, -0.5609F, -3.479F);
        this.neck3.addChild(cube_r70);
        this.setRotateAngle(cube_r70, -0.7931F, -0.1231F, 0.124F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 44, 32, -0.0931F, -0.9295F, -0.5226F, 0, 1, 3, 0.0F, true));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.5F, 0.8587F, -1.3471F);
        this.neck3.addChild(cube_r71);
        this.setRotateAngle(cube_r71, -0.6718F, 0.1841F, -0.1872F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 26, 71, 0.2379F, -1.2602F, -0.8742F, 0, 1, 3, 0.0F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(0.5F, -0.5609F, -3.479F);
        this.neck3.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.7931F, 0.1231F, -0.124F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 44, 32, 0.0931F, -0.9295F, -0.5226F, 0, 1, 3, 0.0F, false));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(0.5F, -1.6609F, -4.279F);
        this.neck3.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -0.4363F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 57, 25, -1.0F, -0.7F, -0.3F, 1, 1, 5, 0.003F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.9609F, -6.279F);
        this.neck3.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 34, 46, -2.0F, -1.2046F, -4.0521F, 4, 4, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 61, 1.0F, -0.7046F, -3.7521F, 1, 1, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 25, 1.24F, -0.7046F, -3.7521F, 1, 1, 1, -0.2F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 25, -2.24F, -0.7046F, -3.7521F, 1, 1, 1, -0.2F, true));
        this.head.cubeList.add(new ModelBox(head, 9, 61, -2.0F, -0.7046F, -3.7521F, 1, 1, 1, 0.02F, true));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(0.0F, -1.7046F, -0.7021F);
        this.head.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.3491F, 0.0F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 74, 48, -0.5F, 0.0F, -1.6F, 1, 1, 2, 0.0F, false));

        this.immobile = new ModelRenderer(this);
        this.immobile.setRotationPoint(0.0F, 2.7954F, -4.0521F);
        this.head.addChild(immobile);
        this.immobile.cubeList.add(new ModelBox(immobile, 41, 61, -1.5F, -2.0F, -3.4F, 3, 2, 3, 0.0F, false));
        this.immobile.cubeList.add(new ModelBox(immobile, 0, 80, -1.5F, -2.0F, -2.9F, 3, 2, 3, -0.004F, false));

        this.immobile2 = new ModelRenderer(this);
        this.immobile2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.immobile.addChild(immobile2);
        this.setRotateAngle(immobile2, 0.1745F, 0.0F, 0.0F);
        this.immobile2.cubeList.add(new ModelBox(immobile2, 0, 61, -1.0F, -1.5F, -3.0F, 2, 1, 4, -0.001F, false));
        this.immobile2.cubeList.add(new ModelBox(immobile2, 56, 59, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.immobile3 = new ModelRenderer(this);
        this.immobile3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.immobile2.addChild(immobile3);
        this.setRotateAngle(immobile3, -0.0873F, 0.0F, 0.0F);


        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(-0.7F, -0.25F, 2.25F);
        this.immobile3.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.176F, -0.1289F, -0.0229F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 72, 3, 0.0F, 0.0F, -0.5F, 0, 1, 3, 0.0F, true));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(0.0F, 0.0F, 0.25F);
        this.immobile3.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0F, -0.0873F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 28, 32, -0.5F, -0.25F, 0.025F, 0, 1, 2, 0.0F, true));

        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(0.7F, -0.25F, 2.25F);
        this.immobile3.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.176F, 0.1289F, 0.0229F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 72, 3, 0.0F, 0.0F, -0.5F, 0, 1, 3, 0.0F, false));

        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(0.0F, 0.0F, 0.25F);
        this.immobile3.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.0F, 0.0873F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 28, 32, 0.5F, -0.25F, 0.025F, 0, 1, 2, 0.0F, false));

        this.immobile4 = new ModelRenderer(this);
        this.immobile4.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.immobile2.addChild(immobile4);
        this.setRotateAngle(immobile4, 0.0436F, 0.0F, 0.0F);
        this.immobile4.cubeList.add(new ModelBox(immobile4, 74, 67, -0.5F, -1.0F, -1.25F, 1, 1, 2, 0.0F, false));

        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(0.25F, -0.25F, -0.85F);
        this.immobile4.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.0873F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 76, 54, -0.6F, -0.25F, 0.0F, 0, 1, 1, 0.0F, true));
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 76, 54, 0.1F, -0.25F, 0.0F, 0, 1, 1, 0.0F, false));

        this.immobile5 = new ModelRenderer(this);
        this.immobile5.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.immobile4.addChild(immobile5);
        this.setRotateAngle(immobile5, 0.829F, 0.0F, 0.0F);
        this.immobile5.cubeList.add(new ModelBox(immobile5, 75, 71, -0.5F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

        this.immobile6 = new ModelRenderer(this);
        this.immobile6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.immobile5.addChild(immobile6);
        this.setRotateAngle(immobile6, -0.4669F, 0.0F, 0.0F);
        this.immobile6.cubeList.add(new ModelBox(immobile6, 72, 30, -0.5F, 0.0F, 0.0F, 1, 2, 2, -0.002F, false));

        this.immobile7 = new ModelRenderer(this);
        this.immobile7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.immobile6.addChild(immobile7);
        this.setRotateAngle(immobile7, -0.1745F, 0.0F, 0.0F);
        this.immobile7.cubeList.add(new ModelBox(immobile7, 14, 72, -0.5F, 0.0F, 0.0F, 1, 2, 2, -0.003F, false));

        this.immobile8 = new ModelRenderer(this);
        this.immobile8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.immobile7.addChild(immobile8);
        this.setRotateAngle(immobile8, -0.1658F, 0.0F, 0.0F);
        this.immobile8.cubeList.add(new ModelBox(immobile8, 64, 0, -1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));
        this.immobile8.cubeList.add(new ModelBox(immobile8, 74, 61, -1.0F, 0.0F, 2.55F, 2, 2, 1, -0.001F, false));

        this.immobile9 = new ModelRenderer(this);
        this.immobile9.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.immobile8.addChild(immobile9);
        this.setRotateAngle(immobile9, 0.0443F, 0.1744F, 0.0077F);
        this.immobile9.cubeList.add(new ModelBox(immobile9, 68, 43, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.immobile10 = new ModelRenderer(this);
        this.immobile10.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.immobile9.addChild(immobile10);
        this.setRotateAngle(immobile10, 0.4816F, -0.0756F, -0.0437F);
        this.immobile10.cubeList.add(new ModelBox(immobile10, 72, 0, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.immobile10.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.5748F, 0.1334F, 0.1129F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 20, 70, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.immobile13 = new ModelRenderer(this);
        this.immobile13.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.immobile8.addChild(immobile13);
        this.setRotateAngle(immobile13, 0.0443F, -0.1744F, -0.0077F);
        this.immobile13.cubeList.add(new ModelBox(immobile13, 9, 53, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.immobile14 = new ModelRenderer(this);
        this.immobile14.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.immobile13.addChild(immobile14);
        this.setRotateAngle(immobile14, 0.4816F, 0.0756F, 0.0437F);
        this.immobile14.cubeList.add(new ModelBox(immobile14, 63, 17, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.immobile14.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.5748F, -0.1334F, -0.1129F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 41, 55, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.7954F, -0.0521F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.288F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 73, 15, 1.0F, 0.0F, -4.0F, 1, 2, 2, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 71, 55, 1.0F, 0.0F, -2.0F, 1, 1, 2, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 73, 15, -2.0F, 0.0F, -4.0F, 1, 2, 2, -0.001F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 71, 55, -2.0F, 0.0F, -2.0F, 1, 1, 2, -0.001F, true));

        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.jaw.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.5236F, 0.0F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 47, 46, -2.0F, -1.0F, 0.0F, 1, 1, 2, -0.0013F, true));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 47, 46, 1.0F, -1.0F, 0.0F, 1, 1, 2, -0.0013F, false));

        this.immobile11 = new ModelRenderer(this);
        this.immobile11.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.jaw.addChild(immobile11);
        this.setRotateAngle(immobile11, 0.2182F, 0.0F, 0.0F);
        this.immobile11.cubeList.add(new ModelBox(immobile11, 46, 69, 0.5F, 0.0F, -3.0F, 1, 1, 3, -0.001F, false));
        this.immobile11.cubeList.add(new ModelBox(immobile11, 46, 69, -1.5F, 0.0F, -3.0F, 1, 1, 3, -0.001F, true));

        this.immobile12 = new ModelRenderer(this);
        this.immobile12.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.immobile11.addChild(immobile12);
        this.immobile12.cubeList.add(new ModelBox(immobile12, 66, 62, -1.0F, 0.0F, -3.0F, 2, 1, 3, -0.001F, false));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(-0.25F, 0.5F, -3.5F);
        this.immobile12.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.0F, -0.1309F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 49, 62, 0.0F, -1.0F, 0.1F, 0, 1, 5, 0.0F, true));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.immobile12.addChild(cube_r84);
        this.setRotateAngle(cube_r84, -0.1571F, 0.0F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 68, 50, -1.5F, -1.0F, 3.0F, 1, 1, 3, -0.002F, true));
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 68, 50, 0.5F, -1.0F, 3.0F, 1, 1, 3, -0.002F, false));
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 66, 36, -1.0F, -1.0F, 0.0F, 2, 1, 3, -0.002F, false));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(0.25F, 0.5F, -3.5F);
        this.immobile12.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.0F, 0.1309F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 49, 62, 0.0F, -1.0F, 0.1F, 0, 1, 5, 0.0F, false));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(0.5F, 1.0F, -3.0F);
        this.immobile12.addChild(cube_r86);
        this.setRotateAngle(cube_r86, -0.1309F, 0.0F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 66, 75, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));

        this.throatPouch3 = new ModelRenderer(this);
        this.throatPouch3.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.jaw.addChild(throatPouch3);
        this.setRotateAngle(throatPouch3, -0.3054F, 0.0F, 0.0F);


        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throatPouch3.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.1309F, -0.2182F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 52, 71, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throatPouch3.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.1309F, 0.2182F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 52, 71, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.throatPouch = new ModelRenderer(this);
        this.throatPouch.setRotationPoint(0.0F, 2.8391F, -2.279F);
        this.neck3.addChild(throatPouch);
        this.setRotateAngle(throatPouch, 0.4363F, 0.0F, 0.0F);


        this.throatPouch2 = new ModelRenderer(this);
        this.throatPouch2.setRotationPoint(0.5F, 0.0F, -2.0F);
        this.throatPouch.addChild(throatPouch2);
        this.setRotateAngle(throatPouch2, -0.3927F, 0.0F, 0.0F);


        this.armLeft = new ModelRenderer(this);
        this.armLeft.setRotationPoint(5.1F, 6.8531F, -7.4153F);
        this.chest.addChild(armLeft);
        this.setRotateAngle(armLeft, 0.1249F, 0.2577F, -0.0465F);
        this.armLeft.cubeList.add(new ModelBox(armLeft, 0, 67, -0.5109F, -0.3355F, -0.7325F, 1, 6, 2, 0.0F, false));

        this.armLeft2 = new ModelRenderer(this);
        this.armLeft2.setRotationPoint(0.0891F, 5.4645F, 0.3675F);
        this.armLeft.addChild(armLeft2);
        this.setRotateAngle(armLeft2, -0.7399F, 0.0589F, 0.0644F);
        this.armLeft2.cubeList.add(new ModelBox(armLeft2, 45, 74, -0.6138F, -0.1315F, -0.4828F, 1, 5, 1, 0.0F, false));
        this.armLeft2.cubeList.add(new ModelBox(armLeft2, 33, 74, -0.6138F, -0.1315F, -1.8828F, 1, 5, 1, -0.1F, false));

        this.handLeft = new ModelRenderer(this);
        this.handLeft.setRotationPoint(-0.1138F, 4.3685F, -0.6828F);
        this.armLeft2.addChild(handLeft);
        this.setRotateAngle(handLeft, 0.0F, 0.0F, 0.5672F);
        this.handLeft.cubeList.add(new ModelBox(handLeft, 34, 16, -0.5F, 0.0F, -2.0F, 1, 4, 4, 0.0F, false));

        this.armRight = new ModelRenderer(this);
        this.armRight.setRotationPoint(-5.1F, 6.8531F, -7.4153F);
        this.chest.addChild(armRight);
        this.setRotateAngle(armRight, 0.823F, -0.2577F, 0.0465F);
        this.armRight.cubeList.add(new ModelBox(armRight, 60, 65, -0.4891F, -0.3355F, -0.7325F, 1, 6, 2, 0.0F, false));

        this.armRight2 = new ModelRenderer(this);
        this.armRight2.setRotationPoint(-0.0891F, 5.4645F, 0.3675F);
        this.armRight.addChild(armRight2);
        this.setRotateAngle(armRight2, -0.9144F, -0.0589F, -0.0644F);
        this.armRight2.cubeList.add(new ModelBox(armRight2, 21, 74, -0.3862F, -0.1315F, -0.4828F, 1, 5, 1, 0.0F, false));
        this.armRight2.cubeList.add(new ModelBox(armRight2, 7, 74, -0.3862F, -0.1315F, -1.8828F, 1, 5, 1, -0.1F, false));

        this.handRight = new ModelRenderer(this);
        this.handRight.setRotationPoint(0.1138F, 4.3685F, -0.6828F);
        this.armRight2.addChild(handRight);
        this.setRotateAngle(handRight, 0.0F, 0.0F, -0.7418F);
        this.handRight.cubeList.add(new ModelBox(handRight, 28, 0, -0.5F, 0.0F, -2.0F, 1, 4, 4, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3717F, 8.3345F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0876F, 0.0869F, 0.0076F);
        this.tail.cubeList.add(new ModelBox(tail, 65, 36, 0.0F, -1.1949F, 0.9117F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 29, 65, 0.0F, -1.1482F, 2.9508F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 22, 64, 0.0F, -1.2001F, 4.9725F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 64, 11, 0.0F, -1.252F, 6.9942F, 0, 1, 1, 0.0F, false));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(0.0F, 0.9066F, 0.2381F);
        this.tail.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.4014F, 0.0F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 41, 59, 0.0F, 0.1133F, 0.7547F, 0, 3, 1, 0.0F, false));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(0.0F, 0.6644F, 8.5219F);
        this.tail.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.5323F, 0.0F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 48, 29, 0.0F, 0.4674F, 0.3927F, 0, 4, 1, 0.0F, false));

        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(0.0F, 0.7163F, 6.5002F);
        this.tail.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.4887F, 0.0F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 63, 74, 0.0F, 0.3325F, 0.4422F, 0, 5, 1, 0.0F, false));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(0.0F, 1.0636F, 4.5305F);
        this.tail.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.4887F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 9, 30, 0.0F, 0.2374F, 0.4731F, 0, 5, 1, 0.0F, false));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(0.0F, 0.6578F, 2.225F);
        this.tail.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.4451F, 0.0F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 0, 52, 0.0F, 0.6345F, 0.5715F, 0, 4, 1, 0.0F, false));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(0.0F, 0.4142F, 0.1512F);
        this.tail.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.0524F, 0.0F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 16, 32, -0.5F, -0.8591F, -0.1736F, 1, 1, 9, 0.003F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.4791F, 8.5887F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.219F, 0.0852F, 0.0189F);
        this.tail2.cubeList.add(new ModelBox(tail2, 64, 0, 0.0F, -0.7725F, 0.3823F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 29, 62, 0.0F, -0.8597F, 2.3804F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 51, 61, 0.0F, -0.9469F, 4.3785F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 61, 0.0F, -0.9343F, 6.3809F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 42, 0, -0.5F, -0.3901F, -0.6889F, 1, 1, 10, 0.0F, false));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(0.0F, 1.0126F, 3.528F);
        this.tail2.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.4014F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 55, 0, 0.0F, 1.1051F, 2.3894F, 0, 3, 1, 0.0F, false));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 58, 0, 0.0F, 0.6857F, 0.411F, 0, 3, 1, 0.0F, false));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(0.0F, 1.0824F, 1.9295F);
        this.tail2.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.4014F, 0.0F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 9, 37, 0.0F, 0.2646F, 0.1414F, 0, 4, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0443F, 8.2764F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.131F, 0.0433F, 0.0057F);
        this.tail3.cubeList.add(new ModelBox(tail3, 59, 27, 0.0F, -0.8301F, -0.1156F, 0, 1, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 32, 0.0F, -0.7429F, 1.8825F, 0, 1, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 48, 16, 0.0F, -0.6556F, 3.8805F, 0, 1, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 19, 45, 0.0F, -0.5684F, 5.8786F, 0, 1, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 44, 32, 0.0F, -0.4812F, 7.8767F, 0, 1, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 1, -0.5F, -0.4006F, -0.1183F, 1, 1, 13, 0.003F, false));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(0.0F, 1.4055F, 3.0344F);
        this.tail3.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.4887F, 0.0F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 34, 16, 0.0F, 4.1145F, 9.8006F, 0, 2, 1, 0.0F, false));
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 35, 0, 0.0F, 3.355F, 8.1677F, 0, 2, 1, 0.0F, false));
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 35, 0, 0.0F, 2.5123F, 6.343F, 0, 2, 1, 0.0F, false));
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 37, 40, 0.0F, 1.6512F, 4.5378F, 0, 2, 1, 0.0F, false));
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 41, 16, 0.0F, 0.8764F, 2.6819F, 0, 2, 1, 0.0F, false));
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 0, 45, 0.0F, 0.1015F, 0.8259F, 0, 2, 1, 0.0F, false));
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 0, 0, 0.0F, -0.661F, -1.0069F, 0, 2, 1, 0.0F, false));

        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(0.0F, 1.0565F, -4.958F);
        this.tail3.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.4014F, 0.0F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 36, 32, 0.0F, 1.8113F, 4.4774F, 0, 3, 1, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1496F, 12.8904F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.088F, -0.1304F, 0.0115F);
        this.tail4.cubeList.add(new ModelBox(tail4, 17, 16, -0.5F, -0.5F, 0.0F, 1, 1, 14, 0.0F, false));

        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(0.0F, 1.2559F, -9.856F);
        this.tail4.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.4887F, 0.0F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 15, 77, 0.0F, 9.9126F, 20.9014F, 0, 1, 1, 0.0F, false));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 9, 52, 0.0F, 9.0515F, 19.0963F, 0, 1, 1, 0.0F, false));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 29, 56, 0.0F, 8.3994F, 17.1504F, 0, 1, 1, 0.0F, false));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 54, 53, 0.0F, 7.5384F, 15.3452F, 0, 1, 1, 0.0F, false));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 7, 0, 0.0F, 4.939F, 11.6449F, 0, 2, 1, 0.0F, false));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 28, 0, 0.0F, 5.8F, 13.4501F, 0, 2, 1, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.1497F, 13.3131F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1314F, -0.0865F, 0.0114F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 14, -0.5F, -0.3745F, -0.0886F, 1, 1, 14, 0.003F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0762F, 13.894F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2214F, -0.1704F, 0.0381F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 30, -0.5F, -0.4253F, -0.2823F, 1, 1, 13, 0.0F, false));

        this.legLeft = new ModelRenderer(this);
        this.legLeft.setRotationPoint(3.7F, 2.7133F, 3.9745F);
        this.hips.addChild(legLeft);
        this.setRotateAngle(legLeft, -0.3054F, 0.0F, 0.0F);
        this.legLeft.cubeList.add(new ModelBox(legLeft, 17, 14, -0.7F, -0.9189F, -1.0259F, 2, 11, 2, 0.003F, false));

        this.legLeft2 = new ModelRenderer(this);
        this.legLeft2.setRotationPoint(0.6F, 10.1133F, -0.807F);
        this.legLeft.addChild(legLeft2);
        this.setRotateAngle(legLeft2, 0.8727F, 0.0F, 0.0F);
        this.legLeft2.cubeList.add(new ModelBox(legLeft2, 32, 55, -1.3F, 0.0385F, -0.632F, 2, 10, 2, 0.0F, false));
        this.legLeft2.cubeList.add(new ModelBox(legLeft2, 26, 16, -0.8F, 1.0385F, 1.768F, 1, 9, 1, 0.0F, false));

        this.legLeft3 = new ModelRenderer(this);
        this.legLeft3.setRotationPoint(0.2F, 9.8159F, 1.4617F);
        this.legLeft2.addChild(legLeft3);
        this.setRotateAngle(legLeft3, -0.7854F, 0.0F, 0.0F);
        this.legLeft3.cubeList.add(new ModelBox(legLeft3, 13, 62, -1.5F, -0.1414F, -1.1414F, 2, 7, 2, 0.003F, false));

        this.footLeft = new ModelRenderer(this);
        this.footLeft.setRotationPoint(0.0F, 6.8586F, -0.6414F);
        this.legLeft3.addChild(footLeft);
        this.setRotateAngle(footLeft, 0.3491F, 0.0F, 0.0F);
        this.footLeft.cubeList.add(new ModelBox(footLeft, 15, 56, -3.0F, -1.0F, -2.0F, 5, 2, 3, 0.0F, false));

        this.footLeft2 = new ModelRenderer(this);
        this.footLeft2.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.footLeft.addChild(footLeft2);
        this.footLeft2.cubeList.add(new ModelBox(footLeft2, 51, 46, -3.0F, -1.0F, -4.0F, 5, 2, 4, -0.001F, false));

        this.legRight = new ModelRenderer(this);
        this.legRight.setRotationPoint(-3.7F, 2.7133F, 3.9745F);
        this.hips.addChild(legRight);
        this.setRotateAngle(legRight, 0.2182F, 0.0F, 0.0F);
        this.legRight.cubeList.add(new ModelBox(legRight, 0, 14, -1.3F, -0.9189F, -1.0259F, 2, 11, 2, 0.003F, false));

        this.legRight2 = new ModelRenderer(this);
        this.legRight2.setRotationPoint(-0.6F, 10.1133F, -0.807F);
        this.legRight.addChild(legRight2);
        this.setRotateAngle(legRight2, 1.1345F, 0.0F, 0.0F);
        this.legRight2.cubeList.add(new ModelBox(legRight2, 0, 30, -0.7F, 0.0385F, -0.632F, 2, 10, 2, 0.0F, false));
        this.legRight2.cubeList.add(new ModelBox(legRight2, 9, 14, -0.2F, 1.0385F, 1.768F, 1, 9, 1, 0.0F, false));

        this.legRight3 = new ModelRenderer(this);
        this.legRight3.setRotationPoint(-0.2F, 9.8159F, 1.4617F);
        this.legRight2.addChild(legRight3);
        this.setRotateAngle(legRight3, -0.9163F, 0.0F, 0.0F);
        this.legRight3.cubeList.add(new ModelBox(legRight3, 42, 0, -0.5F, -0.1414F, -1.1414F, 2, 7, 2, 0.003F, false));

        this.footRight = new ModelRenderer(this);
        this.footRight.setRotationPoint(0.0F, 6.8586F, -0.6414F);
        this.legRight3.addChild(footRight);
        this.setRotateAngle(footRight, 0.4363F, 0.0F, 0.0F);
        this.footRight.cubeList.add(new ModelBox(footRight, 54, 53, -2.0F, -1.0F, -2.0F, 5, 2, 3, 0.0F, false));

        this.footRight2 = new ModelRenderer(this);
        this.footRight2.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.footRight.addChild(footRight2);
        this.footRight2.cubeList.add(new ModelBox(footRight2, 48, 16, -2.0F, -1.0F, -4.0F, 5, 2, 4, -0.001F, false));

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
