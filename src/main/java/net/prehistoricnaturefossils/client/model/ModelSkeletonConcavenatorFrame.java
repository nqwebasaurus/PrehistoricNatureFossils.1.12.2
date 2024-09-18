package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonConcavenatorFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r10;
    private final ModelRenderer head;
    private final ModelRenderer HEADPART;
    private final ModelRenderer HEADPART2;
    private final ModelRenderer HEADPART3;
    private final ModelRenderer HEADPART5;
    private final ModelRenderer HEADPART6;
    private final ModelRenderer HEADPART7;
    private final ModelRenderer HEADPART8;
    private final ModelRenderer HEADPART4;
    private final ModelRenderer HEADPART9;
    private final ModelRenderer HEADPART10;
    private final ModelRenderer HEADPART12;
    private final ModelRenderer jaw;
    private final ModelRenderer JAWPART;
    private final ModelRenderer throat;
    private final ModelRenderer throatpouch;
    private final ModelRenderer throat2;
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

    public ModelSkeletonConcavenatorFrame() {
        this.textureWidth = 85;
        this.textureHeight = 85;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 1.2F, -2.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -1.0F, 0.5F, 1, 24, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.25F, 10.65F, -15.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3142F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.85F, -4.75F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.25F, 10.65F, -15.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3142F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.25F, -4.65F, -0.5F, 1, 17, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 6.5F, 1.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -6.3F, -4.5F, -0.5F, 1, 9, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.1745F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.7F, -5.45F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 35, -0.5F, 1.0F, 0.0F, 1, 2, 8, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.4F, 2.3F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.1339F, 0.1209F, 0.0503F);
        this.tail.cubeList.add(new ModelBox(tail, 19, 17, -0.5F, 0.9254F, 4.9057F, 1, 2, 12, 0.005F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.3526F, 5.0072F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 44, 0.0F, 0.5533F, -4.7922F, 1, 2, 5, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5254F, 16.9057F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0536F, -0.2179F, 0.0116F);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 2, -0.5F, 0.15F, -0.2F, 1, 1, 11, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2657F, -0.1685F, 0.0456F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 29, -0.5F, -0.05F, -0.5F, 1, 1, 10, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.35F, 9.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2946F, -0.209F, 0.0629F);
        this.tail4.cubeList.add(new ModelBox(tail4, 14, 32, -0.5F, 0.3535F, -0.6277F, 1, 1, 9, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0465F, 8.8723F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3878F, -0.325F, 0.1297F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.1F, 0.9326F, -0.4872F);
        this.tail5.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0175F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 15, -0.5F, -0.5F, 0.0F, 1, 1, 8, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.9F, -5.2F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.2657F, 0.1685F, 0.0456F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.1102F, -5.4697F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 13, -0.5F, 0.0F, -7.5F, 1, 2, 13, 0.005F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2602F, -12.9697F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1578F, 0.1507F, -0.1075F);
        this.chest.cubeList.add(new ModelBox(chest, 43, 41, -0.5F, -0.1236F, -4.8348F, 1, 2, 5, 0.0F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(4.0F, 4.8264F, -3.5348F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.4391F, 0.3468F, -0.0594F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.0F, 3.1F, -0.2F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.8727F, 0.0F, 0.0F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(0.5F, 4.5F, 0.8F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.5672F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-4.0F, 4.8264F, -3.5348F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.6081F, -0.3468F, 0.0594F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.0F, 3.1F, -0.2F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.1781F, 0.0F, 0.0F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(-0.5F, 4.5F, 0.8F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.0F, 0.0F, -0.6109F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.8736F, -4.6848F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -1.032F, 0.2024F, -0.0809F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.3055F, 0.4757F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3142F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 29, 52, -0.5F, -0.1295F, -4.342F, 1, 1, 5, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.0555F, -3.0243F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2272F, 0.1386F, 0.1227F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.6124F, 0.076F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 0, -0.5F, -0.3F, -3.0F, 1, 1, 3, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.3624F, -2.774F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1694F, 0.4448F, 0.1897F);
        this.neck3.cubeList.add(new ModelBox(neck3, 13, 51, -0.5F, 0.1872F, -2.4845F, 1, 1, 3, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.0872F, -2.0345F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.1713F, -0.0552F, 0.1188F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.634F, -1.2794F);
        this.neck4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0349F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 62, 12, -0.4F, -0.5F, -1.5F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5F, 0.2419F, -2.6576F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);


        this.HEADPART = new ModelRenderer(this);
        this.HEADPART.setRotationPoint(0.0F, -2.5265F, -1.9709F);
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
        this.HEADPART5.setRotationPoint(0.0F, 2.9235F, -9.9209F);
        this.head.addChild(HEADPART5);
        this.setRotateAngle(HEADPART5, 0.0436F, 0.0F, 0.0F);


        this.HEADPART6 = new ModelRenderer(this);
        this.HEADPART6.setRotationPoint(0.3F, -2.15F, 1.65F);
        this.HEADPART5.addChild(HEADPART6);
        this.setRotateAngle(HEADPART6, 0.5677F, 0.0021F, 0.198F);


        this.HEADPART7 = new ModelRenderer(this);
        this.HEADPART7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.HEADPART6.addChild(HEADPART7);
        this.setRotateAngle(HEADPART7, -0.1745F, 0.0F, 0.0F);


        this.HEADPART8 = new ModelRenderer(this);
        this.HEADPART8.setRotationPoint(0.0F, 1.9F, 2.4F);
        this.HEADPART7.addChild(HEADPART8);
        this.setRotateAngle(HEADPART8, 0.7854F, 0.0F, 0.0F);


        this.HEADPART4 = new ModelRenderer(this);
        this.HEADPART4.setRotationPoint(-1.3F, -2.15F, 1.65F);
        this.HEADPART5.addChild(HEADPART4);
        this.setRotateAngle(HEADPART4, 0.5677F, -0.0021F, -0.198F);


        this.HEADPART9 = new ModelRenderer(this);
        this.HEADPART9.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.HEADPART4.addChild(HEADPART9);
        this.setRotateAngle(HEADPART9, -0.1745F, 0.0F, 0.0F);


        this.HEADPART10 = new ModelRenderer(this);
        this.HEADPART10.setRotationPoint(0.0F, 1.9F, 2.4F);
        this.HEADPART9.addChild(HEADPART10);
        this.setRotateAngle(HEADPART10, 0.7854F, 0.0F, 0.0F);


        this.HEADPART12 = new ModelRenderer(this);
        this.HEADPART12.setRotationPoint(0.0F, -0.05F, 4.55F);
        this.HEADPART5.addChild(HEADPART12);
        this.setRotateAngle(HEADPART12, 0.1309F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.9735F, 1.3291F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7418F, 0.0F, 0.0F);


        this.JAWPART = new ModelRenderer(this);
        this.JAWPART.setRotationPoint(0.0F, -0.4413F, -4.0619F);
        this.jaw.addChild(JAWPART);
        this.setRotateAngle(JAWPART, -0.0436F, 0.0F, 0.0F);


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


        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(4.0F, 0.0F, -1.3F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.5061F, 0.0F, 0.0F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 8.939F, 0.1973F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.9599F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.2F, 10.6627F, 1.1756F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.7767F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 4.97F, -0.4419F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.1745F, 0.0F, 0.0F);


        this.lefttoes = new ModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, -0.1585F, -2.2612F);
        this.leftfoot.addChild(lefttoes);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-4.0F, 0.0F, -1.3F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.7679F, 0.0F, 0.0F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 8.939F, 0.1973F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.9599F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(-0.2F, 10.6627F, 1.1756F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.7767F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 4.97F, -0.4419F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.3927F, 0.0F, 0.0F);


        this.righttoes = new ModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, -0.1585F, -2.2612F);
        this.rightfoot.addChild(righttoes);

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
