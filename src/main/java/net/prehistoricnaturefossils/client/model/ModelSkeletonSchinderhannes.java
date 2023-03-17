package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSchinderhannes extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer flipperL;
    private final ModelRenderer flipperL2;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer spine;
    private final ModelRenderer tailfinL;
    private final ModelRenderer tailfinL2;

    public ModelSkeletonSchinderhannes() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 21.25F, -3.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -4.0F, 1.75F, -10.0F, 16, 1, 16, 0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -6.0F, 1.75F, 2.0F, 16, 1, 16, -0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -12.0F, 1.75F, -7.0F, 16, 1, 16, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.5F, 3.0F);
        this.bone.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.1745F, -3.1416F);
        this.body.cubeList.add(new ModelBox(body, 0, 17, -2.5F, -1.0F, -3.0F, 5, 1, 6, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.75F, -3.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 17, 19, -2.5F, 0.75F, -5.0F, 5, 1, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 10, 1.25F, 1.0F, -3.5F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 8, 3, -3.75F, 0.65F, -3.5F, 2, 1, 2, 0.0F, false));

        this.flipperL = new ModelRenderer(this);
        this.flipperL.setRotationPoint(0.5F, 1.75F, -1.0F);
        this.head.addChild(flipperL);
        this.setRotateAngle(flipperL, 0.0F, -0.1309F, 0.0F);
        this.flipperL.cubeList.add(new ModelBox(flipperL, 14, 17, 0.0F, 0.01F, -1.0F, 10, 0, 2, 0.0F, false));

        this.flipperL2 = new ModelRenderer(this);
        this.flipperL2.setRotationPoint(-0.5F, 1.75F, -1.0F);
        this.head.addChild(flipperL2);
        this.setRotateAngle(flipperL2, 0.0F, -0.0873F, 0.0F);
        this.flipperL2.cubeList.add(new ModelBox(flipperL2, 14, 17, -11.0F, 0.01F, -1.0F, 10, 0, 2, 0.0F, true));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.5F, 3.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 7, -2.0F, 0.5F, 0.0F, 4, 1, 2, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 8, 10, -1.0F, 0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.spine = new ModelRenderer(this);
        this.spine.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(spine);
        this.spine.cubeList.add(new ModelBox(spine, 0, 0, -0.5F, 0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.tailfinL = new ModelRenderer(this);
        this.tailfinL.setRotationPoint(0.25F, 1.0F, 0.5F);
        this.body3.addChild(tailfinL);
        this.setRotateAngle(tailfinL, 0.0F, 0.3491F, 0.0F);
        this.tailfinL.cubeList.add(new ModelBox(tailfinL, 5, 0, 0.0F, 0.26F, 0.0F, 2, 0, 3, 0.0F, false));

        this.tailfinL2 = new ModelRenderer(this);
        this.tailfinL2.setRotationPoint(-0.25F, 1.0F, 0.5F);
        this.body3.addChild(tailfinL2);
        this.setRotateAngle(tailfinL2, 0.0F, -0.3491F, 0.0F);
        this.tailfinL2.cubeList.add(new ModelBox(tailfinL2, 5, 0, -2.0F, 0.26F, 0.0F, 2, 0, 3, 0.0F, true));

    }

    public void renderAll(float f) {
        this.bone.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
