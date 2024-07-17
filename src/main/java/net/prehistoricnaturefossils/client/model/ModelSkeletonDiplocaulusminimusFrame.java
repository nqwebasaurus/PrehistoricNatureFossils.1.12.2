package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDiplocaulusminimusFrame extends ModelBase {
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer forelegL;
    private final ModelRenderer forelegL2;
    private final ModelRenderer forelegL3;
    private final ModelRenderer forelegL4;
    private final ModelRenderer forelegL5;
    private final ModelRenderer forelegL6;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r3;
    private final ModelRenderer wholehead;
    private final ModelRenderer lowerhead;
    private final ModelRenderer jaw;
    private final ModelRenderer upperjaw;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r6;
    private final ModelRenderer hindlegL2;
    private final ModelRenderer hindlegL3;
    private final ModelRenderer hindlegL7;
    private final ModelRenderer hindlegL4;
    private final ModelRenderer hindlegL5;
    private final ModelRenderer hindlegL6;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonDiplocaulusminimusFrame() {
        this.textureWidth = 58;
        this.textureHeight = 50;

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 14.0F, -1.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, -0.8727F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.0003F, 1.1945F, -7.4284F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.4069F, -0.0869F, 1.5775F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 37, -1.9F, -0.5F, -3.0F, 1, 1, 6, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.1F, -0.7966F, -8.9596F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0175F, -0.096F, -0.0017F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 40, -0.4564F, -0.4825F, -0.5011F, 1, 1, 4, -0.2F, false));

        this.forelegL = new ModelRenderer(this);
        this.forelegL.setRotationPoint(2.7F, -0.322F, -7.4699F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, -0.4547F, -1.1702F, 0.7054F);


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
        this.setRotateAngle(forelegL4, -0.3797F, 1.0903F, -0.6225F);


        this.forelegL5 = new ModelRenderer(this);
        this.forelegL5.setRotationPoint(-2.65F, 0.5F, 0.2F);
        this.forelegL4.addChild(forelegL5);
        this.setRotateAngle(forelegL5, 1.1072F, -0.148F, -0.0568F);


        this.forelegL6 = new ModelRenderer(this);
        this.forelegL6.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.forelegL5.addChild(forelegL6);
        this.setRotateAngle(forelegL6, 0.0896F, -0.0132F, -0.1732F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.772F, -8.2699F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.1309F, 0.0F, -0.2618F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.1712F, -2.6401F);
        this.neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0876F, -0.0869F, -0.0076F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 37, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.2F, false));

        this.wholehead = new ModelRenderer(this);
        this.wholehead.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.neck.addChild(wholehead);
        this.setRotateAngle(wholehead, -0.0873F, 0.0F, 0.0F);


        this.lowerhead = new ModelRenderer(this);
        this.lowerhead.setRotationPoint(0.0F, 0.9F, -4.8F);
        this.wholehead.addChild(lowerhead);
        this.setRotateAngle(lowerhead, 0.5236F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.0015F, 0.948F);
        this.lowerhead.addChild(jaw);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.wholehead.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.1745F, 0.0F, 0.0F);


        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.upperjaw.addChild(bone3);


        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.upperjaw.addChild(bone4);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.272F, -6.2699F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0873F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 39, -0.5F, 0.0F, 0.1F, 1, 1, 7, -0.2F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.1F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0379F, -0.1327F, 0.044F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.9F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 39, -0.5F, 0.0044F, -1.3999F, 1, 1, 4, -0.2F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.4F);
        this.body3.addChild(body4);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.body4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 17, -0.5F, 0.1F, 0.0F, 1, 1, 4, -0.2F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.25F, 2.5F);
        this.body4.addChild(tail);
        this.setRotateAngle(tail, 0.0295F, -0.1167F, 0.1475F);
        this.tail.cubeList.add(new ModelBox(tail, 31, 32, -0.5F, 0.0064F, 0.199F, 1, 1, 7, -0.2F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.5064F, 3.699F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -1.5708F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 35, -1.5F, 0.1F, -2.0F, 1, 1, 4, -0.2F, false));

        this.hindlegL2 = new ModelRenderer(this);
        this.hindlegL2.setRotationPoint(1.5F, 0.75F, 3.3F);
        this.tail.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, -0.2587F, -0.6551F, 0.5323F);


        this.hindlegL3 = new ModelRenderer(this);
        this.hindlegL3.setRotationPoint(2.45F, 0.25F, -0.7F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.9615F, -1.0745F, 0.418F);


        this.hindlegL7 = new ModelRenderer(this);
        this.hindlegL7.setRotationPoint(1.9F, 0.0F, 0.0F);
        this.hindlegL3.addChild(hindlegL7);
        this.setRotateAngle(hindlegL7, -0.036F, -0.1371F, -1.1696F);


        this.hindlegL4 = new ModelRenderer(this);
        this.hindlegL4.setRotationPoint(-1.5F, 0.75F, 3.3F);
        this.tail.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, -0.8036F, 1.2851F, -1.1554F);


        this.hindlegL5 = new ModelRenderer(this);
        this.hindlegL5.setRotationPoint(-2.45F, 0.25F, -0.7F);
        this.hindlegL4.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 1.1982F, 0.7248F, -0.1211F);


        this.hindlegL6 = new ModelRenderer(this);
        this.hindlegL6.setRotationPoint(-1.9F, 0.0F, 0.0F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, -0.0999F, 0.1007F, 0.6435F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0436F, 6.999F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.104F, -0.1182F, -0.1371F);
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 13, -0.5F, 0.05F, -0.3F, 1, 1, 9, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0625F, 0.0F, 8.8238F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1337F, -0.3487F, -0.0159F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 18, -0.6625F, 0.3F, -0.7F, 1, 1, 12, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.35F, 10.4F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1459F, 0.2088F, 0.1312F);
        this.tail4.cubeList.add(new ModelBox(tail4, 18, 0, -0.5625F, 0.2F, 0.1F, 1, 1, 11, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0305F, 0.0F, 10.9914F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1818F, 0.4675F, 0.1386F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -0.593F, 0.2F, -0.45F, 1, 1, 15, -0.2F, false));

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
