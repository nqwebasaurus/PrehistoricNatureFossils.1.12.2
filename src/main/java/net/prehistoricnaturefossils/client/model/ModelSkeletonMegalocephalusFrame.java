package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMegalocephalusFrame extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer Neck_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjaw1;
    private final ModelRenderer Upperjaw2;
    private final ModelRenderer Upperteeth2;
    private final ModelRenderer Upperteeth1;
    private final ModelRenderer Lowerjaw1;
    private final ModelRenderer Lowerjaw2;
    private final ModelRenderer Lowerjaw3;
    private final ModelRenderer Lowerteeth2;
    private final ModelRenderer Lowerteeth1;
    private final ModelRenderer Throat;
    private final ModelRenderer Headslope1;
    private final ModelRenderer Headslope2;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4_r1;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tail5;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonMegalocephalusFrame() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 16.5F, -4.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.0637F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 28, -0.5F, -0.5003F, 6.9777F, 1, 1, 10, -0.2F, false));
        this.Hips.cubeList.add(new ModelBox(Hips, 8, 37, -0.5F, 0.0997F, 14.4777F, 0, 2, 1, -0.2F, false));
        this.Hips.cubeList.add(new ModelBox(Hips, 8, 37, -2.5F, 1.4997F, 14.4777F, 5, 1, 1, -0.2F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.6003F, 7.3777F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.0881F, 0.1308F, 0.0056F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -0.5F, 0.1045F, -14.3874F, 1, 1, 15, -0.2F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.0045F, -13.6874F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.1108F, -0.0435F, -0.0028F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 27, 33, -0.5F, 0.0877F, -8.6869F, 1, 1, 9, -0.2F, false));
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 35, 41, -0.5F, 0.1877F, -6.3869F, 1, 4, 1, -0.22F, false));

        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 2.9877F, -5.8869F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0F, 0.0F, 1.5708F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 35, 41, 0.2F, -4.5F, -0.5F, 1, 9, 1, -0.2F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.0123F, -8.3869F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.2414F, -0.1271F, 0.0312F);


        this.Neck_r1 = new ModelRenderer(this);
        this.Neck_r1.setRotationPoint(0.0F, 0.1065F, -1.9084F);
        this.Neck.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, 0.0436F, 0.0F, 0.0F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 56, 12, -0.5F, 0.0F, -1.4F, 1, 1, 4, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.1065F, -1.8084F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.3927F, 0.0F, 0.0F);


        this.Upperjaw1 = new ModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, 2.6F, -5.0F);
        this.Head.addChild(Upperjaw1);


        this.Upperjaw2 = new ModelRenderer(this);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Upperjaw1.addChild(Upperjaw2);


        this.Upperteeth2 = new ModelRenderer(this);
        this.Upperteeth2.setRotationPoint(-0.01F, -0.3F, -1.9F);
        this.Upperjaw2.addChild(Upperteeth2);


        this.Upperteeth1 = new ModelRenderer(this);
        this.Upperteeth1.setRotationPoint(-0.01F, -0.3F, -7.9F);
        this.Upperjaw1.addChild(Upperteeth1);


        this.Lowerjaw1 = new ModelRenderer(this);
        this.Lowerjaw1.setRotationPoint(0.0F, 2.6F, 0.0F);
        this.Head.addChild(Lowerjaw1);
        this.setRotateAngle(Lowerjaw1, 0.6853F, 0.0F, 0.0F);


        this.Lowerjaw2 = new ModelRenderer(this);
        this.Lowerjaw2.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.Lowerjaw1.addChild(Lowerjaw2);


        this.Lowerjaw3 = new ModelRenderer(this);
        this.Lowerjaw3.setRotationPoint(0.0F, -2.0F, -8.0F);
        this.Lowerjaw2.addChild(Lowerjaw3);


        this.Lowerteeth2 = new ModelRenderer(this);
        this.Lowerteeth2.setRotationPoint(0.0F, 0.3F, -1.8F);
        this.Lowerjaw3.addChild(Lowerteeth2);


        this.Lowerteeth1 = new ModelRenderer(this);
        this.Lowerteeth1.setRotationPoint(0.0F, -1.7F, -7.8F);
        this.Lowerjaw2.addChild(Lowerteeth1);
        this.setRotateAngle(Lowerteeth1, -0.0213F, 0.0F, 0.0F);


        this.Throat = new ModelRenderer(this);
        this.Throat.setRotationPoint(-0.01F, 3.0F, -5.0F);
        this.Lowerjaw1.addChild(Throat);
        this.setRotateAngle(Throat, -0.0991F, 0.0F, 0.0F);


        this.Headslope1 = new ModelRenderer(this);
        this.Headslope1.setRotationPoint(0.0F, -1.4F, -5.0F);
        this.Head.addChild(Headslope1);
        this.setRotateAngle(Headslope1, 0.2262F, 0.0F, 0.0F);


        this.Headslope2 = new ModelRenderer(this);
        this.Headslope2.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.Headslope1.addChild(Headslope2);
        this.setRotateAngle(Headslope2, -0.1061F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.2F, 3.8877F, -5.9869F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 1.4469F, 0.2638F, -0.1786F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.2232F, 3.4913F, -0.2434F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.618F, -0.5308F, 0.1274F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0592F, 3.0376F, -0.4496F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, -2.3515F, -1.486F, -2.1651F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.2F, 3.8877F, -5.9869F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 1.5863F, -0.1926F, 0.1455F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.2232F, 3.4913F, -0.2434F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.618F, 0.5308F, -0.1274F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(-0.0592F, 3.0376F, -0.4496F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, -2.3078F, 1.486F, 2.1651F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.6003F, 16.4777F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.0662F, -0.1742F, 0.0112F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 0, 0, -0.5F, 0.0986F, -0.4554F, 1, 1, 6, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.0014F, 5.3446F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0848F, 0.0F, 0.0F);


        this.Tail3_r1 = new ModelRenderer(this);
        this.Tail3_r1.setRotationPoint(0.0F, -0.0297F, -0.4006F);
        this.Tail2.addChild(Tail3_r1);
        this.setRotateAngle(Tail3_r1, -0.0436F, 0.0F, 0.0F);
        this.Tail3_r1.cubeList.add(new ModelBox(Tail3_r1, 45, 12, -0.5F, 0.1F, 0.0F, 1, 1, 8, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.1703F, 6.5994F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1741F, -0.2174F, -0.0188F);


        this.Tail4_r1 = new ModelRenderer(this);
        this.Tail4_r1.setRotationPoint(0.0F, 0.196F, -0.0932F);
        this.Tail3.addChild(Tail4_r1);
        this.setRotateAngle(Tail4_r1, -0.0436F, 0.0F, 0.0F);
        this.Tail4_r1.cubeList.add(new ModelBox(Tail4_r1, 13, 30, -0.5F, 0.1F, 0.0F, 1, 1, 10, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.396F, 9.6068F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0662F, 0.1742F, -0.0112F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 45, 25, -0.5F, 0.3103F, -0.1232F, 1, 1, 8, -0.2F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0103F, 7.5768F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.1613F, 0.5649F, -0.0539F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 34, 51, -0.5F, 0.3126F, -0.3976F, 1, 1, 6, -0.2F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.9F, 1.8997F, 14.8777F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 1.1188F, -0.2731F, -2.0356F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.3077F, 4.1984F, 0.2088F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.4847F, 0.1274F, 0.0F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(-0.5927F, 3.7859F, 0.572F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 1.7312F, 0.3821F, 0.2972F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.9F, 1.8997F, 14.8777F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.6637F, 0.2741F, 1.5909F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.3077F, 4.1984F, 0.2088F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.7028F, -0.1274F, 0.0F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.5927F, 3.7859F, 0.572F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 1.3821F, -0.3821F, -0.2972F);

    }

    public void renderAll(float f) {
        this.root.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
