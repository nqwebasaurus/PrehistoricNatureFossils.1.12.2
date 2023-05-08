package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSillosuchus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer bodyback;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer legL;
    private final ModelRenderer legL2;
    private final ModelRenderer legL3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer legL4;
    private final ModelRenderer legL5;
    private final ModelRenderer legL6;
    private final ModelRenderer legL7;
    private final ModelRenderer cube_r11;
    private final ModelRenderer legL8;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r15;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r16;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
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
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer bodyfront;
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
    private final ModelRenderer cube_r54;
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
    private final ModelRenderer ArmL;
    private final ModelRenderer cube_r77;
    private final ModelRenderer ArmL2;
    private final ModelRenderer ArmL3;
    private final ModelRenderer ArmL4;
    private final ModelRenderer cube_r78;
    private final ModelRenderer ArmL5;
    private final ModelRenderer ArmL6;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer bone;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer upperjaw;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer cube_r98;
    private final ModelRenderer cube_r99;

    public ModelSkeletonSillosuchus() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.bodyback = new ModelRenderer(this);
        this.bodyback.setRotationPoint(0.0F, -34.15F, -13.0F);
        this.fossil.addChild(bodyback);
        this.setRotateAngle(bodyback, -0.0436F, 0.0F, 0.0F);
        this.bodyback.cubeList.add(new ModelBox(bodyback, 27, 58, 3.0F, 0.2728F, 11.6631F, 1, 3, 11, 0.0F, false));
        this.bodyback.cubeList.add(new ModelBox(bodyback, 21, 42, 1.0F, 0.7728F, 11.6631F, 2, 1, 11, 0.0F, false));
        this.bodyback.cubeList.add(new ModelBox(bodyback, 74, 0, 3.0F, 3.2728F, 13.6631F, 1, 2, 7, 0.0F, false));
        this.bodyback.cubeList.add(new ModelBox(bodyback, 21, 42, -3.0F, 0.7728F, 11.6631F, 2, 1, 11, 0.0F, true));
        this.bodyback.cubeList.add(new ModelBox(bodyback, 27, 58, -4.0F, 0.2728F, 11.6631F, 1, 3, 11, 0.0F, true));
        this.bodyback.cubeList.add(new ModelBox(bodyback, 74, 0, -4.0F, 3.2728F, 13.6631F, 1, 2, 7, 0.0F, true));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.0F, 4.5909F, 16.7678F);
        this.bodyback.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4538F, 0.0F, -0.3491F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 37, 42, 0.0F, 5.7958F, -9.3638F, 1, 1, 5, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.0F, 4.5909F, 16.7678F);
        this.bodyback.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3142F, 0.0F, -0.3491F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 0, 0.0F, 4.436F, -3.8538F, 1, 7, 2, 0.0F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-4.0F, 4.5909F, 16.7678F);
        this.bodyback.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5411F, 0.0F, -0.3491F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 58, 0.0F, 0.1081F, -2.7255F, 1, 5, 2, 0.0F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.0F, 4.5909F, 19.7678F);
        this.bodyback.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.7991F, 0.0878F, -0.4342F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 18, 0.3F, -1.0609F, -0.6988F, 1, 9, 1, 0.0F, true));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(4.0F, 4.5909F, 16.7678F);
        this.bodyback.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4538F, 0.0F, 0.3491F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 37, 42, -1.0F, 5.7958F, -9.3638F, 1, 1, 5, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(4.0F, 4.5909F, 16.7678F);
        this.bodyback.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3142F, 0.0F, 0.3491F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 0, -1.0F, 4.436F, -3.8538F, 1, 7, 2, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(4.0F, 4.5909F, 16.7678F);
        this.bodyback.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5411F, 0.0F, 0.3491F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 58, -1.0F, 0.1081F, -2.7255F, 1, 5, 2, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(4.0F, 4.5909F, 19.7678F);
        this.bodyback.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.7991F, -0.0878F, 0.4342F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 18, -1.3F, -1.0609F, -0.6988F, 1, 9, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.6909F, 12.1678F);
        this.bodyback.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 57, 47, -1.0F, -1.2181F, -0.5048F, 2, 2, 11, 0.0F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(5.0F, 3.0826F, 17.3211F);
        this.bodyback.addChild(legL);
        this.setRotateAngle(legL, -0.5236F, 0.0F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 23, 18, -1.75F, -0.6932F, -1.2031F, 3, 14, 3, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(1.55F, 13.1071F, -0.4975F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.8727F, 0.0F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 45, 77, -3.27F, 0.887F, -0.7017F, 3, 16, 2, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 65, 80, -3.27F, 0.887F, 1.7983F, 3, 16, 1, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(-1.0F, 18.7911F, 3.1924F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, -1.6581F, 0.0F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 17, 73, -3.77F, -0.8918F, -1.4781F, 6, 10, 2, -0.01F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.5044F, 1.1115F);
        this.legL3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2269F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 58, 0.23F, -0.3873F, -0.5896F, 2, 4, 1, -0.01F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.legL3.addChild(legL4);
        this.setRotateAngle(legL4, -0.2182F, 0.0F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 71, 34, -3.77F, 0.0F, -1.49F, 6, 5, 2, 0.0F, false));

        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(-5.0F, 3.0826F, 17.3211F);
        this.bodyback.addChild(legL5);
        this.setRotateAngle(legL5, -0.3491F, 0.0F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 18, -1.25F, -0.6932F, -1.2031F, 3, 14, 3, 0.0F, false));

        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(-1.55F, 13.1071F, -0.4975F);
        this.legL5.addChild(legL6);
        this.setRotateAngle(legL6, 1.2217F, 0.0F, 0.0F);
        this.legL6.cubeList.add(new ModelBox(legL6, 34, 73, 0.27F, 0.887F, -0.7017F, 3, 16, 2, 0.0F, false));
        this.legL6.cubeList.add(new ModelBox(legL6, 56, 77, 0.27F, 0.887F, 1.7983F, 3, 16, 1, 0.0F, false));

        this.legL7 = new ModelRenderer(this);
        this.legL7.setRotationPoint(1.0F, 18.7911F, 3.1924F);
        this.legL6.addChild(legL7);
        this.setRotateAngle(legL7, -1.3963F, 0.0F, 0.0F);
        this.legL7.cubeList.add(new ModelBox(legL7, 0, 72, -2.23F, -0.8918F, -1.4781F, 6, 10, 2, -0.01F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.5044F, 1.1115F);
        this.legL7.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2269F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 39, -2.23F, -0.3873F, -0.5896F, 2, 4, 1, -0.01F, false));

        this.legL8 = new ModelRenderer(this);
        this.legL8.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.legL7.addChild(legL8);
        this.setRotateAngle(legL8, -1.0036F, 0.0F, 0.0F);
        this.legL8.cubeList.add(new ModelBox(legL8, 65, 61, -2.23F, 0.0F, -1.49F, 6, 5, 2, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.2948F, 22.6548F);
        this.bodyback.addChild(tail);
        this.setRotateAngle(tail, -0.0886F, 0.1739F, -0.0154F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.3062F, 7.0053F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.6283F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 62, 13, 0.0F, 4.4561F, 3.9143F, 0, 6, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 65, 13, 0.0F, 2.6731F, 1.4687F, 0, 6, 1, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.3062F, 7.0053F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.7592F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 74, 0, 0.0F, 1.2416F, -1.1678F, 0, 5, 1, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.2076F, -0.6733F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0349F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 39, -1.0F, -2.0703F, 0.1298F, 2, 2, 16, 0.002F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.6079F, 14.9792F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0876F, 0.0869F, 0.0076F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 18, -1.0F, -0.8761F, -0.4049F, 2, 2, 18, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.7466F, -7.9259F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.6283F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 41, 0.0F, 14.25F, 19.0038F, 0, 3, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 27, 42, 0.0F, 13.0111F, 16.2262F, 0, 3, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 30, 0.0F, 11.3553F, 13.7245F, 0, 4, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 13, 29, 0.0F, 9.6995F, 11.2229F, 0, 5, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 46, 0, 0.0F, 8.0437F, 8.7212F, 0, 6, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 58, 0.0F, 6.3879F, 6.2195F, 0, 6, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.315F, 17.4768F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.132F, -0.1298F, -0.0172F);
        this.tail3.cubeList.add(new ModelBox(tail3, 37, 42, -1.0F, -0.5959F, -0.0958F, 2, 2, 13, 0.002F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.9177F, -25.3995F);
        this.tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6283F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 37, 42, 0.0F, 19.7203F, 28.7896F, 0, 3, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 39, 0.0F, 17.7753F, 25.1804F, 0, 3, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 3, 39, 0.0F, 15.9058F, 21.5055F, 0, 3, 1, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.3064F, 12.9565F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.134F, -0.2163F, 0.0289F);
        this.tail4.cubeList.add(new ModelBox(tail4, 46, 13, -0.5F, -0.7008F, -0.9651F, 1, 1, 13, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.291F, 11.7871F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2256F, -0.2555F, 0.0579F);
        this.tail5.cubeList.add(new ModelBox(tail5, 55, 29, -0.5F, -0.2601F, -0.2841F, 1, 1, 13, 0.002F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.2796F, 12.2345F);
        this.bodyback.addChild(body);
        this.setRotateAngle(body, 0.0438F, -0.0872F, -0.0038F);
        this.body.cubeList.add(new ModelBox(body, 23, 21, -1.0F, -0.9181F, -17.6952F, 2, 2, 18, 0.002F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, 11.7819F, -16.0952F, 12, 3, 14, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 0.2185F, -1.7379F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.048F, -0.152F, -0.9073F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 85, 44, -5.8381F, -1.246F, -0.4078F, 3, 0, 1, 0.0F, true));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 0.2185F, -1.7379F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0282F, -0.1568F, -1.3932F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 41, 64, -6.6031F, -3.8009F, -0.4078F, 2, 0, 1, 0.0F, true));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, 0.2185F, -1.7379F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1046F, -0.0807F, -0.4293F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 85, 21, -3.0943F, 0.2021F, -0.5091F, 3, 0, 1, 0.0F, true));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, 0.3185F, -4.7379F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0093F, -0.0368F, -0.4349F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 85, 46, -3.01F, 0.021F, -0.5069F, 3, 0, 1, 0.0F, true));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, 0.3185F, -4.7379F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0166F, -0.0692F, -0.9145F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 85, 48, -5.6798F, -1.3679F, -0.4098F, 3, 0, 1, 0.0F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 0.3185F, -4.7379F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0467F, -0.0537F, -1.3951F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 65, 69, -7.4065F, -3.836F, -0.4098F, 3, 0, 1, 0.0F, true));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, 0.2185F, -7.7379F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0528F, -0.0193F, -1.3953F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 37, 49, -9.5049F, -3.8187F, -0.414F, 5, 0, 1, 0.0F, true));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, 0.2185F, -7.7379F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0379F, -0.0415F, -0.9156F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 17, 86, -5.7592F, -1.3071F, -0.414F, 3, 0, 1, 0.0F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 0.2185F, -7.7379F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0224F, -0.0221F, -0.4358F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 87, 10, -3.0523F, 0.1115F, -0.5132F, 3, 0, 1, 0.0F, true));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0F, 0.0185F, -22.7379F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0619F, 0.0322F, -1.3953F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 50, -11.0882F, -3.0418F, 11.5483F, 6, 0, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 33, 18, -11.9916F, -3.2274F, 8.5556F, 7, 0, 1, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 55, 44, -11.895F, -3.413F, 5.5629F, 7, 0, 1, 0.0F, true));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, 0.0185F, -22.7379F);
        this.body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0698F, 0.0F, -0.9163F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 25, 87, -5.9178F, -0.3486F, 11.5483F, 3, 0, 1, 0.0F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 17, 88, -5.9178F, -0.5579F, 8.5556F, 3, 0, 1, 0.0F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 85, 23, -5.9178F, -0.7671F, 5.5629F, 3, 0, 1, 0.0F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0F, 0.0185F, -22.7379F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0698F, 0.0F, -0.4363F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 87, 12, -3.1368F, 1.1294F, 11.4449F, 3, 0, 1, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 87, 14, -3.1368F, 0.9201F, 8.4522F, 3, 0, 1, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 43, 73, -3.1368F, 0.7108F, 5.4595F, 3, 0, 1, 0.0F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(1.0F, 0.2185F, -1.7379F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0282F, 0.1568F, 1.3932F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 41, 64, 4.6031F, -3.8009F, -0.4078F, 2, 0, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(1.0F, 0.2185F, -1.7379F);
        this.body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.048F, 0.152F, 0.9073F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 85, 44, 2.8381F, -1.246F, -0.4078F, 3, 0, 1, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(1.0F, 0.2185F, -1.7379F);
        this.body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1046F, 0.0807F, 0.4293F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 85, 21, 0.0943F, 0.2021F, -0.5091F, 3, 0, 1, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(1.0F, 0.3185F, -4.7379F);
        this.body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0467F, 0.0537F, 1.3951F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 65, 69, 4.4065F, -3.836F, -0.4098F, 3, 0, 1, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(1.0F, 0.3185F, -4.7379F);
        this.body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0166F, 0.0692F, 0.9145F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 85, 48, 2.6798F, -1.3679F, -0.4098F, 3, 0, 1, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(1.0F, 0.3185F, -4.7379F);
        this.body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0093F, 0.0368F, 0.4349F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 85, 46, 0.01F, 0.021F, -0.5069F, 3, 0, 1, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(1.0F, 0.2185F, -7.7379F);
        this.body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0528F, 0.0193F, 1.3953F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 37, 49, 4.5049F, -3.8187F, -0.414F, 5, 0, 1, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(1.0F, 0.2185F, -7.7379F);
        this.body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0379F, 0.0415F, 0.9156F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 17, 86, 2.7592F, -1.3071F, -0.414F, 3, 0, 1, 0.0F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(1.0F, 0.2185F, -7.7379F);
        this.body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0224F, 0.0221F, 0.4358F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 87, 10, 0.0523F, 0.1115F, -0.5132F, 3, 0, 1, 0.0F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(1.0F, 0.0185F, -22.7379F);
        this.body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0619F, -0.0322F, 1.3953F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 50, 5.0882F, -3.0418F, 11.5483F, 6, 0, 1, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 33, 18, 4.9916F, -3.2274F, 8.5556F, 7, 0, 1, 0.0F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(1.0F, 0.0185F, -22.7379F);
        this.body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0698F, 0.0F, 0.9163F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 25, 87, 2.9178F, -0.3486F, 11.5483F, 3, 0, 1, 0.0F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 17, 88, 2.9178F, -0.5579F, 8.5556F, 3, 0, 1, 0.0F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(1.0F, 0.0185F, -22.7379F);
        this.body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0698F, 0.0F, 0.4363F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 87, 12, 0.1368F, 1.1294F, 11.4449F, 3, 0, 1, 0.0F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 87, 14, 0.1368F, 0.9201F, 8.4522F, 3, 0, 1, 0.0F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(1.0248F, 0.0185F, -16.7172F);
        this.body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0241F, -0.0473F, 1.3987F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 55, 44, 4.6967F, -3.7611F, -0.4446F, 7, 0, 1, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(1.0248F, 0.0185F, -16.7172F);
        this.body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0005F, -0.0531F, 0.9181F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 85, 23, 2.9027F, -1.1675F, -0.4446F, 3, 0, 1, 0.0F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(1.0248F, 0.0185F, -16.7172F);
        this.body.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0329F, -0.0791F, 0.4378F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 43, 73, 0.1143F, 0.3013F, -0.5473F, 3, 0, 1, 0.0F, false));

        this.bodyfront = new ModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 0.2319F, -17.5952F);
        this.body.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.088F, -0.1304F, -0.0115F);


        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 8.2907F, -14.7742F);
        this.bodyfront.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0873F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 39, 0, -6.0F, 3.0F, 5.5F, 12, 2, 10, -0.01F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -0.6196F, -7.9008F);
        this.bodyfront.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0175F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 41, 58, -1.0F, -0.721F, -0.0097F, 2, 2, 8, 0.0F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.8403F, -0.0969F, -2.3027F);
        this.bodyfront.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.0069F, 0.0443F, -1.3979F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 77, 19, -11.2117F, -4.0327F, -0.4056F, 7, 0, 1, 0.0F, true));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.8403F, -0.0969F, -2.3027F);
        this.bodyfront.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0144F, 0.0425F, -0.9175F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 85, 25, -5.5979F, -1.6323F, -0.4056F, 3, 0, 1, 0.0F, true));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.8403F, -0.0969F, -2.3027F);
        this.bodyfront.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0403F, 0.0633F, -0.4373F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 80, 74, -3.0593F, -0.2514F, -0.5021F, 3, 0, 1, 0.0F, true));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-1.0F, -0.3612F, -5.3283F);
        this.bodyfront.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0619F, 0.0322F, -1.3953F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 52, -10.3833F, -3.8397F, -0.4034F, 6, 0, 1, 0.0F, true));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(-1.0F, -0.3612F, -5.3283F);
        this.bodyfront.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0698F, 0.0F, -0.9163F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 84, 42, -5.661F, -1.3819F, -0.4034F, 3, 0, 1, 0.0F, true));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(-1.0F, -0.3612F, -5.3283F);
        this.bodyfront.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0698F, 0.0F, -0.4363F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 85, 27, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(-1.0F, -0.0872F, -11.3752F);
        this.bodyfront.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0619F, 0.0322F, -1.3953F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 37, 51, -7.3459F, -3.6762F, 2.6185F, 3, 0, 1, 0.0F, true));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(-1.0F, -0.0872F, -11.3752F);
        this.bodyfront.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0698F, 0.0F, -0.9163F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 71, 45, -5.5523F, -1.2542F, 2.6185F, 3, 0, 1, 0.0F, true));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(-1.0F, -0.0872F, -11.3752F);
        this.bodyfront.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0698F, 0.0F, -0.4363F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 85, 29, -2.9421F, 0.087F, 2.5247F, 3, 0, 1, 0.0F, true));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-1.0F, -0.0872F, -11.3752F);
        this.bodyfront.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0711F, 0.0838F, -1.482F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 9, 11, -5.3833F, -3.8397F, -0.4034F, 1, 0, 1, 0.0F, true));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(-1.0F, -0.0872F, -11.3752F);
        this.bodyfront.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.1017F, 0.0415F, -1.0029F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 55, 53, -5.661F, -1.3819F, -0.4034F, 3, 0, 1, 0.0F, true));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-1.0F, -0.0872F, -11.3752F);
        this.bodyfront.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.1173F, 0.0221F, -0.5231F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 86, 34, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(-1.0F, 0.1128F, -14.3752F);
        this.bodyfront.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.1659F, 0.1244F, -1.1285F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 62, 24, -5.661F, -1.3819F, -0.4034F, 3, 0, 1, 0.0F, true));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(-1.0F, 0.1128F, -14.3752F);
        this.bodyfront.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.2124F, 0.0662F, -0.6498F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 52, 69, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(0.9644F, -0.0954F, -2.2594F);
        this.bodyfront.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.1479F, -0.0169F, 1.3932F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 77, 19, 4.1872F, -3.9137F, -0.4555F, 7, 0, 1, 0.0F, false));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.9644F, -0.0954F, -2.2594F);
        this.bodyfront.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.1391F, 0.0531F, 0.9181F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 85, 25, 2.5212F, -1.5381F, -0.4555F, 3, 0, 1, 0.0F, false));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.9644F, -0.0954F, -2.2594F);
        this.bodyfront.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.1068F, 0.0791F, 0.4378F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 80, 74, -0.0538F, -0.2034F, -0.5488F, 3, 0, 1, 0.0F, false));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(1.0F, -0.3612F, -5.3283F);
        this.bodyfront.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0619F, -0.0322F, 1.3953F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 52, 4.3833F, -3.8397F, -0.4034F, 6, 0, 1, 0.0F, false));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(1.0F, -0.3612F, -5.3283F);
        this.bodyfront.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0698F, 0.0F, 0.9163F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 84, 42, 2.661F, -1.3819F, -0.4034F, 3, 0, 1, 0.0F, false));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(1.0F, -0.3612F, -5.3283F);
        this.bodyfront.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0698F, 0.0F, 0.4363F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 85, 27, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(1.0F, -0.0872F, -11.3752F);
        this.bodyfront.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0619F, -0.0322F, 1.3953F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 37, 51, 4.3459F, -3.6762F, 2.6185F, 3, 0, 1, 0.0F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(1.0F, -0.0872F, -11.3752F);
        this.bodyfront.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0698F, 0.0F, 0.9163F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 71, 45, 2.5523F, -1.2542F, 2.6185F, 3, 0, 1, 0.0F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(1.0F, -0.0872F, -11.3752F);
        this.bodyfront.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0698F, 0.0F, 0.4363F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 85, 29, -0.0579F, 0.087F, 2.5247F, 3, 0, 1, 0.0F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(1.0F, -0.0872F, -11.3752F);
        this.bodyfront.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.1173F, -0.0221F, 0.5231F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 86, 34, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r70 = new ModelRenderer(this);
        this.cube_r70.setRotationPoint(1.0F, -0.0872F, -11.3752F);
        this.bodyfront.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.1017F, -0.0415F, 1.0029F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 55, 53, 2.661F, -1.3819F, -0.4034F, 3, 0, 1, 0.0F, false));

        this.cube_r71 = new ModelRenderer(this);
        this.cube_r71.setRotationPoint(1.0F, -0.0872F, -11.3752F);
        this.bodyfront.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0711F, -0.0838F, 1.482F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 9, 11, 4.3833F, -3.8397F, -0.4034F, 1, 0, 1, 0.0F, false));

        this.cube_r72 = new ModelRenderer(this);
        this.cube_r72.setRotationPoint(1.0F, 0.1128F, -14.3752F);
        this.bodyfront.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.1659F, -0.1244F, 1.1285F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 62, 24, 2.661F, -1.3819F, -0.4034F, 3, 0, 1, 0.0F, false));

        this.cube_r73 = new ModelRenderer(this);
        this.cube_r73.setRotationPoint(1.0F, 0.1128F, -14.3752F);
        this.bodyfront.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.2124F, -0.0662F, 0.6498F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 52, 69, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r74 = new ModelRenderer(this);
        this.cube_r74.setRotationPoint(-6.5F, 9.5959F, -13.2457F);
        this.bodyfront.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.7571F, -0.15F, 0.2197F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 0, 0, -0.693F, -2.8084F, -1.0217F, 5, 6, 1, 0.0F, true));
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 52, 61, -0.693F, -2.8084F, -0.0217F, 1, 5, 10, 0.0F, true));

        this.cube_r75 = new ModelRenderer(this);
        this.cube_r75.setRotationPoint(6.5F, 9.5959F, -13.2457F);
        this.bodyfront.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.7571F, 0.15F, -0.2197F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 0, 0, -4.307F, -2.8084F, -1.0217F, 5, 6, 1, 0.0F, false));
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 52, 61, -0.307F, -2.8084F, -0.0217F, 1, 5, 10, 0.0F, false));

        this.cube_r76 = new ModelRenderer(this);
        this.cube_r76.setRotationPoint(0.0F, 0.1407F, -14.7742F);
        this.bodyfront.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0698F, 0.0F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 73, 44, -1.0F, -1.0F, -0.1F, 2, 2, 7, 0.002F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(8.0F, 10.0907F, -11.5742F);
        this.bodyfront.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.7038F, 0.1447F, 0.2355F);


        this.cube_r77 = new ModelRenderer(this);
        this.cube_r77.setRotationPoint(0.5F, -0.5074F, 0.5038F);
        this.ArmL.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.0F, 0.0F, -0.0873F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 0, 85, -1.0F, 0.0F, -1.25F, 1, 8, 2, 0.0F, false));

        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(0.25F, 8.4426F, 0.3038F);
        this.ArmL.addChild(ArmL2);
        this.setRotateAngle(ArmL2, -1.0712F, 0.27F, 0.1446F);
        this.ArmL2.cubeList.add(new ModelBox(ArmL2, 53, 13, -0.02F, -0.6024F, -0.3888F, 1, 8, 1, 0.0F, false));
        this.ArmL2.cubeList.add(new ModelBox(ArmL2, 12, 85, -0.02F, 0.3976F, -2.1888F, 1, 7, 1, 0.0F, false));

        this.ArmL3 = new ModelRenderer(this);
        this.ArmL3.setRotationPoint(0.9F, 7.3976F, -1.1488F);
        this.ArmL2.addChild(ArmL3);
        this.setRotateAngle(ArmL3, 0.0F, 0.0F, 0.3054F);
        this.ArmL3.cubeList.add(new ModelBox(ArmL3, 84, 0, -0.92F, 0.0F, -1.24F, 1, 3, 3, 0.01F, false));

        this.ArmL4 = new ModelRenderer(this);
        this.ArmL4.setRotationPoint(-8.0F, 10.0907F, -11.5742F);
        this.bodyfront.addChild(ArmL4);
        this.setRotateAngle(ArmL4, 0.3914F, 0.0334F, -0.0807F);


        this.cube_r78 = new ModelRenderer(this);
        this.cube_r78.setRotationPoint(-0.5F, -0.5074F, 0.5038F);
        this.ArmL4.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.0F, 0.0F, 0.0873F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 0, 58, 0.0F, 0.0F, -1.25F, 1, 8, 2, 0.0F, false));

        this.ArmL5 = new ModelRenderer(this);
        this.ArmL5.setRotationPoint(-0.25F, 8.4426F, 0.3038F);
        this.ArmL4.addChild(ArmL5);
        this.setRotateAngle(ArmL5, -1.0178F, -0.4968F, -0.2861F);
        this.ArmL5.cubeList.add(new ModelBox(ArmL5, 36, 20, -0.98F, -0.6024F, -0.3888F, 1, 8, 1, 0.0F, false));
        this.ArmL5.cubeList.add(new ModelBox(ArmL5, 7, 85, -0.98F, 0.3976F, -2.1888F, 1, 7, 1, 0.0F, false));

        this.ArmL6 = new ModelRenderer(this);
        this.ArmL6.setRotationPoint(-0.9F, 7.3976F, -1.1488F);
        this.ArmL5.addChild(ArmL6);
        this.setRotateAngle(ArmL6, 0.0F, 0.0F, -0.3054F);
        this.ArmL6.cubeList.add(new ModelBox(ArmL6, 29, 58, -0.08F, 0.0F, -1.24F, 1, 3, 3, 0.01F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.032F, -14.1239F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, -0.6623F, -0.5844F, 0.3136F);


        this.cube_r79 = new ModelRenderer(this);
        this.cube_r79.setRotationPoint(0.0F, 0.6285F, -0.5479F);
        this.neck.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.1222F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 67, 69, -1.0F, -1.2557F, -7.7538F, 2, 2, 8, 0.0F, false));

        this.cube_r80 = new ModelRenderer(this);
        this.cube_r80.setRotationPoint(-1.0F, 1.6768F, -4.8453F);
        this.neck.addChild(cube_r80);
        this.setRotateAngle(cube_r80, -0.4194F, -0.4079F, 0.1547F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 46, 18, -0.037F, -0.8236F, -0.501F, 0, 1, 5, 0.0F, true));

        this.cube_r81 = new ModelRenderer(this);
        this.cube_r81.setRotationPoint(1.0F, 1.6768F, -4.8453F);
        this.neck.addChild(cube_r81);
        this.setRotateAngle(cube_r81, -0.4194F, 0.4079F, -0.1547F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 46, 18, 0.037F, -0.8236F, -0.501F, 0, 1, 5, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.7761F, -7.8805F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.4157F, -0.5373F, -0.0641F);


        this.cube_r82 = new ModelRenderer(this);
        this.cube_r82.setRotationPoint(-1.0F, 1.0474F, -1.219F);
        this.neck2.addChild(cube_r82);
        this.setRotateAngle(cube_r82, -0.1698F, -0.2151F, 0.0366F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 55, 46, -0.0317F, -0.5978F, -0.4405F, 0, 1, 5, 0.0F, true));

        this.cube_r83 = new ModelRenderer(this);
        this.cube_r83.setRotationPoint(-1.0F, 1.1024F, -6.2187F);
        this.neck2.addChild(cube_r83);
        this.setRotateAngle(cube_r83, -0.1715F, -0.2581F, 0.0442F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 21, 42, -0.0062F, -0.325F, -0.1491F, 0, 1, 5, 0.0F, true));

        this.cube_r84 = new ModelRenderer(this);
        this.cube_r84.setRotationPoint(1.0F, 1.0474F, -1.219F);
        this.neck2.addChild(cube_r84);
        this.setRotateAngle(cube_r84, -0.1698F, 0.2151F, -0.0366F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 55, 46, 0.0317F, -0.5978F, -0.4405F, 0, 1, 5, 0.0F, false));

        this.cube_r85 = new ModelRenderer(this);
        this.cube_r85.setRotationPoint(1.0F, 1.1024F, -6.2187F);
        this.neck2.addChild(cube_r85);
        this.setRotateAngle(cube_r85, -0.1715F, 0.2581F, -0.0442F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 21, 42, 0.0062F, -0.325F, -0.1491F, 0, 1, 5, 0.0F, false));

        this.cube_r86 = new ModelRenderer(this);
        this.cube_r86.setRotationPoint(0.0F, 0.8407F, 0.1472F);
        this.neck2.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.0524F, 0.0F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 0, 58, -1.0F, -1.2657F, -11.0258F, 2, 2, 11, 0.002F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.3549F, -10.792F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.2409F, -0.6325F, -0.6917F);


        this.cube_r87 = new ModelRenderer(this);
        this.cube_r87.setRotationPoint(-1.0F, 0.011F, -0.4304F);
        this.neck3.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.1658F, 0.0F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 0, 8, 0.0183F, -0.2729F, 0.1315F, 0, 1, 4, 0.0F, true));

        this.cube_r88 = new ModelRenderer(this);
        this.cube_r88.setRotationPoint(-1.0F, 0.667F, -4.8542F);
        this.neck3.addChild(cube_r88);
        this.setRotateAngle(cube_r88, -0.1698F, -0.2151F, 0.0366F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 61, 28, 0.0F, -0.4869F, -0.078F, 0, 1, 3, 0.0F, true));

        this.cube_r89 = new ModelRenderer(this);
        this.cube_r89.setRotationPoint(1.0F, 0.011F, -0.4304F);
        this.neck3.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -0.5378F, 0.7718F, -0.1636F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 0, 8, -0.0183F, -0.2729F, 0.1315F, 0, 1, 4, 0.0F, false));

        this.cube_r90 = new ModelRenderer(this);
        this.cube_r90.setRotationPoint(1.0F, 0.667F, -4.8542F);
        this.neck3.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -0.1698F, 0.2151F, -0.0366F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 61, 28, 0.0F, -0.4869F, -0.078F, 0, 1, 3, 0.0F, false));

        this.cube_r91 = new ModelRenderer(this);
        this.cube_r91.setRotationPoint(0.0F, 2.2647F, -6.6457F);
        this.neck3.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.1396F, 0.0F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 16, 58, -1.0F, -2.5F, -0.75F, 2, 2, 8, -0.02F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(-1.0F, 0.011F, -0.4304F);
        this.neck3.addChild(bone);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.6291F, -6.5484F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.3535F, -0.5961F, -0.3977F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.5F, 1.9085F, 0.3174F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.2182F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 83, 74, 0.5F, 0.0F, -6.0F, 1, 1, 6, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 80, 71, -2.0F, 0.0F, -13.5F, 3, 1, 1, 0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 77, 10, 0.0F, 0.0F, -12.5F, 1, 1, 7, 0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 83, 74, -2.5F, 0.0F, -6.0F, 1, 1, 6, 0.0F, true));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 77, 10, -2.0F, 0.0F, -12.5F, 1, 1, 7, 0.01F, true));

        this.cube_r92 = new ModelRenderer(this);
        this.cube_r92.setRotationPoint(-1.0F, 1.0F, -10.5F);
        this.lowerjaw.addChild(cube_r92);
        this.setRotateAngle(cube_r92, -0.0524F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 80, 55, -1.0F, -0.9F, -0.975F, 1, 1, 6, 0.0F, true));
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 80, 55, 1.0F, -0.9F, -0.975F, 1, 1, 6, 0.0F, false));

        this.cube_r93 = new ModelRenderer(this);
        this.cube_r93.setRotationPoint(-1.0F, 1.0F, -10.5F);
        this.lowerjaw.addChild(cube_r93);
        this.setRotateAngle(cube_r93, -0.0698F, 0.0F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 83, 82, -1.5F, -0.95F, 4.475F, 1, 1, 6, -0.03F, true));
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 83, 82, 1.5F, -0.95F, 4.475F, 1, 1, 6, -0.03F, false));

        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.5F, 1.9085F, 0.3174F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 46, 28, -2.5F, -4.0F, -6.0F, 4, 4, 6, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 71, 24, -2.0F, -2.0F, -11.7F, 3, 2, 7, 0.015F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 21, 49, -2.0F, -1.0F, -13.725F, 3, 1, 2, 0.01F, false));

        this.cube_r94 = new ModelRenderer(this);
        this.cube_r94.setRotationPoint(0.0F, -1.1F, -11.5F);
        this.upperjaw.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 1.117F, 0.0F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 5, 8, -2.0F, -1.962F, -1.1229F, 3, 1, 1, -0.02F, false));
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 73, 54, -2.0F, -1.962F, -0.9229F, 3, 1, 1, -0.01F, false));

        this.cube_r95 = new ModelRenderer(this);
        this.cube_r95.setRotationPoint(0.0F, -2.6F, -6.1F);
        this.upperjaw.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.2443F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 62, 13, -2.0F, -1.163F, -7.0791F, 3, 2, 8, 0.0F, false));

        this.cube_r96 = new ModelRenderer(this);
        this.cube_r96.setRotationPoint(-1.5F, -1.0F, -10.5F);
        this.upperjaw.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.0F, -0.096F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 80, 63, 0.0F, 0.0F, -1.0F, 1, 1, 6, 0.0125F, false));

        this.cube_r97 = new ModelRenderer(this);
        this.cube_r97.setRotationPoint(0.5F, -1.0F, -10.5F);
        this.upperjaw.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.0F, 0.096F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 74, 80, -1.0F, 0.0F, -1.0F, 1, 1, 6, 0.0125F, false));

        this.cube_r98 = new ModelRenderer(this);
        this.cube_r98.setRotationPoint(-2.0F, 4.0F, -6.0F);
        this.upperjaw.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.0F, -0.0873F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 0, 39, -0.5F, -8.0F, 0.1F, 1, 4, 6, -0.01F, true));
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 54, 61, -0.5948F, -7.5174F, 0.4019F, 1, 2, 2, -0.01F, true));
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 61, 46, -0.9948F, -7.5174F, 0.4019F, 1, 2, 2, -0.4F, true));

        this.cube_r99 = new ModelRenderer(this);
        this.cube_r99.setRotationPoint(1.0F, 4.0F, -6.0F);
        this.upperjaw.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.0F, 0.0873F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 61, 46, -0.0052F, -7.5174F, 0.4019F, 1, 2, 2, -0.4F, false));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 54, 61, -0.4052F, -7.5174F, 0.4019F, 1, 2, 2, -0.01F, false));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 0, 39, -0.5F, -8.0F, 0.1F, 1, 4, 6, -0.01F, false));

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
