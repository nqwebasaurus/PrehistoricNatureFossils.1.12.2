package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTremaglaspis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer matrix;
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
    private final ModelRenderer tremaglaspis;
    private final ModelRenderer carapace;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer thorax;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer telson;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;

    public ModelSkeletonTremaglaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 25.0F, 0.0F);


        this.matrix = new ModelRenderer(this);
        this.matrix.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.fossil.addChild(matrix);
        this.matrix.cubeList.add(new ModelBox(matrix, 20, 25, -2.0F, -3.25F, -1.0F, 5, 1, 5, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.25F, -4.25F);
        this.matrix.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2135F, -0.6918F, -0.0772F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 10, -2.0F, -2.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.matrix.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0445F, 0.218F, -0.0058F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 34, -1.0F, -4.0F, -4.0F, 3, 2, 5, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.8F, -2.2F, 1.85F);
        this.matrix.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0159F, -0.3487F, 0.0464F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 22, -2.0F, -1.0F, -1.0F, 5, 1, 2, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -3.0F, 1.85F);
        this.matrix.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0159F, -0.3487F, 0.0464F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 19, -2.0F, -1.0F, -1.0F, 5, 1, 2, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.275F, 0.0F);
        this.matrix.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3808F, -0.4627F, 0.0256F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 41, -1.0F, -4.0F, -1.0F, 4, 1, 2, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(3.1F, -0.3F, 2.6F);
        this.matrix.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.6109F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 14, -4.0F, -3.0F, -3.0F, 6, 1, 4, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(3.7F, 0.0F, 4.4F);
        this.matrix.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.6109F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 26, -4.0F, -3.0F, -3.0F, 6, 1, 4, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(3.775F, -1.85F, 1.5F);
        this.matrix.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.0036F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, -2, 19, -2.0F, -1.0F, -3.0F, 4, 1, 7, -0.8F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-5.35F, -0.9F, 2.35F);
        this.matrix.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.5672F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 10, -1.0F, -2.0F, -2.0F, 9, 1, 3, -0.07F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.75F, -1.0F, -2.55F);
        this.matrix.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -1.309F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 38, -1.0F, -2.0F, -2.0F, 5, 1, 3, -0.06F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.75F, -3.725F, -2.3F);
        this.matrix.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 2.4624F, 1.2905F, 2.4662F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 0, -1.0F, -1.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.25F, -3.25F, -2.0F);
        this.matrix.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -3.0041F, 1.2624F, -2.9974F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 20, -4.0F, -1.0F, -1.0F, 6, 2, 4, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.4F, 0.1F, -4.525F);
        this.matrix.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.5236F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 14, -3.0F, -3.0F, -3.0F, 6, 1, 5, -0.06F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.25F, 0.225F, -4.7F);
        this.matrix.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1011F, 0.3885F, 0.0116F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 38, -2.0F, -4.0F, -2.0F, 4, 1, 4, 0.05F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.0F, -0.4F, -3.0F);
        this.matrix.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0554F, -0.7822F, -0.1639F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 40, 25, -2.0F, -4.0F, -1.0F, 3, 2, 3, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.matrix.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.2618F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -5.0F, -3.0F, -6.0F, 8, 1, 9, 0.02F, false));

        this.tremaglaspis = new ModelRenderer(this);
        this.tremaglaspis.setRotationPoint(0.0F, -3.1F, 0.0F);
        this.fossil.addChild(tremaglaspis);
        this.setRotateAngle(tremaglaspis, 0.0436F, 0.6109F, 0.0F);


        this.carapace = new ModelRenderer(this);
        this.carapace.setRotationPoint(-0.5F, -0.1F, 0.0F);
        this.tremaglaspis.addChild(carapace);
        this.carapace.cubeList.add(new ModelBox(carapace, 20, 43, 0.0F, -2.0F, -5.0F, 1, 1, 2, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 42, 13, -1.0F, -1.25F, -5.0F, 3, 1, 2, -0.05F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.1548F, -6.8126F);
        this.carapace.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 1.4399F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 27, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.8126F, -1.1548F, -3.0F);
        this.carapace.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -1.1345F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 46, -1.0F, 0.0F, -2.0F, 1, 1, 2, -0.002F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.carapace.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.4363F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 32, 42, -2.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.carapace.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3922F, 0.1964F, -0.4408F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 12, 41, -2.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 46, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, -2.0F, -3.0F);
        this.carapace.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.4363F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 16, 0.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(2.8126F, -1.1548F, -3.0F);
        this.carapace.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 1.1345F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 32, 45, 0.0F, 0.0F, -2.0F, 1, 1, 2, -0.002F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, -2.0F, -5.0F);
        this.carapace.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3922F, -0.1964F, 0.4408F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 16, 29, 1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 38, 45, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.carapace.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.4363F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 6, 44, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.thorax = new ModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, -1.8F, -3.0F);
        this.carapace.addChild(thorax);
        this.setRotateAngle(thorax, -0.1745F, 0.0873F, 0.0F);
        this.thorax.cubeList.add(new ModelBox(thorax, 34, 6, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));
        this.thorax.cubeList.add(new ModelBox(thorax, 0, 27, -0.5F, 0.5F, -0.1F, 2, 1, 6, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.4932F, 0.7347F, 5.7441F);
        this.thorax.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1106F, 0.2585F, -0.2995F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 12, 43, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.1152F, 0.25F, 2.6736F);
        this.thorax.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0262F, 0.0396F, -0.3054F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 32, 31, -1.8F, -0.1F, -3.0F, 2, 1, 6, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(2.4932F, 0.7347F, 5.7441F);
        this.thorax.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1106F, -0.2585F, 0.2995F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 40, 42, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.8848F, 0.25F, 2.6736F);
        this.thorax.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0262F, -0.0396F, 0.3054F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 16, 31, -0.2F, -0.1F, -3.0F, 2, 1, 6, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.thorax.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1309F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 44, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.001F, false));

        this.telson = new ModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.275F, 7.975F);
        this.thorax.addChild(telson);
        this.setRotateAngle(telson, -0.2618F, 0.2182F, 0.0F);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.25F, 0.3861F, -0.0171F);
        this.telson.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0309F, -0.0308F, -0.7849F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 12, 46, -0.5F, 0.1F, -0.75F, 1, 1, 2, -0.002F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(1.25F, 0.3861F, -0.0171F);
        this.telson.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0309F, 0.0308F, 0.7849F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 44, 45, -0.5F, 0.1F, -0.75F, 1, 1, 2, -0.002F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -0.275F, -2.0F);
        this.telson.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1309F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 26, 43, 0.0F, 0.0F, 2.0F, 1, 1, 2, -0.002F, false));

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
