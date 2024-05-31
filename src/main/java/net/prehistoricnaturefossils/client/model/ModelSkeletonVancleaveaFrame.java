package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonVancleaveaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hindlegL;
    private final ModelRenderer hindlegL2;
    private final ModelRenderer hindlegL3;
    private final ModelRenderer hindlegL5;
    private final ModelRenderer hindlegL4;
    private final ModelRenderer hindlegL6;
    private final ModelRenderer hindlegL7;
    private final ModelRenderer hindlegR;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer head;
    private final ModelRenderer upperjaw;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer bone;
    private final ModelRenderer forelegL;
    private final ModelRenderer forelegL2;
    private final ModelRenderer forelegL3;
    private final ModelRenderer forelegL5;
    private final ModelRenderer forelegL4;
    private final ModelRenderer forelegL6;
    private final ModelRenderer forelegL7;
    private final ModelRenderer forelegR;

    public ModelSkeletonVancleaveaFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -13.5F, 1.5F);
        this.fossil.addChild(body);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.4F, -4.6F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0349F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 31, -1.0F, 0.6F, 1.0F, 1, 1, 11, -0.1F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.25F, 7.5F);
        this.body.addChild(body3);
        this.setRotateAngle(body3, 0.0F, -0.0873F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.2733F, 2.0498F, 6.1013F);
        this.body3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1136F, 0.0434F, -0.0049F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 13, -0.5F, -0.1604F, -6.4807F, 1, 1, 7, -0.1F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.2733F, 0.05F, -1.2F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1134F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 53, 19, -2.5F, 3.0F, 5.0F, 3, 1, 1, -0.1F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 53, 19, -1.5F, 1.0F, 5.0F, 1, 3, 1, -0.11F, false));

        this.hindlegL = new ModelRenderer(this);
        this.hindlegL.setRotationPoint(3.75F, 2.7F, 5.0F);
        this.body3.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 0.5672F, 0.0F);


        this.hindlegL2 = new ModelRenderer(this);
        this.hindlegL2.setRotationPoint(-0.8F, 1.1F, -0.75F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 1.3706F, -0.4347F, -0.2377F);


        this.hindlegL3 = new ModelRenderer(this);
        this.hindlegL3.setRotationPoint(0.1756F, 6.2627F, 0.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.0F, 0.0F, 0.5236F);


        this.hindlegL5 = new ModelRenderer(this);
        this.hindlegL5.setRotationPoint(-0.25F, 4.0F, 0.0F);
        this.hindlegL3.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, -1.8762F, -1.5272F, -3.1416F);


        this.hindlegL4 = new ModelRenderer(this);
        this.hindlegL4.setRotationPoint(-4.7657F, 1.2F, -3.7862F);
        this.hindlegL.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, 1.3308F, -1.0024F, -0.1929F);


        this.hindlegL6 = new ModelRenderer(this);
        this.hindlegL6.setRotationPoint(-0.1756F, 6.2627F, 0.0F);
        this.hindlegL4.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, 0.0F, 0.0F, -0.5236F);


        this.hindlegL7 = new ModelRenderer(this);
        this.hindlegL7.setRotationPoint(0.25F, 4.0F, 0.0F);
        this.hindlegL6.addChild(hindlegL7);
        this.setRotateAngle(hindlegL7, -1.8762F, 1.5272F, 3.1416F);


        this.hindlegR = new ModelRenderer(this);
        this.hindlegR.setRotationPoint(-3.75F, 2.7F, 5.0F);
        this.body3.addChild(hindlegR);
        this.setRotateAngle(hindlegR, 0.0F, -0.5672F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.0F, 6.4F);
        this.body3.addChild(tail1);
        this.setRotateAngle(tail1, -0.0876F, -0.0869F, 0.0076F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.6619F, 0.3395F, -0.2302F);
        this.tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 44, -1.9F, 0.6514F, -0.0152F, 1, 1, 7, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.4083F, 7.6008F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0894F, -0.2173F, 0.0193F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.1464F, 1.0913F, 12.1305F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0611F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -2, 14, -0.6F, -0.5F, -13.4F, 1, 1, 14, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1027F, 12.561F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0886F, 0.1739F, 0.0154F);
        this.tail3.cubeList.add(new ModelBox(tail3, 34, 20, -0.5F, 0.6485F, -0.1046F, 1, 1, 10, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1973F, 9.9216F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0928F, 0.3477F, 0.0317F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, 11.5F);
        this.tail4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0175F, -0.0175F, 0.0003F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 20, -0.5F, -0.5F, -11.8F, 1, 1, 12, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 11.4F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0944F, 0.3911F, 0.0361F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -0.5F, 0.519F, -0.2205F, 1, 1, 14, -0.1F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.35F, -3.3F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.2618F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 51, 28, -0.3404F, 1.55F, -14.5F, 1, 1, 8, -0.1F, false));
        this.body2.cubeList.add(new ModelBox(body2, 58, 35, -0.3404F, 1.55F, -11.5F, 1, 5, 1, -0.11F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.1596F, 5.55F, -11.0F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 58, 35, -1.5F, -4.0F, -0.5F, 1, 8, 1, -0.1F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.55F, -7.8F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0175F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 33, 0.125F, 1.0F, 1.0F, 1, 1, 7, -0.1F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.65F, -13.2F);
        this.body2.addChild(neck1);
        this.setRotateAngle(neck1, -0.3415F, 0.456F, -0.1553F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.181F, 0.3578F, -7.9606F);
        this.neck1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.035F, 0.0523F, 0.0018F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, -1, 44, -0.75F, 0.8771F, 0.76F, 1, 1, 7, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0578F, -6.9606F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.0042F, 0.3084F, 0.1235F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.6113F, -3.9402F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0698F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 58, -0.25F, 0.8239F, -0.9812F, 1, 1, 5, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.2113F, -4.2402F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.0303F, 0.3273F, 0.1657F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 2.2173F, -0.4872F);
        this.head.addChild(upperjaw);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 2.2173F, -0.4872F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.2618F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(-1.0F, 1.525F, 2.0F);
        this.lowerjaw.addChild(bone);
        this.setRotateAngle(bone, 0.0262F, 0.0F, 0.0F);


        this.forelegL = new ModelRenderer(this);
        this.forelegL.setRotationPoint(3.5F, 5.35F, -11.7F);
        this.body2.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.5236F, 0.0F);


        this.forelegL2 = new ModelRenderer(this);
        this.forelegL2.setRotationPoint(0.25F, 0.5F, -0.166F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 1.1663F, 0.5585F, -0.4363F);


        this.forelegL3 = new ModelRenderer(this);
        this.forelegL3.setRotationPoint(0.415F, 3.8533F, -0.035F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, -0.409F, 0.1539F, 0.0888F);


        this.forelegL5 = new ModelRenderer(this);
        this.forelegL5.setRotationPoint(-0.25F, 3.0F, 0.0F);
        this.forelegL3.addChild(forelegL5);
        this.setRotateAngle(forelegL5, 0.0F, 0.0F, 1.6581F);


        this.forelegL4 = new ModelRenderer(this);
        this.forelegL4.setRotationPoint(-6.116F, 0.5F, 3.7981F);
        this.forelegL.addChild(forelegL4);
        this.setRotateAngle(forelegL4, 1.4428F, 0.2252F, 0.1901F);


        this.forelegL6 = new ModelRenderer(this);
        this.forelegL6.setRotationPoint(-0.415F, 3.8533F, -0.035F);
        this.forelegL4.addChild(forelegL6);
        this.setRotateAngle(forelegL6, -0.255F, 0.0651F, -0.228F);


        this.forelegL7 = new ModelRenderer(this);
        this.forelegL7.setRotationPoint(0.25F, 3.0F, 0.0F);
        this.forelegL6.addChild(forelegL7);
        this.setRotateAngle(forelegL7, 0.0F, 0.0F, -1.6581F);


        this.forelegR = new ModelRenderer(this);
        this.forelegR.setRotationPoint(-3.5F, 5.35F, -11.7F);
        this.body2.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.0F, 0.5236F, 0.0F);

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
