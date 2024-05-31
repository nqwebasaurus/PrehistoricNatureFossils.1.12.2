package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTanystropheusFrame extends ModelBase {
    private final ModelRenderer body2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neckbase;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer upperjaw;
    private final ModelRenderer forelegL;
    private final ModelRenderer forelegL2;
    private final ModelRenderer forelegL3;
    private final ModelRenderer forelegL4;
    private final ModelRenderer forelegL5;
    private final ModelRenderer forelegL6;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer hindlegL;
    private final ModelRenderer hindlegL2;
    private final ModelRenderer hindlegL3;
    private final ModelRenderer hindlegL4;
    private final ModelRenderer hindlegL5;
    private final ModelRenderer hindlegL6;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r11;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r12;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r13;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r14;
    private final ModelRenderer tail5;

    public ModelSkeletonTanystropheusFrame() {
        this.textureWidth = 110;
        this.textureHeight = 110;

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 12.1F, -2.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.6F, 5.5F, -13.6F);
        this.body2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.0F, -5.9F, 0.0F, 1, 13, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.6F, 5.5F, -13.6F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 3.8F, -4.7F, 0.0F, 1, 9, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.4F, 5.5F, 11.4F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.8F, -5.8F, 0.0F, 1, 13, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.4F, 5.5F, 11.4F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, -1.5708F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, 3.8F, -3.4F, 0.0F, 1, 7, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.0F, 3.0F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 9, -1.0F, -0.3F, -0.4F, 2, 1, 7, -0.2F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.3F, -7.8F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0611F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 77, 22, -1.0F, -0.3079F, -0.1606F, 2, 1, 11, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.0F, -7.5F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.1745F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.65F, -8.3F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 29, -1.0F, 1.1225F, 0.4963F, 2, 1, 8, -0.2F, false));

        this.neckbase = new ModelRenderer(this);
        this.neckbase.setRotationPoint(0.0F, -0.75F, -8.5F);
        this.body.addChild(neckbase);
        this.setRotateAngle(neckbase, 0.0F, -0.2182F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.5F, 2.0F);
        this.neckbase.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2624F, 0.0674F, 0.0181F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, -1, 39, -0.5956F, -0.5978F, -7.8239F, 2, 1, 8, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.25F, -5.0F);
        this.neckbase.addChild(neck);
        this.setRotateAngle(neck, -0.0915F, -0.3042F, 0.0275F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.2262F, 1.0962F, -18.3169F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.0175F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 63, 45, -1.0F, -0.5F, 0.0F, 2, 1, 19, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -17.5F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0472F, -0.3923F, 0.0181F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 29, -0.9274F, 0.6916F, -23.0932F, 2, 1, 23, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -23.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0928F, -0.3477F, -0.0317F);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 0, -0.9249F, 0.5972F, -25.606F, 2, 1, 26, -0.2F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.0F, -26.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.1443F, -0.4323F, -0.0608F);
        this.neck4.cubeList.add(new ModelBox(neck4, 64, 67, -0.6895F, 0.5878F, -17.1551F, 2, 1, 18, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -17.0F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -0.1707F, -0.361F, 0.0911F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.7854F, 0.0F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(upperjaw);


        this.forelegL = new ModelRenderer(this);
        this.forelegL.setRotationPoint(5.5F, 1.0F, -5.6F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 1.0036F, 0.0F, -0.4363F);


        this.forelegL2 = new ModelRenderer(this);
        this.forelegL2.setRotationPoint(-0.5F, 7.0F, 0.0F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, -1.3526F, 0.5236F, 0.1745F);


        this.forelegL3 = new ModelRenderer(this);
        this.forelegL3.setRotationPoint(0.0F, 5.0F, -0.5F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.829F, -0.2182F, -0.2182F);


        this.forelegL4 = new ModelRenderer(this);
        this.forelegL4.setRotationPoint(-5.5F, 1.0F, -5.6F);
        this.body.addChild(forelegL4);
        this.setRotateAngle(forelegL4, -0.1309F, 0.0F, 0.4363F);


        this.forelegL5 = new ModelRenderer(this);
        this.forelegL5.setRotationPoint(0.5F, 7.0F, 0.0F);
        this.forelegL4.addChild(forelegL5);
        this.setRotateAngle(forelegL5, -1.0472F, -0.5236F, -0.1745F);


        this.forelegL6 = new ModelRenderer(this);
        this.forelegL6.setRotationPoint(0.0F, 5.0F, -0.5F);
        this.forelegL5.addChild(forelegL6);
        this.setRotateAngle(forelegL6, 1.0834F, 0.4224F, 0.0498F);


        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -1.3F, 10.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, 0.1309F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.0F, -0.7F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2621F, -0.0506F, 0.0136F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 38, -0.9F, 0.5318F, -0.0695F, 2, 1, 7, -0.2F, false));

        this.hindlegL = new ModelRenderer(this);
        this.hindlegL.setRotationPoint(2.5F, 1.3F, 3.5F);
        this.body3.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.1745F, 0.0F, -1.0472F);


        this.hindlegL2 = new ModelRenderer(this);
        this.hindlegL2.setRotationPoint(-1.5F, 9.0F, 0.0F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 1.4835F, -0.5672F, 0.0F);


        this.hindlegL3 = new ModelRenderer(this);
        this.hindlegL3.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, -0.4331F, 0.1555F, 0.8312F);


        this.hindlegL4 = new ModelRenderer(this);
        this.hindlegL4.setRotationPoint(-2.5F, 1.3F, 3.5F);
        this.body3.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, -1.0036F, 0.0F, 1.0472F);


        this.hindlegL5 = new ModelRenderer(this);
        this.hindlegL5.setRotationPoint(1.5F, 9.0F, 0.0F);
        this.hindlegL4.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 1.2654F, 0.5672F, 0.0F);


        this.hindlegL6 = new ModelRenderer(this);
        this.hindlegL6.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, -0.0614F, -0.0061F, -0.4802F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.5F, 6.0F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.1806F, 0.2577F, -0.0465F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.5F, -0.8F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -1.0449F, 1.2664F, 0.0529F, 2, 1, 10, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 9.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0928F, 0.3477F, -0.0317F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.75F, -0.7F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, -0.0348F, -0.003F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 77, 0, -0.9287F, 1.156F, -0.0616F, 2, 1, 11, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.2F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0915F, 0.3042F, 0.0275F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.164F, 1.1321F, -0.6078F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0175F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 31, 35, -1.0F, -0.5F, 0.0F, 2, 1, 20, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 20.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1443F, -0.4323F, -0.0608F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.1642F, 1.4858F, -1.064F);
        this.tail4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0175F, 0.0175F, 0.0003F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 41, 58, -1.2F, -0.7F, -0.4F, 2, 1, 18, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 17.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1855F, -0.3435F, -0.0631F);
        this.tail5.cubeList.add(new ModelBox(tail5, 31, 0, -0.7008F, 0.377F, -1.0714F, 1, 1, 22, -0.2F, false));

    }

    public void renderAll(float f) {
        this.body2.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
