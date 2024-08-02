package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonComptonatusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r2;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r3;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer opposablePinkie;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer opposablePinkie2;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head2;
    private final ModelRenderer jaw;

    public ModelSkeletonComptonatusFrame() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 4.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -25.0F, -0.9F, 1, 25, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -1.4F, -20.0F, -19.9F, 1, 20, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -23.0F, -19.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -8.9F, -5.0F, -0.5F, 1, 10, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.1F, -4.0F, 18.5F, 1, 9, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -24.5F, 0.0F);
        this.fossil.addChild(hips);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.7F, 0.4F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.192F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 33, -0.5F, 0.5927F, -0.6763F, 1, 2, 6, -0.153F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.5F, 0.6F, -0.5F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.2531F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 9.9686F, 0.0984F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9774F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 10.8354F, -0.9811F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6981F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 3.2F, -0.4F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.4538F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.5F, 0.6F, -0.5F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2269F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 9.9686F, 0.0984F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7592F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 10.8354F, -0.9811F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6545F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 3.2F, -0.4F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.1484F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.rightLeg4.addChild(rightLeg5);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2F, 5.6F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.393F, -0.041F, 0.0149F);
        this.tail.cubeList.add(new ModelBox(tail, 14, 3, -0.5F, 0.0792F, -0.1659F, 1, 2, 9, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.5792F, 8.9341F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1222F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 40, -0.5F, -0.4993F, -0.4616F, 1, 2, 6, -0.153F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.5208F, 13.7341F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.236F, -0.2181F, -0.0039F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.4889F, 5.0992F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, 0.5F, -5.1F, 1, 1, 10, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2889F, 9.9992F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1398F, -0.1745F, -0.0015F);
        this.tail3.cubeList.add(new ModelBox(tail3, 9, 39, -0.5F, 0.0712F, -0.4953F, 1, 1, 6, -0.153F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0712F, 5.7047F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, -0.3491F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.6F, 0.0F);
        this.tail4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0175F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 14, -0.6F, 0.6F, -0.7F, 1, 1, 6, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.2F, 4.9F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.2287F, -0.2614F, -0.014F);
        this.tail5.cubeList.add(new ModelBox(tail5, 14, 15, -0.5F, 0.1992F, -0.3314F, 1, 1, 9, -0.153F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1F, -0.1F);
        this.hips.addChild(body);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.2F, -10.9F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2007F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 26, -0.5F, 0.9421F, 0.031F, 1, 2, 6, -0.153F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.4F, -5.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0785F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 42, -0.5F, 0.9501F, 0.0121F, 1, 2, 5, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.6F, -10.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.0873F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.5F, -5.8F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4451F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 15, -0.5F, 1.289F, 0.18F, 1, 2, 6, -0.15F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.6F, 9.8F, -8.4F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.6981F, 0.0F, -0.1745F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0611F, 6.3871F, 1.4344F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.5424F, 0.4728F, -0.1272F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.2F, 6.0F, -1.5F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.3167F, 0.3165F, 0.1985F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(0.0294F, 0.3F, 1.749F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 1.1781F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.6F, 9.8F, -8.4F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.0873F, 0.0F, 0.1745F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0611F, 6.3871F, 1.4344F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.4786F, -0.4933F, 0.0837F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.2F, 6.0F, -1.5F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.4792F, -0.1957F, -0.4882F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.0294F, 0.3F, 1.749F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 1.1781F, 0.0F, 0.0F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.5F, 2.057F, -5.3557F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, 0.0873F, 0.0435F, 0.0038F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.5367F, -3.5496F);
        this.neck4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 33, 56, -1.0F, 0.5521F, 0.1023F, 1, 1, 4, -0.153F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(-0.5F, 1.8797F, -3.694F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.5073F, 0.0825F, 0.0285F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0707F, 0.1123F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2793F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 47, -0.5F, 0.1503F, -4.1205F, 1, 1, 5, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.4409F, -4.4814F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.1162F, 0.1031F, -0.0486F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -0.0647F, 0.288F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.576F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 37, -1.0F, 0.5073F, -6.0235F, 1, 1, 7, -0.153F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.0462F, -4.5811F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.5179F, 0.1822F, -0.0317F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.4308F, -5.3942F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2443F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 35, 30, -0.5F, 0.416F, -0.2034F, 1, 1, 6, -0.15F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -1.1308F, -5.4942F);
        this.neck.addChild(head2);
        this.setRotateAngle(head2, 0.6676F, 0.1635F, -0.0686F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.5674F, -0.4404F);
        this.head2.addChild(jaw);
        this.setRotateAngle(jaw, 0.4278F, -0.0016F, 0.0113F);

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
