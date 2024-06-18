package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEurhinosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Eurhinosaurus;
    private final ModelRenderer Body1;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer pole2_r1;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer ForelimbL;
    private final ModelRenderer ForelimbL2;
    private final ModelRenderer Body2;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Body3;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer Body4;
    private final ModelRenderer HindlimbL;
    private final ModelRenderer HindlimbL2;
    private final ModelRenderer Body5;
    private final ModelRenderer Body6;
    private final ModelRenderer Body7;
    private final ModelRenderer Body8;
    private final ModelRenderer frame11_r1;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;

    public ModelSkeletonEurhinosaurusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Eurhinosaurus = new ModelRenderer(this);
        this.Eurhinosaurus.setRotationPoint(0.5F, -20.0F, -5.0F);
        this.fossil.addChild(Eurhinosaurus);


        this.Body1 = new ModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.4F, -17.1F);
        this.Eurhinosaurus.addChild(Body1);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, -0.9F, 6.5F);
        this.Body1.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.0524F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 10, 64, -0.99F, -0.3944F, -0.0631F, 1, 1, 5, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(0.0F, 4.8F, 3.95F);
        this.Body1.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.1571F, 0.0F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, 62, 36, -7.0F, -0.4913F, 0.8996F, 13, 1, 1, -0.1F, false));

        this.pole2_r1 = new ModelRenderer(this);
        this.pole2_r1.setRotationPoint(0.0F, 0.3F, 3.2F);
        this.Body1.addChild(pole2_r1);
        this.setRotateAngle(pole2_r1, 0.1571F, 0.0F, 0.0F);
        this.pole2_r1.cubeList.add(new ModelBox(pole2_r1, 68, 36, -0.99F, -0.4913F, 0.8996F, 1, 5, 1, -0.1F, false));

        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, -0.2F, 3.2F);
        this.Body1.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.1571F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 65, 33, -1.0F, -0.4913F, -0.1004F, 1, 1, 4, -0.1F, false));

        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 0.8F, 0.1F);
        this.Body1.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.3054F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 41, 65, -1.01F, -0.5F, -0.3F, 1, 1, 4, -0.1F, false));

        this.ForelimbL = new ModelRenderer(this);
        this.ForelimbL.setRotationPoint(5.8F, 4.6F, 5.1F);
        this.Body1.addChild(ForelimbL);
        this.setRotateAngle(ForelimbL, 0.0F, -0.3491F, 0.2618F);


        this.ForelimbL2 = new ModelRenderer(this);
        this.ForelimbL2.setRotationPoint(-6.8F, 4.6F, 5.1F);
        this.Body1.addChild(ForelimbL2);
        this.setRotateAngle(ForelimbL2, 0.0289F, 0.2163F, -0.4332F);


        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.6F, 11.0F);
        this.Body1.addChild(Body2);
        this.setRotateAngle(Body2, 0.0F, -0.1309F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.Body2.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.1484F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 52, 17, -1.0F, -0.7F, -0.1F, 1, 1, 9, -0.1F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 1.2F, 8.9F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, 0.0F, -0.0436F, 0.0F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 0.993F, -0.3501F);
        this.Body3.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0698F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 16, 48, -1.0F, -0.4F, 0.0F, 1, 1, 9, -0.1F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.693F, 8.6999F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.0F, -0.1745F, 0.0F);
        this.Body4.cubeList.add(new ModelBox(Body4, 25, 34, -1.0F, 0.5F, -0.5F, 1, 1, 12, -0.1F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 36, 45, -0.99F, 1.0F, 5.5F, 1, 3, 1, -0.1F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 30, 45, -5.99F, 3.35F, 5.5F, 11, 1, 1, -0.1F, false));

        this.HindlimbL = new ModelRenderer(this);
        this.HindlimbL.setRotationPoint(5.0F, 4.1F, 6.5F);
        this.Body4.addChild(HindlimbL);
        this.setRotateAngle(HindlimbL, 0.0F, -0.6545F, 0.6109F);


        this.HindlimbL2 = new ModelRenderer(this);
        this.HindlimbL2.setRotationPoint(-6.0F, 4.1F, 6.5F);
        this.Body4.addChild(HindlimbL2);
        this.setRotateAngle(HindlimbL2, -0.1658F, 0.5671F, -0.7526F);


        this.Body5 = new ModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.2F, 11.5F);
        this.Body4.addChild(Body5);
        this.setRotateAngle(Body5, 0.0F, 0.2182F, 0.0F);
        this.Body5.cubeList.add(new ModelBox(Body5, 27, 49, -1.0F, 0.297F, -0.5F, 1, 1, 10, -0.1F, false));

        this.Body6 = new ModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, -0.2F, 9.0F);
        this.Body5.addChild(Body6);
        this.setRotateAngle(Body6, 0.0F, 0.2618F, 0.0F);
        this.Body6.cubeList.add(new ModelBox(Body6, 48, 4, -1.0F, 0.5F, -0.5F, 1, 1, 10, -0.1F, false));

        this.Body7 = new ModelRenderer(this);
        this.Body7.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Body6.addChild(Body7);
        this.setRotateAngle(Body7, 0.0F, 0.3927F, 0.0F);
        this.Body7.cubeList.add(new ModelBox(Body7, 42, 56, -1.0F, 0.5086F, -0.5595F, 1, 1, 7, -0.1F, false));

        this.Body8 = new ModelRenderer(this);
        this.Body8.setRotationPoint(-0.5F, 0.2086F, 6.5905F);
        this.Body7.addChild(Body8);


        this.frame11_r1 = new ModelRenderer(this);
        this.frame11_r1.setRotationPoint(-0.5F, 8.6174F, 4.5996F);
        this.Body8.addChild(frame11_r1);
        this.setRotateAngle(frame11_r1, -0.733F, 0.0F, 0.0F);
        this.frame11_r1.cubeList.add(new ModelBox(frame11_r1, 36, 6, 0.0F, -1.1164F, 0.0626F, 1, 1, 11, -0.1F, false));

        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(-0.5F, -1.1326F, -0.0504F);
        this.Body8.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, -0.925F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 40, 34, 0.01F, 1.0F, 1.0F, 1, 1, 10, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -17.0F);
        this.Eurhinosaurus.addChild(Head);
        this.setRotateAngle(Head, -0.0682F, -0.005F, -0.0007F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.2182F, 0.0F, 0.0F);

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
