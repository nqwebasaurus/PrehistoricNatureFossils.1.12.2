package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBunostegosFrame extends ModelBase {
    private final ModelRenderer bunostegos;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer lowerbody;
    private final ModelRenderer cube_r4;
    private final ModelRenderer backleftleg4;
    private final ModelRenderer backleftleg5;
    private final ModelRenderer backleftleg6;
    private final ModelRenderer backrightleg4;
    private final ModelRenderer backrightleg5;
    private final ModelRenderer backrightleg6;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer upperbody;
    private final ModelRenderer cube_r5;
    private final ModelRenderer frontleftleg;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer frontleftleg7;
    private final ModelRenderer frontrightleg;
    private final ModelRenderer frontrightleg3;
    private final ModelRenderer frontrightleg7;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer cheekbone;
    private final ModelRenderer cheekbone2;
    private final ModelRenderer body;

    public ModelSkeletonBunostegosFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.bunostegos = new ModelRenderer(this);
        this.bunostegos.setRotationPoint(0.0F, 17.75F, -1.0F);
        this.bunostegos.cubeList.add(new ModelBox(bunostegos, 1, 1, 0.6F, -8.0F, -5.0F, 1, 14, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -4.5F, 10.1F);
        this.bunostegos.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0524F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.0F, -3.5F, -0.5F, 1, 14, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -4.5F, 10.1F);
        this.bunostegos.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0524F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.0F, -5.0F, -0.5F, 1, 11, 1, -0.1F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -4.0F, -4.5F);
        this.bunostegos.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 1.9F, -6.0F, -0.5F, 1, 12, 1, -0.1F, false));

        this.lowerbody = new ModelRenderer(this);
        this.lowerbody.setRotationPoint(0.0F, -9.15F, 1.8F);
        this.bunostegos.addChild(lowerbody);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.5F, 6.2F);
        this.lowerbody.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 42, -1.0F, -1.3F, 0.0F, 2, 2, 6, -0.2F, false));

        this.backleftleg4 = new ModelRenderer(this);
        this.backleftleg4.setRotationPoint(4.6556F, 4.2722F, 8.811F);
        this.lowerbody.addChild(backleftleg4);
        this.setRotateAngle(backleftleg4, 0.2618F, 0.0F, -0.3491F);


        this.backleftleg5 = new ModelRenderer(this);
        this.backleftleg5.setRotationPoint(1.3701F, 5.2205F, -3.661F);
        this.backleftleg4.addChild(backleftleg5);
        this.setRotateAngle(backleftleg5, 0.1231F, -0.0447F, 0.3463F);


        this.backleftleg6 = new ModelRenderer(this);
        this.backleftleg6.setRotationPoint(0.0F, 5.3556F, 1.4733F);
        this.backleftleg5.addChild(backleftleg6);
        this.setRotateAngle(backleftleg6, -0.3752F, 0.0F, 0.0F);


        this.backrightleg4 = new ModelRenderer(this);
        this.backrightleg4.setRotationPoint(-4.6556F, 4.2722F, 8.811F);
        this.lowerbody.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, -0.3927F, 0.0F, 0.3491F);


        this.backrightleg5 = new ModelRenderer(this);
        this.backrightleg5.setRotationPoint(-1.3701F, 5.2205F, -3.661F);
        this.backrightleg4.addChild(backrightleg5);
        this.setRotateAngle(backrightleg5, 0.5158F, 0.0447F, -0.3463F);


        this.backrightleg6 = new ModelRenderer(this);
        this.backrightleg6.setRotationPoint(0.0F, 5.3556F, 1.8733F);
        this.backrightleg5.addChild(backrightleg6);
        this.setRotateAngle(backrightleg6, 0.3403F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.8456F, 12.2224F);
        this.lowerbody.addChild(tail);
        this.setRotateAngle(tail, -0.394F, -0.0806F, 0.0335F);
        this.tail.cubeList.add(new ModelBox(tail, 28, 55, -1.0F, 0.4416F, -0.3222F, 2, 2, 4, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1061F, 3.4272F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.257F, -0.5522F, 0.137F);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 43, -0.5F, 0.5488F, -0.3276F, 1, 1, 4, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.4488F, 3.6724F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1392F, -0.346F, 0.0475F);
        this.tail3.cubeList.add(new ModelBox(tail3, 11, 42, -0.5F, 0.1153F, -0.3457F, 1, 1, 4, -0.2F, false));

        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.5F, 0.4F, 6.7F);
        this.lowerbody.addChild(upperbody);
        this.setRotateAngle(upperbody, 0.0F, -0.0873F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -1.5F, -12.0F);
        this.upperbody.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 4, -1.0F, 1.35F, -4.5F, 2, 2, 5, -0.2F, false));

        this.frontleftleg = new ModelRenderer(this);
        this.frontleftleg.setRotationPoint(3.7982F, 6.9496F, -13.1008F);
        this.upperbody.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.4363F, -0.4363F, -0.1309F);


        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(3.7018F, 2.4867F, 0.9371F);
        this.frontleftleg.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.1298F, -0.017F, 0.1298F);


        this.frontleftleg7 = new ModelRenderer(this);
        this.frontleftleg7.setRotationPoint(0.7F, 3.5373F, -1.5062F);
        this.frontleftleg3.addChild(frontleftleg7);
        this.setRotateAngle(frontleftleg7, 0.0873F, 0.0F, 0.0F);


        this.frontrightleg = new ModelRenderer(this);
        this.frontrightleg.setRotationPoint(-4.7982F, 6.9496F, -13.1008F);
        this.upperbody.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.0F, 0.0F, 0.1309F);


        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(-3.7018F, 2.4867F, 0.9371F);
        this.frontrightleg.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.1298F, 0.017F, -0.1298F);


        this.frontrightleg7 = new ModelRenderer(this);
        this.frontrightleg7.setRotationPoint(-0.7F, 3.5373F, -1.5062F);
        this.frontrightleg3.addChild(frontrightleg7);
        this.setRotateAngle(frontrightleg7, 0.3491F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, 0.3378F, -16.0246F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, 0.1372F, -0.3027F, -0.0411F);
        this.neck.cubeList.add(new ModelBox(neck, 34, 38, -1.0F, -0.0149F, -5.5271F, 2, 2, 6, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.4895F, -0.6957F, -4.1257F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.0005F, -0.0865F, 0.0114F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.4895F, 3.0407F, 0.3169F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3927F, 0.0F, 0.0F);


        this.cheekbone = new ModelRenderer(this);
        this.cheekbone.setRotationPoint(-3.5105F, 1.7809F, -2.2014F);
        this.head.addChild(cheekbone);
        this.setRotateAngle(cheekbone, 0.0287F, 0.2267F, -0.1291F);


        this.cheekbone2 = new ModelRenderer(this);
        this.cheekbone2.setRotationPoint(4.4895F, 1.7809F, -2.2014F);
        this.head.addChild(cheekbone2);
        this.setRotateAngle(cheekbone2, 0.0287F, -0.2267F, 0.1291F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-0.5F, 9.0F, -8.5F);
        this.upperbody.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -9.2F, -3.5F, 2, 2, 12, -0.2F, false));

    }

    public void renderAll(float f) {
        this.bunostegos.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
