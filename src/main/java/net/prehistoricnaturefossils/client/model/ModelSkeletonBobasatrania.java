package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBobasatrania extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Bobasatrania;
    private final ModelRenderer Cephalon;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer jaw;
    private final ModelRenderer Body1;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer PectoralL;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer Body3;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer Body4;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer Body5;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;

    public ModelSkeletonBobasatrania() {
        this.textureWidth = 192;
        this.textureHeight = 192;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(15.3889F, -0.4F, -8.7441F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0524F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 90, -10.933F, -0.5F, -0.9828F, 11, 1, 30, -0.01F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-6.4395F, -0.4F, 9.3544F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.3927F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 4, 43, -17.2F, -0.5F, -26.0F, 30, 1, 42, 0.01F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-7.3853F, -0.4F, 21.0297F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.4538F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 3, -17.4F, -0.5F, -12.5F, 38, 1, 34, -0.015F, false));

        this.Bobasatrania = new ModelRenderer(this);
        this.Bobasatrania.setRotationPoint(-6.0F, -1.0F, 2.0F);
        this.fossil.addChild(Bobasatrania);
        this.setRotateAngle(Bobasatrania, -0.1309F, 0.0F, -1.5708F);


        this.Cephalon = new ModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.0F, -3.8F);
        this.Bobasatrania.addChild(Cephalon);
        this.setRotateAngle(Cephalon, -0.2618F, 0.0F, 0.0F);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 87, -0.05F, -3.0F, -4.0F, 0, 8, 4, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 93, 87, -0.05F, -2.0F, -6.0F, 0, 5, 2, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 7, 0, -0.02F, -0.5F, -5.6F, 0, 1, 1, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 26, 0, -0.05F, -1.0F, -7.0F, 0, 4, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 5.2F, -4.6F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2094F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 39, -0.07F, -1.3F, 0.2F, 0, 1, 4, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 4.0F, -5.0F);
        this.Cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 0, -0.08F, -1.3F, -2.3F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 0, -0.07F, -1.3F, -1.3F, 0, 1, 3, 0.01F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.Cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.0647F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 22, -0.04F, -7.0F, 0.0F, 0, 8, 3, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Cephalon.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 78, 87, -0.03F, -2.0F, 3.2F, 0, 5, 2, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 4.6F, -3.6F);
        this.Cephalon.addChild(jaw);
        this.setRotateAngle(jaw, 0.2356F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 5, 10, -0.08F, -0.4521F, -2.1821F, 0, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 10, 10, -0.08F, -0.4521F, -3.1821F, 0, 1, 1, 0.0F, false));

        this.Body1 = new ModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 1.0F, -3.3F);
        this.Bobasatrania.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 39, -0.07F, -5.0F, 0.0F, 0, 9, 6, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Body1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2443F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 23, 29, -0.085F, 0.4F, 1.7F, 0, 1, 6, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 39, -0.075F, -2.2F, -0.1F, 0, 3, 7, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.Body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4538F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 87, -0.085F, -2.0F, 0.7F, 0, 1, 6, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 0, -0.08F, -1.5F, -0.3F, 0, 5, 7, 0.0F, false));

        this.PectoralL = new ModelRenderer(this);
        this.PectoralL.setRotationPoint(-0.01F, 2.0F, 1.0F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.6109F, 0.0F, 0.0F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 0, 39, 0.0F, -1.0F, 0.0F, 0, 7, 17, 0.0F, false));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 5.6F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 35, 53, -0.04F, -7.0F, 0.0F, 0, 12, 5, 0.01F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -10.3F, 1.4F);
        this.Body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.9599F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 64, -0.085F, -0.0685F, -0.1884F, 0, 5, 12, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 83, 87, -0.04F, -0.0685F, -2.1884F, 0, 5, 2, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -9.0F, -0.6F);
        this.Body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4538F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 10, -0.088F, -0.7F, 0.093F, 0, 1, 2, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 88, 87, -0.05F, -0.272F, 0.093F, 0, 5, 2, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 6.7F, 1.5F);
        this.Body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4974F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 64, -0.085F, -0.0054F, -0.0304F, 0, 13, 4, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 6.7F, 1.5F);
        this.Body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3665F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 71, -0.072F, -3.1054F, -0.0304F, 0, 3, 4, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 4.0F, -6.0F);
        this.Body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2443F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 39, -0.08F, -2.3F, 6.9F, 0, 3, 1, 0.0F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 4.8F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 29, 10, -0.035F, -5.0F, -0.2F, 0, 8, 3, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -7.3F, 0.4F);
        this.Body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.9338F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 39, -0.087F, -0.0658F, -0.0253F, 0, 4, 4, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -7.3F, 0.4F);
        this.Body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.9512F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 66, 87, -0.045F, -0.1658F, -3.0253F, 0, 4, 3, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 5.2F, 0.2F);
        this.Body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6196F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 64, -0.087F, -0.331F, -0.1222F, 0, 4, 4, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 5.2F, 0.2F);
        this.Body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.5847F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 13, 64, -0.038F, -2.931F, -0.0222F, 0, 3, 4, 0.0F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -1.0F, 2.7F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.0436F, 0.0F, 0.0F);
        this.Body4.cubeList.add(new ModelBox(Body4, 73, 87, -0.02F, -3.0F, -0.1F, 0, 6, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 23, 0, -0.025F, -2.0F, 1.9F, 0, 4, 1, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 15, 0, -0.017F, -1.1F, 2.9F, 0, 2, 2, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 4.2F, 0.6F);
        this.Body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.6021F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -0.085F, -0.6311F, -0.0382F, 0, 3, 6, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 76, -0.05F, -1.9311F, -0.0382F, 0, 2, 6, -0.01F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -4.3F, 0.4F);
        this.Body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.0036F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 87, -0.088F, 0.3268F, -0.1517F, 0, 5, 3, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -4.3F, 0.4F);
        this.Body4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 1.0734F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 30, 0, -0.041F, 0.1268F, -3.1517F, 0, 6, 3, 0.0F, false));

        this.Body5 = new ModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -0.1F, 5.0F);
        this.Body4.addChild(Body5);
        this.setRotateAngle(Body5, 0.1309F, 0.0F, 0.0F);
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 0, -0.02F, -1.0F, -0.1F, 0, 2, 2, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.1F, 0.3F);
        this.Body5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0524F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, -0.025F, -10.0F, 0.0F, 0, 20, 14, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.1F, 0.3F);
        this.Body5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.6109F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 39, -0.024F, -0.7F, 0.8F, 0, 1, 12, 0.0F, false));

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
