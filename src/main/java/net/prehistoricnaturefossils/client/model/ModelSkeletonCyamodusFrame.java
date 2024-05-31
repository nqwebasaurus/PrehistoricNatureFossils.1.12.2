package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCyamodusFrame extends ModelBase {
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r3;
    private final ModelRenderer head;
    private final ModelRenderer upperjaw;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer hindlegL;
    private final ModelRenderer hindlegL2;
    private final ModelRenderer hindlegL3;
    private final ModelRenderer hindlegL4;
    private final ModelRenderer hindlegL5;
    private final ModelRenderer hindlegL6;
    private final ModelRenderer forelegL;
    private final ModelRenderer forelegL2;
    private final ModelRenderer forelegL3;
    private final ModelRenderer forelegL4;
    private final ModelRenderer forelegL5;
    private final ModelRenderer forelegL6;

    public ModelSkeletonCyamodusFrame() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.0F, -2.4F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.5672F);
        this.body.cubeList.add(new ModelBox(body, 0, 15, -1.0F, 0.4F, -9.0F, 2, 1, 13, -0.1F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.1042F, 2.4F, -7.1909F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5533F, -1.3963F, 3.1416F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 27, -0.5F, -0.5F, 0.3F, 1, 1, 1, -0.1F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.4F, -6.6F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -3.1241F, -1.3963F, 3.1416F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 4, 19, -1.1F, -0.5F, -4.5F, 1, 1, 9, -0.1F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.2F, -9.1F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0385F, -0.2148F, -0.1787F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.2F, -3.5F);
        this.neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 7, -1.0F, 0.71F, -0.25F, 2, 1, 4, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.2F, -3.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.3799F, -0.0543F, 0.2043F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, -0.9F, 0.0F);
        this.head.addChild(upperjaw);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.6545F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.1F, 3.9F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 52, -1.0F, 0.5F, -0.6F, 2, 1, 3, -0.1F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.0333F, 3.5872F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1991F, -1.3484F, 0.1943F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 44, -0.7F, -0.5F, -3.0F, 1, 1, 6, -0.1F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.2F, 2.1F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 44, -1.0F, 0.6663F, -0.1168F, 2, 1, 6, -0.1F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.15F, 7.4F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.0452F, -0.2615F, 0.0117F);
        this.tail.cubeList.add(new ModelBox(tail, 36, 22, -0.5F, 0.4738F, -0.4006F, 1, 1, 9, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0262F, 7.8994F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0447F, -0.218F, -0.0097F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 43, -0.5F, 0.5187F, -0.3002F, 1, 1, 7, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0087F, 6.0998F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, -0.3491F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 43, -0.5F, 0.5F, -0.4F, 1, 1, 7, -0.1F, false));

        this.hindlegL = new ModelRenderer(this);
        this.hindlegL.setRotationPoint(2.0F, 1.35F, 4.0F);
        this.body2.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 0.5236F, 0.4363F);


        this.hindlegL2 = new ModelRenderer(this);
        this.hindlegL2.setRotationPoint(3.4F, 0.0F, -0.45F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0F, -0.48F, 0.0F);


        this.hindlegL3 = new ModelRenderer(this);
        this.hindlegL3.setRotationPoint(3.0F, 0.5F, -0.5F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.0F, 0.5672F, 0.0F);


        this.hindlegL4 = new ModelRenderer(this);
        this.hindlegL4.setRotationPoint(-2.0F, 1.35F, 4.0F);
        this.body2.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, 0.0F, 0.5672F, -0.4363F);


        this.hindlegL5 = new ModelRenderer(this);
        this.hindlegL5.setRotationPoint(-3.4F, 0.0F, -0.45F);
        this.hindlegL4.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 0.0F, 1.0036F, 0.0F);


        this.hindlegL6 = new ModelRenderer(this);
        this.hindlegL6.setRotationPoint(-3.0F, 0.5F, -0.5F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, 0.0F, -0.4363F, 0.0F);


        this.forelegL = new ModelRenderer(this);
        this.forelegL.setRotationPoint(4.0F, 1.55F, -6.6F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -1.0908F, 0.4363F);


        this.forelegL2 = new ModelRenderer(this);
        this.forelegL2.setRotationPoint(3.0F, 0.0F, -0.25F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 0.6545F, 0.0F);


        this.forelegL3 = new ModelRenderer(this);
        this.forelegL3.setRotationPoint(3.0F, 0.0F, -0.5F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.0F, -0.3927F, 0.0F);


        this.forelegL4 = new ModelRenderer(this);
        this.forelegL4.setRotationPoint(-4.0F, 1.55F, -6.6F);
        this.body.addChild(forelegL4);
        this.setRotateAngle(forelegL4, 0.0F, -0.7418F, -0.4363F);


        this.forelegL5 = new ModelRenderer(this);
        this.forelegL5.setRotationPoint(-3.0F, 0.0F, -0.25F);
        this.forelegL4.addChild(forelegL5);
        this.setRotateAngle(forelegL5, 0.0F, -0.9599F, 0.0F);


        this.forelegL6 = new ModelRenderer(this);
        this.forelegL6.setRotationPoint(-3.0F, 0.0F, -0.5F);
        this.forelegL5.addChild(forelegL6);
        this.setRotateAngle(forelegL6, 0.0F, 0.4363F, 0.0F);

    }

    public void renderAll(float f) {
        this.body.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
