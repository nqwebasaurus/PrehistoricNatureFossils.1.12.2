package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGaiasiaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer head;
    private final ModelRenderer upperjaw;
    private final ModelRenderer leftHead;
    private final ModelRenderer rightHead;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer armL;
    private final ModelRenderer armL2;
    private final ModelRenderer armL3;
    private final ModelRenderer armL4;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer legL;
    private final ModelRenderer legL2;
    private final ModelRenderer legL3;
    private final ModelRenderer legL4;
    private final ModelRenderer legL5;
    private final ModelRenderer legL6;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r12;

    public ModelSkeletonGaiasiaFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.4F, -6.0F);
        this.fossil.addChild(body);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.6F, -1.3303F, 0.2378F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1222F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 28, -1.1F, 0.5255F, -7.4076F, 1, 1, 8, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 3.6826F, -9.0229F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.5708F, -0.0349F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, -3, -0.7F, -0.5F, -4.0F, 1, 1, 8, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.6844F, -9.1276F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.6057F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 2, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.21F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.1F, -12.85F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 0, -0.5F, 0.2F, 0.3F, 1, 1, 6, -0.2F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.2F, -15.25F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -1, 15, -0.5F, 0.3F, -1.7F, 1, 1, 5, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.7F, -16.5F);
        this.body.addChild(head);
        this.setRotateAngle(head, -0.0552F, 0.3463F, 0.1828F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 2.4F, 3.0F);
        this.head.addChild(upperjaw);


        this.leftHead = new ModelRenderer(this);
        this.leftHead.setRotationPoint(1.9139F, -1.6039F, -10.8179F);
        this.upperjaw.addChild(leftHead);


        this.rightHead = new ModelRenderer(this);
        this.rightHead.setRotationPoint(-1.9139F, -1.6039F, -10.8179F);
        this.upperjaw.addChild(rightHead);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 2.5F, 2.0F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.5236F, 0.0F, 0.0F);


        this.armL = new ModelRenderer(this);
        this.armL.setRotationPoint(3.25F, 3.4F, -9.1F);
        this.body.addChild(armL);
        this.setRotateAngle(armL, -0.7366F, 0.9353F, -0.1741F);


        this.armL2 = new ModelRenderer(this);
        this.armL2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 0.0F, -0.3927F, 0.0F);


        this.armL3 = new ModelRenderer(this);
        this.armL3.setRotationPoint(-3.25F, 3.4F, -9.1F);
        this.body.addChild(armL3);
        this.setRotateAngle(armL3, 0.0F, -0.6545F, 0.0F);


        this.armL4 = new ModelRenderer(this);
        this.armL4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armL3.addChild(armL4);
        this.setRotateAngle(armL4, 0.0F, 0.3927F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.2F, 1.25F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.1329F, 0.2174F, 0.0117F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.35F, -0.9F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 12, -0.5F, 0.2F, 0.2F, 1, 1, 10, -0.2F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -1.2F, 9.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.1063F, 0.1736F, 0.0184F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.1753F, 8.1509F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.5708F, -0.0524F, -1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 3, -2.4F, -0.5F, -3.0F, 1, 1, 6, -0.2F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.9921F, 4.6557F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.6232F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 7, -0.5F, -4.0F, 0.0F, 1, 1, 2, -0.21F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -0.9F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 0, -0.5F, 0.2F, 0.6F, 1, 1, 10, -0.2F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(2.25F, 3.2F, 7.75F);
        this.body3.addChild(legL);
        this.setRotateAngle(legL, -0.1616F, 0.3086F, 0.1465F);


        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(-0.25F, 0.0F, 3.0F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.2618F, -0.2618F, 0.0F);


        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(-0.25F, -0.25F, 2.25F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.2182F, 0.0F);


        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(-2.25F, 3.2F, 7.75F);
        this.body3.addChild(legL4);
        this.setRotateAngle(legL4, -0.072F, -1.0028F, 0.0406F);


        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(0.25F, 0.0F, 3.0F);
        this.legL4.addChild(legL5);
        this.setRotateAngle(legL5, 0.2618F, 0.2618F, 0.0F);


        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(0.25F, -0.25F, 2.25F);
        this.legL5.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.2182F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.45F, 9.0F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.0354F, -0.1744F, 0.0062F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0198F, -1.9988F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0349F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 16, -0.5F, 0.2F, 2.2F, 1, 1, 10, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3698F, 9.7012F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, -0.2182F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.75F, 0.3F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.0175F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 16, -0.5F, -0.5F, -0.3F, 1, 1, 12, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.05F, 11.3F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, -0.4363F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0175F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -0.5F, 0.2F, 0.0F, 1, 1, 14, -0.2F, false));

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
