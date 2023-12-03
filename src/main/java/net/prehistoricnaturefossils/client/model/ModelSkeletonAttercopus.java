package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAttercopus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer body;
    private final ModelRenderer headattercopus_r1;
    private final ModelRenderer headattercopus_r2;
    private final ModelRenderer pedipalpL;
    private final ModelRenderer pedipalpL2;
    private final ModelRenderer legL1;
    private final ModelRenderer legL5;
    private final ModelRenderer legL2;
    private final ModelRenderer legL6;
    private final ModelRenderer legL3;
    private final ModelRenderer legL7;
    private final ModelRenderer legL4;
    private final ModelRenderer legL8;
    private final ModelRenderer legL9;
    private final ModelRenderer cube_r2;
    private final ModelRenderer abdomen;
    private final ModelRenderer tailattercopus;
    private final ModelRenderer abdomen2;
    private final ModelRenderer tailattercopus2;

    public ModelSkeletonAttercopus() {
        this.textureWidth = 80;
        this.textureHeight = 50;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 21, -11.0F, -2.0F, -1.0F, 23, 2, 10, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 49, 0, 5.0F, -2.0F, -4.0F, 7, 2, 3, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-11.0F, 0.0F, -1.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.7418F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, -2.0F, -18.0F, 15, 2, 18, 0.005F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(2.0F, -1.85F, -4.0F);
        this.fossil.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 7, -2.0F, -0.5F, 0.0F, 4, 0, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 11, 0, -1.0F, -0.6F, -0.7F, 2, 0, 1, 0.0F, false));

        this.headattercopus_r1 = new ModelRenderer(this);
        this.headattercopus_r1.setRotationPoint(-1.25F, -1.35F, -1.0F);
        this.body.addChild(headattercopus_r1);
        this.setRotateAngle(headattercopus_r1, 1.8326F, 0.0F, 1.5708F);
        this.headattercopus_r1.cubeList.add(new ModelBox(headattercopus_r1, 0, 0, 0.8F, -0.5F, 1.3F, 0, 2, 1, 0.0F, false));

        this.headattercopus_r2 = new ModelRenderer(this);
        this.headattercopus_r2.setRotationPoint(-0.65F, -0.5071F, -0.5778F);
        this.body.addChild(headattercopus_r2);
        this.setRotateAngle(headattercopus_r2, -1.6144F, 0.0F, 1.5708F);
        this.headattercopus_r2.cubeList.add(new ModelBox(headattercopus_r2, 3, 0, 0.0F, -0.6F, -0.1F, 0, 2, 1, 0.0F, false));

        this.pedipalpL = new ModelRenderer(this);
        this.pedipalpL.setRotationPoint(0.5F, -0.45F, 0.75F);
        this.body.addChild(pedipalpL);
        this.setRotateAngle(pedipalpL, 0.0F, 0.2618F, 0.0F);
        this.pedipalpL.cubeList.add(new ModelBox(pedipalpL, 0, 0, -1.25F, 0.0F, -5.75F, 2, 0, 6, 0.0F, false));

        this.pedipalpL2 = new ModelRenderer(this);
        this.pedipalpL2.setRotationPoint(-0.5F, -0.45F, 0.75F);
        this.body.addChild(pedipalpL2);
        this.setRotateAngle(pedipalpL2, 0.0F, -0.3491F, 0.0F);
        this.pedipalpL2.cubeList.add(new ModelBox(pedipalpL2, 0, 0, -0.75F, 0.0F, -5.75F, 2, 0, 6, 0.0F, true));

        this.legL1 = new ModelRenderer(this);
        this.legL1.setRotationPoint(0.5F, -0.15F, 0.75F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.3054F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 27, 34, 0.05F, -0.3F, -5.7F, 9, 0, 7, 0.0F, false));

        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(-0.5F, -0.25F, -0.25F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0873F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 27, 34, -8.75F, -0.1F, -5.2F, 9, 0, 7, 0.0F, true));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(1.25F, -0.45F, 1.75F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, -0.1396F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 34, -0.25F, 0.1F, -8.0F, 9, 0, 8, 0.0F, false));

        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(-1.25F, -0.35F, 1.75F);
        this.body.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.4451F, 0.0F);
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 34, -8.75F, 0.1F, -8.0F, 9, 0, 8, 0.0F, true));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(1.5F, -0.25F, 2.5F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.513F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 43, -0.25F, -0.1F, -0.75F, 9, 0, 6, 0.0F, false));

        this.legL7 = new ModelRenderer(this);
        this.legL7.setRotationPoint(-1.5F, -0.25F, 2.5F);
        this.body.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.2512F, 0.0F);
        this.legL7.cubeList.add(new ModelBox(legL7, 0, 43, -8.75F, -0.1F, -0.75F, 9, 0, 6, 0.0F, true));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(1.5F, -0.25F, 3.5F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -0.8571F, 0.0085F);
        this.legL4.cubeList.add(new ModelBox(legL4, 29, 42, -0.2507F, -0.1F, -0.7495F, 9, 0, 6, 0.0F, false));

        this.legL8 = new ModelRenderer(this);
        this.legL8.setRotationPoint(-1.5F, -0.25F, 3.5F);
        this.body.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.6826F, -0.0085F);
        this.legL8.cubeList.add(new ModelBox(legL8, 29, 42, -8.7493F, -0.1F, -0.7495F, 9, 0, 6, 0.0F, true));

        this.legL9 = new ModelRenderer(this);
        this.legL9.setRotationPoint(-5.5F, -0.25F, 12.9F);
        this.body.addChild(legL9);
        this.setRotateAngle(legL9, -3.1416F, -1.3807F, 3.1331F);
        this.legL9.cubeList.add(new ModelBox(legL9, 29, 42, -8.7493F, -0.1F, -0.7495F, 9, 0, 6, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.2493F, -0.1F, 7.4505F);
        this.legL9.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.0036F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 45, -0.1F, 0.0F, -0.7F, 1, 0, 2, 0.0F, true));

        this.abdomen = new ModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -0.75F, 3.0F);
        this.body.addChild(abdomen);
        this.setRotateAngle(abdomen, 0.0F, -0.1309F, 0.0F);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 49, 6, -2.5F, 0.3F, 0.0F, 5, 0, 4, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 8, 11, -1.5F, 0.3F, 4.0F, 3, 0, 1, 0.0F, false));

        this.tailattercopus = new ModelRenderer(this);
        this.tailattercopus.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.abdomen.addChild(tailattercopus);
        this.setRotateAngle(tailattercopus, 0.0F, -0.1745F, 0.0F);
        this.tailattercopus.cubeList.add(new ModelBox(tailattercopus, 0, 11, -0.5F, 0.8F, 0.0F, 1, 0, 5, 0.0F, false));

        this.abdomen2 = new ModelRenderer(this);
        this.abdomen2.setRotationPoint(-10.0F, -0.75F, 13.0F);
        this.body.addChild(abdomen2);
        this.setRotateAngle(abdomen2, 0.0F, 3.098F, 0.0F);
        this.abdomen2.cubeList.add(new ModelBox(abdomen2, 49, 6, -2.5F, 0.3F, 0.0F, 5, 0, 4, 0.0F, false));
        this.abdomen2.cubeList.add(new ModelBox(abdomen2, 8, 11, -1.5F, 0.3F, 4.0F, 3, 0, 1, 0.0F, false));

        this.tailattercopus2 = new ModelRenderer(this);
        this.tailattercopus2.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.abdomen2.addChild(tailattercopus2);
        this.setRotateAngle(tailattercopus2, 0.0F, 0.6545F, 0.0F);
        this.tailattercopus2.cubeList.add(new ModelBox(tailattercopus2, 0, 11, -0.5F, 0.8F, -0.5F, 1, 0, 5, 0.0F, false));

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
