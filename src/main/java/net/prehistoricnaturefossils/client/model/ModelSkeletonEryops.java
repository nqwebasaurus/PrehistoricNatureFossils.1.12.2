package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEryops extends ModelBase {
    private final ModelRenderer body;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Hips_r2;
    private final ModelRenderer body5_r1;
    private final ModelRenderer Hips_r3;
    private final ModelRenderer Hips_r4;
    private final ModelRenderer body4_r1;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer neck11_r1;
    private final ModelRenderer neck10_r1;
    private final ModelRenderer neck9_r1;
    private final ModelRenderer neck8_r1;
    private final ModelRenderer neck7_r1;
    private final ModelRenderer neck9_r2;
    private final ModelRenderer neck8_r2;
    private final ModelRenderer neck9_r3;
    private final ModelRenderer neck8_r3;
    private final ModelRenderer neck7_r2;
    private final ModelRenderer neck7_r3;
    private final ModelRenderer neck6_r1;
    private final ModelRenderer neck7_r4;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer neck9_r4;
    private final ModelRenderer neck7_r5;
    private final ModelRenderer neck8_r4;
    private final ModelRenderer neck7_r6;
    private final ModelRenderer neck8_r5;
    private final ModelRenderer neck6_r2;
    private final ModelRenderer neck8_r6;
    private final ModelRenderer neck5_r2;
    private final ModelRenderer neck7_r7;
    private final ModelRenderer neck6_r3;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer neck6_r4;
    private final ModelRenderer neck8_r7;
    private final ModelRenderer neck4_r2;
    private final ModelRenderer neck;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck5_r3;
    private final ModelRenderer neck4_r3;
    private final ModelRenderer neck3_r2;
    private final ModelRenderer neck4_r4;
    private final ModelRenderer neck3_r3;
    private final ModelRenderer neck5_r4;
    private final ModelRenderer neck3_r4;
    private final ModelRenderer neck2_r2;
    private final ModelRenderer neck5_r5;
    private final ModelRenderer neck6_r5;
    private final ModelRenderer neck5_r6;
    private final ModelRenderer neck4_r5;
    private final ModelRenderer neck3_r5;
    private final ModelRenderer legFL3;
    private final ModelRenderer legFL4;
    private final ModelRenderer legFL5;
    private final ModelRenderer legFL;
    private final ModelRenderer legFL1;
    private final ModelRenderer legFL2;
    private final ModelRenderer headpart;
    private final ModelRenderer head;
    private final ModelRenderer head5_r1;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head5_r2;
    private final ModelRenderer eyeL;
    private final ModelRenderer eyeL_r1;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw4_r1;
    private final ModelRenderer jaw8_r1;
    private final ModelRenderer jaw5_r1;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw7_r1;
    private final ModelRenderer jaw4_r2;
    private final ModelRenderer head5_r3;
    private final ModelRenderer head4_r2;
    private final ModelRenderer tail;
    private final ModelRenderer tail2_r1;
    private final ModelRenderer tail1_r1;
    private final ModelRenderer neck13_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail2_r2;
    private final ModelRenderer tail4_r1;
    private final ModelRenderer tail3_r1;
    private final ModelRenderer neck14_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail3_r2;
    private final ModelRenderer neck16_r1;
    private final ModelRenderer tail5_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer tail6_r1;
    private final ModelRenderer tail5;
    private final ModelRenderer legHL;
    private final ModelRenderer legHL1;
    private final ModelRenderer legHL2;
    private final ModelRenderer legHL3;
    private final ModelRenderer legHL4;
    private final ModelRenderer legHL5;

    public ModelSkeletonEryops() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 14.9F, 1.6F);
        this.body.cubeList.add(new ModelBox(body, 28, 0, -0.5F, -0.3589F, -2.7193F, 1, 1, 7, 0.002F, false));

        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-2.5F, 1.7F, 8.2F);
        this.body.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.261F, 0.0203F, -0.1423F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 29, 38, 0.9636F, 2.2092F, -3.3035F, 1, 3, 5, 0.0F, true));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(-1.2F, 3.8F, 8.2F);
        this.body.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.2549F, -0.0605F, -0.446F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 0, 0, -0.1398F, -1.9225F, -2.907F, 1, 3, 3, 0.0F, true));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(-0.5F, 0.5418F, 6.6291F);
        this.body.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -0.141F, -0.1174F, -0.6898F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 15, 5, -2.0F, -0.5F, -0.5F, 2, 1, 2, 0.0F, true));

        this.Hips_r3 = new ModelRenderer(this);
        this.Hips_r3.setRotationPoint(2.5F, 1.7F, 8.2F);
        this.body.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.261F, -0.0203F, 0.1423F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 29, 38, -1.9636F, 2.2092F, -3.3035F, 1, 3, 5, 0.0F, false));

        this.Hips_r4 = new ModelRenderer(this);
        this.Hips_r4.setRotationPoint(1.2F, 3.8F, 8.2F);
        this.body.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, -0.2549F, 0.0605F, 0.446F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 0, 0, -0.8602F, -1.9225F, -2.907F, 1, 3, 3, 0.0F, false));

        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(0.5F, 0.5418F, 6.6291F);
        this.body.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -0.141F, 0.1174F, 0.6898F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 15, 5, 0.0F, -0.5F, -0.5F, 2, 1, 2, 0.0F, false));

        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -0.1F, 4.1F);
        this.body.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.1833F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 39, 29, -0.5F, -0.3299F, 0.1037F, 1, 1, 5, 0.0F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(-0.5F, 0.5F, -6.7F);
        this.body.addChild(body2_r1);
        this.setRotateAngle(body2_r1, 0.0873F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 13, 41, 0.0F, -0.5F, 0.1F, 1, 1, 4, 0.0F, false));

        this.neck11_r1 = new ModelRenderer(this);
        this.neck11_r1.setRotationPoint(0.0F, 0.4496F, 8.6763F);
        this.body.addChild(neck11_r1);
        this.setRotateAngle(neck11_r1, -0.3665F, 0.0F, 0.0F);
        this.neck11_r1.cubeList.add(new ModelBox(neck11_r1, 20, 41, 0.0F, -1.2073F, -0.3289F, 0, 2, 1, 0.0F, false));

        this.neck10_r1 = new ModelRenderer(this);
        this.neck10_r1.setRotationPoint(0.0F, 0.1496F, 6.7763F);
        this.body.addChild(neck10_r1);
        this.setRotateAngle(neck10_r1, -0.2531F, 0.0F, 0.0F);
        this.neck10_r1.cubeList.add(new ModelBox(neck10_r1, 47, 26, 0.0F, -1.3914F, -0.4054F, 0, 2, 1, 0.0F, false));

        this.neck9_r1 = new ModelRenderer(this);
        this.neck9_r1.setRotationPoint(0.0F, -0.0504F, 4.6763F);
        this.body.addChild(neck9_r1);
        this.setRotateAngle(neck9_r1, -0.1484F, 0.0F, 0.0F);
        this.neck9_r1.cubeList.add(new ModelBox(neck9_r1, 28, 47, 0.0F, -1.604F, -0.2989F, 0, 2, 1, 0.0F, false));

        this.neck8_r1 = new ModelRenderer(this);
        this.neck8_r1.setRotationPoint(0.0F, -0.0504F, 2.6763F);
        this.body.addChild(neck8_r1);
        this.setRotateAngle(neck8_r1, -0.0611F, 0.0F, 0.0F);
        this.neck8_r1.cubeList.add(new ModelBox(neck8_r1, 31, 47, 0.0F, -1.7261F, -0.3027F, 0, 2, 1, 0.0F, false));

        this.neck7_r1 = new ModelRenderer(this);
        this.neck7_r1.setRotationPoint(0.0F, -0.0504F, -3.3237F);
        this.body.addChild(neck7_r1);
        this.setRotateAngle(neck7_r1, -0.0175F, 0.0F, 0.0F);
        this.neck7_r1.cubeList.add(new ModelBox(neck7_r1, 39, 47, 0.0F, -1.8308F, 3.6964F, 0, 2, 1, 0.0F, false));
        this.neck7_r1.cubeList.add(new ModelBox(neck7_r1, 42, 47, 0.0F, -1.8308F, 1.6964F, 0, 2, 1, 0.0F, false));
        this.neck7_r1.cubeList.add(new ModelBox(neck7_r1, 0, 48, 0.0F, -1.8308F, -0.3036F, 0, 2, 1, 0.0F, false));

        this.neck9_r2 = new ModelRenderer(this);
        this.neck9_r2.setRotationPoint(-0.4865F, 0.3072F, 4.9717F);
        this.body.addChild(neck9_r2);
        this.setRotateAngle(neck9_r2, 0.2079F, 0.0991F, 1.1321F);
        this.neck9_r2.cubeList.add(new ModelBox(neck9_r2, 34, 9, 0.0254F, 0.0455F, -0.5648F, 0, 2, 1, 0.0F, true));

        this.neck8_r2 = new ModelRenderer(this);
        this.neck8_r2.setRotationPoint(-0.4865F, 0.3072F, 2.9717F);
        this.body.addChild(neck8_r2);
        this.setRotateAngle(neck8_r2, 0.2079F, 0.0991F, 1.1321F);
        this.neck8_r2.cubeList.add(new ModelBox(neck8_r2, 13, 34, 0.0254F, 0.0455F, -0.5648F, 0, 2, 1, 0.0F, true));

        this.neck9_r3 = new ModelRenderer(this);
        this.neck9_r3.setRotationPoint(-0.4865F, 0.3072F, 2.9717F);
        this.body.addChild(neck9_r3);
        this.setRotateAngle(neck9_r3, 0.1311F, 0.1895F, 0.6106F);
        this.neck9_r3.cubeList.add(new ModelBox(neck9_r3, 20, 30, -0.9979F, 1.7936F, -0.5648F, 0, 1, 1, 0.0F, true));

        this.neck8_r3 = new ModelRenderer(this);
        this.neck8_r3.setRotationPoint(-0.4865F, 0.3072F, 0.9717F);
        this.body.addChild(neck8_r3);
        this.setRotateAngle(neck8_r3, 0.1311F, 0.1895F, 0.6106F);
        this.neck8_r3.cubeList.add(new ModelBox(neck8_r3, 34, 29, -0.9979F, 1.7936F, -0.5648F, 0, 2, 1, 0.0F, true));
        this.neck8_r3.cubeList.add(new ModelBox(neck8_r3, 24, 0, -0.9979F, 2.0936F, -0.0648F, 0, 1, 1, 0.0F, true));

        this.neck7_r2 = new ModelRenderer(this);
        this.neck7_r2.setRotationPoint(-0.4865F, 0.3072F, 0.9717F);
        this.body.addChild(neck7_r2);
        this.setRotateAngle(neck7_r2, 0.2079F, 0.0991F, 1.1321F);
        this.neck7_r2.cubeList.add(new ModelBox(neck7_r2, 38, 0, 0.0254F, 0.0455F, -0.5648F, 0, 2, 1, 0.0F, true));

        this.neck7_r3 = new ModelRenderer(this);
        this.neck7_r3.setRotationPoint(-0.4865F, 0.4072F, -1.0283F);
        this.body.addChild(neck7_r3);
        this.setRotateAngle(neck7_r3, 0.2033F, 0.1391F, 0.6224F);
        this.neck7_r3.cubeList.add(new ModelBox(neck7_r3, 33, 18, -0.9979F, 2.3936F, 0.0352F, 0, 1, 1, 0.0F, true));
        this.neck7_r3.cubeList.add(new ModelBox(neck7_r3, 0, 26, -0.9979F, 1.7936F, -0.5648F, 0, 3, 1, 0.0F, true));

        this.neck6_r1 = new ModelRenderer(this);
        this.neck6_r1.setRotationPoint(-0.4865F, 0.4072F, -1.0283F);
        this.body.addChild(neck6_r1);
        this.setRotateAngle(neck6_r1, 0.245F, 0.0201F, 1.1343F);
        this.neck6_r1.cubeList.add(new ModelBox(neck6_r1, 39, 29, 0.0254F, 0.0455F, -0.5648F, 0, 2, 1, 0.0F, true));

        this.neck7_r4 = new ModelRenderer(this);
        this.neck7_r4.setRotationPoint(-0.4865F, 0.3072F, -3.0283F);
        this.body.addChild(neck7_r4);
        this.setRotateAngle(neck7_r4, 0.2033F, 0.1391F, 0.6224F);
        this.neck7_r4.cubeList.add(new ModelBox(neck7_r4, 30, 18, -0.9979F, 2.7936F, 0.0352F, 0, 1, 1, 0.0F, true));
        this.neck7_r4.cubeList.add(new ModelBox(neck7_r4, 39, 53, -0.9979F, 1.7936F, -0.5648F, 0, 4, 1, 0.0F, true));

        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(-0.4865F, 0.3072F, -3.0283F);
        this.body.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, 0.245F, 0.0201F, 1.1343F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 0, 40, 0.0254F, 0.0455F, -0.5648F, 0, 2, 1, 0.0F, true));

        this.neck9_r4 = new ModelRenderer(this);
        this.neck9_r4.setRotationPoint(-0.4865F, 0.4072F, -5.0283F);
        this.body.addChild(neck9_r4);
        this.setRotateAngle(neck9_r4, 0.2033F, 0.1391F, 0.6224F);
        this.neck9_r4.cubeList.add(new ModelBox(neck9_r4, 27, 16, -0.9979F, 2.7936F, -0.0648F, 0, 1, 1, 0.0F, true));
        this.neck9_r4.cubeList.add(new ModelBox(neck9_r4, 36, 53, -0.9979F, 1.7936F, -0.5648F, 0, 4, 1, 0.0F, true));

        this.neck7_r5 = new ModelRenderer(this);
        this.neck7_r5.setRotationPoint(-0.4865F, 0.4072F, -5.0283F);
        this.body.addChild(neck7_r5);
        this.setRotateAngle(neck7_r5, 0.245F, 0.0201F, 1.1343F);
        this.neck7_r5.cubeList.add(new ModelBox(neck7_r5, 39, 9, 0.0254F, 0.0455F, -0.5648F, 0, 2, 1, 0.0F, true));

        this.neck8_r4 = new ModelRenderer(this);
        this.neck8_r4.setRotationPoint(0.4865F, 0.3072F, 4.9717F);
        this.body.addChild(neck8_r4);
        this.setRotateAngle(neck8_r4, 0.2079F, -0.0991F, -1.1321F);
        this.neck8_r4.cubeList.add(new ModelBox(neck8_r4, 34, 9, -0.0254F, 0.0455F, -0.5648F, 0, 2, 1, 0.0F, false));

        this.neck7_r6 = new ModelRenderer(this);
        this.neck7_r6.setRotationPoint(0.4865F, 0.3072F, 2.9717F);
        this.body.addChild(neck7_r6);
        this.setRotateAngle(neck7_r6, 0.2079F, -0.0991F, -1.1321F);
        this.neck7_r6.cubeList.add(new ModelBox(neck7_r6, 13, 34, -0.0254F, 0.0455F, -0.5648F, 0, 2, 1, 0.0F, false));

        this.neck8_r5 = new ModelRenderer(this);
        this.neck8_r5.setRotationPoint(0.4865F, 0.3072F, 2.9717F);
        this.body.addChild(neck8_r5);
        this.setRotateAngle(neck8_r5, 0.1311F, -0.1895F, -0.6106F);
        this.neck8_r5.cubeList.add(new ModelBox(neck8_r5, 20, 30, 0.9979F, 1.7936F, -0.5648F, 0, 1, 1, 0.0F, false));

        this.neck6_r2 = new ModelRenderer(this);
        this.neck6_r2.setRotationPoint(0.4865F, 0.3072F, 0.9717F);
        this.body.addChild(neck6_r2);
        this.setRotateAngle(neck6_r2, 0.2079F, -0.0991F, -1.1321F);
        this.neck6_r2.cubeList.add(new ModelBox(neck6_r2, 38, 0, -0.0254F, 0.0455F, -0.5648F, 0, 2, 1, 0.0F, false));

        this.neck8_r6 = new ModelRenderer(this);
        this.neck8_r6.setRotationPoint(0.4865F, 0.3072F, 0.9717F);
        this.body.addChild(neck8_r6);
        this.setRotateAngle(neck8_r6, 0.1311F, -0.1895F, -0.6106F);
        this.neck8_r6.cubeList.add(new ModelBox(neck8_r6, 24, 0, 0.9979F, 2.0936F, -0.0648F, 0, 1, 1, 0.0F, false));
        this.neck8_r6.cubeList.add(new ModelBox(neck8_r6, 34, 29, 0.9979F, 1.7936F, -0.5648F, 0, 2, 1, 0.0F, false));

        this.neck5_r2 = new ModelRenderer(this);
        this.neck5_r2.setRotationPoint(0.4865F, 0.4072F, -1.0283F);
        this.body.addChild(neck5_r2);
        this.setRotateAngle(neck5_r2, 0.245F, -0.0201F, -1.1343F);
        this.neck5_r2.cubeList.add(new ModelBox(neck5_r2, 39, 29, -0.0254F, 0.0455F, -0.5648F, 0, 2, 1, 0.0F, false));

        this.neck7_r7 = new ModelRenderer(this);
        this.neck7_r7.setRotationPoint(0.4865F, 0.4072F, -1.0283F);
        this.body.addChild(neck7_r7);
        this.setRotateAngle(neck7_r7, 0.2033F, -0.1391F, -0.6224F);
        this.neck7_r7.cubeList.add(new ModelBox(neck7_r7, 0, 26, 0.9979F, 1.7936F, -0.5648F, 0, 3, 1, 0.0F, false));
        this.neck7_r7.cubeList.add(new ModelBox(neck7_r7, 33, 18, 0.9979F, 2.3936F, 0.0352F, 0, 1, 1, 0.0F, false));

        this.neck6_r3 = new ModelRenderer(this);
        this.neck6_r3.setRotationPoint(0.4865F, 0.3072F, -3.0283F);
        this.body.addChild(neck6_r3);
        this.setRotateAngle(neck6_r3, 0.2033F, -0.1391F, -0.6224F);
        this.neck6_r3.cubeList.add(new ModelBox(neck6_r3, 30, 18, 0.9979F, 2.7936F, 0.0352F, 0, 1, 1, 0.0F, false));
        this.neck6_r3.cubeList.add(new ModelBox(neck6_r3, 39, 53, 0.9979F, 1.7936F, -0.5648F, 0, 4, 1, 0.0F, false));

        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.4865F, 0.3072F, -3.0283F);
        this.body.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, 0.245F, -0.0201F, -1.1343F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 0, 40, -0.0254F, 0.0455F, -0.5648F, 0, 2, 1, 0.0F, false));

        this.neck6_r4 = new ModelRenderer(this);
        this.neck6_r4.setRotationPoint(0.4865F, 0.4072F, -5.0283F);
        this.body.addChild(neck6_r4);
        this.setRotateAngle(neck6_r4, 0.245F, -0.0201F, -1.1343F);
        this.neck6_r4.cubeList.add(new ModelBox(neck6_r4, 39, 9, -0.0254F, 0.0455F, -0.5648F, 0, 2, 1, 0.0F, false));

        this.neck8_r7 = new ModelRenderer(this);
        this.neck8_r7.setRotationPoint(0.4865F, 0.4072F, -5.0283F);
        this.body.addChild(neck8_r7);
        this.setRotateAngle(neck8_r7, 0.2033F, -0.1391F, -0.6224F);
        this.neck8_r7.cubeList.add(new ModelBox(neck8_r7, 27, 16, 0.9979F, 2.7936F, -0.0648F, 0, 1, 1, 0.0F, false));
        this.neck8_r7.cubeList.add(new ModelBox(neck8_r7, 36, 53, 0.9979F, 1.7936F, -0.5648F, 0, 4, 1, 0.0F, false));

        this.neck4_r2 = new ModelRenderer(this);
        this.neck4_r2.setRotationPoint(0.0F, 0.2496F, -7.2237F);
        this.body.addChild(neck4_r2);
        this.setRotateAngle(neck4_r2, 0.0349F, 0.0F, 0.0F);
        this.neck4_r2.cubeList.add(new ModelBox(neck4_r2, 7, 48, 0.0F, -1.9945F, 1.6045F, 0, 2, 1, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(-1.0F, 0.4F, -6.6F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0F, -0.2618F, 0.0F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(1.0F, -0.1504F, -0.6237F);
        this.neck.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 0.0698F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 50, 47, 0.0F, -1.8945F, -0.3955F, 0, 2, 1, 0.0F, false));

        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(1.0F, 0.21F, -4.0F);
        this.neck.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.1047F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 52, 38, 0.0F, -1.7F, 1.0F, 0, 2, 1, 0.0F, false));
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 48, 32, -0.5F, -0.2F, 0.0F, 1, 1, 4, -0.002F, false));

        this.neck5_r3 = new ModelRenderer(this);
        this.neck5_r3.setRotationPoint(0.5135F, 0.1072F, -0.4283F);
        this.neck.addChild(neck5_r3);
        this.setRotateAngle(neck5_r3, 0.3024F, 0.2843F, 0.5997F);
        this.neck5_r3.cubeList.add(new ModelBox(neck5_r3, 17, 34, -0.9979F, 1.7936F, -0.5648F, 0, 3, 1, 0.0F, true));
        this.neck5_r3.cubeList.add(new ModelBox(neck5_r3, 14, 26, -0.9979F, 2.7936F, 0.0352F, 0, 1, 1, 0.0F, true));

        this.neck4_r3 = new ModelRenderer(this);
        this.neck4_r3.setRotationPoint(0.5135F, 0.1072F, -0.4283F);
        this.neck.addChild(neck4_r3);
        this.setRotateAngle(neck4_r3, 0.4004F, 0.1001F, 1.1F);
        this.neck4_r3.cubeList.add(new ModelBox(neck4_r3, 8, 40, 0.0254F, 0.0455F, -0.5648F, 0, 2, 1, 0.0F, true));

        this.neck3_r2 = new ModelRenderer(this);
        this.neck3_r2.setRotationPoint(0.5F, 0.3461F, -2.3723F);
        this.neck.addChild(neck3_r2);
        this.setRotateAngle(neck3_r2, 0.3293F, -0.0802F, 0.87F);
        this.neck3_r2.cubeList.add(new ModelBox(neck3_r2, 14, 40, 0.0F, -0.0055F, -0.6045F, 0, 2, 1, 0.0F, true));

        this.neck4_r4 = new ModelRenderer(this);
        this.neck4_r4.setRotationPoint(-1.0F, 1.6461F, -2.1723F);
        this.neck.addChild(neck4_r4);
        this.setRotateAngle(neck4_r4, 0.3263F, 0.0919F, 0.3748F);
        this.neck4_r4.cubeList.add(new ModelBox(neck4_r4, 11, 40, -0.06F, 0.0339F, -0.1494F, 0, 2, 1, 0.0F, true));

        this.neck3_r3 = new ModelRenderer(this);
        this.neck3_r3.setRotationPoint(1.4865F, 0.1072F, -0.4283F);
        this.neck.addChild(neck3_r3);
        this.setRotateAngle(neck3_r3, 0.0901F, 0.0605F, -1.0938F);
        this.neck3_r3.cubeList.add(new ModelBox(neck3_r3, 8, 40, -0.0254F, 0.0455F, -0.5648F, 0, 2, 1, 0.0F, false));

        this.neck5_r4 = new ModelRenderer(this);
        this.neck5_r4.setRotationPoint(1.4865F, 0.1072F, -0.4283F);
        this.neck.addChild(neck5_r4);
        this.setRotateAngle(neck5_r4, 0.1082F, 0.0075F, -0.5725F);
        this.neck5_r4.cubeList.add(new ModelBox(neck5_r4, 14, 26, 0.9979F, 2.7936F, 0.0352F, 0, 1, 1, 0.0F, false));
        this.neck5_r4.cubeList.add(new ModelBox(neck5_r4, 17, 34, 0.9979F, 1.7936F, -0.5648F, 0, 3, 1, 0.0F, false));

        this.neck3_r4 = new ModelRenderer(this);
        this.neck3_r4.setRotationPoint(3.0F, 1.6461F, -2.1723F);
        this.neck.addChild(neck3_r4);
        this.setRotateAngle(neck3_r4, 0.3263F, -0.0919F, -0.3748F);
        this.neck3_r4.cubeList.add(new ModelBox(neck3_r4, 11, 40, 0.06F, 0.0339F, -0.1494F, 0, 2, 1, 0.0F, false));

        this.neck2_r2 = new ModelRenderer(this);
        this.neck2_r2.setRotationPoint(1.5F, 0.3461F, -2.3723F);
        this.neck.addChild(neck2_r2);
        this.setRotateAngle(neck2_r2, 0.3293F, 0.0802F, -0.87F);
        this.neck2_r2.cubeList.add(new ModelBox(neck2_r2, 14, 40, 0.0F, -0.0055F, -0.6045F, 0, 2, 1, 0.0F, false));

        this.neck5_r5 = new ModelRenderer(this);
        this.neck5_r5.setRotationPoint(-3.7F, 2.7596F, -1.9247F);
        this.neck.addChild(neck5_r5);
        this.setRotateAngle(neck5_r5, -0.3259F, 0.3827F, 0.8352F);
        this.neck5_r5.cubeList.add(new ModelBox(neck5_r5, 37, 38, -0.1207F, -1.1008F, -0.4025F, 4, 1, 3, 0.0F, true));

        this.neck6_r5 = new ModelRenderer(this);
        this.neck6_r5.setRotationPoint(-3.4F, 5.0596F, -1.9247F);
        this.neck.addChild(neck6_r5);
        this.setRotateAngle(neck6_r5, 0.1618F, 0.4725F, 1.9153F);
        this.neck6_r5.cubeList.add(new ModelBox(neck6_r5, 15, 16, -6.1236F, -0.1339F, -1.5F, 4, 1, 3, -0.003F, true));

        this.neck5_r6 = new ModelRenderer(this);
        this.neck5_r6.setRotationPoint(5.4F, 5.0596F, -1.9247F);
        this.neck.addChild(neck5_r6);
        this.setRotateAngle(neck5_r6, 0.1618F, -0.4725F, -1.9153F);
        this.neck5_r6.cubeList.add(new ModelBox(neck5_r6, 15, 16, 2.1236F, -0.1339F, -1.5F, 4, 1, 3, -0.003F, false));

        this.neck4_r5 = new ModelRenderer(this);
        this.neck4_r5.setRotationPoint(5.7F, 2.7596F, -1.9247F);
        this.neck.addChild(neck4_r5);
        this.setRotateAngle(neck4_r5, -0.3259F, -0.3827F, -0.8352F);
        this.neck4_r5.cubeList.add(new ModelBox(neck4_r5, 37, 38, -3.8793F, -1.1008F, -0.4025F, 4, 1, 3, 0.0F, false));

        this.neck3_r5 = new ModelRenderer(this);
        this.neck3_r5.setRotationPoint(0.5F, 6.1F, 0.2F);
        this.neck.addChild(neck3_r5);
        this.setRotateAngle(neck3_r5, -0.4276F, 0.0F, 0.0F);
        this.neck3_r5.cubeList.add(new ModelBox(neck3_r5, 19, 29, -2.0F, -0.0559F, -4.1995F, 5, 1, 4, 0.0F, false));

        this.legFL3 = new ModelRenderer(this);
        this.legFL3.setRotationPoint(-3.0F, 3.7F, 0.25F);
        this.neck.addChild(legFL3);
        this.setRotateAngle(legFL3, 0.0F, 0.3491F, 0.0F);
        this.legFL3.cubeList.add(new ModelBox(legFL3, 49, 0, -3.0F, 0.0F, -1.0F, 3, 1, 2, 0.0F, false));

        this.legFL4 = new ModelRenderer(this);
        this.legFL4.setRotationPoint(-2.75F, 1.0F, 0.0F);
        this.legFL3.addChild(legFL4);
        this.setRotateAngle(legFL4, -0.3341F, 0.103F, 0.288F);
        this.legFL4.cubeList.add(new ModelBox(legFL4, 53, 14, 0.2447F, -0.2533F, -0.5302F, 1, 4, 1, 0.0F, false));
        this.legFL4.cubeList.add(new ModelBox(legFL4, 24, 41, -1.1461F, -0.1932F, -0.5302F, 1, 4, 1, 0.0F, false));

        this.legFL5 = new ModelRenderer(this);
        this.legFL5.setRotationPoint(0.0333F, 3.1058F, 0.5725F);
        this.legFL4.addChild(legFL5);
        this.setRotateAngle(legFL5, 0.3631F, 0.3758F, -0.1392F);
        this.legFL5.cubeList.add(new ModelBox(legFL5, 38, 0, -1.5848F, -0.0377F, -3.2545F, 3, 1, 4, 0.0F, false));

        this.legFL = new ModelRenderer(this);
        this.legFL.setRotationPoint(5.0F, 3.7F, 0.25F);
        this.neck.addChild(legFL);
        this.setRotateAngle(legFL, 0.0F, 0.0436F, 0.0F);
        this.legFL.cubeList.add(new ModelBox(legFL, 50, 6, 0.0F, 0.0F, -1.0F, 3, 1, 2, 0.0F, false));

        this.legFL1 = new ModelRenderer(this);
        this.legFL1.setRotationPoint(2.75F, 1.0F, 0.0F);
        this.legFL.addChild(legFL1);
        this.setRotateAngle(legFL1, -0.3341F, -0.103F, -0.288F);
        this.legFL1.cubeList.add(new ModelBox(legFL1, 31, 53, -1.2447F, -0.2533F, -0.5302F, 1, 4, 1, 0.0F, false));
        this.legFL1.cubeList.add(new ModelBox(legFL1, 26, 53, 0.1461F, -0.1932F, -0.5302F, 1, 4, 1, 0.0F, false));

        this.legFL2 = new ModelRenderer(this);
        this.legFL2.setRotationPoint(-0.0333F, 3.1058F, 0.5725F);
        this.legFL1.addChild(legFL2);
        this.setRotateAngle(legFL2, 0.3574F, -0.3349F, 0.1556F);
        this.legFL2.cubeList.add(new ModelBox(legFL2, 39, 9, -1.4152F, -0.0377F, -3.2545F, 3, 1, 4, 0.0F, false));

        this.headpart = new ModelRenderer(this);
        this.headpart.setRotationPoint(1.0F, 0.4F, -4.0F);
        this.neck.addChild(headpart);
        this.setRotateAngle(headpart, -0.3927F, -0.3491F, 0.0F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.headpart.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 12, 47, -2.5F, -1.001F, -10.0F, 5, 2, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 21, -1.5F, 0.749F, -9.6F, 3, 1, 0, 0.0F, false));

        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(0.0F, 6.0F, -3.0F);
        this.head.addChild(head5_r1);
        this.setRotateAngle(head5_r1, 0.0F, -0.1745F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 0, 13, -3.75F, -7.0F, -6.25F, 2, 2, 10, 0.0F, false));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 14, 26, -3.0F, -5.25F, -5.5F, 0, 1, 3, 0.0F, true));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 31, 29, -3.45F, -5.25F, -5.75F, 0, 1, 7, 0.0F, true));

        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(0.0F, 6.0F, -3.0F);
        this.head.addChild(head4_r1);
        this.setRotateAngle(head4_r1, 0.1309F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 0, 26, -2.0F, -8.0F, -6.0F, 4, 2, 5, 0.0F, false));
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 20, 21, -3.5F, -8.0F, -1.0F, 7, 2, 5, 0.0F, false));

        this.head5_r2 = new ModelRenderer(this);
        this.head5_r2.setRotationPoint(0.0F, 6.0F, -3.0F);
        this.head.addChild(head5_r2);
        this.setRotateAngle(head5_r2, 0.0F, 0.1745F, 0.0F);
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 14, 26, 3.0F, -5.25F, -5.5F, 0, 1, 3, 0.0F, false));
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 31, 29, 3.45F, -5.25F, -5.75F, 0, 1, 7, 0.0F, false));
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 0, 0, 1.75F, -7.0F, -6.25F, 2, 2, 10, 0.0F, false));

        this.eyeL = new ModelRenderer(this);
        this.eyeL.setRotationPoint(2.0F, -2.0F, -4.0F);
        this.head.addChild(eyeL);


        this.eyeL_r1 = new ModelRenderer(this);
        this.eyeL_r1.setRotationPoint(-2.0F, 8.0F, 1.0F);
        this.eyeL.addChild(eyeL_r1);
        this.setRotateAngle(eyeL_r1, 0.1309F, 0.0F, 0.0F);
        this.eyeL_r1.cubeList.add(new ModelBox(eyeL_r1, 15, 0, -3.0F, -8.1F, -0.601F, 2, 2, 2, 0.0F, true));
        this.eyeL_r1.cubeList.add(new ModelBox(eyeL_r1, 15, 0, 1.0F, -8.1F, -0.601F, 2, 2, 2, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, 0.4F);
        this.headpart.addChild(jaw);
        this.setRotateAngle(jaw, 0.6632F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 42, 43, -2.501F, -0.1496F, -10.6097F, 5, 2, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 7, -1.5F, -0.6516F, -10.3597F, 3, 1, 0, 0.0F, false));

        this.jaw4_r1 = new ModelRenderer(this);
        this.jaw4_r1.setRotationPoint(0.0F, 4.8494F, -3.6097F);
        this.jaw.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, 0.0F, -0.1745F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 15, 3, -3.75F, -5.0F, -6.0F, 1, 2, 10, 0.0F, true));

        this.jaw8_r1 = new ModelRenderer(this);
        this.jaw8_r1.setRotationPoint(-3.7F, 3.0404F, -2.6224F);
        this.jaw.addChild(jaw8_r1);
        this.setRotateAngle(jaw8_r1, 0.4451F, -0.1745F, 0.0F);
        this.jaw8_r1.cubeList.add(new ModelBox(jaw8_r1, 0, 19, -0.3677F, -1.2277F, 0.1129F, 1, 1, 2, 0.0F, true));

        this.jaw5_r1 = new ModelRenderer(this);
        this.jaw5_r1.setRotationPoint(-3.7F, 1.8404F, -10.3224F);
        this.jaw.addChild(jaw5_r1);
        this.setRotateAngle(jaw5_r1, -0.096F, -0.1745F, 0.0F);
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 0, 40, 0.998F, -1.8541F, -0.1466F, 1, 2, 5, 0.0F, true));
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 0, 13, 0.9694F, -1.8277F, 4.7877F, 1, 2, 3, 0.0F, true));

        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(0.0F, 4.8494F, -3.6097F);
        this.jaw.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, 0.0F, 0.1745F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 15, 3, 2.75F, -5.0F, -6.0F, 1, 2, 10, 0.0F, false));
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 15, 3, 2.75F, -5.0F, -6.0F, 1, 2, 10, 0.0F, false));

        this.jaw7_r1 = new ModelRenderer(this);
        this.jaw7_r1.setRotationPoint(3.7F, 3.0404F, -2.6224F);
        this.jaw.addChild(jaw7_r1);
        this.setRotateAngle(jaw7_r1, 0.4451F, 0.1745F, 0.0F);
        this.jaw7_r1.cubeList.add(new ModelBox(jaw7_r1, 0, 19, -0.6323F, -1.2277F, 0.1129F, 1, 1, 2, 0.0F, false));
        this.jaw7_r1.cubeList.add(new ModelBox(jaw7_r1, 0, 19, -0.6323F, -1.2277F, 0.1129F, 1, 1, 2, 0.0F, false));

        this.jaw4_r2 = new ModelRenderer(this);
        this.jaw4_r2.setRotationPoint(3.7F, 1.8404F, -10.3224F);
        this.jaw.addChild(jaw4_r2);
        this.setRotateAngle(jaw4_r2, -0.096F, 0.1745F, 0.0F);
        this.jaw4_r2.cubeList.add(new ModelBox(jaw4_r2, 0, 40, -1.998F, -1.8541F, -0.1466F, 1, 2, 5, 0.0F, false));
        this.jaw4_r2.cubeList.add(new ModelBox(jaw4_r2, 0, 13, -1.9694F, -1.8277F, 4.7877F, 1, 2, 3, 0.0F, false));
        this.jaw4_r2.cubeList.add(new ModelBox(jaw4_r2, 0, 13, -1.9694F, -1.8277F, 4.7877F, 1, 2, 3, 0.0F, false));
        this.jaw4_r2.cubeList.add(new ModelBox(jaw4_r2, 0, 40, -1.998F, -1.8541F, -0.1466F, 1, 2, 5, 0.0F, false));

        this.head5_r3 = new ModelRenderer(this);
        this.head5_r3.setRotationPoint(0.0F, 5.3494F, -3.8597F);
        this.jaw.addChild(head5_r3);
        this.setRotateAngle(head5_r3, 0.0F, -0.1745F, 0.0F);
        this.head5_r3.cubeList.add(new ModelBox(head5_r3, 31, 9, -3.325F, -6.0F, -5.75F, 0, 1, 7, 0.0F, true));

        this.head4_r2 = new ModelRenderer(this);
        this.head4_r2.setRotationPoint(0.0F, 5.3494F, -3.8597F);
        this.jaw.addChild(head4_r2);
        this.setRotateAngle(head4_r2, 0.0F, 0.1745F, 0.0F);
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 31, 9, 3.325F, -6.0F, -5.75F, 0, 1, 7, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.0F, 9.1F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.2317F, -0.3405F, 0.0786F);


        this.tail2_r1 = new ModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.0F, 1.2545F, 2.6838F);
        this.tail.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, 0.0785F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 7, 7, 0.0F, -0.0693F, -0.2322F, 0, 1, 1, 0.002F, false));

        this.tail1_r1 = new ModelRenderer(this);
        this.tail1_r1.setRotationPoint(0.0F, -0.0319F, -0.1954F);
        this.tail.addChild(tail1_r1);
        this.setRotateAngle(tail1_r1, -0.2705F, 0.0F, 0.0F);
        this.tail1_r1.cubeList.add(new ModelBox(tail1_r1, 0, 48, -0.5F, -0.5F, -0.1F, 1, 1, 4, 0.002F, false));

        this.neck13_r1 = new ModelRenderer(this);
        this.neck13_r1.setRotationPoint(0.0F, -0.7823F, -0.0191F);
        this.tail.addChild(neck13_r1);
        this.setRotateAngle(neck13_r1, -0.3665F, 0.0F, 0.0F);
        this.neck13_r1.cubeList.add(new ModelBox(neck13_r1, 31, 9, 0.0F, -1.2073F, 3.2711F, 0, 2, 1, 0.0F, false));
        this.neck13_r1.cubeList.add(new ModelBox(neck13_r1, 0, 34, 0.0F, -1.2073F, 1.2711F, 0, 2, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.8681F, 3.4546F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0944F, -0.3911F, 0.0361F);


        this.tail2_r2 = new ModelRenderer(this);
        this.tail2_r2.setRotationPoint(0.0F, 0.1F, -0.2F);
        this.tail2.addChild(tail2_r2);
        this.setRotateAngle(tail2_r2, -0.1309F, 0.0F, 0.0F);
        this.tail2_r2.cubeList.add(new ModelBox(tail2_r2, 43, 47, -0.5F, -0.5F, 0.2F, 1, 1, 4, 0.0F, false));

        this.tail4_r1 = new ModelRenderer(this);
        this.tail4_r1.setRotationPoint(0.0F, 1.0157F, 3.7106F);
        this.tail2.addChild(tail4_r1);
        this.setRotateAngle(tail4_r1, 0.3316F, 0.0F, 0.0F);
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 7, 19, 0.0F, -0.0046F, -0.4042F, 0, 2, 1, 0.002F, false));

        this.tail3_r1 = new ModelRenderer(this);
        this.tail3_r1.setRotationPoint(0.0F, 0.8041F, 1.5628F);
        this.tail2.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, 0.2094F, 0.0F, 0.0F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 28, 9, 0.0F, -0.1548F, -0.434F, 0, 2, 1, 0.002F, false));

        this.neck14_r1 = new ModelRenderer(this);
        this.neck14_r1.setRotationPoint(0.0F, -0.0292F, 2.2392F);
        this.tail2.addChild(neck14_r1);
        this.setRotateAngle(neck14_r1, -0.2618F, 0.0F, 0.0F);
        this.neck14_r1.cubeList.add(new ModelBox(neck14_r1, 15, 16, 0.0F, -0.8734F, -0.6433F, 0, 1, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.6F, 3.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0903F, -0.2608F, -0.0233F);


        this.tail3_r2 = new ModelRenderer(this);
        this.tail3_r2.setRotationPoint(0.0F, -0.0011F, -0.0261F);
        this.tail3.addChild(tail3_r2);
        this.setRotateAngle(tail3_r2, -0.0873F, 0.0F, 0.0F);
        this.tail3_r2.cubeList.add(new ModelBox(tail3_r2, 32, 47, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.003F, false));

        this.neck16_r1 = new ModelRenderer(this);
        this.neck16_r1.setRotationPoint(0.0F, -0.7303F, -1.5369F);
        this.tail3.addChild(neck16_r1);
        this.setRotateAngle(neck16_r1, -0.2618F, 0.0F, 0.0F);
        this.neck16_r1.cubeList.add(new ModelBox(neck16_r1, 0, 13, 0.0F, -0.8734F, 3.3567F, 0, 1, 1, 0.0F, false));
        this.neck16_r1.cubeList.add(new ModelBox(neck16_r1, 6, 13, 0.0F, -0.8734F, 1.3567F, 0, 1, 1, 0.0F, false));

        this.tail5_r1 = new ModelRenderer(this);
        this.tail5_r1.setRotationPoint(0.0F, 0.3145F, -0.0656F);
        this.tail3.addChild(tail5_r1);
        this.setRotateAngle(tail5_r1, 0.3316F, 0.0F, 0.0F);
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 6, 0, 0.0F, 0.9484F, 1.6065F, 0, 1, 1, 0.002F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.3489F, 3.9239F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0962F, -0.4346F, -0.0406F);
        this.tail4.cubeList.add(new ModelBox(tail4, 47, 26, -0.5F, -0.4682F, -0.2167F, 1, 1, 4, 0.0F, false));

        this.tail6_r1 = new ModelRenderer(this);
        this.tail6_r1.setRotationPoint(0.0F, -0.0525F, -4.0061F);
        this.tail4.addChild(tail6_r1);
        this.setRotateAngle(tail6_r1, 0.3316F, 0.0F, 0.0F);
        this.tail6_r1.cubeList.add(new ModelBox(tail6_r1, 0, 0, 0.0F, 1.3735F, 3.571F, 0, 1, 1, 0.002F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0318F, 3.4333F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.2444F, -0.7703F, -0.1719F);
        this.tail5.cubeList.add(new ModelBox(tail5, 21, 47, -0.5F, -0.4963F, -0.0578F, 1, 1, 4, 0.003F, false));

        this.legHL = new ModelRenderer(this);
        this.legHL.setRotationPoint(1.0F, 4.6F, 6.4F);
        this.body.addChild(legHL);
        this.setRotateAngle(legHL, 0.0F, -0.4363F, -0.2618F);
        this.legHL.cubeList.add(new ModelBox(legHL, 40, 22, -0.0341F, -0.2412F, -1.0F, 5, 1, 2, 0.0F, false));

        this.legHL1 = new ModelRenderer(this);
        this.legHL1.setRotationPoint(4.7659F, 0.5588F, -0.25F);
        this.legHL.addChild(legHL1);
        this.setRotateAngle(legHL1, 0.5671F, 0.0057F, -0.0433F);
        this.legHL1.cubeList.add(new ModelBox(legHL1, 21, 53, -0.5147F, -0.1632F, -0.7086F, 1, 5, 1, 0.0F, false));
        this.legHL1.cubeList.add(new ModelBox(legHL1, 16, 51, -0.5147F, -0.1632F, 0.5914F, 1, 5, 1, 0.0F, false));

        this.legHL2 = new ModelRenderer(this);
        this.legHL2.setRotationPoint(-0.4047F, 4.4868F, 1.2914F);
        this.legHL1.addChild(legHL2);
        this.setRotateAngle(legHL2, -0.5476F, -1.0988F, 0.7298F);
        this.legHL2.cubeList.add(new ModelBox(legHL2, 17, 35, -2.2746F, -0.1147F, -3.9374F, 4, 1, 4, 0.0F, false));

        this.legHL3 = new ModelRenderer(this);
        this.legHL3.setRotationPoint(-1.0F, 4.6F, 6.4F);
        this.body.addChild(legHL3);
        this.setRotateAngle(legHL3, 0.0F, -0.4363F, 0.2618F);
        this.legHL3.cubeList.add(new ModelBox(legHL3, 40, 18, -4.9659F, -0.2412F, -1.0F, 5, 1, 2, 0.0F, false));

        this.legHL4 = new ModelRenderer(this);
        this.legHL4.setRotationPoint(-4.7659F, 0.5588F, -0.25F);
        this.legHL3.addChild(legHL4);
        this.setRotateAngle(legHL4, -0.4416F, 0.606F, 0.1253F);
        this.legHL4.cubeList.add(new ModelBox(legHL4, 11, 51, -0.4853F, -0.1632F, -0.7086F, 1, 5, 1, 0.0F, false));
        this.legHL4.cubeList.add(new ModelBox(legHL4, 28, 0, -0.4853F, -0.1632F, 0.5914F, 1, 5, 1, 0.0F, false));

        this.legHL5 = new ModelRenderer(this);
        this.legHL5.setRotationPoint(0.4047F, 4.4868F, 1.2914F);
        this.legHL4.addChild(legHL5);
        this.setRotateAngle(legHL5, 0.559F, 0.5315F, -0.0999F);
        this.legHL5.cubeList.add(new ModelBox(legHL5, 0, 34, -1.7254F, -0.1147F, -3.9374F, 4, 1, 4, 0.0F, false));

    }

    public void renderAll(float f) {
        this.body.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
