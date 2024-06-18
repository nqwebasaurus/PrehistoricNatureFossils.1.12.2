package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDimorphodonFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer chest;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer body1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer upperlegleft;
    private final ModelRenderer lowerlegleft;
    private final ModelRenderer footleft;
    private final ModelRenderer legwing2;
    private final ModelRenderer legwing3;
    private final ModelRenderer upperlegright;
    private final ModelRenderer lowerlegright;
    private final ModelRenderer footright;
    private final ModelRenderer legwing4;
    private final ModelRenderer legwing5;
    private final ModelRenderer wingleft1;
    private final ModelRenderer wingleft2;
    private final ModelRenderer wingleft3;
    private final ModelRenderer wingleft3Membrane;
    private final ModelRenderer wingleft4;
    private final ModelRenderer wingleft4Membrane;
    private final ModelRenderer bone;
    private final ModelRenderer handleft;
    private final ModelRenderer wingright1;
    private final ModelRenderer wingright2;
    private final ModelRenderer wingright3;
    private final ModelRenderer wingright3Membrane;
    private final ModelRenderer wingright4;
    private final ModelRenderer wingright4Membrane;
    private final ModelRenderer bone2;
    private final ModelRenderer handright;
    private final ModelRenderer neck1;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer head;
    private final ModelRenderer head2;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2;

    public ModelSkeletonDimorphodonFrame() {
        this.textureWidth = 58;
        this.textureHeight = 58;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -1.0F, -6.9F, 1.0F, 1, 7, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.498F, -8.9F, -5.55F, 1, 9, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-0.3F, -7.3F, -5.55F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, -0.0611F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, 0, 1, -2.0F, -1.0F, 0.0F, 5, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(-0.5F, -6.5F, 1.0F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, -0.2182F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, 0, 1, -2.0F, -1.0F, 0.0F, 4, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -9.3F, -2.7F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.2618F, 0.0F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 1.3926F, -2.4513F);
        this.chest.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.0349F, -0.0174F, -0.0006F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 37, 37, -0.5F, -0.5768F, -0.1078F, 1, 1, 5, -0.1F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.3074F, 0.6987F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, -0.0851F, -0.1264F, -0.0341F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 2.3F, 1.6F);
        this.body1.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0349F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 29, 44, -0.5F, -0.5F, -0.1F, 1, 1, 4, -0.1F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.2912F, 5.7158F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, 0.0953F, -0.1993F, -0.0898F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(-0.25F, 0.9827F, -0.7982F);
        this.tail1.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.0525F, 0.061F, 0.0032F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 17, 43, -0.5F, -0.3692F, -0.0034F, 1, 1, 5, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2282F, 3.6598F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0444F, -0.0794F, -0.0371F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, 0.737F, -0.2256F);
        this.tail2.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, 0.0349F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 23, 36, -0.5F, -0.1F, -0.1F, 1, 1, 6, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.063F, 4.9244F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0994F, -0.085F, -0.0195F);
        this.tail3.cubeList.add(new ModelBox(tail3, 32, 3, -0.5F, 0.5F, 0.0F, 1, 1, 6, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0534F, 6.3059F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1323F, -0.0433F, -0.0056F);
        this.tail4.cubeList.add(new ModelBox(tail4, 11, 28, -0.5F, 0.5366F, -0.7978F, 1, 1, 8, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0383F, 6.5915F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0886F, -0.0436F, 0.0001F);
        this.tail5.cubeList.add(new ModelBox(tail5, 21, 9, -0.5F, 0.5715F, 0.0017F, 1, 1, 7, -0.1F, false));

        this.upperlegleft = new ModelRenderer(this);
        this.upperlegleft.setRotationPoint(2.0F, 1.65F, 4.1F);
        this.body1.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, 0.2904F, 0.0398F, -0.5617F);


        this.lowerlegleft = new ModelRenderer(this);
        this.lowerlegleft.setRotationPoint(0.2079F, 3.8289F, -0.0304F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 1.0146F, 0.0017F, 0.6108F);


        this.footleft = new ModelRenderer(this);
        this.footleft.setRotationPoint(-0.0073F, 5.7437F, -0.2414F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, -1.0731F, -0.421F, 0.598F);


        this.legwing2 = new ModelRenderer(this);
        this.legwing2.setRotationPoint(0.1F, -0.4761F, 0.2188F);
        this.lowerlegleft.addChild(legwing2);
        this.setRotateAngle(legwing2, -0.0873F, 0.0F, 0.0F);


        this.legwing3 = new ModelRenderer(this);
        this.legwing3.setRotationPoint(0.8079F, -1.1711F, 1.3696F);
        this.upperlegleft.addChild(legwing3);


        this.upperlegright = new ModelRenderer(this);
        this.upperlegright.setRotationPoint(-2.0F, 1.65F, 4.1F);
        this.body1.addChild(upperlegright);
        this.setRotateAngle(upperlegright, -0.4534F, 0.1073F, 0.6593F);


        this.lowerlegright = new ModelRenderer(this);
        this.lowerlegright.setRotationPoint(-0.2079F, 3.8289F, -0.0304F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 1.2272F, 0.0052F, -0.4869F);


        this.footright = new ModelRenderer(this);
        this.footright.setRotationPoint(0.0073F, 5.7437F, -0.2414F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, -0.4956F, 0.4981F, -0.4755F);


        this.legwing4 = new ModelRenderer(this);
        this.legwing4.setRotationPoint(-0.1F, -0.4761F, 0.2188F);
        this.lowerlegright.addChild(legwing4);
        this.setRotateAngle(legwing4, -0.0873F, 0.0F, 0.0F);


        this.legwing5 = new ModelRenderer(this);
        this.legwing5.setRotationPoint(-0.8079F, -1.1711F, 1.3696F);
        this.upperlegright.addChild(legwing5);


        this.wingleft1 = new ModelRenderer(this);
        this.wingleft1.setRotationPoint(2.15F, 1.8926F, -1.6013F);
        this.chest.addChild(wingleft1);
        this.setRotateAngle(wingleft1, -0.2319F, -1.0194F, 0.0788F);


        this.wingleft2 = new ModelRenderer(this);
        this.wingleft2.setRotationPoint(4.6495F, 0.179F, -0.4333F);
        this.wingleft1.addChild(wingleft2);
        this.setRotateAngle(wingleft2, -0.4409F, 0.8114F, -0.1837F);


        this.wingleft3 = new ModelRenderer(this);
        this.wingleft3.setRotationPoint(0.1616F, 6.9536F, 1.1013F);
        this.wingleft2.addChild(wingleft3);
        this.setRotateAngle(wingleft3, 1.2081F, 0.1613F, 0.286F);


        this.wingleft3Membrane = new ModelRenderer(this);
        this.wingleft3Membrane.setRotationPoint(-0.0222F, 0.5252F, -0.2892F);
        this.wingleft3.addChild(wingleft3Membrane);


        this.wingleft4 = new ModelRenderer(this);
        this.wingleft4.setRotationPoint(-0.0293F, 0.0764F, 7.461F);
        this.wingleft3.addChild(wingleft4);
        this.setRotateAngle(wingleft4, 0.575F, -0.0626F, -0.115F);


        this.wingleft4Membrane = new ModelRenderer(this);
        this.wingleft4Membrane.setRotationPoint(-0.093F, 0.4859F, -0.0726F);
        this.wingleft4.addChild(wingleft4Membrane);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(-0.093F, 0.4859F, 24.9274F);
        this.wingleft4.addChild(bone);


        this.handleft = new ModelRenderer(this);
        this.handleft.setRotationPoint(-0.8457F, 0.1139F, -0.2465F);
        this.wingleft3.addChild(handleft);
        this.setRotateAngle(handleft, -0.6981F, 0.7388F, -0.434F);


        this.wingright1 = new ModelRenderer(this);
        this.wingright1.setRotationPoint(-2.15F, 1.8926F, -1.6013F);
        this.chest.addChild(wingright1);
        this.setRotateAngle(wingright1, -0.0292F, -0.006F, -0.3079F);


        this.wingright2 = new ModelRenderer(this);
        this.wingright2.setRotationPoint(-4.6495F, 0.179F, -0.4333F);
        this.wingright1.addChild(wingright2);
        this.setRotateAngle(wingright2, -0.5028F, -0.4355F, 0.3274F);


        this.wingright3 = new ModelRenderer(this);
        this.wingright3.setRotationPoint(-0.1616F, 6.9536F, 1.1013F);
        this.wingright2.addChild(wingright3);
        this.setRotateAngle(wingright3, 1.0882F, -0.4654F, -0.3838F);


        this.wingright3Membrane = new ModelRenderer(this);
        this.wingright3Membrane.setRotationPoint(0.0222F, 0.5252F, -0.2892F);
        this.wingright3.addChild(wingright3Membrane);


        this.wingright4 = new ModelRenderer(this);
        this.wingright4.setRotationPoint(0.0293F, 0.0764F, 7.461F);
        this.wingright3.addChild(wingright4);
        this.setRotateAngle(wingright4, 0.6051F, 0.2418F, -0.087F);


        this.wingright4Membrane = new ModelRenderer(this);
        this.wingright4Membrane.setRotationPoint(0.093F, 0.4859F, -0.0726F);
        this.wingright4.addChild(wingright4Membrane);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.093F, 0.4859F, 24.9274F);
        this.wingright4.addChild(bone2);


        this.handright = new ModelRenderer(this);
        this.handright.setRotationPoint(0.8457F, 0.1139F, -0.2465F);
        this.wingright3.addChild(handright);
        this.setRotateAngle(handright, -0.6406F, -0.9759F, 0.3675F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.1086F, -2.5437F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.354F, -0.1639F, -0.0602F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.5F, -1.9099F, -4.3594F);
        this.neck1.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.637F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 47, 6, 0.002F, -0.1F, 0.05F, 1, 1, 3, -0.1F, false));

        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(-0.5F, -0.3599F, -2.3594F);
        this.neck1.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.4538F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 45, 9, 0.0F, -0.1077F, -0.0544F, 1, 1, 3, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.4211F, -3.8112F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2657F, -0.1685F, 0.0456F);
        this.neck2.cubeList.add(new ModelBox(neck2, 36, 44, -0.5F, 0.6224F, -1.9477F, 1, 1, 2, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1224F, -1.9477F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.0782F, -0.2049F, -0.0747F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 2.0F, -4.75F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, 0.1309F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.5F, 0.05F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5672F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.jaw.addChild(jaw2);

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
