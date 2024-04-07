package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCharnia extends ModelBase {
    private final ModelRenderer rock;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer frond1;
    private final ModelRenderer frond2;
    private final ModelRenderer frond3;
    private final ModelRenderer frond4;

    public ModelSkeletonCharnia() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.rock = new ModelRenderer(this);
        this.rock.setRotationPoint(-2.5422F, 23.0F, 6.8399F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rock.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 14, -5.0F, -1.0F, -5.25F, 23, 2, 6, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-11.6729F, 0.0F, -8.1735F);
        this.rock.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.6109F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 22, -1.75F, -1.0F, -3.0F, 12, 2, 6, -0.001F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.7169F, 0.0F, -10.5742F);
        this.rock.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.0036F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 22, -5.75F, -1.0F, -2.5F, 7, 2, 10, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-13.0105F, 0.0F, -9.0212F);
        this.rock.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.3491F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 30, -1.0F, -1.0F, -2.3F, 2, 2, 5, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(16.5422F, 0.0F, -10.8399F);
        this.rock.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.2618F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -22.25F, -1.0F, -0.25F, 27, 2, 12, 0.001F, false));

        this.frond1 = new ModelRenderer(this);
        this.frond1.setRotationPoint(-3.4578F, 8.9F, -22.8399F);
        this.rock.addChild(frond1);
        this.setRotateAngle(frond1, -1.5708F, 0.0F, 0.0F);


        this.frond2 = new ModelRenderer(this);
        this.frond2.setRotationPoint(4.5F, -20.1F, -10.0F);
        this.frond1.addChild(frond2);
        this.setRotateAngle(frond2, 0.0F, 0.0F, -2.7489F);
        this.frond2.cubeList.add(new ModelBox(frond2, 0, 6, -1.5F, -2.5F, -0.1F, 3, 1, 1, 0.0F, false));
        this.frond2.cubeList.add(new ModelBox(frond2, 0, 0, -1.5F, -1.5F, -0.1F, 3, 1, 1, 0.0F, false));
        this.frond2.cubeList.add(new ModelBox(frond2, 0, 4, -1.5F, -0.5F, -0.1F, 3, 1, 1, 0.0F, false));
        this.frond2.cubeList.add(new ModelBox(frond2, 0, 2, -1.5F, 0.5F, -0.1F, 3, 1, 1, 0.0F, false));
        this.frond2.cubeList.add(new ModelBox(frond2, 0, 8, -1.0F, 1.5F, -0.1F, 2, 1, 1, 0.0F, false));

        this.frond3 = new ModelRenderer(this);
        this.frond3.setRotationPoint(8.0F, -2.5F, -8.0F);
        this.frond2.addChild(frond3);
        this.frond3.cubeList.add(new ModelBox(frond3, 0, 17, -9.5F, -5.0F, 8.0F, 3, 1, 0, 0.0F, false));
        this.frond3.cubeList.add(new ModelBox(frond3, 0, 15, -9.5F, -4.0F, 8.0F, 3, 1, 0, 0.0F, false));
        this.frond3.cubeList.add(new ModelBox(frond3, 0, 14, -9.5F, -3.0F, 8.0F, 3, 1, 0, 0.0F, false));
        this.frond3.cubeList.add(new ModelBox(frond3, 6, 11, -9.5F, -2.0F, 8.0F, 3, 1, 0, 0.0F, false));
        this.frond3.cubeList.add(new ModelBox(frond3, 0, 11, -9.5F, -1.0F, 8.0F, 3, 1, 0, 0.0F, false));

        this.frond4 = new ModelRenderer(this);
        this.frond4.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.frond3.addChild(frond4);
        this.frond4.cubeList.add(new ModelBox(frond4, 0, 16, -9.5F, -5.0F, 8.0F, 3, 1, 0, 0.0F, false));
        this.frond4.cubeList.add(new ModelBox(frond4, 6, 10, -9.5F, -4.0F, 8.0F, 3, 1, 0, 0.0F, false));
        this.frond4.cubeList.add(new ModelBox(frond4, 0, 10, -9.5F, -3.0F, 8.0F, 3, 1, 0, 0.0F, false));
        this.frond4.cubeList.add(new ModelBox(frond4, 6, 9, -9.5F, -2.0F, 8.0F, 3, 1, 0, 0.0F, false));
        this.frond4.cubeList.add(new ModelBox(frond4, 5, 8, -9.5F, -1.0F, 8.0F, 3, 1, 0, 0.0F, false));

    }

    public void renderAll(float f) {
        this.rock.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
