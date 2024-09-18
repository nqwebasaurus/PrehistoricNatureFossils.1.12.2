package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAustriadactylusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer body2;
    private final ModelRenderer chest_r1;
    private final ModelRenderer hips;
    private final ModelRenderer body_r1;
    private final ModelRenderer body_r2;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tailthing1;
    private final ModelRenderer upperleg1;
    private final ModelRenderer leg1;
    private final ModelRenderer feet1;
    private final ModelRenderer legwing12;
    private final ModelRenderer legwing11;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer feet2;
    private final ModelRenderer legwing2;
    private final ModelRenderer legwing3;
    private final ModelRenderer chest;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer upperwing1;
    private final ModelRenderer wing1;
    private final ModelRenderer wingfingerbase1;
    private final ModelRenderer wingfinger2;
    private final ModelRenderer hand1;
    private final ModelRenderer upperwing2;
    private final ModelRenderer wing2;
    private final ModelRenderer wingfingerbase2;
    private final ModelRenderer wingfinger3;
    private final ModelRenderer hand2;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer underneck1;
    private final ModelRenderer head1;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer lowerteeth1;
    private final ModelRenderer underhead1;
    private final ModelRenderer lowerteeth2;
    private final ModelRenderer gums1;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer crest2;
    private final ModelRenderer teeth1;
    private final ModelRenderer head4;
    private final ModelRenderer crest1;
    private final ModelRenderer teeth2;

    public ModelSkeletonAustriadactylusFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 4.9F, -4.6F);
        this.root.addChild(body2);
        this.setRotateAngle(body2, 0.2281F, 0.0F, 0.0F);


        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(0.0F, -2.1F, -3.2F);
        this.body2.addChild(chest_r1);
        this.setRotateAngle(chest_r1, -0.0524F, 0.0F, 0.0F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 9, 34, -0.5F, 0.5F, -0.4F, 1, 1, 7, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -0.3F, 3.4F);
        this.body2.addChild(hips);
        this.setRotateAngle(hips, 0.085F, -0.1308F, 0.006F);


        this.body_r1 = new ModelRenderer(this);
        this.body_r1.setRotationPoint(0.0F, -0.3516F, 2.1747F);
        this.hips.addChild(body_r1);
        this.setRotateAngle(body_r1, -1.5708F, -1.5359F, 1.5708F);
        this.body_r1.cubeList.add(new ModelBox(body_r1, 0, 23, -2.1F, -0.4F, -2.5F, 1, 1, 5, -0.15F, false));

        this.body_r2 = new ModelRenderer(this);
        this.body_r2.setRotationPoint(0.0F, -1.1F, 0.8F);
        this.hips.addChild(body_r2);
        this.setRotateAngle(body_r2, -0.0349F, 0.0F, 0.0F);
        this.body_r2.cubeList.add(new ModelBox(body_r2, 0, 23, -0.5F, 0.2F, -1.1F, 1, 1, 5, -0.15F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.2F, 4.3F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.162F, 0.1274F, 0.0361F);
        this.tail1.cubeList.add(new ModelBox(tail1, 17, 16, -0.5F, 0.4848F, -0.1517F, 1, 1, 10, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.6848F, 9.9483F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.3068F, 0.1665F, 0.0525F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, -2, -0.5F, -0.3F, -0.6F, 1, 1, 11, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5F, 9.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0019F, 0.0873F, 0.0002F);
        this.tail3.cubeList.add(new ModelBox(tail3, 30, 12, -0.5F, 0.2F, 0.3F, 1, 1, 8, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0769F, 0.087F, -0.0067F);
        this.tail4.cubeList.add(new ModelBox(tail4, 30, 0, -0.5F, 0.2F, 0.0F, 1, 1, 8, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0506F, 0.0872F, -0.0044F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 32, -0.5F, 0.2F, -0.3F, 1, 1, 7, -0.15F, false));

        this.tailthing1 = new ModelRenderer(this);
        this.tailthing1.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail5.addChild(tailthing1);
        this.setRotateAngle(tailthing1, 0.0F, 0.3054F, 0.0F);
        this.tailthing1.cubeList.add(new ModelBox(tailthing1, 38, 37, -0.5F, 0.2F, -0.7F, 1, 1, 5, -0.15F, false));

        this.upperleg1 = new ModelRenderer(this);
        this.upperleg1.setRotationPoint(1.7F, -0.1F, 0.5F);
        this.hips.addChild(upperleg1);
        this.setRotateAngle(upperleg1, 0.739F, 0.1921F, -1.256F);


        this.leg1 = new ModelRenderer(this);
        this.leg1.setRotationPoint(0.9518F, 5.7108F, 0.5895F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.9871F, -0.158F, 0.2132F);


        this.feet1 = new ModelRenderer(this);
        this.feet1.setRotationPoint(-0.2F, 6.9F, 0.2F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, 0.5555F, -0.0365F, 0.115F);


        this.legwing12 = new ModelRenderer(this);
        this.legwing12.setRotationPoint(0.0F, 0.0F, 1.2F);
        this.leg1.addChild(legwing12);
        this.setRotateAngle(legwing12, -0.1367F, 0.0F, 0.0F);


        this.legwing11 = new ModelRenderer(this);
        this.legwing11.setRotationPoint(0.4518F, 0.3108F, 1.9895F);
        this.upperleg1.addChild(legwing11);


        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(-1.7F, -0.1F, 0.5F);
        this.hips.addChild(upperleg2);
        this.setRotateAngle(upperleg2, 0.3027F, -0.1921F, 1.256F);


        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(-0.9518F, 5.7108F, 0.5895F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 1.6416F, 0.158F, -0.2132F);


        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(0.2F, 6.9F, 0.2F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, 0.3809F, 0.0365F, -0.115F);


        this.legwing2 = new ModelRenderer(this);
        this.legwing2.setRotationPoint(0.0F, 0.0F, 1.2F);
        this.leg2.addChild(legwing2);
        this.setRotateAngle(legwing2, -0.1367F, 0.0F, 0.0F);


        this.legwing3 = new ModelRenderer(this);
        this.legwing3.setRotationPoint(-0.4518F, 0.3108F, 1.9895F);
        this.upperleg2.addChild(legwing3);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2F, -1.8F);
        this.body2.addChild(chest);
        this.setRotateAngle(chest, 0.1215F, 0.0F, 0.0F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.0F, -0.9116F, -3.8401F);
        this.chest.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 1.5708F, -1.5184F, -1.5708F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 0, 0, -1.0F, -0.9F, -2.5F, 1, 1, 5, -0.15F, false));

        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.chest.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.0524F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 0, 0, -0.5F, 0.7F, -0.4F, 1, 1, 5, -0.15F, false));

        this.upperwing1 = new ModelRenderer(this);
        this.upperwing1.setRotationPoint(2.3F, -1.1F, -4.7F);
        this.chest.addChild(upperwing1);
        this.setRotateAngle(upperwing1, 0.0611F, -0.2154F, -0.7776F);


        this.wing1 = new ModelRenderer(this);
        this.wing1.setRotationPoint(5.9F, -0.6F, 0.1F);
        this.upperwing1.addChild(wing1);
        this.setRotateAngle(wing1, -0.598F, -0.3005F, -1.4872F);


        this.wingfingerbase1 = new ModelRenderer(this);
        this.wingfingerbase1.setRotationPoint(0.1F, 11.0F, -0.2F);
        this.wing1.addChild(wingfingerbase1);
        this.setRotateAngle(wingfingerbase1, -1.0472F, 0.0F, 0.0911F);


        this.wingfinger2 = new ModelRenderer(this);
        this.wingfinger2.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.wingfingerbase1.addChild(wingfinger2);
        this.setRotateAngle(wingfinger2, 0.1903F, -0.2573F, -0.049F);


        this.hand1 = new ModelRenderer(this);
        this.hand1.setRotationPoint(0.1F, 0.2F, -0.5F);
        this.wingfingerbase1.addChild(hand1);
        this.setRotateAngle(hand1, -0.0707F, -0.766F, -1.5798F);


        this.upperwing2 = new ModelRenderer(this);
        this.upperwing2.setRotationPoint(-2.3F, -1.1F, -4.7F);
        this.chest.addChild(upperwing2);
        this.setRotateAngle(upperwing2, -0.0076F, 0.2236F, 0.4647F);


        this.wing2 = new ModelRenderer(this);
        this.wing2.setRotationPoint(-5.9F, -0.6F, 0.1F);
        this.upperwing2.addChild(wing2);
        this.setRotateAngle(wing2, -0.5597F, 0.3722F, 1.6033F);


        this.wingfingerbase2 = new ModelRenderer(this);
        this.wingfingerbase2.setRotationPoint(-0.1F, 11.0F, -0.2F);
        this.wing2.addChild(wingfingerbase2);
        this.setRotateAngle(wingfingerbase2, -1.0472F, 0.0F, -0.0911F);


        this.wingfinger3 = new ModelRenderer(this);
        this.wingfinger3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.wingfingerbase2.addChild(wingfinger3);
        this.setRotateAngle(wingfinger3, 0.1867F, 0.1716F, 0.0322F);


        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(-0.1F, 0.2F, -0.5F);
        this.wingfingerbase2.addChild(hand2);
        this.setRotateAngle(hand2, -0.0707F, 0.766F, 1.5798F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.5643F, -5.8905F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.5619F, 0.1361F, 0.0301F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.2922F, 0.0808F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.096F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 15, -0.5F, -0.0588F, -3.6659F, 1, 1, 4, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.5F, -0.0357F, -2.8095F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.5279F, -0.3762F, 0.0498F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 7, -1.092F, 0.6042F, -4.3463F, 1, 1, 5, -0.15F, false));

        this.underneck1 = new ModelRenderer(this);
        this.underneck1.setRotationPoint(-0.592F, 0.8042F, 2.6537F);
        this.neck2.addChild(underneck1);
        this.setRotateAngle(underneck1, 0.182F, 0.0F, 0.0F);


        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(-0.592F, 0.3042F, -4.1463F);
        this.neck2.addChild(head1);
        this.setRotateAngle(head1, 0.8863F, -0.1583F, -0.1599F);


        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 1.3604F, -0.0991F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.733F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.3723F, -3.0493F);
        this.jaw1.addChild(jaw2);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 0.0F, -3.8F);
        this.jaw2.addChild(jaw3);


        this.lowerteeth1 = new ModelRenderer(this);
        this.lowerteeth1.setRotationPoint(0.0F, -0.8F, 0.1F);
        this.jaw3.addChild(lowerteeth1);


        this.underhead1 = new ModelRenderer(this);
        this.underhead1.setRotationPoint(0.0F, 0.0F, -2.6F);
        this.jaw2.addChild(underhead1);
        this.setRotateAngle(underhead1, -0.0911F, 0.0F, 0.0F);


        this.lowerteeth2 = new ModelRenderer(this);
        this.lowerteeth2.setRotationPoint(0.0F, -0.6F, -2.7F);
        this.jaw2.addChild(lowerteeth2);
        this.setRotateAngle(lowerteeth2, -0.0911F, 0.0F, 0.0F);


        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.3723F, -1.1493F);
        this.jaw1.addChild(gums1);
        this.setRotateAngle(gums1, -0.3643F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.6604F, -2.4991F);
        this.head1.addChild(head2);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.9F, -4.6F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.0456F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -1.2F, 0.1F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.2731F, 0.0F, 0.0F);


        this.crest2 = new ModelRenderer(this);
        this.crest2.setRotationPoint(0.0F, -0.3F, 1.2F);
        this.head5.addChild(crest2);
        this.setRotateAngle(crest2, -0.3187F, 0.0F, 0.0F);


        this.teeth1 = new ModelRenderer(this);
        this.teeth1.setRotationPoint(0.0F, 0.9F, 1.1F);
        this.head3.addChild(teeth1);
        this.setRotateAngle(teeth1, -0.0456F, 0.0F, 0.0F);


        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -1.1F, 0.2F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.3643F, 0.0F, 0.0F);


        this.crest1 = new ModelRenderer(this);
        this.crest1.setRotationPoint(0.0F, 0.2F, -2.2F);
        this.head2.addChild(crest1);
        this.setRotateAngle(crest1, -0.182F, 0.0F, 0.0F);


        this.teeth2 = new ModelRenderer(this);
        this.teeth2.setRotationPoint(0.0F, 1.6F, -2.8F);
        this.head2.addChild(teeth2);
        this.setRotateAngle(teeth2, 0.0911F, 0.0F, 0.0F);

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
