package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonWarneticaris extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer antennaR;
    private final ModelRenderer antennaL;
    private final ModelRenderer antennaR2;
    private final ModelRenderer antennaL2;
    private final ModelRenderer eyeR;
    private final ModelRenderer legR;
    private final ModelRenderer legRs;
    private final ModelRenderer legRs2;
    private final ModelRenderer legL;
    private final ModelRenderer legLs;
    private final ModelRenderer legLs2;
    private final ModelRenderer legR2;
    private final ModelRenderer legR3;
    private final ModelRenderer legR4;
    private final ModelRenderer legR5;
    private final ModelRenderer legR6;
    private final ModelRenderer legR7;
    private final ModelRenderer legR8;
    private final ModelRenderer legR9;
    private final ModelRenderer gillR;
    private final ModelRenderer gillR2;
    private final ModelRenderer gillR3;
    private final ModelRenderer seg;
    private final ModelRenderer gillR4;
    private final ModelRenderer seg2;
    private final ModelRenderer gillR5;
    private final ModelRenderer seg3;
    private final ModelRenderer seg4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;

    public ModelSkeletonWarneticaris() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-1.0F, 24.0F, 5.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -12.0F, -2.0F, -4.0F, 25, 2, 13, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 16, -5.0F, -2.0F, -19.0F, 18, 2, 15, 0.003F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 34, -17.0F, -2.0F, -29.0F, 23, 2, 10, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 64, 0, -6.0F, -2.0F, 9.0F, 6, 2, 8, -0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 17.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.6109F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 47, 0.0F, -2.0F, -8.0F, 15, 2, 8, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-6.0F, 0.0F, 17.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.9163F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 67, 25, -10.0F, -2.0F, -5.0F, 10, 2, 5, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-17.0F, 0.0F, -19.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.3491F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 57, 47, 0.0F, -2.0F, -5.0F, 13, 2, 5, -0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(6.0F, 0.0F, -29.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.9599F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 57, 34, 0.0F, -2.0F, 0.0F, 12, 2, 6, -0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-12.0F, 0.0F, -4.0F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 1.0036F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 16, 0.0F, -2.0F, 0.0F, 13, 2, 6, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.9F, -6.5375F, -4.2073F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 2.9671F, 0.0F, 1.5708F);
        this.body.cubeList.add(new ModelBox(body, 0, 16, 3.9F, -3.3125F, 1.7573F, 0, 4, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 48, 58, 3.9F, -3.3125F, -3.2427F, 0, 3, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 47, 3.2F, -4.0625F, -3.9927F, 0, 12, 17, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.3F, -4.0625F, -3.9927F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6545F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 47, 4.6F, 0.0F, -7.0F, 0, 9, 7, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -3.3125F, -3.2427F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5585F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 3.8F, 0.0F, -6.0F, 0, 3, 6, 0.0F, false));

        this.antennaR = new ModelRenderer(this);
        this.antennaR.setRotationPoint(4.25F, 0.9375F, -7.4927F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, -0.1309F, 0.0F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 48, 73, 0.0F, -4.5F, -12.0F, 0, 5, 12, 0.0F, false));

        this.antennaL = new ModelRenderer(this);
        this.antennaL.setRotationPoint(4.35F, 0.9375F, -7.4927F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, -0.4363F, 0.0F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 35, 61, 0.0F, -4.5F, -12.0F, 0, 5, 12, 0.0F, false));

        this.antennaR2 = new ModelRenderer(this);
        this.antennaR2.setRotationPoint(4.15F, 0.9375F, -7.2427F);
        this.body.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.0873F, 0.0F, 0.0F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 66, 61, 0.0F, -4.5F, -12.0F, 0, 5, 12, 0.0F, false));

        this.antennaL2 = new ModelRenderer(this);
        this.antennaL2.setRotationPoint(4.25F, 0.9375F, -7.2427F);
        this.body.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.3927F, 0.0F, 0.0F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 53, 55, 0.0F, -4.5F, -12.0F, 0, 5, 12, 0.0F, false));

        this.eyeR = new ModelRenderer(this);
        this.eyeR.setRotationPoint(-1.0F, 0.4375F, -7.4927F);
        this.body.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.4363F, 0.0F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 7, 0, 4.85F, -0.5F, -2.25F, 0, 1, 2, 0.0F, false));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 8, 16, 4.75F, -1.0F, -2.75F, 0, 2, 1, 0.0F, false));

        this.legR = new ModelRenderer(this);
        this.legR.setRotationPoint(3.35F, 0.4375F, -4.9927F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.7854F, 0.0F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 3, 0, 0.5F, 0.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.legRs = new ModelRenderer(this);
        this.legRs.setRotationPoint(0.0F, 4.0F, -0.5F);
        this.legR.addChild(legRs);
        this.setRotateAngle(legRs, -1.0036F, 0.0F, 0.0F);
        this.legRs.cubeList.add(new ModelBox(legRs, 79, 64, 0.6F, -0.5F, -1.0F, 0, 6, 2, 0.0F, false));

        this.legRs2 = new ModelRenderer(this);
        this.legRs2.setRotationPoint(0.0F, 5.5F, 0.5F);
        this.legRs.addChild(legRs2);
        this.setRotateAngle(legRs2, 0.48F, 0.0F, 0.0F);
        this.legRs2.cubeList.add(new ModelBox(legRs2, 66, 55, 0.8F, -0.75F, -3.5F, 0, 4, 4, 0.0F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(3.05F, 0.4375F, -4.9927F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 1.4835F, 0.0F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 0, 0.5F, 0.0F, -0.5F, 0, 4, 1, 0.0F, false));

        this.legLs = new ModelRenderer(this);
        this.legLs.setRotationPoint(0.0F, 4.0F, -0.5F);
        this.legL.addChild(legLs);
        this.setRotateAngle(legLs, -2.4435F, 0.0F, 0.0F);
        this.legLs.cubeList.add(new ModelBox(legLs, 59, 58, 0.4F, -0.5F, -1.0F, 0, 6, 2, 0.0F, false));

        this.legLs2 = new ModelRenderer(this);
        this.legLs2.setRotationPoint(0.0F, 5.5F, 0.5F);
        this.legLs.addChild(legLs2);
        this.setRotateAngle(legLs2, 0.1745F, 0.0F, 0.0F);
        this.legLs2.cubeList.add(new ModelBox(legLs2, 0, 34, 0.6F, -0.75F, -3.5F, 0, 4, 4, 0.0F, false));

        this.legR2 = new ModelRenderer(this);
        this.legR2.setRotationPoint(3.75F, -0.5625F, -1.9927F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, -0.2618F, 0.0F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 35, 88, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.legR3 = new ModelRenderer(this);
        this.legR3.setRotationPoint(3.65F, -0.5625F, -1.4927F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, -0.0873F, 0.0F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 28, 88, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.legR4 = new ModelRenderer(this);
        this.legR4.setRotationPoint(3.55F, -0.5625F, -0.9927F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0436F, 0.0F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 87, 79, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.legR5 = new ModelRenderer(this);
        this.legR5.setRotationPoint(3.85F, -0.5625F, -0.4927F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.1309F, 0.0F, 0.0F);
        this.legR5.cubeList.add(new ModelBox(legR5, 21, 86, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.legR6 = new ModelRenderer(this);
        this.legR6.setRotationPoint(3.75F, -0.5625F, 0.0073F);
        this.body.addChild(legR6);
        this.setRotateAngle(legR6, 0.1745F, 0.0F, 0.0F);
        this.legR6.cubeList.add(new ModelBox(legR6, 14, 86, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.legR7 = new ModelRenderer(this);
        this.legR7.setRotationPoint(3.65F, -0.5625F, 0.5073F);
        this.body.addChild(legR7);
        this.setRotateAngle(legR7, 0.2182F, 0.0F, 0.0F);
        this.legR7.cubeList.add(new ModelBox(legR7, 80, 79, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.legR8 = new ModelRenderer(this);
        this.legR8.setRotationPoint(3.45F, -0.5625F, 1.0073F);
        this.body.addChild(legR8);
        this.setRotateAngle(legR8, 0.5236F, 0.0F, 0.0F);
        this.legR8.cubeList.add(new ModelBox(legR8, 73, 79, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.legR9 = new ModelRenderer(this);
        this.legR9.setRotationPoint(3.65F, -0.5625F, 1.5073F);
        this.body.addChild(legR9);
        this.setRotateAngle(legR9, 0.3054F, 0.0F, 0.0F);
        this.legR9.cubeList.add(new ModelBox(legR9, 35, 58, 0.0F, 0.0F, -0.5F, 0, 9, 3, 0.0F, false));

        this.gillR = new ModelRenderer(this);
        this.gillR.setRotationPoint(3.6F, 0.4375F, 3.0073F);
        this.body.addChild(gillR);
        this.setRotateAngle(gillR, 0.4363F, 0.0F, 0.0F);
        this.gillR.cubeList.add(new ModelBox(gillR, 0, 89, 0.0F, 0.0F, -0.5F, 0, 7, 2, 0.0F, false));

        this.gillR2 = new ModelRenderer(this);
        this.gillR2.setRotationPoint(3.8F, 0.4375F, 5.0073F);
        this.body.addChild(gillR2);
        this.setRotateAngle(gillR2, 0.48F, 0.0F, 0.0F);
        this.gillR2.cubeList.add(new ModelBox(gillR2, 42, 88, 0.0F, 0.0F, -0.5F, 0, 7, 2, 0.0F, false));

        this.gillR3 = new ModelRenderer(this);
        this.gillR3.setRotationPoint(3.8F, 0.4375F, 7.0073F);
        this.body.addChild(gillR3);
        this.setRotateAngle(gillR3, 0.5672F, 0.0F, 0.0F);
        this.gillR3.cubeList.add(new ModelBox(gillR3, 42, 58, 0.0F, 0.0F, -0.5F, 0, 7, 2, 0.0F, false));

        this.seg = new ModelRenderer(this);
        this.seg.setRotationPoint(1.8F, -2.5625F, 8.5073F);
        this.body.addChild(seg);
        this.setRotateAngle(seg, 0.0436F, 0.0F, 0.0F);
        this.seg.cubeList.add(new ModelBox(seg, 0, 16, 2.0F, -0.75F, 0.0F, 0, 4, 2, 0.0F, false));

        this.gillR4 = new ModelRenderer(this);
        this.gillR4.setRotationPoint(1.8F, 3.0F, 0.5F);
        this.seg.addChild(gillR4);
        this.setRotateAngle(gillR4, 0.6109F, 0.0F, 0.0F);
        this.gillR4.cubeList.add(new ModelBox(gillR4, 85, 11, 0.0F, -1.0F, -0.5F, 0, 7, 2, 0.0F, false));

        this.seg2 = new ModelRenderer(this);
        this.seg2.setRotationPoint(-0.1F, -0.25F, 2.0F);
        this.seg.addChild(seg2);
        this.setRotateAngle(seg2, 0.2182F, 0.0F, 0.0F);
        this.seg2.cubeList.add(new ModelBox(seg2, 61, 75, 2.0F, -0.5F, -1.0F, 0, 4, 4, 0.0F, false));

        this.gillR5 = new ModelRenderer(this);
        this.gillR5.setRotationPoint(1.8F, 3.25F, 0.5F);
        this.seg2.addChild(gillR5);
        this.setRotateAngle(gillR5, 0.7854F, 0.0F, 0.0F);
        this.gillR5.cubeList.add(new ModelBox(gillR5, 5, 89, 0.0F, -2.0F, -0.5F, 0, 7, 2, 0.0F, false));

        this.seg3 = new ModelRenderer(this);
        this.seg3.setRotationPoint(0.7F, 0.25F, 2.975F);
        this.seg2.addChild(seg3);
        this.setRotateAngle(seg3, 0.5236F, 0.0F, 0.0F);
        this.seg3.cubeList.add(new ModelBox(seg3, 0, 77, 1.5F, -0.5F, -2.0F, 0, 3, 8, 0.0F, false));

        this.seg4 = new ModelRenderer(this);
        this.seg4.setRotationPoint(-0.6F, -0.4F, 5.95F);
        this.seg3.addChild(seg4);
        this.setRotateAngle(seg4, 0.0F, 0.7418F, -1.5708F);
        this.seg4.cubeList.add(new ModelBox(seg4, 52, 25, -1.0F, 2.0F, -1.5F, 2, 0, 5, 0.0F, false));
        this.seg4.cubeList.add(new ModelBox(seg4, 79, 55, -0.5F, 2.0F, 3.5F, 1, 0, 8, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 0.6F, 0.0F);
        this.seg4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.4363F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 77, -1.0F, 1.5F, 0.0F, 1, 0, 8, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.6F, 0.0F);
        this.seg4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.4363F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 79, 0.0F, 1.5F, 0.0F, 1, 0, 8, 0.0F, false));

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
