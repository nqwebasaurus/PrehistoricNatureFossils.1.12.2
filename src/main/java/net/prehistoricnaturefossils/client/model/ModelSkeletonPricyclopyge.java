package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPricyclopyge extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Smalltrilo;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Antennae1;
    private final ModelRenderer Antennae2;
    private final ModelRenderer Thorax1;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Thorax2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Thorax3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer LLeg5;

    public ModelSkeletonPricyclopyge() {
        this.textureWidth = 80;
        this.textureHeight = 40;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -8.0F, -2.0F, -12.0F, 16, 2, 24, 0.0F, false));

        this.Smalltrilo = new ModelRenderer(this);
        this.Smalltrilo.setRotationPoint(3.5F, -4.2653F, -2.6601F);
        this.fossil.addChild(Smalltrilo);
        this.setRotateAngle(Smalltrilo, 0.4363F, 0.0F, -1.5708F);
        this.Smalltrilo.cubeList.add(new ModelBox(Smalltrilo, 17, 4, -2.1F, 0.6153F, -0.0399F, 0, 1, 2, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.6153F, -0.0399F);
        this.Smalltrilo.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 17, -2.0F, -2.0F, -2.0F, 0, 2, 2, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(2.5F, -0.3847F, 0.9601F);
        this.Smalltrilo.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4051F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 15, -4.2F, -1.0F, -1.575F, 0, 2, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -4.3F, -1.5F, -2.075F, 0, 3, 3, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.6918F, -1.8139F);
        this.Smalltrilo.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.4399F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 0, -1.9F, -2.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.5521F, -0.0921F);
        this.Smalltrilo.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 6, -2.0F, 0.0F, 0.0F, 0, 1, 3, -0.01F, false));

        this.Antennae1 = new ModelRenderer(this);
        this.Antennae1.setRotationPoint(-1.9596F, -2.2847F, -2.0453F);
        this.Smalltrilo.addChild(Antennae1);
        this.Antennae1.cubeList.add(new ModelBox(Antennae1, 0, 27, 0.0096F, -2.0F, 0.0054F, 0, 2, 11, 0.0F, false));

        this.Antennae2 = new ModelRenderer(this);
        this.Antennae2.setRotationPoint(-2.0404F, -2.2847F, -2.0453F);
        this.Smalltrilo.addChild(Antennae2);
        this.setRotateAngle(Antennae2, 0.3491F, 0.0F, 0.0F);
        this.Antennae2.cubeList.add(new ModelBox(Antennae2, 0, 0, -0.0096F, -2.0F, 0.0054F, 0, 2, 11, 0.0F, false));

        this.Thorax1 = new ModelRenderer(this);
        this.Thorax1.setRotationPoint(0.0F, 1.4653F, 1.9601F);
        this.Smalltrilo.addChild(Thorax1);
        this.setRotateAngle(Thorax1, 0.2182F, 0.0F, 0.0F);
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 10, 17, -2.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0797F, -0.8597F, 1.0F);
        this.Thorax1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 14, -0.1104F, 0.0925F, -1.0F, 2, 0, 2, 0.0F, false));

        this.Thorax2 = new ModelRenderer(this);
        this.Thorax2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax1.addChild(Thorax2);
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 5, 17, -2.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, -0.5F, -1.0F);
        this.Thorax2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -1.5708F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 7, -0.0928F, -3.497F, 1.0F, 3, 0, 2, 0.0F, false));

        this.Thorax3 = new ModelRenderer(this);
        this.Thorax3.setRotationPoint(0.0F, 0.0F, 1.9F);
        this.Thorax2.addChild(Thorax3);
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 0, 0, -2.1F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 4, 0, -2.2F, -1.1F, 0.8F, 0, 1, 1, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, -0.5F, -3.0F);
        this.Thorax3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 14, -0.1428F, -3.572F, 3.0F, 2, 0, 2, 0.0F, false));

        this.LLeg5 = new ModelRenderer(this);
        this.LLeg5.setRotationPoint(0.3176F, -0.7275F, 0.5F);
        this.Thorax3.addChild(LLeg5);
        this.setRotateAngle(LLeg5, 0.0F, 0.0F, -1.5708F);

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
