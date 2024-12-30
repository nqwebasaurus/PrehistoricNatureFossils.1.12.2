package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonKubanochoerusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r3;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer leftLeg6;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer rightLeg6;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body4;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck3;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer leftOrbit;
    private final ModelRenderer rightOrbit;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonKubanochoerusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -21.0F, 9.0F, 1, 21, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, 0.8F, -20.0F, -14.5F, 1, 20, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -15.0F, -14.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 0.3F, -6.0F, -0.5F, 1, 10, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -15.0F, 9.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -3.0F, -3.5F, -0.5F, 1, 7, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -20.6804F, 9.0354F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.2443F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.1F, -3.5F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4451F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 0, -0.5F, 0.6014F, 0.0389F, 1, 1, 6, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.9F, 3.0783F, 0.0971F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.4363F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.3658F, 1.2742F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.3875F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.3F, 6.5394F, -0.4592F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.672F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.3F, 4.0137F, -0.5935F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, -0.5149F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.4F, 0.0417F, 0.1521F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.4014F, 0.0F, 0.0F);


        this.leftLeg6 = new ModelRenderer(this);
        this.leftLeg6.setRotationPoint(-0.4384F, 0.0421F, 0.0778F);
        this.leftLeg5.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, -0.2182F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.9F, 3.0783F, 0.0971F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -1.0908F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.3658F, 1.2742F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0821F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.3F, 6.5394F, -0.4592F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7156F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.3F, 4.0137F, -0.5935F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -0.5149F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(-0.4F, 0.0417F, 0.1521F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.4014F, 0.0F, 0.0F);


        this.rightLeg6 = new ModelRenderer(this);
        this.rightLeg6.setRotationPoint(0.4384F, 0.0421F, 0.0778F);
        this.rightLeg5.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.0873F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.4979F, -3.8073F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, -0.0961F, -0.0434F, 0.0042F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.4656F, -13.1997F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2094F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 26, -0.5F, 0.5488F, 8.9474F, 1, 1, 5, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.702F, -4.6624F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.1572F, -0.0431F, 0.0068F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 26, -0.5F, -0.3F, -4.4F, 1, 1, 6, -0.15F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.2F, -5.0F);
        this.body.addChild(body3);
        this.setRotateAngle(body3, -0.0873F, 0.0435F, -0.0038F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.8F, 0.0F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 34, -0.5F, 0.7148F, -4.2846F, 1, 1, 4, -0.15F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.8534F, -3.7849F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.3668F, -0.0407F, -0.0156F);
        this.body4.cubeList.add(new ModelBox(body4, 9, 45, -0.5F, 0.0433F, -2.9266F, 1, 1, 3, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2486F, -2.6294F);
        this.body4.addChild(chest);
        this.setRotateAngle(chest, -0.3316F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 5.0607F, -9.7986F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3403F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 6, -0.5F, -1.208F, 6.94F, 1, 1, 4, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(4.5F, 5.8809F, -2.2869F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.5627F, -0.2172F, -0.0161F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 5.5475F, 1.6695F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.5323F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.2F, 5.0911F, 1.2917F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.6981F, 0.0F, 0.0F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 3.4278F, -0.3069F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.3491F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-4.5F, 5.8809F, -2.2869F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.5149F, 0.0F, 0.0F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 5.5475F, 1.6695F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.5323F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.2F, 5.0911F, 1.2917F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0873F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 3.4278F, -0.3069F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.5236F, 0.0F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.4696F, -3.6084F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.0611F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.0131F, -5.7998F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, -1, 69, -0.5F, 0.5F, 3.4F, 1, 1, 3, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.2408F, -2.0585F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.6369F, -0.2621F, 0.0864F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.1701F, -2.3853F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0698F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 45, -0.5F, 0.0835F, -0.2594F, 1, 1, 3, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.1217F, -2.5225F);
        this.neck.addChild(neck3);
        this.setRotateAngle(neck3, 0.4268F, 0.0515F, -0.117F);
        this.neck3.cubeList.add(new ModelBox(neck3, 68, 22, -0.5F, 0.1F, -2.0F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.0921F, -3.6973F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, -0.1342F, -0.2822F, -0.1384F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.0F, 7.7298F, -5.0083F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(0.0F, 7.7298F, -5.0083F);
        this.head.addChild(rightFace);


        this.leftOrbit = new ModelRenderer(this);
        this.leftOrbit.setRotationPoint(0.1F, 3.2979F, 0.5427F);
        this.head.addChild(leftOrbit);
        this.setRotateAngle(leftOrbit, -0.2793F, 0.0F, 0.0F);


        this.rightOrbit = new ModelRenderer(this);
        this.rightOrbit.setRotationPoint(-0.1F, 3.2979F, 0.5427F);
        this.head.addChild(rightOrbit);
        this.setRotateAngle(rightOrbit, -0.2793F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 2.2341F, 0.8627F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.1682F, 0.0202F, -0.0005F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5464F, 1.6845F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.4276F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 62, 67, -0.5F, 0.5F, -0.1F, 1, 1, 3, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2906F, 1.9552F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 69, -0.5F, 0.1114F, 0.4422F, 1, 1, 2, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0472F, 2.1691F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2782F, -0.024F, 0.0839F);
        this.tail3.cubeList.add(new ModelBox(tail3, 27, 53, -0.5F, 0.1941F, -0.3243F, 1, 1, 3, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.3011F, 2.5565F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.3969F, 0.3239F, 0.1326F);
        this.tail4.cubeList.add(new ModelBox(tail4, 47, 28, -0.5F, -0.2162F, -0.5685F, 1, 1, 4, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0096F, 2.8844F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.4656F, 0.1144F, 0.3506F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 49, -0.5F, -0.1162F, -0.0685F, 1, 1, 3, -0.15F, false));

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
