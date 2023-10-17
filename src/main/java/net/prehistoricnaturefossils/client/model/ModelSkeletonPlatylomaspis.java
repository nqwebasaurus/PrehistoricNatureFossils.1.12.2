package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPlatylomaspis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Platylomaspis;
    private final ModelRenderer body;
    private final ModelRenderer Cephalon;
    private final ModelRenderer MedialOpening_r1;
    private final ModelRenderer Ventralrim;
    private final ModelRenderer CheekL;
    private final ModelRenderer leftHead;
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
    private final ModelRenderer CheekR;
    private final ModelRenderer Rostrum;

    public ModelSkeletonPlatylomaspis() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-2.0F, 24.0F, 10.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-10.5F, -1.5F, -26.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.0036F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 72, -0.5668F, -1.5F, -0.1672F, 12, 3, 18, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.5F, -9.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3927F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 37, -3.3F, -1.5F, -11.3F, 20, 3, 31, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(4.3F, 0.0F, 10.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -21.3F, -3.0F, -33.4F, 21, 3, 33, -0.003F, false));

        this.Platylomaspis = new ModelRenderer(this);
        this.Platylomaspis.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.fossil.addChild(Platylomaspis);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Platylomaspis.addChild(body);


        this.Cephalon = new ModelRenderer(this);
        this.Cephalon.setRotationPoint(1.9F, -6.5963F, -7.4334F);
        this.body.addChild(Cephalon);
        this.setRotateAngle(Cephalon, 0.0F, 0.2182F, 0.0F);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 0, -4.0F, -1.0037F, -3.0666F, 8, 2, 8, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 72, 37, -4.5F, 0.2963F, -4.0666F, 9, 1, 10, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 57, -3.0F, -1.4037F, -2.0666F, 6, 1, 7, -0.002F, false));

        this.MedialOpening_r1 = new ModelRenderer(this);
        this.MedialOpening_r1.setRotationPoint(0.0F, 0.5963F, -3.0666F);
        this.Cephalon.addChild(MedialOpening_r1);
        this.setRotateAngle(MedialOpening_r1, -0.7418F, 0.0F, 0.0F);
        this.MedialOpening_r1.cubeList.add(new ModelBox(MedialOpening_r1, 76, 29, -4.0F, -1.2F, -1.0F, 8, 2, 1, -0.01F, false));

        this.Ventralrim = new ModelRenderer(this);
        this.Ventralrim.setRotationPoint(0.0F, 6.5963F, 2.9334F);
        this.Cephalon.addChild(Ventralrim);
        this.Ventralrim.cubeList.add(new ModelBox(Ventralrim, 0, 72, -3.0F, -6.0F, 0.0F, 6, 1, 2, 0.0F, false));

        this.CheekL = new ModelRenderer(this);
        this.CheekL.setRotationPoint(4.0F, -6.0F, 0.0F);
        this.Ventralrim.addChild(CheekL);
        this.setRotateAngle(CheekL, 0.0F, 0.0F, 0.1309F);


        this.leftHead = new ModelRenderer(this);
        this.leftHead.setRotationPoint(-4.0F, 6.0F, 0.0F);
        this.CheekL.addChild(leftHead);
        this.leftHead.cubeList.add(new ModelBox(leftHead, 0, 21, 0.0F, -5.9F, -8.0F, 6, 1, 8, 0.0F, false));
        this.leftHead.cubeList.add(new ModelBox(leftHead, 0, 47, 3.0F, -6.0F, -4.0F, 5, 1, 8, 0.0F, false));
        this.leftHead.cubeList.add(new ModelBox(leftHead, 76, 16, 6.4F, -6.0F, -4.0F, 4, 1, 6, 0.005F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-7.0062F, -3.7882F, 6.8935F);
        this.leftHead.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -1.0036F, -0.2182F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 58, 72, -5.7374F, -0.6082F, -2.8209F, 6, 1, 3, 0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0522F, -4.4151F, -14.258F);
        this.leftHead.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.2182F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 76, 16, -9.3478F, -1.2849F, 10.258F, 4, 1, 6, 0.005F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0522F, -4.4151F, -14.258F);
        this.leftHead.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.5236F, -0.2182F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 76, 8, -2.886F, -1.2849F, 7.8576F, 4, 1, 6, 0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0522F, -4.4151F, -14.258F);
        this.leftHead.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, -0.7854F, -0.2182F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 49, -0.6929F, -0.5669F, -0.5019F, 2, 1, 9, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(5.3996F, -5.5F, 5.4826F);
        this.leftHead.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.0036F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 72, -0.5F, -0.5F, -0.7F, 6, 1, 3, 0.003F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.3498F, -4.8F, 2.7413F);
        this.leftHead.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 1.5272F, -0.2618F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 82, 72, -4.8281F, -0.5F, -3.4283F, 4, 1, 3, -0.003F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.3498F, -4.8F, 2.7413F);
        this.leftHead.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.2618F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 47, -4.6502F, -0.5F, -6.7413F, 5, 1, 8, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(5.0F, -5.5F, 5.5F);
        this.leftHead.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -1.5272F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 82, 72, -2.0F, -0.5F, -1.9F, 4, 1, 3, -0.003F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(6.6359F, -5.5F, -8.2401F);
        this.leftHead.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.7854F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 72, 49, -1.0F, -0.5F, -8.7426F, 2, 1, 9, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(11.0F, 0.0F, -4.0F);
        this.leftHead.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.5236F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 76, 8, -4.6F, -6.0F, -6.0F, 4, 1, 6, 0.003F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.1F, -5.5F, -7.75F);
        this.leftHead.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.2182F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 21, -6.1F, -0.4F, -0.25F, 6, 1, 8, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.1F, -5.5F, -7.75F);
        this.leftHead.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, -0.2182F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 24, -3.1F, -0.5F, -4.25F, 3, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -2.1F, -0.5F, -5.25F, 2, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 15, -4.1F, -0.5F, -3.25F, 4, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 58, 77, -6.1F, -0.5F, -2.25F, 6, 1, 2, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(2.0F, -5.5F, -7.75F);
        this.leftHead.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 58, 77, -2.0F, -0.5F, -2.25F, 6, 1, 2, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 21, 15, -2.0F, -0.5F, -3.25F, 4, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 21, 24, -2.0F, -0.5F, -4.25F, 3, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -2.0F, -0.5F, -5.25F, 2, 1, 1, 0.0F, false));

        this.CheekR = new ModelRenderer(this);
        this.CheekR.setRotationPoint(-3.0F, -6.0F, 0.0F);
        this.Ventralrim.addChild(CheekR);
        this.setRotateAngle(CheekR, 0.0F, 0.0F, -0.1309F);


        this.Rostrum = new ModelRenderer(this);
        this.Rostrum.setRotationPoint(0.0F, -5.0F, -9.0F);
        this.Ventralrim.addChild(Rostrum);
        this.setRotateAngle(Rostrum, 0.0436F, 0.0F, 0.0F);
        this.Rostrum.cubeList.add(new ModelBox(Rostrum, 21, 11, -1.5F, -1.0F, -5.9F, 3, 1, 2, 0.0F, false));
        this.Rostrum.cubeList.add(new ModelBox(Rostrum, 43, 72, -1.0F, -1.0F, -15.8F, 2, 1, 10, 0.0F, false));

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
