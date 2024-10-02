package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSauropeltaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer osteoderms6;
    private final ModelRenderer osteoderms18;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftfoot2;
    private final ModelRenderer leftleg4;
    private final ModelRenderer leftleg5;
    private final ModelRenderer leftleg6;
    private final ModelRenderer leftfoot3;
    private final ModelRenderer leftfoot4;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightfoot2;
    private final ModelRenderer backPlates3;
    private final ModelRenderer backPlates6;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer osteoderms5;
    private final ModelRenderer osteoderms17;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer backPlates;
    private final ModelRenderer backPlates4;
    private final ModelRenderer osteoderms4;
    private final ModelRenderer osteoderms16;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer osteoderms3;
    private final ModelRenderer osteoderms15;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer osteoderms2;
    private final ModelRenderer osteoderms14;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer osteoderms;
    private final ModelRenderer osteoderms13;
    private final ModelRenderer head;
    private final ModelRenderer bone;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer backPlates2;
    private final ModelRenderer backPlates5;
    private final ModelRenderer tail;
    private final ModelRenderer osteoderms12;
    private final ModelRenderer osteoderms19;
    private final ModelRenderer osteoderms7;
    private final ModelRenderer osteoderms20;
    private final ModelRenderer tail2;
    private final ModelRenderer osteoderms8;
    private final ModelRenderer osteoderms21;
    private final ModelRenderer tail3;
    private final ModelRenderer osteoderms9;
    private final ModelRenderer osteoderms22;
    private final ModelRenderer tail4;
    private final ModelRenderer osteoderms10;
    private final ModelRenderer osteoderms23;
    private final ModelRenderer tail5;
    private final ModelRenderer osteoderms11;
    private final ModelRenderer osteoderms24;

    public ModelSkeletonSauropeltaFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, -2.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -18.0F, -5.2F, 1, 18, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -12.6F, -24.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.8F, -2.4F, -0.5F, 1, 15, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -12.6F, -24.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.4F, -7.5F, -0.5F, 1, 12, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -13.5F, -4.7F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -3.7F, -6.5F, -0.5F, 1, 12, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -18.5F, -3.0F);
        this.fossil.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -0.6F, -3.5F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 68, 0.0F, 0.5199F, -0.5166F, 1, 1, 8, -0.2F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -1.0F, -8.3F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 81, 81, 0.0F, 0.4F, 0.6F, 1, 1, 4, -0.2F, false));

        this.osteoderms6 = new ModelRenderer(this);
        this.osteoderms6.setRotationPoint(9.5F, -2.066F, -8.4611F);
        this.hips.addChild(osteoderms6);
        this.setRotateAngle(osteoderms6, -0.3499F, -0.0656F, 0.0239F);


        this.osteoderms18 = new ModelRenderer(this);
        this.osteoderms18.setRotationPoint(-9.5F, -2.066F, -8.4611F);
        this.hips.addChild(osteoderms18);
        this.setRotateAngle(osteoderms18, -0.3499F, 0.0656F, -0.0239F);


        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(5.4F, 1.4999F, -1.1448F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.3142F, 0.0F, 0.0F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 8.9762F, -2.3099F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.4887F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 6.5865F, 3.4725F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.4451F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 2.5542F, -0.7405F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.0175F, 0.0F, 0.0F);


        this.leftfoot2 = new ModelRenderer(this);
        this.leftfoot2.setRotationPoint(0.0F, 0.939F, -0.2934F);
        this.leftfoot.addChild(leftfoot2);
        this.setRotateAngle(leftfoot2, 0.288F, 0.0F, 0.0F);


        this.leftleg4 = new ModelRenderer(this);
        this.leftleg4.setRotationPoint(-5.4F, 1.4999F, -1.1448F);
        this.hips.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.2967F, 0.0F, 0.0F);


        this.leftleg5 = new ModelRenderer(this);
        this.leftleg5.setRotationPoint(0.0F, 8.9762F, -2.3099F);
        this.leftleg4.addChild(leftleg5);
        this.setRotateAngle(leftleg5, 0.2705F, 0.0F, 0.0F);


        this.leftleg6 = new ModelRenderer(this);
        this.leftleg6.setRotationPoint(0.0F, 6.5865F, 3.4725F);
        this.leftleg5.addChild(leftleg6);
        this.setRotateAngle(leftleg6, -0.4887F, 0.0F, 0.0F);


        this.leftfoot3 = new ModelRenderer(this);
        this.leftfoot3.setRotationPoint(0.0F, 2.5542F, -0.7405F);
        this.leftleg6.addChild(leftfoot3);
        this.setRotateAngle(leftfoot3, -0.0175F, 0.0F, 0.0F);


        this.leftfoot4 = new ModelRenderer(this);
        this.leftfoot4.setRotationPoint(0.0F, 0.939F, -0.2934F);
        this.leftfoot3.addChild(leftfoot4);
        this.setRotateAngle(leftfoot4, -0.0567F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-5.4F, 1.4999F, -1.1448F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.0524F, 0.0F, 0.0F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 8.9762F, -2.3099F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.3578F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 6.5865F, 3.4725F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.2705F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 2.5542F, -0.7405F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.0175F, 0.0F, 0.0F);


        this.rightfoot2 = new ModelRenderer(this);
        this.rightfoot2.setRotationPoint(0.0F, 0.939F, -0.2934F);
        this.rightfoot.addChild(rightfoot2);
        this.setRotateAngle(rightfoot2, -0.0175F, 0.0F, 0.0F);


        this.backPlates3 = new ModelRenderer(this);
        this.backPlates3.setRotationPoint(6.0F, -2.7511F, -8.4674F);
        this.hips.addChild(backPlates3);
        this.setRotateAngle(backPlates3, 0.0F, -0.2618F, 0.0F);


        this.backPlates6 = new ModelRenderer(this);
        this.backPlates6.setRotationPoint(-6.0F, -2.7511F, -8.4674F);
        this.hips.addChild(backPlates6);
        this.setRotateAngle(backPlates6, 0.0F, 0.2618F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -9.3F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0437F, -0.0436F, -0.0019F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 1.4F, -4.9F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 68, 0.0F, 0.5082F, -0.2785F, 1, 1, 7, -0.2F, false));

        this.osteoderms5 = new ModelRenderer(this);
        this.osteoderms5.setRotationPoint(3.0F, 0.0577F, -4.6722F);
        this.body.addChild(osteoderms5);
        this.setRotateAngle(osteoderms5, -0.1309F, 0.0F, 0.0F);


        this.osteoderms17 = new ModelRenderer(this);
        this.osteoderms17.setRotationPoint(-3.0F, 0.0577F, -4.6722F);
        this.body.addChild(osteoderms17);
        this.setRotateAngle(osteoderms17, -0.1309F, 0.0F, 0.0F);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.7F, -6.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0436F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0354F, 3.6035F, -6.5138F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3665F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 86, 55, -2.5354F, 0.0838F, -0.5409F, 1, 1, 4, -0.2F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(2.0354F, 3.6035F, -6.5138F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2793F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -2.5354F, -0.1794F, 3.0144F, 1, 1, 5, -0.2F, false));

        this.backPlates = new ModelRenderer(this);
        this.backPlates.setRotationPoint(5.0293F, 5.0998F, -7.1849F);
        this.chest.addChild(backPlates);
        this.setRotateAngle(backPlates, 0.0F, 0.0349F, -0.0015F);


        this.backPlates4 = new ModelRenderer(this);
        this.backPlates4.setRotationPoint(-5.0293F, 5.0998F, -7.1849F);
        this.chest.addChild(backPlates4);
        this.setRotateAngle(backPlates4, 0.0F, -0.0349F, 0.0015F);


        this.osteoderms4 = new ModelRenderer(this);
        this.osteoderms4.setRotationPoint(2.0F, 0.5886F, -6.9554F);
        this.chest.addChild(osteoderms4);
        this.setRotateAngle(osteoderms4, 0.1745F, 0.0F, 0.0F);


        this.osteoderms16 = new ModelRenderer(this);
        this.osteoderms16.setRotationPoint(-2.0F, 0.5886F, -6.9554F);
        this.chest.addChild(osteoderms16);
        this.setRotateAngle(osteoderms16, 0.1745F, 0.0F, 0.0F);


        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(5.3F, 7.5669F, -6.0334F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.0523F, -0.0008F, -0.2182F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.6479F, 5.0571F, 2.3001F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.7904F, -0.7781F, 1.3773F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(-0.2181F, 5.8808F, -2.9354F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.9791F, 0.5331F, -0.7742F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-5.3F, 7.5669F, -6.0334F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.5149F, 0.0008F, 0.2182F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.6479F, 5.0571F, 2.3001F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.7904F, 0.7781F, -1.3773F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(0.2181F, 5.8808F, -2.9354F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.5515F, -0.9369F, 0.7112F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 3.8F, -6.8F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, -0.0361F, -0.2616F, 0.0094F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 82, 0.0F, -0.1F, -4.4F, 1, 1, 5, -0.2F, false));

        this.osteoderms3 = new ModelRenderer(this);
        this.osteoderms3.setRotationPoint(2.1F, -2.2664F, -3.3527F);
        this.neck3.addChild(osteoderms3);
        this.setRotateAngle(osteoderms3, 0.0F, 0.1396F, 0.0F);


        this.osteoderms15 = new ModelRenderer(this);
        this.osteoderms15.setRotationPoint(-2.1F, -2.2664F, -3.3527F);
        this.neck3.addChild(osteoderms15);
        this.setRotateAngle(osteoderms15, 0.0F, -0.1396F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -3.7F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.0076F, -0.0438F, 0.0426F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.0F, -0.3F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 19, 84, 0.0F, 0.1F, -3.6F, 1, 1, 4, -0.2F, false));

        this.osteoderms2 = new ModelRenderer(this);
        this.osteoderms2.setRotationPoint(2.0F, -2.7664F, -2.2484F);
        this.neck2.addChild(osteoderms2);


        this.osteoderms14 = new ModelRenderer(this);
        this.osteoderms14.setRotationPoint(-2.0F, -2.7664F, -2.2484F);
        this.neck2.addChild(osteoderms14);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.4F, -3.5F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0F, -0.2182F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -0.5F, -3.9F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0524F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 80, 57, 0.0F, 0.4781F, -0.0075F, 1, 1, 4, -0.2F, false));

        this.osteoderms = new ModelRenderer(this);
        this.osteoderms.setRotationPoint(1.6F, -1.3664F, -1.3484F);
        this.neck.addChild(osteoderms);


        this.osteoderms13 = new ModelRenderer(this);
        this.osteoderms13.setRotationPoint(-1.6F, -1.3664F, -1.3484F);
        this.neck.addChild(osteoderms13);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.4258F, -3.8931F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1816F, -0.1935F, -0.0988F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(1.1764F, -0.524F, -1.7014F);
        this.head.addChild(bone);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.5F, 0.2594F, -5.524F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.5F, 0.2594F, -5.524F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.3F, 1.3117F, -0.1904F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3578F, 0.0F, 0.0F);


        this.backPlates2 = new ModelRenderer(this);
        this.backPlates2.setRotationPoint(9.7F, 4.5F, 0.9021F);
        this.body.addChild(backPlates2);
        this.setRotateAngle(backPlates2, -0.1586F, 0.4921F, -0.0754F);


        this.backPlates5 = new ModelRenderer(this);
        this.backPlates5.setRotationPoint(-9.7F, 4.5F, 0.9021F);
        this.body.addChild(backPlates5);
        this.setRotateAngle(backPlates5, -0.1586F, -0.4921F, 0.0754F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.7F, 3.1F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.3583F, 0.0665F, -0.0714F);
        this.tail.cubeList.add(new ModelBox(tail, 69, 48, -0.5F, 0.0F, 0.0F, 1, 1, 7, -0.2F, false));

        this.osteoderms12 = new ModelRenderer(this);
        this.osteoderms12.setRotationPoint(2.1F, -1.4664F, 9.4473F);
        this.tail.addChild(osteoderms12);
        this.setRotateAngle(osteoderms12, 0.0F, 0.1396F, 0.0F);


        this.osteoderms19 = new ModelRenderer(this);
        this.osteoderms19.setRotationPoint(-2.1F, -1.4664F, 9.4473F);
        this.tail.addChild(osteoderms19);
        this.setRotateAngle(osteoderms19, 0.0F, -0.1396F, 0.0F);


        this.osteoderms7 = new ModelRenderer(this);
        this.osteoderms7.setRotationPoint(-2.8F, -2.4926F, 1.8292F);
        this.tail.addChild(osteoderms7);
        this.setRotateAngle(osteoderms7, -0.4189F, 0.0F, 0.0F);


        this.osteoderms20 = new ModelRenderer(this);
        this.osteoderms20.setRotationPoint(2.8F, -2.4926F, 1.8292F);
        this.tail.addChild(osteoderms20);
        this.setRotateAngle(osteoderms20, -0.4189F, 0.0F, 0.0F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0651F, 0.1771F, -0.0319F);
        this.tail2.cubeList.add(new ModelBox(tail2, 57, 60, -0.5F, 0.0F, -0.6F, 1, 1, 9, -0.2F, false));

        this.osteoderms8 = new ModelRenderer(this);
        this.osteoderms8.setRotationPoint(-0.8F, -5.1843F, 3.7194F);
        this.tail2.addChild(osteoderms8);
        this.setRotateAngle(osteoderms8, -0.3491F, 0.0F, 0.0F);


        this.osteoderms21 = new ModelRenderer(this);
        this.osteoderms21.setRotationPoint(0.8F, -5.1843F, 3.7194F);
        this.tail2.addChild(osteoderms21);
        this.setRotateAngle(osteoderms21, -0.3491F, 0.0F, 0.0F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1311F, 0.2345F, -0.0982F);
        this.tail3.cubeList.add(new ModelBox(tail3, 14, 55, -0.5F, 0.0F, 0.0F, 1, 1, 9, -0.2F, false));

        this.osteoderms9 = new ModelRenderer(this);
        this.osteoderms9.setRotationPoint(-2.8F, -5.0423F, 4.1522F);
        this.tail3.addChild(osteoderms9);
        this.setRotateAngle(osteoderms9, -0.3491F, 0.0F, 0.0F);


        this.osteoderms22 = new ModelRenderer(this);
        this.osteoderms22.setRotationPoint(2.8F, -5.0423F, 4.1522F);
        this.tail3.addChild(osteoderms22);
        this.setRotateAngle(osteoderms22, -0.3491F, 0.0F, 0.0F);


        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1046F, 0.3188F, -0.0926F);
        this.tail4.cubeList.add(new ModelBox(tail4, 26, 57, -0.5F, 0.0F, -0.4F, 1, 1, 9, -0.2F, false));

        this.osteoderms10 = new ModelRenderer(this);
        this.osteoderms10.setRotationPoint(-2.8F, -1.2732F, 0.8416F);
        this.tail4.addChild(osteoderms10);
        this.setRotateAngle(osteoderms10, -0.4014F, 0.0F, 0.0F);


        this.osteoderms23 = new ModelRenderer(this);
        this.osteoderms23.setRotationPoint(2.8F, -1.2732F, 0.8416F);
        this.tail4.addChild(osteoderms23);
        this.setRotateAngle(osteoderms23, -0.4014F, 0.0F, 0.0F);


        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0262F, 8.9999F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0248F, 0.2696F, -0.162F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 16, -0.5F, -0.1157F, -0.8994F, 1, 1, 14, -0.2F, false));

        this.osteoderms11 = new ModelRenderer(this);
        this.osteoderms11.setRotationPoint(0.2F, -0.2996F, 0.7751F);
        this.tail5.addChild(osteoderms11);
        this.setRotateAngle(osteoderms11, -0.5062F, 0.0153F, -0.0085F);


        this.osteoderms24 = new ModelRenderer(this);
        this.osteoderms24.setRotationPoint(-0.2F, -0.2996F, 0.7751F);
        this.tail5.addChild(osteoderms24);
        this.setRotateAngle(osteoderms24, -0.5062F, -0.0153F, 0.0085F);

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
