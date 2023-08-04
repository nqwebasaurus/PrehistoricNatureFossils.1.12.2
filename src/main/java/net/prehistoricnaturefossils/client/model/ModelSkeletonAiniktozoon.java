package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAiniktozoon extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer bones;
    private final ModelRenderer bodybase;
    private final ModelRenderer legL;
    private final ModelRenderer legR;
    private final ModelRenderer legL2;
    private final ModelRenderer legL3;
    private final ModelRenderer legR3;
    private final ModelRenderer body1;
    private final ModelRenderer finL;
    private final ModelRenderer body2;
    private final ModelRenderer finL2;
    private final ModelRenderer body3;
    private final ModelRenderer finL3;
    private final ModelRenderer body4;
    private final ModelRenderer finL4;
    private final ModelRenderer body5;
    private final ModelRenderer finL5;
    private final ModelRenderer body6;
    private final ModelRenderer finL6;
    private final ModelRenderer body7;
    private final ModelRenderer finL7;
    private final ModelRenderer body8;
    private final ModelRenderer finL8;
    private final ModelRenderer body9;
    private final ModelRenderer finL9;
    private final ModelRenderer body10;
    private final ModelRenderer finL10;
    private final ModelRenderer body11;
    private final ModelRenderer finR11;
    private final ModelRenderer finL11;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body12;
    private final ModelRenderer finR12;
    private final ModelRenderer finL12;
    private final ModelRenderer tail;
    private final ModelRenderer eye;
    private final ModelRenderer carapace;

    public ModelSkeletonAiniktozoon() {
        this.textureWidth = 96;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(4.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 31, -11.0F, -1.0F, -12.0F, 16, 1, 23, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 56, 5.0F, -1.0F, -2.0F, 4, 1, 13, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(9.4F, 0.0F, -2.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3927F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 56, -4.4F, -1.0F, -11.0F, 4, 1, 11, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-12.0F, -1.0F, 13.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.7418F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 1.3F, 0.0F, -16.7F, 16, 1, 29, -0.008F, false));

        this.bones = new ModelRenderer(this);
        this.bones.setRotationPoint(-2.0F, -2.2F, 2.0F);
        this.fossil.addChild(bones);
        this.setRotateAngle(bones, 0.0F, 0.0F, -1.5708F);


        this.bodybase = new ModelRenderer(this);
        this.bodybase.setRotationPoint(0.0F, 0.25F, 0.0F);
        this.bones.addChild(bodybase);
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 0, -1.01F, -2.75F, -8.0F, 0, 2, 4, 0.0F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(-0.75F, -1.0F, -6.0F);
        this.bodybase.addChild(legL);
        this.setRotateAngle(legL, -0.4363F, 0.0F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 5, 17, 0.0F, 0.0F, -2.0F, 0, 3, 2, 0.0F, false));

        this.legR = new ModelRenderer(this);
        this.legR.setRotationPoint(-1.05F, -1.0F, -6.0F);
        this.bodybase.addChild(legR);
        this.setRotateAngle(legR, -0.2182F, 0.0F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 15, 8, -0.1F, 0.0F, -2.0F, 0, 3, 2, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(-0.65F, -1.0F, -5.25F);
        this.bodybase.addChild(legL2);
        this.setRotateAngle(legL2, -0.0436F, 0.0F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 17, -0.2F, -0.5F, -2.0F, 0, 4, 2, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(-0.55F, -1.0F, -4.5F);
        this.bodybase.addChild(legL3);
        this.setRotateAngle(legL3, 0.7418F, 0.0F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 15, 0, -0.2F, -0.25F, -3.0F, 0, 4, 3, 0.0F, false));

        this.legR3 = new ModelRenderer(this);
        this.legR3.setRotationPoint(-0.95F, -1.0F, -4.5F);
        this.bodybase.addChild(legR3);
        this.setRotateAngle(legR3, 0.3927F, 0.0F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 6, 4, 0.0F, -0.25F, -3.0F, 0, 4, 3, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -2.05F, -4.0F);
        this.bodybase.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 25, 4, -1.0F, -0.75F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finL = new ModelRenderer(this);
        this.finL.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body1.addChild(finL);
        this.setRotateAngle(finL, 0.2182F, 0.0F, 0.0F);
        this.finL.cubeList.add(new ModelBox(finL, 22, 17, -2.03F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 26, 8, -0.99F, -0.76F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finL2 = new ModelRenderer(this);
        this.finL2.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body2.addChild(finL2);
        this.setRotateAngle(finL2, 0.2182F, 0.0F, 0.0F);
        this.finL2.cubeList.add(new ModelBox(finL2, 12, 22, -2.1F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 24, -1.0F, -0.75F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finL3 = new ModelRenderer(this);
        this.finL3.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body3.addChild(finL3);
        this.setRotateAngle(finL3, 0.2182F, 0.0F, 0.0F);
        this.finL3.cubeList.add(new ModelBox(finL3, 9, 22, -2.03F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 25, 24, -0.99F, -0.76F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finL4 = new ModelRenderer(this);
        this.finL4.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body4.addChild(finL4);
        this.setRotateAngle(finL4, 0.2182F, 0.0F, 0.0F);
        this.finL4.cubeList.add(new ModelBox(finL4, 22, 4, -2.1F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.1309F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 23, 21, -1.0F, -0.75F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finL5 = new ModelRenderer(this);
        this.finL5.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body5.addChild(finL5);
        this.setRotateAngle(finL5, 0.2182F, 0.0F, 0.0F);
        this.finL5.cubeList.add(new ModelBox(finL5, 22, 0, -2.03F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, -0.1745F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 22, 25, -0.99F, -0.76F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finL6 = new ModelRenderer(this);
        this.finL6.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body6.addChild(finL6);
        this.setRotateAngle(finL6, 0.2182F, 0.0F, 0.0F);
        this.finL6.cubeList.add(new ModelBox(finL6, 17, 21, -2.1F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body7 = new ModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, -0.1309F, 0.0F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 23, 8, -1.0F, -0.75F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finL7 = new ModelRenderer(this);
        this.finL7.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body7.addChild(finL7);
        this.setRotateAngle(finL7, 0.2182F, 0.0F, 0.0F);
        this.finL7.cubeList.add(new ModelBox(finL7, 20, 20, -2.03F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body8 = new ModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body7.addChild(body8);
        this.setRotateAngle(body8, -0.1745F, 0.0F, 0.0F);
        this.body8.cubeList.add(new ModelBox(body8, 25, 17, -0.99F, -0.76F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finL8 = new ModelRenderer(this);
        this.finL8.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body8.addChild(finL8);
        this.setRotateAngle(finL8, 0.2182F, 0.0F, 0.0F);
        this.finL8.cubeList.add(new ModelBox(finL8, 20, 8, -2.1F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body9 = new ModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body8.addChild(body9);
        this.setRotateAngle(body9, -0.1309F, 0.0F, 0.0F);
        this.body9.cubeList.add(new ModelBox(body9, 4, 23, -1.0F, -0.75F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finL9 = new ModelRenderer(this);
        this.finL9.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body9.addChild(finL9);
        this.setRotateAngle(finL9, 0.2182F, 0.0F, 0.0F);
        this.finL9.cubeList.add(new ModelBox(finL9, 18, 17, -2.03F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body10 = new ModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body9.addChild(body10);
        this.setRotateAngle(body10, -0.0873F, 0.0F, 0.0F);
        this.body10.cubeList.add(new ModelBox(body10, 7, 25, -0.99F, -0.76F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finL10 = new ModelRenderer(this);
        this.finL10.setRotationPoint(1.0F, 0.75F, 0.25F);
        this.body10.addChild(finL10);
        this.setRotateAngle(finL10, 0.2182F, 0.0F, 0.0F);
        this.finL10.cubeList.add(new ModelBox(finL10, 0, 0, -2.1F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.body11 = new ModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 25, 0, -1.0F, -0.75F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR11 = new ModelRenderer(this);
        this.finR11.setRotationPoint(-1.1F, 0.15F, 0.0F);
        this.body11.addChild(finR11);
        this.setRotateAngle(finR11, 0.6981F, 0.0F, 0.0F);
        this.finR11.cubeList.add(new ModelBox(finR11, 10, 0, 0.0F, -0.5F, 0.0F, 0, 3, 1, 0.0F, false));

        this.finL11 = new ModelRenderer(this);
        this.finL11.setRotationPoint(-0.9F, 0.15F, 0.0F);
        this.body11.addChild(finL11);
        this.setRotateAngle(finL11, 0.7854F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.3F, 0.5F);
        this.finL11.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 17, 0.04F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.body12 = new ModelRenderer(this);
        this.body12.setRotationPoint(-0.5F, 0.0F, 1.0F);
        this.body11.addChild(body12);
        this.body12.cubeList.add(new ModelBox(body12, 15, 0, -0.49F, -0.51F, 0.0F, 0, 1, 1, 0.0F, false));

        this.finR12 = new ModelRenderer(this);
        this.finR12.setRotationPoint(-0.5F, 0.15F, 0.0F);
        this.body12.addChild(finR12);
        this.setRotateAngle(finR12, 0.8727F, 0.0F, 0.0F);
        this.finR12.cubeList.add(new ModelBox(finR12, 19, 24, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finL12 = new ModelRenderer(this);
        this.finL12.setRotationPoint(-0.4F, 0.15F, 0.0F);
        this.body12.addChild(finL12);
        this.setRotateAngle(finL12, 1.3526F, 0.0F, 0.0F);
        this.finL12.cubeList.add(new ModelBox(finL12, 15, 24, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.25F, 1.0F);
        this.body12.addChild(tail);
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 5, 0, -0.5F, 0.05F, -0.5F, 0, 0, 2, 0.0F, false));

        this.eye = new ModelRenderer(this);
        this.eye.setRotationPoint(0.25F, -0.75F, -7.0F);
        this.bones.addChild(eye);
        this.setRotateAngle(eye, 0.3491F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 10, 17, -1.1F, -2.1F, -2.0F, 0, 2, 2, 0.0F, false));

        this.carapace = new ModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, 0.6F, -8.2F);
        this.bones.addChild(carapace);
        this.setRotateAngle(carapace, 0.2182F, 0.0F, 0.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 0, -0.7F, -4.0F, 0.25F, 0, 2, 14, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 56, 31, -0.65F, -2.05F, 1.25F, 0, 2, 13, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 53, 56, -0.6F, -0.1F, 1.25F, 0, 1, 12, 0.0F, false));

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
