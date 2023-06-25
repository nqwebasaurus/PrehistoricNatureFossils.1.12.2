package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHuayangosaurus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer Bodyfrontslope_r1;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer HipPlates;
    private final ModelRenderer LeftPlate11;
    private final ModelRenderer Leftneckfrontplate_r1;
    private final ModelRenderer RightPlate11;
    private final ModelRenderer Leftneckfrontplate_r2;
    private final ModelRenderer LeftPlate12;
    private final ModelRenderer Leftneckfrontplate_r3;
    private final ModelRenderer RightPlate12;
    private final ModelRenderer Leftneckfrontplate_r4;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftFoot;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightFoot;
    private final ModelRenderer tail;
    private final ModelRenderer Tailbase_r1;
    private final ModelRenderer Tailbase_r2;
    private final ModelRenderer Bodyfrontslope_r2;
    private final ModelRenderer TailPlates;
    private final ModelRenderer leftPlate13;
    private final ModelRenderer Leftneckfrontplate_r5;
    private final ModelRenderer rightPlate13;
    private final ModelRenderer Leftneckfrontplate_r6;
    private final ModelRenderer tail2;
    private final ModelRenderer Tailmiddlebase_r1;
    private final ModelRenderer Tailbase_r3;
    private final ModelRenderer Tailbase_r4;
    private final ModelRenderer Bodyfrontslope_r3;
    private final ModelRenderer Tail2Plates;
    private final ModelRenderer leftPlate14;
    private final ModelRenderer Leftneckfrontplate_r7;
    private final ModelRenderer rightPlate14;
    private final ModelRenderer Leftneckfrontplate_r8;
    private final ModelRenderer leftPlate15;
    private final ModelRenderer Leftneckfrontplate_r9;
    private final ModelRenderer rightPlate15;
    private final ModelRenderer Leftneckfrontplate_r10;
    private final ModelRenderer tail3;
    private final ModelRenderer Tailbase_r5;
    private final ModelRenderer Bodyfrontslope_r4;
    private final ModelRenderer Tail3Plates;
    private final ModelRenderer leftPlate16;
    private final ModelRenderer Leftneckfrontplate_r11;
    private final ModelRenderer rightPlate16;
    private final ModelRenderer Leftneckfrontplate_r12;
    private final ModelRenderer leftPlate17;
    private final ModelRenderer Leftneckfrontplate_r13;
    private final ModelRenderer rightPlate17;
    private final ModelRenderer Leftneckfrontplate_r14;
    private final ModelRenderer leftPlate18;
    private final ModelRenderer Leftneckfrontplate_r15;
    private final ModelRenderer rightPlate18;
    private final ModelRenderer Leftneckfrontplate_r16;
    private final ModelRenderer tail4;
    private final ModelRenderer Tailmiddleend_r1;
    private final ModelRenderer Tail4Spikes;
    private final ModelRenderer leftTailSpike1;
    private final ModelRenderer babyskewer_r1;
    private final ModelRenderer Lefttailmiddleendspike_r1;
    private final ModelRenderer rightTailSpike1;
    private final ModelRenderer babyskewer_r2;
    private final ModelRenderer Lefttailmiddleendspike_r2;
    private final ModelRenderer tail5;
    private final ModelRenderer Tailend_r1;
    private final ModelRenderer Tail5Spikes;
    private final ModelRenderer leftTailSpike2;
    private final ModelRenderer babyskewer_r3;
    private final ModelRenderer Lefttailendspike_r1;
    private final ModelRenderer rightTailSpike2;
    private final ModelRenderer babyskewer_r4;
    private final ModelRenderer Lefttailendspike_r2;
    private final ModelRenderer body;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodymiddle_r2;
    private final ModelRenderer Bodymiddle_r3;
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
    private final ModelRenderer Bodyfrontslope_r5;
    private final ModelRenderer Bodyfrontslope_r6;
    private final ModelRenderer Bodyfrontslope_r7;
    private final ModelRenderer cube_r54;
    private final ModelRenderer BodyPlates;
    private final ModelRenderer leftPlate7;
    private final ModelRenderer Leftneckfrontplate_r17;
    private final ModelRenderer rightPlate7;
    private final ModelRenderer Leftneckfrontplate_r18;
    private final ModelRenderer leftPlate8;
    private final ModelRenderer Leftneckfrontplate_r19;
    private final ModelRenderer rightPlate8;
    private final ModelRenderer Leftneckfrontplate_r20;
    private final ModelRenderer leftPlate9;
    private final ModelRenderer Leftneckfrontplate_r21;
    private final ModelRenderer rightPlate9;
    private final ModelRenderer Leftneckfrontplate_r22;
    private final ModelRenderer leftPlate10;
    private final ModelRenderer Leftneckfrontplate_r23;
    private final ModelRenderer rightPlate10;
    private final ModelRenderer Leftneckfrontplate_r24;
    private final ModelRenderer chest;
    private final ModelRenderer Bodyfrontslope_r8;
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
    private final ModelRenderer Bodymiddle_r4;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer Bodyfrontslope_r9;
    private final ModelRenderer Bodyfrontslope_r10;
    private final ModelRenderer Bodyfrontslope_r11;
    private final ModelRenderer ChestPlates;
    private final ModelRenderer leftPlate5;
    private final ModelRenderer rightPlate5;
    private final ModelRenderer leftPlate6;
    private final ModelRenderer rightPlate6;
    private final ModelRenderer Leftlegspike;
    private final ModelRenderer Leftlegspiketip_r1;
    private final ModelRenderer Leftlegspikebase_r1;
    private final ModelRenderer Rightlegspike;
    private final ModelRenderer Leftlegspiketip_r2;
    private final ModelRenderer Leftlegspikebase_r2;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer neck;
    private final ModelRenderer Neckbase_r1;
    private final ModelRenderer cube_r98;
    private final ModelRenderer cube_r99;
    private final ModelRenderer cube_r100;
    private final ModelRenderer cube_r101;
    private final ModelRenderer Bodyfrontslope_r12;
    private final ModelRenderer NeckPlates;
    private final ModelRenderer leftPlate3;
    private final ModelRenderer rightPlate3;
    private final ModelRenderer leftPlate4;
    private final ModelRenderer Leftneckfrontplate_r25;
    private final ModelRenderer rightPlate4;
    private final ModelRenderer Leftneckfrontplate_r26;
    private final ModelRenderer neck2;
    private final ModelRenderer Neckmiddle_r1;
    private final ModelRenderer Neck2Plates;
    private final ModelRenderer leftPlate2;
    private final ModelRenderer rightPlate2;
    private final ModelRenderer neck3;
    private final ModelRenderer Neck3Plates;
    private final ModelRenderer leftPlate1;
    private final ModelRenderer rightPlate1;
    private final ModelRenderer head;
    private final ModelRenderer Lowerjawmiddle_r1;
    private final ModelRenderer Lowerjawmiddle_r2;
    private final ModelRenderer Upperjawfront_r1;
    private final ModelRenderer Upperjawfront_r2;
    private final ModelRenderer cube_r102;
    private final ModelRenderer cube_r103;
    private final ModelRenderer Upperjawslopefront_r1;
    private final ModelRenderer Upperjawslopefront_r2;
    private final ModelRenderer Upperjawslopebase_r1;
    private final ModelRenderer Upperjawfront_r3;
    private final ModelRenderer Upperjawfront_r4;
    private final ModelRenderer Upperjawfront_r5;
    private final ModelRenderer Head_r1;
    private final ModelRenderer jaw;
    private final ModelRenderer Lowerjawfront_r1;
    private final ModelRenderer Lowerjawmiddle_r3;
    private final ModelRenderer Lowerjawfront_r2;
    private final ModelRenderer Lowerjawfront_r3;
    private final ModelRenderer Lowerjawbase_r1;
    private final ModelRenderer Lowerjawbase_r2;
    private final ModelRenderer Lowerjawbase_r3;
    private final ModelRenderer Lowerjawmiddle_r4;
    private final ModelRenderer Lowerjawmiddle_r5;
    private final ModelRenderer Lowerjawmiddle_r6;
    private final ModelRenderer Lowerjawmiddle_r7;
    private final ModelRenderer Lowerjawmiddle_r8;
    private final ModelRenderer Lowerjawmiddle_r9;

    public ModelSkeletonHuayangosaurus() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -17.1F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -1.2F, -1.0F);
        this.root.addChild(hips);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.2F, 0.6212F, 6.0286F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.536F, 0.1546F, -0.1983F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 75, -0.1868F, -1.4219F, 0.0938F, 1, 3, 1, 0.003F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.2F, 0.6212F, 6.6286F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.407F, 0.2343F, -0.4593F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 66, -0.2339F, 5.1579F, -0.179F, 1, 1, 1, 0.001F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.2F, 0.6212F, 6.6286F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4245F, 0.2343F, -0.4593F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 43, 0, -0.2339F, 1.1804F, 0.1541F, 1, 4, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 45, -0.2339F, 1.1804F, -0.3459F, 1, 4, 1, 0.001F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.2F, 0.6212F, 6.1286F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1307F, 0.2141F, -0.3722F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 35, -0.2845F, -0.7025F, 0.9496F, 1, 2, 1, 0.003F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.2F, 0.6212F, 6.6286F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.0454F, 0.4372F, -0.3821F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 51, 12, -0.2031F, 0.4118F, 0.8317F, 1, 1, 5, 0.001F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.2F, 0.6212F, 6.0286F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.7348F, 0.3514F, -0.0937F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 66, -0.2758F, 0.3284F, -1.5455F, 1, 1, 3, 0.001F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-4.6F, -2.6788F, 6.7286F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0966F, 0.2532F, 0.1128F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 62, 41, 1.884F, 2.4418F, -4.5978F, 1, 1, 3, 0.001F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.6F, -2.6788F, 6.7286F);
        this.hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.9078F, 0.2537F, 0.1143F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 42, 1.9369F, 2.0016F, -0.1654F, 1, 2, 1, 0.001F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-4.6F, -1.5788F, 3.2286F);
        this.hips.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4715F, 0.2537F, 0.1143F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 3, 0.9371F, -0.6165F, 0.1391F, 1, 2, 1, 0.001F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.9F, -3.5788F, 1.3286F);
        this.hips.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2762F, 0.4718F, 0.4571F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 63, 27, -0.8335F, -0.5344F, -2.9443F, 1, 2, 3, 0.001F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.9F, -3.5788F, 1.4286F);
        this.hips.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0007F, 0.3456F, 0.4193F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 58, 0, -0.7996F, -0.5506F, -0.3369F, 1, 2, 4, 0.001F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-4.6F, -2.3788F, 7.4286F);
        this.hips.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3127F, -0.3559F, -0.1277F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 67, 34, -0.2226F, -0.0796F, -2.4084F, 2, 1, 2, 0.001F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 20, -0.2226F, -0.0796F, -0.4084F, 2, 1, 2, 0.001F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-4.6F, -2.3788F, 7.4286F);
        this.hips.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 74, 1.1F, -0.4493F, 1.0114F, 1, 1, 2, 0.001F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 74, 7.1F, -0.4493F, 1.0114F, 1, 1, 2, 0.001F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-4.6F, -2.3788F, 7.4286F);
        this.hips.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3054F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 46, 1.1F, -0.4564F, -3.999F, 1, 3, 5, 0.001F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 42, 2.1F, -0.1564F, -3.999F, 2, 1, 6, 0.001F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 42, 5.1F, -0.1564F, -3.999F, 2, 1, 6, 0.001F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 46, 7.1F, -0.4564F, -3.999F, 1, 3, 5, 0.001F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(3.9F, -3.5788F, 1.4286F);
        this.hips.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0007F, -0.3456F, -0.4193F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 58, 0, -0.2004F, -0.5506F, -0.3369F, 1, 2, 4, 0.001F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(3.9F, -3.5788F, 1.3286F);
        this.hips.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2762F, -0.4718F, -0.4571F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 63, 27, -0.1665F, -0.5344F, -2.9443F, 1, 2, 3, 0.001F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(4.6F, -2.3788F, 7.4286F);
        this.hips.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3127F, 0.3559F, 0.1277F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 20, -1.7774F, -0.0796F, -0.4084F, 2, 1, 2, 0.001F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 67, 34, -1.7774F, -0.0796F, -2.4084F, 2, 1, 2, 0.001F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(3.2F, 0.6212F, 6.0286F);
        this.hips.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.536F, -0.1546F, 0.1983F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 8, 75, -0.8132F, -1.4219F, 0.0938F, 1, 3, 1, 0.003F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(3.2F, 0.6212F, 6.1286F);
        this.hips.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1307F, -0.2141F, 0.3722F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 45, 35, -0.7155F, -0.7025F, 0.9496F, 1, 2, 1, 0.003F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(3.2F, 0.6212F, 6.6286F);
        this.hips.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4245F, -0.2343F, 0.4593F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 70, 45, -0.7661F, 1.1804F, -0.3459F, 1, 4, 1, 0.001F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 43, 0, -0.7661F, 1.1804F, 0.1541F, 1, 4, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(3.2F, 0.6212F, 6.6286F);
        this.hips.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.407F, -0.2343F, 0.4593F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 6, 66, -0.7661F, 5.1579F, -0.179F, 1, 1, 1, 0.001F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(3.2F, 0.6212F, 6.6286F);
        this.hips.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.0454F, -0.4372F, 0.3821F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 51, 12, -0.7969F, 0.4118F, 0.8317F, 1, 1, 5, 0.001F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(3.2F, 0.6212F, 6.0286F);
        this.hips.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.7348F, -0.3514F, 0.0937F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 44, 66, -0.7242F, 0.3284F, -1.5455F, 1, 1, 3, 0.001F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(4.6F, -2.6788F, 6.7286F);
        this.hips.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0966F, -0.2532F, -0.1128F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 62, 41, -2.884F, 2.4418F, -4.5978F, 1, 1, 3, 0.001F, false));

        this.Bodyfrontslope_r1 = new ModelRenderer(this);
        this.Bodyfrontslope_r1.setRotationPoint(0.0F, -3.9395F, 6.4008F);
        this.hips.addChild(Bodyfrontslope_r1);
        this.setRotateAngle(Bodyfrontslope_r1, -0.2494F, 0.0F, 0.0F);
        this.Bodyfrontslope_r1.cubeList.add(new ModelBox(Bodyfrontslope_r1, 78, 61, 0.0F, -0.9F, 3.5F, 0, 2, 1, 0.0F, false));
        this.Bodyfrontslope_r1.cubeList.add(new ModelBox(Bodyfrontslope_r1, 56, 41, 0.0F, -1.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(4.6F, -1.5788F, 3.2286F);
        this.hips.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.4715F, -0.2537F, -0.1143F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 3, -1.9371F, -0.6165F, 0.1391F, 1, 2, 1, 0.001F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(4.6F, -2.6788F, 6.7286F);
        this.hips.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.9078F, -0.2537F, -0.1143F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 39, 42, -2.9369F, 2.0016F, -0.1654F, 1, 2, 1, 0.001F, false));

        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, -3.45F, 3.5F);
        this.hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.2269F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 27, 9, -0.5F, -0.748F, -0.7887F, 1, 2, 8, 0.0F, false));

        this.HipPlates = new ModelRenderer(this);
        this.HipPlates.setRotationPoint(0.0F, 1.2F, 2.0F);
        this.hips.addChild(HipPlates);


        this.LeftPlate11 = new ModelRenderer(this);
        this.LeftPlate11.setRotationPoint(2.5F, -9.25F, 7.85F);
        this.HipPlates.addChild(LeftPlate11);
        this.setRotateAngle(LeftPlate11, -0.7298F, 0.1468F, 0.162F);
        this.LeftPlate11.cubeList.add(new ModelBox(LeftPlate11, 70, 16, -1.0F, -1.0F, -0.25F, 1, 6, 1, 0.0F, false));

        this.Leftneckfrontplate_r1 = new ModelRenderer(this);
        this.Leftneckfrontplate_r1.setRotationPoint(0.0F, -1.0F, -0.25F);
        this.LeftPlate11.addChild(Leftneckfrontplate_r1);
        this.setRotateAngle(Leftneckfrontplate_r1, -0.1745F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r1.cubeList.add(new ModelBox(Leftneckfrontplate_r1, 70, 8, -1.0F, 0.0F, 0.0F, 1, 6, 1, -0.01F, false));

        this.RightPlate11 = new ModelRenderer(this);
        this.RightPlate11.setRotationPoint(-2.5F, -9.25F, 7.85F);
        this.HipPlates.addChild(RightPlate11);
        this.setRotateAngle(RightPlate11, -0.7298F, -0.1468F, -0.162F);
        this.RightPlate11.cubeList.add(new ModelBox(RightPlate11, 70, 16, 0.0F, -1.0F, -0.25F, 1, 6, 1, 0.0F, true));

        this.Leftneckfrontplate_r2 = new ModelRenderer(this);
        this.Leftneckfrontplate_r2.setRotationPoint(0.0F, -1.0F, -0.25F);
        this.RightPlate11.addChild(Leftneckfrontplate_r2);
        this.setRotateAngle(Leftneckfrontplate_r2, -0.1745F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r2.cubeList.add(new ModelBox(Leftneckfrontplate_r2, 70, 8, 0.0F, 0.0F, 0.0F, 1, 6, 1, -0.01F, true));

        this.LeftPlate12 = new ModelRenderer(this);
        this.LeftPlate12.setRotationPoint(2.25F, -7.0F, 10.3F);
        this.HipPlates.addChild(LeftPlate12);
        this.setRotateAngle(LeftPlate12, -0.5996F, 0.1245F, 0.1796F);


        this.Leftneckfrontplate_r3 = new ModelRenderer(this);
        this.Leftneckfrontplate_r3.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.LeftPlate12.addChild(Leftneckfrontplate_r3);
        this.setRotateAngle(Leftneckfrontplate_r3, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r3.cubeList.add(new ModelBox(Leftneckfrontplate_r3, 0, 26, -1.0F, -2.15F, -1.15F, 1, 5, 2, 0.0F, false));

        this.RightPlate12 = new ModelRenderer(this);
        this.RightPlate12.setRotationPoint(-2.25F, -7.0F, 10.3F);
        this.HipPlates.addChild(RightPlate12);
        this.setRotateAngle(RightPlate12, -0.5996F, -0.1245F, -0.1796F);


        this.Leftneckfrontplate_r4 = new ModelRenderer(this);
        this.Leftneckfrontplate_r4.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.RightPlate12.addChild(Leftneckfrontplate_r4);
        this.setRotateAngle(Leftneckfrontplate_r4, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r4.cubeList.add(new ModelBox(Leftneckfrontplate_r4, 0, 26, 0.0F, -2.15F, -1.15F, 1, 5, 2, 0.0F, true));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.25F, 0.25F, 5.75F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.088F, -0.0114F, -0.1304F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 47, 54, -1.37F, -0.4877F, -1.0872F, 2, 9, 2, 0.0F, false));

        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.13F, 8.2623F, -2.0872F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1731F, -0.0227F, 0.1289F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 22, 50, -1.5F, 0.8625F, 0.6433F, 2, 9, 2, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 29, 64, -0.9F, 0.8625F, 2.8433F, 1, 8, 1, -0.2F, false));

        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(-0.6F, 8.6125F, 1.8933F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.2618F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 26, 0, -2.5F, -0.0436F, -4.251F, 5, 2, 6, 0.0F, false));

        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.25F, -0.05F, 5.75F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.4356F, 0.0114F, 0.1304F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 49, 0, -0.63F, -0.4877F, -1.0872F, 2, 9, 2, 0.0F, false));

        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.13F, 8.2623F, -2.0872F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5658F, 0.0227F, -0.1289F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 13, 48, -0.5F, 0.8625F, 0.6433F, 2, 9, 2, 0.0F, false));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 42, 57, -0.1F, 0.8625F, 2.8433F, 1, 8, 1, -0.2F, false));

        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.6F, 8.6125F, 1.8933F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3491F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 15, 20, -2.5F, -0.0436F, -4.251F, 5, 2, 6, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -1.85F, 10.1F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2657F, 0.1685F, -0.0456F);
        this.tail.cubeList.add(new ModelBox(tail, 19, 29, 0.0F, -0.7512F, -0.0018F, 1, 2, 7, -0.002F, false));

        this.Tailbase_r1 = new ModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.5F, 1.6971F, 3.6888F);
        this.tail.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, 0.7418F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 80, 16, 0.0F, 1.367F, 1.0431F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 80, 20, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Tailbase_r2 = new ModelRenderer(this);
        this.Tailbase_r2.setRotationPoint(0.5F, 1.2488F, 1.4982F);
        this.tail.addChild(Tailbase_r2);
        this.setRotateAngle(Tailbase_r2, 0.6545F, 0.0F, 0.0F);
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 22, 80, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Bodyfrontslope_r2 = new ModelRenderer(this);
        this.Bodyfrontslope_r2.setRotationPoint(0.5F, -0.6628F, 1.4387F);
        this.tail.addChild(Bodyfrontslope_r2);
        this.setRotateAngle(Bodyfrontslope_r2, -0.0749F, 0.0F, 0.0F);
        this.Bodyfrontslope_r2.cubeList.add(new ModelBox(Bodyfrontslope_r2, 50, 78, 0.0F, -1.3F, 3.6F, 0, 2, 1, 0.0F, false));
        this.Bodyfrontslope_r2.cubeList.add(new ModelBox(Bodyfrontslope_r2, 78, 53, 0.0F, -1.3F, 1.6F, 0, 2, 1, 0.0F, false));
        this.Bodyfrontslope_r2.cubeList.add(new ModelBox(Bodyfrontslope_r2, 78, 57, 0.0F, -1.3F, -0.4F, 0, 2, 1, 0.0F, false));

        this.TailPlates = new ModelRenderer(this);
        this.TailPlates.setRotationPoint(0.0F, -2.5512F, 0.2482F);
        this.tail.addChild(TailPlates);


        this.leftPlate13 = new ModelRenderer(this);
        this.leftPlate13.setRotationPoint(2.5F, -1.3F, 4.45F);
        this.TailPlates.addChild(leftPlate13);
        this.setRotateAngle(leftPlate13, -0.2132F, 0.0469F, 0.2132F);


        this.Leftneckfrontplate_r5 = new ModelRenderer(this);
        this.Leftneckfrontplate_r5.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate13.addChild(Leftneckfrontplate_r5);
        this.setRotateAngle(Leftneckfrontplate_r5, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r5.cubeList.add(new ModelBox(Leftneckfrontplate_r5, 0, 37, -1.0F, -2.15F, -1.25F, 1, 4, 2, 0.0F, false));

        this.rightPlate13 = new ModelRenderer(this);
        this.rightPlate13.setRotationPoint(-1.5F, -1.3F, 4.45F);
        this.TailPlates.addChild(rightPlate13);
        this.setRotateAngle(rightPlate13, -0.2132F, -0.0469F, -0.2132F);


        this.Leftneckfrontplate_r6 = new ModelRenderer(this);
        this.Leftneckfrontplate_r6.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate13.addChild(Leftneckfrontplate_r6);
        this.setRotateAngle(Leftneckfrontplate_r6, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r6.cubeList.add(new ModelBox(Leftneckfrontplate_r6, 0, 37, 0.0F, -2.15F, -1.25F, 1, 4, 2, 0.0F, true));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1488F, 6.2982F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.134F, 0.2163F, 0.0289F);


        this.Tailmiddlebase_r1 = new ModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.5F, 0.1102F, -0.0188F);
        this.tail2.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, -0.0436F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 0, 26, -0.5F, -1.0F, 0.0F, 1, 2, 8, 0.0F, false));

        this.Tailbase_r3 = new ModelRenderer(this);
        this.Tailbase_r3.setRotationPoint(0.5F, 1.4494F, 3.0909F);
        this.tail2.addChild(Tailbase_r3);
        this.setRotateAngle(Tailbase_r3, 0.5672F, 0.0F, 0.0F);
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 65, 0, 0.0F, 0.7022F, 1.3286F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 77, 18, 0.0F, -0.1431F, -0.484F, 0, 2, 1, 0.0F, false));

        this.Tailbase_r4 = new ModelRenderer(this);
        this.Tailbase_r4.setRotationPoint(0.5F, 1.7104F, 1.108F);
        this.tail2.addChild(Tailbase_r4);
        this.setRotateAngle(Tailbase_r4, 0.6545F, 0.0F, 0.0F);
        this.Tailbase_r4.cubeList.add(new ModelBox(Tailbase_r4, 77, 40, 0.0F, -0.1431F, -0.484F, 0, 2, 1, 0.0F, false));

        this.Bodyfrontslope_r3 = new ModelRenderer(this);
        this.Bodyfrontslope_r3.setRotationPoint(0.5F, -0.7015F, -4.5783F);
        this.tail2.addChild(Bodyfrontslope_r3);
        this.setRotateAngle(Bodyfrontslope_r3, -0.0749F, 0.0F, 0.0F);
        this.Bodyfrontslope_r3.cubeList.add(new ModelBox(Bodyfrontslope_r3, 34, 78, 0.0F, -1.3F, 9.6F, 0, 2, 1, 0.0F, false));
        this.Bodyfrontslope_r3.cubeList.add(new ModelBox(Bodyfrontslope_r3, 37, 78, 0.0F, -1.3F, 7.6F, 0, 2, 1, 0.0F, false));
        this.Bodyfrontslope_r3.cubeList.add(new ModelBox(Bodyfrontslope_r3, 78, 44, 0.0F, -1.3F, 5.6F, 0, 2, 1, 0.0F, false));

        this.Tail2Plates = new ModelRenderer(this);
        this.Tail2Plates.setRotationPoint(0.0F, -2.0898F, 0.9812F);
        this.tail2.addChild(Tail2Plates);


        this.leftPlate14 = new ModelRenderer(this);
        this.leftPlate14.setRotationPoint(2.0F, -1.8F, 1.5F);
        this.Tail2Plates.addChild(leftPlate14);
        this.setRotateAngle(leftPlate14, -0.3011F, 0.0522F, 0.1666F);


        this.Leftneckfrontplate_r7 = new ModelRenderer(this);
        this.Leftneckfrontplate_r7.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate14.addChild(Leftneckfrontplate_r7);
        this.setRotateAngle(Leftneckfrontplate_r7, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r7.cubeList.add(new ModelBox(Leftneckfrontplate_r7, 68, 68, -0.9F, -1.45F, -1.25F, 1, 3, 2, 0.0F, false));

        this.rightPlate14 = new ModelRenderer(this);
        this.rightPlate14.setRotationPoint(-1.0F, -1.8F, 1.5F);
        this.Tail2Plates.addChild(rightPlate14);
        this.setRotateAngle(rightPlate14, -0.3011F, -0.0522F, -0.1666F);


        this.Leftneckfrontplate_r8 = new ModelRenderer(this);
        this.Leftneckfrontplate_r8.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate14.addChild(Leftneckfrontplate_r8);
        this.setRotateAngle(Leftneckfrontplate_r8, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r8.cubeList.add(new ModelBox(Leftneckfrontplate_r8, 68, 68, -0.1F, -1.45F, -1.25F, 1, 3, 2, 0.0F, true));

        this.leftPlate15 = new ModelRenderer(this);
        this.leftPlate15.setRotationPoint(2.0F, -1.15F, 5.2F);
        this.Tail2Plates.addChild(leftPlate15);
        this.setRotateAngle(leftPlate15, -0.303F, 0.0393F, 0.1249F);


        this.Leftneckfrontplate_r9 = new ModelRenderer(this);
        this.Leftneckfrontplate_r9.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate15.addChild(Leftneckfrontplate_r9);
        this.setRotateAngle(Leftneckfrontplate_r9, 0.0436F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r9.cubeList.add(new ModelBox(Leftneckfrontplate_r9, 20, 39, -1.0F, -1.45F, -1.25F, 1, 3, 2, 0.0F, false));

        this.rightPlate15 = new ModelRenderer(this);
        this.rightPlate15.setRotationPoint(-1.0F, -1.15F, 5.2F);
        this.Tail2Plates.addChild(rightPlate15);
        this.setRotateAngle(rightPlate15, -0.303F, -0.0393F, -0.1249F);


        this.Leftneckfrontplate_r10 = new ModelRenderer(this);
        this.Leftneckfrontplate_r10.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate15.addChild(Leftneckfrontplate_r10);
        this.setRotateAngle(Leftneckfrontplate_r10, 0.0436F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r10.cubeList.add(new ModelBox(Leftneckfrontplate_r10, 20, 39, 0.0F, -1.45F, -1.25F, 1, 3, 2, 0.0F, true));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1602F, 7.5812F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0447F, 0.218F, 0.0097F);
        this.tail3.cubeList.add(new ModelBox(tail3, 14, 4, 0.0F, -0.7806F, -0.5131F, 1, 2, 9, -0.002F, false));

        this.Tailbase_r5 = new ModelRenderer(this);
        this.Tailbase_r5.setRotationPoint(0.5F, 1.3085F, -4.4034F);
        this.tail3.addChild(Tailbase_r5);
        this.setRotateAngle(Tailbase_r5, 0.5672F, 0.0F, 0.0F);
        this.Tailbase_r5.cubeList.add(new ModelBox(Tailbase_r5, 38, 57, 0.0F, 1.5474F, 3.1412F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r5.cubeList.add(new ModelBox(Tailbase_r5, 0, 13, 0.0F, 6.2414F, 10.2373F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r5.cubeList.add(new ModelBox(Tailbase_r5, 13, 3, 0.0F, 4.3179F, 8.4633F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r5.cubeList.add(new ModelBox(Tailbase_r5, 32, 42, 0.0F, 3.3944F, 6.6893F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r5.cubeList.add(new ModelBox(Tailbase_r5, 58, 0, 0.0F, 2.4709F, 4.9153F, 0, 2, 1, 0.0F, false));

        this.Bodyfrontslope_r4 = new ModelRenderer(this);
        this.Bodyfrontslope_r4.setRotationPoint(0.5F, -0.8423F, -12.0727F);
        this.tail3.addChild(Bodyfrontslope_r4);
        this.setRotateAngle(Bodyfrontslope_r4, -0.0749F, 0.0F, 0.0F);
        this.Bodyfrontslope_r4.cubeList.add(new ModelBox(Bodyfrontslope_r4, 3, 78, 0.0F, -1.3F, 15.6F, 0, 2, 1, 0.0F, false));
        this.Bodyfrontslope_r4.cubeList.add(new ModelBox(Bodyfrontslope_r4, 78, 13, 0.0F, -1.3F, 13.6F, 0, 2, 1, 0.0F, false));
        this.Bodyfrontslope_r4.cubeList.add(new ModelBox(Bodyfrontslope_r4, 26, 78, 0.0F, -1.3F, 11.6F, 0, 2, 1, 0.0F, false));

        this.Tail3Plates = new ModelRenderer(this);
        this.Tail3Plates.setRotationPoint(0.0F, -1.9806F, 0.4869F);
        this.tail3.addChild(Tail3Plates);


        this.leftPlate16 = new ModelRenderer(this);
        this.leftPlate16.setRotationPoint(1.5F, -1.0F, 0.85F);
        this.Tail3Plates.addChild(leftPlate16);
        this.setRotateAngle(leftPlate16, 0.1309F, 0.0F, 0.0F);


        this.Leftneckfrontplate_r11 = new ModelRenderer(this);
        this.Leftneckfrontplate_r11.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate16.addChild(Leftneckfrontplate_r11);
        this.setRotateAngle(Leftneckfrontplate_r11, -0.3491F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r11.cubeList.add(new ModelBox(Leftneckfrontplate_r11, 29, 30, 0.0F, -1.45F, -0.85F, 0, 3, 2, 0.0F, false));

        this.rightPlate16 = new ModelRenderer(this);
        this.rightPlate16.setRotationPoint(-0.5F, -1.0F, 0.85F);
        this.Tail3Plates.addChild(rightPlate16);
        this.setRotateAngle(rightPlate16, 0.1309F, 0.0F, 0.0F);


        this.Leftneckfrontplate_r12 = new ModelRenderer(this);
        this.Leftneckfrontplate_r12.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate16.addChild(Leftneckfrontplate_r12);
        this.setRotateAngle(Leftneckfrontplate_r12, -0.3491F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r12.cubeList.add(new ModelBox(Leftneckfrontplate_r12, 29, 30, 0.0F, -1.45F, -0.85F, 0, 3, 2, 0.0F, true));

        this.leftPlate17 = new ModelRenderer(this);
        this.leftPlate17.setRotationPoint(1.25F, 0.25F, 3.85F);
        this.Tail3Plates.addChild(leftPlate17);
        this.setRotateAngle(leftPlate17, 0.1309F, 0.0F, 0.0F);


        this.Leftneckfrontplate_r13 = new ModelRenderer(this);
        this.Leftneckfrontplate_r13.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate17.addChild(Leftneckfrontplate_r13);
        this.setRotateAngle(Leftneckfrontplate_r13, -0.2182F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r13.cubeList.add(new ModelBox(Leftneckfrontplate_r13, 0, 46, 0.0F, -2.0F, -0.55F, 0, 2, 2, 0.0F, false));

        this.rightPlate17 = new ModelRenderer(this);
        this.rightPlate17.setRotationPoint(-0.25F, 0.25F, 3.85F);
        this.Tail3Plates.addChild(rightPlate17);
        this.setRotateAngle(rightPlate17, 0.1309F, 0.0F, 0.0F);


        this.Leftneckfrontplate_r14 = new ModelRenderer(this);
        this.Leftneckfrontplate_r14.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate17.addChild(Leftneckfrontplate_r14);
        this.setRotateAngle(Leftneckfrontplate_r14, -0.2182F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r14.cubeList.add(new ModelBox(Leftneckfrontplate_r14, 0, 46, 0.0F, -2.0F, -0.55F, 0, 2, 2, 0.0F, true));

        this.leftPlate18 = new ModelRenderer(this);
        this.leftPlate18.setRotationPoint(1.0F, 0.5F, 7.35F);
        this.Tail3Plates.addChild(leftPlate18);
        this.setRotateAngle(leftPlate18, 0.1309F, 0.0F, 0.0F);


        this.Leftneckfrontplate_r15 = new ModelRenderer(this);
        this.Leftneckfrontplate_r15.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate18.addChild(Leftneckfrontplate_r15);
        this.setRotateAngle(Leftneckfrontplate_r15, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r15.cubeList.add(new ModelBox(Leftneckfrontplate_r15, 6, 13, 0.0F, -1.75F, -0.75F, 0, 1, 1, 0.0F, false));

        this.rightPlate18 = new ModelRenderer(this);
        this.rightPlate18.setRotationPoint(0.0F, 0.5F, 7.35F);
        this.Tail3Plates.addChild(rightPlate18);
        this.setRotateAngle(rightPlate18, 0.1309F, 0.0F, 0.0F);


        this.Leftneckfrontplate_r16 = new ModelRenderer(this);
        this.Leftneckfrontplate_r16.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate18.addChild(Leftneckfrontplate_r16);
        this.setRotateAngle(Leftneckfrontplate_r16, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r16.cubeList.add(new ModelBox(Leftneckfrontplate_r16, 6, 13, 0.0F, -1.75F, -0.75F, 0, 1, 1, 0.0F, true));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.4806F, 8.4869F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0457F, -0.3051F, -0.0138F);


        this.Tailmiddleend_r1 = new ModelRenderer(this);
        this.Tailmiddleend_r1.setRotationPoint(0.5F, 0.301F, -0.0564F);
        this.tail4.addChild(Tailmiddleend_r1);
        this.setRotateAngle(Tailmiddleend_r1, -0.0524F, 0.0F, 0.0F);
        this.Tailmiddleend_r1.cubeList.add(new ModelBox(Tailmiddleend_r1, 10, 39, -0.5F, -0.5F, -0.1F, 1, 1, 7, 0.0F, false));

        this.Tail4Spikes = new ModelRenderer(this);
        this.Tail4Spikes.setRotationPoint(0.0F, -0.999F, 0.0436F);
        this.tail4.addChild(Tail4Spikes);


        this.leftTailSpike1 = new ModelRenderer(this);
        this.leftTailSpike1.setRotationPoint(1.5F, 4.15F, 3.65F);
        this.Tail4Spikes.addChild(leftTailSpike1);
        this.setRotateAngle(leftTailSpike1, -0.4504F, -0.039F, 1.0778F);
        this.leftTailSpike1.cubeList.add(new ModelBox(leftTailSpike1, 56, 64, -3.25F, -9.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.babyskewer_r1 = new ModelRenderer(this);
        this.babyskewer_r1.setRotationPoint(-2.75F, -8.95F, -0.5F);
        this.leftTailSpike1.addChild(babyskewer_r1);
        this.setRotateAngle(babyskewer_r1, -0.1309F, 0.0F, 0.0F);
        this.babyskewer_r1.cubeList.add(new ModelBox(babyskewer_r1, 70, 60, -0.5F, 2.95F, 0.1F, 1, 5, 1, -0.02F, false));

        this.Lefttailmiddleendspike_r1 = new ModelRenderer(this);
        this.Lefttailmiddleendspike_r1.setRotationPoint(-2.75F, -8.95F, -0.5F);
        this.leftTailSpike1.addChild(Lefttailmiddleendspike_r1);
        this.setRotateAngle(Lefttailmiddleendspike_r1, -0.1745F, 0.0F, 0.0F);
        this.Lefttailmiddleendspike_r1.cubeList.add(new ModelBox(Lefttailmiddleendspike_r1, 34, 64, -0.5F, -0.05F, 0.0F, 1, 8, 1, -0.01F, false));

        this.rightTailSpike1 = new ModelRenderer(this);
        this.rightTailSpike1.setRotationPoint(-0.5F, 4.15F, 3.65F);
        this.Tail4Spikes.addChild(rightTailSpike1);
        this.setRotateAngle(rightTailSpike1, -0.4504F, 0.039F, -1.0778F);
        this.rightTailSpike1.cubeList.add(new ModelBox(rightTailSpike1, 56, 64, 2.25F, -9.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.babyskewer_r2 = new ModelRenderer(this);
        this.babyskewer_r2.setRotationPoint(2.75F, -8.95F, -0.5F);
        this.rightTailSpike1.addChild(babyskewer_r2);
        this.setRotateAngle(babyskewer_r2, -0.1309F, 0.0F, 0.0F);
        this.babyskewer_r2.cubeList.add(new ModelBox(babyskewer_r2, 70, 60, -0.5F, 2.95F, 0.1F, 1, 5, 1, -0.02F, true));

        this.Lefttailmiddleendspike_r2 = new ModelRenderer(this);
        this.Lefttailmiddleendspike_r2.setRotationPoint(2.75F, -8.95F, -0.5F);
        this.rightTailSpike1.addChild(Lefttailmiddleendspike_r2);
        this.setRotateAngle(Lefttailmiddleendspike_r2, -0.1745F, 0.0F, 0.0F);
        this.Lefttailmiddleendspike_r2.cubeList.add(new ModelBox(Lefttailmiddleendspike_r2, 34, 64, -0.5F, -0.05F, 0.0F, 1, 8, 1, -0.01F, true));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.601F, 6.9436F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0962F, -0.4346F, 0.0406F);


        this.Tailend_r1 = new ModelRenderer(this);
        this.Tailend_r1.setRotationPoint(0.5F, 0.1451F, 0.2125F);
        this.tail5.addChild(Tailend_r1);
        this.setRotateAngle(Tailend_r1, -0.0873F, 0.0F, 0.0F);
        this.Tailend_r1.cubeList.add(new ModelBox(Tailend_r1, 0, 37, -0.5F, -0.5F, -0.5F, 1, 1, 7, -0.002F, false));

        this.Tail5Spikes = new ModelRenderer(this);
        this.Tail5Spikes.setRotationPoint(0.0F, -1.0049F, 0.0125F);
        this.tail5.addChild(Tail5Spikes);


        this.leftTailSpike2 = new ModelRenderer(this);
        this.leftTailSpike2.setRotationPoint(0.2F, 1.9F, 0.85F);
        this.Tail5Spikes.addChild(leftTailSpike2);
        this.setRotateAngle(leftTailSpike2, -0.7352F, -0.0196F, 1.1086F);
        this.leftTailSpike2.cubeList.add(new ModelBox(leftTailSpike2, 65, 53, -1.25F, -8.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.babyskewer_r3 = new ModelRenderer(this);
        this.babyskewer_r3.setRotationPoint(-0.75F, -7.95F, -0.5F);
        this.leftTailSpike2.addChild(babyskewer_r3);
        this.setRotateAngle(babyskewer_r3, -0.1309F, 0.0F, 0.0F);
        this.babyskewer_r3.cubeList.add(new ModelBox(babyskewer_r3, 70, 53, -0.5F, 2.0F, 0.0F, 1, 5, 1, -0.02F, false));

        this.Lefttailendspike_r1 = new ModelRenderer(this);
        this.Lefttailendspike_r1.setRotationPoint(-0.75F, -7.95F, -0.5F);
        this.leftTailSpike2.addChild(Lefttailendspike_r1);
        this.setRotateAngle(Lefttailendspike_r1, -0.1745F, 0.0F, 0.0F);
        this.Lefttailendspike_r1.cubeList.add(new ModelBox(Lefttailendspike_r1, 65, 17, -0.5F, -0.05F, 0.0F, 1, 7, 1, -0.01F, false));

        this.rightTailSpike2 = new ModelRenderer(this);
        this.rightTailSpike2.setRotationPoint(0.8F, 1.9F, 0.85F);
        this.Tail5Spikes.addChild(rightTailSpike2);
        this.setRotateAngle(rightTailSpike2, -0.7352F, 0.0196F, -1.1086F);
        this.rightTailSpike2.cubeList.add(new ModelBox(rightTailSpike2, 65, 53, 0.25F, -8.0F, -0.5F, 1, 7, 1, 0.0F, true));

        this.babyskewer_r4 = new ModelRenderer(this);
        this.babyskewer_r4.setRotationPoint(0.75F, -7.95F, -0.5F);
        this.rightTailSpike2.addChild(babyskewer_r4);
        this.setRotateAngle(babyskewer_r4, -0.1309F, 0.0F, 0.0F);
        this.babyskewer_r4.cubeList.add(new ModelBox(babyskewer_r4, 70, 53, -0.5F, 2.0F, 0.0F, 1, 5, 1, -0.02F, true));

        this.Lefttailendspike_r2 = new ModelRenderer(this);
        this.Lefttailendspike_r2.setRotationPoint(0.75F, -7.95F, -0.5F);
        this.rightTailSpike2.addChild(Lefttailendspike_r2);
        this.setRotateAngle(Lefttailendspike_r2, -0.1745F, 0.0F, 0.0F);
        this.Lefttailendspike_r2.cubeList.add(new ModelBox(Lefttailendspike_r2, 65, 17, -0.5F, -0.05F, 0.0F, 1, 7, 1, -0.01F, true));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.8F, 3.0F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, -0.55F, -10.1F, 1, 2, 10, -0.002F, false));

        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(-4.8F, 4.95F, -3.1F);
        this.body.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, -0.6545F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 49, 73, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, true));
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 49, 73, 9.6F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.Bodymiddle_r2 = new ModelRenderer(this);
        this.Bodymiddle_r2.setRotationPoint(-5.1F, 5.25F, -6.1F);
        this.body.addChild(Bodymiddle_r2);
        this.setRotateAngle(Bodymiddle_r2, -0.6545F, 0.0F, 0.0F);
        this.Bodymiddle_r2.cubeList.add(new ModelBox(Bodymiddle_r2, 47, 24, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, true));
        this.Bodymiddle_r2.cubeList.add(new ModelBox(Bodymiddle_r2, 47, 24, 10.2F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.Bodymiddle_r3 = new ModelRenderer(this);
        this.Bodymiddle_r3.setRotationPoint(-5.1F, 5.65F, -9.1F);
        this.body.addChild(Bodymiddle_r3);
        this.setRotateAngle(Bodymiddle_r3, -0.6545F, 0.0F, 0.0F);
        this.Bodymiddle_r3.cubeList.add(new ModelBox(Bodymiddle_r3, 69, 74, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, true));
        this.Bodymiddle_r3.cubeList.add(new ModelBox(Bodymiddle_r3, 69, 74, 10.2F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5064F, 0.8165F, -2.8482F);
        this.body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1575F, 0.0392F, 0.0677F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 62, 77, -3.4467F, 3.1438F, -0.2288F, 0, 3, 1, 0.0F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5064F, 0.7165F, -4.8482F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0703F, 0.0331F, 0.0708F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 76, 34, -3.4467F, 3.1438F, -0.2288F, 0, 4, 1, 0.0F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5064F, 0.6165F, -6.8482F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0167F, 0.0268F, 0.0734F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 66, 73, -3.4467F, 3.1438F, -0.2288F, 0, 5, 1, 0.0F, true));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5064F, 0.6165F, -8.8482F);
        this.body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0864F, 0.0217F, 0.0751F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 26, 70, -3.4467F, 3.1438F, -0.2288F, 0, 6, 1, 0.0F, true));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5064F, 0.6165F, -8.8482F);
        this.body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0874F, -0.0168F, 0.5098F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 41, 75, -1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, true));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5064F, 0.6165F, -6.8482F);
        this.body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0265F, 0.0173F, 0.5098F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 16, 75, -1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, true));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5064F, 0.7165F, -4.8482F);
        this.body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0498F, 0.0598F, 0.5068F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 75, 13, -1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, true));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5064F, 0.8165F, -2.8482F);
        this.body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1264F, 0.1019F, 0.5006F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 13, 75, -1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5064F, 0.8165F, -0.8482F);
        this.body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.2428F, 0.1639F, 0.3979F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 13, 75, -1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5064F, 0.8165F, -0.8482F);
        this.body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.093F, 0.2658F, 1.7866F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 80, 25, -0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5064F, 0.8165F, -2.8482F);
        this.body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0537F, 0.1407F, 1.8659F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 80, 25, -0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5064F, 0.7165F, -4.8482F);
        this.body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0283F, 0.0572F, 1.8634F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 29, 80, -0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.5064F, 0.6165F, -6.8482F);
        this.body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0031F, -0.0264F, 1.863F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 80, 39, -0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, true));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5064F, 0.6165F, -8.8482F);
        this.body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.0171F, -0.0932F, 1.8642F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 80, 47, -0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, true));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5064F, 0.8165F, -0.8482F);
        this.body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.2428F, -0.1639F, -0.3979F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 13, 75, 1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5064F, 0.8165F, -0.8482F);
        this.body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.093F, -0.2658F, -1.7866F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 80, 25, 0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5064F, 0.8165F, -2.8482F);
        this.body.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0537F, -0.1407F, -1.8659F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 80, 25, 0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.5064F, 0.8165F, -2.8482F);
        this.body.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.1264F, -0.1019F, -0.5006F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 13, 75, 1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5064F, 0.8165F, -2.8482F);
        this.body.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.1575F, -0.0392F, -0.0677F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 62, 77, 3.4467F, 3.1438F, -0.2288F, 0, 3, 1, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5064F, 0.7165F, -4.8482F);
        this.body.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0283F, -0.0572F, -1.8634F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 29, 80, 0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(0.5064F, 0.7165F, -4.8482F);
        this.body.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.0498F, -0.0598F, -0.5068F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 75, 13, 1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.5064F, 0.7165F, -4.8482F);
        this.body.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0703F, -0.0331F, -0.0708F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 76, 34, 3.4467F, 3.1438F, -0.2288F, 0, 4, 1, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.5064F, 0.6165F, -6.8482F);
        this.body.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0031F, 0.0264F, -1.863F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 80, 39, 0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.5064F, 0.6165F, -6.8482F);
        this.body.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0265F, -0.0173F, -0.5098F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 16, 75, 1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5064F, 0.6165F, -6.8482F);
        this.body.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0167F, -0.0268F, -0.0734F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 66, 73, 3.4467F, 3.1438F, -0.2288F, 0, 5, 1, 0.0F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5064F, 0.6165F, -8.8482F);
        this.body.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0171F, 0.0932F, -1.8642F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 80, 47, 0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.5064F, 0.6165F, -8.8482F);
        this.body.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0864F, -0.0217F, -0.0751F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 26, 70, 3.4467F, 3.1438F, -0.2288F, 0, 6, 1, 0.0F, false));

        this.Bodyfrontslope_r5 = new ModelRenderer(this);
        this.Bodyfrontslope_r5.setRotationPoint(0.0F, -0.8488F, -2.5571F);
        this.body.addChild(Bodyfrontslope_r5);
        this.setRotateAngle(Bodyfrontslope_r5, -0.1185F, 0.0F, 0.0F);
        this.Bodyfrontslope_r5.cubeList.add(new ModelBox(Bodyfrontslope_r5, 6, 79, 0.0F, -1.0F, 1.5F, 0, 2, 1, 0.0F, false));
        this.Bodyfrontslope_r5.cubeList.add(new ModelBox(Bodyfrontslope_r5, 19, 79, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Bodyfrontslope_r6 = new ModelRenderer(this);
        this.Bodyfrontslope_r6.setRotationPoint(0.0F, -0.5555F, -6.7747F);
        this.body.addChild(Bodyfrontslope_r6);
        this.setRotateAngle(Bodyfrontslope_r6, -0.0312F, 0.0F, 0.0F);
        this.Bodyfrontslope_r6.cubeList.add(new ModelBox(Bodyfrontslope_r6, 79, 31, 0.0F, -1.4248F, 1.7064F, 0, 2, 1, 0.0F, false));
        this.Bodyfrontslope_r6.cubeList.add(new ModelBox(Bodyfrontslope_r6, 79, 35, 0.0F, -1.4248F, -0.2936F, 0, 2, 1, 0.0F, false));

        this.Bodyfrontslope_r7 = new ModelRenderer(this);
        this.Bodyfrontslope_r7.setRotationPoint(0.0F, -1.0555F, -8.7747F);
        this.body.addChild(Bodyfrontslope_r7);
        this.setRotateAngle(Bodyfrontslope_r7, 0.0124F, 0.0F, 0.0F);
        this.Bodyfrontslope_r7.cubeList.add(new ModelBox(Bodyfrontslope_r7, 53, 79, 0.0F, -0.9F, -0.3F, 0, 2, 1, 0.0F, false));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(0.5064F, 0.6165F, -8.8482F);
        this.body.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0874F, 0.0168F, -0.5098F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 41, 75, 1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, false));

        this.BodyPlates = new ModelRenderer(this);
        this.BodyPlates.setRotationPoint(0.0F, 5.0F, -1.0F);
        this.body.addChild(BodyPlates);


        this.leftPlate7 = new ModelRenderer(this);
        this.leftPlate7.setRotationPoint(2.5F, -8.85F, -7.9F);
        this.BodyPlates.addChild(leftPlate7);
        this.setRotateAngle(leftPlate7, 0.0F, 0.0F, 0.2618F);


        this.Leftneckfrontplate_r17 = new ModelRenderer(this);
        this.Leftneckfrontplate_r17.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate7.addChild(Leftneckfrontplate_r17);
        this.setRotateAngle(Leftneckfrontplate_r17, -0.1745F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r17.cubeList.add(new ModelBox(Leftneckfrontplate_r17, 69, 24, -1.0F, -1.75F, -1.25F, 1, 3, 2, 0.0F, false));

        this.rightPlate7 = new ModelRenderer(this);
        this.rightPlate7.setRotationPoint(-2.5F, -8.85F, -7.9F);
        this.BodyPlates.addChild(rightPlate7);
        this.setRotateAngle(rightPlate7, 0.0F, 0.0F, -0.2618F);


        this.Leftneckfrontplate_r18 = new ModelRenderer(this);
        this.Leftneckfrontplate_r18.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate7.addChild(Leftneckfrontplate_r18);
        this.setRotateAngle(Leftneckfrontplate_r18, -0.1745F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r18.cubeList.add(new ModelBox(Leftneckfrontplate_r18, 69, 24, 0.0F, -1.75F, -1.25F, 1, 3, 2, 0.0F, true));

        this.leftPlate8 = new ModelRenderer(this);
        this.leftPlate8.setRotationPoint(2.75F, -9.5F, -4.05F);
        this.BodyPlates.addChild(leftPlate8);
        this.setRotateAngle(leftPlate8, -0.211F, 0.056F, 0.2559F);


        this.Leftneckfrontplate_r19 = new ModelRenderer(this);
        this.Leftneckfrontplate_r19.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate8.addChild(Leftneckfrontplate_r19);
        this.setRotateAngle(Leftneckfrontplate_r19, -0.0873F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r19.cubeList.add(new ModelBox(Leftneckfrontplate_r19, 10, 37, -1.0F, -1.75F, -1.5F, 1, 4, 2, 0.0F, false));

        this.rightPlate8 = new ModelRenderer(this);
        this.rightPlate8.setRotationPoint(-2.75F, -9.5F, -4.05F);
        this.BodyPlates.addChild(rightPlate8);
        this.setRotateAngle(rightPlate8, -0.211F, -0.056F, -0.2559F);


        this.Leftneckfrontplate_r20 = new ModelRenderer(this);
        this.Leftneckfrontplate_r20.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate8.addChild(Leftneckfrontplate_r20);
        this.setRotateAngle(Leftneckfrontplate_r20, -0.0873F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r20.cubeList.add(new ModelBox(Leftneckfrontplate_r20, 10, 37, 0.0F, -1.75F, -1.5F, 1, 4, 2, 0.0F, true));

        this.leftPlate9 = new ModelRenderer(this);
        this.leftPlate9.setRotationPoint(2.75F, -9.75F, -0.45F);
        this.BodyPlates.addChild(leftPlate9);
        this.setRotateAngle(leftPlate9, -0.211F, 0.056F, 0.2559F);


        this.Leftneckfrontplate_r21 = new ModelRenderer(this);
        this.Leftneckfrontplate_r21.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate9.addChild(Leftneckfrontplate_r21);
        this.setRotateAngle(Leftneckfrontplate_r21, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r21.cubeList.add(new ModelBox(Leftneckfrontplate_r21, 63, 62, -1.0F, -1.75F, -1.25F, 1, 5, 2, 0.0F, false));

        this.rightPlate9 = new ModelRenderer(this);
        this.rightPlate9.setRotationPoint(-2.75F, -9.75F, -0.45F);
        this.BodyPlates.addChild(rightPlate9);
        this.setRotateAngle(rightPlate9, -0.211F, -0.056F, -0.2559F);


        this.Leftneckfrontplate_r22 = new ModelRenderer(this);
        this.Leftneckfrontplate_r22.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate9.addChild(Leftneckfrontplate_r22);
        this.setRotateAngle(Leftneckfrontplate_r22, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r22.cubeList.add(new ModelBox(Leftneckfrontplate_r22, 63, 62, 0.0F, -1.75F, -1.25F, 1, 5, 2, 0.0F, true));

        this.leftPlate10 = new ModelRenderer(this);
        this.leftPlate10.setRotationPoint(2.5F, -10.0F, 3.4F);
        this.BodyPlates.addChild(leftPlate10);
        this.setRotateAngle(leftPlate10, -0.5133F, 0.1084F, 0.1897F);
        this.leftPlate10.cubeList.add(new ModelBox(leftPlate10, 0, 71, -1.0F, -1.0F, -0.25F, 1, 5, 1, 0.0F, false));

        this.Leftneckfrontplate_r23 = new ModelRenderer(this);
        this.Leftneckfrontplate_r23.setRotationPoint(0.0F, -1.0F, -0.25F);
        this.leftPlate10.addChild(Leftneckfrontplate_r23);
        this.setRotateAngle(Leftneckfrontplate_r23, -0.1745F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r23.cubeList.add(new ModelBox(Leftneckfrontplate_r23, 61, 70, -1.0F, 0.0F, 0.0F, 1, 5, 1, -0.01F, false));

        this.rightPlate10 = new ModelRenderer(this);
        this.rightPlate10.setRotationPoint(-2.5F, -10.0F, 3.4F);
        this.BodyPlates.addChild(rightPlate10);
        this.setRotateAngle(rightPlate10, -0.5133F, -0.1084F, -0.1897F);
        this.rightPlate10.cubeList.add(new ModelBox(rightPlate10, 0, 71, 0.0F, -1.0F, -0.25F, 1, 5, 1, 0.0F, true));

        this.Leftneckfrontplate_r24 = new ModelRenderer(this);
        this.Leftneckfrontplate_r24.setRotationPoint(0.0F, -1.0F, -0.25F);
        this.rightPlate10.addChild(Leftneckfrontplate_r24);
        this.setRotateAngle(Leftneckfrontplate_r24, -0.1745F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r24.cubeList.add(new ModelBox(Leftneckfrontplate_r24, 61, 70, 0.0F, 0.0F, 0.0F, 1, 5, 1, -0.01F, true));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.246F, -10.1452F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.0873F, 0.0F);


        this.Bodyfrontslope_r8 = new ModelRenderer(this);
        this.Bodyfrontslope_r8.setRotationPoint(0.0F, 1.3178F, -3.3834F);
        this.chest.addChild(Bodyfrontslope_r8);
        this.setRotateAngle(Bodyfrontslope_r8, 0.2306F, 0.0F, 0.0F);
        this.Bodyfrontslope_r8.cubeList.add(new ModelBox(Bodyfrontslope_r8, 31, 57, -0.5F, -1.2781F, -0.2133F, 1, 2, 4, 0.0F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.5064F, 0.5704F, -0.403F);
        this.chest.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.1908F, 0.0137F, 0.077F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 31, 50, -3.4467F, 3.1438F, -0.2288F, 0, 7, 1, 0.0F, true));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(-0.5064F, 0.7704F, -2.503F);
        this.chest.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.2778F, 0.0069F, 0.0779F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 47, 77, -3.4336F, 3.1438F, 0.3712F, 0, 3, 1, 0.0F, true));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 9, 55, -3.4467F, 3.1438F, -0.2288F, 0, 7, 1, 0.0F, true));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.5064F, 1.2704F, -4.203F);
        this.chest.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.3039F, 0.0049F, 0.078F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 77, 76, -3.4336F, 3.1438F, 0.4712F, 0, 3, 1, 0.0F, true));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 53, 66, -3.4467F, 3.1438F, -0.2288F, 0, 7, 1, 0.0F, true));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.5064F, 0.5704F, -0.403F);
        this.chest.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.179F, -0.0678F, 0.5059F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 75, 43, -1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, true));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(-0.5064F, 1.2704F, -4.203F);
        this.chest.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.279F, -0.1223F, 0.4964F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 75, 53, -1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, true));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.5064F, 0.7704F, -2.503F);
        this.chest.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.2558F, -0.1098F, 0.4991F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 44, 75, -1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, true));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.5064F, 0.5704F, -0.403F);
        this.chest.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.0479F, -0.1934F, 1.8686F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 80, 64, -0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, true));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.5064F, 0.7704F, -2.503F);
        this.chest.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.0745F, -0.2768F, 1.8748F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 65, 80, -0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, true));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(-0.5064F, 1.2704F, -4.203F);
        this.chest.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.0827F, -0.3017F, 1.8772F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 80, 76, -0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, true));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(-0.5064F, 1.8704F, -6.203F);
        this.chest.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.111F, -0.3848F, 1.8867F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 79, 80, -0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, true));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(-0.5064F, 1.8704F, -6.203F);
        this.chest.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.3909F, -0.0019F, 0.0782F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 5, 71, -3.4467F, 3.1438F, -0.2288F, 0, 6, 1, 0.0F, true));
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 78, -3.4336F, 3.1438F, 0.4712F, 0, 3, 1, 0.0F, true));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.5064F, 1.8704F, -6.203F);
        this.chest.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.3567F, -0.1635F, 0.4853F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 75, 59, -1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, true));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.5064F, 2.7704F, -8.203F);
        this.chest.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.5652F, -0.0078F, -0.0103F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 77, 26, -3.4467F, 3.1438F, -0.2288F, 0, 4, 1, 0.0F, true));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(-0.5064F, 2.7704F, -8.203F);
        this.chest.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.5187F, -0.2356F, 0.3655F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 59, 76, -1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, true));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.5064F, 2.7704F, -8.203F);
        this.chest.addChild(cube_r69);
        this.setRotateAngle(cube_r69, -0.1658F, -0.5522F, 1.8239F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 81, 0, -0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, true));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(0.5064F, 0.5704F, -0.403F);
        this.chest.addChild(cube_r70);
        this.setRotateAngle(cube_r70, -0.0479F, 0.1934F, -1.8686F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 80, 64, 0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(0.5064F, 0.5704F, -0.403F);
        this.chest.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.179F, 0.0678F, -0.5059F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 75, 43, 1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(0.5064F, 0.5704F, -0.403F);
        this.chest.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.1908F, -0.0137F, -0.077F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 31, 50, 3.4467F, 3.1438F, -0.2288F, 0, 7, 1, 0.0F, false));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(0.5064F, 0.7704F, -2.503F);
        this.chest.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.2558F, 0.1098F, -0.4991F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 44, 75, 1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, false));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(0.5064F, 0.7704F, -2.503F);
        this.chest.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.0745F, 0.2768F, -1.8748F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 65, 80, 0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, false));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(0.5064F, 0.7704F, -2.503F);
        this.chest.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.2778F, -0.0069F, -0.0779F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 47, 77, 3.4336F, 3.1438F, 0.3712F, 0, 3, 1, 0.0F, false));
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 9, 55, 3.4467F, 3.1438F, -0.2288F, 0, 7, 1, 0.0F, false));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(0.5064F, 1.2704F, -4.203F);
        this.chest.addChild(cube_r76);
        this.setRotateAngle(cube_r76, -0.0827F, 0.3017F, -1.8772F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 80, 76, 0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, false));

        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(0.5064F, 1.2704F, -4.203F);
        this.chest.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.279F, 0.1223F, -0.4964F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 75, 53, 1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, false));

        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(0.5064F, 1.2704F, -4.203F);
        this.chest.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.3039F, -0.0049F, -0.078F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 77, 76, 3.4336F, 3.1438F, 0.4712F, 0, 3, 1, 0.0F, false));
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 53, 66, 3.4467F, 3.1438F, -0.2288F, 0, 7, 1, 0.0F, false));

        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(0.5064F, 1.8704F, -6.203F);
        this.chest.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.3909F, 0.0019F, -0.0782F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 0, 78, 3.4336F, 3.1438F, 0.4712F, 0, 3, 1, 0.0F, false));
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 5, 71, 3.4467F, 3.1438F, -0.2288F, 0, 6, 1, 0.0F, false));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(0.5064F, 1.8704F, -6.203F);
        this.chest.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.3567F, 0.1635F, -0.4853F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 75, 59, 1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, false));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(0.5064F, 1.8704F, -6.203F);
        this.chest.addChild(cube_r81);
        this.setRotateAngle(cube_r81, -0.111F, 0.3848F, -1.8867F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 79, 80, 0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, false));

        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(0.5064F, 2.7704F, -8.203F);
        this.chest.addChild(cube_r82);
        this.setRotateAngle(cube_r82, -0.1658F, 0.5522F, -1.8239F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 81, 0, 0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, false));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(0.5064F, 2.7704F, -8.203F);
        this.chest.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.5187F, 0.2356F, -0.3655F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 59, 76, 1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, false));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(0.5064F, 2.7704F, -8.203F);
        this.chest.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.5652F, 0.0078F, 0.0103F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 77, 26, 3.4467F, 3.1438F, -0.2288F, 0, 4, 1, 0.0F, false));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(-3.8F, 8.4414F, -8.9563F);
        this.chest.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.49F, -0.1925F, 0.3444F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 0, 13, -1.2011F, -2.7506F, 1.7923F, 1, 3, 9, 0.0F, true));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(-3.8F, 8.4414F, -8.9563F);
        this.chest.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.4946F, 0.2322F, 0.5696F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 59, 7, -1.6415F, -2.7506F, 0.6653F, 4, 4, 1, 0.0F, true));

        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(-0.5F, 11.5439F, -1.9673F);
        this.chest.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.2249F, -0.3723F, 0.2198F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 38, 9, -2.1531F, 0.4665F, -0.1909F, 1, 0, 7, 0.0F, true));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(-0.5F, 11.5439F, -1.9673F);
        this.chest.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.093F, -0.5461F, 0.2025F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 38, 42, -2.1848F, 0.4553F, 0.0859F, 1, 0, 6, 0.0F, true));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(-0.5F, 11.5439F, -1.9673F);
        this.chest.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.2654F, -0.764F, 0.1163F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 55, 30, -2.167F, 0.4228F, 0.418F, 1, 0, 5, 0.0F, true));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(-0.5F, 10.5439F, -5.9673F);
        this.chest.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.2561F, -1.1224F, 0.1605F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 26, 9, 1.7395F, 1.8724F, 2.2622F, 1, 0, 3, 0.0F, true));

        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(-0.5F, 10.5439F, -5.9673F);
        this.chest.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -0.3229F, 0.0F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 41, 17, -2.0F, -0.908F, -1.2914F, 2, 1, 5, -0.01F, true));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 41, 17, 1.0F, -0.908F, -1.2914F, 2, 1, 5, -0.01F, false));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(0.5F, 10.5439F, -5.9673F);
        this.chest.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.2561F, 1.1224F, -0.1605F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 26, 9, -2.7395F, 1.8724F, 2.2622F, 1, 0, 3, 0.0F, false));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(0.5F, 11.5439F, -1.9673F);
        this.chest.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.2654F, 0.764F, -0.1163F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 55, 30, 1.167F, 0.4228F, 0.418F, 1, 0, 5, 0.0F, false));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(0.5F, 11.5439F, -1.9673F);
        this.chest.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.093F, 0.5461F, -0.2025F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 38, 42, 1.1848F, 0.4553F, 0.0859F, 1, 0, 6, 0.0F, false));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(0.5F, 11.5439F, -1.9673F);
        this.chest.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.2249F, 0.3723F, -0.2198F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 38, 9, 1.1531F, 0.4665F, -0.1909F, 1, 0, 7, 0.0F, false));

        this.Bodymiddle_r4 = new ModelRenderer(this);
        this.Bodymiddle_r4.setRotationPoint(-4.9F, 6.004F, -1.9548F);
        this.chest.addChild(Bodymiddle_r4);
        this.setRotateAngle(Bodymiddle_r4, -0.6545F, 0.0F, 0.0F);
        this.Bodymiddle_r4.cubeList.add(new ModelBox(Bodymiddle_r4, 75, 8, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, true));
        this.Bodymiddle_r4.cubeList.add(new ModelBox(Bodymiddle_r4, 75, 8, 9.8F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(3.8F, 8.4414F, -8.9563F);
        this.chest.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.4946F, -0.2322F, -0.5696F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 59, 7, -2.3585F, -2.7506F, 0.6653F, 4, 4, 1, 0.0F, false));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(3.8F, 8.4414F, -8.9563F);
        this.chest.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.49F, 0.1925F, -0.3444F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 0, 13, 0.2011F, -2.7506F, 1.7923F, 1, 3, 9, 0.0F, false));

        this.Bodyfrontslope_r9 = new ModelRenderer(this);
        this.Bodyfrontslope_r9.setRotationPoint(0.0F, -1.0159F, -0.609F);
        this.chest.addChild(Bodyfrontslope_r9);
        this.setRotateAngle(Bodyfrontslope_r9, 0.1433F, 0.0F, 0.0F);
        this.Bodyfrontslope_r9.cubeList.add(new ModelBox(Bodyfrontslope_r9, 56, 79, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Bodyfrontslope_r10 = new ModelRenderer(this);
        this.Bodyfrontslope_r10.setRotationPoint(0.0F, -0.5588F, -2.5561F);
        this.chest.addChild(Bodyfrontslope_r10);
        this.setRotateAngle(Bodyfrontslope_r10, 0.2306F, 0.0F, 0.0F);
        this.Bodyfrontslope_r10.cubeList.add(new ModelBox(Bodyfrontslope_r10, 68, 79, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Bodyfrontslope_r11 = new ModelRenderer(this);
        this.Bodyfrontslope_r11.setRotationPoint(0.0F, 2.1178F, -8.3834F);
        this.chest.addChild(Bodyfrontslope_r11);
        this.setRotateAngle(Bodyfrontslope_r11, 0.3615F, 0.0F, 0.0F);
        this.Bodyfrontslope_r11.cubeList.add(new ModelBox(Bodyfrontslope_r11, 71, 79, 0.0F, -1.4428F, 3.8973F, 0, 2, 1, 0.0F, false));
        this.Bodyfrontslope_r11.cubeList.add(new ModelBox(Bodyfrontslope_r11, 80, 7, 0.0F, -1.4428F, 1.8973F, 0, 2, 1, 0.0F, false));
        this.Bodyfrontslope_r11.cubeList.add(new ModelBox(Bodyfrontslope_r11, 78, 69, 0.0F, -1.0428F, -0.1027F, 0, 2, 1, 0.0F, false));
        this.Bodyfrontslope_r11.cubeList.add(new ModelBox(Bodyfrontslope_r11, 48, 46, -0.5F, -0.2428F, -0.1027F, 1, 2, 5, 0.002F, false));

        this.ChestPlates = new ModelRenderer(this);
        this.ChestPlates.setRotationPoint(3.35F, 3.054F, -4.3548F);
        this.chest.addChild(ChestPlates);


        this.leftPlate5 = new ModelRenderer(this);
        this.leftPlate5.setRotationPoint(-1.35F, -4.45F, -3.15F);
        this.ChestPlates.addChild(leftPlate5);
        this.setRotateAngle(leftPlate5, 0.1278F, -0.0283F, 0.2164F);
        this.leftPlate5.cubeList.add(new ModelBox(leftPlate5, 0, 13, -1.0F, -1.5F, 0.25F, 1, 4, 3, 0.0F, false));

        this.rightPlate5 = new ModelRenderer(this);
        this.rightPlate5.setRotationPoint(-5.35F, -4.45F, -3.15F);
        this.ChestPlates.addChild(rightPlate5);
        this.setRotateAngle(rightPlate5, 0.1278F, 0.0283F, -0.2164F);
        this.rightPlate5.cubeList.add(new ModelBox(rightPlate5, 0, 13, 0.0F, -1.5F, 0.25F, 1, 4, 3, 0.0F, true));

        this.leftPlate6 = new ModelRenderer(this);
        this.leftPlate6.setRotationPoint(-1.1F, -5.95F, -0.15F);
        this.ChestPlates.addChild(leftPlate6);
        this.setRotateAngle(leftPlate6, 0.0F, 0.0F, 0.2182F);
        this.leftPlate6.cubeList.add(new ModelBox(leftPlate6, 38, 9, -1.0F, -1.5F, 1.25F, 1, 4, 2, 0.0F, false));

        this.rightPlate6 = new ModelRenderer(this);
        this.rightPlate6.setRotationPoint(-5.6F, -5.95F, -0.15F);
        this.ChestPlates.addChild(rightPlate6);
        this.setRotateAngle(rightPlate6, 0.0F, 0.0F, -0.2182F);
        this.rightPlate6.cubeList.add(new ModelBox(rightPlate6, 38, 9, 0.0F, -1.5F, 1.25F, 1, 4, 2, 0.0F, true));

        this.Leftlegspike = new ModelRenderer(this);
        this.Leftlegspike.setRotationPoint(2.0F, 1.0F, 0.0F);
        this.ChestPlates.addChild(Leftlegspike);
        this.setRotateAngle(Leftlegspike, -0.0061F, 0.4402F, -0.1009F);


        this.Leftlegspiketip_r1 = new ModelRenderer(this);
        this.Leftlegspiketip_r1.setRotationPoint(3.1819F, -0.9069F, 3.5014F);
        this.Leftlegspike.addChild(Leftlegspiketip_r1);
        this.setRotateAngle(Leftlegspiketip_r1, 2.0425F, -1.3967F, -2.1322F);
        this.Leftlegspiketip_r1.cubeList.add(new ModelBox(Leftlegspiketip_r1, 13, 0, -1.5009F, -1.0468F, -1.1014F, 7, 1, 1, 0.0F, false));

        this.Leftlegspikebase_r1 = new ModelRenderer(this);
        this.Leftlegspikebase_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Leftlegspike.addChild(Leftlegspikebase_r1);
        this.setRotateAngle(Leftlegspikebase_r1, 0.2986F, -0.841F, -0.3189F);
        this.Leftlegspikebase_r1.cubeList.add(new ModelBox(Leftlegspikebase_r1, 11, 29, -0.75F, -1.5F, -1.7F, 5, 2, 2, 0.0F, false));

        this.Rightlegspike = new ModelRenderer(this);
        this.Rightlegspike.setRotationPoint(-8.7F, 1.0F, 0.0F);
        this.ChestPlates.addChild(Rightlegspike);
        this.setRotateAngle(Rightlegspike, -0.0061F, -0.4402F, 0.1009F);


        this.Leftlegspiketip_r2 = new ModelRenderer(this);
        this.Leftlegspiketip_r2.setRotationPoint(-3.1819F, -0.9069F, 3.5014F);
        this.Rightlegspike.addChild(Leftlegspiketip_r2);
        this.setRotateAngle(Leftlegspiketip_r2, 2.0425F, 1.3967F, 2.1322F);
        this.Leftlegspiketip_r2.cubeList.add(new ModelBox(Leftlegspiketip_r2, 13, 0, -5.4991F, -1.0468F, -1.1014F, 7, 1, 1, 0.0F, true));

        this.Leftlegspikebase_r2 = new ModelRenderer(this);
        this.Leftlegspikebase_r2.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.Rightlegspike.addChild(Leftlegspikebase_r2);
        this.setRotateAngle(Leftlegspikebase_r2, 0.2986F, 0.841F, 0.3189F);
        this.Leftlegspikebase_r2.cubeList.add(new ModelBox(Leftlegspikebase_r2, 11, 29, -4.25F, -1.5F, -1.7F, 5, 2, 2, 0.0F, true));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.75F, 6.754F, -5.1048F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.9163F, 0.0F, -0.1745F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 34, 49, -0.4848F, -0.6378F, -2.8943F, 2, 3, 4, 0.0F, false));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 56, 54, -0.4848F, 2.3622F, -1.4943F, 2, 7, 2, 0.0F, false));

        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(1.1F, 10.5175F, 1.5867F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.7353F, 0.1273F, 0.1175F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 56, 19, -1.5148F, 0.0905F, -1.9415F, 2, 8, 2, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 69, 0, -1.0148F, 2.0905F, -3.4415F, 1, 6, 1, -0.1F, false));

        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(-1.0148F, 7.0905F, -2.1915F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1745F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 31, 34, -1.5F, 0.0F, -3.0F, 4, 2, 5, 0.0F, false));

        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.75F, 6.754F, -5.1048F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.0436F, 0.0F, 0.1745F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 47, 38, -1.5152F, -0.6378F, -2.8943F, 2, 3, 4, 0.0F, false));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 0, -1.5152F, 2.3622F, -1.4943F, 2, 7, 2, 0.0F, false));

        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-1.1F, 10.5175F, 1.5867F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.7789F, -0.1273F, -0.1175F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 55, -0.4852F, 0.0905F, -1.9415F, 2, 8, 2, 0.0F, false));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 39, 67, 0.0148F, 2.0905F, -3.4415F, 1, 6, 1, -0.1F, false));

        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(0.9148F, 7.0905F, -2.1915F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.7854F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 33, 24, -2.5F, 0.0F, -3.0F, 4, 2, 5, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, 2.7629F, -7.8454F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.0886F, 0.1739F, 0.0154F);


        this.Neckbase_r1 = new ModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(0.0F, -0.3317F, -4.8753F);
        this.neck.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, 0.0873F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 47, 27, 0.0F, -0.25F, 0.05F, 1, 2, 5, 0.0F, false));

        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(-0.0064F, 0.6348F, -2.4235F);
        this.neck.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.7461F, -0.2438F, 0.096F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 74, 76, -1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, true));

        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(-0.0064F, 0.6348F, -2.4235F);
        this.neck.addChild(cube_r99);
        this.setRotateAngle(cube_r99, -0.151F, -0.7729F, 1.5995F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 80, 72, -0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, true));

        this.cube_r100 = new ModelRenderer(this);
        this.cube_r100.setRotationPoint(1.0064F, 0.6348F, -2.4235F);
        this.neck.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.7461F, 0.2438F, -0.096F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 74, 76, 1.788F, 0.3285F, -0.2261F, 0, 4, 1, 0.0F, false));

        this.cube_r101 = new ModelRenderer(this);
        this.cube_r101.setRotationPoint(1.0064F, 0.6348F, -2.4235F);
        this.neck.addChild(cube_r101);
        this.setRotateAngle(cube_r101, -0.151F, 0.7729F, -1.5995F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 80, 72, 0.0218F, -0.1722F, -0.1801F, 0, 2, 1, 0.0F, false));

        this.Bodyfrontslope_r12 = new ModelRenderer(this);
        this.Bodyfrontslope_r12.setRotationPoint(0.5F, -0.7179F, -0.4039F);
        this.neck.addChild(Bodyfrontslope_r12);
        this.setRotateAngle(Bodyfrontslope_r12, 0.3615F, 0.0F, 0.0F);
        this.Bodyfrontslope_r12.cubeList.add(new ModelBox(Bodyfrontslope_r12, 9, 80, 0.0F, -1.1296F, -2.2829F, 0, 2, 1, 0.0F, false));

        this.NeckPlates = new ModelRenderer(this);
        this.NeckPlates.setRotationPoint(0.0F, -1.5727F, -0.7658F);
        this.neck.addChild(NeckPlates);


        this.leftPlate3 = new ModelRenderer(this);
        this.leftPlate3.setRotationPoint(2.0F, -1.309F, -3.2595F);
        this.NeckPlates.addChild(leftPlate3);
        this.setRotateAngle(leftPlate3, 0.0F, 0.0F, 0.1309F);
        this.leftPlate3.cubeList.add(new ModelBox(leftPlate3, 69, 38, -1.0F, -1.0F, -0.7F, 1, 3, 2, 0.0F, false));

        this.rightPlate3 = new ModelRenderer(this);
        this.rightPlate3.setRotationPoint(-1.0F, -1.309F, -3.2595F);
        this.NeckPlates.addChild(rightPlate3);
        this.setRotateAngle(rightPlate3, 0.0F, 0.0F, -0.1309F);
        this.rightPlate3.cubeList.add(new ModelBox(rightPlate3, 69, 38, 0.0F, -1.0F, -0.7F, 1, 3, 2, 0.0F, true));

        this.leftPlate4 = new ModelRenderer(this);
        this.leftPlate4.setRotationPoint(2.25F, -2.659F, 0.7405F);
        this.NeckPlates.addChild(leftPlate4);
        this.setRotateAngle(leftPlate4, 0.0886F, 0.0151F, 0.1739F);
        this.leftPlate4.cubeList.add(new ModelBox(leftPlate4, 29, 74, -1.0F, -1.0F, -1.25F, 1, 4, 1, 0.0F, false));

        this.Leftneckfrontplate_r25 = new ModelRenderer(this);
        this.Leftneckfrontplate_r25.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.leftPlate4.addChild(Leftneckfrontplate_r25);
        this.setRotateAngle(Leftneckfrontplate_r25, -0.2618F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r25.cubeList.add(new ModelBox(Leftneckfrontplate_r25, 21, 74, -1.0F, 0.0F, 0.0F, 1, 4, 1, -0.01F, false));

        this.rightPlate4 = new ModelRenderer(this);
        this.rightPlate4.setRotationPoint(-1.25F, -2.659F, 0.7405F);
        this.NeckPlates.addChild(rightPlate4);
        this.setRotateAngle(rightPlate4, 0.0886F, -0.0151F, -0.1739F);
        this.rightPlate4.cubeList.add(new ModelBox(rightPlate4, 29, 74, 0.0F, -1.0F, -1.25F, 1, 4, 1, 0.0F, true));

        this.Leftneckfrontplate_r26 = new ModelRenderer(this);
        this.Leftneckfrontplate_r26.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.rightPlate4.addChild(Leftneckfrontplate_r26);
        this.setRotateAngle(Leftneckfrontplate_r26, -0.2618F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r26.cubeList.add(new ModelBox(Leftneckfrontplate_r26, 21, 74, 0.0F, 0.0F, 0.0F, 1, 4, 1, -0.01F, true));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0683F, -4.4253F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3819F, 0.4084F, -0.1582F);


        this.Neckmiddle_r1 = new ModelRenderer(this);
        this.Neckmiddle_r1.setRotationPoint(0.0F, -0.1682F, -4.2469F);
        this.neck2.addChild(Neckmiddle_r1);
        this.setRotateAngle(Neckmiddle_r1, -0.0698F, 0.0F, 0.0F);
        this.Neckmiddle_r1.cubeList.add(new ModelBox(Neckmiddle_r1, 32, 42, 0.0F, -0.55F, 0.15F, 1, 1, 4, -0.002F, false));

        this.Neck2Plates = new ModelRenderer(this);
        this.Neck2Plates.setRotationPoint(0.0F, -1.4182F, -0.1969F);
        this.neck2.addChild(Neck2Plates);


        this.leftPlate2 = new ModelRenderer(this);
        this.leftPlate2.setRotationPoint(1.25F, -0.1F, -2.6F);
        this.Neck2Plates.addChild(leftPlate2);
        this.setRotateAngle(leftPlate2, 0.1745F, 0.0F, 0.0F);
        this.leftPlate2.cubeList.add(new ModelBox(leftPlate2, 54, 74, 0.05F, -1.1F, -1.0F, 0, 2, 2, 0.0F, false));

        this.rightPlate2 = new ModelRenderer(this);
        this.rightPlate2.setRotationPoint(-0.25F, -0.1F, -2.6F);
        this.Neck2Plates.addChild(rightPlate2);
        this.setRotateAngle(rightPlate2, 0.1745F, 0.0F, 0.0F);
        this.rightPlate2.cubeList.add(new ModelBox(rightPlate2, 54, 74, -0.05F, -1.1F, -1.0F, 0, 2, 2, 0.0F, true));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0682F, -3.8969F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1314F, 0.0865F, 0.0114F);
        this.neck3.cubeList.add(new ModelBox(neck3, 74, 4, 0.0F, -0.6297F, -2.0539F, 1, 1, 2, -0.02F, false));

        this.Neck3Plates = new ModelRenderer(this);
        this.Neck3Plates.setRotationPoint(0.0F, -1.1297F, -0.1539F);
        this.neck3.addChild(Neck3Plates);


        this.leftPlate1 = new ModelRenderer(this);
        this.leftPlate1.setRotationPoint(1.0F, -0.25F, -0.9F);
        this.Neck3Plates.addChild(leftPlate1);
        this.setRotateAngle(leftPlate1, 0.0436F, 0.0F, 0.0F);
        this.leftPlate1.cubeList.add(new ModelBox(leftPlate1, 81, 11, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.rightPlate1 = new ModelRenderer(this);
        this.rightPlate1.setRotationPoint(0.0F, -0.25F, -0.9F);
        this.Neck3Plates.addChild(rightPlate1);
        this.setRotateAngle(rightPlate1, 0.0436F, 0.0F, 0.0F);
        this.rightPlate1.cubeList.add(new ModelBox(rightPlate1, 81, 11, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(1.0F, 0.0703F, -1.8539F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.448F, 0.1201F, 0.043F);
        this.head.cubeList.add(new ModelBox(head, 56, 36, -2.5F, -1.3533F, -1.7679F, 4, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 14, 60, 0.0F, -2.0533F, -2.0679F, 1, 1, 1, -0.2F, false));
        this.head.cubeList.add(new ModelBox(head, 59, 13, -2.5F, -1.3533F, -2.2679F, 4, 2, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 62, -2.0F, -0.3533F, -4.1179F, 3, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 51, 19, 0.51F, -1.1033F, -2.0179F, 1, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 43, 49, 0.68F, -1.1033F, -2.0179F, 1, 1, 1, -0.15F, false));
        this.head.cubeList.add(new ModelBox(head, 8, 48, 0.84F, -1.1033F, -2.0179F, 1, 1, 1, -0.3F, false));
        this.head.cubeList.add(new ModelBox(head, 8, 48, 0.44F, -0.9033F, -3.0179F, 1, 1, 1, -0.3F, false));
        this.head.cubeList.add(new ModelBox(head, 8, 48, -2.44F, -0.9033F, -3.0179F, 1, 1, 1, -0.3F, true));
        this.head.cubeList.add(new ModelBox(head, 8, 48, -2.84F, -1.1033F, -2.0179F, 1, 1, 1, -0.3F, true));
        this.head.cubeList.add(new ModelBox(head, 43, 49, -2.68F, -1.1033F, -2.0179F, 1, 1, 1, -0.15F, true));
        this.head.cubeList.add(new ModelBox(head, 51, 19, -2.51F, -1.1033F, -2.0179F, 1, 1, 1, 0.01F, true));
        this.head.cubeList.add(new ModelBox(head, 14, 60, -2.0F, -2.0533F, -2.0679F, 1, 1, 1, -0.2F, true));

        this.Lowerjawmiddle_r1 = new ModelRenderer(this);
        this.Lowerjawmiddle_r1.setRotationPoint(-1.5F, 1.0467F, -2.0679F);
        this.head.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, 0.0436F, -0.2182F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 9, 60, -0.2F, -1.2F, -4.25F, 0, 1, 4, 0.0F, true));

        this.Lowerjawmiddle_r2 = new ModelRenderer(this);
        this.Lowerjawmiddle_r2.setRotationPoint(0.5F, 1.0467F, -2.0679F);
        this.head.addChild(Lowerjawmiddle_r2);
        this.setRotateAngle(Lowerjawmiddle_r2, 0.0436F, 0.2182F, 0.0F);
        this.Lowerjawmiddle_r2.cubeList.add(new ModelBox(Lowerjawmiddle_r2, 9, 60, 0.2F, -1.2F, -4.25F, 0, 1, 4, 0.0F, false));

        this.Upperjawfront_r1 = new ModelRenderer(this);
        this.Upperjawfront_r1.setRotationPoint(-0.5F, -0.3533F, -4.0179F);
        this.head.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, 0.0031F, -0.2608F, -0.0233F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 73, 65, -1.35F, -0.05F, 0.7F, 1, 1, 2, -0.01F, true));

        this.Upperjawfront_r2 = new ModelRenderer(this);
        this.Upperjawfront_r2.setRotationPoint(-0.5F, -0.3533F, -4.0179F);
        this.head.addChild(Upperjawfront_r2);
        this.setRotateAngle(Upperjawfront_r2, 0.0903F, -0.2608F, -0.0233F);
        this.Upperjawfront_r2.cubeList.add(new ModelBox(Upperjawfront_r2, 0, 66, -1.1F, 0.0F, -2.2F, 1, 1, 3, -0.01F, true));

        this.cube_r102 = new ModelRenderer(this);
        this.cube_r102.setRotationPoint(-1.7F, -3.8714F, -2.8846F);
        this.head.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.0F, 0.0436F, 1.3963F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 74, 22, 2.1517F, 0.3438F, 0.6757F, 1, 1, 2, -0.05F, true));

        this.cube_r103 = new ModelRenderer(this);
        this.cube_r103.setRotationPoint(0.7F, -3.8714F, -2.8846F);
        this.head.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.0F, -0.0436F, -1.3963F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 74, 22, -3.1517F, 0.3438F, 0.6757F, 1, 1, 2, -0.05F, false));

        this.Upperjawslopefront_r1 = new ModelRenderer(this);
        this.Upperjawslopefront_r1.setRotationPoint(0.0F, -0.8533F, -5.0179F);
        this.head.addChild(Upperjawslopefront_r1);
        this.setRotateAngle(Upperjawslopefront_r1, 0.6545F, 0.0F, 0.0F);
        this.Upperjawslopefront_r1.cubeList.add(new ModelBox(Upperjawslopefront_r1, 50, 35, -1.0F, -0.3149F, -1.6018F, 1, 1, 1, -0.02F, false));

        this.Upperjawslopefront_r2 = new ModelRenderer(this);
        this.Upperjawslopefront_r2.setRotationPoint(0.0F, -1.1033F, -4.0179F);
        this.head.addChild(Upperjawslopefront_r2);
        this.setRotateAngle(Upperjawslopefront_r2, 0.1745F, 0.0F, 0.0F);
        this.Upperjawslopefront_r2.cubeList.add(new ModelBox(Upperjawslopefront_r2, 18, 66, -1.0F, 0.0577F, -1.73F, 1, 1, 3, -0.01F, false));

        this.Upperjawslopebase_r1 = new ModelRenderer(this);
        this.Upperjawslopebase_r1.setRotationPoint(0.0F, -1.3533F, -2.2679F);
        this.head.addChild(Upperjawslopebase_r1);
        this.setRotateAngle(Upperjawslopebase_r1, 0.1745F, 0.0F, 0.0F);
        this.Upperjawslopebase_r1.cubeList.add(new ModelBox(Upperjawslopebase_r1, 61, 49, -2.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.Upperjawfront_r3 = new ModelRenderer(this);
        this.Upperjawfront_r3.setRotationPoint(-0.5F, -0.3533F, -4.0179F);
        this.head.addChild(Upperjawfront_r3);
        this.setRotateAngle(Upperjawfront_r3, 0.0873F, 0.0F, 0.0F);
        this.Upperjawfront_r3.cubeList.add(new ModelBox(Upperjawfront_r3, 9, 66, -0.5F, 0.0F, -2.5F, 1, 1, 3, 0.0F, false));

        this.Upperjawfront_r4 = new ModelRenderer(this);
        this.Upperjawfront_r4.setRotationPoint(-0.5F, -0.3533F, -4.0179F);
        this.head.addChild(Upperjawfront_r4);
        this.setRotateAngle(Upperjawfront_r4, 0.0031F, 0.2608F, 0.0233F);
        this.Upperjawfront_r4.cubeList.add(new ModelBox(Upperjawfront_r4, 73, 65, 0.35F, -0.05F, 0.7F, 1, 1, 2, -0.01F, false));

        this.Upperjawfront_r5 = new ModelRenderer(this);
        this.Upperjawfront_r5.setRotationPoint(-0.5F, -0.3533F, -4.0179F);
        this.head.addChild(Upperjawfront_r5);
        this.setRotateAngle(Upperjawfront_r5, 0.0903F, 0.2608F, 0.0233F);
        this.Upperjawfront_r5.cubeList.add(new ModelBox(Upperjawfront_r5, 0, 66, 0.1F, 0.0F, -2.2F, 1, 1, 3, -0.01F, false));

        this.Head_r1 = new ModelRenderer(this);
        this.Head_r1.setRotationPoint(-0.5F, 0.5967F, -1.7179F);
        this.head.addChild(Head_r1);
        this.setRotateAngle(Head_r1, -0.4363F, 0.0F, 0.0F);
        this.Head_r1.cubeList.add(new ModelBox(Head_r1, 12, 16, -2.0F, -0.95F, -0.15F, 4, 1, 2, 0.01F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 1.3467F, -0.2679F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6109F, 0.0F, 0.0F);


        this.Lowerjawfront_r1 = new ModelRenderer(this);
        this.Lowerjawfront_r1.setRotationPoint(0.0F, -0.7635F, -3.6342F);
        this.jaw.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, 0.0436F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 26, 3, -0.5F, -0.0105F, -2.3638F, 1, 1, 1, -0.02F, false));
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 8, 71, -0.5F, -0.0105F, -1.9638F, 1, 1, 2, -0.01F, false));

        this.Lowerjawmiddle_r3 = new ModelRenderer(this);
        this.Lowerjawmiddle_r3.setRotationPoint(-1.0F, 0.306F, -1.6586F);
        this.jaw.addChild(Lowerjawmiddle_r3);
        this.setRotateAngle(Lowerjawmiddle_r3, -0.0452F, -0.2615F, 0.0117F);
        this.Lowerjawmiddle_r3.cubeList.add(new ModelBox(Lowerjawmiddle_r3, 73, 49, -0.8F, -1.0F, -1.8F, 1, 1, 2, -0.01F, true));

        this.Lowerjawfront_r2 = new ModelRenderer(this);
        this.Lowerjawfront_r2.setRotationPoint(0.0F, -0.7635F, -3.6342F);
        this.jaw.addChild(Lowerjawfront_r2);
        this.setRotateAngle(Lowerjawfront_r2, 0.0452F, -0.2615F, -0.0117F);
        this.Lowerjawfront_r2.cubeList.add(new ModelBox(Lowerjawfront_r2, 48, 12, -0.95F, -0.0105F, -1.7138F, 1, 1, 2, -0.02F, true));

        this.Lowerjawfront_r3 = new ModelRenderer(this);
        this.Lowerjawfront_r3.setRotationPoint(0.0F, -0.7635F, -3.6342F);
        this.jaw.addChild(Lowerjawfront_r3);
        this.setRotateAngle(Lowerjawfront_r3, 0.0452F, 0.2615F, 0.0117F);
        this.Lowerjawfront_r3.cubeList.add(new ModelBox(Lowerjawfront_r3, 48, 12, -0.05F, -0.0105F, -1.7138F, 1, 1, 2, -0.02F, false));

        this.Lowerjawbase_r1 = new ModelRenderer(this);
        this.Lowerjawbase_r1.setRotationPoint(-1.5F, 0.006F, -0.0086F);
        this.jaw.addChild(Lowerjawbase_r1);
        this.setRotateAngle(Lowerjawbase_r1, -0.5585F, 0.0F, 0.0F);
        this.Lowerjawbase_r1.cubeList.add(new ModelBox(Lowerjawbase_r1, 72, 30, -0.5F, -0.0079F, -1.8248F, 1, 1, 2, 0.0F, true));
        this.Lowerjawbase_r1.cubeList.add(new ModelBox(Lowerjawbase_r1, 72, 30, 2.5F, -0.0079F, -1.8248F, 1, 1, 2, 0.0F, false));

        this.Lowerjawbase_r2 = new ModelRenderer(this);
        this.Lowerjawbase_r2.setRotationPoint(-1.5F, 0.906F, -0.2086F);
        this.jaw.addChild(Lowerjawbase_r2);
        this.setRotateAngle(Lowerjawbase_r2, -0.2793F, 0.0F, 0.0F);
        this.Lowerjawbase_r2.cubeList.add(new ModelBox(Lowerjawbase_r2, 44, 71, -0.5F, -0.9221F, -1.9447F, 1, 1, 2, -0.01F, true));
        this.Lowerjawbase_r2.cubeList.add(new ModelBox(Lowerjawbase_r2, 44, 71, 2.5F, -0.9221F, -1.9447F, 1, 1, 2, -0.01F, false));

        this.Lowerjawbase_r3 = new ModelRenderer(this);
        this.Lowerjawbase_r3.setRotationPoint(-1.5F, -0.694F, -1.9086F);
        this.jaw.addChild(Lowerjawbase_r3);
        this.setRotateAngle(Lowerjawbase_r3, -0.3491F, 0.0F, 0.0F);
        this.Lowerjawbase_r3.cubeList.add(new ModelBox(Lowerjawbase_r3, 74, 0, -0.5F, 0.0F, 0.2F, 1, 1, 2, 0.01F, true));
        this.Lowerjawbase_r3.cubeList.add(new ModelBox(Lowerjawbase_r3, 74, 0, 2.5F, 0.0F, 0.2F, 1, 1, 2, 0.01F, false));

        this.Lowerjawmiddle_r4 = new ModelRenderer(this);
        this.Lowerjawmiddle_r4.setRotationPoint(-1.0F, 0.206F, -3.6586F);
        this.jaw.addChild(Lowerjawmiddle_r4);
        this.setRotateAngle(Lowerjawmiddle_r4, -0.1535F, -0.2589F, 0.0396F);
        this.Lowerjawmiddle_r4.cubeList.add(new ModelBox(Lowerjawmiddle_r4, 15, 71, -0.2817F, -0.9873F, 0.1342F, 1, 1, 2, -0.013F, true));

        this.Lowerjawmiddle_r5 = new ModelRenderer(this);
        this.Lowerjawmiddle_r5.setRotationPoint(-1.0F, 0.306F, -1.6586F);
        this.jaw.addChild(Lowerjawmiddle_r5);
        this.setRotateAngle(Lowerjawmiddle_r5, -0.0436F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r5.cubeList.add(new ModelBox(Lowerjawmiddle_r5, 73, 72, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));
        this.Lowerjawmiddle_r5.cubeList.add(new ModelBox(Lowerjawmiddle_r5, 73, 72, 1.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.Lowerjawmiddle_r6 = new ModelRenderer(this);
        this.Lowerjawmiddle_r6.setRotationPoint(1.0F, 0.206F, -3.6586F);
        this.jaw.addChild(Lowerjawmiddle_r6);
        this.setRotateAngle(Lowerjawmiddle_r6, -0.1535F, 0.2589F, -0.0396F);
        this.Lowerjawmiddle_r6.cubeList.add(new ModelBox(Lowerjawmiddle_r6, 15, 71, -0.7183F, -0.9873F, 0.1342F, 1, 1, 2, -0.013F, false));

        this.Lowerjawmiddle_r7 = new ModelRenderer(this);
        this.Lowerjawmiddle_r7.setRotationPoint(1.0F, 0.306F, -1.6586F);
        this.jaw.addChild(Lowerjawmiddle_r7);
        this.setRotateAngle(Lowerjawmiddle_r7, -0.0452F, 0.2615F, -0.0117F);
        this.Lowerjawmiddle_r7.cubeList.add(new ModelBox(Lowerjawmiddle_r7, 73, 49, -0.2F, -1.0F, -1.8F, 1, 1, 2, -0.01F, false));

        this.Lowerjawmiddle_r8 = new ModelRenderer(this);
        this.Lowerjawmiddle_r8.setRotationPoint(-1.0F, 0.306F, -1.6586F);
        this.jaw.addChild(Lowerjawmiddle_r8);
        this.setRotateAngle(Lowerjawmiddle_r8, 0.0862F, -0.218F, 0.0097F);
        this.Lowerjawmiddle_r8.cubeList.add(new ModelBox(Lowerjawmiddle_r8, 13, 3, -0.2F, -1.4F, -3.8F, 0, 1, 4, 0.0F, true));

        this.Lowerjawmiddle_r9 = new ModelRenderer(this);
        this.Lowerjawmiddle_r9.setRotationPoint(1.0F, 0.306F, -1.6586F);
        this.jaw.addChild(Lowerjawmiddle_r9);
        this.setRotateAngle(Lowerjawmiddle_r9, 0.0862F, 0.218F, -0.0097F);
        this.Lowerjawmiddle_r9.cubeList.add(new ModelBox(Lowerjawmiddle_r9, 13, 3, 0.2F, -1.4F, -3.8F, 0, 1, 4, 0.0F, false));

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
