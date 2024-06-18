package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEndothiodonFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer endothiodon;
    private final ModelRenderer bodycentre;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer bodyback;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer upperleg1;
    private final ModelRenderer leg1;
    private final ModelRenderer feet1;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer feet2;
    private final ModelRenderer bodyfront;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer head;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer jaw;
    private final ModelRenderer upperarm1;
    private final ModelRenderer lowerarm1;
    private final ModelRenderer hand1;
    private final ModelRenderer upperarm2;
    private final ModelRenderer lowerarm2;
    private final ModelRenderer hand2;

    public ModelSkeletonEndothiodonFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 5, 26, -0.5F, -18.0F, -10.0F, 1, 18, 1, -0.21F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 26, -0.5F, -17.0F, 8.0F, 1, 17, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -9.0F, 8.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 56, 4.9F, -5.0F, -0.5F, 1, 10, 1, -0.2F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 56, 50, 0.5F, -5.0F, -18.5F, 1, 10, 1, -0.2F, false));

        this.endothiodon = new ModelRenderer(this);
        this.endothiodon.setRotationPoint(5.0F, 0.0F, -5.0F);
        this.fossil.addChild(endothiodon);


        this.bodycentre = new ModelRenderer(this);
        this.bodycentre.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.endothiodon.addChild(bodycentre);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -19.6F, 4.7F);
        this.bodycentre.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 10, -5.5F, 0.6941F, -0.084F, 1, 1, 7, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -19.8F, -2.3F);
        this.bodycentre.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0087F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 1, -5.5F, 0.833F, 0.2175F, 1, 1, 7, -0.2F, false));

        this.bodyback = new ModelRenderer(this);
        this.bodyback.setRotationPoint(-5.0F, -18.4F, 11.5F);
        this.bodycentre.addChild(bodyback);
        this.setRotateAngle(bodyback, -0.0873F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.3617F, 0.1239F);
        this.bodyback.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2443F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, -0.5F, 0.8F, -0.2F, 1, 1, 7, -0.2F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.6383F, 5.7239F);
        this.bodyback.addChild(tail1);
        this.setRotateAngle(tail1, -0.6127F, 0.0715F, -0.0501F);
        this.tail1.cubeList.add(new ModelBox(tail1, 52, 44, -0.5F, 0.1035F, 0.0038F, 1, 1, 4, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2965F, 3.7038F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.4396F, 0.1704F, -0.0381F);
        this.tail2.cubeList.add(new ModelBox(tail2, 71, 71, -0.5F, 0.3292F, 0.0226F, 1, 1, 3, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1292F, 2.9226F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1742F, 0.0869F, 0.0076F);
        this.tail3.cubeList.add(new ModelBox(tail3, 19, 37, -0.5F, 0.1123F, -0.8393F, 1, 1, 4, -0.2F, false));

        this.upperleg1 = new ModelRenderer(this);
        this.upperleg1.setRotationPoint(3.5F, 3.8048F, 2.9621F);
        this.bodyback.addChild(upperleg1);
        this.setRotateAngle(upperleg1, 0.2154F, -0.1188F, -0.6287F);


        this.leg1 = new ModelRenderer(this);
        this.leg1.setRotationPoint(-0.8058F, 7.3369F, -0.2998F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 1.012F, 0.0393F, 0.5374F);


        this.feet1 = new ModelRenderer(this);
        this.feet1.setRotationPoint(0.5955F, 5.7218F, 0.5468F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, -0.1606F, 0.1546F, -0.0508F);


        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(-3.5F, 3.8048F, 2.9621F);
        this.bodyback.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.3954F, 0.1188F, 0.6287F);


        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(0.8058F, 7.3369F, -0.2998F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.6494F, 0.2614F, -0.6405F);


        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(-0.5955F, 5.7218F, 0.5468F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, -0.1587F, 0.0177F, 0.023F);


        this.bodyfront = new ModelRenderer(this);
        this.bodyfront.setRotationPoint(-5.0F, -19.4F, -2.3F);
        this.bodycentre.addChild(bodyfront);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 1.9F, -5.7F);
        this.bodyfront.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2094F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 17, -1.0F, -0.2F, -0.3F, 1, 1, 7, -0.2F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.2F, -5.5F);
        this.bodyfront.addChild(neck1);
        this.setRotateAngle(neck1, -0.4828F, 0.2598F, -0.0448F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.4958F, -2.7239F);
        this.neck1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 68, 60, -0.5F, 0.7F, -0.2F, 1, 1, 3, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.6958F, -2.7239F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.0F, 0.1745F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 1.0F, -3.6F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 37, 0.0F, -0.2F, -1.8F, 1, 1, 6, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, -4.8F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.9641F, 0.0795F, 0.1041F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(2.4131F, -1.1435F, -4.9869F);
        this.head.addChild(bone);
        this.setRotateAngle(bone, 0.0669F, 0.3226F, 0.5187F);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(-2.4131F, -1.1435F, -4.9869F);
        this.head.addChild(bone2);
        this.setRotateAngle(bone2, 0.0669F, -0.3226F, -0.5187F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.8024F, -1.5487F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1309F, 0.0F, 0.0F);


        this.upperarm1 = new ModelRenderer(this);
        this.upperarm1.setRotationPoint(3.9F, 9.2611F, -3.6721F);
        this.bodyfront.addChild(upperarm1);
        this.setRotateAngle(upperarm1, 0.6379F, 0.132F, -1.0545F);


        this.lowerarm1 = new ModelRenderer(this);
        this.lowerarm1.setRotationPoint(0.181F, 6.2133F, 1.4092F);
        this.upperarm1.addChild(lowerarm1);
        this.setRotateAngle(lowerarm1, -0.8413F, 0.3092F, 0.9938F);


        this.hand1 = new ModelRenderer(this);
        this.hand1.setRotationPoint(-0.702F, 5.8683F, -0.7516F);
        this.lowerarm1.addChild(hand1);
        this.setRotateAngle(hand1, 0.8489F, 0.2471F, 0.1721F);


        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(-3.9F, 9.2611F, -3.6721F);
        this.bodyfront.addChild(upperarm2);
        this.setRotateAngle(upperarm2, -0.1475F, -0.132F, 1.0545F);


        this.lowerarm2 = new ModelRenderer(this);
        this.lowerarm2.setRotationPoint(-0.181F, 6.2133F, 1.4092F);
        this.upperarm2.addChild(lowerarm2);
        this.setRotateAngle(lowerarm2, -0.839F, 0.3915F, -0.9835F);


        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.702F, 5.8683F, -0.7516F);
        this.lowerarm2.addChild(hand2);
        this.setRotateAngle(hand2, 1.3173F, 0.1432F, -0.0482F);

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
