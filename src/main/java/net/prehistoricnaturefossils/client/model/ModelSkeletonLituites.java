package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLituites extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body;
    private final ModelRenderer cube_r3;
    private final ModelRenderer shelldontmove;
    private final ModelRenderer cube_r4;
    private final ModelRenderer bone2;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer bone3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer shelldontmove2;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;

    public ModelSkeletonLituites() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 68, -2.0F, -13.0F, -9.0F, 9, 9, 10, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 88, 7.0F, -10.0F, -9.0F, 6, 10, 6, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 44, 5, 6.0F, -7.0F, -3.0F, 7, 7, 13, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -8.0F, -4.0F, -9.0F, 15, 4, 13, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 43, 48, 0.0F, -20.0F, -2.0F, 6, 20, 9, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 48, -6.0F, -10.0F, 1.0F, 12, 10, 9, -0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, -13.0F, 0.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.4363F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 64, 68, -0.2F, 0.0F, -9.0F, 4, 13, 10, -0.005F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(9.5F, -11.5F, -11.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3452F, -0.346F, -0.3408F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 40, -1.5F, 0.4F, -2.8F, 4, 1, 6, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-3.7F, -1.5F, -2.4F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 1.1112F, 0.131F, 0.3118F);
        this.body.cubeList.add(new ModelBox(body, 29, 26, -3.5F, -7.25F, 4.0F, 7, 7, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 65, 36, -3.0F, -6.75F, 18.0F, 6, 6, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 58, 35, -3.5F, -1.2F, 2.0F, 7, 1, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.45F, 2.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5236F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 93, -3.5F, -2.925F, 0.6F, 7, 4, 2, 0.01F, false));

        this.shelldontmove = new ModelRenderer(this);
        this.shelldontmove.setRotationPoint(0.0F, -1.75F, 30.0F);
        this.body.addChild(shelldontmove);
        this.setRotateAngle(shelldontmove, 0.0436F, 0.0F, 0.0F);
        this.shelldontmove.cubeList.add(new ModelBox(shelldontmove, 75, 16, -2.5F, -4.5F, -0.05F, 5, 5, 10, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.5F, 10.0F);
        this.shelldontmove.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 78, -2.0F, 0.5F, -1.0F, 4, 4, 10, 0.01F, false));

        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.55F, 17.0F);
        this.shelldontmove.addChild(bone2);
        this.setRotateAngle(bone2, 0.1309F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 65, 92, -1.5F, -4.0F, 0.0F, 3, 3, 8, 0.01F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -0.525F, 8.0833F);
        this.bone2.addChild(bone);
        this.setRotateAngle(bone, 0.3927F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.0F, 0.9167F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 58, 26, -1.5F, 0.0F, -1.0F, 3, 2, 6, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -6.0F, 8.9167F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 2.5307F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 25, -0.5F, -0.9429F, 0.098F, 1, 1, 4, -0.01F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -3.0F, 8.9167F);
        this.bone.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.5708F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 24, -0.5F, -1.0429F, 0.098F, 1, 1, 3, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.5F, 5.9167F);
        this.bone.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6109F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 18, -1.0F, -2.175F, -0.1F, 2, 2, 4, 0.0F, false));

        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, -8.5F, 5.6667F);
        this.bone.addChild(bone3);
        this.setRotateAngle(bone3, -0.0175F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -2.6616F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.0F, -5.0462F, 0.1014F, 0, 5, 5, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.0F, -5.0462F, -0.8986F, 0, 3, 1, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(5.0948F, -6.2536F, 4.4297F);
        this.fossil.addChild(body2);
        this.setRotateAngle(body2, -2.9918F, 0.3855F, 2.768F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 18, -3.5F, -4.5872F, -6.462F, 7, 7, 14, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 72, 0, -3.0F, 0.9128F, 7.538F, 6, 1, 12, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 46, 81, -3.0F, -3.0872F, 7.538F, 1, 4, 12, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 90, 32, 2.0F, -3.0872F, 7.538F, 1, 1, 11, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 81, 80, 2.0F, -2.0872F, 7.538F, 1, 3, 12, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 29, 18, -2.0F, -3.0872F, 14.538F, 4, 4, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 74, 55, -3.0F, -4.0872F, 7.538F, 6, 1, 10, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 15, 40, -3.0F, 0.9128F, 19.538F, 1, 1, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 6, 0, -2.0F, 0.9128F, 19.538F, 1, 1, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 9, 18, -3.0F, -0.0872F, 19.538F, 1, 1, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 44, 0, -3.5F, 1.4628F, -8.462F, 7, 1, 2, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.2128F, -8.462F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5236F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 83, 67, -3.5F, -2.925F, 0.6F, 7, 4, 2, 0.01F, false));

        this.shelldontmove2 = new ModelRenderer(this);
        this.shelldontmove2.setRotationPoint(0.0F, 0.9128F, 19.538F);
        this.body2.addChild(shelldontmove2);
        this.setRotateAngle(shelldontmove2, 0.0436F, 0.0F, 0.0F);


        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 0.55F, 17.0F);
        this.shelldontmove2.addChild(bone4);
        this.setRotateAngle(bone4, 0.1309F, 0.0F, 0.0F);


        this.bone5 = new ModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, -0.525F, 8.0833F);
        this.bone4.addChild(bone5);
        this.setRotateAngle(bone5, 0.3927F, 0.0F, 0.0F);


        this.bone6 = new ModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, -8.5F, 5.6667F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, -0.0175F, 0.0F, 0.0F);

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
