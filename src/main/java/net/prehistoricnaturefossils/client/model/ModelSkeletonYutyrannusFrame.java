package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonYutyrannusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r2;
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
    private final ModelRenderer tail;
    private final ModelRenderer cube_r3;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail6;
    private final ModelRenderer cube_r8;
    private final ModelRenderer body;
    private final ModelRenderer cube_r9;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer leftarm3;
    private final ModelRenderer leftarm4;
    private final ModelRenderer lefthand2;
    private final ModelRenderer leftfingers;
    private final ModelRenderer leftclaw;
    private final ModelRenderer rightarm3;
    private final ModelRenderer rightarm4;
    private final ModelRenderer righthand2;
    private final ModelRenderer rightfingers;
    private final ModelRenderer rightclaw;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r14;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r15;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonYutyrannusFrame() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.4F, -28.0F, 2.9F, 1, 28, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 0.0F, -27.0F, -18.4F, 1, 27, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -19.5F, -17.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.8F, -4.8F, -0.5F, 1, 10, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 7.9F, -5.5F, 20.8F, 1, 10, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -28.329F, 3.4267F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0873F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.2F, 4.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0175F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 32, 0.0F, 0.7964F, -9.8947F, 1, 2, 10, 0.0F, false));

        this.rightthigh = new ModelRenderer(this);
        this.rightthigh.setRotationPoint(5.0F, 0.399F, 0.1733F);
        this.hips.addChild(rightthigh);
        this.setRotateAngle(rightthigh, -0.0955F, 0.035F, 0.0816F);


        this.rightshin = new ModelRenderer(this);
        this.rightshin.setRotationPoint(-0.2618F, 12.4892F, -1.4228F);
        this.rightthigh.addChild(rightshin);
        this.setRotateAngle(rightshin, 0.796F, 0.0F, 0.0424F);


        this.rightankle = new ModelRenderer(this);
        this.rightankle.setRotationPoint(-0.0524F, 12.6142F, 0.7396F);
        this.rightshin.addChild(rightankle);
        this.setRotateAngle(rightankle, -0.8072F, -0.0682F, -0.1118F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 5.0743F, -0.8039F);
        this.rightankle.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.3667F, 0.0F, 0.0F);


        this.righttoes = new ModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, 0.6962F, -2.1762F);
        this.rightfoot.addChild(righttoes);
        this.setRotateAngle(righttoes, -0.3927F, 0.0F, 0.0F);


        this.leftthigh = new ModelRenderer(this);
        this.leftthigh.setRotationPoint(-5.0F, 0.399F, 0.1733F);
        this.hips.addChild(leftthigh);
        this.setRotateAngle(leftthigh, -0.5301F, -0.0936F, -0.0379F);


        this.leftshin = new ModelRenderer(this);
        this.leftshin.setRotationPoint(0.2618F, 12.4892F, -1.4228F);
        this.leftthigh.addChild(leftshin);
        this.setRotateAngle(leftshin, 0.7088F, 0.0F, -0.0424F);


        this.leftankle = new ModelRenderer(this);
        this.leftankle.setRotationPoint(0.0524F, 12.6142F, 0.7396F);
        this.leftshin.addChild(leftankle);
        this.setRotateAngle(leftankle, -0.8965F, 0.0518F, 0.0702F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 5.0743F, -0.8039F);
        this.leftankle.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.6721F, 0.0F, 0.0F);


        this.lefttoes = new ModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, 0.6962F, -2.1762F);
        this.leftfoot.addChild(lefttoes);
        this.setRotateAngle(lefttoes, -0.0436F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4162F, 4.0077F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0966F, 0.1387F, -0.0743F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 2.4267F, 2.9921F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 40, -1.0F, -1.8F, -3.3F, 1, 2, 8, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.1692F, 7.8444F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1516F, -0.0139F, -0.1745F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.6F, 4.5F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, -0.2F, -4.8F, 1, 2, 15, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 4.0118F, 14.2188F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0937F, -0.1999F, -0.0679F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.1973F, 5.5477F);
        this.tail3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 0, -0.5F, 1.4F, -5.5F, 1, 2, 11, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0262F, 11.0007F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0524F, -0.0436F, 0.0023F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, 2.8986F, 5.4654F);
        this.tail4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 34, -2.0F, -2.8F, -5.5F, 1, 1, 11, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.3082F, 10.6083F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0464F, -0.3487F, 0.0159F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0284F, 5.7812F);
        this.tail5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 18, -0.5F, 0.1F, -6.0F, 1, 1, 12, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 1.9686F, 11.6353F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0962F, -0.4346F, 0.0406F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 1.8888F, 7.1672F);
        this.tail6.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.48F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 0, -1.0F, 1.75F, -7.25F, 1, 1, 9, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6111F, -5.6872F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0429F, -0.0436F, -0.0095F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.6486F, -10.8654F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0262F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 26, -0.5F, 0.959F, -0.1322F, 1, 2, 11, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.0121F, -10.9135F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0433F, 0.0435F, -0.0076F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 1.6022F, -5.2261F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1571F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 51, -1.5F, -0.422F, -0.6023F, 1, 2, 6, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 1.3022F, -9.1261F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1222F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 66, 39, -1.5F, 0.3817F, -0.1233F, 1, 1, 4, 0.0F, false));

        this.leftarm3 = new ModelRenderer(this);
        this.leftarm3.setRotationPoint(4.7967F, 8.0401F, -4.9998F);
        this.chest.addChild(leftarm3);
        this.setRotateAngle(leftarm3, -0.4611F, 0.1966F, -0.2699F);


        this.leftarm4 = new ModelRenderer(this);
        this.leftarm4.setRotationPoint(0.3966F, 1.7009F, 5.4048F);
        this.leftarm3.addChild(leftarm4);
        this.setRotateAngle(leftarm4, 0.083F, -0.1046F, -0.0363F);


        this.lefthand2 = new ModelRenderer(this);
        this.lefthand2.setRotationPoint(0.0273F, 5.0738F, -1.5538F);
        this.leftarm4.addChild(lefthand2);
        this.setRotateAngle(lefthand2, -0.0791F, -0.0368F, -0.4349F);


        this.leftfingers = new ModelRenderer(this);
        this.leftfingers.setRotationPoint(-0.2273F, 1.8943F, -0.7714F);
        this.lefthand2.addChild(leftfingers);


        this.leftclaw = new ModelRenderer(this);
        this.leftclaw.setRotationPoint(-0.3049F, 0.1884F, -0.8777F);
        this.lefthand2.addChild(leftclaw);
        this.setRotateAngle(leftclaw, 0.0873F, 0.0F, 0.0F);


        this.rightarm3 = new ModelRenderer(this);
        this.rightarm3.setRotationPoint(-4.7967F, 8.0401F, -4.9998F);
        this.chest.addChild(rightarm3);
        this.setRotateAngle(rightarm3, -0.5228F, -0.4549F, 0.0885F);


        this.rightarm4 = new ModelRenderer(this);
        this.rightarm4.setRotationPoint(-0.3966F, 1.7009F, 5.4048F);
        this.rightarm3.addChild(rightarm4);
        this.setRotateAngle(rightarm4, -0.0346F, 0.5186F, 0.4215F);


        this.righthand2 = new ModelRenderer(this);
        this.righthand2.setRotationPoint(-0.0273F, 5.0738F, -1.5538F);
        this.rightarm4.addChild(righthand2);
        this.setRotateAngle(righthand2, -0.2461F, 0.05F, 0.6091F);


        this.rightfingers = new ModelRenderer(this);
        this.rightfingers.setRotationPoint(0.2273F, 1.8943F, -0.7714F);
        this.righthand2.addChild(rightfingers);


        this.rightclaw = new ModelRenderer(this);
        this.rightclaw.setRotationPoint(0.3049F, 0.1884F, -0.8777F);
        this.righthand2.addChild(rightclaw);
        this.setRotateAngle(rightclaw, 0.0873F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.1342F, -8.9269F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.1018F, 0.0908F, 0.0402F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0276F, -3.9304F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1833F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 45, 38, -0.5F, -0.5015F, -0.5771F, 1, 1, 5, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.503F, -3.7071F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0153F, 0.1538F, 0.0817F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.0132F, 0.101F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6545F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 65, 45, 0.0F, 0.3F, -5.0F, 1, 1, 5, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -2.8764F, -4.0773F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0703F, 0.1166F, 0.0213F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.5278F, -0.3196F);
        this.neck3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3054F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 87, 26, 0.0F, -0.5F, -1.6F, 1, 1, 2, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.7754F, -1.4407F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.1855F, 0.3435F, -0.0631F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 2.5228F, -2.174F);
        this.neck4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1134F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 81, 47, -1.0F, -1.9F, -0.5F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.123F, -2.089F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.0F, 0.1309F, -0.0436F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 4.542F, 0.7596F);
        this.head.addChild(jaw);

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
