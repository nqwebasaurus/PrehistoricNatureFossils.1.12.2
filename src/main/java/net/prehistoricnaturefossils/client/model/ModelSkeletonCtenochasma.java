package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCtenochasma extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer body1;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body3_r1;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer tail;
    private final ModelRenderer chest;
    private final ModelRenderer chest_r1;
    private final ModelRenderer chest_r2;
    private final ModelRenderer chest_r3;
    private final ModelRenderer chest_r4;
    private final ModelRenderer chest_r5;
    private final ModelRenderer chest_r6;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer chest_r7;
    private final ModelRenderer chest_r8;
    private final ModelRenderer chest_r9;
    private final ModelRenderer chest_r10;
    private final ModelRenderer chest_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer chest_r12;
    private final ModelRenderer leftwing6;
    private final ModelRenderer leftwing7;
    private final ModelRenderer cube_r16;
    private final ModelRenderer leftwing8;
    private final ModelRenderer leftmembrane;
    private final ModelRenderer cube_r17;
    private final ModelRenderer lefthand;
    private final ModelRenderer cube_r18;
    private final ModelRenderer rightwing6;
    private final ModelRenderer rightwing7;
    private final ModelRenderer cube_r19;
    private final ModelRenderer rightwing8;
    private final ModelRenderer rightmembrane;
    private final ModelRenderer cube_r20;
    private final ModelRenderer righthand;
    private final ModelRenderer cube_r21;
    private final ModelRenderer neck;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r22;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r23;
    private final ModelRenderer head;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer leftHead;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer rightHead;
    private final ModelRenderer cube_r98;
    private final ModelRenderer cube_r99;
    private final ModelRenderer cube_r100;
    private final ModelRenderer cube_r101;
    private final ModelRenderer cube_r102;
    private final ModelRenderer cube_r103;
    private final ModelRenderer cube_r104;
    private final ModelRenderer cube_r105;
    private final ModelRenderer cube_r106;
    private final ModelRenderer cube_r107;
    private final ModelRenderer cube_r108;
    private final ModelRenderer cube_r109;
    private final ModelRenderer cube_r110;
    private final ModelRenderer cube_r111;
    private final ModelRenderer cube_r112;
    private final ModelRenderer cube_r113;
    private final ModelRenderer cube_r114;
    private final ModelRenderer cube_r115;
    private final ModelRenderer cube_r116;
    private final ModelRenderer cube_r117;
    private final ModelRenderer cube_r118;
    private final ModelRenderer cube_r119;
    private final ModelRenderer cube_r120;
    private final ModelRenderer cube_r121;
    private final ModelRenderer cube_r122;

    public ModelSkeletonCtenochasma() {
        this.textureWidth = 65;
        this.textureHeight = 65;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -7.0F, 1.1F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.4974F, 0.0F, 0.0F);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 2.25F, 1.75F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, -0.2456F, 0.2543F, -0.063F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.028F, -0.8021F, 0.8465F);
        this.body1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0463F, 0.2106F, -0.0573F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 58, -0.5F, -0.9F, -0.5F, 1, 1, 1, -0.206F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.9197F, -0.2894F, 1.2145F);
        this.body1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2732F, 0.2106F, -0.0573F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 7, -0.5F, -1.1F, -1.0F, 1, 1, 2, -0.203F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.3824F, -0.707F, 0.3018F);
        this.body1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1613F, 0.0921F, -0.1407F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 5, 54, -1.1095F, -0.6005F, -0.4961F, 1, 1, 1, -0.203F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.8F, -1.4742F, 0.6562F);
        this.body1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2679F, 0.2106F, -0.0573F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 27, -0.8F, -0.5F, -2.1F, 1, 1, 3, -0.2F, true));

        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -1.7898F, 0.1974F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.2793F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 31, 42, -1.1F, -0.2948F, -0.2203F, 1, 1, 2, -0.2F, true));
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 31, 42, 0.1F, -0.2948F, -0.2203F, 1, 1, 2, -0.2F, false));
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 0, 44, -0.5F, -0.2948F, -0.2203F, 1, 1, 2, -0.201F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.8F, -1.4742F, 0.6562F);
        this.body1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2679F, -0.2106F, 0.0573F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 27, -0.2F, -0.5F, -2.1F, 1, 1, 3, -0.2F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.9197F, -0.2894F, 1.2145F);
        this.body1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2732F, -0.2106F, 0.0573F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 7, -0.5F, -1.1F, -1.0F, 1, 1, 2, -0.203F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(1.028F, -0.8021F, 0.8465F);
        this.body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0463F, -0.2106F, 0.0573F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 58, -0.5F, -0.9F, -0.5F, 1, 1, 1, -0.206F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.3824F, -0.707F, 0.3018F);
        this.body1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1613F, -0.0921F, 0.1407F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 54, 0.1095F, -0.6005F, -0.4961F, 1, 1, 1, -0.203F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5824F, -0.707F, 0.3018F);
        this.body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.161F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 6, -2.0824F, -0.4876F, -1.0442F, 3, 1, 1, -0.203F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(1.0F, -1.05F, 0.8F);
        this.body1.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.5633F, -0.0702F, -1.242F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 10, -0.5F, 0.0F, -1.0F, 1, 2, 1, -0.2F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0276F, 1.6927F, -0.4558F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.4808F, -0.2184F, 0.1965F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 21, 39, -0.5694F, -0.1405F, -0.4998F, 1, 4, 1, -0.2F, false));

        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(-0.0694F, 3.4345F, -0.0498F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 1.2162F, 0.2407F, 0.2122F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 8, 25, -1.1124F, -0.4472F, -2.507F, 2, 1, 3, -0.2F, false));

        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-1.0F, -1.05F, 0.8F);
        this.body1.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.5633F, 0.0702F, 1.242F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 0, -0.5F, 0.0F, -1.0F, 1, 2, 1, -0.2F, false));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.0276F, 1.6927F, -0.4558F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.4808F, 0.2184F, -0.1965F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 16, 39, -0.4306F, -0.1405F, -0.4998F, 1, 4, 1, -0.2F, false));

        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0694F, 3.4345F, -0.0498F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 1.2162F, -0.2407F, -0.2122F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 0, 22, -0.8876F, -0.4472F, -2.507F, 2, 1, 3, -0.2F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.425F, 1.8F);
        this.body1.addChild(tail);
        this.setRotateAngle(tail, -0.2633F, 0.2615F, -0.0117F);
        this.tail.cubeList.add(new ModelBox(tail, 7, 41, -0.5F, -0.3F, -0.45F, 1, 1, 2, -0.3F, false));
        this.tail.cubeList.add(new ModelBox(tail, 58, 41, -0.5F, -0.3F, 0.95F, 1, 1, 1, -0.3F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.5F, 2.05F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, 0.0418F, 0.3917F, -0.0123F);


        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(-0.5F, -0.8898F, -2.1305F);
        this.chest.addChild(chest_r1);
        this.setRotateAngle(chest_r1, -0.3403F, 0.0F, 0.0F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 25, 19, 0.0F, -0.2754F, -0.2133F, 1, 1, 3, -0.2F, false));

        this.chest_r2 = new ModelRenderer(this);
        this.chest_r2.setRotationPoint(-0.3F, -0.3196F, -0.7832F);
        this.chest.addChild(chest_r2);
        this.setRotateAngle(chest_r2, -0.1609F, -0.2095F, -0.8809F);
        this.chest_r2.cubeList.add(new ModelBox(chest_r2, 18, 19, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r3 = new ModelRenderer(this);
        this.chest_r3.setRotationPoint(-0.3F, -0.7196F, -2.2832F);
        this.chest.addChild(chest_r3);
        this.setRotateAngle(chest_r3, 0.0166F, 0.0052F, -0.7243F);
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 8, 13, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r4 = new ModelRenderer(this);
        this.chest_r4.setRotationPoint(-0.3F, -0.7196F, -2.2832F);
        this.chest.addChild(chest_r4);
        this.setRotateAngle(chest_r4, 0.0129F, 0.0118F, -1.1606F);
        this.chest_r4.cubeList.add(new ModelBox(chest_r4, 8, 3, -1.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r5 = new ModelRenderer(this);
        this.chest_r5.setRotationPoint(-0.3F, -0.9196F, -3.8832F);
        this.chest.addChild(chest_r5);
        this.setRotateAngle(chest_r5, 0.1332F, 0.0419F, -0.6692F);
        this.chest_r5.cubeList.add(new ModelBox(chest_r5, 5, 17, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.chest_r6 = new ModelRenderer(this);
        this.chest_r6.setRotationPoint(-0.3F, -0.9196F, -3.8832F);
        this.chest.addChild(chest_r6);
        this.setRotateAngle(chest_r6, 0.1032F, 0.0942F, -1.1034F);
        this.chest_r6.cubeList.add(new ModelBox(chest_r6, 0, 17, -1.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0029F, -0.849F, -4.3506F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1979F, 0.5195F, -0.6388F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 44, -1.0176F, -0.65F, -0.8981F, 1, 2, 1, -0.2F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.4732F, 0.8228F, -3.4727F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1355F, 0.4571F, -0.1486F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 32, -1.0311F, -2.1947F, -1.6474F, 1, 1, 3, -0.2F, true));

        this.chest_r7 = new ModelRenderer(this);
        this.chest_r7.setRotationPoint(0.3F, -0.3196F, -0.7832F);
        this.chest.addChild(chest_r7);
        this.setRotateAngle(chest_r7, -0.1609F, 0.2095F, 0.8809F);
        this.chest_r7.cubeList.add(new ModelBox(chest_r7, 18, 19, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest_r8 = new ModelRenderer(this);
        this.chest_r8.setRotationPoint(0.3F, -0.7196F, -2.2832F);
        this.chest.addChild(chest_r8);
        this.setRotateAngle(chest_r8, 0.0166F, -0.0052F, 0.7243F);
        this.chest_r8.cubeList.add(new ModelBox(chest_r8, 8, 13, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest_r9 = new ModelRenderer(this);
        this.chest_r9.setRotationPoint(0.3F, -0.7196F, -2.2832F);
        this.chest.addChild(chest_r9);
        this.setRotateAngle(chest_r9, 0.0129F, -0.0118F, 1.1606F);
        this.chest_r9.cubeList.add(new ModelBox(chest_r9, 8, 3, 0.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest_r10 = new ModelRenderer(this);
        this.chest_r10.setRotationPoint(0.3F, -0.9196F, -3.8832F);
        this.chest.addChild(chest_r10);
        this.setRotateAngle(chest_r10, 0.1332F, -0.0419F, 0.6692F);
        this.chest_r10.cubeList.add(new ModelBox(chest_r10, 5, 17, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest_r11 = new ModelRenderer(this);
        this.chest_r11.setRotationPoint(0.3F, -0.9196F, -3.8832F);
        this.chest.addChild(chest_r11);
        this.setRotateAngle(chest_r11, 0.1032F, -0.0942F, 1.1034F);
        this.chest_r11.cubeList.add(new ModelBox(chest_r11, 0, 17, 0.9063F, -0.4226F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.4732F, 0.8228F, -3.4727F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1355F, -0.4571F, 0.1486F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 32, 0.0311F, -2.1947F, -1.6474F, 1, 1, 3, -0.2F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0029F, -0.849F, -4.3506F);
        this.chest.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1979F, -0.5195F, 0.6388F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 25, 44, 0.0176F, -0.65F, -0.8981F, 1, 2, 1, -0.2F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.8739F, -4.2232F);
        this.chest.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2007F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 37, -1.5F, -0.8F, -0.25F, 3, 1, 1, 0.003F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.0739F, -4.5232F);
        this.chest.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5149F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 47, 58, -0.5F, -1.0558F, -0.9959F, 1, 1, 1, 0.003F, false));

        this.chest_r12 = new ModelRenderer(this);
        this.chest_r12.setRotationPoint(-0.5F, -0.6898F, -4.7305F);
        this.chest.addChild(chest_r12);
        this.setRotateAngle(chest_r12, -0.1309F, 0.0F, 0.0F);
        this.chest_r12.cubeList.add(new ModelBox(chest_r12, 0, 27, 0.0F, -0.8131F, -0.2617F, 1, 1, 3, -0.201F, false));

        this.leftwing6 = new ModelRenderer(this);
        this.leftwing6.setRotationPoint(1.4F, -0.45F, -3.8F);
        this.chest.addChild(leftwing6);
        this.setRotateAngle(leftwing6, -0.2622F, -0.1731F, -0.2911F);
        this.leftwing6.cubeList.add(new ModelBox(leftwing6, 31, 18, 1.1F, 0.0F, -1.0F, 4, 1, 1, -0.2F, false));
        this.leftwing6.cubeList.add(new ModelBox(leftwing6, 34, 38, 0.1F, -0.5F, -1.0F, 2, 2, 1, -0.18F, false));

        this.leftwing7 = new ModelRenderer(this);
        this.leftwing7.setRotationPoint(4.9F, -0.1F, -0.7F);
        this.leftwing6.addChild(leftwing7);
        this.setRotateAngle(leftwing7, -0.0126F, 0.2245F, -0.0662F);
        this.leftwing7.cubeList.add(new ModelBox(leftwing7, 12, 16, -0.507F, -0.1174F, -0.2007F, 7, 1, 1, -0.2F, false));
        this.leftwing7.cubeList.add(new ModelBox(leftwing7, 13, 13, -0.507F, 0.5826F, -0.2007F, 7, 1, 1, -0.3F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(5.493F, 0.3826F, -0.4007F);
        this.leftwing7.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.5236F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 38, 44, -0.7F, -0.5F, -0.6F, 2, 1, 1, -0.3F, false));

        this.leftwing8 = new ModelRenderer(this);
        this.leftwing8.setRotationPoint(6.493F, 0.5826F, -0.2007F);
        this.leftwing7.addChild(leftwing8);
        this.setRotateAngle(leftwing8, -3.0893F, 0.2525F, -2.9859F);
        this.leftwing8.cubeList.add(new ModelBox(leftwing8, 25, 9, -5.0F, -0.5F, -1.0F, 5, 1, 1, -0.2F, false));

        this.leftmembrane = new ModelRenderer(this);
        this.leftmembrane.setRotationPoint(-4.75F, 0.0F, -0.5F);
        this.leftwing8.addChild(leftmembrane);
        this.setRotateAngle(leftmembrane, 0.0041F, -0.2525F, -0.0801F);
        this.leftmembrane.cubeList.add(new ModelBox(leftmembrane, 0, 19, -5.75F, -0.5F, -0.5F, 6, 1, 1, -0.2F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-5.45F, 0.0F, 0.0F);
        this.leftmembrane.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0132F, -0.087F, -0.0428F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 0, -6.9F, -0.5F, -0.5F, 7, 1, 1, -0.2F, false));

        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(-0.5F, 0.0F, -0.25F);
        this.leftwing8.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0922F, 0.0606F, 0.0084F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.lefthand.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.4363F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 40, -1.05F, -0.5F, -1.375F, 1, 1, 2, 0.01F, false));

        this.rightwing6 = new ModelRenderer(this);
        this.rightwing6.setRotationPoint(-1.4F, -0.45F, -3.8F);
        this.chest.addChild(rightwing6);
        this.setRotateAngle(rightwing6, -0.2876F, 0.1256F, 0.1212F);
        this.rightwing6.cubeList.add(new ModelBox(rightwing6, 30, 3, -5.1F, 0.0F, -1.0F, 4, 1, 1, -0.2F, false));
        this.rightwing6.cubeList.add(new ModelBox(rightwing6, 27, 36, -2.1F, -0.5F, -1.0F, 2, 2, 1, -0.18F, false));

        this.rightwing7 = new ModelRenderer(this);
        this.rightwing7.setRotationPoint(-4.9F, -0.1F, -0.7F);
        this.rightwing6.addChild(rightwing7);
        this.setRotateAngle(rightwing7, -0.0126F, -0.2245F, 0.0662F);
        this.rightwing7.cubeList.add(new ModelBox(rightwing7, 13, 3, -6.493F, -0.1174F, -0.2007F, 7, 1, 1, -0.2F, false));
        this.rightwing7.cubeList.add(new ModelBox(rightwing7, 8, 10, -6.493F, 0.5826F, -0.2007F, 7, 1, 1, -0.3F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-5.493F, 0.3826F, -0.4007F);
        this.rightwing7.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.5236F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 28, -1.3F, -0.5F, -0.6F, 2, 1, 1, -0.3F, false));

        this.rightwing8 = new ModelRenderer(this);
        this.rightwing8.setRotationPoint(-6.493F, 0.5826F, -0.2007F);
        this.rightwing7.addChild(rightwing8);
        this.setRotateAngle(rightwing8, -3.0893F, -0.2525F, 2.9859F);
        this.rightwing8.cubeList.add(new ModelBox(rightwing8, 25, 0, 0.0F, -0.5F, -1.0F, 5, 1, 1, -0.2F, false));

        this.rightmembrane = new ModelRenderer(this);
        this.rightmembrane.setRotationPoint(4.75F, 0.0F, -0.5F);
        this.rightwing8.addChild(rightmembrane);
        this.setRotateAngle(rightmembrane, 0.0041F, 0.2525F, 0.0801F);
        this.rightmembrane.cubeList.add(new ModelBox(rightmembrane, 17, 6, -0.25F, -0.5F, -0.5F, 6, 1, 1, -0.2F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(5.45F, 0.0F, 0.0F);
        this.rightmembrane.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0132F, 0.087F, 0.0428F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 7, -0.1F, -0.5F, -0.5F, 7, 1, 1, -0.2F, false));

        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(0.5F, 0.0F, -0.25F);
        this.rightwing8.addChild(righthand);
        this.setRotateAngle(righthand, 0.0922F, -0.0606F, -0.0084F);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.righthand.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.4363F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 39, 24, 0.05F, -0.5F, -1.375F, 1, 1, 2, 0.01F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.1398F, -4.6805F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1294F, 0.2615F, 0.0117F);
        this.neck.cubeList.add(new ModelBox(neck, 42, 14, -0.5F, -0.411F, -1.7302F, 1, 1, 2, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0862F, -1.4431F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0982F, 0.1261F, -0.0352F);


        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.4186F, -2.3315F);
        this.neck2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1396F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 32, 21, -0.5F, -0.3869F, -0.3955F, 1, 1, 3, -0.201F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.3186F, -2.4315F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.2242F, 0.2577F, 0.0465F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -1.7F, -2.2F);
        this.neck3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.5411F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 32, -0.5F, -0.2F, 0.0F, 1, 1, 3, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.35F, -2.05F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.1392F, -5.5197F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.096F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 32, 26, -0.5F, -0.4044F, -2.5687F, 1, 1, 3, -0.4F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.1608F, -4.0197F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1833F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 28, 31, -0.5F, -0.4146F, -2.4973F, 1, 1, 3, -0.4F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.5608F, -3.7197F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.7156F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 39, 29, -0.5F, -0.3749F, -1.5866F, 1, 1, 2, -0.399F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.5608F, -2.5197F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1222F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 40, 19, -0.5F, -0.3678F, -1.7625F, 1, 1, 2, -0.405F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.5608F, -2.5197F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0175F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 26, 40, -0.5F, -0.3678F, -1.5625F, 1, 1, 2, -0.4F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.5608F, -2.5197F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2269F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 41, 36, -0.5F, -0.1678F, -1.7625F, 1, 1, 2, -0.2F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, -1.0608F, -0.4197F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.096F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 44, 23, -1.5F, -0.1736F, -0.84F, 2, 1, 1, -0.203F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, -0.8608F, 0.6803F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1484F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 40, 33, -1.5F, -0.2088F, -1.3574F, 2, 1, 1, -0.2F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 42, 11, -1.5F, -0.2088F, -0.7574F, 2, 1, 1, -0.199F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, -0.1762F, -0.2835F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1134F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 39, 40, -0.5F, -0.7F, -0.9F, 1, 1, 2, -0.198F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 0.0152F, -0.7455F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3927F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 35, 12, -1.5F, -0.5F, -0.5F, 2, 1, 2, -0.205F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.2F, 0.4392F, -0.9197F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.6109F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 61, 2, -0.2F, -0.8F, -0.8F, 1, 1, 1, -0.203F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.1459F, -0.6076F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3142F, 0.0F, 0.0F);


        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, 0.4577F, -2.3787F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0881F, -0.1391F, -0.0122F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 29, 13, -0.5F, -0.5872F, -2.4962F, 1, 1, 3, -0.4F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.2F, 0.6713F, -7.3466F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0524F, -0.0174F, 0.0009F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 11, 19, -0.4F, -0.5377F, -3.5609F, 1, 1, 4, -0.4F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.3F, 0.5932F, -4.512F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0175F, -0.0349F, -0.0006F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 18, 21, -0.4F, -0.5362F, -3.5591F, 1, 1, 4, -0.4F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, 0.2932F, -0.137F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.0524F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 34, 33, -0.5F, -0.5F, -2.5F, 1, 1, 3, -0.3F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.092F, 0.3109F, -10.3243F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 1.2415F, -0.0963F, -1.0479F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 45, 18, -0.5F, -0.3F, -0.5F, 1, 1, 1, -0.4F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 46, 31, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.4F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 30, 46, -0.5F, -0.7F, -0.5F, 1, 1, 1, -0.4F, true));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.6089F, -0.0793F, -0.9982F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 40, 48, -0.3447F, -2.116F, -2.8763F, 1, 1, 1, -0.4F, true));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 26, 48, -0.3447F, -2.316F, -2.8763F, 1, 1, 1, -0.4F, true));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 15, 48, -0.3447F, -2.516F, -2.8763F, 1, 1, 1, -0.4F, true));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.4692F, -0.0793F, -0.9982F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 50, 42, -0.3447F, -1.754F, -2.8801F, 1, 1, 1, -0.4F, true));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 48, 13, -0.3447F, -1.954F, -2.8801F, 1, 1, 1, -0.4F, true));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 10, 48, -0.3447F, -2.154F, -2.8801F, 1, 1, 1, -0.4F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.5914F, -0.0793F, -0.9982F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 17, 45, -0.3447F, -1.7419F, -2.4248F, 1, 1, 1, -0.4F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 7, 45, -0.3447F, -1.9419F, -2.4248F, 1, 1, 1, -0.4F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 12, 45, -0.3447F, -2.1419F, -2.4248F, 1, 1, 1, -0.4F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.4692F, -0.0793F, -0.9982F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 46, 8, -0.3447F, -1.4947F, -2.2531F, 1, 1, 1, -0.4F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 45, 43, -0.3447F, -1.2947F, -2.2531F, 1, 1, 1, -0.4F, true));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.2773F, -0.0793F, -0.9982F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 5, 48, -0.3447F, -1.1001F, -2.006F, 1, 1, 1, -0.4F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 48, -0.3447F, -0.9001F, -2.006F, 1, 1, 1, -0.4F, true));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.2947F, -0.0793F, -0.9982F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 51, -0.3447F, -1.0163F, -1.6912F, 1, 1, 1, -0.4F, true));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 44, 50, -0.3447F, -0.8163F, -1.6912F, 1, 1, 1, -0.4F, true));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.3296F, -0.0793F, -0.9982F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 60, 8, -0.3447F, -0.9105F, -1.3667F, 1, 1, 1, -0.4F, true));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 10, 60, -0.3447F, -0.7105F, -1.3667F, 1, 1, 1, -0.4F, true));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.3296F, -0.0793F, -0.9982F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 48, 61, -0.3447F, -0.7907F, -1.0339F, 1, 1, 1, -0.4F, true));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 61, 13, -0.3447F, -0.5907F, -1.0339F, 1, 1, 1, -0.4F, true));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.3009F, 0.4564F, -5.6541F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.4655F, 0.0235F, -1.0001F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 59, 55, -0.3839F, -1.1521F, -2.1271F, 1, 1, 1, -0.4F, true));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 52, 59, -0.3839F, -1.3521F, -2.1271F, 1, 1, 1, -0.4F, true));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.3009F, 0.4564F, -5.6541F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.3608F, 0.0235F, -1.0001F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 5, 60, -0.3839F, -0.9006F, -1.8633F, 1, 1, 1, -0.4F, true));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 59, 49, -0.3839F, -1.1006F, -1.8633F, 1, 1, 1, -0.4F, true));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.3009F, 0.4564F, -5.6541F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.352F, -0.0463F, -0.9972F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 53, 47, -0.4756F, -0.7158F, -1.5828F, 1, 1, 1, -0.4F, true));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 38, 55, -0.4756F, -0.9158F, -1.5828F, 1, 1, 1, -0.4F, true));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.3009F, 0.4564F, -5.6541F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.3171F, -0.0463F, -0.9972F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 30, 55, -0.4756F, -0.6052F, -1.3021F, 1, 1, 1, -0.4F, true));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 58, 46, -0.4756F, -0.8052F, -1.3021F, 1, 1, 1, -0.4F, true));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(-0.324F, 0.3944F, -4.9576F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.1201F, 0.0271F, -0.9977F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 55, 25, -0.4634F, -0.4571F, -1.7237F, 1, 1, 1, -0.4F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 15, 55, -0.4634F, -0.6571F, -1.7237F, 1, 1, 1, -0.4F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 55, 8, -0.4634F, -0.4571F, -1.4237F, 1, 1, 1, -0.4F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 54, 50, -0.4634F, -0.6571F, -1.4237F, 1, 1, 1, -0.4F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 54, 44, -0.4634F, -0.4571F, -1.1237F, 1, 1, 1, -0.4F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 54, 39, -0.4634F, -0.4571F, -0.8237F, 1, 1, 1, -0.4F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 54, 35, -0.4634F, -0.4571F, -0.5237F, 1, 1, 1, -0.4F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 54, 31, -0.4634F, -0.4571F, -0.2237F, 1, 1, 1, -0.4F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 25, 54, -0.4634F, -0.4571F, 0.0763F, 1, 1, 1, -0.4F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 10, 54, -0.4634F, -0.4571F, 0.3763F, 1, 1, 1, -0.4F, true));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.5F, 0.4577F, -4.4787F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.1579F, -0.1391F, -0.0122F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 26, 24, -0.2088F, -0.4041F, -0.4245F, 1, 1, 3, -0.403F, true));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.5F, 0.4577F, -4.4787F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.1579F, 0.1391F, 0.0122F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 26, 24, -0.7912F, -0.4041F, -0.4245F, 1, 1, 3, -0.403F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(0.5F, 0.4577F, -2.3787F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0881F, 0.1391F, 0.0122F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 29, 13, -0.5F, -0.5872F, -2.4962F, 1, 1, 3, -0.4F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(0.2F, 0.6713F, -7.3466F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.0524F, 0.0174F, -0.0009F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 11, 19, -0.6F, -0.5377F, -3.5609F, 1, 1, 4, -0.4F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(0.3F, 0.5932F, -4.512F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0175F, 0.0349F, 0.0006F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 18, 21, -0.6F, -0.5362F, -3.5591F, 1, 1, 4, -0.4F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(0.5F, 0.2932F, -0.137F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.0524F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 34, 33, -0.5F, -0.5F, -2.5F, 1, 1, 3, -0.3F, false));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(0.092F, 0.3109F, -10.3243F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 1.2415F, 0.0963F, 1.0479F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 45, 18, -0.5F, -0.3F, -0.5F, 1, 1, 1, -0.4F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 46, 31, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.4F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 30, 46, -0.5F, -0.7F, -0.5F, 1, 1, 1, -0.4F, false));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.6089F, 0.0793F, 0.9982F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 40, 48, -0.6553F, -2.116F, -2.8763F, 1, 1, 1, -0.4F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 26, 48, -0.6553F, -2.316F, -2.8763F, 1, 1, 1, -0.4F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 15, 48, -0.6553F, -2.516F, -2.8763F, 1, 1, 1, -0.4F, false));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.4692F, 0.0793F, 0.9982F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 50, 42, -0.6553F, -1.754F, -2.8801F, 1, 1, 1, -0.4F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 48, 13, -0.6553F, -1.954F, -2.8801F, 1, 1, 1, -0.4F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 10, 48, -0.6553F, -2.154F, -2.8801F, 1, 1, 1, -0.4F, false));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.5914F, 0.0793F, 0.9982F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 17, 45, -0.6553F, -1.7419F, -2.4248F, 1, 1, 1, -0.4F, false));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 7, 45, -0.6553F, -1.9419F, -2.4248F, 1, 1, 1, -0.4F, false));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 12, 45, -0.6553F, -2.1419F, -2.4248F, 1, 1, 1, -0.4F, false));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.4692F, 0.0793F, 0.9982F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 46, 8, -0.6553F, -1.4947F, -2.2531F, 1, 1, 1, -0.4F, false));
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 45, 43, -0.6553F, -1.2947F, -2.2531F, 1, 1, 1, -0.4F, false));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.2773F, 0.0793F, 0.9982F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 5, 48, -0.6553F, -1.1001F, -2.006F, 1, 1, 1, -0.4F, false));
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 48, -0.6553F, -0.9001F, -2.006F, 1, 1, 1, -0.4F, false));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.2947F, 0.0793F, 0.9982F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 51, -0.6553F, -1.0163F, -1.6912F, 1, 1, 1, -0.4F, false));
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 44, 50, -0.6553F, -0.8163F, -1.6912F, 1, 1, 1, -0.4F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.3296F, 0.0793F, 0.9982F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 60, 8, -0.6553F, -0.9105F, -1.3667F, 1, 1, 1, -0.4F, false));
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 10, 60, -0.6553F, -0.7105F, -1.3667F, 1, 1, 1, -0.4F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(0.3193F, 0.6446F, -7.2051F);
        this.jaw.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.3296F, 0.0793F, 0.9982F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 48, 61, -0.6553F, -0.7907F, -1.0339F, 1, 1, 1, -0.4F, false));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 61, 13, -0.6553F, -0.5907F, -1.0339F, 1, 1, 1, -0.4F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.3009F, 0.4564F, -5.6541F);
        this.jaw.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.4655F, -0.0235F, 1.0001F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 59, 55, -0.6161F, -1.1521F, -2.1271F, 1, 1, 1, -0.4F, false));
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 52, 59, -0.6161F, -1.3521F, -2.1271F, 1, 1, 1, -0.4F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(0.3009F, 0.4564F, -5.6541F);
        this.jaw.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.3608F, -0.0235F, 1.0001F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 5, 60, -0.6161F, -0.9006F, -1.8633F, 1, 1, 1, -0.4F, false));
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 59, 49, -0.6161F, -1.1006F, -1.8633F, 1, 1, 1, -0.4F, false));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(0.3009F, 0.4564F, -5.6541F);
        this.jaw.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.352F, 0.0463F, 0.9972F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 53, 47, -0.5244F, -0.7158F, -1.5828F, 1, 1, 1, -0.4F, false));
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 38, 55, -0.5244F, -0.9158F, -1.5828F, 1, 1, 1, -0.4F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.3009F, 0.4564F, -5.6541F);
        this.jaw.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.3171F, 0.0463F, 0.9972F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 30, 55, -0.5244F, -0.6052F, -1.3021F, 1, 1, 1, -0.4F, false));
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 58, 46, -0.5244F, -0.8052F, -1.3021F, 1, 1, 1, -0.4F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(0.324F, 0.3944F, -4.9576F);
        this.jaw.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.1201F, -0.0271F, 0.9977F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 55, 25, -0.5366F, -0.4571F, -1.7237F, 1, 1, 1, -0.4F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 15, 55, -0.5366F, -0.6571F, -1.7237F, 1, 1, 1, -0.4F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 55, 8, -0.5366F, -0.4571F, -1.4237F, 1, 1, 1, -0.4F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 54, 50, -0.5366F, -0.6571F, -1.4237F, 1, 1, 1, -0.4F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 54, 44, -0.5366F, -0.4571F, -1.1237F, 1, 1, 1, -0.4F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 54, 39, -0.5366F, -0.4571F, -0.8237F, 1, 1, 1, -0.4F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 54, 35, -0.5366F, -0.4571F, -0.5237F, 1, 1, 1, -0.4F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 54, 31, -0.5366F, -0.4571F, -0.2237F, 1, 1, 1, -0.4F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 25, 54, -0.5366F, -0.4571F, 0.0763F, 1, 1, 1, -0.4F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 10, 54, -0.5366F, -0.4571F, 0.3763F, 1, 1, 1, -0.4F, false));

        this.leftHead = new ModelRenderer(this);
        this.leftHead.setRotationPoint(0.2F, 0.5172F, -7.2542F);
        this.head.addChild(leftHead);


        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftHead.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.0F, 0.0175F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 0, 0, -0.6F, -0.5885F, -4.1712F, 1, 1, 5, -0.4F, false));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(-0.2F, -0.6781F, 1.2346F);
        this.leftHead.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.1833F, 0.0873F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 22, 29, -0.5F, -0.0501F, -0.5307F, 1, 1, 3, -0.4F, false));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(-0.2F, -0.6781F, 1.2346F);
        this.leftHead.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.0785F, 0.0873F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 6, 30, -0.5F, -0.0543F, -0.4618F, 1, 1, 3, -0.4F, false));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(0.0F, -0.0781F, -0.1654F);
        this.leftHead.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.035F, 0.0698F, 0.0024F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 0, 10, -0.6F, -0.5042F, -0.2838F, 1, 1, 5, -0.4F, false));

        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(0.6F, -0.2781F, 5.8346F);
        this.leftHead.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.0438F, 0.0872F, 0.0038F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 9, 37, -0.78F, -0.8446F, -2.0033F, 1, 1, 2, -0.3F, false));
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 18, 34, -0.9F, -0.744F, -2.0033F, 1, 1, 3, -0.2F, false));

        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(0.3F, -1.0683F, 6.6073F);
        this.leftHead.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 1.7628F, 0.0F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 20, 53, -0.32F, -0.6443F, -0.49F, 1, 1, 1, -0.35F, false));
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 53, 22, -0.43F, -0.6443F, -0.49F, 1, 1, 1, -0.25F, false));
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 53, 18, -0.49F, -0.6443F, -0.4F, 1, 1, 1, -0.2F, false));

        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(0.3F, -0.9027F, 6.3571F);
        this.leftHead.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.5847F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 54, 3, -0.49F, -0.5F, -0.2F, 1, 1, 1, -0.199F, false));
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 43, 60, -0.49F, -0.5F, -0.7F, 1, 1, 1, -0.202F, false));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(0.4F, -0.4306F, 6.5497F);
        this.leftHead.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.3752F, 0.0F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 45, 53, -0.38F, -0.5F, -0.5F, 1, 1, 1, -0.4F, false));
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 34, 53, -0.38F, -0.5F, -0.3F, 1, 1, 1, -0.4F, false));
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 53, 13, -0.38F, -0.5F, -0.1F, 1, 1, 1, -0.4F, false));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(-0.1053F, 0.021F, 2.8012F);
        this.leftHead.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.1636F, 0.0609F, -0.9967F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 58, 37, -0.3671F, -0.3447F, -0.556F, 1, 1, 1, -0.4F, false));

        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(-0.1053F, 0.021F, 2.8012F);
        this.leftHead.addChild(cube_r82);
        this.setRotateAngle(cube_r82, -0.0633F, 0.0609F, -0.9967F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 58, 33, -0.3671F, -0.2461F, -0.9094F, 1, 1, 1, -0.4F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 15, 58, -0.3671F, -0.2461F, -1.2094F, 1, 1, 1, -0.4F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 58, 5, -0.3671F, -0.0461F, -1.2094F, 1, 1, 1, -0.4F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 25, 57, -0.3671F, -0.0461F, -1.5094F, 1, 1, 1, -0.4F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 34, 57, -0.3671F, -0.2461F, -1.5094F, 1, 1, 1, -0.4F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 57, 15, -0.3671F, -0.2461F, -1.8094F, 1, 1, 1, -0.4F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 57, 20, -0.3671F, -0.0461F, -1.8094F, 1, 1, 1, -0.4F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 10, 57, -0.3671F, -0.2461F, -2.1094F, 1, 1, 1, -0.4F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 57, 11, -0.3671F, -0.0461F, -2.1094F, 1, 1, 1, -0.4F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 57, 0, -0.3671F, -0.2461F, -2.4094F, 1, 1, 1, -0.4F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 5, 57, -0.3671F, -0.0461F, -2.4094F, 1, 1, 1, -0.4F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 54, 56, -0.3671F, -0.2461F, -2.7094F, 1, 1, 1, -0.4F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 0, 57, -0.3671F, -0.0461F, -2.7094F, 1, 1, 1, -0.4F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 56, 28, -0.3671F, -0.2461F, -3.0094F, 1, 1, 1, -0.4F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 43, 56, -0.3671F, -0.0461F, -3.0094F, 1, 1, 1, -0.4F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 49, 55, -0.3671F, 0.0539F, -3.0094F, 1, 1, 1, -0.402F, false));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(0.0206F, 0.1494F, -0.0278F);
        this.leftHead.addChild(cube_r83);
        this.setRotateAngle(cube_r83, -0.3076F, 0.0609F, -0.9967F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 20, 56, -0.5F, -0.6F, -0.5F, 1, 1, 1, -0.4F, false));
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 0, 54, -0.5F, -0.4F, -0.5F, 1, 1, 1, -0.4F, false));
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 53, 53, -0.5F, -0.2F, -0.5F, 1, 1, 1, -0.4F, false));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(-0.0052F, 0.1544F, -0.3266F);
        this.leftHead.addChild(cube_r84);
        this.setRotateAngle(cube_r84, -0.3426F, 0.0609F, -0.9967F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 0, 60, -0.5F, -0.6F, -0.5F, 1, 1, 1, -0.4F, false));
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 29, 59, -0.5F, -0.4F, -0.5F, 1, 1, 1, -0.4F, false));
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 59, 23, -0.5F, -0.2F, -0.5F, 1, 1, 1, -0.4F, false));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(-0.2052F, 0.1544F, -0.5266F);
        this.leftHead.addChild(cube_r85);
        this.setRotateAngle(cube_r85, -0.3514F, -0.0088F, -1.0002F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 58, 52, -0.4038F, -0.3333F, -0.5425F, 1, 1, 1, -0.4F, false));
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 58, 58, -0.4038F, 0.0667F, -0.5425F, 1, 1, 1, -0.4F, false));
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 20, 59, -0.4038F, -0.1333F, -0.5425F, 1, 1, 1, -0.4F, false));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(-0.0052F, 0.1544F, -0.8266F);
        this.leftHead.addChild(cube_r86);
        this.setRotateAngle(cube_r86, -0.4561F, -0.0088F, -1.0002F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 15, 61, -0.5091F, -0.5023F, -0.642F, 1, 1, 1, -0.4F, false));
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 61, 17, -0.5091F, -0.1023F, -0.642F, 1, 1, 1, -0.4F, false));
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 24, 61, -0.5091F, -0.3023F, -0.642F, 1, 1, 1, -0.4F, false));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(-0.1052F, 0.1544F, -1.1266F);
        this.leftHead.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.3863F, -0.0088F, -1.0002F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 60, 26, -0.4525F, -0.2188F, -0.6423F, 1, 1, 1, -0.4F, false));
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 60, 30, -0.4525F, -0.0188F, -0.6423F, 1, 1, 1, -0.4F, false));
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 34, 60, -0.4525F, -0.4188F, -0.6423F, 1, 1, 1, -0.4F, false));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(-0.042F, 0.2633F, -1.4691F);
        this.leftHead.addChild(cube_r88);
        this.setRotateAngle(cube_r88, -0.3863F, -0.0088F, -1.0002F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 51, 28, -0.392F, -0.3317F, -0.7006F, 1, 1, 1, -0.4F, false));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 49, 51, -0.392F, -0.1317F, -0.7006F, 1, 1, 1, -0.4F, false));
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 52, 0, -0.392F, -0.5317F, -0.7006F, 1, 1, 1, -0.4F, false));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(-0.1052F, 0.1544F, -1.8266F);
        this.leftHead.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -0.3514F, -0.0088F, -1.0002F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 47, 0, -0.4463F, -0.2204F, -0.6423F, 1, 1, 1, -0.4F, false));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 21, 47, -0.4463F, -0.0204F, -0.6423F, 1, 1, 1, -0.4F, false));
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 35, 47, -0.4463F, -0.4204F, -0.6423F, 1, 1, 1, -0.4F, false));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(-0.2052F, 0.1544F, -2.1266F);
        this.leftHead.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -0.3339F, -0.0088F, -1.0002F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 46, 35, -0.3897F, -0.137F, -0.6426F, 1, 1, 1, -0.4F, false));
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 46, 40, -0.3897F, 0.063F, -0.6426F, 1, 1, 1, -0.4F, false));
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 44, 46, -0.3897F, -0.337F, -0.6426F, 1, 1, 1, -0.4F, false));

        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(-0.1052F, 0.1544F, -2.4266F);
        this.leftHead.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -0.5259F, -0.0088F, -1.0002F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 15, 52, -0.4411F, -0.2218F, -0.7423F, 1, 1, 1, -0.4F, false));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 29, 52, -0.4411F, -0.0218F, -0.7423F, 1, 1, 1, -0.4F, false));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 40, 52, -0.4411F, -0.4218F, -0.7423F, 1, 1, 1, -0.4F, false));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(-0.1052F, -0.0456F, -3.0266F);
        this.leftHead.addChild(cube_r92);
        this.setRotateAngle(cube_r92, -0.6481F, -0.0088F, -1.0002F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 51, 6, -0.6041F, -0.4303F, -0.4679F, 1, 1, 1, -0.4F, false));
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 10, 51, -0.6041F, -0.2303F, -0.4679F, 1, 1, 1, -0.4F, false));
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 24, 51, -0.6041F, -0.0303F, -0.4679F, 1, 1, 1, -0.4F, false));
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 5, 51, -0.6041F, 0.1697F, -0.4679F, 1, 1, 1, -0.4F, false));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(-0.1052F, -0.0456F, -3.4266F);
        this.leftHead.addChild(cube_r93);
        this.setRotateAngle(cube_r93, -0.5259F, -0.0088F, -1.0002F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 50, 10, -0.6006F, 0.2282F, -0.449F, 1, 1, 1, -0.4F, false));
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 50, 37, -0.6006F, -0.3718F, -0.449F, 1, 1, 1, -0.4F, false));
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 19, 50, -0.6006F, -0.1718F, -0.449F, 1, 1, 1, -0.4F, false));
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 50, 25, -0.6006F, 0.0282F, -0.449F, 1, 1, 1, -0.4F, false));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(-0.1052F, -0.0456F, -3.7266F);
        this.leftHead.addChild(cube_r94);
        this.setRotateAngle(cube_r94, -0.6655F, -0.0088F, -1.0002F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 49, 20, -0.5979F, 0.0776F, -0.3896F, 1, 1, 1, -0.4F, false));
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 36, 50, -0.5979F, -0.5224F, -0.3896F, 1, 1, 1, -0.4F, false));
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 31, 49, -0.5979F, -0.3224F, -0.3896F, 1, 1, 1, -0.4F, false));
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 49, 45, -0.5979F, -0.1224F, -0.3896F, 1, 1, 1, -0.4F, false));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(-0.1052F, -0.0456F, -3.7266F);
        this.leftHead.addChild(cube_r95);
        this.setRotateAngle(cube_r95, -1.2939F, -0.0088F, -1.0002F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 48, 48, -0.5979F, 0.0776F, -0.4896F, 1, 1, 1, -0.4F, false));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 50, 33, -0.5979F, -0.5224F, -0.4896F, 1, 1, 1, -0.4F, false));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 49, 3, -0.5979F, -0.3224F, -0.4896F, 1, 1, 1, -0.4F, false));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 49, 16, -0.5979F, -0.1224F, -0.4896F, 1, 1, 1, -0.4F, false));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(0.0104F, -0.6058F, 5.3649F);
        this.leftHead.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.1678F, 0.09F, 0.0512F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 40, 0, -0.5F, -0.6F, -1.4F, 1, 1, 2, -0.2F, false));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(0.4F, -1.4781F, 6.1346F);
        this.leftHead.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.2895F, 0.1004F, 0.0298F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 44, 4, -0.8F, -0.1588F, -1.7425F, 1, 1, 2, -0.2F, false));

        this.rightHead = new ModelRenderer(this);
        this.rightHead.setRotationPoint(-0.2F, 0.5172F, -7.2542F);
        this.head.addChild(rightHead);


        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightHead.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.0F, -0.0175F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 0, 0, -0.4F, -0.5885F, -4.1712F, 1, 1, 5, -0.4F, true));

        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(0.2F, -0.6781F, 1.2346F);
        this.rightHead.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.1833F, -0.0873F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 22, 29, -0.5F, -0.0501F, -0.5307F, 1, 1, 3, -0.4F, true));

        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(0.2F, -0.6781F, 1.2346F);
        this.rightHead.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.0785F, -0.0873F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 6, 30, -0.5F, -0.0543F, -0.4618F, 1, 1, 3, -0.4F, true));

        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(0.0F, -0.0781F, -0.1654F);
        this.rightHead.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.035F, -0.0698F, -0.0024F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 0, 10, -0.4F, -0.5042F, -0.2838F, 1, 1, 5, -0.4F, true));

        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(-0.6F, -0.2781F, 5.8346F);
        this.rightHead.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.0438F, -0.0872F, -0.0038F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 9, 37, -0.22F, -0.8446F, -2.0033F, 1, 1, 2, -0.3F, true));
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 18, 34, -0.1F, -0.744F, -2.0033F, 1, 1, 3, -0.2F, true));

        this.cube_r103 = new ModelRenderer(this);
        this.cube_r103.setRotationPoint(-0.3F, -1.0683F, 6.6073F);
        this.rightHead.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 1.7628F, 0.0F, 0.0F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 20, 53, -0.68F, -0.6443F, -0.49F, 1, 1, 1, -0.35F, true));
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 53, 22, -0.57F, -0.6443F, -0.49F, 1, 1, 1, -0.25F, true));
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 53, 18, -0.51F, -0.6443F, -0.4F, 1, 1, 1, -0.2F, true));

        this.cube_r104 = new ModelRenderer(this);
        this.cube_r104.setRotationPoint(-0.3F, -0.9027F, 6.3571F);
        this.rightHead.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.5847F, 0.0F, 0.0F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 54, 3, -0.51F, -0.5F, -0.2F, 1, 1, 1, -0.199F, true));
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 43, 60, -0.51F, -0.5F, -0.7F, 1, 1, 1, -0.202F, true));

        this.cube_r105 = new ModelRenderer(this);
        this.cube_r105.setRotationPoint(-0.4F, -0.4306F, 6.5497F);
        this.rightHead.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.3752F, 0.0F, 0.0F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 45, 53, -0.62F, -0.5F, -0.5F, 1, 1, 1, -0.4F, true));
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 34, 53, -0.62F, -0.5F, -0.3F, 1, 1, 1, -0.4F, true));
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 53, 13, -0.62F, -0.5F, -0.1F, 1, 1, 1, -0.4F, true));

        this.cube_r106 = new ModelRenderer(this);
        this.cube_r106.setRotationPoint(0.1053F, 0.021F, 2.8012F);
        this.rightHead.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.1636F, -0.0609F, 0.9967F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 58, 37, -0.6329F, -0.3447F, -0.556F, 1, 1, 1, -0.4F, true));

        this.cube_r107 = new ModelRenderer(this);
        this.cube_r107.setRotationPoint(0.1053F, 0.021F, 2.8012F);
        this.rightHead.addChild(cube_r107);
        this.setRotateAngle(cube_r107, -0.0633F, -0.0609F, 0.9967F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 58, 33, -0.6329F, -0.2461F, -0.9094F, 1, 1, 1, -0.4F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 15, 58, -0.6329F, -0.2461F, -1.2094F, 1, 1, 1, -0.4F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 58, 5, -0.6329F, -0.0461F, -1.2094F, 1, 1, 1, -0.4F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 25, 57, -0.6329F, -0.0461F, -1.5094F, 1, 1, 1, -0.4F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 34, 57, -0.6329F, -0.2461F, -1.5094F, 1, 1, 1, -0.4F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 57, 15, -0.6329F, -0.2461F, -1.8094F, 1, 1, 1, -0.4F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 57, 20, -0.6329F, -0.0461F, -1.8094F, 1, 1, 1, -0.4F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 10, 57, -0.6329F, -0.2461F, -2.1094F, 1, 1, 1, -0.4F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 57, 11, -0.6329F, -0.0461F, -2.1094F, 1, 1, 1, -0.4F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 57, 0, -0.6329F, -0.2461F, -2.4094F, 1, 1, 1, -0.4F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 5, 57, -0.6329F, -0.0461F, -2.4094F, 1, 1, 1, -0.4F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 54, 56, -0.6329F, -0.2461F, -2.7094F, 1, 1, 1, -0.4F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 0, 57, -0.6329F, -0.0461F, -2.7094F, 1, 1, 1, -0.4F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 56, 28, -0.6329F, -0.2461F, -3.0094F, 1, 1, 1, -0.4F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 43, 56, -0.6329F, -0.0461F, -3.0094F, 1, 1, 1, -0.4F, true));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 49, 55, -0.6329F, 0.0539F, -3.0094F, 1, 1, 1, -0.402F, true));

        this.cube_r108 = new ModelRenderer(this);
        this.cube_r108.setRotationPoint(-0.0206F, 0.1494F, -0.0278F);
        this.rightHead.addChild(cube_r108);
        this.setRotateAngle(cube_r108, -0.3076F, -0.0609F, 0.9967F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 20, 56, -0.5F, -0.6F, -0.5F, 1, 1, 1, -0.4F, true));
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 0, 54, -0.5F, -0.4F, -0.5F, 1, 1, 1, -0.4F, true));
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 53, 53, -0.5F, -0.2F, -0.5F, 1, 1, 1, -0.4F, true));

        this.cube_r109 = new ModelRenderer(this);
        this.cube_r109.setRotationPoint(0.0052F, 0.1544F, -0.3266F);
        this.rightHead.addChild(cube_r109);
        this.setRotateAngle(cube_r109, -0.3426F, -0.0609F, 0.9967F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 0, 60, -0.5F, -0.6F, -0.5F, 1, 1, 1, -0.4F, true));
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 29, 59, -0.5F, -0.4F, -0.5F, 1, 1, 1, -0.4F, true));
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 59, 23, -0.5F, -0.2F, -0.5F, 1, 1, 1, -0.4F, true));

        this.cube_r110 = new ModelRenderer(this);
        this.cube_r110.setRotationPoint(0.2052F, 0.1544F, -0.5266F);
        this.rightHead.addChild(cube_r110);
        this.setRotateAngle(cube_r110, -0.3514F, 0.0088F, 1.0002F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 58, 52, -0.5962F, -0.3333F, -0.5425F, 1, 1, 1, -0.4F, true));
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 58, 58, -0.5962F, 0.0667F, -0.5425F, 1, 1, 1, -0.4F, true));
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 20, 59, -0.5962F, -0.1333F, -0.5425F, 1, 1, 1, -0.4F, true));

        this.cube_r111 = new ModelRenderer(this);
        this.cube_r111.setRotationPoint(0.0052F, 0.1544F, -0.8266F);
        this.rightHead.addChild(cube_r111);
        this.setRotateAngle(cube_r111, -0.4561F, 0.0088F, 1.0002F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 15, 61, -0.4909F, -0.5023F, -0.642F, 1, 1, 1, -0.4F, true));
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 61, 17, -0.4909F, -0.1023F, -0.642F, 1, 1, 1, -0.4F, true));
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 24, 61, -0.4909F, -0.3023F, -0.642F, 1, 1, 1, -0.4F, true));

        this.cube_r112 = new ModelRenderer(this);
        this.cube_r112.setRotationPoint(0.1052F, 0.1544F, -1.1266F);
        this.rightHead.addChild(cube_r112);
        this.setRotateAngle(cube_r112, -0.3863F, 0.0088F, 1.0002F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 60, 26, -0.5475F, -0.2188F, -0.6423F, 1, 1, 1, -0.4F, true));
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 60, 30, -0.5475F, -0.0188F, -0.6423F, 1, 1, 1, -0.4F, true));
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 34, 60, -0.5475F, -0.4188F, -0.6423F, 1, 1, 1, -0.4F, true));

        this.cube_r113 = new ModelRenderer(this);
        this.cube_r113.setRotationPoint(0.042F, 0.2633F, -1.4691F);
        this.rightHead.addChild(cube_r113);
        this.setRotateAngle(cube_r113, -0.3863F, 0.0088F, 1.0002F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 51, 28, -0.608F, -0.3317F, -0.7006F, 1, 1, 1, -0.4F, true));
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 49, 51, -0.608F, -0.1317F, -0.7006F, 1, 1, 1, -0.4F, true));
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 52, 0, -0.608F, -0.5317F, -0.7006F, 1, 1, 1, -0.4F, true));

        this.cube_r114 = new ModelRenderer(this);
        this.cube_r114.setRotationPoint(0.1052F, 0.1544F, -1.8266F);
        this.rightHead.addChild(cube_r114);
        this.setRotateAngle(cube_r114, -0.3514F, 0.0088F, 1.0002F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 47, 0, -0.5537F, -0.2204F, -0.6423F, 1, 1, 1, -0.4F, true));
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 21, 47, -0.5537F, -0.0204F, -0.6423F, 1, 1, 1, -0.4F, true));
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 35, 47, -0.5537F, -0.4204F, -0.6423F, 1, 1, 1, -0.4F, true));

        this.cube_r115 = new ModelRenderer(this);
        this.cube_r115.setRotationPoint(0.2052F, 0.1544F, -2.1266F);
        this.rightHead.addChild(cube_r115);
        this.setRotateAngle(cube_r115, -0.3339F, 0.0088F, 1.0002F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 46, 35, -0.6103F, -0.137F, -0.6426F, 1, 1, 1, -0.4F, true));
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 46, 40, -0.6103F, 0.063F, -0.6426F, 1, 1, 1, -0.4F, true));
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 44, 46, -0.6103F, -0.337F, -0.6426F, 1, 1, 1, -0.4F, true));

        this.cube_r116 = new ModelRenderer(this);
        this.cube_r116.setRotationPoint(0.1052F, 0.1544F, -2.4266F);
        this.rightHead.addChild(cube_r116);
        this.setRotateAngle(cube_r116, -0.5259F, 0.0088F, 1.0002F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 15, 52, -0.5589F, -0.2218F, -0.7423F, 1, 1, 1, -0.4F, true));
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 29, 52, -0.5589F, -0.0218F, -0.7423F, 1, 1, 1, -0.4F, true));
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 40, 52, -0.5589F, -0.4218F, -0.7423F, 1, 1, 1, -0.4F, true));

        this.cube_r117 = new ModelRenderer(this);
        this.cube_r117.setRotationPoint(0.1052F, -0.0456F, -3.0266F);
        this.rightHead.addChild(cube_r117);
        this.setRotateAngle(cube_r117, -0.6481F, 0.0088F, 1.0002F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 51, 6, -0.3959F, -0.4303F, -0.4679F, 1, 1, 1, -0.4F, true));
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 10, 51, -0.3959F, -0.2303F, -0.4679F, 1, 1, 1, -0.4F, true));
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 24, 51, -0.3959F, -0.0303F, -0.4679F, 1, 1, 1, -0.4F, true));
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 5, 51, -0.3959F, 0.1697F, -0.4679F, 1, 1, 1, -0.4F, true));

        this.cube_r118 = new ModelRenderer(this);
        this.cube_r118.setRotationPoint(0.1052F, -0.0456F, -3.4266F);
        this.rightHead.addChild(cube_r118);
        this.setRotateAngle(cube_r118, -0.5259F, 0.0088F, 1.0002F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 50, 10, -0.3994F, 0.2282F, -0.449F, 1, 1, 1, -0.4F, true));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 50, 37, -0.3994F, -0.3718F, -0.449F, 1, 1, 1, -0.4F, true));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 19, 50, -0.3994F, -0.1718F, -0.449F, 1, 1, 1, -0.4F, true));
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 50, 25, -0.3994F, 0.0282F, -0.449F, 1, 1, 1, -0.4F, true));

        this.cube_r119 = new ModelRenderer(this);
        this.cube_r119.setRotationPoint(0.1052F, -0.0456F, -3.7266F);
        this.rightHead.addChild(cube_r119);
        this.setRotateAngle(cube_r119, -0.6655F, 0.0088F, 1.0002F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 49, 20, -0.4021F, 0.0776F, -0.3896F, 1, 1, 1, -0.4F, true));
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 36, 50, -0.4021F, -0.5224F, -0.3896F, 1, 1, 1, -0.4F, true));
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 31, 49, -0.4021F, -0.3224F, -0.3896F, 1, 1, 1, -0.4F, true));
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 49, 45, -0.4021F, -0.1224F, -0.3896F, 1, 1, 1, -0.4F, true));

        this.cube_r120 = new ModelRenderer(this);
        this.cube_r120.setRotationPoint(0.1052F, -0.0456F, -3.7266F);
        this.rightHead.addChild(cube_r120);
        this.setRotateAngle(cube_r120, -1.2939F, 0.0088F, 1.0002F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 48, 48, -0.4021F, 0.0776F, -0.4896F, 1, 1, 1, -0.4F, true));
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 50, 33, -0.4021F, -0.5224F, -0.4896F, 1, 1, 1, -0.4F, true));
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 49, 3, -0.4021F, -0.3224F, -0.4896F, 1, 1, 1, -0.4F, true));
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 49, 16, -0.4021F, -0.1224F, -0.4896F, 1, 1, 1, -0.4F, true));

        this.cube_r121 = new ModelRenderer(this);
        this.cube_r121.setRotationPoint(-0.0104F, -0.6058F, 5.3649F);
        this.rightHead.addChild(cube_r121);
        this.setRotateAngle(cube_r121, 0.1678F, -0.09F, -0.0512F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 40, 0, -0.5F, -0.6F, -1.4F, 1, 1, 2, -0.2F, true));

        this.cube_r122 = new ModelRenderer(this);
        this.cube_r122.setRotationPoint(-0.4F, -1.4781F, 6.1346F);
        this.rightHead.addChild(cube_r122);
        this.setRotateAngle(cube_r122, 0.2895F, -0.1004F, -0.0298F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 44, 4, -0.2F, -0.1588F, -1.7425F, 1, 1, 2, -0.205F, true));

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
