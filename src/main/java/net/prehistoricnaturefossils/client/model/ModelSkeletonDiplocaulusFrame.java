package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDiplocaulusFrame extends ModelBase {
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer forelegL;
    private final ModelRenderer forelegL2;
    private final ModelRenderer forelegL3;
    private final ModelRenderer forelegL4;
    private final ModelRenderer forelegL5;
    private final ModelRenderer forelegL6;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r2;
    private final ModelRenderer wholehead;
    private final ModelRenderer lowerhead;
    private final ModelRenderer jaw;
    private final ModelRenderer upperjaw;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer hindlegL;
    private final ModelRenderer hindlegL2;
    private final ModelRenderer hindlegL3;
    private final ModelRenderer hindlegL4;
    private final ModelRenderer hindlegL5;
    private final ModelRenderer hindlegL6;

    public ModelSkeletonDiplocaulusFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 14.0F, -1.0F);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.372F, -9.2699F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0175F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 6, -0.5F, 0.2004F, 0.0122F, 1, 1, 4, -0.2F, false));

        this.forelegL = new ModelRenderer(this);
        this.forelegL.setRotationPoint(2.4F, -0.022F, -8.1699F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, -0.2427F, -0.5156F, 0.5457F);


        this.forelegL2 = new ModelRenderer(this);
        this.forelegL2.setRotationPoint(1.65F, 0.0F, 0.0F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0549F, 0.2387F, 0.1173F);


        this.forelegL3 = new ModelRenderer(this);
        this.forelegL3.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.8637F, -0.3318F, 0.1302F);


        this.forelegL4 = new ModelRenderer(this);
        this.forelegL4.setRotationPoint(-2.4F, -0.022F, -8.1699F);
        this.body.addChild(forelegL4);
        this.setRotateAngle(forelegL4, 0.0983F, -0.6042F, -0.5525F);


        this.forelegL5 = new ModelRenderer(this);
        this.forelegL5.setRotationPoint(-1.65F, 0.0F, 0.0F);
        this.forelegL4.addChild(forelegL5);
        this.setRotateAngle(forelegL5, -0.0837F, -0.5206F, 0.2556F);


        this.forelegL6 = new ModelRenderer(this);
        this.forelegL6.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.forelegL5.addChild(forelegL6);
        this.setRotateAngle(forelegL6, 0.0685F, -0.0592F, 0.3925F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.772F, -8.2699F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.0876F, -0.1795F, -0.0184F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 41, -0.4948F, 0.3002F, -0.9921F, 1, 1, 4, -0.2F, false));

        this.wholehead = new ModelRenderer(this);
        this.wholehead.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.neck.addChild(wholehead);
        this.setRotateAngle(wholehead, 0.016F, -0.0425F, 0.2173F);


        this.lowerhead = new ModelRenderer(this);
        this.lowerhead.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.wholehead.addChild(lowerhead);
        this.setRotateAngle(lowerhead, 0.1745F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.25F, -3.0F);
        this.lowerhead.addChild(jaw);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.wholehead.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.1745F, 0.0F, 0.0F);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.upperjaw.addChild(bone2);


        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.upperjaw.addChild(bone3);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.272F, -6.2699F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0438F, 0.1309F, 0.0019F);
        this.body2.cubeList.add(new ModelBox(body2, 30, 9, -0.5015F, 0.1008F, 0.0173F, 1, 1, 8, -0.2F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.1F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0441F, 0.1744F, 0.0039F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.9F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 26, -0.5053F, 0.1008F, -0.9832F, 1, 1, 4, -0.2F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.4F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0006F, 0.0434F, -0.0095F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.body4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5045F, 0.2008F, 0.0167F, 1, 1, 4, -0.2F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.25F, 2.5F);
        this.body4.addChild(tail);
        this.setRotateAngle(tail, -0.043F, 0.2164F, -0.0336F);
        this.tail.cubeList.add(new ModelBox(tail, 38, 20, -0.5033F, 0.1071F, 0.0158F, 1, 1, 4, -0.2F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(6.1706F, 1.0071F, -15.1305F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.5585F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 41, 23, -3.3F, -0.5F, 1.5F, 6, 1, 1, -0.2F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0967F, 1.2071F, -0.9842F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.2094F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 23, -2.0F, -0.7F, -0.3F, 4, 1, 1, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0436F, 3.999F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0877F, 0.176F, 0.0266F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 34, -0.5114F, 0.153F, -0.4677F, 1, 1, 7, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0266F, -0.1745F, -0.0046F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5048F, 0.4024F, -0.4697F, 1, 1, 11, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0007F, -0.3925F, 0.0097F);
        this.tail4.cubeList.add(new ModelBox(tail4, -2, 20, -0.4913F, 0.3039F, -0.5616F, 1, 1, 11, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1745F, -0.3054F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 17, 12, -0.4801F, 0.301F, -0.2506F, 1, 1, 10, -0.2F, false));

        this.hindlegL = new ModelRenderer(this);
        this.hindlegL.setRotationPoint(1.7F, 1.0F, 2.5F);
        this.body4.addChild(hindlegL);
        this.setRotateAngle(hindlegL, -0.1604F, -0.453F, 0.4336F);


        this.hindlegL2 = new ModelRenderer(this);
        this.hindlegL2.setRotationPoint(2.25F, 0.25F, 0.0F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.6727F, 0.2517F, -0.2311F);


        this.hindlegL3 = new ModelRenderer(this);
        this.hindlegL3.setRotationPoint(1.9F, 0.0F, 0.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.0464F, -0.2577F, -0.1806F);


        this.hindlegL4 = new ModelRenderer(this);
        this.hindlegL4.setRotationPoint(-1.7F, 1.0F, 2.5F);
        this.body4.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, -0.0873F, 0.3394F, -0.275F);


        this.hindlegL5 = new ModelRenderer(this);
        this.hindlegL5.setRotationPoint(-2.25F, 0.25F, 0.0F);
        this.hindlegL4.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 0.3801F, 0.1811F, 0.1958F);


        this.hindlegL6 = new ModelRenderer(this);
        this.hindlegL6.setRotationPoint(-1.9F, 0.0F, 0.0F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, -0.1828F, 0.2314F, -0.0421F);

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
