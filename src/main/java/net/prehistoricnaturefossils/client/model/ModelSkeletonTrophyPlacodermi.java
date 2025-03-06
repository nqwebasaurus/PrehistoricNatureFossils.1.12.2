package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTrophyPlacodermi extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Headslope;
    private final ModelRenderer Headslope_r1;
    private final ModelRenderer Throat;
    private final ModelRenderer Throatslope;
    private final ModelRenderer Throatslope_r1;
    private final ModelRenderer Throatslope_r2;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Upperjawslope2;
    private final ModelRenderer Upperfrontshears;
    private final ModelRenderer Leftuppershears;
    private final ModelRenderer Rightuppershears;
    private final ModelRenderer Rightuppershears_r1;
    private final ModelRenderer Rightuppershears2;
    private final ModelRenderer Rightuppershears_r2;
    private final ModelRenderer Upperjawslope1;
    private final ModelRenderer Upperjawslope4_r1;
    private final ModelRenderer Leftcheekslope;
    private final ModelRenderer Rightcheekslope;
    private final ModelRenderer Rightcheekslope_r1;
    private final ModelRenderer Rightcheekslope2;
    private final ModelRenderer Rightcheekslope_r2;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawback_r1;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerjawshears;
    private final ModelRenderer Lowerjawslope2;
    private final ModelRenderer Lowerjawmiddle2;
    private final ModelRenderer Lowerjawfront2;
    private final ModelRenderer Lowerjawshears2;
    private final ModelRenderer Lowerjawslope3;
    private final ModelRenderer Lowerjawslope1;

    public ModelSkeletonTrophyPlacodermi() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 10.0F, 14.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 31, -8.0F, 10.0F, -25.0F, 16, 4, 24, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 44, 70, -1.0F, -2.0F, -13.0F, 2, 13, 2, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -10.0F, 12.0F, -27.0F, 20, 2, 28, 0.005F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-8.0F, 10.0F, -13.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.7679F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 65, 60, -0.03F, 1.8F, -4.0F, 0, 1, 8, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 60, -0.03F, 0.5F, -4.0F, 0, 1, 8, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 60, 0.0F, 0.0F, -5.0F, 2, 3, 10, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.7F, -9.0F);
        this.fossil.addChild(Head);
        this.setRotateAngle(Head, 0.0637F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 37, 74, 2.5F, -2.3F, -6.0F, 1, 7, 2, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 83, 76, -3.5F, -2.3F, -6.0F, 1, 7, 2, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 15, 74, 3.5F, -2.5F, -4.0F, 1, 7, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 26, 74, -4.5F, -2.5F, -4.0F, 1, 7, 4, 0.0F, false));

        this.Headslope = new ModelRenderer(this);
        this.Headslope.setRotationPoint(0.0F, -4.1F, 0.0F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.2759F, 0.0F, 0.0F);
        this.Headslope.cubeList.add(new ModelBox(Headslope, 25, 67, -2.0F, 0.0F, -4.0F, 4, 1, 5, 0.0F, false));
        this.Headslope.cubeList.add(new ModelBox(Headslope, 53, 70, 2.0F, 0.0F, -5.0F, 2, 2, 5, 0.0F, false));
        this.Headslope.cubeList.add(new ModelBox(Headslope, 68, 76, -4.0F, 0.0F, -5.0F, 2, 2, 5, 0.0F, false));

        this.Headslope_r1 = new ModelRenderer(this);
        this.Headslope_r1.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.Headslope.addChild(Headslope_r1);
        this.setRotateAngle(Headslope_r1, -0.48F, 0.0F, 0.0F);
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 9, 86, 0.0F, 0.5F, -2.2F, 0, 1, 4, 0.0F, false));
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 39, 92, -0.5F, -0.5F, -0.2F, 1, 1, 2, 0.0F, false));

        this.Throat = new ModelRenderer(this);
        this.Throat.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Head.addChild(Throat);


        this.Throatslope = new ModelRenderer(this);
        this.Throatslope.setRotationPoint(0.0F, 3.8F, 1.0F);
        this.Throat.addChild(Throatslope);
        this.setRotateAngle(Throatslope, -0.1911F, 0.0F, 0.0F);


        this.Throatslope_r1 = new ModelRenderer(this);
        this.Throatslope_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Throatslope.addChild(Throatslope_r1);
        this.setRotateAngle(Throatslope_r1, 0.1309F, 0.0F, 0.0F);
        this.Throatslope_r1.cubeList.add(new ModelBox(Throatslope_r1, 68, 70, -2.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.Throatslope_r2 = new ModelRenderer(this);
        this.Throatslope_r2.setRotationPoint(0.0F, -0.5F, -6.0F);
        this.Throatslope.addChild(Throatslope_r2);
        this.setRotateAngle(Throatslope_r2, 0.0436F, 0.0F, 0.0F);
        this.Throatslope_r2.cubeList.add(new ModelBox(Throatslope_r2, 90, 76, -2.0F, -0.1F, 0.0F, 4, 1, 1, 0.0F, false));
        this.Throatslope_r2.cubeList.add(new ModelBox(Throatslope_r2, 25, 60, -3.0F, -0.1F, 1.0F, 6, 1, 5, 0.0F, false));

        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, -1.7F, -6.0F);
        this.Head.addChild(Upperjawback);
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 0, 91, 3.0F, 0.0F, -2.0F, 1, 4, 2, 0.0F, false));
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 9, 82, 3.0F, 0.6F, -1.5F, 1, 1, 1, 0.02F, false));
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 91, 56, -4.0F, 0.0F, -2.0F, 1, 4, 2, 0.0F, false));
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 63, 86, -4.0F, 0.6F, -1.5F, 1, 1, 1, 0.02F, false));

        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 4.0F, -2.0F);
        this.Upperjawback.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.1911F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 27, 86, 2.5F, -2.0F, -3.0F, 1, 2, 3, 0.0F, false));
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 86, 86, -3.5F, -2.0F, -3.0F, 1, 2, 3, 0.0F, false));
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 54, 86, -2.5F, -2.0F, -3.0F, 1, 2, 3, 0.0F, false));
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 85, 72, -1.5F, -2.0F, -3.0F, 4, 2, 1, 0.0F, false));

        this.Upperjawslope2 = new ModelRenderer(this);
        this.Upperjawslope2.setRotationPoint(0.0F, -3.95F, -0.6F);
        this.Upperjawfront.addChild(Upperjawslope2);
        this.setRotateAngle(Upperjawslope2, 0.7055F, 0.0F, 0.0F);
        this.Upperjawslope2.cubeList.add(new ModelBox(Upperjawslope2, 81, 51, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));
        this.Upperjawslope2.cubeList.add(new ModelBox(Upperjawslope2, 18, 86, 2.0F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));
        this.Upperjawslope2.cubeList.add(new ModelBox(Upperjawslope2, 77, 86, -3.0F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.Upperfrontshears = new ModelRenderer(this);
        this.Upperfrontshears.setRotationPoint(0.0F, -0.5F, -2.7F);
        this.Upperjawfront.addChild(Upperfrontshears);
        this.setRotateAngle(Upperfrontshears, 0.0848F, 0.0F, 0.0F);
        this.Upperfrontshears.cubeList.add(new ModelBox(Upperfrontshears, 90, 79, -2.5F, 0.0F, 0.0F, 5, 2, 0, 0.0F, false));

        this.Leftuppershears = new ModelRenderer(this);
        this.Leftuppershears.setRotationPoint(-2.7F, -0.5F, -1.2F);
        this.Upperjawfront.addChild(Leftuppershears);
        this.setRotateAngle(Leftuppershears, 0.1274F, -0.1485F, 0.0F);


        this.Rightuppershears = new ModelRenderer(this);
        this.Rightuppershears.setRotationPoint(2.7F, -0.5F, -1.2F);
        this.Upperjawfront.addChild(Rightuppershears);
        this.setRotateAngle(Rightuppershears, 0.1274F, 0.1485F, 0.0F);


        this.Rightuppershears_r1 = new ModelRenderer(this);
        this.Rightuppershears_r1.setRotationPoint(-2.9407F, 0.451F, -1.8821F);
        this.Rightuppershears.addChild(Rightuppershears_r1);
        this.setRotateAngle(Rightuppershears_r1, -0.2588F, -0.0098F, -0.0374F);
        this.Rightuppershears_r1.cubeList.add(new ModelBox(Rightuppershears_r1, 7, 92, 2.9557F, -1.2694F, 0.386F, 0, 2, 3, 0.0F, false));

        this.Rightuppershears2 = new ModelRenderer(this);
        this.Rightuppershears2.setRotationPoint(-2.7F, -0.5F, -1.2F);
        this.Upperjawfront.addChild(Rightuppershears2);
        this.setRotateAngle(Rightuppershears2, 0.1274F, -0.1485F, 0.0F);


        this.Rightuppershears_r2 = new ModelRenderer(this);
        this.Rightuppershears_r2.setRotationPoint(2.4593F, 0.451F, -1.8821F);
        this.Rightuppershears2.addChild(Rightuppershears_r2);
        this.setRotateAngle(Rightuppershears_r2, -0.2588F, 0.0098F, 0.0374F);
        this.Rightuppershears_r2.cubeList.add(new ModelBox(Rightuppershears_r2, 14, 92, -2.4743F, -1.2694F, 0.386F, 0, 2, 3, 0.0F, false));

        this.Upperjawslope1 = new ModelRenderer(this);
        this.Upperjawslope1.setRotationPoint(0.0F, -0.8F, 0.0F);
        this.Upperjawback.addChild(Upperjawslope1);
        this.setRotateAngle(Upperjawslope1, 0.4138F, 0.0F, 0.0F);


        this.Upperjawslope4_r1 = new ModelRenderer(this);
        this.Upperjawslope4_r1.setRotationPoint(0.0F, -0.2F, -1.8F);
        this.Upperjawslope1.addChild(Upperjawslope4_r1);
        this.setRotateAngle(Upperjawslope4_r1, -0.1309F, 0.0F, 0.0F);
        this.Upperjawslope4_r1.cubeList.add(new ModelBox(Upperjawslope4_r1, 30, 92, -1.5F, 0.2F, 0.3F, 3, 1, 1, -0.001F, false));
        this.Upperjawslope4_r1.cubeList.add(new ModelBox(Upperjawslope4_r1, 21, 92, -1.5F, 0.2F, -0.2F, 3, 1, 1, 0.0F, false));
        this.Upperjawslope4_r1.cubeList.add(new ModelBox(Upperjawslope4_r1, 63, 91, -3.5F, 0.2F, -0.2F, 2, 1, 2, 0.0F, false));
        this.Upperjawslope4_r1.cubeList.add(new ModelBox(Upperjawslope4_r1, 90, 82, 1.5F, 0.2F, -0.2F, 2, 1, 2, 0.0F, false));

        this.Leftcheekslope = new ModelRenderer(this);
        this.Leftcheekslope.setRotationPoint(-3.0F, 4.0F, -1.9F);
        this.Upperjawback.addChild(Leftcheekslope);
        this.setRotateAngle(Leftcheekslope, 0.7006F, -0.0424F, -0.0848F);


        this.Rightcheekslope = new ModelRenderer(this);
        this.Rightcheekslope.setRotationPoint(3.0F, 4.0F, -1.9F);
        this.Upperjawback.addChild(Rightcheekslope);
        this.setRotateAngle(Rightcheekslope, 0.7006F, 0.0424F, 0.0848F);


        this.Rightcheekslope_r1 = new ModelRenderer(this);
        this.Rightcheekslope_r1.setRotationPoint(0.5F, -1.0F, 0.5F);
        this.Rightcheekslope.addChild(Rightcheekslope_r1);
        this.setRotateAngle(Rightcheekslope_r1, 0.0F, 0.0F, -0.1309F);
        this.Rightcheekslope_r1.cubeList.add(new ModelBox(Rightcheekslope_r1, 81, 31, -0.5F, 0.0F, -0.5F, 1, 5, 4, 0.0F, false));

        this.Rightcheekslope2 = new ModelRenderer(this);
        this.Rightcheekslope2.setRotationPoint(-3.0F, 4.0F, -1.9F);
        this.Upperjawback.addChild(Rightcheekslope2);
        this.setRotateAngle(Rightcheekslope2, 0.7006F, -0.0424F, -0.0848F);


        this.Rightcheekslope_r2 = new ModelRenderer(this);
        this.Rightcheekslope_r2.setRotationPoint(-0.5F, -1.0F, 0.5F);
        this.Rightcheekslope2.addChild(Rightcheekslope_r2);
        this.setRotateAngle(Rightcheekslope_r2, 0.0F, 0.0F, 0.1309F);
        this.Rightcheekslope_r2.cubeList.add(new ModelBox(Rightcheekslope_r2, 81, 41, -0.5F, 0.0F, -0.5F, 1, 5, 4, 0.0F, false));

        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 4.0F, -2.39F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.1616F, 0.0F, 0.0F);
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 0, 82, 3.0F, -2.0F, -3.0F, 1, 5, 3, 0.0F, false));
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 82, 56, -4.0F, -2.0F, -3.0F, 1, 5, 3, 0.0F, false));

        this.Lowerjawback_r1 = new ModelRenderer(this);
        this.Lowerjawback_r1.setRotationPoint(-3.5F, 2.9F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawback_r1);
        this.setRotateAngle(Lowerjawback_r1, -0.2618F, 0.0F, 0.0F);
        this.Lowerjawback_r1.cubeList.add(new ModelBox(Lowerjawback_r1, 53, 78, -0.5F, -0.9F, 0.0F, 1, 1, 6, -0.001F, false));
        this.Lowerjawback_r1.cubeList.add(new ModelBox(Lowerjawback_r1, 0, 74, 6.5F, -0.9F, 0.0F, 1, 1, 6, -0.001F, false));

        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 2.5F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, -0.0637F, 0.0F, 0.0F);
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 36, 86, 2.5F, -2.0F, -2.7F, 1, 2, 3, 0.0F, false));

        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, -2.0F, -2.7F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.0637F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 92, 31, 2.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 92, 41, 1.0F, 0.0F, -3.0F, 2, 2, 1, 0.0F, false));
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 92, 45, 0.5F, 0.0F, -3.0F, 2, 2, 1, -0.001F, false));

        this.Lowerjawshears = new ModelRenderer(this);
        this.Lowerjawshears.setRotationPoint(0.0F, 0.3F, -2.8F);
        this.Lowerjawfront.addChild(Lowerjawshears);
        this.setRotateAngle(Lowerjawshears, -0.1274F, 0.0F, 0.0F);
        this.Lowerjawshears.cubeList.add(new ModelBox(Lowerjawshears, 68, 84, 2.5F, -1.6572F, 0.1119F, 0, 2, 4, 0.0F, false));
        this.Lowerjawshears.cubeList.add(new ModelBox(Lowerjawshears, 72, 91, 0.5F, -2.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.Lowerjawslope2 = new ModelRenderer(this);
        this.Lowerjawslope2.setRotationPoint(0.0F, 0.6F, 0.2F);
        this.Lowerjawmiddle.addChild(Lowerjawslope2);
        this.setRotateAngle(Lowerjawslope2, -0.0953F, 0.0F, 0.0F);


        this.Lowerjawmiddle2 = new ModelRenderer(this);
        this.Lowerjawmiddle2.setRotationPoint(0.0F, 2.5F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawmiddle2);
        this.setRotateAngle(Lowerjawmiddle2, -0.0637F, 0.0F, 0.0F);
        this.Lowerjawmiddle2.cubeList.add(new ModelBox(Lowerjawmiddle2, 45, 86, -3.5F, -2.0F, -2.7F, 1, 2, 3, 0.0F, false));

        this.Lowerjawfront2 = new ModelRenderer(this);
        this.Lowerjawfront2.setRotationPoint(0.0F, -2.0F, -2.7F);
        this.Lowerjawmiddle2.addChild(Lowerjawfront2);
        this.setRotateAngle(Lowerjawfront2, 0.0637F, 0.0F, 0.0F);
        this.Lowerjawfront2.cubeList.add(new ModelBox(Lowerjawfront2, 92, 36, -3.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));
        this.Lowerjawfront2.cubeList.add(new ModelBox(Lowerjawfront2, 46, 92, -3.0F, 0.0F, -3.0F, 2, 2, 1, 0.0F, false));
        this.Lowerjawfront2.cubeList.add(new ModelBox(Lowerjawfront2, 53, 92, -2.5F, 0.0F, -3.0F, 2, 2, 1, -0.001F, false));

        this.Lowerjawshears2 = new ModelRenderer(this);
        this.Lowerjawshears2.setRotationPoint(0.0F, 0.3F, -2.8F);
        this.Lowerjawfront2.addChild(Lowerjawshears2);
        this.setRotateAngle(Lowerjawshears2, -0.1274F, 0.0F, 0.0F);
        this.Lowerjawshears2.cubeList.add(new ModelBox(Lowerjawshears2, 85, 65, -2.5F, -1.6572F, 0.1119F, 0, 2, 4, 0.0F, false));
        this.Lowerjawshears2.cubeList.add(new ModelBox(Lowerjawshears2, 77, 92, -2.5F, -2.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.Lowerjawslope3 = new ModelRenderer(this);
        this.Lowerjawslope3.setRotationPoint(0.0F, 0.6F, 0.2F);
        this.Lowerjawmiddle2.addChild(Lowerjawslope3);
        this.setRotateAngle(Lowerjawslope3, -0.0953F, 0.0F, 0.0F);


        this.Lowerjawslope1 = new ModelRenderer(this);
        this.Lowerjawslope1.setRotationPoint(0.0F, 3.5F, 1.0F);
        this.Lowerjawback.addChild(Lowerjawslope1);
        this.setRotateAngle(Lowerjawslope1, -0.1061F, 0.0F, 0.0F);

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
