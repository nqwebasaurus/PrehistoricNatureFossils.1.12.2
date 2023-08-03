package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonVillebrunaster extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root2;
    private final ModelRenderer core2;
    private final ModelRenderer armmiddlebase6;
    private final ModelRenderer armbase6;
    private final ModelRenderer arm1base_r1;
    private final ModelRenderer arm1base_r2;
    private final ModelRenderer armmiddlebase7;
    private final ModelRenderer armbase7;
    private final ModelRenderer arm1base_r3;
    private final ModelRenderer arm1base_r4;
    private final ModelRenderer armmiddlebase8;
    private final ModelRenderer armbase8;
    private final ModelRenderer arm1base_r5;
    private final ModelRenderer arm1base_r6;
    private final ModelRenderer armmiddlebase9;
    private final ModelRenderer armbase9;
    private final ModelRenderer arm1base_r7;
    private final ModelRenderer arm1base_r8;
    private final ModelRenderer armmiddlebase10;
    private final ModelRenderer armbase10;
    private final ModelRenderer arm1base_r9;
    private final ModelRenderer arm1base_r10;
    private final ModelRenderer core3;
    private final ModelRenderer core_r1;
    private final ModelRenderer core_r2;
    private final ModelRenderer armmiddlebase11;
    private final ModelRenderer armbase11;
    private final ModelRenderer arm1base_r11;
    private final ModelRenderer arm1base_r12;
    private final ModelRenderer armmiddlebase12;
    private final ModelRenderer armbase12;
    private final ModelRenderer armmiddlebase13;
    private final ModelRenderer armbase13;
    private final ModelRenderer armmiddlebase14;
    private final ModelRenderer armbase14;
    private final ModelRenderer armmiddlebase15;
    private final ModelRenderer armbase15;
    private final ModelRenderer arm1base_r13;
    private final ModelRenderer arm1base_r14;
    private final ModelRenderer arm1base_r15;
    private final ModelRenderer root;
    private final ModelRenderer core;
    private final ModelRenderer armmiddlebase;
    private final ModelRenderer armbase;
    private final ModelRenderer arm1base_r16;
    private final ModelRenderer arm1base_r17;
    private final ModelRenderer armmiddlebase2;
    private final ModelRenderer armbase2;
    private final ModelRenderer arm1base_r18;
    private final ModelRenderer arm1base_r19;
    private final ModelRenderer armmiddlebase3;
    private final ModelRenderer armbase3;
    private final ModelRenderer arm1base_r20;
    private final ModelRenderer arm1base_r21;
    private final ModelRenderer armmiddlebase4;
    private final ModelRenderer armbase4;
    private final ModelRenderer arm1base_r22;
    private final ModelRenderer arm1base_r23;
    private final ModelRenderer arm1base_r24;
    private final ModelRenderer arm1base_r25;
    private final ModelRenderer arm1base_r26;
    private final ModelRenderer arm1base_r27;
    private final ModelRenderer arm1base_r28;
    private final ModelRenderer arm1base_r29;
    private final ModelRenderer arm1base_r30;
    private final ModelRenderer arm1base_r31;
    private final ModelRenderer arm1base_r32;
    private final ModelRenderer arm1base_r33;
    private final ModelRenderer arm1base_r34;
    private final ModelRenderer arm1base_r35;
    private final ModelRenderer arm1base_r36;
    private final ModelRenderer armmiddlebase5;
    private final ModelRenderer armbase5;
    private final ModelRenderer arm1base_r37;
    private final ModelRenderer arm1base_r38;

    public ModelSkeletonVillebrunaster() {
        this.textureWidth = 96;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(5.0F, 24.0F, -6.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 40, 42, -8.0F, -2.0F, 1.0F, 11, 2, 13, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, 0.0F, -2.0F, -8.0F, 7, 2, 22, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(7.2F, -1.0F, 14.1F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.0647F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 37, 0, -6.1811F, -1.0F, 0.0261F, 6, 2, 18, -0.008F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-5.0F, -1.0F, 6.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.5236F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 25, -8.0F, -1.0F, 2.0F, 13, 2, 14, -0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-4.8F, -1.0F, 2.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.829F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 25, -4.5F, -1.0F, -10.5F, 8, 2, 18, 0.007F, false));

        this.root2 = new ModelRenderer(this);
        this.root2.setRotationPoint(-11.0F, -2.1F, 13.0F);
        this.fossil.addChild(root2);


        this.core2 = new ModelRenderer(this);
        this.core2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.root2.addChild(core2);
        this.core2.cubeList.add(new ModelBox(core2, 0, 46, -3.0F, 0.025F, -4.0F, 6, 0, 6, 0.01F, false));
        this.core2.cubeList.add(new ModelBox(core2, 0, 0, -2.0F, -0.025F, -3.0F, 4, 0, 4, 0.0F, false));

        this.armmiddlebase6 = new ModelRenderer(this);
        this.armmiddlebase6.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core2.addChild(armmiddlebase6);


        this.armbase6 = new ModelRenderer(this);
        this.armbase6.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase6.addChild(armbase6);
        this.armbase6.cubeList.add(new ModelBox(armbase6, 37, 13, -1.5F, 1.0F, -2.25F, 3, 0, 3, 0.01F, false));
        this.armbase6.cubeList.add(new ModelBox(armbase6, 37, 0, -1.0F, 0.9F, -3.35F, 2, 0, 4, 0.0F, false));
        this.armbase6.cubeList.add(new ModelBox(armbase6, 11, 29, -0.5F, 1.0F, -4.25F, 1, 0, 2, 0.01F, false));

        this.arm1base_r1 = new ModelRenderer(this);
        this.arm1base_r1.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase6.addChild(arm1base_r1);
        this.setRotateAngle(arm1base_r1, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r1.cubeList.add(new ModelBox(arm1base_r1, 50, 62, -0.375F, -24.0F, 0.35F, 4, 0, 2, 0.0F, false));

        this.arm1base_r2 = new ModelRenderer(this);
        this.arm1base_r2.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase6.addChild(arm1base_r2);
        this.setRotateAngle(arm1base_r2, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r2.cubeList.add(new ModelBox(arm1base_r2, 58, 59, -3.625F, -24.0F, 0.35F, 4, 0, 2, 0.005F, false));

        this.armmiddlebase7 = new ModelRenderer(this);
        this.armmiddlebase7.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core2.addChild(armmiddlebase7);
        this.setRotateAngle(armmiddlebase7, 0.0F, -1.2566F, 0.0F);


        this.armbase7 = new ModelRenderer(this);
        this.armbase7.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase7.addChild(armbase7);
        this.armbase7.cubeList.add(new ModelBox(armbase7, 37, 9, -1.5F, 0.985F, -2.25F, 3, 0, 3, 0.01F, false));
        this.armbase7.cubeList.add(new ModelBox(armbase7, 0, 36, -1.0F, 0.9F, -3.35F, 2, 0, 4, 0.0F, false));
        this.armbase7.cubeList.add(new ModelBox(armbase7, 8, 25, -0.5F, 1.0F, -4.25F, 1, 0, 2, 0.01F, false));

        this.arm1base_r3 = new ModelRenderer(this);
        this.arm1base_r3.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase7.addChild(arm1base_r3);
        this.setRotateAngle(arm1base_r3, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r3.cubeList.add(new ModelBox(arm1base_r3, 39, 61, -0.375F, -24.0F, 0.35F, 4, 0, 2, 0.0F, false));

        this.arm1base_r4 = new ModelRenderer(this);
        this.arm1base_r4.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase7.addChild(arm1base_r4);
        this.setRotateAngle(arm1base_r4, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r4.cubeList.add(new ModelBox(arm1base_r4, 59, 21, -3.625F, -24.0F, 0.35F, 4, 0, 2, 0.005F, false));

        this.armmiddlebase8 = new ModelRenderer(this);
        this.armmiddlebase8.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core2.addChild(armmiddlebase8);
        this.setRotateAngle(armmiddlebase8, 0.0F, -2.5133F, 0.0F);


        this.armbase8 = new ModelRenderer(this);
        this.armbase8.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase8.addChild(armbase8);
        this.armbase8.cubeList.add(new ModelBox(armbase8, 37, 5, -1.5F, 0.99F, -2.25F, 3, 0, 3, 0.005F, false));
        this.armbase8.cubeList.add(new ModelBox(armbase8, 35, 30, -1.0F, 0.9F, -3.35F, 2, 0, 4, 0.0F, false));
        this.armbase8.cubeList.add(new ModelBox(armbase8, 15, 19, -0.5F, 1.0F, -4.25F, 1, 0, 2, 0.01F, false));

        this.arm1base_r5 = new ModelRenderer(this);
        this.arm1base_r5.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase8.addChild(arm1base_r5);
        this.setRotateAngle(arm1base_r5, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r5.cubeList.add(new ModelBox(arm1base_r5, 26, 61, -0.375F, -24.0F, 0.35F, 4, 0, 2, 0.0F, false));

        this.arm1base_r6 = new ModelRenderer(this);
        this.arm1base_r6.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase8.addChild(arm1base_r6);
        this.setRotateAngle(arm1base_r6, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r6.cubeList.add(new ModelBox(arm1base_r6, 47, 58, -3.625F, -24.0F, 0.35F, 4, 0, 2, 0.005F, false));

        this.armmiddlebase9 = new ModelRenderer(this);
        this.armmiddlebase9.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core2.addChild(armmiddlebase9);
        this.setRotateAngle(armmiddlebase9, 0.0F, 2.5133F, 0.0F);


        this.armbase9 = new ModelRenderer(this);
        this.armbase9.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase9.addChild(armbase9);
        this.armbase9.cubeList.add(new ModelBox(armbase9, 35, 35, -1.5F, 1.0F, -2.25F, 3, 0, 3, 0.01F, false));
        this.armbase9.cubeList.add(new ModelBox(armbase9, 35, 25, -1.0F, 0.9F, -3.35F, 2, 0, 4, 0.0F, false));
        this.armbase9.cubeList.add(new ModelBox(armbase9, 10, 18, -0.5F, 1.0F, -4.25F, 1, 0, 2, 0.01F, false));

        this.arm1base_r7 = new ModelRenderer(this);
        this.arm1base_r7.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase9.addChild(arm1base_r7);
        this.setRotateAngle(arm1base_r7, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r7.cubeList.add(new ModelBox(arm1base_r7, 13, 61, -0.375F, -24.0F, 0.35F, 4, 0, 2, 0.0F, false));

        this.arm1base_r8 = new ModelRenderer(this);
        this.arm1base_r8.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase9.addChild(arm1base_r8);
        this.setRotateAngle(arm1base_r8, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r8.cubeList.add(new ModelBox(arm1base_r8, 34, 58, -3.625F, -24.0F, 0.35F, 4, 0, 2, 0.005F, false));

        this.armmiddlebase10 = new ModelRenderer(this);
        this.armmiddlebase10.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core2.addChild(armmiddlebase10);
        this.setRotateAngle(armmiddlebase10, 0.0F, 1.2566F, 0.0F);


        this.armbase10 = new ModelRenderer(this);
        this.armbase10.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase10.addChild(armbase10);
        this.armbase10.cubeList.add(new ModelBox(armbase10, 0, 18, -1.5F, 0.99F, -2.25F, 3, 0, 3, 0.005F, false));
        this.armbase10.cubeList.add(new ModelBox(armbase10, 0, 31, -1.0F, 0.9F, -3.35F, 2, 0, 4, 0.0F, false));
        this.armbase10.cubeList.add(new ModelBox(armbase10, 15, 3, -0.5F, 1.0F, -4.25F, 1, 0, 2, 0.01F, false));

        this.arm1base_r9 = new ModelRenderer(this);
        this.arm1base_r9.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase10.addChild(arm1base_r9);
        this.setRotateAngle(arm1base_r9, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r9.cubeList.add(new ModelBox(arm1base_r9, 0, 61, -0.375F, -24.0F, 0.35F, 4, 0, 2, 0.0F, false));

        this.arm1base_r10 = new ModelRenderer(this);
        this.arm1base_r10.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase10.addChild(arm1base_r10);
        this.setRotateAngle(arm1base_r10, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r10.cubeList.add(new ModelBox(arm1base_r10, 23, 57, -3.625F, -24.0F, 0.35F, 4, 0, 2, 0.005F, false));

        this.core3 = new ModelRenderer(this);
        this.core3.setRotationPoint(14.0F, 0.0F, 5.5F);
        this.root2.addChild(core3);


        this.core_r1 = new ModelRenderer(this);
        this.core_r1.setRotationPoint(-1.0113F, -0.025F, -2.7532F);
        this.core3.addChild(core_r1);
        this.setRotateAngle(core_r1, 0.0F, 0.5236F, 0.0F);
        this.core_r1.cubeList.add(new ModelBox(core_r1, 2, 2, -2.0F, 0.0F, -1.1F, 4, 0, 2, 0.0F, false));

        this.core_r2 = new ModelRenderer(this);
        this.core_r2.setRotationPoint(-0.5F, 0.025F, -3.5F);
        this.core3.addChild(core_r2);
        this.setRotateAngle(core_r2, 0.0F, 0.4974F, 0.0F);
        this.core_r2.cubeList.add(new ModelBox(core_r2, 5, 51, -1.4F, 0.0F, 0.3F, 5, 0, 1, 0.01F, false));

        this.armmiddlebase11 = new ModelRenderer(this);
        this.armmiddlebase11.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core3.addChild(armmiddlebase11);


        this.armbase11 = new ModelRenderer(this);
        this.armbase11.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase11.addChild(armbase11);
        this.armbase11.cubeList.add(new ModelBox(armbase11, 37, 13, -1.5F, 1.0F, -2.95F, 3, 0, 3, 0.01F, false));
        this.armbase11.cubeList.add(new ModelBox(armbase11, 37, 0, -1.0F, 0.9F, -3.65F, 2, 0, 4, 0.0F, false));
        this.armbase11.cubeList.add(new ModelBox(armbase11, 11, 29, -0.5F, 1.0F, -4.25F, 1, 0, 2, 0.01F, false));

        this.arm1base_r11 = new ModelRenderer(this);
        this.arm1base_r11.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase11.addChild(arm1base_r11);
        this.setRotateAngle(arm1base_r11, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r11.cubeList.add(new ModelBox(arm1base_r11, 50, 62, -0.375F, -24.0F, 0.35F, 4, 0, 2, 0.0F, false));

        this.arm1base_r12 = new ModelRenderer(this);
        this.arm1base_r12.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase11.addChild(arm1base_r12);
        this.setRotateAngle(arm1base_r12, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r12.cubeList.add(new ModelBox(arm1base_r12, 58, 59, -3.625F, -24.0F, 0.35F, 4, 0, 2, 0.005F, false));

        this.armmiddlebase12 = new ModelRenderer(this);
        this.armmiddlebase12.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core3.addChild(armmiddlebase12);
        this.setRotateAngle(armmiddlebase12, 0.0F, -1.2566F, 0.0F);


        this.armbase12 = new ModelRenderer(this);
        this.armbase12.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase12.addChild(armbase12);


        this.armmiddlebase13 = new ModelRenderer(this);
        this.armmiddlebase13.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core3.addChild(armmiddlebase13);
        this.setRotateAngle(armmiddlebase13, 0.0F, -2.5133F, 0.0F);


        this.armbase13 = new ModelRenderer(this);
        this.armbase13.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase13.addChild(armbase13);


        this.armmiddlebase14 = new ModelRenderer(this);
        this.armmiddlebase14.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core3.addChild(armmiddlebase14);
        this.setRotateAngle(armmiddlebase14, 0.0F, 2.5133F, 0.0F);


        this.armbase14 = new ModelRenderer(this);
        this.armbase14.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase14.addChild(armbase14);


        this.armmiddlebase15 = new ModelRenderer(this);
        this.armmiddlebase15.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core3.addChild(armmiddlebase15);
        this.setRotateAngle(armmiddlebase15, 0.0F, 1.2566F, 0.0F);


        this.armbase15 = new ModelRenderer(this);
        this.armbase15.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase15.addChild(armbase15);
        this.armbase15.cubeList.add(new ModelBox(armbase15, 0, 31, -1.0F, 0.9F, -4.35F, 2, 0, 4, 0.0F, false));
        this.armbase15.cubeList.add(new ModelBox(armbase15, 15, 3, -0.5F, 1.0F, -4.25F, 1, 0, 2, 0.01F, false));

        this.arm1base_r13 = new ModelRenderer(this);
        this.arm1base_r13.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase15.addChild(arm1base_r13);
        this.setRotateAngle(arm1base_r13, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r13.cubeList.add(new ModelBox(arm1base_r13, 0, 61, -0.375F, -24.0F, 0.35F, 4, 0, 2, 0.0F, false));

        this.arm1base_r14 = new ModelRenderer(this);
        this.arm1base_r14.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase15.addChild(arm1base_r14);
        this.setRotateAngle(arm1base_r14, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r14.cubeList.add(new ModelBox(arm1base_r14, 23, 57, -2.625F, -24.0F, 0.35F, 3, 0, 2, 0.005F, false));

        this.arm1base_r15 = new ModelRenderer(this);
        this.arm1base_r15.setRotationPoint(0.0F, 0.99F, -1.25F);
        this.armbase15.addChild(arm1base_r15);
        this.setRotateAngle(arm1base_r15, 0.0F, -0.7418F, 0.0F);
        this.arm1base_r15.cubeList.add(new ModelBox(arm1base_r15, 0, 19, -1.5F, 0.0F, -0.8F, 3, 0, 2, 0.005F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.6F, -3.1F, 0.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 3.1416F, 0.0F, 0.0F);


        this.core = new ModelRenderer(this);
        this.core.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.root.addChild(core);
        this.core.cubeList.add(new ModelBox(core, 25, 46, -3.0F, -0.975F, -4.0F, 6, 0, 6, 0.01F, false));
        this.core.cubeList.add(new ModelBox(core, 13, 0, -1.0F, -0.825F, -2.1F, 2, 0, 2, 0.0F, false));

        this.armmiddlebase = new ModelRenderer(this);
        this.armmiddlebase.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase);


        this.armbase = new ModelRenderer(this);
        this.armbase.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase.addChild(armbase);
        this.armbase.cubeList.add(new ModelBox(armbase, 13, 57, -1.5F, 0.0F, -2.25F, 3, 0, 3, 0.01F, false));
        this.armbase.cubeList.add(new ModelBox(armbase, 19, 46, -0.5F, 0.0F, -4.25F, 1, 0, 2, 0.01F, false));

        this.arm1base_r16 = new ModelRenderer(this);
        this.arm1base_r16.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase.addChild(arm1base_r16);
        this.setRotateAngle(arm1base_r16, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r16.cubeList.add(new ModelBox(arm1base_r16, 13, 67, -0.375F, -25.0F, 0.35F, 4, 0, 2, 0.0F, false));

        this.arm1base_r17 = new ModelRenderer(this);
        this.arm1base_r17.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase.addChild(arm1base_r17);
        this.setRotateAngle(arm1base_r17, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r17.cubeList.add(new ModelBox(arm1base_r17, 26, 67, -3.625F, -25.0F, 0.35F, 4, 0, 2, 0.005F, false));

        this.armmiddlebase2 = new ModelRenderer(this);
        this.armmiddlebase2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase2);
        this.setRotateAngle(armmiddlebase2, 0.0F, -1.2566F, 0.0F);


        this.armbase2 = new ModelRenderer(this);
        this.armbase2.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase2.addChild(armbase2);
        this.armbase2.cubeList.add(new ModelBox(armbase2, 0, 57, -1.5F, -0.015F, -2.25F, 3, 0, 3, 0.01F, false));
        this.armbase2.cubeList.add(new ModelBox(armbase2, 46, 0, -0.5F, 0.0F, -4.25F, 1, 0, 2, 0.01F, false));

        this.arm1base_r18 = new ModelRenderer(this);
        this.arm1base_r18.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase2.addChild(arm1base_r18);
        this.setRotateAngle(arm1base_r18, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r18.cubeList.add(new ModelBox(arm1base_r18, 61, 66, -0.375F, -25.0F, 0.35F, 4, 0, 2, 0.0F, false));

        this.arm1base_r19 = new ModelRenderer(this);
        this.arm1base_r19.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase2.addChild(arm1base_r19);
        this.setRotateAngle(arm1base_r19, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r19.cubeList.add(new ModelBox(arm1base_r19, 0, 67, -3.625F, -25.0F, 0.35F, 4, 0, 2, 0.005F, false));

        this.armmiddlebase3 = new ModelRenderer(this);
        this.armmiddlebase3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase3);
        this.setRotateAngle(armmiddlebase3, 0.0F, -2.5133F, 0.0F);


        this.armbase3 = new ModelRenderer(this);
        this.armbase3.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase3.addChild(armbase3);
        this.armbase3.cubeList.add(new ModelBox(armbase3, 26, 53, -1.5F, -0.01F, -2.25F, 3, 0, 3, 0.005F, false));
        this.armbase3.cubeList.add(new ModelBox(armbase3, 8, 6, -0.5F, 0.15F, -4.25F, 1, 0, 5, 0.0F, false));
        this.armbase3.cubeList.add(new ModelBox(armbase3, 11, 39, -0.5F, 0.0F, -4.25F, 1, 0, 2, 0.01F, false));

        this.arm1base_r20 = new ModelRenderer(this);
        this.arm1base_r20.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase3.addChild(arm1base_r20);
        this.setRotateAngle(arm1base_r20, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r20.cubeList.add(new ModelBox(arm1base_r20, 39, 64, -0.375F, -25.0F, 0.35F, 4, 0, 2, 0.0F, false));

        this.arm1base_r21 = new ModelRenderer(this);
        this.arm1base_r21.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase3.addChild(arm1base_r21);
        this.setRotateAngle(arm1base_r21, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r21.cubeList.add(new ModelBox(arm1base_r21, 50, 65, -3.625F, -25.0F, 0.35F, 4, 0, 2, 0.005F, false));

        this.armmiddlebase4 = new ModelRenderer(this);
        this.armmiddlebase4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase4);
        this.setRotateAngle(armmiddlebase4, 0.0F, 2.5133F, 0.0F);


        this.armbase4 = new ModelRenderer(this);
        this.armbase4.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase4.addChild(armbase4);
        this.armbase4.cubeList.add(new ModelBox(armbase4, 13, 53, -1.5F, 0.0F, -2.25F, 3, 0, 3, 0.01F, false));
        this.armbase4.cubeList.add(new ModelBox(armbase4, 11, 35, -0.5F, 0.0F, -4.25F, 1, 0, 2, 0.01F, false));
        this.armbase4.cubeList.add(new ModelBox(armbase4, 0, 11, -0.5F, 0.15F, -4.25F, 1, 0, 5, 0.0F, false));

        this.arm1base_r22 = new ModelRenderer(this);
        this.arm1base_r22.setRotationPoint(-1.3674F, 0.1F, 1.5427F);
        this.armbase4.addChild(arm1base_r22);
        this.setRotateAngle(arm1base_r22, -3.1416F, 1.1345F, 3.1416F);
        this.arm1base_r22.cubeList.add(new ModelBox(arm1base_r22, 47, 13, 1.4334F, 0.0F, -2.3435F, 2, 0, 1, 0.0F, false));
        this.arm1base_r22.cubeList.add(new ModelBox(arm1base_r22, 68, 10, 0.9485F, -0.05F, -0.7141F, 2, 0, 1, 0.0F, false));

        this.arm1base_r23 = new ModelRenderer(this);
        this.arm1base_r23.setRotationPoint(-1.3674F, 0.1F, 1.5427F);
        this.armbase4.addChild(arm1base_r23);
        this.setRotateAngle(arm1base_r23, 0.0F, 0.5236F, 0.0F);
        this.arm1base_r23.cubeList.add(new ModelBox(arm1base_r23, 0, 41, -3.4053F, -0.05F, -2.2468F, 2, 0, 1, 0.0F, false));
        this.arm1base_r23.cubeList.add(new ModelBox(arm1base_r23, 44, 48, -2.9204F, -0.05F, -0.6174F, 2, 0, 1, 0.0F, false));

        this.arm1base_r24 = new ModelRenderer(this);
        this.arm1base_r24.setRotationPoint(-0.949F, 0.1F, 2.9692F);
        this.armbase4.addChild(arm1base_r24);
        this.setRotateAngle(arm1base_r24, -3.1416F, -0.1047F, 3.1416F);
        this.arm1base_r24.cubeList.add(new ModelBox(arm1base_r24, 44, 46, 1.42F, 0.0F, -2.5667F, 2, 0, 1, 0.0F, false));
        this.arm1base_r24.cubeList.add(new ModelBox(arm1base_r24, 68, 12, 0.9351F, -0.05F, -0.9373F, 2, 0, 1, 0.0F, false));

        this.arm1base_r25 = new ModelRenderer(this);
        this.arm1base_r25.setRotationPoint(-0.949F, 0.1F, 2.9692F);
        this.armbase4.addChild(arm1base_r25);
        this.setRotateAngle(arm1base_r25, -3.1416F, 1.3788F, 3.1416F);
        this.arm1base_r25.cubeList.add(new ModelBox(arm1base_r25, 47, 5, -3.6288F, -0.05F, -2.2529F, 2, 0, 1, 0.0F, false));
        this.arm1base_r25.cubeList.add(new ModelBox(arm1base_r25, 43, 53, -3.144F, -0.05F, -0.6235F, 2, 0, 1, 0.0F, false));

        this.arm1base_r26 = new ModelRenderer(this);
        this.arm1base_r26.setRotationPoint(-0.949F, 0.1F, 2.9692F);
        this.armbase4.addChild(arm1base_r26);
        this.setRotateAngle(arm1base_r26, -3.1416F, 0.637F, 3.1416F);
        this.arm1base_r26.cubeList.add(new ModelBox(arm1base_r26, 0, 25, -0.6743F, 0.05F, -4.9069F, 1, 0, 5, 0.0F, false));

        this.arm1base_r27 = new ModelRenderer(this);
        this.arm1base_r27.setRotationPoint(0.6684F, 0.1F, 3.1538F);
        this.armbase4.addChild(arm1base_r27);
        this.setRotateAngle(arm1base_r27, -3.1416F, 0.1309F, 3.1416F);
        this.arm1base_r27.cubeList.add(new ModelBox(arm1base_r27, 47, 9, -3.653F, -0.05F, -2.317F, 2, 0, 1, 0.0F, false));
        this.arm1base_r27.cubeList.add(new ModelBox(arm1base_r27, 44, 50, -3.1681F, -0.05F, -0.6876F, 2, 0, 1, 0.0F, false));

        this.arm1base_r28 = new ModelRenderer(this);
        this.arm1base_r28.setRotationPoint(0.6684F, 0.1F, 3.1538F);
        this.armbase4.addChild(arm1base_r28);
        this.setRotateAngle(arm1base_r28, -3.1416F, -1.3526F, 3.1416F);
        this.arm1base_r28.cubeList.add(new ModelBox(arm1base_r28, 24, 46, 1.4817F, 0.0F, -2.5964F, 2, 0, 1, 0.0F, false));
        this.arm1base_r28.cubeList.add(new ModelBox(arm1base_r28, 68, 4, 0.9968F, -0.05F, -0.967F, 2, 0, 1, 0.0F, false));

        this.arm1base_r29 = new ModelRenderer(this);
        this.arm1base_r29.setRotationPoint(0.6684F, 0.1F, 3.1538F);
        this.armbase4.addChild(arm1base_r29);
        this.setRotateAngle(arm1base_r29, -3.1416F, -0.6109F, 3.1416F);
        this.arm1base_r29.cubeList.add(new ModelBox(arm1base_r29, 8, 12, -0.6489F, 0.05F, -4.9705F, 1, 0, 5, 0.0F, false));

        this.arm1base_r30 = new ModelRenderer(this);
        this.arm1base_r30.setRotationPoint(1.1323F, 0.1F, 1.5807F);
        this.armbase4.addChild(arm1base_r30);
        this.setRotateAngle(arm1base_r30, -3.1416F, -1.1345F, 3.1416F);
        this.arm1base_r30.cubeList.add(new ModelBox(arm1base_r30, 36, 53, -3.5954F, -0.05F, -2.5031F, 2, 0, 1, 0.0F, false));
        this.arm1base_r30.cubeList.add(new ModelBox(arm1base_r30, 44, 67, -3.1105F, -0.05F, -0.8738F, 2, 0, 1, 0.0F, false));

        this.arm1base_r31 = new ModelRenderer(this);
        this.arm1base_r31.setRotationPoint(1.1323F, 0.1F, 1.5807F);
        this.armbase4.addChild(arm1base_r31);
        this.setRotateAngle(arm1base_r31, 0.0F, -1.2654F, 0.0F);
        this.arm1base_r31.cubeList.add(new ModelBox(arm1base_r31, 0, 5, -0.4806F, 0.05F, -5.0688F, 1, 0, 5, 0.0F, false));

        this.arm1base_r32 = new ModelRenderer(this);
        this.arm1base_r32.setRotationPoint(1.1323F, 0.1F, 1.5807F);
        this.armbase4.addChild(arm1base_r32);
        this.setRotateAngle(arm1base_r32, 0.0F, -0.5236F, 0.0F);
        this.arm1base_r32.cubeList.add(new ModelBox(arm1base_r32, 68, 6, 1.1873F, -0.05F, -0.9258F, 2, 0, 1, 0.0F, false));
        this.arm1base_r32.cubeList.add(new ModelBox(arm1base_r32, 19, 49, 1.6721F, 0.0F, -2.5552F, 2, 0, 1, 0.0F, false));

        this.arm1base_r33 = new ModelRenderer(this);
        this.arm1base_r33.setRotationPoint(-9.9947F, 0.15F, -0.7208F);
        this.armbase4.addChild(arm1base_r33);
        this.setRotateAngle(arm1base_r33, 0.0F, 0.7418F, 0.0F);
        this.arm1base_r33.cubeList.add(new ModelBox(arm1base_r33, 68, 8, 7.5017F, -0.1F, 6.9485F, 2, 0, 1, 0.0F, false));
        this.arm1base_r33.cubeList.add(new ModelBox(arm1base_r33, 37, 67, 7.9866F, -0.05F, 5.3191F, 2, 0, 1, 0.0F, false));

        this.arm1base_r34 = new ModelRenderer(this);
        this.arm1base_r34.setRotationPoint(-1.2053F, 0.15F, -0.7208F);
        this.armbase4.addChild(arm1base_r34);
        this.setRotateAngle(arm1base_r34, 0.0F, -0.7418F, 0.0F);
        this.arm1base_r34.cubeList.add(new ModelBox(arm1base_r34, 68, 2, -1.196F, -0.1F, -0.5399F, 2, 0, 1, 0.0F, false));
        this.arm1base_r34.cubeList.add(new ModelBox(arm1base_r34, 68, 0, -1.6809F, -0.1F, -2.1693F, 2, 0, 1, 0.0F, false));

        this.arm1base_r35 = new ModelRenderer(this);
        this.arm1base_r35.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase4.addChild(arm1base_r35);
        this.setRotateAngle(arm1base_r35, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r35.cubeList.add(new ModelBox(arm1base_r35, 13, 64, -0.375F, -25.0F, 0.35F, 4, 0, 2, 0.0F, false));

        this.arm1base_r36 = new ModelRenderer(this);
        this.arm1base_r36.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase4.addChild(arm1base_r36);
        this.setRotateAngle(arm1base_r36, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r36.cubeList.add(new ModelBox(arm1base_r36, 26, 64, -3.625F, -25.0F, 0.35F, 4, 0, 2, 0.005F, false));

        this.armmiddlebase5 = new ModelRenderer(this);
        this.armmiddlebase5.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase5);
        this.setRotateAngle(armmiddlebase5, 0.0F, 1.2566F, 0.0F);


        this.armbase5 = new ModelRenderer(this);
        this.armbase5.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase5.addChild(armbase5);
        this.armbase5.cubeList.add(new ModelBox(armbase5, 0, 53, -1.5F, -0.01F, -2.25F, 3, 0, 3, 0.005F, false));
        this.armbase5.cubeList.add(new ModelBox(armbase5, 9, 32, -0.5F, 0.0F, -4.25F, 1, 0, 2, 0.01F, false));

        this.arm1base_r37 = new ModelRenderer(this);
        this.arm1base_r37.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase5.addChild(arm1base_r37);
        this.setRotateAngle(arm1base_r37, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r37.cubeList.add(new ModelBox(arm1base_r37, 61, 63, -0.375F, -25.0F, 0.35F, 4, 0, 2, 0.0F, false));

        this.arm1base_r38 = new ModelRenderer(this);
        this.arm1base_r38.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase5.addChild(arm1base_r38);
        this.setRotateAngle(arm1base_r38, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r38.cubeList.add(new ModelBox(arm1base_r38, 0, 64, -3.625F, -25.0F, 0.35F, 4, 0, 2, 0.005F, false));

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
