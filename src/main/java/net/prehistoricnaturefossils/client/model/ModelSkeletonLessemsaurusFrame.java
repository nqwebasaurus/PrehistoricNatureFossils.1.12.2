package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLessemsaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer basin;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer frame11_r1;
    private final ModelRenderer leftleg1;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer leftleg4;
    private final ModelRenderer toes22;
    private final ModelRenderer rightleg1;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer rightleg4;
    private final ModelRenderer toes2;
    private final ModelRenderer body;
    private final ModelRenderer chest;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer neck1;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer neck4;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head1;
    private final ModelRenderer head2;
    private final ModelRenderer head4;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw4;
    private final ModelRenderer leftarm1;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftarm3;
    private final ModelRenderer leftarm4;
    private final ModelRenderer rightarm1;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightarm3;
    private final ModelRenderer rightarm4;

    public ModelSkeletonLessemsaurusFrame() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.398F, -34.73F, 18.5F, 1, 35, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -1.5F, -32.9F, -22.0F, 1, 33, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-1.0F, -21.5F, -22.0F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0078F, 0.218F, 0.0446F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -8, 1, -10.0F, -1.0F, 0.0F, 20, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(-0.5F, -30.0F, 18.5F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, 0.0873F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -4, 1, -6.0F, -1.0F, 0.0F, 13, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.1F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.basin = new ModelRenderer(this);
        this.basin.setRotationPoint(0.0F, -13.0F, -2.8F);
        this.root.addChild(basin);
        this.setRotateAngle(basin, -0.0456F, 0.0F, 0.0F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, 1.559F, 20.5686F);
        this.basin.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.0611F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 1, 30, -0.499F, -0.5F, -5.5F, 1, 1, 11, -0.1F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.3796F, 26.0346F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, -0.0463F, 0.1744F, -0.008F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(-0.6F, 3.2913F, -1.0089F);
        this.tail1.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, -0.0698F, 0.0174F, -0.0012F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 36, 30, 0.0F, -1.5F, 0.1F, 1, 1, 23, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.6913F, 20.7911F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0467F, 0.2179F, -0.0101F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(-0.1F, 1.7889F, 11.4657F);
        this.tail2.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, 0.0297F, -0.0174F, -0.0005F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 42, 57, -0.5F, -0.5F, -11.0F, 1, 1, 22, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.1471F, 22.8489F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0467F, 0.2179F, 0.0101F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(-0.1F, 3.0988F, -0.0681F);
        this.tail3.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, 0.0175F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 48, 0, -0.5F, -1.0F, -1.0F, 1, 1, 20, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.2968F, 18.4773F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0986F, -0.391F, 0.0377F);


        this.frame11_r1 = new ModelRenderer(this);
        this.frame11_r1.setRotationPoint(0.0F, 2.0083F, 0.0094F);
        this.tail4.addChild(frame11_r1);
        this.setRotateAngle(frame11_r1, -0.0349F, 0.0F, 0.0F);
        this.frame11_r1.cubeList.add(new ModelBox(frame11_r1, 63, 23, -0.5F, -0.5F, -0.1F, 1, 1, 16, -0.1F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(5.2F, 4.3716F, 21.7748F);
        this.basin.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.8006F, 0.0F, -0.0873F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0354F, 14.1715F, 0.7956F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 1.3032F, 0.0F, 0.0436F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(1.0672F, 9.1502F, 0.3786F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.33F, 0.0F, 0.0436F);


        this.leftleg4 = new ModelRenderer(this);
        this.leftleg4.setRotationPoint(-0.545F, 7.975F, -1.7054F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.5655F, 0.0024F, -0.0124F);


        this.toes22 = new ModelRenderer(this);
        this.toes22.setRotationPoint(0.0F, 0.2F, -3.1673F);
        this.leftleg4.addChild(toes22);
        this.setRotateAngle(toes22, -0.1745F, 0.0F, 0.0F);


        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-5.4F, 4.3716F, 21.7748F);
        this.basin.addChild(rightleg1);
        this.setRotateAngle(rightleg1, -0.0152F, 0.0F, 0.0873F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0556F, 15.4834F, 0.2754F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.6924F, 0.0F, -0.0436F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(-0.1022F, 8.707F, 1.7468F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.7227F, 0.0F, -0.0436F);


        this.rightleg4 = new ModelRenderer(this);
        this.rightleg4.setRotationPoint(-0.455F, 7.9845F, -1.7121F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.1292F, -0.0024F, 0.0124F);


        this.toes2 = new ModelRenderer(this);
        this.toes2.setRotationPoint(0.0F, 0.2F, -3.1673F);
        this.rightleg4.addChild(toes2);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.15F, 15.4351F);
        this.basin.addChild(body);
        this.setRotateAngle(body, 0.0911F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 30, -0.5F, 1.9229F, -29.5964F, 1, 1, 30, -0.1F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.2247F, -29.1145F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0925F, 0.1738F, 0.016F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 2.2832F, -4.3452F);
        this.chest.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.0175F, 0.0175F, 0.0003F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 87, 55, -0.5F, -0.55F, -4.0F, 1, 1, 8, -0.1F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.0628F, -7.5275F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.5937F, 0.3867F, 0.1033F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0055F, 4.0473F, -4.4152F);
        this.neck1.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.3501F, 0.0738F, 0.0269F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 81, 13, -0.5F, -0.5F, -6.0F, 1, 1, 12, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(-0.1F, 3.3354F, -9.259F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2318F, 0.5054F, 0.2042F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 3.0483F, -4.2489F);
        this.neck2.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.0878F, 0.0865F, 0.0114F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 83, 77, -0.5F, -0.5F, -5.0F, 1, 1, 10, -0.1F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.6061F, -9.0659F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3578F, 0.538F, 0.1893F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.5F, -1.7514F, -9.9539F);
        this.neck3.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.4709F, -0.0153F, -0.0409F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 0, 45, -1.0F, -0.6798F, -0.2789F, 1, 1, 11, -0.1F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -3.6656F, -9.6984F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.2801F, 0.3323F, 0.109F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(-0.5F, 0.9806F, -6.2201F);
        this.neck4.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.2357F, 0.017F, -0.0041F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 71, 84, 0.0F, -1.05F, -0.5F, 1, 1, 7, -0.1F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, -1.2194F, -6.5201F);
        this.neck4.addChild(head1);
        this.setRotateAngle(head1, 0.056F, 0.1329F, 0.1718F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.1F, -0.5F, -3.0F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.0456F, 0.0F, 0.0F);


        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -0.2F, -3.4F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.3187F, 0.0F, 0.0F);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 1.0F, -3.4F);
        this.head1.addChild(head3);
        this.setRotateAngle(head3, 0.1367F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, 0.5F, -4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, -0.0911F, 0.0F, 0.0F);


        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.1F, 1.7F, 0.6F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.2618F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.2F, -4.9F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.0911F, 0.0F, 0.0F);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(-0.1F, 0.0F, -2.8F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.1367F, 0.0F, 0.0F);


        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(-0.1F, 1.1F, 1.4F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.2065F, 0.0F, 0.0F);


        this.leftarm1 = new ModelRenderer(this);
        this.leftarm1.setRotationPoint(8.5F, 12.7014F, -7.1628F);
        this.chest.addChild(leftarm1);
        this.setRotateAngle(leftarm1, 0.4354F, 0.0226F, -0.2152F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.6319F, 10.4187F, 0.5312F);
        this.leftarm1.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.6011F, 0.1001F, 0.1505F);


        this.leftarm3 = new ModelRenderer(this);
        this.leftarm3.setRotationPoint(-1.0905F, 9.0486F, -1.3523F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, -0.0436F, 1.3526F, -0.0436F);


        this.leftarm4 = new ModelRenderer(this);
        this.leftarm4.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.leftarm3.addChild(leftarm4);
        this.setRotateAngle(leftarm4, 0.0F, 0.0F, -1.5272F);


        this.rightarm1 = new ModelRenderer(this);
        this.rightarm1.setRotationPoint(-8.7F, 12.7014F, -7.1628F);
        this.chest.addChild(rightarm1);
        this.setRotateAngle(rightarm1, 1.1335F, -0.0226F, 0.2152F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.6319F, 10.4187F, 0.5312F);
        this.rightarm1.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.3429F, -0.1001F, -0.1505F);


        this.rightarm3 = new ModelRenderer(this);
        this.rightarm3.setRotationPoint(1.0905F, 9.0486F, -1.3523F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, -0.5641F, -1.312F, 0.5784F);


        this.rightarm4 = new ModelRenderer(this);
        this.rightarm4.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.rightarm3.addChild(rightarm4);
        this.setRotateAngle(rightarm4, 0.0F, 0.0F, -0.2618F);

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
