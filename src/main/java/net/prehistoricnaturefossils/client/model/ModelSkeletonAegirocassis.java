package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAegirocassis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer Helement_shell;
    private final ModelRenderer Helement_R1_r1;
    private final ModelRenderer Helement_R2_r1;
    private final ModelRenderer Helement_R_r1;
    private final ModelRenderer Helement_L_r1;
    private final ModelRenderer PelementL;
    private final ModelRenderer PelementL1_r1;
    private final ModelRenderer PelementR;
    private final ModelRenderer PelementR2_r1;
    private final ModelRenderer PelementR1_r1;
    private final ModelRenderer headbase;
    private final ModelRenderer eyeR;
    private final ModelRenderer segments;
    private final ModelRenderer segment1;
    private final ModelRenderer finupperR;
    private final ModelRenderer finlowerL;
    private final ModelRenderer finlowerR;
    private final ModelRenderer segment2;
    private final ModelRenderer finlowerR2;
    private final ModelRenderer finupperR2;
    private final ModelRenderer finupperL2;
    private final ModelRenderer finlowerL2;
    private final ModelRenderer segment3;
    private final ModelRenderer finlowerR3;
    private final ModelRenderer segment4;
    private final ModelRenderer finupperR4;
    private final ModelRenderer finlowerL4;
    private final ModelRenderer finlowerR4;
    private final ModelRenderer segment5;
    private final ModelRenderer finupperR5;
    private final ModelRenderer finlowerR5;
    private final ModelRenderer finlowerL5;
    private final ModelRenderer segment6;
    private final ModelRenderer finlowerR6;
    private final ModelRenderer finupperL6;
    private final ModelRenderer finlowerL6;
    private final ModelRenderer segment7;
    private final ModelRenderer finupperR7;
    private final ModelRenderer finlowerL7;
    private final ModelRenderer finlowerR7;
    private final ModelRenderer segment8;
    private final ModelRenderer finlowerL8;
    private final ModelRenderer finupperR8;
    private final ModelRenderer finlowerR8;
    private final ModelRenderer segment9;
    private final ModelRenderer finlowerR9;
    private final ModelRenderer finlowerL9;
    private final ModelRenderer finupperR9;
    private final ModelRenderer segment10;
    private final ModelRenderer finupperR10;
    private final ModelRenderer finlowerL10;
    private final ModelRenderer finlowerR10;
    private final ModelRenderer segment11;

    public ModelSkeletonAegirocassis() {
        this.textureWidth = 133;
        this.textureHeight = 130;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 27, -5.0F, -12.0F, -17.0F, 10, 12, 18, -0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 31, 80, -4.0F, -9.0F, -25.0F, 8, 9, 8, -0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 78, -7.0F, -7.0F, -12.0F, 2, 7, 13, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 102, 45, -7.0F, -5.0F, -21.0F, 3, 5, 9, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -7.0F, -8.0F, 1.0F, 12, 8, 18, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 76, 71, -7.0F, -8.0F, 19.0F, 5, 8, 12, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 76, 51, -2.0F, -7.0F, 19.0F, 6, 7, 12, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 35, 36, 4.0F, -4.0F, -15.0F, 4, 4, 22, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 58, 4.0F, -4.0F, 13.0F, 6, 4, 15, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 97, 29, 1.0F, -9.0F, 7.0F, 8, 9, 6, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, -0.0436F, -0.0436F, -0.3491F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -9.0F, 0.0F);
        this.body.addChild(head);
        this.setRotateAngle(head, -0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 76, 0, -5.5F, -1.9F, -8.0F, 11, 3, 8, -0.003F, false));

        this.Helement_shell = new ModelRenderer(this);
        this.Helement_shell.setRotationPoint(0.0F, -3.25F, 0.0F);
        this.head.addChild(Helement_shell);


        this.Helement_R1_r1 = new ModelRenderer(this);
        this.Helement_R1_r1.setRotationPoint(-6.85F, 2.0F, -7.25F);
        this.Helement_shell.addChild(Helement_R1_r1);
        this.setRotateAngle(Helement_R1_r1, 0.0F, 0.0F, -0.5236F);
        this.Helement_R1_r1.cubeList.add(new ModelBox(Helement_R1_r1, 19, 98, -0.2F, 0.0F, -6.0F, 0, 3, 12, 0.0F, false));

        this.Helement_R2_r1 = new ModelRenderer(this);
        this.Helement_R2_r1.setRotationPoint(6.75F, 2.1F, -7.25F);
        this.Helement_shell.addChild(Helement_R2_r1);
        this.setRotateAngle(Helement_R2_r1, 0.0F, 0.0F, 0.5672F);
        this.Helement_R2_r1.cubeList.add(new ModelBox(Helement_R2_r1, 99, 80, 0.2F, -0.1F, -6.0F, 0, 3, 12, 0.0F, false));

        this.Helement_R_r1 = new ModelRenderer(this);
        this.Helement_R_r1.setRotationPoint(0.0F, 12.25F, 0.0F);
        this.Helement_shell.addChild(Helement_R_r1);
        this.setRotateAngle(Helement_R_r1, 0.0F, 0.0F, -0.5236F);
        this.Helement_R_r1.cubeList.add(new ModelBox(Helement_R_r1, 43, 0, -0.89F, -12.25F, -30.0F, 8, 0, 16, 0.0F, false));
        this.Helement_R_r1.cubeList.add(new ModelBox(Helement_R_r1, 66, 34, -0.89F, -12.25F, -14.0F, 8, 2, 14, 0.0F, false));

        this.Helement_L_r1 = new ModelRenderer(this);
        this.Helement_L_r1.setRotationPoint(0.0F, 12.25F, 0.0F);
        this.Helement_shell.addChild(Helement_L_r1);
        this.setRotateAngle(Helement_L_r1, 0.0F, 0.0F, 0.5236F);
        this.Helement_L_r1.cubeList.add(new ModelBox(Helement_L_r1, 43, 63, -7.11F, -12.25F, -14.0F, 8, 2, 14, 0.002F, false));
        this.Helement_L_r1.cubeList.add(new ModelBox(Helement_L_r1, 45, 17, -7.11F, -12.25F, -30.0F, 8, 0, 16, 0.0F, false));

        this.PelementL = new ModelRenderer(this);
        this.PelementL.setRotationPoint(4.0F, 1.0F, -7.0F);
        this.head.addChild(PelementL);


        this.PelementL1_r1 = new ModelRenderer(this);
        this.PelementL1_r1.setRotationPoint(-4.0F, 8.75F, 7.0F);
        this.PelementL.addChild(PelementL1_r1);
        this.setRotateAngle(PelementL1_r1, 0.0F, 0.0F, -0.2618F);
        this.PelementL1_r1.cubeList.add(new ModelBox(PelementL1_r1, 90, 96, 5.25F, -9.75F, -13.25F, 3, 3, 12, 0.0F, false));

        this.PelementR = new ModelRenderer(this);
        this.PelementR.setRotationPoint(-4.0F, 1.0F, -7.0F);
        this.head.addChild(PelementR);


        this.PelementR2_r1 = new ModelRenderer(this);
        this.PelementR2_r1.setRotationPoint(4.0F, 8.5F, 7.0F);
        this.PelementR.addChild(PelementR2_r1);
        this.setRotateAngle(PelementR2_r1, 0.0F, 0.0F, -0.2618F);
        this.PelementR2_r1.cubeList.add(new ModelBox(PelementR2_r1, 80, 12, -4.0F, -9.75F, -13.251F, 3, 4, 12, 0.0F, false));

        this.PelementR1_r1 = new ModelRenderer(this);
        this.PelementR1_r1.setRotationPoint(4.0F, 8.5F, 7.0F);
        this.PelementR.addChild(PelementR1_r1);
        this.setRotateAngle(PelementR1_r1, 0.0F, 0.0F, 0.2618F);
        this.PelementR1_r1.cubeList.add(new ModelBox(PelementR1_r1, 71, 92, -8.25F, -9.5F, -13.25F, 3, 3, 12, 0.0F, false));

        this.headbase = new ModelRenderer(this);
        this.headbase.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.head.addChild(headbase);


        this.eyeR = new ModelRenderer(this);
        this.eyeR.setRotationPoint(-4.5F, 0.5F, -0.5F);
        this.headbase.addChild(eyeR);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 14, -2.5F, -1.0F, -0.5F, 3, 2, 1, -0.006F, false));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 28, 58, -3.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.segments = new ModelRenderer(this);
        this.segments.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.body.addChild(segments);


        this.segment1 = new ModelRenderer(this);
        this.segment1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.segments.addChild(segment1);
        this.setRotateAngle(segment1, 0.0F, 0.0F, 0.1309F);
        this.segment1.cubeList.add(new ModelBox(segment1, 99, 71, -5.0F, -2.0F, 0.0F, 10, 5, 3, 0.0F, false));

        this.finupperR = new ModelRenderer(this);
        this.finupperR.setRotationPoint(-5.0F, -2.0F, 1.0F);
        this.segment1.addChild(finupperR);
        this.setRotateAngle(finupperR, 0.0F, 0.0F, -0.4276F);
        this.finupperR.cubeList.add(new ModelBox(finupperR, 0, 35, 0.0F, -4.0F, -1.0F, 2, 4, 3, -0.003F, false));

        this.finlowerL = new ModelRenderer(this);
        this.finlowerL.setRotationPoint(5.0F, 3.0F, 1.0F);
        this.segment1.addChild(finlowerL);
        this.setRotateAngle(finlowerL, 0.0F, 0.0F, -0.7854F);
        this.finlowerL.cubeList.add(new ModelBox(finlowerL, 76, 0, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerR = new ModelRenderer(this);
        this.finlowerR.setRotationPoint(-5.0F, 3.0F, 1.0F);
        this.segment1.addChild(finlowerR);
        this.setRotateAngle(finlowerR, 0.0F, 0.0F, -0.0436F);
        this.finlowerR.cubeList.add(new ModelBox(finlowerR, 90, 92, 0.0F, 0.0F, -1.0F, 1, 4, 3, 0.0F, false));

        this.segment2 = new ModelRenderer(this);
        this.segment2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment1.addChild(segment2);
        this.segment2.cubeList.add(new ModelBox(segment2, 99, 12, -5.0F, -2.01F, 0.0F, 10, 5, 3, 0.0F, false));

        this.finlowerR2 = new ModelRenderer(this);
        this.finlowerR2.setRotationPoint(-5.0F, 3.0F, 1.0F);
        this.segment2.addChild(finlowerR2);
        this.setRotateAngle(finlowerR2, 0.0F, 0.0F, -0.0436F);
        this.finlowerR2.cubeList.add(new ModelBox(finlowerR2, 0, 78, 0.0F, 0.0F, -1.0F, 1, 4, 3, 0.0F, false));

        this.finupperR2 = new ModelRenderer(this);
        this.finupperR2.setRotationPoint(-5.0F, -2.0F, 1.0F);
        this.segment2.addChild(finupperR2);
        this.setRotateAngle(finupperR2, 0.0F, 0.0F, -0.7069F);
        this.finupperR2.cubeList.add(new ModelBox(finupperR2, 0, 0, 0.0F, -4.0F, -1.0F, 3, 4, 3, -0.003F, false));

        this.finupperL2 = new ModelRenderer(this);
        this.finupperL2.setRotationPoint(5.0F, -2.0F, 1.0F);
        this.segment2.addChild(finupperL2);
        this.setRotateAngle(finupperL2, 0.0F, 0.0F, 2.9234F);
        this.finupperL2.cubeList.add(new ModelBox(finupperL2, 9, 108, 0.0F, -4.0F, -1.0F, 1, 4, 3, -0.003F, false));

        this.finlowerL2 = new ModelRenderer(this);
        this.finlowerL2.setRotationPoint(5.0F, 3.0F, 1.0F);
        this.segment2.addChild(finlowerL2);
        this.setRotateAngle(finlowerL2, 0.0F, 0.0F, -0.7854F);
        this.finlowerL2.cubeList.add(new ModelBox(finlowerL2, 72, 39, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.segment3 = new ModelRenderer(this);
        this.segment3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment2.addChild(segment3);
        this.setRotateAngle(segment3, 0.0F, 0.0F, 0.0436F);
        this.segment3.cubeList.add(new ModelBox(segment3, 0, 99, -5.0F, -2.0F, 0.0F, 10, 5, 3, 0.0F, false));

        this.finlowerR3 = new ModelRenderer(this);
        this.finlowerR3.setRotationPoint(-5.0F, 3.0F, 1.0F);
        this.segment3.addChild(finlowerR3);
        this.setRotateAngle(finlowerR3, 0.0F, 0.0F, -0.0873F);
        this.finlowerR3.cubeList.add(new ModelBox(finlowerR3, 66, 34, 0.0F, 0.0F, -1.0F, 1, 4, 3, 0.0F, false));

        this.segment4 = new ModelRenderer(this);
        this.segment4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment3.addChild(segment4);
        this.setRotateAngle(segment4, 0.0F, 0.0873F, 0.0F);
        this.segment4.cubeList.add(new ModelBox(segment4, 28, 63, -5.0F, -2.01F, 0.0F, 10, 5, 3, 0.0F, false));

        this.finupperR4 = new ModelRenderer(this);
        this.finupperR4.setRotationPoint(-5.0F, -2.0F, 1.0F);
        this.segment4.addChild(finupperR4);
        this.setRotateAngle(finupperR4, 0.0F, 0.0F, 1.2217F);
        this.finupperR4.cubeList.add(new ModelBox(finupperR4, 0, 27, 0.0F, -4.0F, -1.0F, 2, 4, 3, -0.003F, false));

        this.finlowerL4 = new ModelRenderer(this);
        this.finlowerL4.setRotationPoint(5.0F, 3.0F, 1.0F);
        this.segment4.addChild(finlowerL4);
        this.setRotateAngle(finlowerL4, 0.0F, 0.0F, -0.7854F);


        this.finlowerR4 = new ModelRenderer(this);
        this.finlowerR4.setRotationPoint(-5.0F, 3.0F, 1.0F);
        this.segment4.addChild(finlowerR4);
        this.setRotateAngle(finlowerR4, 0.0F, 0.0F, -0.0873F);
        this.finlowerR4.cubeList.add(new ModelBox(finlowerR4, 6, 63, 0.0F, 0.0F, -1.0F, 1, 4, 3, 0.0F, false));

        this.segment5 = new ModelRenderer(this);
        this.segment5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment4.addChild(segment5);
        this.setRotateAngle(segment5, 0.0F, 0.0873F, 0.0873F);
        this.segment5.cubeList.add(new ModelBox(segment5, 66, 109, -4.5F, -2.0F, 0.0F, 9, 5, 3, 0.0F, false));

        this.finupperR5 = new ModelRenderer(this);
        this.finupperR5.setRotationPoint(-4.5F, -2.0F, 1.0F);
        this.segment5.addChild(finupperR5);
        this.setRotateAngle(finupperR5, 0.0F, 0.0F, 1.2217F);
        this.finupperR5.cubeList.add(new ModelBox(finupperR5, 52, 27, 0.0F, -3.0F, -1.0F, 2, 3, 2, -0.003F, false));

        this.finlowerR5 = new ModelRenderer(this);
        this.finlowerR5.setRotationPoint(-4.5F, 3.0F, 1.0F);
        this.segment5.addChild(finlowerR5);
        this.setRotateAngle(finlowerR5, 0.0F, 0.0F, -0.0436F);
        this.finlowerR5.cubeList.add(new ModelBox(finlowerR5, 0, 58, 0.0F, 0.0F, -1.0F, 1, 4, 3, 0.0F, false));

        this.finlowerL5 = new ModelRenderer(this);
        this.finlowerL5.setRotationPoint(4.5F, 3.0F, 1.0F);
        this.segment5.addChild(finlowerL5);
        this.setRotateAngle(finlowerL5, 0.0F, 0.0F, -0.7854F);


        this.segment6 = new ModelRenderer(this);
        this.segment6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment5.addChild(segment6);
        this.setRotateAngle(segment6, 0.0F, 0.0873F, 0.0F);
        this.segment6.cubeList.add(new ModelBox(segment6, 44, 103, -4.5F, -2.01F, 0.0F, 9, 5, 3, 0.0F, false));

        this.finlowerR6 = new ModelRenderer(this);
        this.finlowerR6.setRotationPoint(-4.5F, 3.0F, 1.0F);
        this.segment6.addChild(finlowerR6);
        this.setRotateAngle(finlowerR6, 0.0F, 0.0F, 0.1309F);
        this.finlowerR6.cubeList.add(new ModelBox(finlowerR6, 43, 8, 0.0F, 0.0F, -1.0F, 1, 4, 3, 0.0F, false));

        this.finupperL6 = new ModelRenderer(this);
        this.finupperL6.setRotationPoint(4.5F, -2.0F, 1.0F);
        this.segment6.addChild(finupperL6);
        this.setRotateAngle(finupperL6, 0.0F, 0.0F, 2.8362F);
        this.finupperL6.cubeList.add(new ModelBox(finupperL6, 73, 51, 0.0F, -4.0F, -1.0F, 1, 4, 2, 0.0F, false));

        this.finlowerL6 = new ModelRenderer(this);
        this.finlowerL6.setRotationPoint(4.5F, 3.0F, 1.0F);
        this.segment6.addChild(finlowerL6);
        this.setRotateAngle(finlowerL6, 0.0F, 0.0F, -0.7854F);


        this.segment7 = new ModelRenderer(this);
        this.segment7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment6.addChild(segment7);
        this.setRotateAngle(segment7, 0.0F, 0.0873F, 0.0F);
        this.segment7.cubeList.add(new ModelBox(segment7, 109, 96, -4.0F, -2.0F, 0.0F, 8, 5, 3, 0.0F, false));

        this.finupperR7 = new ModelRenderer(this);
        this.finupperR7.setRotationPoint(-4.0F, -2.0F, 1.0F);
        this.segment7.addChild(finupperR7);
        this.setRotateAngle(finupperR7, 0.0F, 0.0F, 1.4835F);
        this.finupperR7.cubeList.add(new ModelBox(finupperR7, 13, 6, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.003F, false));

        this.finlowerL7 = new ModelRenderer(this);
        this.finlowerL7.setRotationPoint(4.0F, 3.0F, 1.0F);
        this.segment7.addChild(finlowerL7);
        this.setRotateAngle(finlowerL7, 0.0F, 0.0F, -0.7854F);
        this.finlowerL7.cubeList.add(new ModelBox(finlowerL7, 11, 35, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.finlowerR7 = new ModelRenderer(this);
        this.finlowerR7.setRotationPoint(-4.0F, 3.0F, 1.0F);
        this.segment7.addChild(finlowerR7);
        this.setRotateAngle(finlowerR7, 0.0F, 0.0F, 0.6545F);
        this.finlowerR7.cubeList.add(new ModelBox(finlowerR7, 43, 0, 0.0F, 0.0F, -1.0F, 1, 4, 3, 0.0F, false));

        this.segment8 = new ModelRenderer(this);
        this.segment8.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment7.addChild(segment8);
        this.setRotateAngle(segment8, -0.0436F, 0.0F, 0.0436F);
        this.segment8.cubeList.add(new ModelBox(segment8, 18, 78, -3.5F, -1.5F, 0.0F, 7, 4, 3, 0.0F, false));

        this.finlowerL8 = new ModelRenderer(this);
        this.finlowerL8.setRotationPoint(3.5F, 2.5F, 1.0F);
        this.segment8.addChild(finlowerL8);
        this.setRotateAngle(finlowerL8, 0.0F, 0.0F, -0.6109F);
        this.finlowerL8.cubeList.add(new ModelBox(finlowerL8, 32, 98, -1.0F, 0.0F, -1.0F, 1, 4, 3, 0.0F, false));

        this.finupperR8 = new ModelRenderer(this);
        this.finupperR8.setRotationPoint(-3.5F, -1.5F, 1.0F);
        this.segment8.addChild(finupperR8);
        this.setRotateAngle(finupperR8, 0.0F, 0.0F, 1.3526F);
        this.finupperR8.cubeList.add(new ModelBox(finupperR8, 0, 108, 0.0F, -4.0F, -1.0F, 1, 4, 3, -0.003F, false));

        this.finlowerR8 = new ModelRenderer(this);
        this.finlowerR8.setRotationPoint(-3.25F, 2.5F, 1.0F);
        this.segment8.addChild(finlowerR8);
        this.setRotateAngle(finlowerR8, 0.0F, 0.0F, 0.7854F);


        this.segment9 = new ModelRenderer(this);
        this.segment9.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.segment8.addChild(segment9);
        this.setRotateAngle(segment9, -0.0873F, 0.0873F, 0.0F);
        this.segment9.cubeList.add(new ModelBox(segment9, 107, 0, -3.0F, -1.5F, 0.0F, 6, 4, 3, 0.0F, false));

        this.finlowerR9 = new ModelRenderer(this);
        this.finlowerR9.setRotationPoint(-3.0F, 2.5F, 1.0F);
        this.segment9.addChild(finlowerR9);
        this.setRotateAngle(finlowerR9, 0.0F, 0.0F, 0.7854F);
        this.finlowerR9.cubeList.add(new ModelBox(finlowerR9, 66, 51, 0.0F, 0.0F, -1.0F, 0, 3, 3, 0.0F, false));

        this.finlowerL9 = new ModelRenderer(this);
        this.finlowerL9.setRotationPoint(3.0F, 2.5F, 1.0F);
        this.segment9.addChild(finlowerL9);
        this.setRotateAngle(finlowerL9, 0.0F, 0.0F, -0.5672F);
        this.finlowerL9.cubeList.add(new ModelBox(finlowerL9, 39, 34, -2.0F, 0.0F, -1.0F, 2, 3, 3, 0.0F, false));

        this.finupperR9 = new ModelRenderer(this);
        this.finupperR9.setRotationPoint(-3.0F, -1.5F, 1.0F);
        this.segment9.addChild(finupperR9);
        this.setRotateAngle(finupperR9, 0.0F, 0.0F, 1.309F);
        this.finupperR9.cubeList.add(new ModelBox(finupperR9, 47, 38, 0.0F, -3.0F, -1.0F, 1, 3, 3, -0.003F, false));

        this.segment10 = new ModelRenderer(this);
        this.segment10.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.segment9.addChild(segment10);
        this.segment10.cubeList.add(new ModelBox(segment10, 0, 8, -2.5F, -1.5F, 0.0F, 5, 3, 2, 0.0F, false));

        this.finupperR10 = new ModelRenderer(this);
        this.finupperR10.setRotationPoint(-2.5F, -1.5F, 1.0F);
        this.segment10.addChild(finupperR10);
        this.setRotateAngle(finupperR10, 0.0F, 0.0F, 1.3526F);
        this.finupperR10.cubeList.add(new ModelBox(finupperR10, 74, 71, 0.0F, -3.0F, -1.0F, 1, 3, 2, -0.003F, false));

        this.finlowerL10 = new ModelRenderer(this);
        this.finlowerL10.setRotationPoint(2.5F, 1.5F, 1.0F);
        this.segment10.addChild(finlowerL10);
        this.setRotateAngle(finlowerL10, 0.0F, 0.0F, 0.0873F);


        this.finlowerR10 = new ModelRenderer(this);
        this.finlowerR10.setRotationPoint(-2.5F, 1.5F, 1.0F);
        this.segment10.addChild(finlowerR10);
        this.setRotateAngle(finlowerR10, 0.0F, 0.0F, 0.7854F);


        this.segment11 = new ModelRenderer(this);
        this.segment11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment10.addChild(segment11);
        this.segment11.cubeList.add(new ModelBox(segment11, 39, 27, -2.0F, -1.0F, 0.0F, 4, 2, 2, 0.0F, false));

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
