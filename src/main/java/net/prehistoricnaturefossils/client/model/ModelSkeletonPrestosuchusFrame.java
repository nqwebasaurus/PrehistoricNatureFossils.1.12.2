package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPrestosuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r2;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer feet2;
    private final ModelRenderer toes2;
    private final ModelRenderer upperleg3;
    private final ModelRenderer leg3;
    private final ModelRenderer feet3;
    private final ModelRenderer toes3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r3;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r4;
    private final ModelRenderer upperarm2;
    private final ModelRenderer arm2;
    private final ModelRenderer hand2;
    private final ModelRenderer upperarm3;
    private final ModelRenderer arm3;
    private final ModelRenderer hand3;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r7;
    private final ModelRenderer head;
    private final ModelRenderer crestl;
    private final ModelRenderer crestl2;
    private final ModelRenderer crestl3;
    private final ModelRenderer crestl4;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonPrestosuchusFrame() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -22.0F, 1.2F, 1, 22, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 0.6F, -20.0F, -17.3F, 1, 20, 1, -0.1F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -15.5F, -16.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -2.5F, -5.5F, -0.5F, 1, 12, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 3.2F, -6.5F, 18.0F, 1, 12, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -20.0F, 2.0F);
        this.fossil.addChild(hips);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.2F, -3.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0524F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 41, -0.5F, 1.0F, 0.0F, 1, 2, 9, 0.0F, false));

        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(4.4F, 1.1319F, -0.3993F);
        this.hips.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.5829F, 0.0F, 0.0F);


        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(1.6F, 10.2226F, 1.157F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.7198F, 0.0F, 0.0F);


        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(-1.0F, 9.3899F, 2.1733F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, -0.1347F, 0.0F, 0.0F);


        this.toes2 = new ModelRenderer(this);
        this.toes2.setRotationPoint(0.0F, 0.0229F, -3.7873F);
        this.feet2.addChild(toes2);


        this.upperleg3 = new ModelRenderer(this);
        this.upperleg3.setRotationPoint(-4.4F, 1.1319F, -0.3993F);
        this.hips.addChild(upperleg3);
        this.setRotateAngle(upperleg3, 0.0716F, 0.0F, 0.0F);


        this.leg3 = new ModelRenderer(this);
        this.leg3.setRotationPoint(-1.6F, 10.2226F, 1.157F);
        this.upperleg3.addChild(leg3);
        this.setRotateAngle(leg3, 0.8507F, 0.0F, 0.0F);


        this.feet3 = new ModelRenderer(this);
        this.feet3.setRotationPoint(1.0F, 9.3899F, 2.1733F);
        this.leg3.addChild(feet3);
        this.setRotateAngle(feet3, 0.2143F, 0.0F, 0.0F);


        this.toes3 = new ModelRenderer(this);
        this.toes3.setRotationPoint(0.0F, 0.0229F, -3.7873F);
        this.feet3.addChild(toes3);
        this.setRotateAngle(toes3, -0.8727F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.0873F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 34, 54, -0.5F, -0.2F, -6.0F, 1, 2, 6, 0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.5F, -12.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1047F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 51, 56, -0.5F, 1.0F, 0.0F, 1, 2, 6, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.5F, -12.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.0873F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.1F, -6.0F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.192F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 53, -0.5F, 1.1428F, 0.1529F, 1, 2, 6, 0.003F, false));

        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(4.9F, 8.4F, -4.2F);
        this.chest.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.6355F, 0.0F, -0.1396F);


        this.arm2 = new ModelRenderer(this);
        this.arm2.setRotationPoint(1.7F, 6.5F, 0.8F);
        this.upperarm2.addChild(arm2);
        this.setRotateAngle(arm2, -1.6469F, 0.987F, -1.5229F);


        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.0F, 6.6718F, -1.0841F);
        this.arm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.0186F, -0.0439F, -1.4403F);


        this.upperarm3 = new ModelRenderer(this);
        this.upperarm3.setRotationPoint(-4.9F, 8.4F, -4.2F);
        this.chest.addChild(upperarm3);
        this.setRotateAngle(upperarm3, 0.1119F, 0.0F, 0.1396F);


        this.arm3 = new ModelRenderer(this);
        this.arm3.setRotationPoint(-1.7F, 6.5F, 0.8F);
        this.upperarm3.addChild(arm3);
        this.setRotateAngle(arm3, -1.6469F, -0.987F, 1.5229F);


        this.hand3 = new ModelRenderer(this);
        this.hand3.setRotationPoint(0.0F, 6.6718F, -1.0841F);
        this.arm3.addChild(hand3);
        this.setRotateAngle(hand3, 0.0025F, 0.0476F, 1.0909F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.9F, -5.2F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, -0.3493F, 0.1302F, -0.0228F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 1.6F, -4.9F);
        this.neck3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1222F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 69, 18, 0.0F, -0.9046F, -0.324F, 1, 2, 6, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.1F, -4.8F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.2673F, 0.1886F, 0.0656F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.1F, -5.0F);
        this.neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 70, 0.0F, 0.8F, -0.6F, 1, 2, 6, -0.1F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.2239F, 0.3905F, -0.0507F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.0F, -3.0F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 71, 0.0F, 0.5F, -1.9F, 1, 2, 5, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -4.4F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0065F, -0.1481F, 0.4081F);


        this.crestl = new ModelRenderer(this);
        this.crestl.setRotationPoint(1.2703F, 0.6012F, -5.6233F);
        this.head.addChild(crestl);
        this.setRotateAngle(crestl, 0.5477F, 0.581F, 0.0424F);


        this.crestl2 = new ModelRenderer(this);
        this.crestl2.setRotationPoint(3.0185F, -0.0787F, 2.6969F);
        this.crestl.addChild(crestl2);
        this.setRotateAngle(crestl2, -0.211F, -0.5263F, -0.0234F);


        this.crestl3 = new ModelRenderer(this);
        this.crestl3.setRotationPoint(-1.2703F, 0.6012F, -5.6233F);
        this.head.addChild(crestl3);
        this.setRotateAngle(crestl3, 0.5477F, -0.581F, -0.0424F);


        this.crestl4 = new ModelRenderer(this);
        this.crestl4.setRotationPoint(-3.0185F, -0.0787F, 2.6969F);
        this.crestl3.addChild(crestl4);
        this.setRotateAngle(crestl4, -0.211F, 0.5263F, 0.0234F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.9F, 2.9F, 3.2F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.2566F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.0F, 5.7F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.088F, 0.1304F, -0.0115F);
        this.tail.cubeList.add(new ModelBox(tail, 27, 27, -0.5F, 0.2F, 0.2F, 1, 2, 11, 0.003F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0542F, 0.2614F, -0.014F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 26, -0.5F, 0.2F, 0.1F, 1, 2, 11, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0886F, -0.1739F, 0.0154F);
        this.tail3.cubeList.add(new ModelBox(tail3, 64, 69, -0.5F, 0.1015F, -0.0349F, 1, 2, 5, -0.1F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 65, 0, -0.5F, 0.1015F, 4.7651F, 1, 1, 6, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.3985F, 10.9651F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1485F, -0.4293F, 0.0808F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 40, -0.5F, 0.5F, -0.4F, 1, 1, 10, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1347F, -0.4329F, 0.0568F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 11, -0.5F, 0.5F, -0.6F, 1, 1, 13, -0.1F, false));

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
