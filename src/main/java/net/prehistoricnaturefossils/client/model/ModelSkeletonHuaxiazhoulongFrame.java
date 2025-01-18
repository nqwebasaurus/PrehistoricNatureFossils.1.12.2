package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHuaxiazhoulongFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer osteoderms5;
    private final ModelRenderer osteoderms14;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer leftfoot;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer rightfoot;
    private final ModelRenderer body;
    private final ModelRenderer osteoderms4;
    private final ModelRenderer osteoderms15;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer osteoderms3;
    private final ModelRenderer osteoderms16;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer lefthand2;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer righthand2;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r7;
    private final ModelRenderer osteoderms2;
    private final ModelRenderer osteoderms11;
    private final ModelRenderer osteoderms9;
    private final ModelRenderer osteoderms17;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer osteoderms;
    private final ModelRenderer osteoderms10;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r9;
    private final ModelRenderer osteoderms6;
    private final ModelRenderer osteoderms13;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer osteoderms7;
    private final ModelRenderer osteoderms12;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer osteoderms8;
    private final ModelRenderer leftClub2;
    private final ModelRenderer rightClub2;

    public ModelSkeletonHuaxiazhoulongFrame() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -14.0F, 9.3F, 1, 14, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5F, -12.5F, 9.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 0.8F, -6.5F, -0.5F, 1, 10, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.5F, -10.5F, -8.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1571F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -2.5F, -5.5F, -0.5F, 1, 11, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, -10.5F, -8.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1571F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, -0.2F, -1.5F, -0.5F, 1, 12, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -13.639F, 9.5542F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.0175F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.711F, -3.6542F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 32, -0.5F, 0.6022F, 0.9074F, 1, 1, 6, -0.15F, false));

        this.osteoderms5 = new ModelRenderer(this);
        this.osteoderms5.setRotationPoint(5.6838F, -1.785F, 2.1713F);
        this.hips.addChild(osteoderms5);


        this.osteoderms14 = new ModelRenderer(this);
        this.osteoderms14.setRotationPoint(-5.6838F, -1.785F, 2.1713F);
        this.hips.addChild(osteoderms14);


        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(4.2F, -0.5626F, 0.0961F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.637F, 0.0F, 0.0F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(1.0F, 7.1108F, -2.6201F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, -0.2443F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 4.7943F, 2.821F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.2007F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 1.6F, -1.2F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.0F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-4.2F, -0.5626F, 0.0961F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.0698F, 0.0F, 0.0F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-1.0F, 7.1108F, -2.6201F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.0611F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 4.7943F, 2.821F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.2007F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 1.6F, -1.2F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.2618F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.161F, -2.6542F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0964F, -0.0869F, -0.0084F);
        this.body.cubeList.add(new ModelBox(body, 21, 13, -0.5F, 0.15F, -8.0F, 1, 1, 8, -0.15F, false));

        this.osteoderms4 = new ModelRenderer(this);
        this.osteoderms4.setRotationPoint(6.05F, 0.25F, -2.5F);
        this.body.addChild(osteoderms4);


        this.osteoderms15 = new ModelRenderer(this);
        this.osteoderms15.setRotationPoint(-6.05F, 0.25F, -2.5F);
        this.body.addChild(osteoderms15);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.129F, -8.0756F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0349F, -0.0436F, -0.0015F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.1799F, -5.8949F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 31, -0.5F, 0.7F, -0.5F, 1, 1, 7, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.8906F, -8.8237F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2007F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 53, 21, 0.5F, 0.5389F, -0.2927F, 1, 1, 3, -0.15F, false));

        this.osteoderms3 = new ModelRenderer(this);
        this.osteoderms3.setRotationPoint(4.9F, 0.5843F, -8.1852F);
        this.chest.addChild(osteoderms3);


        this.osteoderms16 = new ModelRenderer(this);
        this.osteoderms16.setRotationPoint(-4.9F, 0.5843F, -8.1852F);
        this.chest.addChild(osteoderms16);


        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(5.7F, 4.1161F, -8.7485F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.0044F, 0.0338F, -0.0021F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.2329F, 3.724F, 3.9546F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.1309F, 0.0F, 0.0F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(0.0F, 5.5121F, -1.474F);
        this.leftarm2.addChild(lefthand);


        this.lefthand2 = new ModelRenderer(this);
        this.lefthand2.setRotationPoint(-0.5F, 4.5207F, -1.6045F);
        this.leftarm2.addChild(lefthand2);
        this.setRotateAngle(lefthand2, 0.1309F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-5.7F, 4.1161F, -8.7485F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.4756F, -0.0338F, 0.0021F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.2329F, 3.724F, 3.9546F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.2182F, 0.0F, 0.0F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(0.0F, 5.5121F, -1.474F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.6109F, 0.0F, 0.0F);


        this.righthand2 = new ModelRenderer(this);
        this.righthand2.setRotationPoint(0.5F, 4.5207F, -1.6045F);
        this.rightarm2.addChild(righthand2);
        this.setRotateAngle(righthand2, 0.1309F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.394F, -8.7058F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.0793F, -0.1672F, -0.1008F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -0.0616F, -4.4668F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 16, 0.5F, -0.4F, -0.4F, 1, 1, 5, -0.15F, false));

        this.osteoderms2 = new ModelRenderer(this);
        this.osteoderms2.setRotationPoint(2.8471F, 0.9936F, -3.9968F);
        this.neck.addChild(osteoderms2);
        this.setRotateAngle(osteoderms2, 0.0F, 0.2443F, 0.0F);


        this.osteoderms11 = new ModelRenderer(this);
        this.osteoderms11.setRotationPoint(-2.8471F, 0.9936F, -3.9968F);
        this.neck.addChild(osteoderms11);
        this.setRotateAngle(osteoderms11, 0.0F, -0.2443F, 0.0F);


        this.osteoderms9 = new ModelRenderer(this);
        this.osteoderms9.setRotationPoint(3.6213F, 0.6936F, -0.8918F);
        this.neck.addChild(osteoderms9);
        this.setRotateAngle(osteoderms9, 0.0F, 0.2443F, 0.0F);


        this.osteoderms17 = new ModelRenderer(this);
        this.osteoderms17.setRotationPoint(-3.6213F, 0.6936F, -0.8918F);
        this.neck.addChild(osteoderms17);
        this.setRotateAngle(osteoderms17, 0.0F, -0.2443F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.4617F, -4.7211F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1757F, -0.144F, -0.0631F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.0233F, -2.5398F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 33, 45, 0.0F, -0.3F, -1.1F, 1, 1, 4, -0.15F, false));

        this.osteoderms = new ModelRenderer(this);
        this.osteoderms.setRotationPoint(2.4205F, 0.4551F, -2.0821F);
        this.neck2.addChild(osteoderms);


        this.osteoderms10 = new ModelRenderer(this);
        this.osteoderms10.setRotationPoint(-2.4205F, 0.4551F, -2.0821F);
        this.neck2.addChild(osteoderms10);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3771F, -4.0846F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.0219F, -0.2279F, -0.208F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.9698F, 0.4081F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4887F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4585F, 3.0952F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.1416F, 0.1732F, 0.0188F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.1016F, 0.0506F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2443F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, -2, 22, 0.0F, 0.3975F, -0.4872F, 1, 1, 8, -0.15F, false));

        this.osteoderms6 = new ModelRenderer(this);
        this.osteoderms6.setRotationPoint(1.0F, -0.5526F, 1.929F);
        this.tail.addChild(osteoderms6);


        this.osteoderms13 = new ModelRenderer(this);
        this.osteoderms13.setRotationPoint(-1.0F, -0.5526F, 1.929F);
        this.tail.addChild(osteoderms13);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.747F, 6.8411F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1776F, 0.2608F, 0.0233F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.5486F, 0.3095F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1222F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 13, -0.5F, 0.774F, -0.4254F, 1, 1, 9, -0.15F, false));

        this.osteoderms7 = new ModelRenderer(this);
        this.osteoderms7.setRotationPoint(1.5629F, 0.5115F, 1.422F);
        this.tail2.addChild(osteoderms7);


        this.osteoderms12 = new ModelRenderer(this);
        this.osteoderms12.setRotationPoint(-1.5629F, 0.5115F, 1.422F);
        this.tail2.addChild(osteoderms12);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.7755F, 8.539F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0256F, 0.2618F, -0.0047F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.9838F, 0.0975F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.5F, -0.5174F, -0.4407F, 1, 1, 11, -0.15F, false));

        this.osteoderms8 = new ModelRenderer(this);
        this.osteoderms8.setRotationPoint(-1.0F, -0.5162F, 11.4975F);
        this.tail3.addChild(osteoderms8);


        this.leftClub2 = new ModelRenderer(this);
        this.leftClub2.setRotationPoint(1.9731F, -1.2702F, -1.8274F);
        this.osteoderms8.addChild(leftClub2);


        this.rightClub2 = new ModelRenderer(this);
        this.rightClub2.setRotationPoint(0.0269F, -1.2702F, -1.8274F);
        this.osteoderms8.addChild(rightClub2);

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
