package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCallawayiaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer main;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer backleftflipper;
    private final ModelRenderer backrightflipper;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail6;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer upperbody;
    private final ModelRenderer cube_r8;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer frontleftflipper;
    private final ModelRenderer frontrightflipper;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r14;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonCallawayiaFrame() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -4.0F, 6.0F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.0F, 0.0F, 0.0873F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.1678F, 0.8871F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.5708F, -0.0349F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 48, -1.0F, -0.5F, -3.0F, 1, 1, 6, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.8309F, 0.9569F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.5359F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 51, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.1F, -0.1F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0349F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 50, -0.5F, 0.7F, 0.0F, 1, 1, 4, -0.15F, false));

        this.backleftflipper = new ModelRenderer(this);
        this.backleftflipper.setRotationPoint(3.5F, 1.4F, 0.8F);
        this.main.addChild(backleftflipper);
        this.setRotateAngle(backleftflipper, 0.0F, -0.4363F, 0.829F);


        this.backrightflipper = new ModelRenderer(this);
        this.backrightflipper.setRotationPoint(-3.5F, 1.4F, 0.8F);
        this.main.addChild(backrightflipper);
        this.setRotateAngle(backrightflipper, 0.0F, 0.4363F, -0.829F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.4F, 3.7F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.1309F, -0.1309F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 30, 28, -0.5F, 0.1F, -0.3F, 1, 1, 7, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.3F, 5.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, -0.1745F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 36, 39, -0.5F, 0.4F, 0.2F, 1, 1, 6, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1745F, -0.2618F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 8, 29, -0.5F, 0.4F, -0.4F, 1, 1, 7, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.1F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, -0.2182F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 44, -0.5F, 0.4F, -0.1F, 1, 1, 5, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 4.8F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0177F, -0.1745F, 0.0031F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.2F, -0.5F);
        this.tail5.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 26, -0.5F, 1.6F, 0.3F, 1, 1, 4, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.3F, 3.9F);
        this.tail5.addChild(tail6);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 7.0F, 5.2F);
        this.tail6.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.7156F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 43, -1.0F, -0.5244F, -0.6972F, 1, 1, 5, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 1.6F, 2.1F);
        this.tail6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.0123F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 38, -1.0F, -0.0918F, -0.075F, 1, 1, 6, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.6F, 2.1F);
        this.tail6.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5061F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 56, 38, -0.5F, -0.1079F, -2.7848F, 1, 1, 3, -0.15F, false));

        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -2.8F, -0.1F);
        this.main.addChild(upperbody);
        this.setRotateAngle(upperbody, 0.1233F, -0.0869F, 0.0876F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.9F, -9.9F);
        this.upperbody.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1571F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 16, -0.5F, 0.7F, 0.4F, 1, 1, 10, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.4F, -9.9F);
        this.upperbody.addChild(chest);
        this.setRotateAngle(chest, 0.0398F, -0.0872F, 0.0438F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.851F, -10.343F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.5708F, 0.2443F, -1.5708F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 42, -1.5F, -0.5F, -5.0F, 1, 1, 10, -0.15F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.2312F, -10.9962F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.8151F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 56, 48, -0.5F, -0.5F, -3.7F, 1, 1, 4, -0.16F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.4F, -12.5F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2443F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 58, 50, -0.5F, -0.3F, 0.0F, 1, 1, 3, -0.15F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -0.8F, -5.9F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, -1, 27, 0.0F, 0.7135F, -0.2537F, 1, 1, 7, -0.15F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.7F, -9.8F);
        this.chest.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1222F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 47, 0.0F, -0.3F, -0.1F, 1, 1, 4, -0.15F, false));

        this.frontleftflipper = new ModelRenderer(this);
        this.frontleftflipper.setRotationPoint(4.9F, 4.9F, -9.7F);
        this.chest.addChild(frontleftflipper);
        this.setRotateAngle(frontleftflipper, -0.0539F, -0.518F, 0.7635F);


        this.frontrightflipper = new ModelRenderer(this);
        this.frontrightflipper.setRotationPoint(-4.9F, 4.9F, -9.7F);
        this.chest.addChild(frontrightflipper);
        this.setRotateAngle(frontrightflipper, 0.0339F, 0.0916F, -0.7802F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.8F, -12.5F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.0318F, 0.0839F, -0.0949F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.4F, -2.4F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3316F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 43, 58, -0.5F, 0.7F, -0.5F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.1F, -2.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0F, 0.5672F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3043F, -0.0188F, 0.0127F);

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
