package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSpiclypeusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
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
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer head;
    private final ModelRenderer leftCheek;
    private final ModelRenderer rightCheek;
    private final ModelRenderer leftBeak;
    private final ModelRenderer rightBeak;
    private final ModelRenderer leftFace;
    private final ModelRenderer browHorn;
    private final ModelRenderer rightFace;
    private final ModelRenderer browHorn2;
    private final ModelRenderer nasalHorn;
    private final ModelRenderer frill;
    private final ModelRenderer leftFrill;
    private final ModelRenderer rightFrill;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonSpiclypeusFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 2.2F, -23.0F, 2.8F, 1, 23, 1, -0.15F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(5.9F, -16.65F, -14.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2269F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.8F, -3.35F, -0.5F, 1, 20, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(5.9F, -16.65F, -14.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2269F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.85F, -6.0F, -0.5F, 1, 12, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(2.5F, -18.0F, 3.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 3.8F, -6.0F, -0.5F, 1, 12, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(2.661F, -23.2F, 3.7148F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.3229F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.2908F, 7.3181F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0698F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, -0.9636F, -11.0709F, 1, 2, 12, 0.0F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(4.9F, 0.4999F, 0.2552F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.1913F, -0.0166F, 0.0857F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 12.8762F, -4.1099F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.2705F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 7.1865F, 4.2725F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.1391F, -0.0121F, -0.0864F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 2.5542F, -0.7405F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.0175F, 0.0F, 0.0F);


        this.leftfoot2 = new ModelRenderer(this);
        this.leftfoot2.setRotationPoint(0.0F, 0.939F, -0.2934F);
        this.leftfoot.addChild(leftfoot2);
        this.setRotateAngle(leftfoot2, -0.0175F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-4.9F, 0.4999F, 0.2552F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.4529F, 0.0203F, -0.0849F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 12.8762F, -4.1099F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.2269F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 7.1865F, 4.2725F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.1391F, 0.0121F, 0.0864F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 2.5542F, -0.7405F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.0175F, 0.0F, 0.0F);


        this.rightfoot2 = new ModelRenderer(this);
        this.rightfoot2.setRotationPoint(0.0F, 0.939F, -0.2934F);
        this.rightfoot.addChild(rightfoot2);
        this.setRotateAngle(rightfoot2, -0.1484F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.0227F, -3.8884F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.3364F, -0.1649F, -0.0573F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.7683F, -9.8032F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3229F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 34, -0.5F, -0.96F, -0.1826F, 1, 2, 6, 0.009F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.3683F, 2.6968F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0087F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 10, -0.5F, -0.3073F, -7.6534F, 1, 2, 5, 0.004F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.7683F, -10.1032F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0438F, -0.0872F, -0.0038F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 3.1554F, -4.821F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4189F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 31, -0.5F, -0.8282F, -0.4284F, 1, 2, 6, 0.0F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(5.5F, 6.8213F, -4.6418F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.1833F, 0.0F, -0.1745F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.6479F, 7.0571F, 3.3001F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.8251F, -1.1317F, 1.2702F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(0.1439F, 6.5086F, -2.6347F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.938F, 0.5578F, -0.5293F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-5.5F, 6.8213F, -4.6418F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.3403F, 0.0F, 0.1745F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.6479F, 7.0571F, 3.3001F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.2036F, 0.638F, -1.7412F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(-0.1439F, 6.5086F, -2.6347F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 1.4546F, -0.9034F, 0.9862F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.4554F, -5.321F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, -0.3357F, -0.2346F, -0.0367F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 1.7288F, -4.383F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1833F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 44, -1.5F, -1.0029F, -0.3792F, 1, 2, 6, 0.004F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.4132F, -4.5076F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.0504F, -0.4306F, -0.0128F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.7F, -0.1F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 29, -0.5F, -0.4F, -5.5F, 1, 2, 6, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.9F, -5.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.4784F, -0.0403F, 0.0774F);


        this.leftCheek = new ModelRenderer(this);
        this.leftCheek.setRotationPoint(2.274F, 0.8804F, -1.3643F);
        this.head.addChild(leftCheek);
        this.setRotateAngle(leftCheek, -1.5156F, 0.0302F, 0.0872F);


        this.rightCheek = new ModelRenderer(this);
        this.rightCheek.setRotationPoint(-2.274F, 0.8804F, -1.3643F);
        this.head.addChild(rightCheek);
        this.setRotateAngle(rightCheek, -1.5156F, -0.0302F, -0.0872F);


        this.leftBeak = new ModelRenderer(this);
        this.leftBeak.setRotationPoint(0.5296F, 4.1294F, -11.1925F);
        this.head.addChild(leftBeak);


        this.rightBeak = new ModelRenderer(this);
        this.rightBeak.setRotationPoint(-0.5296F, 4.1294F, -11.1925F);
        this.head.addChild(rightBeak);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.3F, 5.0822F, -4.1273F);
        this.head.addChild(leftFace);


        this.browHorn = new ModelRenderer(this);
        this.browHorn.setRotationPoint(0.6227F, -7.3919F, -0.52F);
        this.leftFace.addChild(browHorn);
        this.setRotateAngle(browHorn, -0.2182F, 0.0F, 0.6981F);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.3F, 5.0822F, -4.1273F);
        this.head.addChild(rightFace);


        this.browHorn2 = new ModelRenderer(this);
        this.browHorn2.setRotationPoint(-0.6227F, -7.3919F, -0.52F);
        this.rightFace.addChild(browHorn2);
        this.setRotateAngle(browHorn2, -0.2182F, 0.0F, -0.6981F);


        this.nasalHorn = new ModelRenderer(this);
        this.nasalHorn.setRotationPoint(0.5F, 0.2822F, -8.4273F);
        this.head.addChild(nasalHorn);
        this.setRotateAngle(nasalHorn, -0.4538F, 0.0F, 0.0F);


        this.frill = new ModelRenderer(this);
        this.frill.setRotationPoint(0.0F, -3.3178F, -1.0273F);
        this.head.addChild(frill);
        this.setRotateAngle(frill, -0.3863F, 0.009F, 0.0088F);


        this.leftFrill = new ModelRenderer(this);
        this.leftFrill.setRotationPoint(1.017F, -0.453F, 3.5091F);
        this.frill.addChild(leftFrill);
        this.setRotateAngle(leftFrill, -0.1933F, -0.2635F, 0.128F);


        this.rightFrill = new ModelRenderer(this);
        this.rightFrill.setRotationPoint(-1.017F, -0.453F, 3.5091F);
        this.frill.addChild(rightFrill);
        this.setRotateAngle(rightFrill, -0.1933F, 0.2635F, -0.128F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(1.0F, 3.6389F, -3.5648F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4008F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.4645F, 7.5087F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.4821F, -0.1846F, 0.1169F);
        this.tail.cubeList.add(new ModelBox(tail, 11, 15, -0.5F, 0.8038F, 0.4069F, 1, 2, 7, 0.004F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.9695F, 7.0283F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.3065F, -0.0832F, -0.0263F);
        this.tail2.cubeList.add(new ModelBox(tail2, 30, 43, -0.5F, -0.2697F, -0.1085F, 1, 1, 6, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6721F, 5.671F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.301F, 0.1668F, 0.0515F);
        this.tail3.cubeList.add(new ModelBox(tail3, 16, -1, -0.5F, 0.397F, -0.5166F, 1, 1, 9, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.2549F, 7.942F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2055F, 0.2137F, 0.0442F);
        this.tail4.cubeList.add(new ModelBox(tail4, 22, 21, -0.5F, 0.1988F, -0.0752F, 1, 1, 8, -0.15F, false));

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
