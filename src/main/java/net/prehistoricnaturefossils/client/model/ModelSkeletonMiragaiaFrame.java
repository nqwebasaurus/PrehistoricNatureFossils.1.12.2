package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMiragaiaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer main;
    private final ModelRenderer body;
    private final ModelRenderer leftPlate10;
    private final ModelRenderer rightPlate10;
    private final ModelRenderer leftPlate33;
    private final ModelRenderer rightPlate33;
    private final ModelRenderer hipbone;
    private final ModelRenderer hipbone2;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer backleftleg3;
    private final ModelRenderer backleftleg4;
    private final ModelRenderer backrightleg;
    private final ModelRenderer backrightleg2;
    private final ModelRenderer backrightleg3;
    private final ModelRenderer backrightleg4;
    private final ModelRenderer body2;
    private final ModelRenderer leftPlate31;
    private final ModelRenderer rightPlate31;
    private final ModelRenderer leftPlate9;
    private final ModelRenderer rightPlate9;
    private final ModelRenderer leftPlate32;
    private final ModelRenderer rightPlate32;
    private final ModelRenderer leftPlate8;
    private final ModelRenderer rightPlate8;
    private final ModelRenderer leftPlate30;
    private final ModelRenderer rightPlate30;
    private final ModelRenderer upperbody;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer leftPlate29;
    private final ModelRenderer rightPlate29;
    private final ModelRenderer leftPlate7;
    private final ModelRenderer rightPlate7;
    private final ModelRenderer leftPlate6;
    private final ModelRenderer rightPlate6;
    private final ModelRenderer leftPlate28;
    private final ModelRenderer rightPlate28;
    private final ModelRenderer neck4;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer leftPlate3;
    private final ModelRenderer rightPlate3;
    private final ModelRenderer leftPlate25;
    private final ModelRenderer rightPlate25;
    private final ModelRenderer leftPlate4;
    private final ModelRenderer rightPlate4;
    private final ModelRenderer leftPlate26;
    private final ModelRenderer rightPlate26;
    private final ModelRenderer leftPlate27;
    private final ModelRenderer rightPlate27;
    private final ModelRenderer leftPlate5;
    private final ModelRenderer rightPlate5;
    private final ModelRenderer neck3;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer leftPlate18;
    private final ModelRenderer rightPlate18;
    private final ModelRenderer leftPlate2;
    private final ModelRenderer rightPlate2;
    private final ModelRenderer leftPlate24;
    private final ModelRenderer rightPlate24;
    private final ModelRenderer neck2;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer leftPlate23;
    private final ModelRenderer rightPlate23;
    private final ModelRenderer leftPlate22;
    private final ModelRenderer rightPlate22;
    private final ModelRenderer leftPlate21;
    private final ModelRenderer rightPlate21;
    private final ModelRenderer leftPlate19;
    private final ModelRenderer rightPlate19;
    private final ModelRenderer neck;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head;
    private final ModelRenderer Eye;
    private final ModelRenderer jaw;
    private final ModelRenderer leftPlate20;
    private final ModelRenderer rightPlate20;
    private final ModelRenderer leftPlate17;
    private final ModelRenderer rightPlate17;
    private final ModelRenderer leftPlate1;
    private final ModelRenderer rightPlate1;
    private final ModelRenderer frontleftleg;
    private final ModelRenderer frontleftleg2;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer frontrightleg;
    private final ModelRenderer frontrightleg2;
    private final ModelRenderer frontrightleg3;
    private final ModelRenderer tail;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer leftPlate34;
    private final ModelRenderer rightPlate34;
    private final ModelRenderer leftPlate11;
    private final ModelRenderer rightPlate11;
    private final ModelRenderer tail2;
    private final ModelRenderer leftPlate35;
    private final ModelRenderer rightPlate35;
    private final ModelRenderer leftPlate36;
    private final ModelRenderer rightPlate36;
    private final ModelRenderer tail3;
    private final ModelRenderer frame12_r1;
    private final ModelRenderer leftPlate13;
    private final ModelRenderer rightPlate13;
    private final ModelRenderer leftPlate37;
    private final ModelRenderer rightPlate37;
    private final ModelRenderer leftPlate12;
    private final ModelRenderer rightPlate12;
    private final ModelRenderer tail4;
    private final ModelRenderer frame13_r1;
    private final ModelRenderer leftPlate15;
    private final ModelRenderer rightPlate15;
    private final ModelRenderer leftPlate14;
    private final ModelRenderer rightPlate14;
    private final ModelRenderer tail5;
    private final ModelRenderer frame14_r1;
    private final ModelRenderer leftPlate16;
    private final ModelRenderer rightPlate16;
    private final ModelRenderer lefttailSpike;
    private final ModelRenderer righttailSpike;
    private final ModelRenderer tail6;
    private final ModelRenderer frame15_r1;
    private final ModelRenderer lefttailSpike2;
    private final ModelRenderer righttailSpike2;

    public ModelSkeletonMiragaiaFrame() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.45F, -28.9F, 9.25F, 1, 29, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 1.5F, -27.9F, -16.25F, 1, 28, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(2.5F, -20.0F, -16.15F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, -0.2443F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -6, 1, -8.0F, -1.0F, 0.0F, 15, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.1F, -26.5F, 9.75F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, 0.0F, -0.0175F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -5, 1, -7.0F, -0.5F, -0.498F, 14, 1, 1, -0.1F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -10.2F, -2.0F);
        this.fossil.addChild(main);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -20.0F, 13.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, -0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 16, 29, -0.5F, 0.7243F, -6.6084F, 1, 1, 11, -0.1F, false));

        this.leftPlate10 = new ModelRenderer(this);
        this.leftPlate10.setRotationPoint(2.8F, -3.2452F, -0.4826F);
        this.body.addChild(leftPlate10);
        this.setRotateAngle(leftPlate10, -0.2965F, 0.2424F, 0.2076F);


        this.rightPlate10 = new ModelRenderer(this);
        this.rightPlate10.setRotationPoint(-2.8F, -3.2452F, -0.4826F);
        this.body.addChild(rightPlate10);
        this.setRotateAngle(rightPlate10, -0.2965F, -0.2424F, -0.2076F);


        this.leftPlate33 = new ModelRenderer(this);
        this.leftPlate33.setRotationPoint(3.0F, -2.3452F, 4.0174F);
        this.body.addChild(leftPlate33);
        this.setRotateAngle(leftPlate33, -0.3896F, 0.2325F, 0.1827F);


        this.rightPlate33 = new ModelRenderer(this);
        this.rightPlate33.setRotationPoint(-3.0F, -2.3452F, 4.0174F);
        this.body.addChild(rightPlate33);
        this.setRotateAngle(rightPlate33, -0.3896F, -0.2325F, -0.1827F);


        this.hipbone = new ModelRenderer(this);
        this.hipbone.setRotationPoint(0.2F, -0.2283F, -0.5893F);
        this.body.addChild(hipbone);
        this.setRotateAngle(hipbone, 0.0436F, 0.0F, 0.0F);


        this.hipbone2 = new ModelRenderer(this);
        this.hipbone2.setRotationPoint(-0.2F, -0.2283F, -0.5893F);
        this.body.addChild(hipbone2);
        this.setRotateAngle(hipbone2, 0.0436F, 0.0F, 0.0F);


        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(6.75F, 3.0088F, -0.9225F);
        this.body.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.1309F, 0.0F, 0.0F);


        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(-0.25F, 14.6125F, -1.142F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.48F, 0.0F, 0.0F);


        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(-0.1F, 11.6725F, 1.8219F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.6109F, 0.0F, 0.0F);


        this.backleftleg4 = new ModelRenderer(this);
        this.backleftleg4.setRotationPoint(0.2F, 2.3079F, -0.4457F);
        this.backleftleg3.addChild(backleftleg4);
        this.setRotateAngle(backleftleg4, 0.1309F, 0.0F, 0.0F);


        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-6.75F, 3.0088F, -0.9225F);
        this.body.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.2182F, 0.0F, 0.0F);


        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(0.25F, 14.6125F, -1.142F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.5236F, 0.0F, 0.0F);


        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.1F, 11.6725F, 1.8219F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.5672F, 0.0F, 0.0F);


        this.backrightleg4 = new ModelRenderer(this);
        this.backrightleg4.setRotationPoint(-0.2F, 2.3079F, -0.4457F);
        this.backrightleg3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, 0.3927F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5257F, -5.8584F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.131F, -0.0433F, -0.0057F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -0.5F, 1.2342F, -15.2279F, 1, 1, 15, -0.1F, false));

        this.leftPlate31 = new ModelRenderer(this);
        this.leftPlate31.setRotationPoint(3.1F, -4.7853F, -4.702F);
        this.body2.addChild(leftPlate31);
        this.setRotateAngle(leftPlate31, -0.2342F, 0.3258F, 0.1807F);


        this.rightPlate31 = new ModelRenderer(this);
        this.rightPlate31.setRotationPoint(-3.1F, -4.7853F, -4.702F);
        this.body2.addChild(rightPlate31);
        this.setRotateAngle(rightPlate31, -0.2342F, -0.3258F, -0.1807F);


        this.leftPlate9 = new ModelRenderer(this);
        this.leftPlate9.setRotationPoint(3.1F, -4.7853F, -1.102F);
        this.body2.addChild(leftPlate9);
        this.setRotateAngle(leftPlate9, -0.3389F, 0.3258F, 0.1807F);


        this.rightPlate9 = new ModelRenderer(this);
        this.rightPlate9.setRotationPoint(-3.1F, -4.7853F, -1.102F);
        this.body2.addChild(rightPlate9);
        this.setRotateAngle(rightPlate9, -0.3389F, -0.3258F, -0.1807F);


        this.leftPlate32 = new ModelRenderer(this);
        this.leftPlate32.setRotationPoint(3.1F, -4.6853F, 1.998F);
        this.body2.addChild(leftPlate32);
        this.setRotateAngle(leftPlate32, -0.4125F, 0.2851F, 0.1973F);


        this.rightPlate32 = new ModelRenderer(this);
        this.rightPlate32.setRotationPoint(-3.1F, -4.6853F, 1.998F);
        this.body2.addChild(rightPlate32);
        this.setRotateAngle(rightPlate32, -0.4125F, -0.2851F, -0.1973F);


        this.leftPlate8 = new ModelRenderer(this);
        this.leftPlate8.setRotationPoint(3.8F, -3.9853F, -8.302F);
        this.body2.addChild(leftPlate8);
        this.setRotateAngle(leftPlate8, -0.1906F, 0.3258F, 0.1807F);


        this.rightPlate8 = new ModelRenderer(this);
        this.rightPlate8.setRotationPoint(-3.8F, -3.9853F, -8.302F);
        this.body2.addChild(rightPlate8);
        this.setRotateAngle(rightPlate8, -0.1906F, -0.3258F, -0.1807F);


        this.leftPlate30 = new ModelRenderer(this);
        this.leftPlate30.setRotationPoint(3.7F, -5.1853F, -11.602F);
        this.body2.addChild(leftPlate30);
        this.setRotateAngle(leftPlate30, -0.1033F, 0.3258F, 0.1807F);


        this.rightPlate30 = new ModelRenderer(this);
        this.rightPlate30.setRotationPoint(-3.7F, -5.1853F, -11.602F);
        this.body2.addChild(rightPlate30);
        this.setRotateAngle(rightPlate30, -0.1033F, -0.3258F, -0.1807F);


        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -0.1697F, -14.7231F);
        this.body2.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.0886F, -0.1739F, 0.0154F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, 4.098F, -6.4736F);
        this.upperbody.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, 0.3491F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 21, 59, -0.5F, -0.345F, 0.0068F, 1, 1, 7, -0.1F, false));

        this.leftPlate29 = new ModelRenderer(this);
        this.leftPlate29.setRotationPoint(3.5F, -3.5283F, -0.3852F);
        this.upperbody.addChild(leftPlate29);
        this.setRotateAngle(leftPlate29, 0.0538F, 0.3258F, 0.1807F);


        this.rightPlate29 = new ModelRenderer(this);
        this.rightPlate29.setRotationPoint(-3.5F, -3.5283F, -0.3852F);
        this.upperbody.addChild(rightPlate29);
        this.setRotateAngle(rightPlate29, 0.0538F, -0.3258F, -0.1807F);


        this.leftPlate7 = new ModelRenderer(this);
        this.leftPlate7.setRotationPoint(2.9F, -1.6283F, -2.6852F);
        this.upperbody.addChild(leftPlate7);
        this.setRotateAngle(leftPlate7, 0.1497F, 0.3258F, 0.1807F);


        this.rightPlate7 = new ModelRenderer(this);
        this.rightPlate7.setRotationPoint(-2.9F, -1.6283F, -2.6852F);
        this.upperbody.addChild(rightPlate7);
        this.setRotateAngle(rightPlate7, 0.1497F, -0.3258F, -0.1807F);


        this.leftPlate6 = new ModelRenderer(this);
        this.leftPlate6.setRotationPoint(2.2F, -2.3283F, -5.5852F);
        this.upperbody.addChild(leftPlate6);
        this.setRotateAngle(leftPlate6, 0.1934F, 0.3258F, 0.1807F);


        this.rightPlate6 = new ModelRenderer(this);
        this.rightPlate6.setRotationPoint(-2.2F, -2.3283F, -5.5852F);
        this.upperbody.addChild(rightPlate6);
        this.setRotateAngle(rightPlate6, 0.1934F, -0.3258F, -0.1807F);


        this.leftPlate28 = new ModelRenderer(this);
        this.leftPlate28.setRotationPoint(2.0F, -0.2283F, -7.1852F);
        this.upperbody.addChild(leftPlate28);
        this.setRotateAngle(leftPlate28, 0.3587F, 0.3628F, 0.2583F);


        this.rightPlate28 = new ModelRenderer(this);
        this.rightPlate28.setRotationPoint(-2.0F, -0.2283F, -7.1852F);
        this.upperbody.addChild(rightPlate28);
        this.setRotateAngle(rightPlate28, 0.3587F, -0.3628F, -0.2583F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 2.3001F, -6.5016F);
        this.upperbody.addChild(neck4);
        this.setRotateAngle(neck4, -0.0426F, -0.218F, -0.0097F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(2.2644F, 1.0053F, -1.7555F);
        this.neck4.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.4363F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 83, 50, -2.7644F, 1.2496F, -2.98F, 1, 1, 5, -0.1F, false));

        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(-0.5F, 4.9217F, -10.1571F);
        this.neck4.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.1745F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 61, 3, 0.0F, -0.4694F, -0.2208F, 1, 1, 7, -0.1F, false));

        this.leftPlate3 = new ModelRenderer(this);
        this.leftPlate3.setRotationPoint(1.05F, 0.976F, -8.8699F);
        this.neck4.addChild(leftPlate3);
        this.setRotateAngle(leftPlate3, 0.277F, 0.3798F, 0.2493F);


        this.rightPlate3 = new ModelRenderer(this);
        this.rightPlate3.setRotationPoint(-1.05F, 0.976F, -8.8699F);
        this.neck4.addChild(rightPlate3);
        this.setRotateAngle(rightPlate3, 0.277F, -0.3798F, -0.2493F);


        this.leftPlate25 = new ModelRenderer(this);
        this.leftPlate25.setRotationPoint(1.05F, 0.676F, -7.5699F);
        this.neck4.addChild(leftPlate25);
        this.setRotateAngle(leftPlate25, 0.2307F, 0.3809F, 0.2412F);


        this.rightPlate25 = new ModelRenderer(this);
        this.rightPlate25.setRotationPoint(-1.05F, 0.676F, -7.5699F);
        this.neck4.addChild(rightPlate25);
        this.setRotateAngle(rightPlate25, 0.2307F, -0.3809F, -0.2412F);


        this.leftPlate4 = new ModelRenderer(this);
        this.leftPlate4.setRotationPoint(1.1F, 0.276F, -6.4699F);
        this.neck4.addChild(leftPlate4);
        this.setRotateAngle(leftPlate4, 0.1974F, 0.4443F, 0.2922F);


        this.rightPlate4 = new ModelRenderer(this);
        this.rightPlate4.setRotationPoint(-1.1F, 0.276F, -6.4699F);
        this.neck4.addChild(rightPlate4);
        this.setRotateAngle(rightPlate4, 0.1974F, -0.4443F, -0.2922F);


        this.leftPlate26 = new ModelRenderer(this);
        this.leftPlate26.setRotationPoint(1.4F, 0.176F, -5.0699F);
        this.neck4.addChild(leftPlate26);
        this.setRotateAngle(leftPlate26, 0.372F, 0.4443F, 0.2922F);


        this.rightPlate26 = new ModelRenderer(this);
        this.rightPlate26.setRotationPoint(-1.4F, 0.176F, -5.0699F);
        this.neck4.addChild(rightPlate26);
        this.setRotateAngle(rightPlate26, 0.372F, -0.4443F, -0.2922F);


        this.leftPlate27 = new ModelRenderer(this);
        this.leftPlate27.setRotationPoint(1.4F, -0.524F, -3.6699F);
        this.neck4.addChild(leftPlate27);
        this.setRotateAngle(leftPlate27, 0.372F, 0.4443F, 0.2922F);


        this.rightPlate27 = new ModelRenderer(this);
        this.rightPlate27.setRotationPoint(-1.4F, -0.524F, -3.6699F);
        this.neck4.addChild(rightPlate27);
        this.setRotateAngle(rightPlate27, 0.372F, -0.4443F, -0.2922F);


        this.leftPlate5 = new ModelRenderer(this);
        this.leftPlate5.setRotationPoint(1.7F, -1.724F, -2.1699F);
        this.neck4.addChild(leftPlate5);
        this.setRotateAngle(leftPlate5, 0.372F, 0.4443F, 0.2922F);


        this.rightPlate5 = new ModelRenderer(this);
        this.rightPlate5.setRotationPoint(-1.7F, -1.724F, -2.1699F);
        this.neck4.addChild(rightPlate5);
        this.setRotateAngle(rightPlate5, 0.372F, -0.4443F, -0.2922F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 2.8045F, -10.3863F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.22F, -0.523F, 0.0506F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-0.25F, 1.7608F, -5.0872F);
        this.neck3.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.0349F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 79, 19, 0.0F, -0.15F, -0.05F, 1, 1, 6, -0.1F, false));

        this.leftPlate18 = new ModelRenderer(this);
        this.leftPlate18.setRotationPoint(0.85F, -1.2906F, -4.6447F);
        this.neck3.addChild(leftPlate18);
        this.setRotateAngle(leftPlate18, 0.1142F, 0.2941F, 0.2322F);


        this.rightPlate18 = new ModelRenderer(this);
        this.rightPlate18.setRotationPoint(-0.85F, -1.2906F, -4.6447F);
        this.neck3.addChild(rightPlate18);
        this.setRotateAngle(rightPlate18, 0.1142F, -0.2941F, -0.2322F);


        this.leftPlate2 = new ModelRenderer(this);
        this.leftPlate2.setRotationPoint(0.85F, -1.3906F, -2.9447F);
        this.neck3.addChild(leftPlate2);
        this.setRotateAngle(leftPlate2, 0.1142F, 0.2941F, 0.2322F);


        this.rightPlate2 = new ModelRenderer(this);
        this.rightPlate2.setRotationPoint(-0.85F, -1.3906F, -2.9447F);
        this.neck3.addChild(rightPlate2);
        this.setRotateAngle(rightPlate2, 0.1142F, -0.2941F, -0.2322F);


        this.leftPlate24 = new ModelRenderer(this);
        this.leftPlate24.setRotationPoint(0.85F, -1.3906F, -1.0447F);
        this.neck3.addChild(leftPlate24);
        this.setRotateAngle(leftPlate24, 0.0532F, 0.2941F, 0.2322F);


        this.rightPlate24 = new ModelRenderer(this);
        this.rightPlate24.setRotationPoint(-0.85F, -1.3906F, -1.0447F);
        this.neck3.addChild(rightPlate24);
        this.setRotateAngle(rightPlate24, 0.0532F, -0.2941F, -0.2322F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(-0.5F, 0.2608F, -4.5372F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.2842F, -0.4086F, -0.0608F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.5F, 1.8295F, 0.0821F);
        this.neck2.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.1309F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 79, 13, -0.5F, -0.3306F, -5.0439F, 1, 1, 5, -0.1F, false));

        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.5F, 2.5489F, -4.6371F);
        this.neck2.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.0698F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 88, 16, -0.5F, -0.4049F, -4.9064F, 1, 1, 5, -0.1F, false));

        this.leftPlate23 = new ModelRenderer(this);
        this.leftPlate23.setRotationPoint(1.35F, -1.4698F, -2.6166F);
        this.neck2.addChild(leftPlate23);
        this.setRotateAngle(leftPlate23, 0.0793F, 0.2941F, 0.2322F);


        this.rightPlate23 = new ModelRenderer(this);
        this.rightPlate23.setRotationPoint(-0.35F, -1.4698F, -2.6166F);
        this.neck2.addChild(rightPlate23);
        this.setRotateAngle(rightPlate23, 0.0793F, -0.2941F, -0.2322F);


        this.leftPlate22 = new ModelRenderer(this);
        this.leftPlate22.setRotationPoint(1.35F, -1.0698F, -4.6166F);
        this.neck2.addChild(leftPlate22);
        this.setRotateAngle(leftPlate22, 0.0793F, 0.2941F, 0.2322F);


        this.rightPlate22 = new ModelRenderer(this);
        this.rightPlate22.setRotationPoint(-0.35F, -1.0698F, -4.6166F);
        this.neck2.addChild(rightPlate22);
        this.setRotateAngle(rightPlate22, 0.0793F, -0.2941F, -0.2322F);


        this.leftPlate21 = new ModelRenderer(this);
        this.leftPlate21.setRotationPoint(1.25F, -0.5698F, -6.6166F);
        this.neck2.addChild(leftPlate21);
        this.setRotateAngle(leftPlate21, 0.067F, 0.3408F, 0.1897F);


        this.rightPlate21 = new ModelRenderer(this);
        this.rightPlate21.setRotationPoint(-0.25F, -0.5698F, -6.6166F);
        this.neck2.addChild(rightPlate21);
        this.setRotateAngle(rightPlate21, 0.067F, -0.3408F, -0.1897F);


        this.leftPlate19 = new ModelRenderer(this);
        this.leftPlate19.setRotationPoint(1.15F, -0.1698F, -8.6166F);
        this.neck2.addChild(leftPlate19);
        this.setRotateAngle(leftPlate19, 0.0646F, 0.2102F, 0.1808F);


        this.rightPlate19 = new ModelRenderer(this);
        this.rightPlate19.setRotationPoint(-0.15F, -0.1698F, -8.6166F);
        this.neck2.addChild(rightPlate19);
        this.setRotateAngle(rightPlate19, 0.0646F, -0.2102F, -0.1808F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.7316F, -9.8092F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.1509F, -0.3022F, -0.0452F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.5F, 1.5412F, 0.2272F);
        this.neck.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.0436F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 88, 7, -0.5F, -0.3549F, -4.9086F, 1, 1, 5, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(1.0F, 0.2003F, -4.8704F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.6478F, -0.3465F, -0.4353F);


        this.Eye = new ModelRenderer(this);
        this.Eye.setRotationPoint(0.585F, -0.4022F, -1.9131F);
        this.head.addChild(Eye);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 1.2463F, -0.6382F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5454F, 0.0F, 0.0F);


        this.leftPlate20 = new ModelRenderer(this);
        this.leftPlate20.setRotationPoint(1.3F, -0.4997F, -0.0204F);
        this.neck.addChild(leftPlate20);
        this.setRotateAngle(leftPlate20, 0.0F, 0.3491F, 0.0F);


        this.rightPlate20 = new ModelRenderer(this);
        this.rightPlate20.setRotationPoint(-0.3F, -0.4997F, -0.0204F);
        this.neck.addChild(rightPlate20);
        this.setRotateAngle(rightPlate20, 0.0F, -0.3491F, 0.0F);


        this.leftPlate17 = new ModelRenderer(this);
        this.leftPlate17.setRotationPoint(1.1F, -0.4497F, -2.0204F);
        this.neck.addChild(leftPlate17);
        this.setRotateAngle(leftPlate17, 0.0F, 0.2182F, 0.0F);


        this.rightPlate17 = new ModelRenderer(this);
        this.rightPlate17.setRotationPoint(-0.1F, -0.4497F, -2.0204F);
        this.neck.addChild(rightPlate17);
        this.setRotateAngle(rightPlate17, 0.0F, -0.2182F, 0.0F);


        this.leftPlate1 = new ModelRenderer(this);
        this.leftPlate1.setRotationPoint(0.9F, -0.8997F, -3.9704F);
        this.neck.addChild(leftPlate1);
        this.setRotateAngle(leftPlate1, 0.0886F, 0.2178F, 0.0078F);


        this.rightPlate1 = new ModelRenderer(this);
        this.rightPlate1.setRotationPoint(0.1F, -0.8997F, -3.9704F);
        this.neck.addChild(rightPlate1);
        this.setRotateAngle(rightPlate1, 0.0886F, -0.2178F, -0.0078F);


        this.frontleftleg = new ModelRenderer(this);
        this.frontleftleg.setRotationPoint(6.25F, 11.0265F, -5.8507F);
        this.upperbody.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.5672F, 0.0F, -0.2618F);


        this.frontleftleg2 = new ModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.5748F, 11.489F, 0.6189F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.7286F, 0.1096F, 0.2382F);


        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(0.521F, 10.1941F, 0.4424F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.2601F, 0.0918F, -0.008F);


        this.frontrightleg = new ModelRenderer(this);
        this.frontrightleg.setRotationPoint(-6.25F, 11.0265F, -5.8507F);
        this.upperbody.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.3054F, 0.0F, 0.2618F);


        this.frontrightleg2 = new ModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-0.5748F, 11.489F, 0.6189F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.685F, -0.1096F, -0.2382F);


        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(-0.521F, 10.1941F, 0.4424F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.4829F, -0.0654F, -0.0379F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.6757F, 4.0416F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.0F, 0.3927F, 0.0F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.0F, 2.9908F, -0.1637F);
        this.tail.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, -0.0873F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 13, 43, -0.5F, -1.5874F, -0.0385F, 1, 1, 8, -0.1F, false));

        this.leftPlate34 = new ModelRenderer(this);
        this.leftPlate34.setRotationPoint(3.0F, 0.2305F, 3.7259F);
        this.tail.addChild(leftPlate34);
        this.setRotateAngle(leftPlate34, -0.398F, 0.2298F, 0.184F);


        this.rightPlate34 = new ModelRenderer(this);
        this.rightPlate34.setRotationPoint(-3.0F, 0.2305F, 3.7259F);
        this.tail.addChild(rightPlate34);
        this.setRotateAngle(rightPlate34, -0.398F, -0.2298F, -0.184F);


        this.leftPlate11 = new ModelRenderer(this);
        this.leftPlate11.setRotationPoint(2.2F, 0.7305F, 6.4759F);
        this.tail.addChild(leftPlate11);
        this.setRotateAngle(leftPlate11, -0.4907F, 0.2411F, 0.1981F);


        this.rightPlate11 = new ModelRenderer(this);
        this.rightPlate11.setRotationPoint(-2.2F, 0.7305F, 6.4759F);
        this.tail.addChild(rightPlate11);
        this.setRotateAngle(rightPlate11, -0.4907F, -0.2411F, -0.1981F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.7F, 7.85F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0886F, 0.1739F, -0.0154F);
        this.tail2.cubeList.add(new ModelBox(tail2, 59, 13, -0.5F, 1.4101F, -0.1653F, 1, 1, 7, -0.1F, false));

        this.leftPlate35 = new ModelRenderer(this);
        this.leftPlate35.setRotationPoint(1.6F, 0.2358F, 1.4038F);
        this.tail2.addChild(leftPlate35);
        this.setRotateAngle(leftPlate35, -0.5147F, 0.2424F, 0.2076F);


        this.rightPlate35 = new ModelRenderer(this);
        this.rightPlate35.setRotationPoint(-1.6F, 0.2358F, 1.4038F);
        this.tail2.addChild(rightPlate35);
        this.setRotateAngle(rightPlate35, -0.5147F, -0.2424F, -0.2076F);


        this.leftPlate36 = new ModelRenderer(this);
        this.leftPlate36.setRotationPoint(1.7F, -0.5642F, 5.4038F);
        this.tail2.addChild(leftPlate36);
        this.setRotateAngle(leftPlate36, -0.5576F, 0.2393F, 0.2099F);


        this.rightPlate36 = new ModelRenderer(this);
        this.rightPlate36.setRotationPoint(-1.7F, -0.5642F, 5.4038F);
        this.tail2.addChild(rightPlate36);
        this.setRotateAngle(rightPlate36, -0.5576F, -0.2393F, -0.2099F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1553F, 6.878F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1007F, 0.5214F, -0.0503F);


        this.frame12_r1 = new ModelRenderer(this);
        this.frame12_r1.setRotationPoint(0.0F, 2.3505F, -0.2127F);
        this.tail3.addChild(frame12_r1);
        this.setRotateAngle(frame12_r1, 0.0436F, 0.0F, 0.0F);
        this.frame12_r1.cubeList.add(new ModelBox(frame12_r1, 0, 18, -0.5F, -1.0274F, 0.0728F, 1, 1, 12, -0.1F, false));

        this.leftPlate13 = new ModelRenderer(this);
        this.leftPlate13.setRotationPoint(0.8F, -1.8028F, 10.6349F);
        this.tail3.addChild(leftPlate13);
        this.setRotateAngle(leftPlate13, -0.486F, 0.3691F, 0.4147F);


        this.rightPlate13 = new ModelRenderer(this);
        this.rightPlate13.setRotationPoint(-0.8F, -1.8028F, 10.6349F);
        this.tail3.addChild(rightPlate13);
        this.setRotateAngle(rightPlate13, -0.486F, -0.3691F, -0.4147F);


        this.leftPlate37 = new ModelRenderer(this);
        this.leftPlate37.setRotationPoint(0.9F, -2.1028F, 7.2349F);
        this.tail3.addChild(leftPlate37);
        this.setRotateAngle(leftPlate37, -0.4849F, 0.3225F, 0.315F);


        this.rightPlate37 = new ModelRenderer(this);
        this.rightPlate37.setRotationPoint(-0.9F, -2.1028F, 7.2349F);
        this.tail3.addChild(rightPlate37);
        this.setRotateAngle(rightPlate37, -0.4849F, -0.3225F, -0.315F);


        this.leftPlate12 = new ModelRenderer(this);
        this.leftPlate12.setRotationPoint(2.1F, -2.0028F, 2.8349F);
        this.tail3.addChild(leftPlate12);
        this.setRotateAngle(leftPlate12, -0.5085F, 0.2678F, 0.2331F);


        this.rightPlate12 = new ModelRenderer(this);
        this.rightPlate12.setRotationPoint(-2.1F, -2.0028F, 2.8349F);
        this.tail3.addChild(rightPlate12);
        this.setRotateAngle(rightPlate12, -0.5085F, -0.2678F, -0.2331F);


        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.7139F, 11.7005F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2323F, 0.4425F, -0.2591F);


        this.frame13_r1 = new ModelRenderer(this);
        this.frame13_r1.setRotationPoint(-0.5F, 2.3339F, 0.2125F);
        this.tail4.addChild(frame13_r1);
        this.setRotateAngle(frame13_r1, 0.0524F, 0.0436F, 0.0F);
        this.frame13_r1.cubeList.add(new ModelBox(frame13_r1, 0, 34, -0.5F, -0.7643F, -0.4374F, 1, 1, 9, -0.1F, false));

        this.leftPlate15 = new ModelRenderer(this);
        this.leftPlate15.setRotationPoint(0.7F, -0.3151F, 6.2327F);
        this.tail4.addChild(leftPlate15);
        this.setRotateAngle(leftPlate15, -0.3095F, 0.4477F, 0.616F);


        this.rightPlate15 = new ModelRenderer(this);
        this.rightPlate15.setRotationPoint(-0.7F, -0.3151F, 6.2327F);
        this.tail4.addChild(rightPlate15);
        this.setRotateAngle(rightPlate15, -0.3095F, -0.4477F, -0.616F);


        this.leftPlate14 = new ModelRenderer(this);
        this.leftPlate14.setRotationPoint(0.4F, 0.1849F, 2.2327F);
        this.tail4.addChild(leftPlate14);
        this.setRotateAngle(leftPlate14, -0.4032F, 0.2287F, 0.5354F);


        this.rightPlate14 = new ModelRenderer(this);
        this.rightPlate14.setRotationPoint(-0.4F, 0.1849F, 2.2327F);
        this.tail4.addChild(rightPlate14);
        this.setRotateAngle(rightPlate14, -0.3062F, -0.2456F, -0.5768F);


        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0239F, 8.8983F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0944F, 0.3911F, -0.0361F);


        this.frame14_r1 = new ModelRenderer(this);
        this.frame14_r1.setRotationPoint(0.0F, 1.4233F, -0.1924F);
        this.tail5.addChild(frame14_r1);
        this.setRotateAngle(frame14_r1, 0.0262F, 0.0F, 0.0F);
        this.frame14_r1.cubeList.add(new ModelBox(frame14_r1, 49, 0, -0.5F, -0.3679F, -0.2287F, 1, 1, 8, -0.1F, false));

        this.leftPlate16 = new ModelRenderer(this);
        this.leftPlate16.setRotationPoint(0.0F, 0.336F, 1.0071F);
        this.tail5.addChild(leftPlate16);
        this.setRotateAngle(leftPlate16, -0.1998F, 0.4857F, 0.705F);


        this.rightPlate16 = new ModelRenderer(this);
        this.rightPlate16.setRotationPoint(0.0F, 0.336F, 1.0071F);
        this.tail5.addChild(rightPlate16);
        this.setRotateAngle(rightPlate16, -0.1998F, -0.4857F, -0.705F);


        this.lefttailSpike = new ModelRenderer(this);
        this.lefttailSpike.setRotationPoint(1.65F, -0.8212F, 5.5299F);
        this.tail5.addChild(lefttailSpike);
        this.setRotateAngle(lefttailSpike, -0.0432F, -0.0152F, 1.0025F);


        this.righttailSpike = new ModelRenderer(this);
        this.righttailSpike.setRotationPoint(-1.65F, -0.8212F, 5.5299F);
        this.tail5.addChild(righttailSpike);
        this.setRotateAngle(righttailSpike, -0.0432F, 0.0152F, -1.0025F);


        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.025F, 6.9727F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2823F, 0.3786F, -0.1068F);


        this.frame15_r1 = new ModelRenderer(this);
        this.frame15_r1.setRotationPoint(0.0F, 1.3048F, -0.1376F);
        this.tail6.addChild(frame15_r1);
        this.setRotateAngle(frame15_r1, 0.0349F, 0.0F, 0.0F);
        this.frame15_r1.cubeList.add(new ModelBox(frame15_r1, 48, 20, -0.5F, -0.5F, 0.0F, 1, 1, 8, -0.1F, false));

        this.lefttailSpike2 = new ModelRenderer(this);
        this.lefttailSpike2.setRotationPoint(0.85F, -0.6602F, 3.5435F);
        this.tail6.addChild(lefttailSpike2);
        this.setRotateAngle(lefttailSpike2, -0.2863F, 0.0036F, 1.0995F);


        this.righttailSpike2 = new ModelRenderer(this);
        this.righttailSpike2.setRotationPoint(-0.85F, -0.6602F, 3.5435F);
        this.tail6.addChild(righttailSpike2);
        this.setRotateAngle(righttailSpike2, -0.2863F, -0.0036F, -1.0995F);

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
