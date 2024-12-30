package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonKoolasuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hindlegL;
    private final ModelRenderer hindlegL2;
    private final ModelRenderer hindlegL3;
    private final ModelRenderer hindlegL4;
    private final ModelRenderer hindlegL5;
    private final ModelRenderer hindlegL6;
    private final ModelRenderer front;
    private final ModelRenderer cube_r4;
    private final ModelRenderer front2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer forelegL;
    private final ModelRenderer forelegL2;
    private final ModelRenderer forelegL3;
    private final ModelRenderer forelegL4;
    private final ModelRenderer forelegL5;
    private final ModelRenderer forelegL6;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r7;
    private final ModelRenderer wholehead;
    private final ModelRenderer headbase;
    private final ModelRenderer headdonotmove;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;

    public ModelSkeletonKoolasuchusFrame() {
        this.textureWidth = 83;
        this.textureHeight = 83;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.9F, 16.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, -0.3043F, -0.0262F, -0.0832F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.4672F, 2.9868F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5708F, -1.4835F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 53, -1.5F, 0.2F, -3.5F, 1, 1, 7, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -5.0F, 1.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 37, 56, -0.5F, 1.85F, 0.2F, 1, 1, 4, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -6.0F, -4.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, -2, 44, -1.0F, 2.2F, -0.3F, 1, 1, 6, -0.15F, false));

        this.hindlegL = new ModelRenderer(this);
        this.hindlegL.setRotationPoint(3.736F, -1.3F, 1.6918F);
        this.body.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.5169F, -0.7135F, 1.0664F);


        this.hindlegL2 = new ModelRenderer(this);
        this.hindlegL2.setRotationPoint(3.25F, 0.0F, 0.0F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.1381F, 0.1855F, 1.3171F);


        this.hindlegL3 = new ModelRenderer(this);
        this.hindlegL3.setRotationPoint(2.9152F, -0.3068F, 0.7339F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.2182F, 0.3491F, -1.2654F);


        this.hindlegL4 = new ModelRenderer(this);
        this.hindlegL4.setRotationPoint(-3.736F, -1.3F, 1.6918F);
        this.body.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, 1.2052F, 0.7948F, 0.0402F);


        this.hindlegL5 = new ModelRenderer(this);
        this.hindlegL5.setRotationPoint(-3.25F, 0.0F, 0.0F);
        this.hindlegL4.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 0.1381F, -0.1855F, -1.3171F);


        this.hindlegL6 = new ModelRenderer(this);
        this.hindlegL6.setRotationPoint(-2.9152F, -0.3068F, 0.7339F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, 0.2182F, -0.3491F, 1.2654F);


        this.front = new ModelRenderer(this);
        this.front.setRotationPoint(0.0F, -4.0F, -4.2F);
        this.body.addChild(front);
        this.setRotateAngle(front, 0.0078F, 0.218F, 0.0446F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -2.0F, -9.8F);
        this.front.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, -1.0F, 1.75F, -0.2F, 1, 1, 10, -0.15F, false));

        this.front2 = new ModelRenderer(this);
        this.front2.setRotationPoint(0.0F, -0.4F, -9.8F);
        this.front.addChild(front2);
        this.setRotateAngle(front2, 0.0474F, 0.0872F, 0.0438F);
        this.front2.cubeList.add(new ModelBox(front2, 21, 30, -0.5F, 0.1F, -7.0F, 1, 1, 7, -0.15F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.6F, -3.8F);
        this.front2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.5708F, 1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 34, -0.5F, -0.5F, -1.1F, 1, 1, 3, -0.16F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.6F, -3.5F);
        this.front2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -1.5708F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 28, -0.8F, 1.5F, -4.5F, 1, 1, 9, -0.15F, false));

        this.forelegL = new ModelRenderer(this);
        this.forelegL.setRotationPoint(3.7739F, 2.2054F, -3.7736F);
        this.front2.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.7854F, 0.2618F);


        this.forelegL2 = new ModelRenderer(this);
        this.forelegL2.setRotationPoint(3.8067F, 0.6634F, -0.25F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, -0.0436F, 0.8727F);


        this.forelegL3 = new ModelRenderer(this);
        this.forelegL3.setRotationPoint(2.9247F, 0.1297F, 0.2784F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 1.5996F, 0.4781F, 0.1976F);


        this.forelegL4 = new ModelRenderer(this);
        this.forelegL4.setRotationPoint(-3.7739F, 2.2054F, -3.7736F);
        this.front2.addChild(forelegL4);
        this.setRotateAngle(forelegL4, 0.0F, -0.0436F, -0.2618F);


        this.forelegL5 = new ModelRenderer(this);
        this.forelegL5.setRotationPoint(-3.8067F, 0.6634F, -0.25F);
        this.forelegL4.addChild(forelegL5);
        this.setRotateAngle(forelegL5, -0.115F, -0.8893F, -0.0894F);


        this.forelegL6 = new ModelRenderer(this);
        this.forelegL6.setRotationPoint(-2.9247F, 0.1297F, 0.2784F);
        this.forelegL5.addChild(forelegL6);
        this.setRotateAngle(forelegL6, 1.2602F, 0.0198F, 0.0638F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0151F, -6.9553F);
        this.front2.addChild(neck);
        this.setRotateAngle(neck, 0.0894F, 0.2173F, 0.0193F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 6.3F, 4.1F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 39, -0.5F, -6.1F, -10.0F, 1, 1, 6, -0.15F, false));

        this.wholehead = new ModelRenderer(this);
        this.wholehead.setRotationPoint(0.0F, -0.2949F, -4.8217F);
        this.neck.addChild(wholehead);
        this.setRotateAngle(wholehead, 0.1464F, 0.0184F, 0.1356F);


        this.headbase = new ModelRenderer(this);
        this.headbase.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.wholehead.addChild(headbase);


        this.headdonotmove = new ModelRenderer(this);
        this.headdonotmove.setRotationPoint(0.0F, -1.0F, -11.25F);
        this.headbase.addChild(headdonotmove);
        this.setRotateAngle(headdonotmove, 0.1745F, 0.0F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.9368F, -0.975F, 0.1495F);
        this.headdonotmove.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.9368F, -0.975F, 0.1495F);
        this.headdonotmove.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 2.5F, 0.35F);
        this.wholehead.addChild(jaw);
        this.setRotateAngle(jaw, 0.3491F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.1315F, 4.5556F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.0011F, -0.2275F, -0.2311F);
        this.tail.cubeList.add(new ModelBox(tail, 38, 30, -0.5F, 0.35F, 0.1F, 1, 1, 7, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1691F, 6.9348F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0365F, 0.3911F, -0.0361F);
        this.tail2.cubeList.add(new ModelBox(tail2, -2, 18, -0.5F, 0.2F, -0.3F, 1, 1, 10, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1943F, 9.1299F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2691F, 0.7395F, 0.0638F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 31, -0.5F, 0.0F, -0.1F, 1, 1, 7, -0.15F, false));

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
