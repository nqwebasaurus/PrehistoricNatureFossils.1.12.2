package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTropaeum extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer shell0;
    private final ModelRenderer Shell;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Shell2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Shell3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Shell4;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Shell5;
    private final ModelRenderer Shell6;
    private final ModelRenderer Shell7;
    private final ModelRenderer Shell8;
    private final ModelRenderer Shell9;
    private final ModelRenderer Shell10;
    private final ModelRenderer Shell11;
    private final ModelRenderer Shell12;
    private final ModelRenderer stand;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer back;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;

    public ModelSkeletonTropaeum() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-3.5F, 4.0F, 4.5F);


        this.shell0 = new ModelRenderer(this);
        this.shell0.setRotationPoint(4.0F, 3.0F, 3.0F);
        this.fossil.addChild(shell0);
        this.setRotateAngle(shell0, 0.0F, 0.0F, -0.1745F);


        this.Shell = new ModelRenderer(this);
        this.Shell.setRotationPoint(0.5F, 1.0F, 7.5F);
        this.shell0.addChild(Shell);
        this.setRotateAngle(Shell, 1.3963F, 0.0F, 0.0F);
        this.Shell.cubeList.add(new ModelBox(Shell, 18, 47, -3.5F, -7.1808F, -5.5736F, 7, 8, 5, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -2.0F, -2.275F);
        this.Shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.096F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 60, -3.5F, -4.0F, -0.5F, 8, 8, 1, 0.0F, false));

        this.Shell2 = new ModelRenderer(this);
        this.Shell2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.6109F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 0, -3.5F, -6.0F, -10.0F, 7, 7, 10, -0.01F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 54, 60, -4.0F, -4.65F, -4.825F, 8, 7, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.25F, -1.15F);
        this.Shell2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.336F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 60, -3.5F, -4.5F, -0.5F, 8, 8, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.05F, -7.475F);
        this.Shell2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 64, 11, -3.5F, -3.5F, -0.5F, 8, 7, 1, 0.0F, false));

        this.Shell3 = new ModelRenderer(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.6109F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 0, 17, -3.0F, -5.1808F, -9.4264F, 6, 6, 10, 0.0F, false));
        this.Shell3.cubeList.add(new ModelBox(Shell3, 66, 45, -3.5F, -3.55F, -5.75F, 7, 6, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.35F, -8.75F);
        this.Shell3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 66, 52, -3.5F, -3.0F, -0.5F, 7, 6, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.05F, -1.575F);
        this.Shell3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 64, 19, -4.0F, -3.0F, -0.5F, 8, 6, 1, 0.0F, false));

        this.Shell4 = new ModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.6981F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 32, 17, -3.0F, -5.7412F, -9.0341F, 6, 6, 10, -0.01F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.925F, -5.7F);
        this.Shell4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0654F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 66, -3.5F, -3.0F, -0.5F, 7, 6, 1, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.925F, -2.95F);
        this.Shell4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.192F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 26, -3.5F, -3.0F, -0.5F, 7, 6, 1, 0.0F, false));

        this.Shell5 = new ModelRenderer(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -0.7243F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 28, 33, -2.5F, -5.4462F, -8.1051F, 5, 5, 9, 0.0F, false));

        this.Shell6 = new ModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.8029F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 0, 33, -2.5F, -5.9537F, -8.6993F, 5, 5, 9, -0.01F, false));

        this.Shell7 = new ModelRenderer(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.8029F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 34, 0, -2.0F, -5.8788F, -9.4772F, 4, 5, 9, 0.0F, false));

        this.Shell8 = new ModelRenderer(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -0.8552F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 42, 47, -2.0F, -5.2164F, -8.9763F, 4, 5, 8, -0.01F, false));

        this.Shell9 = new ModelRenderer(this);
        this.Shell9.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -0.8683F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 56, 33, -1.5F, -4.3947F, -7.796F, 3, 5, 7, 0.0F, false));

        this.Shell10 = new ModelRenderer(this);
        this.Shell10.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Shell9.addChild(Shell10);
        this.setRotateAngle(Shell10, -0.8552F, 0.0F, 0.0F);
        this.Shell10.cubeList.add(new ModelBox(Shell10, 60, 0, -1.0F, -3.0021F, -7.0654F, 2, 4, 7, 0.0F, false));

        this.Shell11 = new ModelRenderer(this);
        this.Shell11.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Shell10.addChild(Shell11);
        this.setRotateAngle(Shell11, -0.8552F, 0.0F, 0.0F);
        this.Shell11.cubeList.add(new ModelBox(Shell11, 54, 68, -0.5F, -3.296F, -3.2898F, 1, 4, 4, 0.0F, false));
        this.Shell11.cubeList.add(new ModelBox(Shell11, 0, 47, 0.0F, -9.296F, -9.2898F, 0, 10, 9, 0.0F, false));

        this.Shell12 = new ModelRenderer(this);
        this.Shell12.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell11.addChild(Shell12);
        this.setRotateAngle(Shell12, -0.6763F, 0.0F, 0.0F);


        this.stand = new ModelRenderer(this);
        this.stand.setRotationPoint(-6.5F, 10.0F, 7.5F);
        this.fossil.addChild(stand);
        this.stand.cubeList.add(new ModelBox(stand, 0, 101, 4.0F, 5.0F, -21.05F, 5, 5, 18, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(14.0F, 8.25F, -2.25F);
        this.stand.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4129F, 0.0106F, -0.1985F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 92, 118, -5.0F, -4.0F, -1.0F, 9, 2, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(14.0F, 10.25F, -11.5F);
        this.stand.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0264F, 0.0203F, -0.1884F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 92, 118, -5.0F, -4.0F, -1.0F, 9, 2, 1, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(14.0F, 8.25F, -18.75F);
        this.stand.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3755F, 0.0203F, -0.1884F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 92, 118, -5.0F, -4.0F, -1.0F, 9, 2, 1, 0.0F, false));

        this.back = new ModelRenderer(this);
        this.back.setRotationPoint(8.75F, 9.0F, -2.075F);
        this.stand.addChild(back);
        this.back.cubeList.add(new ModelBox(back, 16, 84, -3.0F, -16.75F, -15.25F, 1, 1, 9, 0.0F, false));
        this.back.cubeList.add(new ModelBox(back, 12, 80, -3.75F, -9.75F, -16.925F, 1, 1, 13, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.175F, -19.475F);
        this.back.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1891F, 0.0803F, 0.094F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 96, -5.0F, -24.0F, 0.0F, 1, 22, 1, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.325F, -23.3F, -11.25F);
        this.back.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0783F, 0.0503F, 0.0836F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 87, -1.0F, -0.0846F, -2.8462F, 1, 2, 6, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.45F, -20.375F, -12.475F);
        this.back.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4134F, 0.0506F, -0.181F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 31, 96, -2.0F, -4.0F, -1.0F, 6, 2, 1, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, -0.05F);
        this.back.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.32F, -0.0803F, 0.094F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 96, -5.0F, -24.0F, -1.0F, 1, 22, 1, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.25F, -19.675F, -9.525F);
        this.back.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5465F, 0.0506F, -0.181F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 96, -2.0F, -4.0F, -1.0F, 6, 2, 1, 0.0F, false));

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
