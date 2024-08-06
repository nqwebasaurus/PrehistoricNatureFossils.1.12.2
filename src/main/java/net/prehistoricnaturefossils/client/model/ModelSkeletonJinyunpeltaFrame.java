package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonJinyunpeltaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer osteoderms5;
    private final ModelRenderer osteoderms12;
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
    private final ModelRenderer osteoderms11;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer osteoderms3;
    private final ModelRenderer osteoderms10;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r7;
    private final ModelRenderer osteoderms2;
    private final ModelRenderer osteoderms9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer osteoderms;
    private final ModelRenderer osteoderms15;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r9;
    private final ModelRenderer osteoderms6;
    private final ModelRenderer osteoderms13;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer osteoderms7;
    private final ModelRenderer osteoderms14;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer osteoderms8;
    private final ModelRenderer leftClub;
    private final ModelRenderer rightClub;

    public ModelSkeletonJinyunpeltaFrame() {
        this.textureWidth = 87;
        this.textureHeight = 87;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -8.9F, 5.0F, 1, 9, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -10.5F, 5.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 2.9F, -5.5F, -0.5F, 1, 10, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -7.3F, -7.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0524F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 2.7F, -5.5F, -0.5F, 1, 11, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -7.3F, -7.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0524F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.6F, -0.7F, -0.5F, 1, 8, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -8.339F, 5.1542F);
        this.fossil.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.711F, -3.6542F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 30, -0.5F, 0.6022F, 1.0074F, 1, 1, 6, -0.15F, false));

        this.osteoderms5 = new ModelRenderer(this);
        this.osteoderms5.setRotationPoint(5.6838F, -0.785F, 2.1713F);
        this.hips.addChild(osteoderms5);


        this.osteoderms12 = new ModelRenderer(this);
        this.osteoderms12.setRotationPoint(-5.6838F, -0.785F, 2.1713F);
        this.hips.addChild(osteoderms12);


        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(4.2F, 1.1423F, 0.3664F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.3229F, 0.0F, 0.0F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(1.0F, 5.5F, -2.9764F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 1.1257F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 5.0246F, 3.5116F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.7854F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 1.6F, -1.2F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.0436F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-4.2F, 1.1423F, 0.3664F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.3229F, 0.0F, 0.0F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-1.0F, 5.5F, -2.9764F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 1.1694F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 5.0246F, 3.5116F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.7418F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 1.6F, -1.2F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.0436F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.161F, -2.6542F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0436F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 8, -0.5F, 0.15F, -5.7F, 1, 1, 6, -0.15F, false));

        this.osteoderms4 = new ModelRenderer(this);
        this.osteoderms4.setRotationPoint(6.05F, 0.25F, -2.5F);
        this.body.addChild(osteoderms4);


        this.osteoderms11 = new ModelRenderer(this);
        this.osteoderms11.setRotationPoint(-6.05F, 0.25F, -2.5F);
        this.body.addChild(osteoderms11);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.229F, -5.9756F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.2096F, 0.0433F, 0.0053F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.2183F, -4.7956F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 33, -0.5F, 0.7F, 0.2F, 1, 1, 5, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.929F, -7.7244F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2007F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 50, 0.5F, 0.6389F, 0.5073F, 1, 1, 3, -0.15F, false));

        this.osteoderms3 = new ModelRenderer(this);
        this.osteoderms3.setRotationPoint(4.9F, 0.9346F, -6.1149F);
        this.chest.addChild(osteoderms3);


        this.osteoderms10 = new ModelRenderer(this);
        this.osteoderms10.setRotationPoint(-4.9F, 0.9346F, -6.1149F);
        this.chest.addChild(osteoderms10);


        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(4.9F, 4.4941F, -4.6684F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.3971F, 0.0338F, -0.0021F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.2329F, 5.0076F, 2.9787F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.4835F, 0.0F, 0.0F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(0.0F, 4.5076F, -1.5054F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.8727F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-4.9F, 4.4941F, -4.6684F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.0917F, -0.0338F, 0.0021F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.2329F, 5.0076F, 2.9787F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.5272F, 0.0F, 0.0F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(0.0F, 4.5076F, -1.5054F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 1.2654F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.4324F, -7.4065F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.2366F, 0.1436F, 0.1062F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -0.0773F, -4.6661F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 48, 14, 0.5F, -0.4F, 1.4F, 1, 1, 4, -0.15F, false));

        this.osteoderms2 = new ModelRenderer(this);
        this.osteoderms2.setRotationPoint(3.6213F, 1.1779F, -1.0912F);
        this.neck.addChild(osteoderms2);
        this.setRotateAngle(osteoderms2, 0.0F, 0.2443F, 0.0F);


        this.osteoderms9 = new ModelRenderer(this);
        this.osteoderms9.setRotationPoint(-3.6213F, 1.1779F, -1.0912F);
        this.neck.addChild(osteoderms9);
        this.setRotateAngle(osteoderms9, 0.0F, -0.2443F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.4774F, -2.6205F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0F, 0.1745F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.4001F, -1.0456F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 65, 0.0F, -0.2F, -1.2F, 1, 1, 2, -0.15F, false));

        this.osteoderms = new ModelRenderer(this);
        this.osteoderms.setRotationPoint(2.4205F, 0.8319F, -0.5879F);
        this.neck2.addChild(osteoderms);


        this.osteoderms15 = new ModelRenderer(this);
        this.osteoderms15.setRotationPoint(-2.4205F, 0.8319F, -0.5879F);
        this.neck2.addChild(osteoderms15);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0003F, -1.9904F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.1507F, 0.1637F, -0.2429F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0117F, -0.1904F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.096F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4585F, 3.0952F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1656F, -0.2182F, -0.0019F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.1016F, 0.0506F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2443F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 19, 0.0F, 0.3975F, -0.0872F, 1, 1, 9, -0.15F, false));

        this.osteoderms6 = new ModelRenderer(this);
        this.osteoderms6.setRotationPoint(1.0F, -0.5526F, 1.929F);
        this.tail.addChild(osteoderms6);


        this.osteoderms13 = new ModelRenderer(this);
        this.osteoderms13.setRotationPoint(-1.0F, -0.5526F, 1.929F);
        this.tail.addChild(osteoderms13);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 2.247F, 8.5411F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1003F, -0.2948F, 0.1283F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.5486F, 0.3095F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1222F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 0, -0.5F, 0.774F, -0.5254F, 1, 1, 11, -0.15F, false));

        this.osteoderms7 = new ModelRenderer(this);
        this.osteoderms7.setRotationPoint(1.5629F, 0.5115F, 1.422F);
        this.tail2.addChild(osteoderms7);


        this.osteoderms14 = new ModelRenderer(this);
        this.osteoderms14.setRotationPoint(-1.5629F, 0.5115F, 1.422F);
        this.tail2.addChild(osteoderms14);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.0755F, 10.539F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1218F, -0.5561F, 0.2931F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.9838F, 0.0975F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.5F, -0.6174F, -0.7407F, 1, 1, 17, -0.15F, false));

        this.osteoderms8 = new ModelRenderer(this);
        this.osteoderms8.setRotationPoint(-1.0F, -0.5162F, 11.4975F);
        this.tail3.addChild(osteoderms8);


        this.leftClub = new ModelRenderer(this);
        this.leftClub.setRotationPoint(1.9731F, -1.6211F, 1.2527F);
        this.osteoderms8.addChild(leftClub);


        this.rightClub = new ModelRenderer(this);
        this.rightClub.setRotationPoint(0.0269F, -1.6211F, 1.2527F);
        this.osteoderms8.addChild(rightClub);

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
