package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonRhinopteraspis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer root;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer head;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer wing;
    private final ModelRenderer cube_r12;
    private final ModelRenderer wing2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer nose;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer horn;
    private final ModelRenderer cube_r17;

    public ModelSkeletonRhinopteraspis() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-2.0F, 24.0F, -3.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(4.5F, -4.5F, -1.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 45, 33, -2.5F, 2.5F, 4.0F, 15, 2, 10, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 45, 46, -11.5F, -7.5F, 4.0F, 9, 12, 10, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 33, -11.5F, -9.5F, -6.0F, 12, 14, 10, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -5.5F, -4.5F, -5.0F, 18, 9, 10, 0.004F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.5F, -5.4F, 5.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.143F, -0.2201F, 0.5831F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 72, 0, 7.2932F, -3.5F, -4.7627F, 5, 3, 10, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 69, 7.2932F, -5.5F, -4.7627F, 8, 2, 10, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 58, -0.7068F, -5.5F, -4.7627F, 8, 7, 10, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 20, -0.7068F, -7.5F, -4.7627F, 18, 2, 10, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(-14.0F, -4.6F, -4.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.0F, 0.3491F, 0.8727F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -17.2F, 1.75F);
        this.root.addChild(tail);
        this.setRotateAngle(tail, 0.0F, 0.3491F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 86, 27, -2.0F, -2.5F, 0.5F, 4, 5, 5, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 5.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0077F, 0.1744F, -0.0443F);
        this.tail2.cubeList.add(new ModelBox(tail2, 84, 55, -1.5F, -2.0F, -1.0F, 3, 4, 6, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.25F, 5.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.15F, 0.298F, -0.2284F);
        this.tail3.cubeList.add(new ModelBox(tail3, 27, 58, -1.0F, -1.5F, -1.0F, 2, 3, 5, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.134F, 3.6827F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1188F, 0.2201F, -0.5831F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, -0.216F, 4.5173F);
        this.tail4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0567F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 67, 69, 1.5F, 0.225F, -2.0F, 1, 2, 4, -0.01F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, -0.216F, 4.5173F);
        this.tail4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 33, 1.5F, -1.625F, -5.0F, 1, 2, 7, 0.001F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.8829F, 4.4647F);
        this.tail4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 83, -0.5F, -1.0F, -5.0F, 1, 2, 10, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-2.0F, -15.7F, -1.75F);
        this.root.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 19, 82, -0.5F, -0.5F, -4.0F, 5, 2, 8, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 47, 6, -0.5F, -3.556F, -9.6396F, 5, 2, 14, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 67, 69, -0.5F, -1.556F, -6.6396F, 5, 2, 11, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 89, 0.0F, -4.731F, -11.9896F, 4, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 85, 83, 0.0F, -4.731F, -10.3396F, 4, 2, 5, 0.001F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -5.4219F, 1.6349F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 64, 0, 0.0F, 0.975F, 0.0F, 4, 2, 3, 0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -5.356F, -5.3396F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 57, 23, 0.0F, 0.6091F, -0.0255F, 4, 2, 7, 0.002F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -3.1703F, -6.4804F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0438F, -0.0872F, 0.0038F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 75, 14, -0.45F, -0.5F, -5.5F, 2, 1, 11, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(4.5F, -3.1703F, -6.4804F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0438F, 0.0872F, -0.0038F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 76, -1.55F, -0.5F, -5.5F, 2, 1, 11, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.55F, -9.65F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7418F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 72, 14, 0.0F, -2.006F, -3.9896F, 4, 2, 2, -0.001F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 66, 86, -0.5F, -2.006F, -1.9896F, 5, 2, 2, 0.001F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.5F, -4.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 74, 46, -0.5F, -2.0F, -6.0F, 5, 2, 6, 0.002F, false));

        this.wing = new ModelRenderer(this);
        this.wing.setRotationPoint(-1.5F, -3.8327F, -1.4457F);
        this.head.addChild(wing);
        this.wing.cubeList.add(new ModelBox(wing, 47, 23, 3.875F, 0.4F, 1.2F, 6, 1, 2, 0.001F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.wing.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.4363F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 86, -1.125F, 0.4F, -0.95F, 6, 1, 2, 0.0F, false));

        this.wing2 = new ModelRenderer(this);
        this.wing2.setRotationPoint(5.5F, -3.8327F, -1.4457F);
        this.head.addChild(wing2);
        this.wing2.cubeList.add(new ModelBox(wing2, 47, 0, -9.875F, 0.4F, 1.2F, 6, 1, 2, 0.001F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.wing2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.4363F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 86, 38, -4.875F, 0.4F, -0.95F, 6, 1, 2, 0.0F, false));

        this.nose = new ModelRenderer(this);
        this.nose.setRotationPoint(3.0F, -0.55F, -9.65F);
        this.head.addChild(nose);
        this.nose.cubeList.add(new ModelBox(nose, 16, 76, -2.0F, -4.0F, -5.0F, 2, 1, 3, 0.0F, false));
        this.nose.cubeList.add(new ModelBox(nose, 72, 83, -1.5F, -4.0F, -15.0F, 1, 1, 10, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -3.5F, -3.5F);
        this.nose.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 76, -1.5F, -0.275F, -1.5F, 2, 1, 3, -0.001F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.5F, -3.5F, -3.0F);
        this.nose.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0016F, -0.3052F, 0.0118F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, 0.025F, -0.5F, -2.05F, 1, 1, 3, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -3.5F, -3.0F);
        this.nose.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0016F, 0.3052F, -0.0118F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 5, -1.025F, -0.5F, -2.05F, 1, 1, 3, 0.0F, false));

        this.horn = new ModelRenderer(this);
        this.horn.setRotationPoint(3.0F, -4.4219F, 0.6349F);
        this.head.addChild(horn);
        this.setRotateAngle(horn, 0.2182F, 0.0F, 0.0F);
        this.horn.cubeList.add(new ModelBox(horn, 47, 4, -2.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 0.0F, 4.0F);
        this.horn.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0916F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 49, 69, -0.5F, 0.0F, 0.0F, 1, 1, 15, 0.0F, false));

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
