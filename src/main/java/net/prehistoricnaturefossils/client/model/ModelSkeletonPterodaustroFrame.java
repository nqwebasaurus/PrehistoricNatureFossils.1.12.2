package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPterodaustroFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer main;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftwing7;
    private final ModelRenderer leftwing8;
    private final ModelRenderer leftwing9;
    private final ModelRenderer leftmembrane;
    private final ModelRenderer leftWing10;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightwing7;
    private final ModelRenderer rightwing8;
    private final ModelRenderer rightwing9;
    private final ModelRenderer rightmembrane;
    private final ModelRenderer rightWing10;
    private final ModelRenderer righthand;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer throat;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r10;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;

    public ModelSkeletonPterodaustroFrame() {
        this.textureWidth = 60;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, 0.6F, -9.0F, 0.2F, 1, 9, 1, -0.31F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -8.0F, 5.5F, 1, 8, 1, -0.31F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -7.1678F, 5.6209F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, -0.2618F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5245F, -0.0563F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.929F, -1.4962F, 1.9299F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 37, -0.2F, -0.4F, -2.0F, 1, 1, 4, -0.3F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.4F, -2.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 38, -0.5F, 0.2378F, 0.5F, 1, 1, 3, -0.3F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(1.5F, -0.6F, 0.275F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.2182F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 3.238F, -0.1567F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6545F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 4.9601F, 0.2718F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6109F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.5F, -0.6F, 0.275F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0873F, 0.0F, 0.1309F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 3.238F, -0.1567F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.829F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 4.9601F, 0.2718F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.4792F, -0.0114F, -0.1304F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.9F, 1.3F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.6151F, -0.3042F, 0.0275F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.3133F, 0.1049F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 41, 11, -0.5F, -0.3522F, -0.4F, 1, 1, 3, -0.3F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -1.1F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0004F, -0.2617F, -0.0058F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.467F, -2.5778F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 6, -1.0F, 0.2062F, -0.1463F, 1, 1, 3, -0.3F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.4641F, -3.6665F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.5708F, -1.3788F, -1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 33, -1.1F, -0.3F, -2.3F, 1, 1, 4, -0.3F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.533F, -4.8778F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.192F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 34, -1.0F, -0.3366F, -0.2978F, 1, 1, 3, -0.3F, false));

        this.leftwing7 = new ModelRenderer(this);
        this.leftwing7.setRotationPoint(1.4599F, 0.2404F, -4.1854F);
        this.body.addChild(leftwing7);
        this.setRotateAngle(leftwing7, 0.2651F, -0.7585F, -0.0165F);


        this.leftwing8 = new ModelRenderer(this);
        this.leftwing8.setRotationPoint(3.6242F, 0.4493F, -0.2248F);
        this.leftwing7.addChild(leftwing8);
        this.setRotateAngle(leftwing8, 1.2678F, 0.948F, 1.8759F);


        this.leftwing9 = new ModelRenderer(this);
        this.leftwing9.setRotationPoint(6.4115F, -0.0206F, -0.1872F);
        this.leftwing8.addChild(leftwing9);
        this.setRotateAngle(leftwing9, 3.0786F, 0.4335F, -2.5914F);


        this.leftmembrane = new ModelRenderer(this);
        this.leftmembrane.setRotationPoint(-3.9771F, 0.3716F, -0.502F);
        this.leftwing9.addChild(leftmembrane);
        this.setRotateAngle(leftmembrane, 2.8158F, -0.3912F, -2.9774F);


        this.leftWing10 = new ModelRenderer(this);
        this.leftWing10.setRotationPoint(-6.45F, 0.0F, 0.0F);
        this.leftmembrane.addChild(leftWing10);
        this.setRotateAngle(leftWing10, 0.0574F, 0.0265F, -0.0502F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(-4.1563F, 0.2752F, -0.0881F);
        this.leftwing9.addChild(lefthand);
        this.setRotateAngle(lefthand, 2.8822F, -0.109F, -3.0031F);


        this.rightwing7 = new ModelRenderer(this);
        this.rightwing7.setRotationPoint(-1.4599F, 0.2404F, -4.1854F);
        this.body.addChild(rightwing7);
        this.setRotateAngle(rightwing7, -0.0316F, 0.3982F, -0.4698F);


        this.rightwing8 = new ModelRenderer(this);
        this.rightwing8.setRotationPoint(-3.6242F, 0.4493F, -0.2248F);
        this.rightwing7.addChild(rightwing8);
        this.setRotateAngle(rightwing8, 0.716F, -0.9014F, -1.4154F);


        this.rightwing9 = new ModelRenderer(this);
        this.rightwing9.setRotationPoint(-6.4115F, -0.0206F, -0.1872F);
        this.rightwing8.addChild(rightwing9);
        this.setRotateAngle(rightwing9, 3.1411F, -0.6374F, 2.6134F);


        this.rightmembrane = new ModelRenderer(this);
        this.rightmembrane.setRotationPoint(3.9771F, 0.3716F, -0.502F);
        this.rightwing9.addChild(rightmembrane);
        this.setRotateAngle(rightmembrane, 2.8158F, 0.3912F, 2.9774F);


        this.rightWing10 = new ModelRenderer(this);
        this.rightWing10.setRotationPoint(6.45F, 0.0F, 0.0F);
        this.rightmembrane.addChild(rightWing10);
        this.setRotateAngle(rightWing10, 0.0574F, -0.0265F, 0.0502F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(4.1563F, 0.2752F, -0.0881F);
        this.rightwing9.addChild(righthand);
        this.setRotateAngle(righthand, 2.8822F, 0.109F, 3.0031F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1657F, -4.8299F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.5247F, -0.1298F, -0.0172F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.3727F, -2.7539F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 29, -0.5F, 0.2447F, -0.1295F, 1, 1, 3, -0.3F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0023F, -2.4039F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1275F, -0.3045F, 0.0497F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.2494F, -2.5366F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0175F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 39, -0.5F, -0.4F, -0.3F, 1, 1, 3, -0.3F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.1006F, -2.5366F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1677F, -0.2577F, -0.2509F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.404F, -2.574F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 37, 20, 0.0F, -0.4F, 2.0F, 1, 1, 1, -0.3F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 18, 0.0F, -0.4F, -0.4F, 1, 1, 3, -0.3F, false));

        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(-0.5F, 1.054F, 0.226F);
        this.neck3.addChild(throat);
        this.setRotateAngle(throat, 0.3054F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.2019F, -2.4568F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.3996F, -0.2271F, 0.2362F);
        this.neck4.cubeList.add(new ModelBox(neck4, 0, 45, -0.5F, -0.1645F, -1.6582F, 1, 1, 2, -0.3F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 0.2855F, -1.6582F);
        this.neck4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1571F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 33, 0.5F, -0.55F, -3.3F, 1, 1, 4, -0.3F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1395F, -3.6582F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 1.2097F, 0.0659F, 0.178F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.645F, -0.5577F, -0.2423F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.645F, -0.5577F, -0.2423F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5696F, -0.1994F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4102F, 0.0F, 0.0F);

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
