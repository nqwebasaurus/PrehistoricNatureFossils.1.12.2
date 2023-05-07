package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHyperodapedon extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer hyperodapedon;
    private final ModelRenderer hip;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer body;
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
    private final ModelRenderer upperbody;
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
    private final ModelRenderer neck;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer upperjaw;
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
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer frontleftleg;
    private final ModelRenderer frontleftleg2;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer frontrightleg;
    private final ModelRenderer frontrightleg2;
    private final ModelRenderer frontrightleg3;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer cube_r61;
    private final ModelRenderer backleftleg3;
    private final ModelRenderer backrightleg;
    private final ModelRenderer backrightleg2;
    private final ModelRenderer cube_r62;
    private final ModelRenderer backrightleg3;

    public ModelSkeletonHyperodapedon() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hyperodapedon = new ModelRenderer(this);
        this.hyperodapedon.setRotationPoint(0.0F, -7.0F, 5.0F);
        this.fossil.addChild(hyperodapedon);


        this.hip = new ModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.hyperodapedon.addChild(hip);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.4F, 2.3041F, 6.8431F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5498F, 0.0F, -0.3927F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 39, -0.5F, -0.5625F, -1.6713F, 1, 3, 1, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.7F, 4.3F);
        this.hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1484F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 33, -1.7F, 1.3485F, 1.1334F, 1, 1, 3, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 30, -1.7F, 0.3485F, 0.9334F, 1, 1, 4, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 16, -0.7F, 0.5485F, 0.9334F, 1, 1, 4, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 16, 0.7F, 0.5485F, 0.9334F, 1, 1, 4, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 30, 1.7F, 0.3485F, 0.9334F, 1, 1, 4, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 33, 1.7F, 1.3485F, 1.1334F, 1, 1, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 28, 0.0F, -0.1515F, -0.0666F, 1, 1, 5, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.4F, 2.3041F, 6.8431F);
        this.hip.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.0734F, 0.0F, -0.3927F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 5, -0.5F, -1.258F, -0.6447F, 1, 2, 3, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.4F, 2.3041F, 6.8431F);
        this.hip.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5498F, 0.0F, 0.3927F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 39, -0.5F, -0.5625F, -1.6713F, 1, 3, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(1.4F, 2.3041F, 6.8431F);
        this.hip.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.0734F, 0.0F, 0.3927F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 33, 5, -0.5F, -1.258F, -0.6447F, 1, 2, 3, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.3F, -0.2731F, 4.8429F);
        this.hip.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0276F, 0.219F, -0.2684F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 11, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.3F, -0.2731F, 4.8429F);
        this.hip.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0276F, -0.219F, 0.2684F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 11, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.3042F, 8.7284F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.3957F, 0.1209F, -0.0503F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 20, -0.5F, -0.4888F, -0.0553F, 1, 1, 7, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.0655F, 1.1743F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2027F, 0.5052F, -0.4015F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 37, -2.4246F, -0.5074F, 3.3272F, 1, 0, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 8, -1.8246F, -0.2074F, 1.3272F, 1, 0, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 0, -1.6246F, -0.0074F, -0.6728F, 2, 0, 1, 0.0F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.0655F, 1.1743F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2027F, -0.5052F, 0.4015F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 41, 37, 1.4246F, -0.5074F, 3.3272F, 1, 0, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 8, 0.8246F, -0.2074F, 1.3272F, 1, 0, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 0, -0.3754F, -0.0074F, -0.6728F, 2, 0, 1, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.5112F, 1.4447F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7505F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 28, 0.0F, 2.7755F, 3.1066F, 0, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 22, 0.0F, 1.0751F, 1.2333F, 0, 2, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 29, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2388F, 6.9447F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0804F, 0.2175F, 0.0174F);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 0, -0.5F, -0.1813F, -0.0845F, 1, 1, 6, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3246F, 5.6703F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1481F, -0.4754F, -0.0787F);
        this.tail3.cubeList.add(new ModelBox(tail3, 12, 13, -0.4925F, -0.4953F, -0.2099F, 1, 1, 7, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.4F, 4.15F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 10, -0.5F, -0.45F, -7.9F, 1, 1, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, 3.55F, -7.9F, 5, 1, 8, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.3F, 0.1269F, -1.3071F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0894F, 0.1933F, -0.8469F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 16, -2.8434F, -0.5373F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.3F, 0.1269F, -1.3071F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.03F, 0.2106F, -0.2679F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 8, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.4F, 0.1269F, -3.3071F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1229F, 0.222F, -0.8538F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 10, -4.8434F, -0.5373F, -0.5F, 4, 0, 1, 0.0F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.4F, 0.1269F, -3.3071F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.018F, 0.2527F, -0.2706F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 40, 19, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.4F, 0.1269F, -5.3071F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0894F, 0.1933F, -0.8469F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 30, -4.8434F, -0.5373F, -0.5F, 4, 0, 1, 0.0F, true));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.4F, 0.1269F, -5.3071F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.03F, 0.2106F, -0.2679F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 40, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.4F, 0.1269F, -7.3071F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1229F, 0.222F, -0.8538F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 33, 11, -4.8434F, -0.5373F, -0.5F, 4, 0, 1, 0.0F, true));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.4F, 0.1269F, -7.3071F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.018F, 0.2527F, -0.2706F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 40, 28, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.3F, 0.1269F, -1.3071F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0894F, -0.1933F, 0.8469F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 11, 16, 0.8434F, -0.5373F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.3F, 0.1269F, -1.3071F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.03F, -0.2106F, 0.2679F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 27, 8, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.4F, 0.1269F, -3.3071F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.018F, -0.2527F, 0.2706F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 19, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.4F, 0.1269F, -3.3071F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1229F, -0.222F, 0.8538F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 11, 10, 0.8434F, -0.5373F, -0.5F, 4, 0, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.4F, 0.1269F, -5.3071F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.03F, -0.2106F, 0.2679F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 23, 40, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.4F, 0.1269F, -5.3071F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0894F, -0.1933F, 0.8469F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 32, 30, 0.8434F, -0.5373F, -0.5F, 4, 0, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.4F, 0.1269F, -7.3071F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1229F, -0.222F, 0.8538F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 33, 11, 0.8434F, -0.5373F, -0.5F, 4, 0, 1, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.4F, 0.1269F, -7.3071F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.018F, -0.2527F, 0.2706F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 40, 28, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -0.1F, -8.1F);
        this.body.addChild(upperbody);
        this.setRotateAngle(upperbody, 0.0F, -0.0873F, 0.0F);


        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.4F, 0.2269F, -1.2071F);
        this.upperbody.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1913F, 0.2789F, -0.8708F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 36, 15, -3.8434F, -0.5373F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.4F, 0.2269F, -1.2071F);
        this.upperbody.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0067F, 0.3367F, -0.2778F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 41, 2, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.3F, 0.3269F, -3.2071F);
        this.upperbody.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.3732F, 0.4145F, -0.9329F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 24, -2.8434F, -0.5373F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.3F, 0.3269F, -3.2071F);
        this.upperbody.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0761F, 0.5457F, -0.3076F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 27, 41, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-3.5F, 3.4F, -3.3F);
        this.upperbody.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 1.3541F, 0.0677F, 0.2981F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 20, 28, 0.0F, -0.467F, 0.3466F, 1, 1, 3, -0.002F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 7, 29, 0.0F, -0.467F, -0.2534F, 3, 2, 1, 0.0F, true));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.4F, 0.2269F, -1.2071F);
        this.upperbody.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0067F, -0.3367F, 0.2778F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 41, 2, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.4F, 0.2269F, -1.2071F);
        this.upperbody.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1913F, -0.2789F, 0.8708F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 36, 15, 0.8434F, -0.5373F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.3F, 0.3269F, -3.2071F);
        this.upperbody.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3732F, -0.4145F, 0.9329F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 24, 0.8434F, -0.5373F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.3F, 0.3269F, -3.2071F);
        this.upperbody.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0761F, -0.5457F, 0.3076F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 27, 41, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(3.5F, 3.4F, -3.3F);
        this.upperbody.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 1.3541F, -0.0677F, -0.2981F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 7, 29, -3.0F, -0.467F, -0.2534F, 3, 2, 1, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 20, 28, -1.0F, -0.467F, 0.3466F, 1, 1, 3, -0.002F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, -0.2F, -1.8F);
        this.upperbody.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0873F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 28, 0, -2.0F, 3.6F, -0.6F, 3, 1, 3, 0.0F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, -0.2F, -1.8F);
        this.upperbody.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0873F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 27, 23, -1.0F, 0.0F, -3.0F, 1, 1, 5, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.3F, -4.3F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, 0.1473F, -0.4755F, -0.0678F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 29, -0.5F, -0.2929F, -3.9149F, 1, 1, 4, -0.01F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.5F, 0.4071F, -2.4149F);
        this.neck.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.4905F, 0.678F, -0.5476F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 36, 17, -4.1555F, 0.6898F, 1.0352F, 3, 0, 1, 0.0F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 37, 13, -2.0F, 0.1F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.403F, 0.6005F, -0.7081F);
        this.neck.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.4905F, -0.678F, 0.5476F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 36, 17, 0.071F, -0.1213F, -0.0259F, 3, 0, 1, 0.0F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, 0.4071F, -2.4149F);
        this.neck.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.4905F, -0.678F, 0.5476F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 37, 13, 0.0F, 0.1F, -0.5F, 2, 0, 1, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.0909F, 0.4052F, -3.4108F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.6522F, -0.6505F, 0.0905F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0909F, 1.3568F, -0.4105F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.3054F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 25, 36, 1.5F, 0.0F, -2.0F, 1, 1, 2, 0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 36, 25, -1.0F, 0.0F, -4.0F, 2, 1, 1, -0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 25, 36, -2.5F, 0.0F, -2.0F, 1, 1, 2, 0.01F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-2.5F, 0.5F, -2.0F);
        this.lowerjaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -0.6109F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 14, 0.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.0F, -0.5F, -3.75F);
        this.lowerjaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.7418F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 28, 0, 0.25F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 28, 0, 1.75F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(2.5F, 0.5F, -2.0F);
        this.lowerjaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.6109F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 14, -1.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 1.3568F, -0.4105F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, -0.5236F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 18, 35, 2.2909F, -0.81F, -2.1F, 1, 1, 2, -0.2F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 20, 2.2909F, -2.21F, -2.1F, 1, 1, 2, -0.2F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 20, -3.1091F, -2.21F, -2.1F, 1, 1, 2, -0.2F, true));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 18, 35, -3.1091F, -0.81F, -2.1F, 1, 1, 2, -0.2F, true));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-2.9091F, -0.75F, 0.0F);
        this.upperjaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.192F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 9, 35, 0.0F, -1.26F, -0.4F, 3, 2, 1, -0.003F, true));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-2.7091F, -0.8949F, -1.9581F);
        this.upperjaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1339F, -0.8595F, -0.1017F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 0, -0.1534F, -1.1046F, -1.8458F, 1, 2, 2, -0.01F, true));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(2.8909F, -0.8949F, -1.9581F);
        this.upperjaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1339F, 0.8595F, 0.1017F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 0, -0.8466F, -1.1046F, -1.8458F, 1, 2, 2, -0.01F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.5591F, -0.7475F, -4.7456F);
        this.upperjaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.2587F, -0.0405F, -0.1518F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 39, 32, -0.3922F, -0.2202F, -0.4051F, 1, 2, 1, -0.2F, true));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.8409F, -1.4475F, -4.2456F);
        this.upperjaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -1.0226F, -0.1445F, -0.0983F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 40, -1.9427F, -1.065F, -0.087F, 1, 2, 1, -0.2F, true));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.6591F, -1.4475F, -4.2456F);
        this.upperjaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -1.0226F, 0.1445F, 0.0983F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 40, 0.9427F, -1.065F, -0.087F, 1, 2, 1, -0.2F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.7409F, -0.7475F, -4.7456F);
        this.upperjaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.2587F, 0.0405F, 0.1518F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 39, 32, -0.6078F, -0.2202F, -0.4051F, 1, 2, 1, -0.2F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0909F, 0.2F, -4.4F);
        this.upperjaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.2094F, -0.384F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 10, -0.8127F, -0.3918F, 1.3048F, 1, 1, 2, 0.0F, true));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0909F, 0.2F, -4.4F);
        this.upperjaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.192F, -0.384F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 39, 5, -0.8127F, -0.9798F, 0.4097F, 1, 1, 1, 0.0F, true));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0909F, 0.2F, -4.4F);
        this.upperjaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.2094F, 0.384F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 10, -0.1873F, -0.3918F, 1.3048F, 1, 1, 2, 0.0F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0909F, 0.2F, -4.4F);
        this.upperjaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.192F, 0.384F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 39, 5, -0.1873F, -0.9798F, 0.4097F, 1, 1, 1, 0.0F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0909F, -2.0F, -2.0F);
        this.upperjaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0873F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 1, 5, -1.0F, 0.939F, -2.9473F, 1, 1, 1, -0.2F, true));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 1, 5, 0.0F, 0.939F, -2.9473F, 1, 1, 1, -0.2F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0909F, -2.1F, -2.2F);
        this.upperjaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.1222F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 11, 12, -1.0F, 0.2349F, 0.8428F, 2, 2, 1, 0.001F, false));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 22, 16, -1.0F, -0.1651F, -0.0572F, 2, 1, 2, 0.0F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0909F, -1.5F, -4.2F);
        this.upperjaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.3665F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 10, 22, -1.5F, 0.0002F, 0.0265F, 3, 1, 2, 0.0F, false));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0909F, -1.8F, -4.2F);
        this.upperjaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0873F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 35, 22, -1.5F, 0.9925F, -0.0409F, 3, 1, 1, -0.002F, false));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(3.0909F, -0.75F, 0.0F);
        this.upperjaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, -0.192F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 9, 35, -3.0F, -1.26F, -0.4F, 3, 2, 1, -0.003F, false));

        this.frontleftleg = new ModelRenderer(this);
        this.frontleftleg.setRotationPoint(3.3F, 2.75F, -2.9F);
        this.upperbody.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.0F, 0.6545F, 0.0F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 0, 35, -0.3473F, 0.0F, -0.0385F, 1, 1, 3, 0.0F, false));

        this.frontleftleg2 = new ModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.5527F, -0.1F, 3.2115F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.1309F, -0.6109F, 0.0F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 13, 39, -0.8108F, 0.0596F, -0.3134F, 1, 3, 1, 0.0F, false));
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 8, 39, -1.8108F, -0.0404F, -0.3134F, 1, 3, 1, -0.2F, false));

        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(-1.3108F, 3.0596F, 0.1866F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.1392F, -0.346F, 0.0475F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 17, 22, -1.0F, -0.25F, -3.75F, 3, 1, 4, 0.0F, false));

        this.frontrightleg = new ModelRenderer(this);
        this.frontrightleg.setRotationPoint(-3.3F, 2.75F, -2.9F);
        this.upperbody.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.0F, -1.3526F, 0.0F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 0, 35, -0.6527F, 0.0F, -0.0385F, 1, 1, 3, 0.0F, true));

        this.frontrightleg2 = new ModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-0.5527F, -0.1F, 3.2115F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.7299F, 0.9558F, 0.0774F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 13, 39, -0.1892F, 0.0596F, -0.3134F, 1, 3, 1, 0.0F, true));
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 8, 39, 0.8108F, -0.0404F, -0.3134F, 1, 3, 1, -0.2F, true));

        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(1.3108F, 3.0596F, 0.1866F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.9516F, 0.346F, -0.0475F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 17, 22, -2.0F, -0.25F, -3.75F, 3, 1, 4, 0.0F, true));

        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(2.25F, 1.5F, 6.35F);
        this.hip.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.7681F, -0.1841F, -0.1872F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 37, 38, 0.13F, -0.325F, -0.7172F, 1, 3, 1, 0.0F, false));

        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.38F, 2.675F, -0.2172F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.7734F, -0.1536F, 0.1555F);


        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.backleftleg2.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0873F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 19, 0, 0.1F, -0.75F, -0.45F, 1, 3, 1, -0.2F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 32, 38, -0.4F, -0.75F, -0.95F, 1, 3, 1, 0.0F, false));

        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.0F, 2.0F, 0.75F);
        this.backleftleg2.addChild(backleftleg3);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 22, 10, -1.4F, 0.0F, -3.5F, 3, 1, 4, 0.0F, false));

        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-2.25F, 1.5F, 6.35F);
        this.hip.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.0173F, 0.1841F, 0.1872F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 37, 38, -1.13F, -0.325F, -0.7172F, 1, 3, 1, 0.0F, true));

        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(-0.38F, 2.675F, -0.2172F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 1.2097F, 0.1536F, -0.1555F);


        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.backrightleg2.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0873F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 19, 0, -1.1F, -0.75F, -0.45F, 1, 3, 1, -0.2F, true));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 32, 38, -0.6F, -0.75F, -0.95F, 1, 3, 1, 0.0F, true));

        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.0F, 2.0F, 0.75F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.9599F, 0.0F, 0.0F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 22, 10, -1.6F, 0.0F, -3.5F, 3, 1, 4, 0.0F, true));

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
