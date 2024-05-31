package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPalaeoniscum extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Palaeoniscum;
    private final ModelRenderer Cephalon;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Jaw;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer Body1;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer PectoralL;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer AnalL;
    private final ModelRenderer Body3;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer Body4;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer Body5;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;

    public ModelSkeletonPalaeoniscum() {
        this.textureWidth = 192;
        this.textureHeight = 130;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(5.0F, 24.0F, -5.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 58, -34.0F, -2.0F, -25.0F, 35, 2, 26, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(25.0F, 0.0F, 40.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.3963F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -68.7879F, -2.0F, -0.0395F, 69, 2, 26, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-34.0F, 0.0F, 1.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.9599F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 29, 0.0F, -2.0F, -26.0F, 66, 2, 26, -0.003F, false));

        this.Palaeoniscum = new ModelRenderer(this);
        this.Palaeoniscum.setRotationPoint(-3.0F, 0.0F, -4.0F);
        this.fossil.addChild(Palaeoniscum);
        this.setRotateAngle(Palaeoniscum, -1.2217F, 0.0F, -1.5708F);


        this.Cephalon = new ModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 2.0F, -12.0F);
        this.Palaeoniscum.addChild(Cephalon);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(3.1F, -1.1767F, -14.5933F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 2.6965F, 0.0F, -3.1416F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.0F, -2.5F, -2.0F, 0, 5, 4, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(3.1F, -5.2563F, -1.7457F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 2.9845F, 0.0F, -3.1416F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 46, 0.0F, -1.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(3.2F, 0.0F, -2.0F);
        this.Cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 3.1416F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 78, 108, 0.0F, -5.0F, -3.0F, 0, 10, 6, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(3.0F, 4.3663F, -2.4196F);
        this.Cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -3.0369F, 0.0F, 3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 29, 0.0F, -1.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(3.0F, -2.1433F, -8.4374F);
        this.Cephalon.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 2.9758F, 0.0F, -3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, -3.0F, -5.0F, 0, 6, 10, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(3.4F, -1.142F, -12.5123F);
        this.Cephalon.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -2.9583F, 0.0F, 3.1416F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 0, 0.0F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(3.3F, -0.5F, -12.9F);
        this.Cephalon.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 3.1416F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 62, 87, 0.0F, -2.5F, -2.5F, 0, 5, 5, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(3.1F, -1.0F, -6.9F);
        this.Cephalon.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 3.1416F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 91, 108, 0.0F, -3.0F, -3.5F, 0, 6, 7, 0.0F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.1745F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(2.9F, -1.0F, -1.0F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 3.1416F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(2.8F, 1.613F, -5.4328F);
        this.Jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -2.9496F, 0.0F, 3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 62, 87, 0.0F, -0.5F, -5.5F, 0, 1, 11, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(2.9F, 1.0F, -3.0F);
        this.Jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 3.1416F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 17, 0.0F, -1.0F, -3.0F, 0, 2, 6, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(2.9F, 0.5F, -8.5F);
        this.Jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 3.1416F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 87, 0.0F, -0.5F, -2.5F, 0, 1, 5, 0.0F, false));

        this.Body1 = new ModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 2.0F, -12.0F);
        this.Palaeoniscum.addChild(Body1);
        this.setRotateAngle(Body1, 0.3054F, 0.0F, 0.0F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(2.8F, 4.8785F, 13.463F);
        this.Body1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 3.1067F, 0.0F, -3.1416F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 114, 98, 0.0F, -1.0F, -3.5F, 0, 2, 7, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(2.9F, 4.819F, 5.0345F);
        this.Body1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -3.098F, 0.0F, -3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 87, 0.0F, -1.0F, -5.0F, 0, 2, 10, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(2.9F, -5.8481F, 8.6333F);
        this.Body1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 3.0543F, 0.0F, 3.1416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 78, 87, 0.0F, -1.5F, -8.5F, 0, 3, 17, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(3.0F, -0.5F, 8.0F);
        this.Body1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 3.1416F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 45, 87, 0.0F, -5.5F, -8.0F, 0, 11, 16, 0.01F, false));

        this.PectoralL = new ModelRenderer(this);
        this.PectoralL.setRotationPoint(3.1F, 3.0F, -0.2F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.0F, -0.825F, 1.5708F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 23, 87, 0.0F, 0.0F, -3.0F, 10, 0, 7, 0.0F, false));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 17.0F);
        this.Body1.addChild(Body2);
        this.setRotateAngle(Body2, 0.1309F, 0.0F, 0.0F);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(2.5F, -9.5F, 5.5F);
        this.Body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 3.1416F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 29, 0.0F, -3.5F, -4.5F, 0, 7, 9, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(2.9F, 3.8418F, 2.4232F);
        this.Body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 3.002F, 0.0F, 3.1416F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 78, 92, 0.0F, -1.5F, -4.0F, 0, 3, 8, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(2.6F, -6.259F, 3.3257F);
        this.Body2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -3.0543F, 0.0F, -3.1416F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 106, 114, 0.0F, -1.5F, -3.5F, 0, 3, 7, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(3.0F, -1.0F, 2.0F);
        this.Body2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 3.1416F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 58, 0.0F, -5.0F, -4.0F, 0, 10, 8, 0.0F, false));

        this.AnalL = new ModelRenderer(this);
        this.AnalL.setRotationPoint(3.1F, 4.0F, 1.0F);
        this.Body2.addChild(AnalL);
        this.setRotateAngle(AnalL, 0.0F, -0.6109F, 1.5708F);
        this.AnalL.cubeList.add(new ModelBox(AnalL, 23, 95, 0.0F, 0.0F, -1.0F, 7, 0, 6, 0.0F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, 0.3054F, 0.0F, 0.0F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(2.5F, 6.0538F, 5.9625F);
        this.Body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 2.8274F, 0.0F, 3.1416F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 9, 69, 0.0F, -3.0F, -4.0F, 0, 6, 8, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(2.7F, 2.3337F, 3.1253F);
        this.Body3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 2.9147F, 0.0F, 3.1416F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 97, 58, 0.0F, -1.5F, -4.5F, 0, 3, 9, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(2.7F, -4.8358F, 3.5919F);
        this.Body3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -2.9671F, 0.0F, 3.1416F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 97, 71, 0.0F, -2.0F, -4.0F, 0, 4, 8, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(2.9F, -1.5F, 3.0F);
        this.Body3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 3.1416F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 96, 87, 0.0F, -3.5F, -4.0F, 0, 7, 8, 0.0F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -1.0F, 7.0F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.2618F, 0.0F, 0.0F);


        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(2.6F, 1.9563F, 3.0452F);
        this.Body4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 3.002F, 0.0F, -3.1416F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 45, 115, 0.0F, -1.5F, -3.5F, 0, 3, 7, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(2.6F, -2.3781F, 4.0357F);
        this.Body4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -2.9496F, 0.0F, 3.1416F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 109, 64, 0.0F, -2.0F, -3.5F, 0, 4, 7, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(2.8F, -0.5F, 3.0F);
        this.Body4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 3.1416F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 105, 100, 0.0F, -2.5F, -4.0F, 0, 5, 8, 0.0F, false));

        this.Body5 = new ModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body4.addChild(Body5);
        this.setRotateAngle(Body5, 0.2618F, 0.0F, 0.0F);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(2.3F, 0.5F, 12.8F);
        this.Body5.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 3.1416F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 87, 0.0F, -8.5F, -11.0F, 0, 17, 22, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(2.6F, -5.3799F, 14.186F);
        this.Body5.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 2.8972F, 0.0F, 3.1416F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 11, 0, 0.0F, -1.0F, -3.5F, 0, 2, 7, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(2.6F, -2.8539F, 7.8051F);
        this.Body5.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 2.7751F, 0.0F, -3.1416F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 113, 87, 0.0F, -1.5F, -3.5F, 0, 3, 7, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(2.5F, 1.9255F, 1.8337F);
        this.Body5.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 3.002F, 0.0F, 3.1416F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 13, 17, 0.0F, -0.5F, -3.0F, 0, 1, 6, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(2.5F, -3.084F, 2.4469F);
        this.Body5.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -3.0543F, 0.0F, -3.1416F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 9, 58, 0.0F, -0.5F, -2.5F, 0, 1, 5, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(2.7F, -0.5F, 2.0F);
        this.Body5.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 3.1416F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 13, 40, 0.0F, -2.5F, -3.0F, 0, 5, 6, 0.0F, false));

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
