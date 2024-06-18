package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonProganochelysFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Proganochelys;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail4;
    private final ModelRenderer frontleftleg;
    private final ModelRenderer frontleftleg2;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer frontrightleg;
    private final ModelRenderer frontrightleg2;
    private final ModelRenderer frontrightleg3;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer backleftleg3;
    private final ModelRenderer backrightleg;
    private final ModelRenderer backrightleg2;
    private final ModelRenderer backrightleg3;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;

    public ModelSkeletonProganochelysFrame() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -6.0F, 7.3F, 1, 6, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -6.0F, -6.6F, 1, 6, 1, -0.1F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.1F, -5.0F, -6.1F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.85F, -3.0F, -0.5F, 1, 6, 1, -0.1F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.25F, -3.0F, 13.4F, 1, 6, 1, -0.1F, false));

        this.Proganochelys = new ModelRenderer(this);
        this.Proganochelys.setRotationPoint(0.5F, -3.5F, 0.0F);
        this.fossil.addChild(Proganochelys);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -3.65F, -7.5F);
        this.Proganochelys.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0349F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 38, -0.5F, 0.4F, 0.0F, 1, 1, 9, -0.1F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -3.65F, 8.5F);
        this.Proganochelys.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0349F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 33, -0.5F, 0.375F, -8.0F, 1, 1, 8, -0.1F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -4.1F, 8.25F);
        this.Proganochelys.addChild(tail);
        this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 42, 37, -0.5F, 0.8F, 0.25F, 1, 1, 2, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 2.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2355F, 0.3829F, -0.0894F);
        this.tail2.cubeList.add(new ModelBox(tail2, 49, 10, -0.5F, 1.1625F, -0.419F, 1, 1, 5, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.75F, 3.8F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1415F, 0.3892F, -0.054F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.6F, -0.15F);
        this.tail3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 50, -0.675F, -0.15F, -0.1F, 1, 1, 4, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 3.65F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2875F, 0.4205F, 0.1201F);
        this.tail4.cubeList.add(new ModelBox(tail4, -1, 18, -0.5F, 0.575F, -1.0F, 1, 1, 6, -0.1F, false));

        this.frontleftleg = new ModelRenderer(this);
        this.frontleftleg.setRotationPoint(1.0867F, 0.0675F, -6.0F);
        this.Proganochelys.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, -0.3544F, 0.5412F, -0.6229F);


        this.frontleftleg2 = new ModelRenderer(this);
        this.frontleftleg2.setRotationPoint(5.71F, 2.9425F, -1.1181F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.1325F, -1.33F, 0.6157F);


        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(0.3F, 3.0F, 0.0F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.0529F, 0.5238F, 0.0081F);


        this.frontrightleg = new ModelRenderer(this);
        this.frontrightleg.setRotationPoint(-2.0867F, 0.0675F, -6.0F);
        this.Proganochelys.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, -0.3122F, -0.2522F, 0.5149F);


        this.frontrightleg2 = new ModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-5.71F, 2.9425F, -1.1181F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 1.0078F, 1.1659F, 0.4157F);


        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(-0.3F, 3.0F, 0.0F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -0.0905F, -0.5263F, -0.1157F);


        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(1.5867F, -0.7825F, 8.0F);
        this.Proganochelys.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.3253F, -0.8123F, -0.9078F);


        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(4.1484F, 2.9366F, -0.5742F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.754F, 0.4161F, 0.2619F);


        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(-0.3F, 3.5F, 1.0F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.2615F, 0.0205F, 0.2886F);


        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-2.5867F, -0.7825F, 8.0F);
        this.Proganochelys.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.0F, 0.5672F, 0.6981F);


        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(-4.1484F, 2.9366F, -0.5742F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.3249F, -0.1679F, -0.5863F);


        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.3F, 3.5F, 1.0F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 0.0189F, 0.0008F, -0.0852F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.25F, -7.75F);
        this.Proganochelys.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, -0.3491F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.7484F, 0.034F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2922F, 0.1673F, 0.05F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 43, -0.4F, -0.5F, -1.0F, 1, 1, 2, -0.1F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.2F, -2.75F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1047F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 54, 5, -1.0F, 0.5F, -1.0F, 1, 1, 4, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -0.3335F, -2.7091F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.3054F, -0.48F, 0.0F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.3335F, -0.1659F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.3491F, 0.0F, 0.0F);

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
