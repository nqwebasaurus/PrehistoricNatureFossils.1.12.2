package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBunostegos extends ModelBase {
    private final ModelRenderer bunostegos;
    private final ModelRenderer lowerbody;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Hips_r2;
    private final ModelRenderer Hips_r3;
    private final ModelRenderer Hips_r4;
    private final ModelRenderer Hips_r5;
    private final ModelRenderer Hips_r6;
    private final ModelRenderer Hips_r7;
    private final ModelRenderer Hips_r8;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer backleftleg4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer backleftleg5;
    private final ModelRenderer backleftleg6;
    private final ModelRenderer backrightleg4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer backrightleg5;
    private final ModelRenderer backrightleg6;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer upperbody;
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
    private final ModelRenderer frontleftleg;
    private final ModelRenderer cube_r38;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer cube_r39;
    private final ModelRenderer frontleftleg7;
    private final ModelRenderer cube_r40;
    private final ModelRenderer frontrightleg;
    private final ModelRenderer cube_r41;
    private final ModelRenderer frontrightleg3;
    private final ModelRenderer cube_r42;
    private final ModelRenderer frontrightleg7;
    private final ModelRenderer cube_r43;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r44;
    private final ModelRenderer head;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cheekbone;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cheekbone2;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer body;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;

    public ModelSkeletonBunostegos() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.bunostegos = new ModelRenderer(this);
        this.bunostegos.setRotationPoint(0.0F, 17.75F, -1.0F);


        this.lowerbody = new ModelRenderer(this);
        this.lowerbody.setRotationPoint(0.0F, -9.15F, 1.8F);
        this.bunostegos.addChild(lowerbody);
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 44, 50, 1.0F, 0.1606F, 6.4104F, 2, 0, 1, 0.0F, false));
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 44, 50, -3.0F, 0.1606F, 6.4104F, 2, 0, 1, 0.0F, true));

        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-4.4F, 4.1927F, 7.159F);
        this.lowerbody.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.2328F, -0.3392F, -1.1535F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 29, -0.1888F, 0.0124F, -1.6438F, 1, 4, 8, 0.001F, true));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(-4.4231F, 1.5263F, 7.2646F);
        this.lowerbody.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.2604F, -0.087F, -0.219F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 0, 0, -0.6249F, -0.4342F, -0.2995F, 1, 3, 4, 0.001F, true));

        this.Hips_r3 = new ModelRenderer(this);
        this.Hips_r3.setRotationPoint(-4.4F, -2.0073F, 7.159F);
        this.lowerbody.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.1731F, -0.0227F, -0.0068F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 0, 15, -0.7605F, 1.1794F, 1.716F, 1, 3, 4, 0.001F, true));

        this.Hips_r4 = new ModelRenderer(this);
        this.Hips_r4.setRotationPoint(-4.6472F, 0.7571F, 8.3969F);
        this.lowerbody.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, -0.1824F, 0.321F, -0.0689F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 62, 47, -0.5227F, -1.3278F, -2.8848F, 1, 3, 3, 0.001F, true));

        this.Hips_r5 = new ModelRenderer(this);
        this.Hips_r5.setRotationPoint(4.6472F, 0.7571F, 8.3969F);
        this.lowerbody.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, -0.1824F, -0.321F, 0.0689F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 62, 47, -0.4773F, -1.3278F, -2.8848F, 1, 3, 3, 0.001F, false));

        this.Hips_r6 = new ModelRenderer(this);
        this.Hips_r6.setRotationPoint(4.4F, -2.0073F, 7.159F);
        this.lowerbody.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, -0.1731F, 0.0227F, 0.0068F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 0, 15, -0.2395F, 1.1794F, 1.716F, 1, 3, 4, 0.001F, false));

        this.Hips_r7 = new ModelRenderer(this);
        this.Hips_r7.setRotationPoint(4.4231F, 1.5263F, 7.2646F);
        this.lowerbody.addChild(Hips_r7);
        this.setRotateAngle(Hips_r7, -0.2604F, 0.087F, 0.219F);
        this.Hips_r7.cubeList.add(new ModelBox(Hips_r7, 0, 0, -0.3751F, -0.4342F, -0.2995F, 1, 3, 4, 0.001F, false));

        this.Hips_r8 = new ModelRenderer(this);
        this.Hips_r8.setRotationPoint(4.4F, 4.1927F, 7.159F);
        this.lowerbody.addChild(Hips_r8);
        this.setRotateAngle(Hips_r8, -0.2328F, 0.3392F, 1.1535F);
        this.Hips_r8.cubeList.add(new ModelBox(Hips_r8, 0, 29, -0.8112F, 0.0124F, -1.6438F, 1, 4, 8, 0.001F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.5F, 6.2F);
        this.lowerbody.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 42, -1.0F, -2.3F, 0.0F, 2, 2, 6, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.9F, -1.85F, 7.7F);
        this.lowerbody.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 30, 0.25F, 0.25F, 0.0F, 0, 1, 5, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 55, -1.5F, 0.25F, 0.0F, 0, 1, 5, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 30, 1.55F, 0.25F, 0.0F, 0, 1, 5, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 55, 3.3F, 0.25F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.1606F, 6.9104F);
        this.lowerbody.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, -0.1309F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 8, -4.0F, -0.1F, 3.5F, 4, 0, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 10, -4.0F, -0.2F, 1.5F, 4, 0, 1, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.0F, 0.1606F, 6.9104F);
        this.lowerbody.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.4363F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 51, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(3.0F, 0.1606F, 6.9104F);
        this.lowerbody.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.4363F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 51, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 0.1606F, 6.9104F);
        this.lowerbody.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1309F, 0.0F, 0.1309F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 8, 0.0F, -0.1F, 3.5F, 4, 0, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 10, 0.0F, -0.2F, 1.5F, 4, 0, 1, 0.0F, false));

        this.backleftleg4 = new ModelRenderer(this);
        this.backleftleg4.setRotationPoint(4.6556F, 4.2722F, 8.811F);
        this.lowerbody.addChild(backleftleg4);
        this.setRotateAngle(backleftleg4, 0.2618F, 0.0F, -0.3491F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.4003F, 1.1495F, -0.411F);
        this.backleftleg4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3098F, -0.2685F, -0.243F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 1, 52, -1.75F, -1.5F, -1.5F, 3, 6, 2, 0.0F, false));

        this.backleftleg5 = new ModelRenderer(this);
        this.backleftleg5.setRotationPoint(1.3701F, 5.2205F, -3.661F);
        this.backleftleg4.addChild(backleftleg5);
        this.setRotateAngle(backleftleg5, 0.1231F, -0.0447F, 0.3463F);
        this.backleftleg5.cubeList.add(new ModelBox(backleftleg5, 64, 62, 0.5F, -0.2444F, 0.2733F, 1, 6, 2, 0.0F, false));
        this.backleftleg5.cubeList.add(new ModelBox(backleftleg5, 38, 62, -1.498F, -0.2389F, 0.3626F, 1, 6, 2, 0.0F, false));

        this.backleftleg6 = new ModelRenderer(this);
        this.backleftleg6.setRotationPoint(0.0F, 5.3556F, 1.4733F);
        this.backleftleg5.addChild(backleftleg6);
        this.setRotateAngle(backleftleg6, -0.3752F, 0.0F, 0.0F);
        this.backleftleg6.cubeList.add(new ModelBox(backleftleg6, 30, 0, -2.5F, -0.4382F, -4.268F, 5, 2, 6, 0.0F, false));

        this.backrightleg4 = new ModelRenderer(this);
        this.backrightleg4.setRotationPoint(-4.6556F, 4.2722F, 8.811F);
        this.lowerbody.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, -0.3927F, 0.0F, 0.3491F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.4003F, 1.1495F, -0.411F);
        this.backrightleg4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3098F, 0.2685F, 0.243F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 51, -1.25F, -1.5F, -1.5F, 3, 6, 2, 0.0F, false));

        this.backrightleg5 = new ModelRenderer(this);
        this.backrightleg5.setRotationPoint(-1.3701F, 5.2205F, -3.661F);
        this.backrightleg4.addChild(backrightleg5);
        this.setRotateAngle(backrightleg5, 0.5158F, 0.0447F, -0.3463F);
        this.backrightleg5.cubeList.add(new ModelBox(backrightleg5, 31, 62, -1.5F, -0.2444F, 0.2733F, 1, 6, 2, 0.0F, false));
        this.backrightleg5.cubeList.add(new ModelBox(backrightleg5, 50, 60, 0.498F, -0.2389F, 0.3626F, 1, 6, 2, 0.0F, false));

        this.backrightleg6 = new ModelRenderer(this);
        this.backrightleg6.setRotationPoint(0.0F, 5.3556F, 1.8733F);
        this.backrightleg5.addChild(backrightleg6);
        this.setRotateAngle(backrightleg6, 0.3403F, 0.0F, 0.0F);
        this.backrightleg6.cubeList.add(new ModelBox(backrightleg6, 19, 26, -2.5F, -0.386F, -4.6646F, 5, 2, 6, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.8456F, 12.2224F);
        this.lowerbody.addChild(tail);
        this.setRotateAngle(tail, -0.394F, -0.0806F, 0.0335F);
        this.tail.cubeList.add(new ModelBox(tail, 28, 55, -1.0F, -0.5584F, -0.5222F, 2, 2, 4, -0.003F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -0.1546F, -3.4651F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, -0.1309F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 29, -1.985F, -0.249F, 5.7599F, 2, 0, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 25, -2.985F, -0.249F, 3.7599F, 3, 0, 1, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -0.1546F, -3.4651F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.1309F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 29, -0.015F, -0.249F, 5.7599F, 2, 0, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 25, -0.015F, -0.249F, 3.7599F, 3, 0, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1061F, 3.4272F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.257F, -0.5522F, 0.137F);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 43, -0.5F, -0.2512F, -0.3276F, 1, 1, 4, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.4488F, 3.6724F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1392F, -0.346F, 0.0475F);
        this.tail3.cubeList.add(new ModelBox(tail3, 11, 42, -0.5F, -0.6847F, -0.0457F, 1, 1, 4, 0.003F, false));

        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.5F, 0.4F, 6.7F);
        this.lowerbody.addChild(upperbody);
        this.setRotateAngle(upperbody, 0.0F, -0.0873F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5F, -0.2394F, -11.7896F);
        this.upperbody.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 51, 70, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 51, 70, 2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-5.1479F, 0.889F, -11.6646F);
        this.upperbody.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.037F, 0.0791F, -1.133F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 70, -1.9991F, 0.0154F, -0.5261F, 2, 0, 1, 0.0F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5F, -0.2394F, -11.7896F);
        this.upperbody.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0715F, 0.05F, -0.6091F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 45, 69, -3.6383F, -1.1472F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5224F, 0.0545F, -13.7201F);
        this.upperbody.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0715F, 0.05F, -0.6091F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 69, -3.6199F, -1.1343F, -0.5697F, 2, 0, 1, 0.0F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5224F, 0.0545F, -13.7201F);
        this.upperbody.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.037F, 0.0791F, -1.133F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 2, -3.56F, -2.7907F, -0.5697F, 1, 0, 1, 0.0F, true));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5224F, 0.0545F, -13.7201F);
        this.upperbody.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 69, 8, -1.9776F, 0.0F, -0.5697F, 2, 0, 1, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 69, 8, 2.0224F, 0.0F, -0.5697F, 2, 0, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, 0.3606F, -15.7896F);
        this.upperbody.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1074F, 0.0749F, -0.6068F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 70, 53, -3.6383F, -1.1472F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, 0.3606F, -15.7896F);
        this.upperbody.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 70, 70, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 70, 70, 2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5224F, 0.0545F, -13.7201F);
        this.upperbody.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0715F, -0.05F, 0.6091F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 19, 69, 1.6199F, -1.1343F, -0.5697F, 2, 0, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5224F, 0.0545F, -13.7201F);
        this.upperbody.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.037F, -0.0791F, 1.133F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 2, 2.56F, -2.7907F, -0.5697F, 1, 0, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -0.2394F, -11.7896F);
        this.upperbody.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0715F, -0.05F, 0.6091F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 45, 69, 1.6383F, -1.1472F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(4.1479F, 0.889F, -11.6646F);
        this.upperbody.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.037F, -0.0791F, 1.133F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 25, 70, -0.0009F, 0.0154F, -0.5261F, 2, 0, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.3606F, -15.7896F);
        this.upperbody.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1074F, -0.0749F, 0.6068F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 70, 53, 1.6383F, -1.1472F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -1.2F, -12.0F);
        this.upperbody.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1745F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 7, 15, -0.5F, -0.7F, -0.5F, 1, 2, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 7, 0, -0.5F, -0.7F, -4.5F, 1, 2, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 14, 67, -0.5F, -0.7F, -2.5F, 1, 2, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.2477F, 6.6285F, -17.3467F);
        this.upperbody.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 1.2949F, 0.163F, 0.2527F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 66, 38, -2.6464F, -0.5974F, -1.06F, 3, 1, 1, 0.002F, true));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.2477F, 6.6285F, -17.3467F);
        this.upperbody.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.3885F, 0.2637F, 0.6874F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 66, 29, -4.99F, -0.5974F, -2.1856F, 3, 1, 1, 0.0F, true));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-8.0F, 0.0995F, -11.7067F);
        this.upperbody.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 1.0971F, -0.0803F, -0.1551F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 63, 7, -0.1674F, -1.0954F, -2.6891F, 1, 3, 3, 0.0F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-8.0F, 0.0995F, -11.7067F);
        this.upperbody.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 1.1382F, -0.2149F, -0.4326F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 17, 43, -1.0139F, -1.0954F, -8.5267F, 1, 3, 6, -0.002F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-5.1573F, 6.9845F, -14.8346F);
        this.upperbody.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 1.0943F, 0.0603F, 0.1163F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 62, 33, 0.1514F, -1.5F, -0.5158F, 4, 3, 1, 0.0F, true));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.2477F, 6.6285F, -17.3467F);
        this.upperbody.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 1.3885F, -0.2637F, -0.6874F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 66, 29, 1.99F, -0.5974F, -2.1856F, 3, 1, 1, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.2477F, 6.6285F, -17.3467F);
        this.upperbody.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 1.2949F, -0.163F, -0.2527F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 66, 38, -0.3536F, -0.5974F, -1.06F, 3, 1, 1, 0.002F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.4523F, 7.3061F, -15.5657F);
        this.upperbody.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 1.2632F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 47, 0, -2.5F, -2.0F, -1.0F, 5, 1, 1, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 11, 29, -0.5F, -1.0F, -1.0F, 1, 3, 1, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(4.1573F, 6.9845F, -14.8346F);
        this.upperbody.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 1.0943F, -0.0603F, -0.1163F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 62, 33, -4.1514F, -1.5F, -0.5158F, 4, 3, 1, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(7.0F, 0.0995F, -11.7067F);
        this.upperbody.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 1.1382F, 0.2149F, 0.4326F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 17, 43, 0.0139F, -1.0954F, -8.5267F, 1, 3, 6, -0.002F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(7.0F, 0.0995F, -11.7067F);
        this.upperbody.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 1.0971F, 0.0803F, 0.1551F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 63, 7, -0.8326F, -1.0954F, -2.6891F, 1, 3, 3, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, -1.5F, -12.0F);
        this.upperbody.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1309F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 48, 4, -1.0F, 0.35F, -4.5F, 2, 2, 5, 0.0F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-3.5F, -2.0F, -14.5F);
        this.upperbody.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1309F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 58, 0, 0.0F, 0.0F, -2.75F, 0, 1, 5, 0.0F, true));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 57, 55, 2.0F, -0.25F, -2.75F, 0, 1, 5, 0.0F, true));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 57, 55, 4.0F, -0.25F, -2.75F, 0, 1, 5, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 58, 0, 6.0F, 0.0F, -2.75F, 0, 1, 5, 0.0F, false));

        this.frontleftleg = new ModelRenderer(this);
        this.frontleftleg.setRotationPoint(3.7982F, 6.9496F, -13.1008F);
        this.upperbody.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.4363F, -0.4363F, -0.1309F);


        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(3.2018F, -5.8501F, 1.3941F);
        this.frontleftleg.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1352F, -0.2044F, 0.3401F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 62, 24, 1.2851F, 5.8155F, -1.4525F, 3, 2, 2, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 53, 17, -1.7149F, 5.8155F, -2.4525F, 3, 2, 4, 0.0F, false));

        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(3.7018F, 2.4867F, 0.9371F);
        this.frontleftleg.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.1298F, -0.017F, 0.1298F);


        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(1.55F, 1.715F, -0.8726F);
        this.frontleftleg3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.4996F, -0.27F, 0.1446F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 57, 62, -0.05F, -4.0F, -0.6F, 2, 7, 1, -0.01F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 45, 62, -1.45F, -2.0F, -1.0F, 1, 5, 1, -0.01F, false));

        this.frontleftleg7 = new ModelRenderer(this);
        this.frontleftleg7.setRotationPoint(0.7F, 3.5373F, -1.5062F);
        this.frontleftleg3.addChild(frontleftleg7);
        this.setRotateAngle(frontleftleg7, 0.0873F, 0.0F, 0.0F);


        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.5F, -12.8741F, 0.9632F);
        this.frontleftleg7.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.48F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 36, 21, 0.0F, 12.1718F, 1.6342F, 5, 2, 5, -0.01F, false));

        this.frontrightleg = new ModelRenderer(this);
        this.frontrightleg.setRotationPoint(-4.7982F, 6.9496F, -13.1008F);
        this.upperbody.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.0F, 0.0F, 0.1309F);


        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-3.2018F, -5.8501F, 1.3941F);
        this.frontrightleg.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1352F, 0.2044F, -0.3401F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 17, 7, -4.2851F, 5.8155F, -1.4525F, 3, 2, 2, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 13, 53, -1.2851F, 5.8155F, -2.4525F, 3, 2, 4, 0.0F, false));

        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(-3.7018F, 2.4867F, 0.9371F);
        this.frontrightleg.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.1298F, 0.017F, -0.1298F);


        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.55F, 1.715F, -0.8726F);
        this.frontrightleg3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.4996F, 0.27F, -0.1446F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 61, -1.95F, -4.0F, -0.6F, 2, 7, 1, -0.01F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 29, 0.45F, -2.0F, -1.0F, 1, 5, 1, -0.01F, false));

        this.frontrightleg7 = new ModelRenderer(this);
        this.frontrightleg7.setRotationPoint(-0.7F, 3.5373F, -1.5062F);
        this.frontrightleg3.addChild(frontrightleg7);
        this.setRotateAngle(frontrightleg7, 0.3491F, 0.0F, 0.0F);


        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(1.5F, -12.8741F, 0.9632F);
        this.frontrightleg7.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.48F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 19, 35, -5.0F, 12.1718F, 1.6342F, 5, 2, 5, -0.01F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, 0.3378F, -16.0246F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, 0.1372F, -0.3027F, -0.0411F);
        this.neck.cubeList.add(new ModelBox(neck, 34, 38, -1.0F, -1.0149F, -5.8271F, 2, 2, 6, -0.01F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.0F, 0.0666F, -1.3848F);
        this.neck.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1309F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 19, 37, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 19, 37, 2.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.4895F, -0.6957F, -4.1257F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.0005F, -0.0865F, 0.0114F);
        this.head.cubeList.add(new ModelBox(head, 13, 17, -3.5105F, -0.9691F, -3.7014F, 8, 4, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 64, 0, -3.2605F, -1.7191F, -3.7014F, 2, 1, 2, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 37, 55, 2.2395F, -1.7191F, -3.7014F, 2, 1, 2, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 38, 13, -2.0105F, 0.0452F, -7.2014F, 5, 3, 4, 0.01F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(3.4895F, 1.556F, -3.7233F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.3042F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 53, 25, -1.3789F, -1.5107F, -3.2613F, 2, 3, 4, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-2.5105F, 1.556F, -3.7233F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, -0.3042F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 53, 34, -0.6211F, -1.5107F, -3.2613F, 2, 3, 4, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(0.4895F, -0.7096F, -3.8545F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1309F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 38, 31, -2.5F, -0.0446F, -3.2927F, 5, 2, 4, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(1.4895F, -0.1741F, -6.3486F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.3806F, -0.0992F, 0.2427F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 13, 71, 0.25F, -1.25F, -0.5F, 1, 2, 1, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.5105F, -0.1741F, -6.3486F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.3806F, 0.0992F, -0.2427F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 71, 13, -1.25F, -1.25F, -0.5F, 1, 2, 1, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(5.2895F, 0.5623F, 10.7409F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.3778F, 0.1105F, 0.2858F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 63, 54, -1.9377F, 1.6079F, -11.7822F, 2, 3, 2, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(-3.0105F, -1.9691F, -0.7014F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.3778F, -0.1105F, -0.2858F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 64, 15, -0.75F, -0.75F, -0.25F, 2, 3, 2, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.4895F, 3.0407F, 0.3169F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3927F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 60, 3.0F, -0.0099F, -4.0184F, 1, 2, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 17, 0, 2.4F, -0.0099F, -4.0184F, 1, 2, 4, -0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 60, -4.0F, -0.0099F, -4.0184F, 1, 2, 4, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 17, 0, -3.4F, -0.0099F, -4.0184F, 1, 2, 4, -0.002F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 9, -2.5F, 0.0045F, -7.5184F, 5, 2, 1, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(-3.5F, 1.4901F, -3.5184F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.6545F, 0.0F, 0.5236F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 7, 67, -0.25F, 0.25F, -0.25F, 1, 2, 2, 0.0F, true));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(-3.0F, -1.4848F, -4.0402F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, -0.3042F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 9, 60, -0.6211F, 1.4893F, -3.2613F, 1, 2, 4, -0.01F, true));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(3.0F, -1.4848F, -4.0402F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.3042F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 9, 60, -0.3789F, 1.4893F, -3.2613F, 1, 2, 4, -0.01F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(3.5F, 1.4901F, -3.5184F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.6545F, 0.0F, -0.5236F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 7, 67, -0.75F, 0.25F, -0.25F, 1, 2, 2, 0.0F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 2.4901F, -3.9184F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.5131F, -0.3463F, 0.189F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 18, 1, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, 2.4901F, -3.9184F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.5131F, 0.3463F, -0.189F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 18, 1, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cheekbone = new ModelRenderer(this);
        this.cheekbone.setRotationPoint(-3.5105F, 1.7809F, -2.2014F);
        this.head.addChild(cheekbone);
        this.setRotateAngle(cheekbone, 0.0287F, 0.2267F, -0.1291F);


        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-1.3554F, 1.1895F, 0.0F);
        this.cheekbone.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.6545F, -0.5672F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 58, 42, -1.7037F, -0.8007F, -1.25F, 3, 1, 3, -0.01F, false));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(-1.0F, 0.5F, 0.0F);
        this.cheekbone.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, 0.0F, -0.3054F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 32, 47, -0.5F, -0.75F, -2.0F, 3, 2, 5, -0.01F, false));

        this.cheekbone2 = new ModelRenderer(this);
        this.cheekbone2.setRotationPoint(4.4895F, 1.7809F, -2.2014F);
        this.head.addChild(cheekbone2);
        this.setRotateAngle(cheekbone2, 0.0287F, -0.2267F, 0.1291F);


        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(1.3554F, 1.1895F, 0.0F);
        this.cheekbone2.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, -0.6545F, 0.5672F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 53, 12, -1.2963F, -0.8007F, -1.25F, 3, 1, 3, -0.01F, false));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(1.0F, 0.5F, 0.0F);
        this.cheekbone2.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, 0.0F, 0.3054F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 46, 42, -2.5F, -0.75F, -2.0F, 3, 2, 5, -0.01F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-0.5F, 9.0F, -8.5F);
        this.upperbody.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 16, 60, -0.5F, -11.2F, -2.0F, 1, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 24, 53, -0.5F, -11.2F, 0.0F, 1, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 45, 38, -0.5F, -11.2F, 2.0F, 1, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 43, 9, -0.5F, -11.2F, 6.0F, 1, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 42, -0.5F, -11.2F, 4.0F, 1, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 69, 62, 1.0F, -9.2394F, -1.7896F, 2, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 69, 4, 1.0F, -9.2394F, 0.2104F, 2, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 68, 47, 1.0F, -9.2394F, 2.2104F, 2, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 68, 41, 1.0F, -9.2394F, 4.2104F, 2, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 58, 7, 1.0F, -9.2394F, 6.2104F, 2, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 69, 62, -3.0F, -9.2394F, -1.7896F, 2, 0, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 69, 4, -3.0F, -9.2394F, 0.2104F, 2, 0, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 68, 47, -3.0F, -9.2394F, 2.2104F, 2, 0, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 68, 41, -3.0F, -9.2394F, 4.2104F, 2, 0, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 58, 7, -3.0F, -9.2394F, 6.2104F, 2, 0, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 17, 3, 3.0F, -11.5F, -3.5F, 0, 1, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 15, 0.9F, -11.75F, -3.5F, 0, 1, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 15, -0.9F, -11.75F, -3.5F, 0, 1, 12, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 17, 3, -3.0F, -11.5F, -3.5F, 0, 1, 12, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -10.2F, -3.5F, 2, 2, 12, 0.003F, false));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(-4.8F, -8.4394F, 6.7104F);
        this.body.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, 0.0F, -1.0632F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 68, 21, -2.0415F, 0.0168F, -0.5F, 2, 0, 1, 0.0F, true));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 0, 23, -4.0415F, 0.0168F, -2.5F, 4, 0, 1, 0.0F, true));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 36, 29, -5.0415F, 0.0168F, -4.5F, 5, 0, 1, 0.0F, true));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 24, 0, -4.0415F, 0.0168F, -6.5F, 4, 0, 1, 0.0F, true));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 30, 13, -3.0415F, 0.0168F, -8.5F, 3, 0, 1, 0.0F, true));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(-3.0F, -9.2394F, 6.7104F);
        this.body.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0F, 0.0F, -0.4363F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 19, 67, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 68, 43, -2.0F, 0.0F, -2.5F, 2, 0, 1, 0.0F, true));
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 68, 60, -2.0F, 0.0F, -4.5F, 2, 0, 1, 0.0F, true));
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 69, 6, -2.0F, 0.0F, -6.5F, 2, 0, 1, 0.0F, true));
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 70, -2.0F, 0.0F, -8.5F, 2, 0, 1, 0.0F, true));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(4.8F, -8.4394F, 6.7104F);
        this.body.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, 0.0F, 1.0632F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 68, 21, 0.0415F, 0.0168F, -0.5F, 2, 0, 1, 0.0F, false));
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 23, 0.0415F, 0.0168F, -2.5F, 4, 0, 1, 0.0F, false));
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 36, 29, 0.0415F, 0.0168F, -4.5F, 5, 0, 1, 0.0F, false));
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 24, 0, 0.0415F, 0.0168F, -6.5F, 4, 0, 1, 0.0F, false));
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 30, 13, 0.0415F, 0.0168F, -8.5F, 3, 0, 1, 0.0F, false));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(3.0F, -9.2394F, 6.7104F);
        this.body.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, 0.0F, 0.4363F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 19, 67, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 68, 43, 0.0F, 0.0F, -2.5F, 2, 0, 1, 0.0F, false));
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 68, 60, 0.0F, 0.0F, -4.5F, 2, 0, 1, 0.0F, false));
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 69, 6, 0.0F, 0.0F, -6.5F, 2, 0, 1, 0.0F, false));
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 70, 0.0F, 0.0F, -8.5F, 2, 0, 1, 0.0F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, -10.2F, 8.5F);
        this.body.addChild(cube_r66);
        this.setRotateAngle(cube_r66, -0.1309F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 30, 2, -0.5F, -0.9F, -0.5F, 1, 2, 1, 0.0F, false));

    }

    public void renderAll(float f) {
        this.bunostegos.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
