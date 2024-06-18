package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonIchthyosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Ophthalmosaurus;
    private final ModelRenderer Body1;
    private final ModelRenderer cube_r4;
    private final ModelRenderer ForelimbL;
    private final ModelRenderer ForelimbL2;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Body3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Body4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer HindlimbL;
    private final ModelRenderer HindlimbL2;
    private final ModelRenderer Body5;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Body6;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Body7;
    private final ModelRenderer cube_r12;
    private final ModelRenderer Body8;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer Head;
    private final ModelRenderer eye;
    private final ModelRenderer Jaw;

    public ModelSkeletonIchthyosaurusFrame() {
        this.textureWidth = 85;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 5, 1, -0.5F, -12.7F, -10.2F, 1, 5, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.6F, -8.3F, 10.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 67, -1.2F, -3.5F, -0.5F, 1, 7, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -6.5F, 1.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 60, 64, 1.1F, -4.5F, -11.5F, 1, 9, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.6F, -8.3F, 10.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2618F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -2.7F, -0.5F, 1, 4, 1, -0.21F, false));

        this.Ophthalmosaurus = new ModelRenderer(this);
        this.Ophthalmosaurus.setRotationPoint(0.0F, 0.0F, -22.75F);
        this.fossil.addChild(Ophthalmosaurus);


        this.Body1 = new ModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -11.9183F, 9.1578F);
        this.Ophthalmosaurus.addChild(Body1);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.4817F, 1.7672F);
        this.Body1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 48, -0.5F, 0.3F, -3.3F, 1, 1, 5, -0.2F, false));

        this.ForelimbL = new ModelRenderer(this);
        this.ForelimbL.setRotationPoint(4.2F, 3.4183F, 4.0422F);
        this.Body1.addChild(ForelimbL);
        this.setRotateAngle(ForelimbL, 0.1641F, -0.0805F, -0.0568F);


        this.ForelimbL2 = new ModelRenderer(this);
        this.ForelimbL2.setRotationPoint(-4.2F, 3.4183F, 4.0422F);
        this.Body1.addChild(ForelimbL2);
        this.setRotateAngle(ForelimbL2, 0.4166F, 0.2554F, -0.1642F);


        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.026F, 3.1368F);
        this.Body1.addChild(Body2);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -1.1557F, 2.7054F);
        this.Body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 1, -1.5F, 0.8247F, -0.2074F, 1, 1, 7, -0.2F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -0.3557F, -0.1946F);
        this.Body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2443F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 67, 49, -1.5F, 0.75F, 0.0F, 1, 1, 3, -0.2F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -0.6931F, 9.6655F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, 0.0F, 0.0873F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -0.5626F, -0.0601F);
        this.Body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.192F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 20, -1.5F, 0.8F, -0.25F, 1, 1, 9, -0.2F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 1.4387F, 7.7183F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.0F, 0.1745F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 1.3988F, 3.7216F);
        this.Body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 6, -1.5F, -0.2354F, -0.1556F, 1, 1, 4, -0.2F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, -0.4012F, -0.0784F);
        this.Body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2094F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 56, 32, -1.5F, 0.7352F, 0.4356F, 1, 1, 4, -0.2F, false));

        this.HindlimbL = new ModelRenderer(this);
        this.HindlimbL.setRotationPoint(3.0F, 5.0988F, 3.5216F);
        this.Body4.addChild(HindlimbL);
        this.setRotateAngle(HindlimbL, 0.4974F, -0.3175F, -0.0903F);


        this.HindlimbL2 = new ModelRenderer(this);
        this.HindlimbL2.setRotationPoint(-3.0F, 5.0988F, 3.5216F);
        this.Body4.addChild(HindlimbL2);
        this.setRotateAngle(HindlimbL2, 0.4041F, 0.4322F, -0.1629F);


        this.Body5 = new ModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.8617F, 6.7871F);
        this.Body4.addChild(Body5);
        this.setRotateAngle(Body5, 0.0F, 0.1745F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -0.3629F, -0.0655F);
        this.Body5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0175F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 31, -1.5F, 0.85F, 0.4F, 1, 1, 7, -0.2F, false));

        this.Body6 = new ModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.1222F, 6.7884F);
        this.Body5.addChild(Body6);
        this.setRotateAngle(Body6, 0.0F, -0.2182F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 0.2149F, 0.1461F);
        this.Body6.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0175F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 57, 12, -1.5F, 0.25F, -0.1F, 1, 1, 4, -0.2F, false));

        this.Body7 = new ModelRenderer(this);
        this.Body7.setRotationPoint(0.0F, -0.0209F, 4.003F);
        this.Body6.addChild(Body7);
        this.setRotateAngle(Body7, 0.0F, -0.2182F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, -0.3642F, 0.0431F);
        this.Body7.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0262F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 38, -1.5F, 0.7838F, -0.4096F, 1, 1, 6, -0.2F, false));

        this.Body8 = new ModelRenderer(this);
        this.Body8.setRotationPoint(0.0F, 0.1165F, 6.0478F);
        this.Body7.addChild(Body8);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 5.6193F, 3.6953F);
        this.Body8.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6109F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 53, 56, -1.5F, -0.2367F, 0.0419F, 1, 1, 4, -0.2F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 1.9193F, 2.0953F);
        this.Body8.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.9076F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 44, 0, -1.5F, 0.6804F, -1.4574F, 1, 1, 6, -0.2F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, -0.2807F, -0.1047F);
        this.Body8.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6109F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 10, 73, -1.5F, 0.7261F, -0.2466F, 1, 1, 2, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0536F, -11.7409F, 8.7822F);
        this.Ophthalmosaurus.addChild(Head);
        this.setRotateAngle(Head, 0.0F, 0.0436F, 0.0F);


        this.eye = new ModelRenderer(this);
        this.eye.setRotationPoint(2.2214F, -0.1591F, -4.1822F);
        this.Head.addChild(eye);
        this.setRotateAngle(eye, 0.3054F, 0.0F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(-0.0536F, 1.3667F, 0.8161F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.1222F, 0.0F, 0.0F);

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
