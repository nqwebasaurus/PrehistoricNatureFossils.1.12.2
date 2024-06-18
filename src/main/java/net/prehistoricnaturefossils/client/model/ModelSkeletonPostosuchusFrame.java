package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPostosuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer body1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer chest1;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer upperarm2;
    private final ModelRenderer arm2;
    private final ModelRenderer hand2;
    private final ModelRenderer upperarm3;
    private final ModelRenderer arm3;
    private final ModelRenderer hand3;
    private final ModelRenderer neck1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck2_r2;
    private final ModelRenderer head1;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer underteeth2;
    private final ModelRenderer jaw4;
    private final ModelRenderer underteeth1;
    private final ModelRenderer gums1;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer crestr;
    private final ModelRenderer crestr2;
    private final ModelRenderer crestl;
    private final ModelRenderer crestl2;
    private final ModelRenderer head4;
    private final ModelRenderer teeth2;
    private final ModelRenderer teeth1;
    private final ModelRenderer chestosteoderms1;
    private final ModelRenderer chestosteoderms2;
    private final ModelRenderer basin1;
    private final ModelRenderer basin2_r1;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer feet2;
    private final ModelRenderer toes2;
    private final ModelRenderer upperleg3;
    private final ModelRenderer leg3;
    private final ModelRenderer feet3;
    private final ModelRenderer toes3;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer tail2osteoderme1;
    private final ModelRenderer tail2osteoderme2;
    private final ModelRenderer tail1osteoderme1;
    private final ModelRenderer tai1losteoderme2;
    private final ModelRenderer basinosteoderme1;
    private final ModelRenderer basinosteoderme2;
    private final ModelRenderer osteoderms1;
    private final ModelRenderer osteoderms2;

    public ModelSkeletonPostosuchusFrame() {
        this.textureWidth = 140;
        this.textureHeight = 140;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -0.9F, -7.1F, 11.0F, 2, 31, 2, -0.25F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.0F, 7.9F, -13.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3491F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.175F, -9.0F, -1.0F, 2, 25, 2, -0.25F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.0F, 7.9F, -13.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3483F, 0.0239F, -1.5052F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.1F, -5.0F, -1.0F, 2, 11, 2, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 7.9F, 12.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 12.2F, -5.0F, -1.0F, 2, 10, 2, -0.2F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -7.6F, -0.1F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, 0.2143F, 0.0F, 0.0F);


        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, 1.8F, -7.0F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, 0.0436F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 62, 72, -1.0F, 0.9003F, -0.0142F, 2, 2, 14, -0.2F, false));

        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, 1.1F, -6.2F);
        this.body1.addChild(chest1);
        this.setRotateAngle(chest1, 0.0533F, 0.3051F, 0.0084F);


        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(0.0F, -0.3919F, -10.1186F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, -0.0873F, 0.0F, 0.0F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 96, 31, -1.0F, 1.0907F, -0.1076F, 2, 2, 10, -0.2F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, -0.9368F, -16.0938F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.0349F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 0, 66, -1.0F, 1.9355F, 0.0665F, 2, 2, 6, -0.2F, false));

        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(4.9F, 9.4F, -11.9F);
        this.chest1.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.7664F, 0.0F, -0.1396F);


        this.arm2 = new ModelRenderer(this);
        this.arm2.setRotationPoint(0.6F, 7.6F, 1.3F);
        this.upperarm2.addChild(arm2);
        this.setRotateAngle(arm2, -1.0699F, 0.0F, 0.0F);


        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.0F, 6.6718F, -1.0841F);
        this.arm2.addChild(hand2);
        this.setRotateAngle(hand2, -0.0044F, 0.0F, 0.1745F);


        this.upperarm3 = new ModelRenderer(this);
        this.upperarm3.setRotationPoint(-4.9F, 9.4F, -11.9F);
        this.chest1.addChild(upperarm3);
        this.setRotateAngle(upperarm3, 0.5558F, -0.2152F, 0.4707F);


        this.arm3 = new ModelRenderer(this);
        this.arm3.setRotationPoint(-0.6F, 7.6F, 1.3F);
        this.upperarm3.addChild(arm3);
        this.setRotateAngle(arm3, -1.1135F, 0.0F, 0.0F);


        this.hand3 = new ModelRenderer(this);
        this.hand3.setRotationPoint(0.0F, 6.6718F, -1.0841F);
        this.arm3.addChild(hand3);
        this.setRotateAngle(hand3, -0.0044F, 0.0F, -0.1745F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.1F, -15.8F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.3913F, 0.3699F, -0.1319F);


        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(-0.2297F, 0.0512F, -9.1483F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.2182F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 100, 50, -1.0F, 2.5983F, 0.0606F, 2, 2, 10, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(-0.2297F, 1.1512F, -6.9483F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1219F, 0.1347F, -0.0019F);


        this.neck2_r2 = new ModelRenderer(this);
        this.neck2_r2.setRotationPoint(0.0F, -2.2F, -8.0F);
        this.neck2.addChild(neck2_r2);
        this.setRotateAngle(neck2_r2, -0.1309F, 0.0F, 0.0F);
        this.neck2_r2.cubeList.add(new ModelBox(neck2_r2, 0, 99, -1.0F, 2.5906F, -1.8562F, 2, 2, 10, -0.2F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, -1.4F, -7.6F);
        this.neck2.addChild(head1);
        this.setRotateAngle(head1, -0.1309F, 0.0F, 0.0F);


        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.8116F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 1.5F, -8.4F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.3927F, 0.0F, 0.0F);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -1.15F, -7.55F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.5236F, 0.0F, 0.0F);


        this.underteeth2 = new ModelRenderer(this);
        this.underteeth2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.jaw3.addChild(underteeth2);


        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(0.0F, 1.95F, -0.95F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.2862F, 0.0F, 0.0F);


        this.underteeth1 = new ModelRenderer(this);
        this.underteeth1.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.jaw2.addChild(underteeth1);


        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.8F, -3.4F);
        this.jaw1.addChild(gums1);
        this.setRotateAngle(gums1, -0.1585F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.5F, -9.6F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.1361F, 0.0F, 0.0F);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, -1.35F, 1.925F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.1056F, 0.0F, 0.0F);


        this.crestr = new ModelRenderer(this);
        this.crestr.setRotationPoint(-1.5F, -2.5F, -3.0F);
        this.head3.addChild(crestr);
        this.setRotateAngle(crestr, -0.0903F, -0.698F, 0.005F);


        this.crestr2 = new ModelRenderer(this);
        this.crestr2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.crestr.addChild(crestr2);
        this.setRotateAngle(crestr2, -0.1674F, 0.5263F, 0.0234F);


        this.crestl = new ModelRenderer(this);
        this.crestl.setRotationPoint(1.5F, -2.5F, -3.0F);
        this.head3.addChild(crestl);
        this.setRotateAngle(crestl, -0.0467F, 0.698F, -0.005F);


        this.crestl2 = new ModelRenderer(this);
        this.crestl2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.crestl.addChild(crestl2);
        this.setRotateAngle(crestl2, -0.211F, -0.5263F, -0.0234F);


        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -0.3F, -6.7F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, -0.1367F, 0.0F, 0.0F);


        this.teeth2 = new ModelRenderer(this);
        this.teeth2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.head4.addChild(teeth2);


        this.teeth1 = new ModelRenderer(this);
        this.teeth1.setRotationPoint(0.0F, 2.5F, -1.0F);
        this.head2.addChild(teeth1);


        this.chestosteoderms1 = new ModelRenderer(this);
        this.chestosteoderms1.setRotationPoint(1.5F, -3.2967F, -1.5274F);
        this.chest1.addChild(chestosteoderms1);
        this.setRotateAngle(chestosteoderms1, 0.0017F, 0.0F, 0.0F);


        this.chestosteoderms2 = new ModelRenderer(this);
        this.chestosteoderms2.setRotationPoint(-1.5F, -3.2967F, -1.5274F);
        this.chest1.addChild(chestosteoderms2);


        this.basin1 = new ModelRenderer(this);
        this.basin1.setRotationPoint(0.0F, -0.2F, 7.9F);
        this.body1.addChild(basin1);
        this.setRotateAngle(basin1, -0.0428F, 0.0112F, -0.0079F);


        this.basin2_r1 = new ModelRenderer(this);
        this.basin2_r1.setRotationPoint(0.0F, 1.2505F, -1.4943F);
        this.basin1.addChild(basin2_r1);
        this.setRotateAngle(basin2_r1, -0.0305F, 0.0F, 0.0F);
        this.basin2_r1.cubeList.add(new ModelBox(basin2_r1, 84, 94, -1.0F, 1.0995F, -0.0057F, 2, 2, 11, -0.2F, false));

        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(4.4F, 4.9319F, 3.7007F);
        this.basin1.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.0593F, -0.0574F, -0.1177F);


        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(1.0F, 14.5226F, -0.843F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 1.0688F, -0.0632F, 0.0943F);


        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(-1.0F, 12.9899F, 2.1733F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, 0.2143F, 0.0F, 0.0F);


        this.toes2 = new ModelRenderer(this);
        this.toes2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.feet2.addChild(toes2);
        this.setRotateAngle(toes2, 0.0873F, 0.0F, 0.0F);


        this.upperleg3 = new ModelRenderer(this);
        this.upperleg3.setRotationPoint(-4.4F, 4.9319F, 3.7007F);
        this.basin1.addChild(upperleg3);
        this.setRotateAngle(upperleg3, -0.5916F, 0.0574F, 0.1177F);


        this.leg3 = new ModelRenderer(this);
        this.leg3.setRotationPoint(-1.0F, 14.5226F, -0.843F);
        this.upperleg3.addChild(leg3);
        this.setRotateAngle(leg3, 0.458F, 0.0632F, -0.0943F);


        this.feet3 = new ModelRenderer(this);
        this.feet3.setRotationPoint(1.0F, 12.9899F, 2.1733F);
        this.leg3.addChild(feet3);
        this.setRotateAngle(feet3, 0.258F, 0.0F, 0.0F);


        this.toes3 = new ModelRenderer(this);
        this.toes3.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.feet3.addChild(toes3);
        this.setRotateAngle(toes3, -0.3054F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 4.4002F, 9.3909F);
        this.basin1.addChild(tail1);
        this.setRotateAngle(tail1, 0.09F, -0.1304F, -0.0117F);


        this.tail2_r1 = new ModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.0F, -3.0F, -1.0F);
        this.tail1.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, -0.0262F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 0, 0, -1.0F, 1.2F, 0.0F, 2, 2, 20, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.5F, 18.1F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.1308F, -0.1278F, 0.0282F);


        this.tail3_r1 = new ModelRenderer(this);
        this.tail3_r1.setRotationPoint(0.0F, -2.3648F, 0.9855F);
        this.tail2.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, -0.0578F, 0.0028F, -0.0031F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 25, 48, -1.0F, 1.4393F, -0.5583F, 2, 2, 18, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6F, 16.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2253F, 0.1702F, -0.0388F);


        this.tail4_r1 = new ModelRenderer(this);
        this.tail4_r1.setRotationPoint(0.0F, 0.3648F, 1.4855F);
        this.tail3.addChild(tail4_r1);
        this.setRotateAngle(tail4_r1, -0.0524F, 0.0F, 0.0F);
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 48, 51, -1.0F, 0.0357F, -0.5083F, 2, 2, 18, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 17.4F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1864F, 0.2145F, -0.0401F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 66, -0.5F, 1.786F, 1.147F, 1, 1, 17, -0.2F, false));

        this.tail2osteoderme1 = new ModelRenderer(this);
        this.tail2osteoderme1.setRotationPoint(-0.6F, -4.8988F, 0.5546F);
        this.tail2.addChild(tail2osteoderme1);
        this.setRotateAngle(tail2osteoderme1, -0.1833F, 0.0F, 0.0F);


        this.tail2osteoderme2 = new ModelRenderer(this);
        this.tail2osteoderme2.setRotationPoint(0.6F, -3.9997F, 0.5137F);
        this.tail2.addChild(tail2osteoderme2);
        this.setRotateAngle(tail2osteoderme2, -0.1745F, 0.0F, 0.0F);


        this.tail1osteoderme1 = new ModelRenderer(this);
        this.tail1osteoderme1.setRotationPoint(-1.0F, -6.6F, 0.5F);
        this.tail1.addChild(tail1osteoderme1);
        this.setRotateAngle(tail1osteoderme1, -0.1134F, 0.0F, 0.0F);


        this.tai1losteoderme2 = new ModelRenderer(this);
        this.tai1losteoderme2.setRotationPoint(1.0F, -6.6F, 0.5F);
        this.tail1.addChild(tai1losteoderme2);
        this.setRotateAngle(tai1losteoderme2, -0.1047F, 0.0F, 0.0F);


        this.basinosteoderme1 = new ModelRenderer(this);
        this.basinosteoderme1.setRotationPoint(1.2F, -2.7979F, -0.9911F);
        this.basin1.addChild(basinosteoderme1);
        this.setRotateAngle(basinosteoderme1, -0.0436F, 0.0F, 0.0F);


        this.basinosteoderme2 = new ModelRenderer(this);
        this.basinosteoderme2.setRotationPoint(-1.2F, -2.7979F, -0.9911F);
        this.basin1.addChild(basinosteoderme2);
        this.setRotateAngle(basinosteoderme2, -0.0436F, 0.0F, 0.0F);


        this.osteoderms1 = new ModelRenderer(this);
        this.osteoderms1.setRotationPoint(1.6F, -2.5963F, -0.0819F);
        this.body1.addChild(osteoderms1);
        this.setRotateAngle(osteoderms1, 0.0873F, 0.0F, 0.0F);


        this.osteoderms2 = new ModelRenderer(this);
        this.osteoderms2.setRotationPoint(-1.6F, -2.4967F, -0.0728F);
        this.body1.addChild(osteoderms2);
        this.setRotateAngle(osteoderms2, 0.0873F, 0.0F, 0.0F);

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
