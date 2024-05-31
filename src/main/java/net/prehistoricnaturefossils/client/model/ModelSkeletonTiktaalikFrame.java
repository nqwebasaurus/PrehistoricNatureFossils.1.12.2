package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTiktaalikFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer hindlegL;
    private final ModelRenderer hindlegL2;
    private final ModelRenderer hindlegL3;
    private final ModelRenderer hindlegL4;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer analfin;
    private final ModelRenderer body5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body6;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer bone2;
    private final ModelRenderer bone4;
    private final ModelRenderer upperjaw;
    private final ModelRenderer bone;
    private final ModelRenderer bone3;
    private final ModelRenderer forelegL;
    private final ModelRenderer forelegL2;
    private final ModelRenderer forelegL3;
    private final ModelRenderer forelegL4;

    public ModelSkeletonTiktaalikFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, -23.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -5.4F, 8.8F);
        this.fossil.addChild(body);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.6F, -0.3F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0524F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 25, -5.0F, 3.7F, 2.0F, 9, 1, 1, -0.1F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 25, -1.0F, 2.7F, 2.0F, 1, 2, 1, -0.11F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 51, -1.0F, 2.0F, -1.0F, 1, 1, 12, -0.1F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.6F, 10.7F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -0.1309F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.9823F, 10.954F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0131F, 0.0044F, -0.0001F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 27, -0.5F, -0.3953F, -11.4991F, 1, 1, 11, -0.1F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.2F, 9.6F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0443F, -0.1743F, -0.0096F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.1597F, 5.2686F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.0349F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 8, -1.5F, -3.5F, -0.5F, 1, 7, 1, -0.1F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.7F, -0.1F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 8, -0.5F, 2.17F, 5.0F, 1, 3, 1, -0.11F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 0, -0.5F, 2.07F, 0.0F, 1, 1, 9, -0.1F, false));

        this.hindlegL = new ModelRenderer(this);
        this.hindlegL.setRotationPoint(2.9F, 3.85F, 5.75F);
        this.body3.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.2941F, -0.2982F, -0.978F);


        this.hindlegL2 = new ModelRenderer(this);
        this.hindlegL2.setRotationPoint(0.0F, 4.3F, 0.0F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.6981F, 0.0F, -0.1745F);


        this.hindlegL3 = new ModelRenderer(this);
        this.hindlegL3.setRotationPoint(-2.9F, 3.85F, 5.75F);
        this.body3.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.7304F, 0.2982F, 0.978F);


        this.hindlegL4 = new ModelRenderer(this);
        this.hindlegL4.setRotationPoint(0.0F, 4.3F, 0.0F);
        this.hindlegL3.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, 0.48F, 0.0F, 0.1745F);


        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.2F, 8.1F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.043F, -0.0434F, 0.0095F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.body4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, 0.6F, -0.2F, 1, 1, 12, -0.1F, false));

        this.analfin = new ModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 3.3F, 10.05F);
        this.body4.addChild(analfin);
        this.setRotateAngle(analfin, 0.8727F, 0.0F, 0.0F);


        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.4F, 10.9F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.0F, 0.1309F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.1F, -0.1F);
        this.body5.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 3, -0.5F, 0.6F, 0.0F, 1, 1, 11, -0.1F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.5F, 10.6F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0F, 0.1745F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 30, 16, -0.5F, 0.3F, -0.7F, 1, 1, 8, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.15F, -0.45F);
        this.body.addChild(head);
        this.setRotateAngle(head, 0.0F, -0.1745F, 0.0F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.6F, -0.1F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.1838F, 0.0063F, -0.0024F);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(-0.0055F, -0.7306F, -12.9706F);
        this.lowerjaw.addChild(bone2);


        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0055F, -0.7306F, -12.9706F);
        this.lowerjaw.addChild(bone4);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.05F, -0.15F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.1134F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -1.663F, -13.5289F);
        this.upperjaw.addChild(bone);
        this.setRotateAngle(bone, -0.1134F, 0.0F, 0.0F);


        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, -1.663F, -13.5289F);
        this.upperjaw.addChild(bone3);
        this.setRotateAngle(bone3, -0.1134F, 0.0F, 0.0F);


        this.forelegL = new ModelRenderer(this);
        this.forelegL.setRotationPoint(4.25F, 2.3F, 3.2F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 1.0897F, -0.2141F, -1.2045F);


        this.forelegL2 = new ModelRenderer(this);
        this.forelegL2.setRotationPoint(0.0312F, 3.3369F, 0.2771F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, -0.4893F, 0.0464F, -0.0763F);


        this.forelegL3 = new ModelRenderer(this);
        this.forelegL3.setRotationPoint(-4.25F, 2.3F, 3.2F);
        this.body.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.5661F, 0.2141F, 1.2045F);


        this.forelegL4 = new ModelRenderer(this);
        this.forelegL4.setRotationPoint(-0.0312F, 3.3369F, 0.2771F);
        this.forelegL3.addChild(forelegL4);
        this.setRotateAngle(forelegL4, -0.4805F, -0.4263F, 0.1225F);

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
