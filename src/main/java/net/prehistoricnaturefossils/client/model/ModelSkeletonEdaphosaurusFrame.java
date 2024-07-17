package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEdaphosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body;
    private final ModelRenderer cube_r3;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r4;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer hindlegL;
    private final ModelRenderer hindlegL1;
    private final ModelRenderer hindlegL2;
    private final ModelRenderer hindlegL3;
    private final ModelRenderer hindlegL6;
    private final ModelRenderer hindlegL7;
    private final ModelRenderer hindlegL8;
    private final ModelRenderer hindlegL9;
    private final ModelRenderer hindlegL5;
    private final ModelRenderer hindlegL4;
    private final ModelRenderer frontlegL;
    private final ModelRenderer frontlegL1;
    private final ModelRenderer frontlegL2;
    private final ModelRenderer frontlegL3;
    private final ModelRenderer frontlegL6;
    private final ModelRenderer frontlegL7;
    private final ModelRenderer frontlegL8;
    private final ModelRenderer frontlegL9;
    private final ModelRenderer frontlegL5;
    private final ModelRenderer frontlegL4;

    public ModelSkeletonEdaphosaurusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 0.0F, -9.0F, 12.5F, 1, 9, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 2.7F, -14.0F, -14.4F, 1, 14, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(3.2F, -9.0F, -13.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.7F, -5.0F, -0.5F, 1, 10, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -7.0F, 13.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.5F, -3.0F, -0.5F, 1, 7, 1, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(3.0F, -14.4F, -9.75F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.0436F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 26, -0.5F, -0.45F, -1.2F, 1, 1, 9, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.65F, -7.5F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2094F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 12, -0.5F, 0.3128F, -0.2962F, 1, 1, 7, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.65F, -7.5F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.2618F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.2389F, -2.7671F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 46, -0.5F, 0.3F, -1.8F, 1, 1, 5, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.6F, -4.75F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0005F, 0.0865F, 0.0114F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.4F, -0.6F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.8727F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.0F, 6.9F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.1314F, -0.0865F, 0.0114F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 3.2666F, 17.0834F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1658F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 46, -0.5F, 0.2F, -2.0F, 1, 1, 5, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 2.3001F, 14.6721F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 28, 0.0F, 0.5319F, -6.7235F, 1, 1, 8, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.3999F, 8.3721F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 15, 0.0F, 0.5655F, -7.84F, 1, 1, 8, -0.15F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 3.5501F, 19.3221F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, 0.1162F, -0.2167F, -0.0251F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0817F, -0.8709F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 13, -0.5F, 0.1F, 1.0F, 1, 1, 11, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.5817F, 11.0291F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.3894F, -0.4488F, 0.1762F);
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 0, -0.5F, 0.1681F, -0.3026F, 1, 1, 9, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0319F, 8.9974F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1064F, -0.6082F, 0.061F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.1005F, -0.2218F);
        this.tail3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0174F, 0.0015F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 2, -0.6F, 0.1F, -0.5F, 1, 1, 11, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.9995F, 9.7782F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0935F, -0.609F, -0.2567F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.3087F, -0.1416F, 1, 1, 11, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.2087F, 10.7584F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0436F, -0.5236F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 16, 17, -0.5F, 0.1F, -0.3F, 1, 1, 9, -0.15F, false));

        this.hindlegL = new ModelRenderer(this);
        this.hindlegL.setRotationPoint(2.5F, 6.1001F, 7.2721F);
        this.body2.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 0.3491F, 0.0F);


        this.hindlegL1 = new ModelRenderer(this);
        this.hindlegL1.setRotationPoint(-2.8191F, 0.0F, 9.4739F);
        this.hindlegL.addChild(hindlegL1);
        this.setRotateAngle(hindlegL1, 0.3094F, 0.3725F, -1.1149F);


        this.hindlegL2 = new ModelRenderer(this);
        this.hindlegL2.setRotationPoint(-0.7214F, 3.7443F, -0.1F);
        this.hindlegL1.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, -0.3645F, 0.5945F, 1.113F);


        this.hindlegL3 = new ModelRenderer(this);
        this.hindlegL3.setRotationPoint(0.4753F, 3.9734F, 0.5618F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, -0.0477F, -1.5134F, 0.0153F);


        this.hindlegL6 = new ModelRenderer(this);
        this.hindlegL6.setRotationPoint(-2.5F, 6.1001F, 7.2721F);
        this.body2.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, 0.0F, -0.3491F, 0.0F);


        this.hindlegL7 = new ModelRenderer(this);
        this.hindlegL7.setRotationPoint(2.8191F, 0.0F, 9.4739F);
        this.hindlegL6.addChild(hindlegL7);
        this.setRotateAngle(hindlegL7, -0.7089F, -0.3089F, 1.393F);


        this.hindlegL8 = new ModelRenderer(this);
        this.hindlegL8.setRotationPoint(0.7214F, 3.7443F, -0.1F);
        this.hindlegL7.addChild(hindlegL8);
        this.setRotateAngle(hindlegL8, -0.1241F, -0.1058F, -1.0456F);


        this.hindlegL9 = new ModelRenderer(this);
        this.hindlegL9.setRotationPoint(-0.4753F, 3.9734F, 0.5618F);
        this.hindlegL8.addChild(hindlegL9);
        this.setRotateAngle(hindlegL9, 0.4759F, 1.5134F, -0.0153F);


        this.hindlegL5 = new ModelRenderer(this);
        this.hindlegL5.setRotationPoint(-2.5F, 6.1001F, 7.2721F);
        this.body2.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 0.0F, -0.3491F, 0.0F);


        this.hindlegL4 = new ModelRenderer(this);
        this.hindlegL4.setRotationPoint(-2.5F, 6.1001F, 7.2721F);
        this.body2.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, 0.0F, -0.3491F, 0.0F);


        this.frontlegL = new ModelRenderer(this);
        this.frontlegL.setRotationPoint(3.0F, 5.5F, -5.5F);
        this.body.addChild(frontlegL);
        this.setRotateAngle(frontlegL, 0.0F, -0.6981F, 0.0F);


        this.frontlegL1 = new ModelRenderer(this);
        this.frontlegL1.setRotationPoint(1.9669F, 0.5F, -0.4626F);
        this.frontlegL.addChild(frontlegL1);
        this.setRotateAngle(frontlegL1, -0.774F, 0.4326F, -0.6756F);


        this.frontlegL2 = new ModelRenderer(this);
        this.frontlegL2.setRotationPoint(-0.4172F, 4.5801F, -0.4785F);
        this.frontlegL1.addChild(frontlegL2);
        this.setRotateAngle(frontlegL2, -0.481F, 0.0925F, 0.6746F);


        this.frontlegL3 = new ModelRenderer(this);
        this.frontlegL3.setRotationPoint(-0.5023F, 3.8214F, -0.0899F);
        this.frontlegL2.addChild(frontlegL3);
        this.setRotateAngle(frontlegL3, 1.1421F, -0.0945F, -0.1006F);


        this.frontlegL6 = new ModelRenderer(this);
        this.frontlegL6.setRotationPoint(-3.0F, 5.5F, -5.5F);
        this.body.addChild(frontlegL6);
        this.setRotateAngle(frontlegL6, 0.0F, 0.6981F, 0.0F);


        this.frontlegL7 = new ModelRenderer(this);
        this.frontlegL7.setRotationPoint(-1.9669F, 0.5F, -0.4626F);
        this.frontlegL6.addChild(frontlegL7);
        this.setRotateAngle(frontlegL7, 0.3605F, -0.4326F, 0.6756F);


        this.frontlegL8 = new ModelRenderer(this);
        this.frontlegL8.setRotationPoint(0.4172F, 4.5801F, -0.4785F);
        this.frontlegL7.addChild(frontlegL8);
        this.setRotateAngle(frontlegL8, -0.6753F, -0.2851F, -0.5701F);


        this.frontlegL9 = new ModelRenderer(this);
        this.frontlegL9.setRotationPoint(0.5023F, 3.8214F, -0.0899F);
        this.frontlegL8.addChild(frontlegL9);
        this.setRotateAngle(frontlegL9, 0.1309F, 0.0F, 0.0F);


        this.frontlegL5 = new ModelRenderer(this);
        this.frontlegL5.setRotationPoint(-3.0F, 5.5F, -5.5F);
        this.body.addChild(frontlegL5);
        this.setRotateAngle(frontlegL5, 0.0F, 0.6981F, 0.0F);


        this.frontlegL4 = new ModelRenderer(this);
        this.frontlegL4.setRotationPoint(-3.0F, 5.5F, -5.5F);
        this.body.addChild(frontlegL4);
        this.setRotateAngle(frontlegL4, 0.0F, 0.6981F, 0.0F);

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
