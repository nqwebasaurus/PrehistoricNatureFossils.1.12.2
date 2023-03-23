package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMegalocephalus extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Bodyfront_r2;
    private final ModelRenderer Bodyfront_r3;
    private final ModelRenderer Bodyfront_r4;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodyfront_r5;
    private final ModelRenderer Bodyfront_r6;
    private final ModelRenderer Bodyfront_r7;
    private final ModelRenderer Bodyfront_r8;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r9;
    private final ModelRenderer Bodyfront_r10;
    private final ModelRenderer Bodyfront_r11;
    private final ModelRenderer Bodyfront_r12;
    private final ModelRenderer Bodyfront_r13;
    private final ModelRenderer Bodyfront_r14;
    private final ModelRenderer Neck;
    private final ModelRenderer Neck_r1;
    private final ModelRenderer Bodyfront_r15;
    private final ModelRenderer Bodyfront_r16;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjaw1;
    private final ModelRenderer Upperjaw2;
    private final ModelRenderer Upperteeth2;
    private final ModelRenderer Upperteeth1;
    private final ModelRenderer Lowerjaw1;
    private final ModelRenderer Lowerjaw2;
    private final ModelRenderer Lowerjaw3;
    private final ModelRenderer Lowerteeth2;
    private final ModelRenderer Lowerteeth1;
    private final ModelRenderer Throat;
    private final ModelRenderer Throat_r1;
    private final ModelRenderer Headslope1;
    private final ModelRenderer Headslope2;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail4_r1;
    private final ModelRenderer Tail3_r1;
    private final ModelRenderer Tail12_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail2_r1;
    private final ModelRenderer Tail8_r1;
    private final ModelRenderer Tail16_r1;
    private final ModelRenderer Tail4_r2;
    private final ModelRenderer Tail6_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail8_r2;
    private final ModelRenderer Tail3_r2;
    private final ModelRenderer Tail21_r1;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tail12_r2;
    private final ModelRenderer Tail25_r1;
    private final ModelRenderer Tail5;
    private final ModelRenderer Tail14_r1;
    private final ModelRenderer Tail26_r1;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonMegalocephalus() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 16.5F, -4.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.0637F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 28, -0.5F, -1.1003F, 6.9777F, 1, 1, 10, 0.002F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.8078F, 1.8719F, 13.8572F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1363F, 0.208F, 0.5539F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 8, -0.7959F, -0.156F, -1.9949F, 2, 1, 5, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0744F, -0.7348F, 12.6715F);
        this.Hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0475F, 0.0221F, 0.6103F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 17, -0.4712F, -0.302F, -0.4643F, 1, 4, 2, 0.0F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0744F, -0.7348F, 12.6715F);
        this.Hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0475F, -0.0221F, -0.6103F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 17, -0.5288F, -0.302F, -0.4643F, 1, 4, 2, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.8078F, 1.8719F, 13.8572F);
        this.Hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1363F, -0.208F, -0.5539F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, -1.2041F, -0.156F, -1.9949F, 2, 1, 5, 0.0F, false));

        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-0.5F, -0.5003F, 10.4777F);
        this.Hips.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0F, 0.0F, -0.8727F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 60, 31, -2.5867F, -1.2175F, -0.5F, 1, 0, 1, 0.0F, true));
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 61, 8, -2.5867F, -1.2175F, -2.5F, 1, 0, 1, 0.0F, true));

        this.Bodyfront_r2 = new ModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(-0.5F, -0.5003F, 10.4777F);
        this.Hips.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, 0.0F, 0.0F, -0.2182F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 46, 14, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.003F, true));
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 33, 52, -2.0F, 0.0F, -2.5F, 2, 0, 1, 0.003F, true));

        this.Bodyfront_r3 = new ModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(0.5F, -0.5003F, 10.4777F);
        this.Hips.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, 0.0F, 0.0F, 0.8727F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 60, 31, 1.5867F, -1.2175F, -0.5F, 1, 0, 1, 0.0F, false));
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 61, 8, 1.5867F, -1.2175F, -2.5F, 1, 0, 1, 0.0F, false));

        this.Bodyfront_r4 = new ModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(0.5F, -0.5003F, 10.4777F);
        this.Hips.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, 0.0F, 0.0F, 0.2182F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 46, 14, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.003F, false));
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 33, 52, 0.0F, 0.0F, -2.5F, 2, 0, 1, 0.003F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.6003F, 7.3777F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.0881F, 0.1308F, 0.0056F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -0.5F, -0.4955F, -14.3874F, 1, 1, 15, 0.0F, false));

        this.Bodyfront_r5 = new ModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(-0.5F, 0.1045F, -0.8874F);
        this.Bodymiddle.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, 0.0F, 0.0F, -0.8727F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 56, 46, -3.5867F, -1.2175F, -0.5F, 2, 0, 1, 0.0F, true));
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 0, 35, -4.5867F, -1.2175F, -2.5F, 3, 0, 1, 0.0F, true));
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 13, 35, -4.5867F, -1.2175F, -4.5F, 3, 0, 1, 0.0F, true));
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 39, 39, -4.5867F, -1.2175F, -6.5F, 3, 0, 1, 0.0F, true));
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 18, 42, -4.5867F, -1.2175F, -8.5F, 3, 0, 1, 0.0F, true));
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 48, 22, -4.5867F, -1.2175F, -10.5F, 3, 0, 1, 0.0F, true));
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 56, 18, -4.5867F, -1.2175F, -12.5F, 3, 0, 1, 0.0F, true));

        this.Bodyfront_r6 = new ModelRenderer(this);
        this.Bodyfront_r6.setRotationPoint(-0.5F, 0.1045F, -0.8874F);
        this.Bodymiddle.addChild(Bodyfront_r6);
        this.setRotateAngle(Bodyfront_r6, 0.0F, 0.0F, -0.2182F);
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 25, 57, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.003F, true));
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 57, 51, -2.0F, 0.0F, -2.5F, 2, 0, 1, 0.003F, true));
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 57, 53, -2.0F, 0.0F, -4.5F, 2, 0, 1, 0.003F, true));
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 24, 59, -2.0F, 0.0F, -6.5F, 2, 0, 1, 0.003F, true));
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 31, 59, -2.0F, 0.0F, -8.5F, 2, 0, 1, 0.003F, true));
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 38, 59, -2.0F, 0.0F, -10.5F, 2, 0, 1, 0.003F, true));
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 59, 44, -2.0F, 0.0F, -12.5F, 2, 0, 1, 0.003F, true));

        this.Bodyfront_r7 = new ModelRenderer(this);
        this.Bodyfront_r7.setRotationPoint(0.5F, 0.1045F, -0.8874F);
        this.Bodymiddle.addChild(Bodyfront_r7);
        this.setRotateAngle(Bodyfront_r7, 0.0F, 0.0F, 0.2182F);
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 25, 57, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.003F, false));
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 57, 51, 0.0F, 0.0F, -2.5F, 2, 0, 1, 0.003F, false));
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 57, 53, 0.0F, 0.0F, -4.5F, 2, 0, 1, 0.003F, false));
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 24, 59, 0.0F, 0.0F, -6.5F, 2, 0, 1, 0.003F, false));
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 31, 59, 0.0F, 0.0F, -8.5F, 2, 0, 1, 0.003F, false));
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 38, 59, 0.0F, 0.0F, -10.5F, 2, 0, 1, 0.003F, false));
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 59, 44, 0.0F, 0.0F, -12.5F, 2, 0, 1, 0.003F, false));

        this.Bodyfront_r8 = new ModelRenderer(this);
        this.Bodyfront_r8.setRotationPoint(0.5F, 0.1045F, -0.8874F);
        this.Bodymiddle.addChild(Bodyfront_r8);
        this.setRotateAngle(Bodyfront_r8, 0.0F, 0.0F, 0.8727F);
        this.Bodyfront_r8.cubeList.add(new ModelBox(Bodyfront_r8, 56, 46, 1.5867F, -1.2175F, -0.5F, 2, 0, 1, 0.0F, false));
        this.Bodyfront_r8.cubeList.add(new ModelBox(Bodyfront_r8, 0, 35, 1.5867F, -1.2175F, -2.5F, 3, 0, 1, 0.0F, false));
        this.Bodyfront_r8.cubeList.add(new ModelBox(Bodyfront_r8, 13, 35, 1.5867F, -1.2175F, -4.5F, 3, 0, 1, 0.0F, false));
        this.Bodyfront_r8.cubeList.add(new ModelBox(Bodyfront_r8, 39, 39, 1.5867F, -1.2175F, -6.5F, 3, 0, 1, 0.0F, false));
        this.Bodyfront_r8.cubeList.add(new ModelBox(Bodyfront_r8, 18, 42, 1.5867F, -1.2175F, -8.5F, 3, 0, 1, 0.0F, false));
        this.Bodyfront_r8.cubeList.add(new ModelBox(Bodyfront_r8, 48, 22, 1.5867F, -1.2175F, -10.5F, 3, 0, 1, 0.0F, false));
        this.Bodyfront_r8.cubeList.add(new ModelBox(Bodyfront_r8, 56, 18, 1.5867F, -1.2175F, -12.5F, 3, 0, 1, 0.0F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.0045F, -13.6874F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.1108F, -0.0435F, -0.0028F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 27, 33, -0.5F, -0.5123F, -8.6869F, 1, 1, 9, 0.003F, false));

        this.Bodyfront_r9 = new ModelRenderer(this);
        this.Bodyfront_r9.setRotationPoint(-1.0F, -0.1843F, -7.77F);
        this.Bodyfront.addChild(Bodyfront_r9);
        this.setRotateAngle(Bodyfront_r9, 0.937F, 0.2405F, 0.3135F);
        this.Bodyfront_r9.cubeList.add(new ModelBox(Bodyfront_r9, 43, 51, -2.2761F, 2.2F, -4.7173F, 4, 2, 1, 0.0F, true));
        this.Bodyfront_r9.cubeList.add(new ModelBox(Bodyfront_r9, 11, 42, -2.2761F, 2.2F, -3.7173F, 1, 1, 4, 0.0F, true));

        this.Bodyfront_r10 = new ModelRenderer(this);
        this.Bodyfront_r10.setRotationPoint(1.0F, -0.1843F, -7.77F);
        this.Bodyfront.addChild(Bodyfront_r10);
        this.setRotateAngle(Bodyfront_r10, 0.937F, -0.2405F, -0.3135F);
        this.Bodyfront_r10.cubeList.add(new ModelBox(Bodyfront_r10, 11, 42, 1.2761F, 2.2F, -3.7173F, 1, 1, 4, 0.0F, false));
        this.Bodyfront_r10.cubeList.add(new ModelBox(Bodyfront_r10, 43, 51, -1.7239F, 2.2F, -4.7173F, 4, 2, 1, 0.0F, false));

        this.Bodyfront_r11 = new ModelRenderer(this);
        this.Bodyfront_r11.setRotationPoint(-0.5F, 0.0877F, -1.1869F);
        this.Bodyfront.addChild(Bodyfront_r11);
        this.setRotateAngle(Bodyfront_r11, 0.0F, 0.0F, -0.8727F);
        this.Bodyfront_r11.cubeList.add(new ModelBox(Bodyfront_r11, 59, 48, -3.5867F, -1.2175F, -0.5F, 2, 0, 1, 0.0F, true));
        this.Bodyfront_r11.cubeList.add(new ModelBox(Bodyfront_r11, 59, 59, -3.5867F, -1.2175F, -2.5F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r12 = new ModelRenderer(this);
        this.Bodyfront_r12.setRotationPoint(-0.5F, 0.0877F, -1.1869F);
        this.Bodyfront.addChild(Bodyfront_r12);
        this.setRotateAngle(Bodyfront_r12, 0.0F, 0.0F, -0.2182F);
        this.Bodyfront_r12.cubeList.add(new ModelBox(Bodyfront_r12, 45, 59, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.003F, true));
        this.Bodyfront_r12.cubeList.add(new ModelBox(Bodyfront_r12, 52, 59, -2.0F, 0.0F, -2.5F, 2, 0, 1, 0.003F, true));
        this.Bodyfront_r12.cubeList.add(new ModelBox(Bodyfront_r12, 60, 4, -2.0F, 0.0F, -4.5F, 2, 0, 1, 0.003F, true));
        this.Bodyfront_r12.cubeList.add(new ModelBox(Bodyfront_r12, 60, 6, -2.0F, 0.0F, -6.5F, 2, 0, 1, 0.003F, true));

        this.Bodyfront_r13 = new ModelRenderer(this);
        this.Bodyfront_r13.setRotationPoint(0.5F, 0.0877F, -1.1869F);
        this.Bodyfront.addChild(Bodyfront_r13);
        this.setRotateAngle(Bodyfront_r13, 0.0F, 0.0F, 0.8727F);
        this.Bodyfront_r13.cubeList.add(new ModelBox(Bodyfront_r13, 59, 48, 1.5867F, -1.2175F, -0.5F, 2, 0, 1, 0.0F, false));
        this.Bodyfront_r13.cubeList.add(new ModelBox(Bodyfront_r13, 59, 59, 1.5867F, -1.2175F, -2.5F, 2, 0, 1, 0.0F, false));
        this.Bodyfront_r13.cubeList.add(new ModelBox(Bodyfront_r13, 60, 61, 1.5867F, -1.2175F, -4.5F, 1, 0, 1, 0.0F, false));

        this.Bodyfront_r14 = new ModelRenderer(this);
        this.Bodyfront_r14.setRotationPoint(0.5F, 0.0877F, -1.1869F);
        this.Bodyfront.addChild(Bodyfront_r14);
        this.setRotateAngle(Bodyfront_r14, 0.0F, 0.0F, 0.2182F);
        this.Bodyfront_r14.cubeList.add(new ModelBox(Bodyfront_r14, 45, 59, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.003F, false));
        this.Bodyfront_r14.cubeList.add(new ModelBox(Bodyfront_r14, 52, 59, 0.0F, 0.0F, -2.5F, 2, 0, 1, 0.003F, false));
        this.Bodyfront_r14.cubeList.add(new ModelBox(Bodyfront_r14, 60, 4, 0.0F, 0.0F, -4.5F, 2, 0, 1, 0.003F, false));
        this.Bodyfront_r14.cubeList.add(new ModelBox(Bodyfront_r14, 60, 6, 0.0F, 0.0F, -6.5F, 2, 0, 1, 0.003F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.0123F, -8.3869F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.2414F, -0.1271F, 0.0312F);


        this.Neck_r1 = new ModelRenderer(this);
        this.Neck_r1.setRotationPoint(0.0F, 0.1065F, -1.9084F);
        this.Neck.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, 0.0436F, 0.0F, 0.0F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 56, 12, -0.5F, -0.5F, -1.4F, 1, 1, 4, 0.0F, false));

        this.Bodyfront_r15 = new ModelRenderer(this);
        this.Bodyfront_r15.setRotationPoint(-0.5F, 0.1065F, 1.1916F);
        this.Neck.addChild(Bodyfront_r15);
        this.setRotateAngle(Bodyfront_r15, 0.0F, 0.0F, -0.2182F);
        this.Bodyfront_r15.cubeList.add(new ModelBox(Bodyfront_r15, 43, 55, -1.0F, 0.0F, -2.5F, 1, 0, 1, 0.003F, true));

        this.Bodyfront_r16 = new ModelRenderer(this);
        this.Bodyfront_r16.setRotationPoint(0.5F, 0.1065F, 1.1916F);
        this.Neck.addChild(Bodyfront_r16);
        this.setRotateAngle(Bodyfront_r16, 0.0F, 0.0F, 0.2182F);
        this.Bodyfront_r16.cubeList.add(new ModelBox(Bodyfront_r16, 43, 55, 0.0F, 0.0F, -2.5F, 1, 0, 1, 0.003F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.1065F, -1.8084F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.3927F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 26, 23, -4.0F, -1.4F, -5.0F, 8, 4, 5, 0.0F, false));

        this.Upperjaw1 = new ModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, 2.6F, -5.0F);
        this.Head.addChild(Upperjaw1);
        this.Upperjaw1.cubeList.add(new ModelBox(Upperjaw1, 0, 17, -3.5F, -2.0F, -8.0F, 7, 2, 8, 0.0F, false));

        this.Upperjaw2 = new ModelRenderer(this);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Upperjaw1.addChild(Upperjaw2);
        this.Upperjaw2.cubeList.add(new ModelBox(Upperjaw2, 20, 52, -2.5F, -2.0F, -2.0F, 5, 2, 2, 0.0F, false));

        this.Upperteeth2 = new ModelRenderer(this);
        this.Upperteeth2.setRotationPoint(-0.01F, -0.3F, -1.9F);
        this.Upperjaw2.addChild(Upperteeth2);
        this.Upperteeth2.cubeList.add(new ModelBox(Upperteeth2, 51, 41, -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.Upperteeth1 = new ModelRenderer(this);
        this.Upperteeth1.setRotationPoint(-0.01F, -0.3F, -7.9F);
        this.Upperjaw1.addChild(Upperteeth1);
        this.Upperteeth1.cubeList.add(new ModelBox(Upperteeth1, 46, 8, -3.0F, 0.0F, 2.4F, 6, 1, 2, 0.0F, false));
        this.Upperteeth1.cubeList.add(new ModelBox(Upperteeth1, 23, 20, -3.0F, 0.0F, 0.1F, 6, 1, 1, 0.0F, false));
        this.Upperteeth1.cubeList.add(new ModelBox(Upperteeth1, 40, 46, -3.0F, 0.0F, 5.0F, 6, 1, 3, 0.0F, false));
        this.Upperteeth1.cubeList.add(new ModelBox(Upperteeth1, 39, 0, 1.5F, -1.2F, 1.2F, 1, 3, 1, 0.0F, false));
        this.Upperteeth1.cubeList.add(new ModelBox(Upperteeth1, 0, 8, 0.5F, -1.6F, -1.0F, 1, 3, 1, 0.0F, false));
        this.Upperteeth1.cubeList.add(new ModelBox(Upperteeth1, 0, 8, -1.48F, -1.6F, -1.0F, 1, 3, 1, 0.0F, true));
        this.Upperteeth1.cubeList.add(new ModelBox(Upperteeth1, 10, 8, 1.5F, -1.4F, 3.8F, 1, 3, 1, 0.0F, false));
        this.Upperteeth1.cubeList.add(new ModelBox(Upperteeth1, 39, 0, -2.48F, -1.2F, 1.2F, 1, 3, 1, 0.0F, true));
        this.Upperteeth1.cubeList.add(new ModelBox(Upperteeth1, 10, 8, -2.48F, -1.4F, 3.8F, 1, 3, 1, 0.0F, true));

        this.Lowerjaw1 = new ModelRenderer(this);
        this.Lowerjaw1.setRotationPoint(0.0F, 2.6F, 0.0F);
        this.Head.addChild(Lowerjaw1);
        this.setRotateAngle(Lowerjaw1, 0.6853F, 0.0F, 0.0F);
        this.Lowerjaw1.cubeList.add(new ModelBox(Lowerjaw1, 12, 52, 3.0F, 0.0F, -5.0F, 1, 2, 5, 0.0F, false));
        this.Lowerjaw1.cubeList.add(new ModelBox(Lowerjaw1, 49, 51, 3.0F, 0.4F, -5.0F, 1, 2, 5, -0.003F, false));
        this.Lowerjaw1.cubeList.add(new ModelBox(Lowerjaw1, 12, 52, -4.0F, 0.0F, -5.0F, 1, 2, 5, 0.0F, true));
        this.Lowerjaw1.cubeList.add(new ModelBox(Lowerjaw1, 49, 51, -4.0F, 0.4F, -5.0F, 1, 2, 5, -0.003F, true));

        this.Lowerjaw2 = new ModelRenderer(this);
        this.Lowerjaw2.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.Lowerjaw1.addChild(Lowerjaw2);
        this.Lowerjaw2.cubeList.add(new ModelBox(Lowerjaw2, 0, 40, 2.5F, -2.0F, -8.0F, 1, 2, 8, 0.0F, false));
        this.Lowerjaw2.cubeList.add(new ModelBox(Lowerjaw2, 0, 40, -3.5F, -2.0F, -8.0F, 1, 2, 8, 0.0F, true));

        this.Lowerjaw3 = new ModelRenderer(this);
        this.Lowerjaw3.setRotationPoint(0.0F, -2.0F, -8.0F);
        this.Lowerjaw2.addChild(Lowerjaw3);
        this.Lowerjaw3.cubeList.add(new ModelBox(Lowerjaw3, 48, 24, 1.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));
        this.Lowerjaw3.cubeList.add(new ModelBox(Lowerjaw3, 48, 24, -2.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, true));
        this.Lowerjaw3.cubeList.add(new ModelBox(Lowerjaw3, 55, 0, -2.5F, 0.0F, -2.0F, 5, 2, 1, 0.0F, false));

        this.Lowerteeth2 = new ModelRenderer(this);
        this.Lowerteeth2.setRotationPoint(0.0F, 0.3F, -1.8F);
        this.Lowerjaw3.addChild(Lowerteeth2);
        this.Lowerteeth2.cubeList.add(new ModelBox(Lowerteeth2, 56, 22, -2.0F, -1.0F, 0.0F, 4, 1, 2, 0.0F, false));

        this.Lowerteeth1 = new ModelRenderer(this);
        this.Lowerteeth1.setRotationPoint(0.0F, -1.7F, -7.8F);
        this.Lowerjaw2.addChild(Lowerteeth1);
        this.setRotateAngle(Lowerteeth1, -0.0213F, 0.0F, 0.0F);
        this.Lowerteeth1.cubeList.add(new ModelBox(Lowerteeth1, 18, 0, -3.0F, -1.0F, 0.0F, 6, 1, 8, 0.0F, false));

        this.Throat = new ModelRenderer(this);
        this.Throat.setRotationPoint(-0.01F, 3.0F, -5.0F);
        this.Lowerjaw1.addChild(Throat);
        this.setRotateAngle(Throat, -0.0991F, 0.0F, 0.0F);


        this.Throat_r1 = new ModelRenderer(this);
        this.Throat_r1.setRotationPoint(-2.43F, 0.0F, -10.0F);
        this.Throat.addChild(Throat_r1);
        this.setRotateAngle(Throat_r1, 0.0698F, 0.0F, 0.0F);
        this.Throat_r1.cubeList.add(new ModelBox(Throat_r1, 35, 44, -0.05F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));
        this.Throat_r1.cubeList.add(new ModelBox(Throat_r1, 40, 36, -0.95F, -1.0F, 2.0F, 1, 1, 8, 0.0F, true));
        this.Throat_r1.cubeList.add(new ModelBox(Throat_r1, 40, 36, 4.83F, -1.0F, 2.0F, 1, 1, 8, 0.0F, false));
        this.Throat_r1.cubeList.add(new ModelBox(Throat_r1, 35, 44, 3.93F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Headslope1 = new ModelRenderer(this);
        this.Headslope1.setRotationPoint(0.0F, -1.4F, -5.0F);
        this.Head.addChild(Headslope1);
        this.setRotateAngle(Headslope1, 0.2262F, 0.0F, 0.0F);
        this.Headslope1.cubeList.add(new ModelBox(Headslope1, 26, 10, -3.0F, 0.0F, -7.0F, 6, 2, 7, 0.0F, false));

        this.Headslope2 = new ModelRenderer(this);
        this.Headslope2.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.Headslope1.addChild(Headslope2);
        this.setRotateAngle(Headslope2, -0.1061F, 0.0F, 0.0F);
        this.Headslope2.cubeList.add(new ModelBox(Headslope2, 18, 10, -2.0F, -1.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.2F, 3.8877F, -5.9869F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 1.4469F, 0.2638F, -0.1786F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 0, 40, -0.6232F, -0.4087F, -0.3434F, 1, 4, 1, 0.0F, false));

        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.2232F, 3.4913F, -0.2434F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.618F, -0.5308F, 0.1274F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 56, 26, -0.4408F, -0.4624F, -1.5496F, 1, 4, 1, -0.2F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 39, 33, -0.4408F, -0.4624F, -0.3496F, 1, 4, 1, 0.0F, false));

        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0592F, 3.0376F, -0.4496F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, -2.3515F, -1.486F, -2.1651F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 51, 35, -2.0F, 0.0F, -3.0F, 4, 1, 4, 0.0F, false));

        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.2F, 3.8877F, -5.9869F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 1.5863F, -0.1926F, 0.1455F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 0, 0, -0.3768F, -0.4087F, -0.3434F, 1, 4, 1, 0.0F, false));

        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.2232F, 3.4913F, -0.2434F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.618F, 0.5308F, -0.1274F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 31, 33, -0.5592F, -0.4624F, -1.5496F, 1, 4, 1, -0.2F, false));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 9, 0, -0.5592F, -0.4624F, -0.3496F, 1, 4, 1, 0.0F, false));

        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(-0.0592F, 3.0376F, -0.4496F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, -2.3078F, 1.486F, 2.1651F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 0, 51, -2.0F, 0.0F, -3.0F, 4, 1, 4, 0.0F, false));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.6003F, 16.4777F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0662F, -0.1742F, 0.0112F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 48, 61, 0.0F, -2.3673F, 3.2814F, 0, 2, 1, 0.0F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 45, 61, 0.0F, -1.7164F, 1.3485F, 0, 2, 1, 0.0F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 62, 41, 0.0F, -1.2639F, -0.6099F, 0, 1, 1, 0.0F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 0, 0, -0.5F, -0.5014F, -0.4554F, 1, 1, 6, 0.0F, false));

        this.Tail4_r1 = new ModelRenderer(this);
        this.Tail4_r1.setRotationPoint(-0.5F, -0.0966F, 3.9683F);
        this.Tail1.addChild(Tail4_r1);
        this.setRotateAngle(Tail4_r1, 0.0F, 0.2618F, 0.0F);
        this.Tail4_r1.cubeList.add(new ModelBox(Tail4_r1, 35, 54, -0.1968F, 0.2541F, -2.3385F, 1, 0, 1, 0.0F, true));
        this.Tail4_r1.cubeList.add(new ModelBox(Tail4_r1, 46, 12, -1.7102F, 0.0F, -0.4224F, 2, 0, 1, 0.0F, true));

        this.Tail3_r1 = new ModelRenderer(this);
        this.Tail3_r1.setRotationPoint(0.5F, -0.0966F, 3.9683F);
        this.Tail1.addChild(Tail3_r1);
        this.setRotateAngle(Tail3_r1, 0.0F, -0.2618F, 0.0F);
        this.Tail3_r1.cubeList.add(new ModelBox(Tail3_r1, 35, 54, -0.8032F, 0.2541F, -2.3385F, 1, 0, 1, 0.0F, false));
        this.Tail3_r1.cubeList.add(new ModelBox(Tail3_r1, 46, 12, -0.2898F, 0.0F, -0.4224F, 2, 0, 1, 0.0F, false));

        this.Tail12_r1 = new ModelRenderer(this);
        this.Tail12_r1.setRotationPoint(0.0F, 0.5921F, 1.8525F);
        this.Tail1.addChild(Tail12_r1);
        this.setRotateAngle(Tail12_r1, 0.1745F, 0.0F, 0.0F);
        this.Tail12_r1.cubeList.add(new ModelBox(Tail12_r1, 56, 12, 0.0F, 0.0931F, 1.4507F, 0, 2, 1, 0.0F, false));
        this.Tail12_r1.cubeList.add(new ModelBox(Tail12_r1, 42, 61, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.0014F, 5.3446F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0848F, 0.0F, 0.0F);


        this.Tail2_r1 = new ModelRenderer(this);
        this.Tail2_r1.setRotationPoint(0.0F, -0.0297F, -0.4006F);
        this.Tail2.addChild(Tail2_r1);
        this.setRotateAngle(Tail2_r1, -0.0436F, 0.0F, 0.0F);
        this.Tail2_r1.cubeList.add(new ModelBox(Tail2_r1, 45, 12, -0.5F, -0.5F, 0.0F, 1, 1, 8, -0.002F, false));

        this.Tail8_r1 = new ModelRenderer(this);
        this.Tail8_r1.setRotationPoint(0.0F, -0.2424F, 6.3514F);
        this.Tail2.addChild(Tail8_r1);
        this.setRotateAngle(Tail8_r1, -0.0873F, 0.0F, 0.0F);
        this.Tail8_r1.cubeList.add(new ModelBox(Tail8_r1, 61, 26, 0.0F, -1.803F, -6.6131F, 0, 3, 1, 0.0F, false));
        this.Tail8_r1.cubeList.add(new ModelBox(Tail8_r1, 27, 61, 0.0F, -2.2603F, -4.6558F, 0, 3, 1, 0.0F, false));
        this.Tail8_r1.cubeList.add(new ModelBox(Tail8_r1, 30, 61, 0.0F, -2.7175F, -2.6986F, 0, 3, 1, 0.0F, false));
        this.Tail8_r1.cubeList.add(new ModelBox(Tail8_r1, 33, 61, 0.0F, -2.9765F, -0.7154F, 0, 3, 1, 0.0F, false));

        this.Tail16_r1 = new ModelRenderer(this);
        this.Tail16_r1.setRotationPoint(0.0F, 0.5638F, -3.5927F);
        this.Tail2.addChild(Tail16_r1);
        this.setRotateAngle(Tail16_r1, 0.1745F, 0.0F, 0.0F);
        this.Tail16_r1.cubeList.add(new ModelBox(Tail16_r1, 21, 60, 0.0F, 1.4652F, 9.1561F, 0, 3, 1, 0.0F, false));
        this.Tail16_r1.cubeList.add(new ModelBox(Tail16_r1, 24, 61, 0.0F, 0.6073F, 7.2524F, 0, 3, 1, 0.0F, false));
        this.Tail16_r1.cubeList.add(new ModelBox(Tail16_r1, 13, 51, 0.0F, 0.939F, 5.1908F, 0, 2, 1, 0.0F, false));
        this.Tail16_r1.cubeList.add(new ModelBox(Tail16_r1, 51, 35, 0.0F, 0.4776F, 3.2345F, 0, 2, 1, 0.0F, false));

        this.Tail4_r2 = new ModelRenderer(this);
        this.Tail4_r2.setRotationPoint(-0.5F, -0.0803F, -0.1737F);
        this.Tail2.addChild(Tail4_r2);
        this.setRotateAngle(Tail4_r2, -0.1047F, 0.2618F, 0.0F);
        this.Tail4_r2.cubeList.add(new ModelBox(Tail4_r2, 0, 46, -1.8639F, -0.0264F, 0.1655F, 2, 0, 1, 0.0F, true));
        this.Tail4_r2.cubeList.add(new ModelBox(Tail4_r2, 38, 20, -2.1361F, -0.0874F, 1.9561F, 2, 0, 1, 0.0F, true));
        this.Tail4_r2.cubeList.add(new ModelBox(Tail4_r2, 23, 23, -2.3399F, -0.135F, 3.8823F, 2, 0, 1, 0.0F, true));
        this.Tail4_r2.cubeList.add(new ModelBox(Tail4_r2, 18, 44, -2.4377F, -0.2729F, 5.6577F, 1, 0, 1, 0.0F, true));

        this.Tail6_r1 = new ModelRenderer(this);
        this.Tail6_r1.setRotationPoint(0.5F, -0.0803F, -0.1737F);
        this.Tail2.addChild(Tail6_r1);
        this.setRotateAngle(Tail6_r1, -0.1047F, -0.2618F, 0.0F);
        this.Tail6_r1.cubeList.add(new ModelBox(Tail6_r1, 18, 44, 1.4377F, -0.2729F, 5.6577F, 1, 0, 1, 0.0F, false));
        this.Tail6_r1.cubeList.add(new ModelBox(Tail6_r1, 23, 23, 0.3399F, -0.135F, 3.8823F, 2, 0, 1, 0.0F, false));
        this.Tail6_r1.cubeList.add(new ModelBox(Tail6_r1, 38, 20, 0.1361F, -0.0874F, 1.9561F, 2, 0, 1, 0.0F, false));
        this.Tail6_r1.cubeList.add(new ModelBox(Tail6_r1, 0, 46, -0.1361F, -0.0264F, 0.1655F, 2, 0, 1, 0.0F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.1703F, 6.5994F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1741F, -0.2174F, -0.0188F);


        this.Tail8_r2 = new ModelRenderer(this);
        this.Tail8_r2.setRotationPoint(0.0F, -0.3365F, 1.497F);
        this.Tail3.addChild(Tail8_r2);
        this.setRotateAngle(Tail8_r2, -0.1745F, 0.0F, 0.0F);
        this.Tail8_r2.cubeList.add(new ModelBox(Tail8_r2, 23, 0, 0.0F, -4.4504F, 7.3119F, 0, 4, 1, 0.0F, false));
        this.Tail8_r2.cubeList.add(new ModelBox(Tail8_r2, 5, 40, 0.0F, -4.583F, 5.2766F, 0, 4, 1, 0.0F, false));
        this.Tail8_r2.cubeList.add(new ModelBox(Tail8_r2, 0, 57, 0.0F, -4.121F, 3.3205F, 0, 4, 1, 0.0F, false));
        this.Tail8_r2.cubeList.add(new ModelBox(Tail8_r2, 3, 57, 0.0F, -3.6589F, 1.3643F, 0, 4, 1, 0.0F, false));
        this.Tail8_r2.cubeList.add(new ModelBox(Tail8_r2, 6, 57, 0.0F, -3.0977F, -0.5786F, 0, 4, 1, 0.0F, false));

        this.Tail3_r2 = new ModelRenderer(this);
        this.Tail3_r2.setRotationPoint(0.0F, 0.196F, -0.0932F);
        this.Tail3.addChild(Tail3_r2);
        this.setRotateAngle(Tail3_r2, -0.0436F, 0.0F, 0.0F);
        this.Tail3_r2.cubeList.add(new ModelBox(Tail3_r2, 13, 30, -0.5F, -0.6F, 0.0F, 1, 1, 10, 0.0F, false));

        this.Tail21_r1 = new ModelRenderer(this);
        this.Tail21_r1.setRotationPoint(0.0F, 0.3895F, -10.2853F);
        this.Tail3.addChild(Tail21_r1);
        this.setRotateAngle(Tail21_r1, 0.1745F, 0.0F, 0.0F);
        this.Tail21_r1.cubeList.add(new ModelBox(Tail21_r1, 11, 41, 0.0F, 3.2106F, 18.7992F, 0, 3, 1, 0.0F, false));
        this.Tail21_r1.cubeList.add(new ModelBox(Tail21_r1, 9, 57, 0.0F, 2.9758F, 16.803F, 0, 3, 1, 0.0F, false));
        this.Tail21_r1.cubeList.add(new ModelBox(Tail21_r1, 12, 60, 0.0F, 2.7409F, 14.8067F, 0, 3, 1, 0.0F, false));
        this.Tail21_r1.cubeList.add(new ModelBox(Tail21_r1, 15, 60, 0.0F, 2.5061F, 12.8105F, 0, 3, 1, 0.0F, false));
        this.Tail21_r1.cubeList.add(new ModelBox(Tail21_r1, 18, 60, 0.0F, 2.076F, 10.8573F, 0, 3, 1, 0.0F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.396F, 9.6068F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0662F, 0.1742F, -0.0112F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 45, 25, -0.5F, -0.3897F, -0.1232F, 1, 1, 8, 0.001F, false));

        this.Tail12_r2 = new ModelRenderer(this);
        this.Tail12_r2.setRotationPoint(0.0F, -0.7223F, -8.033F);
        this.Tail4.addChild(Tail12_r2);
        this.setRotateAngle(Tail12_r2, -0.1745F, 0.0F, 0.0F);
        this.Tail12_r2.cubeList.add(new ModelBox(Tail12_r2, 54, 61, 0.0F, -3.826F, 14.9945F, 0, 2, 1, 0.0F, false));
        this.Tail12_r2.cubeList.add(new ModelBox(Tail12_r2, 57, 61, 0.0F, -3.9269F, 12.9354F, 0, 2, 1, 0.0F, false));
        this.Tail12_r2.cubeList.add(new ModelBox(Tail12_r2, 36, 61, 0.0F, -4.1259F, 10.8569F, 0, 3, 1, 0.0F, false));
        this.Tail12_r2.cubeList.add(new ModelBox(Tail12_r2, 39, 61, 0.0F, -4.1288F, 8.8173F, 0, 3, 1, 0.0F, false));

        this.Tail25_r1 = new ModelRenderer(this);
        this.Tail25_r1.setRotationPoint(0.0F, 1.376F, 2.0069F);
        this.Tail4.addChild(Tail25_r1);
        this.setRotateAngle(Tail25_r1, 0.2618F, 0.0F, 0.0F);
        this.Tail25_r1.cubeList.add(new ModelBox(Tail25_r1, 30, 10, 0.0F, 0.0893F, 3.1651F, 0, 1, 1, 0.0F, false));
        this.Tail25_r1.cubeList.add(new ModelBox(Tail25_r1, 8, 62, 0.0F, 0.4682F, 5.1314F, 0, 1, 1, 0.0F, false));
        this.Tail25_r1.cubeList.add(new ModelBox(Tail25_r1, 44, 35, 0.0F, -0.9982F, 1.1273F, 0, 2, 1, 0.0F, false));
        this.Tail25_r1.cubeList.add(new ModelBox(Tail25_r1, 0, 51, 0.0F, -1.28F, -0.8628F, 0, 2, 1, 0.0F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0103F, 7.5768F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.1613F, 0.5649F, -0.0539F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 34, 51, -0.5F, -0.3874F, -0.0976F, 1, 1, 6, 0.0F, false));

        this.Tail14_r1 = new ModelRenderer(this);
        this.Tail14_r1.setRotationPoint(0.0F, -0.7199F, -15.5074F);
        this.Tail5.addChild(Tail14_r1);
        this.setRotateAngle(Tail14_r1, -0.1745F, 0.0F, 0.0F);
        this.Tail14_r1.cubeList.add(new ModelBox(Tail14_r1, 62, 55, 0.0F, -3.8219F, 18.8391F, 0, 1, 1, 0.0F, false));
        this.Tail14_r1.cubeList.add(new ModelBox(Tail14_r1, 51, 61, 0.0F, -3.8441F, 16.7511F, 0, 2, 1, 0.0F, false));

        this.Tail26_r1 = new ModelRenderer(this);
        this.Tail26_r1.setRotationPoint(0.0F, 1.3784F, -5.4675F);
        this.Tail5.addChild(Tail26_r1);
        this.setRotateAngle(Tail26_r1, 0.2618F, 0.0F, 0.0F);
        this.Tail26_r1.cubeList.add(new ModelBox(Tail26_r1, 18, 10, 0.0F, 0.9267F, 8.8986F, 0, 1, 1, 0.0F, false));
        this.Tail26_r1.cubeList.add(new ModelBox(Tail26_r1, 23, 17, 0.0F, 0.6169F, 6.9228F, 0, 1, 1, 0.0F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.9F, 1.8997F, 14.8777F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 1.1188F, -0.2731F, -2.0356F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 18, 28, -0.5923F, -0.4016F, -0.2912F, 1, 5, 1, 0.0F, false));

        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.3077F, 4.1984F, 0.2088F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.4847F, 0.1274F, 0.0F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 26, 33, -0.7927F, -0.2141F, -0.428F, 1, 5, 1, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 13, 28, -1.8927F, -0.2141F, -0.428F, 1, 5, 1, -0.2F, false));

        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(-0.5927F, 3.7859F, 0.572F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 1.7312F, 0.3821F, 0.2972F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 19, 44, -2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F, false));

        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.9F, 1.8997F, 14.8777F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.6637F, 0.2741F, 1.5909F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 18, 0, -0.4077F, -0.4016F, -0.2912F, 1, 5, 1, 0.0F, false));

        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.3077F, 4.1984F, 0.2088F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.7028F, -0.1274F, 0.0F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 5, 28, -0.2073F, -0.2141F, -0.428F, 1, 5, 1, 0.0F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 0, 28, 0.8927F, -0.2141F, -0.428F, 1, 5, 1, -0.2F, false));

        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.5927F, 3.7859F, 0.572F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 1.3821F, -0.3821F, -0.2972F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 39, 0, -2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F, false));

    }

    public void renderAll(float f) {
        this.root.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
