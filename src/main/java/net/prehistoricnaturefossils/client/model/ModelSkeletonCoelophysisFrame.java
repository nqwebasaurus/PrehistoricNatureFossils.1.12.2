package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCoelophysisFrame extends ModelBase {
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
    private final ModelRenderer Neckmiddle;
    private final ModelRenderer Neckmiddle_r1;
    private final ModelRenderer Neckmiddle_r2;
    private final ModelRenderer Neckend;
    private final ModelRenderer Neckend_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjawbase;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Leftlowerteeth;
    private final ModelRenderer Rightlowerteeth;
    private final ModelRenderer Rightlowerteeth2;
    private final ModelRenderer Jawparting;
    private final ModelRenderer Upperjawbase;
    private final ModelRenderer Upperjawend;
    private final ModelRenderer Snout;
    private final ModelRenderer Leftupperfrontteeth;
    private final ModelRenderer Rightupperfrontteeth;
    private final ModelRenderer Headslope;
    private final ModelRenderer Leftupperbackteeth;
    private final ModelRenderer Rightupperbackteeth;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Righthand;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Lefthand;
    private final ModelRenderer Shoulderquills;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailbase_r1;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailmiddlebase_r1;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailmiddleend_r1;
    private final ModelRenderer Tailend;
    private final ModelRenderer Tailend_r1;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Rightankle;
    private final ModelRenderer Rightfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Leftankle;
    private final ModelRenderer Leftfoot;

    public ModelSkeletonCoelophysisFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -18.0F, -2.0F, 1, 18, 1, -0.1F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -12.0F, -1.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -6.1F, -3.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.8F, -13.2F, -18.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.7F, -4.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.8F, -13.2F, -18.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2618F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.5F, -4.8F, -0.5F, 1, 18, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -20.6F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 1.6F, -0.5F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.0637F, 0.0F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, 1.9702F, 0.4353F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.0175F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 37, 36, -0.5F, -1.3016F, -4.1595F, 1, 1, 9, -0.1F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(-0.01F, -0.3298F, -3.6647F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.0286F, -0.0872F, 0.0025F);


        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, 2.2145F, -6.0226F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, 0.0436F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 32, 2, -0.5F, -1.0F, -3.5F, 1, 1, 10, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.2145F, -9.5226F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1373F, -0.1297F, -0.0179F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 0.4128F, -0.1452F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0524F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 0, 47, -0.5F, 0.75F, -6.8F, 1, 1, 7, -0.1F, false));

        this.Neckbase = new ModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, 0.6628F, -6.8452F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.296F, 0.0F, 0.0F);


        this.Neckbase_r1 = new ModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(0.0F, -0.0924F, -3.1767F);
        this.Neckbase.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, -0.2269F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 9, 45, -0.5F, -0.1987F, -0.4632F, 1, 1, 5, -0.1F, false));

        this.Neckmiddle = new ModelRenderer(this);
        this.Neckmiddle.setRotationPoint(0.0F, -0.7848F, -3.5897F);
        this.Neckbase.addChild(Neckmiddle);
        this.setRotateAngle(Neckmiddle, -0.4098F, 0.2431F, 0.1373F);


        this.Neckmiddle_r1 = new ModelRenderer(this);
        this.Neckmiddle_r1.setRotationPoint(0.0F, 0.1828F, -4.2879F);
        this.Neckmiddle.addChild(Neckmiddle_r1);
        this.setRotateAngle(Neckmiddle_r1, 0.1571F, 0.0F, 0.0F);
        this.Neckmiddle_r1.cubeList.add(new ModelBox(Neckmiddle_r1, 0, 25, -0.5F, 0.2171F, -3.9025F, 1, 1, 5, -0.1F, false));

        this.Neckmiddle_r2 = new ModelRenderer(this);
        this.Neckmiddle_r2.setRotationPoint(0.0F, 0.1828F, 0.3121F);
        this.Neckmiddle.addChild(Neckmiddle_r2);
        this.setRotateAngle(Neckmiddle_r2, -0.0175F, 0.0F, 0.0F);
        this.Neckmiddle_r2.cubeList.add(new ModelBox(Neckmiddle_r2, 43, 55, -0.5F, 0.118F, -3.6524F, 1, 1, 4, -0.1F, false));

        this.Neckend = new ModelRenderer(this);
        this.Neckend.setRotationPoint(0.01F, 0.6623F, -8.5523F);
        this.Neckmiddle.addChild(Neckend);
        this.setRotateAngle(Neckend, 0.3424F, 0.425F, 0.2302F);


        this.Neckend_r1 = new ModelRenderer(this);
        this.Neckend_r1.setRotationPoint(0.0F, -0.8388F, -4.8388F);
        this.Neckend.addChild(Neckend_r1);
        this.setRotateAngle(Neckend_r1, 0.2269F, 0.0F, 0.0F);
        this.Neckend_r1.cubeList.add(new ModelBox(Neckend_r1, 18, 18, -0.5F, 2.3996F, -0.2199F, 1, 1, 5, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.7955F, -4.1714F);
        this.Neckend.addChild(Head);
        this.setRotateAngle(Head, 0.3609F, 0.0F, 0.0F);


        this.Lowerjawbase = new ModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 2.0F, 0.7F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 0.2269F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.01F, 1.0F, -2.9F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, -0.0637F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.0424F, 0.0F, 0.0F);


        this.Leftlowerteeth = new ModelRenderer(this);
        this.Leftlowerteeth.setRotationPoint(-0.9F, -0.2F, -1.9F);
        this.Lowerjawmiddle.addChild(Leftlowerteeth);
        this.setRotateAngle(Leftlowerteeth, -0.0424F, -0.1344F, 0.0F);


        this.Rightlowerteeth = new ModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(0.9F, -0.2F, -1.9F);
        this.Lowerjawmiddle.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, -0.0424F, 0.1344F, 0.0F);


        this.Rightlowerteeth2 = new ModelRenderer(this);
        this.Rightlowerteeth2.setRotationPoint(-0.92F, -0.2F, -1.9F);
        this.Lowerjawmiddle.addChild(Rightlowerteeth2);
        this.setRotateAngle(Rightlowerteeth2, -0.0424F, -0.1344F, 0.0F);


        this.Jawparting = new ModelRenderer(this);
        this.Jawparting.setRotationPoint(-0.01F, 0.2F, -3.5F);
        this.Lowerjawbase.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.2335F, 0.0F, 0.0F);


        this.Upperjawbase = new ModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, 1.1F, -3.83F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.0637F, 0.0F, 0.0F);


        this.Upperjawend = new ModelRenderer(this);
        this.Upperjawend.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Upperjawbase.addChild(Upperjawend);
        this.setRotateAngle(Upperjawend, -0.1274F, 0.0F, 0.0F);


        this.Snout = new ModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, -2.7F, -0.2F);
        this.Upperjawend.addChild(Snout);
        this.setRotateAngle(Snout, 0.3183F, 0.0F, 0.0F);


        this.Leftupperfrontteeth = new ModelRenderer(this);
        this.Leftupperfrontteeth.setRotationPoint(-1.0F, -0.5F, 0.5F);
        this.Upperjawend.addChild(Leftupperfrontteeth);
        this.setRotateAngle(Leftupperfrontteeth, -0.0424F, -0.2335F, 0.1485F);


        this.Rightupperfrontteeth = new ModelRenderer(this);
        this.Rightupperfrontteeth.setRotationPoint(1.0F, -0.5F, 0.5F);
        this.Upperjawend.addChild(Rightupperfrontteeth);
        this.setRotateAngle(Rightupperfrontteeth, -0.0424F, 0.2335F, -0.1485F);


        this.Headslope = new ModelRenderer(this);
        this.Headslope.setRotationPoint(0.0F, -1.85F, 0.0F);
        this.Upperjawbase.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.0175F, 0.0F, 0.0F);


        this.Leftupperbackteeth = new ModelRenderer(this);
        this.Leftupperbackteeth.setRotationPoint(-1.25F, 0.55F, -4.1F);
        this.Upperjawbase.addChild(Leftupperbackteeth);
        this.setRotateAngle(Leftupperbackteeth, 0.0873F, 0.0F, 0.0F);


        this.Rightupperbackteeth = new ModelRenderer(this);
        this.Rightupperbackteeth.setRotationPoint(1.25F, 0.55F, -4.1F);
        this.Upperjawbase.addChild(Rightupperbackteeth);
        this.setRotateAngle(Rightupperbackteeth, 0.0873F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(2.75F, 5.0628F, -4.8452F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.4002F, 0.0F, 0.0F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.49F, 4.3647F, 0.9088F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.8873F, 0.2398F, 0.1911F);


        this.Righthand = new ModelRenderer(this);
        this.Righthand.setRotationPoint(1.1F, 3.2F, -0.5F);
        this.Rightlowerarm.addChild(Righthand);
        this.setRotateAngle(Righthand, 0.1485F, 0.0F, 0.4458F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-2.73F, 5.0628F, -4.8452F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.824F, -0.2424F, -0.2537F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-0.49F, 4.3647F, 0.9088F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -1.0849F, 0.0F, 0.0F);


        this.Lefthand = new ModelRenderer(this);
        this.Lefthand.setRotationPoint(-1.1F, 3.2F, -0.5F);
        this.Leftlowerarm.addChild(Lefthand);
        this.setRotateAngle(Lefthand, 0.1485F, 0.0F, -0.4458F);


        this.Shoulderquills = new ModelRenderer(this);
        this.Shoulderquills.setRotationPoint(0.0F, -1.0372F, -4.4452F);
        this.Bodyfront.addChild(Shoulderquills);
        this.setRotateAngle(Shoulderquills, 0.1698F, 0.0F, 0.0F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.1298F, 4.3353F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.0455F, 0.1744F, -0.0079F);


        this.Tailbase_r1 = new ModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, 1.4743F, 0.5545F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, 0.0349F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 34, 14, -0.5F, -0.6F, 0.1F, 1, 1, 10, -0.1F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.1257F, 9.6545F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.0878F, 0.0869F, 0.0076F);


        this.Tailmiddlebase_r1 = new ModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.0F, 0.1038F, 0.9873F);
        this.Tailmiddlebase.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, 0.0524F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 18, 18, -0.5F, 0.5F, -0.9F, 1, 1, 13, -0.1F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.3962F, 12.4873F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, -0.0968F, -0.1303F, 0.0126F);


        this.Tailmiddleend_r1 = new ModelRenderer(this);
        this.Tailmiddleend_r1.setRotationPoint(0.0F, 0.0046F, 0.4042F);
        this.Tailmiddleend.addChild(Tailmiddleend_r1);
        this.setRotateAngle(Tailmiddleend_r1, 0.0524F, 0.0F, 0.0F);
        this.Tailmiddleend_r1.cubeList.add(new ModelBox(Tailmiddleend_r1, 0, 18, -0.5F, 0.4F, -0.5F, 1, 1, 15, -0.1F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -0.8954F, 14.4042F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.1801F, -0.2147F, 0.0388F);


        this.Tailend_r1 = new ModelRenderer(this);
        this.Tailend_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tailend.addChild(Tailend_r1);
        this.setRotateAngle(Tailend_r1, 0.0349F, 0.0F, 0.0F);
        this.Tailend_r1.cubeList.add(new ModelBox(Tailend_r1, 0, 0, -0.5F, 0.5F, 0.0F, 1, 1, 16, -0.1F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.0F, 1.1702F, -0.9647F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.8645F, 0.0F, 0.0F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.5F, 7.554F, 0.8771F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 1.8975F, 0.0F, 0.0F);


        this.Rightankle = new ModelRenderer(this);
        this.Rightankle.setRotationPoint(-0.01F, 7.1288F, 0.483F);
        this.Rightshin.addChild(Rightankle);
        this.setRotateAngle(Rightankle, -1.6828F, 0.0F, 0.0F);


        this.Rightfoot = new ModelRenderer(this);
        this.Rightfoot.setRotationPoint(0.0F, 4.3F, -0.6F);
        this.Rightankle.addChild(Rightfoot);
        this.setRotateAngle(Rightfoot, 1.5425F, 0.0F, 0.0F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.0F, 1.1702F, -0.9647F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.3845F, 0.0F, 0.0F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.5F, 7.554F, 0.8771F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 1.1994F, 0.0F, 0.0F);


        this.Leftankle = new ModelRenderer(this);
        this.Leftankle.setRotationPoint(0.01F, 7.1288F, 0.483F);
        this.Leftshin.addChild(Leftankle);
        this.setRotateAngle(Leftankle, -1.072F, 0.0F, 0.0F);


        this.Leftfoot = new ModelRenderer(this);
        this.Leftfoot.setRotationPoint(0.0F, 4.3F, -0.6F);
        this.Leftankle.addChild(Leftfoot);
        this.setRotateAngle(Leftfoot, 0.3208F, 0.0F, 0.0F);

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
