package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBrochoadmones extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Brochoadmones;
    private final ModelRenderer Headbase;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Body1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Body2;
    private final ModelRenderer Body3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Ventral7L;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Ventral6L;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Ventral5L;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Body4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Body5;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Ventral4L;
    private final ModelRenderer cube_r12;
    private final ModelRenderer Ventral3L;
    private final ModelRenderer cube_r13;
    private final ModelRenderer PectoralL;
    private final ModelRenderer Ventral2L;
    private final ModelRenderer Ventral1L;
    private final ModelRenderer Cephalon;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer Jaw;

    public ModelSkeletonBrochoadmones() {
        this.textureWidth = 176;
        this.textureHeight = 84;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -19.0F, -2.0F, -16.0F, 34, 2, 53, 0.0F, false));

        this.Brochoadmones = new ModelRenderer(this);
        this.Brochoadmones.setRotationPoint(0.0F, -9.0F, -11.0F);
        this.fossil.addChild(Brochoadmones);


        this.Headbase = new ModelRenderer(this);
        this.Headbase.setRotationPoint(0.0F, 4.2F, 1.0F);
        this.Brochoadmones.addChild(Headbase);
        this.setRotateAngle(Headbase, -0.1745F, 0.0F, -1.5708F);
        this.Headbase.cubeList.add(new ModelBox(Headbase, 48, 38, -2.4F, -3.0F, 1.0F, 0, 6, 2, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.Headbase.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5934F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 31, -2.6F, -3.5954F, 0.029F, 0, 4, 2, 0.0F, false));

        this.Body1 = new ModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Headbase.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 39, 56, -2.4F, -6.0F, 0.0F, 0, 10, 6, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.Body1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 0, -3.1F, -12.0F, 0.4F, 1, 12, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.Body1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3403F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 0, -2.6F, -12.0F, 0.4F, 0, 12, 8, 0.0F, false));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -2.0F, 6.0F);
        this.Body1.addChild(Body2);
        this.setRotateAngle(Body2, 0.1309F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 26, 56, -2.3F, -4.0F, 0.0F, 0, 10, 6, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 39, 21, -2.5F, -4.0F, -1.0F, 0, 10, 6, 0.0F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -2.0F, 6.0F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, 0.0873F, 0.0F, 0.0F);
        this.Body3.cubeList.add(new ModelBox(Body3, 15, 40, -2.5F, -2.0F, 7.0F, 0, 8, 4, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 56, -2.4F, -2.0F, 0.0F, 0, 10, 7, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 31, -2.2F, -2.0F, -1.0F, 0, 10, 7, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.48F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 22, -2.6F, -12.0F, 0.0F, 0, 12, 9, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 66, -3.1F, -12.0F, 0.0F, 1, 12, 1, 0.0F, false));

        this.Ventral7L = new ModelRenderer(this);
        this.Ventral7L.setRotationPoint(-2.7F, 8.0F, 5.6F);
        this.Body3.addChild(Ventral7L);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ventral7L.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3715F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 14, -0.3F, 0.0F, -0.1F, 1, 7, 1, -0.2F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.1F, 0.0F, 0.0F, 0, 7, 6, 0.0F, false));

        this.Ventral6L = new ModelRenderer(this);
        this.Ventral6L.setRotationPoint(-2.7F, 8.0F, 3.1F);
        this.Body3.addChild(Ventral6L);
        this.setRotateAngle(Ventral6L, 0.3491F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ventral6L.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0739F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 38, -0.5F, 0.0F, -0.2F, 1, 5, 1, -0.2F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 21, 0.0F, 0.0F, 0.0F, 0, 5, 4, 0.0F, false));

        this.Ventral5L = new ModelRenderer(this);
        this.Ventral5L.setRotationPoint(-2.5F, 8.0F, 1.0F);
        this.Body3.addChild(Ventral5L);
        this.setRotateAngle(Ventral5L, 0.6545F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ventral5L.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0457F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 56, -0.7F, -0.5F, -0.9F, 1, 5, 1, -0.2F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 66, 62, 0.0F, 0.0F, -0.7F, 0, 5, 4, 0.0F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.0873F, 0.0F, 0.0F);
        this.Body4.cubeList.add(new ModelBox(Body4, 52, 56, -2.7F, 5.5F, -4.0F, 0, 6, 4, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 15, 0, -2.4F, -2.0F, -1.0F, 0, 5, 6, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 56, -2.6F, -1.5F, 0.0F, 0, 13, 5, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.8F, 8.5F, -3.5F);
        this.Body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 0, -0.5F, -3.0F, -0.2F, 1, 6, 1, 0.0F, false));

        this.Body5 = new ModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body4.addChild(Body5);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -2.6F, -4.0F, 0.0F, 0, 16, 14, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 38, -2.5F, -2.0F, 0.0F, 0, 2, 7, 0.0F, false));

        this.Ventral4L = new ModelRenderer(this);
        this.Ventral4L.setRotationPoint(-2.7F, 6.0F, 4.0F);
        this.Body2.addChild(Ventral4L);
        this.setRotateAngle(Ventral4L, 0.8727F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ventral4L.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0765F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 56, -0.6F, -0.3F, -0.5F, 1, 5, 1, -0.2F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 69, 0.0F, 0.0F, -0.3F, 0, 5, 4, 0.0F, false));

        this.Ventral3L = new ModelRenderer(this);
        this.Ventral3L.setRotationPoint(-2.9F, 6.0F, 1.1F);
        this.Body2.addChild(Ventral3L);
        this.setRotateAngle(Ventral3L, 0.9163F, 0.0F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.45F, 0.7794F);
        this.Ventral3L.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0328F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.3F, -0.7F, -1.7F, 1, 4, 1, -0.2F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 61, 56, 0.3F, -0.5F, -1.5F, 0, 5, 4, 0.0F, false));

        this.PectoralL = new ModelRenderer(this);
        this.PectoralL.setRotationPoint(-2.4F, 0.0F, 1.0F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, -0.1745F, 0.0F, 0.0F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 28, 0, 0.1F, -1.0F, 0.0F, 0, 3, 4, 0.0F, false));

        this.Ventral2L = new ModelRenderer(this);
        this.Ventral2L.setRotationPoint(-2.75F, 4.0F, 3.5F);
        this.Body1.addChild(Ventral2L);
        this.setRotateAngle(Ventral2L, 1.1098F, 0.0F, 0.0F);
        this.Ventral2L.cubeList.add(new ModelBox(Ventral2L, 71, 56, 0.1F, 0.0F, -0.3F, 0, 5, 4, 0.0F, false));
        this.Ventral2L.cubeList.add(new ModelBox(Ventral2L, 15, 0, -0.5F, -0.4F, -0.5F, 1, 4, 1, -0.2F, false));

        this.Ventral1L = new ModelRenderer(this);
        this.Ventral1L.setRotationPoint(-2.2F, 4.0F, 0.0F);
        this.Body1.addChild(Ventral1L);
        this.setRotateAngle(Ventral1L, 1.1345F, 0.0F, 0.0F);
        this.Ventral1L.cubeList.add(new ModelBox(Ventral1L, 71, 68, -0.4F, 0.0F, 0.1F, 0, 5, 4, 0.0F, false));
        this.Ventral1L.cubeList.add(new ModelBox(Ventral1L, 22, 0, -0.9F, 0.0F, -0.2F, 1, 3, 1, -0.2F, false));

        this.Cephalon = new ModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.4F, 0.9F);
        this.Headbase.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 42, 43, -2.4F, -1.4F, -4.9F, 0, 3, 5, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(2.0F, 1.6F, -2.9F);
        this.Cephalon.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 31, -4.3F, -0.8F, -1.0F, 0, 1, 5, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -3.4F, 0.1F);
        this.Cephalon.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.6545F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 0, -2.5F, 0.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 3.6F, -0.5F);
        this.Cephalon.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0698F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 48, -2.6F, -1.2148F, -0.0299F, 0, 1, 3, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -2.4F, 0.1F);
        this.Cephalon.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2443F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 33, 56, -2.7F, 0.0F, -4.2F, 0, 1, 4, 0.0F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.4F, 0.1F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0175F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 24, 44, -2.7F, 0.0F, -5.0F, 0, 1, 5, 0.0F, false));

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
