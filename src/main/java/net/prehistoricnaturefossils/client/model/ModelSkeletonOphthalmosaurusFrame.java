package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonOphthalmosaurusFrame extends ModelBase {
    private final ModelRenderer Ophthalmosaurus;
    private final ModelRenderer Body1;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer ForelimbL;
    private final ModelRenderer ForelimbL2;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Body3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Body4;
    private final ModelRenderer HindlimbL;
    private final ModelRenderer HindlimbL2;
    private final ModelRenderer Body5;
    private final ModelRenderer Body6;
    private final ModelRenderer Body7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Body8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer Hyoid;
    private final ModelRenderer Hyoid2;

    public ModelSkeletonOphthalmosaurusFrame() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.Ophthalmosaurus = new ModelRenderer(this);
        this.Ophthalmosaurus.setRotationPoint(1.0F, 12.0F, -1.0F);
        this.setRotateAngle(Ophthalmosaurus, -0.1548F, -0.0491F, 0.4939F);


        this.Body1 = new ModelRenderer(this);
        this.Body1.setRotationPoint(-0.3924F, 1.2322F, -16.8948F);
        this.Ophthalmosaurus.addChild(Body1);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 59, -1.5F, 1.0F, -0.6F, 1, 1, 7, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.4F, 10.3F);
        this.Body1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0175F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 73, -1.5F, -0.4332F, -0.197F, 1, 1, 5, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 5.2584F, 4.4141F);
        this.Body1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2618F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 77, 18, 0.0F, -10.5F, 0.0F, 1, 21, 1, -0.2F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.5F, 1.3F);
        this.Body1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 77, 18, -1.5F, 3.1F, 1.0F, 1, 6, 1, -0.2F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.2F, 5.0F);
        this.Body1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 73, 14, -1.5F, 1.7F, 0.3F, 1, 1, 5, -0.2F, false));

        this.ForelimbL = new ModelRenderer(this);
        this.ForelimbL.setRotationPoint(9.0F, 4.4F, 5.1F);
        this.Body1.addChild(ForelimbL);
        this.setRotateAngle(ForelimbL, 0.4641F, 0.3189F, -0.0259F);


        this.ForelimbL2 = new ModelRenderer(this);
        this.ForelimbL2.setRotationPoint(-11.0F, 4.4F, 5.1F);
        this.Body1.addChild(ForelimbL2);
        this.setRotateAngle(ForelimbL2, 0.3512F, -0.441F, 0.3278F);


        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -4.0F, 14.9F);
        this.Body1.addChild(Body2);
        this.setRotateAngle(Body2, 0.0F, 0.2618F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -0.3F);
        this.Body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 18, -1.5F, 1.05F, 0.0F, 1, 1, 13, -0.2F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 2.0F, 12.0F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, 0.0F, 0.2618F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.3F);
        this.Body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 55, -1.5F, 1.25F, -0.8F, 1, 1, 8, -0.2F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 1.3F, 6.6F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, -0.1372F, 0.3027F, -0.0411F);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 47, -1.5F, 0.8526F, -0.0392F, 1, 1, 9, -0.2F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 8, 55, -5.2F, 2.1026F, 4.1608F, 9, 1, 1, -0.2F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 8, 55, -1.6F, 1.5026F, 4.1608F, 1, 1, 1, -0.2F, false));

        this.HindlimbL = new ModelRenderer(this);
        this.HindlimbL.setRotationPoint(4.0F, 2.9026F, 5.9608F);
        this.Body4.addChild(HindlimbL);
        this.setRotateAngle(HindlimbL, 0.5601F, -0.2276F, 0.2018F);


        this.HindlimbL2 = new ModelRenderer(this);
        this.HindlimbL2.setRotationPoint(-6.0F, 2.9026F, 5.9608F);
        this.Body4.addChild(HindlimbL2);
        this.setRotateAngle(HindlimbL2, 0.5601F, 0.2276F, -0.2018F);


        this.Body5 = new ModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.1026F, 8.5608F);
        this.Body4.addChild(Body5);
        this.setRotateAngle(Body5, 0.0903F, 0.2608F, 0.0233F);
        this.Body5.cubeList.add(new ModelBox(Body5, 53, 52, -1.5F, 0.9015F, -0.9651F, 1, 1, 8, -0.2F, false));

        this.Body6 = new ModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.1015F, 6.5349F);
        this.Body5.addChild(Body6);
        this.setRotateAngle(Body6, 0.0F, -0.2618F, 0.0F);
        this.Body6.cubeList.add(new ModelBox(Body6, 15, 52, -1.5F, 0.8F, 0.0F, 1, 1, 8, -0.2F, false));

        this.Body7 = new ModelRenderer(this);
        this.Body7.setRotationPoint(0.0F, 0.0F, 7.7F);
        this.Body6.addChild(Body7);
        this.setRotateAngle(Body7, 0.0F, -0.3927F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 1.7052F, 0.356F);
        this.Body7.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2532F, 0.0343F, -0.0064F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 1, 70, -0.4166F, -0.8098F, -0.3325F, 1, 1, 5, -0.2F, false));

        this.Body8 = new ModelRenderer(this);
        this.Body8.setRotationPoint(0.0F, 1.3F, 5.4F);
        this.Body7.addChild(Body8);
        this.setRotateAngle(Body8, 0.0F, -0.3054F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 7.3F, 5.9F);
        this.Body8.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.637F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 42, -1.5F, -0.0001F, -0.7541F, 1, 1, 10, -0.2F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.6F, 0.2F);
        this.Body8.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.8203F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 9, -1.5F, 0.4F, -0.3F, 1, 1, 9, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.3924F, 1.2322F, -16.8948F);
        this.Ophthalmosaurus.addChild(Head);
        this.setRotateAngle(Head, -0.2643F, -0.5944F, 0.1504F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.5236F, 0.0F, 0.0F);


        this.Hyoid = new ModelRenderer(this);
        this.Hyoid.setRotationPoint(1.0F, 3.0F, 1.0F);
        this.Jaw.addChild(Hyoid);
        this.setRotateAngle(Hyoid, 0.0F, 0.1745F, 0.0F);


        this.Hyoid2 = new ModelRenderer(this);
        this.Hyoid2.setRotationPoint(-3.0F, 3.0F, 1.0F);
        this.Jaw.addChild(Hyoid2);
        this.setRotateAngle(Hyoid2, 0.0F, -0.1745F, 0.0F);

    }

    public void renderAll(float f) {
        this.Ophthalmosaurus.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
