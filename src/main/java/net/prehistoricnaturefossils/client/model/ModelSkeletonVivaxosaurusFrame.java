package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonVivaxosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjaw1;
    private final ModelRenderer Upperjaw2;
    private final ModelRenderer Upperbeak;
    private final ModelRenderer Righttusk;
    private final ModelRenderer Lefttusk;
    private final ModelRenderer Lowerjaw1;
    private final ModelRenderer Lowerjaw2;
    private final ModelRenderer Lowerjaw3;
    private final ModelRenderer Lowerjaw4;
    private final ModelRenderer Lowerbeak;
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
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonVivaxosaurusFrame() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -1.2F, -9.0F, -11.0F, 1, 9, 1, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.2F, -5.0F, 8.0F, 1, 5, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.3F, -5.0F, 8.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -3.0F, -0.5F, 1, 6, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.7F, -5.0F, -10.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.5F, -5.0F, -0.5F, 1, 10, 1, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 14.6F, -1.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.3892F, -0.0013F, -0.0051F);
        this.Hips.cubeList.add(new ModelBox(Hips, 1, 15, -0.5074F, -0.4003F, 5.681F, 1, 1, 7, 0.003F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -1.5003F, 5.981F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1698F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -0.5056F, 1.0511F, -11.1001F, 1, 1, 11, 0.0F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.1511F, -11.1001F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1286F, 0.1278F, 0.0286F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-0.0741F, -0.1903F, -6.8475F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0873F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 21, 28, -0.4F, 1.7F, 0.0F, 1, 1, 7, 0.003F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.5097F, -6.4475F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, 0.1658F, -0.1999F, -0.0341F);
        this.Neck.cubeList.add(new ModelBox(Neck, 40, 43, -0.5336F, 1.0118F, -4.0226F, 1, 1, 4, 0.0F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, -0.0882F, -3.0226F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.1554F, -0.3846F, 0.0898F);


        this.Upperjaw1 = new ModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, -2.9998F, -3.983F);
        this.Head.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, 0.2335F, 0.0F, 0.0F);


        this.Upperjaw2 = new ModelRenderer(this);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Upperjaw1.addChild(Upperjaw2);
        this.setRotateAngle(Upperjaw2, 0.3609F, 0.0F, 0.0F);


        this.Upperbeak = new ModelRenderer(this);
        this.Upperbeak.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Upperjaw2.addChild(Upperbeak);
        this.setRotateAngle(Upperbeak, 0.6369F, 0.0F, 0.0F);


        this.Righttusk = new ModelRenderer(this);
        this.Righttusk.setRotationPoint(1.9F, 2.5F, -2.5F);
        this.Upperjaw2.addChild(Righttusk);
        this.setRotateAngle(Righttusk, -0.6793F, 0.0F, 0.0F);


        this.Lefttusk = new ModelRenderer(this);
        this.Lefttusk.setRotationPoint(-1.88F, 2.5F, -2.5F);
        this.Upperjaw2.addChild(Lefttusk);
        this.setRotateAngle(Lefttusk, -0.6793F, 0.0F, 0.0F);


        this.Lowerjaw1 = new ModelRenderer(this);
        this.Lowerjaw1.setRotationPoint(0.0F, 0.7002F, -0.973F);
        this.Head.addChild(Lowerjaw1);


        this.Lowerjaw2 = new ModelRenderer(this);
        this.Lowerjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjaw1.addChild(Lowerjaw2);
        this.setRotateAngle(Lowerjaw2, 0.1485F, 0.0F, 0.0F);


        this.Lowerjaw3 = new ModelRenderer(this);
        this.Lowerjaw3.setRotationPoint(0.0F, 3.0F, -2.0F);
        this.Lowerjaw2.addChild(Lowerjaw3);
        this.setRotateAngle(Lowerjaw3, -0.1485F, 0.0F, 0.0F);


        this.Lowerjaw4 = new ModelRenderer(this);
        this.Lowerjaw4.setRotationPoint(0.01F, 0.0F, -1.6F);
        this.Lowerjaw3.addChild(Lowerjaw4);
        this.setRotateAngle(Lowerjaw4, -0.2759F, 0.0F, 0.0F);


        this.Lowerbeak = new ModelRenderer(this);
        this.Lowerbeak.setRotationPoint(-0.01F, -3.0F, -2.0F);
        this.Lowerjaw3.addChild(Lowerbeak);
        this.setRotateAngle(Lowerbeak, 0.2122F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(5.5F, 4.3097F, -4.3475F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.4396F, -0.3124F, -1.0036F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.863F, 0.1863F, 1.3358F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 4.53F, 0.3F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.9841F, 0.2719F, -0.3277F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-5.5F, 4.3097F, -4.3475F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.1767F, 0.2517F, 0.3849F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.98F, -0.6525F, -0.6138F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 4.53F, 0.3F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 1.46F, 0.0F, 0.0F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -1.2003F, 13.581F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.5077F, -0.3869F, 0.207F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 56, 46, -0.6089F, 0.9463F, -0.4356F, 1, 1, 3, 0.0F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.0537F, 2.7644F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.6411F, -0.2229F, 0.4564F);


        this.Tail3_r1 = new ModelRenderer(this);
        this.Tail3_r1.setRotationPoint(0.0794F, 0.563F, 1.1824F);
        this.Tail2.addChild(Tail3_r1);
        this.setRotateAngle(Tail3_r1, 0.3927F, -0.0423F, -0.0151F);
        this.Tail3_r1.cubeList.add(new ModelBox(Tail3_r1, 52, 31, -0.25F, 0.0F, -1.75F, 1, 1, 4, 0.003F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.1349F, 3.0926F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.3825F, -0.5761F, 0.2158F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 51, 16, -0.2F, -0.0498F, 0.087F, 1, 1, 4, 0.0F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.2F, 0.4997F, 10.181F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -1.8621F, -0.5133F, 0.0537F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.3864F, 5.0131F, 0.4087F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 2.3414F, -0.1468F, 0.5633F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 5.5F, 0.4F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.0637F, -0.4245F, 0.0213F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.2F, 0.4997F, 10.181F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -1.8615F, 0.5014F, -0.0436F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.3864F, 5.0131F, 0.4087F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 2.2111F, 0.1446F, -0.5536F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 5.5F, 0.4F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.0637F, 0.4245F, -0.0213F);

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
