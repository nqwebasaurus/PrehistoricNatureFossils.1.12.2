package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonKaykay extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Kaykay;
    private final ModelRenderer Head;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Maxillary;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Maxillary2;
    private final ModelRenderer Jaw;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer rock;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;

    public ModelSkeletonKaykay() {
        this.textureWidth = 92;
        this.textureHeight = 78;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Kaykay = new ModelRenderer(this);
        this.Kaykay.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.fossil.addChild(Kaykay);


        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-4.5322F, -3.625F, 0.1401F);
        this.Kaykay.addChild(Head);
        this.setRotateAngle(Head, -0.3914F, 0.0334F, -1.4901F);
        this.Head.cubeList.add(new ModelBox(Head, 33, 0, -1.375F, -4.0277F, 0.9413F, 4, 9, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -1.375F, -3.0277F, 4.9413F, 4, 8, 7, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 16, -1.375F, -5.0277F, 4.9413F, 4, 2, 5, 0.002F, false));
        this.Head.cubeList.add(new ModelBox(Head, 41, 68, -1.375F, -1.0277F, -4.0587F, 3, 2, 3, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 71, -1.375F, -0.0277F, -6.9587F, 2, 1, 3, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 72, 11, 0.525F, 0.2723F, -6.9587F, 0, 1, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 36, 65, -1.275F, 0.2723F, -6.9587F, 0, 1, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 27, -1.875F, -3.0277F, -1.0587F, 4, 5, 2, 0.01F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.125F, 0.9723F, -4.0587F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 71, -1.4F, -0.7F, 0.2F, 0, 1, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 73, 0.4F, -0.7F, 0.2F, 0, 1, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 70, 61, -1.5F, -1.0F, 0.2F, 3, 1, 3, -0.002F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.375F, -4.9277F, 2.0413F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 55, 57, -1.5F, -0.0855F, 2.9894F, 4, 2, 4, -0.001F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 70, -1.5F, -0.0855F, -0.0106F, 3, 2, 3, -0.001F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.375F, -4.0277F, 0.2413F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5061F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 57, -1.5F, 0.0F, -6.0F, 3, 2, 8, 0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 14, -1.0F, 0.9F, -6.6F, 2, 1, 1, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 71, -1.0F, 0.0F, -8.9F, 2, 1, 3, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.375F, 5.5723F, 4.9413F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0611F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 44, -0.5F, -2.0F, 0.0F, 3, 2, 5, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.375F, 5.0723F, 0.9413F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1134F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 59, 64, -1.0F, -1.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.375F, -4.6277F, -4.0587F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3229F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 67, 70, -1.5F, 1.9993F, 2.9185F, 4, 2, 2, 0.03F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 14, -1.5F, 2.4993F, 3.4185F, 4, 1, 1, 0.04F, false));

        this.Maxillary = new ModelRenderer(this);
        this.Maxillary.setRotationPoint(1.125F, 0.9723F, -4.0587F);
        this.Head.addChild(Maxillary);
        this.setRotateAngle(Maxillary, -0.8811F, 0.1822F, 0.1081F);
        this.Maxillary.cubeList.add(new ModelBox(Maxillary, 28, 66, -0.4F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.Maxillary.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.1745F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, -3.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.Maxillary2 = new ModelRenderer(this);
        this.Maxillary2.setRotationPoint(-1.875F, 0.9723F, -4.0587F);
        this.Head.addChild(Maxillary2);
        this.setRotateAngle(Maxillary2, -0.7939F, -0.1822F, -0.1081F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(-0.375F, 1.9723F, 0.9413F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.2618F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 60, 7, -1.0F, 0.0F, -3.0F, 3, 2, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 71, 3, 1.1F, -0.6F, -3.0F, 0, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 54, 24, -0.8F, -0.6F, -6.0F, 0, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 44, -1.1F, -0.6F, -3.0F, 0, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 62, -1.0F, 0.0F, -6.0F, 2, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 16, 0, 0.8F, -0.6F, -6.0F, 0, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 40, 20, -1.0F, 1.0F, -4.0F, 2, 1, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.5F, -2.4F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2007F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 56, -0.5F, -2.0046F, 0.0231F, 2, 2, 3, -0.001F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.3F, -6.2F);
        this.Jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 35, -1.0F, -1.0028F, 0.008F, 2, 1, 4, -0.02F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.6F, -8.0F);
        this.Jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 20, -0.5F, -1.0449F, 0.0389F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 16, 0.7F, -0.6F, -1.9F, 0, 1, 2, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 14, 16, -1.0F, 0.0F, -1.9F, 2, 1, 2, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 20, -0.7F, -0.6F, -1.9F, 0, 1, 2, 0.0F, false));

        this.rock = new ModelRenderer(this);
        this.rock.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(rock);
        this.rock.cubeList.add(new ModelBox(rock, 0, 27, -10.0F, -2.0F, -5.0F, 18, 2, 14, 0.0F, false));
        this.rock.cubeList.add(new ModelBox(rock, 43, 44, -10.0F, -3.0F, 9.0F, 10, 3, 9, 0.02F, false));
        this.rock.cubeList.add(new ModelBox(rock, 21, 56, 0.0F, -2.0F, -10.0F, 8, 2, 5, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-5.25F, -1.25F, -8.0F);
        this.rock.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2618F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 60, 0, -1.75F, -1.0F, 1.0F, 3, 2, 4, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.rock.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.2182F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 51, 32, -15.0F, -2.0F, 0.0F, 15, 2, 5, 0.01F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 18.0F);
        this.rock.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.829F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 44, 0.0F, -2.0F, -9.0F, 12, 2, 9, 0.01F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rock.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.48F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 51, 20, -1.75F, -3.0F, 5.75F, 9, 1, 10, 0.1F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-6.4482F, -2.0F, 4.88F);
        this.rock.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.4363F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 56, -4.75F, -1.0F, -5.0F, 4, 2, 12, 0.01F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-13.5F, 0.0F, -2.0F);
        this.rock.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.1745F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 33, 0, -0.25F, -3.0F, 3.0F, 4, 1, 18, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -0.25F, -2.0F, -3.0F, 4, 2, 24, 0.001F, false));

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
