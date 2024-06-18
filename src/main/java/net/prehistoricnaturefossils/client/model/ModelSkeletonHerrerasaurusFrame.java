package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHerrerasaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer basin;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer body;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer chest;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer neck1;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head1;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer lowerteeth2;
    private final ModelRenderer lowerteeth1;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer teeth2;
    private final ModelRenderer head4;
    private final ModelRenderer teeth1;
    private final ModelRenderer upperarm2;
    private final ModelRenderer lowerarm2;
    private final ModelRenderer hand2;
    private final ModelRenderer upperarm3;
    private final ModelRenderer lowerarm3;
    private final ModelRenderer hand3;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer upperleg1;
    private final ModelRenderer lowerleg1;
    private final ModelRenderer feet1;
    private final ModelRenderer toes1;
    private final ModelRenderer upperleg2;
    private final ModelRenderer lowerleg2;
    private final ModelRenderer feet2;
    private final ModelRenderer toes2;

    public ModelSkeletonHerrerasaurusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -1.0F, -27.9F, -0.9F, 1, 28, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -1.1F, -24.9F, -20.5F, 1, 25, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-0.6F, -19.7F, -19.9F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, 0.0F, 0.0436F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -3, 1, -5.0F, -0.5F, -0.5F, 10, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(-0.5F, -26.25F, -0.4F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, -0.0008F, -0.0436F, 0.0175F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -2, 1, -4.0F, -0.5F, -0.5F, 8, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.basin = new ModelRenderer(this);
        this.basin.setRotationPoint(-0.2F, -5.2F, -9.5F);
        this.root.addChild(basin);
        this.setRotateAngle(basin, -0.0456F, 0.0F, 0.0F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(-1.0F, 1.7795F, 8.1702F);
        this.basin.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.0873F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 51, 19, 0.1F, -1.2277F, 0.9948F, 1, 1, 9, -0.1F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5826F, 7.7845F);
        this.basin.addChild(body);
        this.setRotateAngle(body, 0.1799F, 0.0F, 0.0F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(-0.4F, 1.7049F, -8.108F);
        this.body.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0175F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 1, 0, -0.5F, -0.4223F, -9.5F, 1, 1, 19, -0.1F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.1F, 0.1049F, -16.999F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-1.0F, 2.7F, -6.0084F);
        this.chest.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.1222F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 51, 31, 0.0F, -1.0F, 0.0F, 1, 1, 6, -0.1F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.4983F, -5.3024F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.0113F, 0.0F, 0.0F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(-0.5F, 1.7054F, -2.3152F);
        this.neck1.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.0349F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 66, 36, -0.5F, -0.4259F, -2.0F, 1, 1, 4, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0932F, -3.8009F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.6796F, 0.2992F, -0.0144F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.5F, 2.2197F, -2.3859F);
        this.neck2.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.2007F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 1, 0, -0.5F, -0.5F, -3.5F, 1, 1, 7, -0.1F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(-0.5F, 1.4142F, -6.3346F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3568F, 0.3564F, 0.1685F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(-0.5F, 2.4917F, -2.8295F);
        this.neck3.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.1222F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 61, 66, 0.0F, -1.0F, -0.5F, 1, 1, 4, -0.1F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.02F, 0.4016F, -3.5803F);
        this.neck3.addChild(head1);
        this.setRotateAngle(head1, 0.0079F, 0.2301F, -0.1968F);


        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 1.95F, -0.2412F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.3491F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, -0.4F, -4.2F);
        this.jaw1.addChild(jaw2);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 0.84F, -4.8F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.0456F, 0.0F, 0.0F);


        this.lowerteeth2 = new ModelRenderer(this);
        this.lowerteeth2.setRotationPoint(0.0F, -2.0F, -0.1F);
        this.jaw3.addChild(lowerteeth2);


        this.lowerteeth1 = new ModelRenderer(this);
        this.lowerteeth1.setRotationPoint(0.0F, -0.6F, 0.2F);
        this.jaw2.addChild(lowerteeth1);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 2.0642F, -3.6355F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.0585F, 0.0F, 0.0F);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, -1.8F, -5.1F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.0911F, 0.0F, 0.0F);


        this.teeth2 = new ModelRenderer(this);
        this.teeth2.setRotationPoint(0.0F, 2.2F, 0.5F);
        this.head3.addChild(teeth2);


        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -1.0F, 1.7F);
        this.head3.addChild(head4);
        this.setRotateAngle(head4, 0.07F, 0.0F, 0.0F);


        this.teeth1 = new ModelRenderer(this);
        this.teeth1.setRotationPoint(0.0F, 0.0F, -0.7F);
        this.head2.addChild(teeth1);


        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(4.0F, 6.4F, -3.3084F);
        this.chest.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.5439F, 0.2121F, -0.224F);


        this.lowerarm2 = new ModelRenderer(this);
        this.lowerarm2.setRotationPoint(0.1F, 6.2149F, 0.3687F);
        this.upperarm2.addChild(lowerarm2);
        this.setRotateAngle(lowerarm2, -0.8446F, 0.0964F, 0.303F);


        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.1F, 6.9004F, -0.0998F);
        this.lowerarm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.1146F, -0.0699F, 0.2937F);


        this.upperarm3 = new ModelRenderer(this);
        this.upperarm3.setRotationPoint(-4.8F, 6.4F, -3.3084F);
        this.chest.addChild(upperarm3);
        this.setRotateAngle(upperarm3, 0.7621F, -0.2121F, 0.224F);


        this.lowerarm3 = new ModelRenderer(this);
        this.lowerarm3.setRotationPoint(-0.1F, 6.2149F, 0.3687F);
        this.upperarm3.addChild(lowerarm3);
        this.setRotateAngle(lowerarm3, -1.5428F, -0.0964F, -0.303F);


        this.hand3 = new ModelRenderer(this);
        this.hand3.setRotationPoint(-0.23F, 7.1538F, -1.0584F);
        this.lowerarm3.addChild(hand3);
        this.setRotateAngle(hand3, 0.0968F, 0.093F, -0.5114F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(-0.5F, 0.2529F, 17.9149F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, 0.1329F, -0.173F, -0.023F);
        this.tail1.cubeList.add(new ModelBox(tail1, 31, 25, -0.4F, 1.1936F, -0.3575F, 1, 1, 15, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0194F, 14.8652F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.2228F, -0.0851F, -0.0193F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.1F, 1.5899F, -0.416F);
        this.tail2.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, -0.0262F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 1, 40, -0.5F, -0.5F, -0.5F, 1, 1, 15, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1915F, 14.8918F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2601F, 0.1265F, -0.0336F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.1F, 2.2797F, 0.0283F);
        this.tail3.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, 0.0436F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 24, 0, -0.5F, -0.5F, -0.5F, 1, 1, 17, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1153F, 16.5197F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.3105F, 0.2498F, -0.0792F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.1F, 1.6169F, 0.6393F);
        this.tail4.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, 0.0262F, 0.0F, 0.0F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 20, 43, -0.5F, -0.5F, -0.5F, 1, 1, 15, -0.1F, false));

        this.upperleg1 = new ModelRenderer(this);
        this.upperleg1.setRotationPoint(3.4F, 2.3515F, 9.0786F);
        this.basin.addChild(upperleg1);
        this.setRotateAngle(upperleg1, -0.0552F, -0.0692F, -0.1603F);


        this.lowerleg1 = new ModelRenderer(this);
        this.lowerleg1.setRotationPoint(0.5F, 10.9391F, 0.6485F);
        this.upperleg1.addChild(lowerleg1);
        this.setRotateAngle(lowerleg1, 0.8589F, -0.0486F, 0.1551F);


        this.feet1 = new ModelRenderer(this);
        this.feet1.setRotationPoint(-0.5F, 9.766F, 1.666F);
        this.lowerleg1.addChild(feet1);
        this.setRotateAngle(feet1, -0.7247F, 0.0F, 0.0F);


        this.toes1 = new ModelRenderer(this);
        this.toes1.setRotationPoint(0.0F, 8.1F, 0.2F);
        this.feet1.addChild(toes1);
        this.setRotateAngle(toes1, 0.0019F, 0.0F, 0.0F);


        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(-4.0F, 2.3515F, 9.0786F);
        this.basin.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.9278F, 0.0692F, 0.1603F);


        this.lowerleg2 = new ModelRenderer(this);
        this.lowerleg2.setRotationPoint(-0.5F, 10.9391F, 0.6485F);
        this.upperleg2.addChild(lowerleg2);
        this.setRotateAngle(lowerleg2, 1.3825F, 0.0486F, -0.1551F);


        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(0.5F, 9.766F, 1.666F);
        this.lowerleg2.addChild(feet2);
        this.setRotateAngle(feet2, -1.2919F, 0.0F, 0.0F);


        this.toes2 = new ModelRenderer(this);
        this.toes2.setRotationPoint(0.0F, 8.1F, 0.2F);
        this.feet2.addChild(toes2);
        this.setRotateAngle(toes2, 1.66F, 0.0F, 0.0F);

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
