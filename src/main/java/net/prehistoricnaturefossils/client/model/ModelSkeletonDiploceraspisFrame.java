package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDiploceraspisFrame extends ModelBase {
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer forelegL;
    private final ModelRenderer forelegL2;
    private final ModelRenderer forelegL3;
    private final ModelRenderer forelegL4;
    private final ModelRenderer forelegL5;
    private final ModelRenderer forelegL6;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r4;
    private final ModelRenderer wholehead;
    private final ModelRenderer lowerhead;
    private final ModelRenderer jaw;
    private final ModelRenderer upperjaw;
    private final ModelRenderer bone4;
    private final ModelRenderer bone2;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r7;
    private final ModelRenderer hindlegL2;
    private final ModelRenderer hindlegL3;
    private final ModelRenderer hindlegL7;
    private final ModelRenderer hindlegL4;
    private final ModelRenderer hindlegL5;
    private final ModelRenderer hindlegL6;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonDiploceraspisFrame() {
        this.textureWidth = 55;
        this.textureHeight = 50;

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 14.0F, -1.0F);
        this.setRotateAngle(body, -0.5672F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.1979F, -7.0247F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5708F, 0.0175F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 34, 0.8F, -0.5F, -3.0F, 1, 1, 6, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.8018F, -7.0596F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.5533F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 39, -0.5F, -0.5F, 0.0F, 1, 1, 1, -0.21F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.372F, -9.3699F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0175F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 36, -0.5F, 0.1F, -0.3F, 1, 1, 4, -0.2F, false));

        this.forelegL = new ModelRenderer(this);
        this.forelegL.setRotationPoint(2.7F, -0.322F, -7.4699F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, -0.2599F, -0.8412F, 0.4781F);


        this.forelegL2 = new ModelRenderer(this);
        this.forelegL2.setRotationPoint(2.65F, 0.5F, 0.2F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 1.1072F, 0.148F, 0.0568F);


        this.forelegL3 = new ModelRenderer(this);
        this.forelegL3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.0896F, 0.0132F, 0.1732F);


        this.forelegL4 = new ModelRenderer(this);
        this.forelegL4.setRotationPoint(-2.7F, -0.322F, -7.4699F);
        this.body.addChild(forelegL4);
        this.setRotateAngle(forelegL4, 0.2665F, 0.629F, -0.4093F);


        this.forelegL5 = new ModelRenderer(this);
        this.forelegL5.setRotationPoint(-2.65F, 0.5F, 0.2F);
        this.forelegL4.addChild(forelegL5);
        this.setRotateAngle(forelegL5, 1.0443F, -0.4948F, 0.1388F);


        this.forelegL6 = new ModelRenderer(this);
        this.forelegL6.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.forelegL5.addChild(forelegL6);
        this.setRotateAngle(forelegL6, 0.0905F, 0.0026F, -0.3471F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.772F, -8.2699F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 7, -0.5F, 0.2F, -1.0F, 1, 1, 3, -0.2F, false));

        this.wholehead = new ModelRenderer(this);
        this.wholehead.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.neck.addChild(wholehead);
        this.setRotateAngle(wholehead, 0.3491F, 0.0F, 0.0F);


        this.lowerhead = new ModelRenderer(this);
        this.lowerhead.setRotationPoint(0.0F, 0.9F, -4.9F);
        this.wholehead.addChild(lowerhead);
        this.setRotateAngle(lowerhead, 0.48F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0029F, 1.0479F);
        this.lowerhead.addChild(jaw);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.wholehead.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.1745F, 0.0F, 0.0F);


        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.upperjaw.addChild(bone4);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.upperjaw.addChild(bone2);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.272F, -6.2699F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.1309F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 30, 30, -0.5F, 0.0F, -0.1F, 1, 1, 7, -0.2F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.1F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0436F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.9F);
        this.body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 39, -0.5F, 0.0044F, -1.4999F, 1, 1, 4, -0.2F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.4F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.0873F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.body4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 18, -0.5F, 0.1F, 0.1F, 1, 1, 3, -0.2F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.25F, 2.5F);
        this.body4.addChild(tail);
        this.setRotateAngle(tail, 0.0892F, 0.0075F, 0.0104F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 30, -0.5F, 0.0064F, -0.401F, 1, 1, 7, -0.2F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 4.1064F, 3.099F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.5708F, 0.0F, 1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 1, 31, -3.5F, -0.5F, -2.5F, 1, 1, 5, -0.2F, false));

        this.hindlegL2 = new ModelRenderer(this);
        this.hindlegL2.setRotationPoint(1.5F, 0.75F, 3.3F);
        this.tail.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, -0.6296F, -1.219F, 0.9723F);


        this.hindlegL3 = new ModelRenderer(this);
        this.hindlegL3.setRotationPoint(2.45F, 0.25F, -0.7F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 1.2654F, -0.4363F, 0.0F);


        this.hindlegL7 = new ModelRenderer(this);
        this.hindlegL7.setRotationPoint(1.9F, 0.0F, 0.0F);
        this.hindlegL3.addChild(hindlegL7);
        this.setRotateAngle(hindlegL7, -0.135F, -0.0434F, -0.1656F);


        this.hindlegL4 = new ModelRenderer(this);
        this.hindlegL4.setRotationPoint(-1.5F, 0.75F, 3.3F);
        this.tail.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, -0.6296F, 1.219F, -0.9723F);


        this.hindlegL5 = new ModelRenderer(this);
        this.hindlegL5.setRotationPoint(-2.45F, 0.25F, -0.7F);
        this.hindlegL4.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 1.2654F, 0.4363F, 0.0F);


        this.hindlegL6 = new ModelRenderer(this);
        this.hindlegL6.setRotationPoint(-1.9F, 0.0F, 0.0F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, -0.135F, 0.0434F, 0.1656F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0436F, 6.999F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2196F, 0.1289F, 0.0229F);
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 15, -0.5F, -0.05F, -1.0F, 1, 1, 10, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0625F, 0.0F, 8.8238F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1806F, 0.2577F, 0.0465F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.tail3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 0, -0.5625F, 0.2F, -0.5F, 1, 1, 11, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.35F, 10.4F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1666F, 0.4263F, 0.0634F);
        this.tail4.cubeList.add(new ModelBox(tail4, -1, 16, -0.5625F, 0.1F, -0.4F, 1, 1, 12, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0305F, 0.0F, 10.9914F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0633F, 0.5618F, 0.083F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -0.593F, 0.1F, 0.05F, 1, 1, 15, -0.2F, false));

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
