package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonParanaichthys extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Paranaichthys;
    private final ModelRenderer Cephalon;
    private final ModelRenderer Mouth_upper_r1;
    private final ModelRenderer Foreheadtop_r1;
    private final ModelRenderer Forehead_r1;
    private final ModelRenderer Belly_start_r1;
    private final ModelRenderer Eye_r1;
    private final ModelRenderer Gillplate_r1;
    private final ModelRenderer PectoralL;
    private final ModelRenderer PectoralL_r1;
    private final ModelRenderer Jaw;
    private final ModelRenderer Jaw_r1;
    private final ModelRenderer Body1;
    private final ModelRenderer Bellyslope_large_r1;
    private final ModelRenderer Back_r1;
    private final ModelRenderer Body_large_r1;
    private final ModelRenderer VentralL;
    private final ModelRenderer VentralL_r1;
    private final ModelRenderer Body2;
    private final ModelRenderer Bellyslope_horizontal_r1;
    private final ModelRenderer Backslope_start_r1;
    private final ModelRenderer Bellyslope_short_r1;
    private final ModelRenderer Back_horizontal_r1;
    private final ModelRenderer Back_peak_r1;
    private final ModelRenderer Bellytail_start_r1;
    private final ModelRenderer Body_tall_r1;
    private final ModelRenderer Body3;
    private final ModelRenderer Dorsalfin_r1;
    private final ModelRenderer Analfin_r1;
    private final ModelRenderer Backslope_long_r1;
    private final ModelRenderer Body_end_r1;
    private final ModelRenderer Bellytail_long_r1;
    private final ModelRenderer Body4;
    private final ModelRenderer Bellytail_end_r1;
    private final ModelRenderer Backslope_end_r1;
    private final ModelRenderer Tail_start_r1;
    private final ModelRenderer Body5;
    private final ModelRenderer Tailfin_r1;
    private final ModelRenderer Tail_End_r1;

    public ModelSkeletonParanaichthys() {
        this.textureWidth = 112;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(1.0F, 24.0F, -5.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(5.9F, -1.0F, -10.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.2915F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 41, -0.0495F, -1.0F, 0.0016F, 19, 2, 10, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.8F, -1.0F, -13.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 49, 22, -0.007F, -1.0F, 0.0025F, 10, 2, 10, -0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-9.3F, -1.0F, 20.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.4835F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.181F, -1.0F, 0.0237F, 15, 2, 19, -0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-12.3F, -1.0F, 4.7F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 22, 0.0472F, -1.0F, 0.0061F, 16, 2, 16, -0.007F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.5F, -1.0F, -6.0F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 41, -2.5F, -1.0F, -7.0F, 10, 2, 20, 0.003F, false));

        this.Paranaichthys = new ModelRenderer(this);
        this.Paranaichthys.setRotationPoint(-0.2F, -2.3F, 0.0F);
        this.fossil.addChild(Paranaichthys);


        this.Cephalon = new ModelRenderer(this);
        this.Cephalon.setRotationPoint(0.06F, 1.0F, -3.7F);
        this.Paranaichthys.addChild(Cephalon);
        this.setRotateAngle(Cephalon, 0.0F, 0.0F, -1.5708F);


        this.Mouth_upper_r1 = new ModelRenderer(this);
        this.Mouth_upper_r1.setRotationPoint(1.14F, 0.6587F, -3.4301F);
        this.Cephalon.addChild(Mouth_upper_r1);
        this.setRotateAngle(Mouth_upper_r1, -2.8885F, 0.0F, 3.1416F);
        this.Mouth_upper_r1.cubeList.add(new ModelBox(Mouth_upper_r1, 50, 8, 0.1F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.Foreheadtop_r1 = new ModelRenderer(this);
        this.Foreheadtop_r1.setRotationPoint(0.84F, -3.9169F, -0.9237F);
        this.Cephalon.addChild(Foreheadtop_r1);
        this.setRotateAngle(Foreheadtop_r1, 1.0297F, 0.0F, -3.1416F);
        this.Foreheadtop_r1.cubeList.add(new ModelBox(Foreheadtop_r1, 13, 6, 0.0F, -2.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.Forehead_r1 = new ModelRenderer(this);
        this.Forehead_r1.setRotationPoint(0.94F, -1.2718F, -2.9202F);
        this.Cephalon.addChild(Forehead_r1);
        this.setRotateAngle(Forehead_r1, -2.6005F, 0.0F, -3.1416F);
        this.Forehead_r1.cubeList.add(new ModelBox(Forehead_r1, 56, 11, 0.0F, -2.0F, -1.5F, 0, 4, 3, 0.0F, false));

        this.Belly_start_r1 = new ModelRenderer(this);
        this.Belly_start_r1.setRotationPoint(0.94F, 2.5345F, -0.953F);
        this.Cephalon.addChild(Belly_start_r1);
        this.setRotateAngle(Belly_start_r1, -2.7576F, 0.0F, 3.1416F);
        this.Belly_start_r1.cubeList.add(new ModelBox(Belly_start_r1, 60, 8, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.Eye_r1 = new ModelRenderer(this);
        this.Eye_r1.setRotationPoint(1.04F, -0.596F, -3.426F);
        this.Cephalon.addChild(Eye_r1);
        this.setRotateAngle(Eye_r1, 0.0F, 3.1416F, 0.0F);
        this.Eye_r1.cubeList.add(new ModelBox(Eye_r1, 5, 22, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Gillplate_r1 = new ModelRenderer(this);
        this.Gillplate_r1.setRotationPoint(1.04F, -0.52F, -1.11F);
        this.Cephalon.addChild(Gillplate_r1);
        this.setRotateAngle(Gillplate_r1, 0.0F, 3.1416F, 0.0F);
        this.Gillplate_r1.cubeList.add(new ModelBox(Gillplate_r1, 9, 49, -0.1F, -3.0F, -1.5F, 0, 6, 3, 0.0F, false));

        this.PectoralL = new ModelRenderer(this);
        this.PectoralL.setRotationPoint(1.117F, 2.55F, -0.3F);
        this.Cephalon.addChild(PectoralL);


        this.PectoralL_r1 = new ModelRenderer(this);
        this.PectoralL_r1.setRotationPoint(-0.06F, 0.4702F, 0.8941F);
        this.PectoralL.addChild(PectoralL_r1);
        this.setRotateAngle(PectoralL_r1, -2.6377F, 0.0F, -3.1416F);
        this.PectoralL_r1.cubeList.add(new ModelBox(PectoralL_r1, 9, 32, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.715F, -2.75F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0175F, 0.0F, 0.0F);


        this.Jaw_r1 = new ModelRenderer(this);
        this.Jaw_r1.setRotationPoint(0.94F, 0.041F, -1.23F);
        this.Jaw.addChild(Jaw_r1);
        this.setRotateAngle(Jaw_r1, 0.0F, 3.1416F, 0.0F);
        this.Jaw_r1.cubeList.add(new ModelBox(Jaw_r1, 13, 56, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.Body1 = new ModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -0.5F, 0.1F);
        this.Cephalon.addChild(Body1);


        this.Bellyslope_large_r1 = new ModelRenderer(this);
        this.Bellyslope_large_r1.setRotationPoint(1.04F, 4.1725F, 2.1466F);
        this.Body1.addChild(Bellyslope_large_r1);
        this.setRotateAngle(Bellyslope_large_r1, -2.8274F, 0.0F, -3.1416F);
        this.Bellyslope_large_r1.cubeList.add(new ModelBox(Bellyslope_large_r1, 7, 0, 0.1F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.Back_r1 = new ModelRenderer(this);
        this.Back_r1.setRotationPoint(0.94F, -4.9523F, 2.1494F);
        this.Body1.addChild(Back_r1);
        this.setRotateAngle(Back_r1, 2.81F, 0.0F, -3.1416F);
        this.Back_r1.cubeList.add(new ModelBox(Back_r1, 49, 22, 0.0F, -1.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.Body_large_r1 = new ModelRenderer(this);
        this.Body_large_r1.setRotationPoint(1.04F, -0.47F, 2.09F);
        this.Body1.addChild(Body_large_r1);
        this.setRotateAngle(Body_large_r1, 0.0F, 3.1416F, 0.0F);
        this.Body_large_r1.cubeList.add(new ModelBox(Body_large_r1, 0, 41, 0.0F, -4.5F, -2.0F, 0, 9, 4, 0.0F, false));

        this.VentralL = new ModelRenderer(this);
        this.VentralL.setRotationPoint(1.27F, 4.03F, 3.52F);
        this.Body1.addChild(VentralL);
        this.setRotateAngle(VentralL, 0.7854F, 0.0F, 0.0F);


        this.VentralL_r1 = new ModelRenderer(this);
        this.VentralL_r1.setRotationPoint(-0.06F, 1.92F, -0.46F);
        this.VentralL.addChild(VentralL_r1);
        this.setRotateAngle(VentralL_r1, 0.0F, 0.0F, -3.1416F);
        this.VentralL_r1.cubeList.add(new ModelBox(VentralL_r1, 50, 0, 0.0F, -2.0F, -1.5F, 0, 4, 3, 0.0F, false));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.49F, -0.87F, 4.01F);
        this.Body1.addChild(Body2);


        this.Bellyslope_horizontal_r1 = new ModelRenderer(this);
        this.Bellyslope_horizontal_r1.setRotationPoint(0.55F, 5.5127F, 3.2314F);
        this.Body2.addChild(Bellyslope_horizontal_r1);
        this.setRotateAngle(Bellyslope_horizontal_r1, 0.0F, 3.1416F, 0.0F);
        this.Bellyslope_horizontal_r1.cubeList.add(new ModelBox(Bellyslope_horizontal_r1, 7, 0, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Backslope_start_r1 = new ModelRenderer(this);
        this.Backslope_start_r1.setRotationPoint(0.35F, -5.1303F, 3.765F);
        this.Body2.addChild(Backslope_start_r1);
        this.setRotateAngle(Backslope_start_r1, -2.1991F, 0.0F, 3.1416F);
        this.Backslope_start_r1.cubeList.add(new ModelBox(Backslope_start_r1, 13, 13, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.Bellyslope_short_r1 = new ModelRenderer(this);
        this.Bellyslope_short_r1.setRotationPoint(0.45F, 5.3359F, 1.3914F);
        this.Body2.addChild(Bellyslope_short_r1);
        this.setRotateAngle(Bellyslope_short_r1, -3.0194F, 0.0F, -3.1416F);
        this.Bellyslope_short_r1.cubeList.add(new ModelBox(Bellyslope_short_r1, 0, 55, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.Back_horizontal_r1 = new ModelRenderer(this);
        this.Back_horizontal_r1.setRotationPoint(0.45F, -5.211F, 3.0618F);
        this.Body2.addChild(Back_horizontal_r1);
        this.setRotateAngle(Back_horizontal_r1, -3.0718F, 0.0F, -3.1416F);
        this.Back_horizontal_r1.cubeList.add(new ModelBox(Back_horizontal_r1, 16, 3, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.Back_peak_r1 = new ModelRenderer(this);
        this.Back_peak_r1.setRotationPoint(0.55F, -4.9647F, 1.3258F);
        this.Body2.addChild(Back_peak_r1);
        this.setRotateAngle(Back_peak_r1, 2.9671F, 0.0F, -3.1416F);
        this.Back_peak_r1.cubeList.add(new ModelBox(Back_peak_r1, 55, 5, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.Bellytail_start_r1 = new ModelRenderer(this);
        this.Bellytail_start_r1.setRotationPoint(0.45F, 5.7842F, 3.6948F);
        this.Body2.addChild(Bellytail_start_r1);
        this.setRotateAngle(Bellytail_start_r1, 2.2689F, 0.0F, -3.1416F);
        this.Bellytail_start_r1.cubeList.add(new ModelBox(Bellytail_start_r1, 0, 22, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Body_tall_r1 = new ModelRenderer(this);
        this.Body_tall_r1.setRotationPoint(0.65F, 0.39F, 2.0F);
        this.Body2.addChild(Body_tall_r1);
        this.setRotateAngle(Body_tall_r1, 0.0F, 3.1416F, 0.0F);
        this.Body_tall_r1.cubeList.add(new ModelBox(Body_tall_r1, 0, 22, 0.0F, -5.0F, -2.0F, 0, 10, 4, 0.0F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 3.92F);
        this.Body2.addChild(Body3);


        this.Dorsalfin_r1 = new ModelRenderer(this);
        this.Dorsalfin_r1.setRotationPoint(0.25F, -4.9454F, 2.2553F);
        this.Body3.addChild(Dorsalfin_r1);
        this.setRotateAngle(Dorsalfin_r1, -2.138F, 0.0F, 3.1416F);
        this.Dorsalfin_r1.cubeList.add(new ModelBox(Dorsalfin_r1, 9, 41, 0.0F, -1.5F, -2.0F, 0, 3, 4, 0.0F, false));

        this.Analfin_r1 = new ModelRenderer(this);
        this.Analfin_r1.setRotationPoint(0.35F, 8.1784F, 3.9962F);
        this.Body3.addChild(Analfin_r1);
        this.setRotateAngle(Analfin_r1, 2.7489F, 0.0F, 3.1416F);
        this.Analfin_r1.cubeList.add(new ModelBox(Analfin_r1, 0, 0, 0.0F, -5.5F, -3.0F, 0, 11, 6, 0.0F, false));

        this.Backslope_long_r1 = new ModelRenderer(this);
        this.Backslope_long_r1.setRotationPoint(0.55F, -2.6945F, 0.4762F);
        this.Body3.addChild(Backslope_long_r1);
        this.setRotateAngle(Backslope_long_r1, -2.2777F, 0.0F, -3.1416F);
        this.Backslope_long_r1.cubeList.add(new ModelBox(Backslope_long_r1, 41, 41, 0.0F, -1.5F, -2.0F, 0, 3, 4, 0.0F, false));

        this.Body_end_r1 = new ModelRenderer(this);
        this.Body_end_r1.setRotationPoint(0.65F, 0.82F, 1.5F);
        this.Body3.addChild(Body_end_r1);
        this.setRotateAngle(Body_end_r1, 0.0F, 3.1416F, 0.0F);
        this.Body_end_r1.cubeList.add(new ModelBox(Body_end_r1, 9, 22, 0.0F, -3.0F, -1.5F, 0, 6, 3, 0.0F, false));

        this.Bellytail_long_r1 = new ModelRenderer(this);
        this.Bellytail_long_r1.setRotationPoint(0.45F, 4.0782F, 0.9982F);
        this.Body3.addChild(Bellytail_long_r1);
        this.setRotateAngle(Bellytail_long_r1, 2.4871F, 0.0F, 3.1416F);
        this.Bellytail_long_r1.cubeList.add(new ModelBox(Bellytail_long_r1, 48, 54, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.98F, 3.05F);
        this.Body3.addChild(Body4);


        this.Bellytail_end_r1 = new ModelRenderer(this);
        this.Bellytail_end_r1.setRotationPoint(0.45F, 1.7506F, 0.0901F);
        this.Body4.addChild(Bellytail_end_r1);
        this.setRotateAngle(Bellytail_end_r1, 2.3562F, 0.0F, 3.1416F);
        this.Bellytail_end_r1.cubeList.add(new ModelBox(Bellytail_end_r1, 12, 0, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.Backslope_end_r1 = new ModelRenderer(this);
        this.Backslope_end_r1.setRotationPoint(0.45F, -1.6401F, 0.0656F);
        this.Body4.addChild(Backslope_end_r1);
        this.setRotateAngle(Backslope_end_r1, -2.3998F, 0.0F, -3.1416F);
        this.Backslope_end_r1.cubeList.add(new ModelBox(Backslope_end_r1, 59, 0, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.Tail_start_r1 = new ModelRenderer(this);
        this.Tail_start_r1.setRotationPoint(0.55F, -0.03F, 0.9F);
        this.Body4.addChild(Tail_start_r1);
        this.setRotateAngle(Tail_start_r1, 0.0F, 3.1416F, 0.0F);
        this.Tail_start_r1.cubeList.add(new ModelBox(Tail_start_r1, 41, 54, 0.0F, -1.5F, -1.5F, 0, 3, 3, 0.0F, false));

        this.Body5 = new ModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -0.49F, 2.35F);
        this.Body4.addChild(Body5);


        this.Tailfin_r1 = new ModelRenderer(this);
        this.Tailfin_r1.setRotationPoint(0.35F, 0.84F, 4.47F);
        this.Body5.addChild(Tailfin_r1);
        this.setRotateAngle(Tailfin_r1, 0.0F, 3.1416F, 0.0F);
        this.Tailfin_r1.cubeList.add(new ModelBox(Tailfin_r1, 54, 57, 0.0F, -7.0F, -3.5F, 0, 14, 7, 0.0F, false));

        this.Tail_End_r1 = new ModelRenderer(this);
        this.Tail_End_r1.setRotationPoint(0.45F, -0.03F, 1.0F);
        this.Body5.addChild(Tail_End_r1);
        this.setRotateAngle(Tail_End_r1, 0.0F, 3.1416F, 0.0F);
        this.Tail_End_r1.cubeList.add(new ModelBox(Tail_End_r1, 0, 0, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

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
