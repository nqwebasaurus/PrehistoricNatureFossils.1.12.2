package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBothriolepis extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Body;
    private final ModelRenderer Shelltop2;
    private final ModelRenderer Shelltop3;
    private final ModelRenderer Shelltop1;
    private final ModelRenderer Head;
    private final ModelRenderer Gills;
    private final ModelRenderer Headfront;
    private final ModelRenderer Lowerjaw;
    private final ModelRenderer Leftpectoralfin1;
    private final ModelRenderer Leftpectoralfin2;
    private final ModelRenderer Rightpectoralfin1;
    private final ModelRenderer Rightpectoralfin2;

    public ModelSkeletonBothriolepis() {
        this.textureWidth = 90;
        this.textureHeight = 76;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 22.0F, 0.0F);


        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -4.5F, -5.0F, -8.0F, 9, 1, 14, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 32, 16, -4.5F, -4.0F, -8.0F, 9, 1, 9, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 16, -4.5F, 1.0F, -8.0F, 9, 1, 13, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 42, 28, -2.5F, 1.0F, 5.0F, 5, 1, 3, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 43, 4.5F, -3.0F, -8.0F, 1, 5, 12, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 39, 36, 4.5F, -5.0F, -8.0F, 1, 2, 13, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 39, 36, -5.5F, -5.0F, -8.0F, 1, 2, 13, 0.0F, true));
        this.Body.cubeList.add(new ModelBox(Body, 0, 43, -5.5F, -3.0F, -8.0F, 1, 5, 12, 0.0F, true));

        this.Shelltop2 = new ModelRenderer(this);
        this.Shelltop2.setRotationPoint(0.0F, -4.9F, -4.2F);
        this.Body.addChild(Shelltop2);
        this.setRotateAngle(Shelltop2, -0.0934F, 0.0F, 0.0F);
        this.Shelltop2.cubeList.add(new ModelBox(Shelltop2, 0, 31, -4.0F, -1.0F, 0.0F, 8, 1, 10, 0.0F, false));

        this.Shelltop3 = new ModelRenderer(this);
        this.Shelltop3.setRotationPoint(-0.01F, -1.0F, 0.0F);
        this.Shelltop2.addChild(Shelltop3);
        this.setRotateAngle(Shelltop3, 0.3396F, 0.0F, 0.0F);
        this.Shelltop3.cubeList.add(new ModelBox(Shelltop3, 63, 52, -4.0F, 0.0F, -4.0F, 8, 1, 4, 0.0F, false));

        this.Shelltop1 = new ModelRenderer(this);
        this.Shelltop1.setRotationPoint(0.0F, -6.3F, 6.8F);
        this.Body.addChild(Shelltop1);
        this.setRotateAngle(Shelltop1, 0.0951F, 0.0F, 0.0F);
        this.Shelltop1.cubeList.add(new ModelBox(Shelltop1, 0, 5, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));
        this.Shelltop1.cubeList.add(new ModelBox(Shelltop1, 55, 27, -2.0F, 0.0F, -9.0F, 4, 2, 8, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -4.6F, -8.2F);
        this.Body.addChild(Head);
        this.setRotateAngle(Head, 0.4033F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 27, 52, -4.5F, 0.0F, -4.0F, 9, 5, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 60, 16, -4.5F, 4.0F, 6.7F, 9, 6, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 8, -1.5F, -0.1F, -2.0F, 1, 0, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 7, 5, 0.5F, -0.1F, -2.0F, 1, 0, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 6, 7, -0.5F, -0.1F, -2.3F, 1, 0, 1, 0.0F, false));

        this.Gills = new ModelRenderer(this);
        this.Gills.setRotationPoint(-0.01F, 4.8F, -5.2F);
        this.Head.addChild(Gills);
        this.setRotateAngle(Gills, -0.4245F, 0.0F, 0.0F);
        this.Gills.cubeList.add(new ModelBox(Gills, 55, 38, -4.49F, -3.0F, 0.0F, 9, 3, 4, 0.002F, false));

        this.Headfront = new ModelRenderer(this);
        this.Headfront.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Head.addChild(Headfront);
        this.setRotateAngle(Headfront, 0.743F, 0.0F, 0.0F);
        this.Headfront.cubeList.add(new ModelBox(Headfront, 21, 63, -3.5F, 0.0F, -4.0F, 7, 3, 4, 0.0F, false));

        this.Lowerjaw = new ModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 4.5F, -3.5F);
        this.Headfront.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.3821F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 0, 0, -2.5F, -3.0F, 0.0F, 5, 3, 1, 0.0F, false));

        this.Leftpectoralfin1 = new ModelRenderer(this);
        this.Leftpectoralfin1.setRotationPoint(-5.2F, 0.5F, -6.6F);
        this.Body.addChild(Leftpectoralfin1);
        this.setRotateAngle(Leftpectoralfin1, -0.1196F, -0.3451F, 0.0098F);
        this.Leftpectoralfin1.cubeList.add(new ModelBox(Leftpectoralfin1, 47, 54, -2.5F, -1.0F, -0.5F, 3, 2, 9, 0.0F, false));

        this.Leftpectoralfin2 = new ModelRenderer(this);
        this.Leftpectoralfin2.setRotationPoint(-1.7F, 0.0F, 8.0F);
        this.Leftpectoralfin1.addChild(Leftpectoralfin2);
        this.setRotateAngle(Leftpectoralfin2, 0.1274F, 0.2546F, 0.0637F);
        this.Leftpectoralfin2.cubeList.add(new ModelBox(Leftpectoralfin2, 63, 0, -0.5F, -0.5F, 0.0F, 2, 1, 8, 0.0F, false));

        this.Rightpectoralfin1 = new ModelRenderer(this);
        this.Rightpectoralfin1.setRotationPoint(5.2F, 0.5F, -6.6F);
        this.Body.addChild(Rightpectoralfin1);
        this.setRotateAngle(Rightpectoralfin1, -0.1035F, 0.4015F, 0.046F);
        this.Rightpectoralfin1.cubeList.add(new ModelBox(Rightpectoralfin1, 33, 0, -0.5F, -1.0F, -0.5F, 3, 2, 9, 0.0F, false));

        this.Rightpectoralfin2 = new ModelRenderer(this);
        this.Rightpectoralfin2.setRotationPoint(1.7F, 0.0F, 8.0F);
        this.Rightpectoralfin1.addChild(Rightpectoralfin2);
        this.setRotateAngle(Rightpectoralfin2, 0.1274F, -0.2546F, -0.0637F);
        this.Rightpectoralfin2.cubeList.add(new ModelBox(Rightpectoralfin2, 0, 61, -1.5F, -0.5F, 0.0F, 2, 1, 8, 0.0F, false));

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
