package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTuojiangosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer main;
    private final ModelRenderer body;
    private final ModelRenderer cube_r2;
    private final ModelRenderer leftPlate10;
    private final ModelRenderer rightPlate10;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer backleftleg3;
    private final ModelRenderer backleftleg4;
    private final ModelRenderer backrightleg;
    private final ModelRenderer backrightleg2;
    private final ModelRenderer backrightleg3;
    private final ModelRenderer backrightleg4;
    private final ModelRenderer tail;
    private final ModelRenderer leftPlate11;
    private final ModelRenderer rightPlate11;
    private final ModelRenderer tail2;
    private final ModelRenderer leftPlate12;
    private final ModelRenderer rightPlate12;
    private final ModelRenderer tail3;
    private final ModelRenderer leftPlate13;
    private final ModelRenderer rightPlate13;
    private final ModelRenderer tail4;
    private final ModelRenderer leftPlate14;
    private final ModelRenderer rightPlate14;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r3;
    private final ModelRenderer leftPlate15;
    private final ModelRenderer rightPlate15;
    private final ModelRenderer leftPlate16;
    private final ModelRenderer rightPlate16;
    private final ModelRenderer tail6;
    private final ModelRenderer lefttailSpike;
    private final ModelRenderer righttailSpike;
    private final ModelRenderer lefttailSpike2;
    private final ModelRenderer righttailSpike2;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftPlate8;
    private final ModelRenderer rightPlate8;
    private final ModelRenderer leftPlate7;
    private final ModelRenderer rightPlate7;
    private final ModelRenderer leftPlate9;
    private final ModelRenderer rightPlate9;
    private final ModelRenderer upperbody;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftPlate4;
    private final ModelRenderer rightPlate4;
    private final ModelRenderer leftPlate3;
    private final ModelRenderer rightPlate3;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leftPlate2;
    private final ModelRenderer rightPlate2;
    private final ModelRenderer neck;
    private final ModelRenderer leftPlate1;
    private final ModelRenderer rightPlate1;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer frontleftleg;
    private final ModelRenderer frontleftleg2;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer frontrightleg;
    private final ModelRenderer frontrightleg2;
    private final ModelRenderer frontrightleg3;
    private final ModelRenderer leftPlate6;
    private final ModelRenderer rightPlate6;
    private final ModelRenderer leftPlate5;
    private final ModelRenderer rightPlate5;
    private final ModelRenderer Leftlegspike;
    private final ModelRenderer Rightlegspike;

    public ModelSkeletonTuojiangosaurusFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -29.0F, 2.0F, 1, 29, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -43.0F, -24.0F, 1, 43, 1, -0.1F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -14.5F, -23.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -22.5F, -6.5F, -0.5F, 1, 13, 1, -0.1F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -11.5F, -6.5F, 25.5F, 1, 13, 1, -0.1F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -10.2F, -2.0F);
        this.fossil.addChild(main);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -16.0F, 5.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, -0.6981F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -5.25F, -9.25F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 33, -0.5F, 3.9F, 2.25F, 1, 1, 11, -0.1F, false));

        this.leftPlate10 = new ModelRenderer(this);
        this.leftPlate10.setRotationPoint(2.5F, -4.7946F, 0.7464F);
        this.body.addChild(leftPlate10);
        this.setRotateAngle(leftPlate10, -0.4305F, 0.0735F, 0.1585F);


        this.rightPlate10 = new ModelRenderer(this);
        this.rightPlate10.setRotationPoint(-2.5F, -4.7946F, 0.7464F);
        this.body.addChild(rightPlate10);
        this.setRotateAngle(rightPlate10, -0.4305F, -0.0735F, -0.1585F);


        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(6.75F, 0.25F, 0.5F);
        this.body.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.5236F, 0.0F, 0.0F);


        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(-0.15F, 12.1523F, -0.6836F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.5229F, 0.0021F, 0.0106F);


        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.5F, 9.7344F, 0.9796F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.5236F, 0.0F, 0.0F);


        this.backleftleg4 = new ModelRenderer(this);
        this.backleftleg4.setRotationPoint(-0.2F, 2.6628F, 0.0079F);
        this.backleftleg3.addChild(backleftleg4);
        this.setRotateAngle(backleftleg4, 0.1745F, 0.0F, 0.0F);


        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-6.75F, 0.25F, 0.5F);
        this.body.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.3054F, 0.0F, 0.0F);


        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(0.15F, 12.1523F, -0.6836F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.5234F, 0.0055F, 0.0F);


        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(-0.5F, 9.7344F, 0.9796F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.3927F, 0.0F, 0.0F);


        this.backrightleg4 = new ModelRenderer(this);
        this.backrightleg4.setRotationPoint(0.2F, 2.6628F, 0.0079F);
        this.backrightleg3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, 0.2623F, 0.0062F, 0.002F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.05F, 3.65F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.0447F, -0.1298F, 0.0172F);
        this.tail.cubeList.add(new ModelBox(tail, 50, 13, -0.5F, 1.2065F, 0.0584F, 1, 1, 8, -0.1F, false));

        this.leftPlate11 = new ModelRenderer(this);
        this.leftPlate11.setRotationPoint(1.9F, -1.3802F, 4.489F);
        this.tail.addChild(leftPlate11);
        this.setRotateAngle(leftPlate11, -0.5199F, 0.0653F, 0.1135F);


        this.rightPlate11 = new ModelRenderer(this);
        this.rightPlate11.setRotationPoint(-1.9F, -1.3802F, 4.489F);
        this.tail.addChild(rightPlate11);
        this.setRotateAngle(rightPlate11, -0.5199F, -0.0653F, -0.1135F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0659F, 7.8214F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1583F, -0.1183F, -0.2195F);
        this.tail2.cubeList.add(new ModelBox(tail2, 32, 55, -0.5F, 1.1406F, 0.037F, 1, 1, 7, -0.1F, false));

        this.leftPlate12 = new ModelRenderer(this);
        this.leftPlate12.setRotationPoint(1.4F, -2.004F, 5.3085F);
        this.tail2.addChild(leftPlate12);
        this.setRotateAngle(leftPlate12, -0.4331F, 0.0552F, 0.1188F);


        this.rightPlate12 = new ModelRenderer(this);
        this.rightPlate12.setRotationPoint(-1.4F, -2.004F, 5.3085F);
        this.tail2.addChild(rightPlate12);
        this.setRotateAngle(rightPlate12, -0.4331F, -0.0552F, -0.1188F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0276F, 6.9965F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1954F, -0.2087F, -0.1082F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 29, -0.5F, 1.1505F, -0.8354F, 1, 1, 12, -0.1F, false));

        this.leftPlate13 = new ModelRenderer(this);
        this.leftPlate13.setRotationPoint(1.075F, -1.0012F, 6.336F);
        this.tail3.addChild(leftPlate13);
        this.setRotateAngle(leftPlate13, -0.4349F, 0.0368F, 0.0791F);


        this.rightPlate13 = new ModelRenderer(this);
        this.rightPlate13.setRotationPoint(-1.075F, -1.0012F, 6.336F);
        this.tail3.addChild(rightPlate13);
        this.setRotateAngle(rightPlate13, -0.4349F, -0.0368F, -0.0791F);


        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0439F, 10.612F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.3087F, -0.1704F, -0.0381F);
        this.tail4.cubeList.add(new ModelBox(tail4, 37, 19, -0.5F, 1.3F, -0.2F, 1, 1, 10, -0.1F, false));

        this.leftPlate14 = new ModelRenderer(this);
        this.leftPlate14.setRotationPoint(0.95F, -0.9088F, 3.3459F);
        this.tail4.addChild(leftPlate14);
        this.setRotateAngle(leftPlate14, -0.3914F, 0.0334F, 0.0807F);


        this.rightPlate14 = new ModelRenderer(this);
        this.rightPlate14.setRotationPoint(-0.95F, -0.9088F, 3.3459F);
        this.tail4.addChild(rightPlate14);
        this.setRotateAngle(rightPlate14, -0.3914F, -0.0334F, -0.0807F);


        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.05F, 9.7F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0423F, -0.1739F, -0.0154F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.5211F, 10.0455F);
        this.tail5.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0611F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 33, -0.5F, -0.5153F, -10.7469F, 1, 1, 11, -0.1F, false));

        this.leftPlate15 = new ModelRenderer(this);
        this.leftPlate15.setRotationPoint(0.7F, -0.2971F, 0.469F);
        this.tail5.addChild(leftPlate15);
        this.setRotateAngle(leftPlate15, -0.4349F, 0.0368F, 0.0791F);


        this.rightPlate15 = new ModelRenderer(this);
        this.rightPlate15.setRotationPoint(-0.7F, -0.2971F, 0.469F);
        this.tail5.addChild(rightPlate15);
        this.setRotateAngle(rightPlate15, -0.4349F, -0.0368F, -0.0791F);


        this.leftPlate16 = new ModelRenderer(this);
        this.leftPlate16.setRotationPoint(0.7F, -0.3971F, 6.569F);
        this.tail5.addChild(leftPlate16);
        this.setRotateAngle(leftPlate16, -0.4349F, 0.0368F, 0.0791F);


        this.rightPlate16 = new ModelRenderer(this);
        this.rightPlate16.setRotationPoint(-0.7F, -0.3971F, 6.569F);
        this.tail5.addChild(rightPlate16);
        this.setRotateAngle(rightPlate16, -0.4349F, -0.0368F, -0.0791F);


        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 1.6587F, 10.4534F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.5672F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 17, -0.5F, 0.4982F, -0.2736F, 1, 1, 13, -0.1F, false));

        this.lefttailSpike = new ModelRenderer(this);
        this.lefttailSpike.setRotationPoint(2.05F, -1.5479F, 2.4836F);
        this.tail6.addChild(lefttailSpike);
        this.setRotateAngle(lefttailSpike, 0.1893F, -0.0033F, 1.0022F);


        this.righttailSpike = new ModelRenderer(this);
        this.righttailSpike.setRotationPoint(-2.05F, -1.5479F, 2.4836F);
        this.tail6.addChild(righttailSpike);
        this.setRotateAngle(righttailSpike, 0.1893F, 0.0033F, -1.0022F);


        this.lefttailSpike2 = new ModelRenderer(this);
        this.lefttailSpike2.setRotationPoint(1.275F, -1.0229F, 6.7086F);
        this.tail6.addChild(lefttailSpike2);
        this.setRotateAngle(lefttailSpike2, -0.1148F, -0.0131F, 1.0529F);


        this.righttailSpike2 = new ModelRenderer(this);
        this.righttailSpike2.setRotationPoint(-1.275F, -1.0229F, 6.7086F);
        this.tail6.addChild(righttailSpike2);
        this.setRotateAngle(righttailSpike2, -0.1148F, 0.0131F, -1.0529F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.3F, -6.45F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.8118F, -13.4106F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, 1.4F, -0.25F, 1, 1, 14, -0.1F, false));

        this.leftPlate8 = new ModelRenderer(this);
        this.leftPlate8.setRotationPoint(3.0F, -3.4882F, -6.3606F);
        this.body2.addChild(leftPlate8);
        this.setRotateAngle(leftPlate8, 0.0859F, -0.0151F, 0.1739F);


        this.rightPlate8 = new ModelRenderer(this);
        this.rightPlate8.setRotationPoint(-3.0F, -3.4882F, -6.3606F);
        this.body2.addChild(rightPlate8);
        this.setRotateAngle(rightPlate8, 0.0859F, 0.0151F, -0.1739F);


        this.leftPlate7 = new ModelRenderer(this);
        this.leftPlate7.setRotationPoint(2.5F, -2.0582F, -12.3598F);
        this.body2.addChild(leftPlate7);
        this.setRotateAngle(leftPlate7, 0.258F, -0.045F, 0.1687F);


        this.rightPlate7 = new ModelRenderer(this);
        this.rightPlate7.setRotationPoint(-2.5F, -2.0582F, -12.3598F);
        this.body2.addChild(rightPlate7);
        this.setRotateAngle(rightPlate7, 0.258F, 0.045F, -0.1687F);


        this.leftPlate9 = new ModelRenderer(this);
        this.leftPlate9.setRotationPoint(2.75F, -2.7828F, 0.2358F);
        this.body2.addChild(leftPlate9);
        this.setRotateAngle(leftPlate9, -0.215F, 0.0376F, 0.1705F);


        this.rightPlate9 = new ModelRenderer(this);
        this.rightPlate9.setRotationPoint(-2.75F, -2.7828F, 0.2358F);
        this.body2.addChild(rightPlate9);
        this.setRotateAngle(rightPlate9, -0.215F, -0.0376F, -0.1705F);


        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, 1.1214F, -13.3806F);
        this.body2.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.2618F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 1.9142F, -2.893F);
        this.upperbody.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5236F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 73, 54, -1.5F, 0.9161F, -0.2572F, 1, 1, 4, -0.1F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 5.0858F, -6.7583F);
        this.upperbody.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6109F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 60, 11, -1.5F, 0.5351F, -1.0717F, 1, 1, 6, -0.1F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 4.2963F, -7.3256F);
        this.upperbody.addChild(neck3);
        this.setRotateAngle(neck3, -0.1745F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.8051F, -3.2661F);
        this.neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2269F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 67, 46, -1.0F, 1.4F, -1.1F, 1, 1, 5, -0.1F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.687F, -9.1828F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 32, 0.0F, 1.75F, 0.05F, 1, 1, 6, -0.1F, false));

        this.leftPlate4 = new ModelRenderer(this);
        this.leftPlate4.setRotationPoint(1.75F, -0.563F, -4.1328F);
        this.neck3.addChild(leftPlate4);
        this.setRotateAngle(leftPlate4, 0.1309F, 0.0F, 0.0F);


        this.rightPlate4 = new ModelRenderer(this);
        this.rightPlate4.setRotationPoint(-1.75F, -0.563F, -4.1328F);
        this.neck3.addChild(rightPlate4);
        this.setRotateAngle(rightPlate4, 0.1309F, 0.0F, 0.0F);


        this.leftPlate3 = new ModelRenderer(this);
        this.leftPlate3.setRotationPoint(1.4216F, -0.5422F, -8.023F);
        this.neck3.addChild(leftPlate3);
        this.setRotateAngle(leftPlate3, -0.0436F, 0.0F, 0.0F);


        this.rightPlate3 = new ModelRenderer(this);
        this.rightPlate3.setRotationPoint(-1.4216F, -0.5422F, -8.023F);
        this.neck3.addChild(rightPlate3);
        this.setRotateAngle(rightPlate3, -0.0436F, 0.0F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(-0.5F, 1.0692F, -9.0499F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.393F, -0.0403F, 0.0167F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.5482F, -2.7888F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 49, 23, 0.0F, 0.3467F, -0.1027F, 1, 1, 4, -0.1F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.0518F, -5.7888F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 84, 12, 0.0F, 0.55F, 0.05F, 1, 1, 4, -0.1F, false));

        this.leftPlate2 = new ModelRenderer(this);
        this.leftPlate2.setRotationPoint(1.75F, -1.0337F, -3.2721F);
        this.neck2.addChild(leftPlate2);
        this.setRotateAngle(leftPlate2, 0.1745F, 0.0F, 0.0F);


        this.rightPlate2 = new ModelRenderer(this);
        this.rightPlate2.setRotationPoint(-0.75F, -1.0337F, -3.2721F);
        this.neck2.addChild(rightPlate2);
        this.setRotateAngle(rightPlate2, 0.1745F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1436F, -5.5086F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.3309F, -0.2751F, -0.2478F);


        this.leftPlate1 = new ModelRenderer(this);
        this.leftPlate1.setRotationPoint(1.25F, -1.4F, -0.8F);
        this.neck.addChild(leftPlate1);


        this.rightPlate1 = new ModelRenderer(this);
        this.rightPlate1.setRotationPoint(-0.25F, -1.4F, -0.8F);
        this.neck.addChild(rightPlate1);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(1.0F, -0.4F, -2.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2166F, 0.1418F, -0.0328F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.9919F, 0.1541F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);


        this.frontleftleg = new ModelRenderer(this);
        this.frontleftleg.setRotationPoint(6.65F, 9.8134F, -5.7706F);
        this.upperbody.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.9647F, -0.028F, -0.3917F);


        this.frontleftleg2 = new ModelRenderer(this);
        this.frontleftleg2.setRotationPoint(-0.0452F, 9.6262F, 0.3939F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.3521F, 0.2625F, 0.5722F);


        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(-0.1902F, 7.6332F, -0.3373F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 1.789F, 0.0873F, 0.0F);


        this.frontrightleg = new ModelRenderer(this);
        this.frontrightleg.setRotationPoint(-6.65F, 9.8134F, -5.7706F);
        this.upperbody.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 1.052F, 0.028F, 0.3917F);


        this.frontrightleg2 = new ModelRenderer(this);
        this.frontrightleg2.setRotationPoint(0.0452F, 9.6262F, 0.3939F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.91F, -0.2515F, -0.4186F);


        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.1902F, 7.6332F, -0.3373F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 2.2253F, -0.0873F, 0.0F);


        this.leftPlate6 = new ModelRenderer(this);
        this.leftPlate6.setRotationPoint(2.5F, -0.9248F, -4.1289F);
        this.upperbody.addChild(leftPlate6);
        this.setRotateAngle(leftPlate6, 0.517F, -0.0869F, 0.1515F);


        this.rightPlate6 = new ModelRenderer(this);
        this.rightPlate6.setRotationPoint(-2.5F, -0.9248F, -4.1289F);
        this.upperbody.addChild(rightPlate6);
        this.setRotateAngle(rightPlate6, 0.517F, 0.0869F, -0.1515F);


        this.leftPlate5 = new ModelRenderer(this);
        this.leftPlate5.setRotationPoint(1.75F, 2.1752F, -8.0289F);
        this.upperbody.addChild(leftPlate5);
        this.setRotateAngle(leftPlate5, 0.5654F, -0.0561F, 0.0669F);


        this.rightPlate5 = new ModelRenderer(this);
        this.rightPlate5.setRotationPoint(-1.75F, 2.1752F, -8.0289F);
        this.upperbody.addChild(rightPlate5);
        this.setRotateAngle(rightPlate5, 0.5654F, 0.0561F, -0.0669F);


        this.Leftlegspike = new ModelRenderer(this);
        this.Leftlegspike.setRotationPoint(7.6F, 4.8752F, -3.1289F);
        this.upperbody.addChild(Leftlegspike);
        this.setRotateAngle(Leftlegspike, 0.1333F, 0.1772F, 0.101F);


        this.Rightlegspike = new ModelRenderer(this);
        this.Rightlegspike.setRotationPoint(-7.6F, 4.8752F, -3.1289F);
        this.upperbody.addChild(Rightlegspike);
        this.setRotateAngle(Rightlegspike, 0.1333F, -0.1772F, -0.101F);

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
