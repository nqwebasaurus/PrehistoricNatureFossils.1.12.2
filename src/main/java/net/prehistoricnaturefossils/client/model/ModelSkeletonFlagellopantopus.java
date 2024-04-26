package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonFlagellopantopus extends ModelBase {
    private final ModelRenderer Fossil;
    private final ModelRenderer Rock;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Body;
    private final ModelRenderer talson;
    private final ModelRenderer tail;
    private final ModelRenderer legR1;
    private final ModelRenderer legRs1;
    private final ModelRenderer legL1;
    private final ModelRenderer legLs1;
    private final ModelRenderer legLss1;
    private final ModelRenderer legL2;
    private final ModelRenderer legLs2;
    private final ModelRenderer legLss2;
    private final ModelRenderer legL3;
    private final ModelRenderer legLs3;
    private final ModelRenderer legLss3;
    private final ModelRenderer legLsss3;
    private final ModelRenderer legL4;
    private final ModelRenderer legLs4;
    private final ModelRenderer legLss4;
    private final ModelRenderer legLsss4;
    private final ModelRenderer legR2;
    private final ModelRenderer legRs2;
    private final ModelRenderer legRss2;
    private final ModelRenderer legRsss2;
    private final ModelRenderer legR3;
    private final ModelRenderer legRs3;
    private final ModelRenderer legRss3;
    private final ModelRenderer legRsss3;
    private final ModelRenderer legR4;
    private final ModelRenderer legRs4;
    private final ModelRenderer legRss4;
    private final ModelRenderer legRsss4;
    private final ModelRenderer proboscis;

    public ModelSkeletonFlagellopantopus() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.Fossil = new ModelRenderer(this);
        this.Fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Rock = new ModelRenderer(this);
        this.Rock.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Fossil.addChild(Rock);
        this.Rock.cubeList.add(new ModelBox(Rock, 0, 0, -11.0F, -2.0F, -5.0F, 25, 2, 37, 0.01F, false));
        this.Rock.cubeList.add(new ModelBox(Rock, 0, 40, -21.0F, -2.0F, -28.0F, 45, 2, 23, 0.01F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(11.0F, 0.0F, 32.0F);
        this.Rock.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 66, -9.15F, -2.0F, -39.85F, 12, 2, 39, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-11.0F, 0.0F, 32.0F);
        this.Rock.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 64, 69, 0.0F, -2.0F, -39.0F, 12, 2, 39, 0.0F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Fossil.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -1.0F, -2.5F, -5.25F, 2, 1, 5, 0.0F, false));

        this.talson = new ModelRenderer(this);
        this.talson.setRotationPoint(0.0F, -3.0F, -0.25F);
        this.Body.addChild(talson);
        this.setRotateAngle(talson, -0.2628F, 0.0843F, -0.0226F);
        this.talson.cubeList.add(new ModelBox(talson, 0, 19, -0.5F, 0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.5F, 1.75F);
        this.talson.addChild(tail);
        this.setRotateAngle(tail, -0.0098F, -0.2616F, 1.5708F);
        this.tail.cubeList.add(new ModelBox(tail, 88, 0, -0.025F, -5.5F, 0.0F, 0, 6, 30, 0.0F, false));

        this.legR1 = new ModelRenderer(this);
        this.legR1.setRotationPoint(-1.0F, -2.25F, -4.0F);
        this.Body.addChild(legR1);
        this.setRotateAngle(legR1, -1.5708F, -1.0468F, -0.0135F);
        this.legR1.cubeList.add(new ModelBox(legR1, 9, 25, -4.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, false));

        this.legRs1 = new ModelRenderer(this);
        this.legRs1.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.legR1.addChild(legRs1);
        this.setRotateAngle(legRs1, 0.0F, 0.0F, 0.3927F);
        this.legRs1.cubeList.add(new ModelBox(legRs1, 15, 21, -5.0F, -0.5F, -0.01F, 5, 1, 0, 0.0F, false));

        this.legL1 = new ModelRenderer(this);
        this.legL1.setRotationPoint(1.0F, -2.0F, -4.0F);
        this.Body.addChild(legL1);
        this.setRotateAngle(legL1, -1.7083F, 1.2624F, -0.1442F);
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 25, 0.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, false));

        this.legLs1 = new ModelRenderer(this);
        this.legLs1.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.legL1.addChild(legLs1);
        this.setRotateAngle(legLs1, 0.0F, 0.0F, 0.2182F);
        this.legLs1.cubeList.add(new ModelBox(legLs1, 0, 17, 0.0F, -0.5F, -0.01F, 5, 1, 0, 0.0F, false));

        this.legLss1 = new ModelRenderer(this);
        this.legLss1.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.legLs1.addChild(legLss1);
        this.setRotateAngle(legLss1, 0.0F, 0.0F, 0.7854F);
        this.legLss1.cubeList.add(new ModelBox(legLss1, 0, 11, 0.0F, -0.5F, 0.0F, 7, 1, 0, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -2.0F, -3.0F);
        this.Body.addChild(legL2);
        this.setRotateAngle(legL2, -1.6107F, 0.7401F, -0.0463F);
        this.legL2.cubeList.add(new ModelBox(legL2, 18, 23, 0.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, false));

        this.legLs2 = new ModelRenderer(this);
        this.legLs2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.legL2.addChild(legLs2);
        this.setRotateAngle(legLs2, 0.0F, 0.0F, -0.0873F);
        this.legLs2.cubeList.add(new ModelBox(legLs2, 15, 12, 0.0F, -0.5F, -0.01F, 5, 1, 0, 0.0F, false));

        this.legLss2 = new ModelRenderer(this);
        this.legLss2.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.legLs2.addChild(legLss2);
        this.setRotateAngle(legLss2, 0.0F, 0.0F, 0.9163F);
        this.legLss2.cubeList.add(new ModelBox(legLss2, 10, 2, 0.0F, -0.5F, 0.0F, 7, 1, 0, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, -2.1F, -2.0F);
        this.Body.addChild(legL3);
        this.setRotateAngle(legL3, -1.5708F, 0.5164F, 0.0071F);
        this.legL3.cubeList.add(new ModelBox(legL3, 9, 23, 0.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, false));

        this.legLs3 = new ModelRenderer(this);
        this.legLs3.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.legL3.addChild(legLs3);
        this.setRotateAngle(legLs3, 0.0F, 0.0F, -0.8727F);
        this.legLs3.cubeList.add(new ModelBox(legLs3, 15, 10, 0.0F, -0.5F, -0.01F, 5, 1, 0, 0.0F, false));

        this.legLss3 = new ModelRenderer(this);
        this.legLss3.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.legLs3.addChild(legLss3);
        this.setRotateAngle(legLss3, 0.0F, 0.0F, 1.3963F);
        this.legLss3.cubeList.add(new ModelBox(legLss3, 10, 0, 0.0F, -0.5F, 0.0F, 7, 1, 0, 0.0F, false));

        this.legLsss3 = new ModelRenderer(this);
        this.legLsss3.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.legLss3.addChild(legLsss3);
        this.setRotateAngle(legLsss3, 0.0F, 0.0F, -0.6545F);
        this.legLsss3.cubeList.add(new ModelBox(legLsss3, 26, 6, 0.0F, -0.5F, -0.01F, 3, 1, 0, 0.0F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(1.0F, -2.0F, -1.0F);
        this.Body.addChild(legL4);
        this.setRotateAngle(legL4, -1.5708F, 0.3054F, -0.0436F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 23, 0.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, false));

        this.legLs4 = new ModelRenderer(this);
        this.legLs4.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.legL4.addChild(legLs4);
        this.setRotateAngle(legLs4, 0.0F, 0.0F, -2.2689F);
        this.legLs4.cubeList.add(new ModelBox(legLs4, 15, 8, 0.0F, -0.5F, 0.04F, 5, 1, 0, 0.0F, false));

        this.legLss4 = new ModelRenderer(this);
        this.legLss4.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.legLs4.addChild(legLss4);
        this.setRotateAngle(legLss4, 0.0F, 0.0F, 0.0873F);
        this.legLss4.cubeList.add(new ModelBox(legLss4, 0, 9, 0.0F, -0.5F, 0.0F, 7, 1, 0, 0.0F, false));

        this.legLsss4 = new ModelRenderer(this);
        this.legLsss4.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.legLss4.addChild(legLsss4);
        this.setRotateAngle(legLsss4, 0.0F, 0.0F, 0.6109F);
        this.legLsss4.cubeList.add(new ModelBox(legLsss4, 25, 25, 0.0F, -0.5F, -0.01F, 3, 1, 0, 0.0F, false));

        this.legR2 = new ModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -2.25F, -3.0F);
        this.Body.addChild(legR2);
        this.setRotateAngle(legR2, -1.5708F, -0.6974F, -0.0326F);
        this.legR2.cubeList.add(new ModelBox(legR2, 25, 2, -4.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, false));

        this.legRs2 = new ModelRenderer(this);
        this.legRs2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.legR2.addChild(legRs2);
        this.setRotateAngle(legRs2, -0.0436F, -0.0087F, 0.524F);
        this.legRs2.cubeList.add(new ModelBox(legRs2, 15, 19, -5.0F, -0.5F, -0.01F, 5, 1, 0, 0.0F, false));

        this.legRss2 = new ModelRenderer(this);
        this.legRss2.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.legRs2.addChild(legRss2);
        this.setRotateAngle(legRss2, 0.0F, 0.0F, -1.1345F);
        this.legRss2.cubeList.add(new ModelBox(legRss2, 0, 15, -7.0F, -0.5F, 0.0F, 7, 1, 0, 0.0F, false));

        this.legRsss2 = new ModelRenderer(this);
        this.legRsss2.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.legRss2.addChild(legRsss2);
        this.setRotateAngle(legRsss2, 0.0F, 0.0F, 0.6545F);
        this.legRsss2.cubeList.add(new ModelBox(legRsss2, 26, 18, -3.0F, -0.5F, -0.01F, 3, 1, 0, 0.0F, false));

        this.legR3 = new ModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, -2.25F, -2.0F);
        this.Body.addChild(legR3);
        this.setRotateAngle(legR3, -1.5708F, -0.2618F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 25, 0, -4.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, false));

        this.legRs3 = new ModelRenderer(this);
        this.legRs3.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.legR3.addChild(legRs3);
        this.setRotateAngle(legRs3, 0.0F, 0.0F, 0.8727F);
        this.legRs3.cubeList.add(new ModelBox(legRs3, 18, 14, -5.0F, -0.5F, -0.01F, 5, 1, 0, 0.0F, false));

        this.legRss3 = new ModelRenderer(this);
        this.legRss3.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.legRs3.addChild(legRss3);
        this.setRotateAngle(legRss3, 0.0F, 0.0F, -1.0908F);
        this.legRss3.cubeList.add(new ModelBox(legRss3, 0, 13, -7.0F, -0.5F, 0.0F, 7, 1, 0, 0.0F, false));

        this.legRsss3 = new ModelRenderer(this);
        this.legRsss3.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.legRss3.addChild(legRsss3);
        this.setRotateAngle(legRsss3, 0.0F, 0.0F, -0.3927F);
        this.legRsss3.cubeList.add(new ModelBox(legRsss3, 26, 12, -3.0F, -0.5F, -0.01F, 3, 1, 0, 0.0F, false));

        this.legR4 = new ModelRenderer(this);
        this.legR4.setRotationPoint(-1.0F, -2.025F, -1.0F);
        this.Body.addChild(legR4);
        this.setRotateAngle(legR4, -1.5708F, 0.3941F, 0.0024F);
        this.legR4.cubeList.add(new ModelBox(legR4, 21, 16, -4.0F, -0.5F, 0.0F, 4, 1, 0, 0.0F, false));

        this.legRs4 = new ModelRenderer(this);
        this.legRs4.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.legR4.addChild(legRs4);
        this.setRotateAngle(legRs4, 0.0F, 0.0F, 0.6109F);
        this.legRs4.cubeList.add(new ModelBox(legRs4, 15, 6, -5.0F, -0.5F, -0.01F, 5, 1, 0, 0.0F, false));

        this.legRss4 = new ModelRenderer(this);
        this.legRss4.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.legRs4.addChild(legRss4);
        this.setRotateAngle(legRss4, 0.0F, 0.0F, 1.6581F);
        this.legRss4.cubeList.add(new ModelBox(legRss4, 0, 7, -7.0F, -0.5F, 0.0F, 7, 1, 0, 0.0F, false));

        this.legRsss4 = new ModelRenderer(this);
        this.legRsss4.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.legRss4.addChild(legRsss4);
        this.setRotateAngle(legRsss4, 0.0F, 0.0F, -1.0036F);
        this.legRsss4.cubeList.add(new ModelBox(legRsss4, 18, 25, -3.0F, -0.5F, -0.01F, 3, 1, 0, 0.0F, false));

        this.proboscis = new ModelRenderer(this);
        this.proboscis.setRotationPoint(0.0F, -2.5F, -5.0F);
        this.Body.addChild(proboscis);
        this.setRotateAngle(proboscis, 0.1772F, 0.1719F, 0.0306F);
        this.proboscis.cubeList.add(new ModelBox(proboscis, 12, 14, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

    }

    public void renderAll(float f) {
        this.Fossil.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
