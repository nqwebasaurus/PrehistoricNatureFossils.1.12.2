package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCacops extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Hip;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer UpperLegL;
    private final ModelRenderer LowerLegL;
    private final ModelRenderer FootL;
    private final ModelRenderer UpperLegL2;
    private final ModelRenderer LowerLegL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer body;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer body1;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer Chest;
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
    private final ModelRenderer cube_r35;
    private final ModelRenderer Head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer upperjaw;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer UpperArmL;
    private final ModelRenderer LowerArmL;
    private final ModelRenderer HandL;
    private final ModelRenderer UpperArmL2;
    private final ModelRenderer LowerArmL2;
    private final ModelRenderer HandL2;

    public ModelSkeletonCacops() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Hip = new ModelRenderer(this);
        this.Hip.setRotationPoint(0.0F, -5.5F, 3.75F);
        this.fossil.addChild(Hip);
        this.setRotateAngle(Hip, -0.2182F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0176F, 1.5555F, 0.2531F);
        this.Hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1293F, -0.1176F, -0.7341F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 29, -0.3383F, -0.297F, -1.2264F, 1, 2, 3, 0.003F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.7F, 0.653F, 0.5885F);
        this.Hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1687F, 0.045F, 0.258F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 36, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.003F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0176F, 1.5555F, 0.2531F);
        this.Hip.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1293F, 0.1176F, 0.7341F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 29, -0.6617F, -0.297F, -1.2264F, 1, 2, 3, 0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.7F, 0.653F, 0.5885F);
        this.Hip.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1687F, -0.045F, -0.258F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 36, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.1606F, 0.6753F);
        this.Hip.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 40, -1.5F, -0.1F, -1.0F, 1, 0, 2, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 40, 0.5F, -0.1F, -1.0F, 1, 0, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 33, 32, -0.5F, -0.5F, -2.0F, 1, 1, 3, 0.003F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 3.0282F, -0.338F);
        this.Hip.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 9, -1.0F, -0.8F, -0.9F, 2, 1, 4, 0.003F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.5894F, -2.2247F);
        this.Hip.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 22, 0.0F, 0.3F, 3.1F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 0, 0.0F, 0.2F, 1.2F, 0, 1, 1, 0.0F, false));

        this.UpperLegL = new ModelRenderer(this);
        this.UpperLegL.setRotationPoint(2.25F, 1.502F, 0.699F);
        this.Hip.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 0.0533F, 0.6124F, 0.3538F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 30, 37, -0.2F, -0.5F, -1.0F, 3, 1, 1, -0.1F, false));

        this.LowerLegL = new ModelRenderer(this);
        this.LowerLegL.setRotationPoint(2.7127F, 0.5782F, -0.6753F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.0133F, -0.7672F, 1.3451F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 37, 4, -0.3376F, -0.5755F, -0.2857F, 3, 1, 1, -0.1F, false));
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 35, 23, -0.3376F, -0.5755F, 0.7143F, 3, 1, 1, -0.1F, false));

        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(2.5F, -0.5F, 0.45F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.8069F, 0.4686F, 0.0743F);
        this.FootL.cubeList.add(new ModelBox(FootL, 0, 28, 0.0F, -2.26F, -1.64F, 1, 3, 3, 0.1F, false));

        this.UpperLegL2 = new ModelRenderer(this);
        this.UpperLegL2.setRotationPoint(-2.25F, 1.502F, 0.699F);
        this.Hip.addChild(UpperLegL2);
        this.setRotateAngle(UpperLegL2, 0.6357F, 0.3104F, -0.0714F);
        this.UpperLegL2.cubeList.add(new ModelBox(UpperLegL2, 30, 37, -2.8F, -0.5F, -1.0F, 3, 1, 1, -0.1F, true));

        this.LowerLegL2 = new ModelRenderer(this);
        this.LowerLegL2.setRotationPoint(-2.7127F, 0.5782F, -0.6753F);
        this.UpperLegL2.addChild(LowerLegL2);
        this.setRotateAngle(LowerLegL2, 0.051F, 1.0688F, -1.2614F);
        this.LowerLegL2.cubeList.add(new ModelBox(LowerLegL2, 37, 4, -2.6624F, -0.5755F, -0.2857F, 3, 1, 1, -0.1F, true));
        this.LowerLegL2.cubeList.add(new ModelBox(LowerLegL2, 35, 23, -2.6624F, -0.5755F, 0.7143F, 3, 1, 1, -0.1F, true));

        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(-2.5F, -0.5F, 0.45F);
        this.LowerLegL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.8545F, -0.1936F, -0.0916F);
        this.FootL2.cubeList.add(new ModelBox(FootL2, 0, 28, -1.0F, -2.26F, -1.64F, 1, 3, 3, 0.1F, true));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.3856F, 1.5753F);
        this.Hip.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1752F, 0.0859F, -0.0152F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 25, 15, -0.5F, -0.5993F, -0.1077F, 1, 1, 4, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.6669F, -0.2074F);
        this.Tail1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 20, 0.0F, -0.4F, 3.1F, 0, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 20, 0.0F, -0.4F, 1.1F, 0, 1, 1, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.1743F, 3.8923F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0903F, 0.2608F, 0.0233F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 33, 18, -0.5F, -0.4222F, -0.0695F, 1, 1, 3, 0.003F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.4903F, -4.0474F);
        this.Tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 9, 0.0F, -0.4F, 5.0F, 0, 1, 1, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.3644F, -0.9247F);
        this.Hip.addChild(body);
        this.setRotateAngle(body, 0.088F, -0.1304F, -0.0115F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.5223F, -1.9936F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1571F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 39, -0.5F, -0.1F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.8473F, -1.8936F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 15, -0.5F, -0.15F, 0.05F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.0393F, -1.4759F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0162F, -0.0913F, -0.938F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 29, 10, -2.9135F, -0.4067F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.0393F, -1.4759F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.052F, -0.0768F, -0.5178F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 15, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.0393F, -1.4759F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.052F, 0.0768F, 0.5178F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 15, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.0393F, -1.4759F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0162F, 0.0913F, 0.938F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 29, 10, 0.9135F, -0.4067F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.1723F, -1.2936F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 17, 0.0F, 0.2F, -0.6F, 0, 1, 1, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.1473F, -1.9436F);
        this.body.addChild(body1);
        this.setRotateAngle(body1, 0.088F, 0.1304F, 0.0115F);
        this.body1.cubeList.add(new ModelBox(body1, 17, 20, -0.5F, -1.8345F, -4.7989F, 1, 1, 5, 0.01F, false));
        this.body1.cubeList.add(new ModelBox(body1, 7, 25, -0.5F, -0.4595F, -3.9489F, 1, 1, 4, 0.003F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 17, 0.0F, -1.4595F, -3.9489F, 0, 1, 1, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 15, 0, 0.0F, -1.4595F, -1.9489F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 0.0522F, -3.4313F);
        this.body1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1154F, 0.0823F, -0.9826F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 25, 22, -3.9135F, -0.4067F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.0522F, -1.4313F);
        this.body1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0096F, -0.0561F, -0.9399F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 22, 5, -3.9135F, -0.4067F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.0522F, -1.4313F);
        this.body1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.014F, -0.0552F, -0.5203F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 11, 9, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.0522F, -3.4313F);
        this.body1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1388F, 0.0284F, -0.5665F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 11, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 0.0522F, -1.4313F);
        this.body1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0096F, 0.0561F, 0.9399F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 22, 5, 0.9135F, -0.4067F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 0.0522F, -1.4313F);
        this.body1.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.014F, 0.0552F, 0.5203F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 11, 9, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.0522F, -3.4313F);
        this.body1.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1154F, -0.0823F, 0.9826F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 25, 22, 0.9135F, -0.4067F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 0.0522F, -3.4313F);
        this.body1.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1388F, -0.0284F, 0.5665F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 11, 11, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0655F, -3.7489F);
        this.body1.addChild(Chest);
        this.setRotateAngle(Chest, 0.0886F, 0.1739F, 0.0154F);


        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.7739F, -0.8928F);
        this.Chest.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2182F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 37, 38, -0.5F, -0.2F, -2.1F, 1, 1, 2, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0261F, -2.9428F);
        this.Chest.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1047F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, 0.0F, -1.25F, 1.05F, 0, 1, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 22, -0.5F, -0.25F, -0.95F, 1, 1, 4, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 0.1127F, -1.3752F);
        this.Chest.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1825F, 0.1409F, -0.9761F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 14, 27, -2.9135F, -0.4067F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 0.1127F, -1.3752F);
        this.Chest.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2235F, 0.0552F, -0.564F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 10, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 0.1127F, -1.3752F);
        this.Chest.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1825F, -0.1409F, 0.9761F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 14, 27, 0.9135F, -0.4067F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 0.1127F, -1.3752F);
        this.Chest.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2235F, -0.0552F, 0.564F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 10, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.1288F, 3.4717F, -2.3967F);
        this.Chest.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1398F, 0.1226F, 0.2804F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 22, 0, -1.5F, -0.8F, -0.8F, 3, 1, 3, 0.003F, true));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-2.0F, 0.0604F, -0.8779F);
        this.Chest.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.4016F, 0.1226F, 0.2804F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 16, 34, -0.5F, 0.1F, -1.0F, 1, 3, 2, 0.0F, true));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(2.1288F, 3.4717F, -2.3967F);
        this.Chest.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1398F, -0.1226F, -0.2804F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 22, 0, -1.5F, -0.8F, -0.8F, 3, 1, 3, 0.003F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(2.0F, 0.0604F, -0.8779F);
        this.Chest.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.4016F, -0.1226F, -0.2804F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 16, 34, -0.5F, 0.1F, -1.0F, 1, 3, 2, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 4.1431F, -1.4543F);
        this.Chest.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1571F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 35, -1.0F, -0.9F, -2.0F, 2, 1, 2, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.1261F, -2.8428F);
        this.Chest.addChild(Head);
        this.setRotateAngle(Head, -0.2618F, 0.0F, 0.0F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.9F, -0.8F);
        this.Head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.48F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 39, 31, -0.99F, 0.01F, -8.0F, 2, 1, 1, 0.015F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.0F, 0.7F, -8.0F);
        this.lowerjaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.5236F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 23, 34, 0.2F, -0.99F, 0.0F, 0, 1, 3, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 32, 12, 0.0F, -0.69F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.0F, 0.7F, -8.0F);
        this.lowerjaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.192F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 35, 26, -0.825F, -0.99F, 2.825F, 0, 1, 3, 0.0F, true));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 13, 1, -1.025F, -0.69F, 2.825F, 1, 1, 6, 0.01F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-2.6268F, 0.91F, 0.4178F);
        this.lowerjaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0175F, -0.192F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 11, 9, -1.0343F, -0.6F, -5.7486F, 1, 1, 6, 0.001F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.917F, 1.01F, -8.051F);
        this.lowerjaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0698F, -0.5236F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 9, 31, -0.0464F, -1.001F, 0.1039F, 1, 1, 3, 0.001F, true));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.917F, 1.01F, -8.051F);
        this.lowerjaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.0698F, 0.5236F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 9, 31, -0.9536F, -1.001F, 0.1039F, 1, 1, 3, 0.001F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(1.0F, 0.7F, -8.0F);
        this.lowerjaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.5236F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 23, 34, -0.2F, -0.99F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 32, 12, -1.0F, -0.69F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(1.0F, 0.7F, -8.0F);
        this.lowerjaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.192F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 35, 26, 0.825F, -0.99F, 2.825F, 0, 1, 3, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 13, 1, 0.025F, -0.69F, 2.825F, 1, 1, 6, 0.01F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(2.6268F, 0.91F, 0.4178F);
        this.lowerjaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0175F, 0.192F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 11, 9, 0.0343F, -0.6F, -5.7486F, 1, 1, 6, 0.001F, false));

        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.9F, -0.8F);
        this.Head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 15, -1.0F, -1.01F, -8.0F, 2, 1, 5, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 16, 17, -1.5F, -1.01F, -3.0F, 3, 1, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 0, -2.5F, -2.1F, -3.25F, 5, 2, 4, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 7, -0.5F, -2.12F, -1.65F, 1, 1, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 7, -0.5F, -1.02F, -7.9052F, 1, 1, 1, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.325F, 0.5F, -7.0F);
        this.upperjaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, -0.2618F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 9, 17, 0.0F, -1.01F, -0.6F, 0, 1, 6, 0.0F, true));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-1.255F, -0.8986F, -3.7897F);
        this.upperjaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.3665F, 0.0131F, -0.3052F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 35, 0, -1.0F, -0.5814F, -1.0F, 2, 1, 2, 0.0F, true));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, -0.5236F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 27, 24, 0.0F, -0.99F, 0.0F, 2, 1, 3, 0.002F, true));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -0.192F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 7, -1.025F, -0.99F, 2.825F, 2, 1, 6, 0.01F, true));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.5236F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 27, 24, -2.0F, -0.99F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.192F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 7, -0.975F, -0.99F, 2.825F, 2, 1, 6, 0.01F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(1.255F, -0.8986F, -3.7897F);
        this.upperjaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.3665F, -0.0131F, 0.3052F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 35, 0, -1.0F, -0.5814F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(1.325F, 0.5F, -7.0F);
        this.upperjaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.2618F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 9, 17, 0.0F, -1.01F, -0.6F, 0, 1, 6, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.3491F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 29, 5, -1.0F, -0.25F, 2.25F, 2, 1, 3, 0.0F, false));

        this.UpperArmL = new ModelRenderer(this);
        this.UpperArmL.setRotationPoint(3.2F, 3.0763F, -0.5341F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.2215F, 0.1819F, -0.1024F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 38, 8, 1.7193F, -0.3971F, -1.1347F, 1, 1, 2, -0.1F, false));
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 39, 26, -0.0807F, -0.3971F, -0.6347F, 2, 1, 1, -0.1F, false));

        this.LowerArmL = new ModelRenderer(this);
        this.LowerArmL.setRotationPoint(2.9541F, 0.3403F, -0.132F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -0.2232F, 0.8404F, 1.1391F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 22, 39, 0.0F, -0.51F, -0.49F, 2, 1, 1, -0.1F, false));
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 38, 12, 0.0F, 0.49F, -0.49F, 2, 1, 1, -0.1F, false));

        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(1.75F, 0.5F, -0.3F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, -0.1263F, -0.788F, 0.069F);
        this.HandL.cubeList.add(new ModelBox(HandL, 18, 27, 0.0F, -1.51F, -2.39F, 1, 3, 3, 0.0F, false));

        this.UpperArmL2 = new ModelRenderer(this);
        this.UpperArmL2.setRotationPoint(-3.2F, 3.0763F, -0.5341F);
        this.Chest.addChild(UpperArmL2);
        this.setRotateAngle(UpperArmL2, 0.1412F, 0.6801F, -0.2835F);
        this.UpperArmL2.cubeList.add(new ModelBox(UpperArmL2, 38, 8, -2.7193F, -0.3971F, -1.1347F, 1, 1, 2, -0.1F, true));
        this.UpperArmL2.cubeList.add(new ModelBox(UpperArmL2, 39, 26, -1.9193F, -0.3971F, -0.6347F, 2, 1, 1, -0.1F, true));

        this.LowerArmL2 = new ModelRenderer(this);
        this.LowerArmL2.setRotationPoint(-2.9541F, 0.3403F, -0.132F);
        this.UpperArmL2.addChild(LowerArmL2);
        this.setRotateAngle(LowerArmL2, -0.2232F, -0.8404F, -1.1391F);
        this.LowerArmL2.cubeList.add(new ModelBox(LowerArmL2, 22, 39, -2.0F, -0.51F, -0.49F, 2, 1, 1, -0.1F, true));
        this.LowerArmL2.cubeList.add(new ModelBox(LowerArmL2, 38, 12, -2.0F, 0.49F, -0.49F, 2, 1, 1, -0.1F, true));

        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(-1.75F, 0.5F, -0.3F);
        this.LowerArmL2.addChild(HandL2);
        this.setRotateAngle(HandL2, 0.0248F, 0.5326F, -0.1146F);
        this.HandL2.cubeList.add(new ModelBox(HandL2, 18, 27, -1.0F, -1.51F, -2.39F, 1, 3, 3, 0.0F, true));

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
