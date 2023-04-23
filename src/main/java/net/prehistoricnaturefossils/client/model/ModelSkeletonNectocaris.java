package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonNectocaris extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Center;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer head1;
    private final ModelRenderer finL;
    private final ModelRenderer finR;
    private final ModelRenderer head2;
    private final ModelRenderer finL2;
    private final ModelRenderer finR2;
    private final ModelRenderer head3;
    private final ModelRenderer finL3;
    private final ModelRenderer finR3;
    private final ModelRenderer head4;
    private final ModelRenderer finL4;
    private final ModelRenderer finR4;
    private final ModelRenderer head5;
    private final ModelRenderer finL5;
    private final ModelRenderer finR5;
    private final ModelRenderer head6;
    private final ModelRenderer finL6;
    private final ModelRenderer finR6;
    private final ModelRenderer nozzle;
    private final ModelRenderer eye1;
    private final ModelRenderer eye2;
    private final ModelRenderer eye3;
    private final ModelRenderer newtentacle;
    private final ModelRenderer newtentacle2;
    private final ModelRenderer newtentacle3;
    private final ModelRenderer newtentacle4;
    private final ModelRenderer newtentacle5;
    private final ModelRenderer newtentacle6;
    private final ModelRenderer newtentacle7;
    private final ModelRenderer newtentacle8;
    private final ModelRenderer newtentacle9;
    private final ModelRenderer newtentacle10;
    private final ModelRenderer newtentacle11;
    private final ModelRenderer newtentacle12;
    private final ModelRenderer newtentacle13;
    private final ModelRenderer newtentacle14;
    private final ModelRenderer newtentacletwo;
    private final ModelRenderer newtentacletwo2;
    private final ModelRenderer newtentacletwo3;
    private final ModelRenderer newtentacletwo4;
    private final ModelRenderer newtentacletwo5;
    private final ModelRenderer newtentacletwo6;
    private final ModelRenderer newtentacletwo7;
    private final ModelRenderer newtentacletwo8;
    private final ModelRenderer newtentacletwo9;
    private final ModelRenderer newtentacletwo10;
    private final ModelRenderer newtentacletwo11;
    private final ModelRenderer newtentacletwo12;
    private final ModelRenderer newtentacletwo13;
    private final ModelRenderer newtentacletwo14;

    public ModelSkeletonNectocaris() {
        this.textureWidth = 128;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -7.0F, -2.0F, -24.0F, 16, 2, 46, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -13.0F, -2.0F, -24.0F, 6, 2, 12, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-13.0F, -1.0F, -12.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 49, 0.0F, -1.0F, 0.0F, 6, 2, 34, -0.002F, false));

        this.Center = new ModelRenderer(this);
        this.Center.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.fossil.addChild(Center);
        this.Center.cubeList.add(new ModelBox(Center, 0, 31, -1.5F, -2.2F, -1.0F, 3, 0, 4, 0.0F, false));
        this.Center.cubeList.add(new ModelBox(Center, 0, 23, -1.0F, -2.18F, 2.7F, 2, 0, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.0F, -0.7F, -1.0F);
        this.Center.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3491F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 23, 0.0F, -1.67F, 0.0F, 2, 0, 4, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(3.0F, -0.7F, -1.0F);
        this.Center.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.3491F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 35, -2.0F, -1.58F, 0.0F, 2, 0, 4, 0.0F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, -3.0F, -1.0F);
        this.Center.addChild(head1);
        this.head1.cubeList.add(new ModelBox(head1, 25, 0, -3.0F, 0.8F, -3.0F, 6, 0, 3, 0.0F, false));

        this.finL = new ModelRenderer(this);
        this.finL.setRotationPoint(-3.0F, 0.5F, -2.0F);
        this.head1.addChild(finL);


        this.finR = new ModelRenderer(this);
        this.finR.setRotationPoint(3.0F, 0.5F, -2.0F);
        this.head1.addChild(finR);
        this.finR.cubeList.add(new ModelBox(finR, 26, 31, 0.0F, 0.4F, -1.0F, 4, 0, 3, 0.0F, false));
        this.finR.cubeList.add(new ModelBox(finR, 25, 8, -10.0F, 0.4F, -1.0F, 4, 0, 3, 0.0F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -1.6F, -3.0F);
        this.head1.addChild(head2);
        this.head2.cubeList.add(new ModelBox(head2, 0, 15, -4.0F, 2.4F, -7.0F, 8, 0, 7, 0.0F, false));

        this.finL2 = new ModelRenderer(this);
        this.finL2.setRotationPoint(-4.0F, 0.5F, -4.0F);
        this.head2.addChild(finL2);


        this.finR2 = new ModelRenderer(this);
        this.finR2.setRotationPoint(4.0F, 0.5F, -4.0F);
        this.head2.addChild(finR2);
        this.finR2.cubeList.add(new ModelBox(finR2, 23, 23, 0.0F, 2.0F, -3.0F, 4, 0, 7, 0.0F, false));
        this.finR2.cubeList.add(new ModelBox(finR2, 0, 23, -12.0F, 2.0F, -3.0F, 4, 0, 7, 0.0F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.5F, -7.0F);
        this.head2.addChild(head3);
        this.head3.cubeList.add(new ModelBox(head3, 24, 15, -3.5F, 1.9F, -3.0F, 7, 0, 3, 0.0F, false));

        this.finL3 = new ModelRenderer(this);
        this.finL3.setRotationPoint(-3.5F, 0.5F, -1.5F);
        this.head3.addChild(finL3);


        this.finR3 = new ModelRenderer(this);
        this.finR3.setRotationPoint(3.5F, 0.5F, -1.5F);
        this.head3.addChild(finR3);
        this.finR3.cubeList.add(new ModelBox(finR3, 31, 19, -0.5F, 1.5F, -1.5F, 4, 0, 3, 0.0F, false));
        this.finR3.cubeList.add(new ModelBox(finR3, 11, 31, -10.5F, 1.5F, -1.5F, 4, 0, 3, 0.0F, false));

        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.head3.addChild(head4);
        this.head4.cubeList.add(new ModelBox(head4, 25, 4, -3.0F, 1.4F, -3.0F, 6, 0, 3, 0.0F, false));

        this.finL4 = new ModelRenderer(this);
        this.finL4.setRotationPoint(-3.0F, 0.5F, -1.0F);
        this.head4.addChild(finL4);


        this.finR4 = new ModelRenderer(this);
        this.finR4.setRotationPoint(3.0F, 0.5F, -1.0F);
        this.head4.addChild(finR4);
        this.finR4.cubeList.add(new ModelBox(finR4, 33, 35, -1.0F, 1.0F, -2.0F, 3, 0, 3, 0.0F, false));
        this.finR4.cubeList.add(new ModelBox(finR4, 20, 35, -8.0F, 1.0F, -2.0F, 3, 0, 3, 0.0F, false));

        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.head4.addChild(head5);
        this.head5.cubeList.add(new ModelBox(head5, 0, 36, -2.0F, 0.9F, -2.0F, 4, 0, 2, 0.0F, false));

        this.finL5 = new ModelRenderer(this);
        this.finL5.setRotationPoint(-2.0F, 0.5F, -1.0F);
        this.head5.addChild(finL5);


        this.finR5 = new ModelRenderer(this);
        this.finR5.setRotationPoint(2.0F, 0.5F, -1.0F);
        this.head5.addChild(finR5);
        this.finR5.cubeList.add(new ModelBox(finR5, 0, 9, -1.0F, 0.5F, -1.0F, 3, 0, 2, 0.0F, false));
        this.finR5.cubeList.add(new ModelBox(finR5, 0, 0, -6.0F, 0.5F, -1.0F, 3, 0, 2, 0.0F, false));

        this.head6 = new ModelRenderer(this);
        this.head6.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.head5.addChild(head6);
        this.head6.cubeList.add(new ModelBox(head6, 0, 25, -1.0F, 0.9F, -1.0F, 2, 0, 1, 0.0F, false));

        this.finL6 = new ModelRenderer(this);
        this.finL6.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.head6.addChild(finL6);


        this.finR6 = new ModelRenderer(this);
        this.finR6.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.head6.addChild(finR6);
        this.finR6.cubeList.add(new ModelBox(finR6, 0, 6, 0.0F, 0.5F, -1.0F, 3, 0, 2, 0.0F, false));
        this.finR6.cubeList.add(new ModelBox(finR6, 0, 3, -3.0F, 0.5F, -1.0F, 3, 0, 2, 0.0F, false));

        this.nozzle = new ModelRenderer(this);
        this.nozzle.setRotationPoint(-1.7F, -2.65F, 2.05F);
        this.Center.addChild(nozzle);
        this.setRotateAngle(nozzle, -1.8762F, 0.0F, 1.5708F);
        this.nozzle.cubeList.add(new ModelBox(nozzle, 0, 15, 0.5F, -0.234F, -0.1072F, 0, 2, 3, 0.0F, false));

        this.eye1 = new ModelRenderer(this);
        this.eye1.setRotationPoint(-1.0F, -4.0F, 2.0F);
        this.Center.addChild(eye1);
        this.setRotateAngle(eye1, 0.0F, 0.2182F, 0.1745F);


        this.eye2 = new ModelRenderer(this);
        this.eye2.setRotationPoint(1.0F, -4.0F, 2.0F);
        this.Center.addChild(eye2);
        this.setRotateAngle(eye2, 0.0F, -0.2182F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 37, 8, 0.4F, 1.7F, -0.5F, 2, 0, 2, 0.0F, false));

        this.eye3 = new ModelRenderer(this);
        this.eye3.setRotationPoint(-1.0F, -4.0F, 2.0F);
        this.Center.addChild(eye3);
        this.setRotateAngle(eye3, 0.0F, 0.2182F, 0.0F);
        this.eye3.cubeList.add(new ModelBox(eye3, 24, 19, -2.4F, 1.7F, -0.5F, 2, 0, 2, 0.0F, false));

        this.newtentacle = new ModelRenderer(this);
        this.newtentacle.setRotationPoint(-0.75F, -2.6F, 3.0F);
        this.Center.addChild(newtentacle);
        this.setRotateAngle(newtentacle, 0.0F, -0.0873F, 0.0F);
        this.newtentacle.cubeList.add(new ModelBox(newtentacle, 41, 13, -0.5F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacle2 = new ModelRenderer(this);
        this.newtentacle2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle.addChild(newtentacle2);
        this.newtentacle2.cubeList.add(new ModelBox(newtentacle2, 41, 11, -0.51F, 0.49F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacle3 = new ModelRenderer(this);
        this.newtentacle3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle2.addChild(newtentacle3);
        this.setRotateAngle(newtentacle3, 0.0F, 0.0873F, 0.0F);
        this.newtentacle3.cubeList.add(new ModelBox(newtentacle3, 5, 41, -0.5F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacle4 = new ModelRenderer(this);
        this.newtentacle4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle3.addChild(newtentacle4);
        this.setRotateAngle(newtentacle4, 0.0F, -0.7854F, 0.0F);
        this.newtentacle4.cubeList.add(new ModelBox(newtentacle4, 41, 4, -0.51F, 0.49F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacle5 = new ModelRenderer(this);
        this.newtentacle5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle4.addChild(newtentacle5);
        this.newtentacle5.cubeList.add(new ModelBox(newtentacle5, 41, 0, -0.5F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacle6 = new ModelRenderer(this);
        this.newtentacle6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle5.addChild(newtentacle6);
        this.setRotateAngle(newtentacle6, 0.0F, 0.1309F, 0.0F);
        this.newtentacle6.cubeList.add(new ModelBox(newtentacle6, 0, 41, -0.51F, 0.49F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacle7 = new ModelRenderer(this);
        this.newtentacle7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle6.addChild(newtentacle7);
        this.newtentacle7.cubeList.add(new ModelBox(newtentacle7, 19, 40, -0.5F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacle8 = new ModelRenderer(this);
        this.newtentacle8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle7.addChild(newtentacle8);
        this.setRotateAngle(newtentacle8, 0.0F, -0.1745F, 0.0F);
        this.newtentacle8.cubeList.add(new ModelBox(newtentacle8, 14, 40, -0.51F, 0.49F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacle9 = new ModelRenderer(this);
        this.newtentacle9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle8.addChild(newtentacle9);
        this.setRotateAngle(newtentacle9, 0.0F, -0.0873F, 0.0F);
        this.newtentacle9.cubeList.add(new ModelBox(newtentacle9, 9, 40, -0.5F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacle10 = new ModelRenderer(this);
        this.newtentacle10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle9.addChild(newtentacle10);
        this.setRotateAngle(newtentacle10, 0.0F, -2.8362F, 0.0F);
        this.newtentacle10.cubeList.add(new ModelBox(newtentacle10, 38, 39, -0.51F, 0.49F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacle11 = new ModelRenderer(this);
        this.newtentacle11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle10.addChild(newtentacle11);
        this.newtentacle11.cubeList.add(new ModelBox(newtentacle11, 33, 39, -0.5F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacle12 = new ModelRenderer(this);
        this.newtentacle12.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle11.addChild(newtentacle12);
        this.setRotateAngle(newtentacle12, 0.0F, 0.2182F, 0.0F);
        this.newtentacle12.cubeList.add(new ModelBox(newtentacle12, 28, 39, -0.51F, 0.49F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacle13 = new ModelRenderer(this);
        this.newtentacle13.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle12.addChild(newtentacle13);
        this.setRotateAngle(newtentacle13, 0.0F, 0.1309F, 0.0F);
        this.newtentacle13.cubeList.add(new ModelBox(newtentacle13, 39, 27, -0.5F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacle14 = new ModelRenderer(this);
        this.newtentacle14.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacle13.addChild(newtentacle14);
        this.setRotateAngle(newtentacle14, 0.0F, 0.3491F, 0.0F);
        this.newtentacle14.cubeList.add(new ModelBox(newtentacle14, 25, 25, -0.51F, 0.49F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacletwo = new ModelRenderer(this);
        this.newtentacletwo.setRotationPoint(0.75F, -2.6F, 3.0F);
        this.Center.addChild(newtentacletwo);
        this.newtentacletwo.cubeList.add(new ModelBox(newtentacletwo, 39, 25, -0.5F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacletwo2 = new ModelRenderer(this);
        this.newtentacletwo2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo.addChild(newtentacletwo2);
        this.setRotateAngle(newtentacletwo2, 0.0F, 0.2618F, 0.0F);
        this.newtentacletwo2.cubeList.add(new ModelBox(newtentacletwo2, 39, 23, -0.49F, 0.49F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacletwo3 = new ModelRenderer(this);
        this.newtentacletwo3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo2.addChild(newtentacletwo3);
        this.newtentacletwo3.cubeList.add(new ModelBox(newtentacletwo3, 23, 39, -0.5F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacletwo4 = new ModelRenderer(this);
        this.newtentacletwo4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo3.addChild(newtentacletwo4);
        this.setRotateAngle(newtentacletwo4, 0.0F, -0.2618F, 0.0F);
        this.newtentacletwo4.cubeList.add(new ModelBox(newtentacletwo4, 5, 39, -0.49F, 0.49F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacletwo5 = new ModelRenderer(this);
        this.newtentacletwo5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo4.addChild(newtentacletwo5);
        this.setRotateAngle(newtentacletwo5, 0.0F, -0.1309F, 0.0F);
        this.newtentacletwo5.cubeList.add(new ModelBox(newtentacletwo5, 0, 39, -0.5F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacletwo6 = new ModelRenderer(this);
        this.newtentacletwo6.setRotationPoint(-0.2F, 0.0F, 0.8F);
        this.newtentacletwo5.addChild(newtentacletwo6);
        this.setRotateAngle(newtentacletwo6, 0.0F, 0.7418F, 0.0F);
        this.newtentacletwo6.cubeList.add(new ModelBox(newtentacletwo6, 38, 31, -0.49F, 0.49F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacletwo7 = new ModelRenderer(this);
        this.newtentacletwo7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo6.addChild(newtentacletwo7);
        this.setRotateAngle(newtentacletwo7, 0.0F, 0.3054F, 0.0F);
        this.newtentacletwo7.cubeList.add(new ModelBox(newtentacletwo7, 37, 12, -0.5F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacletwo8 = new ModelRenderer(this);
        this.newtentacletwo8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo7.addChild(newtentacletwo8);
        this.setRotateAngle(newtentacletwo8, 0.0F, 0.1745F, 0.0F);
        this.newtentacletwo8.cubeList.add(new ModelBox(newtentacletwo8, 30, 35, -0.49F, 0.49F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacletwo9 = new ModelRenderer(this);
        this.newtentacletwo9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo8.addChild(newtentacletwo9);
        this.setRotateAngle(newtentacletwo9, 0.0F, 1.3526F, 0.0F);
        this.newtentacletwo9.cubeList.add(new ModelBox(newtentacletwo9, 23, 31, -0.5F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacletwo10 = new ModelRenderer(this);
        this.newtentacletwo10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo9.addChild(newtentacletwo10);
        this.setRotateAngle(newtentacletwo10, 0.0F, 0.48F, 0.0F);
        this.newtentacletwo10.cubeList.add(new ModelBox(newtentacletwo10, 23, 41, -0.49F, 0.49F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacletwo11 = new ModelRenderer(this);
        this.newtentacletwo11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo10.addChild(newtentacletwo11);
        this.newtentacletwo11.cubeList.add(new ModelBox(newtentacletwo11, 21, 28, -0.5F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacletwo12 = new ModelRenderer(this);
        this.newtentacletwo12.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo11.addChild(newtentacletwo12);
        this.newtentacletwo12.cubeList.add(new ModelBox(newtentacletwo12, 16, 28, -0.49F, 0.49F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacletwo13 = new ModelRenderer(this);
        this.newtentacletwo13.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo12.addChild(newtentacletwo13);
        this.setRotateAngle(newtentacletwo13, 0.0F, 0.2618F, 0.0F);
        this.newtentacletwo13.cubeList.add(new ModelBox(newtentacletwo13, 0, 27, -0.5F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.newtentacletwo14 = new ModelRenderer(this);
        this.newtentacletwo14.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.newtentacletwo13.addChild(newtentacletwo14);
        this.setRotateAngle(newtentacletwo14, 0.0F, 0.2182F, 0.0F);
        this.newtentacletwo14.cubeList.add(new ModelBox(newtentacletwo14, 25, 23, -0.49F, 0.49F, 0.0F, 1, 0, 1, 0.0F, false));
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
