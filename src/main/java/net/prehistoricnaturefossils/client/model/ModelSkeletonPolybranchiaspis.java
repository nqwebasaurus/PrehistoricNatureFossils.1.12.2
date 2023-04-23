package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPolybranchiaspis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Polybranchiaspis;
    private final ModelRenderer body;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer main;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Rightside;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Leftside;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer Polybranchiaspis2;
    private final ModelRenderer main2;
    private final ModelRenderer Rightside2;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer Leftside2;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;

    public ModelSkeletonPolybranchiaspis() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.153F, -0.5F, -1.2456F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.6109F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -15.0F, -0.5F, -12.6F, 21, 1, 23, -0.01F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-17.9945F, -0.5F, -1.1872F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1309F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 25, -0.1679F, -0.5F, -0.0568F, 28, 1, 14, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(10.2947F, -0.5F, 1.7051F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 41, -6.0F, -0.5F, -9.0F, 10, 1, 22, -0.015F, false));

        this.Polybranchiaspis = new ModelRenderer(this);
        this.Polybranchiaspis.setRotationPoint(-6.9F, 0.8F, 3.0F);
        this.fossil.addChild(Polybranchiaspis);
        this.setRotateAngle(Polybranchiaspis, 0.0F, 1.309F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1F, 1.7F);
        this.Polybranchiaspis.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 43, 53, -3.0F, -2.0F, 0.25F, 6, 2, 3, -0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 19, -3.0F, -1.0F, -0.65F, 6, 1, 1, -0.02F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 3.05F);
        this.body.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, -0.2618F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 62, 41, -2.0F, -1.75F, -0.3F, 4, 2, 4, -0.001F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 4, 0.0F, -2.75F, 0.7F, 0, 1, 2, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 3.8F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, -0.3054F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 65, -1.5F, -2.25F, -0.4F, 3, 2, 4, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 3, 2, 0.0F, -3.05F, 0.8F, 0, 1, 2, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 3.7F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, -0.5236F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 66, 5, -1.0F, -2.0F, -0.6F, 2, 2, 4, -0.001F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -2.8F, 0.4F, 0, 1, 2, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.05F, 3.4F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, -0.6545F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 25, 0.0F, -3.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(-0.2F, -0.1F, -5.2F);
        this.Polybranchiaspis.addChild(main);
        this.main.cubeList.add(new ModelBox(main, 55, 55, -2.0F, -2.0F, -3.25F, 4, 1, 10, 0.001F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -3.1F, 0.75F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.072F, 0.0F, 0.0054F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, -2.5F, 1.0155F, -0.8897F, 4, 1, 7, -0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, -2.5F, 0.0155F, 0.1103F, 4, 1, 7, -0.01F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -3.5F, 0.75F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2793F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 65, -2.5F, 0.4F, -4.0F, 4, 1, 4, -0.01F, false));

        this.Rightside = new ModelRenderer(this);
        this.Rightside.setRotationPoint(-5.7692F, -0.5F, 5.7825F);
        this.main.addChild(Rightside);
        this.Rightside.cubeList.add(new ModelBox(Rightside, 0, 50, 0.7692F, -1.5F, -6.5325F, 3, 1, 7, 0.002F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Rightside.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 2.2646F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 66, 12, -3.0287F, -0.5F, -0.1731F, 3, 1, 2, -0.001F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.2F, -1.0F, -2.0F);
        this.Rightside.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 1.7235F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 66, 16, -2.075F, -0.5F, -0.675F, 3, 1, 2, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.6629F, -1.5F, -6.4571F);
        this.Rightside.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.2654F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 59, -3.89F, 0.0F, -0.1012F, 4, 1, 2, 0.01F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(3.7692F, -1.5F, -9.0325F);
        this.Rightside.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.6501F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 66, 0, -4.0F, 0.0F, 0.0F, 4, 1, 3, -0.001F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(2.4692F, -1.739F, -6.963F);
        this.Rightside.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2813F, 0.0414F, -0.3203F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 10, 0.3482F, 0.2156F, -0.2715F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(3.7692F, -1.939F, -6.263F);
        this.Rightside.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.059F, 0.0345F, -0.1982F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -2.7185F, -0.1455F, -0.1916F, 3, 1, 8, 0.0F, false));

        this.Leftside = new ModelRenderer(this);
        this.Leftside.setRotationPoint(5.7692F, -0.5F, 5.7825F);
        this.main.addChild(Leftside);
        this.Leftside.cubeList.add(new ModelBox(Leftside, 0, 50, -3.7692F, -1.5F, -6.5325F, 3, 1, 7, 0.002F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Leftside.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -2.2646F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 66, 12, 0.0287F, -0.5F, -0.1731F, 3, 1, 2, -0.001F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.2F, -1.0F, -2.0F);
        this.Leftside.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -1.7235F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 66, 16, -0.925F, -0.5F, -0.675F, 3, 1, 2, 0.0F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.6629F, -1.5F, -6.4571F);
        this.Leftside.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -1.2654F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 59, -0.11F, 0.0F, -0.1012F, 4, 1, 2, 0.01F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.7692F, -1.5F, -9.0325F);
        this.Leftside.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.6501F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 66, 0, 0.0F, 0.0F, 0.0F, 4, 1, 3, -0.001F, true));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.4692F, -1.739F, -6.963F);
        this.Leftside.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2813F, -0.0414F, 0.3203F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 10, -1.3482F, 0.2156F, -0.2715F, 1, 1, 1, 0.0F, true));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.7692F, -1.939F, -6.263F);
        this.Leftside.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.059F, -0.0345F, 0.1982F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -0.2815F, -0.1455F, -0.1916F, 3, 1, 8, 0.0F, true));

        this.Polybranchiaspis2 = new ModelRenderer(this);
        this.Polybranchiaspis2.setRotationPoint(0.0F, -1.4F, -5.7F);
        this.fossil.addChild(Polybranchiaspis2);
        this.setRotateAngle(Polybranchiaspis2, -3.1416F, 0.0F, 0.0F);


        this.main2 = new ModelRenderer(this);
        this.main2.setRotationPoint(5.7F, 0.7F, -7.8F);
        this.Polybranchiaspis2.addChild(main2);
        this.main2.cubeList.add(new ModelBox(main2, 43, 41, -2.0F, -2.0F, -3.25F, 4, 1, 10, 0.001F, false));

        this.Rightside2 = new ModelRenderer(this);
        this.Rightside2.setRotationPoint(-5.7692F, -0.5F, 5.7825F);
        this.main2.addChild(Rightside2);
        this.Rightside2.cubeList.add(new ModelBox(Rightside2, 0, 41, 0.7692F, -1.5F, -6.5325F, 3, 1, 7, 0.002F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Rightside2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 2.2646F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 43, 59, -3.0287F, -0.5F, -0.1731F, 3, 1, 2, -0.001F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.2F, -1.0F, -2.0F);
        this.Rightside2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 1.7235F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 54, 59, -2.075F, -0.5F, -0.675F, 3, 1, 2, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.6629F, -1.5F, -6.4571F);
        this.Rightside2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 1.2654F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 35, -3.89F, 0.0F, -0.1012F, 4, 1, 2, 0.01F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(3.7692F, -1.5F, -9.0325F);
        this.Rightside2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.6501F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 32, 65, -4.0F, 0.0F, 0.0F, 4, 1, 3, -0.001F, false));

        this.Leftside2 = new ModelRenderer(this);
        this.Leftside2.setRotationPoint(5.7692F, -0.5F, 5.7825F);
        this.main2.addChild(Leftside2);
        this.Leftside2.cubeList.add(new ModelBox(Leftside2, 0, 41, -3.7692F, -1.5F, -6.5325F, 3, 1, 7, 0.002F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Leftside2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -2.2646F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 43, 59, 0.0287F, -0.5F, -0.1731F, 3, 1, 2, -0.001F, true));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.2F, -1.0F, -2.0F);
        this.Leftside2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -1.7235F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 54, 59, -0.925F, -0.5F, -0.675F, 3, 1, 2, 0.0F, true));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.6629F, -1.5F, -6.4571F);
        this.Leftside2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -1.2654F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 35, -0.11F, 0.0F, -0.1012F, 4, 1, 2, 0.01F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-3.7692F, -1.5F, -9.0325F);
        this.Leftside2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.6501F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 32, 65, 0.0F, 0.0F, 0.0F, 4, 1, 3, -0.001F, true));

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
