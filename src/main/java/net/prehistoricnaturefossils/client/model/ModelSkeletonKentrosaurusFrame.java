package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonKentrosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer backleftleg3;
    private final ModelRenderer backleftleg4;
    private final ModelRenderer backrightleg;
    private final ModelRenderer backrightleg2;
    private final ModelRenderer backrightleg3;
    private final ModelRenderer backrightleg4;
    private final ModelRenderer leftPlate9;
    private final ModelRenderer rightPlate9;
    private final ModelRenderer leftPlate10;
    private final ModelRenderer rightPlate10;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r5;
    private final ModelRenderer leftPlate11;
    private final ModelRenderer rightPlate11;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftPlate12;
    private final ModelRenderer rightPlate12;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftPlate13;
    private final ModelRenderer rightPlate13;
    private final ModelRenderer tail5;
    private final ModelRenderer leftPlate14;
    private final ModelRenderer rightPlate14;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leftPlate7;
    private final ModelRenderer rightPlate7;
    private final ModelRenderer leftPlate8;
    private final ModelRenderer rightPlate8;
    private final ModelRenderer upperbody;
    private final ModelRenderer cube_r11;
    private final ModelRenderer leftPlate5;
    private final ModelRenderer rightPlate5;
    private final ModelRenderer leftPlate6;
    private final ModelRenderer rightPlate6;
    private final ModelRenderer spike;
    private final ModelRenderer spike2;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer leftPlate4;
    private final ModelRenderer rightPlate4;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer leftPlate2;
    private final ModelRenderer rightPlate2;
    private final ModelRenderer leftPlate3;
    private final ModelRenderer rightPlate3;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r16;
    private final ModelRenderer leftPlate24;
    private final ModelRenderer rightPlate24;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer frontleftleg2;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer frontleftleg4;
    private final ModelRenderer frontrightleg2;
    private final ModelRenderer frontrightleg3;
    private final ModelRenderer frontrightleg4;

    public ModelSkeletonKentrosaurusFrame() {
        this.textureWidth = 116;
        this.textureHeight = 116;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 23.0F, 2.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -18.9F, 11.8F, 1, 20, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.2F, -16.0F, -9.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.7F, 2.2F, -0.5F, 1, 15, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.2F, -16.0F, -9.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 6.9F, -4.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -16.0F, 12.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -2.7F, -5.0F, -0.5F, 1, 11, 1, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -19.3F, 11.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, -0.0436F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.25F, -4.25F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, -0.5F, 2.0F, -0.75F, 1, 2, 10, -0.15F, false));

        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(3.0F, 1.1235F, 1.0816F);
        this.body.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.1745F, 0.0F, 0.0F);


        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(-0.2F, 11.0329F, 0.6527F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.4276F, 0.0F, 0.0F);


        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(-0.0119F, 7.4272F, 1.5844F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.6534F, -0.0084F, -0.0044F);


        this.backleftleg4 = new ModelRenderer(this);
        this.backleftleg4.setRotationPoint(0.5119F, 1.2232F, -0.9138F);
        this.backleftleg3.addChild(backleftleg4);
        this.setRotateAngle(backleftleg4, 0.0436F, 0.0F, 0.0F);


        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-3.0F, 1.1235F, 1.0816F);
        this.body.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.3053F, -0.043F, 0.0076F);


        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(0.2F, 11.0329F, 0.6527F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.2094F, 0.0F, 0.0F);


        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.0119F, 7.4272F, 1.5844F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.9589F, 0.0084F, 0.0044F);


        this.backrightleg4 = new ModelRenderer(this);
        this.backrightleg4.setRotationPoint(-0.5119F, 1.2232F, -0.9138F);
        this.backrightleg3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, 0.7854F, 0.0F, 0.0F);


        this.leftPlate9 = new ModelRenderer(this);
        this.leftPlate9.setRotationPoint(1.7069F, -5.1749F, -2.9781F);
        this.body.addChild(leftPlate9);
        this.setRotateAngle(leftPlate9, -0.0682F, 0.1095F, 0.2063F);


        this.rightPlate9 = new ModelRenderer(this);
        this.rightPlate9.setRotationPoint(-1.7069F, -5.1749F, -2.9781F);
        this.body.addChild(rightPlate9);
        this.setRotateAngle(rightPlate9, -0.0682F, -0.1095F, -0.2063F);


        this.leftPlate10 = new ModelRenderer(this);
        this.leftPlate10.setRotationPoint(1.9534F, -4.573F, 4.9109F);
        this.body.addChild(leftPlate10);
        this.setRotateAngle(leftPlate10, -0.4173F, 0.1095F, 0.2063F);


        this.rightPlate10 = new ModelRenderer(this);
        this.rightPlate10.setRotationPoint(-1.9534F, -4.573F, 4.9109F);
        this.body.addChild(rightPlate10);
        this.setRotateAngle(rightPlate10, -0.4173F, -0.1095F, -0.2063F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.1422F, 4.0499F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.0301F, -0.5245F, 0.0286F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.0558F, -0.2589F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1222F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 27, -0.5F, -0.0422F, 0.9173F, 1, 2, 8, -0.15F, false));

        this.leftPlate11 = new ModelRenderer(this);
        this.leftPlate11.setRotationPoint(1.7984F, -3.9914F, 10.2916F);
        this.tail.addChild(leftPlate11);
        this.setRotateAngle(leftPlate11, -0.4184F, 0.1638F, 0.3266F);


        this.rightPlate11 = new ModelRenderer(this);
        this.rightPlate11.setRotationPoint(-1.7984F, -3.9914F, 10.2916F);
        this.tail.addChild(rightPlate11);
        this.setRotateAngle(rightPlate11, -0.4184F, -0.1638F, -0.3266F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.8269F, 8.6643F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2519F, -0.467F, 0.1153F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0707F, 0.3071F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 0, -0.5F, 0.1106F, -0.5203F, 1, 2, 10, -0.15F, false));

        this.leftPlate12 = new ModelRenderer(this);
        this.leftPlate12.setRotationPoint(1.6428F, -4.5496F, 10.6547F);
        this.tail2.addChild(leftPlate12);
        this.setRotateAngle(leftPlate12, -0.4533F, 0.1679F, 0.3246F);


        this.rightPlate12 = new ModelRenderer(this);
        this.rightPlate12.setRotationPoint(-1.6428F, -4.5496F, 10.6547F);
        this.tail2.addChild(rightPlate12);
        this.setRotateAngle(rightPlate12, -0.4533F, -0.1679F, -0.3246F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5165F, 10.7012F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1946F, -0.386F, 0.0741F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.1358F, -0.1669F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, 0.0545F, -0.9252F, 1, 2, 11, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.7978F, 9.8997F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1982F, -0.3858F, -0.0754F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.1128F, -0.104F);
        this.tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0087F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, -1, 26, -0.5F, 0.2944F, -0.461F, 1, 1, 10, -0.15F, false));

        this.leftPlate13 = new ModelRenderer(this);
        this.leftPlate13.setRotationPoint(1.1778F, -1.6231F, 1.8227F);
        this.tail4.addChild(leftPlate13);
        this.setRotateAngle(leftPlate13, -0.3425F, 0.2239F, 0.4453F);


        this.rightPlate13 = new ModelRenderer(this);
        this.rightPlate13.setRotationPoint(-1.1778F, -1.6231F, 1.8227F);
        this.tail4.addChild(rightPlate13);
        this.setRotateAngle(rightPlate13, -0.3425F, -0.2239F, -0.4453F);


        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0449F, 9.0714F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.2391F, -0.5974F, -0.1363F);
        this.tail5.cubeList.add(new ModelBox(tail5, 32, 38, -0.5F, 0.4216F, -0.3333F, 1, 1, 6, -0.15F, false));

        this.leftPlate14 = new ModelRenderer(this);
        this.leftPlate14.setRotationPoint(1.4778F, -0.9075F, 2.7994F);
        this.tail5.addChild(leftPlate14);
        this.setRotateAngle(leftPlate14, -0.6202F, 0.3061F, 0.5509F);


        this.rightPlate14 = new ModelRenderer(this);
        this.rightPlate14.setRotationPoint(-1.4778F, -0.9075F, 2.7994F);
        this.tail5.addChild(rightPlate14);
        this.setRotateAngle(rightPlate14, -0.6202F, -0.3061F, -0.5509F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.6F, -4.55F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.044F, 0.1308F, 0.0057F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 2.0075F, -10.5364F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 38, -1.0F, -0.8893F, 4.3354F, 1, 2, 6, -0.15F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 2.0075F, -10.5364F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2705F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 46, -1.0F, -0.1006F, -0.4096F, 1, 2, 5, -0.15F, false));

        this.leftPlate7 = new ModelRenderer(this);
        this.leftPlate7.setRotationPoint(1.7021F, -2.817F, -9.3687F);
        this.body2.addChild(leftPlate7);
        this.setRotateAngle(leftPlate7, 0.3826F, 0.0762F, 0.2206F);


        this.rightPlate7 = new ModelRenderer(this);
        this.rightPlate7.setRotationPoint(-1.7021F, -2.817F, -9.3687F);
        this.body2.addChild(rightPlate7);
        this.setRotateAngle(rightPlate7, 0.3826F, -0.0762F, -0.2206F);


        this.leftPlate8 = new ModelRenderer(this);
        this.leftPlate8.setRotationPoint(1.8042F, -4.5546F, -4.539F);
        this.body2.addChild(leftPlate8);
        this.setRotateAngle(leftPlate8, 0.2285F, 0.1095F, 0.2063F);


        this.rightPlate8 = new ModelRenderer(this);
        this.rightPlate8.setRotationPoint(-1.8042F, -4.5546F, -4.539F);
        this.body2.addChild(rightPlate8);
        this.setRotateAngle(rightPlate8, 0.2285F, -0.1095F, -0.2063F);


        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, 1.596F, -10.1452F);
        this.body2.addChild(upperbody);
        this.setRotateAngle(upperbody, 0.2271F, 0.0425F, 0.0098F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 2.204F, -7.7048F);
        this.upperbody.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 21, 12, -1.0F, 0.2947F, -3.0796F, 1, 2, 11, -0.15F, false));

        this.leftPlate5 = new ModelRenderer(this);
        this.leftPlate5.setRotationPoint(0.967F, -1.4582F, -6.9779F);
        this.upperbody.addChild(leftPlate5);
        this.setRotateAngle(leftPlate5, 0.5223F, 0.0762F, 0.2206F);


        this.rightPlate5 = new ModelRenderer(this);
        this.rightPlate5.setRotationPoint(-0.967F, -1.4582F, -6.9779F);
        this.upperbody.addChild(rightPlate5);
        this.setRotateAngle(rightPlate5, 0.5223F, -0.0762F, -0.2206F);


        this.leftPlate6 = new ModelRenderer(this);
        this.leftPlate6.setRotationPoint(1.1857F, -3.4745F, -1.7148F);
        this.upperbody.addChild(leftPlate6);
        this.setRotateAngle(leftPlate6, 0.5223F, 0.0762F, 0.2206F);


        this.rightPlate6 = new ModelRenderer(this);
        this.rightPlate6.setRotationPoint(-1.1857F, -3.4745F, -1.7148F);
        this.upperbody.addChild(rightPlate6);
        this.setRotateAngle(rightPlate6, 0.5223F, -0.0762F, -0.2206F);


        this.spike = new ModelRenderer(this);
        this.spike.setRotationPoint(5.7794F, 5.5429F, -6.2399F);
        this.upperbody.addChild(spike);
        this.setRotateAngle(spike, 0.1383F, 0.364F, 0.1283F);


        this.spike2 = new ModelRenderer(this);
        this.spike2.setRotationPoint(-5.7794F, 5.5429F, -6.2399F);
        this.upperbody.addChild(spike2);
        this.setRotateAngle(spike2, 0.1383F, -0.364F, -0.1283F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 3.1005F, -9.6886F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, -0.3547F, 0.5558F, -0.1195F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.2672F, -3.7014F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2094F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 6, 0.0F, 0.2682F, -0.1564F, 1, 2, 4, -0.14F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.3672F, -5.7014F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1396F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 73, 80, 0.0F, 0.35F, -0.15F, 1, 1, 3, -0.15F, false));

        this.leftPlate4 = new ModelRenderer(this);
        this.leftPlate4.setRotationPoint(0.8397F, -2.7679F, -1.6657F);
        this.neck.addChild(leftPlate4);
        this.setRotateAngle(leftPlate4, 0.5921F, 0.0762F, 0.2206F);


        this.rightPlate4 = new ModelRenderer(this);
        this.rightPlate4.setRotationPoint(-0.8397F, -2.7679F, -1.6657F);
        this.neck.addChild(rightPlate4);
        this.setRotateAngle(rightPlate4, 0.5921F, -0.0762F, -0.2206F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4672F, -5.5514F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.4477F, 0.1279F, -0.119F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.1976F, -2.9519F);
        this.neck2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0524F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 82, 11, 0.0F, 0.233F, 0.558F, 1, 1, 3, -0.15F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.1976F, -5.0519F);
        this.neck2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0349F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 53, 0.0F, 0.05F, -0.85F, 1, 1, 4, -0.15F, false));

        this.leftPlate2 = new ModelRenderer(this);
        this.leftPlate2.setRotationPoint(0.5567F, -0.9855F, -3.7923F);
        this.neck2.addChild(leftPlate2);
        this.setRotateAngle(leftPlate2, -0.0537F, 0.0762F, 0.2206F);


        this.rightPlate2 = new ModelRenderer(this);
        this.rightPlate2.setRotationPoint(-0.5567F, -0.9855F, -3.7923F);
        this.neck2.addChild(rightPlate2);
        this.setRotateAngle(rightPlate2, -0.0537F, -0.0762F, -0.2206F);


        this.leftPlate3 = new ModelRenderer(this);
        this.leftPlate3.setRotationPoint(0.6004F, -1.4054F, -0.4968F);
        this.neck2.addChild(leftPlate3);
        this.setRotateAngle(leftPlate3, 0.1732F, 0.0762F, 0.2206F);


        this.rightPlate3 = new ModelRenderer(this);
        this.rightPlate3.setRotationPoint(-0.6004F, -1.4054F, -0.4968F);
        this.neck2.addChild(rightPlate3);
        this.setRotateAngle(rightPlate3, 0.1732F, -0.0762F, -0.2206F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.2275F, -5.7224F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.4215F, 0.0F, 0.0F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.1658F, -1.7431F);
        this.neck3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1134F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 67, 57, 0.0F, 0.05F, -1.35F, 1, 1, 3, -0.15F, false));

        this.leftPlate24 = new ModelRenderer(this);
        this.leftPlate24.setRotationPoint(0.5607F, -1.0106F, -0.3857F);
        this.neck3.addChild(leftPlate24);
        this.setRotateAngle(leftPlate24, -0.1584F, 0.0762F, 0.2206F);


        this.rightPlate24 = new ModelRenderer(this);
        this.rightPlate24.setRotationPoint(-0.5607F, -1.0106F, -0.3857F);
        this.neck3.addChild(rightPlate24);
        this.setRotateAngle(rightPlate24, -0.1584F, -0.0762F, -0.2206F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1048F, -3.0692F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, -0.2071F, 0.5673F, 0.2959F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7046F, 0.1521F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3927F, 0.0F, 0.0F);


        this.frontleftleg2 = new ModelRenderer(this);
        this.frontleftleg2.setRotationPoint(3.8724F, 7.6427F, -8.1789F);
        this.upperbody.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.8055F, 0.222F, -0.1465F);


        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(-0.0914F, 5.5105F, 0.2836F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.6168F, 0.07F, 0.1047F);


        this.frontleftleg4 = new ModelRenderer(this);
        this.frontleftleg4.setRotationPoint(0.0431F, 4.9289F, -0.5483F);
        this.frontleftleg3.addChild(frontleftleg4);
        this.setRotateAngle(frontleftleg4, 0.5452F, -0.0562F, -0.0206F);


        this.frontrightleg2 = new ModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-3.8724F, 7.6427F, -8.1789F);
        this.upperbody.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 0.3523F, 0.0552F, 0.1188F);


        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.0914F, 5.5105F, 0.2836F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -1.0531F, -0.07F, -0.1047F);


        this.frontrightleg4 = new ModelRenderer(this);
        this.frontrightleg4.setRotationPoint(-0.0431F, 4.9289F, -0.5483F);
        this.frontrightleg3.addChild(frontrightleg4);
        this.setRotateAngle(frontrightleg4, 0.5452F, 0.0562F, 0.0206F);

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
