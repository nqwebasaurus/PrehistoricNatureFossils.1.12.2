package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCentrosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
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
    private final ModelRenderer frill;
    private final ModelRenderer leftFrill;
    private final ModelRenderer rightFrill;
    private final ModelRenderer jaw;
    private final ModelRenderer leftLowerbeak;
    private final ModelRenderer leftLowerbeak3;
    private final ModelRenderer rightLowerbeak;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonCentrosaurusFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -28.0F, 6.0F, 1, 28, 1, -0.1F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -21.75F, -13.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0175F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -5.25F, -6.5F, -0.5F, 1, 13, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -21.75F, -13.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0175F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.2F, -3.25F, -0.5F, 1, 25, 1, -0.1F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -26.5F, 6.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.5F, -6.5F, -0.5F, 1, 12, 1, 0.0F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -26.3F, 6.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1396F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 0, -0.5F, -2.5695F, -4.9874F, 1, 2, 12, 0.008F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(4.9F, -0.4967F, 0.2206F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.0175F, 0.0F, 0.0F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 13.7762F, -4.4099F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.192F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 8.6865F, 4.6725F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.3229F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 3.2542F, 0.3595F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.0873F, 0.0F, 0.0F);


        this.leftfoot2 = new ModelRenderer(this);
        this.leftfoot2.setRotationPoint(0.0F, 1.3686F, -1.7616F);
        this.leftfoot.addChild(leftfoot2);
        this.setRotateAngle(leftfoot2, -0.2793F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-4.9F, -0.5967F, 0.2206F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.4974F, 0.0F, 0.0F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 13.7762F, -4.4099F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.0175F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 8.6865F, 4.6725F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.4189F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 3.2542F, 0.3595F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.0873F, 0.0F, 0.0F);


        this.rightfoot2 = new ModelRenderer(this);
        this.rightfoot2.setRotationPoint(0.0F, 1.3686F, -1.7616F);
        this.rightfoot.addChild(rightfoot2);
        this.setRotateAngle(rightfoot2, 0.3752F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.9194F, -4.923F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1398F, -0.0432F, -0.0061F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5816F, -5.8961F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3403F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 45, -0.5F, 0.9255F, -5.9424F, 1, 2, 6, 0.008F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.7184F, 1.8039F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0087F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 46, -0.5F, -0.3073F, -7.6534F, 1, 2, 6, 0.004F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 2.5184F, -11.6961F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, -0.0435F, -0.0038F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 3.186F, -6.0216F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5061F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 30, -0.5F, 0.093F, -0.4666F, 1, 2, 8, 0.0F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(5.5F, 9.5518F, -2.9424F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.3927F, 0.0F, -0.1745F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.6479F, 7.5571F, 4.5001F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.352F, -1.1195F, 0.7608F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(0.1439F, 7.5086F, -2.6347F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 1.2026F, 0.8597F, -0.5376F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-5.5F, 9.5518F, -2.9424F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.3927F, 0.0F, 0.1745F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.6479F, 7.5571F, 4.5001F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.7167F, 0.8757F, -1.2886F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(-0.1439F, 7.5086F, -2.6347F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 1.2464F, -0.6356F, 0.6604F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 3.486F, -6.1216F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.0437F, 0.0436F, 0.0019F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.2F, -1.5F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 58, 14, -0.5F, -0.1F, -3.3F, 1, 2, 5, 0.008F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -4.6F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.3054F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.4F, -0.2F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 35, -0.5F, -0.4F, -6.7F, 1, 2, 7, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.6F, -6.6F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.5205F, 0.1206F, 0.0689F);


        this.leftCheek = new ModelRenderer(this);
        this.leftCheek.setRotationPoint(2.274F, 0.3415F, -0.8995F);
        this.head.addChild(leftCheek);
        this.setRotateAngle(leftCheek, -1.2654F, 0.0349F, 0.0F);


        this.rightCheek = new ModelRenderer(this);
        this.rightCheek.setRotationPoint(-2.274F, 0.3415F, -0.8995F);
        this.head.addChild(rightCheek);
        this.setRotateAngle(rightCheek, -1.2654F, -0.0349F, 0.0F);


        this.leftBeak = new ModelRenderer(this);
        this.leftBeak.setRotationPoint(0.5296F, 4.4904F, -9.6277F);
        this.head.addChild(leftBeak);


        this.rightBeak = new ModelRenderer(this);
        this.rightBeak.setRotationPoint(-0.5296F, 4.4904F, -9.6277F);
        this.head.addChild(rightBeak);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.3F, 5.1433F, -6.3625F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.3F, 5.1433F, -6.3625F);
        this.head.addChild(rightFace);


        this.frill = new ModelRenderer(this);
        this.frill.setRotationPoint(0.0F, -0.8567F, -2.0625F);
        this.head.addChild(frill);
        this.setRotateAngle(frill, -0.0873F, 0.0F, 0.0F);


        this.leftFrill = new ModelRenderer(this);
        this.leftFrill.setRotationPoint(1.517F, -4.8651F, 3.2714F);
        this.frill.addChild(leftFrill);
        this.setRotateAngle(leftFrill, -0.28F, -0.8409F, 0.3628F);


        this.rightFrill = new ModelRenderer(this);
        this.rightFrill.setRotationPoint(-1.517F, -4.8651F, 3.2714F);
        this.frill.addChild(rightFrill);
        this.setRotateAngle(rightFrill, -0.28F, 0.8409F, -0.3628F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 3.0433F, -0.0625F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0116F, -0.0663F, -0.0218F);


        this.leftLowerbeak = new ModelRenderer(this);
        this.leftLowerbeak.setRotationPoint(0.1F, 5.0745F, -4.9065F);
        this.jaw.addChild(leftLowerbeak);
        this.setRotateAngle(leftLowerbeak, 0.3713F, 0.2075F, 0.0882F);


        this.leftLowerbeak3 = new ModelRenderer(this);
        this.leftLowerbeak3.setRotationPoint(-2.1F, 4.9745F, -4.9065F);
        this.jaw.addChild(leftLowerbeak3);
        this.setRotateAngle(leftLowerbeak3, 0.366F, -0.1261F, -0.0563F);


        this.rightLowerbeak = new ModelRenderer(this);
        this.rightLowerbeak.setRotationPoint(-2.3F, 7.6745F, -5.4065F);
        this.jaw.addChild(rightLowerbeak);
        this.setRotateAngle(rightLowerbeak, 0.0533F, -0.2018F, -0.2671F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.3611F, 6.9741F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2831F, -0.2916F, 0.0913F);
        this.tail.cubeList.add(new ModelBox(tail, 34, 13, -0.5F, 0.8038F, 0.0069F, 1, 2, 7, 0.004F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.9695F, 7.0283F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1243F, -0.1267F, 0.033F);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 20, -0.5F, -0.1697F, -0.1085F, 1, 2, 10, 0.008F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.9721F, 9.871F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2857F, -0.2096F, -0.061F);
        this.tail3.cubeList.add(new ModelBox(tail3, 36, 55, -0.5F, 0.597F, -0.7166F, 1, 1, 7, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0451F, 5.842F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.4834F, 0.2423F, 0.1F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 15, -0.5F, 0.5468F, -0.4914F, 1, 1, 13, -0.1F, false));

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
