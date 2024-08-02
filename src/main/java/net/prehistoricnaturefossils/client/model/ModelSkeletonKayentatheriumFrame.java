package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonKayentatheriumFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Tailbase;
    private final ModelRenderer Tailmiddle;
    private final ModelRenderer Tailend;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Eyeportion;
    private final ModelRenderer Snout;
    private final ModelRenderer Nose;
    private final ModelRenderer Noseunderslope;
    private final ModelRenderer Rightupperfang;
    private final ModelRenderer Rightupperbackteeth;
    private final ModelRenderer leftZygomaticarch;
    private final ModelRenderer rightZygomaticarch;
    private final ModelRenderer Lowerjawbase;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerfrontteeth;
    private final ModelRenderer Rightlowerfang;
    private final ModelRenderer Mouthinterior;
    private final ModelRenderer Jawparting;
    private final ModelRenderer Lowerjawfluff;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Chestslope;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonKayentatheriumFrame() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -6.0F, 3.9F, 1, 6, 1, -0.2F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 0.0F, -8.0F, -9.0F, 1, 8, 1, -0.2F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -7.0F, -8.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -2.1F, -2.0F, -0.5F, 1, 6, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.6F, -3.0F, 12.4F, 1, 7, 1, -0.15F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 16.9F, 6.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.4245F, 0.0F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, 0.1F, -3.5F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.1222F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 20, 12, -0.5F, 0.9F, -0.2F, 1, 1, 4, -0.15F, false));

        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 1.1F, 0.1F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.1017F, -0.042F, 0.0119F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 16, 29, -0.5F, 0.3F, -0.5F, 1, 1, 4, -0.15F, false));

        this.Tailmiddle = new ModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tailbase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.2393F, -0.1697F, -0.0412F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 18, 24, -0.5F, 0.326F, -0.0945F, 1, 1, 4, -0.15F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(-0.01F, 0.126F, 3.8055F);
        this.Tailmiddle.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.3253F, -0.1258F, -0.0363F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 8, 8, -0.49F, 0.0816F, -0.5912F, 1, 1, 5, -0.15F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.8F, -4.0F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.4458F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 20, 18, -0.5F, 0.7F, -8.0F, 1, 1, 4, -0.15F, false));

        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, -0.1F, -3.8F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, -0.2793F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 20, 6, -0.5F, 0.8F, -0.2F, 1, 1, 4, -0.15F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(-0.01F, 0.6F, -7.5F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.0215F, -0.1309F, 0.0028F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 0.3F, -5.2F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.1047F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 0, 6, -0.49F, 0.3686F, 0.0016F, 1, 1, 5, -0.15F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.4F, -5.0F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.2903F, -0.3424F, 0.069F);
        this.Neck.cubeList.add(new ModelBox(Neck, 10, 20, -0.49F, 0.3F, -4.4F, 1, 1, 5, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.01F, -0.3F, -3.0F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.0725F, 0.0975F, 0.0003F);


        this.Eyeportion = new ModelRenderer(this);
        this.Eyeportion.setRotationPoint(-0.01F, -1.5F, -2.0F);
        this.Head.addChild(Eyeportion);
        this.setRotateAngle(Eyeportion, 0.0637F, 0.0F, 0.0F);


        this.Snout = new ModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, 0.0F, -1.1F);
        this.Eyeportion.addChild(Snout);
        this.setRotateAngle(Snout, 0.0637F, 0.0F, 0.0F);


        this.Nose = new ModelRenderer(this);
        this.Nose.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Snout.addChild(Nose);
        this.setRotateAngle(Nose, 0.5095F, 0.0F, 0.0F);


        this.Noseunderslope = new ModelRenderer(this);
        this.Noseunderslope.setRotationPoint(-0.01F, 1.0F, -1.0F);
        this.Nose.addChild(Noseunderslope);
        this.setRotateAngle(Noseunderslope, 0.3821F, 0.0F, 0.0F);


        this.Rightupperfang = new ModelRenderer(this);
        this.Rightupperfang.setRotationPoint(0.6F, 1.5F, -2.1F);
        this.Snout.addChild(Rightupperfang);
        this.setRotateAngle(Rightupperfang, -0.4882F, 0.0F, -0.0213F);


        this.Rightupperbackteeth = new ModelRenderer(this);
        this.Rightupperbackteeth.setRotationPoint(0.78F, 2.3F, -2.3F);
        this.Snout.addChild(Rightupperbackteeth);
        this.setRotateAngle(Rightupperbackteeth, 1.5708F, 0.0F, 0.0F);


        this.leftZygomaticarch = new ModelRenderer(this);
        this.leftZygomaticarch.setRotationPoint(1.9F, 0.4F, 0.9F);
        this.Eyeportion.addChild(leftZygomaticarch);


        this.rightZygomaticarch = new ModelRenderer(this);
        this.rightZygomaticarch.setRotationPoint(-1.88F, 0.4F, 0.9F);
        this.Eyeportion.addChild(rightZygomaticarch);


        this.Lowerjawbase = new ModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.01F, 0.01F, -2.3F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 0.7442F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(-0.01F, 0.866F, -2.5877F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.0848F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 1.45F, 0.39F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.1911F, 0.0F, 0.0F);


        this.Lowerfrontteeth = new ModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, -0.1F, -1.9F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, -0.8067F, 0.0F, 0.0F);


        this.Rightlowerfang = new ModelRenderer(this);
        this.Rightlowerfang.setRotationPoint(0.51F, -0.7F, -0.4F);
        this.Lowerjawfront.addChild(Rightlowerfang);
        this.setRotateAngle(Rightlowerfang, 0.0F, 0.0F, 0.1485F);


        this.Mouthinterior = new ModelRenderer(this);
        this.Mouthinterior.setRotationPoint(-0.01F, -1.0F, -2.0F);
        this.Lowerjawfront.addChild(Mouthinterior);
        this.setRotateAngle(Mouthinterior, 0.2335F, 0.0F, 0.0F);


        this.Jawparting = new ModelRenderer(this);
        this.Jawparting.setRotationPoint(0.02F, 0.0F, 0.3F);
        this.Lowerjawmiddle.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.4671F, 0.0F, 0.0F);


        this.Lowerjawfluff = new ModelRenderer(this);
        this.Lowerjawfluff.setRotationPoint(-0.02F, 1.45F, -0.03F);
        this.Lowerjawmiddle.addChild(Lowerjawfluff);
        this.setRotateAngle(Lowerjawfluff, -0.0637F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(2.2F, 3.5F, -3.5F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, -2.1739F, 0.4451F, -0.4333F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.8F, -0.3838F, 2.642F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, 1.244F, -0.1077F, -0.554F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 3.8559F, 0.1488F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.8467F, -0.0637F, -0.0213F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-2.18F, 3.5F, -3.5F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.5594F, -0.4451F, 0.4333F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-0.8F, -0.3838F, 2.642F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, 0.8805F, 0.5763F, -0.0784F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 3.8559F, 0.1488F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.0555F, 0.0688F, -0.066F);


        this.Chestslope = new ModelRenderer(this);
        this.Chestslope.setRotationPoint(0.0F, 4.5F, -4.5F);
        this.Bodyfront.addChild(Chestslope);
        this.setRotateAngle(Chestslope, -0.1698F, 0.0F, 0.0F);


        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.4F, 1.5F, -1.1F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.5212F, 0.0F, 0.0F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.8F, 3.2F, -0.1F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, -0.3318F, 0.0F, 0.0F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(-0.4F, 0.0729F, 3.3327F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 0.7663F, 0.1006F, -0.0081F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.4F, 1.5F, -1.1F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.2642F, 0.0F, 0.0F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.8F, 3.2F, -0.1F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, -0.6372F, 0.0F, 0.0F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.4F, 0.0729F, 3.3327F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 1.3298F, 0.0637F, 0.2122F);

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
