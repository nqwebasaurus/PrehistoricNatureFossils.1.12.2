package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonIchthyovenatorFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer rightthigh;
    private final ModelRenderer rightshin;
    private final ModelRenderer rightankle;
    private final ModelRenderer rightfoot;
    private final ModelRenderer righttoes;
    private final ModelRenderer leftthigh;
    private final ModelRenderer leftshin;
    private final ModelRenderer leftankle;
    private final ModelRenderer leftfoot;
    private final ModelRenderer lefttoes;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer rightupperarm;
    private final ModelRenderer rightlowerarm;
    private final ModelRenderer righthand;
    private final ModelRenderer rightouterfingers;
    private final ModelRenderer rightthumb;
    private final ModelRenderer rightthumbclaw;
    private final ModelRenderer leftupperarm;
    private final ModelRenderer leftlowerarm;
    private final ModelRenderer lefthand;
    private final ModelRenderer leftouterfingers;
    private final ModelRenderer leftthumb;
    private final ModelRenderer leftthumbclaw;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer leftAngularSurangular;
    private final ModelRenderer leftDentary;
    private final ModelRenderer rightAngularSurangular;
    private final ModelRenderer rightDentary;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;

    public ModelSkeletonIchthyovenatorFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.6F, -29.0F, -6.1F, 1, 29, 1, 0.006F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -25.0F, -5.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 1.8F, -5.0F, -0.5F, 1, 9, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.2F, -25.0F, -29.7F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -5.0F, -4.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.2F, -25.0F, -29.7F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.3491F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.4F, -3.0F, -0.5F, 1, 28, 1, 0.006F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -28.0F, -6.0F);
        this.fossil.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.4F, -5.2F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 18, -0.6F, 0.9F, 1.0F, 1, 2, 15, 0.0F, false));

        this.rightthigh = new ModelRenderer(this);
        this.rightthigh.setRotationPoint(4.0F, 0.42F, 0.6F);
        this.hips.addChild(rightthigh);
        this.setRotateAngle(rightthigh, 0.0339F, -0.011F, -0.041F);


        this.rightshin = new ModelRenderer(this);
        this.rightshin.setRotationPoint(-0.2618F, 10.2892F, -1.5228F);
        this.rightthigh.addChild(rightshin);
        this.setRotateAngle(rightshin, 0.6651F, 0.0F, 0.0424F);


        this.rightankle = new ModelRenderer(this);
        this.rightankle.setRotationPoint(-0.0524F, 10.5142F, 0.8396F);
        this.rightshin.addChild(rightankle);
        this.setRotateAngle(rightankle, -0.7674F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 5.4862F, -0.2121F);
        this.rightankle.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.1485F, 0.0F, 0.0F);


        this.righttoes = new ModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, 0.6962F, -2.1762F);
        this.rightfoot.addChild(righttoes);


        this.leftthigh = new ModelRenderer(this);
        this.leftthigh.setRotationPoint(-4.0F, 0.42F, 0.6F);
        this.hips.addChild(leftthigh);
        this.setRotateAngle(leftthigh, -0.2715F, 0.011F, 0.041F);


        this.leftshin = new ModelRenderer(this);
        this.leftshin.setRotationPoint(0.2618F, 10.2892F, -1.5228F);
        this.leftthigh.addChild(leftshin);
        this.setRotateAngle(leftshin, 0.796F, 0.0F, -0.0424F);


        this.leftankle = new ModelRenderer(this);
        this.leftankle.setRotationPoint(0.0524F, 10.5142F, 0.8396F);
        this.leftshin.addChild(leftankle);
        this.setRotateAngle(leftankle, -0.7674F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 5.4862F, -0.2121F);
        this.leftankle.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.2794F, 0.0F, 0.0F);


        this.lefttoes = new ModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, 0.6962F, -2.1762F);
        this.leftfoot.addChild(lefttoes);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.0F, -4.2F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.1309F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.6F, -8.8F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 51, -0.5F, 0.6557F, -0.1957F, 1, 2, 9, 0.003F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.6F, -15.8F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 8, -0.5F, 0.9F, -0.2F, 1, 2, 7, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -16.8F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0436F, 0.1745F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.2F, -7.7F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 51, -0.5F, 0.971F, -0.2955F, 1, 2, 9, 0.003F, false));

        this.rightupperarm = new ModelRenderer(this);
        this.rightupperarm.setRotationPoint(4.1F, 9.3959F, -3.828F);
        this.chest.addChild(rightupperarm);
        this.setRotateAngle(rightupperarm, 0.2456F, 0.1977F, -0.819F);


        this.rightlowerarm = new ModelRenderer(this);
        this.rightlowerarm.setRotationPoint(0.5299F, 7.2649F, -0.0679F);
        this.rightupperarm.addChild(rightlowerarm);
        this.setRotateAngle(rightlowerarm, -1.09F, -0.1199F, 0.2569F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(0.0074F, 6.3648F, 5.8015F);
        this.rightlowerarm.addChild(righthand);
        this.setRotateAngle(righthand, 0.0F, 0.0F, 0.1698F);


        this.rightouterfingers = new ModelRenderer(this);
        this.rightouterfingers.setRotationPoint(0.0F, 3.8F, 0.5F);
        this.righthand.addChild(rightouterfingers);
        this.setRotateAngle(rightouterfingers, 0.0F, 0.0F, 0.3821F);


        this.rightthumb = new ModelRenderer(this);
        this.rightthumb.setRotationPoint(-0.6F, 1.5F, -0.9F);
        this.righthand.addChild(rightthumb);
        this.setRotateAngle(rightthumb, -0.5308F, 0.0F, 0.2122F);


        this.rightthumbclaw = new ModelRenderer(this);
        this.rightthumbclaw.setRotationPoint(0.1F, 2.5F, 0.0F);
        this.rightthumb.addChild(rightthumbclaw);
        this.setRotateAngle(rightthumbclaw, -0.0213F, 0.0F, 0.6793F);


        this.leftupperarm = new ModelRenderer(this);
        this.leftupperarm.setRotationPoint(-4.1F, 9.3959F, -3.828F);
        this.chest.addChild(leftupperarm);
        this.setRotateAngle(leftupperarm, 0.4767F, 0.3316F, 0.9019F);


        this.leftlowerarm = new ModelRenderer(this);
        this.leftlowerarm.setRotationPoint(-0.5299F, 7.2649F, -0.0679F);
        this.leftupperarm.addChild(leftlowerarm);
        this.setRotateAngle(leftlowerarm, -1.0933F, 0.0424F, -0.2972F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(-0.0074F, 6.3648F, 5.8015F);
        this.leftlowerarm.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, -0.1698F);


        this.leftouterfingers = new ModelRenderer(this);
        this.leftouterfingers.setRotationPoint(0.0F, 3.8F, 0.5F);
        this.lefthand.addChild(leftouterfingers);
        this.setRotateAngle(leftouterfingers, 0.0F, 0.0F, -0.3821F);


        this.leftthumb = new ModelRenderer(this);
        this.leftthumb.setRotationPoint(0.6F, 1.5F, -0.9F);
        this.lefthand.addChild(leftthumb);
        this.setRotateAngle(leftthumb, -0.5241F, 0.088F, -0.0613F);


        this.leftthumbclaw = new ModelRenderer(this);
        this.leftthumbclaw.setRotationPoint(-0.1F, 2.5F, 0.0F);
        this.leftthumb.addChild(leftthumbclaw);
        this.setRotateAngle(leftthumbclaw, -0.0197F, 0.0081F, -0.2867F);


        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, 2.0F, -8.0F);
        this.chest.addChild(neck5);
        this.setRotateAngle(neck5, 0.0873F, 0.2182F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -1.5F, -3.9F);
        this.neck5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2269F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 62, -1.0F, 0.4714F, -0.7134F, 1, 1, 6, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.3F, -3.9F);
        this.neck5.addChild(neck4);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -2.1F, -3.2F);
        this.neck4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.733F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 68, 38, -1.0F, -0.2F, 0.0F, 1, 1, 4, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -2.6F, -2.8F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, 0.352F, 0.2155F, 0.0153F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -4.3F, -2.6F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.8727F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 18, -1.0F, 1.1707F, -0.9121F, 1, 1, 6, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -4.2F, -3.7F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.0193F, 0.2173F, -0.0894F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -1.4F, -3.7F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2443F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 63, -1.0F, 0.7F, -1.0F, 1, 1, 5, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.3F, -4.7F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.0479F, 0.2129F, -0.2233F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.0569F, -1.8639F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1139F, -0.0867F, -0.0099F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 68, 55, -0.5F, -0.5F, -3.0F, 1, 1, 5, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.4F, -3.9F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.1252F, -0.1786F, 0.1972F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.3F, 1.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3054F, 0.0F, 0.0F);


        this.leftAngularSurangular = new ModelRenderer(this);
        this.leftAngularSurangular.setRotationPoint(1.0F, 0.3F, -0.5F);
        this.jaw.addChild(leftAngularSurangular);


        this.leftDentary = new ModelRenderer(this);
        this.leftDentary.setRotationPoint(0.5F, 2.7F, -3.9F);
        this.leftAngularSurangular.addChild(leftDentary);
        this.setRotateAngle(leftDentary, 0.8727F, 0.0F, 0.0F);


        this.rightAngularSurangular = new ModelRenderer(this);
        this.rightAngularSurangular.setRotationPoint(-1.0F, 0.3F, -0.5F);
        this.jaw.addChild(rightAngularSurangular);


        this.rightDentary = new ModelRenderer(this);
        this.rightDentary.setRotationPoint(-0.5F, 2.7F, -3.9F);
        this.rightAngularSurangular.addChild(rightDentary);
        this.setRotateAngle(rightDentary, 0.8727F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3F, 10.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0467F, 0.2608F, -0.0233F);
        this.tail.cubeList.add(new ModelBox(tail, 38, 21, -0.5F, 0.0F, 0.0F, 1, 2, 11, 0.003F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0266F, 0.1745F, 0.0046F);
        this.tail2.cubeList.add(new ModelBox(tail2, 35, 6, -0.5F, 0.0524F, -0.0007F, 1, 2, 12, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1F, 12.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0575F, 0.1314F, -0.0109F);
        this.tail3.cubeList.add(new ModelBox(tail3, -1, 35, -0.5F, 0.135F, -0.2916F, 1, 2, 13, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1F, 12.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2262F, -0.4789F, -0.039F);
        this.tail4.cubeList.add(new ModelBox(tail4, 27, 38, -0.5F, 0.1F, 0.0F, 1, 1, 11, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.2F, 11.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1264F, -0.5657F, -0.0444F);
        this.tail5.cubeList.add(new ModelBox(tail5, 41, 40, -0.5F, 0.3F, -0.5F, 1, 1, 11, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.1633F, -0.51F, 0.1243F);
        this.tail6.cubeList.add(new ModelBox(tail6, 20, 21, -0.4F, 0.2F, -0.1F, 1, 1, 15, -0.15F, false));

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
