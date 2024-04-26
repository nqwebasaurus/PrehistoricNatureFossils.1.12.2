package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTitanites extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer shell;
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
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;

    public ModelSkeletonTitanites() {
        this.textureWidth = 144;
        this.textureHeight = 144;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(3.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 109, 16, 6.0F, -2.0F, -4.0F, 2, 2, 8, -0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 97, -2.0F, -4.0F, -6.0F, 2, 4, 12, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 33, 9, -12.6F, -2.0F, -10.0F, 2, 2, 20, -0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(7.0F, -2.0F, 3.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 106, -1.0F, -31.0F, -1.0F, 2, 31, 2, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(7.0F, -2.0F, -3.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 106, -1.0F, -31.0F, -1.0F, 2, 31, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-13.75F, -1.75F, 11.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.3491F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 58, 22, -0.25F, -0.25F, -1.0F, 23, 2, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 7, 6, -0.25F, -5.25F, -1.0F, 2, 5, 2, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-13.75F, -1.75F, -11.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.3491F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.25F, -5.25F, -1.0F, 2, 5, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 78, 27, -0.25F, -0.25F, -1.0F, 23, 2, 2, 0.0F, false));

        this.shell = new ModelRenderer(this);
        this.shell.setRotationPoint(-0.9F, -21.6609F, -0.4815F);
        this.fossil.addChild(shell);
        this.setRotateAngle(shell, 0.0F, 0.0F, 0.3491F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -5.0F, 7.4609F, -8.5185F, 10, 12, 16, 0.004F, false));
        this.shell.cubeList.add(new ModelBox(shell, 93, 86, -4.5F, -16.8391F, -3.5185F, 9, 8, 8, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0F, 8.1609F, -17.0185F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.829F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 29, -3.0F, -0.2F, -2.4F, 10, 14, 11, 0.01F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, 9.6609F, -18.7185F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 62, 32, -3.0F, -7.96F, -0.1456F, 10, 8, 11, 0.02F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, -11.5391F, 14.3815F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 2.6442F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 66, -3.0F, -8.1088F, 0.1705F, 9, 8, 11, 0.004F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -0.0391F, 18.4815F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.946F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 55, -3.0F, -8.7088F, 0.173F, 9, 9, 12, 0.01F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, 10.9609F, 14.4815F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.2043F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 43, -3.0F, -9.9165F, -0.1241F, 9, 10, 12, 0.02F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.0F, 11.0609F, 14.4815F);
        this.shell.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.8727F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 58, 0, -3.0F, -9.9931F, -11.0599F, 10, 10, 11, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5F, 4.6609F, 2.1815F);
        this.shell.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -2.1293F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 97, 44, -2.0F, -6.9078F, -4.9208F, 7, 7, 8, 0.03F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -3.2391F, 0.0815F);
        this.shell.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.6109F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 64, 111, -1.0F, -0.0614F, -4.4338F, 4, 5, 6, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 47, 106, -1.5F, -3.9614F, -4.4338F, 5, 4, 6, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 0.1609F, 2.0815F);
        this.shell.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.0908F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 43, 32, -2.0F, -3.7573F, -5.9732F, 6, 4, 6, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 2.4609F, -0.9185F);
        this.shell.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -2.3998F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 105, 32, -2.0F, -4.0883F, -6.7388F, 6, 4, 7, 0.004F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, -1.5391F, -3.9185F);
        this.shell.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 2.2253F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 101, 0, -2.0F, -7.1433F, -7.7385F, 6, 7, 8, 0.01F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -1.2391F, -4.7185F);
        this.shell.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.1956F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 77, -2.0F, -5.7562F, -1.9769F, 6, 7, 12, 0.02F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, -5.7391F, -0.3185F);
        this.shell.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.288F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 95, 67, -2.0F, -6.798F, -5.1603F, 7, 7, 8, -0.007F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, -3.7391F, 4.1815F);
        this.shell.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.4276F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 95, 67, -2.0F, -6.7518F, -4.9845F, 7, 7, 8, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, 1.2609F, 4.1815F);
        this.shell.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -1.5184F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 97, 103, -2.0F, -7.0134F, -5.9776F, 7, 7, 7, 0.01F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.0F, 5.4609F, -2.8185F);
        this.shell.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -3.1329F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 64, 95, -2.0F, -6.1515F, -4.9276F, 8, 7, 8, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.0F, 0.4609F, -14.5185F);
        this.shell.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 2.1904F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 62, 75, -2.0F, -0.2298F, -10.7924F, 8, 7, 11, 0.004F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-2.0F, -11.5391F, -11.9185F);
        this.shell.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 1.3352F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 62, 54, -2.0F, 0.0433F, -12.0678F, 8, 8, 12, 0.01F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.0F, -16.8391F, -3.5185F);
        this.shell.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.5672F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 27, 87, -2.0F, 0.0F, -10.0F, 8, 8, 10, 0.02F, false));

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
