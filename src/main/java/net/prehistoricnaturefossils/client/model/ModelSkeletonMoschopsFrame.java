package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMoschopsFrame extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer Hips;
    private final ModelRenderer Belly;
    private final ModelRenderer Front;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjaw;
    private final ModelRenderer Upperjaw;
    private final ModelRenderer Headslope;
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
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonMoschopsFrame() {
        this.textureWidth = 85;
        this.textureHeight = 85;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.cubeList.add(new ModelBox(root, 2, 1, -0.498F, 8.1F, 12.0F, 1, 16, 1, -0.1F, false));
        this.root.cubeList.add(new ModelBox(root, -3, 1, -5.0F, 11.0F, 12.02F, 10, 1, 1, -0.1F, false));
        this.root.cubeList.add(new ModelBox(root, 2, 1, 1.4F, 5.1F, -11.0F, 1, 19, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(2.0F, 11.5F, -11.0F);
        this.root.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, -0.2618F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -4, 1, -6.0F, -1.0F, 0.0F, 12, 1, 1, -0.1F, false));

        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 6.8F, -1.5F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.2759F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 22, 0, -0.5F, -2.8867F, 9.4326F, 1, 1, 9, -0.1F, false));

        this.Belly = new ModelRenderer(this);
        this.Belly.setRotationPoint(0.0F, -4.0867F, 9.7326F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.0652F, -0.0871F, -0.0057F);
        this.Belly.cubeList.add(new ModelBox(Belly, 0, 0, -0.5F, 1.2043F, -14.3F, 1, 1, 15, -0.1F, false));

        this.Front = new ModelRenderer(this);
        this.Front.setRotationPoint(0.0F, -0.0957F, -14.8F);
        this.Belly.addChild(Front);
        this.setRotateAngle(Front, 0.3233F, -0.0414F, -0.0139F);
        this.Front.cubeList.add(new ModelBox(Front, 0, 19, -0.5F, 1.2978F, -10.5296F, 1, 1, 11, -0.1F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.1978F, -9.8296F);
        this.Front.addChild(Neck);
        this.setRotateAngle(Neck, 0.0687F, -0.0871F, -0.006F);
        this.Neck.cubeList.add(new ModelBox(Neck, 37, 31, -0.5F, 1.0969F, -8.0586F, 1, 1, 8, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, 0.3969F, -6.6586F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 1.1605F, 0.0F, 0.0F);


        this.Lowerjaw = new ModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 1.096F, -2.2987F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.2983F, 0.0F, 0.0F);


        this.Upperjaw = new ModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, -0.704F, -3.3987F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, 0.2546F, 0.0F, 0.0F);


        this.Headslope = new ModelRenderer(this);
        this.Headslope.setRotationPoint(0.0F, -2.804F, -4.3987F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.7456F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(5.0F, 7.6978F, -5.5296F);
        this.Front.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 1.2701F, 0.0F, -0.6793F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.0216F, 8.7833F, -1.7613F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -1.1451F, 0.3183F, 0.5943F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.626F, 6.4544F, 1.1471F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.7418F, 0.0F, 0.0F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-5.0F, 7.6978F, -5.5296F);
        this.Front.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.1792F, 0.0F, 0.6793F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-0.0216F, 8.7833F, -1.7613F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -1.0578F, -0.3183F, -0.5943F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.626F, 6.4544F, 1.1471F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.6981F, 0.0F, 0.0F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -4.1867F, 18.6326F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.4102F, 0.363F, -0.1532F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 54, 39, -0.5F, 1.1118F, -0.0784F, 1, 1, 5, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.1118F, 4.9216F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.4704F, 0.3137F, -0.1557F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 51, 30, -0.5F, 0.9706F, -0.088F, 1, 1, 6, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.2294F, 5.612F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.024F, 0.4798F, 0.0111F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, 1.7457F, -0.7F);
        this.Tail3.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, 0.1309F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 31, 55, -0.5F, -0.5F, 0.5F, 1, 1, 5, -0.1F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(4.0F, -0.0867F, 14.9326F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.4316F, 0.0F, -0.3609F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.0469F, 6.5911F, -0.6275F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.6416F, 0.0F, 0.3821F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 5.5497F, 1.1071F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 0.2247F, -0.0803F, 0.1546F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-4.0F, -0.0867F, 14.9326F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.3538F, 0.0F, 0.3609F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.0469F, 6.5911F, -0.6275F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.7725F, 0.0F, -0.3821F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 5.5497F, 1.1071F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.3915F, 0.0F, 0.0F);

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
