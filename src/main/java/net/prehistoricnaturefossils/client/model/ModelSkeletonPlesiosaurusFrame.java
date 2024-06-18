package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPlesiosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Lefthindflipper1;
    private final ModelRenderer Lefthindflipper2;
    private final ModelRenderer Lefthindflipper3;
    private final ModelRenderer Righthindflipper1;
    private final ModelRenderer Righthindflipper2;
    private final ModelRenderer Righthindflipper3;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer tailfin;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Neck1;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Neck3;
    private final ModelRenderer Neck4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Head;
    private final ModelRenderer snout;
    private final ModelRenderer snout2;
    private final ModelRenderer forehead;
    private final ModelRenderer forehead2;
    private final ModelRenderer Lowerjaw;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer Leftfrontflipper1;
    private final ModelRenderer Leftfrontflipper2;
    private final ModelRenderer Leftfrontflipper3;
    private final ModelRenderer Rightfrontflipper1;
    private final ModelRenderer Rightfrontflipper2;
    private final ModelRenderer Rightfrontflipper3;

    public ModelSkeletonPlesiosaurusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.5F, 23.1F, -17.2F);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -13.7F, 30.0F);
        this.fossil.addChild(Hips);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.8F, -3.1F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0349F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 35, -0.5F, 1.5F, 0.3F, 1, 1, 9, -0.2F, false));

        this.Lefthindflipper1 = new ModelRenderer(this);
        this.Lefthindflipper1.setRotationPoint(4.8F, 2.9306F, 1.48F);
        this.Hips.addChild(Lefthindflipper1);
        this.setRotateAngle(Lefthindflipper1, -0.1407F, -0.2012F, 0.3453F);


        this.Lefthindflipper2 = new ModelRenderer(this);
        this.Lefthindflipper2.setRotationPoint(6.5F, 0.5263F, -0.5234F);
        this.Lefthindflipper1.addChild(Lefthindflipper2);
        this.setRotateAngle(Lefthindflipper2, -0.0461F, -0.2537F, 0.3579F);


        this.Lefthindflipper3 = new ModelRenderer(this);
        this.Lefthindflipper3.setRotationPoint(3.2746F, -1.5F, 0.8181F);
        this.Lefthindflipper2.addChild(Lefthindflipper3);
        this.setRotateAngle(Lefthindflipper3, 0.0F, -0.1309F, 0.0F);


        this.Righthindflipper1 = new ModelRenderer(this);
        this.Righthindflipper1.setRotationPoint(-4.8F, 2.9306F, 1.48F);
        this.Hips.addChild(Righthindflipper1);
        this.setRotateAngle(Righthindflipper1, -0.0961F, 0.1266F, -0.591F);


        this.Righthindflipper2 = new ModelRenderer(this);
        this.Righthindflipper2.setRotationPoint(-6.5F, 0.5263F, -0.5234F);
        this.Righthindflipper1.addChild(Righthindflipper2);
        this.setRotateAngle(Righthindflipper2, 0.0F, 0.1309F, 0.0F);


        this.Righthindflipper3 = new ModelRenderer(this);
        this.Righthindflipper3.setRotationPoint(-3.2746F, -1.5F, 0.8181F);
        this.Righthindflipper2.addChild(Righthindflipper3);
        this.setRotateAngle(Righthindflipper3, 0.0F, 0.1309F, 0.0F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.088F, 0.1304F, -0.0115F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 1, 49, -0.6F, 0.5394F, 0.9515F, 1, 1, 5, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.0117F, 5.8777F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.044F, 0.1308F, -0.0057F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 26, 47, -0.5F, 0.5491F, -0.3548F, 1, 1, 6, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.3394F, 5.8921F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0447F, 0.218F, -0.0097F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 34, 48, -0.5F, 0.1986F, -0.8555F, 1, 1, 7, -0.2F, false));

        this.tailfin = new ModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, -1.7151F, 7.2008F);
        this.Tail3.addChild(tailfin);
        this.setRotateAngle(tailfin, -0.9163F, 0.0F, 0.0F);


        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.55F, -3.0F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.0436F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, -2, 9, -0.5F, 1.2F, -14.0F, 1, 1, 15, -0.2F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.05F, -13.0F);
        this.Bodymiddle.addChild(Bodyfront);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 3.1284F, 17.8F);
        this.Bodyfront.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0349F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 29, -1.0F, -5.25F, -0.5F, 1, 10, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.3F, 15.7F);
        this.Bodyfront.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0349F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 29, -0.5F, 1.4F, 1.5F, 1, 3, 1, -0.25F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.3F, -6.0F);
        this.Bodyfront.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 29, -0.5F, 1.5F, 1.5F, 1, 4, 1, -0.25F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 24, -0.5F, 1.2F, -0.3F, 1, 1, 6, -0.2F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 3.1284F, -3.9F);
        this.Bodyfront.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0349F, -1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 29, -2.5F, -6.25F, -0.5F, 1, 13, 1, -0.2F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.05F, -6.1F);
        this.Bodyfront.addChild(Neck1);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.5F, -7.9F);
        this.Neck1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1222F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 30, -0.5F, 1.9F, 0.0F, 1, 1, 8, -0.2F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 1.2F, -7.3F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.1747F, 0.043F, 0.0076F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.995F, 0.3357F);
        this.Neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 15, -0.5F, -0.803F, -11.6991F, 1, 1, 12, -0.2F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 0.1F, -11.6F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.0F, 0.0873F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 0, 27, -0.5F, 0.3F, -11.0F, 1, 1, 12, -0.2F, false));

        this.Neck4 = new ModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, -0.2F, -11.2F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, 0.0873F, 0.1309F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -7.8F);
        this.Neck4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 47, -0.5F, 0.2F, 0.7F, 1, 1, 8, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.1F, -8.8F);
        this.Neck4.addChild(Head);


        this.snout = new ModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.Head.addChild(snout);
        this.setRotateAngle(snout, 0.0436F, 0.0F, 0.0F);


        this.snout2 = new ModelRenderer(this);
        this.snout2.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.snout.addChild(snout2);
        this.setRotateAngle(snout2, -0.0873F, 0.0F, 0.0F);


        this.forehead = new ModelRenderer(this);
        this.forehead.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.snout2.addChild(forehead);
        this.setRotateAngle(forehead, 0.3578F, 0.0F, 0.0F);


        this.forehead2 = new ModelRenderer(this);
        this.forehead2.setRotationPoint(0.0F, -0.025F, 1.8F);
        this.forehead.addChild(forehead2);
        this.setRotateAngle(forehead2, -0.1876F, 0.0F, 0.0F);


        this.Lowerjaw = new ModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.5672F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.0436F, 0.0F, 0.0F);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.0873F, 0.0F, 0.0F);


        this.Leftfrontflipper1 = new ModelRenderer(this);
        this.Leftfrontflipper1.setRotationPoint(5.0F, 5.0806F, -4.62F);
        this.Bodyfront.addChild(Leftfrontflipper1);
        this.setRotateAngle(Leftfrontflipper1, -0.1665F, 0.0409F, -0.0862F);


        this.Leftfrontflipper2 = new ModelRenderer(this);
        this.Leftfrontflipper2.setRotationPoint(4.0F, 0.3F, -0.4F);
        this.Leftfrontflipper1.addChild(Leftfrontflipper2);
        this.setRotateAngle(Leftfrontflipper2, 0.0229F, -0.1289F, -0.176F);


        this.Leftfrontflipper3 = new ModelRenderer(this);
        this.Leftfrontflipper3.setRotationPoint(7.2489F, 0.5F, 0.4266F);
        this.Leftfrontflipper2.addChild(Leftfrontflipper3);
        this.setRotateAngle(Leftfrontflipper3, 0.0285F, -0.1278F, -0.22F);


        this.Rightfrontflipper1 = new ModelRenderer(this);
        this.Rightfrontflipper1.setRotationPoint(-5.0F, 5.0806F, -4.62F);
        this.Bodyfront.addChild(Rightfrontflipper1);
        this.setRotateAngle(Rightfrontflipper1, -0.0701F, -0.3112F, 0.2069F);


        this.Rightfrontflipper2 = new ModelRenderer(this);
        this.Rightfrontflipper2.setRotationPoint(-4.0F, 0.3F, -0.4F);
        this.Rightfrontflipper1.addChild(Rightfrontflipper2);
        this.setRotateAngle(Rightfrontflipper2, 0.0229F, 0.1289F, 0.176F);


        this.Rightfrontflipper3 = new ModelRenderer(this);
        this.Rightfrontflipper3.setRotationPoint(-7.2489F, 0.5F, 0.4266F);
        this.Rightfrontflipper2.addChild(Rightfrontflipper3);
        this.setRotateAngle(Rightfrontflipper3, 0.0172F, 0.1298F, 0.132F);

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
