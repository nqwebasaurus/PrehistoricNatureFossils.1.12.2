package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDipteronotus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftPelvic;
    private final ModelRenderer leftPectoral;
    private final ModelRenderer head;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r17;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r29;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r30;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r31;

    public ModelSkeletonDipteronotus() {
        this.textureWidth = 112;
        this.textureHeight = 85;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(3.0F, 24.0F, -3.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(13.0F, 0.0F, -18.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 60, -21.0F, -2.0F, 5.0F, 21, 2, 15, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-7.5F, 0.0F, 25.7F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.5498F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -21.9687F, -2.0F, -32.1516F, 22, 2, 32, 0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(13.0F, 0.0F, 21.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 35, -21.0F, -2.0F, -22.0F, 22, 2, 22, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.1F, -7.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0F, -1.5708F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.1F, -4.8173F, 4.6487F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -2.5744F, 0.0F, -3.1416F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 74, 39, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -6.9376F, 4.3899F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5236F, 0.0F, 3.1416F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 11, 0.0F, -1.5F, -5.5F, 0, 3, 11, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.2F, -5.3333F, 1.5642F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 2.8362F, 0.0F, -3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 67, 35, 0.0F, -1.0F, -2.2F, 0, 2, 5, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.3F, 4.7329F, 1.8668F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -2.8798F, 0.0F, -3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 48, 0.0F, -1.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.1F, 5.3F, 5.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 3.1416F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 22, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.0F, 2.5F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 3.1416F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 35, 0.0F, -5.0F, -3.5F, 0, 10, 7, 0.0F, false));

        this.leftPelvic = new ModelRenderer(this);
        this.leftPelvic.setRotationPoint(0.2F, 5.7F, 5.1F);
        this.body.addChild(leftPelvic);
        this.setRotateAngle(leftPelvic, 0.0F, -0.7418F, 1.5708F);
        this.leftPelvic.cubeList.add(new ModelBox(leftPelvic, 13, 26, 0.0F, -0.1F, -1.0F, 3, 0, 2, 0.0F, false));

        this.leftPectoral = new ModelRenderer(this);
        this.leftPectoral.setRotationPoint(0.5F, 2.4F, -0.7F);
        this.body.addChild(leftPectoral);
        this.setRotateAngle(leftPectoral, -1.5708F, -0.7854F, 1.5708F);
        this.leftPectoral.cubeList.add(new ModelBox(leftPectoral, 10, 0, 0.0F, -1.0F, -0.1F, 7, 2, 0, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.3F, -0.3F);
        this.body.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.2F, -3.491F, -0.2009F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 2.522F, 0.0F, -3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 35, 0.1F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.561F, -4.2076F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5323F, 0.0F, -3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 22, 0.0F, -1.0F, -3.0F, 0, 2, 6, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.2F, 0.8383F, -5.1128F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3491F, 0.0F, -3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 68, 60, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.1F, 0.1F, -5.3F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -3.1416F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 73, 63, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.2F, 3.2176F, -1.3842F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -2.7489F, 0.0F, -3.1416F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 67, 43, 0.0F, -1.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.3F, 0.1F, -1.5F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 3.1416F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 60, 0.0F, -3.0F, -2.5F, 0, 6, 5, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.4F, -0.1F, -5.5F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2618F, 0.0F, -3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 12, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.3F, -4.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2182F, 0.0F, 0.0F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.2775F, -1.305F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4363F, 0.0F, -3.1416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 3, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -5.0F, 2.0F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 3.1416F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 58, 60, 0.0F, -3.0F, -2.0F, 0, 6, 4, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.2F, -2.3917F, 1.3025F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -2.5744F, 0.0F, -3.1416F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 12, 0.0F, -1.5F, -2.5F, 0, 3, 5, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 5.8F, 3.2F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 3.1416F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 77, 8, 0.0F, -2.5F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.2F, 4.1706F, 1.7151F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 2.618F, 0.0F, 3.1416F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 62, 66, 0.0F, -1.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.3F, 1.0F, 1.5F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 3.1416F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 0, 0.0F, -3.0F, -2.5F, 0, 6, 5, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.0F, 4.0F);
        this.tail.addChild(tail2);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -4.3F, 3.5F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 3.1416F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 11, 60, 0.0F, -3.0F, -0.5F, 0, 6, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -5.8F, 1.5F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 3.1416F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 15, 35, 0.0F, -4.5F, -1.5F, 0, 9, 3, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.1F, -1.684F, 0.799F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -2.618F, 0.0F, -3.1416F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 21, 26, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 4.3F, 1.7F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 3.1416F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 75, 48, 0.0F, -2.5F, -1.5F, 0, 5, 3, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.1F, 1.8789F, 1.3175F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 2.8449F, 0.0F, 3.1416F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 8, 35, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.4F, 0.0F, 0.5F);
        this.tail2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 3.1416F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 77, 0, 0.0F, -2.0F, -1.5F, 0, 4, 3, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);


        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.2F, 0.0F, 1.0F);
        this.tail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 3.1416F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 0, 0.0F, -2.0F, -2.0F, 0, 4, 4, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.1F, 0.0F, 1.0F);
        this.tail4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 3.1416F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 73, 70, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.tail3.addChild(tail5);


        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 2.9F, 3.5F);
        this.tail5.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 3.1416F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 0, 0.0F, -6.0F, -4.5F, 0, 12, 9, 0.0F, false));

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
