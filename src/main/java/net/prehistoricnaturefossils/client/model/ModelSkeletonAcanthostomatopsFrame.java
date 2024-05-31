package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAcanthostomatopsFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer bone;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer upperjaw;
    private final ModelRenderer leftHead;
    private final ModelRenderer rightHead;
    private final ModelRenderer body;
    private final ModelRenderer body2;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer legL4;
    private final ModelRenderer legL5;
    private final ModelRenderer legspineL2;
    private final ModelRenderer legL6;
    private final ModelRenderer legL10;
    private final ModelRenderer legL11;
    private final ModelRenderer legspineL4;
    private final ModelRenderer legL12;
    private final ModelRenderer legL;
    private final ModelRenderer legL2;
    private final ModelRenderer legspineL;
    private final ModelRenderer legL3;
    private final ModelRenderer legL7;
    private final ModelRenderer legL8;
    private final ModelRenderer legspineL3;
    private final ModelRenderer legL9;

    public ModelSkeletonAcanthostomatopsFrame() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(2.6F, -1.25F, 10.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3927F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 11, -0.25F, -2.5F, -0.5F, 1, 5, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(2.6F, -1.25F, 10.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3927F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 4, -0.5F, -0.75F, -0.5F, 1, 2, 1, -0.21F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.4F, -1.5F, 0.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 33, -0.5F, -3.5F, -0.5F, 1, 7, 1, -0.2F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.4F, -1.5F, 0.3F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1309F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 8, -0.5F, -1.5F, -0.5F, 1, 3, 1, -0.21F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -3.125F, -3.0F);
        this.fossil.addChild(bone);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.025F, 0.7F);
        this.bone.addChild(head);
        this.setRotateAngle(head, -0.281F, 0.2879F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 32, 30, -0.5F, 0.0F, -2.1F, 1, 1, 3, -0.2F, false));

        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.65F, -1.35F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.2618F, 0.0F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.2F, -3.15F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.0405F, 0.0F, 0.0F);


        this.leftHead = new ModelRenderer(this);
        this.leftHead.setRotationPoint(0.5F, -0.65F, -4.45F);
        this.upperjaw.addChild(leftHead);
        this.setRotateAngle(leftHead, 0.0F, 0.0F, 0.0873F);


        this.rightHead = new ModelRenderer(this);
        this.rightHead.setRotationPoint(-0.5F, -0.65F, -4.45F);
        this.upperjaw.addChild(rightHead);
        this.setRotateAngle(rightHead, 0.0F, 0.0F, -0.0873F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.05F, 0.8F);
        this.bone.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.1309F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 20, -0.51F, 0.1F, 0.3F, 1, 1, 7, -0.2F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0347F, -0.2F, 6.897F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0709F, 0.1741F, -0.0123F);
        this.body2.cubeList.add(new ModelBox(body2, 14, 0, -0.5347F, 0.2903F, 0.0674F, 1, 1, 7, -0.2F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.2312F, 0.05F, 6.8172F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.1065F, 0.2604F, -0.0275F);
        this.tail.cubeList.add(new ModelBox(tail, 13, 27, -0.3038F, 0.2193F, -0.1594F, 1, 1, 4, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.1962F, -0.0066F, 2.9309F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0041F, 0.1743F, 0.0083F);
        this.tail2.cubeList.add(new ModelBox(tail2, 34, 11, -0.51F, 0.2458F, 0.5115F, 1, 1, 3, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1494F, 2.9765F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1582F, 0.217F, 0.0224F);
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 0, -0.5193F, 0.1304F, -0.0559F, 1, 1, 4, -0.2F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(1.9153F, 1.275F, 5.478F);
        this.body2.addChild(legL4);
        this.setRotateAngle(legL4, -0.0917F, 0.338F, -0.2951F);


        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(3.25F, 0.25F, 0.0F);
        this.legL4.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, -0.6109F, 0.0F);


        this.legspineL2 = new ModelRenderer(this);
        this.legspineL2.setRotationPoint(0.05F, 0.25F, 0.0F);
        this.legL5.addChild(legspineL2);
        this.setRotateAngle(legspineL2, -0.1516F, 0.3626F, -0.3928F);


        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.legspineL2.addChild(legL6);
        this.setRotateAngle(legL6, 0.1165F, 0.204F, 0.6982F);


        this.legL10 = new ModelRenderer(this);
        this.legL10.setRotationPoint(-1.9847F, 1.275F, 5.478F);
        this.body2.addChild(legL10);
        this.setRotateAngle(legL10, 0.1023F, 0.1754F, 0.3368F);


        this.legL11 = new ModelRenderer(this);
        this.legL11.setRotationPoint(-3.25F, 0.25F, 0.0F);
        this.legL10.addChild(legL11);
        this.setRotateAngle(legL11, 0.0F, 0.6109F, 0.0F);


        this.legspineL4 = new ModelRenderer(this);
        this.legspineL4.setRotationPoint(-0.05F, 0.25F, 0.0F);
        this.legL11.addChild(legspineL4);
        this.setRotateAngle(legspineL4, -0.1182F, -0.3744F, 0.3001F);


        this.legL12 = new ModelRenderer(this);
        this.legL12.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.legspineL4.addChild(legL12);
        this.setRotateAngle(legL12, 0.0981F, -0.2133F, -0.6095F);


        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(3.05F, 1.375F, 2.25F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0462F, -0.2588F, -0.1349F);


        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(3.4205F, 0.25F, -0.0003F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 1.2217F, 0.0F);


        this.legspineL = new ModelRenderer(this);
        this.legspineL.setRotationPoint(0.016F, 0.25F, -1.0428F);
        this.legL2.addChild(legspineL);
        this.setRotateAngle(legspineL, 0.0348F, -0.2308F, -0.8185F);


        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(0.85F, 2.433F, 0.1F);
        this.legspineL.addChild(legL3);
        this.setRotateAngle(legL3, 0.1027F, 0.0524F, 0.8724F);


        this.legL7 = new ModelRenderer(this);
        this.legL7.setRotationPoint(-3.05F, 1.375F, 2.25F);
        this.body.addChild(legL7);
        this.setRotateAngle(legL7, 0.0544F, 0.6074F, 0.1542F);


        this.legL8 = new ModelRenderer(this);
        this.legL8.setRotationPoint(-3.4205F, 0.25F, -0.0003F);
        this.legL7.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, -1.2217F, 0.0F);


        this.legspineL3 = new ModelRenderer(this);
        this.legspineL3.setRotationPoint(-0.016F, 0.25F, -1.0428F);
        this.legL8.addChild(legspineL3);
        this.setRotateAngle(legspineL3, -0.0524F, 0.2308F, 0.8185F);


        this.legL9 = new ModelRenderer(this);
        this.legL9.setRotationPoint(-0.85F, 2.433F, 0.1F);
        this.legspineL3.addChild(legL9);
        this.setRotateAngle(legL9, 0.1027F, -0.0524F, -0.8724F);

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
