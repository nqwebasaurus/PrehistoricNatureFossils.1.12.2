package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonXenacanthus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer base;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer pectoralfinright;
    private final ModelRenderer cube_r11;
    private final ModelRenderer pectoralfinleft;
    private final ModelRenderer spine;
    private final ModelRenderer body;
    private final ModelRenderer cube_r12;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer pelvicfinright;
    private final ModelRenderer pelvicfinleft;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer body4;
    private final ModelRenderer body5;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r17;

    public ModelSkeletonXenacanthus() {
        this.textureWidth = 176;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-10.3F, 26.25F, 7.5F);
        this.setRotateAngle(fossil, 0.0F, 1.309F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(7.5F, 0.0F, 37.45F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.8901F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 12, -11.6707F, -3.7F, -3.6016F, 12, 1, 4, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(8.1F, 0.0F, 37.25F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3491F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.303F, -3.65F, -10.0689F, 16, 1, 10, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(22.9F, 0.0F, 13.35F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.0436F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 79, 58, -22.3747F, -3.825F, 0.2556F, 22, 1, 16, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(6.1463F, -3.0F, -12.9546F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.6109F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 79, 76, -11.25F, -0.4F, -2.0F, 22, 1, 8, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.3F, 0.0F, 0.0F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2618F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 58, -4.0F, -3.5F, -9.0F, 25, 1, 28, 0.0F, false));

        this.base = new ModelRenderer(this);
        this.base.setRotationPoint(0.0F, 3.25F, 0.0F);
        this.fossil.addChild(base);
        this.setRotateAngle(base, 0.0F, 0.0F, 1.5708F);
        this.base.cubeList.add(new ModelBox(base, 0, 72, -7.125F, -8.25F, -7.5F, 1, 5, 6, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 0, -7.0F, -6.5F, -9.75F, 1, 2, 3, 0.005F, false));
        this.base.cubeList.add(new ModelBox(base, 6, 12, -7.0F, -7.45F, -11.25F, 1, 1, 1, 0.03F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -5.95F, -10.0F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 18, -8.0F, -2.0F, -1.0F, 1, 2, 4, 0.02F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -6.125F, -10.775F);
        this.base.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 25, -8.0F, -1.0F, -1.0F, 1, 1, 1, -0.02F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -6.625F, -11.775F);
        this.base.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 6, -8.0F, -1.0F, -1.0F, 1, 1, 2, -0.01F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -6.0F, -7.35F);
        this.base.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 49, -7.0F, 1.0F, -5.0F, 1, 1, 5, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.25F, -7.5F);
        this.base.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1702F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 88, -7.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.pectoralfinright = new ModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.3F, -3.25F, -3.5F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.48F, -0.5236F, 0.4363F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.9244F, -1.6719F, 3.4855F);
        this.pectoralfinright.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3294F, 0.6871F, -0.2418F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 65, 0.0F, -0.5F, -0.5F, 0, 5, 7, 0.0F, false));

        this.pectoralfinleft = new ModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.3F, -3.25F, -3.5F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.48F, 0.5236F, -0.4363F);


        this.spine = new ModelRenderer(this);
        this.spine.setRotationPoint(-1.0F, -8.25F, -6.0F);
        this.base.addChild(spine);
        this.setRotateAngle(spine, -1.0472F, 0.0F, 0.0F);
        this.spine.cubeList.add(new ModelBox(spine, 52, 36, -6.0F, -7.75F, -0.5F, 0, 9, 1, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.25F, -5.25F, -1.5F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 12, -7.4F, -3.0F, -1.0F, 1, 6, 11, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 30, -7.175F, -7.0F, 0.0F, 0, 4, 10, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 3.1F, 0.0F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 25, -8.3F, -1.0F, -1.0F, 1, 1, 11, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(-0.55F, 0.1F, 10.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.1309F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 15, 20, -7.0F, -3.0F, -1.0F, 1, 5, 10, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 34, 38, -6.8F, -6.85F, 0.0F, 0, 4, 9, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 3.25F, 0.0F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 36, -7.35F, -2.0F, -0.95F, 1, 2, 10, 0.0F, false));

        this.pelvicfinright = new ModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-6.5F, 2.0F, 1.0F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.084F, -0.0132F, 0.0467F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 39, 12, 0.0F, 0.0F, -1.0F, 0, 4, 8, 0.0F, false));

        this.pelvicfinleft = new ModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.5F, 2.0F, 1.0F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, 0.1309F, -0.7418F);


        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(-0.1F, -0.5F, 9.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.2618F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 41, 25, -7.0F, -2.25F, -1.0F, 1, 4, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 12, -6.81F, -6.1F, 0.0F, 0, 4, 5, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.0F, 0.5F, 4.05F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.1781F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 12, -4.735F, -0.0711F, -1.6493F, 0, 3, 1, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.0F, 1.5F, 1.75F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.9599F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 30, -4.725F, -1.0711F, -1.6493F, 0, 4, 2, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -0.25F, 0.0F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 9, 78, -5.85F, 1.9289F, -1.6493F, 1, 1, 6, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(-1.0F, -0.5F, 5.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.3491F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 45, -6.1F, -1.5F, -1.0F, 1, 3, 7, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 43, 0, -5.7F, -3.0F, 0.0F, 0, 2, 6, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 30, 88, -5.9F, 1.3F, 0.0F, 0, 1, 6, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(-0.45F, 0.0F, 6.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.3491F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 79, 58, -5.5F, -1.0F, -1.0F, 1, 2, 6, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 58, -5.275F, -2.85F, 0.0F, 0, 5, 8, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 14, 18, -5.5F, -0.5F, 4.75F, 1, 1, 2, -0.01F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(1.0F, -4.225F, -7.5F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 15, 88, -8.0F, -1.0F, -5.5F, 1, 1, 6, -0.01F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.125F, -4.425F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1658F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 24, 38, -8.0F, -1.0F, -1.0F, 1, 1, 6, -0.02F, false));

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
