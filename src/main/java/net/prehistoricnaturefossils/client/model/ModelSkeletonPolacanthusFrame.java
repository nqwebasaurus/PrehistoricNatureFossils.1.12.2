package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPolacanthusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftfoot2;
    private final ModelRenderer rightleg4;
    private final ModelRenderer rightleg5;
    private final ModelRenderer rightleg6;
    private final ModelRenderer rightfoot3;
    private final ModelRenderer rightfoot4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer head;
    private final ModelRenderer bone;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer osteoderms7;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonPolacanthusFrame() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 12.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.6F, -10.0F, -7.0F, 1, 10, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, -9.5F, -24.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.192F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.4F, 1.5F, -0.5F, 1, 8, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, -9.5F, -24.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.192F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -6.5F, -5.5F, -0.5F, 1, 12, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -15.5F, -6.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -7.1F, -7.5F, -0.5F, 1, 16, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -10.9F, -6.0F);
        this.fossil.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -0.6F, -3.5F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 68, 0.0F, 0.7199F, 0.1834F, 1, 1, 7, -0.2F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -1.0F, -8.3F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 81, 95, 0.1F, 0.7F, 0.6F, 1, 1, 5, -0.2F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(7.4F, 1.4999F, -0.1448F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.9556F, -0.443F, 0.0576F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 11.1012F, -3.5118F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 1.2217F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 5.6678F, 2.5803F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -1.5795F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 2.5542F, -0.7405F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.0175F, 0.0F, 0.0F);


        this.leftfoot2 = new ModelRenderer(this);
        this.leftfoot2.setRotationPoint(0.0F, -0.4752F, 0.5373F);
        this.leftfoot.addChild(leftfoot2);
        this.setRotateAngle(leftfoot2, 1.3439F, 0.0F, 0.0F);


        this.rightleg4 = new ModelRenderer(this);
        this.rightleg4.setRotationPoint(-7.4F, 1.4999F, -0.1448F);
        this.hips.addChild(rightleg4);
        this.setRotateAngle(rightleg4, -0.8568F, 0.6498F, 0.2463F);


        this.rightleg5 = new ModelRenderer(this);
        this.rightleg5.setRotationPoint(0.0F, 11.1012F, -3.5118F);
        this.rightleg4.addChild(rightleg5);
        this.setRotateAngle(rightleg5, 0.8555F, -0.1996F, 0.1706F);


        this.rightleg6 = new ModelRenderer(this);
        this.rightleg6.setRotationPoint(0.0F, 5.6678F, 2.5803F);
        this.rightleg5.addChild(rightleg6);
        this.setRotateAngle(rightleg6, -1.111F, 0.2613F, -0.4072F);


        this.rightfoot3 = new ModelRenderer(this);
        this.rightfoot3.setRotationPoint(0.0F, 2.5542F, -0.7405F);
        this.rightleg6.addChild(rightfoot3);
        this.setRotateAngle(rightfoot3, -0.0175F, 0.0F, 0.0F);


        this.rightfoot4 = new ModelRenderer(this);
        this.rightfoot4.setRotationPoint(0.0F, -0.4752F, 0.5373F);
        this.rightfoot3.addChild(rightfoot4);
        this.setRotateAngle(rightfoot4, 1.3439F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -9.3F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0438F, 0.0872F, 0.0038F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 1.4F, -4.9F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 68, 43, 0.0F, 0.8082F, -0.1785F, 1, 1, 7, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.7F, -6.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.1309F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0354F, 3.6035F, -6.5138F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3665F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 104, -2.5354F, 0.3838F, -0.3409F, 1, 1, 4, -0.2F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(2.0354F, 3.6035F, -6.5138F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2793F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 82, -2.5354F, 0.1206F, 3.2144F, 1, 1, 5, -0.2F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(6.3F, 8.0973F, -3.0537F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 1.096F, 0.4718F, -0.3786F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.6479F, 5.0571F, 2.3001F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.4032F, 0.7796F, 2.1577F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(-0.2181F, 5.8808F, -2.9354F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 1.3484F, 0.6166F, -1.0891F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-6.3F, 8.0973F, -3.0537F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.0037F, -1.228F, 1.2737F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.6479F, 5.0571F, 2.3001F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -2.0135F, -0.7491F, -2.6739F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(0.2181F, 5.8808F, -2.9354F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 1.2611F, -0.6166F, 1.0891F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 3.8F, -6.8F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, -0.117F, 0.1293F, 0.0413F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 98, 0.0F, 0.2F, -4.1F, 1, 1, 5, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -3.7F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.2409F, 0.428F, 0.0348F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.0F, -0.3F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 83, 6, 0.0F, 0.0F, -3.9F, 1, 1, 5, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.8781F, -4.2801F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.2028F, 0.4303F, 0.2134F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(1.1764F, 0.2042F, -1.419F);
        this.head.addChild(bone);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.5F, 0.9876F, -5.2416F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.5F, 0.9876F, -5.2416F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.3F, 2.0399F, -0.908F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4014F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.7F, 3.1F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1897F, -0.2253F, 0.0444F);
        this.tail.cubeList.add(new ModelBox(tail, 10, 68, -0.5F, 0.2F, -0.3F, 1, 1, 8, -0.2F, false));

        this.osteoderms7 = new ModelRenderer(this);
        this.osteoderms7.setRotationPoint(-2.8F, -30.5928F, -8.6771F);
        this.tail.addChild(osteoderms7);
        this.setRotateAngle(osteoderms7, -0.4189F, 0.0F, 0.0F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0743F, -0.3482F, -0.0254F);
        this.tail2.cubeList.add(new ModelBox(tail2, 63, 33, -0.5F, 0.2F, 0.0F, 1, 1, 8, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.4316F, -0.3876F, -0.0647F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0175F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 52, -0.6F, 0.1F, -0.7F, 1, 1, 10, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.4161F, -0.3858F, -0.0753F);
        this.tail4.cubeList.add(new ModelBox(tail4, -1, 53, -0.5F, 0.1F, -0.5F, 1, 1, 10, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.2262F, 8.9999F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.349F, -0.5199F, -0.0653F);
        this.tail5.cubeList.add(new ModelBox(tail5, 13, 33, -0.5F, -0.1421F, -0.2865F, 1, 1, 10, -0.2F, false));

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
