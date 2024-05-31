package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCamarasaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer base;
    private final ModelRenderer hip;
    private final ModelRenderer basin2_r1;
    private final ModelRenderer upperlegleft;
    private final ModelRenderer lowerlegleft;
    private final ModelRenderer footleft;
    private final ModelRenderer upperlegright;
    private final ModelRenderer lowerlegright;
    private final ModelRenderer footright;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail2_r2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7_r1;
    private final ModelRenderer body;
    private final ModelRenderer body3_r1;
    private final ModelRenderer chest;
    private final ModelRenderer neck1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer neck5;
    private final ModelRenderer neck6_r1;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2;
    private final ModelRenderer lowerteeth1;
    private final ModelRenderer nose1;
    private final ModelRenderer head2;
    private final ModelRenderer nose2;
    private final ModelRenderer nose3;
    private final ModelRenderer teeth1;
    private final ModelRenderer upperarmleft;
    private final ModelRenderer lowerarmleft;
    private final ModelRenderer handleft;
    private final ModelRenderer clawleft;
    private final ModelRenderer upperarmright;
    private final ModelRenderer lowerarmright;
    private final ModelRenderer handright;
    private final ModelRenderer clawright;

    public ModelSkeletonCamarasaurusFrame() {
        this.textureWidth = 183;
        this.textureHeight = 210;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -1.0F, -51.0F, 17.0F, 2, 51, 2, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -3.6F, -93.0F, -24.0F, 2, 93, 2, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -40.5F, -23.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 16.0F, -16.5F, -1.0F, 2, 33, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 4.0F, -12.5F, 40.0F, 2, 25, 2, 0.0F, false));

        this.base = new ModelRenderer(this);
        this.base.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(base);


        this.hip = new ModelRenderer(this);
        this.hip.setRotationPoint(0.0F, -48.1F, 24.2F);
        this.base.addChild(hip);
        this.setRotateAngle(hip, -0.6981F, 0.0F, 0.0F);


        this.basin2_r1 = new ModelRenderer(this);
        this.basin2_r1.setRotationPoint(0.0F, 1.6115F, -8.5454F);
        this.hip.addChild(basin2_r1);
        this.setRotateAngle(basin2_r1, 0.0873F, 0.0F, 0.0F);
        this.basin2_r1.cubeList.add(new ModelBox(basin2_r1, 0, 51, -2.0F, -1.0F, 0.0F, 4, 4, 18, -0.2F, false));

        this.upperlegleft = new ModelRenderer(this);
        this.upperlegleft.setRotationPoint(11.5F, 3.5408F, -4.0387F);
        this.hip.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, 0.3054F, 0.0F, 0.0F);


        this.lowerlegleft = new ModelRenderer(this);
        this.lowerlegleft.setRotationPoint(-0.1F, 23.3156F, 4.0658F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 0.48F, 0.0F, 0.0F);


        this.footleft = new ModelRenderer(this);
        this.footleft.setRotationPoint(-0.5F, 19.4986F, 1.5926F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, -0.0873F, 0.0F, 0.0F);


        this.upperlegright = new ModelRenderer(this);
        this.upperlegright.setRotationPoint(-11.5F, 3.5408F, -4.0387F);
        this.hip.addChild(upperlegright);
        this.setRotateAngle(upperlegright, 0.1745F, 0.0F, 0.0F);


        this.lowerlegright = new ModelRenderer(this);
        this.lowerlegright.setRotationPoint(0.1F, 23.3156F, 4.0658F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 0.6109F, 0.0F, 0.0F);


        this.footright = new ModelRenderer(this);
        this.footright.setRotationPoint(0.5F, 19.4986F, 1.5926F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, -0.0436F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.4092F, 8.9754F);
        this.hip.addChild(tail1);
        this.setRotateAngle(tail1, -0.0837F, -0.0907F, -0.036F);


        this.tail2_r1 = new ModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.0F, -0.8388F, 13.5304F);
        this.tail1.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, 0.0873F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 0, 25, -2.0F, -1.0F, -14.0F, 4, 4, 19, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.4852F, 18.2256F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.3081F, -0.0152F, -0.0963F);


        this.tail2_r2 = new ModelRenderer(this);
        this.tail2_r2.setRotationPoint(0.0F, 0.638F, 3.4233F);
        this.tail2.addChild(tail2_r2);
        this.setRotateAngle(tail2_r2, -0.1309F, 0.0F, 0.0F);
        this.tail2_r2.cubeList.add(new ModelBox(tail2_r2, 0, 77, -1.5F, -0.8F, -3.9F, 3, 3, 16, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.6178F, 16.369F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.176F, -0.1289F, -0.0229F);
        this.tail3.cubeList.add(new ModelBox(tail3, 47, 84, -1.0F, 0.4113F, -2.3689F, 2, 2, 19, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.2026F, 15.2315F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.176F, -0.1289F, -0.0229F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 97, -1.0F, 0.3F, 0.6F, 2, 2, 14, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.2F, 14.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0886F, -0.1739F, 0.0154F);
        this.tail5.cubeList.add(new ModelBox(tail5, 23, 93, -0.5F, 0.5057F, -0.1307F, 1, 1, 16, -0.2F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.0943F, 15.4693F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2214F, -0.1704F, 0.0381F);


        this.tail7_r1 = new ModelRenderer(this);
        this.tail7_r1.setRotationPoint(0.0F, 0.0105F, 0.3081F);
        this.tail6.addChild(tail7_r1);
        this.setRotateAngle(tail7_r1, -0.0873F, 0.0F, 0.0F);
        this.tail7_r1.cubeList.add(new ModelBox(tail7_r1, 25, 27, -0.5F, 0.5F, 0.0F, 1, 1, 22, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.6154F, -8.7125F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 45, 51, -2.0F, -1.6539F, -29.1329F, 4, 4, 17, -0.2F, false));

        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -0.6539F, -13.0329F);
        this.body.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.1309F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 88, 86, -2.0F, -1.0F, 0.4F, 4, 4, 14, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.0096F, -30.088F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0436F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 71, 45, -2.0F, -0.4422F, -14.6626F, 4, 4, 16, -0.2F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.3104F, -13.8298F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.4336F, 0.2864F, 0.2047F);
        this.neck1.cubeList.add(new ModelBox(neck1, 49, 5, -1.5F, -0.2383F, -19.1472F, 3, 3, 20, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.056F, -18.8238F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 76, 0, -1.5F, -0.4642F, -15.4288F, 3, 3, 16, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.0055F, -15.2425F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1309F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 89, 20, -1.0F, 0.5078F, -15.2769F, 2, 2, 16, -0.2F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.2698F, -15.0053F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.3491F, 0.0F, 0.0F);


        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.0F, -0.7747F, -11.9007F);
        this.neck4.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, -0.0873F, 0.0F, 0.0F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 111, 84, -1.0F, 0.0F, 0.0F, 2, 2, 12, -0.2F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.8193F, -11.9536F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.3054F, 0.0F, 0.0F);


        this.neck6_r1 = new ModelRenderer(this);
        this.neck6_r1.setRotationPoint(0.0F, -0.2949F, -4.217F);
        this.neck5.addChild(neck6_r1);
        this.setRotateAngle(neck6_r1, -0.1745F, 0.0F, 0.0F);
        this.neck6_r1.cubeList.add(new ModelBox(neck6_r1, 86, 155, -1.0F, -0.4521F, -0.3955F, 2, 2, 5, -0.2F, false));

        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(0.0F, -0.2949F, -11.117F);
        this.neck5.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, 0.1309F, 0.0F, 0.0F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 143, 88, -1.0F, 0.4485F, -1.1545F, 2, 2, 8, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-1.0F, -0.0441F, -11.0239F);
        this.neck5.addChild(head);
        this.setRotateAngle(head, 0.3681F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.7F, 0.2F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3054F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 2.3F, -5.8F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.48F, 0.0F, 0.0F);


        this.lowerteeth1 = new ModelRenderer(this);
        this.lowerteeth1.setRotationPoint(0.0F, 0.0F, -2.2F);
        this.jaw2.addChild(lowerteeth1);
        this.setRotateAngle(lowerteeth1, -0.0873F, 0.0F, 0.0F);


        this.nose1 = new ModelRenderer(this);
        this.nose1.setRotationPoint(0.0F, -2.9F, -6.0F);
        this.head.addChild(nose1);
        this.setRotateAngle(nose1, 0.2618F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.0F, -6.7F);
        this.head.addChild(head2);


        this.nose2 = new ModelRenderer(this);
        this.nose2.setRotationPoint(0.0F, -1.15F, -0.85F);
        this.head2.addChild(nose2);
        this.setRotateAngle(nose2, 0.9163F, 0.0F, 0.0F);


        this.nose3 = new ModelRenderer(this);
        this.nose3.setRotationPoint(0.0F, 0.9F, -2.15F);
        this.head2.addChild(nose3);
        this.setRotateAngle(nose3, 1.2217F, 0.0F, 0.0F);


        this.teeth1 = new ModelRenderer(this);
        this.teeth1.setRotationPoint(0.0F, 1.05F, -5.2F);
        this.head2.addChild(teeth1);
        this.setRotateAngle(teeth1, 0.1384F, 0.0F, 0.0F);


        this.upperarmleft = new ModelRenderer(this);
        this.upperarmleft.setRotationPoint(15.5F, 23.1919F, -4.1476F);
        this.chest.addChild(upperarmleft);
        this.setRotateAngle(upperarmleft, 1.0036F, 0.0F, 0.0F);


        this.lowerarmleft = new ModelRenderer(this);
        this.lowerarmleft.setRotationPoint(0.0F, 17.8835F, 0.2553F);
        this.upperarmleft.addChild(lowerarmleft);
        this.setRotateAngle(lowerarmleft, -0.7418F, 0.0F, 0.0F);


        this.handleft = new ModelRenderer(this);
        this.handleft.setRotationPoint(0.0F, 14.1183F, -3.4794F);
        this.lowerarmleft.addChild(handleft);
        this.setRotateAngle(handleft, 0.5672F, 0.0F, 0.0F);


        this.clawleft = new ModelRenderer(this);
        this.clawleft.setRotationPoint(-2.6F, 11.8F, 0.9F);
        this.handleft.addChild(clawleft);
        this.setRotateAngle(clawleft, 0.0F, -0.2276F, 0.0F);


        this.upperarmright = new ModelRenderer(this);
        this.upperarmright.setRotationPoint(-15.5F, 23.1919F, -4.1476F);
        this.chest.addChild(upperarmright);
        this.setRotateAngle(upperarmright, 0.6981F, 0.0F, 0.0F);


        this.lowerarmright = new ModelRenderer(this);
        this.lowerarmright.setRotationPoint(0.0F, 17.8835F, 0.2553F);
        this.upperarmright.addChild(lowerarmright);
        this.setRotateAngle(lowerarmright, -0.2182F, 0.0F, 0.0F);


        this.handright = new ModelRenderer(this);
        this.handright.setRotationPoint(0.0F, 14.1183F, -3.4794F);
        this.lowerarmright.addChild(handright);
        this.setRotateAngle(handright, 0.3491F, 0.0F, 0.0F);


        this.clawright = new ModelRenderer(this);
        this.clawright.setRotationPoint(2.6F, 11.8F, 0.9F);
        this.handright.addChild(clawright);
        this.setRotateAngle(clawright, 0.0F, 0.2276F, 0.0F);

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
