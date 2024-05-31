package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCeratosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Neck1;
    private final ModelRenderer Neckbase_r1;
    private final ModelRenderer Neck2;
    private final ModelRenderer Neckmiddle_r1;
    private final ModelRenderer Neck3;
    private final ModelRenderer Neckfront_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjaw;
    private final ModelRenderer Throat;
    private final ModelRenderer Masseter;
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
    private final ModelRenderer Tail5;
    private final ModelRenderer Tail6;

    public ModelSkeletonCeratosaurusFrame() {
        this.textureWidth = 112;
        this.textureHeight = 115;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.4F, -19.25F, -22.1F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1396F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -9.75F, -0.5F, 1, 29, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.4F, -19.25F, -22.1F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1396F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.75F, -5.0F, -0.5F, 1, 10, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -22.5F, -0.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 4.0F, -6.0F, -0.5F, 1, 12, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -22.5F, -0.8F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0873F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.5F, -5.5F, -0.5F, 1, 28, 1, 0.0F, false));

        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -28.0F, 0.0F);
        this.fossil.addChild(Hips);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, -3.3094F, -6.2303F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.1484F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 24, 16, -1.0F, 1.5958F, -0.0795F, 2, 2, 13, -0.2F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -2.1971F, -5.7691F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.0873F, 0.0F);


        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, -0.6689F, -14.3526F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, -0.0611F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 0, 0, -1.0F, 0.2832F, -0.0577F, 2, 2, 14, -0.2F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.5F, -14.5F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0873F, 0.0435F, 0.0038F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-1.0F, -0.0211F, -7.2217F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.1222F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 17, 32, 0.0F, 1.0476F, -0.4887F, 2, 2, 8, -0.2F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.5762F, -7.4827F);
        this.Bodyfront.addChild(Neck1);
        this.setRotateAngle(Neck1, 0.0F, 0.1309F, 0.0F);


        this.Neckbase_r1 = new ModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(0.0F, -0.394F, 0.5086F);
        this.Neck1.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, -0.2793F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 58, 29, -1.0F, 0.774F, -5.3829F, 2, 2, 6, -0.2F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -1.3418F, -4.2879F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.2112F, 0.128F, -0.0274F);


        this.Neckmiddle_r1 = new ModelRenderer(this);
        this.Neckmiddle_r1.setRotationPoint(0.0F, -0.614F, -0.2002F);
        this.Neck2.addChild(Neckmiddle_r1);
        this.setRotateAngle(Neckmiddle_r1, -0.4189F, 0.0F, 0.0F);
        this.Neckmiddle_r1.cubeList.add(new ModelBox(Neckmiddle_r1, 0, 58, -1.0F, 0.8193F, -5.0761F, 2, 2, 6, -0.2F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -2.2143F, -5.1828F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.0447F, 0.218F, 0.0097F);


        this.Neckfront_r1 = new ModelRenderer(this);
        this.Neckfront_r1.setRotationPoint(0.0F, -0.7681F, 1.0185F);
        this.Neck3.addChild(Neckfront_r1);
        this.setRotateAngle(Neckfront_r1, 0.096F, 0.0F, 0.0F);
        this.Neckfront_r1.cubeList.add(new ModelBox(Neckfront_r1, 88, 60, -1.0F, 0.8248F, -3.944F, 2, 2, 3, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.1144F, -2.6815F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.2178F, -0.0167F, 0.0403F);


        this.Lowerjaw = new ModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 3.1923F, 1.6793F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.0157F, 0.0F, 0.0F);


        this.Throat = new ModelRenderer(this);
        this.Throat.setRotationPoint(0.0F, 5.5337F, -5.3733F);
        this.Lowerjaw.addChild(Throat);


        this.Masseter = new ModelRenderer(this);
        this.Masseter.setRotationPoint(0.0F, 1.5947F, -5.673F);
        this.Lowerjaw.addChild(Masseter);


        this.Leftarm1 = new ModelRenderer(this);
        this.Leftarm1.setRotationPoint(5.1F, 10.3789F, -3.0217F);
        this.Bodyfront.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, -0.8582F, 0.3202F, -0.2208F);


        this.Leftarm2 = new ModelRenderer(this);
        this.Leftarm2.setRotationPoint(-0.3F, -1.1F, 6.5F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, -1.4856F, -0.0189F, 0.2174F);


        this.Leftarm3 = new ModelRenderer(this);
        this.Leftarm3.setRotationPoint(1.0F, 1.3226F, 3.963F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.0F, -0.5672F, 0.0F);


        this.Rightarm1 = new ModelRenderer(this);
        this.Rightarm1.setRotationPoint(-5.1F, 10.3789F, -3.0217F);
        this.Bodyfront.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, -0.3824F, -0.3636F, 0.2306F);


        this.Rightarm2 = new ModelRenderer(this);
        this.Rightarm2.setRotationPoint(0.3F, -1.1F, 6.5F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, -1.4856F, 0.0189F, -0.2174F);


        this.Rightarm3 = new ModelRenderer(this);
        this.Rightarm3.setRotationPoint(-1.0F, 1.3226F, 3.963F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, 0.0F, 0.6981F, 0.0F);


        this.Leftleg1 = new ModelRenderer(this);
        this.Leftleg1.setRotationPoint(4.2F, 0.1029F, -0.1691F);
        this.Hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, -0.0436F, 0.0F, 0.0F);


        this.Leftleg2 = new ModelRenderer(this);
        this.Leftleg2.setRotationPoint(-0.1F, 13.8735F, 0.6084F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 1.4399F, 0.0F, 0.0F);


        this.Leftleg3 = new ModelRenderer(this);
        this.Leftleg3.setRotationPoint(0.2F, 10.7055F, 2.7323F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, -0.8727F, 0.0F, 0.0F);


        this.Leftleg4 = new ModelRenderer(this);
        this.Leftleg4.setRotationPoint(0.4F, 7.5F, -0.7F);
        this.Leftleg3.addChild(Leftleg4);
        this.setRotateAngle(Leftleg4, 0.48F, 0.0F, 0.0F);


        this.Leftleg5 = new ModelRenderer(this);
        this.Leftleg5.setRotationPoint(0.0F, 0.0291F, -3.2238F);
        this.Leftleg4.addChild(Leftleg5);
        this.setRotateAngle(Leftleg5, 0.2182F, 0.0F, 0.0F);


        this.Rightleg1 = new ModelRenderer(this);
        this.Rightleg1.setRotationPoint(-4.2F, 0.1029F, -0.1691F);
        this.Hips.addChild(Rightleg1);
        this.setRotateAngle(Rightleg1, -0.5672F, 0.0F, 0.0F);


        this.Rightleg2 = new ModelRenderer(this);
        this.Rightleg2.setRotationPoint(0.1F, 13.8735F, 0.6084F);
        this.Rightleg1.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, 1.2217F, 0.0F, 0.0F);


        this.Rightleg3 = new ModelRenderer(this);
        this.Rightleg3.setRotationPoint(-0.2F, 10.7055F, 2.7323F);
        this.Rightleg2.addChild(Rightleg3);
        this.setRotateAngle(Rightleg3, -0.829F, 0.0F, 0.0F);


        this.Rightleg4 = new ModelRenderer(this);
        this.Rightleg4.setRotationPoint(-0.4F, 7.5F, -0.7F);
        this.Rightleg3.addChild(Rightleg4);
        this.setRotateAngle(Rightleg4, 0.1745F, 0.0F, 0.0F);


        this.Rightleg5 = new ModelRenderer(this);
        this.Rightleg5.setRotationPoint(0.0F, 0.0291F, -3.2238F);
        this.Rightleg4.addChild(Rightleg5);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(-0.5F, 0.2029F, 6.4309F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.2629F, 0.0832F, -0.0263F);


        this.Tailbase_r1 = new ModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, -0.5941F, -0.3442F);
        this.Tail1.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, 0.0698F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 25, 47, -0.5F, 0.6F, -0.2F, 2, 2, 9, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.8357F, 8.3265F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0876F, 0.0869F, 0.0076F);


        this.Tailmiddlebase_r1 = new ModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.0F, -0.4331F, -0.3381F);
        this.Tail2.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, 0.1047F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 19, 0, -0.5F, 0.7248F, -0.1689F, 2, 2, 9, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -1.0228F, 8.8316F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1772F, 0.1719F, 0.0306F);


        this.Tailmiddle_r1 = new ModelRenderer(this);
        this.Tailmiddle_r1.setRotationPoint(0.0F, -1.2181F, 10.581F);
        this.Tail3.addChild(Tailmiddle_r1);
        this.setRotateAngle(Tailmiddle_r1, 0.0698F, 0.0F, 0.0F);
        this.Tailmiddle_r1.cubeList.add(new ModelBox(Tailmiddle_r1, 33, 0, -0.5F, 0.6983F, -11.8085F, 2, 2, 12, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.4327F, 10.2919F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0876F, 0.0869F, 0.0076F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 31, 32, -0.5F, 0.0F, -0.3F, 2, 2, 12, -0.2F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, -0.3F, 11.5F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.0176F, 0.1309F, 0.0023F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 0, 29, 0.0F, 0.5128F, -0.9958F, 1, 1, 14, -0.2F, false));

        this.Tail6 = new ModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 0.0145F, 12.6781F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.3213F, 0.2073F, -0.0684F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 42, 15, 0.0F, 0.4267F, 0.0921F, 1, 1, 12, -0.2F, false));

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
