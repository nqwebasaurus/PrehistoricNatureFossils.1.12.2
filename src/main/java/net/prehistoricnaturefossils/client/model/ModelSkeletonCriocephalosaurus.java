package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCriocephalosaurus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Hips_r2;
    private final ModelRenderer Hips_r3;
    private final ModelRenderer Hips_r4;
    private final ModelRenderer Hips_r5;
    private final ModelRenderer Hips_r6;
    private final ModelRenderer Hips_r7;
    private final ModelRenderer Hips_r8;
    private final ModelRenderer Hips_r9;
    private final ModelRenderer Hips_r10;
    private final ModelRenderer Hips_r11;
    private final ModelRenderer Hips_r12;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Neck_r1;
    private final ModelRenderer Neck_r2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Righthindfoot_r1;
    private final ModelRenderer Righthindfoot_r2;
    private final ModelRenderer Righthindfoot_r3;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;
    private final ModelRenderer Righthindfoot_r4;
    private final ModelRenderer Righthindfoot_r5;
    private final ModelRenderer Righthindfoot_r6;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Neck_r3;
    private final ModelRenderer Neck_r4;
    private final ModelRenderer Neck_r5;
    private final ModelRenderer Neck_r6;
    private final ModelRenderer Neck_r7;
    private final ModelRenderer Neck_r8;
    private final ModelRenderer Neck_r9;
    private final ModelRenderer Neck_r10;
    private final ModelRenderer Neck_r11;
    private final ModelRenderer Neck_r12;
    private final ModelRenderer Neck_r13;
    private final ModelRenderer Neck_r14;
    private final ModelRenderer Neck_r15;
    private final ModelRenderer Neck_r16;
    private final ModelRenderer Neck_r17;
    private final ModelRenderer Neck_r18;
    private final ModelRenderer Neck_r19;
    private final ModelRenderer Neck_r20;
    private final ModelRenderer Neck_r21;
    private final ModelRenderer Neck_r22;
    private final ModelRenderer Neck_r23;
    private final ModelRenderer Neck_r24;
    private final ModelRenderer Neck_r25;
    private final ModelRenderer Neck_r26;
    private final ModelRenderer Neck_r27;
    private final ModelRenderer Neck_r28;
    private final ModelRenderer Neck_r29;
    private final ModelRenderer Neck_r30;
    private final ModelRenderer Neck_r31;
    private final ModelRenderer Neck_r32;
    private final ModelRenderer Neck_r33;
    private final ModelRenderer Neck_r34;
    private final ModelRenderer chest;
    private final ModelRenderer Neck_r35;
    private final ModelRenderer Neck_r36;
    private final ModelRenderer Neck_r37;
    private final ModelRenderer Neck_r38;
    private final ModelRenderer Neck_r39;
    private final ModelRenderer Neck_r40;
    private final ModelRenderer Neck_r41;
    private final ModelRenderer Neck_r42;
    private final ModelRenderer Neck_r43;
    private final ModelRenderer Neck_r44;
    private final ModelRenderer Neck_r45;
    private final ModelRenderer Neck_r46;
    private final ModelRenderer Front_r1;
    private final ModelRenderer Front_r2;
    private final ModelRenderer Front_r3;
    private final ModelRenderer Front_r4;
    private final ModelRenderer Front_r5;
    private final ModelRenderer Front_r6;
    private final ModelRenderer Front_r7;
    private final ModelRenderer Front_r8;
    private final ModelRenderer Front_r9;
    private final ModelRenderer Front_r10;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Neck_r47;
    private final ModelRenderer Neck_r48;
    private final ModelRenderer Neck_r49;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Neck_r50;
    private final ModelRenderer Neck_r51;
    private final ModelRenderer Neck_r52;
    private final ModelRenderer Neck_r53;
    private final ModelRenderer Neck_r54;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r16;
    private final ModelRenderer Neck_r55;
    private final ModelRenderer Neck_r56;
    private final ModelRenderer Neck_r57;
    private final ModelRenderer Neck_r58;
    private final ModelRenderer Neck_r59;
    private final ModelRenderer Neck_r60;
    private final ModelRenderer Neck_r61;
    private final ModelRenderer Neck_r62;
    private final ModelRenderer Neck_r63;
    private final ModelRenderer cube_r17;
    private final ModelRenderer Neck_r64;
    private final ModelRenderer Neck_r65;
    private final ModelRenderer Neck_r66;
    private final ModelRenderer neck2;
    private final ModelRenderer Neck_r67;
    private final ModelRenderer Neck_r68;
    private final ModelRenderer Neck_r69;
    private final ModelRenderer Neck_r70;
    private final ModelRenderer cube_r18;
    private final ModelRenderer head;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer jaw;

    public ModelSkeletonCriocephalosaurus() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -23.0F, 0.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.3491F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 33, -1.0F, -2.1941F, 10.6822F, 2, 2, 9, 0.0F, false));

        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-3.2F, 4.7608F, 18.3221F);
        this.hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 0.0662F, 0.4416F, -0.6169F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 54, -0.1203F, -0.0655F, -4.1964F, 1, 2, 7, 0.0F, true));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(-3.9F, 3.1608F, 14.3221F);
        this.hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, 0.2707F, 0.3591F, -0.1024F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 23, 64, -1.0274F, -0.4114F, -0.2522F, 1, 3, 6, 0.0F, true));

        this.Hips_r3 = new ModelRenderer(this);
        this.Hips_r3.setRotationPoint(-3.9F, 0.1608F, 16.3221F);
        this.hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.1183F, 0.3314F, 0.1008F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 75, 77, -0.0913F, -0.936F, -1.6806F, 1, 4, 4, 0.0F, true));

        this.Hips_r4 = new ModelRenderer(this);
        this.Hips_r4.setRotationPoint(-3.9F, -0.6392F, 18.3221F);
        this.hips.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, 0.6933F, 0.3314F, 0.1008F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 33, 80, 0.6355F, -0.0506F, -3.5048F, 1, 3, 4, -0.004F, true));

        this.Hips_r5 = new ModelRenderer(this);
        this.Hips_r5.setRotationPoint(-2.7F, -1.5392F, 16.3221F);
        this.hips.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, 0.0573F, 0.33F, 0.4239F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 49, 49, -0.7646F, -1.8035F, -3.9252F, 1, 3, 7, 0.0F, true));

        this.Hips_r6 = new ModelRenderer(this);
        this.Hips_r6.setRotationPoint(-0.6F, -0.6392F, 16.3221F);
        this.hips.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, -0.1261F, 0.1062F, 0.1188F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 75, 0, -2.6249F, -1.2442F, -1.8895F, 3, 1, 3, 0.0F, true));

        this.Hips_r7 = new ModelRenderer(this);
        this.Hips_r7.setRotationPoint(0.6F, -0.6392F, 16.3221F);
        this.hips.addChild(Hips_r7);
        this.setRotateAngle(Hips_r7, -0.1261F, -0.1062F, -0.1188F);
        this.Hips_r7.cubeList.add(new ModelBox(Hips_r7, 75, 0, -0.3751F, -1.2442F, -1.8895F, 3, 1, 3, 0.0F, false));

        this.Hips_r8 = new ModelRenderer(this);
        this.Hips_r8.setRotationPoint(3.9F, -0.6392F, 18.3221F);
        this.hips.addChild(Hips_r8);
        this.setRotateAngle(Hips_r8, 0.6933F, -0.3314F, -0.1008F);
        this.Hips_r8.cubeList.add(new ModelBox(Hips_r8, 33, 80, -1.6355F, -0.0506F, -3.5048F, 1, 3, 4, -0.004F, false));

        this.Hips_r9 = new ModelRenderer(this);
        this.Hips_r9.setRotationPoint(3.9F, 3.1608F, 14.3221F);
        this.hips.addChild(Hips_r9);
        this.setRotateAngle(Hips_r9, 0.2707F, -0.3591F, 0.1024F);
        this.Hips_r9.cubeList.add(new ModelBox(Hips_r9, 23, 64, 0.0274F, -0.4114F, -0.2522F, 1, 3, 6, 0.0F, false));

        this.Hips_r10 = new ModelRenderer(this);
        this.Hips_r10.setRotationPoint(3.2F, 4.7608F, 18.3221F);
        this.hips.addChild(Hips_r10);
        this.setRotateAngle(Hips_r10, 0.0662F, -0.4416F, 0.6169F);
        this.Hips_r10.cubeList.add(new ModelBox(Hips_r10, 0, 54, -0.8797F, -0.0655F, -4.1964F, 1, 2, 7, 0.0F, false));

        this.Hips_r11 = new ModelRenderer(this);
        this.Hips_r11.setRotationPoint(3.9F, 0.1608F, 16.3221F);
        this.hips.addChild(Hips_r11);
        this.setRotateAngle(Hips_r11, -0.1183F, -0.3314F, -0.1008F);
        this.Hips_r11.cubeList.add(new ModelBox(Hips_r11, 75, 77, -0.9087F, -0.936F, -1.6806F, 1, 4, 4, 0.0F, false));

        this.Hips_r12 = new ModelRenderer(this);
        this.Hips_r12.setRotationPoint(2.7F, -1.5392F, 16.3221F);
        this.hips.addChild(Hips_r12);
        this.setRotateAngle(Hips_r12, 0.0573F, -0.33F, -0.4239F);
        this.Hips_r12.cubeList.add(new ModelBox(Hips_r12, 49, 49, -0.2354F, -1.8035F, -3.9252F, 1, 3, 7, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.122F, 16.1977F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 53, 14, 0.0F, -1.4F, 1.5F, 0, 3, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 56, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.Neck_r1 = new ModelRenderer(this);
        this.Neck_r1.setRotationPoint(-1.0F, -0.9545F, 12.2879F);
        this.hips.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, 0.0055F, 0.0727F, 1.1024F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 10, 54, 0.2394F, -0.0529F, -0.3379F, 0, 3, 1, 0.0F, true));

        this.Neck_r2 = new ModelRenderer(this);
        this.Neck_r2.setRotationPoint(1.0F, -0.9545F, 12.2879F);
        this.hips.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, 0.0055F, -0.0727F, -1.1024F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 10, 54, -0.2394F, -0.0529F, -0.3379F, 0, 3, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.2346F, 14.1909F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 56, 0.0F, -1.5F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.0015F, -11.7364F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 57, 20, 0.0F, -2.6F, 23.5F, 0, 3, 1, 0.0F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(5.0F, 1.6295F, 16.5921F);
        this.hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.0627F, -0.0111F, -0.5351F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 11, 77, -1.601F, 6.2893F, -1.1153F, 2, 2, 4, 0.0F, false));
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 82, 73, -1.601F, 3.2893F, -0.7153F, 2, 3, 3, 0.0F, false));
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 71, 40, -1.601F, 0.2893F, -1.1153F, 2, 3, 4, 0.0F, false));

        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(-0.9075F, 7.8367F, -0.0294F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.4636F, -0.0588F, 0.4991F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 0, 82, -0.287F, 0.1425F, -1.1401F, 2, 6, 2, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 80, 34, -1.473F, 0.2717F, 1.1537F, 2, 6, 2, -0.2F, false));

        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.3812F, 6.6047F, 1.3276F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.2169F, 0.0F, 0.0F);


        this.Righthindfoot_r1 = new ModelRenderer(this);
        this.Righthindfoot_r1.setRotationPoint(-1.3979F, -0.2636F, -2.3017F);
        this.Righthindfoot.addChild(Righthindfoot_r1);
        this.setRotateAngle(Righthindfoot_r1, 0.6931F, 0.2895F, -0.3311F);
        this.Righthindfoot_r1.cubeList.add(new ModelBox(Righthindfoot_r1, 81, 45, -2.0F, 0.6F, -1.0F, 3, 1, 3, 0.0F, false));

        this.Righthindfoot_r2 = new ModelRenderer(this);
        this.Righthindfoot_r2.setRotationPoint(-0.1718F, 0.829F, -1.3004F);
        this.Righthindfoot.addChild(Righthindfoot_r2);
        this.setRotateAngle(Righthindfoot_r2, 0.658F, -0.3715F, 0.4391F);
        this.Righthindfoot_r2.cubeList.add(new ModelBox(Righthindfoot_r2, 32, 64, 0.3F, -1.4F, -1.0F, 2, 1, 3, 0.0F, false));

        this.Righthindfoot_r3 = new ModelRenderer(this);
        this.Righthindfoot_r3.setRotationPoint(-0.2718F, 2.1126F, -1.7258F);
        this.Righthindfoot.addChild(Righthindfoot_r3);
        this.setRotateAngle(Righthindfoot_r3, 0.3054F, 0.0F, 0.0F);
        this.Righthindfoot_r3.cubeList.add(new ModelBox(Righthindfoot_r3, 35, 48, -2.5F, -1.7F, -5.5F, 5, 2, 5, 0.0F, false));

        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-5.0F, 1.6295F, 16.5921F);
        this.hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.4172F, 0.0111F, 0.5351F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 74, 16, -0.399F, 6.2893F, -1.1153F, 2, 2, 4, 0.0F, false));
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 81, 66, -0.399F, 3.2893F, -0.7153F, 2, 3, 3, 0.0F, false));
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 69, 69, -0.399F, 0.2893F, -1.1153F, 2, 3, 4, 0.0F, false));

        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.9075F, 7.8367F, -0.0294F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.4636F, 0.0588F, -0.4991F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 24, 81, -1.713F, 0.1425F, -1.1401F, 2, 6, 2, 0.0F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 0, 33, -0.527F, 0.2717F, 1.1537F, 2, 6, 2, -0.2F, false));

        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(-0.3812F, 6.6047F, 1.3276F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.5224F, 0.0F, 0.0F);


        this.Righthindfoot_r4 = new ModelRenderer(this);
        this.Righthindfoot_r4.setRotationPoint(1.3979F, -0.2636F, -2.3017F);
        this.Lefthindfoot.addChild(Righthindfoot_r4);
        this.setRotateAngle(Righthindfoot_r4, 0.6931F, -0.2895F, 0.3311F);
        this.Righthindfoot_r4.cubeList.add(new ModelBox(Righthindfoot_r4, 76, 23, -1.0F, 0.6F, -1.0F, 3, 1, 3, 0.0F, false));

        this.Righthindfoot_r5 = new ModelRenderer(this);
        this.Righthindfoot_r5.setRotationPoint(0.1718F, 0.829F, -1.3004F);
        this.Lefthindfoot.addChild(Righthindfoot_r5);
        this.setRotateAngle(Righthindfoot_r5, 0.658F, 0.3715F, -0.4391F);
        this.Righthindfoot_r5.cubeList.add(new ModelBox(Righthindfoot_r5, 28, 48, -2.3F, -1.4F, -1.0F, 2, 1, 3, 0.0F, false));

        this.Righthindfoot_r6 = new ModelRenderer(this);
        this.Righthindfoot_r6.setRotationPoint(0.2718F, 2.1126F, -1.7258F);
        this.Lefthindfoot.addChild(Righthindfoot_r6);
        this.setRotateAngle(Righthindfoot_r6, 0.3054F, 0.0F, 0.0F);
        this.Righthindfoot_r6.cubeList.add(new ModelBox(Righthindfoot_r6, 48, 6, -2.5F, -1.7F, -5.5F, 5, 2, 5, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.5525F, 19.6895F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.2288F, 0.1275F, -0.0296F);
        this.tail1.cubeList.add(new ModelBox(tail1, 16, 48, -1.0F, -0.6389F, -0.2122F, 2, 2, 7, 0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5696F, -2.9918F);
        this.tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 19, 0.0F, -1.4F, 8.8F, 0, 2, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 19, 0.0F, -1.4F, 6.8F, 0, 2, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 6, 0.0F, -1.4F, 4.8F, 0, 3, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 51, 48, 0.0F, -1.4F, 2.8F, 0, 3, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3611F, 6.7878F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.3693F, 0.2449F, -0.0936F);
        this.tail2.cubeList.add(new ModelBox(tail2, 37, 30, -0.5F, -0.5381F, -0.8087F, 1, 1, 9, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.9306F, -9.7797F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 13, 0.0F, -0.9F, 16.0F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 13, 0.0F, -0.9F, 14.0F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 13, 0.0F, -0.9F, 12.0F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 33, 13, 0.0F, -0.9F, 10.0F, 0, 1, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0381F, 8.1913F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1174F, -0.2601F, -0.0303F);
        this.tail3.cubeList.add(new ModelBox(tail3, 59, 31, -0.5F, -0.5032F, -0.0566F, 1, 1, 7, 0.003F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.8958F, -18.0276F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 13, 0.0F, -0.9F, 18.0F, 0, 1, 1, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.5525F, 11.1895F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.0873F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 3.2819F, -24.5974F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.096F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.0F, -1.5824F, 8.8646F, 2, 2, 16, 0.003F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.5509F, -22.4259F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 58, 0.0F, -2.7F, 21.5F, 0, 3, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 59, 40, 0.0F, -2.7F, 19.5F, 0, 3, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 60, 20, 0.0F, -2.7F, 17.5F, 0, 3, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 60, 0.0F, -2.7F, 15.5F, 0, 3, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 64, 0.0F, -2.7F, 13.5F, 0, 3, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 3, 64, 0.0F, -2.7F, 11.5F, 0, 3, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 65, 0, 0.0F, -2.7F, 9.5F, 0, 3, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 7, 19, 0.0F, -2.4F, 7.5F, 0, 2, 1, 0.0F, false));

        this.Neck_r3 = new ModelRenderer(this);
        this.Neck_r3.setRotationPoint(-1.0F, 1.6697F, -13.4945F);
        this.body.addChild(Neck_r3);
        this.setRotateAngle(Neck_r3, 0.3303F, -0.0352F, 0.318F);
        this.Neck_r3.cubeList.add(new ModelBox(Neck_r3, 44, 80, -2.8756F, 2.304F, -1.3863F, 0, 12, 1, 0.0F, true));

        this.Neck_r4 = new ModelRenderer(this);
        this.Neck_r4.setRotationPoint(-1.0F, 1.7546F, -11.9738F);
        this.body.addChild(Neck_r4);
        this.setRotateAngle(Neck_r4, 0.3125F, -0.0341F, 0.3187F);
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 47, 80, -2.9005F, 2.2527F, -0.9889F, 0, 12, 1, 0.0F, true));

        this.Neck_r5 = new ModelRenderer(this);
        this.Neck_r5.setRotationPoint(-1.0F, 1.5746F, -10.0173F);
        this.body.addChild(Neck_r5);
        this.setRotateAngle(Neck_r5, 0.2619F, -0.0206F, 0.3202F);
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 12, 84, -2.919F, 2.274F, -0.8963F, 0, 11, 1, 0.0F, true));

        this.Neck_r6 = new ModelRenderer(this);
        this.Neck_r6.setRotationPoint(-1.0F, 1.4886F, -8.0267F);
        this.body.addChild(Neck_r6);
        this.setRotateAngle(Neck_r6, 0.2114F, -0.007F, 0.321F);
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 21, 84, -2.9459F, 2.1871F, -0.8081F, 0, 10, 1, 0.0F, true));

        this.Neck_r7 = new ModelRenderer(this);
        this.Neck_r7.setRotationPoint(-1.0F, 1.1805F, -6.0105F);
        this.body.addChild(Neck_r7);
        this.setRotateAngle(Neck_r7, 0.194F, -0.0044F, 0.3213F);
        this.Neck_r7.cubeList.add(new ModelBox(Neck_r7, 51, 69, -2.9199F, 2.2983F, -0.8046F, 0, 8, 1, 0.0F, true));

        this.Neck_r8 = new ModelRenderer(this);
        this.Neck_r8.setRotationPoint(-1.0F, 1.0602F, -3.9259F);
        this.body.addChild(Neck_r8);
        this.setRotateAngle(Neck_r8, 0.1252F, 0.0088F, 0.234F);
        this.Neck_r8.cubeList.add(new ModelBox(Neck_r8, 64, 84, -2.9125F, 2.3087F, -0.8131F, 0, 6, 1, 0.0F, true));

        this.Neck_r9 = new ModelRenderer(this);
        this.Neck_r9.setRotationPoint(-1.0F, 0.598F, -0.9016F);
        this.body.addChild(Neck_r9);
        this.setRotateAngle(Neck_r9, 0.0913F, 0.0169F, 0.2336F);
        this.Neck_r9.cubeList.add(new ModelBox(Neck_r9, 9, 0, -2.8189F, 2.5112F, -2.0053F, 0, 4, 1, 0.0F, true));

        this.Neck_r10 = new ModelRenderer(this);
        this.Neck_r10.setRotationPoint(-1.0F, 0.598F, 1.0984F);
        this.body.addChild(Neck_r10);
        this.setRotateAngle(Neck_r10, 0.0063F, 0.037F, 0.2313F);
        this.Neck_r10.cubeList.add(new ModelBox(Neck_r10, 13, 12, -2.8269F, 2.4892F, -1.9308F, 0, 2, 1, 0.0F, true));

        this.Neck_r11 = new ModelRenderer(this);
        this.Neck_r11.setRotationPoint(-1.0F, 0.598F, 1.0984F);
        this.body.addChild(Neck_r11);
        this.setRotateAngle(Neck_r11, 0.0213F, 0.0415F, 1.1033F);
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 10, 54, 0.1469F, -0.1658F, -1.9026F, 0, 4, 1, 0.0F, true));

        this.Neck_r12 = new ModelRenderer(this);
        this.Neck_r12.setRotationPoint(-1.0F, 0.598F, -0.9016F);
        this.body.addChild(Neck_r12);
        this.setRotateAngle(Neck_r12, 0.0606F, -0.0364F, 1.1034F);
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 13, 54, 0.1705F, -0.1569F, -1.9765F, 0, 4, 1, 0.0F, true));

        this.Neck_r13 = new ModelRenderer(this);
        this.Neck_r13.setRotationPoint(-1.0F, 1.0602F, -3.9259F);
        this.body.addChild(Neck_r13);
        this.setRotateAngle(Neck_r13, 0.0764F, -0.0676F, 1.1026F);
        this.Neck_r13.cubeList.add(new ModelBox(Neck_r13, 3, 54, -0.0715F, -0.229F, -0.7902F, 0, 4, 1, 0.0F, true));

        this.Neck_r14 = new ModelRenderer(this);
        this.Neck_r14.setRotationPoint(-1.0F, 1.1805F, -6.0105F);
        this.body.addChild(Neck_r14);
        this.setRotateAngle(Neck_r14, 0.1109F, -0.1285F, 1.1863F);
        this.Neck_r14.cubeList.add(new ModelBox(Neck_r14, 0, 45, -0.0844F, -0.2301F, -0.7819F, 0, 4, 1, 0.0F, true));

        this.Neck_r15 = new ModelRenderer(this);
        this.Neck_r15.setRotationPoint(-1.0F, 1.4886F, -8.0267F);
        this.body.addChild(Neck_r15);
        this.setRotateAngle(Neck_r15, 0.1203F, -0.1435F, 1.1849F);
        this.Neck_r15.cubeList.add(new ModelBox(Neck_r15, 37, 13, -0.1861F, -0.2817F, -0.7883F, 0, 4, 1, 0.0F, true));

        this.Neck_r16 = new ModelRenderer(this);
        this.Neck_r16.setRotationPoint(-1.0F, 1.5746F, -10.0173F);
        this.body.addChild(Neck_r16);
        this.setRotateAngle(Neck_r16, 0.1432F, -0.1907F, 1.1809F);
        this.Neck_r16.cubeList.add(new ModelBox(Neck_r16, 14, 33, -0.1003F, -0.2454F, -0.8742F, 0, 4, 1, 0.0F, true));

        this.Neck_r17 = new ModelRenderer(this);
        this.Neck_r17.setRotationPoint(-1.0F, 1.7546F, -11.9738F);
        this.body.addChild(Neck_r17);
        this.setRotateAngle(Neck_r17, 0.1665F, -0.2377F, 1.1759F);
        this.Neck_r17.cubeList.add(new ModelBox(Neck_r17, 0, 54, -0.1027F, -0.2722F, -0.9672F, 0, 4, 1, 0.0F, true));

        this.Neck_r18 = new ModelRenderer(this);
        this.Neck_r18.setRotationPoint(-1.0F, 1.6697F, -13.4945F);
        this.body.addChild(Neck_r18);
        this.setRotateAngle(Neck_r18, 0.1777F, -0.2519F, 1.173F);
        this.Neck_r18.cubeList.add(new ModelBox(Neck_r18, 40, 28, -0.0384F, -0.2538F, -1.3631F, 0, 4, 1, 0.0F, true));

        this.Neck_r19 = new ModelRenderer(this);
        this.Neck_r19.setRotationPoint(1.0F, 0.598F, -0.9016F);
        this.body.addChild(Neck_r19);
        this.setRotateAngle(Neck_r19, 0.0913F, -0.0169F, -0.2336F);
        this.Neck_r19.cubeList.add(new ModelBox(Neck_r19, 9, 0, 2.8189F, 2.5112F, -2.0053F, 0, 4, 1, 0.0F, false));

        this.Neck_r20 = new ModelRenderer(this);
        this.Neck_r20.setRotationPoint(1.0F, 0.598F, -0.9016F);
        this.body.addChild(Neck_r20);
        this.setRotateAngle(Neck_r20, 0.0606F, 0.0364F, -1.1034F);
        this.Neck_r20.cubeList.add(new ModelBox(Neck_r20, 13, 54, -0.1705F, -0.1569F, -1.9765F, 0, 4, 1, 0.0F, false));

        this.Neck_r21 = new ModelRenderer(this);
        this.Neck_r21.setRotationPoint(1.0F, 1.0602F, -3.9259F);
        this.body.addChild(Neck_r21);
        this.setRotateAngle(Neck_r21, 0.1252F, -0.0088F, -0.234F);
        this.Neck_r21.cubeList.add(new ModelBox(Neck_r21, 64, 84, 2.9125F, 2.3087F, -0.8131F, 0, 6, 1, 0.0F, false));

        this.Neck_r22 = new ModelRenderer(this);
        this.Neck_r22.setRotationPoint(1.0F, 1.0602F, -3.9259F);
        this.body.addChild(Neck_r22);
        this.setRotateAngle(Neck_r22, 0.0764F, 0.0676F, -1.1026F);
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 3, 54, 0.0715F, -0.229F, -0.7902F, 0, 4, 1, 0.0F, false));

        this.Neck_r23 = new ModelRenderer(this);
        this.Neck_r23.setRotationPoint(1.0F, 1.1805F, -6.0105F);
        this.body.addChild(Neck_r23);
        this.setRotateAngle(Neck_r23, 0.194F, 0.0044F, -0.3213F);
        this.Neck_r23.cubeList.add(new ModelBox(Neck_r23, 51, 69, 2.9199F, 2.2983F, -0.8046F, 0, 8, 1, 0.0F, false));

        this.Neck_r24 = new ModelRenderer(this);
        this.Neck_r24.setRotationPoint(1.0F, 1.1805F, -6.0105F);
        this.body.addChild(Neck_r24);
        this.setRotateAngle(Neck_r24, 0.1109F, 0.1285F, -1.1863F);
        this.Neck_r24.cubeList.add(new ModelBox(Neck_r24, 0, 45, 0.0844F, -0.2301F, -0.7819F, 0, 4, 1, 0.0F, false));

        this.Neck_r25 = new ModelRenderer(this);
        this.Neck_r25.setRotationPoint(1.0F, 1.4886F, -8.0267F);
        this.body.addChild(Neck_r25);
        this.setRotateAngle(Neck_r25, 0.2114F, 0.007F, -0.321F);
        this.Neck_r25.cubeList.add(new ModelBox(Neck_r25, 21, 84, 2.9459F, 2.1871F, -0.8081F, 0, 10, 1, 0.0F, false));

        this.Neck_r26 = new ModelRenderer(this);
        this.Neck_r26.setRotationPoint(1.0F, 1.4886F, -8.0267F);
        this.body.addChild(Neck_r26);
        this.setRotateAngle(Neck_r26, 0.1203F, 0.1435F, -1.1849F);
        this.Neck_r26.cubeList.add(new ModelBox(Neck_r26, 37, 13, 0.1861F, -0.2817F, -0.7883F, 0, 4, 1, 0.0F, false));

        this.Neck_r27 = new ModelRenderer(this);
        this.Neck_r27.setRotationPoint(1.0F, 1.5746F, -10.0173F);
        this.body.addChild(Neck_r27);
        this.setRotateAngle(Neck_r27, 0.2619F, 0.0206F, -0.3202F);
        this.Neck_r27.cubeList.add(new ModelBox(Neck_r27, 12, 84, 2.919F, 2.274F, -0.8963F, 0, 11, 1, 0.0F, false));

        this.Neck_r28 = new ModelRenderer(this);
        this.Neck_r28.setRotationPoint(1.0F, 1.5746F, -10.0173F);
        this.body.addChild(Neck_r28);
        this.setRotateAngle(Neck_r28, 0.1432F, 0.1907F, -1.1809F);
        this.Neck_r28.cubeList.add(new ModelBox(Neck_r28, 14, 33, 0.1003F, -0.2454F, -0.8742F, 0, 4, 1, 0.0F, false));

        this.Neck_r29 = new ModelRenderer(this);
        this.Neck_r29.setRotationPoint(1.0F, 1.7546F, -11.9738F);
        this.body.addChild(Neck_r29);
        this.setRotateAngle(Neck_r29, 0.3125F, 0.0341F, -0.3187F);
        this.Neck_r29.cubeList.add(new ModelBox(Neck_r29, 47, 80, 2.9005F, 2.2527F, -0.9889F, 0, 12, 1, 0.0F, false));

        this.Neck_r30 = new ModelRenderer(this);
        this.Neck_r30.setRotationPoint(1.0F, 1.7546F, -11.9738F);
        this.body.addChild(Neck_r30);
        this.setRotateAngle(Neck_r30, 0.1665F, 0.2377F, -1.1759F);
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 0, 54, 0.1027F, -0.2722F, -0.9672F, 0, 4, 1, 0.0F, false));

        this.Neck_r31 = new ModelRenderer(this);
        this.Neck_r31.setRotationPoint(1.0F, 0.598F, 1.0984F);
        this.body.addChild(Neck_r31);
        this.setRotateAngle(Neck_r31, 0.0213F, -0.0415F, -1.1033F);
        this.Neck_r31.cubeList.add(new ModelBox(Neck_r31, 10, 54, -0.1469F, -0.1658F, -1.9026F, 0, 4, 1, 0.0F, false));

        this.Neck_r32 = new ModelRenderer(this);
        this.Neck_r32.setRotationPoint(1.0F, 0.598F, 1.0984F);
        this.body.addChild(Neck_r32);
        this.setRotateAngle(Neck_r32, 0.0063F, -0.037F, -0.2313F);
        this.Neck_r32.cubeList.add(new ModelBox(Neck_r32, 13, 12, 2.8269F, 2.4892F, -1.9308F, 0, 2, 1, 0.0F, false));

        this.Neck_r33 = new ModelRenderer(this);
        this.Neck_r33.setRotationPoint(1.0F, 1.6697F, -13.4945F);
        this.body.addChild(Neck_r33);
        this.setRotateAngle(Neck_r33, 0.3303F, 0.0352F, -0.318F);
        this.Neck_r33.cubeList.add(new ModelBox(Neck_r33, 44, 80, 2.8756F, 2.304F, -1.3863F, 0, 12, 1, 0.0F, false));

        this.Neck_r34 = new ModelRenderer(this);
        this.Neck_r34.setRotationPoint(1.0F, 1.6697F, -13.4945F);
        this.body.addChild(Neck_r34);
        this.setRotateAngle(Neck_r34, 0.1777F, 0.2519F, -1.173F);
        this.Neck_r34.cubeList.add(new ModelBox(Neck_r34, 40, 28, 0.0384F, -0.2538F, -1.3631F, 0, 4, 1, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.5F, -15.1F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0873F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 16, 19, -3.0F, 14.7184F, -8.0195F, 6, 1, 7, -0.001F, false));

        this.Neck_r35 = new ModelRenderer(this);
        this.Neck_r35.setRotationPoint(-1.0F, 2.7987F, -8.4629F);
        this.chest.addChild(Neck_r35);
        this.setRotateAngle(Neck_r35, 0.5331F, -0.0839F, 0.3028F);
        this.Neck_r35.cubeList.add(new ModelBox(Neck_r35, 67, 84, -1.3426F, 2.4367F, -0.5953F, 0, 6, 1, 0.0F, true));

        this.Neck_r36 = new ModelRenderer(this);
        this.Neck_r36.setRotationPoint(-1.0F, 1.9661F, -6.2541F);
        this.chest.addChild(Neck_r36);
        this.setRotateAngle(Neck_r36, 0.5336F, -0.0863F, 0.087F);
        this.Neck_r36.cubeList.add(new ModelBox(Neck_r36, 61, 84, -2.9155F, 2.3448F, -0.9919F, 0, 9, 1, 0.0F, true));

        this.Neck_r37 = new ModelRenderer(this);
        this.Neck_r37.setRotationPoint(-1.0F, 1.3505F, -4.5627F);
        this.chest.addChild(Neck_r37);
        this.setRotateAngle(Neck_r37, 0.4824F, -0.0749F, 0.2221F);
        this.Neck_r37.cubeList.add(new ModelBox(Neck_r37, 18, 84, -2.8915F, 2.4002F, -0.799F, 0, 10, 1, 0.0F, true));

        this.Neck_r38 = new ModelRenderer(this);
        this.Neck_r38.setRotationPoint(-1.0F, 1.0081F, -2.4525F);
        this.chest.addChild(Neck_r38);
        this.setRotateAngle(Neck_r38, 0.4312F, -0.0633F, 0.2256F);
        this.Neck_r38.cubeList.add(new ModelBox(Neck_r38, 15, 84, -2.9094F, 2.3099F, -0.8866F, 0, 11, 1, 0.0F, true));

        this.Neck_r39 = new ModelRenderer(this);
        this.Neck_r39.setRotationPoint(-1.0F, 0.3241F, -0.5731F);
        this.chest.addChild(Neck_r39);
        this.setRotateAngle(Neck_r39, 0.3635F, -0.0461F, 0.273F);
        this.Neck_r39.cubeList.add(new ModelBox(Neck_r39, 9, 83, -2.8772F, 2.4189F, -0.8958F, 0, 12, 1, 0.0F, true));

        this.Neck_r40 = new ModelRenderer(this);
        this.Neck_r40.setRotationPoint(-1.0F, 0.3241F, -0.5731F);
        this.chest.addChild(Neck_r40);
        this.setRotateAngle(Neck_r40, 0.1918F, -0.284F, 1.1257F);
        this.Neck_r40.cubeList.add(new ModelBox(Neck_r40, 24, 0, 0.0374F, -0.1841F, -0.8699F, 0, 4, 1, 0.0F, true));

        this.Neck_r41 = new ModelRenderer(this);
        this.Neck_r41.setRotationPoint(-1.0F, 1.0081F, -2.4525F);
        this.chest.addChild(Neck_r41);
        this.setRotateAngle(Neck_r41, 0.2252F, -0.3462F, 1.0717F);
        this.Neck_r41.cubeList.add(new ModelBox(Neck_r41, 19, 19, -0.0669F, -0.2297F, -0.8636F, 0, 4, 1, 0.0F, true));

        this.Neck_r42 = new ModelRenderer(this);
        this.Neck_r42.setRotationPoint(-1.0F, 1.3505F, -4.5627F);
        this.chest.addChild(Neck_r42);
        this.setRotateAngle(Neck_r42, 0.2523F, -0.3921F, 1.0619F);
        this.Neck_r42.cubeList.add(new ModelBox(Neck_r42, 16, 19, 0.0116F, -0.1863F, -0.7737F, 0, 4, 1, 0.0F, true));

        this.Neck_r43 = new ModelRenderer(this);
        this.Neck_r43.setRotationPoint(-1.0F, 1.9661F, -6.2541F);
        this.chest.addChild(Neck_r43);
        this.setRotateAngle(Neck_r43, 0.2805F, -0.4376F, 0.9196F);
        this.Neck_r43.cubeList.add(new ModelBox(Neck_r43, 21, 0, -0.0418F, -0.2014F, -0.968F, 0, 4, 1, 0.0F, true));

        this.Neck_r44 = new ModelRenderer(this);
        this.Neck_r44.setRotationPoint(-1.0F, 2.7987F, -8.4629F);
        this.chest.addChild(Neck_r44);
        this.setRotateAngle(Neck_r44, 0.4462F, -0.3133F, 0.7341F);
        this.Neck_r44.cubeList.add(new ModelBox(Neck_r44, 50, 85, -0.0052F, -0.1472F, -0.5953F, 0, 3, 1, 0.0F, true));

        this.Neck_r45 = new ModelRenderer(this);
        this.Neck_r45.setRotationPoint(1.0F, 2.7987F, -8.4629F);
        this.chest.addChild(Neck_r45);
        this.setRotateAngle(Neck_r45, 0.5331F, 0.0839F, -0.3028F);
        this.Neck_r45.cubeList.add(new ModelBox(Neck_r45, 67, 84, 1.3426F, 2.4367F, -0.5953F, 0, 6, 1, 0.0F, false));

        this.Neck_r46 = new ModelRenderer(this);
        this.Neck_r46.setRotationPoint(1.0F, 2.7987F, -8.4629F);
        this.chest.addChild(Neck_r46);
        this.setRotateAngle(Neck_r46, 0.4462F, 0.3133F, -0.7341F);
        this.Neck_r46.cubeList.add(new ModelBox(Neck_r46, 50, 85, 0.0052F, -0.1472F, -0.5953F, 0, 3, 1, 0.0F, false));

        this.Front_r1 = new ModelRenderer(this);
        this.Front_r1.setRotationPoint(-3.0F, 15.3153F, -8.0971F);
        this.chest.addChild(Front_r1);
        this.setRotateAngle(Front_r1, 0.0F, 0.0F, 1.0908F);
        this.Front_r1.cubeList.add(new ModelBox(Front_r1, 29, 56, -3.0F, -0.5969F, 0.0775F, 3, 1, 6, -0.001F, true));

        this.Front_r2 = new ModelRenderer(this);
        this.Front_r2.setRotationPoint(-3.3F, 3.022F, -7.4174F);
        this.chest.addChild(Front_r2);
        this.setRotateAngle(Front_r2, 1.5306F, 0.0091F, 0.6663F);
        this.Front_r2.cubeList.add(new ModelBox(Front_r2, 0, 19, -1.0398F, -2.254F, -1.9825F, 1, 5, 4, -0.001F, true));

        this.Front_r3 = new ModelRenderer(this);
        this.Front_r3.setRotationPoint(-3.3F, 3.022F, -7.4174F);
        this.chest.addChild(Front_r3);
        this.setRotateAngle(Front_r3, 1.531F, -0.0105F, 0.1868F);
        this.Front_r3.cubeList.add(new ModelBox(Front_r3, 60, 54, -1.6905F, -1.854F, -7.3083F, 1, 4, 6, -0.001F, true));

        this.Front_r4 = new ModelRenderer(this);
        this.Front_r4.setRotationPoint(0.0F, 10.3153F, -8.9971F);
        this.chest.addChild(Front_r4);
        this.setRotateAngle(Front_r4, 1.2032F, -0.372F, -0.6086F);
        this.Front_r4.cubeList.add(new ModelBox(Front_r4, 0, 0, -4.644F, -1.0293F, -1.5305F, 1, 5, 6, -0.001F, true));

        this.Front_r5 = new ModelRenderer(this);
        this.Front_r5.setRotationPoint(3.3F, 3.022F, -7.4174F);
        this.chest.addChild(Front_r5);
        this.setRotateAngle(Front_r5, 1.5306F, -0.0091F, -0.6663F);
        this.Front_r5.cubeList.add(new ModelBox(Front_r5, 0, 19, 0.0398F, -2.254F, -1.9825F, 1, 5, 4, -0.001F, false));

        this.Front_r6 = new ModelRenderer(this);
        this.Front_r6.setRotationPoint(3.3F, 4.022F, -7.4174F);
        this.chest.addChild(Front_r6);
        this.setRotateAngle(Front_r6, 1.7928F, 0.0105F, -0.1868F);
        this.Front_r6.cubeList.add(new ModelBox(Front_r6, 49, 26, 0.8762F, -1.8912F, -7.3264F, 1, 4, 7, -0.005F, false));

        this.Front_r7 = new ModelRenderer(this);
        this.Front_r7.setRotationPoint(3.3F, 3.022F, -7.4174F);
        this.chest.addChild(Front_r7);
        this.setRotateAngle(Front_r7, 1.531F, 0.0105F, -0.1868F);
        this.Front_r7.cubeList.add(new ModelBox(Front_r7, 60, 54, 0.6905F, -1.854F, -7.3083F, 1, 4, 6, -0.001F, false));

        this.Front_r8 = new ModelRenderer(this);
        this.Front_r8.setRotationPoint(0.0F, 10.3153F, -8.9971F);
        this.chest.addChild(Front_r8);
        this.setRotateAngle(Front_r8, 1.2032F, 0.372F, 0.6086F);
        this.Front_r8.cubeList.add(new ModelBox(Front_r8, 0, 0, 3.644F, -1.0293F, -1.5305F, 1, 5, 6, -0.001F, false));

        this.Front_r9 = new ModelRenderer(this);
        this.Front_r9.setRotationPoint(3.0F, 15.3153F, -8.0971F);
        this.chest.addChild(Front_r9);
        this.setRotateAngle(Front_r9, 0.0F, 0.0F, -1.0908F);
        this.Front_r9.cubeList.add(new ModelBox(Front_r9, 29, 56, 0.0F, -0.5969F, 0.0775F, 3, 1, 6, -0.001F, false));

        this.Front_r10 = new ModelRenderer(this);
        this.Front_r10.setRotationPoint(0.0F, 10.3153F, -8.9971F);
        this.chest.addChild(Front_r10);
        this.setRotateAngle(Front_r10, -0.5672F, 0.0F, 0.0F);
        this.Front_r10.cubeList.add(new ModelBox(Front_r10, 41, 41, -3.0F, 3.1365F, -1.4769F, 6, 1, 5, -0.001F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.7819F, -9.4974F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2007F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 19, -1.0F, -0.5649F, -0.7235F, 2, 2, 11, 0.0F, false));

        this.Neck_r47 = new ModelRenderer(this);
        this.Neck_r47.setRotationPoint(1.0F, 1.0081F, -2.4525F);
        this.chest.addChild(Neck_r47);
        this.setRotateAngle(Neck_r47, 0.4115F, 0.1483F, -0.2277F);
        this.Neck_r47.cubeList.add(new ModelBox(Neck_r47, 15, 84, 2.9094F, 2.3099F, -0.8866F, 0, 11, 1, 0.0F, false));

        this.Neck_r48 = new ModelRenderer(this);
        this.Neck_r48.setRotationPoint(1.0F, 1.0081F, -2.4525F);
        this.chest.addChild(Neck_r48);
        this.setRotateAngle(Neck_r48, 0.1425F, 0.3869F, -1.1013F);
        this.Neck_r48.cubeList.add(new ModelBox(Neck_r48, 19, 19, 0.0669F, -0.2297F, -0.8636F, 0, 4, 1, 0.0F, false));

        this.Neck_r49 = new ModelRenderer(this);
        this.Neck_r49.setRotationPoint(1.0F, 1.3505F, -4.5627F);
        this.chest.addChild(Neck_r49);
        this.setRotateAngle(Neck_r49, 0.4824F, 0.0749F, -0.2221F);
        this.Neck_r49.cubeList.add(new ModelBox(Neck_r49, 18, 84, 2.8915F, 2.4002F, -0.799F, 0, 10, 1, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0509F, -7.3259F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 43, 30, 0.0F, -2.2203F, 5.8815F, 0, 2, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 53, 29, 0.0F, -1.8203F, 3.8815F, 0, 2, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 27, 58, 0.0F, -1.4203F, 1.8815F, 0, 2, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 58, 0.0F, -1.1203F, -0.1185F, 0, 2, 1, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.5F, -13.6F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 59, 29, 0.0F, -2.3904F, 3.6239F, 0, 2, 1, 0.0F, false));

        this.Neck_r50 = new ModelRenderer(this);
        this.Neck_r50.setRotationPoint(1.0F, 1.3505F, -4.5627F);
        this.chest.addChild(Neck_r50);
        this.setRotateAngle(Neck_r50, 0.2523F, 0.3921F, -1.0619F);
        this.Neck_r50.cubeList.add(new ModelBox(Neck_r50, 16, 19, -0.0116F, -0.1863F, -0.7737F, 0, 4, 1, 0.0F, false));

        this.Neck_r51 = new ModelRenderer(this);
        this.Neck_r51.setRotationPoint(1.0F, 0.3241F, -0.5731F);
        this.chest.addChild(Neck_r51);
        this.setRotateAngle(Neck_r51, 0.0666F, 0.3382F, -1.1641F);
        this.Neck_r51.cubeList.add(new ModelBox(Neck_r51, 24, 0, -0.0374F, -0.1841F, -0.8699F, 0, 4, 1, 0.0F, false));

        this.Neck_r52 = new ModelRenderer(this);
        this.Neck_r52.setRotationPoint(1.0F, 0.3241F, -0.5731F);
        this.chest.addChild(Neck_r52);
        this.setRotateAngle(Neck_r52, 0.3277F, 0.1721F, -0.2769F);
        this.Neck_r52.cubeList.add(new ModelBox(Neck_r52, 9, 83, 2.8772F, 2.4189F, -0.8958F, 0, 12, 1, 0.0F, false));

        this.Neck_r53 = new ModelRenderer(this);
        this.Neck_r53.setRotationPoint(1.0F, 1.9661F, -6.2541F);
        this.chest.addChild(Neck_r53);
        this.setRotateAngle(Neck_r53, 0.2805F, 0.4376F, -0.9196F);
        this.Neck_r53.cubeList.add(new ModelBox(Neck_r53, 21, 0, 0.0418F, -0.2014F, -0.968F, 0, 4, 1, 0.0F, false));

        this.Neck_r54 = new ModelRenderer(this);
        this.Neck_r54.setRotationPoint(1.0F, 1.9661F, -6.2541F);
        this.chest.addChild(Neck_r54);
        this.setRotateAngle(Neck_r54, 0.5336F, 0.0863F, -0.087F);
        this.Neck_r54.cubeList.add(new ModelBox(Neck_r54, 61, 84, 2.9155F, 2.3448F, -0.9919F, 0, 9, 1, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(6.0F, 11.5F, -5.6F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0F, -0.6545F, 0.48F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 43, 60, 6.6249F, -1.9235F, -2.4932F, 3, 3, 5, 0.0F, false));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 59, 43, 0.6249F, -1.9235F, -2.4932F, 3, 3, 5, 0.0F, false));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 75, 57, 3.6249F, -1.9235F, -1.4932F, 3, 3, 3, 0.0F, false));

        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(8.6249F, 0.0765F, 0.5068F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.5444F, -0.2635F, 0.8472F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 69, 9, 1.0F, 0.7F, -0.6F, 7, 1, 2, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 48, 0.0F, -2.0F, -1.0F, 8, 2, 3, 0.0F, false));

        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(8.3F, 0.0F, 0.5F);
        this.leftArm2.addChild(leftArm3);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.7F, 0.0F, -1.4F);
        this.leftArm3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.9599F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 51, 76, -0.5F, -2.4012F, -1.0985F, 2, 5, 3, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.7F, 0.0F, -0.5F);
        this.leftArm3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.1745F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 69, -0.2F, -3.0012F, -4.2985F, 2, 6, 4, 0.0F, false));

        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-6.0F, 11.5F, -5.6F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.5781F, 0.0648F, -0.5295F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 59, 20, -9.6249F, -1.9235F, -2.4932F, 3, 3, 5, 0.0F, false));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 12, 59, -3.6249F, -1.9235F, -2.4932F, 3, 3, 5, 0.0F, false));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 24, 74, -6.6249F, -1.9235F, -1.4932F, 3, 3, 3, 0.0F, false));

        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-8.6249F, 0.0765F, 0.5068F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.5194F, -0.1389F, -1.109F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 65, 65, -8.0F, 0.7F, -0.6F, 7, 1, 2, 0.0F, false));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 42, 0, -8.0F, -2.0F, -1.0F, 8, 2, 3, 0.0F, false));

        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-8.1F, 0.0F, 1.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.0225F, 0.897F, -0.2034F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.9F, 0.0F, -1.9F);
        this.rightArm3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.9599F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 73, -1.5F, -2.4012F, -1.0985F, 2, 5, 3, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.9F, 0.0F, -1.0F);
        this.rightArm3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.7854F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 56, 65, -1.0F, -3.0012F, -4.2985F, 2, 6, 4, 0.0F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.9F, -9.4F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2963F, 0.1508F, 0.0445F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.2399F, -4.3419F);
        this.neck1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0262F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 12, 69, -1.0F, -0.6215F, -0.5645F, 2, 2, 5, 0.003F, false));

        this.Neck_r55 = new ModelRenderer(this);
        this.Neck_r55.setRotationPoint(-1.0F, 0.4581F, -1.2404F);
        this.neck1.addChild(Neck_r55);
        this.setRotateAngle(Neck_r55, 0.6628F, -0.1055F, 0.1596F);
        this.Neck_r55.cubeList.add(new ModelBox(Neck_r55, 12, 0, -1.2399F, 3.1196F, 0.0711F, 0, 4, 1, 0.0F, true));

        this.Neck_r56 = new ModelRenderer(this);
        this.Neck_r56.setRotationPoint(-1.0F, 0.4581F, -1.2404F);
        this.neck1.addChild(Neck_r56);
        this.setRotateAngle(Neck_r56, 0.5624F, -0.3855F, 0.5633F);
        this.Neck_r56.cubeList.add(new ModelBox(Neck_r56, 76, 34, 0.4013F, 0.4111F, 0.0711F, 0, 3, 1, 0.0F, true));

        this.Neck_r57 = new ModelRenderer(this);
        this.Neck_r57.setRotationPoint(-1.0F, 0.6574F, -2.4895F);
        this.neck1.addChild(Neck_r57);
        this.setRotateAngle(Neck_r57, 0.559F, -0.0884F, 0.1697F);
        this.Neck_r57.cubeList.add(new ModelBox(Neck_r57, 12, 0, -1.3884F, 2.2945F, -0.5824F, 0, 4, 1, 0.0F, true));

        this.Neck_r58 = new ModelRenderer(this);
        this.Neck_r58.setRotationPoint(-1.0F, 0.6574F, -2.4895F);
        this.neck1.addChild(Neck_r58);
        this.setRotateAngle(Neck_r58, 0.4689F, -0.3281F, 0.596F);
        this.Neck_r58.cubeList.add(new ModelBox(Neck_r58, 76, 34, -0.1114F, -0.2522F, -0.5824F, 0, 3, 1, 0.0F, true));

        this.Neck_r59 = new ModelRenderer(this);
        this.Neck_r59.setRotationPoint(-1.0F, 0.6866F, -4.2781F);
        this.neck1.addChild(Neck_r59);
        this.setRotateAngle(Neck_r59, 0.6288F, -0.0931F, 0.0324F);
        this.Neck_r59.cubeList.add(new ModelBox(Neck_r59, 71, 20, -1.3998F, 2.2918F, -0.7001F, 0, 3, 1, 0.0F, true));

        this.Neck_r60 = new ModelRenderer(this);
        this.Neck_r60.setRotationPoint(-1.0F, 0.6866F, -4.2781F);
        this.neck1.addChild(Neck_r60);
        this.setRotateAngle(Neck_r60, 0.5344F, -0.3607F, 0.4429F);
        this.Neck_r60.cubeList.add(new ModelBox(Neck_r60, 62, 76, -0.1228F, -0.2493F, -0.7001F, 0, 3, 1, 0.0F, true));

        this.Neck_r61 = new ModelRenderer(this);
        this.Neck_r61.setRotationPoint(1.0F, 0.4581F, -1.2404F);
        this.neck1.addChild(Neck_r61);
        this.setRotateAngle(Neck_r61, 0.6628F, 0.1055F, -0.1596F);
        this.Neck_r61.cubeList.add(new ModelBox(Neck_r61, 12, 0, 1.2399F, 3.1196F, 0.0711F, 0, 4, 1, 0.0F, false));

        this.Neck_r62 = new ModelRenderer(this);
        this.Neck_r62.setRotationPoint(1.0F, 0.4581F, -1.2404F);
        this.neck1.addChild(Neck_r62);
        this.setRotateAngle(Neck_r62, 0.5624F, 0.3855F, -0.5633F);
        this.Neck_r62.cubeList.add(new ModelBox(Neck_r62, 76, 34, -0.4013F, 0.4111F, 0.0711F, 0, 3, 1, 0.0F, false));

        this.Neck_r63 = new ModelRenderer(this);
        this.Neck_r63.setRotationPoint(1.0F, 0.6574F, -2.4895F);
        this.neck1.addChild(Neck_r63);
        this.setRotateAngle(Neck_r63, 0.559F, 0.0884F, -0.1697F);
        this.Neck_r63.cubeList.add(new ModelBox(Neck_r63, 12, 0, 1.3884F, 2.2945F, -0.5824F, 0, 4, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.2399F, -4.2419F);
        this.neck1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 59, 52, 0.0F, -2.1904F, 1.6239F, 0, 2, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 62, 52, 0.0F, -1.9904F, -0.3761F, 0, 2, 1, 0.0F, false));

        this.Neck_r64 = new ModelRenderer(this);
        this.Neck_r64.setRotationPoint(1.0F, 0.6574F, -2.4895F);
        this.neck1.addChild(Neck_r64);
        this.setRotateAngle(Neck_r64, 0.4689F, 0.3281F, -0.596F);
        this.Neck_r64.cubeList.add(new ModelBox(Neck_r64, 76, 34, 0.1114F, -0.2522F, -0.5824F, 0, 3, 1, 0.0F, false));

        this.Neck_r65 = new ModelRenderer(this);
        this.Neck_r65.setRotationPoint(1.0F, 0.6866F, -4.2781F);
        this.neck1.addChild(Neck_r65);
        this.setRotateAngle(Neck_r65, 0.6288F, 0.0931F, -0.0324F);
        this.Neck_r65.cubeList.add(new ModelBox(Neck_r65, 71, 20, 1.3998F, 2.2918F, -0.7001F, 0, 3, 1, 0.0F, false));

        this.Neck_r66 = new ModelRenderer(this);
        this.Neck_r66.setRotationPoint(1.0F, 0.6866F, -4.2781F);
        this.neck1.addChild(Neck_r66);
        this.setRotateAngle(Neck_r66, 0.5344F, 0.3607F, -0.4429F);
        this.Neck_r66.cubeList.add(new ModelBox(Neck_r66, 62, 76, 0.1228F, -0.2493F, -0.7001F, 0, 3, 1, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.2601F, -4.7419F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.3079F, 0.1248F, 0.0396F);


        this.Neck_r67 = new ModelRenderer(this);
        this.Neck_r67.setRotationPoint(-1.0F, 0.0122F, -1.5557F);
        this.neck2.addChild(Neck_r67);
        this.setRotateAngle(Neck_r67, 0.5331F, -0.0839F, -0.1335F);
        this.Neck_r67.cubeList.add(new ModelBox(Neck_r67, 62, 29, -1.3677F, 2.4413F, -0.1131F, 0, 2, 1, 0.0F, true));

        this.Neck_r68 = new ModelRenderer(this);
        this.Neck_r68.setRotationPoint(-1.0F, 0.0122F, -1.5557F);
        this.neck2.addChild(Neck_r68);
        this.setRotateAngle(Neck_r68, 0.4462F, -0.3133F, 0.2977F);
        this.Neck_r68.cubeList.add(new ModelBox(Neck_r68, 70, 84, -0.0253F, -0.1316F, -0.1131F, 0, 3, 1, 0.0F, true));

        this.Neck_r69 = new ModelRenderer(this);
        this.Neck_r69.setRotationPoint(1.0F, 0.0122F, -1.5557F);
        this.neck2.addChild(Neck_r69);
        this.setRotateAngle(Neck_r69, 0.4462F, 0.3133F, -0.2977F);
        this.Neck_r69.cubeList.add(new ModelBox(Neck_r69, 70, 84, 0.0542F, -0.1284F, -0.311F, 0, 3, 1, 0.0F, false));

        this.Neck_r70 = new ModelRenderer(this);
        this.Neck_r70.setRotationPoint(1.0F, 0.0122F, -1.5557F);
        this.neck2.addChild(Neck_r70);
        this.setRotateAngle(Neck_r70, 0.5331F, 0.0839F, 0.1335F);
        this.Neck_r70.cubeList.add(new ModelBox(Neck_r70, 62, 29, 1.3948F, 2.4308F, -0.311F, 0, 2, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.neck2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 0.0F, -2.0904F, -3.3761F, 0, 2, 2, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 62, 77, -1.0F, -0.5904F, -4.3761F, 2, 2, 4, -0.003F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.8F, -3.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.1772F, 0.1719F, 0.0306F);
        this.head.cubeList.add(new ModelBox(head, 21, 0, -4.0F, -3.7488F, -5.6585F, 7, 6, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 69, 52, -2.9F, -1.6488F, -5.5585F, 6, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 69, 52, -4.1F, -1.6488F, -5.5585F, 6, 2, 2, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 57, 14, -4.0F, 2.2612F, -2.6585F, 7, 2, 3, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 43, 26, -2.5F, 0.2612F, -9.6585F, 4, 2, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 40, -3.5F, 0.2612F, -8.6585F, 6, 2, 5, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.2612F, -9.6585F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.9163F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 12, -3.0F, 3.0F, 2.0F, 5, 1, 1, -0.005F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 69, 29, -3.0F, 2.0F, 1.0F, 5, 1, 3, -0.002F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -3.9342F, 0.0603F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -2.0595F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 21, 28, -3.0F, -1.6046F, -2.6988F, 6, 4, 6, 0.004F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -3.7388F, -3.0585F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.9512F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 36, 15, -3.5F, -3.9853F, -1.7018F, 6, 6, 4, 0.001F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 0.2612F, -9.6585F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.8178F, -0.2124F, -0.2212F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 64, -0.7F, 0.0F, 0.2F, 2, 2, 6, -0.009F, true));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.2612F, -9.6585F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.8178F, 0.2124F, 0.2212F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 64, -1.3F, 0.0F, 0.2F, 2, 2, 6, -0.009F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.2612F, -9.6585F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.7941F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 64, 0, -1.5F, 0.0F, 0.0F, 2, 2, 6, -0.004F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.2612F, -2.6585F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6545F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 36, 2.0F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 36, -4.0F, 0.0F, -3.0F, 1, 2, 3, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 41, -2.0F, 0.0F, -7.0F, 3, 2, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 83, 13, 1.0F, 0.0F, -6.0F, 1, 2, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 83, 13, -3.0F, 0.0F, -6.0F, 1, 2, 3, 0.0F, true));

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
