package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonStanocephalosaurus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer armL;
    private final ModelRenderer armL2;
    private final ModelRenderer armL3;
    private final ModelRenderer armL4;
    private final ModelRenderer armL5;
    private final ModelRenderer armL6;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer legL;
    private final ModelRenderer legL2;
    private final ModelRenderer legL3;
    private final ModelRenderer legL4;
    private final ModelRenderer legL5;
    private final ModelRenderer legL6;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer upperjaw;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;

    public ModelSkeletonStanocephalosaurus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.2F, 4.0F);
        this.fossil.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 7, 22, -0.5F, 2.03F, -10.651F, 1, 0, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 16, 26, -0.5F, -1.2F, -8.25F, 1, 1, 4, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.7F, -4.75F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.7418F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 14, -2.887F, -0.4617F, -0.5F, 2, 0, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 30, -2.887F, -0.4617F, -2.5F, 2, 0, 1, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.7F, -4.75F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.2618F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 22, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 2, -1.0F, 0.0F, -2.5F, 1, 0, 1, 0.0F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -0.7F, -4.75F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.2618F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 22, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 2, 0.0F, 0.0F, -2.5F, 1, 0, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.6F, 2.216F, -10.9F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.3491F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 0, 0.9F, 0.1F, 1.749F, 3, 0, 3, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(3.1306F, 1.0088F, -6.151F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0117F, 0.2615F, -2.3634F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 7, 0.0995F, 0.0326F, -1.0F, 3, 0, 1, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.1306F, 1.0088F, -6.151F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0117F, -0.2615F, 2.3634F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 7, -3.0995F, 0.0326F, -1.0F, 3, 0, 1, 0.0F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.6F, 2.216F, -10.9F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.3491F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 0, -3.9F, 0.1F, 1.749F, 3, 0, 3, 0.0F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -0.7F, -4.75F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.7418F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 14, 0.887F, -0.4617F, -0.5F, 2, 0, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 30, 0.887F, -0.4617F, -2.5F, 2, 0, 1, 0.0F, false));

        this.armL = new ModelRenderer(this);
        this.armL.setRotationPoint(3.3F, 0.0F, -8.0F);
        this.body.addChild(armL);
        this.setRotateAngle(armL, 0.1763F, 0.1708F, 0.2204F);
        this.armL.cubeList.add(new ModelBox(armL, 0, 35, -0.1649F, 0.1026F, -0.4036F, 2, 1, 1, -0.1F, false));

        this.armL2 = new ModelRenderer(this);
        this.armL2.setRotationPoint(1.8527F, 0.7078F, 0.0073F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 1.346F, 1.169F, 2.5851F);
        this.armL2.cubeList.add(new ModelBox(armL2, 37, 20, 0.1222F, -0.7887F, -0.5308F, 2, 1, 1, -0.1F, false));
        this.armL2.cubeList.add(new ModelBox(armL2, 14, 37, 0.1222F, 0.0113F, -0.5308F, 2, 1, 1, -0.2F, false));

        this.armL3 = new ModelRenderer(this);
        this.armL3.setRotationPoint(1.8722F, 0.1213F, -0.3408F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, -0.006F, -1.3617F, -0.0016F);
        this.armL3.cubeList.add(new ModelBox(armL3, 7, 34, 0.0F, -1.01F, -1.39F, 1, 2, 2, 0.0F, false));

        this.armL4 = new ModelRenderer(this);
        this.armL4.setRotationPoint(-3.3F, 0.0F, -8.0F);
        this.body.addChild(armL4);
        this.setRotateAngle(armL4, -0.1546F, -0.0441F, -0.3441F);
        this.armL4.cubeList.add(new ModelBox(armL4, 0, 35, -1.8351F, 0.1026F, -0.4036F, 2, 1, 1, -0.1F, true));

        this.armL5 = new ModelRenderer(this);
        this.armL5.setRotationPoint(-1.8527F, 0.7078F, 0.0073F);
        this.armL4.addChild(armL5);
        this.setRotateAngle(armL5, 0.0F, -1.2654F, -1.2217F);
        this.armL5.cubeList.add(new ModelBox(armL5, 37, 20, -2.1222F, -0.7887F, -0.5308F, 2, 1, 1, -0.1F, true));
        this.armL5.cubeList.add(new ModelBox(armL5, 14, 37, -2.1222F, 0.0113F, -0.5308F, 2, 1, 1, -0.2F, true));

        this.armL6 = new ModelRenderer(this);
        this.armL6.setRotationPoint(-1.8722F, 0.1213F, -0.3408F);
        this.armL5.addChild(armL6);
        this.setRotateAngle(armL6, 0.0047F, 1.4483F, -0.001F);
        this.armL6.cubeList.add(new ModelBox(armL6, 7, 34, -1.0F, -1.01F, -1.39F, 1, 2, 2, 0.0F, true));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.9F, -4.35F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0452F, 0.2615F, -0.0117F);
        this.body2.cubeList.add(new ModelBox(body2, 10, 29, -0.5F, -0.2719F, 0.051F, 1, 1, 3, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.1531F, 1.551F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.7418F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 18, -2.887F, -0.4617F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.1531F, 1.551F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.2618F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 0.1531F, 1.551F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.7418F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 18, 0.887F, -0.4617F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 0.1531F, 1.551F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.2618F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0519F, 3.1033F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0452F, 0.2615F, -0.0117F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -0.5F, -0.3204F, -0.1046F, 1, 1, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 27, 14, -2.0F, 1.2025F, 1.3518F, 4, 0, 2, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.7F, 1.7206F, 0.3454F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 2.3562F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 9, -3.0F, -0.12F, 1.05F, 2, 0, 2, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(2.7F, 1.7206F, 0.3454F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -2.3562F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 23, 1.0F, -0.12F, 1.05F, 2, 0, 2, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.1046F, 0.3954F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.7418F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 22, 10, -1.887F, -0.4617F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.1046F, 0.3954F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.2618F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 7, 22, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.1046F, 0.3954F);
        this.body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.7418F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 10, 0.887F, -0.4617F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 0.1046F, 0.3954F);
        this.body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.2618F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 7, 22, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(2.25F, 0.5023F, 2.2431F);
        this.body3.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.6981F, 0.0873F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 16, -0.5F, 0.0F, -0.5F, 3, 1, 1, -0.1F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(2.2819F, 0.4436F, 0.1704F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, -1.3236F, -1.0942F, 2.6821F);
        this.legL2.cubeList.add(new ModelBox(legL2, 34, 17, -0.1471F, -0.4707F, -0.8169F, 2, 1, 1, -0.2F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 35, 26, -0.1471F, -0.4707F, -0.2169F, 2, 1, 1, -0.25F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(1.6029F, 0.0393F, -0.4269F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, -0.8553F, 1.2412F, 0.3494F);
        this.legL3.cubeList.add(new ModelBox(legL3, 25, 33, 0.0F, -1.01F, -1.64F, 1, 2, 2, 0.1F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(-2.25F, 0.5023F, 2.2431F);
        this.body3.addChild(legL4);
        this.setRotateAngle(legL4, 0.1423F, -0.3431F, -0.0123F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 16, -2.5F, 0.0F, -0.5F, 3, 1, 1, -0.1F, true));

        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(-2.2819F, 0.4436F, 0.1704F);
        this.legL4.addChild(legL5);
        this.setRotateAngle(legL5, 0.8861F, 0.9212F, -0.2735F);
        this.legL5.cubeList.add(new ModelBox(legL5, 34, 17, -1.8529F, -0.4707F, -0.8169F, 2, 1, 1, -0.2F, true));
        this.legL5.cubeList.add(new ModelBox(legL5, 35, 26, -1.8529F, -0.4707F, -0.2169F, 2, 1, 1, -0.25F, true));

        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(-1.6029F, 0.0393F, -0.4269F);
        this.legL5.addChild(legL6);
        this.setRotateAngle(legL6, -0.0313F, -1.1015F, -1.2614F);
        this.legL6.cubeList.add(new ModelBox(legL6, 25, 33, -1.0F, -1.01F, -1.64F, 1, 2, 2, 0.1F, true));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0439F, 3.0386F);
        this.body3.addChild(tail1);
        this.setRotateAngle(tail1, -0.0883F, 0.218F, -0.0097F);
        this.tail1.cubeList.add(new ModelBox(tail1, 30, 4, -0.5F, -0.3527F, -0.1644F, 1, 1, 3, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0173F, 2.8356F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0883F, 0.218F, -0.0097F);
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 23, -0.5F, -0.3681F, -0.0228F, 1, 1, 4, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.07F, 3.8577F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0888F, 0.2615F, 0.0117F);
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 7, -0.5F, -0.4292F, 0.0452F, 1, 1, 5, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.7F, -8.25F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.1745F, -0.3491F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 16, 32, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.0F, -0.8F);
        this.neck.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.2618F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 12, 14, -1.0F, 0.0F, -0.2F, 1, 0, 1, 0.0F, true));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 0.0F, -0.8F);
        this.neck.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.2618F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 12, 14, 0.0F, 0.0F, -0.2F, 1, 0, 1, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2F, -1.85F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.1255F, -0.1655F, 0.153F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.9F, -0.1F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.3491F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 32, 36, -0.99F, 0.01F, -8.8F, 2, 1, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, 1.0F, -8.8F);
        this.lowerjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.288F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 11, 0.0F, -1.01F, 0.0F, 1, 1, 9, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 22, 0.3F, -1.21F, 0.0F, 0, 1, 6, 0.0F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, 1.0F, -8.8F);
        this.lowerjaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.288F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 22, -0.3F, -1.21F, 0.0F, 0, 1, 6, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 11, -1.0F, -1.01F, 0.0F, 1, 1, 9, 0.0F, false));

        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.0436F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 12, 11, -1.0F, -0.11F, -8.9F, 2, 1, 5, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 34, 0, -1.5F, -0.11F, -3.9F, 3, 1, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 30, 1.0F, -0.11F, -2.9F, 1, 1, 3, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 22, 18, -2.0F, -0.11F, -3.4F, 4, 1, 3, 0.003F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 30, -2.0F, -0.11F, -2.9F, 1, 1, 3, 0.0F, true));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, 0.9F, -8.9F);
        this.upperjaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.3054F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 15, 18, 0.2F, -0.8F, 0.0F, 0, 1, 6, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, 0.0F, -1.0F, 0.0F, 2, 1, 9, 0.003F, true));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.9F, -0.9F);
        this.upperjaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.3054F, -0.2618F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 5, -2.375F, -1.85F, -1.875F, 2, 1, 2, 0.0F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.9F, -8.9F);
        this.upperjaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0873F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 11, -1.51F, -1.0F, 6.0F, 1, 1, 3, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 36, 3, -0.99F, -1.0F, 5.0F, 2, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 11, 0.51F, -1.0F, 6.0F, 1, 1, 3, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 32, 33, -1.49F, -1.0F, 6.0F, 3, 1, 1, 0.003F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 27, 29, -1.49F, -1.0F, 6.6F, 3, 1, 2, -0.003F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 14, 0, -1.0F, -1.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.9F, -0.9F);
        this.upperjaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.3054F, 0.2618F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 5, 0.375F, -1.85F, -1.875F, 2, 1, 2, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.25F, -0.1282F, -3.4899F);
        this.upperjaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0395F, 0.0184F, -0.436F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 12, 11, -0.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(1.25F, -0.1282F, -3.4899F);
        this.upperjaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0395F, -0.0184F, 0.436F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 12, 11, -0.5F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(1.0F, 0.9F, -8.9F);
        this.upperjaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.3054F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 15, 18, -0.2F, -0.8F, 0.0F, 0, 1, 6, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 0, -2.0F, -1.0F, 0.0F, 2, 1, 9, 0.0F, false));

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
