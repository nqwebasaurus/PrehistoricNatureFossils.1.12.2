package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTrophyDissorophoidea extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer animals;
    private final ModelRenderer Hip;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer UpperLegL;
    private final ModelRenderer LowerLegL;
    private final ModelRenderer FootL;
    private final ModelRenderer UpperLegL2;
    private final ModelRenderer LowerLegL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer body;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer body1;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer Head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer upperjaw;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer UpperArmL;
    private final ModelRenderer LowerArmL;
    private final ModelRenderer HandL;
    private final ModelRenderer UpperArmL2;
    private final ModelRenderer LowerArmL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer Hip2;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer UpperLegR;
    private final ModelRenderer LowerLegR;
    private final ModelRenderer FootR;
    private final ModelRenderer UpperLegR2;
    private final ModelRenderer LowerLegR2;
    private final ModelRenderer FootR2;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r63;
    private final ModelRenderer Tail4;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer neck_r1;
    private final ModelRenderer neck_r2;
    private final ModelRenderer neck_r3;
    private final ModelRenderer neck_r4;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer Chest2;
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
    private final ModelRenderer neck_r5;
    private final ModelRenderer neck_r6;
    private final ModelRenderer neck_r7;
    private final ModelRenderer neck_r8;
    private final ModelRenderer cube_r92;
    private final ModelRenderer Head2;
    private final ModelRenderer lowerjaw2;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer cube_r98;
    private final ModelRenderer cube_r99;
    private final ModelRenderer cube_r100;
    private final ModelRenderer cube_r101;
    private final ModelRenderer cube_r102;
    private final ModelRenderer upperjaw2;
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
    private final ModelRenderer UpperArmR;
    private final ModelRenderer LowerArmR;
    private final ModelRenderer HandR;
    private final ModelRenderer UpperArmR2;
    private final ModelRenderer LowerArmR2;
    private final ModelRenderer HandR2;

    public ModelSkeletonTrophyDissorophoidea() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 55, -10.0F, -4.0F, -24.0F, 20, 4, 48, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -12.0F, -2.0F, -26.0F, 24, 2, 52, 0.005F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-10.0F, -4.0F, 0.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.7505F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 108, 0.0F, 0.0F, -7.0F, 2, 3, 14, 0.0F, false));

        this.animals = new ModelRenderer(this);
        this.animals.setRotationPoint(0.0F, -4.0F, 12.0F);
        this.fossil.addChild(animals);


        this.Hip = new ModelRenderer(this);
        this.Hip.setRotationPoint(0.0F, -5.5F, 7.75F);
        this.animals.addChild(Hip);
        this.setRotateAngle(Hip, -0.2182F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0176F, 1.5555F, 0.2531F);
        this.Hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1293F, -0.1176F, -0.7341F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 137, 92, -0.3383F, -0.297F, -1.2264F, 1, 2, 3, 0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.7F, 0.653F, 0.5885F);
        this.Hip.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1687F, 0.045F, 0.258F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 144, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(2.0176F, 1.5555F, 0.2531F);
        this.Hip.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1293F, 0.1176F, 0.7341F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 137, 86, -0.6617F, -0.297F, -1.2264F, 1, 2, 3, 0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(1.7F, 0.653F, 0.5885F);
        this.Hip.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1687F, -0.045F, -0.258F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 126, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.003F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.1606F, 0.6753F);
        this.Hip.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 148, 68, 0.5F, -0.1F, -1.0F, 1, 0, 2, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 94, 137, -0.5F, -0.5F, -2.0F, 1, 1, 3, 0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 3.0282F, -0.338F);
        this.Hip.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 131, -1.0F, -0.8F, -0.9F, 2, 1, 4, 0.003F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.5894F, -2.2247F);
        this.Hip.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 137, 0.0F, 0.3F, 3.1F, 0, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 137, 0.0F, 0.2F, 1.2F, 0, 1, 1, 0.0F, false));

        this.UpperLegL = new ModelRenderer(this);
        this.UpperLegL.setRotationPoint(2.25F, 1.502F, 0.699F);
        this.Hip.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.0873F, -0.3491F, 0.1745F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 18, 143, -0.2F, -0.5F, -1.0F, 3, 1, 1, -0.1F, false));

        this.LowerLegL = new ModelRenderer(this);
        this.LowerLegL.setRotationPoint(2.7127F, 0.5782F, -0.6753F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.2182F, -0.7418F, 1.0472F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 119, 143, -0.3376F, -0.5755F, -0.2857F, 3, 1, 1, -0.1F, false));
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 143, 123, -0.3376F, -0.5755F, 0.7143F, 3, 1, 1, -0.1F, false));

        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(2.5F, -0.5F, 0.45F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.8727F, 0.5236F, 0.2182F);
        this.FootL.cubeList.add(new ModelBox(FootL, 13, 133, 0.0F, -2.26F, -1.64F, 1, 3, 3, 0.1F, false));

        this.UpperLegL2 = new ModelRenderer(this);
        this.UpperLegL2.setRotationPoint(-2.25F, 1.502F, 0.699F);
        this.Hip.addChild(UpperLegL2);
        this.setRotateAngle(UpperLegL2, -0.0873F, 0.3491F, -0.1745F);
        this.UpperLegL2.cubeList.add(new ModelBox(UpperLegL2, 143, 126, -2.8F, -0.5F, -1.0F, 3, 1, 1, -0.1F, false));

        this.LowerLegL2 = new ModelRenderer(this);
        this.LowerLegL2.setRotationPoint(-2.7127F, 0.5782F, -0.6753F);
        this.UpperLegL2.addChild(LowerLegL2);
        this.setRotateAngle(LowerLegL2, 0.2182F, 0.7418F, -1.0472F);
        this.LowerLegL2.cubeList.add(new ModelBox(LowerLegL2, 143, 140, -2.6624F, -0.5755F, -0.2857F, 3, 1, 1, -0.1F, false));
        this.LowerLegL2.cubeList.add(new ModelBox(LowerLegL2, 143, 143, -2.6624F, -0.5755F, 0.7143F, 3, 1, 1, -0.1F, false));

        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(-2.5F, -0.5F, 0.45F);
        this.LowerLegL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.8727F, -0.5236F, -0.2182F);
        this.FootL2.cubeList.add(new ModelBox(FootL2, 134, 123, -1.0F, -2.26F, -1.64F, 1, 3, 3, 0.1F, false));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.3856F, 1.5753F);
        this.Hip.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1694F, -0.2129F, -0.0479F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 93, 131, -0.5F, -0.5993F, -0.1077F, 1, 1, 4, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.6669F, -0.2074F);
        this.Tail1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 82, 141, 0.0F, -0.4F, 3.1F, 0, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 140, 0.0F, -0.4F, 1.1F, 0, 1, 1, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.1743F, 3.8923F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1097F, 0.3215F, 0.1384F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 137, 102, -0.5F, -0.4222F, -0.0695F, 1, 1, 3, 0.003F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.4903F, -4.0474F);
        this.Tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 153, 0.0F, -0.4F, 5.0F, 0, 1, 1, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.3644F, -0.9247F);
        this.Hip.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.5223F, -1.9936F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1571F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 146, 106, -0.5F, -0.1F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.8473F, -1.8936F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 146, 102, -0.5F, -0.15F, 0.05F, 1, 1, 2, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.0393F, -1.4759F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0162F, -0.0913F, -0.938F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 148, 100, -2.9135F, -0.4067F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.0393F, -1.4759F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.052F, -0.0768F, -0.5178F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 128, 143, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.0393F, -1.4759F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.052F, 0.0768F, 0.5178F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 119, 141, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.0393F, -1.4759F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0162F, 0.0913F, 0.938F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 148, 77, 0.9135F, -0.4067F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.1723F, -1.2936F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 153, 35, 0.0F, 0.2F, -0.6F, 0, 1, 1, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.1473F, -1.9436F);
        this.body.addChild(body1);
        this.setRotateAngle(body1, 0.0873F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 125, 116, -0.5F, -1.8345F, -4.7989F, 1, 1, 5, 0.01F, false));
        this.body1.cubeList.add(new ModelBox(body1, 104, 132, -0.5F, -0.4595F, -3.9489F, 1, 1, 4, 0.003F, false));
        this.body1.cubeList.add(new ModelBox(body1, 153, 38, 0.0F, -1.4595F, -3.9489F, 0, 1, 1, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 153, 41, 0.0F, -1.4595F, -1.9489F, 0, 1, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.0522F, -3.4313F);
        this.body1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1154F, 0.0823F, -0.9826F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 146, 129, -3.9135F, -0.4067F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.0522F, -1.4313F);
        this.body1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0096F, -0.0561F, -0.9399F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 119, 146, -3.9135F, -0.4067F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.0522F, -1.4313F);
        this.body1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.014F, -0.0552F, -0.5203F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 153, 7, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 0.0522F, -3.4313F);
        this.body1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1388F, 0.0284F, -0.5665F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 153, 5, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 0.0522F, -1.4313F);
        this.body1.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0096F, 0.0561F, 0.9399F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 146, 110, 0.9135F, -0.4067F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.0522F, -1.4313F);
        this.body1.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.014F, 0.0552F, 0.5203F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 152, 144, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 0.0522F, -3.4313F);
        this.body1.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1154F, -0.0823F, 0.9826F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 146, 95, 0.9135F, -0.4067F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 0.0522F, -3.4313F);
        this.body1.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1388F, -0.0284F, 0.5665F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 152, 142, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0655F, -3.7489F);
        this.body1.addChild(Chest);
        this.setRotateAngle(Chest, 0.0873F, 0.0F, 0.0F);


        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -1.7739F, -0.8928F);
        this.Chest.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2182F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 146, 131, -0.5F, -0.2F, -2.1F, 1, 1, 2, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0261F, -2.9428F);
        this.Chest.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1047F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 153, 44, 0.0F, -1.25F, 1.05F, 0, 1, 1, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 115, 132, -0.5F, -0.25F, -0.95F, 1, 1, 4, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 0.1127F, -1.3752F);
        this.Chest.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1825F, 0.1409F, -0.9761F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 27, 150, -2.9135F, -0.4067F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 0.1127F, -1.3752F);
        this.Chest.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2235F, 0.0552F, -0.564F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 153, 11, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 0.1127F, -1.3752F);
        this.Chest.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1825F, -0.1409F, 0.9761F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 6, 150, 0.9135F, -0.4067F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 0.1127F, -1.3752F);
        this.Chest.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2235F, -0.0552F, 0.564F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 153, 9, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-2.1288F, 3.4717F, -2.3967F);
        this.Chest.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1398F, 0.1226F, 0.2804F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 80, 131, -1.5F, -0.8F, -0.8F, 3, 1, 3, 0.003F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-2.0F, 0.0604F, -0.8779F);
        this.Chest.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.4016F, 0.1226F, 0.2804F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 94, 142, -0.5F, 0.1F, -1.0F, 1, 3, 2, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(2.1288F, 3.4717F, -2.3967F);
        this.Chest.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1398F, -0.1226F, -0.2804F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 67, 131, -1.5F, -0.8F, -0.8F, 3, 1, 3, 0.003F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(2.0F, 0.0604F, -0.8779F);
        this.Chest.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.4016F, -0.1226F, -0.2804F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 112, 141, -0.5F, 0.1F, -1.0F, 1, 3, 2, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 4.1431F, -1.4543F);
        this.Chest.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.1571F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 103, 141, -1.0F, -0.9F, -2.0F, 2, 1, 2, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.1261F, -2.8428F);
        this.Chest.addChild(Head);
        this.setRotateAngle(Head, -0.2182F, 0.0F, 0.0F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.9F, -0.8F);
        this.Head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.6109F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 71, 148, -0.99F, 0.01F, -8.0F, 2, 1, 1, 0.015F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.0F, 0.7F, -8.0F);
        this.lowerjaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.5236F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 27, 145, 0.2F, -0.99F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 22, 138, 0.0F, -0.69F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.0F, 0.7F, -8.0F);
        this.lowerjaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.192F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 7, 145, -0.825F, -0.99F, 2.825F, 0, 1, 3, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 80, 116, -1.025F, -0.69F, 2.825F, 1, 1, 6, 0.01F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-2.6268F, 0.91F, 0.4178F);
        this.lowerjaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0175F, -0.192F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 95, 116, -1.0343F, -0.6F, -5.7486F, 1, 1, 6, 0.001F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.917F, 1.01F, -8.051F);
        this.lowerjaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.0698F, -0.5236F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 137, 135, -0.0464F, -1.001F, 0.1039F, 1, 1, 3, 0.001F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.917F, 1.01F, -8.051F);
        this.lowerjaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0698F, 0.5236F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 137, 130, -0.9536F, -1.001F, 0.1039F, 1, 1, 3, 0.001F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(1.0F, 0.7F, -8.0F);
        this.lowerjaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.5236F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 82, 144, -0.2F, -0.99F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 137, 107, -1.0F, -0.69F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(1.0F, 0.7F, -8.0F);
        this.lowerjaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.192F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 38, 144, 0.825F, -0.99F, 2.825F, 0, 1, 3, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 50, 115, 0.025F, -0.69F, 2.825F, 1, 1, 6, 0.01F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(2.6268F, 0.91F, 0.4178F);
        this.lowerjaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0175F, 0.192F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 65, 116, 0.0343F, -0.6F, -5.7486F, 1, 1, 6, 0.001F, false));

        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.9F, -0.8F);
        this.Head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 63, 124, -1.0F, -1.01F, -8.0F, 2, 1, 5, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 45, 145, -1.5F, -1.01F, -3.0F, 3, 1, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 33, 108, -2.5F, -2.1F, -3.25F, 5, 2, 4, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 84, 152, -0.5F, -2.12F, -1.65F, 1, 1, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 152, 122, -0.5F, -1.02F, -7.9052F, 1, 1, 1, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-1.325F, 0.5F, -7.0F);
        this.upperjaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, -0.2618F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 121, 124, 0.0F, -1.01F, -0.6F, 0, 1, 6, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-1.255F, -0.8986F, -3.7897F);
        this.upperjaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.3665F, 0.0131F, -0.3052F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 73, 141, -1.0F, -0.5814F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -0.5236F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 74, 136, 0.0F, -0.99F, 0.0F, 2, 1, 3, 0.002F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, -0.192F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 105, 108, -1.025F, -0.99F, 2.825F, 2, 1, 6, 0.01F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.5236F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 63, 136, -2.0F, -0.99F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.192F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 88, 108, -0.975F, -0.99F, 2.825F, 2, 1, 6, 0.01F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(1.255F, -0.8986F, -3.7897F);
        this.upperjaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.3665F, -0.0131F, 0.3052F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 64, 141, -1.0F, -0.5814F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(1.325F, 0.5F, -7.0F);
        this.upperjaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, 0.2618F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 108, 124, 0.0F, -1.01F, -0.6F, 0, 1, 6, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.3491F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 52, 135, -1.0F, -0.25F, 2.25F, 2, 1, 3, 0.0F, false));

        this.UpperArmL = new ModelRenderer(this);
        this.UpperArmL.setRotationPoint(3.2F, 3.0763F, -0.5341F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.1201F, -0.4205F, 0.3234F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 146, 135, 1.7193F, -0.3971F, -1.1347F, 1, 1, 2, -0.1F, false));
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 148, 71, -0.0807F, -0.3971F, -0.6347F, 2, 1, 1, -0.1F, false));

        this.LowerArmL = new ModelRenderer(this);
        this.LowerArmL.setRotationPoint(2.9541F, 0.3403F, -0.132F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -0.2232F, 0.8404F, 1.1391F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 148, 74, 0.0F, -0.51F, -0.49F, 2, 1, 1, -0.1F, false));
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 92, 148, 0.0F, 0.49F, -0.49F, 2, 1, 1, -0.1F, false));

        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(1.75F, 0.5F, -0.3F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0819F, -0.5716F, 0.0095F);
        this.HandL.cubeList.add(new ModelBox(HandL, 0, 137, 0.0F, -1.51F, -2.39F, 1, 3, 3, 0.0F, false));

        this.UpperArmL2 = new ModelRenderer(this);
        this.UpperArmL2.setRotationPoint(-3.2F, 3.0763F, -0.5341F);
        this.Chest.addChild(UpperArmL2);
        this.setRotateAngle(UpperArmL2, 0.2981F, -0.1645F, -0.2721F);
        this.UpperArmL2.cubeList.add(new ModelBox(UpperArmL2, 142, 146, -2.7193F, -0.3971F, -1.1347F, 1, 1, 2, -0.1F, false));
        this.UpperArmL2.cubeList.add(new ModelBox(UpperArmL2, 148, 97, -1.9193F, -0.3971F, -0.6347F, 2, 1, 1, -0.1F, false));

        this.LowerArmL2 = new ModelRenderer(this);
        this.LowerArmL2.setRotationPoint(-2.9541F, 0.3403F, -0.132F);
        this.UpperArmL2.addChild(LowerArmL2);
        this.setRotateAngle(LowerArmL2, -0.2232F, -0.8404F, -1.1391F);
        this.LowerArmL2.cubeList.add(new ModelBox(LowerArmL2, 148, 112, -2.0F, -0.51F, -0.49F, 2, 1, 1, -0.1F, false));
        this.LowerArmL2.cubeList.add(new ModelBox(LowerArmL2, 115, 148, -2.0F, 0.49F, -0.49F, 2, 1, 1, -0.1F, false));

        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(-1.75F, 0.5F, -0.3F);
        this.LowerArmL2.addChild(HandL2);
        this.setRotateAngle(HandL2, -0.1809F, 0.5744F, -0.0115F);
        this.HandL2.cubeList.add(new ModelBox(HandL2, 39, 137, -1.0F, -1.51F, -2.39F, 1, 3, 3, 0.0F, false));

        this.Hip2 = new ModelRenderer(this);
        this.Hip2.setRotationPoint(0.0F, -7.0F, -32.25F);
        this.animals.addChild(Hip2);
        this.setRotateAngle(Hip2, 2.9234F, 0.3491F, 3.1416F);


        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(-1.6F, 2.9454F, 1.7069F);
        this.Hip2.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -1.9649F, 0.123F, -0.3518F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 13, 151, -0.1273F, -1.9166F, -0.8695F, 1, 2, 1, -0.003F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-1.6F, 2.9454F, 1.7069F);
        this.Hip2.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.1732F, 0.123F, -0.3518F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 13, 126, -0.1273F, 0.2089F, -2.4799F, 1, 1, 5, 0.003F, false));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(-1.6F, 2.9454F, 1.7069F);
        this.Hip2.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.7868F, 0.123F, -0.3518F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 143, 150, -0.1273F, -0.1931F, -0.9662F, 1, 2, 1, -0.003F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-1.6F, 2.9454F, 1.7069F);
        this.Hip2.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0423F, 0.123F, -0.3518F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 138, 150, -0.1273F, -1.4033F, -0.6654F, 1, 2, 1, 0.0F, false));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 152, 139, 0.8006F, -1.2187F, -0.6385F, 1, 1, 1, 0.0F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(1.6F, 2.9454F, 1.7069F);
        this.Hip2.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.1732F, -0.123F, 0.3518F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 126, -0.8727F, 0.2089F, -2.4799F, 1, 1, 5, 0.003F, false));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(1.6F, 2.9454F, 1.7069F);
        this.Hip2.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -1.9649F, -0.123F, 0.3518F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 133, 150, -0.8727F, -1.9166F, -0.8695F, 1, 2, 1, -0.003F, false));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(1.6F, 2.9454F, 1.7069F);
        this.Hip2.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.7868F, -0.123F, 0.3518F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 128, 150, -0.8727F, -0.1931F, -0.9662F, 1, 2, 1, -0.003F, false));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(1.6F, 2.9454F, 1.7069F);
        this.Hip2.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0423F, -0.123F, 0.3518F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 152, 125, -1.8006F, -1.2187F, -0.6385F, 1, 1, 1, 0.0F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 99, 150, -0.8727F, -1.4033F, -0.6654F, 1, 2, 1, 0.0F, false));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 0.825F, -0.3F);
        this.Hip2.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.1745F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 108, 147, -0.5F, -0.1F, 0.0F, 1, 1, 2, 0.002F, false));

        this.UpperLegR = new ModelRenderer(this);
        this.UpperLegR.setRotationPoint(2.25F, 3.3795F, 2.3566F);
        this.Hip2.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, 0.1707F, 0.8296F, -0.2618F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 64, 145, -0.5F, -0.5F, -1.0F, 3, 1, 1, 0.2F, false));

        this.LowerLegR = new ModelRenderer(this);
        this.LowerLegR.setRotationPoint(2.795F, 0.0426F, -1.2444F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.4134F, 0.2255F, 1.2984F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 137, 112, 0.0F, -0.51F, -0.59F, 4, 1, 1, -0.1F, false));
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 103, 138, 0.0F, -0.51F, 0.51F, 4, 1, 1, -0.1F, false));

        this.FootR = new ModelRenderer(this);
        this.FootR.setRotationPoint(3.4729F, 0.0003F, 0.6126F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, 0.4258F, 0.2465F, 0.5699F);
        this.FootR.cubeList.add(new ModelBox(FootR, 137, 55, 0.0F, -2.26F, -1.64F, 1, 3, 3, 0.1F, false));

        this.UpperLegR2 = new ModelRenderer(this);
        this.UpperLegR2.setRotationPoint(-2.25F, 3.3795F, 2.3566F);
        this.Hip2.addChild(UpperLegR2);
        this.setRotateAngle(UpperLegR2, 0.1219F, 0.3389F, 0.429F);
        this.UpperLegR2.cubeList.add(new ModelBox(UpperLegR2, 73, 145, -2.5F, -0.5F, -1.0F, 3, 1, 1, 0.2F, false));

        this.LowerLegR2 = new ModelRenderer(this);
        this.LowerLegR2.setRotationPoint(-2.795F, 0.0426F, -1.2444F);
        this.UpperLegR2.addChild(LowerLegR2);
        this.setRotateAngle(LowerLegR2, 0.3719F, 0.3249F, -1.5815F);
        this.LowerLegR2.cubeList.add(new ModelBox(LowerLegR2, 114, 138, -4.0F, -0.51F, -0.59F, 4, 1, 1, -0.1F, false));
        this.LowerLegR2.cubeList.add(new ModelBox(LowerLegR2, 138, 115, -4.0F, -0.51F, 0.51F, 4, 1, 1, -0.1F, false));

        this.FootR2 = new ModelRenderer(this);
        this.FootR2.setRotationPoint(-3.4729F, 0.0003F, 0.6126F);
        this.LowerLegR2.addChild(FootR2);
        this.setRotateAngle(FootR2, 0.3686F, -0.1702F, -0.2953F);
        this.FootR2.cubeList.add(new ModelBox(FootR2, 137, 62, -1.0F, -2.26F, -1.64F, 1, 3, 3, 0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.75F, 2.0F);
        this.Hip2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1806F, -0.2577F, 0.0465F);


        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0F, 0.875F, -0.4F);
        this.Tail3.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0524F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 147, 118, -0.5F, -0.5F, 0.1F, 1, 1, 2, 0.0F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.1828F, -0.3006F, -0.0547F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 126, 132, -0.5F, 0.1755F, -0.5218F, 1, 1, 4, 0.002F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Hip2.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 45, 148, -0.5F, -0.275F, -2.2F, 1, 1, 2, 0.0F, false));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(0.0F, -2.1011F, -0.4186F);
        this.body2.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.8727F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 153, 17, -0.02F, -1.8577F, -0.1491F, 0, 2, 1, 0.0F, false));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, -0.6011F, -1.3186F);
        this.body2.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.48F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 148, 152, 0.0F, -2.0225F, -0.017F, 0, 3, 1, 0.0F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, -2.1011F, -0.4186F);
        this.body2.addChild(cube_r66);
        this.setRotateAngle(cube_r66, -1.0996F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 153, 13, -0.01F, -1.9462F, -0.1131F, 0, 2, 1, 0.0F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(0.0F, -3.6473F, -1.6929F);
        this.body2.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -0.8814F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 89, 152, -0.01F, -3.1099F, -0.0808F, 0, 3, 1, 0.0F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.0F, -3.6473F, -1.6929F);
        this.body2.addChild(cube_r68);
        this.setRotateAngle(cube_r68, -0.6545F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 22, 133, -0.02F, -3.0099F, -0.0808F, 0, 3, 1, 0.0F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(0.0F, -1.6947F, -1.7257F);
        this.body2.addChild(cube_r69);
        this.setRotateAngle(cube_r69, -0.2182F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 104, 150, 0.0F, -2.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 1.0F, -1.75F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.088F, 0.1304F, 0.0115F);
        this.body3.cubeList.add(new ModelBox(body3, 26, 131, -0.5F, -1.325F, -5.25F, 1, 1, 5, 0.003F, false));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(0.05F, -2.0697F, -4.5924F);
        this.body3.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.6632F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 37, 152, -0.07F, -7.6087F, 1.7608F, 0, 4, 1, 0.0F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.05F, -2.0697F, -4.5924F);
        this.body3.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.4712F, 0.0F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 18, 151, -0.06F, -7.9559F, 0.9939F, 0, 4, 1, 0.0F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(0.05F, -1.8124F, -0.8232F);
        this.body3.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.0873F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 3, 149, 0.0F, -3.9843F, -0.7032F, 0, 5, 1, 0.0F, false));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(0.05F, -5.8124F, -0.8232F);
        this.body3.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -0.2705F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 0, 149, -0.07F, -4.9067F, -0.272F, 0, 5, 1, 0.0F, false));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(0.05F, -5.8124F, -0.8232F);
        this.body3.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.4625F, 0.0F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 125, 148, -0.06F, -4.932F, -0.2438F, 0, 5, 1, 0.0F, false));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(0.05F, -6.6762F, -1.9216F);
        this.body3.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.0349F, 0.0F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 122, 148, -0.07F, -4.9392F, -0.6998F, 0, 5, 1, 0.0F, false));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(0.05F, -6.6762F, -1.9216F);
        this.body3.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0F, 0.0F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 54, 145, 0.0F, -0.1205F, -0.7048F, 0, 6, 1, 0.0F, false));

        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(0.05F, -6.6762F, -1.9216F);
        this.body3.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.1571F, 0.0F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 78, 148, -0.06F, -4.8823F, -0.67F, 0, 5, 1, 0.0F, false));

        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(0.05F, -6.822F, -3.0289F);
        this.body3.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.4276F, 0.0F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 24, 146, -0.07F, -5.0155F, -0.9088F, 0, 5, 1, 0.0F, false));

        this.neck_r1 = new ModelRenderer(this);
        this.neck_r1.setRotationPoint(-0.2F, -0.7104F, -4.6275F);
        this.body3.addChild(neck_r1);
        this.setRotateAngle(neck_r1, 0.1942F, 0.1001F, -0.4702F);
        this.neck_r1.cubeList.add(new ModelBox(neck_r1, 27, 152, -2.4066F, 0.3763F, 3.3315F, 2, 0, 1, 0.0F, false));
        this.neck_r1.cubeList.add(new ModelBox(neck_r1, 6, 152, -2.2462F, 0.0682F, 1.3618F, 2, 0, 1, 0.0F, false));
        this.neck_r1.cubeList.add(new ModelBox(neck_r1, 114, 151, -2.0858F, -0.2398F, -0.6078F, 2, 0, 1, 0.0F, false));

        this.neck_r2 = new ModelRenderer(this);
        this.neck_r2.setRotationPoint(-0.2F, -0.7104F, -4.6275F);
        this.body3.addChild(neck_r2);
        this.setRotateAngle(neck_r2, 0.0846F, 0.2013F, -1.1695F);
        this.neck_r2.cubeList.add(new ModelBox(neck_r2, 153, 25, -2.7188F, -1.3812F, 1.3618F, 1, 0, 1, 0.0F, false));
        this.neck_r2.cubeList.add(new ModelBox(neck_r2, 153, 23, -2.3979F, -1.5141F, -0.6078F, 1, 0, 1, 0.0F, false));

        this.neck_r3 = new ModelRenderer(this);
        this.neck_r3.setRotationPoint(0.2F, -0.7104F, -4.6275F);
        this.body3.addChild(neck_r3);
        this.setRotateAngle(neck_r3, 0.1942F, -0.1001F, 0.4702F);
        this.neck_r3.cubeList.add(new ModelBox(neck_r3, 107, 151, 0.4066F, 0.3763F, 3.3315F, 2, 0, 1, 0.0F, false));
        this.neck_r3.cubeList.add(new ModelBox(neck_r3, 92, 151, 0.2462F, 0.0682F, 1.3618F, 2, 0, 1, 0.0F, false));
        this.neck_r3.cubeList.add(new ModelBox(neck_r3, 71, 151, 0.0858F, -0.2398F, -0.6078F, 2, 0, 1, 0.0F, false));

        this.neck_r4 = new ModelRenderer(this);
        this.neck_r4.setRotationPoint(0.2F, -0.7104F, -4.6275F);
        this.body3.addChild(neck_r4);
        this.setRotateAngle(neck_r4, 0.0846F, -0.2013F, 1.1695F);
        this.neck_r4.cubeList.add(new ModelBox(neck_r4, 153, 21, 1.7188F, -1.3812F, 1.3618F, 1, 0, 1, 0.0F, false));
        this.neck_r4.cubeList.add(new ModelBox(neck_r4, 21, 153, 1.3979F, -1.5141F, -0.6078F, 1, 0, 1, 0.0F, false));

        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(0.05F, -6.822F, -3.0289F);
        this.body3.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.2356F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 21, 146, -0.06F, -5.0155F, -0.9088F, 0, 5, 1, 0.0F, false));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(0.05F, -4.322F, -3.3289F);
        this.body3.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.0436F, 0.0F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 34, 145, 0.0F, -2.5F, -0.5F, 0, 6, 1, 0.0F, false));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(0.05F, -2.0697F, -4.5924F);
        this.body3.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.1571F, 0.0F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 89, 144, 0.0F, -4.6335F, -0.245F, 0, 6, 1, 0.0F, false));

        this.Chest2 = new ModelRenderer(this);
        this.Chest2.setRotationPoint(0.0F, 0.0F, -5.25F);
        this.body3.addChild(Chest2);
        this.setRotateAngle(Chest2, 0.088F, 0.1304F, 0.0115F);


        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(0.0F, -5.1039F, -0.2291F);
        this.Chest2.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.8814F, 0.0F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 153, 0, -0.02F, -3.0501F, -0.9733F, 0, 3, 1, 0.0F, false));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(0.0F, -5.1039F, -0.2291F);
        this.Chest2.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.6021F, 0.0F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 151, 152, -0.01F, -2.9501F, -0.9733F, 0, 3, 1, 0.0F, false));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(0.0F, -3.0359F, -0.4193F);
        this.Chest2.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.2182F, 0.0F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 81, 152, 0.0F, -1.9382F, -0.2891F, 0, 4, 1, 0.0F, false));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(0.0F, -2.7528F, -1.2279F);
        this.Chest2.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.8727F, 0.0F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 153, 31, -0.01F, -1.9575F, -0.7305F, 0, 2, 1, 0.0F, false));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(0.0F, -2.75F, -1.5F);
        this.Chest2.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.3491F, 0.0F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 153, 27, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(-2.7F, 0.0066F, -0.5949F);
        this.Chest2.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.2618F, 0.0F, 0.1745F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 57, 141, -0.5F, -1.0085F, -0.9353F, 1, 4, 2, 0.0F, false));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(-2.7F, 0.3066F, -0.5949F);
        this.Chest2.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.0F, 0.0F, 0.1745F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 64, 148, -0.4F, -1.4744F, -0.8059F, 1, 1, 2, 0.0F, false));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(2.7F, 0.0066F, -0.5949F);
        this.Chest2.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -0.2618F, 0.0F, -0.1745F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 31, 138, -0.5F, -1.0085F, -0.9353F, 1, 4, 2, 0.0F, false));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(2.0F, 2.7321F, -1.2008F);
        this.Chest2.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -0.0873F, 0.0F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 137, 98, -3.5F, -0.5F, -2.4F, 3, 1, 2, 0.0F, false));
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 52, 131, -4.5F, -0.5F, -0.4F, 5, 1, 2, 0.0F, false));

        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(2.7F, 0.3066F, -0.5949F);
        this.Chest2.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.0F, 0.0F, -0.1745F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 57, 148, -0.6F, -1.4744F, -0.8059F, 1, 1, 2, 0.0F, false));

        this.neck_r5 = new ModelRenderer(this);
        this.neck_r5.setRotationPoint(-0.2F, -0.7104F, -1.3775F);
        this.Chest2.addChild(neck_r5);
        this.setRotateAngle(neck_r5, 0.0335F, 0.0806F, -1.1767F);
        this.neck_r5.cubeList.add(new ModelBox(neck_r5, 64, 152, -3.422F, -1.5041F, -0.4095F, 2, 0, 1, 0.0F, false));

        this.neck_r6 = new ModelRenderer(this);
        this.neck_r6.setRotationPoint(-0.2F, -0.7104F, -1.3775F);
        this.Chest2.addChild(neck_r6);
        this.setRotateAngle(neck_r6, 0.0774F, 0.0403F, -0.4784F);
        this.neck_r6.cubeList.add(new ModelBox(neck_r6, 57, 152, -2.0979F, -0.2167F, -0.4095F, 2, 0, 1, 0.0F, false));

        this.neck_r7 = new ModelRenderer(this);
        this.neck_r7.setRotationPoint(0.2F, -0.7104F, -1.3775F);
        this.Chest2.addChild(neck_r7);
        this.setRotateAngle(neck_r7, 0.0774F, -0.0403F, 0.4784F);
        this.neck_r7.cubeList.add(new ModelBox(neck_r7, 47, 152, 0.0979F, -0.2167F, -0.4095F, 2, 0, 1, 0.0F, false));

        this.neck_r8 = new ModelRenderer(this);
        this.neck_r8.setRotationPoint(0.2F, -0.7104F, -1.3775F);
        this.Chest2.addChild(neck_r8);
        this.setRotateAngle(neck_r8, 0.0335F, -0.0806F, 1.1767F);
        this.neck_r8.cubeList.add(new ModelBox(neck_r8, 40, 152, 1.422F, -1.5041F, -0.4095F, 2, 0, 1, 0.0F, false));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(0.0F, -0.6F, -2.15F);
        this.Chest2.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.0873F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 134, 140, -0.5F, -0.45F, -0.65F, 1, 1, 3, 0.0F, false));

        this.Head2 = new ModelRenderer(this);
        this.Head2.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.Chest2.addChild(Head2);
        this.setRotateAngle(Head2, -0.2213F, 0.1173F, -0.0493F);


        this.lowerjaw2 = new ModelRenderer(this);
        this.lowerjaw2.setRotationPoint(0.0F, 0.525F, 0.0F);
        this.Head2.addChild(lowerjaw2);
        this.setRotateAngle(lowerjaw2, 0.6106F, 0.0072F, 0.0093F);
        this.lowerjaw2.cubeList.add(new ModelBox(lowerjaw2, 37, 149, -1.0F, 0.01F, -8.0F, 2, 1, 1, -0.002F, false));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(-2.2F, 1.2F, -5.4F);
        this.lowerjaw2.addChild(cube_r93);
        this.setRotateAngle(cube_r93, -0.0873F, -0.5236F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 48, 140, -0.2608F, -0.9518F, -2.8033F, 1, 1, 3, -0.003F, false));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(-1.0F, 1.0F, -8.0F);
        this.lowerjaw2.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.0F, -0.192F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 48, 123, -1.025F, -0.99F, 2.825F, 1, 1, 6, 0.01F, false));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(-2.6268F, 0.91F, 0.6178F);
        this.lowerjaw2.addChild(cube_r95);
        this.setRotateAngle(cube_r95, -0.1134F, -0.192F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 33, 123, -1.0724F, 0.0F, -5.9449F, 1, 1, 6, -0.003F, false));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(-1.0F, 1.0F, -8.0F);
        this.lowerjaw2.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.0F, -0.5236F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 9, 140, 0.0F, -0.99F, 0.0F, 1, 1, 3, -0.001F, false));
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 14, 146, 0.5F, -1.515F, -0.05F, 0, 1, 3, 0.0F, false));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(-2.042F, -0.015F, -5.1462F);
        this.lowerjaw2.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.0F, -0.3054F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 135, 145, -0.0245F, -0.5F, -0.0175F, 0, 1, 3, 0.0F, false));

        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(2.042F, -0.015F, -5.1462F);
        this.lowerjaw2.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.0F, 0.3054F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 128, 145, 0.0245F, -0.5F, -0.0175F, 0, 1, 3, 0.0F, false));

        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(1.0F, 1.0F, -8.0F);
        this.lowerjaw2.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.0F, 0.5236F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 101, 145, -0.5F, -1.515F, -0.05F, 0, 1, 3, 0.0F, false));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 138, 118, -1.0F, -0.99F, 0.0F, 1, 1, 3, -0.001F, false));

        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(2.2F, 1.2F, -5.4F);
        this.lowerjaw2.addChild(cube_r100);
        this.setRotateAngle(cube_r100, -0.0873F, 0.5236F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 125, 138, -0.7392F, -0.9518F, -2.8033F, 1, 1, 3, -0.003F, false));

        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(2.6268F, 0.91F, 0.6178F);
        this.lowerjaw2.addChild(cube_r101);
        this.setRotateAngle(cube_r101, -0.1134F, 0.192F, 0.0F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 122, 108, 0.0724F, 0.0F, -5.9449F, 1, 1, 6, -0.003F, false));

        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(1.0F, 1.0F, -8.0F);
        this.lowerjaw2.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.0F, 0.192F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 110, 116, 0.025F, -0.99F, 2.825F, 1, 1, 6, 0.01F, false));

        this.upperjaw2 = new ModelRenderer(this);
        this.upperjaw2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Head2.addChild(upperjaw2);
        this.upperjaw2.cubeList.add(new ModelBox(upperjaw2, 0, 133, -2.0F, -2.0F, -4.875F, 4, 1, 2, 0.0F, false));
        this.upperjaw2.cubeList.add(new ModelBox(upperjaw2, 93, 124, -1.0F, -1.01F, -8.0F, 2, 1, 5, 0.0F, false));
        this.upperjaw2.cubeList.add(new ModelBox(upperjaw2, 146, 65, -1.5F, -1.01F, -3.0F, 3, 1, 1, 0.0F, false));

        this.cube_r103 = new ModelRenderer(this);
        this.cube_r103.setRotationPoint(-2.4897F, -0.01F, -2.6533F);
        this.upperjaw2.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.0F, -0.1309F, 0.0F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 146, 84, -0.025F, -0.5F, -2.25F, 0, 1, 3, 0.0F, false));

        this.cube_r104 = new ModelRenderer(this);
        this.cube_r104.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.upperjaw2.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.0F, -0.192F, 0.0F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 33, 115, -1.025F, -0.99F, 2.825F, 2, 1, 6, 0.01F, false));

        this.cube_r105 = new ModelRenderer(this);
        this.cube_r105.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.upperjaw2.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.0F, -0.5236F, 0.0F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 137, 74, 0.0F, -0.99F, 0.0F, 2, 1, 3, -0.002F, false));

        this.cube_r106 = new ModelRenderer(this);
        this.cube_r106.setRotationPoint(-1.325F, 0.5F, -7.0F);
        this.upperjaw2.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.0F, -0.3927F, 0.0F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 146, 79, -0.025F, -1.01F, -0.75F, 0, 1, 3, 0.0F, false));

        this.cube_r107 = new ModelRenderer(this);
        this.cube_r107.setRotationPoint(1.0F, 0.0F, -8.0F);
        this.upperjaw2.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.0F, 0.5236F, 0.0F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 137, 69, -2.0F, -0.99F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r108 = new ModelRenderer(this);
        this.cube_r108.setRotationPoint(1.0F, 0.0F, -8.0F);
        this.upperjaw2.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.0F, 0.192F, 0.0F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 71, 108, -0.975F, -0.99F, 2.825F, 2, 1, 6, 0.01F, false));

        this.cube_r109 = new ModelRenderer(this);
        this.cube_r109.setRotationPoint(0.0F, -2.55F, -3.25F);
        this.upperjaw2.addChild(cube_r109);
        this.setRotateAngle(cube_r109, -0.0044F, 0.0F, 0.0F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 52, 108, -2.5F, 0.0F, 0.0F, 5, 2, 4, 0.0F, false));

        this.cube_r110 = new ModelRenderer(this);
        this.cube_r110.setRotationPoint(2.4897F, -0.01F, -2.6533F);
        this.upperjaw2.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.0F, 0.1309F, 0.0F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 146, 60, 0.025F, -0.5F, -2.25F, 0, 1, 3, 0.0F, false));

        this.cube_r111 = new ModelRenderer(this);
        this.cube_r111.setRotationPoint(1.325F, 0.5F, -7.0F);
        this.upperjaw2.addChild(cube_r111);
        this.setRotateAngle(cube_r111, 0.0F, 0.3927F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 146, 55, 0.025F, -1.01F, -0.75F, 0, 1, 3, 0.0F, false));

        this.cube_r112 = new ModelRenderer(this);
        this.cube_r112.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.upperjaw2.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 0.3054F, 0.0F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 78, 124, -1.0F, -1.0F, 0.325F, 2, 1, 5, 0.001F, false));

        this.UpperArmR = new ModelRenderer(this);
        this.UpperArmR.setRotationPoint(3.5F, 2.25F, -0.9F);
        this.Chest2.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, -0.0436F, -0.0436F, 0.6109F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 146, 89, -0.4F, -0.1F, -1.0F, 3, 1, 1, 0.0F, false));

        this.LowerArmR = new ModelRenderer(this);
        this.LowerArmR.setRotationPoint(2.6466F, 0.1384F, -0.9439F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, -1.1405F, 1.2249F, -0.123F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 81, 149, 0.0F, -0.51F, -0.49F, 2, 1, 1, 0.1F, false));
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 149, 115, 0.0F, 0.59F, -0.69F, 2, 1, 1, -0.2F, false));

        this.HandR = new ModelRenderer(this);
        this.HandR.setRotationPoint(1.75F, 0.5F, -0.3F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 2.7822F, -1.5145F, -2.6566F);
        this.HandR.cubeList.add(new ModelBox(HandR, 137, 79, 0.0F, -1.51F, -2.39F, 1, 3, 3, 0.0F, false));

        this.UpperArmR2 = new ModelRenderer(this);
        this.UpperArmR2.setRotationPoint(-3.5F, 2.25F, -0.9F);
        this.Chest2.addChild(UpperArmR2);
        this.setRotateAngle(UpperArmR2, 0.0F, 1.2217F, -0.6109F);
        this.UpperArmR2.cubeList.add(new ModelBox(UpperArmR2, 146, 92, -2.6F, -0.1F, -1.0F, 3, 1, 1, 0.0F, false));

        this.LowerArmR2 = new ModelRenderer(this);
        this.LowerArmR2.setRotationPoint(-2.6466F, 0.1384F, -0.9439F);
        this.UpperArmR2.addChild(LowerArmR2);
        this.setRotateAngle(LowerArmR2, 0.2618F, -1.3963F, -1.2217F);
        this.LowerArmR2.cubeList.add(new ModelBox(LowerArmR2, 149, 146, -2.0F, -0.51F, -0.49F, 2, 1, 1, 0.1F, false));
        this.LowerArmR2.cubeList.add(new ModelBox(LowerArmR2, 149, 149, -2.0F, 0.59F, -0.69F, 2, 1, 1, -0.2F, false));

        this.HandR2 = new ModelRenderer(this);
        this.HandR2.setRotationPoint(-1.75F, 0.5F, -0.3F);
        this.LowerArmR2.addChild(HandR2);
        this.setRotateAngle(HandR2, -0.1738F, 0.7346F, -0.4035F);
        this.HandR2.cubeList.add(new ModelBox(HandR2, 85, 137, -1.0F, -1.51F, -2.39F, 1, 3, 3, 0.0F, false));

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
