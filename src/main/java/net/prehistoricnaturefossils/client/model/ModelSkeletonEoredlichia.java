package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEoredlichia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer antennaL;
    private final ModelRenderer antennaL2;
    private final ModelRenderer body1;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer body4;
    private final ModelRenderer body5;
    private final ModelRenderer tail;

    public ModelSkeletonEoredlichia() {
        this.textureWidth = 96;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -12.0F, -2.0F, -14.0F, 22, 2, 22, 0.006F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(13.3265F, -1.0F, 5.0375F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.7243F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 25, -20.9734F, -1.0F, -14.7606F, 21, 2, 15, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(9.6265F, -1.0F, -14.0625F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.1833F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 43, -6.6262F, -1.0F, 0.3729F, 7, 2, 19, -0.001F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -2.2F, 3.0F);
        this.fossil.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -3.5F, 0.0F, -8.2F, 7, 0, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 13, -2.5F, 0.0F, -9.2F, 5, 0, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 12, 8, 3.35F, 0.01F, -8.25F, 1, 0, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 4, -3.0F, -0.05F, -8.02F, 6, 0, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 10, 12, -1.0F, -0.1F, -8.01F, 2, 0, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 12, 8, -4.35F, 0.01F, -8.25F, 1, 0, 3, 0.0F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.65F, 0.2F, -7.4F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.4835F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 11, -9.5F, -0.08F, -2.65F, 5, 0, 1, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.65F, 0.2F, -7.4F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.2217F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 28, -5.25F, -0.09F, -1.4F, 4, 0, 1, 0.0F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.65F, 0.2F, -7.15F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.7854F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 30, -1.7F, -0.1F, -1.0F, 2, 0, 2, 0.0F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.75F, -1.0F, -9.0F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.5236F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 35, -1.75F, 1.02F, -0.1F, 2, 0, 1, 0.0F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(3.65F, 0.2F, -7.4F);
        this.bone.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -1.4835F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 11, 4.5F, -0.08F, -2.65F, 5, 0, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(3.65F, 0.2F, -7.4F);
        this.bone.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -1.2217F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 28, 1.25F, -0.09F, -1.4F, 4, 0, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(3.65F, 0.2F, -7.15F);
        this.bone.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.7854F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 30, -0.3F, -0.1F, -1.0F, 2, 0, 2, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(2.75F, -1.0F, -9.0F);
        this.bone.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.5236F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 35, -0.25F, 1.02F, -0.1F, 2, 0, 1, 0.0F, false));

        this.antennaL = new ModelRenderer(this);
        this.antennaL.setRotationPoint(1.0F, 0.0F, -8.75F);
        this.bone.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, 0.2618F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 34, 50, 0.0F, 0.1F, -6.0F, 7, 0, 6, 0.0F, false));

        this.antennaL2 = new ModelRenderer(this);
        this.antennaL2.setRotationPoint(-1.0F, 0.0F, -8.75F);
        this.bone.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.0F, -0.6545F, 0.0F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 34, 43, -7.0F, 0.1F, -6.0F, 7, 0, 6, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.bone.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 9, 46, 2.0F, 0.6F, 0.25F, 2, 0, 1, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 9, 43, -1.0F, 0.35F, -0.01F, 2, 0, 2, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 25, 0.5F, 0.5F, 0.0F, 3, 0, 2, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 25, -3.5F, 0.5F, 0.0F, 3, 0, 2, 0.0F, true));
        this.body1.cubeList.add(new ModelBox(body1, 9, 46, -4.0F, 0.6F, 0.25F, 2, 0, 1, 0.0F, true));
        this.body1.cubeList.add(new ModelBox(body1, 9, 16, -1.5F, 0.49F, 0.0F, 3, 0, 2, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 15, -1.5F, 0.48F, 2.0F, 3, 0, 2, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 43, -0.99F, 0.349F, -0.01F, 2, 0, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 8, 38, 1.75F, 0.6F, 0.0F, 2, 0, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 9, 19, 0.25F, 0.49F, 0.0F, 3, 0, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 9, 19, -3.25F, 0.49F, 0.0F, 3, 0, 2, 0.0F, true));
        this.body2.cubeList.add(new ModelBox(body2, 8, 38, -3.75F, 0.6F, 0.0F, 2, 0, 1, 0.0F, true));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 18, 0.0F, 0.49F, 0.0F, 3, 0, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 8, 32, 1.5F, 0.6F, 0.0F, 2, 0, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 18, -3.0F, 0.49F, 0.0F, 3, 0, 2, 0.0F, true));
        this.body3.cubeList.add(new ModelBox(body3, 8, 32, -3.5F, 0.6F, 0.0F, 2, 0, 1, 0.0F, true));
        this.body3.cubeList.add(new ModelBox(body3, 0, 36, -1.0F, 0.35F, -0.01F, 2, 0, 2, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 7, 30, 1.25F, 0.6F, 0.0F, 2, 0, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 7, 30, -3.25F, 0.6F, 0.0F, 2, 0, 1, 0.0F, true));
        this.body4.cubeList.add(new ModelBox(body4, 0, 33, -0.99F, 0.349F, -0.01F, 2, 0, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 8, -2.49F, 0.49F, 0.0F, 5, 0, 2, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 46, -1.49F, 0.48F, 0.0F, 3, 0, 1, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.body4.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 51, 47, -0.5F, 1.09F, 0.0F, 1, 0, 10, 0.0F, false));

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
