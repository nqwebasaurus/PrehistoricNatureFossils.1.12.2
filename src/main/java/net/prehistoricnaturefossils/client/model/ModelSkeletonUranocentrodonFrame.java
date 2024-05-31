package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonUranocentrodonFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hindlegL;
    private final ModelRenderer hindlegL2;
    private final ModelRenderer hindlegL3;
    private final ModelRenderer hindlegL4;
    private final ModelRenderer hindlegL5;
    private final ModelRenderer hindlegL6;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body2;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r6;
    private final ModelRenderer forelegL4;
    private final ModelRenderer forelegL5;
    private final ModelRenderer forelegL6;
    private final ModelRenderer forelegL;
    private final ModelRenderer forelegL2;
    private final ModelRenderer forelegL3;
    private final ModelRenderer head;
    private final ModelRenderer upperjaw;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer bone;

    public ModelSkeletonUranocentrodonFrame() {
        this.textureWidth = 72;
        this.textureHeight = 65;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 5.0F, -3.0F, -14.0F, 1, 2, 1, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -15.5F, -2.0F, 8.6F, 1, 2, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-15.1F, -2.75F, 9.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -3.1416F, 1.2217F, -3.1416F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, -1, -1, -0.5F, -0.25F, -1.5F, 1, 1, 3, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(5.5F, -3.5F, -13.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.5708F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.5F, -4.5F, -0.5F, 1, 9, 1, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(-4.0F, -2.8024F, -3.435F);
        this.fossil.addChild(body4);
        this.setRotateAngle(body4, -0.0436F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-11.0F, -1.5867F, 8.3961F);
        this.body4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 29, -0.5F, 0.5F, 0.5F, 1, 1, 8, -0.02F, false));

        this.hindlegL = new ModelRenderer(this);
        this.hindlegL.setRotationPoint(-8.0F, -0.3367F, 14.6461F);
        this.body4.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 1.0472F, 0.1745F);


        this.hindlegL2 = new ModelRenderer(this);
        this.hindlegL2.setRotationPoint(4.5F, 0.0F, -0.25F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0F, -1.8762F, 0.0F);


        this.hindlegL3 = new ModelRenderer(this);
        this.hindlegL3.setRotationPoint(3.5F, 0.0F, -0.25F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, -0.0873F, 1.5708F, -0.2618F);


        this.hindlegL4 = new ModelRenderer(this);
        this.hindlegL4.setRotationPoint(-14.0F, -0.3367F, 14.6461F);
        this.body4.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, 0.0F, 0.5236F, -0.1745F);


        this.hindlegL5 = new ModelRenderer(this);
        this.hindlegL5.setRotationPoint(-4.5F, 0.0F, -0.25F);
        this.hindlegL4.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 0.0F, 1.0036F, 0.0F);


        this.hindlegL6 = new ModelRenderer(this);
        this.hindlegL6.setRotationPoint(-3.5F, 0.0F, -0.25F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, -0.0873F, -1.5708F, 0.2618F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-11.0F, -1.1367F, 16.7961F);
        this.body4.addChild(tail);
        this.setRotateAngle(tail, -0.059F, 0.4793F, -0.0272F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 44, -0.5F, 0.3996F, 0.0157F, 1, 1, 8, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1504F, 8.0157F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0504F, 0.523F, 0.0252F);
        this.tail2.cubeList.add(new ModelBox(tail2, 31, 38, -0.5F, 0.5493F, -0.5305F, 1, 1, 9, -0.01F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0507F, 7.9695F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.055F, 0.6538F, 0.0335F);
        this.tail3.cubeList.add(new ModelBox(tail3, 38, 18, -0.5F, 0.6491F, -0.0393F, 1, 1, 8, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0491F, 7.9607F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, 0.5672F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 19, 11, -0.5F, 0.55F, 0.0F, 1, 1, 12, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(-11.0F, -1.6867F, 8.8961F);
        this.body4.addChild(body3);
        this.setRotateAngle(body3, 0.0453F, -0.5232F, -0.0227F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.7008F, -9.1432F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 35, -0.5F, 0.5F, 0.0F, 1, 1, 10, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.8008F, -9.2432F);
        this.body3.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -0.2618F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 17, 25, -0.5F, 0.6F, -9.9F, 1, 1, 10, -0.01F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.2F, -9.9F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.3054F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.8F, -8.9F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 5, -0.5F, -0.1F, 0.0F, 1, 1, 10, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1F, -8.0F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0F, -0.4363F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, -7.4F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 33, -0.5F, 0.5F, -1.5F, 1, 1, 9, 0.002F, false));

        this.forelegL4 = new ModelRenderer(this);
        this.forelegL4.setRotationPoint(-4.75F, 2.6F, -0.15F);
        this.neck.addChild(forelegL4);
        this.setRotateAngle(forelegL4, 0.0F, 1.3526F, -0.1745F);


        this.forelegL5 = new ModelRenderer(this);
        this.forelegL5.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.forelegL4.addChild(forelegL5);
        this.setRotateAngle(forelegL5, 0.0F, -0.5672F, 0.0F);


        this.forelegL6 = new ModelRenderer(this);
        this.forelegL6.setRotationPoint(-3.0F, 0.0F, 0.25F);
        this.forelegL5.addChild(forelegL6);
        this.setRotateAngle(forelegL6, 0.1309F, -0.5236F, 0.0436F);


        this.forelegL = new ModelRenderer(this);
        this.forelegL.setRotationPoint(4.75F, 2.6F, -0.15F);
        this.neck.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, 0.1745F, 0.1745F);


        this.forelegL2 = new ModelRenderer(this);
        this.forelegL2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 1.1345F, 0.0F);


        this.forelegL3 = new ModelRenderer(this);
        this.forelegL3.setRotationPoint(3.0F, 0.0F, 0.25F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.1309F, 0.5236F, -0.0436F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.6F, -8.9F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.6981F, 0.0F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, -0.7F, 1.5F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.1309F, 0.0F, 0.0F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.5F, 1.5F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.7418F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 1.0F, -15.0F);
        this.lowerjaw.addChild(bone);
        this.setRotateAngle(bone, -0.0829F, 0.0F, 0.0F);

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
