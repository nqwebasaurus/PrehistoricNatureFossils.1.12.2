package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGastoniaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer osteoderms17;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftfoot2;
    private final ModelRenderer leftleg4;
    private final ModelRenderer leftleg5;
    private final ModelRenderer leftleg6;
    private final ModelRenderer leftfoot3;
    private final ModelRenderer leftfoot4;
    private final ModelRenderer backPlates4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer osteoderms16;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer backPlates6;
    private final ModelRenderer osteoderms15;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer osteoderms13;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer osteoderms14;
    private final ModelRenderer head;
    private final ModelRenderer bone;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer backPlates5;
    private final ModelRenderer tail;
    private final ModelRenderer osteoderms22;
    private final ModelRenderer osteoderms7;
    private final ModelRenderer tail2;
    private final ModelRenderer osteoderms18;
    private final ModelRenderer tail3;
    private final ModelRenderer osteoderms19;
    private final ModelRenderer tail4;
    private final ModelRenderer osteoderms20;
    private final ModelRenderer tail5;
    private final ModelRenderer osteoderms21;

    public ModelSkeletonGastoniaFrame() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 12.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -19.0F, -7.0F, 1, 19, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -16.0F, -24.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.9F, -2.0F, -0.5F, 1, 18, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -16.0F, -24.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -3.5F, -5.5F, -0.5F, 1, 14, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -19.0F, -6.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -1.8F, -8.0F, -0.5F, 1, 17, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -19.9F, -6.0F);
        this.fossil.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -0.6F, -3.5F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 71, 71, 0.0F, 0.6199F, 0.5834F, 1, 1, 7, -0.15F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.1F, 0.4569F, -7.616F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0174F, -0.0015F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 72, 97, -0.5F, -0.6917F, -0.3084F, 1, 1, 5, -0.15F, false));

        this.osteoderms17 = new ModelRenderer(this);
        this.osteoderms17.setRotationPoint(-9.5F, -14.066F, -8.4611F);
        this.hips.addChild(osteoderms17);
        this.setRotateAngle(osteoderms17, -0.3499F, 0.0656F, -0.0239F);


        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(7.4F, 1.4999F, -0.1448F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.1658F, 0.0F, 0.0F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 11.1012F, -3.5118F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.4363F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 5.6678F, 2.5803F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.4887F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 2.5542F, -0.7405F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.0175F, 0.0F, 0.0F);


        this.leftfoot2 = new ModelRenderer(this);
        this.leftfoot2.setRotationPoint(0.0F, -0.4752F, 0.5373F);
        this.leftfoot.addChild(leftfoot2);
        this.setRotateAngle(leftfoot2, 0.2967F, 0.0F, 0.0F);


        this.leftleg4 = new ModelRenderer(this);
        this.leftleg4.setRotationPoint(-7.4F, 1.4999F, -0.1448F);
        this.hips.addChild(leftleg4);
        this.setRotateAngle(leftleg4, -0.1833F, 0.0F, 0.0F);


        this.leftleg5 = new ModelRenderer(this);
        this.leftleg5.setRotationPoint(0.0F, 11.1012F, -3.5118F);
        this.leftleg4.addChild(leftleg5);
        this.setRotateAngle(leftleg5, 0.0874F, 0.0049F, 0.0016F);


        this.leftleg6 = new ModelRenderer(this);
        this.leftleg6.setRotationPoint(0.0F, 5.6678F, 2.5803F);
        this.leftleg5.addChild(leftleg6);
        this.setRotateAngle(leftleg6, -0.358F, -0.0075F, -0.002F);


        this.leftfoot3 = new ModelRenderer(this);
        this.leftfoot3.setRotationPoint(0.0F, 2.5542F, -0.7405F);
        this.leftleg6.addChild(leftfoot3);
        this.setRotateAngle(leftfoot3, -0.0175F, 0.0F, 0.0F);


        this.leftfoot4 = new ModelRenderer(this);
        this.leftfoot4.setRotationPoint(0.0F, -0.4752F, 0.5373F);
        this.leftfoot3.addChild(leftfoot4);
        this.setRotateAngle(leftfoot4, 0.4712F, 0.0F, 0.0F);


        this.backPlates4 = new ModelRenderer(this);
        this.backPlates4.setRotationPoint(-8.1F, -14.7511F, -8.4674F);
        this.hips.addChild(backPlates4);
        this.setRotateAngle(backPlates4, 0.0F, 0.2618F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -9.3F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0438F, -0.0872F, -0.0038F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 1.4F, -4.9F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 37, 0.0F, 0.7082F, -0.3785F, 1, 1, 7, -0.15F, false));

        this.osteoderms16 = new ModelRenderer(this);
        this.osteoderms16.setRotationPoint(-3.0F, -11.9308F, -4.1488F);
        this.body.addChild(osteoderms16);
        this.setRotateAngle(osteoderms16, -0.1309F, 0.0F, 0.0F);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.7F, -6.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0436F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0354F, 3.6035F, -6.5138F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3665F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 53, 43, -2.5354F, 0.1838F, 0.0591F, 1, 1, 3, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(2.0354F, 3.6035F, -6.5138F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2793F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 87, -2.5354F, -0.0794F, 2.8144F, 1, 1, 5, -0.15F, false));

        this.backPlates6 = new ModelRenderer(this);
        this.backPlates6.setRotationPoint(-6.4293F, -7.1716F, -5.8763F);
        this.chest.addChild(backPlates6);
        this.setRotateAngle(backPlates6, 0.0F, -0.0349F, 0.0015F);


        this.osteoderms15 = new ModelRenderer(this);
        this.osteoderms15.setRotationPoint(-4.0F, -11.3828F, -5.6469F);
        this.chest.addChild(osteoderms15);
        this.setRotateAngle(osteoderms15, 0.1745F, 0.0F, 0.0F);


        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(6.3F, 8.0973F, -3.0537F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.4561F, 0.1025F, -0.1907F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.6479F, 5.0571F, 2.3001F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.4968F, -0.9643F, 0.997F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(-0.2181F, 5.8808F, -2.9354F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 1.0401F, 0.6496F, -0.633F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-6.3F, 8.0973F, -3.0537F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.3141F, 0.0008F, 0.2182F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.6479F, 5.0571F, 2.3001F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.3129F, 1.0161F, -0.7774F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(0.2181F, 5.8808F, -2.9354F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 1.1054F, -0.6437F, 0.5477F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 3.8F, -6.8F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.1418F, -0.1728F, -0.0245F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 98, 99, 0.0F, 0.0F, -4.1F, 1, 1, 5, -0.15F, false));

        this.osteoderms13 = new ModelRenderer(this);
        this.osteoderms13.setRotationPoint(-2.1F, -14.7653F, -1.791F);
        this.neck3.addChild(osteoderms13);
        this.setRotateAngle(osteoderms13, 0.0F, -0.1396F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -3.7F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.0F, -0.3491F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.0F, -0.3F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 87, 0.0F, 0.1F, -4.4F, 1, 1, 5, -0.15F, false));

        this.osteoderms14 = new ModelRenderer(this);
        this.osteoderms14.setRotationPoint(-2.0F, -14.7653F, -1.9866F);
        this.neck2.addChild(osteoderms14);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.8781F, -4.2801F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.1227F, -0.39F, -0.0469F);


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
        this.setRotateAngle(jaw, -0.1222F, 0.0F, 0.0F);


        this.backPlates5 = new ModelRenderer(this);
        this.backPlates5.setRotationPoint(-11.7F, -7.4885F, 1.4256F);
        this.body.addChild(backPlates5);
        this.setRotateAngle(backPlates5, -0.1586F, -0.4921F, 0.0754F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.7F, 3.1F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.4018F, 0.0402F, -0.0171F);
        this.tail.cubeList.add(new ModelBox(tail, 12, 73, -0.5F, 0.1F, 0.3F, 1, 1, 7, -0.15F, false));

        this.osteoderms22 = new ModelRenderer(this);
        this.osteoderms22.setRotationPoint(-2.2F, -0.9664F, 7.9473F);
        this.tail.addChild(osteoderms22);
        this.setRotateAngle(osteoderms22, 0.0F, -0.0349F, 0.0F);


        this.osteoderms7 = new ModelRenderer(this);
        this.osteoderms7.setRotationPoint(-2.8F, -30.5928F, -8.6771F);
        this.tail.addChild(osteoderms7);
        this.setRotateAngle(osteoderms7, -0.4189F, 0.0F, 0.0F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0723F, 0.2611F, 0.0187F);
        this.tail2.cubeList.add(new ModelBox(tail2, 67, 5, -0.5F, 0.1F, 0.0F, 1, 1, 8, -0.15F, false));

        this.osteoderms18 = new ModelRenderer(this);
        this.osteoderms18.setRotationPoint(0.8F, -33.9489F, -4.8011F);
        this.tail2.addChild(osteoderms18);
        this.setRotateAngle(osteoderms18, -0.3491F, 0.0F, 0.0F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1929F, 0.3085F, 0.1764F);
        this.tail3.cubeList.add(new ModelBox(tail3, -1, 49, -0.5F, 0.0F, -0.3F, 1, 1, 10, -0.15F, false));

        this.osteoderms19 = new ModelRenderer(this);
        this.osteoderms19.setRotationPoint(-3.1089F, 0.397F, 10.2053F);
        this.tail3.addChild(osteoderms19);
        this.setRotateAngle(osteoderms19, -0.0436F, 0.0F, 0.0F);


        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2292F, 0.35F, 0.1639F);
        this.tail4.cubeList.add(new ModelBox(tail4, 53, 52, -0.5F, 0.0F, 0.1F, 1, 1, 9, -0.15F, false));

        this.osteoderms20 = new ModelRenderer(this);
        this.osteoderms20.setRotationPoint(2.8F, -12.7721F, 1.1034F);
        this.tail4.addChild(osteoderms20);
        this.setRotateAngle(osteoderms20, -0.4014F, 0.0F, 0.0F);


        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.2262F, 8.9999F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1579F, 0.4384F, 0.1503F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 37, -0.5F, -0.3421F, -0.3865F, 1, 1, 10, -0.15F, false));

        this.osteoderms21 = new ModelRenderer(this);
        this.osteoderms21.setRotationPoint(-0.2F, -12.7662F, -1.0275F);
        this.tail5.addChild(osteoderms21);
        this.setRotateAngle(osteoderms21, -0.5062F, -0.0153F, 0.0085F);

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
