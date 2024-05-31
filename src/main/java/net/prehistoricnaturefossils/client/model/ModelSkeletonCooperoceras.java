package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCooperoceras extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer whole;
    private final ModelRenderer shell_r1;
    private final ModelRenderer shell_r2;
    private final ModelRenderer shell_r3;
    private final ModelRenderer shell_r4;
    private final ModelRenderer shell_r5;
    private final ModelRenderer shell_r6;
    private final ModelRenderer shell_r7;
    private final ModelRenderer spike_r1;
    private final ModelRenderer spike_r2;
    private final ModelRenderer spike_r3;
    private final ModelRenderer spike_r4;
    private final ModelRenderer shell_r8;
    private final ModelRenderer shell_r9;
    private final ModelRenderer shell_r10;
    private final ModelRenderer shell_r11;
    private final ModelRenderer rightspikecurved;
    private final ModelRenderer spike_r5;
    private final ModelRenderer spike_r6;
    private final ModelRenderer bone;
    private final ModelRenderer spike_r7;
    private final ModelRenderer spike_r8;
    private final ModelRenderer spike_r9;
    private final ModelRenderer spike_r10;
    private final ModelRenderer spike_r11;
    private final ModelRenderer spike_r12;
    private final ModelRenderer spike_r13;
    private final ModelRenderer spike_r14;
    private final ModelRenderer spike_r15;
    private final ModelRenderer spike_r16;
    private final ModelRenderer spike_r17;
    private final ModelRenderer spike_r18;
    private final ModelRenderer bone8;
    private final ModelRenderer spike_r19;
    private final ModelRenderer spike_r20;
    private final ModelRenderer spike_r21;
    private final ModelRenderer spike_r22;
    private final ModelRenderer bone3;
    private final ModelRenderer spike_r23;
    private final ModelRenderer spike_r24;
    private final ModelRenderer spike_r25;
    private final ModelRenderer spike_r26;
    private final ModelRenderer bone4;
    private final ModelRenderer spike_r27;
    private final ModelRenderer spike_r28;
    private final ModelRenderer spike_r29;
    private final ModelRenderer bone5;
    private final ModelRenderer bone7;
    private final ModelRenderer spike_r30;
    private final ModelRenderer spike_r31;
    private final ModelRenderer bone6;
    private final ModelRenderer spike_r32;
    private final ModelRenderer spike_r33;
    private final ModelRenderer leftspikecurved;
    private final ModelRenderer spike_r34;
    private final ModelRenderer spike_r35;
    private final ModelRenderer bone2;
    private final ModelRenderer spike_r36;
    private final ModelRenderer spike_r37;

    public ModelSkeletonCooperoceras() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 4.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 87, 58, -8.0F, -18.0F, -5.0F, 2, 16, 2, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 61, 84, 6.0F, -18.0F, -5.0F, 2, 16, 2, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 25, 77, 5.0F, -26.0F, -19.0F, 2, 24, 2, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -9.0F, -2.0F, -20.0F, 18, 2, 32, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 34, 84, -7.0F, -26.0F, -19.0F, 2, 24, 2, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 43, 84, 3.0F, -25.0F, 9.0F, 2, 23, 2, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 52, 84, -5.0F, -25.0F, 9.0F, 2, 23, 2, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-7.0F, -6.0F, 10.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 66, 58, -18.0F, -10.0F, -1.0F, 2, 6, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 70, 91, -19.0F, -12.0F, -29.0F, 2, 10, 2, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-7.0F, -8.0F, -4.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 78, 58, -7.0F, -13.0F, -1.0F, 2, 12, 2, 0.0F, false));

        this.whole = new ModelRenderer(this);
        this.whole.setRotationPoint(-0.0088F, -29.3555F, -1.5673F);
        this.fossil.addChild(whole);
        this.setRotateAngle(whole, -2.7314F, 0.0F, 0.0F);


        this.shell_r1 = new ModelRenderer(this);
        this.shell_r1.setRotationPoint(3.5088F, 12.3892F, 12.2191F);
        this.whole.addChild(shell_r1);
        this.setRotateAngle(shell_r1, 0.1745F, 0.0F, 0.0F);
        this.shell_r1.cubeList.add(new ModelBox(shell_r1, 47, 35, -10.0F, -10.25F, -0.25F, 2, 6, 4, 0.0F, false));
        this.shell_r1.cubeList.add(new ModelBox(shell_r1, 34, 35, 1.0F, -10.25F, -0.25F, 2, 6, 4, 0.0F, false));
        this.shell_r1.cubeList.add(new ModelBox(shell_r1, 0, 21, -10.0F, -10.25F, 3.75F, 13, 6, 2, 0.0F, false));

        this.shell_r2 = new ModelRenderer(this);
        this.shell_r2.setRotationPoint(-0.7412F, -6.6108F, 1.2191F);
        this.whole.addChild(shell_r2);
        this.setRotateAngle(shell_r2, 0.6109F, 0.0F, 0.0F);
        this.shell_r2.cubeList.add(new ModelBox(shell_r2, 0, 62, -2.25F, 3.5322F, -17.2149F, 6, 6, 8, 0.0F, false));

        this.shell_r3 = new ModelRenderer(this);
        this.shell_r3.setRotationPoint(-0.7412F, -6.6108F, 1.2191F);
        this.whole.addChild(shell_r3);
        this.setRotateAngle(shell_r3, 0.1309F, 0.0F, 0.0F);
        this.shell_r3.cubeList.add(new ModelBox(shell_r3, 0, 0, -2.75F, 0.2822F, -14.2149F, 7, 12, 8, 0.0F, false));

        this.shell_r4 = new ModelRenderer(this);
        this.shell_r4.setRotationPoint(-0.7412F, -6.6108F, 1.2191F);
        this.whole.addChild(shell_r4);
        this.setRotateAngle(shell_r4, -0.829F, 0.0F, 0.0F);
        this.shell_r4.cubeList.add(new ModelBox(shell_r4, 69, 0, -3.25F, -1.9678F, -8.2149F, 8, 14, 10, 0.0F, false));

        this.shell_r5 = new ModelRenderer(this);
        this.shell_r5.setRotationPoint(-0.7412F, -6.6108F, 1.2191F);
        this.whole.addChild(shell_r5);
        this.setRotateAngle(shell_r5, -0.0436F, 0.0F, 0.0F);
        this.shell_r5.cubeList.add(new ModelBox(shell_r5, 35, 58, -3.75F, -7.2178F, -5.4649F, 9, 13, 12, 0.0F, false));

        this.shell_r6 = new ModelRenderer(this);
        this.shell_r6.setRotationPoint(-0.7412F, -2.6108F, 10.2191F);
        this.whole.addChild(shell_r6);
        this.setRotateAngle(shell_r6, 0.5672F, 0.0F, 0.0F);
        this.shell_r6.cubeList.add(new ModelBox(shell_r6, 0, 35, -4.25F, -10.427F, -8.6562F, 10, 13, 13, 0.0F, false));

        this.shell_r7 = new ModelRenderer(this);
        this.shell_r7.setRotationPoint(-0.2412F, 5.3892F, -4.7809F);
        this.whole.addChild(shell_r7);
        this.setRotateAngle(shell_r7, 0.6109F, 0.0F, 0.0F);
        this.shell_r7.cubeList.add(new ModelBox(shell_r7, 70, 76, -1.75F, 1.2349F, 0.1785F, 4, 6, 8, 0.0F, false));

        this.spike_r1 = new ModelRenderer(this);
        this.spike_r1.setRotationPoint(3.2088F, 10.9892F, -2.7809F);
        this.whole.addChild(spike_r1);
        this.setRotateAngle(spike_r1, -0.2638F, -0.1635F, 1.0071F);
        this.spike_r1.cubeList.add(new ModelBox(spike_r1, 92, 35, -2.2F, 0.1548F, 0.4056F, 5, 1, 1, 0.0F, false));

        this.spike_r2 = new ModelRenderer(this);
        this.spike_r2.setRotationPoint(-2.1912F, 10.9892F, -2.7809F);
        this.whole.addChild(spike_r2);
        this.setRotateAngle(spike_r2, -0.2638F, 0.1635F, -1.0071F);
        this.spike_r2.cubeList.add(new ModelBox(spike_r2, 96, 38, -3.3F, -0.7452F, 0.0056F, 4, 1, 1, 0.0F, false));

        this.spike_r3 = new ModelRenderer(this);
        this.spike_r3.setRotationPoint(3.2088F, 9.7892F, 0.6191F);
        this.whole.addChild(spike_r3);
        this.setRotateAngle(spike_r3, -0.0591F, -0.4536F, 0.944F);
        this.spike_r3.cubeList.add(new ModelBox(spike_r3, 69, 0, -1.2F, 0.1548F, 0.4056F, 3, 1, 1, -0.1F, false));

        this.spike_r4 = new ModelRenderer(this);
        this.spike_r4.setRotationPoint(-2.1912F, 9.7892F, 0.6191F);
        this.whole.addChild(spike_r4);
        this.setRotateAngle(spike_r4, -0.0591F, 0.4536F, -0.944F);
        this.spike_r4.cubeList.add(new ModelBox(spike_r4, 0, 3, -0.3F, -0.7452F, 0.0056F, 1, 1, 1, -0.1F, false));

        this.shell_r8 = new ModelRenderer(this);
        this.shell_r8.setRotationPoint(-0.2412F, 5.3892F, -4.7809F);
        this.whole.addChild(shell_r8);
        this.setRotateAngle(shell_r8, -0.0873F, 0.0F, 0.0F);
        this.shell_r8.cubeList.add(new ModelBox(shell_r8, 0, 77, -2.25F, -1.5151F, -1.8215F, 5, 7, 7, 0.0F, false));

        this.shell_r9 = new ModelRenderer(this);
        this.shell_r9.setRotationPoint(3.5088F, 4.3892F, -1.7809F);
        this.whole.addChild(shell_r9);
        this.setRotateAngle(shell_r9, 0.8727F, -0.0436F, 0.0F);
        this.shell_r9.cubeList.add(new ModelBox(shell_r9, 85, 35, -3.9393F, -5.7495F, 4.6307F, 1, 8, 4, 0.0F, false));

        this.shell_r10 = new ModelRenderer(this);
        this.shell_r10.setRotationPoint(3.5088F, 12.3892F, 12.2191F);
        this.whole.addChild(shell_r10);
        this.setRotateAngle(shell_r10, -0.0873F, -0.0436F, 0.0F);
        this.shell_r10.cubeList.add(new ModelBox(shell_r10, 0, 35, -5.05F, -12.5F, -12.25F, 2, 8, 4, 0.0F, false));

        this.shell_r11 = new ModelRenderer(this);
        this.shell_r11.setRotationPoint(3.5088F, 12.3892F, 12.2191F);
        this.whole.addChild(shell_r11);
        this.setRotateAngle(shell_r11, 0.0436F, 0.0F, 0.0F);
        this.shell_r11.cubeList.add(new ModelBox(shell_r11, 47, 35, -9.5F, -15.75F, -9.25F, 12, 9, 13, 0.0F, false));

        this.rightspikecurved = new ModelRenderer(this);
        this.rightspikecurved.setRotationPoint(3.2088F, 10.9892F, -6.6809F);
        this.whole.addChild(rightspikecurved);


        this.spike_r5 = new ModelRenderer(this);
        this.spike_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightspikecurved.addChild(spike_r5);
        this.setRotateAngle(spike_r5, -0.2605F, 0.0473F, 0.9506F);
        this.spike_r5.cubeList.add(new ModelBox(spike_r5, 0, 92, -3.2F, 0.1548F, 0.4056F, 5, 1, 1, 0.0F, false));

        this.spike_r6 = new ModelRenderer(this);
        this.spike_r6.setRotationPoint(0.3F, 1.7F, 0.4F);
        this.rightspikecurved.addChild(spike_r6);
        this.setRotateAngle(spike_r6, -0.2924F, 0.4676F, 0.8283F);
        this.spike_r6.cubeList.add(new ModelBox(spike_r6, 23, 3, -0.3F, -0.3858F, -0.1788F, 3, 1, 1, -0.2F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightspikecurved.addChild(bone);
        this.setRotateAngle(bone, -0.1309F, 0.0F, 0.0F);


        this.spike_r7 = new ModelRenderer(this);
        this.spike_r7.setRotationPoint(-3.3F, -8.1141F, -6.0124F);
        this.bone.addChild(spike_r7);
        this.setRotateAngle(spike_r7, -0.4842F, 0.431F, 0.8501F);
        this.spike_r7.cubeList.add(new ModelBox(spike_r7, 66, 67, 3.3145F, -1.0914F, 3.8735F, 4, 1, 1, 0.1F, false));

        this.spike_r8 = new ModelRenderer(this);
        this.spike_r8.setRotationPoint(-1.8F, -24.4444F, 4.0849F);
        this.bone.addChild(spike_r8);
        this.setRotateAngle(spike_r8, 2.7721F, -0.1159F, -0.7708F);
        this.spike_r8.cubeList.add(new ModelBox(spike_r8, 69, 28, 1.8114F, -1.6098F, -0.4733F, 5, 1, 1, 0.5F, false));

        this.spike_r9 = new ModelRenderer(this);
        this.spike_r9.setRotationPoint(4.2F, -29.4444F, 3.9849F);
        this.bone.addChild(spike_r9);
        this.setRotateAngle(spike_r9, 2.709F, 0.4363F, -0.9539F);
        this.spike_r9.cubeList.add(new ModelBox(spike_r9, 21, 65, -0.8889F, -0.6371F, -0.6481F, 5, 1, 1, 0.1F, false));

        this.spike_r10 = new ModelRenderer(this);
        this.spike_r10.setRotationPoint(-3.8F, -24.4444F, 4.0849F);
        this.bone.addChild(spike_r10);
        this.setRotateAngle(spike_r10, 2.8314F, -0.0078F, 0.7592F);
        this.spike_r10.cubeList.add(new ModelBox(spike_r10, 43, 35, -4.1473F, -2.1894F, -1.0177F, 1, 1, 1, 0.5F, false));

        this.spike_r11 = new ModelRenderer(this);
        this.spike_r11.setRotationPoint(-0.8F, -16.7444F, -5.1151F);
        this.bone.addChild(spike_r11);
        this.setRotateAngle(spike_r11, -1.6871F, 0.7732F, 0.0943F);
        this.spike_r11.cubeList.add(new ModelBox(spike_r11, 79, 91, 0.3864F, -0.2504F, -0.1248F, 5, 1, 1, 0.2F, false));

        this.spike_r12 = new ModelRenderer(this);
        this.spike_r12.setRotationPoint(2.2F, -16.7444F, -8.1151F);
        this.bone.addChild(spike_r12);
        this.setRotateAngle(spike_r12, -1.3439F, 0.7854F, 0.6498F);
        this.spike_r12.cubeList.add(new ModelBox(spike_r12, 87, 77, 0.2715F, -0.3689F, -0.2735F, 5, 1, 1, -0.1F, false));

        this.spike_r13 = new ModelRenderer(this);
        this.spike_r13.setRotationPoint(-9.4F, -15.6444F, -8.6151F);
        this.bone.addChild(spike_r13);
        this.setRotateAngle(spike_r13, -1.3439F, -0.7854F, -0.4438F);
        this.spike_r13.cubeList.add(new ModelBox(spike_r13, 96, 0, -4.6366F, -0.3712F, -0.7375F, 5, 1, 1, -0.1F, false));

        this.spike_r14 = new ModelRenderer(this);
        this.spike_r14.setRotationPoint(-6.4F, -16.6444F, -5.6151F);
        this.bone.addChild(spike_r14);
        this.setRotateAngle(spike_r14, -1.5207F, -0.7246F, -0.2506F);
        this.spike_r14.cubeList.add(new ModelBox(spike_r14, 95, 25, -5.1859F, -0.1984F, -0.3206F, 5, 1, 1, 0.2F, false));

        this.spike_r15 = new ModelRenderer(this);
        this.spike_r15.setRotationPoint(-0.3F, -9.1444F, -5.9151F);
        this.bone.addChild(spike_r15);
        this.setRotateAngle(spike_r15, -1.0821F, 0.6283F, 0.4887F);
        this.spike_r15.cubeList.add(new ModelBox(spike_r15, 69, 25, 0.3864F, -0.2504F, -0.1248F, 5, 1, 1, 0.1F, false));

        this.spike_r16 = new ModelRenderer(this);
        this.spike_r16.setRotationPoint(-6.1F, -8.8444F, -5.9151F);
        this.bone.addChild(spike_r16);
        this.setRotateAngle(spike_r16, -1.0948F, -0.7346F, -0.3517F);
        this.spike_r16.cubeList.add(new ModelBox(spike_r16, 82, 28, -9.3694F, -0.4556F, 0.3272F, 5, 1, 1, -0.1F, false));

        this.spike_r17 = new ModelRenderer(this);
        this.spike_r17.setRotationPoint(-6.1F, -8.8444F, -5.9151F);
        this.bone.addChild(spike_r17);
        this.setRotateAngle(spike_r17, -1.0821F, -0.6283F, -0.4887F);
        this.spike_r17.cubeList.add(new ModelBox(spike_r17, 12, 94, -5.1859F, -0.1984F, -0.3206F, 5, 1, 1, 0.1F, false));

        this.spike_r18 = new ModelRenderer(this);
        this.spike_r18.setRotationPoint(-3.3F, -8.1141F, -6.0124F);
        this.bone.addChild(spike_r18);
        this.setRotateAngle(spike_r18, -0.5516F, 0.7183F, 0.7153F);
        this.spike_r18.cubeList.add(new ModelBox(spike_r18, 23, 0, 5.5928F, -1.1147F, 5.9322F, 3, 1, 1, -0.1F, false));

        this.bone8 = new ModelRenderer(this);
        this.bone8.setRotationPoint(-2.4F, -20.8444F, -1.1151F);
        this.bone.addChild(bone8);


        this.spike_r19 = new ModelRenderer(this);
        this.spike_r19.setRotationPoint(0.1F, -0.1F, -0.1F);
        this.bone8.addChild(spike_r19);
        this.setRotateAngle(spike_r19, -2.7894F, 0.8378F, -0.5139F);
        this.spike_r19.cubeList.add(new ModelBox(spike_r19, 92, 94, 6.4578F, -1.7253F, -3.0651F, 5, 1, 1, 0.1F, false));

        this.spike_r20 = new ModelRenderer(this);
        this.spike_r20.setRotationPoint(0.1F, -0.1F, 0.0F);
        this.bone8.addChild(spike_r20);
        this.setRotateAngle(spike_r20, -2.8059F, 0.4991F, -0.6241F);
        this.spike_r20.cubeList.add(new ModelBox(spike_r20, 82, 25, 1.8114F, -1.6098F, -0.4733F, 5, 1, 1, 0.5F, false));

        this.spike_r21 = new ModelRenderer(this);
        this.spike_r21.setRotationPoint(-0.4F, 0.1F, 0.0F);
        this.bone8.addChild(spike_r21);
        this.setRotateAngle(spike_r21, -2.656F, -0.736F, 0.5323F);
        this.spike_r21.cubeList.add(new ModelBox(spike_r21, 87, 80, -12.9102F, -2.806F, -2.0643F, 5, 1, 1, 0.1F, false));

        this.spike_r22 = new ModelRenderer(this);
        this.spike_r22.setRotationPoint(-0.4F, 0.1F, 0.1F);
        this.bone8.addChild(spike_r22);
        this.setRotateAngle(spike_r22, -2.6909F, -0.5834F, 0.5173F);
        this.spike_r22.cubeList.add(new ModelBox(spike_r22, 92, 91, -8.1473F, -2.1894F, -1.0177F, 5, 1, 1, 0.5F, false));

        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(-1.8F, -21.9444F, 13.7849F);
        this.bone.addChild(bone3);
        this.setRotateAngle(bone3, -0.3054F, 0.0F, 0.0F);


        this.spike_r23 = new ModelRenderer(this);
        this.spike_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone3.addChild(spike_r23);
        this.setRotateAngle(spike_r23, 2.7721F, -0.1159F, -0.7708F);
        this.spike_r23.cubeList.add(new ModelBox(spike_r23, 95, 83, 1.8114F, -1.6098F, -0.4733F, 5, 1, 1, 0.5F, false));

        this.spike_r24 = new ModelRenderer(this);
        this.spike_r24.setRotationPoint(6.0F, -5.0F, -0.1F);
        this.bone3.addChild(spike_r24);
        this.setRotateAngle(spike_r24, 2.6897F, 0.5152F, -0.9959F);
        this.spike_r24.cubeList.add(new ModelBox(spike_r24, 34, 65, -0.8889F, -0.6371F, -0.3981F, 5, 1, 1, 0.1F, false));

        this.spike_r25 = new ModelRenderer(this);
        this.spike_r25.setRotationPoint(-10.0F, -5.0F, -0.1F);
        this.bone3.addChild(spike_r25);
        this.setRotateAngle(spike_r25, 2.8265F, -0.5195F, 1.0051F);
        this.spike_r25.cubeList.add(new ModelBox(spike_r25, 95, 86, -3.9934F, -0.263F, 0.1745F, 5, 1, 1, 0.1F, false));

        this.spike_r26 = new ModelRenderer(this);
        this.spike_r26.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.bone3.addChild(spike_r26);
        this.setRotateAngle(spike_r26, 2.8314F, -0.0078F, 0.7592F);
        this.spike_r26.cubeList.add(new ModelBox(spike_r26, 0, 96, -8.1473F, -2.1894F, -1.0177F, 5, 1, 1, 0.5F, false));

        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 0.5F, 1.3F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, -0.5149F, 0.0F, 0.0F);


        this.spike_r27 = new ModelRenderer(this);
        this.spike_r27.setRotationPoint(0.0F, 2.0F, 7.0F);
        this.bone4.addChild(spike_r27);
        this.setRotateAngle(spike_r27, 2.8472F, -0.0427F, -0.7768F);
        this.spike_r27.cubeList.add(new ModelBox(spike_r27, 96, 41, 1.8114F, -1.6098F, -0.4733F, 3, 1, 1, 0.5F, false));

        this.spike_r28 = new ModelRenderer(this);
        this.spike_r28.setRotationPoint(-10.0F, -3.0F, 6.2F);
        this.bone4.addChild(spike_r28);
        this.setRotateAngle(spike_r28, 2.9582F, -0.6779F, 0.9306F);
        this.spike_r28.cubeList.add(new ModelBox(spike_r28, 95, 28, -3.9934F, -0.263F, 0.1745F, 5, 1, 1, 0.1F, false));

        this.spike_r29 = new ModelRenderer(this);
        this.spike_r29.setRotationPoint(-2.0F, 2.0F, 7.0F);
        this.bone4.addChild(spike_r29);
        this.setRotateAngle(spike_r29, 2.9075F, -0.0798F, 0.7558F);
        this.spike_r29.cubeList.add(new ModelBox(spike_r29, 96, 3, -8.1473F, -2.1894F, -1.0177F, 5, 1, 1, 0.5F, false));

        this.bone5 = new ModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone4.addChild(bone5);
        this.setRotateAngle(bone5, -0.5149F, 0.0F, 0.0F);


        this.bone7 = new ModelRenderer(this);
        this.bone7.setRotationPoint(-6.0F, -4.05F, 14.2F);
        this.bone5.addChild(bone7);
        this.setRotateAngle(bone7, 0.0F, 0.0F, -0.2182F);


        this.spike_r30 = new ModelRenderer(this);
        this.spike_r30.setRotationPoint(-4.0F, -3.0F, 0.0F);
        this.bone7.addChild(spike_r30);
        this.setRotateAngle(spike_r30, 2.9582F, -0.6779F, 0.9306F);
        this.spike_r30.cubeList.add(new ModelBox(spike_r30, 21, 62, -4.7934F, -0.263F, -0.3255F, 6, 1, 1, 0.1F, false));

        this.spike_r31 = new ModelRenderer(this);
        this.spike_r31.setRotationPoint(4.0F, 2.0F, 0.8F);
        this.bone7.addChild(spike_r31);
        this.setRotateAngle(spike_r31, 2.9075F, -0.0798F, 0.7558F);
        this.spike_r31.cubeList.add(new ModelBox(spike_r31, 96, 6, -9.1473F, -2.1894F, -1.0177F, 5, 1, 1, 0.5F, false));

        this.bone6 = new ModelRenderer(this);
        this.bone6.setRotationPoint(4.0F, -4.8F, 14.2F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, 0.0F, 0.0F, 0.2182F);


        this.spike_r32 = new ModelRenderer(this);
        this.spike_r32.setRotationPoint(3.0F, -3.0F, 0.0F);
        this.bone6.addChild(spike_r32);
        this.setRotateAngle(spike_r32, 2.8228F, 0.6726F, -0.9211F);
        this.spike_r32.cubeList.add(new ModelBox(spike_r32, 0, 0, -1.3889F, -0.6371F, -0.8981F, 2, 1, 1, 0.1F, false));

        this.spike_r33 = new ModelRenderer(this);
        this.spike_r33.setRotationPoint(-3.0F, 2.0F, 0.8F);
        this.bone6.addChild(spike_r33);
        this.setRotateAngle(spike_r33, 2.8472F, -0.0427F, -0.7768F);
        this.spike_r33.cubeList.add(new ModelBox(spike_r33, 79, 94, 2.8114F, -1.6098F, -0.4733F, 5, 1, 1, 0.5F, false));

        this.leftspikecurved = new ModelRenderer(this);
        this.leftspikecurved.setRotationPoint(-2.4912F, 12.6892F, -6.2809F);
        this.whole.addChild(leftspikecurved);


        this.spike_r34 = new ModelRenderer(this);
        this.spike_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftspikecurved.addChild(spike_r34);
        this.setRotateAngle(spike_r34, -0.2924F, -0.4676F, -0.8283F);
        this.spike_r34.cubeList.add(new ModelBox(spike_r34, 78, 73, -3.4793F, -1.4271F, -0.2947F, 3, 1, 1, -0.2F, false));

        this.spike_r35 = new ModelRenderer(this);
        this.spike_r35.setRotationPoint(0.3F, -1.7F, -0.4F);
        this.leftspikecurved.addChild(spike_r35);
        this.setRotateAngle(spike_r35, -0.2605F, -0.0473F, -0.9506F);
        this.spike_r35.cubeList.add(new ModelBox(spike_r35, 69, 6, -2.3F, -0.7452F, 0.0056F, 3, 1, 1, 0.0F, false));

        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftspikecurved.addChild(bone2);
        this.setRotateAngle(bone2, -0.1309F, 0.0F, 0.0F);


        this.spike_r36 = new ModelRenderer(this);
        this.spike_r36.setRotationPoint(2.4F, -9.8141F, -6.4124F);
        this.bone2.addChild(spike_r36);
        this.setRotateAngle(spike_r36, -0.518F, -0.7406F, -0.7656F);
        this.spike_r36.cubeList.add(new ModelBox(spike_r36, 69, 3, -8.4304F, -1.2875F, 5.7209F, 3, 1, 1, -0.1F, false));

        this.spike_r37 = new ModelRenderer(this);
        this.spike_r37.setRotationPoint(2.4F, -9.8141F, -6.4124F);
        this.bone2.addChild(spike_r37);
        this.setRotateAngle(spike_r37, -0.4842F, -0.431F, -0.8501F);
        this.spike_r37.cubeList.add(new ModelBox(spike_r37, 36, 62, -7.114F, -1.0394F, 3.6777F, 4, 1, 1, 0.1F, false));

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
