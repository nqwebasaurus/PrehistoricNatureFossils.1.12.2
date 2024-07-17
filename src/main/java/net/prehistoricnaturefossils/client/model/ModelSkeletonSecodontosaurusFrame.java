package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSecodontosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Neckbase;
    private final ModelRenderer Neckbase_r1;
    private final ModelRenderer Neckend;
    private final ModelRenderer Neckend_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerjawslope;
    private final ModelRenderer Jawparting;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperjawmiddle;
    private final ModelRenderer Nosebridge;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Forehead;
    private final ModelRenderer bone;
    private final ModelRenderer sailbaseneck;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer sailbasebodyfront;
    private final ModelRenderer sailbasebodymiddle;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailend;
    private final ModelRenderer sailbasetail;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;
    private final ModelRenderer sailbasehips;

    public ModelSkeletonSecodontosaurusFrame() {
        this.textureWidth = 65;
        this.textureHeight = 65;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -8.0F, 5.6F, 1, 8, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.1F, -8.0F, 6.1F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.7F, -2.0F, -0.5F, 1, 4, 1, -0.21F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(2.8F, -8.0F, -11.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.288F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.0F, -4.0F, -0.5F, 1, 8, 1, -0.21F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(2.8F, -8.0F, -11.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.288F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.6F, -4.0F, -0.5F, 1, 12, 1, -0.21F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -21.25F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 12.9F, 6.6F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1878F, 0.0F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.5F, -1.1697F, -2.5506F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.1745F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 22, 20, -1.0F, 0.7F, -0.4F, 1, 1, 7, -0.2F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.7697F, -2.5506F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1372F, -0.0865F, -0.0119F);


        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(-0.1F, -2.6715F, -8.5434F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, -0.2618F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 0, 0, -0.4F, 0.6881F, -0.1144F, 1, 1, 9, -0.2F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -2.3834F, -8.4578F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0502F, -0.1743F, -0.0087F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, -0.5726F, -4.892F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.0524F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 32, 20, -0.5F, 0.7F, -0.1F, 1, 1, 5, -0.2F, false));

        this.Neckbase = new ModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, -0.1726F, -4.892F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, 0.0456F, 0.0F, 0.0F);


        this.Neckbase_r1 = new ModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(0.0F, 0.2576F, -3.8624F);
        this.Neckbase.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, 0.0524F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 40, 18, -0.5F, 0.3F, 0.0F, 1, 1, 4, -0.2F, false));

        this.Neckend = new ModelRenderer(this);
        this.Neckend.setRotationPoint(0.0F, 0.2576F, -3.6624F);
        this.Neckbase.addChild(Neckend);
        this.setRotateAngle(Neckend, 0.0464F, -0.3492F, 0.0066F);


        this.Neckend_r1 = new ModelRenderer(this);
        this.Neckend_r1.setRotationPoint(0.0F, -0.875F, -3.3935F);
        this.Neckend.addChild(Neckend_r1);
        this.setRotateAngle(Neckend_r1, -0.2618F, 0.0F, 0.0F);
        this.Neckend_r1.cubeList.add(new ModelBox(Neckend_r1, 33, 39, -0.5F, 0.2F, -0.9F, 1, 1, 5, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, -0.775F, -3.7935F);
        this.Neckend.addChild(Head);
        this.setRotateAngle(Head, 0.369F, -0.3152F, 0.0382F);


        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 0.5536F, -0.0352F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.2923F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.2085F, -3.9823F);
        this.Lowerjawback.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.1911F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.2335F, 0.0F, 0.0F);


        this.Lowerjawslope = new ModelRenderer(this);
        this.Lowerjawslope.setRotationPoint(-0.01F, -0.3415F, -2.7323F);
        this.Lowerjawback.addChild(Lowerjawslope);
        this.setRotateAngle(Lowerjawslope, 0.3768F, 0.0F, 0.0F);


        this.Jawparting = new ModelRenderer(this);
        this.Jawparting.setRotationPoint(0.0F, 0.2585F, -2.7323F);
        this.Lowerjawback.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.3183F, 0.0F, 0.0F);


        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, 0.4036F, -4.0852F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, -0.0119F, 0.0F, 0.0F);


        this.Upperjawmiddle = new ModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Upperjawback.addChild(Upperjawmiddle);
        this.setRotateAngle(Upperjawmiddle, -0.1143F, 0.0F, 0.0F);


        this.Nosebridge = new ModelRenderer(this);
        this.Nosebridge.setRotationPoint(0.0F, -3.975F, 0.15F);
        this.Upperjawmiddle.addChild(Nosebridge);
        this.setRotateAngle(Nosebridge, 0.5526F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(-0.01F, -2.0F, -4.05F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.7383F, 0.0F, 0.0F);


        this.Forehead = new ModelRenderer(this);
        this.Forehead.setRotationPoint(0.01F, -2.3464F, -4.5852F);
        this.Head.addChild(Forehead);
        this.setRotateAngle(Forehead, 0.2311F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(1.53F, -1.2447F, -3.7831F);
        this.Head.addChild(bone);
        this.setRotateAngle(bone, -0.3491F, 0.0F, 0.0F);


        this.sailbaseneck = new ModelRenderer(this);
        this.sailbaseneck.setRotationPoint(0.0F, -0.8424F, -6.5624F);
        this.Neckbase.addChild(sailbaseneck);
        this.setRotateAngle(sailbaseneck, 0.4098F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(3.0F, 5.8274F, -7.392F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 1.1114F, 0.4803F, -0.1728F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.5F, 4.4F, 0.4F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.8084F, -0.0597F, 0.4918F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 4.4F, -0.5F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, -0.3226F, -0.1928F, 0.0821F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-3.0F, 5.8274F, -7.392F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.4408F, -0.3815F, 0.4399F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-0.5F, 4.4F, 0.4F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.8501F, -0.0223F, -0.3897F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 4.4F, -0.5F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 1.1475F, 0.1191F, 0.0755F);


        this.sailbasebodyfront = new ModelRenderer(this);
        this.sailbasebodyfront.setRotationPoint(0.0F, -2.6726F, -8.192F);
        this.Bodyfront.addChild(sailbasebodyfront);
        this.setRotateAngle(sailbasebodyfront, 0.0456F, 0.0F, 0.0F);


        this.sailbasebodymiddle = new ModelRenderer(this);
        this.sailbasebodymiddle.setRotationPoint(0.0F, -4.9834F, 1.2422F);
        this.Bodymiddle.addChild(sailbasebodymiddle);
        this.setRotateAngle(sailbasebodymiddle, -0.0456F, 0.0F, 0.0F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 0.3303F, 3.2494F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.1399F, 0.2161F, -0.0302F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 12, 18, -0.5F, 0.209F, -0.031F, 1, 1, 7, -0.2F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.091F, 6.469F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.0099F, 0.0921F, -0.0513F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 0, 21, -0.5F, 0.2907F, -0.1053F, 1, 1, 7, -0.2F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.0907F, 6.7947F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, -0.0467F, 0.2609F, 0.0218F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, -1, 10, -0.5F, 0.2F, -0.4F, 1, 1, 9, -0.2F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.0714F, 0.5661F, 0.0383F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 24, 12, -0.6F, 0.2F, 0.0F, 1, 1, 6, -0.2F, false));

        this.sailbasetail = new ModelRenderer(this);
        this.sailbasetail.setRotationPoint(0.0F, 1.109F, 0.369F);
        this.Tailbase.addChild(sailbasetail);
        this.setRotateAngle(sailbasetail, -0.182F, 0.0F, 0.0F);


        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(1.5F, 1.7303F, -0.4506F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.9657F, -0.3976F, -0.2828F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(1.1F, 4.0F, 0.0F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 1.2579F, -0.1274F, 0.0848F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(-0.5111F, 4.6598F, 1.346F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 0.0F, 0.0F, 0.0213F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-1.5F, 1.7303F, -0.4506F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.3549F, 0.3976F, 0.2828F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-1.1F, 4.0F, 0.0F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 1.6942F, 0.1274F, -0.0848F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.5111F, 4.6598F, 1.346F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.6545F, 0.0F, -0.0213F);


        this.sailbasehips = new ModelRenderer(this);
        this.sailbasehips.setRotationPoint(0.0F, -4.3697F, 5.1494F);
        this.Hips.addChild(sailbasehips);
        this.setRotateAngle(sailbasehips, -0.182F, 0.0F, 0.0F);

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
