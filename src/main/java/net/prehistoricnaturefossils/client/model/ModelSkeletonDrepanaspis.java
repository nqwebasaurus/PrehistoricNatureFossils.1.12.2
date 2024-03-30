package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDrepanaspis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body;
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
    private final ModelRenderer cube_r17;
    private final ModelRenderer bone3;
    private final ModelRenderer cube_r18;
    private final ModelRenderer bone2;
    private final ModelRenderer cube_r19;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r20;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer body5;
    private final ModelRenderer cube_r26;
    private final ModelRenderer fin;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r27;

    public ModelSkeletonDrepanaspis() {
        this.textureWidth = 70;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, -3.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -6.0F, -2.0F, -5.0F, 12, 2, 11, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5F, -1.5F, -6.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.48F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 14, -4.4F, -1.5F, -1.5F, 10, 3, 6, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(5.9F, 0.0F, 6.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.6406F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 24, -9.7717F, -1.0F, -2.8705F, 10, 1, 3, 0.005F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(9.0F, 0.0F, -5.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.4835F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 45, -11.0F, -2.0F, -4.0F, 11, 2, 2, 0.005F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-6.0F, 0.0F, 6.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 29, 0.0F, -2.0F, 0.0F, 3, 2, 13, 0.004F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-6.0F, 0.0F, 6.0F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.3054F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 14, 1.0F, -1.0F, 0.0F, 8, 1, 13, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-6.0F, 0.0F, -5.0F);
        this.fossil.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 1.0036F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 29, 0.0F, -1.0F, 0.0F, 10, 1, 11, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, -0.0441F, -0.1706F, 0.0948F);
        this.body.cubeList.add(new ModelBox(body, 36, 0, -4.0F, -3.0F, -5.0F, 8, 3, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 47, 11, -3.99F, -2.0F, 1.925F, 8, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 42, -3.0F, -0.75F, -5.025F, 6, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 30, 54, -0.5F, -3.125F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.0F, -3.0F, 2.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.8727F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 7, -1.25F, 0.025F, -1.5F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(2.0F, -3.0F, 2.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.8727F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 51, -0.75F, 0.025F, -1.5F, 2, 1, 2, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 33, -2.99F, -1.0F, -1.75F, 6, 1, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 24, -2.49F, -1.0F, -2.75F, 5, 1, 1, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.0F, 0.15F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 21, -2.5F, -3.875F, -6.775F, 5, 1, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-4.0F, -1.8F, -5.0F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.5672F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 50, 37, -0.15F, -0.25F, -2.85F, 1, 1, 3, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-4.0F, -2.0F, -5.0F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, -0.48F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 35, 0.1F, 0.75F, -2.6F, 1, 1, 3, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(4.0F, -2.0F, -5.0F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2618F, 0.48F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 42, -1.1F, 0.75F, -2.6F, 1, 1, 3, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-4.0F, -2.125F, -5.1F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, -0.0873F, -0.0873F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 45, 50, 0.55F, -0.35F, -1.1F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(4.0F, -2.125F, -5.1F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2618F, 0.0873F, 0.0873F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 6, 51, -1.55F, -0.35F, -1.1F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(4.0F, -1.8F, -5.0F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.5672F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 51, -0.85F, -0.25F, -2.85F, 1, 1, 3, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -3.0F, -4.85F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2618F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 50, 29, -3.5F, 0.1F, -1.0F, 7, 2, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 50, -3.0F, 0.1F, -2.0F, 6, 2, 1, 0.0F, false));

        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(4.1F, -1.9F, -4.65F);
        this.body.addChild(bone3);
        this.setRotateAngle(bone3, -0.0175F, -0.1745F, -0.2618F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.0F, 1.5F, 4.75F);
        this.bone3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1745F, 0.1745F, -0.7854F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 19, 50, 3.65F, 1.55F, -4.05F, 1, 1, 8, 0.0F, false));

        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(-4.1F, -1.9F, -4.65F);
        this.body.addChild(bone2);
        this.setRotateAngle(bone2, -0.0175F, 0.1745F, 0.2618F);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(4.0F, 1.5F, 4.75F);
        this.bone2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1745F, -0.1745F, 0.7854F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 46, 45, -4.65F, 1.55F, -4.05F, 1, 1, 8, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.75F, 1.75F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.1309F, 0.1745F, -0.4363F);
        this.body2.cubeList.add(new ModelBox(body2, 32, 29, -1.0F, -1.2F, 0.0F, 2, 3, 2, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.075F, 0.0F);
        this.body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3927F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 24, -0.5F, -0.85F, 1.3F, 1, 1, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 35, 24, -0.5F, -1.25F, 0.3F, 1, 1, 1, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0865F, 0.0005F, -0.2068F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 14, -1.0F, -1.199F, 0.0F, 2, 3, 3, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.835F, 0.1F);
        this.body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.6036F, -0.0244F, 0.0847F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 57, 14, -0.5F, 0.1F, 0.9F, 1, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 10, 56, -0.5F, 0.8F, 1.9F, 1, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 30, 24, -0.5F, -0.5F, -0.1F, 1, 1, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.301F, 0.0F);
        this.body3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.4363F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 17, 55, -0.1F, -0.3F, 2.0F, 1, 1, 1, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 30, 14, -0.5F, -1.3F, 1.1F, 1, 2, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.301F, 0.0F);
        this.body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.4363F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 37, 54, 0.0F, -1.3F, 0.0F, 1, 2, 1, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 6, 37, -0.9F, -1.3F, 2.0F, 1, 1, 1, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 56, -0.4F, -0.3F, 1.0F, 1, 1, 1, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.0756F, 0.2221F, -0.0487F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, -1.0F, -1.2F, 0.0F, 2, 3, 3, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.825F, 0.5F);
        this.body4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.5672F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 5, 56, -0.5F, 0.6F, 1.6F, 1, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 38, 35, -0.5F, -0.1F, 0.6F, 1, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 4, 29, -0.5F, -0.7F, -0.4F, 1, 1, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.9F, 1.3F, 0.0F);
        this.body4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.3054F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 47, 55, -1.5F, -0.5F, 1.7F, 1, 1, 1, -0.003F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 8, 14, -1.5F, -2.5F, 1.7F, 1, 1, 1, -0.003F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 56, 37, -1.2F, -1.5F, 1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 52, 55, -0.9F, -0.5F, 0.0F, 1, 1, 1, -0.003F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.0341F, -0.1264F, -0.0458F);
        this.body5.cubeList.add(new ModelBox(body5, 36, 0, -0.5F, -1.199F, 0.0F, 1, 3, 2, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 0.301F, 0.0F);
        this.body5.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.3491F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 42, 54, -1.4F, -0.5F, 0.8F, 1, 2, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 22, 55, -1.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.fin = new ModelRenderer(this);
        this.fin.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(fin);
        this.setRotateAngle(fin, -0.0076F, 0.0869F, -0.4367F);
        this.fin.cubeList.add(new ModelBox(fin, 0, 42, 0.0F, -1.7F, 0.0F, 0, 4, 2, 0.0F, false));
        this.fin.cubeList.add(new ModelBox(fin, 0, 29, 0.0F, -2.2F, 2.0F, 0, 5, 3, 0.0F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -2.825F, 0.025F);
        this.body.addChild(bone);
        this.setRotateAngle(bone, 0.1745F, 0.0F, 0.0F);


        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.7854F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 9, 51, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

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
