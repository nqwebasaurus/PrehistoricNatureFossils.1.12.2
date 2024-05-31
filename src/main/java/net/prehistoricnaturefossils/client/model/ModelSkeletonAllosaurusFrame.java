package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAllosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer bone;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Neck1;
    private final ModelRenderer Neckbase_r1;
    private final ModelRenderer Neck2;
    private final ModelRenderer Neckmiddlebase_r1;
    private final ModelRenderer Neck3;
    private final ModelRenderer Neckmiddlefront_r1;
    private final ModelRenderer Neck4;
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
    private final ModelRenderer Tailbase_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tailmiddlebase_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tailmiddle_r1;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tailmiddleend_r1;
    private final ModelRenderer Tail5;
    private final ModelRenderer Tail6;

    public ModelSkeletonAllosaurusFrame() {
        this.textureWidth = 112;
        this.textureHeight = 120;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 22.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 108, 85, -0.5F, -31.7F, 3.5F, 1, 34, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-5.7F, -19.15F, -19.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.4712F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 108, 86, -0.5F, -11.55F, -0.5F, 1, 33, 1, -0.21F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-5.7F, -19.15F, -19.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4712F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 108, 108, 4.45F, -5.0F, -0.5F, 1, 11, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -14.7F, 4.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 108, 107, 15.9F, -6.0F, -0.5F, 1, 12, 1, -0.2F, false));

        this.Root = new ModelRenderer(this);
        this.Root.setRotationPoint(0.0F, -29.0F, -1.0F);
        this.fossil.addChild(Root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -2.2F, 1.0F);
        this.Root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1309F, 0.0F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, -1.3916F, -2.5257F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 0.0524F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 84, 106, -0.5F, 0.7F, -0.5F, 1, 1, 13, -0.2F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -1.3095F, -2.7516F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1787F, 0.2148F, 0.0385F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 86, 107, -0.5F, 0.702F, -11.9084F, 1, 1, 12, -0.2F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.5388F, -11.8773F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.112F, 0.2703F, -0.0548F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(-1.0F, 0.3693F, -7.3649F);
        this.Bodyfront.addChild(bone);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(1.0F, -0.5887F, -2.371F);
        this.bone.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.0698F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 88, 108, -0.8F, 0.7F, -0.9F, 1, 1, 11, -0.2F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.1715F, -8.94F);
        this.Bodyfront.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.3996F, 0.2079F, -0.0666F);


        this.Neckbase_r1 = new ModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(0.0F, -0.5949F, -2.5783F);
        this.Neck1.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, -0.2618F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 102, 115, -0.6F, 0.8F, -1.3F, 1, 1, 4, -0.2F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -1.0253F, -3.6393F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2366F, 0.2744F, 0.0175F);


        this.Neckmiddlebase_r1 = new ModelRenderer(this);
        this.Neckmiddlebase_r1.setRotationPoint(0.0F, 0.2706F, -4.3467F);
        this.Neck2.addChild(Neckmiddlebase_r1);
        this.setRotateAngle(Neckmiddlebase_r1, -0.1309F, 0.0F, 0.0F);
        this.Neckmiddlebase_r1.cubeList.add(new ModelBox(Neckmiddlebase_r1, 100, 114, -0.5F, 0.1F, 0.0F, 1, 1, 5, -0.2F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -0.7008F, -4.3985F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0648F, 0.0671F, 0.0473F);


        this.Neckmiddlefront_r1 = new ModelRenderer(this);
        this.Neckmiddlefront_r1.setRotationPoint(0.3F, 2.0611F, -3.5048F);
        this.Neck3.addChild(Neckmiddlefront_r1);
        this.setRotateAngle(Neckmiddlefront_r1, 0.0F, -0.0698F, 0.0F);
        this.Neckmiddlefront_r1.cubeList.add(new ModelBox(Neckmiddlefront_r1, 100, 114, -0.5F, -1.0F, -0.4F, 1, 1, 5, -0.2F, false));

        this.Neck4 = new ModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, 0.1345F, -3.3428F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, 0.1039F, 0.0025F, -0.13F);
        this.Neck4.cubeList.add(new ModelBox(Neck4, 102, 115, -0.5F, 0.7962F, -4.0872F, 1, 1, 4, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.1246F, -3.736F);
        this.Neck4.addChild(Head);
        this.setRotateAngle(Head, -0.0812F, 0.2577F, 0.0465F);


        this.Upperjaw = new ModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, -1.4362F, -4.2052F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, 0.0436F, 0.0F, 0.0F);


        this.Lowerjaw = new ModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 2.5638F, 0.7948F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.8744F, 0.0F, 0.0F);


        this.Leftarm1 = new ModelRenderer(this);
        this.Leftarm1.setRotationPoint(5.1F, 7.1806F, -7.8358F);
        this.Bodyfront.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, 0.6209F, 0.2264F, -0.1688F);


        this.Leftarm2 = new ModelRenderer(this);
        this.Leftarm2.setRotationPoint(0.523F, 5.8352F, 0.4069F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, -1.1345F, 0.0F, 0.0F);


        this.Leftarm3 = new ModelRenderer(this);
        this.Leftarm3.setRotationPoint(0.5F, 4.2F, 0.5F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.0F, 0.0F, 0.2182F);


        this.Rightarm1 = new ModelRenderer(this);
        this.Rightarm1.setRotationPoint(-5.1F, 7.1806F, -7.8358F);
        this.Bodyfront.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, 0.4491F, -0.3252F, 0.3184F);


        this.Rightarm2 = new ModelRenderer(this);
        this.Rightarm2.setRotationPoint(-0.523F, 5.8352F, 0.4069F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, -1.1375F, -0.1864F, -0.3254F);


        this.Rightarm3 = new ModelRenderer(this);
        this.Rightarm3.setRotationPoint(-0.5F, 4.2F, 0.5F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, 0.0F, 0.0F, -0.48F);


        this.Leftleg1 = new ModelRenderer(this);
        this.Leftleg1.setRotationPoint(5.0F, -0.2916F, 3.7743F);
        this.Hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, -0.0436F, 0.0F, 0.0F);


        this.Leftleg2 = new ModelRenderer(this);
        this.Leftleg2.setRotationPoint(0.5F, 13.705F, 0.0504F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 0.9559F, -0.1071F, 0.0754F);


        this.Leftleg3 = new ModelRenderer(this);
        this.Leftleg3.setRotationPoint(-0.6F, 14.1556F, 0.7234F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, -0.829F, 0.0F, 0.0F);


        this.Leftleg4 = new ModelRenderer(this);
        this.Leftleg4.setRotationPoint(0.6F, 7.6208F, 0.3391F);
        this.Leftleg3.addChild(Leftleg4);
        this.setRotateAngle(Leftleg4, 0.26F, 0.0283F, -0.1278F);


        this.Leftleg5 = new ModelRenderer(this);
        this.Leftleg5.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Leftleg4.addChild(Leftleg5);
        this.setRotateAngle(Leftleg5, -0.1745F, 0.0F, 0.0F);


        this.Rightleg1 = new ModelRenderer(this);
        this.Rightleg1.setRotationPoint(-5.0F, -0.2916F, 3.7743F);
        this.Hips.addChild(Rightleg1);
        this.setRotateAngle(Rightleg1, -0.8206F, 0.3372F, -0.0373F);


        this.Rightleg2 = new ModelRenderer(this);
        this.Rightleg2.setRotationPoint(-0.5F, 13.705F, 0.0504F);
        this.Rightleg1.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, 1.5708F, 0.1745F, 0.0F);


        this.Rightleg3 = new ModelRenderer(this);
        this.Rightleg3.setRotationPoint(0.6F, 14.1556F, 0.7234F);
        this.Rightleg2.addChild(Rightleg3);
        this.setRotateAngle(Rightleg3, -1.3963F, 0.0F, 0.0F);


        this.Rightleg4 = new ModelRenderer(this);
        this.Rightleg4.setRotationPoint(-0.6F, 7.6208F, 0.3391F);
        this.Rightleg3.addChild(Rightleg4);
        this.setRotateAngle(Rightleg4, 1.3963F, 0.0F, 0.0F);


        this.Rightleg5 = new ModelRenderer(this);
        this.Rightleg5.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Rightleg4.addChild(Rightleg5);
        this.setRotateAngle(Rightleg5, 0.2182F, 0.0F, 0.0F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -2.3916F, 9.7243F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0438F, 0.0872F, 0.0038F);


        this.Tailbase_r1 = new ModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail1.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, -0.0873F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 86, 107, -0.5F, 1.1F, 0.0F, 1, 1, 12, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.853F, 10.5765F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0438F, 0.0872F, 0.0038F);


        this.Tailmiddlebase_r1 = new ModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.0F, 0.2227F, 0.4612F);
        this.Tail2.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, 0.0349F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 84, 106, -0.5F, 1.0F, -0.2F, 1, 1, 13, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.3788F, 12.5266F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0438F, -0.0872F, -0.0038F);


        this.Tailmiddle_r1 = new ModelRenderer(this);
        this.Tailmiddle_r1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Tail3.addChild(Tailmiddle_r1);
        this.setRotateAngle(Tailmiddle_r1, 0.0698F, 0.0F, 0.0F);
        this.Tailmiddle_r1.cubeList.add(new ModelBox(Tailmiddle_r1, 80, 104, -0.5F, 1.7F, 0.0F, 1, 1, 15, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.9F, 14.9F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0358F, -0.218F, 0.0077F);


        this.Tailmiddleend_r1 = new ModelRenderer(this);
        this.Tailmiddleend_r1.setRotationPoint(0.0F, 0.4F, 12.0F);
        this.Tail4.addChild(Tailmiddleend_r1);
        this.setRotateAngle(Tailmiddleend_r1, 0.0698F, 0.0F, 0.0F);
        this.Tailmiddleend_r1.cubeList.add(new ModelBox(Tailmiddleend_r1, 84, 106, -0.5F, -0.2F, -12.9F, 1, 1, 13, -0.2F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, -0.2002F, 12.1105F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.1772F, -0.1719F, 0.0306F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 85, 106, -0.5F, 0.416F, -0.206F, 1, 1, 12, -0.2F, false));

        this.Tail6 = new ModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 0.3072F, 11.8772F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.3193F, -0.2909F, 0.0945F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 86, 107, -0.5F, 0.1708F, -0.3701F, 1, 1, 12, -0.2F, false));

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
