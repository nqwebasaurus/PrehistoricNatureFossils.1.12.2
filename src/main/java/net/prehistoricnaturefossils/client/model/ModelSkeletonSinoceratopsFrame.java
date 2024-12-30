package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSinoceratopsFrame extends ModelBase {
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
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonSinoceratopsFrame() {
        this.textureWidth = 135;
        this.textureHeight = 135;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 1.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -28.0F, 3.3F, 1, 28, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -20.5F, -24.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -2.9F, -3.5F, -0.5F, 1, 24, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -20.5F, -24.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 2.0F, -4.0F, -0.5F, 1, 12, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -23.0F, 3.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -4.5F, -5.5F, -0.5F, 1, 12, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -28.1081F, 3.1982F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1833F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 1, 21, -0.5F, -0.2889F, -5.6091F, 1, 2, 12, 0.0F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(4.9F, 0.5838F, 0.4989F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.3665F, 0.0F, 0.0F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 13.7762F, -4.4099F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, -0.1134F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 8.6865F, 4.6725F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.0262F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 3.2542F, 0.3595F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.0873F, 0.0F, 0.0F);


        this.leftfoot2 = new ModelRenderer(this);
        this.leftfoot2.setRotationPoint(0.0F, 1.3686F, -1.7616F);
        this.leftfoot.addChild(leftfoot2);
        this.setRotateAngle(leftfoot2, 0.0262F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-4.9F, 0.5838F, 0.4989F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.5847F, 0.0F, 0.0F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 13.7762F, -4.4099F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.3229F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 8.6865F, 4.6725F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.3665F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 3.2542F, 0.3595F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.0873F, 0.0F, 0.0F);


        this.rightfoot2 = new ModelRenderer(this);
        this.rightfoot2.setRotationPoint(0.0F, 1.3686F, -1.7616F);
        this.rightfoot.addChild(rightfoot2);
        this.setRotateAngle(rightfoot2, 0.288F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5213F, -5.4155F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1402F, 0.0864F, 0.0122F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5877F, -8.0747F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2531F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 50, -0.5F, 0.6427F, -7.8423F, 1, 2, 8, 0.004F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.4123F, -0.3747F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0087F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 51, 34, -0.6F, -0.3073F, -7.6534F, 1, 2, 8, 0.004F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 2.3866F, -15.8671F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 3.186F, -6.0216F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5061F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 48, -0.5F, 0.093F, -0.8666F, 1, 2, 8, 0.0F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(5.5F, 9.5518F, -5.9424F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.4363F, 0.0F, -0.1745F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.6479F, 7.5571F, 4.5001F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.3322F, -1.2608F, 0.0482F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(0.1439F, 7.5086F, -2.6347F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 1.0463F, 0.6267F, -0.3359F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-5.5F, 9.5518F, -5.9424F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.0F, 0.0F, 0.1745F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.6479F, 7.5571F, 4.5001F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.4806F, 1.2395F, -0.8996F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(-0.1439F, 7.5086F, -2.6347F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 1.0463F, -0.6267F, 0.3359F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 3.486F, -6.1216F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, -0.0436F, 0.1309F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.2F, -1.5F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 78, -0.5F, -0.1F, -3.3F, 1, 2, 5, 0.004F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -4.6F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0058F, 0.1744F, 0.0443F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.4F, -0.2F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 19, -0.5F, -0.4F, -6.5F, 1, 2, 7, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.2262F, -5.5794F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.2504F, 0.1486F, 0.0807F);


        this.leftCheek = new ModelRenderer(this);
        this.leftCheek.setRotationPoint(3.2423F, -0.0934F, -1.8267F);
        this.head.addChild(leftCheek);
        this.setRotateAngle(leftCheek, -1.3701F, 0.0349F, 0.0F);


        this.rightCheek = new ModelRenderer(this);
        this.rightCheek.setRotationPoint(-3.2423F, -0.0934F, -1.8267F);
        this.head.addChild(rightCheek);
        this.setRotateAngle(rightCheek, -1.3701F, -0.0349F, 0.0F);


        this.leftBeak = new ModelRenderer(this);
        this.leftBeak.setRotationPoint(0.3297F, 7.266F, -13.544F);
        this.head.addChild(leftBeak);
        this.setRotateAngle(leftBeak, 0.0F, 0.0F, 0.0349F);


        this.rightBeak = new ModelRenderer(this);
        this.rightBeak.setRotationPoint(-0.3297F, 7.266F, -13.544F);
        this.head.addChild(rightBeak);
        this.setRotateAngle(rightBeak, 0.0F, 0.0F, -0.0349F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.3F, 5.108F, -6.8808F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.3F, 5.108F, -6.8808F);
        this.head.addChild(rightFace);


        this.frill = new ModelRenderer(this);
        this.frill.setRotationPoint(0.0F, -0.8567F, -2.0625F);
        this.head.addChild(frill);
        this.setRotateAngle(frill, -0.0873F, 0.0F, 0.0F);


        this.leftFrill = new ModelRenderer(this);
        this.leftFrill.setRotationPoint(1.471F, -5.1075F, 3.5343F);
        this.frill.addChild(leftFrill);
        this.setRotateAngle(leftFrill, 0.1F, -0.3365F, 0.1941F);


        this.rightFrill = new ModelRenderer(this);
        this.rightFrill.setRotationPoint(-1.471F, -5.1075F, 3.5343F);
        this.frill.addChild(rightFrill);
        this.setRotateAngle(rightFrill, 0.1F, 0.3365F, -0.1941F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 2.4675F, -0.2504F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);


        this.leftLowerbeak = new ModelRenderer(this);
        this.leftLowerbeak.setRotationPoint(-0.0033F, 5.7221F, -8.2912F);
        this.jaw.addChild(leftLowerbeak);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.0994F, 6.3032F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1921F, -0.0873F, 0.0015F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 36, -0.5F, 0.8038F, 0.0069F, 1, 2, 9, 0.004F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.9361F, 8.8961F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0813F, -0.261F, 0.021F);
        this.tail2.cubeList.add(new ModelBox(tail2, 29, 21, -0.5F, -0.1697F, -0.1085F, 1, 2, 10, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.9272F, 9.6761F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2322F, -0.2125F, -0.0498F);
        this.tail3.cubeList.add(new ModelBox(tail3, 42, 50, -0.5F, 0.597F, -0.2166F, 1, 1, 9, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0741F, 8.8502F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.3187F, -0.1659F, -0.0544F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.5468F, -0.7914F, 1, 1, 19, -0.15F, false));

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
