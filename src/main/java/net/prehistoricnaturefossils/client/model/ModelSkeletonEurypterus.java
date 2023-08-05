package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEurypterus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body;
    private final ModelRenderer frontlegr;
    private final ModelRenderer frontlegL;
    private final ModelRenderer paddleL;
    private final ModelRenderer paddleL2;
    private final ModelRenderer paddle2L_r1;
    private final ModelRenderer paddleR;
    private final ModelRenderer paddle1R_r1;
    private final ModelRenderer paddleR2;
    private final ModelRenderer paddle2R_r1;
    private final ModelRenderer head;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer body4;
    private final ModelRenderer tail_end;
    private final ModelRenderer body5;
    private final ModelRenderer frontlegr2;
    private final ModelRenderer frontlegL2;
    private final ModelRenderer paddleL3;
    private final ModelRenderer paddleL4;
    private final ModelRenderer paddle2L_r2;
    private final ModelRenderer paddleR3;
    private final ModelRenderer paddleR4;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer body6;
    private final ModelRenderer body7;
    private final ModelRenderer body8;
    private final ModelRenderer tail_end2;
    private final ModelRenderer body9;
    private final ModelRenderer body10;
    private final ModelRenderer body11;
    private final ModelRenderer tail_end3;
    private final ModelRenderer body17;
    private final ModelRenderer tergite4_r1;
    private final ModelRenderer frontlegr4;
    private final ModelRenderer paddleR5;
    private final ModelRenderer paddleR6;
    private final ModelRenderer head4;
    private final ModelRenderer body12;
    private final ModelRenderer tergite4_r2;
    private final ModelRenderer tergite4_r3;
    private final ModelRenderer frontlegr3;
    private final ModelRenderer body13;
    private final ModelRenderer body14;
    private final ModelRenderer body15;
    private final ModelRenderer tail_end4;
    private final ModelRenderer body16;
    private final ModelRenderer tail_end5;

    public ModelSkeletonEurypterus() {
        this.textureWidth = 288;
        this.textureHeight = 200;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(11.3019F, -8.0F, -51.8436F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.9163F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 148, 112, 21.4854F, -11.8F, 15.3911F, 24, 20, 43, 0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 0, 21.4854F, -10.0F, 75.3911F, 7, 18, 8, 0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5146F, -12.0F, 0.3911F, 22, 20, 83, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(28.3019F, -8.0F, 2.1564F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 128, 0, -15.1429F, -12.0F, -54.299F, 15, 20, 55, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(28.3019F, -8.0F, 2.1564F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -8.1429F, -11.0F, -0.299F, 8, 19, 29, 0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-5.0F, -8.0F, 14.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0873F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 104, -33.0F, -12.0F, -15.0F, 65, 20, 30, 0.004F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -21.8F, -1.0F);
        this.fossil.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 43, 49, -5.0F, 1.0F, 0.0F, 10, 0, 8, 0.0F, false));

        this.frontlegr = new ModelRenderer(this);
        this.frontlegr.setRotationPoint(-4.2612F, 1.5F, -2.9698F);
        this.body.addChild(frontlegr);
        this.setRotateAngle(frontlegr, 0.0F, -0.2618F, 0.0F);
        this.frontlegr.cubeList.add(new ModelBox(frontlegr, 70, 61, -3.4962F, 0.0F, -0.4128F, 5, 0, 1, 0.0F, false));

        this.frontlegL = new ModelRenderer(this);
        this.frontlegL.setRotationPoint(4.5F, 1.5F, -2.5F);
        this.body.addChild(frontlegL);
        this.setRotateAngle(frontlegL, 0.0F, 0.2618F, 0.0F);
        this.frontlegL.cubeList.add(new ModelBox(frontlegL, 69, 6, -1.5F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.paddleL = new ModelRenderer(this);
        this.paddleL.setRotationPoint(3.0F, 1.0F, 0.0F);
        this.body.addChild(paddleL);
        this.setRotateAngle(paddleL, 0.0F, -0.1309F, 0.0F);
        this.paddleL.cubeList.add(new ModelBox(paddleL, 70, 58, 0.0F, 0.6F, -1.0F, 4, 0, 2, 0.0F, false));

        this.paddleL2 = new ModelRenderer(this);
        this.paddleL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.paddleL.addChild(paddleL2);


        this.paddle2L_r1 = new ModelRenderer(this);
        this.paddle2L_r1.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.paddleL2.addChild(paddle2L_r1);
        this.setRotateAngle(paddle2L_r1, 0.0F, -0.6109F, 0.0F);
        this.paddle2L_r1.cubeList.add(new ModelBox(paddle2L_r1, 13, 110, -0.5F, 0.5F, -0.9F, 5, 0, 3, 0.0F, false));

        this.paddleR = new ModelRenderer(this);
        this.paddleR.setRotationPoint(-3.0F, 1.0F, 0.0F);
        this.body.addChild(paddleR);
        this.setRotateAngle(paddleR, 0.0F, 0.2618F, 0.0F);
        this.paddleR.cubeList.add(new ModelBox(paddleR, 69, 3, -4.0F, 0.5F, -1.0F, 4, 0, 2, 0.0F, false));

        this.paddle1R_r1 = new ModelRenderer(this);
        this.paddle1R_r1.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.paddleR.addChild(paddle1R_r1);
        this.setRotateAngle(paddle1R_r1, 0.0F, 0.6109F, 0.0F);
        this.paddle1R_r1.cubeList.add(new ModelBox(paddle1R_r1, 14, 25, -3.1F, 0.6F, -0.6F, 4, 0, 2, 0.0F, false));

        this.paddleR2 = new ModelRenderer(this);
        this.paddleR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.paddleR.addChild(paddleR2);


        this.paddle2R_r1 = new ModelRenderer(this);
        this.paddle2R_r1.setRotationPoint(-4.0F, 0.0F, 2.0F);
        this.paddleR2.addChild(paddle2R_r1);
        this.setRotateAngle(paddle2R_r1, 0.0F, 1.309F, 0.0F);
        this.paddle2R_r1.cubeList.add(new ModelBox(paddle2R_r1, 65, 75, -5.0F, 0.5F, -3.0F, 5, 0, 3, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 64, -4.5F, 0.8F, -6.0F, 9, 0, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 31, 71, -5.0F, 1.1F, -8.0F, 10, 0, 5, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.0873F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 128, 0, -4.0F, 1.1F, -1.0F, 7, 0, 5, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, 0.1745F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 128, 44, -2.2F, 1.0F, -1.0F, 4, 0, 5, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(-1.0F, 0.0F, 4.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0F, 0.0436F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 13, 14, -0.5F, 1.0F, 0.0F, 3, 0, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 142, 26, -1.0F, 1.1F, 2.0F, 4, 0, 4, 0.0F, false));

        this.tail_end = new ModelRenderer(this);
        this.tail_end.setRotationPoint(1.0F, 0.0F, 4.0F);
        this.body4.addChild(tail_end);
        this.setRotateAngle(tail_end, 0.0F, -1.0908F, 0.0F);
        this.tail_end.cubeList.add(new ModelBox(tail_end, 0, 115, -0.5F, 1.2F, 0.0F, 1, 0, 10, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(11.0F, -26.0F, 9.0F);
        this.fossil.addChild(body5);
        this.setRotateAngle(body5, 0.0F, 2.5307F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 0, 49, -6.0F, 5.4F, 0.0F, 13, 0, 8, 0.0F, false));

        this.frontlegr2 = new ModelRenderer(this);
        this.frontlegr2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body5.addChild(frontlegr2);
        this.frontlegr2.cubeList.add(new ModelBox(frontlegr2, 59, 27, -8.0F, 5.9F, -3.0F, 5, 0, 1, 0.0F, false));

        this.frontlegL2 = new ModelRenderer(this);
        this.frontlegL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body5.addChild(frontlegL2);
        this.frontlegL2.cubeList.add(new ModelBox(frontlegL2, 35, 55, 3.0F, 5.5F, -3.0F, 5, 0, 1, 0.0F, false));

        this.paddleL3 = new ModelRenderer(this);
        this.paddleL3.setRotationPoint(3.0F, 1.0F, 0.0F);
        this.body5.addChild(paddleL3);
        this.setRotateAngle(paddleL3, 0.0F, 0.2618F, 0.0F);
        this.paddleL3.cubeList.add(new ModelBox(paddleL3, 35, 52, 0.0F, 4.8F, -1.0F, 4, 0, 2, 0.0F, false));

        this.paddleL4 = new ModelRenderer(this);
        this.paddleL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.paddleL3.addChild(paddleL4);


        this.paddle2L_r2 = new ModelRenderer(this);
        this.paddle2L_r2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.paddleL4.addChild(paddle2L_r2);
        this.setRotateAngle(paddle2L_r2, 0.0F, -0.6109F, 0.0F);
        this.paddle2L_r2.cubeList.add(new ModelBox(paddle2L_r2, 0, 25, -0.5F, 4.9F, -0.9F, 5, 0, 3, 0.0F, false));

        this.paddleR3 = new ModelRenderer(this);
        this.paddleR3.setRotationPoint(-3.0F, 1.0F, 0.0F);
        this.body5.addChild(paddleR3);
        this.setRotateAngle(paddleR3, 0.0F, 0.4363F, 0.0F);
        this.paddleR3.cubeList.add(new ModelBox(paddleR3, 69, 0, -4.0F, 4.9F, -1.0F, 4, 0, 2, 0.0F, false));

        this.paddleR4 = new ModelRenderer(this);
        this.paddleR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.paddleR3.addChild(paddleR4);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body5.addChild(head2);
        this.head2.cubeList.add(new ModelBox(head2, 31, 58, -5.0F, 5.4F, -6.0F, 11, 0, 6, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 0, 58, -6.0F, 5.5F, -8.0F, 13, 0, 5, 0.0F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(17.2F, 4.8F, 34.2F);
        this.body5.addChild(head3);
        this.setRotateAngle(head3, 0.0F, 2.7053F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 0, 7, -4.0F, 1.0F, -6.0F, 8, 0, 6, 0.0F, false));
        this.head3.cubeList.add(new ModelBox(head3, 31, 65, -5.0F, 1.1F, -8.0F, 10, 0, 5, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 77, -5.0F, 5.4F, 0.0F, 10, 0, 4, 0.0F, false));

        this.body7 = new ModelRenderer(this);
        this.body7.setRotationPoint(0.0F, -0.2F, 4.0F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, 0.0F, 0.0436F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 128, 16, -3.5F, 5.4F, 0.0F, 7, 0, 4, 0.0F, false));

        this.body8 = new ModelRenderer(this);
        this.body8.setRotationPoint(-1.0F, 0.2F, 4.0F);
        this.body7.addChild(body8);
        this.setRotateAngle(body8, 0.0F, 0.1309F, 0.0F);
        this.body8.cubeList.add(new ModelBox(body8, 128, 50, -1.5F, 5.4F, 0.0F, 5, 0, 4, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 128, 38, -1.0F, 5.5F, 2.0F, 4, 0, 5, 0.0F, false));

        this.tail_end2 = new ModelRenderer(this);
        this.tail_end2.setRotationPoint(1.0F, 0.0F, 4.0F);
        this.body8.addChild(tail_end2);
        this.setRotateAngle(tail_end2, 0.0F, 0.1309F, 0.0F);
        this.tail_end2.cubeList.add(new ModelBox(tail_end2, 0, 104, -0.5F, 5.8F, 0.0F, 1, 0, 10, 0.0F, false));

        this.body9 = new ModelRenderer(this);
        this.body9.setRotationPoint(-19.0F, 4.4F, -14.0F);
        this.body5.addChild(body9);
        this.setRotateAngle(body9, 0.0F, 0.5672F, 0.0F);
        this.body9.cubeList.add(new ModelBox(body9, 128, 21, -3.0F, 1.0F, 0.0F, 6, 0, 4, 0.0F, false));

        this.body10 = new ModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body9.addChild(body10);
        this.setRotateAngle(body10, 0.0F, 0.3054F, 0.0F);
        this.body10.cubeList.add(new ModelBox(body10, 128, 32, -1.9F, 1.1F, -1.0F, 4, 0, 5, 0.0F, false));

        this.body11 = new ModelRenderer(this);
        this.body11.setRotationPoint(-1.0F, 0.0F, 4.0F);
        this.body10.addChild(body11);
        this.setRotateAngle(body11, 0.0F, -0.2182F, 0.0F);
        this.body11.cubeList.add(new ModelBox(body11, 13, 104, -0.5F, 1.2F, -1.0F, 3, 0, 5, 0.0F, false));
        this.body11.cubeList.add(new ModelBox(body11, 140, 76, -1.0F, 1.3F, 2.0F, 4, 0, 4, 0.0F, false));

        this.tail_end3 = new ModelRenderer(this);
        this.tail_end3.setRotationPoint(1.0F, 0.0F, 4.0F);
        this.body11.addChild(tail_end3);
        this.setRotateAngle(tail_end3, 0.0F, -0.1745F, 0.0F);
        this.tail_end3.cubeList.add(new ModelBox(tail_end3, 52, 69, -0.5F, 1.4F, 0.0F, 1, 0, 10, 0.0F, false));

        this.body17 = new ModelRenderer(this);
        this.body17.setRotationPoint(17.0F, -21.5F, -50.0F);
        this.fossil.addChild(body17);
        this.setRotateAngle(body17, 0.0F, 2.5307F, 0.0F);
        this.body17.cubeList.add(new ModelBox(body17, 13, 19, -4.0F, 1.2F, 0.0F, 2, 0, 4, 0.0F, false));

        this.tergite4_r1 = new ModelRenderer(this);
        this.tergite4_r1.setRotationPoint(-3.0F, 0.0F, 2.0F);
        this.body17.addChild(tergite4_r1);
        this.setRotateAngle(tergite4_r1, 0.0F, 0.5236F, 0.0F);
        this.tergite4_r1.cubeList.add(new ModelBox(tergite4_r1, 128, 6, 0.0F, 1.3F, -2.0F, 7, 0, 4, 0.0F, false));

        this.frontlegr4 = new ModelRenderer(this);
        this.frontlegr4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body17.addChild(frontlegr4);
        this.frontlegr4.cubeList.add(new ModelBox(frontlegr4, 46, 27, -8.0F, 1.3F, -3.0F, 5, 0, 1, 0.0F, false));

        this.paddleR5 = new ModelRenderer(this);
        this.paddleR5.setRotationPoint(-3.0F, 1.0F, 0.0F);
        this.body17.addChild(paddleR5);
        this.setRotateAngle(paddleR5, 0.0F, 0.4363F, 0.0F);
        this.paddleR5.cubeList.add(new ModelBox(paddleR5, 35, 49, -4.0F, 0.3F, -1.0F, 4, 0, 2, 0.0F, false));

        this.paddleR6 = new ModelRenderer(this);
        this.paddleR6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.paddleR5.addChild(paddleR6);


        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body17.addChild(head4);
        this.head4.cubeList.add(new ModelBox(head4, 0, 0, -4.0F, 1.2F, -6.0F, 8, 0, 6, 0.0F, false));
        this.head4.cubeList.add(new ModelBox(head4, 0, 71, -5.0F, 1.3F, -8.0F, 10, 0, 5, 0.0F, false));

        this.body12 = new ModelRenderer(this);
        this.body12.setRotationPoint(-29.0F, -26.0F, -22.0F);
        this.fossil.addChild(body12);
        this.setRotateAngle(body12, 0.0F, 1.4835F, 0.0F);


        this.tergite4_r2 = new ModelRenderer(this);
        this.tergite4_r2.setRotationPoint(3.4891F, 1.0F, 3.04F);
        this.body12.addChild(tergite4_r2);
        this.setRotateAngle(tergite4_r2, 0.0F, -0.7854F, 0.0F);
        this.tergite4_r2.cubeList.add(new ModelBox(tergite4_r2, 0, 126, -6.3432F, 4.4F, 0.6696F, 9, 0, 4, 0.0F, false));

        this.tergite4_r3 = new ModelRenderer(this);
        this.tergite4_r3.setRotationPoint(-0.9109F, 1.0F, 0.04F);
        this.body12.addChild(tergite4_r3);
        this.setRotateAngle(tergite4_r3, 0.0F, -0.1745F, 0.0F);
        this.tergite4_r3.cubeList.add(new ModelBox(tergite4_r3, 65, 69, -3.1891F, 4.3F, -0.74F, 3, 0, 5, 0.0F, false));
        this.tergite4_r3.cubeList.add(new ModelBox(tergite4_r3, 25, 78, -3.1891F, 4.3F, 4.16F, 10, 0, 4, 0.0F, false));

        this.frontlegr3 = new ModelRenderer(this);
        this.frontlegr3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body12.addChild(frontlegr3);


        this.body13 = new ModelRenderer(this);
        this.body13.setRotationPoint(-1.2F, 0.0F, 7.7F);
        this.body12.addChild(body13);
        this.setRotateAngle(body13, 0.0F, -0.3054F, 0.0F);
        this.body13.cubeList.add(new ModelBox(body13, 128, 11, -3.0F, 5.4F, 0.0F, 7, 0, 4, 0.0F, false));

        this.body14 = new ModelRenderer(this);
        this.body14.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body13.addChild(body14);
        this.setRotateAngle(body14, 0.0F, -0.4363F, 0.0F);
        this.body14.cubeList.add(new ModelBox(body14, 128, 26, -1.5F, 5.5F, -1.0F, 4, 0, 5, 0.0F, false));

        this.body15 = new ModelRenderer(this);
        this.body15.setRotationPoint(-1.0F, 0.1F, 3.5F);
        this.body14.addChild(body15);
        this.setRotateAngle(body15, 0.0F, -0.6545F, 0.0F);
        this.body15.cubeList.add(new ModelBox(body15, 13, 115, -0.5F, 5.5F, -1.0F, 3, 0, 5, 0.0F, false));
        this.body15.cubeList.add(new ModelBox(body15, 142, 32, -1.0F, 5.6F, 2.0F, 4, 0, 4, 0.0F, false));

        this.tail_end4 = new ModelRenderer(this);
        this.tail_end4.setRotationPoint(1.0F, 0.0F, 4.0F);
        this.body15.addChild(tail_end4);
        this.setRotateAngle(tail_end4, 0.0F, -0.3054F, 0.0F);
        this.tail_end4.cubeList.add(new ModelBox(tail_end4, 57, 58, -0.5F, 5.8F, 0.0F, 1, 0, 10, 0.0F, false));

        this.body16 = new ModelRenderer(this);
        this.body16.setRotationPoint(32.0F, 4.5F, -5.6F);
        this.body14.addChild(body16);
        this.setRotateAngle(body16, 0.0F, -1.4835F, 0.0F);
        this.body16.cubeList.add(new ModelBox(body16, 128, 76, -0.5F, 1.0F, -1.0F, 3, 0, 5, 0.0F, false));
        this.body16.cubeList.add(new ModelBox(body16, 142, 38, -1.0F, 1.1F, 2.0F, 4, 0, 4, 0.0F, false));

        this.tail_end5 = new ModelRenderer(this);
        this.tail_end5.setRotationPoint(1.0F, 0.7F, 4.0F);
        this.body16.addChild(tail_end5);
        this.setRotateAngle(tail_end5, 0.0F, -0.3054F, 0.0F);
        this.tail_end5.cubeList.add(new ModelBox(tail_end5, 0, 14, -0.5F, 0.5F, 0.0F, 1, 0, 10, 0.0F, false));

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
