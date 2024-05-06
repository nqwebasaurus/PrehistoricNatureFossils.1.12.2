package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonWaptia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer base2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body5;
    private final ModelRenderer cube_r4;
    private final ModelRenderer rightgill7;
    private final ModelRenderer leftgill3;
    private final ModelRenderer rightgill8;
    private final ModelRenderer leftgill8;
    private final ModelRenderer rightgill9;
    private final ModelRenderer leftgill9;
    private final ModelRenderer rightgill10;
    private final ModelRenderer leftgill10;
    private final ModelRenderer rightgill11;
    private final ModelRenderer leftgill11;
    private final ModelRenderer rightgill12;
    private final ModelRenderer leftgill12;
    private final ModelRenderer body6;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body7;
    private final ModelRenderer cube_r7;
    private final ModelRenderer body8;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leftleg6;
    private final ModelRenderer leftleg7;
    private final ModelRenderer leftleg8;
    private final ModelRenderer leftleg9;
    private final ModelRenderer leftleg10;
    private final ModelRenderer rightantenna2;
    private final ModelRenderer leftantenna2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer carapace2;
    private final ModelRenderer cube_r12;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer base;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer body1;
    private final ModelRenderer cube_r19;
    private final ModelRenderer rightgill1;
    private final ModelRenderer leftgill1;
    private final ModelRenderer rightgill2;
    private final ModelRenderer leftgill2;
    private final ModelRenderer rightgill3;
    private final ModelRenderer leftgill7;
    private final ModelRenderer rightgill4;
    private final ModelRenderer leftgill4;
    private final ModelRenderer rightgill5;
    private final ModelRenderer leftgill5;
    private final ModelRenderer rightgill6;
    private final ModelRenderer leftgill6;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r22;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer leftleg1;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer leftleg4;
    private final ModelRenderer leftleg5;
    private final ModelRenderer rightantenna;
    private final ModelRenderer leftantenna;
    private final ModelRenderer cube_r26;
    private final ModelRenderer carapace;
    private final ModelRenderer cube_r27;

    public ModelSkeletonWaptia() {
        this.textureWidth = 128;
        this.textureHeight = 77;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.base2 = new ModelRenderer(this);
        this.base2.setRotationPoint(9.8205F, -2.25F, 0.8935F);
        this.fossil.addChild(base2);
        this.setRotateAngle(base2, -0.1745F, 0.0F, -1.5708F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.025F, -0.0897F, -1.3613F);
        this.base2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -3.1416F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.1897F, 0.6387F);
        this.base2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -3.1416F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 6, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.025F, 0.2793F, 0.7226F);
        this.base2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, -3.1416F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 19, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.7151F, 3.7685F);
        this.base2.addChild(body5);
        this.setRotateAngle(body5, -0.3054F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body5.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -3.1416F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.rightgill7 = new ModelRenderer(this);
        this.rightgill7.setRotationPoint(-2.0F, -7.8175F, -18.7989F);
        this.body5.addChild(rightgill7);
        this.setRotateAngle(rightgill7, 0.0F, 0.1745F, -0.6981F);


        this.leftgill3 = new ModelRenderer(this);
        this.leftgill3.setRotationPoint(0.0F, -7.8175F, -18.7989F);
        this.body5.addChild(leftgill3);
        this.setRotateAngle(leftgill3, 0.0F, -0.1745F, 1.5708F);
        this.leftgill3.cubeList.add(new ModelBox(leftgill3, 0, 28, 11.6874F, -0.0076F, 15.255F, 3, 0, 2, 0.0F, false));

        this.rightgill8 = new ModelRenderer(this);
        this.rightgill8.setRotationPoint(-2.0F, -7.8175F, -18.2989F);
        this.body5.addChild(rightgill8);
        this.setRotateAngle(rightgill8, 0.0F, 0.3054F, -0.7854F);


        this.leftgill8 = new ModelRenderer(this);
        this.leftgill8.setRotationPoint(0.0F, -7.8175F, -18.2989F);
        this.body5.addChild(leftgill8);
        this.setRotateAngle(leftgill8, 0.0F, -0.3054F, 1.5708F);


        this.rightgill9 = new ModelRenderer(this);
        this.rightgill9.setRotationPoint(-2.0F, -7.8175F, -17.5489F);
        this.body5.addChild(rightgill9);
        this.setRotateAngle(rightgill9, 0.0F, 0.48F, -0.829F);


        this.leftgill9 = new ModelRenderer(this);
        this.leftgill9.setRotationPoint(0.0F, -7.8175F, -17.5489F);
        this.body5.addChild(leftgill9);
        this.setRotateAngle(leftgill9, 0.0F, -0.48F, 1.5708F);
        this.leftgill9.cubeList.add(new ModelBox(leftgill9, 8, 38, 15.8089F, 0.0F, 11.0229F, 3, 0, 1, 0.0F, false));

        this.rightgill10 = new ModelRenderer(this);
        this.rightgill10.setRotationPoint(-2.0F, -7.8175F, -16.7989F);
        this.body5.addChild(rightgill10);
        this.setRotateAngle(rightgill10, 0.0F, 0.4363F, -0.8727F);


        this.leftgill10 = new ModelRenderer(this);
        this.leftgill10.setRotationPoint(0.0F, -7.8175F, -16.7989F);
        this.body5.addChild(leftgill10);
        this.setRotateAngle(leftgill10, 0.0F, -0.4363F, 1.5708F);
        this.leftgill10.cubeList.add(new ModelBox(leftgill10, 0, 37, 14.8022F, 0.0124F, 11.7017F, 3, 0, 1, 0.0F, false));

        this.rightgill11 = new ModelRenderer(this);
        this.rightgill11.setRotationPoint(-2.0F, -7.8175F, -16.2989F);
        this.body5.addChild(rightgill11);
        this.setRotateAngle(rightgill11, 0.0F, 0.4363F, -0.9163F);


        this.leftgill11 = new ModelRenderer(this);
        this.leftgill11.setRotationPoint(0.0F, -7.8175F, -16.2989F);
        this.body5.addChild(leftgill11);
        this.setRotateAngle(leftgill11, 0.0F, -0.4363F, 1.5708F);
        this.leftgill11.cubeList.add(new ModelBox(leftgill11, 18, 19, 15.3022F, 0.0F, 11.7017F, 2, 0, 1, 0.0F, false));

        this.rightgill12 = new ModelRenderer(this);
        this.rightgill12.setRotationPoint(-2.0F, -7.8175F, -15.7989F);
        this.body5.addChild(rightgill12);
        this.setRotateAngle(rightgill12, 0.0F, 0.6109F, -0.9599F);


        this.leftgill12 = new ModelRenderer(this);
        this.leftgill12.setRotationPoint(0.0F, -7.8175F, -15.7989F);
        this.body5.addChild(leftgill12);
        this.setRotateAngle(leftgill12, 0.0F, -0.6109F, 1.5708F);
        this.leftgill12.cubeList.add(new ModelBox(leftgill12, 12, 5, 16.6451F, 0.0124F, 8.7129F, 2, 0, 1, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0125F, 0.1376F, 1.1058F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.3491F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0125F, -0.7011F, 1.4306F);
        this.body6.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -3.1416F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 32, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.0125F, -0.2011F, 1.4306F);
        this.body6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 33, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.body7 = new ModelRenderer(this);
        this.body7.setRotationPoint(-0.0125F, -0.188F, 2.7901F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, 0.0873F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.1926F, 1.2601F);
        this.body7.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 31, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.body8 = new ModelRenderer(this);
        this.body8.setRotationPoint(0.0025F, -0.2825F, 2.6774F);
        this.body7.addChild(body8);
        this.setRotateAngle(body8, -0.0055F, -0.1761F, 1.4951F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.948F, 0.0968F, 4.0348F);
        this.body8.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0582F, 0.4372F, 0.0963F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 28, -0.5F, -0.15F, -1.5F, 1, 0, 3, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.8296F, -0.0866F, 3.996F);
        this.body8.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0121F, -0.4339F, 0.101F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 29, -0.5F, -0.075F, -1.5F, 1, 0, 3, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.063F, 0.0057F, -0.2351F);
        this.body8.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0131F, 0.0F, 0.0436F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 12, -0.5F, 0.0F, 0.1F, 1, 0, 3, 0.0F, false));

        this.leftleg6 = new ModelRenderer(this);
        this.leftleg6.setRotationPoint(0.8F, -12.9009F, -14.2081F);
        this.base2.addChild(leftleg6);
        this.setRotateAngle(leftleg6, 0.0F, 0.6981F, 1.5708F);
        this.leftleg6.cubeList.add(new ModelBox(leftleg6, 18, 21, 0.7763F, 0.8448F, 18.901F, 2, 0, 1, 0.0F, false));

        this.leftleg7 = new ModelRenderer(this);
        this.leftleg7.setRotationPoint(0.8F, -12.9009F, -13.7081F);
        this.base2.addChild(leftleg7);
        this.setRotateAngle(leftleg7, 0.0F, 0.6109F, 1.5708F);
        this.leftleg7.cubeList.add(new ModelBox(leftleg7, 0, 39, 2.2075F, 1.694F, 18.7411F, 3, 0, 1, 0.0F, false));

        this.leftleg8 = new ModelRenderer(this);
        this.leftleg8.setRotationPoint(0.8F, -12.9009F, -13.2081F);
        this.base2.addChild(leftleg8);
        this.setRotateAngle(leftleg8, 0.0F, 0.48F, 1.5708F);
        this.leftleg8.cubeList.add(new ModelBox(leftleg8, 12, 17, 4.4296F, 0.8448F, 18.1118F, 4, 0, 1, 0.0F, false));

        this.leftleg9 = new ModelRenderer(this);
        this.leftleg9.setRotationPoint(0.8F, -12.7509F, -12.7081F);
        this.base2.addChild(leftleg9);
        this.setRotateAngle(leftleg9, 0.0F, 0.4363F, 1.5708F);
        this.leftleg9.cubeList.add(new ModelBox(leftleg9, 0, 23, 5.7341F, 0.7448F, 17.8464F, 4, 0, 1, 0.0F, false));

        this.leftleg10 = new ModelRenderer(this);
        this.leftleg10.setRotationPoint(0.8F, -12.6509F, -12.0581F);
        this.base2.addChild(leftleg10);
        this.setRotateAngle(leftleg10, 0.0F, 0.3491F, 1.5708F);
        this.leftleg10.cubeList.add(new ModelBox(leftleg10, 12, 0, 6.8045F, 0.8448F, 17.2116F, 5, 0, 1, 0.0F, false));

        this.rightantenna2 = new ModelRenderer(this);
        this.rightantenna2.setRotationPoint(-0.35F, -13.8009F, -15.7081F);
        this.base2.addChild(rightantenna2);
        this.setRotateAngle(rightantenna2, 0.0436F, 0.2182F, -0.6109F);


        this.leftantenna2 = new ModelRenderer(this);
        this.leftantenna2.setRotationPoint(-0.8F, -13.8009F, -15.7081F);
        this.base2.addChild(leftantenna2);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftantenna2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 1.5708F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, 13.6113F, -0.75F, 9.3468F, 3, 0, 5, 0.0F, false));

        this.carapace2 = new ModelRenderer(this);
        this.carapace2.setRotationPoint(-0.75F, -14.4009F, -15.2081F);
        this.base2.addChild(carapace2);
        this.setRotateAngle(carapace2, 0.0843F, -0.0226F, 0.2608F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(1.4253F, 2.0886F, 3.0F);
        this.carapace2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 1.309F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 10, 12.7663F, 0.0F, 9.6078F, 4, 0, 6, 0.0F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, 16.0F, -2.0F, 16.475F, 2, 2, 7, -0.003F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 56, -13.0F, -2.0F, -20.0F, 18, 2, 12, -0.003F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -2.0F, -8.0F, 26, 2, 25, 0.006F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-8.0F, 0.0F, 17.0F);
        this.bone.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 1.309F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 28, 0.0F, -2.0F, 0.0F, 7, 2, 25, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-13.0F, 0.0F, -8.0F);
        this.bone.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -1.3526F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 40, 28, 0.0F, -2.0F, -12.0F, 25, 2, 12, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(5.0F, 0.0F, -21.0F);
        this.bone.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.7854F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 53, 44, 0.7F, -2.0F, 0.7F, 18, 2, 12, 0.003F, false));

        this.base = new ModelRenderer(this);
        this.base.setRotationPoint(-5.0F, -2.05F, -11.75F);
        this.fossil.addChild(base);
        this.setRotateAngle(base, 0.1745F, 0.0F, -1.5708F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.225F, -1.4F, -2.0F);
        this.base.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.2F, -1.5F, 0.0F);
        this.base.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -3.1416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 6, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.175F, -1.031F, 0.084F);
        this.base.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1309F, 0.0F, -3.1416F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 13, 19, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(-0.8F, -2.0F, 2.0F);
        this.base.addChild(body1);
        this.setRotateAngle(body1, -0.3054F, 0.0F, 0.0F);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, 1.0F, 1.5F);
        this.body1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -3.1416F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.rightgill1 = new ModelRenderer(this);
        this.rightgill1.setRotationPoint(-1.0F, 2.0F, 0.0F);
        this.body1.addChild(rightgill1);
        this.setRotateAngle(rightgill1, 0.0F, 0.1745F, -0.6981F);


        this.leftgill1 = new ModelRenderer(this);
        this.leftgill1.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.body1.addChild(leftgill1);
        this.setRotateAngle(leftgill1, 0.0F, -0.1745F, 1.5708F);
        this.leftgill1.cubeList.add(new ModelBox(leftgill1, 0, 28, 0.0F, 0.0F, -0.25F, 3, 0, 2, 0.0F, false));

        this.rightgill2 = new ModelRenderer(this);
        this.rightgill2.setRotationPoint(-1.0F, 2.0F, 0.5F);
        this.body1.addChild(rightgill2);
        this.setRotateAngle(rightgill2, 0.0F, 0.3054F, -0.7854F);


        this.leftgill2 = new ModelRenderer(this);
        this.leftgill2.setRotationPoint(1.0F, 2.0F, 0.5F);
        this.body1.addChild(leftgill2);
        this.setRotateAngle(leftgill2, 0.0F, -0.3054F, 1.5708F);


        this.rightgill3 = new ModelRenderer(this);
        this.rightgill3.setRotationPoint(-1.0F, 2.0F, 1.25F);
        this.body1.addChild(rightgill3);
        this.setRotateAngle(rightgill3, 0.0F, 0.48F, -0.829F);


        this.leftgill7 = new ModelRenderer(this);
        this.leftgill7.setRotationPoint(1.0F, 2.0F, 1.25F);
        this.body1.addChild(leftgill7);
        this.setRotateAngle(leftgill7, 0.0F, -0.48F, 1.5708F);
        this.leftgill7.cubeList.add(new ModelBox(leftgill7, 8, 38, 0.0F, 0.0F, -0.25F, 3, 0, 1, 0.0F, false));

        this.rightgill4 = new ModelRenderer(this);
        this.rightgill4.setRotationPoint(-1.0F, 2.0F, 2.0F);
        this.body1.addChild(rightgill4);
        this.setRotateAngle(rightgill4, 0.0F, 0.4363F, -0.8727F);


        this.leftgill4 = new ModelRenderer(this);
        this.leftgill4.setRotationPoint(1.0F, 2.0F, 2.0F);
        this.body1.addChild(leftgill4);
        this.setRotateAngle(leftgill4, 0.0F, -0.4363F, 1.5708F);
        this.leftgill4.cubeList.add(new ModelBox(leftgill4, 0, 37, -0.5F, -0.01F, -0.25F, 3, 0, 1, 0.0F, false));

        this.rightgill5 = new ModelRenderer(this);
        this.rightgill5.setRotationPoint(-1.0F, 2.0F, 2.5F);
        this.body1.addChild(rightgill5);
        this.setRotateAngle(rightgill5, 0.0F, 0.4363F, -0.9163F);


        this.leftgill5 = new ModelRenderer(this);
        this.leftgill5.setRotationPoint(1.0F, 2.0F, 2.5F);
        this.body1.addChild(leftgill5);
        this.setRotateAngle(leftgill5, 0.0F, -0.4363F, 1.5708F);
        this.leftgill5.cubeList.add(new ModelBox(leftgill5, 18, 19, 0.0F, 0.0F, -0.25F, 2, 0, 1, 0.0F, false));

        this.rightgill6 = new ModelRenderer(this);
        this.rightgill6.setRotationPoint(-1.0F, 2.0F, 3.0F);
        this.body1.addChild(rightgill6);
        this.setRotateAngle(rightgill6, 0.0F, 0.6109F, -0.9599F);


        this.leftgill6 = new ModelRenderer(this);
        this.leftgill6.setRotationPoint(1.0F, 2.0F, 3.0F);
        this.body1.addChild(leftgill6);
        this.setRotateAngle(leftgill6, 0.0F, -0.6109F, 1.5708F);
        this.leftgill6.cubeList.add(new ModelBox(leftgill6, 12, 5, -0.5F, 0.02F, -0.4F, 2, 0, 1, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.5F, 0.925F, 2.6F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, -0.3054F, 0.0F, 0.0F);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.525F, -0.5F, 1.5F);
        this.body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -3.1416F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 7, 32, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 0.0F, 1.5F);
        this.body2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -3.1416F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 14, 33, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.25F, 2.7F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.3491F, 0.0F, 0.0F);


        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 0.0F, 1.5F);
        this.body3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -3.1416F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 31, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.0453F, 0.478F, 1.4725F);


        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.body4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0436F, 0.4363F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 8, 28, -0.45F, -1.0F, 0.6F, 1, 0, 3, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.body4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.003F, -0.4346F, 0.0962F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 14, 29, -0.55F, -1.0F, 0.6F, 1, 0, 3, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.body4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.0436F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 15, 12, -0.5F, -1.5F, 4.75F, 1, 0, 3, 0.0F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.0F, -0.6F, -1.0F);
        this.base.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.0F, 0.6981F, 1.5708F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 18, 21, -0.75F, 0.8448F, -0.4554F, 2, 0, 1, 0.0F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(1.0F, -0.6F, -0.5F);
        this.base.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.0F, 0.6109F, 1.5708F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 39, -1.0F, 1.694F, -0.4086F, 3, 0, 1, 0.0F, false));

        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(1.0F, -0.6F, 0.0F);
        this.base.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.0F, 0.48F, 1.5708F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 12, 17, -1.25F, 0.8448F, -0.4554F, 4, 0, 1, 0.0F, false));

        this.leftleg4 = new ModelRenderer(this);
        this.leftleg4.setRotationPoint(1.0F, -0.45F, 0.5F);
        this.base.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.0F, 0.4363F, 1.5708F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 0, 23, -0.75F, 0.7448F, -0.4554F, 4, 0, 1, 0.0F, false));

        this.leftleg5 = new ModelRenderer(this);
        this.leftleg5.setRotationPoint(1.0F, -0.35F, 1.15F);
        this.base.addChild(leftleg5);
        this.setRotateAngle(leftleg5, 0.0F, 0.3491F, 1.5708F);
        this.leftleg5.cubeList.add(new ModelBox(leftleg5, 12, 0, -1.25F, 0.8448F, -0.4554F, 5, 0, 1, 0.0F, false));

        this.rightantenna = new ModelRenderer(this);
        this.rightantenna.setRotationPoint(-0.15F, -1.5F, -2.5F);
        this.base.addChild(rightantenna);
        this.setRotateAngle(rightantenna, 0.0436F, 0.2182F, -0.6109F);


        this.leftantenna = new ModelRenderer(this);
        this.leftantenna.setRotationPoint(-0.6F, -1.5F, -2.5F);
        this.base.addChild(leftantenna);


        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftantenna.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 1.5708F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 17, 0.0F, -0.75F, -4.5F, 3, 0, 5, 0.0F, false));

        this.carapace = new ModelRenderer(this);
        this.carapace.setRotationPoint(-0.55F, -2.1F, -2.0F);
        this.base.addChild(carapace);
        this.setRotateAngle(carapace, 0.0843F, -0.0226F, 0.2608F);


        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(1.4253F, 2.0886F, 3.0F);
        this.carapace.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 1.309F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 10, -2.0F, 0.0F, -3.0F, 4, 0, 6, 0.0F, false));

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
