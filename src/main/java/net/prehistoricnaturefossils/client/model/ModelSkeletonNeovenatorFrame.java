package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonNeovenatorFrame extends ModelBase {
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
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4;
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

    public ModelSkeletonNeovenatorFrame() {
        this.textureWidth = 105;
        this.textureHeight = 105;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 1.2F, -2.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.4F, -2.2F, -3.8F, 1, 25, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(5.5F, 4.3F, -22.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.5061F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.1F, -5.5F, -0.5F, 1, 24, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(5.5F, 4.3F, -22.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5061F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.5F, -3.5F, -0.5F, 1, 7, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 4.3F, -3.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -7.1F, -3.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -0.4318F, -2.5073F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1744F, 0.0076F, 0.043F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.7F, -5.45F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 44, -0.5F, 1.0F, 0.0F, 1, 2, 8, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.4F, 2.3F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.1262F, -0.1354F, 0.0265F);
        this.tail.cubeList.add(new ModelBox(tail, 32, 16, -0.5F, 0.9254F, 4.9057F, 1, 2, 12, 0.005F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.3526F, 5.0072F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 61, -0.5F, 0.5533F, -4.7922F, 1, 2, 5, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5254F, 16.9057F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0785F, -0.0034F, 0.0435F);
        this.tail2.cubeList.add(new ModelBox(tail2, 31, 31, -0.5F, 0.25F, -0.3F, 1, 1, 11, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0447F, -0.218F, 0.0097F);
        this.tail3.cubeList.add(new ModelBox(tail3, 41, 0, -0.5F, 0.05F, -0.6F, 1, 1, 10, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.35F, 9.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2803F, -0.5065F, 0.1388F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 45, -0.5F, 0.4535F, -0.5277F, 1, 1, 9, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0465F, 8.8723F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3374F, -0.2892F, 0.0997F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 32, -0.5F, 0.5326F, -0.3872F, 1, 1, 11, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.9F, -5.2F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.2454F, -0.2446F, -0.1039F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.1102F, -5.4697F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 16, -0.5F, 0.0F, -7.5F, 1, 2, 13, 0.005F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2602F, -12.9697F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1625F, -0.2585F, -0.0419F);
        this.chest.cubeList.add(new ModelBox(chest, 61, 12, -0.5F, -0.1236F, -4.7348F, 1, 2, 5, 0.003F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(3.6569F, 6.1023F, -4.7122F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.5021F, 0.342F, 0.0834F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.0F, 3.1F, -0.2F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.0554F, -1.0446F, -0.508F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(0.8007F, 3.5463F, 0.8F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.3054F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-3.6569F, 6.1023F, -4.7122F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.3275F, -0.342F, -0.0834F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.0F, 3.1F, -0.2F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.1195F, 0.9672F, 0.4322F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(-0.8007F, 3.5463F, 0.8F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.0F, 0.0F, -0.3054F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.8067F, -4.7591F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.7984F, -0.0916F, 0.0936F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.3055F, 0.4757F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3143F, -0.0332F, -0.0108F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 74, 15, -0.5F, -0.0295F, -4.442F, 1, 1, 5, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.0555F, -3.0243F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.1099F, -0.3335F, -0.1677F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.6124F, -5.924F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0524F, -0.0174F, -0.0009F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 60, 20, -0.5F, 0.114F, -0.3082F, 1, 1, 6, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.4247F, -5.78F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0349F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 90, 64, -0.5F, 0.2872F, -2.0845F, 1, 1, 2, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.0872F, -2.0345F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.4498F, -0.2368F, -0.1128F);
        this.neck4.cubeList.add(new ModelBox(neck4, 79, 81, -0.5F, 0.234F, -2.8794F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5F, 0.3418F, -2.9517F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.287F, -0.2421F, -0.287F);


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
        this.HEADPART6.setRotationPoint(0.0F, -1.8448F, 1.0526F);
        this.HEADPART5.addChild(HEADPART6);
        this.setRotateAngle(HEADPART6, 0.5849F, 0.0876F, 0.1996F);


        this.HEADPART7 = new ModelRenderer(this);
        this.HEADPART7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.HEADPART6.addChild(HEADPART7);
        this.setRotateAngle(HEADPART7, -0.1745F, 0.0F, 0.0F);


        this.HEADPART8 = new ModelRenderer(this);
        this.HEADPART8.setRotationPoint(0.1181F, -0.2647F, 2.1783F);
        this.HEADPART7.addChild(HEADPART8);
        this.setRotateAngle(HEADPART8, 1.0396F, 0.2305F, 0.3008F);


        this.HEADPART4 = new ModelRenderer(this);
        this.HEADPART4.setRotationPoint(-1.0F, -1.8448F, 1.0526F);
        this.HEADPART5.addChild(HEADPART4);
        this.setRotateAngle(HEADPART4, 0.5849F, -0.0876F, -0.1996F);


        this.HEADPART9 = new ModelRenderer(this);
        this.HEADPART9.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.HEADPART4.addChild(HEADPART9);
        this.setRotateAngle(HEADPART9, -0.1745F, 0.0F, 0.0F);


        this.HEADPART10 = new ModelRenderer(this);
        this.HEADPART10.setRotationPoint(-0.1181F, -0.2647F, 2.1783F);
        this.HEADPART9.addChild(HEADPART10);
        this.setRotateAngle(HEADPART10, 1.0396F, -0.2305F, -0.3008F);


        this.HEADPART12 = new ModelRenderer(this);
        this.HEADPART12.setRotationPoint(0.0F, -0.05F, 4.55F);
        this.HEADPART5.addChild(HEADPART12);
        this.setRotateAngle(HEADPART12, 0.1309F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.8274F, 1.3581F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.637F, 0.0F, 0.0F);


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
        this.leftleg.setRotationPoint(2.4F, -1.8936F, -1.1868F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.1482F, 0.0064F, -0.0432F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 11.7374F, 0.0771F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.8029F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.2F, 11.6094F, 0.7265F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.8203F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 4.7238F, -0.0067F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.2182F, 0.0F, 0.0F);


        this.lefttoes = new ModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, -0.1585F, -2.2612F);
        this.leftfoot.addChild(lefttoes);
        this.setRotateAngle(lefttoes, -0.1745F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-2.4F, -1.8936F, -1.1868F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.8618F, 0.1902F, 0.0525F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 11.7374F, 0.0771F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 1.5882F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(-0.2F, 11.6094F, 0.7265F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -1.0821F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 4.7238F, -0.0067F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 1.0036F, 0.0F, 0.0F);


        this.righttoes = new ModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, -0.1585F, -2.2612F);
        this.rightfoot.addChild(righttoes);
        this.setRotateAngle(righttoes, 0.5236F, 0.0F, 0.0F);

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
