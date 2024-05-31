package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAllenypterus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Allenypterus;
    private final ModelRenderer Cephalon;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Jaw;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Body1;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer PectoralL;
    private final ModelRenderer cube_r15;
    private final ModelRenderer PelvicL;
    private final ModelRenderer cube_r16;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer Body3;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer Body4;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;

    public ModelSkeletonAllenypterus() {
        this.textureWidth = 144;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-2.0F, 24.0F, -4.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 63, 41, -13.0F, -2.0F, -14.0F, 26, 2, 8, -0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -3.0F, -2.0F, -14.0F, 16, 2, 38, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-13.0F, 0.0F, -6.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3229F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 41, -0.0685F, -2.0F, -0.2104F, 15, 2, 32, -0.004F, false));

        this.Allenypterus = new ModelRenderer(this);
        this.Allenypterus.setRotationPoint(1.0F, -2.2F, 0.0F);
        this.fossil.addChild(Allenypterus);
        this.setRotateAngle(Allenypterus, 0.0F, 0.0F, -1.5708F);


        this.Cephalon = new ModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, -2.3F, -5.0F);
        this.Allenypterus.addChild(Cephalon);
        this.setRotateAngle(Cephalon, -0.0873F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 5.8892F, -1.2381F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -3.1241F, 0.0F, 3.1416F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 41, -0.2F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.1F, -0.443F, -1.277F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.8203F, 0.0F, 3.1416F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 31, 0.0F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.2F, 2.361F, -2.8881F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -2.7925F, 0.0F, 3.1416F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 12, 0.0F, -2.5F, -1.5F, 0, 5, 3, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.4F, 3.1F, -1.5F);
        this.Cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 3.1416F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 29, 21, 0.0F, -3.0F, -1.5F, 0, 6, 3, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 2.2686F, -1.6618F);
        this.Cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -2.9583F, 0.0F, -3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 15, 0.0F, -0.4F, -0.5F, 0, 2, 2, 0.0F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 5.3F, -2.9F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.7941F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.0864F, -0.6228F);
        this.Jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -2.8798F, 0.0F, -3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 33, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.1F, 0.289F, -1.1719F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -2.3562F, 0.0F, -3.1416F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 24, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.Body1 = new ModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 1.0F, -5.2F);
        this.Allenypterus.addChild(Body1);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 4.2879F, 9.7796F);
        this.Body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4276F, 0.0F, -3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 0, 0.0F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.1F, -8.2847F, 4.8688F);
        this.Body1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -2.6529F, 0.0F, -3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 7, 60, 0.0F, -2.0F, -1.5F, 0, 4, 3, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -7.838F, 0.7839F);
        this.Body1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -2.8449F, 0.0F, -3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 56, 0.1F, -3.0F, -1.5F, 0, 6, 3, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.6F, -0.4F, 2.5F);
        this.Body1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 3.1416F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 24, 0.3F, -4.0F, -2.5F, 0, 8, 5, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -5.1815F, 3.1295F);
        this.Body1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -3.0718F, 0.0F, -3.1416F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, -2.0F, -2.0F, 0, 4, 4, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.2F, -4.8093F, 0.9459F);
        this.Body1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 2.6529F, 0.0F, 3.1416F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 25, 57, 0.0F, -2.0F, -1.5F, 0, 4, 3, 0.0F, false));

        this.PectoralL = new ModelRenderer(this);
        this.PectoralL.setRotationPoint(0.7F, -1.75F, 1.75F);
        this.Body1.addChild(PectoralL);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.PectoralL.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 3.1416F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 22, 25, 0.3F, -2.0F, -3.0F, 0, 4, 6, 0.0F, false));

        this.PelvicL = new ModelRenderer(this);
        this.PelvicL.setRotationPoint(0.7F, 2.8F, 3.1F);
        this.Body1.addChild(PelvicL);
        this.setRotateAngle(PelvicL, 0.829F, 0.0F, 0.0F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.PelvicL.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 27, 41, 0.3F, -2.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.0F, 4.8F);
        this.Body1.addChild(Body2);
        this.setRotateAngle(Body2, 0.0436F, 0.0F, 0.0F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -3.9951F, 4.1801F);
        this.Body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -2.7227F, 0.0F, -3.1416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 41, 0.0F, -3.5F, -3.5F, 0, 7, 7, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.4F, -1.8046F, 2.5989F);
        this.Body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -2.7576F, 0.0F, 3.1416F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 11, 16, 0.3F, -3.0F, -4.0F, 0, 6, 8, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 1.1F, 3.5F);
        this.Body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 3.1416F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 19, 0, 0.3F, -3.5F, -3.5F, 0, 7, 7, 0.0F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.9F, 6.7F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, 0.0873F, 0.0F, 0.0F);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 5.1F, 2.5F);
        this.Body3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 3.1416F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 21, 47, 0.0F, -2.0F, -2.5F, 0, 4, 5, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.1F, -3.1406F, 2.8601F);
        this.Body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -2.7751F, 0.0F, 3.1416F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 10, 52, 0.2F, -1.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.3F, -1.6802F, 2.0252F);
        this.Body3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -2.7751F, 0.0F, 3.1416F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 15, 0.3F, -1.5F, -2.5F, 0, 3, 5, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.4F, 1.2F, 2.5F);
        this.Body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 3.1416F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 15, 41, 0.1F, -2.5F, -2.5F, 0, 5, 5, 0.0F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.1F, 0.4F, 4.8F);
        this.Body3.addChild(Body4);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.1F, -0.3F, 4.7F);
        this.Body4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 3.1416F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, 0.0F, -7.0F, -4.5F, 0, 14, 9, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.2F, 0.0117F, 5.067F);
        this.Body4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 2.7053F, 0.0F, 3.1416F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 27, 0, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.2F, 1.5856F, 1.528F);
        this.Body4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 2.7227F, 0.0F, 3.1416F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 10, 0, 0.1F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.5932F, 2.84F);
        this.Body4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -2.9147F, 0.0F, -3.1416F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.6434F, 4.1517F);
        this.Body4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -2.9147F, 0.0F, -3.1416F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 8, 41, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.1F, -0.3439F, 1.0037F);
        this.Body4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -2.9147F, 0.0F, -3.1416F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 18, 57, 0.1F, -2.0F, -1.5F, 0, 4, 3, 0.0F, false));

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
