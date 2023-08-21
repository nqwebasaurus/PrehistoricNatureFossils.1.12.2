package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonRobertia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftleg1;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer rightleg1;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer body;
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
    private final ModelRenderer chest;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r33;
    private final ModelRenderer head;
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
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer leftarm1;
    private final ModelRenderer cube_r48;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftarm3;
    private final ModelRenderer rightarm1;
    private final ModelRenderer cube_r49;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightarm3;
    private final ModelRenderer tail;

    public ModelSkeletonRobertia() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -5.5F, 0.0F);
        this.fossil.addChild(hips);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, 1.1811F, 5.5619F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0343F, -0.0133F, -0.6514F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, 0.6975F, -0.9171F, 1, 2, 2, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, 1.1811F, 5.5619F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2524F, -0.0133F, -0.6514F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 25, -0.5F, -0.214F, -0.315F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, 0.7811F, 6.9619F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 31, -0.5F, -1.0F, -1.5F, 1, 2, 2, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 31, 3.5F, -1.0F, -1.5F, 1, 2, 2, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 0.1811F, 6.0619F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.7418F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, -0.5F, -1.0F, -1.5F, 1, 2, 2, 0.002F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, 3.5F, -1.0F, -1.5F, 1, 2, 2, 0.002F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.0F, 4.0F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 32, -0.5F, -1.15F, 0.85F, 1, 1, 2, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 32, 1.5F, -1.15F, 0.85F, 1, 1, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 24, 0.5F, -1.15F, -0.15F, 1, 1, 3, 0.002F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(2.0F, 1.1811F, 5.5619F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0343F, 0.0133F, 0.6514F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, 0.6975F, -0.9171F, 1, 2, 2, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0F, 1.1811F, 5.5619F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2524F, 0.0133F, 0.6514F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 25, -0.5F, -0.214F, -0.315F, 1, 1, 1, 0.0F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(2.2F, 1.15F, 6.1F);
        this.hips.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.1224F, -0.7013F, 0.0684F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 20, 22, -0.5217F, -0.4558F, -3.1188F, 1, 1, 3, 0.0F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.1217F, 0.3942F, -3.1188F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, -0.1745F, 0.3491F, -0.0873F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 11, 0, -0.0328F, -0.1055F, -0.4425F, 1, 3, 1, 0.0F, false));
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 10, 10, -1.0328F, -0.1055F, -0.4425F, 1, 3, 1, -0.2F, false));

        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(-0.0328F, 2.3945F, 0.0575F);
        this.leftleg2.addChild(leftleg3);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 14, 17, -1.5F, 0.0F, -2.25F, 3, 1, 3, 0.0F, false));

        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-2.2F, 1.15F, 6.1F);
        this.hips.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.8625F, 1.4476F, 0.7111F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 20, 22, -0.4783F, -0.4558F, -3.1188F, 1, 1, 3, 0.0F, true));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.1217F, 0.3942F, -3.1188F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, -0.2524F, -0.4727F, 0.5845F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 11, 0, -0.9672F, -0.1055F, -0.4425F, 1, 3, 1, 0.0F, true));
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 10, 10, 0.0328F, -0.1055F, -0.4425F, 1, 3, 1, -0.2F, true));

        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0328F, 2.3945F, 0.0575F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.2657F, -0.1685F, 0.0456F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 14, 17, -1.5F, 0.0F, -2.25F, 3, 1, 3, 0.0F, true));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.7F, 4.25F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, -0.4F, -7.95F, 1, 1, 8, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.15F, -0.45F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -1.2654F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 28, -2.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.15F, -0.45F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.6545F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.15F, -2.45F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -1.1781F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 13, -3.8192F, -0.5736F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.15F, -2.45F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.5672F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 32, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.15F, -4.45F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -1.0908F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 29, 29, -3.8192F, -0.5736F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.15F, -4.45F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.48F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 20, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.15F, -6.45F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -1.0036F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 10, -3.8192F, -0.5736F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.15F, -6.45F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.3927F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 35, 5, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.15F, -0.45F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.6545F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.15F, -0.45F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 1.2654F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 12, 28, 0.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 0.15F, -2.45F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.5672F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 32, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 0.15F, -2.45F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 1.1781F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 13, 0.8192F, -0.5736F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 0.15F, -4.45F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.48F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 32, 20, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 0.15F, -4.45F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 1.0908F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 29, 29, 0.8192F, -0.5736F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 0.15F, -6.45F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 1.0036F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 31, 10, 0.8192F, -0.5736F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.15F, -6.45F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.3927F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 35, 5, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.15F, -7.75F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.044F, 0.1308F, 0.0057F);
        this.chest.cubeList.add(new ModelBox(chest, 17, 27, -0.5F, -0.579F, -3.0354F, 1, 1, 3, 0.002F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.021F, -0.5354F);
        this.chest.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -1.2217F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 15, -2.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 0.021F, -0.5354F);
        this.chest.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -0.6109F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 24, 18, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.021F, -2.5354F);
        this.chest.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.5236F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 36, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 0.021F, -0.5354F);
        this.chest.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.6109F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 18, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 0.021F, -0.5354F);
        this.chest.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, 1.2217F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 15, 0.8192F, -0.5736F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 0.021F, -2.5354F);
        this.chest.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 0.5236F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 36, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(-2.0F, 0.921F, -0.5354F);
        this.chest.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -1.2464F, -0.1313F, 0.3712F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 30, 12, -0.5F, -0.5F, 1.0F, 3, 2, 1, 0.0F, true));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 32, 16, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(2.0F, 0.921F, -0.5354F);
        this.chest.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -1.2464F, 0.1313F, -0.3712F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 30, 12, -2.5F, -0.5F, 1.0F, 3, 2, 1, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 32, 16, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 3.3832F, -0.1851F);
        this.chest.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.2182F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 24, 13, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.329F, -2.9854F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.1392F, 0.346F, 0.0475F);


        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.3075F, -1.9069F);
        this.neck.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0436F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 33, 22, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.01F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.4575F, -1.7069F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.375F, 0.3082F, 0.1665F);
        this.head.cubeList.add(new ModelBox(head, 28, 5, -1.0F, -2.1955F, -5.0108F, 2, 2, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 5, -1.0F, -1.1955F, -6.0108F, 2, 1, 1, 0.01F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.5F, -0.6955F, -3.1108F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.2856F, -0.1782F, -0.0718F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 10, 10, 0.1F, -0.5F, -0.4F, 1, 1, 5, -0.22F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 10, -0.2F, -0.5F, -2.4F, 1, 1, 7, -0.2F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-2.0F, -2.2955F, 0.9892F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.6104F, 0.1838F, -0.3141F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 11, 22, -0.4579F, -0.1693F, 0.0803F, 3, 4, 1, -0.2F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.0F, -1.1955F, -5.0108F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.2182F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 35, 26, -0.075F, -0.7F, 0.5F, 1, 1, 1, -0.002F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 35, 31, -0.075F, -0.7F, 1.0F, 1, 1, 1, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 31, 0, -0.05F, -1.0F, 0.1F, 1, 2, 2, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(1.0F, -1.1955F, -5.0108F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.2182F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 31, 0, -0.95F, -1.0F, 0.1F, 1, 2, 2, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 35, 26, -0.925F, -0.7F, 0.5F, 1, 1, 1, -0.002F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 35, 31, -0.925F, -0.7F, 1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.0F, -0.1955F, -5.2608F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, 0.1745F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 36, -0.4F, -0.5F, -0.65F, 1, 2, 1, -0.2F, true));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(1.0F, -0.1955F, -5.2608F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, -0.1745F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 36, -0.6F, -0.5F, -0.65F, 1, 2, 1, -0.2F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -1.1955F, -6.0108F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.7854F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 20, 34, -1.0F, -1.4F, 0.0F, 2, 1, 1, -0.01F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 7, 19, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(2.0F, -2.2955F, 0.9892F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.6104F, -0.1838F, 0.3141F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 11, 22, -2.5421F, -0.1693F, 0.0803F, 3, 4, 1, -0.2F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.1F, -0.2955F, -3.5108F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.2618F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 19, -0.5F, -0.7F, -0.5F, 1, 1, 4, -0.2F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -2.1955F, -5.0108F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1309F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 11, 0, -0.5F, 0.1F, 0.35F, 1, 1, 6, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(1.5F, -0.6955F, -3.1108F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.2856F, 0.1782F, 0.0718F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 10, 10, -1.1F, -0.5F, -0.4F, 1, 1, 5, -0.22F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 10, -0.8F, -0.5F, -2.4F, 1, 1, 7, -0.2F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.6045F, -1.0108F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3927F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 0, -1.0F, -0.8F, -4.9F, 2, 1, 3, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.1F, -4.8F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.1396F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 23, 29, -1.0F, -0.926F, 0.1717F, 1, 1, 3, -0.002F, true));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 23, 29, 0.0F, -0.926F, 0.1717F, 1, 1, 3, -0.002F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.1F, 0.2F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.096F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 30, 32, -1.5F, -0.2468F, -1.8053F, 1, 1, 2, 0.0F, true));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 30, 32, 0.5F, -0.2468F, -1.8053F, 1, 1, 2, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.1F, -2.1F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.288F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 6, 28, -1.5F, -0.9F, -0.6F, 1, 1, 3, 0.002F, true));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 6, 28, 0.5F, -0.9F, -0.6F, 1, 1, 3, 0.002F, false));

        this.leftarm1 = new ModelRenderer(this);
        this.leftarm1.setRotationPoint(2.55F, 2.421F, -0.9354F);
        this.chest.addChild(leftarm1);
        this.setRotateAngle(leftarm1, 0.0F, 0.8727F, 0.1309F);


        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.5879F, 0.3966F, -0.6306F);
        this.leftarm1.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.1309F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 25, -1.1F, -1.0F, 0.5F, 1, 1, 3, 0.0F, false));

        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.0778F, 0.6769F, 2.5835F);
        this.leftarm1.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.0F, -1.4399F, -0.0436F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 11, 36, 0.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 7, 33, -1.0F, -0.1F, -0.5F, 1, 2, 1, -0.2F, false));

        this.leftarm3 = new ModelRenderer(this);
        this.leftarm3.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.0F, 0.0F, -0.1309F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 18, 8, -1.5F, 0.0F, -2.5F, 3, 1, 3, 0.0F, false));

        this.rightarm1 = new ModelRenderer(this);
        this.rightarm1.setRotationPoint(-2.55F, 2.421F, -0.9354F);
        this.chest.addChild(rightarm1);
        this.setRotateAngle(rightarm1, -3.1416F, -1.1781F, 3.0107F);


        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.5879F, 0.3966F, -0.6306F);
        this.rightarm1.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.1309F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 25, 0.1F, -1.0F, 0.5F, 1, 1, 3, 0.0F, true));

        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.0778F, 0.6769F, 2.5835F);
        this.rightarm1.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 2.6462F, 1.1371F, -3.0689F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 11, 36, -1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 7, 33, 0.0F, -0.1F, -0.5F, 1, 2, 1, -0.2F, true));

        this.rightarm3 = new ModelRenderer(this);
        this.rightarm3.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.5236F, 0.0F, 0.1309F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 18, 8, -1.5F, 0.0F, -2.5F, 3, 1, 3, 0.0F, true));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.4F, 7.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.5711F, 0.1103F, -0.0706F);
        this.tail.cubeList.add(new ModelBox(tail, 26, 19, -0.5F, -0.4874F, -0.2149F, 1, 1, 3, 0.0F, false));

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
