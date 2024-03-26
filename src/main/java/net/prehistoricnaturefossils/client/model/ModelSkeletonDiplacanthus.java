package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDiplacanthus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer main;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r14;
    private final ModelRenderer head;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r20;
    private final ModelRenderer backleftfin;
    private final ModelRenderer backrightfin;
    private final ModelRenderer frontleftfin;
    private final ModelRenderer cube_r21;
    private final ModelRenderer frontrightfin;

    public ModelSkeletonDiplacanthus() {
        this.textureWidth = 112;
        this.textureHeight = 45;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-0.5F, 24.0F, -1.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -14.0F, -2.0F, -13.0F, 29, 1, 27, 0.0F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(-0.2F, -2.5357F, -1.849F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.0F, 0.0F, -1.5708F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 3.2129F, -2.3135F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3622F, 0.0F, -3.1416F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 38, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.4F, 3.8763F, 0.3506F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, -3.1416F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 38, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.2F, -1.8627F, -0.8567F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4057F, -0.0069F, -0.016F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 29, -1.0001F, -10.9194F, -0.5443F, 1, 11, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -4.695F, 2.4888F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -2.7358F, 0.0F, -3.1416F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 29, 0.0F, -4.0F, -1.5F, 0, 8, 3, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.3F, -1.9399F, -0.0873F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, -3.1416F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 20, 0.0F, -0.5F, -2.5F, 0, 1, 5, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.2F, 1.1213F, -0.5713F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1527F, 0.0F, -3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 0, 0.0F, -3.0F, -2.5F, 0, 6, 5, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.3002F, 1.2081F);
        this.main.addChild(tail);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.2F, -2.1641F, 2.4258F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.9642F, -0.0143F, -0.0099F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 29, -1.0F, -8.9783F, -0.2532F, 1, 9, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -3.4073F, 6.4053F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -2.1773F, 0.0F, 3.1416F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 0, 0.0F, -4.0F, -0.5F, 0, 8, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.4F, -1.3941F, 2.63F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3578F, 0.0F, -3.1416F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 33, 36, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.3F, -0.1755F, 2.4823F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0218F, 0.0F, -3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 29, 0.0F, -1.5F, -2.5F, 0, 3, 5, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.3348F, 1.6777F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.48F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 3, -1.3F, 3.823F, 1.4529F, 1, 1, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -1.3F, -0.177F, 0.4529F, 1, 4, 1, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 4.0501F, 4.2517F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 2.6616F, 0.0F, -3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 12, 0.0F, -2.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 1.2572F, 2.0368F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.48F, 0.0F, 3.1416F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 15, 0.0F, -1.5F, -2.5F, 0, 3, 5, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3654F, 4.9145F);
        this.tail.addChild(tail2);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.4F, 0.0119F, 2.7082F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2182F, 0.0F, -3.1416F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 0.0F, -3.5F, -3.0F, 0, 7, 6, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.5357F, 0.149F);
        this.main.addChild(head);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.4F, 0.2519F, -6.5586F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.3614F, 0.0F, 3.1416F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 12, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.01F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -1.3295F, -5.6982F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.9905F, 0.0F, -3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 6, 20, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.4F, -0.3535F, -4.0023F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1353F, 0.0F, -3.1416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 23, 29, 0.0F, -1.5F, -2.0F, 0, 3, 4, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.325F, -1.4379F, -4.8012F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3098F, 0.0F, -3.1416F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 6, 20, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.4F, -2.5065F, -3.5097F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3883F, 0.0F, -3.1416F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 37, 29, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.001F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0916F, -4.0297F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3927F, 0.0F, 0.0F);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.4F, 0.3168F, -1.0541F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1963F, 0.0F, -3.1416F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 23, 37, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.backleftfin = new ModelRenderer(this);
        this.backleftfin.setRotationPoint(1.225F, 3.8177F, 0.745F);
        this.main.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, -0.2618F, 1.5708F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 11, 24, -0.1F, 1.7F, 0.3F, 4, 0, 2, 0.0F, false));
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 7, 0, -0.1F, 1.5F, -0.7F, 4, 1, 1, 0.0F, false));
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 0, 20, 3.9F, 1.5F, 0.3F, 1, 1, 1, 0.0F, false));

        this.backrightfin = new ModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.225F, 3.8177F, 0.745F);
        this.main.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, -1.5708F);


        this.frontleftfin = new ModelRenderer(this);
        this.frontleftfin.setRotationPoint(0.65F, 3.3847F, -2.0488F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.48F, 1.5708F);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.8F, 2.0F, 1.3F);
        this.frontleftfin.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.2182F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 19, 0, 10.5F, -1.2F, -2.0F, 1, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 17, 2.5F, -1.2F, -3.0F, 8, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 14, 2.5F, -1.0F, -2.0F, 8, 0, 2, 0.0F, false));

        this.frontrightfin = new ModelRenderer(this);
        this.frontrightfin.setRotationPoint(-0.75F, 2.0847F, -2.0488F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -1.5708F);

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
