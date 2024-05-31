package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonVestinautilus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer whole;
    private final ModelRenderer shell;
    private final ModelRenderer shell_r1;
    private final ModelRenderer shell_r2;
    private final ModelRenderer shell_r3;
    private final ModelRenderer shell_r4;
    private final ModelRenderer shell_r5;
    private final ModelRenderer shell_r6;
    private final ModelRenderer shell_r7;
    private final ModelRenderer shell_r8;
    private final ModelRenderer shell_r9;
    private final ModelRenderer shell_r10;
    private final ModelRenderer shell_r11;

    public ModelSkeletonVestinautilus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-1.0F, 20.0F, -2.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -7.0F, -7.0F, -14.0F, 13, 11, 27, -0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 39, -6.0F, -1.0F, -8.0F, 18, 5, 25, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 62, 20, -10.0F, -11.0F, -11.0F, 11, 15, 19, 0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(5.2F, -11.0F, 0.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.4363F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 92, -6.0F, -14.0F, 3.5F, 9, 25, 6, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 87, 55, -3.0F, -4.0F, -6.5F, 6, 15, 10, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(4.7163F, -16.5F, 1.8289F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.829F, 0.4363F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 0, -2.0F, -1.5F, -4.5F, 4, 6, 11, 0.0F, false));

        this.whole = new ModelRenderer(this);
        this.whole.setRotationPoint(-4.0F, -9.0F, -2.0F);
        this.fossil.addChild(whole);
        this.setRotateAngle(whole, -1.6144F, 0.0F, 0.0F);


        this.shell = new ModelRenderer(this);
        this.shell.setRotationPoint(4.0447F, -0.1511F, -8.6524F);
        this.whole.addChild(shell);
        this.setRotateAngle(shell, -0.6765F, -0.3391F, 0.3569F);


        this.shell_r1 = new ModelRenderer(this);
        this.shell_r1.setRotationPoint(3.4553F, 2.5511F, -5.0476F);
        this.shell.addChild(shell_r1);
        this.setRotateAngle(shell_r1, 0.8727F, -0.0436F, 0.0F);
        this.shell_r1.cubeList.add(new ModelBox(shell_r1, 9, 52, -3.6393F, -5.7495F, 6.6307F, 1, 8, 2, 0.0F, false));

        this.shell_r2 = new ModelRenderer(this);
        this.shell_r2.setRotationPoint(3.4553F, 10.5511F, 8.9524F);
        this.shell.addChild(shell_r2);
        this.setRotateAngle(shell_r2, -0.0873F, -0.0436F, 0.0F);
        this.shell_r2.cubeList.add(new ModelBox(shell_r2, 0, 52, -4.5F, -12.5F, -10.25F, 2, 8, 2, 0.0F, false));

        this.shell_r3 = new ModelRenderer(this);
        this.shell_r3.setRotationPoint(-0.2947F, 3.5511F, -8.0476F);
        this.shell.addChild(shell_r3);
        this.setRotateAngle(shell_r3, 0.6109F, 0.0F, 0.0F);
        this.shell_r3.cubeList.add(new ModelBox(shell_r3, 102, 5, -1.75F, 3.2349F, 0.1785F, 4, 4, 8, 0.0F, false));

        this.shell_r4 = new ModelRenderer(this);
        this.shell_r4.setRotationPoint(-0.7947F, -8.4489F, -2.0476F);
        this.shell.addChild(shell_r4);
        this.setRotateAngle(shell_r4, 0.6109F, 0.0F, 0.0F);
        this.shell_r4.cubeList.add(new ModelBox(shell_r4, 0, 39, -2.25F, 3.5322F, -17.2149F, 6, 6, 6, 0.0F, false));

        this.shell_r5 = new ModelRenderer(this);
        this.shell_r5.setRotationPoint(-0.2947F, 3.5511F, -8.0476F);
        this.shell.addChild(shell_r5);
        this.setRotateAngle(shell_r5, -0.0873F, 0.0F, 0.0F);
        this.shell_r5.cubeList.add(new ModelBox(shell_r5, 85, 0, -2.25F, 0.4849F, -1.8215F, 5, 5, 7, 0.0F, false));

        this.shell_r6 = new ModelRenderer(this);
        this.shell_r6.setRotationPoint(-0.7947F, -8.4489F, -2.0476F);
        this.shell.addChild(shell_r6);
        this.setRotateAngle(shell_r6, 0.1309F, 0.0F, 0.0F);
        this.shell_r6.cubeList.add(new ModelBox(shell_r6, 0, 0, -2.75F, 0.2822F, -14.2149F, 7, 12, 6, 0.0F, false));

        this.shell_r7 = new ModelRenderer(this);
        this.shell_r7.setRotationPoint(-0.7947F, -8.4489F, -2.0476F);
        this.shell.addChild(shell_r7);
        this.setRotateAngle(shell_r7, -0.829F, 0.0F, 0.0F);
        this.shell_r7.cubeList.add(new ModelBox(shell_r7, 31, 95, -3.25F, -1.9678F, -8.2149F, 8, 14, 8, 0.0F, false));

        this.shell_r8 = new ModelRenderer(this);
        this.shell_r8.setRotationPoint(-0.7947F, -4.4489F, 6.9524F);
        this.shell.addChild(shell_r8);
        this.setRotateAngle(shell_r8, 0.5672F, 0.0F, 0.0F);
        this.shell_r8.cubeList.add(new ModelBox(shell_r8, 49, 70, -4.25F, -10.427F, -6.6562F, 10, 13, 11, 0.0F, false));

        this.shell_r9 = new ModelRenderer(this);
        this.shell_r9.setRotationPoint(-0.7947F, -8.4489F, -2.0476F);
        this.shell.addChild(shell_r9);
        this.setRotateAngle(shell_r9, -0.0436F, 0.0F, 0.0F);
        this.shell_r9.cubeList.add(new ModelBox(shell_r9, 80, 83, -3.75F, -7.2178F, -5.4649F, 9, 11, 12, 0.0F, false));

        this.shell_r10 = new ModelRenderer(this);
        this.shell_r10.setRotationPoint(3.4553F, 10.5511F, 8.9524F);
        this.shell.addChild(shell_r10);
        this.setRotateAngle(shell_r10, 0.0436F, 0.0F, 0.0F);
        this.shell_r10.cubeList.add(new ModelBox(shell_r10, 0, 70, -9.5F, -15.75F, -8.25F, 12, 9, 12, 0.0F, false));

        this.shell_r11 = new ModelRenderer(this);
        this.shell_r11.setRotationPoint(3.4553F, 10.5511F, 8.9524F);
        this.shell.addChild(shell_r11);
        this.setRotateAngle(shell_r11, 0.1745F, 0.0F, 0.0F);
        this.shell_r11.cubeList.add(new ModelBox(shell_r11, 81, 107, 1.0F, -10.25F, -0.95F, 2, 8, 6, 0.0F, false));
        this.shell_r11.cubeList.add(new ModelBox(shell_r11, 64, 101, -10.0F, -10.25F, -0.95F, 2, 8, 6, 0.0F, false));
        this.shell_r11.cubeList.add(new ModelBox(shell_r11, 104, 18, -8.0F, -10.25F, 3.05F, 9, 10, 2, 0.0F, false));

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
