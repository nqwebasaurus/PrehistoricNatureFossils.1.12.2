package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonZenaspis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer head;
    private final ModelRenderer cube_r5;
    private final ModelRenderer eyes_r1;
    private final ModelRenderer cube_r6;
    private final ModelRenderer headleft;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer headright;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;

    public ModelSkeletonZenaspis() {
        this.textureWidth = 75;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 46, -10.0F, -4.0F, -13.0F, 4, 4, 8, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -6.0F, -5.0F, -13.0F, 14, 5, 21, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 50, 0, 1.0F, -6.0F, -13.0F, 7, 1, 4, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 27, -10.0F, -5.0F, -5.0F, 4, 5, 13, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 40, 38, -10.0F, -6.0F, 2.0F, 5, 1, 6, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(8.0F, 0.0F, 1.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.4625F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -4.0693F, -3.0F, 0.1538F, 4, 3, 6, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(8.0F, 0.0F, -13.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1484F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 32, 0.0F, -5.0F, 0.0F, 2, 5, 14, -0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(7.0F, -4.5F, -8.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.3927F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 27, -9.1F, -1.5F, 1.8F, 8, 4, 6, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, -4.5F, -4.5F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3054F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 27, 1.7F, -2.5F, -0.5F, 2, 5, 4, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 47, -4.3F, -3.5F, -1.5F, 6, 6, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 52, -6.3F, -2.5F, -1.5F, 2, 5, 5, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(3.0F, -6.5004F, 2.0578F);
        this.fossil.addChild(head);
        this.setRotateAngle(head, 0.0F, -2.7489F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 50, 6, -2.0F, 0.6504F, -1.6578F, 4, 1, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 35, 27, -1.0F, 0.6504F, -4.4578F, 2, 1, 3, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.7004F, 6.3422F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5672F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 27, -1.0F, -6.7F, -8.75F, 2, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 52, -1.5F, -6.7F, -7.75F, 3, 1, 2, 0.0F, false));

        this.eyes_r1 = new ModelRenderer(this);
        this.eyes_r1.setRotationPoint(0.5F, 1.7004F, 8.7422F);
        this.head.addChild(eyes_r1);
        this.setRotateAngle(eyes_r1, 0.1222F, 0.0F, 0.0F);
        this.eyes_r1.cubeList.add(new ModelBox(eyes_r1, 0, 37, -2.0F, -3.9706F, -9.2396F, 3, 0, 2, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.7004F, 7.3422F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1222F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 10, -2.0F, -3.7F, -9.15F, 4, 2, 6, 0.0F, false));

        this.headleft = new ModelRenderer(this);
        this.headleft.setRotationPoint(0.2F, 1.4504F, 6.6922F);
        this.head.addChild(headleft);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(3.9F, 0.35F, -9.0F);
        this.headleft.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.2618F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 63, -0.7695F, -0.49F, 5.2874F, 2, 0, 2, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.2F, 0.35F, -0.35F);
        this.headleft.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.6109F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 60, 5.45F, -1.76F, -6.5F, 1, 1, 3, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.3F, 0.35F, -11.35F);
        this.headleft.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.9948F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 33, -2.0037F, -1.26F, 0.3551F, 2, 1, 4, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(3.9F, 0.35F, -9.0F);
        this.headleft.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.4974F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 58, -4.0146F, -1.25F, 0.0393F, 4, 1, 5, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(3.9F, 0.35F, -9.0F);
        this.headleft.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.0524F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 51, 62, 2.255F, -0.48F, 6.4728F, 1, 0, 3, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(3.9F, 0.35F, -9.0F);
        this.headleft.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.288F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 59, -2.9034F, -1.26F, 4.8921F, 4, 1, 1, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.2F, 0.35F, 0.65F);
        this.headleft.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.5672F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 59, -0.6F, -3.05F, -7.5F, 3, 1, 4, -0.002F, false));

        this.headright = new ModelRenderer(this);
        this.headright.setRotationPoint(-0.2F, 1.4504F, 6.6922F);
        this.head.addChild(headright);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.9F, 0.35F, -9.0F);
        this.headright.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.2618F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 61, 44, -1.2305F, -0.49F, 5.2874F, 2, 0, 2, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.2F, 0.35F, -0.35F);
        this.headright.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.6109F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 57, 59, -6.45F, -1.76F, -6.5F, 1, 1, 3, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.3F, 0.35F, -11.35F);
        this.headright.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.9948F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 27, 0.0037F, -1.26F, 0.3551F, 2, 1, 4, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.9F, 0.35F, -9.0F);
        this.headright.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.4974F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 50, 14, 0.0146F, -1.25F, 0.0393F, 4, 1, 5, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-3.9F, 0.35F, -9.0F);
        this.headright.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0524F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 12, 62, -3.255F, -0.48F, 6.4728F, 1, 0, 3, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-3.9F, 0.35F, -9.0F);
        this.headright.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.288F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 11, 59, -1.0966F, -1.26F, 4.8921F, 4, 1, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.2F, 0.35F, 0.65F);
        this.headright.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.5672F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 57, 38, -2.4F, -3.05F, -7.5F, 3, 1, 4, -0.002F, false));

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
