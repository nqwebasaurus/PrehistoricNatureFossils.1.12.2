package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonOphthalmothuleFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Hips_r2;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Neck1;
    private final ModelRenderer Neckbase_r1;
    private final ModelRenderer Neck2;
    private final ModelRenderer Neckmiddlebase_r1;
    private final ModelRenderer Neck3;
    private final ModelRenderer Neckmiddle_r1;
    private final ModelRenderer Neck4;
    private final ModelRenderer Neckmiddlefront_r1;
    private final ModelRenderer Neck5;
    private final ModelRenderer Neck6;
    private final ModelRenderer Neckfront_r1;
    private final ModelRenderer head;
    private final ModelRenderer Lefteye;
    private final ModelRenderer Righteye;
    private final ModelRenderer Upperjaw;
    private final ModelRenderer Lowerjaw;
    private final ModelRenderer Masseter;
    private final ModelRenderer Leftfrontflipper1;
    private final ModelRenderer Leftfrontflipper2;
    private final ModelRenderer Leftfrontflipper3;
    private final ModelRenderer Rightfrontflipper1;
    private final ModelRenderer Rightfrontflipper2;
    private final ModelRenderer Rightfrontflipper3;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Tail4;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Tailfluke;
    private final ModelRenderer Tailflukeend_r1;
    private final ModelRenderer Lefthindflipper1;
    private final ModelRenderer Lefthindflipper2;
    private final ModelRenderer Lefthindflipper3;
    private final ModelRenderer Righthindflipper1;
    private final ModelRenderer Righthindflipper2;
    private final ModelRenderer Righthindflipper3;

    public ModelSkeletonOphthalmothuleFrame() {
        this.textureWidth = 80;
        this.textureHeight = 90;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -12.25F, 15.0F);
        this.fossil.addChild(Hips);
        this.setRotateAngle(Hips, 0.0872F, -0.0038F, 0.2616F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, 2.3771F, -0.5732F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 0.0F, -0.0349F, 1.5708F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 7, 54, 2.0F, -5.8F, -0.5F, 1, 10, 1, -0.1F, false));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, 0.0349F, 0.0F, 0.0F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 7, 54, -0.5F, 0.4255F, 0.843F, 1, 4, 1, -0.15F, false));
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 0, 47, -0.5F, 0.3255F, -1.857F, 1, 1, 8, -0.1F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.5F, -1.0F, -3.0F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.0611F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 15, -1.0F, 1.4F, -18.1F, 1, 1, 18, -0.15F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(-0.5F, 0.0F, -18.1F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0436F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, -1, 14, -0.5F, 1.4461F, -5.9883F, 1, 1, 7, -0.1F, false));
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 5, 20, -0.5F, 1.5461F, -4.9883F, 1, 5, 1, -0.15F, false));
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 5, 20, -5.5F, 6.1461F, -4.9883F, 11, 1, 1, -0.1F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.0461F, -5.2883F);
        this.Bodyfront.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.0873F, 0.0F, 0.0F);


        this.Neckbase_r1 = new ModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(0.0F, -0.3883F, -7.6657F);
        this.Neck1.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, 0.0175F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 44, 30, -0.5F, 1.9F, -0.1F, 1, 1, 8, -0.1F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.0117F, -7.2657F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0436F, 0.0F, 0.0F);


        this.Neckmiddlebase_r1 = new ModelRenderer(this);
        this.Neckmiddlebase_r1.setRotationPoint(0.0F, -0.0228F, -7.4569F);
        this.Neck2.addChild(Neckmiddlebase_r1);
        this.setRotateAngle(Neckmiddlebase_r1, 0.0349F, 0.0F, 0.0F);
        this.Neckmiddlebase_r1.cubeList.add(new ModelBox(Neckmiddlebase_r1, 41, 43, -0.5F, 1.8F, 0.0F, 1, 1, 8, -0.1F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 0.2272F, -6.6569F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0869F, -0.0076F, -0.0869F);


        this.Neckmiddle_r1 = new ModelRenderer(this);
        this.Neckmiddle_r1.setRotationPoint(0.0F, 0.0F, -8.8F);
        this.Neck3.addChild(Neckmiddle_r1);
        this.setRotateAngle(Neckmiddle_r1, -0.0873F, 0.0F, 0.0F);
        this.Neckmiddle_r1.cubeList.add(new ModelBox(Neckmiddle_r1, 18, 43, -0.6F, 0.9F, 0.0F, 1, 1, 9, -0.1F, false));

        this.Neck4 = new ModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, 0.25F, -8.8F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, -0.0873F, 0.0F, 0.0F);


        this.Neckmiddlefront_r1 = new ModelRenderer(this);
        this.Neckmiddlefront_r1.setRotationPoint(0.0F, 0.0F, -9.9F);
        this.Neck4.addChild(Neckmiddlefront_r1);
        this.setRotateAngle(Neckmiddlefront_r1, 0.0175F, 0.0F, 0.0F);
        this.Neckmiddlefront_r1.cubeList.add(new ModelBox(Neckmiddlefront_r1, 30, 30, -0.5F, 0.7F, -0.1F, 1, 1, 11, -0.1F, false));

        this.Neck5 = new ModelRenderer(this);
        this.Neck5.setRotationPoint(0.0F, 0.05F, -9.4F);
        this.Neck4.addChild(Neck5);
        this.setRotateAngle(Neck5, -0.0873F, -0.0435F, 0.0038F);
        this.Neck5.cubeList.add(new ModelBox(Neck5, 48, 15, -0.5F, 0.6F, -7.6F, 1, 1, 8, -0.1F, false));

        this.Neck6 = new ModelRenderer(this);
        this.Neck6.setRotationPoint(0.0F, -0.05F, -7.5F);
        this.Neck5.addChild(Neck6);
        this.setRotateAngle(Neck6, -0.132F, -0.1298F, 0.0172F);


        this.Neckfront_r1 = new ModelRenderer(this);
        this.Neckfront_r1.setRotationPoint(0.0F, 0.1F, -4.7F);
        this.Neck6.addChild(Neckfront_r1);
        this.setRotateAngle(Neckfront_r1, -0.0349F, 0.0F, 0.0F);
        this.Neckfront_r1.cubeList.add(new ModelBox(Neckfront_r1, 36, 54, -0.5F, 0.4F, 0.1F, 1, 1, 5, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5F, 0.275F, -4.6F);
        this.Neck6.addChild(head);


        this.Lefteye = new ModelRenderer(this);
        this.Lefteye.setRotationPoint(0.75F, -0.725F, -3.0F);
        this.head.addChild(Lefteye);


        this.Righteye = new ModelRenderer(this);
        this.Righteye.setRotationPoint(-1.75F, -0.725F, -3.0F);
        this.head.addChild(Righteye);


        this.Upperjaw = new ModelRenderer(this);
        this.Upperjaw.setRotationPoint(-0.5F, 0.6F, -3.0F);
        this.head.addChild(Upperjaw);


        this.Lowerjaw = new ModelRenderer(this);
        this.Lowerjaw.setRotationPoint(-0.5F, 0.625F, 0.4083F);
        this.head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.3653F, 0.0033F, 0.0098F);


        this.Masseter = new ModelRenderer(this);
        this.Masseter.setRotationPoint(0.0F, 0.1F, -2.6583F);
        this.Lowerjaw.addChild(Masseter);


        this.Leftfrontflipper1 = new ModelRenderer(this);
        this.Leftfrontflipper1.setRotationPoint(4.9F, 6.9461F, -4.5883F);
        this.Bodyfront.addChild(Leftfrontflipper1);
        this.setRotateAngle(Leftfrontflipper1, -0.3326F, 0.3512F, -0.5957F);


        this.Leftfrontflipper2 = new ModelRenderer(this);
        this.Leftfrontflipper2.setRotationPoint(6.116F, -0.9085F, 2.425F);
        this.Leftfrontflipper1.addChild(Leftfrontflipper2);
        this.setRotateAngle(Leftfrontflipper2, 0.0381F, -0.1704F, -0.2214F);


        this.Leftfrontflipper3 = new ModelRenderer(this);
        this.Leftfrontflipper3.setRotationPoint(5.7023F, 0.0F, -2.3749F);
        this.Leftfrontflipper2.addChild(Leftfrontflipper3);
        this.setRotateAngle(Leftfrontflipper3, 0.0F, -0.2182F, 0.0F);


        this.Rightfrontflipper1 = new ModelRenderer(this);
        this.Rightfrontflipper1.setRotationPoint(-4.9F, 6.9461F, -4.5883F);
        this.Bodyfront.addChild(Rightfrontflipper1);
        this.setRotateAngle(Rightfrontflipper1, -0.0138F, -0.3051F, 0.3163F);


        this.Rightfrontflipper2 = new ModelRenderer(this);
        this.Rightfrontflipper2.setRotationPoint(-6.116F, -0.9085F, 2.425F);
        this.Rightfrontflipper1.addChild(Rightfrontflipper2);
        this.setRotateAngle(Rightfrontflipper2, 0.053F, 0.1664F, 0.3099F);


        this.Rightfrontflipper3 = new ModelRenderer(this);
        this.Rightfrontflipper3.setRotationPoint(-5.7023F, 0.0F, -2.3749F);
        this.Rightfrontflipper2.addChild(Rightfrontflipper3);
        this.setRotateAngle(Rightfrontflipper3, 0.0F, 0.2182F, 0.0F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.35F, 4.2F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.132F, 0.1298F, -0.0172F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 31, 42, -0.5F, 0.4481F, -1.0592F, 1, 1, 7, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.2019F, 4.9408F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0F, 0.0873F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.2F, 0.1F);
        this.Tail2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0524F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 24, -0.5F, 0.8F, -0.1F, 1, 1, 6, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.4F, 5.9F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0F, 0.0873F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.4F, -0.1F);
        this.Tail3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1222F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 44, -0.5F, 0.9F, -0.2F, 1, 1, 6, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.625F, 4.8F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.044F, 0.1308F, -0.0057F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.269F, 0.1789F);
        this.Tail4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1222F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 24, -0.5F, 0.8F, -0.1F, 1, 1, 3, -0.1F, false));

        this.Tailfluke = new ModelRenderer(this);
        this.Tailfluke.setRotationPoint(0.0F, 0.3904F, 3.0169F);
        this.Tail4.addChild(Tailfluke);
        this.setRotateAngle(Tailfluke, -0.0873F, -0.0435F, 0.0038F);


        this.Tailflukeend_r1 = new ModelRenderer(this);
        this.Tailflukeend_r1.setRotationPoint(0.0F, -0.3657F, 0.1605F);
        this.Tailfluke.addChild(Tailflukeend_r1);
        this.setRotateAngle(Tailflukeend_r1, -0.144F, 0.0F, 0.0F);
        this.Tailflukeend_r1.cubeList.add(new ModelBox(Tailflukeend_r1, 17, 55, -0.5F, 0.8229F, -0.2511F, 1, 1, 4, -0.1F, false));

        this.Lefthindflipper1 = new ModelRenderer(this);
        this.Lefthindflipper1.setRotationPoint(5.3F, 4.8F, -1.0F);
        this.Hips.addChild(Lefthindflipper1);
        this.setRotateAngle(Lefthindflipper1, 0.0F, 0.0F, 0.7854F);


        this.Lefthindflipper2 = new ModelRenderer(this);
        this.Lefthindflipper2.setRotationPoint(4.925F, 0.0F, -1.375F);
        this.Lefthindflipper1.addChild(Lefthindflipper2);
        this.setRotateAngle(Lefthindflipper2, 0.0306F, -0.1719F, -0.1772F);


        this.Lefthindflipper3 = new ModelRenderer(this);
        this.Lefthindflipper3.setRotationPoint(9.1043F, -0.5F, 0.4637F);
        this.Lefthindflipper2.addChild(Lefthindflipper3);
        this.setRotateAngle(Lefthindflipper3, 0.0F, -0.2182F, 0.0F);


        this.Righthindflipper1 = new ModelRenderer(this);
        this.Righthindflipper1.setRotationPoint(-4.5F, 4.8F, -1.0F);
        this.Hips.addChild(Righthindflipper1);
        this.setRotateAngle(Righthindflipper1, -0.0666F, 0.2079F, -0.5305F);


        this.Righthindflipper2 = new ModelRenderer(this);
        this.Righthindflipper2.setRotationPoint(-4.925F, 0.0F, -1.375F);
        this.Righthindflipper1.addChild(Righthindflipper2);
        this.setRotateAngle(Righthindflipper2, -0.0077F, 0.1744F, -0.0443F);


        this.Righthindflipper3 = new ModelRenderer(this);
        this.Righthindflipper3.setRotationPoint(-9.1043F, -0.5F, 0.4637F);
        this.Righthindflipper2.addChild(Righthindflipper3);
        this.setRotateAngle(Righthindflipper3, 0.0F, 0.2182F, 0.0F);

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
