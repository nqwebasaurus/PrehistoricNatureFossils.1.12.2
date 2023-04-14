package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonClatrotitan extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer body;
    private final ModelRenderer forelegR;
    private final ModelRenderer forelegR2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer forelegR3;
    private final ModelRenderer forelegR4;
    private final ModelRenderer cube_r3;
    private final ModelRenderer legR2;
    private final ModelRenderer legR4;
    private final ModelRenderer legR3;
    private final ModelRenderer legR5;
    private final ModelRenderer head;
    private final ModelRenderer antennaL;
    private final ModelRenderer antennaR;
    private final ModelRenderer body2;
    private final ModelRenderer tailR;
    private final ModelRenderer forewingR;
    private final ModelRenderer forewingR2;
    private final ModelRenderer forewingR3;
    private final ModelRenderer forewingR4;

    public ModelSkeletonClatrotitan() {
        this.textureWidth = 128;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-1.1221F, 23.5F, 0.1946F);
        this.setRotateAngle(fossil, 0.0F, -0.2094F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(10.1954F, 0.0F, 9.4876F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.3614F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -26.9F, -0.5F, -8.0F, 31, 1, 32, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.7027F, -1.7F, -1.7813F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0F, 1.5708F);
        this.body.cubeList.add(new ModelBox(body, 19, 17, 0.9F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.forelegR = new ModelRenderer(this);
        this.forelegR.setRotationPoint(1.0F, 0.0F, -0.5F);
        this.body.addChild(forelegR);
        this.setRotateAngle(forelegR, -0.829F, 0.0F, 0.0F);
        this.forelegR.cubeList.add(new ModelBox(forelegR, 9, 6, 0.0F, 0.0F, 0.0F, 0, 4, 1, 0.0F, false));

        this.forelegR2 = new ModelRenderer(this);
        this.forelegR2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 1.0472F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.01F, 0.0F, 1.0F);
        this.forelegR2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.48F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 17, 0.0F, 0.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.forelegR3 = new ModelRenderer(this);
        this.forelegR3.setRotationPoint(1.0F, 0.0F, -0.5F);
        this.body.addChild(forelegR3);
        this.setRotateAngle(forelegR3, -1.7017F, 0.0F, 0.0F);
        this.forelegR3.cubeList.add(new ModelBox(forelegR3, 9, 0, 0.1F, 0.0F, 0.0F, 0, 4, 1, 0.0F, false));

        this.forelegR4 = new ModelRenderer(this);
        this.forelegR4.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.forelegR3.addChild(forelegR4);
        this.setRotateAngle(forelegR4, 1.0472F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.01F, 0.0F, 1.0F);
        this.forelegR4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 17, 0.1F, 0.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.legR2 = new ModelRenderer(this);
        this.legR2.setRotationPoint(0.8F, 0.1F, 1.15F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.6545F, 0.0F, 3.1416F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 17, -0.265F, -5.076F, -0.1684F, 0, 5, 4, 0.0F, false));

        this.legR4 = new ModelRenderer(this);
        this.legR4.setRotationPoint(0.8F, 0.1F, 1.15F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 1.5708F, 0.0F, 3.1416F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 17, -0.27F, -5.076F, -0.1684F, 0, 5, 4, 0.0F, false));

        this.legR3 = new ModelRenderer(this);
        this.legR3.setRotationPoint(0.0F, 0.5F, 1.45F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.2172F, 0.0F, -3.1416F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 0, -1.078F, -4.9021F, -0.1405F, 0, 5, 4, 0.0F, false));

        this.legR5 = new ModelRenderer(this);
        this.legR5.setRotationPoint(0.0F, 0.5F, 1.45F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 1.0899F, 0.0F, -3.1416F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 0, -1.078F, -4.9021F, -0.1405F, 0, 5, 4, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 0, 1.01F, 0.0F, -1.0F, 0, 2, 1, 0.0F, false));

        this.antennaL = new ModelRenderer(this);
        this.antennaL.setRotationPoint(1.1F, 0.0F, -0.75F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.6545F, 0.0F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 54, 35, 0.0F, -4.0F, 0.0F, 0, 4, 12, 0.0F, false));

        this.antennaR = new ModelRenderer(this);
        this.antennaR.setRotationPoint(1.0F, 0.0F, -0.75F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0873F, 0.0F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 0, -0.0406F, -4.0F, 0.0F, 0, 4, 12, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, 1.5F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 13, 0, 1.01F, 0.0F, 0.0F, 0, 2, 6, 0.0F, false));

        this.tailR = new ModelRenderer(this);
        this.tailR.setRotationPoint(1.05F, 1.0F, 6.0F);
        this.body2.addChild(tailR);
        this.tailR.cubeList.add(new ModelBox(tailR, 5, 0, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.forewingR = new ModelRenderer(this);
        this.forewingR.setRotationPoint(0.9F, -0.5F, -0.5F);
        this.body.addChild(forewingR);
        this.setRotateAngle(forewingR, 0.0F, -0.1745F, 1.5708F);
        this.forewingR.cubeList.add(new ModelBox(forewingR, 33, 47, -2.0F, -0.113F, 0.0F, 4, 0, 12, 0.0F, false));

        this.forewingR2 = new ModelRenderer(this);
        this.forewingR2.setRotationPoint(0.9F, -0.8F, -0.5F);
        this.body.addChild(forewingR2);
        this.setRotateAngle(forewingR2, 0.0F, -0.6109F, 1.5708F);
        this.forewingR2.cubeList.add(new ModelBox(forewingR2, 0, 47, -1.0F, -0.115F, 0.0F, 4, 0, 12, 0.0F, false));

        this.forewingR3 = new ModelRenderer(this);
        this.forewingR3.setRotationPoint(0.9F, -0.8F, -0.5F);
        this.body.addChild(forewingR3);
        this.setRotateAngle(forewingR3, 0.0F, 0.2182F, 1.5708F);
        this.forewingR3.cubeList.add(new ModelBox(forewingR3, 33, 34, -3.0F, -0.115F, 0.0F, 4, 0, 12, 0.0F, false));

        this.forewingR4 = new ModelRenderer(this);
        this.forewingR4.setRotationPoint(0.9F, 0.6F, -0.5F);
        this.body.addChild(forewingR4);
        this.setRotateAngle(forewingR4, 0.0F, -0.7418F, 1.5708F);
        this.forewingR4.cubeList.add(new ModelBox(forewingR4, 0, 34, -3.0F, -0.1F, 0.0F, 4, 0, 12, 0.0F, false));

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
