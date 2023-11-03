package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDasyceps extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Dasyceps;
    private final ModelRenderer Basin;
    private final ModelRenderer Basin_r1;
    private final ModelRenderer Basin_r2;
    private final ModelRenderer Basin_r3;
    private final ModelRenderer Basin_r4;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer FemurR2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Tibia_FibulaR2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer PesR2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer FemurR3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Tibia_FibulaR3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer PesR3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer Body3;
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
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer Cephalon2;
    private final ModelRenderer Cranium2;
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
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer Jaw2;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer ForearmL3;
    private final ModelRenderer Humerus_r1;
    private final ModelRenderer Radio_UlnaL3;
    private final ModelRenderer Radio_Ulna_r1;
    private final ModelRenderer ManusL3;
    private final ModelRenderer cube_r65;
    private final ModelRenderer ForearmL4;
    private final ModelRenderer Humerus_r2;
    private final ModelRenderer Radio_UlnaL4;
    private final ModelRenderer Radio_Ulna_r2;
    private final ModelRenderer ManusL4;
    private final ModelRenderer cube_r66;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r69;
    private final ModelRenderer Tail3;

    public ModelSkeletonDasyceps() {
        this.textureWidth = 70;
        this.textureHeight = 65;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Dasyceps = new ModelRenderer(this);
        this.Dasyceps.setRotationPoint(-1.2F, -10.0F, 3.0F);
        this.fossil.addChild(Dasyceps);


        this.Basin = new ModelRenderer(this);
        this.Basin.setRotationPoint(0.0F, 6.5F, 0.6F);
        this.Dasyceps.addChild(Basin);
        this.setRotateAngle(Basin, 0.1309F, 0.1745F, 0.0F);


        this.Basin_r1 = new ModelRenderer(this);
        this.Basin_r1.setRotationPoint(-0.6412F, 0.4773F, 0.8083F);
        this.Basin.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.1647F, -0.05F, -0.3897F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 0, 0, -2.1249F, -1.2793F, -0.5384F, 1, 3, 1, 0.0F, true));

        this.Basin_r2 = new ModelRenderer(this);
        this.Basin_r2.setRotationPoint(3.0412F, 0.4773F, 0.8083F);
        this.Basin.addChild(Basin_r2);
        this.setRotateAngle(Basin_r2, -0.1647F, 0.05F, 0.3897F);
        this.Basin_r2.cubeList.add(new ModelBox(Basin_r2, 0, 0, -1.0F, -0.4F, -0.5F, 1, 3, 1, 0.0F, false));

        this.Basin_r3 = new ModelRenderer(this);
        this.Basin_r3.setRotationPoint(0.0F, 1.5974F, -2.7392F);
        this.Basin.addChild(Basin_r3);
        this.setRotateAngle(Basin_r3, -0.1332F, -0.012F, -0.0074F);
        this.Basin_r3.cubeList.add(new ModelBox(Basin_r3, 11, 45, -1.5072F, 0.0041F, 1.8107F, 3, 1, 3, 0.0F, false));

        this.Basin_r4 = new ModelRenderer(this);
        this.Basin_r4.setRotationPoint(0.0F, 1.5974F, -2.7392F);
        this.Basin.addChild(Basin_r4);
        this.setRotateAngle(Basin_r4, -0.1745F, 0.0F, 0.0F);
        this.Basin_r4.cubeList.add(new ModelBox(Basin_r4, 15, 52, -0.5F, -2.7958F, -0.1912F, 1, 1, 6, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.9F, -2.0584F, -8.8474F);
        this.Basin.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1668F, 0.0648F, -0.1452F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 37, -4.8742F, 0.1387F, 11.2699F, 2, 0, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 45, 35, -4.5286F, 0.1864F, 7.2838F, 2, 0, 1, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.4191F, 0.2001F, 0.9797F);
        this.Basin.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1491F, -0.0638F, -0.1281F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 38, -3.2765F, -0.3121F, -0.3998F, 2, 0, 1, 0.0F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.9F, -2.0584F, -8.8474F);
        this.Basin.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1715F, -0.0482F, -0.7014F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 59, -5.81F, -2.2433F, 7.3475F, 2, 0, 1, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -2.0584F, -8.8474F);
        this.Basin.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1668F, -0.0648F, 0.1452F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 37, 0.6032F, 0.4424F, 11.4704F, 2, 0, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 35, 0.2576F, 0.4901F, 7.4844F, 2, 0, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.9809F, 0.2001F, 0.9797F);
        this.Basin.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1491F, 0.0638F, 0.1281F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 38, -1.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -2.0584F, -8.8474F);
        this.Basin.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1715F, 0.0482F, 0.7014F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 45, 59, 2.055F, -0.7665F, 7.5173F, 2, 0, 1, 0.0F, false));

        this.FemurR2 = new ModelRenderer(this);
        this.FemurR2.setRotationPoint(3.25F, 1.7669F, 0.2694F);
        this.Basin.addChild(FemurR2);
        this.setRotateAngle(FemurR2, 0.324F, -0.3548F, -0.7365F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.6491F, 0.7718F, 0.9914F);
        this.FemurR2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2295F, -0.2556F, 0.5177F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 12, -1.3F, -1.0F, -1.0F, 5, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 31, 3.7F, -1.0F, -1.5F, 1, 1, 2, 0.0F, false));

        this.Tibia_FibulaR2 = new ModelRenderer(this);
        this.Tibia_FibulaR2.setRotationPoint(4.0491F, 2.7718F, 1.9914F);
        this.FemurR2.addChild(Tibia_FibulaR2);
        this.setRotateAngle(Tibia_FibulaR2, -0.5116F, -0.8554F, 0.4579F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tibia_FibulaR2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.6672F, -0.167F, 1.4693F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 18, 0.0F, -0.6F, -1.0F, 3, 1, 1, -0.1F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 45, 0.1F, 0.6F, -1.0F, 3, 1, 1, 0.0F, false));

        this.PesR2 = new ModelRenderer(this);
        this.PesR2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Tibia_FibulaR2.addChild(PesR2);
        this.setRotateAngle(PesR2, 0.6638F, -0.2768F, -0.1718F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PesR2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1047F, 0.0F, 0.2269F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 45, -2.0F, -0.6F, -4.0F, 5, 1, 5, 0.0F, false));

        this.FemurR3 = new ModelRenderer(this);
        this.FemurR3.setRotationPoint(-3.15F, 1.7669F, 0.2694F);
        this.Basin.addChild(FemurR3);
        this.setRotateAngle(FemurR3, -0.7006F, -0.5571F, 1.0716F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.6491F, 0.7718F, 0.9914F);
        this.FemurR3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2295F, 0.2556F, -0.5177F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 12, -3.7F, -1.0F, -1.0F, 5, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 31, -4.7F, -1.0F, -1.5F, 1, 1, 2, 0.0F, true));

        this.Tibia_FibulaR3 = new ModelRenderer(this);
        this.Tibia_FibulaR3.setRotationPoint(-4.0491F, 2.7718F, 1.9914F);
        this.FemurR3.addChild(Tibia_FibulaR3);
        this.setRotateAngle(Tibia_FibulaR3, -0.3969F, 0.8736F, -0.297F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tibia_FibulaR3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.6672F, 0.167F, -1.4693F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 18, -3.0F, -0.6F, -1.0F, 3, 1, 1, -0.1F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 45, -3.1F, 0.6F, -1.0F, 3, 1, 1, 0.0F, true));

        this.PesR3 = new ModelRenderer(this);
        this.PesR3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Tibia_FibulaR3.addChild(PesR3);
        this.setRotateAngle(PesR3, 0.5526F, 0.0635F, -0.1256F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PesR3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1047F, 0.0F, -0.2269F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 45, -3.0F, -0.6F, -4.0F, 5, 1, 5, 0.0F, true));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.8436F, -2.4906F);
        this.Basin.addChild(Body2);
        this.setRotateAngle(Body2, 0.0853F, -0.173F, 0.023F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(1.9F, -1.1249F, -6.3993F);
        this.Body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1715F, -0.0482F, -0.7014F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 29, -6.5607F, -2.3103F, 5.3529F, 3, 0, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 8, -6.6048F, -2.4936F, 3.3394F, 3, 0, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 45, 41, -6.5726F, -2.6127F, 1.3332F, 3, 0, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 48, 15, -6.3877F, -2.6034F, -0.6582F, 3, 0, 1, 0.0F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(1.9F, -1.1249F, -6.3993F);
        this.Body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1668F, 0.0648F, -0.1452F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 54, 10, -4.3263F, -0.0123F, 5.2928F, 2, 0, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 45, 37, -4.4336F, -0.1514F, 3.278F, 2, 0, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 46, -4.4422F, -0.2774F, 1.272F, 2, 0, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 42, -4.2533F, -0.377F, -0.7165F, 2, 0, 1, 0.0F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -1.1249F, -6.3993F);
        this.Body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1668F, -0.0648F, 0.1452F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 54, 10, 0.0552F, 0.2914F, 5.4933F, 2, 0, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 45, 37, 0.1626F, 0.1523F, 3.4786F, 2, 0, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 46, 0.1711F, 0.0263F, 1.4725F, 2, 0, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 42, -0.0178F, -0.0733F, -0.516F, 2, 0, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -1.1249F, -6.3993F);
        this.Body2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1715F, 0.0482F, 0.7014F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 29, 1.8056F, -0.8335F, 5.5227F, 3, 0, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 54, 8, 1.8497F, -1.0168F, 3.5092F, 3, 0, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 45, 41, 1.8175F, -1.1359F, 1.503F, 3, 0, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 48, 15, 1.6327F, -1.1266F, -0.4884F, 3, 0, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.6635F, -7.849F);
        this.Body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2356F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 42, -0.5F, -0.581F, -0.0243F, 1, 1, 8, 0.0F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -1.8171F, -7.7512F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, -0.0455F, -0.1278F, 0.0285F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.5328F, -5.4816F);
        this.Body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 53, 41, -2.5F, 1.2F, 1.0F, 5, 1, 2, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(1.9F, 0.2371F, -0.5985F);
        this.Body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.169F, -0.051F, -0.7008F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 56, 20, -5.4425F, -2.5512F, -0.633F, 2, 0, 1, 0.0F, true));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(1.9F, 0.2371F, -0.5985F);
        this.Body3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1661F, 0.0611F, -0.1444F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 44, -4.2718F, -0.3034F, -0.6918F, 2, 0, 1, 0.0F, true));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(1.9F, 0.2837F, -2.6375F);
        this.Body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1587F, -0.0621F, -0.7873F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 48, -5.0241F, -2.9818F, -0.6224F, 2, 0, 1, 0.0F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(1.9F, 0.2837F, -2.6375F);
        this.Body3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1633F, 0.0462F, -0.2302F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 56, 22, -4.1504F, -0.8914F, -0.6772F, 2, 0, 1, 0.0F, true));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(1.9F, -0.0635F, -4.6072F);
        this.Body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1536F, 0.0044F, -0.2224F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 55, 45, -3.1814F, -0.6729F, -0.5391F, 2, 0, 1, 0.0F, true));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(1.9F, -0.0635F, -4.6072F);
        this.Body3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1283F, -0.0925F, -0.7821F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 47, 54, -4.3223F, -2.2765F, -0.4971F, 2, 0, 1, 0.0F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 0.2371F, -0.5985F);
        this.Body3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.169F, 0.051F, 0.7008F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 56, 20, 1.6868F, -1.0742F, -0.4719F, 2, 0, 1, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 0.2371F, -0.5985F);
        this.Body3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1661F, -0.0611F, 0.1444F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 44, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 0.2837F, -2.6375F);
        this.Body3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1587F, 0.0621F, 0.7873F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 48, 1.4039F, -1.357F, -0.4645F, 2, 0, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 0.2837F, -2.6375F);
        this.Body3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1633F, -0.0462F, 0.2302F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 56, 22, -0.0866F, -0.3904F, -0.4898F, 2, 0, 1, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, -0.0635F, -4.6072F);
        this.Body3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1283F, 0.0925F, 0.7821F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 47, 54, 0.6975F, -0.6496F, -0.4394F, 2, 0, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, -0.0635F, -4.6072F);
        this.Body3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1536F, -0.0044F, 0.2224F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 55, 45, -1.0619F, -0.1731F, -0.4518F, 2, 0, 1, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.6F, -0.2624F, -2.5552F);
        this.Body3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.7679F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 18, -3.5F, 0.419F, -2.574F, 1, 2, 4, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 10, 52, -3.5F, -0.6327F, -3.3381F, 1, 1, 3, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 10, 52, 3.8F, -0.6327F, -3.3381F, 1, 1, 3, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 18, 3.8F, 0.419F, -2.574F, 1, 2, 4, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.8F, 2.3082F, -5.4083F);
        this.Body3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 1.1144F, 0.1719F, -0.0306F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 47, 51, -2.2626F, -0.7038F, -0.5585F, 4, 1, 1, 0.0F, true));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(4.2F, 2.3082F, -5.4083F);
        this.Body3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 1.1144F, -0.1719F, 0.0306F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 47, 51, -4.0025F, -0.3199F, -0.4484F, 4, 1, 1, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -0.5504F, -5.2906F);
        this.Body3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1484F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 25, 55, -0.5F, -0.6195F, 0.2479F, 1, 1, 5, 0.0F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.1F, -0.7064F, -5.1426F);
        this.Body3.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2216F, 0.1705F, -0.0362F);


        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -0.2246F, -4.064F);
        this.Neck2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 26, 35, -0.6F, -0.2011F, -0.6261F, 1, 1, 5, -0.01F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(1.8F, 0.687F, 0.6704F);
        this.Neck2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0044F, -0.2224F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 9, 10, -3.0743F, -0.8109F, -2.4507F, 1, 0, 1, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.4F, 0.687F, 0.6704F);
        this.Neck2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.0044F, 0.2224F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 9, 10, -0.169F, -0.3037F, -2.4409F, 1, 0, 1, 0.0F, false));

        this.Cephalon2 = new ModelRenderer(this);
        this.Cephalon2.setRotationPoint(0.0F, -0.1489F, -4.0201F);
        this.Neck2.addChild(Cephalon2);
        this.setRotateAngle(Cephalon2, -0.0884F, 0.2171F, -0.0305F);


        this.Cranium2 = new ModelRenderer(this);
        this.Cranium2.setRotationPoint(-0.3F, -0.6F, 0.2F);
        this.Cephalon2.addChild(Cranium2);
        this.setRotateAngle(Cranium2, -0.1621F, 0.0F, 0.0F);


        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-3.8344F, 0.3953F, 1.2751F);
        this.Cranium2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0533F, -0.094F, -0.2311F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 14, 18, -2.8376F, -0.98F, -0.1462F, 2, 1, 3, 0.0F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.7782F, -1.0883F, 1.1827F);
        this.Cranium2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0845F, -0.26F, -0.2838F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 59, 45, -2.5724F, -0.3653F, -0.4316F, 1, 1, 3, -0.01F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.7218F, -1.0883F, 1.1827F);
        this.Cranium2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0907F, -0.024F, -0.252F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 35, -3.7791F, -0.7782F, -0.949F, 2, 2, 1, 0.0F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-1.5698F, 0.0496F, 0.1721F);
        this.Cranium2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1157F, 0.2036F, -0.186F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 36, 0, -5.9421F, -0.8232F, -1.4341F, 8, 2, 2, 0.01F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-3.12F, 1.4F, -6.76F);
        this.Cranium2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.001F, -0.3535F, -0.1878F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, 2.2289F, -1.8662F, 0.3421F, 2, 2, 5, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 42, 5, 0.2289F, -1.8662F, 0.3421F, 2, 2, 7, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 31, -1.7711F, -1.8662F, 0.3421F, 2, 2, 8, 0.0F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(5.9538F, 1.8484F, -3.7933F);
        this.Cranium2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0559F, 0.3454F, 0.2024F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 3, 56, 0.0F, -0.5F, -4.0F, 0, 1, 8, 0.0F, true));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.38F, 1.4F, -14.96F);
        this.Cranium2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0482F, 0.4794F, 0.0254F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 55, 1.1091F, -0.7898F, 0.9411F, 0, 1, 9, 0.0F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 4, 55, 0.4091F, -0.4898F, 0.0411F, 0, 1, 9, 0.0F, true));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-5.8538F, 1.8484F, -3.7933F);
        this.Cranium2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0559F, -0.3454F, -0.2024F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 3, 56, 0.0F, -0.5F, -4.0F, 0, 1, 8, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(2.7782F, -1.0883F, 1.1827F);
        this.Cranium2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0845F, 0.26F, 0.2838F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 22, 0, -0.2831F, 0.1511F, -0.9707F, 1, 1, 3, -0.01F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(3.5698F, 0.0496F, 0.1721F);
        this.Cranium2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.1157F, -0.2036F, 0.186F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 42, 27, -3.9828F, -0.5016F, -0.9966F, 8, 2, 2, 0.01F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(5.12F, 1.4F, -6.76F);
        this.Cranium2.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.001F, 0.3535F, 0.1878F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 52, -6.0723F, -1.4935F, -0.3385F, 2, 2, 5, 0.0F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 44, 17, -4.0723F, -1.4935F, -0.3385F, 2, 2, 7, 0.0F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 13, 34, -2.0723F, -1.4935F, -0.3385F, 2, 2, 8, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.8154F, -0.2753F, -5.6666F);
        this.Cranium2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0375F, -0.3468F, -0.2003F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 8, -4.0702F, -0.9547F, -3.2377F, 2, 2, 4, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(1.5846F, -0.2753F, -5.6666F);
        this.Cranium2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0375F, 0.3468F, 0.2003F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 55, 32, -0.1418F, -0.5074F, -4.0545F, 2, 2, 4, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.48F, 1.4F, -14.96F);
        this.Cranium2.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.0482F, -0.4794F, -0.0254F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 4, 55, -0.4091F, -0.4898F, 0.0411F, 0, 1, 9, 0.0F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 55, -1.1091F, -0.7898F, 0.9411F, 0, 1, 9, 0.0F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 22, 0, -1.4091F, -2.0898F, 0.9411F, 2, 2, 9, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(1.52F, 1.4F, -14.96F);
        this.Cranium2.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0482F, 0.4794F, 0.0254F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 28, 12, -2.3649F, -1.9945F, 0.0225F, 2, 2, 9, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.992F, 0.2397F, -3.1497F);
        this.Cranium2.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0013F, -0.0151F, -0.1739F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 56, 15, -2.9696F, -1.246F, -0.9697F, 2, 2, 2, 0.0F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(2.992F, 0.2397F, -3.1497F);
        this.Cranium2.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0013F, 0.0151F, 0.1739F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 38, 59, -1.0F, -0.9F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(1.0F, 1.4F, -0.48F);
        this.Cranium2.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.1484F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 35, 51, -2.48F, -1.8243F, -4.5079F, 3, 2, 5, -0.003F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(1.2782F, -1.0883F, 1.1827F);
        this.Cranium2.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0907F, 0.024F, 0.252F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 13, 33, -0.1572F, -0.2857F, -1.0405F, 2, 2, 1, 0.0F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(1.0F, 0.4F, -14.16F);
        this.Cranium2.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0436F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 0, -2.48F, -1.1558F, -0.5872F, 3, 2, 15, 0.0F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(5.8344F, 0.3953F, 1.2751F);
        this.Cranium2.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.0533F, 0.094F, 0.2311F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 28, 24, -1.1006F, -0.5128F, -0.3043F, 2, 1, 3, 0.0F, false));

        this.Jaw2 = new ModelRenderer(this);
        this.Jaw2.setRotationPoint(-0.0071F, 1.944F, 1.3495F);
        this.Cephalon2.addChild(Jaw2);
        this.setRotateAngle(Jaw2, 0.1639F, 0.0F, 0.0F);


        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(0.6432F, 0.3672F, -7.238F);
        this.Jaw2.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.0073F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 34, 35, -1.9F, -0.5F, -8.5F, 2, 1, 1, 0.0F, false));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(1.9071F, 0.4127F, -15.0842F);
        this.Jaw2.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0023F, 0.4364F, 0.005F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 51, -0.7061F, -0.8343F, -0.8246F, 0, 1, 11, 0.0F, true));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.3071F, 0.4127F, -15.0842F);
        this.Jaw2.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0023F, -0.4364F, -0.005F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 51, -1.4939F, -0.8343F, 0.1754F, 0, 1, 11, 0.0F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 18, -1.8939F, -0.5343F, 0.1754F, 1, 1, 11, 0.0F, false));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(-2.7486F, 0.3819F, -5.6269F);
        this.Jaw2.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0017F, -0.3493F, -0.0086F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 52, 51, -3.2226F, -0.523F, 1.0714F, 1, 1, 6, 0.0F, false));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(5.3628F, 0.3819F, -5.6269F);
        this.Jaw2.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0017F, 0.3493F, 0.0086F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 54, 0, -0.5961F, -0.499F, 0.0448F, 1, 1, 6, 0.0F, false));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(2.3071F, 0.4127F, -15.0842F);
        this.Jaw2.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0023F, 0.4364F, 0.005F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 14, 20, -1.8249F, -0.5222F, -1.0928F, 1, 1, 11, 0.0F, false));

        this.ForearmL3 = new ModelRenderer(this);
        this.ForearmL3.setRotationPoint(4.6F, 1.8328F, -2.7816F);
        this.Body3.addChild(ForearmL3);
        this.setRotateAngle(ForearmL3, -0.534F, 0.5242F, -0.9358F);


        this.Humerus_r1 = new ModelRenderer(this);
        this.Humerus_r1.setRotationPoint(2.2046F, 2.692F, 0.7172F);
        this.ForearmL3.addChild(Humerus_r1);
        this.setRotateAngle(Humerus_r1, 0.3888F, 0.0566F, 0.5173F);
        this.Humerus_r1.cubeList.add(new ModelBox(Humerus_r1, 42, 15, -3.7443F, -1.5379F, -1.7172F, 1, 1, 3, 0.0F, false));
        this.Humerus_r1.cubeList.add(new ModelBox(Humerus_r1, 14, 23, 0.2557F, -1.5379F, -1.7172F, 2, 1, 3, 0.0F, false));
        this.Humerus_r1.cubeList.add(new ModelBox(Humerus_r1, 0, 25, -2.7443F, -1.5379F, -0.9172F, 3, 1, 2, 0.0F, false));

        this.Radio_UlnaL3 = new ModelRenderer(this);
        this.Radio_UlnaL3.setRotationPoint(4.5F, 3.1F, 0.7F);
        this.ForearmL3.addChild(Radio_UlnaL3);
        this.setRotateAngle(Radio_UlnaL3, -0.7413F, -0.6027F, 0.5747F);


        this.Radio_Ulna_r1 = new ModelRenderer(this);
        this.Radio_Ulna_r1.setRotationPoint(0.9679F, 0.244F, -0.0594F);
        this.Radio_UlnaL3.addChild(Radio_Ulna_r1);
        this.setRotateAngle(Radio_Ulna_r1, 1.3537F, 0.6041F, 1.4174F);
        this.Radio_Ulna_r1.cubeList.add(new ModelBox(Radio_Ulna_r1, 36, 5, -0.4F, -0.4F, -0.6F, 5, 1, 1, 0.0F, false));
        this.Radio_Ulna_r1.cubeList.add(new ModelBox(Radio_Ulna_r1, 24, 52, 0.6F, -0.4F, -2.0F, 4, 1, 1, 0.0F, false));

        this.ManusL3 = new ModelRenderer(this);
        this.ManusL3.setRotationPoint(0.9679F, 4.544F, -2.0594F);
        this.Radio_UlnaL3.addChild(ManusL3);
        this.setRotateAngle(ManusL3, 0.6442F, -0.0278F, 0.193F);


        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ManusL3.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, -0.1745F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 40, 45, -2.5F, -0.9F, -4.0F, 5, 1, 4, 0.0F, false));

        this.ForearmL4 = new ModelRenderer(this);
        this.ForearmL4.setRotationPoint(-4.4F, 1.8328F, -2.7816F);
        this.Body3.addChild(ForearmL4);
        this.setRotateAngle(ForearmL4, 0.7196F, 0.8164F, 0.7772F);


        this.Humerus_r2 = new ModelRenderer(this);
        this.Humerus_r2.setRotationPoint(-2.2046F, 2.692F, 0.7172F);
        this.ForearmL4.addChild(Humerus_r2);
        this.setRotateAngle(Humerus_r2, 0.3888F, -0.0566F, -0.5173F);
        this.Humerus_r2.cubeList.add(new ModelBox(Humerus_r2, 42, 15, 2.7443F, -1.5379F, -1.7172F, 1, 1, 3, 0.0F, true));
        this.Humerus_r2.cubeList.add(new ModelBox(Humerus_r2, 14, 23, -2.2557F, -1.5379F, -1.7172F, 2, 1, 3, 0.0F, true));
        this.Humerus_r2.cubeList.add(new ModelBox(Humerus_r2, 0, 25, -0.2557F, -1.5379F, -0.9172F, 3, 1, 2, 0.0F, true));

        this.Radio_UlnaL4 = new ModelRenderer(this);
        this.Radio_UlnaL4.setRotationPoint(-4.5F, 3.1F, 0.7F);
        this.ForearmL4.addChild(Radio_UlnaL4);
        this.setRotateAngle(Radio_UlnaL4, -0.8172F, 0.0057F, -0.4891F);


        this.Radio_Ulna_r2 = new ModelRenderer(this);
        this.Radio_Ulna_r2.setRotationPoint(-0.9679F, 0.244F, -0.0594F);
        this.Radio_UlnaL4.addChild(Radio_Ulna_r2);
        this.setRotateAngle(Radio_Ulna_r2, 1.3537F, -0.6041F, -1.4174F);
        this.Radio_Ulna_r2.cubeList.add(new ModelBox(Radio_Ulna_r2, 36, 5, -4.6F, -0.4F, -0.6F, 5, 1, 1, 0.0F, true));
        this.Radio_Ulna_r2.cubeList.add(new ModelBox(Radio_Ulna_r2, 24, 52, -4.6F, -0.4F, -2.0F, 4, 1, 1, 0.0F, true));

        this.ManusL4 = new ModelRenderer(this);
        this.ManusL4.setRotationPoint(-0.9679F, 4.544F, -2.0594F);
        this.Radio_UlnaL4.addChild(ManusL4);
        this.setRotateAngle(ManusL4, 0.6631F, 0.2381F, -0.0353F);


        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ManusL4.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, 0.1745F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 40, 45, -2.5F, -0.9F, -4.0F, 5, 1, 4, 0.0F, true));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.2016F, 3.4506F);
        this.Basin.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.2664F, 0.2595F, -0.035F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 45, 32, -0.5F, -0.3431F, -0.0931F, 1, 1, 7, 0.0F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(1.9F, -2.0773F, -11.9065F);
        this.Tail1.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0F, 0.0648F, -0.1452F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 10, 2, -4.101F, 1.9711F, 16.8362F, 1, 0, 1, 0.0F, true));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 9, 8, -4.301F, 1.9711F, 14.8362F, 1, 0, 1, 0.0F, true));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 10, 0, -4.401F, 1.9711F, 12.8362F, 1, 0, 1, 0.0F, true));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.5F, -2.0773F, -11.9065F);
        this.Tail1.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0F, -0.0648F, 0.1452F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 10, 2, 0.83F, 2.3039F, 16.9835F, 1, 0, 1, 0.0F, false));
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 9, 8, 1.03F, 2.3039F, 14.9835F, 1, 0, 1, 0.0F, false));
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 10, 0, 1.13F, 2.3039F, 12.9835F, 1, 0, 1, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0522F, 6.9034F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0083F, -0.346F, -0.0475F);


        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(0.0F, 0.0392F, -0.2974F);
        this.Tail2.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0175F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 34, 35, -0.5F, -0.4015F, 0.0698F, 1, 1, 8, 0.002F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0306F, 7.5331F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1473F, -0.4755F, -0.0678F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 30, 24, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F, false));

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
