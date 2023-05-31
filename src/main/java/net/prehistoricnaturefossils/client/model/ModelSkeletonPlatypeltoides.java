package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPlatypeltoides extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Asaphellus;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer Thorax1;
    private final ModelRenderer Thorax2;
    private final ModelRenderer Thorax3;
    private final ModelRenderer Pygidium;
    private final ModelRenderer Asaphellus2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer Thorax4;
    private final ModelRenderer Thorax5;
    private final ModelRenderer Thorax6;
    private final ModelRenderer Pygidium2;

    public ModelSkeletonPlatypeltoides() {
        this.textureWidth = 160;
        this.textureHeight = 120;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -18.0F, -4.2F, -6.9F, 36, 4, 21, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 68, 37, -18.0F, -3.2F, 14.1F, 33, 3, 6, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-7.3F, -1.7F, -13.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 2.1031F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 26, -20.8119F, -0.5F, -24.661F, 21, 2, 25, -0.005F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(17.7F, -1.7F, -10.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.4748F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 62, 60, -16.8191F, -1.5F, -24.776F, 17, 3, 25, -0.007F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(20.5F, -1.7F, 2.1F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.48F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 54, -13.3F, -2.5F, -12.6F, 17, 4, 26, -0.005F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(3.1176F, -5.2F, 9.587F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2269F, 0.288F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 68, 26, -14.6248F, -0.2F, -0.8906F, 28, 4, 6, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(4.0F, -4.5F, 7.1F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.3054F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -4.7F, -1.1F, -4.3F, 6, 2, 4, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 92, -7.7F, -1.0F, -2.4F, 11, 2, 4, 0.0F, false));

        this.Asaphellus = new ModelRenderer(this);
        this.Asaphellus.setRotationPoint(0.0F, -4.5F, -2.0F);
        this.fossil.addChild(Asaphellus);
        this.Asaphellus.cubeList.add(new ModelBox(Asaphellus, 80, 104, -1.0F, -0.4F, -4.0F, 2, 1, 3, 0.0F, false));
        this.Asaphellus.cubeList.add(new ModelBox(Asaphellus, 62, 89, 5.974F, 0.15F, -0.2254F, 12, 0, 6, -0.01F, false));
        this.Asaphellus.cubeList.add(new ModelBox(Asaphellus, 87, 48, -17.974F, 0.15F, -0.2254F, 12, 0, 6, -0.01F, false));
        this.Asaphellus.cubeList.add(new ModelBox(Asaphellus, 0, 74, -2.0F, -1.15F, -2.0F, 4, 1, 4, 0.0F, false));
        this.Asaphellus.cubeList.add(new ModelBox(Asaphellus, 0, 43, -4.0F, -0.75F, -1.0F, 8, 1, 3, 0.0F, false));
        this.Asaphellus.cubeList.add(new ModelBox(Asaphellus, 57, 104, -2.5F, -0.4F, -2.8F, 5, 1, 1, -0.02F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.6F, -4.0F);
        this.Asaphellus.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.6109F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 61, 62, -8.0F, -1.0F, 0.0F, 8, 1, 2, -0.01F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.35F, -3.75F);
        this.Asaphellus.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 83, 99, -1.0F, -0.85F, -0.425F, 3, 1, 3, -0.02F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(2.5F, -0.35F, -1.3F);
        this.Asaphellus.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.829F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 64, -0.75F, -0.5F, -0.75F, 1, 1, 2, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.5F, -0.35F, -1.3F);
        this.Asaphellus.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.829F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 68, -0.25F, -0.5F, -0.75F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 0.6F, -4.0F);
        this.Asaphellus.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.6109F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 70, 0.0F, -1.0F, 0.0F, 8, 1, 2, -0.01F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.6F, 4.0F);
        this.Asaphellus.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.3054F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 29, 97, -5.35F, -1.0F, -5.0F, 5, 1, 2, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.6F, 4.0F);
        this.Asaphellus.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.3054F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 42, 99, 0.35F, -1.0F, -5.0F, 5, 1, 2, 0.0F, false));

        this.Thorax1 = new ModelRenderer(this);
        this.Thorax1.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.Asaphellus.addChild(Thorax1);
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 94, 12, -5.5F, -0.5F, -0.05F, 11, 1, 2, -0.01F, false));
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 39, 103, -2.0F, -1.0F, -0.05F, 4, 1, 2, -0.01F, false));
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 68, 47, -4.0F, -0.75F, -0.05F, 8, 1, 2, -0.01F, false));

        this.Thorax2 = new ModelRenderer(this);
        this.Thorax2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax1.addChild(Thorax2);
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 13, 103, -2.0F, -1.0F, -0.1F, 4, 1, 2, -0.02F, false));
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 61, 66, -4.0F, -0.75F, -0.1F, 8, 1, 2, -0.02F, false));
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 94, 4, -5.5F, -0.5F, -0.1F, 11, 1, 2, -0.02F, false));

        this.Thorax3 = new ModelRenderer(this);
        this.Thorax3.setRotationPoint(0.0F, 0.0F, 1.85F);
        this.Thorax2.addChild(Thorax3);
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 94, 0, -5.5F, -0.5F, 0.0F, 11, 1, 2, -0.03F, false));
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 0, 62, -4.0F, -0.75F, 0.0F, 8, 1, 2, -0.03F, false));
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 28, 101, -2.0F, -1.0F, 0.0F, 4, 1, 2, -0.03F, false));

        this.Pygidium = new ModelRenderer(this);
        this.Pygidium.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax3.addChild(Pygidium);
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 91, 106, -1.5F, -1.0F, 0.9F, 3, 1, 2, -0.05F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 94, 8, -5.5F, -0.5F, -0.1F, 11, 1, 2, -0.04F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 61, 70, -4.5F, -0.5F, 1.825F, 9, 1, 1, -0.04F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 90, 96, -3.5F, -0.75F, 1.65F, 7, 1, 1, -0.05F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 0, 66, -4.0F, -0.75F, -0.1F, 8, 1, 2, -0.04F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 0, 103, -2.0F, -1.0F, -0.1F, 4, 1, 2, -0.04F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 56, 96, -3.0F, -0.5F, 1.65F, 6, 1, 2, -0.05F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 102, 106, -1.0F, -0.5F, 3.15F, 2, 1, 1, -0.06F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 70, 104, -2.5F, -0.75F, 2.4F, 5, 1, 1, -0.06F, false));

        this.Asaphellus2 = new ModelRenderer(this);
        this.Asaphellus2.setRotationPoint(4.0F, -4.3F, 15.0F);
        this.fossil.addChild(Asaphellus2);
        this.setRotateAngle(Asaphellus2, -2.8974F, -0.2709F, -3.1389F);
        this.Asaphellus2.cubeList.add(new ModelBox(Asaphellus2, 49, 104, -1.0F, -0.4F, -4.0F, 2, 1, 3, 0.0F, false));
        this.Asaphellus2.cubeList.add(new ModelBox(Asaphellus2, 61, 73, -2.0F, -1.15F, -2.0F, 4, 1, 4, 0.0F, false));
        this.Asaphellus2.cubeList.add(new ModelBox(Asaphellus2, 0, 38, -4.0F, -0.75F, -1.0F, 8, 1, 3, 0.0F, false));
        this.Asaphellus2.cubeList.add(new ModelBox(Asaphellus2, 95, 103, -2.5F, -0.4F, -2.8F, 5, 1, 1, -0.02F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 0.6F, -4.0F);
        this.Asaphellus2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.6109F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 58, -8.0F, -1.0F, 0.0F, 8, 1, 2, -0.01F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.35F, -3.75F);
        this.Asaphellus2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3927F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 70, 99, -1.0F, -0.85F, -0.425F, 3, 1, 3, -0.02F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(2.5F, -0.35F, -1.3F);
        this.Asaphellus2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.829F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 56, -0.75F, -0.5F, -0.75F, 1, 1, 2, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.5F, -0.35F, -1.3F);
        this.Asaphellus2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.829F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 19, 60, -0.25F, -0.5F, -0.75F, 1, 1, 2, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-5.974F, 0.15F, 1.7746F);
        this.Asaphellus2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.2618F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 85, -7.0F, 0.0F, -2.0F, 12, 0, 6, -0.01F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(15.0F, 0.625F, 3.0F);
        this.Asaphellus2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.2618F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 31, 86, -14.026F, -0.475F, -1.2254F, 12, 0, 6, -0.01F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, 0.6F, -4.0F);
        this.Asaphellus2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.6109F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 61, 58, 0.0F, -1.0F, 0.0F, 8, 1, 2, -0.01F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.6F, 4.0F);
        this.Asaphellus2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.3054F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 99, -5.35F, -1.0F, -5.0F, 5, 1, 2, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.6F, 4.0F);
        this.Asaphellus2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.3054F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 15, 99, 0.35F, -1.0F, -5.0F, 5, 1, 2, 0.0F, false));

        this.Thorax4 = new ModelRenderer(this);
        this.Thorax4.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.Asaphellus2.addChild(Thorax4);
        this.Thorax4.cubeList.add(new ModelBox(Thorax4, 93, 89, -5.5F, -0.5F, -0.05F, 11, 1, 2, -0.01F, false));
        this.Thorax4.cubeList.add(new ModelBox(Thorax4, 57, 100, -2.0F, -1.0F, -0.05F, 4, 1, 2, -0.01F, false));
        this.Thorax4.cubeList.add(new ModelBox(Thorax4, 0, 54, -4.0F, -0.75F, -0.05F, 8, 1, 2, -0.01F, false));

        this.Thorax5 = new ModelRenderer(this);
        this.Thorax5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax4.addChild(Thorax5);
        this.setRotateAngle(Thorax5, -0.0873F, 0.0F, 0.0F);
        this.Thorax5.cubeList.add(new ModelBox(Thorax5, 96, 99, -2.0F, -1.0F, -0.1F, 4, 1, 2, -0.02F, false));
        this.Thorax5.cubeList.add(new ModelBox(Thorax5, 0, 15, -4.0F, -0.75F, -0.1F, 8, 1, 2, -0.02F, false));
        this.Thorax5.cubeList.add(new ModelBox(Thorax5, 31, 93, -5.5F, -0.5F, -0.1F, 11, 1, 2, -0.02F, false));

        this.Thorax6 = new ModelRenderer(this);
        this.Thorax6.setRotationPoint(0.0F, 0.0F, 1.85F);
        this.Thorax5.addChild(Thorax6);
        this.setRotateAngle(Thorax6, -0.0436F, 0.0F, 0.0F);
        this.Thorax6.cubeList.add(new ModelBox(Thorax6, 86, 56, -5.5F, -0.5F, 0.0F, 11, 1, 2, -0.03F, false));
        this.Thorax6.cubeList.add(new ModelBox(Thorax6, 0, 11, -4.0F, -0.75F, 0.0F, 8, 1, 2, -0.03F, false));
        this.Thorax6.cubeList.add(new ModelBox(Thorax6, 74, 73, -2.0F, -1.0F, 0.0F, 4, 1, 2, -0.03F, false));

        this.Pygidium2 = new ModelRenderer(this);
        this.Pygidium2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax6.addChild(Pygidium2);
        this.setRotateAngle(Pygidium2, -0.0873F, 0.0F, 0.0F);
        this.Pygidium2.cubeList.add(new ModelBox(Pygidium2, 24, 105, -1.5F, -1.0F, 0.9F, 3, 1, 2, -0.05F, false));
        this.Pygidium2.cubeList.add(new ModelBox(Pygidium2, 61, 54, -5.5F, -0.5F, -0.1F, 11, 1, 2, -0.04F, false));
        this.Pygidium2.cubeList.add(new ModelBox(Pygidium2, 0, 48, -4.5F, -0.5F, 1.825F, 9, 1, 1, -0.04F, false));
        this.Pygidium2.cubeList.add(new ModelBox(Pygidium2, 73, 96, -3.5F, -0.75F, 1.65F, 7, 1, 1, -0.05F, false));
        this.Pygidium2.cubeList.add(new ModelBox(Pygidium2, 0, 7, -4.0F, -0.75F, -0.1F, 8, 1, 2, -0.04F, false));
        this.Pygidium2.cubeList.add(new ModelBox(Pygidium2, 13, 74, -2.0F, -1.0F, -0.1F, 4, 1, 2, -0.04F, false));
        this.Pygidium2.cubeList.add(new ModelBox(Pygidium2, 94, 16, -3.0F, -0.5F, 1.65F, 6, 1, 2, -0.05F, false));
        this.Pygidium2.cubeList.add(new ModelBox(Pygidium2, 78, 77, -1.0F, -0.5F, 3.15F, 2, 1, 1, -0.06F, false));
        this.Pygidium2.cubeList.add(new ModelBox(Pygidium2, 99, 93, -2.5F, -0.75F, 2.4F, 5, 1, 1, -0.06F, false));

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
