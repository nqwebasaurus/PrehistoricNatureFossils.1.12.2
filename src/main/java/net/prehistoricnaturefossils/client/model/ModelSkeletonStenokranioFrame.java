package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonStenokranioFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer hip;
    private final ModelRenderer body4_r1;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer body;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer eyeright;
    private final ModelRenderer eyeleft;
    private final ModelRenderer armleft;
    private final ModelRenderer armleft2;
    private final ModelRenderer handleft;
    private final ModelRenderer armright;
    private final ModelRenderer armright2;
    private final ModelRenderer handright;
    private final ModelRenderer legleft;
    private final ModelRenderer legleft2;
    private final ModelRenderer footleft;
    private final ModelRenderer legright;
    private final ModelRenderer legright2;
    private final ModelRenderer footright;

    public ModelSkeletonStenokranioFrame() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.9074F, -4.8F, -6.1235F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.7F, -5.75F, -0.5F, 1, 9, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.9074F, -4.8F, -6.1235F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.75F, -1.2F, -0.5F, 1, 6, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.8F, -7.5F, 4.9F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 3.4F, -2.0F, -0.5F, 1, 4, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.8F, -7.5F, 4.9F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.5F, 1.5F, -0.5F, 1, 6, 1, -0.16F, false));

        this.hip = new ModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.fossil.addChild(hip);
        this.setRotateAngle(hip, 0.0F, -0.3491F, 0.0F);


        this.body4_r1 = new ModelRenderer(this);
        this.body4_r1.setRotationPoint(0.0F, -8.9847F, 1.8393F);
        this.hip.addChild(body4_r1);
        this.setRotateAngle(body4_r1, -0.144F, 0.0F, 0.0F);
        this.body4_r1.cubeList.add(new ModelBox(body4_r1, 0, 0, -0.5F, 0.7384F, -0.2503F, 1, 1, 7, -0.15F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -6.75F, 9.0F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.3981F, -0.1611F, 0.0674F);
        this.tail.cubeList.add(new ModelBox(tail, 25, 11, -0.5F, -0.3007F, -0.9289F, 1, 1, 5, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.75F, 3.4F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0915F, -0.3042F, -0.0275F);
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 24, -0.5F, 0.45F, 0.0517F, 1, 1, 4, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1492F, 3.8629F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1795F, -0.2979F, -0.0761F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 24, -0.5F, 0.4892F, -0.4338F, 1, 1, 5, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.0F, 2.0F);
        this.hip.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.2182F, 0.0F);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -1.75F, -6.1F);
        this.body.addChild(body3_r1);
        this.setRotateAngle(body3_r1, 0.0349F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 11, 10, -0.5F, 0.6903F, -0.1095F, 1, 1, 6, -0.15F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -0.55F, -9.0F);
        this.body.addChild(body2_r1);
        this.setRotateAngle(body2_r1, 0.1047F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 34, 15, -0.5F, -0.2F, 0.1F, 1, 1, 3, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -10.0F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.0421F, 0.002F, 0.0227F);
        this.neck.cubeList.add(new ModelBox(neck, 32, 33, -0.5F, -1.29F, -2.5F, 1, 1, 4, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0F, -0.0436F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2618F, 0.0F, 0.0F);


        this.eyeright = new ModelRenderer(this);
        this.eyeright.setRotationPoint(-1.3F, -2.05F, -2.75F);
        this.head.addChild(eyeright);


        this.eyeleft = new ModelRenderer(this);
        this.eyeleft.setRotationPoint(1.3F, -2.05F, -2.75F);
        this.head.addChild(eyeleft);


        this.armleft = new ModelRenderer(this);
        this.armleft.setRotationPoint(4.25F, 2.0F, -7.75F);
        this.body.addChild(armleft);
        this.setRotateAngle(armleft, 0.0115F, 0.1304F, 0.088F);


        this.armleft2 = new ModelRenderer(this);
        this.armleft2.setRotationPoint(2.25F, -0.25F, 0.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, -0.3254F, -0.2834F, -0.0878F);


        this.handleft = new ModelRenderer(this);
        this.handleft.setRotationPoint(0.0F, 3.2239F, -0.4309F);
        this.armleft2.addChild(handleft);
        this.setRotateAngle(handleft, 0.348F, -0.0018F, -0.0094F);


        this.armright = new ModelRenderer(this);
        this.armright.setRotationPoint(-4.25F, 2.0F, -7.75F);
        this.body.addChild(armright);
        this.setRotateAngle(armright, 0.0F, 0.7854F, 0.0F);


        this.armright2 = new ModelRenderer(this);
        this.armright2.setRotationPoint(-2.25F, -0.25F, 0.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.0F, -0.1745F, 0.0F);


        this.handright = new ModelRenderer(this);
        this.handright.setRotationPoint(0.0F, 3.2239F, -0.4309F);
        this.armright2.addChild(handright);


        this.legleft = new ModelRenderer(this);
        this.legleft.setRotationPoint(1.45F, -5.05F, 6.0F);
        this.hip.addChild(legleft);
        this.setRotateAngle(legleft, -0.2024F, 0.4256F, -0.3282F);


        this.legleft2 = new ModelRenderer(this);
        this.legleft2.setRotationPoint(3.3F, 0.6F, -0.55F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, -0.0786F, 0.3405F, 0.0737F);


        this.footleft = new ModelRenderer(this);
        this.footleft.setRotationPoint(0.4578F, 4.0467F, -0.172F);
        this.legleft2.addChild(footleft);
        this.setRotateAngle(footleft, 0.0F, -1.5708F, 0.2182F);


        this.legright = new ModelRenderer(this);
        this.legright.setRotationPoint(-1.45F, -5.05F, 6.0F);
        this.hip.addChild(legright);
        this.setRotateAngle(legright, -0.0049F, 0.085F, 0.3119F);


        this.legright2 = new ModelRenderer(this);
        this.legright2.setRotationPoint(-3.3F, 0.6F, -0.55F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, -0.0786F, -0.3405F, -0.0737F);


        this.footright = new ModelRenderer(this);
        this.footright.setRotationPoint(-0.4578F, 4.0467F, -0.172F);
        this.legright2.addChild(footright);
        this.setRotateAngle(footright, 0.0F, 1.5708F, -0.2182F);

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
