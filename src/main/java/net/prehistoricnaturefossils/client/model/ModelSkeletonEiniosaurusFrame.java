package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEiniosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftfoot2;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightfoot2;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head;
    private final ModelRenderer leftCheek;
    private final ModelRenderer rightCheek;
    private final ModelRenderer leftBeak;
    private final ModelRenderer rightBeak;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer leftLowerbeak;
    private final ModelRenderer rightLowerbeak;
    private final ModelRenderer frill;
    private final ModelRenderer leftFrill;
    private final ModelRenderer rightFrill;

    public ModelSkeletonEiniosaurusFrame() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -28.0F, 5.7F, 1, 28, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -19.0F, -12.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.9F, -5.0F, -0.5F, 1, 24, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -19.0F, -12.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -2.5F, -7.0F, -0.5F, 1, 11, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -21.0F, 6.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 5.5F, -5.5F, -0.5F, 1, 12, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -26.3F, 6.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1396F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 1, 21, -0.5F, -2.5695F, -4.9874F, 1, 2, 12, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.4075F, 6.9014F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.5039F, 0.1532F, -0.0839F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 36, -0.5F, 0.8038F, 0.0069F, 1, 2, 9, 0.004F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.9361F, 8.8961F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0804F, 0.2175F, -0.0174F);
        this.tail2.cubeList.add(new ModelBox(tail2, 29, 21, -0.5F, -0.1697F, -0.1085F, 1, 2, 10, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.9272F, 9.6761F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2449F, 0.3821F, 0.0929F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 48, -0.5F, 0.497F, -0.2166F, 1, 1, 9, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0741F, 8.8502F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.3284F, -0.29F, -0.0971F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.4468F, -0.7914F, 1, 1, 19, -0.15F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(4.9F, -1.3967F, 0.2206F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.5847F, 0.0F, 0.0F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 13.7762F, -4.4099F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, -0.0262F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 8.6865F, 4.6725F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.0175F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 3.2542F, 0.3595F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.0873F, 0.0F, 0.0F);


        this.leftfoot2 = new ModelRenderer(this);
        this.leftfoot2.setRotationPoint(0.0F, 1.3686F, -1.7616F);
        this.leftfoot.addChild(leftfoot2);
        this.setRotateAngle(leftfoot2, 0.0262F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-4.9F, -1.3967F, 0.2206F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.1484F, 0.0F, 0.0F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 13.7762F, -4.4099F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.0175F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 8.6865F, 4.6725F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.1047F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 3.2542F, 0.3595F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.0873F, 0.0F, 0.0F);


        this.rightfoot2 = new ModelRenderer(this);
        this.rightfoot2.setRotationPoint(0.0F, 1.3686F, -1.7616F);
        this.rightfoot.addChild(rightfoot2);
        this.setRotateAngle(rightfoot2, -0.0175F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.9194F, -4.923F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1408F, 0.1296F, 0.0183F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5816F, -5.8961F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3403F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 55, 17, -0.5F, 0.9255F, -5.9424F, 1, 2, 6, 0.004F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.7184F, 1.8039F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0087F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 50, -0.5F, -0.3073F, -7.6534F, 1, 2, 6, 0.008F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 2.5184F, -11.6961F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0435F, 0.0038F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 3.186F, -6.0216F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5061F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 0, -0.5F, 0.093F, -0.4666F, 1, 2, 8, 0.0F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(5.5F, 9.5518F, -2.9424F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.5672F, 0.0F, -0.1745F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.6479F, 7.5571F, 4.5001F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.3322F, -1.2608F, 0.0482F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(0.1439F, 7.5086F, -2.6347F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 1.0463F, 0.6267F, -0.3359F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-5.5F, 9.5518F, -2.9424F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.0F, 0.0F, 0.1745F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.6479F, 7.5571F, 4.5001F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.4806F, 1.2395F, -0.8996F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(-0.1439F, 7.5086F, -2.6347F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.869F, -0.5719F, 0.4181F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 3.486F, -6.1216F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, -0.1274F, 0.1462F, 0.2625F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.2F, -1.5F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1314F, 0.0865F, 0.0114F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 74, 36, -0.7F, -0.3F, 1.4F, 1, 2, 1, 0.004F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 70, 33, -0.7F, -0.3F, -3.5F, 1, 2, 5, 0.004F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -4.6F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.1543F, 0.6319F, 0.3651F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.4F, -0.2F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 80, 0, -0.5F, -0.4F, -3.7F, 1, 2, 4, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3821F, -4.1095F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1329F, 0.1215F, 0.0246F);


        this.leftCheek = new ModelRenderer(this);
        this.leftCheek.setRotationPoint(2.274F, -0.7211F, -0.6148F);
        this.head.addChild(leftCheek);
        this.setRotateAngle(leftCheek, -1.2654F, 0.0349F, 0.0F);


        this.rightCheek = new ModelRenderer(this);
        this.rightCheek.setRotationPoint(-2.274F, -0.7211F, -0.6148F);
        this.head.addChild(rightCheek);
        this.setRotateAngle(rightCheek, -1.2654F, -0.0349F, 0.0F);


        this.leftBeak = new ModelRenderer(this);
        this.leftBeak.setRotationPoint(0.4296F, 6.8558F, -8.2316F);
        this.head.addChild(leftBeak);


        this.rightBeak = new ModelRenderer(this);
        this.rightBeak.setRotationPoint(-0.4296F, 6.8558F, -8.2316F);
        this.head.addChild(rightBeak);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.3F, 5.1433F, -6.3625F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.3F, 5.1433F, -6.3625F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 2.1994F, -0.995F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3491F, 0.0F, 0.0F);


        this.leftLowerbeak = new ModelRenderer(this);
        this.leftLowerbeak.setRotationPoint(0.0967F, 5.2221F, -2.2912F);
        this.jaw.addChild(leftLowerbeak);
        this.setRotateAngle(leftLowerbeak, 0.48F, 0.0F, 0.0F);


        this.rightLowerbeak = new ModelRenderer(this);
        this.rightLowerbeak.setRotationPoint(-1.2967F, 5.2221F, -2.2912F);
        this.jaw.addChild(rightLowerbeak);
        this.setRotateAngle(rightLowerbeak, 0.48F, 0.0F, 0.0F);


        this.frill = new ModelRenderer(this);
        this.frill.setRotationPoint(0.0F, -0.8567F, -2.0625F);
        this.head.addChild(frill);
        this.setRotateAngle(frill, -0.0873F, 0.0F, 0.0F);


        this.leftFrill = new ModelRenderer(this);
        this.leftFrill.setRotationPoint(1.2589F, -6.4283F, 4.8516F);
        this.frill.addChild(leftFrill);
        this.setRotateAngle(leftFrill, -0.2906F, -0.4787F, 0.2378F);


        this.rightFrill = new ModelRenderer(this);
        this.rightFrill.setRotationPoint(-1.2589F, -6.4283F, 4.8516F);
        this.frill.addChild(rightFrill);
        this.setRotateAngle(rightFrill, -0.2906F, 0.4787F, -0.2378F);

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
