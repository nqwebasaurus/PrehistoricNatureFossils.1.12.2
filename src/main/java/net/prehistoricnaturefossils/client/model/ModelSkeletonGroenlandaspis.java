package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGroenlandaspis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Groenlandaspis;
    private final ModelRenderer head;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer mouth;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head3;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer mouth3;
    private final ModelRenderer head2;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer mouth2;
    private final ModelRenderer cube_r24;
    private final ModelRenderer head4;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer mouth4;
    private final ModelRenderer cube_r32;

    public ModelSkeletonGroenlandaspis() {
        this.textureWidth = 192;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(9.0F, 24.0F, -1.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 46, -11.0F, -2.0F, -22.0F, 23, 2, 27, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 33, 33, -11.1838F, -3.0F, -21.2654F, 10, 2, 9, -0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-11.0F, 0.0F, -22.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.9599F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 74, 46, -44.0F, -2.0F, 0.0F, 44, 2, 11, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(12.0F, 0.0F, 5.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.8727F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 21, -12.2638F, -4.0F, 7.5327F, 12, 2, 22, -0.003F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -23.2638F, -2.0F, -0.4673F, 23, 2, 43, -0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-21.3021F, -3.0F, 1.9224F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 31, -3.5F, 0.0F, 0.0F, 23, 2, 12, -0.003F, false));

        this.Groenlandaspis = new ModelRenderer(this);
        this.Groenlandaspis.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.fossil.addChild(Groenlandaspis);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(2.0F, 1.2F, 0.0F);
        this.Groenlandaspis.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 19, 17, -3.0F, -6.0F, -5.0F, 6, 4, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 0, -2.5F, -5.0F, -6.5F, 5, 3, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 11, -3.5F, -6.75F, -1.25F, 7, 5, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 29, -1.0F, -7.25F, -0.25F, 2, 2, 4, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -8.25F, 1.5F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5672F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 33, -0.5F, -0.25F, -3.25F, 1, 3, 4, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.5F, -2.5F, 0.25F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, -0.6109F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 26, -2.25F, -0.3F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(4.5F, -2.5F, 0.25F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.6109F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 28, -0.75F, -0.3F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-4.5F, -2.75F, -1.75F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, -0.8727F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 6, -0.75F, -1.0F, -2.5F, 4, 2, 5, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(4.5F, -2.75F, -1.75F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.8727F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 21, -3.25F, -1.0F, -2.5F, 4, 2, 5, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.3374F, -4.7561F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 46, -2.0F, 0.15F, -1.5F, 4, 1, 2, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -4.5F, -7.25F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.9163F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 35, -2.0F, -0.05F, -1.5F, 4, 2, 2, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -5.0F, -7.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2967F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -2.5F, -0.1221F, -0.7795F, 5, 3, 7, -0.01F, false));

        this.mouth = new ModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, -2.5874F, -6.2561F);
        this.head.addChild(mouth);
        this.setRotateAngle(mouth, -0.3054F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.5093F, -0.7517F);
        this.mouth.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 31, 38, -1.5F, -0.5F, -0.5F, 3, 1, 2, 0.0F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(-23.0F, 0.1F, 18.0F);
        this.Groenlandaspis.addChild(head3);
        this.setRotateAngle(head3, 0.0291F, 1.4329F, -0.3228F);
        this.head3.cubeList.add(new ModelBox(head3, 0, 11, -3.5F, -5.25F, -1.25F, 7, 5, 4, 0.0F, false));
        this.head3.cubeList.add(new ModelBox(head3, 0, 29, -1.0F, -5.75F, -0.25F, 2, 2, 4, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -6.75F, 1.5F);
        this.head3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5672F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 33, -0.5F, -0.25F, -3.25F, 1, 3, 4, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-4.5F, -2.5F, 0.25F);
        this.head3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, -0.6109F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 26, -2.25F, -0.3F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-4.5F, -2.75F, -1.75F);
        this.head3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0873F, -0.8727F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 6, -0.75F, -1.0F, -2.5F, 4, 2, 5, 0.0F, false));

        this.mouth3 = new ModelRenderer(this);
        this.mouth3.setRotationPoint(0.0F, -2.5874F, -6.2561F);
        this.head3.addChild(mouth3);
        this.setRotateAngle(mouth3, -0.3054F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(-12.0F, 0.45F, 0.0F);
        this.Groenlandaspis.addChild(head2);
        this.setRotateAngle(head2, 0.0F, -0.7418F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 19, 17, -3.0F, -6.0F, -5.0F, 6, 4, 4, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 18, 0, -2.5F, -5.0F, -6.5F, 5, 3, 2, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 0, 11, -3.5F, -6.75F, -1.25F, 7, 5, 4, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 0, 29, -1.0F, -7.25F, -0.25F, 2, 2, 4, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -8.25F, 1.5F);
        this.head2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5672F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 9, 33, -0.5F, -0.25F, -3.25F, 1, 3, 4, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-4.5F, -2.5F, 0.25F);
        this.head2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0873F, -0.6109F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 14, 26, -2.25F, -0.3F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(4.5F, -2.5F, 0.25F);
        this.head2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.6109F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 26, 28, -0.75F, -0.3F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-4.5F, -2.75F, -1.75F);
        this.head2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0873F, -0.8727F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 6, -0.75F, -1.0F, -2.5F, 4, 2, 5, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(4.5F, -2.75F, -1.75F);
        this.head2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.8727F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 21, -3.25F, -1.0F, -2.5F, 4, 2, 5, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -2.3374F, -4.7561F);
        this.head2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2182F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 46, -2.0F, 0.15F, -1.5F, 4, 1, 2, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -4.5F, -7.25F);
        this.head2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.9163F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 35, -2.0F, -0.05F, -1.5F, 4, 2, 2, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -5.0F, -7.0F);
        this.head2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2967F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, -2.5F, -0.1221F, -0.7795F, 5, 3, 7, -0.01F, false));

        this.mouth2 = new ModelRenderer(this);
        this.mouth2.setRotationPoint(0.0F, -2.5874F, -6.2561F);
        this.head2.addChild(mouth2);
        this.setRotateAngle(mouth2, -0.3054F, 0.0F, 0.0F);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.5093F, -0.7517F);
        this.mouth2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 31, 38, -1.5F, -0.5F, -0.5F, 3, 1, 2, 0.0F, false));

        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(-8.8F, 0.45F, 14.8F);
        this.Groenlandaspis.addChild(head4);
        this.setRotateAngle(head4, 2.9754F, 0.175F, -2.8181F);
        this.head4.cubeList.add(new ModelBox(head4, 0, 11, -3.5F, -6.75F, -1.25F, 7, 5, 4, 0.0F, false));
        this.head4.cubeList.add(new ModelBox(head4, 0, 29, -1.0F, -7.25F, -0.25F, 2, 2, 4, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -8.25F, 1.5F);
        this.head4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5672F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 9, 33, -0.5F, -0.25F, -3.25F, 1, 3, 4, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(4.5F, -2.5F, 0.25F);
        this.head4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0873F, 0.6109F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 26, 28, -0.75F, -0.3F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(4.5F, -2.75F, -1.75F);
        this.head4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0873F, 0.8727F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 21, -3.25F, -1.0F, -2.5F, 4, 2, 5, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -2.3374F, -4.7561F);
        this.head4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2182F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 46, -2.0F, 0.15F, -1.5F, 4, 1, 2, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -1.1F, -2.5F);
        this.head4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 1.1432F, 0.0F, 0.2618F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 20, 35, -2.0F, -6.2979F, -2.6388F, 4, 2, 2, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -1.1F, -2.5F);
        this.head4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2269F, 0.0F, 0.2618F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 18, 0, -2.5F, -3.4F, -4.9F, 5, 3, 2, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 19, 17, -3.0F, -4.4F, -3.4F, 6, 4, 4, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -1.1F, -2.5F);
        this.head4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.5236F, 0.0F, 0.2618F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 0, -2.5F, -4.9524F, -4.9495F, 5, 3, 7, -0.01F, false));

        this.mouth4 = new ModelRenderer(this);
        this.mouth4.setRotationPoint(0.0F, -2.5874F, -6.2561F);
        this.head4.addChild(mouth4);
        this.setRotateAngle(mouth4, -0.3054F, 0.0F, 0.0F);


        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.5093F, -0.7517F);
        this.mouth4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0436F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 31, 38, -1.5F, -0.5F, -0.5F, 3, 1, 2, 0.0F, false));

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
