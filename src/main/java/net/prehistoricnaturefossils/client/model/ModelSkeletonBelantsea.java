package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBelantsea extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer root;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodyend;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailend;
    private final ModelRenderer Tailfin;
    private final ModelRenderer Seconddorsalfinend;
    private final ModelRenderer Tailunderside;
    private final ModelRenderer Analfin;
    private final ModelRenderer Seconddorsalfinstart;
    private final ModelRenderer Bellyend;
    private final ModelRenderer Firstdorsalfin;
    private final ModelRenderer Rightpelvicfin;
    private final ModelRenderer Head;
    private final ModelRenderer Throat;
    private final ModelRenderer Headslope;
    private final ModelRenderer Face;
    private final ModelRenderer Upperlips;
    private final ModelRenderer Upperteeth;
    private final ModelRenderer Lowerjaw;
    private final ModelRenderer Lowerteeth;
    private final ModelRenderer Dorsalfinflesh;

    public ModelSkeletonBelantsea() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-17.9945F, -0.5F, -1.1872F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1309F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 5.8321F, -0.5F, -16.0568F, 22, 1, 37, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 39, 27.8321F, -0.5F, -16.0568F, 5, 1, 26, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(13.132F, -0.5F, 12.753F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.5585F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 37, 39, -6.938F, -0.5F, -0.6767F, 7, 1, 13, -0.015F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(-0.9F, 22.9F, 0.0F);
        this.root.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.1745F, 0.0F, -1.5708F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 39, -0.07F, -3.0F, -7.0F, 0, 12, 10, 0.0F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, 0.6F, 2.0F);
        this.Bodyfront.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.0213F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 13, 67, -0.08F, -2.0F, 0.0F, 0, 10, 4, 0.0F, false));

        this.Bodyend = new ModelRenderer(this);
        this.Bodyend.setRotationPoint(0.0F, -0.4F, 3.0F);
        this.Bodymiddle.addChild(Bodyend);
        this.setRotateAngle(Bodyend, 0.0213F, 0.0F, 0.0F);
        this.Bodyend.cubeList.add(new ModelBox(Bodyend, 22, 67, -0.06F, -1.5F, 0.0F, 0, 9, 4, 0.0F, false));

        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(-0.01F, 0.5F, 3.0F);
        this.Bodyend.addChild(Tailbase);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 0, 0, -0.06F, -1.5F, 0.0F, 0, 5, 5, 0.0F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.6F, 4.5F);
        this.Tailbase.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.0436F, 0.0F, 0.0F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 14, 0, -0.07F, -1.0F, 0.0F, 0, 3, 4, 0.0F, false));

        this.Tailfin = new ModelRenderer(this);
        this.Tailfin.setRotationPoint(0.01F, 0.5F, 1.5F);
        this.Tailend.addChild(Tailfin);
        this.Tailfin.cubeList.add(new ModelBox(Tailfin, 0, 67, -0.09F, -3.5F, 0.0F, 0, 7, 6, 0.0F, false));

        this.Seconddorsalfinend = new ModelRenderer(this);
        this.Seconddorsalfinend.setRotationPoint(-0.01F, -1.0F, 0.0F);
        this.Tailbase.addChild(Seconddorsalfinend);
        this.Seconddorsalfinend.cubeList.add(new ModelBox(Seconddorsalfinend, 13, 21, -0.07F, -7.0F, 1.0F, 0, 8, 6, 0.0F, false));

        this.Tailunderside = new ModelRenderer(this);
        this.Tailunderside.setRotationPoint(0.0F, 6.5F, 1.0F);
        this.Tailbase.addChild(Tailunderside);
        this.setRotateAngle(Tailunderside, 0.658F, 0.0F, 0.0F);
        this.Tailunderside.cubeList.add(new ModelBox(Tailunderside, 24, 0, -0.08F, -3.0F, 0.0F, 0, 3, 5, 0.0F, false));

        this.Analfin = new ModelRenderer(this);
        this.Analfin.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Tailunderside.addChild(Analfin);
        this.Analfin.cubeList.add(new ModelBox(Analfin, 20, 14, -0.08F, 0.0F, -3.5F, 0, 5, 7, 0.0F, false));

        this.Seconddorsalfinstart = new ModelRenderer(this);
        this.Seconddorsalfinstart.setRotationPoint(0.0F, -1.5F, 1.0F);
        this.Bodyend.addChild(Seconddorsalfinstart);
        this.Seconddorsalfinstart.cubeList.add(new ModelBox(Seconddorsalfinstart, 30, 9, -0.09F, -6.0F, 0.0F, 0, 6, 3, 0.0F, false));

        this.Bellyend = new ModelRenderer(this);
        this.Bellyend.setRotationPoint(0.0F, 8.4F, 0.0F);
        this.Bodyend.addChild(Bellyend);
        this.setRotateAngle(Bellyend, 0.2335F, 0.0F, 0.0F);
        this.Bellyend.cubeList.add(new ModelBox(Bellyend, 37, 39, -0.09F, -1.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.Firstdorsalfin = new ModelRenderer(this);
        this.Firstdorsalfin.setRotationPoint(0.0F, -2.3F, -1.5F);
        this.Bodyfront.addChild(Firstdorsalfin);
        this.Firstdorsalfin.cubeList.add(new ModelBox(Firstdorsalfin, 0, 0, -0.09F, -6.5F, -6.5F, 0, 7, 13, 0.0F, false));

        this.Rightpelvicfin = new ModelRenderer(this);
        this.Rightpelvicfin.setRotationPoint(1.9F, 8.0F, -2.0F);
        this.Bodyfront.addChild(Rightpelvicfin);
        this.setRotateAngle(Rightpelvicfin, 0.0F, 0.0F, 1.5708F);
        this.Rightpelvicfin.cubeList.add(new ModelBox(Rightpelvicfin, 51, 55, 0.0F, 1.95F, -6.0F, 7, 0, 12, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -4.1F);
        this.Bodyfront.addChild(Head);
        this.setRotateAngle(Head, -0.0035F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 21, -0.06F, -2.0F, -6.0F, 0, 9, 6, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -0.05F, 0.2F, -4.6F, 0, 1, 1, 0.0F, false));

        this.Throat = new ModelRenderer(this);
        this.Throat.setRotationPoint(0.0F, 7.0F, -6.0F);
        this.Head.addChild(Throat);
        this.setRotateAngle(Throat, -0.5732F, 0.0F, 0.0F);
        this.Throat.cubeList.add(new ModelBox(Throat, 17, 43, -0.08F, -2.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.Headslope = new ModelRenderer(this);
        this.Headslope.setRotationPoint(0.0F, -3.3F, -2.2F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.3396F, 0.0F, 0.0F);
        this.Headslope.cubeList.add(new ModelBox(Headslope, 11, 39, -0.08F, 0.0F, -4.0F, 0, 2, 4, 0.0F, false));

        this.Face = new ModelRenderer(this);
        this.Face.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.Head.addChild(Face);
        this.setRotateAngle(Face, -0.5308F, 0.0F, 0.0F);
        this.Face.cubeList.add(new ModelBox(Face, 26, 27, -0.09F, 0.0F, 0.0F, 0, 5, 4, 0.0F, false));

        this.Upperlips = new ModelRenderer(this);
        this.Upperlips.setRotationPoint(0.0F, 4.7F, -0.2F);
        this.Face.addChild(Upperlips);
        this.setRotateAngle(Upperlips, 0.2335F, 0.0F, 0.0F);
        this.Upperlips.cubeList.add(new ModelBox(Upperlips, 7, 21, -0.07F, 0.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.Upperteeth = new ModelRenderer(this);
        this.Upperteeth.setRotationPoint(0.0F, 1.0F, 0.2F);
        this.Upperlips.addChild(Upperteeth);
        this.setRotateAngle(Upperteeth, 0.1911F, 0.0F, 0.0F);
        this.Upperteeth.cubeList.add(new ModelBox(Upperteeth, 30, 0, -0.09F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.Lowerjaw = new ModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 4.1F, -4.95F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.3136F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 0, 39, -0.09F, 0.0F, -4.0F, 0, 2, 4, 0.0F, false));

        this.Lowerteeth = new ModelRenderer(this);
        this.Lowerteeth.setRotationPoint(-0.01F, 0.0F, -3.8F);
        this.Lowerjaw.addChild(Lowerteeth);
        this.setRotateAngle(Lowerteeth, -0.1698F, 0.0F, 0.0F);
        this.Lowerteeth.cubeList.add(new ModelBox(Lowerteeth, 6, 0, -0.088F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.Dorsalfinflesh = new ModelRenderer(this);
        this.Dorsalfinflesh.setRotationPoint(0.0F, -2.0F, -5.2F);
        this.Bodyfront.addChild(Dorsalfinflesh);
        this.setRotateAngle(Dorsalfinflesh, 0.1274F, 0.0F, 0.0F);
        this.Dorsalfinflesh.cubeList.add(new ModelBox(Dorsalfinflesh, 14, 0, -0.08F, -2.0F, -1.0F, 0, 2, 9, 0.0F, false));

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
