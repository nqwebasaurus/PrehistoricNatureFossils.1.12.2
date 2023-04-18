package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBalhuticaris extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer eyeL;
    private final ModelRenderer antennaR;
    private final ModelRenderer Body2;
    private final ModelRenderer legL15;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Body3;
    private final ModelRenderer legL21;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Body4;
    private final ModelRenderer legL23;
    private final ModelRenderer cube_r7;
    private final ModelRenderer legL25;
    private final ModelRenderer Body5;
    private final ModelRenderer legL27;
    private final ModelRenderer cube_r8;
    private final ModelRenderer legL29;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Body6;
    private final ModelRenderer legL31;
    private final ModelRenderer cube_r10;
    private final ModelRenderer legL33;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Body7;
    private final ModelRenderer legL35;
    private final ModelRenderer cube_r12;
    private final ModelRenderer legL37;
    private final ModelRenderer cube_r13;
    private final ModelRenderer Body8;
    private final ModelRenderer legL39;
    private final ModelRenderer cube_r14;
    private final ModelRenderer legL41;
    private final ModelRenderer Body9;
    private final ModelRenderer legL43;
    private final ModelRenderer cube_r15;
    private final ModelRenderer legL45;
    private final ModelRenderer Body10;
    private final ModelRenderer legL47;
    private final ModelRenderer cube_r16;
    private final ModelRenderer legL49;
    private final ModelRenderer cube_r17;
    private final ModelRenderer Body11;
    private final ModelRenderer legL51;
    private final ModelRenderer cube_r18;
    private final ModelRenderer legL53;
    private final ModelRenderer cube_r19;
    private final ModelRenderer Body12;
    private final ModelRenderer legL55;
    private final ModelRenderer legL57;
    private final ModelRenderer cube_r20;
    private final ModelRenderer Body13;
    private final ModelRenderer legL59;
    private final ModelRenderer legL61;
    private final ModelRenderer cube_r21;
    private final ModelRenderer Body14;
    private final ModelRenderer legL63;
    private final ModelRenderer legL65;
    private final ModelRenderer Body15;
    private final ModelRenderer legL67;
    private final ModelRenderer cube_r22;
    private final ModelRenderer legL69;
    private final ModelRenderer cube_r23;
    private final ModelRenderer Body16;
    private final ModelRenderer legL71;
    private final ModelRenderer legL73;
    private final ModelRenderer cube_r24;
    private final ModelRenderer Body17;
    private final ModelRenderer legL75;
    private final ModelRenderer cube_r25;
    private final ModelRenderer legL77;
    private final ModelRenderer Body18;
    private final ModelRenderer legL79;
    private final ModelRenderer cube_r26;
    private final ModelRenderer legL81;
    private final ModelRenderer Body19;
    private final ModelRenderer legL83;
    private final ModelRenderer cube_r27;
    private final ModelRenderer legL85;
    private final ModelRenderer cube_r28;
    private final ModelRenderer Body20;
    private final ModelRenderer legL87;
    private final ModelRenderer legL89;
    private final ModelRenderer cube_r29;
    private final ModelRenderer Body21;
    private final ModelRenderer legL91;
    private final ModelRenderer legL93;
    private final ModelRenderer Body22;
    private final ModelRenderer legL95;
    private final ModelRenderer cube_r30;
    private final ModelRenderer legL97;
    private final ModelRenderer Body23;
    private final ModelRenderer legL99;
    private final ModelRenderer cube_r31;
    private final ModelRenderer Body24;
    private final ModelRenderer legL103;
    private final ModelRenderer cube_r32;
    private final ModelRenderer legL105;
    private final ModelRenderer cube_r33;
    private final ModelRenderer Body25;
    private final ModelRenderer telson;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;

    public ModelSkeletonBalhuticaris() {
        this.textureWidth = 160;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 40, -10.0F, -1.0F, -23.0F, 20, 1, 33, 0.004F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(16.9F, -0.5F, 16.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1833F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -20.0858F, -0.5F, -38.006F, 20, 1, 38, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.5F, 10.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.5236F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 74, 40, -8.6F, -0.5F, -5.1F, 20, 1, 19, -0.002F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(-1.6F, -2.5403F, -11.9783F);
        this.fossil.addChild(Body);
        this.setRotateAngle(Body, -0.1745F, 0.0F, -1.5708F);
        this.Body.cubeList.add(new ModelBox(Body, 17, 6, -1.2F, -3.7097F, -1.4217F, 0, 2, 6, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -1.25F, -1.9347F, -3.6717F, 0, 12, 8, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.8F, -3.6597F, -1.4217F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6458F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -2.1F, -0.05F, -2.95F, 0, 2, 3, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.5597F, -1.2217F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 21, -1.4F, -1.2F, -2.8F, 0, 2, 4, 0.0F, false));

        this.eyeL = new ModelRenderer(this);
        this.eyeL.setRotationPoint(-0.5F, -0.3097F, -2.7217F);
        this.Body.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.2618F, 0.0F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 4, 0, -0.9F, -0.5F, -2.0F, 0, 1, 1, 0.0F, false));

        this.antennaR = new ModelRenderer(this);
        this.antennaR.setRotationPoint(-0.75F, -0.3097F, -2.9717F);
        this.Body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 1.1345F, -1.5708F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 28, 28, -0.5F, -0.6F, -2.0F, 1, 0, 2, 0.0F, false));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -2.3097F, 4.2783F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, 0.0436F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 33, 31, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.0F, false));

        this.legL15 = new ModelRenderer(this);
        this.legL15.setRotationPoint(-1.3F, 2.0F, 0.0F);
        this.Body2.addChild(legL15);
        this.setRotateAngle(legL15, -1.5708F, -1.5272F, 1.5708F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL15.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.0698F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 3, 28, -0.041F, -0.001F, 0.0399F, 1, 7, 0, 0.0F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, 0.0436F, 0.0F, 0.0F);
        this.Body3.cubeList.add(new ModelBox(Body3, 21, 0, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.01F, false));

        this.legL21 = new ModelRenderer(this);
        this.legL21.setRotationPoint(-1.3F, 2.0F, 0.5F);
        this.Body3.addChild(legL21);
        this.setRotateAngle(legL21, 0.0F, -1.5708F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL21.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.0785F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 22, -0.541F, -0.001F, 0.0399F, 1, 7, 0, 0.0F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.0873F, 0.0F, 0.0F);
        this.Body4.cubeList.add(new ModelBox(Body4, 33, 23, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.0F, false));

        this.legL23 = new ModelRenderer(this);
        this.legL23.setRotationPoint(-1.2F, 2.0F, 0.0F);
        this.Body4.addChild(legL23);
        this.setRotateAngle(legL23, 1.5708F, -1.5184F, -1.5708F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL23.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.0349F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 0, -0.541F, -0.001F, 0.0399F, 1, 7, 0, 0.0F, false));

        this.legL25 = new ModelRenderer(this);
        this.legL25.setRotationPoint(-1.3F, 2.0F, 0.5F);
        this.Body4.addChild(legL25);
        this.setRotateAngle(legL25, 1.5708F, -1.5359F, -1.5708F);
        this.legL25.cubeList.add(new ModelBox(legL25, 27, 22, -0.541F, -0.001F, 0.0399F, 1, 7, 0, 0.0F, false));

        this.Body5 = new ModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body4.addChild(Body5);
        this.setRotateAngle(Body5, 0.0436F, 0.0F, 0.0F);
        this.Body5.cubeList.add(new ModelBox(Body5, 35, 19, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.01F, false));

        this.legL27 = new ModelRenderer(this);
        this.legL27.setRotationPoint(-1.1F, 2.0F, 0.0F);
        this.Body5.addChild(legL27);
        this.setRotateAngle(legL27, 0.0F, -1.5708F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL27.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.1396F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 28, -0.541F, -0.001F, 0.1399F, 1, 7, 0, 0.0F, false));

        this.legL29 = new ModelRenderer(this);
        this.legL29.setRotationPoint(-1.2F, 2.0F, 0.5F);
        this.Body5.addChild(legL29);
        this.setRotateAngle(legL29, 0.0F, -1.5708F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL29.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.2182F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 21, -0.5F, 0.0F, 0.0F, 1, 7, 0, 0.0F, false));

        this.Body6 = new ModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body5.addChild(Body6);
        this.setRotateAngle(Body6, 0.0436F, 0.0F, 0.0F);
        this.Body6.cubeList.add(new ModelBox(Body6, 33, 5, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.0F, false));

        this.legL31 = new ModelRenderer(this);
        this.legL31.setRotationPoint(-1.4F, 2.0F, 0.0F);
        this.Body6.addChild(legL31);
        this.setRotateAngle(legL31, 0.0F, -1.5708F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL31.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.3491F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 22, -0.5F, 0.0F, -0.1F, 1, 7, 0, 0.0F, false));

        this.legL33 = new ModelRenderer(this);
        this.legL33.setRotationPoint(-1.2F, 2.0F, 0.5F);
        this.Body6.addChild(legL33);
        this.setRotateAngle(legL33, 0.0F, -1.5708F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL33.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.3491F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 21, 22, -0.5F, 0.0F, 0.0F, 1, 7, 0, 0.0F, false));

        this.Body7 = new ModelRenderer(this);
        this.Body7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body6.addChild(Body7);
        this.setRotateAngle(Body7, 0.1309F, 0.0F, 0.0F);
        this.Body7.cubeList.add(new ModelBox(Body7, 24, 7, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.01F, false));

        this.legL35 = new ModelRenderer(this);
        this.legL35.setRotationPoint(-1.3F, 2.0F, 0.0F);
        this.Body7.addChild(legL35);
        this.setRotateAngle(legL35, 0.0F, -1.5708F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL35.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.3491F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 22, -0.5F, 0.0F, 0.0F, 1, 7, 0, 0.0F, false));

        this.legL37 = new ModelRenderer(this);
        this.legL37.setRotationPoint(-1.2F, 2.0F, 0.5F);
        this.Body7.addChild(legL37);
        this.setRotateAngle(legL37, 0.0F, -1.5708F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL37.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.3491F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 22, -0.5F, 0.0F, 0.0F, 1, 7, 0, 0.0F, false));

        this.Body8 = new ModelRenderer(this);
        this.Body8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body7.addChild(Body8);
        this.setRotateAngle(Body8, 0.1309F, 0.0F, 0.0F);
        this.Body8.cubeList.add(new ModelBox(Body8, 32, 18, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.0F, false));

        this.legL39 = new ModelRenderer(this);
        this.legL39.setRotationPoint(-1.3F, 1.75F, 0.0F);
        this.Body8.addChild(legL39);
        this.setRotateAngle(legL39, 0.0F, -1.5708F, 0.0F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL39.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.3491F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 30, -0.5F, 0.0F, 0.0F, 1, 6, 0, 0.0F, false));

        this.legL41 = new ModelRenderer(this);
        this.legL41.setRotationPoint(-1.3F, 1.75F, 0.5F);
        this.Body8.addChild(legL41);
        this.setRotateAngle(legL41, 1.5708F, -1.4399F, -1.5708F);


        this.Body9 = new ModelRenderer(this);
        this.Body9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body8.addChild(Body9);
        this.Body9.cubeList.add(new ModelBox(Body9, 35, 0, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.01F, false));

        this.legL43 = new ModelRenderer(this);
        this.legL43.setRotationPoint(-1.3F, 1.75F, 0.0F);
        this.Body9.addChild(legL43);
        this.setRotateAngle(legL43, 0.0F, -1.5708F, 0.0F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL43.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.3491F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 29, 15, -0.5F, 0.0F, -0.02F, 1, 6, 0, 0.0F, false));

        this.legL45 = new ModelRenderer(this);
        this.legL45.setRotationPoint(-1.3F, 1.75F, 0.5F);
        this.Body9.addChild(legL45);
        this.setRotateAngle(legL45, 0.0F, -1.5708F, 0.0F);


        this.Body10 = new ModelRenderer(this);
        this.Body10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body9.addChild(Body10);
        this.setRotateAngle(Body10, -0.0873F, 0.0F, 0.0F);
        this.Body10.cubeList.add(new ModelBox(Body10, 32, 13, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.0F, false));

        this.legL47 = new ModelRenderer(this);
        this.legL47.setRotationPoint(-1.3F, 1.75F, 0.0F);
        this.Body10.addChild(legL47);
        this.setRotateAngle(legL47, 0.0F, -1.5708F, 0.0F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL47.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.3491F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 9, 29, -0.5F, 0.0F, -0.03F, 1, 6, 0, 0.0F, false));

        this.legL49 = new ModelRenderer(this);
        this.legL49.setRotationPoint(-1.3F, 1.75F, 0.5F);
        this.Body10.addChild(legL49);
        this.setRotateAngle(legL49, 0.0F, -1.5708F, 0.0F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL49.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.3054F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 29, 0, -0.5F, 0.0F, -0.002F, 1, 6, 0, 0.0F, false));

        this.Body11 = new ModelRenderer(this);
        this.Body11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body10.addChild(Body11);
        this.Body11.cubeList.add(new ModelBox(Body11, 32, 0, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.01F, false));

        this.legL51 = new ModelRenderer(this);
        this.legL51.setRotationPoint(-1.3F, 1.75F, 0.0F);
        this.Body11.addChild(legL51);
        this.setRotateAngle(legL51, 0.0F, -1.5708F, 0.0F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL51.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.3491F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 30, 7, -0.5F, 0.0F, 0.0F, 1, 6, 0, 0.0F, false));

        this.legL53 = new ModelRenderer(this);
        this.legL53.setRotationPoint(-1.4F, 1.75F, 0.5F);
        this.Body11.addChild(legL53);
        this.setRotateAngle(legL53, 0.0F, -1.5708F, 0.0F);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL53.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.2618F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 6, 28, -0.5F, 0.0F, -0.08F, 1, 6, 0, 0.0F, false));

        this.Body12 = new ModelRenderer(this);
        this.Body12.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body11.addChild(Body12);
        this.setRotateAngle(Body12, -0.0873F, 0.0F, 0.0F);
        this.Body12.cubeList.add(new ModelBox(Body12, 30, 31, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.0F, false));

        this.legL55 = new ModelRenderer(this);
        this.legL55.setRotationPoint(-1.2F, 1.75F, 0.0F);
        this.Body12.addChild(legL55);
        this.setRotateAngle(legL55, 0.0F, -1.5708F, 0.0F);


        this.legL57 = new ModelRenderer(this);
        this.legL57.setRotationPoint(-1.2F, 1.75F, 0.5F);
        this.Body12.addChild(legL57);
        this.setRotateAngle(legL57, 0.0F, -1.5708F, 0.0F);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL57.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.3491F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 17, 6, -0.5F, 0.0F, 0.11F, 1, 5, 0, 0.0F, false));

        this.Body13 = new ModelRenderer(this);
        this.Body13.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body12.addChild(Body13);
        this.Body13.cubeList.add(new ModelBox(Body13, 9, 0, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.01F, false));

        this.legL59 = new ModelRenderer(this);
        this.legL59.setRotationPoint(-1.2F, 1.75F, 0.0F);
        this.Body13.addChild(legL59);
        this.setRotateAngle(legL59, 0.0F, -1.5708F, 0.0F);


        this.legL61 = new ModelRenderer(this);
        this.legL61.setRotationPoint(-1.3F, 1.75F, 0.5F);
        this.Body13.addChild(legL61);
        this.setRotateAngle(legL61, -1.5708F, -1.3963F, 1.5708F);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL61.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.3491F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 20, 6, -0.5F, 0.0F, 0.03F, 1, 5, 0, 0.0F, false));

        this.Body14 = new ModelRenderer(this);
        this.Body14.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body13.addChild(Body14);
        this.setRotateAngle(Body14, -0.1309F, 0.0F, 0.0F);
        this.Body14.cubeList.add(new ModelBox(Body14, 35, 14, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.0F, false));

        this.legL63 = new ModelRenderer(this);
        this.legL63.setRotationPoint(-1.2F, 1.75F, 0.0F);
        this.Body14.addChild(legL63);
        this.setRotateAngle(legL63, 0.0F, -1.5708F, 0.0F);


        this.legL65 = new ModelRenderer(this);
        this.legL65.setRotationPoint(-1.0F, 1.75F, 0.5F);
        this.Body14.addChild(legL65);
        this.setRotateAngle(legL65, 0.0F, -1.5708F, 0.0F);


        this.Body15 = new ModelRenderer(this);
        this.Body15.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body14.addChild(Body15);
        this.setRotateAngle(Body15, -0.0436F, 0.0F, 0.0F);
        this.Body15.cubeList.add(new ModelBox(Body15, 27, 31, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.01F, false));

        this.legL67 = new ModelRenderer(this);
        this.legL67.setRotationPoint(-1.2F, 1.75F, 0.0F);
        this.Body15.addChild(legL67);
        this.setRotateAngle(legL67, 0.0F, -1.5708F, 0.0F);


        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL67.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.1745F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 15, 30, -0.7F, 0.0F, 0.08F, 1, 4, 0, 0.0F, false));

        this.legL69 = new ModelRenderer(this);
        this.legL69.setRotationPoint(-1.3F, 1.75F, 0.5F);
        this.Body15.addChild(legL69);
        this.setRotateAngle(legL69, 0.0F, -1.5708F, 0.0F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL69.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.1745F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 24, 15, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.Body16 = new ModelRenderer(this);
        this.Body16.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body15.addChild(Body16);
        this.setRotateAngle(Body16, -0.1309F, 0.0F, 0.0F);
        this.Body16.cubeList.add(new ModelBox(Body16, 24, 30, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.0F, false));

        this.legL71 = new ModelRenderer(this);
        this.legL71.setRotationPoint(-1.3F, 1.75F, 0.0F);
        this.Body16.addChild(legL71);
        this.setRotateAngle(legL71, 0.0F, -1.5708F, 0.0F);


        this.legL73 = new ModelRenderer(this);
        this.legL73.setRotationPoint(-1.2F, 1.75F, 0.5F);
        this.Body16.addChild(legL73);
        this.setRotateAngle(legL73, 0.0F, -1.5708F, 0.0F);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL73.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.3491F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 15, 40, -0.5F, 0.0F, 0.09F, 1, 3, 0, 0.0F, false));

        this.Body17 = new ModelRenderer(this);
        this.Body17.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body16.addChild(Body17);
        this.setRotateAngle(Body17, -0.0873F, 0.0F, 0.0F);
        this.Body17.cubeList.add(new ModelBox(Body17, 35, 9, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.01F, false));

        this.legL75 = new ModelRenderer(this);
        this.legL75.setRotationPoint(-1.2F, 1.75F, 0.0F);
        this.Body17.addChild(legL75);
        this.setRotateAngle(legL75, 0.0F, -1.5708F, 0.0F);


        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL75.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -0.3491F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 9, 40, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL77 = new ModelRenderer(this);
        this.legL77.setRotationPoint(-1.3F, 1.75F, 0.5F);
        this.Body17.addChild(legL77);
        this.setRotateAngle(legL77, 0.0F, -1.5708F, 0.0F);


        this.Body18 = new ModelRenderer(this);
        this.Body18.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body17.addChild(Body18);
        this.setRotateAngle(Body18, -0.1309F, 0.0F, 0.0F);
        this.Body18.cubeList.add(new ModelBox(Body18, 30, 22, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.0F, false));

        this.legL79 = new ModelRenderer(this);
        this.legL79.setRotationPoint(-1.3F, 1.75F, 0.0F);
        this.Body18.addChild(legL79);
        this.setRotateAngle(legL79, 0.0F, -1.5708F, 0.0F);


        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL79.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.3491F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 6, 40, -0.5F, 0.0F, -0.02F, 1, 3, 0, 0.0F, false));

        this.legL81 = new ModelRenderer(this);
        this.legL81.setRotationPoint(-1.3F, 1.75F, 0.5F);
        this.Body18.addChild(legL81);
        this.setRotateAngle(legL81, 0.0F, -1.5708F, 0.0F);


        this.Body19 = new ModelRenderer(this);
        this.Body19.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body18.addChild(Body19);
        this.setRotateAngle(Body19, -0.0873F, 0.0F, 0.0F);
        this.Body19.cubeList.add(new ModelBox(Body19, 21, 30, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.01F, false));

        this.legL83 = new ModelRenderer(this);
        this.legL83.setRotationPoint(-1.3F, 1.75F, 0.0F);
        this.Body19.addChild(legL83);
        this.setRotateAngle(legL83, 0.0F, -1.5708F, 0.0F);


        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL83.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.3491F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 3, 40, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL85 = new ModelRenderer(this);
        this.legL85.setRotationPoint(-1.2F, 1.75F, 0.5F);
        this.Body19.addChild(legL85);
        this.setRotateAngle(legL85, 0.0F, -1.5708F, 0.0F);


        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL85.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -0.3491F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 40, -0.5F, 0.0F, 0.13F, 1, 3, 0, 0.0F, false));

        this.Body20 = new ModelRenderer(this);
        this.Body20.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body19.addChild(Body20);
        this.setRotateAngle(Body20, -0.1309F, 0.0F, 0.0F);
        this.Body20.cubeList.add(new ModelBox(Body20, 18, 30, -1.4F, -0.5F, 0.0F, 0, 3, 1, 0.0F, false));

        this.legL87 = new ModelRenderer(this);
        this.legL87.setRotationPoint(1.0F, 1.75F, 0.0F);
        this.Body20.addChild(legL87);
        this.setRotateAngle(legL87, 0.0F, -1.5708F, 0.0F);


        this.legL89 = new ModelRenderer(this);
        this.legL89.setRotationPoint(-1.4F, 1.75F, 0.5F);
        this.Body20.addChild(legL89);
        this.setRotateAngle(legL89, 0.0F, -1.5708F, 0.0F);


        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL89.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, -0.3491F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 35, 28, -0.5F, -0.5F, -0.03F, 1, 3, 0, 0.0F, false));

        this.Body21 = new ModelRenderer(this);
        this.Body21.setRotationPoint(-0.4F, 0.0F, 1.0F);
        this.Body20.addChild(Body21);
        this.setRotateAngle(Body21, -0.1309F, 0.0F, 0.0F);
        this.Body21.cubeList.add(new ModelBox(Body21, 12, 40, -0.95F, -0.1F, 0.0F, 0, 2, 1, 0.0F, false));

        this.legL91 = new ModelRenderer(this);
        this.legL91.setRotationPoint(-0.9F, 1.75F, 0.0F);
        this.Body21.addChild(legL91);
        this.setRotateAngle(legL91, 0.0F, -1.5708F, 0.0F);


        this.legL93 = new ModelRenderer(this);
        this.legL93.setRotationPoint(-0.9F, 1.75F, 0.5F);
        this.Body21.addChild(legL93);
        this.setRotateAngle(legL93, 0.0F, -1.5708F, 0.0F);


        this.Body22 = new ModelRenderer(this);
        this.Body22.setRotationPoint(-0.1F, 0.0F, 1.0F);
        this.Body21.addChild(Body22);
        this.setRotateAngle(Body22, -0.1309F, 0.0F, 0.0F);
        this.Body22.cubeList.add(new ModelBox(Body22, 27, 8, -0.9F, -0.1F, 0.0F, 0, 2, 1, 0.01F, false));

        this.legL95 = new ModelRenderer(this);
        this.legL95.setRotationPoint(-0.7F, 1.75F, 0.0F);
        this.Body22.addChild(legL95);
        this.setRotateAngle(legL95, 0.0F, -1.5708F, 0.0F);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL95.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -0.3491F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 21, 35, -0.5F, 0.0F, 0.2F, 1, 2, 0, 0.0F, false));

        this.legL97 = new ModelRenderer(this);
        this.legL97.setRotationPoint(-0.9F, 1.75F, 0.5F);
        this.Body22.addChild(legL97);
        this.setRotateAngle(legL97, 0.0F, -1.5708F, 0.0F);


        this.Body23 = new ModelRenderer(this);
        this.Body23.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body22.addChild(Body23);
        this.setRotateAngle(Body23, -0.1309F, 0.0F, 0.0F);
        this.Body23.cubeList.add(new ModelBox(Body23, 5, 21, -0.88F, -0.1F, 0.0F, 0, 2, 1, 0.0F, false));

        this.legL99 = new ModelRenderer(this);
        this.legL99.setRotationPoint(-0.9F, 1.75F, 0.0F);
        this.Body23.addChild(legL99);
        this.setRotateAngle(legL99, 0.0F, -1.5708F, 0.0F);


        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL99.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -0.3491F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 15, 35, -0.5F, 0.0F, -0.04F, 1, 2, 0, 0.0F, false));

        this.Body24 = new ModelRenderer(this);
        this.Body24.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body23.addChild(Body24);
        this.setRotateAngle(Body24, -0.1745F, 0.0F, 0.0F);
        this.Body24.cubeList.add(new ModelBox(Body24, 0, 21, -0.9F, -0.1F, 0.0F, 0, 2, 1, 0.01F, false));

        this.legL103 = new ModelRenderer(this);
        this.legL103.setRotationPoint(-0.9F, 1.75F, 0.0F);
        this.Body24.addChild(legL103);
        this.setRotateAngle(legL103, -1.5708F, -1.3963F, 1.5708F);


        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL103.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, -0.3491F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 18, 35, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legL105 = new ModelRenderer(this);
        this.legL105.setRotationPoint(-0.9F, 1.75F, 0.5F);
        this.Body24.addChild(legL105);
        this.setRotateAngle(legL105, 0.0F, -1.5708F, 0.0F);


        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL105.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, -0.3491F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 6, 35, -0.5F, 0.0F, -0.02F, 1, 2, 0, 0.0F, false));

        this.Body25 = new ModelRenderer(this);
        this.Body25.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body24.addChild(Body25);
        this.setRotateAngle(Body25, -0.2182F, 0.0F, 0.0F);
        this.Body25.cubeList.add(new ModelBox(Body25, 18, 40, -0.87F, -0.1F, 0.0F, 0, 2, 1, 0.0F, false));

        this.telson = new ModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.5F, 0.9F);
        this.Body25.addChild(telson);
        this.setRotateAngle(telson, -0.3491F, 0.0F, 0.0F);
        this.telson.cubeList.add(new ModelBox(telson, 0, 0, -0.9F, -0.5F, 1.0F, 0, 1, 1, 0.0F, false));
        this.telson.cubeList.add(new ModelBox(telson, 24, 35, -0.9F, -0.5F, 0.0F, 0, 1, 1, 0.01F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.2F, 0.1F, 0.0F);
        this.telson.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.6545F, -1.5708F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 9, 0, -2.2F, -1.2F, 0.0F, 3, 0, 5, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.2F, 0.1F, 0.0F);
        this.telson.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.2618F, 1.5708F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 12, 16, -0.8F, 1.2F, 0.0F, 3, 0, 5, 0.0F, false));

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
