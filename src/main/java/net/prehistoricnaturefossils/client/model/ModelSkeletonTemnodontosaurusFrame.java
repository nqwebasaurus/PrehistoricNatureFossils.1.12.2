package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTemnodontosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer main;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer backleftflipper;
    private final ModelRenderer backrightflipper;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r13;
    private final ModelRenderer head;
    private final ModelRenderer bone;
    private final ModelRenderer jaw;
    private final ModelRenderer frontleftflipper;
    private final ModelRenderer frontrightflipper;

    public ModelSkeletonTemnodontosaurusFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -11.0F, -2.0F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.0F, 0.0873F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.8486F, -1.2F, -8.9848F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 81, -1.5F, -0.5376F, -1.3149F, 2, 2, 9, -0.3F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.8486F, -1.1F, -1.9848F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1222F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 15, -1.5F, -0.0075F, 0.1219F, 2, 2, 14, -0.3F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.3486F, 0.1F, -15.9848F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 98, -6.0F, 7.5598F, -0.1736F, 12, 2, 2, -0.3F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 98, -1.0F, 0.2848F, -0.1736F, 2, 9, 2, -0.31F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.3486F, 0.1F, -15.9848F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.192F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 93, -1.0F, -0.7152F, -0.4736F, 2, 2, 7, -0.3F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.3486F, 0.3339F, 10.9555F);
        this.main.addChild(body);
        this.setRotateAngle(body, -0.0402F, -0.3047F, -0.0159F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.2161F, 0.0598F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0785F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 81, 46, -0.9151F, -0.0077F, 0.1232F, 2, 2, 9, -0.3F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.6375F, 8.8905F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0057F, -0.3918F, -0.0204F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.0157F, 7.3636F, 5.0131F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.0175F, -1.5708F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 75, 8, -1.0F, -4.0F, -1.0F, 2, 8, 2, -0.3F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.2786F, 0.0692F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0175F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 75, 8, -1.0157F, 0.9976F, 4.0668F, 2, 7, 2, -0.31F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 65, -2, -1.0157F, -0.0024F, -0.9332F, 2, 2, 12, -0.3F, false));

        this.backleftflipper = new ModelRenderer(this);
        this.backleftflipper.setRotationPoint(3.5F, 6.2786F, 4.6692F);
        this.body2.addChild(backleftflipper);
        this.setRotateAngle(backleftflipper, 0.48F, 0.0F, -0.48F);


        this.backrightflipper = new ModelRenderer(this);
        this.backrightflipper.setRotationPoint(-3.5F, 6.2786F, 4.6692F);
        this.body2.addChild(backrightflipper);
        this.setRotateAngle(backrightflipper, 0.3927F, 0.0F, 0.6981F);


        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.2628F, 10.277F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.1371F, -0.3475F, -0.0241F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.2157F, -0.2078F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0175F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 89, 18, -0.9206F, -0.0047F, 0.2056F, 2, 2, 7, -0.3F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.0026F, 6.8743F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.0445F, -0.218F, 0.0058F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.1183F, 0.0179F);
        this.body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 86, 5, -1.0311F, -0.0024F, -0.6625F, 2, 2, 8, -0.3F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3101F, 7.8951F);
        this.body4.addChild(tail);
        this.setRotateAngle(tail, -0.1799F, 0.2591F, -0.0312F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.1285F, 0.0228F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0175F, -0.0349F, -0.0006F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 87, -0.8531F, -0.0086F, -1.1807F, 2, 2, 9, -0.3F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(-0.75F, 0.0285F, 7.8728F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1213F, 0.3911F, -0.0312F);
        this.tail2.cubeList.add(new ModelBox(tail2, 37, 66, 0.1203F, 0.1185F, -0.5474F, 1, 1, 11, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.75F, -0.292F, 10.3365F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.3723F, 0.2867F, -0.1288F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 9.5378F, 2.5309F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5236F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 64, -0.6029F, 5.6817F, -0.6562F, 1, 6, 1, -0.2F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 65, 71, -0.6029F, -0.3183F, -0.6562F, 1, 7, 1, -0.2F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.8922F, -0.597F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3229F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 94, 94, -0.6029F, -0.441F, -0.5252F, 1, 10, 1, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.3486F, -0.5924F, -15.5824F);
        this.main.addChild(neck);
        this.setRotateAngle(neck, -0.0434F, 0.2688F, 0.0155F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.471F, -5.646F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 32, -0.9851F, 0.3982F, -0.43F, 2, 2, 6, -0.3F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.3125F, 2.0651F, -5.7222F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.059F, 0.5646F, 0.0457F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.3125F, -6.4727F, 13.3197F);
        this.head.addChild(bone);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.3125F, 2.534F, 0.2399F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.48F, 0.0F, 0.0F);


        this.frontleftflipper = new ModelRenderer(this);
        this.frontleftflipper.setRotationPoint(6.8486F, 8.0F, -14.4848F);
        this.main.addChild(frontleftflipper);
        this.setRotateAngle(frontleftflipper, 0.3695F, 0.3272F, -0.8797F);


        this.frontrightflipper = new ModelRenderer(this);
        this.frontrightflipper.setRotationPoint(-6.1514F, 8.0F, -14.4848F);
        this.main.addChild(frontrightflipper);
        this.setRotateAngle(frontrightflipper, 0.5131F, -0.3463F, 0.6837F);

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
