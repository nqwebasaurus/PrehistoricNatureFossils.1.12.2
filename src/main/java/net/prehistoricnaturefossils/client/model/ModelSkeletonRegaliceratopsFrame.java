package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonRegaliceratopsFrame extends ModelBase {
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

    public ModelSkeletonRegaliceratopsFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -20.0F, 5.3F, 1, 20, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -15.0F, -10.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.8F, -4.0F, -0.5F, 1, 19, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -15.0F, -10.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.0F, -6.0F, -0.5F, 1, 10, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -15.5F, 5.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -4.0F, -6.5F, -0.5F, 1, 12, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -19.1894F, 7.6308F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.4276F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 1, 0, -0.5F, -0.1928F, -4.3534F, 1, 2, 10, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.9482F, 5.249F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.4204F, 0.0781F, -0.039F);
        this.tail.cubeList.add(new ModelBox(tail, 20, 13, -0.5F, 0.6038F, 0.6069F, 1, 2, 7, 0.004F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.9287F, 6.8862F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.3653F, 0.1071F, 0.0871F);
        this.tail2.cubeList.add(new ModelBox(tail2, 39, 23, -0.5F, -0.1697F, -0.1085F, 1, 2, 5, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.9157F, 4.5271F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.3401F, 0.1368F, 0.1393F);
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 49, -0.5F, 0.597F, -0.3166F, 1, 1, 5, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0323F, 4.8382F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1949F, 0.1713F, -0.0336F);
        this.tail4.cubeList.add(new ModelBox(tail4, 38, 33, -0.5F, 0.5502F, -0.2915F, 1, 1, 6, -0.15F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(4.9F, 0.2948F, -1.2628F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.5411F, 0.0F, 0.0F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 8.7568F, -3.2542F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.2793F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 7.4514F, 3.287F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.1571F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 3.2484F, -0.3386F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.2182F, 0.0F, 0.0F);


        this.leftfoot2 = new ModelRenderer(this);
        this.leftfoot2.setRotationPoint(0.0F, 1.1009F, -0.567F);
        this.leftfoot.addChild(leftfoot2);
        this.setRotateAngle(leftfoot2, -0.0175F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-4.9F, 0.2948F, -1.2628F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.1484F, 0.0F, 0.0F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 8.7568F, -3.2542F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.3665F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 7.4514F, 3.287F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.1134F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 4.1484F, 0.4614F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.0436F, 0.0F, 0.0F);


        this.rightfoot2 = new ModelRenderer(this);
        this.rightfoot2.setRotationPoint(0.0F, 0.274F, -1.4424F);
        this.rightfoot.addChild(rightfoot2);
        this.setRotateAngle(rightfoot2, -0.0175F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.128F, -4.399F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.297F, -0.0411F, -0.0146F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.9936F, -6.816F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 41, -0.5F, 0.8921F, -4.2367F, 1, 2, 4, 0.004F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.3064F, 0.784F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0087F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 23, -0.5F, -0.3073F, -7.6534F, 1, 2, 7, 0.008F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.9682F, -10.4134F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0699F, -0.0435F, 0.003F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 3.247F, -6.719F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5061F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 24, -0.5F, 0.093F, 0.1334F, 1, 2, 7, 0.0F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(4.8972F, 7.4105F, -2.2145F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.0462F, -0.0302F, -0.1719F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.4463F, 5.3164F, 2.2503F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.3322F, -1.2608F, 0.0482F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(0.1278F, 5.6806F, -1.8235F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 1.1772F, 0.6267F, -0.3359F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-4.8972F, 7.4105F, -2.2145F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.6138F, -0.0201F, 0.2433F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.4463F, 5.3164F, 2.2503F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.1774F, 0.7191F, -1.6996F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(-0.1278F, 5.6806F, -1.8235F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 1.6136F, -0.6267F, 0.3359F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.9F, -6.018F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.035F, -0.0872F, -0.0031F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.2784F, -0.6034F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 73, 38, -0.5F, -0.1F, -2.3F, 1, 2, 3, 0.004F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.4632F, -2.7625F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.0004F, -0.218F, 0.0058F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.4F, -0.2F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 15, -0.5F, -0.4F, -3.4F, 1, 2, 4, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3821F, -3.9095F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.564F, -0.0376F, 0.1705F);


        this.leftCheek = new ModelRenderer(this);
        this.leftCheek.setRotationPoint(2.274F, -0.6608F, -0.4237F);
        this.head.addChild(leftCheek);
        this.setRotateAngle(leftCheek, -1.6581F, 0.0349F, 0.0F);


        this.rightCheek = new ModelRenderer(this);
        this.rightCheek.setRotationPoint(-2.274F, -0.6608F, -0.4237F);
        this.head.addChild(rightCheek);
        this.setRotateAngle(rightCheek, -1.6581F, -0.0349F, 0.0F);


        this.leftBeak = new ModelRenderer(this);
        this.leftBeak.setRotationPoint(0.5157F, 6.1241F, -8.2987F);
        this.head.addChild(leftBeak);
        this.setRotateAngle(leftBeak, 0.2418F, 0.0358F, -0.144F);


        this.rightBeak = new ModelRenderer(this);
        this.rightBeak.setRotationPoint(-0.5157F, 6.1241F, -8.2987F);
        this.head.addChild(rightBeak);
        this.setRotateAngle(rightBeak, 0.2418F, -0.0358F, 0.144F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.3F, 5.3588F, -5.5918F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.3F, 5.3588F, -5.5918F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 2.0561F, 1.0098F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);


        this.leftLowerbeak = new ModelRenderer(this);
        this.leftLowerbeak.setRotationPoint(0.0967F, 6.1152F, -5.2639F);
        this.jaw.addChild(leftLowerbeak);
        this.setRotateAngle(leftLowerbeak, 0.48F, 0.0F, 0.0F);


        this.rightLowerbeak = new ModelRenderer(this);
        this.rightLowerbeak.setRotationPoint(-1.2967F, 6.1152F, -5.2639F);
        this.jaw.addChild(rightLowerbeak);
        this.setRotateAngle(rightLowerbeak, 0.48F, 0.0F, 0.0F);


        this.frill = new ModelRenderer(this);
        this.frill.setRotationPoint(0.0F, -0.9F, -2.2577F);
        this.head.addChild(frill);
        this.setRotateAngle(frill, -0.0873F, 0.0F, 0.0F);


        this.leftFrill = new ModelRenderer(this);
        this.leftFrill.setRotationPoint(1.6589F, -5.8376F, 6.4737F);
        this.frill.addChild(leftFrill);
        this.setRotateAngle(leftFrill, -0.2641F, -0.2268F, 0.1616F);


        this.rightFrill = new ModelRenderer(this);
        this.rightFrill.setRotationPoint(-1.6589F, -5.8376F, 6.4737F);
        this.frill.addChild(rightFrill);
        this.setRotateAngle(rightFrill, -0.2641F, 0.2268F, -0.1616F);

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
