package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPterodactylus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer body1;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body1_r1;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer chest_r1;
    private final ModelRenderer leftwing;
    private final ModelRenderer leftwing2;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer leftwing3;
    private final ModelRenderer leftwing4;
    private final ModelRenderer leftwing5;
    private final ModelRenderer cube_r27;
    private final ModelRenderer leftwing6;
    private final ModelRenderer handR2;
    private final ModelRenderer rightwing;
    private final ModelRenderer rightwing2;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer rightwing3;
    private final ModelRenderer rightwing4;
    private final ModelRenderer rightwing5;
    private final ModelRenderer cube_r30;
    private final ModelRenderer rightwing6;
    private final ModelRenderer handR3;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r31;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer head;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer throat;

    public ModelSkeletonPterodactylus() {
        this.textureWidth = 41;
        this.textureHeight = 41;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -7.85F, 2.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.0873F, 0.0F, 0.0F);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.55F, 2.25F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, -0.2637F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.3362F, 1.408F, 0.6715F);
        this.body1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5101F, 0.1346F, -0.1008F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 32, -0.3164F, -0.3965F, -1.3772F, 1, 1, 2, -0.203F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.4758F, 0.6562F);
        this.body1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2679F, 0.2106F, -0.0573F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 32, -0.8F, 0.5F, -0.2F, 1, 1, 2, -0.203F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 32, -0.8F, 0.1F, -0.2F, 1, 1, 2, -0.2F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 17, -0.8F, -0.5F, -1.6F, 1, 1, 4, -0.2F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.3F, -0.25F);
        this.body1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 23, -1.1F, -0.3648F, 0.4208F, 1, 1, 2, 0.003F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 23, 0.1F, -0.3648F, 0.4208F, 1, 1, 2, 0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 0.4758F, 0.6562F);
        this.body1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2679F, -0.2106F, 0.0573F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 17, -0.2F, -0.5F, -1.6F, 1, 1, 4, -0.2F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 32, -0.2F, 0.5F, -0.2F, 1, 1, 2, -0.203F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 32, -0.2F, 0.1F, -0.2F, 1, 1, 2, -0.2F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(1.3362F, 1.408F, 0.6715F);
        this.body1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5101F, -0.1346F, 0.1008F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 32, -0.6836F, -0.3965F, -1.3772F, 1, 1, 2, -0.203F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.3362F, 1.408F, 0.6715F);
        this.body1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5101F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 4, -2.8362F, -0.3965F, -1.9772F, 3, 1, 1, -0.203F, false));

        this.body1_r1 = new ModelRenderer(this);
        this.body1_r1.setRotationPoint(0.0F, 0.721F, 0.5779F);
        this.body1.addChild(body1_r1);
        this.setRotateAngle(body1_r1, -0.3054F, 0.0F, 0.0F);
        this.body1_r1.cubeList.add(new ModelBox(body1_r1, 19, 30, -0.5F, -0.75F, -0.7F, 1, 1, 2, -0.002F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(1.8F, 1.271F, 0.8779F);
        this.body1.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.3762F, 0.2018F, -0.7356F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 10, -0.8674F, -0.1476F, -0.4585F, 1, 3, 1, 0.0F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.3398F, 2.7451F, 0.0857F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.6013F, -0.4618F, 0.4437F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 0, -0.5694F, -0.1405F, -0.4998F, 1, 4, 1, 0.0F, false));

        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(-0.0694F, 3.5345F, -0.0498F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.1578F, 0.2393F, 0.1223F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 19, 0, -1.1124F, -0.4472F, -2.507F, 2, 1, 3, 0.0F, false));

        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-1.8F, 1.271F, 0.8779F);
        this.body1.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.0712F, -0.2172F, 0.743F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 10, -0.1326F, -0.1476F, -0.4585F, 1, 3, 1, 0.0F, true));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.3398F, 2.7451F, 0.0857F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.4082F, 0.4862F, -0.4844F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 0, -0.4306F, -0.1405F, -0.4998F, 1, 4, 1, 0.0F, true));

        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0694F, 3.4345F, -0.0498F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.245F, -0.2393F, -0.1223F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 19, 0, -0.8876F, -0.4472F, -2.507F, 2, 1, 3, 0.0F, true));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.596F, 1.8779F);
        this.body1.addChild(tail);
        this.setRotateAngle(tail, -0.3124F, -0.2079F, 0.0666F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.0162F, -0.2817F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 12, -0.5F, -0.27F, 0.3268F, 1, 1, 2, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.7F, 2.05F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.0892F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.8732F, -0.5272F, -3.7727F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.48F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 27, 0.3732F, 0.6792F, -0.8058F, 1, 1, 1, 0.003F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 21, -0.6268F, 0.6792F, 0.1942F, 3, 1, 2, 0.003F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0029F, -0.999F, -4.0506F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1979F, 0.5195F, -0.6388F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 10, -1.0176F, -0.65F, -0.8981F, 1, 3, 1, -0.2F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.4732F, 0.6728F, -3.1727F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1355F, 0.4571F, -0.1486F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 28, -1.0311F, -2.1947F, -1.6474F, 1, 1, 3, -0.2F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.2F, -1.4992F, -3.9678F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4126F, 0.2581F, -1.0419F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 6, -2.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.2F, -1.4992F, -3.9678F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2683F, 0.4063F, -0.6069F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.2F, -0.703F, -1.9663F);
        this.chest.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1846F, -0.1929F, -0.9759F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 10, -2.5722F, -0.6426F, -0.5009F, 2, 0, 1, 0.0F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.2F, -0.703F, -1.9663F);
        this.chest.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.248F, -0.0978F, -0.5453F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 21, -0.7901F, -0.3405F, -0.5009F, 1, 0, 1, 0.0F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.2F, -0.7069F, -0.0663F);
        this.chest.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3721F, -0.4415F, -0.9168F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 22, 10, -3.1314F, -0.2854F, -0.2905F, 2, 0, 1, 0.0F, true));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.2F, -0.7069F, -0.0663F);
        this.chest.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.5167F, -0.251F, -0.4983F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 17, -1.146F, 0.2194F, -0.2905F, 1, 0, 1, 0.0F, true));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.4732F, 0.6728F, -3.1727F);
        this.chest.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1355F, -0.4571F, 0.1486F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 28, 0.0311F, -2.1947F, -1.6474F, 1, 1, 3, -0.2F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0029F, -0.999F, -4.0506F);
        this.chest.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1979F, -0.5195F, 0.6388F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 8, 10, 0.0176F, -0.65F, -0.8981F, 1, 3, 1, -0.2F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.2F, -0.7069F, -0.0663F);
        this.chest.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3721F, 0.4415F, 0.9168F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 22, 10, 1.1314F, -0.2854F, -0.2905F, 2, 0, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.2F, -0.7069F, -0.0663F);
        this.chest.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.5167F, 0.251F, 0.4983F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 17, 0.146F, 0.2194F, -0.2905F, 1, 0, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.2F, -0.703F, -1.9663F);
        this.chest.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1846F, 0.1929F, 0.9759F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 13, 10, 0.5722F, -0.6426F, -0.5009F, 2, 0, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.2F, -0.703F, -1.9663F);
        this.chest.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.248F, 0.0978F, 0.5453F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 30, 21, -0.2099F, -0.3405F, -0.5009F, 1, 0, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.2F, -1.4992F, -3.9678F);
        this.chest.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2683F, -0.4063F, 0.6069F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 27, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.2F, -1.4992F, -3.9678F);
        this.chest.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.4126F, -0.2581F, 1.0419F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 6, 0.9063F, -0.4226F, -0.5F, 2, 0, 1, 0.0F, false));

        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(0.0F, -1.5827F, -4.3499F);
        this.chest.addChild(chest_r1);
        this.setRotateAngle(chest_r1, -0.3229F, 0.0F, 0.0F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 8, 12, -0.5F, -0.3359F, -0.1126F, 1, 1, 5, 0.0F, false));

        this.leftwing = new ModelRenderer(this);
        this.leftwing.setRotationPoint(1.85F, -0.889F, -3.4483F);
        this.chest.addChild(leftwing);
        this.setRotateAngle(leftwing, -0.0319F, -0.5284F, 0.754F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 22, 14, -0.2496F, -0.4019F, -0.6533F, 4, 1, 1, -0.2F, false));

        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(3.7004F, 0.0481F, -0.2533F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.239F, 0.5005F, -0.7896F);


        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.2894F, 3.3949F, 0.1087F);
        this.leftwing2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5236F, 0.0F, 0.0436F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 11, 0, -1.3589F, -1.4993F, -0.9025F, 1, 2, 1, -0.3F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.0623F, 0.0087F, 0.0112F);
        this.leftwing2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.0436F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 33, -0.5F, -0.3F, -0.5F, 1, 4, 1, -0.2F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 5, 35, -1.1F, -0.3F, -0.5F, 1, 4, 1, -0.3F, false));

        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.5172F, 3.4711F, -0.1213F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, -0.8437F, 0.0115F, -0.0813F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 14, 21, -0.4805F, -0.626F, -0.1913F, 1, 1, 4, -0.2F, false));

        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(0.4383F, -0.2956F, 3.6533F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.9034F, -0.1608F, 0.077F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 22, 25, -0.4037F, -0.9228F, -0.689F, 1, 1, 3, -0.2F, false));

        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.5399F, -0.1204F, 1.912F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.9128F, -0.0395F, 0.0494F);


        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.6122F, -0.2969F, 7.6787F);
        this.leftwing5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2706F, -0.2527F, -0.0692F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 12, 27, -0.5F, -0.5F, -0.2F, 1, 1, 3, -0.2F, false));

        this.leftwing6 = new ModelRenderer(this);
        this.leftwing6.setRotationPoint(-0.5399F, -0.1204F, 1.912F);
        this.leftwing4.addChild(leftwing6);
        this.setRotateAngle(leftwing6, 0.9128F, -0.0395F, 0.0494F);
        this.leftwing6.cubeList.add(new ModelBox(leftwing6, 0, 0, 0.1122F, -0.7969F, -0.0213F, 1, 1, 8, -0.2F, false));

        this.handR2 = new ModelRenderer(this);
        this.handR2.setRotationPoint(-0.0305F, -0.026F, 3.4087F);
        this.leftwing3.addChild(handR2);
        this.setRotateAngle(handR2, -1.5252F, 0.1685F, -1.3051F);
        this.handR2.cubeList.add(new ModelBox(handR2, 34, 7, -0.5F, -0.5F, 0.1F, 1, 1, 2, -0.01F, false));

        this.rightwing = new ModelRenderer(this);
        this.rightwing.setRotationPoint(-1.85F, -0.889F, -3.4483F);
        this.chest.addChild(rightwing);
        this.setRotateAngle(rightwing, -0.0294F, 0.354F, -0.7481F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 22, 14, -3.7504F, -0.4019F, -0.6533F, 4, 1, 1, -0.2F, true));

        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-3.7004F, 0.0481F, -0.2533F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -1.3458F, -0.3763F, 0.8354F);


        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.2894F, 3.3949F, 0.1087F);
        this.rightwing2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.5236F, 0.0F, -0.0436F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 11, 0, 0.3589F, -1.4993F, -0.9025F, 1, 2, 1, -0.3F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0623F, 0.0087F, 0.0112F);
        this.rightwing2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, -0.0436F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 33, -0.5F, -0.3F, -0.5F, 1, 4, 1, -0.2F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 5, 35, 0.1F, -0.3F, -0.5F, 1, 4, 1, -0.3F, true));

        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.5172F, 3.4711F, -0.1213F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, -0.4947F, -0.0115F, 0.0813F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 14, 21, -0.5195F, -0.626F, -0.1913F, 1, 1, 4, -0.2F, true));

        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(-0.4383F, -0.2956F, 3.6533F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 2.0456F, 0.0909F, -0.1569F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 22, 25, -0.5963F, -0.9228F, -0.689F, 1, 1, 3, -0.2F, true));

        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.5399F, -0.1204F, 1.912F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.9128F, 0.0395F, -0.0494F);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.6122F, -0.2969F, 7.6787F);
        this.rightwing5.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2706F, 0.2527F, 0.0692F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 12, 27, -0.5F, -0.5F, -0.2F, 1, 1, 3, -0.2F, true));

        this.rightwing6 = new ModelRenderer(this);
        this.rightwing6.setRotationPoint(0.5399F, -0.1204F, 1.912F);
        this.rightwing4.addChild(rightwing6);
        this.setRotateAngle(rightwing6, 0.9128F, 0.0395F, -0.0494F);
        this.rightwing6.cubeList.add(new ModelBox(rightwing6, 0, 0, -1.1122F, -0.7969F, -0.0213F, 1, 1, 8, -0.2F, true));

        this.handR3 = new ModelRenderer(this);
        this.handR3.setRotationPoint(0.0305F, -0.026F, 3.4087F);
        this.rightwing3.addChild(handR3);
        this.setRotateAngle(handR3, -1.2634F, -0.1685F, 1.3051F);
        this.handR3.cubeList.add(new ModelBox(handR3, 34, 7, -0.5F, -0.5F, 0.1F, 1, 1, 2, -0.01F, true));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.339F, -4.4983F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.829F, 0.0F, 0.0F);


        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.2628F, -3.1778F);
        this.neck.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0873F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 7, 19, -0.5F, -0.5F, -0.1F, 1, 1, 4, -0.01F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0628F, -3.0278F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.5133F, 0.1084F, 0.1897F);


        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.3846F, -1.7364F);
        this.neck2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0436F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 7, 31, -0.5F, -0.5784F, -0.2034F, 1, 1, 2, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -0.4136F, -4.0754F);
        this.neck2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.3491F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 23, -0.5F, -0.5872F, -0.5038F, 1, 1, 3, -0.02F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.6567F, -4.2951F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.8333F, 0.0883F, 0.0968F);
        this.head.cubeList.add(new ModelBox(head, 22, 5, -1.0F, -0.616F, -2.567F, 2, 1, 3, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 19, 34, 0.13F, -0.666F, -2.167F, 1, 1, 2, -0.1F, false));
        this.head.cubeList.add(new ModelBox(head, 34, 16, 0.2F, -0.666F, -1.567F, 1, 1, 1, -0.15F, false));
        this.head.cubeList.add(new ModelBox(head, 16, 14, 0.3F, -0.666F, -1.567F, 1, 1, 1, -0.23F, false));
        this.head.cubeList.add(new ModelBox(head, 19, 34, -1.13F, -0.666F, -2.167F, 1, 1, 2, -0.1F, true));
        this.head.cubeList.add(new ModelBox(head, 16, 14, -1.3F, -0.666F, -1.567F, 1, 1, 1, -0.23F, true));
        this.head.cubeList.add(new ModelBox(head, 34, 16, -1.2F, -0.666F, -1.567F, 1, 1, 1, -0.15F, true));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.384F, -2.567F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0873F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 11, 0, -0.5F, -1.0F, -6.9F, 1, 1, 5, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 30, 0, -1.0F, -1.0F, -1.9F, 2, 1, 2, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, 0.7656F, -6.9067F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1585F, -0.0735F, 0.4305F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 16, 14, 0.0F, -0.6769F, -2.4436F, 0, 1, 5, 0.0F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, 0.7656F, -6.9067F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1585F, 0.0735F, -0.4305F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 16, 14, 0.0F, -0.6769F, -2.4436F, 0, 1, 5, 0.0F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.63F, -0.066F, -3.467F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0873F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 6, 25, -0.6F, -0.4F, -1.6F, 1, 1, 3, -0.17F, true));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 6, 25, 0.86F, -0.4F, -1.6F, 1, 1, 3, -0.17F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -0.116F, -1.067F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1309F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 28, 27, -0.5F, -0.7F, -1.55F, 1, 1, 3, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.3907F, -0.7549F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5672F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 27, 10, -1.0F, -0.1094F, -1.919F, 2, 1, 2, -0.01F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -0.1094F, -1.894F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0873F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 27, 17, -1.0F, 0.0F, -1.9F, 2, 1, 2, -0.012F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -0.1094F, -1.794F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0873F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 10, -0.5F, 0.0F, -6.9F, 1, 1, 5, 0.0F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, 0.4503F, -8.2132F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0328F, 0.0189F, -0.2174F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 16, 7, 0.0F, -0.3481F, -0.3564F, 0, 1, 5, 0.0F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, 0.4503F, -8.2132F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0328F, -0.0189F, 0.2174F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 16, 7, 0.0F, -0.3481F, -0.3564F, 0, 1, 5, 0.0F, false));

        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.8976F, -2.9807F);
        this.jaw.addChild(throat);

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
