package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonIrritatorFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer bodymiddle;
    private final ModelRenderer bodymiddle_r1;
    private final ModelRenderer bodyfront;
    private final ModelRenderer bodyfront_r1;
    private final ModelRenderer neckbase;
    private final ModelRenderer neckbase_r1;
    private final ModelRenderer neckmiddlebase;
    private final ModelRenderer neckmiddlebase_r1;
    private final ModelRenderer neckmiddle;
    private final ModelRenderer neckmiddle_r1;
    private final ModelRenderer neckmiddleend;
    private final ModelRenderer neckmiddleend_r1;
    private final ModelRenderer neckend;
    private final ModelRenderer neckend_r1;
    private final ModelRenderer head;
    private final ModelRenderer upperjawbase;
    private final ModelRenderer upperjawmiddle;
    private final ModelRenderer upperjawfront;
    private final ModelRenderer leftupperfrontteeth;
    private final ModelRenderer rightupperfrontteeth;
    private final ModelRenderer rightupperfrontteeth2;
    private final ModelRenderer leftupperteeth;
    private final ModelRenderer rightupperteeth;
    private final ModelRenderer rightupperteeth2;
    private final ModelRenderer headcrest;
    private final ModelRenderer upperjawlip;
    private final ModelRenderer jaw;
    private final ModelRenderer lowerjawrightbase;
    private final ModelRenderer lowerjawrightmiddle;
    private final ModelRenderer lowerjawrightfront;
    private final ModelRenderer rightlowerfrontteeth;
    private final ModelRenderer lowerjawrightslope;
    private final ModelRenderer rightlowerteeth;
    private final ModelRenderer lowerjawleftbase;
    private final ModelRenderer lowerjawleftmiddle;
    private final ModelRenderer lowerjawleftfront;
    private final ModelRenderer leftlowerfrontteeth;
    private final ModelRenderer lowerjawleftslope;
    private final ModelRenderer leftlowerteeth;
    private final ModelRenderer chestslope;
    private final ModelRenderer sail1;
    private final ModelRenderer rightupperarm;
    private final ModelRenderer rightlowerarm;
    private final ModelRenderer righthand;
    private final ModelRenderer rightouterfingers;
    private final ModelRenderer rightthumb;
    private final ModelRenderer rightthumbclaw;
    private final ModelRenderer leftupperarm;
    private final ModelRenderer leftlowerarm;
    private final ModelRenderer lefthand;
    private final ModelRenderer leftouterfingers;
    private final ModelRenderer leftthumb;
    private final ModelRenderer leftthumbclaw;
    private final ModelRenderer sail2;
    private final ModelRenderer sail3;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail8;
    private final ModelRenderer tailsail7;
    private final ModelRenderer tailsail5;
    private final ModelRenderer tailsail6;
    private final ModelRenderer undersail4;
    private final ModelRenderer tailsail3;
    private final ModelRenderer tailsail4;
    private final ModelRenderer undersail3;
    private final ModelRenderer tailsail2;
    private final ModelRenderer undersail2;
    private final ModelRenderer tailsail1;
    private final ModelRenderer undersail1;
    private final ModelRenderer rightthigh;
    private final ModelRenderer rightshin;
    private final ModelRenderer rightankle;
    private final ModelRenderer rightfoot;
    private final ModelRenderer righttoes;
    private final ModelRenderer leftthigh;
    private final ModelRenderer leftshin;
    private final ModelRenderer leftankle;
    private final ModelRenderer leftfoot;
    private final ModelRenderer lefttoes;
    private final ModelRenderer sail4;
    private final ModelRenderer sail5;
    private final ModelRenderer sail6;

    public ModelSkeletonIrritatorFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.4F, -26.0F, 1.5F, 1, 26, 1, -0.15F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(4.7F, -25.15F, -22.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4538F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.2F, -7.85F, -0.5F, 1, 33, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(4.7F, -29.9F, -22.7F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4535F, 0.0153F, 1.6022F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.5F, -4.0F, -0.5F, 1, 8, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -21.0F, 2.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -4.1F, -4.0F, -0.5F, 1, 9, 1, -0.16F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, -0.1745F, 0.0F, 0.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -2.58F, 3.5F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.0538F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 31, 38, -0.5F, -0.2F, -6.0F, 1, 2, 11, -0.003F, false));

        this.bodymiddle = new ModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.0F, 0.5F, -6.2F);
        this.hips.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, -0.0652F, -0.1745F, 0.0018F);


        this.bodymiddle_r1 = new ModelRenderer(this);
        this.bodymiddle_r1.setRotationPoint(0.0F, -0.3839F, -6.26F);
        this.bodymiddle.addChild(bodymiddle_r1);
        this.setRotateAngle(bodymiddle_r1, -0.0175F, 0.0F, 0.0F);
        this.bodymiddle_r1.cubeList.add(new ModelBox(bodymiddle_r1, 27, 3, -0.5F, -0.4F, -7.1F, 1, 2, 14, -0.003F, false));

        this.bodyfront = new ModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, -0.5839F, -13.36F);
        this.bodymiddle.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0905F, -0.1304F, -0.0118F);


        this.bodyfront_r1 = new ModelRenderer(this);
        this.bodyfront_r1.setRotationPoint(0.0F, -0.4402F, -8.768F);
        this.bodyfront.addChild(bodyfront_r1);
        this.setRotateAngle(bodyfront_r1, -0.0349F, 0.0F, 0.0F);
        this.bodyfront_r1.cubeList.add(new ModelBox(bodyfront_r1, 48, 48, -0.5F, -0.2F, -1.0F, 1, 2, 10, -0.003F, false));

        this.neckbase = new ModelRenderer(this);
        this.neckbase.setRotationPoint(0.0F, -0.9402F, -9.768F);
        this.bodyfront.addChild(neckbase);
        this.setRotateAngle(neckbase, -0.4254F, -0.1193F, 0.0539F);


        this.neckbase_r1 = new ModelRenderer(this);
        this.neckbase_r1.setRotationPoint(0.0F, -0.3146F, -0.1317F);
        this.neckbase.addChild(neckbase_r1);
        this.setRotateAngle(neckbase_r1, 0.4451F, 0.0F, 0.0F);
        this.neckbase_r1.cubeList.add(new ModelBox(neckbase_r1, 64, 61, -0.5F, 0.7849F, -3.9978F, 1, 1, 4, -0.15F, false));

        this.neckmiddlebase = new ModelRenderer(this);
        this.neckmiddlebase.setRotationPoint(0.0F, 1.2854F, -3.2317F);
        this.neckbase.addChild(neckmiddlebase);
        this.setRotateAngle(neckmiddlebase, -0.6551F, -0.0533F, -0.0692F);


        this.neckmiddlebase_r1 = new ModelRenderer(this);
        this.neckmiddlebase_r1.setRotationPoint(0.0F, 0.7156F, -3.6786F);
        this.neckmiddlebase.addChild(neckmiddlebase_r1);
        this.setRotateAngle(neckmiddlebase_r1, 0.0524F, 0.0F, 0.0F);
        this.neckmiddlebase_r1.cubeList.add(new ModelBox(neckmiddlebase_r1, 12, 64, -0.5F, -0.3F, -0.1F, 1, 1, 5, -0.15F, false));

        this.neckmiddle = new ModelRenderer(this);
        this.neckmiddle.setRotationPoint(0.0F, 0.3156F, -3.3786F);
        this.neckmiddlebase.addChild(neckmiddle);
        this.setRotateAngle(neckmiddle, -0.1973F, -0.0525F, -0.2566F);


        this.neckmiddle_r1 = new ModelRenderer(this);
        this.neckmiddle_r1.setRotationPoint(0.0F, -0.4951F, -5.1783F);
        this.neckmiddle.addChild(neckmiddle_r1);
        this.setRotateAngle(neckmiddle_r1, -0.0698F, 0.0F, 0.0F);
        this.neckmiddle_r1.cubeList.add(new ModelBox(neckmiddle_r1, 0, 35, -0.5F, 0.2F, 0.4F, 1, 1, 5, -0.15F, false));

        this.neckmiddleend = new ModelRenderer(this);
        this.neckmiddleend.setRotationPoint(0.02F, -0.0951F, -5.3783F);
        this.neckmiddle.addChild(neckmiddleend);
        this.setRotateAngle(neckmiddleend, 0.3974F, 0.0F, 0.0F);


        this.neckmiddleend_r1 = new ModelRenderer(this);
        this.neckmiddleend_r1.setRotationPoint(0.0F, 0.2156F, -4.3192F);
        this.neckmiddleend.addChild(neckmiddleend_r1);
        this.setRotateAngle(neckmiddleend_r1, 0.0524F, 0.0F, 0.0F);
        this.neckmiddleend_r1.cubeList.add(new ModelBox(neckmiddleend_r1, 0, 42, -0.5F, 0.1F, 0.2F, 1, 1, 5, -0.15F, false));

        this.neckend = new ModelRenderer(this);
        this.neckend.setRotationPoint(-0.01F, 0.3156F, -4.1192F);
        this.neckmiddleend.addChild(neckend);
        this.setRotateAngle(neckend, 0.1599F, -0.098F, -0.0869F);


        this.neckend_r1 = new ModelRenderer(this);
        this.neckend_r1.setRotationPoint(0.0F, 0.6002F, -4.5415F);
        this.neckend.addChild(neckend_r1);
        this.setRotateAngle(neckend_r1, 0.1396F, 0.0F, 0.0F);
        this.neckend_r1.cubeList.add(new ModelBox(neckend_r1, 20, 59, -0.5F, 0.1F, -0.2F, 1, 1, 5, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.6002F, -4.3415F);
        this.neckend.addChild(head);
        this.setRotateAngle(head, 0.0647F, -0.1742F, -0.0112F);


        this.upperjawbase = new ModelRenderer(this);
        this.upperjawbase.setRotationPoint(0.0F, -1.8083F, -1.9829F);
        this.head.addChild(upperjawbase);
        this.setRotateAngle(upperjawbase, 0.4671F, 0.0F, 0.0F);


        this.upperjawmiddle = new ModelRenderer(this);
        this.upperjawmiddle.setRotationPoint(0.0F, 0.9F, -5.0F);
        this.upperjawbase.addChild(upperjawmiddle);
        this.setRotateAngle(upperjawmiddle, -0.0424F, 0.0F, 0.0F);


        this.upperjawfront = new ModelRenderer(this);
        this.upperjawfront.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.upperjawmiddle.addChild(upperjawfront);
        this.setRotateAngle(upperjawfront, 0.2122F, 0.0F, 0.0F);


        this.leftupperfrontteeth = new ModelRenderer(this);
        this.leftupperfrontteeth.setRotationPoint(-0.25F, 1.6F, -1.0F);
        this.upperjawfront.addChild(leftupperfrontteeth);
        this.setRotateAngle(leftupperfrontteeth, 0.2122F, -0.0424F, -0.1274F);


        this.rightupperfrontteeth = new ModelRenderer(this);
        this.rightupperfrontteeth.setRotationPoint(0.25F, 1.6F, -1.0F);
        this.upperjawfront.addChild(rightupperfrontteeth);
        this.setRotateAngle(rightupperfrontteeth, 0.2122F, 0.0424F, -0.1274F);


        this.rightupperfrontteeth2 = new ModelRenderer(this);
        this.rightupperfrontteeth2.setRotationPoint(-0.27F, 1.6F, -1.0F);
        this.upperjawfront.addChild(rightupperfrontteeth2);
        this.setRotateAngle(rightupperfrontteeth2, 0.2122F, -0.0424F, 0.1274F);


        this.leftupperteeth = new ModelRenderer(this);
        this.leftupperteeth.setRotationPoint(-0.75F, -0.4F, -1.0F);
        this.upperjawmiddle.addChild(leftupperteeth);
        this.setRotateAngle(leftupperteeth, 0.0F, -0.1698F, -0.1274F);


        this.rightupperteeth = new ModelRenderer(this);
        this.rightupperteeth.setRotationPoint(0.75F, -0.4F, -1.0F);
        this.upperjawmiddle.addChild(rightupperteeth);
        this.setRotateAngle(rightupperteeth, 0.0F, 0.1698F, -0.1274F);


        this.rightupperteeth2 = new ModelRenderer(this);
        this.rightupperteeth2.setRotationPoint(-0.77F, -0.4F, -1.0F);
        this.upperjawmiddle.addChild(rightupperteeth2);
        this.setRotateAngle(rightupperteeth2, 0.0F, -0.1698F, 0.1274F);


        this.headcrest = new ModelRenderer(this);
        this.headcrest.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.upperjawbase.addChild(headcrest);
        this.setRotateAngle(headcrest, 0.0848F, 0.0F, 0.0F);


        this.upperjawlip = new ModelRenderer(this);
        this.upperjawlip.setRotationPoint(-0.01F, 1.8917F, -1.9829F);
        this.head.addChild(upperjawlip);
        this.setRotateAngle(upperjawlip, -0.0424F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.01F, 2.2917F, 0.4171F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);


        this.lowerjawrightbase = new ModelRenderer(this);
        this.lowerjawrightbase.setRotationPoint(1.71F, -0.1697F, -0.5227F);
        this.jaw.addChild(lowerjawrightbase);
        this.setRotateAngle(lowerjawrightbase, 0.0F, -0.026F, 0.0F);


        this.lowerjawrightmiddle = new ModelRenderer(this);
        this.lowerjawrightmiddle.setRotationPoint(0.0F, 1.0F, -4.8F);
        this.lowerjawrightbase.addChild(lowerjawrightmiddle);
        this.setRotateAngle(lowerjawrightmiddle, 0.2198F, 0.2641F, 0.0491F);


        this.lowerjawrightfront = new ModelRenderer(this);
        this.lowerjawrightfront.setRotationPoint(0.0F, 1.0F, -4.9F);
        this.lowerjawrightmiddle.addChild(lowerjawrightfront);
        this.setRotateAngle(lowerjawrightfront, -0.0424F, -0.1274F, 0.0F);


        this.rightlowerfrontteeth = new ModelRenderer(this);
        this.rightlowerfrontteeth.setRotationPoint(0.15F, -0.7F, -0.7F);
        this.lowerjawrightfront.addChild(rightlowerfrontteeth);
        this.setRotateAngle(rightlowerfrontteeth, 0.2972F, 0.0848F, 0.1485F);


        this.lowerjawrightslope = new ModelRenderer(this);
        this.lowerjawrightslope.setRotationPoint(0.01F, -1.0F, 0.0F);
        this.lowerjawrightmiddle.addChild(lowerjawrightslope);
        this.setRotateAngle(lowerjawrightslope, 0.1911F, 0.0F, 0.0F);


        this.rightlowerteeth = new ModelRenderer(this);
        this.rightlowerteeth.setRotationPoint(0.05F, 0.4F, -2.4F);
        this.lowerjawrightslope.addChild(rightlowerteeth);
        this.setRotateAngle(rightlowerteeth, -0.0424F, 0.0F, 0.0848F);


        this.lowerjawleftbase = new ModelRenderer(this);
        this.lowerjawleftbase.setRotationPoint(-1.71F, -0.1697F, -0.5227F);
        this.jaw.addChild(lowerjawleftbase);
        this.setRotateAngle(lowerjawleftbase, 0.0F, 0.026F, 0.0F);


        this.lowerjawleftmiddle = new ModelRenderer(this);
        this.lowerjawleftmiddle.setRotationPoint(0.0F, 1.0F, -4.8F);
        this.lowerjawleftbase.addChild(lowerjawleftmiddle);
        this.setRotateAngle(lowerjawleftmiddle, 0.2198F, -0.2641F, -0.0491F);


        this.lowerjawleftfront = new ModelRenderer(this);
        this.lowerjawleftfront.setRotationPoint(0.0F, 1.0F, -4.9F);
        this.lowerjawleftmiddle.addChild(lowerjawleftfront);
        this.setRotateAngle(lowerjawleftfront, -0.0424F, 0.1274F, 0.0F);


        this.leftlowerfrontteeth = new ModelRenderer(this);
        this.leftlowerfrontteeth.setRotationPoint(-0.15F, -0.7F, -0.7F);
        this.lowerjawleftfront.addChild(leftlowerfrontteeth);
        this.setRotateAngle(leftlowerfrontteeth, 0.2972F, -0.0848F, -0.1485F);


        this.lowerjawleftslope = new ModelRenderer(this);
        this.lowerjawleftslope.setRotationPoint(-0.01F, -1.0F, 0.0F);
        this.lowerjawleftmiddle.addChild(lowerjawleftslope);
        this.setRotateAngle(lowerjawleftslope, 0.1911F, 0.0F, 0.0F);


        this.leftlowerteeth = new ModelRenderer(this);
        this.leftlowerteeth.setRotationPoint(-0.05F, 0.4F, -2.4F);
        this.lowerjawleftslope.addChild(leftlowerteeth);
        this.setRotateAngle(leftlowerteeth, -0.0424F, 0.0F, -0.0848F);


        this.chestslope = new ModelRenderer(this);
        this.chestslope.setRotationPoint(0.0F, 5.0598F, -9.268F);
        this.bodyfront.addChild(chestslope);
        this.setRotateAngle(chestslope, -0.2559F, 0.0F, 0.0F);


        this.sail1 = new ModelRenderer(this);
        this.sail1.setRotationPoint(0.0F, -2.9402F, -6.568F);
        this.bodyfront.addChild(sail1);
        this.setRotateAngle(sail1, 0.21F, 0.0F, 0.0F);


        this.rightupperarm = new ModelRenderer(this);
        this.rightupperarm.setRotationPoint(3.0F, 4.0598F, -7.768F);
        this.bodyfront.addChild(rightupperarm);
        this.setRotateAngle(rightupperarm, 0.3882F, -0.5966F, -1.1303F);


        this.rightlowerarm = new ModelRenderer(this);
        this.rightlowerarm.setRotationPoint(1.1F, 5.3F, 1.0F);
        this.rightupperarm.addChild(rightlowerarm);
        this.setRotateAngle(rightlowerarm, -0.6133F, -0.0424F, 0.2972F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(0.8F, 3.0F, -0.8F);
        this.rightlowerarm.addChild(righthand);
        this.setRotateAngle(righthand, 0.0453F, -0.478F, 0.0715F);


        this.rightouterfingers = new ModelRenderer(this);
        this.rightouterfingers.setRotationPoint(0.0F, 3.8F, 0.5F);
        this.righthand.addChild(rightouterfingers);
        this.setRotateAngle(rightouterfingers, 0.0F, 0.0F, 0.3821F);


        this.rightthumb = new ModelRenderer(this);
        this.rightthumb.setRotationPoint(-0.6F, 0.5F, -1.4F);
        this.righthand.addChild(rightthumb);
        this.setRotateAngle(rightthumb, -0.504F, -0.174F, -0.0919F);


        this.rightthumbclaw = new ModelRenderer(this);
        this.rightthumbclaw.setRotationPoint(0.1F, 2.5F, 0.0F);
        this.rightthumb.addChild(rightthumbclaw);
        this.setRotateAngle(rightthumbclaw, -0.0213F, 0.0F, 0.6793F);


        this.leftupperarm = new ModelRenderer(this);
        this.leftupperarm.setRotationPoint(-3.0F, 4.0598F, -7.768F);
        this.bodyfront.addChild(leftupperarm);
        this.setRotateAngle(leftupperarm, -0.3955F, -0.2039F, 0.9126F);


        this.leftlowerarm = new ModelRenderer(this);
        this.leftlowerarm.setRotationPoint(-1.1F, 5.3F, 1.0F);
        this.leftupperarm.addChild(leftlowerarm);
        this.setRotateAngle(leftlowerarm, -0.0237F, 0.6128F, 0.3128F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(-0.8F, 3.0F, -0.8F);
        this.leftlowerarm.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, -0.1698F);


        this.leftouterfingers = new ModelRenderer(this);
        this.leftouterfingers.setRotationPoint(0.0F, 3.8F, 0.5F);
        this.lefthand.addChild(leftouterfingers);
        this.setRotateAngle(leftouterfingers, 0.0F, 0.0F, -0.3821F);


        this.leftthumb = new ModelRenderer(this);
        this.leftthumb.setRotationPoint(0.6F, 0.5F, -1.4F);
        this.lefthand.addChild(leftthumb);
        this.setRotateAngle(leftthumb, -0.5157F, 0.1314F, 0.0149F);


        this.leftthumbclaw = new ModelRenderer(this);
        this.leftthumbclaw.setRotationPoint(-0.1F, 2.5F, 0.0F);
        this.leftthumb.addChild(leftthumbclaw);
        this.setRotateAngle(leftthumbclaw, -0.0213F, 0.0F, -0.6793F);


        this.sail2 = new ModelRenderer(this);
        this.sail2.setRotationPoint(0.0F, -4.2839F, -13.86F);
        this.bodymiddle.addChild(sail2);
        this.setRotateAngle(sail2, 0.2512F, 0.0F, 0.0F);


        this.sail3 = new ModelRenderer(this);
        this.sail3.setRotationPoint(-0.01F, -3.8039F, -4.76F);
        this.bodymiddle.addChild(sail3);
        this.setRotateAngle(sail3, 0.0848F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.2F, 4.9F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.11F, 0.1745F, -0.0039F);


        this.tail2_r1 = new ModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.0F, 1.0131F, 0.1318F);
        this.tail1.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, 0.0698F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 0, 17, -0.5F, -1.6F, 0.0F, 1, 2, 15, -0.003F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(-0.01F, -1.1869F, 15.1318F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0618F, 0.3926F, -0.0098F);
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 20, -0.5F, -0.4988F, -0.4618F, 1, 2, 15, -0.003F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.4988F, 14.5382F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0585F, 0.6107F, -0.0165F);


        this.tail4_r1 = new ModelRenderer(this);
        this.tail4_r1.setRotationPoint(0.0F, 0.1023F, -0.0571F);
        this.tail3.addChild(tail4_r1);
        this.setRotateAngle(tail4_r1, 0.0175F, 0.0F, 0.0F);
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 0, 35, -0.5F, 0.1F, -0.4F, 1, 1, 14, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0977F, 13.5429F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.3453F, 0.4231F, -0.4053F);
        this.tail4.cubeList.add(new ModelBox(tail4, 47, 35, -0.5F, 0.1F, -0.5F, 1, 1, 11, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.1F, 10.8F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1946F, 0.4356F, -0.0269F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 51, -0.5F, -0.1F, -0.5F, 1, 1, 11, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(-0.01F, 0.0F, 10.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.4995F, 0.5154F, -0.0966F);
        this.tail6.cubeList.add(new ModelBox(tail6, 46, 0, -0.5F, -0.1F, 0.0F, 1, 1, 11, -0.15F, false));

        this.tail8 = new ModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.tail6.addChild(tail8);
        this.setRotateAngle(tail8, -0.0637F, 0.0F, 0.0F);


        this.tailsail7 = new ModelRenderer(this);
        this.tailsail7.setRotationPoint(0.0F, -1.0F, -0.5F);
        this.tail5.addChild(tailsail7);


        this.tailsail5 = new ModelRenderer(this);
        this.tailsail5.setRotationPoint(-0.01F, -0.8F, -0.5F);
        this.tail4.addChild(tailsail5);
        this.setRotateAngle(tailsail5, 0.1274F, 0.0F, 0.0F);


        this.tailsail6 = new ModelRenderer(this);
        this.tailsail6.setRotationPoint(0.01F, -0.2F, 2.6F);
        this.tail4.addChild(tailsail6);
        this.setRotateAngle(tailsail6, -0.0424F, 0.0F, 0.0F);


        this.undersail4 = new ModelRenderer(this);
        this.undersail4.setRotationPoint(-0.01F, 0.8F, -0.5F);
        this.tail4.addChild(undersail4);
        this.setRotateAngle(undersail4, 0.1536F, 0.0F, 0.0F);


        this.tailsail3 = new ModelRenderer(this);
        this.tailsail3.setRotationPoint(0.0F, -0.1977F, 0.0429F);
        this.tail3.addChild(tailsail3);
        this.setRotateAngle(tailsail3, 0.0637F, 0.0F, 0.0F);


        this.tailsail4 = new ModelRenderer(this);
        this.tailsail4.setRotationPoint(-0.01F, -0.8977F, 9.0429F);
        this.tail3.addChild(tailsail4);


        this.undersail3 = new ModelRenderer(this);
        this.undersail3.setRotationPoint(0.0F, -0.5977F, -0.5571F);
        this.tail3.addChild(undersail3);
        this.setRotateAngle(undersail3, -0.0248F, 0.0F, 0.0F);


        this.tailsail2 = new ModelRenderer(this);
        this.tailsail2.setRotationPoint(0.0F, -1.1988F, -0.4618F);
        this.tail2.addChild(tailsail2);
        this.setRotateAngle(tailsail2, 0.0424F, 0.0F, 0.0F);


        this.undersail2 = new ModelRenderer(this);
        this.undersail2.setRotationPoint(0.0F, 1.7012F, -0.6618F);
        this.tail2.addChild(undersail2);
        this.setRotateAngle(undersail2, 0.0637F, 0.0F, 0.0F);


        this.tailsail1 = new ModelRenderer(this);
        this.tailsail1.setRotationPoint(0.0F, -3.1869F, 0.1318F);
        this.tail1.addChild(tailsail1);
        this.setRotateAngle(tailsail1, 0.0038F, 0.0F, 0.0F);


        this.undersail1 = new ModelRenderer(this);
        this.undersail1.setRotationPoint(0.0F, -0.0869F, -0.3682F);
        this.tail1.addChild(undersail1);
        this.setRotateAngle(undersail1, -0.0424F, 0.0F, 0.0F);


        this.rightthigh = new ModelRenderer(this);
        this.rightthigh.setRotationPoint(2.0F, 1.0F, -1.4F);
        this.hips.addChild(rightthigh);
        this.setRotateAngle(rightthigh, -0.0531F, 0.007F, 0.0883F);


        this.rightshin = new ModelRenderer(this);
        this.rightshin.setRotationPoint(1.7788F, 8.9587F, -1.6785F);
        this.rightthigh.addChild(rightshin);
        this.setRotateAngle(rightshin, 0.6647F, -0.0269F, 0.0768F);


        this.rightankle = new ModelRenderer(this);
        this.rightankle.setRotationPoint(-0.0524F, 10.9498F, 0.9151F);
        this.rightshin.addChild(rightankle);
        this.setRotateAngle(rightankle, -0.6347F, -0.0518F, -0.0702F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 6.2774F, -0.206F);
        this.rightankle.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.2784F, 0.024F, -0.0839F);


        this.righttoes = new ModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, 0.51F, -2.4F);
        this.rightfoot.addChild(righttoes);


        this.leftthigh = new ModelRenderer(this);
        this.leftthigh.setRotationPoint(-2.0F, 1.0F, -1.4F);
        this.hips.addChild(leftthigh);
        this.setRotateAngle(leftthigh, -0.1397F, -0.0183F, -0.0872F);


        this.leftshin = new ModelRenderer(this);
        this.leftshin.setRotationPoint(-1.7788F, 8.9587F, -1.6785F);
        this.leftthigh.addChild(leftshin);
        this.setRotateAngle(leftshin, 1.3191F, 0.0676F, -0.0598F);


        this.leftankle = new ModelRenderer(this);
        this.leftankle.setRotationPoint(0.0524F, 10.9498F, 0.9151F);
        this.leftshin.addChild(leftankle);
        this.setRotateAngle(leftankle, -0.7189F, 0.0873F, 0.0901F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 6.2774F, -0.206F);
        this.leftankle.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.8059F, 0.0237F, 0.084F);


        this.lefttoes = new ModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, 0.51F, -2.4F);
        this.leftfoot.addChild(lefttoes);
        this.setRotateAngle(lefttoes, -0.3054F, 0.0F, 0.0F);


        this.sail4 = new ModelRenderer(this);
        this.sail4.setRotationPoint(0.0F, -3.7F, -5.5F);
        this.hips.addChild(sail4);
        this.setRotateAngle(sail4, 0.0236F, 0.0F, 0.0F);


        this.sail5 = new ModelRenderer(this);
        this.sail5.setRotationPoint(0.01F, -8.4F, 0.8F);
        this.hips.addChild(sail5);
        this.setRotateAngle(sail5, -0.5419F, 0.0F, 0.0F);


        this.sail6 = new ModelRenderer(this);
        this.sail6.setRotationPoint(0.0F, -3.2F, 2.9F);
        this.hips.addChild(sail6);
        this.setRotateAngle(sail6, -0.2471F, 0.0F, 0.0F);

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
