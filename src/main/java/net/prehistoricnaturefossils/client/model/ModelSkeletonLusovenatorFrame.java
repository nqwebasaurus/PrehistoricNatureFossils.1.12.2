package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLusovenatorFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
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

    public ModelSkeletonLusovenatorFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, -6.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-6.5F, 7.0F, -18.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -2.0F, -4.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-6.5F, 7.0F, -18.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.5F, -4.0F, -0.5F, 1, 27, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 7.0F, 1.9F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3054F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 6.0F, -4.5F, -0.5F, 1, 10, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 7.0F, 1.9F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3054F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.1F, -8.0F, -0.5F, 1, 31, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.0903F, 0.2608F, -0.0233F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.7F, -5.45F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 13, -0.5F, 1.0F, 0.0F, 1, 2, 13, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.4F, 7.3F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0948F, -0.079F, -0.0948F);
        this.tail.cubeList.add(new ModelBox(tail, 25, 1, -0.5F, 0.2728F, -0.0515F, 1, 2, 12, 0.005F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1272F, 11.9485F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1274F, -0.294F, -0.1209F);
        this.tail2.cubeList.add(new ModelBox(tail2, -1, 28, -0.5F, 0.45F, -0.4F, 1, 2, 12, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.065F, -0.1839F, -0.1173F);
        this.tail3.cubeList.add(new ModelBox(tail3, 25, 32, -0.5F, 0.05F, -0.2F, 1, 1, 10, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.35F, 9.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1439F, -0.1358F, -0.0241F);
        this.tail4.cubeList.add(new ModelBox(tail4, 39, 35, -0.5F, 0.4535F, -0.2277F, 1, 1, 9, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0465F, 8.8723F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3335F, 0.248F, -0.0848F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 43, -0.5F, 0.4326F, -0.1872F, 1, 1, 8, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.1326F, 7.8128F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3512F, 0.3293F, -0.1179F);
        this.tail6.cubeList.add(new ModelBox(tail6, 42, 0, -0.5F, 0.3684F, -0.3028F, 1, 1, 8, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.9F, -5.2F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.3503F, 0.082F, 0.0299F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.1102F, -5.4697F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 16, -0.5F, 0.0F, -7.5F, 1, 2, 13, 0.005F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2602F, -12.9697F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1752F, -0.0859F, -0.0152F);
        this.chest.cubeList.add(new ModelBox(chest, 26, 45, -0.5F, -0.1236F, -5.7348F, 1, 2, 6, 0.0F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(4.0F, 4.8264F, -6.7348F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.3491F, 0.3491F, -0.0436F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.8727F, 0.0F, 0.0F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(0.5F, 4.5F, 0.8F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.48F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-4.0F, 4.8264F, -6.7348F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.4034F, -0.2267F, 0.385F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.8727F, 0.0F, 0.0F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(-0.5F, 4.5F, 0.8F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.0F, 0.0F, -0.6109F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.4736F, -5.6848F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.6584F, -0.1103F, 0.0706F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.1208F, 0.1209F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3142F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 64, -1, -0.5F, -0.0295F, -4.942F, 1, 1, 6, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.1708F, -4.3791F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.4391F, -0.123F, 0.045F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.6124F, 0.076F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0524F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, -1, 62, -0.5F, -0.3F, -5.3F, 1, 1, 6, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.3624F, -4.774F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1578F, -0.2467F, -0.1241F);
        this.neck3.cubeList.add(new ModelBox(neck3, 75, 35, -0.5F, 0.1872F, -3.0845F, 1, 1, 3, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.0872F, -3.0345F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.5509F, -0.3007F, -0.18F);
        this.neck4.cubeList.add(new ModelBox(neck4, 73, 0, -0.5F, 0.134F, -2.7794F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5F, 0.034F, -2.6794F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.0875F, -0.0831F, -0.0511F);


        this.HEADPART = new ModelRenderer(this);
        this.HEADPART.setRotationPoint(0.0F, -2.6223F, -2.9663F);
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
        this.HEADPART5.setRotationPoint(0.0F, 2.8277F, -10.9163F);
        this.head.addChild(HEADPART5);
        this.setRotateAngle(HEADPART5, 0.0436F, 0.0F, 0.0F);


        this.HEADPART6 = new ModelRenderer(this);
        this.HEADPART6.setRotationPoint(0.5F, -2.55F, 1.65F);
        this.HEADPART5.addChild(HEADPART6);
        this.setRotateAngle(HEADPART6, 0.5172F, 0.0757F, 0.245F);


        this.HEADPART7 = new ModelRenderer(this);
        this.HEADPART7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.HEADPART6.addChild(HEADPART7);
        this.setRotateAngle(HEADPART7, -0.3491F, 0.0F, 0.0F);


        this.HEADPART8 = new ModelRenderer(this);
        this.HEADPART8.setRotationPoint(0.0F, 1.3F, 2.7F);
        this.HEADPART7.addChild(HEADPART8);
        this.setRotateAngle(HEADPART8, 0.7854F, 0.0F, 0.0F);


        this.HEADPART4 = new ModelRenderer(this);
        this.HEADPART4.setRotationPoint(-1.5F, -2.55F, 1.65F);
        this.HEADPART5.addChild(HEADPART4);
        this.setRotateAngle(HEADPART4, 0.5172F, -0.0757F, -0.245F);


        this.HEADPART9 = new ModelRenderer(this);
        this.HEADPART9.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.HEADPART4.addChild(HEADPART9);
        this.setRotateAngle(HEADPART9, -0.3491F, 0.0F, 0.0F);


        this.HEADPART10 = new ModelRenderer(this);
        this.HEADPART10.setRotationPoint(0.0F, 1.3F, 2.7F);
        this.HEADPART9.addChild(HEADPART10);
        this.setRotateAngle(HEADPART10, 0.7854F, 0.0F, 0.0F);


        this.HEADPART12 = new ModelRenderer(this);
        this.HEADPART12.setRotationPoint(0.0F, -0.05F, 4.55F);
        this.HEADPART5.addChild(HEADPART12);
        this.setRotateAngle(HEADPART12, 0.1309F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.8777F, 0.8337F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5236F, 0.0F, 0.0F);


        this.JAWPART = new ModelRenderer(this);
        this.JAWPART.setRotationPoint(0.0F, -0.25F, -3.6F);
        this.jaw.addChild(JAWPART);
        this.setRotateAngle(JAWPART, -0.0436F, 0.0F, 0.0F);


        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 2.75F, -3.8F);
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
        this.leftleg.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.6541F, 0.025F, 0.0357F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 1.2217F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 11.2627F, 0.1756F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -1.3945F, -0.0715F, -0.0501F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 1.8326F, 0.0F, 0.0F);


        this.lefttoes = new ModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, 0.0152F, -1.2764F);
        this.leftfoot.addChild(lefttoes);
        this.setRotateAngle(lefttoes, 0.48F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.0435F, -0.0038F, -0.0872F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.6109F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 11.2627F, 0.1756F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.7376F, 0.0795F, 0.1041F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.2618F, 0.0F, 0.0F);


        this.righttoes = new ModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, 0.0152F, -1.1764F);
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
