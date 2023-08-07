package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCalvapilosa extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer back;
    private final ModelRenderer head;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r4;

    public ModelSkeletonCalvapilosa() {
        this.textureWidth = 128;
        this.textureHeight = 85;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-2.1857F, 23.5F, 3.9699F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(3.1857F, 0.5F, -8.9699F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4363F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 40, -5.7F, -1.0F, -13.9F, 19, 1, 31, 0.004F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-7.7654F, 0.0F, 13.302F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.1956F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 59, 0, -3.1828F, -0.5F, -15.3067F, 8, 1, 19, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-10.7654F, 0.0F, 3.302F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.192F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.0299F, -0.5F, -29.4628F, 10, 1, 38, -0.004F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(2.1857F, -0.8F, -3.8699F);
        this.fossil.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 8, -4.0F, 0.0F, -4.0F, 8, 0, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 54, -2.5F, -0.15F, -4.0F, 4, 0, 7, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 54, -1.5F, -0.15F, -4.0F, 4, 0, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, 0.1F, -4.0F, 9, 0, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 16, -3.5F, -0.05F, -4.0F, 7, 0, 7, 0.0F, false));

        this.back = new ModelRenderer(this);
        this.back.setRotationPoint(0.0F, -0.025F, 2.75F);
        this.body.addChild(back);
        this.setRotateAngle(back, 0.0F, -0.0873F, 0.0F);
        this.back.cubeList.add(new ModelBox(back, 59, 21, -3.5F, 0.0F, 0.0F, 7, 0, 5, 0.0F, false));
        this.back.cubeList.add(new ModelBox(back, 0, 24, -4.0F, 0.1F, 0.0F, 8, 0, 5, 0.0F, false));
        this.back.cubeList.add(new ModelBox(back, 59, 6, -2.0F, -0.15F, 0.0F, 4, 0, 5, -0.01F, false));
        this.back.cubeList.add(new ModelBox(back, 0, 40, -3.0F, -0.1F, -0.5F, 6, 0, 6, 0.0F, false));
        this.back.cubeList.add(new ModelBox(back, 59, 12, -3.0F, 0.1F, 4.5F, 6, 0, 3, 0.0F, false));
        this.back.cubeList.add(new ModelBox(back, 22, 16, -2.5F, 0.0F, 5.0F, 5, 0, 2, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.025F, -3.75F);
        this.body.addChild(head);
        this.setRotateAngle(head, 0.0F, 0.0873F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 47, -3.0F, -0.05F, -5.5F, 6, 0, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 19, -2.5F, 0.0F, -6.0F, 5, 0, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 59, 0, -2.0F, -0.15F, -5.0F, 4, 0, 5, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -0.5F, 0.26F, -4.0F, 1, 0, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 59, 27, -3.5F, 0.0F, -5.0F, 7, 0, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 30, -4.0F, 0.1F, -5.0F, 8, 0, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 59, 16, -3.0F, 0.1F, -6.5F, 6, 0, 2, 0.0F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -1.75F, -3.0F);
        this.head.addChild(bone);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.7854F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 8, -1.0F, 1.6F, -1.0F, 2, 0, 2, 0.0F, false));

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
