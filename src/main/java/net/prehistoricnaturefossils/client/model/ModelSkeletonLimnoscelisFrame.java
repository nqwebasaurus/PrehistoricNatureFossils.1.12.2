package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLimnoscelisFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Belly;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjaw1;
    private final ModelRenderer Upperjaw2;
    private final ModelRenderer Upperteeth2;
    private final ModelRenderer Upperteeth1;
    private final ModelRenderer Lowerjaw1;
    private final ModelRenderer Lowerjaw2;
    private final ModelRenderer Lowerjaw3;
    private final ModelRenderer Lowerteeth;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer Tail4;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonLimnoscelisFrame() {
        this.textureWidth = 72;
        this.textureHeight = 72;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -2.5F, -6.9F, 4.25F, 1, 7, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, 4.5F, -7.9F, -18.0F, 1, 8, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(5.0F, -5.0F, -17.5F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, -0.4363F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -2, 1, -4.0F, -0.5F, -0.5F, 9, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(-2.0F, -4.5F, 4.75F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, -0.1309F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -2, 1, -2.5F, -0.5F, -0.5F, 5, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 14.5F, 1.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.0861F, -0.1739F, 0.0149F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-1.8842F, 2.3575F, -2.3086F);
        this.Hips.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.0524F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 1, 15, 0.0F, -1.0F, -0.1F, 1, 1, 10, -0.1F, false));

        this.Belly = new ModelRenderer(this);
        this.Belly.setRotationPoint(-1.3842F, -0.0425F, -1.8086F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.1065F, -0.0868F, -0.0093F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(-0.5F, 2.2F, -10.3F);
        this.Belly.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.0175F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 31, 13, 0.0F, -1.0F, -0.2F, 1, 1, 10, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, -10.8F);
        this.Belly.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.0238F, -0.2617F, 0.0064F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.5F, 3.0574F, -9.9597F);
        this.Bodyfront.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0873F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 28, 24, -1.0F, -1.0237F, -0.0391F, 1, 1, 11, -0.1F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.8F, -9.0F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.1787F, -0.4795F, 0.0221F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 1.7882F, 0.2254F);
        this.Neck.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.0349F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 45, 56, -0.5F, -0.5698F, -3.9988F, 1, 1, 4, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.1F, -2.5F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.3487F, -0.395F, -0.082F);


        this.Upperjaw1 = new ModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, -1.5F, -4.0F);
        this.Head.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, 0.0848F, 0.0F, 0.0F);


        this.Upperjaw2 = new ModelRenderer(this);
        this.Upperjaw2.setRotationPoint(0.0F, 3.9F, -3.3F);
        this.Upperjaw1.addChild(Upperjaw2);
        this.setRotateAngle(Upperjaw2, -0.0637F, 0.0F, 0.0F);


        this.Upperteeth2 = new ModelRenderer(this);
        this.Upperteeth2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Upperjaw2.addChild(Upperteeth2);


        this.Upperteeth1 = new ModelRenderer(this);
        this.Upperteeth1.setRotationPoint(0.0F, 4.0F, -3.0F);
        this.Upperjaw1.addChild(Upperteeth1);


        this.Lowerjaw1 = new ModelRenderer(this);
        this.Lowerjaw1.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Head.addChild(Lowerjaw1);
        this.setRotateAngle(Lowerjaw1, 1.0036F, 0.0F, 0.0F);


        this.Lowerjaw2 = new ModelRenderer(this);
        this.Lowerjaw2.setRotationPoint(0.0F, 2.0F, -3.8F);
        this.Lowerjaw1.addChild(Lowerjaw2);
        this.setRotateAngle(Lowerjaw2, -0.1274F, 0.0F, 0.0F);


        this.Lowerjaw3 = new ModelRenderer(this);
        this.Lowerjaw3.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.Lowerjaw2.addChild(Lowerjaw3);
        this.setRotateAngle(Lowerjaw3, 0.1274F, 0.0F, 0.0F);


        this.Lowerteeth = new ModelRenderer(this);
        this.Lowerteeth.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Lowerjaw3.addChild(Lowerteeth);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.2F, 4.1F, -7.0F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, -0.0468F, 0.07F, -0.1451F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(3.6F, 0.7F, 0.0F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.5184F, -0.1904F, -0.1521F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 4.5F, -0.5F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.658F, -0.4882F, 0.0F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.2F, 4.1F, -7.0F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.1273F, 0.8333F, 0.2159F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-3.6F, 0.7F, 0.0F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, 0.2438F, -0.3214F, 0.5421F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 4.5F, -0.5F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, -0.3985F, 0.4505F, -0.8338F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(-1.3842F, 0.6575F, 7.4914F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.2042F, 0.2566F, -0.0525F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 17, 0, -0.5F, 1.3024F, -0.1156F, 1, 1, 10, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.1024F, 9.8844F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0593F, 0.2614F, 0.0153F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 16, 18, -0.5F, 1.2F, -0.5F, 1, 1, 10, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.4F, 9.2F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1138F, -0.2602F, -0.0294F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, 2.0232F, -0.2866F);
        this.Tail3.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, 0.075F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 0, 28, -0.5F, -0.5F, -0.5F, 1, 1, 11, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.2732F, 10.0134F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0479F, -0.3476F, -0.0282F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -0.5F, 0.4883F, -0.326F, 1, 1, 13, -0.1F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(0.7158F, 4.8575F, 4.1914F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.0772F, -0.1924F, -0.4299F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(6.0112F, 1.1537F, 0.081F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.6926F, -0.0635F, -0.0187F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(-0.3671F, 4.6615F, 0.2811F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.5123F, -0.6634F, 0.7504F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.4842F, 4.8575F, 4.1914F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.3686F, -0.698F, 0.5546F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-6.0112F, 1.1537F, 0.081F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, -0.0056F, 0.0635F, 0.0187F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.3671F, 4.6615F, 0.2811F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 0.132F, 0.7803F, -0.3728F);

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
