package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonYingshanosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer backleftleg3;
    private final ModelRenderer backleftleg4;
    private final ModelRenderer backrightleg;
    private final ModelRenderer backrightleg2;
    private final ModelRenderer backrightleg3;
    private final ModelRenderer backrightleg4;
    private final ModelRenderer leftPlate11;
    private final ModelRenderer rightPlate11;
    private final ModelRenderer leftPlate12;
    private final ModelRenderer rightPlate12;
    private final ModelRenderer leftPlate13;
    private final ModelRenderer rightPlate13;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftPlate9;
    private final ModelRenderer rightPlate9;
    private final ModelRenderer leftPlate10;
    private final ModelRenderer rightPlate10;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer frontleftleg2;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer frontleftleg4;
    private final ModelRenderer frontrightleg2;
    private final ModelRenderer frontrightleg3;
    private final ModelRenderer frontrightleg4;
    private final ModelRenderer parascapularSpine;
    private final ModelRenderer parascapularSpine2;
    private final ModelRenderer leftPlate2;
    private final ModelRenderer rightPlate2;
    private final ModelRenderer leftPlate3;
    private final ModelRenderer rightPlate3;
    private final ModelRenderer leftPlate8;
    private final ModelRenderer rightPlate8;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftPlate24;
    private final ModelRenderer rightPlate24;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftPlate4;
    private final ModelRenderer rightPlate4;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leftPlate5;
    private final ModelRenderer rightPlate5;
    private final ModelRenderer leftPlate6;
    private final ModelRenderer rightPlate6;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer leftPlate7;
    private final ModelRenderer rightPlate7;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer leftPlate14;
    private final ModelRenderer rightPlate14;
    private final ModelRenderer tail2;
    private final ModelRenderer leftPlate15;
    private final ModelRenderer rightPlate15;
    private final ModelRenderer leftPlate16;
    private final ModelRenderer rightPlate16;
    private final ModelRenderer tail3;
    private final ModelRenderer leftPlate17;
    private final ModelRenderer rightPlate17;
    private final ModelRenderer leftPlate18;
    private final ModelRenderer rightPlate18;
    private final ModelRenderer tail4;
    private final ModelRenderer leftPlate19;
    private final ModelRenderer rightPlate19;
    private final ModelRenderer leftPlate20;
    private final ModelRenderer rightPlate20;
    private final ModelRenderer tail5;
    private final ModelRenderer lefttailSpike;
    private final ModelRenderer righttailSpike3;
    private final ModelRenderer lefttailSpike2;
    private final ModelRenderer righttailSpike2;

    public ModelSkeletonYingshanosaurusFrame() {
        this.textureWidth = 108;
        this.textureHeight = 108;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -19.8F, 6.0F, 1, 20, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -14.5F, -12.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3403F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -3.2F, -1.5F, -0.5F, 1, 16, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -14.5F, -12.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3403F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 4.0F, -2.0F, -0.5F, 1, 10, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -19.0F, 6.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.5F, -5.0F, -0.5F, 1, 10, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -20.0F, 6.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0873F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.9F, -5.1F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, 0.5F, -0.1F, 1, 1, 9, -0.15F, false));

        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(3.0F, 0.9706F, 0.6276F);
        this.hips.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.3927F, 0.0F, 0.0F);


        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(-0.2F, 10.1238F, 0.2346F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.4451F, 0.0F, 0.0F);


        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(-0.0119F, 7.4271F, 0.1844F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.0426F, -0.0084F, -0.0044F);


        this.backleftleg4 = new ModelRenderer(this);
        this.backleftleg4.setRotationPoint(0.5237F, 1.3722F, -0.0022F);
        this.backleftleg3.addChild(backleftleg4);
        this.setRotateAngle(backleftleg4, -0.0873F, 0.0F, 0.0F);


        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-3.0F, 0.9706F, 0.6276F);
        this.hips.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.2182F, 0.0F, 0.0F);


        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(0.2F, 10.1238F, 0.2346F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.4887F, 0.0F, 0.0F);


        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.0119F, 7.4271F, 0.1844F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.2607F, 0.0084F, 0.0044F);


        this.backrightleg4 = new ModelRenderer(this);
        this.backrightleg4.setRotationPoint(-0.5237F, 1.3722F, -0.0022F);
        this.backrightleg3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, -0.0873F, 0.0F, 0.0F);


        this.leftPlate11 = new ModelRenderer(this);
        this.leftPlate11.setRotationPoint(1.3333F, -3.9803F, -4.8359F);
        this.hips.addChild(leftPlate11);
        this.setRotateAngle(leftPlate11, 0.0326F, -0.0355F, 0.1711F);


        this.rightPlate11 = new ModelRenderer(this);
        this.rightPlate11.setRotationPoint(-1.3333F, -3.9803F, -4.8359F);
        this.hips.addChild(rightPlate11);
        this.setRotateAngle(rightPlate11, 0.0326F, 0.0355F, -0.1711F);


        this.leftPlate12 = new ModelRenderer(this);
        this.leftPlate12.setRotationPoint(1.2144F, -4.1469F, -0.7415F);
        this.hips.addChild(leftPlate12);
        this.setRotateAngle(leftPlate12, 0.1373F, -0.0355F, 0.1711F);


        this.rightPlate12 = new ModelRenderer(this);
        this.rightPlate12.setRotationPoint(-1.2144F, -4.1469F, -0.7415F);
        this.hips.addChild(rightPlate12);
        this.setRotateAngle(rightPlate12, 0.1373F, 0.0355F, -0.1711F);


        this.leftPlate13 = new ModelRenderer(this);
        this.leftPlate13.setRotationPoint(1.0595F, -4.1362F, 3.5F);
        this.hips.addChild(leftPlate13);
        this.setRotateAngle(leftPlate13, 0.05F, -0.0355F, 0.1711F);


        this.rightPlate13 = new ModelRenderer(this);
        this.rightPlate13.setRotationPoint(-1.0595F, -4.1362F, 3.5F);
        this.hips.addChild(rightPlate13);
        this.setRotateAngle(rightPlate13, 0.05F, 0.0355F, -0.1711F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, -5.1F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.1745F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.1F, -6.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 22, -1.0F, 0.5426F, 0.0022F, 1, 1, 6, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 1.0F, -9.8F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2793F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 57, 0, -1.0F, 0.5327F, 0.0582F, 1, 1, 4, -0.15F, false));

        this.leftPlate9 = new ModelRenderer(this);
        this.leftPlate9.setRotationPoint(1.4544F, -2.5551F, -7.5281F);
        this.body.addChild(leftPlate9);
        this.setRotateAngle(leftPlate9, 0.4165F, -0.0355F, 0.1711F);


        this.rightPlate9 = new ModelRenderer(this);
        this.rightPlate9.setRotationPoint(-1.4544F, -2.5551F, -7.5281F);
        this.body.addChild(rightPlate9);
        this.setRotateAngle(rightPlate9, 0.4165F, 0.0355F, -0.1711F);


        this.leftPlate10 = new ModelRenderer(this);
        this.leftPlate10.setRotationPoint(1.4623F, -3.372F, -3.8324F);
        this.body.addChild(leftPlate10);
        this.setRotateAngle(leftPlate10, 0.242F, -0.0355F, 0.1711F);


        this.rightPlate10 = new ModelRenderer(this);
        this.rightPlate10.setRotationPoint(-1.4623F, -3.372F, -3.8324F);
        this.body.addChild(rightPlate10);
        this.setRotateAngle(rightPlate10, 0.242F, 0.0355F, -0.1711F);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.6F, -9.7F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.0873F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 2.9F, -7.4F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3316F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, -1, -1.0F, -0.4F, -0.6F, 1, 1, 9, -0.15F, false));

        this.frontleftleg2 = new ModelRenderer(this);
        this.frontleftleg2.setRotationPoint(4.85F, 6.7808F, -3.7984F);
        this.chest.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.0404F, -0.0552F, -0.1188F);


        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(-0.1143F, 5.6151F, 0.1147F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.9222F, 0.07F, 0.1047F);


        this.frontleftleg4 = new ModelRenderer(this);
        this.frontleftleg4.setRotationPoint(0.0618F, 5.4986F, -0.6715F);
        this.frontleftleg3.addChild(frontleftleg4);
        this.setRotateAngle(frontleftleg4, 0.807F, -0.0562F, -0.0206F);


        this.frontrightleg2 = new ModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-4.85F, 6.7808F, -3.7984F);
        this.chest.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 0.7887F, 0.0552F, 0.1188F);


        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.1143F, 5.6151F, 0.1147F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -1.1404F, -0.07F, -0.1047F);


        this.frontrightleg4 = new ModelRenderer(this);
        this.frontrightleg4.setRotationPoint(-0.0618F, 5.4986F, -0.6715F);
        this.frontrightleg3.addChild(frontrightleg4);
        this.setRotateAngle(frontrightleg4, 0.3271F, 0.0562F, 0.0206F);


        this.parascapularSpine = new ModelRenderer(this);
        this.parascapularSpine.setRotationPoint(5.1991F, 1.8906F, -1.1343F);
        this.chest.addChild(parascapularSpine);
        this.setRotateAngle(parascapularSpine, -0.7538F, 0.6778F, -1.4074F);


        this.parascapularSpine2 = new ModelRenderer(this);
        this.parascapularSpine2.setRotationPoint(-5.1991F, 1.8906F, -1.1343F);
        this.chest.addChild(parascapularSpine2);
        this.setRotateAngle(parascapularSpine2, -0.7538F, -0.6778F, 1.4074F);


        this.leftPlate2 = new ModelRenderer(this);
        this.leftPlate2.setRotationPoint(0.7554F, -0.2502F, -7.3927F);
        this.chest.addChild(leftPlate2);
        this.setRotateAngle(leftPlate2, 0.3128F, 0.0762F, 0.2206F);


        this.rightPlate2 = new ModelRenderer(this);
        this.rightPlate2.setRotationPoint(-0.7554F, -0.2502F, -7.3927F);
        this.chest.addChild(rightPlate2);
        this.setRotateAngle(rightPlate2, 0.3128F, -0.0762F, -0.2206F);


        this.leftPlate3 = new ModelRenderer(this);
        this.leftPlate3.setRotationPoint(1.2674F, -1.4948F, -4.4153F);
        this.chest.addChild(leftPlate3);
        this.setRotateAngle(leftPlate3, 0.5397F, 0.0762F, 0.2206F);


        this.rightPlate3 = new ModelRenderer(this);
        this.rightPlate3.setRotationPoint(-1.2674F, -1.4948F, -4.4153F);
        this.chest.addChild(rightPlate3);
        this.setRotateAngle(rightPlate3, 0.5397F, -0.0762F, -0.2206F);


        this.leftPlate8 = new ModelRenderer(this);
        this.leftPlate8.setRotationPoint(1.3096F, -2.9139F, -1.4757F);
        this.chest.addChild(leftPlate8);
        this.setRotateAngle(leftPlate8, 0.5396F, -0.0736F, 0.131F);


        this.rightPlate8 = new ModelRenderer(this);
        this.rightPlate8.setRotationPoint(-1.3096F, -2.9139F, -1.4757F);
        this.chest.addChild(rightPlate8);
        this.setRotateAngle(rightPlate8, 0.5396F, 0.0736F, -0.131F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 2.5F, -7.5F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, -0.0436F, 0.2182F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.8F, -3.9F);
        this.neck4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 57, 52, -1.0F, -0.4F, 0.0F, 1, 1, 4, -0.15F, false));

        this.leftPlate24 = new ModelRenderer(this);
        this.leftPlate24.setRotationPoint(0.4472F, -2.2999F, -2.5402F);
        this.neck4.addChild(leftPlate24);
        this.setRotateAngle(leftPlate24, 0.051F, 0.0762F, 0.2206F);


        this.rightPlate24 = new ModelRenderer(this);
        this.rightPlate24.setRotationPoint(-0.4472F, -2.2999F, -2.5402F);
        this.neck4.addChild(rightPlate24);
        this.setRotateAngle(rightPlate24, 0.051F, -0.0762F, -0.2206F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.3F, -3.8F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, 0.2182F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -0.4F, -3.0F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2793F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 70, 52, -1.0F, -0.4F, 2.5F, 1, 1, 1, -0.15F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 68, 50, -1.0F, -0.4F, -0.1F, 1, 1, 3, -0.15F, false));

        this.leftPlate4 = new ModelRenderer(this);
        this.leftPlate4.setRotationPoint(0.2768F, -2.7121F, -1.2398F);
        this.neck3.addChild(leftPlate4);
        this.setRotateAngle(leftPlate4, -0.2108F, 0.0762F, 0.2206F);


        this.rightPlate4 = new ModelRenderer(this);
        this.rightPlate4.setRotationPoint(-0.2768F, -2.7121F, -1.2398F);
        this.neck3.addChild(rightPlate4);
        this.setRotateAngle(rightPlate4, -0.2108F, -0.0762F, -0.2206F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.9F, -2.8F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.1308F, 0.1716F, 0.0453F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -2.2F, -3.3F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4712F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 54, 46, -1.0F, 0.6F, 0.1F, 1, 1, 4, -0.15F, false));

        this.leftPlate5 = new ModelRenderer(this);
        this.leftPlate5.setRotationPoint(0.2694F, -2.4364F, -0.3247F);
        this.neck2.addChild(leftPlate5);
        this.setRotateAngle(leftPlate5, -0.3329F, 0.0762F, 0.2206F);


        this.rightPlate5 = new ModelRenderer(this);
        this.rightPlate5.setRotationPoint(-0.2694F, -2.4364F, -0.3247F);
        this.neck2.addChild(rightPlate5);
        this.setRotateAngle(rightPlate5, -0.3329F, -0.0762F, -0.2206F);


        this.leftPlate6 = new ModelRenderer(this);
        this.leftPlate6.setRotationPoint(0.2254F, -2.8219F, -1.9919F);
        this.neck2.addChild(leftPlate6);
        this.setRotateAngle(leftPlate6, -0.3329F, 0.0762F, 0.2206F);


        this.rightPlate6 = new ModelRenderer(this);
        this.rightPlate6.setRotationPoint(-0.2254F, -2.8219F, -1.9919F);
        this.neck2.addChild(rightPlate6);
        this.setRotateAngle(rightPlate6, -0.3329F, -0.0762F, -0.2206F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.7F, -3.4F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.3054F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.0F, -1.8F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 81, 59, -0.5F, 0.6F, 0.2F, 1, 1, 2, -0.15F, false));

        this.leftPlate7 = new ModelRenderer(this);
        this.leftPlate7.setRotationPoint(0.1814F, -1.5075F, -0.259F);
        this.neck.addChild(leftPlate7);
        this.setRotateAngle(leftPlate7, -0.2457F, 0.0762F, 0.2206F);


        this.rightPlate7 = new ModelRenderer(this);
        this.rightPlate7.setRotationPoint(-0.1814F, -1.5075F, -0.259F);
        this.neck.addChild(rightPlate7);
        this.setRotateAngle(rightPlate7, -0.2457F, -0.0762F, -0.2206F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4F, -1.7F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0F, -0.1309F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, -0.4F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2182F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.4F, 3.7F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.1186F, -0.3039F, -0.028F);
        this.tail.cubeList.add(new ModelBox(tail, 32, 30, -0.5F, 0.1F, -0.4F, 1, 1, 6, -0.15F, false));
        this.tail.cubeList.add(new ModelBox(tail, 37, 35, -0.5F, 0.1F, 5.3F, 1, 1, 1, -0.15F, false));

        this.leftPlate14 = new ModelRenderer(this);
        this.leftPlate14.setRotationPoint(0.8772F, -4.2346F, 3.4096F);
        this.tail.addChild(leftPlate14);
        this.setRotateAngle(leftPlate14, -0.0373F, -0.0355F, 0.1711F);


        this.rightPlate14 = new ModelRenderer(this);
        this.rightPlate14.setRotationPoint(-0.8772F, -4.2346F, 3.4096F);
        this.tail.addChild(rightPlate14);
        this.setRotateAngle(rightPlate14, -0.0373F, 0.0355F, -0.1711F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0174F, 5.9015F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0893F, -0.3051F, -0.008F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 31, -0.5F, 0.1F, 0.0F, 1, 1, 6, -0.15F, false));

        this.leftPlate15 = new ModelRenderer(this);
        this.leftPlate15.setRotationPoint(0.6692F, -3.7191F, 0.8887F);
        this.tail2.addChild(leftPlate15);
        this.setRotateAngle(leftPlate15, 0.0326F, -0.0355F, 0.1711F);


        this.rightPlate15 = new ModelRenderer(this);
        this.rightPlate15.setRotationPoint(-0.6692F, -3.7191F, 0.8887F);
        this.tail2.addChild(rightPlate15);
        this.setRotateAngle(rightPlate15, 0.0326F, 0.0355F, -0.1711F);


        this.leftPlate16 = new ModelRenderer(this);
        this.leftPlate16.setRotationPoint(0.4519F, -3.277F, 4.7949F);
        this.tail2.addChild(leftPlate16);
        this.setRotateAngle(leftPlate16, -0.0547F, -0.0355F, 0.1711F);


        this.rightPlate16 = new ModelRenderer(this);
        this.rightPlate16.setRotationPoint(-0.4519F, -3.277F, 4.7949F);
        this.tail2.addChild(rightPlate16);
        this.setRotateAngle(rightPlate16, -0.0547F, 0.0355F, -0.1711F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0148F, 5.9011F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1227F, -0.39F, -0.0469F);
        this.tail3.cubeList.add(new ModelBox(tail3, -1, 10, -0.5F, 0.1F, -0.4F, 1, 1, 10, -0.15F, false));

        this.leftPlate17 = new ModelRenderer(this);
        this.leftPlate17.setRotationPoint(0.2076F, -2.6772F, 2.8635F);
        this.tail3.addChild(leftPlate17);
        this.setRotateAngle(leftPlate17, -0.0547F, -0.0355F, 0.1711F);


        this.rightPlate17 = new ModelRenderer(this);
        this.rightPlate17.setRotationPoint(-0.2076F, -2.6772F, 2.8635F);
        this.tail3.addChild(rightPlate17);
        this.setRotateAngle(rightPlate17, -0.0547F, 0.0355F, -0.1711F);


        this.leftPlate18 = new ModelRenderer(this);
        this.leftPlate18.setRotationPoint(0.1602F, -2.0581F, 6.8402F);
        this.tail3.addChild(leftPlate18);
        this.setRotateAngle(leftPlate18, -0.0547F, -0.0355F, 0.1711F);


        this.rightPlate18 = new ModelRenderer(this);
        this.rightPlate18.setRotationPoint(-0.1602F, -2.0581F, 6.8402F);
        this.tail3.addChild(rightPlate18);
        this.setRotateAngle(rightPlate18, -0.0547F, 0.0355F, -0.1711F);


        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.4512F, -0.2665F, -0.2625F);
        this.tail4.cubeList.add(new ModelBox(tail4, 16, 29, -0.5F, 0.1F, -0.3F, 1, 1, 7, -0.15F, false));

        this.leftPlate19 = new ModelRenderer(this);
        this.leftPlate19.setRotationPoint(0.1981F, -1.4076F, 2.1199F);
        this.tail4.addChild(leftPlate19);
        this.setRotateAngle(leftPlate19, -0.0547F, -0.0355F, 0.1711F);


        this.rightPlate19 = new ModelRenderer(this);
        this.rightPlate19.setRotationPoint(-0.1981F, -1.4076F, 2.1199F);
        this.tail4.addChild(rightPlate19);
        this.setRotateAngle(rightPlate19, -0.0547F, 0.0355F, -0.1711F);


        this.leftPlate20 = new ModelRenderer(this);
        this.leftPlate20.setRotationPoint(0.2065F, -1.0093F, 5.6086F);
        this.tail4.addChild(leftPlate20);
        this.setRotateAngle(leftPlate20, -0.0547F, -0.0355F, 0.1711F);


        this.rightPlate20 = new ModelRenderer(this);
        this.rightPlate20.setRotationPoint(-0.2065F, -1.0093F, 5.6086F);
        this.tail4.addChild(rightPlate20);
        this.setRotateAngle(rightPlate20, -0.0547F, 0.0355F, -0.1711F);


        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1241F, -0.2467F, -0.1578F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 22, -0.5F, 0.1F, 0.0F, 1, 1, 7, -0.15F, false));

        this.lefttailSpike = new ModelRenderer(this);
        this.lefttailSpike.setRotationPoint(0.7955F, -0.3743F, 2.9945F);
        this.tail5.addChild(lefttailSpike);
        this.setRotateAngle(lefttailSpike, -0.0166F, -0.0263F, 0.8605F);


        this.righttailSpike3 = new ModelRenderer(this);
        this.righttailSpike3.setRotationPoint(-0.7955F, -0.3743F, 2.9945F);
        this.tail5.addChild(righttailSpike3);
        this.setRotateAngle(righttailSpike3, -0.0166F, 0.0263F, -0.8605F);


        this.lefttailSpike2 = new ModelRenderer(this);
        this.lefttailSpike2.setRotationPoint(0.9752F, -0.7432F, 5.6585F);
        this.tail5.addChild(lefttailSpike2);
        this.setRotateAngle(lefttailSpike2, -0.2166F, -0.0267F, 0.9162F);


        this.righttailSpike2 = new ModelRenderer(this);
        this.righttailSpike2.setRotationPoint(-0.9752F, -0.7432F, 5.6585F);
        this.tail5.addChild(righttailSpike2);
        this.setRotateAngle(righttailSpike2, -0.2166F, 0.0267F, -0.9162F);

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
