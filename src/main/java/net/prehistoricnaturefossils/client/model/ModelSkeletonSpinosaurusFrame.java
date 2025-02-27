package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSpinosaurusFrame extends ModelBase {
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
    private final ModelRenderer neck6;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
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
    private final ModelRenderer tail7;

    public ModelSkeletonSpinosaurusFrame() {
        this.textureWidth = 166;
        this.textureHeight = 166;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -31.0F, -0.4F, 1, 31, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(7.5F, -33.5F, -40.1F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3054F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.5F, -5.5F, -0.5F, 1, 39, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(7.5F, -33.5F, -40.1F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -1.5F, -5.5F, -0.5F, 1, 11, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -33.5F, 0.1F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, -3.5F, -5.5F, -0.5F, 1, 10, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -30.9F, -2.5F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1745F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.4F, -5.2F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 41, -0.5F, 0.9F, 1.0F, 1, 2, 15, 0.0F, false));

        this.rightthigh = new ModelRenderer(this);
        this.rightthigh.setRotationPoint(4.2564F, -0.152F, 2.436F);
        this.hips.addChild(rightthigh);
        this.setRotateAngle(rightthigh, -0.4897F, -0.011F, -0.041F);


        this.rightshin = new ModelRenderer(this);
        this.rightshin.setRotationPoint(0.3473F, 10.5461F, -0.9976F);
        this.rightthigh.addChild(rightshin);
        this.setRotateAngle(rightshin, 0.735F, 0.0F, 0.0424F);


        this.rightankle = new ModelRenderer(this);
        this.rightankle.setRotationPoint(0.0282F, 15.7806F, -0.12F);
        this.rightshin.addChild(rightankle);
        this.setRotateAngle(rightankle, -0.2438F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 5.4862F, -0.2121F);
        this.rightankle.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.1747F, 0.0F, 0.0F);


        this.righttoes = new ModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, 0.6962F, -2.1762F);
        this.rightfoot.addChild(righttoes);


        this.leftthigh = new ModelRenderer(this);
        this.leftthigh.setRotationPoint(-4.2564F, -0.152F, 2.436F);
        this.hips.addChild(leftthigh);
        this.setRotateAngle(leftthigh, 0.4702F, 0.011F, 0.041F);


        this.leftshin = new ModelRenderer(this);
        this.leftshin.setRotationPoint(-0.3473F, 10.5461F, -0.9976F);
        this.leftthigh.addChild(leftshin);
        this.setRotateAngle(leftshin, 0.4732F, 0.0F, -0.0424F);


        this.leftankle = new ModelRenderer(this);
        this.leftankle.setRotationPoint(-0.0282F, 15.7806F, -0.12F);
        this.leftshin.addChild(leftankle);
        this.setRotateAngle(leftankle, -0.6802F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 5.4862F, -0.2121F);
        this.leftankle.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.7856F, 0.0F, 0.0F);


        this.lefttoes = new ModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, 0.6962F, -2.1762F);
        this.leftfoot.addChild(lefttoes);
        this.setRotateAngle(lefttoes, -0.829F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.0F, -4.2F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.01F, -0.1751F, -0.0412F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.6F, -8.8F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 41, -0.5F, 0.6557F, -6.1957F, 1, 2, 15, 0.003F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.9F, -15.1F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 71, 73, -0.5F, 0.6662F, -10.8959F, 1, 2, 11, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.2929F, -25.9522F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.1523F, -0.1349F, -0.0288F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.333F, -8.5901F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 73, -0.5F, 0.971F, -3.0955F, 1, 2, 12, 0.003F, false));

        this.rightupperarm = new ModelRenderer(this);
        this.rightupperarm.setRotationPoint(5.241F, 9.5951F, -6.5735F);
        this.chest.addChild(rightupperarm);
        this.setRotateAngle(rightupperarm, 0.3783F, -0.2537F, -0.6675F);


        this.rightlowerarm = new ModelRenderer(this);
        this.rightlowerarm.setRotationPoint(0.3221F, 10.4607F, -0.8235F);
        this.rightupperarm.addChild(rightlowerarm);
        this.setRotateAngle(rightlowerarm, -0.9986F, -0.4156F, 0.3079F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(0.1483F, 3.6598F, -0.1985F);
        this.rightlowerarm.addChild(righthand);
        this.setRotateAngle(righthand, 0.0F, 0.0F, 0.1698F);


        this.rightouterfingers = new ModelRenderer(this);
        this.rightouterfingers.setRotationPoint(0.0166F, 3.167F, 0.2F);
        this.righthand.addChild(rightouterfingers);
        this.setRotateAngle(rightouterfingers, 0.0F, 0.0F, 0.3821F);


        this.rightthumb = new ModelRenderer(this);
        this.rightthumb.setRotationPoint(-0.5907F, 0.2958F, -1.1037F);
        this.righthand.addChild(rightthumb);
        this.setRotateAngle(rightthumb, -0.5308F, 0.0F, 0.2122F);


        this.rightthumbclaw = new ModelRenderer(this);
        this.rightthumbclaw.setRotationPoint(0.6055F, 1.5369F, 6.2759F);
        this.rightthumb.addChild(rightthumbclaw);
        this.setRotateAngle(rightthumbclaw, -0.0213F, 0.0F, 0.6793F);


        this.leftupperarm = new ModelRenderer(this);
        this.leftupperarm.setRotationPoint(-5.241F, 9.5951F, -6.5735F);
        this.chest.addChild(leftupperarm);
        this.setRotateAngle(leftupperarm, 0.0219F, 0.5959F, 0.6709F);


        this.leftlowerarm = new ModelRenderer(this);
        this.leftlowerarm.setRotationPoint(-0.3221F, 10.4607F, -0.8235F);
        this.leftupperarm.addChild(leftlowerarm);
        this.setRotateAngle(leftlowerarm, -0.8949F, 0.2491F, -0.1345F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(-0.1483F, 3.6598F, -0.1985F);
        this.leftlowerarm.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, -0.1698F);


        this.leftouterfingers = new ModelRenderer(this);
        this.leftouterfingers.setRotationPoint(-0.0166F, 3.167F, 0.2F);
        this.lefthand.addChild(leftouterfingers);
        this.setRotateAngle(leftouterfingers, 0.0F, 0.0F, -0.3821F);


        this.leftthumb = new ModelRenderer(this);
        this.leftthumb.setRotationPoint(0.5907F, 0.2958F, -1.1037F);
        this.lefthand.addChild(leftthumb);
        this.setRotateAngle(leftthumb, -0.5308F, 0.0F, -0.2122F);


        this.leftthumbclaw = new ModelRenderer(this);
        this.leftthumbclaw.setRotationPoint(-0.6055F, 1.5369F, 6.2759F);
        this.leftthumb.addChild(leftthumbclaw);
        this.setRotateAngle(leftthumbclaw, -0.0213F, 0.0F, -0.6793F);


        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, 2.633F, -10.4901F);
        this.chest.addChild(neck5);
        this.setRotateAngle(neck5, 0.0873F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -2.0F, -5.3F);
        this.neck5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2269F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 88, -1.0F, 0.8714F, -2.6134F, 1, 2, 8, 0.0F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.4796F, -7.2215F);
        this.neck5.addChild(neck4);
        this.setRotateAngle(neck4, -0.0087F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -2.6202F, -2.8267F);
        this.neck4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.733F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 104, 31, -1.0F, 0.0F, -1.0F, 1, 2, 5, 0.003F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -3.0255F, -3.3525F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.2921F, -0.1564F, 0.0982F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -4.7103F, -2.2155F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.8727F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 27, 77, -1.0F, 1.3707F, -4.2121F, 1, 2, 10, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -7.6103F, -5.9155F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.2325F, -0.2008F, -0.0831F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -1.4F, -6.7F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2444F, -0.0169F, 0.0042F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 50, 77, -1.0F, 0.1742F, -0.0891F, 1, 2, 7, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.3F, -6.6F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.2474F, -0.0849F, -0.0275F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.0993F, -3.8738F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1134F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 105, 61, -0.5F, 0.5832F, -1.0513F, 1, 2, 5, -0.15F, false));

        this.neck6 = new ModelRenderer(this);
        this.neck6.setRotationPoint(0.5F, 0.5628F, -4.5376F);
        this.neck.addChild(neck6);
        this.setRotateAngle(neck6, 0.7174F, 0.0736F, 0.0466F);
        this.neck6.cubeList.add(new ModelBox(neck6, 74, 96, -1.0F, 0.0F, -7.0F, 1, 2, 7, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -0.4085F, -5.949F);
        this.neck6.addChild(head);
        this.setRotateAngle(head, -0.1309F, 0.0F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.7483F, -1.5709F, -1.6803F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.7483F, -1.5709F, -1.6803F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 5.8392F, 0.7026F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5236F, 0.0F, 0.0F);


        this.leftAngularSurangular = new ModelRenderer(this);
        this.leftAngularSurangular.setRotationPoint(1.7F, 0.3F, -0.5F);
        this.jaw.addChild(leftAngularSurangular);
        this.setRotateAngle(leftAngularSurangular, -0.096F, 0.0F, 0.0F);


        this.leftDentary = new ModelRenderer(this);
        this.leftDentary.setRotationPoint(0.5F, 2.7F, -3.9F);
        this.leftAngularSurangular.addChild(leftDentary);
        this.setRotateAngle(leftDentary, 0.8727F, 0.0F, 0.0F);


        this.rightAngularSurangular = new ModelRenderer(this);
        this.rightAngularSurangular.setRotationPoint(-1.7F, 0.3F, -0.5F);
        this.jaw.addChild(rightAngularSurangular);
        this.setRotateAngle(rightAngularSurangular, -0.096F, 0.0F, 0.0F);


        this.rightDentary = new ModelRenderer(this);
        this.rightDentary.setRotationPoint(-0.5F, 2.7F, -3.9F);
        this.rightAngularSurangular.addChild(rightDentary);
        this.setRotateAngle(rightDentary, 0.8727F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2582F, 10.3978F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2608F, 0.3464F, -0.0443F);
        this.tail.cubeList.add(new ModelBox(tail, 52, 0, -0.5F, 0.0F, 0.0F, 1, 2, 15, 0.003F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0951F, 14.8991F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2011F, 0.3549F, -0.0577F);
        this.tail2.cubeList.add(new ModelBox(tail2, 1, 22, -0.5F, 0.0524F, -0.5007F, 1, 2, 16, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1698F, 15.9994F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2707F, 0.5527F, -0.3378F);
        this.tail3.cubeList.add(new ModelBox(tail3, 37, 22, -0.5F, 0.135F, -0.5916F, 1, 2, 16, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1501F, 16.0196F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1333F, 0.3891F, -0.2391F);
        this.tail4.cubeList.add(new ModelBox(tail4, 36, 58, -0.5F, 0.3F, -0.8F, 1, 2, 16, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.1798F, 15.0112F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2241F, 0.3926F, -0.2959F);
        this.tail5.cubeList.add(new ModelBox(tail5, 72, 18, -0.5F, 0.2F, 0.0F, 1, 2, 14, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.0562F, 13.9047F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2316F, 0.0625F, -0.1848F);
        this.tail6.cubeList.add(new ModelBox(tail6, 70, 41, -0.5F, 0.2F, 0.0F, 1, 1, 15, -0.15F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(-0.5F, -0.0749F, 14.8146F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.4012F, 0.0542F, -0.211F);
        this.tail7.cubeList.add(new ModelBox(tail7, 86, 0, 0.0F, 0.2F, 0.0F, 1, 1, 10, -0.15F, false));

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
