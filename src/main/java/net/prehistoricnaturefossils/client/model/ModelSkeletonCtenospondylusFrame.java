package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCtenospondylusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Neckbase;
    private final ModelRenderer Neckend;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerfrontteeth;
    private final ModelRenderer Lowerjawslope;
    private final ModelRenderer Leftlowerteeth;
    private final ModelRenderer Rightlowerteeth;
    private final ModelRenderer Rightlowerteeth2;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperjawmiddle;
    private final ModelRenderer Nosebridge;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Upperfrontteeth;
    private final ModelRenderer Leftupperfrontteeth;
    private final ModelRenderer Rightupperfrontteeth;
    private final ModelRenderer Rightupperfrontteeth2;
    private final ModelRenderer Leftupperbackteeth;
    private final ModelRenderer Rightupperteethback;
    private final ModelRenderer Leftupperteethback;
    private final ModelRenderer Forehead;
    private final ModelRenderer Sailfrontend;
    private final ModelRenderer Sailfrontbase;
    private final ModelRenderer Sailfrontendbase;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Sailmiddlefront;
    private final ModelRenderer Sailmiddlefrontbase;
    private final ModelRenderer Sailmiddle;
    private final ModelRenderer Sailmiddlebase;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailend;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;
    private final ModelRenderer Sailend;
    private final ModelRenderer Sailendbase;

    public ModelSkeletonCtenospondylusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.4F, 0.0F, 14.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0175F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.0F, -9.0F, -1.0F, 1, 9, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.1F, -12.0F, 14.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0175F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -4.5F, -3.0F, -0.5F, 1, 6, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(2.7F, -10.5F, -11.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2007F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -2.0F, -4.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(2.7F, -10.5F, -11.8F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2007F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.5F, -4.5F, -0.5F, 1, 15, 1, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 10.7F, 11.7F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.4554F, 0.0F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, 0.4F, -5.0F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 0.0698F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 30, -1.0F, 2.2679F, 0.6769F, 2, 2, 7, -0.15F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, 2.3924F, -3.7409F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.3696F, -0.0784F, -0.0385F);


        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, -0.5866F, -0.0295F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, -0.096F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 0, 0, -1.0F, 0.623F, -12.9701F, 2, 2, 13, -0.15F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.9F, -12.0F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0196F, -0.1304F, -0.0115F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, -0.0748F, -8.6524F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.0175F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 15, 16, -1.0F, -0.325F, -0.925F, 2, 2, 9, -0.15F, false));

        this.Neckbase = new ModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, -0.7994F, -8.4378F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.3897F, -0.1306F, -0.009F);
        this.Neckbase.cubeList.add(new ModelBox(Neckbase, 49, 48, -1.0F, 0.4262F, -2.8593F, 2, 2, 3, -0.15F, false));

        this.Neckend = new ModelRenderer(this);
        this.Neckend.setRotationPoint(0.0F, 0.1126F, -2.4223F);
        this.Neckbase.addChild(Neckend);
        this.setRotateAngle(Neckend, -0.131F, -0.1173F, -0.0582F);
        this.Neckend.cubeList.add(new ModelBox(Neckend, 50, 22, -1.0F, 0.3017F, -2.8486F, 2, 2, 3, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, -0.1983F, -2.2486F);
        this.Neckend.addChild(Head);
        this.setRotateAngle(Head, 0.4158F, -0.0723F, -0.0489F);


        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 1.1003F, 0.0255F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.5236F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.65F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.1911F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 1.8F, -4.3F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.2335F, 0.0F, 0.0F);


        this.Lowerfrontteeth = new ModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, 0.7006F, 0.0F, 0.0F);


        this.Lowerjawslope = new ModelRenderer(this);
        this.Lowerjawslope.setRotationPoint(-0.01F, -0.1F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawslope);
        this.setRotateAngle(Lowerjawslope, 0.3768F, 0.0F, 0.0F);


        this.Leftlowerteeth = new ModelRenderer(this);
        this.Leftlowerteeth.setRotationPoint(-1.5F, 0.6F, 0.0F);
        this.Lowerjawslope.addChild(Leftlowerteeth);
        this.setRotateAngle(Leftlowerteeth, -0.0637F, -0.1698F, 0.0F);


        this.Rightlowerteeth = new ModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(1.5F, 0.6F, 0.0F);
        this.Lowerjawslope.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, -0.0637F, 0.1698F, 0.0F);


        this.Rightlowerteeth2 = new ModelRenderer(this);
        this.Rightlowerteeth2.setRotationPoint(-1.46F, 0.6F, 0.0F);
        this.Lowerjawslope.addChild(Rightlowerteeth2);
        this.setRotateAngle(Rightlowerteeth2, -0.0637F, -0.1698F, 0.0F);


        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, -0.5497F, -3.9745F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.4245F, 0.0F, 0.0F);


        this.Upperjawmiddle = new ModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Upperjawback.addChild(Upperjawmiddle);
        this.setRotateAngle(Upperjawmiddle, -0.5943F, 0.0F, 0.0F);


        this.Nosebridge = new ModelRenderer(this);
        this.Nosebridge.setRotationPoint(0.0F, -4.1F, -0.75F);
        this.Upperjawmiddle.addChild(Nosebridge);
        this.setRotateAngle(Nosebridge, 0.6374F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(-0.01F, -2.5F, -2.8F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.9128F, 0.0F, 0.0F);


        this.Upperfrontteeth = new ModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, 1.2F, -2.5F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, -0.2972F, 0.0F, 0.0F);


        this.Leftupperfrontteeth = new ModelRenderer(this);
        this.Leftupperfrontteeth.setRotationPoint(-1.3F, -0.5F, -3.0F);
        this.Upperjawmiddle.addChild(Leftupperfrontteeth);
        this.setRotateAngle(Leftupperfrontteeth, 0.2759F, -0.0637F, 0.0F);


        this.Rightupperfrontteeth = new ModelRenderer(this);
        this.Rightupperfrontteeth.setRotationPoint(1.3F, -0.5F, -3.0F);
        this.Upperjawmiddle.addChild(Rightupperfrontteeth);
        this.setRotateAngle(Rightupperfrontteeth, 0.2759F, 0.0637F, 0.0F);


        this.Rightupperfrontteeth2 = new ModelRenderer(this);
        this.Rightupperfrontteeth2.setRotationPoint(-1.28F, -0.5F, -3.0F);
        this.Upperjawmiddle.addChild(Rightupperfrontteeth2);
        this.setRotateAngle(Rightupperfrontteeth2, 0.2759F, -0.0637F, 0.0F);


        this.Leftupperbackteeth = new ModelRenderer(this);
        this.Leftupperbackteeth.setRotationPoint(-1.8F, 1.7F, 1.17F);
        this.Upperjawback.addChild(Leftupperbackteeth);
        this.setRotateAngle(Leftupperbackteeth, -0.1061F, -0.0213F, 0.0F);


        this.Rightupperteethback = new ModelRenderer(this);
        this.Rightupperteethback.setRotationPoint(1.8F, 1.7F, 1.17F);
        this.Upperjawback.addChild(Rightupperteethback);
        this.setRotateAngle(Rightupperteethback, -0.1061F, 0.0213F, 0.0F);


        this.Leftupperteethback = new ModelRenderer(this);
        this.Leftupperteethback.setRotationPoint(-1.78F, 1.7F, 1.17F);
        this.Upperjawback.addChild(Leftupperteethback);
        this.setRotateAngle(Leftupperteethback, -0.1061F, -0.0213F, 0.0F);


        this.Forehead = new ModelRenderer(this);
        this.Forehead.setRotationPoint(0.01F, -2.7497F, -4.2745F);
        this.Head.addChild(Forehead);
        this.setRotateAngle(Forehead, 0.5009F, 0.0F, 0.0F);


        this.Sailfrontend = new ModelRenderer(this);
        this.Sailfrontend.setRotationPoint(0.0F, -2.6983F, -1.3486F);
        this.Neckend.addChild(Sailfrontend);
        this.setRotateAngle(Sailfrontend, 0.3609F, 0.0F, 0.0F);


        this.Sailfrontbase = new ModelRenderer(this);
        this.Sailfrontbase.setRotationPoint(0.0F, -0.9738F, -2.1593F);
        this.Neckbase.addChild(Sailfrontbase);
        this.setRotateAngle(Sailfrontbase, 0.0848F, 0.0F, 0.0F);


        this.Sailfrontendbase = new ModelRenderer(this);
        this.Sailfrontendbase.setRotationPoint(0.5F, -2.2F, -0.1F);
        this.Sailfrontbase.addChild(Sailfrontendbase);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.0F, 6.3102F, -7.4209F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.1904F, -0.4462F, 0.7797F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.1081F, 5.7332F, 0.8983F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.8717F, 0.2046F, -0.9188F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0036F, 5.271F, -0.4813F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.4768F, -0.0193F, 0.0473F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.0F, 6.3102F, -7.4209F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.883F, 0.8834F, -0.3188F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.1081F, 5.7332F, 0.8983F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -1.0424F, -0.2502F, 0.9653F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.0036F, 5.271F, -0.4813F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.3055F, 0.0005F, 0.0028F);


        this.Sailmiddlefront = new ModelRenderer(this);
        this.Sailmiddlefront.setRotationPoint(-0.01F, -3.8995F, -8.3435F);
        this.Bodyfront.addChild(Sailmiddlefront);
        this.setRotateAngle(Sailmiddlefront, -0.0637F, 0.0F, 0.0F);


        this.Sailmiddlefrontbase = new ModelRenderer(this);
        this.Sailmiddlefrontbase.setRotationPoint(0.5F, -2.1F, 1.7F);
        this.Sailmiddlefront.addChild(Sailmiddlefrontbase);


        this.Sailmiddle = new ModelRenderer(this);
        this.Sailmiddle.setRotationPoint(0.0F, -5.0F, -12.0F);
        this.Bodymiddle.addChild(Sailmiddle);


        this.Sailmiddlebase = new ModelRenderer(this);
        this.Sailmiddlebase.setRotationPoint(0.5F, -1.3F, -1.0F);
        this.Sailmiddle.addChild(Sailmiddlebase);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 1.7408F, 2.1241F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.1271F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 32, 0, -1.0F, 0.3893F, 0.0716F, 2, 1, 7, -0.15F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.1388F, 6.4804F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, -0.0173F, 0.493F, 0.184F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 29, 13, -0.5F, 0.2454F, -0.447F, 1, 1, 8, -0.15F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.1546F, 7.053F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.1115F, 0.2179F, 0.0396F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 18, 0, -0.5F, 0.5F, 0.0F, 1, 1, 11, -0.15F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.1F, 10.5F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.1503F, 0.53F, 0.21F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 0, 16, -0.5F, 0.5F, 0.0F, 1, 1, 12, -0.15F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.3F, 3.8F, 4.4F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.7346F, -0.6132F, -0.6981F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.7366F, 4.632F, -0.3153F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 1.2907F, -0.199F, 0.166F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 6.7F, 1.5F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 0.2092F, 0.0038F, -0.0218F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.3F, 3.8F, 4.4F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.0172F, 0.2245F, 1.0985F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.7366F, 4.632F, -0.3153F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 1.1553F, 0.313F, -0.1822F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 6.7F, 1.5F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.1984F, 0.0164F, -0.377F);


        this.Sailend = new ModelRenderer(this);
        this.Sailend.setRotationPoint(0.01F, -1.9F, -6.4F);
        this.Hips.addChild(Sailend);
        this.setRotateAngle(Sailend, 0.2276F, 0.0F, 0.0F);


        this.Sailendbase = new ModelRenderer(this);
        this.Sailendbase.setRotationPoint(0.5F, -1.1F, 0.4F);
        this.Sailend.addChild(Sailendbase);
        this.setRotateAngle(Sailendbase, -0.6283F, 0.0F, 0.0F);

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
