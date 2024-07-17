package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLesothosaurus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
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
    private final ModelRenderer leftLeg;
    private final ModelRenderer Femur_r1;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer Metatarsals_r1;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer Pes_r1;
    private final ModelRenderer rightLeg;
    private final ModelRenderer Femur_r2;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer Metatarsals_r2;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer Pes_r2;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r14;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r15;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r16;
    private final ModelRenderer tail4;
    private final ModelRenderer body;
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
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer chest;
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
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer leftArm;
    private final ModelRenderer Humerus_r1;
    private final ModelRenderer leftArm2;
    private final ModelRenderer Radio_Ulna_r1;
    private final ModelRenderer leftArm3;
    private final ModelRenderer Manus_r1;
    private final ModelRenderer rightArm;
    private final ModelRenderer Humerus_r2;
    private final ModelRenderer rightArm2;
    private final ModelRenderer Radio_Ulna_r2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer Manus_r2;
    private final ModelRenderer neck;
    private final ModelRenderer CervicalDistal_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer CervicalMedial_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer CervicalProximal_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Jugal_r1;
    private final ModelRenderer Quadratojugal_r1;
    private final ModelRenderer Premaxillary_r1;
    private final ModelRenderer Premaxillary_r2;
    private final ModelRenderer Squamosal_r1;
    private final ModelRenderer Squamosal_r2;
    private final ModelRenderer Squamosal_r3;
    private final ModelRenderer Squamosal_r4;
    private final ModelRenderer Squamosal_r5;
    private final ModelRenderer Squamosal_r6;
    private final ModelRenderer Squamosal_r7;
    private final ModelRenderer Squamosal_r8;
    private final ModelRenderer Squamosal_r9;
    private final ModelRenderer Squamosal_r10;
    private final ModelRenderer Squamosal_r11;
    private final ModelRenderer Squamosal_r12;
    private final ModelRenderer Squamosal_r13;
    private final ModelRenderer Premaxillary_r3;
    private final ModelRenderer Premaxillary_r4;
    private final ModelRenderer Squamosal_r14;
    private final ModelRenderer Squamosal_r15;
    private final ModelRenderer Squamosal_r16;
    private final ModelRenderer Squamosal_r17;
    private final ModelRenderer Squamosal_r18;
    private final ModelRenderer Squamosal_r19;
    private final ModelRenderer Squamosal_r20;
    private final ModelRenderer Squamosal_r21;
    private final ModelRenderer Teeth_r1;
    private final ModelRenderer Teeth_r2;
    private final ModelRenderer Teeth_r3;
    private final ModelRenderer HeadslopeL;
    private final ModelRenderer AntiorbitalAirSinus_r1;
    private final ModelRenderer AntiorbitalAirSinus_r2;
    private final ModelRenderer AntiorbitalAirSinus_r3;
    private final ModelRenderer AntiorbitalAirSinus_r4;
    private final ModelRenderer HeadslopeL2;
    private final ModelRenderer BrowL;
    private final ModelRenderer Crest_r1;
    private final ModelRenderer Crest_r2;
    private final ModelRenderer Jaw;
    private final ModelRenderer Predentary_r1;
    private final ModelRenderer Angular_r1;
    private final ModelRenderer Surangular_r1;
    private final ModelRenderer Squamosal_r22;
    private final ModelRenderer Surangular_r2;
    private final ModelRenderer Teeth_r4;
    private final ModelRenderer Squamosal_r23;
    private final ModelRenderer JawslopeL;
    private final ModelRenderer Dentary_r1;
    private final ModelRenderer Dentary_r2;
    private final ModelRenderer JawslopeL2;
    private final ModelRenderer MasseterR;

    public ModelSkeletonLesothosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -2.0F, -1.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.2002F, -0.0531F, -0.6527F);
        this.hips.cubeList.add(new ModelBox(hips, 24, 29, -0.5F, -1.0F, -2.9F, 1, 1, 5, -0.004F, false));
        this.hips.cubeList.add(new ModelBox(hips, 38, 3, 1.4F, -1.9F, -1.4F, 1, 1, 3, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 40, 20, 0.4F, -1.1F, -1.4F, 1, 1, 2, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 40, 20, -1.4F, -1.1F, -1.4F, 1, 1, 2, 0.0F, true));
        this.hips.cubeList.add(new ModelBox(hips, 38, 3, -2.4F, -1.9F, -1.4F, 1, 1, 3, 0.0F, true));
        this.hips.cubeList.add(new ModelBox(hips, 38, 50, 0.0F, -2.0F, -3.0F, 0, 1, 1, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 50, 36, 0.0F, -2.0F, 1.0F, 0, 1, 1, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 35, 50, 0.0F, -2.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.35F, -0.1551F, -0.6609F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.0594F, 0.0574F, -0.3497F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 18, 0.05F, 0.0579F, -1.0203F, 1, 3, 1, -0.2F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.35F, -0.1551F, -0.6609F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.3386F, 0.0574F, -0.3497F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.05F, 0.1287F, -0.2215F, 1, 3, 1, -0.19F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.35F, -0.1551F, -0.6609F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4311F, 0.0574F, -0.3497F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 18, -0.05F, 0.9425F, -1.7631F, 1, 1, 9, -0.31F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 8, 0.05F, 0.2599F, 2.4173F, 1, 1, 5, -0.11F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.35F, -0.1551F, -0.6609F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.7452F, 0.0574F, -0.3497F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 32, 0.05F, -0.5967F, 0.8469F, 1, 1, 2, -0.1F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.9F, -0.4F, -0.4F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.48F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 0, -0.5F, -1.1F, -1.1F, 1, 2, 2, -0.004F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 0, 3.3F, -1.1F, -1.1F, 1, 2, 2, -0.004F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.9F, -2.2F, -0.4F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 43, -0.5F, -0.0226F, -0.0047F, 1, 1, 2, -0.006F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 43, 3.3F, -0.0226F, -0.0047F, 1, 1, 2, -0.006F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.0F, -1.7F, -2.6F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2094F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 34, -0.5F, -0.3F, -1.5F, 1, 1, 3, -0.2F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 34, 3.5F, -0.3F, -1.5F, 1, 1, 3, -0.2F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.9F, -2.1F, -1.4F);
        this.hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1222F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 47, -0.5F, 0.0F, 0.0F, 1, 1, 1, -0.004F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 47, 3.3F, 0.0F, 0.0F, 1, 1, 1, -0.004F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(2.35F, -0.1551F, -0.6609F);
        this.hips.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4311F, -0.0574F, 0.3497F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 18, -0.95F, 0.9425F, -1.7631F, 1, 1, 9, -0.31F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 8, -1.05F, 0.2599F, 2.4173F, 1, 1, 5, -0.11F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(2.35F, -0.1551F, -0.6609F);
        this.hips.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7452F, -0.0574F, 0.3497F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 32, -1.05F, -0.5967F, 0.8469F, 1, 1, 2, -0.1F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(2.35F, -0.1551F, -0.6609F);
        this.hips.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.7052F, -0.0574F, 0.3497F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 10, -1.05F, 0.2998F, 0.4651F, 1, 1, 1, -0.2F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(2.35F, -0.1551F, -0.6609F);
        this.hips.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.0594F, -0.0574F, 0.3497F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 18, -1.05F, 0.0579F, -1.0203F, 1, 3, 1, -0.2F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(2.35F, -0.1551F, -0.6609F);
        this.hips.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.3386F, -0.0574F, 0.3497F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.05F, 0.1287F, -0.2215F, 1, 3, 1, -0.19F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.1F, -0.6F, -0.6F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -1.1447F, -0.1559F, -0.3136F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 39, 0.0F, -0.6728F, -0.4209F, 1, 7, 1, 0.0F, false));

        this.Femur_r1 = new ModelRenderer(this);
        this.Femur_r1.setRotationPoint(-1.4F, -0.5954F, 0.5854F);
        this.leftLeg.addChild(Femur_r1);
        this.setRotateAngle(Femur_r1, 0.2269F, 0.0F, 0.0F);
        this.Femur_r1.cubeList.add(new ModelBox(Femur_r1, 0, 8, 1.4F, -0.0774F, -1.0063F, 1, 3, 1, -0.1F, false));

        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.0F, 6.5046F, -0.0146F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 2.3289F, 0.1273F, 0.1197F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 22, 36, -0.3F, -0.0466F, -0.2783F, 1, 9, 1, -0.21F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 27, 36, -1.4F, -0.0466F, -0.3783F, 1, 9, 1, 0.0F, false));

        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-1.0F, 9.1229F, 0.5046F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.2934F, -0.4623F, 0.1339F);


        this.Metatarsals_r1 = new ModelRenderer(this);
        this.Metatarsals_r1.setRotationPoint(-2.0F, -15.7F, 0.2F);
        this.leftLeg3.addChild(Metatarsals_r1);
        this.setRotateAngle(Metatarsals_r1, -0.8727F, 0.0F, 0.0F);
        this.Metatarsals_r1.cubeList.add(new ModelBox(Metatarsals_r1, 9, 0, 1.5F, 10.0767F, 11.2776F, 2, 4, 1, -0.002F, false));

        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.4F, 2.5F, -2.8F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.7418F, 0.0F, 0.0F);


        this.Pes_r1 = new ModelRenderer(this);
        this.Pes_r1.setRotationPoint(-2.4F, -18.7F, 3.6F);
        this.leftLeg4.addChild(Pes_r1);
        this.setRotateAngle(Pes_r1, -0.576F, 0.0F, 0.0F);
        this.Pes_r1.cubeList.add(new ModelBox(Pes_r1, 28, 20, 1.0F, 17.4186F, 2.6358F, 3, 1, 5, 0.0F, false));

        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.1F, -0.6F, -0.6F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.5704F, 0.1033F, -0.86F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 39, -1.0F, -0.6728F, -0.4209F, 1, 7, 1, 0.0F, true));

        this.Femur_r2 = new ModelRenderer(this);
        this.Femur_r2.setRotationPoint(1.4F, -0.5954F, 0.5854F);
        this.rightLeg.addChild(Femur_r2);
        this.setRotateAngle(Femur_r2, 0.2269F, 0.0F, 0.0F);
        this.Femur_r2.cubeList.add(new ModelBox(Femur_r2, 0, 8, -2.4F, -0.0774F, -1.0063F, 1, 3, 1, -0.1F, true));

        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.5046F, -0.0146F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.23F, 0.038F, -0.0215F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 22, 36, -1.7F, -0.0466F, -0.2783F, 1, 9, 1, -0.21F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 27, 36, -0.6F, -0.0466F, -0.3783F, 1, 9, 1, 0.0F, true));

        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.7229F, 0.5046F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.9599F, 0.0F, 0.0F);


        this.Metatarsals_r2 = new ModelRenderer(this);
        this.Metatarsals_r2.setRotationPoint(2.0F, -15.4706F, 0.5277F);
        this.rightLeg3.addChild(Metatarsals_r2);
        this.setRotateAngle(Metatarsals_r2, -0.8727F, 0.0F, 0.0F);
        this.Metatarsals_r2.cubeList.add(new ModelBox(Metatarsals_r2, 9, 0, -3.5F, 10.0767F, 11.2776F, 2, 4, 1, -0.002F, true));

        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.4F, 2.7294F, -2.4723F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 2.0071F, 0.0F, 0.0F);


        this.Pes_r2 = new ModelRenderer(this);
        this.Pes_r2.setRotationPoint(2.4F, -18.7F, 3.6F);
        this.rightLeg4.addChild(Pes_r2);
        this.setRotateAngle(Pes_r2, -0.576F, 0.0F, 0.0F);
        this.Pes_r2.cubeList.add(new ModelBox(Pes_r2, 28, 20, -4.0F, 17.4186F, 2.6358F, 3, 1, 5, 0.0F, true));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.6F, 2.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0F, 0.2182F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 18, -0.5F, -0.4F, 0.0F, 1, 1, 5, -0.008F, false));
        this.tail.cubeList.add(new ModelBox(tail, 32, 50, 0.0F, -1.2F, 1.0F, 0, 1, 1, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 29, 50, 0.0F, -1.1F, 3.0F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.7F, 1.5F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.6981F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 0, 0.0F, 0.622F, 2.7472F, 0, 2, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 33, 0.0F, -0.6071F, 1.1662F, 0, 2, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 10, 0.0F, -2.0F, -0.3F, 0, 2, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1F, 5.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2241F, 0.261F, 0.021F);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 0, -0.5F, -0.257F, -0.0315F, 1, 1, 8, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 50, 0.0F, -0.857F, -0.0315F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 50, 0.0F, -0.757F, 1.9685F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 50, 0.0F, -0.657F, 3.9685F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 50, 0.0F, -0.657F, 5.9685F, 0, 1, 1, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.8F, -3.5F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.6981F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 5, 39, 0.0F, 3.887F, 6.0559F, 0, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 39, 8, 0.0F, 5.0819F, 7.6628F, 0, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 25, 0.0F, 1.7691F, 4.3855F, 0, 2, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.043F, 7.9685F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2712F, 0.3927F, -0.0036F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 18, -0.5F, -0.3007F, -0.0305F, 1, 1, 13, 0.003F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 50, 13, 0.0F, -0.6007F, -0.0305F, 0, 1, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 48, 49, 0.0F, -0.6007F, 1.9695F, 0, 1, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 15, 48, 0.0F, -0.6007F, 3.9695F, 0, 1, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 39, 0.0F, -0.6007F, 5.9695F, 0, 1, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 39, 13, 0.0F, -0.6007F, 7.9695F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.757F, -11.4685F);
        this.tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6981F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 18, 0.0F, 9.9746F, 13.9948F, 0, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 51, 18, 0.0F, 8.716F, 12.4405F, 0, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 29, 0.0F, 7.535F, 10.8233F, 0, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 38, 27, 0.0F, 6.3541F, 9.2061F, 0, 1, 1, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.5F, 0.1993F, 12.8695F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.3342F, 0.566F, -0.0389F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -1.0F, -0.4453F, -0.044F, 1, 1, 16, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.7F, -2.9F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.1786F, -0.0262F, 0.3043F);
        this.body.cubeList.add(new ModelBox(body, 28, 10, -0.5F, -0.2989F, -7.8655F, 1, 1, 8, 0.003F, false));
        this.body.cubeList.add(new ModelBox(body, 3, 51, 0.0F, -1.2989F, -7.8655F, 0, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 51, 2, 0.0F, -1.2989F, -5.8655F, 0, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 51, 0.0F, -1.2989F, -3.8655F, 0, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 41, 50, 0.0F, -1.2989F, -1.8655F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 0.1011F, -1.3655F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1515F, 0.0869F, -0.517F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 47, 6, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.1011F, -1.3655F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1186F, 0.1284F, -0.8214F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 17, 44, -1.9537F, -0.3007F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.1011F, -3.3655F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2411F, 0.2549F, -0.798F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 4, -2.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.1011F, -3.3655F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3053F, 0.1719F, -0.4971F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 47, 29, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 0.2011F, -5.3655F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3053F, 0.1719F, -0.4971F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 48, 44, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 0.2011F, -5.3655F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1605F, 0.3122F, -1.1562F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 47, 34, -3.6736F, -1.29F, -0.4463F, 1, 0, 1, 0.0F, true));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 0.2011F, -5.3655F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2411F, 0.2549F, -0.798F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 44, 38, -2.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.2011F, -7.3655F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1605F, 0.3122F, -1.1562F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 37, 0, -5.6736F, -1.29F, -0.4463F, 3, 0, 1, 0.0F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 0.2011F, -7.3655F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2411F, 0.2549F, -0.798F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 45, 8, -2.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.2011F, -7.3655F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3053F, 0.1719F, -0.4971F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 49, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 0.1011F, -1.3655F);
        this.body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1515F, -0.0869F, 0.517F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 47, 6, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 0.1011F, -1.3655F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1186F, -0.1284F, 0.8214F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 17, 44, 0.9537F, -0.3007F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 0.1011F, -3.3655F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.3053F, -0.1719F, 0.4971F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 47, 29, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 0.1011F, -3.3655F);
        this.body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2411F, -0.2549F, 0.798F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 44, 4, 0.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 0.2011F, -5.3655F);
        this.body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3053F, -0.1719F, 0.4971F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 48, 44, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, 0.2011F, -5.3655F);
        this.body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2411F, -0.2549F, 0.798F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 44, 38, 0.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 0.2011F, -5.3655F);
        this.body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1605F, -0.3122F, 1.1562F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 47, 34, 2.6736F, -1.29F, -0.4463F, 1, 0, 1, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, 0.2011F, -7.3655F);
        this.body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1605F, -0.3122F, 1.1562F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 37, 0, 2.6736F, -1.29F, -0.4463F, 3, 0, 1, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, 0.2011F, -7.3655F);
        this.body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2411F, -0.2549F, 0.798F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 45, 8, 0.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, 0.2011F, -7.3655F);
        this.body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.3053F, -0.1719F, 0.4971F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 49, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0011F, -7.8655F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.2182F, 0.1309F);


        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-2.8F, 3.0768F, -4.2078F);
        this.chest.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.7696F, -0.3931F, -0.3554F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 8, 8, 0.0F, -0.9137F, -1.9862F, 1, 2, 2, 0.0F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-2.3F, 1.5271F, -2.2267F);
        this.chest.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.6981F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 38, 27, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.003F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 38, 27, 4.1F, -0.5F, -2.5F, 1, 1, 3, 0.003F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-2.3F, 1.6271F, -1.5267F);
        this.chest.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.5934F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 5, 44, -0.5F, -1.0266F, -0.672F, 1, 1, 2, 0.0F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 5, 44, 4.1F, -1.0266F, -0.672F, 1, 1, 2, 0.0F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-2.3F, 1.6271F, -1.5267F);
        this.chest.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 1.117F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 44, 0, -0.5F, -1.2266F, -0.372F, 1, 1, 2, -0.003F, true));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 44, 0, 4.1F, -1.2266F, -0.372F, 1, 1, 2, -0.003F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(2.8F, 3.0768F, -4.2078F);
        this.chest.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.7696F, 0.3931F, 0.3554F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 8, 8, -1.0F, -0.9137F, -1.9862F, 1, 2, 2, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, -1.3F, 0.7F);
        this.chest.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.3491F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, -1.0F, 0.7F, -7.0F, 1, 1, 6, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 6, 51, -0.5F, -0.2F, -3.0F, 0, 1, 1, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 9, 51, -0.5F, -0.1F, -5.0F, 0, 1, 1, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 12, 51, -0.5F, 0.1F, -7.0F, 0, 1, 1, 0.0F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5F, 0.7F, -1.3F);
        this.chest.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.3838F, 0.2129F, -0.4821F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 31, 10, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, 0.7F, -1.3F);
        this.chest.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.3052F, 0.3169F, -0.7799F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 42, 43, -2.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, 0.7F, -1.3F);
        this.chest.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1985F, 0.3918F, -1.1431F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 16, 29, -5.6736F, -1.29F, -0.4463F, 3, 0, 1, 0.0F, true));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, 1.3F, -3.0F);
        this.chest.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.2391F, 0.4709F, -1.1261F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 30, 6, -4.6736F, -1.29F, -0.4463F, 2, 0, 1, 0.0F, true));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, 1.3F, -3.0F);
        this.chest.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.3719F, 0.3775F, -0.7572F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 43, 36, -2.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.5F, 1.3F, -3.0F);
        this.chest.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.4636F, 0.2527F, -0.4636F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 28, 23, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.5F, 2.0F, -5.0F);
        this.chest.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.6453F, 0.3342F, -0.4109F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 8, 21, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.5F, 2.0F, -5.0F);
        this.chest.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.531F, 0.5049F, -0.689F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 19, 5, -2.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, 2.0F, -5.0F);
        this.chest.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.6453F, -0.3342F, 0.4109F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 8, 21, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5F, 2.0F, -5.0F);
        this.chest.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.531F, -0.5049F, 0.689F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 19, 5, 0.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.5F, 1.3F, -3.0F);
        this.chest.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.4636F, -0.2527F, 0.4636F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 28, 23, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.5F, 1.3F, -3.0F);
        this.chest.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.3719F, -0.3775F, 0.7572F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 43, 36, 0.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(0.5F, 1.3F, -3.0F);
        this.chest.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.2391F, -0.4709F, 1.1261F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 30, 6, 2.6736F, -1.29F, -0.4463F, 2, 0, 1, 0.0F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.5F, 0.7F, -1.3F);
        this.chest.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.3052F, -0.3169F, 0.7799F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 42, 43, 0.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(0.5F, 0.7F, -1.3F);
        this.chest.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.1985F, -0.3918F, 1.1431F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 16, 29, 2.6736F, -1.29F, -0.4463F, 3, 0, 1, 0.0F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(0.5F, 0.7F, -1.3F);
        this.chest.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.3838F, -0.2129F, 0.4821F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 31, 10, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(2.7F, 4.4F, -3.7F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.2182F, 0.2182F, 0.0F);


        this.Humerus_r1 = new ModelRenderer(this);
        this.Humerus_r1.setRotationPoint(-0.5F, -0.4F, -0.5F);
        this.leftArm.addChild(Humerus_r1);
        this.setRotateAngle(Humerus_r1, -0.7418F, 0.0F, 0.0F);
        this.Humerus_r1.cubeList.add(new ModelBox(Humerus_r1, 19, 10, 0.0F, -0.3F, 0.3F, 1, 1, 4, 0.003F, false));

        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.1F, 2.7F, 2.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.6545F, 0.0F, 0.0F);


        this.Radio_Ulna_r1 = new ModelRenderer(this);
        this.Radio_Ulna_r1.setRotationPoint(-0.4F, 0.1F, 0.8F);
        this.leftArm2.addChild(Radio_Ulna_r1);
        this.setRotateAngle(Radio_Ulna_r1, 0.8378F, 0.0F, 0.0F);
        this.Radio_Ulna_r1.cubeList.add(new ModelBox(Radio_Ulna_r1, 0, 33, 0.0F, -1.6662F, -3.8486F, 1, 1, 4, -0.15F, false));
        this.Radio_Ulna_r1.cubeList.add(new ModelBox(Radio_Ulna_r1, 11, 33, 0.0F, -0.6662F, -3.8486F, 1, 1, 4, -0.1F, false));

        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.6F, 2.5F, -2.3F);
        this.leftArm2.addChild(leftArm3);


        this.Manus_r1 = new ModelRenderer(this);
        this.Manus_r1.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.leftArm3.addChild(Manus_r1);
        this.setRotateAngle(Manus_r1, 0.8574F, 0.1855F, 0.21F);
        this.Manus_r1.cubeList.add(new ModelBox(Manus_r1, 32, 39, -1.1F, -1.5083F, -1.8051F, 1, 2, 2, -0.002F, false));

        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-2.7F, 4.4F, -3.7F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.6584F, -0.5207F, 0.8684F);


        this.Humerus_r2 = new ModelRenderer(this);
        this.Humerus_r2.setRotationPoint(0.5F, -0.4F, -0.5F);
        this.rightArm.addChild(Humerus_r2);
        this.setRotateAngle(Humerus_r2, -0.7418F, 0.0F, 0.0F);
        this.Humerus_r2.cubeList.add(new ModelBox(Humerus_r2, 19, 10, -1.0F, -0.3F, 0.3F, 1, 1, 4, 0.003F, true));

        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.1F, 2.7F, 2.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.4363F, 0.0F, -0.6109F);


        this.Radio_Ulna_r2 = new ModelRenderer(this);
        this.Radio_Ulna_r2.setRotationPoint(0.4F, 0.1F, 0.8F);
        this.rightArm2.addChild(Radio_Ulna_r2);
        this.setRotateAngle(Radio_Ulna_r2, 0.8378F, 0.0F, 0.0F);
        this.Radio_Ulna_r2.cubeList.add(new ModelBox(Radio_Ulna_r2, 0, 33, -1.0F, -1.6662F, -3.8486F, 1, 1, 4, -0.15F, true));
        this.Radio_Ulna_r2.cubeList.add(new ModelBox(Radio_Ulna_r2, 11, 33, -1.0F, -0.6662F, -3.8486F, 1, 1, 4, -0.1F, true));

        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.6F, 2.5F, -2.3F);
        this.rightArm2.addChild(rightArm3);


        this.Manus_r2 = new ModelRenderer(this);
        this.Manus_r2.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.rightArm3.addChild(Manus_r2);
        this.setRotateAngle(Manus_r2, 0.8574F, -0.1855F, -0.21F);
        this.Manus_r2.cubeList.add(new ModelBox(Manus_r2, 32, 39, 0.1F, -1.5083F, -1.8051F, 1, 2, 2, -0.002F, true));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.1F, 2.1F, -5.0F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.3777F, -0.1418F, 0.164F);


        this.CervicalDistal_r1 = new ModelRenderer(this);
        this.CervicalDistal_r1.setRotationPoint(0.0F, -0.4866F, -0.1095F);
        this.neck.addChild(CervicalDistal_r1);
        this.setRotateAngle(CervicalDistal_r1, -0.0524F, 0.0F, 0.0F);
        this.CervicalDistal_r1.cubeList.add(new ModelBox(CervicalDistal_r1, 44, 25, -0.6F, 0.0269F, -1.8045F, 1, 1, 2, 0.003F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.1866F, -1.7095F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.1464F, -0.3706F, -0.2216F);


        this.CervicalMedial_r1 = new ModelRenderer(this);
        this.CervicalMedial_r1.setRotationPoint(0.0F, -0.1405F, -0.1284F);
        this.neck2.addChild(CervicalMedial_r1);
        this.setRotateAngle(CervicalMedial_r1, -0.8029F, 0.0F, 0.0F);
        this.CervicalMedial_r1.cubeList.add(new ModelBox(CervicalMedial_r1, 30, 0, -0.6F, -0.3423F, -3.6641F, 1, 1, 4, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -2.6405F, -2.6284F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3001F, -0.4294F, -0.2322F);


        this.CervicalProximal_r1 = new ModelRenderer(this);
        this.CervicalProximal_r1.setRotationPoint(-0.6F, -0.1545F, 0.2842F);
        this.neck3.addChild(CervicalProximal_r1);
        this.setRotateAngle(CervicalProximal_r1, -0.1571F, 0.0F, 0.0F);
        this.CervicalProximal_r1.cubeList.add(new ModelBox(CervicalProximal_r1, 39, 8, 0.0F, -0.2361F, -3.1094F, 1, 1, 3, -0.002F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.6F, -0.2912F, -2.1069F);
        this.neck3.addChild(Head);
        this.setRotateAngle(Head, 0.0084F, 0.0023F, -0.2618F);


        this.Jugal_r1 = new ModelRenderer(this);
        this.Jugal_r1.setRotationPoint(0.6F, 1.0306F, -1.8639F);
        this.Head.addChild(Jugal_r1);
        this.setRotateAngle(Jugal_r1, 0.576F, 0.0F, 0.0F);
        this.Jugal_r1.cubeList.add(new ModelBox(Jugal_r1, 5, 48, -0.8F, -0.4F, -0.4F, 1, 1, 1, 0.003F, true));
        this.Jugal_r1.cubeList.add(new ModelBox(Jugal_r1, 5, 48, -0.4F, -0.4F, -0.4F, 1, 1, 1, 0.0F, false));

        this.Quadratojugal_r1 = new ModelRenderer(this);
        this.Quadratojugal_r1.setRotationPoint(0.7F, 0.8806F, -0.7696F);
        this.Head.addChild(Quadratojugal_r1);
        this.setRotateAngle(Quadratojugal_r1, 0.1222F, 0.0F, 0.0F);
        this.Quadratojugal_r1.cubeList.add(new ModelBox(Quadratojugal_r1, 26, 10, -1.0F, -0.5F, -1.0F, 1, 1, 2, 0.001F, true));
        this.Quadratojugal_r1.cubeList.add(new ModelBox(Quadratojugal_r1, 26, 10, -0.4F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.Premaxillary_r1 = new ModelRenderer(this);
        this.Premaxillary_r1.setRotationPoint(0.2F, 0.1545F, -2.086F);
        this.Head.addChild(Premaxillary_r1);
        this.setRotateAngle(Premaxillary_r1, 0.576F, 0.0F, 0.0F);
        this.Premaxillary_r1.cubeList.add(new ModelBox(Premaxillary_r1, 28, 47, -0.5F, -0.5215F, -0.7748F, 1, 1, 1, -0.2F, true));
        this.Premaxillary_r1.cubeList.add(new ModelBox(Premaxillary_r1, 28, 47, 0.1F, -0.5215F, -0.7748F, 1, 1, 1, -0.2F, false));

        this.Premaxillary_r2 = new ModelRenderer(this);
        this.Premaxillary_r2.setRotationPoint(0.2F, 0.1545F, -2.086F);
        this.Head.addChild(Premaxillary_r2);
        this.setRotateAngle(Premaxillary_r2, 0.4363F, 0.0F, 0.0F);
        this.Premaxillary_r2.cubeList.add(new ModelBox(Premaxillary_r2, 23, 47, -0.5F, -0.5169F, -0.2248F, 1, 1, 1, -0.2F, true));
        this.Premaxillary_r2.cubeList.add(new ModelBox(Premaxillary_r2, 23, 47, 0.1F, -0.5169F, -0.2248F, 1, 1, 1, -0.2F, false));

        this.Squamosal_r1 = new ModelRenderer(this);
        this.Squamosal_r1.setRotationPoint(0.7F, -0.5231F, -1.0791F);
        this.Head.addChild(Squamosal_r1);
        this.setRotateAngle(Squamosal_r1, 0.0175F, 0.0F, 0.0F);
        this.Squamosal_r1.cubeList.add(new ModelBox(Squamosal_r1, 33, 47, -1.0F, -0.0926F, 0.1494F, 1, 1, 1, 0.0F, true));
        this.Squamosal_r1.cubeList.add(new ModelBox(Squamosal_r1, 33, 47, -0.4F, -0.0926F, 0.1494F, 1, 1, 1, -0.0001F, false));

        this.Squamosal_r2 = new ModelRenderer(this);
        this.Squamosal_r2.setRotationPoint(0.7F, -0.0231F, -0.9791F);
        this.Head.addChild(Squamosal_r2);
        this.setRotateAngle(Squamosal_r2, 0.2967F, 0.0F, 0.0F);
        this.Squamosal_r2.cubeList.add(new ModelBox(Squamosal_r2, 10, 48, -1.0F, -0.5369F, -0.7F, 1, 1, 1, -0.0001F, true));
        this.Squamosal_r2.cubeList.add(new ModelBox(Squamosal_r2, 0, 48, -0.5F, 0.0F, -1.5F, 1, 1, 1, -0.0002F, false));
        this.Squamosal_r2.cubeList.add(new ModelBox(Squamosal_r2, 10, 48, -0.4F, -0.5369F, -0.7F, 1, 1, 1, 0.0F, false));

        this.Squamosal_r3 = new ModelRenderer(this);
        this.Squamosal_r3.setRotationPoint(-0.03F, 1.1088F, -0.6057F);
        this.Head.addChild(Squamosal_r3);
        this.setRotateAngle(Squamosal_r3, 0.5847F, 0.0F, 0.0F);
        this.Squamosal_r3.cubeList.add(new ModelBox(Squamosal_r3, 44, 45, -0.5F, -0.7F, -0.3F, 1, 1, 1, -0.2F, true));
        this.Squamosal_r3.cubeList.add(new ModelBox(Squamosal_r3, 44, 45, 0.56F, -0.7F, -0.3F, 1, 1, 1, -0.2F, false));

        this.Squamosal_r4 = new ModelRenderer(this);
        this.Squamosal_r4.setRotationPoint(-0.03F, 0.1088F, -1.0057F);
        this.Head.addChild(Squamosal_r4);
        this.setRotateAngle(Squamosal_r4, -0.2182F, 0.0F, 0.0F);
        this.Squamosal_r4.cubeList.add(new ModelBox(Squamosal_r4, 32, 44, -0.5F, -0.7971F, -0.1969F, 1, 1, 1, -0.2F, true));
        this.Squamosal_r4.cubeList.add(new ModelBox(Squamosal_r4, 32, 44, 0.56F, -0.7971F, -0.1969F, 1, 1, 1, -0.2F, false));

        this.Squamosal_r5 = new ModelRenderer(this);
        this.Squamosal_r5.setRotationPoint(-0.03F, 0.7088F, -0.9057F);
        this.Head.addChild(Squamosal_r5);
        this.setRotateAngle(Squamosal_r5, 0.0436F, 0.0F, 0.0F);
        this.Squamosal_r5.cubeList.add(new ModelBox(Squamosal_r5, 45, 13, -0.5F, -0.8009F, -0.2706F, 1, 1, 1, -0.201F, true));
        this.Squamosal_r5.cubeList.add(new ModelBox(Squamosal_r5, 45, 13, 0.56F, -0.8009F, -0.2706F, 1, 1, 1, -0.201F, false));

        this.Squamosal_r6 = new ModelRenderer(this);
        this.Squamosal_r6.setRotationPoint(0.07F, 0.671F, -1.9684F);
        this.Head.addChild(Squamosal_r6);
        this.setRotateAngle(Squamosal_r6, -0.2007F, -0.2443F, 0.0F);
        this.Squamosal_r6.cubeList.add(new ModelBox(Squamosal_r6, 46, 40, -0.5F, -0.2071F, -0.7403F, 1, 1, 1, -0.101F, true));

        this.Squamosal_r7 = new ModelRenderer(this);
        this.Squamosal_r7.setRotationPoint(0.1112F, 0.6218F, -1.7077F);
        this.Head.addChild(Squamosal_r7);
        this.setRotateAngle(Squamosal_r7, 0.4116F, -0.1049F, -0.0511F);
        this.Squamosal_r7.cubeList.add(new ModelBox(Squamosal_r7, 47, 22, -0.5412F, -0.3134F, -0.6141F, 1, 1, 1, -0.1F, true));

        this.Squamosal_r8 = new ModelRenderer(this);
        this.Squamosal_r8.setRotationPoint(-0.0271F, 0.7011F, -1.9229F);
        this.Head.addChild(Squamosal_r8);
        this.setRotateAngle(Squamosal_r8, 0.4105F, -0.1259F, -0.0169F);
        this.Squamosal_r8.cubeList.add(new ModelBox(Squamosal_r8, 8, 18, -0.5859F, -0.5F, -0.5F, 1, 1, 1, -0.25F, true));
        this.Squamosal_r8.cubeList.add(new ModelBox(Squamosal_r8, 7, 25, -0.4229F, -0.5F, -0.5F, 1, 1, 1, -0.1F, true));

        this.Squamosal_r9 = new ModelRenderer(this);
        this.Squamosal_r9.setRotationPoint(0.1112F, 0.6218F, -1.7077F);
        this.Head.addChild(Squamosal_r9);
        this.setRotateAngle(Squamosal_r9, 1.0922F, -0.1049F, -0.0511F);
        this.Squamosal_r9.cubeList.add(new ModelBox(Squamosal_r9, 46, 19, -0.5412F, -0.4356F, -0.3712F, 1, 1, 1, -0.099F, true));

        this.Squamosal_r10 = new ModelRenderer(this);
        this.Squamosal_r10.setRotationPoint(0.1112F, 0.6218F, -1.7077F);
        this.Head.addChild(Squamosal_r10);
        this.setRotateAngle(Squamosal_r10, 0.2632F, -0.1049F, -0.0511F);
        this.Squamosal_r10.cubeList.add(new ModelBox(Squamosal_r10, 46, 31, -0.5412F, -0.719F, -0.6094F, 1, 1, 1, -0.101F, true));

        this.Squamosal_r11 = new ModelRenderer(this);
        this.Squamosal_r11.setRotationPoint(0.07F, 0.671F, -1.9684F);
        this.Head.addChild(Squamosal_r11);
        this.setRotateAngle(Squamosal_r11, 0.7679F, -0.2443F, 0.0F);
        this.Squamosal_r11.cubeList.add(new ModelBox(Squamosal_r11, 18, 47, -0.5F, -0.7326F, -0.8272F, 1, 1, 1, -0.1F, true));

        this.Squamosal_r12 = new ModelRenderer(this);
        this.Squamosal_r12.setRotationPoint(0.17F, 1.6082F, -2.7139F);
        this.Head.addChild(Squamosal_r12);
        this.setRotateAngle(Squamosal_r12, 0.0825F, -0.2201F, -0.1033F);
        this.Squamosal_r12.cubeList.add(new ModelBox(Squamosal_r12, 11, 39, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, true));

        this.Squamosal_r13 = new ModelRenderer(this);
        this.Squamosal_r13.setRotationPoint(-0.03F, 2.3863F, -3.9687F);
        this.Head.addChild(Squamosal_r13);
        this.setRotateAngle(Squamosal_r13, 0.5323F, 0.0F, 0.0F);
        this.Squamosal_r13.cubeList.add(new ModelBox(Squamosal_r13, 18, 33, -0.1F, -0.6F, -0.5F, 1, 1, 1, -0.3F, true));

        this.Premaxillary_r3 = new ModelRenderer(this);
        this.Premaxillary_r3.setRotationPoint(0.5F, 2.3572F, -4.2886F);
        this.Head.addChild(Premaxillary_r3);
        this.setRotateAngle(Premaxillary_r3, 0.8901F, 0.0F, 0.0F);
        this.Premaxillary_r3.cubeList.add(new ModelBox(Premaxillary_r3, 32, 29, -0.5F, -0.3808F, -0.1536F, 1, 1, 3, -0.21F, false));

        this.Premaxillary_r4 = new ModelRenderer(this);
        this.Premaxillary_r4.setRotationPoint(0.5F, 2.4572F, -4.2886F);
        this.Head.addChild(Premaxillary_r4);
        this.setRotateAngle(Premaxillary_r4, 0.5061F, 0.0F, 0.0F);
        this.Premaxillary_r4.cubeList.add(new ModelBox(Premaxillary_r4, 0, 25, -0.5F, -0.4683F, -0.4052F, 1, 1, 4, -0.201F, false));

        this.Squamosal_r14 = new ModelRenderer(this);
        this.Squamosal_r14.setRotationPoint(0.8888F, 0.6218F, -1.7077F);
        this.Head.addChild(Squamosal_r14);
        this.setRotateAngle(Squamosal_r14, 0.2632F, 0.1049F, 0.0511F);
        this.Squamosal_r14.cubeList.add(new ModelBox(Squamosal_r14, 46, 31, -0.4588F, -0.719F, -0.6094F, 1, 1, 1, -0.101F, false));

        this.Squamosal_r15 = new ModelRenderer(this);
        this.Squamosal_r15.setRotationPoint(1.03F, 2.3863F, -3.9687F);
        this.Head.addChild(Squamosal_r15);
        this.setRotateAngle(Squamosal_r15, 0.5323F, 0.0F, 0.0F);
        this.Squamosal_r15.cubeList.add(new ModelBox(Squamosal_r15, 18, 33, -0.9F, -0.6F, -0.5F, 1, 1, 1, -0.3F, false));

        this.Squamosal_r16 = new ModelRenderer(this);
        this.Squamosal_r16.setRotationPoint(0.83F, 1.6082F, -2.7139F);
        this.Head.addChild(Squamosal_r16);
        this.setRotateAngle(Squamosal_r16, 0.0825F, 0.2201F, 0.1033F);
        this.Squamosal_r16.cubeList.add(new ModelBox(Squamosal_r16, 11, 39, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

        this.Squamosal_r17 = new ModelRenderer(this);
        this.Squamosal_r17.setRotationPoint(0.93F, 0.671F, -1.9684F);
        this.Head.addChild(Squamosal_r17);
        this.setRotateAngle(Squamosal_r17, -0.2007F, 0.2443F, 0.0F);
        this.Squamosal_r17.cubeList.add(new ModelBox(Squamosal_r17, 46, 40, -0.5F, -0.2071F, -0.7403F, 1, 1, 1, -0.101F, false));

        this.Squamosal_r18 = new ModelRenderer(this);
        this.Squamosal_r18.setRotationPoint(0.93F, 0.671F, -1.9684F);
        this.Head.addChild(Squamosal_r18);
        this.setRotateAngle(Squamosal_r18, 0.7679F, 0.2443F, 0.0F);
        this.Squamosal_r18.cubeList.add(new ModelBox(Squamosal_r18, 18, 47, -0.5F, -0.7326F, -0.8272F, 1, 1, 1, -0.1F, false));

        this.Squamosal_r19 = new ModelRenderer(this);
        this.Squamosal_r19.setRotationPoint(0.8888F, 0.6218F, -1.7077F);
        this.Head.addChild(Squamosal_r19);
        this.setRotateAngle(Squamosal_r19, 1.0922F, 0.1049F, 0.0511F);
        this.Squamosal_r19.cubeList.add(new ModelBox(Squamosal_r19, 46, 19, -0.4588F, -0.4356F, -0.3712F, 1, 1, 1, -0.099F, false));

        this.Squamosal_r20 = new ModelRenderer(this);
        this.Squamosal_r20.setRotationPoint(1.0271F, 0.7011F, -1.9229F);
        this.Head.addChild(Squamosal_r20);
        this.setRotateAngle(Squamosal_r20, 0.4105F, 0.1259F, 0.0169F);
        this.Squamosal_r20.cubeList.add(new ModelBox(Squamosal_r20, 8, 18, -0.4141F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));
        this.Squamosal_r20.cubeList.add(new ModelBox(Squamosal_r20, 7, 25, -0.5771F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

        this.Squamosal_r21 = new ModelRenderer(this);
        this.Squamosal_r21.setRotationPoint(0.8888F, 0.6218F, -1.7077F);
        this.Head.addChild(Squamosal_r21);
        this.setRotateAngle(Squamosal_r21, 0.4116F, 0.1049F, 0.0511F);
        this.Squamosal_r21.cubeList.add(new ModelBox(Squamosal_r21, 47, 22, -0.4588F, -0.3134F, -0.6141F, 1, 1, 1, -0.1F, false));

        this.Teeth_r1 = new ModelRenderer(this);
        this.Teeth_r1.setRotationPoint(0.6982F, 2.4712F, -4.0765F);
        this.Head.addChild(Teeth_r1);
        this.setRotateAngle(Teeth_r1, 0.4712F, 0.0167F, 0.0055F);
        this.Teeth_r1.cubeList.add(new ModelBox(Teeth_r1, 0, 54, -0.7F, -0.4F, -0.5F, 1, 1, 1, -0.21F, false));

        this.Teeth_r2 = new ModelRenderer(this);
        this.Teeth_r2.setRotationPoint(0.1924F, 1.5633F, -2.295F);
        this.Head.addChild(Teeth_r2);
        this.setRotateAngle(Teeth_r2, 0.4734F, -0.0945F, -0.0452F);
        this.Teeth_r2.cubeList.add(new ModelBox(Teeth_r2, 14, 39, -0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0001F, true));

        this.Teeth_r3 = new ModelRenderer(this);
        this.Teeth_r3.setRotationPoint(0.8076F, 1.5633F, -2.295F);
        this.Head.addChild(Teeth_r3);
        this.setRotateAngle(Teeth_r3, 0.4734F, 0.0945F, 0.0452F);
        this.Teeth_r3.cubeList.add(new ModelBox(Teeth_r3, 14, 39, 0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0001F, false));

        this.HeadslopeL = new ModelRenderer(this);
        this.HeadslopeL.setRotationPoint(1.0F, 0.5415F, 1.1145F);
        this.Head.addChild(HeadslopeL);


        this.AntiorbitalAirSinus_r1 = new ModelRenderer(this);
        this.AntiorbitalAirSinus_r1.setRotationPoint(-0.7396F, 0.6419F, -3.8468F);
        this.HeadslopeL.addChild(AntiorbitalAirSinus_r1);
        this.setRotateAngle(AntiorbitalAirSinus_r1, 0.7762F, -0.1911F, -0.0862F);
        this.AntiorbitalAirSinus_r1.cubeList.add(new ModelBox(AntiorbitalAirSinus_r1, 7, 33, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.21F, true));

        this.AntiorbitalAirSinus_r2 = new ModelRenderer(this);
        this.AntiorbitalAirSinus_r2.setRotationPoint(-0.698F, 1.1782F, -3.8222F);
        this.HeadslopeL.addChild(AntiorbitalAirSinus_r2);
        this.setRotateAngle(AntiorbitalAirSinus_r2, 0.3573F, -0.1911F, -0.0862F);
        this.AntiorbitalAirSinus_r2.cubeList.add(new ModelBox(AntiorbitalAirSinus_r2, 39, 39, -0.5F, -0.5F, -0.9F, 1, 1, 2, -0.2F, true));

        this.AntiorbitalAirSinus_r3 = new ModelRenderer(this);
        this.AntiorbitalAirSinus_r3.setRotationPoint(-0.2604F, 0.6419F, -3.8468F);
        this.HeadslopeL.addChild(AntiorbitalAirSinus_r3);
        this.setRotateAngle(AntiorbitalAirSinus_r3, 0.7762F, 0.1911F, 0.0862F);
        this.AntiorbitalAirSinus_r3.cubeList.add(new ModelBox(AntiorbitalAirSinus_r3, 7, 33, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.21F, false));

        this.AntiorbitalAirSinus_r4 = new ModelRenderer(this);
        this.AntiorbitalAirSinus_r4.setRotationPoint(-0.302F, 1.1782F, -3.8222F);
        this.HeadslopeL.addChild(AntiorbitalAirSinus_r4);
        this.setRotateAngle(AntiorbitalAirSinus_r4, 0.3573F, 0.1911F, 0.0862F);
        this.AntiorbitalAirSinus_r4.cubeList.add(new ModelBox(AntiorbitalAirSinus_r4, 39, 39, -0.5F, -0.5F, -0.9F, 1, 1, 2, -0.2F, false));

        this.HeadslopeL2 = new ModelRenderer(this);
        this.HeadslopeL2.setRotationPoint(0.0F, 0.5415F, 1.1145F);
        this.Head.addChild(HeadslopeL2);


        this.BrowL = new ModelRenderer(this);
        this.BrowL.setRotationPoint(1.0147F, 0.5239F, -2.5201F);
        this.Head.addChild(BrowL);
        this.setRotateAngle(BrowL, -0.0698F, 0.0F, 0.0F);


        this.Crest_r1 = new ModelRenderer(this);
        this.Crest_r1.setRotationPoint(-1.1778F, 0.2405F, -0.1382F);
        this.BrowL.addChild(Crest_r1);
        this.setRotateAngle(Crest_r1, 0.9254F, -0.2221F, -0.4138F);
        this.Crest_r1.cubeList.add(new ModelBox(Crest_r1, 12, 44, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.4F, true));

        this.Crest_r2 = new ModelRenderer(this);
        this.Crest_r2.setRotationPoint(0.1483F, 0.2405F, -0.1382F);
        this.BrowL.addChild(Crest_r2);
        this.setRotateAngle(Crest_r2, 0.9254F, 0.2221F, 0.4138F);
        this.Crest_r2.cubeList.add(new ModelBox(Crest_r2, 12, 44, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.7415F, -0.0855F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0785F, 0.0F, 0.0F);


        this.Predentary_r1 = new ModelRenderer(this);
        this.Predentary_r1.setRotationPoint(0.5F, 3.1896F, -2.9453F);
        this.Jaw.addChild(Predentary_r1);
        this.setRotateAngle(Predentary_r1, 0.5236F, 0.0F, 0.0F);
        this.Predentary_r1.cubeList.add(new ModelBox(Predentary_r1, 43, 48, -0.5F, -0.6F, -0.8F, 1, 1, 1, -0.2F, false));

        this.Angular_r1 = new ModelRenderer(this);
        this.Angular_r1.setRotationPoint(0.0F, 1.8156F, -0.9069F);
        this.Jaw.addChild(Angular_r1);
        this.setRotateAngle(Angular_r1, 0.5061F, 0.0F, 0.0F);
        this.Angular_r1.cubeList.add(new ModelBox(Angular_r1, 5, 39, -0.5F, -0.7293F, -0.4709F, 1, 1, 3, -0.19F, true));
        this.Angular_r1.cubeList.add(new ModelBox(Angular_r1, 5, 39, 0.5F, -0.7293F, -0.4709F, 1, 1, 3, -0.19F, false));

        this.Surangular_r1 = new ModelRenderer(this);
        this.Surangular_r1.setRotationPoint(0.0F, 0.9181F, -0.825F);
        this.Jaw.addChild(Surangular_r1);
        this.setRotateAngle(Surangular_r1, 0.6545F, 0.0F, 0.0F);
        this.Surangular_r1.cubeList.add(new ModelBox(Surangular_r1, 28, 20, -0.5F, -0.2312F, -0.7667F, 1, 1, 1, -0.21F, true));
        this.Surangular_r1.cubeList.add(new ModelBox(Surangular_r1, 28, 20, 0.5F, -0.2312F, -0.7667F, 1, 1, 1, -0.21F, false));

        this.Squamosal_r22 = new ModelRenderer(this);
        this.Squamosal_r22.setRotationPoint(-0.03F, 1.6448F, -3.8833F);
        this.Jaw.addChild(Squamosal_r22);
        this.setRotateAngle(Squamosal_r22, 0.5323F, 0.0F, 0.0F);
        this.Squamosal_r22.cubeList.add(new ModelBox(Squamosal_r22, 18, 33, -0.61F, 0.9F, 2.0F, 1, 1, 1, -0.3F, true));

        this.Surangular_r2 = new ModelRenderer(this);
        this.Surangular_r2.setRotationPoint(0.0F, 1.0181F, -0.325F);
        this.Jaw.addChild(Surangular_r2);
        this.setRotateAngle(Surangular_r2, 0.3578F, 0.0F, 0.0F);
        this.Surangular_r2.cubeList.add(new ModelBox(Surangular_r2, 16, 23, -0.5F, -0.5F, -0.6F, 1, 1, 2, -0.2F, true));
        this.Surangular_r2.cubeList.add(new ModelBox(Surangular_r2, 16, 23, 0.5F, -0.5F, -0.6F, 1, 1, 2, -0.2F, false));

        this.Teeth_r4 = new ModelRenderer(this);
        this.Teeth_r4.setRotationPoint(0.4695F, 2.2312F, -2.2154F);
        this.Jaw.addChild(Teeth_r4);
        this.setRotateAngle(Teeth_r4, 0.6383F, 0.0F, 0.0F);
        this.Teeth_r4.cubeList.add(new ModelBox(Teeth_r4, 39, 13, -0.4695F, -0.4F, -1.7F, 1, 1, 3, -0.201F, false));

        this.Squamosal_r23 = new ModelRenderer(this);
        this.Squamosal_r23.setRotationPoint(1.03F, 1.6448F, -3.8833F);
        this.Jaw.addChild(Squamosal_r23);
        this.setRotateAngle(Squamosal_r23, 0.5323F, 0.0F, 0.0F);
        this.Squamosal_r23.cubeList.add(new ModelBox(Squamosal_r23, 18, 33, -0.39F, 0.9F, 2.0F, 1, 1, 1, -0.3F, false));

        this.JawslopeL = new ModelRenderer(this);
        this.JawslopeL.setRotationPoint(1.0F, 0.0413F, 1.699F);
        this.Jaw.addChild(JawslopeL);


        this.Dentary_r1 = new ModelRenderer(this);
        this.Dentary_r1.setRotationPoint(-0.6958F, 2.2653F, -3.6814F);
        this.JawslopeL.addChild(Dentary_r1);
        this.setRotateAngle(Dentary_r1, 0.6598F, -0.0998F, -0.0982F);
        this.Dentary_r1.cubeList.add(new ModelBox(Dentary_r1, 16, 18, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.2F, true));

        this.Dentary_r2 = new ModelRenderer(this);
        this.Dentary_r2.setRotationPoint(-0.3042F, 2.2653F, -3.6814F);
        this.JawslopeL.addChild(Dentary_r2);
        this.setRotateAngle(Dentary_r2, 0.6598F, 0.0998F, 0.0982F);
        this.Dentary_r2.cubeList.add(new ModelBox(Dentary_r2, 16, 18, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.2F, false));

        this.JawslopeL2 = new ModelRenderer(this);
        this.JawslopeL2.setRotationPoint(0.0F, 0.0413F, 1.699F);
        this.Jaw.addChild(JawslopeL2);


        this.MasseterR = new ModelRenderer(this);
        this.MasseterR.setRotationPoint(-0.3F, -1.7587F, 2.399F);
        this.Jaw.addChild(MasseterR);

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
