package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonStenokranio extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer hip;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body8_r1;
    private final ModelRenderer body7_r1;
    private final ModelRenderer body8_r2;
    private final ModelRenderer body6_r2;
    private final ModelRenderer body5_r2;
    private final ModelRenderer body7_r2;
    private final ModelRenderer body5_r3;
    private final ModelRenderer body4_r1;
    private final ModelRenderer body8_r3;
    private final ModelRenderer body7_r3;
    private final ModelRenderer tail;
    private final ModelRenderer tail4_r1;
    private final ModelRenderer tail2_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail5_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail7_r1;
    private final ModelRenderer body;
    private final ModelRenderer body5_r4;
    private final ModelRenderer body4_r2;
    private final ModelRenderer body8_r4;
    private final ModelRenderer body7_r4;
    private final ModelRenderer body6_r3;
    private final ModelRenderer body5_r5;
    private final ModelRenderer body6_r4;
    private final ModelRenderer body7_r5;
    private final ModelRenderer body7_r6;
    private final ModelRenderer body8_r5;
    private final ModelRenderer body4_r3;
    private final ModelRenderer body5_r6;
    private final ModelRenderer body6_r5;
    private final ModelRenderer body7_r7;
    private final ModelRenderer body6_r6;
    private final ModelRenderer body5_r7;
    private final ModelRenderer body8_r6;
    private final ModelRenderer body7_r8;
    private final ModelRenderer body6_r7;
    private final ModelRenderer body5_r8;
    private final ModelRenderer body6_r8;
    private final ModelRenderer body7_r9;
    private final ModelRenderer body4_r4;
    private final ModelRenderer body5_r9;
    private final ModelRenderer body6_r9;
    private final ModelRenderer body7_r10;
    private final ModelRenderer body6_r10;
    private final ModelRenderer body5_r10;
    private final ModelRenderer body5_r11;
    private final ModelRenderer body7_r11;
    private final ModelRenderer body6_r11;
    private final ModelRenderer body4_r5;
    private final ModelRenderer body6_r12;
    private final ModelRenderer body5_r12;
    private final ModelRenderer body4_r6;
    private final ModelRenderer body3_r1;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer neck5_r2;
    private final ModelRenderer neck5_r3;
    private final ModelRenderer body4_r7;
    private final ModelRenderer body3_r2;
    private final ModelRenderer body3_r3;
    private final ModelRenderer body2_r1;
    private final ModelRenderer body3_r4;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer neck4_r2;
    private final ModelRenderer neck;
    private final ModelRenderer body8_r7;
    private final ModelRenderer body7_r12;
    private final ModelRenderer body7_r13;
    private final ModelRenderer body6_r13;
    private final ModelRenderer head;
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
    private final ModelRenderer jaw;
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
    private final ModelRenderer eyeright;
    private final ModelRenderer eyeleft;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer armleft;
    private final ModelRenderer armleft2;
    private final ModelRenderer handleft;
    private final ModelRenderer armright;
    private final ModelRenderer armright2;
    private final ModelRenderer handright;
    private final ModelRenderer legleft;
    private final ModelRenderer legleft2;
    private final ModelRenderer footleft;
    private final ModelRenderer legright;
    private final ModelRenderer legright2;
    private final ModelRenderer footright;

    public ModelSkeletonStenokranio() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hip = new ModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.fossil.addChild(hip);
        this.setRotateAngle(hip, 0.0F, -0.3491F, 0.0F);


        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(0.0F, -8.1847F, 6.8393F);
        this.hip.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -0.2138F, 0.0F, 0.0F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 0, 0, 0.0F, -1.0358F, -0.0134F, 0, 1, 1, 0.0F, false));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(0.0F, -8.9847F, 1.8393F);
        this.hip.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -0.144F, 0.0F, 0.0F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 47, 31, 0.0F, -0.9616F, 3.0497F, 0, 1, 1, 0.0F, false));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 38, 47, 0.0F, -0.9616F, 1.0497F, 0, 1, 1, 0.0F, false));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 0, 0, -0.5F, 0.0384F, 0.0497F, 1, 1, 7, 0.0F, false));

        this.body8_r1 = new ModelRenderer(this);
        this.body8_r1.setRotationPoint(-0.4F, -6.4477F, 5.2032F);
        this.hip.addChild(body8_r1);
        this.setRotateAngle(body8_r1, 1.4443F, 0.0F, -0.1745F);
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 43, 16, -1.0209F, -1.5005F, -2.874F, 1, 4, 1, 0.008F, true));

        this.body7_r1 = new ModelRenderer(this);
        this.body7_r1.setRotationPoint(0.4F, -6.4477F, 5.2032F);
        this.hip.addChild(body7_r1);
        this.setRotateAngle(body7_r1, 1.4443F, 0.0F, 0.1745F);
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 43, 16, 0.0209F, -1.5005F, -2.874F, 1, 4, 1, 0.008F, false));

        this.body8_r2 = new ModelRenderer(this);
        this.body8_r2.setRotationPoint(-0.4F, -6.4477F, 5.2032F);
        this.hip.addChild(body8_r2);
        this.setRotateAngle(body8_r2, 0.6414F, 0.0F, -0.1745F);
        this.body8_r2.cubeList.add(new ModelBox(body8_r2, 0, 24, -1.0209F, 0.4271F, -1.6083F, 1, 2, 1, -0.006F, true));
        this.body8_r2.cubeList.add(new ModelBox(body8_r2, 13, 40, -1.0209F, 0.0271F, -0.6083F, 2, 3, 1, 0.005F, true));

        this.body6_r2 = new ModelRenderer(this);
        this.body6_r2.setRotationPoint(-0.4F, -6.4477F, 5.2032F);
        this.hip.addChild(body6_r2);
        this.setRotateAngle(body6_r2, -0.4756F, 0.0F, -0.1745F);
        this.body6_r2.cubeList.add(new ModelBox(body6_r2, 34, 39, -1.0209F, -0.1994F, -0.6213F, 2, 3, 1, -0.003F, true));

        this.body5_r2 = new ModelRenderer(this);
        this.body5_r2.setRotationPoint(-0.4F, -3.4477F, 5.2032F);
        this.hip.addChild(body5_r2);
        this.setRotateAngle(body5_r2, -0.0567F, 0.0F, -0.1745F);
        this.body5_r2.cubeList.add(new ModelBox(body5_r2, 10, 0, -0.5F, -4.9936F, -0.7268F, 1, 3, 1, 0.0F, true));

        this.body7_r2 = new ModelRenderer(this);
        this.body7_r2.setRotationPoint(0.4F, -6.4477F, 5.2032F);
        this.hip.addChild(body7_r2);
        this.setRotateAngle(body7_r2, 0.6414F, 0.0F, 0.1745F);
        this.body7_r2.cubeList.add(new ModelBox(body7_r2, 0, 24, 0.0209F, 0.4271F, -1.6083F, 1, 2, 1, -0.006F, false));
        this.body7_r2.cubeList.add(new ModelBox(body7_r2, 13, 40, -0.9791F, 0.0271F, -0.6083F, 2, 3, 1, 0.005F, false));

        this.body5_r3 = new ModelRenderer(this);
        this.body5_r3.setRotationPoint(0.4F, -6.4477F, 5.2032F);
        this.hip.addChild(body5_r3);
        this.setRotateAngle(body5_r3, -0.4756F, 0.0F, 0.1745F);
        this.body5_r3.cubeList.add(new ModelBox(body5_r3, 34, 39, -0.9791F, -0.1994F, -0.6213F, 2, 3, 1, -0.003F, false));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(0.4F, -3.4477F, 5.2032F);
        this.hip.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -0.0567F, 0.0F, 0.1745F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 10, 0, -0.5F, -4.9936F, -0.7268F, 1, 3, 1, 0.0F, false));

        this.body8_r3 = new ModelRenderer(this);
        this.body8_r3.setRotationPoint(-0.5F, -8.412F, 3.4067F);
        this.hip.addChild(body8_r3);
        this.setRotateAngle(body8_r3, -0.1559F, -0.009F, -0.122F);
        this.body8_r3.cubeList.add(new ModelBox(body8_r3, 29, 18, -1.0181F, 0.1674F, 1.4012F, 1, 0, 1, 0.0F, true));
        this.body8_r3.cubeList.add(new ModelBox(body8_r3, 24, 31, -1.0181F, 0.1674F, -0.5988F, 1, 0, 1, 0.0F, true));

        this.body7_r3 = new ModelRenderer(this);
        this.body7_r3.setRotationPoint(0.5F, -8.412F, 3.4067F);
        this.hip.addChild(body7_r3);
        this.setRotateAngle(body7_r3, -0.1559F, 0.009F, 0.122F);
        this.body7_r3.cubeList.add(new ModelBox(body7_r3, 29, 18, 0.0181F, 0.1674F, 1.4012F, 1, 0, 1, 0.0F, false));
        this.body7_r3.cubeList.add(new ModelBox(body7_r3, 24, 31, 0.0181F, 0.1674F, -0.5988F, 1, 0, 1, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -6.75F, 9.0F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.3981F, -0.1611F, 0.0674F);
        this.tail.cubeList.add(new ModelBox(tail, 26, 12, -0.5F, -1.1007F, -0.5289F, 1, 1, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 31, 38, 0.0F, -1.7007F, 1.4711F, 0, 1, 1, 0.0F, false));

        this.tail4_r1 = new ModelRenderer(this);
        this.tail4_r1.setRotationPoint(0.0F, 0.231F, -0.1208F);
        this.tail.addChild(tail4_r1);
        this.setRotateAngle(tail4_r1, 0.4102F, 0.0F, 0.0F);
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 27, 24, 0.0F, 0.4F, 1.6F, 0, 2, 1, 0.0F, false));
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 0, 31, 0.0F, -0.5F, -0.4F, 0, 1, 1, 0.0F, false));

        this.tail2_r1 = new ModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.0F, -1.1007F, -0.5289F);
        this.tail.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, -0.0698F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 46, 40, 0.0F, -0.8F, 0.0F, 0, 1, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.75F, 3.4F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0915F, -0.3042F, -0.0275F);
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 24, -0.5F, -0.35F, -0.0483F, 1, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 36, 0.0F, -0.9971F, -0.0483F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 6, 31, 0.0F, -0.7971F, 1.9517F, 0, 1, 1, 0.0F, false));

        this.tail5_r1 = new ModelRenderer(this);
        this.tail5_r1.setRotationPoint(0.0F, 0.981F, -3.5208F);
        this.tail2.addChild(tail5_r1);
        this.setRotateAngle(tail5_r1, 0.4102F, 0.0F, 0.0F);
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 18, 18, 0.0F, 0.9F, 3.6F, 0, 2, 1, 0.0F, false));
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 22, 0, 0.0F, 1.9F, 5.6F, 0, 1, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1492F, 3.8629F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1795F, -0.2979F, -0.0761F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 24, -0.5F, -0.2108F, -0.0338F, 1, 1, 5, 0.0F, false));

        this.tail7_r1 = new ModelRenderer(this);
        this.tail7_r1.setRotationPoint(0.0F, 1.1303F, -7.3836F);
        this.tail3.addChild(tail7_r1);
        this.setRotateAngle(tail7_r1, 0.4102F, 0.0F, 0.0F);
        this.tail7_r1.cubeList.add(new ModelBox(tail7_r1, 4, 0, 0.0F, 2.3F, 7.6F, 0, 1, 1, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.0F, 2.0F);
        this.hip.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.2182F, 0.0F);


        this.body5_r4 = new ModelRenderer(this);
        this.body5_r4.setRotationPoint(0.0F, -1.951F, -1.0307F);
        this.body.addChild(body5_r4);
        this.setRotateAngle(body5_r4, -0.0524F, 0.0F, 0.0F);
        this.body5_r4.cubeList.add(new ModelBox(body5_r4, 45, 46, 0.0F, -0.9857F, -0.0828F, 0, 1, 1, 0.0F, false));

        this.body4_r2 = new ModelRenderer(this);
        this.body4_r2.setRotationPoint(0.0F, -1.75F, -6.1F);
        this.body.addChild(body4_r2);
        this.setRotateAngle(body4_r2, 0.0349F, 0.0F, 0.0F);
        this.body4_r2.cubeList.add(new ModelBox(body4_r2, 25, 47, 0.0F, -1.0097F, 2.9905F, 0, 1, 1, 0.0F, false));
        this.body4_r2.cubeList.add(new ModelBox(body4_r2, 28, 47, 0.0F, -1.0097F, 0.9905F, 0, 1, 1, 0.0F, false));
        this.body4_r2.cubeList.add(new ModelBox(body4_r2, 11, 10, -0.5F, -0.0097F, -0.0095F, 1, 1, 6, 0.0F, false));

        this.body8_r4 = new ModelRenderer(this);
        this.body8_r4.setRotationPoint(-0.5F, -1.412F, -0.5933F);
        this.body.addChild(body8_r4);
        this.setRotateAngle(body8_r4, -0.0125F, -0.0326F, -1.0644F);
        this.body8_r4.cubeList.add(new ModelBox(body8_r4, 45, 12, -2.4538F, -1.309F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body7_r4 = new ModelRenderer(this);
        this.body7_r4.setRotationPoint(-0.5F, -1.412F, -0.5933F);
        this.body.addChild(body7_r4);
        this.setRotateAngle(body7_r4, -0.0271F, -0.022F, -0.5408F);
        this.body7_r4.cubeList.add(new ModelBox(body7_r4, 17, 45, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body6_r3 = new ModelRenderer(this);
        this.body6_r3.setRotationPoint(-0.5F, -1.412F, -0.5933F);
        this.body.addChild(body6_r3);
        this.setRotateAngle(body6_r3, -0.0337F, -0.009F, -0.122F);
        this.body6_r3.cubeList.add(new ModelBox(body6_r3, 45, 22, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body5_r5 = new ModelRenderer(this);
        this.body5_r5.setRotationPoint(-0.5F, -1.412F, -2.5933F);
        this.body.addChild(body5_r5);
        this.setRotateAngle(body5_r5, 0.0337F, 0.009F, -0.1395F);
        this.body5_r5.cubeList.add(new ModelBox(body5_r5, 45, 43, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body6_r4 = new ModelRenderer(this);
        this.body6_r4.setRotationPoint(-0.5F, -1.412F, -2.5933F);
        this.body.addChild(body6_r4);
        this.setRotateAngle(body6_r4, 0.0271F, 0.022F, -0.5582F);
        this.body6_r4.cubeList.add(new ModelBox(body6_r4, 45, 27, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body7_r5 = new ModelRenderer(this);
        this.body7_r5.setRotationPoint(-0.5F, -1.412F, -2.5933F);
        this.body.addChild(body7_r5);
        this.setRotateAngle(body7_r5, 0.0125F, 0.0326F, -1.0819F);
        this.body7_r5.cubeList.add(new ModelBox(body7_r5, 16, 8, -3.4538F, -1.309F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body7_r6 = new ModelRenderer(this);
        this.body7_r6.setRotationPoint(-3.1101F, 0.5884F, -4.4736F);
        this.body.addChild(body7_r6);
        this.setRotateAngle(body7_r6, 0.0216F, -0.5182F, -1.0584F);
        this.body7_r6.cubeList.add(new ModelBox(body7_r6, 32, 0, -0.3F, 0.0116F, -0.2F, 1, 0, 1, 0.0F, true));

        this.body8_r5 = new ModelRenderer(this);
        this.body8_r5.setRotationPoint(-3.1101F, 0.6708F, -6.3084F);
        this.body.addChild(body8_r5);
        this.setRotateAngle(body8_r5, 0.0721F, -0.5288F, -1.0872F);
        this.body8_r5.cubeList.add(new ModelBox(body8_r5, 27, 5, -0.2F, 0.0192F, -0.2F, 1, 0, 1, 0.0F, true));

        this.body4_r3 = new ModelRenderer(this);
        this.body4_r3.setRotationPoint(-0.5F, -1.312F, -4.5933F);
        this.body.addChild(body4_r3);
        this.setRotateAngle(body4_r3, 0.0506F, 0.0135F, -0.1044F);
        this.body4_r3.cubeList.add(new ModelBox(body4_r3, 46, 38, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body5_r6 = new ModelRenderer(this);
        this.body5_r6.setRotationPoint(-0.5F, -1.312F, -4.5933F);
        this.body.addChild(body5_r6);
        this.setRotateAngle(body5_r6, 0.0407F, 0.0329F, -0.5229F);
        this.body5_r6.cubeList.add(new ModelBox(body5_r6, 21, 46, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body6_r5 = new ModelRenderer(this);
        this.body6_r5.setRotationPoint(-0.5F, -1.312F, -4.5933F);
        this.body.addChild(body6_r5);
        this.setRotateAngle(body6_r5, 0.0188F, 0.0489F, -1.0467F);
        this.body6_r5.cubeList.add(new ModelBox(body6_r5, 39, 34, -4.4538F, -1.309F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body7_r7 = new ModelRenderer(this);
        this.body7_r7.setRotationPoint(-0.5F, -1.212F, -6.5933F);
        this.body.addChild(body7_r7);
        this.setRotateAngle(body7_r7, 0.0627F, 0.1244F, -1.0429F);
        this.body7_r7.cubeList.add(new ModelBox(body7_r7, 8, 26, -4.4538F, -1.309F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body6_r6 = new ModelRenderer(this);
        this.body6_r6.setRotationPoint(-0.5F, -1.212F, -6.5933F);
        this.body.addChild(body6_r6);
        this.setRotateAngle(body6_r6, 0.1165F, 0.0764F, -0.5188F);
        this.body6_r6.cubeList.add(new ModelBox(body6_r6, 12, 45, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body5_r7 = new ModelRenderer(this);
        this.body5_r7.setRotationPoint(-0.5F, -1.212F, -6.5933F);
        this.body.addChild(body5_r7);
        this.setRotateAngle(body5_r7, 0.1374F, 0.0226F, -0.1028F);
        this.body5_r7.cubeList.add(new ModelBox(body5_r7, 45, 7, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body8_r6 = new ModelRenderer(this);
        this.body8_r6.setRotationPoint(-0.5F, -1.012F, -8.5933F);
        this.body.addChild(body8_r6);
        this.setRotateAngle(body8_r6, 0.1075F, 0.1996F, -1.0357F);
        this.body8_r6.cubeList.add(new ModelBox(body8_r6, 0, 5, -3.4538F, -1.309F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body7_r8 = new ModelRenderer(this);
        this.body7_r8.setRotationPoint(-0.5F, -1.012F, -8.5933F);
        this.body.addChild(body7_r8);
        this.setRotateAngle(body7_r8, 0.1928F, 0.1194F, -0.5113F);
        this.body7_r8.cubeList.add(new ModelBox(body7_r8, 44, 29, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body6_r7 = new ModelRenderer(this);
        this.body6_r7.setRotationPoint(-0.5F, -1.012F, -8.5933F);
        this.body.addChild(body6_r7);
        this.setRotateAngle(body6_r7, 0.2242F, 0.0314F, -0.1005F);
        this.body6_r7.cubeList.add(new ModelBox(body6_r7, 18, 36, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body5_r8 = new ModelRenderer(this);
        this.body5_r8.setRotationPoint(0.5F, -1.412F, -0.5933F);
        this.body.addChild(body5_r8);
        this.setRotateAngle(body5_r8, -0.0337F, 0.009F, 0.122F);
        this.body5_r8.cubeList.add(new ModelBox(body5_r8, 45, 22, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body6_r8 = new ModelRenderer(this);
        this.body6_r8.setRotationPoint(0.5F, -1.412F, -0.5933F);
        this.body.addChild(body6_r8);
        this.setRotateAngle(body6_r8, -0.0271F, 0.022F, 0.5408F);
        this.body6_r8.cubeList.add(new ModelBox(body6_r8, 17, 45, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body7_r9 = new ModelRenderer(this);
        this.body7_r9.setRotationPoint(0.5F, -1.412F, -0.5933F);
        this.body.addChild(body7_r9);
        this.setRotateAngle(body7_r9, -0.0125F, 0.0326F, 1.0644F);
        this.body7_r9.cubeList.add(new ModelBox(body7_r9, 45, 12, 1.4538F, -1.309F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body4_r4 = new ModelRenderer(this);
        this.body4_r4.setRotationPoint(0.5F, -1.412F, -2.5933F);
        this.body.addChild(body4_r4);
        this.setRotateAngle(body4_r4, 0.0337F, -0.009F, 0.1395F);
        this.body4_r4.cubeList.add(new ModelBox(body4_r4, 45, 43, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body5_r9 = new ModelRenderer(this);
        this.body5_r9.setRotationPoint(0.5F, -1.412F, -2.5933F);
        this.body.addChild(body5_r9);
        this.setRotateAngle(body5_r9, 0.0271F, -0.022F, 0.5582F);
        this.body5_r9.cubeList.add(new ModelBox(body5_r9, 45, 27, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body6_r9 = new ModelRenderer(this);
        this.body6_r9.setRotationPoint(0.5F, -1.412F, -2.5933F);
        this.body.addChild(body6_r9);
        this.setRotateAngle(body6_r9, 0.0125F, -0.0326F, 1.0819F);
        this.body6_r9.cubeList.add(new ModelBox(body6_r9, 16, 8, 1.4538F, -1.309F, -0.5F, 2, 0, 1, 0.0F, false));

        this.body7_r10 = new ModelRenderer(this);
        this.body7_r10.setRotationPoint(0.5F, -1.012F, -8.5933F);
        this.body.addChild(body7_r10);
        this.setRotateAngle(body7_r10, 0.1075F, -0.1996F, 1.0357F);
        this.body7_r10.cubeList.add(new ModelBox(body7_r10, 0, 5, 1.4538F, -1.309F, -0.5F, 2, 0, 1, 0.0F, false));

        this.body6_r10 = new ModelRenderer(this);
        this.body6_r10.setRotationPoint(0.5F, -1.012F, -8.5933F);
        this.body.addChild(body6_r10);
        this.setRotateAngle(body6_r10, 0.1928F, -0.1194F, 0.5113F);
        this.body6_r10.cubeList.add(new ModelBox(body6_r10, 44, 29, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body5_r10 = new ModelRenderer(this);
        this.body5_r10.setRotationPoint(0.5F, -1.012F, -8.5933F);
        this.body.addChild(body5_r10);
        this.setRotateAngle(body5_r10, 0.2242F, -0.0314F, 0.1005F);
        this.body5_r10.cubeList.add(new ModelBox(body5_r10, 18, 36, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body5_r11 = new ModelRenderer(this);
        this.body5_r11.setRotationPoint(0.5F, -1.212F, -6.5933F);
        this.body.addChild(body5_r11);
        this.setRotateAngle(body5_r11, 0.1165F, -0.0764F, 0.5188F);
        this.body5_r11.cubeList.add(new ModelBox(body5_r11, 12, 45, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body7_r11 = new ModelRenderer(this);
        this.body7_r11.setRotationPoint(3.1101F, 0.6708F, -6.3084F);
        this.body.addChild(body7_r11);
        this.setRotateAngle(body7_r11, 0.0721F, 0.5288F, 1.0872F);
        this.body7_r11.cubeList.add(new ModelBox(body7_r11, 27, 5, -0.8F, 0.0192F, -0.2F, 1, 0, 1, 0.0F, false));

        this.body6_r11 = new ModelRenderer(this);
        this.body6_r11.setRotationPoint(0.5F, -1.212F, -6.5933F);
        this.body.addChild(body6_r11);
        this.setRotateAngle(body6_r11, 0.0627F, -0.1244F, 1.0429F);
        this.body6_r11.cubeList.add(new ModelBox(body6_r11, 8, 26, 1.4538F, -1.309F, -0.5F, 3, 0, 1, 0.0F, false));

        this.body4_r5 = new ModelRenderer(this);
        this.body4_r5.setRotationPoint(0.5F, -1.212F, -6.5933F);
        this.body.addChild(body4_r5);
        this.setRotateAngle(body4_r5, 0.1374F, -0.0226F, 0.1028F);
        this.body4_r5.cubeList.add(new ModelBox(body4_r5, 45, 7, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body6_r12 = new ModelRenderer(this);
        this.body6_r12.setRotationPoint(3.1101F, 0.5884F, -4.4736F);
        this.body.addChild(body6_r12);
        this.setRotateAngle(body6_r12, 0.0216F, 0.5182F, 1.0584F);
        this.body6_r12.cubeList.add(new ModelBox(body6_r12, 32, 0, -0.7F, 0.0116F, -0.2F, 1, 0, 1, 0.0F, false));

        this.body5_r12 = new ModelRenderer(this);
        this.body5_r12.setRotationPoint(0.5F, -1.312F, -4.5933F);
        this.body.addChild(body5_r12);
        this.setRotateAngle(body5_r12, 0.0188F, -0.0489F, 1.0467F);
        this.body5_r12.cubeList.add(new ModelBox(body5_r12, 39, 34, 1.4538F, -1.309F, -0.5F, 3, 0, 1, 0.0F, false));

        this.body4_r6 = new ModelRenderer(this);
        this.body4_r6.setRotationPoint(0.5F, -1.312F, -4.5933F);
        this.body.addChild(body4_r6);
        this.setRotateAngle(body4_r6, 0.0407F, -0.0329F, 0.5229F);
        this.body4_r6.cubeList.add(new ModelBox(body4_r6, 21, 46, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.5F, -1.312F, -4.5933F);
        this.body.addChild(body3_r1);
        this.setRotateAngle(body3_r1, 0.0506F, -0.0135F, 0.1044F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 46, 38, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(-0.5F, 2.8843F, -10.4498F);
        this.body.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, -0.1227F, 0.1043F, -0.0064F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 36, 27, -3.0F, -0.5731F, 0.0955F, 3, 1, 1, -0.003F, true));

        this.neck5_r2 = new ModelRenderer(this);
        this.neck5_r2.setRotationPoint(-2.5F, 2.9087F, -10.7513F);
        this.body.addChild(neck5_r2);
        this.setRotateAngle(neck5_r2, -0.1264F, 0.2598F, -0.0326F);
        this.neck5_r2.cubeList.add(new ModelBox(neck5_r2, 38, 0, -1.0F, -0.6341F, -0.1082F, 3, 1, 1, 0.0F, true));

        this.neck5_r3 = new ModelRenderer(this);
        this.neck5_r3.setRotationPoint(0.0F, 4.5F, -17.0F);
        this.body.addChild(neck5_r3);
        this.setRotateAngle(neck5_r3, -0.1222F, 0.0F, 0.0F);
        this.neck5_r3.cubeList.add(new ModelBox(neck5_r3, 0, 31, -3.5F, -2.975F, 6.1F, 1, 1, 3, 0.0F, true));
        this.neck5_r3.cubeList.add(new ModelBox(neck5_r3, 0, 31, 2.5F, -2.975F, 6.1F, 1, 1, 3, 0.0F, false));
        this.neck5_r3.cubeList.add(new ModelBox(neck5_r3, 40, 12, -0.5F, -2.975F, 5.4F, 1, 1, 2, 0.0F, false));

        this.body4_r7 = new ModelRenderer(this);
        this.body4_r7.setRotationPoint(-3.0F, 2.6954F, -8.85F);
        this.body.addChild(body4_r7);
        this.setRotateAngle(body4_r7, 1.0647F, 0.0F, -0.1745F);
        this.body4_r7.cubeList.add(new ModelBox(body4_r7, 18, 30, -0.5F, -1.575F, -0.3976F, 1, 2, 3, 0.004F, true));

        this.body3_r2 = new ModelRenderer(this);
        this.body3_r2.setRotationPoint(-3.5995F, 0.5952F, -7.3904F);
        this.body.addChild(body3_r2);
        this.setRotateAngle(body3_r2, 0.8158F, 0.1569F, -0.01F);
        this.body3_r2.cubeList.add(new ModelBox(body3_r2, 30, 21, -0.1743F, -1.7455F, -0.4401F, 1, 2, 3, 0.0F, true));

        this.body3_r3 = new ModelRenderer(this);
        this.body3_r3.setRotationPoint(3.0F, 2.6954F, -8.85F);
        this.body.addChild(body3_r3);
        this.setRotateAngle(body3_r3, 1.0647F, 0.0F, 0.1745F);
        this.body3_r3.cubeList.add(new ModelBox(body3_r3, 18, 30, -0.5F, -1.575F, -0.3976F, 1, 2, 3, 0.004F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(3.5995F, 0.5952F, -7.3904F);
        this.body.addChild(body2_r1);
        this.setRotateAngle(body2_r1, 0.8158F, -0.1569F, 0.01F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 30, 21, -0.8257F, -1.7455F, -0.4401F, 1, 2, 3, 0.0F, false));

        this.body3_r4 = new ModelRenderer(this);
        this.body3_r4.setRotationPoint(0.0F, -0.55F, -9.0F);
        this.body.addChild(body3_r4);
        this.setRotateAngle(body3_r4, 0.1047F, 0.0F, 0.0F);
        this.body3_r4.cubeList.add(new ModelBox(body3_r4, 47, 0, 0.0F, -1.7F, 2.0F, 0, 1, 1, 0.0F, false));
        this.body3_r4.cubeList.add(new ModelBox(body3_r4, 12, 47, 0.0F, -1.6F, 0.0F, 0, 1, 1, 0.0F, false));
        this.body3_r4.cubeList.add(new ModelBox(body3_r4, 34, 15, -0.5F, -0.9F, 0.0F, 1, 1, 3, 0.0F, false));

        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(2.5F, 2.9087F, -10.7513F);
        this.body.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, -0.1264F, -0.2598F, 0.0326F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 38, 0, -2.0F, -0.6341F, -0.1082F, 3, 1, 1, 0.0F, false));

        this.neck4_r2 = new ModelRenderer(this);
        this.neck4_r2.setRotationPoint(0.5F, 2.8843F, -10.4498F);
        this.body.addChild(neck4_r2);
        this.setRotateAngle(neck4_r2, -0.1227F, -0.1043F, 0.0064F);
        this.neck4_r2.cubeList.add(new ModelBox(neck4_r2, 36, 27, 0.0F, -0.5731F, 0.0955F, 3, 1, 1, -0.003F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -10.0F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.0421F, 0.002F, 0.0227F);
        this.neck.cubeList.add(new ModelBox(neck, 33, 34, -0.5F, -1.99F, -2.0F, 1, 1, 3, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 47, 14, 0.0F, -2.59F, -1.0F, 0, 1, 1, 0.0F, false));

        this.body8_r7 = new ModelRenderer(this);
        this.body8_r7.setRotationPoint(-0.3F, -1.512F, -0.5933F);
        this.neck.addChild(body8_r7);
        this.setRotateAngle(body8_r7, 0.0761F, 0.3635F, -0.5502F);
        this.body8_r7.cubeList.add(new ModelBox(body8_r7, 12, 33, -1.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body7_r12 = new ModelRenderer(this);
        this.body7_r12.setRotationPoint(-0.3F, -1.512F, -0.5933F);
        this.neck.addChild(body7_r12);
        this.setRotateAngle(body7_r12, 0.2212F, 0.3004F, -0.1117F);
        this.body7_r12.cubeList.add(new ModelBox(body7_r12, 32, 7, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body7_r13 = new ModelRenderer(this);
        this.body7_r13.setRotationPoint(0.3F, -1.512F, -0.5933F);
        this.neck.addChild(body7_r13);
        this.setRotateAngle(body7_r13, 0.0761F, -0.3635F, 0.5502F);
        this.body7_r13.cubeList.add(new ModelBox(body7_r13, 12, 33, 0.9135F, -0.4067F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body6_r13 = new ModelRenderer(this);
        this.body6_r13.setRotationPoint(0.3F, -1.512F, -0.5933F);
        this.neck.addChild(body6_r13);
        this.setRotateAngle(body6_r13, 0.2212F, -0.3004F, 0.1117F);
        this.body6_r13.cubeList.add(new ModelBox(body6_r13, 32, 7, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0F, -0.0436F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 39, 24, -1.5F, -1.0F, -9.0F, 3, 1, 1, 0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 42, 36, -1.5F, -0.75F, -8.75F, 3, 1, 0, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 47, 2.75F, -0.5F, -6.5F, 0, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 47, 3.5F, -0.5F, -4.75F, 0, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 47, -3.5F, -0.5F, -4.75F, 0, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 15, 47, -2.75F, -0.5F, -6.5F, 0, 1, 1, 0.0F, true));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.6981F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.25F, -0.75F, 0.0F, 0, 1, 3, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 28, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2443F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 9, -1.05F, -0.75F, 2.55F, 0, 1, 2, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 3, -1.3F, -1.0F, 2.65F, 1, 1, 2, 0.005F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.0349F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 4, -2.0F, -0.75F, 4.2F, 0, 1, 3, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 16, -2.25F, -1.0F, 4.2F, 1, 1, 6, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.271F, -1.9413F, -0.1887F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1074F, 0.4321F, 0.0479F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 44, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0F, -1.8F, 0.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.6632F, -0.3927F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 45, -1.9483F, -0.0457F, -1.0016F, 2, 1, 1, 0.0F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.9F, -1.0F, -5.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0524F, 0.0087F, -0.3927F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 9, 0.0695F, 0.1423F, 0.0162F, 3, 1, 5, 0.0F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2094F, -0.3491F, -0.3491F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 27, -0.25F, -0.85F, 1.75F, 2, 1, 3, 0.0F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0349F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 4, 2.0F, -0.75F, 4.2F, 0, 1, 3, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 16, 1.25F, -1.0F, 4.2F, 1, 1, 6, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2443F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 9, 1.05F, -0.75F, 2.55F, 0, 1, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 3, 0.3F, -1.0F, 2.65F, 1, 1, 2, 0.005F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.6981F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.25F, -0.75F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 28, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2094F, 0.3491F, 0.3491F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 27, -1.75F, -0.85F, 1.75F, 2, 1, 3, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(2.0F, -1.8F, 0.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.6632F, 0.3927F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 45, -0.0517F, -0.0457F, -1.0016F, 2, 1, 1, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(3.9F, -1.0F, -5.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0524F, -0.0087F, 0.3927F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 9, -3.0695F, 0.1423F, 0.0162F, 3, 1, 5, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.0F, -9.0F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 18, -1.5F, 0.0F, 0.0F, 3, 1, 4, 0.01F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(1.271F, -1.9413F, -0.1887F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1074F, -0.4321F, -0.0479F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 39, 44, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.0F, -9.0F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 0, -1.5F, -0.675F, 3.9F, 3, 1, 5, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2618F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 17, 26, -1.5F, -0.25F, -9.85F, 3, 1, 0, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 39, 9, -1.5F, 0.0F, -10.1F, 3, 1, 1, 0.005F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-4.1F, 1.0F, -1.0F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3665F, -0.0349F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 41, 0.0308F, -1.0F, -1.9852F, 1, 1, 2, -0.003F, true));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, 1.0F, -10.1F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0524F, -0.6981F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 36, 0.0F, -1.0F, 0.1F, 1, 1, 3, -0.006F, true));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-3.4F, 1.4F, -5.9F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1047F, -0.2443F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 32, 44, -0.4725F, -1.008F, -1.8278F, 1, 1, 2, -0.006F, true));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-4.1F, 2.1F, -2.6F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, -0.0349F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 12, 35, 0.0867F, -1.3516F, -3.345F, 1, 1, 3, -0.006F, true));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, 0.5F, -10.1F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.0349F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 6, 38, -2.0F, -0.75F, 4.2F, 0, 1, 3, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 9, 18, -2.25F, -0.5F, 4.2F, 1, 1, 6, 0.0F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, 0.5F, -10.1F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.2443F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 18, -1.05F, -0.75F, 2.55F, 0, 1, 2, 0.0F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 25, 43, -1.3F, -0.5F, 2.65F, 1, 1, 2, -0.01F, true));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.5F, 0.5F, -10.1F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.6981F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 27, 38, 0.25F, -0.75F, 0.0F, 0, 1, 3, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 33, 9, 0.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(3.4F, 1.4F, -5.9F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1047F, 0.2443F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 32, 44, -0.5275F, -1.008F, -1.8278F, 1, 1, 2, -0.006F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(1.5F, 1.0F, -10.1F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.2443F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 25, 43, 0.3F, -1.0F, 2.65F, 1, 1, 2, -0.01F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 9, 18, 1.05F, -1.25F, 2.55F, 0, 1, 2, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(4.1F, 2.1F, -2.6F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0873F, 0.0349F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 12, 35, -1.0867F, -1.3516F, -3.345F, 1, 1, 3, -0.006F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(4.1F, 1.0F, -1.0F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3665F, 0.0349F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 41, -1.0308F, -1.0F, -1.9852F, 1, 1, 2, -0.003F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(1.5F, 1.0F, -10.1F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0349F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 9, 18, 1.25F, -1.0F, 4.2F, 1, 1, 6, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 6, 38, 2.0F, -1.25F, 4.2F, 0, 1, 3, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(1.5F, 1.0F, -10.1F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0524F, 0.6981F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 36, -1.0F, -1.0F, 0.1F, 1, 1, 3, -0.006F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(1.5F, 1.0F, -10.1F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.6981F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 33, 9, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 27, 38, -0.25F, -1.25F, 0.0F, 0, 1, 3, 0.0F, false));

        this.eyeright = new ModelRenderer(this);
        this.eyeright.setRotationPoint(-1.3F, -2.05F, -2.75F);
        this.head.addChild(eyeright);


        this.eyeleft = new ModelRenderer(this);
        this.eyeleft.setRotationPoint(1.3F, -2.05F, -2.75F);
        this.head.addChild(eyeleft);


        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.6644F, 1.4359F, -5.0095F);
        this.eyeleft.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2417F, 0.0891F, -0.3155F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 27, 32, -1.0F, -1.0F, -0.9F, 2, 2, 2, -0.46F, true));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-3.0557F, 0.0198F, -0.1808F);
        this.eyeleft.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0406F, -0.0518F, -0.3505F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 20, 12, -1.2F, -0.1F, -1.0F, 2, 1, 2, -0.25F, true));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0644F, 1.4359F, -5.0095F);
        this.eyeleft.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2417F, -0.0891F, 0.3155F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 27, 32, -1.0F, -1.0F, -0.9F, 2, 2, 2, -0.46F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.4557F, 0.0198F, -0.1808F);
        this.eyeleft.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0406F, 0.0518F, 0.3505F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 20, 12, -0.8F, -0.1F, -1.0F, 2, 1, 2, -0.25F, false));

        this.armleft = new ModelRenderer(this);
        this.armleft.setRotationPoint(4.25F, 2.0F, -7.75F);
        this.body.addChild(armleft);
        this.setRotateAngle(armleft, 0.0115F, 0.1304F, 0.088F);
        this.armleft.cubeList.add(new ModelBox(armleft, 6, 33, 2.0F, -0.2F, -1.5F, 1, 1, 3, 0.0F, false));
        this.armleft.cubeList.add(new ModelBox(armleft, 32, 2, -1.0F, -0.2F, -1.5F, 1, 1, 3, 0.0F, false));
        this.armleft.cubeList.add(new ModelBox(armleft, 21, 37, 0.0F, -0.2F, -1.0F, 2, 1, 2, 0.0F, false));
        this.armleft.cubeList.add(new ModelBox(armleft, 36, 20, 0.0F, -0.2F, -1.0F, 2, 1, 2, 0.0F, false));

        this.armleft2 = new ModelRenderer(this);
        this.armleft2.setRotationPoint(2.25F, -0.25F, 0.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, -0.3254F, -0.2834F, -0.0878F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 41, 38, 0.49F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.armleft2.cubeList.add(new ModelBox(armleft2, 0, 9, -1.01F, 1.0F, -0.5F, 1, 3, 1, -0.1F, false));

        this.handleft = new ModelRenderer(this);
        this.handleft.setRotationPoint(0.0F, 3.2239F, -0.4309F);
        this.armleft2.addChild(handleft);
        this.setRotateAngle(handleft, 0.348F, -0.0018F, -0.0094F);
        this.handleft.cubeList.add(new ModelBox(handleft, 22, 0, -1.1F, 0.0864F, -2.0889F, 3, 1, 3, 0.0F, false));

        this.armright = new ModelRenderer(this);
        this.armright.setRotationPoint(-4.25F, 2.0F, -7.75F);
        this.body.addChild(armright);
        this.setRotateAngle(armright, 0.0F, 0.7854F, 0.0F);
        this.armright.cubeList.add(new ModelBox(armright, 6, 33, -3.0F, -0.2F, -1.5F, 1, 1, 3, 0.0F, true));
        this.armright.cubeList.add(new ModelBox(armright, 32, 2, 0.0F, -0.2F, -1.5F, 1, 1, 3, 0.0F, true));
        this.armright.cubeList.add(new ModelBox(armright, 21, 37, -2.0F, -0.2F, -1.0F, 2, 1, 2, 0.0F, true));
        this.armright.cubeList.add(new ModelBox(armright, 36, 20, -2.0F, -0.2F, -1.0F, 2, 1, 2, 0.0F, true));

        this.armright2 = new ModelRenderer(this);
        this.armright2.setRotationPoint(-2.25F, -0.25F, 0.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.0F, -0.1745F, 0.0F);
        this.armright2.cubeList.add(new ModelBox(armright2, 41, 38, -1.49F, 0.0F, -0.5F, 1, 4, 1, 0.0F, true));
        this.armright2.cubeList.add(new ModelBox(armright2, 0, 9, 0.01F, 1.0F, -0.5F, 1, 3, 1, -0.1F, true));

        this.handright = new ModelRenderer(this);
        this.handright.setRotationPoint(0.0F, 3.2239F, -0.4309F);
        this.armright2.addChild(handright);
        this.handright.cubeList.add(new ModelBox(handright, 22, 0, -1.9F, 0.0864F, -2.0889F, 3, 1, 3, 0.0F, true));

        this.legleft = new ModelRenderer(this);
        this.legleft.setRotationPoint(1.45F, -5.05F, 6.0F);
        this.hip.addChild(legleft);
        this.setRotateAngle(legleft, -0.2024F, 0.4256F, -0.3282F);
        this.legleft.cubeList.add(new ModelBox(legleft, 20, 41, -0.5F, 0.0F, -1.5F, 1, 1, 2, 0.0F, false));
        this.legleft.cubeList.add(new ModelBox(legleft, 38, 31, 0.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.legleft2 = new ModelRenderer(this);
        this.legleft2.setRotationPoint(3.3F, 0.6F, -0.55F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, -0.0786F, 0.3405F, 0.0737F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 16, -0.2022F, -0.0711F, 0.0591F, 1, 4, 1, 0.0F, false));
        this.legleft2.cubeList.add(new ModelBox(legleft2, 7, 43, -0.2022F, -0.0711F, -1.1409F, 1, 4, 1, -0.1F, false));

        this.footleft = new ModelRenderer(this);
        this.footleft.setRotationPoint(0.4578F, 4.0467F, -0.172F);
        this.legleft2.addChild(footleft);
        this.setRotateAngle(footleft, 0.0F, -1.5708F, 0.2182F);
        this.footleft.cubeList.add(new ModelBox(footleft, 20, 7, -1.8854F, -0.3114F, -2.2965F, 4, 1, 3, 0.0F, false));

        this.legright = new ModelRenderer(this);
        this.legright.setRotationPoint(-1.45F, -5.05F, 6.0F);
        this.hip.addChild(legright);
        this.setRotateAngle(legright, -0.0049F, 0.085F, 0.3119F);
        this.legright.cubeList.add(new ModelBox(legright, 20, 41, -0.5F, 0.0F, -1.5F, 1, 1, 2, 0.0F, true));
        this.legright.cubeList.add(new ModelBox(legright, 38, 31, -3.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F, true));

        this.legright2 = new ModelRenderer(this);
        this.legright2.setRotationPoint(-3.3F, 0.6F, -0.55F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, -0.0786F, -0.3405F, -0.0737F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 16, -0.7978F, -0.0711F, 0.0591F, 1, 4, 1, 0.0F, true));
        this.legright2.cubeList.add(new ModelBox(legright2, 7, 43, -0.7978F, -0.0711F, -1.1409F, 1, 4, 1, -0.1F, true));

        this.footright = new ModelRenderer(this);
        this.footright.setRotationPoint(-0.4578F, 4.0467F, -0.172F);
        this.legright2.addChild(footright);
        this.setRotateAngle(footright, 0.0F, 1.5708F, -0.2182F);
        this.footright.cubeList.add(new ModelBox(footright, 20, 7, -2.1146F, -0.3114F, -2.2965F, 4, 1, 3, 0.0F, true));

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
