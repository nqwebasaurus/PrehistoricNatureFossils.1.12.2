package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAsfaltovenatorFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Leftarm1;
    private final ModelRenderer Leftarm2;
    private final ModelRenderer Leftarm3;
    private final ModelRenderer Rightarm1;
    private final ModelRenderer Rightarm2;
    private final ModelRenderer Rightarm3;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer heads;
    private final ModelRenderer jaw;
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
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonAsfaltovenatorFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 26.25F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -33.0F, 4.0F, 1, 33, 1, -0.1F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -22.6F, -20.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1571F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 1.2F, -9.4F, -0.5F, 1, 32, 1, -0.1F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -22.6F, -20.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1571F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.6F, -3.5F, -0.5F, 1, 10, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -21.5F, 4.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 8.9F, -5.5F, -0.5F, 1, 11, 1, -0.2F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -32.6F, 4.0F);
        this.fossil.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.7F, -3.4F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 35, -0.5F, 1.2F, -1.9F, 1, 2, 12, 0.003F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -5.4F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.0436F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.3F, -11.9F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 20, -0.5F, 0.9F, 0.0F, 1, 2, 12, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.4F, -12.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.1309F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.6F, -10.6F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2269F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 35, -0.5F, 1.0599F, -0.0342F, 1, 2, 11, 0.003F, false));

        this.Leftarm1 = new ModelRenderer(this);
        this.Leftarm1.setRotationPoint(4.7F, 10.1084F, -7.0257F);
        this.chest.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, 0.2282F, 0.2264F, -0.1688F);


        this.Leftarm2 = new ModelRenderer(this);
        this.Leftarm2.setRotationPoint(0.2789F, 4.8602F, 0.3544F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, -1.0435F, 0.1133F, 0.0657F);


        this.Leftarm3 = new ModelRenderer(this);
        this.Leftarm3.setRotationPoint(0.6F, 4.5852F, -0.6812F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.0F, 0.0F, 0.2182F);


        this.Rightarm1 = new ModelRenderer(this);
        this.Rightarm1.setRotationPoint(-4.7F, 10.1084F, -7.0257F);
        this.chest.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, 0.8391F, -0.2264F, 0.1688F);


        this.Rightarm2 = new ModelRenderer(this);
        this.Rightarm2.setRotationPoint(-0.2789F, 4.8602F, 0.3544F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, -1.2654F, 0.0F, 0.0F);


        this.Rightarm3 = new ModelRenderer(this);
        this.Rightarm3.setRotationPoint(-0.6F, 4.5852F, -0.6812F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, 0.0F, 0.0F, -0.2182F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 2.6F, -10.0F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, -0.0873F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.9F, -4.4F);
        this.neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2269F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 18, -0.5F, 0.7F, 0.2F, 1, 2, 5, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.0F, -3.9F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.0F, -0.1309F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -3.8F, -4.4F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.637F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 62, -0.5F, 0.2883F, 0.2181F, 1, 2, 6, 0.003F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.4F, -4.7F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0F, -0.1745F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 80, 31, -0.8F, -1.0F, -4.4F, 1, 1, 2, 0.003F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.2F, -2.0F, -2.4F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5061F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 67, 37, -1.0F, 1.0F, 0.1F, 1, 1, 3, 0.0F, false));

        this.heads = new ModelRenderer(this);
        this.heads.setRotationPoint(0.0F, -0.6F, -4.0F);
        this.neck.addChild(heads);
        this.setRotateAngle(heads, -0.1995F, -0.1581F, -0.1294F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(1.0F, 1.7F, 1.1F);
        this.heads.addChild(jaw);


        this.Leftleg1 = new ModelRenderer(this);
        this.Leftleg1.setRotationPoint(5.4F, 1.7084F, 0.2743F);
        this.hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, 0.0425F, -0.0262F, 0.0832F);


        this.Leftleg2 = new ModelRenderer(this);
        this.Leftleg2.setRotationPoint(-0.3F, 12.197F, -1.149F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 0.9595F, -0.025F, 0.0357F);


        this.Leftleg3 = new ModelRenderer(this);
        this.Leftleg3.setRotationPoint(-0.4F, 13.2191F, -0.029F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, -0.5653F, -0.0617F, -0.0618F);


        this.Leftleg4 = new ModelRenderer(this);
        this.Leftleg4.setRotationPoint(0.6F, 6.3125F, -0.7244F);
        this.Leftleg3.addChild(Leftleg4);
        this.setRotateAngle(Leftleg4, -0.0872F, -0.0038F, -0.0435F);


        this.Leftleg5 = new ModelRenderer(this);
        this.Leftleg5.setRotationPoint(0.0F, 0.5973F, -5.0844F);
        this.Leftleg4.addChild(Leftleg5);
        this.setRotateAngle(Leftleg5, -0.3054F, 0.0F, 0.0F);


        this.Rightleg1 = new ModelRenderer(this);
        this.Rightleg1.setRotationPoint(-5.4F, 1.7084F, 0.2743F);
        this.hips.addChild(Rightleg1);
        this.setRotateAngle(Rightleg1, -1.0241F, 0.0454F, -0.0724F);


        this.Rightleg2 = new ModelRenderer(this);
        this.Rightleg2.setRotationPoint(0.3F, 12.197F, -1.149F);
        this.Rightleg1.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, 1.7453F, 0.0F, 0.0F);


        this.Rightleg3 = new ModelRenderer(this);
        this.Rightleg3.setRotationPoint(0.4F, 13.2191F, -0.029F);
        this.Rightleg2.addChild(Rightleg3);
        this.setRotateAngle(Rightleg3, -1.5924F, -0.1725F, 0.1175F);


        this.Rightleg4 = new ModelRenderer(this);
        this.Rightleg4.setRotationPoint(-0.6F, 6.3125F, -0.7244F);
        this.Rightleg3.addChild(Rightleg4);
        this.setRotateAngle(Rightleg4, 1.789F, 0.0F, 0.0F);


        this.Rightleg5 = new ModelRenderer(this);
        this.Rightleg5.setRotationPoint(0.0F, 0.5973F, -5.0844F);
        this.Rightleg4.addChild(Rightleg5);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.6F, 6.4F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1314F, -0.0865F, 0.0114F);
        this.tail.cubeList.add(new ModelBox(tail, 17, 38, -0.5F, 0.0929F, 0.0078F, 1, 2, 12, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2113F, 12.073F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2184F, -0.0426F, -0.0094F);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 21, -0.5F, 0.0019F, -0.5564F, 1, 2, 14, 0.003F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2989F, 13.7261F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1051F, 0.0868F, -0.0091F);
        this.tail3.cubeList.add(new ModelBox(tail3, 35, 4, -0.5018F, 0.3001F, -1.0086F, 1, 1, 14, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2F, 12.9965F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.176F, 0.1289F, -0.0229F);
        this.tail4.cubeList.add(new ModelBox(tail4, 35, 49, -0.4943F, 0.5055F, -0.0569F, 1, 1, 11, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.2945F, 11.0572F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3518F, 0.123F, -0.045F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 18, -0.4743F, 0.2856F, -0.3066F, 1, 1, 15, -0.1F, false));

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
