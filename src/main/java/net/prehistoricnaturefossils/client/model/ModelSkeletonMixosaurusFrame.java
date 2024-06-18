package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMixosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Mixosaurus;
    private final ModelRenderer Body1;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer pole2_r1;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer ForelimbsL;
    private final ModelRenderer ForelimbsL2;
    private final ModelRenderer Body2;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Body3;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer Body4;
    private final ModelRenderer HindlimbsL;
    private final ModelRenderer HindlimbsL2;
    private final ModelRenderer Body5;
    private final ModelRenderer Tail1;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;

    public ModelSkeletonMixosaurusFrame() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Mixosaurus = new ModelRenderer(this);
        this.Mixosaurus.setRotationPoint(2.0F, -11.0F, -2.0F);
        this.fossil.addChild(Mixosaurus);
        this.setRotateAngle(Mixosaurus, 0.1106F, -0.0734F, 0.0036F);


        this.Body1 = new ModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 1.4F, -7.0F);
        this.Mixosaurus.addChild(Body1);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, -0.8F, 3.8F);
        this.Body1.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.0F, 0.0349F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 14, 24, -0.5F, -0.4122F, -0.1906F, 1, 1, 2, -0.1F, false));

        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, -0.2F, 2.0F);
        this.Body1.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.2618F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 31, 37, -0.498F, -0.5F, 0.0F, 1, 1, 2, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(0.0F, 3.7F, 1.5F);
        this.Body1.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.3927F, 0.0F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, 14, 33, -3.497F, -0.8F, 1.8F, 7, 1, 1, -0.1F, false));

        this.pole2_r1 = new ModelRenderer(this);
        this.pole2_r1.setRotationPoint(0.0F, 2.15F, 0.7F);
        this.Body1.addChild(pole2_r1);
        this.setRotateAngle(pole2_r1, 0.3927F, 0.0F, 0.0F);
        this.pole2_r1.cubeList.add(new ModelBox(pole2_r1, 17, 33, -0.497F, -1.8F, 1.8F, 1, 3, 1, -0.1F, false));

        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 0.2253F, 1.1862F);
        this.Body1.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.3927F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 15, 31, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.1F, false));

        this.ForelimbsL = new ModelRenderer(this);
        this.ForelimbsL.setRotationPoint(3.1F, 2.6F, 2.7F);
        this.Body1.addChild(ForelimbsL);
        this.setRotateAngle(ForelimbsL, 0.0F, 0.0F, -0.3054F);


        this.ForelimbsL2 = new ModelRenderer(this);
        this.ForelimbsL2.setRotationPoint(-3.1F, 2.6F, 2.7F);
        this.Body1.addChild(ForelimbsL2);
        this.setRotateAngle(ForelimbsL2, 0.0F, 0.0F, 0.3054F);


        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.8F, 5.65F);
        this.Body1.addChild(Body2);
        this.setRotateAngle(Body2, 0.0F, -0.3054F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 1.0F, -0.45F);
        this.Body2.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.1396F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 18, 25, -0.5F, -0.4F, -0.1F, 1, 1, 4, -0.1F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.7F, 3.05F);
        this.Body2.addChild(Body3);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 1.0187F, 1.9079F);
        this.Body3.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0873F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 6, 23, -0.5F, -0.5F, -2.5F, 1, 1, 5, -0.1F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.2F, 3.9F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.0F, -0.2618F, 0.0F);
        this.Body4.cubeList.add(new ModelBox(Body4, 21, 6, -0.5F, 0.5F, 0.0F, 1, 1, 4, -0.1F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 24, 9, -0.498F, 1.25F, 3.0F, 1, 1, 1, -0.1F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 22, 9, -1.998F, 2.0F, 3.002F, 4, 1, 1, -0.1F, false));

        this.HindlimbsL = new ModelRenderer(this);
        this.HindlimbsL.setRotationPoint(2.05F, 2.3F, 3.65F);
        this.Body4.addChild(HindlimbsL);


        this.HindlimbsL2 = new ModelRenderer(this);
        this.HindlimbsL2.setRotationPoint(-2.05F, 2.3F, 3.65F);
        this.Body4.addChild(HindlimbsL2);


        this.Body5 = new ModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -0.1F, 3.8F);
        this.Body4.addChild(Body5);
        this.setRotateAngle(Body5, 0.0F, -0.3927F, 0.0F);
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 7, -0.5F, 0.59F, -0.2F, 1, 1, 6, -0.1F, false));

        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.1F, 5.8F);
        this.Body5.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0F, -0.3927F, 0.0F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(-2.1399F, 3.0508F, 6.8662F);
        this.Tail1.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, -0.0175F, -0.5672F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 0, 20, 0.1123F, -0.5095F, -0.2721F, 1, 1, 4, -0.1F, false));

        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(-0.7622F, 2.6565F, 5.0572F);
        this.Tail1.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, -0.1894F, -0.3584F, -0.0071F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 18, 18, -0.5F, -0.5F, -2.5F, 1, 1, 5, -0.1F, false));

        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, -0.4F, 0.3F);
        this.Tail1.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, -0.3491F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 20, 0, -0.5F, 1.0F, -0.3F, 1, 1, 4, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 1.4F, -7.3F);
        this.Mixosaurus.addChild(Head);
        this.setRotateAngle(Head, -0.0436F, 0.48F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.1F, 0.3F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.6981F, 0.0F, 0.0F);

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
