package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMixosaurus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Mixosaurus;
    private final ModelRenderer Body1;
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
    private final ModelRenderer ForelimbsL;
    private final ModelRenderer cube_r17;
    private final ModelRenderer ForelimbsL2;
    private final ModelRenderer cube_r18;
    private final ModelRenderer Body2;
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
    private final ModelRenderer Body3;
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
    private final ModelRenderer Body4;
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
    private final ModelRenderer HindlimbsL;
    private final ModelRenderer cube_r53;
    private final ModelRenderer HindlimbsL2;
    private final ModelRenderer cube_r54;
    private final ModelRenderer Body5;
    private final ModelRenderer cube_r55;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer Head;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer Jaw;

    public ModelSkeletonMixosaurus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Mixosaurus = new ModelRenderer(this);
        this.Mixosaurus.setRotationPoint(2.0F, -11.0F, -2.0F);
        this.fossil.addChild(Mixosaurus);
        this.setRotateAngle(Mixosaurus, 0.1106F, -0.0734F, 0.0036F);


        this.Body1 = new ModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 1.4F, -7.0F);
        this.Mixosaurus.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 14, 24, -0.5F, -2.2122F, 3.7094F, 1, 1, 2, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, 1.2148F, 2.647F);
        this.Body1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4608F, -0.1393F, 0.2727F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 33, -0.5F, 1.0F, -1.0F, 2, 1, 2, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 36, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, 1.2148F, 2.647F);
        this.Body1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4608F, 0.1393F, -0.2727F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 33, -1.5F, 1.0F, -1.0F, 2, 1, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 36, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.2F, 2.0F);
        this.Body1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 37, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.4652F, 3.7911F);
        this.Body1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 40, 0.0F, -1.2F, 0.0F, 0, 2, 1, -0.001F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 41, 0.0F, -2.4F, 1.8F, 0, 2, 1, -0.001F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 43, 0.0F, -1.6F, -0.2F, 0, 1, 1, -0.001F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.6F, 4.3F);
        this.Body1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0921F, 0.0333F, -1.1272F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 22, -4.866F, -0.5F, -0.5F, 4, 0, 1, -0.001F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -1.6F, 4.3F);
        this.Body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0964F, -0.0172F, -0.6059F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 33, -1.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -0.5F, 0.3F);
        this.Body1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2986F, 0.0651F, -0.3829F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 41, -1.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.1F, 2.3F);
        this.Body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2986F, 0.0651F, -0.6883F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 41, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, true));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -1.1F, 2.3F);
        this.Body1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2284F, 0.2046F, -1.1982F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 8, -2.866F, -0.5F, -0.5F, 2, 0, 1, -0.001F, true));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -0.5F, 0.3F);
        this.Body1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2986F, -0.0651F, 0.3829F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 41, 0.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -1.6F, 4.3F);
        this.Body1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0921F, -0.0333F, 1.1272F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 22, 0.866F, -0.5F, -0.5F, 4, 0, 1, -0.001F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -1.6F, 4.3F);
        this.Body1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0964F, 0.0172F, 0.6059F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 33, 0.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -1.1F, 2.3F);
        this.Body1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2284F, -0.2046F, 1.1982F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 8, 0.866F, -0.5F, -0.5F, 2, 0, 1, -0.001F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -1.1F, 2.3F);
        this.Body1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2986F, -0.0651F, 0.6883F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 0, 0.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3927F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 15, 31, -0.5F, -0.8F, -0.2F, 1, 1, 3, 0.004F, false));

        this.ForelimbsL = new ModelRenderer(this);
        this.ForelimbsL.setRotationPoint(3.1F, 2.6F, 2.7F);
        this.Body1.addChild(ForelimbsL);
        this.setRotateAngle(ForelimbsL, 0.0F, 0.0F, -0.3054F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.1F, -0.3F, 0.0F);
        this.ForelimbsL.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3079F, 0.3142F, -0.7711F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 26, -0.5F, 2.9F, -0.7F, 0, 5, 3, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 7, -0.9F, 1.9F, 0.3F, 1, 1, 1, -0.2F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 9, -0.9F, 1.9F, -0.7F, 1, 1, 1, -0.1F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 12, 36, -0.9F, -0.1F, -0.7F, 1, 2, 2, 0.0F, false));

        this.ForelimbsL2 = new ModelRenderer(this);
        this.ForelimbsL2.setRotationPoint(-3.1F, 2.6F, 2.7F);
        this.Body1.addChild(ForelimbsL2);
        this.setRotateAngle(ForelimbsL2, 0.0F, 0.0F, 0.3054F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.1F, -0.3F, 0.0F);
        this.ForelimbsL2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3079F, -0.3142F, 0.7711F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 26, 0.5F, 2.9F, -0.7F, 0, 5, 3, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 7, -0.1F, 1.9F, 0.3F, 1, 1, 1, -0.2F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 9, 9, -0.1F, 1.9F, -0.7F, 1, 1, 1, -0.1F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 12, 36, -0.1F, -0.1F, -0.7F, 1, 2, 2, 0.0F, true));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.8F, 5.65F);
        this.Body1.addChild(Body2);
        this.setRotateAngle(Body2, 0.0F, -0.3054F, 0.0F);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.5F, 2.35F);
        this.Body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0397F, -0.077F, -1.126F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 12, 0, -4.866F, -0.5F, -0.5F, 4, 0, 1, -0.001F, true));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.5F, 2.35F);
        this.Body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0043F, -0.0865F, -0.6007F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 39, 9, -1.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, true));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 0.2F, 0.35F);
        this.Body2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0734F, -0.0061F, -1.1274F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 27, 0, -4.866F, -0.5F, -0.5F, 4, 0, 1, -0.001F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 0.2F, 0.35F);
        this.Body2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0606F, -0.042F, -0.6049F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 40, 21, -1.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, true));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.5F, 2.35F);
        this.Body2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0397F, 0.077F, 1.126F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 12, 0, 0.866F, -0.5F, -0.5F, 4, 0, 1, -0.001F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 0.5F, 2.35F);
        this.Body2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0043F, 0.0865F, 0.6007F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 39, 9, 0.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 0.2F, 0.35F);
        this.Body2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0734F, 0.0061F, 1.1274F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 27, 0, 0.866F, -0.5F, -0.5F, 4, 0, 1, -0.001F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 0.2F, 0.35F);
        this.Body2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0606F, 0.042F, 0.6049F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 40, 21, 0.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.3652F, 0.2411F);
        this.Body2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1309F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 39, 5, 0.0F, -1.2044F, 1.7154F, 0, 2, 1, -0.001F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 39, 24, 0.0F, -1.4044F, -0.2846F, 0, 2, 1, -0.001F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 0.05F);
        this.Body2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1396F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 25, -0.5F, -0.4F, -0.1F, 1, 1, 4, -0.002F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 5.2F, 4.25F);
        this.Body2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0436F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 0, -1.5F, -1.0F, -5.0F, 3, 1, 5, 0.0F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.7F, 3.05F);
        this.Body2.addChild(Body3);


        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 4.5F, 0.9F);
        this.Body3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2618F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 15, -1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.1F, -0.1F);
        this.Body3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0873F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 7, 24, -0.5F, -0.7F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -1.0652F, -2.7089F);
        this.Body3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1309F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 20, 0.0F, -1.2044F, 5.7154F, 0, 2, 1, -0.001F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 26, 38, 0.0F, -1.2044F, 3.6154F, 0, 2, 1, -0.001F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, 0.3F, 3.4F);
        this.Body3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0359F, -0.0849F, -1.1257F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 4, 26, -2.866F, -0.5F, -0.5F, 2, 0, 1, -0.001F, true));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, 0.3F, 3.4F);
        this.Body3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0115F, -0.0915F, -0.6001F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 21, 31, -1.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, 0.1F, 1.4F);
        this.Body3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.017F, -0.1243F, -1.1237F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 36, 17, -3.866F, -0.5F, -0.5F, 3, 0, 1, -0.001F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 0.1F, 1.4F);
        this.Body3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0477F, -0.116F, -0.5963F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 38, 19, -1.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, 0.3F, 3.4F);
        this.Body3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0115F, 0.0915F, 0.6001F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 21, 31, 0.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, 0.3F, 3.4F);
        this.Body3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0359F, 0.0849F, 1.1257F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 4, 26, 0.866F, -0.5F, -0.5F, 2, 0, 1, -0.001F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, 0.1F, 1.4F);
        this.Body3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.017F, 0.1243F, 1.1237F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 36, 17, 0.866F, -0.5F, -0.5F, 3, 0, 1, -0.001F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.5F, 0.1F, 1.4F);
        this.Body3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.0477F, 0.116F, 0.5963F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 38, 19, 0.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.2F, 3.9F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.0F, -0.2618F, 0.0F);
        this.Body4.cubeList.add(new ModelBox(Body4, 21, 6, -0.5F, -0.5F, -0.1F, 1, 1, 4, 0.0F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.8F, 1.6901F, 3.4133F);
        this.Body4.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.3041F, -0.0801F, 0.2495F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 5, 34, -0.9F, 0.1F, -1.0F, 2, 1, 2, 0.0F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.3F, 1.1528F, 3.449F);
        this.Body4.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.3005F, -0.0931F, 0.2913F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.8F, 1.6901F, 3.4133F);
        this.Body4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.3041F, 0.0801F, -0.2495F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 5, 34, -1.1F, 0.1F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(1.3F, 1.1528F, 3.449F);
        this.Body4.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.3005F, 0.0931F, -0.2913F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 0, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -1.2652F, -6.8089F);
        this.Body4.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.1309F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 42, 23, 0.0F, -1.2044F, 9.6154F, 0, 1, 1, -0.001F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, -1.2652F, -6.7089F);
        this.Body4.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.1309F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 42, 26, 0.0F, -1.2044F, 7.6154F, 0, 1, 1, -0.001F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, 0.1F, 1.4F);
        this.Body4.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0359F, -0.0849F, -1.1257F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 7, 20, -1.866F, -0.5F, -0.5F, 1, 0, 1, -0.001F, true));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.5F, 0.1F, 1.4F);
        this.Body4.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0115F, -0.0915F, -0.6001F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 18, 12, -1.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, true));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.5F, 0.1F, 1.4F);
        this.Body4.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0359F, 0.0849F, 1.1257F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 7, 20, 0.866F, -0.5F, -0.5F, 1, 0, 1, -0.001F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.5F, 0.1F, 1.3F);
        this.Body4.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.0115F, 0.0915F, 0.6001F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 12, 2, 0.0F, 0.0F, 1.5F, 1, 0, 1, -0.001F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, 0.1F, 1.4F);
        this.Body4.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.0115F, 0.0915F, 0.6001F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 18, 12, 0.0F, 0.0F, -0.5F, 1, 0, 1, -0.001F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 4.3F, -3.0F);
        this.Body4.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.2618F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 7, 30, -1.5F, -1.0F, 3.0F, 3, 1, 2, 0.0F, false));

        this.HindlimbsL = new ModelRenderer(this);
        this.HindlimbsL.setRotationPoint(2.05F, 2.3F, 3.65F);
        this.Body4.addChild(HindlimbsL);


        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(0.45F, 0.4F, -0.05F);
        this.HindlimbsL.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.219F, -0.3286F, 0.6037F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 25, 25, 0.0F, 0.1F, -0.5F, 4, 0, 2, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 37, 30, -1.0F, -0.4F, -0.5F, 2, 1, 1, 0.0F, false));

        this.HindlimbsL2 = new ModelRenderer(this);
        this.HindlimbsL2.setRotationPoint(-2.05F, 2.3F, 3.65F);
        this.Body4.addChild(HindlimbsL2);


        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.45F, 0.4F, -0.05F);
        this.HindlimbsL2.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.219F, 0.3286F, -0.6037F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 25, 25, -4.0F, 0.1F, -0.5F, 4, 0, 2, 0.0F, true));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 37, 30, -1.0F, -0.4F, -0.5F, 2, 1, 1, 0.0F, true));

        this.Body5 = new ModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -0.1F, 3.8F);
        this.Body4.addChild(Body5);
        this.setRotateAngle(Body5, 0.0F, -0.3927F, 0.0F);
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 7, -0.5F, -0.4F, -0.1F, 1, 1, 6, 0.001F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, -0.2822F, 1.4948F);
        this.Body5.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.0436F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 38, 41, 0.0F, -1.2F, 3.5F, 0, 1, 1, -0.001F, false));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 41, 41, 0.0F, -0.9F, 1.5F, 0, 1, 1, -0.001F, false));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 15, 41, 0.0F, 0.4F, 1.5F, 0, 1, 1, -0.001F, false));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 18, 41, 0.0F, 0.2F, -0.5F, 0, 1, 1, -0.001F, false));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 42, 4, 0.0F, -0.6F, -0.5F, 0, 1, 1, -0.001F, false));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.1F, 5.8F);
        this.Body5.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0F, -0.3927F, 0.0F);


        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(-2.1399F, 2.0508F, 6.8662F);
        this.Tail1.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.0175F, -0.5672F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 20, 0.1123F, -0.5095F, -0.2721F, 1, 1, 4, 0.0F, false));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, 1.6F, 3.3F);
        this.Tail1.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.192F, -0.3927F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 19, 19, -0.5F, -0.823F, -0.0663F, 1, 1, 4, -0.001F, false));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0F, -1.4F, 0.4F);
        this.Tail1.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.3491F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 20, 0, -0.5F, 1.0F, -0.3F, 1, 1, 4, 0.0F, false));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(-2.1399F, 2.0508F, 6.8662F);
        this.Tail1.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, -0.5672F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 15, 0.6123F, -0.35F, 0.7286F, 0, 1, 1, -0.001F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 21, 41, 0.6123F, -0.65F, 0.7286F, 0, 1, 1, -0.001F, false));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, 1.6F, 3.3F);
        this.Tail1.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.1745F, -0.3927F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 21, 41, 0.0F, -0.9163F, 3.0409F, 0, 1, 1, -0.001F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 24, 41, 0.0F, -1.2163F, 1.0409F, 0, 1, 1, -0.001F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 15, 0.0F, -0.6163F, 3.0409F, 0, 1, 1, -0.001F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 14, 17, 0.0F, -0.4163F, 1.0409F, 0, 1, 1, -0.001F, false));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, 0.0793F, 1.6804F);
        this.Tail1.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.1745F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 32, 41, 0.0F, -0.3F, 1.0F, 0, 1, 1, -0.001F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 26, 0.0F, 0.5F, -1.1F, 0, 1, 1, -0.001F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 35, 41, 0.0F, -0.8F, -1.1F, 0, 1, 1, -0.001F, false));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 1.6F, 3.3F);
        this.Tail1.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.1745F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 18, 9, 0.0F, -0.3163F, -0.8591F, 0, 1, 1, -0.001F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 1.4F, -7.3F);
        this.Mixosaurus.addChild(Head);
        this.setRotateAngle(Head, -0.0436F, 0.48F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 26, 28, -1.0F, 0.1F, -5.6F, 2, 1, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 14, 17, 0.9F, 0.3F, -5.6F, 0, 1, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 12, 2, -0.5F, 0.1F, -10.6F, 1, 1, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 8, 17, 0.4F, 0.3F, -10.6F, 0, 1, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 8, 17, -0.4F, 0.3F, -10.6F, 0, 1, 5, 0.0F, true));
        this.Head.cubeList.add(new ModelBox(Head, 14, 17, -0.9F, 0.3F, -5.6F, 0, 1, 3, 0.0F, true));

        this.cube_r63 = new ModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0F, 0.1F, -5.7F);
        this.Head.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.2618F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 10, -0.5F, 0.05F, 0.0446F, 1, 1, 1, 0.001F, false));

        this.cube_r64 = new ModelRenderer(this);
        this.cube_r64.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.Head.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.1222F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 35, 13, -1.6F, -0.7623F, -0.8465F, 3, 2, 1, -0.12F, false));

        this.cube_r65 = new ModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, -1.8F, -1.3F);
        this.Head.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.4014F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 24, 12, -1.5F, -0.0524F, 0.0455F, 3, 2, 2, -0.005F, false));

        this.cube_r66 = new ModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, -1.4F, -2.2F);
        this.Head.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.4712F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 24, 33, -1.0F, -0.0002F, -0.971F, 2, 2, 2, 0.0F, false));

        this.cube_r67 = new ModelRenderer(this);
        this.cube_r67.setRotationPoint(0.0F, -0.1F, -4.7F);
        this.Head.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.4712F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 38, 37, -0.5F, 0.1772F, -0.0494F, 1, 1, 2, -0.001F, false));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 5, 39, -0.5F, -0.0228F, -0.0494F, 1, 1, 2, 0.0F, false));

        this.cube_r68 = new ModelRenderer(this);
        this.cube_r68.setRotationPoint(0.0F, -0.4F, 7.4F);
        this.Head.addChild(cube_r68);
        this.setRotateAngle(cube_r68, -0.1833F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 19, 36, -1.73F, 1.1616F, -9.7996F, 1, 2, 2, -0.2F, true));
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 36, 0, -2.0F, 1.1616F, -9.7996F, 1, 2, 2, -0.55F, true));
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 36, 0, 1.0F, 1.1616F, -9.7996F, 1, 2, 2, -0.55F, false));
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 19, 36, 0.73F, 1.1616F, -9.7996F, 1, 2, 2, -0.2F, false));

        this.cube_r69 = new ModelRenderer(this);
        this.cube_r69.setRotationPoint(0.0F, 0.0F, -2.6F);
        this.Head.addChild(cube_r69);
        this.setRotateAngle(cube_r69, -0.0873F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 27, 17, -1.5F, -0.9F, 0.0F, 3, 2, 2, 0.0F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.1F, 0.3F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.6981F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 33, 8, 0.5F, 0.0F, -2.9F, 1, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 33, 8, -1.5F, 0.0F, -2.9F, 1, 1, 3, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 28, 3, -1.0F, 0.0F, -5.9F, 2, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 35, 25, 0.8F, -0.2F, -5.9F, 0, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 10, 10, -0.5F, 0.0F, -10.9F, 1, 1, 5, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 18, 12, 0.3F, -0.2F, -10.9F, 0, 1, 5, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 35, 25, -0.8F, -0.2F, -5.9F, 0, 1, 3, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 18, 12, -0.3F, -0.2F, -10.9F, 0, 1, 5, 0.0F, true));

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
