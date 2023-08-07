package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonJamoytius extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Eyeportion;
    private final ModelRenderer Nose;
    private final ModelRenderer Mouthtop;
    private final ModelRenderer Mouthfiller;
    private final ModelRenderer Mouthunderside;
    private final ModelRenderer Bodymiddlefront;
    private final ModelRenderer Bodymiddleback;
    private final ModelRenderer Bodyback;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailmiddle;
    private final ModelRenderer Tailend;
    private final ModelRenderer Tailfinend;
    private final ModelRenderer Tailfinbase;
    private final ModelRenderer Dorsalridgetbase;
    private final ModelRenderer Leftanalfin;
    private final ModelRenderer Rightanalfin;
    private final ModelRenderer Dorsalridgeback;
    private final ModelRenderer Dorsalridgemback;
    private final ModelRenderer Dorsalridgemfront;
    private final ModelRenderer Dorsalridgefront;

    public ModelSkeletonJamoytius() {
        this.textureWidth = 160;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -18.0F, -2.0F, -20.0F, 26, 2, 53, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.0F, 0.0F, -1.5708F);


        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(-1.7F, -7.3F, -2.0F);
        this.root.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.3255F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 16, 15, -2.0F, -2.0F, -7.0F, 0, 4, 7, 0.0F, false));

        this.Eyeportion = new ModelRenderer(this);
        this.Eyeportion.setRotationPoint(0.01F, -2.0F, -6.7F);
        this.Bodyfront.addChild(Eyeportion);
        this.setRotateAngle(Eyeportion, -0.0213F, 0.0F, 0.0F);
        this.Eyeportion.cubeList.add(new ModelBox(Eyeportion, 11, 33, -2.1F, 0.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Nose = new ModelRenderer(this);
        this.Nose.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Eyeportion.addChild(Nose);
        this.setRotateAngle(Nose, 0.3821F, 0.0F, 0.0F);
        this.Nose.cubeList.add(new ModelBox(Nose, 8, 2, -2.2F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.Mouthtop = new ModelRenderer(this);
        this.Mouthtop.setRotationPoint(-0.01F, 0.62F, -1.8F);
        this.Nose.addChild(Mouthtop);
        this.setRotateAngle(Mouthtop, 0.6793F, 0.0F, 0.0F);
        this.Mouthtop.cubeList.add(new ModelBox(Mouthtop, 0, 0, -2.2F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.Mouthfiller = new ModelRenderer(this);
        this.Mouthfiller.setRotationPoint(0.01F, 2.0F, -3.0F);
        this.Eyeportion.addChild(Mouthfiller);
        this.setRotateAngle(Mouthfiller, -0.0424F, 0.0F, 0.0F);
        this.Mouthfiller.cubeList.add(new ModelBox(Mouthfiller, 6, 0, -2.2F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.Mouthunderside = new ModelRenderer(this);
        this.Mouthunderside.setRotationPoint(0.0F, 2.0F, -7.0F);
        this.Bodyfront.addChild(Mouthunderside);
        this.setRotateAngle(Mouthunderside, -0.2759F, 0.0F, 0.0F);
        this.Mouthunderside.cubeList.add(new ModelBox(Mouthunderside, 24, 16, -2.1F, -2.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Bodymiddlefront = new ModelRenderer(this);
        this.Bodymiddlefront.setRotationPoint(-0.51F, 0.1F, -0.7F);
        this.Bodyfront.addChild(Bodymiddlefront);
        this.setRotateAngle(Bodymiddlefront, 0.2594F, 0.0F, 0.0F);
        this.Bodymiddlefront.cubeList.add(new ModelBox(Bodymiddlefront, 0, 0, -1.5F, -2.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.Bodymiddleback = new ModelRenderer(this);
        this.Bodymiddleback.setRotationPoint(0.01F, 0.0F, 4.3F);
        this.Bodymiddlefront.addChild(Bodymiddleback);
        this.setRotateAngle(Bodymiddleback, 0.2606F, 0.0F, 0.0F);
        this.Bodymiddleback.cubeList.add(new ModelBox(Bodymiddleback, 24, 6, -1.5F, -2.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.Bodyback = new ModelRenderer(this);
        this.Bodyback.setRotationPoint(-0.4F, 0.5F, 4.4F);
        this.Bodymiddleback.addChild(Bodyback);
        this.setRotateAngle(Bodyback, -0.1545F, 0.0F, 0.0F);
        this.Bodyback.cubeList.add(new ModelBox(Bodyback, 12, 0, -1.0F, -2.5F, 0.0F, 0, 4, 6, 0.0F, false));

        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(-0.01F, -0.1F, 5.4F);
        this.Bodyback.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.2169F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 15, 27, -1.0F, -1.5F, 0.0F, 0, 3, 5, 0.0F, false));

        this.Tailmiddle = new ModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, 0.3F, 4.4F);
        this.Tailbase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, -0.625F, 0.0F, 0.0F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 19, 0, -1.1F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.01F, -0.1F, 2.5F);
        this.Tailmiddle.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.4056F, 0.0F, 0.0F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 25, 21, -1.1F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));

        this.Tailfinend = new ModelRenderer(this);
        this.Tailfinend.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.Tailend.addChild(Tailfinend);
        this.setRotateAngle(Tailfinend, 0.3183F, 0.0F, 0.0F);
        this.Tailfinend.cubeList.add(new ModelBox(Tailfinend, 0, 0, -1.3F, -6.0F, 0.0F, 0, 10, 11, 0.0F, false));

        this.Tailfinbase = new ModelRenderer(this);
        this.Tailfinbase.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Tailmiddle.addChild(Tailfinbase);
        this.Tailfinbase.cubeList.add(new ModelBox(Tailfinbase, 32, 18, -1.3F, -4.0F, 0.0F, 0, 4, 3, 0.0F, false));

        this.Dorsalridgetbase = new ModelRenderer(this);
        this.Dorsalridgetbase.setRotationPoint(0.0F, -1.52F, -0.1F);
        this.Tailbase.addChild(Dorsalridgetbase);
        this.setRotateAngle(Dorsalridgetbase, -0.1911F, 0.0F, 0.0F);
        this.Dorsalridgetbase.cubeList.add(new ModelBox(Dorsalridgetbase, 30, 11, -1.2F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.Leftanalfin = new ModelRenderer(this);
        this.Leftanalfin.setRotationPoint(-0.1F, 1.5F, 0.5F);
        this.Tailbase.addChild(Leftanalfin);
        this.setRotateAngle(Leftanalfin, 0.0F, 0.0F, 0.3609F);


        this.Rightanalfin = new ModelRenderer(this);
        this.Rightanalfin.setRotationPoint(0.1F, 1.5F, 0.5F);
        this.Tailbase.addChild(Rightanalfin);
        this.Rightanalfin.cubeList.add(new ModelBox(Rightanalfin, 26, 29, -1.3F, 0.0F, 0.0F, 0, 3, 5, 0.0F, false));

        this.Dorsalridgeback = new ModelRenderer(this);
        this.Dorsalridgeback.setRotationPoint(0.0F, -2.32F, -0.1F);
        this.Bodyback.addChild(Dorsalridgeback);
        this.setRotateAngle(Dorsalridgeback, -0.1274F, 0.0F, 0.0F);
        this.Dorsalridgeback.cubeList.add(new ModelBox(Dorsalridgeback, 7, 24, -1.2F, -1.0F, 0.0F, 0, 1, 6, 0.0F, false));

        this.Dorsalridgemback = new ModelRenderer(this);
        this.Dorsalridgemback.setRotationPoint(0.0F, -1.9F, 0.0F);
        this.Bodymiddleback.addChild(Dorsalridgemback);
        this.setRotateAngle(Dorsalridgemback, -0.0213F, 0.0F, 0.0F);
        this.Dorsalridgemback.cubeList.add(new ModelBox(Dorsalridgemback, 30, 0, -1.7F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.Dorsalridgemfront = new ModelRenderer(this);
        this.Dorsalridgemfront.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Bodymiddlefront.addChild(Dorsalridgemfront);
        this.setRotateAngle(Dorsalridgemfront, -0.0213F, 0.0F, 0.0F);
        this.Dorsalridgemfront.cubeList.add(new ModelBox(Dorsalridgemfront, 0, 30, -1.7F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.Dorsalridgefront = new ModelRenderer(this);
        this.Dorsalridgefront.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Bodyfront.addChild(Dorsalridgefront);
        this.setRotateAngle(Dorsalridgefront, 0.1698F, 0.0F, 0.0F);
        this.Dorsalridgefront.cubeList.add(new ModelBox(Dorsalridgefront, 0, 22, -2.2F, -1.0F, -6.0F, 0, 1, 6, 0.0F, false));

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
