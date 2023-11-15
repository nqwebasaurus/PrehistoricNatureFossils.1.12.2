package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDunyu extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer main;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;

    public ModelSkeletonDunyu() {
        this.textureWidth = 60;
        this.textureHeight = 44;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(fossil, 0.0F, 0.5672F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 30, 18, -8.3475F, -1.0F, 3.5131F, 10, 1, 4, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.6F, 0.0F, -7.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4189F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 18, -0.0112F, -1.0F, 0.8091F, 8, 1, 11, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3491F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 3, -1.0F, -1.0F, -5.0F, 6, 1, 12, -0.002F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0226F, -1.3842F, -0.5619F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.0F, -0.5672F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 30, 0, -1.4226F, -0.3158F, -4.4881F, 3, 1, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 23, 35, -1.983F, -1.0158F, 0.3954F, 4, 1, 1, -0.01F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(3.4453F, -0.3158F, 2.6614F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.0036F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 39, -2.175F, 0.0F, -1.025F, 3, 1, 2, -0.01F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.2906F, -0.3158F, 2.6614F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.0036F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 31, -0.825F, 0.0F, -1.025F, 3, 1, 2, -0.01F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(5.0374F, -0.3158F, 1.2013F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.6232F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 29, 24, 0.0494F, 0.0F, -0.0003F, 4, 1, 2, 0.001F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-4.8827F, -0.3158F, 1.2013F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 1.6232F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 38, -4.0494F, 0.0F, -0.0003F, 4, 1, 2, 0.001F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(4.6836F, -0.3158F, -1.9126F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -1.3526F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.165F, 0.0F, 0.3238F, 3, 1, 4, 0.01F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.5289F, -0.3158F, -1.9126F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.3526F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 6, -3.165F, 0.0F, 0.3238F, 3, 1, 4, 0.01F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5774F, -0.3158F, -4.4881F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.781F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 8, 0.0F, 0.0F, 0.0F, 4, 1, 5, -0.01F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.4226F, -0.3158F, -4.4881F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.781F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 33, -4.0F, 0.0F, 0.0F, 4, 1, 5, -0.001F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.5774F, -1.7548F, -0.9185F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1242F, -0.0414F, 0.3203F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 22, 0.0F, 0.6957F, -1.1153F, 2, 1, 3, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 12, 0.5F, 0.6457F, -1.6153F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.4226F, -1.7548F, -0.9185F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1242F, 0.0414F, -0.3203F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 12, -1.5F, 0.6457F, -1.6153F, 1, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 17, -2.0F, 0.6957F, -1.1153F, 2, 1, 3, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0774F, -1.8158F, -0.4881F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2793F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 31, -1.5F, 0.4F, -4.0F, 3, 1, 6, -0.01F, false));

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
