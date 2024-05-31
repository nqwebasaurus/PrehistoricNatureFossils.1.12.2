package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCynognathusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Belly;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Neck;
    private final ModelRenderer Neck_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Nose;
    private final ModelRenderer Innernoseslope;
    private final ModelRenderer Upperfrontteeth;
    private final ModelRenderer Rightupperfang;
    private final ModelRenderer Leftupperfang;
    private final ModelRenderer Upperjawteeth;
    private final ModelRenderer Lefteye;
    private final ModelRenderer Righteye;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawmiddleback;
    private final ModelRenderer Lowerjawmiddlefront;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerfrontteeth;
    private final ModelRenderer Lowerfrontteeth2;
    private final ModelRenderer Lowerjawteeth;
    private final ModelRenderer Lowerjawbackslope;
    private final ModelRenderer Lowerjawmiddleslope;
    private final ModelRenderer Headslope;
    private final ModelRenderer Forehead;
    private final ModelRenderer Neckmuscles;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer Tailend;

    public ModelSkeletonCynognathusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -23.0F, -11.2F, 1, 23, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -1.0F, -15.0F, 8.5F, 1, 15, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -14.5F, 9.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -3.3F, -3.5F, -0.5F, 1, 8, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 2.4F, -4.5F, -20.2F, 1, 10, 1, -0.15F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 8.0F, 11.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.4988F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 19, 20, -1.0F, 1.5F, -5.0F, 2, 2, 10, -0.15F, false));

        this.Belly = new ModelRenderer(this);
        this.Belly.setRotationPoint(0.0F, -0.3F, -6.0F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.0848F, 0.0F, 0.0F);
        this.Belly.cubeList.add(new ModelBox(Belly, 0, 15, -1.0F, 1.7999F, -10.9936F, 2, 2, 12, -0.15F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.1F, -10.0F);
        this.Belly.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1073F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 29, 0, -1.0F, 1.8F, -9.0F, 2, 2, 8, -0.15F, false));

        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.5F, 7.6F, -5.8F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.5445F, 0.2634F, -0.406F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.4737F, 4.4099F, 0.647F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.2301F, 0.0359F, 0.4829F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 5.0F, -0.3F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 1.8527F, -0.0539F, 0.0192F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.5F, 7.6F, -5.8F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.3231F, 0.1638F, 0.4532F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.4737F, 4.4099F, 0.647F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -1.1905F, -0.0231F, -0.4522F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 5.0F, -0.3F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 2.3332F, 0.0657F, -0.0067F);


        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.7F, -7.0F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.4497F, 0.2616F, -0.0114F);


        this.Neck_r1 = new ModelRenderer(this);
        this.Neck_r1.setRotationPoint(0.0F, 2.0F, -5.5F);
        this.Neck.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, 0.0873F, 0.0F, 0.0F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, -1, 47, -1.0F, 0.0F, -0.7F, 2, 2, 6, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 2.2F, -4.9F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.3629F, 0.6096F, 0.089F);


        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, -1.6F, -4.5F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.3183F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 0.03F, -3.0F);
        this.Upperjawback.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.0213F, 0.0F, 0.0F);


        this.Nose = new ModelRenderer(this);
        this.Nose.setRotationPoint(0.0F, 2.0F, -2.7F);
        this.Upperjawfront.addChild(Nose);
        this.setRotateAngle(Nose, 0.1274F, 0.0F, 0.0F);


        this.Innernoseslope = new ModelRenderer(this);
        this.Innernoseslope.setRotationPoint(-0.01F, 0.44F, -2.1F);
        this.Nose.addChild(Innernoseslope);
        this.setRotateAngle(Innernoseslope, -0.2546F, 0.0F, 0.0F);


        this.Upperfrontteeth = new ModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, -0.4F, 0.05F);
        this.Innernoseslope.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, 0.2335F, 0.0F, 0.0F);


        this.Rightupperfang = new ModelRenderer(this);
        this.Rightupperfang.setRotationPoint(1.1F, 2.4F, -6.5F);
        this.Upperjawback.addChild(Rightupperfang);
        this.setRotateAngle(Rightupperfang, -0.0186F, -0.0182F, -0.1915F);


        this.Leftupperfang = new ModelRenderer(this);
        this.Leftupperfang.setRotationPoint(-1.1F, 2.4F, -6.5F);
        this.Upperjawback.addChild(Leftupperfang);
        this.setRotateAngle(Leftupperfang, -0.0186F, 0.0182F, 0.1915F);


        this.Upperjawteeth = new ModelRenderer(this);
        this.Upperjawteeth.setRotationPoint(-0.01F, 2.8F, -5.4F);
        this.Upperjawback.addChild(Upperjawteeth);
        this.setRotateAngle(Upperjawteeth, 0.1061F, 0.0F, 0.0F);


        this.Lefteye = new ModelRenderer(this);
        this.Lefteye.setRotationPoint(-1.6F, 1.1F, -1.85F);
        this.Upperjawback.addChild(Lefteye);
        this.setRotateAngle(Lefteye, -0.1274F, -0.0424F, 0.0F);


        this.Righteye = new ModelRenderer(this);
        this.Righteye.setRotationPoint(1.6F, 1.1F, -1.85F);
        this.Upperjawback.addChild(Righteye);
        this.setRotateAngle(Righteye, -0.1274F, 0.0424F, 0.0F);


        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 1.5F, -0.4F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.7854F, 0.0F, 0.0F);


        this.Lowerjawmiddleback = new ModelRenderer(this);
        this.Lowerjawmiddleback.setRotationPoint(0.0F, 0.05F, -4.0F);
        this.Lowerjawback.addChild(Lowerjawmiddleback);
        this.setRotateAngle(Lowerjawmiddleback, 0.3183F, 0.0F, 0.0F);


        this.Lowerjawmiddlefront = new ModelRenderer(this);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 0.0F, -1.6F);
        this.Lowerjawmiddleback.addChild(Lowerjawmiddlefront);
        this.setRotateAngle(Lowerjawmiddlefront, 0.0213F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 2.09F, -2.9F);
        this.Lowerjawmiddlefront.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.1911F, 0.0F, 0.0F);


        this.Lowerfrontteeth = new ModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.01F, -1.8F, -1.3F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, -0.0213F, 0.0F, 0.0F);


        this.Lowerfrontteeth2 = new ModelRenderer(this);
        this.Lowerfrontteeth2.setRotationPoint(-0.01F, -1.8F, -1.3F);
        this.Lowerjawfront.addChild(Lowerfrontteeth2);
        this.setRotateAngle(Lowerfrontteeth2, -0.0213F, 0.0F, 0.0F);


        this.Lowerjawteeth = new ModelRenderer(this);
        this.Lowerjawteeth.setRotationPoint(0.0F, 0.7F, -4.2F);
        this.Lowerjawmiddleback.addChild(Lowerjawteeth);
        this.setRotateAngle(Lowerjawteeth, 0.1061F, 0.0F, 0.0F);


        this.Lowerjawbackslope = new ModelRenderer(this);
        this.Lowerjawbackslope.setRotationPoint(-0.01F, 2.7F, -2.0F);
        this.Lowerjawmiddleback.addChild(Lowerjawbackslope);
        this.setRotateAngle(Lowerjawbackslope, -0.1061F, 0.0F, 0.0F);


        this.Lowerjawmiddleslope = new ModelRenderer(this);
        this.Lowerjawmiddleslope.setRotationPoint(0.01F, 2.78F, -1.55F);
        this.Lowerjawmiddleback.addChild(Lowerjawmiddleslope);
        this.setRotateAngle(Lowerjawmiddleslope, -0.2227F, 0.0F, 0.0F);


        this.Headslope = new ModelRenderer(this);
        this.Headslope.setRotationPoint(-0.01F, -1.5F, -4.5F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.2972F, 0.0F, 0.0F);


        this.Forehead = new ModelRenderer(this);
        this.Forehead.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.Headslope.addChild(Forehead);
        this.setRotateAngle(Forehead, 0.2122F, 0.0F, 0.0F);


        this.Neckmuscles = new ModelRenderer(this);
        this.Neckmuscles.setRotationPoint(0.0F, -1.0F, 0.3F);
        this.Neck.addChild(Neckmuscles);
        this.setRotateAngle(Neckmuscles, -0.1398F, 0.0F, 0.0F);


        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.1F, 4.5028F, 0.047F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.4296F, 0.0898F, -0.1499F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.4695F, 5.9968F, -0.3414F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.2319F, -0.0184F, 0.1736F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 4.7737F, 1.1208F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.1274F, 0.0F, 0.0F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.1F, 4.5028F, 0.047F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.6469F, -0.12F, 0.127F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.4695F, 5.9968F, -0.3414F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.6683F, 0.0184F, -0.1736F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 4.7737F, 1.1208F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.1274F, 0.0F, 0.0F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.0983F, 4.4682F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.0194F, -0.2293F, -0.1275F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 26, 43, -0.5F, 1.6F, 0.1F, 1, 2, 6, -0.15F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 1.0668F, 6.1593F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.1541F, -0.2299F, -0.1264F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, -1, 37, -0.5F, 0.6003F, -0.7335F, 1, 1, 8, -0.15F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.0796F, 6.8372F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.242F, -0.1636F, -0.0612F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 37, 36, -0.5F, 0.7045F, -0.1153F, 1, 1, 8, -0.15F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.1045F, 6.8847F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.4783F, -0.1733F, -0.0207F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 39, 29, -0.5F, 0.8073F, -0.0856F, 1, 1, 7, -0.15F, false));

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
