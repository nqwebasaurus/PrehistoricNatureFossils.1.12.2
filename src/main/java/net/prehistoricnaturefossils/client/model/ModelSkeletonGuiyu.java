package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGuiyu extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Guiyu;
    private final ModelRenderer Head;
    private final ModelRenderer cube_r1;
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
    private final ModelRenderer PectoralL;
    private final ModelRenderer PectoralR;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Body3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer AnalL;
    private final ModelRenderer Body4;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer Body5;
    private final ModelRenderer cube_r17;

    public ModelSkeletonGuiyu() {
        this.textureWidth = 160;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(4.0F, 24.0F, -3.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -18.0F, -2.0F, -20.0F, 29, 2, 45, 0.0F, false));

        this.Guiyu = new ModelRenderer(this);
        this.Guiyu.setRotationPoint(0.0F, 8.8F, 0.0F);
        this.fossil.addChild(Guiyu);


        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-7.4F, -13.3F, -9.3F);
        this.Guiyu.addChild(Head);
        this.setRotateAngle(Head, -0.6545F, 0.0F, -1.5708F);
        this.Head.cubeList.add(new ModelBox(Head, 22, 57, -2.1F, -1.6F, -7.2F, 0, 2, 4, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 50, 48, -1.7F, -3.0F, -4.0F, 0, 6, 4, 0.001F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3665F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 54, 54, -2.0F, -1.9563F, -0.4924F, 0, 2, 5, 0.001F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.8F, -7.2F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5411F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 15, -2.2F, 0.4861F, -2.1768F, 0, 2, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 21, -1.9F, -0.0139F, -1.9768F, 0, 2, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.3F, -4.1F, -1.7F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0698F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 19, -1.5F, -0.0458F, 0.0617F, 0, 2, 2, -0.001F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.3F, -1.9F, -7.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4014F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 48, -1.5F, 0.0F, -0.2F, 0, 2, 6, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.5F, -7.5F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5323F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.8F, -0.2795F, -0.6268F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, -7.9F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.192F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -2.1F, -1.8F, 0.0F, 0, 2, 3, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 57, -2.0F, -2.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(-0.2F, 1.8F, -4.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.288F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 11, 57, -1.7F, -0.2F, -3.9F, 0, 1, 5, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 24, 38, -1.9F, -0.4F, -3.5F, 0, 1, 5, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.8F, -3.9F);
        this.Jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3142F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 0, -2.1F, -1.5F, -1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 2, -1.8F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.8F, -3.9F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 57, -1.6F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.Body1 = new ModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 10, 14, -1.9F, -4.3F, 0.0F, 0, 9, 7, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -4.3F, 0.0F);
        this.Body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4712F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 8, -2.2F, 0.7F, 1.4F, 0, 3, 7, 0.0F, false));

        this.PectoralL = new ModelRenderer(this);
        this.PectoralL.setRotationPoint(-1.8F, 3.5F, 1.3F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.0F, -0.48F, 1.5708F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 12, 34, -0.1402F, -0.0376F, -1.3987F, 6, 0, 3, 0.0F, false));

        this.PectoralR = new ModelRenderer(this);
        this.PectoralR.setRotationPoint(-2.0F, 3.5F, 1.3F);
        this.Body1.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.0F, 1.0908F, -1.5708F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 25, 0, -5.8598F, -0.0376F, -1.3987F, 6, 0, 3, 0.0F, false));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body1.addChild(Body2);
        this.setRotateAngle(Body2, 0.0873F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 18, 0, -2.0F, -4.0F, -1.0F, 0, 8, 6, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.6F, -4.3F, 0.0F);
        this.Body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 38, -1.5F, 0.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.6F, 3.9F, 4.9F);
        this.Body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 37, -1.5F, -0.5897F, -5.9637F, 0, 1, 6, 0.0F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, 0.3054F, 0.0F, 0.0F);
        this.Body3.cubeList.add(new ModelBox(Body3, 26, 19, -2.1F, -2.2F, -1.0F, 0, 5, 6, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.7F, 4.0F, 0.0F);
        this.Body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1396F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 4, -1.5F, -2.1F, -1.4F, 0, 2, 6, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 24, -2.3F, -5.0F, -0.1F, 0, 5, 7, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 48, -2.3F, 0.0F, -0.1F, 0, 2, 6, 0.0F, false));

        this.AnalL = new ModelRenderer(this);
        this.AnalL.setRotationPoint(-2.1F, 3.0F, 0.6F);
        this.Body3.addChild(AnalL);
        this.setRotateAngle(AnalL, 0.0F, -1.0472F, 1.5708F);
        this.AnalL.cubeList.add(new ModelBox(AnalL, 9, 0, 0.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.2618F, 0.0F, 0.0F);
        this.Body4.cubeList.add(new ModelBox(Body4, 31, 31, -2.2F, -1.2F, -1.0F, 0, 3, 6, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 3.1F, 0.9F);
        this.Body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7505F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 14, -2.4F, -0.4123F, -0.5197F, 0, 4, 5, -0.002F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.0F, 5.4F);
        this.Body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1396F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 24, -2.3F, -1.8719F, -6.6501F, 0, 2, 7, -0.002F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -2.6F, 0.0F);
        this.Body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 48, -2.4F, 0.0F, 0.0F, 0, 2, 6, 0.0F, false));

        this.Body5 = new ModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.3F, 5.0F);
        this.Body4.addChild(Body5);
        this.setRotateAngle(Body5, 0.1745F, 0.0F, 0.0F);
        this.Body5.cubeList.add(new ModelBox(Body5, 39, 48, -2.2F, -1.5F, -1.0F, 0, 3, 5, 0.002F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 0, -2.3F, -6.3F, 2.0F, 0, 12, 8, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.9F, -0.1F);
        this.Body5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2269F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 26, -2.4F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

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
