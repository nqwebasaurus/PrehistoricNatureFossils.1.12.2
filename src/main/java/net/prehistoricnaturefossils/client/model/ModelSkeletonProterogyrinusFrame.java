package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonProterogyrinusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer main;
    private final ModelRenderer bodymiddle_r1;
    private final ModelRenderer bodyfront;
    private final ModelRenderer bodyfront_r1;
    private final ModelRenderer FLupper;
    private final ModelRenderer FLlower;
    private final ModelRenderer FLfoot;
    private final ModelRenderer FLupper2;
    private final ModelRenderer FLlower2;
    private final ModelRenderer FLfoot2;
    private final ModelRenderer neck;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer upperhead;
    private final ModelRenderer jaw;
    private final ModelRenderer bodyback;
    private final ModelRenderer bodyback_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail4_r1;
    private final ModelRenderer tail3_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail5_r1;
    private final ModelRenderer BLupper;
    private final ModelRenderer BLlower;
    private final ModelRenderer BLfoot;
    private final ModelRenderer BLupper2;
    private final ModelRenderer BLlower2;
    private final ModelRenderer BLfoot2;

    public ModelSkeletonProterogyrinusFrame() {
        this.textureWidth = 53;
        this.textureHeight = 53;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.275F, -6.0F, 6.35F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -0.675F, -0.5F, 1, 7, 1, -0.25F, true));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.275F, -6.0F, 6.35F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.95F, -2.0F, -0.5F, 1, 4, 1, 0.0F, true));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.75F, -8.5F, -8.025F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 4.6F, -3.5F, -0.5F, 1, 7, 1, -0.2F, true));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.75F, -8.5F, -8.025F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.475F, 1.85F, -0.5F, 1, 7, 1, -0.2F, true));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.5F, -8.0F, -1.0F);
        this.fossil.addChild(main);


        this.bodymiddle_r1 = new ModelRenderer(this);
        this.bodymiddle_r1.setRotationPoint(0.0F, 0.0F, -3.8F);
        this.main.addChild(bodymiddle_r1);
        this.setRotateAngle(bodymiddle_r1, -0.0349F, 0.0F, 0.0F);
        this.bodymiddle_r1.cubeList.add(new ModelBox(bodymiddle_r1, 0, 12, -1.0F, 0.6F, 0.0F, 1, 1, 10, -0.2F, false));

        this.bodyfront = new ModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 0.0F, -3.8F);
        this.main.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0F, 0.2182F, 0.0F);


        this.bodyfront_r1 = new ModelRenderer(this);
        this.bodyfront_r1.setRotationPoint(-0.5F, 0.6406F, -4.8793F);
        this.bodyfront.addChild(bodyfront_r1);
        this.setRotateAngle(bodyfront_r1, 0.1658F, 0.0F, 0.0F);
        this.bodyfront_r1.cubeList.add(new ModelBox(bodyfront_r1, 24, 35, -0.5F, 0.8134F, -0.0025F, 1, 1, 5, -0.2F, false));

        this.FLupper = new ModelRenderer(this);
        this.FLupper.setRotationPoint(2.5F, 4.5F, -3.4F);
        this.bodyfront.addChild(FLupper);
        this.setRotateAngle(FLupper, 0.0F, 0.0F, -0.8727F);


        this.FLlower = new ModelRenderer(this);
        this.FLlower.setRotationPoint(1.9215F, 1.3106F, 0.8F);
        this.FLupper.addChild(FLlower);
        this.setRotateAngle(FLlower, -0.2427F, -0.0992F, 0.4921F);


        this.FLfoot = new ModelRenderer(this);
        this.FLfoot.setRotationPoint(0.1478F, 3.1658F, 0.7259F);
        this.FLlower.addChild(FLfoot);
        this.setRotateAngle(FLfoot, 0.2264F, -0.0927F, 0.3822F);


        this.FLupper2 = new ModelRenderer(this);
        this.FLupper2.setRotationPoint(-3.5F, 4.5F, -3.4F);
        this.bodyfront.addChild(FLupper2);
        this.setRotateAngle(FLupper2, 0.0F, 0.0F, 0.8727F);


        this.FLlower2 = new ModelRenderer(this);
        this.FLlower2.setRotationPoint(-1.9215F, 1.3106F, 0.8F);
        this.FLupper2.addChild(FLlower2);
        this.setRotateAngle(FLlower2, -0.2427F, 0.0992F, -0.4921F);


        this.FLfoot2 = new ModelRenderer(this);
        this.FLfoot2.setRotationPoint(-0.1478F, 3.1658F, 0.7259F);
        this.FLlower2.addChild(FLfoot2);
        this.setRotateAngle(FLfoot2, 0.2264F, 0.0927F, -0.3822F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.1F, -4.7F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, -0.3228F, 0.3829F, -0.0894F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(-0.5F, 0.768F, -1.7628F);
        this.neck.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 0.2715F, -0.0841F, -0.0234F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, -1, 39, -0.5F, 0.0955F, 0.0073F, 1, 1, 3, -0.2F, false));

        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(-0.5F, 0.768F, -3.7628F);
        this.neck.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.1396F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 34, 39, -0.5F, 0.3872F, -0.5019F, 1, 1, 3, -0.2F, false));

        this.upperhead = new ModelRenderer(this);
        this.upperhead.setRotationPoint(0.0F, 0.8F, -3.6F);
        this.neck.addChild(upperhead);
        this.setRotateAngle(upperhead, -0.2455F, 0.1222F, 0.1247F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.6F, -0.3F);
        this.upperhead.addChild(jaw);
        this.setRotateAngle(jaw, 0.6545F, 0.0F, 0.0F);


        this.bodyback = new ModelRenderer(this);
        this.bodyback.setRotationPoint(0.0F, 0.6F, 6.1F);
        this.main.addChild(bodyback);
        this.setRotateAngle(bodyback, 0.0F, -0.1309F, 0.0F);


        this.bodyback_r1 = new ModelRenderer(this);
        this.bodyback_r1.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.bodyback.addChild(bodyback_r1);
        this.setRotateAngle(bodyback_r1, -0.2182F, 0.0F, 0.0F);
        this.bodyback_r1.cubeList.add(new ModelBox(bodyback_r1, 25, -1, -1.0F, 0.4062F, -0.0282F, 1, 1, 7, -0.2F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(-0.5F, 1.1772F, 5.9822F);
        this.bodyback.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, -0.2618F, 0.0F);


        this.tail2_r1 = new ModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.5F, 0.2F, -0.2F);
        this.tail1.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, -0.1484F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 13, 2, -1.0F, 0.1674F, -0.0285F, 1, 1, 10, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.4579F, 9.5178F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.09F, 0.3902F, 0.0606F);


        this.tail4_r1 = new ModelRenderer(this);
        this.tail4_r1.setRotationPoint(-0.2766F, 1.2345F, 10.0158F);
        this.tail2.addChild(tail4_r1);
        this.setRotateAngle(tail4_r1, -0.0248F, 0.6244F, -0.0137F);
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 14, 15, -0.0796F, 0.362F, -0.9457F, 1, 1, 9, -0.2F, false));

        this.tail3_r1 = new ModelRenderer(this);
        this.tail3_r1.setRotationPoint(0.5F, 0.1F, 0.1F);
        this.tail2.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, -0.1222F, 0.0F, 0.0F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, -1, -1, -1.0F, 0.2933F, -1.0237F, 1, 1, 11, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(-2.8646F, 1.8649F, 20.5699F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0345F, 0.5215F, 0.0601F);


        this.tail5_r1 = new ModelRenderer(this);
        this.tail5_r1.setRotationPoint(3.588F, -0.6304F, -6.5541F);
        this.tail3.addChild(tail5_r1);
        this.setRotateAngle(tail5_r1, 0.0932F, 0.6199F, 0.0161F);
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 0, 24, -0.0768F, 0.7399F, 7.715F, 1, 1, 7, -0.2F, false));

        this.BLupper = new ModelRenderer(this);
        this.BLupper.setRotationPoint(1.5F, 3.6F, 1.1F);
        this.bodyback.addChild(BLupper);
        this.setRotateAngle(BLupper, 0.0F, 0.0F, -0.6109F);


        this.BLlower = new ModelRenderer(this);
        this.BLlower.setRotationPoint(2.2297F, 1.6887F, -0.5F);
        this.BLupper.addChild(BLlower);
        this.setRotateAngle(BLlower, 0.1874F, -0.032F, 0.1477F);


        this.BLfoot = new ModelRenderer(this);
        this.BLfoot.setRotationPoint(0.0072F, 3.4822F, 0.5765F);
        this.BLlower.addChild(BLfoot);
        this.setRotateAngle(BLfoot, -0.1487F, -0.048F, 0.4369F);


        this.BLupper2 = new ModelRenderer(this);
        this.BLupper2.setRotationPoint(-2.5F, 3.6F, 1.1F);
        this.bodyback.addChild(BLupper2);
        this.setRotateAngle(BLupper2, 0.0F, 0.0F, 0.6109F);


        this.BLlower2 = new ModelRenderer(this);
        this.BLlower2.setRotationPoint(-2.2297F, 1.6887F, -0.5F);
        this.BLupper2.addChild(BLlower2);
        this.setRotateAngle(BLlower2, 0.1874F, 0.032F, -0.1477F);


        this.BLfoot2 = new ModelRenderer(this);
        this.BLfoot2.setRotationPoint(-0.0072F, 3.4822F, 0.5765F);
        this.BLlower2.addChild(BLfoot2);
        this.setRotateAngle(BLfoot2, -0.1487F, 0.048F, -0.4369F);

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
