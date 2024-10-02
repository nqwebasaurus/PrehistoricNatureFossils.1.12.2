package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEocursor extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Eocursor;
    private final ModelRenderer basin_r1;
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
    private final ModelRenderer LegL;
    private final ModelRenderer Femur_r1;
    private final ModelRenderer Femur_r2;
    private final ModelRenderer Femur_r3;
    private final ModelRenderer KneeL;
    private final ModelRenderer Tibia_r1;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer Metatarsals_r1;
    private final ModelRenderer Metatarsals_r2;
    private final ModelRenderer PesL;
    private final ModelRenderer Pes_r1;
    private final ModelRenderer LegL2;
    private final ModelRenderer Femur_r4;
    private final ModelRenderer Femur_r5;
    private final ModelRenderer Femur_r6;
    private final ModelRenderer KneeL2;
    private final ModelRenderer Tibia_r2;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer Metatarsals_r3;
    private final ModelRenderer Metatarsals_r4;
    private final ModelRenderer PesL2;
    private final ModelRenderer Pes_r2;
    private final ModelRenderer Tail1;
    private final ModelRenderer Caudalproximal_r1;
    private final ModelRenderer Caudalproximal_r2;
    private final ModelRenderer Tail2;
    private final ModelRenderer Caudalmedialproximal_r1;
    private final ModelRenderer Caudalproximal_r3;
    private final ModelRenderer Tail3;
    private final ModelRenderer Caudalmedialdistal_r1;
    private final ModelRenderer Tail4;
    private final ModelRenderer Caudaldistal_r1;
    private final ModelRenderer Body;
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
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer Thorax_r1;
    private final ModelRenderer Thorax_r2;
    private final ModelRenderer Chest;
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
    private final ModelRenderer Scapulo_Coracoid_r1;
    private final ModelRenderer ArmL;
    private final ModelRenderer Humerus_r1;
    private final ModelRenderer ElbowL;
    private final ModelRenderer Radio_Ulna_r1;
    private final ModelRenderer HandL;
    private final ModelRenderer Manus_r1;
    private final ModelRenderer Manus_r2;
    private final ModelRenderer ArmL2;
    private final ModelRenderer Humerus_r2;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer Radio_Ulna_r2;
    private final ModelRenderer HandL2;
    private final ModelRenderer Manus_r3;
    private final ModelRenderer Manus_r4;
    private final ModelRenderer Neck1;
    private final ModelRenderer CervicalDistal_r1;
    private final ModelRenderer Neck2;
    private final ModelRenderer CervicalMedial_r1;
    private final ModelRenderer Neck3;
    private final ModelRenderer Head;
    private final ModelRenderer Squamosal_r1;
    private final ModelRenderer Premaxillary_r1;
    private final ModelRenderer Premaxillary_r2;
    private final ModelRenderer Premaxillary_r3;
    private final ModelRenderer Premaxillary_r4;
    private final ModelRenderer Premaxillary_r5;
    private final ModelRenderer Premaxillary_r6;
    private final ModelRenderer Premaxillary_r7;
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
    private final ModelRenderer Squamosal_r14;
    private final ModelRenderer Squamosal_r15;
    private final ModelRenderer Squamosal_r16;
    private final ModelRenderer Squamosal_r17;
    private final ModelRenderer Squamosal_r18;
    private final ModelRenderer Squamosal_r19;
    private final ModelRenderer Squamosal_r20;
    private final ModelRenderer Quadratojugal_r1;
    private final ModelRenderer Squamosal_r21;
    private final ModelRenderer Squamosal_r22;
    private final ModelRenderer Squamosal_r23;
    private final ModelRenderer Quadratojugal_r2;
    private final ModelRenderer Jugal_r1;
    private final ModelRenderer Teeth_r1;
    private final ModelRenderer Teeth_r2;
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
    private final ModelRenderer Angular_r2;
    private final ModelRenderer Surangular_r1;
    private final ModelRenderer Squamosal_r24;
    private final ModelRenderer Surangular_r2;
    private final ModelRenderer Teeth_r3;
    private final ModelRenderer Teeth_r4;
    private final ModelRenderer Squamosal_r25;
    private final ModelRenderer JawslopeL;
    private final ModelRenderer Dentary_r1;
    private final ModelRenderer Dentary_r2;
    private final ModelRenderer Dentary_r3;
    private final ModelRenderer Dentary_r4;
    private final ModelRenderer JawslopeL2;
    private final ModelRenderer MasseterR;

    public ModelSkeletonEocursor() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Eocursor = new ModelRenderer(this);
        this.Eocursor.setRotationPoint(0.0F, -17.5F, 0.1F);
        this.fossil.addChild(Eocursor);
        this.setRotateAngle(Eocursor, -0.0873F, 0.0F, 0.0F);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(0.0F, -0.6F, -2.3F);
        this.Eocursor.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.0175F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 32, 50, 0.0F, -0.7715F, 4.0648F, 0, 1, 1, 0.0F, false));
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 35, 50, 0.0F, -0.8715F, 2.0648F, 0, 1, 1, 0.0F, false));
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 38, 50, 0.0F, -0.8715F, 0.0648F, 0, 1, 1, 0.0F, false));
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 15, 5, -1.5F, 0.0285F, 1.0648F, 1, 0, 3, 0.0F, true));
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 15, 5, 0.5F, 0.0285F, 1.0648F, 1, 0, 3, 0.0F, false));
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 0, 26, -0.5F, -0.0715F, 0.0648F, 1, 1, 5, 0.005F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.9F, 0.3F, 0.8F);
        this.Eocursor.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1134F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 27, -0.5F, -0.0266F, -1.0128F, 1, 1, 1, -0.004F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.9F, -0.4F, 1.2F);
        this.Eocursor.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.7243F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 33, -0.5F, -0.0373F, -0.8485F, 1, 1, 1, -0.004F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.3329F, 2.9588F, 1.847F);
        this.Eocursor.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.429F, 0.0454F, -0.3514F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 18, -0.0466F, -0.6599F, -0.3209F, 1, 1, 3, -0.2F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.9F, 1.6F, -1.8F);
        this.Eocursor.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5686F, 0.0454F, -0.3514F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 6, -0.2474F, -0.6481F, -0.7514F, 1, 1, 4, -0.31F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.9F, 0.3F, 0.2F);
        this.Eocursor.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.0922F, 0.0454F, -0.3514F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 26, -0.5035F, 0.53F, -0.9827F, 1, 3, 1, -0.2F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.9F, 0.3F, 0.2F);
        this.Eocursor.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.3715F, 0.0454F, -0.3514F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 26, -0.5035F, 0.5721F, -0.0553F, 1, 3, 1, -0.19F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.9F, 0.3F, 0.2F);
        this.Eocursor.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.738F, 0.0454F, -0.3514F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 30, -0.5035F, 0.6542F, 0.7793F, 1, 1, 1, -0.2F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.9F, 3.0F, 0.6F);
        this.Eocursor.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4464F, 0.0454F, -0.3514F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.3429F, -0.4765F, -0.061F, 1, 1, 4, -0.31F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.3329F, 1.7588F, 0.947F);
        this.Eocursor.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.7955F, 0.0454F, -0.3514F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 8, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.2F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.9F, 0.3F, 0.2F);
        this.Eocursor.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0349F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 27, 26, -0.5F, -1.6F, -1.6F, 1, 1, 4, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 27, 26, 3.3F, -1.6F, -1.6F, 1, 1, 4, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.9F, 0.3F, 0.2F);
        this.Eocursor.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5149F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 39, -0.5F, -0.8764F, -1.5964F, 1, 2, 2, -0.004F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 39, 3.3F, -0.8764F, -1.5964F, 1, 2, 2, -0.004F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.9F, -1.3F, -0.8F);
        this.Eocursor.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0175F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 41, 26, -0.6F, -0.3048F, -1.8141F, 1, 1, 2, -0.2F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 41, 26, 3.4F, -0.3048F, -1.8141F, 1, 1, 2, -0.2F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.9F, -1.3F, 0.2F);
        this.Eocursor.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0349F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 49, 6, -0.5F, -0.129F, -1.0484F, 1, 1, 1, -0.004F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 49, 6, 3.3F, -0.129F, -1.0484F, 1, 1, 1, -0.004F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.9F, 0.3F, 0.2F);
        this.Eocursor.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 6, -0.5F, -1.7152F, -0.2883F, 1, 1, 2, -0.006F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 6, 3.3F, -1.7152F, -0.2883F, 1, 1, 2, -0.006F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(1.9F, 0.3F, 0.8F);
        this.Eocursor.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1134F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 27, -0.5F, -0.0266F, -1.0128F, 1, 1, 1, -0.004F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(1.9F, -0.4F, 1.2F);
        this.Eocursor.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.7243F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 33, -0.5F, -0.0373F, -0.8485F, 1, 1, 1, -0.004F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(1.3329F, 2.9588F, 1.847F);
        this.Eocursor.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.429F, -0.0454F, 0.3514F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 33, 18, -0.9534F, -0.6599F, -0.3209F, 1, 1, 3, -0.2F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(1.3329F, 1.7588F, 0.947F);
        this.Eocursor.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.7955F, -0.0454F, 0.3514F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 35, 8, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.2F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(1.9F, 1.6F, -1.8F);
        this.Eocursor.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.5686F, -0.0454F, 0.3514F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 6, -0.7526F, -0.6481F, -0.7514F, 1, 1, 4, -0.31F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(1.9F, 3.0F, 0.6F);
        this.Eocursor.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.4464F, -0.0454F, 0.3514F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, -1.3429F, -0.4765F, -0.061F, 1, 1, 4, -0.31F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(1.9F, 0.3F, 0.2F);
        this.Eocursor.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -1.738F, -0.0454F, 0.3514F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 30, -0.4965F, 0.6542F, 0.7793F, 1, 1, 1, -0.2F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(1.9F, 0.3F, 0.2F);
        this.Eocursor.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.3715F, -0.0454F, 0.3514F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 26, -0.4965F, 0.5721F, -0.0553F, 1, 3, 1, -0.19F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(1.9F, 0.3F, 0.2F);
        this.Eocursor.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -1.0922F, -0.0454F, 0.3514F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 8, 26, -0.4965F, 0.53F, -0.9827F, 1, 3, 1, -0.2F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(2.7F, 0.9F, -0.6F);
        this.Eocursor.addChild(LegL);
        this.setRotateAngle(LegL, -1.7017F, 0.0F, 0.0F);
        this.LegL.cubeList.add(new ModelBox(LegL, 10, 44, -0.7F, 1.0868F, -0.4924F, 1, 2, 1, 0.0F, false));
        this.LegL.cubeList.add(new ModelBox(LegL, 27, 38, -0.7F, -0.9132F, -0.8924F, 1, 2, 2, 0.0F, false));

        this.Femur_r1 = new ModelRenderer(this);
        this.Femur_r1.setRotationPoint(-2.6F, 4.9868F, 0.4076F);
        this.LegL.addChild(Femur_r1);
        this.setRotateAngle(Femur_r1, 0.8029F, 0.0F, 0.0F);
        this.Femur_r1.cubeList.add(new ModelBox(Femur_r1, 48, 44, 1.9F, -0.1018F, -0.0494F, 1, 1, 1, 0.0F, false));

        this.Femur_r2 = new ModelRenderer(this);
        this.Femur_r2.setRotationPoint(-2.6F, 3.0868F, -0.4924F);
        this.LegL.addChild(Femur_r2);
        this.setRotateAngle(Femur_r2, 0.4189F, 0.0F, 0.0F);
        this.Femur_r2.cubeList.add(new ModelBox(Femur_r2, 7, 0, 1.9F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.Femur_r3 = new ModelRenderer(this);
        this.Femur_r3.setRotationPoint(-2.6F, 1.0868F, 0.4076F);
        this.LegL.addChild(Femur_r3);
        this.setRotateAngle(Femur_r3, 0.733F, 0.0F, 0.0F);
        this.Femur_r3.cubeList.add(new ModelBox(Femur_r3, 45, 20, 1.9F, 0.0F, -0.9F, 1, 1, 1, -0.1F, false));

        this.KneeL = new ModelRenderer(this);
        this.KneeL.setRotationPoint(-0.1F, 5.4868F, 1.4076F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 2.3998F, 0.0F, 0.0F);
        this.KneeL.cubeList.add(new ModelBox(KneeL, 0, 14, 0.1F, -0.0464F, -0.1438F, 1, 8, 1, -0.2F, false));

        this.Tibia_r1 = new ModelRenderer(this);
        this.Tibia_r1.setRotationPoint(-2.5F, 8.1536F, 0.7562F);
        this.KneeL.addChild(Tibia_r1);
        this.setRotateAngle(Tibia_r1, 0.0524F, 0.0F, 0.0F);
        this.Tibia_r1.cubeList.add(new ModelBox(Tibia_r1, 20, 36, 1.5F, -8.2F, -1.0F, 1, 2, 2, 0.0F, false));
        this.Tibia_r1.cubeList.add(new ModelBox(Tibia_r1, 5, 14, 1.5F, -6.9F, -0.7F, 1, 7, 1, -0.004F, false));

        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 8.3536F, 0.6562F);
        this.KneeL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -1.0385F, 0.0F, 0.0F);


        this.Metatarsals_r1 = new ModelRenderer(this);
        this.Metatarsals_r1.setRotationPoint(-1.0F, 1.7972F, -2.3639F);
        this.MetatarsalL.addChild(Metatarsals_r1);
        this.setRotateAngle(Metatarsals_r1, -0.1259F, 0.036F, 0.277F);
        this.Metatarsals_r1.cubeList.add(new ModelBox(Metatarsals_r1, 5, 44, -0.7F, -0.8F, 0.1F, 1, 2, 1, -0.002F, false));

        this.Metatarsals_r2 = new ModelRenderer(this);
        this.Metatarsals_r2.setRotationPoint(-2.5F, -0.4F, -1.0F);
        this.MetatarsalL.addChild(Metatarsals_r2);
        this.setRotateAngle(Metatarsals_r2, -0.8727F, 0.0F, 0.0F);
        this.Metatarsals_r2.cubeList.add(new ModelBox(Metatarsals_r2, 13, 14, 1.5F, -0.5429F, 0.3064F, 2, 4, 1, -0.002F, false));

        this.PesL = new ModelRenderer(this);
        this.PesL.setRotationPoint(-0.1F, 2.7F, -3.1F);
        this.MetatarsalL.addChild(PesL);
        this.setRotateAngle(PesL, 2.0944F, 0.0F, 0.0F);


        this.Pes_r1 = new ModelRenderer(this);
        this.Pes_r1.setRotationPoint(-2.4F, -0.8F, -0.5F);
        this.PesL.addChild(Pes_r1);
        this.setRotateAngle(Pes_r1, -0.576F, 0.0F, 0.0F);
        this.Pes_r1.cubeList.add(new ModelBox(Pes_r1, 23, 11, 1.0F, -0.0357F, -3.5923F, 3, 1, 5, 0.0F, false));

        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-2.6F, 0.9F, -0.6F);
        this.Eocursor.addChild(LegL2);
        this.setRotateAngle(LegL2, -0.2182F, 0.0F, 0.0F);
        this.LegL2.cubeList.add(new ModelBox(LegL2, 10, 44, -0.4F, 1.0868F, -0.4924F, 1, 2, 1, 0.0F, true));
        this.LegL2.cubeList.add(new ModelBox(LegL2, 27, 38, -0.4F, -0.9132F, -0.8924F, 1, 2, 2, 0.0F, true));

        this.Femur_r4 = new ModelRenderer(this);
        this.Femur_r4.setRotationPoint(2.5F, 4.9868F, 0.4076F);
        this.LegL2.addChild(Femur_r4);
        this.setRotateAngle(Femur_r4, 0.8029F, 0.0F, 0.0F);
        this.Femur_r4.cubeList.add(new ModelBox(Femur_r4, 48, 44, -2.9F, -0.1018F, -0.0494F, 1, 1, 1, 0.0F, true));

        this.Femur_r5 = new ModelRenderer(this);
        this.Femur_r5.setRotationPoint(2.5F, 3.0868F, -0.4924F);
        this.LegL2.addChild(Femur_r5);
        this.setRotateAngle(Femur_r5, 0.4189F, 0.0F, 0.0F);
        this.Femur_r5.cubeList.add(new ModelBox(Femur_r5, 7, 0, -2.9F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

        this.Femur_r6 = new ModelRenderer(this);
        this.Femur_r6.setRotationPoint(2.5F, 1.0868F, 0.4076F);
        this.LegL2.addChild(Femur_r6);
        this.setRotateAngle(Femur_r6, 0.733F, 0.0F, 0.0F);
        this.Femur_r6.cubeList.add(new ModelBox(Femur_r6, 45, 20, -2.9F, 0.0F, -0.9F, 1, 1, 1, -0.1F, true));

        this.KneeL2 = new ModelRenderer(this);
        this.KneeL2.setRotationPoint(0.0F, 5.4868F, 1.4076F);
        this.LegL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, 0.9687F, 0.0522F, -0.0593F);
        this.KneeL2.cubeList.add(new ModelBox(KneeL2, 0, 14, -1.1F, -0.0464F, -0.1438F, 1, 8, 1, -0.2F, true));

        this.Tibia_r2 = new ModelRenderer(this);
        this.Tibia_r2.setRotationPoint(2.5F, 8.1536F, 0.7562F);
        this.KneeL2.addChild(Tibia_r2);
        this.setRotateAngle(Tibia_r2, 0.0524F, 0.0F, 0.0F);
        this.Tibia_r2.cubeList.add(new ModelBox(Tibia_r2, 20, 36, -2.5F, -8.2F, -1.0F, 1, 2, 2, 0.0F, true));
        this.Tibia_r2.cubeList.add(new ModelBox(Tibia_r2, 5, 14, -2.5F, -6.9F, -0.7F, 1, 7, 1, -0.004F, true));

        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(0.0F, 8.3536F, 0.6562F);
        this.KneeL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, 0.1396F, 0.0F, 0.0F);


        this.Metatarsals_r3 = new ModelRenderer(this);
        this.Metatarsals_r3.setRotationPoint(1.0F, 1.7972F, -2.3639F);
        this.MetatarsalL2.addChild(Metatarsals_r3);
        this.setRotateAngle(Metatarsals_r3, -0.1259F, -0.036F, -0.277F);
        this.Metatarsals_r3.cubeList.add(new ModelBox(Metatarsals_r3, 5, 44, -0.3F, -0.8F, 0.1F, 1, 2, 1, -0.002F, true));

        this.Metatarsals_r4 = new ModelRenderer(this);
        this.Metatarsals_r4.setRotationPoint(2.5F, -0.4F, -1.0F);
        this.MetatarsalL2.addChild(Metatarsals_r4);
        this.setRotateAngle(Metatarsals_r4, -0.8727F, 0.0F, 0.0F);
        this.Metatarsals_r4.cubeList.add(new ModelBox(Metatarsals_r4, 13, 14, -3.5F, -0.5429F, 0.3064F, 2, 4, 1, -0.002F, true));

        this.PesL2 = new ModelRenderer(this);
        this.PesL2.setRotationPoint(0.1F, 2.7F, -3.1F);
        this.MetatarsalL2.addChild(PesL2);
        this.setRotateAngle(PesL2, -0.1745F, 0.0F, 0.0F);


        this.Pes_r2 = new ModelRenderer(this);
        this.Pes_r2.setRotationPoint(2.4F, -0.8F, -0.5F);
        this.PesL2.addChild(Pes_r2);
        this.setRotateAngle(Pes_r2, -0.576F, 0.0F, 0.0F);
        this.Pes_r2.cubeList.add(new ModelBox(Pes_r2, 23, 11, -4.0F, -0.0357F, -3.5923F, 3, 1, 5, 0.0F, true));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.3F, 2.6F);
        this.Eocursor.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0616F, -0.1307F, -0.008F);


        this.Caudalproximal_r1 = new ModelRenderer(this);
        this.Caudalproximal_r1.setRotationPoint(0.0F, 0.7052F, 0.6F);
        this.Tail1.addChild(Caudalproximal_r1);
        this.setRotateAngle(Caudalproximal_r1, -0.0873F, 0.0F, 0.0F);
        this.Caudalproximal_r1.cubeList.add(new ModelBox(Caudalproximal_r1, 51, 24, 0.0F, -1.6F, 4.3F, 0, 1, 1, 0.0F, false));
        this.Caudalproximal_r1.cubeList.add(new ModelBox(Caudalproximal_r1, 26, 50, 0.0F, -1.6F, 2.3F, 0, 1, 1, 0.0F, false));
        this.Caudalproximal_r1.cubeList.add(new ModelBox(Caudalproximal_r1, 29, 50, 0.0F, -1.6F, 0.3F, 0, 1, 1, 0.0F, false));
        this.Caudalproximal_r1.cubeList.add(new ModelBox(Caudalproximal_r1, 13, 14, -0.5F, -0.9F, -0.7F, 1, 1, 7, 0.0F, false));

        this.Caudalproximal_r2 = new ModelRenderer(this);
        this.Caudalproximal_r2.setRotationPoint(0.0F, 0.8727F, 0.9446F);
        this.Tail1.addChild(Caudalproximal_r2);
        this.setRotateAngle(Caudalproximal_r2, 0.3491F, 0.0F, 0.0F);
        this.Caudalproximal_r2.cubeList.add(new ModelBox(Caudalproximal_r2, 27, 0, 0.0F, 1.1967F, 3.6764F, 0, 2, 1, 0.0F, false));
        this.Caudalproximal_r2.cubeList.add(new ModelBox(Caudalproximal_r2, 0, 0, 0.0F, 0.68F, 1.8092F, 0, 2, 1, 0.0F, false));
        this.Caudalproximal_r2.cubeList.add(new ModelBox(Caudalproximal_r2, 0, 6, 0.0F, -0.0368F, -0.0579F, 0, 2, 1, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.8052F, 6.7F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1139F, -0.0867F, -0.0099F);


        this.Caudalmedialproximal_r1 = new ModelRenderer(this);
        this.Caudalmedialproximal_r1.setRotationPoint(0.5F, 0.9F, 0.0F);
        this.Tail2.addChild(Caudalmedialproximal_r1);
        this.setRotateAngle(Caudalmedialproximal_r1, -0.0175F, 0.0F, 0.0F);
        this.Caudalmedialproximal_r1.cubeList.add(new ModelBox(Caudalmedialproximal_r1, 21, 5, -0.5F, -1.7F, 8.1F, 0, 1, 1, 0.0F, false));
        this.Caudalmedialproximal_r1.cubeList.add(new ModelBox(Caudalmedialproximal_r1, 0, 33, -0.5F, -1.8F, 6.1F, 0, 1, 1, 0.0F, false));
        this.Caudalmedialproximal_r1.cubeList.add(new ModelBox(Caudalmedialproximal_r1, 33, 18, -0.5F, -1.9F, 4.1F, 0, 1, 1, 0.0F, false));
        this.Caudalmedialproximal_r1.cubeList.add(new ModelBox(Caudalmedialproximal_r1, 15, 50, -0.5F, -2.0F, 2.1F, 0, 1, 1, 0.0F, false));
        this.Caudalmedialproximal_r1.cubeList.add(new ModelBox(Caudalmedialproximal_r1, 23, 50, -0.5F, -2.0F, 0.1F, 0, 1, 1, 0.0F, false));
        this.Caudalmedialproximal_r1.cubeList.add(new ModelBox(Caudalmedialproximal_r1, 0, 14, -1.0F, -1.3F, 0.1F, 1, 1, 10, 0.005F, false));

        this.Caudalproximal_r3 = new ModelRenderer(this);
        this.Caudalproximal_r3.setRotationPoint(0.0F, 0.0674F, -5.7553F);
        this.Tail2.addChild(Caudalproximal_r3);
        this.setRotateAngle(Caudalproximal_r3, 0.3491F, 0.0F, 0.0F);
        this.Caudalproximal_r3.cubeList.add(new ModelBox(Caudalproximal_r3, 51, 38, 0.0F, 4.2967F, 11.3764F, 0, 1, 1, 0.0F, false));
        this.Caudalproximal_r3.cubeList.add(new ModelBox(Caudalproximal_r3, 47, 51, 0.0F, 3.5967F, 9.3764F, 0, 1, 1, 0.0F, false));
        this.Caudalproximal_r3.cubeList.add(new ModelBox(Caudalproximal_r3, 51, 33, 0.0F, 3.0967F, 7.3764F, 0, 1, 1, 0.0F, false));
        this.Caudalproximal_r3.cubeList.add(new ModelBox(Caudalproximal_r3, 18, 51, 0.0F, 2.5967F, 5.3764F, 0, 1, 1, 0.0F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.4F, 10.1F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0089F, 0.1745F, -0.0015F);


        this.Caudalmedialdistal_r1 = new ModelRenderer(this);
        this.Caudalmedialdistal_r1.setRotationPoint(0.5F, 0.4997F, -0.0174F);
        this.Tail3.addChild(Caudalmedialdistal_r1);
        this.setRotateAngle(Caudalmedialdistal_r1, -0.1222F, 0.0F, 0.0F);
        this.Caudalmedialdistal_r1.cubeList.add(new ModelBox(Caudalmedialdistal_r1, 15, 0, -0.5F, -1.3F, 3.9F, 0, 1, 1, 0.0F, false));
        this.Caudalmedialdistal_r1.cubeList.add(new ModelBox(Caudalmedialdistal_r1, 15, 5, -0.5F, -1.3F, 1.9F, 0, 1, 1, 0.0F, false));
        this.Caudalmedialdistal_r1.cubeList.add(new ModelBox(Caudalmedialdistal_r1, 21, 0, -0.5F, -1.4F, -0.1F, 0, 1, 1, 0.0F, false));
        this.Caudalmedialdistal_r1.cubeList.add(new ModelBox(Caudalmedialdistal_r1, 15, 0, -1.0F, -1.1F, -0.1F, 1, 1, 9, 0.0F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(-0.1F, 0.8997F, 8.9826F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0886F, 0.1739F, -0.0154F);


        this.Caudaldistal_r1 = new ModelRenderer(this);
        this.Caudaldistal_r1.setRotationPoint(0.6F, -0.4F, 0.0F);
        this.Tail4.addChild(Caudaldistal_r1);
        this.setRotateAngle(Caudaldistal_r1, -0.2269F, 0.0F, 0.0F);
        this.Caudaldistal_r1.cubeList.add(new ModelBox(Caudaldistal_r1, 0, 0, -1.0F, 0.0F, -0.1F, 1, 1, 12, 0.005F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.2F, -2.2F);
        this.Eocursor.addChild(Body);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.1011F, -1.3655F);
        this.Body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1479F, 0.1897F, -0.8672F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 48, 36, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 0.1011F, -1.3655F);
        this.Body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0836F, 0.2253F, -1.1773F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 16, 30, -2.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.5011F, -3.2655F);
        this.Body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3366F, 0.1884F, -0.7358F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 49, 22, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 0.5011F, -3.2655F);
        this.Body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1755F, 0.3441F, -1.3958F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 49, 47, -3.6736F, -1.29F, -0.4463F, 1, 0, 1, 0.0F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 0.5011F, -3.2655F);
        this.Body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2665F, 0.2798F, -1.0356F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 34, 0, -2.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 0.9011F, -5.2655F);
        this.Body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1985F, 0.3918F, -1.3875F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 7, 35, -4.6736F, -1.29F, -0.4463F, 2, 0, 1, 0.0F, true));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 0.9011F, -5.2655F);
        this.Body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.3052F, 0.3169F, -1.0242F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 35, 13, -2.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, 0.9011F, -5.2655F);
        this.Body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3838F, 0.2129F, -0.7264F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 48, 49, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, 0.1011F, -1.3655F);
        this.Body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0836F, -0.2253F, 1.1773F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 16, 30, 0.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 0.1011F, -1.3655F);
        this.Body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1479F, -0.1897F, 0.8672F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 48, 36, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, 0.5011F, -3.2655F);
        this.Body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.2665F, -0.2798F, 1.0356F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 34, 0, 0.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, 0.5011F, -3.2655F);
        this.Body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1755F, -0.3441F, 1.3958F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 49, 47, 2.6736F, -1.29F, -0.4463F, 1, 0, 1, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, 0.5011F, -3.2655F);
        this.Body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.3366F, -0.1884F, 0.7358F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 49, 22, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, 0.9011F, -5.2655F);
        this.Body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.3838F, -0.2129F, 0.7264F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 48, 49, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, 0.9011F, -5.2655F);
        this.Body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.3052F, -0.3169F, 1.0242F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 35, 13, 0.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, 0.9011F, -5.2655F);
        this.Body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1985F, -0.3918F, 1.3875F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 7, 35, 2.6736F, -1.29F, -0.4463F, 2, 0, 1, 0.0F, false));

        this.Thorax_r1 = new ModelRenderer(this);
        this.Thorax_r1.setRotationPoint(0.0F, 0.9F, -6.9F);
        this.Body.addChild(Thorax_r1);
        this.setRotateAngle(Thorax_r1, 0.2618F, 0.0F, 0.0F);
        this.Thorax_r1.cubeList.add(new ModelBox(Thorax_r1, 11, 35, -0.5F, -0.0705F, 0.0701F, 1, 1, 3, 0.005F, false));
        this.Thorax_r1.cubeList.add(new ModelBox(Thorax_r1, 6, 51, 0.0F, -0.7705F, 1.0701F, 0, 1, 1, 0.0F, false));

        this.Thorax_r2 = new ModelRenderer(this);
        this.Thorax_r2.setRotationPoint(0.0F, 0.1F, -4.0F);
        this.Body.addChild(Thorax_r2);
        this.setRotateAngle(Thorax_r2, 0.1396F, 0.0F, 0.0F);
        this.Thorax_r2.cubeList.add(new ModelBox(Thorax_r2, 41, 50, 0.0F, -0.7483F, 2.0618F, 0, 1, 1, 0.0F, false));
        this.Thorax_r2.cubeList.add(new ModelBox(Thorax_r2, 44, 50, 0.0F, -0.7483F, 0.0618F, 0, 1, 1, 0.0F, false));
        this.Thorax_r2.cubeList.add(new ModelBox(Thorax_r2, 27, 32, -0.5F, -0.0483F, 0.0618F, 1, 1, 4, 0.0F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.1F, 1.4F, -6.8F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0436F, 0.0F, 0.0F);


        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.6F, 0.8011F, -2.2655F);
        this.Chest.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.2487F, 0.6144F, -1.3631F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 23, 14, -3.6736F, -1.29F, -0.4463F, 1, 0, 1, 0.0F, true));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.6F, 0.8011F, -2.2655F);
        this.Chest.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.5644F, 0.3596F, -0.6752F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 17, 36, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.6F, 0.8011F, -2.2655F);
        this.Chest.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.4394F, 0.5078F, -0.9702F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 23, 18, -2.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.6F, 0.0011F, -0.3655F);
        this.Chest.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.4515F, 0.2704F, -0.7102F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 41, 4, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.6F, 0.0011F, -0.3655F);
        this.Chest.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.3542F, 0.391F, -1.0072F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 13, 26, -2.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.6F, 0.0011F, -0.3655F);
        this.Chest.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.2164F, 0.4776F, -1.3799F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 27, 6, -4.6736F, -1.29F, -0.4463F, 2, 0, 1, 0.0F, true));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-2.4F, 2.8281F, -2.0922F);
        this.Chest.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.7854F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 9, 29, -0.5F, -0.4401F, 0.0605F, 1, 1, 4, 0.003F, true));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 9, 29, 4.1F, -0.4401F, 0.0605F, 1, 1, 4, 0.003F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-2.9F, 2.7779F, -2.0733F);
        this.Chest.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.7696F, -0.3931F, -0.3554F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 39, 16, 0.0F, -0.9137F, -1.9862F, 1, 2, 2, 0.0F, true));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(2.7F, 2.7779F, -2.0733F);
        this.Chest.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.7696F, 0.3931F, 0.3554F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 39, 16, -1.0F, -0.9137F, -1.9862F, 1, 2, 2, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.4F, 0.8011F, -2.2655F);
        this.Chest.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.4394F, -0.5078F, 0.9702F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 23, 18, 0.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.4F, 0.8011F, -2.2655F);
        this.Chest.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.5644F, -0.3596F, 0.6752F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 17, 36, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.4F, 0.8011F, -2.2655F);
        this.Chest.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.2487F, -0.6144F, 1.3631F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 23, 14, 2.6736F, -1.29F, -0.4463F, 1, 0, 1, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.4F, 0.0011F, -0.3655F);
        this.Chest.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.4515F, -0.2704F, 0.7102F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 41, 4, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.4F, 0.0011F, -0.3655F);
        this.Chest.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.3542F, -0.391F, 1.0072F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 13, 26, 0.9537F, -0.3007F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.4F, 0.0011F, -0.3655F);
        this.Chest.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.2164F, -0.4776F, 1.3799F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 27, 6, 2.6736F, -1.29F, -0.4463F, 2, 0, 1, 0.0F, false));

        this.Scapulo_Coracoid_r1 = new ModelRenderer(this);
        this.Scapulo_Coracoid_r1.setRotationPoint(0.0F, 2.0F, -3.3F);
        this.Chest.addChild(Scapulo_Coracoid_r1);
        this.setRotateAngle(Scapulo_Coracoid_r1, 0.4189F, 0.0F, 0.0F);
        this.Scapulo_Coracoid_r1.cubeList.add(new ModelBox(Scapulo_Coracoid_r1, 0, 51, -0.1F, -1.5534F, 2.9948F, 0, 1, 1, 0.0F, false));
        this.Scapulo_Coracoid_r1.cubeList.add(new ModelBox(Scapulo_Coracoid_r1, 3, 51, -0.1F, -1.2534F, 0.9948F, 0, 1, 1, 0.0F, false));
        this.Scapulo_Coracoid_r1.cubeList.add(new ModelBox(Scapulo_Coracoid_r1, 0, 33, -0.6F, -1.0534F, -0.0052F, 1, 1, 4, 0.0F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(3.0F, 4.0F, -1.7F);
        this.Chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.4451F, 0.0F, 0.0F);


        this.Humerus_r1 = new ModelRenderer(this);
        this.Humerus_r1.setRotationPoint(-0.5F, -0.4F, -0.5F);
        this.ArmL.addChild(Humerus_r1);
        this.setRotateAngle(Humerus_r1, -0.7418F, 0.0F, 0.0F);
        this.Humerus_r1.cubeList.add(new ModelBox(Humerus_r1, 18, 23, 0.0F, -0.6F, 0.3F, 1, 1, 5, 0.0F, false));

        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.0F, 3.3F, 3.6F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, 0.0737F, -0.0468F, 0.5655F);


        this.Radio_Ulna_r1 = new ModelRenderer(this);
        this.Radio_Ulna_r1.setRotationPoint(-0.5F, -0.2F, 0.0F);
        this.ElbowL.addChild(Radio_Ulna_r1);
        this.setRotateAngle(Radio_Ulna_r1, 0.8378F, 0.0F, 0.0F);
        this.Radio_Ulna_r1.cubeList.add(new ModelBox(Radio_Ulna_r1, 26, 19, 0.0F, -1.3662F, -3.8486F, 1, 1, 4, -0.25F, false));
        this.Radio_Ulna_r1.cubeList.add(new ModelBox(Radio_Ulna_r1, 27, 0, 0.0F, -0.6662F, -3.8486F, 1, 1, 4, -0.2F, false));

        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.5F, 2.1F, -2.7F);
        this.ElbowL.addChild(HandL);


        this.Manus_r1 = new ModelRenderer(this);
        this.Manus_r1.setRotationPoint(0.0F, 0.3F, 0.1F);
        this.HandL.addChild(Manus_r1);
        this.setRotateAngle(Manus_r1, 1.4508F, 0.1855F, 0.21F);
        this.Manus_r1.cubeList.add(new ModelBox(Manus_r1, 46, 24, -1.1F, -0.7083F, -1.0051F, 1, 1, 1, -0.004F, false));

        this.Manus_r2 = new ModelRenderer(this);
        this.Manus_r2.setRotationPoint(0.0F, 0.3F, 0.1F);
        this.HandL.addChild(Manus_r2);
        this.setRotateAngle(Manus_r2, 0.8574F, 0.1855F, 0.21F);
        this.Manus_r2.cubeList.add(new ModelBox(Manus_r2, 41, 0, -1.1F, -0.9083F, -2.0051F, 1, 1, 2, -0.002F, false));

        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-3.2F, 4.0F, -1.7F);
        this.Chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 0.1833F, 0.0F, 0.0F);


        this.Humerus_r2 = new ModelRenderer(this);
        this.Humerus_r2.setRotationPoint(0.5F, -0.4F, -0.5F);
        this.ArmL2.addChild(Humerus_r2);
        this.setRotateAngle(Humerus_r2, -0.7418F, 0.0F, 0.0F);
        this.Humerus_r2.cubeList.add(new ModelBox(Humerus_r2, 18, 23, -1.0F, -0.6F, 0.3F, 1, 1, 5, 0.0F, true));

        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(0.0F, 3.3F, 3.6F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, 0.0807F, 0.0334F, -0.3914F);


        this.Radio_Ulna_r2 = new ModelRenderer(this);
        this.Radio_Ulna_r2.setRotationPoint(0.5F, -0.2F, 0.0F);
        this.ElbowL2.addChild(Radio_Ulna_r2);
        this.setRotateAngle(Radio_Ulna_r2, 0.8378F, 0.0F, 0.0F);
        this.Radio_Ulna_r2.cubeList.add(new ModelBox(Radio_Ulna_r2, 26, 19, -1.0F, -1.3662F, -3.8486F, 1, 1, 4, -0.25F, true));
        this.Radio_Ulna_r2.cubeList.add(new ModelBox(Radio_Ulna_r2, 27, 0, -1.0F, -0.6662F, -3.8486F, 1, 1, 4, -0.2F, true));

        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(-0.5F, 2.1F, -2.7F);
        this.ElbowL2.addChild(HandL2);


        this.Manus_r3 = new ModelRenderer(this);
        this.Manus_r3.setRotationPoint(0.0F, 0.3F, 0.1F);
        this.HandL2.addChild(Manus_r3);
        this.setRotateAngle(Manus_r3, 1.4508F, -0.1855F, -0.21F);
        this.Manus_r3.cubeList.add(new ModelBox(Manus_r3, 46, 24, 0.1F, -0.7083F, -1.0051F, 1, 1, 1, -0.004F, true));

        this.Manus_r4 = new ModelRenderer(this);
        this.Manus_r4.setRotationPoint(0.0F, 0.3F, 0.1F);
        this.HandL2.addChild(Manus_r4);
        this.setRotateAngle(Manus_r4, 0.8574F, -0.1855F, -0.21F);
        this.Manus_r4.cubeList.add(new ModelBox(Manus_r4, 41, 0, 0.1F, -0.9083F, -2.0051F, 1, 1, 2, -0.002F, true));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 1.3F, -3.3F);
        this.Chest.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.1355F, -0.2595F, 0.035F);


        this.CervicalDistal_r1 = new ModelRenderer(this);
        this.CervicalDistal_r1.setRotationPoint(0.5F, 0.0F, -1.9F);
        this.Neck1.addChild(CervicalDistal_r1);
        this.setRotateAngle(CervicalDistal_r1, -0.2967F, 0.0F, 0.0F);
        this.CervicalDistal_r1.cubeList.add(new ModelBox(CervicalDistal_r1, 41, 40, -1.1F, -0.9313F, -0.0487F, 1, 1, 2, 0.005F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.3F, -1.7F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2618F, 0.0F, 0.0F);


        this.CervicalMedial_r1 = new ModelRenderer(this);
        this.CervicalMedial_r1.setRotationPoint(0.5F, -1.7F, 1.4F);
        this.Neck2.addChild(CervicalMedial_r1);
        this.setRotateAngle(CervicalMedial_r1, -0.6458F, 0.0F, 0.0F);
        this.CervicalMedial_r1.cubeList.add(new ModelBox(CervicalMedial_r1, 35, 35, -1.1F, 1.6568F, -3.0613F, 1, 1, 3, 0.0F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.1F, -1.6F, -2.2F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.25F, -0.2116F, -0.0536F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 26, 43, -0.7F, -0.6083F, -1.8286F, 1, 1, 2, 0.005F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.2F, -0.0255F, -1.2389F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, -0.0344F, -0.0061F, -0.1744F);


        this.Squamosal_r1 = new ModelRenderer(this);
        this.Squamosal_r1.setRotationPoint(-0.53F, 1.9227F, -4.156F);
        this.Head.addChild(Squamosal_r1);
        this.setRotateAngle(Squamosal_r1, 0.5323F, 0.0F, 0.0F);
        this.Squamosal_r1.cubeList.add(new ModelBox(Squamosal_r1, 43, 44, -0.1F, -0.6F, -0.5F, 1, 1, 1, -0.3F, false));

        this.Premaxillary_r1 = new ModelRenderer(this);
        this.Premaxillary_r1.setRotationPoint(-0.3F, -0.3091F, -2.2733F);
        this.Head.addChild(Premaxillary_r1);
        this.setRotateAngle(Premaxillary_r1, 0.4363F, 0.0F, 0.0F);
        this.Premaxillary_r1.cubeList.add(new ModelBox(Premaxillary_r1, 14, 47, -0.5F, -0.5169F, -0.1248F, 1, 1, 1, -0.203F, true));
        this.Premaxillary_r1.cubeList.add(new ModelBox(Premaxillary_r1, 14, 47, 0.1F, -0.5169F, -0.1248F, 1, 1, 1, -0.2F, false));

        this.Premaxillary_r2 = new ModelRenderer(this);
        this.Premaxillary_r2.setRotationPoint(-0.3F, -0.6091F, -2.3733F);
        this.Head.addChild(Premaxillary_r2);
        this.setRotateAngle(Premaxillary_r2, 0.6632F, 0.0F, 0.0F);
        this.Premaxillary_r2.cubeList.add(new ModelBox(Premaxillary_r2, 24, 47, -0.5F, -0.2155F, -0.7544F, 1, 1, 1, -0.2F, true));
        this.Premaxillary_r2.cubeList.add(new ModelBox(Premaxillary_r2, 24, 47, 0.1F, -0.2155F, -0.7544F, 1, 1, 1, -0.2F, false));

        this.Premaxillary_r3 = new ModelRenderer(this);
        this.Premaxillary_r3.setRotationPoint(0.0F, 1.5936F, -4.4759F);
        this.Head.addChild(Premaxillary_r3);
        this.setRotateAngle(Premaxillary_r3, 0.824F, -0.0832F, -0.0896F);
        this.Premaxillary_r3.cubeList.add(new ModelBox(Premaxillary_r3, 35, 29, -0.5F, -0.2699F, -0.2842F, 1, 1, 3, -0.214F, true));

        this.Premaxillary_r4 = new ModelRenderer(this);
        this.Premaxillary_r4.setRotationPoint(0.0F, 1.6936F, -4.6759F);
        this.Head.addChild(Premaxillary_r4);
        this.setRotateAngle(Premaxillary_r4, 1.0647F, 0.0F, 0.0F);
        this.Premaxillary_r4.cubeList.add(new ModelBox(Premaxillary_r4, 46, 38, -0.5F, -0.2609F, -0.7765F, 1, 1, 1, -0.213F, false));

        this.Premaxillary_r5 = new ModelRenderer(this);
        this.Premaxillary_r5.setRotationPoint(0.0F, 1.2936F, -4.2759F);
        this.Head.addChild(Premaxillary_r5);
        this.setRotateAngle(Premaxillary_r5, 0.6981F, 0.0F, 0.0F);
        this.Premaxillary_r5.cubeList.add(new ModelBox(Premaxillary_r5, 47, 3, -0.5F, -0.2116F, -0.8401F, 1, 1, 1, -0.21F, false));

        this.Premaxillary_r6 = new ModelRenderer(this);
        this.Premaxillary_r6.setRotationPoint(0.0F, 1.5936F, -4.4759F);
        this.Head.addChild(Premaxillary_r6);
        this.setRotateAngle(Premaxillary_r6, 0.824F, 0.0832F, 0.0896F);
        this.Premaxillary_r6.cubeList.add(new ModelBox(Premaxillary_r6, 35, 29, -0.5F, -0.2699F, -0.2842F, 1, 1, 3, -0.21F, false));

        this.Premaxillary_r7 = new ModelRenderer(this);
        this.Premaxillary_r7.setRotationPoint(0.0F, 1.9936F, -4.4759F);
        this.Head.addChild(Premaxillary_r7);
        this.setRotateAngle(Premaxillary_r7, 0.5061F, 0.0F, 0.0F);
        this.Premaxillary_r7.cubeList.add(new ModelBox(Premaxillary_r7, 20, 30, -0.5F, -0.3683F, -0.7052F, 1, 1, 4, -0.201F, false));

        this.Squamosal_r2 = new ModelRenderer(this);
        this.Squamosal_r2.setRotationPoint(-0.511F, -0.9532F, -0.4285F);
        this.Head.addChild(Squamosal_r2);
        this.setRotateAngle(Squamosal_r2, 0.0F, 0.1222F, 1.5708F);
        this.Squamosal_r2.cubeList.add(new ModelBox(Squamosal_r2, 34, 47, -0.4F, -0.5F, -0.3F, 1, 1, 1, -0.3F, true));
        this.Squamosal_r2.cubeList.add(new ModelBox(Squamosal_r2, 34, 47, -0.4F, -0.5F, -0.7F, 1, 1, 1, -0.3F, true));

        this.Squamosal_r3 = new ModelRenderer(this);
        this.Squamosal_r3.setRotationPoint(-0.53F, 0.2452F, -1.093F);
        this.Head.addChild(Squamosal_r3);
        this.setRotateAngle(Squamosal_r3, 0.0436F, 0.0F, 0.0F);
        this.Squamosal_r3.cubeList.add(new ModelBox(Squamosal_r3, 44, 47, -0.5F, -0.932F, -0.2176F, 1, 1, 1, -0.201F, true));
        this.Squamosal_r3.cubeList.add(new ModelBox(Squamosal_r3, 44, 47, 0.56F, -0.932F, -0.2176F, 1, 1, 1, -0.201F, false));

        this.Squamosal_r4 = new ModelRenderer(this);
        this.Squamosal_r4.setRotationPoint(-0.53F, 0.6452F, -0.793F);
        this.Head.addChild(Squamosal_r4);
        this.setRotateAngle(Squamosal_r4, 0.5847F, 0.0F, 0.0F);
        this.Squamosal_r4.cubeList.add(new ModelBox(Squamosal_r4, 0, 48, -0.5F, -0.7851F, -0.1871F, 1, 1, 1, -0.2F, true));
        this.Squamosal_r4.cubeList.add(new ModelBox(Squamosal_r4, 0, 48, 0.56F, -0.7851F, -0.1871F, 1, 1, 1, -0.2F, false));

        this.Squamosal_r5 = new ModelRenderer(this);
        this.Squamosal_r5.setRotationPoint(-0.3888F, 0.1582F, -1.895F);
        this.Head.addChild(Squamosal_r5);
        this.setRotateAngle(Squamosal_r5, 0.4116F, -0.1049F, -0.0511F);
        this.Squamosal_r5.cubeList.add(new ModelBox(Squamosal_r5, 44, 15, -0.5412F, -0.3134F, -0.7141F, 1, 1, 1, -0.1F, true));

        this.Squamosal_r6 = new ModelRenderer(this);
        this.Squamosal_r6.setRotationPoint(-0.4462F, 0.5763F, -1.4835F);
        this.Head.addChild(Squamosal_r6);
        this.setRotateAngle(Squamosal_r6, 1.3017F, -0.1049F, -0.0511F);
        this.Squamosal_r6.cubeList.add(new ModelBox(Squamosal_r6, 48, 0, -0.506F, -0.8218F, -0.1138F, 1, 1, 1, -0.099F, true));

        this.Squamosal_r7 = new ModelRenderer(this);
        this.Squamosal_r7.setRotationPoint(-0.4064F, -0.3428F, -2.0191F);
        this.Head.addChild(Squamosal_r7);
        this.setRotateAngle(Squamosal_r7, 0.2196F, -0.1049F, -0.0511F);
        this.Squamosal_r7.cubeList.add(new ModelBox(Squamosal_r7, 38, 44, -0.5362F, -0.1204F, -0.8184F, 1, 1, 1, -0.1F, true));

        this.Squamosal_r8 = new ModelRenderer(this);
        this.Squamosal_r8.setRotationPoint(-0.5271F, 0.2376F, -2.1102F);
        this.Head.addChild(Squamosal_r8);
        this.setRotateAngle(Squamosal_r8, 0.4105F, -0.1259F, -0.0169F);
        this.Squamosal_r8.cubeList.add(new ModelBox(Squamosal_r8, 20, 45, -0.5859F, -0.5F, -0.5F, 1, 1, 1, -0.25F, true));
        this.Squamosal_r8.cubeList.add(new ModelBox(Squamosal_r8, 48, 41, -0.4229F, -0.5F, -0.5F, 1, 1, 1, -0.1F, true));

        this.Squamosal_r9 = new ModelRenderer(this);
        this.Squamosal_r9.setRotationPoint(-0.7508F, 0.3394F, -2.0734F);
        this.Head.addChild(Squamosal_r9);
        this.setRotateAngle(Squamosal_r9, 1.2284F, -0.2809F, -0.0998F);
        this.Squamosal_r9.cubeList.add(new ModelBox(Squamosal_r9, 39, 47, -0.2033F, -0.9399F, -0.6961F, 1, 1, 1, -0.1F, true));

        this.Squamosal_r10 = new ModelRenderer(this);
        this.Squamosal_r10.setRotationPoint(-0.3882F, 1.1506F, -2.9143F);
        this.Head.addChild(Squamosal_r10);
        this.setRotateAngle(Squamosal_r10, 0.0816F, -0.1679F, -0.099F);
        this.Squamosal_r10.cubeList.add(new ModelBox(Squamosal_r10, 34, 47, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, true));

        this.Squamosal_r11 = new ModelRenderer(this);
        this.Squamosal_r11.setRotationPoint(-0.13F, 1.8812F, -4.4573F);
        this.Head.addChild(Squamosal_r11);
        this.setRotateAngle(Squamosal_r11, 0.9512F, 0.0F, 0.0F);
        this.Squamosal_r11.cubeList.add(new ModelBox(Squamosal_r11, 29, 47, -0.5F, -0.5F, -0.6F, 1, 1, 1, -0.3F, true));

        this.Squamosal_r12 = new ModelRenderer(this);
        this.Squamosal_r12.setRotationPoint(0.13F, 1.8812F, -4.4573F);
        this.Head.addChild(Squamosal_r12);
        this.setRotateAngle(Squamosal_r12, 0.9512F, 0.0F, 0.0F);
        this.Squamosal_r12.cubeList.add(new ModelBox(Squamosal_r12, 29, 47, -0.5F, -0.5F, -0.6F, 1, 1, 1, -0.3F, false));

        this.Squamosal_r13 = new ModelRenderer(this);
        this.Squamosal_r13.setRotationPoint(0.511F, -0.9532F, -0.4285F);
        this.Head.addChild(Squamosal_r13);
        this.setRotateAngle(Squamosal_r13, 0.0F, -0.1222F, -1.5708F);
        this.Squamosal_r13.cubeList.add(new ModelBox(Squamosal_r13, 34, 47, -0.6F, -0.5F, -0.7F, 1, 1, 1, -0.3F, false));
        this.Squamosal_r13.cubeList.add(new ModelBox(Squamosal_r13, 34, 47, -0.6F, -0.5F, -0.3F, 1, 1, 1, -0.3F, false));

        this.Squamosal_r14 = new ModelRenderer(this);
        this.Squamosal_r14.setRotationPoint(0.3882F, 1.1506F, -2.9143F);
        this.Head.addChild(Squamosal_r14);
        this.setRotateAngle(Squamosal_r14, 0.0816F, 0.1679F, 0.099F);
        this.Squamosal_r14.cubeList.add(new ModelBox(Squamosal_r14, 34, 47, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

        this.Squamosal_r15 = new ModelRenderer(this);
        this.Squamosal_r15.setRotationPoint(0.7508F, 0.3394F, -2.0734F);
        this.Head.addChild(Squamosal_r15);
        this.setRotateAngle(Squamosal_r15, 1.2284F, 0.2809F, 0.0998F);
        this.Squamosal_r15.cubeList.add(new ModelBox(Squamosal_r15, 39, 47, -0.7967F, -0.9399F, -0.6961F, 1, 1, 1, -0.1F, false));

        this.Squamosal_r16 = new ModelRenderer(this);
        this.Squamosal_r16.setRotationPoint(0.4462F, 0.5763F, -1.4835F);
        this.Head.addChild(Squamosal_r16);
        this.setRotateAngle(Squamosal_r16, 1.3017F, 0.1049F, 0.0511F);
        this.Squamosal_r16.cubeList.add(new ModelBox(Squamosal_r16, 48, 0, -0.494F, -0.8218F, -0.1138F, 1, 1, 1, -0.099F, false));

        this.Squamosal_r17 = new ModelRenderer(this);
        this.Squamosal_r17.setRotationPoint(0.5271F, 0.2376F, -2.1102F);
        this.Head.addChild(Squamosal_r17);
        this.setRotateAngle(Squamosal_r17, 0.4105F, 0.1259F, 0.0169F);
        this.Squamosal_r17.cubeList.add(new ModelBox(Squamosal_r17, 20, 45, -0.4141F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));
        this.Squamosal_r17.cubeList.add(new ModelBox(Squamosal_r17, 48, 41, -0.5771F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

        this.Squamosal_r18 = new ModelRenderer(this);
        this.Squamosal_r18.setRotationPoint(0.4064F, -0.3428F, -2.0191F);
        this.Head.addChild(Squamosal_r18);
        this.setRotateAngle(Squamosal_r18, 0.2196F, 0.1049F, 0.0511F);
        this.Squamosal_r18.cubeList.add(new ModelBox(Squamosal_r18, 38, 44, -0.4638F, -0.1204F, -0.8184F, 1, 1, 1, -0.1F, false));

        this.Squamosal_r19 = new ModelRenderer(this);
        this.Squamosal_r19.setRotationPoint(0.3888F, 0.1582F, -1.895F);
        this.Head.addChild(Squamosal_r19);
        this.setRotateAngle(Squamosal_r19, 0.4116F, 0.1049F, 0.0511F);
        this.Squamosal_r19.cubeList.add(new ModelBox(Squamosal_r19, 44, 15, -0.4588F, -0.3134F, -0.7141F, 1, 1, 1, -0.1F, false));

        this.Squamosal_r20 = new ModelRenderer(this);
        this.Squamosal_r20.setRotationPoint(-0.1F, -0.4867F, -1.1664F);
        this.Head.addChild(Squamosal_r20);
        this.setRotateAngle(Squamosal_r20, 0.2967F, 0.0F, 0.0F);
        this.Squamosal_r20.cubeList.add(new ModelBox(Squamosal_r20, 5, 48, -0.2F, 0.0F, -1.5F, 1, 1, 1, -0.0002F, false));

        this.Quadratojugal_r1 = new ModelRenderer(this);
        this.Quadratojugal_r1.setRotationPoint(-0.3F, 0.417F, -0.9569F);
        this.Head.addChild(Quadratojugal_r1);
        this.setRotateAngle(Quadratojugal_r1, 0.3142F, 0.0F, 0.0F);
        this.Quadratojugal_r1.cubeList.add(new ModelBox(Quadratojugal_r1, 41, 34, -0.5F, -0.6F, -1.0F, 1, 1, 2, 0.004F, true));
        this.Quadratojugal_r1.cubeList.add(new ModelBox(Quadratojugal_r1, 41, 34, 0.1F, -0.6F, -1.0F, 1, 1, 2, 0.0F, false));

        this.Squamosal_r21 = new ModelRenderer(this);
        this.Squamosal_r21.setRotationPoint(0.2F, -0.9867F, 0.0336F);
        this.Head.addChild(Squamosal_r21);
        this.setRotateAngle(Squamosal_r21, -0.1396F, 0.0F, 0.0F);
        this.Squamosal_r21.cubeList.add(new ModelBox(Squamosal_r21, 48, 17, -1.0F, 0.0001F, -0.8568F, 1, 1, 1, -0.003F, true));

        this.Squamosal_r22 = new ModelRenderer(this);
        this.Squamosal_r22.setRotationPoint(0.2F, -1.063F, -0.8874F);
        this.Head.addChild(Squamosal_r22);
        this.setRotateAngle(Squamosal_r22, 0.192F, 0.0F, 0.0F);
        this.Squamosal_r22.cubeList.add(new ModelBox(Squamosal_r22, 19, 48, -1.0F, 0.002F, -0.9228F, 1, 1, 1, -0.004F, true));
        this.Squamosal_r22.cubeList.add(new ModelBox(Squamosal_r22, 19, 48, -0.4F, 0.002F, -0.9228F, 1, 1, 1, 0.0F, false));

        this.Squamosal_r23 = new ModelRenderer(this);
        this.Squamosal_r23.setRotationPoint(-0.2F, -0.9867F, 0.0336F);
        this.Head.addChild(Squamosal_r23);
        this.setRotateAngle(Squamosal_r23, -0.1396F, 0.0F, 0.0F);
        this.Squamosal_r23.cubeList.add(new ModelBox(Squamosal_r23, 48, 17, 0.0F, 0.0001F, -0.8568F, 1, 1, 1, -0.001F, false));

        this.Quadratojugal_r2 = new ModelRenderer(this);
        this.Quadratojugal_r2.setRotationPoint(-0.3F, 0.6144F, 0.0536F);
        this.Head.addChild(Quadratojugal_r2);
        this.setRotateAngle(Quadratojugal_r2, 0.733F, 0.0F, 0.0F);
        this.Quadratojugal_r2.cubeList.add(new ModelBox(Quadratojugal_r2, 7, 6, -0.8F, -1.5F, -0.5F, 1, 2, 1, -0.302F, true));
        this.Quadratojugal_r2.cubeList.add(new ModelBox(Quadratojugal_r2, 7, 6, 0.4F, -1.5F, -0.5F, 1, 2, 1, -0.302F, false));

        this.Jugal_r1 = new ModelRenderer(this);
        this.Jugal_r1.setRotationPoint(0.1F, 0.567F, -2.0512F);
        this.Head.addChild(Jugal_r1);
        this.setRotateAngle(Jugal_r1, 0.576F, 0.0F, 0.0F);
        this.Jugal_r1.cubeList.add(new ModelBox(Jugal_r1, 33, 44, -0.8F, -0.4F, -0.4F, 1, 1, 1, 0.004F, true));
        this.Jugal_r1.cubeList.add(new ModelBox(Jugal_r1, 33, 44, -0.4F, -0.4F, -0.4F, 1, 1, 1, 0.0F, false));

        this.Teeth_r1 = new ModelRenderer(this);
        this.Teeth_r1.setRotationPoint(0.1982F, 2.0076F, -4.2639F);
        this.Head.addChild(Teeth_r1);
        this.setRotateAngle(Teeth_r1, 0.4712F, 0.0167F, 0.0055F);
        this.Teeth_r1.cubeList.add(new ModelBox(Teeth_r1, 15, 44, -0.7F, -0.3F, -0.7F, 1, 1, 1, -0.21F, false));

        this.Teeth_r2 = new ModelRenderer(this);
        this.Teeth_r2.setRotationPoint(0.334F, 1.4204F, -3.112F);
        this.Head.addChild(Teeth_r2);
        this.setRotateAngle(Teeth_r2, 0.4743F, 0.11F, 0.0532F);
        this.Teeth_r2.cubeList.add(new ModelBox(Teeth_r2, 0, 44, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0001F, false));

        this.HeadslopeL = new ModelRenderer(this);
        this.HeadslopeL.setRotationPoint(0.5F, 0.0779F, 0.9272F);
        this.Head.addChild(HeadslopeL);


        this.AntiorbitalAirSinus_r1 = new ModelRenderer(this);
        this.AntiorbitalAirSinus_r1.setRotationPoint(-0.7396F, 0.1419F, -3.4468F);
        this.HeadslopeL.addChild(AntiorbitalAirSinus_r1);
        this.setRotateAngle(AntiorbitalAirSinus_r1, 0.6832F, -0.1506F, -0.0526F);
        this.AntiorbitalAirSinus_r1.cubeList.add(new ModelBox(AntiorbitalAirSinus_r1, 34, 23, -0.6183F, -0.2139F, -2.6234F, 1, 1, 3, -0.21F, true));

        this.AntiorbitalAirSinus_r2 = new ModelRenderer(this);
        this.AntiorbitalAirSinus_r2.setRotationPoint(-0.698F, 1.1782F, -2.9222F);
        this.HeadslopeL.addChild(AntiorbitalAirSinus_r2);
        this.setRotateAngle(AntiorbitalAirSinus_r2, 0.4225F, -0.1275F, -0.0571F);
        this.AntiorbitalAirSinus_r2.cubeList.add(new ModelBox(AntiorbitalAirSinus_r2, 35, 3, -0.6709F, -0.8091F, -2.7278F, 1, 1, 3, -0.203F, true));

        this.AntiorbitalAirSinus_r3 = new ModelRenderer(this);
        this.AntiorbitalAirSinus_r3.setRotationPoint(-0.2604F, 0.1419F, -3.4468F);
        this.HeadslopeL.addChild(AntiorbitalAirSinus_r3);
        this.setRotateAngle(AntiorbitalAirSinus_r3, 0.6832F, 0.1506F, 0.0526F);
        this.AntiorbitalAirSinus_r3.cubeList.add(new ModelBox(AntiorbitalAirSinus_r3, 34, 23, -0.3817F, -0.2139F, -2.6234F, 1, 1, 3, -0.21F, false));

        this.AntiorbitalAirSinus_r4 = new ModelRenderer(this);
        this.AntiorbitalAirSinus_r4.setRotationPoint(-0.302F, 1.1782F, -2.9222F);
        this.HeadslopeL.addChild(AntiorbitalAirSinus_r4);
        this.setRotateAngle(AntiorbitalAirSinus_r4, 0.4225F, 0.1275F, 0.0571F);
        this.AntiorbitalAirSinus_r4.cubeList.add(new ModelBox(AntiorbitalAirSinus_r4, 35, 3, -0.3291F, -0.8091F, -2.7278F, 1, 1, 3, -0.2F, false));

        this.HeadslopeL2 = new ModelRenderer(this);
        this.HeadslopeL2.setRotationPoint(-0.5F, 0.0779F, 0.9272F);
        this.Head.addChild(HeadslopeL2);


        this.BrowL = new ModelRenderer(this);
        this.BrowL.setRotationPoint(0.5147F, 0.0603F, -2.7074F);
        this.Head.addChild(BrowL);
        this.setRotateAngle(BrowL, -0.0698F, 0.0F, 0.0F);


        this.Crest_r1 = new ModelRenderer(this);
        this.Crest_r1.setRotationPoint(-1.1778F, 0.2405F, -0.1382F);
        this.BrowL.addChild(Crest_r1);
        this.setRotateAngle(Crest_r1, 0.7508F, -0.2221F, -0.4138F);
        this.Crest_r1.cubeList.add(new ModelBox(Crest_r1, 14, 40, -0.4F, -0.5F, -0.7F, 1, 1, 2, -0.4F, true));

        this.Crest_r2 = new ModelRenderer(this);
        this.Crest_r2.setRotationPoint(0.1483F, 0.2405F, -0.1382F);
        this.BrowL.addChild(Crest_r2);
        this.setRotateAngle(Crest_r2, 0.7508F, 0.2221F, 0.4138F);
        this.Crest_r2.cubeList.add(new ModelBox(Crest_r2, 14, 40, -0.6F, -0.5F, -0.7F, 1, 1, 2, -0.4F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(-0.5F, 0.9779F, 0.3272F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.1745F, 0.0F, 0.0F);


        this.Predentary_r1 = new ModelRenderer(this);
        this.Predentary_r1.setRotationPoint(0.5F, 2.5675F, -3.7174F);
        this.Jaw.addChild(Predentary_r1);
        this.setRotateAngle(Predentary_r1, 0.5236F, 0.0F, 0.0F);
        this.Predentary_r1.cubeList.add(new ModelBox(Predentary_r1, 49, 13, -0.5F, -0.3F, -0.9F, 1, 1, 1, -0.202F, false));
        this.Predentary_r1.cubeList.add(new ModelBox(Predentary_r1, 49, 30, -0.5F, -0.3F, -0.6F, 1, 1, 1, -0.2F, false));

        this.Angular_r1 = new ModelRenderer(this);
        this.Angular_r1.setRotationPoint(0.0F, 0.3935F, -0.279F);
        this.Jaw.addChild(Angular_r1);
        this.setRotateAngle(Angular_r1, 0.733F, 0.0F, 0.0F);
        this.Angular_r1.cubeList.add(new ModelBox(Angular_r1, 21, 41, -0.5F, -0.8088F, -1.7716F, 1, 1, 2, -0.19F, true));
        this.Angular_r1.cubeList.add(new ModelBox(Angular_r1, 21, 41, 0.5F, -0.8088F, -1.7716F, 1, 1, 2, -0.19F, false));

        this.Angular_r2 = new ModelRenderer(this);
        this.Angular_r2.setRotationPoint(0.0F, 1.1935F, -1.679F);
        this.Jaw.addChild(Angular_r2);
        this.setRotateAngle(Angular_r2, 0.5061F, 0.0F, 0.0F);
        this.Angular_r2.cubeList.add(new ModelBox(Angular_r2, 42, 11, -0.5F, -0.7293F, 0.5291F, 1, 1, 2, -0.194F, true));
        this.Angular_r2.cubeList.add(new ModelBox(Angular_r2, 42, 11, 0.5F, -0.7293F, 0.5291F, 1, 1, 2, -0.194F, false));

        this.Surangular_r1 = new ModelRenderer(this);
        this.Surangular_r1.setRotationPoint(0.0F, 0.2959F, -1.5971F);
        this.Jaw.addChild(Surangular_r1);
        this.setRotateAngle(Surangular_r1, 1.0036F, 0.0F, 0.0F);
        this.Surangular_r1.cubeList.add(new ModelBox(Surangular_r1, 47, 10, -0.5F, -0.2312F, -0.7667F, 1, 1, 1, -0.21F, true));
        this.Surangular_r1.cubeList.add(new ModelBox(Surangular_r1, 47, 10, 0.5F, -0.2312F, -0.7667F, 1, 1, 1, -0.21F, false));

        this.Squamosal_r24 = new ModelRenderer(this);
        this.Squamosal_r24.setRotationPoint(-0.03F, 1.0226F, -4.6554F);
        this.Jaw.addChild(Squamosal_r24);
        this.setRotateAngle(Squamosal_r24, 0.5323F, 0.0F, 0.0F);
        this.Squamosal_r24.cubeList.add(new ModelBox(Squamosal_r24, 10, 49, -0.61F, 0.9F, 2.5F, 1, 1, 1, -0.3F, true));

        this.Surangular_r2 = new ModelRenderer(this);
        this.Surangular_r2.setRotationPoint(0.0F, 0.3959F, -1.0971F);
        this.Jaw.addChild(Surangular_r2);
        this.setRotateAngle(Surangular_r2, 0.3578F, 0.0F, 0.0F);
        this.Surangular_r2.cubeList.add(new ModelBox(Surangular_r2, 7, 40, -0.5F, -0.5F, -0.6F, 1, 1, 2, -0.2F, true));
        this.Surangular_r2.cubeList.add(new ModelBox(Surangular_r2, 7, 40, 0.5F, -0.5F, -0.6F, 1, 1, 2, -0.2F, false));

        this.Teeth_r3 = new ModelRenderer(this);
        this.Teeth_r3.setRotationPoint(0.4695F, 1.6091F, -3.0876F);
        this.Jaw.addChild(Teeth_r3);
        this.setRotateAngle(Teeth_r3, 0.8477F, 0.0F, 0.0F);
        this.Teeth_r3.cubeList.add(new ModelBox(Teeth_r3, 26, 25, -0.4695F, -0.2404F, -1.1197F, 1, 1, 1, -0.201F, false));

        this.Teeth_r4 = new ModelRenderer(this);
        this.Teeth_r4.setRotationPoint(0.4695F, 1.6091F, -2.9876F);
        this.Jaw.addChild(Teeth_r4);
        this.setRotateAngle(Teeth_r4, 0.6383F, 0.0F, 0.0F);
        this.Teeth_r4.cubeList.add(new ModelBox(Teeth_r4, 34, 40, -0.4695F, -0.3F, -0.4F, 1, 1, 2, -0.201F, false));

        this.Squamosal_r25 = new ModelRenderer(this);
        this.Squamosal_r25.setRotationPoint(1.03F, 1.0226F, -4.6554F);
        this.Jaw.addChild(Squamosal_r25);
        this.setRotateAngle(Squamosal_r25, 0.5323F, 0.0F, 0.0F);
        this.Squamosal_r25.cubeList.add(new ModelBox(Squamosal_r25, 10, 49, -0.39F, 0.9F, 2.5F, 1, 1, 1, -0.3F, false));

        this.JawslopeL = new ModelRenderer(this);
        this.JawslopeL.setRotationPoint(1.0F, -0.5808F, 0.9268F);
        this.Jaw.addChild(JawslopeL);


        this.Dentary_r1 = new ModelRenderer(this);
        this.Dentary_r1.setRotationPoint(-0.6958F, 2.7653F, -3.4814F);
        this.JawslopeL.addChild(Dentary_r1);
        this.setRotateAngle(Dentary_r1, 0.6075F, -0.0998F, -0.0982F);
        this.Dentary_r1.cubeList.add(new ModelBox(Dentary_r1, 40, 21, -0.4712F, -0.7941F, -0.3019F, 1, 1, 2, -0.2F, true));

        this.Dentary_r2 = new ModelRenderer(this);
        this.Dentary_r2.setRotationPoint(-0.6958F, 1.3653F, -2.7814F);
        this.JawslopeL.addChild(Dentary_r2);
        this.setRotateAngle(Dentary_r2, 0.7471F, -0.0998F, -0.0982F);
        this.Dentary_r2.cubeList.add(new ModelBox(Dentary_r2, 15, 0, -0.6775F, -0.2359F, -2.6496F, 1, 1, 3, -0.204F, true));

        this.Dentary_r3 = new ModelRenderer(this);
        this.Dentary_r3.setRotationPoint(-0.3042F, 2.7653F, -3.4814F);
        this.JawslopeL.addChild(Dentary_r3);
        this.setRotateAngle(Dentary_r3, 0.6075F, 0.0998F, 0.0982F);
        this.Dentary_r3.cubeList.add(new ModelBox(Dentary_r3, 40, 21, -0.5288F, -0.7941F, -0.3019F, 1, 1, 2, -0.2F, false));

        this.Dentary_r4 = new ModelRenderer(this);
        this.Dentary_r4.setRotationPoint(-0.3042F, 1.3653F, -2.7814F);
        this.JawslopeL.addChild(Dentary_r4);
        this.setRotateAngle(Dentary_r4, 0.7471F, 0.0998F, 0.0982F);
        this.Dentary_r4.cubeList.add(new ModelBox(Dentary_r4, 15, 0, -0.3225F, -0.2359F, -2.6496F, 1, 1, 3, -0.204F, false));

        this.JawslopeL2 = new ModelRenderer(this);
        this.JawslopeL2.setRotationPoint(0.0F, -0.5808F, 0.9268F);
        this.Jaw.addChild(JawslopeL2);


        this.MasseterR = new ModelRenderer(this);
        this.MasseterR.setRotationPoint(-0.3F, -2.3808F, 1.6268F);
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
