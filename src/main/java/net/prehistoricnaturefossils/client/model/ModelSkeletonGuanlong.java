package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGuanlong extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Bodyfront_r2;
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
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodyfront_r3;
    private final ModelRenderer Bodyfront_r4;
    private final ModelRenderer Bodyfront_r5;
    private final ModelRenderer Bodyfront_r6;
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
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodyfront;
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
    private final ModelRenderer Bodyfront_r7;
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
    private final ModelRenderer Neckbase;
    private final ModelRenderer Neckfront_r1;
    private final ModelRenderer Neckfront_r2;
    private final ModelRenderer Neckbase_r1;
    private final ModelRenderer Neckmiddle;
    private final ModelRenderer Neckfront_r3;
    private final ModelRenderer Neckfront_r4;
    private final ModelRenderer Neckfront_r5;
    private final ModelRenderer Neckfront_r6;
    private final ModelRenderer Neckmiddle_r1;
    private final ModelRenderer Neckfront;
    private final ModelRenderer Neckfront_r7;
    private final ModelRenderer Neckfront_r8;
    private final ModelRenderer Neckfront_r9;
    private final ModelRenderer Head;
    private final ModelRenderer Head_r1;
    private final ModelRenderer Head_r2;
    private final ModelRenderer Head_r3;
    private final ModelRenderer Head_r4;
    private final ModelRenderer Head_r5;
    private final ModelRenderer Head_r6;
    private final ModelRenderer Head_r7;
    private final ModelRenderer Upperjawbase;
    private final ModelRenderer Upperjawbase_r1;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Upperjawfront_r1;
    private final ModelRenderer Upperjawfront_r2;
    private final ModelRenderer Headcrest;
    private final ModelRenderer Headcrest_r1;
    private final ModelRenderer Leftupperfrontteeth;
    private final ModelRenderer Upperbackteeth;
    private final ModelRenderer Upperbackteeth_r1;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawback_r1;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawmiddle_r1;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerjawmiddleslope;
    private final ModelRenderer Rightlowerteeth;
    private final ModelRenderer Leftlowerteeth;
    private final ModelRenderer Lowerjawchinslope;
    private final ModelRenderer Lowerjawchinslope_r1;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Lefthand;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Righthand;
    private final ModelRenderer Belly;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailbase_r1;
    private final ModelRenderer Tailbase_r2;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailbase_r3;
    private final ModelRenderer Tailbase_r4;
    private final ModelRenderer Tailmiddlebase_r1;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailmiddleend_r1;
    private final ModelRenderer Tailend;
    private final ModelRenderer Tailend_r1;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightthigh_r1;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Rightankle;
    private final ModelRenderer Rightfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftthigh_r1;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Leftankle;
    private final ModelRenderer Leftfoot;

    public ModelSkeletonGuanlong() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 3.8F, -0.5F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.2806F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 32, -0.5F, -0.6941F, -3.8944F, 1, 1, 8, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.2789F, -2.6758F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2101F, -0.0093F, -0.819F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 24, -2.9692F, -0.4269F, -0.2865F, 2, 0, 1, 0.0F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.2789F, -2.6758F);
        this.Hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1912F, 0.0882F, -0.3484F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 22, -1.0568F, 0.0688F, -0.2865F, 1, 0, 1, 0.0F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -0.2789F, -2.6758F);
        this.Hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2101F, 0.0093F, 0.819F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 24, 0.9692F, -0.4269F, -0.2865F, 2, 0, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.2789F, -2.6758F);
        this.Hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1912F, -0.0882F, 0.3484F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 22, 0.0568F, 0.0688F, -0.2865F, 1, 0, 1, 0.0F, false));

        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, -0.9102F, 0.1154F);
        this.Hips.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0087F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 18, 0, 0.0F, -0.9F, -3.0F, 0, 2, 5, 0.0F, false));

        this.Bodyfront_r2 = new ModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(0.0F, -0.6344F, -2.7783F);
        this.Hips.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, 0.0262F, 0.0F, 0.0F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 0, 0, 0.0F, -1.0F, 5.9F, 0, 2, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0202F, 2.2293F, -0.6359F);
        this.Hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4661F, -0.0018F, 0.0403F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 43, -0.3989F, 4.0179F, -3.6434F, 1, 1, 4, 0.002F, true));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0202F, 2.2293F, -0.6359F);
        this.Hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0017F, 0.0425F, -0.329F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 5, -2.1278F, -0.6266F, -0.5551F, 1, 5, 1, -0.003F, true));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0202F, 2.2293F, -0.6359F);
        this.Hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.7455F, -0.0288F, -0.0976F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 31, -2.257F, -1.6908F, -0.253F, 1, 2, 2, -0.003F, true));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.9F, 1.6528F, 0.5477F);
        this.Hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.7486F, 0.0537F, -0.3132F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 52, -0.5F, 0.3357F, 0.3551F, 1, 5, 1, -0.003F, true));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.3941F, -3.4944F);
        this.Hips.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1222F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 14, -2.5F, -0.8818F, 4.2742F, 1, 1, 3, -0.008F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 47, 22, -2.5F, -1.3818F, 2.7742F, 1, 1, 3, -0.005F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 17, -2.5F, -0.6818F, 2.6742F, 1, 3, 3, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 39, -1.5F, -0.4818F, 2.2742F, 1, 1, 4, -0.003F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 47, 22, 1.5F, -1.3818F, 2.7742F, 1, 1, 3, -0.005F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 14, 1.5F, -0.8818F, 4.2742F, 1, 1, 3, -0.008F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 17, 1.5F, -0.6818F, 2.6742F, 1, 3, 3, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 39, 0.5F, -0.4818F, 2.2742F, 1, 1, 4, -0.003F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.8941F, 1.2056F);
        this.Hips.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3578F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 29, -2.5F, -0.0819F, 0.1047F, 1, 1, 3, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 29, 1.5F, -0.0819F, 0.1047F, 1, 1, 3, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.0F, -0.7512F, -0.7294F);
        this.Hips.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.143F, 0.216F, 0.0308F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 31, -0.5F, -1.1113F, -1.6922F, 1, 2, 2, -0.003F, true));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.4941F, -2.3944F);
        this.Hips.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0349F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 0, -2.5F, -0.356F, 1.7164F, 1, 1, 2, -0.003F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 0, 1.5F, -0.356F, 1.7164F, 1, 1, 2, -0.003F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(2.0F, -0.7512F, -0.7294F);
        this.Hips.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.143F, -0.216F, -0.0308F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 31, -0.5F, -1.1113F, -1.6922F, 1, 2, 2, -0.003F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.0202F, 2.2293F, -0.6359F);
        this.Hips.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7455F, 0.0288F, 0.0976F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 31, 1.257F, -1.6908F, -0.253F, 1, 2, 2, -0.003F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.0202F, 2.2293F, -0.6359F);
        this.Hips.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0017F, -0.0425F, 0.329F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 52, 5, 1.1278F, -0.6266F, -0.5551F, 1, 5, 1, -0.003F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.0202F, 2.2293F, -0.6359F);
        this.Hips.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.4661F, 0.0018F, -0.0403F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 43, -0.6011F, 4.0179F, -3.6434F, 1, 1, 4, 0.002F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(1.9F, 1.6528F, 0.5477F);
        this.Hips.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.7486F, -0.0537F, 0.3132F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 52, -0.5F, 0.3357F, 0.3551F, 1, 5, 1, -0.003F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.2941F, -3.5944F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0625F, 0.0435F, 0.0027F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 11, 31, -0.5F, -0.4184F, -4.7459F, 1, 1, 5, 0.003F, false));

        this.Bodyfront_r3 = new ModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(0.0F, -0.5806F, -1.22F);
        this.Bodymiddle.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, -0.0611F, 0.0F, 0.0F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 26, 59, 0.0F, -0.9F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Bodyfront_r4 = new ModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(0.0F, -0.6155F, -3.2197F);
        this.Bodymiddle.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, -0.0175F, 0.0F, 0.0F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 59, 28, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Bodyfront_r5 = new ModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(0.0F, -0.4632F, -5.1164F);
        this.Bodymiddle.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, 0.0262F, 0.0F, 0.0F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 29, 59, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Bodyfront_r6 = new ModelRenderer(this);
        this.Bodyfront_r6.setRotationPoint(0.0F, -0.6229F, -7.1325F);
        this.Bodymiddle.addChild(Bodyfront_r6);
        this.setRotateAngle(Bodyfront_r6, 0.0698F, 0.0F, 0.0F);
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 16, 60, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -0.0031F, -1.4273F);
        this.Bodymiddle.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1205F, 0.0862F, -0.8155F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 15, 24, -3.9692F, -0.4269F, -0.2865F, 3, 0, 1, 0.0F, true));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -0.0031F, -1.4273F);
        this.Bodymiddle.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0671F, 0.1321F, -0.3348F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 47, -1.0568F, 0.0688F, -0.2865F, 1, 0, 1, 0.0F, true));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -0.0031F, -3.4273F);
        this.Bodymiddle.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1165F, 0.1419F, -1.3326F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 38, -4.3579F, -1.8543F, -0.2865F, 2, 0, 1, 0.0F, true));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -0.0031F, -3.4273F);
        this.Bodymiddle.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0294F, 0.181F, -0.8034F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 22, 40, -2.9692F, -0.4269F, -0.2865F, 2, 0, 1, 0.0F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -0.0031F, -3.4273F);
        this.Bodymiddle.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0584F, 0.1739F, -0.3156F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 37, 49, -1.0568F, 0.0688F, -0.2865F, 1, 0, 1, 0.0F, true));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, -0.0031F, -5.3273F);
        this.Bodymiddle.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1082F, 0.1758F, -1.3313F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 27, -5.3579F, -1.8543F, -0.2865F, 3, 0, 1, 0.0F, true));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -0.0031F, -5.3273F);
        this.Bodymiddle.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0047F, 0.2061F, -0.7986F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 40, 37, -2.9692F, -0.4269F, -0.2865F, 2, 0, 1, 0.0F, true));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -0.0031F, -5.3273F);
        this.Bodymiddle.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0921F, 0.1847F, -0.3096F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 51, 41, -1.0568F, 0.0688F, -0.2865F, 1, 0, 1, 0.0F, true));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.1969F, -7.0273F);
        this.Bodymiddle.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0868F, 0.2606F, -1.3266F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 18, 8, -6.2807F, -1.8292F, -0.5753F, 4, 0, 1, 0.0F, true));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 0.1969F, -7.0273F);
        this.Bodymiddle.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0584F, 0.2682F, -0.7838F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 10, 42, -2.8897F, -0.4438F, -0.5753F, 2, 0, 1, 0.0F, true));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 0.1969F, -7.0273F);
        this.Bodymiddle.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1771F, 0.2106F, -0.2929F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 58, 12, -0.9941F, 0.0172F, -0.5753F, 1, 0, 1, 0.0F, true));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, -0.0031F, -1.4273F);
        this.Bodymiddle.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0671F, -0.1321F, 0.3348F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 18, 47, 0.0568F, 0.0688F, -0.2865F, 1, 0, 1, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, -0.0031F, -1.4273F);
        this.Bodymiddle.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1205F, -0.0862F, 0.8155F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 15, 24, 0.9692F, -0.4269F, -0.2865F, 3, 0, 1, 0.0F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, -0.0031F, -3.4273F);
        this.Bodymiddle.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0584F, -0.1739F, 0.3156F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 37, 49, 0.0568F, 0.0688F, -0.2865F, 1, 0, 1, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, -0.0031F, -3.4273F);
        this.Bodymiddle.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1165F, -0.1419F, 1.3326F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 11, 38, 2.3579F, -1.8543F, -0.2865F, 2, 0, 1, 0.0F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, -0.0031F, -3.4273F);
        this.Bodymiddle.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0294F, -0.181F, 0.8034F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 22, 40, 0.9692F, -0.4269F, -0.2865F, 2, 0, 1, 0.0F, false));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, -0.0031F, -5.3273F);
        this.Bodymiddle.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1082F, -0.1758F, 1.3313F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 27, 2.3579F, -1.8543F, -0.2865F, 3, 0, 1, 0.0F, false));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, -0.0031F, -5.3273F);
        this.Bodymiddle.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0047F, -0.2061F, 0.7986F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 40, 37, 0.9692F, -0.4269F, -0.2865F, 2, 0, 1, 0.0F, false));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, -0.0031F, -5.3273F);
        this.Bodymiddle.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0921F, -0.1847F, 0.3096F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 51, 41, 0.0568F, 0.0688F, -0.2865F, 1, 0, 1, 0.0F, false));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, 0.1969F, -7.0273F);
        this.Bodymiddle.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0868F, -0.2606F, 1.3266F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 18, 8, 2.2807F, -1.8292F, -0.5753F, 4, 0, 1, 0.0F, false));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, 0.1969F, -7.0273F);
        this.Bodymiddle.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0584F, -0.2682F, 0.7838F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 10, 42, 0.8897F, -0.4438F, -0.5753F, 2, 0, 1, 0.0F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, 0.1969F, -7.0273F);
        this.Bodymiddle.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1771F, -0.2106F, 0.2929F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 58, 12, -0.0059F, 0.0172F, -0.5753F, 1, 0, 1, 0.0F, false));

        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, 0.2816F, -8.1459F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, 0.0698F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 48, 31, -0.5F, -0.5F, 0.5F, 1, 1, 3, 0.0F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.1816F, -7.6459F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0625F, 0.0F, 0.0F);


        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, 0.0951F, -1.6272F);
        this.Bodyfront.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.1942F, 0.2156F, -0.2893F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 58, 57, -1.0053F, -0.0457F, -0.3663F, 1, 0, 1, 0.0F, true));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, 0.0951F, -1.6272F);
        this.Bodyfront.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0713F, 0.2805F, -0.7803F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 47, 37, -2.8706F, -0.5047F, -0.3663F, 2, 0, 1, 0.0F, true));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, 0.0951F, -1.6272F);
        this.Bodyfront.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0824F, 0.2775F, -1.3255F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 18, 10, -6.2336F, -1.8724F, -0.3663F, 4, 0, 1, 0.0F, true));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5F, 0.1921F, -3.4483F);
        this.Bodyfront.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0479F, 0.4043F, -1.4186F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 35, 22, -5.2694F, -1.8434F, -0.5F, 3, 0, 1, 0.0F, true));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, 0.1921F, -3.4483F);
        this.Bodyfront.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.3237F, 0.2511F, -0.364F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 58, 20, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, 0.1921F, -3.4483F);
        this.Bodyfront.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.171F, 0.3711F, -0.853F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 47, 27, -2.887F, -0.4617F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5F, 0.1921F, -3.4483F);
        this.Bodyfront.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.3237F, -0.2511F, 0.364F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 58, 20, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(0.5F, 0.1921F, -3.4483F);
        this.Bodyfront.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.171F, -0.3711F, 0.853F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 47, 27, 0.887F, -0.4617F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(0.5F, 0.1921F, -3.4483F);
        this.Bodyfront.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0479F, -0.4043F, 1.4186F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 35, 22, 2.2694F, -1.8434F, -0.5F, 3, 0, 1, 0.0F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(0.5F, 0.0951F, -1.6272F);
        this.Bodyfront.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1942F, -0.2156F, 0.2893F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 58, 57, 0.0053F, -0.0457F, -0.3663F, 1, 0, 1, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(0.5F, 0.0951F, -1.6272F);
        this.Bodyfront.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0713F, -0.2805F, 0.7803F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 47, 37, 0.8706F, -0.5047F, -0.3663F, 2, 0, 1, 0.0F, false));

        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, 0.0951F, -1.6272F);
        this.Bodyfront.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.0824F, -0.2775F, 1.3255F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 18, 10, 2.2336F, -1.8724F, -0.3663F, 4, 0, 1, 0.0F, false));

        this.Bodyfront_r7 = new ModelRenderer(this);
        this.Bodyfront_r7.setRotationPoint(0.0F, 0.2034F, -3.9364F);
        this.Bodyfront.addChild(Bodyfront_r7);
        this.setRotateAngle(Bodyfront_r7, -0.0175F, 0.0F, 0.0F);
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 60, 22, 0.0F, -1.0832F, -0.0048F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 32, 60, 0.0F, -1.2832F, 1.9952F, 0, 1, 1, 0.0F, false));
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 45, 8, -0.5F, -0.6832F, -0.0048F, 1, 1, 4, 0.003F, false));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 5.3618F, -1.2904F);
        this.Bodyfront.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.2618F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 22, 42, -2.3F, -0.5F, -1.3F, 1, 1, 1, -0.005F, true));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 22, 42, 1.3F, -0.5F, -1.3F, 1, 1, 1, -0.005F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(-1.8F, 5.2966F, -1.7266F);
        this.Bodyfront.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.1049F, -0.5501F, -0.2581F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 40, 31, -0.5F, 0.0203F, 0.0975F, 1, 0, 5, 0.0F, true));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(-1.8F, 5.2966F, -1.7266F);
        this.Bodyfront.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.363F, -0.7424F, -0.3751F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 30, 34, -0.5F, 0.0203F, 0.0975F, 1, 0, 3, 0.0F, true));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(-4.0422F, 4.1566F, -3.4337F);
        this.Bodyfront.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.9472F, -0.1958F, 0.2426F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 33, 8, -0.0661F, -1.4404F, -0.4978F, 3, 2, 1, 0.0F, true));

        this.cube_r56 = new ModelRenderer(this);
        this.cube_r56.setRotationPoint(-3.5F, 2.6523F, -3.0483F);
        this.Bodyfront.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.9632F, -0.2462F, 0.1696F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 10, 9, -0.4321F, -0.7924F, -0.9647F, 1, 2, 1, 0.0F, true));

        this.cube_r57 = new ModelRenderer(this);
        this.cube_r57.setRotationPoint(-3.0F, 0.9523F, -1.3483F);
        this.Bodyfront.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.9296F, -0.1131F, 0.3566F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 39, 24, -0.5F, -0.5F, -2.5F, 1, 1, 5, 0.0F, true));

        this.cube_r58 = new ModelRenderer(this);
        this.cube_r58.setRotationPoint(3.0F, 0.9523F, -1.3483F);
        this.Bodyfront.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.9296F, 0.1131F, -0.3566F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 39, 24, -0.5F, -0.5F, -2.5F, 1, 1, 5, 0.0F, false));

        this.cube_r59 = new ModelRenderer(this);
        this.cube_r59.setRotationPoint(4.0422F, 4.1566F, -3.4337F);
        this.Bodyfront.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.9472F, 0.1958F, -0.2426F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 33, 8, -2.9339F, -1.4404F, -0.4978F, 3, 2, 1, 0.0F, false));

        this.cube_r60 = new ModelRenderer(this);
        this.cube_r60.setRotationPoint(3.5F, 2.6523F, -3.0483F);
        this.Bodyfront.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.9632F, 0.2462F, -0.1696F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 10, 9, -0.5679F, -0.7924F, -0.9647F, 1, 2, 1, 0.0F, false));

        this.cube_r61 = new ModelRenderer(this);
        this.cube_r61.setRotationPoint(1.8F, 5.2966F, -1.7266F);
        this.Bodyfront.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.363F, 0.7424F, 0.3751F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 30, 34, -0.5F, 0.0203F, 0.0975F, 1, 0, 3, 0.0F, false));

        this.cube_r62 = new ModelRenderer(this);
        this.cube_r62.setRotationPoint(1.8F, 5.2966F, -1.7266F);
        this.Bodyfront.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.1049F, 0.5501F, 0.2581F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 40, 31, -0.5F, 0.0203F, 0.0975F, 1, 0, 5, 0.0F, false));

        this.Neckbase = new ModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, -0.0966F, -3.6864F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.8345F, -0.1524F, 0.0387F);


        this.Neckfront_r1 = new ModelRenderer(this);
        this.Neckfront_r1.setRotationPoint(-0.5F, 0.5086F, -1.7068F);
        this.Neckbase.addChild(Neckfront_r1);
        this.setRotateAngle(Neckfront_r1, -0.4399F, -0.4485F, 0.1742F);
        this.Neckfront_r1.cubeList.add(new ModelBox(Neckfront_r1, 52, 53, -0.0493F, -0.5121F, -0.145F, 0, 1, 3, 0.0F, true));

        this.Neckfront_r2 = new ModelRenderer(this);
        this.Neckfront_r2.setRotationPoint(0.5F, 0.5086F, -1.7068F);
        this.Neckbase.addChild(Neckfront_r2);
        this.setRotateAngle(Neckfront_r2, -0.4399F, 0.4485F, -0.1742F);
        this.Neckfront_r2.cubeList.add(new ModelBox(Neckfront_r2, 52, 53, 0.0493F, -0.5121F, -0.145F, 0, 1, 3, 0.0F, false));

        this.Neckbase_r1 = new ModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(0.0F, -0.2761F, -2.9929F);
        this.Neckbase.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, -0.0698F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 31, 49, -0.5F, -0.2092F, 0.1184F, 1, 1, 3, 0.0F, false));

        this.Neckmiddle = new ModelRenderer(this);
        this.Neckmiddle.setRotationPoint(0.0F, -0.1761F, -2.7929F);
        this.Neckbase.addChild(Neckmiddle);
        this.setRotateAngle(Neckmiddle, -0.7951F, -0.0006F, -0.0617F);


        this.Neckfront_r3 = new ModelRenderer(this);
        this.Neckfront_r3.setRotationPoint(-0.5F, 0.8587F, -0.2832F);
        this.Neckmiddle.addChild(Neckfront_r3);
        this.setRotateAngle(Neckfront_r3, -0.1831F, -0.2013F, 0.0846F);
        this.Neckfront_r3.cubeList.add(new ModelBox(Neckfront_r3, 7, 17, -0.0354F, -0.5905F, -0.1497F, 0, 1, 2, 0.0F, true));

        this.Neckfront_r4 = new ModelRenderer(this);
        this.Neckfront_r4.setRotationPoint(-0.5F, 0.9294F, -4.4552F);
        this.Neckmiddle.addChild(Neckfront_r4);
        this.setRotateAngle(Neckfront_r4, -0.1831F, -0.2013F, 0.0846F);
        this.Neckfront_r4.cubeList.add(new ModelBox(Neckfront_r4, 7, 17, 0.3971F, -1.051F, 1.9505F, 0, 1, 2, 0.0F, true));
        this.Neckfront_r4.cubeList.add(new ModelBox(Neckfront_r4, 11, 31, -0.0154F, -0.5336F, -0.0699F, 0, 1, 2, 0.0F, true));

        this.Neckfront_r5 = new ModelRenderer(this);
        this.Neckfront_r5.setRotationPoint(0.5F, 0.8587F, -0.2832F);
        this.Neckmiddle.addChild(Neckfront_r5);
        this.setRotateAngle(Neckfront_r5, -0.1831F, 0.2013F, -0.0846F);
        this.Neckfront_r5.cubeList.add(new ModelBox(Neckfront_r5, 7, 17, 0.0354F, -0.5905F, -0.1497F, 0, 1, 2, 0.0F, false));

        this.Neckfront_r6 = new ModelRenderer(this);
        this.Neckfront_r6.setRotationPoint(0.5F, 0.9294F, -4.4552F);
        this.Neckmiddle.addChild(Neckfront_r6);
        this.setRotateAngle(Neckfront_r6, -0.1831F, 0.2013F, -0.0846F);
        this.Neckfront_r6.cubeList.add(new ModelBox(Neckfront_r6, 7, 17, -0.3971F, -1.051F, 1.9505F, 0, 1, 2, 0.0F, false));
        this.Neckfront_r6.cubeList.add(new ModelBox(Neckfront_r6, 11, 31, 0.0154F, -0.5336F, -0.0699F, 0, 1, 2, 0.0F, false));

        this.Neckmiddle_r1 = new ModelRenderer(this);
        this.Neckmiddle_r1.setRotationPoint(0.5F, 0.6364F, 0.0439F);
        this.Neckmiddle.addChild(Neckmiddle_r1);
        this.setRotateAngle(Neckmiddle_r1, 0.0524F, 0.0F, 0.0F);
        this.Neckmiddle_r1.cubeList.add(new ModelBox(Neckmiddle_r1, 14, 40, -1.0F, -0.9116F, -4.8856F, 1, 1, 5, 0.003F, false));

        this.Neckfront = new ModelRenderer(this);
        this.Neckfront.setRotationPoint(-0.01F, 0.4364F, -4.8061F);
        this.Neckmiddle.addChild(Neckfront);
        this.setRotateAngle(Neckfront, 0.5365F, 0.1361F, -0.2243F);


        this.Neckfront_r7 = new ModelRenderer(this);
        this.Neckfront_r7.setRotationPoint(-0.49F, 0.5F, -1.8118F);
        this.Neckfront.addChild(Neckfront_r7);
        this.setRotateAngle(Neckfront_r7, -0.4013F, -0.2013F, 0.0846F);
        this.Neckfront_r7.cubeList.add(new ModelBox(Neckfront_r7, 60, 44, 0.0F, -0.6218F, 0.1995F, 0, 1, 1, 0.0F, true));

        this.Neckfront_r8 = new ModelRenderer(this);
        this.Neckfront_r8.setRotationPoint(0.51F, 0.5F, -1.8118F);
        this.Neckfront.addChild(Neckfront_r8);
        this.setRotateAngle(Neckfront_r8, -0.4013F, 0.2013F, -0.0846F);
        this.Neckfront_r8.cubeList.add(new ModelBox(Neckfront_r8, 60, 44, 0.0F, -0.6218F, 0.1995F, 0, 1, 1, 0.0F, false));

        this.Neckfront_r9 = new ModelRenderer(this);
        this.Neckfront_r9.setRotationPoint(0.0F, -0.3515F, -2.4757F);
        this.Neckfront.addChild(Neckfront_r9);
        this.setRotateAngle(Neckfront_r9, -0.0436F, 0.0F, 0.0F);
        this.Neckfront_r9.cubeList.add(new ModelBox(Neckfront_r9, 51, 36, -0.49F, -0.2F, -0.3F, 1, 1, 3, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.2485F, -2.7757F);
        this.Neckfront.addChild(Head);
        this.setRotateAngle(Head, 0.8439F, -0.0326F, 0.029F);


        this.Head_r1 = new ModelRenderer(this);
        this.Head_r1.setRotationPoint(0.0F, 1.088F, -1.876F);
        this.Head.addChild(Head_r1);
        this.setRotateAngle(Head_r1, 0.096F, 0.0F, 0.0F);
        this.Head_r1.cubeList.add(new ModelBox(Head_r1, 0, 10, -1.49F, -0.956F, -0.1706F, 3, 1, 3, -0.005F, false));

        this.Head_r2 = new ModelRenderer(this);
        this.Head_r2.setRotationPoint(-0.72F, -0.1253F, -2.2794F);
        this.Head.addChild(Head_r2);
        this.setRotateAngle(Head_r2, -1.0908F, 0.0F, 0.0F);
        this.Head_r2.cubeList.add(new ModelBox(Head_r2, 18, 0, -0.5F, 0.1122F, -0.5314F, 1, 3, 1, -0.22F, true));
        this.Head_r2.cubeList.add(new ModelBox(Head_r2, 18, 0, 0.96F, 0.1122F, -0.5314F, 1, 3, 1, -0.22F, false));

        this.Head_r3 = new ModelRenderer(this);
        this.Head_r3.setRotationPoint(-0.72F, 0.3747F, -3.3794F);
        this.Head.addChild(Head_r3);
        this.setRotateAngle(Head_r3, -1.1781F, 0.0F, 0.0F);
        this.Head_r3.cubeList.add(new ModelBox(Head_r3, 24, 0, -0.5F, -1.108F, -0.0376F, 1, 3, 1, -0.2F, true));
        this.Head_r3.cubeList.add(new ModelBox(Head_r3, 24, 0, 0.96F, -1.108F, -0.0376F, 1, 3, 1, -0.2F, false));

        this.Head_r4 = new ModelRenderer(this);
        this.Head_r4.setRotationPoint(-1.13F, -0.3581F, -1.1443F);
        this.Head.addChild(Head_r4);
        this.setRotateAngle(Head_r4, 0.3491F, 0.0F, 0.0F);
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 43, 51, -0.09F, 0.0872F, -4.9796F, 1, 1, 1, -0.2F, true));
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 43, 51, 1.37F, 0.0872F, -4.9796F, 1, 1, 1, -0.2F, false));
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 58, 25, -0.4F, -0.5F, -0.8F, 1, 1, 1, 0.0F, true));
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 43, 51, -0.61F, -0.5F, -0.8F, 1, 1, 1, -0.2F, true));
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 43, 51, 1.89F, -0.5F, -0.8F, 1, 1, 1, -0.2F, false));
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 58, 25, 1.68F, -0.5F, -0.8F, 1, 1, 1, 0.0F, false));

        this.Head_r5 = new ModelRenderer(this);
        this.Head_r5.setRotationPoint(-1.22F, 0.1066F, 0.347F);
        this.Head.addChild(Head_r5);
        this.setRotateAngle(Head_r5, 0.1745F, 0.0F, 0.0F);
        this.Head_r5.cubeList.add(new ModelBox(Head_r5, 40, 31, -0.5F, -1.1826F, -0.6015F, 1, 2, 1, -0.2F, true));

        this.Head_r6 = new ModelRenderer(this);
        this.Head_r6.setRotationPoint(1.24F, 0.1066F, 0.347F);
        this.Head.addChild(Head_r6);
        this.setRotateAngle(Head_r6, 0.1745F, 0.0F, 0.0F);
        this.Head_r6.cubeList.add(new ModelBox(Head_r6, 40, 31, -0.5F, -1.1826F, -0.6015F, 1, 2, 1, -0.2F, false));

        this.Head_r7 = new ModelRenderer(this);
        this.Head_r7.setRotationPoint(0.0F, -0.612F, -2.776F);
        this.Head.addChild(Head_r7);
        this.setRotateAngle(Head_r7, 0.3578F, 0.0F, 0.0F);
        this.Head_r7.cubeList.add(new ModelBox(Head_r7, 0, 42, -1.49F, -0.041F, 0.1103F, 3, 2, 3, 0.0F, false));

        this.Upperjawbase = new ModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, -1.342F, -2.576F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.4245F, 0.0F, 0.0F);


        this.Upperjawbase_r1 = new ModelRenderer(this);
        this.Upperjawbase_r1.setRotationPoint(0.0F, 2.1F, -4.0F);
        this.Upperjawbase.addChild(Upperjawbase_r1);
        this.setRotateAngle(Upperjawbase_r1, -0.0698F, 0.0F, 0.0F);
        this.Upperjawbase_r1.cubeList.add(new ModelBox(Upperjawbase_r1, 57, 32, -0.5F, -0.9F, -2.0F, 1, 1, 2, 0.01F, false));
        this.Upperjawbase_r1.cubeList.add(new ModelBox(Upperjawbase_r1, 10, 47, -0.99F, -1.8F, 0.6F, 2, 1, 3, 0.002F, false));
        this.Upperjawbase_r1.cubeList.add(new ModelBox(Upperjawbase_r1, 23, 43, -0.99F, -0.9F, 0.0F, 2, 1, 4, 0.0F, false));

        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, -0.2F, -4.1F);
        this.Upperjawbase.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.0424F, 0.0F, 0.0F);


        this.Upperjawfront_r1 = new ModelRenderer(this);
        this.Upperjawfront_r1.setRotationPoint(0.0F, 0.6F, -1.0F);
        this.Upperjawfront.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, 0.2793F, 0.0F, 0.0F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 54, 58, -0.5F, -0.0288F, -0.9835F, 1, 1, 1, -0.002F, false));

        this.Upperjawfront_r2 = new ModelRenderer(this);
        this.Upperjawfront_r2.setRotationPoint(0.0F, 1.0F, 3.7F);
        this.Upperjawfront.addChild(Upperjawfront_r2);
        this.setRotateAngle(Upperjawfront_r2, -0.0698F, 0.0F, 0.0F);
        this.Upperjawfront_r2.cubeList.add(new ModelBox(Upperjawfront_r2, 57, 51, -0.5F, -0.1F, -4.7F, 1, 1, 2, 0.0F, false));

        this.Headcrest = new ModelRenderer(this);
        this.Headcrest.setRotationPoint(0.0F, -0.2F, -1.75F);
        this.Upperjawfront.addChild(Headcrest);
        this.setRotateAngle(Headcrest, 0.1285F, 0.0F, 0.0F);


        this.Headcrest_r1 = new ModelRenderer(this);
        this.Headcrest_r1.setRotationPoint(0.0F, 0.9F, 0.0F);
        this.Headcrest.addChild(Headcrest_r1);
        this.setRotateAngle(Headcrest_r1, -0.0436F, 0.0F, 0.0F);
        this.Headcrest_r1.cubeList.add(new ModelBox(Headcrest_r1, 31, 32, 0.0F, -1.6F, 0.0F, 0, 3, 8, 0.0F, false));

        this.Leftupperfrontteeth = new ModelRenderer(this);
        this.Leftupperfrontteeth.setRotationPoint(0.35F, 1.8F, -1.85F);
        this.Upperjawfront.addChild(Leftupperfrontteeth);
        this.setRotateAngle(Leftupperfrontteeth, -0.1471F, 0.0424F, 0.0F);
        this.Leftupperfrontteeth.cubeList.add(new ModelBox(Leftupperfrontteeth, 18, 57, 0.0F, -0.3996F, -0.017F, 0, 1, 2, 0.0F, false));
        this.Leftupperfrontteeth.cubeList.add(new ModelBox(Leftupperfrontteeth, 18, 57, -0.68F, -0.3996F, -0.017F, 0, 1, 2, 0.0F, true));

        this.Upperbackteeth = new ModelRenderer(this);
        this.Upperbackteeth.setRotationPoint(0.0F, 1.7F, -4.0F);
        this.Upperjawbase.addChild(Upperbackteeth);
        this.setRotateAngle(Upperbackteeth, 0.1061F, 0.0F, 0.0F);


        this.Upperbackteeth_r1 = new ModelRenderer(this);
        this.Upperbackteeth_r1.setRotationPoint(0.0F, 0.3F, 0.5F);
        this.Upperbackteeth.addChild(Upperbackteeth_r1);
        this.setRotateAngle(Upperbackteeth_r1, -0.1222F, 0.0F, 0.0F);
        this.Upperbackteeth_r1.cubeList.add(new ModelBox(Upperbackteeth_r1, 46, 51, -0.5F, -0.5F, -0.5F, 1, 1, 3, 0.0F, false));

        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 0.888F, 0.324F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.7418F, 0.0F, 0.0F);
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 32, 43, 0.51F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 32, 43, -1.49F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.Lowerjawback_r1 = new ModelRenderer(this);
        this.Lowerjawback_r1.setRotationPoint(0.02F, 0.0F, -2.0F);
        this.Lowerjawback.addChild(Lowerjawback_r1);
        this.setRotateAngle(Lowerjawback_r1, 0.2967F, 0.0F, 0.0F);
        this.Lowerjawback_r1.cubeList.add(new ModelBox(Lowerjawback_r1, 58, 41, -1.51F, 0.0F, -1.0F, 1, 1, 1, -0.003F, true));
        this.Lowerjawback_r1.cubeList.add(new ModelBox(Lowerjawback_r1, 58, 41, 0.49F, 0.0F, -1.0F, 1, 1, 1, -0.003F, false));

        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.4245F, 0.0F, 0.0F);


        this.Lowerjawmiddle_r1 = new ModelRenderer(this);
        this.Lowerjawmiddle_r1.setRotationPoint(0.0F, 0.5F, -1.5F);
        this.Lowerjawmiddle.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, -0.2618F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 46, 0, -1.0F, -0.6F, -1.5F, 2, 1, 3, 0.0F, false));

        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.7F, -3.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.2728F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 57, 16, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.Lowerjawmiddleslope = new ModelRenderer(this);
        this.Lowerjawmiddleslope.setRotationPoint(0.01F, 0.1F, -3.0F);
        this.Lowerjawmiddle.addChild(Lowerjawmiddleslope);
        this.setRotateAngle(Lowerjawmiddleslope, -0.2335F, 0.0F, 0.0F);
        this.Lowerjawmiddleslope.cubeList.add(new ModelBox(Lowerjawmiddleslope, 44, 46, -1.0F, -0.4F, 0.0F, 2, 1, 3, 0.0F, false));

        this.Rightlowerteeth = new ModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(0.22F, 0.0F, -4.8F);
        this.Lowerjawmiddle.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, -0.2806F, 0.1061F, 0.0F);
        this.Rightlowerteeth.cubeList.add(new ModelBox(Rightlowerteeth, 54, 11, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.Leftlowerteeth = new ModelRenderer(this);
        this.Leftlowerteeth.setRotationPoint(-0.2F, 0.0F, -4.8F);
        this.Lowerjawmiddle.addChild(Leftlowerteeth);
        this.setRotateAngle(Leftlowerteeth, -0.2806F, -0.1061F, 0.0F);
        this.Leftlowerteeth.cubeList.add(new ModelBox(Leftlowerteeth, 54, 11, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.Lowerjawchinslope = new ModelRenderer(this);
        this.Lowerjawchinslope.setRotationPoint(-0.01F, 0.9F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawchinslope);
        this.setRotateAngle(Lowerjawchinslope, 0.2759F, 0.0F, 0.0F);


        this.Lowerjawchinslope_r1 = new ModelRenderer(this);
        this.Lowerjawchinslope_r1.setRotationPoint(0.04F, 0.6F, 0.1F);
        this.Lowerjawchinslope.addChild(Lowerjawchinslope_r1);
        this.setRotateAngle(Lowerjawchinslope_r1, -0.1222F, 0.0F, 0.0F);
        this.Lowerjawchinslope_r1.cubeList.add(new ModelBox(Lowerjawchinslope_r1, 37, 51, -1.52F, -1.0F, -0.1F, 1, 1, 3, 0.004F, true));
        this.Lowerjawchinslope_r1.cubeList.add(new ModelBox(Lowerjawchinslope_r1, 37, 51, 0.48F, -1.0F, -0.1F, 1, 1, 3, 0.004F, false));

        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(3.8F, 4.0762F, -2.8058F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.3651F, 0.3796F, -0.4002F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 0, 58, -0.3548F, -0.2145F, -0.6055F, 1, 4, 1, 0.0F, false));

        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.0336F, 4.1797F, -0.0221F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -1.2961F, -0.6205F, 0.4906F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 58, 6, -0.5F, -0.362F, -0.176F, 1, 4, 1, 0.0F, false));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 5, 58, -0.5F, -0.062F, -1.276F, 1, 4, 1, -0.2F, false));

        this.Lefthand = new ModelRenderer(this);
        this.Lefthand.setRotationPoint(0.4F, 3.138F, -0.176F);
        this.Leftlowerarm.addChild(Lefthand);
        this.setRotateAngle(Lefthand, 0.2557F, -0.0353F, 0.5714F);
        this.Lefthand.cubeList.add(new ModelBox(Lefthand, 0, 17, -1.0F, 0.0F, -2.5F, 1, 5, 4, 0.0F, false));

        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(-3.8F, 4.0762F, -2.8058F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.1303F, -0.6096F, 0.5953F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 41, 56, -0.6452F, -0.2145F, -0.6055F, 1, 4, 1, 0.0F, false));

        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.0336F, 4.1797F, -0.0221F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -1.2093F, 0.7031F, -0.475F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 57, 0, -0.5F, -0.362F, -0.176F, 1, 4, 1, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 46, 56, -0.5F, -0.062F, -1.276F, 1, 4, 1, -0.2F, false));

        this.Righthand = new ModelRenderer(this);
        this.Righthand.setRotationPoint(-0.4F, 3.138F, -0.176F);
        this.Rightlowerarm.addChild(Righthand);
        this.setRotateAngle(Righthand, 0.2557F, 0.0353F, -0.5714F);
        this.Righthand.cubeList.add(new ModelBox(Righthand, 0, 0, 0.0F, 0.0F, -2.5F, 1, 5, 4, 0.0F, false));

        this.Belly = new ModelRenderer(this);
        this.Belly.setRotationPoint(-0.01F, 5.9816F, -8.1459F);
        this.Bodymiddle.addChild(Belly);
        this.setRotateAngle(Belly, -0.2122F, 0.0F, 0.0F);
        this.Belly.cubeList.add(new ModelBox(Belly, 15, 17, -2.5F, -2.0F, 0.4F, 5, 2, 9, 0.0F, false));

        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.2941F, 4.1056F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.066F, -0.0436F, 0.0009F);


        this.Tailbase_r1 = new ModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, 0.1086F, 0.0937F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, 0.0436F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 15, 17, 0.0F, -1.5F, 6.9F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 21, 17, 0.0F, -1.5F, 4.9F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 30, 29, 0.0F, -1.5F, 2.9F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 30, 34, 0.0F, -1.5F, 0.9F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 18, 29, -0.5F, -0.5F, -0.1F, 1, 1, 9, 0.0F, false));

        this.Tailbase_r2 = new ModelRenderer(this);
        this.Tailbase_r2.setRotationPoint(0.0F, 0.5897F, 0.5588F);
        this.Tailbase.addChild(Tailbase_r2);
        this.setRotateAngle(Tailbase_r2, 0.7418F, 0.0F, 0.0F);
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 0, 17, 0.0F, 4.1097F, 4.6234F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 11, 4, 0.0F, 2.1203F, 2.8738F, 0, 3, 1, 0.0F, false));
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 51, 58, 0.0F, 1.3519F, 1.0907F, 0, 3, 1, 0.0F, false));
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 10, 59, 0.0F, 0.199F, -0.5436F, 0, 2, 1, 0.0F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.3914F, 8.7937F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.2339F, -0.0706F, -0.0468F);


        this.Tailbase_r3 = new ModelRenderer(this);
        this.Tailbase_r3.setRotationPoint(0.0F, 0.9822F, -8.2138F);
        this.Tailmiddlebase.addChild(Tailbase_r3);
        this.setRotateAngle(Tailbase_r3, 0.7418F, 0.0F, 0.0F);
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 36, 29, 0.0F, 11.8079F, 14.6963F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 36, 34, 0.0F, 10.6387F, 13.0613F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 0, 42, 0.0F, 9.5447F, 11.3604F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 46, 0, 0.0F, 8.3755F, 9.7255F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 13, 59, 0.0F, 6.2815F, 8.0246F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 23, 59, 0.0F, 5.2626F, 6.2577F, 0, 2, 1, 0.0F, false));

        this.Tailbase_r4 = new ModelRenderer(this);
        this.Tailbase_r4.setRotationPoint(0.0F, 0.5011F, -8.6788F);
        this.Tailmiddlebase.addChild(Tailbase_r4);
        this.setRotateAngle(Tailbase_r4, 0.0436F, 0.0F, 0.0F);
        this.Tailbase_r4.cubeList.add(new ModelBox(Tailbase_r4, 48, 14, 0.0F, -0.9F, 18.7F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r4.cubeList.add(new ModelBox(Tailbase_r4, 48, 14, 0.0F, -0.9F, 16.7F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r4.cubeList.add(new ModelBox(Tailbase_r4, 48, 31, 0.0F, -1.0F, 14.7F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r4.cubeList.add(new ModelBox(Tailbase_r4, 31, 49, 0.0F, -1.1F, 12.7F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r4.cubeList.add(new ModelBox(Tailbase_r4, 54, 0, 0.0F, -1.2F, 10.7F, 0, 1, 1, 0.0F, false));
        this.Tailbase_r4.cubeList.add(new ModelBox(Tailbase_r4, 59, 59, 0.0F, -1.3F, 8.7F, 0, 1, 1, 0.0F, false));

        this.Tailmiddlebase_r1 = new ModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.0F, 0.1011F, 0.0212F);
        this.Tailmiddlebase.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, 0.0611F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 0, 17, -0.5F, -0.5F, 0.0F, 1, 1, 12, 0.003F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(-0.49F, -0.7989F, 12.0212F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.3024F, 0.0866F, 0.0111F);


        this.Tailmiddleend_r1 = new ModelRenderer(this);
        this.Tailmiddleend_r1.setRotationPoint(0.0F, 0.2086F, -0.1324F);
        this.Tailmiddleend.addChild(Tailmiddleend_r1);
        this.setRotateAngle(Tailmiddleend_r1, -0.0873F, 0.0F, 0.0F);
        this.Tailmiddleend_r1.cubeList.add(new ModelBox(Tailmiddleend_r1, 18, 0, 0.0F, -0.5F, 0.0F, 1, 1, 12, 0.0F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(-0.01F, 1.2186F, 11.5676F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.0222F, 0.2169F, -0.0235F);


        this.Tailend_r1 = new ModelRenderer(this);
        this.Tailend_r1.setRotationPoint(0.0F, 0.0056F, 0.1941F);
        this.Tailend.addChild(Tailend_r1);
        this.setRotateAngle(Tailend_r1, -0.3054F, 0.0F, 0.0F);
        this.Tailend_r1.cubeList.add(new ModelBox(Tailend_r1, 0, 0, 0.0F, -0.4F, -0.3F, 1, 1, 15, 0.0F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.9F, 0.6941F, 0.9944F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.6473F, 0.0F, 0.0F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 54, 27, -0.6F, -0.541F, -0.5416F, 1, 5, 1, 0.0F, false));

        this.Rightthigh_r1 = new ModelRenderer(this);
        this.Rightthigh_r1.setRotationPoint(-0.1F, 4.4688F, -0.2392F);
        this.Rightthigh.addChild(Rightthigh_r1);
        this.setRotateAngle(Rightthigh_r1, 0.3927F, 0.0F, 0.0F);
        this.Rightthigh_r1.cubeList.add(new ModelBox(Rightthigh_r1, 31, 54, -0.5F, -0.1098F, -0.3024F, 1, 4, 1, -0.003F, false));

        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(-0.1F, 7.959F, 1.1584F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 1.7169F, -0.0872F, 0.0025F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 53, 43, -0.5F, 0.0F, -0.8F, 1, 2, 2, 0.005F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 26, 49, -0.5F, 2.0F, -0.5F, 1, 8, 1, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 21, 49, -0.5F, 2.0F, 0.4F, 1, 8, 1, -0.2F, false));

        this.Rightankle = new ModelRenderer(this);
        this.Rightankle.setRotationPoint(0.01F, 9.7F, 0.6F);
        this.Rightshin.addChild(Rightankle);
        this.setRotateAngle(Rightankle, -0.6709F, 0.0453F, -0.1148F);
        this.Rightankle.cubeList.add(new ModelBox(Rightankle, 36, 56, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.Rightfoot = new ModelRenderer(this);
        this.Rightfoot.setRotationPoint(-0.1F, 3.6F, 0.2F);
        this.Rightankle.addChild(Rightfoot);
        this.setRotateAngle(Rightfoot, 0.452F, -0.0785F, -0.0381F);
        this.Rightfoot.cubeList.add(new ModelBox(Rightfoot, 35, 14, -1.5F, -0.2786F, -5.6863F, 3, 1, 6, 0.0F, false));

        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.9F, 0.6941F, 0.9944F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.2537F, -0.022F, -0.0845F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 15, 52, -0.4F, -0.541F, -0.5416F, 1, 5, 1, 0.0F, false));

        this.Leftthigh_r1 = new ModelRenderer(this);
        this.Leftthigh_r1.setRotationPoint(0.1F, 4.4688F, -0.2392F);
        this.Leftthigh.addChild(Leftthigh_r1);
        this.setRotateAngle(Leftthigh_r1, 0.3927F, 0.0F, 0.0F);
        this.Leftthigh_r1.cubeList.add(new ModelBox(Leftthigh_r1, 33, 0, -0.5F, -0.1098F, -0.3024F, 1, 4, 1, -0.003F, false));

        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.1F, 7.959F, 1.1584F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 1.1498F, 0.0F, 0.0F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 53, 20, -0.5F, 0.0F, -0.8F, 1, 2, 2, 0.005F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 5, 48, -0.5F, 2.0F, -0.5F, 1, 8, 1, 0.0F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 0, 48, -0.5F, 2.0F, 0.4F, 1, 8, 1, -0.2F, false));

        this.Leftankle = new ModelRenderer(this);
        this.Leftankle.setRotationPoint(-0.01F, 9.7F, 0.6F);
        this.Leftshin.addChild(Leftankle);
        this.setRotateAngle(Leftankle, -0.807F, 0.1233F, -0.0024F);
        this.Leftankle.cubeList.add(new ModelBox(Leftankle, 35, 14, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.Leftfoot = new ModelRenderer(this);
        this.Leftfoot.setRotationPoint(0.1F, 3.6F, 0.2F);
        this.Leftankle.addChild(Leftfoot);
        this.setRotateAngle(Leftfoot, 0.1887F, 0.0F, 0.0F);
        this.Leftfoot.cubeList.add(new ModelBox(Leftfoot, 33, 0, -1.5F, -0.2786F, -5.6863F, 3, 1, 6, 0.0F, false));

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
