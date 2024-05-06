package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEchinochimaera extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer female;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer head2;
    private final ModelRenderer femalehead2;
    private final ModelRenderer femalecube_r1;
    private final ModelRenderer femalecube_r2;
    private final ModelRenderer femalecube_r3;
    private final ModelRenderer femalecube_r4;
    private final ModelRenderer femalecube_r5;
    private final ModelRenderer femalehorn3;
    private final ModelRenderer femalecube_r6;
    private final ModelRenderer eye3;
    private final ModelRenderer cube_r5;
    private final ModelRenderer femalejaw2;
    private final ModelRenderer femalejaw_r1;
    private final ModelRenderer femalejaw_r2;
    private final ModelRenderer frontleftfin2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer femalebody2;
    private final ModelRenderer femalecube_r7;
    private final ModelRenderer femalecube_r8;
    private final ModelRenderer femalecube_r9;
    private final ModelRenderer dorsalfemale3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer dorsalfemale4;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tailfemale4;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer backleftfinfemale2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer tailfemale5;
    private final ModelRenderer cube_r14;
    private final ModelRenderer tailfemale6;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer male;
    private final ModelRenderer body;
    private final ModelRenderer cube_r19;
    private final ModelRenderer head;
    private final ModelRenderer malehead;
    private final ModelRenderer malecube_r1;
    private final ModelRenderer malecube_r2;
    private final ModelRenderer malecube_r3;
    private final ModelRenderer malecube_r4;
    private final ModelRenderer malecube_r5;
    private final ModelRenderer hornmale2;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer eye2;
    private final ModelRenderer malejaw;
    private final ModelRenderer malejaw_r1;
    private final ModelRenderer frontrightfin;
    private final ModelRenderer malebody;
    private final ModelRenderer malecube_r6;
    private final ModelRenderer malecube_r7;
    private final ModelRenderer malecube_r8;
    private final ModelRenderer dorsalmale;
    private final ModelRenderer cube_r25;
    private final ModelRenderer tailmale;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer tailmale2;
    private final ModelRenderer cube_r28;
    private final ModelRenderer tailmale3;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer tailmale4;
    private final ModelRenderer cube_r31;
    private final ModelRenderer horn2;
    private final ModelRenderer cube_r32;
    private final ModelRenderer dorsalmale2;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer backrightfinmale;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;

    public ModelSkeletonEchinochimaera() {
        this.textureWidth = 176;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(2.0F, 24.0F, -13.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -16.0F, -2.0F, -7.0F, 32, 2, 34, 0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-20.0F, 0.0F, 31.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.3963F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 67, 39, -5.9497F, -2.0F, -35.7018F, 14, 2, 36, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-16.0F, 0.0F, -16.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.829F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 37, 16.0F, -2.0F, 0.0F, 16, 2, 35, -0.003F, false));

        this.female = new ModelRenderer(this);
        this.female.setRotationPoint(0.0F, -20.75F, 0.0F);
        this.fossil.addChild(female);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(5.0F, 19.4392F, 2.9724F);
        this.female.addChild(body2);
        this.setRotateAngle(body2, -0.6981F, 0.0F, -1.5708F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -1.2108F, 0.7224F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -2.9627F, 0.0F, 3.1416F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 57, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.3F, 1.2108F, -0.7224F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 3.1416F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, -2.5F, -3.5F, 0, 5, 7, 0.0F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(-0.0042F, 0.1727F, -3.9918F);
        this.body2.addChild(head2);


        this.femalehead2 = new ModelRenderer(this);
        this.femalehead2.setRotationPoint(0.0042F, 0.2861F, -4.327F);
        this.head2.addChild(femalehead2);


        this.femalecube_r1 = new ModelRenderer(this);
        this.femalecube_r1.setRotationPoint(1.2F, 0.9884F, 2.3682F);
        this.femalehead2.addChild(femalecube_r1);
        this.setRotateAngle(femalecube_r1, 0.0F, 3.1416F, 0.0F);
        this.femalecube_r1.cubeList.add(new ModelBox(femalecube_r1, 25, 48, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.001F, false));

        this.femalecube_r2 = new ModelRenderer(this);
        this.femalecube_r2.setRotationPoint(1.0F, 0.8256F, 1.1541F);
        this.femalehead2.addChild(femalecube_r2);
        this.setRotateAngle(femalecube_r2, 2.9671F, 0.0F, -3.1416F);
        this.femalecube_r2.cubeList.add(new ModelBox(femalecube_r2, 30, 45, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.femalecube_r3 = new ModelRenderer(this);
        this.femalecube_r3.setRotationPoint(1.0F, 2.5452F, 3.6419F);
        this.femalehead2.addChild(femalecube_r3);
        this.setRotateAngle(femalecube_r3, -2.9671F, 0.0F, 3.1416F);
        this.femalecube_r3.cubeList.add(new ModelBox(femalecube_r3, 68, 47, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.femalecube_r4 = new ModelRenderer(this);
        this.femalecube_r4.setRotationPoint(1.1F, -0.0528F, 1.4118F);
        this.femalehead2.addChild(femalecube_r4);
        this.setRotateAngle(femalecube_r4, 0.7418F, 0.0F, 3.1416F);
        this.femalecube_r4.cubeList.add(new ModelBox(femalecube_r4, 18, 67, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.femalecube_r5 = new ModelRenderer(this);
        this.femalecube_r5.setRotationPoint(1.0F, -0.5014F, 3.2324F);
        this.femalehead2.addChild(femalecube_r5);
        this.setRotateAngle(femalecube_r5, 2.8362F, 0.0F, -3.1416F);
        this.femalecube_r5.cubeList.add(new ModelBox(femalecube_r5, 0, 13, 0.0F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.femalehorn3 = new ModelRenderer(this);
        this.femalehorn3.setRotationPoint(0.0F, -2.2007F, 2.5287F);
        this.femalehead2.addChild(femalehorn3);
        this.setRotateAngle(femalehorn3, -0.6545F, 0.0F, 0.0F);


        this.femalecube_r6 = new ModelRenderer(this);
        this.femalecube_r6.setRotationPoint(0.7F, -0.2195F, 0.1143F);
        this.femalehorn3.addChild(femalecube_r6);
        this.setRotateAngle(femalecube_r6, 2.8362F, 0.0F, -3.1416F);
        this.femalecube_r6.cubeList.add(new ModelBox(femalecube_r6, 13, 0, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.eye3 = new ModelRenderer(this);
        this.eye3.setRotationPoint(2.1792F, -0.3618F, -1.7306F);
        this.head2.addChild(eye3);
        this.setRotateAngle(eye3, 0.2182F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.925F, 0.0F, 0.0F);
        this.eye3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 3.1416F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 29, 10, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.femalejaw2 = new ModelRenderer(this);
        this.femalejaw2.setRotationPoint(0.0042F, 2.2808F, -1.5559F);
        this.head2.addChild(femalejaw2);


        this.femalejaw_r1 = new ModelRenderer(this);
        this.femalejaw_r1.setRotationPoint(0.9F, 0.6871F, -0.9673F);
        this.femalejaw2.addChild(femalejaw_r1);
        this.setRotateAngle(femalejaw_r1, -2.9976F, 0.0F, 3.1416F);
        this.femalejaw_r1.cubeList.add(new ModelBox(femalejaw_r1, 21, 37, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.femalejaw_r2 = new ModelRenderer(this);
        this.femalejaw_r2.setRotationPoint(0.8F, 0.4628F, -0.982F);
        this.femalejaw2.addChild(femalejaw_r2);
        this.setRotateAngle(femalejaw_r2, 0.0F, 3.1416F, 0.0F);
        this.femalejaw_r2.cubeList.add(new ModelBox(femalejaw_r2, 30, 37, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.frontleftfin2 = new ModelRenderer(this);
        this.frontleftfin2.setRotationPoint(1.4F, 2.8608F, -3.2974F);
        this.body2.addChild(frontleftfin2);
        this.setRotateAngle(frontleftfin2, -0.6513F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.5F, 2.75F);
        this.frontleftfin2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 0, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.1F, 0.0F, 1.5F);
        this.frontleftfin2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 19, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.femalebody2 = new ModelRenderer(this);
        this.femalebody2.setRotationPoint(-0.5F, -1.3392F, -0.9724F);
        this.body2.addChild(femalebody2);


        this.femalecube_r7 = new ModelRenderer(this);
        this.femalecube_r7.setRotationPoint(1.5F, 5.0198F, 1.6186F);
        this.femalebody2.addChild(femalecube_r7);
        this.setRotateAngle(femalecube_r7, 2.9234F, 0.0F, 3.1416F);
        this.femalecube_r7.cubeList.add(new ModelBox(femalecube_r7, 0, 59, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.femalecube_r8 = new ModelRenderer(this);
        this.femalecube_r8.setRotationPoint(1.6F, 5.2485F, -1.6478F);
        this.femalebody2.addChild(femalecube_r8);
        this.setRotateAngle(femalecube_r8, -3.0107F, 0.0F, -3.1416F);
        this.femalecube_r8.cubeList.add(new ModelBox(femalecube_r8, 15, 29, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.femalecube_r9 = new ModelRenderer(this);
        this.femalecube_r9.setRotationPoint(1.6F, -0.1539F, -1.6333F);
        this.femalebody2.addChild(femalecube_r9);
        this.setRotateAngle(femalecube_r9, 3.098F, 0.0F, 3.1416F);
        this.femalecube_r9.cubeList.add(new ModelBox(femalecube_r9, 28, 63, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.dorsalfemale3 = new ModelRenderer(this);
        this.dorsalfemale3.setRotationPoint(0.2F, -2.0392F, -2.4474F);
        this.body2.addChild(dorsalfemale3);
        this.setRotateAngle(dorsalfemale3, -0.4363F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.dorsalfemale3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 0, -0.2F, -4.5971F, -0.263F, 1, 5, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -2.2822F, 1.8124F);
        this.dorsalfemale3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 3.1416F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 21, 0.0F, -2.5F, -2.0F, 0, 5, 4, 0.0F, false));

        this.dorsalfemale4 = new ModelRenderer(this);
        this.dorsalfemale4.setRotationPoint(0.7F, -1.8392F, 2.5526F);
        this.body2.addChild(dorsalfemale4);
        this.setRotateAngle(dorsalfemale4, -0.6981F, 0.0F, 0.0F);
        this.dorsalfemale4.cubeList.add(new ModelBox(dorsalfemale4, 29, 0, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.0F, 1.0F);
        this.dorsalfemale4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 3.1416F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 4, 45, 0.0F, -2.5F, -1.5F, 0, 5, 3, 0.0F, false));

        this.tailfemale4 = new ModelRenderer(this);
        this.tailfemale4.setRotationPoint(-0.3F, 0.2896F, 2.3244F);
        this.body2.addChild(tailfemale4);
        this.setRotateAngle(tailfemale4, 0.0873F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.1F, 1.4913F, 1.5122F);
        this.tailfemale4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 2.6704F, 0.0F, -3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 52, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(1.2F, -0.0287F, 1.9531F);
        this.tailfemale4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 3.1416F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 37, 0.0F, -1.5F, -2.0F, 0, 3, 4, 0.0F, false));

        this.backleftfinfemale2 = new ModelRenderer(this);
        this.backleftfinfemale2.setRotationPoint(1.2F, 1.8949F, 0.5118F);
        this.tailfemale4.addChild(backleftfinfemale2);
        this.setRotateAngle(backleftfinfemale2, -0.2867F, 0.0F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.1F, 0.0F, 2.0F);
        this.backleftfinfemale2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -3.1416F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 45, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.tailfemale5 = new ModelRenderer(this);
        this.tailfemale5.setRotationPoint(0.0F, -0.4787F, 3.4531F);
        this.tailfemale4.addChild(tailfemale5);
        this.setRotateAngle(tailfemale5, 0.1745F, 0.0F, 0.0F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(1.1F, 0.0F, 2.0F);
        this.tailfemale5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 3.1416F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 45, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.tailfemale6 = new ModelRenderer(this);
        this.tailfemale6.setRotationPoint(0.7F, -0.4F, 3.65F);
        this.tailfemale5.addChild(tailfemale6);
        this.setRotateAngle(tailfemale6, 0.3054F, 0.0F, 0.0F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.475F, 1.3151F, 1.4494F);
        this.tailfemale6.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 2.3998F, 0.0F, 3.1416F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 47, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.0477F, 2.1121F);
        this.tailfemale6.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 3.1416F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 21, 55, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.3F, 0.2522F, 5.8892F);
        this.tailfemale6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 2.7925F, 0.0F, -3.1416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 0, 0.0F, -2.0F, -3.5F, 0, 4, 7, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.4F, -0.3527F, 5.9182F);
        this.tailfemale6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 2.9234F, 0.0F, 3.1416F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 8, 0, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.male = new ModelRenderer(this);
        this.male.setRotationPoint(2.0F, 0.25F, 11.0F);
        this.fossil.addChild(male);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-14.0F, -0.8608F, 16.9724F);
        this.male.addChild(body);
        this.setRotateAngle(body, -2.8798F, 0.0F, 1.5708F);
        this.body.cubeList.add(new ModelBox(body, 8, 6, -1.9F, -1.2892F, -4.2224F, 0, 5, 7, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -2.0392F, -1.1724F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1789F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 14, 61, -1.2F, -0.0221F, 0.012F, 0, 1, 4, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.2042F, 0.1727F, -3.9918F);
        this.body.addChild(head);


        this.malehead = new ModelRenderer(this);
        this.malehead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(malehead);


        this.malecube_r1 = new ModelRenderer(this);
        this.malecube_r1.setRotationPoint(0.0042F, -1.8118F, -2.6556F);
        this.malehead.addChild(malecube_r1);
        this.setRotateAngle(malecube_r1, 0.0262F, 0.0F, 0.0F);
        this.malecube_r1.cubeList.add(new ModelBox(malecube_r1, 0, 0, -1.5F, -0.0087F, 0.0155F, 0, 3, 3, 0.0F, false));

        this.malecube_r2 = new ModelRenderer(this);
        this.malecube_r2.setRotationPoint(-0.4958F, 3.2382F, -0.6806F);
        this.malehead.addChild(malecube_r2);
        this.setRotateAngle(malecube_r2, 0.0436F, 0.0F, 0.0F);
        this.malecube_r2.cubeList.add(new ModelBox(malecube_r2, 68, 42, -1.0F, -1.4F, -1.0F, 0, 2, 2, 0.0F, false));

        this.malecube_r3 = new ModelRenderer(this);
        this.malecube_r3.setRotationPoint(0.0042F, 2.4882F, -1.4806F);
        this.malehead.addChild(malecube_r3);
        this.setRotateAngle(malecube_r3, 0.1745F, 0.0F, 0.0F);
        this.malecube_r3.cubeList.add(new ModelBox(malecube_r3, 10, 20, -1.6F, -2.6F, -2.75F, 0, 3, 5, 0.0F, false));

        this.malecube_r4 = new ModelRenderer(this);
        this.malecube_r4.setRotationPoint(0.0042F, 0.4189F, -4.6388F);
        this.malehead.addChild(malecube_r4);
        this.setRotateAngle(malecube_r4, -0.6545F, 0.0F, 0.0F);
        this.malecube_r4.cubeList.add(new ModelBox(malecube_r4, 6, 25, -1.5F, -2.9887F, 0.9758F, 0, 3, 1, 0.0F, false));

        this.malecube_r5 = new ModelRenderer(this);
        this.malecube_r5.setRotationPoint(0.0042F, 0.4189F, -4.6388F);
        this.malehead.addChild(malecube_r5);
        this.setRotateAngle(malecube_r5, -0.7374F, 0.0F, 0.0F);
        this.malecube_r5.cubeList.add(new ModelBox(malecube_r5, 31, 24, -1.4F, -2.9887F, -0.0242F, 0, 3, 1, 0.0F, false));

        this.hornmale2 = new ModelRenderer(this);
        this.hornmale2.setRotationPoint(-0.3958F, -1.1118F, -0.4806F);
        this.malehead.addChild(hornmale2);
        this.setRotateAngle(hornmale2, 0.1309F, 0.0F, 0.0F);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -0.4864F, -1.9719F);
        this.hornmale2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.3875F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 13, -0.425F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.75F, -0.5579F, -1.391F);
        this.hornmale2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.9076F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, 0.0F, -0.55F, -0.575F, 0, 1, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -1.0073F, 0.3721F);
        this.hornmale2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.637F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 4, 0, -0.3F, -0.9F, -1.675F, 0, 1, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hornmale2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0785F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 8, 0, -1.0F, -1.475F, -0.05F, 0, 2, 1, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.475F, -1.2565F, 0.3525F);
        this.hornmale2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.4625F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 31, 7, 0.5F, -0.3F, -0.725F, 0, 1, 1, 0.0F, false));

        this.eye2 = new ModelRenderer(this);
        this.eye2.setRotationPoint(-2.1708F, -0.3618F, -1.7306F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.2182F, 0.0F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 25, 0.525F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.malejaw = new ModelRenderer(this);
        this.malejaw.setRotationPoint(0.0042F, 2.9308F, -1.5559F);
        this.head.addChild(malejaw);
        this.setRotateAngle(malejaw, 0.3491F, 0.0F, 0.0F);


        this.malejaw_r1 = new ModelRenderer(this);
        this.malejaw_r1.setRotationPoint(0.0F, 0.3074F, 0.8753F);
        this.malejaw.addChild(malejaw_r1);
        this.setRotateAngle(malejaw_r1, -0.0436F, 0.0F, 0.0F);
        this.malejaw_r1.cubeList.add(new ModelBox(malejaw_r1, 12, 37, -1.6F, -0.35F, -2.9F, 0, 1, 2, 0.0F, false));

        this.frontrightfin = new ModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.1F, 2.8608F, -3.2974F);
        this.body.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, -0.3022F, 0.0F, 0.0F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 27, 28, -0.1F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 7, 52, 0.0F, -1.5F, 0.75F, 0, 2, 4, 0.0F, false));

        this.malebody = new ModelRenderer(this);
        this.malebody.setRotationPoint(-0.5F, 3.7108F, -2.2224F);
        this.body.addChild(malebody);


        this.malecube_r6 = new ModelRenderer(this);
        this.malecube_r6.setRotationPoint(-0.4F, 0.0F, 0.0F);
        this.malebody.addChild(malecube_r6);
        this.setRotateAngle(malecube_r6, -0.0873F, 0.0F, 0.0F);
        this.malecube_r6.cubeList.add(new ModelBox(malecube_r6, 11, 67, -0.9F, -0.6F, -2.0F, 0, 1, 3, 0.0F, false));

        this.malecube_r7 = new ModelRenderer(this);
        this.malecube_r7.setRotationPoint(0.0F, -5.05F, 1.25F);
        this.malebody.addChild(malecube_r7);
        this.setRotateAngle(malecube_r7, 0.1309F, 0.0F, 0.0F);
        this.malecube_r7.cubeList.add(new ModelBox(malecube_r7, 68, 37, -1.3F, -0.75F, -3.0F, 0, 1, 3, 0.0F, false));

        this.malecube_r8 = new ModelRenderer(this);
        this.malecube_r8.setRotationPoint(-0.4F, 0.5F, 0.975F);
        this.malebody.addChild(malecube_r8);
        this.setRotateAngle(malecube_r8, 0.1222F, 0.0F, 0.0F);
        this.malecube_r8.cubeList.add(new ModelBox(malecube_r8, 9, 59, -0.8F, -1.0131F, -0.0149F, 0, 1, 4, 0.0F, false));

        this.dorsalmale = new ModelRenderer(this);
        this.dorsalmale.setRotationPoint(-2.2F, -2.0392F, -1.2474F);
        this.body.addChild(dorsalmale);
        this.setRotateAngle(dorsalmale, -0.1309F, 0.0F, 0.0F);


        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.dorsalmale.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 23, 63, 0.3F, -5.5971F, -0.263F, 1, 6, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 37, 0.6F, -5.5221F, 0.737F, 0, 6, 3, 0.0F, false));

        this.tailmale = new ModelRenderer(this);
        this.tailmale.setRotationPoint(-0.3F, 1.1396F, 2.3994F);
        this.body.addChild(tailmale);
        this.setRotateAngle(tailmale, -0.1745F, 0.0F, 0.0F);
        this.tailmale.cubeList.add(new ModelBox(tailmale, 25, 37, -1.5F, -1.5287F, -0.2969F, 0, 3, 4, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.9F, 2.3713F, 0.1031F);
        this.tailmale.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.528F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 16, 21, -0.5F, -0.9029F, -0.0997F, 0, 1, 2, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.9F, -2.5287F, -0.2969F);
        this.tailmale.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3403F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 7, 65, -0.5F, -0.125F, 0.4F, 0, 1, 3, 0.0F, false));

        this.tailmale2 = new ModelRenderer(this);
        this.tailmale2.setRotationPoint(-0.4F, -0.6169F, 3.4949F);
        this.tailmale.addChild(tailmale2);
        this.setRotateAngle(tailmale2, -0.3054F, 0.0F, 0.0F);


        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.5F, -0.9118F, -0.5417F);
        this.tailmale2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0436F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 24, 12, 0.5F, 0.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.tailmale3 = new ModelRenderer(this);
        this.tailmale3.setRotationPoint(-0.4F, -0.4764F, 3.2007F);
        this.tailmale2.addChild(tailmale3);
        this.setRotateAngle(tailmale3, 0.3054F, 0.0F, 0.0F);


        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.8067F, 1.3848F);
        this.tailmale3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.7854F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 65, -0.4F, -0.7F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-2.0F, -0.8604F, 0.2576F);
        this.tailmale3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1309F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 8, 29, 1.5F, 0.3F, -0.6F, 0, 1, 3, 0.0F, false));

        this.tailmale4 = new ModelRenderer(this);
        this.tailmale4.setRotationPoint(-0.1F, -0.5221F, 3.7158F);
        this.tailmale3.addChild(tailmale4);


        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.0F, -0.3383F, -3.4582F);
        this.tailmale4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1309F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 13, 1.7F, -0.7F, 2.7F, 0, 4, 7, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 25, 1.5F, 0.3F, 2.35F, 0, 1, 5, 0.0F, false));

        this.horn2 = new ModelRenderer(this);
        this.horn2.setRotationPoint(0.2F, 9.4713F, -3.5469F);
        this.tailmale.addChild(horn2);


        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.3F, -11.3124F, 4.7792F);
        this.horn2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.288F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 4, 13, -0.075F, 0.375F, 0.35F, 0, 1, 1, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 24, 12, -0.125F, -0.075F, -0.125F, 0, 1, 1, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 24, 0, -0.15F, -0.475F, -0.625F, 0, 1, 1, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 31, 19, -0.2F, -0.875F, -1.125F, 0, 1, 1, 0.0F, false));

        this.dorsalmale2 = new ModelRenderer(this);
        this.dorsalmale2.setRotationPoint(-0.6F, -2.5287F, -0.2969F);
        this.tailmale.addChild(dorsalmale2);


        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -0.0879F, 2.677F);
        this.dorsalmale2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3054F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 16, 37, 0.0F, -1.425F, -2.05F, 0, 3, 4, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, -0.25F, 0.5F);
        this.dorsalmale2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3054F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 12, 29, -0.2F, -0.5F, -0.375F, 1, 1, 1, 0.0F, false));

        this.backrightfinmale = new ModelRenderer(this);
        this.backrightfinmale.setRotationPoint(-1.375F, 1.0713F, 0.6031F);
        this.tailmale.addChild(backrightfinmale);
        this.setRotateAngle(backrightfinmale, -0.1745F, 0.0F, 0.0F);


        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.2F, -0.4863F, 0.8611F);
        this.backrightfinmale.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1309F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 17, 13, 0.025F, 0.5932F, -0.4195F, 0, 1, 6, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.2F, 1.1927F, 0.7599F);
        this.backrightfinmale.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.3491F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 51, 0.0F, -1.0F, -0.75F, 0, 4, 3, 0.0F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.backrightfinmale.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1897F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 21, 21, 0.25F, -0.3F, -0.5F, 0, 2, 1, 0.0F, false));

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
