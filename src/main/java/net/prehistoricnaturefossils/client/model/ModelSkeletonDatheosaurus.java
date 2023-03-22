package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDatheosaurus extends ModelBase {
    private final ModelRenderer Datheosaurus;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer backleftleg3;
    private final ModelRenderer backrightleg;
    private final ModelRenderer backrightleg2;
    private final ModelRenderer backrightleg3;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer body;
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
    private final ModelRenderer frontrightleg;
    private final ModelRenderer cube_r31;
    private final ModelRenderer frontrightleg2;
    private final ModelRenderer frontrightleg3;
    private final ModelRenderer frontleftleg;
    private final ModelRenderer cube_r32;
    private final ModelRenderer frontleftleg2;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer upperbody;
    private final ModelRenderer head;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer jaw;

    public ModelSkeletonDatheosaurus() {
        this.textureWidth = 47;
        this.textureHeight = 47;

        this.Datheosaurus = new ModelRenderer(this);
        this.Datheosaurus.setRotationPoint(0.0F, 22.5F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(3.0F, -5.15F, -0.7F);
        this.Datheosaurus.addChild(body2);
        this.setRotateAngle(body2, -0.1745F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 13, 29, -3.5F, -0.4483F, 2.7313F, 1, 1, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.8F, -0.1483F, 3.9313F, 1, 1, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 20, 29, -2.8F, -0.1483F, 4.4313F, 1, 1, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 20, 29, -4.1F, -0.1483F, 4.4313F, 1, 1, 2, 0.0F, true));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -5.1F, -0.1483F, 3.9313F, 1, 1, 3, 0.0F, true));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.7F, 0.5517F, 5.9313F);
        this.body2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.5672F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 35, -0.4157F, 0.0537F, -1.0F, 1, 1, 2, -0.003F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.7F, 0.5517F, 5.9313F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.48F, 0.0F, -0.5672F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 0, -0.4157F, -0.0088F, -2.2557F, 1, 1, 2, -0.002F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-4.7F, 0.5517F, 5.9313F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5672F, 0.0F, -0.5672F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 12, -0.4157F, -0.033F, -0.0025F, 1, 2, 2, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.3F, 0.5517F, 5.9313F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.48F, 0.0F, 0.5672F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 0, -0.5F, -0.0565F, -2.2309F, 1, 1, 2, -0.002F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.3F, 0.5517F, 5.9313F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5672F, 0.0F, 0.5672F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 12, -0.5F, -0.0783F, -0.0314F, 1, 2, 2, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.3F, 0.5517F, 5.9313F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.5672F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 35, -0.5F, 0.0F, -1.0F, 1, 1, 2, -0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.5087F, -0.1443F, 1.4618F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.05F, -0.0272F, -0.1724F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 25, -0.9005F, 0.2242F, 1.5203F, 1, 0, 1, 0.0F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.4913F, -0.1443F, 1.4618F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.05F, 0.0272F, 0.1724F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 25, -0.001F, 0.207F, 1.5222F, 1, 0, 1, 0.0F, false));

        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(-1.25F, 1.3093F, 6.3445F);
        this.body2.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.0365F, 0.479F, 0.0995F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 29, 12, -0.0218F, -0.5005F, -0.5F, 4, 1, 1, 0.0F, false));

        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(3.8782F, 0.0495F, 0.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.124F, -0.0408F, -0.0172F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 38, 36, -0.5491F, -0.3002F, 0.0397F, 1, 4, 1, 0.0F, false));
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 5, 34, -0.5491F, -0.3002F, -0.9603F, 1, 4, 1, -0.2F, false));

        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(-0.2624F, 3.9243F, -0.0052F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, 0.0505F, -0.7416F, -0.0363F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 23, 0, -1.4327F, -0.6539F, -3.0241F, 3, 1, 4, 0.0F, false));

        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-4.75F, 1.3093F, 6.3445F);
        this.body2.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.0365F, -0.479F, -0.0995F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 10, 12, -3.9782F, -0.5005F, -0.5F, 4, 1, 1, 0.0F, false));

        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(-3.8782F, 0.0495F, 0.0F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.124F, 0.0408F, 0.0172F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 0, 34, -0.4509F, -0.3002F, 0.0397F, 1, 4, 1, 0.0F, false));
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 13, 0, -0.4509F, -0.3002F, -0.9603F, 1, 4, 1, -0.2F, false));

        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.2624F, 3.9243F, -0.0052F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 0.0505F, 0.7416F, 0.0363F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 0, 21, -1.5673F, -0.6539F, -3.0241F, 3, 1, 4, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-3.0F, -0.0325F, 6.7258F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.0921F, 0.4819F, 0.0655F);
        this.tail.cubeList.add(new ModelBox(tail, 13, 0, -0.4932F, -0.4294F, -0.0512F, 1, 1, 7, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.4932F, 0.0706F, 2.4488F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2182F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 39, 0, -2.0F, 0.0F, 1.5F, 2, 0, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5068F, 0.0706F, 2.4488F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.2182F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 0, 0.0F, 0.0F, 1.5F, 2, 0, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0015F, 0.0203F, 6.7013F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0059F, 0.3923F, -0.0327F);
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 9, -0.4871F, -0.4395F, -0.0115F, 1, 1, 6, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.4871F, 0.0426F, -4.2779F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.2182F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 19, -2.0F, 0.0F, 5.5F, 1, 0, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, -2.0F, 0.0F, 3.5F, 2, 0, 1, 0.0F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5129F, 0.0426F, -4.2779F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.2182F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 19, 1.0F, 0.0F, 5.5F, 1, 0, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 17, 0.0F, 0.0F, 3.5F, 2, 0, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0161F, 0.0571F, 6.0851F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0398F, 0.5667F, 0.0067F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 12, -0.5053F, -0.4593F, -0.1649F, 1, 1, 7, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(-0.0053F, 0.0407F, 6.7351F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0499F, 0.9365F, 0.296F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-2.8913F, 0.0476F, 2.8064F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.134F, -0.2163F, -0.0289F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.1956F, -5.9723F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0524F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 15, -0.6F, -0.6309F, -0.0029F, 1, 1, 6, 0.001F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.6175F, -0.3501F, -3.3663F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0185F, -0.0538F, -0.9144F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 40, 12, -2.8155F, -0.4431F, 1.5203F, 2, 0, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 29, -3.7556F, -0.5354F, -0.499F, 3, 0, 1, 0.0F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.6175F, -0.3501F, -3.3663F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.05F, -0.0272F, -0.1724F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 18, -0.9005F, 0.2242F, 1.5203F, 1, 0, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 16, -0.9187F, 0.1157F, -0.499F, 1, 0, 1, 0.0F, true));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.6175F, -0.2628F, -5.3644F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0241F, 0.0015F, -0.9155F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 17, -4.6763F, -0.5963F, -0.5018F, 4, 0, 1, 0.0F, true));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.6175F, -0.2628F, -5.3644F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0188F, -0.0151F, -0.1739F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 42, 20, -0.9015F, 0.0173F, -0.5018F, 1, 0, 1, 0.0F, true));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.6175F, 0.0115F, -9.3563F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0773F, 0.0707F, -0.9136F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 30, 30, -4.6693F, -0.5559F, 1.5003F, 4, 0, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 40, 14, -2.6763F, -0.5963F, -0.5018F, 2, 0, 1, 0.0F, true));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.6175F, 0.0115F, -9.3563F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1047F, 0.0F, -0.1745F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 32, -0.869F, 0.0424F, 1.5003F, 1, 0, 1, 0.0F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 34, -0.9015F, 0.0173F, -0.5018F, 1, 0, 1, 0.0F, true));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.4F, -0.3501F, -3.3663F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.05F, 0.0272F, 0.1724F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 41, 18, -0.001F, 0.207F, 1.5222F, 1, 0, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 42, 16, 0.0172F, 0.0985F, -0.4972F, 1, 0, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.4F, -0.3501F, -3.3663F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0185F, 0.0538F, 0.9144F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 12, 0.8764F, -0.5223F, 1.5222F, 2, 0, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 8, 29, 0.8165F, -0.6146F, -0.4972F, 3, 0, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.4F, -0.2628F, -5.3644F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0188F, 0.0151F, 0.1739F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 42, 20, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.4F, -0.2628F, -5.3644F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0241F, -0.0015F, 0.9155F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 20, 17, 0.7373F, -0.6756F, -0.5F, 4, 0, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.4F, 0.0115F, -9.3563F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1047F, 0.0F, 0.1745F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 42, 32, -0.0325F, 0.0251F, 1.5021F, 1, 0, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 42, 34, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.4F, 0.0115F, -9.3563F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0773F, -0.0707F, 0.9136F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 30, 0.7303F, -0.6351F, 1.5021F, 4, 0, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 40, 14, 0.7373F, -0.6756F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-3.1175F, 1.8783F, -9.0065F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.0806F, 0.1452F, 0.2186F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 33, 19, -0.1136F, -0.6955F, -1.9967F, 3, 2, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 5, -0.1136F, -0.4955F, -0.9967F, 1, 1, 3, 0.0F, true));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(2.9F, 1.8783F, -9.0065F);
        this.body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 1.0806F, -0.1452F, -0.2186F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 33, 19, -2.6932F, -0.7F, -2.0482F, 3, 2, 1, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 5, -0.6932F, -0.5F, -1.0482F, 1, 1, 3, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.1F, 3.5418F, -8.5132F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.288F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 33, 15, -1.0F, 0.2F, -2.2F, 2, 1, 2, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.1F, 4.1418F, -8.8132F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0785F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 24, 35, -0.5F, -0.4605F, -0.0828F, 1, 1, 2, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.4086F, -10.8482F);
        this.body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1047F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 27, -0.6F, -0.7399F, -0.0052F, 1, 1, 5, 0.0F, false));

        this.frontrightleg = new ModelRenderer(this);
        this.frontrightleg.setRotationPoint(-3.3675F, 2.9848F, -9.2063F);
        this.body.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.2115F, 0.3785F, 0.4982F);


        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5536F, 1.0F, 0.0268F);
        this.frontrightleg.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -0.3927F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 10, 15, -2.0F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 14, 39, -1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F, false));

        this.frontrightleg2 = new ModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-2.6036F, 1.2F, 0.2268F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.1071F, 0.0491F, -0.4898F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 9, 39, -0.2138F, -0.2F, -0.6654F, 1, 3, 1, 0.0F, false));
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 0, 27, 0.7862F, -0.2F, -0.6654F, 1, 3, 1, -0.2F, false));

        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.4991F, 3.1071F, 0.0846F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.1412F, -0.3963F, 0.0013F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 22, 19, -1.5F, -0.5F, -3.0F, 3, 1, 4, -0.01F, false));

        this.frontleftleg = new ModelRenderer(this);
        this.frontleftleg.setRotationPoint(3.15F, 2.9848F, -9.2063F);
        this.body.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.2114F, -0.3767F, -0.4978F);


        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5536F, 1.0F, 0.0268F);
        this.frontleftleg.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, 0.3927F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 17, 35, 1.0F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 40, -1.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F, false));

        this.frontleftleg2 = new ModelRenderer(this);
        this.frontleftleg2.setRotationPoint(2.6036F, 1.2F, 0.2268F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.1071F, -0.0491F, 0.4898F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 26, 39, -0.7862F, -0.2F, -0.6654F, 1, 3, 1, 0.0F, false));
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 21, 39, -1.7862F, -0.2F, -0.6654F, 1, 3, 1, -0.2F, false));

        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(-0.4991F, 3.1071F, 0.0846F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.1412F, 0.3963F, -0.0013F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 11, 23, -1.5F, -0.5F, -3.0F, 3, 1, 4, -0.01F, false));

        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(-0.5382F, 0.0502F, -10.687F);
        this.body.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.0915F, 0.3042F, -0.0275F);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 39, 2, -0.0705F, -0.4416F, -1.9529F, 1, 1, 2, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5382F, 0.0324F, -1.8771F);
        this.upperbody.addChild(head);
        this.setRotateAngle(head, -0.4384F, 0.5378F, 0.0234F);
        this.head.cubeList.add(new ModelBox(head, 26, 25, -2.5F, -0.9997F, -1.9189F, 5, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 29, 7, -2.0F, -0.9997F, -3.9189F, 4, 2, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 21, 10, 1.8F, 0.2257F, -3.6375F, 0, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 42, 8, 1.05F, -0.6255F, -3.7091F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 41, 26, 1.55F, -0.7413F, -1.5909F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 31, 40, 1.55F, -0.3167F, -1.3269F, 1, 1, 1, 0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 42, 8, -2.0675F, -0.6255F, -3.7091F, 1, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 31, 40, -2.5675F, -0.3167F, -1.3269F, 1, 1, 1, 0.002F, true));
        this.head.cubeList.add(new ModelBox(head, 41, 26, -2.5675F, -0.7413F, -1.5909F, 1, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 33, 32, -1.5F, -0.9997F, -4.9189F, 3, 2, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 21, 10, -1.7175F, 0.2257F, -3.6375F, 0, 1, 2, 0.0F, true));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -0.9071F, -4.9421F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3491F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 31, 36, -1.0F, -0.0586F, -0.9199F, 2, 2, 1, 0.01F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.4175F, 0.8664F, -4.2422F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.7854F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 5, 0.25F, -0.6125F, -0.3998F, 0, 1, 1, 0.0F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 0, 0.05F, -0.3625F, -0.1498F, 0, 1, 1, 0.0F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 0, 2.8675F, -0.3625F, -0.1498F, 0, 1, 1, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 5, 2.6675F, -0.6125F, -0.3998F, 0, 1, 1, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0003F, 0.0811F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5672F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 42, 0.5F, 0.0F, -4.75F, 1, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 39, 23, -1.0F, 0.0F, -5.2F, 2, 1, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 30, 1.0F, 0.0F, -3.75F, 1, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 41, 29, 1.0F, 0.0F, -1.05F, 1, 1, 1, 0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 30, -2.0175F, 0.0F, -3.75F, 1, 1, 3, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 41, 29, -2.0175F, 0.0F, -1.05F, 1, 1, 1, 0.003F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 42, -1.5175F, 0.0F, -4.75F, 1, 1, 1, 0.0F, true));

    }

    public void renderAll(float f) {
        this.Datheosaurus.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
