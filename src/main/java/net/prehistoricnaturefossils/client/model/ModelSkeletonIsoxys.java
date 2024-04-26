package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonIsoxys extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer base;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer bone;
    private final ModelRenderer rightleg1;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer rightleg4;
    private final ModelRenderer rightleg5;
    private final ModelRenderer rightleg6;
    private final ModelRenderer rightleg7;
    private final ModelRenderer rightleg8;
    private final ModelRenderer rightleg9;
    private final ModelRenderer rightleg10;
    private final ModelRenderer bone2;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;

    public ModelSkeletonIsoxys() {
        this.textureWidth = 69;
        this.textureHeight = 46;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.7F, 0.0F, -1.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.0397F, -2.0F, -8.1234F, 8, 2, 19, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(8.3F, 0.0F, 9.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.3578F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 22, -9.7538F, -2.0F, -15.5806F, 4, 2, 19, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.6F, 0.0F, -14.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.733F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 33, 3.0123F, -2.0F, 0.0435F, 8, 2, 4, -0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-9.0F, 0.0F, -12.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 22, -0.1F, -2.0F, 4.2F, 11, 2, 8, -0.007F, false));

        this.base = new ModelRenderer(this);
        this.base.setRotationPoint(6.0F, -0.8F, 0.0F);
        this.fossil.addChild(base);
        this.setRotateAngle(base, 0.0F, 0.0F, -1.5708F);
        this.base.cubeList.add(new ModelBox(base, 31, 22, 1.5F, -9.25F, -6.0F, 0, 2, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 7, 22, 1.5F, -9.25F, -5.0F, 0, 4, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 8, 31, 1.5F, -9.25F, 5.0F, 0, 2, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 0, 1.5F, -9.25F, -4.0F, 0, 5, 6, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 10, 22, 1.5F, -9.25F, 4.0F, 0, 3, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 14, 4, 1.5F, -9.25F, 2.0F, 0, 4, 2, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 16, 1.45F, -7.4F, -6.6F, 0, 1, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 14, 15, 1.45F, -8.5F, -7.2F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(1.605F, -6.7106F, -0.4278F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 7, 0.005F, -0.755F, -0.7197F, 0, 2, 5, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.605F, -6.7106F, -0.4278F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 22, -0.005F, -0.7448F, -3.2789F, 0, 2, 3, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -9.25F, -6.1F);
        this.base.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 15, -1.0F, 1.5F, -2.9F, 1, 0, 3, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 4, -1.0F, 1.5F, 12.1F, 1, 0, 1, 0.0F, false));

        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(1.4F, -5.5F, -4.0F);
        this.base.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.5236F, 0.0F, 0.0F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 28, 26, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));
        this.rightarm.cubeList.add(new ModelBox(rightarm, 15, 0, -0.1F, 0.25F, -1.0F, 0, 1, 1, 0.0F, false));

        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1F, 1.5F, 0.25F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.0036F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 28, 22, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 12, -0.1F, 0.75F, -1.0F, 0, 1, 1, 0.0F, false));
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 7, 0, 0.0F, 2.0F, -0.75F, 0, 1, 1, 0.0F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(-6.0F, -7.0F, 0.0F);
        this.base.addChild(bone);
        this.setRotateAngle(bone, 0.0873F, 0.0F, 0.0F);


        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(7.4F, 1.4F, -2.7F);
        this.bone.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.0F, 1.5708F, 0.0F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 16, 30, -0.5F, -2.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(7.4F, 0.4F, -1.95F);
        this.bone.addChild(rightleg2);
        this.setRotateAngle(rightleg2, -1.5708F, 0.6981F, -1.5708F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 16, 22, -0.5F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(7.4F, 0.4F, -1.2F);
        this.bone.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -1.5708F, 0.9599F, -1.5708F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 6, 28, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg4 = new ModelRenderer(this);
        this.rightleg4.setRotationPoint(7.4F, 0.4F, -0.45F);
        this.bone.addChild(rightleg4);
        this.setRotateAngle(rightleg4, -1.5708F, 1.1781F, -1.5708F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 3, 28, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg5 = new ModelRenderer(this);
        this.rightleg5.setRotationPoint(7.4F, 0.4F, 0.3F);
        this.bone.addChild(rightleg5);
        this.setRotateAngle(rightleg5, -1.5708F, 1.3526F, -1.5708F);
        this.rightleg5.cubeList.add(new ModelBox(rightleg5, 0, 28, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg6 = new ModelRenderer(this);
        this.rightleg6.setRotationPoint(7.4F, 0.4F, 1.05F);
        this.bone.addChild(rightleg6);
        this.setRotateAngle(rightleg6, -1.5708F, 1.4835F, -1.5708F);
        this.rightleg6.cubeList.add(new ModelBox(rightleg6, 10, 27, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg7 = new ModelRenderer(this);
        this.rightleg7.setRotationPoint(7.4F, 0.4F, 1.8F);
        this.bone.addChild(rightleg7);
        this.setRotateAngle(rightleg7, 1.5708F, 1.5272F, 1.5708F);
        this.rightleg7.cubeList.add(new ModelBox(rightleg7, 16, 26, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg8 = new ModelRenderer(this);
        this.rightleg8.setRotationPoint(7.4F, 0.4F, 2.55F);
        this.bone.addChild(rightleg8);
        this.setRotateAngle(rightleg8, 1.5708F, 1.3963F, 1.5708F);
        this.rightleg8.cubeList.add(new ModelBox(rightleg8, 13, 26, -0.5F, -0.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg9 = new ModelRenderer(this);
        this.rightleg9.setRotationPoint(7.4F, 0.4F, 3.3F);
        this.bone.addChild(rightleg9);
        this.setRotateAngle(rightleg9, 1.5708F, 1.1781F, 1.5708F);
        this.rightleg9.cubeList.add(new ModelBox(rightleg9, 13, 22, -0.5F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg10 = new ModelRenderer(this);
        this.rightleg10.setRotationPoint(7.4F, 0.2F, 4.05F);
        this.bone.addChild(rightleg10);
        this.setRotateAngle(rightleg10, 1.5708F, 1.0036F, 1.5708F);
        this.rightleg10.cubeList.add(new ModelBox(rightleg10, 13, 30, -0.5F, -0.8F, 0.0F, 1, 3, 0, 0.0F, false));

        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.5F, -7.0F, -3.0F);
        this.base.addChild(bone2);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(1.3333F, -6.2831F, 6.8857F);
        this.base.addChild(tail1);
        this.setRotateAngle(tail1, 0.0F, 0.5672F, 1.5708F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.3333F, 0.2583F, -0.573F);
        this.tail1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.4363F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 7, 0, -1.0F, -0.375F, 0.0F, 2, 0, 3, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.3333F, 0.2583F, -0.573F);
        this.tail1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.4363F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 12, -1.0F, -0.4F, 0.0F, 2, 0, 3, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.3333F, 0.2583F, -2.573F);
        this.tail1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -1.5708F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.4F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

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
