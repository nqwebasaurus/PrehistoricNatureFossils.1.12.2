package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAnurognathusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer main;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftwing;
    private final ModelRenderer leftwing2;
    private final ModelRenderer leftwing3;
    private final ModelRenderer leftmembrane;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightwing;
    private final ModelRenderer rightwing2;
    private final ModelRenderer rightwing3;
    private final ModelRenderer rightmembrane;
    private final ModelRenderer righthand;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;

    public ModelSkeletonAnurognathusFrame() {
        this.textureWidth = 45;
        this.textureHeight = 42;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -7.75F, -2.5F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.3286F, 0.1758F, 0.7245F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.25F, 2.5F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 26, -0.5F, 0.1352F, 0.4208F, 1, 1, 2, -0.1F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.3F, 0.3F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 20, -0.5F, 0.0691F, -0.1971F, 1, 1, 3, -0.101F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.6268F, -2.07F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.5708F, -1.5272F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 18, -0.5F, -0.5F, -3.5F, 1, 1, 7, -0.101F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.3F, -2.7F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 23, -0.5F, 0.2F, 0.0F, 1, 1, 3, -0.1F, false));

        this.leftwing = new ModelRenderer(this);
        this.leftwing.setRotationPoint(1.9F, -0.5F, -2.15F);
        this.main.addChild(leftwing);
        this.setRotateAngle(leftwing, 0.2897F, -0.3122F, -0.2629F);


        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(4.9F, -0.1F, -0.7F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -0.3759F, 0.4845F, -0.5047F);


        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(6.493F, 0.5826F, -0.2007F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, -3.0589F, 0.5079F, -2.874F);


        this.leftmembrane = new ModelRenderer(this);
        this.leftmembrane.setRotationPoint(-4.75F, 0.0F, -0.5F);
        this.leftwing3.addChild(leftmembrane);
        this.setRotateAngle(leftmembrane, 0.0172F, -0.1298F, -0.132F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(-0.5F, 0.0F, -0.25F);
        this.leftwing3.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0922F, 0.0606F, 0.0084F);


        this.rightwing = new ModelRenderer(this);
        this.rightwing.setRotationPoint(-1.9F, -0.5F, -2.15F);
        this.main.addChild(rightwing);
        this.setRotateAngle(rightwing, 0.3765F, 0.1969F, 0.6037F);


        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-4.9F, -0.1F, -0.7F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -0.3759F, -0.4845F, 0.5047F);


        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(-6.493F, 0.5826F, -0.2007F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, -3.0349F, -0.5038F, 2.8244F);


        this.rightmembrane = new ModelRenderer(this);
        this.rightmembrane.setRotationPoint(4.75F, 0.0F, -0.5F);
        this.rightwing3.addChild(rightmembrane);
        this.setRotateAngle(rightmembrane, 0.0341F, 0.1264F, 0.264F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(0.5F, 0.0F, -0.25F);
        this.rightwing3.addChild(righthand);
        this.setRotateAngle(righthand, 0.0922F, -0.0606F, -0.0084F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.4F, -2.525F);
        this.main.addChild(neck);
        this.setRotateAngle(neck, -0.517F, -0.0869F, -0.1515F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.2431F, -2.4856F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1571F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 8, -0.5F, 0.0F, -0.45F, 1, 1, 1, -0.101F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.2431F, -1.9856F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 10, -0.5F, -0.0782F, -0.3438F, 1, 1, 3, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.5F, 0.1931F, -2.4106F);
        this.neck.addChild(Head);
        this.setRotateAngle(Head, -0.49F, -0.1925F, -0.3444F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.7804F, 0.1531F);
        this.Head.addChild(jaw);
        this.setRotateAngle(jaw, 1.1781F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.75F, 4.7F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 37, 18, -0.5F, 0.1412F, -0.5958F, 1, 1, 3, -0.101F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.05F, 1.725F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 38, 23, -0.5F, 0.2558F, 0.0913F, 1, 1, 2, -0.1F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(1.7875F, 0.0F, 4.65F);
        this.main.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.3182F, 0.3F, -1.38F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.0375F, 2.25F, 0.0F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, -0.9599F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(-0.8F, 0.35F, 4.25F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 2.3828F, -0.1596F, 0.3432F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-1.7875F, 0.0F, 4.65F);
        this.main.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.214F, -0.2191F, 1.2987F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0375F, 2.25F, 0.0F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, -0.9599F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.8F, 0.35F, 4.25F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 2.3828F, 0.1596F, -0.3432F);

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
