package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonOsteolepis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Osteolepis;
    private final ModelRenderer Cephalon;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Jaw;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Body1;
    private final ModelRenderer PectoralL;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Body3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer VentralL;
    private final ModelRenderer Body4;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer Bady5;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;

    public ModelSkeletonOsteolepis() {
        this.textureWidth = 128;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -9.0F, -2.0F, -22.0F, 21, 2, 42, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 6, -9.0F, -3.0F, 13.0F, 16, 1, 4, 0.004F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 65, 45, -9.0F, -3.0F, 17.0F, 18, 1, 3, 0.004F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 45, -9.0F, -3.0F, -15.0F, 18, 1, 28, 0.004F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 11, 12, -9.0F, -3.0F, -18.2F, 3, 1, 4, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(9.0F, 0.0F, -15.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2007F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -16.0F, -3.0F, 0.0F, 16, 1, 4, -0.003F, false));

        this.Osteolepis = new ModelRenderer(this);
        this.Osteolepis.setRotationPoint(0.0F, -3.2F, -7.0F);
        this.fossil.addChild(Osteolepis);
        this.setRotateAngle(Osteolepis, -0.1309F, 0.0F, -1.5708F);


        this.Cephalon = new ModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, -0.7F, -3.3F);
        this.Osteolepis.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 28, 35, 0.1F, -1.3F, -4.6F, 0, 1, 5, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.4F, -3.5F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1833F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.3F, -0.5578F, -0.5516F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.2F, 0.0F, -0.7F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.192F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 23, 0.2F, -0.9F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.2F, -0.3F, -4.7F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 32, 0.0F, -1.0F, 0.0F, 0, 2, 5, 0.0F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.2F, 1.0F, 0.2F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0087F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 22, 33, -0.1F, 0.0F, -4.9F, 0, 1, 5, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.1F, 1.7F, 0.0F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1222F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 32, -0.1F, -1.1F, -4.9F, 0, 1, 5, 0.0F, false));

        this.Body1 = new ModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -0.8F, -3.3F);
        this.Osteolepis.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 45, 0.3F, -1.2F, 0.0F, 0, 4, 3, 0.0F, false));

        this.PectoralL = new ModelRenderer(this);
        this.PectoralL.setRotationPoint(0.4F, 1.9F, 0.5F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, -1.5708F, -1.0472F, 1.5708F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 0, 6, -0.1938F, -0.5167F, -0.0875F, 1, 1, 0, 0.0F, false));
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 11, 18, -0.0938F, -1.3167F, 0.0125F, 4, 2, 0, 0.0F, false));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.55F, 3.05F);
        this.Body1.addChild(Body2);
        this.setRotateAngle(Body2, 0.0436F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 21, 12, 0.2F, -1.75F, -0.45F, 0, 4, 6, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.75F, 3.25F);
        this.Body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.48F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 12, 0.1F, -3.4F, -1.0F, 0, 4, 3, 0.0F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -0.25F, 5.25F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, 0.0873F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.1F, 4.0F);
        this.Body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.48F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 26, 0.2F, -2.9F, -0.7F, 0, 3, 3, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.2F, 0.0F);
        this.Body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 17, 0.1F, -1.8F, 0.0F, 0, 2, 6, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 23, 0.3F, -1.5F, 0.0F, 0, 3, 6, 0.0F, false));

        this.VentralL = new ModelRenderer(this);
        this.VentralL.setRotationPoint(0.2F, 1.5F, 3.6F);
        this.Body3.addChild(VentralL);
        this.setRotateAngle(VentralL, -1.1177F, 0.0F, 0.0F);
        this.VentralL.cubeList.add(new ModelBox(VentralL, 16, 45, 0.0F, -1.1F, 0.0F, 0, 2, 3, 0.0F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.0436F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.Body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5236F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 45, 0.0F, -0.8F, -0.4F, 0, 4, 2, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.Body4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 45, 0.2F, -1.1F, -0.2F, 0, 1, 4, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.2F, 0.0F);
        this.Body4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0175F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 12, 0.4F, -0.0002F, -0.2209F, 0, 2, 4, 0.0F, false));

        this.Bady5 = new ModelRenderer(this);
        this.Bady5.setRotationPoint(0.0F, -0.8F, 3.6F);
        this.Body4.addChild(Bady5);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.7F, -0.5F);
        this.Bady5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2269F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 12, 0.1F, -2.0F, 0.0F, 0, 9, 10, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -0.3F, 0.2F);
        this.Bady5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2443F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 27, -0.2F, -0.1277F, -0.468F, 0, 1, 6, 0.0F, false));

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
