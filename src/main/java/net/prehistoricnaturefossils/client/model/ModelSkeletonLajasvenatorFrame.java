package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLajasvenatorFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r5;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer leftfoot;
    private final ModelRenderer lefttoes;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer rightfoot;
    private final ModelRenderer righttoes;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer neck3;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer head;
    private final ModelRenderer HEADPART;
    private final ModelRenderer HEADPART2;
    private final ModelRenderer HEADPART3;
    private final ModelRenderer HEADPART5;
    private final ModelRenderer HEADPART6;
    private final ModelRenderer HEADPART7;
    private final ModelRenderer HEADPART8;
    private final ModelRenderer bone;
    private final ModelRenderer HEADPART4;
    private final ModelRenderer HEADPART9;
    private final ModelRenderer HEADPART10;
    private final ModelRenderer bone2;
    private final ModelRenderer HEADPART12;
    private final ModelRenderer jaw;
    private final ModelRenderer throat;
    private final ModelRenderer throatpouch;
    private final ModelRenderer throat2;

    public ModelSkeletonLajasvenatorFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(3.5F, -10.0F, -14.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.5672F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.4F, -2.0F, -0.5F, 1, 12, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(3.5F, -10.1F, -14.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5555F, -0.1212F, -1.3785F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.2F, -2.5F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -13.4F, -3.7F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1666F, -0.0522F, -1.2697F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -1.1F, -1.0F, -0.5F, 1, 4, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -3.2F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.7F, -13.0F, -1.0F, 1, 13, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -13.4F, -4.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.0153F, -0.2136F, 0.3093F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.8F, -2.0F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 19, -1.0F, 0.7F, 0.6F, 1, 1, 5, -0.15F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(2.0F, 1.2F, 0.2F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.2752F, -0.0479F, 0.1679F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 5.339F, -0.5027F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.9599F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.2F, 6.4627F, 0.8756F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.6004F, -0.0494F, -0.072F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 2.57F, -0.3419F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 1.2305F, 0.0F, 0.0F);


        this.lefttoes = new ModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, 0.3415F, -2.1612F);
        this.leftfoot.addChild(lefttoes);
        this.setRotateAngle(lefttoes, 0.4363F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-2.0F, 1.2F, 0.2F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.7688F, -0.0967F, 0.2142F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 5.339F, -0.5027F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.7418F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(-0.2F, 6.4627F, 0.8756F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -1.1694F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 2.57F, -0.3419F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 1.7104F, 0.0F, 0.0F);


        this.righttoes = new ModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, 0.3415F, -2.1612F);
        this.rightfoot.addChild(righttoes);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.1F, 2.9F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.143F, 0.216F, -0.0308F);
        this.tail.cubeList.add(new ModelBox(tail, 20, 10, -0.5F, 0.2F, 0.2F, 1, 1, 5, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1715F, 0.2581F, 0.0442F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 17, -0.5F, 0.1F, -0.3F, 1, 1, 7, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0186F, -0.349F, 0.0064F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0009F, 0.0177F, 0.0031F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, -1, -0.6F, 0.0F, -0.7F, 1, 1, 8, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1485F, -0.3455F, 0.0506F);
        this.tail4.cubeList.add(new ModelBox(tail4, 10, 10, -0.5F, 0.0F, -0.1F, 1, 1, 7, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.25F, -0.2116F, 0.0536F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 8, -0.5F, 0.0F, -0.3F, 1, 1, 7, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.4F, -2.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0076F, -0.0869F, -0.0876F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -0.8F, -4.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0175F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 32, -1.0F, 0.819F, -2.8539F, 1, 1, 3, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 25, -1.0F, 0.3F, -4.1F, 1, 1, 5, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2F, -7.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0077F, -0.1744F, -0.0443F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.0F, -2.9F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1222F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 32, -1.0F, 0.6537F, 0.3643F, 1, 1, 3, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(2.7F, 3.1662F, -2.8045F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.6954F, 0.3468F, -0.0594F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.1639F, 2.4178F, -0.2387F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.8727F, 0.0F, 0.0F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(0.3F, 2.4F, 0.8F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.3054F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-2.7F, 3.1662F, -2.8045F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.6954F, -0.3468F, 0.0594F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.1639F, 2.4178F, -0.2387F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.8727F, 0.0F, 0.0F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(-0.3F, 2.4F, 0.8F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.0F, 0.0F, -0.3054F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.4F, -2.7F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.0361F, -0.3911F, -0.0944F);
        this.neck3.cubeList.add(new ModelBox(neck3, 17, 31, -0.4F, 0.168F, -3.2835F, 1, 1, 4, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.1F, -2.7F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.0181F, -0.3923F, -0.0472F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.1F, -1.5F, -3.1F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7069F, -0.0133F, 0.0113F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 26, -0.6F, -0.6177F, -0.1381F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.3F, -2.7F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.0175F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.1F, -1.9F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1571F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 44, -0.5F, 0.0F, -0.1F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5F, 0.1132F, -1.6448F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.0226F, -0.0843F, 0.2628F);


        this.HEADPART = new ModelRenderer(this);
        this.HEADPART.setRotationPoint(0.0F, -2.6468F, -2.3524F);
        this.head.addChild(HEADPART);
        this.setRotateAngle(HEADPART, 0.1833F, 0.0F, 0.0F);


        this.HEADPART2 = new ModelRenderer(this);
        this.HEADPART2.setRotationPoint(0.0F, 0.0F, -3.95F);
        this.HEADPART.addChild(HEADPART2);
        this.setRotateAngle(HEADPART2, 0.2618F, 0.0F, 0.0F);


        this.HEADPART3 = new ModelRenderer(this);
        this.HEADPART3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.HEADPART2.addChild(HEADPART3);
        this.setRotateAngle(HEADPART3, 0.3665F, 0.0F, 0.0F);


        this.HEADPART5 = new ModelRenderer(this);
        this.HEADPART5.setRotationPoint(0.0F, 2.8032F, -10.3024F);
        this.head.addChild(HEADPART5);
        this.setRotateAngle(HEADPART5, 0.0436F, 0.0F, 0.0F);


        this.HEADPART6 = new ModelRenderer(this);
        this.HEADPART6.setRotationPoint(1.0F, -3.85F, 6.75F);
        this.HEADPART5.addChild(HEADPART6);
        this.setRotateAngle(HEADPART6, 0.4979F, 0.0021F, 0.198F);


        this.HEADPART7 = new ModelRenderer(this);
        this.HEADPART7.setRotationPoint(-0.3398F, 0.8458F, 2.1445F);
        this.HEADPART6.addChild(HEADPART7);
        this.setRotateAngle(HEADPART7, -0.032F, 0.2419F, 0.0738F);


        this.HEADPART8 = new ModelRenderer(this);
        this.HEADPART8.setRotationPoint(0.431F, 1.2053F, 0.6589F);
        this.HEADPART7.addChild(HEADPART8);
        this.setRotateAngle(HEADPART8, 0.7854F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(-0.5F, -1.1F, -0.3F);
        this.HEADPART8.addChild(bone);


        this.HEADPART4 = new ModelRenderer(this);
        this.HEADPART4.setRotationPoint(-2.0F, -3.85F, 6.75F);
        this.HEADPART5.addChild(HEADPART4);
        this.setRotateAngle(HEADPART4, 0.4979F, -0.0021F, -0.198F);


        this.HEADPART9 = new ModelRenderer(this);
        this.HEADPART9.setRotationPoint(0.3398F, 0.8458F, 2.1445F);
        this.HEADPART4.addChild(HEADPART9);
        this.setRotateAngle(HEADPART9, -0.032F, -0.2419F, -0.0738F);


        this.HEADPART10 = new ModelRenderer(this);
        this.HEADPART10.setRotationPoint(-0.431F, 1.2053F, 0.6589F);
        this.HEADPART9.addChild(HEADPART10);
        this.setRotateAngle(HEADPART10, 0.7854F, 0.0F, 0.0F);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.5F, -1.1F, -0.3F);
        this.HEADPART10.addChild(bone2);


        this.HEADPART12 = new ModelRenderer(this);
        this.HEADPART12.setRotationPoint(0.0F, -0.05F, 4.55F);
        this.HEADPART5.addChild(HEADPART12);
        this.setRotateAngle(HEADPART12, 0.1309F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.3F, 0.8532F, 0.2476F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6458F, 0.0F, 0.0F);


        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 2.5587F, -4.2619F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0873F, 0.0F, 0.0F);


        this.throatpouch = new ModelRenderer(this);
        this.throatpouch.setRotationPoint(0.0F, -1.0F, 2.0F);
        this.throat.addChild(throatpouch);
        this.setRotateAngle(throatpouch, -0.2618F, 0.0F, 0.0F);


        this.throat2 = new ModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.throat.addChild(throat2);
        this.setRotateAngle(throat2, -0.3491F, 0.0F, 0.0F);

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
