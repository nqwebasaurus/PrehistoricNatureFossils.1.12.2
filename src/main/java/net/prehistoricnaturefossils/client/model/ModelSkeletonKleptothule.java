package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonKleptothule extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Kleptothule;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer head;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer body5;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer body6;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer body7;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer body8;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer body9;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer body10;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer pygidium;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;

    public ModelSkeletonKleptothule() {
        this.textureWidth = 144;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -12.0F, -1.0F, -12.0F, 23, 1, 38, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 76, 69, -12.0F, -2.0F, -12.0F, 8, 1, 19, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 85, 28, -4.0F, -2.0F, -12.0F, 15, 1, 7, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 74, 40, 4.0F, -2.0F, 5.0F, 7, 1, 21, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, 6.0F, -2.0F, -5.0F, 5, 1, 10, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-12.0F, 0.0F, 32.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.4974F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 18, 5.0F, -2.0F, -21.0F, 6, 1, 5, -0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 85, 20, 5.0F, -2.0F, 0.0F, 18, 1, 6, -0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 69, 0.0F, -2.0F, -21.0F, 5, 1, 27, -0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 40, 0.0F, -1.0F, -21.0F, 23, 1, 27, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.7349F, -1.5F, 27.9562F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1134F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 26, -12.0F, -0.5F, -0.2F, 7, 1, 3, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(7.5F, -1.5F, 15.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2967F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 69, -6.4F, -0.5F, -9.1F, 7, 1, 23, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(3.5F, -1.5F, -8.5F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.6109F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 12, -11.5F, -0.5F, -1.7F, 9, 1, 4, -0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-9.7498F, -1.5F, 11.0743F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 85, 0, -3.5F, -0.5F, -6.2F, 7, 1, 18, 0.004F, false));

        this.Kleptothule = new ModelRenderer(this);
        this.Kleptothule.setRotationPoint(2.0F, -1.6F, 1.0F);
        this.fossil.addChild(Kleptothule);
        this.setRotateAngle(Kleptothule, 0.0F, -0.2182F, 0.0F);
        this.Kleptothule.cubeList.add(new ModelBox(Kleptothule, 0, 59, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.Kleptothule.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.3927F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 5, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.Kleptothule.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.3927F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 52, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Kleptothule.addChild(head);
        this.setRotateAngle(head, 0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 29, -0.5F, -0.25F, -5.0F, 1, 0, 2, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -0.25F, 0.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.2618F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 31, -2.0F, 0.0F, -4.0F, 2, 0, 4, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -0.25F, 0.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.2618F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 33, 0.0F, 0.0F, -4.0F, 2, 0, 4, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Kleptothule.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -0.0873F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 19, 58, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.3927F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 12, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3927F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 52, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, -0.1309F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 14, 56, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.3927F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 15, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.3927F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 49, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0F, -0.0873F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 7, 55, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.3927F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 34, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.3927F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 9, 49, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.0F, -0.0873F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 0, 55, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.3927F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 31, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.3927F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 49, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0F, 0.0436F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 18, 52, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.3927F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 34, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body6.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.3927F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 46, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.body7 = new ModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, 0.0F, 0.1309F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 30, 18, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body7.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.3927F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 40, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body7.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.3927F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 9, 46, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.body8 = new ModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body7.addChild(body8);
        this.setRotateAngle(body8, 0.0F, 0.0873F, 0.0F);
        this.body8.cubeList.add(new ModelBox(body8, 30, 10, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body8.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.3927F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 40, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body8.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.3927F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 46, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.body9 = new ModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body8.addChild(body9);
        this.setRotateAngle(body9, 0.0F, 0.0873F, 0.0F);
        this.body9.cubeList.add(new ModelBox(body9, 30, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body9.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.3927F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 18, 40, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body9.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.3927F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 43, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.body10 = new ModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body9.addChild(body10);
        this.setRotateAngle(body10, 0.0F, 0.0873F, 0.0F);
        this.body10.cubeList.add(new ModelBox(body10, 0, 25, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body10.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.3927F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 43, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body10.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.3927F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 9, 43, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.pygidium = new ModelRenderer(this);
        this.pygidium.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body10.addChild(pygidium);
        this.pygidium.cubeList.add(new ModelBox(pygidium, 21, 0, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, 0, 8, -0.5F, -0.25F, 6.0F, 1, 0, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -0.25F, 4.0F);
        this.pygidium.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -0.3054F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 16, 18, -3.0F, 0.0F, -4.0F, 3, 0, 7, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, -0.25F, 4.0F);
        this.pygidium.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 0.3054F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 25, 0.0F, 0.0F, -4.0F, 3, 0, 7, 0.0F, false));

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
