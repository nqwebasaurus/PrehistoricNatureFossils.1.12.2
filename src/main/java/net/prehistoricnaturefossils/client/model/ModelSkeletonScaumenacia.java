package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonScaumenacia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer pectoralfinR;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer pelvicfinR;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer bodyfront;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer head;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer jaw;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r14;
    private final ModelRenderer pectoralfinL2;
    private final ModelRenderer cube_r15;
    private final ModelRenderer body5;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer pelvicfinL2;
    private final ModelRenderer cube_r19;
    private final ModelRenderer body6;
    private final ModelRenderer cube_r20;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r23;
    private final ModelRenderer bodyfront2;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer head2;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer jaw2;

    public ModelSkeletonScaumenacia() {
        this.textureWidth = 160;
        this.textureHeight = 130;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.704F, 23.0F, -2.52F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-31.004F, 0.0F, -9.08F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.7366F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 57, -30.3407F, -1.0F, -0.4908F, 30, 6, 27, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-18.704F, 0.0F, -24.98F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.9948F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -4.6509F, 0.0F, 4.1253F, 9, 5, 14, -0.003F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 91, -20.6509F, -1.0F, -1.8747F, 16, 6, 21, -0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(6.296F, 0.0F, 0.02F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.48F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -13.0F, 2.0F, -28.5F, 26, 3, 53, 0.003F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(6.296F, 1.875F, 9.02F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, -3.098F, 0.0F, 1.5708F);
        this.body.cubeList.add(new ModelBox(body, 0, 20, -2.5F, -1.375F, -6.5F, 5, 7, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 14, 40, 0.0F, -3.125F, -3.5F, 0, 2, 8, 0.0F, false));

        this.pectoralfinR = new ModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-2.6F, 3.625F, -6.2F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.3042F, -0.004F, 0.0262F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.pectoralfinR.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 85, 91, -3.0F, -1.0F, 0.0F, 0, 3, 11, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 2.625F, 5.5F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 106, 0, -2.0F, -2.025F, -1.0F, 4, 5, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 94, 112, 0.0F, -7.0F, -1.0F, 0, 5, 8, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 106, 42, -1.5F, 0.175F, -0.5F, 3, 2, 8, 0.0F, false));

        this.pelvicfinR = new ModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.9F, 2.75F, 3.0F);
        this.body2.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, -0.0881F, 0.1719F, -0.0398F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.pelvicfinR.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 57, -3.0F, -1.75F, 0.0F, 2, 3, 11, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.1309F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 28, 119, -1.0F, -1.5F, -1.0F, 2, 3, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 91, -0.01F, -7.5F, 0.0F, 0, 6, 9, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 118, 69, 0.0F, -0.75F, -0.5F, 0, 3, 8, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.body3.addChild(tail);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 40, -0.5F, -1.5F, -0.75F, 1, 1, 11, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 106, 14, 0.0F, -0.5F, -0.75F, 0, 2, 11, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -2.75F, 9.65F);
        this.tail.addChild(tail2);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.75F, -9.65F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 118, 81, 0.0F, -1.5F, 10.25F, 0, 1, 6, 0.0F, false));

        this.bodyfront = new ModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 2.625F, -6.5F);
        this.body.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0873F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 74, 91, -2.0F, -2.0F, -4.5F, 4, 4, 5, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.0F, -4.5F);
        this.bodyfront.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 22, -1.5F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.bodyfront.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 85, 106, -1.5F, -1.05F, 4.55F, 3, 2, 4, 0.01F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(1.5F, -1.0F, -4.0F);
        this.bodyfront.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 25, -3.0F, -0.55F, -2.5F, 3, 2, 2, 0.02F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4363F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 119, -3.0F, 1.1F, 0.65F, 3, 1, 4, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 31, 44, -3.0F, 0.1F, -0.35F, 3, 1, 5, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.0F, -0.5F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 119, -3.0F, -1.0F, -4.0F, 3, 1, 4, 0.01F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-1.5F, 2.0F, -0.3F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 56, 119, -1.0F, 0.0F, -4.0F, 2, 1, 4, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(-20.304F, -1.125F, -12.98F);
        this.fossil.addChild(body4);
        this.setRotateAngle(body4, 0.3491F, 0.0F, -1.5708F);
        this.body4.cubeList.add(new ModelBox(body4, 88, 57, -2.5F, -1.375F, -6.5F, 5, 7, 12, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.125F, 0.5F);
        this.body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 3.1416F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 118, 14, 0.0F, -1.0F, -4.0F, 0, 2, 8, 0.0F, false));

        this.pectoralfinL2 = new ModelRenderer(this);
        this.pectoralfinL2.setRotationPoint(2.4F, 3.625F, -6.2F);
        this.body4.addChild(pectoralfinL2);
        this.setRotateAngle(pectoralfinL2, 0.0F, 0.0436F, 0.0F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.pectoralfinL2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 29, 0.0F, -1.0F, 0.0F, 3, 3, 11, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 2.625F, 5.5F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.2618F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 102, 98, -2.0F, -2.025F, -1.0F, 4, 5, 8, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -4.5F, 3.0F);
        this.body5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 3.1416F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 33, 0, 0.0F, -2.5F, -4.0F, 0, 5, 8, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.01F, -4.0F, 11.5F);
        this.body5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 3.1416F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 75, 106, 0.0F, -3.0F, -4.5F, 0, 6, 9, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 72, -1.5F, 0.475F, -1.0F, 3, 2, 8, 0.0F, false));

        this.pelvicfinL2 = new ModelRenderer(this);
        this.pelvicfinL2.setRotationPoint(1.9F, 2.75F, 3.0F);
        this.body5.addChild(pelvicfinL2);
        this.setRotateAngle(pelvicfinL2, 0.1309F, 0.0436F, 0.0F);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.pelvicfinL2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3927F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 128, -1.0F, -0.75F, 0.0F, 4, 1, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 11, 127, -1.0F, -0.75F, 1.0F, 4, 2, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 60, 97, -1.0F, -1.75F, 2.0F, 4, 3, 5, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 22, 127, -1.0F, -0.75F, 7.0F, 4, 2, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 33, 127, -1.0F, -0.75F, 8.0F, 4, 1, 2, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, -0.3927F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 0, 119, -1.0F, -1.5F, -1.0F, 2, 3, 4, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 2.9898F, 3.2547F);
        this.body6.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -2.9234F, 0.0F, -3.1416F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 111, 57, 0.0F, -1.5F, -4.0F, 0, 3, 8, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.body6.addChild(tail3);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2618F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 104, 80, -0.5F, -1.5F, -0.75F, 1, 1, 11, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.2536F, 4.7176F);
        this.tail3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 2.8798F, 0.0F, -3.1416F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 106, 28, 0.0F, -1.0F, -5.5F, 0, 2, 11, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -2.75F, 9.65F);
        this.tail3.addChild(tail4);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.6453F, 2.8897F);
        this.tail4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 2.8798F, 0.0F, -3.1416F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, 0.0F, -0.5F, -3.0F, 0, 1, 6, 0.0F, false));

        this.bodyfront2 = new ModelRenderer(this);
        this.bodyfront2.setRotationPoint(0.0F, 2.625F, -6.5F);
        this.body4.addChild(bodyfront2);
        this.setRotateAngle(bodyfront2, 0.0886F, 0.1739F, 0.0154F);
        this.bodyfront2.cubeList.add(new ModelBox(bodyfront2, 111, 112, -2.0F, -2.0F, -4.5F, 4, 4, 5, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 2.0F, -4.5F);
        this.bodyfront2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1745F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 88, 77, -1.5F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.bodyfront2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2182F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 118, 28, -1.5F, -1.05F, 4.55F, 3, 2, 4, 0.01F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(1.5F, -1.0F, -4.0F);
        this.bodyfront2.addChild(head2);
        this.head2.cubeList.add(new ModelBox(head2, 0, 20, -3.0F, -0.55F, -2.5F, 3, 2, 2, 0.02F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.head2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.4363F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 54, 106, -3.0F, 1.1F, 0.65F, 3, 1, 4, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 23, 20, -3.0F, 0.1F, -0.35F, 3, 1, 5, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 2.0F, -0.5F);
        this.head2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1745F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 69, 106, -3.0F, -1.0F, -4.0F, 3, 1, 4, 0.01F, false));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(-1.5F, 2.0F, -0.3F);
        this.head2.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.3054F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 0, 8, -1.0F, 0.0F, -4.0F, 2, 1, 4, 0.0F, false));

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
