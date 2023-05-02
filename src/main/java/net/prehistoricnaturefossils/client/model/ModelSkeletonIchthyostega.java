package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonIchthyostega extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer body;
    private final ModelRenderer neck_r1;
    private final ModelRenderer neck_r2;
    private final ModelRenderer neck_r3;
    private final ModelRenderer neck_r4;
    private final ModelRenderer neck_r5;
    private final ModelRenderer neck_r6;
    private final ModelRenderer neck_r7;
    private final ModelRenderer neck_r8;
    private final ModelRenderer neck_r9;
    private final ModelRenderer neck_r10;
    private final ModelRenderer neck_r11;
    private final ModelRenderer neck_r12;
    private final ModelRenderer neck_r13;
    private final ModelRenderer neck_r14;
    private final ModelRenderer neck_r15;
    private final ModelRenderer neck_r16;
    private final ModelRenderer neck_r17;
    private final ModelRenderer neck_r18;
    private final ModelRenderer neck_r19;
    private final ModelRenderer neck_r20;
    private final ModelRenderer neck_r21;
    private final ModelRenderer neck_r22;
    private final ModelRenderer neck_r23;
    private final ModelRenderer bodyfront;
    private final ModelRenderer bodyfront_r1;
    private final ModelRenderer bodyfront_r2;
    private final ModelRenderer bodyfront_r3;
    private final ModelRenderer bodyfront_r4;
    private final ModelRenderer bodyfront_r5;
    private final ModelRenderer bodyfront_r6;
    private final ModelRenderer neck_r24;
    private final ModelRenderer neck_r25;
    private final ModelRenderer neck_r26;
    private final ModelRenderer neck_r27;
    private final ModelRenderer neck_r28;
    private final ModelRenderer neck_r29;
    private final ModelRenderer neck_r30;
    private final ModelRenderer neck_r31;
    private final ModelRenderer neck_r32;
    private final ModelRenderer neck_r33;
    private final ModelRenderer neck_r34;
    private final ModelRenderer neck_r35;
    private final ModelRenderer neck_r36;
    private final ModelRenderer neck_r37;
    private final ModelRenderer armL;
    private final ModelRenderer armL2;
    private final ModelRenderer handL;
    private final ModelRenderer rightfrontfin_r1;
    private final ModelRenderer rightfrontfin_r2;
    private final ModelRenderer rightfrontfin_r3;
    private final ModelRenderer rightfrontfin_r4;
    private final ModelRenderer rightfrontfin_r5;
    private final ModelRenderer rightfrontfin_r6;
    private final ModelRenderer rightfrontfin_r7;
    private final ModelRenderer armL3;
    private final ModelRenderer armL4;
    private final ModelRenderer handL2;
    private final ModelRenderer rightfrontfin_r8;
    private final ModelRenderer rightfrontfin_r9;
    private final ModelRenderer rightfrontfin_r10;
    private final ModelRenderer rightfrontfin_r11;
    private final ModelRenderer rightfrontfin_r12;
    private final ModelRenderer rightfrontfin_r13;
    private final ModelRenderer rightfrontfin_r14;
    private final ModelRenderer bodyfront2;
    private final ModelRenderer neck_r38;
    private final ModelRenderer neck_r39;
    private final ModelRenderer neck_r40;
    private final ModelRenderer neck_r41;
    private final ModelRenderer neck_r42;
    private final ModelRenderer neck_r43;
    private final ModelRenderer neck_r44;
    private final ModelRenderer head;
    private final ModelRenderer head_r1;
    private final ModelRenderer head_r2;
    private final ModelRenderer head_r3;
    private final ModelRenderer head_r4;
    private final ModelRenderer head_r5;
    private final ModelRenderer head_r6;
    private final ModelRenderer head_r7;
    private final ModelRenderer upperjaw1;
    private final ModelRenderer snout;
    private final ModelRenderer snout_r1;
    private final ModelRenderer lowerjaw1;
    private final ModelRenderer lowerjaw3_r1;
    private final ModelRenderer lowerjaw2_r1;
    private final ModelRenderer lowerjaw3_r2;
    private final ModelRenderer lowerjaw1_r1;
    private final ModelRenderer lowerjaw2;
    private final ModelRenderer lowerjaw6_r1;
    private final ModelRenderer lowerjaw6_r2;
    private final ModelRenderer lowerjaw7_r1;
    private final ModelRenderer lowerjaw5_r1;
    private final ModelRenderer lowerjaw5_r2;
    private final ModelRenderer lowerjaw5_r3;
    private final ModelRenderer lowerjaw6_r3;
    private final ModelRenderer lowerjaw4_r1;
    private final ModelRenderer underjaw;
    private final ModelRenderer underjaw_r1;
    private final ModelRenderer underjaw_r2;
    private final ModelRenderer bodyrear;
    private final ModelRenderer neck_r45;
    private final ModelRenderer neck_r46;
    private final ModelRenderer neck_r47;
    private final ModelRenderer neck_r48;
    private final ModelRenderer neck_r49;
    private final ModelRenderer neck_r50;
    private final ModelRenderer neck_r51;
    private final ModelRenderer neck_r52;
    private final ModelRenderer neck_r53;
    private final ModelRenderer neck_r54;
    private final ModelRenderer neck_r55;
    private final ModelRenderer neck_r56;
    private final ModelRenderer neck_r57;
    private final ModelRenderer neck_r58;
    private final ModelRenderer neck_r59;
    private final ModelRenderer neck_r60;
    private final ModelRenderer neck_r61;
    private final ModelRenderer tailbase;
    private final ModelRenderer tailbase_r1;
    private final ModelRenderer tailbase_r2;
    private final ModelRenderer tailbase_r3;
    private final ModelRenderer tailbase_r4;
    private final ModelRenderer tailbase_r5;
    private final ModelRenderer tailbase_r6;
    private final ModelRenderer neck_r62;
    private final ModelRenderer neck_r63;
    private final ModelRenderer legL3;
    private final ModelRenderer legL4;
    private final ModelRenderer footL2;
    private final ModelRenderer rightrearfin_r1;
    private final ModelRenderer rightrearfin_r2;
    private final ModelRenderer rightrearfin_r3;
    private final ModelRenderer rightrearfin_r4;
    private final ModelRenderer rightrearfin_r5;
    private final ModelRenderer rightrearfin_r6;
    private final ModelRenderer rightrearfin_r7;
    private final ModelRenderer legL;
    private final ModelRenderer legL2;
    private final ModelRenderer footL;
    private final ModelRenderer rightrearfin_r8;
    private final ModelRenderer rightrearfin_r9;
    private final ModelRenderer rightrearfin_r10;
    private final ModelRenderer rightrearfin_r11;
    private final ModelRenderer rightrearfin_r12;
    private final ModelRenderer rightrearfin_r13;
    private final ModelRenderer rightrearfin_r14;
    private final ModelRenderer tail1;
    private final ModelRenderer neck_r64;
    private final ModelRenderer neck_r65;
    private final ModelRenderer neck_r66;
    private final ModelRenderer neck_r67;
    private final ModelRenderer neck_r68;
    private final ModelRenderer tail2;
    private final ModelRenderer tail6_r1;
    private final ModelRenderer tail5_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail8_r1;
    private final ModelRenderer tail6_r2;
    private final ModelRenderer tail4;
    private final ModelRenderer tail9_r1;
    private final ModelRenderer tail9_r2;

    public ModelSkeletonIchthyostega() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -5.2F, 0.0F);
        this.fossil.addChild(root);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6F, 0.0F);
        this.root.addChild(body);
        this.setRotateAngle(body, -0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 22, -0.5F, -1.05F, -3.5F, 1, 1, 6, 0.0F, false));

        this.neck_r1 = new ModelRenderer(this);
        this.neck_r1.setRotationPoint(-0.55F, -0.2353F, 1.1148F);
        this.body.addChild(neck_r1);
        this.setRotateAngle(neck_r1, -1.4649F, -0.181F, 1.0376F);
        this.neck_r1.cubeList.add(new ModelBox(neck_r1, 29, 55, 0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, true));

        this.neck_r2 = new ModelRenderer(this);
        this.neck_r2.setRotationPoint(-0.15F, -0.9353F, 0.9148F);
        this.body.addChild(neck_r2);
        this.setRotateAngle(neck_r2, -1.7771F, -0.0962F, 0.471F);
        this.neck_r2.cubeList.add(new ModelBox(neck_r2, 52, 26, -0.4028F, -2.7471F, 4.1067F, 0, 1, 1, 0.0F, true));

        this.neck_r3 = new ModelRenderer(this);
        this.neck_r3.setRotationPoint(-0.15F, -0.9353F, 0.9148F);
        this.body.addChild(neck_r3);
        this.setRotateAngle(neck_r3, -1.3844F, -0.0962F, 0.471F);
        this.neck_r3.cubeList.add(new ModelBox(neck_r3, 5, 6, -0.408F, -0.9903F, 2.9308F, 0, 1, 2, 0.0F, true));

        this.neck_r4 = new ModelRenderer(this);
        this.neck_r4.setRotationPoint(-0.55F, -0.2353F, 1.1148F);
        this.body.addChild(neck_r4);
        this.setRotateAngle(neck_r4, -1.3844F, -0.0962F, 0.471F);
        this.neck_r4.cubeList.add(new ModelBox(neck_r4, 25, 41, -0.4253F, -0.4903F, 0.7308F, 0, 1, 4, 0.0F, true));

        this.neck_r5 = new ModelRenderer(this);
        this.neck_r5.setRotationPoint(-0.55F, -0.2353F, -0.8852F);
        this.body.addChild(neck_r5);
        this.setRotateAngle(neck_r5, -1.7302F, -0.1198F, 0.4659F);
        this.neck_r5.cubeList.add(new ModelBox(neck_r5, 53, 7, -0.4028F, -2.7471F, 4.5067F, 0, 1, 1, 0.0F, true));
        this.neck_r5.cubeList.add(new ModelBox(neck_r5, 52, 48, -0.4028F, -2.7471F, 4.1067F, 0, 1, 1, 0.0F, true));

        this.neck_r6 = new ModelRenderer(this);
        this.neck_r6.setRotationPoint(-0.55F, -0.2353F, -0.8852F);
        this.body.addChild(neck_r6);
        this.setRotateAngle(neck_r6, -1.3375F, -0.1198F, 0.4659F);
        this.neck_r6.cubeList.add(new ModelBox(neck_r6, 11, 12, -0.408F, -0.9903F, 2.9308F, 0, 1, 2, 0.0F, true));
        this.neck_r6.cubeList.add(new ModelBox(neck_r6, 29, 34, -0.4253F, -0.4903F, 0.7308F, 0, 1, 5, 0.0F, true));

        this.neck_r7 = new ModelRenderer(this);
        this.neck_r7.setRotationPoint(-0.55F, -0.2353F, -0.8852F);
        this.body.addChild(neck_r7);
        this.setRotateAngle(neck_r7, -1.4376F, -0.2261F, 1.0321F);
        this.neck_r7.cubeList.add(new ModelBox(neck_r7, 32, 55, 0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, true));

        this.neck_r8 = new ModelRenderer(this);
        this.neck_r8.setRotationPoint(-0.55F, -0.2353F, -2.8852F);
        this.body.addChild(neck_r8);
        this.setRotateAngle(neck_r8, -1.7144F, -0.1276F, 0.464F);
        this.neck_r8.cubeList.add(new ModelBox(neck_r8, 54, 28, -0.4028F, -2.7471F, 4.5067F, 0, 1, 1, 0.0F, true));
        this.neck_r8.cubeList.add(new ModelBox(neck_r8, 54, 31, -0.4028F, -2.7471F, 4.1067F, 0, 1, 1, 0.0F, true));

        this.neck_r9 = new ModelRenderer(this);
        this.neck_r9.setRotationPoint(-0.55F, -0.2353F, -2.8852F);
        this.body.addChild(neck_r9);
        this.setRotateAngle(neck_r9, -1.3217F, -0.1276F, 0.464F);
        this.neck_r9.cubeList.add(new ModelBox(neck_r9, 0, 22, -0.408F, -0.9903F, 2.9308F, 0, 1, 2, 0.0F, true));
        this.neck_r9.cubeList.add(new ModelBox(neck_r9, 0, 35, -0.4253F, -0.4903F, 0.7308F, 0, 1, 5, 0.0F, true));

        this.neck_r10 = new ModelRenderer(this);
        this.neck_r10.setRotationPoint(-0.55F, -0.2353F, -2.8852F);
        this.body.addChild(neck_r10);
        this.setRotateAngle(neck_r10, -1.4284F, -0.241F, 1.0299F);
        this.neck_r10.cubeList.add(new ModelBox(neck_r10, 55, 34, 0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, true));

        this.neck_r11 = new ModelRenderer(this);
        this.neck_r11.setRotationPoint(0.15F, -0.9353F, 0.9148F);
        this.body.addChild(neck_r11);
        this.setRotateAngle(neck_r11, -1.7771F, 0.0962F, -0.471F);
        this.neck_r11.cubeList.add(new ModelBox(neck_r11, 52, 26, 0.4028F, -2.7471F, 4.1067F, 0, 1, 1, 0.0F, false));

        this.neck_r12 = new ModelRenderer(this);
        this.neck_r12.setRotationPoint(0.15F, -0.9353F, 0.9148F);
        this.body.addChild(neck_r12);
        this.setRotateAngle(neck_r12, -1.3844F, 0.0962F, -0.471F);
        this.neck_r12.cubeList.add(new ModelBox(neck_r12, 5, 6, 0.408F, -0.9903F, 2.9308F, 0, 1, 2, 0.0F, false));

        this.neck_r13 = new ModelRenderer(this);
        this.neck_r13.setRotationPoint(0.55F, -0.2353F, 1.1148F);
        this.body.addChild(neck_r13);
        this.setRotateAngle(neck_r13, -1.3844F, 0.0962F, -0.471F);
        this.neck_r13.cubeList.add(new ModelBox(neck_r13, 25, 41, 0.4253F, -0.4903F, 0.7308F, 0, 1, 4, 0.0F, false));

        this.neck_r14 = new ModelRenderer(this);
        this.neck_r14.setRotationPoint(0.55F, -0.2353F, 1.1148F);
        this.body.addChild(neck_r14);
        this.setRotateAngle(neck_r14, -1.4649F, 0.181F, -1.0376F);
        this.neck_r14.cubeList.add(new ModelBox(neck_r14, 29, 55, -0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, false));

        this.neck_r15 = new ModelRenderer(this);
        this.neck_r15.setRotationPoint(0.55F, -0.2353F, -0.8852F);
        this.body.addChild(neck_r15);
        this.setRotateAngle(neck_r15, -1.7302F, 0.1198F, -0.4659F);
        this.neck_r15.cubeList.add(new ModelBox(neck_r15, 53, 7, 0.4028F, -2.7471F, 4.5067F, 0, 1, 1, 0.0F, false));
        this.neck_r15.cubeList.add(new ModelBox(neck_r15, 52, 48, 0.4028F, -2.7471F, 4.1067F, 0, 1, 1, 0.0F, false));

        this.neck_r16 = new ModelRenderer(this);
        this.neck_r16.setRotationPoint(0.55F, -0.2353F, -0.8852F);
        this.body.addChild(neck_r16);
        this.setRotateAngle(neck_r16, -1.4376F, 0.2261F, -1.0321F);
        this.neck_r16.cubeList.add(new ModelBox(neck_r16, 32, 55, -0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, false));

        this.neck_r17 = new ModelRenderer(this);
        this.neck_r17.setRotationPoint(0.55F, -0.2353F, -0.8852F);
        this.body.addChild(neck_r17);
        this.setRotateAngle(neck_r17, -1.3375F, 0.1198F, -0.4659F);
        this.neck_r17.cubeList.add(new ModelBox(neck_r17, 11, 12, 0.408F, -0.9903F, 2.9308F, 0, 1, 2, 0.0F, false));
        this.neck_r17.cubeList.add(new ModelBox(neck_r17, 29, 34, 0.4253F, -0.4903F, 0.7308F, 0, 1, 5, 0.0F, false));

        this.neck_r18 = new ModelRenderer(this);
        this.neck_r18.setRotationPoint(0.55F, -0.2353F, -2.8852F);
        this.body.addChild(neck_r18);
        this.setRotateAngle(neck_r18, -1.7144F, 0.1276F, -0.464F);
        this.neck_r18.cubeList.add(new ModelBox(neck_r18, 54, 28, 0.4028F, -2.7471F, 4.5067F, 0, 1, 1, 0.0F, false));
        this.neck_r18.cubeList.add(new ModelBox(neck_r18, 54, 31, 0.4028F, -2.7471F, 4.1067F, 0, 1, 1, 0.0F, false));

        this.neck_r19 = new ModelRenderer(this);
        this.neck_r19.setRotationPoint(0.0F, -0.9449F, -1.0224F);
        this.body.addChild(neck_r19);
        this.setRotateAngle(neck_r19, -0.384F, 0.0F, 0.0F);
        this.neck_r19.cubeList.add(new ModelBox(neck_r19, 3, 51, 0.0F, -2.1768F, 1.7997F, 0, 2, 1, 0.0F, false));

        this.neck_r20 = new ModelRenderer(this);
        this.neck_r20.setRotationPoint(0.0F, -1.2449F, -3.0224F);
        this.body.addChild(neck_r20);
        this.setRotateAngle(neck_r20, -0.384F, 0.0F, 0.0F);
        this.neck_r20.cubeList.add(new ModelBox(neck_r20, 51, 9, 0.0F, -2.1768F, 1.7997F, 0, 2, 1, 0.0F, false));

        this.neck_r21 = new ModelRenderer(this);
        this.neck_r21.setRotationPoint(0.0F, -0.9449F, -5.0224F);
        this.body.addChild(neck_r21);
        this.setRotateAngle(neck_r21, -0.384F, 0.0F, 0.0F);
        this.neck_r21.cubeList.add(new ModelBox(neck_r21, 31, 51, 0.0F, -2.1768F, 1.7997F, 0, 2, 1, 0.0F, false));

        this.neck_r22 = new ModelRenderer(this);
        this.neck_r22.setRotationPoint(0.55F, -0.2353F, -2.8852F);
        this.body.addChild(neck_r22);
        this.setRotateAngle(neck_r22, -1.3217F, 0.1276F, -0.464F);
        this.neck_r22.cubeList.add(new ModelBox(neck_r22, 0, 22, 0.408F, -0.9903F, 2.9308F, 0, 1, 2, 0.0F, false));
        this.neck_r22.cubeList.add(new ModelBox(neck_r22, 0, 35, 0.4253F, -0.4903F, 0.7308F, 0, 1, 5, 0.0F, false));

        this.neck_r23 = new ModelRenderer(this);
        this.neck_r23.setRotationPoint(0.55F, -0.2353F, -2.8852F);
        this.body.addChild(neck_r23);
        this.setRotateAngle(neck_r23, -1.4284F, 0.241F, -1.0299F);
        this.neck_r23.cubeList.add(new ModelBox(neck_r23, 55, 34, -0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, false));

        this.bodyfront = new ModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, -0.7F, -3.3F);
        this.body.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0F, -0.1745F, 0.0F);


        this.bodyfront_r1 = new ModelRenderer(this);
        this.bodyfront_r1.setRotationPoint(0.0F, 6.1F, -5.7F);
        this.bodyfront.addChild(bodyfront_r1);
        this.setRotateAngle(bodyfront_r1, -0.0175F, 0.0F, 0.0F);
        this.bodyfront_r1.cubeList.add(new ModelBox(bodyfront_r1, 0, 30, -1.5F, 0.05F, 0.0F, 3, 0, 4, 0.0F, false));

        this.bodyfront_r2 = new ModelRenderer(this);
        this.bodyfront_r2.setRotationPoint(-3.0F, 1.9813F, -2.5949F);
        this.bodyfront.addChild(bodyfront_r2);
        this.setRotateAngle(bodyfront_r2, 1.1257F, 0.0F, 0.0F);
        this.bodyfront_r2.cubeList.add(new ModelBox(bodyfront_r2, 16, 44, -0.5F, -0.989F, -0.0001F, 1, 2, 2, -0.002F, true));
        this.bodyfront_r2.cubeList.add(new ModelBox(bodyfront_r2, 16, 44, 5.5F, -0.989F, -0.0001F, 1, 2, 2, -0.002F, false));

        this.bodyfront_r3 = new ModelRenderer(this);
        this.bodyfront_r3.setRotationPoint(-3.5F, 2.75F, -4.8F);
        this.bodyfront.addChild(bodyfront_r3);
        this.setRotateAngle(bodyfront_r3, 0.6545F, 0.0F, 0.0F);
        this.bodyfront_r3.cubeList.add(new ModelBox(bodyfront_r3, 21, 29, 0.0F, -0.5F, -2.1F, 1, 2, 5, 0.0F, true));
        this.bodyfront_r3.cubeList.add(new ModelBox(bodyfront_r3, 21, 29, 6.0F, -0.5F, -2.1F, 1, 2, 5, 0.0F, false));

        this.bodyfront_r4 = new ModelRenderer(this);
        this.bodyfront_r4.setRotationPoint(-3.0F, 3.9272F, -6.4463F);
        this.bodyfront.addChild(bodyfront_r4);
        this.setRotateAngle(bodyfront_r4, 1.3861F, 0.0262F, -0.6322F);
        this.bodyfront_r4.cubeList.add(new ModelBox(bodyfront_r4, 0, 0, -0.5F, -1.1882F, -1.76F, 1, 5, 2, 0.0F, true));

        this.bodyfront_r5 = new ModelRenderer(this);
        this.bodyfront_r5.setRotationPoint(3.0F, 3.9272F, -6.4463F);
        this.bodyfront.addChild(bodyfront_r5);
        this.setRotateAngle(bodyfront_r5, 1.3861F, -0.0262F, 0.6322F);
        this.bodyfront_r5.cubeList.add(new ModelBox(bodyfront_r5, 0, 0, -0.5F, -1.1882F, -1.76F, 1, 5, 2, 0.0F, false));

        this.bodyfront_r6 = new ModelRenderer(this);
        this.bodyfront_r6.setRotationPoint(0.5F, 0.35F, -4.8F);
        this.bodyfront.addChild(bodyfront_r6);
        this.setRotateAngle(bodyfront_r6, 0.0436F, 0.0F, 0.0F);
        this.bodyfront_r6.cubeList.add(new ModelBox(bodyfront_r6, 32, 17, -1.0F, -0.5F, -0.1F, 1, 1, 5, 0.002F, false));

        this.neck_r24 = new ModelRenderer(this);
        this.neck_r24.setRotationPoint(-0.55F, 0.4647F, -1.5852F);
        this.bodyfront.addChild(neck_r24);
        this.setRotateAngle(neck_r24, -1.6512F, -0.1586F, 0.4549F);
        this.neck_r24.cubeList.add(new ModelBox(neck_r24, 54, 54, -0.4028F, -2.7471F, 4.1067F, 0, 1, 1, 0.0F, true));
        this.neck_r24.cubeList.add(new ModelBox(neck_r24, 48, 54, -0.4028F, -2.7471F, 4.5067F, 0, 1, 1, 0.0F, true));

        this.neck_r25 = new ModelRenderer(this);
        this.neck_r25.setRotationPoint(-0.55F, 0.4647F, -1.5852F);
        this.bodyfront.addChild(neck_r25);
        this.setRotateAngle(neck_r25, -1.2585F, -0.1586F, 0.4549F);
        this.neck_r25.cubeList.add(new ModelBox(neck_r25, 26, 20, -0.408F, -0.9903F, 2.9308F, 0, 1, 2, 0.0F, true));
        this.neck_r25.cubeList.add(new ModelBox(neck_r25, 35, 36, -0.4253F, -0.4903F, 0.7308F, 0, 1, 5, 0.0F, true));

        this.neck_r26 = new ModelRenderer(this);
        this.neck_r26.setRotationPoint(-0.55F, 0.4647F, -1.5852F);
        this.bodyfront.addChild(neck_r26);
        this.setRotateAngle(neck_r26, -1.3908F, -0.3007F, 1.0199F);
        this.neck_r26.cubeList.add(new ModelBox(neck_r26, 35, 55, 0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, true));

        this.neck_r27 = new ModelRenderer(this);
        this.neck_r27.setRotationPoint(-0.55F, 0.4647F, -3.5852F);
        this.bodyfront.addChild(neck_r27);
        this.setRotateAngle(neck_r27, -1.5713F, -0.1964F, 0.4408F);
        this.neck_r27.cubeList.add(new ModelBox(neck_r27, 51, 54, -0.4028F, -2.7471F, 4.5067F, 0, 1, 1, 0.0F, true));
        this.neck_r27.cubeList.add(new ModelBox(neck_r27, 0, 55, -0.4028F, -2.7471F, 4.1067F, 0, 1, 1, 0.0F, true));

        this.neck_r28 = new ModelRenderer(this);
        this.neck_r28.setRotationPoint(-0.55F, 0.4647F, -3.5852F);
        this.bodyfront.addChild(neck_r28);
        this.setRotateAngle(neck_r28, -1.1786F, -0.1964F, 0.4408F);
        this.neck_r28.cubeList.add(new ModelBox(neck_r28, 32, 17, -0.408F, -0.9903F, 2.9308F, 0, 1, 2, 0.0F, true));
        this.neck_r28.cubeList.add(new ModelBox(neck_r28, 18, 37, -0.4253F, -0.4903F, 0.7308F, 0, 1, 5, 0.0F, true));

        this.neck_r29 = new ModelRenderer(this);
        this.neck_r29.setRotationPoint(-0.55F, 0.4647F, -3.5852F);
        this.bodyfront.addChild(neck_r29);
        this.setRotateAngle(neck_r29, -1.3417F, -0.3747F, 1.0036F);
        this.neck_r29.cubeList.add(new ModelBox(neck_r29, 38, 55, 0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, true));

        this.neck_r30 = new ModelRenderer(this);
        this.neck_r30.setRotationPoint(0.55F, 0.4647F, -1.5852F);
        this.bodyfront.addChild(neck_r30);
        this.setRotateAngle(neck_r30, -1.3908F, 0.3007F, -1.0199F);
        this.neck_r30.cubeList.add(new ModelBox(neck_r30, 35, 55, -0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, false));

        this.neck_r31 = new ModelRenderer(this);
        this.neck_r31.setRotationPoint(0.55F, 0.4647F, -1.5852F);
        this.bodyfront.addChild(neck_r31);
        this.setRotateAngle(neck_r31, -1.2585F, 0.1586F, -0.4549F);
        this.neck_r31.cubeList.add(new ModelBox(neck_r31, 35, 36, 0.4253F, -0.4903F, 0.7308F, 0, 1, 5, 0.0F, false));
        this.neck_r31.cubeList.add(new ModelBox(neck_r31, 26, 20, 0.408F, -0.9903F, 2.9308F, 0, 1, 2, 0.0F, false));

        this.neck_r32 = new ModelRenderer(this);
        this.neck_r32.setRotationPoint(0.55F, 0.4647F, -1.5852F);
        this.bodyfront.addChild(neck_r32);
        this.setRotateAngle(neck_r32, -1.6512F, 0.1586F, -0.4549F);
        this.neck_r32.cubeList.add(new ModelBox(neck_r32, 48, 54, 0.4028F, -2.7471F, 4.5067F, 0, 1, 1, 0.0F, false));
        this.neck_r32.cubeList.add(new ModelBox(neck_r32, 54, 54, 0.4028F, -2.7471F, 4.1067F, 0, 1, 1, 0.0F, false));

        this.neck_r33 = new ModelRenderer(this);
        this.neck_r33.setRotationPoint(0.55F, 0.4647F, -3.5852F);
        this.bodyfront.addChild(neck_r33);
        this.setRotateAngle(neck_r33, -1.5713F, 0.1964F, -0.4408F);
        this.neck_r33.cubeList.add(new ModelBox(neck_r33, 51, 54, 0.4028F, -2.7471F, 4.5067F, 0, 1, 1, 0.0F, false));
        this.neck_r33.cubeList.add(new ModelBox(neck_r33, 0, 55, 0.4028F, -2.7471F, 4.1067F, 0, 1, 1, 0.0F, false));

        this.neck_r34 = new ModelRenderer(this);
        this.neck_r34.setRotationPoint(0.55F, 0.4647F, -3.5852F);
        this.bodyfront.addChild(neck_r34);
        this.setRotateAngle(neck_r34, -1.1786F, 0.1964F, -0.4408F);
        this.neck_r34.cubeList.add(new ModelBox(neck_r34, 32, 17, 0.408F, -0.9903F, 2.9308F, 0, 1, 2, 0.0F, false));
        this.neck_r34.cubeList.add(new ModelBox(neck_r34, 18, 37, 0.4253F, -0.4903F, 0.7308F, 0, 1, 5, 0.0F, false));

        this.neck_r35 = new ModelRenderer(this);
        this.neck_r35.setRotationPoint(0.0F, -0.2449F, -3.7224F);
        this.bodyfront.addChild(neck_r35);
        this.setRotateAngle(neck_r35, -0.384F, 0.0F, 0.0F);
        this.neck_r35.cubeList.add(new ModelBox(neck_r35, 34, 51, 0.0F, -1.9768F, 1.7997F, 0, 2, 1, 0.0F, false));

        this.neck_r36 = new ModelRenderer(this);
        this.neck_r36.setRotationPoint(0.0F, -0.2449F, -5.6224F);
        this.bodyfront.addChild(neck_r36);
        this.setRotateAngle(neck_r36, -0.384F, 0.0F, 0.0F);
        this.neck_r36.cubeList.add(new ModelBox(neck_r36, 44, 55, 0.0F, -1.5768F, 1.7997F, 0, 1, 1, 0.0F, false));

        this.neck_r37 = new ModelRenderer(this);
        this.neck_r37.setRotationPoint(0.55F, 0.4647F, -3.5852F);
        this.bodyfront.addChild(neck_r37);
        this.setRotateAngle(neck_r37, -1.3417F, 0.3747F, -1.0036F);
        this.neck_r37.cubeList.add(new ModelBox(neck_r37, 38, 55, -0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, false));

        this.armL = new ModelRenderer(this);
        this.armL.setRotationPoint(3.75F, 4.5F, -5.95F);
        this.bodyfront.addChild(armL);
        this.setRotateAngle(armL, -0.2992F, -0.833F, 0.8226F);
        this.armL.cubeList.add(new ModelBox(armL, 41, 36, 0.0F, -0.8341F, -0.4358F, 3, 1, 2, 0.0F, false));

        this.armL2 = new ModelRenderer(this);
        this.armL2.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 0.0F, 0.829F, 0.1309F);
        this.armL2.cubeList.add(new ModelBox(armL2, 14, 49, -0.0927F, -0.7589F, 0.177F, 2, 1, 1, -0.2F, false));
        this.armL2.cubeList.add(new ModelBox(armL2, 50, 45, 1.6073F, -0.7589F, 0.177F, 1, 1, 1, -0.2F, false));
        this.armL2.cubeList.add(new ModelBox(armL2, 7, 49, -0.0927F, -0.7589F, 0.377F, 2, 1, 1, -0.21F, false));
        this.armL2.cubeList.add(new ModelBox(armL2, 23, 0, 0.0F, -0.75F, -1.0F, 3, 1, 1, 0.0F, false));

        this.handL = new ModelRenderer(this);
        this.handL.setRotationPoint(2.5F, 0.0F, 0.25F);
        this.armL2.addChild(handL);
        this.setRotateAngle(handL, 0.49F, 0.4431F, -0.6164F);


        this.rightfrontfin_r1 = new ModelRenderer(this);
        this.rightfrontfin_r1.setRotationPoint(-0.4293F, 0.0F, 1.5905F);
        this.handL.addChild(rightfrontfin_r1);
        this.setRotateAngle(rightfrontfin_r1, 0.0F, -1.5795F, 0.0F);
        this.rightfrontfin_r1.cubeList.add(new ModelBox(rightfrontfin_r1, 43, 45, -1.0F, -0.5F, -0.3F, 2, 1, 1, -0.3F, false));

        this.rightfrontfin_r2 = new ModelRenderer(this);
        this.rightfrontfin_r2.setRotationPoint(0.0702F, 0.0F, 1.8561F);
        this.handL.addChild(rightfrontfin_r2);
        this.setRotateAngle(rightfrontfin_r2, 0.0F, -1.2741F, 0.0F);
        this.rightfrontfin_r2.cubeList.add(new ModelBox(rightfrontfin_r2, 9, 46, -1.4F, -0.5F, -0.7F, 2, 1, 1, -0.3F, false));

        this.rightfrontfin_r3 = new ModelRenderer(this);
        this.rightfrontfin_r3.setRotationPoint(0.9546F, 0.0F, 1.1944F);
        this.handL.addChild(rightfrontfin_r3);
        this.setRotateAngle(rightfrontfin_r3, 0.0F, -0.9687F, 0.0F);
        this.rightfrontfin_r3.cubeList.add(new ModelBox(rightfrontfin_r3, 46, 24, -1.1F, -0.5F, -0.4F, 2, 1, 1, -0.3F, false));

        this.rightfrontfin_r4 = new ModelRenderer(this);
        this.rightfrontfin_r4.setRotationPoint(1.4203F, 0.0F, 0.8031F);
        this.handL.addChild(rightfrontfin_r4);
        this.setRotateAngle(rightfrontfin_r4, 0.0F, -0.7069F, 0.0F);
        this.rightfrontfin_r4.cubeList.add(new ModelBox(rightfrontfin_r4, 47, 15, -1.1F, -0.5F, -0.5F, 2, 1, 1, -0.3F, false));

        this.rightfrontfin_r5 = new ModelRenderer(this);
        this.rightfrontfin_r5.setRotationPoint(1.6964F, 0.0F, 0.4969F);
        this.handL.addChild(rightfrontfin_r5);
        this.setRotateAngle(rightfrontfin_r5, 0.0F, -0.4887F, 0.0F);
        this.rightfrontfin_r5.cubeList.add(new ModelBox(rightfrontfin_r5, 23, 47, -1.1F, -0.5F, -0.8F, 2, 1, 1, -0.3F, false));

        this.rightfrontfin_r6 = new ModelRenderer(this);
        this.rightfrontfin_r6.setRotationPoint(2.0F, 0.0F, -0.25F);
        this.handL.addChild(rightfrontfin_r6);
        this.setRotateAngle(rightfrontfin_r6, 0.0F, -0.2618F, 0.0F);
        this.rightfrontfin_r6.cubeList.add(new ModelBox(rightfrontfin_r6, 47, 29, -1.1F, -0.5F, -0.7F, 2, 1, 1, -0.3F, false));

        this.rightfrontfin_r7 = new ModelRenderer(this);
        this.rightfrontfin_r7.setRotationPoint(2.0F, 0.0F, -1.25F);
        this.handL.addChild(rightfrontfin_r7);
        this.setRotateAngle(rightfrontfin_r7, 0.0F, 0.1571F, 0.0F);
        this.rightfrontfin_r7.cubeList.add(new ModelBox(rightfrontfin_r7, 0, 48, -1.2F, -0.5F, -0.5F, 2, 1, 1, -0.3F, false));

        this.armL3 = new ModelRenderer(this);
        this.armL3.setRotationPoint(-3.75F, 4.5F, -5.95F);
        this.bodyfront.addChild(armL3);
        this.setRotateAngle(armL3, 0.406F, 0.9778F, -0.6259F);
        this.armL3.cubeList.add(new ModelBox(armL3, 41, 36, -3.0F, -0.8341F, -0.4358F, 3, 1, 2, 0.0F, true));

        this.armL4 = new ModelRenderer(this);
        this.armL4.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.armL3.addChild(armL4);
        this.setRotateAngle(armL4, 0.0948F, -0.8249F, -0.2597F);
        this.armL4.cubeList.add(new ModelBox(armL4, 14, 49, -1.9073F, -0.7589F, 0.177F, 2, 1, 1, -0.2F, true));
        this.armL4.cubeList.add(new ModelBox(armL4, 50, 45, -2.6073F, -0.7589F, 0.177F, 1, 1, 1, -0.2F, true));
        this.armL4.cubeList.add(new ModelBox(armL4, 7, 49, -1.9073F, -0.7589F, 0.377F, 2, 1, 1, -0.21F, true));
        this.armL4.cubeList.add(new ModelBox(armL4, 23, 0, -3.0F, -0.75F, -1.0F, 3, 1, 1, 0.0F, true));

        this.handL2 = new ModelRenderer(this);
        this.handL2.setRotationPoint(-2.5F, 0.0F, 0.25F);
        this.armL4.addChild(handL2);
        this.setRotateAngle(handL2, -0.0211F, -0.4172F, 1.0952F);


        this.rightfrontfin_r8 = new ModelRenderer(this);
        this.rightfrontfin_r8.setRotationPoint(0.4293F, 0.0F, 1.5905F);
        this.handL2.addChild(rightfrontfin_r8);
        this.setRotateAngle(rightfrontfin_r8, 0.0F, 1.5795F, 0.0F);
        this.rightfrontfin_r8.cubeList.add(new ModelBox(rightfrontfin_r8, 43, 45, -1.0F, -0.5F, -0.3F, 2, 1, 1, -0.3F, true));

        this.rightfrontfin_r9 = new ModelRenderer(this);
        this.rightfrontfin_r9.setRotationPoint(-0.0702F, 0.0F, 1.8561F);
        this.handL2.addChild(rightfrontfin_r9);
        this.setRotateAngle(rightfrontfin_r9, 0.0F, 1.2741F, 0.0F);
        this.rightfrontfin_r9.cubeList.add(new ModelBox(rightfrontfin_r9, 9, 46, -0.6F, -0.5F, -0.7F, 2, 1, 1, -0.3F, true));

        this.rightfrontfin_r10 = new ModelRenderer(this);
        this.rightfrontfin_r10.setRotationPoint(-0.9546F, 0.0F, 1.1944F);
        this.handL2.addChild(rightfrontfin_r10);
        this.setRotateAngle(rightfrontfin_r10, 0.0F, 0.9687F, 0.0F);
        this.rightfrontfin_r10.cubeList.add(new ModelBox(rightfrontfin_r10, 46, 24, -0.9F, -0.5F, -0.4F, 2, 1, 1, -0.3F, true));

        this.rightfrontfin_r11 = new ModelRenderer(this);
        this.rightfrontfin_r11.setRotationPoint(-1.4203F, 0.0F, 0.8031F);
        this.handL2.addChild(rightfrontfin_r11);
        this.setRotateAngle(rightfrontfin_r11, 0.0F, 0.7069F, 0.0F);
        this.rightfrontfin_r11.cubeList.add(new ModelBox(rightfrontfin_r11, 47, 15, -0.9F, -0.5F, -0.5F, 2, 1, 1, -0.3F, true));

        this.rightfrontfin_r12 = new ModelRenderer(this);
        this.rightfrontfin_r12.setRotationPoint(-1.6964F, 0.0F, 0.4969F);
        this.handL2.addChild(rightfrontfin_r12);
        this.setRotateAngle(rightfrontfin_r12, 0.0F, 0.4887F, 0.0F);
        this.rightfrontfin_r12.cubeList.add(new ModelBox(rightfrontfin_r12, 23, 47, -0.9F, -0.5F, -0.8F, 2, 1, 1, -0.3F, true));

        this.rightfrontfin_r13 = new ModelRenderer(this);
        this.rightfrontfin_r13.setRotationPoint(-2.0F, 0.0F, -0.25F);
        this.handL2.addChild(rightfrontfin_r13);
        this.setRotateAngle(rightfrontfin_r13, 0.0F, 0.2618F, 0.0F);
        this.rightfrontfin_r13.cubeList.add(new ModelBox(rightfrontfin_r13, 47, 29, -0.9F, -0.5F, -0.7F, 2, 1, 1, -0.3F, true));

        this.rightfrontfin_r14 = new ModelRenderer(this);
        this.rightfrontfin_r14.setRotationPoint(-2.0F, 0.0F, -1.25F);
        this.handL2.addChild(rightfrontfin_r14);
        this.setRotateAngle(rightfrontfin_r14, 0.0F, -0.1571F, 0.0F);
        this.rightfrontfin_r14.cubeList.add(new ModelBox(rightfrontfin_r14, 0, 48, -0.8F, -0.5F, -0.5F, 2, 1, 1, -0.3F, true));

        this.bodyfront2 = new ModelRenderer(this);
        this.bodyfront2.setRotationPoint(0.0F, 0.2F, -4.9F);
        this.bodyfront.addChild(bodyfront2);
        this.setRotateAngle(bodyfront2, -0.1309F, -0.2182F, 0.0F);


        this.neck_r38 = new ModelRenderer(this);
        this.neck_r38.setRotationPoint(0.0F, 5.3F, -3.85F);
        this.bodyfront2.addChild(neck_r38);
        this.setRotateAngle(neck_r38, -0.0873F, 0.0F, 0.0F);
        this.neck_r38.cubeList.add(new ModelBox(neck_r38, 29, 29, -2.0F, -0.5F, 1.05F, 4, 1, 3, 0.0F, false));

        this.neck_r39 = new ModelRenderer(this);
        this.neck_r39.setRotationPoint(0.0F, -0.6449F, -2.7224F);
        this.bodyfront2.addChild(neck_r39);
        this.setRotateAngle(neck_r39, -0.384F, 0.0F, 0.0F);
        this.neck_r39.cubeList.add(new ModelBox(neck_r39, 55, 47, 0.0F, -1.5768F, 1.7997F, 0, 1, 1, 0.0F, false));
        this.neck_r39.cubeList.add(new ModelBox(neck_r39, 55, 40, 0.0F, -0.9625F, -0.1063F, 0, 1, 1, 0.0F, false));

        this.neck_r40 = new ModelRenderer(this);
        this.neck_r40.setRotationPoint(-0.5F, 0.3482F, -0.7574F);
        this.bodyfront2.addChild(neck_r40);
        this.setRotateAngle(neck_r40, -0.9599F, -0.6419F, 0.7074F);
        this.neck_r40.cubeList.add(new ModelBox(neck_r40, 0, 35, 0.0F, -0.5487F, -0.103F, 0, 1, 2, 0.0F, true));

        this.neck_r41 = new ModelRenderer(this);
        this.neck_r41.setRotationPoint(-0.5F, 0.3482F, -2.7574F);
        this.bodyfront2.addChild(neck_r41);
        this.setRotateAngle(neck_r41, -0.7465F, -0.2611F, 0.2344F);
        this.neck_r41.cubeList.add(new ModelBox(neck_r41, 27, 53, 0.0F, -0.5487F, -0.103F, 0, 1, 1, 0.0F, true));

        this.neck_r42 = new ModelRenderer(this);
        this.neck_r42.setRotationPoint(0.5F, 0.3482F, -0.7574F);
        this.bodyfront2.addChild(neck_r42);
        this.setRotateAngle(neck_r42, -0.9599F, 0.6419F, -0.7074F);
        this.neck_r42.cubeList.add(new ModelBox(neck_r42, 0, 35, 0.0F, -0.5487F, -0.103F, 0, 1, 2, 0.0F, false));

        this.neck_r43 = new ModelRenderer(this);
        this.neck_r43.setRotationPoint(0.5F, 0.3482F, -2.7574F);
        this.bodyfront2.addChild(neck_r43);
        this.setRotateAngle(neck_r43, -0.7465F, 0.2611F, -0.2344F);
        this.neck_r43.cubeList.add(new ModelBox(neck_r43, 27, 53, 0.0F, -0.5487F, -0.103F, 0, 1, 1, 0.0F, false));

        this.neck_r44 = new ModelRenderer(this);
        this.neck_r44.setRotationPoint(0.0F, -0.6449F, -2.7224F);
        this.bodyfront2.addChild(neck_r44);
        this.setRotateAngle(neck_r44, -0.1222F, 0.0F, 0.0F);
        this.neck_r44.cubeList.add(new ModelBox(neck_r44, 34, 43, -0.5F, -0.0551F, -0.0776F, 1, 1, 3, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4F, -2.65F);
        this.bodyfront2.addChild(head);
        this.setRotateAngle(head, -0.219F, -0.0852F, 0.0189F);
        this.head.cubeList.add(new ModelBox(head, 11, 12, -2.5F, -1.2271F, -5.0464F, 5, 2, 5, 0.01F, false));

        this.head_r1 = new ModelRenderer(this);
        this.head_r1.setRotationPoint(-3.4134F, 1.2072F, -0.3799F);
        this.head.addChild(head_r1);
        this.setRotateAngle(head_r1, 0.0785F, -0.3054F, 0.0F);
        this.head_r1.cubeList.add(new ModelBox(head_r1, 0, 17, -1.0F, -0.6F, -0.6F, 2, 1, 1, -0.001F, true));

        this.head_r2 = new ModelRenderer(this);
        this.head_r2.setRotationPoint(-2.9519F, 1.2015F, -4.0435F);
        this.head.addChild(head_r2);
        this.setRotateAngle(head_r2, -0.1396F, -0.3054F, 0.0F);
        this.head_r2.cubeList.add(new ModelBox(head_r2, 38, 24, -0.3384F, -1.0F, 0.0982F, 2, 1, 3, -0.002F, true));

        this.head_r3 = new ModelRenderer(this);
        this.head_r3.setRotationPoint(-1.5F, 25.6744F, -9.6638F);
        this.head.addChild(head_r3);
        this.setRotateAngle(head_r3, 0.0F, -0.3054F, 0.0F);
        this.head_r3.cubeList.add(new ModelBox(head_r3, 15, 0, 0.5F, -24.65F, 0.1F, 0, 1, 7, 0.0F, true));
        this.head_r3.cubeList.add(new ModelBox(head_r3, 0, 0, -0.0331F, -25.4729F, -0.105F, 2, 1, 10, 0.001F, true));

        this.head_r4 = new ModelRenderer(this);
        this.head_r4.setRotationPoint(1.5F, 25.6744F, -9.6638F);
        this.head.addChild(head_r4);
        this.setRotateAngle(head_r4, 0.0F, 0.3054F, 0.0F);
        this.head_r4.cubeList.add(new ModelBox(head_r4, 15, 0, -0.5F, -24.65F, 0.1F, 0, 1, 7, 0.0F, false));
        this.head_r4.cubeList.add(new ModelBox(head_r4, 0, 0, -1.9669F, -25.4729F, -0.105F, 2, 1, 10, 0.0F, false));

        this.head_r5 = new ModelRenderer(this);
        this.head_r5.setRotationPoint(2.9519F, 1.2015F, -4.0435F);
        this.head.addChild(head_r5);
        this.setRotateAngle(head_r5, -0.1396F, 0.3054F, 0.0F);
        this.head_r5.cubeList.add(new ModelBox(head_r5, 38, 24, -1.6616F, -1.0F, 0.0982F, 2, 1, 3, -0.002F, false));

        this.head_r6 = new ModelRenderer(this);
        this.head_r6.setRotationPoint(3.4134F, 1.2072F, -0.3799F);
        this.head.addChild(head_r6);
        this.setRotateAngle(head_r6, 0.0785F, 0.3054F, 0.0F);
        this.head_r6.cubeList.add(new ModelBox(head_r6, 0, 17, -1.0F, -0.6F, -0.6F, 2, 1, 1, -0.001F, false));

        this.head_r7 = new ModelRenderer(this);
        this.head_r7.setRotationPoint(0.0F, -1.2271F, -4.9464F);
        this.head.addChild(head_r7);
        this.setRotateAngle(head_r7, 0.192F, 0.0F, 0.0F);
        this.head_r7.cubeList.add(new ModelBox(head_r7, 38, 11, -2.5F, 0.0F, -1.1F, 5, 2, 1, 0.0F, false));

        this.upperjaw1 = new ModelRenderer(this);
        this.upperjaw1.setRotationPoint(0.0F, 0.9744F, -4.6638F);
        this.head.addChild(upperjaw1);
        this.upperjaw1.cubeList.add(new ModelBox(upperjaw1, 14, 20, -1.5F, -0.7729F, -5.1164F, 3, 1, 5, -0.01F, false));

        this.snout = new ModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 0.4F, 0.4F);
        this.upperjaw1.addChild(snout);
        this.setRotateAngle(snout, 0.1852F, 0.0F, -0.0035F);


        this.snout_r1 = new ModelRenderer(this);
        this.snout_r1.setRotationPoint(-0.0017F, -2.2282F, -5.1064F);
        this.snout.addChild(snout_r1);
        this.setRotateAngle(snout_r1, 0.1222F, 0.0F, 0.0F);
        this.snout_r1.cubeList.add(new ModelBox(snout_r1, 9, 22, -1.5026F, 0.7326F, 2.901F, 3, 1, 1, 0.0F, false));
        this.snout_r1.cubeList.add(new ModelBox(snout_r1, 11, 27, -1.5003F, 0.0255F, -0.1055F, 3, 1, 4, 0.0F, false));

        this.lowerjaw1 = new ModelRenderer(this);
        this.lowerjaw1.setRotationPoint(0.0F, 1.4744F, 0.3362F);
        this.head.addChild(lowerjaw1);
        this.setRotateAngle(lowerjaw1, 0.6545F, 0.0F, 0.0F);


        this.lowerjaw3_r1 = new ModelRenderer(this);
        this.lowerjaw3_r1.setRotationPoint(-3.3284F, 1.4F, -0.8058F);
        this.lowerjaw1.addChild(lowerjaw3_r1);
        this.setRotateAngle(lowerjaw3_r1, -0.7854F, -0.2618F, 0.0F);
        this.lowerjaw3_r1.cubeList.add(new ModelBox(lowerjaw3_r1, 32, 0, -0.5F, -0.3F, -1.0F, 1, 1, 1, -0.02F, true));
        this.lowerjaw3_r1.cubeList.add(new ModelBox(lowerjaw3_r1, 9, 25, -0.5F, -0.8F, -1.0F, 1, 1, 1, 0.0F, true));

        this.lowerjaw2_r1 = new ModelRenderer(this);
        this.lowerjaw2_r1.setRotationPoint(0.0F, 24.0F, 11.5F);
        this.lowerjaw1.addChild(lowerjaw2_r1);
        this.setRotateAngle(lowerjaw2_r1, 0.0F, -0.2618F, 0.0F);
        this.lowerjaw2_r1.cubeList.add(new ModelBox(lowerjaw2_r1, 40, 30, -6.9F, -23.1F, -15.525F, 1, 1, 4, 0.01F, true));

        this.lowerjaw3_r2 = new ModelRenderer(this);
        this.lowerjaw3_r2.setRotationPoint(3.3284F, 1.4F, -0.8058F);
        this.lowerjaw1.addChild(lowerjaw3_r2);
        this.setRotateAngle(lowerjaw3_r2, -0.7854F, 0.2618F, 0.0F);
        this.lowerjaw3_r2.cubeList.add(new ModelBox(lowerjaw3_r2, 9, 25, -0.5F, -0.8F, -1.0F, 1, 1, 1, 0.0F, false));
        this.lowerjaw3_r2.cubeList.add(new ModelBox(lowerjaw3_r2, 32, 0, -0.5F, -0.3F, -1.0F, 1, 1, 1, -0.02F, false));

        this.lowerjaw1_r1 = new ModelRenderer(this);
        this.lowerjaw1_r1.setRotationPoint(0.0F, 24.0F, 11.5F);
        this.lowerjaw1.addChild(lowerjaw1_r1);
        this.setRotateAngle(lowerjaw1_r1, 0.0F, 0.2618F, 0.0F);
        this.lowerjaw1_r1.cubeList.add(new ModelBox(lowerjaw1_r1, 40, 30, 5.9F, -23.1F, -15.525F, 1, 1, 4, 0.01F, false));

        this.lowerjaw2 = new ModelRenderer(this);
        this.lowerjaw2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.lowerjaw1.addChild(lowerjaw2);
        this.lowerjaw2.cubeList.add(new ModelBox(lowerjaw2, 45, 21, -1.505F, 0.0F, -4.9F, 3, 1, 1, 0.0F, false));
        this.lowerjaw2.cubeList.add(new ModelBox(lowerjaw2, 15, 5, -1.505F, -0.7F, -4.65F, 3, 1, 0, 0.0F, false));

        this.lowerjaw6_r1 = new ModelRenderer(this);
        this.lowerjaw6_r1.setRotationPoint(-1.5F, 1.0F, -4.9F);
        this.lowerjaw2.addChild(lowerjaw6_r1);
        this.setRotateAngle(lowerjaw6_r1, 0.0F, -0.2618F, 0.0F);
        this.lowerjaw6_r1.cubeList.add(new ModelBox(lowerjaw6_r1, 23, 3, -0.005F, -1.01F, 8.0F, 1, 1, 2, 0.01F, true));
        this.lowerjaw6_r1.cubeList.add(new ModelBox(lowerjaw6_r1, 25, 21, 0.245F, -1.3F, 1.55F, 0, 1, 6, 0.0F, true));
        this.lowerjaw6_r1.cubeList.add(new ModelBox(lowerjaw6_r1, 15, 0, 0.245F, -1.7F, 0.25F, 0, 1, 1, 0.0F, true));
        this.lowerjaw6_r1.cubeList.add(new ModelBox(lowerjaw6_r1, 26, 50, -0.005F, -1.01F, 0.0F, 1, 1, 1, 0.011F, true));

        this.lowerjaw6_r2 = new ModelRenderer(this);
        this.lowerjaw6_r2.setRotationPoint(-1.5F, 1.0F, -4.9F);
        this.lowerjaw2.addChild(lowerjaw6_r2);
        this.setRotateAngle(lowerjaw6_r2, -0.096F, -0.2618F, 0.0F);
        this.lowerjaw6_r2.cubeList.add(new ModelBox(lowerjaw6_r2, 0, 12, -0.005F, -1.0F, 0.0F, 1, 1, 8, -0.002F, true));

        this.lowerjaw7_r1 = new ModelRenderer(this);
        this.lowerjaw7_r1.setRotationPoint(-1.669F, -0.01F, -3.9571F);
        this.lowerjaw2.addChild(lowerjaw7_r1);
        this.setRotateAngle(lowerjaw7_r1, -0.0524F, -0.2618F, 0.0F);
        this.lowerjaw7_r1.cubeList.add(new ModelBox(lowerjaw7_r1, 40, 15, -0.0859F, 0.0F, 0.0455F, 1, 1, 4, 0.01F, true));

        this.lowerjaw5_r1 = new ModelRenderer(this);
        this.lowerjaw5_r1.setRotationPoint(-2.4454F, -0.01F, 2.8407F);
        this.lowerjaw2.addChild(lowerjaw5_r1);
        this.setRotateAngle(lowerjaw5_r1, 0.0524F, -0.2618F, 0.0F);
        this.lowerjaw5_r1.cubeList.add(new ModelBox(lowerjaw5_r1, 7, 40, -1.0953F, 0.0F, -3.7216F, 1, 1, 4, 0.0F, true));

        this.lowerjaw5_r2 = new ModelRenderer(this);
        this.lowerjaw5_r2.setRotationPoint(1.5F, 1.0F, -4.9F);
        this.lowerjaw2.addChild(lowerjaw5_r2);
        this.setRotateAngle(lowerjaw5_r2, -0.096F, 0.2618F, 0.0F);
        this.lowerjaw5_r2.cubeList.add(new ModelBox(lowerjaw5_r2, 0, 12, -0.995F, -1.0F, 0.0F, 1, 1, 8, -0.002F, false));

        this.lowerjaw5_r3 = new ModelRenderer(this);
        this.lowerjaw5_r3.setRotationPoint(1.5F, 1.0F, -4.9F);
        this.lowerjaw2.addChild(lowerjaw5_r3);
        this.setRotateAngle(lowerjaw5_r3, 0.0F, 0.2618F, 0.0F);
        this.lowerjaw5_r3.cubeList.add(new ModelBox(lowerjaw5_r3, 23, 3, -0.995F, -1.01F, 8.0F, 1, 1, 2, 0.01F, false));
        this.lowerjaw5_r3.cubeList.add(new ModelBox(lowerjaw5_r3, 26, 50, -0.995F, -1.01F, 0.0F, 1, 1, 1, 0.011F, false));
        this.lowerjaw5_r3.cubeList.add(new ModelBox(lowerjaw5_r3, 15, 0, -0.245F, -1.7F, 0.25F, 0, 1, 1, 0.0F, false));
        this.lowerjaw5_r3.cubeList.add(new ModelBox(lowerjaw5_r3, 25, 21, -0.245F, -1.3F, 1.55F, 0, 1, 6, 0.0F, false));

        this.lowerjaw6_r3 = new ModelRenderer(this);
        this.lowerjaw6_r3.setRotationPoint(1.669F, -0.01F, -3.9571F);
        this.lowerjaw2.addChild(lowerjaw6_r3);
        this.setRotateAngle(lowerjaw6_r3, -0.0524F, 0.2618F, 0.0F);
        this.lowerjaw6_r3.cubeList.add(new ModelBox(lowerjaw6_r3, 40, 15, -0.9141F, 0.0F, 0.0455F, 1, 1, 4, 0.01F, false));

        this.lowerjaw4_r1 = new ModelRenderer(this);
        this.lowerjaw4_r1.setRotationPoint(2.4454F, -0.01F, 2.8407F);
        this.lowerjaw2.addChild(lowerjaw4_r1);
        this.setRotateAngle(lowerjaw4_r1, 0.0524F, 0.2618F, 0.0F);
        this.lowerjaw4_r1.cubeList.add(new ModelBox(lowerjaw4_r1, 7, 40, 0.0953F, 0.0F, -3.7216F, 1, 1, 4, 0.0F, false));

        this.underjaw = new ModelRenderer(this);
        this.underjaw.setRotationPoint(0.0F, 0.5F, -2.7F);
        this.lowerjaw2.addChild(underjaw);
        this.setRotateAngle(underjaw, -0.2037F, 0.0F, 0.0F);


        this.underjaw_r1 = new ModelRenderer(this);
        this.underjaw_r1.setRotationPoint(0.0F, 0.925F, -2.05F);
        this.underjaw.addChild(underjaw_r1);
        this.setRotateAngle(underjaw_r1, 0.0087F, -0.2618F, 0.0F);
        this.underjaw_r1.cubeList.add(new ModelBox(underjaw_r1, 10, 33, -1.4F, -0.975F, 0.3F, 1, 1, 5, -0.01F, true));

        this.underjaw_r2 = new ModelRenderer(this);
        this.underjaw_r2.setRotationPoint(0.0F, 0.925F, -2.05F);
        this.underjaw.addChild(underjaw_r2);
        this.setRotateAngle(underjaw_r2, 0.0087F, 0.2618F, 0.0F);
        this.underjaw_r2.cubeList.add(new ModelBox(underjaw_r2, 10, 33, 0.4F, -0.975F, 0.3F, 1, 1, 5, -0.01F, false));

        this.bodyrear = new ModelRenderer(this);
        this.bodyrear.setRotationPoint(0.0F, -0.6F, 2.2F);
        this.body.addChild(bodyrear);
        this.setRotateAngle(bodyrear, 0.0436F, 0.0F, 0.0F);
        this.bodyrear.cubeList.add(new ModelBox(bodyrear, 25, 3, -0.5F, -0.4379F, -0.0772F, 1, 1, 6, 0.002F, false));

        this.neck_r45 = new ModelRenderer(this);
        this.neck_r45.setRotationPoint(-0.55F, 0.1768F, 5.0376F);
        this.bodyrear.addChild(neck_r45);
        this.setRotateAngle(neck_r45, -1.6018F, 0.0161F, 0.4797F);
        this.neck_r45.cubeList.add(new ModelBox(neck_r45, 40, 43, -0.4253F, -0.4903F, 0.7308F, 0, 1, 1, 0.0F, true));

        this.neck_r46 = new ModelRenderer(this);
        this.neck_r46.setRotationPoint(-0.55F, 0.1768F, 5.0376F);
        this.bodyrear.addChild(neck_r46);
        this.setRotateAngle(neck_r46, -1.5883F, 0.0302F, 1.0469F);
        this.neck_r46.cubeList.add(new ModelBox(neck_r46, 55, 15, 0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, true));

        this.neck_r47 = new ModelRenderer(this);
        this.neck_r47.setRotationPoint(-0.55F, 0.1768F, 3.0376F);
        this.bodyrear.addChild(neck_r47);
        this.setRotateAngle(neck_r47, -1.4468F, -0.0643F, 0.476F);
        this.neck_r47.cubeList.add(new ModelBox(neck_r47, 51, 32, -0.4253F, -0.4903F, 0.7308F, 0, 1, 1, 0.0F, true));

        this.neck_r48 = new ModelRenderer(this);
        this.neck_r48.setRotationPoint(-0.55F, 0.1768F, 3.0376F);
        this.bodyrear.addChild(neck_r48);
        this.setRotateAngle(neck_r48, -1.5006F, -0.1208F, 1.043F);
        this.neck_r48.cubeList.add(new ModelBox(neck_r48, 55, 20, 0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, true));

        this.neck_r49 = new ModelRenderer(this);
        this.neck_r49.setRotationPoint(-0.15F, -0.5232F, 0.8376F);
        this.bodyrear.addChild(neck_r49);
        this.setRotateAngle(neck_r49, -1.8395F, -0.0643F, 0.476F);
        this.neck_r49.cubeList.add(new ModelBox(neck_r49, 55, 44, -0.4028F, -2.0471F, 2.5067F, 0, 1, 1, 0.0F, true));

        this.neck_r50 = new ModelRenderer(this);
        this.neck_r50.setRotationPoint(-0.55F, 0.1768F, 1.0376F);
        this.bodyrear.addChild(neck_r50);
        this.setRotateAngle(neck_r50, -1.4468F, -0.0643F, 0.476F);
        this.neck_r50.cubeList.add(new ModelBox(neck_r50, 15, 0, -0.4253F, -0.4903F, 0.7308F, 0, 1, 3, 0.0F, true));

        this.neck_r51 = new ModelRenderer(this);
        this.neck_r51.setRotationPoint(-0.55F, 0.1768F, 1.0376F);
        this.bodyrear.addChild(neck_r51);
        this.setRotateAngle(neck_r51, -1.5006F, -0.1208F, 1.043F);
        this.neck_r51.cubeList.add(new ModelBox(neck_r51, 55, 25, 0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, true));

        this.neck_r52 = new ModelRenderer(this);
        this.neck_r52.setRotationPoint(0.55F, 0.1768F, 5.0376F);
        this.bodyrear.addChild(neck_r52);
        this.setRotateAngle(neck_r52, -1.5883F, -0.0302F, -1.0469F);
        this.neck_r52.cubeList.add(new ModelBox(neck_r52, 55, 15, -0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, false));

        this.neck_r53 = new ModelRenderer(this);
        this.neck_r53.setRotationPoint(0.55F, 0.1768F, 5.0376F);
        this.bodyrear.addChild(neck_r53);
        this.setRotateAngle(neck_r53, -1.6018F, -0.0161F, -0.4797F);
        this.neck_r53.cubeList.add(new ModelBox(neck_r53, 40, 43, 0.4253F, -0.4903F, 0.7308F, 0, 1, 1, 0.0F, false));

        this.neck_r54 = new ModelRenderer(this);
        this.neck_r54.setRotationPoint(0.55F, 0.1768F, 3.0376F);
        this.bodyrear.addChild(neck_r54);
        this.setRotateAngle(neck_r54, -1.5006F, 0.1208F, -1.043F);
        this.neck_r54.cubeList.add(new ModelBox(neck_r54, 55, 20, -0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, false));

        this.neck_r55 = new ModelRenderer(this);
        this.neck_r55.setRotationPoint(0.55F, 0.1768F, 3.0376F);
        this.bodyrear.addChild(neck_r55);
        this.setRotateAngle(neck_r55, -1.4468F, 0.0643F, -0.476F);
        this.neck_r55.cubeList.add(new ModelBox(neck_r55, 51, 32, 0.4253F, -0.4903F, 0.7308F, 0, 1, 1, 0.0F, false));

        this.neck_r56 = new ModelRenderer(this);
        this.neck_r56.setRotationPoint(0.55F, 0.1768F, 1.0376F);
        this.bodyrear.addChild(neck_r56);
        this.setRotateAngle(neck_r56, -1.4468F, 0.0643F, -0.476F);
        this.neck_r56.cubeList.add(new ModelBox(neck_r56, 15, 0, 0.4253F, -0.4903F, 0.7308F, 0, 1, 3, 0.0F, false));

        this.neck_r57 = new ModelRenderer(this);
        this.neck_r57.setRotationPoint(0.15F, -0.5232F, 0.8376F);
        this.bodyrear.addChild(neck_r57);
        this.setRotateAngle(neck_r57, -1.8395F, 0.0643F, -0.476F);
        this.neck_r57.cubeList.add(new ModelBox(neck_r57, 55, 44, 0.4028F, -2.0471F, 2.5067F, 0, 1, 1, 0.0F, false));

        this.neck_r58 = new ModelRenderer(this);
        this.neck_r58.setRotationPoint(0.0F, -0.3489F, 4.8216F);
        this.bodyrear.addChild(neck_r58);
        this.setRotateAngle(neck_r58, 0.2094F, 0.0F, 0.0F);
        this.neck_r58.cubeList.add(new ModelBox(neck_r58, 12, 52, 0.0F, -1.0009F, -0.5015F, 0, 2, 1, 0.0F, false));

        this.neck_r59 = new ModelRenderer(this);
        this.neck_r59.setRotationPoint(0.0F, -0.4996F, 3.1019F);
        this.bodyrear.addChild(neck_r59);
        this.setRotateAngle(neck_r59, 0.0175F, 0.0F, 0.0F);
        this.neck_r59.cubeList.add(new ModelBox(neck_r59, 15, 52, 0.0F, -0.8548F, -0.557F, 0, 2, 1, 0.0F, false));

        this.neck_r60 = new ModelRenderer(this);
        this.neck_r60.setRotationPoint(0.0F, -0.3166F, 1.0099F);
        this.bodyrear.addChild(neck_r60);
        this.setRotateAngle(neck_r60, -0.0873F, 0.0F, 0.0F);
        this.neck_r60.cubeList.add(new ModelBox(neck_r60, 18, 52, 0.0F, -1.0816F, -0.3497F, 0, 2, 1, 0.0F, false));

        this.neck_r61 = new ModelRenderer(this);
        this.neck_r61.setRotationPoint(0.55F, 0.1768F, 1.0376F);
        this.bodyrear.addChild(neck_r61);
        this.setRotateAngle(neck_r61, -1.5006F, 0.1208F, -1.043F);
        this.neck_r61.cubeList.add(new ModelBox(neck_r61, 55, 25, -0.0356F, -0.4903F, -0.1556F, 0, 1, 1, 0.0F, false));

        this.tailbase = new ModelRenderer(this);
        this.tailbase.setRotationPoint(0.0F, 0.0121F, 5.9228F);
        this.bodyrear.addChild(tailbase);
        this.setRotateAngle(tailbase, 0.0436F, 0.1745F, 0.0F);


        this.tailbase_r1 = new ModelRenderer(this);
        this.tailbase_r1.setRotationPoint(-1.9F, 0.4552F, 1.3295F);
        this.tailbase.addChild(tailbase_r1);
        this.setRotateAngle(tailbase_r1, 0.8536F, -0.0889F, 0.3011F);
        this.tailbase_r1.cubeList.add(new ModelBox(tailbase_r1, 0, 12, -0.2102F, -1.0776F, -1.0F, 1, 2, 2, 0.0F, true));

        this.tailbase_r2 = new ModelRenderer(this);
        this.tailbase_r2.setRotationPoint(0.0F, 0.6242F, -0.1553F);
        this.tailbase.addChild(tailbase_r2);
        this.setRotateAngle(tailbase_r2, 0.1047F, 0.0F, 0.0F);
        this.tailbase_r2.cubeList.add(new ModelBox(tailbase_r2, 41, 4, -2.4F, -0.0218F, -0.023F, 1, 1, 4, 0.0F, true));
        this.tailbase_r2.cubeList.add(new ModelBox(tailbase_r2, 30, 41, -2.4F, 0.978F, -0.0405F, 1, 1, 2, 0.0F, true));
        this.tailbase_r2.cubeList.add(new ModelBox(tailbase_r2, 27, 11, -1.6F, 3.7779F, -0.0544F, 3, 1, 4, -0.02F, false));
        this.tailbase_r2.cubeList.add(new ModelBox(tailbase_r2, 30, 41, 1.4F, 0.978F, -0.0405F, 1, 1, 2, 0.0F, false));
        this.tailbase_r2.cubeList.add(new ModelBox(tailbase_r2, 41, 4, 1.4F, -0.0218F, -0.023F, 1, 1, 4, 0.0F, false));

        this.tailbase_r3 = new ModelRenderer(this);
        this.tailbase_r3.setRotationPoint(-1.9F, 2.2862F, 2.0003F);
        this.tailbase.addChild(tailbase_r3);
        this.setRotateAngle(tailbase_r3, 0.0984F, 0.0358F, -0.3473F);
        this.tailbase_r3.cubeList.add(new ModelBox(tailbase_r3, 34, 0, -0.5256F, -0.1224F, -2.0244F, 1, 3, 4, 0.0F, true));

        this.tailbase_r4 = new ModelRenderer(this);
        this.tailbase_r4.setRotationPoint(1.9F, 0.4552F, 1.3295F);
        this.tailbase.addChild(tailbase_r4);
        this.setRotateAngle(tailbase_r4, 0.8536F, 0.0889F, -0.3011F);
        this.tailbase_r4.cubeList.add(new ModelBox(tailbase_r4, 0, 12, -0.7898F, -1.0776F, -1.0F, 1, 2, 2, 0.0F, false));

        this.tailbase_r5 = new ModelRenderer(this);
        this.tailbase_r5.setRotationPoint(1.9F, 2.2862F, 2.0003F);
        this.tailbase.addChild(tailbase_r5);
        this.setRotateAngle(tailbase_r5, 0.0984F, -0.0358F, 0.3473F);
        this.tailbase_r5.cubeList.add(new ModelBox(tailbase_r5, 34, 0, -0.4744F, -0.1224F, -2.0244F, 1, 3, 4, 0.0F, false));

        this.tailbase_r6 = new ModelRenderer(this);
        this.tailbase_r6.setRotationPoint(0.0F, 0.1F, 0.1F);
        this.tailbase.addChild(tailbase_r6);
        this.setRotateAngle(tailbase_r6, -0.0698F, 0.0F, 0.0F);
        this.tailbase_r6.cubeList.add(new ModelBox(tailbase_r6, 43, 40, -0.5F, -0.5F, -0.2F, 1, 1, 3, 0.0F, false));

        this.neck_r62 = new ModelRenderer(this);
        this.neck_r62.setRotationPoint(0.0F, -0.361F, -1.1012F);
        this.tailbase.addChild(neck_r62);
        this.setRotateAngle(neck_r62, 0.2094F, 0.0F, 0.0F);
        this.neck_r62.cubeList.add(new ModelBox(neck_r62, 21, 53, 0.0F, -0.9661F, 0.6025F, 0, 2, 1, 0.0F, false));
        this.neck_r62.cubeList.add(new ModelBox(neck_r62, 9, 52, 0.0F, -1.0305F, 1.7186F, 0, 2, 1, 0.0F, false));

        this.neck_r63 = new ModelRenderer(this);
        this.neck_r63.setRotationPoint(0.0F, -0.0514F, 2.2368F);
        this.tailbase.addChild(neck_r63);
        this.setRotateAngle(neck_r63, 0.1047F, 0.0F, 0.0F);
        this.neck_r63.cubeList.add(new ModelBox(neck_r63, 6, 52, 0.0F, -1.9933F, -0.3886F, 0, 2, 1, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(-2.0F, 2.9757F, 1.7424F);
        this.tailbase.addChild(legL3);
        this.setRotateAngle(legL3, 0.5815F, 0.4327F, -0.5383F);
        this.legL3.cubeList.add(new ModelBox(legL3, 41, 0, -2.5F, -1.0F, -1.1F, 3, 1, 2, 0.0F, true));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(-2.55F, -0.5F, 0.25F);
        this.legL3.addChild(legL4);
        this.setRotateAngle(legL4, -0.1309F, 0.5672F, -0.1309F);
        this.legL4.cubeList.add(new ModelBox(legL4, 6, 35, -2.3F, -0.5F, -1.05F, 3, 1, 1, 0.0F, true));
        this.legL4.cubeList.add(new ModelBox(legL4, 32, 24, -2.3F, -0.5F, 0.05F, 3, 1, 1, 0.0F, true));

        this.footL2 = new ModelRenderer(this);
        this.footL2.setRotationPoint(-2.3F, 0.1F, 0.0F);
        this.legL4.addChild(footL2);
        this.setRotateAngle(footL2, -0.3927F, 0.1745F, -0.3054F);


        this.rightrearfin_r1 = new ModelRenderer(this);
        this.rightrearfin_r1.setRotationPoint(-0.2688F, -0.2F, -0.5884F);
        this.footL2.addChild(rightrearfin_r1);
        this.setRotateAngle(rightrearfin_r1, 0.0F, -0.5236F, 0.0F);
        this.rightrearfin_r1.cubeList.add(new ModelBox(rightrearfin_r1, 49, 40, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, true));

        this.rightrearfin_r2 = new ModelRenderer(this);
        this.rightrearfin_r2.setRotationPoint(-1.2239F, -0.3F, 0.9079F);
        this.footL2.addChild(rightrearfin_r2);
        this.setRotateAngle(rightrearfin_r2, 0.0F, 0.4538F, 0.0F);
        this.rightrearfin_r2.cubeList.add(new ModelBox(rightrearfin_r2, 48, 4, -0.6F, -0.5F, -0.6F, 2, 1, 1, -0.3F, true));

        this.rightrearfin_r3 = new ModelRenderer(this);
        this.rightrearfin_r3.setRotationPoint(-1.1457F, -0.3F, 0.414F);
        this.footL2.addChild(rightrearfin_r3);
        this.setRotateAngle(rightrearfin_r3, 0.0F, 0.2094F, 0.0F);
        this.rightrearfin_r3.cubeList.add(new ModelBox(rightrearfin_r3, 30, 48, -0.8F, -0.4F, -0.6F, 2, 1, 1, -0.3F, true));

        this.rightrearfin_r4 = new ModelRenderer(this);
        this.rightrearfin_r4.setRotationPoint(-0.9675F, -0.3F, 0.1202F);
        this.footL2.addChild(rightrearfin_r4);
        this.setRotateAngle(rightrearfin_r4, 0.0F, -0.0175F, 0.0F);
        this.rightrearfin_r4.cubeList.add(new ModelBox(rightrearfin_r4, 37, 48, -1.0F, -0.5F, -0.7F, 2, 1, 1, -0.31F, true));

        this.rightrearfin_r5 = new ModelRenderer(this);
        this.rightrearfin_r5.setRotationPoint(-0.5902F, -0.3F, -0.367F);
        this.footL2.addChild(rightrearfin_r5);
        this.setRotateAngle(rightrearfin_r5, 0.0F, -0.4189F, 0.0F);
        this.rightrearfin_r5.cubeList.add(new ModelBox(rightrearfin_r5, 44, 48, -1.2964F, -0.5F, -0.4598F, 2, 1, 1, -0.3F, true));

        this.rightrearfin_r6 = new ModelRenderer(this);
        this.rightrearfin_r6.setRotationPoint(0.1268F, -0.3F, -1.2231F);
        this.footL2.addChild(rightrearfin_r6);
        this.setRotateAngle(rightrearfin_r6, 0.0F, -1.1345F, 0.0F);
        this.rightrearfin_r6.cubeList.add(new ModelBox(rightrearfin_r6, 24, 37, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.3F, true));
        this.rightrearfin_r6.cubeList.add(new ModelBox(rightrearfin_r6, 50, 35, -0.65F, -0.5F, -0.5F, 1, 1, 1, -0.31F, true));

        this.rightrearfin_r7 = new ModelRenderer(this);
        this.rightrearfin_r7.setRotationPoint(0.0123F, -0.2973F, -1.1564F);
        this.footL2.addChild(rightrearfin_r7);
        this.setRotateAngle(rightrearfin_r7, 0.0F, -0.6981F, 0.0F);
        this.rightrearfin_r7.cubeList.add(new ModelBox(rightrearfin_r7, 35, 34, -0.3869F, -0.5027F, -0.2651F, 1, 1, 1, -0.3F, true));
        this.rightrearfin_r7.cubeList.add(new ModelBox(rightrearfin_r7, 21, 50, -0.6869F, -0.5027F, -0.2651F, 1, 1, 1, -0.31F, true));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(2.0F, 2.9757F, 1.7424F);
        this.tailbase.addChild(legL);
        this.setRotateAngle(legL, 0.5711F, -0.3961F, 0.5643F);
        this.legL.cubeList.add(new ModelBox(legL, 41, 0, -0.5F, -1.0F, -1.1F, 3, 1, 2, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(2.55F, -0.5F, 0.25F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, -0.0436F, -0.5672F, 0.1309F);
        this.legL2.cubeList.add(new ModelBox(legL2, 6, 35, -0.7F, -0.5F, -1.05F, 3, 1, 1, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 32, 24, -0.7F, -0.5F, 0.05F, 3, 1, 1, 0.0F, false));

        this.footL = new ModelRenderer(this);
        this.footL.setRotationPoint(2.3F, 0.1F, 0.0F);
        this.legL2.addChild(footL);
        this.setRotateAngle(footL, -0.2618F, -0.1745F, 0.3054F);


        this.rightrearfin_r8 = new ModelRenderer(this);
        this.rightrearfin_r8.setRotationPoint(0.2688F, -0.2F, -0.5884F);
        this.footL.addChild(rightrearfin_r8);
        this.setRotateAngle(rightrearfin_r8, 0.0F, 0.5236F, 0.0F);
        this.rightrearfin_r8.cubeList.add(new ModelBox(rightrearfin_r8, 49, 40, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

        this.rightrearfin_r9 = new ModelRenderer(this);
        this.rightrearfin_r9.setRotationPoint(1.2239F, -0.3F, 0.9079F);
        this.footL.addChild(rightrearfin_r9);
        this.setRotateAngle(rightrearfin_r9, 0.0F, -0.4538F, 0.0F);
        this.rightrearfin_r9.cubeList.add(new ModelBox(rightrearfin_r9, 48, 4, -1.4F, -0.5F, -0.6F, 2, 1, 1, -0.3F, false));

        this.rightrearfin_r10 = new ModelRenderer(this);
        this.rightrearfin_r10.setRotationPoint(1.1457F, -0.3F, 0.414F);
        this.footL.addChild(rightrearfin_r10);
        this.setRotateAngle(rightrearfin_r10, 0.0F, -0.2094F, 0.0F);
        this.rightrearfin_r10.cubeList.add(new ModelBox(rightrearfin_r10, 30, 48, -1.2F, -0.4F, -0.6F, 2, 1, 1, -0.3F, false));

        this.rightrearfin_r11 = new ModelRenderer(this);
        this.rightrearfin_r11.setRotationPoint(0.9675F, -0.3F, 0.1202F);
        this.footL.addChild(rightrearfin_r11);
        this.setRotateAngle(rightrearfin_r11, 0.0F, 0.0175F, 0.0F);
        this.rightrearfin_r11.cubeList.add(new ModelBox(rightrearfin_r11, 37, 48, -1.0F, -0.5F, -0.7F, 2, 1, 1, -0.31F, false));

        this.rightrearfin_r12 = new ModelRenderer(this);
        this.rightrearfin_r12.setRotationPoint(0.5902F, -0.3F, -0.367F);
        this.footL.addChild(rightrearfin_r12);
        this.setRotateAngle(rightrearfin_r12, 0.0F, 0.4189F, 0.0F);
        this.rightrearfin_r12.cubeList.add(new ModelBox(rightrearfin_r12, 44, 48, -0.7036F, -0.5F, -0.4598F, 2, 1, 1, -0.3F, false));

        this.rightrearfin_r13 = new ModelRenderer(this);
        this.rightrearfin_r13.setRotationPoint(-0.1268F, -0.3F, -1.2231F);
        this.footL.addChild(rightrearfin_r13);
        this.setRotateAngle(rightrearfin_r13, 0.0F, 1.1345F, 0.0F);
        this.rightrearfin_r13.cubeList.add(new ModelBox(rightrearfin_r13, 24, 37, -0.65F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));
        this.rightrearfin_r13.cubeList.add(new ModelBox(rightrearfin_r13, 50, 35, -0.35F, -0.5F, -0.5F, 1, 1, 1, -0.31F, false));

        this.rightrearfin_r14 = new ModelRenderer(this);
        this.rightrearfin_r14.setRotationPoint(-0.0123F, -0.2973F, -1.1564F);
        this.footL.addChild(rightrearfin_r14);
        this.setRotateAngle(rightrearfin_r14, 0.0F, 0.6981F, 0.0F);
        this.rightrearfin_r14.cubeList.add(new ModelBox(rightrearfin_r14, 35, 34, -0.6131F, -0.5027F, -0.2651F, 1, 1, 1, -0.3F, false));
        this.rightrearfin_r14.cubeList.add(new ModelBox(rightrearfin_r14, 21, 50, -0.3131F, -0.5027F, -0.2651F, 1, 1, 1, -0.31F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.2F, 2.7F);
        this.tailbase.addChild(tail1);
        this.setRotateAngle(tail1, -0.1355F, 0.2595F, -0.035F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 43, -0.5F, -0.4672F, 0.0441F, 1, 1, 3, 0.002F, false));

        this.neck_r64 = new ModelRenderer(this);
        this.neck_r64.setRotationPoint(0.0F, -0.2423F, 2.9893F);
        this.tail1.addChild(neck_r64);
        this.setRotateAngle(neck_r64, -0.0698F, 0.0F, 0.0F);
        this.neck_r64.cubeList.add(new ModelBox(neck_r64, 7, 0, 0.0F, -2.0483F, -0.4043F, 0, 2, 1, 0.0F, false));

        this.neck_r65 = new ModelRenderer(this);
        this.neck_r65.setRotationPoint(0.0F, -0.2971F, 1.8504F);
        this.tail1.addChild(neck_r65);
        this.setRotateAngle(neck_r65, -0.0175F, 0.0F, 0.0F);
        this.neck_r65.cubeList.add(new ModelBox(neck_r65, 18, 33, 0.0F, -2.0483F, -0.4043F, 0, 2, 1, 0.0F, false));

        this.neck_r66 = new ModelRenderer(this);
        this.neck_r66.setRotationPoint(0.0F, 0.4192F, 3.5597F);
        this.tail1.addChild(neck_r66);
        this.setRotateAngle(neck_r66, 0.5934F, 0.0F, 0.0F);
        this.neck_r66.cubeList.add(new ModelBox(neck_r66, 53, 17, 0.0F, -0.2285F, -0.5067F, 0, 2, 1, 0.0F, false));

        this.neck_r67 = new ModelRenderer(this);
        this.neck_r67.setRotationPoint(0.0F, 0.9386F, 1.2166F);
        this.tail1.addChild(neck_r67);
        this.setRotateAngle(neck_r67, 0.4538F, 0.0F, 0.0F);
        this.neck_r67.cubeList.add(new ModelBox(neck_r67, 53, 12, 0.0F, -0.1195F, 0.8041F, 0, 2, 1, 0.0F, false));
        this.neck_r67.cubeList.add(new ModelBox(neck_r67, 0, 51, 0.0F, -1.092F, -1.5335F, 0, 2, 1, 0.0F, false));
        this.neck_r67.cubeList.add(new ModelBox(neck_r67, 0, 30, 0.0F, -0.4969F, -0.3394F, 0, 2, 1, 0.0F, false));

        this.neck_r68 = new ModelRenderer(this);
        this.neck_r68.setRotationPoint(0.0F, -0.1138F, -0.3624F);
        this.tail1.addChild(neck_r68);
        this.setRotateAngle(neck_r68, 0.1047F, 0.0F, 0.0F);
        this.neck_r68.cubeList.add(new ModelBox(neck_r68, 52, 0, 0.0F, -2.0734F, 0.6999F, 0, 2, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1624F, 5.0008F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0894F, 0.2173F, 0.0193F);


        this.tail6_r1 = new ModelRenderer(this);
        this.tail6_r1.setRotationPoint(0.0F, -1.0157F, 1.5211F);
        this.tail2.addChild(tail6_r1);
        this.setRotateAngle(tail6_r1, -0.3054F, 0.0F, 0.0F);
        this.tail6_r1.cubeList.add(new ModelBox(tail6_r1, 19, 0, 0.0F, -0.9278F, 3.6409F, 0, 1, 1, 0.0F, false));
        this.tail6_r1.cubeList.add(new ModelBox(tail6_r1, 29, 29, 0.0F, -0.7974F, 2.2151F, 0, 1, 1, 0.0F, false));
        this.tail6_r1.cubeList.add(new ModelBox(tail6_r1, 41, 29, 0.0F, -0.767F, 0.9624F, 0, 1, 1, 0.0F, false));
        this.tail6_r1.cubeList.add(new ModelBox(tail6_r1, 53, 38, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.tail5_r1 = new ModelRenderer(this);
        this.tail5_r1.setRotationPoint(0.0F, 1.4962F, 1.4128F);
        this.tail2.addChild(tail5_r1);
        this.setRotateAngle(tail5_r1, 0.5236F, 0.0F, 0.0F);
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 3, 55, 0.0F, 1.5311F, 2.9489F, 0, 1, 1, 0.0F, false));
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 55, 3, 0.0F, 0.8841F, 1.8946F, 0, 1, 1, 0.0F, false));
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 55, 9, 0.0F, 0.2071F, 0.745F, 0, 1, 1, 0.0F, false));
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 41, 55, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.8962F, 6.1628F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0263F, -0.0872F, 0.0023F);


        this.tail8_r1 = new ModelRenderer(this);
        this.tail8_r1.setRotationPoint(-0.01F, 0.1123F, 0.3462F);
        this.tail3.addChild(tail8_r1);
        this.setRotateAngle(tail8_r1, 0.5236F, 0.0F, 0.0F);
        this.tail8_r1.cubeList.add(new ModelBox(tail8_r1, 37, 51, 0.0F, 1.5579F, 2.9098F, 0, 2, 1, 0.0F, false));
        this.tail8_r1.cubeList.add(new ModelBox(tail8_r1, 43, 51, 0.0F, 1.092F, 1.6962F, 0, 2, 1, 0.0F, false));
        this.tail8_r1.cubeList.add(new ModelBox(tail8_r1, 46, 51, 0.0F, 0.662F, 0.5759F, 0, 2, 1, 0.0F, false));
        this.tail8_r1.cubeList.add(new ModelBox(tail8_r1, 14, 40, 0.0F, 0.1027F, -0.602F, 0, 2, 1, 0.0F, false));

        this.tail6_r2 = new ModelRenderer(this);
        this.tail6_r2.setRotationPoint(-0.01F, 0.0202F, 0.4459F);
        this.tail3.addChild(tail6_r2);
        this.setRotateAngle(tail6_r2, -0.5934F, 0.0F, 0.0F);
        this.tail6_r2.cubeList.add(new ModelBox(tail6_r2, 50, 50, 0.0F, -4.1174F, 1.4731F, 0, 2, 1, 0.0F, false));
        this.tail6_r2.cubeList.add(new ModelBox(tail6_r2, 40, 51, 0.0F, -3.3089F, 0.3128F, 0, 2, 1, 0.0F, false));
        this.tail6_r2.cubeList.add(new ModelBox(tail6_r2, 0, 42, 0.0F, -2.2859F, -0.7843F, 0, 2, 1, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.4F, 4.5026F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1473F, -0.4755F, -0.0678F);


        this.tail9_r1 = new ModelRenderer(this);
        this.tail9_r1.setRotationPoint(0.0F, -0.0043F, 0.4347F);
        this.tail4.addChild(tail9_r1);
        this.setRotateAngle(tail9_r1, -0.7418F, 0.0F, 0.0F);
        this.tail9_r1.cubeList.add(new ModelBox(tail9_r1, 53, 23, 0.0F, -4.3291F, 2.6873F, 0, 1, 1, 0.0F, false));
        this.tail9_r1.cubeList.add(new ModelBox(tail9_r1, 41, 16, 0.0F, -3.5699F, 1.6132F, 0, 1, 1, 0.0F, false));
        this.tail9_r1.cubeList.add(new ModelBox(tail9_r1, 27, 11, 0.0F, -3.1757F, 0.4574F, 0, 2, 1, 0.0F, false));
        this.tail9_r1.cubeList.add(new ModelBox(tail9_r1, 22, 27, 0.0F, -2.0642F, -0.6936F, 0, 2, 1, 0.0F, false));

        this.tail9_r2 = new ModelRenderer(this);
        this.tail9_r2.setRotationPoint(0.0F, 1.4957F, 0.4347F);
        this.tail4.addChild(tail9_r2);
        this.setRotateAngle(tail9_r2, 0.4363F, 0.0F, 0.0F);
        this.tail9_r2.cubeList.add(new ModelBox(tail9_r2, 6, 56, 0.0F, 0.9076F, 4.9944F, 0, 1, 1, 0.0F, false));
        this.tail9_r2.cubeList.add(new ModelBox(tail9_r2, 24, 53, 0.0F, 0.7043F, 3.7743F, 0, 1, 1, 0.0F, false));
        this.tail9_r2.cubeList.add(new ModelBox(tail9_r2, 53, 42, 0.0F, 0.5009F, 2.5542F, 0, 1, 1, 0.0F, false));
        this.tail9_r2.cubeList.add(new ModelBox(tail9_r2, 53, 51, 0.0F, 0.1141F, 1.4139F, 0, 1, 1, 0.0F, false));
        this.tail9_r2.cubeList.add(new ModelBox(tail9_r2, 55, 0, 0.0F, -0.1411F, 0.3254F, 0, 1, 1, 0.0F, false));

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
