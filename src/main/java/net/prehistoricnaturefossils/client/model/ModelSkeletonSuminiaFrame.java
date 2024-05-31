package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSuminiaFrame extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4_r1;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tail5;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer Neck_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjawbase;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerfrontteeth;
    private final ModelRenderer Lowermiddleteeth;
    private final ModelRenderer Lowerbackteeth;
    private final ModelRenderer Jawparting;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Upperfrontteeth;
    private final ModelRenderer Uppermiddleteeth;
    private final ModelRenderer Upperbackteeth;
    private final ModelRenderer Browslope;
    private final ModelRenderer Snoutslope;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Righthand;
    private final ModelRenderer Rightthumb;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Lefthand;
    private final ModelRenderer Leftthumb;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Rightopposabletoe;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;
    private final ModelRenderer Leftopposabletoe;

    public ModelSkeletonSuminiaFrame() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.cubeList.add(new ModelBox(root, 1, 1, -0.5F, 5.5F, -9.0F, 1, 19, 1, -0.3F, false));
        this.root.cubeList.add(new ModelBox(root, 1, 1, -0.5F, 14.5F, 8.0F, 1, 10, 1, -0.3F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 14.0F, 9.0F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 2.0F, -5.5F, -1.0F, 1, 10, 1, -0.31F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 14.5F, -8.0F);
        this.root.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -4.5F, -5.5F, -1.0F, 1, 10, 1, -0.31F, false));

        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 14.7F, -1.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.6533F, 0.0F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, -6.9941F, 5.5588F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.0873F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 33, -2, -0.5F, 0.5381F, -0.3253F, 1, 1, 9, -0.3F, false));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -6.4941F, 13.4588F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.3485F, 0.3296F, 0.1171F);


        this.Tail2_r1 = new ModelRenderer(this);
        this.Tail2_r1.setRotationPoint(0.0F, 0.1624F, -0.3598F);
        this.Tail1.addChild(Tail2_r1);
        this.setRotateAngle(Tail2_r1, -0.1745F, 0.0F, 0.0F);
        this.Tail2_r1.cubeList.add(new ModelBox(Tail2_r1, 38, 11, -0.509F, 0.6815F, 0.0595F, 1, 1, 8, -0.3F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 1.1624F, 7.5402F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.245F, 0.4248F, 0.1027F);


        this.Tail3_r1 = new ModelRenderer(this);
        this.Tail3_r1.setRotationPoint(0.1664F, 1.1132F, -0.6119F);
        this.Tail2.addChild(Tail3_r1);
        this.setRotateAngle(Tail3_r1, 0.0699F, -0.0522F, -0.0046F);
        this.Tail3_r1.cubeList.add(new ModelBox(Tail3_r1, 0, 26, -0.3F, -0.1729F, -0.5686F, 1, 1, 10, -0.3F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.3774F, 8.7594F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0341F, 0.6542F, 0.0208F);


        this.Tail4_r1 = new ModelRenderer(this);
        this.Tail4_r1.setRotationPoint(0.0928F, 1.167F, -0.2726F);
        this.Tail3.addChild(Tail4_r1);
        this.setRotateAngle(Tail4_r1, 0.0F, -0.0524F, 0.0F);
        this.Tail4_r1.cubeList.add(new ModelBox(Tail4_r1, 38, 22, -0.5F, -0.5F, -0.5F, 1, 1, 9, -0.3F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.176F, 8.3073F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.2439F, 0.5107F, -0.121F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 28, 44, -0.6582F, 0.5465F, -0.7511F, 1, 1, 8, -0.3F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0709F, 6.5893F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.2486F, 0.8135F, -0.1824F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 46, 45, -0.973F, 0.4686F, -0.1489F, 1, 1, 7, -0.3F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -7.3941F, 5.6588F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0424F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 12, -0.5F, 0.9566F, -10.2612F, 1, 1, 11, -0.3F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.1626F, -10.1347F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.2806F, 0.0F, 0.0F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 2.2961F, -9.3741F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.1047F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 19, 2, -0.5F, -0.2877F, -0.3958F, 1, 1, 10, -0.301F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.5961F, -9.2741F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.8786F, 0.0F, 0.0F);


        this.Neck_r1 = new ModelRenderer(this);
        this.Neck_r1.setRotationPoint(0.0F, 0.4831F, -5.6281F);
        this.Neck.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, 0.0349F, 0.0F, 0.0F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 36, 34, -0.5F, 0.5866F, -0.5777F, 1, 1, 8, -0.3F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, 0.5831F, -6.0281F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 1.0779F, 0.0F, 0.0F);


        this.Lowerjawbase = new ModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 1.7679F, 0.3649F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 0.4363F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -4.9F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.0637F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.0848F, 0.0F, 0.0F);


        this.Lowerfrontteeth = new ModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.01F, 0.1F, -2.6F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, 0.0637F, 0.0F, 0.0F);


        this.Lowermiddleteeth = new ModelRenderer(this);
        this.Lowermiddleteeth.setRotationPoint(-0.01F, 0.2F, -1.6F);
        this.Lowerjawfront.addChild(Lowermiddleteeth);
        this.setRotateAngle(Lowermiddleteeth, -0.0848F, 0.0F, 0.0F);


        this.Lowerbackteeth = new ModelRenderer(this);
        this.Lowerbackteeth.setRotationPoint(0.01F, 0.2F, -2.7F);
        this.Lowerjawmiddle.addChild(Lowerbackteeth);
        this.setRotateAngle(Lowerbackteeth, -0.1698F, 0.0F, 0.0F);


        this.Jawparting = new ModelRenderer(this);
        this.Jawparting.setRotationPoint(0.0F, 0.1F, -5.0F);
        this.Lowerjawbase.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.4882F, 0.0F, 0.0F);


        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.01F, -2.2321F, -4.5051F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.0637F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 2.0F, -3.46F);
        this.Upperjawback.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.0848F, 0.0F, 0.0F);


        this.Upperfrontteeth = new ModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(-0.01F, 0.7F, -1.9F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, -0.5732F, 0.0F, 0.0F);


        this.Uppermiddleteeth = new ModelRenderer(this);
        this.Uppermiddleteeth.setRotationPoint(0.01F, 1.0F, -1.7F);
        this.Upperjawfront.addChild(Uppermiddleteeth);
        this.setRotateAngle(Uppermiddleteeth, -0.0848F, 0.0F, 0.0F);


        this.Upperbackteeth = new ModelRenderer(this);
        this.Upperbackteeth.setRotationPoint(-0.01F, 3.9F, -3.2F);
        this.Upperjawback.addChild(Upperbackteeth);
        this.setRotateAngle(Upperbackteeth, 0.1274F, 0.0F, 0.0F);


        this.Browslope = new ModelRenderer(this);
        this.Browslope.setRotationPoint(0.0F, -3.2321F, -4.6351F);
        this.Head.addChild(Browslope);
        this.setRotateAngle(Browslope, 0.2546F, 0.0F, 0.0F);


        this.Snoutslope = new ModelRenderer(this);
        this.Snoutslope.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Browslope.addChild(Snoutslope);
        this.setRotateAngle(Snoutslope, 0.536F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(5.0F, 6.1961F, -6.4741F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.9226F, 0.0392F, -0.0994F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.3346F, 5.4902F, 0.3519F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.7098F, 0.1651F, 0.4196F);


        this.Righthand = new ModelRenderer(this);
        this.Righthand.setRotationPoint(-0.2306F, 7.861F, -0.8747F);
        this.Rightlowerarm.addChild(Righthand);
        this.setRotateAngle(Righthand, 0.1783F, -0.3264F, -0.3394F);


        this.Rightthumb = new ModelRenderer(this);
        this.Rightthumb.setRotationPoint(-2.2F, 0.7F, -1.5F);
        this.Righthand.addChild(Rightthumb);
        this.setRotateAngle(Rightthumb, 0.0F, 0.6793F, 0.0F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-5.0F, 6.1961F, -6.4741F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.9226F, -0.0392F, 0.0994F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.3346F, 5.4902F, 0.3519F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.7098F, -0.1651F, -0.4196F);


        this.Lefthand = new ModelRenderer(this);
        this.Lefthand.setRotationPoint(0.2306F, 7.861F, -0.8747F);
        this.Leftlowerarm.addChild(Lefthand);
        this.setRotateAngle(Lefthand, 0.1783F, 0.3264F, 0.3394F);


        this.Leftthumb = new ModelRenderer(this);
        this.Leftthumb.setRotationPoint(2.2F, 0.7F, -1.5F);
        this.Lefthand.addChild(Leftthumb);
        this.setRotateAngle(Leftthumb, 0.0F, -0.6793F, 0.0F);


        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.0F, -3.9941F, 9.5588F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -1.25F, -0.5519F, -0.1061F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.4108F, 9.5178F, -1.2552F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 1.6368F, 0.0F, 0.1061F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 9.0F, 2.5F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 0.219F, 0.0308F, -0.1931F);


        this.Rightopposabletoe = new ModelRenderer(this);
        this.Rightopposabletoe.setRotationPoint(-2.2F, 0.7F, -1.5F);
        this.Righthindfoot.addChild(Rightopposabletoe);
        this.setRotateAngle(Rightopposabletoe, 0.0F, 0.6793F, 0.0F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.0F, -3.9941F, 9.5588F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -1.25F, 0.5519F, 0.1061F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.4108F, 9.5178F, -1.2552F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 1.6368F, 0.0F, -0.1061F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 9.0F, 2.5F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 0.219F, -0.0308F, 0.1931F);


        this.Leftopposabletoe = new ModelRenderer(this);
        this.Leftopposabletoe.setRotationPoint(2.2F, 0.7F, -1.5F);
        this.Lefthindfoot.addChild(Leftopposabletoe);
        this.setRotateAngle(Leftopposabletoe, 0.0F, -0.6793F, 0.0F);

    }

    public void renderAll(float f) {
        this.root.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
