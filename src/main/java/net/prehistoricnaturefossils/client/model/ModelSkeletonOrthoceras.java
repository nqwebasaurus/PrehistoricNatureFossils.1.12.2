package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonOrthoceras extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer shellbase;
    private final ModelRenderer shellbasebottom;
    private final ModelRenderer shellbasetop;
    private final ModelRenderer shell1;
    private final ModelRenderer shell2;
    private final ModelRenderer shell3;
    private final ModelRenderer shell4;
    private final ModelRenderer shell5;
    private final ModelRenderer shell6;
    private final ModelRenderer shell7;
    private final ModelRenderer shell8;
    private final ModelRenderer shell9;
    private final ModelRenderer shell10;
    private final ModelRenderer shell11;
    private final ModelRenderer shelltip;
    private final ModelRenderer shell10top;
    private final ModelRenderer shell10bottom;
    private final ModelRenderer shell9top;
    private final ModelRenderer shell9bottom;
    private final ModelRenderer shell8top;
    private final ModelRenderer shell8bottom;
    private final ModelRenderer shell7top;
    private final ModelRenderer shell7bottom;
    private final ModelRenderer shell6top;
    private final ModelRenderer shell6bottom;
    private final ModelRenderer shell5top;
    private final ModelRenderer shell5bottom;
    private final ModelRenderer shell4top;
    private final ModelRenderer shell4bottom;
    private final ModelRenderer shell3top;
    private final ModelRenderer shell3bottom;
    private final ModelRenderer shell2top;
    private final ModelRenderer shell2bottom;
    private final ModelRenderer shell1top;
    private final ModelRenderer shell1bottom;

    public ModelSkeletonOrthoceras() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 102, 69, -7.0F, -6.0F, -72.0F, 14, 6, 9, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 73, 126, -5.0F, -5.0F, -76.0F, 10, 5, 4, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 87, 95, -7.0F, -6.0F, 32.0F, 14, 6, 9, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 126, 24, -5.0F, -5.0F, 41.0F, 10, 5, 4, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 51, 69, -8.0F, -7.0F, 18.0F, 16, 7, 18, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 59, 43, -10.0F, -7.0F, 0.0F, 20, 7, 18, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -12.0F, -7.0F, -27.0F, 24, 7, 27, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 35, -10.0F, -7.0F, -45.0F, 20, 7, 18, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 61, -8.0F, -7.0F, -63.0F, 16, 7, 18, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.shellbase = new ModelRenderer(this);
        this.shellbase.setRotationPoint(0.0F, 19.2F, 34.4F);
        this.root.addChild(shellbase);
        this.setRotateAngle(shellbase, -3.0718F, 0.0F, 3.1416F);
        this.shellbase.cubeList.add(new ModelBox(shellbase, 76, 0, -6.5F, -2.1018F, -0.1047F, 13, 6, 13, 0.0F, false));

        this.shellbasebottom = new ModelRenderer(this);
        this.shellbasebottom.setRotationPoint(0.0F, 5.5F, 10.0F);
        this.shellbase.addChild(shellbasebottom);


        this.shellbasetop = new ModelRenderer(this);
        this.shellbasetop.setRotationPoint(0.0F, -6.5F, 10.0F);
        this.shellbase.addChild(shellbasetop);
        this.shellbasetop.cubeList.add(new ModelBox(shellbasetop, 38, 95, -5.5F, 3.3982F, -10.1047F, 11, 1, 13, 0.0F, false));
        this.shellbasetop.cubeList.add(new ModelBox(shellbasetop, 0, 42, -0.5F, 3.0982F, -3.1047F, 1, 0, 6, 0.0F, false));

        this.shell1 = new ModelRenderer(this);
        this.shell1.setRotationPoint(0.0F, 0.4F, 12.6F);
        this.shellbase.addChild(shell1);
        this.setRotateAngle(shell1, -0.0698F, 0.0F, 0.0F);
        this.shell1.cubeList.add(new ModelBox(shell1, 0, 87, -6.0F, -2.1F, 0.0F, 12, 5, 13, 0.0F, false));

        this.shell2 = new ModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 0.2F, 13.0F);
        this.shell1.addChild(shell2);
        this.setRotateAngle(shell2, -0.0175F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 90, 22, -5.5F, -2.0003F, 0.0367F, 11, 4, 13, 0.0F, false));

        this.shell3 = new ModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, 0.0175F, 0.0F, 0.0F);


        this.shell4 = new ModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.4F, 11.0F);
        this.shell3.addChild(shell4);


        this.shell5 = new ModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.4F, 10.0F);
        this.shell4.addChild(shell5);


        this.shell6 = new ModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, -0.2F, 10.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, 0.0175F, 0.0F, 0.0F);


        this.shell7 = new ModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, -0.2F, 8.0F);
        this.shell6.addChild(shell7);


        this.shell8 = new ModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, -0.4F, 7.0F);
        this.shell7.addChild(shell8);


        this.shell9 = new ModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.shell8.addChild(shell9);
        this.setRotateAngle(shell9, -0.0349F, 0.0F, 0.0F);
        this.shell9.cubeList.add(new ModelBox(shell9, 43, 139, -2.0F, -1.0F, 0.0F, 4, 2, 7, 0.0F, false));

        this.shell10 = new ModelRenderer(this);
        this.shell10.setRotationPoint(0.0F, -0.4F, 7.0F);
        this.shell9.addChild(shell10);


        this.shell11 = new ModelRenderer(this);
        this.shell11.setRotationPoint(0.0F, 0.1F, 5.0F);
        this.shell10.addChild(shell11);
        this.shell11.cubeList.add(new ModelBox(shell11, 0, 0, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.shelltip = new ModelRenderer(this);
        this.shelltip.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.shell11.addChild(shelltip);
        this.shelltip.cubeList.add(new ModelBox(shelltip, 0, 12, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.shell10top = new ModelRenderer(this);
        this.shell10top.setRotationPoint(0.0F, -1.5F, 10.0F);
        this.shell10.addChild(shell10top);
        this.shell10top.cubeList.add(new ModelBox(shell10top, 59, 35, -1.0F, 0.5F, -10.0F, 2, 1, 5, 0.0F, false));

        this.shell10bottom = new ModelRenderer(this);
        this.shell10bottom.setRotationPoint(0.0F, 0.5F, 10.0F);
        this.shell10.addChild(shell10bottom);


        this.shell9top = new ModelRenderer(this);
        this.shell9top.setRotationPoint(0.0F, -2.0F, 10.0F);
        this.shell9.addChild(shell9top);
        this.shell9top.cubeList.add(new ModelBox(shell9top, 74, 95, -1.5F, 0.0F, -10.0F, 3, 1, 7, 0.0F, false));

        this.shell9bottom = new ModelRenderer(this);
        this.shell9bottom.setRotationPoint(0.0F, 1.0F, 10.0F);
        this.shell9.addChild(shell9bottom);


        this.shell8top = new ModelRenderer(this);
        this.shell8top.setRotationPoint(0.0F, -2.5F, 10.0F);
        this.shell8.addChild(shell8top);
        this.shell8top.cubeList.add(new ModelBox(shell8top, 66, 139, -2.0F, 0.4F, -10.0F, 4, 1, 7, 0.0F, false));

        this.shell8bottom = new ModelRenderer(this);
        this.shell8bottom.setRotationPoint(0.0F, 1.5F, 10.0F);
        this.shell8.addChild(shell8bottom);


        this.shell7top = new ModelRenderer(this);
        this.shell7top.setRotationPoint(0.0F, -3.0F, 10.0F);
        this.shell7.addChild(shell7top);
        this.shell7top.cubeList.add(new ModelBox(shell7top, 18, 139, -2.5F, 0.4F, -10.0F, 5, 1, 7, 0.0F, false));

        this.shell7bottom = new ModelRenderer(this);
        this.shell7bottom.setRotationPoint(0.0F, 2.0F, 10.0F);
        this.shell7.addChild(shell7bottom);


        this.shell6top = new ModelRenderer(this);
        this.shell6top.setRotationPoint(0.0F, -3.5F, 10.0F);
        this.shell6.addChild(shell6top);
        this.shell6top.cubeList.add(new ModelBox(shell6top, 94, 131, -3.0F, 0.4F, -10.0F, 6, 1, 8, 0.0F, false));
        this.shell6top.cubeList.add(new ModelBox(shell6top, 0, 6, -0.5F, 0.2F, -10.0F, 1, 0, 4, 0.0F, false));

        this.shell6bottom = new ModelRenderer(this);
        this.shell6bottom.setRotationPoint(0.0F, 2.5F, 10.0F);
        this.shell6.addChild(shell6bottom);


        this.shell5top = new ModelRenderer(this);
        this.shell5top.setRotationPoint(0.0F, -4.0F, 10.0F);
        this.shell5.addChild(shell5top);
        this.shell5top.cubeList.add(new ModelBox(shell5top, 124, 101, -3.5F, 0.4F, -10.0F, 7, 1, 10, 0.0F, false));
        this.shell5top.cubeList.add(new ModelBox(shell5top, 68, 110, -0.5F, 0.2F, -10.0F, 1, 0, 10, 0.0F, false));

        this.shell5bottom = new ModelRenderer(this);
        this.shell5bottom.setRotationPoint(0.0F, 3.0F, 10.0F);
        this.shell5.addChild(shell5bottom);


        this.shell4top = new ModelRenderer(this);
        this.shell4top.setRotationPoint(0.0F, -4.5F, 10.0F);
        this.shell4.addChild(shell4top);
        this.shell4top.cubeList.add(new ModelBox(shell4top, 0, 121, -4.0F, 1.3998F, -9.9825F, 8, 1, 10, 0.0F, false));
        this.shell4top.cubeList.add(new ModelBox(shell4top, 0, 133, -1.0F, 1.1998F, -9.9825F, 2, 0, 10, 0.0F, false));
        this.shell4top.cubeList.add(new ModelBox(shell4top, 82, 136, -0.5F, 0.9998F, -9.9825F, 1, 0, 9, 0.0F, false));

        this.shell4bottom = new ModelRenderer(this);
        this.shell4bottom.setRotationPoint(0.0F, 3.5F, 10.0F);
        this.shell4.addChild(shell4bottom);


        this.shell3top = new ModelRenderer(this);
        this.shell3top.setRotationPoint(0.0F, -5.0F, 10.0F);
        this.shell3.addChild(shell3top);
        this.shell3top.cubeList.add(new ModelBox(shell3top, 0, 0, -1.0F, 1.8997F, -9.9703F, 2, 0, 11, 0.0F, false));
        this.shell3top.cubeList.add(new ModelBox(shell3top, 0, 12, -0.5F, 1.6998F, -9.9668F, 1, 0, 11, 0.0F, false));
        this.shell3top.cubeList.add(new ModelBox(shell3top, 116, 0, -4.5F, 2.0997F, -9.9703F, 9, 1, 11, 0.0F, false));

        this.shell3bottom = new ModelRenderer(this);
        this.shell3bottom.setRotationPoint(0.0F, 4.0F, 10.0F);
        this.shell3.addChild(shell3bottom);


        this.shell2top = new ModelRenderer(this);
        this.shell2top.setRotationPoint(0.0F, -5.5F, 10.0F);
        this.shell2.addChild(shell2top);
        this.shell2top.cubeList.add(new ModelBox(shell2top, 0, 106, -5.0F, 2.4997F, -9.9633F, 10, 1, 13, 0.0F, false));
        this.shell2top.cubeList.add(new ModelBox(shell2top, 24, 125, -1.0F, 2.2997F, -9.9633F, 2, 0, 13, 0.0F, false));
        this.shell2top.cubeList.add(new ModelBox(shell2top, 125, 85, -0.5F, 2.0997F, -9.9599F, 1, 0, 13, 0.0F, false));

        this.shell2bottom = new ModelRenderer(this);
        this.shell2bottom.setRotationPoint(0.0F, 4.5F, 10.0F);
        this.shell2.addChild(shell2bottom);


        this.shell1top = new ModelRenderer(this);
        this.shell1top.setRotationPoint(0.0F, -6.0F, 10.0F);
        this.shell1.addChild(shell1top);
        this.shell1top.cubeList.add(new ModelBox(shell1top, 34, 110, -5.0F, 2.9F, -10.0F, 10, 1, 13, 0.0F, false));
        this.shell1top.cubeList.add(new ModelBox(shell1top, 55, 125, -1.0F, 2.8F, -10.0F, 2, 0, 13, 0.0F, false));
        this.shell1top.cubeList.add(new ModelBox(shell1top, 42, 125, -0.5F, 2.6001F, -7.993F, 1, 0, 11, 0.0F, false));

        this.shell1bottom = new ModelRenderer(this);
        this.shell1bottom.setRotationPoint(0.0F, 5.0F, 10.0F);
        this.shell1.addChild(shell1bottom);

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
