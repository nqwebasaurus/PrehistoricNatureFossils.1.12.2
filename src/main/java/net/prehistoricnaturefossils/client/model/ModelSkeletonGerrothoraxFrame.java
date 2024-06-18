package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGerrothoraxFrame extends ModelBase {
    private final ModelRenderer body;
    private final ModelRenderer neck;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer gillR;
    private final ModelRenderer gillL;
    private final ModelRenderer gillR2;
    private final ModelRenderer gillL2;
    private final ModelRenderer gillR3;
    private final ModelRenderer gillL3;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer upperjaw;
    private final ModelRenderer bone;
    private final ModelRenderer forelegL;
    private final ModelRenderer forelegL2;
    private final ModelRenderer forelegL3;
    private final ModelRenderer forelegL4;
    private final ModelRenderer forelegL5;
    private final ModelRenderer forelegL6;
    private final ModelRenderer body2;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer body3;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer hindlegL;
    private final ModelRenderer hindlegL2;
    private final ModelRenderer hindlegL3;
    private final ModelRenderer hindlegL4;
    private final ModelRenderer hindlegL5;
    private final ModelRenderer hindlegL6;
    private final ModelRenderer body4;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer body5;
    private final ModelRenderer body6;
    private final ModelRenderer body7;

    public ModelSkeletonGerrothoraxFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 14.75F, 1.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, -0.5236F);
        this.body.cubeList.add(new ModelBox(body, 10, 14, -5.0F, -0.544F, -8.25F, 9, 1, 1, -0.1F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -0.444F, -9.25F, 1, 1, 15, -0.1F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, -0.134F, -9.0F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.2618F, -0.1745F, 0.0F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 0.0F, -3.75F);
        this.neck.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, 0.0785F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 18, 30, -0.5F, 0.0F, 0.25F, 1, 1, 4, -0.1F, false));

        this.gillR = new ModelRenderer(this);
        this.gillR.setRotationPoint(-6.0F, -0.5F, -3.15F);
        this.neck.addChild(gillR);
        this.setRotateAngle(gillR, 0.1745F, 0.0873F, 0.1745F);


        this.gillL = new ModelRenderer(this);
        this.gillL.setRotationPoint(6.0F, -0.5F, -3.15F);
        this.neck.addChild(gillL);
        this.setRotateAngle(gillL, 0.1745F, -0.0873F, -0.1745F);


        this.gillR2 = new ModelRenderer(this);
        this.gillR2.setRotationPoint(-6.0F, -0.25F, -2.4F);
        this.neck.addChild(gillR2);
        this.setRotateAngle(gillR2, 0.1309F, 0.1309F, 0.1309F);


        this.gillL2 = new ModelRenderer(this);
        this.gillL2.setRotationPoint(6.0F, -0.25F, -2.4F);
        this.neck.addChild(gillL2);
        this.setRotateAngle(gillL2, 0.1309F, -0.1309F, -0.1309F);


        this.gillR3 = new ModelRenderer(this);
        this.gillR3.setRotationPoint(-6.0F, 0.0F, -1.65F);
        this.neck.addChild(gillR3);
        this.setRotateAngle(gillR3, 0.0873F, 0.2618F, 0.0873F);


        this.gillL3 = new ModelRenderer(this);
        this.gillL3.setRotationPoint(6.0F, 0.0F, -1.65F);
        this.neck.addChild(gillL3);
        this.setRotateAngle(gillL3, 0.0873F, -0.2618F, -0.0873F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.125F, -3.0F);
        this.neck.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.3491F, 0.0F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.025F, -3.0F);
        this.neck.addChild(upperjaw);
        this.setRotateAngle(upperjaw, -0.3927F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.025F, -5.0F);
        this.upperjaw.addChild(bone);
        this.setRotateAngle(bone, 0.0436F, 0.0F, 0.0F);


        this.forelegL = new ModelRenderer(this);
        this.forelegL.setRotationPoint(4.1F, 0.116F, -7.7F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.3927F, -1.1781F, 0.1745F);


        this.forelegL2 = new ModelRenderer(this);
        this.forelegL2.setRotationPoint(2.4076F, -0.4063F, 0.511F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.3927F, 0.4363F, 0.0F);


        this.forelegL3 = new ModelRenderer(this);
        this.forelegL3.setRotationPoint(2.0F, 0.0F, -1.0F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, -0.1384F, 0.3215F, -0.5897F);


        this.forelegL4 = new ModelRenderer(this);
        this.forelegL4.setRotationPoint(-5.1F, 0.116F, -7.7F);
        this.body.addChild(forelegL4);
        this.setRotateAngle(forelegL4, 0.9163F, -0.3927F, -0.1745F);


        this.forelegL5 = new ModelRenderer(this);
        this.forelegL5.setRotationPoint(-2.4076F, -0.4063F, 0.511F);
        this.forelegL4.addChild(forelegL5);
        this.setRotateAngle(forelegL5, -0.1332F, -0.2261F, 0.5387F);


        this.forelegL6 = new ModelRenderer(this);
        this.forelegL6.setRotationPoint(-2.0F, 0.0F, -1.0F);
        this.forelegL5.addChild(forelegL6);
        this.setRotateAngle(forelegL6, 0.2298F, -0.2651F, -0.5544F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, -0.134F, 5.75F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 0.0F, -12.25F);
        this.body2.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.0611F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 30, 15, -0.51F, -1.025F, 11.15F, 1, 1, 4, -0.1F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.1F, 3.0F);
        this.body2.addChild(body3);


        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(-0.5F, -0.1F, -1.3F);
        this.body3.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, -0.0873F, 0.0F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, 26, 37, -2.5F, -0.22F, 1.75F, 6, 1, 1, -0.1F, false));

        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 0.0F, -0.75F);
        this.body3.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.0873F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 26, 35, -0.5F, -0.22F, -0.25F, 1, 1, 3, -0.1F, false));

        this.hindlegL = new ModelRenderer(this);
        this.hindlegL.setRotationPoint(3.0F, 0.25F, 0.9F);
        this.body3.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.7575F, 0.5041F, 0.3586F);


        this.hindlegL2 = new ModelRenderer(this);
        this.hindlegL2.setRotationPoint(2.5702F, -0.2629F, -0.8983F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0303F, -0.4253F, 0.2399F);


        this.hindlegL3 = new ModelRenderer(this);
        this.hindlegL3.setRotationPoint(2.0F, 0.0F, 1.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.039F, 0.2625F, 0.2291F);


        this.hindlegL4 = new ModelRenderer(this);
        this.hindlegL4.setRotationPoint(-3.0F, 0.25F, 0.9F);
        this.body3.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, -0.1309F, 0.8727F, -0.1745F);


        this.hindlegL5 = new ModelRenderer(this);
        this.hindlegL5.setRotationPoint(-2.5702F, -0.2629F, -0.8983F);
        this.hindlegL4.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 0.0F, 0.4363F, 0.0F);


        this.hindlegL6 = new ModelRenderer(this);
        this.hindlegL6.setRotationPoint(-2.0F, 0.0F, 1.0F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, -0.0436F, -0.2618F, 0.0873F);


        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.1372F, 0.3027F, 0.0411F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.1F, 0.4645F, 0.7484F);
        this.body4.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0437F, -0.0349F, 0.0015F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 34, 8, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.1F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.5F, 1.2F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.0002F, 0.0872F, -0.0038F);
        this.body5.cubeList.add(new ModelBox(body5, 11, 27, -0.5F, 0.52F, -0.2F, 1, 1, 4, -0.1F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0436F, 0.1745F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 0, 27, -0.5F, 0.53F, -0.2F, 1, 1, 4, -0.1F, false));

        this.body7 = new ModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.5F, 3.8F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, 0.0436F, -0.0436F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 0, 17, -0.5F, 0.04F, -0.75F, 1, 1, 3, -0.1F, false));
        this.body7.cubeList.add(new ModelBox(body7, 10, 0, -0.5F, 0.0F, 2.0F, 1, 1, 1, -0.1F, false));

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
