package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCryolophosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer LegL;
    private final ModelRenderer TibiaL;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer FootL;
    private final ModelRenderer FootL2;
    private final ModelRenderer LegL2;
    private final ModelRenderer TibiaL2;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer FootL3;
    private final ModelRenderer FootL4;
    private final ModelRenderer body;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer ArmL;
    private final ModelRenderer ElbowL;
    private final ModelRenderer HandL;
    private final ModelRenderer ArmL2;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck4;
    private final ModelRenderer head;
    private final ModelRenderer immobile;
    private final ModelRenderer immobile2;
    private final ModelRenderer immobile3;
    private final ModelRenderer immobile4;
    private final ModelRenderer immobile5;
    private final ModelRenderer immobile6;
    private final ModelRenderer immobile7;
    private final ModelRenderer immobile8;
    private final ModelRenderer immobile9;
    private final ModelRenderer immobile10;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone5;
    private final ModelRenderer immobile14;
    private final ModelRenderer immobile15;
    private final ModelRenderer bone4;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer immobile13;
    private final ModelRenderer jaw;
    private final ModelRenderer immobile11;
    private final ModelRenderer immobile12;
    private final ModelRenderer throatPouch3;
    private final ModelRenderer throatPouch;
    private final ModelRenderer throatPouch2;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;

    public ModelSkeletonCryolophosaurusFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -28.0F, 5.0F, 1, 28, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(3.4F, -22.5F, -18.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.5F, -6.5F, -0.5F, 1, 29, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(3.4F, -22.5F, -18.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -0.9F, -3.5F, -0.5F, 1, 7, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -22.5F, 5.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, -4.5F, -2.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -28.2671F, 2.7389F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.1309F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, -0.2867F, -2.6255F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 42, 1.0F, -0.3F, 2.8F, 1, 1, 9, -0.15F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 68, 1.0F, -0.3F, -0.9F, 1, 1, 4, -0.15F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(2.2F, 1.2798F, 2.9044F);
        this.hips.addChild(LegL);
        this.setRotateAngle(LegL, -0.3054F, 0.0F, 0.0F);


        this.TibiaL = new ModelRenderer(this);
        this.TibiaL.setRotationPoint(-0.1F, 11.2248F, -4.5723F);
        this.LegL.addChild(TibiaL);
        this.setRotateAngle(TibiaL, 0.4363F, 0.0F, 0.0F);


        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 10.0872F, 4.892F);
        this.TibiaL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -0.8727F, 0.0F, 0.0F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(-0.5F, 5.885F, -1.393F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 1.6144F, 0.0F, 0.0F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.5F, 0.0F, -2.3F);
        this.FootL.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.6545F, 0.0F, 0.0F);


        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-2.2F, 1.2798F, 2.9044F);
        this.hips.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.5236F, 0.0F, 0.0F);


        this.TibiaL2 = new ModelRenderer(this);
        this.TibiaL2.setRotationPoint(0.1F, 11.2248F, -4.5723F);
        this.LegL2.addChild(TibiaL2);
        this.setRotateAngle(TibiaL2, 0.1309F, 0.0F, 0.0F);


        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(0.0F, 10.0872F, 4.892F);
        this.TibiaL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, -0.2182F, 0.0F, 0.0F);


        this.FootL3 = new ModelRenderer(this);
        this.FootL3.setRotationPoint(0.5F, 5.885F, -1.393F);
        this.MetatarsalL2.addChild(FootL3);
        this.setRotateAngle(FootL3, 0.48F, 0.0F, 0.0F);


        this.FootL4 = new ModelRenderer(this);
        this.FootL4.setRotationPoint(-0.5F, 0.0F, -2.3F);
        this.FootL3.addChild(FootL4);
        this.setRotateAngle(FootL4, -0.7854F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.9867F, -3.2255F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0792F, -0.1305F, -0.0103F);
        this.body.cubeList.add(new ModelBox(body, 31, 30, -0.5F, 0.3418F, -10.9879F, 1, 1, 11, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.1418F, -10.788F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.22F, -0.1278F, -0.0285F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.2183F, -5.7115F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 59, 38, -1.0F, -0.2364F, -0.3379F, 1, 1, 6, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.5457F, -9.7788F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 66, -1.0F, -0.1734F, 0.0394F, 1, 1, 4, -0.15F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(2.9076F, 5.9061F, -9.0738F);
        this.chest.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.1255F, 0.2282F, -0.0705F);


        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.4202F, 4.3634F, 3.849F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.6628F, 0.0269F, 0.0344F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(-0.1461F, 4.6839F, -1.5493F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, -0.1757F, 0.1908F, 0.2917F);


        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-2.9076F, 5.9061F, -9.0738F);
        this.chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 0.2564F, -0.2282F, 0.0705F);


        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(-0.4202F, 4.3634F, 3.849F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.1833F, 0.0F, 0.0F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(0.1461F, 4.6839F, -1.5493F);
        this.ElbowL2.addChild(HandL2);
        this.setRotateAngle(HandL2, -0.1757F, -0.1908F, -0.2917F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0941F, -9.6057F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.4544F, -0.3309F, 0.0201F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0F, 0.9922F, -5.0045F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0785F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 59, 12, -2.5F, -0.5F, -0.2F, 1, 1, 6, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.2929F, -4.4351F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.5433F, -0.1825F, 0.1202F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 1.0F, -4.9536F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2269F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 60, 6, -1.5F, 0.4048F, -0.0742F, 1, 1, 5, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.0F, -4.8536F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.6524F, -0.0556F, -0.0792F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -1.6609F, -4.279F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 60, 64, -1.0F, 0.0F, 0.7F, 1, 1, 4, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0902F, -1.4266F, -3.4003F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.0621F, -0.3915F, -0.1368F);
        this.neck4.cubeList.add(new ModelBox(neck4, 0, 79, -0.5902F, 0.1657F, -2.8787F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.0902F, -0.2281F, -3.6178F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.0865F, 0.0114F, -0.1304F);


        this.immobile = new ModelRenderer(this);
        this.immobile.setRotationPoint(0.0F, 2.7954F, -4.0521F);
        this.head.addChild(immobile);


        this.immobile2 = new ModelRenderer(this);
        this.immobile2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.immobile.addChild(immobile2);
        this.setRotateAngle(immobile2, 0.1745F, 0.0F, 0.0F);


        this.immobile3 = new ModelRenderer(this);
        this.immobile3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.immobile2.addChild(immobile3);
        this.setRotateAngle(immobile3, -0.0873F, 0.0F, 0.0F);


        this.immobile4 = new ModelRenderer(this);
        this.immobile4.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.immobile2.addChild(immobile4);
        this.setRotateAngle(immobile4, 0.0436F, 0.0F, 0.0F);


        this.immobile5 = new ModelRenderer(this);
        this.immobile5.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.immobile4.addChild(immobile5);
        this.setRotateAngle(immobile5, 0.829F, 0.0F, 0.0F);


        this.immobile6 = new ModelRenderer(this);
        this.immobile6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.immobile5.addChild(immobile6);
        this.setRotateAngle(immobile6, -0.4669F, 0.0F, 0.0F);


        this.immobile7 = new ModelRenderer(this);
        this.immobile7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.immobile6.addChild(immobile7);
        this.setRotateAngle(immobile7, -0.1745F, 0.0F, 0.0F);


        this.immobile8 = new ModelRenderer(this);
        this.immobile8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.immobile7.addChild(immobile8);
        this.setRotateAngle(immobile8, -0.1658F, 0.0F, 0.0F);


        this.immobile9 = new ModelRenderer(this);
        this.immobile9.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.immobile8.addChild(immobile9);
        this.setRotateAngle(immobile9, 0.0443F, 0.1744F, 0.0077F);


        this.immobile10 = new ModelRenderer(this);
        this.immobile10.setRotationPoint(0.0701F, 0.9163F, 2.6024F);
        this.immobile9.addChild(immobile10);
        this.setRotateAngle(immobile10, 0.4816F, -0.0756F, -0.0437F);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(-0.3318F, -0.5786F, 0.6773F);
        this.immobile10.addChild(bone2);
        this.setRotateAngle(bone2, 0.049F, -0.5472F, 0.3005F);


        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(-0.7972F, -0.7754F, 0.7191F);
        this.immobile10.addChild(bone3);
        this.setRotateAngle(bone3, 0.2146F, -0.3337F, -0.0688F);


        this.bone5 = new ModelRenderer(this);
        this.bone5.setRotationPoint(-1.2943F, -0.8173F, 0.6853F);
        this.immobile10.addChild(bone5);
        this.setRotateAngle(bone5, 0.2628F, -0.1907F, -0.2185F);


        this.immobile14 = new ModelRenderer(this);
        this.immobile14.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.immobile8.addChild(immobile14);
        this.setRotateAngle(immobile14, 0.0443F, -0.1744F, -0.0077F);


        this.immobile15 = new ModelRenderer(this);
        this.immobile15.setRotationPoint(-0.0701F, 0.9163F, 2.6024F);
        this.immobile14.addChild(immobile15);
        this.setRotateAngle(immobile15, 0.4816F, 0.0756F, 0.0437F);


        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.3318F, -0.5786F, 0.6773F);
        this.immobile15.addChild(bone4);
        this.setRotateAngle(bone4, 0.049F, 0.5472F, -0.3005F);


        this.bone6 = new ModelRenderer(this);
        this.bone6.setRotationPoint(0.7972F, -0.7754F, 0.7191F);
        this.immobile15.addChild(bone6);
        this.setRotateAngle(bone6, 0.2146F, 0.3337F, 0.0688F);


        this.bone7 = new ModelRenderer(this);
        this.bone7.setRotationPoint(1.2943F, -0.8173F, 0.6853F);
        this.immobile15.addChild(bone7);
        this.setRotateAngle(bone7, 0.2628F, 0.1907F, 0.2185F);


        this.immobile13 = new ModelRenderer(this);
        this.immobile13.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.immobile8.addChild(immobile13);
        this.setRotateAngle(immobile13, 0.0443F, -0.1744F, -0.0077F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.3486F, 0.1924F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5061F, 0.0F, 0.0F);


        this.immobile11 = new ModelRenderer(this);
        this.immobile11.setRotationPoint(0.0F, -0.1F, -2.7F);
        this.jaw.addChild(immobile11);
        this.setRotateAngle(immobile11, 0.2182F, 0.0F, 0.0F);


        this.immobile12 = new ModelRenderer(this);
        this.immobile12.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.immobile11.addChild(immobile12);


        this.throatPouch3 = new ModelRenderer(this);
        this.throatPouch3.setRotationPoint(0.0F, 1.9F, -1.7F);
        this.jaw.addChild(throatPouch3);
        this.setRotateAngle(throatPouch3, -0.3054F, 0.0F, 0.0F);


        this.throatPouch = new ModelRenderer(this);
        this.throatPouch.setRotationPoint(0.0F, 2.8391F, -2.279F);
        this.neck3.addChild(throatPouch);
        this.setRotateAngle(throatPouch, 0.4363F, 0.0F, 0.0F);


        this.throatPouch2 = new ModelRenderer(this);
        this.throatPouch2.setRotationPoint(0.5F, 0.0F, -2.0F);
        this.throatPouch.addChild(throatPouch2);
        this.setRotateAngle(throatPouch2, -0.3927F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3717F, 8.3345F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0788F, 0.087F, -0.0069F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.4142F, 0.1512F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0524F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 42, -0.5F, -0.1591F, 0.3264F, 1, 1, 9, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.4791F, 8.5888F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1715F, 0.2581F, 0.0442F);
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 43, -0.5F, 0.3099F, 0.3111F, 1, 1, 8, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0443F, 8.2764F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0532F, 0.1743F, 0.0092F);
        this.tail3.cubeList.add(new ModelBox(tail3, 31, 0, -0.5F, 0.2994F, -0.4183F, 1, 1, 13, -0.15F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 43, 12, -0.5F, 0.2994F, 12.2817F, 1, 1, 1, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1496F, 12.8904F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0928F, -0.3477F, -0.0317F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 16, -0.5F, 0.2F, -0.1F, 1, 1, 14, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.1497F, 13.3131F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0632F, -0.2613F, 0.0164F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -0.5F, 0.3255F, 0.2114F, 1, 1, 14, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0762F, 13.894F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3193F, -0.2909F, 0.0945F);
        this.tail6.cubeList.add(new ModelBox(tail6, 31, 15, -0.5F, 0.2747F, -0.2823F, 1, 1, 13, -0.15F, false));

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
