package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMegalosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer Hips;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer Neck1;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Neck2;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Neck3;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Neck4;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer Headbase;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjaw;
    private final ModelRenderer Lowerjaw;
    private final ModelRenderer Leftarm1;
    private final ModelRenderer Leftarm2;
    private final ModelRenderer Leftarm3;
    private final ModelRenderer Rightarm1;
    private final ModelRenderer Rightarm2;
    private final ModelRenderer Rightarm3;
    private final ModelRenderer Leftleg1;
    private final ModelRenderer Leftleg2;
    private final ModelRenderer Leftleg3;
    private final ModelRenderer Leftleg4;
    private final ModelRenderer Leftleg5;
    private final ModelRenderer Rightleg1;
    private final ModelRenderer Rightleg2;
    private final ModelRenderer Rightleg3;
    private final ModelRenderer Rightleg4;
    private final ModelRenderer Rightleg5;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer frame11_r1;
    private final ModelRenderer Tail5;
    private final ModelRenderer frame12_r1;
    private final ModelRenderer Tail6;
    private final ModelRenderer frame13_r1;

    public ModelSkeletonMegalosaurusFrame() {
        this.textureWidth = 115;
        this.textureHeight = 115;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -37.9F, -2.5F, 1, 38, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -2.0F, -36.9F, -38.05F, 1, 37, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-1.5F, -27.55F, -37.55F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0077F, 0.1744F, 0.0443F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -5, 1, -7.0F, -0.5F, -0.5F, 13, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -34.5F, -2.002F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, 0.0436F, -0.0436F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -4, 1, -6.0F, -0.5F, -0.498F, 12, 1, 1, -0.1F, false));

        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -40.2F, -1.9F);
        this.fossil.addChild(Hips);
        this.setRotateAngle(Hips, -0.0122F, 0.0F, 0.0F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(-0.5F, 3.2991F, -8.1287F);
        this.Hips.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.0436F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 29, 7, 0.0F, -1.6F, 0.0F, 1, 1, 17, -0.1F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.0009F, -7.6287F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0471F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -0.49F, 1.7026F, -19.8917F, 1, 1, 20, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.4026F, -19.8917F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1191F, 0.1733F, 0.0206F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(-0.5F, 2.4336F, -12.3738F);
        this.Bodyfront.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0436F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 55, 17, 0.0F, -1.6208F, -0.136F, 1, 1, 13, -0.1F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -0.7815F, -12.2841F);
        this.Bodyfront.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.2747F, 0.084F, -0.0236F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-0.5F, 3.3859F, -4.7063F);
        this.Neck1.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.1309F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 11, 96, 0.0F, -1.2F, -0.3F, 1, 1, 6, -0.1F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.6859F, -3.8563F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2381F, 0.1697F, -0.041F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(-0.5F, 3.1243F, -6.113F);
        this.Neck2.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.0873F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 92, 60, 0.0F, -1.0F, -0.1F, 1, 1, 6, -0.1F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 0.6243F, -5.863F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0829F, 0.1739F, -0.0144F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.5F, 2.7133F, -5.8264F);
        this.Neck3.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.0436F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 89, 30, 0.0F, -1.5F, 0.0F, 1, 1, 6, -0.1F, false));

        this.Neck4 = new ModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, -0.0867F, -5.5264F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, 0.4359F, 0.1585F, 0.0734F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(-0.35F, 2.4542F, -2.652F);
        this.Neck4.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.0873F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 103, 77, 0.0F, -1.5F, -1.0F, 1, 1, 3, -0.1F, false));

        this.Headbase = new ModelRenderer(this);
        this.Headbase.setRotationPoint(0.0F, -0.7458F, -3.052F);
        this.Neck4.addChild(Headbase);
        this.setRotateAngle(Headbase, 0.0527F, 0.2591F, 0.084F);


        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 2.9325F, 0.2246F);
        this.Headbase.addChild(Head);


        this.Upperjaw = new ModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, -4.0F, -8.0F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, 0.0391F, 0.0F, 0.0F);


        this.Lowerjaw = new ModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 2.9325F, 0.2246F);
        this.Headbase.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.2775F, 0.0F, 0.0F);


        this.Leftarm1 = new ModelRenderer(this);
        this.Leftarm1.setRotationPoint(6.5F, 9.5185F, -10.0841F);
        this.Bodyfront.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, 0.8522F, 0.4325F, -0.2032F);


        this.Leftarm2 = new ModelRenderer(this);
        this.Leftarm2.setRotationPoint(-0.8867F, 7.6775F, 0.991F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, -1.4839F, 0.0F, 0.0F);


        this.Leftarm3 = new ModelRenderer(this);
        this.Leftarm3.setRotationPoint(1.4F, 5.8F, -2.0F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.0932F, -0.0713F, 0.8466F);


        this.Rightarm1 = new ModelRenderer(this);
        this.Rightarm1.setRotationPoint(-6.5F, 9.5185F, -10.0841F);
        this.Bodyfront.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, 0.7698F, -0.1906F, 0.4685F);


        this.Rightarm2 = new ModelRenderer(this);
        this.Rightarm2.setRotationPoint(0.8867F, 7.6775F, 0.991F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, -0.9191F, -0.2599F, -0.4809F);


        this.Rightarm3 = new ModelRenderer(this);
        this.Rightarm3.setRotationPoint(-1.4F, 5.8F, -2.0F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, 0.0623F, 0.0221F, -0.5401F);


        this.Leftleg1 = new ModelRenderer(this);
        this.Leftleg1.setRotationPoint(5.5F, 4.6991F, 0.3713F);
        this.Hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, -0.8161F, 0.0199F, 0.0423F);


        this.Leftleg2 = new ModelRenderer(this);
        this.Leftleg2.setRotationPoint(0.193F, 14.9902F, -2.388F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 0.7681F, -0.0607F, 0.0802F);


        this.Leftleg3 = new ModelRenderer(this);
        this.Leftleg3.setRotationPoint(-0.1573F, 14.3642F, 2.5532F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, -0.3156F, 0.0F, 0.0F);


        this.Leftleg4 = new ModelRenderer(this);
        this.Leftleg4.setRotationPoint(0.0F, 8.9395F, -1.3316F);
        this.Leftleg3.addChild(Leftleg4);
        this.setRotateAngle(Leftleg4, 0.8821F, 0.1013F, -0.0831F);


        this.Leftleg5 = new ModelRenderer(this);
        this.Leftleg5.setRotationPoint(0.0F, 0.5F, -3.9F);
        this.Leftleg4.addChild(Leftleg5);
        this.setRotateAngle(Leftleg5, -0.3491F, 0.0F, 0.0F);


        this.Rightleg1 = new ModelRenderer(this);
        this.Rightleg1.setRotationPoint(-5.5F, 4.6991F, 0.3713F);
        this.Hips.addChild(Rightleg1);
        this.setRotateAngle(Rightleg1, 0.0098F, 0.0447F, -0.0699F);


        this.Rightleg2 = new ModelRenderer(this);
        this.Rightleg2.setRotationPoint(-0.193F, 14.9902F, -2.388F);
        this.Rightleg1.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, 1.3371F, 0.0424F, -0.0276F);


        this.Rightleg3 = new ModelRenderer(this);
        this.Rightleg3.setRotationPoint(0.1573F, 14.3642F, 2.5532F);
        this.Rightleg2.addChild(Rightleg3);
        this.setRotateAngle(Rightleg3, -0.3592F, 0.0F, 0.0F);


        this.Rightleg4 = new ModelRenderer(this);
        this.Rightleg4.setRotationPoint(0.0F, 8.9395F, -1.3316F);
        this.Rightleg3.addChild(Rightleg4);
        this.setRotateAngle(Rightleg4, 0.9735F, 0.0F, 0.0F);


        this.Rightleg5 = new ModelRenderer(this);
        this.Rightleg5.setRotationPoint(0.0F, 0.5F, -3.9F);
        this.Rightleg4.addChild(Rightleg5);
        this.setRotateAngle(Rightleg5, 0.0873F, 0.0F, 0.0F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.7991F, 8.8713F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1146F, 0.0867F, -0.01F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 56, 54, -0.5F, 1.5925F, -0.0052F, 1, 1, 12, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.2075F, 11.4948F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0563F, 0.1307F, 0.0073F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 25, 51, -0.5F, 1.8972F, -0.075F, 1, 1, 13, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.3019F, 12.7974F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0574F, 0.1743F, 0.01F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 51, 0, -0.5F, 1.5704F, -0.2797F, 1, 1, 13, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.3293F, 12.5872F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.016F, -0.1745F, -0.0028F);


        this.frame11_r1 = new ModelRenderer(this);
        this.frame11_r1.setRotationPoint(-0.5F, 2.3946F, -0.4732F);
        this.Tail4.addChild(frame11_r1);
        this.setRotateAngle(frame11_r1, 0.0262F, 0.0F, 0.0F);
        this.frame11_r1.cubeList.add(new ModelBox(frame11_r1, 1, 45, 0.0F, -0.5F, 0.0F, 1, 1, 16, -0.1F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.094F, 15.047F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.1019F, -0.2171F, 0.022F);


        this.frame12_r1 = new ModelRenderer(this);
        this.frame12_r1.setRotationPoint(0.0F, 1.8985F, 0.457F);
        this.Tail5.addChild(frame12_r1);
        this.setRotateAngle(frame12_r1, 0.0175F, 0.0F, 0.0F);
        this.frame12_r1.cubeList.add(new ModelBox(frame12_r1, 24, 28, -0.5F, -0.5F, -0.5F, 1, 1, 17, -0.1F, false));

        this.Tail6 = new ModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, -0.4339F, 16.7184F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.1712F, -0.2581F, 0.0441F);


        this.frame13_r1 = new ModelRenderer(this);
        this.frame13_r1.setRotationPoint(0.0F, 2.0577F, -0.3842F);
        this.Tail6.addChild(frame13_r1);
        this.setRotateAngle(frame13_r1, 0.0611F, 0.0F, 0.0F);
        this.frame13_r1.cubeList.add(new ModelBox(frame13_r1, 0, 24, -0.5F, -0.5F, 0.0F, 1, 1, 19, -0.1F, false));

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
