package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCyrtoceras extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer body;
    private final ModelRenderer shell;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer cube_r2;
    private final ModelRenderer bone5;
    private final ModelRenderer cube_r3;
    private final ModelRenderer bone6;
    private final ModelRenderer leg1;
    private final ModelRenderer leg6;
    private final ModelRenderer leg2;
    private final ModelRenderer leg7;
    private final ModelRenderer leg3;
    private final ModelRenderer leg8;
    private final ModelRenderer leg4;
    private final ModelRenderer leg10;
    private final ModelRenderer leg5;
    private final ModelRenderer leg9;
    private final ModelRenderer bone;

    public ModelSkeletonCyrtoceras() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -7.0F, -3.0F, -21.0F, 22, 3, 37, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 41, -6.0F, -6.0F, -20.0F, 20, 3, 23, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 68, -5.0F, -9.0F, -19.0F, 19, 3, 10, -0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.0F, 14.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 82, -4.0F, 0.0F, -33.0F, 18, 3, 9, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 64, 41, -5.1F, 0.0F, -24.0F, 17, 3, 12, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 59, 68, -6.0F, 0.0F, -12.0F, 16, 3, 12, -0.004F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, 12.0F);
        this.fossil.addChild(body);


        this.shell = new ModelRenderer(this);
        this.shell.setRotationPoint(-5.0F, -6.4F, -5.0F);
        this.body.addChild(shell);
        this.setRotateAngle(shell, 3.1416F, -0.1309F, -1.5708F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 15, -6.0F, -2.0F, -8.0F, 12, 2, 5, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 27, 27, 4.0F, -10.0F, -5.0F, 2, 3, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 49, 68, 4.0F, -7.0F, -7.0F, 2, 5, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 55, 84, -6.0F, -12.0F, -3.0F, 12, 12, 8, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 20, 23, -6.0F, -12.0F, -4.0F, 7, 2, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 23, 0, -6.0F, -12.0F, -6.0F, 4, 2, 2, 0.0F, false));

        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.shell.addChild(bone2);
        this.setRotateAngle(bone2, 0.1309F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 64, 57, -5.0F, -3.0F, 11.0F, 10, 3, 1, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 82, 0, -5.0F, -10.0F, -1.0F, 10, 10, 12, 0.0F, false));

        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, -0.9483F, 11.3615F);
        this.bone2.addChild(bone3);
        this.setRotateAngle(bone3, 0.3927F, 0.0F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 51, -4.0F, -7.7517F, 0.4292F, 8, 8, 1, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 0, -4.0F, -7.7517F, 1.8292F, 8, 8, 6, 0.0F, false));

        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, -2.0517F, 7.8164F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, 0.3927F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.0517F, -0.1212F);
        this.bone4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 23, -3.0F, -5.8517F, -1.0F, 6, 6, 7, 0.0F, false));

        this.bone5 = new ModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.5517F, 4.5802F);
        this.bone4.addChild(bone5);
        this.setRotateAngle(bone5, 0.4363F, 0.0F, 0.0F);
        this.bone5.cubeList.add(new ModelBox(bone5, 0, 41, -2.0F, -4.5F, 0.2987F, 4, 4, 5, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.4F, -3.5F, 5.7987F);
        this.bone5.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, -1.2217F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.bone6 = new ModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, -1.5F, 3.2987F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, 0.48F, 0.0F, 0.0F);


        this.leg1 = new ModelRenderer(this);
        this.leg1.setRotationPoint(3.0F, -4.0F, 7.0F);
        this.body.addChild(leg1);


        this.leg6 = new ModelRenderer(this);
        this.leg6.setRotationPoint(-3.0F, -4.0F, 7.0F);
        this.body.addChild(leg6);


        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(3.0F, -6.0F, 7.0F);
        this.body.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, -0.0436F, -0.3927F);


        this.leg7 = new ModelRenderer(this);
        this.leg7.setRotationPoint(-3.0F, -6.0F, 7.0F);
        this.body.addChild(leg7);
        this.setRotateAngle(leg7, 0.0F, 0.0436F, 0.3927F);


        this.leg3 = new ModelRenderer(this);
        this.leg3.setRotationPoint(3.0F, -2.0F, 7.0F);
        this.body.addChild(leg3);
        this.setRotateAngle(leg3, 0.0F, -0.0436F, 0.3491F);


        this.leg8 = new ModelRenderer(this);
        this.leg8.setRotationPoint(-3.0F, -2.0F, 7.0F);
        this.body.addChild(leg8);
        this.setRotateAngle(leg8, 0.0F, 0.0436F, -0.3491F);


        this.leg4 = new ModelRenderer(this);
        this.leg4.setRotationPoint(2.0F, -1.0F, 7.0F);
        this.body.addChild(leg4);
        this.setRotateAngle(leg4, -0.0873F, 0.0436F, 1.3963F);


        this.leg10 = new ModelRenderer(this);
        this.leg10.setRotationPoint(-2.0F, -1.0F, 7.0F);
        this.body.addChild(leg10);
        this.setRotateAngle(leg10, -0.0873F, -0.0436F, -1.3963F);


        this.leg5 = new ModelRenderer(this);
        this.leg5.setRotationPoint(1.0F, -7.0F, 7.0F);
        this.body.addChild(leg5);
        this.setRotateAngle(leg5, 0.0F, 0.0F, -1.3526F);


        this.leg9 = new ModelRenderer(this);
        this.leg9.setRotationPoint(-1.0F, -7.0F, 7.0F);
        this.body.addChild(leg9);
        this.setRotateAngle(leg9, 0.0F, 0.0F, 1.3526F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -11.0F, 3.0F);
        this.body.addChild(bone);
        this.setRotateAngle(bone, -1.1345F, 0.0F, 0.0F);

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
