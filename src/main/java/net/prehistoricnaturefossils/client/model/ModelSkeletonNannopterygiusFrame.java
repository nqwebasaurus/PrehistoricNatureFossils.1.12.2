package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonNannopterygiusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer main;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer frontleftflipper;
    private final ModelRenderer frontrightflipper;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r6;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer backleftflipper;
    private final ModelRenderer backrightflipper;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r11;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r12;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;

    public ModelSkeletonNannopterygiusFrame() {
        this.textureWidth = 73;
        this.textureHeight = 73;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -9.0F, -7.0F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, -0.0532F, -0.1264F, -0.264F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0349F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 27, -0.5F, 0.5F, 0.0F, 1, 2, 7, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.6F, -2.7F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0524F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 44, -0.5F, 0.4485F, -0.0497F, 1, 2, 3, 0.005F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.3079F, -5.65F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.5708F, -0.2443F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 17, 1.4F, -0.5F, -5.0F, 1, 1, 10, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.7F, -6.4F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.3265F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 22, -0.5F, -0.5F, 0.1F, 1, 1, 5, -0.16F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.7F, -6.4F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2443F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 39, 23, -0.5F, -0.5F, 0.1F, 1, 2, 4, 0.0F, false));

        this.frontleftflipper = new ModelRenderer(this);
        this.frontleftflipper.setRotationPoint(4.5F, 4.2F, -5.6F);
        this.main.addChild(frontleftflipper);
        this.setRotateAngle(frontleftflipper, 0.0F, -0.3054F, 0.6109F);


        this.frontrightflipper = new ModelRenderer(this);
        this.frontrightflipper.setRotationPoint(-4.5F, 4.2F, -5.6F);
        this.main.addChild(frontrightflipper);
        this.setRotateAngle(frontrightflipper, 0.0F, 0.2182F, -0.6109F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.7F, -6.6F);
        this.main.addChild(neck);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.4F, -1.4F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.48F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 33, -0.5F, 0.0F, -3.0F, 1, 1, 5, 0.005F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.7F, -3.6F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0F, -0.3054F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.3F, 0.4F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5498F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, 7.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0038F, 0.0435F, 0.0873F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.4F, 6.3F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.192F, -0.0171F, 0.0033F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 23, -0.6F, -1.2046F, -6.753F, 1, 2, 7, 0.005F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.2F, 7.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0873F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 9, -0.5F, 0.3F, -0.2F, 1, 2, 7, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 1.9F, 6.4F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, 0.1745F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 13, 19, -0.5F, 0.1F, -0.2F, 1, 2, 8, 0.005F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 6.1F, 0.3F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.5708F, 0.0F, 1.5708F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 19, -2.2F, -0.5F, -4.0F, 1, 1, 8, -0.15F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.1F, 3.8F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.5708F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 24, -0.5F, -4.0F, -3.7F, 1, 1, 3, -0.16F, false));

        this.backleftflipper = new ModelRenderer(this);
        this.backleftflipper.setRotationPoint(2.5F, 3.8F, 0.8F);
        this.body3.addChild(backleftflipper);
        this.setRotateAngle(backleftflipper, 0.0F, -0.5236F, 0.5672F);


        this.backrightflipper = new ModelRenderer(this);
        this.backrightflipper.setRotationPoint(-2.5F, 3.8F, 0.8F);
        this.body3.addChild(backrightflipper);
        this.setRotateAngle(backrightflipper, 0.0F, 0.1745F, -0.5672F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2F, 7.7F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.1072F, 0.217F, -0.0232F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.293F, 0.1742F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0698F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 16, -0.5F, 0.5F, -0.3F, 1, 2, 8, 0.004F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.793F, 7.8742F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0894F, 0.2173F, 0.0193F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.3996F, 0.0087F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0262F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 40, -0.5F, 0.6929F, -0.1351F, 1, 1, 5, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2004F, 4.8087F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.9132F, 0.1904F, -0.2403F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.3442F, 8.0927F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 31, -0.5F, 0.3F, -0.6F, 1, 1, 6, -0.15F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.3442F, -0.1073F);
        this.tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5672F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 46, -0.5F, 0.6F, -0.2F, 1, 1, 2, -0.15F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.4442F, 3.2927F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1658F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 39, -0.5F, 0.7052F, 0.144F, 1, 1, 5, -0.15F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.4442F, 1.3927F);
        this.tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0087F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 62, -0.5F, 0.7218F, 0.1439F, 1, 1, 2, -0.15F, false));

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
