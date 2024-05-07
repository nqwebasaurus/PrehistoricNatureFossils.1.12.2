package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonForeyia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer cube_r7;
    private final ModelRenderer body1;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer pelvicfinL;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer pectoralfinL;

    public ModelSkeletonForeyia() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(5.5F, 23.5F, 10.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 65, -6.5F, -0.5F, -20.0F, 19, 1, 26, 0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-9.5F, 0.0F, -1.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3054F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -9.5F, -0.5F, -18.5F, 19, 1, 37, -0.01F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.5672F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 39, -14.5F, -0.5F, -12.0F, 22, 1, 24, 0.01F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-5.0F, -0.5559F, -5.0593F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0F, -1.5708F);
        this.body.cubeList.add(new ModelBox(body, 19, 15, -1.0F, -3.9441F, -1.5157F, 1, 7, 5, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 58, -1.0F, -5.7941F, 1.4843F, 1, 2, 2, -0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 11, 65, -1.0F, 2.5559F, -0.0407F, 1, 3, 4, -0.02F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 6.5559F, 7.9593F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6981F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 7, 57, -1.5F, -12.475F, -6.75F, 1, 3, 2, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 6.5559F, 7.9593F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6545F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 47, -1.5F, -7.5F, -14.35F, 1, 7, 3, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 6.5559F, 7.9593F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 69, 47, -1.0F, -2.25F, -9.25F, 1, 3, 2, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 6.5559F, 7.9593F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.48F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 39, -1.0F, -3.5F, -14.1F, 1, 5, 4, 0.01F, false));

        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 3.0559F, -0.7657F);
        this.body.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.1745F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 13, 20, -1.0F, 0.0F, -1.75F, 1, 2, 1, -0.01F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 3.5F, 8.75F);
        this.lowerjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 69, 53, -1.5F, -6.1F, -9.25F, 1, 2, 2, -0.02F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.4441F, 3.4593F);
        this.body.addChild(body1);
        this.setRotateAngle(body1, 0.0436F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -0.995F, -3.25F, -1.0F, 1, 8, 6, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 7.0F, 4.5F);
        this.body1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 15, 0.0F, -15.25F, -8.0F, 0, 5, 6, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 28, -1.002F, -10.25F, -8.0F, 1, 2, 5, 0.01F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 7.0F, 4.5F);
        this.body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 39, -0.998F, -4.0F, -4.0F, 1, 2, 5, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 9, 24, -0.997F, -3.0F, -1.0F, 1, 6, 4, 0.01F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.001F, -5.6357F, 2.7171F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 27, 0.0F, -2.5F, -2.0F, 0, 5, 4, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 6.5F, -0.5F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 0, -1.002F, -10.25F, -3.25F, 1, 2, 4, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 6.5F, -0.5F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 65, 65, -1.0F, -4.25F, 0.25F, 1, 2, 4, 0.0F, false));

        this.pelvicfinL = new ModelRenderer(this);
        this.pelvicfinL.setRotationPoint(0.0F, 4.4882F, -1.1836F);
        this.body2.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.5672F, 0.0F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.8203F, -1.0046F);
        this.pelvicfinL.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 5, 27, 0.0F, -1.0898F, 0.0405F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.25F, 2.75F, -0.75F);
        this.pelvicfinL.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7854F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 27, 17, -0.25F, -0.0347F, 0.3889F, 0, 1, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 28, -0.25F, -1.3103F, 1.5397F, 0, 2, 2, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.25F, 2.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 69, 39, -1.0F, -2.7997F, 0.0131F, 1, 5, 2, -0.01F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 3.0937F, 2.1189F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.3963F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 0, 0.0F, 0.3454F, -0.7922F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 3.4772F, 0.9205F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 0, 0.25F, -0.0152F, -0.6736F, 0, 2, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 4.1703F, 1.8658F);
        this.body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 1.309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 0, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.0502F, 1.9913F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.1309F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 27, 9, 0.0F, -1.75F, -0.25F, 0, 3, 4, 0.02F, false));
        this.body4.cubeList.add(new ModelBox(body4, 15, 49, 0.1F, -1.0F, 3.75F, 0, 1, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 28, 24, 0.01F, -1.75F, 6.5F, 0, 2, 4, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 7.0F, -5.0F);
        this.body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.7854F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 7, 7, 0.0F, 2.775F, 7.25F, 0, 4, 8, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 65, -0.002F, 0.85F, 7.75F, 0, 2, 5, -0.02F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 7.0F, -5.0F);
        this.body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.6109F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 16, 0, 0.0F, -17.825F, -0.8F, 0, 5, 7, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 9, 49, -0.03F, -12.85F, -0.75F, 0, 2, 5, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 7.0F, -5.0F);
        this.body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.5672F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 17, 54, 0.25F, -6.1F, 8.5F, 0, 2, 3, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 7.0F, -5.0F);
        this.body4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3491F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 15, 0, -0.5F, -8.75F, 2.5F, 0, 3, 3, 0.0F, false));

        this.pectoralfinL = new ModelRenderer(this);
        this.pectoralfinL.setRotationPoint(0.05F, 2.75F, 0.0F);
        this.body1.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, -0.6981F, 0.0F, 0.0F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 0, 0.0F, -1.0F, 1.0F, 0, 2, 2, 0.0F, false));
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 14, 0, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

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
