package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSanctacaris extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer Body2;
    private final ModelRenderer tail;
    private final ModelRenderer jawL5;
    private final ModelRenderer legL5;
    private final ModelRenderer cube_r1;
    private final ModelRenderer jawL6;
    private final ModelRenderer legL6;
    private final ModelRenderer cube_r2;
    private final ModelRenderer jawL4;
    private final ModelRenderer legL4;
    private final ModelRenderer cube_r3;
    private final ModelRenderer jawL7;
    private final ModelRenderer legL7;
    private final ModelRenderer cube_r4;
    private final ModelRenderer jawL3;
    private final ModelRenderer legL3;
    private final ModelRenderer cube_r5;
    private final ModelRenderer jawL8;
    private final ModelRenderer legL8;
    private final ModelRenderer cube_r6;
    private final ModelRenderer jawL9;
    private final ModelRenderer legL9;
    private final ModelRenderer cube_r7;
    private final ModelRenderer jawL2;
    private final ModelRenderer legL2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer jawL10;
    private final ModelRenderer legL10;
    private final ModelRenderer cube_r9;
    private final ModelRenderer jawL;
    private final ModelRenderer legL;
    private final ModelRenderer cube_r10;
    private final ModelRenderer jawL11;
    private final ModelRenderer legL11;
    private final ModelRenderer cube_r11;

    public ModelSkeletonSanctacaris() {
        this.textureWidth = 112;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -10.0F, -1.0F, -13.0F, 20, 1, 30, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.4F, 0.0F);
        this.fossil.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 12, 32, 2.0F, -0.08F, -7.0F, 4, 0, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 16, -2.0F, -0.1F, -8.0F, 4, 0, 6, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 12, 2.0F, 0.0F, -8.025F, 1, 0, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 12, -3.0F, 0.0F, -8.025F, 1, 0, 1, 0.0F, true));
        this.Head.cubeList.add(new ModelBox(Head, 12, 32, -6.0F, -0.08F, -7.0F, 4, 0, 5, 0.0F, true));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.5F, -2.5F);
        this.Head.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -3.5F, 1.47F, 0.0F, 7, 0, 7, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 32, 3.5F, 1.5F, 0.0F, 2, 0, 7, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 32, -5.5F, 1.5F, 0.0F, 2, 0, 7, 0.0F, true));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.75F, 7.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 8, -2.5F, 0.75F, -1.0F, 5, 0, 7, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 25, 32, 2.5F, 0.75F, 0.0F, 2, 0, 6, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 25, 32, -4.5F, 0.75F, 0.0F, 2, 0, 6, 0.0F, true));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.Body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 23, -3.0F, 0.4F, 0.0F, 6, 0, 4, 0.0F, false));

        this.jawL5 = new ModelRenderer(this);
        this.jawL5.setRotationPoint(0.5F, 0.25F, -5.25F);
        this.Head.addChild(jawL5);
        this.setRotateAngle(jawL5, 0.0F, 0.1745F, 0.0F);
        this.jawL5.cubeList.add(new ModelBox(jawL5, 0, 0, 0.0F, -0.43F, -0.475F, 1, 0, 2, 0.0F, false));

        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(0.75F, 0.0F, -0.25F);
        this.jawL5.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, -1.2654F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 15, 16, -1.5F, 0.02F, -5.25F, 2, 0, 5, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL5.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 23, -0.5F, -0.225F, -4.75F, 1, 0, 5, 0.0F, false));

        this.jawL6 = new ModelRenderer(this);
        this.jawL6.setRotationPoint(-0.5F, 0.25F, -5.25F);
        this.Head.addChild(jawL6);
        this.setRotateAngle(jawL6, 0.0F, -0.1745F, 0.0F);
        this.jawL6.cubeList.add(new ModelBox(jawL6, 0, 0, -1.0F, -0.43F, -0.475F, 1, 0, 2, 0.0F, true));

        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(-0.75F, 0.0F, -0.25F);
        this.jawL6.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 1.2217F, 0.0F);
        this.legL6.cubeList.add(new ModelBox(legL6, 15, 16, -0.5F, 0.02F, -5.25F, 2, 0, 5, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL6.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 23, -0.5F, -0.225F, -4.75F, 1, 0, 5, 0.0F, true));

        this.jawL4 = new ModelRenderer(this);
        this.jawL4.setRotationPoint(0.4F, 0.25F, -5.75F);
        this.Head.addChild(jawL4);
        this.setRotateAngle(jawL4, 0.0F, 0.2182F, 0.0F);
        this.jawL4.cubeList.add(new ModelBox(jawL4, 0, 3, 0.0F, -0.45F, -0.475F, 1, 0, 1, 0.0F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(0.75F, 0.0F, -0.25F);
        this.jawL4.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -0.9163F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 36, 32, -1.5F, 0.025F, -5.25F, 2, 0, 5, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 38, -0.5F, -0.225F, -4.25F, 1, 0, 5, 0.0F, false));

        this.jawL7 = new ModelRenderer(this);
        this.jawL7.setRotationPoint(-0.4F, 0.25F, -5.75F);
        this.Head.addChild(jawL7);
        this.setRotateAngle(jawL7, 0.0F, -0.2182F, 0.0F);
        this.jawL7.cubeList.add(new ModelBox(jawL7, 0, 3, -1.0F, -0.45F, -0.475F, 1, 0, 1, 0.0F, true));

        this.legL7 = new ModelRenderer(this);
        this.legL7.setRotationPoint(-0.75F, 0.0F, -0.25F);
        this.jawL7.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 1.0472F, 0.0F);
        this.legL7.cubeList.add(new ModelBox(legL7, 36, 32, -0.5F, 0.025F, -5.25F, 2, 0, 5, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL7.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 38, -0.5F, -0.225F, -4.25F, 1, 0, 5, 0.0F, true));

        this.jawL3 = new ModelRenderer(this);
        this.jawL3.setRotationPoint(0.3F, 0.25F, -6.25F);
        this.Head.addChild(jawL3);
        this.setRotateAngle(jawL3, 0.0F, 0.0873F, 0.0F);
        this.jawL3.cubeList.add(new ModelBox(jawL3, 0, 5, 0.0F, -0.46F, -0.475F, 1, 0, 1, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(0.75F, 0.0F, -0.25F);
        this.jawL3.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -1.0472F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 38, 38, -1.5F, 0.04F, -4.25F, 2, 0, 4, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 8, -0.5F, -0.23F, -3.75F, 1, 0, 4, 0.0F, false));

        this.jawL8 = new ModelRenderer(this);
        this.jawL8.setRotationPoint(0.3F, 0.25F, -6.25F);
        this.Head.addChild(jawL8);
        this.setRotateAngle(jawL8, 0.0F, 0.0873F, 0.0F);
        this.jawL8.cubeList.add(new ModelBox(jawL8, 0, 5, 0.0F, -0.46F, -0.475F, 1, 0, 1, 0.0F, false));

        this.legL8 = new ModelRenderer(this);
        this.legL8.setRotationPoint(0.75F, 0.0F, -0.25F);
        this.jawL8.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, -1.0472F, 0.0F);
        this.legL8.cubeList.add(new ModelBox(legL8, 38, 38, -1.5F, 0.04F, -4.25F, 2, 0, 4, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL8.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 8, -0.5F, -0.23F, -3.75F, 1, 0, 4, 0.0F, false));

        this.jawL9 = new ModelRenderer(this);
        this.jawL9.setRotationPoint(-0.3F, 0.25F, -6.25F);
        this.Head.addChild(jawL9);
        this.setRotateAngle(jawL9, 0.0F, -0.0873F, 0.0F);
        this.jawL9.cubeList.add(new ModelBox(jawL9, 0, 5, -1.0F, -0.46F, -0.475F, 1, 0, 1, 0.0F, true));

        this.legL9 = new ModelRenderer(this);
        this.legL9.setRotationPoint(-0.75F, 0.0F, -0.25F);
        this.jawL9.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, 1.0472F, 0.0F);
        this.legL9.cubeList.add(new ModelBox(legL9, 38, 38, -0.5F, 0.04F, -4.25F, 2, 0, 4, 0.0F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL9.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 8, -0.5F, -0.23F, -3.75F, 1, 0, 4, 0.0F, true));

        this.jawL2 = new ModelRenderer(this);
        this.jawL2.setRotationPoint(0.2F, 0.25F, -6.75F);
        this.Head.addChild(jawL2);
        this.setRotateAngle(jawL2, 0.0F, 0.0436F, 0.0F);
        this.jawL2.cubeList.add(new ModelBox(jawL2, 0, 8, 0.0F, -0.45F, -0.475F, 1, 0, 1, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(0.75F, 0.0F, -0.25F);
        this.jawL2.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, -0.48F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 27, 39, -1.5F, 0.05F, -3.75F, 2, 0, 4, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.1745F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 40, -0.5F, -0.225F, -3.5F, 1, 0, 4, 0.0F, false));

        this.jawL10 = new ModelRenderer(this);
        this.jawL10.setRotationPoint(-0.2F, 0.25F, -6.75F);
        this.Head.addChild(jawL10);
        this.setRotateAngle(jawL10, 0.0F, -0.0436F, 0.0F);
        this.jawL10.cubeList.add(new ModelBox(jawL10, 0, 8, -1.0F, -0.45F, -0.475F, 1, 0, 1, 0.0F, true));

        this.legL10 = new ModelRenderer(this);
        this.legL10.setRotationPoint(-0.75F, 0.0F, -0.25F);
        this.jawL10.addChild(legL10);
        this.setRotateAngle(legL10, 0.0F, 0.3927F, 0.0F);
        this.legL10.cubeList.add(new ModelBox(legL10, 27, 39, -0.5F, 0.05F, -3.75F, 2, 0, 4, 0.0F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL10.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.1745F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 40, -0.5F, -0.225F, -3.5F, 1, 0, 4, 0.0F, true));

        this.jawL = new ModelRenderer(this);
        this.jawL.setRotationPoint(0.1F, 0.25F, -7.25F);
        this.Head.addChild(jawL);
        this.setRotateAngle(jawL, 0.0F, 0.1309F, 0.0F);
        this.jawL.cubeList.add(new ModelBox(jawL, 0, 10, 0.0F, -0.47F, -0.475F, 1, 0, 1, 0.0F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(0.5F, 0.0F, -0.5F);
        this.jawL.addChild(legL);
        this.setRotateAngle(legL, 0.0F, -0.1745F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 8, 42, -0.5F, -0.075F, -2.5F, 1, 0, 3, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.1745F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 39, -0.5F, -0.225F, -2.75F, 1, 0, 3, 0.0F, false));

        this.jawL11 = new ModelRenderer(this);
        this.jawL11.setRotationPoint(-0.1F, 0.25F, -7.25F);
        this.Head.addChild(jawL11);
        this.setRotateAngle(jawL11, 0.0F, -0.1309F, 0.0F);
        this.jawL11.cubeList.add(new ModelBox(jawL11, 0, 10, -1.0F, -0.47F, -0.475F, 1, 0, 1, 0.0F, true));

        this.legL11 = new ModelRenderer(this);
        this.legL11.setRotationPoint(-0.5F, 0.0F, -0.5F);
        this.jawL11.addChild(legL11);
        this.setRotateAngle(legL11, 0.0F, 0.1745F, 0.0F);
        this.legL11.cubeList.add(new ModelBox(legL11, 8, 42, -0.5F, -0.075F, -2.5F, 1, 0, 3, 0.0F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL11.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.1745F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 39, -0.5F, -0.225F, -2.75F, 1, 0, 3, 0.0F, true));

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
